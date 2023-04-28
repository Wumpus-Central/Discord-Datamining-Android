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

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\u0003HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J*\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/chat/reactevents/LongPressStickerData;", "Lcom/discord/reactevents/ReactEvent;", "messageId", "Lcom/discord/primitives/MessageId;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/sticker/Sticker;)Lcom/discord/chat/reactevents/LongPressStickerData;", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class LongPressStickerData implements ReactEvent {
    private final String messageId;
    private final Sticker sticker;

    private LongPressStickerData(String str, Sticker sticker) {
        this.messageId = str;
        this.sticker = sticker;
    }

    public /* synthetic */ LongPressStickerData(String str, Sticker sticker, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, sticker);
    }

    /* renamed from: copy-ntcYbpo$default  reason: not valid java name */
    public static /* synthetic */ LongPressStickerData m41905copyntcYbpo$default(LongPressStickerData longPressStickerData, String str, Sticker sticker, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longPressStickerData.messageId;
        }
        if ((i & 2) != 0) {
            sticker = longPressStickerData.sticker;
        }
        return longPressStickerData.m41907copyntcYbpo(str, sticker);
    }

    /* renamed from: component1-3Eiw7ao  reason: not valid java name */
    public final String m41906component13Eiw7ao() {
        return this.messageId;
    }

    public final Sticker component2() {
        return this.sticker;
    }

    /* renamed from: copy-ntcYbpo  reason: not valid java name */
    public final LongPressStickerData m41907copyntcYbpo(String messageId, Sticker sticker) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(sticker, "sticker");
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
        return MessageId.m42119equalsimpl0(this.messageId, longPressStickerData.messageId) && C9971q.m14638b(this.sticker, longPressStickerData.sticker);
    }

    /* renamed from: getMessageId-3Eiw7ao  reason: not valid java name */
    public final String m41908getMessageId3Eiw7ao() {
        return this.messageId;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (MessageId.m42120hashCodeimpl(this.messageId) * 31) + this.sticker.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("messageId", this.messageId), C11098x.m10921a("sticker", NativeMapExtensionsKt.nativeMapOf(C11098x.m10921a("id", String.valueOf(this.sticker.getId())), C11098x.m10921a("name", this.sticker.getName()))));
    }

    public String toString() {
        String str = MessageId.m42121toStringimpl(this.messageId);
        Sticker sticker = this.sticker;
        return "LongPressStickerData(messageId=" + str + ", sticker=" + sticker + ")";
    }
}
