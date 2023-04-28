package p153i8;

import android.os.Handler;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.HashMap;
import p081e9.AbstractC6795x;
import p119g9.C7510a;
import p119g9.C7557q0;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8299u;
import p193k7.AbstractC9815v;

/* renamed from: i8.f */
/* loaded from: classes7.dex */
public abstract class AbstractC8246f<T> extends AbstractC8230a {

    /* renamed from: q */
    private final HashMap<T, C8248b> f17880q = new HashMap<>();

    /* renamed from: r */
    private Handler f17881r;

    /* renamed from: s */
    private AbstractC6795x f17882s;

    /* renamed from: i8.f$a */
    /* loaded from: classes7.dex */
    private final class C8247a implements AbstractC8233b0, AbstractC9815v {

        /* renamed from: k */
        private final T f17883k;

        /* renamed from: l */
        private AbstractC8233b0.C8234a f17884l;

        /* renamed from: m */
        private AbstractC9815v.C9816a f17885m;

        public C8247a(T t) {
            this.f17884l = AbstractC8246f.this.m20262v(null);
            this.f17885m = AbstractC8246f.this.m20264t(null);
            this.f17883k = t;
        }

        /* renamed from: a */
        private boolean m20204a(int i, AbstractC8299u.C8300a aVar) {
            AbstractC8299u.C8300a aVar2;
            if (aVar != null) {
                aVar2 = AbstractC8246f.this.mo20049E(this.f17883k, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int G = AbstractC8246f.this.m20210G(this.f17883k, i);
            AbstractC8233b0.C8234a aVar3 = this.f17884l;
            if (aVar3.f17837a != G || !C7557q0.m22159c(aVar3.f17838b, aVar2)) {
                this.f17884l = AbstractC8246f.this.m20263u(G, aVar2, 0L);
            }
            AbstractC9815v.C9816a aVar4 = this.f17885m;
            if (aVar4.f21854a == G && C7557q0.m22159c(aVar4.f21855b, aVar2)) {
                return true;
            }
            this.f17885m = AbstractC8246f.this.m20265s(G, aVar2);
            return true;
        }

        /* renamed from: c */
        private C8284q m20202c(C8284q qVar) {
            long F = AbstractC8246f.this.m20211F(this.f17883k, qVar.f18040f);
            long F2 = AbstractC8246f.this.m20211F(this.f17883k, qVar.f18041g);
            if (F == qVar.f18040f && F2 == qVar.f18041g) {
                return qVar;
            }
            return new C8284q(qVar.f18035a, qVar.f18036b, qVar.f18037c, qVar.f18038d, qVar.f18039e, F, F2);
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: C */
        public void mo20205C(int i, AbstractC8299u.C8300a aVar, C8284q qVar) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20244j(m20202c(qVar));
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: b */
        public void mo20203b(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20235s(nVar, m20202c(qVar));
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: m */
        public void mo15305m(int i, AbstractC8299u.C8300a aVar) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15287m();
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: n */
        public void mo15304n(int i, AbstractC8299u.C8300a aVar) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15290j();
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: p */
        public void mo15303p(int i, AbstractC8299u.C8300a aVar) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15292h();
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: r */
        public void mo20201r(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20232v(nVar, m20202c(qVar));
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: s */
        public void mo20200s(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar, IOException iOException, boolean z) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20229y(nVar, m20202c(qVar), iOException, z);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: t */
        public void mo15302t(int i, AbstractC8299u.C8300a aVar, Exception exc) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15288l(exc);
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: v */
        public void mo15301v(int i, AbstractC8299u.C8300a aVar) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15291i();
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: w */
        public void mo20199w(int i, AbstractC8299u.C8300a aVar, C8284q qVar) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20255E(m20202c(qVar));
            }
        }

        @Override // p153i8.AbstractC8233b0
        /* renamed from: x */
        public void mo20198x(int i, AbstractC8299u.C8300a aVar, C8273n nVar, C8284q qVar) {
            if (m20204a(i, aVar)) {
                this.f17884l.m20258B(nVar, m20202c(qVar));
            }
        }

        @Override // p193k7.AbstractC9815v
        /* renamed from: z */
        public void mo15300z(int i, AbstractC8299u.C8300a aVar) {
            if (m20204a(i, aVar)) {
                this.f17885m.m15289k();
            }
        }
    }

    /* renamed from: i8.f$b */
    /* loaded from: classes7.dex */
    private static final class C8248b {

        /* renamed from: a */
        public final AbstractC8299u f17887a;

        /* renamed from: b */
        public final AbstractC8299u.AbstractC8301b f17888b;

        /* renamed from: c */
        public final AbstractC8233b0 f17889c;

        public C8248b(AbstractC8299u uVar, AbstractC8299u.AbstractC8301b bVar, AbstractC8233b0 b0Var) {
            this.f17887a = uVar;
            this.f17888b = bVar;
            this.f17889c = b0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p153i8.AbstractC8230a
    /* renamed from: A */
    public void mo20008A(AbstractC6795x xVar) {
        this.f17882s = xVar;
        this.f17881r = C7557q0.m22117x();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p153i8.AbstractC8230a
    /* renamed from: C */
    public void mo20007C() {
        for (C8248b bVar : this.f17880q.values()) {
            bVar.f17887a.mo20001f(bVar.f17888b);
            bVar.f17887a.mo20003d(bVar.f17889c);
        }
        this.f17880q.clear();
    }

    /* renamed from: E */
    protected abstract AbstractC8299u.C8300a mo20049E(T t, AbstractC8299u.C8300a aVar);

    /* renamed from: F */
    protected long m20211F(T t, long j) {
        return j;
    }

    /* renamed from: G */
    protected int m20210G(T t, int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void m20209H(T t, AbstractC8299u uVar, Timeline timeline);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final void m20208J(final T t, AbstractC8299u uVar) {
        C7510a.m22371a(!this.f17880q.containsKey(t));
        AbstractC8299u.AbstractC8301b eVar = new AbstractC8299u.AbstractC8301b() { // from class: i8.e
            @Override // p153i8.AbstractC8299u.AbstractC8301b
            /* renamed from: a */
            public final void mo19991a(AbstractC8299u uVar2, Timeline timeline) {
                AbstractC8246f.this.m20209H(t, uVar2, timeline);
            }
        };
        C8247a aVar = new C8247a(t);
        this.f17880q.put(t, new C8248b(uVar, eVar, aVar));
        uVar.mo19999h((Handler) C7510a.m22367e(this.f17881r), aVar);
        uVar.mo20005b((Handler) C7510a.m22367e(this.f17881r), aVar);
        uVar.mo20002e(eVar, this.f17882s);
        if (!m20260z()) {
            uVar.mo19993r(eVar);
        }
    }

    @Override // p153i8.AbstractC8299u
    /* renamed from: n */
    public void mo19996n() {
        for (C8248b bVar : this.f17880q.values()) {
            bVar.f17887a.mo19996n();
        }
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: x */
    protected void mo20207x() {
        for (C8248b bVar : this.f17880q.values()) {
            bVar.f17887a.mo19993r(bVar.f17888b);
        }
    }

    @Override // p153i8.AbstractC8230a
    /* renamed from: y */
    protected void mo20206y() {
        for (C8248b bVar : this.f17880q.values()) {
            bVar.f17887a.mo20000g(bVar.f17888b);
        }
    }
}
