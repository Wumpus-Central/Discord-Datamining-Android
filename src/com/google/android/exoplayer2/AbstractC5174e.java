package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import p119g9.C7557q0;

/* renamed from: com.google.android.exoplayer2.e */
/* loaded from: classes7.dex */
public abstract class AbstractC5174e implements Player {

    /* renamed from: a */
    protected final Timeline.C5161c f9159a = new Timeline.C5161c();

    /* renamed from: b0 */
    private int m30275b0() {
        int U = mo30348U();
        if (U == 1) {
            return 0;
        }
        return U;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: N */
    public final int mo30280N() {
        Timeline w = mo30287w();
        if (w.m30435q()) {
            return -1;
        }
        return w.mo20130l(mo30311m(), m30275b0(), mo30346V());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Q */
    public final boolean mo30279Q() {
        if (mo30355P() == 3 && mo30371G() && mo30291u() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: S */
    public final int mo30278S() {
        Timeline w = mo30287w();
        if (w.m30435q()) {
            return -1;
        }
        return w.mo20131e(mo30311m(), m30275b0(), mo30346V());
    }

    /* renamed from: Z */
    public final int m30277Z() {
        long O = mo30357O();
        long duration = getDuration();
        if (O == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return C7557q0.m22129r((int) ((O * 100) / duration), 0, 100);
    }

    /* renamed from: a0 */
    public final long m30276a0() {
        Timeline w = mo30287w();
        if (w.m30435q()) {
            return -9223372036854775807L;
        }
        return w.m30436n(mo30311m(), this.f9159a).m30415d();
    }

    /* renamed from: c0 */
    public final void m30274c0(long j) {
        mo30373F(mo30311m(), j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public final boolean mo30273h() {
        Timeline w = mo30287w();
        if (w.m30435q() || !w.m30436n(mo30311m(), this.f9159a).f9097h) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasNext() {
        return mo30278S() != -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasPrevious() {
        return mo30280N() != -1;
    }
}
