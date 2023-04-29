package com.discord.chat.bridge.contentnode;

import bj.n1;
import com.discord.chat.bridge.contentnode.StaticChannelMentionType;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*B@\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB*\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u0017J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "guildId", "Lcom/discord/primitives/GuildId;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/bridge/contentnode/StaticChannelMentionType;Lcom/discord/primitives/GuildId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;Lcom/discord/primitives/GuildId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId", "()Lcom/discord/chat/bridge/contentnode/StaticChannelMentionType;", "getContent", "()Ljava/util/List;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "component1", "component2", "component2-qOKuAAo", "component3", "copy", "copy-Cu15v9A", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StaticChannelMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final StaticChannelMentionType channelId;
    private final List<ContentNode> content;
    private final GuildId guildId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StaticChannelMentionContentNode> serializer() {
            return StaticChannelMentionContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private StaticChannelMentionContentNode(int i10, StaticChannelMentionType staticChannelMentionType, GuildId guildId, List<? extends ContentNode> list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (5 != (i10 & 5)) {
            n1.b(i10, 5, StaticChannelMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        this.channelId = staticChannelMentionType;
        if ((i10 & 2) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        this.content = list;
    }

    public /* synthetic */ StaticChannelMentionContentNode(int i10, StaticChannelMentionType staticChannelMentionType, GuildId guildId, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, staticChannelMentionType, guildId, list, serializationConstructorMarker);
    }

    public /* synthetic */ StaticChannelMentionContentNode(StaticChannelMentionType staticChannelMentionType, GuildId guildId, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(staticChannelMentionType, guildId, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-Cu15v9A$default  reason: not valid java name */
    public static /* synthetic */ StaticChannelMentionContentNode m82copyCu15v9A$default(StaticChannelMentionContentNode staticChannelMentionContentNode, StaticChannelMentionType staticChannelMentionType, GuildId guildId, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            staticChannelMentionType = staticChannelMentionContentNode.channelId;
        }
        if ((i10 & 2) != 0) {
            guildId = staticChannelMentionContentNode.guildId;
        }
        if ((i10 & 4) != 0) {
            list = staticChannelMentionContentNode.getContent();
        }
        return staticChannelMentionContentNode.m84copyCu15v9A(staticChannelMentionType, guildId, list);
    }

    public static final void write$Self(StaticChannelMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        boolean z10 = false;
        output.t(serialDesc, 0, StaticChannelMentionType.Serializer.INSTANCE, self.channelId);
        if (output.A(serialDesc, 1) || self.guildId != null) {
            z10 = true;
        }
        if (z10) {
            output.p(serialDesc, 1, GuildId$$serializer.INSTANCE, self.guildId);
        }
        output.t(serialDesc, 2, new bj.f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    public final StaticChannelMentionType component1() {
        return this.channelId;
    }

    /* renamed from: component2-qOKuAAo  reason: not valid java name */
    public final GuildId m83component2qOKuAAo() {
        return this.guildId;
    }

    public final List<ContentNode> component3() {
        return getContent();
    }

    /* renamed from: copy-Cu15v9A  reason: not valid java name */
    public final StaticChannelMentionContentNode m84copyCu15v9A(StaticChannelMentionType channelId, GuildId guildId, List<? extends ContentNode> content) {
        q.g(channelId, "channelId");
        q.g(content, "content");
        return new StaticChannelMentionContentNode(channelId, guildId, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticChannelMentionContentNode)) {
            return false;
        }
        StaticChannelMentionContentNode staticChannelMentionContentNode = (StaticChannelMentionContentNode) obj;
        return this.channelId == staticChannelMentionContentNode.channelId && q.b(this.guildId, staticChannelMentionContentNode.guildId) && q.b(getContent(), staticChannelMentionContentNode.getContent());
    }

    public final StaticChannelMentionType getChannelId() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m85getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public int hashCode() {
        int hashCode = this.channelId.hashCode() * 31;
        GuildId guildId = this.guildId;
        return ((hashCode + (guildId == null ? 0 : GuildId.m550hashCodeimpl(guildId.m554unboximpl()))) * 31) + getContent().hashCode();
    }

    public String toString() {
        StaticChannelMentionType staticChannelMentionType = this.channelId;
        GuildId guildId = this.guildId;
        List<ContentNode> content = getContent();
        return "StaticChannelMentionContentNode(channelId=" + staticChannelMentionType + ", guildId=" + guildId + ", content=" + content + ")";
    }

    public /* synthetic */ StaticChannelMentionContentNode(StaticChannelMentionType staticChannelMentionType, GuildId guildId, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(staticChannelMentionType, (i10 & 2) != 0 ? null : guildId, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private StaticChannelMentionContentNode(StaticChannelMentionType staticChannelMentionType, GuildId guildId, List<? extends ContentNode> list) {
        super(null);
        this.channelId = staticChannelMentionType;
        this.guildId = guildId;
        this.content = list;
    }
}
