package com.discord.mobile_voice_overlay;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BN\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0002\u0010\u000eB0\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0013J\u0019\u0010\u001a\u001a\u00020\u0007HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001J!\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-HÇ\u0001R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "", "seen1", "", "guildId", "Lcom/discord/primitives/GuildId;", "channelId", "Lcom/discord/primitives/ChannelId;", "channelName", "", "guildName", "categoryName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/GuildId;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCategoryName", "()Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getChannelName", "getGuildId-fYKD8eg", "getGuildName", "component1", "component1-fYKD8eg", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "copy", "copy-c25twaQ", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MobileVoiceOverlaySelectorResult {
    public static final Companion Companion = new Companion(null);
    private final String categoryName;
    private final long channelId;
    private final String channelName;
    private final long guildId;
    private final String guildName;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MobileVoiceOverlaySelectorResult> serializer() {
            return MobileVoiceOverlaySelectorResult$$serializer.INSTANCE;
        }
    }

    private MobileVoiceOverlaySelectorResult(int i10, GuildId guildId, ChannelId channelId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i10 & 31)) {
            n1.b(i10, 31, MobileVoiceOverlaySelectorResult$$serializer.INSTANCE.getDescriptor());
        }
        this.guildId = guildId.m585unboximpl();
        this.channelId = channelId.m572unboximpl();
        this.channelName = str;
        this.guildName = str2;
        this.categoryName = str3;
    }

    public /* synthetic */ MobileVoiceOverlaySelectorResult(int i10, GuildId guildId, ChannelId channelId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, guildId, channelId, str, str2, str3, serializationConstructorMarker);
    }

    public /* synthetic */ MobileVoiceOverlaySelectorResult(long j10, long j11, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, str2, str3);
    }

    public static final void write$Self(MobileVoiceOverlaySelectorResult self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, GuildId$$serializer.INSTANCE, GuildId.m576boximpl(self.guildId));
        output.q(serialDesc, 1, ChannelId$$serializer.INSTANCE, ChannelId.m563boximpl(self.channelId));
        output.z(serialDesc, 2, self.channelName);
        output.z(serialDesc, 3, self.guildName);
        output.z(serialDesc, 4, self.categoryName);
    }

    /* renamed from: component1-fYKD8eg  reason: not valid java name */
    public final long m479component1fYKD8eg() {
        return this.guildId;
    }

    /* renamed from: component2-o4g7jtM  reason: not valid java name */
    public final long m480component2o4g7jtM() {
        return this.channelId;
    }

    public final String component3() {
        return this.channelName;
    }

    public final String component4() {
        return this.guildName;
    }

    public final String component5() {
        return this.categoryName;
    }

    /* renamed from: copy-c25twaQ  reason: not valid java name */
    public final MobileVoiceOverlaySelectorResult m481copyc25twaQ(long j10, long j11, String channelName, String guildName, String categoryName) {
        q.g(channelName, "channelName");
        q.g(guildName, "guildName");
        q.g(categoryName, "categoryName");
        return new MobileVoiceOverlaySelectorResult(j10, j11, channelName, guildName, categoryName, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileVoiceOverlaySelectorResult)) {
            return false;
        }
        MobileVoiceOverlaySelectorResult mobileVoiceOverlaySelectorResult = (MobileVoiceOverlaySelectorResult) obj;
        return GuildId.m580equalsimpl0(this.guildId, mobileVoiceOverlaySelectorResult.guildId) && ChannelId.m567equalsimpl0(this.channelId, mobileVoiceOverlaySelectorResult.channelId) && q.b(this.channelName, mobileVoiceOverlaySelectorResult.channelName) && q.b(this.guildName, mobileVoiceOverlaySelectorResult.guildName) && q.b(this.categoryName, mobileVoiceOverlaySelectorResult.categoryName);
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    /* renamed from: getChannelId-o4g7jtM  reason: not valid java name */
    public final long m482getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getChannelName() {
        return this.channelName;
    }

    /* renamed from: getGuildId-fYKD8eg  reason: not valid java name */
    public final long m483getGuildIdfYKD8eg() {
        return this.guildId;
    }

    public final String getGuildName() {
        return this.guildName;
    }

    public int hashCode() {
        return (((((((GuildId.m581hashCodeimpl(this.guildId) * 31) + ChannelId.m568hashCodeimpl(this.channelId)) * 31) + this.channelName.hashCode()) * 31) + this.guildName.hashCode()) * 31) + this.categoryName.hashCode();
    }

    public String toString() {
        String str = GuildId.m583toStringimpl(this.guildId);
        String str2 = ChannelId.m570toStringimpl(this.channelId);
        String str3 = this.channelName;
        String str4 = this.guildName;
        String str5 = this.categoryName;
        return "MobileVoiceOverlaySelectorResult(guildId=" + str + ", channelId=" + str2 + ", channelName=" + str3 + ", guildName=" + str4 + ", categoryName=" + str5 + ")";
    }

    private MobileVoiceOverlaySelectorResult(long j10, long j11, String str, String str2, String str3) {
        this.guildId = j10;
        this.channelId = j11;
        this.channelName = str;
        this.guildName = str2;
        this.categoryName = str3;
    }
}
