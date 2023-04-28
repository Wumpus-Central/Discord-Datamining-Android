package p153i8;

import android.net.Uri;
import android.os.Handler;
import com.discord.nearby.NearbyManager;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.upstream.AbstractC5318g;
import com.google.android.exoplayer2.upstream.C5288a;
import com.google.android.exoplayer2.upstream.C5320h;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p029b9.AbstractC3415h;
import p061d8.C6402b;
import p079e7.C6713c;
import p079e7.C6722k;
import p079e7.C6725l;
import p079e7.C6728o;
import p079e7.C6736w;
import p081e9.AbstractC6765b;
import p081e9.AbstractC6774h;
import p081e9.C6793v;
import p119g9.C7510a;
import p119g9.C7522f;
import p119g9.C7557q0;
import p119g9.C7562u;
import p119g9.C7570y;
import p152i7.C8223h;
import p153i8.AbstractC8233b0;
import p153i8.AbstractC8287r;
import p153i8.C8269m;
import p153i8.C8274n0;
import p193k7.AbstractC9815v;
import p193k7.AbstractC9818x;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10533x;
import p459z7.C14576a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i8.j0 */
/* loaded from: classes7.dex */
public final class C8257j0 implements AbstractC8287r, AbstractC10516k, C5320h.AbstractC5322b<C8258a>, C5320h.AbstractC5326f, C8274n0.AbstractC8276b {

    /* renamed from: W */
    private static final Map<String, String> f38570W = m20180K();

    /* renamed from: X */
    private static final C6722k f38571X = new C6722k.C6724b().m24505S("icy").m24488e0("application/x-icy").m24519E();

    /* renamed from: A */
    private AbstractC8287r.AbstractC8288a f38572A;

    /* renamed from: B */
    private C6402b f38573B;

    /* renamed from: E */
    private boolean f38576E;

    /* renamed from: F */
    private boolean f38577F;

    /* renamed from: G */
    private boolean f38578G;

    /* renamed from: H */
    private C8262e f38579H;

    /* renamed from: I */
    private AbstractC10534y f38580I;

    /* renamed from: K */
    private boolean f38582K;

    /* renamed from: M */
    private boolean f38584M;

    /* renamed from: N */
    private boolean f38585N;

    /* renamed from: O */
    private int f38586O;

    /* renamed from: Q */
    private long f38588Q;

    /* renamed from: S */
    private boolean f38590S;

    /* renamed from: T */
    private int f38591T;

    /* renamed from: U */
    private boolean f38592U;

    /* renamed from: V */
    private boolean f38593V;

    /* renamed from: k */
    private final Uri f17903k;

    /* renamed from: l */
    private final DataSource f17904l;

    /* renamed from: m */
    private final AbstractC9818x f17905m;

    /* renamed from: n */
    private final AbstractC5318g f17906n;

    /* renamed from: o */
    private final AbstractC8233b0.C8234a f17907o;

    /* renamed from: p */
    private final AbstractC9815v.C9816a f17908p;

    /* renamed from: q */
    private final AbstractC8259b f17909q;

    /* renamed from: r */
    private final AbstractC6765b f17910r;

    /* renamed from: s */
    private final String f17911s;

    /* renamed from: t */
    private final long f17912t;

    /* renamed from: v */
    private final AbstractC8249f0 f17914v;

    /* renamed from: u */
    private final C5320h f17913u = new C5320h("Loader:ProgressiveMediaPeriod");

    /* renamed from: w */
    private final C7522f f17915w = new C7522f();

    /* renamed from: x */
    private final Runnable f17916x = new Runnable() { // from class: i8.g0
        @Override // java.lang.Runnable
        public final void run() {
            C8257j0.this.m20172S();
        }
    };

    /* renamed from: y */
    private final Runnable f17917y = new Runnable() { // from class: i8.h0
        @Override // java.lang.Runnable
        public final void run() {
            C8257j0.this.m20174Q();
        }
    };

