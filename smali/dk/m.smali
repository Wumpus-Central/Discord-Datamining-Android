.class public final Ldk/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "dk/n",
        "dk/o"
    }
    d2 = {}
    k = 0x4
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/io/File;)Lokio/Sink;
    .locals 0

    invoke-static {p0}, Ldk/n;->b(Ljava/io/File;)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static final b()Lokio/Sink;
    .locals 1

    invoke-static {}, Ldk/o;->a()Lokio/Sink;

    move-result-object v0

    return-object v0
.end method

.method public static final c(Lokio/Sink;)Lokio/BufferedSink;
    .locals 0

    invoke-static {p0}, Ldk/o;->b(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lokio/Source;)Lokio/BufferedSource;
    .locals 0

    invoke-static {p0}, Ldk/o;->c(Lokio/Source;)Lokio/BufferedSource;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/AssertionError;)Z
    .locals 0

    invoke-static {p0}, Ldk/n;->c(Ljava/lang/AssertionError;)Z

    move-result p0

    return p0
.end method

.method public static final f(Ljava/io/File;)Lokio/Sink;
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Ldk/m;->j(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/io/File;Z)Lokio/Sink;
    .locals 0

    invoke-static {p0, p1}, Ldk/n;->d(Ljava/io/File;Z)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/io/OutputStream;)Lokio/Sink;
    .locals 0

    invoke-static {p0}, Ldk/n;->e(Ljava/io/OutputStream;)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/net/Socket;)Lokio/Sink;
    .locals 0

    invoke-static {p0}, Ldk/n;->f(Ljava/net/Socket;)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk/n;->g(Ljava/io/File;ZILjava/lang/Object;)Lokio/Sink;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Ljava/io/File;)Lokio/Source;
    .locals 0

    invoke-static {p0}, Ldk/n;->h(Ljava/io/File;)Lokio/Source;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/io/InputStream;)Lokio/Source;
    .locals 0

    invoke-static {p0}, Ldk/n;->i(Ljava/io/InputStream;)Lokio/Source;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Ljava/net/Socket;)Lokio/Source;
    .locals 0

    invoke-static {p0}, Ldk/n;->j(Ljava/net/Socket;)Lokio/Source;

    move-result-object p0

    return-object p0
.end method
