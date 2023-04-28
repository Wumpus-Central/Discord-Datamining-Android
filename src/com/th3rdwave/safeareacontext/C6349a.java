package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: com.th3rdwave.safeareacontext.a */
/* loaded from: classes8.dex */
class C6349a extends Event<C6349a> {

    /* renamed from: a */
    private EdgeInsets f12952a;

    /* renamed from: b */
    private Rect f12953b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6349a(int i, EdgeInsets edgeInsets, Rect rect) {
        super(i);
        this.f12952a = edgeInsets;
        this.f12953b = rect;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", C6358i.m25767b(this.f12952a));
        createMap.putMap("frame", C6358i.m25765d(this.f12953b));
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topInsetsChange";
    }
}
