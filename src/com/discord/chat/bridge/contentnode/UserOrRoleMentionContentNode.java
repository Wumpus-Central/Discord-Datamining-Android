package com.discord.chat.bridge.contentnode;

import bj.C2521f;
import bj.C2560n1;
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
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002:;B\\\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011ø\u0001\u0000¢\u0006\u0002\u0010\u0012BP\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0019\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b&J\u0019\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b(J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J^\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J!\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209HÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "Lcom/discord/chat/bridge/contentnode/MentionContentNode;", "seen1", "", "channelId", "Lcom/discord/primitives/ChannelId;", "userId", "Lcom/discord/primitives/UserId;", "roleColor", "guildId", "Lcom/discord/primitives/GuildId;", "roleId", "Lcom/discord/primitives/RoleId;", "content", "", "Lcom/discord/chat/bridge/contentnode/ContentNode;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/UserId;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/RoleId;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-qMVnFVQ", "()Lcom/discord/primitives/ChannelId;", "getContent", "()Ljava/util/List;", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getRoleColor", "()I", "getRoleId-fYaclRY", "()Lcom/discord/primitives/RoleId;", "getUserId-wUX8bhU", "()Lcom/discord/primitives/UserId;", "component1", "component1-qMVnFVQ", "component2", "component2-wUX8bhU", "component3", "component4", "component4-qOKuAAo", "component5", "component5-fYaclRY", "component6", "copy", "copy-DZRaReU", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class UserOrRoleMentionContentNode extends MentionContentNode {
    public static final Companion Companion = new Companion(null);
    private final ChannelId channelId;
    private final List<ContentNode> content;
    private final GuildId guildId;
    private final int roleColor;
    private final RoleId roleId;
    private final UserId userId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
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
    private UserOrRoleMentionContentNode(int i, ChannelId channelId, UserId userId, int i2, GuildId guildId, RoleId roleId, List<? extends ContentNode> list, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (32 != (i & 32)) {
            C2560n1.m33818b(i, 32, UserOrRoleMentionContentNode$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.channelId = null;
        } else {
            this.channelId = channelId;
        }
        if ((i & 2) == 0) {
            this.userId = null;
        } else {
            this.userId = userId;
        }
        if ((i & 4) == 0) {
            this.roleColor = 0;
        } else {
            this.roleColor = i2;
        }
        if ((i & 8) == 0) {
            this.guildId = null;
        } else {
            this.guildId = guildId;
        }
        if ((i & 16) == 0) {
            this.roleId = null;
        } else {
            this.roleId = roleId;
        }
        this.content = list;
    }

    public /* synthetic */ UserOrRoleMentionContentNode(int i, ChannelId channelId, UserId userId, int i2, GuildId guildId, RoleId roleId, List list, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, channelId, userId, i2, guildId, roleId, list, serializationConstructorMarker);
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i, GuildId guildId, RoleId roleId, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(channelId, userId, i, guildId, roleId, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-DZRaReU$default  reason: not valid java name */
    public static /* synthetic */ UserOrRoleMentionContentNode m41655copyDZRaReU$default(UserOrRoleMentionContentNode userOrRoleMentionContentNode, ChannelId channelId, UserId userId, int i, GuildId guildId, RoleId roleId, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            channelId = userOrRoleMentionContentNode.channelId;
        }
        if ((i2 & 2) != 0) {
            userId = userOrRoleMentionContentNode.userId;
        }
        if ((i2 & 4) != 0) {
            i = userOrRoleMentionContentNode.roleColor;
        }
        if ((i2 & 8) != 0) {
            guildId = userOrRoleMentionContentNode.guildId;
        }
        if ((i2 & 16) != 0) {
            roleId = userOrRoleMentionContentNode.roleId;
        }
        if ((i2 & 32) != 0) {
            list = userOrRoleMentionContentNode.getContent();
        }
        return userOrRoleMentionContentNode.m41660copyDZRaReU(channelId, userId, i, guildId, roleId, list);
    }

    public static final void write$Self(UserOrRoleMentionContentNode self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        MentionContentNode.write$Self(self, output, serialDesc);
        boolean z5 = false;
        if (!output.mo13893A(serialDesc, 0) && self.channelId == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 0, ChannelId$$serializer.INSTANCE, self.channelId);
        }
        if (!output.mo13893A(serialDesc, 1) && self.userId == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 1, UserId$$serializer.INSTANCE, self.userId);
        }
        if (!output.mo13893A(serialDesc, 2) && self.roleColor == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            output.mo13866x(serialDesc, 2, self.roleColor);
        }
        if (!output.mo13893A(serialDesc, 3) && self.guildId == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            output.mo13874p(serialDesc, 3, GuildId$$serializer.INSTANCE, self.guildId);
        }
        if (output.mo13893A(serialDesc, 4) || self.roleId != null) {
            z5 = true;
        }
        if (z5) {
            output.mo13874p(serialDesc, 4, RoleId$$serializer.INSTANCE, self.roleId);
        }
        output.mo13870t(serialDesc, 5, new C2521f(ContentNodeSerializer.INSTANCE), self.getContent());
    }

    /* renamed from: component1-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41656component1qMVnFVQ() {
        return this.channelId;
    }

    /* renamed from: component2-wUX8bhU  reason: not valid java name */
    public final UserId m41657component2wUX8bhU() {
        return this.userId;
    }

    public final int component3() {
        return this.roleColor;
    }

    /* renamed from: component4-qOKuAAo  reason: not valid java name */
    public final GuildId m41658component4qOKuAAo() {
        return this.guildId;
    }

    /* renamed from: component5-fYaclRY  reason: not valid java name */
    public final RoleId m41659component5fYaclRY() {
        return this.roleId;
    }

    public final List<ContentNode> component6() {
        return getContent();
    }

    /* renamed from: copy-DZRaReU  reason: not valid java name */
    public final UserOrRoleMentionContentNode m41660copyDZRaReU(ChannelId channelId, UserId userId, int i, GuildId guildId, RoleId roleId, List<? extends ContentNode> content) {
        C9677q.m14633g(content, "content");
        return new UserOrRoleMentionContentNode(channelId, userId, i, guildId, roleId, content, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOrRoleMentionContentNode)) {
            return false;
        }
        UserOrRoleMentionContentNode userOrRoleMentionContentNode = (UserOrRoleMentionContentNode) obj;
        return C9677q.m14638b(this.channelId, userOrRoleMentionContentNode.channelId) && C9677q.m14638b(this.userId, userOrRoleMentionContentNode.userId) && this.roleColor == userOrRoleMentionContentNode.roleColor && C9677q.m14638b(this.guildId, userOrRoleMentionContentNode.guildId) && C9677q.m14638b(this.roleId, userOrRoleMentionContentNode.roleId) && C9677q.m14638b(getContent(), userOrRoleMentionContentNode.getContent());
    }

    /* renamed from: getChannelId-qMVnFVQ  reason: not valid java name */
    public final ChannelId m41661getChannelIdqMVnFVQ() {
        return this.channelId;
    }

    @Override // com.discord.chat.bridge.contentnode.MentionContentNode
    public List<ContentNode> getContent() {
        return this.content;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m41662getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final int getRoleColor() {
        return this.roleColor;
    }

    /* renamed from: getRoleId-fYaclRY  reason: not valid java name */
    public final RoleId m41663getRoleIdfYaclRY() {
        return this.roleId;
    }

    /* renamed from: getUserId-wUX8bhU  reason: not valid java name */
    public final UserId m41664getUserIdwUX8bhU() {
        return this.userId;
    }

    public int hashCode() {
        ChannelId channelId = this.channelId;
        int i = 0;
        int i2 = (channelId == null ? 0 : ChannelId.m42094hashCodeimpl(channelId.m42098unboximpl())) * 31;
        UserId userId = this.userId;
        int i3 = (((i2 + (userId == null ? 0 : UserId.m42158hashCodeimpl(userId.m42162unboximpl()))) * 31) + this.roleColor) * 31;
        GuildId guildId = this.guildId;
        int i4 = (i3 + (guildId == null ? 0 : GuildId.m42107hashCodeimpl(guildId.m42111unboximpl()))) * 31;
        RoleId roleId = this.roleId;
        if (roleId != null) {
            i = RoleId.m42132hashCodeimpl(roleId.m42136unboximpl());
        }
        return ((i4 + i) * 31) + getContent().hashCode();
    }

    public String toString() {
        ChannelId channelId = this.channelId;
        UserId userId = this.userId;
        int i = this.roleColor;
        GuildId guildId = this.guildId;
        RoleId roleId = this.roleId;
        List<ContentNode> content = getContent();
        return "UserOrRoleMentionContentNode(channelId=" + channelId + ", userId=" + userId + ", roleColor=" + i + ", guildId=" + guildId + ", roleId=" + roleId + ", content=" + content + ")";
    }

    public /* synthetic */ UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i, GuildId guildId, RoleId roleId, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : channelId, (i2 & 2) != 0 ? null : userId, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : guildId, (i2 & 16) != 0 ? null : roleId, list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UserOrRoleMentionContentNode(ChannelId channelId, UserId userId, int i, GuildId guildId, RoleId roleId, List<? extends ContentNode> list) {
        super(null);
        this.channelId = channelId;
        this.userId = userId;
        this.roleColor = i;
        this.guildId = guildId;
        this.roleId = roleId;
        this.content = list;
    }
}
