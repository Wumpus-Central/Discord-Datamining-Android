package com.discord.misc.utilities.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.view.r2;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.misc.utilities.coroutines.MainImmediateScopeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.j;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002¨\u0006\n"}, d2 = {"getInsetsController", "Landroidx/core/view/WindowInsetsControllerCompat;", "Landroid/view/Window;", "view", "Landroid/view/View;", "hideKeyboard", "", "Landroid/app/Activity;", "window", "showKeyboard", "misc_utilities_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyboardExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsControllerCompat getInsetsController(Window window, View view) {
        WindowInsetsControllerCompat a10 = r2.a(window, view);
        q.f(a10, "getInsetsController(this, view)");
        return a10;
    }

    public static final void hideKeyboard(Activity activity) {
        q.g(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            q.f(window, "window");
            hideKeyboard(contentView, window);
        }
    }

    public static final void showKeyboard(Activity activity) {
        q.g(activity, "<this>");
        View contentView = ActivityExtensionsKt.getContentView(activity);
        if (contentView != null) {
            Window window = activity.getWindow();
            q.f(window, "window");
            showKeyboard(contentView, window);
        }
    }

    public static final void hideKeyboard(View view, Window window) {
        q.g(view, "<this>");
        q.g(window, "window");
        j.d(MainImmediateScopeKt.MainImmediateScope(), null, null, new KeyboardExtensionsKt$hideKeyboard$1(window, view, null), 3, null);
    }

    public static final void showKeyboard(View view, Window window) {
        q.g(view, "<this>");
        q.g(window, "window");
        j.d(MainImmediateScopeKt.MainImmediateScope(), null, null, new KeyboardExtensionsKt$showKeyboard$1(window, view, null), 3, null);
    }
}
