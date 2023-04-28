package p366ub;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C1698n1;
import p071e.C6525a;

/* renamed from: ub.c */
/* loaded from: classes3.dex */
public class C13242c {
    /* renamed from: a */
    public static ColorStateList m4241a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C6525a.m25365a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: b */
    public static ColorStateList m4240b(Context context, C1698n1 n1Var, int i) {
        int n;
        ColorStateList a;
        if (!n1Var.m40108s(i) || (n = n1Var.m40113n(i, 0)) == 0 || (a = C6525a.m25365a(context, n)) == null) {
            return n1Var.m40124c(i);
        }
        return a;
    }

    /* renamed from: c */
    public static int m4239c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m4238d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C6525a.m25364b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static int m4237e(TypedArray typedArray, int i, int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    /* renamed from: f */
    public static C13243d m4236f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new C13243d(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m4235g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: h */
    public static boolean m4234h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
