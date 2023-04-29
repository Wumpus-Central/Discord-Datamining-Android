.class final Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListView$sync$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "update",
        "Lcom/discord/chat/listmanager/ChatListUpdate;",
        "emit",
        "(Lcom/discord/chat/listmanager/ChatListUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
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
.field final synthetic $isFirstUpdate:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListView;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/discord/chat/presentation/list/ChatListView;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->$isFirstUpdate:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/chat/listmanager/ChatListUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/listmanager/ChatListUpdate;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->$isFirstUpdate:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean p2, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p1

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/discord/chat/listmanager/ChatListUpdate;->copy$default(Lcom/discord/chat/listmanager/ChatListUpdate;Ljava/util/List;Lcom/discord/chat/listmanager/ChatListAction;Ljava/util/List;ILjava/lang/Object;)Lcom/discord/chat/listmanager/ChatListUpdate;

    move-result-object p1

    .line 4
    iget-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {p2, p1}, Lcom/discord/chat/presentation/list/ChatListView;->access$onChatListUpdate(Lcom/discord/chat/presentation/list/ChatListView;Lcom/discord/chat/listmanager/ChatListUpdate;)V

    .line 5
    iget-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->$isFirstUpdate:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 p2, 0x0

    iput-boolean p2, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {p2, p1}, Lcom/discord/chat/presentation/list/ChatListView;->access$onChatListUpdate(Lcom/discord/chat/presentation/list/ChatListView;Lcom/discord/chat/listmanager/ChatListUpdate;)V

    .line 7
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/list/ChatListView$sync$1$1;->emit(Lcom/discord/chat/listmanager/ChatListUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
