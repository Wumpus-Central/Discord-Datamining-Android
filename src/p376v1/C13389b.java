package p376v1;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: v1.b */
/* loaded from: classes.dex */
public final class C13389b {

    /* renamed from: a */
    private static long f29968a;

    /* renamed from: b */
    private static Method f29969b;

    /* renamed from: a */
    public static void m3774a(String str) {
        C13390c.m3769a(str);
    }

    /* renamed from: b */
    public static void m3773b() {
        C13390c.m3768b();
    }

    /* renamed from: c */
    private static void m3772c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m3771d() {
        boolean isEnabled;
        try {
            if (f29969b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m3770e();
    }

    /* renamed from: e */
    private static boolean m3770e() {
        try {
            if (f29969b == null) {
                f29968a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f29969b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f29969b.invoke(null, Long.valueOf(f29968a))).booleanValue();
        } catch (Exception e) {
            m3772c("isTagEnabled", e);
            return false;
        }
    }
}
