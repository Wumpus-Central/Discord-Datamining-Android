.class public final enum Lorg/webrtc/Logging$Severity;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/Logging;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Severity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/webrtc/Logging$Severity;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/webrtc/Logging$Severity;

.field public static final enum LS_ERROR:Lorg/webrtc/Logging$Severity;

.field public static final enum LS_INFO:Lorg/webrtc/Logging$Severity;

.field public static final enum LS_NONE:Lorg/webrtc/Logging$Severity;

.field public static final enum LS_VERBOSE:Lorg/webrtc/Logging$Severity;

.field public static final enum LS_WARNING:Lorg/webrtc/Logging$Severity;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lorg/webrtc/Logging$Severity;

    const-string v1, "LS_VERBOSE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lorg/webrtc/Logging$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/webrtc/Logging$Severity;->LS_VERBOSE:Lorg/webrtc/Logging$Severity;

    new-instance v1, Lorg/webrtc/Logging$Severity;

    const-string v3, "LS_INFO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lorg/webrtc/Logging$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lorg/webrtc/Logging$Severity;->LS_INFO:Lorg/webrtc/Logging$Severity;

    new-instance v3, Lorg/webrtc/Logging$Severity;

    const-string v5, "LS_WARNING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lorg/webrtc/Logging$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lorg/webrtc/Logging$Severity;->LS_WARNING:Lorg/webrtc/Logging$Severity;

    new-instance v5, Lorg/webrtc/Logging$Severity;

    const-string v7, "LS_ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lorg/webrtc/Logging$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lorg/webrtc/Logging$Severity;->LS_ERROR:Lorg/webrtc/Logging$Severity;

    new-instance v7, Lorg/webrtc/Logging$Severity;

    const-string v9, "LS_NONE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lorg/webrtc/Logging$Severity;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lorg/webrtc/Logging$Severity;->LS_NONE:Lorg/webrtc/Logging$Severity;

    const/4 v9, 0x5

    new-array v9, v9, [Lorg/webrtc/Logging$Severity;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lorg/webrtc/Logging$Severity;->$VALUES:[Lorg/webrtc/Logging$Severity;

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

.method public static valueOf(Ljava/lang/String;)Lorg/webrtc/Logging$Severity;
    .locals 1

    const-class v0, Lorg/webrtc/Logging$Severity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/webrtc/Logging$Severity;

    return-object p0
.end method

.method public static values()[Lorg/webrtc/Logging$Severity;
    .locals 1

    sget-object v0, Lorg/webrtc/Logging$Severity;->$VALUES:[Lorg/webrtc/Logging$Severity;

    invoke-virtual {v0}, [Lorg/webrtc/Logging$Severity;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/webrtc/Logging$Severity;

    return-object v0
.end method
