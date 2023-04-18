.class Lcom/swmansion/reanimated/NodesManager$2;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/reanimated/NodesManager;->performOperations()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/reanimated/NodesManager;

.field final synthetic val$copiedOperationsQueue:Ljava/util/Queue;

.field final synthetic val$semaphore:Ljava/util/concurrent/Semaphore;

.field final synthetic val$trySynchronously:Z


# direct methods
.method constructor <init>(Lcom/swmansion/reanimated/NodesManager;Lcom/facebook/react/bridge/JSExceptionHandler;ZLjava/util/concurrent/Semaphore;Ljava/util/Queue;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/reanimated/NodesManager$2;->this$0:Lcom/swmansion/reanimated/NodesManager;

    iput-boolean p3, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$trySynchronously:Z

    iput-object p4, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$semaphore:Ljava/util/concurrent/Semaphore;

    iput-object p5, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$copiedOperationsQueue:Ljava/util/Queue;

    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/NodesManager$2;->this$0:Lcom/swmansion/reanimated/NodesManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/swmansion/reanimated/NodesManager;->access$100(Lcom/swmansion/reanimated/NodesManager;)Lcom/facebook/react/uimanager/UIImplementation;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerReanimatedHelper;->isOperationQueueEmpty(Lcom/facebook/react/uimanager/UIImplementation;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v1, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$trySynchronously:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$semaphore:Ljava/util/concurrent/Semaphore;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/util/concurrent/Semaphore;->release()V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_1
    iget-object v2, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$copiedOperationsQueue:Ljava/util/Queue;

    .line 28
    .line 29
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$copiedOperationsQueue:Ljava/util/Queue;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/swmansion/reanimated/NodesManager$NativeUpdateOperation;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/swmansion/reanimated/NodesManager$2;->this$0:Lcom/swmansion/reanimated/NodesManager;

    .line 44
    .line 45
    invoke-static {v3}, Lcom/swmansion/reanimated/NodesManager;->access$100(Lcom/swmansion/reanimated/NodesManager;)Lcom/facebook/react/uimanager/UIImplementation;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget v4, v2, Lcom/swmansion/reanimated/NodesManager$NativeUpdateOperation;->mViewTag:I

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Lcom/facebook/react/uimanager/UIImplementation;->resolveShadowNode(I)Lcom/facebook/react/uimanager/ReactShadowNode;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    iget-object v4, p0, Lcom/swmansion/reanimated/NodesManager$2;->this$0:Lcom/swmansion/reanimated/NodesManager;

    .line 58
    .line 59
    invoke-static {v4}, Lcom/swmansion/reanimated/NodesManager;->access$200(Lcom/swmansion/reanimated/NodesManager;)Lcom/facebook/react/uimanager/UIManagerModule;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget v5, v2, Lcom/swmansion/reanimated/NodesManager$NativeUpdateOperation;->mViewTag:I

    .line 64
    .line 65
    invoke-interface {v3}, Lcom/facebook/react/uimanager/ReactShadowNode;->getViewClass()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iget-object v2, v2, Lcom/swmansion/reanimated/NodesManager$NativeUpdateOperation;->mNativeProps:Lcom/facebook/react/bridge/WritableMap;

    .line 70
    .line 71
    invoke-virtual {v4, v5, v3, v2}, Lcom/facebook/react/uimanager/UIManagerModule;->updateView(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Lcom/swmansion/reanimated/NodesManager$2;->this$0:Lcom/swmansion/reanimated/NodesManager;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/swmansion/reanimated/NodesManager;->access$100(Lcom/swmansion/reanimated/NodesManager;)Lcom/facebook/react/uimanager/UIImplementation;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const/4 v2, -0x1

    .line 84
    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/UIImplementation;->dispatchViewUpdates(I)V

    .line 85
    .line 86
    .line 87
    :cond_3
    if-eqz v1, :cond_4

    .line 88
    .line 89
    iget-object v0, p0, Lcom/swmansion/reanimated/NodesManager$2;->val$semaphore:Ljava/util/concurrent/Semaphore;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
    .line 95
    .line 96
    .line 97
.end method
