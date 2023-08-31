package com.discord.app_icon;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/discord/app_icon/AppIcon;", "", "id", "", "aliasSuffix", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "alias", "getAlias", "()Ljava/lang/String;", "getId", "DEFAULT", "BRAND_DARK", "MATTE_LIGHT", "app_icon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public enum AppIcon {
    DEFAULT("AppIcon", "MainDefault"),
    BRAND_DARK("BrandDarkIcon", "MainBrandDark"),
    MATTE_LIGHT("MatteLightIcon", "MainMatteLight");
    
    private final String aliasSuffix;

    
    private final String f7193id;

    AppIcon(String str, String str2) {
        this.f7193id = str;
        this.aliasSuffix = str2;
    }

    public final String getAlias() {
        String str = this.aliasSuffix;
        return "com.discord.main." + str;
    }

    public final String getId() {
        return this.f7193id;
    }
}
