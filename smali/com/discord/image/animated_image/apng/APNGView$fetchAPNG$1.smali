.class final Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/image/animated_image/apng/APNGView;->fetchAPNG(Lcom/discord/image/animated_image/apng/APNGView$Config;)V
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
    c = "com.discord.image.animated_image.apng.APNGView$fetchAPNG$1"
    f = "APNGView.kt"
    l = {
        0x52
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $config:Lcom/discord/image/animated_image/apng/APNGView$Config;

.field label:I

.field final synthetic this$0:Lcom/discord/image/animated_image/apng/APNGView;


# direct methods
.method constructor <init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/discord/image/animated_image/apng/APNGView$Config;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/image/animated_image/apng/APNGView;",
            "Lcom/discord/image/animated_image/apng/APNGView$Config;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iput-object p2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;

    iget-object v0, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    iget-object v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    invoke-direct {p1, v0, v1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/discord/image/animated_image/apng/APNGView$Config;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->label:I

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
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string p1, "context"

    .line 36
    .line 37
    invoke-static {v4, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/discord/image/animated_image/apng/APNGView$Config;->getUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    sget-object p1, Lcom/discord/image/animated_image/apng/APNGView;->Companion:Lcom/discord/image/animated_image/apng/APNGView$Companion;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/discord/image/animated_image/apng/APNGView$Config;->getUrl()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {p1, v1}, Lcom/discord/image/animated_image/apng/APNGView$Companion;->access$getFilename(Lcom/discord/image/animated_image/apng/APNGView$Companion;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    new-instance v7, Ljava/io/File;

    .line 59
    .line 60
    iget-object p1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-object v1, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/discord/image/animated_image/apng/APNGView$Config;->getCacheDirectory()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v7, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/16 v9, 0x10

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    invoke-static/range {v3 .. v10}, Lcom/discord/file_downloader/FileDownloader;->downloadFile$default(Lcom/discord/file_downloader/FileDownloader;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;ZILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance v1, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;

    .line 88
    .line 89
    iget-object v3, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->this$0:Lcom/discord/image/animated_image/apng/APNGView;

    .line 90
    .line 91
    iget-object v4, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->$config:Lcom/discord/image/animated_image/apng/APNGView$Config;

    .line 92
    .line 93
    invoke-direct {v1, v3, v4}, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1$1;-><init>(Lcom/discord/image/animated_image/apng/APNGView;Lcom/discord/image/animated_image/apng/APNGView$Config;)V

    .line 94
    .line 95
    .line 96
    iput v2, p0, Lcom/discord/image/animated_image/apng/APNGView$fetchAPNG$1;->label:I

    .line 97
    .line 98
    invoke-interface {p1, v1, p0}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v0, :cond_2

    .line 103
    .line 104
    return-object v0

    .line 105
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p1
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
.end method
