package com.discord.notifications.api;

import bj.C3622a2;
import bj.C3681n1;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002)*BD\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0002\u0010\fB4\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u0015\u001a\u00020\u0005HÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÇ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m15073d2 = {"Lcom/discord/notifications/api/DirectReplyUser;", "", "seen1", "", "id", "Lcom/discord/primitives/UserId;", "username", "", "discriminator", "avatar", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAvatar", "()Ljava/lang/String;", "getDiscriminator", "getId-re6GcUE", "()J", "J", "getUsername", "component1", "component1-re6GcUE", "component2", "component3", "component4", "copy", "copy-ASSxI_0", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/discord/notifications/api/DirectReplyUser;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class DirectReplyUser {
    public static final Companion Companion = new Companion(null);
    private final String avatar;
    private final String discriminator;

    /* renamed from: id */
    private final long f7501id;
    private final String username;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/notifications/api/DirectReplyUser$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/notifications/api/DirectReplyUser;", "notification_api_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DirectReplyUser> serializer() {
            return DirectReplyUser$$serializer.INSTANCE;
        }
    }

    private DirectReplyUser(int i, UserId userId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            C3681n1.m33818b(i, 1, DirectReplyUser$$serializer.INSTANCE.getDescriptor());
        }
        this.f7501id = userId.m42162unboximpl();
        if ((i & 2) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i & 4) == 0) {
            this.discriminator = null;
        } else {
            this.discriminator = str2;
        }
        if ((i & 8) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str3;
        }
    }

    public /* synthetic */ DirectReplyUser(int i, UserId userId, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, userId, str, str2, str3, serializationConstructorMarker);
    }

    public /* synthetic */ DirectReplyUser(long j, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3);
    }

    /* renamed from: copy-ASSxI_0$default  reason: not valid java name */
    public static /* synthetic */ DirectReplyUser m42043copyASSxI_0$default(DirectReplyUser directReplyUser, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = directReplyUser.f7501id;
        }
        if ((i & 2) != 0) {
            str = directReplyUser.username;
        }
        if ((i & 4) != 0) {
            str2 = directReplyUser.discriminator;
        }
        if ((i & 8) != 0) {
            str3 = directReplyUser.avatar;
        }
        return directReplyUser.m42045copyASSxI_0(j, str, str2, str3);
    }

    public static final void write$Self(DirectReplyUser self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo13870t(serialDesc, 0, UserId$$serializer.INSTANCE, UserId.m42153boximpl(self.f7501id));
        if (!output.mo13893A(serialDesc, 1) && self.username == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 1, C3622a2.f5917a, self.username);
        }
        if (!output.mo13893A(serialDesc, 2) && self.discriminator == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 2, C3622a2.f5917a, self.discriminator);
        }
        if (output.mo13893A(serialDesc, 3) || self.avatar != null) {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 3, C3622a2.f5917a, self.avatar);
        }
    }

    /* renamed from: component1-re6GcUE  reason: not valid java name */
    public final long m42044component1re6GcUE() {
        return this.f7501id;
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

    /* renamed from: copy-ASSxI_0  reason: not valid java name */
    public final DirectReplyUser m42045copyASSxI_0(long j, String str, String str2, String str3) {
        return new DirectReplyUser(j, str, str2, str3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectReplyUser)) {
            return false;
        }
        DirectReplyUser directReplyUser = (DirectReplyUser) obj;
        return UserId.m42157equalsimpl0(this.f7501id, directReplyUser.f7501id) && C9971q.m14638b(this.username, directReplyUser.username) && C9971q.m14638b(this.discriminator, directReplyUser.discriminator) && C9971q.m14638b(this.avatar, directReplyUser.avatar);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getDiscriminator() {
        return this.discriminator;
    }

    /* renamed from: getId-re6GcUE  reason: not valid java name */
    public final long m42046getIdre6GcUE() {
        return this.f7501id;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i = UserId.m42158hashCodeimpl(this.f7501id) * 31;
        String str = this.username;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.discriminator;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        String str = UserId.m42160toStringimpl(this.f7501id);
        String str2 = this.username;
        String str3 = this.discriminator;
        String str4 = this.avatar;
        return "DirectReplyUser(id=" + str + ", username=" + str2 + ", discriminator=" + str3 + ", avatar=" + str4 + ")";
    }

    private DirectReplyUser(long j, String str, String str2, String str3) {
        this.f7501id = j;
        this.username = str;
        this.discriminator = str2;
        this.avatar = str3;
    }

    public /* synthetic */ DirectReplyUser(long j, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, null);
    }
}
