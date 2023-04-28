package ca;

import android.os.SystemClock;

/* renamed from: ca.e */
/* loaded from: classes5.dex */
public class C3798e implements AbstractC3797d {

    /* renamed from: a */
    private static final C3798e f6288a = new C3798e();

    private C3798e() {
    }

    /* renamed from: c */
    public static AbstractC3797d m33579c() {
        return f6288a;
    }

    @Override // ca.AbstractC3797d
    /* renamed from: a */
    public final long mo33581a() {
        return System.currentTimeMillis();
    }

    @Override // ca.AbstractC3797d
    /* renamed from: b */
    public final long mo33580b() {
        return SystemClock.elapsedRealtime();
    }
}
