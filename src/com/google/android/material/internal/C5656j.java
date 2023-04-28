package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes3.dex */
final class C5656j {

    /* renamed from: n */
    static final int f11042n = 1;

    /* renamed from: a */
    private CharSequence f11043a;

    /* renamed from: b */
    private final TextPaint f11044b;

    /* renamed from: c */
    private final int f11045c;

    /* renamed from: e */
    private int f11047e;

    /* renamed from: l */
    private boolean f11054l;

    /* renamed from: d */
    private int f11046d = 0;

    /* renamed from: f */
    private Layout.Alignment f11048f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f11049g = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: h */
    private float f11050h = 0.0f;

    /* renamed from: i */
    private float f11051i = 1.0f;

    /* renamed from: j */
    private int f11052j = f11042n;

    /* renamed from: k */
    private boolean f11053k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f11055m = null;

    /* renamed from: com.google.android.material.internal.j$a */
    /* loaded from: classes3.dex */
    static class C5657a extends Exception {
    }

    private C5656j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f11043a = charSequence;
        this.f11044b = textPaint;
        this.f11045c = i;
        this.f11047e = charSequence.length();
    }

    /* renamed from: b */
    public static C5656j m27864b(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C5656j(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m27865a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f11043a == null) {
            this.f11043a = "";
        }
        int max = Math.max(0, this.f11045c);
        CharSequence charSequence = this.f11043a;
        if (this.f11049g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f11044b, max, this.f11055m);
        }
        int min = Math.min(charSequence.length(), this.f11047e);
        this.f11047e = min;
        if (this.f11054l && this.f11049g == 1) {
            this.f11048f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f11046d, min, this.f11044b, max);
        obtain.setAlignment(this.f11048f);
        obtain.setIncludePad(this.f11053k);
        if (this.f11054l) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f11055m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f11049g);
        float f = this.f11050h;
        if (!(f == 0.0f && this.f11051i == 1.0f)) {
            obtain.setLineSpacing(f, this.f11051i);
        }
        if (this.f11049g > 1) {
            obtain.setHyphenationFrequency(this.f11052j);
        }
        return obtain.build();
    }

    /* renamed from: c */
    public C5656j m27863c(Layout.Alignment alignment) {
        this.f11048f = alignment;
        return this;
    }

    /* renamed from: d */
    public C5656j m27862d(TextUtils.TruncateAt truncateAt) {
        this.f11055m = truncateAt;
        return this;
    }

    /* renamed from: e */
    public C5656j m27861e(int i) {
        this.f11052j = i;
        return this;
    }

    /* renamed from: f */
    public C5656j m27860f(boolean z) {
        this.f11053k = z;
        return this;
    }

    /* renamed from: g */
    public C5656j m27859g(boolean z) {
        this.f11054l = z;
        return this;
    }

    /* renamed from: h */
    public C5656j m27858h(float f, float f2) {
        this.f11050h = f;
        this.f11051i = f2;
        return this;
    }

    /* renamed from: i */
    public C5656j m27857i(int i) {
        this.f11049g = i;
        return this;
    }
}
