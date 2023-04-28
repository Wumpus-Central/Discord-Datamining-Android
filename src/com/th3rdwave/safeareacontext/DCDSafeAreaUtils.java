package com.th3rdwave.safeareacontext;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.size.SizeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\f"}, m15073d2 = {"Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;", "", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "d", "Landroid/view/View;", "view", "b", "c", "<init>", "()V", "SafeAreaEdgeInsets", "safe_area_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class DCDSafeAreaUtils {

    /* renamed from: a */
    public static final DCDSafeAreaUtils f12934a = new DCDSafeAreaUtils();

    @Metadata(m15074d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001b"}, m15073d2 = {"Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "F", "d", "()F", "f", "(F)V", "topDp", "b", "c", "setRightDp", "rightDp", "e", "bottomDp", "setLeftDp", "leftDp", "<init>", "(FFFF)V", "safe_area_release"}, m15072k = 1, m15071mv = {1, 8, 0})
    /* loaded from: classes8.dex */
    public static final class SafeAreaEdgeInsets {

        /* renamed from: a */
        private float f12935a;

        /* renamed from: b */
        private float f12936b;

        /* renamed from: c */
        private float f12937c;

        /* renamed from: d */
        private float f12938d;

        public SafeAreaEdgeInsets(float f, float f2, float f3, float f4) {
            this.f12935a = f;
            this.f12936b = f2;
            this.f12937c = f3;
            this.f12938d = f4;
        }

        /* renamed from: a */
        public final float m25790a() {
            return this.f12937c;
        }

        /* renamed from: b */
        public final float m25789b() {
            return this.f12938d;
        }

        /* renamed from: c */
        public final float m25788c() {
            return this.f12936b;
        }

        /* renamed from: d */
        public final float m25787d() {
            return this.f12935a;
        }

        /* renamed from: e */
        public final void m25786e(float f) {
            this.f12937c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SafeAreaEdgeInsets)) {
                return false;
            }
            SafeAreaEdgeInsets safeAreaEdgeInsets = (SafeAreaEdgeInsets) obj;
            return Float.compare(this.f12935a, safeAreaEdgeInsets.f12935a) == 0 && Float.compare(this.f12936b, safeAreaEdgeInsets.f12936b) == 0 && Float.compare(this.f12937c, safeAreaEdgeInsets.f12937c) == 0 && Float.compare(this.f12938d, safeAreaEdgeInsets.f12938d) == 0;
        }

        /* renamed from: f */
        public final void m25785f(float f) {
            this.f12935a = f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.f12935a) * 31) + Float.floatToIntBits(this.f12936b)) * 31) + Float.floatToIntBits(this.f12937c)) * 31) + Float.floatToIntBits(this.f12938d);
        }

        public String toString() {
            float f = this.f12935a;
            float f2 = this.f12936b;
            float f3 = this.f12937c;
            float f4 = this.f12938d;
            return "SafeAreaEdgeInsets(topDp=" + f + ", rightDp=" + f2 + ", bottomDp=" + f3 + ", leftDp=" + f4 + ")";
        }
    }

    private DCDSafeAreaUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final SafeAreaEdgeInsets m25791d(EdgeInsets edgeInsets) {
        return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp((int) edgeInsets.f12939a), SizeUtilsKt.getPxToDp((int) edgeInsets.f12940b), SizeUtilsKt.getPxToDp((int) edgeInsets.f12941c), SizeUtilsKt.getPxToDp((int) edgeInsets.f12942d));
    }

    /* renamed from: b */
    public final SafeAreaEdgeInsets m25793b(View view) {
        C9971q.m14633g(view, "view");
        EdgeInsets c = C6351c.m25779c(view);
        if (c != null) {
            return m25791d(c);
        }
        return null;
    }

    /* renamed from: c */
    public final SafeAreaEdgeInsets m25792c(View view) {
        C9971q.m14633g(view, "view");
        WindowInsetsCompat y = WindowInsetsCompat.m37502y(view.getRootWindowInsets());
        C9971q.m14634f(y, "toWindowInsetsCompat(view.rootWindowInsets)");
        Insets g = y.m37520g(WindowInsetsCompat.C2542m.m37461a());
        C9971q.m14634f(g, "insets.getInsetsIgnoring…pat.Type.displayCutout())");
        SafeAreaEdgeInsets safeAreaEdgeInsets = new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(g.f3327b), SizeUtilsKt.getPxToDp(g.f3328c), SizeUtilsKt.getPxToDp(g.f3329d), SizeUtilsKt.getPxToDp(g.f3326a));
        if (Build.VERSION.SDK_INT > 29) {
            Insets g2 = y.m37520g(WindowInsetsCompat.C2542m.m37455g());
            C9971q.m14634f(g2, "insets.getInsetsIgnoring…Compat.Type.systemBars())");
            safeAreaEdgeInsets.m25785f(Math.max(safeAreaEdgeInsets.m25787d(), SizeUtilsKt.getPxToDp(g2.f3327b)));
            safeAreaEdgeInsets.m25786e(Math.max(safeAreaEdgeInsets.m25790a(), SizeUtilsKt.getPxToDp(g2.f3329d)));
        } else {
            safeAreaEdgeInsets.m25785f(Math.max(safeAreaEdgeInsets.m25787d(), SizeUtilsKt.getPxToDp(y.m37518i())));
            safeAreaEdgeInsets.m25786e(Math.max(safeAreaEdgeInsets.m25790a(), SizeUtilsKt.getPxToDp(y.m37519h())));
        }
        return safeAreaEdgeInsets;
    }
}
