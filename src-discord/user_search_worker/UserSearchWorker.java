package com.discord.user_search_worker;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.collections.r;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.text.Regex;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.l;
import sf.c;
import ti.f;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012$\u0010!\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u0004R5\u0010!\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006/"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorker;", "", "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "data", "", "mergeUsers", "Lcom/discord/user_search_worker/UserSearchQuerySetData;", "setNewQuery", "Lcom/discord/user_search_worker/UserSearchQueryClearData;", "clearQuery", "", "id", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "user", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "payload", "", "isValid", "needleBase", "haystackBase", "fuzzySearch", "", "score", "booster", "calculateScore", "uuid", "searchUsers", "dataJSON", "onMessage", "terminate", "Lkotlin/Function3;", "", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "onResults", "Lkotlin/jvm/functions/Function3;", "getOnResults", "()Lkotlin/jvm/functions/Function3;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "", "users", "Ljava/util/Map;", "queries", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Companion", "user_search_worker_release"}, k = 1, mv = {1, 8, 0})

public final class UserSearchWorker {
    private static final double CONTAIN_MATCH_VALUE = 5.0d;
    private static final double EXACT_MATCH_VALUE = 10.0d;
    private static final double FUZZY_MATCH_VALUE = 1.0d;
    private final Function3<List<UserSearchWorkerResult>, String, String, Unit> onResults;
    public static final Companion Companion = new Companion(null);
    private static final Regex STRIP_DIACRITICS_REGEX_PATTERN = new Regex("[\\u0300-\\u036f]");
    private final Json json = l.b(null, UserSearchWorker$json$1.INSTANCE, 1, null);
    private final Map<String, UserSearchTransformedUser> users = new LinkedHashMap();
    private final Map<String, UserSearchQuerySetPayload> queries = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00020\n*\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorker$Companion;", "", "()V", "CONTAIN_MATCH_VALUE", "", "EXACT_MATCH_VALUE", "FUZZY_MATCH_VALUE", "STRIP_DIACRITICS_REGEX_PATTERN", "Lkotlin/text/Regex;", "strippedOfDiacritics", "", "LocalResult", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {

        
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;", "", "comparator", "", "score", "", "(Ljava/lang/String;D)V", "getComparator", "()Ljava/lang/String;", "getScore", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class LocalResult {
            private final String comparator;
            private final double score;

            public LocalResult(String comparator, double d10) {
                q.h(comparator, "comparator");
                this.comparator = comparator;
                this.score = d10;
            }

