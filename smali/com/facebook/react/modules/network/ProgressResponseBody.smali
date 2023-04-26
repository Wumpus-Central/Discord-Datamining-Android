.class public Lcom/facebook/react/modules/network/ProgressResponseBody;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field private mBufferedSource:Lokio/BufferedSource;

.field private final mProgressListener:Lcom/facebook/react/modules/network/ProgressListener;

.field private final mResponseBody:Lokhttp3/ResponseBody;

.field private mTotalBytesRead:J


# direct methods
.method public constructor <init>(Lokhttp3/ResponseBody;Lcom/facebook/react/modules/network/ProgressListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mResponseBody:Lokhttp3/ResponseBody;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mProgressListener:Lcom/facebook/react/modules/network/ProgressListener;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    iput-wide p1, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mTotalBytesRead:J

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
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

.method static synthetic access$000(Lcom/facebook/react/modules/network/ProgressResponseBody;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mTotalBytesRead:J

    return-wide v0
.end method

.method static synthetic access$014(Lcom/facebook/react/modules/network/ProgressResponseBody;J)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mTotalBytesRead:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mTotalBytesRead:J

    return-wide v0
.end method

.method static synthetic access$100(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lokhttp3/ResponseBody;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mResponseBody:Lokhttp3/ResponseBody;

    return-object p0
.end method

.method static synthetic access$200(Lcom/facebook/react/modules/network/ProgressResponseBody;)Lcom/facebook/react/modules/network/ProgressListener;
    .locals 0

    iget-object p0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mProgressListener:Lcom/facebook/react/modules/network/ProgressListener;

    return-object p0
.end method

.method private source(Lokio/Source;)Lokio/Source;
    .locals 1

    .line 4
    new-instance v0, Lcom/facebook/react/modules/network/ProgressResponseBody$1;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/network/ProgressResponseBody$1;-><init>(Lcom/facebook/react/modules/network/ProgressResponseBody;Lokio/Source;)V

    return-object v0
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mResponseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentLength()J

    move-result-wide v0

    return-wide v0
.end method

.method public contentType()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mResponseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    move-result-object v0

    return-object v0
.end method

.method public source()Lokio/BufferedSource;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mBufferedSource:Lokio/BufferedSource;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mResponseBody:Lokhttp3/ResponseBody;

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/modules/network/ProgressResponseBody;->source(Lokio/Source;)Lokio/Source;

    move-result-object v0

    invoke-static {v0}, Ldk/m;->d(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mBufferedSource:Lokio/BufferedSource;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mBufferedSource:Lokio/BufferedSource;

    return-object v0
.end method

.method public totalBytesRead()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/modules/network/ProgressResponseBody;->mTotalBytesRead:J

    return-wide v0
.end method
