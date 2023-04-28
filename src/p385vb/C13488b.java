package p385vb;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: vb.b */
/* loaded from: classes3.dex */
public class C13488b {

    /* renamed from: a */
    public static final boolean f30123a = true;

    /* renamed from: b */
    private static final int[] f30124b = {16842919};

    /* renamed from: c */
    private static final int[] f30125c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f30126d = {16842908};

    /* renamed from: e */
    private static final int[] f30127e = {16843623};

    /* renamed from: f */
    private static final int[] f30128f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f30129g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f30130h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f30131i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f30132j = {16842913};

    /* renamed from: k */
    private static final int[] f30133k = {16842910, 16842919};

    /* renamed from: l */
    static final String f30134l = C13488b.class.getSimpleName();

    private C13488b() {
    }

    /* renamed from: a */
    public static ColorStateList m3601a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f30133k, 0)) != 0) {
            Log.w(f30134l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* renamed from: b */
    public static boolean m3600b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
