package com.discord.theme;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Theme", "Lcom/discord/theme/DiscordTheme;", "getTheme", "()Lcom/discord/theme/DiscordTheme;", "theme_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThemeManagerKt {
    public static final DiscordTheme getTheme() {
        ThemeManager themeManager = ThemeManager.INSTANCE;
        DiscordTheme themeOverride = themeManager.getThemeOverride();
        return themeOverride == null ? themeManager.getCurrentTheme$theme_release() : themeOverride;
    }
}
