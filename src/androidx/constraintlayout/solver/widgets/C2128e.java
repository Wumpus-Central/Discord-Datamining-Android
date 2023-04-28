package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import p391w0.C13714d;
import p391w0.C13722h;

/* renamed from: androidx.constraintlayout.solver.widgets.e */
/* loaded from: classes.dex */
public class C2128e extends ConstraintWidget {

    /* renamed from: w0 */
    protected float f2618w0 = -1.0f;

    /* renamed from: x0 */
    protected int f2619x0 = -1;

    /* renamed from: y0 */
    protected int f2620y0 = -1;

    /* renamed from: z0 */
    private C2125d f2621z0 = this.f35340C;

    /* renamed from: A0 */
    private int f35386A0 = 0;

    /* renamed from: B0 */
    private int f35387B0 = 0;

    /* renamed from: androidx.constraintlayout.solver.widgets.e$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C2129a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2622a;

        static {
            int[] iArr = new int[C2125d.EnumC2127b.values().length];
            f2622a = iArr;
            try {
                iArr[C2125d.EnumC2127b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2622a[C2125d.EnumC2127b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2622a[C2125d.EnumC2127b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2622a[C2125d.EnumC2127b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2622a[C2125d.EnumC2127b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2622a[C2125d.EnumC2127b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2622a[C2125d.EnumC2127b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2622a[C2125d.EnumC2127b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2622a[C2125d.EnumC2127b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C2128e() {
        this.f35348K.clear();
        this.f35348K.add(this.f2621z0);
        int length = this.f35347J.length;
        for (int i = 0; i < length; i++) {
            this.f35347J[i] = this.f2621z0;
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: G0 */
    public void mo38827G0(C13714d dVar) {
        if (m38942E() != null) {
            int y = dVar.m2902y(this.f2621z0);
            if (this.f35386A0 == 1) {
                m38945C0(y);
                m38943D0(0);
                m38915e0(m38942E().m38889t());
                m38947B0(0);
                return;
            }
            m38945C0(0);
            m38943D0(y);
            m38947B0(m38942E().m38932N());
            m38915e0(0);
        }
    }

    /* renamed from: H0 */
    public int m38826H0() {
        return this.f35386A0;
    }

    /* renamed from: I0 */
    public int m38825I0() {
        return this.f2619x0;
    }

    /* renamed from: J0 */
    public int m38824J0() {
        return this.f2620y0;
    }

    /* renamed from: K0 */
    public float m38823K0() {
        return this.f2618w0;
    }

    /* renamed from: L0 */
    public void m38822L0(int i) {
        if (i > -1) {
            this.f2618w0 = -1.0f;
            this.f2619x0 = i;
            this.f2620y0 = -1;
        }
    }

    /* renamed from: M0 */
    public void m38821M0(int i) {
        if (i > -1) {
            this.f2618w0 = -1.0f;
            this.f2619x0 = -1;
            this.f2620y0 = i;
        }
    }

    /* renamed from: N0 */
    public void m38820N0(float f) {
        if (f > -1.0f) {
            this.f2618w0 = f;
            this.f2619x0 = -1;
            this.f2620y0 = -1;
        }
    }

    /* renamed from: O0 */
    public void m38819O0(int i) {
        if (this.f35386A0 != i) {
            this.f35386A0 = i;
            this.f35348K.clear();
            if (this.f35386A0 == 1) {
                this.f2621z0 = this.f35339B;
            } else {
                this.f2621z0 = this.f35340C;
            }
            this.f35348K.add(this.f2621z0);
            int length = this.f35347J.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f35347J[i2] = this.f2621z0;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: f */
    public void mo38818f(C13714d dVar) {
        boolean z;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) m38942E();
        if (constraintWidgetContainer != null) {
            C2125d k = constraintWidgetContainer.mo38816k(C2125d.EnumC2127b.LEFT);
            C2125d k2 = constraintWidgetContainer.mo38816k(C2125d.EnumC2127b.RIGHT);
            ConstraintWidget constraintWidget = this.f35351N;
            boolean z2 = true;
            if (constraintWidget == null || constraintWidget.f35350M[0] != ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                z = false;
            } else {
                z = true;
            }
            if (this.f35386A0 == 0) {
                k = constraintWidgetContainer.mo38816k(C2125d.EnumC2127b.TOP);
                k2 = constraintWidgetContainer.mo38816k(C2125d.EnumC2127b.BOTTOM);
                ConstraintWidget constraintWidget2 = this.f35351N;
                if (constraintWidget2 == null || constraintWidget2.f35350M[1] != ConstraintWidget.EnumC2121b.WRAP_CONTENT) {
                    z2 = false;
                }
                z = z2;
            }
            if (this.f2619x0 != -1) {
                C13722h q = dVar.m2910q(this.f2621z0);
                dVar.m2922e(q, dVar.m2910q(k), this.f2619x0, 8);
                if (z) {
                    dVar.m2919h(dVar.m2910q(k2), q, 0, 5);
                }
            } else if (this.f2620y0 != -1) {
                C13722h q2 = dVar.m2910q(this.f2621z0);
                C13722h q3 = dVar.m2910q(k2);
                dVar.m2922e(q2, q3, -this.f2620y0, 8);
                if (z) {
                    dVar.m2919h(q2, dVar.m2910q(k), 0, 5);
                    dVar.m2919h(q3, q2, 0, 5);
                }
            } else if (this.f2618w0 != -1.0f) {
                dVar.m2923d(C13714d.m2908s(dVar, dVar.m2910q(this.f2621z0), dVar.m2910q(k2), this.f2618w0));
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: g */
    public boolean mo38817g() {
        return true;
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: k */
    public C2125d mo38816k(C2125d.EnumC2127b bVar) {
        switch (C2129a.f2622a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f35386A0 == 1) {
                    return this.f2621z0;
                }
                break;
            case 3:
            case 4:
                if (this.f35386A0 == 0) {
                    return this.f2621z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
