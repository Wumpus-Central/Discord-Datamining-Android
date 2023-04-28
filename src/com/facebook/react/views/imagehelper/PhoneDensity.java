package com.facebook.react.views.imagehelper;

import com.discord.media.utils.DiscordVideoMediaSource;

/* loaded from: classes7.dex */
enum PhoneDensity {
    Medium(160, "mdpi"),
    High(240, "hdpi"),
    XHigh(320, "xhdpi"),
    XXHigh(DiscordVideoMediaSource.DEFAULT_HEIGHT, "xxhdpi"),
    XXXHigh(DiscordVideoMediaSource.DEFAULT_WIDTH, "xxxhdpi");
    
    int density;
    String fileParentSuffix;

    PhoneDensity(int i, String str) {
        this.density = i;
        this.fileParentSuffix = str;
    }
}
