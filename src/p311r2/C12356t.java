package p311r2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.C2598a;
import java.lang.ref.WeakReference;
import p126h2.C7762i;
import p331s2.AbstractC12777c;
import p343t2.C12948i;
import p343t2.C12949j;
import p358u2.C13178a;

/* renamed from: r2.t */
/* loaded from: classes.dex */
class C12356t {

    /* renamed from: b */
    private static SparseArrayCompat<WeakReference<Interpolator>> f27743b;

    /* renamed from: a */
    private static final Interpolator f27742a = new LinearInterpolator();

    /* renamed from: c */
    static AbstractC12777c.C12778a f27744c = AbstractC12777c.C12778a.m5511a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    static AbstractC12777c.C12778a f27745d = AbstractC12777c.C12778a.m5511a("x", "y");

    C12356t() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m7088a(int i) {
        WeakReference<Interpolator> f;
        synchronized (C12356t.class) {
            f = m7082g().m39043f(i);
        }
        return f;
    }

    /* renamed from: b */
    private static Interpolator m7087b(PointF pointF, PointF pointF2) {
        Interpolator interpolator;
        Interpolator interpolator2;
        pointF.x = C12948i.m4981b(pointF.x, -1.0f, 1.0f);
        pointF.y = C12948i.m4981b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C12948i.m4981b(pointF2.x, -1.0f, 1.0f);
        float b = C12948i.m4981b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b;
        int i = C12949j.m4963i(pointF.x, pointF.y, pointF2.x, b);
        WeakReference<Interpolator> a = m7088a(i);
        if (a != null) {
            interpolator = a.get();
        } else {
            interpolator = null;
        }
        if (a == null || interpolator == null) {
            try {
                interpolator2 = C2598a.m37291a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator2 = C2598a.m37291a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    interpolator2 = new LinearInterpolator();
                }
            }
            interpolator = interpolator2;
            try {
                m7081h(i, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <T> C13178a<T> m7086c(AbstractC12777c cVar, C7762i iVar, float f, AbstractC12349n0<T> n0Var, boolean z, boolean z2) {
        if (z && z2) {
            return m7084e(iVar, cVar, f, n0Var);
        }
        if (z) {
            return m7085d(iVar, cVar, f, n0Var);
        }
        return m7083f(cVar, f, n0Var);
    }

    /* renamed from: d */
    private static <T> C13178a<T> m7085d(C7762i iVar, AbstractC12777c cVar, float f, AbstractC12349n0<T> n0Var) {
        Interpolator interpolator;
        T t;
        Interpolator interpolator2;
        cVar.mo5492h();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27744c)) {
                case 0:
                    f2 = (float) cVar.mo5486s();
                    break;
                case 1:
                    t3 = n0Var.mo7097a(cVar, f);
                    break;
                case 2:
                    t2 = n0Var.mo7097a(cVar, f);
                    break;
                case 3:
                    pointF = C12354s.m7091e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = C12354s.m7091e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.mo5485t() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF2 = C12354s.m7091e(cVar, f);
                    break;
                case 7:
                    pointF3 = C12354s.m7091e(cVar, f);
                    break;
                default:
                    cVar.mo5494Y();
                    break;
            }
        }
        cVar.mo5489l();
        if (z) {
            interpolator = f27742a;
            t = t3;
        } else {
            if (pointF == null || pointF4 == null) {
                interpolator2 = f27742a;
            } else {
                interpolator2 = m7087b(pointF, pointF4);
            }
            interpolator = interpolator2;
            t = t2;
        }
        C13178a<T> aVar = new C13178a<>(iVar, t3, t, interpolator, f2, null);
        aVar.f29553o = pointF2;
        aVar.f29554p = pointF3;
        return aVar;
    }

