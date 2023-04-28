package com.discord.span.utilities.spannable;

import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/span/utilities/spannable/EmojiAccessibilitySpan;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "span_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class EmojiAccessibilitySpan {
    private final String name;

    public EmojiAccessibilitySpan(String name) {
        C9677q.m14633g(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }
}
