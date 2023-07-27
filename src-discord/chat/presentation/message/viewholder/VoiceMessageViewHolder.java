package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.primitives.UserId;
import com.reactnativecommunity.webview.RNCWebViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/VoiceMessageViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;", "(Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "attachmentsOpacity", "", "(Lcom/discord/chat/presentation/message/messagepart/AudioAttachmentMessageAccessory;Lcom/discord/chat/presentation/events/ChatEventHandler;Ljava/lang/Float;)V", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class VoiceMessageViewHolder extends MessagePartViewHolder {
    private final AudioPlayerView view;

    
    public VoiceMessageViewHolder(AudioPlayerView view) {
        super(view, null);
        q.g(view, "view");
        this.view = view;
    }

    public final void bind(final AudioAttachmentMessageAccessory accessory, final ChatEventHandler eventHandler, Float f10) {
        Float durationSecs;
        q.g(accessory, "accessory");
        q.g(eventHandler, "eventHandler");
        Attachment attachment = accessory.getAttachment();
        byte[] waveformByteArray = attachment.getWaveformByteArray();
        if (waveformByteArray != null && (durationSecs = attachment.getDurationSecs()) != null) {
            final float floatValue = durationSecs.floatValue();
            VoiceMessageViewHolder$bind$1$onCancelUpload$1 voiceMessageViewHolder$bind$1$onCancelUpload$1 = new VoiceMessageViewHolder$bind$1$onCancelUpload$1(attachment, eventHandler);
            AudioPlayerView audioPlayerView = this.view;
            audioPlayerView.m326setSourceUrlntcYbpo(accessory.mo217getMessageId3Eiw7ao(), accessory.getAttachment().getUrl());
            audioPlayerView.setSampleData(waveformByteArray);
            audioPlayerView.setDurationMs(((float) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) * floatValue);
            audioPlayerView.setUploadProgress(attachment.getProgress(), voiceMessageViewHolder$bind$1$onCancelUpload$1, f10);
            audioPlayerView.shouldAnimate(attachment.isAnimated());
            audioPlayerView.setListener(new AudioPlayerView.Listener() { 
                @Override 
                public void voiceMessagePlaybackEnded(float f11, float f12) {
                    ChatEventHandler chatEventHandler = ChatEventHandler.this;
                    String str = accessory.mo217getMessageId3Eiw7ao();
                    float f13 = floatValue;
                    UserId userId = accessory.m225getAuthorIdwUX8bhU();
                    if (userId != null) {
                        chatEventHandler.mo181voiceMessagePlaybackEndedHuwN0RY(str, f13, f11, userId.m639unboximpl(), f12);
                    }
                }

                @Override 
                public void voiceMessagePlaybackFailed(String str) {
                    ChatEventHandler.this.mo182voiceMessagePlaybackFailedntcYbpo(accessory.mo217getMessageId3Eiw7ao(), str);
                }

                @Override 
                public void voiceMessagePlaybackStarted(float f11) {
                    ChatEventHandler chatEventHandler = ChatEventHandler.this;
                    String str = accessory.mo217getMessageId3Eiw7ao();
                    float f12 = floatValue;
                    UserId userId = accessory.m225getAuthorIdwUX8bhU();
                    if (userId != null) {
                        chatEventHandler.mo183voiceMessagePlaybackStartedOuNwOLg(str, f12, f11, userId.m639unboximpl());
                    }
                }
            });
        }
    }
}
