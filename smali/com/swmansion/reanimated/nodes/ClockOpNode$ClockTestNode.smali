.class public Lcom/swmansion/reanimated/nodes/ClockOpNode$ClockTestNode;
.super Lcom/swmansion/reanimated/nodes/ClockOpNode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/ClockOpNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ClockTestNode"
.end annotation


# direct methods
.method public constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/reanimated/nodes/ClockOpNode;-><init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V

    return-void
.end method


# virtual methods
.method protected eval(Lcom/swmansion/reanimated/nodes/Node;)Ljava/lang/Double;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 2
    .line 3
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/swmansion/reanimated/nodes/ParamNode;->isRunning()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-wide v1, v3

    .line 19
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_1
    check-cast p1, Lcom/swmansion/reanimated/nodes/ClockNode;

    .line 25
    .line 26
    iget-boolean p1, p1, Lcom/swmansion/reanimated/nodes/ClockNode;->isRunning:Z

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    move-wide v1, v3

    .line 32
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
    .line 37
    .line 38
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method protected bridge synthetic evaluate()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/swmansion/reanimated/nodes/ClockOpNode;->evaluate()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method
