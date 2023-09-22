package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.discord.activity_invites.ActivityInviteEmbedView;
import com.discord.chat.R;
import com.discord.chat.bridge.UploadProgress;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.sticker.StickerFormatType;
import com.discord.chat.databinding.TimestampViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.chat.presentation.message.messagepart.UploadProgressMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.message.view.ActivityBookmarkView;
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView;
import com.discord.chat.presentation.message.view.ChannelPromptActionsView;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView;
import com.discord.chat.presentation.message.view.EphemeralIndicationView;
import com.discord.chat.presentation.message.view.FileAttachmentView;
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.chat.presentation.message.view.GiftView;
import com.discord.chat.presentation.message.view.GuildEventInviteView;
import com.discord.chat.presentation.message.view.GuildInviteDisabledView;
import com.discord.chat.presentation.message.view.GuildInviteView;
import com.discord.chat.presentation.message.view.ImageAttachmentView;
import com.discord.chat.presentation.message.view.InfoLinkView;
import com.discord.chat.presentation.message.view.InteractionStatusView;
import com.discord.chat.presentation.message.view.MediaMosaicView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView;
import com.discord.chat.presentation.message.view.SurveyIndicationView;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.message.view.VideoAttachmentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.viewholder.ActivityBookmarkViewHolder;
import com.discord.chat.presentation.message.viewholder.ActivityInviteEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.AutoModerationNotificationEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ChannelPromptActionsViewHolder;
import com.discord.chat.presentation.message.viewholder.EmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.EmbeddedActivityInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.EphemeralIndicationViewHolder;
import com.discord.chat.presentation.message.viewholder.FileAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.FlaggedMessageActionBarViewHolder;
import com.discord.chat.presentation.message.viewholder.FlaggedMessageEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ForumPostActionBarViewHolder;
import com.discord.chat.presentation.message.viewholder.GiftViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildEventInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildInviteDisabledViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.ImageAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.InfoLinkViewHolder;
import com.discord.chat.presentation.message.viewholder.InteractionStatusViewHolder;
import com.discord.chat.presentation.message.viewholder.InviteToSpeakViewHolder;
import com.discord.chat.presentation.message.viewholder.MediaMosaicAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder;
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.PostPreviewEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ReactionsViewHolder;
import com.discord.chat.presentation.message.viewholder.RoleSubscriptionPurchaseViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerApngViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerGifViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerLottieViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerPartViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerPngViewHolder;
import com.discord.chat.presentation.message.viewholder.SurveyIndicationViewHolder;
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.TimestampViewHolder;
import com.discord.chat.presentation.message.viewholder.UploadProgressViewHolder;
import com.discord.chat.presentation.message.viewholder.VideoAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.VoiceMessageViewHolder;
import com.discord.chat.presentation.message.viewholder.WelcomeStickerViewHolder;
import com.discord.chat.presentation.root.ChatView;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.chat.presentation.uploadprogress.UploadProgressView;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt;
import com.discord.misc.utilities.view.ViewLocationUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.reactions.ReactionsView;
import com.discord.recycler_view.utils.ItemDiffer;
import com.discord.sticker.StickerView;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002BCB\u0015\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e02¢\u0006\u0004\b@\u0010AJM\u0010\u0011\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010!\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001fJ\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u0018\u0010+\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0005H\u0016J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\u0010\u0010/\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005H\u0016J\u0010\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020\u0005H\u0016R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00107R!\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0004\u00108R!\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u00109R!\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006D"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/primitives/MessageId;", "messageId", "", "attachmentIndex", "", "type", "", "portal", "embedIndex", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "onMediaClicked-l3ndG-o", "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Lcom/discord/chat/reactevents/ViewResizeMode;)V", "onMediaClicked", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/GuildId;", "guildId", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "items", "setItems-bo5iIEc", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;)V", "setItems", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "setEventHandler", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "botComponentProvider", "setComponentProvider", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;", "listener", "setMessageContentViewLifecycleListener", "holder", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", ViewProps.POSITION, "onBindViewHolder", "getItemCount", "getItemViewType", "", "getItemId", "Lkotlin/Function0;", "measureAndLayout", "Lkotlin/jvm/functions/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Ljava/util/List;", "Ljava/lang/String;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/GuildId;", "messageContentViewLifecycleListener", "Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;", "Lkotlin/Function1;", "onTapSpoiler", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "MessageContentViewLifecycleListener", "ViewTypes", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageAccessoriesAdapter extends RecyclerView.Adapter<MessagePartViewHolder> {
    private ComponentProvider botComponentProvider;
    private ChannelId channelId;
    private ChatEventHandler eventHandler;
    private GuildId guildId;
    private List<? extends MessageAccessory> items;
    private final Function0<Unit> measureAndLayout;
    private MessageContentViewLifecycleListener messageContentViewLifecycleListener;
    private String messageId;
    private Function1<? super MessagePartViewHolder, Unit> onTapSpoiler = new MessageAccessoriesAdapter$onTapSpoiler$1(this);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$MessageContentViewLifecycleListener;", "", "onAttachedToWindow", "", "messageContentView", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "onDetachedFromWindow", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface MessageContentViewLifecycleListener {
        void onAttachedToWindow(MessageContentView messageContentView);

        void onDetachedFromWindow();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter$ViewTypes;", "", "()V", "ACTIVITY_BOOKMARK", "", "ACTIVITY_INVITE_EMBED", "AUDIO_ATTACHMENT", "AUTO_MODERATION_NOTIFICATION_EMBED", "BOT_COMPONENTS", "CHANNEL_DEADCHAT_PROMPT_ACTIONS", "CONTENT", "EMBED", "EMBEDDED_ACTIVITY_INVITE", "EPHEMERAL_INDICATION", "FILE_ATTACHMENT", "FLAGGED_MESSAGE_ACTION_BAR", "FLAGGED_MESSAGE_EMBED", "FORUM_POST_ACTION_BAR", "GIFT", "GUILD_EVENT_INVITE", "GUILD_INVITE", "GUILD_INVITE_DISABLED", "IMAGE_ATTACHMENT", "INFO_LINK", "INTERACTION_STATUS", "MEDIA_MOSAIC_ATTACHMENT", "POST_PREVIEW_EMBED", "REACTIONS", "ROLE_SUBSCRIPTION_PURCHASE", "STAGE_INVITE_TO_SPEAK", "STICKER_APNG", "STICKER_GIF", "STICKER_LOTTIE", "STICKER_PNG", "SURVEY_INDICATION", "THREAD_EMBED", "TIMESTAMP", "UPLOAD_PROGRESS", "VIDEO_ATTACHMENT", "WELCOME_STICKER", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class ViewTypes {
        public static final int ACTIVITY_BOOKMARK = 30;
        public static final int ACTIVITY_INVITE_EMBED = 17;
        public static final int AUDIO_ATTACHMENT = 29;
        public static final int AUTO_MODERATION_NOTIFICATION_EMBED = 33;
        public static final int BOT_COMPONENTS = 12;
        public static final int CHANNEL_DEADCHAT_PROMPT_ACTIONS = 34;
        public static final int CONTENT = 0;
        public static final int EMBED = 1;
        public static final int EMBEDDED_ACTIVITY_INVITE = 31;
        public static final int EPHEMERAL_INDICATION = 18;
        public static final int FILE_ATTACHMENT = 11;
        public static final int FLAGGED_MESSAGE_ACTION_BAR = 22;
        public static final int FLAGGED_MESSAGE_EMBED = 21;
        public static final int FORUM_POST_ACTION_BAR = 20;
        public static final int GIFT = 16;
        public static final int GUILD_EVENT_INVITE = 15;
        public static final int GUILD_INVITE = 5;
        public static final int GUILD_INVITE_DISABLED = 25;
        public static final int IMAGE_ATTACHMENT = 2;
        public static final int INFO_LINK = 35;
        public static final ViewTypes INSTANCE = new ViewTypes();
        public static final int INTERACTION_STATUS = 19;
        public static final int MEDIA_MOSAIC_ATTACHMENT = 26;
        public static final int POST_PREVIEW_EMBED = 32;
        public static final int REACTIONS = 4;
        public static final int ROLE_SUBSCRIPTION_PURCHASE = 23;
        public static final int STAGE_INVITE_TO_SPEAK = 28;
        public static final int STICKER_APNG = 7;
        public static final int STICKER_GIF = 27;
        public static final int STICKER_LOTTIE = 8;
        public static final int STICKER_PNG = 6;
        public static final int SURVEY_INDICATION = 24;
        public static final int THREAD_EMBED = 9;
        public static final int TIMESTAMP = 13;
        public static final int UPLOAD_PROGRESS = 3;
        public static final int VIDEO_ATTACHMENT = 10;
        public static final int WELCOME_STICKER = 14;

        private ViewTypes() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MessageAccessoriesAdapter(Function0<Unit> measureAndLayout) {
        List<? extends MessageAccessory> i10;
        q.h(measureAndLayout, "measureAndLayout");
        this.measureAndLayout = measureAndLayout;
        i10 = j.i();
        this.items = i10;
        setHasStableIds(true);
    }

    
    public static final void onBindViewHolder$lambda$0(MessageAccessory part, MessageAccessoriesAdapter this$0, MessagePartViewHolder holder, View view) {
        q.h(part, "$part");
        q.h(this$0, "this$0");
        q.h(holder, "$holder");
        this$0.m213onMediaClickedl3ndGo(holder, part.mo236getMessageId3Eiw7ao(), ((ImageAttachmentMessageAccessory) part).getAttachmentIndex(), "attachment", null, null, ViewResizeMode.Fill);
    }

    
    public static final void onBindViewHolder$lambda$1(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        String str = this$0.messageId;
        q.e(str);
        ChatEventHandler.DefaultImpls.m201onTapReactionu7_MRrM$default(chatEventHandler, str, null, null, 4, null);
    }

    
    public static final void onBindViewHolder$lambda$2(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        String str = this$0.messageId;
        q.e(str);
        chatEventHandler.mo183onTapReactionu7_MRrM(str, null, Boolean.TRUE);
    }

    
    public static final void onBindViewHolder$lambda$3(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        String str = this$0.messageId;
        q.e(str);
        ChannelId channelId = this$0.channelId;
        q.e(channelId);
        chatEventHandler.mo174onTapFollowForumPostpfaIj0E(str, channelId.m619unboximpl());
    }

    
    public static final void onBindViewHolder$lambda$4(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        ChannelId channelId = this$0.channelId;
        q.e(channelId);
        long j10 = channelId.m619unboximpl();
        GuildId guildId = this$0.guildId;
        q.e(guildId);
        chatEventHandler.mo188onTapShareForumPostmgk6anA(j10, guildId.m632unboximpl());
    }

    
    public static final void onBindViewHolder$lambda$5(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        String str = this$0.messageId;
        q.e(str);
        ChatEventHandler.DefaultImpls.m201onTapReactionu7_MRrM$default(chatEventHandler, str, null, null, 4, null);
    }

    
    public static final void onBindViewHolder$lambda$6(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        ChatEventHandler chatEventHandler = this$0.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        String str = this$0.messageId;
        q.e(str);
        ChannelId channelId = this$0.channelId;
        q.e(channelId);
        chatEventHandler.mo184onTapReactionOverflowpfaIj0E(str, channelId.m619unboximpl());
    }

    
    public static final void onBindViewHolder$lambda$8(MessageAccessoriesAdapter this$0, View view) {
        q.h(this$0, "this$0");
        String str = this$0.messageId;
        if (str != null) {
            ChatEventHandler chatEventHandler = this$0.eventHandler;
            if (chatEventHandler == null) {
                q.y("eventHandler");
                chatEventHandler = null;
            }
            chatEventHandler.mo173onTapDismissMediaPostSharePrompt1xi1bu0(str);
        }
    }

    
    
    public final void m213onMediaClickedl3ndGo(MessagePartViewHolder messagePartViewHolder, String str, int i10, String str2, Double d10, Integer num, ViewResizeMode viewResizeMode) {
        View itemView = messagePartViewHolder.itemView;
        q.g(itemView, "itemView");
        Point locationInWindow = ViewLocationUtilsKt.getLocationInWindow(itemView);
        ChatEventHandler chatEventHandler = this.eventHandler;
        if (chatEventHandler == null) {
            q.y("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo176onTapImagea6FnOk(str, i10, str2, messagePartViewHolder.itemView.getWidth(), messagePartViewHolder.itemView.getHeight(), locationInWindow.x, locationInWindow.y, viewResizeMode, d10, num);
    }

    @Override 
    public int getItemCount() {
        return this.items.size();
    }

    @Override 
    public long getItemId(int i10) {
        return ((MessageAccessory) this.items.get(i10)).getItemId().longValue();
    }

    @Override 
    public int getItemViewType(int i10) {
        MessageAccessory messageAccessory = (MessageAccessory) this.items.get(i10);
        if (messageAccessory instanceof EmbedMessageAccessory) {
            return 1;
        }
        if (messageAccessory instanceof GiftMessageAccessory) {
            return 16;
        }
        if (messageAccessory instanceof MessageContentAccessory) {
            return 0;
        }
        if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
            return 2;
        }
        if (messageAccessory instanceof UploadProgressMessageAccessory) {
            return 3;
        }
        if (messageAccessory instanceof GuildInviteMessageAccessory) {
            return 5;
        }
        if (messageAccessory instanceof ActivityBookmarkMessageAccessory) {
            return 30;
        }
        if (messageAccessory instanceof EmbeddedActivityInviteMessageAccessory) {
            return 31;
        }
        if (messageAccessory instanceof GuildInviteDisabledMessageAccessory) {
            return 25;
        }
        if (messageAccessory instanceof GuildEventInviteMessageAccessory) {
            return 15;
        }
        if (messageAccessory instanceof ReactionsMessageAccessory) {
            return 4;
        }
        if (messageAccessory instanceof StickerMessageAccessory) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[((StickerMessageAccessory) messageAccessory).getSticker().getFormatType().ordinal()];
            if (i11 == 1) {
                return 6;
            }
            if (i11 == 2) {
                return 7;
            }
            if (i11 == 3) {
                return 8;
            }
            if (i11 == 4) {
                return 27;
            }
            throw new pf.q();
        } else if (messageAccessory instanceof ThreadEmbedMessageAccessory) {
            return 9;
        } else {
            if (messageAccessory instanceof VideoAttachmentMessageAccessory) {
                return 10;
            }
            if (messageAccessory instanceof FileAttachmentMessageAccessory) {
                return 11;
            }
            if (messageAccessory instanceof MessageComponentsAccessory) {
                return 12;
            }
            if (messageAccessory instanceof TimestampMessageAccessory) {
                return 13;
            }
            if (messageAccessory instanceof WelcomeStickerAccessory) {
                return 14;
            }
            if (messageAccessory instanceof ActivityInviteEmbedMessageAccessory) {
                return 17;
            }
            if (messageAccessory instanceof EphemeralIndicationMessageAccessory) {
                return 18;
            }
            if (messageAccessory instanceof SurveyIndicationMessageAccessory) {
                return 24;
            }
            if (messageAccessory instanceof InteractionStatusMessageAccessory) {
                return 19;
            }
            if (messageAccessory instanceof ForumPostActionBar) {
                return 20;
            }
            if (messageAccessory instanceof FlaggedMessageEmbedAccessory) {
                return 21;
            }
            if (messageAccessory instanceof FlaggedMessageActionBarAccessory) {
                return 22;
            }
            if (messageAccessory instanceof AutoModerationNotificationEmbedAccessory) {
                return 33;
            }
            if (messageAccessory instanceof RoleSubscriptionPurchaseAccessory) {
                return 23;
            }
            if (messageAccessory instanceof MediaMosaicAttachmentMessageAccessory) {
                return 26;
            }
            if (messageAccessory instanceof InviteToSpeakAccessory) {
                return 28;
            }
            if (messageAccessory instanceof AudioAttachmentMessageAccessory) {
                return 29;
            }
            if (messageAccessory instanceof PostPreviewEmbedMessageAccessory) {
                return 32;
            }
            if (messageAccessory instanceof ChannelPromptActionsAccessory) {
                return 34;
            }
            if (messageAccessory instanceof InfoLinkMessageAccessory) {
                return 35;
            }
            throw new pf.q();
        }
    }

    public final void setComponentProvider(ComponentProvider componentProvider) {
        this.botComponentProvider = componentProvider;
    }

    public final void setEventHandler(ChatEventHandler eventHandler) {
        q.h(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    
    public final void m214setItemsbo5iIEc(String messageId, long j10, GuildId guildId, List<? extends MessageAccessory> items) {
        q.h(messageId, "messageId");
        q.h(items, "items");
        this.messageId = messageId;
        this.channelId = ChannelId.m610boximpl(j10);
        this.guildId = guildId;
        if (ChatView.Companion.getAreChatAnimationsEnabled()) {
            List<? extends MessageAccessory> list = this.items;
            ArrayList arrayList = new ArrayList(items);
            this.items = arrayList;
            c.e b10 = c.b(new ItemDiffer(list, arrayList), true);
            q.g(b10, "calculateDiff(differ, true)");
            b10.c(this);
            return;
        }
        this.items = items;
        notifyDataSetChanged();
    }

    public final void setMessageContentViewLifecycleListener(MessageContentViewLifecycleListener listener) {
        q.h(listener, "listener");
        this.messageContentViewLifecycleListener = listener;
    }

    public void onBindViewHolder(final MessagePartViewHolder holder, int i10) {
        ChatEventHandler chatEventHandler;
        ChatEventHandler chatEventHandler2;
        ChatEventHandler chatEventHandler3;
        ChatEventHandler chatEventHandler4;
        ChatEventHandler chatEventHandler5;
        q.h(holder, "holder");
        final MessageAccessory messageAccessory = (MessageAccessory) this.items.get(i10);
        if (messageAccessory instanceof EmbedMessageAccessory) {
            EmbedViewHolder embedViewHolder = (EmbedViewHolder) holder;
            int dimensionPixelSize = holder.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
            EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) messageAccessory;
            int radiusPx = embedMessageAccessory.getRadiusPx();
            View.OnLongClickListener onLongClick = embedMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes = embedMessageAccessory.getSpoilerAttributes();
            embedViewHolder.bind(embedMessageAccessory, dimensionPixelSize, radiusPx, new MessageAccessoriesAdapter$onBindViewHolder$2(this, holder), spoilerAttributes != null ? spoilerAttributes.configure(new MessageAccessoriesAdapter$onBindViewHolder$1(this, holder)) : null, new MessageAccessoriesAdapter$onBindViewHolder$3(this, holder, messageAccessory), onLongClick, embedMessageAccessory.getPortal());
        } else if (messageAccessory instanceof InfoLinkMessageAccessory) {
            InfoLinkMessageAccessory infoLinkMessageAccessory = (InfoLinkMessageAccessory) messageAccessory;
            ((InfoLinkViewHolder) holder).bind(infoLinkMessageAccessory.getText(), infoLinkMessageAccessory.getIcon(), new MessageAccessoriesAdapter$onBindViewHolder$4(this, messageAccessory));
        } else if (messageAccessory instanceof GiftMessageAccessory) {
            GiftViewHolder giftViewHolder = (GiftViewHolder) holder;
            GiftMessageAccessory giftMessageAccessory = (GiftMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler6 = this.eventHandler;
            if (chatEventHandler6 == null) {
                q.y("eventHandler");
                chatEventHandler5 = null;
            } else {
                chatEventHandler5 = chatEventHandler6;
            }
            giftViewHolder.bind(giftMessageAccessory, new MessageAccessoriesAdapter$onBindViewHolder$5(chatEventHandler5), new MessageAccessoriesAdapter$onBindViewHolder$6(this, messageAccessory));
        } else if (messageAccessory instanceof MessageContentAccessory) {
            MessageContentViewHolder messageContentViewHolder = (MessageContentViewHolder) holder;
            ChatEventHandler chatEventHandler7 = this.eventHandler;
            if (chatEventHandler7 == null) {
                q.y("eventHandler");
                chatEventHandler7 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$7 messageAccessoriesAdapter$onBindViewHolder$7 = new MessageAccessoriesAdapter$onBindViewHolder$7(chatEventHandler7);
            ChatEventHandler chatEventHandler8 = this.eventHandler;
            if (chatEventHandler8 == null) {
                q.y("eventHandler");
                chatEventHandler8 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$8 messageAccessoriesAdapter$onBindViewHolder$8 = new MessageAccessoriesAdapter$onBindViewHolder$8(chatEventHandler8);
            ChatEventHandler chatEventHandler9 = this.eventHandler;
            if (chatEventHandler9 == null) {
                q.y("eventHandler");
                chatEventHandler9 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$9 messageAccessoriesAdapter$onBindViewHolder$9 = new MessageAccessoriesAdapter$onBindViewHolder$9(chatEventHandler9);
            ChatEventHandler chatEventHandler10 = this.eventHandler;
            if (chatEventHandler10 == null) {
                q.y("eventHandler");
                chatEventHandler10 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$10 messageAccessoriesAdapter$onBindViewHolder$10 = new MessageAccessoriesAdapter$onBindViewHolder$10(chatEventHandler10);
            ChatEventHandler chatEventHandler11 = this.eventHandler;
            if (chatEventHandler11 == null) {
                q.y("eventHandler");
                chatEventHandler11 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$11 messageAccessoriesAdapter$onBindViewHolder$11 = new MessageAccessoriesAdapter$onBindViewHolder$11(chatEventHandler11);
            ChatEventHandler chatEventHandler12 = this.eventHandler;
            if (chatEventHandler12 == null) {
                q.y("eventHandler");
                chatEventHandler12 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$12 messageAccessoriesAdapter$onBindViewHolder$12 = new MessageAccessoriesAdapter$onBindViewHolder$12(chatEventHandler12);
            ChatEventHandler chatEventHandler13 = this.eventHandler;
            if (chatEventHandler13 == null) {
                q.y("eventHandler");
                chatEventHandler13 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$13 messageAccessoriesAdapter$onBindViewHolder$13 = new MessageAccessoriesAdapter$onBindViewHolder$13(chatEventHandler13);
            ChatEventHandler chatEventHandler14 = this.eventHandler;
            if (chatEventHandler14 == null) {
                q.y("eventHandler");
                chatEventHandler14 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$14 messageAccessoriesAdapter$onBindViewHolder$14 = new MessageAccessoriesAdapter$onBindViewHolder$14(chatEventHandler14);
            ChatEventHandler chatEventHandler15 = this.eventHandler;
            if (chatEventHandler15 == null) {
                q.y("eventHandler");
                chatEventHandler15 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$15 messageAccessoriesAdapter$onBindViewHolder$15 = new MessageAccessoriesAdapter$onBindViewHolder$15(chatEventHandler15);
            ChatEventHandler chatEventHandler16 = this.eventHandler;
            if (chatEventHandler16 == null) {
                q.y("eventHandler");
                chatEventHandler16 = null;
            }
            messageContentViewHolder.bind((MessageContentAccessory) messageAccessory, messageAccessoriesAdapter$onBindViewHolder$7, messageAccessoriesAdapter$onBindViewHolder$8, messageAccessoriesAdapter$onBindViewHolder$9, messageAccessoriesAdapter$onBindViewHolder$10, messageAccessoriesAdapter$onBindViewHolder$11, messageAccessoriesAdapter$onBindViewHolder$12, messageAccessoriesAdapter$onBindViewHolder$13, new MessageAccessoriesAdapter$onBindViewHolder$17(this, holder), messageAccessoriesAdapter$onBindViewHolder$14, messageAccessoriesAdapter$onBindViewHolder$15, new MessageAccessoriesAdapter$onBindViewHolder$16(chatEventHandler16));
        } else if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
            ImageAttachmentViewHolder imageAttachmentViewHolder = (ImageAttachmentViewHolder) holder;
            ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) messageAccessory;
            Attachment attachment = imageAttachmentMessageAccessory.getAttachment();
            int width = MessageAccessoriesView.Companion.getWidth(imageAttachmentMessageAccessory.getConstrainedWidth());
            int dimensionPixelSize2 = holder.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
            int radiusPx2 = imageAttachmentMessageAccessory.getRadiusPx();
            MediaContainingViewResizer.ResizeMode resizeMode = MediaContainingViewResizer.ResizeMode.Fill;
            View.OnClickListener bVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$0(MessageAccessory.this, this, holder, view);
                }
            };
            View.OnLongClickListener onLongClick2 = imageAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes2 = imageAttachmentMessageAccessory.getSpoilerAttributes();
            SpoilerConfig configure = spoilerAttributes2 != null ? spoilerAttributes2.configure(new MessageAccessoriesAdapter$onBindViewHolder$19(this, holder)) : null;
            boolean useNewAltTextButton = imageAttachmentMessageAccessory.getUseNewAltTextButton();
            Float attachmentsOpacity = imageAttachmentMessageAccessory.getAttachmentsOpacity();
            boolean showRemixButton = imageAttachmentMessageAccessory.getShowRemixButton();
            Integer remixButtonIconColor = imageAttachmentMessageAccessory.getRemixButtonIconColor();
            Integer remixButtonBackgroundColor = imageAttachmentMessageAccessory.getRemixButtonBackgroundColor();
            String str = messageAccessory.mo236getMessageId3Eiw7ao();
            ChatEventHandler chatEventHandler17 = this.eventHandler;
            if (chatEventHandler17 == null) {
                q.y("eventHandler");
                chatEventHandler4 = null;
            } else {
                chatEventHandler4 = chatEventHandler17;
            }
            imageAttachmentViewHolder.m367bindNlw0kPk(attachment, width, dimensionPixelSize2, radiusPx2, resizeMode, bVar, onLongClick2, configure, useNewAltTextButton, attachmentsOpacity, showRemixButton, false, remixButtonIconColor, remixButtonBackgroundColor, str, new MessageAccessoriesAdapter$onBindViewHolder$20(chatEventHandler4));
        } else if (messageAccessory instanceof VideoAttachmentMessageAccessory) {
            VideoAttachmentViewHolder videoAttachmentViewHolder = (VideoAttachmentViewHolder) holder;
            VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) messageAccessory;
            int width2 = MessageAccessoriesView.Companion.getWidth(videoAttachmentMessageAccessory.getConstrainedWidth());
            int dimensionPixelSize3 = holder.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
            int radiusPx3 = videoAttachmentMessageAccessory.getRadiusPx();
            MessageAccessoriesAdapter$onBindViewHolder$21 messageAccessoriesAdapter$onBindViewHolder$21 = new MessageAccessoriesAdapter$onBindViewHolder$21(messageAccessory, this, holder);
            View.OnLongClickListener onLongClick3 = videoAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes3 = videoAttachmentMessageAccessory.getSpoilerAttributes();
            videoAttachmentViewHolder.bind(videoAttachmentMessageAccessory, width2, dimensionPixelSize3, radiusPx3, messageAccessoriesAdapter$onBindViewHolder$21, onLongClick3, spoilerAttributes3 != null ? spoilerAttributes3.configure(new MessageAccessoriesAdapter$onBindViewHolder$22(this, holder)) : null, videoAttachmentMessageAccessory.getPortal(), true, videoAttachmentMessageAccessory.getUseNewAltTextButton(), videoAttachmentMessageAccessory.getHideMediaPlayButton(), videoAttachmentMessageAccessory.getAttachmentsOpacity(), false);
        } else if (messageAccessory instanceof MediaMosaicAttachmentMessageAccessory) {
            MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) messageAccessory;
            ((MediaMosaicAttachmentViewHolder) holder).bind(mediaMosaicAttachmentMessageAccessory.getAttachments(), mediaMosaicAttachmentMessageAccessory.getConstrainedWidth(), new MessageAccessoriesAdapter$onBindViewHolder$23(this, holder), new MessageAccessoriesAdapter$onBindViewHolder$24(this));
        } else if (messageAccessory instanceof UploadProgressMessageAccessory) {
            UploadProgressViewHolder uploadProgressViewHolder = (UploadProgressViewHolder) holder;
            UploadProgress uploadProgress = ((UploadProgressMessageAccessory) messageAccessory).getUploadProgress();
            ChatEventHandler chatEventHandler18 = this.eventHandler;
            if (chatEventHandler18 == null) {
                q.y("eventHandler");
                chatEventHandler3 = null;
            } else {
                chatEventHandler3 = chatEventHandler18;
            }
            uploadProgressViewHolder.bind(uploadProgress, chatEventHandler3);
        } else if (messageAccessory instanceof ReactionsMessageAccessory) {
            String str2 = messageAccessory.mo236getMessageId3Eiw7ao();
            ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) messageAccessory;
            ((ReactionsViewHolder) holder).m372bindJJXpD5M(str2, reactionsMessageAccessory.getReactions(), reactionsMessageAccessory.getCanAddNewReactions(), reactionsMessageAccessory.getCanAddNewBurstReactions(), reactionsMessageAccessory.getAddReactionLabel(), reactionsMessageAccessory.getAddNewReactionAccessibilityLabel(), reactionsMessageAccessory.getAddNewBurstReactionAccessibilityLabel(), reactionsMessageAccessory.getReactionsTheme(), new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$1(MessageAccessoriesAdapter.this, view);
                }
            }, new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$2(MessageAccessoriesAdapter.this, view);
                }
            }, new MessageAccessoriesAdapter$onBindViewHolder$27(this), new MessageAccessoriesAdapter$onBindViewHolder$28(this), reactionsMessageAccessory.getTheme());
        } else if (messageAccessory instanceof StickerMessageAccessory) {
            ((StickerPartViewHolder) holder).bind(((StickerMessageAccessory) messageAccessory).getSticker(), new MessageAccessoriesAdapter$onBindViewHolder$29(this, messageAccessory), new MessageAccessoriesAdapter$onBindViewHolder$30(this, messageAccessory), 160, 160);
        } else if (messageAccessory instanceof GuildInviteMessageAccessory) {
            ((GuildInviteViewHolder) holder).bind((GuildInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof ActivityBookmarkMessageAccessory) {
            ((ActivityBookmarkViewHolder) holder).bind((ActivityBookmarkMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof EmbeddedActivityInviteMessageAccessory) {
            ((EmbeddedActivityInviteViewHolder) holder).bind((EmbeddedActivityInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof GuildInviteDisabledMessageAccessory) {
            ((GuildInviteDisabledViewHolder) holder).bind((GuildInviteDisabledMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof GuildEventInviteMessageAccessory) {
            ((GuildEventInviteViewHolder) holder).bind((GuildEventInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof ThreadEmbedMessageAccessory) {
            ThreadEmbedViewHolder threadEmbedViewHolder = (ThreadEmbedViewHolder) holder;
            ThreadEmbedMessageAccessory threadEmbedMessageAccessory = (ThreadEmbedMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler19 = this.eventHandler;
            if (chatEventHandler19 == null) {
                q.y("eventHandler");
                chatEventHandler19 = null;
            }
            threadEmbedViewHolder.bind(threadEmbedMessageAccessory, new MessageAccessoriesAdapter$onBindViewHolder$31(chatEventHandler19));
        } else if (messageAccessory instanceof ForumPostActionBar) {
            ForumPostActionBarViewHolder forumPostActionBarViewHolder = (ForumPostActionBarViewHolder) holder;
            ForumPostActionBar forumPostActionBar = (ForumPostActionBar) messageAccessory;
            ReactionsTheme reactionsTheme = forumPostActionBar.getReactionsTheme();
            View.OnClickListener eVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$3(MessageAccessoriesAdapter.this, view);
                }
            };
            View.OnClickListener fVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$4(MessageAccessoriesAdapter.this, view);
                }
            };
            View.OnClickListener gVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$5(MessageAccessoriesAdapter.this, view);
                }
            };
            View.OnClickListener hVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$6(MessageAccessoriesAdapter.this, view);
                }
            };
            MessageAccessoriesAdapter$onBindViewHolder$36 messageAccessoriesAdapter$onBindViewHolder$36 = new MessageAccessoriesAdapter$onBindViewHolder$36(this);
            MessageAccessoriesAdapter$onBindViewHolder$37 messageAccessoriesAdapter$onBindViewHolder$37 = new MessageAccessoriesAdapter$onBindViewHolder$37(this);
            View.OnClickListener iVar = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageAccessoriesAdapter.onBindViewHolder$lambda$8(MessageAccessoriesAdapter.this, view);
                }
            };
            ChatEventHandler chatEventHandler20 = this.eventHandler;
            if (chatEventHandler20 == null) {
                q.y("eventHandler");
                chatEventHandler2 = null;
            } else {
                chatEventHandler2 = chatEventHandler20;
            }
            forumPostActionBarViewHolder.bind(forumPostActionBar, reactionsTheme, eVar, fVar, gVar, hVar, messageAccessoriesAdapter$onBindViewHolder$36, messageAccessoriesAdapter$onBindViewHolder$37, iVar, new MessageAccessoriesAdapter$onBindViewHolder$39(chatEventHandler2));
        } else if (messageAccessory instanceof FileAttachmentMessageAccessory) {
            FileAttachmentViewHolder fileAttachmentViewHolder = (FileAttachmentViewHolder) holder;
            FileAttachmentMessageAccessory fileAttachmentMessageAccessory = (FileAttachmentMessageAccessory) messageAccessory;
            MessageAccessoriesAdapter$onBindViewHolder$40 messageAccessoriesAdapter$onBindViewHolder$40 = new MessageAccessoriesAdapter$onBindViewHolder$40(this);
            SpoilerAttributes spoilerAttributes4 = fileAttachmentMessageAccessory.getSpoilerAttributes();
            fileAttachmentViewHolder.bind(fileAttachmentMessageAccessory, messageAccessoriesAdapter$onBindViewHolder$40, spoilerAttributes4 != null ? spoilerAttributes4.configure(new MessageAccessoriesAdapter$onBindViewHolder$41(this, holder)) : null, fileAttachmentMessageAccessory.getAttachmentsOpacity());
        } else if (messageAccessory instanceof MessageComponentsAccessory) {
            ((MessageComponentsViewHolder) holder).bind((MessageComponentsAccessory) messageAccessory, this.botComponentProvider);
        } else if (messageAccessory instanceof FlaggedMessageEmbedAccessory) {
            ((FlaggedMessageEmbedViewHolder) holder).bind((FlaggedMessageEmbedAccessory) messageAccessory);
        } else if (messageAccessory instanceof FlaggedMessageActionBarAccessory) {
            FlaggedMessageActionBarViewHolder flaggedMessageActionBarViewHolder = (FlaggedMessageActionBarViewHolder) holder;
            FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory = (FlaggedMessageActionBarAccessory) messageAccessory;
            ChatEventHandler chatEventHandler21 = this.eventHandler;
            if (chatEventHandler21 == null) {
                q.y("eventHandler");
                chatEventHandler21 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$42 messageAccessoriesAdapter$onBindViewHolder$42 = new MessageAccessoriesAdapter$onBindViewHolder$42(chatEventHandler21);
            ChatEventHandler chatEventHandler22 = this.eventHandler;
            if (chatEventHandler22 == null) {
                q.y("eventHandler");
                chatEventHandler22 = null;
            }
            flaggedMessageActionBarViewHolder.bind(flaggedMessageActionBarAccessory, messageAccessoriesAdapter$onBindViewHolder$42, new MessageAccessoriesAdapter$onBindViewHolder$43(chatEventHandler22));
        } else if (messageAccessory instanceof AutoModerationNotificationEmbedAccessory) {
            AutoModerationNotificationEmbedViewHolder autoModerationNotificationEmbedViewHolder = (AutoModerationNotificationEmbedViewHolder) holder;
            AutoModerationNotificationEmbedAccessory autoModerationNotificationEmbedAccessory = (AutoModerationNotificationEmbedAccessory) messageAccessory;
            ChatEventHandler chatEventHandler23 = this.eventHandler;
            if (chatEventHandler23 == null) {
                q.y("eventHandler");
                chatEventHandler23 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$44 messageAccessoriesAdapter$onBindViewHolder$44 = new MessageAccessoriesAdapter$onBindViewHolder$44(chatEventHandler23);
            ChatEventHandler chatEventHandler24 = this.eventHandler;
            if (chatEventHandler24 == null) {
                q.y("eventHandler");
                chatEventHandler24 = null;
            }
            autoModerationNotificationEmbedViewHolder.bind(autoModerationNotificationEmbedAccessory, messageAccessoriesAdapter$onBindViewHolder$44, new MessageAccessoriesAdapter$onBindViewHolder$45(chatEventHandler24));
        } else if (messageAccessory instanceof TimestampMessageAccessory) {
            ((TimestampViewHolder) holder).bind((TimestampMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof WelcomeStickerAccessory) {
            ((WelcomeStickerViewHolder) holder).bind((WelcomeStickerAccessory) messageAccessory);
        } else if (messageAccessory instanceof ActivityInviteEmbedMessageAccessory) {
            ActivityInviteEmbedViewHolder activityInviteEmbedViewHolder = (ActivityInviteEmbedViewHolder) holder;
            ActivityInviteEmbedMessageAccessory activityInviteEmbedMessageAccessory = (ActivityInviteEmbedMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler25 = this.eventHandler;
            if (chatEventHandler25 == null) {
                q.y("eventHandler");
                chatEventHandler25 = null;
            }
            activityInviteEmbedViewHolder.bind(activityInviteEmbedMessageAccessory, new MessageAccessoriesAdapter$onBindViewHolder$46(chatEventHandler25));
        } else if (messageAccessory instanceof EphemeralIndicationMessageAccessory) {
            ((EphemeralIndicationViewHolder) holder).bind((EphemeralIndicationMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof SurveyIndicationMessageAccessory) {
            ((SurveyIndicationViewHolder) holder).bind((SurveyIndicationMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof InteractionStatusMessageAccessory) {
            ((InteractionStatusViewHolder) holder).bind((InteractionStatusMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof RoleSubscriptionPurchaseAccessory) {
            RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory = (RoleSubscriptionPurchaseAccessory) messageAccessory;
            ((RoleSubscriptionPurchaseViewHolder) holder).bind(roleSubscriptionPurchaseAccessory, MessageAccessoriesView.Companion.getWidth(roleSubscriptionPurchaseAccessory.getConstrainedWidth()));
        } else if (messageAccessory instanceof InviteToSpeakAccessory) {
            ((InviteToSpeakViewHolder) holder).bind((InviteToSpeakAccessory) messageAccessory);
        } else if (messageAccessory instanceof AudioAttachmentMessageAccessory) {
            VoiceMessageViewHolder voiceMessageViewHolder = (VoiceMessageViewHolder) holder;
            AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = (AudioAttachmentMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler26 = this.eventHandler;
            if (chatEventHandler26 == null) {
                q.y("eventHandler");
                chatEventHandler = null;
            } else {
                chatEventHandler = chatEventHandler26;
            }
            voiceMessageViewHolder.bind(audioAttachmentMessageAccessory, chatEventHandler, audioAttachmentMessageAccessory.getAttachmentsOpacity());
        } else if (messageAccessory instanceof PostPreviewEmbedMessageAccessory) {
            PostPreviewEmbedViewHolder postPreviewEmbedViewHolder = (PostPreviewEmbedViewHolder) holder;
            PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) messageAccessory;
            PostPreviewEmbed postPreviewEmbed = postPreviewEmbedMessageAccessory.getPostPreviewEmbed();
            ChatEventHandler chatEventHandler27 = this.eventHandler;
            if (chatEventHandler27 == null) {
                q.y("eventHandler");
                chatEventHandler27 = null;
            }
            MessageAccessoriesAdapter$onBindViewHolder$47 messageAccessoriesAdapter$onBindViewHolder$47 = new MessageAccessoriesAdapter$onBindViewHolder$47(chatEventHandler27);
            SpoilerAttributes spoilerAttributes5 = postPreviewEmbedMessageAccessory.getSpoilerAttributes();
            postPreviewEmbedViewHolder.bind(postPreviewEmbed, messageAccessoriesAdapter$onBindViewHolder$47, spoilerAttributes5 != null ? spoilerAttributes5.configure(new MessageAccessoriesAdapter$onBindViewHolder$48(this, holder)) : null);
        } else if (messageAccessory instanceof ChannelPromptActionsAccessory) {
            ChannelPromptActionsViewHolder channelPromptActionsViewHolder = (ChannelPromptActionsViewHolder) holder;
            ChannelPromptActionsAccessory channelPromptActionsAccessory = (ChannelPromptActionsAccessory) messageAccessory;
            ChatEventHandler chatEventHandler28 = this.eventHandler;
            if (chatEventHandler28 == null) {
                q.y("eventHandler");
                chatEventHandler28 = null;
            }
            channelPromptActionsViewHolder.bind(channelPromptActionsAccessory, new MessageAccessoriesAdapter$onBindViewHolder$49(chatEventHandler28));
        } else {
            throw new pf.q();
        }
        ForceExhaustiveKt.forceExhaustive(Unit.f21600a);
    }

    @Override 
    public MessagePartViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        q.h(parent, "parent");
        ChatEventHandler chatEventHandler = null;
        switch (i10) {
            case 0:
                Context context = parent.getContext();
                q.g(context, "parent.context");
                return new MessageContentViewHolder(new MessageContentView(context, null, 0, 6, null));
            case 1:
                Context context2 = parent.getContext();
                q.g(context2, "parent.context");
                EmbedView embedView = new EmbedView(context2, null, 2, null);
                ChatEventHandler chatEventHandler2 = this.eventHandler;
                if (chatEventHandler2 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler2;
                }
                return new EmbedViewHolder(embedView, chatEventHandler);
            case 2:
                Context context3 = parent.getContext();
                q.g(context3, "parent.context");
                ImageAttachmentView imageAttachmentView = new ImageAttachmentView(context3, null, 2, null);
                ChatEventHandler chatEventHandler3 = this.eventHandler;
                if (chatEventHandler3 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler3;
                }
                return new ImageAttachmentViewHolder(imageAttachmentView, chatEventHandler);
            case 3:
                Context context4 = parent.getContext();
                q.g(context4, "parent.context");
                return new UploadProgressViewHolder(new UploadProgressView(context4, null, 2, null));
            case 4:
                Context context5 = parent.getContext();
                q.g(context5, "parent.context");
                return new ReactionsViewHolder(new ReactionsView(context5, null, 2, null));
            case 5:
                Context context6 = parent.getContext();
                q.g(context6, "parent.context");
                GuildInviteView guildInviteView = new GuildInviteView(context6, null, 0, 6, null);
                ChatEventHandler chatEventHandler4 = this.eventHandler;
                if (chatEventHandler4 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler4;
                }
                return new GuildInviteViewHolder(guildInviteView, chatEventHandler);
            case 6:
                Context context7 = parent.getContext();
                q.g(context7, "parent.context");
                return new StickerPngViewHolder(new StickerView(context7, null, 0, 6, null));
            case 7:
                Context context8 = parent.getContext();
                q.g(context8, "parent.context");
                return new StickerApngViewHolder(new StickerView(context8, null, 0, 6, null));
            case 8:
                Context context9 = parent.getContext();
                q.g(context9, "parent.context");
                return new StickerLottieViewHolder(new StickerView(context9, null, 0, 6, null));
            case 9:
                Context context10 = parent.getContext();
                q.g(context10, "parent.context");
                return new ThreadEmbedViewHolder(new ThreadEmbedView(context10, null, 0, 6, null));
            case 10:
                Context context11 = parent.getContext();
                q.g(context11, "parent.context");
                VideoAttachmentView videoAttachmentView = new VideoAttachmentView(context11, null, 2, null);
                ChatEventHandler chatEventHandler5 = this.eventHandler;
                if (chatEventHandler5 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler5;
                }
                return new VideoAttachmentViewHolder(videoAttachmentView, chatEventHandler);
            case 11:
                Context context12 = parent.getContext();
                q.g(context12, "parent.context");
                FileAttachmentView fileAttachmentView = new FileAttachmentView(context12, null, 2, null);
                ChatEventHandler chatEventHandler6 = this.eventHandler;
                if (chatEventHandler6 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler6;
                }
                return new FileAttachmentViewHolder(fileAttachmentView, chatEventHandler);
            case 12:
                Context context13 = parent.getContext();
                q.g(context13, "parent.context");
                MessageComponentsView messageComponentsView = new MessageComponentsView(context13, null, 0, 6, null);
                ChatEventHandler chatEventHandler7 = this.eventHandler;
                if (chatEventHandler7 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler7;
                }
                return new MessageComponentsViewHolder(messageComponentsView, chatEventHandler);
            case 13:
                TextView root = TimestampViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getRoot();
                q.g(root, "inflate(\n               …                   ).root");
                return new TimestampViewHolder(root);
            case 14:
                Context context14 = parent.getContext();
                q.g(context14, "parent.context");
                WelcomeStickerView welcomeStickerView = new WelcomeStickerView(context14, null, 2, null);
                ChatEventHandler chatEventHandler8 = this.eventHandler;
                if (chatEventHandler8 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler8;
                }
                return new WelcomeStickerViewHolder(welcomeStickerView, new MessageAccessoriesAdapter$onCreateViewHolder$2(chatEventHandler));
            case 15:
                Context context15 = parent.getContext();
                q.g(context15, "parent.context");
                GuildEventInviteView guildEventInviteView = new GuildEventInviteView(context15, null, 0, 6, null);
                ChatEventHandler chatEventHandler9 = this.eventHandler;
                if (chatEventHandler9 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler9;
                }
                return new GuildEventInviteViewHolder(guildEventInviteView, chatEventHandler, new MessageAccessoriesAdapter$onCreateViewHolder$1(this));
            case 16:
                Context context16 = parent.getContext();
                q.g(context16, "parent.context");
                return new GiftViewHolder(new GiftView(context16, null, 2, null));
            case 17:
                Context context17 = parent.getContext();
                q.g(context17, "parent.context");
                return new ActivityInviteEmbedViewHolder(new ActivityInviteEmbedView(context17, null, 0, 6, null));
            case 18:
                Context context18 = parent.getContext();
                q.g(context18, "parent.context");
                EphemeralIndicationView ephemeralIndicationView = new EphemeralIndicationView(context18, null, 0, 6, null);
                ChatEventHandler chatEventHandler10 = this.eventHandler;
                if (chatEventHandler10 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler10;
                }
                return new EphemeralIndicationViewHolder(ephemeralIndicationView, chatEventHandler);
            case 19:
                Context context19 = parent.getContext();
                q.g(context19, "parent.context");
                return new InteractionStatusViewHolder(new InteractionStatusView(context19, null, 2, null));
            case 20:
                Context context20 = parent.getContext();
                q.g(context20, "parent.context");
                return new ForumPostActionBarViewHolder(new ForumPostActionBarView(context20, null, 0, 6, null));
            case 21:
                Context context21 = parent.getContext();
                q.g(context21, "parent.context");
                FlaggedMessageEmbedView flaggedMessageEmbedView = new FlaggedMessageEmbedView(context21, null, 2, null);
                ChatEventHandler chatEventHandler11 = this.eventHandler;
                if (chatEventHandler11 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler11;
                }
                return new FlaggedMessageEmbedViewHolder(flaggedMessageEmbedView, chatEventHandler);
            case 22:
                Context context22 = parent.getContext();
                q.g(context22, "parent.context");
                return new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(context22, null, 0, 6, null));
            case 23:
                Context context23 = parent.getContext();
                q.g(context23, "parent.context");
                return new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(context23, null, 0, 6, null));
            case 24:
                Context context24 = parent.getContext();
                q.g(context24, "parent.context");
                SurveyIndicationView surveyIndicationView = new SurveyIndicationView(context24, null, 0, 6, null);
                ChatEventHandler chatEventHandler12 = this.eventHandler;
                if (chatEventHandler12 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler12;
                }
                return new SurveyIndicationViewHolder(surveyIndicationView, chatEventHandler);
            case 25:
                Context context25 = parent.getContext();
                q.g(context25, "parent.context");
                GuildInviteDisabledView guildInviteDisabledView = new GuildInviteDisabledView(context25, null, 0, 6, null);
                ChatEventHandler chatEventHandler13 = this.eventHandler;
                if (chatEventHandler13 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler13;
                }
                return new GuildInviteDisabledViewHolder(guildInviteDisabledView, chatEventHandler);
            case 26:
                Context context26 = parent.getContext();
                q.g(context26, "parent.context");
                MediaMosaicView mediaMosaicView = new MediaMosaicView(context26, null, 2, null);
                ChatEventHandler chatEventHandler14 = this.eventHandler;
                if (chatEventHandler14 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler14;
                }
                return new MediaMosaicAttachmentViewHolder(mediaMosaicView, chatEventHandler);
            case 27:
                Context context27 = parent.getContext();
                q.g(context27, "parent.context");
                return new StickerGifViewHolder(new StickerView(context27, null, 0, 6, null));
            case 28:
                Context context28 = parent.getContext();
                q.g(context28, "parent.context");
                InviteToSpeakView inviteToSpeakView = new InviteToSpeakView(context28, null, 2, null);
                ChatEventHandler chatEventHandler15 = this.eventHandler;
                if (chatEventHandler15 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler15;
                }
                return new InviteToSpeakViewHolder(inviteToSpeakView, new MessageAccessoriesAdapter$onCreateViewHolder$3(chatEventHandler));
            case 29:
                Context context29 = parent.getContext();
                q.g(context29, "parent.context");
                return new VoiceMessageViewHolder(new AudioPlayerView(context29, null, 0, 6, null));
            case 30:
                Context context30 = parent.getContext();
                q.g(context30, "parent.context");
                ActivityBookmarkView activityBookmarkView = new ActivityBookmarkView(context30, null, 0, 6, null);
                ChatEventHandler chatEventHandler16 = this.eventHandler;
                if (chatEventHandler16 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler16;
                }
                return new ActivityBookmarkViewHolder(activityBookmarkView, chatEventHandler);
            case 31:
                Context context31 = parent.getContext();
                q.g(context31, "parent.context");
                EmbeddedActivityInviteView embeddedActivityInviteView = new EmbeddedActivityInviteView(context31, null, 0, 6, null);
                ChatEventHandler chatEventHandler17 = this.eventHandler;
                if (chatEventHandler17 == null) {
                    q.y("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler17;
                }
                return new EmbeddedActivityInviteViewHolder(embeddedActivityInviteView, chatEventHandler);
            case 32:
                Context context32 = parent.getContext();
                q.g(context32, "parent.context");
                return new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(context32, null, 0, 6, null));
            case 33:
                Context context33 = parent.getContext();
                q.g(context33, "parent.context");
                return new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(context33, null, 2, null));
            case 34:
                Context context34 = parent.getContext();
                q.g(context34, "parent.context");
                return new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(context34, null, 2, null));
            case 35:
                Context context35 = parent.getContext();
                q.g(context35, "parent.context");
                return new InfoLinkViewHolder(new InfoLinkView(context35, null, 2, null));
            default:
                throw new IllegalArgumentException("Unknown view type: " + i10);
        }
    }

    public void onViewAttachedToWindow(MessagePartViewHolder holder) {
        q.h(holder, "holder");
        super.onViewAttachedToWindow((MessageAccessoriesAdapter) holder);
        if (holder instanceof MessageContentViewHolder) {
            MessageContentViewLifecycleListener messageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
            if (messageContentViewLifecycleListener == null) {
                q.y("messageContentViewLifecycleListener");
                messageContentViewLifecycleListener = null;
            }
            messageContentViewLifecycleListener.onAttachedToWindow(((MessageContentViewHolder) holder).getMessageContentView());
        }
    }

    public void onViewDetachedFromWindow(MessagePartViewHolder holder) {
        q.h(holder, "holder");
        super.onViewDetachedFromWindow((MessageAccessoriesAdapter) holder);
        if (holder instanceof MessageContentViewHolder) {
            MessageContentViewLifecycleListener messageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
            if (messageContentViewLifecycleListener == null) {
                q.y("messageContentViewLifecycleListener");
                messageContentViewLifecycleListener = null;
            }
            messageContentViewLifecycleListener.onDetachedFromWindow();
        }
    }
}
