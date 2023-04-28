package p167j2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p126h2.C7748e0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9743p;
import p223m2.AbstractC10475f;
import p223m2.C10474e;
import p238n2.C10704l;
import p254o2.AbstractC11170c;
import p254o2.C11186p;
import p275p2.AbstractC11511b;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: j2.d */
/* loaded from: classes.dex */
public class C9466d implements AbstractC9467e, AbstractC9476m, AbstractC9721a.AbstractC9722b, AbstractC10475f {

    /* renamed from: a */
    private final Paint f20864a;

    /* renamed from: b */
    private final RectF f20865b;

    /* renamed from: c */
    private final Matrix f20866c;

    /* renamed from: d */
    private final Path f20867d;

    /* renamed from: e */
    private final RectF f20868e;

    /* renamed from: f */
    private final String f20869f;

    /* renamed from: g */
    private final boolean f20870g;

    /* renamed from: h */
    private final List<AbstractC9465c> f20871h;

    /* renamed from: i */
    private final C7748e0 f20872i;

    /* renamed from: j */
    private List<AbstractC9476m> f20873j;

    /* renamed from: k */
    private C9743p f20874k;

    public C9466d(C7748e0 e0Var, AbstractC11511b bVar, C11186p pVar) {
        this(e0Var, bVar, pVar.m10545c(), pVar.m10544d(), m16189g(e0Var, bVar, pVar.m10546b()), m16188j(pVar.m10546b()));
    }

    /* renamed from: g */
    private static List<AbstractC9465c> m16189g(C7748e0 e0Var, AbstractC11511b bVar, List<AbstractC11170c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            AbstractC9465c a = list.get(i).mo10528a(e0Var, bVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    static C10704l m16188j(List<AbstractC11170c> list) {
        for (int i = 0; i < list.size(); i++) {
            AbstractC11170c cVar = list.get(i);
            if (cVar instanceof C10704l) {
                return (C10704l) cVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    private boolean m16185m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f20871h.size(); i2++) {
            if ((this.f20871h.get(i2) instanceof AbstractC9467e) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // p188k2.AbstractC9721a.AbstractC9722b
    /* renamed from: a */
    public void mo9524a() {
        this.f20872i.invalidateSelf();
    }

    @Override // p167j2.AbstractC9465c
    /* renamed from: b */
    public void mo9523b(List<AbstractC9465c> list, List<AbstractC9465c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f20871h.size());
        arrayList.addAll(list);
        for (int size = this.f20871h.size() - 1; size >= 0; size--) {
            AbstractC9465c cVar = this.f20871h.get(size);
            cVar.mo9523b(arrayList, this.f20871h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        C9743p pVar = this.f20874k;
        if (pVar != null) {
            pVar.m15458c(t, cVar);
        }
    }

    @Override // p167j2.AbstractC9476m
    /* renamed from: d */
    public Path mo16163d() {
        this.f20866c.reset();
        C9743p pVar = this.f20874k;
        if (pVar != null) {
            this.f20866c.set(pVar.m15455f());
        }
        this.f20867d.reset();
        if (this.f20870g) {
            return this.f20867d;
        }
        for (int size = this.f20871h.size() - 1; size >= 0; size--) {
            AbstractC9465c cVar = this.f20871h.get(size);
            if (cVar instanceof AbstractC9476m) {
                this.f20867d.addPath(((AbstractC9476m) cVar).mo16163d(), this.f20866c);
            }
        }
        return this.f20867d;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        this.f20866c.set(matrix);
        C9743p pVar = this.f20874k;
        if (pVar != null) {
            this.f20866c.preConcat(pVar.m15455f());
        }
        this.f20868e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f20871h.size() - 1; size >= 0; size--) {
            AbstractC9465c cVar = this.f20871h.get(size);
            if (cVar instanceof AbstractC9467e) {
                ((AbstractC9467e) cVar).mo9457f(this.f20868e, this.f20866c, z);
                rectF.union(this.f20868e);
            }
        }
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20869f;
    }

    @Override // p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.f20870g) {
            this.f20866c.set(matrix);
            C9743p pVar = this.f20874k;
            if (pVar != null) {
                this.f20866c.preConcat(pVar.m15455f());
                if (this.f20874k.m15453h() == null) {
                    i2 = 100;
                } else {
                    i2 = this.f20874k.m15453h().mo15449h().intValue();
                }
                i = (int) ((((i2 / 100.0f) * i) / 255.0f) * 255.0f);
            }
            if (!this.f20872i.m21486b0() || !m16185m() || i == 255) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                this.f20865b.set(0.0f, 0.0f, 0.0f, 0.0f);
                mo9457f(this.f20865b, this.f20866c, true);
                this.f20864a.setAlpha(i);
                C12949j.m4959m(canvas, this.f20865b, this.f20864a);
            }
            if (z) {
                i = 255;
            }
            for (int size = this.f20871h.size() - 1; size >= 0; size--) {
                AbstractC9465c cVar = this.f20871h.get(size);
                if (cVar instanceof AbstractC9467e) {
                    ((AbstractC9467e) cVar).mo9521h(canvas, this.f20866c, i);
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    @Override // p223m2.AbstractC10475f
    /* renamed from: i */
    public void mo9520i(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        if (eVar.m13090g(getName(), i) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.m13096a(getName());
                if (eVar.m13094c(getName(), i)) {
                    list.add(eVar2.m13088i(this));
                }
            }
            if (eVar.m13089h(getName(), i)) {
                int e = i + eVar.m13092e(getName(), i);
                for (int i2 = 0; i2 < this.f20871h.size(); i2++) {
                    AbstractC9465c cVar = this.f20871h.get(i2);
                    if (cVar instanceof AbstractC10475f) {
                        ((AbstractC10475f) cVar).mo9520i(eVar, e, list, eVar2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<AbstractC9476m> m16187k() {
        if (this.f20873j == null) {
            this.f20873j = new ArrayList();
            for (int i = 0; i < this.f20871h.size(); i++) {
                AbstractC9465c cVar = this.f20871h.get(i);
                if (cVar instanceof AbstractC9476m) {
                    this.f20873j.add((AbstractC9476m) cVar);
                }
            }
        }
        return this.f20873j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Matrix m16186l() {
        C9743p pVar = this.f20874k;
        if (pVar != null) {
            return pVar.m15455f();
        }
        this.f20866c.reset();
        return this.f20866c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9466d(C7748e0 e0Var, AbstractC11511b bVar, String str, boolean z, List<AbstractC9465c> list, C10704l lVar) {
        this.f20864a = new C8210a();
        this.f20865b = new RectF();
        this.f20866c = new Matrix();
        this.f20867d = new Path();
        this.f20868e = new RectF();
        this.f20869f = str;
        this.f20872i = e0Var;
        this.f20870g = z;
        this.f20871h = list;
        if (lVar != null) {
            C9743p b = lVar.m12634b();
            this.f20874k = b;
            b.m15460a(bVar);
            this.f20874k.m15459b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC9465c cVar = list.get(size);
            if (cVar instanceof AbstractC9472j) {
                arrayList.add((AbstractC9472j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((AbstractC9472j) arrayList.get(size2)).mo16169g(list.listIterator(list.size()));
        }
    }
}
