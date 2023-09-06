package com.discord.chat.bridge.contentnode;

import co.discord.media_engine.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@f
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B5\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "seen1", "", "timestamp", "", "full", "", "formatted", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;)V", "getFormatted", "()Ljava/lang/String;", "getFull", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class TimestampContentNode extends ContentNode {
    public static final Companion Companion = new Companion(null);
    private final String formatted;
    private final String full;
    private final long timestamp;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/TimestampContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/TimestampContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimestampContentNode> serializer() {
            return TimestampContentNode$$serializer.INSTANCE;
        }
    }

    
    public  TimestampContentNode(int i10, long j10, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (7 != (i10 & 7)) {
            n1.b(i10, 7, TimestampContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.timestamp = j10;
        this.full = str;
        this.formatted = str2;
    }

    public static  TimestampContentNode copy$default(TimestampContentNode timestampContentNode, long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = timestampContentNode.timestamp;
        }
        if ((i10 & 2) != 0) {
            str = timestampContentNode.full;
        }
        if ((i10 & 4) != 0) {
            str2 = timestampContentNode.formatted;
        }
        return timestampContentNode.copy(j10, str, str2);
    }

    public static final void write$Self(TimestampContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        output.E(serialDesc, 0, self.timestamp);
        output.y(serialDesc, 1, self.full);
        output.y(serialDesc, 2, self.formatted);
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

    public final TimestampContentNode copy(long j10, String full, String formatted) {
        q.h(full, "full");
        q.h(formatted, "formatted");
        return new TimestampContentNode(j10, full, formatted);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimestampContentNode)) {
            return false;
        }
        TimestampContentNode timestampContentNode = (TimestampContentNode) obj;
        return this.timestamp == timestampContentNode.timestamp && q.c(this.full, timestampContentNode.full) && q.c(this.formatted, timestampContentNode.formatted);
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
        return (((b.a(this.timestamp) * 31) + this.full.hashCode()) * 31) + this.formatted.hashCode();
    }

    public String toString() {
        long j10 = this.timestamp;
        String str = this.full;
        String str2 = this.formatted;
        return "TimestampContentNode(timestamp=" + j10 + ", full=" + str + ", formatted=" + str2 + ")";
    }

    
    public TimestampContentNode(long j10, String full, String formatted) {
        super(null);
        q.h(full, "full");
        q.h(formatted, "formatted");
        this.timestamp = j10;
        this.full = full;
        this.formatted = formatted;
    }
}
