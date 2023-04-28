package com.facebook.react.uimanager;

import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;

/* loaded from: classes7.dex */
public class OnLayoutEvent extends Event<OnLayoutEvent> {
    private static final Pools$SynchronizedPool<OnLayoutEvent> EVENTS_POOL = new Pools$SynchronizedPool<>(20);
    private int mHeight;
    private int mWidth;

    /* renamed from: mX */
    private int f37194mX;

    /* renamed from: mY */
    private int f37195mY;

    private OnLayoutEvent() {
    }

    @Deprecated
    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5) {
        return obtain(-1, i, i2, i3, i4, i5);
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(this.f37194mX));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(this.f37195mY));
        createMap.putDouble("width", PixelUtil.toDIPFromPixel(this.mWidth));
        createMap.putDouble("height", PixelUtil.toDIPFromPixel(this.mHeight));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        return createMap2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topLayout";
    }

    @Deprecated
    protected void init(int i, int i2, int i3, int i4, int i5) {
        init(-1, i, i2, i3, i4, i5);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        EVENTS_POOL.release(this);
    }

    public static OnLayoutEvent obtain(int i, int i2, int i3, int i4, int i5, int i6) {
        OnLayoutEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new OnLayoutEvent();
        }
        acquire.init(i, i2, i3, i4, i5, i6);
        return acquire;
    }

    protected void init(int i, int i2, int i3, int i4, int i5, int i6) {
        super.init(i, i2);
        this.f37194mX = i3;
        this.f37195mY = i4;
        this.mWidth = i5;
        this.mHeight = i6;
    }
}
