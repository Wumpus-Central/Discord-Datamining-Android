package p385vb;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p422xb.AbstractC14061n;
import p422xb.C14038g;
import p422xb.C14045k;

/* renamed from: vb.a */
/* loaded from: classes3.dex */
public class C13486a extends Drawable implements AbstractC14061n {

    /* renamed from: k */
    private C13487b f30120k;

    /* renamed from: a */
    public C13486a mutate() {
        this.f30120k = new C13487b(this.f30120k);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C13487b bVar = this.f30120k;
        if (bVar.f30122b) {
            bVar.f30121a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f30120k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f30120k.f30121a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f30120k.f30121a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f30120k.f30121a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C13488b.m3600b(iArr);
        C13487b bVar = this.f30120k;
        if (bVar.f30122b == b) {
            return onStateChange;
        }
        bVar.f30122b = b;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f30120k.f30121a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f30120k.f30121a.setColorFilter(colorFilter);
    }

    @Override // p422xb.AbstractC14061n
    public void setShapeAppearanceModel(C14045k kVar) {
        this.f30120k.f30121a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.f30120k.f30121a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f30120k.f30121a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f30120k.f30121a.setTintMode(mode);
    }

    public C13486a(C14045k kVar) {
        this(new C13487b(new C14038g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vb.a$b */
    /* loaded from: classes3.dex */
    public static final class C13487b extends Drawable.ConstantState {

        /* renamed from: a */
        C14038g f30121a;

        /* renamed from: b */
        boolean f30122b;

        public C13487b(C14038g gVar) {
            this.f30121a = gVar;
            this.f30122b = false;
        }

        /* renamed from: a */
        public C13486a newDrawable() {
            return new C13486a(new C13487b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public C13487b(C13487b bVar) {
            this.f30121a = (C14038g) bVar.f30121a.getConstantState().newDrawable();
            this.f30122b = bVar.f30122b;
        }
    }

    private C13486a(C13487b bVar) {
        this.f30120k = bVar;
    }
}
