package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001f\u0010\u0002\u001a\u00020\u0003X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;)Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StickerMessageAccessory extends MessageAccessory {
    private final String messageId;
    private final Sticker sticker;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private StickerMessageAccessory(java.lang.String r5, com.discord.chat.bridge.sticker.Sticker r6) {
        /*
            r4 = this;
            long r0 = r6.getId()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sticker-"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = 0
            r4.<init>(r5, r0, r1)
            r4.messageId = r5
            r4.sticker = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.messagepart.StickerMessageAccessory.<init>(java.lang.String, com.discord.chat.bridge.sticker.Sticker):void");
    }

    public /* synthetic */ StickerMessageAccessory(String str, Sticker sticker, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sticker);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ StickerMessageAccessory m271copyntcYbpo$default(StickerMessageAccessory stickerMessageAccessory, String str, Sticker sticker, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = stickerMessageAccessory.mo202getMessageId3Eiw7ao();
        }
        if ((i10 & 2) != 0) {
            sticker = stickerMessageAccessory.sticker;
        }
        return stickerMessageAccessory.m273copyntcYbpo(str, sticker);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m272component13Eiw7ao() {
        return mo202getMessageId3Eiw7ao();
    }

    public final Sticker component2() {
        return this.sticker;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final StickerMessageAccessory m273copyntcYbpo(String messageId, Sticker sticker) {
        q.g(messageId, "messageId");
        q.g(sticker, "sticker");
        return new StickerMessageAccessory(messageId, sticker, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerMessageAccessory)) {
            return false;
        }
        StickerMessageAccessory stickerMessageAccessory = (StickerMessageAccessory) obj;
        return MessageId.m562equalsimpl0(mo202getMessageId3Eiw7ao(), stickerMessageAccessory.mo202getMessageId3Eiw7ao()) && q.b(this.sticker, stickerMessageAccessory.sticker);
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    /* renamed from: getMessageId-3Eiw7ao */
    public String mo202getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (MessageId.m563hashCodeimpl(mo202getMessageId3Eiw7ao()) * 31) + this.sticker.hashCode();
    }

    public String toString() {
        String str = MessageId.m564toStringimpl(mo202getMessageId3Eiw7ao());
        Sticker sticker = this.sticker;
        return "StickerMessageAccessory(messageId=" + str + ", sticker=" + sticker + ")";
    }
}
