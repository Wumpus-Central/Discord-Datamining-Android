package com.discord.file_downloader.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"filenameSanitized", "", "", "file_downloader_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FilenameSanitizedKt {
    public static final String filenameSanitized(CharSequence charSequence) {
        q.g(charSequence, "<this>");
        return new Regex("[/\\\\]").h(charSequence, "_");
    }
}
