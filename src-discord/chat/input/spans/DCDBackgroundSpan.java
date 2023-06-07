package com.discord.chat.input.spans;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.spannable.BackgroundSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/input/spans/DCDBackgroundSpan;", "Lcom/discord/span/utilities/spannable/BackgroundSpan;", "Lcom/discord/chat/input/spans/DCDInputSpan;", "style", "Lcom/discord/span/utilities/common/BackgroundStyle;", "(Lcom/discord/span/utilities/common/BackgroundStyle;)V", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DCDBackgroundSpan extends BackgroundSpan implements DCDInputSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDBackgroundSpan(BackgroundStyle style) {
        super(style);
        q.g(style, "style");
    }
}
