package p286pi;

import kotlin.jvm.internal.C9971q;

/* renamed from: pi.c */
/* loaded from: classes8.dex */
public final class C11761c {
    /* renamed from: a */
    public static final boolean m8674a(Throwable th2) {
        C9971q.m14633g(th2, "<this>");
        Class<?> cls = th2.getClass();
        while (!C9971q.m14638b(cls.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final RuntimeException m8673b(Throwable e) {
        C9971q.m14633g(e, "e");
        throw e;
    }
}
