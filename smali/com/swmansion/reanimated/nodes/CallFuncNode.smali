.class public Lcom/swmansion/reanimated/nodes/CallFuncNode;
.super Lcom/swmansion/reanimated/nodes/Node;
.source "SourceFile"


# instance fields
.field private final mArgs:[I

.field private final mParams:[I

.field private mPreviousCallID:Ljava/lang/String;

.field private final mWhatNodeID:I


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
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mWhatNodeID:I

    .line 11
    .line 12
    const-string p1, "params"

    .line 13
    .line 14
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/swmansion/reanimated/Utils;->processIntArray(Lcom/facebook/react/bridge/ReadableArray;)[I

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mParams:[I

    .line 23
    .line 24
    const-string p1, "args"

    .line 25
    .line 26
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/swmansion/reanimated/Utils;->processIntArray(Lcom/facebook/react/bridge/ReadableArray;)[I

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mArgs:[I

    .line 35
    .line 36
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
.end method

.method private beginContext()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/swmansion/reanimated/NodesManager;->updateContext:Lcom/swmansion/reanimated/UpdateContext;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/swmansion/reanimated/UpdateContext;->callID:Ljava/lang/String;

    .line 6
    .line 7
    iput-object v1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mPreviousCallID:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 15
    .line 16
    iget-object v2, v2, Lcom/swmansion/reanimated/NodesManager;->updateContext:Lcom/swmansion/reanimated/UpdateContext;

    .line 17
    .line 18
    iget-object v2, v2, Lcom/swmansion/reanimated/UpdateContext;->callID:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x2f

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget v2, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodeID:I

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lcom/swmansion/reanimated/UpdateContext;->callID:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    :goto_0
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mParams:[I

    .line 45
    .line 46
    array-length v2, v1

    .line 47
    if-ge v0, v2, :cond_0

    .line 48
    .line 49
    aget v1, v1, v0

    .line 50
    .line 51
    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 52
    .line 53
    const-class v3, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 54
    .line 55
    invoke-virtual {v2, v1, v3}, Lcom/swmansion/reanimated/NodesManager;->findNodeById(ILjava/lang/Class;)Lcom/swmansion/reanimated/nodes/Node;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mArgs:[I

    .line 62
    .line 63
    aget v2, v2, v0

    .line 64
    .line 65
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    iget-object v3, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mPreviousCallID:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3}, Lcom/swmansion/reanimated/nodes/ParamNode;->beginContext(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method

.method private endContext()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mParams:[I

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    aget v1, v1, v0

    .line 8
    .line 9
    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 10
    .line 11
    const-class v3, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 12
    .line 13
    invoke-virtual {v2, v1, v3}, Lcom/swmansion/reanimated/NodesManager;->findNodeById(ILjava/lang/Class;)Lcom/swmansion/reanimated/nodes/Node;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/swmansion/reanimated/nodes/ParamNode;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/swmansion/reanimated/nodes/ParamNode;->endContext()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/swmansion/reanimated/NodesManager;->updateContext:Lcom/swmansion/reanimated/UpdateContext;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mPreviousCallID:Ljava/lang/String;

    .line 30
    .line 31
    iput-object v1, v0, Lcom/swmansion/reanimated/UpdateContext;->callID:Ljava/lang/String;

    .line 32
    .line 33
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method


# virtual methods
.method protected evaluate()Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/CallFuncNode;->beginContext()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 5
    .line 6
    iget v1, p0, Lcom/swmansion/reanimated/nodes/CallFuncNode;->mWhatNodeID:I

    .line 7
    .line 8
    const-class v2, Lcom/swmansion/reanimated/nodes/Node;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/swmansion/reanimated/NodesManager;->findNodeById(ILjava/lang/Class;)Lcom/swmansion/reanimated/nodes/Node;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/swmansion/reanimated/nodes/Node;->value()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0}, Lcom/swmansion/reanimated/nodes/CallFuncNode;->endContext()V

    .line 19
    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
