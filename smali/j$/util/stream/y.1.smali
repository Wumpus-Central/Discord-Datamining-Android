.class final Lj$/util/stream/y;
.super Lj$/util/stream/B;
.source "SourceFile"


# direct methods
.method constructor <init>(Lj$/util/Spliterator;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/B;-><init>(Lj$/util/Spliterator;I)V

    return-void
.end method


# virtual methods
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

.method public final bridge synthetic parallel()Lj$/util/stream/D;
    .locals 0

    invoke-virtual {p0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    return-object p0
.end method

.method public final bridge synthetic sequential()Lj$/util/stream/D;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    move-object v0, p0

    check-cast v0, Lj$/util/stream/D;

    return-object v0
.end method

.method public final t(Lj$/util/function/i;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->Z0()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/B;->c1(Lj$/util/Spliterator;)Lj$/util/y;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/y;->g(Lj$/util/function/i;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/B;->t(Lj$/util/function/i;)V

    :goto_0
    return-void
.end method

.method public final z(Lj$/util/function/h;)V
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/c;->Z0()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/B;->c1(Lj$/util/Spliterator;)Lj$/util/y;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/y;->g(Lj$/util/function/i;)V

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lj$/util/stream/B;->z(Lj$/util/function/h;)V

    :goto_0
    return-void
.end method
