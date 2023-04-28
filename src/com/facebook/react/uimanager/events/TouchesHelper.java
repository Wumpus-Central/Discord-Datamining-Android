package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import p130h6.C7927a;

/* loaded from: classes7.dex */
public class TouchesHelper {
    public static final String CHANGED_TOUCHES_KEY = "changedTouches";
    private static final String LOCATION_X_KEY = "locationX";
    private static final String LOCATION_Y_KEY = "locationY";
    private static final String PAGE_X_KEY = "pageX";
    private static final String PAGE_Y_KEY = "pageY";
    private static final String POINTER_IDENTIFIER_KEY = "identifier";
    private static final String TAG = "TouchesHelper";
    public static final String TARGET_KEY = "target";
    public static final String TARGET_SURFACE_KEY = "targetSurface";
    private static final String TIMESTAMP_KEY = "timestamp";
    public static final String TOUCHES_KEY = "touches";

    /* renamed from: com.facebook.react.uimanager.events.TouchesHelper$1 */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$events$TouchEventType;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            $SwitchMap$com$facebook$react$uimanager$events$TouchEventType = iArr;
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] createPointersArray(TouchEvent touchEvent) {
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x = motionEvent.getX() - touchEvent.getViewX();
        float y = motionEvent.getY() - touchEvent.getViewY();
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(PAGE_X_KEY, PixelUtil.toDIPFromPixel(motionEvent.getX(i)));
            createMap.putDouble(PAGE_Y_KEY, PixelUtil.toDIPFromPixel(motionEvent.getY(i)));
            createMap.putDouble(LOCATION_X_KEY, PixelUtil.toDIPFromPixel(motionEvent.getX(i) - x));
            createMap.putDouble(LOCATION_Y_KEY, PixelUtil.toDIPFromPixel(motionEvent.getY(i) - y));
            createMap.putInt(TARGET_SURFACE_KEY, touchEvent.getSurfaceId());
            createMap.putInt(TARGET_KEY, touchEvent.getViewTag());
            createMap.putDouble(TIMESTAMP_KEY, touchEvent.getTimestampMs());
            createMap.putDouble(POINTER_IDENTIFIER_KEY, motionEvent.getPointerId(i));
            writableMapArr[i] = createMap;
        }
        return writableMapArr;
    }

    private static WritableArray getWritableArray(boolean z, WritableMap... writableMapArr) {
        WritableArray createArray = Arguments.createArray();
        for (WritableMap writableMap : writableMapArr) {
            if (writableMap != null) {
                if (z) {
                    writableMap = writableMap.copy();
                }
                createArray.pushMap(writableMap);
            }
        }
        return createArray;
    }

    public static void sendTouchEvent(RCTModernEventEmitter rCTModernEventEmitter, TouchEvent touchEvent) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        C7927a.m21142c(0L, "TouchesHelper.sentTouchEventModern(" + touchEvent.getEventName() + ")");
        TouchEventType touchEventType = touchEvent.getTouchEventType();
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        if (motionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return;
        }
        WritableMap[] createPointersArray = createPointersArray(touchEvent);
        int i = AnonymousClass1.$SwitchMap$com$facebook$react$uimanager$events$TouchEventType[touchEventType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int actionIndex = motionEvent.getActionIndex();
                WritableMap writableMap = createPointersArray[actionIndex];
                createPointersArray[actionIndex] = null;
                writableMapArr2 = new WritableMap[]{writableMap};
            } else if (i == 3) {
                writableMapArr2 = new WritableMap[createPointersArray.length];
                for (int i2 = 0; i2 < createPointersArray.length; i2++) {
                    writableMapArr2[i2] = createPointersArray[i2].copy();
                }
            } else if (i != 4) {
                writableMapArr = createPointersArray;
                createPointersArray = null;
            } else {
                writableMapArr = new WritableMap[0];
            }
            createPointersArray = writableMapArr2;
            writableMapArr = createPointersArray;
        } else {
            writableMapArr = createPointersArray;
            createPointersArray = new WritableMap[]{createPointersArray[motionEvent.getActionIndex()].copy()};
        }
        for (WritableMap writableMap2 : createPointersArray) {
            WritableMap copy = writableMap2.copy();
            WritableArray writableArray = getWritableArray(true, createPointersArray);
            WritableArray writableArray2 = getWritableArray(true, writableMapArr);
            copy.putArray(CHANGED_TOUCHES_KEY, writableArray);
            copy.putArray(TOUCHES_KEY, writableArray2);
            rCTModernEventEmitter.receiveEvent(touchEvent.getSurfaceId(), touchEvent.getViewTag(), touchEvent.getEventName(), touchEvent.canCoalesce(), 0, copy, touchEvent.getEventCategory());
        }
        C7927a.m21138g(0L);
    }

    public static void sendTouchesLegacy(RCTEventEmitter rCTEventEmitter, TouchEvent touchEvent) {
        TouchEventType touchEventType = touchEvent.getTouchEventType();
        WritableArray writableArray = getWritableArray(false, createPointersArray(touchEvent));
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableArray createArray = Arguments.createArray();
        if (touchEventType == TouchEventType.MOVE || touchEventType == TouchEventType.CANCEL) {
            for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                createArray.pushInt(i);
            }
        } else if (touchEventType == TouchEventType.START || touchEventType == TouchEventType.END) {
            createArray.pushInt(motionEvent.getActionIndex());
        } else {
            throw new RuntimeException("Unknown touch type: " + touchEventType);
        }
        rCTEventEmitter.receiveTouches(TouchEventType.getJSEventName(touchEventType), writableArray, createArray);
    }
}
