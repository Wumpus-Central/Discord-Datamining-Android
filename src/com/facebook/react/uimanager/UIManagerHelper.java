package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.EditText;
import androidx.core.view.C2733w0;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherProvider;

/* loaded from: classes7.dex */
public class UIManagerHelper {
    public static final int PADDING_BOTTOM_INDEX = 3;
    public static final int PADDING_END_INDEX = 1;
    public static final int PADDING_START_INDEX = 0;
    public static final int PADDING_TOP_INDEX = 2;
    private static final String TAG = "com.facebook.react.uimanager.UIManagerHelper";

    public static float[] getDefaultTextInputPadding(ThemedReactContext themedReactContext) {
        EditText editText = new EditText(themedReactContext);
        return new float[]{PixelUtil.toDIPFromPixel(C2733w0.m37053G(editText)), PixelUtil.toDIPFromPixel(C2733w0.m37055F(editText)), PixelUtil.toDIPFromPixel(editText.getPaddingTop()), PixelUtil.toDIPFromPixel(editText.getPaddingBottom())};
    }

    public static EventDispatcher getEventDispatcher(ReactContext reactContext, int i) {
        if (reactContext.isBridgeless()) {
            if (reactContext instanceof ThemedReactContext) {
                reactContext = ((ThemedReactContext) reactContext).getReactApplicationContext();
            }
            return ((EventDispatcherProvider) reactContext).getEventDispatcher();
        }
        UIManager uIManager = getUIManager(reactContext, i, false);
        if (uIManager == null) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Unable to find UIManager for UIManagerType " + i));
            return null;
        }
        EventDispatcher eventDispatcher = (EventDispatcher) uIManager.getEventDispatcher();
        if (eventDispatcher == null) {
            String str2 = TAG;
            ReactSoftExceptionLogger.logSoftException(str2, new IllegalStateException("Cannot get EventDispatcher for UIManagerType " + i));
        }
        return eventDispatcher;
    }

    public static EventDispatcher getEventDispatcherForReactTag(ReactContext reactContext, int i) {
        EventDispatcher eventDispatcher = getEventDispatcher(reactContext, ViewUtil.getUIManagerType(i));
        if (eventDispatcher == null) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot get EventDispatcher for reactTag " + i));
        }
        return eventDispatcher;
    }

    public static ReactContext getReactContext(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    public static int getSurfaceId(View view) {
        if (view instanceof ReactRoot) {
            ReactRoot reactRoot = (ReactRoot) view;
            if (reactRoot.getUIManagerType() == 2) {
                return reactRoot.getRootViewTag();
            }
            return -1;
        }
        int id2 = view.getId();
        if (ViewUtil.getUIManagerType(id2) == 1) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof ThemedReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int surfaceId = getSurfaceId(context);
        if (surfaceId == -1) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Fabric View [" + id2 + "] does not have SurfaceId associated with it"));
        }
        return surfaceId;
    }

    public static UIManager getUIManager(ReactContext reactContext, int i) {
        return getUIManager(reactContext, i, true);
    }

    public static UIManager getUIManagerForReactTag(ReactContext reactContext, int i) {
        return getUIManager(reactContext, ViewUtil.getUIManagerType(i));
    }

    private static UIManager getUIManager(ReactContext reactContext, int i, boolean z) {
        if (reactContext.isBridgeless()) {
            UIManager uIManager = (UIManager) reactContext.getJSIModule(JSIModuleType.UIManager);
            if (uIManager != null) {
                return uIManager;
            }
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the instance hasn't been initialized yet."));
            return null;
        } else if (!reactContext.hasCatalystInstance()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
            return null;
        } else {
            if (!reactContext.hasActiveReactInstance()) {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
                if (z) {
                    return null;
                }
            }
            CatalystInstance catalystInstance = reactContext.getCatalystInstance();
            try {
                if (i == 2) {
                    return (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager);
                }
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            } catch (IllegalArgumentException unused) {
                String str = TAG;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Cannot get UIManager for UIManagerType: " + i));
                return (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
            }
        }
    }

    public static int getSurfaceId(Context context) {
        if (context instanceof ThemedReactContext) {
            return ((ThemedReactContext) context).getSurfaceId();
        }
        return -1;
    }
}
