.class final Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListView;->onChatListUpdate(Lcom/discord/chat/listmanager/ChatListUpdate;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
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
.field final synthetic $update:Lcom/discord/chat/listmanager/ChatListUpdate;

.field final synthetic $wasAtBottom:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListView;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$BooleanRef;Lcom/discord/chat/presentation/list/ChatListView;Lcom/discord/chat/listmanager/ChatListUpdate;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->$wasAtBottom:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    iput-object p3, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->$wasAtBottom:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v1}, Lcom/discord/chat/presentation/list/ChatListView;->access$getScrollStateObserver$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/list/ChatScrollStateObserver;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/presentation/list/ChatScrollStateObserver;->getScrollState()Lcom/discord/chat/presentation/list/ScrollState;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/discord/chat/presentation/list/ScrollState;->isAtBottom()Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    move v2, v3

    :cond_0
    iput-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v0

    instance-of v0, v0, Lcom/discord/chat/listmanager/ChatListAction$Clear;

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$1;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getScrollStateObserver$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/list/ChatScrollStateObserver;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/chat/presentation/list/ChatScrollStateObserver;->stopWatching()V

    :cond_1
    return-void
.end method
