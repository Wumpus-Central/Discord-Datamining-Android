package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import cc.AbstractC3884i0;
import com.google.android.exoplayer2.C5181g0;
import com.google.android.exoplayer2.C5210p0;
import com.google.android.exoplayer2.C5218r0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p029b9.AbstractC3415h;
import p029b9.AbstractC3425m;
import p029b9.C3427n;
import p030bc.AbstractC3465n;
import p079e7.AbstractC6727n;
import p079e7.C6713c;
import p079e7.C6720i;
import p079e7.C6721j;
import p079e7.C6726m;
import p079e7.C6734u;
import p079e7.C6736w;
import p081e9.AbstractC6769e;
import p098f7.C7030d1;
import p119g9.AbstractC7516c;
import p119g9.AbstractC7545m;
import p119g9.C7510a;
import p119g9.C7553q;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7565v;
import p153i8.AbstractC8236c0;
import p153i8.AbstractC8285q0;
import p153i8.AbstractC8299u;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.d0 */
/* loaded from: classes7.dex */
public final class C5172d0 extends AbstractC5174e {

    /* renamed from: A */
    private int f37223A;

    /* renamed from: B */
    private int f37224B;

    /* renamed from: C */
    private long f37225C;

    /* renamed from: b */
    final C3427n f9132b;

    /* renamed from: c */
    private final AbstractC5252t0[] f9133c;

    /* renamed from: d */
    private final AbstractC3425m f9134d;

    /* renamed from: e */
    private final AbstractC7545m f9135e;

    /* renamed from: f */
    private final C5181g0.AbstractC5187f f9136f;

    /* renamed from: g */
    private final C5181g0 f9137g;

    /* renamed from: h */
    private final C7553q<Player.AbstractC5153a, Player.Events> f9138h;

    /* renamed from: i */
    private final Timeline.C5160b f9139i;

    /* renamed from: j */
    private final List<C5173a> f9140j;

    /* renamed from: k */
    private final boolean f9141k;

    /* renamed from: l */
    private final AbstractC8236c0 f9142l;

    /* renamed from: m */
    private final C7030d1 f9143m;

    /* renamed from: n */
    private final Looper f9144n;

    /* renamed from: o */
    private final AbstractC6769e f9145o;

    /* renamed from: p */
    private final AbstractC7516c f9146p;

    /* renamed from: q */
    private int f9147q;

    /* renamed from: r */
    private boolean f9148r;

    /* renamed from: s */
    private int f9149s;

    /* renamed from: t */
    private boolean f9150t;

    /* renamed from: u */
    private int f9151u;

    /* renamed from: v */
    private int f9152v;

    /* renamed from: w */
    private C6736w f9153w;

    /* renamed from: x */
    private AbstractC8285q0 f9154x;

    /* renamed from: y */
    private boolean f9155y;

    /* renamed from: z */
    private C5216q0 f9156z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.d0$a */
    /* loaded from: classes7.dex */
    public static final class C5173a implements AbstractC5206n0 {

        /* renamed from: a */
        private final Object f9157a;

        /* renamed from: b */
        private Timeline f9158b;

        public C5173a(Object obj, Timeline timeline) {
            this.f9157a = obj;
            this.f9158b = timeline;
        }

        @Override // com.google.android.exoplayer2.AbstractC5206n0
        /* renamed from: a */
        public Object mo30036a() {
            return this.f9157a;
        }

