.class Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->postDispatchSwipe(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

.field final synthetic val$anim:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;

.field final synthetic val$swipeDir:I


# direct methods
.method constructor <init>(Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;I)V
    .locals 0

    iput-object p1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    iput-object p2, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->val$anim:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;

    iput p3, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->val$swipeDir:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->val$anim:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;

    .line 14
    .line 15
    iget-boolean v1, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mOverridden:Z

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, -0x1

    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->isRunning(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemAnimatorFinishedListener;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    :cond_0
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->hasRunningRecoverAnim()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mCallback:Lcom/discord/chat/presentation/list/ChatListCallback;

    .line 56
    .line 57
    iget-object v1, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->val$anim:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;

    .line 58
    .line 59
    iget-object v1, v1, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$RecoverAnimation;->mViewHolder:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 60
    .line 61
    iget v2, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->val$swipeDir:I

    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/ItemTouchHelper$c;->onSwiped(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iget-object v0, p0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper$4;->this$0:Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;

    .line 68
    .line 69
    iget-object v0, v0, Lcom/discord/chat/presentation/list/ChatListItemTouchHelper;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    return-void
    .line 75
    .line 76
.end method
