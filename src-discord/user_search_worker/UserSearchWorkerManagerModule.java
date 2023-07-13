package com.discord.user_search_worker;

import com.discord.reactevents.ReactEvents;
import com.discord.user_search_worker.react_events.ReturnResultsEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import ff.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "worker", "Lcom/discord/user_search_worker/UserSearchWorker;", "addListener", "", "type", "", "getName", "onmessage", "dataJSON", "removeListeners", "count", "", "terminate", "user_search_worker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class UserSearchWorkerManagerModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents = new ReactEvents(x.a("ReturnResults", f0.b(ReturnResultsEvent.class)));
    private UserSearchWorker worker;

    
    public UserSearchWorkerManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        q.g(reactContext, "reactContext");
        this.worker = new UserSearchWorker(new UserSearchWorkerManagerModule$worker$1(this, reactContext));
    }

    @ReactMethod
    public final void addListener(String type) {
        q.g(type, "type");
    }

    @Override 
    public String getName() {
        return "UserSearchWorkerManager";
    }

    @ReactMethod
    public final void onmessage(String dataJSON) {
        q.g(dataJSON, "dataJSON");
        this.worker.onMessage(dataJSON);
    }

    @ReactMethod
    public final void removeListeners(int i10) {
    }

    @ReactMethod
    public final void terminate() {
        this.worker.terminate();
    }
}
