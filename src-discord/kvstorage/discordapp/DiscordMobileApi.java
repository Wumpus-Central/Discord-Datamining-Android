package com.discord.kvstorage.discordapp;

import android.content.Context;

/* loaded from: classes5.dex */
public final class DiscordMobileApi {
    public static native String getGuildVersions(String str);

    public static void initialize(Context context) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        System.loadLibrary("kv_storage");
        nativeInitialize(absolutePath);
    }

    private static native void nativeInitialize(String str);

    public static native void openAsync(String str);
}