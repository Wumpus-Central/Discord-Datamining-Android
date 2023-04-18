.class abstract enum Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/HardwareVideoEncoder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "YuvFormat"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/HardwareVideoEncoder$YuvFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

.field public static final enum NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$1;

    .line 2
    .line 3
    const-string v1, "I420"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    .line 10
    .line 11
    new-instance v1, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$2;

    .line 12
    .line 13
    const-string v3, "NV12"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    .line 29
    .line 30
    return-void
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILorg/webrtc/HardwareVideoEncoder$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static valueOf(I)Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 3

    const/16 v0, 0x13

    if-eq p0, v0, :cond_2

    const/16 v0, 0x15

    if-eq p0, v0, :cond_1

    const v0, 0x7fa30c00

    if-eq p0, v0, :cond_1

    const v0, 0x7fa30c04

    if-ne p0, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported colorFormat: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3
    :cond_1
    :goto_0
    sget-object p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->NV12:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0

    .line 4
    :cond_2
    sget-object p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->I420:Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    .line 1
    const-class v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;
    .locals 1

    sget-object v0, Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->$VALUES:[Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    invoke-virtual {v0}, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/HardwareVideoEncoder$YuvFormat;

    return-object v0
.end method


# virtual methods
.method abstract fillBuffer(Ljava/nio/ByteBuffer;Lorg/webrtc/VideoFrame$Buffer;)V
.end method
