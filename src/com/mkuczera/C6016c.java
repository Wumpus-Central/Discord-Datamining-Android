package com.mkuczera;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mkuczera.c */
/* loaded from: classes6.dex */
public class C6016c {

    /* renamed from: a */
    static Map<String, AbstractC6015b> f12213a;

    static {
        HashMap hashMap = new HashMap();
        f12213a = hashMap;
        hashMap.put("impactLight", new C6019f(new long[]{0, 20}));
        f12213a.put("impactMedium", new C6019f(new long[]{0, 40}));
        f12213a.put("impactHeavy", new C6019f(new long[]{0, 60}));
        f12213a.put("notificationSuccess", new C6019f(new long[]{0, 40, 60, 20}));
        f12213a.put("notificationWarning", new C6019f(new long[]{0, 20, 60, 40}));
        f12213a.put("notificationError", new C6019f(new long[]{0, 20, 40, 30, 40, 40}));
        f12213a.put("rigid", new C6019f(new long[]{0, 30}));
        f12213a.put("soft", new C6019f(new long[]{0, 10}));
        f12213a.put("clockTick", new C6020g(4));
        f12213a.put("contextClick", new C6020g(6));
        f12213a.put("keyboardPress", new C6020g(3));
        f12213a.put("keyboardRelease", new C6020g(7));
        f12213a.put("keyboardTap", new C6020g(3));
        f12213a.put("longPress", new C6020g(0));
        f12213a.put("textHandleMove", new C6020g(9));
        f12213a.put("virtualKey", new C6020g(1));
        f12213a.put("virtualKeyRelease", new C6020g(8));
        f12213a.put("effectClick", new C6018e(0));
        f12213a.put("effectDoubleClick", new C6018e(1));
        f12213a.put("effectHeavyClick", new C6018e(5));
        f12213a.put("effectTick", new C6018e(2));
    }

    /* renamed from: a */
    public static AbstractC6015b m26435a(String str) {
        return f12213a.get(str);
    }
}
