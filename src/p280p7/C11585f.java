package p280p7;

import p079e7.C6722k;
import p119g9.C7566w;
import p119g9.C7570y;
import p133h9.C7939a;
import p228m7.AbstractC10500b0;
import p280p7.AbstractC11583e;

/* renamed from: p7.f */
/* loaded from: classes7.dex */
final class C11585f extends AbstractC11583e {

    /* renamed from: b */
    private final C7570y f25846b = new C7570y(C7566w.f16395a);

    /* renamed from: c */
    private final C7570y f25847c = new C7570y(4);

    /* renamed from: d */
    private int f25848d;

    /* renamed from: e */
    private boolean f25849e;

    /* renamed from: f */
    private boolean f25850f;

    /* renamed from: g */
    private int f25851g;

    public C11585f(AbstractC10500b0 b0Var) {
        super(b0Var);
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: b */
    protected boolean mo9297b(C7570y yVar) {
        int D = yVar.m22029D();
        int i = (D >> 4) & 15;
        int i2 = D & 15;
        if (i2 == 7) {
            this.f25851g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new AbstractC11583e.C11584a("Video format not supported: " + i2);
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: c */
    protected boolean mo9296c(C7570y yVar, long j) {
        int i;
        int D = yVar.m22029D();
        long o = j + (yVar.m22001o() * 1000);
        if (D == 0 && !this.f25849e) {
            C7570y yVar2 = new C7570y(new byte[yVar.m22015a()]);
            yVar.m22006j(yVar2.m22012d(), 0, yVar.m22015a());
            C7939a b = C7939a.m21116b(yVar2);
            this.f25848d = b.f17038b;
            this.f25845a.mo12388d(new C6722k.C6724b().m24488e0("video/avc").m24515I(b.f17042f).m24478j0(b.f17039c).m24507Q(b.f17040d).m24496a0(b.f17041e).m24504T(b.f17037a).m24519E());
            this.f25849e = true;
            return false;
        } else if (D != 1 || !this.f25849e) {
            return false;
        } else {
            if (this.f25851g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f25850f && i == 0) {
                return false;
            }
            byte[] d = this.f25847c.m22012d();
            d[0] = 0;
            d[1] = 0;
            d[2] = 0;
            int i2 = 4 - this.f25848d;
            int i3 = 0;
            while (yVar.m22015a() > 0) {
                yVar.m22006j(this.f25847c.m22012d(), i2, this.f25848d);
                this.f25847c.m22017P(0);
                int H = this.f25847c.m22025H();
                this.f25846b.m22017P(0);
                this.f25845a.mo12386f(this.f25846b, 4);
                this.f25845a.mo12386f(yVar, H);
                i3 = i3 + 4 + H;
            }
            this.f25845a.mo12382c(o, i, i3, 0, null);
            this.f25850f = true;
            return true;
        }
    }
}
