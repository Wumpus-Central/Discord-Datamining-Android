package com.discord.file_downloader.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.text.Regex;

@Metadata(m15074d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m15073d2 = {"filenameSanitized", "", "", "file_downloader_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class FilenameSanitizedKt {
    public static final String filenameSanitized(CharSequence charSequence) {
        C9971q.m14633g(charSequence, "<this>");
        return new Regex("[/\\\\]").m14582h(charSequence, "_");
    }
}
