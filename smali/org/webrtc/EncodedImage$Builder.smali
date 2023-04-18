.class public Lorg/webrtc/EncodedImage$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/EncodedImage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field private captureTimeNs:J

.field private encodedHeight:I

.field private encodedWidth:I

.field private frameType:Lorg/webrtc/EncodedImage$FrameType;

.field private qp:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private releaseCallback:Ljava/lang/Runnable;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private rotation:I


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lorg/webrtc/EncodedImage$1;)V
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/EncodedImage$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public createEncodedImage()Lorg/webrtc/EncodedImage;
    .locals 12

    new-instance v11, Lorg/webrtc/EncodedImage;

    iget-object v1, p0, Lorg/webrtc/EncodedImage$Builder;->buffer:Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lorg/webrtc/EncodedImage$Builder;->releaseCallback:Ljava/lang/Runnable;

    iget v3, p0, Lorg/webrtc/EncodedImage$Builder;->encodedWidth:I

    iget v4, p0, Lorg/webrtc/EncodedImage$Builder;->encodedHeight:I

    iget-wide v5, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    iget-object v7, p0, Lorg/webrtc/EncodedImage$Builder;->frameType:Lorg/webrtc/EncodedImage$FrameType;

    iget v8, p0, Lorg/webrtc/EncodedImage$Builder;->rotation:I

    iget-object v9, p0, Lorg/webrtc/EncodedImage$Builder;->qp:Ljava/lang/Integer;

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, Lorg/webrtc/EncodedImage;-><init>(Ljava/nio/ByteBuffer;Ljava/lang/Runnable;IIJLorg/webrtc/EncodedImage$FrameType;ILjava/lang/Integer;Lorg/webrtc/EncodedImage$1;)V

    return-object v11
.end method

.method public setBuffer(Ljava/nio/ByteBuffer;Ljava/lang/Runnable;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0
    .param p2    # Ljava/lang/Runnable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->buffer:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    iput-object p2, p0, Lorg/webrtc/EncodedImage$Builder;->releaseCallback:Ljava/lang/Runnable;

    .line 4
    .line 5
    return-object p0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method

.method public setCaptureTimeMs(J)Lorg/webrtc/EncodedImage$Builder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    return-object p0
.end method

.method public setCaptureTimeNs(J)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    iput-wide p1, p0, Lorg/webrtc/EncodedImage$Builder;->captureTimeNs:J

    return-object p0
.end method

.method public setEncodedHeight(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->encodedHeight:I

    return-object p0
.end method

.method public setEncodedWidth(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->encodedWidth:I

    return-object p0
.end method

.method public setFrameType(Lorg/webrtc/EncodedImage$FrameType;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->frameType:Lorg/webrtc/EncodedImage$FrameType;

    return-object p0
.end method

.method public setQp(Ljava/lang/Integer;)Lorg/webrtc/EncodedImage$Builder;
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lorg/webrtc/EncodedImage$Builder;->qp:Ljava/lang/Integer;

    return-object p0
.end method

.method public setRotation(I)Lorg/webrtc/EncodedImage$Builder;
    .locals 0

    iput p1, p0, Lorg/webrtc/EncodedImage$Builder;->rotation:I

    return-object p0
.end method
