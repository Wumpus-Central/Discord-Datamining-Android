.class public final enum Lcom/discord/media_player/MediaType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/media_player/MediaType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/discord/media_player/MediaType;",
        "",
        "(Ljava/lang/String;I)V",
        "VIDEO",
        "GIFV",
        "IMAGE",
        "AUDIO",
        "media_player_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/media_player/MediaType;

.field public static final enum AUDIO:Lcom/discord/media_player/MediaType;

.field public static final enum GIFV:Lcom/discord/media_player/MediaType;

.field public static final enum IMAGE:Lcom/discord/media_player/MediaType;

.field public static final enum VIDEO:Lcom/discord/media_player/MediaType;


# direct methods
.method private static final synthetic $values()[Lcom/discord/media_player/MediaType;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/discord/media_player/MediaType;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/media_player/MediaType;->VIDEO:Lcom/discord/media_player/MediaType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/media_player/MediaType;->GIFV:Lcom/discord/media_player/MediaType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/media_player/MediaType;->IMAGE:Lcom/discord/media_player/MediaType;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/discord/media_player/MediaType;->AUDIO:Lcom/discord/media_player/MediaType;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/discord/media_player/MediaType;

    const-string v1, "VIDEO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/discord/media_player/MediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/media_player/MediaType;->VIDEO:Lcom/discord/media_player/MediaType;

    new-instance v0, Lcom/discord/media_player/MediaType;

    const-string v1, "GIFV"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/discord/media_player/MediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/media_player/MediaType;->GIFV:Lcom/discord/media_player/MediaType;

    new-instance v0, Lcom/discord/media_player/MediaType;

    const-string v1, "IMAGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/discord/media_player/MediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/media_player/MediaType;->IMAGE:Lcom/discord/media_player/MediaType;

    new-instance v0, Lcom/discord/media_player/MediaType;

    const-string v1, "AUDIO"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/discord/media_player/MediaType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/media_player/MediaType;->AUDIO:Lcom/discord/media_player/MediaType;

    invoke-static {}, Lcom/discord/media_player/MediaType;->$values()[Lcom/discord/media_player/MediaType;

    move-result-object v0

    sput-object v0, Lcom/discord/media_player/MediaType;->$VALUES:[Lcom/discord/media_player/MediaType;

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

.method public static valueOf(Ljava/lang/String;)Lcom/discord/media_player/MediaType;
    .locals 1

    const-class v0, Lcom/discord/media_player/MediaType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/media_player/MediaType;

    return-object p0
.end method

.method public static values()[Lcom/discord/media_player/MediaType;
    .locals 1

    sget-object v0, Lcom/discord/media_player/MediaType;->$VALUES:[Lcom/discord/media_player/MediaType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/media_player/MediaType;

    return-object v0
.end method
