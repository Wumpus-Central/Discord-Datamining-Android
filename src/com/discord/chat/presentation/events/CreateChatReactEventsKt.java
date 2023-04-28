package com.discord.chat.presentation.events;

import com.discord.chat.reactevents.ChatScrollPositionEvent;
import com.discord.chat.reactevents.InitiateReplyData;
import com.discord.chat.reactevents.LongPressAvatarData;
import com.discord.chat.reactevents.LongPressChannelData;
import com.discord.chat.reactevents.LongPressCommandData;
import com.discord.chat.reactevents.LongPressLinkData;
import com.discord.chat.reactevents.LongPressMessageEvent;
import com.discord.chat.reactevents.LongPressReactionData;
import com.discord.chat.reactevents.LongPressStickerData;
import com.discord.chat.reactevents.LongPressUsernameData;
import com.discord.chat.reactevents.TapActivityLauncherEmbedData;
import com.discord.chat.reactevents.TapAutoModerationActionsData;
import com.discord.chat.reactevents.TapAutoModerationFeedbackData;
import com.discord.chat.reactevents.TapAvatarData;
import com.discord.chat.reactevents.TapButtonActionComponent;
import com.discord.chat.reactevents.TapCallData;
import com.discord.chat.reactevents.TapCancelUploadItemData;
import com.discord.chat.reactevents.TapChannelData;
import com.discord.chat.reactevents.TapCommandData;
import com.discord.chat.reactevents.TapConnectionsRoleTagData;
import com.discord.chat.reactevents.TapCopyText;
import com.discord.chat.reactevents.TapDismissEmbeddedActivityData;
import com.discord.chat.reactevents.TapEmojiData;
import com.discord.chat.reactevents.TapFollowForumPost;
import com.discord.chat.reactevents.TapGiftCodeAcceptData;
import com.discord.chat.reactevents.TapGiftCodeEmbedData;
import com.discord.chat.reactevents.TapImageData;
import com.discord.chat.reactevents.TapInviteEvent;
import com.discord.chat.reactevents.TapInviteToSpeakData;
import com.discord.chat.reactevents.TapJoinActivityData;
import com.discord.chat.reactevents.TapJoinEmbeddedActivityData;
import com.discord.chat.reactevents.TapLinkData;
import com.discord.chat.reactevents.TapMentionData;
import com.discord.chat.reactevents.TapMessageData;
import com.discord.chat.reactevents.TapMessageReplyData;
import com.discord.chat.reactevents.TapOpTagData;
import com.discord.chat.reactevents.TapPostPreviewEmbedData;
import com.discord.chat.reactevents.TapReactionData;
import com.discord.chat.reactevents.TapRoleIconData;
import com.discord.chat.reactevents.TapSeeMoreData;
import com.discord.chat.reactevents.TapSelectActionComponent;
import com.discord.chat.reactevents.TapSeparatorData;
import com.discord.chat.reactevents.TapShareForumPost;
import com.discord.chat.reactevents.TapShowAltTextData;
import com.discord.chat.reactevents.TapStickerData;
import com.discord.chat.reactevents.TapSuppressNotificationsIconData;
import com.discord.chat.reactevents.TapThreadEmbedEvent;
import com.discord.chat.reactevents.TapTimestampEvent;
import com.discord.chat.reactevents.TapUploadProgressCloseData;
import com.discord.chat.reactevents.TapUsernameData;
import com.discord.chat.reactevents.TapWelcomeReplyData;
import com.discord.chat.reactevents.VoiceMessagePlaybackEndedData;
import com.discord.chat.reactevents.VoiceMessagePlaybackFailedData;
import com.discord.chat.reactevents.VoiceMessagePlaybackStartedData;
import com.discord.reactevents.ReactEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.C9656f0;
import nf.C10853x;

