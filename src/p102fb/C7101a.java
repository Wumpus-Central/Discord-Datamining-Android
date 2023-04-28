package p102fb;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p237n1.C10689a;
import p237n1.C10690b;
import p237n1.C10691c;

/* renamed from: fb.a */
/* loaded from: classes3.dex */
public class C7101a {

    /* renamed from: a */
    public static final TimeInterpolator f15486a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f15487b = new C10690b();

    /* renamed from: c */
    public static final TimeInterpolator f15488c = new C10689a();

    /* renamed from: d */
    public static final TimeInterpolator f15489d = new C10691c();

    /* renamed from: e */
    public static final TimeInterpolator f15490e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m23399a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m23398b(float f, float f2, float f3, float f4, float f5) {
        return f5 < f3 ? f : f5 > f4 ? f2 : m23399a(f, f2, (f5 - f3) / (f4 - f3));
    }

    /* renamed from: c */
    public static int m23397c(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
