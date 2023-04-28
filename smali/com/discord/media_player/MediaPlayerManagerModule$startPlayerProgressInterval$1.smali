.class final Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media_player/MediaPlayerManagerModule;->startPlayerProgressInterval(DLcom/discord/media_player/MediaPlayer;)V
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
    c = "com.discord.media_player.MediaPlayerManagerModule$startPlayerProgressInterval$1"
    f = "MediaPlayerManagerModule.kt"
    l = {
        0x77,
        0x80
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $mediaPlayer:Lcom/discord/media_player/MediaPlayer;

.field final synthetic $portal:D

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/media_player/MediaPlayerManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/media_player/MediaPlayer;Lcom/discord/media_player/MediaPlayerManagerModule;DLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media_player/MediaPlayer;",
            "Lcom/discord/media_player/MediaPlayerManagerModule;",
            "D",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    iput-object p2, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    iput-wide p3, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$portal:D

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v6, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;

    iget-object v1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    iget-object v2, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    iget-wide v3, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$portal:D

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;-><init>(Lcom/discord/media_player/MediaPlayer;Lcom/discord/media_player/MediaPlayerManagerModule;DLkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 18
    .line 19
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    iget-object v1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 35
    .line 36
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    move-object v1, p0

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 48
    .line 49
    :goto_0
    move-object v1, p0

    .line 50
    :cond_3
    invoke-static {p1}, Lkotlinx/coroutines/k0;->h(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_5

    .line 55
    .line 56
    invoke-static {}, Lkotlinx/coroutines/y0;->c()Lkotlinx/coroutines/f2;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    new-instance v11, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1$1;

    .line 61
    .line 62
    iget-object v6, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$mediaPlayer:Lcom/discord/media_player/MediaPlayer;

    .line 63
    .line 64
    iget-object v7, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->this$0:Lcom/discord/media_player/MediaPlayerManagerModule;

    .line 65
    .line 66
    iget-wide v8, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->$portal:D

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v5, v11

    .line 70
    invoke-direct/range {v5 .. v10}, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1$1;-><init>(Lcom/discord/media_player/MediaPlayer;Lcom/discord/media_player/MediaPlayerManagerModule;DLkotlin/coroutines/Continuation;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput v3, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->label:I

    .line 76
    .line 77
    invoke-static {v4, v11, v1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-ne v4, v0, :cond_4

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    :goto_1
    iput-object p1, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->L$0:Ljava/lang/Object;

    .line 85
    .line 86
    iput v2, v1, Lcom/discord/media_player/MediaPlayerManagerModule$startPlayerProgressInterval$1;->label:I

    .line 87
    .line 88
    const-wide/16 v4, 0x64

    .line 89
    .line 90
    invoke-static {v4, v5, v1}, Lkotlinx/coroutines/t0;->a(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-ne v4, v0, :cond_3

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p1
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
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
