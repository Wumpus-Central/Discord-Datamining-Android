package p167j2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p223m2.C10474e;
import p254o2.C11179j;
import p254o2.C11192s;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.n */
/* loaded from: classes.dex */
public class C9477n implements AbstractC9476m, AbstractC9721a.AbstractC9722b, AbstractC9473k {

    /* renamed from: b */
    private final String f20934b;

    /* renamed from: c */
    private final C7748e0 f20935c;

    /* renamed from: d */
    private final C11179j.EnumC11180a f20936d;

    /* renamed from: e */
    private final boolean f20937e;

    /* renamed from: f */
    private final boolean f20938f;

    /* renamed from: g */
    private final AbstractC9721a<?, Float> f20939g;

    /* renamed from: h */
    private final AbstractC9721a<?, PointF> f20940h;

    /* renamed from: i */
    private final AbstractC9721a<?, Float> f20941i;

    /* renamed from: j */
    private final AbstractC9721a<?, Float> f20942j;

    /* renamed from: k */
    private final AbstractC9721a<?, Float> f20943k;

    /* renamed from: l */
    private final AbstractC9721a<?, Float> f20944l;

    /* renamed from: m */
    private final AbstractC9721a<?, Float> f20945m;

    /* renamed from: o */
    private boolean f20947o;

    /* renamed from: a */
    private final Path f20933a = new Path();

    /* renamed from: n */
    private final C9464b f20946n = new C9464b();

