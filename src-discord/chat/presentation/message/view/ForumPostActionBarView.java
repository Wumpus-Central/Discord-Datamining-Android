package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.forums.PostSharePrompt;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.ForumPostActionBarViewBinding;
import com.discord.chat.presentation.root.ChatView;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$1;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$10;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$11;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$2;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$3;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$4;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$5;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$6;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$7;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$8;
import com.discord.chat.presentation.textutils.TextUtilsKt$toSpannable$9;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ReactionsView;
import com.discord.reactions.ReactionsView$setReactions$3;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u001c¢\u0006\u0004\b6\u00107JZ\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0002J[\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\t2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ÷\u0001\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010!\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u00022\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00052\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010*\u001a\u00020\t2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/discord/chat/presentation/message/view/ForumPostActionBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "messageId", "", "Lcom/discord/reactions/ReactionView$Reaction;", "reactionsToDisplay", "Lcom/discord/reactions/ReactionView$ReactionsTheme;", "reactionsTheme", "Landroid/view/View$OnClickListener;", "onAddReactionClick", "Lkotlin/Function1;", "", "onReactionClick", "onReactionLongPress", "setReactions", "Lcom/discord/primitives/MessageId;", "Lcom/discord/chat/bridge/forums/PostSharePrompt;", "postSharePrompt", "onTapShareForumPost", "shareIcon", "onTapDismissSharePrompt", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "setSharePrompt-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/bridge/forums/PostSharePrompt;Landroid/view/View$OnClickListener;Ljava/lang/String;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function2;)V", "setSharePrompt", "", "numDisplayedReactions", "", "isFollowing", "followIcon", "followLabel", "shareLabel", "reactions", "defaultReaction", "canAddNewReactions", "addNewReactionAccessibilityLabel", "onTapFollowForumPost", "onTapReactionOverflow", "sharePrompt", "onDismissSharePromptClick", "configure-CgeVRR0", "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/discord/reactions/ReactionView$Reaction;ZLjava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/discord/chat/bridge/forums/PostSharePrompt;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function2;)V", "configure", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "binding", "Lcom/discord/chat/databinding/ForumPostActionBarViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class ForumPostActionBarView extends ConstraintLayout {
    private final ForumPostActionBarViewBinding binding;

    
    public ForumPostActionBarView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public ForumPostActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  ForumPostActionBarView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void setReactions(String str, List<? extends ReactionView.Reaction> list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1<? super ReactionView.Reaction, Unit> function1, Function1<? super ReactionView.Reaction, Unit> function12) {
        ReactionsView reactionsView = this.binding.reactionsView;
        q.g(reactionsView, "binding.reactionsView");
        reactionsView.setVisibility(0);
        ReactionsView reactionsView2 = this.binding.reactionsView;
        q.g(reactionsView2, "binding.reactionsView");
        reactionsView2.setReactions(str, list, false, false, "", "", "", reactionsTheme, (r32 & 256) != 0 ? new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$0(view);
            }
        } : onClickListener, (r32 & 512) != 0 ? new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$1(view);
            }
        } : null, function1, (r32 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? ReactionsView$setReactions$3.INSTANCE : function12, (r32 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r32 & 8192) != 0 ? false : ChatView.Companion.getAreChatAnimationsEnabled());
    }

    
    static  void setReactions$default(ForumPostActionBarView forumPostActionBarView, String str, List list, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onClickListener, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function12 = ForumPostActionBarView$setReactions$1.INSTANCE;
        }
        forumPostActionBarView.setReactions(str, list, reactionsTheme, onClickListener, function1, function12);
    }

    
    private final void m327setSharePromptLdU2QRA(String str, PostSharePrompt postSharePrompt, View.OnClickListener onClickListener, String str2, View.OnClickListener onClickListener2, Function2<? super MessageId, ? super LinkContentNode, Unit> function2) {
        boolean z10;
        int i10;
        DraweeSpanStringBuilder spannable;
        ConstraintLayout constraintLayout = this.binding.sharePromptContainer;
        q.g(constraintLayout, "binding.sharePromptContainer");
        if (postSharePrompt != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        constraintLayout.setVisibility(i10);
        if (postSharePrompt != null) {
            this.binding.sharePromptTitle.setText(postSharePrompt.getTitle());
            DCDButton dCDButton = this.binding.sharePromptCopyLinkButton;
            if (str2 != null) {
                dCDButton.setIcon(str2, SizeUtilsKt.getDpToPx(16));
            }
            dCDButton.setText(postSharePrompt.getCta());
            dCDButton.setContentDescription(postSharePrompt.getCta());
            dCDButton.setOnClickButtonListener(onClickListener);
            DCDButton dCDButton2 = this.binding.sharePromptCloseButton;
            dCDButton2.setIcon(postSharePrompt.getCloseIcon(), SizeUtilsKt.getDpToPx(16));
            dCDButton2.setOnClickButtonListener(onClickListener2);
            SimpleDraweeView simpleDraweeView = this.binding.sharePromptIcon;
            q.g(simpleDraweeView, "binding.sharePromptIcon");
            ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, postSharePrompt.getIcon());
            SimpleDraweeSpanTextView setSharePrompt_LdU2QRA$lambda$13 = this.binding.sharePromptSubtitle;
            q.g(setSharePrompt_LdU2QRA$lambda$13, "setSharePrompt_LdU2QRA$lambda$13");
            StructurableText subtitle = postSharePrompt.getSubtitle();
            Context context = setSharePrompt_LdU2QRA$lambda$13.getContext();
            Paint.FontMetrics fontMetrics = setSharePrompt_LdU2QRA$lambda$13.getPaint().getFontMetrics();
            q.g(fontMetrics, "paint.fontMetrics");
            float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
            TextPaint paint = setSharePrompt_LdU2QRA$lambda$13.getPaint();
            q.g(context, "context");
            q.g(paint, "paint");
            spannable = TextUtilsKt.toSpannable(subtitle, context, str, false, false, false, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : new ForumPostActionBarView$setSharePrompt$3$1(function2, str), (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
            SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setSharePrompt_LdU2QRA$lambda$13, spannable);
            NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(setSharePrompt_LdU2QRA$lambda$13, false, 1, null);
        }
    }

    
    public final void m328configureCgeVRR0(String messageId, int i10, boolean z10, String str, String followLabel, String str2, String shareLabel, List<? extends ReactionView.Reaction> list, ReactionView.Reaction reaction, boolean z11, String addNewReactionAccessibilityLabel, ReactionView.ReactionsTheme reactionsTheme, View.OnClickListener onAddReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionClick, Function1<? super ReactionView.Reaction, Unit> onReactionLongPress, View.OnClickListener onTapFollowForumPost, View.OnClickListener onTapShareForumPost, View.OnClickListener onTapReactionOverflow, PostSharePrompt postSharePrompt, View.OnClickListener onDismissSharePromptClick, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked) {
        boolean z12;
        Object obj;
        int i11;
        int i12;
        boolean z13;
        List<? extends ReactionView.Reaction> v02;
        List d10;
        q.h(messageId, "messageId");
        q.h(followLabel, "followLabel");
        q.h(shareLabel, "shareLabel");
        q.h(addNewReactionAccessibilityLabel, "addNewReactionAccessibilityLabel");
        q.h(onAddReactionClick, "onAddReactionClick");
        q.h(onReactionClick, "onReactionClick");
        q.h(onReactionLongPress, "onReactionLongPress");
        q.h(onTapFollowForumPost, "onTapFollowForumPost");
        q.h(onTapShareForumPost, "onTapShareForumPost");
        q.h(onTapReactionOverflow, "onTapReactionOverflow");
        q.h(onDismissSharePromptClick, "onDismissSharePromptClick");
        q.h(onLinkClicked, "onLinkClicked");
        if (list == null || list.isEmpty()) {
            DCDButton dCDButton = this.binding.otherReactionsCount;
            q.g(dCDButton, "binding.otherReactionsCount");
            dCDButton.setVisibility(8);
            if (reaction == null || !z11) {
                ReactionsView reactionsView = this.binding.reactionsView;
                q.g(reactionsView, "binding.reactionsView");
                reactionsView.setVisibility(8);
            } else {
                d10 = i.d(reaction);
                setReactions$default(this, MessageId.m630toStringimpl(messageId), d10, reactionsTheme, onAddReactionClick, onReactionClick, null, 32, null);
            }
            i11 = 2;
            obj = null;
            z12 = true;
        } else {
            z12 = true;
            z12 = true;
            int i13 = i10 - 1;
            v02 = r.v0(list, i13);
            ReactionsView reactionsView2 = this.binding.reactionsView;
            q.g(reactionsView2, "binding.reactionsView");
            reactionsView2.setVisibility(0);
            setReactions(MessageId.m630toStringimpl(messageId), v02, reactionsTheme, onAddReactionClick, onReactionClick, onReactionLongPress);
            int max = Math.max(list.size() - i13, 0);
            DCDButton configure_CgeVRR0$lambda$7 = this.binding.otherReactionsCount;
            q.g(configure_CgeVRR0$lambda$7, "configure_CgeVRR0$lambda$7");
            configure_CgeVRR0$lambda$7.setVisibility(max != 0 ? 0 : 8);
            if (configure_CgeVRR0$lambda$7.getVisibility() == 0) {
                Context context = configure_CgeVRR0$lambda$7.getContext();
                q.g(context, "context");
                configure_CgeVRR0$lambda$7.setText(I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_REACTIONS_OVERFLOW, new ForumPostActionBarView$configure$1$1(max)));
                i11 = 2;
                obj = null;
                RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$7, true, 0, 2, null);
                configure_CgeVRR0$lambda$7.setOnClickButtonListener(onTapReactionOverflow);
            } else {
                i11 = 2;
                obj = null;
            }
        }
        DCDButton dCDButton2 = this.binding.followButton;
        if (str != null) {
            dCDButton2.setIcon(str, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton2.setText(followLabel);
        dCDButton2.setContentDescription(followLabel);
        if (z10) {
            i12 = ThemeManagerKt.getTheme().getTextBrand();
        } else {
            i12 = ThemeManagerKt.getTheme().getInteractiveNormal();
        }
        dCDButton2.setTextColor(Integer.valueOf(i12));
        dCDButton2.setOnClickButtonListener(onTapFollowForumPost);
        DCDButton dCDButton3 = this.binding.shareButton;
        if (str2 != null) {
            dCDButton3.setIcon(str2, SizeUtilsKt.getDpToPx(16));
        }
        dCDButton3.setOnClickButtonListener(onTapShareForumPost);
        dCDButton3.setContentDescription(shareLabel);
        AddReactionView configure_CgeVRR0$lambda$10 = this.binding.addReaction;
        q.g(configure_CgeVRR0$lambda$10, "configure_CgeVRR0$lambda$10");
        configure_CgeVRR0$lambda$10.setVisibility(z11 ? 0 : 8);
        if (configure_CgeVRR0$lambda$10.getVisibility() == 0) {
            boolean z14 = z12 ? 1 : 0;
            Object[] objArr = z12 ? 1 : 0;
            Object[] objArr2 = z12 ? 1 : 0;
            Object[] objArr3 = z12 ? 1 : 0;
            z13 = z14;
        } else {
            z13 = false;
        }
        if (z13) {
            RippleUtilsKt.addRipple$default(configure_CgeVRR0$lambda$10, z12, 0, i11, obj);
            configure_CgeVRR0$lambda$10.setContentDescription(addNewReactionAccessibilityLabel);
            int i14 = z12 ? 1 : 0;
            int i15 = z12 ? 1 : 0;
            int i16 = z12 ? 1 : 0;
            int i17 = z12 ? 1 : 0;
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configure_CgeVRR0$lambda$10, false, onAddReactionClick, i14, obj);
        }
        m327setSharePromptLdU2QRA(messageId, postSharePrompt, onTapShareForumPost, str2, onDismissSharePromptClick, onLinkClicked);
    }

    
    public ForumPostActionBarView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        ForumPostActionBarViewBinding inflate = ForumPostActionBarViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        inflate.footerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        inflate.headerDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
        DCDButton dCDButton = inflate.followButton;
        dCDButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        DCDButton dCDButton2 = inflate.shareButton;
        dCDButton2.setCornerRadius(SizeUtilsKt.getDpToPx(8));
        dCDButton2.setTextSizeSp(14.0f);
        dCDButton2.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton2.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton2.setIconPadding(0);
        DCDButton dCDButton3 = inflate.otherReactionsCount;
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        dCDButton3.setDiscordFont(discordFont);
        dCDButton3.setTextSizeSp(14.0f);
        dCDButton3.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        dCDButton3.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        TextView _init_$lambda$3 = inflate.sharePromptTitle;
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
        q.g(_init_$lambda$3, "_init_$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        SimpleDraweeSpanTextView _init_$lambda$4 = inflate.sharePromptSubtitle;
        _init_$lambda$4.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.g(_init_$lambda$4, "_init_$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 14.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont2);
        DCDButton dCDButton4 = inflate.sharePromptCopyLinkButton;
        dCDButton4.setCornerRadius(SizeUtilsKt.getDpToPx(20));
        dCDButton4.setTextSizeSp(14.0f);
        dCDButton4.setBackgroundColor(context.getColor(R.color.brand_500));
        dCDButton4.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        dCDButton4.setDiscordFont(discordFont2);
        dCDButton4.setIconPadding(8);
        DCDButton dCDButton5 = inflate.sharePromptCloseButton;
        dCDButton5.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        dCDButton5.setBackgroundColor(0);
        dCDButton5.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.DISMISS, null, 2, null));
    }
}