            public static  LocalResult copy$default(LocalResult localResult, String str, double d10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = localResult.comparator;
                }
                if ((i10 & 2) != 0) {
                    d10 = localResult.score;
                }
                return localResult.copy(str, d10);
            }

            public final String component1() {
                return this.comparator;
            }

            public final double component2() {
                return this.score;
            }

            public final LocalResult copy(String comparator, double d10) {
                q.h(comparator, "comparator");
                return new LocalResult(comparator, d10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LocalResult)) {
                    return false;
                }
                LocalResult localResult = (LocalResult) obj;
                return q.c(this.comparator, localResult.comparator) && Double.compare(this.score, localResult.score) == 0;
            }

            public final String getComparator() {
                return this.comparator;
            }

            public final double getScore() {
                return this.score;
            }

            public int hashCode() {
                return (this.comparator.hashCode() * 31) + Double.doubleToLongBits(this.score);
            }

            public String toString() {
                String str = this.comparator;
                double d10 = this.score;
                return "LocalResult(comparator=" + str + ", score=" + d10 + ")";
            }
        }

        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        
        public final String strippedOfDiacritics(String str) {
            String nfdNormalized = Normalizer.normalize(str, Normalizer.Form.NFD);
            q.g(nfdNormalized, "nfdNormalized");
            return UserSearchWorker.STRIP_DIACRITICS_REGEX_PATTERN.h(nfdNormalized, "");
        }
    }

    
    public UserSearchWorker(Function3<? super List<UserSearchWorkerResult>, ? super String, ? super String, Unit> onResults) {
        q.h(onResults, "onResults");
        this.onResults = onResults;
    }

    private final double calculateScore(double d10, double d11) {
        if (d11 == 0.0d) {
            d11 = FUZZY_MATCH_VALUE;
        }
        return d10 * d11;
    }

    private final void clearQuery(UserSearchQueryClearData userSearchQueryClearData) {
        this.queries.remove(userSearchQueryClearData.getUuid());
    }

    private final boolean fuzzySearch(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        q.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = str2.toLowerCase(locale);
        q.g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int length = lowerCase2.length();
        int length2 = lowerCase.length();
        if (length2 > length) {
            return false;
        }
        if (length2 == length) {
            return q.c(lowerCase, lowerCase2);
        }
        int length3 = lowerCase.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length3; i11++) {
            char charAt = lowerCase.charAt(i11);
            while (true) {
                if (i10 >= length) {
                    break;
                }
                int i12 = i10 + 1;
                if (lowerCase2.charAt(i10) == charAt) {
                    i10 = i12;
                    break;
                }
                i10 = i12;
            }
            if (i10 == length) {
                return false;
            }
        }
        return true;
    }

    private final boolean isValid(String str, UserSearchTransformedUser userSearchTransformedUser, UserSearchQuerySetPayload userSearchQuerySetPayload) {
        UserSearchQuerySetFilters filters;
        boolean z10;
        boolean z11;
        if (userSearchQuerySetPayload.getBlacklist() != null && userSearchQuerySetPayload.getBlacklist().contains(str)) {
            return false;
        }
        if ((userSearchQuerySetPayload.getWhitelist() != null && userSearchQuerySetPayload.getWhitelist().contains(str)) || (filters = userSearchQuerySetPayload.getFilters()) == null) {
            return true;
        }
        Boolean friends = filters.getFriends();
        if (friends != null) {
            z10 = friends.booleanValue();
        } else {
            z10 = false;
        }
        Boolean isFriend = userSearchTransformedUser.isFriend();
        if (isFriend != null) {
            z11 = isFriend.booleanValue();
        } else {
            z11 = false;
        }
        String guild = filters.getGuild();
        if ((!z10 || !z11) && !userSearchTransformedUser.getNicknames().containsKey(guild)) {
            return false;
        }
        return true;
    }

    
    
    private final void mergeUsers(com.discord.user_search_worker.UserSearchUpdateUsersData r14) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.user_search_worker.UserSearchWorker.mergeUsers(com.discord.user_search_worker.UserSearchUpdateUsersData):void");
    }

    private final void searchUsers(String str, UserSearchQuerySetPayload userSearchQuerySetPayload) {
        boolean z10;
        boolean z11;
        Comparator b10;
        List v02;
        List<UserSearchWorkerResult> w02;
        List list;
        List<String> Q;
        double d10;
        Regex regex;
        Companion.LocalResult localResult;
        List l10;
        String str2;
        Boolean strict;
        String query = userSearchQuerySetPayload.getQuery();
        UserSearchQuerySetFilters filters = userSearchQuerySetPayload.getFilters();
        char c10 = 0;
        if (filters == null || (strict = filters.getStrict()) == null) {
            z10 = false;
        } else {
            z10 = strict.booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        char c11 = 1;
        if (query.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.onResults.invoke(arrayList, query, str);
            return;
        }
        String c12 = Regex.f21671k.c(query);
        f fVar = f.IGNORE_CASE;
        Regex regex2 = new Regex("^" + c12, fVar);
        Regex regex3 = new Regex(c12, fVar);
        for (Map.Entry<String, UserSearchTransformedUser> entry : this.users.entrySet()) {
            String key = entry.getKey();
            UserSearchTransformedUser value = entry.getValue();
            String username = value.getUsername();
            if (isValid(key, value, userSearchQuerySetPayload)) {
                if (z10 == c11) {
                    String[] strArr = new String[4];
                    strArr[c10] = value.getUsername();
                    strArr[c11] = value.getGlobalName();
                    strArr[2] = value.getFriendNickname();
                    Map<String, String> nicknames = value.getNicknames();
                    UserSearchQuerySetFilters filters2 = userSearchQuerySetPayload.getFilters();
                    if (filters2 != null) {
                        str2 = filters2.getGuild();
                    } else {
                        str2 = null;
                    }
                    strArr[3] = nicknames.get(str2);
                    list = j.l(strArr);
                } else if (!z10) {
                    String[] strArr2 = new String[3];
                    strArr2[c10] = value.getUsername();
                    strArr2[c11] = value.getGlobalName();
                    strArr2[2] = value.getFriendNickname();
                    l10 = j.l(strArr2);
                    list = r.n0(l10, value.getNicknames().values());
                } else {
                    throw new pf.q();
                }
                Q = r.Q(list);
                UserSearchWorkerResult userSearchWorkerResult = null;
                for (String str3 : Q) {
                    Double d11 = userSearchQuerySetPayload.getBoosters().get(key);
                    if (d11 != null) {
                        d10 = d11.doubleValue();
                    } else {
                        d10 = 0.0d;
                    }
                    if (regex2.a(str3)) {
                        regex = regex2;
                        localResult = new Companion.LocalResult(str3, calculateScore(EXACT_MATCH_VALUE, d10));
                    } else {
                        regex = regex2;
                        if (regex3.a(str3)) {
                            localResult = new Companion.LocalResult(str3, calculateScore(CONTAIN_MATCH_VALUE, d10));
                        } else if (fuzzySearch(query, Companion.strippedOfDiacritics(str3))) {
                            localResult = new Companion.LocalResult(str3, calculateScore(FUZZY_MATCH_VALUE, d10));
                        } else {
                            localResult = null;
                        }
                    }
                    if (localResult != null && (userSearchWorkerResult == null || userSearchWorkerResult.getScore() < localResult.getScore())) {
                        userSearchWorkerResult = new UserSearchWorkerResult(key, username, localResult.getComparator(), localResult.getScore());
                    }
                    arrayList = arrayList;
                    regex2 = regex;
                }
                if (userSearchWorkerResult != null) {
                    arrayList.add(userSearchWorkerResult);
                    arrayList = arrayList;
                } else {
                    arrayList = arrayList;
                }
                regex2 = regex2;
                c10 = 0;
                c11 = 1;
            }
        }
        b10 = c.b(UserSearchWorker$searchUsers$sortedResults$1.INSTANCE, UserSearchWorker$searchUsers$sortedResults$2.INSTANCE);
        v02 = r.v0(arrayList, b10);
        w02 = r.w0(v02, userSearchQuerySetPayload.getLimit());
        this.onResults.invoke(w02, query, str);
    }

    private final void setNewQuery(UserSearchQuerySetData userSearchQuerySetData) {
        this.queries.put(userSearchQuerySetData.getUuid(), userSearchQuerySetData.getPayload());
        searchUsers(userSearchQuerySetData.getUuid(), userSearchQuerySetData.getPayload());
    }

    public final Function3<List<UserSearchWorkerResult>, String, String, Unit> getOnResults() {
        return this.onResults;
    }

    public final void onMessage(String dataJSON) {
        q.h(dataJSON, "dataJSON");
        Json json = this.json;
        json.a();
        UserSearchData userSearchData = (UserSearchData) json.b(UserSearchData.Companion.serializer(), dataJSON);
        if (userSearchData instanceof UserSearchUpdateUsersData) {
            mergeUsers((UserSearchUpdateUsersData) userSearchData);
        } else if (userSearchData instanceof UserSearchQuerySetData) {
            setNewQuery((UserSearchQuerySetData) userSearchData);
        } else if (userSearchData instanceof UserSearchQueryClearData) {
            clearQuery((UserSearchQueryClearData) userSearchData);
        }
    }

    public final void terminate() {
        this.users.clear();
        this.queries.clear();
    }
}
