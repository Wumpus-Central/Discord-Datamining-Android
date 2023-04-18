.class public final Lco/discord/media_engine/CameraEnumeratorProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0008\u0010\n\u001a\u00020\u0006H\u0007J\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lco/discord/media_engine/CameraEnumeratorProvider;",
        "",
        "()V",
        "TAG",
        "",
        "enumerator",
        "Lorg/webrtc/CameraEnumerator;",
        "createCapturer",
        "Lorg/webrtc/CameraVideoCapturer;",
        "cameraName",
        "get",
        "init",
        "",
        "context",
        "Landroid/content/Context;",
        "forceCamera1",
        "",
        "maybeInit",
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


# static fields
.field public static final INSTANCE:Lco/discord/media_engine/CameraEnumeratorProvider;

.field private static final TAG:Ljava/lang/String; = "CameraEnumeratorProvider"

.field private static enumerator:Lorg/webrtc/CameraEnumerator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/discord/media_engine/CameraEnumeratorProvider;

    invoke-direct {v0}, Lco/discord/media_engine/CameraEnumeratorProvider;-><init>()V

    sput-object v0, Lco/discord/media_engine/CameraEnumeratorProvider;->INSTANCE:Lco/discord/media_engine/CameraEnumeratorProvider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final createCapturer(Ljava/lang/String;)Lorg/webrtc/CameraVideoCapturer;
    .locals 2

    .line 1
    const-string v0, "cameraName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lco/discord/media_engine/CameraEnumeratorProvider;->get()Lorg/webrtc/CameraEnumerator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, p0, v1}, Lorg/webrtc/CameraEnumerator;->createCapturer(Ljava/lang/String;Lorg/webrtc/CameraVideoCapturer$CameraEventsHandler;)Lorg/webrtc/CameraVideoCapturer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "get().createCapturer(cameraName, null)"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p0
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

.method public static final declared-synchronized get()Lorg/webrtc/CameraEnumerator;
    .locals 3

    .line 1
    const-class v0, Lco/discord/media_engine/CameraEnumeratorProvider;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lco/discord/media_engine/CameraEnumeratorProvider;->enumerator:Lorg/webrtc/CameraEnumerator;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "CameraEnumeratorProvider"

    .line 9
    .line 10
    const-string v2, "init was never called. Use Camera 1 API by default."

    .line 11
    .line 12
    invoke-static {v1, v2}, Lco/discord/media_engine/internal/ExtensionFunctionsKt;->logi(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lorg/webrtc/Camera1Enumerator;

    .line 16
    .line 17
    invoke-direct {v1}, Lorg/webrtc/Camera1Enumerator;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    :cond_0
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

.method public static final declared-synchronized maybeInit(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-class v0, Lco/discord/media_engine/CameraEnumeratorProvider;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "context"

    .line 5
    .line 6
    invoke-static {p0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lco/discord/media_engine/CameraEnumeratorProvider;->enumerator:Lorg/webrtc/CameraEnumerator;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Lco/discord/media_engine/CameraEnumeratorProvider;->INSTANCE:Lco/discord/media_engine/CameraEnumeratorProvider;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {v1, p0, v2}, Lco/discord/media_engine/CameraEnumeratorProvider;->init(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :cond_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    monitor-exit v0

    .line 23
    throw p0
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


# virtual methods
.method public final declared-synchronized init(Landroid/content/Context;Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "context"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    const-string p1, "CameraEnumeratorProvider"

    .line 10
    .line 11
    const-string p2, "Override: Forcing Camera 1 API"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lco/discord/media_engine/internal/ExtensionFunctionsKt;->logi(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lorg/webrtc/Camera1Enumerator;

    .line 17
    .line 18
    invoke-direct {p1}, Lorg/webrtc/Camera1Enumerator;-><init>()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {p1}, Lorg/webrtc/Camera2Enumerator;->isSupported(Landroid/content/Context;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    const-string p2, "CameraEnumeratorProvider"

    .line 29
    .line 30
    const-string v0, "Use Camera 2 API"

    .line 31
    .line 32
    invoke-static {p2, v0}, Lco/discord/media_engine/internal/ExtensionFunctionsKt;->logi(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance p2, Lorg/webrtc/Camera2Enumerator;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {p2, p1}, Lorg/webrtc/Camera2Enumerator;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    move-object p1, p2

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const-string p1, "CameraEnumeratorProvider"

    .line 47
    .line 48
    const-string p2, "Camera 2 API is not supported. Use Camera 1 API"

    .line 49
    .line 50
    invoke-static {p1, p2}, Lco/discord/media_engine/internal/ExtensionFunctionsKt;->logi(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance p1, Lorg/webrtc/Camera1Enumerator;

    .line 54
    .line 55
    invoke-direct {p1}, Lorg/webrtc/Camera1Enumerator;-><init>()V

    .line 56
    .line 57
    .line 58
    :goto_0
    sput-object p1, Lco/discord/media_engine/CameraEnumeratorProvider;->enumerator:Lorg/webrtc/CameraEnumerator;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    monitor-exit p0

    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    monitor-exit p0

    .line 64
    throw p1
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
