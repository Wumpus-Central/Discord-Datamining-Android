.class Lcom/facebook/react/modules/network/ProgressRequestBody$1;
.super Lcom/facebook/react/modules/network/CountingOutputStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ProgressRequestBody;->outputStreamSink(Lokio/BufferedSink;)Lokio/Sink;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/network/ProgressRequestBody;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/ProgressRequestBody;Ljava/io/OutputStream;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressRequestBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressRequestBody;

    invoke-direct {p0, p2}, Lcom/facebook/react/modules/network/CountingOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method private sendProgressUpdate()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/modules/network/CountingOutputStream;->getCount()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressRequestBody;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/modules/network/ProgressRequestBody;->contentLength()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressRequestBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressRequestBody;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/facebook/react/modules/network/ProgressRequestBody;->access$000(Lcom/facebook/react/modules/network/ProgressRequestBody;)Lcom/facebook/react/modules/network/ProgressListener;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    cmp-long v5, v1, v3

    .line 18
    .line 19
    if-nez v5, :cond_0

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v5, 0x0

    .line 24
    :goto_0
    invoke-interface/range {v0 .. v5}, Lcom/facebook/react/modules/network/ProgressListener;->onProgress(JJZ)V

    .line 25
    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
.end method


# virtual methods
.method public write(I)V
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/facebook/react/modules/network/CountingOutputStream;->write(I)V

    .line 4
    invoke-direct {p0}, Lcom/facebook/react/modules/network/ProgressRequestBody$1;->sendProgressUpdate()V

    return-void
.end method

.method public write([BII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/modules/network/CountingOutputStream;->write([BII)V

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/modules/network/ProgressRequestBody$1;->sendProgressUpdate()V

    return-void
.end method
