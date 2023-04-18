.class final Lj$/util/stream/Y;
.super Lj$/util/stream/b0;
.source "SourceFile"


# direct methods
.method constructor <init>(Lj$/util/Spliterator$OfInt;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/b0;-><init>(Lj$/util/Spliterator$OfInt;I)V

    return-void
.end method


# virtual methods
.method public final A(Lj$/util/function/IntConsumer;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->Z0()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/b0;->c1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/Spliterator$OfInt;->forEachRemaining(Lj$/util/function/IntConsumer;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/b0;->A(Lj$/util/function/IntConsumer;)V

    :goto_0
    return-void
.end method

.method public final C(Lj$/util/function/IntConsumer;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->Z0()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/b0;->c1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/Spliterator$OfInt;->forEachRemaining(Lj$/util/function/IntConsumer;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/b0;->C(Lj$/util/function/IntConsumer;)V

    :goto_0
    return-void
.end method

.method final W0()Z
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic parallel()Lj$/util/stream/IntStream;
    .locals 0

    invoke-virtual {p0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    return-object p0
.end method

.method public final bridge synthetic sequential()Lj$/util/stream/IntStream;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/IntStream;

    return-object v0
.end method
