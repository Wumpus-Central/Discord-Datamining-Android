package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import p119g9.C7510a;
import p153i8.AbstractC8285q0;

/* renamed from: com.google.android.exoplayer2.a */
/* loaded from: classes7.dex */
public abstract class AbstractC5162a extends Timeline {

    /* renamed from: b */
    private final int f9107b;

    /* renamed from: c */
    private final AbstractC8285q0 f9108c;

    /* renamed from: d */
    private final boolean f9109d;

    public AbstractC5162a(boolean z, AbstractC8285q0 q0Var) {
        this.f9109d = z;
        this.f9108c = q0Var;
        this.f9107b = q0Var.getLength();
    }

    /* renamed from: B */
    private int m30411B(int i, boolean z) {
        if (z) {
            return this.f9108c.mo20034c(i);
        }
        if (i < this.f9107b - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: C */
    private int m30410C(int i, boolean z) {
        if (z) {
            return this.f9108c.mo20035b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: v */
    public static Object m30408v(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: w */
    public static Object m30407w(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: y */
    public static Object m30406y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: A */
    protected abstract int mo30005A(int i);

    /* renamed from: D */
    protected abstract Timeline mo30004D(int i);

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: a */
    public int mo20133a(boolean z) {
        if (this.f9107b == 0) {
            return -1;
        }
        int i = 0;
        if (this.f9109d) {
            z = false;
        }
        if (z) {
            i = this.f9108c.mo20031f();
        }
        while (mo30004D(i).m30435q()) {
            i = m30411B(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo30005A(i) + mo30004D(i).mo20133a(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: b */
    public final int mo20027b(Object obj) {
        int b;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w = m30407w(obj);
        Object v = m30408v(obj);
        int s = mo30002s(w);
        if (s == -1 || (b = mo30004D(s).mo20027b(v)) == -1) {
            return -1;
        }
        return mo29998z(s) + b;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: c */
    public int mo20132c(boolean z) {
        int i;
        int i2 = this.f9107b;
        if (i2 == 0) {
            return -1;
        }
        if (this.f9109d) {
            z = false;
        }
        if (z) {
            i = this.f9108c.mo20033d();
        } else {
            i = i2 - 1;
        }
        while (mo30004D(i).m30435q()) {
            i = m30410C(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo30005A(i) + mo30004D(i).mo20132c(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: e */
    public int mo20131e(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f9109d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = mo30000u(i);
        int A = mo30005A(u);
        Timeline D = mo30004D(u);
        int i4 = i - A;
        if (i2 != 2) {
            i3 = i2;
        }
        int e = D.mo20131e(i4, i3, z);
        if (e != -1) {
            return A + e;
        }
        int B = m30411B(u, z);
        while (B != -1 && mo30004D(B).m30435q()) {
            B = m30411B(B, z);
        }
        if (B != -1) {
            return mo30005A(B) + mo30004D(B).mo20133a(z);
        }
        if (i2 == 2) {
            return mo20133a(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public final Timeline.C5160b mo20026g(int i, Timeline.C5160b bVar, boolean z) {
        int t = mo30001t(i);
        int A = mo30005A(t);
        mo30004D(t).mo20026g(i - mo29998z(t), bVar, z);
        bVar.f9084c += A;
        if (z) {
            bVar.f9083b = m30406y(mo29999x(t), C7510a.m22367e(bVar.f9083b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: h */
    public final Timeline.C5160b mo30409h(Object obj, Timeline.C5160b bVar) {
        Object w = m30407w(obj);
        Object v = m30408v(obj);
        int s = mo30002s(w);
        int A = mo30005A(s);
        mo30004D(s).mo30409h(v, bVar);
        bVar.f9084c += A;
        bVar.f9083b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: l */
    public int mo20130l(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f9109d) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int u = mo30000u(i);
        int A = mo30005A(u);
        Timeline D = mo30004D(u);
        int i4 = i - A;
        if (i2 != 2) {
            i3 = i2;
        }
        int l = D.mo20130l(i4, i3, z);
        if (l != -1) {
            return A + l;
        }
        int C = m30410C(u, z);
        while (C != -1 && mo30004D(C).m30435q()) {
            C = m30410C(C, z);
        }
        if (C != -1) {
            return mo30005A(C) + mo30004D(C).mo20132c(z);
        }
        if (i2 == 2) {
            return mo20132c(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: m */
    public final Object mo20024m(int i) {
        int t = mo30001t(i);
        return m30406y(mo29999x(t), mo30004D(t).mo20024m(i - mo29998z(t)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    public final Timeline.C5161c mo20023o(int i, Timeline.C5161c cVar, long j) {
        int u = mo30000u(i);
        int A = mo30005A(u);
        int z = mo29998z(u);
        mo30004D(u).mo20023o(i - A, cVar, j);
        Object x = mo29999x(u);
        if (!Timeline.C5161c.f9088r.equals(cVar.f9090a)) {
            x = m30406y(x, cVar.f9090a);
        }
        cVar.f9090a = x;
        cVar.f9102m += z;
        cVar.f9103n += z;
        return cVar;
    }

    /* renamed from: s */
    protected abstract int mo30002s(Object obj);

    /* renamed from: t */
    protected abstract int mo30001t(int i);

    /* renamed from: u */
    protected abstract int mo30000u(int i);

    /* renamed from: x */
    protected abstract Object mo29999x(int i);

    /* renamed from: z */
    protected abstract int mo29998z(int i);
}