    /* renamed from: z */
    private final Handler f17918z = C7557q0.m22117x();

    /* renamed from: D */
    private C8261d[] f38575D = new C8261d[0];

    /* renamed from: C */
    private C8274n0[] f38574C = new C8274n0[0];

    /* renamed from: R */
    private long f38589R = -9223372036854775807L;

    /* renamed from: P */
    private long f38587P = -1;

    /* renamed from: J */
    private long f38581J = -9223372036854775807L;

    /* renamed from: L */
    private int f38583L = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.j0$a */
    /* loaded from: classes7.dex */
    public final class C8258a implements C5320h.AbstractC5325e, C8269m.AbstractC8270a {

        /* renamed from: b */
        private final Uri f17920b;

        /* renamed from: c */
        private final C6793v f17921c;

        /* renamed from: d */
        private final AbstractC8249f0 f17922d;

        /* renamed from: e */
        private final AbstractC10516k f17923e;

        /* renamed from: f */
        private final C7522f f17924f;

        /* renamed from: h */
        private volatile boolean f17926h;

        /* renamed from: j */
        private long f17928j;

        /* renamed from: m */
        private AbstractC10500b0 f17931m;

        /* renamed from: n */
        private boolean f17932n;

        /* renamed from: g */
        private final C10533x f17925g = new C10533x();

        /* renamed from: i */
        private boolean f17927i = true;

        /* renamed from: l */
        private long f17930l = -1;

        /* renamed from: a */
        private final long f17919a = C8273n.m20108a();

        /* renamed from: k */
        private C5288a f17929k = m20145j(0);

        public C8258a(Uri uri, DataSource dataSource, AbstractC8249f0 f0Var, AbstractC10516k kVar, C7522f fVar) {
            this.f17920b = uri;
            this.f17921c = new C6793v(dataSource);
            this.f17922d = f0Var;
            this.f17923e = kVar;
            this.f17924f = fVar;
        }

