package com.discord.chat.presentation.textutils;

import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.span.utilities.spannable.QuoteSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m15073d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
final class TextUtilsKt$toSpannable$12$1$1 extends AbstractC9973s implements Function1<RenderContext.Insets, RenderContext.Insets> {
    final /* synthetic */ QuoteSpan $quote;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$1$1(QuoteSpan quoteSpan) {
        super(1);
        this.$quote = quoteSpan;
    }

    public final RenderContext.Insets invoke(RenderContext.Insets updateInsets) {
        C9971q.m14633g(updateInsets, "$this$updateInsets");
        return RenderContext.Insets.copy$default(updateInsets, 0, 0, updateInsets.getStart() + this.$quote.getInsetStart(), 0, 11, null);
    }
}
