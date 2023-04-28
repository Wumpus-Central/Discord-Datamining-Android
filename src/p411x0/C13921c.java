package p411x0;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;
import p391w0.C13713c;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public class C13921c extends ConstraintWidget {

    /* renamed from: w0 */
    public ArrayList<ConstraintWidget> f31384w0 = new ArrayList<>();

    /* renamed from: H0 */
    public void mo2319H0() {
        ArrayList<ConstraintWidget> arrayList = this.f31384w0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = this.f31384w0.get(i);
                if (constraintWidget instanceof C13921c) {
                    ((C13921c) constraintWidget).mo2319H0();
                }
            }
        }
    }

    /* renamed from: I0 */
    public void m2318I0(ConstraintWidget constraintWidget) {
        this.f31384w0.remove(constraintWidget);
        constraintWidget.m38888t0(null);
    }

    /* renamed from: J0 */
    public void m2317J0() {
        this.f31384w0.clear();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: W */
    public void mo2316W() {
        this.f31384w0.clear();
        super.mo2316W();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: X */
    public void mo2315X(C13713c cVar) {
        super.mo2315X(cVar);
        int size = this.f31384w0.size();
        for (int i = 0; i < size; i++) {
            this.f31384w0.get(i).mo2315X(cVar);
        }
    }

    /* renamed from: a */
    public void m2314a(ConstraintWidget constraintWidget) {
        this.f31384w0.add(constraintWidget);
        if (constraintWidget.m38942E() != null) {
            ((C13921c) constraintWidget.m38942E()).m2318I0(constraintWidget);
        }
        constraintWidget.m38888t0(this);
    }
}
