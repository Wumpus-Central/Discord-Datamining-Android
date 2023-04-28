package p244n8;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import cc.AbstractC3884i0;
import cc.C3976z0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5320h;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p028b8.C3396a;
import p028b8.C3397b;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6728o;
import p080e8.C6758l;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6774h;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7562u;
import p119g9.C7570y;
import p152i7.C8223h;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8278o0;
import p153i8.AbstractC8282p0;
import p153i8.C8273n;
import p153i8.C8274n0;
import p153i8.C8284q;
import p153i8.C8302u0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p193k7.C9798l;
import p194k8.AbstractC9827e;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10498a0;
import p228m7.C10513h;
import p244n8.C10732f;
import p244n8.C10748q;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n8.q */
/* loaded from: classes7.dex */
public final class C10748q implements C5320h.AbstractC5322b<AbstractC9827e>, C5320h.AbstractC5326f, AbstractC8282p0, AbstractC10516k, C8274n0.AbstractC8276b {

    /* renamed from: h0 */
    private static final Set<Integer> f23868h0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: C */
    private final Map<String, C9798l> f38847C;

    /* renamed from: D */
    private AbstractC9827e f38848D;

    /* renamed from: G */
    private Set<Integer> f38851G;

    /* renamed from: H */
    private SparseIntArray f38852H;

    /* renamed from: I */
    private AbstractC10500b0 f38853I;

    /* renamed from: J */
    private int f38854J;

    /* renamed from: K */
    private int f38855K;

    /* renamed from: L */
    private boolean f38856L;

    /* renamed from: M */
    private boolean f38857M;

    /* renamed from: N */
    private int f38858N;

    /* renamed from: O */
    private C6722k f38859O;

    /* renamed from: P */
    private C6722k f38860P;

    /* renamed from: Q */
    private boolean f38861Q;

    /* renamed from: R */
    private TrackGroupArray f38862R;

    /* renamed from: S */
    private Set<C8302u0> f38863S;

    /* renamed from: T */
    private int[] f38864T;

    /* renamed from: U */
    private int f38865U;

    /* renamed from: V */
    private boolean f38866V;

    /* renamed from: Y */
    private long f38869Y;

    /* renamed from: Z */
    private long f38870Z;

    /* renamed from: a0 */
    private boolean f23869a0;

    /* renamed from: b0 */
    private boolean f23870b0;

    /* renamed from: c0 */
    private boolean f23871c0;

    /* renamed from: d0 */
    private boolean f23872d0;

    /* renamed from: e0 */
    private long f23873e0;

    /* renamed from: f0 */
    private C9798l f23874f0;

    /* renamed from: g0 */
    private C10740i f23875g0;

    /* renamed from: k */
    private final int f23876k;

    /* renamed from: l */
    private final AbstractC10750b f23877l;

    /* renamed from: m */
    private final C10732f f23878m;

    /* renamed from: n */
    private final AbstractC6765b f23879n;

    /* renamed from: o */
    private final C6722k f23880o;

    /* renamed from: p */
    private final AbstractC9818x f23881p;

    /* renamed from: q */
    private final AbstractC9815v.C9816a f23882q;

    /* renamed from: r */
    private final AbstractC5318g f23883r;

    /* renamed from: t */
    private final AbstractC8233b0.C8234a f23885t;

    /* renamed from: u */
    private final int f23886u;

    /* renamed from: w */
    private final ArrayList<C10740i> f23888w;

    /* renamed from: x */
    private final List<C10740i> f23889x;

    /* renamed from: s */
    private final C5320h f23884s = new C5320h("Loader:HlsSampleStreamWrapper");

    /* renamed from: v */
    private final C10732f.C10734b f23887v = new C10732f.C10734b();

    /* renamed from: F */
    private int[] f38850F = new int[0];

    /* renamed from: E */
    private C10752d[] f38849E = new C10752d[0];

    /* renamed from: X */
    private boolean[] f38868X = new boolean[0];

    /* renamed from: W */
    private boolean[] f38867W = new boolean[0];

    /* renamed from: B */
    private final ArrayList<C10744m> f38846B = new ArrayList<>();

    /* renamed from: y */
    private final Runnable f23890y = new Runnable() { // from class: n8.n
        @Override // java.lang.Runnable
        public final void run() {
            C10748q.this.m12431S();
        }
    };

    /* renamed from: z */
    private final Runnable f23891z = new Runnable() { // from class: n8.o
        @Override // java.lang.Runnable
        public final void run() {
            C10748q.this.m12420b0();
        }
    };

    /* renamed from: A */
    private final Handler f38845A = C7557q0.m22117x();

    /* renamed from: n8.q$b */
    /* loaded from: classes7.dex */
    public interface AbstractC10750b extends AbstractC8282p0.AbstractC8283a<C10748q> {
        /* renamed from: a */
        void mo12392a();

        /* renamed from: o */
        void mo12391o(Uri uri);
    }

    /* renamed from: n8.q$c */
    /* loaded from: classes7.dex */
    private static class C10751c implements AbstractC10500b0 {

