package p259o7;

import android.net.Uri;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10522p;
import p228m7.C10524q;
import p228m7.C10526r;
import p228m7.C10527s;
import p228m7.C10533x;
import p459z7.C14576a;

/* renamed from: o7.d */
/* loaded from: classes7.dex */
public final class C11210d implements AbstractC10514i {

    /* renamed from: o */
    public static final AbstractC10521o f24995o = new AbstractC10521o() { // from class: o7.c
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] j;
            j = C11210d.m10486j();
            return j;
        }
    };

    /* renamed from: a */
    private final byte[] f24996a;

    /* renamed from: b */
    private final C7570y f24997b;

    /* renamed from: c */
    private final boolean f24998c;

    /* renamed from: d */
    private final C10522p.C10523a f24999d;

    /* renamed from: e */
    private AbstractC10516k f25000e;

    /* renamed from: f */
    private AbstractC10500b0 f25001f;

    /* renamed from: g */
    private int f25002g;

    /* renamed from: h */
    private C14576a f25003h;

    /* renamed from: i */
    private C10527s f25004i;

    /* renamed from: j */
    private int f25005j;

    /* renamed from: k */
    private int f25006k;

    /* renamed from: l */
    private C11207b f25007l;

    /* renamed from: m */
    private int f25008m;

    /* renamed from: n */
    private long f25009n;

    public C11210d() {
        this(0);
    }

    /* renamed from: f */
    private long m10490f(C7570y yVar, boolean z) {
        boolean z2;
        C7510a.m22367e(this.f25004i);
        int e = yVar.m22011e();
        while (e <= yVar.m22010f() - 16) {
            yVar.m22017P(e);
            if (C10522p.m12968d(yVar, this.f25004i, this.f25006k, this.f24999d)) {
                yVar.m22017P(e);
                return this.f24999d.f23263a;
            }
            e++;
        }
        if (z) {
            while (e <= yVar.m22010f() - this.f25005j) {
                yVar.m22017P(e);
                boolean z3 = false;
                try {
                    z2 = C10522p.m12968d(yVar, this.f25004i, this.f25006k, this.f24999d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (yVar.m22011e() <= yVar.m22010f()) {
                    z3 = z2;
                }
                if (z3) {
                    yVar.m22017P(e);
                    return this.f24999d.f23263a;
                }
                e++;
            }
            yVar.m22017P(yVar.m22010f());
            return -1L;
        }
        yVar.m22017P(e);
        return -1L;
    }

    /* renamed from: g */
    private void m10489g(AbstractC10515j jVar) {
        this.f25006k = C10524q.m12960b(jVar);
        ((AbstractC10516k) C7557q0.m22145j(this.f25000e)).mo7936j(m10488h(jVar.getPosition(), jVar.getLength()));
        this.f25002g = 5;
    }

    /* renamed from: h */
    private AbstractC10534y m10488h(long j, long j2) {
        C7510a.m22367e(this.f25004i);
        C10527s sVar = this.f25004i;
        if (sVar.f23277k != null) {
            return new C10526r(sVar, j);
        }
        if (j2 == -1 || sVar.f23276j <= 0) {
            return new AbstractC10534y.C10536b(sVar.m12943g());
        }
        C11207b bVar = new C11207b(sVar, this.f25006k, j, j2);
        this.f25007l = bVar;
        return bVar.m13045b();
    }

    /* renamed from: i */
    private void m10487i(AbstractC10515j jVar) {
        byte[] bArr = this.f24996a;
        jVar.mo12930n(bArr, 0, bArr.length);
        jVar.mo12936f();
        this.f25002g = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ AbstractC10514i[] m10486j() {
        return new AbstractC10514i[]{new C11210d()};
    }

    /* renamed from: k */
    private void m10485k() {
        ((AbstractC10500b0) C7557q0.m22145j(this.f25001f)).mo12382c((this.f25009n * 1000000) / ((C10527s) C7557q0.m22145j(this.f25004i)).f23271e, 1, this.f25008m, 0, null);
    }

    /* renamed from: l */
    private int m10484l(AbstractC10515j jVar, C10533x xVar) {
        boolean z;
        C7510a.m22367e(this.f25001f);
        C7510a.m22367e(this.f25004i);
        C11207b bVar = this.f25007l;
        if (bVar != null && bVar.m13043d()) {
            return this.f25007l.m13044c(jVar, xVar);
        }
        if (this.f25009n == -1) {
            this.f25009n = C10522p.m12963i(jVar, this.f25004i);
            return 0;
        }
        int f = this.f24997b.m22010f();
        if (f < 32768) {
            int read = jVar.read(this.f24997b.m22012d(), f, 32768 - f);
            if (read == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f24997b.m22018O(f + read);
            } else if (this.f24997b.m22015a() == 0) {
                m10485k();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f24997b.m22011e();
        int i = this.f25008m;
        int i2 = this.f25005j;
        if (i < i2) {
            C7570y yVar = this.f24997b;
            yVar.m22016Q(Math.min(i2 - i, yVar.m22015a()));
        }
        long f2 = m10490f(this.f24997b, z);
        int e2 = this.f24997b.m22011e() - e;
        this.f24997b.m22017P(e);
        this.f25001f.mo12386f(this.f24997b, e2);
        this.f25008m += e2;
        if (f2 != -1) {
            m10485k();
            this.f25008m = 0;
            this.f25009n = f2;
        }
        if (this.f24997b.m22015a() < 16) {
            int a = this.f24997b.m22015a();
            System.arraycopy(this.f24997b.m22012d(), this.f24997b.m22011e(), this.f24997b.m22012d(), 0, a);
            this.f24997b.m22017P(0);
            this.f24997b.m22018O(a);
        }
        return 0;
    }

    /* renamed from: m */
    private void m10483m(AbstractC10515j jVar) {
        this.f25003h = C10524q.m12958d(jVar, !this.f24998c);
        this.f25002g = 1;
    }

    /* renamed from: n */
    private void m10482n(AbstractC10515j jVar) {
        C10524q.C10525a aVar = new C10524q.C10525a(this.f25004i);
        boolean z = false;
        while (!z) {
            z = C10524q.m12957e(jVar, aVar);
            this.f25004i = (C10527s) C7557q0.m22145j(aVar.f23264a);
        }
        C7510a.m22367e(this.f25004i);
        this.f25005j = Math.max(this.f25004i.f23269c, 6);
        ((AbstractC10500b0) C7557q0.m22145j(this.f25001f)).mo12388d(this.f25004i.m12942h(this.f24996a, this.f25003h));
        this.f25002g = 4;
    }

    /* renamed from: o */
    private void m10481o(AbstractC10515j jVar) {
        C10524q.m12952j(jVar);
        this.f25002g = 3;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f25002g = 0;
        } else {
            C11207b bVar = this.f25007l;
            if (bVar != null) {
                bVar.m13039h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f25009n = j3;
        this.f25008m = 0;
        this.f24997b.m22021L(0);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f25000e = kVar;
        this.f25001f = kVar.mo7937e(0, 1);
        kVar.mo7935s();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        C10524q.m12959c(jVar, false);
        return C10524q.m12961a(jVar);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        int i = this.f25002g;
        if (i == 0) {
            m10483m(jVar);
            return 0;
        } else if (i == 1) {
            m10487i(jVar);
            return 0;
        } else if (i == 2) {
            m10481o(jVar);
            return 0;
        } else if (i == 3) {
            m10482n(jVar);
            return 0;
        } else if (i == 4) {
            m10489g(jVar);
            return 0;
        } else if (i == 5) {
            return m10484l(jVar, xVar);
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C11210d(int i) {
        this.f24996a = new byte[42];
        this.f24997b = new C7570y(new byte[32768], 0);
        this.f24998c = (i & 1) == 0 ? false : true;
        this.f24999d = new C10522p.C10523a();
        this.f25002g = 0;
    }
}
