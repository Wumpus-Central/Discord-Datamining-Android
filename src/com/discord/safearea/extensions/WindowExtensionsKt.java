package com.discord.safearea.extensions;

import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m15073d2 = {"setSystemUITransparent", "", "Landroid/view/Window;", "safe_area_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class WindowExtensionsKt {
    public static final void setSystemUITransparent(Window window) {
        C9971q.m14633g(window, "<this>");
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }
}