        /* renamed from: j */
        private C5288a m20145j(long j) {
            return new C5288a.C5289b().m29615i(this.f17920b).m29616h(j).m29618f(C8257j0.this.f17911s).m29622b(6).m29619e(C8257j0.f38570W).m29623a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public void m20144k(long j, long j2) {
            this.f17925g.f23290a = j;
            this.f17928j = j2;
            this.f17927i = true;
            this.f17932n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: a */
        public void mo12497a() {
            int i = 0;
            while (i == 0 && !this.f17926h) {
                try {
                    long j = this.f17925g.f23290a;
                    C5288a j2 = m20145j(j);
                    this.f17929k = j2;
                    long b = this.f17921c.mo12542b(j2);
                    this.f17930l = b;
                    if (b != -1) {
                        this.f17930l = b + j;
                    }
                    C8257j0.this.f38573B = C6402b.m25615a(this.f17921c.mo12540e());
                    AbstractC6774h hVar = this.f17921c;
                    if (!(C8257j0.this.f38573B == null || C8257j0.this.f38573B.f13387p == -1)) {
                        hVar = new C8269m(this.f17921c, C8257j0.this.f38573B.f13387p, this);
                        AbstractC10500b0 N = C8257j0.this.m20177N();
                        this.f17931m = N;
                        N.mo12388d(C8257j0.f38571X);
                    }
                    long j3 = j;
                    this.f17922d.mo20194d(hVar, this.f17920b, this.f17921c.mo12540e(), j, this.f17930l, this.f17923e);
                    if (C8257j0.this.f38573B != null) {
                        this.f17922d.mo20195c();
                    }
                    if (this.f17927i) {
                        this.f17922d.mo20197a(j3, this.f17928j);
                        this.f17927i = false;
                    }
                    while (true) {
                        while (i == 0 && !this.f17926h) {
                            try {
                                this.f17924f.m22338a();
                                i = this.f17922d.mo20196b(this.f17925g);
                                j3 = this.f17922d.mo20193e();
                                if (j3 > C8257j0.this.f17912t + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f17924f.m22337b();
                        C8257j0.this.f17918z.post(C8257j0.this.f17917y);
                    }
                    if (i == 1) {
                        i = 0;
                    } else if (this.f17922d.mo20193e() != -1) {
                        this.f17925g.f23290a = this.f17922d.mo20193e();
                    }
                    C7557q0.m22137n(this.f17921c);
                } catch (Throwable th2) {
                    if (!(i == 1 || this.f17922d.mo20193e() == -1)) {
                        this.f17925g.f23290a = this.f17922d.mo20193e();
                    }
                    C7557q0.m22137n(this.f17921c);
                    throw th2;
                }
            }
        }

        @Override // p153i8.C8269m.AbstractC8270a
        /* renamed from: b */
        public void mo20128b(C7570y yVar) {
            long j;
            if (!this.f17932n) {
                j = this.f17928j;
            } else {
                j = Math.max(C8257j0.this.m20178M(), this.f17928j);
            }
            int a = yVar.m22015a();
            AbstractC10500b0 b0Var = (AbstractC10500b0) C7510a.m22367e(this.f17931m);
            b0Var.mo12386f(yVar, a);
            b0Var.mo12382c(j, 1, a, 0, null);
            this.f17932n = true;
        }

        @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5325e
        /* renamed from: c */
        public void mo12496c() {
            this.f17926h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i8.j0$b */
    /* loaded from: classes7.dex */
    public interface AbstractC8259b {
        /* renamed from: j */
        void mo20141j(long j, boolean z, boolean z2);
    }

    /* renamed from: i8.j0$c */
    /* loaded from: classes7.dex */
    private final class C8260c implements AbstractC8278o0 {

        /* renamed from: k */
        private final int f17934k;

        public C8260c(int i) {
            this.f17934k = i;
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: a */
        public void mo12456a() {
            C8257j0.this.m20168W(this.f17934k);
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: e */
        public boolean mo12452e() {
            return C8257j0.this.m20175P(this.f17934k);
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: j */
        public int mo12451j(C6725l lVar, C8223h hVar, boolean z) {
            return C8257j0.this.m20163b0(this.f17934k, lVar, hVar, z);
        }

        @Override // p153i8.AbstractC8278o0
        /* renamed from: s */
        public int mo12450s(long j) {
            return C8257j0.this.m20159f0(this.f17934k, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.j0$d */
    /* loaded from: classes7.dex */
    public static final class C8261d {

        /* renamed from: a */
        public final int f17936a;

        /* renamed from: b */
        public final boolean f17937b;

        public C8261d(int i, boolean z) {
            this.f17936a = i;
            this.f17937b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8261d.class != obj.getClass()) {
                return false;
            }
            C8261d dVar = (C8261d) obj;
            if (this.f17936a == dVar.f17936a && this.f17937b == dVar.f17937b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f17936a * 31) + (this.f17937b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i8.j0$e */
    /* loaded from: classes7.dex */
    public static final class C8262e {

        /* renamed from: a */
        public final TrackGroupArray f17938a;

        /* renamed from: b */
        public final boolean[] f17939b;

        /* renamed from: c */
        public final boolean[] f17940c;

        /* renamed from: d */
        public final boolean[] f17941d;

        public C8262e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f17938a = trackGroupArray;
            this.f17939b = zArr;
            int i = trackGroupArray.f9362k;
            this.f17940c = new boolean[i];
            this.f17941d = new boolean[i];
        }
    }

    public C8257j0(Uri uri, DataSource dataSource, AbstractC10521o oVar, AbstractC9818x xVar, AbstractC9815v.C9816a aVar, AbstractC5318g gVar, AbstractC8233b0.C8234a aVar2, AbstractC8259b bVar, AbstractC6765b bVar2, String str, int i) {
        this.f17903k = uri;
        this.f17904l = dataSource;
        this.f17905m = xVar;
        this.f17908p = aVar;
        this.f17906n = gVar;
        this.f17907o = aVar2;
        this.f17909q = bVar;
        this.f17910r = bVar2;
        this.f17911s = str;
        this.f17912t = i;
        this.f17914v = new C8235c(oVar);
    }

    /* renamed from: H */
    private void m20183H() {
        C7510a.m22366f(this.f38577F);
        C7510a.m22367e(this.f38579H);
        C7510a.m22367e(this.f38580I);
    }

    /* renamed from: I */
    private boolean m20182I(C8258a aVar, int i) {
        AbstractC10534y yVar;
        if (this.f38587P == -1 && ((yVar = this.f38580I) == null || yVar.mo2206i() == -9223372036854775807L)) {
            if (!this.f38577F || m20157h0()) {
                this.f38585N = this.f38577F;
                this.f38588Q = 0L;
                this.f38591T = 0;
                for (C8274n0 n0Var : this.f38574C) {
                    n0Var.m20088T();
                }
                aVar.m20144k(0L, 0L);
                return true;
            }
            this.f38590S = true;
            return false;
        }
        this.f38591T = i;
        return true;
    }

    /* renamed from: J */
    private void m20181J(C8258a aVar) {
        if (this.f38587P == -1) {
            this.f38587P = aVar.f17930l;
        }
    }

    /* renamed from: K */
    private static Map<String, String> m20180K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", NearbyManager.PERMISSION_DENIED);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: L */
    private int m20179L() {
        int i = 0;
        for (C8274n0 n0Var : this.f38574C) {
            i += n0Var.m20102F();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public long m20178M() {
        long j = Long.MIN_VALUE;
        for (C8274n0 n0Var : this.f38574C) {
            j = Math.max(j, n0Var.m20059y());
        }
        return j;
    }

    /* renamed from: O */
    private boolean m20176O() {
        return this.f38589R != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m20174Q() {
        if (!this.f38593V) {
            ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f38572A)).mo12471i(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m20172S() {
        boolean z;
        C14576a aVar;
        if (!(this.f38593V || this.f38577F || !this.f38576E || this.f38580I == null)) {
            for (C8274n0 n0Var : this.f38574C) {
                if (n0Var.m20103E() == null) {
                    return;
                }
            }
            this.f17915w.m22337b();
            int length = this.f38574C.length;
            C8302u0[] u0VarArr = new C8302u0[length];
            boolean[] zArr = new boolean[length];
            for (int i = 0; i < length; i++) {
                C6722k kVar = (C6722k) C7510a.m22367e(this.f38574C[i].m20103E());
                String str = kVar.f14329v;
                boolean p = C7562u.m22072p(str);
                if (p || C7562u.m22069s(str)) {
                    z = true;
                } else {
                    z = false;
                }
                zArr[i] = z;
                this.f38578G = z | this.f38578G;
                C6402b bVar = this.f38573B;
                if (bVar != null) {
                    if (p || this.f38575D[i].f17937b) {
                        C14576a aVar2 = kVar.f14327t;
                        if (aVar2 == null) {
                            aVar = new C14576a(bVar);
                        } else {
                            aVar = aVar2.m186a(bVar);
                        }
                        kVar = kVar.m24531a().m24500X(aVar).m24519E();
                    }
                    if (p && kVar.f14323p == -1 && kVar.f14324q == -1 && bVar.f13382k != -1) {
                        kVar = kVar.m24531a().m24517G(bVar.f13382k).m24519E();
                    }
                }
                u0VarArr[i] = new C8302u0(kVar.m24530b(this.f17905m.mo15277a(kVar)));
            }
            this.f38579H = new C8262e(new TrackGroupArray(u0VarArr), zArr);
            this.f38577F = true;
            ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f38572A)).mo20028j(this);
        }
    }

    /* renamed from: T */
    private void m20171T(int i) {
        m20183H();
        C8262e eVar = this.f38579H;
        boolean[] zArr = eVar.f17941d;
        if (!zArr[i]) {
            C6722k a = eVar.f17938a.m29997a(i).m19990a(0);
            this.f17907o.m20245i(C7562u.m22076l(a.f14329v), a, 0, null, this.f38588Q);
            zArr[i] = true;
        }
    }

    /* renamed from: U */
    private void m20170U(int i) {
        m20183H();
        boolean[] zArr = this.f38579H.f17939b;
        if (this.f38590S && zArr[i]) {
            if (!this.f38574C[i].m20098J(false)) {
                this.f38589R = 0L;
                this.f38590S = false;
                this.f38585N = true;
                this.f38588Q = 0L;
                this.f38591T = 0;
                for (C8274n0 n0Var : this.f38574C) {
                    n0Var.m20088T();
                }
                ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f38572A)).mo12471i(this);
            }
        }
    }

    /* renamed from: a0 */
    private AbstractC10500b0 m20164a0(C8261d dVar) {
        int length = this.f38574C.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.f38575D[i])) {
                return this.f38574C[i];
            }
        }
        C8274n0 j = C8274n0.m20073j(this.f17910r, this.f17918z.getLooper(), this.f17905m, this.f17908p);
        j.m20080b0(this);
        int i2 = length + 1;
        C8261d[] dVarArr = (C8261d[]) Arrays.copyOf(this.f38575D, i2);
        dVarArr[length] = dVar;
        this.f38575D = (C8261d[]) C7557q0.m22143k(dVarArr);
        C8274n0[] n0VarArr = (C8274n0[]) Arrays.copyOf(this.f38574C, i2);
        n0VarArr[length] = j;
        this.f38574C = (C8274n0[]) C7557q0.m22143k(n0VarArr);
        return j;
    }

    /* renamed from: d0 */
    private boolean m20161d0(boolean[] zArr, long j) {
        int length = this.f38574C.length;
        for (int i = 0; i < length; i++) {
            if (!this.f38574C[i].m20084X(j, false) && (zArr[i] || !this.f38578G)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public void m20173R(AbstractC10534y yVar) {
        AbstractC10534y yVar2;
        boolean z;
        if (this.f38573B == null) {
            yVar2 = yVar;
        } else {
            yVar2 = new AbstractC10534y.C10536b(-9223372036854775807L);
        }
        this.f38580I = yVar2;
        this.f38581J = yVar.mo2206i();
        int i = 1;
        if (this.f38587P == -1 && yVar.mo2206i() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        this.f38582K = z;
        if (z) {
            i = 7;
        }
        this.f38583L = i;
        this.f17909q.mo20141j(this.f38581J, yVar.mo2207h(), this.f38582K);
        if (!this.f38577F) {
            m20172S();
        }
    }

    /* renamed from: g0 */
    private void m20158g0() {
        C8258a aVar = new C8258a(this.f17903k, this.f17904l, this.f17914v, this, this.f17915w);
        if (this.f38577F) {
            C7510a.m22366f(m20176O());
            long j = this.f38581J;
            if (j == -9223372036854775807L || this.f38589R <= j) {
                aVar.m20144k(((AbstractC10534y) C7510a.m22367e(this.f38580I)).mo2208f(this.f38589R).f23291a.f23297b, this.f38589R);
                for (C8274n0 n0Var : this.f38574C) {
                    n0Var.m20082Z(this.f38589R);
                }
                this.f38589R = -9223372036854775807L;
            } else {
                this.f38592U = true;
                this.f38589R = -9223372036854775807L;
                return;
            }
        }
        this.f38591T = m20179L();
        this.f17907o.m20259A(new C8273n(aVar.f17919a, aVar.f17929k, this.f17913u.m29473n(aVar, this, this.f17906n.mo29487c(this.f38583L))), 1, -1, null, 0, null, aVar.f17928j, this.f38581J);
    }

    /* renamed from: h0 */
    private boolean m20157h0() {
        return this.f38585N || m20176O();
    }

    /* renamed from: N */
    AbstractC10500b0 m20177N() {
        return m20164a0(new C8261d(0, true));
    }

    /* renamed from: P */
    boolean m20175P(int i) {
        return !m20157h0() && this.f38574C[i].m20098J(this.f38592U);
    }

    /* renamed from: V */
    void m20169V() {
        this.f17913u.m29476k(this.f17906n.mo29487c(this.f38583L));
    }

    /* renamed from: W */
    void m20168W(int i) {
        this.f38574C[i].m20096L();
        m20169V();
    }

    /* renamed from: X */
    public void mo10446i(C8258a aVar, long j, long j2, boolean z) {
        C6793v vVar = aVar.f17921c;
        C8273n nVar = new C8273n(aVar.f17919a, aVar.f17929k, vVar.m24319p(), vVar.m24318q(), j, j2, vVar.m24320o());
        this.f17906n.mo29486d(aVar.f17919a);
        this.f17907o.m20236r(nVar, 1, -1, null, 0, null, aVar.f17928j, this.f38581J);
        if (!z) {
            m20181J(aVar);
            for (C8274n0 n0Var : this.f38574C) {
                n0Var.m20088T();
            }
            if (this.f38586O > 0) {
                ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f38572A)).mo12471i(this);
            }
        }
    }

    /* renamed from: Y */
    public void mo10444k(C8258a aVar, long j, long j2) {
        AbstractC10534y yVar;
        long j3;
        if (this.f38581J == -9223372036854775807L && (yVar = this.f38580I) != null) {
            boolean h = yVar.mo2207h();
            long M = m20178M();
            if (M == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = M + 10000;
            }
            this.f38581J = j3;
            this.f17909q.mo20141j(j3, h, this.f38582K);
        }
        C6793v vVar = aVar.f17921c;
        C8273n nVar = new C8273n(aVar.f17919a, aVar.f17929k, vVar.m24319p(), vVar.m24318q(), j, j2, vVar.m24320o());
        this.f17906n.mo29486d(aVar.f17919a);
        this.f17907o.m20233u(nVar, 1, -1, null, 0, null, aVar.f17928j, this.f38581J);
        m20181J(aVar);
        this.f38592U = true;
        ((AbstractC8287r.AbstractC8288a) C7510a.m22367e(this.f38572A)).mo12471i(this);
    }

    /* renamed from: Z */
    public C5320h.C5323c mo10440o(C8258a aVar, long j, long j2, IOException iOException, int i) {
        C5320h.C5323c cVar;
        C8258a aVar2;
        boolean z;
        m20181J(aVar);
        C6793v vVar = aVar.f17921c;
        C8273n nVar = new C8273n(aVar.f17919a, aVar.f17929k, vVar.m24319p(), vVar.m24318q(), j, j2, vVar.m24320o());
        long a = this.f17906n.mo29489a(new AbstractC5318g.C5319a(nVar, new C8284q(1, -1, null, 0, null, C6713c.m24565d(aVar.f17928j), C6713c.m24565d(this.f38581J)), iOException, i));
        if (a == -9223372036854775807L) {
            cVar = C5320h.f9877g;
        } else {
            int L = m20179L();
            if (L > this.f38591T) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            if (m20182I(aVar2, L)) {
                cVar = C5320h.m29479h(z, a);
            } else {
                cVar = C5320h.f9876f;
            }
        }
        boolean z2 = !cVar.m29470c();
        this.f17907o.m20231w(nVar, 1, -1, null, 0, null, aVar.f17928j, this.f38581J, iOException, z2);
        if (z2) {
            this.f17906n.mo29486d(aVar.f17919a);
        }
        return cVar;
    }

    @Override // p153i8.C8274n0.AbstractC8276b
    /* renamed from: a */
    public void mo12423a(C6722k kVar) {
        this.f17918z.post(this.f17916x);
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: b */
    public long mo12421b() {
        if (this.f38586O == 0) {
            return Long.MIN_VALUE;
        }
        return mo12413g();
    }

    /* renamed from: b0 */
    int m20163b0(int i, C6725l lVar, C8223h hVar, boolean z) {
        if (m20157h0()) {
            return -3;
        }
        m20171T(i);
        int Q = this.f38574C[i].m20091Q(lVar, hVar, z, this.f38592U);
        if (Q == -3) {
            m20170U(i);
        }
        return Q;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: c */
    public boolean mo12419c() {
        return this.f17913u.m29477j() && this.f17915w.m22336c();
    }

    /* renamed from: c0 */
    public void m20162c0() {
        if (this.f38577F) {
            for (C8274n0 n0Var : this.f38574C) {
                n0Var.m20092P();
            }
        }
        this.f17913u.m29474m(this);
        this.f17918z.removeCallbacksAndMessages(null);
        this.f38572A = null;
        this.f38593V = true;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: d */
    public long mo12472d(long j, C6736w wVar) {
        m20183H();
        if (!this.f38580I.mo2207h()) {
            return 0L;
        }
        AbstractC10534y.C10535a f = this.f38580I.mo2208f(j);
        return wVar.m24422a(j, f.f23291a.f23296a, f.f23292b.f23296a);
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: e */
    public AbstractC10500b0 mo7937e(int i, int i2) {
        return m20164a0(new C8261d(i, false));
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: f */
    public boolean mo12415f(long j) {
        if (this.f38592U || this.f17913u.m29478i() || this.f38590S) {
            return false;
        }
        if (this.f38577F && this.f38586O == 0) {
            return false;
        }
        boolean d = this.f17915w.m22335d();
        if (this.f17913u.m29477j()) {
            return d;
        }
        m20158g0();
        return true;
    }

    /* renamed from: f0 */
    int m20159f0(int i, long j) {
        if (m20157h0()) {
            return 0;
        }
        m20171T(i);
        C8274n0 n0Var = this.f38574C[i];
        int D = n0Var.m20104D(j, this.f38592U);
        n0Var.m20079c0(D);
        if (D == 0) {
            m20170U(i);
        }
        return D;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: g */
    public long mo12413g() {
        long j;
        m20183H();
        boolean[] zArr = this.f38579H.f17939b;
        if (this.f38592U) {
            return Long.MIN_VALUE;
        }
        if (m20176O()) {
            return this.f38589R;
        }
        if (this.f38578G) {
            int length = this.f38574C.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f38574C[i].m20099I()) {
                    j = Math.min(j, this.f38574C[i].m20059y());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m20178M();
        }
        if (j == Long.MIN_VALUE) {
            return this.f38588Q;
        }
        return j;
    }

    @Override // p153i8.AbstractC8287r, p153i8.AbstractC8282p0
    /* renamed from: h */
    public void mo12411h(long j) {
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: j */
    public void mo7936j(final AbstractC10534y yVar) {
        this.f17918z.post(new Runnable() { // from class: i8.i0
            @Override // java.lang.Runnable
            public final void run() {
                C8257j0.this.m20173R(yVar);
            }
        });
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: l */
    public long mo12470l(long j) {
        m20183H();
        boolean[] zArr = this.f38579H.f17939b;
        if (!this.f38580I.mo2207h()) {
            j = 0;
        }
        int i = 0;
        this.f38585N = false;
        this.f38588Q = j;
        if (m20176O()) {
            this.f38589R = j;
            return j;
        } else if (this.f38583L != 7 && m20161d0(zArr, j)) {
            return j;
        } else {
            this.f38590S = false;
            this.f38589R = j;
            this.f38592U = false;
            if (this.f17913u.m29477j()) {
                C8274n0[] n0VarArr = this.f38574C;
                int length = n0VarArr.length;
                while (i < length) {
                    n0VarArr[i].m20066q();
                    i++;
                }
                this.f17913u.m29481f();
            } else {
                this.f17913u.m29480g();
                C8274n0[] n0VarArr2 = this.f38574C;
                int length2 = n0VarArr2.length;
                while (i < length2) {
                    n0VarArr2[i].m20088T();
                    i++;
                }
            }
            return j;
        }
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: m */
    public void mo12469m(AbstractC8287r.AbstractC8288a aVar, long j) {
        this.f38572A = aVar;
        this.f17915w.m22335d();
        m20158g0();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: n */
    public long mo12468n() {
        if (!this.f38585N) {
            return -9223372036854775807L;
        }
        if (!this.f38592U && m20179L() <= this.f38591T) {
            return -9223372036854775807L;
        }
        this.f38585N = false;
        return this.f38588Q;
    }

    @Override // com.google.android.exoplayer2.upstream.C5320h.AbstractC5326f
    /* renamed from: p */
    public void mo12402p() {
        for (C8274n0 n0Var : this.f38574C) {
            n0Var.m20090R();
        }
        this.f17914v.release();
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: q */
    public long mo12466q(AbstractC3415h[] hVarArr, boolean[] zArr, AbstractC8278o0[] o0VarArr, boolean[] zArr2, long j) {
        boolean z;
        AbstractC3415h hVar;
        boolean z2;
        boolean z3;
        m20183H();
        C8262e eVar = this.f38579H;
        TrackGroupArray trackGroupArray = eVar.f17938a;
        boolean[] zArr3 = eVar.f17940c;
        int i = this.f38586O;
        int i2 = 0;
        for (int i3 = 0; i3 < hVarArr.length; i3++) {
            AbstractC8278o0 o0Var = o0VarArr[i3];
            if (o0Var != null && (hVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((C8260c) o0Var).f17934k;
                C7510a.m22366f(zArr3[i4]);
                this.f38586O--;
                zArr3[i4] = false;
                o0VarArr[i3] = null;
            }
        }
        if (!this.f38584M ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i5 = 0; i5 < hVarArr.length; i5++) {
            if (o0VarArr[i5] == null && (hVar = hVarArr[i5]) != null) {
                if (hVar.length() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C7510a.m22366f(z2);
                if (hVar.mo34413d(0) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C7510a.m22366f(z3);
                int b = trackGroupArray.m29996b(hVar.mo34411k());
                C7510a.m22366f(!zArr3[b]);
                this.f38586O++;
                zArr3[b] = true;
                o0VarArr[i5] = new C8260c(b);
                zArr2[i5] = true;
                if (!z) {
                    C8274n0 n0Var = this.f38574C[b];
                    if (n0Var.m20084X(j, true) || n0Var.m20106B() == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
        }
        if (this.f38586O == 0) {
            this.f38590S = false;
            this.f38585N = false;
            if (this.f17913u.m29477j()) {
                C8274n0[] n0VarArr = this.f38574C;
                int length = n0VarArr.length;
                while (i2 < length) {
                    n0VarArr[i2].m20066q();
                    i2++;
                }
                this.f17913u.m29481f();
            } else {
                C8274n0[] n0VarArr2 = this.f38574C;
                int length2 = n0VarArr2.length;
                while (i2 < length2) {
                    n0VarArr2[i2].m20088T();
                    i2++;
                }
            }
        } else if (z) {
            j = mo12470l(j);
            while (i2 < o0VarArr.length) {
                if (o0VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f38584M = true;
        return j;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: r */
    public void mo12465r() {
        m20169V();
        if (this.f38592U && !this.f38577F) {
            throw new C6728o("Loading finished before preparation is complete.");
        }
    }

    @Override // p228m7.AbstractC10516k
    /* renamed from: s */
    public void mo7935s() {
        this.f38576E = true;
        this.f17918z.post(this.f17916x);
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: t */
    public TrackGroupArray mo12463t() {
        m20183H();
        return this.f38579H.f17938a;
    }

    @Override // p153i8.AbstractC8287r
    /* renamed from: u */
    public void mo12462u(long j, boolean z) {
        m20183H();
        if (!m20176O()) {
            boolean[] zArr = this.f38579H.f17940c;
            int length = this.f38574C.length;
            for (int i = 0; i < length; i++) {
                this.f38574C[i].m20067p(j, z, zArr[i]);
            }
        }
    }
}
