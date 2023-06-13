package com.discord.chat.presentation.message.messagepart;

import co.discord.media_engine.b;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.primitives.MessageId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "messageFlags", "", "messageComponents", "", "Lcom/discord/chat/bridge/botuikit/Component;", "(Ljava/lang/String;JLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageComponents", "()Ljava/util/List;", "getMessageFlags", "()J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;JLjava/util/List;)Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageComponentsAccessory extends MessageAccessory {
    private final List<Component> messageComponents;
    private final long messageFlags;
    private final String messageId;

    /* JADX WARN: Multi-variable type inference failed */
    private MessageComponentsAccessory(String str, long j10, List<? extends Component> list) {
        super(str, "bot component", null);
        this.messageId = str;
        this.messageFlags = j10;
        this.messageComponents = list;
    }

    public /* synthetic */ MessageComponentsAccessory(String str, long j10, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ MessageComponentsAccessory m258copyu7_MRrM$default(MessageComponentsAccessory messageComponentsAccessory, String str, long j10, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = messageComponentsAccessory.mo204getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            j10 = messageComponentsAccessory.messageFlags;
        }
        if ((i10 & 4) != 0) {
            list = messageComponentsAccessory.messageComponents;
        }
        return messageComponentsAccessory.m260copyu7_MRrM(str, j10, list);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m259component13Eiw7ao() {
        return mo204getMessageId3Eiw7ao();
    }

    public final long component2() {
        return this.messageFlags;
    }

    public final List<Component> component3() {
        return this.messageComponents;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final MessageComponentsAccessory m260copyu7_MRrM(String messageId, long j10, List<? extends Component> messageComponents) {
        q.g(messageId, "messageId");
        q.g(messageComponents, "messageComponents");
        return new MessageComponentsAccessory(messageId, j10, messageComponents, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageComponentsAccessory)) {
            return false;
        }
        MessageComponentsAccessory messageComponentsAccessory = (MessageComponentsAccessory) obj;
        return MessageId.m576equalsimpl0(mo204getMessageId3Eiw7ao(), messageComponentsAccessory.mo204getMessageId3Eiw7ao()) && this.messageFlags == messageComponentsAccessory.messageFlags && q.b(this.messageComponents, messageComponentsAccessory.messageComponents);
    }

    public final List<Component> getMessageComponents() {
        return this.messageComponents;
    }

    public final long getMessageFlags() {
        return this.messageFlags;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo204getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m577hashCodeimpl(mo204getMessageId3Eiw7ao()) * 31) + b.a(this.messageFlags)) * 31) + this.messageComponents.hashCode();
    }

    public String toString() {
        String str = MessageId.m578toStringimpl(mo204getMessageId3Eiw7ao());
        long j10 = this.messageFlags;
        List<Component> list = this.messageComponents;
        return "MessageComponentsAccessory(messageId=" + str + ", messageFlags=" + j10 + ", messageComponents=" + list + ")";
    }
}
