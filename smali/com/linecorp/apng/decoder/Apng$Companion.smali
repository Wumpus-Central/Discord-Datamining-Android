.class public final Lcom/linecorp/apng/decoder/Apng$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/linecorp/apng/decoder/Apng;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/linecorp/apng/decoder/Apng$Companion;",
        "",
        "",
        "resultCode",
        "",
        "a",
        "Ljava/io/InputStream;",
        "stream",
        "Lcom/linecorp/apng/decoder/Apng;",
        "decode",
        "",
        "isApng",
        "apng",
        "copy",
        "<init>",
        "()V",
        "apng-drawable_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x2
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/linecorp/apng/decoder/Apng$Companion;-><init>()V

    return-void
.end method

.method private final a(I)V
    .locals 3

    if-ltz p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    sget-object v1, Lcom/linecorp/apng/decoder/ApngException$ErrorCode;->Companion:Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;

    invoke-virtual {v1, p1}, Lcom/linecorp/apng/decoder/ApngException$ErrorCode$Companion;->fromErrorCode$apng_drawable_release(I)Lcom/linecorp/apng/decoder/ApngException$ErrorCode;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Lcom/linecorp/apng/decoder/ApngException$ErrorCode;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method


# virtual methods
.method public final copy(Lcom/linecorp/apng/decoder/Apng;)Lcom/linecorp/apng/decoder/Apng;
    .locals 10

    .line 1
    const-string v0, "apng"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/linecorp/apng/decoder/Apng$DecodeResult;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Apng#copy"

    .line 12
    .line 13
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {p1}, Lcom/linecorp/apng/decoder/Apng;->access$getId$p(Lcom/linecorp/apng/decoder/Apng;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1, v0}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->copy(ILcom/linecorp/apng/decoder/Apng$DecodeResult;)I

    .line 21
    .line 22
    .line 23
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v2}, Lcom/linecorp/apng/decoder/Apng$Companion;->a(I)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    new-instance p1, Lcom/linecorp/apng/decoder/Apng;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getWidth()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getFrameCount()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getFrameDurations()[I

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getLoopCount()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getAllFrameByteCount()J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    move-object v1, p1

    .line 57
    invoke-direct/range {v1 .. v9}, Lcom/linecorp/apng/decoder/Apng;-><init>(IIII[IIJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    return-object p1

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :catchall_1
    move-exception p1

    .line 69
    :try_start_2
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 75
    :catchall_2
    move-exception p1

    .line 76
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    throw p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
.end method

.method public final decode(Ljava/io/InputStream;)Lcom/linecorp/apng/decoder/Apng;
    .locals 11

    .line 1
    const-string v0, "stream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/linecorp/apng/decoder/Apng$DecodeResult;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Apng#decode"

    .line 12
    .line 13
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-static {p1, v0}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->decode(Ljava/io/InputStream;Lcom/linecorp/apng/decoder/Apng$DecodeResult;)I

    .line 17
    .line 18
    .line 19
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v3}, Lcom/linecorp/apng/decoder/Apng$Companion;->a(I)V

    .line 24
    .line 25
    .line 26
    :try_start_1
    new-instance p1, Lcom/linecorp/apng/decoder/Apng;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getFrameCount()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getFrameDurations()[I

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getLoopCount()I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-virtual {v0}, Lcom/linecorp/apng/decoder/Apng$DecodeResult;->getAllFrameByteCount()J

    .line 49
    .line 50
    .line 51
    move-result-wide v9

    .line 52
    move-object v2, p1

    .line 53
    invoke-direct/range {v2 .. v10}, Lcom/linecorp/apng/decoder/Apng;-><init>(IIII[IIJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    :try_start_2
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 71
    :catchall_2
    move-exception p1

    .line 72
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 73
    .line 74
    .line 75
    throw p1
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
.end method

.method public final isApng(Ljava/io/InputStream;)Z
    .locals 1

    .line 1
    const-string v0, "stream"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p1}, Lcom/linecorp/apng/decoder/ApngDecoderJni;->isApng(Ljava/io/InputStream;)Z

    .line 7
    .line 8
    .line 9
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    new-instance v0, Lcom/linecorp/apng/decoder/ApngException;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lcom/linecorp/apng/decoder/ApngException;-><init>(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
