package p167j2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p223m2.C10469a;
import p254o2.C11183m;
import p254o2.C11184n;
import p275p2.AbstractC11511b;

/* renamed from: j2.q */
/* loaded from: classes.dex */
public class C9481q implements AbstractC9483s, AbstractC9721a.AbstractC9722b {

    /* renamed from: a */
    private final C7748e0 f20970a;

    /* renamed from: b */
    private final String f20971b;

    /* renamed from: c */
    private final AbstractC9721a<Float, Float> f20972c;

    /* renamed from: d */
    private C11184n f20973d;

    public C9481q(C7748e0 e0Var, AbstractC11511b bVar, C11183m mVar) {
        this.f20970a = e0Var;
        this.f20971b = mVar.m10558c();
        AbstractC9721a<Float, Float> a = mVar.m10559b().mo12624a();
        this.f20972c = a;
        bVar.m9519j(a);
        a.m15511a(this);
    }

    /* renamed from: c */
    private static int m16168c(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    /* renamed from: g */
    private static int m16167g(int i, int i2) {
        return i - (m16168c(i, i2) * i2);
    }

    /* renamed from: j */
    private C11184n m16165j(C11184n nVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        List<C10469a> a = nVar.m10557a();
        boolean d = nVar.m10554d();
        int i = 0;
        for (int size = a.size() - 1; size >= 0; size--) {
            C10469a aVar = a.get(size);
            C10469a aVar2 = a.get(m16167g(size - 1, a.size()));
            if (size != 0 || d) {
                pointF = aVar2.m13108c();
            } else {
                pointF = nVar.m10556b();
            }
            if (size != 0 || d) {
                pointF2 = aVar2.m13109b();
            } else {
                pointF2 = pointF;
            }
            PointF a2 = aVar.m13110a();
            if (!nVar.m10554d() && size == 0 && size == a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (!pointF2.equals(pointF) || !a2.equals(pointF) || z) {
                i++;
            } else {
                i += 2;
            }
        }
        C11184n nVar2 = this.f20973d;
        if (nVar2 == null || nVar2.m10557a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new C10469a());
            }
            this.f20973d = new C11184n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f20973d.m10553e(d);
        return this.f20973d;
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20970a.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
    }

    @Override // p167j2.AbstractC9483s
    /* renamed from: e */
    public C11184n mo16162e(C11184n nVar) {
        PointF pointF;
        PointF pointF2;
        boolean z;
        List<C10469a> list;
        List<C10469a> a = nVar.m10557a();
        if (a.size() <= 2) {
            return nVar;
        }
        float floatValue = this.f20972c.mo15449h().floatValue();
        if (floatValue == 0.0f) {
            return nVar;
        }
        C11184n j = m16165j(nVar);
        j.m10552f(nVar.m10556b().x, nVar.m10556b().y);
        List<C10469a> a2 = j.m10557a();
        boolean d = nVar.m10554d();
        int i = 0;
        int i2 = 0;
        while (i < a.size()) {
            C10469a aVar = a.get(i);
            C10469a aVar2 = a.get(m16167g(i - 1, a.size()));
            C10469a aVar3 = a.get(m16167g(i - 2, a.size()));
            if (i != 0 || d) {
                pointF = aVar2.m13108c();
            } else {
                pointF = nVar.m10556b();
            }
            if (i != 0 || d) {
                pointF2 = aVar2.m13109b();
            } else {
                pointF2 = pointF;
            }
            PointF a3 = aVar.m13110a();
            PointF c = aVar3.m13108c();
            PointF c2 = aVar.m13108c();
            if (!nVar.m10554d() && i == 0 && i == a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (!pointF2.equals(pointF) || !a3.equals(pointF) || z) {
                list = a;
                C10469a aVar4 = a2.get(m16167g(i2 - 1, a2.size()));
                aVar4.m13106e(aVar2.m13108c().x, aVar2.m13108c().y);
                aVar4.m13105f(aVar2.m13108c().x, aVar2.m13108c().y);
                a2.get(i2).m13107d(aVar.m13108c().x, aVar.m13108c().y);
            } else {
                float f = pointF.x;
                float f2 = f - c.x;
                float f3 = pointF.y;
                float f4 = c2.x - f;
                list = a;
                float min = Math.min(floatValue / ((float) Math.hypot(f2, f3 - c.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f4, c2.y - f3)), 0.5f);
                float f5 = pointF.x;
                float f6 = ((c.x - f5) * min) + f5;
                float f7 = pointF.y;
                float f8 = ((c.y - f7) * min) + f7;
                float f9 = ((c2.x - f5) * min2) + f5;
                float f10 = ((c2.y - f7) * min2) + f7;
                float f11 = f6 - ((f6 - f5) * 0.5519f);
                float f12 = f8 - ((f8 - f7) * 0.5519f);
                float f13 = f9 - ((f9 - f5) * 0.5519f);
                float f14 = f10 - ((f10 - f7) * 0.5519f);
                C10469a aVar5 = a2.get(m16167g(i2 - 1, a2.size()));
                C10469a aVar6 = a2.get(i2);
                aVar5.m13106e(f6, f8);
                aVar5.m13105f(f6, f8);
                if (i == 0) {
                    j.m10552f(f6, f8);
                }
                aVar6.m13107d(f11, f12);
                i2++;
                aVar6.m13106e(f13, f14);
                aVar6.m13105f(f9, f10);
                a2.get(i2).m13107d(f9, f10);
            }
            i2++;
            i++;
            a = list;
        }
        return j;
    }

    /* renamed from: i */
    public AbstractC9721a<Float, Float> m16166i() {
        return this.f20972c;
    }
}
