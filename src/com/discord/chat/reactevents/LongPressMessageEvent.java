package com.discord.chat.reactevents;

import bj.C3681n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J!\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, m15073d2 = {"Lcom/discord/chat/reactevents/LongPressMessageEvent;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "", "channelId", "mediaIndex", "mediaType", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getMediaIndex", "()I", "getMediaType", "getMessageId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class LongPressMessageEvent implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final int mediaIndex;
    private final String mediaType;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/LongPressMessageEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/LongPressMessageEvent;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LongPressMessageEvent> serializer() {
            return LongPressMessageEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LongPressMessageEvent(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C3681n1.m33818b(i, 15, LongPressMessageEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = str2;
        this.mediaIndex = i2;
        this.mediaType = str3;
    }

    public static /* synthetic */ LongPressMessageEvent copy$default(LongPressMessageEvent longPressMessageEvent, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = longPressMessageEvent.messageId;
        }
        if ((i2 & 2) != 0) {
            str2 = longPressMessageEvent.channelId;
        }
        if ((i2 & 4) != 0) {
            i = longPressMessageEvent.mediaIndex;
        }
        if ((i2 & 8) != 0) {
            str3 = longPressMessageEvent.mediaType;
        }
        return longPressMessageEvent.copy(str, str2, i, str3);
    }

    public static final void write$Self(LongPressMessageEvent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.messageId);
        output.mo13864z(serialDesc, 1, self.channelId);
        output.mo13866x(serialDesc, 2, self.mediaIndex);
        output.mo13864z(serialDesc, 3, self.mediaType);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.channelId;
    }

    public final int component3() {
        return this.mediaIndex;
    }

    public final String component4() {
        return this.mediaType;
    }

    public final LongPressMessageEvent copy(String messageId, String channelId, int i, String mediaType) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(mediaType, "mediaType");
        return new LongPressMessageEvent(messageId, channelId, i, mediaType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPressMessageEvent)) {
            return false;
        }
        LongPressMessageEvent longPressMessageEvent = (LongPressMessageEvent) obj;
        return C9971q.m14638b(this.messageId, longPressMessageEvent.messageId) && C9971q.m14638b(this.channelId, longPressMessageEvent.channelId) && this.mediaIndex == longPressMessageEvent.mediaIndex && C9971q.m14638b(this.mediaType, longPressMessageEvent.mediaType);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final int getMediaIndex() {
        return this.mediaIndex;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((this.messageId.hashCode() * 31) + this.channelId.hashCode()) * 31) + this.mediaIndex) * 31) + this.mediaType.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.channelId;
        int i = this.mediaIndex;
        String str3 = this.mediaType;
        return "LongPressMessageEvent(messageId=" + str + ", channelId=" + str2 + ", mediaIndex=" + i + ", mediaType=" + str3 + ")";
    }

    public LongPressMessageEvent(String messageId, String channelId, int i, String mediaType) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(mediaType, "mediaType");
        this.messageId = messageId;
        this.channelId = channelId;
        this.mediaIndex = i;
        this.mediaType = mediaType;
    }
}
