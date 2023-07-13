package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.primitives.MessageId;
import com.discord.reactions.ReactionView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0085\u0001\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u00062\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0011ø\u0001\u0000R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/ForumPostActionBarViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "forumPostActionBar", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onTapFollowForumPost", "onTapShareForumPost", "onAddReactionClick", "onTapReactionOverflow", "Lkotlin/Function1;", "Lcom/discord/reactions/ReactionView$Reaction;", "", "onReactionClick", "onReactionLongPress", "onTapDismissMediaPostSharePrompt", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "bind", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "forumPostActionBarView", "Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "<init>", "(Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ForumPostActionBarViewHolder extends MessagePartViewHolder {
    private final ForumPostActionBarView forumPostActionBarView;

    
    public ForumPostActionBarViewHolder(ForumPostActionBarView forumPostActionBarView) {
        super(forumPostActionBarView, null);
        q.g(forumPostActionBarView, "forumPostActionBarView");
        this.forumPostActionBarView = forumPostActionBarView;
    }

    public final void bind(ForumPostActionBar forumPostActionBar, ReactionsTheme reactionsTheme, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onAddReactionClick, View.OnClickListener onTapReactionOverflow, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, View.OnClickListener onTapDismissMediaPostSharePrompt, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        q.g(forumPostActionBar, "forumPostActionBar");
        q.g(onTapFollowForumPost, "onTapFollowForumPost");
        q.g(onTapShareForumPost, "onTapShareForumPost");
        q.g(onAddReactionClick, "onAddReactionClick");
        q.g(onTapReactionOverflow, "onTapReactionOverflow");
        q.g(onReactionClick, "onReactionClick");
        q.g(onReactionLongPress, "onReactionLongPress");
        q.g(onTapDismissMediaPostSharePrompt, "onTapDismissMediaPostSharePrompt");
        q.g(onLinkClicked, "onLinkClicked");
        ForumPostActions postActions = forumPostActionBar.getPostActions();
        this.forumPostActionBarView.m310configureCgeVRR0(forumPostActionBar.mo215getMessageId3Eiw7ao(), postActions.getNumDisplayedReactions(), postActions.isFollowing(), postActions.getFollowIcon(), postActions.getFollowLabel(), postActions.getShareIcon(), postActions.getShareLabel(), forumPostActionBar.getReactions(), postActions.getDefaultReaction(), forumPostActionBar.getCanAddNewReactions(), forumPostActionBar.getAddNewReactionAccessibilityLabel(), reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress, onTapFollowForumPost, onTapShareForumPost, onTapReactionOverflow, postActions.getSharePrompt(), onTapDismissMediaPostSharePrompt, onLinkClicked);
    }
}
