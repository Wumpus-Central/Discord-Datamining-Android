.class Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/animated/NativeAnimatedModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ConcurrentOperationQueue"
.end annotation


# instance fields
.field private mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

.field private final mQueue:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;",
            ">;"
        }
    .end annotation
.end field

.field private mSynchronizedAccess:Z

.field final synthetic this$0:Lcom/facebook/react/animated/NativeAnimatedModule;


# direct methods
.method private constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->this$0:Lcom/facebook/react/animated/NativeAnimatedModule;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mQueue:Ljava/util/Queue;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mSynchronizedAccess:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/animated/NativeAnimatedModule;Lcom/facebook/react/animated/NativeAnimatedModule$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;-><init>(Lcom/facebook/react/animated/NativeAnimatedModule;)V

    return-void
.end method

.method private drainQueueIntoList(J)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->getBatchNumber()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    cmp-long v2, v2, p1

    .line 23
    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 28
    .line 29
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 33
    .line 34
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mQueue:Ljava/util/Queue;

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    invoke-virtual {v2}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->getBatchNumber()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    cmp-long v3, v3, p1

    .line 50
    .line 51
    if-lez v3, :cond_4

    .line 52
    .line 53
    iput-object v2, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 54
    .line 55
    :goto_1
    return-object v0

    .line 56
    :cond_4
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0
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


# virtual methods
.method add(Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mSynchronizedAccess:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mQueue:Ljava/util/Queue;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mQueue:Ljava/util/Queue;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void
    .line 22
    .line 23
    .line 24
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
.end method

.method executeBatch(JLcom/facebook/react/animated/NativeAnimatedNodesManager;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mSynchronizedAccess:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->drainQueueIntoList(J)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    monitor-exit p0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p1

    .line 15
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->drainQueueIntoList(J)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    .line 36
    .line 37
    invoke-virtual {p2, p3}, Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;->execute(Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    return-void
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
.end method

.method isEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mQueue:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mPeekedOperation:Lcom/facebook/react/animated/NativeAnimatedModule$UIThreadOperation;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method setSynchronizedAccess(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/animated/NativeAnimatedModule$ConcurrentOperationQueue;->mSynchronizedAccess:Z

    return-void
.end method
