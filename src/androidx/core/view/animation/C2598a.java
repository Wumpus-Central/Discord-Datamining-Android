package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.view.animation.a */
/* loaded from: classes.dex */
public final class C2598a {

    /* renamed from: androidx.core.view.animation.a$a */
    /* loaded from: classes.dex */
    static class C0044a {
        /* renamed from: a */
        static PathInterpolator m37289a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        static PathInterpolator m37288b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        static PathInterpolator m37287c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m37291a(float f, float f2, float f3, float f4) {
        return C0044a.m37288b(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m37290b(Path path) {
        return C0044a.m37287c(path);
    }
}
