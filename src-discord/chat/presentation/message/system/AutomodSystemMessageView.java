package com.discord.chat.presentation.message.system;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activityinviteembed.ActivityInviteEmbed;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.FlaggedMessageEmbed;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.databinding.AutomodSystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.ThreadStarterMessageHeaderView;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u000eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eH\u0002J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020'H\u0016J\u000e\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*J6\u0010+\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\r\u0010.\u001a\u00020/H\u0016¢\u0006\u0002\u00100R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, d2 = {"Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "accessories", "Ljava/util/ArrayList;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lkotlin/collections/ArrayList;", "allowChildGestures", "", "binding", "Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "configureAuthor", "", "message", "Lcom/discord/chat/bridge/Message;", "automodContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureCommunicationDisabled", "isCommunicationDisabled", "configureDivider", "showDivider", "generateMessageAccessories", "", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "setAccessoriesRecycledViewPool", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessage", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutomodSystemMessageView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage {
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;
    private final AutomodSystemMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ AutomodSystemMessageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @SuppressLint({"SetTextI18n"})
    private final void configureAuthor(Message message, final AutoModerationContext autoModerationContext, final ChatEventHandler chatEventHandler) {
        boolean z10;
        int i10;
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        Context context = getContext();
        q.f(context, "context");
        simpleDraweeView.setImageURI(MessageKt.avatarUrl(message, context));
        this.binding.authorName.setText(message.getUsername());
        this.binding.messageTagView.configureTagView(autoModerationContext.getHeaderBadgeText(), Boolean.FALSE, null, null, chatEventHandler);
        this.binding.automodMessageContextHeader.setText(autoModerationContext.getHeaderText());
        this.binding.timestamp.setText(message.getTimestamp());
        TextView configureAuthor$lambda$8 = this.binding.automodMessageChannel;
        String channelName = autoModerationContext.getMessage().getChannelName();
        if (channelName == null) {
            channelName = "channel";
        }
        configureAuthor$lambda$8.setText("#" + channelName);
        q.f(configureAuthor$lambda$8, "configureAuthor$lambda$8");
        if (autoModerationContext.getMessage().getChannelName() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        configureAuthor$lambda$8.setVisibility(i10);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$8, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.system.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutomodSystemMessageView.configureAuthor$lambda$8$lambda$7(ChatEventHandler.this, autoModerationContext, view);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthor$lambda$8$lambda$7(ChatEventHandler eventHandler, AutoModerationContext automodContext, View view) {
        String str;
        q.g(eventHandler, "$eventHandler");
        q.g(automodContext, "$automodContext");
        String str2 = ChannelId.m544toStringimpl(automodContext.getMessage().m24getChannelIdo4g7jtM());
        GuildId guildId = automodContext.getMessage().m25getGuildIdqOKuAAo();
        if (guildId != null) {
            str = GuildId.m557toStringimpl(guildId.m559unboximpl());
        } else {
            str = null;
        }
        eventHandler.onTapChannel(str2, str, null);
    }

    private final void configureCommunicationDisabled(boolean z10) {
        int i10;
        float f10;
        SimpleDraweeView configureCommunicationDisabled$lambda$9 = this.binding.guildCommunicationDisabledIcon;
        q.f(configureCommunicationDisabled$lambda$9, "configureCommunicationDisabled$lambda$9");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        configureCommunicationDisabled$lambda$9.setVisibility(i10);
        if (z10) {
            ReactAssetUtilsKt.setReactAsset(configureCommunicationDisabled$lambda$9, ReactAsset.ClockTimeout);
        }
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        if (z10) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        simpleDraweeView.setAlpha(f10);
    }

    private final void configureDivider(boolean z10) {
        int i10;
        View view = this.binding.messageHeaderDivider;
        q.f(view, "binding.messageHeaderDivider");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private final List<MessageAccessory> generateMessageAccessories(Message message, MessageContext messageContext) {
        List<MessageReaction> reactions;
        this.accessories.clear();
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext == null) {
            return this.accessories;
        }
        FlaggedMessageEmbed message2 = autoModerationContext.getMessage();
        MessageType messageType = MessageType.DEFAULT;
        String str = message2.m26getId3Eiw7ao();
        long j10 = message2.m24getChannelIdo4g7jtM();
        GuildId guildId = message2.m25getGuildIdqOKuAAo();
        UserId userId = message2.m27getUserIdwUX8bhU();
        String username = message2.getUsername();
        String avatarURL = message2.getAvatarURL();
        StructurableText content = message2.getContent();
        int usernameColor = message2.getUsernameColor();
        Integer roleColor = message2.getRoleColor();
        boolean shouldShowRoleDot = message2.getShouldShowRoleDot();
        Boolean communicationDisabled = message2.getCommunicationDisabled();
        boolean z10 = false;
        Message message3 = new Message(messageType, str, (String) null, j10, guildId, (MessageState) null, userId, 0L, (String) null, (Float) null, (String) null, username, Integer.valueOf(usernameColor), roleColor, shouldShowRoleDot, false, (Integer) null, avatarURL, (String) null, (List) null, (List) null, (Float) null, content, (List) null, (List) null, (Boolean) null, (Boolean) null, (List) null, (List) null, message.getRoleIcon(), (ConnectionsRoleTag) null, (ThreadEmbed) null, false, (Boolean) null, (Boolean) null, (ReferencedMessage) null, (ExecutedCommand) null, (List) null, (String) null, Boolean.valueOf(communicationDisabled != null ? communicationDisabled.booleanValue() : false), (String) null, (Boolean) null, (Integer) null, (String) null, (EphemeralIndication) null, (SurveyIndication) null, (InteractionStatus) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (List) null, (Boolean) null, (Boolean) null, (Long) null, (Sticker) null, (String) null, (String) null, (Boolean) null, (ActivityInviteEmbed) null, false, (ForumPostActions) null, autoModerationContext, (List) null, (GiftEmbed) null, (Integer) null, (String) null, (List) null, -541227100, 2147483518, 31, (DefaultConstructorMarker) null);
        if (autoModerationContext.getNotification() != null) {
            this.accessories.add(new AutoModerationNotificationEmbedAccessory(message3.m16getId3Eiw7ao(), message, autoModerationContext, null));
        } else {
            this.accessories.add(new FlaggedMessageEmbedAccessory(message3.m16getId3Eiw7ao(), message3, messageContext, null));
            this.accessories.add(new FlaggedMessageActionBarAccessory(message3.m16getId3Eiw7ao(), message, autoModerationContext, null));
        }
        if (message.getReactions() != null && (!reactions.isEmpty())) {
            z10 = true;
        }
        if (z10) {
            this.accessories.add(new ReactionsMessageAccessory(message.m16getId3Eiw7ao(), message.getReactions(), messageContext.getCanAddNewReactions(), messageContext.getUseAddBurstReaction(), messageContext.getAddReactionLabel(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getAddNewBurstReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null, messageContext.getUseSortedReactions(), null));
        }
        ThreadEmbed threadEmbed = message.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message.m16getId3Eiw7ao(), threadEmbed, null));
        }
        return this.accessories;
    }

    public static /* synthetic */ void setMessage$default(AutomodSystemMessageView automodSystemMessageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        if ((i10 & 8) != 0) {
            componentProvider = null;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        automodSystemMessageView.setMessage(message, messageContext, chatEventHandler, componentProvider, z10);
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        q.f(simpleDraweeView, "binding.authorAvatar");
        return simpleDraweeView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        q.g(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void setAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        q.g(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    public final void setMessage(Message message, MessageContext messageContext, ChatEventHandler eventHandler, ComponentProvider componentProvider, boolean z10) {
        boolean z11;
        q.g(message, "message");
        q.g(messageContext, "messageContext");
        q.g(eventHandler, "eventHandler");
        this.allowChildGestures = z10;
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext != null) {
            configureAuthor(message, autoModerationContext, eventHandler);
            configureCommunicationDisabled(q.b(message.getCommunicationDisabled(), Boolean.TRUE));
            configureDivider(messageContext.getShowDivider());
            String threadStarterMessageHeader = message.getThreadStarterMessageHeader();
            ThreadStarterMessageHeaderView threadStarterMessageHeaderView = this.binding.threadStarterHeader;
            if (message.getReferencedMessage() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            threadStarterMessageHeaderView.configure(threadStarterMessageHeader, z11);
            this.binding.replyPreview.clear();
            this.binding.accessoriesView.m198setAccessoriesRC8ZMxU(message.m16getId3Eiw7ao(), message.m14getChannelIdo4g7jtM(), message.m15getGuildIdqOKuAAo(), generateMessageAccessories(message, messageContext), eventHandler, componentProvider);
        }
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    public Integer spacingPxOverride() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(8));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        AutomodSystemMessageViewBinding inflate = AutomodSystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(4), 1, null);
        inflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.message_divider_light, R.color.message_divider_dark));
        TextView _init_$lambda$0 = inflate.messageHeaderTitle;
        _init_$lambda$0.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, discordFont);
        TextView _init_$lambda$1 = inflate.messageHeaderSubtitle;
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryNormal);
        TextView _init_$lambda$2 = inflate.authorName;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
        q.f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, 16.0f, 20.0f);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        q.f(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        TextView _init_$lambda$3 = inflate.automodMessageContextHeader;
        q.f(_init_$lambda$3, "_init_$lambda$3");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$3, discordFont);
        _init_$lambda$3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$3, 16.0f, 20.0f);
        TextView _init_$lambda$4 = inflate.automodMessageChannel;
        _init_$lambda$4.setBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.brand_500, R.color.brand_600));
        _init_$lambda$4.setTextColor(ColorUtilsKt.getThemeColor(context, R.color.white_100, R.color.white_160));
        q.f(_init_$lambda$4, "_init_$lambda$4");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$4, discordFont);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$4, 12.0f, 15.0f);
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$4, SizeUtilsKt.getDpToPx(4));
        TextView _init_$lambda$5 = inflate.timestamp;
        q.f(_init_$lambda$5, "_init_$lambda$5");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$5, DiscordFont.PrimaryMedium);
        _init_$lambda$5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$5, 12.0f, 15.0f);
        this.accessories = new ArrayList<>(2);
    }
}
