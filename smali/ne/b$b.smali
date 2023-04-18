.class Lne/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lne/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/nio/ByteBuffer;

.field private c:Landroid/media/MediaCodec$BufferInfo;

.field final synthetic d:Lne/b;


# direct methods
.method private constructor <init>(Lne/b;ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    .locals 6

    .line 2
    iput-object p1, p0, Lne/b$b;->d:Lne/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lne/b$b;->a:I

    .line 4
    new-instance v0, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct {v0}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    iput-object v0, p0, Lne/b$b;->c:Landroid/media/MediaCodec$BufferInfo;

    const/4 v1, 0x0

    .line 5
    iget v2, p4, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget-wide v3, p4, Landroid/media/MediaCodec$BufferInfo;->presentationTimeUs:J

    iget v5, p4, Landroid/media/MediaCodec$BufferInfo;->flags:I

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaCodec$BufferInfo;->set(IIJI)V

    .line 6
    invoke-virtual {p3}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lne/b$b;->b:Ljava/nio/ByteBuffer;

    .line 7
    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 8
    iget-object p1, p0, Lne/b$b;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return-void
.end method

.method synthetic constructor <init>(Lne/b;ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;Lne/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lne/b$b;-><init>(Lne/b;ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V

    return-void
.end method

.method static synthetic a(Lne/b$b;)I
    .locals 0

    iget p0, p0, Lne/b$b;->a:I

    return p0
.end method

.method static synthetic b(Lne/b$b;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, Lne/b$b;->b:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic c(Lne/b$b;)Landroid/media/MediaCodec$BufferInfo;
    .locals 0

    iget-object p0, p0, Lne/b$b;->c:Landroid/media/MediaCodec$BufferInfo;

    return-object p0
.end method
