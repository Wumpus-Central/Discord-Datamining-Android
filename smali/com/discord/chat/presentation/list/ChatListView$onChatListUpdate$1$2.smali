.class final Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;
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
.method constructor <init>(Lcom/discord/chat/listmanager/ChatListUpdate;Lcom/discord/chat/presentation/list/ChatListView;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    iput-object p3, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$wasAtBottom:Lkotlin/jvm/internal/Ref$BooleanRef;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v0

    instance-of v0, v0, Lcom/discord/chat/listmanager/ChatListAction$Clear;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getScrollStateObserver$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/list/ChatScrollStateObserver;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    .line 5
    sget-object v2, Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;->NO:Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;

    .line 6
    invoke-virtual {v0, v1, v2}, Lcom/discord/chat/presentation/list/ChatScrollStateObserver;->startWatching(Landroidx/recyclerview/widget/RecyclerView;Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v0

    .line 8
    instance-of v1, v0, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    if-eqz v1, :cond_2

    .line 9
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v0}, Lcom/discord/chat/listmanager/ChatListUpdate;->getItems()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v1}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v1

    check-cast v1, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    invoke-virtual {v1}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->getPosition()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/collections/h;->X(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/discord/chat/presentation/list/item/ChatListItem;

    .line 10
    instance-of v0, v0, Lcom/discord/chat/presentation/list/item/SeparatorChatListItem;

    if-eqz v0, :cond_1

    .line 11
    new-instance v0, Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;

    const/4 v1, 0x4

    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Top;-><init>(I)V

    goto :goto_0

    .line 12
    :cond_1
    sget-object v0, Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;->INSTANCE:Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Center;

    .line 13
    :goto_0
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    .line 14
    iget-object v2, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v2}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v2

    check-cast v2, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    invoke-virtual {v2}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->getPosition()I

    move-result v2

    .line 15
    iget-object v3, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v3}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v3

    check-cast v3, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    invoke-virtual {v3}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->getAnimated()Z

    move-result v3

    .line 16
    iget-object v4, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$update:Lcom/discord/chat/listmanager/ChatListUpdate;

    invoke-virtual {v4}, Lcom/discord/chat/listmanager/ChatListUpdate;->getAction()Lcom/discord/chat/listmanager/ChatListAction;

    move-result-object v4

    check-cast v4, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;

    invoke-virtual {v4}, Lcom/discord/chat/listmanager/ChatListAction$ScrollTo;->isHighlight()Z

    move-result v4

    .line 17
    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/discord/chat/presentation/list/ChatListView;->scrollToPosition(ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;ZZ)V

    goto :goto_1

    .line 18
    :cond_2
    instance-of v1, v0, Lcom/discord/chat/listmanager/ChatListAction$StickToBottomIfAtBottom;

    if-eqz v1, :cond_4

    .line 19
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->$wasAtBottom:Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    if-eqz v0, :cond_5

    .line 20
    sget-object v0, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    invoke-virtual {v0}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 21
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getScrollStateObserver$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/list/ChatScrollStateObserver;

    move-result-object v0

    .line 22
    iget-object v2, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    .line 23
    sget-object v3, Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;->YES:Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;

    .line 24
    invoke-virtual {v0, v2, v3}, Lcom/discord/chat/presentation/list/ChatScrollStateObserver;->startWatching(Landroidx/recyclerview/widget/RecyclerView;Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;)V

    .line 25
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    goto :goto_1

    .line 26
    :cond_3
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$onChatListUpdate$1$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    .line 27
    sget-object v2, Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;->INSTANCE:Lcom/discord/recycler_view/scroller/Scroller$TargetAlignment$Anywhere;

    .line 28
    invoke-virtual {v0, v1, v2, v1, v1}, Lcom/discord/chat/presentation/list/ChatListView;->scrollToPosition(ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;ZZ)V

    goto :goto_1

    .line 29
    :cond_4
    instance-of v1, v0, Lcom/discord/chat/listmanager/ChatListAction$Clear;

    if-nez v1, :cond_5

    .line 30
    instance-of v0, v0, Lcom/discord/chat/listmanager/ChatListAction$Noop;

    :cond_5
    :goto_1
    return-void
.end method
