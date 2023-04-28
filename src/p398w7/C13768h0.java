package p398w7;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7569x;
import p119g9.C7570y;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10533x;
import p398w7.AbstractC13772i0;

/* renamed from: w7.h0 */
/* loaded from: classes7.dex */
public final class C13768h0 implements AbstractC10514i {

    /* renamed from: t */
    public static final AbstractC10521o f30801t = new AbstractC10521o() { // from class: w7.g0
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] w;
            w = C13768h0.m2754w();
            return w;
        }
    };

    /* renamed from: a */
    private final int f30802a;

    /* renamed from: b */
    private final int f30803b;

    /* renamed from: c */
    private final List<C7544l0> f30804c;

    /* renamed from: d */
    private final C7570y f30805d;

    /* renamed from: e */
    private final SparseIntArray f30806e;

    /* renamed from: f */
    private final AbstractC13772i0.AbstractC13775c f30807f;

    /* renamed from: g */
    private final SparseArray<AbstractC13772i0> f30808g;

    /* renamed from: h */
    private final SparseBooleanArray f30809h;

    /* renamed from: i */
    private final SparseBooleanArray f30810i;

    /* renamed from: j */
    private final C13764f0 f30811j;

    /* renamed from: k */
    private C13761e0 f30812k;

    /* renamed from: l */
    private AbstractC10516k f30813l;

    /* renamed from: m */
    private int f30814m;

    /* renamed from: n */
    private boolean f30815n;

    /* renamed from: o */
    private boolean f30816o;

    /* renamed from: p */
    private boolean f30817p;

    /* renamed from: q */
    private AbstractC13772i0 f30818q;

    /* renamed from: r */
    private int f30819r;

    /* renamed from: s */
    private int f30820s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.h0$a */
    /* loaded from: classes7.dex */
    public class C13769a implements AbstractC13755b0 {

        /* renamed from: a */
        private final C7569x f30821a = new C7569x(new byte[4]);

        public C13769a() {
        }

        @Override // p398w7.AbstractC13755b0
        /* renamed from: a */
        public void mo2647a(C7544l0 l0Var, AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        }

        @Override // p398w7.AbstractC13755b0
        /* renamed from: b */
        public void mo2646b(C7570y yVar) {
            if (yVar.m22029D() == 0 && (yVar.m22029D() & 128) != 0) {
                yVar.m22016Q(6);
                int a = yVar.m22015a() / 4;
                for (int i = 0; i < a; i++) {
                    yVar.m22007i(this.f30821a, 4);
                    int h = this.f30821a.m22044h(16);
                    this.f30821a.m22034r(3);
                    if (h == 0) {
                        this.f30821a.m22034r(13);
                    } else {
                        int h2 = this.f30821a.m22044h(13);
                        if (C13768h0.this.f30808g.get(h2) == null) {
                            C13768h0.this.f30808g.put(h2, new C13757c0(new C13770b(h2)));
                            C13768h0.m2766k(C13768h0.this);
                        }
                    }
                }
                if (C13768h0.this.f30802a != 2) {
                    C13768h0.this.f30808g.remove(0);
                }
            }
        }
    }

    /* renamed from: w7.h0$b */
    /* loaded from: classes7.dex */
    private class C13770b implements AbstractC13755b0 {

        /* renamed from: a */
        private final C7569x f30823a = new C7569x(new byte[5]);

        /* renamed from: b */
        private final SparseArray<AbstractC13772i0> f30824b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f30825c = new SparseIntArray();

        /* renamed from: d */
        private final int f30826d;

        public C13770b(int i) {
            this.f30826d = i;
        }

        /* renamed from: c */
        private AbstractC13772i0.C13774b m2750c(C7570y yVar, int i) {
            int e = yVar.m22011e();
            int i2 = i + e;
            int i3 = -1;
            String str = null;
            ArrayList arrayList = null;
            while (yVar.m22011e() < i2) {
                int D = yVar.m22029D();
                int e2 = yVar.m22011e() + yVar.m22029D();
                if (e2 > i2) {
                    break;
                } else if (D == 5) {
                    long F = yVar.m22027F();
                    if (F != 1094921523) {
                        if (F != 1161904947) {
                            if (F != 1094921524) {
                                if (F == 1212503619) {
                                    i3 = 36;
                                }
                                yVar.m22016Q(e2 - yVar.m22011e());
                            }
                            i3 = 172;
                            yVar.m22016Q(e2 - yVar.m22011e());
                        }
                        i3 = 135;
                        yVar.m22016Q(e2 - yVar.m22011e());
                    }
                    i3 = 129;
                    yVar.m22016Q(e2 - yVar.m22011e());
                } else {
                    if (D != 106) {
                        if (D != 122) {
                            if (D == 127) {
                                if (yVar.m22029D() != 21) {
                                }
                                i3 = 172;
                            } else if (D == 123) {
                                i3 = 138;
                            } else if (D == 10) {
                                str = yVar.m22032A(3).trim();
                            } else if (D == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (yVar.m22011e() < e2) {
                                    String trim = yVar.m22032A(3).trim();
                                    int D2 = yVar.m22029D();
                                    byte[] bArr = new byte[4];
                                    yVar.m22006j(bArr, 0, 4);
                                    arrayList2.add(new AbstractC13772i0.C13773a(trim, D2, bArr));
                                }
                                arrayList = arrayList2;
                                i3 = 89;
                            } else if (D == 111) {
                                i3 = 257;
                            }
                            yVar.m22016Q(e2 - yVar.m22011e());
                        }
                        i3 = 135;
                        yVar.m22016Q(e2 - yVar.m22011e());
                    }
                    i3 = 129;
                    yVar.m22016Q(e2 - yVar.m22011e());
                }
            }
            yVar.m22017P(i2);
            return new AbstractC13772i0.C13774b(i3, str, arrayList, Arrays.copyOfRange(yVar.m22012d(), e, i2));
        }

        @Override // p398w7.AbstractC13755b0
        /* renamed from: a */
        public void mo2647a(C7544l0 l0Var, AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        }

        @Override // p398w7.AbstractC13755b0
        /* renamed from: b */
        public void mo2646b(C7570y yVar) {
            C7544l0 l0Var;
            int i;
            AbstractC13772i0 i0Var;
            if (yVar.m22029D() == 2) {
                if (C13768h0.this.f30802a == 1 || C13768h0.this.f30802a == 2 || C13768h0.this.f30814m == 1) {
                    l0Var = (C7544l0) C13768h0.this.f30804c.get(0);
                } else {
                    l0Var = new C7544l0(((C7544l0) C13768h0.this.f30804c.get(0)).m22263c());
                    C13768h0.this.f30804c.add(l0Var);
                }
                if ((yVar.m22029D() & 128) != 0) {
                    yVar.m22016Q(1);
                    int J = yVar.m22023J();
                    int i2 = 3;
                    yVar.m22016Q(3);
                    yVar.m22007i(this.f30823a, 2);
                    this.f30823a.m22034r(3);
                    int i3 = 13;
                    C13768h0.this.f30820s = this.f30823a.m22044h(13);
                    yVar.m22007i(this.f30823a, 2);
                    int i4 = 4;
                    this.f30823a.m22034r(4);
                    yVar.m22016Q(this.f30823a.m22044h(12));
                    if (C13768h0.this.f30802a == 2 && C13768h0.this.f30818q == null) {
                        AbstractC13772i0.C13774b bVar = new AbstractC13772i0.C13774b(21, null, null, C7557q0.f16373f);
                        C13768h0 h0Var = C13768h0.this;
                        h0Var.f30818q = h0Var.f30807f.mo2726b(21, bVar);
                        C13768h0.this.f30818q.mo2644a(l0Var, C13768h0.this.f30813l, new AbstractC13772i0.C13776d(J, 21, 8192));
                    }
                    this.f30824b.clear();
                    this.f30825c.clear();
                    int a = yVar.m22015a();
                    while (a > 0) {
                        yVar.m22007i(this.f30823a, 5);
                        int h = this.f30823a.m22044h(8);
                        this.f30823a.m22034r(i2);
                        int h2 = this.f30823a.m22044h(i3);
                        this.f30823a.m22034r(i4);
                        int h3 = this.f30823a.m22044h(12);
                        AbstractC13772i0.C13774b c = m2750c(yVar, h3);
                        if (h == 6 || h == 5) {
                            h = c.f30853a;
                        }
                        a -= h3 + 5;
                        if (C13768h0.this.f30802a == 2) {
                            i = h;
                        } else {
                            i = h2;
                        }
                        if (!C13768h0.this.f30809h.get(i)) {
                            if (C13768h0.this.f30802a == 2 && h == 21) {
                                i0Var = C13768h0.this.f30818q;
                            } else {
                                i0Var = C13768h0.this.f30807f.mo2726b(h, c);
                            }
                            if (C13768h0.this.f30802a != 2 || h2 < this.f30825c.get(i, 8192)) {
                                this.f30825c.put(i, h2);
                                this.f30824b.put(i, i0Var);
                            }
                        }
                        i2 = 3;
                        i4 = 4;
                        i3 = 13;
                    }
                    int size = this.f30825c.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        int keyAt = this.f30825c.keyAt(i5);
                        int valueAt = this.f30825c.valueAt(i5);
                        C13768h0.this.f30809h.put(keyAt, true);
                        C13768h0.this.f30810i.put(valueAt, true);
                        AbstractC13772i0 valueAt2 = this.f30824b.valueAt(i5);
                        if (valueAt2 != null) {
                            if (valueAt2 != C13768h0.this.f30818q) {
                                valueAt2.mo2644a(l0Var, C13768h0.this.f30813l, new AbstractC13772i0.C13776d(J, keyAt, 8192));
                            }
                            C13768h0.this.f30808g.put(valueAt, valueAt2);
                        }
                    }
                    if (C13768h0.this.f30802a != 2) {
                        C13768h0.this.f30808g.remove(this.f30826d);
                        C13768h0 h0Var2 = C13768h0.this;
                        h0Var2.f30814m = h0Var2.f30802a == 1 ? 0 : C13768h0.this.f30814m - 1;
                        if (C13768h0.this.f30814m == 0) {
                            C13768h0.this.f30813l.mo7935s();
                            C13768h0.this.f30815n = true;
                        }
                    } else if (!C13768h0.this.f30815n) {
                        C13768h0.this.f30813l.mo7935s();
                        C13768h0.this.f30814m = 0;
                        C13768h0.this.f30815n = true;
                    }
                }
            }
        }
    }

    public C13768h0() {
        this(0);
    }

    /* renamed from: k */
    static /* synthetic */ int m2766k(C13768h0 h0Var) {
        int i = h0Var.f30814m;
        h0Var.f30814m = i + 1;
        return i;
    }

    /* renamed from: u */
    private boolean m2756u(AbstractC10515j jVar) {
        byte[] d = this.f30805d.m22012d();
        if (9400 - this.f30805d.m22011e() < 188) {
            int a = this.f30805d.m22015a();
            if (a > 0) {
                System.arraycopy(d, this.f30805d.m22011e(), d, 0, a);
            }
            this.f30805d.m22019N(d, a);
        }
        while (this.f30805d.m22015a() < 188) {
            int f = this.f30805d.m22010f();
            int read = jVar.read(d, f, 9400 - f);
            if (read == -1) {
                return false;
            }
            this.f30805d.m22018O(f + read);
        }
        return true;
    }

    /* renamed from: v */
    private int m2755v() {
        int e = this.f30805d.m22011e();
        int f = this.f30805d.m22010f();
        int a = C13778j0.m2721a(this.f30805d.m22012d(), e, f);
        this.f30805d.m22017P(a);
        int i = a + 188;
        if (i > f) {
            int i2 = this.f30819r + (a - e);
            this.f30819r = i2;
            if (this.f30802a == 2 && i2 > 376) {
                throw new C6728o("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f30819r = 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static /* synthetic */ AbstractC10514i[] m2754w() {
        return new AbstractC10514i[]{new C13768h0()};
    }

    /* renamed from: x */
    private void m2753x(long j) {
        if (!this.f30816o) {
            this.f30816o = true;
            if (this.f30811j.m2787b() != -9223372036854775807L) {
                C13761e0 e0Var = new C13761e0(this.f30811j.m2786c(), this.f30811j.m2787b(), j, this.f30820s, this.f30803b);
                this.f30812k = e0Var;
                this.f30813l.mo7936j(e0Var.m13045b());
                return;
            }
            this.f30813l.mo7936j(new AbstractC10534y.C10536b(this.f30811j.m2787b()));
        }
    }

    /* renamed from: y */
    private void m2752y() {
        this.f30809h.clear();
        this.f30808g.clear();
        SparseArray<AbstractC13772i0> a = this.f30807f.mo2727a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f30808g.put(a.keyAt(i), a.valueAt(i));
        }
        this.f30808g.put(0, new C13757c0(new C13769a()));
        this.f30818q = null;
    }

    /* renamed from: z */
    private boolean m2751z(int i) {
        if (this.f30802a == 2 || this.f30815n || !this.f30810i.get(i, false)) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        boolean z;
        C13761e0 e0Var;
        boolean z2;
        if (this.f30802a != 2) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22366f(z);
        int size = this.f30804c.size();
        for (int i = 0; i < size; i++) {
            C7544l0 l0Var = this.f30804c.get(i);
            if (l0Var.m22261e() == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || !(l0Var.m22261e() == 0 || l0Var.m22263c() == j2)) {
                l0Var.m22259g(j2);
            }
        }
        if (!(j2 == 0 || (e0Var = this.f30812k) == null)) {
            e0Var.m13039h(j2);
        }
        this.f30805d.m22021L(0);
        this.f30806e.clear();
        for (int i2 = 0; i2 < this.f30808g.size(); i2++) {
            this.f30808g.valueAt(i2).mo2642c();
        }
        this.f30819r = 0;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f30813l = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        boolean z;
        byte[] d = this.f30805d.m22012d();
        jVar.mo12930n(d, 0, 940);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    z = true;
                    break;
                } else if (d[(i2 * 188) + i] != 71) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                jVar.mo12932k(i);
                return true;
            }
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        int i;
        boolean z;
        boolean z2;
        AbstractC13772i0 i0Var;
        int i2;
        boolean z3;
        long length = jVar.getLength();
        if (this.f30815n) {
            if (length == -1 || this.f30802a == 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && !this.f30811j.m2785d()) {
                return this.f30811j.m2784e(jVar, xVar, this.f30820s);
            }
            m2753x(length);
            if (this.f30817p) {
                this.f30817p = false;
                mo2228a(0L, 0L);
                if (jVar.getPosition() != 0) {
                    xVar.f23290a = 0L;
                    return 1;
                }
            }
            C13761e0 e0Var = this.f30812k;
            if (e0Var != null && e0Var.m13043d()) {
                return this.f30812k.m13044c(jVar, xVar);
            }
        }
        if (!m2756u(jVar)) {
            return -1;
        }
        int v = m2755v();
        int f = this.f30805d.m22010f();
        if (v > f) {
            return 0;
        }
        int n = this.f30805d.m22002n();
        if ((8388608 & n) != 0) {
            this.f30805d.m22017P(v);
            return 0;
        }
        if ((4194304 & n) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i | 0;
        int i4 = (2096896 & n) >> 8;
        if ((n & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((n & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i0Var = this.f30808g.get(i4);
        } else {
            i0Var = null;
        }
        if (i0Var == null) {
            this.f30805d.m22017P(v);
            return 0;
        }
        if (this.f30802a != 2) {
            int i5 = n & 15;
            int i6 = this.f30806e.get(i4, i5 - 1);
            this.f30806e.put(i4, i5);
            if (i6 == i5) {
                this.f30805d.m22017P(v);
                return 0;
            } else if (i5 != ((i6 + 1) & 15)) {
                i0Var.mo2642c();
            }
        }
        if (z) {
            int D = this.f30805d.m22029D();
            if ((this.f30805d.m22029D() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i3 |= i2;
            this.f30805d.m22016Q(D - 1);
        }
        boolean z4 = this.f30815n;
        if (m2751z(i4)) {
            this.f30805d.m22018O(v);
            i0Var.mo2643b(this.f30805d, i3);
            this.f30805d.m22018O(f);
        }
        if (this.f30802a != 2 && !z4 && this.f30815n && length != -1) {
            this.f30817p = true;
        }
        this.f30805d.m22017P(v);
        return 0;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C13768h0(int i) {
        this(1, i, 112800);
    }

    public C13768h0(int i, int i2, int i3) {
        this(i, new C7544l0(0L), new C13777j(i2), i3);
    }

    public C13768h0(int i, C7544l0 l0Var, AbstractC13772i0.AbstractC13775c cVar) {
        this(i, l0Var, cVar, 112800);
    }

    public C13768h0(int i, C7544l0 l0Var, AbstractC13772i0.AbstractC13775c cVar, int i2) {
        this.f30807f = (AbstractC13772i0.AbstractC13775c) C7510a.m22367e(cVar);
        this.f30803b = i2;
        this.f30802a = i;
        if (i == 1 || i == 2) {
            this.f30804c = Collections.singletonList(l0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f30804c = arrayList;
            arrayList.add(l0Var);
        }
        this.f30805d = new C7570y(new byte[9400], 0);
        this.f30809h = new SparseBooleanArray();
        this.f30810i = new SparseBooleanArray();
        this.f30808g = new SparseArray<>();
        this.f30806e = new SparseIntArray();
        this.f30811j = new C13764f0(i2);
        this.f30820s = -1;
        m2752y();
    }
}
