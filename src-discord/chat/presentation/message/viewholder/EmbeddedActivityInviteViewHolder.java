package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory;
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/EmbeddedActivityInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "embeddedActivityInviteView", "Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/EmbeddedActivityInviteView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "getEventHandler", "()Lcom/discord/chat/presentation/events/ChatEventHandler;", "bind", "", "embeddedActivityInviteAccessory", "Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class EmbeddedActivityInviteViewHolder extends MessagePartViewHolder {
    private final EmbeddedActivityInviteView embeddedActivityInviteView;
    private final ChatEventHandler eventHandler;

    
    public EmbeddedActivityInviteViewHolder(EmbeddedActivityInviteView embeddedActivityInviteView, ChatEventHandler eventHandler) {
        super(embeddedActivityInviteView, null);
        q.h(embeddedActivityInviteView, "embeddedActivityInviteView");
        q.h(eventHandler, "eventHandler");
        this.embeddedActivityInviteView = embeddedActivityInviteView;
        this.eventHandler = eventHandler;
    }

    
    public static final void bind$lambda$1$lambda$0(EmbeddedActivityInviteViewHolder this$0, EmbeddedActivityInviteMessageAccessory embeddedActivityInviteAccessory, View view) {
        q.h(this$0, "this$0");
        q.h(embeddedActivityInviteAccessory, "$embeddedActivityInviteAccessory");
        this$0.eventHandler.mo165onTapInviteEmbedAFFcxXc(embeddedActivityInviteAccessory.mo218getMessageId3Eiw7ao(), embeddedActivityInviteAccessory.getCodedLinkIndex(), null, null);
    }

    public final void bind(final EmbeddedActivityInviteMessageAccessory embeddedActivityInviteAccessory) {
        q.h(embeddedActivityInviteAccessory, "embeddedActivityInviteAccessory");
        EmbeddedActivityInviteEmbedImpl embeddedActivityInviteEmbed = embeddedActivityInviteAccessory.getEmbeddedActivityInviteEmbed();
        EmbeddedActivityInviteView embeddedActivityInviteView = this.embeddedActivityInviteView;
        embeddedActivityInviteView.setSplash(embeddedActivityInviteEmbed.getSplashUrl(), embeddedActivityInviteAccessory.getConstrainedWidth());
        embeddedActivityInviteView.setTitleText(embeddedActivityInviteEmbed.getTitleText());
        embeddedActivityInviteView.setHeaderText(embeddedActivityInviteEmbed.getHeaderText());
        embeddedActivityInviteView.m308setSubtitleTextSAQFhFE(embeddedActivityInviteEmbed.getStructurableSubtitleText(), embeddedActivityInviteAccessory.mo218getMessageId3Eiw7ao(), new EmbeddedActivityInviteViewHolder$bind$1$1(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$2(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$3(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$4(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$5(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$6(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$7(this.eventHandler), EmbeddedActivityInviteViewHolder$bind$1$11.INSTANCE, new EmbeddedActivityInviteViewHolder$bind$1$8(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$9(this.eventHandler), new EmbeddedActivityInviteViewHolder$bind$1$10(this.eventHandler));
        embeddedActivityInviteView.setNoParticipantsText(embeddedActivityInviteEmbed.getNoParticipantsText());
        embeddedActivityInviteView.setLaunchButton(embeddedActivityInviteEmbed.getAcceptLabelText(), embeddedActivityInviteEmbed.getAcceptLabelBackgroundColor(), embeddedActivityInviteEmbed.getCtaEnabled());
        embeddedActivityInviteView.setAvatarUris(embeddedActivityInviteEmbed.getParticipantAvatarUris());
        embeddedActivityInviteView.setOnLaunchButtonClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                EmbeddedActivityInviteViewHolder.bind$lambda$1$lambda$0(EmbeddedActivityInviteViewHolder.this, embeddedActivityInviteAccessory, view);
            }
        });
    }

    public final ChatEventHandler getEventHandler() {
        return this.eventHandler;
    }
}
