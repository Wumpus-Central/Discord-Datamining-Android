.class final Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

.field final synthetic this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;


# direct methods
.method constructor <init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    iput-object p2, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
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

    .line 2
    instance-of v0, p1, Lcom/discord/file_downloader/DownloadState$Completed;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 3
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object v0

    new-instance v2, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2$1;

    iget-object v3, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    iget-object v4, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->$config:Lcom/discord/sticker/sticker_types/RLottieImageView$Config;

    invoke-direct {v2, v3, p1, v4, v1}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2$1;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lcom/discord/file_downloader/DownloadState;Lcom/discord/sticker/sticker_types/RLottieImageView$Config;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2, p2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    .line 4
    :cond_1
    instance-of p1, p1, Lcom/discord/file_downloader/DownloadState$Failure;

    if-eqz p1, :cond_3

    .line 5
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    move-result-object p1

    new-instance v0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2$2;

    iget-object v2, p0, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->this$0:Lcom/discord/sticker/sticker_types/RLottieImageView;

    invoke-direct {v0, v2, v1}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2$2;-><init>(Lcom/discord/sticker/sticker_types/RLottieImageView;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0, p2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    .line 6
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/discord/file_downloader/DownloadState;

    invoke-virtual {p0, p1, p2}, Lcom/discord/sticker/sticker_types/RLottieImageView$fetchSticker$1$2;->emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
