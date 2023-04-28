package p167j2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p188k2.AbstractC9721a;
import p188k2.C9727b;
import p188k2.C9744q;
import p254o2.C11188r;
import p275p2.AbstractC11511b;
import p358u2.C13180c;

/* renamed from: j2.t */
/* loaded from: classes.dex */
public class C9484t extends AbstractC9462a {

    /* renamed from: r */
    private final AbstractC11511b f20981r;

    /* renamed from: s */
    private final String f20982s;

    /* renamed from: t */
    private final boolean f20983t;

    /* renamed from: u */
    private final AbstractC9721a<Integer, Integer> f20984u;

    /* renamed from: v */
    private AbstractC9721a<ColorFilter, ColorFilter> f20985v;

    public C9484t(C7748e0 e0Var, AbstractC11511b bVar, C11188r rVar) {
        super(e0Var, bVar, rVar.m10540b().m10530a(), rVar.m10537e().m10529a(), rVar.m10535g(), rVar.m10533i(), rVar.m10532j(), rVar.m10536f(), rVar.m10538d());
        this.f20981r = bVar;
        this.f20982s = rVar.m10534h();
        this.f20983t = rVar.m10531k();
        AbstractC9721a<Integer, Integer> a = rVar.m10539c().mo12624a();
        this.f20984u = a;
        a.m15511a(this);
        bVar.m9519j(a);
    }

    @Override // p167j2.AbstractC9462a, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t == AbstractC7765j0.f16877b) {
            this.f20984u.m15504n(cVar);
        } else if (t == AbstractC7765j0.f38430K) {
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20985v;
            if (aVar != null) {
                this.f20981r.m9529H(aVar);
            }
            if (cVar == null) {
                this.f20985v = null;
                return;
            }
            C9744q qVar = new C9744q(cVar);
            this.f20985v = qVar;
            qVar.m15511a(this);
            this.f20981r.m9519j(this.f20984u);
        }
    }

    @Override // p167j2.AbstractC9465c
    public String getName() {
        return this.f20982s;
    }

    @Override // p167j2.AbstractC9462a, p167j2.AbstractC9467e
    /* renamed from: h */
    public void mo9521h(Canvas canvas, Matrix matrix, int i) {
        if (!this.f20983t) {
            this.f20852i.setColor(((C9727b) this.f20984u).m15496p());
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f20985v;
            if (aVar != null) {
                this.f20852i.setColorFilter(aVar.mo15449h());
            }
            super.mo9521h(canvas, matrix, i);
        }
    }
}
