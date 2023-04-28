package p194k8;

import android.os.Looper;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5320h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p119g9.C7510a;
import p119g9.C7557q0;
import p152i7.C8223h;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8282p0;
import p153i8.C8273n;
import p153i8.C8274n0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p194k8.AbstractC9834i;

/* renamed from: k8.h */
/* loaded from: classes7.dex */
public class C9831h<T extends AbstractC9834i> implements AbstractC8278o0, AbstractC8282p0, C5320h.AbstractC5322b<AbstractC9827e>, C5320h.AbstractC5326f {

    /* renamed from: A */
    private C6722k f38736A;

    /* renamed from: B */
    private AbstractC9833b<T> f38737B;

    /* renamed from: C */
    private long f38738C;

    /* renamed from: D */
    private long f38739D;

    /* renamed from: E */
    private int f38740E;

    /* renamed from: F */
    private AbstractC9822a f38741F;

    /* renamed from: G */
    boolean f38742G;

    /* renamed from: k */
    public final int f21898k;

    /* renamed from: l */
    private final int[] f21899l;

    /* renamed from: m */
    private final C6722k[] f21900m;

    /* renamed from: n */
    private final boolean[] f21901n;

    /* renamed from: o */
    private final T f21902o;

    /* renamed from: p */
    private final AbstractC8282p0.AbstractC8283a<C9831h<T>> f21903p;

    /* renamed from: q */
    private final AbstractC8233b0.C8234a f21904q;

    /* renamed from: r */
    private final AbstractC5318g f21905r;

    /* renamed from: s */
    private final C5320h f21906s;

    /* renamed from: t */
    private final C9830g f21907t;

    /* renamed from: u */
    private final ArrayList<AbstractC9822a> f21908u;

    /* renamed from: v */
    private final List<AbstractC9822a> f21909v;

    /* renamed from: w */
    private final C8274n0 f21910w;

    /* renamed from: x */
    private final C8274n0[] f21911x;

    /* renamed from: y */
    private final C9824c f21912y;

    /* renamed from: z */
    private AbstractC9827e f21913z;

    /* renamed from: k8.h$a */
    /* loaded from: classes7.dex */
    public final class C9832a implements AbstractC8278o0 {

        /* renamed from: k */
        public final C9831h<T> f21914k;

        /* renamed from: l */
        private final C8274n0 f21915l;

        /* renamed from: m */
        private final int f21916m;

        /* renamed from: n */
        private boolean f21917n;

        public C9832a(C9831h<T> hVar, C8274n0 n0Var, int i) {
            this.f21914k = hVar;
            this.f21915l = n0Var;
            this.f21916m = i;
        }

