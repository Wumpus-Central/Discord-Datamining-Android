package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C2513d;
import java.util.List;

/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public final class C2700s {

    /* renamed from: a */
    private final DisplayCutout f3609a;

    /* renamed from: androidx.core.view.s$a */
    /* loaded from: classes.dex */
    static class C2701a {
        /* renamed from: a */
        static DisplayCutout m37135a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m37134b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        /* renamed from: c */
        static int m37133c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        /* renamed from: d */
        static int m37132d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        /* renamed from: e */
        static int m37131e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        /* renamed from: f */
        static int m37130f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    private C2700s(DisplayCutout displayCutout) {
        this.f3609a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C2700s m37136e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C2700s(displayCutout);
    }

    /* renamed from: a */
    public int m37140a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2701a.m37133c(this.f3609a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m37139b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2701a.m37132d(this.f3609a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m37138c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2701a.m37131e(this.f3609a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m37137d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C2701a.m37130f(this.f3609a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2700s.class != obj.getClass()) {
            return false;
        }
        return C2513d.m37601a(this.f3609a, ((C2700s) obj).f3609a);
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f3609a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3609a + "}";
    }
}
