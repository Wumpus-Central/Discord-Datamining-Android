.class Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->scrollIfNecessary()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 14
    .line 15
    iget-object v1, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mSelected:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->moveIfNecessary(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 23
    .line 24
    iget-object v1, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mScrollRunnable:Ljava/lang/Runnable;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$1;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    invoke-static {v0, p0}, Landroidx/core/view/w0;->i0(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
