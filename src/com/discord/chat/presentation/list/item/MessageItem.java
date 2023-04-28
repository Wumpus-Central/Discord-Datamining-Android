package com.discord.chat.presentation.list.item;

import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010&\u001a\u00020\tHÆ\u0003Jd\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006/"}, m15073d2 = {"Lcom/discord/chat/presentation/list/item/MessageItem;", "Lcom/discord/chat/presentation/list/item/ChatListItem;", "message", "Lcom/discord/chat/bridge/Message;", "messageFrame", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "allowChildGestures", "", "isHighlight", "backgroundHighlight", "Lcom/discord/chat/bridge/BackgroundHighlight;", "reactTag", "", "renderContentOnly", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)V", "getAllowChildGestures", "()Z", "getBackgroundHighlight", "()Lcom/discord/chat/bridge/BackgroundHighlight;", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getMessageContext", "()Lcom/discord/chat/presentation/root/MessageContext;", "getMessageFrame", "()Lcom/discord/chat/bridge/messageframe/MessageFrame;", "getReactTag", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRenderContentOnly", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/root/MessageContext;ZZLcom/discord/chat/bridge/BackgroundHighlight;Ljava/lang/Integer;Z)Lcom/discord/chat/presentation/list/item/MessageItem;", "equals", "other", "", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class MessageItem extends ChatListItem {
    private final boolean allowChildGestures;
    private final BackgroundHighlight backgroundHighlight;
    private final boolean isHighlight;
    private final Message message;
    private final MessageContext messageContext;
    private final MessageFrame messageFrame;
    private final Integer reactTag;
    private final boolean renderContentOnly;

    public /* synthetic */ MessageItem(Message message, MessageFrame messageFrame, MessageContext messageContext, boolean z, boolean z2, BackgroundHighlight backgroundHighlight, Integer num, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(message, (i & 2) != 0 ? null : messageFrame, (i & 4) != 0 ? new MessageContext(false, false, null, null, null, null, null, false, false, false, false, false, 4095, null) : messageContext, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : backgroundHighlight, (i & 64) == 0 ? num : null, (i & 128) == 0 ? z3 : false);
    }

    public final Message component1() {
        return this.message;
    }

    public final MessageFrame component2() {
        return this.messageFrame;
    }

    public final MessageContext component3() {
        return this.messageContext;
    }

    public final boolean component4() {
        return this.allowChildGestures;
    }

    public final boolean component5() {
        return this.isHighlight;
    }

    public final BackgroundHighlight component6() {
        return this.backgroundHighlight;
    }

    public final Integer component7() {
        return this.reactTag;
    }

    public final boolean component8() {
        return this.renderContentOnly;
    }

    public final MessageItem copy(Message message, MessageFrame messageFrame, MessageContext messageContext, boolean z, boolean z2, BackgroundHighlight backgroundHighlight, Integer num, boolean z3) {
        C9971q.m14633g(message, "message");
        C9971q.m14633g(messageContext, "messageContext");
        return new MessageItem(message, messageFrame, messageContext, z, z2, backgroundHighlight, num, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageItem)) {
            return false;
        }
        MessageItem messageItem = (MessageItem) obj;
        return C9971q.m14638b(this.message, messageItem.message) && C9971q.m14638b(this.messageFrame, messageItem.messageFrame) && C9971q.m14638b(this.messageContext, messageItem.messageContext) && this.allowChildGestures == messageItem.allowChildGestures && this.isHighlight == messageItem.isHighlight && C9971q.m14638b(this.backgroundHighlight, messageItem.backgroundHighlight) && C9971q.m14638b(this.reactTag, messageItem.reactTag) && this.renderContentOnly == messageItem.renderContentOnly;
    }

    public final boolean getAllowChildGestures() {
        return this.allowChildGestures;
    }

    public final BackgroundHighlight getBackgroundHighlight() {
        return this.backgroundHighlight;
    }

    public final Message getMessage() {
        return this.message;
    }

    public final MessageContext getMessageContext() {
        return this.messageContext;
    }

    public final MessageFrame getMessageFrame() {
        return this.messageFrame;
    }

    public final Integer getReactTag() {
        return this.reactTag;
    }

    public final boolean getRenderContentOnly() {
        return this.renderContentOnly;
    }

    public int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        MessageFrame messageFrame = this.messageFrame;
        int i = 0;
        int hashCode2 = (((hashCode + (messageFrame == null ? 0 : messageFrame.hashCode())) * 31) + this.messageContext.hashCode()) * 31;
        boolean z = this.allowChildGestures;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.isHighlight;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        int hashCode3 = (i10 + (backgroundHighlight == null ? 0 : backgroundHighlight.hashCode())) * 31;
        Integer num = this.reactTag;
        if (num != null) {
            i = num.hashCode();
        }
        int i11 = (hashCode3 + i) * 31;
        boolean z3 = this.renderContentOnly;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        return i11 + i2;
    }

    public final boolean isHighlight() {
        return this.isHighlight;
    }

    public String toString() {
        Message message = this.message;
        MessageFrame messageFrame = this.messageFrame;
        MessageContext messageContext = this.messageContext;
        boolean z = this.allowChildGestures;
        boolean z2 = this.isHighlight;
        BackgroundHighlight backgroundHighlight = this.backgroundHighlight;
        Integer num = this.reactTag;
        boolean z3 = this.renderContentOnly;
        return "MessageItem(message=" + message + ", messageFrame=" + messageFrame + ", messageContext=" + messageContext + ", allowChildGestures=" + z + ", isHighlight=" + z2 + ", backgroundHighlight=" + backgroundHighlight + ", reactTag=" + num + ", renderContentOnly=" + z3 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageItem(Message message, MessageFrame messageFrame, MessageContext messageContext, boolean z, boolean z2, BackgroundHighlight backgroundHighlight, Integer num, boolean z3) {
        super(MessageId.m42121toStringimpl(message.m41579getId3Eiw7ao()), null);
        C9971q.m14633g(message, "message");
        C9971q.m14633g(messageContext, "messageContext");
        this.message = message;
        this.messageFrame = messageFrame;
        this.messageContext = messageContext;
        this.allowChildGestures = z;
        this.isHighlight = z2;
        this.backgroundHighlight = backgroundHighlight;
        this.reactTag = num;
        this.renderContentOnly = z3;
    }
}
