package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.b */
/* loaded from: classes.dex */
class C2092b extends Drawable {

    /* renamed from: a */
    private float f2398a;

    /* renamed from: e */
    private float f2402e;

    /* renamed from: h */
    private ColorStateList f2405h;

    /* renamed from: i */
    private PorterDuffColorFilter f2406i;

    /* renamed from: j */
    private ColorStateList f2407j;

    /* renamed from: f */
    private boolean f2403f = false;

    /* renamed from: g */
    private boolean f2404g = true;

    /* renamed from: k */
    private PorterDuff.Mode f2408k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private final Paint f2399b = new Paint(5);

    /* renamed from: c */
    private final RectF f2400c = new RectF();

    /* renamed from: d */
    private final Rect f2401d = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2092b(ColorStateList colorStateList, float f) {
        this.f2398a = f;
        m39067e(colorStateList);
    }

    /* renamed from: a */
    private PorterDuffColorFilter m39071a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m39067e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2405h = colorStateList;
        this.f2399b.setColor(colorStateList.getColorForState(getState(), this.f2405h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m39063i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2400c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2401d.set(rect);
        if (this.f2403f) {
            float b = C2093c.m39061b(this.f2402e, this.f2398a, this.f2404g);
            this.f2401d.inset((int) Math.ceil(C2093c.m39062a(this.f2402e, this.f2398a, this.f2404g)), (int) Math.ceil(b));
            this.f2400c.set(this.f2401d);
        }
    }

    /* renamed from: b */
    public ColorStateList m39070b() {
        return this.f2405h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m39069c() {
        return this.f2402e;
    }

    /* renamed from: d */
    public float m39068d() {
        return this.f2398a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f2399b;
        if (this.f2406i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f2406i);
            z = true;
        }
        RectF rectF = this.f2400c;
        float f = this.f2398a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* renamed from: f */
    public void m39066f(ColorStateList colorStateList) {
        m39067e(colorStateList);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m39065g(float f, boolean z, boolean z2) {
        if (f != this.f2402e || this.f2403f != z || this.f2404g != z2) {
            this.f2402e = f;
            this.f2403f = z;
            this.f2404g = z2;
            m39063i(null);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2401d, this.f2398a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m39064h(float f) {
        if (f != this.f2398a) {
            this.f2398a = f;
            m39063i(null);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2407j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f2405h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m39063i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2405h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f2399b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f2399b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2407j;
        if (colorStateList2 == null || (mode = this.f2408k) == null) {
            return z;
        }
        this.f2406i = m39071a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2399b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2399b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2407j = colorStateList;
        this.f2406i = m39071a(colorStateList, this.f2408k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2408k = mode;
        this.f2406i = m39071a(this.f2407j, mode);
        invalidateSelf();
    }
}
