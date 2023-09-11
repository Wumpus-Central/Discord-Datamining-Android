package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.referencedmessage.SystemReferencedMessage;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.MessageViewReplyPreviewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.utils.ReplyUtilsKt;
import com.discord.chat.presentation.message.view.MessageContentView;
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
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;", "replyTextLineBounds", "Landroid/graphics/Rect;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "clear", "", "configureExecutedCommand", "messageId", "Lcom/discord/primitives/MessageId;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureExecutedCommand-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V", "configureReply", "reply", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "showSpine", "onClick", "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageViewReplyPreview extends ConstraintLayout implements SpineParentMessage {
    private final MessageViewReplyPreviewBinding binding;
    private final Rect replyTextLineBounds;

    
    public MessageViewReplyPreview(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  MessageViewReplyPreview(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public static final void configureExecutedCommand_LdU2QRA$lambda$7(ChatEventHandler eventHandler, String messageId, ExecutedCommand executedCommand, View view) {
        q.h(eventHandler, "$eventHandler");
        q.h(messageId, "$messageId");
        q.h(executedCommand, "$executedCommand");
        eventHandler.mo168onTapAvatarx5gers8(messageId, executedCommand.m114getUserIdre6GcUE());
    }

    public static  void configureReply$default(MessageViewReplyPreview messageViewReplyPreview, ReferencedMessage referencedMessage, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        messageViewReplyPreview.configureReply(referencedMessage, z10, function0);
    }

    public static final void configureReply$lambda$4(Function0 onClick, View view) {
        q.h(onClick, "$onClick");
        onClick.invoke();
    }

    public final void clear() {
        ChannelSpineView channelSpineView = this.binding.replySpline;
        q.g(channelSpineView, "binding.replySpline");
        channelSpineView.setVisibility(8);
        LinearLayout linearLayout = this.binding.replyLeadingViews;
        q.g(linearLayout, "binding.replyLeadingViews");
        linearLayout.setVisibility(8);
        MessageContentView messageContentView = this.binding.replyText;
        q.g(messageContentView, "binding.replyText");
        messageContentView.setVisibility(8);
    }

    
    public final void m229configureExecutedCommandLdU2QRA(final String messageId, final ExecutedCommand executedCommand, boolean z10, boolean z11, boolean z12, final ChatEventHandler eventHandler) {
        DraweeSpanStringBuilder spannable;
        q.h(messageId, "messageId");
        q.h(executedCommand, "executedCommand");
        q.h(eventHandler, "eventHandler");
        ChannelSpineView channelSpineView = this.binding.replySpline;
        q.g(channelSpineView, "binding.replySpline");
        channelSpineView.setVisibility(0);
        MessageContentView messageContentView = this.binding.replyText;
        q.g(messageContentView, "binding.replyText");
        messageContentView.setVisibility(0);
        LinearLayout linearLayout = this.binding.replyLeadingViews;
        q.g(linearLayout, "binding.replyLeadingViews");
        linearLayout.setVisibility(0);
        SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
        q.g(simpleDraweeView, "binding.replyAuthorAvatar");
        simpleDraweeView.setVisibility(0);
        TextView textView = this.binding.replyAuthorName;
        q.g(textView, "binding.replyAuthorName");
        textView.setVisibility(8);
        SimpleDraweeView simpleDraweeView2 = this.binding.replyAuthorAvatar;
        q.g(simpleDraweeView2, "binding.replyAuthorAvatar");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView2, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                MessageViewReplyPreview.configureExecutedCommand_LdU2QRA$lambda$7(ChatEventHandler.this, messageId, executedCommand, view);
            }
        }, 1, null);
        SimpleDraweeView simpleDraweeView3 = this.binding.replyIcon;
        q.g(simpleDraweeView3, "binding.replyIcon");
        simpleDraweeView3.setVisibility(8);
        MessageViewReplyPreviewBinding messageViewReplyPreviewBinding = this.binding;
        MessageContentView messageContentView2 = messageViewReplyPreviewBinding.replyText;
        LinearLayout linearLayout2 = messageViewReplyPreviewBinding.replyLeadingViews;
        q.g(linearLayout2, "binding.replyLeadingViews");
        AnnotatedStructurableText content = executedCommand.getContent();
        Context context = getContext();
        Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
        q.g(fontMetrics, "binding.replyText.paint.fontMetrics");
        float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
        TextPaint paint = this.binding.replyText.getPaint();
        q.g(context, "context");
        q.g(paint, "paint");
        spannable = TextUtilsKt.toSpannable(content, context, messageId, z10, z11, z12, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : new MessageViewReplyPreview$configureExecutedCommand$2(eventHandler, messageId), (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : new MessageViewReplyPreview$configureExecutedCommand$3(eventHandler), (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : new MessageViewReplyPreview$configureExecutedCommand$4(eventHandler), (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : new MessageViewReplyPreview$configureExecutedCommand$5(executedCommand), (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : false, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
        MessageContentView messageContentView3 = this.binding.replyText;
        q.g(messageContentView3, "binding.replyText");
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(messageContentView3));
        Unit unit = Unit.f21442a;
        messageContentView2.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(linearLayout2, spannable));
        MessageContentView messageContentView4 = this.binding.replyText;
        q.g(messageContentView4, "binding.replyText");
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(messageContentView4, true);
        this.binding.replyAuthorAvatar.setImageURI(executedCommand.getAvatarURL());
    }

    public final void configureReply(ReferencedMessage reply, boolean z10, final Function0<Unit> onClick) {
        DraweeSpanStringBuilder spannable;
        q.h(reply, "reply");
        q.h(onClick, "onClick");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                MessageViewReplyPreview.configureReply$lambda$4(Function0.this, view);
            }
        }, 1, null);
        if (reply instanceof LoadedReferencedMessage) {
            LoadedReferencedMessage loadedReferencedMessage = (LoadedReferencedMessage) reply;
            Message message = loadedReferencedMessage.getMessage();
            ChannelSpineView channelSpineView = this.binding.replySpline;
            q.g(channelSpineView, "binding.replySpline");
            channelSpineView.setVisibility(z10 ? 0 : 8);
            LinearLayout linearLayout = this.binding.replyLeadingViews;
            q.g(linearLayout, "binding.replyLeadingViews");
            linearLayout.setVisibility(0);
            MessageContentView messageContentView = this.binding.replyText;
            q.g(messageContentView, "binding.replyText");
            messageContentView.setVisibility(0);
            if (message.getShouldShowRoleDot()) {
                RoleDotView roleDotView = this.binding.replyRoleDot;
                q.g(roleDotView, "binding.replyRoleDot");
                roleDotView.setVisibility(0);
                this.binding.replyRoleDot.configure(MessageKt.roleDotColor$default(message, 0, 1, null), 16);
            } else {
                RoleDotView roleDotView2 = this.binding.replyRoleDot;
                q.g(roleDotView2, "binding.replyRoleDot");
                roleDotView2.setVisibility(8);
            }
            Context context = getContext();
            q.g(context, "context");
            String avatarUrl = MessageKt.avatarUrl(message, context);
            if (avatarUrl == null || message.getUsername() == null || message.m22getAuthorIdwUX8bhU() == null) {
                SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
                q.g(simpleDraweeView, "binding.replyAuthorAvatar");
                simpleDraweeView.setVisibility(8);
                TextView textView = this.binding.replyAuthorName;
                q.g(textView, "binding.replyAuthorName");
                textView.setVisibility(8);
                SimpleDraweeView simpleDraweeView2 = this.binding.replyIcon;
                q.g(simpleDraweeView2, "binding.replyIcon");
                simpleDraweeView2.setVisibility(0);
            } else {
                SimpleDraweeView simpleDraweeView3 = this.binding.replyAuthorAvatar;
                q.g(simpleDraweeView3, "binding.replyAuthorAvatar");
                simpleDraweeView3.setVisibility(0);
                SimpleDraweeView simpleDraweeView4 = this.binding.replyIcon;
                q.g(simpleDraweeView4, "binding.replyIcon");
                simpleDraweeView4.setVisibility(8);
                this.binding.replyAuthorAvatar.setImageURI(avatarUrl);
                TextView textView2 = this.binding.replyAuthorName;
                q.g(textView2, "binding.replyAuthorName");
                textView2.setVisibility(0);
                this.binding.replyAuthorName.setText(message.getUsername());
                this.binding.replyAuthorName.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
            }
            if (loadedReferencedMessage.getSystemContent() != null) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding = this.binding;
                MessageContentView messageContentView2 = messageViewReplyPreviewBinding.replyText;
                LinearLayout linearLayout2 = messageViewReplyPreviewBinding.replyLeadingViews;
                q.g(linearLayout2, "binding.replyLeadingViews");
                messageContentView2.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(linearLayout2, loadedReferencedMessage.getSystemContent()));
            } else if (message.getContent() != null) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding2 = this.binding;
                MessageContentView messageContentView3 = messageViewReplyPreviewBinding2.replyText;
                LinearLayout linearLayout3 = messageViewReplyPreviewBinding2.replyLeadingViews;
                q.g(linearLayout3, "binding.replyLeadingViews");
                StructurableText content = message.getContent();
                Context context2 = getContext();
                String str = message.m25getId3Eiw7ao();
                boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
                boolean shouldShowRoleDot = message.getShouldShowRoleDot();
                boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
                Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
                q.g(fontMetrics, "binding.replyText.paint.fontMetrics");
                float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
                TextPaint paint = this.binding.replyText.getPaint();
                q.g(context2, "context");
                q.g(paint, "paint");
                spannable = TextUtilsKt.toSpannable(content, context2, str, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, paint, (r44 & 64) != 0 ? TextUtilsKt$toSpannable$1.INSTANCE : null, (r44 & 128) != 0 ? TextUtilsKt$toSpannable$2.INSTANCE : null, (r44 & 256) != 0 ? TextUtilsKt$toSpannable$3.INSTANCE : null, (r44 & 512) != 0 ? TextUtilsKt$toSpannable$4.INSTANCE : null, (r44 & 1024) != 0 ? TextUtilsKt$toSpannable$5.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? TextUtilsKt$toSpannable$6.INSTANCE : null, (r44 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? TextUtilsKt$toSpannable$7.INSTANCE : null, (r44 & 8192) != 0 ? TextUtilsKt$toSpannable$8.INSTANCE : null, (r44 & 16384) != 0 ? TextUtilsKt$toSpannable$9.INSTANCE : null, (32768 & r44) != 0 ? TextUtilsKt$toSpannable$10.INSTANCE : null, (65536 & r44) != 0 ? TextUtilsKt$toSpannable$11.INSTANCE : null, (131072 & r44) != 0 ? false : true, (262144 & r44) != 0 ? ThemeManagerKt.getTheme() : null, (r44 & 524288) != 0 ? -1.0f : baselineHeight);
                MessageContentView messageContentView4 = this.binding.replyText;
                q.g(messageContentView4, "binding.replyText");
                SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(messageContentView4));
                Unit unit = Unit.f21442a;
                messageContentView3.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(linearLayout3, spannable));
            } else {
                this.binding.replyText.setText((CharSequence) null);
            }
        } else if (reply instanceof SystemReferencedMessage) {
            ChannelSpineView channelSpineView2 = this.binding.replySpline;
            q.g(channelSpineView2, "binding.replySpline");
            channelSpineView2.setVisibility(z10 ? 0 : 8);
            LinearLayout linearLayout4 = this.binding.replyLeadingViews;
            q.g(linearLayout4, "binding.replyLeadingViews");
            linearLayout4.setVisibility(0);
            SimpleDraweeView simpleDraweeView5 = this.binding.replyAuthorAvatar;
            q.g(simpleDraweeView5, "binding.replyAuthorAvatar");
            simpleDraweeView5.setVisibility(0);
            SimpleDraweeView simpleDraweeView6 = this.binding.replyAuthorAvatar;
            q.g(simpleDraweeView6, "binding.replyAuthorAvatar");
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView6, ReactAsset.DefaultAvatar0);
            TextView textView3 = this.binding.replyAuthorName;
            q.g(textView3, "binding.replyAuthorName");
            textView3.setVisibility(8);
            SimpleDraweeView simpleDraweeView7 = this.binding.replyIcon;
            q.g(simpleDraweeView7, "binding.replyIcon");
            simpleDraweeView7.setVisibility(8);
            this.binding.replyIcon.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
            MessageContentView messageContentView5 = this.binding.replyText;
            q.g(messageContentView5, "binding.replyText");
            messageContentView5.setVisibility(0);
            MessageViewReplyPreviewBinding messageViewReplyPreviewBinding3 = this.binding;
            MessageContentView messageContentView6 = messageViewReplyPreviewBinding3.replyText;
            LinearLayout linearLayout5 = messageViewReplyPreviewBinding3.replyLeadingViews;
            q.g(linearLayout5, "binding.replyLeadingViews");
            messageContentView6.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(linearLayout5, ((SystemReferencedMessage) reply).getContent()));
        }
        if (this.binding.replyText.isLaidOut() && this.binding.replyText.getWidth() > 0) {
            MessageContentView messageContentView7 = this.binding.replyText;
            messageContentView7.measure(View.MeasureSpec.makeMeasureSpec(messageContentView7.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.binding.replyText.getLineBounds(0, this.replyTextLineBounds);
            Rect rect = this.replyTextLineBounds;
            int i10 = rect.bottom - rect.top;
            LinearLayout linearLayout6 = this.binding.replyLeadingViews;
            q.g(linearLayout6, "binding.replyLeadingViews");
            ViewGroup.LayoutParams layoutParams = linearLayout6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i10;
                linearLayout6.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        setImportantForAccessibility(1);
        w0.q0(this, new a() { 
            @Override 
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding4;
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding5;
                q.h(host, "host");
                q.h(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                Context context3 = MessageViewReplyPreview.this.getContext();
                q.g(context3, "context");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I18nUtilsKt.i18nFormat$default(context3, I18nMessage.MOBILE_REPLY_PREVIEW_A11Y_LABEL, null, 2, null));
                spannableStringBuilder.append((CharSequence) ", ");
                messageViewReplyPreviewBinding4 = MessageViewReplyPreview.this.binding;
                spannableStringBuilder.append(messageViewReplyPreviewBinding4.replyAuthorName.getText());
                spannableStringBuilder.append((CharSequence) ", ");
                messageViewReplyPreviewBinding5 = MessageViewReplyPreview.this.binding;
                spannableStringBuilder.append(messageViewReplyPreviewBinding5.replyText.getText());
                info.k0(spannableStringBuilder);
                Context context4 = MessageViewReplyPreview.this.getContext();
                q.g(context4, "context");
                info.b(new AccessibilityNodeInfoCompat.a(16, I18nUtilsKt.i18nFormat$default(context4, I18nMessage.MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL, null, 2, null)));
            }

            @Override 
            public boolean performAccessibilityAction(View host, int i11, Bundle bundle) {
                q.h(host, "host");
                if (i11 == 16) {
                    onClick.invoke();
                }
                return super.performAccessibilityAction(host, i11, bundle);
            }
        });
    }

    @Override 
    public View getSpineOriginView() {
        boolean z10;
        SimpleDraweeView it = this.binding.replyAuthorAvatar;
        q.g(it, "it");
        if (it.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            it = null;
        }
        if (it != null) {
            return it;
        }
        SimpleDraweeView simpleDraweeView = this.binding.replyIcon;
        q.g(simpleDraweeView, "binding.replyIcon");
        return simpleDraweeView;
    }

    
    public MessageViewReplyPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        MessageViewReplyPreviewBinding inflate = MessageViewReplyPreviewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.replyTextLineBounds = new Rect();
        SimpleDraweeView _init_$lambda$1 = inflate.replyIcon;
        if (!_init_$lambda$1.isInEditMode()) {
            q.g(_init_$lambda$1, "_init_$lambda$1");
            ReactAssetUtilsKt.setReactAsset(_init_$lambda$1, ReactAsset.Reply);
            ColorUtilsKt.setTintColor(_init_$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
            ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$1, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
        }
        TextView textView = inflate.replyAuthorName;
        q.g(textView, "binding.replyAuthorName");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = inflate.replyAuthorName;
        q.g(textView2, "binding.replyAuthorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeView simpleDraweeView = inflate.replyAuthorAvatar;
        q.g(simpleDraweeView, "binding.replyAuthorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        MessageContentView _init_$lambda$2 = inflate.replyText;
        q.g(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        float dimension = getResources().getDimension(R.dimen.message_start_guideline);
        float f10 = 2;
        float dimension2 = (dimension / f10) - (getResources().getDimension(R.dimen.spine_width) / f10);
        float dimension3 = (dimension - getResources().getDimension(R.dimen.message_reply_leading_views_margin_start)) - dimension2;
        inflate.replySpline.configureAsReplySpline();
        ChannelSpineView channelSpineView = inflate.replySpline;
        q.g(channelSpineView, "binding.replySpline");
        ViewGroup.LayoutParams layoutParams = channelSpineView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = (int) dimension3;
            marginLayoutParams.setMarginStart((int) dimension2);
            channelSpineView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
