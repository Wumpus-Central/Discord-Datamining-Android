package p098f7;

import android.os.Looper;
import android.util.SparseArray;
import android.view.Surface;
import cc.AbstractC3884i0;
import cc.AbstractC3899l0;
import cc.C3976z0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.IOException;
import java.util.List;
import p030bc.AbstractC3465n;
import p030bc.C3456h;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6730q;
import p081e9.AbstractC6769e;
import p098f7.AbstractC7034e1;
import p117g7.AbstractC7478r;
import p119g9.AbstractC7516c;
import p119g9.C7510a;
import p119g9.C7553q;
import p119g9.C7557q0;
import p119g9.C7565v;
import p133h9.AbstractC7940a0;
import p152i7.C8221f;
import p152i7.C8225i;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8299u;
import p153i8.C8273n;
import p153i8.C8284q;
import p153i8.C8290s;
import p163j$.util.Spliterator;
import p193k7.AbstractC9815v;
import p459z7.C14576a;

/* renamed from: f7.d1 */
/* loaded from: classes7.dex */
public class C7030d1 implements Player.AbstractC5153a, AbstractC7478r, AbstractC7940a0, AbstractC8233b0, AbstractC6769e.AbstractC6770a, AbstractC9815v {

    /* renamed from: k */
    private final AbstractC7516c f15334k;

    /* renamed from: l */
    private final Timeline.C5160b f15335l;

    /* renamed from: n */
    private final C7031a f15337n;

    /* renamed from: p */
    private C7553q<AbstractC7034e1, AbstractC7034e1.C7036b> f15339p;

    /* renamed from: q */
    private Player f15340q;

    /* renamed from: r */
    private boolean f15341r;

    /* renamed from: m */
    private final Timeline.C5161c f15336m = new Timeline.C5161c();

    /* renamed from: o */
    private final SparseArray<AbstractC7034e1.C7035a> f15338o = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f7.d1$a */
    /* loaded from: classes7.dex */
    public static final class C7031a {

        /* renamed from: a */
        private final Timeline.C5160b f15342a;

        /* renamed from: b */
        private AbstractC3884i0<AbstractC8299u.C8300a> f15343b = AbstractC3884i0.m33399x();

        /* renamed from: c */
        private AbstractC3899l0<AbstractC8299u.C8300a, Timeline> f15344c = AbstractC3899l0.m33370r();

        /* renamed from: d */
        private AbstractC8299u.C8300a f15345d;

        /* renamed from: e */
        private AbstractC8299u.C8300a f15346e;

        /* renamed from: f */
        private AbstractC8299u.C8300a f15347f;

        public C7031a(Timeline.C5160b bVar) {
            this.f15342a = bVar;
        }

        /* renamed from: b */
        private void m23517b(AbstractC3899l0.C3901b<AbstractC8299u.C8300a, Timeline> bVar, AbstractC8299u.C8300a aVar, Timeline timeline) {
            if (aVar != null) {
                if (timeline.mo20027b(aVar.f18059a) != -1) {
                    bVar.m33364d(aVar, timeline);
                    return;
                }
                Timeline timeline2 = this.f15344c.get(aVar);
                if (timeline2 != null) {
                    bVar.m33364d(aVar, timeline2);
                }
            }
        }

        /* renamed from: c */
        private static AbstractC8299u.C8300a m23516c(Player player, AbstractC3884i0<AbstractC8299u.C8300a> i0Var, AbstractC8299u.C8300a aVar, Timeline.C5160b bVar) {
            Object obj;
            int i;
            Timeline w = player.mo30287w();
            int I = player.mo30367I();
            if (w.m30435q()) {
                obj = null;
            } else {
                obj = w.mo20024m(I);
            }
            if (player.mo30333d() || w.m30435q()) {
                i = -1;
            } else {
                i = w.m30439f(I, bVar).m30430d(C6713c.m24566c(player.mo30341Y()) - bVar.m30422l());
            }
            for (int i2 = 0; i2 < i0Var.size(); i2++) {
                AbstractC8299u.C8300a aVar2 = i0Var.get(i2);
                if (m23510i(aVar2, obj, player.mo30333d(), player.mo30293t(), player.mo30362L(), i)) {
                    return aVar2;
                }
            }
            if (!i0Var.isEmpty() || aVar == null || !m23510i(aVar, obj, player.mo30333d(), player.mo30293t(), player.mo30362L(), i)) {
                return null;
            }
            return aVar;
        }

