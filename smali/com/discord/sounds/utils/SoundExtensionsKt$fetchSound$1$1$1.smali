.class final Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;->emit(Lcom/discord/file_downloader/DownloadState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1$1$1"
    f = "SoundExtensions.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $downloadState:Lcom/discord/file_downloader/DownloadState;

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

.field label:I


# direct methods
.method constructor <init>(Lcom/discord/sounds/SoundManager;IILcom/discord/file_downloader/DownloadState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/sounds/SoundManager;",
            "II",
            "Lcom/discord/file_downloader/DownloadState;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iput p2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$key:I

    iput p3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$usage:I

    iput-object p4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$downloadState:Lcom/discord/file_downloader/DownloadState;

    iput-object p5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;

    iget-object v1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iget v2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$key:I

    iget v3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$usage:I

    iget-object v4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$downloadState:Lcom/discord/file_downloader/DownloadState;

    iget-object v5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;-><init>(Lcom/discord/sounds/SoundManager;IILcom/discord/file_downloader/DownloadState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    .line 12
    .line 13
    iget v2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$key:I

    .line 14
    .line 15
    iget v3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$usage:I

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    iget-object p1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$downloadState:Lcom/discord/file_downloader/DownloadState;

    .line 19
    .line 20
    check-cast p1, Lcom/discord/file_downloader/DownloadState$Completed;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/discord/file_downloader/DownloadState$Completed;->getFile()Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    invoke-virtual/range {v1 .. v6}, Lcom/discord/sounds/SoundManager;->prepare(IILjava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
    .line 46
.end method
