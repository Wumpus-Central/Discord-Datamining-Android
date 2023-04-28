package io.sentry.util;

/* renamed from: io.sentry.util.b */
/* loaded from: classes8.dex */
public final class C9099b {
    /* renamed from: a */
    public static Throwable m17021a(Throwable th2) {
        C9111k.m16995a(th2, "throwable cannot be null");
        while (th2.getCause() != null && th2.getCause() != th2) {
            th2 = th2.getCause();
        }
        return th2;
    }
}
