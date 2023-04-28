package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;

/* renamed from: com.reactnativecommunity.slider.b */
/* loaded from: classes6.dex */
public class C6136b extends Event<C6136b> {

    /* renamed from: a */
    private final double f12505a;

    /* renamed from: b */
    private final boolean f12506b;

    public C6136b(int i, double d, boolean z) {
        super(i);
        this.f12505a = d;
        this.f12506b = z;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", getValue());
        createMap.putBoolean("fromUser", isFromUser());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }

    public double getValue() {
        return this.f12505a;
    }

    public boolean isFromUser() {
        return this.f12506b;
    }
}
