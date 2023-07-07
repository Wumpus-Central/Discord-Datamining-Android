package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class UserSearchWorker$searchUsers$sortedResults$2 extends s implements Function1<UserSearchWorkerResult, Comparable<?>> {
    public static final UserSearchWorker$searchUsers$sortedResults$2 INSTANCE = new UserSearchWorker$searchUsers$sortedResults$2();

    UserSearchWorker$searchUsers$sortedResults$2() {
        super(1);
    }

    public final Comparable<?> invoke(UserSearchWorkerResult it) {
        q.g(it, "it");
        return it.getComparator();
    }
}
