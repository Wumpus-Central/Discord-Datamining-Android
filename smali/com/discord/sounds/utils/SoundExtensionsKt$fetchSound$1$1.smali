.class final Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $key:I

.field final synthetic $soundManager:Lcom/discord/sounds/SoundManager;

.field final synthetic $soundResIdPrepared:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $usage:I


# direct methods
.method constructor <init>(Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/sounds/SoundManager;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iput p2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$key:I

    iput p3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$usage:I

    iput-object p4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;

    iget v3, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;

    invoke-direct {v2, v1, v0}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;-><init>(Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v0, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    move-result-object v3

    .line 1
    iget v4, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lnf/t;->b(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    .line 2
    instance-of v4, v0, Lcom/discord/file_downloader/DownloadState$Completed;

    if-eqz v4, :cond_6

    .line 3
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object v4

    new-instance v6, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;

    iget-object v10, v1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iget v11, v1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$key:I

    iget v12, v1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$usage:I

    iget-object v14, v1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    move-object v9, v6

    move-object/from16 v13, p1

    invoke-direct/range {v9 .. v15}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;-><init>(Lcom/discord/sounds/SoundManager;IILcom/discord/file_downloader/DownloadState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    iput v8, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    invoke-static {v4, v6, v2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v0, v3, :cond_5

    return-object v3

    .line 4
    :goto_1
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object v4

    new-instance v6, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$2;

    invoke-direct {v6, v0, v5}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$2;-><init>(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)V

    iput v7, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    invoke-static {v4, v6, v2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    return-object v3

    .line 5
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 6
    :cond_6
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object v0

    new-instance v4, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$3;

    invoke-direct {v4, v5}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$3;-><init>(Lkotlin/coroutines/Continuation;)V

    iput v6, v2, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$emit$1;->label:I

    invoke-static {v0, v4, v2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    return-object v3

    :cond_7
    :goto_3
    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 7
    check-cast p1, Lcom/discord/file_downloader/DownloadState;

    invoke-virtual {p0, p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