        /* renamed from: b */
        private void m15219b() {
            if (!this.f21917n) {
                C9831h.this.f21904q.m20245i(C9831h.this.f21899l[this.f21916m], C9831h.this.f21900m[this.f21916m], 0, null, C9831h.this.f38739D);
                this.f21917n = true;
            }
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: a */
        public void mo12456a() {
        }

        /* renamed from: c */
        public void m15218c() {
            C7510a.m22366f(C9831h.this.f21901n[this.f21916m]);
            C9831h.this.f21901n[this.f21916m] = false;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: e */
        public boolean mo12452e() {
            return !C9831h.this.m15238I() && this.f21915l.m20098J(C9831h.this.f38742G);
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: j */
        public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
            if (C9831h.this.m15238I()) {
                return -3;
            }
            if (C9831h.this.f38741F != null && C9831h.this.f38741F.m15263i(this.f21916m + 1) <= this.f21915l.m20106B()) {
                return -3;
            }
            m15219b();
            return this.f21915l.m20091Q(lVar, hVar, z, C9831h.this.f38742G);
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: s */
        public int mo12450s(long j) {
            if (C9831h.this.m15238I()) {
                return 0;
            }
            int D = this.f21915l.m20104D(j, C9831h.this.f38742G);
            if (C9831h.this.f38741F != null) {
                D = Math.min(D, C9831h.this.f38741F.m15263i(this.f21916m + 1) - this.f21915l.m20106B());
            }
            this.f21915l.m20079c0(D);
            if (D > 0) {
                m15219b();
            }
            return D;
        }
    }

    /* renamed from: k8.h$b */
    /* loaded from: classes7.dex */
    public interface AbstractC9833b<T extends AbstractC9834i> {
        /* renamed from: e */
        void mo15217e(C9831h<T> hVar);
    }

    public C9831h(int i, int[] iArr, C6722k[] kVarArr, T t, AbstractC8282p0.AbstractC8283a<C9831h<T>> aVar, AbstractC6765b bVar, long j, AbstractC9818x xVar, AbstractC9815v.C9816a aVar2, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar3) {
        this.f21898k = i;
        int i2 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f21899l = iArr;
        this.f21900m = kVarArr == null ? new C6722k[0] : kVarArr;
        this.f21902o = t;
        this.f21903p = aVar;
        this.f21904q = aVar3;
        this.f21905r = gVar;
        this.f21906s = new C5320h("Loader:ChunkSampleStream");
        this.f21907t = new C9830g();
        ArrayList<AbstractC9822a> arrayList = new ArrayList<>();
        this.f21908u = arrayList;
        this.f21909v = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f21911x = new C8274n0[length];
        this.f21901n = new boolean[length];
        int i3 = length + 1;
        int[] iArr2 = new int[i3];
        C8274n0[] n0VarArr = new C8274n0[i3];
        C8274n0 j2 = C8274n0.m20073j(bVar, (Looper) C7510a.m22367e(Looper.myLooper()), xVar, aVar2);
        this.f21910w = j2;
        iArr2[0] = i;
        n0VarArr[0] = j2;
        while (i2 < length) {
            C8274n0 k = C8274n0.m20072k(bVar);
            this.f21911x[i2] = k;
            int i4 = i2 + 1;
            n0VarArr[i4] = k;
            iArr2[i4] = this.f21899l[i2];
            i2 = i4;
        }
        this.f21912y = new C9824c(iArr2, n0VarArr);
        this.f38738C = j;
        this.f38739D = j;
    }

    /* renamed from: B */
    private void m15245B(int i) {
        int min = Math.min(m15232O(i, 0), this.f38740E);
        if (min > 0) {
            C7557q0.m22200H0(this.f21908u, 0, min);
            this.f38740E -= min;
        }
    }

    /* renamed from: C */
    private void m15244C(int i) {
        C7510a.m22366f(!this.f21906s.m29477j());
        int size = this.f21908u.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (!m15240G(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = m15241F().f21894h;
            AbstractC9822a D = m15243D(i);
            if (this.f21908u.isEmpty()) {
                this.f38738C = this.f38739D;
            }
            this.f38742G = false;
            this.f21904q.m20256D(this.f21898k, D.f21893g, j);
        }
    }

    /* renamed from: D */
    private AbstractC9822a m15243D(int i) {
        AbstractC9822a aVar = this.f21908u.get(i);
        ArrayList<AbstractC9822a> arrayList = this.f21908u;
        C7557q0.m22200H0(arrayList, i, arrayList.size());
        this.f38740E = Math.max(this.f38740E, this.f21908u.size());
        int i2 = 0;
        this.f21910w.m20063t(aVar.m15263i(0));
        while (true) {
            C8274n0[] n0VarArr = this.f21911x;
            if (i2 >= n0VarArr.length) {
                return aVar;
            }
            C8274n0 n0Var = n0VarArr[i2];
            i2++;
            n0Var.m20063t(aVar.m15263i(i2));
        }
    }

    /* renamed from: F */
    private AbstractC9822a m15241F() {
        ArrayList<AbstractC9822a> arrayList = this.f21908u;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: G */
    private boolean m15240G(int i) {
        int B;
        AbstractC9822a aVar = this.f21908u.get(i);
        if (this.f21910w.m20106B() > aVar.m15263i(0)) {
            return true;
        }
        int i2 = 0;
        do {
            C8274n0[] n0VarArr = this.f21911x;
            if (i2 >= n0VarArr.length) {
                return false;
            }
            B = n0VarArr[i2].m20106B();
            i2++;
        } while (B <= aVar.m15263i(i2));
        return true;
    }

    /* renamed from: H */
    private boolean m15239H(AbstractC9827e eVar) {
        return eVar instanceof AbstractC9822a;
    }

    /* renamed from: J */
    private void m15237J() {
        int O = m15232O(this.f21910w.m20106B(), this.f38740E - 1);
        while (true) {
            int i = this.f38740E;
            if (i <= O) {
                this.f38740E = i + 1;
                m15236K(i);
            } else {
                return;
            }
        }
    }

    /* renamed from: K */
    private void m15236K(int i) {
        AbstractC9822a aVar = this.f21908u.get(i);
        C6722k kVar = aVar.f21890d;
        if (!kVar.equals(this.f38736A)) {
            this.f21904q.m20245i(this.f21898k, kVar, aVar.f21891e, aVar.f21892f, aVar.f21893g);
        }
        this.f38736A = kVar;
    }

    /* renamed from: O */
    private int m15232O(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f21908u.size()) {
                return this.f21908u.size() - 1;
            }
        } while (this.f21908u.get(i2).m15263i(0) <= i);
        return i2 - 1;
    }

    /* renamed from: R */
    private void m15229R() {
        this.f21910w.m20088T();
        for (C8274n0 n0Var : this.f21911x) {
            n0Var.m20088T();
        }
    }

    /* renamed from: E */
    public T m15242E() {
        return this.f21902o;
    }

    /* renamed from: I */
    boolean m15238I() {
        return this.f38738C != -9223372036854775807L;
    }

    /* renamed from: L */
    public void mo10446i(AbstractC9827e eVar, long j, long j2, boolean z) {
        this.f21913z = null;
        this.f38741F = null;
        C8273n nVar = new C8273n(eVar.f21887a, eVar.f21888b, eVar.m15253f(), eVar.m15254e(), j, j2, eVar.m15256b());
        this.f21905r.mo29486d(eVar.f21887a);
        this.f21904q.m20236r(nVar, eVar.f21889c, this.f21898k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
        if (!z) {
            if (m15238I()) {
                m15229R();
            } else if (m15239H(eVar)) {
                m15243D(this.f21908u.size() - 1);
                if (this.f21908u.isEmpty()) {
                    this.f38738C = this.f38739D;
                }
            }
            this.f21903p.mo12471i(this);
        }
    }

    /* renamed from: M */
    public void mo10444k(AbstractC9827e eVar, long j, long j2) {
        this.f21913z = null;
        this.f21902o.mo15212f(eVar);
        C8273n nVar = new C8273n(eVar.f21887a, eVar.f21888b, eVar.m15253f(), eVar.m15254e(), j, j2, eVar.m15256b());
        this.f21905r.mo29486d(eVar.f21887a);
        this.f21904q.m20233u(nVar, eVar.f21889c, this.f21898k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
        this.f21903p.mo12471i(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.C5320h.C5323c mo10440o(p194k8.AbstractC9827e r37, long r38, long r40, java.io.IOException r42, int r43) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p194k8.C9831h.mo10440o(k8.e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.h$c");
    }

    /* renamed from: P */
    public void m15231P() {
        m15230Q(null);
    }

    /* renamed from: Q */
    public void m15230Q(AbstractC9833b<T> bVar) {
        this.f38737B = bVar;
        this.f21910w.m20092P();
        for (C8274n0 n0Var : this.f21911x) {
            n0Var.m20092P();
        }
        this.f21906s.m29474m(this);
    }

    /* renamed from: S */
    public void m15228S(long j) {
        AbstractC9822a aVar;
        boolean z;
        boolean z2;
        this.f38739D = j;
        if (m15238I()) {
            this.f38738C = j;
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f21908u.size(); i2++) {
            aVar = this.f21908u.get(i2);
            int i3 = (aVar.f21893g > j ? 1 : (aVar.f21893g == j ? 0 : -1));
            if (i3 == 0 && aVar.f21861k == -9223372036854775807L) {
                break;
            } else if (i3 > 0) {
                break;
            }
        }
        aVar = null;
        if (aVar != null) {
            z = this.f21910w.m20085W(aVar.m15263i(0));
        } else {
            C8274n0 n0Var = this.f21910w;
            if (j < mo12421b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = n0Var.m20084X(j, z2);
        }
        if (z) {
            this.f38740E = m15232O(this.f21910w.m20106B(), 0);
            C8274n0[] n0VarArr = this.f21911x;
            int length = n0VarArr.length;
            while (i < length) {
                n0VarArr[i].m20084X(j, true);
                i++;
            }
            return;
        }
        this.f38738C = j;
        this.f38742G = false;
        this.f21908u.clear();
        this.f38740E = 0;
        if (this.f21906s.m29477j()) {
            this.f21910w.m20066q();
            C8274n0[] n0VarArr2 = this.f21911x;
            int length2 = n0VarArr2.length;
            while (i < length2) {
                n0VarArr2[i].m20066q();
                i++;
            }
            this.f21906s.m29481f();
            return;
        }
        this.f21906s.m29480g();
        m15229R();
    }

    /* renamed from: T */
    public C9831h<T>.C9832a m15227T(long j, int i) {
        for (int i2 = 0; i2 < this.f21911x.length; i2++) {
            if (this.f21899l[i2] == i) {
                C7510a.m22366f(!this.f21901n[i2]);
                this.f21901n[i2] = true;
                this.f21911x[i2].m20084X(j, true);
                return new C9832a(this, this.f21911x[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: a */
    public void mo12456a() {
        this.f21906s.mo24321a();
        this.f21910w.m20096L();
        if (!this.f21906s.m29477j()) {
            this.f21902o.mo15216a();
        }
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        if (m15238I()) {
            return this.f38738C;
        }
        if (this.f38742G) {
            return Long.MIN_VALUE;
        }
        return m15241F().f21894h;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f21906s.m29477j();
    }

    /* renamed from: d */
    public long m15226d(long j, C6736w wVar) {
        return this.f21902o.mo15214d(j, wVar);
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: e */
    public boolean mo12452e() {
        return !m15238I() && this.f21910w.m20098J(this.f38742G);
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        long j2;
        List<AbstractC9822a> list;
        if (this.f38742G || this.f21906s.m29477j() || this.f21906s.m29478i()) {
            return false;
        }
        boolean I = m15238I();
        if (I) {
            list = Collections.emptyList();
            j2 = this.f38738C;
        } else {
            list = this.f21909v;
            j2 = m15241F().f21894h;
        }
        this.f21902o.mo15211h(j, j2, list, this.f21907t);
        C9830g gVar = this.f21907t;
        boolean z = gVar.f21897b;
        AbstractC9827e eVar = gVar.f21896a;
        gVar.m15247a();
        if (z) {
            this.f38738C = -9223372036854775807L;
            this.f38742G = true;
            return true;
        } else if (eVar == null) {
            return false;
        } else {
            this.f21913z = eVar;
            if (m15239H(eVar)) {
                AbstractC9822a aVar = (AbstractC9822a) eVar;
                if (I) {
                    long j3 = aVar.f21893g;
                    long j4 = this.f38738C;
                    if (j3 != j4) {
                        this.f21910w.m20082Z(j4);
                        for (C8274n0 n0Var : this.f21911x) {
                            n0Var.m20082Z(this.f38738C);
                        }
                    }
                    this.f38738C = -9223372036854775807L;
                }
                aVar.m15261k(this.f21912y);
                this.f21908u.add(aVar);
            } else if (eVar instanceof C9837l) {
                ((C9837l) eVar).m15206g(this.f21912y);
            }
            this.f21904q.m20259A(new C8273n(eVar.f21887a, eVar.f21888b, this.f21906s.m29473n(eVar, this, this.f21905r.mo29487c(eVar.f21889c))), eVar.f21889c, this.f21898k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
            return true;
        }
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        if (this.f38742G) {
            return Long.MIN_VALUE;
        }
        if (m15238I()) {
            return this.f38738C;
        }
        long j = this.f38739D;
        AbstractC9822a F = m15241F();
        if (!F.mo12495h()) {
            if (this.f21908u.size() > 1) {
                ArrayList<AbstractC9822a> arrayList = this.f21908u;
                F = arrayList.get(arrayList.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j = Math.max(j, F.f21894h);
        }
        return Math.max(j, this.f21910w.m20059y());
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        if (!this.f21906s.m29478i() && !m15238I()) {
            if (this.f21906s.m29477j()) {
                AbstractC9827e eVar = (AbstractC9827e) C7510a.m22367e(this.f21913z);
                if ((!m15239H(eVar) || !m15240G(this.f21908u.size() - 1)) && this.f21902o.mo15213e(j, eVar, this.f21909v)) {
                    this.f21906s.m29481f();
                    if (m15239H(eVar)) {
                        this.f38741F = (AbstractC9822a) eVar;
                        return;
                    }
                    return;
                }
                return;
            }
            int j2 = this.f21902o.mo15210j(j, this.f21909v);
            if (j2 < this.f21908u.size()) {
                m15244C(j2);
            }
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: j */
    public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
        if (m15238I()) {
            return -3;
        }
        AbstractC9822a aVar = this.f38741F;
        if (aVar != null && aVar.m15263i(0) <= this.f21910w.m20106B()) {
            return -3;
        }
        m15237J();
        return this.f21910w.m20091Q(lVar, hVar, z, this.f38742G);
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5326f
    /* renamed from: p */
    public void mo12402p() {
        this.f21910w.m20090R();
        for (C8274n0 n0Var : this.f21911x) {
            n0Var.m20090R();
        }
        this.f21902o.release();
        AbstractC9833b<T> bVar = this.f38737B;
        if (bVar != null) {
            bVar.mo15217e(this);
        }
    }

    @Override // p153i8.AbstractC8278o0
    /* renamed from: s */
    public int mo12450s(long j) {
        if (m15238I()) {
            return 0;
        }
        int D = this.f21910w.m20104D(j, this.f38742G);
        AbstractC9822a aVar = this.f38741F;
        if (aVar != null) {
            D = Math.min(D, aVar.m15263i(0) - this.f21910w.m20106B());
        }
        this.f21910w.m20079c0(D);
        m15237J();
        return D;
    }

    /* renamed from: u */
    public void m15225u(long j, boolean z) {
        if (!m15238I()) {
            int w = this.f21910w.m20061w();
            this.f21910w.m20067p(j, z, true);
            int w2 = this.f21910w.m20061w();
            if (w2 > w) {
                long x = this.f21910w.m20060x();
                int i = 0;
                while (true) {
                    C8274n0[] n0VarArr = this.f21911x;
                    if (i >= n0VarArr.length) {
                        break;
                    }
                    n0VarArr[i].m20067p(x, z, this.f21901n[i]);
                    i++;
                }
            }
            m15245B(w2);
        }
    }
}
