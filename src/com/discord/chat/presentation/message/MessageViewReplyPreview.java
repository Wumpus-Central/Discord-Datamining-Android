package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C2549a;
import androidx.core.view.C2733w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.discord.SetTextSizeSpKt;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.C4254R;
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
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110$R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;", "replyTextLineBounds", "Landroid/graphics/Rect;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "clear", "", "configureExecutedCommand", "messageId", "Lcom/discord/primitives/MessageId;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "shouldAnimateEmoji", "", "shouldShowRoleDot", "shouldShowRoleOnName", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureExecutedCommand-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V", "configureReply", "reply", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "showSpine", "onClick", "Lkotlin/Function0;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageViewReplyPreview extends ConstraintLayout implements SpineParentMessage {
    private final MessageViewReplyPreviewBinding binding;
    private final Rect replyTextLineBounds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageViewReplyPreview(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ MessageViewReplyPreview(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public static final void configureExecutedCommand_LdU2QRA$lambda$7(ChatEventHandler eventHandler, String messageId, ExecutedCommand executedCommand, View view) {
        C9971q.m14633g(eventHandler, "$eventHandler");
        C9971q.m14633g(messageId, "$messageId");
        C9971q.m14633g(executedCommand, "$executedCommand");
        eventHandler.mo41713onTapAvatarx5gers8(messageId, executedCommand.m41668getUserIdre6GcUE());
    }

    public static /* synthetic */ void configureReply$default(MessageViewReplyPreview messageViewReplyPreview, ReferencedMessage referencedMessage, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        messageViewReplyPreview.configureReply(referencedMessage, z, function0);
    }

    public static final void configureReply$lambda$4(Function0 onClick, View view) {
        C9971q.m14633g(onClick, "$onClick");
        onClick.invoke();
    }

    public final void clear() {
        ChannelSpineView channelSpineView = this.binding.replySpline;
        C9971q.m14634f(channelSpineView, "binding.replySpline");
        channelSpineView.setVisibility(8);
        LinearLayout linearLayout = this.binding.replyLeadingViews;
        C9971q.m14634f(linearLayout, "binding.replyLeadingViews");
        linearLayout.setVisibility(8);
        MessageContentView messageContentView = this.binding.replyText;
        C9971q.m14634f(messageContentView, "binding.replyText");
        messageContentView.setVisibility(8);
    }

    /* renamed from: configureExecutedCommand-LdU2QRA */
    public final void m41761configureExecutedCommandLdU2QRA(final String messageId, final ExecutedCommand executedCommand, boolean z, boolean z2, boolean z3, final ChatEventHandler eventHandler) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(executedCommand, "executedCommand");
        C9971q.m14633g(eventHandler, "eventHandler");
        ChannelSpineView channelSpineView = this.binding.replySpline;
        C9971q.m14634f(channelSpineView, "binding.replySpline");
        channelSpineView.setVisibility(0);
        MessageContentView messageContentView = this.binding.replyText;
        C9971q.m14634f(messageContentView, "binding.replyText");
        messageContentView.setVisibility(0);
        LinearLayout linearLayout = this.binding.replyLeadingViews;
        C9971q.m14634f(linearLayout, "binding.replyLeadingViews");
        linearLayout.setVisibility(0);
        SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
        C9971q.m14634f(simpleDraweeView, "binding.replyAuthorAvatar");
        simpleDraweeView.setVisibility(0);
        TextView textView = this.binding.replyAuthorName;
        C9971q.m14634f(textView, "binding.replyAuthorName");
        textView.setVisibility(8);
        SimpleDraweeView simpleDraweeView2 = this.binding.replyAuthorAvatar;
        C9971q.m14634f(simpleDraweeView2, "binding.replyAuthorAvatar");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView2, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageViewReplyPreview.configureExecutedCommand_LdU2QRA$lambda$7(ChatEventHandler.this, messageId, executedCommand, view);
            }
        }, 1, null);
        SimpleDraweeView simpleDraweeView3 = this.binding.replyIcon;
        C9971q.m14634f(simpleDraweeView3, "binding.replyIcon");
        simpleDraweeView3.setVisibility(8);
        MessageViewReplyPreviewBinding messageViewReplyPreviewBinding = this.binding;
        MessageContentView messageContentView2 = messageViewReplyPreviewBinding.replyText;
        LinearLayout linearLayout2 = messageViewReplyPreviewBinding.replyLeadingViews;
        C9971q.m14634f(linearLayout2, "binding.replyLeadingViews");
        AnnotatedStructurableText content = executedCommand.getContent();
        Context context = getContext();
        Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
        C9971q.m14634f(fontMetrics, "binding.replyText.paint.fontMetrics");
        float baselineHeight = TextUtilsKt.getBaselineHeight(fontMetrics);
        C9971q.m14634f(context, "context");
        DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(content, context, messageId, z, z2, z3, new MessageViewReplyPreview$configureExecutedCommand$2(eventHandler, messageId), null, null, null, null, new MessageViewReplyPreview$configureExecutedCommand$3(eventHandler), new MessageViewReplyPreview$configureExecutedCommand$4(eventHandler), null, null, new MessageViewReplyPreview$configureExecutedCommand$5(executedCommand), null, false, null, baselineHeight, 242624, null);
        MessageContentView messageContentView3 = this.binding.replyText;
        C9971q.m14634f(messageContentView3, "binding.replyText");
        SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(messageContentView3));
        Unit unit = Unit.f22042a;
        messageContentView2.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(linearLayout2, spannable$default));
        MessageContentView messageContentView4 = this.binding.replyText;
        C9971q.m14634f(messageContentView4, "binding.replyText");
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(messageContentView4, true);
        this.binding.replyAuthorAvatar.setImageURI(executedCommand.getAvatarURL());
    }

    public final void configureReply(ReferencedMessage reply, boolean z, final Function0<Unit> onClick) {
        C9971q.m14633g(reply, "reply");
        C9971q.m14633g(onClick, "onClick");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageViewReplyPreview.configureReply$lambda$4(Function0.this, view);
            }
        }, 1, null);
        if (reply instanceof LoadedReferencedMessage) {
            LoadedReferencedMessage loadedReferencedMessage = (LoadedReferencedMessage) reply;
            Message message = loadedReferencedMessage.getMessage();
            ChannelSpineView channelSpineView = this.binding.replySpline;
            C9971q.m14634f(channelSpineView, "binding.replySpline");
            channelSpineView.setVisibility(z ? 0 : 8);
            LinearLayout linearLayout = this.binding.replyLeadingViews;
            C9971q.m14634f(linearLayout, "binding.replyLeadingViews");
            linearLayout.setVisibility(0);
            MessageContentView messageContentView = this.binding.replyText;
            C9971q.m14634f(messageContentView, "binding.replyText");
            messageContentView.setVisibility(0);
            if (message.getShouldShowRoleDot()) {
                RoleDotView roleDotView = this.binding.replyRoleDot;
                C9971q.m14634f(roleDotView, "binding.replyRoleDot");
                roleDotView.setVisibility(0);
                this.binding.replyRoleDot.configure(MessageKt.roleDotColor$default(message, 0, 1, null), 16);
            } else {
                RoleDotView roleDotView2 = this.binding.replyRoleDot;
                C9971q.m14634f(roleDotView2, "binding.replyRoleDot");
                roleDotView2.setVisibility(8);
            }
            Context context = getContext();
            C9971q.m14634f(context, "context");
            String avatarUrl = MessageKt.avatarUrl(message, context);
            if (avatarUrl == null || message.getUsername() == null || message.m41576getAuthorIdwUX8bhU() == null) {
                SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
                C9971q.m14634f(simpleDraweeView, "binding.replyAuthorAvatar");
                simpleDraweeView.setVisibility(8);
                TextView textView = this.binding.replyAuthorName;
                C9971q.m14634f(textView, "binding.replyAuthorName");
                textView.setVisibility(8);
                SimpleDraweeView simpleDraweeView2 = this.binding.replyIcon;
                C9971q.m14634f(simpleDraweeView2, "binding.replyIcon");
                simpleDraweeView2.setVisibility(0);
            } else {
                SimpleDraweeView simpleDraweeView3 = this.binding.replyAuthorAvatar;
                C9971q.m14634f(simpleDraweeView3, "binding.replyAuthorAvatar");
                simpleDraweeView3.setVisibility(0);
                SimpleDraweeView simpleDraweeView4 = this.binding.replyIcon;
                C9971q.m14634f(simpleDraweeView4, "binding.replyIcon");
                simpleDraweeView4.setVisibility(8);
                this.binding.replyAuthorAvatar.setImageURI(avatarUrl);
                TextView textView2 = this.binding.replyAuthorName;
                C9971q.m14634f(textView2, "binding.replyAuthorName");
                textView2.setVisibility(0);
                this.binding.replyAuthorName.setText(message.getUsername());
                this.binding.replyAuthorName.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
            }
            if (loadedReferencedMessage.getSystemContent() != null) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding = this.binding;
                MessageContentView messageContentView2 = messageViewReplyPreviewBinding.replyText;
                LinearLayout linearLayout2 = messageViewReplyPreviewBinding.replyLeadingViews;
                C9971q.m14634f(linearLayout2, "binding.replyLeadingViews");
                messageContentView2.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(linearLayout2, loadedReferencedMessage.getSystemContent()));
            } else if (message.getContent() != null) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding2 = this.binding;
                MessageContentView messageContentView3 = messageViewReplyPreviewBinding2.replyText;
                LinearLayout linearLayout3 = messageViewReplyPreviewBinding2.replyLeadingViews;
                C9971q.m14634f(linearLayout3, "binding.replyLeadingViews");
                StructurableText content = message.getContent();
                Context context2 = getContext();
                C9971q.m14634f(context2, "context");
                String str = message.m41579getId3Eiw7ao();
                boolean shouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
                boolean shouldShowRoleDot = message.getShouldShowRoleDot();
                boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
                Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
                C9971q.m14634f(fontMetrics, "binding.replyText.paint.fontMetrics");
                DraweeSpanStringBuilder spannable$default = TextUtilsKt.toSpannable$default(content, context2, str, shouldAnimateEmoji, shouldShowRoleDot, shouldShowRoleOnName, null, null, null, null, null, null, null, null, null, null, null, true, null, TextUtilsKt.getBaselineHeight(fontMetrics), 196576, null);
                MessageContentView messageContentView4 = this.binding.replyText;
                C9971q.m14634f(messageContentView4, "binding.replyText");
                SpannableExtensionsKt.coverWithSpan(spannable$default, new BackgroundSpanDrawer(messageContentView4));
                Unit unit = Unit.f22042a;
                messageContentView3.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(linearLayout3, spannable$default));
            } else {
                this.binding.replyText.setText((CharSequence) null);
            }
        } else if (reply instanceof SystemReferencedMessage) {
            ChannelSpineView channelSpineView2 = this.binding.replySpline;
            C9971q.m14634f(channelSpineView2, "binding.replySpline");
            channelSpineView2.setVisibility(z ? 0 : 8);
            LinearLayout linearLayout4 = this.binding.replyLeadingViews;
            C9971q.m14634f(linearLayout4, "binding.replyLeadingViews");
            linearLayout4.setVisibility(0);
            SimpleDraweeView simpleDraweeView5 = this.binding.replyAuthorAvatar;
            C9971q.m14634f(simpleDraweeView5, "binding.replyAuthorAvatar");
            simpleDraweeView5.setVisibility(0);
            SimpleDraweeView simpleDraweeView6 = this.binding.replyAuthorAvatar;
            C9971q.m14634f(simpleDraweeView6, "binding.replyAuthorAvatar");
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView6, ReactAsset.DefaultAvatar0);
            TextView textView3 = this.binding.replyAuthorName;
            C9971q.m14634f(textView3, "binding.replyAuthorName");
            textView3.setVisibility(8);
            SimpleDraweeView simpleDraweeView7 = this.binding.replyIcon;
            C9971q.m14634f(simpleDraweeView7, "binding.replyIcon");
            simpleDraweeView7.setVisibility(8);
            this.binding.replyIcon.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
            MessageContentView messageContentView5 = this.binding.replyText;
            C9971q.m14634f(messageContentView5, "binding.replyText");
            messageContentView5.setVisibility(0);
            MessageViewReplyPreviewBinding messageViewReplyPreviewBinding3 = this.binding;
            MessageContentView messageContentView6 = messageViewReplyPreviewBinding3.replyText;
            LinearLayout linearLayout5 = messageViewReplyPreviewBinding3.replyLeadingViews;
            C9971q.m14634f(linearLayout5, "binding.replyLeadingViews");
            messageContentView6.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(linearLayout5, ((SystemReferencedMessage) reply).getContent()));
        }
        if (this.binding.replyText.isLaidOut() && this.binding.replyText.getWidth() > 0) {
            MessageContentView messageContentView7 = this.binding.replyText;
            messageContentView7.measure(View.MeasureSpec.makeMeasureSpec(messageContentView7.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.binding.replyText.getLineBounds(0, this.replyTextLineBounds);
            Rect rect = this.replyTextLineBounds;
            int i = rect.bottom - rect.top;
            LinearLayout linearLayout6 = this.binding.replyLeadingViews;
            C9971q.m14634f(linearLayout6, "binding.replyLeadingViews");
            ViewGroup.LayoutParams layoutParams = linearLayout6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i;
                linearLayout6.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        setImportantForAccessibility(1);
        C2733w0.m36990q0(this, new C2549a() { // from class: com.discord.chat.presentation.message.MessageViewReplyPreview$configureReply$4
            @Override // androidx.core.view.C2549a
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding4;
                MessageViewReplyPreviewBinding messageViewReplyPreviewBinding5;
                C9971q.m14633g(host, "host");
                C9971q.m14633g(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                Context context3 = MessageViewReplyPreview.this.getContext();
                C9971q.m14634f(context3, "context");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I18nUtilsKt.i18nFormat$default(context3, I18nMessage.MOBILE_REPLY_PREVIEW_A11Y_LABEL, null, 2, null));
                spannableStringBuilder.append((CharSequence) ", ");
                messageViewReplyPreviewBinding4 = MessageViewReplyPreview.this.binding;
                spannableStringBuilder.append(messageViewReplyPreviewBinding4.replyAuthorName.getText());
                spannableStringBuilder.append((CharSequence) ", ");
                messageViewReplyPreviewBinding5 = MessageViewReplyPreview.this.binding;
                spannableStringBuilder.append(messageViewReplyPreviewBinding5.replyText.getText());
                info.m37381e0(spannableStringBuilder);
                Context context4 = MessageViewReplyPreview.this.getContext();
                C9971q.m14634f(context4, "context");
                info.m37388b(new AccessibilityNodeInfoCompat.C2556a(16, I18nUtilsKt.i18nFormat$default(context4, I18nMessage.MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL, null, 2, null)));
            }

            @Override // androidx.core.view.C2549a
            public boolean performAccessibilityAction(View host, int i2, Bundle bundle) {
                C9971q.m14633g(host, "host");
                if (i2 == 16) {
                    onClick.invoke();
                }
                return super.performAccessibilityAction(host, i2, bundle);
            }
        });
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        boolean z;
        SimpleDraweeView it = this.binding.replyAuthorAvatar;
        C9971q.m14634f(it, "it");
        if (it.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            it = null;
        }
        if (it != null) {
            return it;
        }
        SimpleDraweeView simpleDraweeView = this.binding.replyIcon;
        C9971q.m14634f(simpleDraweeView, "binding.replyIcon");
        return simpleDraweeView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewReplyPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        MessageViewReplyPreviewBinding inflate = MessageViewReplyPreviewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.replyTextLineBounds = new Rect();
        SimpleDraweeView _init_$lambda$1 = inflate.replyIcon;
        if (!_init_$lambda$1.isInEditMode()) {
            C9971q.m14634f(_init_$lambda$1, "_init_$lambda$1");
            ReactAssetUtilsKt.setReactAsset(_init_$lambda$1, ReactAsset.Reply);
            ColorUtilsKt.setTintColor(_init_$lambda$1, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
            ViewBackgroundUtilsKt.setBackgroundOval$default(_init_$lambda$1, ThemeManagerKt.getTheme().getBackgroundTertiary(), 0, 2, null);
        }
        TextView textView = inflate.replyAuthorName;
        C9971q.m14634f(textView, "binding.replyAuthorName");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = inflate.replyAuthorName;
        C9971q.m14634f(textView2, "binding.replyAuthorName");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
        SimpleDraweeView simpleDraweeView = inflate.replyAuthorAvatar;
        C9971q.m14634f(simpleDraweeView, "binding.replyAuthorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        MessageContentView _init_$lambda$2 = inflate.replyText;
        C9971q.m14634f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 12.0f);
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
        float dimension = getResources().getDimension(C4254R.dimen.message_start_guideline);
        float f = 2;
        float dimension2 = (dimension / f) - (getResources().getDimension(C4254R.dimen.spine_width) / f);
        float dimension3 = (dimension - getResources().getDimension(C4254R.dimen.message_reply_leading_views_margin_start)) - dimension2;
        inflate.replySpline.configureAsReplySpline();
        ChannelSpineView channelSpineView = inflate.replySpline;
        C9971q.m14634f(channelSpineView, "binding.replySpline");
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
