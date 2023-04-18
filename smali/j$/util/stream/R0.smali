.class final Lj$/util/stream/R0;
.super Lj$/util/stream/I2;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/y0;
.implements Lj$/util/stream/u0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/I2;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lj$/util/stream/B0;
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic a(I)Lj$/util/stream/C0;
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lj$/util/stream/R0;->a(I)Lj$/util/stream/B0;

    const/4 p1, 0x0

    throw p1
.end method

.method public final accept(D)V
    .locals 0

    invoke-super {p0, p1, p2}, Lj$/util/stream/I2;->accept(D)V

    return-void
.end method

.method public final synthetic accept(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->V()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic accept(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->W()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->Q(Lj$/util/stream/b2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-super {p0}, Lj$/util/stream/O2;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public final build()Lj$/util/stream/C0;
    .locals 0

    return-object p0
.end method

.method public final build()Lj$/util/stream/y0;
    .locals 0

    return-object p0
.end method

.method public final c(J)V
    .locals 0

    invoke-virtual {p0}, Lj$/util/stream/O2;->clear()V

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/O2;->r(J)V

    return-void
.end method

.method public final synthetic e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final end()V
    .locals 0

    return-void
.end method

.method public final f(ILjava/lang/Object;)V
    .locals 0

    check-cast p2, [D

    .line 0
    invoke-super {p0, p1, p2}, Lj$/util/stream/O2;->f(ILjava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj$/util/function/i;

    .line 0
    invoke-super {p0, p1}, Lj$/util/stream/O2;->g(Ljava/lang/Object;)V

    return-void
.end method

.method public final bridge synthetic i([Ljava/lang/Object;I)V
    .locals 0

    .line 0
    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/R0;->v([Ljava/lang/Double;I)V

    return-void
.end method

.method public final synthetic k(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->P(Lj$/util/stream/b2;Ljava/lang/Double;)V

    return-void
.end method

.method public final synthetic l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic m(Lj$/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->X(Lj$/util/stream/B0;Lj$/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic n(JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/t0;->e0(Lj$/util/stream/y0;JJ)Lj$/util/stream/y0;

    move-result-object p1

    return-object p1
.end method

.method public final spliterator()Lj$/util/D;
    .locals 1

    .line 0
    invoke-super {p0}, Lj$/util/stream/I2;->u()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 1

    .line 0
    invoke-super {p0}, Lj$/util/stream/I2;->u()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lj$/util/y;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/I2;->u()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/t0;->Y(Lj$/util/stream/y0;[Ljava/lang/Double;I)V

    return-void
.end method
