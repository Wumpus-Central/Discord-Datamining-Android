package com.discord.chat.bridge.contentnode;

import bj.C2500a2;
import bj.C2560n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J!\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%HÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;", "", "seen1", "", "action", "", "guildId", "messageId", "channelId", "roleSubscriptionListingId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getChannelId", "getGuildId", "getMessageId", "getRoleSubscriptionListingId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class RoleSubscriptionOnClick {
    public static final Companion Companion = new Companion(null);
    private final String action;
    private final String channelId;
    private final String guildId;
    private final String messageId;
    private final String roleSubscriptionListingId;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/contentnode/RoleSubscriptionOnClick;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RoleSubscriptionOnClick> serializer() {
            return RoleSubscriptionOnClick$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RoleSubscriptionOnClick(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            C2560n1.m33818b(i, 31, RoleSubscriptionOnClick$$serializer.INSTANCE.getDescriptor());
        }
        this.action = str;
        this.guildId = str2;
        this.messageId = str3;
        this.channelId = str4;
        this.roleSubscriptionListingId = str5;
    }

    public static /* synthetic */ RoleSubscriptionOnClick copy$default(RoleSubscriptionOnClick roleSubscriptionOnClick, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roleSubscriptionOnClick.action;
        }
        if ((i & 2) != 0) {
            str2 = roleSubscriptionOnClick.guildId;
        }
        if ((i & 4) != 0) {
            str3 = roleSubscriptionOnClick.messageId;
        }
        if ((i & 8) != 0) {
            str4 = roleSubscriptionOnClick.channelId;
        }
        if ((i & 16) != 0) {
            str5 = roleSubscriptionOnClick.roleSubscriptionListingId;
        }
        return roleSubscriptionOnClick.copy(str, str2, str3, str4, str5);
    }

    public static final void write$Self(RoleSubscriptionOnClick self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.action);
        output.mo13864z(serialDesc, 1, self.guildId);
        C2500a2 a2Var = C2500a2.f6719a;
        output.mo13874p(serialDesc, 2, a2Var, self.messageId);
        output.mo13874p(serialDesc, 3, a2Var, self.channelId);
        output.mo13874p(serialDesc, 4, a2Var, self.roleSubscriptionListingId);
    }

    public final String component1() {
        return this.action;
    }

    public final String component2() {
        return this.guildId;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.channelId;
    }

    public final String component5() {
        return this.roleSubscriptionListingId;
    }

    public final RoleSubscriptionOnClick copy(String action, String guildId, String str, String str2, String str3) {
        C9677q.m14633g(action, "action");
        C9677q.m14633g(guildId, "guildId");
        return new RoleSubscriptionOnClick(action, guildId, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoleSubscriptionOnClick)) {
            return false;
        }
        RoleSubscriptionOnClick roleSubscriptionOnClick = (RoleSubscriptionOnClick) obj;
        return C9677q.m14638b(this.action, roleSubscriptionOnClick.action) && C9677q.m14638b(this.guildId, roleSubscriptionOnClick.guildId) && C9677q.m14638b(this.messageId, roleSubscriptionOnClick.messageId) && C9677q.m14638b(this.channelId, roleSubscriptionOnClick.channelId) && C9677q.m14638b(this.roleSubscriptionListingId, roleSubscriptionOnClick.roleSubscriptionListingId);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getGuildId() {
        return this.guildId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getRoleSubscriptionListingId() {
        return this.roleSubscriptionListingId;
    }

    public int hashCode() {
        int hashCode = ((this.action.hashCode() * 31) + this.guildId.hashCode()) * 31;
        String str = this.messageId;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.roleSubscriptionListingId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.action;
        String str2 = this.guildId;
        String str3 = this.messageId;
        String str4 = this.channelId;
        String str5 = this.roleSubscriptionListingId;
        return "RoleSubscriptionOnClick(action=" + str + ", guildId=" + str2 + ", messageId=" + str3 + ", channelId=" + str4 + ", roleSubscriptionListingId=" + str5 + ")";
    }

    public RoleSubscriptionOnClick(String action, String guildId, String str, String str2, String str3) {
        C9677q.m14633g(action, "action");
        C9677q.m14633g(guildId, "guildId");
        this.action = action;
        this.guildId = guildId;
        this.messageId = str;
        this.channelId = str2;
        this.roleSubscriptionListingId = str3;
    }
}
