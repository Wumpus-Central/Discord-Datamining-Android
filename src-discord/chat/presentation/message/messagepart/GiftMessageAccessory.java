package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "index", "", "gift", "Lcom/discord/chat/bridge/gift/GiftEmbed;", "(Ljava/lang/String;ILcom/discord/chat/bridge/gift/GiftEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getGift", "()Lcom/discord/chat/bridge/gift/GiftEmbed;", "getIndex", "()I", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/gift/GiftEmbed;)Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GiftMessageAccessory extends MessageAccessory {
    private final GiftEmbed gift;
    private final int index;
    private final String messageId;

    private GiftMessageAccessory(String str, int i10, GiftEmbed giftEmbed) {
        super(str, "gift " + i10, null);
        this.messageId = str;
        this.index = i10;
        this.gift = giftEmbed;
    }

    public /* synthetic */ GiftMessageAccessory(String str, int i10, GiftEmbed giftEmbed, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, giftEmbed);
    }

    /* renamed from: copy-u7_MRrM$default  reason: not valid java name */
    public static /* synthetic */ GiftMessageAccessory m247copyu7_MRrM$default(GiftMessageAccessory giftMessageAccessory, String str, int i10, GiftEmbed giftEmbed, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = giftMessageAccessory.mo214getMessageId3Eiw7ao();
        }
        if ((i11 & 2) != 0) {
            i10 = giftMessageAccessory.index;
        }
        if ((i11 & 4) != 0) {
            giftEmbed = giftMessageAccessory.gift;
        }
        return giftMessageAccessory.m249copyu7_MRrM(str, i10, giftEmbed);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m248component13Eiw7ao() {
        return mo214getMessageId3Eiw7ao();
    }

    public final int component2() {
        return this.index;
    }

    public final GiftEmbed component3() {
        return this.gift;
    }

    /* renamed from: copy-u7_MRrM  reason: not valid java name */
    public final GiftMessageAccessory m249copyu7_MRrM(String messageId, int i10, GiftEmbed gift) {
        q.g(messageId, "messageId");
        q.g(gift, "gift");
        return new GiftMessageAccessory(messageId, i10, gift, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftMessageAccessory)) {
            return false;
        }
        GiftMessageAccessory giftMessageAccessory = (GiftMessageAccessory) obj;
        return MessageId.m592equalsimpl0(mo214getMessageId3Eiw7ao(), giftMessageAccessory.mo214getMessageId3Eiw7ao()) && this.index == giftMessageAccessory.index && q.b(this.gift, giftMessageAccessory.gift);
    }

    public final GiftEmbed getGift() {
        return this.gift;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo214getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public int hashCode() {
        return (((MessageId.m593hashCodeimpl(mo214getMessageId3Eiw7ao()) * 31) + this.index) * 31) + this.gift.hashCode();
    }

    public String toString() {
        String str = MessageId.m594toStringimpl(mo214getMessageId3Eiw7ao());
        int i10 = this.index;
        GiftEmbed giftEmbed = this.gift;
        return "GiftMessageAccessory(messageId=" + str + ", index=" + i10 + ", gift=" + giftEmbed + ")";
    }
}
