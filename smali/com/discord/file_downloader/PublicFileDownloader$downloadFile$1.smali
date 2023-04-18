.class final Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/file_downloader/PublicFileDownloader;->downloadFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-",
        "Lcom/discord/file_downloader/DownloadState;",
        ">;",
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/channels/ProducerScope;",
        "Lcom/discord/file_downloader/DownloadState;",
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
    c = "com.discord.file_downloader.PublicFileDownloader$downloadFile$1"
    f = "PublicFileDownloader.kt"
    l = {
        0x1d,
        0x25,
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $description:Ljava/lang/String;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $url:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$url:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    iput-object p4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$description:Ljava/lang/String;

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

    new-instance v6, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;

    iget-object v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$url:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    iget-object v4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$description:Ljava/lang/String;

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lcom/discord/file_downloader/DownloadState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->label:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    if-eq v1, v5, :cond_2

    .line 14
    .line 15
    if-eq v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_7

    .line 23
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
    iget-object v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Lkotlinx/coroutines/channels/ProducerScope;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :catch_0
    move-exception p1

    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Lkotlinx/coroutines/channels/ProducerScope;

    .line 51
    .line 52
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    .line 63
    .line 64
    sget-object v1, Lcom/discord/file_downloader/DownloadState$InProgress;->INSTANCE:Lcom/discord/file_downloader/DownloadState$InProgress;

    .line 65
    .line 66
    iput-object p1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput v5, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->label:I

    .line 69
    .line 70
    invoke-interface {p1, v1, p0}, Lsi/x;->o(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-ne v1, v0, :cond_4

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_4
    :goto_0
    iget-object v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$context:Landroid/content/Context;

    .line 78
    .line 79
    const-string v6, "download"

    .line 80
    .line 81
    invoke-virtual {v1, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v6, "null cannot be cast to non-null type android.app.DownloadManager"

    .line 86
    .line 87
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    check-cast v1, Landroid/app/DownloadManager;

    .line 91
    .line 92
    new-instance v6, Lkotlin/jvm/internal/Ref$LongRef;

    .line 93
    .line 94
    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 95
    .line 96
    .line 97
    const-wide/16 v7, -0x1

    .line 98
    .line 99
    iput-wide v7, v6, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 100
    .line 101
    :try_start_1
    sget-object v7, Lcom/discord/file_downloader/PublicFileDownloader;->INSTANCE:Lcom/discord/file_downloader/PublicFileDownloader;

    .line 102
    .line 103
    iget-object v8, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$url:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v9, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v10, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$description:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v7, v8, v9, v10}, Lcom/discord/file_downloader/PublicFileDownloader;->access$getFileDownloadRequest(Lcom/discord/file_downloader/PublicFileDownloader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v1, v7}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    iput-wide v7, v6, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 118
    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    cmp-long v9, v7, v9

    .line 122
    .line 123
    if-nez v9, :cond_5

    .line 124
    .line 125
    :goto_1
    move v7, v5

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    const-wide/16 v9, 0x1

    .line 128
    .line 129
    cmp-long v7, v7, v9

    .line 130
    .line 131
    if-nez v7, :cond_6

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    const/4 v7, 0x0

    .line 135
    :goto_2
    if-eqz v7, :cond_8

    .line 136
    .line 137
    new-instance v1, Lcom/discord/file_downloader/DownloadState$Failure;

    .line 138
    .line 139
    new-instance v7, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    const-string v8, "Download Manager returned an invalid download id"

    .line 142
    .line 143
    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v1, v7}, Lcom/discord/file_downloader/DownloadState$Failure;-><init>(Ljava/lang/Exception;)V

    .line 147
    .line 148
    .line 149
    iput-object p1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v6, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    iput v3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->label:I

    .line 154
    .line 155
    invoke-interface {p1, v1, p0}, Lsi/x;->o(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 159
    if-ne v1, v0, :cond_7

    .line 160
    .line 161
    return-object v0

    .line 162
    :cond_7
    move-object v3, p1

    .line 163
    move-object v1, v6

    .line 164
    :goto_3
    :try_start_2
    invoke-static {v3, v4, v5, v4}, Lsi/x$a;->a(Lsi/x;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_8
    :try_start_3
    invoke-static {}, Lcom/discord/file_downloader/PublicFileDownloader;->access$getOnDownloadListeners$p()Ljava/util/Map;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    iget-wide v7, v6, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 173
    .line 174
    invoke-static {v7, v8}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    new-instance v8, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;

    .line 179
    .line 180
    iget-object v9, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    .line 181
    .line 182
    invoke-direct {v8, v6, p1, v1, v9}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;-><init>(Lkotlin/jvm/internal/Ref$LongRef;Lkotlinx/coroutines/channels/ProducerScope;Landroid/app/DownloadManager;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 186
    .line 187
    .line 188
    goto :goto_6

    .line 189
    :catch_1
    move-exception v1

    .line 190
    move-object v3, p1

    .line 191
    move-object p1, v1

    .line 192
    move-object v1, v6

    .line 193
    :goto_4
    new-instance v6, Lcom/discord/file_downloader/DownloadState$Failure;

    .line 194
    .line 195
    invoke-direct {v6, p1}, Lcom/discord/file_downloader/DownloadState$Failure;-><init>(Ljava/lang/Exception;)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v3, v6}, Lsi/x;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-static {v3, v4, v5, v4}, Lsi/x$a;->a(Lsi/x;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    :goto_5
    move-object v6, v1

    .line 205
    move-object p1, v3

    .line 206
    :goto_6
    new-instance v1, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$2;

    .line 207
    .line 208
    invoke-direct {v1, v6}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$2;-><init>(Lkotlin/jvm/internal/Ref$LongRef;)V

    .line 209
    .line 210
    .line 211
    iput-object v4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    .line 214
    .line 215
    iput v2, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->label:I

    .line 216
    .line 217
    invoke-static {p1, v1, p0}, Lsi/q;->a(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    if-ne p1, v0, :cond_9

    .line 222
    .line 223
    return-object v0

    .line 224
    :cond_9
    :goto_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p1
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
.end method
