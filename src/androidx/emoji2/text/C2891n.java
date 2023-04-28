package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C2891n extends AbstractC2878h {

    /* renamed from: p */
    private static Paint f3914p;

    public C2891n(C2873f fVar) {
        super(fVar);
    }

    /* renamed from: c */
    private static Paint m36360c() {
        if (f3914p == null) {
            TextPaint textPaint = new TextPaint();
            f3914p = textPaint;
            textPaint.setColor(C2863d.m36464b().m36463c());
            f3914p.setStyle(Paint.Style.FILL);
        }
        return f3914p;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C2863d.m36464b().m36457i()) {
            canvas.drawRect(f, i3, f + m36402b(), i5, m36360c());
        }
        m36403a().m36434a(canvas, f, i4, paint);
    }
}
