package com.discord.user_search_worker;

import com.discord.user_search_worker.UserSearchTransformedUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import pi.f;
import si.n1;

@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "Lcom/discord/user_search_worker/UserSearchData;", "seen1", "", "payload", "", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getPayload", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UserSearchUpdateUsersData extends UserSearchData {
    public static final Companion Companion = new Companion(null);
    private final List<UserSearchTransformedUser> payload;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/user_search_worker/UserSearchUpdateUsersData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchUpdateUsersData> serializer() {
            return UserSearchUpdateUsersData$$serializer.INSTANCE;
        }
    }

    
    public  UserSearchUpdateUsersData(int i10, List list, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (1 != (i10 & 1)) {
            n1.b(i10, 1, UserSearchUpdateUsersData$$serializer.INSTANCE.getDescriptor());
        }
        this.payload = list;
    }

    
    public static  UserSearchUpdateUsersData copy$default(UserSearchUpdateUsersData userSearchUpdateUsersData, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = userSearchUpdateUsersData.payload;
        }
        return userSearchUpdateUsersData.copy(list);
    }

    public static final void write$Self(UserSearchUpdateUsersData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.n(serialDesc, 0, new si.f(UserSearchTransformedUser.Serializer.INSTANCE), self.payload);
    }

    public final List<UserSearchTransformedUser> component1() {
        return this.payload;
    }

    public final UserSearchUpdateUsersData copy(List<UserSearchTransformedUser> payload) {
        q.g(payload, "payload");
        return new UserSearchUpdateUsersData(payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserSearchUpdateUsersData) && q.b(this.payload, ((UserSearchUpdateUsersData) obj).payload);
    }

    public final List<UserSearchTransformedUser> getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return this.payload.hashCode();
    }

    public String toString() {
        List<UserSearchTransformedUser> list = this.payload;
        return "UserSearchUpdateUsersData(payload=" + list + ")";
    }

    
    public UserSearchUpdateUsersData(List<UserSearchTransformedUser> payload) {
        super(null);
        q.g(payload, "payload");
        this.payload = payload;
    }
}
