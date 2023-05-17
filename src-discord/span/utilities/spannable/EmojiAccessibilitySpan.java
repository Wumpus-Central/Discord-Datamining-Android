package com.discord.span.utilities.spannable;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/span/utilities/spannable/EmojiAccessibilitySpan;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "span_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EmojiAccessibilitySpan {
    private final String name;

    public EmojiAccessibilitySpan(String name) {
        q.g(name, "name");
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }
}
