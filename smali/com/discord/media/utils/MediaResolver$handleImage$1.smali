.class final Lcom/discord/media/utils/MediaResolver$handleImage$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/utils/MediaResolver;->handleImage(Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.media.utils.MediaResolver"
    f = "MediaResolver.kt"
    l = {
        0x8b,
        0x91
    }
    m = "handleImage"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/discord/media/utils/MediaResolver;


# direct methods
.method constructor <init>(Lcom/discord/media/utils/MediaResolver;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media/utils/MediaResolver;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/media/utils/MediaResolver$handleImage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->this$0:Lcom/discord/media/utils/MediaResolver;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->label:I

    iget-object p1, p0, Lcom/discord/media/utils/MediaResolver$handleImage$1;->this$0:Lcom/discord/media/utils/MediaResolver;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1, p0}, Lcom/discord/media/utils/MediaResolver;->access$handleImage(Lcom/discord/media/utils/MediaResolver;Landroid/net/Uri;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
