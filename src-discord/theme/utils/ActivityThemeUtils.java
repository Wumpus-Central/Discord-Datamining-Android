package com.discord.theme.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.discord.theme.DarkTheme;
import com.discord.theme.R;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0002\b\u0006J\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/discord/theme/utils/ActivityThemeUtils;", "", "()V", "updateActivityTheming", "", "Landroid/app/Activity;", "updateActivityTheming$theme_release", "updateWindowBackground", "updateWindowBackground$theme_release", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityThemeUtils {
    public static final ActivityThemeUtils INSTANCE = new ActivityThemeUtils();

    private ActivityThemeUtils() {
    }

    public final void updateActivityTheming$theme_release(Activity activity) {
        q.g(activity, "<this>");
        UpdateSystemUiKt.updateSystemUi(activity);
        updateWindowBackground$theme_release(activity);
    }

    public final void updateWindowBackground$theme_release(Activity activity) {
        int i10;
        int i11;
        q.g(activity, "<this>");
        ThemeManager themeManager = ThemeManager.INSTANCE;
        if (themeManager.isInitialized()) {
            if (!themeManager.shouldShowSplashImage$theme_release()) {
                Window window = activity.getWindow();
                Context applicationContext = activity.getApplicationContext();
                q.f(applicationContext, "applicationContext");
                if (ThemeManagerKt.getTheme() instanceof DarkTheme) {
                    i11 = R.color.primary_660;
                } else {
                    i11 = R.color.primary_160;
                }
                window.setBackgroundDrawable(new ColorDrawable(ColorUtilsKt.getColorCompat(applicationContext, i11)));
                return;
            }
            Window window2 = activity.getWindow();
            if (ThemeManagerKt.getTheme() instanceof DarkTheme) {
                i10 = R.drawable.background_splash_dark;
            } else {
                i10 = R.drawable.background_splash_light;
            }
            window2.setBackgroundDrawableResource(i10);
        }
    }
}
