package p398w7;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Map;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7569x;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10521o;
import p228m7.AbstractC10534y;
import p228m7.C10520n;
import p228m7.C10533x;
import p398w7.AbstractC13772i0;

/* renamed from: w7.a0 */
/* loaded from: classes7.dex */
public final class C13752a0 implements AbstractC10514i {

    /* renamed from: l */
    public static final AbstractC10521o f30714l = new AbstractC10521o() { // from class: w7.z
        @Override // p228m7.AbstractC10521o
        /* renamed from: a */
        public /* synthetic */ AbstractC10514i[] mo2230a(Uri uri, Map map) {
            return C10520n.m12973a(this, uri, map);
        }

        @Override // p228m7.AbstractC10521o
        /* renamed from: b */
        public final AbstractC10514i[] mo2229b() {
            AbstractC10514i[] f;
            f = C13752a0.m2807f();
            return f;
        }
    };

    /* renamed from: a */
    private final C7544l0 f30715a;

    /* renamed from: b */
    private final SparseArray<C13753a> f30716b;

    /* renamed from: c */
    private final C7570y f30717c;

    /* renamed from: d */
    private final C13803y f30718d;

    /* renamed from: e */
    private boolean f30719e;

    /* renamed from: f */
    private boolean f30720f;

    /* renamed from: g */
    private boolean f30721g;

    /* renamed from: h */
    private long f30722h;

    /* renamed from: i */
    private C13800x f30723i;

    /* renamed from: j */
    private AbstractC10516k f30724j;

    /* renamed from: k */
    private boolean f30725k;

    /* renamed from: w7.a0$a */
    /* loaded from: classes7.dex */
    private static final class C13753a {

        /* renamed from: a */
        private final AbstractC13782m f30726a;

        /* renamed from: b */
        private final C7544l0 f30727b;

        /* renamed from: c */
        private final C7569x f30728c = new C7569x(new byte[64]);

        /* renamed from: d */
        private boolean f30729d;

        /* renamed from: e */
        private boolean f30730e;

        /* renamed from: f */
        private boolean f30731f;

        /* renamed from: g */
        private int f30732g;

        /* renamed from: h */
        private long f30733h;

        public C13753a(AbstractC13782m mVar, C7544l0 l0Var) {
            this.f30726a = mVar;
            this.f30727b = l0Var;
        }

        /* renamed from: b */
        private void m2804b() {
            this.f30728c.m22034r(8);
            this.f30729d = this.f30728c.m22045g();
            this.f30730e = this.f30728c.m22045g();
            this.f30728c.m22034r(6);
            this.f30732g = this.f30728c.m22044h(8);
        }

        /* renamed from: c */
        private void m2803c() {
            this.f30733h = 0L;
            if (this.f30729d) {
                this.f30728c.m22034r(4);
                this.f30728c.m22034r(1);
                this.f30728c.m22034r(1);
                long h = (this.f30728c.m22044h(3) << 30) | (this.f30728c.m22044h(15) << 15) | this.f30728c.m22044h(15);
                this.f30728c.m22034r(1);
                if (!this.f30731f && this.f30730e) {
                    this.f30728c.m22034r(4);
                    this.f30728c.m22034r(1);
                    this.f30728c.m22034r(1);
                    this.f30728c.m22034r(1);
                    this.f30727b.m22264b((this.f30728c.m22044h(3) << 30) | (this.f30728c.m22044h(15) << 15) | this.f30728c.m22044h(15));
                    this.f30731f = true;
                }
                this.f30733h = this.f30727b.m22264b(h);
            }
        }

        /* renamed from: a */
        public void m2805a(C7570y yVar) {
            yVar.m22006j(this.f30728c.f16415a, 0, 3);
            this.f30728c.m22036p(0);
            m2804b();
            yVar.m22006j(this.f30728c.f16415a, 0, this.f30732g);
            this.f30728c.m22036p(0);
            m2803c();
            this.f30726a.mo2655f(this.f30733h, 4);
            this.f30726a.mo2659b(yVar);
            this.f30726a.mo2656e();
        }

        /* renamed from: d */
        public void m2802d() {
            this.f30731f = false;
            this.f30726a.mo2658c();
        }
    }

