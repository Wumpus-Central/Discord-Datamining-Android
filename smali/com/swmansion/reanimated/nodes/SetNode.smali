.class public Lcom/swmansion/reanimated/nodes/SetNode;
.super Lcom/swmansion/reanimated/nodes/Node;
.source "SourceFile"


# instance fields
.field private mValueNodeID:I

.field private mWhatNodeID:I


# direct methods
.method public constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/reanimated/nodes/Node;-><init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "what"

    .line 5
    .line 6
    const-string p3, "Reanimated: First argument passed to set node is either of wrong type or is missing."

    .line 7
    .line 8
    invoke-static {p2, p1, p3}, Lcom/swmansion/reanimated/MapUtils;->getInt(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lcom/swmansion/reanimated/nodes/SetNode;->mWhatNodeID:I

    .line 13
    .line 14
    const-string p1, "value"

    .line 15
    .line 16
    const-string p3, "Reanimated: Second argument passed to set node is either of wrong type or is missing."

    .line 17
    .line 18
    invoke-static {p2, p1, p3}, Lcom/swmansion/reanimated/MapUtils;->getInt(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iput p1, p0, Lcom/swmansion/reanimated/nodes/SetNode;->mValueNodeID:I

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method


# virtual methods
.method protected evaluate()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 2
    .line 3
    iget v1, p0, Lcom/swmansion/reanimated/nodes/SetNode;->mValueNodeID:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/swmansion/reanimated/NodesManager;->getNodeValue(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 10
    .line 11
    iget v2, p0, Lcom/swmansion/reanimated/nodes/SetNode;->mWhatNodeID:I

    .line 12
    .line 13
    const-class v3, Lcom/swmansion/reanimated/nodes/ValueNode;

    .line 14
    .line 15
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/reanimated/NodesManager;->findNodeById(ILjava/lang/Class;)Lcom/swmansion/reanimated/nodes/Node;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/swmansion/reanimated/nodes/ValueNode;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lcom/swmansion/reanimated/nodes/ValueNode;->setValue(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
