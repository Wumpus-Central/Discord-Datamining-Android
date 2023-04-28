package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class PointerEvent extends Event<PointerEvent> {
    private static final Pools$SynchronizedPool<PointerEvent> EVENTS_POOL = new Pools$SynchronizedPool<>(6);
    private static final int POINTER_EVENTS_POOL_SIZE = 6;
    private static final String TAG = "PointerEvent";
    private static final int UNSET_COALESCING_KEY = -1;
    private int mCoalescingKey = -1;
    private String mEventName;
    private MotionEvent mMotionEvent;
    private float mOffsetX;
    private float mOffsetY;
    private List<WritableMap> mPointersEventData;

    private PointerEvent() {
    }

    private WritableMap createPointerEventData(int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("pointerId", this.mMotionEvent.getPointerId(i));
        createMap.putDouble("pressure", this.mMotionEvent.getPressure(i));
        createMap.putString("pointerType", PointerEventHelper.getW3CPointerType(this.mMotionEvent.getToolType(i)));
        createMap.putDouble("clientX", this.mMotionEvent.getX(i));
        createMap.putDouble("clientY", this.mMotionEvent.getY(i));
        createMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(this.mOffsetX));
        createMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(this.mOffsetY));
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("timestamp", getTimestampMs());
        return createMap;
    }

    private ArrayList<WritableMap> createPointerEvents() {
        MotionEvent motionEvent = this.mMotionEvent;
        ArrayList<WritableMap> arrayList = new ArrayList<>();
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            arrayList.add(createPointerEventData(i));
        }
        return arrayList;
    }

    private List<WritableMap> createPointersEventData() {
        int actionIndex = this.mMotionEvent.getActionIndex();
        String str = this.mEventName;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1786514288:
                if (str.equals(PointerEventHelper.POINTER_ENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1780335505:
                if (str.equals(PointerEventHelper.POINTER_LEAVE)) {
                    c = 1;
                    break;
                }
                break;
            case -1304584214:
                if (str.equals(PointerEventHelper.POINTER_DOWN)) {
                    c = 2;
                    break;
                }
                break;
            case -1304316135:
                if (str.equals(PointerEventHelper.POINTER_MOVE)) {
                    c = 3;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(PointerEventHelper.POINTER_UP)) {
                    c = 4;
                    break;
                }
                break;
            case 383186882:
                if (str.equals(PointerEventHelper.POINTER_CANCEL)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
                return Arrays.asList(createPointerEventData(actionIndex));
            case 3:
            case 5:
                return createPointerEvents();
            default:
                return null;
        }
    }

    private void init(String str, int i, int i2, MotionEvent motionEvent, float[] fArr, int i3) {
        super.init(i, i2, motionEvent.getEventTime());
        this.mEventName = str;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = i3;
        this.mOffsetX = fArr[0];
        this.mOffsetY = fArr[1];
    }

    public static PointerEvent obtain(String str, int i, int i2, MotionEvent motionEvent, float[] fArr) {
        PointerEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new PointerEvent();
        }
        acquire.init(str, i, i2, (MotionEvent) C6399a.m25622c(motionEvent), fArr, 0);
        return acquire;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.mMotionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.mPointersEventData == null) {
            this.mPointersEventData = createPointersEventData();
        }
        List<WritableMap> list = this.mPointersEventData;
        if (list != null) {
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            for (WritableMap writableMap : this.mPointersEventData) {
                if (z) {
                    writableMap = writableMap.copy();
                }
                rCTEventEmitter.receiveEvent(getViewTag(), this.mEventName, writableMap);
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        boolean z;
        boolean z2;
        if (this.mMotionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.mPointersEventData == null) {
            this.mPointersEventData = createPointersEventData();
        }
        List<WritableMap> list = this.mPointersEventData;
        if (list != null) {
            if (list.size() > 1) {
                z = true;
            } else {
                z = false;
            }
            for (WritableMap writableMap : this.mPointersEventData) {
                if (z) {
                    writableMap = writableMap.copy();
                }
                int surfaceId = getSurfaceId();
                int viewTag = getViewTag();
                String str = this.mEventName;
                int i = this.mCoalescingKey;
                if (i != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, z2, i, writableMap, PointerEventHelper.getEventCategory(str));
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.mEventName;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.mPointersEventData = null;
        MotionEvent motionEvent = this.mMotionEvent;
        this.mMotionEvent = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(TAG, e);
        }
    }

    public static PointerEvent obtain(String str, int i, int i2, MotionEvent motionEvent, float[] fArr, int i3) {
        PointerEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new PointerEvent();
        }
        acquire.init(str, i, i2, (MotionEvent) C6399a.m25622c(motionEvent), fArr, i3);
        return acquire;
    }
}
