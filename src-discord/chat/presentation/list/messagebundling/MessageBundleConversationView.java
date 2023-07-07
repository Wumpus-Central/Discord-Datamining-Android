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
import kotlin.collections.j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;", "replyTextLineBounds", "Landroid/graphics/Rect;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "configure", "", "messageItem", "Lcom/discord/chat/presentation/list/item/MessageItem;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MessageBundleConversationView extends ConstraintLayout implements SpineParentMessage {
    private final MessageBundleConversationViewBinding binding;
    private final Rect replyTextLineBounds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ MessageBundleConversationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$7$lambda$5(ChatEventHandler eventHandler, Message message, View view) {
        q.g(eventHandler, "$eventHandler");
        q.g(message, "$message");
        ChatEventHandler.DefaultImpls.m185onTapReactionu7_MRrM$default(eventHandler, message.m16getId3Eiw7ao(), null, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$7$lambda$6(ChatEventHandler eventHandler, Message message, View view) {
        q.g(eventHandler, "$eventHandler");
        q.g(message, "$message");
        eventHandler.mo169onTapReactionu7_MRrM(message.m16getId3Eiw7ao(), null, Boolean.TRUE);
    }

    public final void configure(MessageItem messageItem, final ChatEventHandler eventHandler) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        boolean z10;
        DraweeSpanStringBuilder spannable;
        q.g(messageItem, "messageItem");
        q.g(eventHandler, "eventHandler");
        final Message message = messageItem.getMessage();
        MessageContext messageContext = messageItem.getMessageContext();
        Context context = getContext();
        q.f(context, "context");
        this.binding.replyAuthorAvatar.setImageURI(MessageKt.avatarUrl(message, context));
        TextView configure$lambda$1 = this.binding.replyAuthorName;
        q.f(configure$lambda$1, "configure$lambda$1");
        ViewUtilsKt.setOptionalText(configure$lambda$1, message.getUsername());
        int i10 = 0;
        configure$lambda$1.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        if (message.getContent() != null) {
            TextView textView = this.binding.replyAuthorName;
            q.f(textView, "binding.replyAuthorName");
            StructurableText content = message.getContent();
            Context context2 = getContext();
            q.f(context2, "context");
            String str = message.m16getId3Eiw7ao();
            boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
            q.f(fontMetrics, "binding.replyText.paint.fontMetrics");
            spannable = TextUtilsKt.toSpannable(content, context2, str, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, (r42 & 32) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r42 & 64) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r42 & 128) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r42 & 256) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r42 & 512) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r42 & 1024) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r42 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r42 & 8192) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (r42 & 16384) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (32768 & r42) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (65536 & r42) != 0 ? false : true, (131072 & r42) != 0 ? ThemeManagerKt.getTheme() : null, (r42 & 262144) != 0 ? -1.0f : TextUtilsKt.getBaselineHeight(fontMetrics));
            MessageContentView messageContentView = this.binding.replyText;
            q.f(messageContentView, "binding.replyText");
            SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(messageContentView));
            draweeSpanStringBuilder = ReplyUtilsKt.createReplyContent(textView, spannable);
        } else {
            TextView textView2 = this.binding.replyAuthorName;
            q.f(textView2, "binding.replyAuthorName");
            Context context3 = getContext();
            q.f(context3, "context");
            draweeSpanStringBuilder = ReplyUtilsKt.createSystemReplyContent(textView2, I18nUtilsKt.i18nFormat$default(context3, I18nMessage.REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE, null, 2, null).toString());
        }
        MessageContentView messageContentView2 = this.binding.replyText;
        messageContentView2.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
        if (messageContentView2.isLaidOut() && messageContentView2.getWidth() > 0) {
            messageContentView2.measure(View.MeasureSpec.makeMeasureSpec(messageContentView2.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            messageContentView2.getLineBounds(0, this.replyTextLineBounds);
            TextView textView3 = this.binding.replyAuthorName;
            q.f(textView3, "binding.replyAuthorName");
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
        q.f(configure$lambda$7, "configure$lambda$7");
        String str2 = message.m16getId3Eiw7ao();
        List<MessageReaction> reactions = message.getReactions();
        if (reactions == null) {
            reactions = j.h();
        }
        configure$lambda$7.setReactions(str2, reactions, messageContext.getCanAddNewReactions(), messageContext.getUseAddBurstReaction(), messageContext.getAddReactionLabel(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getAddNewBurstReactionAccessibilityLabel(), messageContext.getReactionsTheme(), (r32 & 256) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$0(view);
            }
        } : new View.OnClickListener() { // from class: com.discord.chat.presentation.list.messagebundling.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageBundleConversationView.configure$lambda$7$lambda$5(ChatEventHandler.this, message, view);
            }
        }, (r32 & 512) != 0 ? new View.OnClickListener() { // from class: com.discord.reactions.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReactionsView.setReactions$lambda$1(view);
            }
        } : new View.OnClickListener() { // from class: com.discord.chat.presentation.list.messagebundling.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageBundleConversationView.configure$lambda$7$lambda$6(ChatEventHandler.this, message, view);
            }
        }, new MessageBundleConversationView$configure$3$3(eventHandler, message), (r32 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? ReactionsView$setReactions$3.INSTANCE : null, (r32 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : ThemeManagerKt.getTheme(), (r32 & 8192) != 0 ? false : ChatView.Companion.getAreChatAnimationsEnabled());
        List<MessageReaction> reactions2 = message.getReactions();
        if (reactions2 == null || reactions2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(!z10)) {
            i10 = 8;
        }
        configure$lambda$7.setVisibility(i10);
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
        q.f(simpleDraweeView, "binding.replyAuthorAvatar");
        return simpleDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleConversationView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        MessageBundleConversationViewBinding inflate = MessageBundleConversationViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.replyTextLineBounds = new Rect();
        TextView textView = inflate.replyAuthorName;
        q.f(textView, "binding.replyAuthorName");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = inflate.replyAuthorName;
        q.f(textView2, "binding.replyAuthorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeView simpleDraweeView = inflate.replyAuthorAvatar;
        q.f(simpleDraweeView, "binding.replyAuthorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        MessageContentView _init_$lambda$0 = inflate.replyText;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 12.0f);
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
    }
}
