package net.time4j.android.spi;

import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import net.time4j.base.C10813c;
import p271oj.AbstractC11412e;

/* renamed from: net.time4j.android.spi.a */
/* loaded from: classes8.dex */
class C10807a implements AbstractC11412e {

    /* renamed from: a */
    private static final Class[] f23977a;

    /* renamed from: b */
    private static final Object[] f23978b;

    /* renamed from: c */
    private static final Method f23979c;

    static {
        Class[] clsArr = new Class[0];
        f23977a = clsArr;
        Object[] objArr = new Object[0];
        f23978b = objArr;
        Method method = null;
        try {
            Method method2 = SystemClock.class.getMethod("elapsedRealtimeNanos", clsArr);
            method2.invoke(null, objArr);
            method = method2;
        } catch (IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        f23979c = method;
    }

    @Override // p271oj.AbstractC11412e
    /* renamed from: a */
    public long mo10111a() {
        Method method = f23979c;
        if (method != null) {
            try {
                return ((Long) method.invoke(null, f23978b)).longValue();
            } catch (IllegalAccessException e) {
                e.printStackTrace(System.err);
            } catch (InvocationTargetException e2) {
                e2.printStackTrace(System.err);
            }
        }
        return C10813c.m12194i(SystemClock.elapsedRealtime(), 1000000L);
    }

    @Override // p271oj.AbstractC11412e
    /* renamed from: b */
    public String mo10110b() {
        return "Dalvik";
    }
}
