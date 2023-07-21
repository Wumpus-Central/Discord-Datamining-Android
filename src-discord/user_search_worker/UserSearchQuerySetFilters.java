package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.a2;
import si.h;
import si.n1;

@f
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÇ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000e¨\u0006%"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "", "seen1", "", "guild", "", "friends", "", "strict", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFriends", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGuild", "()Ljava/lang/String;", "getStrict", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UserSearchQuerySetFilters {
    public static final Companion Companion = new Companion(null);
    private final Boolean friends;
    private final String guild;
    private final Boolean strict;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetFilters$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchQuerySetFilters> serializer() {
            return UserSearchQuerySetFilters$$serializer.INSTANCE;
        }
    }

    public UserSearchQuerySetFilters() {
        this((String) null, (Boolean) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public  UserSearchQuerySetFilters(int i10, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i10 & 0) != 0) {
            n1.b(i10, 0, UserSearchQuerySetFilters$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.guild = null;
        } else {
            this.guild = str;
        }
        if ((i10 & 2) == 0) {
            this.friends = null;
        } else {
            this.friends = bool;
        }
        if ((i10 & 4) == 0) {
            this.strict = null;
        } else {
            this.strict = bool2;
        }
    }

    public static  UserSearchQuerySetFilters copy$default(UserSearchQuerySetFilters userSearchQuerySetFilters, String str, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userSearchQuerySetFilters.guild;
        }
        if ((i10 & 2) != 0) {
            bool = userSearchQuerySetFilters.friends;
        }
        if ((i10 & 4) != 0) {
            bool2 = userSearchQuerySetFilters.strict;
        }
        return userSearchQuerySetFilters.copy(str, bool, bool2);
    }

    public static final void write$Self(UserSearchQuerySetFilters self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z12 = false;
        if (!output.w(serialDesc, 0) && self.guild == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.z(serialDesc, 0, a2.f26231a, self.guild);
        }
        if (!output.w(serialDesc, 1) && self.friends == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.z(serialDesc, 1, h.f26273a, self.friends);
        }
        if (output.w(serialDesc, 2) || self.strict != null) {
            z12 = true;
        }
        if (z12) {
            output.z(serialDesc, 2, h.f26273a, self.strict);
        }
    }

    public final String component1() {
        return this.guild;
    }

    public final Boolean component2() {
        return this.friends;
    }

    public final Boolean component3() {
        return this.strict;
    }

    public final UserSearchQuerySetFilters copy(String str, Boolean bool, Boolean bool2) {
        return new UserSearchQuerySetFilters(str, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchQuerySetFilters)) {
            return false;
        }
        UserSearchQuerySetFilters userSearchQuerySetFilters = (UserSearchQuerySetFilters) obj;
        return q.b(this.guild, userSearchQuerySetFilters.guild) && q.b(this.friends, userSearchQuerySetFilters.friends) && q.b(this.strict, userSearchQuerySetFilters.strict);
    }

    public final Boolean getFriends() {
        return this.friends;
    }

    public final String getGuild() {
        return this.guild;
    }

    public final Boolean getStrict() {
        return this.strict;
    }

    public int hashCode() {
        String str = this.guild;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.friends;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.strict;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.guild;
        Boolean bool = this.friends;
        Boolean bool2 = this.strict;
        return "UserSearchQuerySetFilters(guild=" + str + ", friends=" + bool + ", strict=" + bool2 + ")";
    }

    public UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2) {
        this.guild = str;
        this.friends = bool;
        this.strict = bool2;
    }

    public  UserSearchQuerySetFilters(String str, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2);
    }
}
