package com.discord.safearea.extensions;

import android.app.Activity;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"getDisplayCutoutInsets", "Landroidx/core/graphics/Insets;", "Landroidx/core/view/WindowInsetsCompat;", "ignoringVisibility", "", "getImeInsets", "getInsets", "type", "", "getSystemBarInsets", "getWindowInsetsCompat", "Landroid/app/Activity;", "safe_area_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WindowInsetsCompatExtensionsKt {
    public static final Insets getDisplayCutoutInsets(WindowInsetsCompat windowInsetsCompat, boolean z10) {
        q.g(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.m.a(), z10);
    }

    public static /* synthetic */ Insets getDisplayCutoutInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return getDisplayCutoutInsets(windowInsetsCompat, z10);
    }

    public static final Insets getImeInsets(WindowInsetsCompat windowInsetsCompat, boolean z10) {
        q.g(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.m.b(), z10);
    }

    public static /* synthetic */ Insets getImeInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return getImeInsets(windowInsetsCompat, z10);
    }

    private static final Insets getInsets(WindowInsetsCompat windowInsetsCompat, int i10, boolean z10) {
        Insets insets;
        if (z10) {
            insets = windowInsetsCompat.g(i10);
        } else {
            insets = windowInsetsCompat.f(i10);
        }
        q.f(insets, "if (ignoringVisibility) …    getInsets(type)\n    }");
        return insets;
    }

    static /* synthetic */ Insets getInsets$default(WindowInsetsCompat windowInsetsCompat, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return getInsets(windowInsetsCompat, i10, z10);
    }

    public static final Insets getSystemBarInsets(WindowInsetsCompat windowInsetsCompat, boolean z10) {
        q.g(windowInsetsCompat, "<this>");
        return getInsets(windowInsetsCompat, WindowInsetsCompat.m.g(), z10);
    }

    public static /* synthetic */ Insets getSystemBarInsets$default(WindowInsetsCompat windowInsetsCompat, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return getSystemBarInsets(windowInsetsCompat, z10);
    }

    public static final WindowInsetsCompat getWindowInsetsCompat(Activity activity) {
        q.g(activity, "<this>");
        View rootView = ActivityExtensionsKt.getRootView(activity);
        if (rootView != null) {
            return WindowInsetsCompat.y(rootView.getRootWindowInsets());
        }
        return null;
    }
}
