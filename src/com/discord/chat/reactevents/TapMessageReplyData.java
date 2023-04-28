package com.discord.chat.reactevents;

import bj.C2560n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m15073d2 = {"Lcom/discord/chat/reactevents/TapMessageReplyData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "channelId", "", "originId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getOriginId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapMessageReplyData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String originId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapMessageReplyData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapMessageReplyData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapMessageReplyData> serializer() {
            return TapMessageReplyData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapMessageReplyData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, TapMessageReplyData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.originId = str2;
    }

    public static /* synthetic */ TapMessageReplyData copy$default(TapMessageReplyData tapMessageReplyData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapMessageReplyData.channelId;
        }
        if ((i & 2) != 0) {
            str2 = tapMessageReplyData.originId;
        }
        return tapMessageReplyData.copy(str, str2);
    }

    public static final void write$Self(TapMessageReplyData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.channelId);
        output.mo13864z(serialDesc, 1, self.originId);
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.originId;
    }

    public final TapMessageReplyData copy(String channelId, String originId) {
        C9677q.m14633g(channelId, "channelId");
        C9677q.m14633g(originId, "originId");
        return new TapMessageReplyData(channelId, originId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapMessageReplyData)) {
            return false;
        }
        TapMessageReplyData tapMessageReplyData = (TapMessageReplyData) obj;
        return C9677q.m14638b(this.channelId, tapMessageReplyData.channelId) && C9677q.m14638b(this.originId, tapMessageReplyData.originId);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getOriginId() {
        return this.originId;
    }

    public int hashCode() {
        return (this.channelId.hashCode() * 31) + this.originId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.originId;
        return "TapMessageReplyData(channelId=" + str + ", originId=" + str2 + ")";
    }

    public TapMessageReplyData(String channelId, String originId) {
        C9677q.m14633g(channelId, "channelId");
        C9677q.m14633g(originId, "originId");
        this.channelId = channelId;
        this.originId = originId;
    }
}
