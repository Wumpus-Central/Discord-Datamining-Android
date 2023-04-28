package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C1698n1;
import p083eb.C6803b;
import p083eb.C6812k;

/* renamed from: com.google.android.material.internal.m */
/* loaded from: classes3.dex */
public final class C5662m {

    /* renamed from: a */
    private static final int[] f11063a = {C6803b.f14537k};

    /* renamed from: b */
    private static final int[] f11064b = {C6803b.f14538l};

    /* renamed from: a */
    public static void m27845a(Context context) {
        m27841e(context, f11063a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m27844b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38110J6, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C6812k.f38126L6, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C6803b.f14544r, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m27843c(context);
            }
        }
        m27845a(context);
    }

    /* renamed from: c */
    public static void m27843c(Context context) {
        m27841e(context, f11064b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m27842d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6812k.f38110J6, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C6812k.f38134M6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C6812k.f38118K6, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m27840f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m27841e(Context context, int[] iArr, String str) {
        if (!m27839g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m27840f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m27839g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m27838h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27844b(context, attributeSet, i, i2);
        m27842d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C1698n1 m27837i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m27844b(context, attributeSet, i, i2);
        m27842d(context, attributeSet, iArr, i, i2, iArr2);
        return C1698n1.m40105v(context, attributeSet, iArr, i, i2);
    }
}
