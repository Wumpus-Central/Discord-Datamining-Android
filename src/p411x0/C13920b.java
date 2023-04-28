package p411x0;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.Arrays;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public class C13920b extends ConstraintWidget implements AbstractC13919a {

    /* renamed from: w0 */
    public ConstraintWidget[] f31382w0 = new ConstraintWidget[4];

    /* renamed from: x0 */
    public int f31383x0 = 0;

    @Override // p411x0.AbstractC13919a
    /* renamed from: a */
    public void mo2322a(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.f31383x0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.f31382w0;
            if (i > constraintWidgetArr.length) {
                this.f31382w0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.f31382w0;
            int i2 = this.f31383x0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.f31383x0 = i2 + 1;
        }
    }

    @Override // p411x0.AbstractC13919a
    /* renamed from: b */
    public void mo2321b() {
        this.f31383x0 = 0;
        Arrays.fill(this.f31382w0, (Object) null);
    }

    /* renamed from: c */
    public void mo2320c(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
