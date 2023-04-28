package p151i6;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* renamed from: i6.a */
/* loaded from: classes7.dex */
public class C8214a extends ReplacementSpan {

    /* renamed from: k */
    private int f17767k;

    /* renamed from: l */
    private int f17768l;

    /* renamed from: m */
    private Rect f17769m;

    /* renamed from: n */
    private final int f17770n;

    /* renamed from: o */
    private final Paint.FontMetricsInt f17771o = new Paint.FontMetricsInt();

    /* renamed from: p */
    private final Drawable f17772p;

    public C8214a(Drawable drawable, int i) {
        this.f17772p = drawable;
        this.f17770n = i;
        m20305b();
    }

    /* renamed from: a */
    private int m20306a(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.f17770n;
        if (i == 0) {
            return fontMetricsInt.descent - this.f17768l;
        }
        if (i != 2) {
            return -this.f17768l;
        }
        int i2 = fontMetricsInt.descent;
        int i3 = fontMetricsInt.ascent;
        return i3 + (((i2 - i3) - this.f17768l) / 2);
    }

    /* renamed from: b */
    public void m20305b() {
        Rect bounds = this.f17772p.getBounds();
        this.f17769m = bounds;
        this.f17767k = bounds.width();
        this.f17768l = this.f17769m.height();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.f17771o);
        int a = i4 + m20306a(this.f17771o);
        canvas.translate(f, a);
        this.f17772p.draw(canvas);
        canvas.translate(-f, -a);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        m20305b();
        if (fontMetricsInt == null) {
            return this.f17767k;
        }
        int a = m20306a(fontMetricsInt);
        int i3 = this.f17768l + a;
        if (a < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = a;
        }
        if (a < fontMetricsInt.top) {
            fontMetricsInt.top = a;
        }
        if (i3 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i3;
        }
        if (i3 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i3;
        }
        return this.f17767k;
    }
}
