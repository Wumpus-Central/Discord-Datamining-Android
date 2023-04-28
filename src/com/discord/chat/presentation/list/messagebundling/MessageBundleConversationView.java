package com.discord.chat.presentation.list.messagebundling;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.MessageBundleConversationViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.item.MessageItem;
import com.discord.chat.presentation.message.utils.ReplyUtilsKt;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.root.ChatView;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.reactions.ReactionsView;
import com.discord.reactions.ReactionsView$setReactions$3;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9610j;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p164j$.util.Spliterator;

@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;", "replyTextLineBounds", "Landroid/graphics/Rect;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "configure", "", "messageItem", "Lcom/discord/chat/presentation/list/item/MessageItem;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageBundleConversationView extends ConstraintLayout implements SpineParentMessage {
    private final MessageBundleConversationViewBinding binding;
    private final Rect replyTextLineBounds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context) {
        this(context, null, 0, 6, null);
        C9677q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ MessageBundleConversationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$7$lambda$5(ChatEventHandler eventHandler, Message message, View view) {
        C9677q.m14633g(eventHandler, "$eventHandler");
        C9677q.m14633g(message, "$message");
        ChatEventHandler.DefaultImpls.m41737onTapReactionu7_MRrM$default(eventHandler, message.m41579getId3Eiw7ao(), null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$7$lambda$6(ChatEventHandler eventHandler, Message message, View view) {
        C9677q.m14633g(eventHandler, "$eventHandler");
        C9677q.m14633g(message, "$message");
        eventHandler.mo41723onTapReactionu7_MRrM(message.m41579getId3Eiw7ao(), null, Boolean.TRUE);
    }

    public final void configure(MessageItem messageItem, final ChatEventHandler eventHandler) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        boolean z;
        C9677q.m14633g(messageItem, "messageItem");
        C9677q.m14633g(eventHandler, "eventHandler");
        final Message message = messageItem.getMessage();
        MessageContext messageContext = messageItem.getMessageContext();
        Context context = getContext();
        C9677q.m14634f(context, "context");
        this.binding.replyAuthorAvatar.setImageURI(MessageKt.avatarUrl(message, context));
        TextView configure$lambda$1 = this.binding.replyAuthorName;
        C9677q.m14634f(configure$lambda$1, "configure$lambda$1");
        ViewUtilsKt.setOptionalText(configure$lambda$1, message.getUsername());
        int i = 0;
        configure$lambda$1.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        if (message.getContent() != null) {
            TextView textView = this.binding.replyAuthorName;
            C9677q.m14634f(textView, "binding.replyAuthorName");
            StructurableText content = message.getContent();
            Context context2 = getContext();
            C9677q.m14634f(context2, "context");
            String str = message.m41579getId3Eiw7ao();
            boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            C9677q.m14634f(fontMetrics, "binding.replyText.paint.fontMetrics");
            DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(content, context2, str, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, null, null, null, null, null, null, null, null, null, null, null, true, null, TextUtilsKt.getBaselineHeight(fontMetrics), 196576, null);
            MessageContentView messageContentView = this.binding.replyText;
            C9677q.m14634f(messageContentView, "binding.replyText");
            SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(messageContentView));
            draweeSpanStringBuilder = ReplyUtilsKt.createReplyContent(textView, spannable$default);
        } else {
            TextView textView2 = this.binding.replyAuthorName;
            C9677q.m14634f(textView2, "binding.replyAuthorName");
            Context context3 = getContext();
            C9677q.m14634f(context3, "context");
            draweeSpanStringBuilder = ReplyUtilsKt.createSystemReplyContent(textView2, I18nUtilsKt.i18nFormat$default(context3, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null).toString());
        }
        MessageContentView messageContentView2 = this.binding.replyText;
        messageContentView2.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
        if (messageContentView2.isLaidOut() && messageContentView2.getWidth() > 0) {
            messageContentView2.measure(View.MeasureSpec.makeMeasureSpec(messageContentView2.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            messageContentView2.getLineBounds(0, this.replyTextLineBounds);
            TextView textView3 = this.binding.replyAuthorName;
            C9677q.m14634f(textView3, "binding.replyAuthorName");
            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
            if (layoutParams != null) {
                Rect rect = this.replyTextLineBounds;
                layoutParams.height = rect.bottom - rect.top;
                textView3.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ReactionsView configure$lambda$7 = this.binding.reactionsView;
        C9677q.m14634f(configure$lambda$7, "configure$lambda$7");
        String str2 = message.m41579getId3Eiw7ao();
        List<MessageReaction> reactions = message.getReactions();
        if (reactions == null) {
            reactions = C9610j.m14820i();
        }
        configure$lambda$7.setReactions(str2, reactions, messageContext.getCanAddNewReactions(), messageContext.getUseAddBurstReaction(), messageContext.getAddReactionLabel(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getAddNewBurstReactionAccessibilityLabel(), messageContext.getReactionsTheme(), (r34 & Spliterator.NONNULL) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$0(view);
            }
        } : new View.OnClickListener() { // from class: com.discord.chat.presentation.list.messagebundling.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageBundleConversationView.configure$lambda$7$lambda$5(ChatEventHandler.this, message, view);
            }
        }, (r34 & 512) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$1(view);
            }
        } : new View.OnClickListener() { // from class: com.discord.chat.presentation.list.messagebundling.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageBundleConversationView.configure$lambda$7$lambda$6(ChatEventHandler.this, message, view);
            }
        }, new MessageBundleConversationView$configure$3$3(eventHandler, message), (r34 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? ReactionsView$setReactions$3.INSTANCE : null, (r34 & 4096) != 0 ? null : ThemeManagerKt.getTheme(), (r34 & 8192) != 0 ? false : ChatView.Companion.getAreChatAnimationsEnabled(), messageContext.getUseSortedReactions());
        List<MessageReaction> reactions2 = message.getReactions();
        if (reactions2 == null || reactions2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z)) {
            i = 8;
        }
        configure$lambda$7.setVisibility(i);
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
        C9677q.m14634f(simpleDraweeView, "binding.replyAuthorAvatar");
        return simpleDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9677q.m14633g(context, "context");
        MessageBundleConversationViewBinding inflate = MessageBundleConversationViewBinding.inflate(LayoutInflater.from(context), this);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.replyTextLineBounds = new Rect();
        TextView textView = inflate.replyAuthorName;
        C9677q.m14634f(textView, "binding.replyAuthorName");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = inflate.replyAuthorName;
        C9677q.m14634f(textView2, "binding.replyAuthorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeView simpleDraweeView = inflate.replyAuthorAvatar;
        C9677q.m14634f(simpleDraweeView, "binding.replyAuthorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        MessageContentView _init_$lambda$0 = inflate.replyText;
        C9677q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
    }
}
