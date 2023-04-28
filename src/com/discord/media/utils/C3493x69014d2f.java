package com.discord.media.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "mimeType", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* renamed from: com.discord.media.utils.ContentResolverMedia$QueryType$Companion$getUnsupportedImageMimeTypes$1 */
/* loaded from: classes5.dex */
final class C3493x69014d2f extends AbstractC9679s implements Function1<String, CharSequence> {
    public static final C3493x69014d2f INSTANCE = new C3493x69014d2f();

    C3493x69014d2f() {
        super(1);
    }

    public final CharSequence invoke(String mimeType) {
        C9677q.m14633g(mimeType, "mimeType");
        return "'" + mimeType + "'";
    }
}
