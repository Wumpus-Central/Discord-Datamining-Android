package com.discord.safearea;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.e;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\b\u001a\u00020\u0004*\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/discord/safearea/DCDSafeAreaUtils;", "", "()V", "getSafeAreaEdgeInsets", "Lcom/discord/safearea/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "view", "Landroid/view/View;", "getStableSafeAreaInsets", "toSafeAreaEdgeInsets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "SafeAreaEdgeInsets", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DCDSafeAreaUtils {
    public static final DCDSafeAreaUtils INSTANCE = new DCDSafeAreaUtils();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/discord/safearea/DCDSafeAreaUtils$SafeAreaEdgeInsets;", "", "topDp", "", "rightDp", "bottomDp", "leftDp", "(FFFF)V", "getBottomDp", "()F", "setBottomDp", "(F)V", "getLeftDp", "setLeftDp", "getRightDp", "setRightDp", "getTopDp", "setTopDp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SafeAreaEdgeInsets {
        private float bottomDp;
        private float leftDp;
        private float rightDp;
        private float topDp;

        public SafeAreaEdgeInsets(float f10, float f11, float f12, float f13) {
            this.topDp = f10;
            this.rightDp = f11;
            this.bottomDp = f12;
            this.leftDp = f13;
        }

        public static /* synthetic */ SafeAreaEdgeInsets copy$default(SafeAreaEdgeInsets safeAreaEdgeInsets, float f10, float f11, float f12, float f13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = safeAreaEdgeInsets.topDp;
            }
            if ((i10 & 2) != 0) {
                f11 = safeAreaEdgeInsets.rightDp;
            }
            if ((i10 & 4) != 0) {
                f12 = safeAreaEdgeInsets.bottomDp;
            }
            if ((i10 & 8) != 0) {
                f13 = safeAreaEdgeInsets.leftDp;
            }
            return safeAreaEdgeInsets.copy(f10, f11, f12, f13);
        }

        public final float component1() {
            return this.topDp;
        }

        public final float component2() {
            return this.rightDp;
        }

        public final float component3() {
            return this.bottomDp;
        }

        public final float component4() {
            return this.leftDp;
        }

        public final SafeAreaEdgeInsets copy(float f10, float f11, float f12, float f13) {
            return new SafeAreaEdgeInsets(f10, f11, f12, f13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SafeAreaEdgeInsets)) {
                return false;
            }
            SafeAreaEdgeInsets safeAreaEdgeInsets = (SafeAreaEdgeInsets) obj;
            return Float.compare(this.topDp, safeAreaEdgeInsets.topDp) == 0 && Float.compare(this.rightDp, safeAreaEdgeInsets.rightDp) == 0 && Float.compare(this.bottomDp, safeAreaEdgeInsets.bottomDp) == 0 && Float.compare(this.leftDp, safeAreaEdgeInsets.leftDp) == 0;
        }

        public final float getBottomDp() {
            return this.bottomDp;
        }

        public final float getLeftDp() {
            return this.leftDp;
        }

        public final float getRightDp() {
            return this.rightDp;
        }

        public final float getTopDp() {
            return this.topDp;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.topDp) * 31) + Float.floatToIntBits(this.rightDp)) * 31) + Float.floatToIntBits(this.bottomDp)) * 31) + Float.floatToIntBits(this.leftDp);
        }

        public final void setBottomDp(float f10) {
            this.bottomDp = f10;
        }

        public final void setLeftDp(float f10) {
            this.leftDp = f10;
        }

        public final void setRightDp(float f10) {
            this.rightDp = f10;
        }

        public final void setTopDp(float f10) {
            this.topDp = f10;
        }

        public String toString() {
            float f10 = this.topDp;
            float f11 = this.rightDp;
            float f12 = this.bottomDp;
            float f13 = this.leftDp;
            return "SafeAreaEdgeInsets(topDp=" + f10 + ", rightDp=" + f11 + ", bottomDp=" + f12 + ", leftDp=" + f13 + ")";
        }
    }

    private DCDSafeAreaUtils() {
    }

    public final SafeAreaEdgeInsets getSafeAreaEdgeInsets(View view) {
        q.g(view, "view");
        EdgeInsets e10 = e.e(view);
        if (e10 != null) {
            return toSafeAreaEdgeInsets(e10);
        }
        return null;
    }

    public final SafeAreaEdgeInsets getStableSafeAreaInsets(View view) {
        q.g(view, "view");
        WindowInsetsCompat y10 = WindowInsetsCompat.y(view.getRootWindowInsets());
        q.f(y10, "toWindowInsetsCompat(view.rootWindowInsets)");
        Insets g10 = y10.g(WindowInsetsCompat.m.a());
        q.f(g10, "insets.getInsetsIgnoring…pat.Type.displayCutout())");
        SafeAreaEdgeInsets safeAreaEdgeInsets = new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(g10.f3273b), SizeUtilsKt.getPxToDp(g10.f3274c), SizeUtilsKt.getPxToDp(g10.f3275d), SizeUtilsKt.getPxToDp(g10.f3272a));
        if (Build.VERSION.SDK_INT > 29) {
            Insets g11 = y10.g(WindowInsetsCompat.m.g());
            q.f(g11, "insets.getInsetsIgnoring…Compat.Type.systemBars())");
            safeAreaEdgeInsets.setTopDp(Math.max(safeAreaEdgeInsets.getTopDp(), SizeUtilsKt.getPxToDp(g11.f3273b)));
            safeAreaEdgeInsets.setBottomDp(Math.max(safeAreaEdgeInsets.getBottomDp(), SizeUtilsKt.getPxToDp(g11.f3275d)));
        } else {
            safeAreaEdgeInsets.setTopDp(Math.max(safeAreaEdgeInsets.getTopDp(), SizeUtilsKt.getPxToDp(y10.i())));
            safeAreaEdgeInsets.setBottomDp(Math.max(safeAreaEdgeInsets.getBottomDp(), SizeUtilsKt.getPxToDp(y10.h())));
        }
        return safeAreaEdgeInsets;
    }

    public final SafeAreaEdgeInsets toSafeAreaEdgeInsets(EdgeInsets edgeInsets) {
        q.g(edgeInsets, "<this>");
        return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp((int) edgeInsets.d()), SizeUtilsKt.getPxToDp((int) edgeInsets.c()), SizeUtilsKt.getPxToDp((int) edgeInsets.a()), SizeUtilsKt.getPxToDp((int) edgeInsets.b()));
    }
}
