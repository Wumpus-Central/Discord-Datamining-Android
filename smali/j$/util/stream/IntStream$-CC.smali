.class public final synthetic Lj$/util/stream/IntStream$-CC;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static range(II)Lj$/util/stream/IntStream;
    .locals 1

    if-lt p0, p1, :cond_0

    .line 0
    invoke-static {}, Lj$/util/Spliterators;->c()Lj$/util/Spliterator$OfInt;

    move-result-object p0

    .line 0
    new-instance p1, Lj$/util/stream/Y;

    invoke-static {p0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result v0

    invoke-direct {p1, p0, v0}, Lj$/util/stream/Y;-><init>(Lj$/util/Spliterator$OfInt;I)V

    return-object p1

    .line 0
    :cond_0
    new-instance v0, Lj$/util/stream/C3;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/C3;-><init>(II)V

    .line 0
    new-instance p0, Lj$/util/stream/Y;

    invoke-static {v0}, Lj$/util/stream/S2;->c(Lj$/util/Spliterator;)I

    move-result p1

    invoke-direct {p0, v0, p1}, Lj$/util/stream/Y;-><init>(Lj$/util/Spliterator$OfInt;I)V

    return-object p0
.end method
