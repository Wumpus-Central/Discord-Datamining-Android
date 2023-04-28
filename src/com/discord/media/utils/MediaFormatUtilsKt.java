package com.discord.media.utils;

import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import nf.C10845s;
import nf.C10848t;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m15073d2 = {"mimeType", "", "Landroid/media/MediaFormat;", "getMimeType", "(Landroid/media/MediaFormat;)Ljava/lang/String;", "isHevcVideo", "", "media_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MediaFormatUtilsKt {
    public static final String getMimeType(MediaFormat mediaFormat) {
        Object obj;
        C9677q.m14633g(mediaFormat, "<this>");
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            obj = C10845s.m10940b(mediaFormat.getString("mime"));
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            obj = C10845s.m10940b(C10848t.m10931a(th2));
        }
        if (C10845s.m10935g(obj)) {
            obj = null;
        }
        return (String) obj;
    }

    public static final boolean isHevcVideo(MediaFormat mediaFormat) {
        C9677q.m14633g(mediaFormat, "<this>");
        return C9677q.m14638b(getMimeType(mediaFormat), "video/hevc");
    }
}
