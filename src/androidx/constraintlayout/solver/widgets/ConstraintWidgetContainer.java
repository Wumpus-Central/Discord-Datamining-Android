package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import p163j$.util.Spliterator;
import p391w0.C13714d;
import p411x0.C13921c;
import p432y0.C14201b;
import p432y0.C14205e;

/* loaded from: classes.dex */
public class ConstraintWidgetContainer extends C13921c {

    /* renamed from: B0 */
    public Metrics f35365B0;

    /* renamed from: D0 */
    int f35367D0;

    /* renamed from: E0 */
    int f35368E0;

    /* renamed from: F0 */
    int f35369F0;

    /* renamed from: G0 */
    int f35370G0;

    /* renamed from: x0 */
    C14201b f2573x0 = new C14201b(this);

    /* renamed from: y0 */
    public C14205e f2574y0 = new C14205e(this);

    /* renamed from: z0 */
    protected C14201b.AbstractC0461b f2575z0 = null;

    /* renamed from: A0 */
    private boolean f35364A0 = false;

    /* renamed from: C0 */
    protected C13714d f35366C0 = new C13714d();

    /* renamed from: H0 */
    int f35371H0 = 0;

    /* renamed from: I0 */
    int f35372I0 = 0;

    /* renamed from: J0 */
    C2124c[] f35373J0 = new C2124c[4];

    /* renamed from: K0 */
    C2124c[] f35374K0 = new C2124c[4];

    /* renamed from: L0 */
    public boolean f35375L0 = false;

    /* renamed from: M0 */
    public boolean f35376M0 = false;

    /* renamed from: N0 */
    public boolean f35377N0 = false;

    /* renamed from: O0 */
    public int f35378O0 = 0;

    /* renamed from: P0 */
    public int f35379P0 = 0;

    /* renamed from: Q0 */
    private int f35380Q0 = 263;

    /* renamed from: R0 */
    public boolean f35381R0 = false;

    /* renamed from: S0 */
    private boolean f35382S0 = false;

    /* renamed from: T0 */
    private boolean f35383T0 = false;

    /* renamed from: U0 */
    int f35384U0 = 0;

