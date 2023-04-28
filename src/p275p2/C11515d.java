package p275p2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p126h2.C7753f0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9744q;
import p343t2.C12949j;
import p358u2.C13180c;

/* renamed from: p2.d */
/* loaded from: classes.dex */
public class C11515d extends AbstractC11511b {

    /* renamed from: D */
    private final Paint f39045D = new C8210a(3);

    /* renamed from: E */
    private final Rect f39046E = new Rect();

    /* renamed from: F */
    private final Rect f39047F = new Rect();

    /* renamed from: G */
    private final C7753f0 f39048G;

    /* renamed from: H */
    private AbstractC9721a<ColorFilter, ColorFilter> f39049H;

    /* renamed from: I */
    private AbstractC9721a<Bitmap, Bitmap> f39050I;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11515d(C7748e0 e0Var, C11516e eVar) {
        super(e0Var, eVar);
        this.f39048G = e0Var.m21515M(eVar.m9489m());
    }

    /* renamed from: P */
    private Bitmap m9502P() {
        Bitmap h;
        AbstractC9721a<Bitmap, Bitmap> aVar = this.f39050I;
        if (aVar != null && (h = aVar.mo15449h()) != null) {
            return h;
        }
        Bitmap E = this.f25661p.m21531E(this.f25662q.m9489m());
        if (E != null) {
            return E;
        }
        C7753f0 f0Var = this.f39048G;
        if (f0Var != null) {
            return f0Var.m21437a();
        }
        return null;
    }

    @Override // p275p2.AbstractC11511b, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t == AbstractC7765j0.f38430K) {
            if (cVar == null) {
                this.f39049H = null;
            } else {
                this.f39049H = new C9744q(cVar);
            }
        } else if (t != AbstractC7765j0.f38433N) {
        } else {
            if (cVar == null) {
                this.f39050I = null;
            } else {
                this.f39050I = new C9744q(cVar);
            }
        }
    }

    @Override // p275p2.AbstractC11511b, p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        super.mo9457f(rectF, matrix, z);
        if (this.f39048G != null) {
            float e = C12949j.m4967e();
            rectF.set(0.0f, 0.0f, this.f39048G.m21433e() * e, this.f39048G.m21435c() * e);
            this.f25660o.mapRect(rectF);
        }
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: u */
    public void mo9456u(Canvas canvas, Matrix matrix, int i) {
        Bitmap P = m9502P();
        if (P != null && !P.isRecycled() && this.f39048G != null) {
            float e = C12949j.m4967e();
            this.f39045D.setAlpha(i);
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f39049H;
            if (aVar != null) {
                this.f39045D.setColorFilter(aVar.mo15449h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f39046E.set(0, 0, P.getWidth(), P.getHeight());
            if (this.f25661p.m21513N()) {
                this.f39047F.set(0, 0, (int) (this.f39048G.m21433e() * e), (int) (this.f39048G.m21435c() * e));
            } else {
                this.f39047F.set(0, 0, (int) (P.getWidth() * e), (int) (P.getHeight() * e));
            }
            canvas.drawBitmap(P, this.f39046E, this.f39047F, this.f39045D);
            canvas.restore();
        }
    }
}
