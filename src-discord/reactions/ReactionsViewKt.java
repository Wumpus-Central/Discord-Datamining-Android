package com.discord.reactions;

import com.discord.reactions.BurstReactionView;
import com.discord.reactions.ReactionView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¨\u0006\b"}, d2 = {"copyReactionWithoutCount", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "isBurstReaction", "", "separateAndSortDuplicateReactions", "", "reactions", "reactions_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class ReactionsViewKt {
    public static final ReactionView.Reaction copyReactionWithoutCount(final ReactionView.Reaction reaction, final boolean z10) {
        q.h(reaction, "reaction");
        return new ReactionView.Reaction(z10, reaction) { 
            private final int burstCount;
            private final int count;
            private final ReactionView.Emoji emoji;
            private final boolean isMe;
            private final boolean isMeBurst;
            private final BurstReactionView.ThemedBurstColorPalette themedBurstColors;

            
            {
                int i10;
                int i11 = 0;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = reaction.getCount();
                }
                this.count = i10;
                this.burstCount = z10 ? reaction.getBurstCount() : i11;
                this.isMe = reaction.isMe();
                this.isMeBurst = reaction.isMeBurst();
                this.emoji = reaction.getEmoji();
                this.themedBurstColors = reaction.getThemedBurstColors();
            }

            @Override 
            public int getBurstCount() {
                return this.burstCount;
            }

            @Override 
            public int getCount() {
                return this.count;
            }

            @Override 
            public ReactionView.Emoji getEmoji() {
                return this.emoji;
            }

            @Override 
            public Long getItemId() {
                return ReactionView.Reaction.DefaultImpls.getItemId(this);
            }

            @Override 
            public BurstReactionView.ThemedBurstColorPalette getThemedBurstColors() {
                return this.themedBurstColors;
            }

            @Override 
            public boolean isBurstReaction() {
                return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
            }

            @Override 
            public boolean isMe() {
                return this.isMe;
            }

            @Override 
            public boolean isMeBurst() {
                return this.isMeBurst;
            }
        };
    }

    public static final List<ReactionView.Reaction> separateAndSortDuplicateReactions(List<? extends ReactionView.Reaction> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (ReactionView.Reaction reaction : list) {
            if (reaction.getBurstCount() <= 0 || reaction.getCount() <= 0) {
                arrayList.add(reaction);
            } else {
                arrayList.add(copyReactionWithoutCount(reaction, true));
                arrayList.add(copyReactionWithoutCount(reaction, false));
            }
        }
        return arrayList;
    }
}
