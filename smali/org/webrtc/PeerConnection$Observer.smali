.class public interface abstract Lorg/webrtc/PeerConnection$Observer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Observer"
.end annotation


# virtual methods
.method public abstract onAddStream(Lorg/webrtc/MediaStream;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onAddTrack(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onConnectionChange(Lorg/webrtc/PeerConnection$PeerConnectionState;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onDataChannel(Lorg/webrtc/DataChannel;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceCandidate(Lorg/webrtc/IceCandidate;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceCandidatesRemoved([Lorg/webrtc/IceCandidate;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceConnectionReceivingChange(Z)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onIceGatheringChange(Lorg/webrtc/PeerConnection$IceGatheringState;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onRemoveStream(Lorg/webrtc/MediaStream;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onRenegotiationNeeded()V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onSelectedCandidatePairChanged(Lorg/webrtc/CandidatePairChangeEvent;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onSignalingChange(Lorg/webrtc/PeerConnection$SignalingState;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onStandardizedIceConnectionChange(Lorg/webrtc/PeerConnection$IceConnectionState;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method

.method public abstract onTrack(Lorg/webrtc/RtpTransceiver;)V
    .annotation build Lorg/webrtc/CalledByNative;
        value = "Observer"
    .end annotation
.end method
