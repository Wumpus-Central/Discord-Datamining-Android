.class public final Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007J\u0008\u0010\r\u001a\u00020\u000cH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000cH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0008\u0010\u0013\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "worker",
        "Lcom/discord/user_search_worker/UserSearchWorker;",
        "addListener",
        "",
        "type",
        "",
        "getName",
        "onmessage",
        "dataJSON",
        "removeListeners",
        "count",
        "",
        "terminate",
        "user_search_worker_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;

.field private worker:Lcom/discord/user_search_worker/UserSearchWorker;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 4

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/discord/reactevents/ReactEvents;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    new-array v1, v1, [Lkotlin/Pair;

    .line 13
    .line 14
    const-class v2, Lcom/discord/user_search_worker/react_events/ReturnResultsEvent;

    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "ReturnResults"

    .line 21
    .line 22
    invoke-static {v3, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v2, v1, v3

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 33
    .line 34
    new-instance v0, Lcom/discord/user_search_worker/UserSearchWorker;

    .line 35
    .line 36
    new-instance v1, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;

    .line 37
    .line 38
    invoke-direct {v1, p0, p1}, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;-><init>(Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1}, Lcom/discord/user_search_worker/UserSearchWorker;-><init>(Lkotlin/jvm/functions/Function3;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->worker:Lcom/discord/user_search_worker/UserSearchWorker;

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic access$getReactEvents$p(Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;)Lcom/discord/reactevents/ReactEvents;
    .locals 0

    iget-object p0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    return-object p0
.end method


# virtual methods
.method public final addListener(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "UserSearchWorkerManager"

    return-object v0
.end method

.method public final onmessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "dataJSON"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->worker:Lcom/discord/user_search_worker/UserSearchWorker;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/discord/user_search_worker/UserSearchWorker;->onMessage(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public final removeListeners(I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public final terminate()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->worker:Lcom/discord/user_search_worker/UserSearchWorker;

    invoke-virtual {v0}, Lcom/discord/user_search_worker/UserSearchWorker;->terminate()V

    return-void
.end method
