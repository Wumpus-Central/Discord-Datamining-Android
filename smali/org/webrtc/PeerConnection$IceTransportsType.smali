.class public final enum Lorg/webrtc/PeerConnection$IceTransportsType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/PeerConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IceTransportsType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/PeerConnection$IceTransportsType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/PeerConnection$IceTransportsType;

.field public static final enum ALL:Lorg/webrtc/PeerConnection$IceTransportsType;

.field public static final enum NOHOST:Lorg/webrtc/PeerConnection$IceTransportsType;

.field public static final enum NONE:Lorg/webrtc/PeerConnection$IceTransportsType;

.field public static final enum RELAY:Lorg/webrtc/PeerConnection$IceTransportsType;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lorg/webrtc/PeerConnection$IceTransportsType;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/PeerConnection$IceTransportsType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/PeerConnection$IceTransportsType;->NONE:Lorg/webrtc/PeerConnection$IceTransportsType;

    new-instance v1, Lorg/webrtc/PeerConnection$IceTransportsType;

    const-string v3, "RELAY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lorg/webrtc/PeerConnection$IceTransportsType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/webrtc/PeerConnection$IceTransportsType;->RELAY:Lorg/webrtc/PeerConnection$IceTransportsType;

    new-instance v3, Lorg/webrtc/PeerConnection$IceTransportsType;

    const-string v5, "NOHOST"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lorg/webrtc/PeerConnection$IceTransportsType;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/webrtc/PeerConnection$IceTransportsType;->NOHOST:Lorg/webrtc/PeerConnection$IceTransportsType;

    new-instance v5, Lorg/webrtc/PeerConnection$IceTransportsType;

    const-string v7, "ALL"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lorg/webrtc/PeerConnection$IceTransportsType;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/webrtc/PeerConnection$IceTransportsType;->ALL:Lorg/webrtc/PeerConnection$IceTransportsType;

    const/4 v7, 0x4

    new-array v7, v7, [Lorg/webrtc/PeerConnection$IceTransportsType;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lorg/webrtc/PeerConnection$IceTransportsType;->$VALUES:[Lorg/webrtc/PeerConnection$IceTransportsType;

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

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/PeerConnection$IceTransportsType;
    .locals 1

    const-class v0, Lorg/webrtc/PeerConnection$IceTransportsType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/PeerConnection$IceTransportsType;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/PeerConnection$IceTransportsType;
    .locals 1

    sget-object v0, Lorg/webrtc/PeerConnection$IceTransportsType;->$VALUES:[Lorg/webrtc/PeerConnection$IceTransportsType;

    invoke-virtual {v0}, [Lorg/webrtc/PeerConnection$IceTransportsType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/PeerConnection$IceTransportsType;

    return-object v0
.end method
