.class final Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/List<",
        "+",
        "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
        ">;",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n\u00a2\u0006\u0002\u0008\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "results",
        "",
        "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
        "query",
        "",
        "uuid",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic this$0:Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;->this$0:Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;

    iput-object p2, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;->$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;->invoke(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;->this$0:Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;

    invoke-static {v0}, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;->access$getReactEvents$p(Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;)Lcom/discord/reactevents/ReactEvents;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/discord/user_search_worker/UserSearchWorkerManagerModule$worker$1;->$reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    new-instance v2, Lcom/discord/user_search_worker/react_events/ReturnResultsEvent;

    const-string v3, "USER_RESULTS"

    invoke-direct {v2, p1, p2, p3, v3}, Lcom/discord/user_search_worker/react_events/ReturnResultsEvent;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method
