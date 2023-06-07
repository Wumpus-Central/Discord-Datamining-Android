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
import com.discord.chat.reactevents.TapDismissMediaPostSharePromptData;
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
import kg.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"createChatReactEvents", "Lcom/discord/reactevents/ReactEvents;", "chat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateChatReactEventsKt {
    public static final ReactEvents createChatReactEvents() {
        return new ReactEvents(x.a("onChatScrollPosition", f0.b(ChatScrollPositionEvent.class)), x.a("onLongPressAvatar", f0.b(LongPressAvatarData.class)), x.a("onLongPressMessage", f0.b(LongPressMessageEvent.class)), x.a("onLongPressReaction", f0.b(LongPressReactionData.class)), x.a("onLongPressSticker", f0.b(LongPressStickerData.class)), x.a("onLongPressUsername", f0.b(LongPressUsernameData.class)), x.a("onLongPressCommandMention", f0.b(LongPressCommandData.class)), x.a("onLongPressChannel", f0.b(LongPressChannelData.class)), x.a("onTapAvatar", f0.b(TapAvatarData.class)), x.a("onTapButtonActionComponent", f0.b(TapButtonActionComponent.class)), x.a("onTapCall", f0.b(TapCallData.class)), x.a("onTapChannel", f0.b(TapChannelData.class)), x.a("onTapCopyText", f0.b(TapCopyText.class)), x.a("onTapGiftCodeAccept", f0.b(TapGiftCodeAcceptData.class)), x.a("onTapGiftCodeEmbed", f0.b(TapGiftCodeEmbedData.class)), x.a("onTapImage", f0.b(TapImageData.class)), x.a("onTapInviteEmbed", f0.b(TapInviteEvent.class)), x.a("onTapJoinActivity", f0.b(TapJoinActivityData.class)), x.a("onTapLink", f0.b(TapLinkData.class)), x.a("onLongPressLink", f0.b(LongPressLinkData.class)), x.a("onTapMention", f0.b(TapMentionData.class)), x.a("onTapCommandMention", f0.b(TapCommandData.class)), x.a("onTapMessage", f0.b(TapMessageData.class)), x.a("onTapMessageReply", f0.b(TapMessageReplyData.class)), x.a("onTapReaction", f0.b(TapReactionData.class)), x.a("onTapRoleIcon", f0.b(TapRoleIconData.class)), x.a("onTapSuppressNotificationsIcon", f0.b(TapSuppressNotificationsIconData.class)), x.a("onTapSeeMore", f0.b(TapSeeMoreData.class)), x.a("onInitiateReply", f0.b(InitiateReplyData.class)), x.a("onTapConnectionsRoleTag", f0.b(TapConnectionsRoleTagData.class)), x.a("onTapSelectActionComponent", f0.b(TapSelectActionComponent.class)), x.a("onTapSeparator", f0.b(TapSeparatorData.class)), x.a("onTapSticker", f0.b(TapStickerData.class)), x.a("onTapTimestamp", f0.b(TapTimestampEvent.class)), x.a("onTapThreadEmbed", f0.b(TapThreadEmbedEvent.class)), x.a("onTapUsername", f0.b(TapUsernameData.class)), x.a("onTapUploadProgressClose", f0.b(TapUploadProgressCloseData.class)), x.a("onTapCancelUploadItem", f0.b(TapCancelUploadItemData.class)), x.a("onTapWelcomeReply", f0.b(TapWelcomeReplyData.class)), x.a("onTapInviteToSpeak", f0.b(TapInviteToSpeakData.class)), x.a("onTapEmoji", f0.b(TapEmojiData.class)), x.a("onTapFollowForumPost", f0.b(TapFollowForumPost.class)), x.a("onTapShareForumPost", f0.b(TapShareForumPost.class)), x.a("onTapReactionOverflow", f0.b(TapReactionOverflow.class)), x.a("onTapAutoModerationActions", f0.b(TapAutoModerationActionsData.class)), x.a("onTapAutoModerationFeedback", f0.b(TapAutoModerationFeedbackData.class)), x.a("onTapOpTag", f0.b(TapOpTagData.class)), x.a("onTapShowAltText", f0.b(TapShowAltTextData.class)), x.a("onVoiceMessagePlaybackEnded", f0.b(VoiceMessagePlaybackEndedData.class)), x.a("onVoiceMessagePlaybackFailed", f0.b(VoiceMessagePlaybackFailedData.class)), x.a("onVoiceMessagePlaybackStarted", f0.b(VoiceMessagePlaybackStartedData.class)), x.a("onTapJoinEmbeddedActivity", f0.b(TapJoinEmbeddedActivityData.class)), x.a("onTapDismissEmbeddedActivity", f0.b(TapDismissEmbeddedActivityData.class)), x.a("onTapActivityLauncherEmbed", f0.b(TapActivityLauncherEmbedData.class)), x.a("onTapPostPreviewEmbed", f0.b(TapPostPreviewEmbedData.class)), x.a("onTapDismissMediaPostSharePrompt", f0.b(TapDismissMediaPostSharePromptData.class)));
    }
}