        /* renamed from: i */
        private static boolean m23510i(AbstractC8299u.C8300a aVar, Object obj, boolean z, int i, int i2, int i3) {
            if (!aVar.f18059a.equals(obj)) {
                return false;
            }
            if ((z && aVar.f18060b == i && aVar.f18061c == i2) || (!z && aVar.f18060b == -1 && aVar.f18063e == i3)) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        private void m23506m(Timeline timeline) {
            AbstractC3899l0.C3901b<AbstractC8299u.C8300a, Timeline> a = AbstractC3899l0.m33382a();
            if (this.f15343b.isEmpty()) {
                m23517b(a, this.f15346e, timeline);
                if (!C3456h.m34362a(this.f15347f, this.f15346e)) {
                    m23517b(a, this.f15347f, timeline);
                }
                if (!C3456h.m34362a(this.f15345d, this.f15346e) && !C3456h.m34362a(this.f15345d, this.f15347f)) {
                    m23517b(a, this.f15345d, timeline);
                }
            } else {
                for (int i = 0; i < this.f15343b.size(); i++) {
                    m23517b(a, this.f15343b.get(i), timeline);
                }
                if (!this.f15343b.contains(this.f15345d)) {
                    m23517b(a, this.f15345d, timeline);
                }
            }
            this.f15344c = a.m33367a();
        }

        /* renamed from: d */
        public AbstractC8299u.C8300a m23515d() {
            return this.f15345d;
        }

        /* renamed from: e */
        public AbstractC8299u.C8300a m23514e() {
            if (this.f15343b.isEmpty()) {
                return null;
            }
            return (AbstractC8299u.C8300a) C3976z0.m33215c(this.f15343b);
        }

        /* renamed from: f */
        public Timeline m23513f(AbstractC8299u.C8300a aVar) {
            return this.f15344c.get(aVar);
        }

        /* renamed from: g */
        public AbstractC8299u.C8300a m23512g() {
            return this.f15346e;
        }

        /* renamed from: h */
        public AbstractC8299u.C8300a m23511h() {
            return this.f15347f;
        }

        /* renamed from: j */
        public void m23509j(Player player) {
            this.f15345d = m23516c(player, this.f15343b, this.f15346e, this.f15342a);
        }

        /* renamed from: k */
        public void m23508k(List<AbstractC8299u.C8300a> list, AbstractC8299u.C8300a aVar, Player player) {
            this.f15343b = AbstractC3884i0.m33401u(list);
            if (!list.isEmpty()) {
                this.f15346e = list.get(0);
                this.f15347f = (AbstractC8299u.C8300a) C7510a.m22367e(aVar);
            }
            if (this.f15345d == null) {
                this.f15345d = m23516c(player, this.f15343b, this.f15346e, this.f15342a);
            }
            m23506m(player.mo30287w());
        }

        /* renamed from: l */
        public void m23507l(Player player) {
            this.f15345d = m23516c(player, this.f15343b, this.f15346e, this.f15342a);
            m23506m(player.mo30287w());
        }
    }

