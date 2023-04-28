package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import p079e7.AbstractC6714d;

/* renamed from: com.google.android.exoplayer2.f */
/* loaded from: classes7.dex */
public class C5176f implements AbstractC6714d {

    /* renamed from: a */
    private final Timeline.C5161c f9161a;

    /* renamed from: b */
    private long f9162b;

    /* renamed from: c */
    private long f9163c;

    public C5176f() {
        this(15000L, 5000L);
    }

    /* renamed from: l */
    private static void m30272l(Player player, long j) {
        long Y = player.mo30341Y() + j;
        long duration = player.getDuration();
        if (duration != -9223372036854775807L) {
            Y = Math.min(Y, duration);
        }
        player.mo30373F(player.mo30311m(), Math.max(Y, 0L));
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: a */
    public boolean mo24564a(Player player) {
        if (!mo24559f() || !player.mo30273h()) {
            return true;
        }
        m30272l(player, -this.f9162b);
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: b */
    public boolean mo24563b(Player player, int i, long j) {
        player.mo30373F(i, j);
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: c */
    public boolean mo24562c(Player player, boolean z) {
        player.mo30369H(z);
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: d */
    public boolean mo24561d(Player player, int i) {
        player.mo30352R(i);
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: e */
    public boolean mo24560e(Player player) {
        if (!mo24555j() || !player.mo30273h()) {
            return true;
        }
        m30272l(player, this.f9163c);
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: f */
    public boolean mo24559f() {
        return this.f9162b > 0;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: g */
    public boolean mo24558g(Player player) {
        player.mo30335c();
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: h */
    public boolean mo24557h(Player player) {
        boolean z;
        Timeline w = player.mo30287w();
        if (!w.m30435q() && !player.mo30333d()) {
            int m = player.mo30311m();
            w.m30436n(m, this.f9161a);
            int N = player.mo30280N();
            if (!this.f9161a.m30413f() || this.f9161a.f9097h) {
                z = false;
            } else {
                z = true;
            }
            if (N != -1 && (player.mo30341Y() <= 3000 || z)) {
                player.mo30373F(N, -9223372036854775807L);
            } else if (!z) {
                player.mo30373F(m, 0L);
            }
        }
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: i */
    public boolean mo24556i(Player player) {
        Timeline w = player.mo30287w();
        if (!w.m30435q() && !player.mo30333d()) {
            int m = player.mo30311m();
            w.m30436n(m, this.f9161a);
            int S = player.mo30278S();
            if (S != -1) {
                player.mo30373F(S, -9223372036854775807L);
            } else if (this.f9161a.m30413f() && this.f9161a.f9098i) {
                player.mo30373F(m, -9223372036854775807L);
            }
        }
        return true;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: j */
    public boolean mo24555j() {
        return this.f9163c > 0;
    }

    @Override // p079e7.AbstractC6714d
    /* renamed from: k */
    public boolean mo24554k(Player player, boolean z) {
        player.mo30305o(z);
        return true;
    }

    @Deprecated
    /* renamed from: m */
    public void m30271m(long j) {
        this.f9163c = j;
    }

    @Deprecated
    /* renamed from: n */
    public void m30270n(long j) {
        this.f9162b = j;
    }

    public C5176f(long j, long j2) {
        this.f9163c = j;
        this.f9162b = j2;
        this.f9161a = new Timeline.C5161c();
    }
}
