package com.discord.user_search_worker;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
final class UserSearchWorker$searchUsers$sortedResults$2 extends AbstractC9679s implements Function1<UserSearchWorkerResult, Comparable<?>> {
    public static final UserSearchWorker$searchUsers$sortedResults$2 INSTANCE = new UserSearchWorker$searchUsers$sortedResults$2();

    UserSearchWorker$searchUsers$sortedResults$2() {
        super(1);
    }

    public final Comparable<?> invoke(UserSearchWorkerResult it) {
        C9677q.m14633g(it, "it");
        return it.getComparator();
    }
}
