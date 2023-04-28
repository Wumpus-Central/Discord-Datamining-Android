package com.discord.user_search_worker;

import bj.C3681n1;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p449yi.AbstractC14435f;

@AbstractC14435f
@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m15073d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetData;", "Lcom/discord/user_search_worker/UserSearchData;", "seen1", "", "uuid", "", "payload", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V", "getPayload", "()Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "getUuid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class UserSearchQuerySetData extends UserSearchData {
    public static final Companion Companion = new Companion(null);
    private final UserSearchQuerySetPayload payload;
    private final String uuid;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetData;", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchQuerySetData> serializer() {
            return UserSearchQuerySetData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserSearchQuerySetData(int i, String str, UserSearchQuerySetPayload userSearchQuerySetPayload, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i & 3)) {
            C3681n1.m33818b(i, 3, UserSearchQuerySetData$$serializer.INSTANCE.getDescriptor());
        }
        this.uuid = str;
        this.payload = userSearchQuerySetPayload;
    }

    public static /* synthetic */ UserSearchQuerySetData copy$default(UserSearchQuerySetData userSearchQuerySetData, String str, UserSearchQuerySetPayload userSearchQuerySetPayload, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSearchQuerySetData.uuid;
        }
        if ((i & 2) != 0) {
            userSearchQuerySetPayload = userSearchQuerySetData.payload;
        }
        return userSearchQuerySetData.copy(str, userSearchQuerySetPayload);
    }

    public static final void write$Self(UserSearchQuerySetData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9971q.m14633g(self, "self");
        C9971q.m14633g(output, "output");
        C9971q.m14633g(serialDesc, "serialDesc");
        output.mo13864z(serialDesc, 0, self.uuid);
        output.mo13870t(serialDesc, 1, UserSearchQuerySetPayload$$serializer.INSTANCE, self.payload);
    }

    public final String component1() {
        return this.uuid;
    }

    public final UserSearchQuerySetPayload component2() {
        return this.payload;
    }

    public final UserSearchQuerySetData copy(String uuid, UserSearchQuerySetPayload payload) {
        C9971q.m14633g(uuid, "uuid");
        C9971q.m14633g(payload, "payload");
        return new UserSearchQuerySetData(uuid, payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchQuerySetData)) {
            return false;
        }
        UserSearchQuerySetData userSearchQuerySetData = (UserSearchQuerySetData) obj;
        return C9971q.m14638b(this.uuid, userSearchQuerySetData.uuid) && C9971q.m14638b(this.payload, userSearchQuerySetData.payload);
    }

    public final UserSearchQuerySetPayload getPayload() {
        return this.payload;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        String str = this.uuid;
        UserSearchQuerySetPayload userSearchQuerySetPayload = this.payload;
        return "UserSearchQuerySetData(uuid=" + str + ", payload=" + userSearchQuerySetPayload + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchQuerySetData(String uuid, UserSearchQuerySetPayload payload) {
        super(null);
        C9971q.m14633g(uuid, "uuid");
        C9971q.m14633g(payload, "payload");
        this.uuid = uuid;
        this.payload = payload;
    }
}
