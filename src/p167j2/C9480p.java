package p167j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p188k2.C9743p;
import p223m2.C10474e;
import p254o2.C11182l;
import p275p2.AbstractC11511b;
import p343t2.C12948i;
import p358u2.C13180c;

/* renamed from: j2.p */
/* loaded from: classes.dex */
public class C9480p implements AbstractC9467e, AbstractC9476m, AbstractC9472j, AbstractC9721a.AbstractC9722b, AbstractC9473k {

    /* renamed from: a */
    private final Matrix f20960a = new Matrix();

    /* renamed from: b */
    private final Path f20961b = new Path();

    /* renamed from: c */
    private final C7748e0 f20962c;

    /* renamed from: d */
    private final AbstractC11511b f20963d;

    /* renamed from: e */
    private final String f20964e;

    /* renamed from: f */
    private final boolean f20965f;

    /* renamed from: g */
    private final AbstractC9721a<Float, Float> f20966g;

    /* renamed from: h */
    private final AbstractC9721a<Float, Float> f20967h;

    /* renamed from: i */
    private final C9743p f20968i;

    /* renamed from: j */
    private C9466d f20969j;

    public C9480p(C7748e0 e0Var, AbstractC11511b bVar, C11182l lVar) {
        this.f20962c = e0Var;
        this.f20963d = bVar;
        this.f20964e = lVar.m10563c();
        this.f20965f = lVar.m10560f();
        AbstractC9721a<Float, Float> a = lVar.m10564b().mo12624a();
        this.f20966g = a;
        bVar.m9519j(a);
        a.m15511a(this);
        AbstractC9721a<Float, Float> a2 = lVar.m10562d().mo12624a();
        this.f20967h = a2;
        bVar.m9519j(a2);
        a2.m15511a(this);
        C9743p b = lVar.m10561e().m12634b();
        this.f20968i = b;
        b.m15460a(bVar);
        b.m15459b(this);
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20962c.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        this.f20969j.mo9523b(list, list2);
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        if (!this.f20968i.m15458c(t, cVar)) {
            if (t == AbstractC7765j0.f16896u) {
                this.f20966g.m15504n(cVar);
            } else if (t == AbstractC7765j0.f16897v) {
                this.f20967h.m15504n(cVar);
            }
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        Path d = this.f20969j.mo16163d();
        this.f20961b.reset();
        float floatValue = this.f20966g.mo15449h().floatValue();
        float floatValue2 = this.f20967h.mo15449h().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f20960a.set(this.f20968i.m15454g(i + floatValue2));
            this.f20961b.addPath(d, this.f20960a);
        }
        return this.f20961b;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        this.f20969j.mo9457f(rectF, matrix, z);
    }

    @Override // p167j2.AbstractC9472j
    /* renamed from: g */
    public void mo16169g(ListIterator<AbstractC9465c> listIterator) {
        if (this.f20969j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f20969j = new C9466d(this.f20962c, this.f20963d, "Repeater", this.f20965f, arrayList, null);
        }
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20964e;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f20966g.mo15449h().floatValue();
        float floatValue2 = this.f20967h.mo15449h().floatValue();
        float floatValue3 = this.f20968i.m15452i().mo15449h().floatValue() / 100.0f;
        float floatValue4 = this.f20968i.m15456e().mo15449h().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f20960a.set(matrix);
            float f = i2;
            this.f20960a.preConcat(this.f20968i.m15454g(f + floatValue2));
            this.f20969j.mo9521h(canvas, this.f20960a, (int) (i * C12948i.m4974i(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        C12948i.m4972k(eVar, i, list, eVar2, this);
    }
}
