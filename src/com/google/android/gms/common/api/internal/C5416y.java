package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import ca.C3795b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p064db.AbstractC6424d;
import p365u9.C13215a;
import p384v9.C13465b;
import p400w9.C13813b;
import p420x9.AbstractC13957c;
import p420x9.C13968e;
import p420x9.C13993m;
import p420x9.C14007q;
import p420x9.C14010r;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes5.dex */
public final class C5416y<T> implements AbstractC6424d<T> {

    /* renamed from: a */
    private final C5376c f10227a;

    /* renamed from: b */
    private final int f10228b;

    /* renamed from: c */
    private final C13813b<?> f10229c;

    /* renamed from: d */
    private final long f10230d;

    /* renamed from: e */
    private final long f10231e;

    C5416y(C5376c cVar, int i, C13813b<?> bVar, long j, long j2, String str, String str2) {
        this.f10227a = cVar;
        this.f10228b = i;
        this.f10229c = bVar;
        this.f10230d = j;
        this.f10231e = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> C5416y<T> m28942b(C5376c cVar, int i, C13813b<?> bVar) {
        boolean z;
        long j;
        long j2;
        if (!cVar.m29076g()) {
            return null;
        }
        C14010r a = C14007q.m2042b().m2043a();
        if (a == null) {
            z = true;
        } else if (!a.m2035t()) {
            return null;
        } else {
            z = a.m2034u();
            C5411t x = cVar.m29059x(bVar);
            if (x != null) {
                if (!(x.m28954v() instanceof AbstractC13957c)) {
                    return null;
                }
                AbstractC13957c cVar2 = (AbstractC13957c) x.m28954v();
                if (cVar2.m2186I() && !cVar2.m2164c()) {
                    C13968e c = m28941c(x, cVar2, i);
                    if (c == null) {
                        return null;
                    }
                    x.m28982G();
                    z = c.m2121z();
                }
            }
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new C5416y<>(cVar, i, bVar, j, j2, null, null);
    }

    /* renamed from: c */
    private static C13968e m28941c(C5411t<?> tVar, AbstractC13957c<?> cVar, int i) {
        int[] r;
        int[] t;
        C13968e G = cVar.m2187G();
        if (G == null || !G.m2122u() || ((r = G.m2124r()) != null ? !C3795b.m33584a(r, i) : !((t = G.m2123t()) == null || !C3795b.m33584a(t, i))) || tVar.m28957s() >= G.m2125p()) {
            return null;
        }
        return G;
    }

    @Override // p064db.AbstractC6424d
    /* renamed from: a */
    public final void mo4743a(Task<T> task) {
        C5411t x;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f10227a.m29076g()) {
            C14010r a = C14007q.m2042b().m2043a();
            if ((a == null || a.m2035t()) && (x = this.f10227a.m29059x(this.f10229c)) != null && (x.m28954v() instanceof AbstractC13957c)) {
                AbstractC13957c cVar = (AbstractC13957c) x.m28954v();
                boolean z2 = true;
                int i7 = 0;
                if (this.f10230d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int y = cVar.m2145y();
                if (a != null) {
                    z &= a.m2034u();
                    int p = a.m2037p();
                    int r = a.m2036r();
                    i3 = a.m2033z();
                    if (cVar.m2186I() && !cVar.m2164c()) {
                        C13968e c = m28941c(x, cVar, this.f10228b);
                        if (c != null) {
                            if (!c.m2121z() || this.f10230d <= 0) {
                                z2 = false;
                            }
                            r = c.m2125p();
                            z = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = p;
                    i = r;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C5376c cVar2 = this.f10227a;
                if (task.mo28858o()) {
                    i4 = 0;
                } else {
                    if (task.mo28860m()) {
                        i7 = 100;
                    } else {
                        Exception j3 = task.mo28863j();
                        if (j3 instanceof C13465b) {
                            Status a2 = ((C13465b) j3).m3641a();
                            int r2 = a2.m29111r();
                            C13215a p2 = a2.m29112p();
                            if (p2 == null) {
                                i6 = -1;
                            } else {
                                i6 = p2.m4298p();
                            }
                            i4 = i6;
                            i7 = r2;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j4 = this.f10230d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f10231e);
                    j2 = j4;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                cVar2.m29084I(new C13993m(this.f10228b, i7, i4, j2, j, null, null, y, i5), i3, i2, i);
            }
        }
    }
}
