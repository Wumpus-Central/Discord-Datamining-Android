.class public Lcom/hammerandchisel/libdiscord/Discord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hammerandchisel/libdiscord/Discord$GetRankedRtcRegionsCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$NoAudioInputCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$GetSupportedVideoCodecsCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$GetAudioSubsystemCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$LocalVoiceLevelChangedCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$GetVideoInputDevicesCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$GetAudioOutputDevicesCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$GetAudioInputDevicesCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$OnVideoCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$VideoFrameCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$AecConfigCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$BuiltinAECCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$ConnectToServerCallback;,
        Lcom/hammerandchisel/libdiscord/Discord$ConnectionInfo;
    }
.end annotation


# static fields
.field public static final LOGLEVEL_DEBUG:I = 0x1

.field public static final LOGLEVEL_DEFAULT:I = 0x2


# instance fields
.field private context:Landroid/content/Context;

.field private localVoiceLevelChangedCallback:Lcom/hammerandchisel/libdiscord/Discord$LocalVoiceLevelChangedCallback;

.field private nativeInstance:J


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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x2

    .line 5
    invoke-direct {p0, p1, v0}, Lcom/hammerandchisel/libdiscord/Discord;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/hammerandchisel/libdiscord/Discord;->context:Landroid/content/Context;

    .line 3
    invoke-static {p1}, Lco/discord/media_engine/CameraEnumeratorProvider;->maybeInit(Landroid/content/Context;)V

    .line 4
    invoke-static {}, Lco/discord/media_engine/SharedEglBaseContext;->getEglContext()Lorg/webrtc/EglBase$Context;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Lcom/hammerandchisel/libdiscord/Discord;->nativeConstructor(Landroid/content/Context;Lorg/webrtc/EglBase$Context;I)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/hammerandchisel/libdiscord/Discord;->nativeInstance:J

    return-void
.end method

.method private native nativeConstructor(Landroid/content/Context;Lorg/webrtc/EglBase$Context;I)J
.end method

.method private native setLocalVoiceLevelChangedCallbackNative(Z)V
.end method


# virtual methods
.method public native connectToServer(IJLjava/lang/String;I[Lco/discord/media_engine/StreamParameters;Lcom/hammerandchisel/libdiscord/Discord$ConnectToServerCallback;)Lco/discord/media_engine/Connection;
.end method

.method public native crash()V
.end method

.method public native dispose()V
.end method

.method public native enableBuiltInAEC(Z)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public native enableBuiltInAEC(ZLcom/hammerandchisel/libdiscord/Discord$BuiltinAECCallback;)V
.end method

.method public native getAudioInputDevices(Lcom/hammerandchisel/libdiscord/Discord$GetAudioInputDevicesCallback;)V
.end method

.method public native getAudioOutputDevices(Lcom/hammerandchisel/libdiscord/Discord$GetAudioOutputDevicesCallback;)V
.end method

.method public native getAudioSubsystem(Lcom/hammerandchisel/libdiscord/Discord$GetAudioSubsystemCallback;)V
.end method

.method public native getRankedRtcRegions([Lco/discord/media_engine/RtcRegion;Lcom/hammerandchisel/libdiscord/Discord$GetRankedRtcRegionsCallback;)V
.end method

.method public native getSupportedVideoCodecs(Lcom/hammerandchisel/libdiscord/Discord$GetSupportedVideoCodecsCallback;)V
.end method

.method public native getVideoInputDevices(Lcom/hammerandchisel/libdiscord/Discord$GetVideoInputDevicesCallback;)V
.end method

.method public native setAudioInputEnabled(Z)V
.end method

.method public native setAutomaticGainControl(Z)V
.end method

.method public native setEchoCancellation(Z)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public native setEchoCancellation(ZZLcom/hammerandchisel/libdiscord/Discord$AecConfigCallback;)V
.end method

.method public native setKeepAliveChannel(Z)V
.end method

.method public setLocalVoiceLevelChangedCallback(Lcom/hammerandchisel/libdiscord/Discord$LocalVoiceLevelChangedCallback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/hammerandchisel/libdiscord/Discord;->localVoiceLevelChangedCallback:Lcom/hammerandchisel/libdiscord/Discord$LocalVoiceLevelChangedCallback;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    invoke-direct {p0, p1}, Lcom/hammerandchisel/libdiscord/Discord;->setLocalVoiceLevelChangedCallbackNative(Z)V

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
.end method

.method public native setMicVolume(F)V
.end method

.method public native setNoAudioInputCallback(Lcom/hammerandchisel/libdiscord/Discord$NoAudioInputCallback;)V
.end method

.method public native setNoAudioInputThreshold(F)V
.end method

.method public native setNoiseCancellation(Z)V
.end method

.method public native setNoiseSuppression(Z)V
.end method

.method public native setPlayoutDevice(I)V
.end method

.method public native setRecordingDevice(I)V
.end method

.method public native setSpeakerVolume(F)V
.end method

.method public native setVideoInputDevice(I)V
.end method

.method public native setVideoOutputSink(Ljava/lang/String;Lcom/hammerandchisel/libdiscord/Discord$VideoFrameCallback;)V
.end method

.method public native signalVideoOutputSinkReady(Ljava/lang/String;)V
.end method
