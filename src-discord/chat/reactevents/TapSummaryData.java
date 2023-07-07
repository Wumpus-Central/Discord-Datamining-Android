package com.discord.chat.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#"}, d2 = {"Lcom/discord/chat/reactevents/TapSummaryData;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "channelId", "", "messageId", "summaryId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getMessageId", "getSummaryId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TapSummaryData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String messageId;
    private final String summaryId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/reactevents/TapSummaryData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/TapSummaryData;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TapSummaryData> serializer() {
            return TapSummaryData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TapSummaryData(int i10, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, TapSummaryData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.messageId = str2;
        this.summaryId = str3;
    }

    public static /* synthetic */ TapSummaryData copy$default(TapSummaryData tapSummaryData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tapSummaryData.channelId;
        }
        if ((i10 & 2) != 0) {
            str2 = tapSummaryData.messageId;
        }
        if ((i10 & 4) != 0) {
            str3 = tapSummaryData.summaryId;
        }
        return tapSummaryData.copy(str, str2, str3);
    }

    public static final void write$Self(TapSummaryData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.t(serialDesc, 0, self.channelId);
        output.t(serialDesc, 1, self.messageId);
        output.t(serialDesc, 2, self.summaryId);
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.summaryId;
    }

    public final TapSummaryData copy(String channelId, String messageId, String summaryId) {
        q.g(channelId, "channelId");
        q.g(messageId, "messageId");
        q.g(summaryId, "summaryId");
        return new TapSummaryData(channelId, messageId, summaryId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapSummaryData)) {
            return false;
        }
        TapSummaryData tapSummaryData = (TapSummaryData) obj;
        return q.b(this.channelId, tapSummaryData.channelId) && q.b(this.messageId, tapSummaryData.messageId) && q.b(this.summaryId, tapSummaryData.summaryId);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getSummaryId() {
        return this.summaryId;
    }

    public int hashCode() {
        return (((this.channelId.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.summaryId.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.messageId;
        String str3 = this.summaryId;
        return "TapSummaryData(channelId=" + str + ", messageId=" + str2 + ", summaryId=" + str3 + ")";
    }

    public TapSummaryData(String channelId, String messageId, String summaryId) {
        q.g(channelId, "channelId");
        q.g(messageId, "messageId");
        q.g(summaryId, "summaryId");
        this.channelId = channelId;
        this.messageId = messageId;
        this.summaryId = summaryId;
    }
}
