package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.view.EphemeralIndicationView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "ephemeralIndicationView", "Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "ephemeralAccessory", "Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EphemeralIndicationViewHolder extends MessagePartViewHolder {
    private final EphemeralIndicationView ephemeralIndicationView;
    private final ChatEventHandler eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EphemeralIndicationViewHolder(EphemeralIndicationView ephemeralIndicationView, ChatEventHandler eventHandler) {
        super(ephemeralIndicationView, null);
        q.g(ephemeralIndicationView, "ephemeralIndicationView");
        q.g(eventHandler, "eventHandler");
        this.ephemeralIndicationView = ephemeralIndicationView;
        this.eventHandler = eventHandler;
    }

    public final void bind(EphemeralIndicationMessageAccessory ephemeralAccessory) {
        q.g(ephemeralAccessory, "ephemeralAccessory");
        this.ephemeralIndicationView.m306setEphemeralIndicationAFFcxXc(ephemeralAccessory.mo215getMessageId3Eiw7ao(), ephemeralAccessory.getEphemeralIndication(), new EphemeralIndicationViewHolder$bind$1$1(this.eventHandler), new EphemeralIndicationViewHolder$bind$1$2(this, ephemeralAccessory));
    }
}
