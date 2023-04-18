.class public Lcom/swmansion/reanimated/nodes/ClockNode;
.super Lcom/swmansion/reanimated/nodes/Node;
.source "SourceFile"

# interfaces
.implements Lcom/swmansion/reanimated/NodesManager$OnAnimationFrame;


# instance fields
.field public isRunning:Z


# direct methods
.method public constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/reanimated/nodes/Node;-><init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V

    return-void
.end method


# virtual methods
.method protected evaluate()Ljava/lang/Double;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    iget-wide v0, v0, Lcom/swmansion/reanimated/NodesManager;->currentFrameTimeMs:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic evaluate()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/reanimated/nodes/ClockNode;->evaluate()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public onAnimationFrame(D)V
    .locals 0

    .line 1
    iget-boolean p1, p0, Lcom/swmansion/reanimated/nodes/ClockNode;->isRunning:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/swmansion/reanimated/nodes/Node;->markUpdated()V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lcom/swmansion/reanimated/NodesManager;->postOnAnimation(Lcom/swmansion/reanimated/NodesManager$OnAnimationFrame;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
.end method

.method public start()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/reanimated/nodes/ClockNode;->isRunning:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/swmansion/reanimated/nodes/ClockNode;->isRunning:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/swmansion/reanimated/NodesManager;->postOnAnimation(Lcom/swmansion/reanimated/NodesManager$OnAnimationFrame;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public stop()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/swmansion/reanimated/nodes/ClockNode;->isRunning:Z

    return-void
.end method
