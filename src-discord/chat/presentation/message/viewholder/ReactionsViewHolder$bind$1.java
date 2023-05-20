package com.discord.chat.presentation.message.viewholder;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ReactionsViewHolder$bind$1 extends s implements Function1<ReactionView.Reaction, Unit> {
    final /* synthetic */ Function1<ReactionView.Reaction, Unit> $onReactionClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReactionsViewHolder$bind$1(Function1<? super ReactionView.Reaction, Unit> function1) {
        super(1);
        this.$onReactionClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f22076a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ReactionView.Reaction reaction) {
        q.g(reaction, "reaction");
        this.$onReactionClick.invoke(reaction);
    }
}
