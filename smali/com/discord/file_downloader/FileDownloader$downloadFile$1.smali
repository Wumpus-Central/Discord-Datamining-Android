.class final Lcom/discord/file_downloader/FileDownloader$downloadFile$1;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/file_downloader/FileDownloader;->downloadFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Z)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/flow/FlowCollector<",
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
        "Lkotlinx/coroutines/flow/FlowCollector;",
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
    c = "com.discord.file_downloader.FileDownloader$downloadFile$1"
    f = "FileDownloader.kt"
    l = {
        0x34,
        0x38,
        0x40,
        0x47,
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $downloadDirectory:Ljava/io/File;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $fileUrl:Ljava/lang/String;

.field final synthetic $logErrors:Z

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/discord/file_downloader/FileDownloader$downloadFile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$downloadDirectory:Ljava/io/File;

    iput-object p2, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    iput-object p3, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileUrl:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$logErrors:Z

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

    new-instance v6, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;

    iget-object v1, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$downloadDirectory:Ljava/io/File;

    iget-object v2, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    iget-object v3, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileUrl:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$logErrors:Z

    move-object v0, v6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    iput-object p1, v6, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    return-object v6
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/flow/FlowCollector;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/FlowCollector<",
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

    invoke-virtual {p0, p1, p2}, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    move-result-object v2

    .line 1
    iget v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_6

    if-eq v0, v8, :cond_5

    if-eq v0, v6, :cond_3

    if-eq v0, v5, :cond_2

    if-eq v0, v4, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    :try_start_0
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlinx/coroutines/flow/FlowCollector;

    goto :goto_0

    :cond_2
    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlinx/coroutines/flow/FlowCollector;

    :goto_0
    :try_start_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v4

    goto/16 :goto_8

    :catch_0
    move-exception v0

    move-object v9, v4

    goto/16 :goto_5

    :cond_3
    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    :cond_4
    move-object v6, v0

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/flow/FlowCollector;

    .line 2
    new-instance v9, Ljava/io/File;

    iget-object v10, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$downloadDirectory:Ljava/io/File;

    iget-object v11, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    invoke-direct {v9, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 3
    invoke-virtual {v9}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v10

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    move-result v10

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 4
    :cond_7
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_9

    .line 5
    new-instance v3, Lcom/discord/file_downloader/DownloadState$Completed;

    invoke-direct {v3, v9}, Lcom/discord/file_downloader/DownloadState$Completed;-><init>(Ljava/io/File;)V

    iput v8, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    invoke-interface {v0, v3, v1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_8

    return-object v2

    .line 6
    :cond_8
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 7
    :cond_9
    sget-object v9, Lcom/discord/file_downloader/DownloadState$InProgress;->INSTANCE:Lcom/discord/file_downloader/DownloadState$InProgress;

    iput-object v0, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    iput v6, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    invoke-interface {v0, v9, v1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_4

    return-object v2

    .line 8
    :goto_2
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 9
    :try_start_2
    sget-object v10, Lcom/discord/file_downloader/FileDownloader;->INSTANCE:Lcom/discord/file_downloader/FileDownloader;

    iget-object v11, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileUrl:Ljava/lang/String;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x6

    const/4 v15, 0x0

    invoke-static/range {v10 .. v15}, Lcom/discord/file_downloader/FileDownloader;->downloadBlob$default(Lcom/discord/file_downloader/FileDownloader;Ljava/lang/String;Ljava/util/Map;Lokhttp3/OkHttpClient;ILjava/lang/Object;)Lokhttp3/Response;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Response;->b()Lokhttp3/ResponseBody;

    move-result-object v0

    iput-object v0, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    if-nez v0, :cond_b

    .line 10
    new-instance v0, Lcom/discord/file_downloader/DownloadState$Failure;

    new-instance v4, Ljava/lang/IllegalStateException;

    const-string v8, "No file found"

    invoke-direct {v4, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v4}, Lcom/discord/file_downloader/DownloadState$Failure;-><init>(Ljava/lang/Exception;)V

    iput-object v6, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    iput v5, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    invoke-interface {v6, v0, v1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_a

    return-object v2

    :cond_a
    move-object v4, v9

    goto :goto_3

    .line 11
    :cond_b
    new-instance v0, Ljava/io/File;

    iget-object v5, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$downloadDirectory:Ljava/io/File;

    iget-object v10, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$fileName:Ljava/lang/String;

    invoke-direct {v0, v5, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 12
    invoke-static {v0, v5, v8, v7}, Ldk/m;->j(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;

    move-result-object v5

    invoke-static {v5}, Ldk/m;->c(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 13
    :try_start_3
    iget-object v8, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v8, Lokhttp3/ResponseBody;

    invoke-virtual {v8}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v8

    invoke-interface {v5, v8}, Lokio/BufferedSink;->a0(Lokio/Source;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 14
    :try_start_4
    invoke-static {v5, v7}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 15
    new-instance v5, Lcom/discord/file_downloader/DownloadState$Completed;

    invoke-direct {v5, v0}, Lcom/discord/file_downloader/DownloadState$Completed;-><init>(Ljava/io/File;)V

    iput-object v6, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    iput v4, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    invoke-interface {v6, v5, v1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v0, v2, :cond_a

    return-object v2

    .line 16
    :goto_3
    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v0, Lokhttp3/ResponseBody;

    if-eqz v0, :cond_e

    :goto_4
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    goto :goto_7

    :catchall_2
    move-exception v0

    move-object v4, v0

    .line 17
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    move-object v8, v0

    :try_start_6
    invoke-static {v5, v4}, Lvf/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v8
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    move-object v2, v9

    goto :goto_8

    :catch_1
    move-exception v0

    move-object v5, v6

    .line 18
    :goto_5
    :try_start_7
    iget-boolean v4, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->$logErrors:Z

    if-eqz v4, :cond_c

    .line 19
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 20
    :cond_c
    new-instance v4, Lcom/discord/file_downloader/DownloadState$Failure;

    invoke-direct {v4, v0}, Lcom/discord/file_downloader/DownloadState$Failure;-><init>(Ljava/lang/Exception;)V

    iput-object v9, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$0:Ljava/lang/Object;

    iput-object v7, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->L$1:Ljava/lang/Object;

    iput v3, v1, Lcom/discord/file_downloader/FileDownloader$downloadFile$1;->label:I

    invoke-interface {v5, v4, v1}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    if-ne v0, v2, :cond_d

    return-object v2

    :cond_d
    move-object v2, v9

    .line 21
    :goto_6
    iget-object v0, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v0, Lokhttp3/ResponseBody;

    if-eqz v0, :cond_e

    goto :goto_4

    .line 22
    :cond_e
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 23
    :goto_8
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    check-cast v2, Lokhttp3/ResponseBody;

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lokhttp3/ResponseBody;->close()V

    :cond_f
    throw v0
.end method
