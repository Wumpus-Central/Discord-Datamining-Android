.class public Lorg/webrtc/CameraVideoCapturer$CameraStatistics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/CameraVideoCapturer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CameraStatistics"
.end annotation


# static fields
.field private static final CAMERA_FREEZE_REPORT_TIMOUT_MS:I = 0xfa0

.field private static final CAMERA_OBSERVER_PERIOD_MS:I = 0x7d0

.field private static final TAG:Ljava/lang/String; = "CameraStatistics"


# instance fields
.field private final cameraObserver:Ljava/lang/Runnable;

.field private final eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;

.field private frameCount:I

.field private freezePeriodCount:I

.field private final surfaceTextureHelper:Lorg/webrtc/SurfaceTextureHelper;


# direct methods
.method public constructor <init>(Lorg/webrtc/SurfaceTextureHelper;Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lorg/webrtc/CameraVideoCapturer$CameraStatistics$1;-><init>(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->cameraObserver:Ljava/lang/Runnable;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->surfaceTextureHelper:Lorg/webrtc/SurfaceTextureHelper;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    iput p2, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->frameCount:I

    .line 19
    .line 20
    iput p2, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->freezePeriodCount:I

    .line 21
    .line 22
    invoke-virtual {p1}, Lorg/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-wide/16 v1, 0x7d0

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string p2, "SurfaceTextureHelper is null"

    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1
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
.end method

.method static synthetic access$000(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)I
    .locals 0

    iget p0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->frameCount:I

    return p0
.end method

.method static synthetic access$002(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;I)I
    .locals 0

    iput p1, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->frameCount:I

    return p1
.end method

.method static synthetic access$100(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)I
    .locals 0

    iget p0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->freezePeriodCount:I

    return p0
.end method

.method static synthetic access$102(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;I)I
    .locals 0

    iput p1, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->freezePeriodCount:I

    return p1
.end method

.method static synthetic access$104(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)I
    .locals 1

    iget v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->freezePeriodCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->freezePeriodCount:I

    return v0
.end method

.method static synthetic access$200(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->eventsHandler:Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;

    return-object p0
.end method

.method static synthetic access$300(Lorg/webrtc/CameraVideoCapturer$CameraStatistics;)Lorg/webrtc/SurfaceTextureHelper;
    .locals 0

    iget-object p0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->surfaceTextureHelper:Lorg/webrtc/SurfaceTextureHelper;

    return-object p0
.end method

.method private checkThread()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->surfaceTextureHelper:Lorg/webrtc/SurfaceTextureHelper;

    .line 6
    .line 7
    invoke-virtual {v1}, Lorg/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v1, "Wrong thread"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
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
.end method


# virtual methods
.method public addFrame()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->checkThread()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->frameCount:I

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->frameCount:I

    .line 9
    .line 10
    return-void
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
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->surfaceTextureHelper:Lorg/webrtc/SurfaceTextureHelper;

    invoke-virtual {v0}, Lorg/webrtc/SurfaceTextureHelper;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lorg/webrtc/CameraVideoCapturer$CameraStatistics;->cameraObserver:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
