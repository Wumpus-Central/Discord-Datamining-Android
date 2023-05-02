package com.discord.safearea.extensions;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.r0;
import androidx.core.view.w0;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.safearea.extensions.ImmersiveMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\f\u0010\r\u001a\u00020\u0007*\u00020\fH\u0002R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/safearea/extensions/ImmersiveMode;", "", "()V", "rootViewInsetUpdateCallbacks", "", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "", "addRootViewInsetUpdateCallback", "onRootViewInsetsUpdated", "enableImmersiveMode", "activity", "Landroid/app/Activity;", "fitSystemWindowsAndAdjustResize", "safe_area_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImmersiveMode {
    public static final ImmersiveMode INSTANCE = new ImmersiveMode();
    private static List<Function1<WindowInsetsCompat, Unit>> rootViewInsetUpdateCallbacks = new ArrayList();

    private ImmersiveMode() {
    }

    private final void fitSystemWindowsAndAdjustResize(Activity activity) {
        final ViewGroup viewGroup;
        View rootView = ActivityExtensionsKt.getRootView(activity);
        final View view = null;
        if (rootView instanceof ViewGroup) {
            viewGroup = (ViewGroup) rootView;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            view = viewGroup.getChildAt(0);
        }
        q.d(view);
        w0.D0(viewGroup, new r0() { // from class: m3.a
            @Override // androidx.core.view.r0
            public final WindowInsetsCompat a(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat fitSystemWindowsAndAdjustResize$lambda$2;
                fitSystemWindowsAndAdjustResize$lambda$2 = ImmersiveMode.fitSystemWindowsAndAdjustResize$lambda$2(viewGroup, view, view2, windowInsetsCompat);
                return fitSystemWindowsAndAdjustResize$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat fitSystemWindowsAndAdjustResize$lambda$2(ViewGroup viewGroup, View rootViewChild, View view, WindowInsetsCompat insets) {
        q.g(rootViewChild, "$rootViewChild");
        q.g(view, "<anonymous parameter 0>");
        q.g(insets, "insets");
        viewGroup.setFitsSystemWindows(true);
        int max = Math.max(insets.f(WindowInsetsCompat.m.b()).f3329d, 0);
        Iterator<T> it = rootViewInsetUpdateCallbacks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(insets);
        }
        WindowInsetsCompat a10 = new WindowInsetsCompat.b(insets).b(WindowInsetsCompat.m.g(), Insets.b(0, 0, 0, max)).a();
        w0.c0(rootViewChild, a10);
        return a10;
    }

    public final void addRootViewInsetUpdateCallback(Function1<? super WindowInsetsCompat, Unit> onRootViewInsetsUpdated) {
        q.g(onRootViewInsetsUpdated, "onRootViewInsetsUpdated");
        rootViewInsetUpdateCallbacks.add(onRootViewInsetsUpdated);
    }

    public final void enableImmersiveMode(Activity activity) {
        q.g(activity, "activity");
        Window window = activity.getWindow();
        q.f(window, "activity.window");
        WindowExtensionsKt.setSystemUITransparent(window);
        fitSystemWindowsAndAdjustResize(activity);
    }
}
