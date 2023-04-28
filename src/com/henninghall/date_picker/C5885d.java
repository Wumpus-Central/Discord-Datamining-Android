package com.henninghall.date_picker;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Calendar;

/* renamed from: com.henninghall.date_picker.d */
/* loaded from: classes6.dex */
public class C5885d {
    /* renamed from: a */
    private static RCTEventEmitter m26978a() {
        return (RCTEventEmitter) C5882b.f11696a.getJSModule(RCTEventEmitter.class);
    }

    /* renamed from: b */
    public static void m26977b(Calendar calendar, String str, View view) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("date", C5899l.m26924b(calendar));
        createMap.putString("dateString", str);
        m26978a().receiveEvent(view.getId(), "dateChange", createMap);
    }
}
