package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p391w0.C13714d;

/* renamed from: androidx.constraintlayout.solver.widgets.f */
/* loaded from: classes.dex */
public class C2130f {

    /* renamed from: a */
    static boolean[] f2623a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m38815a(ConstraintWidgetContainer constraintWidgetContainer, C13714d dVar, ConstraintWidget constraintWidget) {
        constraintWidget.f2537j = -1;
        constraintWidget.f2539k = -1;
        ConstraintWidget.EnumC2121b bVar = constraintWidgetContainer.f35350M[0];
        ConstraintWidget.EnumC2121b bVar2 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
        if (bVar != bVar2 && constraintWidget.f35350M[0] == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
            int i = constraintWidget.f35339B.f2604e;
            int N = constraintWidgetContainer.m38932N() - constraintWidget.f35341D.f2604e;
            C2125d dVar2 = constraintWidget.f35339B;
            dVar2.f2606g = dVar.m2910q(dVar2);
            C2125d dVar3 = constraintWidget.f35341D;
            dVar3.f2606g = dVar.m2910q(dVar3);
            dVar.m2921f(constraintWidget.f35339B.f2606g, i);
            dVar.m2921f(constraintWidget.f35341D.f2606g, N);
            constraintWidget.f2537j = 2;
            constraintWidget.m38911h0(i, N);
        }
        if (constraintWidgetContainer.f35350M[1] != bVar2 && constraintWidget.f35350M[1] == ConstraintWidget.EnumC2121b.MATCH_PARENT) {
            int i2 = constraintWidget.f35340C.f2604e;
            int t = constraintWidgetContainer.m38889t() - constraintWidget.f35342E.f2604e;
            C2125d dVar4 = constraintWidget.f35340C;
            dVar4.f2606g = dVar.m2910q(dVar4);
            C2125d dVar5 = constraintWidget.f35342E;
            dVar5.f2606g = dVar.m2910q(dVar5);
            dVar.m2921f(constraintWidget.f35340C.f2606g, i2);
            dVar.m2921f(constraintWidget.f35342E.f2606g, t);
            if (constraintWidget.f35362Y > 0 || constraintWidget.m38933M() == 8) {
                C2125d dVar6 = constraintWidget.f35343F;
                dVar6.f2606g = dVar.m2910q(dVar6);
                dVar.m2921f(constraintWidget.f35343F.f2606g, constraintWidget.f35362Y + i2);
            }
            constraintWidget.f2539k = 2;
            constraintWidget.m38882w0(i2, t);
        }
    }

    /* renamed from: b */
    public static final boolean m38814b(int i, int i2) {
        return (i & i2) == i2;
    }
}
