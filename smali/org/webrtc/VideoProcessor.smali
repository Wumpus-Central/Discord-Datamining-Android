.class public interface abstract Lorg/webrtc/VideoProcessor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/CapturerObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/VideoProcessor$FrameAdaptationParameters;
    }
.end annotation


# virtual methods
.method public abstract onFrameCaptured(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoProcessor$FrameAdaptationParameters;)V
.end method

.method public abstract setSink(Lorg/webrtc/VideoSink;)V
    .param p1    # Lorg/webrtc/VideoSink;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
.end method
