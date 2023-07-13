package com.discord.chat.reactevents;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import ff.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/reactevents/TapStickerData;", "Lcom/discord/reactevents/ReactEvent;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "messageId", "Lcom/discord/primitives/MessageId;", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component2", "component2-3Eiw7ao", "copy", "copy-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TapStickerData implements ReactEvent {
    private final String messageId;
    private final Sticker sticker;

    private TapStickerData(Sticker sticker, String str) {
        this.sticker = sticker;
        this.messageId = str;
    }

    public  TapStickerData(Sticker sticker, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sticker, str);
    }

    
    public static  TapStickerData m412copyAyv7vGE$default(TapStickerData tapStickerData, Sticker sticker, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sticker = tapStickerData.sticker;
        }
        if ((i10 & 2) != 0) {
            str = tapStickerData.messageId;
        }
        return tapStickerData.m414copyAyv7vGE(sticker, str);
    }

    public final Sticker component1() {
        return this.sticker;
    }

    
    public final String m413component23Eiw7ao() {
        return this.messageId;
    }

    
    public final TapStickerData m414copyAyv7vGE(Sticker sticker, String messageId) {
        q.g(sticker, "sticker");
        q.g(messageId, "messageId");
        return new TapStickerData(sticker, messageId, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapStickerData)) {
            return false;
        }
        TapStickerData tapStickerData = (TapStickerData) obj;
        return q.b(this.sticker, tapStickerData.sticker) && MessageId.m594equalsimpl0(this.messageId, tapStickerData.messageId);
    }

    
    public final String m415getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (this.sticker.hashCode() * 31) + MessageId.m595hashCodeimpl(this.messageId);
    }

    @Override 
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(x.a("messageId", this.messageId), x.a("sticker", NativeMapExtensionsKt.nativeMapOf(x.a("id", String.valueOf(this.sticker.getId())), x.a(ZeroconfModule.KEY_SERVICE_NAME, this.sticker.getName()))));
    }

    public String toString() {
        Sticker sticker = this.sticker;
        String str = MessageId.m596toStringimpl(this.messageId);
        return "TapStickerData(sticker=" + sticker + ", messageId=" + str + ")";
    }
}
