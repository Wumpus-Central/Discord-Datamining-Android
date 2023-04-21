.class public final Lcom/discord/native/engine/NativeSpeedTestConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/native/engine/NativeSpeedTestConnection$GetEncryptionModesCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$GetNetworkOverheadCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingTimeoutCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestSenderCallback;,
        Lcom/discord/native/engine/NativeSpeedTestConnection$StopSpeedTestReceiverCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0007\u001e\u001f !\"#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\tH\u0086 J\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u000bH\u0086 J\t\u0010\u000c\u001a\u00020\u0006H\u0082 J\u0011\u0010\r\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u000eH\u0086 J\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0010H\u0086 J\u0011\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\u0011\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0086 J\u0019\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0008\u001a\u00020\u0018H\u0086 J\u0019\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0008\u001a\u00020\u001aH\u0086 J\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u001cH\u0086 J\t\u0010\u001d\u001a\u00020\u0006H\u0086 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"
    }
    d2 = {
        "Lcom/discord/native/engine/NativeSpeedTestConnection;",
        "",
        "()V",
        "nativeInstance",
        "",
        "dispose",
        "",
        "getEncryptionModes",
        "callback",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$GetEncryptionModesCallback;",
        "getNetworkOverhead",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$GetNetworkOverheadCallback;",
        "nativeDestroyInstance",
        "setOnPingCallback",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingCallback;",
        "setOnPingTimeoutCallback",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingTimeoutCallback;",
        "setPingInterval",
        "pingInterval",
        "",
        "setTransportOptions",
        "optionsJSON",
        "",
        "startSpeedTestReceiver",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;",
        "startSpeedTestSender",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestSenderCallback;",
        "stopSpeedTestReceiver",
        "Lcom/discord/native/engine/NativeSpeedTestConnection$StopSpeedTestReceiverCallback;",
        "stopSpeedTestSender",
        "GetEncryptionModesCallback",
        "GetNetworkOverheadCallback",
        "OnPingCallback",
        "OnPingTimeoutCallback",
        "StartSpeedTestReceiverCallback",
        "StartSpeedTestSenderCallback",
        "StopSpeedTestReceiverCallback",
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
.method public final dispose()V
    .locals 0

    invoke-direct {p0}, Lcom/discord/native/engine/NativeSpeedTestConnection;->nativeDestroyInstance()V

    return-void
.end method

.method public final native getEncryptionModes(Lcom/discord/native/engine/NativeSpeedTestConnection$GetEncryptionModesCallback;)V
.end method

.method public final native getNetworkOverhead(Lcom/discord/native/engine/NativeSpeedTestConnection$GetNetworkOverheadCallback;)V
.end method

.method public final native setOnPingCallback(Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingCallback;)V
.end method

.method public final native setOnPingTimeoutCallback(Lcom/discord/native/engine/NativeSpeedTestConnection$OnPingTimeoutCallback;)V
.end method

.method public final native setPingInterval(I)V
.end method

.method public final native setTransportOptions(Ljava/lang/String;)V
.end method

.method public final native startSpeedTestReceiver(Ljava/lang/String;Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestReceiverCallback;)V
.end method

.method public final native startSpeedTestSender(Ljava/lang/String;Lcom/discord/native/engine/NativeSpeedTestConnection$StartSpeedTestSenderCallback;)V
.end method

.method public final native stopSpeedTestReceiver(Lcom/discord/native/engine/NativeSpeedTestConnection$StopSpeedTestReceiverCallback;)V
.end method

.method public final native stopSpeedTestSender()V
.end method
