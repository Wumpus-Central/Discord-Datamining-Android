.class public interface abstract Lorg/webrtc/CameraVideoCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/VideoCapturer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/CameraVideoCapturer$CameraStatistics;,
        Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;,
        Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;,
        Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;
    }
.end annotation


# virtual methods
.method public abstract addMediaRecorderToCamera(Landroid/media/MediaRecorder;Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract removeMediaRecorderFromCamera(Lorg/webrtc/CameraVideoCapturer$MediaRecorderHandler;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract switchCamera(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;)V
.end method

.method public abstract switchCamera(Lorg/webrtc/CameraVideoCapturer$CameraSwitchHandler;Ljava/lang/String;)V
.end method
