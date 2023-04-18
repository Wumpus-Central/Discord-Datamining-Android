.class public final Lco/discord/media_engine/SharedEglBaseContext;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static eglBase_:Lorg/webrtc/EglBase;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized getEglContext()Lorg/webrtc/EglBase$Context;
    .locals 2

    .line 1
    const-class v0, Lco/discord/media_engine/SharedEglBaseContext;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lco/discord/media_engine/SharedEglBaseContext;->eglBase_:Lorg/webrtc/EglBase;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-static {}, Lorg/webrtc/EglHelper;->create()Lorg/webrtc/EglBase;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sput-object v1, Lco/discord/media_engine/SharedEglBaseContext;->eglBase_:Lorg/webrtc/EglBase;

    .line 13
    .line 14
    :cond_0
    sget-object v1, Lco/discord/media_engine/SharedEglBaseContext;->eglBase_:Lorg/webrtc/EglBase;

    .line 15
    .line 16
    invoke-interface {v1}, Lorg/webrtc/EglBase;->getEglBaseContext()Lorg/webrtc/EglBase$Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    monitor-exit v0

    .line 24
    throw v1
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
