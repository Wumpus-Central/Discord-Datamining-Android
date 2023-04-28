package p366ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C2367h;
import p083eb.C6812k;

/* renamed from: ub.d */
/* loaded from: classes3.dex */
public class C13243d {

    /* renamed from: a */
    public final ColorStateList f29719a;

    /* renamed from: b */
    public final ColorStateList f29720b;

    /* renamed from: c */
    public final ColorStateList f29721c;

    /* renamed from: d */
    public final String f29722d;

    /* renamed from: e */
    public final int f29723e;

    /* renamed from: f */
    public final int f29724f;

    /* renamed from: g */
    public final boolean f29725g;

    /* renamed from: h */
    public final float f29726h;

    /* renamed from: i */
    public final float f29727i;

    /* renamed from: j */
    public final float f29728j;

    /* renamed from: k */
    public final boolean f29729k;

    /* renamed from: l */
    public final float f29730l;

    /* renamed from: m */
    private ColorStateList f29731m;

    /* renamed from: n */
    private float f29732n;

    /* renamed from: o */
    private final int f29733o;

    /* renamed from: p */
    private boolean f29734p = false;

    /* renamed from: q */
    private Typeface f29735q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.d$a */
    /* loaded from: classes3.dex */
    public class C13244a extends C2367h.AbstractC2372e {

        /* renamed from: a */
        final /* synthetic */ AbstractC13247f f29736a;

        C13244a(AbstractC13247f fVar) {
            this.f29736a = fVar;
        }

        @Override // androidx.core.content.res.C2367h.AbstractC2372e
        /* renamed from: h */
        public void mo4217h(int i) {
            C13243d.this.f29734p = true;
            this.f29736a.mo4214a(i);
        }

        @Override // androidx.core.content.res.C2367h.AbstractC2372e
        /* renamed from: i */
        public void mo4216i(Typeface typeface) {
            C13243d dVar = C13243d.this;
            dVar.f29735q = Typeface.create(typeface, dVar.f29723e);
            C13243d.this.f29734p = true;
            this.f29736a.mo4213b(C13243d.this.f29735q, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ub.d$b */
    /* loaded from: classes3.dex */
    public class C13245b extends AbstractC13247f {

        /* renamed from: a */
        final /* synthetic */ Context f29738a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f29739b;

        /* renamed from: c */
        final /* synthetic */ AbstractC13247f f29740c;

        C13245b(Context context, TextPaint textPaint, AbstractC13247f fVar) {
            this.f29738a = context;
            this.f29739b = textPaint;
            this.f29740c = fVar;
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: a */
        public void mo4214a(int i) {
            this.f29740c.mo4214a(i);
        }

        @Override // p366ub.AbstractC13247f
        /* renamed from: b */
        public void mo4213b(Typeface typeface, boolean z) {
            C13243d.this.m4218p(this.f29738a, this.f29739b, typeface);
            this.f29740c.mo4213b(typeface, z);
        }
    }

    public C13243d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C6812k.f14723f5);
        m4222l(obtainStyledAttributes.getDimension(C6812k.f14731g5, 0.0f));
        m4223k(C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14755j5));
        this.f29719a = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14763k5);
        this.f29720b = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14771l5);
        this.f29723e = obtainStyledAttributes.getInt(C6812k.f14747i5, 0);
        this.f29724f = obtainStyledAttributes.getInt(C6812k.f14739h5, 1);
        int e = C13242c.m4237e(obtainStyledAttributes, C6812k.f14819r5, C6812k.f14811q5);
        this.f29733o = obtainStyledAttributes.getResourceId(e, 0);
        this.f29722d = obtainStyledAttributes.getString(e);
        this.f29725g = obtainStyledAttributes.getBoolean(C6812k.f14827s5, false);
        this.f29721c = C13242c.m4241a(context, obtainStyledAttributes, C6812k.f14779m5);
        this.f29726h = obtainStyledAttributes.getFloat(C6812k.f14787n5, 0.0f);
        this.f29727i = obtainStyledAttributes.getFloat(C6812k.f14795o5, 0.0f);
        this.f29728j = obtainStyledAttributes.getFloat(C6812k.f14803p5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C6812k.f38107J3);
        int i2 = C6812k.f38115K3;
        this.f29729k = obtainStyledAttributes2.hasValue(i2);
        this.f29730l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m4230d() {
        String str;
        if (this.f29735q == null && (str = this.f29722d) != null) {
            this.f29735q = Typeface.create(str, this.f29723e);
        }
        if (this.f29735q == null) {
            int i = this.f29724f;
            if (i == 1) {
                this.f29735q = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f29735q = Typeface.SERIF;
            } else if (i != 3) {
                this.f29735q = Typeface.DEFAULT;
            } else {
                this.f29735q = Typeface.MONOSPACE;
            }
            this.f29735q = Typeface.create(this.f29735q, this.f29723e);
        }
    }

    /* renamed from: m */
    private boolean m4221m(Context context) {
        Typeface typeface;
        if (C13246e.m4215a()) {
            return true;
        }
        int i = this.f29733o;
        if (i != 0) {
            typeface = C2367h.m37987c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface m4229e() {
        m4230d();
        return this.f29735q;
    }

    /* renamed from: f */
    public Typeface m4228f(Context context) {
        if (this.f29734p) {
            return this.f29735q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface h = C2367h.m37982h(context, this.f29733o);
                this.f29735q = h;
                if (h != null) {
                    this.f29735q = Typeface.create(h, this.f29723e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f29722d, e);
            }
        }
        m4230d();
        this.f29734p = true;
        return this.f29735q;
    }

    /* renamed from: g */
    public void m4227g(Context context, TextPaint textPaint, AbstractC13247f fVar) {
        m4218p(context, textPaint, m4229e());
        m4226h(context, new C13245b(context, textPaint, fVar));
    }

    /* renamed from: h */
    public void m4226h(Context context, AbstractC13247f fVar) {
        if (m4221m(context)) {
            m4228f(context);
        } else {
            m4230d();
        }
        int i = this.f29733o;
        if (i == 0) {
            this.f29734p = true;
        }
        if (this.f29734p) {
            fVar.mo4213b(this.f29735q, true);
            return;
        }
        try {
            C2367h.m37980j(context, i, new C13244a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f29734p = true;
            fVar.mo4214a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f29722d, e);
            this.f29734p = true;
            fVar.mo4214a(-3);
        }
    }

    /* renamed from: i */
    public ColorStateList m4225i() {
        return this.f29731m;
    }

    /* renamed from: j */
    public float m4224j() {
        return this.f29732n;
    }

    /* renamed from: k */
    public void m4223k(ColorStateList colorStateList) {
        this.f29731m = colorStateList;
    }

    /* renamed from: l */
    public void m4222l(float f) {
        this.f29732n = f;
    }

    /* renamed from: n */
    public void m4220n(Context context, TextPaint textPaint, AbstractC13247f fVar) {
        int i;
        int i2;
        m4219o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f29731m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f29728j;
        float f2 = this.f29726h;
        float f3 = this.f29727i;
        ColorStateList colorStateList2 = this.f29721c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: o */
    public void m4219o(Context context, TextPaint textPaint, AbstractC13247f fVar) {
        if (m4221m(context)) {
            m4218p(context, textPaint, m4228f(context));
        } else {
            m4227g(context, textPaint, fVar);
        }
    }

    /* renamed from: p */
    public void m4218p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface a = C13250i.m4210a(context, typeface);
        if (a != null) {
            typeface = a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f29723e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f29732n);
        if (this.f29729k) {
            textPaint.setLetterSpacing(this.f29730l);
        }
    }
}
