package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.c */
/* loaded from: classes.dex */
class C2093c extends Drawable {

    /* renamed from: a */
    private static final double f2409a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static float m39062a(float f, float f2, boolean z) {
        return z ? (float) (f + ((1.0d - f2409a) * f2)) : f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static float m39061b(float f, float f2, boolean z) {
        return z ? (float) ((f * 1.5f) + ((1.0d - f2409a) * f2)) : f * 1.5f;
    }
}
