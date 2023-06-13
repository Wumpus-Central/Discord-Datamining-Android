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
/* loaded from: classes8.dex */
public final class MessageComponentsViewHolder extends MessagePartViewHolder implements ComponentActionListener {
    private final ChatEventHandler eventHandler;
    private final MessageComponentsView messageComponentsView;
    private long messageFlags;
    private String messageId = MessageId.m573constructorimpl("0");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComponentsViewHolder(MessageComponentsView messageComponentsView, ChatEventHandler eventHandler) {
        super(messageComponentsView, null);
        q.g(messageComponentsView, "messageComponentsView");
        q.g(eventHandler, "eventHandler");
        this.messageComponentsView = messageComponentsView;
        this.eventHandler = eventHandler;
    }

    public final void bind(MessageComponentsAccessory componentsComponentsAccessory, ComponentProvider componentProvider) {
        q.g(componentsComponentsAccessory, "componentsComponentsAccessory");
        this.messageId = componentsComponentsAccessory.mo204getMessageId3Eiw7ao();
        this.messageFlags = componentsComponentsAccessory.getMessageFlags();
        this.messageComponentsView.setComponents(componentProvider, componentsComponentsAccessory.getMessageComponents(), this);
    }

    public final long getMessageFlags() {
        return this.messageFlags;
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m325getMessageId3Eiw7ao() {
        return this.messageId;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
    /* renamed from: onTapButtonActionComponent-y43Yjpg */
    public void mo307onTapButtonActionComponenty43Yjpg(String str, long j10, List<Integer> indices) {
        int[] C0;
        q.g(indices, "indices");
        ChatEventHandler chatEventHandler = this.eventHandler;
        String str2 = this.messageId;
        long j11 = this.messageFlags;
        C0 = r.C0(indices);
        chatEventHandler.mo152onTapButtonActionComponentNkFJqEg(str2, j11, str, j10, C0);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
    public void onTapSelectActionComponent(SelectComponent selectComponent) {
        q.g(selectComponent, "selectComponent");
        this.eventHandler.mo165onTapSelectActionComponentu7_MRrM(this.messageId, this.messageFlags, selectComponent);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
    public void openLink(String url) {
        q.g(url, "url");
        this.eventHandler.mo142onLinkClickedu7_MRrM(this.messageId, url, "");
    }

    public final void setMessageFlags(long j10) {
        this.messageFlags = j10;
    }

    /* renamed from: setMessageId-1xi1bu0  reason: not valid java name */
    public final void m326setMessageId1xi1bu0(String str) {
        q.g(str, "<set-?>");
        this.messageId = str;
    }
}
