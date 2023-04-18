.class Lorg/webrtc/VideoSource$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/CapturerObserver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/VideoSource;


# direct methods
.method constructor <init>(Lorg/webrtc/VideoSource;)V
    .locals 0

    iput-object p1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapturerStarted(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$000(Lorg/webrtc/VideoSource;)Lorg/webrtc/NativeAndroidVideoTrackSource;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lorg/webrtc/NativeAndroidVideoTrackSource;->setState(Z)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 11
    .line 12
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$100(Lorg/webrtc/VideoSource;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 18
    .line 19
    invoke-static {v1, p1}, Lorg/webrtc/VideoSource;->access$202(Lorg/webrtc/VideoSource;Z)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 23
    .line 24
    invoke-static {v1}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 31
    .line 32
    invoke-static {v1}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1, p1}, Lorg/webrtc/CapturerObserver;->onCapturerStarted(Z)V

    .line 37
    .line 38
    .line 39
    :cond_0
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1
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
.end method

.method public onCapturerStopped()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$000(Lorg/webrtc/VideoSource;)Lorg/webrtc/NativeAndroidVideoTrackSource;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Lorg/webrtc/NativeAndroidVideoTrackSource;->setState(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 12
    .line 13
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$100(Lorg/webrtc/VideoSource;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 19
    .line 20
    invoke-static {v2, v1}, Lorg/webrtc/VideoSource;->access$202(Lorg/webrtc/VideoSource;Z)Z

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 24
    .line 25
    invoke-static {v1}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 32
    .line 33
    invoke-static {v1}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Lorg/webrtc/CapturerObserver;->onCapturerStopped()V

    .line 38
    .line 39
    .line 40
    :cond_0
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw v1
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

.method public onFrameCaptured(Lorg/webrtc/VideoFrame;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$000(Lorg/webrtc/VideoSource;)Lorg/webrtc/NativeAndroidVideoTrackSource;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lorg/webrtc/NativeAndroidVideoTrackSource;->adaptFrame(Lorg/webrtc/VideoFrame;)Lorg/webrtc/VideoProcessor$FrameAdaptationParameters;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 12
    .line 13
    invoke-static {v1}, Lorg/webrtc/VideoSource;->access$100(Lorg/webrtc/VideoSource;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v1

    .line 18
    :try_start_0
    iget-object v2, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 19
    .line 20
    invoke-static {v2}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 27
    .line 28
    invoke-static {v2}, Lorg/webrtc/VideoSource;->access$300(Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoProcessor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2, p1, v0}, Lorg/webrtc/VideoProcessor;->onFrameCaptured(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoProcessor$FrameAdaptationParameters;)V

    .line 33
    .line 34
    .line 35
    monitor-exit v1

    .line 36
    return-void

    .line 37
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-static {p1, v0}, Lorg/webrtc/q0;->b(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoProcessor$FrameAdaptationParameters;)Lorg/webrtc/VideoFrame;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lorg/webrtc/VideoSource$1;->this$0:Lorg/webrtc/VideoSource;

    .line 45
    .line 46
    invoke-static {v0}, Lorg/webrtc/VideoSource;->access$000(Lorg/webrtc/VideoSource;)Lorg/webrtc/NativeAndroidVideoTrackSource;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0, p1}, Lorg/webrtc/NativeAndroidVideoTrackSource;->onFrameCaptured(Lorg/webrtc/VideoFrame;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lorg/webrtc/VideoFrame;->release()V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
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
