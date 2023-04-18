.class final Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->setReactIcon(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;I)V
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
    c = "com.discord.react_asset_fetcher.ReactAssetUtilsKt$setReactIcon$1"
    f = "ReactAssetUtils.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $assetUrl:Ljava/lang/String;

.field final synthetic $this_setReactIcon:Lcom/google/android/material/button/MaterialButton;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/button/MaterialButton;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$this_setReactIcon:Lcom/google/android/material/button/MaterialButton;

    iput-object p2, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$assetUrl:Ljava/lang/String;

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

    new-instance p1, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;

    iget-object v0, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$this_setReactIcon:Lcom/google/android/material/button/MaterialButton;

    iget-object v1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$assetUrl:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;-><init>(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->label:I

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
    iget-object v0, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 15
    .line 16
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$this_setReactIcon:Lcom/google/android/material/button/MaterialButton;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->$assetUrl:Ljava/lang/String;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    new-instance v5, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1$1$1;

    .line 43
    .line 44
    invoke-direct {v5, p1, v1, v3}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1$1$1;-><init>(Lcom/google/android/material/button/MaterialButton;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    iput v2, p0, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt$setReactIcon$1;->label:I

    .line 50
    .line 51
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-ne v1, v0, :cond_2

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    move-object v0, p1

    .line 59
    move-object p1, v1

    .line 60
    :goto_0
    move-object v3, p1

    .line 61
    check-cast v3, Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    move-object p1, v0

    .line 64
    :cond_3
    invoke-virtual {p1, v3}, Lcom/google/android/material/button/MaterialButton;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 65
    .line 66
    .line 67
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
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
.end method
