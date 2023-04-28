package p402wb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.core.graphics.C2382a;

/* renamed from: wb.a */
/* loaded from: classes3.dex */
public class C13857a {

    /* renamed from: i */
    private static final int[] f31182i = new int[3];

    /* renamed from: j */
    private static final float[] f31183j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final int[] f31184k = new int[4];

    /* renamed from: l */
    private static final float[] f31185l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    private final Paint f31186a;

    /* renamed from: b */
    private final Paint f31187b;

    /* renamed from: c */
    private final Paint f31188c;

    /* renamed from: d */
    private int f31189d;

    /* renamed from: e */
    private int f31190e;

    /* renamed from: f */
    private int f31191f;

    /* renamed from: g */
    private final Path f31192g;

    /* renamed from: h */
    private Paint f31193h;

    public C13857a() {
        this(-16777216);
    }

    /* renamed from: a */
    public void m2532a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.f31192g;
        if (z) {
            int[] iArr = f31184k;
            iArr[0] = 0;
            iArr[1] = this.f31191f;
            iArr[2] = this.f31190e;
            iArr[3] = this.f31189d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = f31184k;
            iArr2[0] = 0;
            iArr2[1] = this.f31189d;
            iArr2[2] = this.f31190e;
            iArr2[3] = this.f31191f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = f31185l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            this.f31187b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f31184k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, this.f31193h);
            }
            canvas.drawArc(rectF, f, f2, true, this.f31187b);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void m2531b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = f31182i;
        iArr[0] = this.f31191f;
        iArr[1] = this.f31190e;
        iArr[2] = this.f31189d;
        Paint paint = this.f31188c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f31183j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f31188c);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint m2530c() {
        return this.f31186a;
    }

    /* renamed from: d */
    public void m2529d(int i) {
        this.f31189d = C2382a.m37920k(i, 68);
        this.f31190e = C2382a.m37920k(i, 20);
        this.f31191f = C2382a.m37920k(i, 0);
        this.f31186a.setColor(this.f31189d);
    }

    public C13857a(int i) {
        this.f31192g = new Path();
        this.f31193h = new Paint();
        this.f31186a = new Paint();
        m2529d(i);
        this.f31193h.setColor(0);
        Paint paint = new Paint(4);
        this.f31187b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31188c = new Paint(paint);
    }
}
