package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.RoleId;
import com.discord.primitives.RoleId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.n1;

@f
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B\\\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012BP\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b&J\u0019\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b(J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J^\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209HÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "userId", "Lcom/discord/primitives/UserId;", "roleColor", "guildId", "Lcom/discord/primitives/GuildId;", "roleId", "Lcom/discord/primitives/RoleId;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getContent", "()Ljava/util/List;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getRoleColor", "()I", "getRoleId-fYaclRY", "()Lcom/discord/primitives/RoleId;", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "component1", "component1-qMVnFVQ", "component2", "component2-wUX8bhU", "component3", "component4", "component4-qOKuAAo", "component5", "component5-fYaclRY", "component6", "copy", "copy-DZRaReU", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UserOrRoleMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final ChannelId channelId;
    private final List<ContentNode> content;
    private final GuildId guildId;
    private final int roleColor;
    private final RoleId roleId;
    private final UserId userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserOrRoleMentionContentNode> serializer() {
            return UserOrRoleMentionContentNode$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private UserOrRoleMentionContentNode(int i10, ChannelId channelId, UserId userId, int i11, GuildId guildId, RoleId roleId, List<? extends ContentNode> list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i10, serializationConstructorMarker);
        if (32 != (i10 & 32)) {
            n1.b(i10, 32, UserOrRoleMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i10 & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i10 & 4) == 0) {
            this.roleColor = 0;
        } else {
            this.roleColor = i11;
        }
        if ((i10 & 8) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i10 & 16) == 0) {
            this.roleId = null;
        } else {
            this.roleId = roleId;
        }
        this.content = list;
    }

    public /* synthetic */ UserOrRoleMentionContentNode(int i10, ChannelId channelId, UserId userId, int i11, GuildId guildId, RoleId roleId, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, channelId, userId, i11, guildId, roleId, list, serializationConstructorMarker);
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i10, GuildId guildId, RoleId roleId, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(channelId, userId, i10, guildId, roleId, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-DZRaReU$default  reason: not valid java name */
    public static /* synthetic */ UserOrRoleMentionContentNode m93copyDZRaReU$default(UserOrRoleMentionContentNode userOrRoleMentionContentNode, ChannelId channelId, UserId userId, int i10, GuildId guildId, RoleId roleId, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            channelId = userOrRoleMentionContentNode.channelId;
        }
        if ((i11 & 2) != 0) {
            userId = userOrRoleMentionContentNode.userId;
        }
        if ((i11 & 4) != 0) {
            i10 = userOrRoleMentionContentNode.roleColor;
        }
        if ((i11 & 8) != 0) {
            guildId = userOrRoleMentionContentNode.guildId;
        }
        if ((i11 & 16) != 0) {
            roleId = userOrRoleMentionContentNode.roleId;
        }
        if ((i11 & 32) != 0) {
            list = userOrRoleMentionContentNode.getContent();
        }
        return userOrRoleMentionContentNode.m98copyDZRaReU(channelId, userId, i10, guildId, roleId, list);
    }

    public static final void write$Self(UserOrRoleMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        boolean z14 = false;
        if (!output.A(serialDesc, 0) && self.channelId == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.u(serialDesc, 0, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (!output.A(serialDesc, 1) && self.userId == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.u(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.A(serialDesc, 2) && self.roleColor == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z12) {
            output.x(serialDesc, 2, self.roleColor);
        }
        if (!output.A(serialDesc, 3) && self.guildId == null) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z13) {
            output.u(serialDesc, 3, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.A(serialDesc, 4) || self.roleId != null) {
            z14 = true;
        }
        if (z14) {
            output.u(serialDesc, 4, RoleId$$serializer.INSTANCE, self.roleId);
        }
        output.q(serialDesc, 5, new yj.f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    /* renamed from: component1-qMVnFVQ  reason: not valid java name */
    public final ChannelId m94component1qMVnFVQ() {
        return this.channelId;
    }

    /* renamed from: component2-wUX8bhU  reason: not valid java name */
    public final UserId m95component2wUX8bhU() {
        return this.userId;
    }

    public final int component3() {
        return this.roleColor;
    }

    /* renamed from: component4-qOKuAAo  reason: not valid java name */
    public final GuildId m96component4qOKuAAo() {
        return this.guildId;
    }

    /* renamed from: component5-fYaclRY  reason: not valid java name */
    public final RoleId m97component5fYaclRY() {
        return this.roleId;
    }

    public final List<ContentNode> component6() {
        return getContent();
    }

    /* renamed from: copy-DZRaReU  reason: not valid java name */
    public final UserOrRoleMentionContentNode m98copyDZRaReU(ChannelId channelId, UserId userId, int i10, GuildId guildId, RoleId roleId, List<? extends ContentNode> content) {
        q.g(content, "content");
        return new UserOrRoleMentionContentNode(channelId, userId, i10, guildId, roleId, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOrRoleMentionContentNode)) {
            return false;
        }
        UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) obj;
        return q.b(this.channelId, userOrRoleMentionContentNode.channelId) && q.b(this.userId, userOrRoleMentionContentNode.userId) && this.roleColor == userOrRoleMentionContentNode.roleColor && q.b(this.guildId, userOrRoleMentionContentNode.guildId) && q.b(this.roleId, userOrRoleMentionContentNode.roleId) && q.b(getContent(), userOrRoleMentionContentNode.getContent());
    }

    /* renamed from: getChannelId-qMVnFVQ  reason: not valid java name */
    public final ChannelId m99getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m100getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final int getRoleColor() {
        return this.roleColor;
    }

    /* renamed from: getRoleId-fYaclRY  reason: not valid java name */
    public final RoleId m101getRoleIdfYaclRY() {
        return this.roleId;
    }

    /* renamed from: getUserId-wUX8bhU  reason: not valid java name */
    public final UserId m102getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        ChannelId channelId = this.channelId;
        int i10 = 0;
        int i11 = (channelId == null ? 0 : ChannelId.m568hashCodeimpl(channelId.m572unboximpl())) * 31;
        UserId userId = this.userId;
        int i12 = (((i11 + (userId == null ? 0 : UserId.m632hashCodeimpl(userId.m636unboximpl()))) * 31) + this.roleColor) * 31;
        GuildId guildId = this.guildId;
        int i13 = (i12 + (guildId == null ? 0 : GuildId.m581hashCodeimpl(guildId.m585unboximpl()))) * 31;
        RoleId roleId = this.roleId;
        if (roleId != null) {
            i10 = RoleId.m606hashCodeimpl(roleId.m610unboximpl());
        }
        return ((i13 + i10) * 31) + getContent().hashCode();
    }

    public String toString() {
        ChannelId channelId = this.channelId;
        UserId userId = this.userId;
        int i10 = this.roleColor;
        GuildId guildId = this.guildId;
        RoleId roleId = this.roleId;
        List<ContentNode> content = getContent();
        return "UserOrRoleMentionContentNode(channelId=" + channelId + ", userId=" + userId + ", roleColor=" + i10 + ", guildId=" + guildId + ", roleId=" + roleId + ", content=" + content + ")";
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i10, GuildId guildId, RoleId roleId, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : channelId, (i11 & 2) != 0 ? null : userId, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : guildId, (i11 & 16) != 0 ? null : roleId, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i10, GuildId guildId, RoleId roleId, List<? extends ContentNode> list) {
        super(null);
        this.channelId = channelId;
        this.userId = userId;
        this.roleColor = i10;
        this.guildId = guildId;
        this.roleId = roleId;
        this.content = list;
    }
}
