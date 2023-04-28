package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import p007a6.C1271b;

/* renamed from: com.facebook.drawee.drawable.m */
/* loaded from: classes7.dex */
public class C4825m extends AbstractC4824l {
    public C4825m(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.drawable.AbstractC4824l, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (C1271b.m41491d()) {
            C1271b.m41494a("RoundedNinePatchDrawable#draw");
        }
        if (!mo31800h()) {
            super.draw(canvas);
            if (C1271b.m41491d()) {
                C1271b.m41493b();
                return;
            }
            return;
        }
        m31798j();
        m31799i();
        canvas.clipPath(this.f7780o);
        super.draw(canvas);
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }
}
