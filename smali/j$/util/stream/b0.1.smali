.class abstract Lj$/util/stream/b0;
.super Lj$/util/stream/c;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/IntStream;


# direct methods
.method constructor <init>(Lj$/util/Spliterator$OfInt;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lj$/util/stream/c;-><init>(Lj$/util/Spliterator;IZ)V

    return-void
.end method

.method constructor <init>(Lj$/util/stream/c;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/c;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method

.method static synthetic c1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;
    .locals 0

    invoke-static {p0}, Lj$/util/stream/b0;->d1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;

    move-result-object p0

    return-object p0
.end method

.method private static d1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;
    .locals 1

    instance-of v0, p0, Lj$/util/Spliterator$OfInt;

    if-eqz v0, :cond_0

    check-cast p0, Lj$/util/Spliterator$OfInt;

    return-object p0

    :cond_0
    sget-boolean p0, Lj$/util/stream/G3;->a:Z

    if-eqz p0, :cond_1

    const-class p0, Lj$/util/stream/c;

    const-string v0, "using IntStream.adapt(Spliterator<Integer> s)"

    invoke-static {p0, v0}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "IntStream.adapt(Spliterator<Integer> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public A(Lj$/util/function/IntConsumer;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/M;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/M;-><init>(Lj$/util/function/IntConsumer;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method

.method public final B(Lj$/util/function/IntFunction;)Lj$/util/stream/Stream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/u;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public C(Lj$/util/function/IntConsumer;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/M;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/stream/M;-><init>(Lj$/util/function/IntConsumer;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method

.method public final F(Lj$/util/function/B;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->ALL:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->E0(Lj$/util/function/B;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final G(Lj$/util/function/w;)Lj$/util/k;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/y1;

    sget-object v1, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/y1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/k;

    return-object p1
.end method

.method final G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/t0;->B0(J)Lj$/util/stream/v0;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lj$/util/function/IntConsumer;)Lj$/util/stream/IntStream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/v;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final K(Lj$/util/function/B;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->NONE:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->E0(Lj$/util/function/B;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final M(Lj$/util/function/A;)Lj$/util/stream/IntStream;
    .locals 3

    new-instance v0, Lj$/util/stream/v;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x3

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method final O0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/t0;->o0(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)Lj$/util/stream/z0;

    move-result-object p1

    return-object p1
.end method

.method final P0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V
    .locals 2

    invoke-static {p1}, Lj$/util/stream/b0;->d1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;

    move-result-object p1

    .line 0
    instance-of v0, p2, Lj$/util/function/IntConsumer;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj$/util/function/IntConsumer;

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_3

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/T;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lj$/util/stream/T;-><init>(ILj$/util/stream/e2;)V

    .line 0
    :cond_1
    :goto_0
    invoke-interface {p2}, Lj$/util/stream/e2;->e()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Lj$/util/Spliterator$OfInt;->tryAdvance(Lj$/util/function/IntConsumer;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_2
    return-void

    .line 0
    :cond_3
    const-class p1, Lj$/util/stream/c;

    const-string p2, "using IntStream.adapt(Sink<Integer> s)"

    invoke-static {p1, p2}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method final Q0()Lj$/util/stream/T2;
    .locals 1

    sget-object v0, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    return-object v0
.end method

.method final a1(Lj$/util/stream/t0;Lj$/util/stream/a;Z)Lj$/util/Spliterator;
    .locals 1

    new-instance v0, Lj$/util/stream/f3;

    invoke-direct {v0, p1, p2, p3}, Lj$/util/stream/f3;-><init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V

    return-object v0
.end method

.method public final asDoubleStream()Lj$/util/stream/D;
    .locals 3

    new-instance v0, Lj$/util/stream/x;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;II)V

    return-object v0
.end method

.method public final asLongStream()Lj$/util/stream/k0;
    .locals 3

    new-instance v0, Lj$/util/stream/W;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/W;-><init>(Lj$/util/stream/c;II)V

    return-object v0
.end method

.method public final average()Lj$/util/j;
    .locals 5

    new-instance v0, Lj$/util/stream/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lj$/util/stream/b;-><init>(I)V

    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    new-instance v2, Lj$/util/stream/b;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {p0, v0, v1, v2}, Lj$/util/stream/b0;->n(Lj$/util/function/Supplier;Lj$/util/function/b0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    const/4 v1, 0x0

    aget-wide v1, v0, v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    const/4 v3, 0x1

    aget-wide v3, v0, v3

    long-to-double v3, v3

    long-to-double v0, v1

    div-double/2addr v3, v0

    invoke-static {v3, v4}, Lj$/util/j;->d(D)Lj$/util/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj$/util/j;->a()Lj$/util/j;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final b(Lj$/util/function/G;)Lj$/util/stream/k0;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/w;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final boxed()Lj$/util/stream/Stream;
    .locals 2

    new-instance v0, Lj$/util/stream/U;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/b0;->B(Lj$/util/function/IntFunction;)Lj$/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final count()J
    .locals 2

    new-instance v0, Lj$/util/stream/b;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/b0;->b(Lj$/util/function/G;)Lj$/util/stream/k0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Lj$/util/stream/i0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Lj$/util/stream/IntStream;
    .locals 3

    invoke-virtual {p0}, Lj$/util/stream/b0;->boxed()Lj$/util/stream/Stream;

    move-result-object v0

    check-cast v0, Lj$/util/stream/W1;

    invoke-virtual {v0}, Lj$/util/stream/W1;->distinct()Lj$/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    check-cast v0, Lj$/util/stream/W1;

    invoke-virtual {v0, v1}, Lj$/util/stream/W1;->u(Lj$/util/function/ToIntFunction;)Lj$/util/stream/IntStream;

    move-result-object v0

    return-object v0
.end method

.method public final findAny()Lj$/util/k;
    .locals 7

    const/4 v1, 0x0

    .line 0
    new-instance v6, Lj$/util/stream/E;

    sget-object v2, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/k;->a()Lj$/util/k;

    move-result-object v3

    new-instance v4, Lj$/util/stream/I0;

    const/16 v0, 0x1a

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v5, Lj$/util/stream/b;

    const/16 v0, 0xd

    invoke-direct {v5, v0}, Lj$/util/stream/b;-><init>(I)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/k;

    return-object v0
.end method

.method public final findFirst()Lj$/util/k;
    .locals 7

    const/4 v1, 0x1

    .line 0
    new-instance v6, Lj$/util/stream/E;

    sget-object v2, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/k;->a()Lj$/util/k;

    move-result-object v3

    new-instance v4, Lj$/util/stream/I0;

    const/16 v0, 0x1a

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v5, Lj$/util/stream/b;

    const/16 v0, 0xd

    invoke-direct {v5, v0}, Lj$/util/stream/b;-><init>(I)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/k;

    return-object v0
.end method

.method public final g(Lj$/util/function/H;)Lj$/util/stream/IntStream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/v;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final i(ILj$/util/function/w;)I
    .locals 2

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/G1;

    sget-object v1, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    invoke-direct {v0, v1, p2, p1}, Lj$/util/stream/G1;-><init>(Lj$/util/stream/T2;Lj$/util/function/w;I)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final iterator()Lj$/util/s;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/b0;->spliterator()Lj$/util/Spliterator$OfInt;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->g(Lj$/util/Spliterator$OfInt;)Lj$/util/s;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/b0;->iterator()Lj$/util/s;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lj$/util/function/B;)Lj$/util/stream/IntStream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/v;

    sget v1, Lj$/util/stream/S2;->t:I

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final limit(J)Lj$/util/stream/IntStream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    invoke-static {p0, v0, v1, p1, p2}, Lj$/util/stream/p2;->f(Lj$/util/stream/c;JJ)Lj$/util/stream/IntStream;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Lj$/util/function/B;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->ANY:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->E0(Lj$/util/function/B;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final max()Lj$/util/k;
    .locals 2

    new-instance v0, Lj$/util/stream/U;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/b0;->G(Lj$/util/function/w;)Lj$/util/k;

    move-result-object v0

    return-object v0
.end method

.method public final min()Lj$/util/k;
    .locals 2

    new-instance v0, Lj$/util/stream/I0;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/b0;->G(Lj$/util/function/w;)Lj$/util/k;

    move-result-object v0

    return-object v0
.end method

.method public final n(Lj$/util/function/Supplier;Lj$/util/function/b0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    new-instance v2, Lj$/util/stream/q;

    const/4 v0, 0x1

    invoke-direct {v2, p3, v0}, Lj$/util/stream/q;-><init>(Lj$/util/function/BiConsumer;I)V

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance p3, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    const/4 v5, 0x4

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, p3}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final r(Lj$/util/function/D;)Lj$/util/stream/D;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/t;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final skip(J)Lj$/util/stream/IntStream;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    invoke-static {p0, p1, p2, v0, v1}, Lj$/util/stream/p2;->f(Lj$/util/stream/c;JJ)Lj$/util/stream/IntStream;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Lj$/util/stream/IntStream;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/y2;

    invoke-direct {v0, p0}, Lj$/util/stream/y2;-><init>(Lj$/util/stream/c;)V

    return-object v0
.end method

.method public final spliterator()Lj$/util/Spliterator$OfInt;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/c;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/b0;->d1(Lj$/util/Spliterator;)Lj$/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Lj$/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/b0;->spliterator()Lj$/util/Spliterator$OfInt;

    move-result-object v0

    return-object v0
.end method

.method public final sum()I
    .locals 2

    new-instance v0, Lj$/util/stream/I0;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lj$/util/stream/b0;->i(ILj$/util/function/w;)I

    move-result v0

    return v0
.end method

.method public final summaryStatistics()Lj$/util/f;
    .locals 4

    new-instance v0, Lj$/util/stream/I0;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v2, Lj$/util/stream/U;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {p0, v0, v1, v2}, Lj$/util/stream/b0;->n(Lj$/util/function/Supplier;Lj$/util/function/b0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/f;

    return-object v0
.end method

.method public final toArray()[I
    .locals 2

    new-instance v0, Lj$/util/stream/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/c;->N0(Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/z0;

    invoke-static {v0}, Lj$/util/stream/t0;->y0(Lj$/util/stream/z0;)Lj$/util/stream/z0;

    move-result-object v0

    invoke-interface {v0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method public final unordered()Lj$/util/stream/h;
    .locals 2

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/c;->S0()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lj$/util/stream/X;

    sget v1, Lj$/util/stream/S2;->r:I

    invoke-direct {v0, p0, v1}, Lj$/util/stream/X;-><init>(Lj$/util/stream/c;I)V

    :goto_0
    return-object v0
.end method
