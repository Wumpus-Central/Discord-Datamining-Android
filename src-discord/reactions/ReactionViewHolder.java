package com.discord.reactions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/reactions/ReactionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "reactionView", "Lcom/discord/reactions/ReactionView;", "(Lcom/discord/reactions/ReactionView;)V", "bind", "", "reaction", "Lcom/discord/reactions/ReactionView$Reaction;", "onReactionClick", "Lkotlin/Function1;", "onReactionLongPress", "reactionsTheme", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactions_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ReactionViewHolder extends RecyclerView.ViewHolder {
    private final ReactionView reactionView;

    
    public ReactionViewHolder(ReactionView reactionView) {
        super(reactionView);
        q.h(reactionView, "reactionView");
        this.reactionView = reactionView;
    }

    
    public static final void bind$lambda$2$lambda$0(Function1 onReactionClick, ReactionView.Reaction reaction, View view) {
        q.h(onReactionClick, "$onReactionClick");
        q.h(reaction, "$reaction");
        onReactionClick.invoke(reaction);
    }

    
    public static final boolean bind$lambda$2$lambda$1(Function1 onReactionLongPress, ReactionView.Reaction reaction, View view) {
        q.h(onReactionLongPress, "$onReactionLongPress");
        q.h(reaction, "$reaction");
        onReactionLongPress.invoke(reaction);
        return true;
    }

    public final void bind(final ReactionView.Reaction reaction, final Function1<? super ReactionView.Reaction, Unit> onReactionClick, final Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, ReactionView.ReactionsTheme reactionsTheme) {
        q.h(reaction, "reaction");
        q.h(onReactionClick, "onReactionClick");
        q.h(onReactionLongPress, "onReactionLongPress");
        ReactionView reactionView = this.reactionView;
        reactionView.setReaction(reaction, reactionsTheme);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(reactionView, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ReactionViewHolder.bind$lambda$2$lambda$0(Function1.this, reaction, view);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(reactionView, false, new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view) {
                boolean bind$lambda$2$lambda$1;
                bind$lambda$2$lambda$1 = ReactionViewHolder.bind$lambda$2$lambda$1(Function1.this, reaction, view);
                return bind$lambda$2$lambda$1;
            }
        }, 1, null);
    }
}
