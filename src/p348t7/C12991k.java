package p348t7;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p030bc.AbstractC3454f;
import p079e7.C6722k;
import p079e7.C6728o;
import p099f8.C7080b;
import p117g7.C7429c;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7566w;
import p119g9.C7570y;
import p163j$.util.function.Function;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10530u;
import p228m7.C10533x;
import p228m7.C10537z;
import p348t7.AbstractC12971a;
import p459z7.C14576a;

/* renamed from: t7.k */
/* loaded from: classes7.dex */
public final class C12991k implements AbstractC10514i, AbstractC10534y {

    /* renamed from: y */
    public static final AbstractC10521o f29146y = new AbstractC10521o() { // from class: t7.i
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] r;
            r = C12991k.m4805r();
            return r;
        }
    };

    /* renamed from: a */
    private final int f29147a;

    /* renamed from: b */
    private final C7570y f29148b;

    /* renamed from: c */
    private final C7570y f29149c;

    /* renamed from: d */
    private final C7570y f29150d;

    /* renamed from: e */
    private final C7570y f29151e;

    /* renamed from: f */
    private final ArrayDeque<AbstractC12971a.C0416a> f29152f;

    /* renamed from: g */
    private final C12995m f29153g;

    /* renamed from: h */
    private final List<C14576a.AbstractC14577b> f29154h;

    /* renamed from: i */
    private int f29155i;

    /* renamed from: j */
    private int f29156j;

    /* renamed from: k */
    private long f29157k;

    /* renamed from: l */
    private int f29158l;

    /* renamed from: m */
    private C7570y f29159m;

    /* renamed from: n */
    private int f29160n;

    /* renamed from: o */
    private int f29161o;

    /* renamed from: p */
    private int f29162p;

    /* renamed from: q */
    private int f29163q;

    /* renamed from: r */
    private AbstractC10516k f29164r;

    /* renamed from: s */
    private C12992a[] f29165s;

    /* renamed from: t */
    private long[][] f29166t;

    /* renamed from: u */
    private int f29167u;

    /* renamed from: v */
    private long f29168v;

    /* renamed from: w */
    private int f29169w;

    /* renamed from: x */
    private C7080b f29170x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.k$a */
    /* loaded from: classes7.dex */
    public static final class C12992a {

        /* renamed from: a */
        public final C12998o f29171a;

        /* renamed from: b */
        public final C13001r f29172b;

        /* renamed from: c */
        public final AbstractC10500b0 f29173c;

        /* renamed from: d */
        public int f29174d;

        public C12992a(C12998o oVar, C13001r rVar, AbstractC10500b0 b0Var) {
            this.f29171a = oVar;
            this.f29172b = rVar;
            this.f29173c = b0Var;
        }
    }

    public C12991k() {
        this(0);
    }

    /* renamed from: A */
    private boolean m4819A(AbstractC10515j jVar, C10533x xVar) {
        boolean z;
        long j = this.f29157k - this.f29158l;
        long position = jVar.getPosition() + j;
        C7570y yVar = this.f29159m;
        if (yVar != null) {
            jVar.readFully(yVar.m22012d(), this.f29158l, (int) j);
            if (this.f29156j == 1718909296) {
                this.f29169w = m4800w(yVar);
            } else if (!this.f29152f.isEmpty()) {
                this.f29152f.peek().m4923e(new AbstractC12971a.C12972b(this.f29156j, yVar));
            }
        } else if (j < 262144) {
            jVar.mo12932k((int) j);
        } else {
            xVar.f23290a = jVar.getPosition() + j;
            z = true;
            m4802u(position);
            if (z || this.f29155i == 2) {
                return false;
            }
            return true;
        }
        z = false;
        m4802u(position);
        if (z) {
        }
        return false;
    }

    /* renamed from: B */
    private int m4818B(AbstractC10515j jVar, C10533x xVar) {
        long position = jVar.getPosition();
        if (this.f29160n == -1) {
            int p = m4807p(position);
            this.f29160n = p;
            if (p == -1) {
                return -1;
            }
        }
        C12992a aVar = ((C12992a[]) C7557q0.m22145j(this.f29165s))[this.f29160n];
        AbstractC10500b0 b0Var = aVar.f29173c;
        int i = aVar.f29174d;
        C13001r rVar = aVar.f29172b;
        long j = rVar.f29224c[i];
        int i2 = rVar.f29225d[i];
        long j2 = (j - position) + this.f29161o;
        if (j2 < 0 || j2 >= 262144) {
            xVar.f23290a = j;
            return 1;
        }
        if (aVar.f29171a.f29193g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        jVar.mo12932k((int) j2);
        C12998o oVar = aVar.f29171a;
        if (oVar.f29196j == 0) {
            if ("audio/ac4".equals(oVar.f29192f.f14329v)) {
                if (this.f29162p == 0) {
                    C7429c.m22687a(i2, this.f29150d);
                    b0Var.mo12386f(this.f29150d, 7);
                    this.f29162p += 7;
                }
                i2 += 7;
            }
            while (true) {
                int i3 = this.f29162p;
                if (i3 >= i2) {
                    break;
                }
                int e = b0Var.mo12387e(jVar, i2 - i3, false);
                this.f29161o += e;
                this.f29162p += e;
                this.f29163q -= e;
            }
        } else {
            byte[] d = this.f29149c.m22012d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i4 = aVar.f29171a.f29196j;
            int i5 = 4 - i4;
            while (this.f29162p < i2) {
                int i6 = this.f29163q;
                if (i6 == 0) {
                    jVar.readFully(d, i5, i4);
                    this.f29161o += i4;
                    this.f29149c.m22017P(0);
                    int n = this.f29149c.m22002n();
                    if (n >= 0) {
                        this.f29163q = n;
                        this.f29148b.m22017P(0);
                        b0Var.mo12386f(this.f29148b, 4);
                        this.f29162p += 4;
                        i2 += i5;
                    } else {
                        throw new C6728o("Invalid NAL length");
                    }
                } else {
                    int e2 = b0Var.mo12387e(jVar, i6, false);
                    this.f29161o += e2;
                    this.f29162p += e2;
                    this.f29163q -= e2;
                }
            }
        }
        C13001r rVar2 = aVar.f29172b;
        b0Var.mo12382c(rVar2.f29227f[i], rVar2.f29228g[i], i2, 0, null);
        aVar.f29174d++;
        this.f29160n = -1;
        this.f29161o = 0;
        this.f29162p = 0;
        this.f29163q = 0;
        return 0;
    }

    /* renamed from: C */
    private int m4817C(AbstractC10515j jVar, C10533x xVar) {
        int c = this.f29153g.m4784c(jVar, xVar, this.f29154h);
        if (c == 1 && xVar.f23290a == 0) {
            m4809n();
        }
        return c;
    }

    /* renamed from: D */
    private static boolean m4816D(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    /* renamed from: E */
    private static boolean m4815E(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    /* renamed from: F */
    private void m4814F(long j) {
        C12992a[] aVarArr;
        for (C12992a aVar : this.f29165s) {
            C13001r rVar = aVar.f29172b;
            int a = rVar.m4766a(j);
            if (a == -1) {
                a = rVar.m4765b(j);
            }
            aVar.f29174d = a;
        }
    }

    /* renamed from: l */
    private static int m4811l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: m */
    private static long[][] m4810m(C12992a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].f29172b.f29223b];
            jArr2[i] = aVarArr[i].f29172b.f29227f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            C13001r rVar = aVarArr[i3].f29172b;
            j += rVar.f29225d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = rVar.f29227f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: n */
    private void m4809n() {
        this.f29155i = 0;
        this.f29158l = 0;
    }

    /* renamed from: o */
    private static int m4808o(C13001r rVar, long j) {
        int a = rVar.m4766a(j);
        if (a == -1) {
            return rVar.m4765b(j);
        }
        return a;
    }

    /* renamed from: p */
    private int m4807p(long j) {
        boolean z;
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z2 = true;
        long j3 = Long.MAX_VALUE;
        boolean z3 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((C12992a[]) C7557q0.m22145j(this.f29165s)).length; i3++) {
            C12992a aVar = this.f29165s[i3];
            int i4 = aVar.f29174d;
            C13001r rVar = aVar.f29172b;
            if (i4 != rVar.f29223b) {
                long j5 = rVar.f29224c[i4];
                long j6 = ((long[][]) C7557q0.m22145j(this.f29166t))[i3][i4];
                long j7 = j5 - j;
                if (j7 < 0 || j7 >= 262144) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z && z3) || (z == z3 && j7 < j4)) {
                    z3 = z;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z2 = z;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        if (j2 == Long.MAX_VALUE || !z2 || j3 < j2 + 10485760) {
            return i2;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ C12998o m4806q(C12998o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ AbstractC10514i[] m4805r() {
        return new AbstractC10514i[]{new C12991k()};
    }

    /* renamed from: s */
    private static long m4804s(C13001r rVar, long j, long j2) {
        int o = m4808o(rVar, j);
        if (o == -1) {
            return j2;
        }
        return Math.min(rVar.f29224c[o], j2);
    }

    /* renamed from: t */
    private void m4803t(AbstractC10515j jVar) {
        this.f29150d.m22021L(8);
        jVar.mo12930n(this.f29150d.m22012d(), 0, 8);
        C12973b.m4914d(this.f29150d);
        jVar.mo12932k(this.f29150d.m22011e());
        jVar.mo12936f();
    }

    /* renamed from: u */
    private void m4802u(long j) {
        while (!this.f29152f.isEmpty() && this.f29152f.peek().f29065b == j) {
            AbstractC12971a.C0416a pop = this.f29152f.pop();
            if (pop.f29064a == 1836019574) {
                m4799x(pop);
                this.f29152f.clear();
                this.f29155i = 2;
            } else if (!this.f29152f.isEmpty()) {
                this.f29152f.peek().m4924d(pop);
            }
        }
        if (this.f29155i != 2) {
            m4809n();
        }
    }

    /* renamed from: v */
    private void m4801v() {
        C14576a aVar;
        if (this.f29169w == 2 && (this.f29147a & 2) != 0) {
            AbstractC10516k kVar = (AbstractC10516k) C7510a.m22367e(this.f29164r);
            AbstractC10500b0 e = kVar.mo7937e(0, 4);
            if (this.f29170x == null) {
                aVar = null;
            } else {
                aVar = new C14576a(this.f29170x);
            }
            e.mo12388d(new C6722k.C6724b().m24500X(aVar).m24519E());
            kVar.mo7935s();
            kVar.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
        }
    }

    /* renamed from: w */
    private static int m4800w(C7570y yVar) {
        yVar.m22017P(8);
        int l = m4811l(yVar.m22002n());
        if (l != 0) {
            return l;
        }
        yVar.m22016Q(4);
        while (yVar.m22015a() > 0) {
            int l2 = m4811l(yVar.m22002n());
            if (l2 != 0) {
                return l2;
            }
        }
        return 0;
    }

    /* renamed from: x */
    private void m4799x(AbstractC12971a.C0416a aVar) {
        boolean z;
        C14576a aVar2;
        C14576a aVar3;
        C14576a aVar4;
        boolean z2;
        int i;
        List<C13001r> list;
        ArrayList arrayList;
        C14576a aVar5;
        int i2;
        ArrayList arrayList2 = new ArrayList();
        if (this.f29169w == 1) {
            z = true;
        } else {
            z = false;
        }
        C10530u uVar = new C10530u();
        AbstractC12971a.C12972b g = aVar.m4921g(1969517665);
        if (g != null) {
            Pair<C14576a, C14576a> A = C12973b.m4920A(g);
            C14576a aVar6 = (C14576a) A.first;
            C14576a aVar7 = (C14576a) A.second;
            if (aVar6 != null) {
                uVar.m12927c(aVar6);
            }
            aVar3 = aVar7;
            aVar2 = aVar6;
        } else {
            aVar3 = null;
            aVar2 = null;
        }
        AbstractC12971a.C0416a f = aVar.m4922f(1835365473);
        if (f != null) {
            aVar4 = C12973b.m4905m(f);
        } else {
            aVar4 = null;
        }
        if ((this.f29147a & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<C13001r> z3 = C12973b.m4892z(aVar, uVar, -9223372036854775807L, null, z2, z, new AbstractC3454f() { // from class: t7.j
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p030bc.AbstractC3454f, p163j$.util.function.Function
            public final Object apply(Object obj) {
                C12998o q;
                q = C12991k.m4806q((C12998o) obj);
                return q;
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
        AbstractC10516k kVar = (AbstractC10516k) C7510a.m22367e(this.f29164r);
        int size = z3.size();
        int i3 = 0;
        int i4 = -1;
        long j = -9223372036854775807L;
        while (i3 < size) {
            C13001r rVar = z3.get(i3);
            if (rVar.f29223b == 0) {
                list = z3;
                i = size;
                arrayList = arrayList2;
            } else {
                C12998o oVar = rVar.f29222a;
                arrayList = arrayList2;
                long j2 = oVar.f29191e;
                if (j2 == -9223372036854775807L) {
                    j2 = rVar.f29229h;
                }
                long max = Math.max(j, j2);
                list = z3;
                i = size;
                C12992a aVar8 = new C12992a(oVar, rVar, kVar.mo7937e(i3, oVar.f29188b));
                C6722k.C6724b a = oVar.f29192f.m24531a();
                a.m24501W(rVar.f29226e + 30);
                if (oVar.f29188b == 2 && j2 > 0 && (i2 = rVar.f29223b) > 1) {
                    a.m24508P(i2 / (((float) j2) / 1000000.0f));
                }
                C12988h.m4821k(oVar.f29188b, uVar, a);
                int i5 = oVar.f29188b;
                C14576a[] aVarArr = new C14576a[2];
                aVarArr[0] = aVar3;
                if (this.f29154h.isEmpty()) {
                    aVar5 = null;
                } else {
                    aVar5 = new C14576a(this.f29154h);
                }
                aVarArr[1] = aVar5;
                C12988h.m4820l(i5, aVar2, aVar4, a, aVarArr);
                aVar8.f29173c.mo12388d(a.m24519E());
                int i6 = i4;
                if (oVar.f29188b == 2 && i6 == -1) {
                    i6 = arrayList.size();
                }
                i4 = i6;
                arrayList.add(aVar8);
                j = max;
            }
            i3++;
            arrayList2 = arrayList;
            z3 = list;
            size = i;
        }
        this.f29167u = i4;
        this.f29168v = j;
        C12992a[] aVarArr2 = (C12992a[]) arrayList2.toArray(new C12992a[0]);
        this.f29165s = aVarArr2;
        this.f29166t = m4810m(aVarArr2);
        kVar.mo7935s();
        kVar.mo7936j(this);
    }

    /* renamed from: y */
    private void m4798y(long j) {
        if (this.f29156j == 1836086884) {
            int i = this.f29158l;
            this.f29170x = new C7080b(0L, j, -9223372036854775807L, j + i, this.f29157k - i);
        }
    }

    /* renamed from: z */
    private boolean m4797z(AbstractC10515j jVar) {
        boolean z;
        boolean z2;
        AbstractC12971a.C0416a peek;
        if (this.f29158l == 0) {
            if (!jVar.mo12935g(this.f29151e.m22012d(), 0, 8, true)) {
                m4801v();
                return false;
            }
            this.f29158l = 8;
            this.f29151e.m22017P(0);
            this.f29157k = this.f29151e.m22027F();
            this.f29156j = this.f29151e.m22002n();
        }
        long j = this.f29157k;
        if (j == 1) {
            jVar.readFully(this.f29151e.m22012d(), 8, 8);
            this.f29158l += 8;
            this.f29157k = this.f29151e.m22024I();
        } else if (j == 0) {
            long length = jVar.getLength();
            if (length == -1 && (peek = this.f29152f.peek()) != null) {
                length = peek.f29065b;
            }
            if (length != -1) {
                this.f29157k = (length - jVar.getPosition()) + this.f29158l;
            }
        }
        if (this.f29157k >= this.f29158l) {
            if (m4816D(this.f29156j)) {
                long position = jVar.getPosition();
                long j2 = this.f29157k;
                int i = this.f29158l;
                long j3 = (position + j2) - i;
                if (j2 != i && this.f29156j == 1835365473) {
                    m4803t(jVar);
                }
                this.f29152f.push(new AbstractC12971a.C0416a(this.f29156j, j3));
                if (this.f29157k == this.f29158l) {
                    m4802u(j3);
                } else {
                    m4809n();
                }
            } else if (m4815E(this.f29156j)) {
                if (this.f29158l == 8) {
                    z = true;
                } else {
                    z = false;
                }
                C7510a.m22366f(z);
                if (this.f29157k <= 2147483647L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C7510a.m22366f(z2);
                C7570y yVar = new C7570y((int) this.f29157k);
                System.arraycopy(this.f29151e.m22012d(), 0, yVar.m22012d(), 0, 8);
                this.f29159m = yVar;
                this.f29155i = 1;
            } else {
                m4798y(jVar.getPosition() - this.f29158l);
                this.f29159m = null;
                this.f29155i = 1;
            }
            return true;
        }
        throw new C6728o("Atom size less than header length (unsupported).");
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        this.f29152f.clear();
        this.f29158l = 0;
        this.f29160n = -1;
        this.f29161o = 0;
        this.f29162p = 0;
        this.f29163q = 0;
        if (j == 0) {
            if (this.f29155i != 3) {
                m4809n();
                return;
            }
            this.f29153g.m4780g();
            this.f29154h.clear();
        } else if (this.f29165s != null) {
            m4814F(j2);
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f29164r = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        return C12997n.m4776d(jVar, (this.f29147a & 2) != 0);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        while (true) {
            int i = this.f29155i;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m4818B(jVar, xVar);
                    }
                    if (i == 3) {
                        return m4817C(jVar, xVar);
                    }
                    throw new IllegalStateException();
                } else if (m4819A(jVar, xVar)) {
                    return 1;
                }
            } else if (!m4797z(jVar)) {
                return -1;
            }
        }
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: f */
    public AbstractC10534y.C10535a mo2208f(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((C12992a[]) C7510a.m22367e(this.f29165s)).length == 0) {
            return new AbstractC10534y.C10535a(C10537z.f23295c);
        }
        int i = this.f29167u;
        if (i != -1) {
            C13001r rVar = this.f29165s[i].f29172b;
            int o = m4808o(rVar, j);
            if (o == -1) {
                return new AbstractC10534y.C10535a(C10537z.f23295c);
            }
            long j6 = rVar.f29227f[o];
            j2 = rVar.f29224c[o];
            if (j6 >= j || o >= rVar.f29223b - 1 || (b = rVar.m4765b(j)) == -1 || b == o) {
                j5 = -1;
                j3 = -9223372036854775807L;
            } else {
                j3 = rVar.f29227f[b];
                j5 = rVar.f29224c[b];
            }
            j4 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j4 = -1;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C12992a[] aVarArr = this.f29165s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.f29167u) {
                C13001r rVar2 = aVarArr[i2].f29172b;
                long s = m4804s(rVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = m4804s(rVar2, j3, j4);
                }
                j2 = s;
            }
            i2++;
        }
        C10537z zVar = new C10537z(j, j2);
        if (j3 == -9223372036854775807L) {
            return new AbstractC10534y.C10535a(zVar);
        }
        return new AbstractC10534y.C10535a(zVar, new C10537z(j3, j4));
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: h */
    public boolean mo2207h() {
        return true;
    }

    @Override // p228m7.AbstractC10534y
    /* renamed from: i */
    public long mo2206i() {
        return this.f29168v;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C12991k(int i) {
        this.f29147a = i;
        this.f29155i = (i & 4) != 0 ? 3 : 0;
        this.f29153g = new C12995m();
        this.f29154h = new ArrayList();
        this.f29151e = new C7570y(16);
        this.f29152f = new ArrayDeque<>();
        this.f29148b = new C7570y(C7566w.f16395a);
        this.f29149c = new C7570y(4);
        this.f29150d = new C7570y();
        this.f29160n = -1;
    }
}
