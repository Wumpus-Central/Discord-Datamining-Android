.class public Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/CameraEnumerationAndroid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CaptureFormat"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;
    }
.end annotation


# instance fields
.field public final framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

.field public final height:I

.field public final imageFormat:I

.field public final width:I


# direct methods
.method public constructor <init>(IIII)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    .line 2
    iput v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->imageFormat:I

    .line 3
    iput p1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    .line 4
    iput p2, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    .line 5
    new-instance p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    invoke-direct {p1, p3, p4}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;-><init>(II)V

    iput-object p1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    return-void
.end method

.method public constructor <init>(IILorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    .line 7
    iput v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->imageFormat:I

    .line 8
    iput p1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    .line 9
    iput p2, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    .line 10
    iput-object p3, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    return-void
.end method

.method public static frameSize(III)I
    .locals 1

    const/16 v0, 0x11

    if-ne p2, v0, :cond_0

    mul-int/2addr p0, p1

    .line 2
    invoke-static {p2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result p1

    mul-int/2addr p0, p1

    div-int/lit8 p0, p0, 0x8

    return p0

    .line 3
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Don\'t know how to calculate the frame size of non-NV21 image formats."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    .line 8
    .line 9
    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    .line 10
    .line 11
    iget v2, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    .line 12
    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    .line 16
    .line 17
    iget v2, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    .line 18
    .line 19
    if-ne v0, v2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    .line 22
    .line 23
    iget-object p1, p1, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    :cond_1
    return v1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
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
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public frameSize()I
    .locals 3

    .line 1
    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    iget v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    const/16 v2, 0x11

    invoke-static {v0, v1, v2}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->frameSize(III)I

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    const v1, 0xffd9

    mul-int/2addr v0, v1

    iget v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    add-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xfb

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    invoke-virtual {v1}, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;->framerate:Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
