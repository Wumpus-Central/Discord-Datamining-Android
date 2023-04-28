package com.facebook.react.fabric.mounting;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.mounting.SurfaceMountingManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerRegistry;
import com.facebook.yoga.YogaMeasureMode;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import p163j$.util.concurrent.ConcurrentHashMap;
import p414x3.C13925a;

/* loaded from: classes7.dex */
public class MountingManager {
    private static final int MAX_STOPPED_SURFACE_IDS_LENGTH = 15;
    public static final String TAG = "MountingManager";
    private SurfaceMountingManager mLastQueriedSurfaceMountingManager;
    private SurfaceMountingManager mMostRecentSurfaceMountingManager;
    private final MountItemExecutor mMountItemExecutor;
    private final ViewManagerRegistry mViewManagerRegistry;
    private final ConcurrentHashMap<Integer, SurfaceMountingManager> mSurfaceIdToManager = new ConcurrentHashMap<>();
    private final CopyOnWriteArrayList<Integer> mStoppedSurfaceIds = new CopyOnWriteArrayList<>();
    private final JSResponderHandler mJSResponderHandler = new JSResponderHandler();
    private final RootViewManager mRootViewManager = new RootViewManager();

    /* loaded from: classes7.dex */
    public interface MountItemExecutor {
        void executeItems(Queue<MountItem> queue);
    }

    public MountingManager(ViewManagerRegistry viewManagerRegistry, MountItemExecutor mountItemExecutor) {
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mMountItemExecutor = mountItemExecutor;
    }

    public void attachRootView(int i, View view, ThemedReactContext themedReactContext) {
        SurfaceMountingManager surfaceManagerEnforced = getSurfaceManagerEnforced(i, "attachView");
        if (surfaceManagerEnforced.isStopped()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            surfaceManagerEnforced.attachRootView(view, themedReactContext);
        }
    }

    public void clearJSResponder() {
        this.mJSResponderHandler.clearJSResponder();
    }

