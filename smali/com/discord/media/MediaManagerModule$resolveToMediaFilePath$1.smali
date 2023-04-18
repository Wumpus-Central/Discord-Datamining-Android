.class final Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/media/MediaManagerModule;->resolveToMediaFilePath(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V
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
    c = "com.discord.media.MediaManagerModule$resolveToMediaFilePath$1"
    f = "MediaManagerModule.kt"
    l = {
        0x4b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $canCancelCompression:Z

.field final synthetic $imageCompressionQuality:I

.field final synthetic $inputUri:Landroid/net/Uri;

.field final synthetic $isLowQuality:Z

.field final synthetic $promise:Lcom/facebook/react/bridge/Promise;

.field final synthetic $uri:Ljava/lang/String;

.field final synthetic $videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/discord/media/MediaManagerModule;


# direct methods
.method constructor <init>(Lcom/discord/media/MediaManagerModule;Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLcom/facebook/react/bridge/Promise;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/media/MediaManagerModule;",
            "Landroid/net/Uri;",
            "I",
            "Lcom/discord/media/utils/VideoCompressionQuality;",
            "Z",
            "Lcom/facebook/react/bridge/Promise;",
            "Z",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->this$0:Lcom/discord/media/MediaManagerModule;

    iput-object p2, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$inputUri:Landroid/net/Uri;

    iput p3, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$imageCompressionQuality:I

    iput-object p4, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    iput-boolean p5, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$isLowQuality:Z

    iput-object p6, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iput-boolean p7, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$canCancelCompression:Z

    iput-object p8, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$uri:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 11
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

    new-instance v10, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;

    iget-object v1, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->this$0:Lcom/discord/media/MediaManagerModule;

    iget-object v2, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$inputUri:Landroid/net/Uri;

    iget v3, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$imageCompressionQuality:I

    iget-object v4, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    iget-boolean v5, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$isLowQuality:Z

    iget-object v6, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$promise:Lcom/facebook/react/bridge/Promise;

    iget-boolean v7, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$canCancelCompression:Z

    iget-object v8, p0, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$uri:Ljava/lang/String;

    move-object v0, v10

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;-><init>(Lcom/discord/media/MediaManagerModule;Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLcom/facebook/react/bridge/Promise;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v10, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->L$0:Ljava/lang/Object;

    return-object v10
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->label:I

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const-string v9, "inputUri"

    .line 11
    .line 12
    const/4 v10, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    if-ne v1, v10, :cond_0

    .line 16
    .line 17
    iget-object v0, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->L$0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/facebook/react/bridge/Promise;

    .line 20
    .line 21
    :try_start_0
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 41
    .line 42
    iget-object v1, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->this$0:Lcom/discord/media/MediaManagerModule;

    .line 43
    .line 44
    iget-object v2, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$inputUri:Landroid/net/Uri;

    .line 45
    .line 46
    iget v3, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$imageCompressionQuality:I

    .line 47
    .line 48
    iget-object v4, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$videoCompressionQuality:Lcom/discord/media/utils/VideoCompressionQuality;

    .line 49
    .line 50
    iget-boolean v5, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$isLowQuality:Z

    .line 51
    .line 52
    iget-object v11, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 53
    .line 54
    :try_start_1
    sget-object v6, Llf/s;->l:Llf/s$a;

    .line 55
    .line 56
    invoke-static {v1}, Lcom/discord/media/MediaManagerModule;->access$getMediaResolver$p(Lcom/discord/media/MediaManagerModule;)Lcom/discord/media/utils/MediaResolver;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v2, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    move v5, v10

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v5, v8

    .line 68
    :goto_0
    iput-object v11, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput v10, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->label:I

    .line 71
    .line 72
    move-object/from16 v6, p0

    .line 73
    .line 74
    invoke-virtual/range {v1 .. v6}, Lcom/discord/media/utils/MediaResolver;->resolveToUri(Landroid/net/Uri;ILcom/discord/media/utils/VideoCompressionQuality;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-ne v1, v0, :cond_3

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_3
    move-object v0, v11

    .line 82
    :goto_1
    check-cast v1, Landroid/net/Uri;

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    invoke-static {v0}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    goto :goto_2

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    sget-object v1, Llf/s;->l:Llf/s$a;

    .line 100
    .line 101
    invoke-static {v0}, Llf/t;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-static {v0}, Llf/s;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :goto_2
    iget-boolean v1, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$canCancelCompression:Z

    .line 110
    .line 111
    iget-object v2, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$promise:Lcom/facebook/react/bridge/Promise;

    .line 112
    .line 113
    iget-object v3, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$uri:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v4, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->this$0:Lcom/discord/media/MediaManagerModule;

    .line 116
    .line 117
    iget-object v5, v7, Lcom/discord/media/MediaManagerModule$resolveToMediaFilePath$1;->$inputUri:Landroid/net/Uri;

    .line 118
    .line 119
    invoke-static {v0}, Llf/s;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    instance-of v6, v0, Ljava/util/concurrent/CancellationException;

    .line 126
    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_4
    throw v0

    .line 136
    :cond_5
    :goto_3
    sget-object v1, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 137
    .line 138
    const-string v12, "Failed to resolve URI to file"

    .line 139
    .line 140
    const/4 v6, 0x2

    .line 141
    new-array v6, v6, [Lkotlin/Pair;

    .line 142
    .line 143
    const-string v11, "uri"

    .line 144
    .line 145
    invoke-static {v11, v3}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    aput-object v3, v6, v8

    .line 150
    .line 151
    invoke-static {v4}, Lcom/discord/media/MediaManagerModule;->access$getMediaResolver$p(Lcom/discord/media/MediaManagerModule;)Lcom/discord/media/utils/MediaResolver;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    invoke-static {v5, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v5}, Lcom/discord/media/utils/MediaResolver;->getMimeType(Landroid/net/Uri;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    const-string v4, "mimeType"

    .line 167
    .line 168
    invoke-static {v4, v3}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    aput-object v3, v6, v10

    .line 173
    .line 174
    invoke-static {v6}, Lmf/s;->k([Lkotlin/Pair;)Ljava/util/Map;

    .line 175
    .line 176
    .line 177
    move-result-object v13

    .line 178
    const/4 v14, 0x0

    .line 179
    const/4 v15, 0x4

    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    move-object v11, v1

    .line 183
    invoke-static/range {v11 .. v16}, Lcom/discord/crash_reporting/CrashReporting;->addBreadcrumb$default(Lcom/discord/crash_reporting/CrashReporting;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v0}, Lcom/discord/crash_reporting/CrashReporting;->captureException(Ljava/lang/Throwable;)V

    .line 187
    .line 188
    .line 189
    invoke-interface {v2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    :cond_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0
.end method
