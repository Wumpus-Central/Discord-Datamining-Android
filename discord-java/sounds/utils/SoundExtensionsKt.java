package com.discord.sounds.utils;

import android.content.Context;
import android.net.Uri;
import com.discord.sounds.SoundManager;
import java.io.File;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.collections.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlinx.coroutines.j;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.y0;
import qf.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a@\u0010\u000f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\rH\u0000¨\u0006\u0010"}, d2 = {"Landroid/content/Context;", "Ljava/io/File;", "getSoundsCacheDirectory", "", "tryPruneSoundsCache", "", "url", "getRemoteSoundFilename", "Lcom/discord/sounds/SoundManager;", "soundManager", "", "key", "usage", "Lkotlin/Function1;", "soundResIdPrepared", "fetchSound", "sounds_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class SoundExtensionsKt {
    public static final void fetchSound(Context context, String url, SoundManager soundManager, int i10, int i11, Function1<? super Integer, Unit> soundResIdPrepared) {
        q.g(context, "<this>");
        q.g(url, "url");
        q.g(soundManager, "soundManager");
        q.g(soundResIdPrepared, "soundResIdPrepared");
        tryPruneSoundsCache(context);
        j.d(k0.b(), y0.b(), null, new SoundExtensionsKt$fetchSound$1(context, url, getRemoteSoundFilename(url), getSoundsCacheDirectory(context), soundManager, i10, i11, soundResIdPrepared, null), 2, null);
    }

    public static final String getRemoteSoundFilename(String url) {
        q.g(url, "url");
        String lastPathSegment = Uri.parse(url).getLastPathSegment();
        return lastPathSegment + ".mp3";
    }

    public static final File getSoundsCacheDirectory(Context context) {
        q.g(context, "<this>");
        return new File(context.getCacheDir(), "sounds");
    }

    public static final void tryPruneSoundsCache(Context context) {
        Object d02;
        q.g(context, "<this>");
        File[] listFiles = getSoundsCacheDirectory(context).listFiles();
        if (listFiles != null && listFiles.length >= 20) {
            e.r(listFiles, new Comparator() { // from class: com.discord.sounds.utils.SoundExtensionsKt$tryPruneSoundsCache$$inlined$compareByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    int d10;
                    d10 = c.d(Long.valueOf(((File) t11).lastModified()), Long.valueOf(((File) t10).lastModified()));
                    return d10;
                }
            });
            d02 = f.d0(listFiles);
            File file = (File) d02;
            if (file != null) {
                file.delete();
            }
        }
    }
}
