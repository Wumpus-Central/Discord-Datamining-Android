.class public interface abstract Lorg/webrtc/VideoEncoder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/VideoEncoder$Callback;,
        Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;,
        Lorg/webrtc/VideoEncoder$ScalingSettings;,
        Lorg/webrtc/VideoEncoder$BitrateAllocation;,
        Lorg/webrtc/VideoEncoder$CodecSpecificInfoH264;,
        Lorg/webrtc/VideoEncoder$CodecSpecificInfoVP9;,
        Lorg/webrtc/VideoEncoder$CodecSpecificInfoVP8;,
        Lorg/webrtc/VideoEncoder$CodecSpecificInfo;,
        Lorg/webrtc/VideoEncoder$EncodeInfo;,
        Lorg/webrtc/VideoEncoder$Capabilities;,
        Lorg/webrtc/VideoEncoder$Settings;
    }
.end annotation


# virtual methods
.method public abstract createNativeVideoEncoder()J
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract encode(Lorg/webrtc/VideoFrame;Lorg/webrtc/VideoEncoder$EncodeInfo;)Lorg/webrtc/VideoCodecStatus;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract getImplementationName()Ljava/lang/String;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract getResolutionBitrateLimits()[Lorg/webrtc/VideoEncoder$ResolutionBitrateLimits;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract getScalingSettings()Lorg/webrtc/VideoEncoder$ScalingSettings;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract initEncode(Lorg/webrtc/VideoEncoder$Settings;Lorg/webrtc/VideoEncoder$Callback;)Lorg/webrtc/VideoCodecStatus;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract isHardwareEncoder()Z
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract release()Lorg/webrtc/VideoCodecStatus;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method

.method public abstract setRateAllocation(Lorg/webrtc/VideoEncoder$BitrateAllocation;I)Lorg/webrtc/VideoCodecStatus;
    .annotation build Lorg/webrtc/CalledByNative;
    .end annotation
.end method
