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
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006 "}, m15073d2 = {"Lcom/discord/chat/reactevents/TapAutoModerationActionsData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "messageId", "", "channelId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getMessageId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TapAutoModerationActionsData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String messageId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/TapAutoModerationActionsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapAutoModerationActionsData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapAutoModerationActionsData> serializer() {
            return TapAutoModerationActionsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapAutoModerationActionsData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C3681n1.m33818b(i, 3, TapAutoModerationActionsData$$serializer.INSTANCE.getDescriptor());
        }
        this.messageId = str;
        this.channelId = str2;
    }

    public static /* synthetic */ TapAutoModerationActionsData copy$default(TapAutoModerationActionsData tapAutoModerationActionsData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapAutoModerationActionsData.messageId;
        }
        if ((i & 2) != 0) {
            str2 = tapAutoModerationActionsData.channelId;
        }
        return tapAutoModerationActionsData.copy(str, str2);
    }

    public static final void write$Self(TapAutoModerationActionsData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.messageId);
        output.mo13864z(serialDesc, 1, self.channelId);
    }

    public final String component1() {
        return this.messageId;
    }

    public final String component2() {
        return this.channelId;
    }

    public final TapAutoModerationActionsData copy(String messageId, String channelId) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(channelId, "channelId");
        return new TapAutoModerationActionsData(messageId, channelId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapAutoModerationActionsData)) {
            return false;
        }
        TapAutoModerationActionsData tapAutoModerationActionsData = (TapAutoModerationActionsData) obj;
        return C9971q.m14638b(this.messageId, tapAutoModerationActionsData.messageId) && C9971q.m14638b(this.channelId, tapAutoModerationActionsData.channelId);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (this.messageId.hashCode() * 31) + this.channelId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.channelId;
        return "TapAutoModerationActionsData(messageId=" + str + ", channelId=" + str2 + ")";
    }

    public TapAutoModerationActionsData(String messageId, String channelId) {
        C9971q.m14633g(messageId, "messageId");
        C9971q.m14633g(channelId, "channelId");
        this.messageId = messageId;
        this.channelId = channelId;
    }
}
