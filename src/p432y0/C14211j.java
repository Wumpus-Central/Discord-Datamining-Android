package p432y0;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p411x0.AbstractC13919a;
import p432y0.AbstractC14216m;
import p432y0.C14206f;

/* renamed from: y0.j */
/* loaded from: classes.dex */
public class C14211j extends AbstractC14216m {

    /* renamed from: k */
    private static int[] f32097k = new int[2];

    /* renamed from: y0.j$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C14212a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32098a;

        static {
            int[] iArr = new int[AbstractC14216m.EnumC14218b.values().length];
            f32098a = iArr;
            try {
                iArr[AbstractC14216m.EnumC14218b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32098a[AbstractC14216m.EnumC14218b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32098a[AbstractC14216m.EnumC14218b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C14211j(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f32117h.f32079e = C14206f.EnumC14207a.LEFT;
        this.f32118i.f32079e = C14206f.EnumC14207a.RIGHT;
        this.f32115f = 0;
    }

    /* renamed from: q */
    private void m1373q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((i7 * f) + 0.5f);
            int i9 = (int) ((i6 / f) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((i6 * f) + 0.5f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b9, code lost:
        if (r14 != 1) goto L_0x031e;
     */
    @Override // p432y0.AbstractC14216m, p432y0.AbstractC14204d
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo1366a(p432y0.AbstractC14204d r17) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p432y0.C14211j.mo1366a(y0.d):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: d */
    public void mo1363d() {
        ConstraintWidget E;
        ConstraintWidget E2;
        ConstraintWidget constraintWidget = this.f32111b;
        if (constraintWidget.f2519a) {
            this.f32114e.mo1376d(constraintWidget.m38932N());
        }
        if (!this.f32114e.f32084j) {
            ConstraintWidget.EnumC2121b w = this.f32111b.m38883w();
            this.f32113d = w;
            if (w != ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
                ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.MATCH_PARENT;
                if (w == bVar && (((E2 = this.f32111b.m38942E()) != null && E2.m38883w() == ConstraintWidget.EnumC2121b.FIXED) || E2.m38883w() == bVar)) {
                    int N = (E2.m38932N() - this.f32111b.f35339B.m38838b()) - this.f32111b.f35341D.m38838b();
                    m1365b(this.f32117h, E2.f2527e.f32117h, this.f32111b.f35339B.m38838b());
                    m1365b(this.f32118i, E2.f2527e.f32118i, -this.f32111b.f35341D.m38838b());
                    this.f32114e.mo1376d(N);
                    return;
                } else if (this.f32113d == ConstraintWidget.EnumC2121b.FIXED) {
                    this.f32114e.mo1376d(this.f32111b.m38932N());
                }
            }
        } else {
            ConstraintWidget.EnumC2121b bVar2 = this.f32113d;
            ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((E = this.f32111b.m38942E()) != null && E.m38883w() == ConstraintWidget.EnumC2121b.FIXED) || E.m38883w() == bVar3)) {
                m1365b(this.f32117h, E.f2527e.f32117h, this.f32111b.f35339B.m38838b());
                m1365b(this.f32118i, E.f2527e.f32118i, -this.f32111b.f35341D.m38838b());
                return;
            }
        }
        C14208g gVar = this.f32114e;
        if (gVar.f32084j) {
            ConstraintWidget constraintWidget2 = this.f32111b;
            if (constraintWidget2.f2519a) {
                C2125d[] dVarArr = constraintWidget2.f35347J;
                C2125d dVar = dVarArr[0];
                C2125d dVar2 = dVar.f2603d;
                if (dVar2 == null || dVarArr[1].f2603d == null) {
                    if (dVar2 != null) {
                        C14206f h = m1359h(dVar);
                        if (h != null) {
                            m1365b(this.f32117h, h, this.f32111b.f35347J[0].m38838b());
                            m1365b(this.f32118i, this.f32117h, this.f32114e.f32081g);
                            return;
                        }
                        return;
                    }
                    C2125d dVar3 = dVarArr[1];
                    if (dVar3.f2603d != null) {
                        C14206f h2 = m1359h(dVar3);
                        if (h2 != null) {
                            m1365b(this.f32118i, h2, -this.f32111b.f35347J[1].m38838b());
                            m1365b(this.f32117h, this.f32118i, -this.f32114e.f32081g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget2 instanceof AbstractC13919a) && constraintWidget2.m38942E() != null && this.f32111b.mo38816k(C2125d.EnumC2127b.CENTER).f2603d == null) {
                        m1365b(this.f32117h, this.f32111b.m38942E().f2527e.f32117h, this.f32111b.m38931O());
                        m1365b(this.f32118i, this.f32117h, this.f32114e.f32081g);
                        return;
                    } else {
                        return;
                    }
                } else if (constraintWidget2.m38926T()) {
                    this.f32117h.f32080f = this.f32111b.f35347J[0].m38838b();
                    this.f32118i.f32080f = -this.f32111b.f35347J[1].m38838b();
                    return;
                } else {
                    C14206f h3 = m1359h(this.f32111b.f35347J[0]);
                    if (h3 != null) {
                        m1365b(this.f32117h, h3, this.f32111b.f35347J[0].m38838b());
                    }
                    C14206f h4 = m1359h(this.f32111b.f35347J[1]);
                    if (h4 != null) {
                        m1365b(this.f32118i, h4, -this.f32111b.f35347J[1].m38838b());
                    }
                    this.f32117h.f32076b = true;
                    this.f32118i.f32076b = true;
                    return;
                }
            }
        }
        if (this.f32113d == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f32111b;
            int i = constraintWidget3.f2541l;
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
            } else if (i == 3) {
                if (constraintWidget3.f2543m == 3) {
                    this.f32117h.f32075a = this;
                    this.f32118i.f32075a = this;
                    C14214l lVar = constraintWidget3.f2529f;
                    lVar.f32117h.f32075a = this;
                    lVar.f32118i.f32075a = this;
                    gVar.f32075a = this;
                    if (constraintWidget3.m38924V()) {
                        this.f32114e.f32086l.add(this.f32111b.f2529f.f32114e);
                        this.f32111b.f2529f.f32114e.f32085k.add(this.f32114e);
                        C14214l lVar2 = this.f32111b.f2529f;
                        lVar2.f32114e.f32075a = this;
                        this.f32114e.f32086l.add(lVar2.f32117h);
                        this.f32114e.f32086l.add(this.f32111b.f2529f.f32118i);
                        this.f32111b.f2529f.f32117h.f32085k.add(this.f32114e);
                        this.f32111b.f2529f.f32118i.f32085k.add(this.f32114e);
                    } else if (this.f32111b.m38926T()) {
                        this.f32111b.f2529f.f32114e.f32086l.add(this.f32114e);
                        this.f32114e.f32085k.add(this.f32111b.f2529f.f32114e);
                    } else {
                        this.f32111b.f2529f.f32114e.f32086l.add(this.f32114e);
                    }
                } else {
                    C14208g gVar4 = constraintWidget3.f2529f.f32114e;
                    gVar.f32086l.add(gVar4);
                    gVar4.f32085k.add(this.f32114e);
                    this.f32111b.f2529f.f32117h.f32085k.add(this.f32114e);
                    this.f32111b.f2529f.f32118i.f32085k.add(this.f32114e);
                    C14208g gVar5 = this.f32114e;
                    gVar5.f32076b = true;
                    gVar5.f32085k.add(this.f32117h);
                    this.f32114e.f32085k.add(this.f32118i);
                    this.f32117h.f32086l.add(this.f32114e);
                    this.f32118i.f32086l.add(this.f32114e);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f32111b;
        C2125d[] dVarArr2 = constraintWidget4.f35347J;
        C2125d dVar4 = dVarArr2[0];
        C2125d dVar5 = dVar4.f2603d;
        if (dVar5 == null || dVarArr2[1].f2603d == null) {
            if (dVar5 != null) {
                C14206f h5 = m1359h(dVar4);
                if (h5 != null) {
                    m1365b(this.f32117h, h5, this.f32111b.f35347J[0].m38838b());
                    m1364c(this.f32118i, this.f32117h, 1, this.f32114e);
                    return;
                }
                return;
            }
            C2125d dVar6 = dVarArr2[1];
            if (dVar6.f2603d != null) {
                C14206f h6 = m1359h(dVar6);
                if (h6 != null) {
                    m1365b(this.f32118i, h6, -this.f32111b.f35347J[1].m38838b());
                    m1364c(this.f32117h, this.f32118i, -1, this.f32114e);
                }
            } else if (!(constraintWidget4 instanceof AbstractC13919a) && constraintWidget4.m38942E() != null) {
                m1365b(this.f32117h, this.f32111b.m38942E().f2527e.f32117h, this.f32111b.m38931O());
                m1364c(this.f32118i, this.f32117h, 1, this.f32114e);
            }
        } else if (constraintWidget4.m38926T()) {
            this.f32117h.f32080f = this.f32111b.f35347J[0].m38838b();
            this.f32118i.f32080f = -this.f32111b.f35347J[1].m38838b();
        } else {
            C14206f h7 = m1359h(this.f32111b.f35347J[0]);
            C14206f h8 = m1359h(this.f32111b.f35347J[1]);
            h7.m1378b(this);
            h8.m1378b(this);
            this.f32119j = AbstractC14216m.EnumC14218b.CENTER;
        }
    }

    @Override // p432y0.AbstractC14216m
    /* renamed from: e */
    public void mo1362e() {
        C14206f fVar = this.f32117h;
        if (fVar.f32084j) {
            this.f32111b.m38945C0(fVar.f32081g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: f */
    public void mo1361f() {
        this.f32112c = null;
        this.f32117h.m1377c();
        this.f32118i.m1377c();
        this.f32114e.m1377c();
        this.f32116g = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p432y0.AbstractC14216m
    /* renamed from: m */
    public boolean mo1354m() {
        if (this.f32113d != ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT || this.f32111b.f2541l == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m1372r() {
        this.f32116g = false;
        this.f32117h.m1377c();
        this.f32117h.f32084j = false;
        this.f32118i.m1377c();
        this.f32118i.f32084j = false;
        this.f32114e.f32084j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f32111b.m38897p();
    }
}
