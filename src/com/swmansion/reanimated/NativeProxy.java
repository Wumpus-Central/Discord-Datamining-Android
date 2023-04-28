package com.swmansion.reanimated;

import android.os.SystemClock;
import android.util.Log;
import cf.AbstractC3998a;
import com.facebook.jni.HybridData;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.keyboardObserver.ReanimatedKeyboardEventListener;
import com.swmansion.reanimated.layoutReanimation.AnimationsManager;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p078e6.AbstractC6709a;

/* loaded from: classes8.dex */
public class NativeProxy {
    private final AbstractC3998a gestureHandlerStateManager;
    private final WeakReference<ReactApplicationContext> mContext;
    @AbstractC6709a
    private final HybridData mHybridData;
    private NodesManager mNodesManager;
    private Scheduler mScheduler;
    private ReanimatedKeyboardEventListener reanimatedKeyboardEventListener;
    private ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;

    @AbstractC6709a
    /* loaded from: classes8.dex */
    public static class AnimationFrameCallback implements NodesManager.OnAnimationFrame {
        @AbstractC6709a
        private final HybridData mHybridData;

        @AbstractC6709a
        private AnimationFrameCallback(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // com.swmansion.reanimated.NodesManager.OnAnimationFrame
        public native void onAnimationFrame(double d);
    }

    @AbstractC6709a
    /* loaded from: classes8.dex */
    public static class EventHandler implements RCTEventEmitter {
        private UIManagerModule.CustomEventNamesResolver mCustomEventNamesResolver;
        @AbstractC6709a
        private final HybridData mHybridData;

        @AbstractC6709a
        private EventHandler(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveEvent(int i, String str, WritableMap writableMap) {
            String resolveCustomEventName = this.mCustomEventNamesResolver.resolveCustomEventName(str);
            receiveEvent(i + resolveCustomEventName, writableMap);
        }

        public native void receiveEvent(String str, WritableMap writableMap);

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        }
    }

    @AbstractC6709a
    /* loaded from: classes8.dex */
    public static class KeyboardEventDataUpdater {
        @AbstractC6709a
        private final HybridData mHybridData;

        @AbstractC6709a
        private KeyboardEventDataUpdater(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void keyboardEventDataUpdater(int i, int i2);
    }

    @AbstractC6709a
    /* loaded from: classes8.dex */
    public static class SensorSetter {
        @AbstractC6709a
        private final HybridData mHybridData;

        @AbstractC6709a
        private SensorSetter(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void sensorSetter(float[] fArr);
    }

    static {
        System.loadLibrary("reanimated");
    }

    public NativeProxy(ReactApplicationContext reactApplicationContext) {
        AbstractC3998a aVar = null;
        this.mScheduler = null;
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        this.mScheduler = new Scheduler(reactApplicationContext);
        this.mHybridData = initHybrid(reactApplicationContext.getJavaScriptContextHolder().get(), callInvokerHolderImpl, this.mScheduler, layoutAnimations);
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        prepare(layoutAnimations);
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.reanimatedKeyboardEventListener = new ReanimatedKeyboardEventListener(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.C6235a aVar2 = RNGestureHandlerModule.Companion;
            aVar = (AbstractC3998a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
        }
        this.gestureHandlerStateManager = aVar;
    }

    private void addDevMenuOption() {
        if (this.mContext.get().getApplicationContext() instanceof ReactApplication) {
            ((ReactApplication) this.mContext.get().getApplicationContext()).getReactNativeHost().getReactInstanceManager().getDevSupportManager().addCustomDevOption("Toggle slow animations (Reanimated)", new DevOptionHandler() { // from class: com.swmansion.reanimated.a
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    NativeProxy.this.toggleSlowAnimations();
                }
            });
        }
    }

    @AbstractC6709a
    private void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            hashSet.add((String) arrayList.get(i));
        }
        return hashSet;
    }

    @AbstractC6709a
    private long getCurrentTime() {
        if (this.slowAnimationsEnabled) {
            return this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10);
        }
        return SystemClock.uptimeMillis();
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, Scheduler scheduler, LayoutAnimations layoutAnimations);

    private native void installJSIBindings();

    @AbstractC6709a
    private float[] measure(int i) {
        return this.mNodesManager.measure(i);
    }

    @AbstractC6709a
    private String obtainProp(int i, String str) {
        return this.mNodesManager.obtainProp(i, str);
    }

    @AbstractC6709a
    private void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @AbstractC6709a
    private int registerSensor(int i, int i2, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i), i2, sensorSetter);
    }

    @AbstractC6709a
    private void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @AbstractC6709a
    private void scrollTo(int i, double d, double d2, boolean z) {
        this.mNodesManager.scrollTo(i, d, d2, z);
    }

    @AbstractC6709a
    private void setGestureState(int i, int i2) {
        AbstractC3998a aVar = this.gestureHandlerStateManager;
        if (aVar != null) {
            aVar.setGestureHandlerState(i, i2);
        }
    }

    @AbstractC6709a
    private int subscribeForKeyboardEvents(KeyboardEventDataUpdater keyboardEventDataUpdater) {
        return this.reanimatedKeyboardEventListener.subscribeForKeyboardEvents(keyboardEventDataUpdater);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z = !this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = z;
        if (z) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    @AbstractC6709a
    private void unregisterSensor(int i) {
        this.reanimatedSensorContainer.unregisterSensor(i);
    }

    @AbstractC6709a
    private void unsubscribeFromKeyboardEvents(int i) {
        this.reanimatedKeyboardEventListener.unsubscribeFromKeyboardEvents(i);
    }

    @AbstractC6709a
    private void updateProps(int i, Map<String, Object> map) {
        this.mNodesManager.updateProps(i, map);
    }

    public Scheduler getScheduler() {
        return this.mScheduler;
    }

    public native boolean isAnyHandlerWaitingForEvent(String str);

    public void onCatalystInstanceDestroy() {
        this.mScheduler.deactivate();
        this.mHybridData.resetNative();
    }

    public void prepare(final LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        this.mNodesManager = ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager();
        installJSIBindings();
        AnimationsManager animationsManager = ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager();
        final WeakReference weakReference = new WeakReference(layoutAnimations);
        animationsManager.setNativeMethods(new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                return layoutAnimations.isLayoutAnimationEnabled();
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void removeConfigForTag(int i) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.removeConfigForTag(i);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimationForTag(int i, String str, HashMap<String, Float> hashMap) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    HashMap hashMap2 = new HashMap();
                    for (String str2 : hashMap.keySet()) {
                        hashMap2.put(str2, hashMap.get(str2).toString());
                    }
                    layoutAnimations2.startAnimationForTag(i, str, hashMap2);
                }
            }
        });
    }
}
