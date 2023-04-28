package com.discord.chat.reactevents;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\bJ*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapStickerData;", "Lcom/discord/reactevents/ReactEvent;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "messageId", "Lcom/discord/primitives/MessageId;", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component2", "component2-3Eiw7ao", "copy", "copy-Ayv7vGE", "(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)Lcom/discord/chat/reactevents/TapStickerData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapStickerData implements ReactEvent {
    private final String messageId;
    private final Sticker sticker;

    private TapStickerData(Sticker sticker, String str) {
        this.sticker = sticker;
        this.messageId = str;
    }

    public /* synthetic */ TapStickerData(Sticker sticker, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(sticker, str);
    }

    /* renamed from: copy-Ayv7vGE$default  reason: not valid java name */
    public static /* synthetic */ TapStickerData m41957copyAyv7vGE$default(TapStickerData tapStickerData, Sticker sticker, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            sticker = tapStickerData.sticker;
        }
        if ((i & 2) != 0) {
            str = tapStickerData.messageId;
        }
        return tapStickerData.m41959copyAyv7vGE(sticker, str);
    }

    public final Sticker component1() {
        return this.sticker;
    }

    /* renamed from: component2-3Eiw7ao  reason: not valid java name */
    public final String m41958component23Eiw7ao() {
        return this.messageId;
    }

    /* renamed from: copy-Ayv7vGE  reason: not valid java name */
    public final TapStickerData m41959copyAyv7vGE(Sticker sticker, String messageId) {
        C9971q.m14633g(sticker, "sticker");
        C9971q.m14633g(messageId, "messageId");
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
        return C9971q.m14638b(this.sticker, tapStickerData.sticker) && MessageId.m42119equalsimpl0(this.messageId, tapStickerData.messageId);
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41960getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (this.sticker.hashCode() * 31) + MessageId.m42120hashCodeimpl(this.messageId);
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("messageId", this.messageId), C11098x.m10921a("sticker", NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("id", String.valueOf(this.sticker.getId())), C11098x.m10921a("name", this.sticker.getName()))));
    }

    public String toString() {
        Sticker sticker = this.sticker;
        String str = MessageId.m42121toStringimpl(this.messageId);
        return "TapStickerData(sticker=" + sticker + ", messageId=" + str + ")";
    }
}
