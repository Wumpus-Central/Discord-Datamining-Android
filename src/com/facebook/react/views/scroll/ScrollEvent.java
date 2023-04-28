package com.facebook.react.views.scroll;

import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
import p059d6.C6399a;

/* loaded from: classes7.dex */
public class ScrollEvent extends Event<ScrollEvent> {
    private static final Pools$SynchronizedPool<ScrollEvent> EVENTS_POOL = new Pools$SynchronizedPool<>(3);
    private static String TAG = "ScrollEvent";
    private int mContentHeight;
    private int mContentWidth;
    private ScrollEventType mScrollEventType;
    private int mScrollViewHeight;
    private int mScrollViewWidth;
    private float mScrollX;
    private float mScrollY;
    private float mXVelocity;
    private float mYVelocity;

    private ScrollEvent() {
    }

    private void init(int i, int i2, ScrollEventType scrollEventType, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6) {
        super.init(i, i2);
        this.mScrollEventType = scrollEventType;
        this.mScrollX = f;
        this.mScrollY = f2;
        this.mXVelocity = f3;
        this.mYVelocity = f4;
        this.mContentWidth = i3;
        this.mContentHeight = i4;
        this.mScrollViewWidth = i5;
        this.mScrollViewHeight = i6;
    }

    @Deprecated
    public static ScrollEvent obtain(int i, ScrollEventType scrollEventType, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5) {
        return obtain(-1, i, scrollEventType, f, f2, f3, f4, i2, i3, i4, i5);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return this.mScrollEventType == ScrollEventType.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ViewProps.TOP, 0.0d);
        createMap.putDouble(ViewProps.BOTTOM, 0.0d);
        createMap.putDouble(ViewProps.LEFT, 0.0d);
        createMap.putDouble(ViewProps.RIGHT, 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", PixelUtil.toDIPFromPixel(this.mScrollX));
        createMap2.putDouble("y", PixelUtil.toDIPFromPixel(this.mScrollY));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", PixelUtil.toDIPFromPixel(this.mContentWidth));
        createMap3.putDouble("height", PixelUtil.toDIPFromPixel(this.mContentHeight));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", PixelUtil.toDIPFromPixel(this.mScrollViewWidth));
        createMap4.putDouble("height", PixelUtil.toDIPFromPixel(this.mScrollViewHeight));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.mXVelocity);
        createMap5.putDouble("y", this.mYVelocity);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return ScrollEventType.getJSEventName((ScrollEventType) C6399a.m25622c(this.mScrollEventType));
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(TAG, e);
        }
    }

    public static ScrollEvent obtain(int i, int i2, ScrollEventType scrollEventType, float f, float f2, float f3, float f4, int i3, int i4, int i5, int i6) {
        ScrollEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new ScrollEvent();
        }
        acquire.init(i, i2, scrollEventType, f, f2, f3, f4, i3, i4, i5, i6);
        return acquire;
    }
}
