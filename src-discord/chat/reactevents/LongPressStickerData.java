package com.discord.chat.reactevents;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kf.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/reactevents/LongPressStickerData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;)Lcom/discord/chat/reactevents/LongPressStickerData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class LongPressStickerData implements ReactEvent {
    private final String messageId;
    private final Sticker sticker;

    private LongPressStickerData(String str, Sticker sticker) {
        this.messageId = str;
        this.sticker = sticker;
    }

    public  LongPressStickerData(String str, Sticker sticker, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sticker);
    }

    
    public static  LongPressStickerData m386copyntcYbpo$default(LongPressStickerData longPressStickerData, String str, Sticker sticker, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = longPressStickerData.messageId;
        }
        if ((i10 & 2) != 0) {
            sticker = longPressStickerData.sticker;
        }
        return longPressStickerData.m388copyntcYbpo(str, sticker);
    }

    
    public final String m387component13Eiw7ao() {
        return this.messageId;
    }

    public final Sticker component2() {
        return this.sticker;
    }

    
    public final LongPressStickerData m388copyntcYbpo(String messageId, Sticker sticker) {
        q.h(messageId, "messageId");
        q.h(sticker, "sticker");
        return new LongPressStickerData(messageId, sticker, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPressStickerData)) {
            return false;
        }
        LongPressStickerData longPressStickerData = (LongPressStickerData) obj;
        return MessageId.m628equalsimpl0(this.messageId, longPressStickerData.messageId) && q.c(this.sticker, longPressStickerData.sticker);
    }

    
    public final String m389getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (MessageId.m629hashCodeimpl(this.messageId) * 31) + this.sticker.hashCode();
    }

    @Override 
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("messageId", this.messageId), x.a("sticker", NativeMapExtensionsKt.nativeMapOf(x.a("id", String.valueOf(this.sticker.getId())), x.a(ZeroconfModule.KEY_SERVICE_NAME, this.sticker.getName()))));
    }

    public String toString() {
        String str = MessageId.m630toStringimpl(this.messageId);
        Sticker sticker = this.sticker;
        return "LongPressStickerData(messageId=" + str + ", sticker=" + sticker + ")";
    }
}
