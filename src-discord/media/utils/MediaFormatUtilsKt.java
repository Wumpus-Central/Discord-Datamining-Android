package com.discord.media.utils;

import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import nf.s;
import nf.t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"mimeType", "", "Landroid/media/MediaFormat;", "getMimeType", "(Landroid/media/MediaFormat;)Ljava/lang/String;", "isHevcVideo", "", "media_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaFormatUtilsKt {
    public static final String getMimeType(MediaFormat mediaFormat) {
        Object obj;
        q.g(mediaFormat, "<this>");
        try {
            s.a aVar = s.f24599l;
            obj = s.b(mediaFormat.getString("mime"));
        } catch (Throwable th2) {
            s.a aVar2 = s.f24599l;
            obj = s.b(t.a(th2));
        }
        if (s.g(obj)) {
            obj = null;
        }
        return (String) obj;
    }

    public static final boolean isHevcVideo(MediaFormat mediaFormat) {
        q.g(mediaFormat, "<this>");
        return q.b(getMimeType(mediaFormat), "video/hevc");
    }
}
