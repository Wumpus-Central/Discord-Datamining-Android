package p280p7;

import java.util.Collections;
import p079e7.C6722k;
import p117g7.C7423a;
import p119g9.C7570y;
import p228m7.AbstractC10500b0;
import p280p7.AbstractC11583e;

/* renamed from: p7.a */
/* loaded from: classes7.dex */
final class C11579a extends AbstractC11583e {

    /* renamed from: e */
    private static final int[] f25821e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f25822b;

    /* renamed from: c */
    private boolean f25823c;

    /* renamed from: d */
    private int f25824d;

    public C11579a(AbstractC10500b0 b0Var) {
        super(b0Var);
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: b */
    protected boolean mo9297b(C7570y yVar) {
        String str;
        if (!this.f25822b) {
            int D = yVar.m22029D();
            int i = (D >> 4) & 15;
            this.f25824d = i;
            if (i == 2) {
                this.f25845a.mo12388d(new C6722k.C6724b().m24488e0("audio/mpeg").m24516H(1).m24486f0(f25821e[(D >> 2) & 3]).m24519E());
                this.f25823c = true;
            } else if (i == 7 || i == 8) {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f25845a.mo12388d(new C6722k.C6724b().m24488e0(str).m24516H(1).m24486f0(8000).m24519E());
                this.f25823c = true;
            } else if (i != 10) {
                throw new AbstractC11583e.C11584a("Audio format not supported: " + this.f25824d);
            }
            this.f25822b = true;
        } else {
            yVar.m22016Q(1);
        }
        return true;
    }

    @Override // p280p7.AbstractC11583e
    /* renamed from: c */
    protected boolean mo9296c(C7570y yVar, long j) {
        if (this.f25824d == 2) {
            int a = yVar.m22015a();
            this.f25845a.mo12386f(yVar, a);
            this.f25845a.mo12382c(j, 1, a, 0, null);
            return true;
        }
        int D = yVar.m22029D();
        if (D == 0 && !this.f25823c) {
            int a2 = yVar.m22015a();
            byte[] bArr = new byte[a2];
            yVar.m22006j(bArr, 0, a2);
            C7423a.C7424b g = C7423a.m22700g(bArr);
            this.f25845a.mo12388d(new C6722k.C6724b().m24488e0("audio/mp4a-latm").m24515I(g.f15995c).m24516H(g.f15994b).m24486f0(g.f15993a).m24504T(Collections.singletonList(bArr)).m24519E());
            this.f25823c = true;
            return false;
        } else if (this.f25824d == 10 && D != 1) {
            return false;
        } else {
            int a3 = yVar.m22015a();
            this.f25845a.mo12386f(yVar, a3);
            this.f25845a.mo12382c(j, 1, a3, 0, null);
            return true;
        }
    }
}
