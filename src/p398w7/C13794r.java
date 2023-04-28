package p398w7;

import p079e7.C6722k;
import p119g9.C7510a;
import p119g9.C7558r;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.r */
/* loaded from: classes7.dex */
public final class C13794r implements AbstractC13782m {

    /* renamed from: a */
    private final C7570y f31007a = new C7570y(10);

    /* renamed from: b */
    private AbstractC10500b0 f31008b;

    /* renamed from: c */
    private boolean f31009c;

    /* renamed from: d */
    private long f31010d;

    /* renamed from: e */
    private int f31011e;

    /* renamed from: f */
    private int f31012f;

    @Override // p398w7.AbstractC13782m
    /* renamed from: b */
    public void mo2659b(C7570y yVar) {
        C7510a.m22364h(this.f31008b);
        if (this.f31009c) {
            int a = yVar.m22015a();
            int i = this.f31012f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(yVar.m22012d(), yVar.m22011e(), this.f31007a.m22012d(), this.f31012f, min);
                if (this.f31012f + min == 10) {
                    this.f31007a.m22017P(0);
                    if (73 == this.f31007a.m22029D() && 68 == this.f31007a.m22029D() && 51 == this.f31007a.m22029D()) {
                        this.f31007a.m22016Q(3);
                        this.f31011e = this.f31007a.m22030C() + 10;
                    } else {
                        C7558r.m22104h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f31009c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f31011e - this.f31012f);
            this.f31008b.mo12386f(yVar, min2);
            this.f31012f += min2;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: c */
    public void mo2658c() {
        this.f31009c = false;
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: d */
    public void mo2657d(AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        dVar.m2731a();
        AbstractC10500b0 e = kVar.mo7937e(dVar.m2729c(), 5);
        this.f31008b = e;
        e.mo12388d(new C6722k.C6724b().m24505S(dVar.m2730b()).m24488e0("application/id3").m24519E());
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: e */
    public void mo2656e() {
        int i;
        C7510a.m22364h(this.f31008b);
        if (this.f31009c && (i = this.f31011e) != 0 && this.f31012f == i) {
            this.f31008b.mo12382c(this.f31010d, 1, i, 0, null);
            this.f31009c = false;
        }
    }

    @Override // p398w7.AbstractC13782m
    /* renamed from: f */
    public void mo2655f(long j, int i) {
        if ((i & 4) != 0) {
            this.f31009c = true;
            this.f31010d = j;
            this.f31011e = 0;
            this.f31012f = 0;
        }
    }
}
