package p398w7;

import p119g9.C7544l0;
import p119g9.C7557q0;
import p119g9.C7570y;
import p228m7.AbstractC10516k;
import p398w7.AbstractC13772i0;

/* renamed from: w7.c0 */
/* loaded from: classes7.dex */
public final class C13757c0 implements AbstractC13772i0 {

    /* renamed from: a */
    private final AbstractC13755b0 f30750a;

    /* renamed from: b */
    private final C7570y f30751b = new C7570y(32);

    /* renamed from: c */
    private int f30752c;

    /* renamed from: d */
    private int f30753d;

    /* renamed from: e */
    private boolean f30754e;

    /* renamed from: f */
    private boolean f30755f;

    public C13757c0(AbstractC13755b0 b0Var) {
        this.f30750a = b0Var;
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: a */
    public void mo2644a(C7544l0 l0Var, AbstractC10516k kVar, AbstractC13772i0.C13776d dVar) {
        this.f30750a.mo2647a(l0Var, kVar, dVar);
        this.f30755f = true;
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: b */
    public void mo2643b(C7570y yVar, int i) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = yVar.m22011e() + yVar.m22029D();
        } else {
            i2 = -1;
        }
        if (this.f30755f) {
            if (z) {
                this.f30755f = false;
                yVar.m22017P(i2);
                this.f30753d = 0;
            } else {
                return;
            }
        }
        while (yVar.m22015a() > 0) {
            int i3 = this.f30753d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int D = yVar.m22029D();
                    yVar.m22017P(yVar.m22011e() - 1);
                    if (D == 255) {
                        this.f30755f = true;
                        return;
                    }
                }
                int min = Math.min(yVar.m22015a(), 3 - this.f30753d);
                yVar.m22006j(this.f30751b.m22012d(), this.f30753d, min);
                int i4 = this.f30753d + min;
                this.f30753d = i4;
                if (i4 == 3) {
                    this.f30751b.m22017P(0);
                    this.f30751b.m22018O(3);
                    this.f30751b.m22016Q(1);
                    int D2 = this.f30751b.m22029D();
                    int D3 = this.f30751b.m22029D();
                    if ((D2 & 128) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.f30754e = z2;
                    this.f30752c = (((D2 & 15) << 8) | D3) + 3;
                    int b = this.f30751b.m22014b();
                    int i5 = this.f30752c;
                    if (b < i5) {
                        this.f30751b.m22013c(Math.min(4098, Math.max(i5, this.f30751b.m22014b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(yVar.m22015a(), this.f30752c - this.f30753d);
                yVar.m22006j(this.f30751b.m22012d(), this.f30753d, min2);
                int i6 = this.f30753d + min2;
                this.f30753d = i6;
                int i7 = this.f30752c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.f30754e) {
                        this.f30751b.m22018O(i7);
                    } else if (C7557q0.m22123u(this.f30751b.m22012d(), 0, this.f30752c, -1) != 0) {
                        this.f30755f = true;
                        return;
                    } else {
                        this.f30751b.m22018O(this.f30752c - 4);
                    }
                    this.f30751b.m22017P(0);
                    this.f30750a.mo2646b(this.f30751b);
                    this.f30753d = 0;
                }
            }
        }
    }

    @Override // p398w7.AbstractC13772i0
    /* renamed from: c */
    public void mo2642c() {
        this.f30755f = true;
    }
}
