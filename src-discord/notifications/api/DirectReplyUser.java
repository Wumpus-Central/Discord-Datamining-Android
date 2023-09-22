package com.discord.notifications.api;

import cj.a2;
import cj.n1;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import zi.f;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BD\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB4\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Lcom/discord/notifications/api/DirectReplyUser;", "", "seen1", "", "id", "Lcom/discord/primitives/UserId;", "username", "", "discriminator", "avatar", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatar", "()Ljava/lang/String;", "getDiscriminator", "getId-re6GcUE", "()J", "J", "getUsername", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/notifications/api/DirectReplyUser;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@f

public final class DirectReplyUser {
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String discriminator;

    
    private final long f7256id;
    private final String username;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/notifications/api/DirectReplyUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/DirectReplyUser;", "notification_api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DirectReplyUser> serializer() {
            return DirectReplyUser$$serializer.INSTANCE;
        }
    }

    private DirectReplyUser(int i10, UserId userId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, DirectReplyUser$$serializer.INSTANCE.getDescriptor());
        }
        this.f7256id = userId.m683unboximpl();
        if ((i10 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 4) == 0) {
            this.discriminator = null;
        } else {
            this.discriminator = str2;
        }
        if ((i10 & 8) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str3;
        }
    }

    public  DirectReplyUser(int i10, UserId userId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, userId, str, str2, str3, serializationConstructorMarker);
    }

    public  DirectReplyUser(long j10, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3);
    }

    
    public static  DirectReplyUser m550copyASSxI_0$default(DirectReplyUser directReplyUser, long j10, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = directReplyUser.f7256id;
        }
        if ((i10 & 2) != 0) {
            str = directReplyUser.username;
        }
        if ((i10 & 4) != 0) {
            str2 = directReplyUser.discriminator;
        }
        if ((i10 & 8) != 0) {
            str3 = directReplyUser.avatar;
        }
        return directReplyUser.m552copyASSxI_0(j10, str, str2, str3);
    }

    public static final void write$Self(DirectReplyUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.h(self, "self");
        q.h(output, "output");
        q.h(serialDesc, "serialDesc");
        boolean z12 = false;
        output.i(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m674boximpl(self.f7256id));
        if (!output.z(serialDesc, 1) && self.username == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.E(serialDesc, 1, a2.f6238a, self.username);
        }
        if (!output.z(serialDesc, 2) && self.discriminator == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.E(serialDesc, 2, a2.f6238a, self.discriminator);
        }
        if (output.z(serialDesc, 3) || self.avatar != null) {
            z12 = true;
        }
        if (z12) {
            output.E(serialDesc, 3, a2.f6238a, self.avatar);
        }
    }

    
    public final long m551component1re6GcUE() {
        return this.f7256id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.discriminator;
    }

    public final String component4() {
        return this.avatar;
    }

    
    public final DirectReplyUser m552copyASSxI_0(long j10, String str, String str2, String str3) {
        return new DirectReplyUser(j10, str, str2, str3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectReplyUser)) {
            return false;
        }
        DirectReplyUser directReplyUser = (DirectReplyUser) obj;
        return UserId.m678equalsimpl0(this.f7256id, directReplyUser.f7256id) && q.c(this.username, directReplyUser.username) && q.c(this.discriminator, directReplyUser.discriminator) && q.c(this.avatar, directReplyUser.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getDiscriminator() {
        return this.discriminator;
    }

    
    public final long m553getIdre6GcUE() {
        return this.f7256id;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i10 = UserId.m679hashCodeimpl(this.f7256id) * 31;
        String str = this.username;
        int i11 = 0;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discriminator;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        String str = UserId.m681toStringimpl(this.f7256id);
        String str2 = this.username;
        String str3 = this.discriminator;
        String str4 = this.avatar;
        return "DirectReplyUser(id=" + str + ", username=" + str2 + ", discriminator=" + str3 + ", avatar=" + str4 + ")";
    }

    private DirectReplyUser(long j10, String str, String str2, String str3) {
        this.f7256id = j10;
        this.username = str;
        this.discriminator = str2;
        this.avatar = str3;
    }

    public  DirectReplyUser(long j10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, null);
    }
}
