package p462zb;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p083eb.C6803b;
import p144i.C8096c;

/* renamed from: zb.a */
/* loaded from: classes3.dex */
public class C14615a {

    /* renamed from: a */
    private static final int[] f33080a = {16842752, C6803b.f37991K};

    /* renamed from: b */
    private static final int[] f33081b = {C6803b.f14550x};

    /* renamed from: a */
    private static int m128a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33080a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return resourceId;
        }
        return resourceId2;
    }

    /* renamed from: b */
    private static int m127b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f33081b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m126c(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        int b = m127b(context, attributeSet, i, i2);
        if (!(context instanceof C8096c) || ((C8096c) context).m20619c() != b) {
            z = false;
        } else {
            z = true;
        }
        if (b == 0 || z) {
            return context;
        }
        C8096c cVar = new C8096c(context, b);
        int a = m128a(context, attributeSet);
        if (a != 0) {
            cVar.getTheme().applyStyle(a, true);
        }
        return cVar;
    }
}
