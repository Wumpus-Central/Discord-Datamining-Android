.class Lcom/facebook/react/modules/network/ProgressResponseBody$1;
.super Ldk/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/modules/network/ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;


# direct methods
.method constructor <init>(Lcom/facebook/react/modules/network/ProgressResponseBody;Lokio/Source;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    invoke-direct {p0, p2}, Ldk/g;-><init>(Lokio/Source;)V

    return-void
.end method


# virtual methods
.method public read(Lokio/Buffer;J)J
    .locals 7

    .line 1
    invoke-super {p0, p1, p2, p3}, Ldk/g;->read(Lokio/Buffer;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 6
    .line 7
    const-wide/16 v0, -0x1

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-wide v1, p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    :goto_0
    invoke-static {p3, v1, v2}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$014(Lcom/facebook/react/modules/network/ProgressResponseBody;J)J

    .line 18
    .line 19
    .line 20
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 21
    .line 22
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$200(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lcom/facebook/react/modules/network/ProgressListener;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 27
    .line 28
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$000(Lcom/facebook/react/modules/network/ProgressResponseBody;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    iget-object p3, p0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;->this$0:Lcom/facebook/react/modules/network/ProgressResponseBody;

    .line 33
    .line 34
    invoke-static {p3}, Lcom/facebook/react/modules/network/ProgressResponseBody;->access$100(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lokhttp3/ResponseBody;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Lokhttp3/ResponseBody;->contentLength()J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const/4 p3, 0x1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 p3, 0x0

    .line 47
    :goto_1
    move v6, p3

    .line 48
    invoke-interface/range {v1 .. v6}, Lcom/facebook/react/modules/network/ProgressListener;->onProgress(JJZ)V

    .line 49
    .line 50
    .line 51
    return-wide p1
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
    .line 67
    .line 68
    .line 69
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
.end method
