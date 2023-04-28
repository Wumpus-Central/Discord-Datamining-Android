package p348t7;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p028b8.C3396a;
import p028b8.C3398c;
import p030bc.AbstractC3454f;
import p079e7.C6722k;
import p079e7.C6728o;
import p117g7.C7429c;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7558r;
import p119g9.C7566w;
import p119g9.C7570y;
import p163j$.util.function.Function;
import p193k7.C9798l;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10502c;
import p228m7.C10504d;
import p228m7.C10520n;
import p228m7.C10530u;
import p228m7.C10533x;
import p348t7.AbstractC12971a;

/* renamed from: t7.g */
/* loaded from: classes7.dex */
public class C12985g implements AbstractC10514i {

    /* renamed from: I */
    public static final AbstractC10521o f39357I = new AbstractC10521o() { // from class: t7.f
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] m;
            m = C12985g.m4859m();
            return m;
        }
    };

    /* renamed from: J */
    private static final byte[] f39358J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    private static final C6722k f39359K = new C6722k.C6724b().m24488e0("application/x-emsg").m24519E();

    /* renamed from: A */
    private int f39360A;

    /* renamed from: B */
    private int f39361B;

    /* renamed from: C */
    private int f39362C;

    /* renamed from: D */
    private boolean f39363D;

    /* renamed from: E */
    private AbstractC10516k f39364E;

    /* renamed from: F */
    private AbstractC10500b0[] f39365F;

    /* renamed from: G */
    private AbstractC10500b0[] f39366G;

    /* renamed from: H */
    private boolean f39367H;

    /* renamed from: a */
    private final int f29105a;

    /* renamed from: b */
    private final C12998o f29106b;

    /* renamed from: c */
    private final List<C6722k> f29107c;

    /* renamed from: d */
    private final SparseArray<C12987b> f29108d;

    /* renamed from: e */
    private final C7570y f29109e;

    /* renamed from: f */
    private final C7570y f29110f;

    /* renamed from: g */
    private final C7570y f29111g;

    /* renamed from: h */
    private final byte[] f29112h;

    /* renamed from: i */
    private final C7570y f29113i;

    /* renamed from: j */
    private final C7544l0 f29114j;

    /* renamed from: k */
    private final C3398c f29115k;

    /* renamed from: l */
    private final C7570y f29116l;

    /* renamed from: m */
    private final ArrayDeque<AbstractC12971a.C0416a> f29117m;

    /* renamed from: n */
    private final ArrayDeque<C12986a> f29118n;

    /* renamed from: o */
    private final AbstractC10500b0 f29119o;

    /* renamed from: p */
    private int f29120p;

    /* renamed from: q */
    private int f29121q;

    /* renamed from: r */
    private long f29122r;

    /* renamed from: s */
    private int f29123s;

    /* renamed from: t */
    private C7570y f29124t;

    /* renamed from: u */
    private long f29125u;

    /* renamed from: v */
    private int f29126v;

    /* renamed from: w */
    private long f29127w;

    /* renamed from: x */
    private long f29128x;

    /* renamed from: y */
    private long f29129y;

    /* renamed from: z */
    private C12987b f29130z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.g$a */
    /* loaded from: classes7.dex */
    public static final class C12986a {

        /* renamed from: a */
        public final long f29131a;

        /* renamed from: b */
        public final int f29132b;

        public C12986a(long j, int i) {
            this.f29131a = j;
            this.f29132b = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t7.g$b */
    /* loaded from: classes7.dex */
    public static final class C12987b {

        /* renamed from: a */
        public final AbstractC10500b0 f29133a;

        /* renamed from: d */
        public C13001r f29136d;

        /* renamed from: e */
        public C12979c f29137e;

        /* renamed from: f */
        public int f29138f;

        /* renamed from: g */
        public int f29139g;

        /* renamed from: h */
        public int f29140h;

        /* renamed from: i */
        public int f29141i;

        /* renamed from: l */
        private boolean f29144l;

        /* renamed from: b */
        public final C13000q f29134b = new C13000q();

        /* renamed from: c */
        public final C7570y f29135c = new C7570y();

        /* renamed from: j */
        private final C7570y f29142j = new C7570y(1);

        /* renamed from: k */
        private final C7570y f29143k = new C7570y();

        public C12987b(AbstractC10500b0 b0Var, C13001r rVar, C12979c cVar) {
            this.f29133a = b0Var;
            this.f29136d = rVar;
            this.f29137e = cVar;
            m4836j(rVar, cVar);
        }

        /* renamed from: c */
        public int m4843c() {
            int i;
            if (!this.f29144l) {
                i = this.f29136d.f29228g[this.f29138f];
            } else if (this.f29134b.f29214l[this.f29138f]) {
                i = 1;
            } else {
                i = 0;
            }
            if (m4839g() != null) {
                return i | 1073741824;
            }
            return i;
        }

        /* renamed from: d */
        public long m4842d() {
            if (!this.f29144l) {
                return this.f29136d.f29224c[this.f29138f];
            }
            return this.f29134b.f29209g[this.f29140h];
        }

        /* renamed from: e */
        public long m4841e() {
            if (!this.f29144l) {
                return this.f29136d.f29227f[this.f29138f];
            }
            return this.f29134b.m4771c(this.f29138f);
        }

        /* renamed from: f */
        public int m4840f() {
            if (!this.f29144l) {
                return this.f29136d.f29225d[this.f29138f];
            }
            return this.f29134b.f29211i[this.f29138f];
        }

        /* renamed from: g */
        public C12999p m4839g() {
            if (!this.f29144l) {
                return null;
            }
            int i = ((C12979c) C7557q0.m22145j(this.f29134b.f29203a)).f29094a;
            C12999p pVar = this.f29134b.f29217o;
            if (pVar == null) {
                pVar = this.f29136d.f29222a.m4775a(i);
            }
            if (pVar == null || !pVar.f29198a) {
                return null;
            }
            return pVar;
        }

        /* renamed from: h */
        public boolean m4838h() {
            this.f29138f++;
            if (!this.f29144l) {
                return false;
            }
            int i = this.f29139g + 1;
            this.f29139g = i;
            int[] iArr = this.f29134b.f29210h;
            int i2 = this.f29140h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f29140h = i2 + 1;
            this.f29139g = 0;
            return false;
        }

        /* renamed from: i */
        public int m4837i(int i, int i2) {
            C7570y yVar;
            boolean z;
            int i3;
            C12999p g = m4839g();
            if (g == null) {
                return 0;
            }
            int i4 = g.f29201d;
            if (i4 != 0) {
                yVar = this.f29134b.f29218p;
            } else {
                byte[] bArr = (byte[]) C7557q0.m22145j(g.f29202e);
                this.f29143k.m22019N(bArr, bArr.length);
                C7570y yVar2 = this.f29143k;
                i4 = bArr.length;
                yVar = yVar2;
            }
            boolean g2 = this.f29134b.m4767g(this.f29138f);
            if (g2 || i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            byte[] d = this.f29142j.m22012d();
            if (z) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            d[0] = (byte) (i3 | i4);
            this.f29142j.m22017P(0);
            this.f29133a.mo12389b(this.f29142j, 1, 1);
            this.f29133a.mo12389b(yVar, i4, 1);
            if (!z) {
                return i4 + 1;
            }
            if (!g2) {
                this.f29135c.m22021L(8);
                byte[] d2 = this.f29135c.m22012d();
                d2[0] = 0;
                d2[1] = 1;
                d2[2] = (byte) ((i2 >> 8) & 255);
                d2[3] = (byte) (i2 & 255);
                d2[4] = (byte) ((i >> 24) & 255);
                d2[5] = (byte) ((i >> 16) & 255);
                d2[6] = (byte) ((i >> 8) & 255);
                d2[7] = (byte) (i & 255);
                this.f29133a.mo12389b(this.f29135c, 8, 1);
                return i4 + 1 + 8;
            }
            C7570y yVar3 = this.f29134b.f29218p;
            int J = yVar3.m22023J();
            yVar3.m22016Q(-2);
            int i5 = (J * 6) + 2;
            if (i2 != 0) {
                this.f29135c.m22021L(i5);
                byte[] d3 = this.f29135c.m22012d();
                yVar3.m22006j(d3, 0, i5);
                int i6 = (((d3[2] & 255) << 8) | (d3[3] & 255)) + i2;
                d3[2] = (byte) ((i6 >> 8) & 255);
                d3[3] = (byte) (i6 & 255);
                yVar3 = this.f29135c;
            }
            this.f29133a.mo12389b(yVar3, i5, 1);
            return i4 + 1 + i5;
        }

        /* renamed from: j */
        public void m4836j(C13001r rVar, C12979c cVar) {
            this.f29136d = rVar;
            this.f29137e = cVar;
            this.f29133a.mo12388d(rVar.f29222a.f29192f);
            m4835k();
        }

        /* renamed from: k */
        public void m4835k() {
            this.f29134b.m4768f();
            this.f29138f = 0;
            this.f29140h = 0;
            this.f29139g = 0;
            this.f29141i = 0;
            this.f29144l = false;
        }

        /* renamed from: l */
        public void m4834l(long j) {
            int i = this.f29138f;
            while (true) {
                C13000q qVar = this.f29134b;
                if (i < qVar.f29208f && qVar.m4771c(i) < j) {
                    if (this.f29134b.f29214l[i]) {
                        this.f29141i = i;
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: m */
        public void m4833m() {
            C12999p g = m4839g();
            if (g != null) {
                C7570y yVar = this.f29134b.f29218p;
                int i = g.f29201d;
                if (i != 0) {
                    yVar.m22016Q(i);
                }
                if (this.f29134b.m4767g(this.f29138f)) {
                    yVar.m22016Q(yVar.m22023J() * 6);
                }
            }
        }

        /* renamed from: n */
        public void m4832n(C9798l lVar) {
            String str;
            C12999p a = this.f29136d.f29222a.m4775a(((C12979c) C7557q0.m22145j(this.f29134b.f29203a)).f29094a);
            if (a != null) {
                str = a.f29199b;
            } else {
                str = null;
            }
            this.f29133a.mo12388d(this.f29136d.f29222a.f29192f.m24531a().m24512L(lVar.m15331A(str)).m24519E());
        }
    }

    public C12985g() {
        this(0);
    }

    /* renamed from: A */
    private static void m4883A(C7570y yVar, C13000q qVar) {
        m4846z(yVar, 0, qVar);
    }

    /* renamed from: B */
    private static Pair<Long, C10504d> m4882B(C7570y yVar, long j) {
        long j2;
        long j3;
        yVar.m22017P(8);
        int c = AbstractC12971a.m4925c(yVar.m22002n());
        yVar.m22016Q(4);
        long F = yVar.m22027F();
        if (c == 0) {
            j3 = yVar.m22027F();
            j2 = yVar.m22027F();
        } else {
            j3 = yVar.m22024I();
            j2 = yVar.m22024I();
        }
        long j4 = j + j2;
        long I0 = C7557q0.m22198I0(j3, 1000000L, F);
        yVar.m22016Q(2);
        int J = yVar.m22023J();
        int[] iArr = new int[J];
        long[] jArr = new long[J];
        long[] jArr2 = new long[J];
        long[] jArr3 = new long[J];
        long j5 = I0;
        int i = 0;
        long j6 = j3;
        while (i < J) {
            int n = yVar.m22002n();
            if ((n & Integer.MIN_VALUE) == 0) {
                long F2 = yVar.m22027F();
                iArr[i] = n & ViewDefaults.NUMBER_OF_LINES;
                jArr[i] = j4;
                jArr3[i] = j5;
                long j7 = j6 + F2;
                long I02 = C7557q0.m22198I0(j7, 1000000L, F);
                jArr2[i] = I02 - jArr3[i];
                yVar.m22016Q(4);
                j4 += iArr[i];
                i++;
                iArr = iArr;
                jArr3 = jArr3;
                jArr2 = jArr2;
                jArr = jArr;
                J = J;
                j6 = j7;
                j5 = I02;
            } else {
                throw new C6728o("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(I0), new C10504d(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: C */
    private static long m4881C(C7570y yVar) {
        yVar.m22017P(8);
        if (AbstractC12971a.m4925c(yVar.m22002n()) == 1) {
            return yVar.m22024I();
        }
        return yVar.m22027F();
    }

    /* renamed from: D */
    private static C12987b m4880D(C7570y yVar, SparseArray<C12987b> sparseArray) {
        int i;
        int i2;
        int i3;
        int i4;
        yVar.m22017P(8);
        int b = AbstractC12971a.m4926b(yVar.m22002n());
        C12987b k = m4861k(sparseArray, yVar.m22002n());
        if (k == null) {
            return null;
        }
        if ((b & 1) != 0) {
            long I = yVar.m22024I();
            C13000q qVar = k.f29134b;
            qVar.f29205c = I;
            qVar.f29206d = I;
        }
        C12979c cVar = k.f29137e;
        if ((b & 2) != 0) {
            i = yVar.m22002n() - 1;
        } else {
            i = cVar.f29094a;
        }
        if ((b & 8) != 0) {
            i2 = yVar.m22002n();
        } else {
            i2 = cVar.f29095b;
        }
        if ((b & 16) != 0) {
            i3 = yVar.m22002n();
        } else {
            i3 = cVar.f29096c;
        }
        if ((b & 32) != 0) {
            i4 = yVar.m22002n();
        } else {
            i4 = cVar.f29097d;
        }
        k.f29134b.f29203a = new C12979c(i, i2, i3, i4);
        return k;
    }

    /* renamed from: E */
    private static void m4879E(AbstractC12971a.C0416a aVar, SparseArray<C12987b> sparseArray, int i, byte[] bArr) {
        String str;
        C12987b D = m4880D(((AbstractC12971a.C12972b) C7510a.m22367e(aVar.m4921g(1952868452))).f29068b, sparseArray);
        if (D != null) {
            C13000q qVar = D.f29134b;
            long j = qVar.f29220r;
            boolean z = qVar.f29221s;
            D.m4835k();
            D.f29144l = true;
            AbstractC12971a.C12972b g = aVar.m4921g(1952867444);
            if (g == null || (i & 2) != 0) {
                qVar.f29220r = j;
                qVar.f29221s = z;
            } else {
                qVar.f29220r = m4881C(g.f29068b);
                qVar.f29221s = true;
            }
            m4876H(aVar, D, i);
            C12999p a = D.f29136d.f29222a.m4775a(((C12979c) C7510a.m22367e(qVar.f29203a)).f29094a);
            AbstractC12971a.C12972b g2 = aVar.m4921g(1935763834);
            if (g2 != null) {
                m4848x((C12999p) C7510a.m22367e(a), g2.f29068b, qVar);
            }
            AbstractC12971a.C12972b g3 = aVar.m4921g(1935763823);
            if (g3 != null) {
                m4849w(g3.f29068b, qVar);
            }
            AbstractC12971a.C12972b g4 = aVar.m4921g(1936027235);
            if (g4 != null) {
                m4883A(g4.f29068b, qVar);
            }
            if (a != null) {
                str = a.f29199b;
            } else {
                str = null;
            }
            m4847y(aVar, str, qVar);
            int size = aVar.f29066c.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC12971a.C12972b bVar = aVar.f29066c.get(i2);
                if (bVar.f29064a == 1970628964) {
                    m4875I(bVar.f29068b, qVar, bArr);
                }
            }
        }
    }

    /* renamed from: F */
    private static Pair<Integer, C12979c> m4878F(C7570y yVar) {
        yVar.m22017P(12);
        return Pair.create(Integer.valueOf(yVar.m22002n()), new C12979c(yVar.m22002n() - 1, yVar.m22002n(), yVar.m22002n(), yVar.m22002n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m4877G(p348t7.C12985g.C12987b r36, int r37, int r38, p119g9.C7570y r39, int r40) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p348t7.C12985g.m4877G(t7.g$b, int, int, g9.y, int):int");
    }

    /* renamed from: H */
    private static void m4876H(AbstractC12971a.C0416a aVar, C12987b bVar, int i) {
        List<AbstractC12971a.C12972b> list = aVar.f29066c;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC12971a.C12972b bVar2 = list.get(i4);
            if (bVar2.f29064a == 1953658222) {
                C7570y yVar = bVar2.f29068b;
                yVar.m22017P(12);
                int H = yVar.m22025H();
                if (H > 0) {
                    i3 += H;
                    i2++;
                }
            }
        }
        bVar.f29140h = 0;
        bVar.f29139g = 0;
        bVar.f29138f = 0;
        bVar.f29134b.m4769e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC12971a.C12972b bVar3 = list.get(i7);
            if (bVar3.f29064a == 1953658222) {
                i6 = m4877G(bVar, i5, i, bVar3.f29068b, i6);
                i5++;
            }
        }
    }

    /* renamed from: I */
    private static void m4875I(C7570y yVar, C13000q qVar, byte[] bArr) {
        yVar.m22017P(8);
        yVar.m22006j(bArr, 0, 16);
        if (Arrays.equals(bArr, f39358J)) {
            m4846z(yVar, 16, qVar);
        }
    }

    /* renamed from: J */
    private void m4874J(long j) {
        while (!this.f29117m.isEmpty() && this.f29117m.peek().f29065b == j) {
            m4857o(this.f29117m.pop());
        }
        m4865g();
    }

    /* renamed from: K */
    private boolean m4873K(AbstractC10515j jVar) {
        if (this.f29123s == 0) {
            if (!jVar.mo12935g(this.f29116l.m22012d(), 0, 8, true)) {
                return false;
            }
            this.f29123s = 8;
            this.f29116l.m22017P(0);
            this.f29122r = this.f29116l.m22027F();
            this.f29121q = this.f29116l.m22002n();
        }
        long j = this.f29122r;
        if (j == 1) {
            jVar.readFully(this.f29116l.m22012d(), 8, 8);
            this.f29123s += 8;
            this.f29122r = this.f29116l.m22024I();
        } else if (j == 0) {
            long length = jVar.getLength();
            if (length == -1 && !this.f29117m.isEmpty()) {
                length = this.f29117m.peek().f29065b;
            }
            if (length != -1) {
                this.f29122r = (length - jVar.getPosition()) + this.f29123s;
            }
        }
        if (this.f29122r >= this.f29123s) {
            long position = jVar.getPosition() - this.f29123s;
            int i = this.f29121q;
            if ((i == 1836019558 || i == 1835295092) && !this.f39367H) {
                this.f39364E.mo7936j(new AbstractC10534y.C10536b(this.f29128x, position));
                this.f39367H = true;
            }
            if (this.f29121q == 1836019558) {
                int size = this.f29108d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C13000q qVar = this.f29108d.valueAt(i2).f29134b;
                    qVar.f29204b = position;
                    qVar.f29206d = position;
                    qVar.f29205c = position;
                }
            }
            int i3 = this.f29121q;
            if (i3 == 1835295092) {
                this.f29130z = null;
                this.f29125u = position + this.f29122r;
                this.f29120p = 2;
                return true;
            }
            if (m4869O(i3)) {
                long position2 = (jVar.getPosition() + this.f29122r) - 8;
                this.f29117m.push(new AbstractC12971a.C0416a(this.f29121q, position2));
                if (this.f29122r == this.f29123s) {
                    m4874J(position2);
                } else {
                    m4865g();
                }
            } else if (m4868P(this.f29121q)) {
                if (this.f29123s == 8) {
                    long j2 = this.f29122r;
                    if (j2 <= 2147483647L) {
                        C7570y yVar = new C7570y((int) j2);
                        System.arraycopy(this.f29116l.m22012d(), 0, yVar.m22012d(), 0, 8);
                        this.f29124t = yVar;
                        this.f29120p = 1;
                    } else {
                        throw new C6728o("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new C6728o("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.f29122r <= 2147483647L) {
                this.f29124t = null;
                this.f29120p = 1;
            } else {
                throw new C6728o("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new C6728o("Atom size less than header length (unsupported).");
    }

    /* renamed from: L */
    private void m4872L(AbstractC10515j jVar) {
        int i = ((int) this.f29122r) - this.f29123s;
        C7570y yVar = this.f29124t;
        if (yVar != null) {
            jVar.readFully(yVar.m22012d(), 8, i);
            m4855q(new AbstractC12971a.C12972b(this.f29121q, yVar), jVar.getPosition());
        } else {
            jVar.mo12932k(i);
        }
        m4874J(jVar.getPosition());
    }

    /* renamed from: M */
    private void m4871M(AbstractC10515j jVar) {
        int size = this.f29108d.size();
        C12987b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C13000q qVar = this.f29108d.valueAt(i).f29134b;
            if (qVar.f29219q) {
                long j2 = qVar.f29206d;
                if (j2 < j) {
                    bVar = this.f29108d.valueAt(i);
                    j = j2;
                }
            }
        }
        if (bVar == null) {
            this.f29120p = 3;
            return;
        }
        int position = (int) (j - jVar.getPosition());
        if (position >= 0) {
            jVar.mo12932k(position);
            bVar.f29134b.m4772b(jVar);
            return;
        }
        throw new C6728o("Offset to encryption data was negative.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private boolean m4870N(AbstractC10515j jVar) {
        AbstractC10500b0.C10501a aVar;
        boolean z;
        int i;
        C12987b bVar = this.f29130z;
        if (bVar == null) {
            bVar = m4862j(this.f29108d);
            if (bVar == null) {
                int position = (int) (this.f29125u - jVar.getPosition());
                if (position >= 0) {
                    jVar.mo12932k(position);
                    m4865g();
                    return false;
                }
                throw new C6728o("Offset to end of mdat was negative.");
            }
            int d = (int) (bVar.m4842d() - jVar.getPosition());
            if (d < 0) {
                C7558r.m22104h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d = 0;
            }
            jVar.mo12932k(d);
            this.f29130z = bVar;
        }
        int i2 = 4;
        int i3 = 1;
        if (this.f29120p == 3) {
            int f = bVar.m4840f();
            this.f39360A = f;
            if (bVar.f29138f < bVar.f29141i) {
                jVar.mo12932k(f);
                bVar.m4833m();
                if (!bVar.m4838h()) {
                    this.f29130z = null;
                }
                this.f29120p = 3;
                return true;
            }
            if (bVar.f29136d.f29222a.f29193g == 1) {
                this.f39360A = f - 8;
                jVar.mo12932k(8);
            }
            if ("audio/ac4".equals(bVar.f29136d.f29222a.f29192f.f14329v)) {
                this.f39361B = bVar.m4837i(this.f39360A, 7);
                C7429c.m22687a(this.f39360A, this.f29113i);
                bVar.f29133a.mo12386f(this.f29113i, 7);
                this.f39361B += 7;
            } else {
                this.f39361B = bVar.m4837i(this.f39360A, 0);
            }
            this.f39360A += this.f39361B;
            this.f29120p = 4;
            this.f39362C = 0;
        }
        C12998o oVar = bVar.f29136d.f29222a;
        AbstractC10500b0 b0Var = bVar.f29133a;
        long e = bVar.m4841e();
        C7544l0 l0Var = this.f29114j;
        if (l0Var != null) {
            e = l0Var.m22265a(e);
        }
        if (oVar.f29196j == 0) {
            while (true) {
                int i4 = this.f39361B;
                int i5 = this.f39360A;
                if (i4 >= i5) {
                    break;
                }
                this.f39361B += b0Var.mo12387e(jVar, i5 - i4, false);
            }
        } else {
            byte[] d2 = this.f29110f.m22012d();
            d2[0] = 0;
            d2[1] = 0;
            d2[2] = 0;
            int i6 = oVar.f29196j;
            int i7 = i6 + 1;
            int i8 = 4 - i6;
            while (this.f39361B < this.f39360A) {
                int i9 = this.f39362C;
                if (i9 == 0) {
                    jVar.readFully(d2, i8, i7);
                    this.f29110f.m22017P(0);
                    int n = this.f29110f.m22002n();
                    if (n >= i3) {
                        this.f39362C = n - 1;
                        this.f29109e.m22017P(0);
                        b0Var.mo12386f(this.f29109e, i2);
                        b0Var.mo12386f(this.f29110f, i3);
                        if (this.f39366G.length <= 0 || !C7566w.m22056g(oVar.f29192f.f14329v, d2[i2])) {
                            z = 0;
                        } else {
                            z = i3;
                        }
                        this.f39363D = z;
                        this.f39361B += 5;
                        this.f39360A += i8;
                    } else {
                        throw new C6728o("Invalid NAL length");
                    }
                } else {
                    if (this.f39363D) {
                        this.f29111g.m22021L(i9);
                        jVar.readFully(this.f29111g.m22012d(), 0, this.f39362C);
                        b0Var.mo12386f(this.f29111g, this.f39362C);
                        i = this.f39362C;
                        int k = C7566w.m22052k(this.f29111g.m22012d(), this.f29111g.m22010f());
                        this.f29111g.m22017P("video/hevc".equals(oVar.f29192f.f14329v) ? 1 : 0);
                        this.f29111g.m22018O(k);
                        C10502c.m13006a(e, this.f29111g, this.f39366G);
                    } else {
                        i = b0Var.mo12387e(jVar, i9, false);
                    }
                    this.f39361B += i;
                    this.f39362C -= i;
                    i2 = 4;
                    i3 = 1;
                }
            }
        }
        int c = bVar.m4843c();
        C12999p g = bVar.m4839g();
        if (g != null) {
            aVar = g.f29200c;
        } else {
            aVar = null;
        }
        b0Var.mo12382c(e, c, this.f39360A, 0, aVar);
        m4852t(e);
        if (!bVar.m4838h()) {
            this.f29130z = null;
        }
        this.f29120p = 3;
        return true;
    }

    /* renamed from: O */
    private static boolean m4869O(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* renamed from: P */
    private static boolean m4868P(int i) {
        return i == 1751411826 || i == 1835296868 || i == 1836476516 || i == 1936286840 || i == 1937011556 || i == 1937011827 || i == 1668576371 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1937011571 || i == 1952867444 || i == 1952868452 || i == 1953196132 || i == 1953654136 || i == 1953658222 || i == 1886614376 || i == 1935763834 || i == 1935763823 || i == 1936027235 || i == 1970628964 || i == 1935828848 || i == 1936158820 || i == 1701606260 || i == 1835362404 || i == 1701671783;
    }

    /* renamed from: f */
    private static int m4866f(int i) {
        if (i >= 0) {
            return i;
        }
        throw new C6728o("Unexpected negative value: " + i);
    }

    /* renamed from: g */
    private void m4865g() {
        this.f29120p = 0;
        this.f29123s = 0;
    }

    /* renamed from: h */
    private C12979c m4864h(SparseArray<C12979c> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C12979c) C7510a.m22367e(sparseArray.get(i));
    }

    /* renamed from: i */
    private static C9798l m4863i(List<AbstractC12971a.C12972b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC12971a.C12972b bVar = list.get(i);
            if (bVar.f29064a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] d = bVar.f29068b.m22012d();
                UUID f = C12993l.m4791f(d);
                if (f == null) {
                    C7558r.m22104h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C9798l.C9800b(f, "video/mp4", d));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C9798l(arrayList);
    }

    /* renamed from: j */
    private static C12987b m4862j(SparseArray<C12987b> sparseArray) {
        int size = sparseArray.size();
        C12987b bVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C12987b valueAt = sparseArray.valueAt(i);
            if ((valueAt.f29144l || valueAt.f29138f != valueAt.f29136d.f29223b) && (!valueAt.f29144l || valueAt.f29140h != valueAt.f29134b.f29207e)) {
                long d = valueAt.m4842d();
                if (d < j) {
                    bVar = valueAt;
                    j = d;
                }
            }
        }
        return bVar;
    }

    /* renamed from: k */
    private static C12987b m4861k(SparseArray<C12987b> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i);
    }

    /* renamed from: l */
    private void m4860l() {
        int i;
        AbstractC10500b0[] b0VarArr = new AbstractC10500b0[2];
        this.f39365F = b0VarArr;
        AbstractC10500b0 b0Var = this.f29119o;
        int i2 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.f29105a & 4) != 0) {
            b0VarArr[i] = this.f39364E.mo7937e(100, 5);
            i3 = 101;
            i++;
        }
        AbstractC10500b0[] b0VarArr2 = (AbstractC10500b0[]) C7557q0.m22212B0(this.f39365F, i);
        this.f39365F = b0VarArr2;
        for (AbstractC10500b0 b0Var2 : b0VarArr2) {
            b0Var2.mo12388d(f39359K);
        }
        this.f39366G = new AbstractC10500b0[this.f29107c.size()];
        while (i2 < this.f39366G.length) {
            AbstractC10500b0 e = this.f39364E.mo7937e(i3, 3);
            e.mo12388d(this.f29107c.get(i2));
            this.f39366G[i2] = e;
            i2++;
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ AbstractC10514i[] m4859m() {
        return new AbstractC10514i[]{new C12985g()};
    }

    /* renamed from: o */
    private void m4857o(AbstractC12971a.C0416a aVar) {
        int i = aVar.f29064a;
        if (i == 1836019574) {
            m4853s(aVar);
        } else if (i == 1836019558) {
            m4854r(aVar);
        } else if (!this.f29117m.isEmpty()) {
            this.f29117m.peek().m4924d(aVar);
        }
    }

    /* renamed from: p */
    private void m4856p(C7570y yVar) {
        long j;
        long j2;
        String str;
        String str2;
        long j3;
        long j4;
        AbstractC10500b0[] b0VarArr;
        long j5;
        if (this.f39365F.length != 0) {
            yVar.m22017P(8);
            int c = AbstractC12971a.m4925c(yVar.m22002n());
            if (c == 0) {
                String str3 = (String) C7510a.m22367e(yVar.m21992x());
                String str4 = (String) C7510a.m22367e(yVar.m21992x());
                long F = yVar.m22027F();
                j4 = C7557q0.m22198I0(yVar.m22027F(), 1000000L, F);
                long j6 = this.f29129y;
                if (j6 != -9223372036854775807L) {
                    j5 = j6 + j4;
                } else {
                    j5 = -9223372036854775807L;
                }
                str2 = str3;
                j2 = C7557q0.m22198I0(yVar.m22027F(), 1000L, F);
                str = str4;
                j = yVar.m22027F();
                j3 = j5;
            } else if (c != 1) {
                C7558r.m22104h("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c);
                return;
            } else {
                long F2 = yVar.m22027F();
                j3 = C7557q0.m22198I0(yVar.m22024I(), 1000000L, F2);
                long I0 = C7557q0.m22198I0(yVar.m22027F(), 1000L, F2);
                long F3 = yVar.m22027F();
                str2 = (String) C7510a.m22367e(yVar.m21992x());
                j2 = I0;
                j = F3;
                str = (String) C7510a.m22367e(yVar.m21992x());
                j4 = -9223372036854775807L;
            }
            byte[] bArr = new byte[yVar.m22015a()];
            yVar.m22006j(bArr, 0, yVar.m22015a());
            C7570y yVar2 = new C7570y(this.f29115k.m34517a(new C3396a(str2, str, j2, j, bArr)));
            int a = yVar2.m22015a();
            for (AbstractC10500b0 b0Var : this.f39365F) {
                yVar2.m22017P(0);
                b0Var.mo12386f(yVar2, a);
            }
            if (j3 == -9223372036854775807L) {
                this.f29118n.addLast(new C12986a(j4, a));
                this.f29126v += a;
                return;
            }
            C7544l0 l0Var = this.f29114j;
            if (l0Var != null) {
                j3 = l0Var.m22265a(j3);
            }
            for (AbstractC10500b0 b0Var2 : this.f39365F) {
                b0Var2.mo12382c(j3, 1, a, 0, null);
            }
        }
    }

    /* renamed from: q */
    private void m4855q(AbstractC12971a.C12972b bVar, long j) {
        if (!this.f29117m.isEmpty()) {
            this.f29117m.peek().m4923e(bVar);
            return;
        }
        int i = bVar.f29064a;
        if (i == 1936286840) {
            Pair<Long, C10504d> B = m4882B(bVar.f29068b, j);
            this.f29129y = ((Long) B.first).longValue();
            this.f39364E.mo7936j((AbstractC10534y) B.second);
            this.f39367H = true;
        } else if (i == 1701671783) {
            m4856p(bVar.f29068b);
        }
    }

    /* renamed from: r */
    private void m4854r(AbstractC12971a.C0416a aVar) {
        m4850v(aVar, this.f29108d, this.f29105a, this.f29112h);
        C9798l i = m4863i(aVar.f29066c);
        if (i != null) {
            int size = this.f29108d.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f29108d.valueAt(i2).m4832n(i);
            }
        }
        if (this.f29127w != -9223372036854775807L) {
            int size2 = this.f29108d.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f29108d.valueAt(i3).m4834l(this.f29127w);
            }
            this.f29127w = -9223372036854775807L;
        }
    }

    /* renamed from: s */
    private void m4853s(AbstractC12971a.C0416a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        if (this.f29106b == null) {
            z = true;
        } else {
            z = false;
        }
        C7510a.m22365g(z, "Unexpected moov box.");
        C9798l i2 = m4863i(aVar.f29066c);
        AbstractC12971a.C0416a aVar2 = (AbstractC12971a.C0416a) C7510a.m22367e(aVar.m4922f(1836475768));
        SparseArray<C12979c> sparseArray = new SparseArray<>();
        int size = aVar2.f29066c.size();
        long j = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC12971a.C12972b bVar = aVar2.f29066c.get(i3);
            int i4 = bVar.f29064a;
            if (i4 == 1953654136) {
                Pair<Integer, C12979c> F = m4878F(bVar.f29068b);
                sparseArray.put(((Integer) F.first).intValue(), (C12979c) F.second);
            } else if (i4 == 1835362404) {
                j = m4851u(bVar.f29068b);
            }
        }
        C10530u uVar = new C10530u();
        if ((this.f29105a & 16) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<C13001r> z4 = C12973b.m4892z(aVar, uVar, j, i2, z2, false, new AbstractC3454f() { // from class: t7.e
            @Override // p163j$.util.function.Function
            public /* synthetic */ Function andThen(Function function) {
                return function.getClass();
            }

            @Override // p030bc.AbstractC3454f, p163j$.util.function.Function
            public final Object apply(Object obj) {
                return C12985g.this.m4858n((C12998o) obj);
            }

            @Override // p163j$.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return function.getClass();
            }
        });
        int size2 = z4.size();
        if (this.f29108d.size() == 0) {
            while (i < size2) {
                C13001r rVar = z4.get(i);
                C12998o oVar = rVar.f29222a;
                this.f29108d.put(oVar.f29187a, new C12987b(this.f39364E.mo7937e(i, oVar.f29188b), rVar, m4864h(sparseArray, oVar.f29187a)));
                this.f29128x = Math.max(this.f29128x, oVar.f29191e);
                i++;
            }
            this.f39364E.mo7935s();
            return;
        }
        if (this.f29108d.size() != size2) {
            z3 = false;
        }
        C7510a.m22366f(z3);
        while (i < size2) {
            C13001r rVar2 = z4.get(i);
            C12998o oVar2 = rVar2.f29222a;
            this.f29108d.get(oVar2.f29187a).m4836j(rVar2, m4864h(sparseArray, oVar2.f29187a));
            i++;
        }
    }

    /* renamed from: t */
    private void m4852t(long j) {
        while (!this.f29118n.isEmpty()) {
            C12986a removeFirst = this.f29118n.removeFirst();
            this.f29126v -= removeFirst.f29132b;
            long j2 = removeFirst.f29131a + j;
            C7544l0 l0Var = this.f29114j;
            if (l0Var != null) {
                j2 = l0Var.m22265a(j2);
            }
            for (AbstractC10500b0 b0Var : this.f39365F) {
                b0Var.mo12382c(j2, 1, removeFirst.f29132b, this.f29126v, null);
            }
        }
    }

    /* renamed from: u */
    private static long m4851u(C7570y yVar) {
        yVar.m22017P(8);
        if (AbstractC12971a.m4925c(yVar.m22002n()) == 0) {
            return yVar.m22027F();
        }
        return yVar.m22024I();
    }

    /* renamed from: v */
    private static void m4850v(AbstractC12971a.C0416a aVar, SparseArray<C12987b> sparseArray, int i, byte[] bArr) {
        int size = aVar.f29067d.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC12971a.C0416a aVar2 = aVar.f29067d.get(i2);
            if (aVar2.f29064a == 1953653094) {
                m4879E(aVar2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: w */
    private static void m4849w(C7570y yVar, C13000q qVar) {
        long j;
        yVar.m22017P(8);
        int n = yVar.m22002n();
        if ((AbstractC12971a.m4926b(n) & 1) == 1) {
            yVar.m22016Q(8);
        }
        int H = yVar.m22025H();
        if (H == 1) {
            int c = AbstractC12971a.m4925c(n);
            long j2 = qVar.f29206d;
            if (c == 0) {
                j = yVar.m22027F();
            } else {
                j = yVar.m22024I();
            }
            qVar.f29206d = j2 + j;
            return;
        }
        throw new C6728o("Unexpected saio entry count: " + H);
    }

    /* renamed from: x */
    private static void m4848x(C12999p pVar, C7570y yVar, C13000q qVar) {
        int i;
        boolean z;
        int i2 = pVar.f29201d;
        yVar.m22017P(8);
        boolean z2 = true;
        if ((AbstractC12971a.m4926b(yVar.m22002n()) & 1) == 1) {
            yVar.m22016Q(8);
        }
        int D = yVar.m22029D();
        int H = yVar.m22025H();
        if (H <= qVar.f29208f) {
            if (D == 0) {
                boolean[] zArr = qVar.f29216n;
                i = 0;
                for (int i3 = 0; i3 < H; i3++) {
                    int D2 = yVar.m22029D();
                    i += D2;
                    if (D2 > i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zArr[i3] = z;
                }
            } else {
                if (D <= i2) {
                    z2 = false;
                }
                i = (D * H) + 0;
                Arrays.fill(qVar.f29216n, 0, H, z2);
            }
            Arrays.fill(qVar.f29216n, H, qVar.f29208f, false);
            if (i > 0) {
                qVar.m4770d(i);
                return;
            }
            return;
        }
        throw new C6728o("Saiz sample count " + H + " is greater than fragment sample count" + qVar.f29208f);
    }

    /* renamed from: y */
    private static void m4847y(AbstractC12971a.C0416a aVar, String str, C13000q qVar) {
        boolean z;
        byte[] bArr = null;
        C7570y yVar = null;
        C7570y yVar2 = null;
        for (int i = 0; i < aVar.f29066c.size(); i++) {
            AbstractC12971a.C12972b bVar = aVar.f29066c.get(i);
            C7570y yVar3 = bVar.f29068b;
            int i2 = bVar.f29064a;
            if (i2 == 1935828848) {
                yVar3.m22017P(12);
                if (yVar3.m22002n() == 1936025959) {
                    yVar = yVar3;
                }
            } else if (i2 == 1936158820) {
                yVar3.m22017P(12);
                if (yVar3.m22002n() == 1936025959) {
                    yVar2 = yVar3;
                }
            }
        }
        if (!(yVar == null || yVar2 == null)) {
            yVar.m22017P(8);
            int c = AbstractC12971a.m4925c(yVar.m22002n());
            yVar.m22016Q(4);
            if (c == 1) {
                yVar.m22016Q(4);
            }
            if (yVar.m22002n() == 1) {
                yVar2.m22017P(8);
                int c2 = AbstractC12971a.m4925c(yVar2.m22002n());
                yVar2.m22016Q(4);
                if (c2 == 1) {
                    if (yVar2.m22027F() == 0) {
                        throw new C6728o("Variable length description in sgpd found (unsupported)");
                    }
                } else if (c2 >= 2) {
                    yVar2.m22016Q(4);
                }
                if (yVar2.m22027F() == 1) {
                    yVar2.m22016Q(1);
                    int D = yVar2.m22029D();
                    int i3 = (D & 240) >> 4;
                    int i4 = D & 15;
                    if (yVar2.m22029D() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int D2 = yVar2.m22029D();
                        byte[] bArr2 = new byte[16];
                        yVar2.m22006j(bArr2, 0, 16);
                        if (D2 == 0) {
                            int D3 = yVar2.m22029D();
                            bArr = new byte[D3];
                            yVar2.m22006j(bArr, 0, D3);
                        }
                        qVar.f29215m = true;
                        qVar.f29217o = new C12999p(z, str, D2, bArr2, i3, i4, bArr);
                        return;
                    }
                    return;
                }
                throw new C6728o("Entry count in sgpd != 1 (unsupported).");
            }
            throw new C6728o("Entry count in sbgp != 1 (unsupported).");
        }
    }

    /* renamed from: z */
    private static void m4846z(C7570y yVar, int i, C13000q qVar) {
        boolean z;
        yVar.m22017P(i + 8);
        int b = AbstractC12971a.m4926b(yVar.m22002n());
        if ((b & 1) == 0) {
            if ((b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int H = yVar.m22025H();
            if (H == 0) {
                Arrays.fill(qVar.f29216n, 0, qVar.f29208f, false);
            } else if (H == qVar.f29208f) {
                Arrays.fill(qVar.f29216n, 0, H, z);
                qVar.m4770d(yVar.m22015a());
                qVar.m4773a(yVar);
            } else {
                throw new C6728o("Senc sample count " + H + " is different from fragment sample count" + qVar.f29208f);
            }
        } else {
            throw new C6728o("Overriding TrackEncryptionBox parameters is unsupported.");
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        int size = this.f29108d.size();
        for (int i = 0; i < size; i++) {
            this.f29108d.valueAt(i).m4835k();
        }
        this.f29118n.clear();
        this.f29126v = 0;
        this.f29127w = j2;
        this.f29117m.clear();
        m4865g();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f39364E = kVar;
        m4865g();
        m4860l();
        C12998o oVar = this.f29106b;
        if (oVar != null) {
            this.f29108d.put(0, new C12987b(kVar.mo7937e(0, oVar.f29188b), new C13001r(this.f29106b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C12979c(0, 0, 0, 0)));
            this.f39364E.mo7935s();
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        return C12997n.m4778b(jVar);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        while (true) {
            int i = this.f29120p;
            if (i != 0) {
                if (i == 1) {
                    m4872L(jVar);
                } else if (i == 2) {
                    m4871M(jVar);
                } else if (m4870N(jVar)) {
                    return 0;
                }
            } else if (!m4873K(jVar)) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public C12998o m4858n(C12998o oVar) {
        return oVar;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C12985g(int i) {
        this(i, null);
    }

    public C12985g(int i, C7544l0 l0Var) {
        this(i, l0Var, null, Collections.emptyList());
    }

    public C12985g(int i, C7544l0 l0Var, C12998o oVar) {
        this(i, l0Var, oVar, Collections.emptyList());
    }

    public C12985g(int i, C7544l0 l0Var, C12998o oVar, List<C6722k> list) {
        this(i, l0Var, oVar, list, null);
    }

    public C12985g(int i, C7544l0 l0Var, C12998o oVar, List<C6722k> list, AbstractC10500b0 b0Var) {
        this.f29105a = i;
        this.f29114j = l0Var;
        this.f29106b = oVar;
        this.f29107c = Collections.unmodifiableList(list);
        this.f29119o = b0Var;
        this.f29115k = new C3398c();
        this.f29116l = new C7570y(16);
        this.f29109e = new C7570y(C7566w.f16395a);
        this.f29110f = new C7570y(5);
        this.f29111g = new C7570y();
        byte[] bArr = new byte[16];
        this.f29112h = bArr;
        this.f29113i = new C7570y(bArr);
        this.f29117m = new ArrayDeque<>();
        this.f29118n = new ArrayDeque<>();
        this.f29108d = new SparseArray<>();
        this.f29128x = -9223372036854775807L;
        this.f29127w = -9223372036854775807L;
        this.f29129y = -9223372036854775807L;
        this.f39364E = AbstractC10516k.f23261f;
        this.f39365F = new AbstractC10500b0[0];
        this.f39366G = new AbstractC10500b0[0];
    }
}
