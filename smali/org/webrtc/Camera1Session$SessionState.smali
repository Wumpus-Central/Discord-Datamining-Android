.class final enum Lorg/webrtc/Camera1Session$SessionState;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/Camera1Session;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "SessionState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/Camera1Session$SessionState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/Camera1Session$SessionState;

.field public static final enum RUNNING:Lorg/webrtc/Camera1Session$SessionState;

.field public static final enum STOPPED:Lorg/webrtc/Camera1Session$SessionState;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lorg/webrtc/Camera1Session$SessionState;

    const-string v1, "RUNNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Camera1Session$SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Camera1Session$SessionState;->RUNNING:Lorg/webrtc/Camera1Session$SessionState;

    new-instance v1, Lorg/webrtc/Camera1Session$SessionState;

    const-string v3, "STOPPED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lorg/webrtc/Camera1Session$SessionState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/webrtc/Camera1Session$SessionState;->STOPPED:Lorg/webrtc/Camera1Session$SessionState;

    const/4 v3, 0x2

    new-array v3, v3, [Lorg/webrtc/Camera1Session$SessionState;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lorg/webrtc/Camera1Session$SessionState;->$VALUES:[Lorg/webrtc/Camera1Session$SessionState;

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

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/Camera1Session$SessionState;
    .locals 1

    const-class v0, Lorg/webrtc/Camera1Session$SessionState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/Camera1Session$SessionState;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/Camera1Session$SessionState;
    .locals 1

    sget-object v0, Lorg/webrtc/Camera1Session$SessionState;->$VALUES:[Lorg/webrtc/Camera1Session$SessionState;

    invoke-virtual {v0}, [Lorg/webrtc/Camera1Session$SessionState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/Camera1Session$SessionState;

    return-object v0
.end method
