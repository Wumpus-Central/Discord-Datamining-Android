package p432y0;

import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C2125d;
import androidx.constraintlayout.solver.widgets.C2128e;
import androidx.constraintlayout.solver.widgets.C2130f;
import androidx.constraintlayout.solver.widgets.C2131g;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import p391w0.C13714d;
import p411x0.AbstractC13919a;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public class C14201b {

    /* renamed from: a */
    private final ArrayList<ConstraintWidget> f32051a = new ArrayList<>();

    /* renamed from: b */
    private C14202a f32052b = new C14202a();

    /* renamed from: c */
    private ConstraintWidgetContainer f32053c;

    /* renamed from: y0.b$a */
    /* loaded from: classes.dex */
    public static class C14202a {

        /* renamed from: a */
        public ConstraintWidget.EnumC2121b f32054a;

        /* renamed from: b */
        public ConstraintWidget.EnumC2121b f32055b;

        /* renamed from: c */
        public int f32056c;

        /* renamed from: d */
        public int f32057d;

        /* renamed from: e */
        public int f32058e;

        /* renamed from: f */
        public int f32059f;

        /* renamed from: g */
        public int f32060g;

        /* renamed from: h */
        public boolean f32061h;

        /* renamed from: i */
        public boolean f32062i;

        /* renamed from: j */
        public boolean f32063j;
    }

    /* renamed from: y0.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0461b {
        /* renamed from: a */
        void mo1397a();

        /* renamed from: b */
        void mo1396b(ConstraintWidget constraintWidget, C14202a aVar);
    }

    public C14201b(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32053c = constraintWidgetContainer;
    }

    /* renamed from: a */
    private boolean m1402a(AbstractC0461b bVar, ConstraintWidget constraintWidget, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f32052b.f32054a = constraintWidget.m38883w();
        this.f32052b.f32055b = constraintWidget.m38935K();
        this.f32052b.f32056c = constraintWidget.m38932N();
        this.f32052b.f32057d = constraintWidget.m38889t();
        C14202a aVar = this.f32052b;
        aVar.f32062i = false;
        aVar.f32063j = z;
        ConstraintWidget.EnumC2121b bVar2 = aVar.f32054a;
        ConstraintWidget.EnumC2121b bVar3 = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (aVar.f32055b == bVar3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 || constraintWidget.f35354Q <= 0.0f) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z3 || constraintWidget.f35354Q <= 0.0f) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z4 && constraintWidget.f2545n[0] == 4) {
            aVar.f32054a = ConstraintWidget.EnumC2121b.FIXED;
        }
        if (z5 && constraintWidget.f2545n[1] == 4) {
            aVar.f32055b = ConstraintWidget.EnumC2121b.FIXED;
        }
        bVar.mo1396b(constraintWidget, aVar);
        constraintWidget.m38947B0(this.f32052b.f32058e);
        constraintWidget.m38915e0(this.f32052b.f32059f);
        constraintWidget.m38917d0(this.f32052b.f32061h);
        constraintWidget.m38923Y(this.f32052b.f32060g);
        C14202a aVar2 = this.f32052b;
        aVar2.f32063j = false;
        return aVar2.f32062i;
    }

    /* renamed from: b */
    private void m1401b(ConstraintWidgetContainer constraintWidgetContainer) {
        int size = constraintWidgetContainer.f31384w0.size();
        AbstractC0461b S0 = constraintWidgetContainer.m38866S0();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f31384w0.get(i);
            if (!(constraintWidget instanceof C2128e) && (!constraintWidget.f2527e.f32114e.f32084j || !constraintWidget.f2529f.f32114e.f32084j)) {
                ConstraintWidget.EnumC2121b q = constraintWidget.m38895q(0);
                boolean z = true;
                ConstraintWidget.EnumC2121b q2 = constraintWidget.m38895q(1);
                ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                if (q != bVar || constraintWidget.f2541l == 1 || q2 != bVar || constraintWidget.f2543m == 1) {
                    z = false;
                }
                if (!z) {
                    m1402a(S0, constraintWidget, false);
                    Metrics metrics = constraintWidgetContainer.f35365B0;
                    if (metrics != null) {
                        metrics.f2492a++;
                    }
                }
            }
        }
        S0.mo1397a();
    }

    /* renamed from: c */
    private void m1400c(ConstraintWidgetContainer constraintWidgetContainer, String str, int i, int i2) {
        int C = constraintWidgetContainer.m38946C();
        int B = constraintWidgetContainer.m38948B();
        constraintWidgetContainer.m38892r0(0);
        constraintWidgetContainer.m38894q0(0);
        constraintWidgetContainer.m38947B0(i);
        constraintWidgetContainer.m38915e0(i2);
        constraintWidgetContainer.m38892r0(C);
        constraintWidgetContainer.m38894q0(B);
        this.f32053c.mo2319H0();
    }

    /* renamed from: d */
    public long m1399d(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10;
        boolean z;
        boolean z2;
        boolean z3;
        int i11;
        Metrics metrics;
        AbstractC0461b S0 = constraintWidgetContainer.m38866S0();
        int size = constraintWidgetContainer.f31384w0.size();
        int N = constraintWidgetContainer.m38932N();
        int t = constraintWidgetContainer.m38889t();
        boolean b = C2130f.m38814b(i, 128);
        boolean z4 = b || C2130f.m38814b(i, 64);
        if (z4) {
            for (int i12 = 0; i12 < size; i12++) {
                ConstraintWidget constraintWidget = constraintWidgetContainer.f31384w0.get(i12);
                ConstraintWidget.EnumC2121b w = constraintWidget.m38883w();
                ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
                boolean z5 = (w == bVar) && (constraintWidget.m38935K() == bVar) && constraintWidget.m38893r() > 0.0f;
                if ((constraintWidget.m38926T() && z5) || ((constraintWidget.m38924V() && z5) || (constraintWidget instanceof C2131g) || constraintWidget.m38926T() || constraintWidget.m38924V())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && (metrics = C13714d.f30634r) != null) {
            metrics.f2494c++;
        }
        int i13 = 2;
        if (z4 && ((i4 == 1073741824 && i6 == 1073741824) || b)) {
            int min = Math.min(constraintWidgetContainer.m38950A(), i5);
            int min2 = Math.min(constraintWidgetContainer.m38877z(), i7);
            if (i4 == 1073741824 && constraintWidgetContainer.m38932N() != min) {
                constraintWidgetContainer.m38947B0(min);
                constraintWidgetContainer.m38864U0();
            }
            if (i6 == 1073741824 && constraintWidgetContainer.m38889t() != min2) {
                constraintWidgetContainer.m38915e0(min2);
                constraintWidgetContainer.m38864U0();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                z = constraintWidgetContainer.m38870O0(b);
                i10 = 2;
            } else {
                boolean P0 = constraintWidgetContainer.m38869P0(b);
                if (i4 == 1073741824) {
                    z3 = P0 & constraintWidgetContainer.m38868Q0(b, 0);
                    i11 = 1;
                } else {
                    z3 = P0;
                    i11 = 0;
                }
                if (i6 == 1073741824) {
                    z = constraintWidgetContainer.m38868Q0(b, 1) & z3;
                    i10 = i11 + 1;
                } else {
                    i10 = i11;
                    z = z3;
                }
            }
            if (z) {
                constraintWidgetContainer.mo38875F0(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            z = false;
            i10 = 0;
        }
        if (z && i10 == 2) {
            return 0L;
        }
        if (size > 0) {
            m1401b(constraintWidgetContainer);
        }
        int T0 = constraintWidgetContainer.m38865T0();
        int size2 = this.f32051a.size();
        if (size > 0) {
            m1400c(constraintWidgetContainer, "First pass", N, t);
        }
        if (size2 > 0) {
            ConstraintWidget.EnumC2121b w2 = constraintWidgetContainer.m38883w();
            ConstraintWidget.EnumC2121b bVar2 = ConstraintWidget.EnumC2121b.WRAP_CONTENT;
            boolean z6 = w2 == bVar2;
            boolean z7 = constraintWidgetContainer.m38935K() == bVar2;
            int max = Math.max(constraintWidgetContainer.m38932N(), this.f32053c.m38946C());
            int max2 = Math.max(constraintWidgetContainer.m38889t(), this.f32053c.m38948B());
            int i14 = 0;
            boolean z8 = false;
            while (i14 < size2) {
                ConstraintWidget constraintWidget2 = this.f32051a.get(i14);
                if (!(constraintWidget2 instanceof C2131g)) {
                    T0 = T0;
                    N = N;
                    t = t;
                } else {
                    int N2 = constraintWidget2.m38932N();
                    int t2 = constraintWidget2.m38889t();
                    T0 = T0;
                    boolean a = z8 | m1402a(S0, constraintWidget2, true);
                    Metrics metrics2 = constraintWidgetContainer.f35365B0;
                    N = N;
                    t = t;
                    if (metrics2 != null) {
                        metrics2.f2493b++;
                    }
                    int N3 = constraintWidget2.m38932N();
                    int t3 = constraintWidget2.m38889t();
                    if (N3 != N2) {
                        constraintWidget2.m38947B0(N3);
                        if (z6 && constraintWidget2.m38939G() > max) {
                            max = Math.max(max, constraintWidget2.m38939G() + constraintWidget2.mo38816k(C2125d.EnumC2127b.RIGHT).m38838b());
                        }
                        a = true;
                    }
                    if (t3 != t2) {
                        constraintWidget2.m38915e0(t3);
                        if (z7 && constraintWidget2.m38901n() > max2) {
                            max2 = Math.max(max2, constraintWidget2.m38901n() + constraintWidget2.mo38816k(C2125d.EnumC2127b.BOTTOM).m38838b());
                        }
                        a = true;
                    }
                    z8 = a | ((C2131g) constraintWidget2).m38812I0();
                }
                i14++;
                i13 = 2;
            }
            int i15 = N;
            int i16 = t;
            int i17 = 0;
            while (i17 < i13) {
                for (int i18 = 0; i18 < size2; i18++) {
                    ConstraintWidget constraintWidget3 = this.f32051a.get(i18);
                    if ((!(constraintWidget3 instanceof AbstractC13919a) || (constraintWidget3 instanceof C2131g)) && !(constraintWidget3 instanceof C2128e) && constraintWidget3.m38933M() != 8 && ((!constraintWidget3.f2527e.f32114e.f32084j || !constraintWidget3.f2529f.f32114e.f32084j) && !(constraintWidget3 instanceof C2131g))) {
                        int N4 = constraintWidget3.m38932N();
                        int t4 = constraintWidget3.m38889t();
                        int l = constraintWidget3.m38905l();
                        z8 |= m1402a(S0, constraintWidget3, true);
                        Metrics metrics3 = constraintWidgetContainer.f35365B0;
                        i17 = i17;
                        size2 = size2;
                        if (metrics3 != null) {
                            metrics3.f2493b++;
                        }
                        int N5 = constraintWidget3.m38932N();
                        int t5 = constraintWidget3.m38889t();
                        if (N5 != N4) {
                            constraintWidget3.m38947B0(N5);
                            if (z6 && constraintWidget3.m38939G() > max) {
                                max = Math.max(max, constraintWidget3.m38939G() + constraintWidget3.mo38816k(C2125d.EnumC2127b.RIGHT).m38838b());
                            }
                            z8 = true;
                        }
                        if (t5 != t4) {
                            constraintWidget3.m38915e0(t5);
                            if (z7 && constraintWidget3.m38901n() > max2) {
                                max2 = Math.max(max2, constraintWidget3.m38901n() + constraintWidget3.mo38816k(C2125d.EnumC2127b.BOTTOM).m38838b());
                            }
                            z8 = true;
                        }
                        if (constraintWidget3.m38929Q() && l != constraintWidget3.m38905l()) {
                            z8 = true;
                        }
                    } else {
                        i17 = i17;
                        size2 = size2;
                    }
                }
                if (z8) {
                    i15 = i15;
                    i16 = i16;
                    m1400c(constraintWidgetContainer, "intermediate pass", i15, i16);
                    z8 = false;
                } else {
                    i15 = i15;
                    i16 = i16;
                }
                i17++;
                i13 = 2;
                size2 = size2;
            }
            if (z8) {
                m1400c(constraintWidgetContainer, "2nd pass", i15, i16);
                if (constraintWidgetContainer.m38932N() < max) {
                    constraintWidgetContainer.m38947B0(max);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (constraintWidgetContainer.m38889t() < max2) {
                    constraintWidgetContainer.m38915e0(max2);
                    z2 = true;
                }
                if (z2) {
                    m1400c(constraintWidgetContainer, "3rd pass", i15, i16);
                }
            }
            T0 = T0;
        }
        constraintWidgetContainer.m38855d1(T0);
        return 0L;
    }

    /* renamed from: e */
    public void m1398e(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f32051a.clear();
        int size = constraintWidgetContainer.f31384w0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f31384w0.get(i);
            ConstraintWidget.EnumC2121b w = constraintWidget.m38883w();
            ConstraintWidget.EnumC2121b bVar = ConstraintWidget.EnumC2121b.MATCH_CONSTRAINT;
            if (w != bVar) {
                ConstraintWidget.EnumC2121b w2 = constraintWidget.m38883w();
                ConstraintWidget.EnumC2121b bVar2 = ConstraintWidget.EnumC2121b.MATCH_PARENT;
                if (!(w2 == bVar2 || constraintWidget.m38935K() == bVar || constraintWidget.m38935K() == bVar2)) {
                }
            }
            this.f32051a.add(constraintWidget);
        }
        constraintWidgetContainer.m38864U0();
    }
}
