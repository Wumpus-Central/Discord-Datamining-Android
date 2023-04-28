package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C2517g;

/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes.dex */
public abstract class AbstractC2878h extends ReplacementSpan {

    /* renamed from: l */
    private final C2873f f3885l;

    /* renamed from: k */
    private final Paint.FontMetricsInt f3884k = new Paint.FontMetricsInt();

    /* renamed from: m */
    private short f3886m = -1;

    /* renamed from: n */
    private short f3887n = -1;

    /* renamed from: o */
    private float f3888o = 1.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2878h(C2873f fVar) {
        C2517g.m37587h(fVar, "metadata cannot be null");
        this.f3885l = fVar;
    }

    /* renamed from: a */
    public final C2873f m36403a() {
        return this.f3885l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final int m36402b() {
        return this.f3886m;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3884k);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3884k;
        this.f3888o = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f3885l.m36430e();
        this.f3887n = (short) (this.f3885l.m36430e() * this.f3888o);
        short i3 = (short) (this.f3885l.m36426i() * this.f3888o);
        this.f3886m = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3884k;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
