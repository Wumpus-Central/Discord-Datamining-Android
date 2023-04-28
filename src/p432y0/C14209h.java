package p432y0;

import androidx.constraintlayout.solver.widgets.C2128e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y0.h */
/* loaded from: classes.dex */
public class C14209h extends AbstractC14216m {
    public C14209h(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f2527e.mo1361f();
        constraintWidget.f2529f.mo1361f();
        this.f32115f = ((C2128e) constraintWidget).m38826H0();
    }

    /* renamed from: q */
    private void m1375q(C14206f fVar) {
        this.f32117h.f32085k.add(fVar);
        fVar.f32086l.add(this.f32117h);
    }

    @Override // p432y0.AbstractC14216m, p432y0.AbstractC14204d
    /* renamed from: a */
    public void mo1366a(AbstractC14204d dVar) {
        C14206f fVar = this.f32117h;
        if (fVar.f32077c && !fVar.f32084j) {
            this.f32117h.mo1376d((int) ((fVar.f32086l.get(0).f32081g * ((C2128e) this.f32111b).m38823K0()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: d */
    public void mo1363d() {
        C2128e eVar = (C2128e) this.f32111b;
        int I0 = eVar.m38825I0();
        int J0 = eVar.m38824J0();
        eVar.m38823K0();
        if (eVar.m38826H0() == 1) {
            if (I0 != -1) {
                this.f32117h.f32086l.add(this.f32111b.f35351N.f2527e.f32117h);
                this.f32111b.f35351N.f2527e.f32117h.f32085k.add(this.f32117h);
                this.f32117h.f32080f = I0;
            } else if (J0 != -1) {
                this.f32117h.f32086l.add(this.f32111b.f35351N.f2527e.f32118i);
                this.f32111b.f35351N.f2527e.f32118i.f32085k.add(this.f32117h);
                this.f32117h.f32080f = -J0;
            } else {
                C14206f fVar = this.f32117h;
                fVar.f32076b = true;
                fVar.f32086l.add(this.f32111b.f35351N.f2527e.f32118i);
                this.f32111b.f35351N.f2527e.f32118i.f32085k.add(this.f32117h);
            }
            m1375q(this.f32111b.f2527e.f32117h);
            m1375q(this.f32111b.f2527e.f32118i);
            return;
        }
        if (I0 != -1) {
            this.f32117h.f32086l.add(this.f32111b.f35351N.f2529f.f32117h);
            this.f32111b.f35351N.f2529f.f32117h.f32085k.add(this.f32117h);
            this.f32117h.f32080f = I0;
        } else if (J0 != -1) {
            this.f32117h.f32086l.add(this.f32111b.f35351N.f2529f.f32118i);
            this.f32111b.f35351N.f2529f.f32118i.f32085k.add(this.f32117h);
            this.f32117h.f32080f = -J0;
        } else {
            C14206f fVar2 = this.f32117h;
            fVar2.f32076b = true;
            fVar2.f32086l.add(this.f32111b.f35351N.f2529f.f32118i);
            this.f32111b.f35351N.f2529f.f32118i.f32085k.add(this.f32117h);
        }
        m1375q(this.f32111b.f2529f.f32117h);
        m1375q(this.f32111b.f2529f.f32118i);
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: e */
    public void mo1362e() {
        if (((C2128e) this.f32111b).m38826H0() == 1) {
            this.f32111b.m38945C0(this.f32117h.f32081g);
        } else {
            this.f32111b.m38943D0(this.f32117h.f32081g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: f */
    public void mo1361f() {
        this.f32117h.m1377c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: m */
    public boolean mo1354m() {
        return false;
    }
}