    public void enqueuePendingEvent(int i, SurfaceMountingManager.ViewEvent viewEvent) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(i);
        if (surfaceManagerForView != null) {
            surfaceManagerForView.enqueuePendingEvent(i, viewEvent);
        }
    }

    public EventEmitterWrapper getEventEmitter(int i, int i2) {
        SurfaceMountingManager surfaceMountingManager;
        if (i == -1) {
            surfaceMountingManager = getSurfaceManagerForView(i2);
        } else {
            surfaceMountingManager = getSurfaceManager(i);
        }
        if (surfaceMountingManager == null) {
            return null;
        }
        return surfaceMountingManager.getEventEmitter(i2);
    }

    public SurfaceMountingManager getSurfaceManager(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mLastQueriedSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getSurfaceId() == i) {
            return this.mLastQueriedSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager2 = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager2 != null && surfaceMountingManager2.getSurfaceId() == i) {
            return this.mMostRecentSurfaceMountingManager;
        }
        SurfaceMountingManager surfaceMountingManager3 = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        this.mLastQueriedSurfaceMountingManager = surfaceMountingManager3;
        return surfaceMountingManager3;
    }

    public SurfaceMountingManager getSurfaceManagerEnforced(int i, String str) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager != null) {
            return surfaceManager;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i + "]. Context: " + str);
    }

    public SurfaceMountingManager getSurfaceManagerForView(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mMostRecentSurfaceMountingManager;
        if (surfaceMountingManager != null && surfaceMountingManager.getViewExists(i)) {
            return this.mMostRecentSurfaceMountingManager;
        }
        for (Map.Entry<Integer, SurfaceMountingManager> entry : this.mSurfaceIdToManager.entrySet()) {
            SurfaceMountingManager value = entry.getValue();
            if (value != this.mMostRecentSurfaceMountingManager && value.getViewExists(i)) {
                if (this.mMostRecentSurfaceMountingManager == null) {
                    this.mMostRecentSurfaceMountingManager = value;
                }
                return value;
            }
        }
        return null;
    }

    public SurfaceMountingManager getSurfaceManagerForViewEnforced(int i) {
        SurfaceMountingManager surfaceManagerForView = getSurfaceManagerForView(i);
        if (surfaceManagerForView != null) {
            return surfaceManagerForView;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i + "]");
    }

    public boolean getViewExists(int i) {
        return getSurfaceManagerForView(i) != null;
    }

    public void initializeViewManager(String str) {
        this.mViewManagerRegistry.get(str);
    }

    public boolean isWaitingForViewAttach(int i) {
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager != null && !surfaceManager.isStopped()) {
            return !surfaceManager.isRootViewAttached();
        }
        return false;
    }

    public long measure(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return this.mViewManagerRegistry.get(str).measure(reactContext, readableMap, readableMap2, readableMap3, f, yogaMeasureMode, f2, yogaMeasureMode2, fArr);
    }

    public long measureMapBuffer(ReactContext reactContext, String str, MapBuffer mapBuffer, MapBuffer mapBuffer2, MapBuffer mapBuffer3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2, float[] fArr) {
        return this.mViewManagerRegistry.get(str).measure(reactContext, mapBuffer, mapBuffer2, mapBuffer3, f, yogaMeasureMode, f2, yogaMeasureMode2, fArr);
    }

    @Deprecated
    public void receiveCommand(int i, int i2, int i3, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i, "receiveCommand:int").receiveCommand(i2, i3, readableArray);
    }

    public void sendAccessibilityEvent(int i, int i2, int i3) {
        UiThreadUtil.assertOnUiThread();
        if (i == -1) {
            getSurfaceManagerForViewEnforced(i2).sendAccessibilityEvent(i2, i3);
        } else {
            getSurfaceManagerEnforced(i, "sendAccessibilityEvent").sendAccessibilityEvent(i2, i3);
        }
    }

    public SurfaceMountingManager startSurface(int i, ThemedReactContext themedReactContext, View view) {
        SurfaceMountingManager surfaceMountingManager = new SurfaceMountingManager(i, this.mJSResponderHandler, this.mViewManagerRegistry, this.mRootViewManager, this.mMountItemExecutor, themedReactContext);
        this.mSurfaceIdToManager.putIfAbsent(Integer.valueOf(i), surfaceMountingManager);
        if (this.mSurfaceIdToManager.get(Integer.valueOf(i)) != surfaceMountingManager) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i + "]"));
        }
        this.mMostRecentSurfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        if (view != null) {
            surfaceMountingManager.attachRootView(view, themedReactContext);
        }
        return surfaceMountingManager;
    }

    public void stopSurface(int i) {
        SurfaceMountingManager surfaceMountingManager = this.mSurfaceIdToManager.get(Integer.valueOf(i));
        if (surfaceMountingManager != null) {
            while (this.mStoppedSurfaceIds.size() >= 15) {
                Integer num = this.mStoppedSurfaceIds.get(0);
                this.mSurfaceIdToManager.remove(Integer.valueOf(num.intValue()));
                this.mStoppedSurfaceIds.remove(num);
                C13925a.m2295c(TAG, "Removing stale SurfaceMountingManager: [%d]", Integer.valueOf(num.intValue()));
            }
            this.mStoppedSurfaceIds.add(Integer.valueOf(i));
            surfaceMountingManager.stopSurface();
            if (surfaceMountingManager == this.mMostRecentSurfaceMountingManager) {
                this.mMostRecentSurfaceMountingManager = null;
                return;
            }
            return;
        }
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i + "]"));
    }

    public boolean surfaceIsStopped(int i) {
        if (this.mStoppedSurfaceIds.contains(Integer.valueOf(i))) {
            return true;
        }
        SurfaceMountingManager surfaceManager = getSurfaceManager(i);
        if (surfaceManager == null || !surfaceManager.isStopped()) {
            return false;
        }
        return true;
    }

    public void updateProps(int i, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap != null) {
            getSurfaceManagerForViewEnforced(i).updateProps(i, readableMap);
        }
    }

    public void receiveCommand(int i, int i2, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        getSurfaceManagerEnforced(i, "receiveCommand:string").receiveCommand(i2, str, readableArray);
    }
}
