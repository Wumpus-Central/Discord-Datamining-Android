.class public final enum Lorg/webrtc/PeerConnection$RtcpMuxPolicy;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RtcpMuxPolicy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/PeerConnection$RtcpMuxPolicy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

.field public static final enum NEGOTIATE:Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

.field public static final enum REQUIRE:Lorg/webrtc/PeerConnection$RtcpMuxPolicy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    const-string v1, "NEGOTIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;->NEGOTIATE:Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    new-instance v1, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    const-string v3, "REQUIRE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;->REQUIRE:Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    const/4 v3, 0x2

    new-array v3, v3, [Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;->$VALUES:[Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    return-void
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

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/PeerConnection$RtcpMuxPolicy;
    .locals 1

    const-class v0, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/PeerConnection$RtcpMuxPolicy;
    .locals 1

    sget-object v0, Lorg/webrtc/PeerConnection$RtcpMuxPolicy;->$VALUES:[Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    invoke-virtual {v0}, [Lorg/webrtc/PeerConnection$RtcpMuxPolicy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/PeerConnection$RtcpMuxPolicy;

    return-object v0
.end method
