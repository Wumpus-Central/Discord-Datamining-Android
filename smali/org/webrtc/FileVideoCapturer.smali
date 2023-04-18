.class public Lorg/webrtc/FileVideoCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/FileVideoCapturer$VideoReaderY4M;,
        Lorg/webrtc/FileVideoCapturer$VideoReader;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FileVideoCapturer"


# instance fields
.field private capturerObserver:Lorg/webrtc/CapturerObserver;

.field private final tickTask:Ljava/util/TimerTask;

.field private final timer:Ljava/util/Timer;

.field private final videoReader:Lorg/webrtc/FileVideoCapturer$VideoReader;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/Timer;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lorg/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    .line 10
    .line 11
    new-instance v0, Lorg/webrtc/FileVideoCapturer$1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lorg/webrtc/FileVideoCapturer$1;-><init>(Lorg/webrtc/FileVideoCapturer;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lorg/webrtc/FileVideoCapturer;->tickTask:Ljava/util/TimerTask;

    .line 17
    .line 18
    :try_start_0
    new-instance v0, Lorg/webrtc/FileVideoCapturer$VideoReaderY4M;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lorg/webrtc/FileVideoCapturer$VideoReaderY4M;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lorg/webrtc/FileVideoCapturer;->videoReader:Lorg/webrtc/FileVideoCapturer$VideoReader;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception v0

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "Could not open video file: "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string v1, "FileVideoCapturer"

    .line 45
    .line 46
    invoke-static {v1, p1}, Lorg/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
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
.end method


# virtual methods
.method public changeCaptureFormat(III)V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/FileVideoCapturer;->videoReader:Lorg/webrtc/FileVideoCapturer$VideoReader;

    invoke-interface {v0}, Lorg/webrtc/FileVideoCapturer$VideoReader;->close()V

    return-void
.end method

.method public initialize(Lorg/webrtc/SurfaceTextureHelper;Landroid/content/Context;Lorg/webrtc/CapturerObserver;)V
    .locals 0

    iput-object p3, p0, Lorg/webrtc/FileVideoCapturer;->capturerObserver:Lorg/webrtc/CapturerObserver;

    return-void
.end method

.method public isScreencast()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public startCapture(III)V
    .locals 6

    iget-object v0, p0, Lorg/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    iget-object v1, p0, Lorg/webrtc/FileVideoCapturer;->tickTask:Ljava/util/TimerTask;

    const-wide/16 v2, 0x0

    const/16 p1, 0x3e8

    div-int/2addr p1, p3

    int-to-long v4, p1

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public stopCapture()V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/FileVideoCapturer;->timer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    return-void
.end method

.method public tick()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/webrtc/FileVideoCapturer;->videoReader:Lorg/webrtc/FileVideoCapturer$VideoReader;

    .line 2
    .line 3
    invoke-interface {v0}, Lorg/webrtc/FileVideoCapturer$VideoReader;->getNextFrame()Lorg/webrtc/VideoFrame;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lorg/webrtc/FileVideoCapturer;->capturerObserver:Lorg/webrtc/CapturerObserver;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lorg/webrtc/CapturerObserver;->onFrameCaptured(Lorg/webrtc/VideoFrame;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lorg/webrtc/VideoFrame;->release()V

    .line 13
    .line 14
    .line 15
    return-void
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
