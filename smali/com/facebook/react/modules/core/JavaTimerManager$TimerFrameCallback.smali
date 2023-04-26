.class Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;
.super Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TimerFrameCallback"
.end annotation


# instance fields
.field private mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method private constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-direct {p0}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$000(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$100(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-wide/32 v0, 0xf4240

    .line 27
    .line 28
    .line 29
    div-long/2addr p1, v0

    .line 30
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$200(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    monitor-enter v0

    .line 37
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 38
    .line 39
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$300(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 50
    .line 51
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$300(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    .line 60
    .line 61
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$400(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    cmp-long v1, v1, p1

    .line 66
    .line 67
    if-gez v1, :cond_3

    .line 68
    .line 69
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 70
    .line 71
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$300(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;

    .line 80
    .line 81
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 82
    .line 83
    if-nez v2, :cond_1

    .line 84
    .line 85
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iput-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 90
    .line 91
    :cond_1
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 92
    .line 93
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$500(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$600(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_2

    .line 105
    .line 106
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$700(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    int-to-long v2, v2

    .line 111
    add-long/2addr v2, p1

    .line 112
    invoke-static {v1, v2, v3}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$402(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;J)J

    .line 113
    .line 114
    .line 115
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 116
    .line 117
    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$300(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-virtual {v2, v1}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 126
    .line 127
    invoke-static {v2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$800(Lcom/facebook/react/modules/core/JavaTimerManager;)Landroid/util/SparseArray;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-static {v1}, Lcom/facebook/react/modules/core/JavaTimerManager$Timer;->access$500(Lcom/facebook/react/modules/core/JavaTimerManager$Timer;)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 141
    .line 142
    if-eqz p1, :cond_4

    .line 143
    .line 144
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$900(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 151
    .line 152
    invoke-interface {p1, p2}, Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;->callTimers(Lcom/facebook/react/bridge/WritableArray;)V

    .line 153
    .line 154
    .line 155
    const/4 p1, 0x0

    .line 156
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->mTimersToCall:Lcom/facebook/react/bridge/WritableArray;

    .line 157
    .line 158
    :cond_4
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 159
    .line 160
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1000(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    sget-object p2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->TIMERS_EVENTS:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 165
    .line 166
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :catchall_0
    move-exception p1

    .line 171
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    throw p1
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
.end method
