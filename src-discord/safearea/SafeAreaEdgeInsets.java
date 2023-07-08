package com.discord.safearea;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/discord/safearea/SafeAreaEdgeInsets;", "", "edgeInsets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "(Lcom/th3rdwave/safeareacontext/EdgeInsets;)V", "topDp", "", "rightDp", "bottomDp", "leftDp", "(FFFF)V", "getBottomDp", "()F", "getLeftDp", "getRightDp", "getTopDp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SafeAreaEdgeInsets {
    public static final Companion Companion = new Companion(null);
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/discord/safearea/SafeAreaEdgeInsets$Companion;", "", "()V", "fromRootView", "Lcom/discord/safearea/SafeAreaEdgeInsets;", "activity", "Landroid/app/Activity;", "fromRootViewAsStableInsets", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SafeAreaEdgeInsets fromRootView(Activity activity) {
            View rootView;
            EdgeInsets e10;
            if (activity == null || (rootView = ActivityExtensionsKt.getRootView(activity)) == null || (e10 = e.e(rootView)) == null) {
                return new SafeAreaEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            return new SafeAreaEdgeInsets(e10);
        }

        public final SafeAreaEdgeInsets fromRootViewAsStableInsets(Activity activity) {
            WindowInsetsCompat windowInsetsCompat;
            if (activity == null || (windowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(activity)) == null) {
                return new SafeAreaEdgeInsets(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            Insets displayCutoutInsets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(windowInsetsCompat, true);
            Insets systemBarInsets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(windowInsetsCompat, true);
            if (Build.VERSION.SDK_INT > 29) {
                return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3394b, systemBarInsets.f3394b)), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3395c), SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3396d, systemBarInsets.f3396d)), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3393a));
            }
            return new SafeAreaEdgeInsets(SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3394b, windowInsetsCompat.i())), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3395c), SizeUtilsKt.getPxToDp(Math.max(displayCutoutInsets.f3396d, windowInsetsCompat.h())), SizeUtilsKt.getPxToDp(displayCutoutInsets.f3393a));
        }
    }

    public SafeAreaEdgeInsets() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

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

    public String toString() {
        float f10 = this.topDp;
        float f11 = this.rightDp;
        float f12 = this.bottomDp;
        float f13 = this.leftDp;
        return "SafeAreaEdgeInsets(topDp=" + f10 + ", rightDp=" + f11 + ", bottomDp=" + f12 + ", leftDp=" + f13 + ")";
    }

    public /* synthetic */ SafeAreaEdgeInsets(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeAreaEdgeInsets(EdgeInsets edgeInsets) {
        this(SizeUtilsKt.getPxToDp((int) edgeInsets.d()), SizeUtilsKt.getPxToDp((int) edgeInsets.c()), SizeUtilsKt.getPxToDp((int) edgeInsets.a()), SizeUtilsKt.getPxToDp((int) edgeInsets.b()));
        q.g(edgeInsets, "edgeInsets");
    }
}
