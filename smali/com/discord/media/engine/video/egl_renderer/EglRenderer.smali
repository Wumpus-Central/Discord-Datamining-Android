.class public Lcom/discord/media/engine/video/egl_renderer/EglRenderer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoSink;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;,
        Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0010\u0018\u0000 O2\u00020\u0001:\u0002OPB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u000e\u0010-\u001a\u00020.2\u0006\u00101\u001a\u000202J\u0010\u00103\u001a\u00020.2\u0006\u00101\u001a\u00020\u0010H\u0002J\u0006\u00104\u001a\u00020.J\u0006\u00105\u001a\u00020.J\u0010\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u0003H\u0002J\u0018\u00108\u001a\u00020.2\u0006\u00107\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H\u0002J\u0008\u0010;\u001a\u00020.H\u0002J\u0008\u0010<\u001a\u00020\u001dH\u0002J\u0010\u0010=\u001a\u00020.2\u0006\u0010>\u001a\u00020&H\u0016J\u0006\u0010?\u001a\u00020.J\u0010\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020\u001dH\u0002J\u0006\u0010B\u001a\u00020.J\u0014\u0010C\u001a\u00020.2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020.0EJ\u0008\u0010F\u001a\u00020.H\u0002J\u0012\u0010G\u001a\u00020.2\u0008\u0008\u0002\u0010H\u001a\u00020\u001fH\u0002J\u0010\u0010I\u001a\u00020.2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020\u001aJ\u000e\u0010L\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020!R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\u000cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u000e\u0010$\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/discord/media/engine/video/egl_renderer/EglRenderer;",
        "Lorg/webrtc/VideoSink;",
        "name",
        "",
        "(Ljava/lang/String;)V",
        "drawMatrix",
        "Landroid/graphics/Matrix;",
        "drawer",
        "Lorg/webrtc/RendererCommon$GlDrawer;",
        "eglBase",
        "Lorg/webrtc/EglBase;",
        "eglSurfaceCreationRunnable",
        "Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;",
        "errorCallback",
        "Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;",
        "fpsReductionLock",
        "",
        "frameDrawer",
        "Lorg/webrtc/VideoFrameDrawer;",
        "frameLock",
        "framesDropped",
        "",
        "framesReceived",
        "framesRendered",
        "handlerLock",
        "layoutAspectRatio",
        "",
        "layoutLock",
        "logStatisticsRunnable",
        "Ljava/lang/Runnable;",
        "minRenderPeriodNs",
        "",
        "mirrorHorizontally",
        "",
        "getName",
        "()Ljava/lang/String;",
        "nextFrameTimeNs",
        "pendingFrame",
        "Lorg/webrtc/VideoFrame;",
        "renderSwapBufferTimeNs",
        "renderThreadHandler",
        "Landroid/os/Handler;",
        "renderTimeNs",
        "statisticsLock",
        "statisticsStartTimeNs",
        "createEglSurface",
        "",
        "surfaceTexture",
        "Landroid/graphics/SurfaceTexture;",
        "surface",
        "Landroid/view/Surface;",
        "createEglSurfaceInternal",
        "disableFpsReduction",
        "init",
        "logD",
        "string",
        "logE",
        "e",
        "",
        "logStatistics",
        "logStatisticsTask",
        "onFrame",
        "frame",
        "pauseVideo",
        "postToRenderThread",
        "runnable",
        "release",
        "releaseEglSurface",
        "completionCallback",
        "Lkotlin/Function0;",
        "renderFrameOnRenderThread",
        "resetStatistics",
        "currentTimeNs",
        "setErrorCallback",
        "setFpsReduction",
        "fps",
        "setLayoutAspectRatio",
        "setMirror",
        "mirror",
        "Companion",
        "EglSurfaceCreation",
        "media_engine_release"
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
.field public static final Companion:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;

.field private static final LOG_INTERVAL_MS:J = 0xfa0L

.field private static final TAG:Ljava/lang/String; = "EglRenderer"

.field private static final USE_PRESENTATION_TIMESTAMP:Z = false


# instance fields
.field private final drawMatrix:Landroid/graphics/Matrix;

