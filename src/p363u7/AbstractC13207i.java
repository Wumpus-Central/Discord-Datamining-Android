package p363u7;

import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10533x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u7.i */
/* loaded from: classes7.dex */
public abstract class AbstractC13207i {

    /* renamed from: b */
    private AbstractC10500b0 f29636b;

    /* renamed from: c */
    private AbstractC10516k f29637c;

    /* renamed from: d */
    private AbstractC13205g f29638d;

    /* renamed from: e */
    private long f29639e;

    /* renamed from: f */
    private long f29640f;

    /* renamed from: g */
    private long f29641g;

    /* renamed from: h */
    private int f29642h;

    /* renamed from: i */
    private int f29643i;

    /* renamed from: k */
    private long f29645k;

    /* renamed from: l */
    private boolean f29646l;

    /* renamed from: m */
    private boolean f29647m;

    /* renamed from: a */
    private final C13203e f29635a = new C13203e();

    /* renamed from: j */
    private C13209b f29644j = new C13209b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u7.i$b */
    /* loaded from: classes7.dex */
    public static class C13209b {

        /* renamed from: a */
        C6722k f29648a;

        /* renamed from: b */
        AbstractC13205g f29649b;

        C13209b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u7.i$c */
    /* loaded from: classes7.dex */
    public static final class C13210c implements AbstractC13205g {
        private C13210c() {
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: a */
        public long mo4321a(AbstractC10515j jVar) {
            return -1L;
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: b */
        public AbstractC10534y mo4320b() {
            return new AbstractC10534y.C10536b(-9223372036854775807L);
        }

        @Override // p363u7.AbstractC13205g
        /* renamed from: c */
        public void mo4319c(long j) {
        }
    }

    /* renamed from: a */
    private void m4330a() {
        C7510a.m22364h(this.f29636b);
        C7557q0.m22145j(this.f29637c);
    }

    /* renamed from: i */
    private boolean m4325i(AbstractC10515j jVar) {
        while (this.f29635a.m4340d(jVar)) {
            this.f29645k = jVar.getPosition() - this.f29640f;
            if (!mo4316h(this.f29635a.m4341c(), this.f29640f, this.f29644j)) {
                return true;
            }
            this.f29640f = jVar.getPosition();
        }
        this.f29642h = 3;
        return false;
    }

    /* renamed from: j */
    private int m4324j(AbstractC10515j jVar) {
        boolean z;
        if (!m4325i(jVar)) {
            return -1;
        }
        C6722k kVar = this.f29644j.f29648a;
        this.f29643i = kVar.f37970J;
        if (!this.f29647m) {
            this.f29636b.mo12388d(kVar);
            this.f29647m = true;
        }
        AbstractC13205g gVar = this.f29644j.f29649b;
        if (gVar != null) {
            this.f29638d = gVar;
        } else if (jVar.getLength() == -1) {
            this.f29638d = new C13210c();
        } else {
            C13204f b = this.f29635a.m4342b();
            if ((b.f29623b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f29638d = new C13197a(this, this.f29640f, jVar.getLength(), b.f29629h + b.f29630i, b.f29624c, z);
        }
        this.f29642h = 2;
        this.f29635a.m4338f();
        return 0;
    }

    /* renamed from: k */
    private int m4323k(AbstractC10515j jVar, C10533x xVar) {
        long a = this.f29638d.mo4321a(jVar);
        if (a >= 0) {
            xVar.f23290a = a;
            return 1;
        }
        if (a < -1) {
            mo4318e(-(a + 2));
        }
        if (!this.f29646l) {
            this.f29637c.mo7936j((AbstractC10534y) C7510a.m22364h(this.f29638d.mo4320b()));
            this.f29646l = true;
        }
        if (this.f29645k > 0 || this.f29635a.m4340d(jVar)) {
            this.f29645k = 0L;
            C7570y c = this.f29635a.m4341c();
            long f = mo4317f(c);
            if (f >= 0) {
                long j = this.f29641g;
                if (j + f >= this.f29639e) {
                    long b = m4329b(j);
                    this.f29636b.mo12386f(c, c.m22010f());
                    this.f29636b.mo12382c(b, 1, c.m22010f(), 0, null);
                    this.f29639e = -1L;
                }
            }
            this.f29641g += f;
            return 0;
        }
        this.f29642h = 3;
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m4329b(long j) {
        return (j * 1000000) / this.f29643i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public long m4328c(long j) {
        return (this.f29643i * j) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m4327d(AbstractC10516k kVar, AbstractC10500b0 b0Var) {
        this.f29637c = kVar;
        this.f29636b = b0Var;
        mo4315l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo4318e(long j) {
        this.f29641g = j;
    }

    /* renamed from: f */
    protected abstract long mo4317f(C7570y yVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final int m4326g(AbstractC10515j jVar, C10533x xVar) {
        m4330a();
        int i = this.f29642h;
        if (i == 0) {
            return m4324j(jVar);
        }
        if (i == 1) {
            jVar.mo12932k((int) this.f29640f);
            this.f29642h = 2;
            return 0;
        } else if (i == 2) {
            C7557q0.m22145j(this.f29638d);
            return m4323k(jVar, xVar);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: h */
    protected abstract boolean mo4316h(C7570y yVar, long j, C13209b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void mo4315l(boolean z) {
        if (z) {
            this.f29644j = new C13209b();
            this.f29640f = 0L;
            this.f29642h = 0;
        } else {
            this.f29642h = 1;
        }
        this.f29639e = -1L;
        this.f29641g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final void m4322m(long j, long j2) {
        this.f29635a.m4339e();
        if (j == 0) {
            mo4315l(!this.f29646l);
        } else if (this.f29642h != 0) {
            this.f29639e = m4328c(j2);
            ((AbstractC13205g) C7557q0.m22145j(this.f29638d)).mo4319c(this.f29639e);
            this.f29642h = 2;
        }
    }
}
