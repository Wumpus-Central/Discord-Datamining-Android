.class public final Lcom/discord/native/engine/NativeEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/native/engine/NativeEngine$Companion;,
        Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;,
        Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;,
        Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;,
        Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;,
        Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;,
        Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;,
        Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;,
        Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;,
        Lcom/discord/native/engine/NativeEngine$GetSupportedVideoCodecsCallback;,
        Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;,
        Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;,
        Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;,
        Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;,
        Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;,
        Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0018\u0000 H2\u00020\u0001:\u0010HIJKLMNOPQRSTUVWB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086 J\u0006\u0010\u0010\u001a\u00020\u0011J\u0011\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0016H\u0086 J\u0011\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0018H\u0086 J\u0011\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0086 J\u0011\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001cH\u0086 J\u0011\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001eH\u0086 J\u0011\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020 H\u0086 J\u0011\u0010!\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\"H\u0086 J!\u0010#\u001a\u00020\u00082\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 J\t\u0010&\u001a\u00020\u0011H\u0082 J\u0019\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020)H\u0086 J\u0011\u0010*\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u0010+\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086 J\u0011\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000cH\u0086 J\u0011\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0005H\u0086 J\u0011\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u000201H\u0086 J\u0011\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u000201H\u0086 J\u0011\u00104\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u000205H\u0086 J\u0011\u00106\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u000207H\u0086 J\u0011\u00108\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u000209H\u0086 J\u0011\u0010:\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000cH\u0086 J\u0011\u0010;\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0005H\u0086 J\u0011\u0010<\u001a\u00020\u00112\u0006\u00100\u001a\u000201H\u0086 J\u0011\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u000cH\u0086 J\u0011\u0010?\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000cH\u0086 J\u0011\u0010@\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0005H\u0086 J\u001b\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010CH\u0086 J\u0019\u0010D\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020EH\u0086 J\u0011\u0010F\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020GH\u0086 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006X"
    }
    d2 = {
        "Lcom/discord/native/engine/NativeEngine;",
        "",
        "context",
        "Landroid/content/Context;",
        "logLevel",
        "",
        "(Landroid/content/Context;I)V",
        "nativeInstance",
        "",
        "createVoiceConnection",
        "Lcom/discord/native/engine/NativeConnection;",
        "userId",
        "",
        "connectionOptionsJSON",
        "callback",
        "Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;",
        "dispose",
        "",
        "enableBuiltInAEC",
        "enable",
        "",
        "getAudioSubsystem",
        "Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;",
        "getCodecCapabilities",
        "Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;",
        "getCodecSurvey",
        "Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;",
        "getInputDevices",
        "Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;",
        "getOutputDevices",
        "Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;",
        "getSupportedVideoCodecs",
        "Lcom/discord/native/engine/NativeEngine$GetSupportedVideoCodecsCallback;",
        "getVideoInputDevices",
        "Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;",
        "nativeCreateInstance",
        "eglContext",
        "Lorg/webrtc/EglBase$Context;",
        "nativeDestroyInstance",
        "rankRtcRegions",
        "regionsWithIpsJSON",
        "Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;",
        "setAudioInputEnabled",
        "setEmitVADLevel2",
        "setInputDevice",
        "deviceIndex",
        "setInputDeviceIndex",
        "setInputVolume",
        "volume",
        "",
        "setNoInputThreshold",
        "threshold",
        "setOnDeviceChangeCallback",
        "Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;",
        "setOnNoInputCallback",
        "Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;",
        "setOnVoiceCallback",
        "Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;",
        "setOutputDevice",
        "setOutputDeviceIndex",
        "setOutputVolume",
        "setTransportOptions",
        "optionsJSON",
        "setVideoInputDevice",
        "setVideoInputDeviceIndex",
        "setVideoOutputSink",
        "streamIdentifier",
        "Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;",
        "startLocalAudioRecording",
        "Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;",
        "stopLocalAudioRecording",
        "Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;",
        "Companion",
        "ConnectToServerCallback",
        "DeviceChangeCallback",
        "GetAudioInputDevicesCallback",
        "GetAudioOutputDevicesCallback",
        "GetAudioSubsystemCallback",
        "GetCodecCapabilitiesCallback",
        "GetCodecSurveyCallback",
        "GetRankedRtcRegionsCallback",
        "GetSupportedVideoCodecsCallback",
        "GetVideoInputDevicesCallback",
        "OnNoInputCallback",
        "OnVoiceCallback",
        "StartLocalAudioRecordingCallback",
        "StopLocalAudioRecordingCallback",
        "VideoFrameCallback",
        "android_release"
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
.field public static final Companion:Lcom/discord/native/engine/NativeEngine$Companion;

.field public static final LOGLEVEL_DEBUG:I = 0x1

.field public static final LOGLEVEL_DEFAULT:I = 0x2


# instance fields
.field private final logLevel:I

.field private final nativeInstance:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/native/engine/NativeEngine$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/native/engine/NativeEngine$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/native/engine/NativeEngine;->Companion:Lcom/discord/native/engine/NativeEngine$Companion;

    .line 8
    .line 9
    const-string v0, "discord"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p2, p0, Lcom/discord/native/engine/NativeEngine;->logLevel:I

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "context.applicationContext"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lco/discord/media_engine/CameraEnumeratorProvider;->maybeInit(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lco/discord/media_engine/SharedEglBaseContext;->getEglContext()Lorg/webrtc/EglBase$Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "getEglContext()"

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v0, p2}, Lcom/discord/native/engine/NativeEngine;->nativeCreateInstance(Landroid/content/Context;Lorg/webrtc/EglBase$Context;I)J

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    iput-wide p1, p0, Lcom/discord/native/engine/NativeEngine;->nativeInstance:J

    .line 44
    .line 45
    return-void
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
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
.end method

.method private final native nativeCreateInstance(Landroid/content/Context;Lorg/webrtc/EglBase$Context;I)J
.end method

.method private final native nativeDestroyInstance()V
.end method


# virtual methods
.method public final native createVoiceConnection(Ljava/lang/String;Ljava/lang/String;Lcom/discord/native/engine/NativeEngine$ConnectToServerCallback;)Lcom/discord/native/engine/NativeConnection;
.end method

.method public final dispose()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/native/engine/NativeEngine;->nativeDestroyInstance()V

    return-void
.end method

.method public final native enableBuiltInAEC(Z)V
.end method

.method public final native getAudioSubsystem(Lcom/discord/native/engine/NativeEngine$GetAudioSubsystemCallback;)V
.end method

.method public final native getCodecCapabilities(Lcom/discord/native/engine/NativeEngine$GetCodecCapabilitiesCallback;)V
.end method

.method public final native getCodecSurvey(Lcom/discord/native/engine/NativeEngine$GetCodecSurveyCallback;)V
.end method

.method public final native getInputDevices(Lcom/discord/native/engine/NativeEngine$GetAudioInputDevicesCallback;)V
.end method

.method public final native getOutputDevices(Lcom/discord/native/engine/NativeEngine$GetAudioOutputDevicesCallback;)V
.end method

.method public final native getSupportedVideoCodecs(Lcom/discord/native/engine/NativeEngine$GetSupportedVideoCodecsCallback;)V
.end method

.method public final native getVideoInputDevices(Lcom/discord/native/engine/NativeEngine$GetVideoInputDevicesCallback;)V
.end method

.method public final native rankRtcRegions(Ljava/lang/String;Lcom/discord/native/engine/NativeEngine$GetRankedRtcRegionsCallback;)V
.end method

.method public final native setAudioInputEnabled(Z)V
.end method

.method public final native setEmitVADLevel2(Z)V
.end method

.method public final native setInputDevice(Ljava/lang/String;)V
.end method

.method public final native setInputDeviceIndex(I)V
.end method

.method public final native setInputVolume(F)V
.end method

.method public final native setNoInputThreshold(F)V
.end method

.method public final native setOnDeviceChangeCallback(Lcom/discord/native/engine/NativeEngine$DeviceChangeCallback;)V
.end method

.method public final native setOnNoInputCallback(Lcom/discord/native/engine/NativeEngine$OnNoInputCallback;)V
.end method

.method public final native setOnVoiceCallback(Lcom/discord/native/engine/NativeEngine$OnVoiceCallback;)V
.end method

.method public final native setOutputDevice(Ljava/lang/String;)V
.end method

.method public final native setOutputDeviceIndex(I)V
.end method

.method public final native setOutputVolume(F)V
.end method

.method public final native setTransportOptions(Ljava/lang/String;)V
.end method

.method public final native setVideoInputDevice(Ljava/lang/String;)V
.end method

.method public final native setVideoInputDeviceIndex(I)V
.end method

.method public final native setVideoOutputSink(Ljava/lang/String;Lcom/discord/native/engine/NativeEngine$VideoFrameCallback;)V
.end method

.method public final native startLocalAudioRecording(Ljava/lang/String;Lcom/discord/native/engine/NativeEngine$StartLocalAudioRecordingCallback;)V
.end method

.method public final native stopLocalAudioRecording(Lcom/discord/native/engine/NativeEngine$StopLocalAudioRecordingCallback;)V
.end method