        /* renamed from: g */
        private static final C6722k f23892g = new C6722k.C6724b().m24488e0("application/id3").m24519E();

        /* renamed from: h */
        private static final C6722k f23893h = new C6722k.C6724b().m24488e0("application/x-emsg").m24519E();

        /* renamed from: a */
        private final C3397b f23894a = new C3397b();

        /* renamed from: b */
        private final AbstractC10500b0 f23895b;

        /* renamed from: c */
        private final C6722k f23896c;

        /* renamed from: d */
        private C6722k f23897d;

        /* renamed from: e */
        private byte[] f23898e;

        /* renamed from: f */
        private int f23899f;

        public C10751c(AbstractC10500b0 b0Var, int i) {
            this.f23895b = b0Var;
            if (i == 1) {
                this.f23896c = f23892g;
            } else if (i == 3) {
                this.f23896c = f23893h;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i);
            }
            this.f23898e = new byte[0];
            this.f23899f = 0;
        }

        /* renamed from: g */
        private boolean m12385g(C3396a aVar) {
            C6722k g = aVar.mo179g();
            if (g == null || !C7557q0.m22159c(this.f23896c.f14329v, g.f14329v)) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        private void m12384h(int i) {
            byte[] bArr = this.f23898e;
            if (bArr.length < i) {
                this.f23898e = Arrays.copyOf(bArr, i + (i / 2));
            }
        }

        /* renamed from: i */
        private C7570y m12383i(int i, int i2) {
            int i3 = this.f23899f - i2;
            C7570y yVar = new C7570y(Arrays.copyOfRange(this.f23898e, i3 - i, i3));
            byte[] bArr = this.f23898e;
            System.arraycopy(bArr, i3, bArr, 0, i2);
            this.f23899f = i2;
            return yVar;
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: a */
        public int mo12390a(AbstractC6774h hVar, int i, boolean z, int i2) {
            m12384h(this.f23899f + i);
            int read = hVar.read(this.f23898e, this.f23899f, i);
            if (read != -1) {
                this.f23899f += read;
                return read;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: b */
        public void mo12389b(C7570y yVar, int i, int i2) {
            m12384h(this.f23899f + i);
            yVar.m22006j(this.f23898e, this.f23899f, i);
            this.f23899f += i;
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: c */
        public void mo12382c(long j, int i, int i2, int i3, AbstractC10500b0.C10501a aVar) {
            C7510a.m22367e(this.f23897d);
            C7570y i4 = m12383i(i2, i3);
            if (!C7557q0.m22159c(this.f23897d.f14329v, this.f23896c.f14329v)) {
                if ("application/x-emsg".equals(this.f23897d.f14329v)) {
                    C3396a c = this.f23894a.m34518c(i4);
                    if (!m12385g(c)) {
                        C7558r.m22104h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f23896c.f14329v, c.mo179g()));
                        return;
                    }
                    i4 = new C7570y((byte[]) C7510a.m22367e(c.mo180Q()));
                } else {
                    C7558r.m22104h("EmsgUnwrappingTrackOutput", "Ignoring sample for unsupported format: " + this.f23897d.f14329v);
                    return;
                }
            }
            int a = i4.m22015a();
            this.f23895b.mo12386f(i4, a);
            this.f23895b.mo12382c(j, i, a, i3, aVar);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: d */
        public void mo12388d(C6722k kVar) {
            this.f23897d = kVar;
            this.f23895b.mo12388d(this.f23896c);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: e */
        public /* synthetic */ int mo12387e(AbstractC6774h hVar, int i, boolean z) {
            return C10498a0.m13009a(this, hVar, i, z);
        }

        @Override // p228m7.AbstractC10500b0
        /* renamed from: f */
        public /* synthetic */ void mo12386f(C7570y yVar, int i) {
            C10498a0.m13008b(this, yVar, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n8.q$d */
    /* loaded from: classes7.dex */
    public static final class C10752d extends C8274n0 {

        /* renamed from: J */
        private final Map<String, C9798l> f38871J;

        /* renamed from: K */
        private C9798l f38872K;

        /* renamed from: f0 */
        private C14576a m12381f0(C14576a aVar) {
            if (aVar == null) {
                return null;
            }
            int f = aVar.m183f();
            int i = 0;
            while (true) {
                if (i >= f) {
                    i = -1;
                    break;
                }
                C14576a.AbstractC14577b e = aVar.m184e(i);
                if ((e instanceof C6758l) && "com.apple.streaming.transportStreamTimestamp".equals(((C6758l) e).f14411l)) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return aVar;
            }
            if (f == 1) {
                return null;
            }
            C14576a.AbstractC14577b[] bVarArr = new C14576a.AbstractC14577b[f - 1];
            for (int i2 = 0; i2 < f; i2++) {
                if (i2 != i) {
                    bVarArr[i2 < i ? i2 : i2 - 1] = aVar.m184e(i2);
                }
            }
            return new C14576a(bVarArr);
        }

        @Override // p153i8.C8274n0, p228m7.AbstractC10500b0
        /* renamed from: c */
        public void mo12382c(long j, int i, int i2, int i3, AbstractC10500b0.C10501a aVar) {
            super.mo12382c(j, i, i2, i3, aVar);
        }

        /* renamed from: g0 */
        public void m12380g0(C9798l lVar) {
            this.f38872K = lVar;
            m20100H();
        }

        /* renamed from: h0 */
        public void m12379h0(C10740i iVar) {
            m20078d0(iVar.f23829k);
        }

        @Override // p153i8.C8274n0
        /* renamed from: v */
        public C6722k mo12378v(C6722k kVar) {
            C9798l lVar;
            C9798l lVar2 = this.f38872K;
            if (lVar2 == null) {
                lVar2 = kVar.f14332y;
            }
            if (!(lVar2 == null || (lVar = this.f38871J.get(lVar2.f21833m)) == null)) {
                lVar2 = lVar;
            }
            C14576a f0 = m12381f0(kVar.f14327t);
            if (!(lVar2 == kVar.f14332y && f0 == kVar.f14327t)) {
                kVar = kVar.m24531a().m24512L(lVar2).m24500X(f0).m24519E();
            }
            return super.mo12378v(kVar);
        }

        private C10752d(AbstractC6765b bVar, Looper looper, AbstractC9818x xVar, AbstractC9815v.C9816a aVar, Map<String, C9798l> map) {
            super(bVar, looper, xVar, aVar);
            this.f38871J = map;
        }
    }

    public C10748q(int i, AbstractC10750b bVar, C10732f fVar, Map<String, C9798l> map, AbstractC6765b bVar2, long j, C6722k kVar, AbstractC9818x xVar, AbstractC9815v.C9816a aVar, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar2, int i2) {
        this.f23876k = i;
        this.f23877l = bVar;
        this.f23878m = fVar;
        this.f38847C = map;
        this.f23879n = bVar2;
        this.f23880o = kVar;
        this.f23881p = xVar;
        this.f23882q = aVar;
        this.f23883r = gVar;
        this.f23885t = aVar2;
        this.f23886u = i2;
        Set<Integer> set = f23868h0;
        this.f38851G = new HashSet(set.size());
        this.f38852H = new SparseIntArray(set.size());
        ArrayList<C10740i> arrayList = new ArrayList<>();
        this.f23888w = arrayList;
        this.f23889x = Collections.unmodifiableList(arrayList);
        this.f38869Y = j;
        this.f38870Z = j;
    }

    /* renamed from: A */
    private boolean m12449A(int i) {
        for (int i2 = i; i2 < this.f23888w.size(); i2++) {
            if (this.f23888w.get(i2).f23832n) {
                return false;
            }
        }
        C10740i iVar = this.f23888w.get(i);
        for (int i3 = 0; i3 < this.f38849E.length; i3++) {
            if (this.f38849E[i3].m20106B() > iVar.m12490m(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private static C10513h m12447C(int i, int i2) {
        C7558r.m22104h("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new C10513h();
    }

    /* renamed from: D */
    private C8274n0 m12446D(int i, int i2) {
        int length = this.f38849E.length;
        boolean z = true;
        if (!(i2 == 1 || i2 == 2)) {
            z = false;
        }
        C10752d dVar = new C10752d(this.f23879n, this.f38845A.getLooper(), this.f23881p, this.f23882q, this.f38847C);
        dVar.m20082Z(this.f38869Y);
        if (z) {
            dVar.m12380g0(this.f23874f0);
        }
        dVar.m20083Y(this.f23873e0);
        C10740i iVar = this.f23875g0;
        if (iVar != null) {
            dVar.m12379h0(iVar);
        }
        dVar.m20080b0(this);
        int i3 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f38850F, i3);
        this.f38850F = copyOf;
        copyOf[length] = i;
        this.f38849E = (C10752d[]) C7557q0.m22112z0(this.f38849E, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f38868X, i3);
        this.f38868X = copyOf2;
        copyOf2[length] = z;
        this.f38866V |= z;
        this.f38851G.add(Integer.valueOf(i2));
        this.f38852H.append(i2, length);
        if (m12437M(i2) > m12437M(this.f38854J)) {
            this.f38855K = length;
            this.f38854J = i2;
        }
        this.f38867W = Arrays.copyOf(this.f38867W, i3);
        return dVar;
    }

    /* renamed from: E */
    private TrackGroupArray m12445E(C8302u0[] u0VarArr) {
        for (int i = 0; i < u0VarArr.length; i++) {
            C8302u0 u0Var = u0VarArr[i];
            C6722k[] kVarArr = new C6722k[u0Var.f18099k];
            for (int i2 = 0; i2 < u0Var.f18099k; i2++) {
                C6722k a = u0Var.m19990a(i2);
                kVarArr[i2] = a.m24530b(this.f23881p.mo15277a(a));
            }
            u0VarArr[i] = new C8302u0(kVarArr);
        }
        return new TrackGroupArray(u0VarArr);
    }

    /* renamed from: F */
    private static C6722k m12444F(C6722k kVar, C6722k kVar2, boolean z) {
        String str;
        String str2;
        int i;
        int i2;
        if (kVar == null) {
            return kVar2;
        }
        int l = C7562u.m22076l(kVar2.f14329v);
        if (C7557q0.m22197J(kVar.f14326s, l) == 1) {
            str2 = C7557q0.m22195K(kVar.f14326s, l);
            str = C7562u.m22081g(str2);
        } else {
            str2 = C7562u.m22084d(kVar.f14326s, kVar2.f14329v);
            str = kVar2.f14329v;
        }
        C6722k.C6724b c0 = kVar2.m24531a().m24505S(kVar.f14318k).m24503U(kVar.f14319l).m24502V(kVar.f14320m).m24484g0(kVar.f14321n).m24492c0(kVar.f14322o);
        if (z) {
            i = kVar.f14323p;
        } else {
            i = -1;
        }
        C6722k.C6724b G = c0.m24517G(i);
        if (z) {
            i2 = kVar.f14324q;
        } else {
            i2 = -1;
        }
        C6722k.C6724b Q = G.m24498Z(i2).m24515I(str2).m24478j0(kVar.f37961A).m24507Q(kVar.f37962B);
        if (str != null) {
            Q.m24488e0(str);
        }
        int i3 = kVar.f37969I;
        if (i3 != -1) {
            Q.m24516H(i3);
        }
        C14576a aVar = kVar.f14327t;
        if (aVar != null) {
            C14576a aVar2 = kVar2.f14327t;
            if (aVar2 != null) {
                aVar = aVar2.m185b(aVar);
            }
            Q.m24500X(aVar);
        }
        return Q.m24519E();
    }

    /* renamed from: G */
    private void m12443G(int i) {
        C7510a.m22366f(!this.f23884s.m29477j());
        while (true) {
            if (i >= this.f23888w.size()) {
                i = -1;
                break;
            } else if (m12449A(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            long j = m12439K().f21894h;
            C10740i H = m12442H(i);
            if (this.f23888w.isEmpty()) {
                this.f38870Z = this.f38869Y;
            } else {
                ((C10740i) C3976z0.m33215c(this.f23888w)).m12488o();
            }
            this.f23871c0 = false;
            this.f23885t.m20256D(this.f38854J, H.f21893g, j);
        }
    }

    /* renamed from: H */
    private C10740i m12442H(int i) {
        C10740i iVar = this.f23888w.get(i);
        ArrayList<C10740i> arrayList = this.f23888w;
        C7557q0.m22200H0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.f38849E.length; i2++) {
            this.f38849E[i2].m20063t(iVar.m12490m(i2));
        }
        return iVar;
    }

    /* renamed from: I */
    private boolean m12441I(C10740i iVar) {
        int i = iVar.f23829k;
        int length = this.f38849E.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.f38867W[i2] && this.f38849E[i2].m20093O() == i) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J */
    private static boolean m12440J(C6722k kVar, C6722k kVar2) {
        String str = kVar.f14329v;
        String str2 = kVar2.f14329v;
        int l = C7562u.m22076l(str);
        if (l != 3) {
            if (l == C7562u.m22076l(str2)) {
                return true;
            }
            return false;
        } else if (!C7557q0.m22159c(str, str2)) {
            return false;
        } else {
            if (("application/cea-608".equals(str) || "application/cea-708".equals(str)) && kVar.f37974N != kVar2.f37974N) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: K */
    private C10740i m12439K() {
        ArrayList<C10740i> arrayList = this.f23888w;
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: L */
    private AbstractC10500b0 m12438L(int i, int i2) {
        C7510a.m22371a(f23868h0.contains(Integer.valueOf(i2)));
        int i3 = this.f38852H.get(i2, -1);
        if (i3 == -1) {
            return null;
        }
        if (this.f38851G.add(Integer.valueOf(i2))) {
            this.f38850F[i3] = i;
        }
        if (this.f38850F[i3] == i) {
            return this.f38849E[i3];
        }
        return m12447C(i, i2);
    }

    /* renamed from: M */
    private static int m12437M(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: N */
    private void m12436N(C10740i iVar) {
        C10752d[] dVarArr;
        this.f23875g0 = iVar;
        this.f38859O = iVar.f21890d;
        this.f38870Z = -9223372036854775807L;
        this.f23888w.add(iVar);
        AbstractC3884i0.C3886b s = AbstractC3884i0.m33403s();
        for (C10752d dVar : this.f38849E) {
            s.m33395b(Integer.valueOf(dVar.m20102F()));
        }
        iVar.m12489n(this, s.m33394c());
        for (C10752d dVar2 : this.f38849E) {
            dVar2.m12379h0(iVar);
            if (iVar.f23832n) {
                dVar2.m20077e0();
            }
        }
    }

    /* renamed from: O */
    private static boolean m12435O(AbstractC9827e eVar) {
        return eVar instanceof C10740i;
    }

    /* renamed from: P */
    private boolean m12434P() {
        return this.f38870Z != -9223372036854775807L;
    }

    /* renamed from: R */
    private void m12432R() {
        int i = this.f38862R.f9362k;
        int[] iArr = new int[i];
        this.f38864T = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                C10752d[] dVarArr = this.f38849E;
                if (i3 >= dVarArr.length) {
                    break;
                } else if (m12440J((C6722k) C7510a.m22364h(dVarArr[i3].m20103E()), this.f38862R.m29997a(i2).m19990a(0))) {
                    this.f38864T[i2] = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        Iterator<C10744m> it = this.f38846B.iterator();
        while (it.hasNext()) {
            it.next().m12455b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m12431S() {
        if (!this.f38861Q && this.f38864T == null && this.f38856L) {
            for (C10752d dVar : this.f38849E) {
                if (dVar.m20103E() == null) {
                    return;
                }
            }
            if (this.f38862R != null) {
                m12432R();
                return;
            }
            m12393z();
            m12407k0();
            this.f23877l.mo12392a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public void m12420b0() {
        this.f38856L = true;
        m12431S();
    }

    /* renamed from: f0 */
    private void m12414f0() {
        for (C10752d dVar : this.f38849E) {
            dVar.m20087U(this.f23869a0);
        }
        this.f23869a0 = false;
    }

    /* renamed from: g0 */
    private boolean m12412g0(long j) {
        int length = this.f38849E.length;
        for (int i = 0; i < length; i++) {
            if (!this.f38849E[i].m20084X(j, false) && (this.f38868X[i] || !this.f38866V)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k0 */
    private void m12407k0() {
        this.f38857M = true;
    }

    /* renamed from: p0 */
    private void m12401p0(AbstractC8278o0[] o0VarArr) {
        this.f38846B.clear();
        for (AbstractC8278o0 o0Var : o0VarArr) {
            if (o0Var != null) {
                this.f38846B.add((C10744m) o0Var);
            }
        }
    }

    /* renamed from: x */
    private void m12395x() {
        C7510a.m22366f(this.f38857M);
        C7510a.m22367e(this.f38862R);
        C7510a.m22367e(this.f38863S);
    }

    /* renamed from: z */
    private void m12393z() {
        C6722k kVar;
        int length = this.f38849E.length;
        boolean z = false;
        int i = 7;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i3 >= length) {
                break;
            }
            String str = ((C6722k) C7510a.m22364h(this.f38849E[i3].m20103E())).f14329v;
            if (!C7562u.m22069s(str)) {
                if (C7562u.m22072p(str)) {
                    i4 = 1;
                } else if (C7562u.m22070r(str)) {
                    i4 = 3;
                } else {
                    i4 = 7;
                }
            }
            if (m12437M(i4) > m12437M(i)) {
                i2 = i3;
                i = i4;
            } else if (i4 == i && i2 != -1) {
                i2 = -1;
            }
            i3++;
        }
        C8302u0 i5 = this.f23878m.m12519i();
        int i6 = i5.f18099k;
        this.f38865U = -1;
        this.f38864T = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.f38864T[i7] = i7;
        }
        C8302u0[] u0VarArr = new C8302u0[length];
        for (int i8 = 0; i8 < length; i8++) {
            C6722k kVar2 = (C6722k) C7510a.m22364h(this.f38849E[i8].m20103E());
            if (i8 == i2) {
                C6722k[] kVarArr = new C6722k[i6];
                if (i6 == 1) {
                    kVarArr[0] = kVar2.m24526j(i5.m19990a(0));
                } else {
                    for (int i9 = 0; i9 < i6; i9++) {
                        kVarArr[i9] = m12444F(i5.m19990a(i9), kVar2, true);
                    }
                }
                u0VarArr[i8] = new C8302u0(kVarArr);
                this.f38865U = i8;
            } else {
                if (i != 2 || !C7562u.m22072p(kVar2.f14329v)) {
                    kVar = null;
                } else {
                    kVar = this.f23880o;
                }
                u0VarArr[i8] = new C8302u0(m12444F(kVar, kVar2, false));
            }
        }
        this.f38862R = m12445E(u0VarArr);
        if (this.f38863S == null) {
            z = true;
        }
        C7510a.m22366f(z);
        this.f38863S = Collections.emptySet();
    }

    /* renamed from: B */
    public void m12448B() {
        if (!this.f38857M) {
            mo12415f(this.f38869Y);
        }
    }

    /* renamed from: Q */
    public boolean m12433Q(int i) {
        return !m12434P() && this.f38849E[i].m20098J(this.f23871c0);
    }

    /* renamed from: T */
    public void m12430T() {
        this.f23884s.mo24321a();
        this.f23878m.m12515m();
    }

    /* renamed from: U */
    public void m12429U(int i) {
        m12430T();
        this.f38849E[i].m20096L();
    }

    /* renamed from: V */
    public void mo10446i(AbstractC9827e eVar, long j, long j2, boolean z) {
        this.f38848D = null;
        C8273n nVar = new C8273n(eVar.f21887a, eVar.f21888b, eVar.m15253f(), eVar.m15254e(), j, j2, eVar.m15256b());
        this.f23883r.mo29486d(eVar.f21887a);
        this.f23885t.m20236r(nVar, eVar.f21889c, this.f23876k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
        if (!z) {
            if (m12434P() || this.f38858N == 0) {
                m12414f0();
            }
            if (this.f38858N > 0) {
                this.f23877l.mo12471i(this);
            }
        }
    }

    /* renamed from: W */
    public void mo10444k(AbstractC9827e eVar, long j, long j2) {
        this.f38848D = null;
        this.f23878m.m12514n(eVar);
        C8273n nVar = new C8273n(eVar.f21887a, eVar.f21888b, eVar.m15253f(), eVar.m15254e(), j, j2, eVar.m15256b());
        this.f23883r.mo29486d(eVar.f21887a);
        this.f23885t.m20233u(nVar, eVar.f21889c, this.f23876k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
        if (!this.f38857M) {
            mo12415f(this.f38869Y);
        } else {
            this.f23877l.mo12471i(this);
        }
    }

    /* renamed from: X */
    public C5320h.C5323c mo10440o(AbstractC9827e eVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        C5320h.C5323c cVar;
        int i2;
        boolean O = m12435O(eVar);
        if (O && !((C10740i) eVar).m12486q() && (iOException instanceof AbstractC5311f.C0146f) && ((i2 = ((AbstractC5311f.C0146f) iOException).f9864m) == 410 || i2 == 404)) {
            return C5320h.f9874d;
        }
        long b = eVar.m15256b();
        C8273n nVar = new C8273n(eVar.f21887a, eVar.f21888b, eVar.m15253f(), eVar.m15254e(), j, j2, b);
        AbstractC5318g.C5319a aVar = new AbstractC5318g.C5319a(nVar, new C8284q(eVar.f21889c, this.f23876k, eVar.f21890d, eVar.f21891e, eVar.f21892f, C6713c.m24565d(eVar.f21893g), C6713c.m24565d(eVar.f21894h)), iOException, i);
        long b2 = this.f23883r.mo29488b(aVar);
        boolean z2 = false;
        if (b2 != -9223372036854775807L) {
            z = this.f23878m.m12516l(eVar, b2);
        } else {
            z = false;
        }
        if (z) {
            if (O && b == 0) {
                ArrayList<C10740i> arrayList = this.f23888w;
                if (arrayList.remove(arrayList.size() - 1) == eVar) {
                    z2 = true;
                }
                C7510a.m22366f(z2);
                if (this.f23888w.isEmpty()) {
                    this.f38870Z = this.f38869Y;
                } else {
                    ((C10740i) C3976z0.m33215c(this.f23888w)).m12488o();
                }
            }
            cVar = C5320h.f9876f;
        } else {
            long a = this.f23883r.mo29489a(aVar);
            if (a != -9223372036854775807L) {
                cVar = C5320h.m29479h(false, a);
            } else {
                cVar = C5320h.f9877g;
            }
        }
        boolean z3 = !cVar.m29470c();
        this.f23885t.m20231w(nVar, eVar.f21889c, this.f23876k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h, iOException, z3);
        if (z3) {
            this.f38848D = null;
            this.f23883r.mo29486d(eVar.f21887a);
        }
        if (z) {
            if (!this.f38857M) {
                mo12415f(this.f38869Y);
            } else {
                this.f23877l.mo12471i(this);
            }
        }
        return cVar;
    }

    /* renamed from: Y */
    public void m12425Y() {
        this.f38851G.clear();
    }

    /* renamed from: Z */
    public boolean m12424Z(Uri uri, long j) {
        return this.f23878m.m12513o(uri, j);
    }

    @Override // p153i8.C8274n0.AbstractC8276b
    /* renamed from: a */
    public void mo12423a(C6722k kVar) {
        this.f38845A.post(this.f23890y);
    }

    /* renamed from: a0 */
    public void m12422a0() {
        if (!this.f23888w.isEmpty()) {
            C10740i iVar = (C10740i) C3976z0.m33215c(this.f23888w);
            int b = this.f23878m.m12526b(iVar);
            if (b == 1) {
                iVar.m12481v();
            } else if (b == 2 && !this.f23871c0 && this.f23884s.m29477j()) {
                this.f23884s.m29481f();
            }
        }
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        if (m12434P()) {
            return this.f38870Z;
        }
        if (this.f23871c0) {
            return Long.MIN_VALUE;
        }
        return m12439K().f21894h;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f23884s.m29477j();
    }

    /* renamed from: c0 */
    public void m12418c0(C8302u0[] u0VarArr, int i, int... iArr) {
        this.f38862R = m12445E(u0VarArr);
        this.f38863S = new HashSet();
        for (int i2 : iArr) {
            this.f38863S.add(this.f38862R.m29997a(i2));
        }
        this.f38865U = i;
        Handler handler = this.f38845A;
        final AbstractC10750b bVar = this.f23877l;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: n8.p
            @Override // java.lang.Runnable
            public final void run() {
                C10748q.AbstractC10750b.this.mo12392a();
            }
        });
        m12407k0();
    }

    /* renamed from: d0 */
    public int m12417d0(int i, C6725l lVar, C8223h hVar, boolean z) {
        C6722k kVar;
        if (m12434P()) {
            return -3;
        }
        int i2 = 0;
        if (!this.f23888w.isEmpty()) {
            int i3 = 0;
            while (i3 < this.f23888w.size() - 1 && m12441I(this.f23888w.get(i3))) {
                i3++;
            }
            C7557q0.m22200H0(this.f23888w, 0, i3);
            C10740i iVar = this.f23888w.get(0);
            C6722k kVar2 = iVar.f21890d;
            if (!kVar2.equals(this.f38860P)) {
                this.f23885t.m20245i(this.f23876k, kVar2, iVar.f21891e, iVar.f21892f, iVar.f21893g);
            }
            this.f38860P = kVar2;
        }
        if (!this.f23888w.isEmpty() && !this.f23888w.get(0).m12486q()) {
            return -3;
        }
        int Q = this.f38849E[i].m20091Q(lVar, hVar, z, this.f23871c0);
        if (Q == -5) {
            C6722k kVar3 = (C6722k) C7510a.m22367e(lVar.f14361b);
            if (i == this.f38855K) {
                int O = this.f38849E[i].m20093O();
                while (i2 < this.f23888w.size() && this.f23888w.get(i2).f23829k != O) {
                    i2++;
                }
                if (i2 < this.f23888w.size()) {
                    kVar = this.f23888w.get(i2).f21890d;
                } else {
                    kVar = (C6722k) C7510a.m22367e(this.f38859O);
                }
                kVar3 = kVar3.m24526j(kVar);
            }
            lVar.f14361b = kVar3;
        }
        return Q;
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: e */
    public AbstractC10500b0 mo7937e(int i, int i2) {
        AbstractC10500b0 b0Var;
        if (!f23868h0.contains(Integer.valueOf(i2))) {
            int i3 = 0;
            while (true) {
                AbstractC10500b0[] b0VarArr = this.f38849E;
                if (i3 >= b0VarArr.length) {
                    b0Var = null;
                    break;
                } else if (this.f38850F[i3] == i) {
                    b0Var = b0VarArr[i3];
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            b0Var = m12438L(i, i2);
        }
        if (b0Var == null) {
            if (this.f23872d0) {
                return m12447C(i, i2);
            }
            b0Var = m12446D(i, i2);
        }
        if (i2 != 5) {
            return b0Var;
        }
        if (this.f38853I == null) {
            this.f38853I = new C10751c(b0Var, this.f23886u);
        }
        return this.f38853I;
    }

    /* renamed from: e0 */
    public void m12416e0() {
        if (this.f38857M) {
            for (C10752d dVar : this.f38849E) {
                dVar.m20092P();
            }
        }
        this.f23884s.m29474m(this);
        this.f38845A.removeCallbacksAndMessages(null);
        this.f38861Q = true;
        this.f38846B.clear();
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        long j2;
        List<C10740i> list;
        boolean z;
        if (this.f23871c0 || this.f23884s.m29477j() || this.f23884s.m29478i()) {
            return false;
        }
        if (m12434P()) {
            list = Collections.emptyList();
            j2 = this.f38870Z;
            for (C10752d dVar : this.f38849E) {
                dVar.m20082Z(this.f38870Z);
            }
        } else {
            list = this.f23889x;
            C10740i K = m12439K();
            if (K.mo12495h()) {
                j2 = K.f21894h;
            } else {
                j2 = Math.max(this.f38869Y, K.f21893g);
            }
        }
        C10732f fVar = this.f23878m;
        if (this.f38857M || !list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        fVar.m12524d(j, j2, list, z, this.f23887v);
        C10732f.C10734b bVar = this.f23887v;
        boolean z2 = bVar.f23818b;
        AbstractC9827e eVar = bVar.f23817a;
        Uri uri = bVar.f23819c;
        bVar.m12504a();
        if (z2) {
            this.f38870Z = -9223372036854775807L;
            this.f23871c0 = true;
            return true;
        } else if (eVar == null) {
            if (uri != null) {
                this.f23877l.mo12391o(uri);
            }
            return false;
        } else {
            if (m12435O(eVar)) {
                m12436N((C10740i) eVar);
            }
            this.f38848D = eVar;
            this.f23885t.m20259A(new C8273n(eVar.f21887a, eVar.f21888b, this.f23884s.m29473n(eVar, this, this.f23883r.mo29487c(eVar.f21889c))), eVar.f21889c, this.f23876k, eVar.f21890d, eVar.f21891e, eVar.f21892f, eVar.f21893g, eVar.f21894h);
            return true;
        }
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        ArrayList<C10740i> arrayList;
        if (this.f23871c0) {
            return Long.MIN_VALUE;
        }
        if (m12434P()) {
            return this.f38870Z;
        }
        long j = this.f38869Y;
        C10740i K = m12439K();
        if (!K.mo12495h()) {
            if (this.f23888w.size() > 1) {
                K = this.f23888w.get(arrayList.size() - 2);
            } else {
                K = null;
            }
        }
        if (K != null) {
            j = Math.max(j, K.f21894h);
        }
        if (this.f38856L) {
            for (C10752d dVar : this.f38849E) {
                j = Math.max(j, dVar.m20059y());
            }
        }
        return j;
    }

    @Override // p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
        if (!this.f23884s.m29478i() && !m12434P()) {
            if (this.f23884s.m29477j()) {
                C7510a.m22367e(this.f38848D);
                if (this.f23878m.m12508t(j, this.f38848D, this.f23889x)) {
                    this.f23884s.m29481f();
                    return;
                }
                return;
            }
            int size = this.f23889x.size();
            while (size > 0 && this.f23878m.m12526b(this.f23889x.get(size - 1)) == 2) {
                size--;
            }
            if (size < this.f23889x.size()) {
                m12443G(size);
            }
            int g = this.f23878m.m12521g(j, this.f23889x);
            if (g < this.f23888w.size()) {
                m12443G(g);
            }
        }
    }

    /* renamed from: h0 */
    public boolean m12410h0(long j, boolean z) {
        this.f38869Y = j;
        if (m12434P()) {
            this.f38870Z = j;
            return true;
        }
        if (this.f38856L && !z && m12412g0(j)) {
            return false;
        }
        this.f38870Z = j;
        this.f23871c0 = false;
        this.f23888w.clear();
        if (this.f23884s.m29477j()) {
            if (this.f38856L) {
                for (C10752d dVar : this.f38849E) {
                    dVar.m20066q();
                }
            }
            this.f23884s.m29481f();
        } else {
            this.f23884s.m29480g();
            m12414f0();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d  */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m12409i0(p029b9.AbstractC3415h[] r20, boolean[] r21, p153i8.AbstractC8278o0[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p244n8.C10748q.m12409i0(b9.h[], boolean[], i8.o0[], boolean[], long, boolean):boolean");
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: j */
    public void mo7936j(AbstractC10534y yVar) {
    }

    /* renamed from: j0 */
    public void m12408j0(C9798l lVar) {
        if (!C7557q0.m22159c(this.f23874f0, lVar)) {
            this.f23874f0 = lVar;
            int i = 0;
            while (true) {
                C10752d[] dVarArr = this.f38849E;
                if (i < dVarArr.length) {
                    if (this.f38868X[i]) {
                        dVarArr[i].m12380g0(lVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: l0 */
    public void m12406l0(boolean z) {
        this.f23878m.m12510r(z);
    }

    /* renamed from: m0 */
    public void m12405m0(long j) {
        if (this.f23873e0 != j) {
            this.f23873e0 = j;
            for (C10752d dVar : this.f38849E) {
                dVar.m20083Y(j);
            }
        }
    }

    /* renamed from: n0 */
    public int m12404n0(int i, long j) {
        int i2 = 0;
        if (m12434P()) {
            return 0;
        }
        C10752d dVar = this.f38849E[i];
        int D = dVar.m20104D(j, this.f23871c0);
        int B = dVar.m20106B();
        while (true) {
            if (i2 >= this.f23888w.size()) {
                break;
            }
            C10740i iVar = this.f23888w.get(i2);
            int m = this.f23888w.get(i2).m12490m(i);
            if (B + D <= m) {
                break;
            } else if (!iVar.m12486q()) {
                D = m - B;
                break;
            } else {
                i2++;
            }
        }
        dVar.m20079c0(D);
        return D;
    }

    /* renamed from: o0 */
    public void m12403o0(int i) {
        m12395x();
        C7510a.m22367e(this.f38864T);
        int i2 = this.f38864T[i];
        C7510a.m22366f(this.f38867W[i2]);
        this.f38867W[i2] = false;
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5326f
    /* renamed from: p */
    public void mo12402p() {
        for (C10752d dVar : this.f38849E) {
            dVar.m20090R();
        }
    }

    /* renamed from: r */
    public void m12400r() {
        m12430T();
        if (this.f23871c0 && !this.f38857M) {
            throw new C6728o("Loading finished before preparation is complete.");
        }
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: s */
    public void mo7935s() {
        this.f23872d0 = true;
        this.f38845A.post(this.f23891z);
    }

    /* renamed from: t */
    public TrackGroupArray m12399t() {
        m12395x();
        return this.f38862R;
    }

    /* renamed from: u */
    public void m12398u(long j, boolean z) {
        if (this.f38856L && !m12434P()) {
            int length = this.f38849E.length;
            for (int i = 0; i < length; i++) {
                this.f38849E[i].m20067p(j, z, this.f38867W[i]);
            }
        }
    }

    /* renamed from: y */
    public int m12394y(int i) {
        m12395x();
        C7510a.m22367e(this.f38864T);
        int i2 = this.f38864T[i];
        if (i2 != -1) {
            boolean[] zArr = this.f38867W;
            if (zArr[i2]) {
                return -2;
            }
            zArr[i2] = true;
            return i2;
        } else if (this.f38863S.contains(this.f38862R.m29997a(i))) {
            return -3;
        } else {
            return -2;
        }
    }
}
