package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.sticker.Sticker;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "message", "Lcom/discord/chat/bridge/Message;", "sticker", "Lcom/discord/chat/bridge/sticker/Sticker;", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/bridge/sticker/Sticker;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "getSticker", "()Lcom/discord/chat/bridge/sticker/Sticker;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WelcomeStickerAccessory extends MessageAccessory {
    private final Message message;
    private final Sticker sticker;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WelcomeStickerAccessory(com.discord.chat.bridge.Message r6, com.discord.chat.bridge.sticker.Sticker r7) {
        /*
            r5 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.q.g(r6, r0)
            java.lang.String r0 = "sticker"
            kotlin.jvm.internal.q.g(r7, r0)
            java.lang.String r0 = r6.m17getId3Eiw7ao()
            long r1 = r7.getId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "welcome sticker "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2 = 0
            r5.<init>(r0, r1, r2)
            r5.message = r6
            r5.sticker = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory.<init>(com.discord.chat.bridge.Message, com.discord.chat.bridge.sticker.Sticker):void");
    }

    public static /* synthetic */ WelcomeStickerAccessory copy$default(WelcomeStickerAccessory welcomeStickerAccessory, Message message, Sticker sticker, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            message = welcomeStickerAccessory.message;
        }
        if ((i10 & 2) != 0) {
            sticker = welcomeStickerAccessory.sticker;
        }
        return welcomeStickerAccessory.copy(message, sticker);
    }

    public final Message component1() {
        return this.message;
    }

    public final Sticker component2() {
        return this.sticker;
    }

    public final WelcomeStickerAccessory copy(Message message, Sticker sticker) {
        q.g(message, "message");
        q.g(sticker, "sticker");
        return new WelcomeStickerAccessory(message, sticker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WelcomeStickerAccessory)) {
            return false;
        }
        WelcomeStickerAccessory welcomeStickerAccessory = (WelcomeStickerAccessory) obj;
        return q.b(this.message, welcomeStickerAccessory.message) && q.b(this.sticker, welcomeStickerAccessory.sticker);
    }

    public final Message getMessage() {
        return this.message;
    }

    public final Sticker getSticker() {
        return this.sticker;
    }

    public int hashCode() {
        return (this.message.hashCode() * 31) + this.sticker.hashCode();
    }

    public String toString() {
        Message message = this.message;
        Sticker sticker = this.sticker;
        return "WelcomeStickerAccessory(message=" + message + ", sticker=" + sticker + ")";
    }
}
