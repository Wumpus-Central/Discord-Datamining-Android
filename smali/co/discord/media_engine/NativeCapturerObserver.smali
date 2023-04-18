.class public final Lco/discord/media_engine/NativeCapturerObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/CapturerObserver;


# instance fields
.field private nativeHandle_:J

.field private startCaptureOnReconfigure_:Z

.field private surfaceTextureHelper_:Lorg/webrtc/SurfaceTextureHelper;

.field private videoCapturer_:Lorg/webrtc/VideoCapturer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "discord"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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

.method public constructor <init>(JLandroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p4}, Lco/discord/media_engine/CameraEnumeratorProvider;->createCapturer(Ljava/lang/String;)Lorg/webrtc/CameraVideoCapturer;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Lco/discord/media_engine/NativeCapturerObserver;-><init>(JLandroid/content/Context;Lorg/webrtc/VideoCapturer;)V

    return-void
.end method

.method public constructor <init>(JLandroid/content/Context;Lorg/webrtc/VideoCapturer;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "DiscordTextureCapture"

    .line 3
    invoke-static {}, Lco/discord/media_engine/SharedEglBaseContext;->getEglContext()Lorg/webrtc/EglBase$Context;

    move-result-object v1

    invoke-static {v0, v1}, Lorg/webrtc/SurfaceTextureHelper;->create(Ljava/lang/String;Lorg/webrtc/EglBase$Context;)Lorg/webrtc/SurfaceTextureHelper;

    move-result-object v0

    iput-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->surfaceTextureHelper_:Lorg/webrtc/SurfaceTextureHelper;

    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->startCaptureOnReconfigure_:Z

    .line 5
    iput-wide p1, p0, Lco/discord/media_engine/NativeCapturerObserver;->nativeHandle_:J

    .line 6
    iput-object p4, p0, Lco/discord/media_engine/NativeCapturerObserver;->videoCapturer_:Lorg/webrtc/VideoCapturer;

    .line 7
    invoke-interface {p4, v0, p3, p0}, Lorg/webrtc/VideoCapturer;->initialize(Lorg/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lorg/webrtc/CapturerObserver;)V

    return-void
.end method

.method private native nativeOnFrame(JLorg/webrtc/VideoFrame$Buffer;IIIJ)V
.end method


# virtual methods
.method public declared-synchronized dispose()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->videoCapturer_:Lorg/webrtc/VideoCapturer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-interface {v0}, Lorg/webrtc/VideoCapturer;->stopCapture()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    :try_start_2
    iget-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->videoCapturer_:Lorg/webrtc/VideoCapturer;

    .line 11
    .line 12
    invoke-interface {v0}, Lorg/webrtc/VideoCapturer;->dispose()V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->videoCapturer_:Lorg/webrtc/VideoCapturer;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    move-exception v0

    .line 19
    new-instance v1, Ljava/lang/RuntimeException;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :cond_0
    :goto_0
    iget-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->surfaceTextureHelper_:Lorg/webrtc/SurfaceTextureHelper;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Lorg/webrtc/SurfaceTextureHelper;->dispose()V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->surfaceTextureHelper_:Lorg/webrtc/SurfaceTextureHelper;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    monitor-exit p0

    .line 38
    throw v0
    .line 39
    .line 40
.end method

.method public onCapturerStarted(Z)V
    .locals 0

    return-void
.end method

.method public onCapturerStopped()V
    .locals 0

    return-void
.end method

.method public onFrameCaptured(Lorg/webrtc/VideoFrame;)V
    .locals 9

    iget-wide v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->nativeHandle_:J

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getBuffer()Lorg/webrtc/VideoFrame$Buffer;

    move-result-object v3

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedWidth()I

    move-result v4

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotatedHeight()I

    move-result v5

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getRotation()I

    move-result v6

    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->getTimestampNs()J

    move-result-wide v7

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/discord/media_engine/NativeCapturerObserver;->nativeOnFrame(JLorg/webrtc/VideoFrame$Buffer;IIIJ)V

    return-void
.end method

.method public declared-synchronized reconfigure(III)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->videoCapturer_:Lorg/webrtc/VideoCapturer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-boolean v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->startCaptureOnReconfigure_:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, Lco/discord/media_engine/NativeCapturerObserver;->startCaptureOnReconfigure_:Z

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3}, Lorg/webrtc/VideoCapturer;->startCapture(III)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {v0, p1, p2, p3}, Lorg/webrtc/VideoCapturer;->changeCaptureFormat(III)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    :goto_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0

    .line 26
    throw p1
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
.end method

.method public repeatLastFrame()V
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/NativeCapturerObserver;->surfaceTextureHelper_:Lorg/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lorg/webrtc/SurfaceTextureHelper;->forceFrame()V

    return-void
.end method
