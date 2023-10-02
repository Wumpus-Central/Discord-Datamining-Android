package com.discord.user_search_worker;

import com.discord.reactevents.ReactEvents;
import com.discord.user_search_worker.react_events.ReturnResultsEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "results", "", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "query", "", "uuid", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class UserSearchWorkerManagerModule$worker$1 extends s implements Function3<List<? extends UserSearchWorkerResult>, String, String, Unit> {
    final  ReactApplicationContext $reactContext;
    final  UserSearchWorkerManagerModule this$0;

    
    
    public UserSearchWorkerManagerModule$worker$1(UserSearchWorkerManagerModule userSearchWorkerManagerModule, ReactApplicationContext reactApplicationContext) {
        super(3);
        this.this$0 = userSearchWorkerManagerModule;
        this.$reactContext = reactApplicationContext;
    }

    @Override 
    public   Unit invoke(List<? extends UserSearchWorkerResult> list, String str, String str2) {
        invoke2((List<UserSearchWorkerResult>) list, str, str2);
        return Unit.f21601a;
    }

    
    public final void invoke2(List<UserSearchWorkerResult> results, String query, String uuid) {
        ReactEvents reactEvents;
        q.h(results, "results");
        q.h(query, "query");
        q.h(uuid, "uuid");
        reactEvents = this.this$0.reactEvents;
        reactEvents.emitModuleEvent(this.$reactContext, new ReturnResultsEvent(results, query, uuid, "USER_RESULTS"));
    }
}
