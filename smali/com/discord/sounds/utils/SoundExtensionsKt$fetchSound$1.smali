.class final Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/sounds/utils/SoundExtensionsKt;->fetchSound(Landroid/content/Context;Ljava/lang/String;Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;)V
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
    c = "com.discord.sounds.utils.SoundExtensionsKt$fetchSound$1"
    f = "SoundExtensions.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $key:I

.field final synthetic $soundDirectory:Ljava/io/File;

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

.field final synthetic $url:Ljava/lang/String;

.field final synthetic $usage:I

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lcom/discord/sounds/SoundManager;",
            "II",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$fileName:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundDirectory:Ljava/io/File;

    iput-object p5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iput p6, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$key:I

    iput p7, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$usage:I

    iput-object p8, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 10
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

    new-instance p1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;

    iget-object v1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$url:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$fileName:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundDirectory:Ljava/io/File;

    iget-object v5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    iget v6, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$key:I

    iget v7, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$usage:I

    iget-object v8, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    move-object v0, p1

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object v3, Lcom/discord/file_downloader/FileDownloader;->INSTANCE:Lcom/discord/file_downloader/FileDownloader;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$context:Landroid/content/Context;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$url:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v6, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$fileName:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v7, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundDirectory:Ljava/io/File;

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/16 v9, 0x10

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    invoke-static/range {v3 .. v10}, Lcom/discord/file_downloader/FileDownloader;->downloadFile$default(Lcom/discord/file_downloader/FileDownloader;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;ZILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v1, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundManager:Lcom/discord/sounds/SoundManager;

    .line 48
    .line 49
    iget v4, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$key:I

    .line 50
    .line 51
    iget v5, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$usage:I

    .line 52
    .line 53
    iget-object v6, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->$soundResIdPrepared:Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    invoke-direct {v1, v3, v4, v5, v6}, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1$1;-><init>(Lcom/discord/sounds/SoundManager;IILkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    iput v2, p0, Lcom/discord/sounds/utils/SoundExtensionsKt$fetchSound$1;->label:I

    .line 59
    .line 60
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v0, :cond_2

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method
