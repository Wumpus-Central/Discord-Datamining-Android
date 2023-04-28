package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m15073d2 = {"Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;)Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EphemeralIndicationMessageAccessory extends MessageAccessory {
    private final EphemeralIndication ephemeralIndication;
    private final String messageId;

    private EphemeralIndicationMessageAccessory(String str, EphemeralIndication ephemeralIndication) {
        super(str, "ephemeral indication", null);
        this.messageId = str;
        this.ephemeralIndication = ephemeralIndication;
    }

    public /* synthetic */ EphemeralIndicationMessageAccessory(String str, EphemeralIndication ephemeralIndication, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ephemeralIndication);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ EphemeralIndicationMessageAccessory m41783copyntcYbpo$default(EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory, String str, EphemeralIndication ephemeralIndication, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ephemeralIndicationMessageAccessory.mo41765getMessageId3Eiw7ao();
        }
        if ((i & 2) != 0) {
            ephemeralIndication = ephemeralIndicationMessageAccessory.ephemeralIndication;
        }
        return ephemeralIndicationMessageAccessory.m41785copyntcYbpo(str, ephemeralIndication);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41784component13Eiw7ao() {
        return mo41765getMessageId3Eiw7ao();
    }

    public final EphemeralIndication component2() {
        return this.ephemeralIndication;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final EphemeralIndicationMessageAccessory m41785copyntcYbpo(String messageId, EphemeralIndication ephemeralIndication) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(ephemeralIndication, "ephemeralIndication");
        return new EphemeralIndicationMessageAccessory(messageId, ephemeralIndication, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EphemeralIndicationMessageAccessory)) {
            return false;
        }
        EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory = (EphemeralIndicationMessageAccessory) obj;
        return MessageId.m42119equalsimpl0(mo41765getMessageId3Eiw7ao(), ephemeralIndicationMessageAccessory.mo41765getMessageId3Eiw7ao()) && C9971q.m14638b(this.ephemeralIndication, ephemeralIndicationMessageAccessory.ephemeralIndication);
    }

    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo41765getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (MessageId.m42120hashCodeimpl(mo41765getMessageId3Eiw7ao()) * 31) + this.ephemeralIndication.hashCode();
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(mo41765getMessageId3Eiw7ao());
        EphemeralIndication ephemeralIndication = this.ephemeralIndication;
        return "EphemeralIndicationMessageAccessory(messageId=" + str + ", ephemeralIndication=" + ephemeralIndication + ")";
    }
}
