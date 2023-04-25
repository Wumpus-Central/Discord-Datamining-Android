.class public Lcom/swmansion/reanimated/nodes/ClockOpNode$ClockStopNode;
.super Lcom/swmansion/reanimated/nodes/ClockOpNode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/ClockOpNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClockStopNode"
.end annotation


# direct methods
.method public constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/reanimated/nodes/ClockOpNode;-><init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V

    return-void
.end method


# virtual methods
.method protected eval(Lcom/swmansion/reanimated/nodes/Node;)Ljava/lang/Double;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/swmansion/reanimated/nodes/ParamNode;->stop()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    check-cast p1, Lcom/swmansion/reanimated/nodes/ClockNode;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/swmansion/reanimated/nodes/ClockNode;->stop()V

    .line 14
    .line 15
    .line 16
    :goto_0
    sget-object p1, Lcom/swmansion/reanimated/nodes/Node;->ZERO:Ljava/lang/Double;

    .line 17
    .line 18
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method protected bridge synthetic evaluate()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/swmansion/reanimated/nodes/ClockOpNode;->evaluate()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method
