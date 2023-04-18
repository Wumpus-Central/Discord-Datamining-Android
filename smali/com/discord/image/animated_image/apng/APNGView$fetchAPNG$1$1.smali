.class final Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "downloadState",
        "Lcom/discord/file_downloader/DownloadState;",
        "emit",
        "(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
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
.field final synthetic $config:Lcom/discord/image/animated_image/apng/APNGView$Config;

.field final synthetic this$0:Lcom/discord/image/animated_image/apng/APNGView;


# direct methods
.method constructor <init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/discord/image/animated_image/apng/APNGView$Config;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iput-object p2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/file_downloader/DownloadState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;

    iget v1, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;-><init>(Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;

    :try_start_0
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_2

    :cond_4
    invoke-static {p2}, Llf/t;->b(Ljava/lang/Object;)V

    .line 2
    instance-of p2, p1, Lcom/discord/file_downloader/DownloadState$Completed;

    if-eqz p2, :cond_5

    .line 3
    :try_start_1
    sget-object v7, Lcom/linecorp/apng/ApngDrawable;->C:Lcom/linecorp/apng/ApngDrawable$b;

    .line 4
    check-cast p1, Lcom/discord/file_downloader/DownloadState$Completed;

    invoke-virtual {p1}, Lcom/discord/file_downloader/DownloadState$Completed;->getFile()Ljava/io/File;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    .line 5
    invoke-static/range {v7 .. v12}, Lcom/linecorp/apng/ApngDrawable$b;->c(Lcom/linecorp/apng/ApngDrawable$b;Ljava/io/File;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/linecorp/apng/ApngDrawable;

    move-result-object p1

    .line 6
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object p2

    new-instance v2, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;

    iget-object v3, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iget-object v7, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-direct {v2, v3, p1, v7, v6}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$1;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/linecorp/apng/ApngDrawable;Lcom/discord/image/animated_image/apng/APNGView$Config;Lkotlin/coroutines/Continuation;)V

    iput-object p0, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_7

    return-object v1

    :catch_0
    move-object p1, p0

    .line 7
    :catch_1
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object p2

    new-instance v2, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$2;

    iget-object p1, p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    invoke-direct {v2, p1, v6}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$2;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lkotlin/coroutines/Continuation;)V

    iput-object v6, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    .line 8
    :cond_5
    instance-of p1, p1, Lcom/discord/file_downloader/DownloadState$Failure;

    if-eqz p1, :cond_7

    .line 9
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object p1

    new-instance p2, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$3;

    iget-object v2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    invoke-direct {p2, v2, v6}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$3;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lkotlin/coroutines/Continuation;)V

    iput v3, v0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1$emit$1;->label:I

    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    .line 10
    :cond_6
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 11
    check-cast p1, Lcom/discord/file_downloader/DownloadState;

    invoke-virtual {p0, p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;->emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
