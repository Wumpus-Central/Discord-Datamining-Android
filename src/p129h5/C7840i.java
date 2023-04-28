package p129h5;

import java.util.HashMap;
import java.util.Map;

/* renamed from: h5.i */
/* loaded from: classes7.dex */
public class C7840i {

    /* renamed from: a */
    private static Object f17003a = new C7843c();

    /* renamed from: b */
    private static Object f17004b = new C7842b();

    /* renamed from: h5.i$b */
    /* loaded from: classes7.dex */
    private static class C7842b {
        private C7842b() {
        }
    }

    /* renamed from: h5.i$c */
    /* loaded from: classes7.dex */
    private static class C7843c {
        private C7843c() {
        }
    }

    /* renamed from: a */
    public static Object m21258a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey(str)) {
            return m21255d();
        }
        Object obj2 = hashMap.get(str);
        if (obj2 == null) {
            return m21257b();
        }
        return obj2;
    }

    /* renamed from: b */
    public static Object m21257b() {
        return f17004b;
    }

    /* renamed from: c */
    public static void m21256c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    /* renamed from: d */
    public static Object m21255d() {
        return f17003a;
    }

    /* renamed from: e */
    public static boolean m21254e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    /* renamed from: f */
    public static double m21253f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    /* renamed from: g */
    public static Map<String, Object> m21252g(Object obj) {
        return (HashMap) obj;
    }

    /* renamed from: h */
    public static String m21251h(Object obj) {
        return (String) obj;
    }

    /* renamed from: i */
    public static boolean m21250i(Object obj) {
        return obj instanceof Boolean;
    }

    /* renamed from: j */
    public static boolean m21249j(Object obj) {
        return obj instanceof C7842b;
    }

    /* renamed from: k */
    public static boolean m21248k(Object obj) {
        return obj instanceof Double;
    }

    /* renamed from: l */
    public static boolean m21247l(Object obj) {
        return obj instanceof HashMap;
    }

    /* renamed from: m */
    public static boolean m21246m(Object obj) {
        return obj instanceof String;
    }

    /* renamed from: n */
    public static boolean m21245n(Object obj) {
        return obj instanceof C7843c;
    }

    /* renamed from: o */
    public static Object m21244o(boolean z) {
        return new Boolean(z);
    }

    /* renamed from: p */
    public static Object m21243p(double d) {
        return new Double(d);
    }

    /* renamed from: q */
    public static Object m21242q() {
        return new HashMap();
    }

    /* renamed from: r */
    public static Object m21241r(String str) {
        return str;
    }
}
