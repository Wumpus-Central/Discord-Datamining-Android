.class final Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/MediaResolver;->handleImage(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lid/zelory/compressor/constraint/Compression;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lid/zelory/compressor/constraint/Compression;",
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
.field final synthetic $compressionQuality:I

.field final synthetic $shouldResize:Z


# direct methods
.method constructor <init>(IZ)V
    .locals 0

    iput p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;->$compressionQuality:I

    iput-boolean p2, p0, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;->$shouldResize:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lid/zelory/compressor/constraint/Compression;

    invoke-virtual {p0, p1}, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;->invoke(Lid/zelory/compressor/constraint/Compression;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lid/zelory/compressor/constraint/Compression;)V
    .locals 3

    const-string v0, "$this$compress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/discord/media/utils/QualityAndResolutionConstraint;

    iget v1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;->$compressionQuality:I

    iget-boolean v2, p0, Lcom/discord/media/utils/MediaResolver$handleImage$compressed$1;->$shouldResize:Z

    invoke-direct {v0, v1, v2}, Lcom/discord/media/utils/QualityAndResolutionConstraint;-><init>(IZ)V

    invoke-virtual {p1, v0}, Lid/zelory/compressor/constraint/Compression;->a(Lkf/a;)V

    return-void
.end method
