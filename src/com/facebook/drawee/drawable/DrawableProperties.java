package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public class DrawableProperties {

    /* renamed from: a */
    private int f7683a = -1;

    /* renamed from: b */
    private boolean f7684b = false;

    /* renamed from: c */
    private ColorFilter f7685c = null;

    /* renamed from: d */
    private int f7686d = -1;

    /* renamed from: e */
    private int f7687e = -1;

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void m31852a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            int i = this.f7683a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f7684b) {
                drawable.setColorFilter(this.f7685c);
            }
            int i2 = this.f7686d;
            boolean z2 = true;
            if (i2 != -1) {
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            int i3 = this.f7687e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z2 = false;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }

    /* renamed from: b */
    public void m31851b(int i) {
        this.f7683a = i;
    }

    /* renamed from: c */
    public void m31850c(ColorFilter colorFilter) {
        boolean z;
        this.f7685c = colorFilter;
        if (colorFilter != null) {
            z = true;
        } else {
            z = false;
        }
        this.f7684b = z;
    }

    /* renamed from: d */
    public void m31849d(boolean z) {
        this.f7686d = z ? 1 : 0;
    }

    /* renamed from: e */
    public void m31848e(boolean z) {
        this.f7687e = z ? 1 : 0;
    }
}