    public C7030d1(AbstractC7516c cVar) {
        this.f15334k = (AbstractC7516c) C7510a.m22367e(cVar);
        this.f15339p = new C7553q<>(C7557q0.m22185P(), cVar, new AbstractC3465n() { // from class: f7.a
            @Override // p030bc.AbstractC3465n, p163j$.util.function.Supplier
            public final Object get() {
                return new AbstractC7034e1.C7036b();
            }
        }, new C7553q.AbstractC7555b() { // from class: f7.l
            @Override // p119g9.C7553q.AbstractC7555b
            /* renamed from: a */
            public final void mo22219a(Object obj, C7565v vVar) {
                C7030d1.m23605O0((AbstractC7034e1) obj, (AbstractC7034e1.C7036b) vVar);
            }
        });
        Timeline.C5160b bVar = new Timeline.C5160b();
        this.f15335l = bVar;
        this.f15337n = new C7031a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public static /* synthetic */ void m23628G1(AbstractC7034e1.C7035a aVar, String str, long j, AbstractC7034e1 e1Var) {
        e1Var.m23502D(aVar, str, j);
        e1Var.m23486T(aVar, 2, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static /* synthetic */ void m23622I1(AbstractC7034e1.C7035a aVar, C8221f fVar, AbstractC7034e1 e1Var) {
        e1Var.m23474c0(aVar, fVar);
        e1Var.m23478a0(aVar, 2, fVar);
    }

    /* renamed from: J0 */
    private AbstractC7034e1.C7035a m23620J0(AbstractC8299u.C8300a aVar) {
        Timeline timeline;
        boolean z;
        C7510a.m22367e(this.f15340q);
        if (aVar == null) {
            timeline = null;
        } else {
            timeline = this.f15337n.m23513f(aVar);
        }
        if (aVar != null && timeline != null) {
            return m23623I0(timeline, timeline.mo30409h(aVar.f18059a, this.f15335l).f9084c, aVar);
        }
        int m = this.f15340q.mo30311m();
        Timeline w = this.f15340q.mo30287w();
        if (m < w.mo20022p()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            w = Timeline.f9081a;
        }
        return m23623I0(w, m, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static /* synthetic */ void m23619J1(AbstractC7034e1.C7035a aVar, C8221f fVar, AbstractC7034e1 e1Var) {
        e1Var.m23500F(aVar, fVar);
        e1Var.m23492N(aVar, 2, fVar);
    }

    /* renamed from: K0 */
    private AbstractC7034e1.C7035a m23617K0() {
        return m23620J0(this.f15337n.m23514e());
    }

    /* renamed from: L0 */
    private AbstractC7034e1.C7035a m23614L0(int i, AbstractC8299u.C8300a aVar) {
        C7510a.m22367e(this.f15340q);
        boolean z = true;
        if (aVar != null) {
            if (this.f15337n.m23513f(aVar) == null) {
                z = false;
            }
            if (z) {
                return m23620J0(aVar);
            }
            return m23623I0(Timeline.f9081a, i, aVar);
        }
        Timeline w = this.f15340q.mo30287w();
        if (i >= w.mo20022p()) {
            z = false;
        }
        if (!z) {
            w = Timeline.f9081a;
        }
        return m23623I0(w, i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static /* synthetic */ void m23613L1(AbstractC7034e1.C7035a aVar, C6722k kVar, C8225i iVar, AbstractC7034e1 e1Var) {
        e1Var.m23451x(aVar, kVar, iVar);
        e1Var.m23461n(aVar, 2, kVar);
    }

    /* renamed from: M0 */
    private AbstractC7034e1.C7035a m23611M0() {
        return m23620J0(this.f15337n.m23512g());
    }

    /* renamed from: N0 */
    private AbstractC7034e1.C7035a m23608N0() {
        return m23620J0(this.f15337n.m23511h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public static /* synthetic */ void m23605O0(AbstractC7034e1 e1Var, AbstractC7034e1.C7036b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m23601P1(Player player, AbstractC7034e1 e1Var, AbstractC7034e1.C7036b bVar) {
        bVar.m23448f(this.f15338o);
        e1Var.m23482X(player, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public static /* synthetic */ void m23599Q0(AbstractC7034e1.C7035a aVar, String str, long j, AbstractC7034e1 e1Var) {
        e1Var.m23504B(aVar, str, j);
        e1Var.m23486T(aVar, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S0 */
    public static /* synthetic */ void m23593S0(AbstractC7034e1.C7035a aVar, C8221f fVar, AbstractC7034e1 e1Var) {
        e1Var.m23454u(aVar, fVar);
        e1Var.m23478a0(aVar, 1, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ void m23590T0(AbstractC7034e1.C7035a aVar, C8221f fVar, AbstractC7034e1 e1Var) {
        e1Var.m23485U(aVar, fVar);
        e1Var.m23492N(aVar, 1, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ void m23587U0(AbstractC7034e1.C7035a aVar, C6722k kVar, C8225i iVar, AbstractC7034e1 e1Var) {
        e1Var.m23472d0(aVar, kVar, iVar);
        e1Var.m23461n(aVar, 1, kVar);
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: A */
    public final void mo22520A(final C8221f fVar) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1008, new C7553q.AbstractC7554a() { // from class: f7.t
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23590T0(AbstractC7034e1.C7035a.this, fVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: B */
    public final void mo21115B(final C6722k kVar, final C8225i iVar) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1022, new C7553q.AbstractC7554a() { // from class: f7.k
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23613L1(AbstractC7034e1.C7035a.this, kVar, iVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: C */
    public final void mo20205C(int i, AbstractC8299u.C8300a aVar, final C8284q qVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1004, new C7553q.AbstractC7554a() { // from class: f7.m0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23483W(AbstractC7034e1.C7035a.this, qVar);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: D */
    public final void mo22519D(final int i, final long j, final long j2) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1012, new C7553q.AbstractC7554a() { // from class: f7.x0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23476b0(AbstractC7034e1.C7035a.this, i, j, j2);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: E */
    public final void mo21114E(final long j, final int i) {
        final AbstractC7034e1.C7035a M0 = m23611M0();
        m23580W1(M0, 1026, new C7553q.AbstractC7554a() { // from class: f7.p
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23496J(AbstractC7034e1.C7035a.this, j, i);
            }
        });
    }

    /* renamed from: H0 */
    protected final AbstractC7034e1.C7035a m23626H0() {
        return m23620J0(this.f15337n.m23515d());
    }

    /* renamed from: I0 */
    protected final AbstractC7034e1.C7035a m23623I0(Timeline timeline, int i, AbstractC8299u.C8300a aVar) {
        AbstractC8299u.C8300a aVar2;
        boolean z;
        long j;
        if (timeline.m30435q()) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        long b = this.f15334k.mo22292b();
        boolean z2 = true;
        if (!timeline.equals(this.f15340q.mo30287w()) || i != this.f15340q.mo30311m()) {
            z = false;
        } else {
            z = true;
        }
        long j2 = 0;
        if (aVar2 != null && aVar2.m20020b()) {
            if (!(z && this.f15340q.mo30293t() == aVar2.f18060b && this.f15340q.mo30362L() == aVar2.f18061c)) {
                z2 = false;
            }
            if (z2) {
                j2 = this.f15340q.mo30341Y();
            }
        } else if (z) {
            j = this.f15340q.mo30360M();
            return new AbstractC7034e1.C7035a(b, timeline, i, aVar2, j, this.f15340q.mo30287w(), this.f15340q.mo30311m(), this.f15337n.m23515d(), this.f15340q.mo30341Y(), this.f15340q.mo30330e());
        } else if (!timeline.m30435q()) {
            j2 = timeline.m30436n(i, this.f15336m).m30417b();
        }
        j = j2;
        return new AbstractC7034e1.C7035a(b, timeline, i, aVar2, j, this.f15340q.mo30287w(), this.f15340q.mo30311m(), this.f15337n.m23515d(), this.f15340q.mo30341Y(), this.f15340q.mo30330e());
    }

    /* renamed from: Q1 */
    public final void m23598Q1() {
        if (!this.f15341r) {
            final AbstractC7034e1.C7035a H0 = m23626H0();
            this.f15341r = true;
            m23580W1(H0, -1, new C7553q.AbstractC7554a() { // from class: f7.z0
                @Override // p119g9.C7553q.AbstractC7554a
                public final void invoke(Object obj) {
                    ((AbstractC7034e1) obj).m23465j(AbstractC7034e1.C7035a.this);
                }
            });
        }
    }

    /* renamed from: R1 */
    public final void m23595R1(final C14576a aVar) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 1007, new C7553q.AbstractC7554a() { // from class: f7.w
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23490P(AbstractC7034e1.C7035a.this, aVar);
            }
        });
    }

    /* renamed from: S1 */
    public void m23592S1(final int i, final int i2) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1029, new C7553q.AbstractC7554a() { // from class: f7.h0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23467h(AbstractC7034e1.C7035a.this, i, i2);
            }
        });
    }

    /* renamed from: T1 */
    public final void m23589T1(final float f) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1019, new C7553q.AbstractC7554a() { // from class: f7.y0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23459p(AbstractC7034e1.C7035a.this, f);
            }
        });
    }

    /* renamed from: U1 */
    public void m23586U1() {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        this.f15338o.put(1036, H0);
        this.f15339p.m22224h(1036, new C7553q.AbstractC7554a() { // from class: f7.s0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23450y(AbstractC7034e1.C7035a.this);
            }
        });
    }

    /* renamed from: V1 */
    public final void m23583V1() {
    }

    /* renamed from: W1 */
    protected final void m23580W1(AbstractC7034e1.C7035a aVar, int i, C7553q.AbstractC7554a<AbstractC7034e1> aVar2) {
        this.f15338o.put(i, aVar);
        this.f15339p.m22220l(i, aVar2);
    }

    /* renamed from: X1 */
    public void m23577X1(final Player player, Looper looper) {
        boolean z;
        if (this.f15340q == null || this.f15337n.f15343b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        this.f15340q = (Player) C7510a.m22367e(player);
        this.f15339p = this.f15339p.m22228d(looper, new C7553q.AbstractC7555b() { // from class: f7.a1
            @Override // p119g9.C7553q.AbstractC7555b
            /* renamed from: a */
            public final void mo22219a(Object obj, C7565v vVar) {
                C7030d1.this.m23601P1(player, (AbstractC7034e1) obj, (AbstractC7034e1.C7036b) vVar);
            }
        });
    }

    /* renamed from: Y1 */
    public final void m23574Y1(List<AbstractC8299u.C8300a> list, AbstractC8299u.C8300a aVar) {
        this.f15337n.m23508k(list, aVar, (Player) C7510a.m22367e(this.f15340q));
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: a */
    public final void mo22518a(final boolean z) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1017, new C7553q.AbstractC7554a() { // from class: f7.r0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23452w(AbstractC7034e1.C7035a.this, z);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: b */
    public final void mo20203b(int i, AbstractC8299u.C8300a aVar, final C8273n nVar, final C8284q qVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, RNCWebViewManager.COMMAND_CLEAR_HISTORY, new C7553q.AbstractC7554a() { // from class: f7.c
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23479a(AbstractC7034e1.C7035a.this, nVar, qVar);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: c */
    public final void mo22517c(final Exception exc) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1018, new C7553q.AbstractC7554a() { // from class: f7.i0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23494L(AbstractC7034e1.C7035a.this, exc);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: d */
    public final void mo21113d(final int i, final int i2, final int i3, final float f) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1028, new C7553q.AbstractC7554a() { // from class: f7.b0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23453v(AbstractC7034e1.C7035a.this, i, i2, i3, f);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: e */
    public final void mo22516e(final C8221f fVar) {
        final AbstractC7034e1.C7035a M0 = m23611M0();
        m23580W1(M0, 1014, new C7553q.AbstractC7554a() { // from class: f7.d
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23593S0(AbstractC7034e1.C7035a.this, fVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: f */
    public final void mo21112f(final String str) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, Spliterator.IMMUTABLE, new C7553q.AbstractC7554a() { // from class: f7.i
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23493M(AbstractC7034e1.C7035a.this, str);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: g */
    public final void mo21111g(final String str, long j, final long j2) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1021, new C7553q.AbstractC7554a() { // from class: f7.q0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23628G1(AbstractC7034e1.C7035a.this, str, j2, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: h */
    public final void mo21110h(final C8221f fVar) {
        final AbstractC7034e1.C7035a M0 = m23611M0();
        m23580W1(M0, 1025, new C7553q.AbstractC7554a() { // from class: f7.c0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23622I1(AbstractC7034e1.C7035a.this, fVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p081e9.AbstractC6769e.AbstractC6770a
    /* renamed from: i */
    public final void mo23555i(final int i, final long j, final long j2) {
        final AbstractC7034e1.C7035a K0 = m23617K0();
        m23580W1(K0, 1006, new C7553q.AbstractC7554a() { // from class: f7.b1
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23456s(AbstractC7034e1.C7035a.this, i, j, j2);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: j */
    public final void mo21109j(final Surface surface) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1027, new C7553q.AbstractC7554a() { // from class: f7.m
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23481Y(AbstractC7034e1.C7035a.this, surface);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: k */
    public final void mo22515k(final String str) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1013, new C7553q.AbstractC7554a() { // from class: f7.e0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23475c(AbstractC7034e1.C7035a.this, str);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: l */
    public final void mo22514l(final String str, long j, final long j2) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1009, new C7553q.AbstractC7554a() { // from class: f7.a0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23599Q0(AbstractC7034e1.C7035a.this, str, j2, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: m */
    public final void mo15305m(int i, AbstractC8299u.C8300a aVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1035, new C7553q.AbstractC7554a() { // from class: f7.w0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23498H(AbstractC7034e1.C7035a.this);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: n */
    public final void mo15304n(int i, AbstractC8299u.C8300a aVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1033, new C7553q.AbstractC7554a() { // from class: f7.v0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23484V(AbstractC7034e1.C7035a.this);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: o */
    public final void mo22513o(final long j) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1011, new C7553q.AbstractC7554a() { // from class: f7.o0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23497I(AbstractC7034e1.C7035a.this, j);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        C6730q.m24451a(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        C6730q.m24450b(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        C6730q.m24449c(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onIsLoadingChanged(final boolean z) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 4, new C7553q.AbstractC7554a() { // from class: f7.j0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23480Z(AbstractC7034e1.C7035a.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public void onIsPlayingChanged(final boolean z) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 8, new C7553q.AbstractC7554a() { // from class: f7.n0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23503C(AbstractC7034e1.C7035a.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onLoadingChanged(boolean z) {
        C6730q.m24446f(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onMediaItemTransition(final MediaItem mediaItem, final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 1, new C7553q.AbstractC7554a() { // from class: f7.y
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23477b(AbstractC7034e1.C7035a.this, mediaItem, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlayWhenReadyChanged(final boolean z, final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 6, new C7553q.AbstractC7554a() { // from class: f7.f
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23468g(AbstractC7034e1.C7035a.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 13, new C7553q.AbstractC7554a() { // from class: f7.f0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23466i(AbstractC7034e1.C7035a.this, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlaybackStateChanged(final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 5, new C7553q.AbstractC7554a() { // from class: f7.l0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23457r(AbstractC7034e1.C7035a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlaybackSuppressionReasonChanged(final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 7, new C7553q.AbstractC7554a() { // from class: f7.b
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23488R(AbstractC7034e1.C7035a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlayerError(final ExoPlaybackException exoPlaybackException) {
        final AbstractC7034e1.C7035a aVar;
        C8290s sVar = exoPlaybackException.f8959q;
        if (sVar != null) {
            aVar = m23620J0(new AbstractC8299u.C8300a(sVar));
        } else {
            aVar = m23626H0();
        }
        m23580W1(aVar, 11, new C7553q.AbstractC7554a() { // from class: f7.u
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23449z(AbstractC7034e1.C7035a.this, exoPlaybackException);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPlayerStateChanged(final boolean z, final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, -1, new C7553q.AbstractC7554a() { // from class: f7.h
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23505A(AbstractC7034e1.C7035a.this, z, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onPositionDiscontinuity(final int i) {
        if (i == 1) {
            this.f15341r = false;
        }
        this.f15337n.m23509j((Player) C7510a.m22367e(this.f15340q));
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 12, new C7553q.AbstractC7554a() { // from class: f7.n
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23455t(AbstractC7034e1.C7035a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onRepeatModeChanged(final int i) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 9, new C7553q.AbstractC7554a() { // from class: f7.g
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23464k(AbstractC7034e1.C7035a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onSeekProcessed() {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, -1, new C7553q.AbstractC7554a() { // from class: f7.c1
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23491O(AbstractC7034e1.C7035a.this);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onShuffleModeEnabledChanged(final boolean z) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 10, new C7553q.AbstractC7554a() { // from class: f7.s
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23458q(AbstractC7034e1.C7035a.this, z);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onStaticMetadataChanged(final List<C14576a> list) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 3, new C7553q.AbstractC7554a() { // from class: f7.v
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23489Q(AbstractC7034e1.C7035a.this, list);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onTimelineChanged(Timeline timeline, final int i) {
        this.f15337n.m23507l((Player) C7510a.m22367e(this.f15340q));
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 0, new C7553q.AbstractC7554a() { // from class: f7.j
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23473d(AbstractC7034e1.C7035a.this, i);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
        C6730q.m24432t(this, timeline, obj, i);
    }

    @Override // com.google.android.exoplayer2.Player.AbstractC5153a
    public final void onTracksChanged(final TrackGroupArray trackGroupArray, final TrackSelectionArray trackSelectionArray) {
        final AbstractC7034e1.C7035a H0 = m23626H0();
        m23580W1(H0, 2, new C7553q.AbstractC7554a() { // from class: f7.p0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23463l(AbstractC7034e1.C7035a.this, trackGroupArray, trackSelectionArray);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: p */
    public final void mo15303p(int i, AbstractC8299u.C8300a aVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1031, new C7553q.AbstractC7554a() { // from class: f7.u0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23470e0(AbstractC7034e1.C7035a.this);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: q */
    public final void mo21108q(final C8221f fVar) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1020, new C7553q.AbstractC7554a() { // from class: f7.k0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23619J1(AbstractC7034e1.C7035a.this, fVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: r */
    public final void mo20201r(int i, AbstractC8299u.C8300a aVar, final C8273n nVar, final C8284q qVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, RNCWebViewManager.COMMAND_CLEAR_CACHE, new C7553q.AbstractC7554a() { // from class: f7.d0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23471e(AbstractC7034e1.C7035a.this, nVar, qVar);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: s */
    public final void mo20200s(int i, AbstractC8299u.C8300a aVar, final C8273n nVar, final C8284q qVar, final IOException iOException, final boolean z) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1003, new C7553q.AbstractC7554a() { // from class: f7.r
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23495K(AbstractC7034e1.C7035a.this, nVar, qVar, iOException, z);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: t */
    public final void mo15302t(int i, AbstractC8299u.C8300a aVar, final Exception exc) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1032, new C7553q.AbstractC7554a() { // from class: f7.z
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23487S(AbstractC7034e1.C7035a.this, exc);
            }
        });
    }

    @Override // p117g7.AbstractC7478r
    /* renamed from: u */
    public final void mo22512u(final C6722k kVar, final C8225i iVar) {
        final AbstractC7034e1.C7035a N0 = m23608N0();
        m23580W1(N0, 1010, new C7553q.AbstractC7554a() { // from class: f7.q
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                C7030d1.m23587U0(AbstractC7034e1.C7035a.this, kVar, iVar, (AbstractC7034e1) obj);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: v */
    public final void mo15301v(int i, AbstractC8299u.C8300a aVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1034, new C7553q.AbstractC7554a() { // from class: f7.t0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23462m(AbstractC7034e1.C7035a.this);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: w */
    public final void mo20199w(int i, AbstractC8299u.C8300a aVar, final C8284q qVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1005, new C7553q.AbstractC7554a() { // from class: f7.g0
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23499G(AbstractC7034e1.C7035a.this, qVar);
            }
        });
    }

    @Override // p153i8.AbstractC8233b0
    /* renamed from: x */
    public final void mo20198x(int i, AbstractC8299u.C8300a aVar, final C8273n nVar, final C8284q qVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, new C7553q.AbstractC7554a() { // from class: f7.x
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23460o(AbstractC7034e1.C7035a.this, nVar, qVar);
            }
        });
    }

    @Override // p133h9.AbstractC7940a0
    /* renamed from: y */
    public final void mo21107y(final int i, final long j) {
        final AbstractC7034e1.C7035a M0 = m23611M0();
        m23580W1(M0, 1023, new C7553q.AbstractC7554a() { // from class: f7.e
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23501E(AbstractC7034e1.C7035a.this, i, j);
            }
        });
    }

    @Override // p193k7.AbstractC9815v
    /* renamed from: z */
    public final void mo15300z(int i, AbstractC8299u.C8300a aVar) {
        final AbstractC7034e1.C7035a L0 = m23614L0(i, aVar);
        m23580W1(L0, 1030, new C7553q.AbstractC7554a() { // from class: f7.o
            @Override // p119g9.C7553q.AbstractC7554a
            public final void invoke(Object obj) {
                ((AbstractC7034e1) obj).m23469f(AbstractC7034e1.C7035a.this);
            }
        });
    }
}
