package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mimeType", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1 extends s implements Function1<String, CharSequence> {
    public static final ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1 INSTANCE = new ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1();

    ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1() {
        super(1);
    }

    public final CharSequence invoke(String mimeType) {
        q.g(mimeType, "mimeType");
        return "'" + mimeType + "'";
    }
}