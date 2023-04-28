package p254o2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p223m2.C10469a;
import p343t2.C12945f;
import p343t2.C12948i;

/* renamed from: o2.n */
/* loaded from: classes.dex */
public class C11184n {

    /* renamed from: a */
    private final List<C10469a> f24925a;

    /* renamed from: b */
    private PointF f24926b;

    /* renamed from: c */
    private boolean f24927c;

    public C11184n(PointF pointF, boolean z, List<C10469a> list) {
        this.f24926b = pointF;
        this.f24927c = z;
        this.f24925a = new ArrayList(list);
    }

    /* renamed from: a */
    public List<C10469a> m10557a() {
        return this.f24925a;
    }

    /* renamed from: b */
    public PointF m10556b() {
        return this.f24926b;
    }

    /* renamed from: c */
    public void m10555c(C11184n nVar, C11184n nVar2, float f) {
        boolean z;
        if (this.f24926b == null) {
            this.f24926b = new PointF();
        }
        if (nVar.m10554d() || nVar2.m10554d()) {
            z = true;
        } else {
            z = false;
        }
        this.f24927c = z;
        if (nVar.m10557a().size() != nVar2.m10557a().size()) {
            C12945f.m5009c("Curves must have the same number of control points. Shape 1: " + nVar.m10557a().size() + "\tShape 2: " + nVar2.m10557a().size());
        }
        int min = Math.min(nVar.m10557a().size(), nVar2.m10557a().size());
        if (this.f24925a.size() < min) {
            for (int size = this.f24925a.size(); size < min; size++) {
                this.f24925a.add(new C10469a());
            }
        } else if (this.f24925a.size() > min) {
            for (int size2 = this.f24925a.size() - 1; size2 >= min; size2--) {
                List<C10469a> list = this.f24925a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = nVar.m10556b();
        PointF b2 = nVar2.m10556b();
        m10552f(C12948i.m4974i(b.x, b2.x, f), C12948i.m4974i(b.y, b2.y, f));
        for (int size3 = this.f24925a.size() - 1; size3 >= 0; size3--) {
            C10469a aVar = nVar.m10557a().get(size3);
            C10469a aVar2 = nVar2.m10557a().get(size3);
            PointF a = aVar.m13110a();
            PointF b3 = aVar.m13109b();
            PointF c = aVar.m13108c();
            PointF a2 = aVar2.m13110a();
            PointF b4 = aVar2.m13109b();
            PointF c2 = aVar2.m13108c();
            this.f24925a.get(size3).m13107d(C12948i.m4974i(a.x, a2.x, f), C12948i.m4974i(a.y, a2.y, f));
            this.f24925a.get(size3).m13106e(C12948i.m4974i(b3.x, b4.x, f), C12948i.m4974i(b3.y, b4.y, f));
            this.f24925a.get(size3).m13105f(C12948i.m4974i(c.x, c2.x, f), C12948i.m4974i(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean m10554d() {
        return this.f24927c;
    }

    /* renamed from: e */
    public void m10553e(boolean z) {
        this.f24927c = z;
    }

    /* renamed from: f */
    public void m10552f(float f, float f2) {
        if (this.f24926b == null) {
            this.f24926b = new PointF();
        }
        this.f24926b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f24925a.size() + "closed=" + this.f24927c + '}';
    }

    public C11184n() {
        this.f24925a = new ArrayList();
    }
}
