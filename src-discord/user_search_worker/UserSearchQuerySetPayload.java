package com.discord.user_search_worker;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import vj.f;
import yj.a2;
import yj.n1;
import yj.r0;
import yj.x;

@f
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J!\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÇ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00063"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "seen1", "", "query", "", "filters", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "blacklist", "", "whitelist", "boosters", "", "", "limit", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;I)V", "getBlacklist", "()Ljava/util/List;", "getBoosters", "()Ljava/util/Map;", "getFilters", "()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "getLimit", "()I", "getQuery", "()Ljava/lang/String;", "getWhitelist", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserSearchQuerySetPayload {
    public static final Companion Companion = new Companion(null);
    private final List<String> blacklist;
    private final Map<String, Double> boosters;
    private final UserSearchQuerySetFilters filters;
    private final int limit;
    private final String query;
    private final List<String> whitelist;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserSearchQuerySetPayload> serializer() {
            return UserSearchQuerySetPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserSearchQuerySetPayload(int i10, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i11, SerializationConstructorMarker serializationConstructorMarker) {
        if (49 != (i10 & 49)) {
            n1.b(i10, 49, UserSearchQuerySetPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.query = str;
        if ((i10 & 2) == 0) {
            this.filters = null;
        } else {
            this.filters = userSearchQuerySetFilters;
        }
        if ((i10 & 4) == 0) {
            this.blacklist = null;
        } else {
            this.blacklist = list;
        }
        if ((i10 & 8) == 0) {
            this.whitelist = null;
        } else {
            this.whitelist = list2;
        }
        this.boosters = map;
        this.limit = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSearchQuerySetPayload copy$default(UserSearchQuerySetPayload userSearchQuerySetPayload, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userSearchQuerySetPayload.query;
        }
        if ((i11 & 2) != 0) {
            userSearchQuerySetFilters = userSearchQuerySetPayload.filters;
        }
        if ((i11 & 4) != 0) {
            list = userSearchQuerySetPayload.blacklist;
        }
        if ((i11 & 8) != 0) {
            list2 = userSearchQuerySetPayload.whitelist;
        }
        if ((i11 & 16) != 0) {
            map = userSearchQuerySetPayload.boosters;
        }
        if ((i11 & 32) != 0) {
            i10 = userSearchQuerySetPayload.limit;
        }
        return userSearchQuerySetPayload.copy(str, userSearchQuerySetFilters, list, list2, map, i10);
    }

    public static final void write$Self(UserSearchQuerySetPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z10;
        boolean z11;
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        boolean z12 = false;
        output.z(serialDesc, 0, self.query);
        if (!output.A(serialDesc, 1) && self.filters == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            output.u(serialDesc, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, self.filters);
        }
        if (!output.A(serialDesc, 2) && self.blacklist == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            output.u(serialDesc, 2, new yj.f(a2.f32934a), self.blacklist);
        }
        if (output.A(serialDesc, 3) || self.whitelist != null) {
            z12 = true;
        }
        if (z12) {
            output.u(serialDesc, 3, new yj.f(a2.f32934a), self.whitelist);
        }
        output.q(serialDesc, 4, new r0(a2.f32934a, x.f33055a), self.boosters);
        output.x(serialDesc, 5, self.limit);
    }

    public final String component1() {
        return this.query;
    }

    public final UserSearchQuerySetFilters component2() {
        return this.filters;
    }

    public final List<String> component3() {
        return this.blacklist;
    }

    public final List<String> component4() {
        return this.whitelist;
    }

    public final Map<String, Double> component5() {
        return this.boosters;
    }

    public final int component6() {
        return this.limit;
    }

    public final UserSearchQuerySetPayload copy(String query, UserSearchQuerySetFilters userSearchQuerySetFilters, List<String> list, List<String> list2, Map<String, Double> boosters, int i10) {
        q.g(query, "query");
        q.g(boosters, "boosters");
        return new UserSearchQuerySetPayload(query, userSearchQuerySetFilters, list, list2, boosters, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchQuerySetPayload)) {
            return false;
        }
        UserSearchQuerySetPayload userSearchQuerySetPayload = (UserSearchQuerySetPayload) obj;
        return q.b(this.query, userSearchQuerySetPayload.query) && q.b(this.filters, userSearchQuerySetPayload.filters) && q.b(this.blacklist, userSearchQuerySetPayload.blacklist) && q.b(this.whitelist, userSearchQuerySetPayload.whitelist) && q.b(this.boosters, userSearchQuerySetPayload.boosters) && this.limit == userSearchQuerySetPayload.limit;
    }

    public final List<String> getBlacklist() {
        return this.blacklist;
    }

    public final Map<String, Double> getBoosters() {
        return this.boosters;
    }

    public final UserSearchQuerySetFilters getFilters() {
        return this.filters;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<String> getWhitelist() {
        return this.whitelist;
    }

    public int hashCode() {
        int hashCode = this.query.hashCode() * 31;
        UserSearchQuerySetFilters userSearchQuerySetFilters = this.filters;
        int i10 = 0;
        int hashCode2 = (hashCode + (userSearchQuerySetFilters == null ? 0 : userSearchQuerySetFilters.hashCode())) * 31;
        List<String> list = this.blacklist;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.whitelist;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return ((((hashCode3 + i10) * 31) + this.boosters.hashCode()) * 31) + this.limit;
    }

    public String toString() {
        String str = this.query;
        UserSearchQuerySetFilters userSearchQuerySetFilters = this.filters;
        List<String> list = this.blacklist;
        List<String> list2 = this.whitelist;
        Map<String, Double> map = this.boosters;
        int i10 = this.limit;
        return "UserSearchQuerySetPayload(query=" + str + ", filters=" + userSearchQuerySetFilters + ", blacklist=" + list + ", whitelist=" + list2 + ", boosters=" + map + ", limit=" + i10 + ")";
    }

    public UserSearchQuerySetPayload(String query, UserSearchQuerySetFilters userSearchQuerySetFilters, List<String> list, List<String> list2, Map<String, Double> boosters, int i10) {
        q.g(query, "query");
        q.g(boosters, "boosters");
        this.query = query;
        this.filters = userSearchQuerySetFilters;
        this.blacklist = list;
        this.whitelist = list2;
        this.boosters = boosters;
        this.limit = i10;
    }

    public /* synthetic */ UserSearchQuerySetPayload(String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : userSearchQuerySetFilters, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : list2, map, i10);
    }
}
