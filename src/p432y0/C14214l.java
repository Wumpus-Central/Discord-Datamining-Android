package p432y0;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p411x0.AbstractC13919a;
import p432y0.AbstractC14216m;
import p432y0.C14206f;

/* renamed from: y0.l */
/* loaded from: classes.dex */
public class C14214l extends AbstractC14216m {

    /* renamed from: k */
    public C14206f f32107k;

    /* renamed from: l */
    C14208g f32108l = null;

    /* renamed from: y0.l$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C14215a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32109a;

        static {
            int[] iArr = new int[AbstractC14216m.EnumC14218b.values().length];
            f32109a = iArr;
            try {
                iArr[AbstractC14216m.EnumC14218b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32109a[AbstractC14216m.EnumC14218b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32109a[AbstractC14216m.EnumC14218b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C14214l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        C14206f fVar = new C14206f(this);
        this.f32107k = fVar;
        this.f32117h.f32079e = C14206f.EnumC14207a.TOP;
        this.f32118i.f32079e = C14206f.EnumC14207a.BOTTOM;
        fVar.f32079e = C14206f.EnumC14207a.BASELINE;
        this.f32115f = 1;
    }

    @Override // p432y0.AbstractC14216m, p432y0.AbstractC14204d
    /* renamed from: a */
    public void mo1366a(AbstractC14204d dVar) {
        C14208g gVar;
        int i;
        float f;
        float f2;
        float f3;
        ConstraintWidget constraintWidget;
        int i2 = C14215a.f32109a[this.f32119j.ordinal()];
        if (i2 == 1) {
            m1351p(dVar);
        } else if (i2 == 2) {
            m1352o(dVar);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget2 = this.f32111b;
            m1353n(dVar, constraintWidget2.f35340C, constraintWidget2.f35342E, 1);
            return;
        }
        C14208g gVar2 = this.f32114e;
        if (gVar2.f32077c && !gVar2.f32084j && this.f32113d == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32111b;
            int i3 = constraintWidget3.f2543m;
            if (i3 == 2) {
                ConstraintWidget E = constraintWidget3.m38942E();
                if (E != null) {
                    if (E.f2529f.f32114e.f32084j) {
                        this.f32114e.mo1376d((int) ((gVar.f32081g * this.f32111b.f2557t) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget3.f2527e.f32114e.f32084j) {
                int s = constraintWidget3.m38891s();
                if (s == -1) {
                    ConstraintWidget constraintWidget4 = this.f32111b;
                    f3 = constraintWidget4.f2527e.f32114e.f32081g;
                    f2 = constraintWidget4.m38893r();
                } else if (s == 0) {
                    f = constraintWidget.f2527e.f32114e.f32081g * this.f32111b.m38893r();
                    i = (int) (f + 0.5f);
                    this.f32114e.mo1376d(i);
                } else if (s != 1) {
                    i = 0;
                    this.f32114e.mo1376d(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.f32111b;
                    f3 = constraintWidget5.f2527e.f32114e.f32081g;
                    f2 = constraintWidget5.m38893r();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f32114e.mo1376d(i);
            }
        }
        C14206f fVar = this.f32117h;
        if (fVar.f32077c) {
            C14206f fVar2 = this.f32118i;
            if (fVar2.f32077c) {
                if (!fVar.f32084j || !fVar2.f32084j || !this.f32114e.f32084j) {
                    if (!this.f32114e.f32084j && this.f32113d == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget6 = this.f32111b;
                        if (constraintWidget6.f2541l == 0 && !constraintWidget6.m38924V()) {
                            int i4 = this.f32117h.f32086l.get(0).f32081g;
                            C14206f fVar3 = this.f32117h;
                            int i5 = i4 + fVar3.f32080f;
                            int i6 = this.f32118i.f32086l.get(0).f32081g + this.f32118i.f32080f;
                            fVar3.mo1376d(i5);
                            this.f32118i.mo1376d(i6);
                            this.f32114e.mo1376d(i6 - i5);
                            return;
                        }
                    }
                    if (!this.f32114e.f32084j && this.f32113d == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && this.f32110a == 1 && this.f32117h.f32086l.size() > 0 && this.f32118i.f32086l.size() > 0) {
                        int i7 = (this.f32118i.f32086l.get(0).f32081g + this.f32118i.f32080f) - (this.f32117h.f32086l.get(0).f32081g + this.f32117h.f32080f);
                        C14208g gVar3 = this.f32114e;
                        int i8 = gVar3.f32096m;
                        if (i7 < i8) {
                            gVar3.mo1376d(i7);
                        } else {
                            gVar3.mo1376d(i8);
                        }
                    }
                    if (this.f32114e.f32084j && this.f32117h.f32086l.size() > 0 && this.f32118i.f32086l.size() > 0) {
                        C14206f fVar4 = this.f32117h.f32086l.get(0);
                        C14206f fVar5 = this.f32118i.f32086l.get(0);
                        int i9 = fVar4.f32081g + this.f32117h.f32080f;
                        int i10 = fVar5.f32081g + this.f32118i.f32080f;
                        float I = this.f32111b.m38937I();
                        if (fVar4 == fVar5) {
                            i9 = fVar4.f32081g;
                            i10 = fVar5.f32081g;
                            I = 0.5f;
                        }
                        this.f32117h.mo1376d((int) (i9 + 0.5f + (((i10 - i9) - this.f32114e.f32081g) * I)));
                        this.f32118i.mo1376d(this.f32117h.f32081g + this.f32114e.f32081g);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: d */
    public void mo1363d() {
        ConstraintWidget E;
        ConstraintWidget E2;
        ConstraintWidget constraintWidget = this.f32111b;
        if (constraintWidget.f2519a) {
            this.f32114e.mo1376d(constraintWidget.m38889t());
        }
        if (!this.f32114e.f32084j) {
            this.f32113d = this.f32111b.m38935K();
            if (this.f32111b.m38929Q()) {
                this.f32108l = new C14200a(this);
            }
            ConstraintWidget.EnumC2121b bVar = this.f32113d;
            if (bVar != ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                if (bVar == ConstraintWidget.EnumC2121b.MATCH_PARENT && (E2 = this.f32111b.m38942E()) != null && E2.m38935K() == ConstraintWidget.EnumC2121b.FIXED) {
                    int t = (E2.m38889t() - this.f32111b.f35340C.m38838b()) - this.f32111b.f35342E.m38838b();
                    m1365b(this.f32117h, E2.f2529f.f32117h, this.f32111b.f35340C.m38838b());
                    m1365b(this.f32118i, E2.f2529f.f32118i, -this.f32111b.f35342E.m38838b());
                    this.f32114e.mo1376d(t);
                    return;
                } else if (this.f32113d == ConstraintWidget.EnumC2121b.FIXED) {
                    this.f32114e.mo1376d(this.f32111b.m38889t());
                }
            }
        } else if (this.f32113d == ConstraintWidget.EnumC2121b.MATCH_PARENT && (E = this.f32111b.m38942E()) != null && E.m38935K() == ConstraintWidget.EnumC2121b.FIXED) {
            m1365b(this.f32117h, E.f2529f.f32117h, this.f32111b.f35340C.m38838b());
            m1365b(this.f32118i, E.f2529f.f32118i, -this.f32111b.f35342E.m38838b());
            return;
        }
        C14208g gVar = this.f32114e;
        boolean z = gVar.f32084j;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f32111b;
            if (constraintWidget2.f2519a) {
                C2125d[] dVarArr = constraintWidget2.f35347J;
                C2125d dVar = dVarArr[2];
                C2125d dVar2 = dVar.f2603d;
                if (dVar2 != null && dVarArr[3].f2603d != null) {
                    if (constraintWidget2.m38924V()) {
                        this.f32117h.f32080f = this.f32111b.f35347J[2].m38838b();
                        this.f32118i.f32080f = -this.f32111b.f35347J[3].m38838b();
                    } else {
                        C14206f h = m1359h(this.f32111b.f35347J[2]);
                        if (h != null) {
                            m1365b(this.f32117h, h, this.f32111b.f35347J[2].m38838b());
                        }
                        C14206f h2 = m1359h(this.f32111b.f35347J[3]);
                        if (h2 != null) {
                            m1365b(this.f32118i, h2, -this.f32111b.f35347J[3].m38838b());
                        }
                        this.f32117h.f32076b = true;
                        this.f32118i.f32076b = true;
                    }
                    if (this.f32111b.m38929Q()) {
                        m1365b(this.f32107k, this.f32117h, this.f32111b.m38905l());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    C14206f h3 = m1359h(dVar);
                    if (h3 != null) {
                        m1365b(this.f32117h, h3, this.f32111b.f35347J[2].m38838b());
                        m1365b(this.f32118i, this.f32117h, this.f32114e.f32081g);
                        if (this.f32111b.m38929Q()) {
                            m1365b(this.f32107k, this.f32117h, this.f32111b.m38905l());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C2125d dVar3 = dVarArr[3];
                    if (dVar3.f2603d != null) {
                        C14206f h4 = m1359h(dVar3);
                        if (h4 != null) {
                            m1365b(this.f32118i, h4, -this.f32111b.f35347J[3].m38838b());
                            m1365b(this.f32117h, this.f32118i, -this.f32114e.f32081g);
                        }
                        if (this.f32111b.m38929Q()) {
                            m1365b(this.f32107k, this.f32117h, this.f32111b.m38905l());
                            return;
                        }
                        return;
                    }
                    C2125d dVar4 = dVarArr[4];
                    if (dVar4.f2603d != null) {
                        C14206f h5 = m1359h(dVar4);
                        if (h5 != null) {
                            m1365b(this.f32107k, h5, 0);
                            m1365b(this.f32117h, this.f32107k, -this.f32111b.m38905l());
                            m1365b(this.f32118i, this.f32117h, this.f32114e.f32081g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof AbstractC13919a) && constraintWidget2.m38942E() != null && this.f32111b.mo38816k(C2125d.EnumC2127b.CENTER).f2603d == null) {
                        m1365b(this.f32117h, this.f32111b.m38942E().f2529f.f32117h, this.f32111b.m38930P());
                        m1365b(this.f32118i, this.f32117h, this.f32114e.f32081g);
                        if (this.f32111b.m38929Q()) {
                            m1365b(this.f32107k, this.f32117h, this.f32111b.m38905l());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z || this.f32113d != ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
            gVar.m1378b(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f32111b;
            int i = constraintWidget3.f2543m;
            if (i == 2) {
                ConstraintWidget E3 = constraintWidget3.m38942E();
                if (E3 != null) {
                    C14208g gVar2 = E3.f2529f.f32114e;
                    this.f32114e.f32086l.add(gVar2);
                    gVar2.f32085k.add(this.f32114e);
                    C14208g gVar3 = this.f32114e;
                    gVar3.f32076b = true;
                    gVar3.f32085k.add(this.f32117h);
                    this.f32114e.f32085k.add(this.f32118i);
                }
            } else if (i == 3 && !constraintWidget3.m38924V()) {
                ConstraintWidget constraintWidget4 = this.f32111b;
                if (constraintWidget4.f2541l != 3) {
                    C14208g gVar4 = constraintWidget4.f2527e.f32114e;
                    this.f32114e.f32086l.add(gVar4);
                    gVar4.f32085k.add(this.f32114e);
                    C14208g gVar5 = this.f32114e;
                    gVar5.f32076b = true;
                    gVar5.f32085k.add(this.f32117h);
                    this.f32114e.f32085k.add(this.f32118i);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f32111b;
        C2125d[] dVarArr2 = constraintWidget5.f35347J;
        C2125d dVar5 = dVarArr2[2];
        C2125d dVar6 = dVar5.f2603d;
        if (dVar6 != null && dVarArr2[3].f2603d != null) {
            if (constraintWidget5.m38924V()) {
                this.f32117h.f32080f = this.f32111b.f35347J[2].m38838b();
                this.f32118i.f32080f = -this.f32111b.f35347J[3].m38838b();
            } else {
                C14206f h6 = m1359h(this.f32111b.f35347J[2]);
                C14206f h7 = m1359h(this.f32111b.f35347J[3]);
                h6.m1378b(this);
                h7.m1378b(this);
                this.f32119j = AbstractC14216m.EnumC14218b.CENTER;
            }
            if (this.f32111b.m38929Q()) {
                m1364c(this.f32107k, this.f32117h, 1, this.f32108l);
            }
        } else if (dVar6 != null) {
            C14206f h8 = m1359h(dVar5);
            if (h8 != null) {
                m1365b(this.f32117h, h8, this.f32111b.f35347J[2].m38838b());
                m1364c(this.f32118i, this.f32117h, 1, this.f32114e);
                if (this.f32111b.m38929Q()) {
                    m1364c(this.f32107k, this.f32117h, 1, this.f32108l);
                }
                ConstraintWidget.EnumC2121b bVar2 = this.f32113d;
                ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f32111b.m38893r() > 0.0f) {
                    C14211j jVar = this.f32111b.f2527e;
                    if (jVar.f32113d == bVar3) {
                        jVar.f32114e.f32085k.add(this.f32114e);
                        this.f32114e.f32086l.add(this.f32111b.f2527e.f32114e);
                        this.f32114e.f32075a = this;
                    }
                }
            }
        } else {
            C2125d dVar7 = dVarArr2[3];
            if (dVar7.f2603d != null) {
                C14206f h9 = m1359h(dVar7);
                if (h9 != null) {
                    m1365b(this.f32118i, h9, -this.f32111b.f35347J[3].m38838b());
                    m1364c(this.f32117h, this.f32118i, -1, this.f32114e);
                    if (this.f32111b.m38929Q()) {
                        m1364c(this.f32107k, this.f32117h, 1, this.f32108l);
                    }
                }
            } else {
                C2125d dVar8 = dVarArr2[4];
                if (dVar8.f2603d != null) {
                    C14206f h10 = m1359h(dVar8);
                    if (h10 != null) {
                        m1365b(this.f32107k, h10, 0);
                        m1364c(this.f32117h, this.f32107k, -1, this.f32108l);
                        m1364c(this.f32118i, this.f32117h, 1, this.f32114e);
                    }
                } else if (!(constraintWidget5 instanceof AbstractC13919a) && constraintWidget5.m38942E() != null) {
                    m1365b(this.f32117h, this.f32111b.m38942E().f2529f.f32117h, this.f32111b.m38930P());
                    m1364c(this.f32118i, this.f32117h, 1, this.f32114e);
                    if (this.f32111b.m38929Q()) {
                        m1364c(this.f32107k, this.f32117h, 1, this.f32108l);
                    }
                    ConstraintWidget.EnumC2121b bVar4 = this.f32113d;
                    ConstraintWidget.EnumC2121b bVar5 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f32111b.m38893r() > 0.0f) {
                        C14211j jVar2 = this.f32111b.f2527e;
                        if (jVar2.f32113d == bVar5) {
                            jVar2.f32114e.f32085k.add(this.f32114e);
                            this.f32114e.f32086l.add(this.f32111b.f2527e.f32114e);
                            this.f32114e.f32075a = this;
                        }
                    }
                }
            }
        }
        if (this.f32114e.f32086l.size() == 0) {
            this.f32114e.f32077c = true;
        }
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: e */
    public void mo1362e() {
        C14206f fVar = this.f32117h;
        if (fVar.f32084j) {
            this.f32111b.m38943D0(fVar.f32081g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: f */
    public void mo1361f() {
        this.f32112c = null;
        this.f32117h.m1377c();
        this.f32118i.m1377c();
        this.f32107k.m1377c();
        this.f32114e.m1377c();
        this.f32116g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: m */
    public boolean mo1354m() {
        if (this.f32113d != ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT || this.f32111b.f2543m == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m1367q() {
        this.f32116g = false;
        this.f32117h.m1377c();
        this.f32117h.f32084j = false;
        this.f32118i.m1377c();
        this.f32118i.f32084j = false;
        this.f32107k.m1377c();
        this.f32107k.f32084j = false;
        this.f32114e.f32084j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f32111b.m38897p();
    }
}
