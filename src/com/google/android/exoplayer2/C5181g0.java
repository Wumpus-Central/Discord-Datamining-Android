package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import cc.AbstractC3884i0;
import com.google.android.exoplayer2.AbstractC5252t0;
import com.google.android.exoplayer2.C5190h;
import com.google.android.exoplayer2.C5210p0;
import com.google.android.exoplayer2.C5218r0;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p029b9.AbstractC3415h;
import p029b9.AbstractC3425m;
import p029b9.C3427n;
import p030bc.AbstractC3465n;
import p079e7.AbstractC6727n;
import p079e7.AbstractC6733t;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6734u;
import p079e7.C6736w;
import p081e9.AbstractC6769e;
import p098f7.C7030d1;
import p119g9.AbstractC7516c;
import p119g9.AbstractC7545m;
import p119g9.C7510a;
import p119g9.C7546m0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8285q0;
import p153i8.AbstractC8287r;
import p153i8.AbstractC8299u;
import p317r8.C12466m;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.g0 */
/* loaded from: classes7.dex */
public final class C5181g0 implements Handler.Callback, AbstractC8287r.AbstractC8288a, AbstractC3425m.AbstractC3426a, C5210p0.AbstractC5214d, C5190h.AbstractC5191a, C5218r0.AbstractC5219a {

    /* renamed from: A */
    private final AbstractC5187f f37226A;

    /* renamed from: B */
    private final C5204m0 f37227B;

    /* renamed from: C */
    private final C5210p0 f37228C;

    /* renamed from: D */
    private final AbstractC5192h0 f37229D;

    /* renamed from: E */
    private final long f37230E;

    /* renamed from: F */
    private C6736w f37231F;

    /* renamed from: G */
    private C5216q0 f37232G;

    /* renamed from: H */
    private C5186e f37233H;

    /* renamed from: I */
    private boolean f37234I;

    /* renamed from: J */
    private boolean f37235J;

    /* renamed from: K */
    private boolean f37236K;

    /* renamed from: L */
    private boolean f37237L;

    /* renamed from: M */
    private boolean f37238M;

    /* renamed from: N */
    private int f37239N;

    /* renamed from: O */
    private boolean f37240O;

    /* renamed from: P */
    private boolean f37241P;

    /* renamed from: Q */
    private boolean f37242Q;

    /* renamed from: R */
    private boolean f37243R;

    /* renamed from: S */
    private int f37244S;

    /* renamed from: T */
    private C5189h f37245T;

    /* renamed from: U */
    private long f37246U;

    /* renamed from: V */
    private int f37247V;

    /* renamed from: W */
    private boolean f37248W;

    /* renamed from: X */
    private ExoPlaybackException f37249X;

    /* renamed from: Y */
    private long f37250Y;

    /* renamed from: k */
    private final AbstractC5252t0[] f9192k;

    /* renamed from: l */
    private final AbstractC6733t[] f9193l;

    /* renamed from: m */
    private final AbstractC3425m f9194m;

    /* renamed from: n */
    private final C3427n f9195n;

    /* renamed from: o */
    private final AbstractC6727n f9196o;

    /* renamed from: p */
    private final AbstractC6769e f9197p;

    /* renamed from: q */
    private final AbstractC7545m f9198q;

    /* renamed from: r */
    private final HandlerThread f9199r;

    /* renamed from: s */
    private final Looper f9200s;

    /* renamed from: t */
    private final Timeline.C5161c f9201t;

    /* renamed from: u */
    private final Timeline.C5160b f9202u;

    /* renamed from: v */
    private final long f9203v;

    /* renamed from: w */
    private final boolean f9204w;

    /* renamed from: x */
    private final C5190h f9205x;

    /* renamed from: y */
    private final ArrayList<C5185d> f9206y;

    /* renamed from: z */
    private final AbstractC7516c f9207z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.g0$a */
    /* loaded from: classes7.dex */
    public class C5182a implements AbstractC5252t0.AbstractC5253a {
        C5182a() {
        }

        @Override // com.google.android.exoplayer2.AbstractC5252t0.AbstractC5253a
        /* renamed from: a */
        public void mo29830a() {
            C5181g0.this.f9198q.mo22248h(2);
        }

