.class public final Lcom/discord/external_pip/ExternalPipModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "ExternalPip"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/external_pip/ExternalPipModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u0004\u0012\u00020\u00040\u0012\u00f8\u0001\u0000R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006 "
    }
    d2 = {
        "Lcom/discord/external_pip/ExternalPipModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "",
        "isInPipMode",
        "",
        "onPipModeChanged",
        "",
        "getName",
        "Lcom/facebook/react/bridge/Promise;",
        "onResultPromise",
        "enterPipMode",
        "enabled",
        "setEnabled",
        "",
        "numerator",
        "denominator",
        "setPipAspectRatio",
        "force",
        "Lkotlin/Function1;",
        "Llf/s;",
        "onResult",
        "Lcom/discord/external_pip/ExternalPipManager;",
        "manager",
        "Lcom/discord/external_pip/ExternalPipManager;",
        "Lcom/discord/reactevents/ReactEvents;",
        "reactEvents",
        "Lcom/discord/reactevents/ReactEvents;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "Companion",
        "external_pip_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/discord/external_pip/ExternalPipModule$Companion;

.field public static final NAME:Ljava/lang/String; = "ExternalPip"


# instance fields
.field private final manager:Lcom/discord/external_pip/ExternalPipManager;

.field private final reactEvents:Lcom/discord/reactevents/ReactEvents;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/external_pip/ExternalPipModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/external_pip/ExternalPipModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/external_pip/ExternalPipModule;->Companion:Lcom/discord/external_pip/ExternalPipModule$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

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
    new-instance p1, Lcom/discord/external_pip/ExternalPipManager;

    .line 10
    .line 11
    invoke-direct {p1}, Lcom/discord/external_pip/ExternalPipManager;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/discord/external_pip/ExternalPipModule;->manager:Lcom/discord/external_pip/ExternalPipManager;

    .line 15
    .line 16
    new-instance p1, Lcom/discord/reactevents/ReactEvents;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    new-array v0, v0, [Lkotlin/Pair;

    .line 20
    .line 21
    const-class v1, Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "onPipModeChanged"

    .line 28
    .line 29
    invoke-static {v2, v1}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    aput-object v1, v0, v2

    .line 35
    .line 36
    invoke-direct {p1, v0}, Lcom/discord/reactevents/ReactEvents;-><init>([Lkotlin/Pair;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/discord/external_pip/ExternalPipModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    .line 40
    .line 41
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
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method

.method public static final synthetic access$onPipModeChanged(Lcom/discord/external_pip/ExternalPipModule;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/external_pip/ExternalPipModule;->onPipModeChanged(Z)V

    return-void
.end method

.method private final onPipModeChanged(Z)V
    .locals 3

    iget-object v0, p0, Lcom/discord/external_pip/ExternalPipModule;->reactEvents:Lcom/discord/reactevents/ReactEvents;

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    const-string v2, "reactApplicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;

    invoke-direct {v2, p1}, Lcom/discord/external_pip/react_events/OnPipModeChangedEvent;-><init>(Z)V

    invoke-virtual {v0, v1, v2}, Lcom/discord/reactevents/ReactEvents;->emitModuleEvent(Landroid/content/Context;Lcom/discord/reactevents/ReactEvent;)V

    return-void
.end method


# virtual methods
.method public final enterPipMode(Lcom/facebook/react/bridge/Promise;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    const-string v0, "onResultPromise"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/discord/external_pip/ExternalPipModule$enterPipMode$1;

    invoke-direct {v0, p1}, Lcom/discord/external_pip/ExternalPipModule$enterPipMode$1;-><init>(Lcom/facebook/react/bridge/Promise;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/discord/external_pip/ExternalPipModule;->enterPipMode(ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final enterPipMode(ZLkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llf/s<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/discord/external_pip/ExternalPipModule;->manager:Lcom/discord/external_pip/ExternalPipManager;

    .line 3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1, p1, p2}, Lcom/discord/external_pip/ExternalPipManager;->enterPipMode(Landroid/app/Activity;ZLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ExternalPip"

    return-object v0
.end method

.method public final setEnabled(Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/external_pip/ExternalPipModule;->manager:Lcom/discord/external_pip/ExternalPipManager;

    invoke-virtual {v0, p1}, Lcom/discord/external_pip/ExternalPipManager;->setEnabled(Z)V

    return-void
.end method

.method public final setPipAspectRatio(II)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/discord/external_pip/ExternalPipModule;->manager:Lcom/discord/external_pip/ExternalPipManager;

    invoke-virtual {v0, p1, p2}, Lcom/discord/external_pip/ExternalPipManager;->setPipAspectRatio(II)V

    return-void
.end method
