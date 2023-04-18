.class public interface abstract Lokio/BufferedSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokio/Source;
.implements Ljava/nio/channels/ReadableByteChannel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u0008\u0010\u0004\u001a\u00020\u0003H\'J\u0008\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0008\u0010\r\u001a\u00020\u000cH&J\u0008\u0010\u000f\u001a\u00020\u000eH&J\u0008\u0010\u0011\u001a\u00020\u0010H&J\u0008\u0010\u0012\u001a\u00020\u0007H&J\u0008\u0010\u0013\u001a\u00020\u0007H&J\u0008\u0010\u0014\u001a\u00020\u0007H&J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0008\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0008\u0010\u001d\u001a\u00020\u001cH&J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH&J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H&J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\"H&J\u0008\u0010%\u001a\u00020$H&J\u0008\u0010&\u001a\u00020$H&J\u0010\u0010(\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u0007H&J\u0010\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H&J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0016H&J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0016H&J\u0008\u00100\u001a\u00020\u0000H&J\u0008\u00102\u001a\u000201H&R\u0014\u00105\u001a\u00020\u00038&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u00104\u00a8\u00066"
    }
    d2 = {
        "Lokio/BufferedSource;",
        "Lokio/Source;",
        "Ljava/nio/channels/ReadableByteChannel;",
        "Lokio/Buffer;",
        "q",
        "",
        "B",
        "",
        "byteCount",
        "",
        "y0",
        "f0",
        "",
        "readByte",
        "",
        "readShort",
        "",
        "readInt",
        "readLong",
        "J",
        "D0",
        "skip",
        "Lokio/ByteString;",
        "d0",
        "r",
        "Ldk/p;",
        "options",
        "u",
        "",
        "z",
        "m0",
        "sink",
        "readFully",
        "E",
        "Lokio/Sink;",
        "w0",
        "",
        "q0",
        "j0",
        "limit",
        "M",
        "Ljava/nio/charset/Charset;",
        "charset",
        "V",
        "bytes",
        "A",
        "targetBytes",
        "H",
        "peek",
        "Ljava/io/InputStream;",
        "E0",
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
.method public abstract A(Lokio/ByteString;)J
.end method

.method public abstract B()Z
.end method

.method public abstract D0()J
.end method

.method public abstract E(Lokio/Buffer;J)V
.end method

.method public abstract E0()Ljava/io/InputStream;
.end method

.method public abstract H(Lokio/ByteString;)J
.end method

.method public abstract J()J
.end method

.method public abstract M(J)Ljava/lang/String;
.end method

.method public abstract V(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract c()Lokio/Buffer;
.end method

.method public abstract d0()Lokio/ByteString;
.end method

.method public abstract f0(J)Z
.end method

.method public abstract j0()Ljava/lang/String;
.end method

.method public abstract m0(J)[B
.end method

.method public abstract peek()Lokio/BufferedSource;
.end method

.method public abstract q()Lokio/Buffer;
.end method

.method public abstract q0()Ljava/lang/String;
.end method

.method public abstract r(J)Lokio/ByteString;
.end method

.method public abstract readByte()B
.end method

.method public abstract readFully([B)V
.end method

.method public abstract readInt()I
.end method

.method public abstract readLong()J
.end method

.method public abstract readShort()S
.end method

.method public abstract skip(J)V
.end method

.method public abstract u(Ldk/p;)I
.end method

.method public abstract w0(Lokio/Sink;)J
.end method

.method public abstract y0(J)V
.end method

.method public abstract z()[B
.end method
