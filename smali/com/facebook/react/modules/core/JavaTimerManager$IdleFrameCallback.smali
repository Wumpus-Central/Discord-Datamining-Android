.class Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;
.super Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/core/JavaTimerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "IdleFrameCallback"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/core/JavaTimerManager;


# direct methods
.method private constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    invoke-direct {p0}, Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    return-void
.end method


# virtual methods
.method public doFrame(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

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
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

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
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1100(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 35
    .line 36
    invoke-static {v0}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1100(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;->cancel()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 44
    .line 45
    new-instance v1, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 46
    .line 47
    invoke-direct {v1, v0, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1102(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1200(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 60
    .line 61
    invoke-static {p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1100(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-virtual {p1, p2}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;->this$0:Lcom/facebook/react/modules/core/JavaTimerManager;

    .line 69
    .line 70
    invoke-static {p1}, Lcom/facebook/react/modules/core/JavaTimerManager;->access$1000(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object p2, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->IDLE_EVENT:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 75
    .line 76
    invoke-virtual {p1, p2, p0}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;)V

    .line 77
    .line 78
    .line 79
    return-void
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
