.class public abstract Lj$/util/stream/A3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lj$/util/y;)Lj$/util/stream/D;
    .locals 2

    new-instance v0, Lj$/util/stream/y;

    invoke-static {p0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lj$/util/stream/y;-><init>(Lj$/util/Spliterator;I)V

    return-object v0
.end method

.method public static b(Lj$/util/Spliterator$OfInt;)Lj$/util/stream/IntStream;
    .locals 2

    new-instance v0, Lj$/util/stream/Y;

    invoke-static {p0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lj$/util/stream/Y;-><init>(Lj$/util/Spliterator$OfInt;I)V

    return-object v0
.end method

.method public static c(Lj$/util/B;)Lj$/util/stream/k0;
    .locals 2

    new-instance v0, Lj$/util/stream/f0;

    invoke-static {p0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result v1

    invoke-direct {v0, p0, v1}, Lj$/util/stream/f0;-><init>(Lj$/util/Spliterator;I)V

    return-object v0
.end method

.method public static d(Lj$/util/Spliterator;Z)Lj$/util/stream/Stream;
    .locals 2

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/T1;

    invoke-static {p0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lj$/util/stream/T1;-><init>(Lj$/util/Spliterator;IZ)V

    return-object v0
.end method
