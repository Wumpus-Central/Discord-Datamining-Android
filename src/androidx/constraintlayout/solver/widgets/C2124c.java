package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.c */
/* loaded from: classes.dex */
public class C2124c {

    /* renamed from: a */
    protected ConstraintWidget f2578a;

    /* renamed from: b */
    protected ConstraintWidget f2579b;

    /* renamed from: c */
    protected ConstraintWidget f2580c;

    /* renamed from: d */
    protected ConstraintWidget f2581d;

    /* renamed from: e */
    protected ConstraintWidget f2582e;

    /* renamed from: f */
    protected ConstraintWidget f2583f;

    /* renamed from: g */
    protected ConstraintWidget f2584g;

    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f2585h;

    /* renamed from: i */
    protected int f2586i;

    /* renamed from: j */
    protected int f2587j;

    /* renamed from: k */
    protected float f2588k = 0.0f;

    /* renamed from: l */
    int f2589l;

    /* renamed from: m */
    int f2590m;

    /* renamed from: n */
    int f2591n;

    /* renamed from: o */
    boolean f2592o;

    /* renamed from: p */
    private int f2593p;

    /* renamed from: q */
    private boolean f2594q;

    /* renamed from: r */
    protected boolean f2595r;

    /* renamed from: s */
    protected boolean f2596s;

    /* renamed from: t */
    protected boolean f2597t;

    /* renamed from: u */
    protected boolean f2598u;

    /* renamed from: v */
    private boolean f2599v;

    public C2124c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2578a = constraintWidget;
        this.f2593p = i;
        this.f2594q = z;
    }

    /* renamed from: b */
    private void m38841b() {
        int i = this.f2593p * 2;
        ConstraintWidget constraintWidget = this.f2578a;
        boolean z = true;
        this.f2592o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f2586i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f2556s0;
            int i2 = this.f2593p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.f2554r0[i2] = null;
            if (constraintWidget.m38933M() != 8) {
                this.f2589l++;
                ConstraintWidget.EnumC2121b q = constraintWidget.m38895q(this.f2593p);
                ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                if (q != bVar) {
                    this.f2590m += constraintWidget.m38879y(this.f2593p);
                }
                int b = this.f2590m + constraintWidget.f35347J[i].m38838b();
                this.f2590m = b;
                int i3 = i + 1;
                this.f2590m = b + constraintWidget.f35347J[i3].m38838b();
                int b2 = this.f2591n + constraintWidget.f35347J[i].m38838b();
                this.f2591n = b2;
                this.f2591n = b2 + constraintWidget.f35347J[i3].m38838b();
                if (this.f2579b == null) {
                    this.f2579b = constraintWidget;
                }
                this.f2581d = constraintWidget;
                ConstraintWidget.EnumC2121b[] bVarArr = constraintWidget.f35350M;
                int i4 = this.f2593p;
                if (bVarArr[i4] == bVar) {
                    int i5 = constraintWidget.f2545n[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f2587j++;
                        float f = constraintWidget.f2552q0[i4];
                        if (f > 0.0f) {
                            this.f2588k += f;
                        }
                        if (m38840c(constraintWidget, i4)) {
                            if (f < 0.0f) {
                                this.f2595r = true;
                            } else {
                                this.f2596s = true;
                            }
                            if (this.f2585h == null) {
                                this.f2585h = new ArrayList<>();
                            }
                            this.f2585h.add(constraintWidget);
                        }
                        if (this.f2583f == null) {
                            this.f2583f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f2584g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f2554r0[this.f2593p] = constraintWidget;
                        }
                        this.f2584g = constraintWidget;
                    }
                    if (this.f2593p == 0) {
                        if (constraintWidget.f2541l != 0) {
                            this.f2592o = false;
                        } else if (!(constraintWidget.f2547o == 0 && constraintWidget.f2549p == 0)) {
                            this.f2592o = false;
                        }
                    } else if (constraintWidget.f2543m != 0) {
                        this.f2592o = false;
                    } else if (!(constraintWidget.f2553r == 0 && constraintWidget.f2555s == 0)) {
                        this.f2592o = false;
                    }
                    if (constraintWidget.f35354Q != 0.0f) {
                        this.f2592o = false;
                        this.f2598u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f2556s0[this.f2593p] = constraintWidget;
            }
            C2125d dVar = constraintWidget.f35347J[i + 1].f2603d;
            if (dVar != null) {
                ConstraintWidget constraintWidget5 = dVar.f2601b;
                C2125d dVar2 = constraintWidget5.f35347J[i].f2603d;
                if (dVar2 != null && dVar2.f2601b == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f2579b;
        if (constraintWidget6 != null) {
            this.f2590m -= constraintWidget6.f35347J[i].m38838b();
        }
        ConstraintWidget constraintWidget7 = this.f2581d;
        if (constraintWidget7 != null) {
            this.f2590m -= constraintWidget7.f35347J[i + 1].m38838b();
        }
        this.f2580c = constraintWidget;
        if (this.f2593p != 0 || !this.f2594q) {
            this.f2582e = this.f2578a;
        } else {
            this.f2582e = constraintWidget;
        }
        if (!this.f2596s || !this.f2595r) {
            z = false;
        }
        this.f2597t = z;
    }

    /* renamed from: c */
    private static boolean m38840c(ConstraintWidget constraintWidget, int i) {
        int i2;
        return constraintWidget.m38933M() != 8 && constraintWidget.f35350M[i] == ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT && ((i2 = constraintWidget.f2545n[i]) == 0 || i2 == 3);
    }

    /* renamed from: a */
    public void m38842a() {
        if (!this.f2599v) {
            m38841b();
        }
        this.f2599v = true;
    }
}
