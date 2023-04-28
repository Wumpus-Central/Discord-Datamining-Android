package p398w7;

import p079e7.C6722k;
import p117g7.C7458i0;
import p119g9.C7510a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.k */
/* loaded from: classes7.dex */
public final class C13779k implements AbstractC13782m {

    /* renamed from: b */
    private final String f30865b;

    /* renamed from: c */
    private String f30866c;

    /* renamed from: d */
    private AbstractC10500b0 f30867d;

    /* renamed from: f */
    private int f30869f;

    /* renamed from: g */
    private int f30870g;

    /* renamed from: h */
    private long f30871h;

    /* renamed from: i */
    private C6722k f30872i;

    /* renamed from: j */
    private int f30873j;

    /* renamed from: k */
    private long f30874k;

    /* renamed from: a */
    private final C7570y f30864a = new C7570y(new byte[18]);

    /* renamed from: e */
    private int f30868e = 0;

    public C13779k(String str) {
        this.f30865b = str;
    }

    /* renamed from: a */
    private boolean m2718a(C7570y yVar, byte[] bArr, int i) {
        int min = Math.min(yVar.m22015a(), i - this.f30869f);
        yVar.m22006j(bArr, this.f30869f, min);
        int i2 = this.f30869f + min;
        this.f30869f = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m2717g() {
        byte[] d = this.f30864a.m22012d();
        if (this.f30872i == null) {
            C6722k g = C7458i0.m22588g(d, this.f30866c, this.f30865b, null);
            this.f30872i = g;
            this.f30867d.mo12388d(g);
        }
        this.f30873j = C7458i0.m22594a(d);
        this.f30871h = (int) ((C7458i0.m22589f(d) * 1000000) / this.f30872i.f37970J);
    }

    /* renamed from: h */
    private boolean m2716h(C7570y yVar) {
        while (yVar.m22015a() > 0) {
            int i = this.f30870g << 8;
            this.f30870g = i;
            int D = i | yVar.m22029D();
            this.f30870g = D;
            if (C7458i0.m22591d(D)) {
                byte[] d = this.f30864a.m22012d();
                int i2 = this.f30870g;
                d[0] = (byte) ((i2 >> 24) & 255);
                d[1] = (byte) ((i2 >> 16) & 255);
                d[2] = (byte) ((i2 >> 8) & 255);
                d[3] = (byte) (i2 & 255);
                this.f30869f = 4;
                this.f30870g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        C7510a.m22364h(this.f30867d);
        while (yVar.m22015a() > 0) {
            int i = this.f30868e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(yVar.m22015a(), this.f30873j - this.f30869f);
                        this.f30867d.mo12386f(yVar, min);
                        int i2 = this.f30869f + min;
                        this.f30869f = i2;
                        int i3 = this.f30873j;
                        if (i2 == i3) {
                            this.f30867d.mo12382c(this.f30874k, 1, i3, 0, null);
                            this.f30874k += this.f30871h;
                            this.f30868e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m2718a(yVar, this.f30864a.m22012d(), 18)) {
                    m2717g();
                    this.f30864a.m22017P(0);
                    this.f30867d.mo12386f(this.f30864a, 18);
                    this.f30868e = 2;
                }
            } else if (m2716h(yVar)) {
                this.f30868e = 1;
            }
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f30868e = 0;
        this.f30869f = 0;
        this.f30870g = 0;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        this.f30866c = dVar.m2730b();
        this.f30867d = kVar.mo7937e(dVar.m2729c(), 1);
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        this.f30874k = j;
    }
}
