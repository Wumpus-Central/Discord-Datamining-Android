.class public final Lcom/discord/audio/AudioManagerModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "AudioManager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/audio/AudioManagerModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0008\u0010\u0014\u001a\u00020\u000eH\u0016J\u0008\u0010\u0015\u001a\u00020\u000cH\u0016J\u0008\u0010\u0016\u001a\u00020\u000cH\u0007J\u0010\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0008\u0010\u001a\u001a\u00020\u000cH\u0007J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0007J\u0010\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u001cH\u0007J\u0010\u0010 \u001a\u00020\u000c2\u0006\u0010!\u001a\u00020\"H\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"
    }
    d2 = {
        "Lcom/discord/audio/AudioManagerModule;",
        "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;",
        "reactContext",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "audioManager",
        "Lcom/discord/audio/DiscordAudioManager;",
        "getAudioManager",
        "()Lcom/discord/audio/DiscordAudioManager;",
        "setAudioManager",
        "(Lcom/discord/audio/DiscordAudioManager;)V",
        "addListener",
        "",
        "type",
        "",
        "getActiveAudioDevice",
        "cb",
        "Lcom/facebook/react/bridge/Callback;",
        "getAudioDevices",
        "getMediaVolume",
        "getName",
        "initialize",
        "makeEarpieceUnavailable",
        "removeListeners",
        "count",
        "",
        "resetEarpieceAvailability",
        "setActiveAudioDevice",
        "",
        "device",
        "setCommunicationModeOn",
        "on",
        "setMediaVolume",
        "volume",
        "",
        "Companion",
        "audio_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/discord/audio/AudioManagerModule$Companion;

.field public static final NAME:Ljava/lang/String; = "AudioManager"


# instance fields
.field public audioManager:Lcom/discord/audio/DiscordAudioManager;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/audio/AudioManagerModule$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/audio/AudioManagerModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/audio/AudioManagerModule;->Companion:Lcom/discord/audio/AudioManagerModule$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

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
    iput-object p1, p0, Lcom/discord/audio/AudioManagerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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

.method public final getActiveAudioDevice(Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "cb"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/discord/audio/DiscordAudioManager;->getActiveAudioDevice()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
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
.end method

.method public final getAudioDevices(Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "cb"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Lcom/discord/audio/AudioManagerModule;->Companion:Lcom/discord/audio/AudioManagerModule$Companion;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Lcom/discord/audio/DiscordAudioManager;->getAudioDevices()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v1, v2}, Lcom/discord/audio/AudioManagerModule$Companion;->access$convertDevices(Lcom/discord/audio/AudioManagerModule$Companion;Ljava/util/List;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v1}, Lcom/discord/react/utilities/NativeArrayExtensionsKt;->toNativeArray(Ljava/util/Collection;)Lcom/facebook/react/bridge/ReadableNativeArray;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 v2, 0x0

    .line 28
    aput-object v1, v0, v2

    .line 29
    .line 30
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 31
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
.end method

.method public final getAudioManager()Lcom/discord/audio/DiscordAudioManager;
    .locals 1

    iget-object v0, p0, Lcom/discord/audio/AudioManagerModule;->audioManager:Lcom/discord/audio/DiscordAudioManager;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "audioManager"

    invoke-static {v0}, Lkotlin/jvm/internal/q;->y(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMediaVolume(Lcom/facebook/react/bridge/Callback;)V
    .locals 3
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "cb"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    new-array v0, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/discord/audio/DiscordAudioManager;->getCurrentMediaVolume()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lcom/discord/audio/DiscordAudioManager;->getMaxMediaVolume()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    int-to-float v2, v2

    .line 27
    div-float/2addr v1, v2

    .line 28
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    aput-object v1, v0, v2

    .line 34
    .line 35
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
    .line 39
    .line 40
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "AudioManager"

    return-object v0
.end method

.method public initialize()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->initialize()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-class v1, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 15
    .line 16
    new-instance v1, Lcom/discord/audio/DiscordAudioManager;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/discord/audio/AudioManagerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 19
    .line 20
    new-instance v3, Lcom/discord/audio/AudioManagerModule$initialize$1;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Lcom/discord/audio/AudioManagerModule$initialize$1;-><init>(Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lcom/discord/audio/AudioManagerModule$initialize$2;

    .line 26
    .line 27
    invoke-direct {v4, v0}, Lcom/discord/audio/AudioManagerModule$initialize$2;-><init>(Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;)V

    .line 28
    .line 29
    .line 30
    new-instance v5, Lcom/discord/audio/AudioManagerModule$initialize$3;

    .line 31
    .line 32
    invoke-direct {v5, v0}, Lcom/discord/audio/AudioManagerModule$initialize$3;-><init>(Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/discord/audio/DiscordAudioManager;-><init>(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lcom/discord/audio/AudioManagerModule;->setAudioManager(Lcom/discord/audio/DiscordAudioManager;)V

    .line 39
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
.end method

.method public final makeEarpieceUnavailable()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager;->makeEarpieceUnavailable()V

    return-void
.end method

.method public final removeListeners(I)V
    .locals 0
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    return-void
.end method

.method public final resetEarpieceAvailability()V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/audio/DiscordAudioManager;->resetEarpieceAvailability()V

    return-void
.end method

.method public final setActiveAudioDevice(Ljava/lang/String;)Z
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    const-string v0, "device"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {p1}, Lcom/discord/audio/DiscordAudioManager$DeviceTypes;->valueOf(Ljava/lang/String;)Lcom/discord/audio/DiscordAudioManager$DeviceTypes;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lcom/discord/audio/DiscordAudioManager;->setDevice(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
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
.end method

.method public final setAudioManager(Lcom/discord/audio/DiscordAudioManager;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/discord/audio/AudioManagerModule;->audioManager:Lcom/discord/audio/DiscordAudioManager;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
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
.end method

.method public final setCommunicationModeOn(Z)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/discord/audio/DiscordAudioManager;->setCommunicationModeOn(Z)V

    return-void
.end method

.method public final setMediaVolume(F)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    invoke-virtual {p0}, Lcom/discord/audio/AudioManagerModule;->getAudioManager()Lcom/discord/audio/DiscordAudioManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/discord/audio/DiscordAudioManager;->setMediaVolume(F)V

    return-void
.end method