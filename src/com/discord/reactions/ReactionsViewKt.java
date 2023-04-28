package com.discord.reactions;

import com.discord.reactions.BurstReactionView;
import com.discord.reactions.ReactionView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9618r;
import kotlin.jvm.internal.C9677q;
import p304qf.C11965c;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, m15073d2 = {"copyReactionWithoutCount", "Lcom/discord/reactions/ReactionView$Reaction;", "reaction", "isBurstReaction", "", "separateAndSortDuplicateReactions", "", "reactions", "sortReactions", "reactions_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public final class ReactionsViewKt {
    public static final ReactionView.Reaction copyReactionWithoutCount(final ReactionView.Reaction reaction, final boolean z) {
        C9677q.m14633g(reaction, "reaction");
        return new ReactionView.Reaction(z, reaction) { // from class: com.discord.reactions.ReactionsViewKt$copyReactionWithoutCount$1
            private final int burstCount;
            private final int count;
            private final ReactionView.Emoji emoji;
            private final boolean isMe;
            private final boolean isMeBurst;
            private final BurstReactionView.ThemedBurstColorPalette themedBurstColors;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i;
                int i2 = 0;
                if (z) {
                    i = 0;
                } else {
                    i = reaction.getCount();
                }
                this.count = i;
                this.burstCount = z ? reaction.getBurstCount() : i2;
                this.isMe = reaction.isMe();
                this.isMeBurst = reaction.isMeBurst();
                this.emoji = reaction.getEmoji();
                this.themedBurstColors = reaction.getThemedBurstColors();
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public int getBurstCount() {
                return this.burstCount;
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public int getCount() {
                return this.count;
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public ReactionView.Emoji getEmoji() {
                return this.emoji;
            }

            @Override // com.discord.reactions.ReactionView.Reaction, com.discord.recycler_view.utils.ItemDiffableType
            public Long getItemId() {
                return ReactionView.Reaction.DefaultImpls.getItemId(this);
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public BurstReactionView.ThemedBurstColorPalette getThemedBurstColors() {
                return this.themedBurstColors;
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public boolean isBurstReaction() {
                return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public boolean isMe() {
                return this.isMe;
            }

            @Override // com.discord.reactions.ReactionView.Reaction
            public boolean isMeBurst() {
                return this.isMeBurst;
            }
        };
    }

    public static final List<ReactionView.Reaction> separateAndSortDuplicateReactions(List<? extends ReactionView.Reaction> list, boolean z) {
        List<ReactionView.Reaction> w0;
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
        if (!z) {
            return arrayList;
        }
        w0 = C9618r.m14742w0(arrayList, new Comparator() { // from class: com.discord.reactions.ReactionsViewKt$separateAndSortDuplicateReactions$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = C11965c.m7778d(Boolean.valueOf(((ReactionView.Reaction) t2).isBurstReaction()), Boolean.valueOf(((ReactionView.Reaction) t).isBurstReaction()));
                return d;
            }
        });
        return w0;
    }
}
