package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.n1;

@f
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B@\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rB*\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u0018\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J@\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*HÇ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "seen1", "", "userId", "Lcom/discord/primitives/UserId;", "avatar", "", "speaking", "", "discriminator", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Ljava/lang/String;ZILkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatar", "()Ljava/lang/String;", "getDiscriminator", "()I", "getSpeaking", "()Z", "getUserId-re6GcUE", "()J", "J", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JLjava/lang/String;ZI)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MobileVoiceOverlayDataUser {
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final int discriminator;
    private final boolean speaking;
    private final long userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MobileVoiceOverlayDataUser> serializer() {
            return MobileVoiceOverlayDataUser$$serializer.INSTANCE;
        }
    }

    private MobileVoiceOverlayDataUser(int i10, UserId userId, String str, boolean z10, int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i10 & 15)) {
            n1.b(i10, 15, MobileVoiceOverlayDataUser$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = userId.m637unboximpl();
        this.avatar = str;
        this.speaking = z10;
        this.discriminator = i11;
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(int i10, UserId userId, String str, boolean z10, int i11, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, userId, str, z10, i11, serializationConstructorMarker);
    }

    public /* synthetic */ MobileVoiceOverlayDataUser(long j10, String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, z10, i10);
    }

    /* renamed from: copy-ASSxI_0$default  reason: not valid java name */
    public static /* synthetic */ MobileVoiceOverlayDataUser m475copyASSxI_0$default(MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser, long j10, String str, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = mobileVoiceOverlayDataUser.userId;
        }
        if ((i11 & 2) != 0) {
            str = mobileVoiceOverlayDataUser.avatar;
        }
        if ((i11 & 4) != 0) {
            z10 = mobileVoiceOverlayDataUser.speaking;
        }
        if ((i11 & 8) != 0) {
            i10 = mobileVoiceOverlayDataUser.discriminator;
        }
        return mobileVoiceOverlayDataUser.m477copyASSxI_0(j10, str, z10, i10);
    }

    public static final void write$Self(MobileVoiceOverlayDataUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.n(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m628boximpl(self.userId));
        output.z(serialDesc, 1, a2.f26230a, self.avatar);
        output.r(serialDesc, 2, self.speaking);
        output.q(serialDesc, 3, self.discriminator);
    }

    /* renamed from: component1-re6GcUE  reason: not valid java name */
    public final long m476component1re6GcUE() {
        return this.userId;
    }

    public final String component2() {
        return this.avatar;
    }

    public final boolean component3() {
        return this.speaking;
    }

    public final int component4() {
        return this.discriminator;
    }

    /* renamed from: copy-ASSxI_0  reason: not valid java name */
    public final MobileVoiceOverlayDataUser m477copyASSxI_0(long j10, String str, boolean z10, int i10) {
        return new MobileVoiceOverlayDataUser(j10, str, z10, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileVoiceOverlayDataUser)) {
            return false;
        }
        MobileVoiceOverlayDataUser mobileVoiceOverlayDataUser = (MobileVoiceOverlayDataUser) obj;
        return UserId.m632equalsimpl0(this.userId, mobileVoiceOverlayDataUser.userId) && q.b(this.avatar, mobileVoiceOverlayDataUser.avatar) && this.speaking == mobileVoiceOverlayDataUser.speaking && this.discriminator == mobileVoiceOverlayDataUser.discriminator;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getDiscriminator() {
        return this.discriminator;
    }

    public final boolean getSpeaking() {
        return this.speaking;
    }

    /* renamed from: getUserId-re6GcUE  reason: not valid java name */
    public final long m478getUserIdre6GcUE() {
        return this.userId;
    }

    public int hashCode() {
        int i10 = UserId.m633hashCodeimpl(this.userId) * 31;
        String str = this.avatar;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.speaking;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = z10 ? 1 : 0;
        return ((hashCode + i11) * 31) + this.discriminator;
    }

    public String toString() {
        String str = UserId.m635toStringimpl(this.userId);
        String str2 = this.avatar;
        boolean z10 = this.speaking;
        int i10 = this.discriminator;
        return "MobileVoiceOverlayDataUser(userId=" + str + ", avatar=" + str2 + ", speaking=" + z10 + ", discriminator=" + i10 + ")";
    }

    private MobileVoiceOverlayDataUser(long j10, String str, boolean z10, int i10) {
        this.userId = j10;
        this.avatar = str;
        this.speaking = z10;
        this.discriminator = i10;
    }
}
