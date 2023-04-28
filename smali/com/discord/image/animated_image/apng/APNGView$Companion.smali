.class public final Lcom/discord/image/animated_image/apng/APNGView$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/animated_image/apng/APNGView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/discord/image/animated_image/apng/APNGView$Companion;",
        "",
        "()V",
        "nameRegex",
        "Lkotlin/text/Regex;",
        "getFilename",
        "",
        "url",
        "hasFilename",
        "",
        "animated_image_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/image/animated_image/apng/APNGView$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$getFilename(Lcom/discord/image/animated_image/apng/APNGView$Companion;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/image/animated_image/apng/APNGView$Companion;->getFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$hasFilename(Lcom/discord/image/animated_image/apng/APNGView$Companion;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/image/animated_image/apng/APNGView$Companion;->hasFilename(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final getFilename(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/discord/image/animated_image/apng/APNGView;->access$getNameRegex$cp()Lkotlin/text/Regex;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlin/text/MatchResult;->b()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/collections/h;->W(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_1

    :cond_0
    const-string p1, ""

    :cond_1
    return-object p1
.end method

.method private final hasFilename(Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/discord/image/animated_image/apng/APNGView$Companion;->getFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lri/l;->w(Ljava/lang/CharSequence;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
