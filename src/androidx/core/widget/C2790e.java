package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.e */
/* loaded from: classes.dex */
public final class C2790e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.e$a */
    /* loaded from: classes.dex */
    public static class C2791a {
        /* renamed from: a */
        static void m36716a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.e$b */
    /* loaded from: classes.dex */
    private static class C2792b {
        /* renamed from: a */
        public static EdgeEffect m36715a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m36714b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m36713c(EdgeEffect edgeEffect, float f, float f2) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m36720a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2792b.m36715a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m36719b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2792b.m36714b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m36718c(EdgeEffect edgeEffect, float f, float f2) {
        C2791a.m36716a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m36717d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2792b.m36713c(edgeEffect, f, f2);
        }
        m36718c(edgeEffect, f, f2);
        return f;
    }
}
