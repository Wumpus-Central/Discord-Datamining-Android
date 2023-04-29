.class final Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListView;->scrollToPosition(ILcom/discord/recycler_view/scroller/Scroller$TargetAlignment;ZZ)V
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
.field final synthetic $animated:Z

.field final synthetic $isHighlight:Z

.field final synthetic $position:I

.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListView;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListView;ZZI)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    iput-boolean p2, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$animated:Z

    iput-boolean p3, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$isHighlight:Z

    iput p4, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$position:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 14

    .line 2
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-static {v0}, Lcom/discord/chat/presentation/list/ChatListView;->access$getScrollStateObserver$p(Lcom/discord/chat/presentation/list/ChatListView;)Lcom/discord/chat/presentation/list/ChatScrollStateObserver;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    sget-object v2, Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;->YES:Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;

    invoke-virtual {v0, v1, v2}, Lcom/discord/chat/presentation/list/ChatScrollStateObserver;->startWatching(Landroidx/recyclerview/widget/RecyclerView;Lcom/discord/chat/presentation/list/ChatScrollStateObserver$EmitMode;)V

    .line 3
    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$animated:Z

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$isHighlight:Z

    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    iget v3, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$position:I

    const-wide/16 v4, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt;->chatListEmphasizeHighlightItemAtPosition$default(Landroidx/recyclerview/widget/RecyclerView;IJILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    .line 4
    iget-object v8, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    iget v9, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$position:I

    const-wide/16 v10, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lcom/discord/chat/presentation/list/ChatListHighlightItemAtPositionKt;->chatListHighlightItemAtPosition$default(Landroidx/recyclerview/widget/RecyclerView;IJILjava/lang/Object;)V

    .line 5
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$animated:Z

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->this$0:Lcom/discord/chat/presentation/list/ChatListView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    if-eqz v0, :cond_2

    iget v1, p0, Lcom/discord/chat/presentation/list/ChatListView$scrollToPosition$2;->$position:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->N(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_2
    return-void
.end method
