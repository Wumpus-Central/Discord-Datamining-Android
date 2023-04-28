package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import cf.AbstractC3998a;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.C6251d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;
import p067df.C6459b;
import p067df.C6460c;
import p085ef.AbstractC6853n;
import p085ef.C6829b;
import p085ef.C6832d;
import p085ef.C6844k;
import p085ef.C6846l;
import p085ef.C6847m;
import p085ef.C6855p;
import p085ef.C6857q;
import p085ef.C6862t;
import p085ef.C6869w;
import p267of.C11289v;

@ReactModule(name = RNGestureHandlerModule.MODULE_NAME)
@Metadata(m15074d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001:\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\nSTUVWXYZ[\\B\u0011\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bP\u0010QJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082 J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J'\u0010\u0010\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J'\u0010\u0019\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J'\u0010\u001d\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u001eH\u0016J0\u0010(\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0007J \u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0007J(\u0010+\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007H\u0007J\u0018\u0010/\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0007J\b\u00100\u001a\u00020\u0005H\u0007J\u0018\u00101\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020-H\u0007J\u0014\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020403H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u000e\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u000e\u00109\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006]"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcf/a;", "", "jsiPtr", "", "decorateRuntime", "", "viewTag", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "findRootHelperForViewAncestor", "Lef/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "findFactoryForHandler", "onHandlerUpdate", "(Lef/d;)V", "newState", "oldState", "onStateChange", "(Lef/d;II)V", "onTouchEvent", "Lcom/facebook/react/uimanager/events/Event;", "event", "sendEventForReanimated", "(Lcom/facebook/react/uimanager/events/Event;)V", "Lcom/swmansion/gesturehandler/react/d;", "sendEventForNativeAnimatedEvent", "sendEventForDirectEvent", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "sendEventForDeviceEvent", "getName", "handlerName", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createGestureHandler", "actionType", "attachGestureHandler", "updateGestureHandler", "dropGestureHandler", "", "blockNativeResponder", "handleSetJSResponder", "handleClearJSResponder", "setGestureHandlerState", "install", "", "", "getConstants", "onCatalystInstanceDestroy", "root", "registerRootHelper", "unregisterRootHelper", "com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "eventListener", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$k;", "", "handlerFactories", "[Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lcom/swmansion/gesturehandler/react/h;", "registry", "Lcom/swmansion/gesturehandler/react/h;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/h;", "Lcom/swmansion/gesturehandler/react/f;", "interactionManager", "Lcom/swmansion/gesturehandler/react/f;", "", "roots", "Ljava/util/List;", "Ldf/c;", "reanimatedEventDispatcher", "Ldf/c;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class RNGestureHandlerModule extends ReactContextBaseJavaModule implements AbstractC3998a {
    public static final C6235a Companion = new C6235a(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private final C6245k eventListener = new C6245k();
    private final AbstractC6237c<?>[] handlerFactories = {new C6240f(), new C6244j(), new C6238d(), new C6241g(), new C6242h(), new C6243i(), new C6236b(), new C6239e()};
    private final C6257h registry = new C6257h();
    private final C6254f interactionManager = new C6254f();
    private final List<RNGestureHandlerRootHelper> roots = new ArrayList();
    private final C6460c reanimatedEventDispatcher = new C6460c();

    @Metadata(m15074d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\n¨\u00067"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$a;", "", "Lef/d;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "b", "", "KEY_DIRECTION", "Ljava/lang/String;", "KEY_ENABLED", "KEY_HIT_SLOP", "KEY_HIT_SLOP_BOTTOM", "KEY_HIT_SLOP_HEIGHT", "KEY_HIT_SLOP_HORIZONTAL", "KEY_HIT_SLOP_LEFT", "KEY_HIT_SLOP_RIGHT", "KEY_HIT_SLOP_TOP", "KEY_HIT_SLOP_VERTICAL", "KEY_HIT_SLOP_WIDTH", "KEY_LONG_PRESS_MAX_DIST", "KEY_LONG_PRESS_MIN_DURATION_MS", "KEY_MANUAL_ACTIVATION", "KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION", "KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START", "KEY_NEEDS_POINTER_DATA", "KEY_NUMBER_OF_POINTERS", "KEY_PAN_ACTIVATE_AFTER_LONG_PRESS", "KEY_PAN_ACTIVE_OFFSET_X_END", "KEY_PAN_ACTIVE_OFFSET_X_START", "KEY_PAN_ACTIVE_OFFSET_Y_END", "KEY_PAN_ACTIVE_OFFSET_Y_START", "KEY_PAN_AVG_TOUCHES", "KEY_PAN_FAIL_OFFSET_RANGE_X_END", "KEY_PAN_FAIL_OFFSET_RANGE_X_START", "KEY_PAN_FAIL_OFFSET_RANGE_Y_END", "KEY_PAN_FAIL_OFFSET_RANGE_Y_START", "KEY_PAN_MAX_POINTERS", "KEY_PAN_MIN_DIST", "KEY_PAN_MIN_POINTERS", "KEY_PAN_MIN_VELOCITY", "KEY_PAN_MIN_VELOCITY_X", "KEY_PAN_MIN_VELOCITY_Y", "KEY_SHOULD_CANCEL_WHEN_OUTSIDE", "KEY_TAP_MAX_DELAY_MS", "KEY_TAP_MAX_DELTA_X", "KEY_TAP_MAX_DELTA_Y", "KEY_TAP_MAX_DIST", "KEY_TAP_MAX_DURATION_MS", "KEY_TAP_MIN_POINTERS", "KEY_TAP_NUMBER_OF_TAPS", "MODULE_NAME", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    /* loaded from: classes8.dex */
    public static final class C6235a {
        private C6235a() {
        }

        public /* synthetic */ C6235a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m26053b(C6832d<?> dVar, ReadableMap readableMap) {
            float f;
            float f2;
            float f3;
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                dVar.m24183t0(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            C9971q.m14636d(map);
            float f4 = Float.NaN;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) {
                f = PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL));
            } else {
                f = Float.NaN;
            }
            float f5 = f;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) {
                f2 = PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL));
            } else {
                f2 = Float.NaN;
            }
            float f6 = f2;
            if (map.hasKey("left")) {
                f = PixelUtil.toPixelFromDIP(map.getDouble("left"));
            }
            if (map.hasKey("top")) {
                f2 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
            }
            if (map.hasKey("right")) {
                f5 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
            }
            if (map.hasKey("bottom")) {
                f6 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
            }
            if (map.hasKey("width")) {
                f3 = PixelUtil.toPixelFromDIP(map.getDouble("width"));
            } else {
                f3 = Float.NaN;
            }
            if (map.hasKey("height")) {
                f4 = PixelUtil.toPixelFromDIP(map.getDouble("height"));
            }
            dVar.m24183t0(f, f2, f5, f6, f3, f4);
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/b;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    /* loaded from: classes8.dex */
    private static final class C6236b extends AbstractC6237c<C6829b> {

        /* renamed from: a */
        private final Class<C6829b> f12674a = C6829b.class;

        /* renamed from: b */
        private final String f12675b = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12675b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6829b> mo26032e() {
            return this.f12674a;
        }

        /* renamed from: f */
        public void mo26035b(C6829b handler, ReadableMap config) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            super.mo26035b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.m24251O0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.m24252N0(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        /* renamed from: g */
        public C6829b mo26034c(Context context) {
            return new C6829b();
        }

        /* renamed from: h */
        public void mo26007a(C6829b handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m24232J()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m24230K()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m24236H()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m24234I()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\"\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0006\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/d;", "T", "Lcom/swmansion/gesturehandler/react/e;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Lef/d;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "b", "(Lef/d;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "a", "(Lef/d;Lcom/facebook/react/bridge/WritableMap;)V", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC6237c<T extends C6832d<T>> implements AbstractC6253e<T> {
        @Override // com.swmansion.gesturehandler.react.AbstractC6253e
        /* renamed from: a */
        public void mo26007a(T handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            eventData.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, handler.m24228M());
        }

        /* renamed from: b */
        public void mo26035b(T handler, ReadableMap config) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            handler.mo23995k0();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.m24175y0(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey("enabled")) {
                handler.m24187r0(config.getBoolean("enabled"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.m26053b(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.m24179w0(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.m24181v0(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
        }

        /* renamed from: c */
        public abstract T mo26034c(Context context);

        /* renamed from: d */
        public abstract String mo26033d();

        /* renamed from: e */
        public abstract Class<T> mo26032e();
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$d;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/k;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    /* loaded from: classes8.dex */
    private static final class C6238d extends AbstractC6237c<C6844k> {

        /* renamed from: a */
        private final Class<C6844k> f12676a = C6844k.class;

        /* renamed from: b */
        private final String f12677b = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12677b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6844k> mo26032e() {
            return this.f12676a;
        }

        /* renamed from: f */
        public void mo26035b(C6844k handler, ReadableMap config) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            super.mo26035b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.m24106O0(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.m24107N0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
        }

        /* renamed from: g */
        public C6844k mo26034c(Context context) {
            C9971q.m14636d(context);
            return new C6844k(context);
        }

        /* renamed from: h */
        public void mo26007a(C6844k handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m24232J()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m24230K()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m24236H()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m24234I()));
            eventData.putInt("duration", handler.m24109L0());
        }
    }

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/l;", "Landroid/content/Context;", "context", "f", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    /* loaded from: classes8.dex */
    private static final class C6239e extends AbstractC6237c<C6846l> {

        /* renamed from: a */
        private final Class<C6846l> f12678a = C6846l.class;

        /* renamed from: b */
        private final String f12679b = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12679b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6846l> mo26032e() {
            return this.f12678a;
        }

        /* renamed from: f */
        public C6846l mo26034c(Context context) {
            return new C6846l();
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$f;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/m;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    /* loaded from: classes8.dex */
    private static final class C6240f extends AbstractC6237c<C6847m> {

        /* renamed from: a */
        private final Class<C6847m> f12680a = C6847m.class;

        /* renamed from: b */
        private final String f12681b = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12681b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6847m> mo26032e() {
            return this.f12680a;
        }

        /* renamed from: f */
        public void mo26035b(C6847m handler, ReadableMap config) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            super.mo26035b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.m24098M0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.m24099L0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        /* renamed from: g */
        public C6847m mo26034c(Context context) {
            return new C6847m();
        }

        /* renamed from: h */
        public void mo26007a(C6847m handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putBoolean("pointerInside", handler.m24215Z());
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$g;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/p;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    /* loaded from: classes8.dex */
    private static final class C6241g extends AbstractC6237c<C6855p> {

        /* renamed from: a */
        private final Class<C6855p> f12682a = C6855p.class;

        /* renamed from: b */
        private final String f12683b = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12683b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6855p> mo26032e() {
            return this.f12682a;
        }

        /* renamed from: f */
        public void mo26035b(C6855p handler, ReadableMap config) {
            boolean z;
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            super.mo26035b(handler, config);
            boolean z2 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.m24071S0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z = true;
            } else {
                z = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.m24072R0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.m24066X0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.m24067W0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.m24069U0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.m24070T0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.m24064Z0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.m24065Y0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.m24060d1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.m24059e1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.m24058f1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z2 = z;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.m24062b1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z2) {
                handler.m24062b1(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.m24061c1(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.m24063a1(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.m24068V0(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                handler.m24073Q0(config.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        /* renamed from: g */
        public C6855p mo26034c(Context context) {
            return new C6855p(context);
        }

        /* renamed from: h */
        public void mo26007a(C6855p handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m24232J()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m24230K()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m24236H()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m24234I()));
            eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(handler.m24077M0()));
            eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(handler.m24076N0()));
            eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(handler.m24075O0()));
            eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(handler.m24074P0()));
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$h;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/q;", "Landroid/content/Context;", "context", "f", "handler", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", "g", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    /* loaded from: classes8.dex */
    private static final class C6242h extends AbstractC6237c<C6857q> {

        /* renamed from: a */
        private final Class<C6857q> f12684a = C6857q.class;

        /* renamed from: b */
        private final String f12685b = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12685b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6857q> mo26032e() {
            return this.f12684a;
        }

        /* renamed from: f */
        public C6857q mo26034c(Context context) {
            return new C6857q();
        }

        /* renamed from: g */
        public void mo26007a(C6857q handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble("scale", handler.m24046R0());
            eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(handler.m24048P0()));
            eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(handler.m24047Q0()));
            eventData.putDouble("velocity", handler.m24045S0());
        }
    }

    @Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$i;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/t;", "Landroid/content/Context;", "context", "f", "handler", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", "g", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$i */
    /* loaded from: classes8.dex */
    private static final class C6243i extends AbstractC6237c<C6862t> {

        /* renamed from: a */
        private final Class<C6862t> f12686a = C6862t.class;

        /* renamed from: b */
        private final String f12687b = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12687b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6862t> mo26032e() {
            return this.f12686a;
        }

        /* renamed from: f */
        public C6862t mo26034c(Context context) {
            return new C6862t();
        }

        /* renamed from: g */
        public void mo26007a(C6862t handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble(ViewProps.ROTATION, handler.m24032O0());
            eventData.putDouble("anchorX", PixelUtil.toDIPFromPixel(handler.m24034M0()));
            eventData.putDouble("anchorY", PixelUtil.toDIPFromPixel(handler.m24033N0()));
            eventData.putDouble("velocity", handler.m24031P0());
        }
    }

    @Metadata(m15074d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m15073d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$j;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lef/w;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "<init>", "()V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$j */
    /* loaded from: classes8.dex */
    private static final class C6244j extends AbstractC6237c<C6869w> {

        /* renamed from: a */
        private final Class<C6869w> f12688a = C6869w.class;

        /* renamed from: b */
        private final String f12689b = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: d */
        public String mo26033d() {
            return this.f12689b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC6237c
        /* renamed from: e */
        public Class<C6869w> mo26032e() {
            return this.f12688a;
        }

        /* renamed from: f */
        public void mo26035b(C6869w handler, ReadableMap config) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(config, "config");
            super.mo26035b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.m24002T0(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.m24006P0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.m24008N0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.m24005Q0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.m24004R0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.m24007O0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.m24003S0(config.getInt("minPointers"));
            }
        }

        /* renamed from: g */
        public C6869w mo26034c(Context context) {
            return new C6869w();
        }

        /* renamed from: h */
        public void mo26007a(C6869w handler, WritableMap eventData) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(eventData, "eventData");
            super.mo26007a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m24232J()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m24230K()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m24236H()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m24234I()));
        }
    }

    @Metadata(m15074d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m15073d2 = {"com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "Lef/n;", "Lef/d;", "T", "handler", "Landroid/view/MotionEvent;", "event", "", "b", "(Lef/d;Landroid/view/MotionEvent;)V", "", "newState", "oldState", "c", "(Lef/d;II)V", "a", "(Lef/d;)V", "react-native-gesture-handler_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$k */
    /* loaded from: classes8.dex */
    public static final class C6245k implements AbstractC6853n {
        C6245k() {
        }

        @Override // p085ef.AbstractC6853n
        /* renamed from: a */
        public <T extends C6832d<T>> void mo24082a(T handler) {
            C9971q.m14633g(handler, "handler");
            RNGestureHandlerModule.this.onTouchEvent(handler);
        }

        @Override // p085ef.AbstractC6853n
        /* renamed from: b */
        public <T extends C6832d<T>> void mo24081b(T handler, MotionEvent event) {
            C9971q.m14633g(handler, "handler");
            C9971q.m14633g(event, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(handler);
        }

        @Override // p085ef.AbstractC6853n
        /* renamed from: c */
        public <T extends C6832d<T>> void mo24080c(T handler, int i, int i2) {
            C9971q.m14633g(handler, "handler");
            RNGestureHandlerModule.this.onStateChange(handler, i, i2);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final native void decorateRuntime(long j);

    private final <T extends C6832d<T>> AbstractC6237c<T> findFactoryForHandler(C6832d<T> dVar) {
        for (AbstractC6237c<?> cVar : this.handlerFactories) {
            AbstractC6237c<T> cVar2 = (AbstractC6237c<T>) cVar;
            if (C9971q.m14638b(cVar2.mo26032e(), dVar.getClass())) {
                return cVar2;
            }
        }
        return null;
    }

    private final RNGestureHandlerRootHelper findRootHelperForViewAncestor(int i) {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper;
        boolean z;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        int resolveRootTagFromReactTag = C6248a.m26014b(reactApplicationContext).resolveRootTagFromReactTag(i);
        Object obj = null;
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it = this.roots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                RNGestureHandlerRootHelper rNGestureHandlerRootHelper2 = (RNGestureHandlerRootHelper) next;
                if (!(rNGestureHandlerRootHelper2.m26025d() instanceof ReactRootView) || ((ReactRootView) rNGestureHandlerRootHelper2.m26025d()).getRootViewTag() != resolveRootTagFromReactTag) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            rNGestureHandlerRootHelper = (RNGestureHandlerRootHelper) obj;
        }
        return rNGestureHandlerRootHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C6832d<T>> void onHandlerUpdate(T t) {
        if (t.m24225P() >= 0 && t.m24226O() == 4) {
            AbstractC6237c<T> findFactoryForHandler = findFactoryForHandler(t);
            if (t.m24242E() == 1) {
                sendEventForReanimated(C6251d.C6252a.m26008c(C6251d.f12698d, t, findFactoryForHandler, false, 4, null));
            } else if (t.m24242E() == 2) {
                sendEventForNativeAnimatedEvent(C6251d.f12698d.m26009b(t, findFactoryForHandler, false));
            } else if (t.m24242E() == 3) {
                sendEventForDirectEvent(C6251d.C6252a.m26008c(C6251d.f12698d, t, findFactoryForHandler, false, 4, null));
            } else if (t.m24242E() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C6251d.f12698d.m26010a(t, findFactoryForHandler));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C6832d<T>> void onStateChange(T t, int i, int i2) {
        if (t.m24225P() >= 0) {
            AbstractC6237c<T> findFactoryForHandler = findFactoryForHandler(t);
            if (t.m24242E() == 1) {
                sendEventForReanimated(C6259j.f12711b.m25988b(t, i, i2, findFactoryForHandler));
            } else if (t.m24242E() == 2 || t.m24242E() == 3) {
                sendEventForDirectEvent(C6259j.f12711b.m25988b(t, i, i2, findFactoryForHandler));
            } else if (t.m24242E() == 4) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", C6259j.f12711b.m25989a(t, findFactoryForHandler, i, i2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C6832d<T>> void onTouchEvent(T t) {
        if (t.m24225P() >= 0) {
            if (t.m24226O() != 2 && t.m24226O() != 4 && t.m24226O() != 0 && t.m24222S() == null) {
                return;
            }
            if (t.m24242E() == 1) {
                sendEventForReanimated(C6261k.f12714c.m25983b(t));
            } else if (t.m24242E() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C6261k.f12714c.m25984a(t));
            }
        }
    }

    private final void sendEventForDeviceEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        C6248a.m26015a(reactApplicationContext).emit(str, writableMap);
    }

    private final <T extends Event<T>> void sendEventForDirectEvent(T t) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        C6459b.m25538a(reactApplicationContext, t);
    }

    private final void sendEventForNativeAnimatedEvent(C6251d dVar) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9971q.m14634f(reactApplicationContext, "reactApplicationContext");
        C6459b.m25538a(reactApplicationContext, dVar);
    }

    private final <T extends Event<T>> void sendEventForReanimated(T t) {
        sendEventForDirectEvent(t);
    }

    @ReactMethod
    public final void attachGestureHandler(int i, int i2, int i3) {
        if (!this.registry.m26001c(i, i2, i3)) {
            throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
        }
    }

    @ReactMethod
    public final <T extends C6832d<T>> void createGestureHandler(String handlerName, int i, ReadableMap config) {
        AbstractC6237c<?>[] cVarArr;
        C9971q.m14633g(handlerName, "handlerName");
        C9971q.m14633g(config, "config");
        for (AbstractC6237c<?> cVar : this.handlerFactories) {
            if (C9971q.m14638b(cVar.mo26033d(), handlerName)) {
                C6832d<?> c = cVar.mo26034c(getReactApplicationContext());
                c.m24247A0(i);
                c.m24177x0(this.eventListener);
                this.registry.m25994j(c);
                this.interactionManager.m26006e(c, config);
                cVar.mo26035b(c, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
    }

    @ReactMethod
    public final void dropGestureHandler(int i) {
        this.interactionManager.m26004g(i);
        this.registry.m25997g(i);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map k;
        Map k2;
        Map<String, Object> k3;
        k = C11289v.m10248k(C11098x.m10921a("UNDETERMINED", 0), C11098x.m10921a("BEGAN", 2), C11098x.m10921a("ACTIVE", 4), C11098x.m10921a("CANCELLED", 3), C11098x.m10921a("FAILED", 1), C11098x.m10921a("END", 5));
        k2 = C11289v.m10248k(C11098x.m10921a("RIGHT", 1), C11098x.m10921a("LEFT", 2), C11098x.m10921a("UP", 4), C11098x.m10921a("DOWN", 8));
        k3 = C11289v.m10248k(C11098x.m10921a("State", k), C11098x.m10921a("Direction", k2));
        return k3;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public final C6257h getRegistry() {
        return this.registry;
    }

    @ReactMethod
    public final void handleClearJSResponder() {
    }

    @ReactMethod
    public final void handleSetJSResponder(int i, boolean z) {
        RNGestureHandlerRootHelper findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
        if (findRootHelperForViewAncestor != null) {
            findRootHelperForViewAncestor.m26024e(i, z);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean install() {
        try {
            SoLoader.m30787r("gesturehandler");
            decorateRuntime(getReactApplicationContext().getJavaScriptContextHolder().get());
            return true;
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.registry.m25998f();
        this.interactionManager.m26003h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                this.roots.get(0).m26021h();
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
            Unit unit = Unit.f22042a;
        }
        super.onCatalystInstanceDestroy();
    }

    public final void registerRootHelper(RNGestureHandlerRootHelper root) {
        C9971q.m14633g(root, "root");
        synchronized (this.roots) {
            if (!this.roots.contains(root)) {
                this.roots.add(root);
            } else {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
        }
    }

    @Override // cf.AbstractC3998a
    public void setGestureHandlerState(int i, int i2) {
        C6832d<?> h = this.registry.m25996h(i);
        if (h == null) {
            return;
        }
        if (i2 == 1) {
            h.m24245C();
        } else if (i2 == 2) {
            h.m24194o();
        } else if (i2 == 3) {
            h.m24192p();
        } else if (i2 == 4) {
            h.mo23996k(true);
        } else if (i2 == 5) {
            h.m24248A();
        }
    }

    public final void unregisterRootHelper(RNGestureHandlerRootHelper root) {
        C9971q.m14633g(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @ReactMethod
    public final <T extends C6832d<T>> void updateGestureHandler(int i, ReadableMap config) {
        AbstractC6237c<T> findFactoryForHandler;
        C9971q.m14633g(config, "config");
        C6832d<?> h = this.registry.m25996h(i);
        if (h != null && (findFactoryForHandler = findFactoryForHandler(h)) != null) {
            this.interactionManager.m26004g(i);
            this.interactionManager.m26006e(h, config);
            findFactoryForHandler.mo26035b(h, config);
        }
    }
}
