.class final Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/samsung/SamsungModule;->finishSamsungAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V
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
    c = "com.discord.samsung.SamsungModule$finishSamsungAuthorization$1"
    f = "SamsungModule.kt"
    l = {
        0x97
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $authCode:Ljava/lang/String;

.field final synthetic $location:Ljava/lang/String;

.field final synthetic $state:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/samsung/SamsungModule;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/discord/samsung/SamsungModule;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/discord/samsung/SamsungModule;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$location:Ljava/lang/String;

    iput-object p2, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->this$0:Lcom/discord/samsung/SamsungModule;

    iput-object p3, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$state:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$authCode:Ljava/lang/String;

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

    new-instance v6, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;

    iget-object v1, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$location:Ljava/lang/String;

    iget-object v2, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->this$0:Lcom/discord/samsung/SamsungModule;

    iget-object v3, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$state:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$authCode:Ljava/lang/String;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;-><init>(Ljava/lang/String;Lcom/discord/samsung/SamsungModule;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->label:I

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
    :try_start_0
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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
    invoke-static {p1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    .line 30
    .line 31
    iget-object v4, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$location:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 34
    .line 35
    iget-object v7, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$state:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v8, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->$authCode:Ljava/lang/String;

    .line 38
    .line 39
    :try_start_1
    sget-object p1, Lnf/s;->l:Lnf/s$a;

    .line 40
    .line 41
    new-instance p1, Lokhttp3/OkHttpClient$Builder;

    .line 42
    .line 43
    invoke-direct {p1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {p1, v1}, Lokhttp3/OkHttpClient$Builder;->i(Z)Lokhttp3/OkHttpClient$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->c()Lokhttp3/OkHttpClient;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v1, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1$1$1;

    .line 60
    .line 61
    const/4 v9, 0x0

    .line 62
    move-object v3, v1

    .line 63
    invoke-direct/range {v3 .. v9}, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1$1$1;-><init>(Ljava/lang/String;Lcom/discord/samsung/SamsungModule;Lokhttp3/OkHttpClient;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 64
    .line 65
    .line 66
    iput v2, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->label:I

    .line 67
    .line 68
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    sget-object v0, Lnf/s;->l:Lnf/s$a;

    .line 84
    .line 85
    invoke-static {p1}, Lnf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p1}, Lnf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    iget-object v0, p0, Lcom/discord/samsung/SamsungModule$finishSamsungAuthorization$1;->this$0:Lcom/discord/samsung/SamsungModule;

    .line 94
    .line 95
    invoke-static {p1}, Lnf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 102
    .line 103
    if-nez v1, :cond_3

    .line 104
    .line 105
    invoke-static {v0, p1}, Lcom/discord/samsung/SamsungModule;->access$rejectConnection(Lcom/discord/samsung/SamsungModule;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    throw p1

    .line 110
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p1
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
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method
