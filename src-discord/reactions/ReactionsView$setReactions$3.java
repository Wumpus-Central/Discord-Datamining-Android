package com.discord.reactions;

import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/discord/reactions/ReactionView$Reaction;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class ReactionsView$setReactions$3 extends s implements Function1<ReactionView.Reaction, Unit> {
    public static final ReactionsView$setReactions$3 INSTANCE = new ReactionsView$setReactions$3();

    ReactionsView$setReactions$3() {
        super(1);
    }

    @Override 
    public   Unit invoke(ReactionView.Reaction reaction) {
        invoke2(reaction);
        return Unit.f20670a;
    }

    
    public final void invoke2(ReactionView.Reaction reaction) {
        q.g(reaction, "<anonymous parameter 0>");
    }
}
