.class public final Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0008\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\r\u001a9\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroid/content/Context;",
        "",
        "uri",
        "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
        "postProcessor",
        "Lkotlin/Function1;",
        "Landroid/graphics/Bitmap;",
        "",
        "onDecodedImage",
        "fetchDecodedImage",
        "Landroid/net/Uri;",
        "",
        "copyBitmap",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;",
        "executorSupplier",
        "Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;",
        "fresco_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final executorSupplier:Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;-><init>(I)V

    sput-object v0, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->executorSupplier:Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    return-void
.end method

.method public static final synthetic access$getExecutorSupplier$p()Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;
    .locals 1

    sget-object v0, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->executorSupplier:Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    return-object v0
.end method

.method public static final fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 12
    new-instance v0, Lkotlinx/coroutines/p;

    invoke-static {p4}, Ltf/b;->c(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkotlinx/coroutines/p;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 13
    invoke-virtual {v0}, Lkotlinx/coroutines/p;->C()V

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 14
    invoke-static {v1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    move-result-object p1

    if-eqz p2, :cond_1

    .line 16
    invoke-interface {p2}, Lcom/discord/image/fresco/postprocessors/PostProcessor;->create()Lcom/facebook/imagepipeline/request/BasePostprocessor;

    move-result-object v1

    :cond_1
    invoke-virtual {p1, v1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->A(Lcom/facebook/imagepipeline/request/Postprocessor;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    move-result-object p1

    .line 17
    invoke-static {}, Ll4/c;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    move-result-object p2

    .line 18
    invoke-virtual {p2, p1, p0}, Lcom/facebook/imagepipeline/core/ImagePipeline;->d(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Lcom/facebook/datasource/DataSource;

    move-result-object p0

    .line 19
    new-instance p1, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$6$subscriber$1;

    invoke-direct {p1, v0, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$6$subscriber$1;-><init>(Lkotlinx/coroutines/CancellableContinuation;Z)V

    .line 20
    invoke-static {}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->access$getExecutorSupplier$p()Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    move-result-object p2

    invoke-virtual {p2}, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;->d()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lcom/facebook/datasource/DataSource;->d(Lcom/facebook/datasource/d;Ljava/util/concurrent/Executor;)V

    .line 21
    new-instance p1, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$6$1;

    invoke-direct {p1, p0}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$6$1;-><init>(Lcom/facebook/datasource/DataSource;)V

    invoke-interface {v0, p1}, Lkotlinx/coroutines/CancellableContinuation;->k(Lkotlin/jvm/functions/Function1;)V

    .line 22
    :goto_0
    invoke-virtual {v0}, Lkotlinx/coroutines/p;->y()Ljava/lang/Object;

    move-result-object p0

    .line 23
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/g;->c(Lkotlin/coroutines/Continuation;)V

    :cond_2
    return-object p0
.end method

.method public static final fetchDecodedImage(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 10
    :try_start_0
    sget-object v0, Lnf/s;->l:Lnf/s$a;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lnf/s;->l:Lnf/s$a;

    invoke-static {p1}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lnf/s;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Landroid/net/Uri;

    .line 11
    invoke-static {p0, p1, p2, p3, p4}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDecodedImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 3
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 4
    :cond_0
    invoke-static {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->s(Landroid/net/Uri;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    move-result-object p1

    if-eqz p2, :cond_1

    .line 5
    invoke-interface {p2}, Lcom/discord/image/fresco/postprocessors/PostProcessor;->create()Lcom/facebook/imagepipeline/request/BasePostprocessor;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->A(Lcom/facebook/imagepipeline/request/Postprocessor;)Lcom/facebook/imagepipeline/request/ImageRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/ImageRequestBuilder;->a()Lcom/facebook/imagepipeline/request/ImageRequest;

    move-result-object p1

    .line 6
    invoke-static {}, Ll4/c;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    move-result-object p2

    invoke-virtual {p2, p1, p0}, Lcom/facebook/imagepipeline/core/ImagePipeline;->d(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Lcom/facebook/datasource/DataSource;

    move-result-object p0

    .line 7
    new-instance p1, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$2;

    invoke-direct {p1, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt$fetchDecodedImage$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 8
    sget-object p2, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->executorSupplier:Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;

    invoke-virtual {p2}, Lcom/facebook/imagepipeline/core/DefaultExecutorSupplier;->d()Ljava/util/concurrent/Executor;

    move-result-object p2

    .line 9
    invoke-interface {p0, p1, p2}, Lcom/facebook/datasource/DataSource;->d(Lcom/facebook/datasource/d;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static final fetchDecodedImage(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/discord/image/fresco/postprocessors/PostProcessor;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDecodedImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    :try_start_0
    sget-object v0, Lnf/s;->l:Lnf/s$a;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    sget-object v0, Lnf/s;->l:Lnf/s$a;

    invoke-static {p1}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lnf/s;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    check-cast p1, Landroid/net/Uri;

    .line 2
    invoke-static {p0, p1, p2, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic fetchDecodedImage$default(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x0

    .line 4
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic fetchDecodedImage$default(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic fetchDecodedImage$default(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Landroid/net/Uri;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic fetchDecodedImage$default(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/discord/image/fresco/FrescoFetchDecodedImageKt;->fetchDecodedImage(Landroid/content/Context;Ljava/lang/String;Lcom/discord/image/fresco/postprocessors/PostProcessor;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
