.class final Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/ContentResolverMedia$Companion;->getMedia(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILjava/lang/Integer;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/net/Uri;",
        "Ljava/util/List<",
        "+",
        "Lcom/discord/media/utils/ContentResolverMedia;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/discord/media/utils/ContentResolverMedia;",
        "contentUri",
        "Landroid/net/Uri;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $queryLimit:I

.field final synthetic $queryOffset:Ljava/lang/Integer;

.field final synthetic $queryType:Lcom/discord/media/utils/ContentResolverMedia$QueryType;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILjava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryType:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    iput p3, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryLimit:I

    iput-object p4, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryOffset:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroid/net/Uri;

    invoke-virtual {p0, p1}, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->invoke(Landroid/net/Uri;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Landroid/net/Uri;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            ")",
            "Ljava/util/List<",
            "Lcom/discord/media/utils/ContentResolverMedia;",
            ">;"
        }
    .end annotation

    const-string v0, "contentUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v1, Lcom/discord/media/utils/ContentResolverMedia;->Companion:Lcom/discord/media/utils/ContentResolverMedia$Companion;

    iget-object v2, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryType:Lcom/discord/media/utils/ContentResolverMedia$QueryType;

    iget v4, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryLimit:I

    iget-object v6, p0, Lcom/discord/media/utils/ContentResolverMedia$Companion$getMedia$performQuery$1;->$queryOffset:Ljava/lang/Integer;

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Lcom/discord/media/utils/ContentResolverMedia$Companion;->access$queryMedia(Lcom/discord/media/utils/ContentResolverMedia$Companion;Landroid/content/Context;Lcom/discord/media/utils/ContentResolverMedia$QueryType;ILandroid/net/Uri;Ljava/lang/Integer;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