    /* renamed from: M0 */
    private void m38872M0(ConstraintWidget constraintWidget) {
        int i = this.f35371H0 + 1;
        C2124c[] cVarArr = this.f35374K0;
        if (i >= cVarArr.length) {
            this.f35374K0 = (C2124c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f35374K0[this.f35371H0] = new C2124c(constraintWidget, 0, m38861X0());
        this.f35371H0++;
    }

    /* renamed from: N0 */
    private void m38871N0(ConstraintWidget constraintWidget) {
        int i = this.f35372I0 + 1;
        C2124c[] cVarArr = this.f35373J0;
        if (i >= cVarArr.length) {
            this.f35373J0 = (C2124c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f35373J0[this.f35372I0] = new C2124c(constraintWidget, 1, m38861X0());
        this.f35372I0++;
    }

    /* renamed from: b1 */
    private void m38857b1() {
        this.f35371H0 = 0;
        this.f35372I0 = 0;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: F0 */
    public void mo38875F0(boolean z, boolean z2) {
        super.mo38875F0(z, z2);
        int size = this.f31384w0.size();
        for (int i = 0; i < size; i++) {
            this.f31384w0.get(i).mo38875F0(z, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // p411x0.C13921c
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2319H0() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer.mo2319H0():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void m38874K0(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m38872M0(constraintWidget);
        } else if (i == 1) {
            m38871N0(constraintWidget);
        }
    }

    /* renamed from: L0 */
    public boolean m38873L0(C13714d dVar) {
        mo38818f(dVar);
        int size = this.f31384w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f31384w0.get(i);
            constraintWidget.m38904l0(0, false);
            constraintWidget.m38904l0(1, false);
            if (constraintWidget instanceof C2122a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f31384w0.get(i2);
                if (constraintWidget2 instanceof C2122a) {
                    ((C2122a) constraintWidget2).m38848K0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.f31384w0.get(i3);
            if (constraintWidget3.m38916e()) {
                constraintWidget3.mo38818f(dVar);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget4 = this.f31384w0.get(i4);
            if (constraintWidget4 instanceof ConstraintWidgetContainer) {
                ConstraintWidget.EnumC2121b[] bVarArr = constraintWidget4.f35350M;
                ConstraintWidget.EnumC2121b bVar = bVarArr[0];
                ConstraintWidget.EnumC2121b bVar2 = bVarArr[1];
                ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    constraintWidget4.m38909i0(ConstraintWidget.EnumC2121b.FIXED);
                }
                if (bVar2 == bVar3) {
                    constraintWidget4.m38880x0(ConstraintWidget.EnumC2121b.FIXED);
                }
                constraintWidget4.mo38818f(dVar);
                if (bVar == bVar3) {
                    constraintWidget4.m38909i0(bVar);
                }
                if (bVar2 == bVar3) {
                    constraintWidget4.m38880x0(bVar2);
                }
            } else {
                C2130f.m38815a(this, dVar, constraintWidget4);
                if (!constraintWidget4.m38916e()) {
                    constraintWidget4.mo38818f(dVar);
                }
            }
        }
        if (this.f35371H0 > 0) {
            C2123b.m38844a(this, dVar, 0);
        }
        if (this.f35372I0 > 0) {
            C2123b.m38844a(this, dVar, 1);
        }
        return true;
    }

    /* renamed from: O0 */
    public boolean m38870O0(boolean z) {
        return this.f2574y0.m1387f(z);
    }

    /* renamed from: P0 */
    public boolean m38869P0(boolean z) {
        return this.f2574y0.m1386g(z);
    }

    /* renamed from: Q0 */
    public boolean m38868Q0(boolean z, int i) {
        return this.f2574y0.m1385h(z, i);
    }

    /* renamed from: R0 */
    public void m38867R0(Metrics metrics) {
        this.f35365B0 = metrics;
        this.f35366C0.m2905v(metrics);
    }

    /* renamed from: S0 */
    public C14201b.AbstractC0461b m38866S0() {
        return this.f2575z0;
    }

    /* renamed from: T0 */
    public int m38865T0() {
        return this.f35380Q0;
    }

    /* renamed from: U0 */
    public void m38864U0() {
        this.f2574y0.m1383j();
    }

    /* renamed from: V0 */
    public void m38863V0() {
        this.f2574y0.m1382k();
    }

    @Override // p411x0.C13921c, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: W */
    public void mo2316W() {
        this.f35366C0.m2927E();
        this.f35367D0 = 0;
        this.f35369F0 = 0;
        this.f35368E0 = 0;
        this.f35370G0 = 0;
        this.f35381R0 = false;
        super.mo2316W();
    }

    /* renamed from: W0 */
    public boolean m38862W0() {
        return this.f35383T0;
    }

    /* renamed from: X0 */
    public boolean m38861X0() {
        return this.f35364A0;
    }

    /* renamed from: Y0 */
    public boolean m38860Y0() {
        return this.f35382S0;
    }

    /* renamed from: Z0 */
    public long m38859Z0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f35367D0 = i8;
        this.f35368E0 = i9;
        return this.f2573x0.m1399d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: a1 */
    public boolean m38858a1(int i) {
        return (this.f35380Q0 & i) == i;
    }

    /* renamed from: c1 */
    public void m38856c1(C14201b.AbstractC0461b bVar) {
        this.f2575z0 = bVar;
        this.f2574y0.m1379n(bVar);
    }

    /* renamed from: d1 */
    public void m38855d1(int i) {
        this.f35380Q0 = i;
        C13714d.f30635s = C2130f.m38814b(i, Spliterator.NONNULL);
    }

    /* renamed from: e1 */
    public void m38854e1(boolean z) {
        this.f35364A0 = z;
    }

    /* renamed from: f1 */
    public void m38853f1(C13714d dVar, boolean[] zArr) {
        zArr[2] = false;
        mo38827G0(dVar);
        int size = this.f31384w0.size();
        for (int i = 0; i < size; i++) {
            this.f31384w0.get(i).mo38827G0(dVar);
        }
    }

    /* renamed from: g1 */
    public void m38852g1() {
        this.f2573x0.m1398e(this);
    }
}
