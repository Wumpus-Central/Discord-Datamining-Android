package com.discord.kvstorage.discordapp;

/* loaded from: classes6.dex */
public final class DiscordMobileApi {
    public static native String getGuildVersions(String str);

    public static void initialize(String str) {
        System.loadLibrary("kv_storage");
        nativeInitialize(str);
    }

    private static native void nativeInitialize(String str);

    public static native void openAsync(String str);

    public static native void putMessage(String str, String str2, String str3, String str4, String str5);
}
