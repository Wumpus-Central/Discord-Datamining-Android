package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p391w0.C13714d;
import p391w0.C13722h;
import p411x0.C13920b;

/* renamed from: androidx.constraintlayout.solver.widgets.a */
/* loaded from: classes.dex */
public class C2122a extends C13920b {

    /* renamed from: y0 */
    private int f2576y0 = 0;

    /* renamed from: z0 */
    private boolean f2577z0 = true;

    /* renamed from: A0 */
    private int f35385A0 = 0;

    /* renamed from: H0 */
    public boolean m38851H0() {
        return this.f2577z0;
    }

    /* renamed from: I0 */
    public int m38850I0() {
        return this.f2576y0;
    }

    /* renamed from: J0 */
    public int m38849J0() {
        return this.f35385A0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K0 */
    public void m38848K0() {
        for (int i = 0; i < this.f31383x0; i++) {
            ConstraintWidget constraintWidget = this.f31382w0[i];
            int i2 = this.f2576y0;
            if (i2 == 0 || i2 == 1) {
                constraintWidget.m38904l0(0, true);
            } else if (i2 == 2 || i2 == 3) {
                constraintWidget.m38904l0(1, true);
            }
        }
    }

    /* renamed from: L0 */
    public void m38847L0(boolean z) {
        this.f2577z0 = z;
    }

    /* renamed from: M0 */
    public void m38846M0(int i) {
        this.f2576y0 = i;
    }

    /* renamed from: N0 */
    public void m38845N0(int i) {
        this.f35385A0 = i;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo38818f(C13714d dVar) {
        C2125d[] dVarArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C2125d[] dVarArr2 = this.f35347J;
        dVarArr2[0] = this.f35339B;
        dVarArr2[2] = this.f35340C;
        dVarArr2[1] = this.f35341D;
        dVarArr2[3] = this.f35342E;
        int i6 = 0;
        while (true) {
            dVarArr = this.f35347J;
            if (i6 >= dVarArr.length) {
                break;
            }
            C2125d dVar2 = dVarArr[i6];
            dVar2.f2606g = dVar.m2910q(dVar2);
            i6++;
        }
        int i7 = this.f2576y0;
        if (i7 >= 0 && i7 < 4) {
            C2125d dVar3 = dVarArr[i7];
            for (int i8 = 0; i8 < this.f31383x0; i8++) {
                ConstraintWidget constraintWidget = this.f31382w0[i8];
                if ((this.f2577z0 || constraintWidget.mo38817g()) && ((((i4 = this.f2576y0) == 0 || i4 == 1) && constraintWidget.m38883w() == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && constraintWidget.f35339B.f2603d != null && constraintWidget.f35341D.f2603d != null) || (((i5 = this.f2576y0) == 2 || i5 == 3) && constraintWidget.m38935K() == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && constraintWidget.f35340C.f2603d != null && constraintWidget.f35342E.f2603d != null))) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (this.f35339B.m38832h() || this.f35341D.m38832h()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f35340C.m38832h() || this.f35342E.m38832h()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z || (((i3 = this.f2576y0) != 0 || !z2) && ((i3 != 2 || !z3) && ((i3 != 1 || !z2) && (i3 != 3 || !z3))))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i9 = 0; i9 < this.f31383x0; i9++) {
                ConstraintWidget constraintWidget2 = this.f31382w0[i9];
                if (this.f2577z0 || constraintWidget2.mo38817g()) {
                    C13722h q = dVar.m2910q(constraintWidget2.f35347J[this.f2576y0]);
                    C2125d[] dVarArr3 = constraintWidget2.f35347J;
                    int i10 = this.f2576y0;
                    C2125d dVar4 = dVarArr3[i10];
                    dVar4.f2606g = q;
                    C2125d dVar5 = dVar4.f2603d;
                    if (dVar5 == null || dVar5.f2601b != this) {
                        i2 = 0;
                    } else {
                        i2 = dVar4.f2604e + 0;
                    }
                    if (i10 == 0 || i10 == 2) {
                        dVar.m2918i(dVar3.f2606g, q, this.f35385A0 - i2, z);
                    } else {
                        dVar.m2920g(dVar3.f2606g, q, this.f35385A0 + i2, z);
                    }
                    dVar.m2922e(dVar3.f2606g, q, this.f35385A0 + i2, i);
                }
            }
            int i11 = this.f2576y0;
            if (i11 == 0) {
                dVar.m2922e(this.f35341D.f2606g, this.f35339B.f2606g, 0, 8);
                dVar.m2922e(this.f35339B.f2606g, this.f35351N.f35341D.f2606g, 0, 4);
                dVar.m2922e(this.f35339B.f2606g, this.f35351N.f35339B.f2606g, 0, 0);
            } else if (i11 == 1) {
                dVar.m2922e(this.f35339B.f2606g, this.f35341D.f2606g, 0, 8);
                dVar.m2922e(this.f35339B.f2606g, this.f35351N.f35339B.f2606g, 0, 4);
                dVar.m2922e(this.f35339B.f2606g, this.f35351N.f35341D.f2606g, 0, 0);
            } else if (i11 == 2) {
                dVar.m2922e(this.f35342E.f2606g, this.f35340C.f2606g, 0, 8);
                dVar.m2922e(this.f35340C.f2606g, this.f35351N.f35342E.f2606g, 0, 4);
                dVar.m2922e(this.f35340C.f2606g, this.f35351N.f35340C.f2606g, 0, 0);
            } else if (i11 == 3) {
                dVar.m2922e(this.f35340C.f2606g, this.f35342E.f2606g, 0, 8);
                dVar.m2922e(this.f35340C.f2606g, this.f35351N.f35340C.f2606g, 0, 4);
                dVar.m2922e(this.f35340C.f2606g, this.f35351N.f35342E.f2606g, 0, 0);
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo38817g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public String toString() {
        String str = "[Barrier] " + m38897p() + " {";
        for (int i = 0; i < this.f31383x0; i++) {
            ConstraintWidget constraintWidget = this.f31382w0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + constraintWidget.m38897p();
        }
        return str + "}";
    }
}