.field private final drawer:Lorg/webrtc/RendererCommon$GlDrawer;

.field private eglBase:Lorg/webrtc/EglBase;

.field private final eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

.field private volatile errorCallback:Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;

.field private final fpsReductionLock:Ljava/lang/Object;

.field private final frameDrawer:Lorg/webrtc/VideoFrameDrawer;

.field private final frameLock:Ljava/lang/Object;

.field private framesDropped:I

.field private framesReceived:I

.field private framesRendered:I

.field private final handlerLock:Ljava/lang/Object;

.field private layoutAspectRatio:F

.field private final layoutLock:Ljava/lang/Object;

.field private final logStatisticsRunnable:Ljava/lang/Runnable;

.field private minRenderPeriodNs:J

.field private mirrorHorizontally:Z

.field private final name:Ljava/lang/String;

.field private nextFrameTimeNs:J

.field private pendingFrame:Lorg/webrtc/VideoFrame;

.field private renderSwapBufferTimeNs:J

.field private renderThreadHandler:Landroid/os/Handler;

.field private renderTimeNs:J

.field private final statisticsLock:Ljava/lang/Object;

.field private statisticsStartTimeNs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->Companion:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

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
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->fpsReductionLock:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance p1, Lorg/webrtc/VideoFrameDrawer;

    .line 26
    .line 27
    invoke-direct {p1}, Lorg/webrtc/VideoFrameDrawer;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameDrawer:Lorg/webrtc/VideoFrameDrawer;

    .line 31
    .line 32
    new-instance p1, Lorg/webrtc/GlRectDrawer;

    .line 33
    .line 34
    invoke-direct {p1}, Lorg/webrtc/GlRectDrawer;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawer:Lorg/webrtc/RendererCommon$GlDrawer;

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Matrix;

    .line 40
    .line 41
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    .line 45
    .line 46
    new-instance p1, Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameLock:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance p1, Ljava/lang/Object;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutLock:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance p1, Ljava/lang/Object;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    .line 66
    .line 67
    new-instance p1, Lcom/discord/media/engine/video/egl_renderer/f;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Lcom/discord/media/engine/video/egl_renderer/f;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsRunnable:Ljava/lang/Runnable;

    .line 73
    .line 74
    new-instance p1, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 80
    .line 81
    return-void
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
.end method

