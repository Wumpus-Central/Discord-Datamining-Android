.class public final Lcom/discord/timers/TimersModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0006\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0007J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0008\u0010\u0011\u001a\u00020\u000cH\u0016J\u0008\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000fH\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/discord/timers/TimersModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "timersManager",
        "Lcom/discord/timers/TimersManager;",
        "addListener",
        "",
        "type",
        "",
        "clearInterval",
        "id",
        "",
        "clearTimeout",
        "getName",
        "onCatalystInstanceDestroy",
        "removeListeners",
        "count",
        "setInterval",
        "timeout",
        "",
        "setTimeout",
        "react_timers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;

.field private final timersManager:Lcom/discord/timers/TimersManager;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 4

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/discord/reactevents/ReactEvents;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    new-array v1, v1, [Lkotlin/Pair;

    .line 13
    .line 14
    const-class v2, Lcom/discord/timers/reactevents/TimerEvent;

    .line 15
    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "timer"

    .line 21
    .line 22
    invoke-static {v3, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v3, 0x0

    .line 27
    aput-object v2, v1, v3

    .line 28
    .line 29
    const-class v2, Lcom/discord/timers/reactevents/IntervalEvent;

    .line 30
    .line 31
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "interval"

    .line 36
    .line 37
    invoke-static {v3, v2}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x1

    .line 42
    aput-object v2, v1, v3

    .line 43
    .line 44
    invoke-direct {v0, v1}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/discord/timers/TimersModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 48
    .line 49
    new-instance v0, Lcom/discord/timers/TimersManager;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lcom/discord/timers/TimersManager;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    .line 55
    .line 56
    return-void
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

.method public static final synthetic access$getReactApplicationContext(Lcom/discord/timers/TimersModule;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getReactEvents$p(Lcom/discord/timers/TimersModule;)Lcom/discord/reactevents/ReactEvents;
    .locals 0

    iget-object p0, p0, Lcom/discord/timers/TimersModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    return-object p0
.end method


# virtual methods
.method public final addListener(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final clearInterval(I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    invoke-virtual {v0, p1}, Lcom/discord/timers/TimersManager;->clearInterval(I)V

    return-void
.end method

.method public final clearTimeout(I)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    invoke-virtual {v0, p1}, Lcom/discord/timers/TimersManager;->clearTimeout(I)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "TimersModule"

    return-object v0
.end method

.method public onCatalystInstanceDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    invoke-virtual {v0}, Lcom/discord/timers/TimersManager;->clean()V

    return-void
.end method

.method public final removeListeners(I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public final setInterval(ID)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    new-instance v1, Lcom/discord/timers/TimersModule$setInterval$1;

    invoke-direct {v1, p0, p1}, Lcom/discord/timers/TimersModule$setInterval$1;-><init>(Lcom/discord/timers/TimersModule;I)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/discord/timers/TimersManager;->setInterval(IDLkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final setTimeout(ID)V
    .locals 2
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/timers/TimersModule;->timersManager:Lcom/discord/timers/TimersManager;

    new-instance v1, Lcom/discord/timers/TimersModule$setTimeout$1;

    invoke-direct {v1, p0, p1}, Lcom/discord/timers/TimersModule$setTimeout$1;-><init>(Lcom/discord/timers/TimersModule;I)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/discord/timers/TimersManager;->setTimeout(IDLkotlin/jvm/functions/Function0;)V

    return-void
.end method
