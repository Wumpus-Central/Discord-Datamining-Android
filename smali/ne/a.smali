.class public Lne/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne/c;


# instance fields
.field private final mediaExtractor:Landroid/media/MediaExtractor;

.field private final mediaRange:Lcom/linkedin/android/litr/io/MediaRange;

.field private orientationHint:I

.field private size:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 5

    .line 1
    new-instance v0, Lcom/linkedin/android/litr/io/MediaRange;

    const-wide/16 v1, 0x0

    const-wide v3, 0x7fffffffffffffffL

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/linkedin/android/litr/io/MediaRange;-><init>(JJ)V

    invoke-direct {p0, p1, p2, v0}, Lne/a;-><init>(Landroid/content/Context;Landroid/net/Uri;Lcom/linkedin/android/litr/io/MediaRange;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lcom/linkedin/android/litr/io/MediaRange;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p3, p0, Lne/a;->mediaRange:Lcom/linkedin/android/litr/io/MediaRange;

    .line 4
    new-instance p3, Landroid/media/MediaExtractor;

    invoke-direct {p3}, Landroid/media/MediaExtractor;-><init>()V

    iput-object p3, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    .line 5
    new-instance v0, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever;-><init>()V

    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p3, p1, p2, v1}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 p3, 0x18

    .line 8
    invoke-virtual {v0, p3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p3

    iput p3, p0, Lne/a;->orientationHint:I

    .line 10
    :cond_0
    invoke-static {p1, p2}, Lqe/h;->f(Landroid/content/Context;Landroid/net/Uri;)J

    move-result-wide p1

    iput-wide p1, p0, Lne/a;->size:J

    .line 11
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    return-void

    :catch_0
    move-exception p1

    .line 12
    invoke-virtual {v0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 13
    new-instance p3, Lie/b;

    sget-object v0, Lie/b$a;->l:Lie/b$a;

    invoke-direct {p3, v0, p2, p1}, Lie/b;-><init>(Lie/b$a;Landroid/net/Uri;Ljava/lang/Throwable;)V

    throw p3
.end method


# virtual methods
.method public advance()V
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->advance()Z

    return-void
.end method

.method public getOrientationHint()I
    .locals 1

    iget v0, p0, Lne/a;->orientationHint:I

    return v0
.end method

.method public getSampleFlags()I
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleFlags()I

    move-result v0

    return v0
.end method

.method public getSampleTime()J
    .locals 2

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getSampleTrackIndex()I
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTrackIndex()I

    move-result v0

    return v0
.end method

.method public getSelection()Lcom/linkedin/android/litr/io/MediaRange;
    .locals 1

    iget-object v0, p0, Lne/a;->mediaRange:Lcom/linkedin/android/litr/io/MediaRange;

    return-object v0
.end method

.method public getSize()J
    .locals 2

    iget-wide v0, p0, Lne/a;->size:J

    return-wide v0
.end method

.method public getTrackCount()I
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v0

    return v0
.end method

.method public getTrackFormat(I)Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0, p1}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object p1

    return-object p1
.end method

.method public readSampleData(Ljava/nio/ByteBuffer;I)I
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result p1

    return p1
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->release()V

    return-void
.end method

.method public seekTo(JI)V
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaExtractor;->seekTo(JI)V

    return-void
.end method

.method public selectTrack(I)V
    .locals 1

    iget-object v0, p0, Lne/a;->mediaExtractor:Landroid/media/MediaExtractor;

    invoke-virtual {v0, p1}, Landroid/media/MediaExtractor;->selectTrack(I)V

    return-void
.end method
