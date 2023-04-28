package p398w7;

import android.util.SparseArray;
import cc.AbstractC3884i0;
import java.util.ArrayList;
import java.util.List;
import p079e7.C6722k;
import p119g9.C7518d;
import p119g9.C7570y;
import p398w7.AbstractC13772i0;

/* renamed from: w7.j */
/* loaded from: classes7.dex */
public final class C13777j implements AbstractC13772i0.AbstractC13775c {

    /* renamed from: a */
    private final int f30862a;

    /* renamed from: b */
    private final List<C6722k> f30863b;

    public C13777j(int i) {
        this(i, AbstractC3884i0.m33399x());
    }

    /* renamed from: c */
    private C13759d0 m2725c(AbstractC13772i0.C13774b bVar) {
        return new C13759d0(m2723e(bVar));
    }

    /* renamed from: d */
    private C13780k0 m2724d(AbstractC13772i0.C13774b bVar) {
        return new C13780k0(m2723e(bVar));
    }

    /* renamed from: e */
    private List<C6722k> m2723e(AbstractC13772i0.C13774b bVar) {
        boolean z;
        String str;
        int i;
        List<byte[]> list;
        if (m2722f(32)) {
            return this.f30863b;
        }
        C7570y yVar = new C7570y(bVar.f30856d);
        List<C6722k> list2 = this.f30863b;
        while (yVar.m22015a() > 0) {
            int D = yVar.m22029D();
            int e = yVar.m22011e() + yVar.m22029D();
            if (D == 134) {
                list2 = new ArrayList<>();
                int D2 = yVar.m22029D() & 31;
                for (int i2 = 0; i2 < D2; i2++) {
                    String A = yVar.m22032A(3);
                    int D3 = yVar.m22029D();
                    boolean z2 = true;
                    if ((D3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte D4 = (byte) yVar.m22029D();
                    yVar.m22016Q(1);
                    if (z) {
                        if ((D4 & 64) == 0) {
                            z2 = false;
                        }
                        list = C7518d.m22349b(z2);
                    } else {
                        list = null;
                    }
                    list2.add(new C6722k.C6724b().m24488e0(str).m24502V(A).m24518F(i).m24504T(list).m24519E());
                }
            }
            yVar.m22017P(e);
        }
        return list2;
    }

    /* renamed from: f */
    private boolean m2722f(int i) {
        return (i & this.f30862a) != 0;
    }

    @Override // p398w7.AbstractC13772i0.AbstractC13775c
    /* renamed from: a */
    public SparseArray<AbstractC13772i0> mo2727a() {
        return new SparseArray<>();
    }

    @Override // p398w7.AbstractC13772i0.AbstractC13775c
    /* renamed from: b */
    public AbstractC13772i0 mo2726b(int i, AbstractC13772i0.C13774b bVar) {
        if (i == 2) {
            return new C13799w(new C13783n(m2724d(bVar)));
        }
        if (i == 3 || i == 4) {
            return new C13799w(new C13796t(bVar.f30854b));
        }
        if (i == 21) {
            return new C13799w(new C13794r());
        }
        if (i != 27) {
            if (i == 36) {
                return new C13799w(new C13792q(m2725c(bVar)));
            }
            if (i == 89) {
                return new C13799w(new C13781l(bVar.f30855c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C13799w(new C13763f(bVar.f30854b));
                }
                if (i == 257) {
                    return new C13757c0(new C13798v("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (m2722f(2)) {
                                            return null;
                                        }
                                        return new C13799w(new C13771i(false, bVar.f30854b));
                                    case 16:
                                        return new C13799w(new C13785o(m2724d(bVar)));
                                    case 17:
                                        if (m2722f(2)) {
                                            return null;
                                        }
                                        return new C13799w(new C13795s(bVar.f30854b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (m2722f(16)) {
                            return null;
                        } else {
                            return new C13757c0(new C13798v("application/x-scte35"));
                        }
                    } else if (!m2722f(64)) {
                        return null;
                    }
                }
                return new C13799w(new C13756c(bVar.f30854b));
            }
            return new C13799w(new C13779k(bVar.f30854b));
        } else if (m2722f(4)) {
            return null;
        } else {
            return new C13799w(new C13788p(m2725c(bVar), m2722f(1), m2722f(8)));
        }
    }

    public C13777j(int i, List<C6722k> list) {
        this.f30862a = i;
        this.f30863b = list;
    }
}
