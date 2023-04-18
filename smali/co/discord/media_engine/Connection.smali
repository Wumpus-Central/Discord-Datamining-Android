.class public final Lco/discord/media_engine/Connection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/discord/media_engine/Connection$EncryptionModesCallback;,
        Lco/discord/media_engine/Connection$GetStatsCallback;,
        Lco/discord/media_engine/Connection$GetStatsCallbackNative;,
        Lco/discord/media_engine/Connection$OnVideoCallback;,
        Lco/discord/media_engine/Connection$StatsFilter;,
        Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0006[\\]^_`B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J9\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u0011\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011H\u0086 J\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0011H\u0086 J\u0011\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0086 J\t\u0010\u0019\u001a\u00020\nH\u0086 J\u0011\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0011\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0011\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fH\u0086 J\u000e\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020!J\u0016\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010\"\u001a\u00020\rJ\u0019\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\"\u001a\u00020\rH\u0082 J\u0011\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0011H\u0086 J\u0019\u0010\'\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0011H\u0086 J\u0011\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\rH\u0086 J:\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u000201002\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020300H\u0086 \u00a2\u0006\u0002\u00104J1\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u00020\rH\u0086 J\u0011\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020=H\u0086 J\u0011\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0013H\u0086 J\u0011\u0010@\u001a\u00020\n2\u0006\u0010A\u001a\u00020\rH\u0086 J\u0011\u0010B\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020CH\u0086 J\u0011\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\u0011H\u0086 J\u0011\u0010F\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011H\u0086 J\u0019\u0010G\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u000e\u0010H\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0008J\u0011\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\rH\u0086 J\u0011\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\rH\u0086 J\u0011\u0010M\u001a\u00020\n2\u0006\u0010L\u001a\u00020\rH\u0086 J\u0011\u0010N\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0013H\u0086 J\u0011\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0011H\u0086 J\u0011\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\u0011H\u0086 J\u0011\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u0013H\u0086 J\u0019\u0010V\u001a\u00020\n2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u0003H\u0086 J\t\u0010Z\u001a\u00020\nH\u0086 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"
    }
    d2 = {
        "Lco/discord/media_engine/Connection;",
        "",
        "nativeInstance",
        "",
        "(J)V",
        "getNativeInstance",
        "()J",
        "userSpeakingStatusChangedCallback",
        "Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;",
        "connectUser",
        "",
        "userId",
        "audioSsrc",
        "",
        "videoSsrc",
        "rtxSsrc",
        "isMuted",
        "",
        "volume",
        "",
        "deafenLocalUser",
        "willBeDeafened",
        "disableVideo",
        "willBeDisabled",
        "disconnectUser",
        "dispose",
        "enableDiscontinuousTransmission",
        "enabled",
        "enableForwardErrorCorrection",
        "getEncryptionModes",
        "callback",
        "Lco/discord/media_engine/Connection$EncryptionModesCallback;",
        "getStats",
        "Lco/discord/media_engine/Connection$GetStatsCallback;",
        "filter",
        "getStatsNative",
        "Lco/discord/media_engine/Connection$GetStatsCallbackNative;",
        "muteLocalUser",
        "willBeMuted",
        "muteUser",
        "setAudioInputMode",
        "mode",
        "setCodecs",
        "audioEncoder",
        "Lco/discord/media_engine/AudioEncoder;",
        "videoEncoder",
        "Lco/discord/media_engine/VideoEncoder;",
        "audioDecoders",
        "",
        "Lco/discord/media_engine/AudioDecoder;",
        "videoDecoder",
        "Lco/discord/media_engine/VideoDecoder;",
        "(Lco/discord/media_engine/AudioEncoder;Lco/discord/media_engine/VideoEncoder;[Lco/discord/media_engine/AudioDecoder;[Lco/discord/media_engine/VideoDecoder;)V",
        "setEncodingQuality",
        "minBitrate",
        "maxBitrate",
        "width",
        "height",
        "framerate",
        "setEncryptionSettings",
        "settings",
        "Lco/discord/media_engine/EncryptionSettings;",
        "setExpectedPacketLossRate",
        "expectedPacketLossRate",
        "setMinimumPlayoutDelay",
        "delayMs",
        "setOnVideoCallback",
        "Lco/discord/media_engine/Connection$OnVideoCallback;",
        "setPTTActive",
        "active",
        "setQoS",
        "setUserPlayoutVolume",
        "setUserSpeakingStatusChangedCallback",
        "setVADAutoThreshold",
        "autoThreshold",
        "setVADLeadingFramesToBuffer",
        "numFrames",
        "setVADTrailingFramesToSend",
        "setVADTriggerThreshold",
        "thresholdDb",
        "setVADUseKrisp",
        "useKrisp",
        "setVideoBroadcast",
        "broadcastVideo",
        "simulatePacketLoss",
        "packetLossRate",
        "startScreenshareBroadcast",
        "capturer",
        "Lorg/webrtc/VideoCapturer;",
        "audio",
        "stopScreenshareBroadcast",
        "EncryptionModesCallback",
        "GetStatsCallback",
        "GetStatsCallbackNative",
        "OnVideoCallback",
        "StatsFilter",
        "UserSpeakingStatusChangedCallback",
        "android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final nativeInstance:J

.field private userSpeakingStatusChangedCallback:Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;


# direct methods
.method private constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/discord/media_engine/Connection;->nativeInstance:J

    return-void
.end method

.method private final native getStatsNative(Lco/discord/media_engine/Connection$GetStatsCallbackNative;I)V
.end method


# virtual methods
.method public final native connectUser(JIIIZF)V
.end method

.method public final native deafenLocalUser(Z)V
.end method

.method public final native disableVideo(JZ)V
.end method

.method public final native disconnectUser(J)V
.end method

.method public final native dispose()V
.end method

.method public final native enableDiscontinuousTransmission(Z)V
.end method

.method public final native enableForwardErrorCorrection(Z)V
.end method

.method public final native getEncryptionModes(Lco/discord/media_engine/Connection$EncryptionModesCallback;)V
.end method

.method public final getNativeInstance()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/Connection;->nativeInstance:J

    return-wide v0
.end method

.method public final getStats(Lco/discord/media_engine/Connection$GetStatsCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;

    invoke-direct {v0, p1}, Lco/discord/media_engine/Connection$GetStatsCallbackNative;-><init>(Lco/discord/media_engine/Connection$GetStatsCallback;)V

    const/4 p1, -0x1

    invoke-direct {p0, v0, p1}, Lco/discord/media_engine/Connection;->getStatsNative(Lco/discord/media_engine/Connection$GetStatsCallbackNative;I)V

    return-void
.end method

.method public final getStats(Lco/discord/media_engine/Connection$GetStatsCallback;I)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lco/discord/media_engine/Connection$GetStatsCallbackNative;

    invoke-direct {v0, p1}, Lco/discord/media_engine/Connection$GetStatsCallbackNative;-><init>(Lco/discord/media_engine/Connection$GetStatsCallback;)V

    invoke-direct {p0, v0, p2}, Lco/discord/media_engine/Connection;->getStatsNative(Lco/discord/media_engine/Connection$GetStatsCallbackNative;I)V

    return-void
.end method

.method public final native muteLocalUser(Z)V
.end method

.method public final native muteUser(JZ)V
.end method

.method public final native setAudioInputMode(I)V
.end method

.method public final native setCodecs(Lco/discord/media_engine/AudioEncoder;Lco/discord/media_engine/VideoEncoder;[Lco/discord/media_engine/AudioDecoder;[Lco/discord/media_engine/VideoDecoder;)V
.end method

.method public final native setEncodingQuality(IIIII)V
.end method

.method public final native setEncryptionSettings(Lco/discord/media_engine/EncryptionSettings;)V
.end method

.method public final native setExpectedPacketLossRate(F)V
.end method

.method public final native setMinimumPlayoutDelay(I)V
.end method

.method public final native setOnVideoCallback(Lco/discord/media_engine/Connection$OnVideoCallback;)V
.end method

.method public final native setPTTActive(Z)V
.end method

.method public final native setQoS(Z)V
.end method

.method public final native setUserPlayoutVolume(JF)V
.end method

.method public final setUserSpeakingStatusChangedCallback(Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lco/discord/media_engine/Connection;->userSpeakingStatusChangedCallback:Lco/discord/media_engine/Connection$UserSpeakingStatusChangedCallback;

    .line 7
    .line 8
    return-void
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
.end method

.method public final native setVADAutoThreshold(I)V
.end method

.method public final native setVADLeadingFramesToBuffer(I)V
.end method

.method public final native setVADTrailingFramesToSend(I)V
.end method

.method public final native setVADTriggerThreshold(F)V
.end method

.method public final native setVADUseKrisp(Z)V
.end method

.method public final native setVideoBroadcast(Z)V
.end method

.method public final native simulatePacketLoss(F)V
.end method

.method public final native startScreenshareBroadcast(Lorg/webrtc/VideoCapturer;J)V
.end method

.method public final native stopScreenshareBroadcast()V
.end method