    /* renamed from: e */
    private static <T> C13178a<T> m7084e(C7762i iVar, AbstractC12777c cVar, float f, AbstractC12349n0<T> n0Var) {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        Interpolator interpolator3;
        PointF pointF;
        C13178a<T> aVar;
        cVar.mo5492h();
        PointF pointF2 = null;
        boolean z = false;
        PointF pointF3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        T t2 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        float f2 = 0.0f;
        PointF pointF9 = null;
        T t3 = null;
        while (cVar.mo5488p()) {
            switch (cVar.mo5496S(f27744c)) {
                case 0:
                    pointF2 = pointF2;
                    f2 = (float) cVar.mo5486s();
                    break;
                case 1:
                    pointF2 = pointF2;
                    t2 = n0Var.mo7097a(cVar, f);
                    break;
                case 2:
                    pointF2 = pointF2;
                    t3 = n0Var.mo7097a(cVar, f);
                    break;
                case 3:
                    pointF2 = pointF2;
                    f2 = f2;
                    if (cVar.mo5497Q() != AbstractC12777c.EnumC12779b.BEGIN_OBJECT) {
                        pointF3 = C12354s.m7091e(cVar, f);
                        f2 = f2;
                        pointF9 = pointF9;
                        break;
                    } else {
                        cVar.mo5492h();
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        while (cVar.mo5488p()) {
                            int S = cVar.mo5496S(f27745d);
                            if (S == 0) {
                                AbstractC12777c.EnumC12779b Q = cVar.mo5497Q();
                                AbstractC12777c.EnumC12779b bVar = AbstractC12777c.EnumC12779b.NUMBER;
                                if (Q == bVar) {
                                    f5 = (float) cVar.mo5486s();
                                    f3 = f5;
                                } else {
                                    cVar.mo5493g();
                                    f3 = (float) cVar.mo5486s();
                                    f5 = cVar.mo5497Q() == bVar ? (float) cVar.mo5486s() : f3;
                                    cVar.mo5491i();
                                }
                            } else if (S != 1) {
                                cVar.mo5494Y();
                            } else {
                                AbstractC12777c.EnumC12779b Q2 = cVar.mo5497Q();
                                AbstractC12777c.EnumC12779b bVar2 = AbstractC12777c.EnumC12779b.NUMBER;
                                if (Q2 == bVar2) {
                                    f6 = (float) cVar.mo5486s();
                                    f4 = f6;
                                } else {
                                    cVar.mo5493g();
                                    f4 = (float) cVar.mo5486s();
                                    f6 = cVar.mo5497Q() == bVar2 ? (float) cVar.mo5486s() : f4;
                                    cVar.mo5491i();
                                }
                            }
                        }
                        PointF pointF10 = new PointF(f3, f4);
                        PointF pointF11 = new PointF(f5, f6);
                        cVar.mo5489l();
                        pointF6 = pointF11;
                        pointF5 = pointF10;
                        pointF9 = pointF9;
                        break;
                    }
                case 4:
                    if (cVar.mo5497Q() != AbstractC12777c.EnumC12779b.BEGIN_OBJECT) {
                        pointF2 = pointF2;
                        pointF4 = C12354s.m7091e(cVar, f);
                        break;
                    } else {
                        cVar.mo5492h();
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (cVar.mo5488p()) {
                            int S2 = cVar.mo5496S(f27745d);
                            if (S2 != 0) {
                                pointF2 = pointF2;
                                if (S2 != 1) {
                                    cVar.mo5494Y();
                                } else {
                                    AbstractC12777c.EnumC12779b Q3 = cVar.mo5497Q();
                                    AbstractC12777c.EnumC12779b bVar3 = AbstractC12777c.EnumC12779b.NUMBER;
                                    if (Q3 == bVar3) {
                                        f10 = (float) cVar.mo5486s();
                                        f2 = f2;
                                        f8 = f10;
                                    } else {
                                        cVar.mo5493g();
                                        float s = (float) cVar.mo5486s();
                                        f10 = cVar.mo5497Q() == bVar3 ? (float) cVar.mo5486s() : s;
                                        cVar.mo5491i();
                                        f2 = f2;
                                        pointF9 = pointF9;
                                        pointF2 = pointF2;
                                        f8 = s;
                                    }
                                }
                            } else {
                                pointF2 = pointF2;
                                AbstractC12777c.EnumC12779b Q4 = cVar.mo5497Q();
                                AbstractC12777c.EnumC12779b bVar4 = AbstractC12777c.EnumC12779b.NUMBER;
                                if (Q4 == bVar4) {
                                    f9 = (float) cVar.mo5486s();
                                    f2 = f2;
                                    f7 = f9;
                                } else {
                                    cVar.mo5493g();
                                    f7 = (float) cVar.mo5486s();
                                    f9 = cVar.mo5497Q() == bVar4 ? (float) cVar.mo5486s() : f7;
                                    cVar.mo5491i();
                                    f2 = f2;
                                }
                            }
                            pointF9 = pointF9;
                        }
                        pointF2 = pointF2;
                        f2 = f2;
                        PointF pointF12 = new PointF(f7, f8);
                        PointF pointF13 = new PointF(f9, f10);
                        cVar.mo5489l();
                        pointF8 = pointF13;
                        pointF7 = pointF12;
                        break;
                    }
                case 5:
                    if (cVar.mo5485t() == 1) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                    }
                case 6:
                    pointF9 = C12354s.m7091e(cVar, f);
                    continue;
                case 7:
                    pointF2 = C12354s.m7091e(cVar, f);
                    continue;
                default:
                    pointF2 = pointF2;
                    cVar.mo5494Y();
                    break;
            }
        }
        cVar.mo5489l();
        if (z) {
            interpolator3 = f27742a;
            t = t2;
        } else {
            if (pointF3 != null && pointF4 != null) {
                interpolator3 = m7087b(pointF3, pointF4);
            } else if (pointF5 == null || pointF6 == null || pointF7 == null || pointF8 == null) {
                interpolator3 = f27742a;
            } else {
                interpolator2 = m7087b(pointF5, pointF7);
                interpolator = m7087b(pointF6, pointF8);
                t = t3;
                interpolator3 = null;
                if (interpolator2 != null || interpolator == null) {
                    pointF = pointF9;
                    aVar = new C13178a<>(iVar, t2, t, interpolator3, f2, null);
                } else {
                    pointF = pointF9;
                    aVar = new C13178a<>(iVar, t2, t, interpolator2, interpolator, f2, null);
                }
                aVar.f29553o = pointF;
                aVar.f29554p = pointF2;
                return aVar;
            }
            t = t3;
        }
        interpolator2 = null;
        interpolator = null;
        if (interpolator2 != null) {
        }
        pointF = pointF9;
        aVar = new C13178a<>(iVar, t2, t, interpolator3, f2, null);
        aVar.f29553o = pointF;
        aVar.f29554p = pointF2;
        return aVar;
    }

    /* renamed from: f */
    private static <T> C13178a<T> m7083f(AbstractC12777c cVar, float f, AbstractC12349n0<T> n0Var) {
        return new C13178a<>(n0Var.mo7097a(cVar, f));
    }

    /* renamed from: g */
    private static SparseArrayCompat<WeakReference<Interpolator>> m7082g() {
        if (f27743b == null) {
            f27743b = new SparseArrayCompat<>();
        }
        return f27743b;
    }

    /* renamed from: h */
    private static void m7081h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (C12356t.class) {
            f27743b.m39039l(i, weakReference);
        }
    }
}
