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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002J#\u0010\f\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00070\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/discord/safearea/extensions/ImmersiveMode;", "", "Landroid/app/Activity;", "", "fitSystemWindowsAndAdjustResize", "activity", "enableImmersiveMode", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "onRootViewInsetsUpdated", "addRootViewInsetUpdateCallback$safe_area_release", "(Lkotlin/jvm/functions/Function1;)V", "addRootViewInsetUpdateCallback", "", "rootViewInsetUpdateCallbacks", "Ljava/util/List;", "<init>", "()V", "safe_area_release"}, k = 1, mv = {1, 8, 0})

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
        q.e(view);
        w0.D0(viewGroup, new r0() { 
            @Override 
            public final WindowInsetsCompat a(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat fitSystemWindowsAndAdjustResize$lambda$2;
                fitSystemWindowsAndAdjustResize$lambda$2 = ImmersiveMode.fitSystemWindowsAndAdjustResize$lambda$2(viewGroup, view, view2, windowInsetsCompat);
                return fitSystemWindowsAndAdjustResize$lambda$2;
            }
        });
    }

    
    public static final WindowInsetsCompat fitSystemWindowsAndAdjustResize$lambda$2(ViewGroup viewGroup, View rootViewChild, View view, WindowInsetsCompat insets) {
        q.h(rootViewChild, "$rootViewChild");
        q.h(view, "<anonymous parameter 0>");
        q.h(insets, "insets");
        viewGroup.setFitsSystemWindows(true);
        Iterator<T> it = rootViewInsetUpdateCallbacks.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(insets);
        }
        WindowInsetsCompat a10 = new WindowInsetsCompat.b(insets).b(WindowInsetsCompat.m.g(), Insets.b(0, 0, 0, Math.max(WindowInsetsCompatExtensionsKt.getImeInsets$default(insets, false, 1, null).f2821d, 0))).a();
        w0.c0(rootViewChild, a10);
        return a10;
    }

    public final void addRootViewInsetUpdateCallback$safe_area_release(Function1<? super WindowInsetsCompat, Unit> onRootViewInsetsUpdated) {
        q.h(onRootViewInsetsUpdated, "onRootViewInsetsUpdated");
        rootViewInsetUpdateCallbacks.add(onRootViewInsetsUpdated);
    }

    public final void enableImmersiveMode(Activity activity) {
        q.h(activity, "activity");
        Window window = activity.getWindow();
        q.g(window, "activity.window");
        WindowExtensionsKt.setSystemUITransparent(window);
        fitSystemWindowsAndAdjustResize(activity);
    }
}