@Metadata(m15074d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, m15073d2 = {"createChatReactEvents", "Lcom/discord/reactevents/ReactEvents;", "chat_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class CreateChatReactEventsKt {
    public static final ReactEvents createChatReactEvents() {
        return new ReactEvents(C10853x.m10921a("onChatScrollPosition", C9656f0.m14684b(ChatScrollPositionEvent.class)), C10853x.m10921a("onLongPressAvatar", C9656f0.m14684b(LongPressAvatarData.class)), C10853x.m10921a("onLongPressMessage", C9656f0.m14684b(LongPressMessageEvent.class)), C10853x.m10921a("onLongPressReaction", C9656f0.m14684b(LongPressReactionData.class)), C10853x.m10921a("onLongPressSticker", C9656f0.m14684b(LongPressStickerData.class)), C10853x.m10921a("onLongPressUsername", C9656f0.m14684b(LongPressUsernameData.class)), C10853x.m10921a("onLongPressCommandMention", C9656f0.m14684b(LongPressCommandData.class)), C10853x.m10921a("onLongPressChannel", C9656f0.m14684b(LongPressChannelData.class)), C10853x.m10921a("onTapAvatar", C9656f0.m14684b(TapAvatarData.class)), C10853x.m10921a("onTapButtonActionComponent", C9656f0.m14684b(TapButtonActionComponent.class)), C10853x.m10921a("onTapCall", C9656f0.m14684b(TapCallData.class)), C10853x.m10921a("onTapChannel", C9656f0.m14684b(TapChannelData.class)), C10853x.m10921a("onTapCopyText", C9656f0.m14684b(TapCopyText.class)), C10853x.m10921a("onTapGiftCodeAccept", C9656f0.m14684b(TapGiftCodeAcceptData.class)), C10853x.m10921a("onTapGiftCodeEmbed", C9656f0.m14684b(TapGiftCodeEmbedData.class)), C10853x.m10921a("onTapImage", C9656f0.m14684b(TapImageData.class)), C10853x.m10921a("onTapInviteEmbed", C9656f0.m14684b(TapInviteEvent.class)), C10853x.m10921a("onTapJoinActivity", C9656f0.m14684b(TapJoinActivityData.class)), C10853x.m10921a("onTapLink", C9656f0.m14684b(TapLinkData.class)), C10853x.m10921a("onLongPressLink", C9656f0.m14684b(LongPressLinkData.class)), C10853x.m10921a("onTapMention", C9656f0.m14684b(TapMentionData.class)), C10853x.m10921a("onTapCommandMention", C9656f0.m14684b(TapCommandData.class)), C10853x.m10921a("onTapMessage", C9656f0.m14684b(TapMessageData.class)), C10853x.m10921a("onTapMessageReply", C9656f0.m14684b(TapMessageReplyData.class)), C10853x.m10921a("onTapReaction", C9656f0.m14684b(TapReactionData.class)), C10853x.m10921a("onTapRoleIcon", C9656f0.m14684b(TapRoleIconData.class)), C10853x.m10921a("onTapSuppressNotificationsIcon", C9656f0.m14684b(TapSuppressNotificationsIconData.class)), C10853x.m10921a("onTapSeeMore", C9656f0.m14684b(TapSeeMoreData.class)), C10853x.m10921a("onInitiateReply", C9656f0.m14684b(InitiateReplyData.class)), C10853x.m10921a("onTapConnectionsRoleTag", C9656f0.m14684b(TapConnectionsRoleTagData.class)), C10853x.m10921a("onTapSelectActionComponent", C9656f0.m14684b(TapSelectActionComponent.class)), C10853x.m10921a("onTapSeparator", C9656f0.m14684b(TapSeparatorData.class)), C10853x.m10921a("onTapSticker", C9656f0.m14684b(TapStickerData.class)), C10853x.m10921a("onTapTimestamp", C9656f0.m14684b(TapTimestampEvent.class)), C10853x.m10921a("onTapThreadEmbed", C9656f0.m14684b(TapThreadEmbedEvent.class)), C10853x.m10921a("onTapUsername", C9656f0.m14684b(TapUsernameData.class)), C10853x.m10921a("onTapUploadProgressClose", C9656f0.m14684b(TapUploadProgressCloseData.class)), C10853x.m10921a("onTapCancelUploadItem", C9656f0.m14684b(TapCancelUploadItemData.class)), C10853x.m10921a("onTapWelcomeReply", C9656f0.m14684b(TapWelcomeReplyData.class)), C10853x.m10921a("onTapInviteToSpeak", C9656f0.m14684b(TapInviteToSpeakData.class)), C10853x.m10921a("onTapEmoji", C9656f0.m14684b(TapEmojiData.class)), C10853x.m10921a("onTapFollowForumPost", C9656f0.m14684b(TapFollowForumPost.class)), C10853x.m10921a("onTapShareForumPost", C9656f0.m14684b(TapShareForumPost.class)), C10853x.m10921a("onTapReactionOverflow", C9656f0.m14684b(TapReactionOverflow.class)), C10853x.m10921a("onTapAutoModerationActions", C9656f0.m14684b(TapAutoModerationActionsData.class)), C10853x.m10921a("onTapAutoModerationFeedback", C9656f0.m14684b(TapAutoModerationFeedbackData.class)), C10853x.m10921a("onTapOpTag", C9656f0.m14684b(TapOpTagData.class)), C10853x.m10921a("onTapShowAltText", C9656f0.m14684b(TapShowAltTextData.class)), C10853x.m10921a("onVoiceMessagePlaybackEnded", C9656f0.m14684b(VoiceMessagePlaybackEndedData.class)), C10853x.m10921a("onVoiceMessagePlaybackFailed", C9656f0.m14684b(VoiceMessagePlaybackFailedData.class)), C10853x.m10921a("onVoiceMessagePlaybackStarted", C9656f0.m14684b(VoiceMessagePlaybackStartedData.class)), C10853x.m10921a("onTapJoinEmbeddedActivity", C9656f0.m14684b(TapJoinEmbeddedActivityData.class)), C10853x.m10921a("onTapDismissEmbeddedActivity", C9656f0.m14684b(TapDismissEmbeddedActivityData.class)), C10853x.m10921a("onTapActivityLauncherEmbed", C9656f0.m14684b(TapActivityLauncherEmbedData.class)), C10853x.m10921a("onTapPostPreviewEmbed", C9656f0.m14684b(TapPostPreviewEmbedData.class)));
    }
}
