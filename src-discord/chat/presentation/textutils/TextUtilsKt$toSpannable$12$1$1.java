package com.discord.chat.presentation.textutils;

import com.discord.chat.presentation.textutils.RenderContext;
import com.discord.span.utilities.spannable.QuoteSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discord/chat/presentation/textutils/RenderContext$Insets;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class TextUtilsKt$toSpannable$12$1$1 extends s implements Function1<RenderContext.Insets, RenderContext.Insets> {
    final /* synthetic */ QuoteSpan $quote;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextUtilsKt$toSpannable$12$1$1(QuoteSpan quoteSpan) {
        super(1);
        this.$quote = quoteSpan;
    }

    public final RenderContext.Insets invoke(RenderContext.Insets updateInsets) {
        q.g(updateInsets, "$this$updateInsets");
        return RenderContext.Insets.copy$default(updateInsets, 0, 0, updateInsets.getStart() + this.$quote.getInsetStart(), 0, 11, null);
    }
}
