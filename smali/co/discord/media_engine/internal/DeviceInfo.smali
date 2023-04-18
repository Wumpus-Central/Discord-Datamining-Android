.class public final Lco/discord/media_engine/internal/DeviceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static enumerator()Lorg/webrtc/CameraEnumerator;
    .locals 1

    invoke-static {}, Lco/discord/media_engine/CameraEnumeratorProvider;->get()Lorg/webrtc/CameraEnumerator;

    move-result-object v0

    return-object v0
.end method

.method private getDeviceFacingString(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lco/discord/media_engine/internal/DeviceInfo;->getDeviceFrontFacing(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "front"

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1}, Lco/discord/media_engine/internal/DeviceInfo;->getDeviceBackFacing(I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const-string p1, "back"

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    const-string p1, "unknown"

    .line 20
    .line 21
    return-object p1
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


# virtual methods
.method public getDeviceBackFacing(I)Z
    .locals 1

    invoke-static {}, Lco/discord/media_engine/internal/DeviceInfo;->enumerator()Lorg/webrtc/CameraEnumerator;

    move-result-object v0

    invoke-virtual {p0, p1}, Lco/discord/media_engine/internal/DeviceInfo;->getDeviceName(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/webrtc/CameraEnumerator;->isBackFacing(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public getDeviceFrontFacing(I)Z
    .locals 1

    invoke-static {}, Lco/discord/media_engine/internal/DeviceInfo;->enumerator()Lorg/webrtc/CameraEnumerator;

    move-result-object v0

    invoke-virtual {p0, p1}, Lco/discord/media_engine/internal/DeviceInfo;->getDeviceName(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/webrtc/CameraEnumerator;->isFrontFacing(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public getDeviceGuid(I)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-direct {p0, p1}, Lco/discord/media_engine/internal/DeviceInfo;->getDeviceFacingString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "android_camera_%d_%s_facing"

    invoke-static {v0, p1, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getDeviceName(I)Ljava/lang/String;
    .locals 1

    invoke-static {}, Lco/discord/media_engine/internal/DeviceInfo;->enumerator()Lorg/webrtc/CameraEnumerator;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v0

    aget-object p1, v0, p1

    return-object p1
.end method

.method public numberOfDevices()I
    .locals 1

    invoke-static {}, Lco/discord/media_engine/internal/DeviceInfo;->enumerator()Lorg/webrtc/CameraEnumerator;

    move-result-object v0

    invoke-interface {v0}, Lorg/webrtc/CameraEnumerator;->getDeviceNames()[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    return v0
.end method
