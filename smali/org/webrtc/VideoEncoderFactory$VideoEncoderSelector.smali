.class public interface abstract Lorg/webrtc/VideoEncoderFactory$VideoEncoderSelector;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/VideoEncoderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "VideoEncoderSelector"
.end annotation


# virtual methods
.method public abstract onAvailableBitrate(I)Lorg/webrtc/VideoCodecInfo;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lorg/webrtc/CalledByNative;
        value = "VideoEncoderSelector"
    .end annotation
.end method

.method public abstract onCurrentEncoder(Lorg/webrtc/VideoCodecInfo;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "VideoEncoderSelector"
    .end annotation
.end method

.method public abstract onEncoderBroken()Lorg/webrtc/VideoCodecInfo;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Lorg/webrtc/CalledByNative;
        value = "VideoEncoderSelector"
    .end annotation
.end method
