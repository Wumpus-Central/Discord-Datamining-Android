package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorkerResult;", "", "id", "", "username", "comparator", "score", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "getComparator", "()Ljava/lang/String;", "getId", "getScore", "()D", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserSearchWorkerResult {
    private final String comparator;

    /* renamed from: id  reason: collision with root package name */
    private final String f8038id;
    private final double score;
    private final String username;

    public UserSearchWorkerResult(String id2, String username, String comparator, double d10) {
        q.g(id2, "id");
        q.g(username, "username");
        q.g(comparator, "comparator");
        this.f8038id = id2;
        this.username = username;
        this.comparator = comparator;
        this.score = d10;
    }

    public static /* synthetic */ UserSearchWorkerResult copy$default(UserSearchWorkerResult userSearchWorkerResult, String str, String str2, String str3, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userSearchWorkerResult.f8038id;
        }
        if ((i10 & 2) != 0) {
            str2 = userSearchWorkerResult.username;
        }
        if ((i10 & 4) != 0) {
            str3 = userSearchWorkerResult.comparator;
        }
        if ((i10 & 8) != 0) {
            d10 = userSearchWorkerResult.score;
        }
        return userSearchWorkerResult.copy(str, str2, str3, d10);
    }

    public final String component1() {
        return this.f8038id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.comparator;
    }

    public final double component4() {
        return this.score;
    }

    public final UserSearchWorkerResult copy(String id2, String username, String comparator, double d10) {
        q.g(id2, "id");
        q.g(username, "username");
        q.g(comparator, "comparator");
        return new UserSearchWorkerResult(id2, username, comparator, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSearchWorkerResult)) {
            return false;
        }
        UserSearchWorkerResult userSearchWorkerResult = (UserSearchWorkerResult) obj;
        return q.b(this.f8038id, userSearchWorkerResult.f8038id) && q.b(this.username, userSearchWorkerResult.username) && q.b(this.comparator, userSearchWorkerResult.comparator) && Double.compare(this.score, userSearchWorkerResult.score) == 0;
    }

    public final String getComparator() {
        return this.comparator;
    }

    public final String getId() {
        return this.f8038id;
    }

    public final double getScore() {
        return this.score;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((((this.f8038id.hashCode() * 31) + this.username.hashCode()) * 31) + this.comparator.hashCode()) * 31) + Double.doubleToLongBits(this.score);
    }

    public String toString() {
        String str = this.f8038id;
        String str2 = this.username;
        String str3 = this.comparator;
        double d10 = this.score;
        return "UserSearchWorkerResult(id=" + str + ", username=" + str2 + ", comparator=" + str3 + ", score=" + d10 + ")";
    }
}
