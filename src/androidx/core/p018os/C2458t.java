package androidx.core.p018os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: androidx.core.os.t */
/* loaded from: classes.dex */
public final class C2458t {

    /* renamed from: a */
    private static long f3384a;

    /* renamed from: b */
    private static Method f3385b;

    /* renamed from: c */
    private static Method f3386c;

    /* renamed from: d */
    private static Method f3387d;

    /* renamed from: e */
    private static Method f3388e;

    /* renamed from: androidx.core.os.t$a */
    /* loaded from: classes.dex */
    static class C2459a {
        /* renamed from: a */
        static void m37715a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m37714b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3384a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f3385b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f3386c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f3387d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f3388e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m37717a(String str) {
        C2459a.m37715a(str);
    }

    /* renamed from: b */
    public static void m37716b() {
        C2459a.m37714b();
    }
}
