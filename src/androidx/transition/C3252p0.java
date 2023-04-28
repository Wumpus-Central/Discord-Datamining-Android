package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.C2733w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.p0 */
/* loaded from: classes.dex */
public class C3252p0 {

    /* renamed from: a */
    private static final C3194c1 f5140a;

    /* renamed from: b */
    static final Property<View, Float> f5141b;

    /* renamed from: c */
    static final Property<View, Rect> f5142c;

    /* renamed from: androidx.transition.p0$a */
    /* loaded from: classes.dex */
    static class C3253a extends Property<View, Float> {
        C3253a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C3252p0.m34854c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C3252p0.m34849h(view, f.floatValue());
        }
    }

    /* renamed from: androidx.transition.p0$b */
    /* loaded from: classes.dex */
    static class C3254b extends Property<View, Rect> {
        C3254b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C2733w0.m36983u(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C2733w0.m36976x0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f5140a = new C3189b1();
        } else {
            f5140a = new C3186a1();
        }
        f5141b = new C3253a(Float.class, "translationAlpha");
        f5142c = new C3254b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m34856a(View view) {
        f5140a.mo34836a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC3249o0 m34855b(View view) {
        return new C3247n0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m34854c(View view) {
        return f5140a.mo34835b(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static AbstractC3225g1 m34853d(View view) {
        return new C3216f1(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m34852e(View view) {
        f5140a.mo34834c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m34851f(View view, Matrix matrix) {
        f5140a.mo34825d(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m34850g(View view, int i, int i2, int i3, int i4) {
        f5140a.mo34818e(view, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m34849h(View view, float f) {
        f5140a.mo34833f(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m34848i(View view, int i) {
        f5140a.mo34953g(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m34847j(View view, Matrix matrix) {
        f5140a.mo34824h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m34846k(View view, Matrix matrix) {
        f5140a.mo34823i(view, matrix);
    }
}
