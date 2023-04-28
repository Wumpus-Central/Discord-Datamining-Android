package com.discord.chat.reactevents;

import bj.C3681n1;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.primitives.ChannelId;
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
@Metadata(m15074d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&HÇ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006)"}, m15073d2 = {"Lcom/discord/chat/reactevents/LongPressCommandData;", "Lcom/discord/reactevents/ReactEvent;", "node", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", "seen1", "", "channelId", "", "commandId", "commandName", "commandKey", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelId", "()Ljava/lang/String;", "getCommandId", "getCommandKey", "getCommandName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class LongPressCommandData implements ReactEvent {
    public static final Companion Companion = new Companion(null);
    private final String channelId;
    private final String commandId;
    private final String commandKey;
    private final String commandName;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/reactevents/LongPressCommandData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/reactevents/LongPressCommandData;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LongPressCommandData> serializer() {
            return LongPressCommandData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LongPressCommandData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            C3681n1.m33818b(i, 15, LongPressCommandData$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = str;
        this.commandId = str2;
        this.commandName = str3;
        this.commandKey = str4;
    }

    public static /* synthetic */ LongPressCommandData copy$default(LongPressCommandData longPressCommandData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longPressCommandData.channelId;
        }
        if ((i & 2) != 0) {
            str2 = longPressCommandData.commandId;
        }
        if ((i & 4) != 0) {
            str3 = longPressCommandData.commandName;
        }
        if ((i & 8) != 0) {
            str4 = longPressCommandData.commandKey;
        }
        return longPressCommandData.copy(str, str2, str3, str4);
    }

    public static final void write$Self(LongPressCommandData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.channelId);
        output.mo13864z(serialDesc, 1, self.commandId);
        output.mo13864z(serialDesc, 2, self.commandName);
        output.mo13864z(serialDesc, 3, self.commandKey);
    }

    public final String component1() {
        return this.channelId;
    }

    public final String component2() {
        return this.commandId;
    }

    public final String component3() {
        return this.commandName;
    }

    public final String component4() {
        return this.commandKey;
    }

    public final LongPressCommandData copy(String channelId, String commandId, String commandName, String commandKey) {
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(commandId, "commandId");
        C9971q.m14633g(commandName, "commandName");
        C9971q.m14633g(commandKey, "commandKey");
        return new LongPressCommandData(channelId, commandId, commandName, commandKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongPressCommandData)) {
            return false;
        }
        LongPressCommandData longPressCommandData = (LongPressCommandData) obj;
        return C9971q.m14638b(this.channelId, longPressCommandData.channelId) && C9971q.m14638b(this.commandId, longPressCommandData.commandId) && C9971q.m14638b(this.commandName, longPressCommandData.commandName) && C9971q.m14638b(this.commandKey, longPressCommandData.commandKey);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getCommandId() {
        return this.commandId;
    }

    public final String getCommandKey() {
        return this.commandKey;
    }

    public final String getCommandName() {
        return this.commandName;
    }

    public int hashCode() {
        return (((((this.channelId.hashCode() * 31) + this.commandId.hashCode()) * 31) + this.commandName.hashCode()) * 31) + this.commandKey.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.commandId;
        String str3 = this.commandName;
        String str4 = this.commandKey;
        return "LongPressCommandData(channelId=" + str + ", commandId=" + str2 + ", commandName=" + str3 + ", commandKey=" + str4 + ")";
    }

    public LongPressCommandData(String channelId, String commandId, String commandName, String commandKey) {
        C9971q.m14633g(channelId, "channelId");
        C9971q.m14633g(commandId, "commandId");
        C9971q.m14633g(commandName, "commandName");
        C9971q.m14633g(commandKey, "commandKey");
        this.channelId = channelId;
        this.commandId = commandId;
        this.commandName = commandName;
        this.commandKey = commandKey;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LongPressCommandData(CommandMentionContentNode node) {
        this(ChannelId.m42096toStringimpl(node.m41608getChannelIdo4g7jtM()), node.getCommandId(), node.getCommandName(), node.getCommandKey());
        C9971q.m14633g(node, "node");
    }
}
