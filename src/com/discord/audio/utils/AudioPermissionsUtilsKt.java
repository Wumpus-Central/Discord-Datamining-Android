package com.discord.audio.utils;

import android.content.Context;
import androidx.core.content.C2337a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, m15073d2 = {"hasBluetoothPermission", "", "Landroid/content/Context;", "hasModifyAudioSettingsPermission", "audio_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class AudioPermissionsUtilsKt {
    public static final boolean hasBluetoothPermission(Context context) {
        C9971q.m14633g(context, "<this>");
        if (C2337a.m38137a(context, "android.permission.BLUETOOTH") == 0) {
            return true;
        }
        return false;
    }

    public static final boolean hasModifyAudioSettingsPermission(Context context) {
        C9971q.m14633g(context, "<this>");
        if (C2337a.m38137a(context, "android.permission.MODIFY_AUDIO_SETTINGS") == 0) {
            return true;
        }
        return false;
    }
}