        @Override // com.google.android.exoplayer2.AbstractC5252t0.AbstractC5253a
        /* renamed from: b */
        public void mo29829b(long j) {
            if (j >= 2000) {
                C5181g0.this.f37242Q = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.g0$b */
    /* loaded from: classes7.dex */
    public static final class C5183b {

        /* renamed from: a */
        private final List<C5210p0.C5213c> f9209a;

        /* renamed from: b */
        private final AbstractC8285q0 f9210b;

        /* renamed from: c */
        private final int f9211c;

        /* renamed from: d */
        private final long f9212d;

        /* synthetic */ C5183b(List list, AbstractC8285q0 q0Var, int i, long j, C5182a aVar) {
            this(list, q0Var, i, j);
        }

        private C5183b(List<C5210p0.C5213c> list, AbstractC8285q0 q0Var, int i, long j) {
            this.f9209a = list;
            this.f9210b = q0Var;
            this.f9211c = i;
            this.f9212d = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.g0$c */
    /* loaded from: classes7.dex */
    public static class C5184c {

        /* renamed from: a */
        public final int f9213a;

        /* renamed from: b */
        public final int f9214b;

        /* renamed from: c */
        public final int f9215c;

        /* renamed from: d */
        public final AbstractC8285q0 f9216d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.g0$d */
    /* loaded from: classes7.dex */
    public static final class C5185d implements Comparable<C5185d> {

        /* renamed from: k */
        public final C5218r0 f9217k;

        /* renamed from: l */
        public int f9218l;

        /* renamed from: m */
        public long f9219m;

        /* renamed from: n */
        public Object f9220n;

        public C5185d(C5218r0 r0Var) {
            this.f9217k = r0Var;
        }

        /* renamed from: a */
        public int compareTo(C5185d dVar) {
            boolean z;
            boolean z2;
            Object obj = this.f9220n;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (dVar.f9220n == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (obj != null) {
                    return -1;
                }
                return 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i = this.f9218l - dVar.f9218l;
                if (i != 0) {
                    return i;
                }
                return C7557q0.m22133p(this.f9219m, dVar.f9219m);
            }
        }

        /* renamed from: b */
        public void m30148b(int i, long j, Object obj) {
            this.f9218l = i;
            this.f9219m = j;
            this.f9220n = obj;
        }
    }

    /* renamed from: com.google.android.exoplayer2.g0$e */
    /* loaded from: classes7.dex */
    public static final class C5186e {

        /* renamed from: a */
        private boolean f9221a;

        /* renamed from: b */
        public C5216q0 f9222b;

        /* renamed from: c */
        public int f9223c;

        /* renamed from: d */
        public boolean f9224d;

        /* renamed from: e */
        public int f9225e;

        /* renamed from: f */
        public boolean f9226f;

        /* renamed from: g */
        public int f9227g;

        public C5186e(C5216q0 q0Var) {
            this.f9222b = q0Var;
        }

        /* renamed from: b */
        public void m30146b(int i) {
            boolean z;
            boolean z2 = this.f9221a;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            this.f9221a = z2 | z;
            this.f9223c += i;
        }

        /* renamed from: c */
        public void m30145c(int i) {
            this.f9221a = true;
            this.f9226f = true;
            this.f9227g = i;
        }

        /* renamed from: d */
        public void m30144d(C5216q0 q0Var) {
            boolean z;
            boolean z2 = this.f9221a;
            if (this.f9222b != q0Var) {
                z = true;
            } else {
                z = false;
            }
            this.f9221a = z2 | z;
            this.f9222b = q0Var;
        }

        /* renamed from: e */
        public void m30143e(int i) {
            boolean z = true;
            if (!this.f9224d || this.f9225e == 4) {
                this.f9221a = true;
                this.f9224d = true;
                this.f9225e = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C7510a.m22371a(z);
        }
    }

    /* renamed from: com.google.android.exoplayer2.g0$f */
    /* loaded from: classes7.dex */
    public interface AbstractC5187f {
        /* renamed from: a */
        void mo29459a(C5186e eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.g0$g */
    /* loaded from: classes7.dex */
    public static final class C5188g {

        /* renamed from: a */
        public final AbstractC8299u.C8300a f9228a;

        /* renamed from: b */
        public final long f9229b;

        /* renamed from: c */
        public final long f9230c;

        /* renamed from: d */
        public final boolean f9231d;

        /* renamed from: e */
        public final boolean f9232e;

        /* renamed from: f */
        public final boolean f9233f;

        public C5188g(AbstractC8299u.C8300a aVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f9228a = aVar;
            this.f9229b = j;
            this.f9230c = j2;
            this.f9231d = z;
            this.f9232e = z2;
            this.f9233f = z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.g0$h */
    /* loaded from: classes7.dex */
    public static final class C5189h {

        /* renamed from: a */
        public final Timeline f9234a;

        /* renamed from: b */
        public final int f9235b;

        /* renamed from: c */
        public final long f9236c;

        public C5189h(Timeline timeline, int i, long j) {
            this.f9234a = timeline;
            this.f9235b = i;
            this.f9236c = j;
        }
    }

    public C5181g0(AbstractC5252t0[] t0VarArr, AbstractC3425m mVar, C3427n nVar, AbstractC6727n nVar2, AbstractC6769e eVar, int i, boolean z, C7030d1 d1Var, C6736w wVar, AbstractC5192h0 h0Var, long j, boolean z2, Looper looper, AbstractC7516c cVar, AbstractC5187f fVar) {
        this.f37226A = fVar;
        this.f9192k = t0VarArr;
        this.f9194m = mVar;
        this.f9195n = nVar;
        this.f9196o = nVar2;
        this.f9197p = eVar;
        this.f37239N = i;
        this.f37240O = z;
        this.f37231F = wVar;
        this.f37229D = h0Var;
        this.f37230E = j;
        this.f37250Y = j;
        this.f37235J = z2;
        this.f9207z = cVar;
        this.f9203v = nVar2.mo24457d();
        this.f9204w = nVar2.mo24459b();
        C5216q0 k = C5216q0.m30022k(nVar);
        this.f37232G = k;
        this.f37233H = new C5186e(k);
        this.f9193l = new AbstractC6733t[t0VarArr.length];
        for (int i2 = 0; i2 < t0VarArr.length; i2++) {
            t0VarArr[i2].setIndex(i2);
            this.f9193l[i2] = t0VarArr[i2].mo24576n();
        }
        this.f9205x = new C5190h(this, cVar);
        this.f9206y = new ArrayList<>();
        this.f9201t = new Timeline.C5161c();
        this.f9202u = new Timeline.C5160b();
        mVar.m34403b(this, eVar);
        this.f37248W = true;
        Handler handler = new Handler(looper);
        this.f37227B = new C5204m0(d1Var, handler);
        this.f37228C = new C5210p0(this, d1Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f9199r = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f9200s = looper2;
        this.f9198q = cVar.mo22291c(looper2, this);
    }

    /* renamed from: A0 */
    private long m30263A0(AbstractC8299u.C8300a aVar, long j, boolean z, boolean z2) {
        m30198f1();
        this.f37237L = false;
        if (z2 || this.f37232G.f9324d == 3) {
            m30221V0(2);
        }
        C5198j0 o = this.f37227B.m30079o();
        C5198j0 j0Var = o;
        while (j0Var != null && !aVar.equals(j0Var.f9253f.f9264a)) {
            j0Var = j0Var.m30119j();
        }
        if (z || o != j0Var || (j0Var != null && j0Var.m30103z(j) < 0)) {
            for (AbstractC5252t0 t0Var : this.f9192k) {
                m30178n(t0Var);
            }
            if (j0Var != null) {
                while (this.f37227B.m30079o() != j0Var) {
                    this.f37227B.m30092b();
                }
                this.f37227B.m30069y(j0Var);
                j0Var.m30105x(0L);
                m30171r();
            }
        }
        if (j0Var != null) {
            this.f37227B.m30069y(j0Var);
            if (!j0Var.f9251d) {
                j0Var.f9253f = j0Var.f9253f.m30101b(j);
            } else {
                long j2 = j0Var.f9253f.f9268e;
                if (j2 != -9223372036854775807L && j >= j2) {
                    j = Math.max(0L, j2 - 1);
                }
                if (j0Var.f9252e) {
                    long l = j0Var.f9248a.mo12470l(j);
                    j0Var.f9248a.mo12462u(l - this.f9203v, this.f9204w);
                    j = l;
                }
            }
            m30176o0(j);
            m30232Q();
        } else {
            this.f37227B.m30088f();
            m30176o0(j);
        }
        m30256E(false);
        this.f9198q.mo22248h(2);
        return j;
    }

    /* renamed from: B */
    private long m30262B() {
        return m30260C(this.f37232G.f9336p);
    }

    /* renamed from: B0 */
    private void m30261B0(C5218r0 r0Var) {
        if (r0Var.m30016e() == -9223372036854775807L) {
            m30259C0(r0Var);
        } else if (this.f37232G.f9321a.m30435q()) {
            this.f9206y.add(new C5185d(r0Var));
        } else {
            C5185d dVar = new C5185d(r0Var);
            Timeline timeline = this.f37232G.f9321a;
            if (m30172q0(dVar, timeline, timeline, this.f37239N, this.f37240O, this.f9201t, this.f9202u)) {
                this.f9206y.add(dVar);
                Collections.sort(this.f9206y);
                return;
            }
            r0Var.m30010k(false);
        }
    }

    /* renamed from: C */
    private long m30260C(long j) {
        C5198j0 j2 = this.f37227B.m30084j();
        if (j2 == null) {
            return 0L;
        }
        return Math.max(0L, j - j2.m30104y(this.f37246U));
    }

    /* renamed from: C0 */
    private void m30259C0(C5218r0 r0Var) {
        if (r0Var.m30018c() == this.f9200s) {
            m30181m(r0Var);
            int i = this.f37232G.f9324d;
            if (i == 3 || i == 2) {
                this.f9198q.mo22248h(2);
                return;
            }
            return;
        }
        this.f9198q.mo22251e(15, r0Var).sendToTarget();
    }

    /* renamed from: D */
    private void m30258D(AbstractC8287r rVar) {
        if (this.f37227B.m30073u(rVar)) {
            this.f37227B.m30070x(this.f37246U);
            m30232Q();
        }
    }

    /* renamed from: D0 */
    private void m30257D0(final C5218r0 r0Var) {
        Looper c = r0Var.m30018c();
        if (!c.getThread().isAlive()) {
            C7558r.m22104h("TAG", "Trying to send message on a dead thread.");
            r0Var.m30010k(false);
            return;
        }
        this.f9207z.mo22291c(c, null).mo22255a(new Runnable() { // from class: com.google.android.exoplayer2.f0
            @Override // java.lang.Runnable
            public final void run() {
                C5181g0.this.m30234P(r0Var);
            }
        });
    }

    /* renamed from: E */
    private void m30256E(boolean z) {
        AbstractC8299u.C8300a aVar;
        long j;
        C5198j0 j2 = this.f37227B.m30084j();
        if (j2 == null) {
            aVar = this.f37232G.f9322b;
        } else {
            aVar = j2.f9253f.f9264a;
        }
        boolean z2 = !this.f37232G.f9330j.equals(aVar);
        if (z2) {
            this.f37232G = this.f37232G.m30031b(aVar);
        }
        C5216q0 q0Var = this.f37232G;
        if (j2 == null) {
            j = q0Var.f9338r;
        } else {
            j = j2.m30120i();
        }
        q0Var.f9336p = j;
        this.f37232G.f9337q = m30262B();
        if ((z2 || z) && j2 != null && j2.f9251d) {
            m30190i1(j2.m30115n(), j2.m30114o());
        }
    }

    /* renamed from: E0 */
    private void m30255E0(long j) {
        AbstractC5252t0[] t0VarArr;
        for (AbstractC5252t0 t0Var : this.f9192k) {
            if (t0Var.mo24575s() != null) {
                m30253F0(t0Var, j);
            }
        }
    }

    /* renamed from: F */
    private void m30254F(Timeline timeline) {
        boolean z;
        C5189h hVar;
        Throwable th2;
        C5188g s0 = m30168s0(timeline, this.f37232G, this.f37245T, this.f37227B, this.f37239N, this.f37240O, this.f9201t, this.f9202u);
        AbstractC8299u.C8300a aVar = s0.f9228a;
        long j = s0.f9230c;
        boolean z2 = s0.f9231d;
        long j2 = s0.f9229b;
        if (!this.f37232G.f9322b.equals(aVar) || j2 != this.f37232G.f9338r) {
            z = true;
        } else {
            z = false;
        }
        long j3 = -9223372036854775807L;
        try {
            if (s0.f9232e) {
                if (this.f37232G.f9324d != 1) {
                    m30221V0(4);
                }
                m30180m0(false, false, false, true);
            }
            try {
                if (!z) {
                    if (!this.f37227B.m30096E(timeline, this.f37246U, m30157y())) {
                        m30158x0(false);
                    }
                } else if (!timeline.m30435q()) {
                    for (C5198j0 o = this.f37227B.m30079o(); o != null; o = o.m30119j()) {
                        if (o.f9253f.f9264a.equals(aVar)) {
                            o.f9253f = this.f37227B.m30077q(timeline, o.f9253f);
                        }
                    }
                    j2 = m30154z0(aVar, j2, z2);
                }
                C5216q0 q0Var = this.f37232G;
                Timeline timeline2 = q0Var.f9321a;
                AbstractC8299u.C8300a aVar2 = q0Var.f9322b;
                if (s0.f9233f) {
                    j3 = j2;
                }
                m30192h1(timeline, aVar, timeline2, aVar2, j3);
                if (z || j != this.f37232G.f9323c) {
                    this.f37232G = m30246J(aVar, j2, j);
                }
                m30177n0();
                m30170r0(timeline, this.f37232G.f9321a);
                this.f37232G = this.f37232G.m30023j(timeline);
                if (!timeline.m30435q()) {
                    this.f37245T = null;
                }
                m30256E(false);
            } catch (Throwable th3) {
                th2 = th3;
                hVar = null;
                C5216q0 q0Var2 = this.f37232G;
                Timeline timeline3 = q0Var2.f9321a;
                AbstractC8299u.C8300a aVar3 = q0Var2.f9322b;
                if (s0.f9233f) {
                    j3 = j2;
                }
                m30192h1(timeline, aVar, timeline3, aVar3, j3);
                if (z || j != this.f37232G.f9323c) {
                    this.f37232G = m30246J(aVar, j2, j);
                }
                m30177n0();
                m30170r0(timeline, this.f37232G.f9321a);
                this.f37232G = this.f37232G.m30023j(timeline);
                if (!timeline.m30435q()) {
                    this.f37245T = hVar;
                }
                m30256E(false);
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            hVar = null;
        }
    }

    /* renamed from: F0 */
    private void m30253F0(AbstractC5252t0 t0Var, long j) {
        t0Var.mo24581h();
        if (t0Var instanceof C12466m) {
            ((C12466m) t0Var).m6656U(j);
        }
    }

    /* renamed from: G */
    private void m30252G(AbstractC8287r rVar) {
        if (this.f37227B.m30073u(rVar)) {
            C5198j0 j = this.f37227B.m30084j();
            j.m30113p(this.f9205x.mo22090b().f9029a, this.f37232G.f9321a);
            m30190i1(j.m30115n(), j.m30114o());
            if (j == this.f37227B.m30079o()) {
                m30176o0(j.f9253f.f9265b);
                m30171r();
                C5216q0 q0Var = this.f37232G;
                this.f37232G = m30246J(q0Var.f9322b, j.f9253f.f9265b, q0Var.f9323c);
            }
            m30232Q();
        }
    }

    /* renamed from: G0 */
    private void m30251G0(boolean z, AtomicBoolean atomicBoolean) {
        AbstractC5252t0[] t0VarArr;
        if (this.f37241P != z) {
            this.f37241P = z;
            if (!z) {
                for (AbstractC5252t0 t0Var : this.f9192k) {
                    if (!m30240M(t0Var)) {
                        t0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: H */
    private void m30250H(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        AbstractC5252t0[] t0VarArr;
        if (z) {
            if (z2) {
                this.f37233H.m30146b(1);
            }
            this.f37232G = this.f37232G.m30026g(playbackParameters);
        }
        m30182l1(playbackParameters.f9029a);
        for (AbstractC5252t0 t0Var : this.f9192k) {
            if (t0Var != null) {
                t0Var.mo1032p(f, playbackParameters.f9029a);
            }
        }
    }

    /* renamed from: H0 */
    private void m30249H0(C5183b bVar) {
        this.f37233H.m30146b(1);
        if (bVar.f9211c != -1) {
            this.f37245T = new C5189h(new C5222s0(bVar.f9209a, bVar.f9210b), bVar.f9211c, bVar.f9212d);
        }
        m30254F(this.f37228C.m30065C(bVar.f9209a, bVar.f9210b));
    }

    /* renamed from: I */
    private void m30248I(PlaybackParameters playbackParameters, boolean z) {
        m30250H(playbackParameters, playbackParameters.f9029a, true, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    private C5216q0 m30246J(AbstractC8299u.C8300a aVar, long j, long j2) {
        boolean z;
        List list;
        C3427n nVar;
        TrackGroupArray trackGroupArray;
        TrackGroupArray trackGroupArray2;
        C3427n nVar2;
        if (this.f37248W || j != this.f37232G.f9338r || !aVar.equals(this.f37232G.f9322b)) {
            z = true;
        } else {
            z = false;
        }
        this.f37248W = z;
        m30177n0();
        C5216q0 q0Var = this.f37232G;
        TrackGroupArray trackGroupArray3 = q0Var.f9327g;
        C3427n nVar3 = q0Var.f9328h;
        List list2 = q0Var.f9329i;
        if (this.f37228C.m30045s()) {
            C5198j0 o = this.f37227B.m30079o();
            if (o == null) {
                trackGroupArray2 = TrackGroupArray.f9361n;
            } else {
                trackGroupArray2 = o.m30115n();
            }
            if (o == null) {
                nVar2 = this.f9195n;
            } else {
                nVar2 = o.m30114o();
            }
            List u = m30165u(nVar2.f5565c);
            if (o != null) {
                C5200k0 k0Var = o.f9253f;
                if (k0Var.f9266c != j2) {
                    o.f9253f = k0Var.m30102a(j2);
                }
            }
            trackGroupArray = trackGroupArray2;
            nVar = nVar2;
            list = u;
        } else if (!aVar.equals(this.f37232G.f9322b)) {
            TrackGroupArray trackGroupArray4 = TrackGroupArray.f9361n;
            trackGroupArray = trackGroupArray4;
            nVar = this.f9195n;
            list = AbstractC3884i0.m33399x();
        } else {
            list = list2;
            trackGroupArray = trackGroupArray3;
            nVar = nVar3;
        }
        return this.f37232G.m30030c(aVar, j, j2, m30262B(), trackGroupArray, nVar, list);
    }

    /* renamed from: J0 */
    private void m30245J0(boolean z) {
        if (z != this.f37243R) {
            this.f37243R = z;
            C5216q0 q0Var = this.f37232G;
            int i = q0Var.f9324d;
            if (z || i == 4 || i == 1) {
                this.f37232G = q0Var.m30029d(z);
            } else {
                this.f9198q.mo22248h(2);
            }
        }
    }

    /* renamed from: K */
    private boolean m30244K() {
        C5198j0 p = this.f37227B.m30078p();
        if (!p.f9251d) {
            return false;
        }
        int i = 0;
        while (true) {
            AbstractC5252t0[] t0VarArr = this.f9192k;
            if (i >= t0VarArr.length) {
                return true;
            }
            AbstractC5252t0 t0Var = t0VarArr[i];
            AbstractC8278o0 o0Var = p.f9250c[i];
            if (t0Var.mo24575s() != o0Var || (o0Var != null && !t0Var.mo24582g())) {
                break;
            }
            i++;
        }
        return false;
    }

    /* renamed from: K0 */
    private void m30243K0(boolean z) {
        this.f37235J = z;
        m30177n0();
        if (this.f37236K && this.f37227B.m30078p() != this.f37227B.m30079o()) {
            m30158x0(true);
            m30256E(false);
        }
    }

    /* renamed from: L */
    private boolean m30242L() {
        C5198j0 j = this.f37227B.m30084j();
        if (j == null || j.m30118k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private static boolean m30240M(AbstractC5252t0 t0Var) {
        return t0Var.getState() != 0;
    }

    /* renamed from: M0 */
    private void m30239M0(boolean z, int i, boolean z2, int i2) {
        this.f37233H.m30146b(z2 ? 1 : 0);
        this.f37233H.m30145c(i2);
        this.f37232G = this.f37232G.m30028e(z, i);
        this.f37237L = false;
        m30209b0(z);
        if (!m30215Y0()) {
            m30198f1();
            m30185k1();
            return;
        }
        int i3 = this.f37232G.f9324d;
        if (i3 == 3) {
            m30206c1();
            this.f9198q.mo22248h(2);
        } else if (i3 == 2) {
            this.f9198q.mo22248h(2);
        }
    }

    /* renamed from: N */
    private boolean m30238N() {
        C5198j0 o = this.f37227B.m30079o();
        long j = o.f9253f.f9268e;
        if (!o.f9251d || (j != -9223372036854775807L && this.f37232G.f9338r >= j && m30215Y0())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ Boolean m30236O() {
        return Boolean.valueOf(this.f37234I);
    }

    /* renamed from: O0 */
    private void m30235O0(PlaybackParameters playbackParameters) {
        this.f9205x.mo22089f(playbackParameters);
        m30248I(this.f9205x.mo22090b(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m30234P(C5218r0 r0Var) {
        try {
            m30181m(r0Var);
        } catch (ExoPlaybackException e) {
            C7558r.m22108d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: Q */
    private void m30232Q() {
        boolean X0 = m30217X0();
        this.f37238M = X0;
        if (X0) {
            this.f37227B.m30084j().m30125d(this.f37246U);
        }
        m30195g1();
    }

    /* renamed from: Q0 */
    private void m30231Q0(int i) {
        this.f37239N = i;
        if (!this.f37227B.m30095F(this.f37232G.f9321a, i)) {
            m30158x0(true);
        }
        m30256E(false);
    }

    /* renamed from: R */
    private void m30230R() {
        this.f37233H.m30144d(this.f37232G);
        if (this.f37233H.f9221a) {
            this.f37226A.mo29459a(this.f37233H);
            this.f37233H = new C5186e(this.f37232G);
        }
    }

    /* renamed from: R0 */
    private void m30229R0(C6736w wVar) {
        this.f37231F = wVar;
    }

    /* renamed from: S */
    private boolean m30228S(long j, long j2) {
        if (this.f37243R && this.f37242Q) {
            return false;
        }
        m30162v0(j, j2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[LOOP:1: B:26:0x0074->B:36:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0044 -> B:13:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:26:0x0074). Please submit an issue!!! */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30226T(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C5181g0.m30226T(long, long):void");
    }

    /* renamed from: T0 */
    private void m30225T0(boolean z) {
        this.f37240O = z;
        if (!this.f37227B.m30094G(this.f37232G.f9321a, z)) {
            m30158x0(true);
        }
        m30256E(false);
    }

    /* renamed from: U */
    private void m30224U() {
        C5200k0 n;
        this.f37227B.m30070x(this.f37246U);
        if (this.f37227B.m30098C() && (n = this.f37227B.m30080n(this.f37246U, this.f37232G)) != null) {
            C5198j0 g = this.f37227B.m30087g(this.f9193l, this.f9194m, this.f9196o.mo24455f(), this.f37228C, n, this.f9195n);
            g.f9248a.mo12469m(this, n.f9265b);
            if (this.f37227B.m30079o() == g) {
                m30176o0(g.m30116m());
            }
            m30256E(false);
        }
        if (this.f37238M) {
            this.f37238M = m30242L();
            m30195g1();
            return;
        }
        m30232Q();
    }

    /* renamed from: U0 */
    private void m30223U0(AbstractC8285q0 q0Var) {
        this.f37233H.m30146b(1);
        m30254F(this.f37228C.m30064D(q0Var));
    }

    /* renamed from: V */
    private void m30222V() {
        int i;
        boolean z = false;
        while (m30219W0()) {
            if (z) {
                m30230R();
            }
            C5198j0 o = this.f37227B.m30079o();
            C5198j0 b = this.f37227B.m30092b();
            C5200k0 k0Var = b.f9253f;
            this.f37232G = m30246J(k0Var.f9264a, k0Var.f9265b, k0Var.f9266c);
            if (o.f9253f.f9269f) {
                i = 0;
            } else {
                i = 3;
            }
            this.f37233H.m30143e(i);
            Timeline timeline = this.f37232G.f9321a;
            m30192h1(timeline, b.f9253f.f9264a, timeline, o.f9253f.f9264a, -9223372036854775807L);
            m30177n0();
            m30185k1();
            z = true;
        }
    }

    /* renamed from: V0 */
    private void m30221V0(int i) {
        C5216q0 q0Var = this.f37232G;
        if (q0Var.f9324d != i) {
            this.f37232G = q0Var.m30025h(i);
        }
    }

    /* renamed from: W */
    private void m30220W() {
        long j;
        boolean z;
        C5198j0 p = this.f37227B.m30078p();
        if (p != null) {
            int i = 0;
            if (p.m30119j() == null || this.f37236K) {
                if (p.f9253f.f9271h || this.f37236K) {
                    while (true) {
                        AbstractC5252t0[] t0VarArr = this.f9192k;
                        if (i < t0VarArr.length) {
                            AbstractC5252t0 t0Var = t0VarArr[i];
                            AbstractC8278o0 o0Var = p.f9250c[i];
                            if (o0Var != null && t0Var.mo24575s() == o0Var && t0Var.mo24582g()) {
                                long j2 = p.f9253f.f9268e;
                                if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
                                    j = -9223372036854775807L;
                                } else {
                                    j = p.m30117l() + p.f9253f.f9268e;
                                }
                                m30253F0(t0Var, j);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (m30244K()) {
                if (p.m30119j().f9251d || this.f37246U >= p.m30119j().m30116m()) {
                    C3427n o = p.m30114o();
                    C5198j0 c = this.f37227B.m30091c();
                    C3427n o2 = c.m30114o();
                    if (!c.f9251d || c.f9248a.mo12468n() == -9223372036854775807L) {
                        for (int i2 = 0; i2 < this.f9192k.length; i2++) {
                            boolean c2 = o.m34397c(i2);
                            boolean c3 = o2.m34397c(i2);
                            if (c2 && !this.f9192k[i2].mo24579k()) {
                                if (this.f9193l[i2].mo24424d() == 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C6734u uVar = o.f5564b[i2];
                                C6734u uVar2 = o2.f5564b[i2];
                                if (!c3 || !uVar2.equals(uVar) || z) {
                                    m30253F0(this.f9192k[i2], c.m30116m());
                                }
                            }
                        }
                        return;
                    }
                    m30255E0(c.m30116m());
                }
            }
        }
    }

    /* renamed from: W0 */
    private boolean m30219W0() {
        C5198j0 o;
        C5198j0 j;
        if (m30215Y0() && !this.f37236K && (o = this.f37227B.m30079o()) != null && (j = o.m30119j()) != null && this.f37246U >= j.m30116m() && j.f9254g) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private void m30218X() {
        C5198j0 p = this.f37227B.m30078p();
        if (p != null && this.f37227B.m30079o() != p && !p.f9254g && m30186k0()) {
            m30171r();
        }
    }

    /* renamed from: X0 */
    private boolean m30217X0() {
        long j;
        if (!m30242L()) {
            return false;
        }
        C5198j0 j2 = this.f37227B.m30084j();
        long C = m30260C(j2.m30118k());
        if (j2 == this.f37227B.m30079o()) {
            j = j2.m30104y(this.f37246U);
        } else {
            j = j2.m30104y(this.f37246U) - j2.f9253f.f9265b;
        }
        return this.f9196o.mo24452i(j, C, this.f9205x.mo22090b().f9029a);
    }

    /* renamed from: Y */
    private void m30216Y() {
        m30254F(this.f37228C.m30055i());
    }

    /* renamed from: Y0 */
    private boolean m30215Y0() {
        C5216q0 q0Var = this.f37232G;
        return q0Var.f9331k && q0Var.f9332l == 0;
    }

    /* renamed from: Z */
    private void m30214Z(C5184c cVar) {
        this.f37233H.m30146b(1);
        m30254F(this.f37228C.m30042v(cVar.f9213a, cVar.f9214b, cVar.f9215c, cVar.f9216d));
    }

    /* renamed from: Z0 */
    private boolean m30213Z0(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        if (this.f37244S == 0) {
            return m30238N();
        }
        if (!z) {
            return false;
        }
        C5216q0 q0Var = this.f37232G;
        if (!q0Var.f9326f) {
            return true;
        }
        if (m30211a1(q0Var.f9321a, this.f37227B.m30079o().f9253f.f9264a)) {
            j = this.f37229D.mo30132c();
        } else {
            j = -9223372036854775807L;
        }
        C5198j0 j2 = this.f37227B.m30084j();
        if (!j2.m30112q() || !j2.f9253f.f9271h) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!j2.f9253f.f9264a.m20020b() || j2.f9251d) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 || z3 || this.f9196o.mo24456e(m30262B(), this.f9205x.mo22090b().f9029a, this.f37237L, j)) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private void m30212a0() {
        AbstractC3415h[] hVarArr;
        for (C5198j0 o = this.f37227B.m30079o(); o != null; o = o.m30119j()) {
            for (AbstractC3415h hVar : o.m30114o().f5565c) {
                if (hVar != null) {
                    hVar.mo34433h();
                }
            }
        }
    }

    /* renamed from: a1 */
    private boolean m30211a1(Timeline timeline, AbstractC8299u.C8300a aVar) {
        if (aVar.m20020b() || timeline.m30435q()) {
            return false;
        }
        timeline.m30436n(timeline.mo30409h(aVar.f18059a, this.f9202u).f9084c, this.f9201t);
        if (!this.f9201t.m30413f()) {
            return false;
        }
        Timeline.C5161c cVar = this.f9201t;
        if (!cVar.f9098i || cVar.f9095f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    private void m30209b0(boolean z) {
        AbstractC3415h[] hVarArr;
        for (C5198j0 o = this.f37227B.m30079o(); o != null; o = o.m30119j()) {
            for (AbstractC3415h hVar : o.m30114o().f5565c) {
                if (hVar != null) {
                    hVar.mo34431m(z);
                }
            }
        }
    }

    /* renamed from: b1 */
    private static boolean m30208b1(C5216q0 q0Var, Timeline.C5160b bVar, Timeline.C5161c cVar) {
        AbstractC8299u.C8300a aVar = q0Var.f9322b;
        Timeline timeline = q0Var.f9321a;
        if (aVar.m20020b() || timeline.m30435q() || timeline.m30436n(timeline.mo30409h(aVar.f18059a, bVar).f9084c, cVar).f9101l) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private void m30207c0() {
        AbstractC3415h[] hVarArr;
        for (C5198j0 o = this.f37227B.m30079o(); o != null; o = o.m30119j()) {
            for (AbstractC3415h hVar : o.m30114o().f5565c) {
                if (hVar != null) {
                    hVar.mo34427r();
                }
            }
        }
    }

    /* renamed from: c1 */
    private void m30206c1() {
        AbstractC5252t0[] t0VarArr;
        this.f37237L = false;
        this.f9205x.m30138g();
        for (AbstractC5252t0 t0Var : this.f9192k) {
            if (m30240M(t0Var)) {
                t0Var.start();
            }
        }
    }

    /* renamed from: e1 */
    private void m30201e1(boolean z, boolean z2) {
        boolean z3;
        if (z || !this.f37241P) {
            z3 = true;
        } else {
            z3 = false;
        }
        m30180m0(z3, false, true, false);
        this.f37233H.m30146b(z2 ? 1 : 0);
        this.f9196o.mo24454g();
        m30221V0(1);
    }

    /* renamed from: f0 */
    private void m30199f0() {
        int i;
        this.f37233H.m30146b(1);
        m30180m0(false, false, false, true);
        this.f9196o.mo24460a();
        if (this.f37232G.f9321a.m30435q()) {
            i = 4;
        } else {
            i = 2;
        }
        m30221V0(i);
        this.f37228C.m30041w(this.f9197p.mo24342c());
        this.f9198q.mo22248h(2);
    }

    /* renamed from: f1 */
    private void m30198f1() {
        AbstractC5252t0[] t0VarArr;
        this.f9205x.m30137h();
        for (AbstractC5252t0 t0Var : this.f9192k) {
            if (m30240M(t0Var)) {
                m30167t(t0Var);
            }
        }
    }

    /* renamed from: g1 */
    private void m30195g1() {
        boolean z;
        C5198j0 j = this.f37227B.m30084j();
        if (this.f37238M || (j != null && j.f9248a.mo12419c())) {
            z = true;
        } else {
            z = false;
        }
        C5216q0 q0Var = this.f37232G;
        if (z != q0Var.f9326f) {
            this.f37232G = q0Var.m30032a(z);
        }
    }

    /* renamed from: h0 */
    private void m30193h0() {
        m30180m0(true, false, true, false);
        this.f9196o.mo24453h();
        m30221V0(1);
        this.f9199r.quit();
        synchronized (this) {
            this.f37234I = true;
            notifyAll();
        }
    }

    /* renamed from: h1 */
    private void m30192h1(Timeline timeline, AbstractC8299u.C8300a aVar, Timeline timeline2, AbstractC8299u.C8300a aVar2, long j) {
        Object obj;
        if (timeline.m30435q() || !m30211a1(timeline, aVar)) {
            float f = this.f9205x.mo22090b().f9029a;
            PlaybackParameters playbackParameters = this.f37232G.f9333m;
            if (f != playbackParameters.f9029a) {
                this.f9205x.mo22089f(playbackParameters);
                return;
            }
            return;
        }
        timeline.m30436n(timeline.mo30409h(aVar.f18059a, this.f9202u).f9084c, this.f9201t);
        this.f37229D.mo30134a((MediaItem.C5150f) C7557q0.m22145j(this.f9201t.f9100k));
        if (j != -9223372036854775807L) {
            this.f37229D.mo30130e(m30159x(timeline, aVar.f18059a, j));
            return;
        }
        Object obj2 = this.f9201t.f9090a;
        if (!timeline2.m30435q()) {
            obj = timeline2.m30436n(timeline2.mo30409h(aVar2.f18059a, this.f9202u).f9084c, this.f9201t).f9090a;
        } else {
            obj = null;
        }
        if (!C7557q0.m22159c(obj, obj2)) {
            this.f37229D.mo30130e(-9223372036854775807L);
        }
    }

    /* renamed from: i0 */
    private void m30191i0(int i, int i2, AbstractC8285q0 q0Var) {
        this.f37233H.m30146b(1);
        m30254F(this.f37228C.m30067A(i, i2, q0Var));
    }

    /* renamed from: i1 */
    private void m30190i1(TrackGroupArray trackGroupArray, C3427n nVar) {
        this.f9196o.mo24458c(this.f9192k, trackGroupArray, nVar.f5565c);
    }

    /* renamed from: j1 */
    private void m30188j1() {
        if (!this.f37232G.f9321a.m30435q() && this.f37228C.m30045s()) {
            m30224U();
            m30220W();
            m30218X();
            m30222V();
        }
    }

    /* renamed from: k */
    private void m30187k(C5183b bVar, int i) {
        this.f37233H.m30146b(1);
        C5210p0 p0Var = this.f37228C;
        if (i == -1) {
            i = p0Var.m30047q();
        }
        m30254F(p0Var.m30058f(i, bVar.f9209a, bVar.f9210b));
    }

    /* renamed from: k0 */
    private boolean m30186k0() {
        boolean z;
        C5198j0 p = this.f37227B.m30078p();
        C3427n o = p.m30114o();
        int i = 0;
        boolean z2 = false;
        while (true) {
            AbstractC5252t0[] t0VarArr = this.f9192k;
            if (i >= t0VarArr.length) {
                return !z2;
            }
            AbstractC5252t0 t0Var = t0VarArr[i];
            if (m30240M(t0Var)) {
                if (t0Var.mo24575s() != p.f9250c[i]) {
                    z = true;
                } else {
                    z = false;
                }
                if (!o.m34397c(i) || z) {
                    if (!t0Var.mo24579k()) {
                        t0Var.mo24577m(m30161w(o.f5565c[i]), p.f9250c[i], p.m30116m(), p.m30117l());
                    } else if (t0Var.mo165c()) {
                        m30178n(t0Var);
                    } else {
                        z2 = true;
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: k1 */
    private void m30185k1() {
        long j;
        boolean z;
        C5198j0 o = this.f37227B.m30079o();
        if (o != null) {
            if (o.f9251d) {
                j = o.f9248a.mo12468n();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                m30176o0(j);
                if (j != this.f37232G.f9338r) {
                    C5216q0 q0Var = this.f37232G;
                    this.f37232G = m30246J(q0Var.f9322b, j, q0Var.f9323c);
                    this.f37233H.m30143e(4);
                }
            } else {
                C5190h hVar = this.f9205x;
                if (o != this.f37227B.m30078p()) {
                    z = true;
                } else {
                    z = false;
                }
                long i = hVar.m30136i(z);
                this.f37246U = i;
                long y = o.m30104y(i);
                m30226T(this.f37232G.f9338r, y);
                this.f37232G.f9338r = y;
            }
            this.f37232G.f9336p = this.f37227B.m30084j().m30120i();
            this.f37232G.f9337q = m30262B();
            C5216q0 q0Var2 = this.f37232G;
            if (q0Var2.f9331k && q0Var2.f9324d == 3 && m30211a1(q0Var2.f9321a, q0Var2.f9322b) && this.f37232G.f9333m.f9029a == 1.0f) {
                float b = this.f37229D.mo30133b(m30163v(), m30262B());
                if (this.f9205x.mo22090b().f9029a != b) {
                    this.f9205x.mo22089f(this.f37232G.f9333m.m30539b(b));
                    m30250H(this.f37232G.f9333m, this.f9205x.mo22090b().f9029a, false, false);
                }
            }
        }
    }

    /* renamed from: l */
    private void m30184l(ExoPlaybackException exoPlaybackException) {
        boolean z;
        if (!exoPlaybackException.f8960r || exoPlaybackException.f8953k != 1) {
            z = false;
        } else {
            z = true;
        }
        C7510a.m22371a(z);
        try {
            m30158x0(true);
        } catch (Exception e) {
            exoPlaybackException.addSuppressed(e);
            throw exoPlaybackException;
        }
    }

    /* renamed from: l0 */
    private void m30183l0() {
        float f = this.f9205x.mo22090b().f9029a;
        C5198j0 p = this.f37227B.m30078p();
        boolean z = true;
        for (C5198j0 o = this.f37227B.m30079o(); o != null && o.f9251d; o = o.m30119j()) {
            C3427n v = o.m30107v(f, this.f37232G.f9321a);
            int i = 0;
            if (!v.m34399a(o.m30114o())) {
                if (z) {
                    C5198j0 o2 = this.f37227B.m30079o();
                    boolean y = this.f37227B.m30069y(o2);
                    boolean[] zArr = new boolean[this.f9192k.length];
                    long b = o2.m30127b(v, this.f37232G.f9338r, y, zArr);
                    C5216q0 q0Var = this.f37232G;
                    C5216q0 J = m30246J(q0Var.f9322b, b, q0Var.f9323c);
                    this.f37232G = J;
                    if (!(J.f9324d == 4 || b == J.f9338r)) {
                        this.f37233H.m30143e(4);
                        m30176o0(b);
                    }
                    boolean[] zArr2 = new boolean[this.f9192k.length];
                    while (true) {
                        AbstractC5252t0[] t0VarArr = this.f9192k;
                        if (i >= t0VarArr.length) {
                            break;
                        }
                        AbstractC5252t0 t0Var = t0VarArr[i];
                        boolean M = m30240M(t0Var);
                        zArr2[i] = M;
                        AbstractC8278o0 o0Var = o2.f9250c[i];
                        if (M) {
                            if (o0Var != t0Var.mo24575s()) {
                                m30178n(t0Var);
                            } else if (zArr[i]) {
                                t0Var.mo24573u(this.f37246U);
                            }
                        }
                        i++;
                    }
                    m30169s(zArr2);
                } else {
                    this.f37227B.m30069y(o);
                    if (o.f9251d) {
                        o.m30128a(v, Math.max(o.f9253f.f9265b, o.m30104y(this.f37246U)), false);
                    }
                }
                m30256E(true);
                if (this.f37232G.f9324d != 4) {
                    m30232Q();
                    m30185k1();
                    this.f9198q.mo22248h(2);
                    return;
                }
                return;
            }
            if (o == p) {
                z = false;
            }
        }
    }

    /* renamed from: l1 */
    private void m30182l1(float f) {
        AbstractC3415h[] hVarArr;
        for (C5198j0 o = this.f37227B.m30079o(); o != null; o = o.m30119j()) {
            for (AbstractC3415h hVar : o.m30114o().f5565c) {
                if (hVar != null) {
                    hVar.mo34434f(f);
                }
            }
        }
    }

    /* renamed from: m */
    private void m30181m(C5218r0 r0Var) {
        if (!r0Var.m30011j()) {
            try {
                r0Var.m30015f().mo19982i(r0Var.m30013h(), r0Var.m30017d());
            } finally {
                r0Var.m30010k(true);
            }
        }
    }

    /* renamed from: m0 */
    private void m30180m0(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        AbstractC8299u.C8300a aVar;
        long j3;
        boolean z5;
        ExoPlaybackException exoPlaybackException;
        TrackGroupArray trackGroupArray;
        C3427n nVar;
        List list;
        this.f9198q.mo22246j(2);
        this.f37237L = false;
        this.f9205x.m30137h();
        this.f37246U = 0L;
        for (AbstractC5252t0 t0Var : this.f9192k) {
            try {
                m30178n(t0Var);
            } catch (ExoPlaybackException | RuntimeException e) {
                C7558r.m22108d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        if (z) {
            for (AbstractC5252t0 t0Var2 : this.f9192k) {
                try {
                    t0Var2.reset();
                } catch (RuntimeException e2) {
                    C7558r.m22108d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.f37244S = 0;
        C5216q0 q0Var = this.f37232G;
        AbstractC8299u.C8300a aVar2 = q0Var.f9322b;
        long j4 = q0Var.f9338r;
        if (m30208b1(this.f37232G, this.f9202u, this.f9201t)) {
            j = this.f37232G.f9323c;
        } else {
            j = this.f37232G.f9338r;
        }
        if (z2) {
            this.f37245T = null;
            Pair<AbstractC8299u.C8300a, Long> z6 = m30155z(this.f37232G.f9321a);
            AbstractC8299u.C8300a aVar3 = (AbstractC8299u.C8300a) z6.first;
            long longValue = ((Long) z6.second).longValue();
            if (!aVar3.equals(this.f37232G.f9322b)) {
                z5 = true;
            } else {
                z5 = false;
            }
            aVar = aVar3;
            j2 = longValue;
            j3 = -9223372036854775807L;
        } else {
            aVar = aVar2;
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.f37227B.m30088f();
        this.f37238M = false;
        C5216q0 q0Var2 = this.f37232G;
        Timeline timeline = q0Var2.f9321a;
        int i = q0Var2.f9324d;
        if (z4) {
            exoPlaybackException = null;
        } else {
            exoPlaybackException = q0Var2.f9325e;
        }
        if (z5) {
            trackGroupArray = TrackGroupArray.f9361n;
        } else {
            trackGroupArray = q0Var2.f9327g;
        }
        if (z5) {
            nVar = this.f9195n;
        } else {
            nVar = q0Var2.f9328h;
        }
        if (z5) {
            list = AbstractC3884i0.m33399x();
        } else {
            list = q0Var2.f9329i;
        }
        C5216q0 q0Var3 = this.f37232G;
        this.f37232G = new C5216q0(timeline, aVar, j3, i, exoPlaybackException, false, trackGroupArray, nVar, list, aVar, q0Var3.f9331k, q0Var3.f9332l, q0Var3.f9333m, j2, 0L, j2, this.f37243R, false);
        if (z3) {
            this.f37228C.m30039y();
        }
        this.f37249X = null;
    }

    /* renamed from: m1 */
    private synchronized void m30179m1(AbstractC3465n<Boolean> nVar, long j) {
        long b = this.f9207z.mo22292b() + j;
        boolean z = false;
        while (!nVar.get().booleanValue() && j > 0) {
            try {
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = b - this.f9207z.mo22292b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: n */
    private void m30178n(AbstractC5252t0 t0Var) {
        if (m30240M(t0Var)) {
            this.f9205x.m30142a(t0Var);
            m30167t(t0Var);
            t0Var.disable();
            this.f37244S--;
        }
    }

    /* renamed from: n0 */
    private void m30177n0() {
        boolean z;
        C5198j0 o = this.f37227B.m30079o();
        if (o == null || !o.f9253f.f9270g || !this.f37235J) {
            z = false;
        } else {
            z = true;
        }
        this.f37236K = z;
    }

    /* renamed from: o0 */
    private void m30176o0(long j) {
        AbstractC5252t0[] t0VarArr;
        C5198j0 o = this.f37227B.m30079o();
        if (o != null) {
            j = o.m30103z(j);
        }
        this.f37246U = j;
        this.f9205x.m30140d(j);
        for (AbstractC5252t0 t0Var : this.f9192k) {
            if (m30240M(t0Var)) {
                t0Var.mo24573u(this.f37246U);
            }
        }
        m30212a0();
    }

    /* renamed from: p */
    private void m30175p() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        boolean z6;
        boolean z7;
        long a = this.f9207z.mo22293a();
        m30188j1();
        int i2 = this.f37232G.f9324d;
        if (i2 == 1 || i2 == 4) {
            this.f9198q.mo22246j(2);
            return;
        }
        C5198j0 o = this.f37227B.m30079o();
        if (o == null) {
            m30162v0(a, 10L);
            return;
        }
        C7546m0.m22245a("doSomeWork");
        m30185k1();
        if (o.f9251d) {
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            o.f9248a.mo12462u(this.f37232G.f9338r - this.f9203v, this.f9204w);
            z2 = true;
            z = true;
            int i3 = 0;
            while (true) {
                AbstractC5252t0[] t0VarArr = this.f9192k;
                if (i3 >= t0VarArr.length) {
                    break;
                }
                AbstractC5252t0 t0Var = t0VarArr[i3];
                if (m30240M(t0Var)) {
                    t0Var.mo163r(this.f37246U, elapsedRealtime);
                    if (!z2 || !t0Var.mo165c()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (o.f9250c[i3] != t0Var.mo24575s()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 || !t0Var.mo24582g()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z5 || z6 || t0Var.mo164e() || t0Var.mo165c()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (!z || !z7) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z7) {
                        t0Var.mo24580j();
                    }
                }
                i3++;
            }
        } else {
            o.f9248a.mo12465r();
            z2 = true;
            z = true;
        }
        long j = o.f9253f.f9268e;
        if (!z2 || !o.f9251d || (j != -9223372036854775807L && j > this.f37232G.f9338r)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 && this.f37236K) {
            this.f37236K = false;
            m30239M0(false, this.f37232G.f9332l, false, 5);
        }
        if (z3 && o.f9253f.f9271h) {
            m30221V0(4);
            m30198f1();
        } else if (this.f37232G.f9324d == 2 && m30213Z0(z)) {
            m30221V0(3);
            this.f37249X = null;
            if (m30215Y0()) {
                m30206c1();
            }
        } else if (this.f37232G.f9324d == 3 && (this.f37244S != 0 ? !z : !m30238N())) {
            this.f37237L = m30215Y0();
            m30221V0(2);
            if (this.f37237L) {
                m30207c0();
                this.f37229D.mo30131d();
            }
            m30198f1();
        }
        if (this.f37232G.f9324d == 2) {
            int i4 = 0;
            while (true) {
                AbstractC5252t0[] t0VarArr2 = this.f9192k;
                if (i4 >= t0VarArr2.length) {
                    break;
                }
                if (m30240M(t0VarArr2[i4]) && this.f9192k[i4].mo24575s() == o.f9250c[i4]) {
                    this.f9192k[i4].mo24580j();
                }
                i4++;
            }
            C5216q0 q0Var = this.f37232G;
            if (!q0Var.f9326f && q0Var.f9337q < 500000 && m30242L()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z8 = this.f37243R;
        C5216q0 q0Var2 = this.f37232G;
        if (z8 != q0Var2.f9334n) {
            this.f37232G = q0Var2.m30029d(z8);
        }
        if ((!m30215Y0() || this.f37232G.f9324d != 3) && (i = this.f37232G.f9324d) != 2) {
            if (this.f37244S == 0 || i == 4) {
                this.f9198q.mo22246j(2);
            } else {
                m30162v0(a, 1000L);
            }
            z4 = false;
        } else {
            z4 = !m30228S(a, 10L);
        }
        C5216q0 q0Var3 = this.f37232G;
        if (q0Var3.f9335o != z4) {
            this.f37232G = q0Var3.m30024i(z4);
        }
        this.f37242Q = false;
        C7546m0.m22243c();
    }

    /* renamed from: p0 */
    private static void m30174p0(Timeline timeline, C5185d dVar, Timeline.C5161c cVar, Timeline.C5160b bVar) {
        long j;
        int i = timeline.m30436n(timeline.mo30409h(dVar.f9220n, bVar).f9084c, cVar).f9103n;
        Object obj = timeline.mo20026g(i, bVar, true).f9083b;
        long j2 = bVar.f9085d;
        if (j2 != -9223372036854775807L) {
            j = j2 - 1;
        } else {
            j = Long.MAX_VALUE;
        }
        dVar.m30148b(i, j, obj);
    }

    /* renamed from: q */
    private void m30173q(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractC5252t0 t0Var = this.f9192k[i];
        if (!m30240M(t0Var)) {
            C5198j0 p = this.f37227B.m30078p();
            if (p == this.f37227B.m30079o()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C3427n o = p.m30114o();
            C6734u uVar = o.f5564b[i];
            C6722k[] w = m30161w(o.f5565c[i]);
            if (!m30215Y0() || this.f37232G.f9324d != 3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || !z3) {
                z4 = false;
            } else {
                z4 = true;
            }
            this.f37244S++;
            t0Var.mo24578l(uVar, w, p.f9250c[i], this.f37246U, z4, z2, p.m30116m(), p.m30117l());
            t0Var.mo19982i(103, new C5182a());
            this.f9205x.m30141c(t0Var);
            if (z3) {
                t0Var.start();
            }
        }
    }

    /* renamed from: q0 */
    private static boolean m30172q0(C5185d dVar, Timeline timeline, Timeline timeline2, int i, boolean z, Timeline.C5161c cVar, Timeline.C5160b bVar) {
        long j;
        Object obj = dVar.f9220n;
        if (obj == null) {
            if (dVar.f9217k.m30016e() == Long.MIN_VALUE) {
                j = -9223372036854775807L;
            } else {
                j = C6713c.m24566c(dVar.f9217k.m30016e());
            }
            Pair<Object, Long> t0 = m30166t0(timeline, new C5189h(dVar.f9217k.m30014g(), dVar.f9217k.m30012i(), j), false, i, z, cVar, bVar);
            if (t0 == null) {
                return false;
            }
            dVar.m30148b(timeline.mo20027b(t0.first), ((Long) t0.second).longValue(), t0.first);
            if (dVar.f9217k.m30016e() == Long.MIN_VALUE) {
                m30174p0(timeline, dVar, cVar, bVar);
            }
            return true;
        }
        int b = timeline.mo20027b(obj);
        if (b == -1) {
            return false;
        }
        if (dVar.f9217k.m30016e() == Long.MIN_VALUE) {
            m30174p0(timeline, dVar, cVar, bVar);
            return true;
        }
        dVar.f9218l = b;
        timeline2.mo30409h(dVar.f9220n, bVar);
        if (timeline2.m30436n(bVar.f9084c, cVar).f9101l) {
            Pair<Object, Long> j2 = timeline.m30438j(cVar, bVar, timeline.mo30409h(dVar.f9220n, bVar).f9084c, dVar.f9219m + bVar.m30422l());
            dVar.m30148b(timeline.mo20027b(j2.first), ((Long) j2.second).longValue(), j2.first);
        }
        return true;
    }

    /* renamed from: r */
    private void m30171r() {
        m30169s(new boolean[this.f9192k.length]);
    }

    /* renamed from: r0 */
    private void m30170r0(Timeline timeline, Timeline timeline2) {
        if (!timeline.m30435q() || !timeline2.m30435q()) {
            for (int size = this.f9206y.size() - 1; size >= 0; size--) {
                if (!m30172q0(this.f9206y.get(size), timeline, timeline2, this.f37239N, this.f37240O, this.f9201t, this.f9202u)) {
                    this.f9206y.get(size).f9217k.m30010k(false);
                    this.f9206y.remove(size);
                }
            }
            Collections.sort(this.f9206y);
        }
    }

    /* renamed from: s */
    private void m30169s(boolean[] zArr) {
        C5198j0 p = this.f37227B.m30078p();
        C3427n o = p.m30114o();
        for (int i = 0; i < this.f9192k.length; i++) {
            if (!o.m34397c(i)) {
                this.f9192k[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f9192k.length; i2++) {
            if (o.m34397c(i2)) {
                m30173q(i2, zArr[i2]);
            }
        }
        p.f9254g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.C5181g0.C5188g m30168s0(com.google.android.exoplayer2.Timeline r21, com.google.android.exoplayer2.C5216q0 r22, com.google.android.exoplayer2.C5181g0.C5189h r23, com.google.android.exoplayer2.C5204m0 r24, int r25, boolean r26, com.google.android.exoplayer2.Timeline.C5161c r27, com.google.android.exoplayer2.Timeline.C5160b r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C5181g0.m30168s0(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.q0, com.google.android.exoplayer2.g0$h, com.google.android.exoplayer2.m0, int, boolean, com.google.android.exoplayer2.Timeline$c, com.google.android.exoplayer2.Timeline$b):com.google.android.exoplayer2.g0$g");
    }

    /* renamed from: t */
    private void m30167t(AbstractC5252t0 t0Var) {
        if (t0Var.getState() == 2) {
            t0Var.stop();
        }
    }

    /* renamed from: t0 */
    private static Pair<Object, Long> m30166t0(Timeline timeline, C5189h hVar, boolean z, int i, boolean z2, Timeline.C5161c cVar, Timeline.C5160b bVar) {
        Timeline timeline2;
        Pair<Object, Long> j;
        Object u0;
        Timeline timeline3 = hVar.f9234a;
        if (timeline.m30435q()) {
            return null;
        }
        if (timeline3.m30435q()) {
            timeline2 = timeline;
        } else {
            timeline2 = timeline3;
        }
        try {
            j = timeline2.m30438j(cVar, bVar, hVar.f9235b, hVar.f9236c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (timeline.equals(timeline2)) {
            return j;
        }
        if (timeline.mo20027b(j.first) != -1) {
            timeline2.mo30409h(j.first, bVar);
            if (timeline2.m30436n(bVar.f9084c, cVar).f9101l) {
                return timeline.m30438j(cVar, bVar, timeline.mo30409h(j.first, bVar).f9084c, hVar.f9236c);
            }
            return j;
        }
        if (z && (u0 = m30164u0(cVar, bVar, i, z2, j.first, timeline2, timeline)) != null) {
            return timeline.m30438j(cVar, bVar, timeline.mo30409h(u0, bVar).f9084c, -9223372036854775807L);
        }
        return null;
    }

    /* renamed from: u */
    private AbstractC3884i0<C14576a> m30165u(AbstractC3415h[] hVarArr) {
        AbstractC3884i0.C3886b bVar = new AbstractC3884i0.C3886b();
        boolean z = false;
        for (AbstractC3415h hVar : hVarArr) {
            if (hVar != null) {
                C14576a aVar = hVar.mo34414c(0).f14327t;
                if (aVar == null) {
                    bVar.m33395b(new C14576a(new C14576a.AbstractC14577b[0]));
                } else {
                    bVar.m33395b(aVar);
                    z = true;
                }
            }
        }
        if (z) {
            return bVar.m33394c();
        }
        return AbstractC3884i0.m33399x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public static Object m30164u0(Timeline.C5161c cVar, Timeline.C5160b bVar, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        int b = timeline.mo20027b(obj);
        int i2 = timeline.mo20025i();
        int i3 = b;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && i4 == -1; i5++) {
            i3 = timeline.m30440d(i3, bVar, cVar, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = timeline2.mo20027b(timeline.mo20024m(i3));
        }
        if (i4 == -1) {
            return null;
        }
        return timeline2.mo20024m(i4);
    }

    /* renamed from: v */
    private long m30163v() {
        C5216q0 q0Var = this.f37232G;
        return m30159x(q0Var.f9321a, q0Var.f9322b.f18059a, q0Var.f9338r);
    }

    /* renamed from: v0 */
    private void m30162v0(long j, long j2) {
        this.f9198q.mo22246j(2);
        this.f9198q.mo22247i(2, j + j2);
    }

    /* renamed from: w */
    private static C6722k[] m30161w(AbstractC3415h hVar) {
        int i;
        if (hVar != null) {
            i = hVar.length();
        } else {
            i = 0;
        }
        C6722k[] kVarArr = new C6722k[i];
        for (int i2 = 0; i2 < i; i2++) {
            kVarArr[i2] = hVar.mo34414c(i2);
        }
        return kVarArr;
    }

    /* renamed from: x */
    private long m30159x(Timeline timeline, Object obj, long j) {
        timeline.m30436n(timeline.mo30409h(obj, this.f9202u).f9084c, this.f9201t);
        Timeline.C5161c cVar = this.f9201t;
        if (cVar.f9095f != -9223372036854775807L && cVar.m30413f()) {
            Timeline.C5161c cVar2 = this.f9201t;
            if (cVar2.f9098i) {
                return C6713c.m24566c(cVar2.m30418a() - this.f9201t.f9095f) - (j + this.f9202u.m30422l());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: x0 */
    private void m30158x0(boolean z) {
        AbstractC8299u.C8300a aVar = this.f37227B.m30079o().f9253f.f9264a;
        long A0 = m30263A0(aVar, this.f37232G.f9338r, true, false);
        if (A0 != this.f37232G.f9338r) {
            this.f37232G = m30246J(aVar, A0, this.f37232G.f9323c);
            if (z) {
                this.f37233H.m30143e(4);
            }
        }
    }

    /* renamed from: y */
    private long m30157y() {
        C5198j0 p = this.f37227B.m30078p();
        if (p == null) {
            return 0L;
        }
        long l = p.m30117l();
        if (!p.f9251d) {
            return l;
        }
        int i = 0;
        while (true) {
            AbstractC5252t0[] t0VarArr = this.f9192k;
            if (i >= t0VarArr.length) {
                return l;
            }
            if (m30240M(t0VarArr[i]) && this.f9192k[i].mo24575s() == p.f9250c[i]) {
                long t = this.f9192k[i].mo24574t();
                if (t == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(t, l);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m30156y0(com.google.android.exoplayer2.C5181g0.C5189h r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C5181g0.m30156y0(com.google.android.exoplayer2.g0$h):void");
    }

    /* renamed from: z */
    private Pair<AbstractC8299u.C8300a, Long> m30155z(Timeline timeline) {
        long j = 0;
        if (timeline.m30435q()) {
            return Pair.create(C5216q0.m30021l(), 0L);
        }
        Pair<Object, Long> j2 = timeline.m30438j(this.f9201t, this.f9202u, timeline.mo20133a(this.f37240O), -9223372036854775807L);
        AbstractC8299u.C8300a z = this.f37227B.m30068z(timeline, j2.first, 0L);
        long longValue = ((Long) j2.second).longValue();
        if (z.m20020b()) {
            timeline.mo30409h(z.f18059a, this.f9202u);
            if (z.f18061c == this.f9202u.m30425i(z.f18060b)) {
                j = this.f9202u.m30427g();
            }
            longValue = j;
        }
        return Pair.create(z, Long.valueOf(longValue));
    }

    /* renamed from: z0 */
    private long m30154z0(AbstractC8299u.C8300a aVar, long j, boolean z) {
        boolean z2;
        if (this.f37227B.m30079o() != this.f37227B.m30078p()) {
            z2 = true;
        } else {
            z2 = false;
        }
        return m30263A0(aVar, j, z2, z);
    }

    /* renamed from: A */
    public Looper m30264A() {
        return this.f9200s;
    }

    /* renamed from: I0 */
    public void m30247I0(List<C5210p0.C5213c> list, int i, long j, AbstractC8285q0 q0Var) {
        this.f9198q.mo22251e(17, new C5183b(list, q0Var, i, j, null)).sendToTarget();
    }

    /* renamed from: L0 */
    public void m30241L0(boolean z, int i) {
        this.f9198q.mo22249g(1, z ? 1 : 0, i).sendToTarget();
    }

    /* renamed from: N0 */
    public void m30237N0(PlaybackParameters playbackParameters) {
        this.f9198q.mo22251e(4, playbackParameters).sendToTarget();
    }

    /* renamed from: P0 */
    public void m30233P0(int i) {
        this.f9198q.mo22249g(11, i, 0).sendToTarget();
    }

    /* renamed from: S0 */
    public void m30227S0(boolean z) {
        this.f9198q.mo22249g(12, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // p029b9.AbstractC3425m.AbstractC3426a
    /* renamed from: b */
    public void mo30210b() {
        this.f9198q.mo22248h(10);
    }

    @Override // com.google.android.exoplayer2.C5210p0.AbstractC5214d
    /* renamed from: c */
    public void mo30033c() {
        this.f9198q.mo22248h(22);
    }

    @Override // com.google.android.exoplayer2.C5218r0.AbstractC5219a
    /* renamed from: d */
    public synchronized void mo30006d(C5218r0 r0Var) {
        if (!this.f37234I && this.f9199r.isAlive()) {
            this.f9198q.mo22251e(14, r0Var).sendToTarget();
            return;
        }
        C7558r.m22104h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        r0Var.m30010k(false);
    }

    /* renamed from: d0 */
    public void mo12471i(AbstractC8287r rVar) {
        this.f9198q.mo22251e(9, rVar).sendToTarget();
    }

    /* renamed from: d1 */
    public void m30204d1() {
        this.f9198q.mo22254b(6).sendToTarget();
    }

    /* renamed from: e0 */
    public void m30202e0() {
        this.f9198q.mo22254b(0).sendToTarget();
    }

    /* renamed from: g0 */
    public synchronized boolean m30196g0() {
        if (!this.f37234I && this.f9199r.isAlive()) {
            this.f9198q.mo22248h(7);
            m30179m1(new AbstractC3465n() { // from class: com.google.android.exoplayer2.e0
                @Override // p030bc.AbstractC3465n, p163j$.util.function.Supplier
                public final Object get() {
                    Boolean O;
                    O = C5181g0.this.m30236O();
                    return O;
                }
            }, this.f37230E);
            return this.f37234I;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C5198j0 p;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            switch (message.what) {
                case 0:
                    m30199f0();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m30239M0(z, message.arg2, true, 1);
                    break;
                case 2:
                    m30175p();
                    break;
                case 3:
                    m30156y0((C5189h) message.obj);
                    break;
                case 4:
                    m30235O0((PlaybackParameters) message.obj);
                    break;
                case 5:
                    m30229R0((C6736w) message.obj);
                    break;
                case 6:
                    m30201e1(false, true);
                    break;
                case 7:
                    m30193h0();
                    return true;
                case 8:
                    m30252G((AbstractC8287r) message.obj);
                    break;
                case 9:
                    m30258D((AbstractC8287r) message.obj);
                    break;
                case 10:
                    m30183l0();
                    break;
                case 11:
                    m30231Q0(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m30225T0(z2);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    m30251G0(z3, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m30261B0((C5218r0) message.obj);
                    break;
                case 15:
                    m30257D0((C5218r0) message.obj);
                    break;
                case 16:
                    m30248I((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    m30249H0((C5183b) message.obj);
                    break;
                case 18:
                    m30187k((C5183b) message.obj, message.arg1);
                    break;
                case 19:
                    m30214Z((C5184c) message.obj);
                    break;
                case 20:
                    m30191i0(message.arg1, message.arg2, (AbstractC8285q0) message.obj);
                    break;
                case 21:
                    m30223U0((AbstractC8285q0) message.obj);
                    break;
                case 22:
                    m30216Y();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    m30243K0(z4);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    m30245J0(z5);
                    break;
                case 25:
                    m30184l((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            m30230R();
        } catch (ExoPlaybackException e) {
            e = e;
            if (e.f8953k == 1 && (p = this.f37227B.m30078p()) != null) {
                e = e.m30561a(p.f9253f.f9264a);
            }
            if (!e.f8960r || this.f37249X != null) {
                ExoPlaybackException exoPlaybackException = this.f37249X;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.f37249X = null;
                }
                C7558r.m22108d("ExoPlayerImplInternal", "Playback error", e);
                m30201e1(true, false);
                this.f37232G = this.f37232G.m30027f(e);
            } else {
                C7558r.m22103i("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.f37249X = e;
                Message e2 = this.f9198q.mo22251e(25, e);
                e2.getTarget().sendMessageAtFrontOfQueue(e2);
            }
            m30230R();
        } catch (IOException e3) {
            ExoPlaybackException d = ExoPlaybackException.m30558d(e3);
            C5198j0 o = this.f37227B.m30079o();
            if (o != null) {
                d = d.m30561a(o.f9253f.f9264a);
            }
            C7558r.m22108d("ExoPlayerImplInternal", "Playback error", d);
            m30201e1(false, false);
            this.f37232G = this.f37232G.m30027f(d);
            m30230R();
        } catch (RuntimeException e4) {
            ExoPlaybackException e5 = ExoPlaybackException.m30557e(e4);
            C7558r.m22108d("ExoPlayerImplInternal", "Playback error", e5);
            m30201e1(true, false);
            this.f37232G = this.f37232G.m30027f(e5);
            m30230R();
        }
        return true;
    }

    @Override // p153i8.AbstractC8287r.AbstractC8288a
    /* renamed from: j */
    public void mo20028j(AbstractC8287r rVar) {
        this.f9198q.mo22251e(8, rVar).sendToTarget();
    }

    /* renamed from: j0 */
    public void m30189j0(int i, int i2, AbstractC8285q0 q0Var) {
        this.f9198q.mo22252d(20, i, i2, q0Var).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.C5190h.AbstractC5191a
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f9198q.mo22251e(16, playbackParameters).sendToTarget();
    }

    /* renamed from: w0 */
    public void m30160w0(Timeline timeline, int i, long j) {
        this.f9198q.mo22251e(3, new C5189h(timeline, i, j)).sendToTarget();
    }
}
