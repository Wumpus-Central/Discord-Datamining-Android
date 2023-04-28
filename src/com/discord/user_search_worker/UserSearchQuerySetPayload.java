package com.discord.user_search_worker;

import bj.C2500a2;
import bj.C2521f;
import bj.C2560n1;
import bj.C2574r0;
import bj.C2591x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J!\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200HÇ\u0001R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u00063"}, m15073d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "", "seen1", "", "query", "", "filters", "Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "blacklist", "", "whitelist", "boosters", "", "", "limit", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetFilters;Ljava/util/List;Ljava/util/List;Ljava/util/Map;I)V", "getBlacklist", "()Ljava/util/List;", "getBoosters", "()Ljava/util/Map;", "getFilters", "()Lcom/discord/user_search_worker/UserSearchQuerySetFilters;", "getLimit", "()I", "getQuery", "()Ljava/lang/String;", "getWhitelist", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class UserSearchQuerySetPayload {
    public static final Companion Companion = new Companion(null);
    private final List<String> blacklist;
    private final Map<String, Double> boosters;
    private final UserSearchQuerySetFilters filters;
    private final int limit;
    private final String query;
    private final List<String> whitelist;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/user_search_worker/UserSearchQuerySetPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "user_search_worker_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
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

    public /* synthetic */ UserSearchQuerySetPayload(int i, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (49 != (i & 49)) {
            C2560n1.m33818b(i, 49, UserSearchQuerySetPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.query = str;
        if ((i & 2) == 0) {
            this.filters = null;
        } else {
            this.filters = userSearchQuerySetFilters;
        }
        if ((i & 4) == 0) {
            this.blacklist = null;
        } else {
            this.blacklist = list;
        }
        if ((i & 8) == 0) {
            this.whitelist = null;
        } else {
            this.whitelist = list2;
        }
        this.boosters = map;
        this.limit = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserSearchQuerySetPayload copy$default(UserSearchQuerySetPayload userSearchQuerySetPayload, String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userSearchQuerySetPayload.query;
        }
        if ((i2 & 2) != 0) {
            userSearchQuerySetFilters = userSearchQuerySetPayload.filters;
        }
        if ((i2 & 4) != 0) {
            list = userSearchQuerySetPayload.blacklist;
        }
        if ((i2 & 8) != 0) {
            list2 = userSearchQuerySetPayload.whitelist;
        }
        if ((i2 & 16) != 0) {
            map = userSearchQuerySetPayload.boosters;
        }
        if ((i2 & 32) != 0) {
            i = userSearchQuerySetPayload.limit;
        }
        return userSearchQuerySetPayload.copy(str, userSearchQuerySetFilters, list, list2, map, i);
    }

    public static final void write$Self(UserSearchQuerySetPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        boolean z;
        boolean z2;
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        boolean z3 = false;
        output.mo13864z(serialDesc, 0, self.query);
        if (!output.mo13893A(serialDesc, 1) && self.filters == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            output.mo13874p(serialDesc, 1, UserSearchQuerySetFilters$$serializer.INSTANCE, self.filters);
        }
        if (!output.mo13893A(serialDesc, 2) && self.blacklist == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            output.mo13874p(serialDesc, 2, new C2521f(C2500a2.f6719a), self.blacklist);
        }
        if (output.mo13893A(serialDesc, 3) || self.whitelist != null) {
            z3 = true;
        }
        if (z3) {
            output.mo13874p(serialDesc, 3, new C2521f(C2500a2.f6719a), self.whitelist);
        }
        output.mo13870t(serialDesc, 4, new C2574r0(C2500a2.f6719a, C2591x.f6840a), self.boosters);
        output.mo13866x(serialDesc, 5, self.limit);
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

    public final UserSearchQuerySetPayload copy(String query, UserSearchQuerySetFilters userSearchQuerySetFilters, List<String> list, List<String> list2, Map<String, Double> boosters, int i) {
        C9677q.m14633g(query, "query");
        C9677q.m14633g(boosters, "boosters");
        return new UserSearchQuerySetPayload(query, userSearchQuerySetFilters, list, list2, boosters, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchQuerySetPayload)) {
            return false;
        }
        UserSearchQuerySetPayload userSearchQuerySetPayload = (UserSearchQuerySetPayload) obj;
        return C9677q.m14638b(this.query, userSearchQuerySetPayload.query) && C9677q.m14638b(this.filters, userSearchQuerySetPayload.filters) && C9677q.m14638b(this.blacklist, userSearchQuerySetPayload.blacklist) && C9677q.m14638b(this.whitelist, userSearchQuerySetPayload.whitelist) && C9677q.m14638b(this.boosters, userSearchQuerySetPayload.boosters) && this.limit == userSearchQuerySetPayload.limit;
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
        int i = 0;
        int hashCode2 = (hashCode + (userSearchQuerySetFilters == null ? 0 : userSearchQuerySetFilters.hashCode())) * 31;
        List<String> list = this.blacklist;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.whitelist;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return ((((hashCode3 + i) * 31) + this.boosters.hashCode()) * 31) + this.limit;
    }

    public String toString() {
        String str = this.query;
        UserSearchQuerySetFilters userSearchQuerySetFilters = this.filters;
        List<String> list = this.blacklist;
        List<String> list2 = this.whitelist;
        Map<String, Double> map = this.boosters;
        int i = this.limit;
        return "UserSearchQuerySetPayload(query=" + str + ", filters=" + userSearchQuerySetFilters + ", blacklist=" + list + ", whitelist=" + list2 + ", boosters=" + map + ", limit=" + i + ")";
    }

    public UserSearchQuerySetPayload(String query, UserSearchQuerySetFilters userSearchQuerySetFilters, List<String> list, List<String> list2, Map<String, Double> boosters, int i) {
        C9677q.m14633g(query, "query");
        C9677q.m14633g(boosters, "boosters");
        this.query = query;
        this.filters = userSearchQuerySetFilters;
        this.blacklist = list;
        this.whitelist = list2;
        this.boosters = boosters;
        this.limit = i;
    }

    public /* synthetic */ UserSearchQuerySetPayload(String str, UserSearchQuerySetFilters userSearchQuerySetFilters, List list, List list2, Map map, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : userSearchQuerySetFilters, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, map, i);
    }
}
