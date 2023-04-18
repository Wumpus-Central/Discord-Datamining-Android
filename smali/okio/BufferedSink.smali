.class public interface abstract Lokio/BufferedSink;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Sink;
.implements Ljava/nio/channels/WritableByteChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\u0008\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u000cH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH&J \u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\tH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\rH&J\u0008\u0010\u001f\u001a\u00020\u001eH&J\u0008\u0010 \u001a\u00020\u0000H&J\u0008\u0010!\u001a\u00020\u0000H&J\u0008\u0010#\u001a\u00020\"H&R\u0014\u0010\'\u001a\u00020$8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lokio/BufferedSink;",
        "Lokio/Sink;",
        "Ljava/nio/channels/WritableByteChannel;",
        "Lokio/ByteString;",
        "byteString",
        "r0",
        "",
        "source",
        "write",
        "",
        "offset",
        "byteCount",
        "Lokio/Source;",
        "",
        "a0",
        "",
        "string",
        "S",
        "beginIndex",
        "endIndex",
        "Z",
        "b",
        "writeByte",
        "s",
        "writeShort",
        "i",
        "writeInt",
        "v",
        "A0",
        "b0",
        "",
        "flush",
        "t",
        "I",
        "Ljava/io/OutputStream;",
        "C0",
        "Lokio/Buffer;",
        "c",
        "()Lokio/Buffer;",
        "buffer",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# virtual methods
.method public abstract A0(J)Lokio/BufferedSink;
.end method

.method public abstract C0()Ljava/io/OutputStream;
.end method

.method public abstract I()Lokio/BufferedSink;
.end method

.method public abstract S(Ljava/lang/String;)Lokio/BufferedSink;
.end method

.method public abstract Z(Ljava/lang/String;II)Lokio/BufferedSink;
.end method

.method public abstract a0(Lokio/Source;)J
.end method

.method public abstract b0(J)Lokio/BufferedSink;
.end method

.method public abstract c()Lokio/Buffer;
.end method

.method public abstract flush()V
.end method

.method public abstract r0(Lokio/ByteString;)Lokio/BufferedSink;
.end method

.method public abstract t()Lokio/BufferedSink;
.end method

.method public abstract write([B)Lokio/BufferedSink;
.end method

.method public abstract write([BII)Lokio/BufferedSink;
.end method

.method public abstract writeByte(I)Lokio/BufferedSink;
.end method

.method public abstract writeInt(I)Lokio/BufferedSink;
.end method

.method public abstract writeShort(I)Lokio/BufferedSink;
.end method
