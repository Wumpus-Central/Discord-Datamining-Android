.class public final Lcom/discord/native/engine/NativeConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;,
        Lcom/discord/native/engine/NativeConnection$GetStatsCallback;,
        Lcom/discord/native/engine/NativeConnection$OnPingCallback;,
        Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;,
        Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;,
        Lcom/discord/native/engine/NativeConnection$OnVideoCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0006DEFGHIB\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0086 J\u0011\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\rH\u0086 J\u0006\u0010\u000e\u001a\u00020\u0006J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0086 J\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u0014H\u0086 J\u0011\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0014H\u0086 J\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\rH\u0086 J\t\u0010\u0018\u001a\u00020\u0006H\u0082 J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0086 J\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001cH\u0086 J!\u0010 \u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0086 J\u0019\u0010$\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010%\u001a\u00020\"H\u0086 J\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\'\u001a\u00020\u0008H\u0086 J\u0011\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\"H\u0086 J\u0011\u0010*\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020+H\u0086 J\u0011\u0010,\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020-H\u0086 J\u0011\u0010.\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020/H\u0086 J\u0011\u00100\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u000201H\u0086 J\u0019\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u001cH\u0086 J\u0011\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0008H\u0086 J\u0011\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u001cH\u0086 J\u0011\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u001cH\u0086 J\u0011\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\rH\u0086 J\u0011\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u001cH\u0086 J\u0019\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0004H\u0086 J\t\u0010C\u001a\u00020\u0006H\u0086 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"
    }
    d2 = {
        "Lcom/discord/native/engine/NativeConnection;",
        "",
        "()V",
        "nativeInstance",
        "",
        "configureConnectionRetries",
        "",
        "baseDelayMs",
        "",
        "maxDelayMs",
        "maxAttempts",
        "destroyUser",
        "userId",
        "",
        "dispose",
        "getEncryptionModes",
        "callback",
        "Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;",
        "getFilteredStats",
        "filter",
        "Lcom/discord/native/engine/NativeConnection$GetStatsCallback;",
        "getStats",
        "mergeUsers",
        "usersJSON",
        "nativeDestroyInstance",
        "setDesktopSource",
        "stringId",
        "useVideoHook",
        "",
        "type",
        "setLocalMute",
        "mute",
        "setLocalPan",
        "left",
        "",
        "right",
        "setLocalVolume",
        "volume",
        "setMinimumOutputDelay",
        "delay",
        "setNoInputThreshold",
        "threshold",
        "setOnPingCallback",
        "Lcom/discord/native/engine/NativeConnection$OnPingCallback;",
        "setOnPingTimeoutCallback",
        "Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;",
        "setOnSpeakingCallback",
        "Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;",
        "setOnVideoCallback",
        "Lcom/discord/native/engine/NativeConnection$OnVideoCallback;",
        "setPTTActive",
        "active",
        "priority",
        "setPingInterval",
        "pingInterval",
        "setSelfDeafen",
        "deafened",
        "setSelfMute",
        "muted",
        "setTransportOptions",
        "optionsJSON",
        "setVideoBroadcast",
        "broadcasting",
        "startBroadcast",
        "capturer",
        "Lorg/webrtc/VideoCapturer;",
        "soundshareNativeInstance",
        "stopBroadcast",
        "GetEncryptionModesCallback",
        "GetStatsCallback",
        "OnPingCallback",
        "OnPingTimeoutCallback",
        "OnSpeakingCallback",
        "OnVideoCallback",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final native nativeDestroyInstance()V
.end method


# virtual methods
.method public final native configureConnectionRetries(III)V
.end method

.method public final native destroyUser(Ljava/lang/String;)V
.end method

.method public final dispose()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/native/engine/NativeConnection;->nativeDestroyInstance()V

    return-void
.end method

.method public final native getEncryptionModes(Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;)V
.end method

.method public final native getFilteredStats(ILcom/discord/native/engine/NativeConnection$GetStatsCallback;)V
.end method

.method public final native getStats(Lcom/discord/native/engine/NativeConnection$GetStatsCallback;)V
.end method

.method public final native mergeUsers(Ljava/lang/String;)V
.end method

.method public final native setDesktopSource(Ljava/lang/String;ZLjava/lang/String;)V
.end method

.method public final native setLocalMute(Ljava/lang/String;Z)V
.end method

.method public final native setLocalPan(Ljava/lang/String;FF)V
.end method

.method public final native setLocalVolume(Ljava/lang/String;F)V
.end method

.method public final native setMinimumOutputDelay(I)V
.end method

.method public final native setNoInputThreshold(F)V
.end method

.method public final native setOnPingCallback(Lcom/discord/native/engine/NativeConnection$OnPingCallback;)V
.end method

.method public final native setOnPingTimeoutCallback(Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;)V
.end method

.method public final native setOnSpeakingCallback(Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;)V
.end method

.method public final native setOnVideoCallback(Lcom/discord/native/engine/NativeConnection$OnVideoCallback;)V
.end method

.method public final native setPTTActive(ZZ)V
.end method

.method public final native setPingInterval(I)V
.end method

.method public final native setSelfDeafen(Z)V
.end method

.method public final native setSelfMute(Z)V
.end method

.method public final native setTransportOptions(Ljava/lang/String;)V
.end method

.method public final native setVideoBroadcast(Z)V
.end method

.method public final native startBroadcast(Lorg/webrtc/VideoCapturer;J)V
.end method

.method public final native stopBroadcast()V
.end method
