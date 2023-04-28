.class final Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
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
.field final synthetic $$this$callbackFlow:Lkotlinx/coroutines/channels/ProducerScope;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "Lcom/discord/file_downloader/DownloadState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $downloadId:Lkotlin/jvm/internal/Ref$LongRef;

.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $manager:Landroid/app/DownloadManager;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$LongRef;Lkotlinx/coroutines/channels/ProducerScope;Landroid/app/DownloadManager;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$LongRef;",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lcom/discord/file_downloader/DownloadState;",
            ">;",
            "Landroid/app/DownloadManager;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$downloadId:Lkotlin/jvm/internal/Ref$LongRef;

    iput-object p2, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$$this$callbackFlow:Lkotlinx/coroutines/channels/ProducerScope;

    iput-object p3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$manager:Landroid/app/DownloadManager;

    iput-object p4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$fileName:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    invoke-static {}, Lcom/discord/file_downloader/PublicFileDownloader;->access$getOnDownloadListeners$p()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$downloadId:Lkotlin/jvm/internal/Ref$LongRef;

    iget-wide v1, v1, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v2, Lcom/discord/file_downloader/PublicFileDownloader;->INSTANCE:Lcom/discord/file_downloader/PublicFileDownloader;

    iget-object v3, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$$this$callbackFlow:Lkotlinx/coroutines/channels/ProducerScope;

    .line 4
    iget-object v4, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$manager:Landroid/app/DownloadManager;

    .line 5
    iget-object v0, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$downloadId:Lkotlin/jvm/internal/Ref$LongRef;

    iget-wide v5, v0, Lkotlin/jvm/internal/Ref$LongRef;->k:J

    .line 6
    iget-object v7, p0, Lcom/discord/file_downloader/PublicFileDownloader$downloadFile$1$1;->$fileName:Ljava/lang/String;

    .line 7
    invoke-static/range {v2 .. v7}, Lcom/discord/file_downloader/PublicFileDownloader;->access$onFileDownloaded(Lcom/discord/file_downloader/PublicFileDownloader;Lkotlinx/coroutines/channels/ProducerScope;Landroid/app/DownloadManager;JLjava/lang/String;)Z

    return-void
.end method
