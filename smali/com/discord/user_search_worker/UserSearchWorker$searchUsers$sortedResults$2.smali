.class final Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/user_search_worker/UserSearchWorker;->searchUsers(Ljava/lang/String;Lcom/discord/user_search_worker/UserSearchQuerySetPayload;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
        "Ljava/lang/Comparable<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
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


# static fields
.field public static final INSTANCE:Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;

    invoke-direct {v0}, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;-><init>()V

    sput-object v0, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;->INSTANCE:Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/discord/user_search_worker/UserSearchWorkerResult;)Ljava/lang/Comparable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/user_search_worker/UserSearchWorkerResult;",
            ")",
            "Ljava/lang/Comparable<",
            "*>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/discord/user_search_worker/UserSearchWorkerResult;->getComparator()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/discord/user_search_worker/UserSearchWorkerResult;

    invoke-virtual {p0, p1}, Lcom/discord/user_search_worker/UserSearchWorker$searchUsers$sortedResults$2;->invoke(Lcom/discord/user_search_worker/UserSearchWorkerResult;)Ljava/lang/Comparable;

    move-result-object p1

    return-object p1
.end method
