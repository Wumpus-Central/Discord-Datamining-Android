package p275p2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p126h2.AbstractC7765j0;
import p126h2.C7748e0;
import p147i2.C8210a;
import p188k2.AbstractC9721a;
import p188k2.C9744q;
import p358u2.C13180c;

/* renamed from: p2.h */
/* loaded from: classes.dex */
public class C11521h extends AbstractC11511b {

    /* renamed from: E */
    private final Paint f39054E;

    /* renamed from: H */
    private final C11516e f39057H;

    /* renamed from: I */
    private AbstractC9721a<ColorFilter, ColorFilter> f39058I;

    /* renamed from: D */
    private final RectF f39053D = new RectF();

    /* renamed from: F */
    private final float[] f39055F = new float[8];

    /* renamed from: G */
    private final Path f39056G = new Path();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11521h(C7748e0 e0Var, C11516e eVar) {
        super(e0Var, eVar);
        C8210a aVar = new C8210a();
        this.f39054E = aVar;
        this.f39057H = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.m9487o());
    }

    @Override // p275p2.AbstractC11511b, p223m2.AbstractC10475f
    /* renamed from: c */
    public <T> void mo9460c(T t, C13180c<T> cVar) {
        super.mo9460c(t, cVar);
        if (t != AbstractC7765j0.f38430K) {
            return;
        }
        if (cVar == null) {
            this.f39058I = null;
        } else {
            this.f39058I = new C9744q(cVar);
        }
    }

    @Override // p275p2.AbstractC11511b, p167j2.AbstractC9467e
    /* renamed from: f */
    public void mo9457f(RectF rectF, Matrix matrix, boolean z) {
        super.mo9457f(rectF, matrix, z);
        this.f39053D.set(0.0f, 0.0f, this.f39057H.m9485q(), this.f39057H.m9486p());
        this.f25660o.mapRect(this.f39053D);
        rectF.set(this.f39053D);
    }

    @Override // p275p2.AbstractC11511b
    /* renamed from: u */
    public void mo9456u(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f39057H.m9487o());
        if (alpha != 0) {
            if (this.f25669x.m15453h() == null) {
                i2 = 100;
            } else {
                i2 = this.f25669x.m15453h().mo15449h().intValue();
            }
            int i3 = (int) ((i / 255.0f) * (((alpha / 255.0f) * i2) / 100.0f) * 255.0f);
            this.f39054E.setAlpha(i3);
            AbstractC9721a<ColorFilter, ColorFilter> aVar = this.f39058I;
            if (aVar != null) {
                this.f39054E.setColorFilter(aVar.mo15449h());
            }
            if (i3 > 0) {
                float[] fArr = this.f39055F;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.f39057H.m9485q();
                float[] fArr2 = this.f39055F;
                fArr2[3] = 0.0f;
                fArr2[4] = this.f39057H.m9485q();
                this.f39055F[5] = this.f39057H.m9486p();
                float[] fArr3 = this.f39055F;
                fArr3[6] = 0.0f;
                fArr3[7] = this.f39057H.m9486p();
                matrix.mapPoints(this.f39055F);
                this.f39056G.reset();
                Path path = this.f39056G;
                float[] fArr4 = this.f39055F;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f39056G;
                float[] fArr5 = this.f39055F;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f39056G;
                float[] fArr6 = this.f39055F;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f39056G;
                float[] fArr7 = this.f39055F;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f39056G;
                float[] fArr8 = this.f39055F;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f39056G.close();
                canvas.drawPath(this.f39056G, this.f39054E);
            }
        }
    }
}
