.class public final enum Lorg/webrtc/PeerConnection$SignalingState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SignalingState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/PeerConnection$SignalingState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum CLOSED:Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum HAVE_LOCAL_OFFER:Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum HAVE_LOCAL_PRANSWER:Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum HAVE_REMOTE_OFFER:Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum HAVE_REMOTE_PRANSWER:Lorg/webrtc/PeerConnection$SignalingState;

.field public static final enum STABLE:Lorg/webrtc/PeerConnection$SignalingState;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lorg/webrtc/PeerConnection$SignalingState;

    .line 2
    .line 3
    const-string v1, "STABLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/webrtc/PeerConnection$SignalingState;->STABLE:Lorg/webrtc/PeerConnection$SignalingState;

    .line 10
    .line 11
    new-instance v1, Lorg/webrtc/PeerConnection$SignalingState;

    .line 12
    .line 13
    const-string v3, "HAVE_LOCAL_OFFER"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/webrtc/PeerConnection$SignalingState;->HAVE_LOCAL_OFFER:Lorg/webrtc/PeerConnection$SignalingState;

    .line 20
    .line 21
    new-instance v3, Lorg/webrtc/PeerConnection$SignalingState;

    .line 22
    .line 23
    const-string v5, "HAVE_LOCAL_PRANSWER"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v3, v5, v6}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v3, Lorg/webrtc/PeerConnection$SignalingState;->HAVE_LOCAL_PRANSWER:Lorg/webrtc/PeerConnection$SignalingState;

    .line 30
    .line 31
    new-instance v5, Lorg/webrtc/PeerConnection$SignalingState;

    .line 32
    .line 33
    const-string v7, "HAVE_REMOTE_OFFER"

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    invoke-direct {v5, v7, v8}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v5, Lorg/webrtc/PeerConnection$SignalingState;->HAVE_REMOTE_OFFER:Lorg/webrtc/PeerConnection$SignalingState;

    .line 40
    .line 41
    new-instance v7, Lorg/webrtc/PeerConnection$SignalingState;

    .line 42
    .line 43
    const-string v9, "HAVE_REMOTE_PRANSWER"

    .line 44
    .line 45
    const/4 v10, 0x4

    .line 46
    invoke-direct {v7, v9, v10}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v7, Lorg/webrtc/PeerConnection$SignalingState;->HAVE_REMOTE_PRANSWER:Lorg/webrtc/PeerConnection$SignalingState;

    .line 50
    .line 51
    new-instance v9, Lorg/webrtc/PeerConnection$SignalingState;

    .line 52
    .line 53
    const-string v11, "CLOSED"

    .line 54
    .line 55
    const/4 v12, 0x5

    .line 56
    invoke-direct {v9, v11, v12}, Lorg/webrtc/PeerConnection$SignalingState;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v9, Lorg/webrtc/PeerConnection$SignalingState;->CLOSED:Lorg/webrtc/PeerConnection$SignalingState;

    .line 60
    .line 61
    const/4 v11, 0x6

    .line 62
    new-array v11, v11, [Lorg/webrtc/PeerConnection$SignalingState;

    .line 63
    .line 64
    aput-object v0, v11, v2

    .line 65
    .line 66
    aput-object v1, v11, v4

    .line 67
    .line 68
    aput-object v3, v11, v6

    .line 69
    .line 70
    aput-object v5, v11, v8

    .line 71
    .line 72
    aput-object v7, v11, v10

    .line 73
    .line 74
    aput-object v9, v11, v12

    .line 75
    .line 76
    sput-object v11, Lorg/webrtc/PeerConnection$SignalingState;->$VALUES:[Lorg/webrtc/PeerConnection$SignalingState;

    .line 77
    .line 78
    return-void
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

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static fromNativeIndex(I)Lorg/webrtc/PeerConnection$SignalingState;
    .locals 1
    .annotation build Lorg/webrtc/CalledByNative;
        value = "SignalingState"
    .end annotation

    invoke-static {}, Lorg/webrtc/PeerConnection$SignalingState;->values()[Lorg/webrtc/PeerConnection$SignalingState;

    move-result-object v0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/PeerConnection$SignalingState;
    .locals 1

    const-class v0, Lorg/webrtc/PeerConnection$SignalingState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/PeerConnection$SignalingState;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/PeerConnection$SignalingState;
    .locals 1

    sget-object v0, Lorg/webrtc/PeerConnection$SignalingState;->$VALUES:[Lorg/webrtc/PeerConnection$SignalingState;

    invoke-virtual {v0}, [Lorg/webrtc/PeerConnection$SignalingState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/PeerConnection$SignalingState;

    return-object v0
.end method
