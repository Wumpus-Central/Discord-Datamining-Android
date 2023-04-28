package p275p2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C2098d;
import java.util.ArrayList;
import java.util.List;
import p126h2.AbstractC7765j0;
import p126h2.C7742c;
import p126h2.C7748e0;
import p126h2.C7762i;
import p188k2.AbstractC9721a;
import p188k2.C9744q;
import p223m2.C10474e;
import p238n2.C10694b;
import p275p2.C11516e;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: p2.c */
/* loaded from: classes.dex */
public class C11513c extends AbstractC11511b {

    /* renamed from: D */
    private AbstractC9721a<Float, Float> f39039D;

    /* renamed from: E */
    private final List<AbstractC11511b> f39040E = new ArrayList();

    /* renamed from: F */
    private final RectF f39041F = new RectF();

    /* renamed from: G */
    private final RectF f39042G = new RectF();

    /* renamed from: H */
    private final Paint f39043H = new Paint();

    /* renamed from: I */
    private boolean f39044I = true;

    /* renamed from: p2.c$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C11514a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25674a;

        static {
            int[] iArr = new int[C11516e.EnumC11518b.values().length];
            f25674a = iArr;
            try {
                iArr[C11516e.EnumC11518b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25674a[C11516e.EnumC11518b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C11513c(C7748e0 e0Var, C11516e eVar, List<C11516e> list, C7762i iVar) {
        super(e0Var, eVar);
        int i;
        AbstractC11511b bVar;
        C10694b u = eVar.m9481u();
        if (u != null) {
            AbstractC9721a<Float, Float> a = u.mo12624a();
            this.f39039D = a;
            m9519j(a);
            this.f39039D.m15511a(this);
        } else {
            this.f39039D = null;
        }
        C2098d dVar = new C2098d(iVar.m21393k().size());
        int size = list.size() - 1;
        AbstractC11511b bVar2 = null;
        while (true) {
            if (size >= 0) {
                C11516e eVar2 = list.get(size);
                AbstractC11511b v = AbstractC11511b.m9508v(this, eVar2, e0Var, iVar);
                if (v != null) {
                    dVar.m39011m(v.m9506z().m9498d(), v);
                    if (bVar2 != null) {
                        bVar2.m9528J(v);
                        bVar2 = null;
                    } else {
                        this.f39040E.add(0, v);
                        int i2 = C11514a.f25674a[eVar2.m9494h().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            bVar2 = v;
                        }
                    }
                }
                size--;
            }
        }
        for (i = 0; i < dVar.m39008q(); i++) {
            AbstractC11511b bVar3 = (AbstractC11511b) dVar.m39015h(dVar.m39012l(i));
            if (!(bVar3 == null || (bVar = (AbstractC11511b) dVar.m39015h(bVar3.m9506z().m9492j())) == null)) {
                bVar3.m9527L(bVar);
            }
        }
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: I */
    protected void mo9476I(C10474e eVar, int i, List<C10474e> list, C10474e eVar2) {
        for (int i2 = 0; i2 < this.f39040E.size(); i2++) {
            this.f39040E.get(i2).mo9520i(eVar, i, list, eVar2);
        }
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: K */
    public void mo9505K(boolean z) {
        super.mo9505K(z);
        for (AbstractC11511b bVar : this.f39040E) {
            bVar.mo9505K(z);
        }
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: M */
    public void mo9504M(float f) {
        super.mo9504M(f);
        if (this.f39039D != null) {
            f = ((this.f39039D.mo15449h().floatValue() * this.f25662q.m9500b().m21395i()) - this.f25662q.m9500b().m21388p()) / (this.f25661p.m21527G().m21399e() + 0.01f);
        }
        if (this.f39039D == null) {
            f -= this.f25662q.m9484r();
        }
        if (this.f25662q.m9480v() != 0.0f && !"__container".equals(this.f25662q.m9493i())) {
            f /= this.f25662q.m9480v();
        }
        for (int size = this.f39040E.size() - 1; size >= 0; size--) {
            this.f39040E.get(size).mo9504M(f);
        }
    }

    /* renamed from: P */
    public void m9503P(boolean z) {
        this.f39044I = z;
    }

    @Override // p275p2.AbstractC11511b, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t != AbstractC7765j0.f38424E) {
            return;
        }
        if (cVar == null) {
            AbstractC9721a<Float, Float> aVar = this.f39039D;
            if (aVar != null) {
                aVar.m15504n(null);
                return;
            }
            return;
        }
        C9744q qVar = new C9744q(cVar);
        this.f39039D = qVar;
        qVar.m15511a(this);
        m9519j(this.f39039D);
    }

    @Override // p275p2.AbstractC11511b, p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        super.mo9457f(rectF, matrix, z);
        for (int size = this.f39040E.size() - 1; size >= 0; size--) {
            this.f39041F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f39040E.get(size).mo9457f(this.f39041F, this.f25660o, true);
            rectF.union(this.f39041F);
        }
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: u */
    void mo9456u(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C7742c.m21543a("CompositionLayer#draw");
        this.f39042G.set(0.0f, 0.0f, this.f25662q.m9490l(), this.f25662q.m9491k());
        matrix.mapRect(this.f39042G);
        if (!this.f25661p.m21486b0() || this.f39040E.size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f39043H.setAlpha(i);
            C12949j.m4959m(canvas, this.f39042G, this.f39043H);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f39040E.size() - 1; size >= 0; size--) {
            if (this.f39044I || !"__container".equals(this.f25662q.m9493i())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 || this.f39042G.isEmpty()) {
                z3 = true;
            } else {
                z3 = canvas.clipRect(this.f39042G);
            }
            if (z3) {
                this.f39040E.get(size).mo9521h(canvas, matrix, i);
            }
        }
        canvas.restore();
        C7742c.m21542b("CompositionLayer#draw");
    }
}
