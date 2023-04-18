.class final Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/MediaResolver;->handleVideo(Landroid/net/Uri;Lcom/discord/media/utils/VideoCompressionQuality;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Float;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic $inputUri:Landroid/net/Uri;

.field final synthetic $this_runCatching:Lcom/discord/media/utils/MediaResolver;


# direct methods
.method constructor <init>(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;->$this_runCatching:Lcom/discord/media/utils/MediaResolver;

    iput-object p2, p0, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;->$inputUri:Landroid/net/Uri;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;->invoke(F)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(F)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;->$this_runCatching:Lcom/discord/media/utils/MediaResolver;

    invoke-static {v0}, Lcom/discord/media/utils/MediaResolver;->access$getOnProgress$p(Lcom/discord/media/utils/MediaResolver;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/media/utils/MediaResolver$handleVideo$2$compressedUri$1;->$inputUri:Landroid/net/Uri;

    const/16 v2, 0x64

    int-to-float v2, v2

    mul-float/2addr p1, v2

    float-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