        @Override // com.google.android.exoplayer2.AbstractC5206n0
        /* renamed from: b */
        public Timeline mo30035b() {
            return this.f9158b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C5172d0(AbstractC5252t0[] t0VarArr, AbstractC3425m mVar, AbstractC8236c0 c0Var, AbstractC6727n nVar, AbstractC6769e eVar, C7030d1 d1Var, boolean z, C6736w wVar, AbstractC5192h0 h0Var, long j, boolean z2, AbstractC7516c cVar, Looper looper, Player player) {
        C7558r.m22106f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.13.3] [" + C7557q0.f16372e + "]");
        C7510a.m22366f(t0VarArr.length > 0);
        this.f9133c = (AbstractC5252t0[]) C7510a.m22367e(t0VarArr);
        this.f9134d = (AbstractC3425m) C7510a.m22367e(mVar);
        this.f9142l = c0Var;
        this.f9145o = eVar;
        this.f9143m = d1Var;
        this.f9141k = z;
        this.f9153w = wVar;
        this.f9155y = z2;
        this.f9144n = looper;
        this.f9146p = cVar;
        this.f9147q = 0;
        final Player player2 = player != null ? player : this;
        this.f9138h = new C7553q<>(looper, cVar, new AbstractC3465n() { // from class: e7.g
            @Override // p030bc.AbstractC3465n, p163j$.util.function.Supplier
            public final Object get() {
                return new Player.Events();
            }
        }, new C7553q.AbstractC7555b() { // from class: com.google.android.exoplayer2.s
            @Override // p119g9.C7553q.AbstractC7555b
            /* renamed from: a */
            public final void mo22219a(Object obj, C7565v vVar) {
                ((Player.AbstractC5153a) obj).onEvents(Player.this, (Player.Events) vVar);
            }
        });
        this.f9140j = new ArrayList();
        this.f9154x = new AbstractC8285q0.C8286a(0);
        C3427n nVar2 = new C3427n(new C6734u[t0VarArr.length], new AbstractC3415h[t0VarArr.length], null);
        this.f9132b = nVar2;
        this.f9139i = new Timeline.C5160b();
        this.f37223A = -1;
        this.f9135e = cVar.mo22291c(looper, null);
        C5181g0.AbstractC5187f wVar2 = new C5181g0.AbstractC5187f() { // from class: com.google.android.exoplayer2.w
            @Override // com.google.android.exoplayer2.C5181g0.AbstractC5187f
            /* renamed from: a */
            public final void mo29459a(C5181g0.C5186e eVar2) {
                C5172d0.this.m30361L0(eVar2);
            }
        };
        this.f9136f = wVar2;
        this.f9156z = C5216q0.m30022k(nVar2);
        if (d1Var != null) {
            d1Var.m23577X1(player2, looper);
            mo30364K(d1Var);
            eVar.mo24340g(new Handler(looper), d1Var);
        }
        this.f9137g = new C5181g0(t0VarArr, mVar, nVar2, nVar, eVar, this.f9147q, this.f9148r, d1Var, wVar, h0Var, j, z2, looper, cVar, wVar2);
    }

