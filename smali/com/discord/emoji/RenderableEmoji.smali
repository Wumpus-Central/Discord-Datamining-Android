.class public abstract Lcom/discord/emoji/RenderableEmoji;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/emoji/RenderableEmoji$Companion;,
        Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;,
        Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;,
        Lcom/discord/emoji/RenderableEmoji$Unicode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \n2\u00020\u0001:\u0004\n\u000b\u000c\rB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/discord/emoji/RenderableEmoji;",
        "",
        "()V",
        "getContentDescription",
        "",
        "getUrl",
        "allowAnimation",
        "",
        "sizePx",
        "",
        "Companion",
        "CustomWithEmojiId",
        "CustomWithUrl",
        "Unicode",
        "Lcom/discord/emoji/RenderableEmoji$CustomWithEmojiId;",
        "Lcom/discord/emoji/RenderableEmoji$CustomWithUrl;",
        "Lcom/discord/emoji/RenderableEmoji$Unicode;",
        "emoji_release"
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
.field public static final Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

.field private static final exceptions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/emoji/RenderableEmoji$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/emoji/RenderableEmoji;->Companion:Lcom/discord/emoji/RenderableEmoji$Companion;

    .line 8
    .line 9
    const-string v0, "\u00a9"

    .line 10
    .line 11
    const-string v1, "\u00ae"

    .line 12
    .line 13
    const-string v2, "\u2122"

    .line 14
    .line 15
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/discord/emoji/RenderableEmoji;->exceptions:Ljava/util/Set;

    .line 24
    .line 25
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/emoji/RenderableEmoji;-><init>()V

    return-void
.end method

.method public static final synthetic access$getExceptions$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/discord/emoji/RenderableEmoji;->exceptions:Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public abstract getContentDescription()Ljava/lang/String;
.end method

.method public abstract getUrl(ZI)Ljava/lang/String;
.end method
