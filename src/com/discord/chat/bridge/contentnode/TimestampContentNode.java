package com.discord.chat.bridge.contentnode;

import bj.C3681n1;
import co.discord.media_engine.C4081a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "timestamp", "", "full", "", "formatted", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;)V", "getFormatted", "()Ljava/lang/String;", "getFull", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class TimestampContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final String formatted;
    private final String full;
    private final long timestamp;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/TimestampContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimestampContentNode> serializer() {
            return TimestampContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TimestampContentNode(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i & 7)) {
            C3681n1.m33818b(i, 7, TimestampContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j;
        this.full = str;
        this.formatted = str2;
    }

    public static /* synthetic */ TimestampContentNode copy$default(TimestampContentNode timestampContentNode, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = timestampContentNode.timestamp;
        }
        if ((i & 2) != 0) {
            str = timestampContentNode.full;
        }
        if ((i & 4) != 0) {
            str2 = timestampContentNode.formatted;
        }
        return timestampContentNode.copy(j, str, str2);
    }

    public static final void write$Self(TimestampContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13889E(serialDesc, 0, self.timestamp);
        output.mo13864z(serialDesc, 1, self.full);
        output.mo13864z(serialDesc, 2, self.formatted);
    }

    public final long component1() {
        return this.timestamp;
    }

    public final String component2() {
        return this.full;
    }

    public final String component3() {
        return this.formatted;
    }

    public final TimestampContentNode copy(long j, String full, String formatted) {
        C9971q.m14633g(full, "full");
        C9971q.m14633g(formatted, "formatted");
        return new TimestampContentNode(j, full, formatted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimestampContentNode)) {
            return false;
        }
        TimestampContentNode timestampContentNode = (TimestampContentNode) obj;
        return this.timestamp == timestampContentNode.timestamp && C9971q.m14638b(this.full, timestampContentNode.full) && C9971q.m14638b(this.formatted, timestampContentNode.formatted);
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public final String getFull() {
        return this.full;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((C4081a.m32873a(this.timestamp) * 31) + this.full.hashCode()) * 31) + this.formatted.hashCode();
    }

    public String toString() {
        long j = this.timestamp;
        String str = this.full;
        String str2 = this.formatted;
        return "TimestampContentNode(timestamp=" + j + ", full=" + str + ", formatted=" + str2 + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimestampContentNode(long j, String full, String formatted) {
        super(null);
        C9971q.m14633g(full, "full");
        C9971q.m14633g(formatted, "formatted");
        this.timestamp = j;
        this.full = full;
        this.formatted = formatted;
    }
}