    /* renamed from: B0 */
    private Pair<Boolean, Integer> m30379B0(C5216q0 q0Var, C5216q0 q0Var2, boolean z, int i, boolean z2) {
        Timeline timeline = q0Var2.f9321a;
        Timeline timeline2 = q0Var.f9321a;
        if (timeline2.m30435q() && timeline.m30435q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (timeline2.m30435q() != timeline.m30435q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        Object obj = timeline.m30436n(timeline.mo30409h(q0Var2.f9322b.f18059a, this.f9139i).f9084c, this.f9159a).f9090a;
        Object obj2 = timeline2.m30436n(timeline2.mo30409h(q0Var.f9322b.f18059a, this.f9139i).f9084c, this.f9159a).f9090a;
        int i3 = this.f9159a.f9102m;
        if (!obj.equals(obj2)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (z && i == 0 && timeline2.mo20027b(q0Var.f9322b.f18059a) == i3) {
            return new Pair<>(Boolean.TRUE, 0);
        } else {
            return new Pair<>(Boolean.FALSE, -1);
        }
    }

    /* renamed from: D0 */
    private int m30376D0() {
        if (this.f9156z.f9321a.m30435q()) {
            return this.f37223A;
        }
        C5216q0 q0Var = this.f9156z;
        return q0Var.f9321a.mo30409h(q0Var.f9322b.f18059a, this.f9139i).f9084c;
    }

    /* renamed from: E0 */
    private Pair<Object, Long> m30374E0(Timeline timeline, Timeline timeline2) {
        boolean z;
        long M = mo30360M();
        int i = -1;
        if (timeline.m30435q() || timeline2.m30435q()) {
            if (timeline.m30435q() || !timeline2.m30435q()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                i = m30376D0();
            }
            if (z) {
                M = -9223372036854775807L;
            }
            return m30372F0(timeline2, i, M);
        }
        Pair<Object, Long> j = timeline.m30438j(this.f9159a, this.f9139i, mo30311m(), C6713c.m24566c(M));
        Object obj = ((Pair) C7557q0.m22145j(j)).first;
        if (timeline2.mo20027b(obj) != -1) {
            return j;
        }
        Object u0 = C5181g0.m30164u0(this.f9159a, this.f9139i, this.f9147q, this.f9148r, obj, timeline, timeline2);
        if (u0 == null) {
            return m30372F0(timeline2, -1, -9223372036854775807L);
        }
        timeline2.mo30409h(u0, this.f9139i);
        int i2 = this.f9139i.f9084c;
        return m30372F0(timeline2, i2, timeline2.m30436n(i2, this.f9159a).m30417b());
    }

    /* renamed from: F0 */
    private Pair<Object, Long> m30372F0(Timeline timeline, int i, long j) {
        if (timeline.m30435q()) {
            this.f37223A = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f37225C = j;
            this.f37224B = 0;
            return null;
        }
        if (i == -1 || i >= timeline.mo20022p()) {
            i = timeline.mo20133a(this.f9148r);
            j = timeline.m30436n(i, this.f9159a).m30417b();
        }
        return timeline.m30438j(this.f9159a, this.f9139i, i, C6713c.m24566c(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m30363K0(C5181g0.C5186e eVar) {
        int i = this.f9149s - eVar.f9223c;
        this.f9149s = i;
        boolean z = true;
        if (eVar.f9224d) {
            this.f9150t = true;
            this.f9151u = eVar.f9225e;
        }
        if (eVar.f9226f) {
            this.f9152v = eVar.f9227g;
        }
        if (i == 0) {
            Timeline timeline = eVar.f9222b.f9321a;
            if (!this.f9156z.f9321a.m30435q() && timeline.m30435q()) {
                this.f37223A = -1;
                this.f37225C = 0L;
                this.f37224B = 0;
            }
            if (!timeline.m30435q()) {
                List<Timeline> E = ((C5222s0) timeline).m30003E();
                if (E.size() != this.f9140j.size()) {
                    z = false;
                }
                C7510a.m22366f(z);
                for (int i2 = 0; i2 < E.size(); i2++) {
                    this.f9140j.get(i2).f9158b = E.get(i2);
                }
            }
            boolean z2 = this.f9150t;
            this.f9150t = false;
            m30294s1(eVar.f9222b, z2, this.f9151u, 1, this.f9152v, false);
        }
    }

    /* renamed from: I0 */
    private static boolean m30366I0(C5216q0 q0Var) {
        return q0Var.f9324d == 3 && q0Var.f9331k && q0Var.f9332l == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public /* synthetic */ void m30361L0(final C5181g0.C5186e eVar) {
        this.f9135e.mo22255a(new Runnable() { // from class: com.google.android.exoplayer2.u
            @Override // java.lang.Runnable
            public final void run() {
                C5172d0.this.m30363K0(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static /* synthetic */ void m30359M0(Player.AbstractC5153a aVar) {
        aVar.onPlayerError(ExoPlaybackException.m30560b(new C6721j(1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public static /* synthetic */ void m30354P0(C5216q0 q0Var, TrackSelectionArray trackSelectionArray, Player.AbstractC5153a aVar) {
        aVar.onTracksChanged(q0Var.f9327g, trackSelectionArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static /* synthetic */ void m30353Q0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onStaticMetadataChanged(q0Var.f9329i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public static /* synthetic */ void m30351R0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onIsLoadingChanged(q0Var.f9326f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static /* synthetic */ void m30350S0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onPlayerStateChanged(q0Var.f9331k, q0Var.f9324d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ void m30349T0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onPlaybackStateChanged(q0Var.f9324d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ void m30347U0(C5216q0 q0Var, int i, Player.AbstractC5153a aVar) {
        aVar.onPlayWhenReadyChanged(q0Var.f9331k, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ void m30345V0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onPlaybackSuppressionReasonChanged(q0Var.f9332l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static /* synthetic */ void m30344W0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onIsPlayingChanged(m30366I0(q0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static /* synthetic */ void m30342X0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onPlaybackParametersChanged(q0Var.f9333m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public static /* synthetic */ void m30340Y0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onExperimentalOffloadSchedulingEnabledChanged(q0Var.f9334n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public static /* synthetic */ void m30339Z0(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onExperimentalSleepingForOffloadChanged(q0Var.f9335o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static /* synthetic */ void m30338a1(C5216q0 q0Var, int i, Player.AbstractC5153a aVar) {
        aVar.onTimelineChanged(q0Var.f9321a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public static /* synthetic */ void m30331d1(C5216q0 q0Var, Player.AbstractC5153a aVar) {
        aVar.onPlayerError(q0Var.f9325e);
    }

    /* renamed from: e1 */
    private C5216q0 m30328e1(C5216q0 q0Var, Timeline timeline, Pair<Object, Long> pair) {
        boolean z;
        AbstractC8299u.C8300a aVar;
        TrackGroupArray trackGroupArray;
        C3427n nVar;
        List<C14576a> list;
        int i;
        long j;
        if (timeline.m30435q() || pair != null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22371a(z);
        Timeline timeline2 = q0Var.f9321a;
        C5216q0 j2 = q0Var.m30023j(timeline);
        if (timeline.m30435q()) {
            AbstractC8299u.C8300a l = C5216q0.m30021l();
            C5216q0 b = j2.m30030c(l, C6713c.m24566c(this.f37225C), C6713c.m24566c(this.f37225C), 0L, TrackGroupArray.f9361n, this.f9132b, AbstractC3884i0.m33399x()).m30031b(l);
            b.f9336p = b.f9338r;
            return b;
        }
        Object obj = j2.f9322b.f18059a;
        boolean z2 = !obj.equals(((Pair) C7557q0.m22145j(pair)).first);
        if (z2) {
            aVar = new AbstractC8299u.C8300a(pair.first);
        } else {
            aVar = j2.f9322b;
        }
        long longValue = ((Long) pair.second).longValue();
        long c = C6713c.m24566c(mo30360M());
        if (!timeline2.m30435q()) {
            c -= timeline2.mo30409h(obj, this.f9139i).m30422l();
        }
        if (z2 || longValue < c) {
            C7510a.m22366f(!aVar.m20020b());
            if (z2) {
                trackGroupArray = TrackGroupArray.f9361n;
            } else {
                trackGroupArray = j2.f9327g;
            }
            if (z2) {
                nVar = this.f9132b;
            } else {
                nVar = j2.f9328h;
            }
            if (z2) {
                list = AbstractC3884i0.m33399x();
            } else {
                list = j2.f9329i;
            }
            C5216q0 b2 = j2.m30030c(aVar, longValue, longValue, 0L, trackGroupArray, nVar, list).m30031b(aVar);
            b2.f9336p = longValue;
            return b2;
        } else if (i == 0) {
            int b3 = timeline.mo20027b(j2.f9330j.f18059a);
            if (b3 != -1 && timeline.m30439f(b3, this.f9139i).f9084c == timeline.mo30409h(aVar.f18059a, this.f9139i).f9084c) {
                return j2;
            }
            timeline.mo30409h(aVar.f18059a, this.f9139i);
            if (aVar.m20020b()) {
                j = this.f9139i.m30432b(aVar.f18060b, aVar.f18061c);
            } else {
                j = this.f9139i.f9085d;
            }
            C5216q0 b4 = j2.m30030c(aVar, j2.f9338r, j2.f9338r, j - j2.f9338r, j2.f9327g, j2.f9328h, j2.f9329i).m30031b(aVar);
            b4.f9336p = j;
            return b4;
        } else {
            C7510a.m22366f(!aVar.m20020b());
            long max = Math.max(0L, j2.f9337q - (longValue - c));
            long j3 = j2.f9336p;
            if (j2.f9330j.equals(j2.f9322b)) {
                j3 = longValue + max;
            }
            C5216q0 c2 = j2.m30030c(aVar, longValue, longValue, max, j2.f9327g, j2.f9328h, j2.f9329i);
            c2.f9336p = j3;
            return c2;
        }
    }

    /* renamed from: f1 */
    private long m30326f1(AbstractC8299u.C8300a aVar, long j) {
        long d = C6713c.m24565d(j);
        this.f9156z.f9321a.mo30409h(aVar.f18059a, this.f9139i);
        return d + this.f9139i.m30423k();
    }

    /* renamed from: h1 */
    private C5216q0 m30321h1(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i < 0 || i2 < i || i2 > this.f9140j.size()) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        int m = mo30311m();
        Timeline w = mo30287w();
        int size = this.f9140j.size();
        this.f9149s++;
        m30319i1(i, i2);
        Timeline z0 = m30282z0();
        C5216q0 e1 = m30328e1(this.f9156z, z0, m30374E0(w, z0));
        int i3 = e1.f9324d;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && m >= e1.f9321a.mo20022p()) {
            z2 = true;
        }
        if (z2) {
            e1 = e1.m30025h(4);
        }
        this.f9137g.m30189j0(i, i2, this.f9154x);
        return e1;
    }

    /* renamed from: i1 */
    private void m30319i1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f9140j.remove(i3);
        }
        this.f9154x = this.f9154x.mo20036a(i, i2);
    }

    /* renamed from: n1 */
    private void m30306n1(List<AbstractC8299u> list, int i, long j, boolean z) {
        int i2 = i;
        int D0 = m30376D0();
        long Y = mo30341Y();
        this.f9149s++;
        if (!this.f9140j.isEmpty()) {
            m30319i1(0, this.f9140j.size());
        }
        List<C5210p0.C5213c> y0 = m30283y0(0, list);
        Timeline z0 = m30282z0();
        if (z0.m30435q() || i2 < z0.mo20022p()) {
            long j2 = j;
            if (z) {
                i2 = z0.mo20133a(this.f9148r);
                j2 = -9223372036854775807L;
            } else if (i2 == -1) {
                i2 = D0;
                j2 = Y;
            }
            C5216q0 e1 = m30328e1(this.f9156z, z0, m30372F0(z0, i2, j2));
            int i3 = e1.f9324d;
            if (!(i2 == -1 || i3 == 1)) {
                i3 = (z0.m30435q() || i2 >= z0.mo20022p()) ? 4 : 2;
            }
            C5216q0 h = e1.m30025h(i3);
            this.f9137g.m30247I0(y0, i2, C6713c.m24566c(j2), this.f9154x);
            m30294s1(h, false, 4, 0, 1, false);
            return;
        }
        throw new C6726m(z0, i2, j);
    }

    /* renamed from: s1 */
    private void m30294s1(final C5216q0 q0Var, boolean z, final int i, final int i2, final int i3, boolean z2) {
        final MediaItem mediaItem;
        C5216q0 q0Var2 = this.f9156z;
        this.f9156z = q0Var;
        Pair<Boolean, Integer> B0 = m30379B0(q0Var, q0Var2, z, i, !q0Var2.f9321a.equals(q0Var.f9321a));
        boolean booleanValue = ((Boolean) B0.first).booleanValue();
        final int intValue = ((Integer) B0.second).intValue();
        if (!q0Var2.f9321a.equals(q0Var.f9321a)) {
            this.f9138h.m22223i(0, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.x
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30338a1(C5216q0.this, i2, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (z) {
            this.f9138h.m22223i(12, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.i
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((Player.AbstractC5153a) obj).onPositionDiscontinuity(i);
                }
            });
        }
        if (booleanValue) {
            if (!q0Var.f9321a.m30435q()) {
                mediaItem = q0Var.f9321a.m30436n(q0Var.f9321a.mo30409h(q0Var.f9322b.f18059a, this.f9139i).f9084c, this.f9159a).f9092c;
            } else {
                mediaItem = null;
            }
            this.f9138h.m22223i(1, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.j
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((Player.AbstractC5153a) obj).onMediaItemTransition(MediaItem.this, intValue);
                }
            });
        }
        ExoPlaybackException exoPlaybackException = q0Var2.f9325e;
        ExoPlaybackException exoPlaybackException2 = q0Var.f9325e;
        if (!(exoPlaybackException == exoPlaybackException2 || exoPlaybackException2 == null)) {
            this.f9138h.m22223i(11, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.k
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30331d1(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        C3427n nVar = q0Var2.f9328h;
        C3427n nVar2 = q0Var.f9328h;
        if (nVar != nVar2) {
            this.f9134d.mo34401d(nVar2.f5566d);
            final TrackSelectionArray trackSelectionArray = new TrackSelectionArray(q0Var.f9328h.f5565c);
            this.f9138h.m22223i(2, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.l
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30354P0(C5216q0.this, trackSelectionArray, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (!q0Var2.f9329i.equals(q0Var.f9329i)) {
            this.f9138h.m22223i(3, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.m
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30353Q0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (q0Var2.f9326f != q0Var.f9326f) {
            this.f9138h.m22223i(4, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.n
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30351R0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (!(q0Var2.f9324d == q0Var.f9324d && q0Var2.f9331k == q0Var.f9331k)) {
            this.f9138h.m22223i(-1, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.o
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30350S0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (q0Var2.f9324d != q0Var.f9324d) {
            this.f9138h.m22223i(5, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.p
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30349T0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (q0Var2.f9331k != q0Var.f9331k) {
            this.f9138h.m22223i(6, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.q
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30347U0(C5216q0.this, i3, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (q0Var2.f9332l != q0Var.f9332l) {
            this.f9138h.m22223i(7, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.y
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30345V0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (m30366I0(q0Var2) != m30366I0(q0Var)) {
            this.f9138h.m22223i(8, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.z
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30344W0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (!q0Var2.f9333m.equals(q0Var.f9333m)) {
            this.f9138h.m22223i(13, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.a0
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30342X0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (z2) {
            this.f9138h.m22223i(-1, new C7553q.AbstractC7554a() { // from class: e7.h
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((Player.AbstractC5153a) obj).onSeekProcessed();
                }
            });
        }
        if (q0Var2.f9334n != q0Var.f9334n) {
            this.f9138h.m22223i(-1, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.b0
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30340Y0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        if (q0Var2.f9335o != q0Var.f9335o) {
            this.f9138h.m22223i(-1, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.c0
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30339Z0(C5216q0.this, (Player.AbstractC5153a) obj);
                }
            });
        }
        this.f9138h.m22227e();
    }

    /* renamed from: y0 */
    private List<C5210p0.C5213c> m30283y0(int i, List<AbstractC8299u> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C5210p0.C5213c cVar = new C5210p0.C5213c(list.get(i2), this.f9141k);
            arrayList.add(cVar);
            this.f9140j.add(i2 + i, new C5173a(cVar.f9314b, cVar.f9313a.m20043O()));
        }
        this.f9154x = this.f9154x.mo20030g(i, arrayList.size());
        return arrayList;
    }

    /* renamed from: z0 */
    private Timeline m30282z0() {
        return new C5222s0(this.f9140j, this.f9154x);
    }

    /* renamed from: A0 */
    public C5218r0 m30381A0(C5218r0.AbstractC5220b bVar) {
        return new C5218r0(this.f9137g, bVar, this.f9156z.f9321a, mo30311m(), this.f9146p, this.f9137g.m30264A());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public TrackSelectionArray mo30380B() {
        return new TrackSelectionArray(this.f9156z.f9328h.f5565c);
    }

    /* renamed from: C0 */
    public boolean m30378C0() {
        return this.f9156z.f9335o;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: D */
    public int mo30377D(int i) {
        return this.f9133c[i].mo24424d();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public Player.AbstractC5154b mo30375E() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public void mo30373F(int i, long j) {
        Timeline timeline = this.f9156z.f9321a;
        if (i < 0 || (!timeline.m30435q() && i >= timeline.mo20022p())) {
            throw new C6726m(timeline, i, j);
        }
        int i2 = 1;
        this.f9149s++;
        if (mo30333d()) {
            C7558r.m22104h("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C5181g0.C5186e eVar = new C5181g0.C5186e(this.f9156z);
            eVar.m30146b(1);
            this.f9136f.mo29459a(eVar);
            return;
        }
        if (mo30355P() != 1) {
            i2 = 2;
        }
        C5216q0 e1 = m30328e1(this.f9156z.m30025h(i2), timeline, m30372F0(timeline, i, j));
        this.f9137g.m30160w0(timeline, i, C6713c.m24566c(j));
        m30294s1(e1, true, 1, 0, 1, true);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public boolean mo30371G() {
        return this.f9156z.f9331k;
    }

    /* renamed from: G0 */
    public int m30370G0() {
        return this.f9133c.length;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public void mo30369H(final boolean z) {
        if (this.f9148r != z) {
            this.f9148r = z;
            this.f9137g.m30227S0(z);
            this.f9138h.m22220l(10, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.v
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((Player.AbstractC5153a) obj).onShuffleModeEnabledChanged(z);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public int mo30367I() {
        if (this.f9156z.f9321a.m30435q()) {
            return this.f37224B;
        }
        C5216q0 q0Var = this.f9156z;
        return q0Var.f9321a.mo20027b(q0Var.f9322b.f18059a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public void mo30364K(Player.AbstractC5153a aVar) {
        this.f9138h.m22229c(aVar);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: L */
    public int mo30362L() {
        if (mo30333d()) {
            return this.f9156z.f9322b.f18061c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public long mo30360M() {
        if (!mo30333d()) {
            return mo30341Y();
        }
        C5216q0 q0Var = this.f9156z;
        q0Var.f9321a.mo30409h(q0Var.f9322b.f18059a, this.f9139i);
        C5216q0 q0Var2 = this.f9156z;
        if (q0Var2.f9323c == -9223372036854775807L) {
            return q0Var2.f9321a.m30436n(mo30311m(), this.f9159a).m30417b();
        }
        return this.f9139i.m30423k() + C6713c.m24565d(this.f9156z.f9323c);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: O */
    public long mo30357O() {
        if (!mo30333d()) {
            return mo30343X();
        }
        C5216q0 q0Var = this.f9156z;
        if (q0Var.f9330j.equals(q0Var.f9322b)) {
            return C6713c.m24565d(this.f9156z.f9336p);
        }
        return getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public int mo30355P() {
        return this.f9156z.f9324d;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: R */
    public void mo30352R(final int i) {
        if (this.f9147q != i) {
            this.f9147q = i;
            this.f9137g.m30233P0(i);
            this.f9138h.m22220l(9, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.t
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((Player.AbstractC5153a) obj).onRepeatModeChanged(i);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: U */
    public int mo30348U() {
        return this.f9147q;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: V */
    public boolean mo30346V() {
        return this.f9148r;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: X */
    public long mo30343X() {
        if (this.f9156z.f9321a.m30435q()) {
            return this.f37225C;
        }
        C5216q0 q0Var = this.f9156z;
        if (q0Var.f9330j.f18062d != q0Var.f9322b.f18062d) {
            return q0Var.f9321a.m30436n(mo30311m(), this.f9159a).m30415d();
        }
        long j = q0Var.f9336p;
        if (this.f9156z.f9330j.m20020b()) {
            C5216q0 q0Var2 = this.f9156z;
            Timeline.C5160b h = q0Var2.f9321a.mo30409h(q0Var2.f9330j.f18059a, this.f9139i);
            long f = h.m30428f(this.f9156z.f9330j.f18060b);
            if (f == Long.MIN_VALUE) {
                j = h.f9085d;
            } else {
                j = f;
            }
        }
        return m30326f1(this.f9156z.f9330j, j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Y */
    public long mo30341Y() {
        if (this.f9156z.f9321a.m30435q()) {
            return this.f37225C;
        }
        if (this.f9156z.f9322b.m20020b()) {
            return C6713c.m24565d(this.f9156z.f9338r);
        }
        C5216q0 q0Var = this.f9156z;
        return m30326f1(q0Var.f9322b, q0Var.f9338r);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: b */
    public PlaybackParameters mo30337b() {
        return this.f9156z.f9333m;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public void mo30335c() {
        int i;
        C5216q0 q0Var = this.f9156z;
        if (q0Var.f9324d == 1) {
            C5216q0 f = q0Var.m30027f(null);
            if (f.f9321a.m30435q()) {
                i = 4;
            } else {
                i = 2;
            }
            C5216q0 h = f.m30025h(i);
            this.f9149s++;
            this.f9137g.m30202e0();
            m30294s1(h, false, 4, 1, 1, false);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public boolean mo30333d() {
        return this.f9156z.f9322b.m20020b();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public long mo30330e() {
        return C6713c.m24565d(this.f9156z.f9337q);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public List<C14576a> mo30325g() {
        return this.f9156z.f9329i;
    }

    /* renamed from: g1 */
    public void m30323g1() {
        C7558r.m22106f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.13.3] [" + C7557q0.f16372e + "] [" + C6720i.m24533b() + "]");
        if (!this.f9137g.m30196g0()) {
            this.f9138h.m22220l(11, new C7553q.AbstractC7554a() { // from class: com.google.android.exoplayer2.r
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    C5172d0.m30359M0((Player.AbstractC5153a) obj);
                }
            });
        }
        this.f9138h.m22222j();
        this.f9135e.mo22250f(null);
        C7030d1 d1Var = this.f9143m;
        if (d1Var != null) {
            this.f9145o.mo24343a(d1Var);
        }
        C5216q0 h = this.f9156z.m30025h(1);
        this.f9156z = h;
        C5216q0 b = h.m30031b(h.f9322b);
        this.f9156z = b;
        b.f9336p = b.f9338r;
        this.f9156z.f9337q = 0L;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        if (!mo30333d()) {
            return m30276a0();
        }
        C5216q0 q0Var = this.f9156z;
        AbstractC8299u.C8300a aVar = q0Var.f9322b;
        q0Var.f9321a.mo30409h(aVar.f18059a, this.f9139i);
        return C6713c.m24565d(this.f9139i.m30432b(aVar.f18060b, aVar.f18061c));
    }

    /* renamed from: j1 */
    public void m30317j1(AbstractC8299u uVar) {
        m30315k1(Collections.singletonList(uVar));
    }

    /* renamed from: k1 */
    public void m30315k1(List<AbstractC8299u> list) {
        m30309m1(list, true);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public void mo30314l(Player.AbstractC5153a aVar) {
        this.f9138h.m22221k(aVar);
    }

    /* renamed from: l1 */
    public void m30312l1(List<AbstractC8299u> list, int i, long j) {
        m30306n1(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public int mo30311m() {
        int D0 = m30376D0();
        if (D0 == -1) {
            return 0;
        }
        return D0;
    }

    /* renamed from: m1 */
    public void m30309m1(List<AbstractC8299u> list, boolean z) {
        m30306n1(list, -1, -9223372036854775807L, z);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public ExoPlaybackException mo30308n() {
        return this.f9156z.f9325e;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public void mo30305o(boolean z) {
        m30303o1(z, 0, 1);
    }

    /* renamed from: o1 */
    public void m30303o1(boolean z, int i, int i2) {
        C5216q0 q0Var = this.f9156z;
        if (q0Var.f9331k != z || q0Var.f9332l != i) {
            this.f9149s++;
            C5216q0 e = q0Var.m30028e(z, i);
            this.f9137g.m30241L0(z, i);
            m30294s1(e, false, 4, 0, i2, false);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: p */
    public Player.AbstractC5155c mo30302p() {
        return null;
    }

    /* renamed from: p1 */
    public void m30300p1(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.f9028d;
        }
        if (!this.f9156z.f9333m.equals(playbackParameters)) {
            C5216q0 g = this.f9156z.m30026g(playbackParameters);
            this.f9149s++;
            this.f9137g.m30237N0(playbackParameters);
            m30294s1(g, false, 4, 0, 1, false);
        }
    }

    /* renamed from: q1 */
    public void m30298q1(boolean z) {
        m30296r1(z, null);
    }

    /* renamed from: r1 */
    public void m30296r1(boolean z, ExoPlaybackException exoPlaybackException) {
        C5216q0 q0Var;
        if (z) {
            q0Var = m30321h1(0, this.f9140j.size()).m30027f(null);
        } else {
            C5216q0 q0Var2 = this.f9156z;
            q0Var = q0Var2.m30031b(q0Var2.f9322b);
            q0Var.f9336p = q0Var.f9338r;
            q0Var.f9337q = 0L;
        }
        C5216q0 h = q0Var.m30025h(1);
        if (exoPlaybackException != null) {
            h = h.m30027f(exoPlaybackException);
        }
        this.f9149s++;
        this.f9137g.m30204d1();
        m30294s1(h, false, 4, 0, 1, false);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public int mo30293t() {
        if (mo30333d()) {
            return this.f9156z.f9322b.f18060b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public int mo30291u() {
        return this.f9156z.f9332l;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public TrackGroupArray mo30289v() {
        return this.f9156z.f9327g;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public Timeline mo30287w() {
        return this.f9156z.f9321a;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: x */
    public Looper mo30285x() {
        return this.f9144n;
    }
}
