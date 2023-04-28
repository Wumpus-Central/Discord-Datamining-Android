package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C2400a;
import androidx.core.view.C2733w0;
import p052d.C6388j;

/* loaded from: classes.dex */
class AppCompatSeekBarHelper extends C1707q {

    /* renamed from: d */
    private final SeekBar f1141d;

    /* renamed from: e */
    private Drawable f1142e;

    /* renamed from: f */
    private ColorStateList f1143f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1144g = null;

    /* renamed from: h */
    private boolean f1145h = false;

    /* renamed from: i */
    private boolean f1146i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.f1141d = seekBar;
    }

    /* renamed from: f */
    private void m40475f() {
        Drawable drawable = this.f1142e;
        if (drawable == null) {
            return;
        }
        if (this.f1145h || this.f1146i) {
            Drawable r = C2400a.m37825r(drawable.mutate());
            this.f1142e = r;
            if (this.f1145h) {
                C2400a.m37828o(r, this.f1143f);
            }
            if (this.f1146i) {
                C2400a.m37827p(this.f1142e, this.f1144g);
            }
            if (this.f1142e.isStateful()) {
                this.f1142e.setState(this.f1141d.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C1707q
    /* renamed from: c */
    public void mo40062c(AttributeSet attributeSet, int i) {
        super.mo40062c(attributeSet, i);
        Context context = this.f1141d.getContext();
        int[] iArr = C6388j.f37879T;
        C1698n1 v = C1698n1.m40105v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1141d;
        C2733w0.m36994o0(seekBar, seekBar.getContext(), iArr, attributeSet, v.m40109r(), i, 0);
        Drawable h = v.m40119h(C6388j.f37883U);
        if (h != null) {
            this.f1141d.setThumb(h);
        }
        m40471j(v.m40120g(C6388j.f37887V));
        int i2 = C6388j.f37895X;
        if (v.m40108s(i2)) {
            this.f1144g = C1709q0.m40054e(v.m40116k(i2, -1), this.f1144g);
            this.f1146i = true;
        }
        int i3 = C6388j.f37891W;
        if (v.m40108s(i3)) {
            this.f1143f = v.m40124c(i3);
            this.f1145h = true;
        }
        v.m40104w();
        m40475f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40474g(Canvas canvas) {
        int i;
        if (this.f1142e != null) {
            int max = this.f1141d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1142e.getIntrinsicWidth();
                int intrinsicHeight = this.f1142e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1142e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1141d.getWidth() - this.f1141d.getPaddingLeft()) - this.f1141d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1141d.getPaddingLeft(), this.f1141d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1142e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m40473h() {
        Drawable drawable = this.f1142e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1141d.getDrawableState())) {
            this.f1141d.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40472i() {
        Drawable drawable = this.f1142e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    void m40471j(Drawable drawable) {
        Drawable drawable2 = this.f1142e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1142e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1141d);
            C2400a.m37830m(drawable, C2733w0.m37063B(this.f1141d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1141d.getDrawableState());
            }
            m40475f();
        }
        this.f1141d.invalidate();
    }
}
