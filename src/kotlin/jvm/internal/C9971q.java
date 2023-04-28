package kotlin.jvm.internal;

import java.util.Arrays;
import nf.C11076i0;
import nf.C11077j;

/* renamed from: kotlin.jvm.internal.q */
/* loaded from: classes8.dex */
public class C9971q {
    private C9971q() {
    }

    /* renamed from: a */
    public static boolean m14639a(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m14638b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static void m14637c(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m14626n(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: d */
    public static void m14636d(Object obj) {
        if (obj == null) {
            m14623q();
        }
    }

    /* renamed from: e */
    public static void m14635e(Object obj, String str) {
        if (obj == null) {
            m14622r(str);
        }
    }

    /* renamed from: f */
    public static void m14634f(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m14626n(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: g */
    public static void m14633g(Object obj, String str) {
        if (obj == null) {
            m14619u(str);
        }
    }

    /* renamed from: h */
    public static void m14632h(Object obj, String str) {
        if (obj == null) {
            m14620t(str);
        }
    }

    /* renamed from: i */
    public static int m14631i(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: j */
    public static int m14630j(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: k */
    private static String m14629k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C9971q.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: l */
    public static void m14628l() {
        m14618v();
    }

    /* renamed from: m */
    public static void m14627m(int i, String str) {
        m14618v();
    }

    /* renamed from: n */
    private static <T extends Throwable> T m14626n(T t) {
        return (T) m14625o(t, C9971q.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <T extends Throwable> T m14625o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: p */
    public static String m14624p(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: q */
    public static void m14623q() {
        throw ((NullPointerException) m14626n(new NullPointerException()));
    }

    /* renamed from: r */
    public static void m14622r(String str) {
        throw ((NullPointerException) m14626n(new NullPointerException(str)));
    }

    /* renamed from: s */
    public static void m14621s() {
        throw ((C11077j) m14626n(new C11077j()));
    }

    /* renamed from: t */
    private static void m14620t(String str) {
        throw ((IllegalArgumentException) m14626n(new IllegalArgumentException(m14629k(str))));
    }

    /* renamed from: u */
    private static void m14619u(String str) {
        throw ((NullPointerException) m14626n(new NullPointerException(m14629k(str))));
    }

    /* renamed from: v */
    public static void m14618v() {
        m14617w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void m14617w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void m14616x(String str) {
        throw ((C11076i0) m14626n(new C11076i0(str)));
    }

    /* renamed from: y */
    public static void m14615y(String str) {
        m14616x("lateinit property " + str + " has not been initialized");
    }
}
