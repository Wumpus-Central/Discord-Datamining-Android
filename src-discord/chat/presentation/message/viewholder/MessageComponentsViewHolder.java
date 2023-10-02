package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.botuikit.SelectComponent;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ5\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u001dH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR%\u0010\u000e\u001a\u00020\u000fX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MessageComponentsViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentActionListener;", "messageComponentsView", "Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "(Lcom/discord/chat/presentation/message/view/botuikit/MessageComponentsView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "messageFlags", "", "getMessageFlags", "()J", "setMessageFlags", "(J)V", "messageId", "Lcom/discord/primitives/MessageId;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "setMessageId-1xi1bu0", "(Ljava/lang/String;)V", "Ljava/lang/String;", "bind", "", "componentsComponentsAccessory", "Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "onTapButtonActionComponent", "customId", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "indices", "", "", "onTapButtonActionComponent-y43Yjpg", "(Ljava/lang/String;JLjava/util/List;)V", "onTapSelectActionComponent", "selectComponent", "Lcom/discord/chat/bridge/botuikit/SelectComponent;", "openLink", "url", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class MessageComponentsViewHolder extends MessagePartViewHolder implements ComponentActionListener {
    private final ChatEventHandler eventHandler;
    private final MessageComponentsView messageComponentsView;
    private long messageFlags;
    private String messageId = MessageId.m644constructorimpl("0");

    
    public MessageComponentsViewHolder(MessageComponentsView messageComponentsView, ChatEventHandler eventHandler) {
        super(messageComponentsView, null);
        q.h(messageComponentsView, "messageComponentsView");
        q.h(eventHandler, "eventHandler");
        this.messageComponentsView = messageComponentsView;
        this.eventHandler = eventHandler;
    }

    public final void bind(MessageComponentsAccessory componentsComponentsAccessory, ComponentProvider componentProvider) {
        q.h(componentsComponentsAccessory, "componentsComponentsAccessory");
        this.messageId = componentsComponentsAccessory.mo240getMessageId3Eiw7ao();
        this.messageFlags = componentsComponentsAccessory.getMessageFlags();
        this.messageComponentsView.setComponents(componentProvider, componentsComponentsAccessory.getMessageComponents(), this);
    }

    public final long getMessageFlags() {
        return this.messageFlags;
    }

    
    public final String m376getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @Override 
    
    public void mo355onTapButtonActionComponenty43Yjpg(String str, long j10, List<Integer> indices) {
        int[] B0;
        q.h(indices, "indices");
        ChatEventHandler chatEventHandler = this.eventHandler;
        String str2 = this.messageId;
        long j11 = this.messageFlags;
        B0 = r.B0(indices);
        chatEventHandler.mo174onTapButtonActionComponentNkFJqEg(str2, j11, str, j10, B0);
    }

    @Override 
    public void onTapSelectActionComponent(SelectComponent selectComponent) {
        q.h(selectComponent, "selectComponent");
        this.eventHandler.mo191onTapSelectActionComponentu7_MRrM(this.messageId, this.messageFlags, selectComponent);
    }

    @Override 
    public void openLink(String url) {
        q.h(url, "url");
        this.eventHandler.mo164onLinkClickedu7_MRrM(this.messageId, url, "");
    }

    public final void setMessageFlags(long j10) {
        this.messageFlags = j10;
    }

    
    public final void m377setMessageId1xi1bu0(String str) {
        q.h(str, "<set-?>");
        this.messageId = str;
    }
}
