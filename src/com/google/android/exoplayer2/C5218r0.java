package com.google.android.exoplayer2;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p119g9.AbstractC7516c;
import p119g9.C7510a;

/* renamed from: com.google.android.exoplayer2.r0 */
/* loaded from: classes7.dex */
public final class C5218r0 {

    /* renamed from: a */
    private final AbstractC5220b f9339a;

    /* renamed from: b */
    private final AbstractC5219a f9340b;

    /* renamed from: c */
    private final AbstractC7516c f9341c;

    /* renamed from: d */
    private final Timeline f9342d;

    /* renamed from: e */
    private int f9343e;

    /* renamed from: f */
    private Object f9344f;

    /* renamed from: g */
    private Looper f9345g;

    /* renamed from: h */
    private int f9346h;

    /* renamed from: i */
    private long f9347i = -9223372036854775807L;

    /* renamed from: j */
    private boolean f9348j = true;

    /* renamed from: k */
    private boolean f9349k;

    /* renamed from: l */
    private boolean f9350l;

    /* renamed from: m */
    private boolean f9351m;

    /* renamed from: n */
    private boolean f9352n;

    /* renamed from: com.google.android.exoplayer2.r0$a */
    /* loaded from: classes7.dex */
    public interface AbstractC5219a {
        /* renamed from: d */
        void mo30006d(C5218r0 r0Var);
    }

    /* renamed from: com.google.android.exoplayer2.r0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC5220b {
        /* renamed from: i */
        void mo19982i(int i, Object obj);
    }

    public C5218r0(AbstractC5219a aVar, AbstractC5220b bVar, Timeline timeline, int i, AbstractC7516c cVar, Looper looper) {
        this.f9340b = aVar;
        this.f9339a = bVar;
        this.f9342d = timeline;
        this.f9345g = looper;
        this.f9341c = cVar;
        this.f9346h = i;
    }

    /* renamed from: a */
    public synchronized boolean m30020a(long j) {
        boolean z;
        boolean z2;
        C7510a.m22366f(this.f9349k);
        if (this.f9345g.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        long b = this.f9341c.mo22292b() + j;
        while (true) {
            z2 = this.f9351m;
            if (z2 || j <= 0) {
                break;
            }
            wait(j);
            j = b - this.f9341c.mo22292b();
        }
        if (z2) {
        } else {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f9350l;
    }

    /* renamed from: b */
    public boolean m30019b() {
        return this.f9348j;
    }

    /* renamed from: c */
    public Looper m30018c() {
        return this.f9345g;
    }

    /* renamed from: d */
    public Object m30017d() {
        return this.f9344f;
    }

    /* renamed from: e */
    public long m30016e() {
        return this.f9347i;
    }

    /* renamed from: f */
    public AbstractC5220b m30015f() {
        return this.f9339a;
    }

    /* renamed from: g */
    public Timeline m30014g() {
        return this.f9342d;
    }

    /* renamed from: h */
    public int m30013h() {
        return this.f9343e;
    }

    /* renamed from: i */
    public int m30012i() {
        return this.f9346h;
    }

    /* renamed from: j */
    public synchronized boolean m30011j() {
        return this.f9352n;
    }

    /* renamed from: k */
    public synchronized void m30010k(boolean z) {
        this.f9350l = z | this.f9350l;
        this.f9351m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C5218r0 m30009l() {
        C7510a.m22366f(!this.f9349k);
        if (this.f9347i == -9223372036854775807L) {
            C7510a.m22371a(this.f9348j);
        }
        this.f9349k = true;
        this.f9340b.mo30006d(this);
        return this;
    }

    /* renamed from: m */
    public C5218r0 m30008m(Object obj) {
        C7510a.m22366f(!this.f9349k);
        this.f9344f = obj;
        return this;
    }

    /* renamed from: n */
    public C5218r0 m30007n(int i) {
        C7510a.m22366f(!this.f9349k);
        this.f9343e = i;
        return this;
    }
}
