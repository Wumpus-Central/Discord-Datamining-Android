package p345t4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.AbstractC4828p;
import com.facebook.drawee.drawable.AbstractC4829q;
import com.facebook.drawee.drawable.C4816f;

/* renamed from: t4.b */
/* loaded from: classes7.dex */
public class C12958b extends C4816f implements AbstractC4828p {

    /* renamed from: k */
    Drawable f29046k = null;

    /* renamed from: l */
    private AbstractC4829q f29047l;

    public C12958b(Drawable drawable) {
        super(drawable);
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            AbstractC4829q qVar = this.f29047l;
            if (qVar != null) {
                qVar.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.f29046k;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f29046k.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.AbstractC4828p
    /* renamed from: f */
    public void mo4946f(AbstractC4829q qVar) {
        this.f29047l = qVar;
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    /* renamed from: h */
    public void m4945h(Drawable drawable) {
        this.f29046k = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C4816f, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        AbstractC4829q qVar = this.f29047l;
        if (qVar != null) {
            qVar.mo31671a(z);
        }
        return super.setVisible(z, z2);
    }
}
