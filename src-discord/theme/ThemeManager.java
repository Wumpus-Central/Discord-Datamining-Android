package com.discord.theme;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.discord.theme.utils.ActivityThemeUtils;
import com.discord.theme.utils.UpdateSystemUiKt;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\r\u0010\u001e\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006&"}, d2 = {"Lcom/discord/theme/ThemeManager;", "", "()V", "currentTheme", "Lcom/discord/theme/DiscordTheme;", "getCurrentTheme$theme_release", "()Lcom/discord/theme/DiscordTheme;", "setCurrentTheme$theme_release", "(Lcom/discord/theme/DiscordTheme;)V", "<set-?>", "Lcom/discord/theme/DarkTheme;", "darkTheme", "getDarkTheme", "()Lcom/discord/theme/DarkTheme;", "Lcom/discord/theme/LightTheme;", "lightTheme", "getLightTheme", "()Lcom/discord/theme/LightTheme;", "showSplashImage", "", "themeOverride", "getThemeOverride", "setThemeOverride", "init", "", "context", "Landroid/content/Context;", "isInitialized", "setDarkTheme", "setLightTheme", "shouldShowSplashImage", "shouldShowSplashImage$theme_release", "updateSystemUi", "activity", "Landroid/app/Activity;", "view", "Landroid/view/View;", "updateWindowBackground", "theme_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemeManager {
    public static DiscordTheme currentTheme;
    private static DarkTheme darkTheme;
    private static LightTheme lightTheme;
    private static DiscordTheme themeOverride;
    public static final ThemeManager INSTANCE = new ThemeManager();
    private static boolean showSplashImage = true;

    private ThemeManager() {
    }

    public final DiscordTheme getCurrentTheme$theme_release() {
        DiscordTheme discordTheme = currentTheme;
        if (discordTheme != null) {
            return discordTheme;
        }
        q.y("currentTheme");
        return null;
    }

    public final DarkTheme getDarkTheme() {
        DarkTheme darkTheme2 = darkTheme;
        if (darkTheme2 != null) {
            return darkTheme2;
        }
        q.y("darkTheme");
        return null;
    }

    public final LightTheme getLightTheme() {
        LightTheme lightTheme2 = lightTheme;
        if (lightTheme2 != null) {
            return lightTheme2;
        }
        q.y("lightTheme");
        return null;
    }

    public final DiscordTheme getThemeOverride() {
        return themeOverride;
    }

    public final void init(Context context) {
        boolean z10;
        boolean z11;
        q.g(context, "context");
        boolean z12 = true;
        if (lightTheme == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lightTheme = new LightTheme(context);
        }
        if (darkTheme == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            darkTheme = new DarkTheme(context);
        }
        if (currentTheme != null) {
            z12 = false;
        }
        if (z12) {
            setCurrentTheme$theme_release(getDarkTheme());
        }
    }

    public final boolean isInitialized() {
        return currentTheme != null;
    }

    public final void setCurrentTheme$theme_release(DiscordTheme discordTheme) {
        q.g(discordTheme, "<set-?>");
        currentTheme = discordTheme;
    }

    public final void setDarkTheme() {
        setCurrentTheme$theme_release(getDarkTheme());
    }

    public final void setLightTheme() {
        setCurrentTheme$theme_release(getLightTheme());
    }

    public final void setThemeOverride(DiscordTheme discordTheme) {
        themeOverride = discordTheme;
    }

    public final boolean shouldShowSplashImage$theme_release() {
        return showSplashImage;
    }

    public final void updateSystemUi(View view) {
        q.g(view, "view");
        UpdateSystemUiKt.updateSystemUi(view);
    }

    public final void updateWindowBackground(Context context, boolean z10) {
        Activity activity;
        ReactContext reactContext;
        q.g(context, "context");
        showSplashImage = z10;
        Activity activity2 = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
            } else {
                reactContext = null;
            }
            if (reactContext != null) {
                activity2 = reactContext.getCurrentActivity();
            }
        } else {
            activity2 = activity;
        }
        if (activity2 != null) {
            ActivityThemeUtils.INSTANCE.updateWindowBackground$theme_release(activity2);
        }
    }

    public final void updateSystemUi(Activity activity) {
        q.g(activity, "activity");
        UpdateSystemUiKt.updateSystemUi(activity);
    }
}
