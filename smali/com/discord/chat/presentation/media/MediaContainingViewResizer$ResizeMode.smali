.class public final enum Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/presentation/media/MediaContainingViewResizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ResizeMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;",
        "",
        "(Ljava/lang/String;I)V",
        "Fill",
        "Wrap",
        "Cover",
        "chat_release"
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
.field private static final synthetic $VALUES:[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

.field public static final enum Cover:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

.field public static final enum Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

.field public static final enum Wrap:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;


# direct methods
.method private static final synthetic $values()[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    const/4 v1, 0x0

    sget-object v2, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Wrap:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Cover:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    aput-object v2, v0, v1

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    const-string v1, "Fill"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    new-instance v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    const-string v1, "Wrap"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Wrap:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    new-instance v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    const-string v1, "Cover"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Cover:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    invoke-static {}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->$values()[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    move-result-object v0

    sput-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->$VALUES:[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

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

.method public static valueOf(Ljava/lang/String;)Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;
    .locals 1

    const-class v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    return-object p0
.end method

.method public static values()[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;
    .locals 1

    sget-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->$VALUES:[Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    return-object v0
.end method
