package p432y0;

import androidx.constraintlayout.solver.widgets.C2122a;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p432y0.C14206f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0.i */
/* loaded from: classes.dex */
public class C14210i extends AbstractC14216m {
    public C14210i(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    /* renamed from: q */
    private void m1374q(C14206f fVar) {
        this.f32117h.f32085k.add(fVar);
        fVar.f32086l.add(this.f32117h);
    }

    @Override // p432y0.AbstractC14216m, p432y0.AbstractC14204d
    /* renamed from: a */
    public void mo1366a(AbstractC14204d dVar) {
        C2122a aVar = (C2122a) this.f32111b;
        int I0 = aVar.m38850I0();
        int i = 0;
        int i2 = -1;
        for (C14206f fVar : this.f32117h.f32086l) {
            int i3 = fVar.f32081g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (I0 == 0 || I0 == 2) {
            this.f32117h.mo1376d(i2 + aVar.m38849J0());
        } else {
            this.f32117h.mo1376d(i + aVar.m38849J0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: d */
    public void mo1363d() {
        ConstraintWidget constraintWidget = this.f32111b;
        if (constraintWidget instanceof C2122a) {
            this.f32117h.f32076b = true;
            C2122a aVar = (C2122a) constraintWidget;
            int I0 = aVar.m38850I0();
            boolean H0 = aVar.m38851H0();
            int i = 0;
            if (I0 == 0) {
                this.f32117h.f32079e = C14206f.EnumC14207a.LEFT;
                while (i < aVar.f31383x0) {
                    ConstraintWidget constraintWidget2 = aVar.f31382w0[i];
                    if (H0 || constraintWidget2.m38933M() != 8) {
                        C14206f fVar = constraintWidget2.f2527e.f32117h;
                        fVar.f32085k.add(this.f32117h);
                        this.f32117h.f32086l.add(fVar);
                    }
                    i++;
                }
                m1374q(this.f32111b.f2527e.f32117h);
                m1374q(this.f32111b.f2527e.f32118i);
            } else if (I0 == 1) {
                this.f32117h.f32079e = C14206f.EnumC14207a.RIGHT;
                while (i < aVar.f31383x0) {
                    ConstraintWidget constraintWidget3 = aVar.f31382w0[i];
                    if (H0 || constraintWidget3.m38933M() != 8) {
                        C14206f fVar2 = constraintWidget3.f2527e.f32118i;
                        fVar2.f32085k.add(this.f32117h);
                        this.f32117h.f32086l.add(fVar2);
                    }
                    i++;
                }
                m1374q(this.f32111b.f2527e.f32117h);
                m1374q(this.f32111b.f2527e.f32118i);
            } else if (I0 == 2) {
                this.f32117h.f32079e = C14206f.EnumC14207a.TOP;
                while (i < aVar.f31383x0) {
                    ConstraintWidget constraintWidget4 = aVar.f31382w0[i];
                    if (H0 || constraintWidget4.m38933M() != 8) {
                        C14206f fVar3 = constraintWidget4.f2529f.f32117h;
                        fVar3.f32085k.add(this.f32117h);
                        this.f32117h.f32086l.add(fVar3);
                    }
                    i++;
                }
                m1374q(this.f32111b.f2529f.f32117h);
                m1374q(this.f32111b.f2529f.f32118i);
            } else if (I0 == 3) {
                this.f32117h.f32079e = C14206f.EnumC14207a.BOTTOM;
                while (i < aVar.f31383x0) {
                    ConstraintWidget constraintWidget5 = aVar.f31382w0[i];
                    if (H0 || constraintWidget5.m38933M() != 8) {
                        C14206f fVar4 = constraintWidget5.f2529f.f32118i;
                        fVar4.f32085k.add(this.f32117h);
                        this.f32117h.f32086l.add(fVar4);
                    }
                    i++;
                }
                m1374q(this.f32111b.f2529f.f32117h);
                m1374q(this.f32111b.f2529f.f32118i);
            }
        }
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: e */
    public void mo1362e() {
        ConstraintWidget constraintWidget = this.f32111b;
        if (constraintWidget instanceof C2122a) {
            int I0 = ((C2122a) constraintWidget).m38850I0();
            if (I0 == 0 || I0 == 1) {
                this.f32111b.m38945C0(this.f32117h.f32081g);
            } else {
                this.f32111b.m38943D0(this.f32117h.f32081g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: f */
    public void mo1361f() {
        this.f32112c = null;
        this.f32117h.m1377c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: m */
    public boolean mo1354m() {
        return false;
    }
}