.method public static synthetic a(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->release$lambda$13$lambda$12(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V

    return-void
.end method

.method public static final synthetic access$getEglBase$p(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)Lorg/webrtc/EglBase;
    .locals 0

    iget-object p0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    return-object p0
.end method

.method public static final synthetic access$getHandlerLock$p(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic access$setRenderThreadHandler$p(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic b(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsRunnable$lambda$2(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    return-void
.end method

.method public static synthetic c(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->release$lambda$13$lambda$11(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method private final createEglSurfaceInternal(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;->setSurface(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->postToRenderThread(Ljava/lang/Runnable;)V

    .line 9
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
.end method

.method public static synthetic d(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 0

    invoke-static {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->onFrame$lambda$25$lambda$24$lambda$23(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    return-void
.end method

.method public static synthetic e(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->releaseEglSurface$lambda$30$lambda$29$lambda$28(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic f(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->init$lambda$8$lambda$7(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V

    return-void
.end method

.method private static final init$lambda$8$lambda$7(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "Creating EglBase"

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lco/discord/media_engine/SharedEglBaseContext;->getEglContext()Lorg/webrtc/EglBase$Context;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object p2, Lorg/webrtc/EglBase;->CONFIG_PLAIN:[I

    .line 16
    .line 17
    invoke-static {p1, p2}, Lorg/webrtc/EglHelper;->create(Lorg/webrtc/EglBase$Context;[I)Lorg/webrtc/EglBase;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    .line 22
    .line 23
    sget-object p0, Lcom/discord/media/engine/types/Debug;->INSTANCE:Lcom/discord/media/engine/types/Debug;

    .line 24
    .line 25
    return-void
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

.method private final logD(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final logE(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "name: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lorg/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private final logStatistics()V
    .locals 14

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    .line 2
    .line 3
    const-string v1, "#.0"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v3

    .line 15
    :try_start_0
    iget-wide v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsStartTimeNs:J

    .line 16
    .line 17
    sub-long v4, v1, v4

    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    cmp-long v6, v4, v6

    .line 22
    .line 23
    if-lez v6, :cond_1

    .line 24
    .line 25
    iget-wide v6, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->minRenderPeriodNs:J

    .line 26
    .line 27
    const-wide v8, 0x7fffffffffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v6, v6, v8

    .line 33
    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    iget v6, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesReceived:I

    .line 37
    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_0
    iget v6, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 43
    .line 44
    int-to-long v6, v6

    .line 45
    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 46
    .line 47
    const-wide/16 v9, 0x1

    .line 48
    .line 49
    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    mul-long/2addr v6, v8

    .line 54
    long-to-float v6, v6

    .line 55
    long-to-float v7, v4

    .line 56
    div-float/2addr v6, v7

    .line 57
    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-virtual {v7, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    iget v7, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesReceived:I

    .line 64
    .line 65
    iget v8, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesDropped:I

    .line 66
    .line 67
    iget v9, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 68
    .line 69
    float-to-double v10, v6

    .line 70
    invoke-virtual {v0, v10, v11}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sget-object v6, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->Companion:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;

    .line 75
    .line 76
    iget-wide v10, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderTimeNs:J

    .line 77
    .line 78
    iget v12, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 79
    .line 80
    invoke-static {v6, v10, v11, v12}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;->access$averageTimeAsString(Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    iget-wide v11, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderSwapBufferTimeNs:J

    .line 85
    .line 86
    iget v13, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 87
    .line 88
    invoke-static {v6, v11, v12, v13}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;->access$averageTimeAsString(Lcom/discord/media/engine/video/egl_renderer/EglRenderer$Companion;JI)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    new-instance v11, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v12, "[logStatistics] Duration: "

    .line 98
    .line 99
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v4, " ms. Frames received: "

    .line 106
    .line 107
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v4, ". Dropped: "

    .line 114
    .line 115
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string v4, ". Rendered: "

    .line 122
    .line 123
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v4, ". Render fps: "

    .line 130
    .line 131
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string v0, ". Average render time: "

    .line 138
    .line 139
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v0, ". Average swapBuffer time: "

    .line 146
    .line 147
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v0, "."

    .line 154
    .line 155
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {p0, v1, v2}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->resetStatistics(J)V

    .line 166
    .line 167
    .line 168
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    .line 170
    monitor-exit v3

    .line 171
    return-void

    .line 172
    :cond_1
    :goto_0
    monitor-exit v3

    .line 173
    return-void

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    monitor-exit v3

    .line 176
    throw v0
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
.end method

.method private static final logStatisticsRunnable$lambda$2(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatistics()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-direct {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsTask()Ljava/lang/Runnable;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsTask()Ljava/lang/Runnable;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-wide/16 v2, 0xfa0

    .line 28
    .line 29
    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    monitor-exit v0

    .line 38
    throw p0
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
.end method

.method private final logStatisticsTask()Ljava/lang/Runnable;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsRunnable:Ljava/lang/Runnable;

    return-object v0
.end method

.method private static final onFrame$lambda$25$lambda$24$lambda$23(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderFrameOnRenderThread()V

    .line 7
    .line 8
    .line 9
    return-void
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
.end method

.method private final postToRenderThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :cond_0
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0

    .line 15
    throw p1
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
.end method

.method private static final release$lambda$13$lambda$11(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$eglCleanupBarrier"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lorg/webrtc/EglBase;->lock:Ljava/lang/Object;

    .line 12
    .line 13
    const-string v1, "lock"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    monitor-enter v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :try_start_0
    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawer:Lorg/webrtc/RendererCommon$GlDrawer;

    .line 27
    .line 28
    invoke-interface {v0}, Lorg/webrtc/RendererCommon$GlDrawer;->release()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameDrawer:Lorg/webrtc/VideoFrameDrawer;

    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/webrtc/VideoFrameDrawer;->release()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    const-string v1, "eglBase detach and release."

    .line 41
    .line 42
    invoke-direct {p0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0}, Lorg/webrtc/EglBase;->detachCurrent()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Lorg/webrtc/EglBase;->release()V

    .line 49
    .line 50
    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    iput-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    monitor-exit v0

    .line 60
    throw p0
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

.method private static final release$lambda$13$lambda$12(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$renderLooper"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "Quitting render thread."

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/os/Looper;->quit()V

    .line 17
    .line 18
    .line 19
    return-void
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

.method private static final releaseEglSurface$lambda$30$lambda$29$lambda$28(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$completionCallback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lorg/webrtc/EglBase;->detachCurrent()V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0}, Lorg/webrtc/EglBase;->releaseSurface()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 22
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

.method private final renderFrameOnRenderThread()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameLock:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget-object v9, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;

    if-eqz v9, :cond_b

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 3
    monitor-exit v0

    .line 4
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglBase:Lorg/webrtc/EglBase;

    if-eqz v0, :cond_a

    .line 5
    invoke-interface {v0}, Lorg/webrtc/EglBase;->hasSurface()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_8

    .line 6
    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v10

    .line 7
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->fpsReductionLock:Ljava/lang/Object;

    monitor-enter v1

    .line 8
    :try_start_1
    iget-wide v2, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->minRenderPeriodNs:J

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    const/4 v5, 0x0

    const/4 v12, 0x1

    if-gtz v4, :cond_1

    :goto_0
    move v2, v12

    goto :goto_2

    :cond_1
    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v2, v6

    if-nez v4, :cond_2

    :goto_1
    move v2, v5

    goto :goto_2

    .line 9
    :cond_2
    iget-wide v6, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->nextFrameTimeNs:J

    cmp-long v4, v10, v6

    if-gez v4, :cond_3

    const-string v2, "Skipping frame rendering - fps reduction is active."

    .line 10
    invoke-direct {p0, v2}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    add-long/2addr v6, v2

    .line 11
    iput-wide v6, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->nextFrameTimeNs:J

    .line 12
    invoke-static {v6, v7, v10, v11}, Lcg/h;->d(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->nextFrameTimeNs:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    goto :goto_0

    .line 13
    :goto_2
    monitor-exit v1

    .line 14
    invoke-static {v9}, Lcom/discord/media/engine/video/egl_renderer/WebRtcExtensionsKt;->getRotatedAspectRatio(Lorg/webrtc/VideoFrame;)F

    move-result v1

    .line 15
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutLock:Ljava/lang/Object;

    monitor-enter v3

    .line 16
    :try_start_2
    iget v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutAspectRatio:F
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/4 v6, 0x0

    cmpg-float v7, v4, v6

    if-nez v7, :cond_4

    move v5, v12

    :cond_4
    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    move v4, v1

    .line 17
    :goto_3
    monitor-exit v3

    cmpl-float v3, v1, v4

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_6

    div-float/2addr v4, v1

    move v1, v5

    goto :goto_4

    :cond_6
    div-float/2addr v1, v4

    move v4, v5

    .line 18
    :goto_4
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 19
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-virtual {v3, v7, v7}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 20
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    iget-boolean v7, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->mirrorHorizontally:Z

    if-eqz v7, :cond_7

    const/high16 v7, -0x40800000    # -1.0f

    goto :goto_5

    :cond_7
    move v7, v5

    :goto_5
    invoke-virtual {v3, v7, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 21
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v3, v4, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 22
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    const/high16 v3, -0x41000000    # -0.5f

    invoke-virtual {v1, v3, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    if-eqz v2, :cond_9

    .line 23
    :try_start_3
    invoke-static {v6, v6, v6, v6}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v1, 0x4000

    .line 24
    invoke-static {v1}, Landroid/opengl/GLES20;->glClear(I)V

    .line 25
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameDrawer:Lorg/webrtc/VideoFrameDrawer;

    .line 26
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawer:Lorg/webrtc/RendererCommon$GlDrawer;

    .line 27
    iget-object v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawMatrix:Landroid/graphics/Matrix;

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 28
    invoke-interface {v0}, Lorg/webrtc/EglBase;->surfaceWidth()I

    move-result v7

    .line 29
    invoke-interface {v0}, Lorg/webrtc/EglBase;->surfaceHeight()I

    move-result v8

    move-object v2, v9

    .line 30
    invoke-virtual/range {v1 .. v8}, Lorg/webrtc/VideoFrameDrawer;->drawFrame(Lorg/webrtc/VideoFrame;Lorg/webrtc/RendererCommon$GlDrawer;Landroid/graphics/Matrix;IIII)V

    .line 31
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    .line 32
    invoke-interface {v0}, Lorg/webrtc/EglBase;->swapBuffers()V

    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 34
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_3
    .catch Lorg/webrtc/GlUtil$GlOutOfMemoryException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 35
    :try_start_4
    iget v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    add-int/2addr v5, v12

    iput v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 36
    iget-wide v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderTimeNs:J

    sub-long v7, v3, v10

    add-long/2addr v5, v7

    iput-wide v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderTimeNs:J

    .line 37
    iget-wide v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderSwapBufferTimeNs:J

    sub-long/2addr v3, v1

    add-long/2addr v5, v3

    iput-wide v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderSwapBufferTimeNs:J

    .line 38
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 39
    :try_start_5
    monitor-exit v0

    goto :goto_7

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_5
    .catch Lorg/webrtc/GlUtil$GlOutOfMemoryException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_6
    const-string v1, "Error while drawing frame"

    .line 40
    invoke-direct {p0, v1, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logE(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->errorCallback:Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;

    if-eqz v0, :cond_8

    .line 42
    invoke-interface {v0}, Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;->onGlOutOfMemory()V

    .line 43
    :cond_8
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->drawer:Lorg/webrtc/RendererCommon$GlDrawer;

    invoke-interface {v0}, Lorg/webrtc/RendererCommon$GlDrawer;->release()V

    .line 44
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameDrawer:Lorg/webrtc/VideoFrameDrawer;

    invoke-virtual {v0}, Lorg/webrtc/VideoFrameDrawer;->release()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_7

    .line 45
    :goto_6
    invoke-virtual {v9}, Lorg/webrtc/VideoFrame;->release()V

    throw v0

    :cond_9
    :goto_7
    invoke-virtual {v9}, Lorg/webrtc/VideoFrame;->release()V

    return-void

    :catchall_2
    move-exception v0

    .line 46
    monitor-exit v3

    throw v0

    :catchall_3
    move-exception v0

    .line 47
    monitor-exit v1

    throw v0

    :cond_a
    :goto_8
    const-string v0, "Dropping frame - No surface"

    .line 48
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v9}, Lorg/webrtc/VideoFrame;->release()V

    return-void

    .line 50
    :cond_b
    monitor-exit v0

    return-void

    :catchall_4
    move-exception v1

    .line 51
    monitor-exit v0

    throw v1
.end method

.method private final resetStatistics(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-wide p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsStartTimeNs:J

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesReceived:I

    .line 8
    .line 9
    iput p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesDropped:I

    .line 10
    .line 11
    iput p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesRendered:I

    .line 12
    .line 13
    const-wide/16 p1, 0x0

    .line 14
    .line 15
    iput-wide p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderTimeNs:J

    .line 16
    .line 17
    iput-wide p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderSwapBufferTimeNs:J

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    monitor-exit v0

    .line 25
    throw p1
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
.end method

.method static synthetic resetStatistics$default(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;JILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->resetStatistics(J)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: resetStatistics"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final createEglSurface(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    const-string v0, "surfaceTexture"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->createEglSurfaceInternal(Ljava/lang/Object;)V

    return-void
.end method

.method public final createEglSurface(Landroid/view/Surface;)V
    .locals 1

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->createEglSurfaceInternal(Ljava/lang/Object;)V

    return-void
.end method

.method public final disableFpsReduction()V
    .locals 1

    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-virtual {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->setFpsReduction(F)V

    return-void
.end method

.method protected final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final init()V
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v2

    .line 8
    :try_start_0
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    move v3, v4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-eqz v3, :cond_1

    .line 17
    .line 18
    const-string v3, "Initializing EglRenderer"

    .line 19
    .line 20
    invoke-direct {p0, v3}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v3, Landroid/os/HandlerThread;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v6, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v5, "EglRenderer"

    .line 36
    .line 37
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-direct {v3, v5}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 48
    .line 49
    .line 50
    new-instance v5, Lcom/discord/media/engine/video/egl_renderer/HandlerWithExceptionCallback;

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    const-string v6, "renderThread.looper"

    .line 57
    .line 58
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;

    .line 62
    .line 63
    invoke-direct {v6, p0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$init$1$handler$1;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {v5, v3, v6}, Lcom/discord/media/engine/video/egl_renderer/HandlerWithExceptionCallback;-><init>(Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    iput-object v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 70
    .line 71
    sget-object v3, Lcom/discord/media/engine/types/Debug;->INSTANCE:Lcom/discord/media/engine/types/Debug;

    .line 72
    .line 73
    new-instance v3, Lcom/discord/media/engine/video/egl_renderer/c;

    .line 74
    .line 75
    invoke-direct {v3, p0, v0, v1}, Lcom/discord/media/engine/video/egl_renderer/c;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;J)V

    .line 76
    .line 77
    .line 78
    invoke-static {v5, v3}, Lorg/webrtc/ThreadUtils;->invokeAtFrontUninterruptibly(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 82
    .line 83
    invoke-virtual {v5, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    const-wide/16 v0, 0x0

    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static {p0, v0, v1, v4, v3}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->resetStatistics$default(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;JILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsRunnable:Ljava/lang/Runnable;

    .line 93
    .line 94
    const-wide/16 v3, 0xfa0

    .line 95
    .line 96
    invoke-virtual {v5, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    .line 98
    .line 99
    monitor-exit v2

    .line 100
    return-void

    .line 101
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->name:Ljava/lang/String;

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, ": already initialized"

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    monitor-exit v2

    .line 132
    throw v0
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

.method public onFrame(Lorg/webrtc/VideoFrame;)V
    .locals 5

    .line 1
    const-string v0, "frame"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesReceived:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    add-int/2addr v1, v2

    .line 13
    iput v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesReceived:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_1
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string p1, "Dropping frame - Not initialized or already released."

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :cond_0
    :try_start_2
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameLock:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 33
    :try_start_3
    iget-object v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-virtual {v4}, Lorg/webrtc/VideoFrame;->release()V

    .line 38
    .line 39
    .line 40
    move v4, v2

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v4, 0x0

    .line 43
    :goto_0
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->retain()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;

    .line 47
    .line 48
    new-instance p1, Lcom/discord/media/engine/video/egl_renderer/e;

    .line 49
    .line 50
    invoke-direct {p1, p0}, Lcom/discord/media/engine/video/egl_renderer/e;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    .line 55
    .line 56
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 57
    monitor-exit v0

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->statisticsLock:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter p1

    .line 63
    :try_start_5
    iget v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesDropped:I

    .line 64
    .line 65
    add-int/2addr v0, v2

    .line 66
    iput v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->framesDropped:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 67
    .line 68
    monitor-exit p1

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    monitor-exit p1

    .line 72
    throw v0

    .line 73
    :cond_2
    :goto_1
    return-void

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    :try_start_6
    monitor-exit v3

    .line 76
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 77
    :catchall_2
    move-exception p1

    .line 78
    monitor-exit v0

    .line 79
    throw p1

    .line 80
    :catchall_3
    move-exception p1

    .line 81
    monitor-exit v0

    .line 82
    throw p1
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
.end method

.method public final pauseVideo()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->setFpsReduction(F)V

    return-void
.end method

.method public final release()V
    .locals 7

    .line 1
    const-string v0, "Releasing."

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v3

    .line 19
    :try_start_0
    iget-object v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    const-string v0, "Already released"

    .line 24
    .line 25
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    .line 28
    monitor-exit v3

    .line 29
    return-void

    .line 30
    :cond_0
    :try_start_1
    iget-object v5, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logStatisticsRunnable:Ljava/lang/Runnable;

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    new-instance v5, Lcom/discord/media/engine/video/egl_renderer/a;

    .line 36
    .line 37
    invoke-direct {v5, p0, v2}, Lcom/discord/media/engine/video/egl_renderer/a;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Ljava/util/concurrent/CountDownLatch;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const-string v6, "handler.looper"

    .line 48
    .line 49
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v6, Lcom/discord/media/engine/video/egl_renderer/b;

    .line 53
    .line 54
    invoke-direct {v6, p0, v5}, Lcom/discord/media/engine/video/egl_renderer/b;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    const/4 v4, 0x0

    .line 61
    iput-object v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 62
    .line 63
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    .line 65
    monitor-exit v3

    .line 66
    invoke-static {v2}, Lorg/webrtc/ThreadUtils;->awaitUninterruptibly(Ljava/util/concurrent/CountDownLatch;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->frameLock:Ljava/lang/Object;

    .line 70
    .line 71
    monitor-enter v2

    .line 72
    :try_start_2
    iget-object v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-virtual {v3}, Lorg/webrtc/VideoFrame;->release()V

    .line 77
    .line 78
    .line 79
    :cond_1
    iput-object v4, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->pendingFrame:Lorg/webrtc/VideoFrame;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 80
    .line 81
    monitor-exit v2

    .line 82
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    sub-long/2addr v3, v0

    .line 89
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v3, "release done: "

    .line 99
    .line 100
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v0, " ms"

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    monitor-exit v2

    .line 121
    throw v0

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    monitor-exit v3

    .line 124
    throw v0
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

.method public final releaseEglSurface(Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "completionCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;->setSurface(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->handlerLock:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->renderThreadHandler:Landroid/os/Handler;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->eglSurfaceCreationRunnable:Lcom/discord/media/engine/video/egl_renderer/EglRenderer$EglSurfaceCreation;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    new-instance v2, Lcom/discord/media/engine/video/egl_renderer/d;

    .line 25
    .line 26
    invoke-direct {v2, p0, p1}, Lcom/discord/media/engine/video/egl_renderer/d;-><init>(Lcom/discord/media/engine/video/egl_renderer/EglRenderer;Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_0
    monitor-exit v0

    .line 35
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    monitor-exit v0

    .line 41
    throw p1
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
.end method

.method public final setErrorCallback(Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->errorCallback:Lcom/discord/media/engine/video/egl_renderer/ErrorCallback;

    return-void
.end method

.method public final setFpsReduction(F)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setFpsReduction: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->fpsReductionLock:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-wide v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->minRenderPeriodNs:J

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    cmpg-float v3, p1, v3

    .line 28
    .line 29
    if-gtz v3, :cond_0

    .line 30
    .line 31
    const-wide v3, 0x7fffffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38
    .line 39
    const-wide/16 v4, 0x1

    .line 40
    .line 41
    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v3

    .line 45
    long-to-float v3, v3

    .line 46
    div-float/2addr v3, p1

    .line 47
    float-to-long v3, v3

    .line 48
    :goto_0
    iput-wide v3, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->minRenderPeriodNs:J

    .line 49
    .line 50
    cmp-long p1, v3, v1

    .line 51
    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    iput-wide v1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->nextFrameTimeNs:J

    .line 59
    .line 60
    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    monitor-exit v0

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    monitor-exit v0

    .line 66
    throw p1
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
.end method

.method public final setLayoutAspectRatio(F)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setLayoutAspectRatio: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutLock:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v1, 0x0

    .line 39
    :goto_0
    if-eqz v1, :cond_1

    .line 40
    .line 41
    iput p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutAspectRatio:F

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 p1, 0x0

    .line 45
    iput p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutAspectRatio:F

    .line 46
    .line 47
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    monitor-exit v0

    .line 53
    throw p1
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
.end method

.method public final setMirror(Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "setMirrorHorizontally: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->logD(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->layoutLock:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iput-boolean p1, p0, Lcom/discord/media/engine/video/egl_renderer/EglRenderer;->mirrorHorizontally:Z

    .line 25
    .line 26
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    monitor-exit v0

    .line 32
    throw p1
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
.end method