    public C13752a0() {
        this(new C7544l0(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ AbstractC10514i[] m2807f() {
        return new AbstractC10514i[]{new C13752a0()};
    }

    /* renamed from: g */
    private void m2806g(long j) {
        if (!this.f30725k) {
            this.f30725k = true;
            if (this.f30718d.m2629c() != -9223372036854775807L) {
                C13800x xVar = new C13800x(this.f30718d.m2628d(), this.f30718d.m2629c(), j);
                this.f30723i = xVar;
                this.f30724j.mo7936j(xVar.m13045b());
                return;
            }
            this.f30724j.mo7936j(new AbstractC10534y.C10536b(this.f30718d.m2629c()));
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        boolean z;
        if (this.f30715a.m22261e() == -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(this.f30715a.m22263c() == 0 || this.f30715a.m22263c() == j2)) {
            this.f30715a.m22259g(j2);
        }
        C13800x xVar = this.f30723i;
        if (xVar != null) {
            xVar.m13039h(j2);
        }
        for (int i = 0; i < this.f30716b.size(); i++) {
            this.f30716b.valueAt(i).m2802d();
        }
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f30724j = kVar;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        byte[] bArr = new byte[14];
        jVar.mo12930n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jVar.mo12934i(bArr[13] & 7);
        jVar.mo12930n(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        boolean z;
        long j;
        long j2;
        AbstractC13782m mVar;
        C7510a.m22364h(this.f30724j);
        long length = jVar.getLength();
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f30718d.m2627e()) {
            return this.f30718d.m2625g(jVar, xVar);
        }
        m2806g(length);
        C13800x xVar2 = this.f30723i;
        if (xVar2 != null && xVar2.m13043d()) {
            return this.f30723i.m13044c(jVar, xVar);
        }
        jVar.mo12936f();
        if (i != 0) {
            j = length - jVar.mo7939h();
        } else {
            j = -1;
        }
        if ((j != -1 && j < 4) || !jVar.mo12937d(this.f30717c.m22012d(), 0, 4, true)) {
            return -1;
        }
        this.f30717c.m22017P(0);
        int n = this.f30717c.m22002n();
        if (n == 441) {
            return -1;
        }
        if (n == 442) {
            jVar.mo12930n(this.f30717c.m22012d(), 0, 10);
            this.f30717c.m22017P(9);
            jVar.mo12932k((this.f30717c.m22029D() & 7) + 14);
            return 0;
        } else if (n == 443) {
            jVar.mo12930n(this.f30717c.m22012d(), 0, 2);
            this.f30717c.m22017P(0);
            jVar.mo12932k(this.f30717c.m22023J() + 6);
            return 0;
        } else if (((n & (-256)) >> 8) != 1) {
            jVar.mo12932k(1);
            return 0;
        } else {
            int i2 = n & 255;
            C13753a aVar = this.f30716b.get(i2);
            if (!this.f30719e) {
                if (aVar == null) {
                    if (i2 == 189) {
                        mVar = new C13756c();
                        this.f30720f = true;
                        this.f30722h = jVar.getPosition();
                    } else if ((i2 & 224) == 192) {
                        mVar = new C13796t();
                        this.f30720f = true;
                        this.f30722h = jVar.getPosition();
                    } else if ((i2 & 240) == 224) {
                        mVar = new C13783n();
                        this.f30721g = true;
                        this.f30722h = jVar.getPosition();
                    } else {
                        mVar = null;
                    }
                    if (mVar != null) {
                        mVar.mo2657d(this.f30724j, new AbstractC13772i0.C13776d(i2, Spliterator.NONNULL));
                        aVar = new C13753a(mVar, this.f30715a);
                        this.f30716b.put(i2, aVar);
                    }
                }
                if (!this.f30720f || !this.f30721g) {
                    j2 = 1048576;
                } else {
                    j2 = this.f30722h + 8192;
                }
                if (jVar.getPosition() > j2) {
                    this.f30719e = true;
                    this.f30724j.mo7935s();
                }
            }
            jVar.mo12930n(this.f30717c.m22012d(), 0, 2);
            this.f30717c.m22017P(0);
            int J = this.f30717c.m22023J() + 6;
            if (aVar == null) {
                jVar.mo12932k(J);
            } else {
                this.f30717c.m22021L(J);
                jVar.readFully(this.f30717c.m22012d(), 0, J);
                this.f30717c.m22017P(6);
                aVar.m2805a(this.f30717c);
                C7570y yVar = this.f30717c;
                yVar.m22018O(yVar.m22014b());
            }
            return 0;
        }
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }

    public C13752a0(C7544l0 l0Var) {
        this.f30715a = l0Var;
        this.f30717c = new C7570y(4096);
        this.f30716b = new SparseArray<>();
        this.f30718d = new C13803y();
    }
}
