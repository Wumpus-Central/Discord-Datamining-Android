package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017Jh\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "forumPostActionBar", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onTapFollowForumPost", "onTapShareForumPost", "onAddReactionClick", "onTapReactionOverflow", "Lkotlin/Function1;", "Lcom/discord/reactions/ReactionView$Reaction;", "", "onReactionClick", "onReactionLongPress", "", "useSortedReactions", "bind", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "forumPostActionBarView", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "<init>", "(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;)V", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ForumPostActionBarViewHolder extends MessagePartViewHolder {
    private final ForumPostActionBarView forumPostActionBarView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumPostActionBarViewHolder(ForumPostActionBarView forumPostActionBarView) {
        super(forumPostActionBarView, null);
        C9971q.m14633g(forumPostActionBarView, "forumPostActionBarView");
        this.forumPostActionBarView = forumPostActionBarView;
    }

    public final void bind(ForumPostActionBar forumPostActionBar, ReactionsTheme reactionsTheme, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onAddReactionClick, View.OnClickListener onTapReactionOverflow, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, boolean z) {
        C9971q.m14633g(forumPostActionBar, "forumPostActionBar");
        C9971q.m14633g(onTapFollowForumPost, "onTapFollowForumPost");
        C9971q.m14633g(onTapShareForumPost, "onTapShareForumPost");
        C9971q.m14633g(onAddReactionClick, "onAddReactionClick");
        C9971q.m14633g(onTapReactionOverflow, "onTapReactionOverflow");
        C9971q.m14633g(onReactionClick, "onReactionClick");
        C9971q.m14633g(onReactionLongPress, "onReactionLongPress");
        ForumPostActions postActions = forumPostActionBar.getPostActions();
        this.forumPostActionBarView.m41859configurem9bs0RY(forumPostActionBar.mo41765getMessageId3Eiw7ao(), postActions.getNumDisplayedReactions(), postActions.isFollowing(), postActions.getFollowIcon(), postActions.getFollowLabel(), postActions.getShareIcon(), postActions.getShareLabel(), forumPostActionBar.getReactions(), postActions.getDefaultReaction(), forumPostActionBar.getCanAddNewReactions(), forumPostActionBar.getAddNewReactionAccessibilityLabel(), reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress, onTapFollowForumPost, onTapShareForumPost, onTapReactionOverflow, z);
    }
}
