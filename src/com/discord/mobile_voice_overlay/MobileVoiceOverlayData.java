package com.discord.mobile_voice_overlay;

import bj.C3643f;
import bj.C3681n1;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002IJB\u008e\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019Bn\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0019\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\b3J\u0019\u00104\u001a\u00020\u000bHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010\u001eJ\t\u00106\u001a\u00020\rHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0013HÆ\u0003J\u0092\u0001\u0010;\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00102\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020\u00102\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\rHÖ\u0001J!\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÇ\u0001R\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, m15073d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "seen1", "", "users", "", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "extraUsers", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "channelName", "", "guildName", "deafened", "", "muted", "connectionQuality", "Lcom/discord/mobile_voice_overlay/ConnectionQuality;", "canGenerateInvite", "channelSelectorResults", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Ljava/util/List;ILcom/discord/primitives/GuildId;JLjava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanGenerateInvite", "()Z", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "()Ljava/lang/String;", "getChannelSelectorResults", "()Ljava/util/List;", "getConnectionQuality", "()Lcom/discord/mobile_voice_overlay/ConnectionQuality;", "getDeafened", "getExtraUsers", "()I", "getGuildId-qOKuAAo", "()Lcom/discord/primitives/GuildId;", "getGuildName", "getMuted", "getUsers", "component1", "component10", "component11", "component2", "component3", "component3-qOKuAAo", "component4", "component4-o4g7jtM", "component5", "component6", "component7", "component8", "component9", "copy", "copy-HeAh3Ug", "(Ljava/util/List;ILcom/discord/primitives/GuildId;JLjava/lang/String;Ljava/lang/String;ZZLcom/discord/mobile_voice_overlay/ConnectionQuality;ZLjava/util/List;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "mobile_voice_overlay_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MobileVoiceOverlayData {
    public static final Companion Companion = new Companion(null);
    private final boolean canGenerateInvite;
    private final long channelId;
    private final String channelName;
    private final List<MobileVoiceOverlaySelectorResult> channelSelectorResults;
    private final ConnectionQuality connectionQuality;
    private final boolean deafened;
    private final int extraUsers;
    private final GuildId guildId;
    private final String guildName;
    private final boolean muted;
    private final List<MobileVoiceOverlayDataUser> users;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MobileVoiceOverlayData> serializer() {
            return MobileVoiceOverlayData$$serializer.INSTANCE;
        }
    }

    private MobileVoiceOverlayData(int i, List<MobileVoiceOverlayDataUser> list, int i2, GuildId guildId, ChannelId channelId, String str, String str2, boolean z, boolean z2, ConnectionQuality connectionQuality, boolean z3, List<MobileVoiceOverlaySelectorResult> list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            C3681n1.m33818b(i, 2047, MobileVoiceOverlayData$$serializer.INSTANCE.getDescriptor());
        }
        this.users = list;
        this.extraUsers = i2;
        this.guildId = guildId;
        this.channelId = channelId.m42098unboximpl();
        this.channelName = str;
        this.guildName = str2;
        this.deafened = z;
        this.muted = z2;
        this.connectionQuality = connectionQuality;
        this.canGenerateInvite = z3;
        this.channelSelectorResults = list2;
    }

    public /* synthetic */ MobileVoiceOverlayData(int i, List list, int i2, GuildId guildId, ChannelId channelId, String str, String str2, boolean z, boolean z2, ConnectionQuality connectionQuality, boolean z3, List list2, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, i2, guildId, channelId, str, str2, z, z2, connectionQuality, z3, list2, serializationConstructorMarker);
    }

    public /* synthetic */ MobileVoiceOverlayData(List list, int i, GuildId guildId, long j, String str, String str2, boolean z, boolean z2, ConnectionQuality connectionQuality, boolean z3, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, guildId, j, str, str2, z, z2, connectionQuality, z3, list2);
    }

    public static final void write$Self(MobileVoiceOverlayData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13870t(serialDesc, 0, new C3643f(MobileVoiceOverlayDataUser$$serializer.INSTANCE), self.users);
        output.mo13866x(serialDesc, 1, self.extraUsers);
        output.mo13874p(serialDesc, 2, GuildId$$serializer.INSTANCE, self.guildId);
        output.mo13870t(serialDesc, 3, ChannelId$$serializer.INSTANCE, ChannelId.m42089boximpl(self.channelId));
        output.mo13864z(serialDesc, 4, self.channelName);
        output.mo13864z(serialDesc, 5, self.guildName);
        output.mo13865y(serialDesc, 6, self.deafened);
        output.mo13865y(serialDesc, 7, self.muted);
        output.mo13870t(serialDesc, 8, ConnectionQuality.Companion.serializer(), self.connectionQuality);
        output.mo13865y(serialDesc, 9, self.canGenerateInvite);
        output.mo13870t(serialDesc, 10, new C3643f(MobileVoiceOverlaySelectorResult$$serializer.INSTANCE), self.channelSelectorResults);
    }

    public final List<MobileVoiceOverlayDataUser> component1() {
        return this.users;
    }

    public final boolean component10() {
        return this.canGenerateInvite;
    }

    public final List<MobileVoiceOverlaySelectorResult> component11() {
        return this.channelSelectorResults;
    }

    public final int component2() {
        return this.extraUsers;
    }

    /* renamed from: component3-qOKuAAo  reason: not valid java name */
    public final GuildId m42009component3qOKuAAo() {
        return this.guildId;
    }

    /* renamed from: component4-o4g7jtM  reason: not valid java name */
    public final long m42010component4o4g7jtM() {
        return this.channelId;
    }

    public final String component5() {
        return this.channelName;
    }

    public final String component6() {
        return this.guildName;
    }

    public final boolean component7() {
        return this.deafened;
    }

    public final boolean component8() {
        return this.muted;
    }

    public final ConnectionQuality component9() {
        return this.connectionQuality;
    }

    /* renamed from: copy-HeAh3Ug  reason: not valid java name */
    public final MobileVoiceOverlayData m42011copyHeAh3Ug(List<MobileVoiceOverlayDataUser> users, int i, GuildId guildId, long j, String channelName, String guildName, boolean z, boolean z2, ConnectionQuality connectionQuality, boolean z3, List<MobileVoiceOverlaySelectorResult> channelSelectorResults) {
        C9971q.m14633g(users, "users");
        C9971q.m14633g(channelName, "channelName");
        C9971q.m14633g(guildName, "guildName");
        C9971q.m14633g(connectionQuality, "connectionQuality");
        C9971q.m14633g(channelSelectorResults, "channelSelectorResults");
        return new MobileVoiceOverlayData(users, i, guildId, j, channelName, guildName, z, z2, connectionQuality, z3, channelSelectorResults, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileVoiceOverlayData)) {
            return false;
        }
        MobileVoiceOverlayData mobileVoiceOverlayData = (MobileVoiceOverlayData) obj;
        return C9971q.m14638b(this.users, mobileVoiceOverlayData.users) && this.extraUsers == mobileVoiceOverlayData.extraUsers && C9971q.m14638b(this.guildId, mobileVoiceOverlayData.guildId) && ChannelId.m42093equalsimpl0(this.channelId, mobileVoiceOverlayData.channelId) && C9971q.m14638b(this.channelName, mobileVoiceOverlayData.channelName) && C9971q.m14638b(this.guildName, mobileVoiceOverlayData.guildName) && this.deafened == mobileVoiceOverlayData.deafened && this.muted == mobileVoiceOverlayData.muted && this.connectionQuality == mobileVoiceOverlayData.connectionQuality && this.canGenerateInvite == mobileVoiceOverlayData.canGenerateInvite && C9971q.m14638b(this.channelSelectorResults, mobileVoiceOverlayData.channelSelectorResults);
    }

    public final boolean getCanGenerateInvite() {
        return this.canGenerateInvite;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m42012getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    public final List<MobileVoiceOverlaySelectorResult> getChannelSelectorResults() {
        return this.channelSelectorResults;
    }

    public final ConnectionQuality getConnectionQuality() {
        return this.connectionQuality;
    }

    public final boolean getDeafened() {
        return this.deafened;
    }

    public final int getExtraUsers() {
        return this.extraUsers;
    }

    /* renamed from: getGuildId-qOKuAAo  reason: not valid java name */
    public final GuildId m42013getGuildIdqOKuAAo() {
        return this.guildId;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    public final List<MobileVoiceOverlayDataUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int hashCode = ((this.users.hashCode() * 31) + this.extraUsers) * 31;
        GuildId guildId = this.guildId;
        int i = (((((((hashCode + (guildId == null ? 0 : GuildId.m42107hashCodeimpl(guildId.m42111unboximpl()))) * 31) + ChannelId.m42094hashCodeimpl(this.channelId)) * 31) + this.channelName.hashCode()) * 31) + this.guildName.hashCode()) * 31;
        boolean z = this.deafened;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        boolean z2 = this.muted;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int hashCode2 = (((i6 + i7) * 31) + this.connectionQuality.hashCode()) * 31;
        boolean z3 = this.canGenerateInvite;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        return ((hashCode2 + i2) * 31) + this.channelSelectorResults.hashCode();
    }

    public String toString() {
        List<MobileVoiceOverlayDataUser> list = this.users;
        int i = this.extraUsers;
        GuildId guildId = this.guildId;
        String str = ChannelId.m42096toStringimpl(this.channelId);
        String str2 = this.channelName;
        String str3 = this.guildName;
        boolean z = this.deafened;
        boolean z2 = this.muted;
        ConnectionQuality connectionQuality = this.connectionQuality;
        boolean z3 = this.canGenerateInvite;
        List<MobileVoiceOverlaySelectorResult> list2 = this.channelSelectorResults;
        return "MobileVoiceOverlayData(users=" + list + ", extraUsers=" + i + ", guildId=" + guildId + ", channelId=" + str + ", channelName=" + str2 + ", guildName=" + str3 + ", deafened=" + z + ", muted=" + z2 + ", connectionQuality=" + connectionQuality + ", canGenerateInvite=" + z3 + ", channelSelectorResults=" + list2 + ")";
    }

    private MobileVoiceOverlayData(List<MobileVoiceOverlayDataUser> list, int i, GuildId guildId, long j, String str, String str2, boolean z, boolean z2, ConnectionQuality connectionQuality, boolean z3, List<MobileVoiceOverlaySelectorResult> list2) {
        this.users = list;
        this.extraUsers = i;
        this.guildId = guildId;
        this.channelId = j;
        this.channelName = str;
        this.guildName = str2;
        this.deafened = z;
        this.muted = z2;
        this.connectionQuality = connectionQuality;
        this.canGenerateInvite = z3;
        this.channelSelectorResults = list2;
    }
}