    /* renamed from: j2.n$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C9478a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20948a;

        static {
            int[] iArr = new int[C11179j.EnumC11180a.values().length];
            f20948a = iArr;
            try {
                iArr[C11179j.EnumC11180a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20948a[C11179j.EnumC11180a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C9477n(C7748e0 e0Var, AbstractC11511b bVar, C11179j jVar) {
        this.f20935c = e0Var;
        this.f20934b = jVar.m10579d();
        C11179j.EnumC11180a j = jVar.m10573j();
        this.f20936d = j;
        this.f20937e = jVar.m10572k();
        this.f20938f = jVar.m10571l();
        AbstractC9721a<Float, Float> a = jVar.m10576g().mo12624a();
        this.f20939g = a;
        AbstractC9721a<PointF, PointF> a2 = jVar.m10575h().mo12624a();
        this.f20940h = a2;
        AbstractC9721a<Float, Float> a3 = jVar.m10574i().mo12624a();
        this.f20941i = a3;
        AbstractC9721a<Float, Float> a4 = jVar.m10578e().mo12624a();
        this.f20943k = a4;
        AbstractC9721a<Float, Float> a5 = jVar.m10577f().mo12624a();
        this.f20945m = a5;
        C11179j.EnumC11180a aVar = C11179j.EnumC11180a.STAR;
        if (j == aVar) {
            this.f20942j = jVar.m10581b().mo12624a();
            this.f20944l = jVar.m10580c().mo12624a();
        } else {
            this.f20942j = null;
            this.f20944l = null;
        }
        bVar.m9519j(a);
        bVar.m9519j(a2);
        bVar.m9519j(a3);
        bVar.m9519j(a4);
        bVar.m9519j(a5);
        if (j == aVar) {
            bVar.m9519j(this.f20942j);
            bVar.m9519j(this.f20944l);
        }
        a.m15511a(this);
        a2.m15511a(this);
        a3.m15511a(this);
        a4.m15511a(this);
        a5.m15511a(this);
        if (j == aVar) {
            this.f20942j.m15511a(this);
            this.f20944l.m15511a(this);
        }
    }

    /* renamed from: g */
    private void m16173g() {
        double d;
        double d2;
        double d3;
        double d4;
        int i;
        int floor = (int) Math.floor(this.f20939g.mo15449h().floatValue());
        AbstractC9721a<?, Float> aVar = this.f20941i;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = aVar.mo15449h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = floor;
        float floatValue = this.f20945m.mo15449h().floatValue() / 100.0f;
        float floatValue2 = this.f20943k.mo15449h().floatValue();
        double d6 = floatValue2;
        float cos = (float) (Math.cos(radians) * d6);
        float sin = (float) (Math.sin(radians) * d6);
        this.f20933a.moveTo(cos, sin);
        double d7 = (float) (6.283185307179586d / d5);
        double d8 = radians + d7;
        double ceil = Math.ceil(d5);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d8) * d6);
            float sin2 = (float) (d6 * Math.sin(d8));
            if (floatValue != 0.0f) {
                d4 = d6;
                i = i2;
                d3 = d8;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d2 = d7;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.f20933a.cubicTo(cos - (cos3 * f), sin - (((float) Math.sin(atan2)) * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d3 = d8;
                d4 = d6;
                d2 = d7;
                this.f20933a.lineTo(cos2, sin2);
            }
            d8 = d3 + d2;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = ceil;
            d6 = d4;
            d7 = d2;
        }
        PointF h = this.f20940h.mo15449h();
        this.f20933a.offset(h.x, h.y);
        this.f20933a.close();
    }

    /* renamed from: j */
    private void m16172j() {
        double d;
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float f10;
        double d4;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float floatValue = this.f20939g.mo15449h().floatValue();
        AbstractC9721a<?, Float> aVar = this.f20941i;
        if (aVar == null) {
            d = 0.0d;
        } else {
            d = aVar.mo15449h().floatValue();
        }
        double radians = Math.toRadians(d - 90.0d);
        double d5 = floatValue;
        float f17 = (float) (6.283185307179586d / d5);
        if (this.f20938f) {
            f17 *= -1.0f;
        }
        float f18 = f17 / 2.0f;
        float f19 = floatValue - ((int) floatValue);
        int i2 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f19) * f18;
        }
        float floatValue2 = this.f20943k.mo15449h().floatValue();
        float floatValue3 = this.f20942j.mo15449h().floatValue();
        AbstractC9721a<?, Float> aVar2 = this.f20944l;
        if (aVar2 != null) {
            f = aVar2.mo15449h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        AbstractC9721a<?, Float> aVar3 = this.f20945m;
        if (aVar3 != null) {
            f2 = aVar3.mo15449h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i2 != 0) {
            f3 = ((floatValue2 - floatValue3) * f19) + floatValue3;
            i = i2;
            double d6 = f3;
            float cos = (float) (d6 * Math.cos(radians));
            f5 = (float) (d6 * Math.sin(radians));
            this.f20933a.moveTo(cos, f5);
            d2 = radians + ((f17 * f19) / 2.0f);
            f4 = cos;
            f6 = f18;
        } else {
            i = i2;
            double d7 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d7);
            float sin = (float) (d7 * Math.sin(radians));
            this.f20933a.moveTo(cos2, sin);
            f4 = cos2;
            f6 = f18;
            d2 = radians + f6;
            f5 = sin;
            f3 = 0.0f;
        }
        double ceil = Math.ceil(d5) * 2.0d;
        int i3 = 0;
        float f20 = f4;
        boolean z = false;
        while (true) {
            double d8 = i3;
            if (d8 < ceil) {
                if (z) {
                    f7 = floatValue2;
                } else {
                    f7 = floatValue3;
                }
                int i4 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
                if (i4 == 0 || d8 != ceil - 2.0d) {
                    f8 = f17;
                    f9 = f6;
                } else {
                    f8 = f17;
                    f9 = (f17 * f19) / 2.0f;
                }
                if (i4 == 0 || d8 != ceil - 1.0d) {
                    d3 = d8;
                    f10 = f3;
                    f3 = f7;
                } else {
                    d3 = d8;
                    f10 = f3;
                }
                double d9 = f3;
                float cos3 = (float) (d9 * Math.cos(d2));
                float sin2 = (float) (d9 * Math.sin(d2));
                if (f == 0.0f && f2 == 0.0f) {
                    this.f20933a.lineTo(cos3, sin2);
                    d4 = d2;
                    f11 = f;
                    f12 = f2;
                } else {
                    f11 = f;
                    double atan2 = (float) (Math.atan2(f5, f20) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f12 = f2;
                    d4 = d2;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f11;
                    } else {
                        f13 = f12;
                    }
                    if (z) {
                        f14 = f12;
                    } else {
                        f14 = f11;
                    }
                    if (z) {
                        f15 = floatValue3;
                    } else {
                        f15 = floatValue2;
                    }
                    if (z) {
                        f16 = floatValue2;
                    } else {
                        f16 = floatValue3;
                    }
                    float f21 = f15 * f13 * 0.47829f;
                    float f22 = cos4 * f21;
                    float f23 = f21 * sin3;
                    float f24 = f16 * f14 * 0.47829f;
                    float f25 = cos5 * f24;
                    float f26 = f24 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f22 *= f19;
                            f23 *= f19;
                        } else if (d3 == ceil - 1.0d) {
                            f25 *= f19;
                            f26 *= f19;
                        }
                    }
                    this.f20933a.cubicTo(f20 - f22, f5 - f23, cos3 + f25, sin2 + f26, cos3, sin2);
                }
                d2 = d4 + f9;
                z = !z;
                i3++;
                f20 = cos3;
                f5 = sin2;
                f2 = f12;
                f = f11;
                f3 = f10;
                f17 = f8;
                ceil = ceil;
            } else {
                PointF h = this.f20940h.mo15449h();
                this.f20933a.offset(h.x, h.y);
                this.f20933a.close();
                return;
            }
        }
    }

    /* renamed from: k */
    private void m16171k() {
        this.f20947o = false;
        this.f20935c.invalidateSelf();
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        m16171k();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC9465c cVar = list.get(i);
            if (cVar instanceof C9485u) {
                C9485u uVar = (C9485u) cVar;
                if (uVar.m16157k() == C11192s.EnumC11193a.SIMULTANEOUSLY) {
                    this.f20946n.m16191a(uVar);
                    uVar.m16161c(this);
                }
            }
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        AbstractC9721a<?, Float> aVar;
        AbstractC9721a<?, Float> aVar2;
        if (t == AbstractC7765j0.f16898w) {
            this.f20939g.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16899x) {
            this.f20941i.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16889n) {
            this.f20940h.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16900y && (aVar2 = this.f20942j) != null) {
            aVar2.m15504n(cVar);
        } else if (t == AbstractC7765j0.f16901z) {
            this.f20943k.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38420A && (aVar = this.f20944l) != null) {
            aVar.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38421B) {
            this.f20945m.m15504n(cVar);
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        if (this.f20947o) {
            return this.f20933a;
        }
        this.f20933a.reset();
        if (this.f20937e) {
            this.f20947o = true;
            return this.f20933a;
        }
        int i = C9478a.f20948a[this.f20936d.ordinal()];
        if (i == 1) {
            m16172j();
        } else if (i == 2) {
            m16173g();
        }
        this.f20933a.close();
        this.f20946n.m16190b(this.f20933a);
        this.f20947o = true;
        return this.f20933a;
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20934b;
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
