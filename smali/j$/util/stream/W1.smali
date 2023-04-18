.class abstract Lj$/util/stream/W1;
.super Lj$/util/stream/c;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/Stream;


# direct methods
.method constructor <init>(Lj$/util/Spliterator;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lj$/util/stream/c;-><init>(Lj$/util/Spliterator;IZ)V

    return-void
.end method

.method constructor <init>(Lj$/util/stream/c;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/c;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method public final D(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->ALL:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->H0(Lj$/util/function/Predicate;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final E(Lj$/util/function/Function;)Lj$/util/stream/k0;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/w;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method final G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/t0;->l0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;

    move-result-object p1

    return-object p1
.end method

.method public final I(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->NONE:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->H0(Lj$/util/function/Predicate;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final J(Lj$/util/function/ToLongFunction;)Lj$/util/stream/k0;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/w;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x7

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final L(Lj$/util/function/ToDoubleFunction;)Lj$/util/stream/D;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/t;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method final O0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Lj$/util/stream/t0;->m0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p1

    return-object p1
.end method

.method final P0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V
    .locals 1

    :cond_0
    invoke-interface {p2}, Lj$/util/stream/e2;->e()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_0

    :cond_1
    return-void
.end method

.method final Q0()Lj$/util/stream/T2;
    .locals 1

    sget-object v0, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    return-object v0
.end method

.method public final a(Lj$/util/function/Function;)Lj$/util/stream/IntStream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/v;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x7

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method final a1(Lj$/util/stream/t0;Lj$/util/stream/a;Z)Lj$/util/Spliterator;
    .locals 1

    new-instance v0, Lj$/util/stream/z3;

    invoke-direct {v0, p1, p2, p3}, Lj$/util/stream/z3;-><init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Lj$/util/function/c;)Ljava/lang/Object;
    .locals 7

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v6, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    const/4 v5, 0x2

    move-object v0, v6

    move-object v2, p2

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 2

    new-instance v0, Lj$/util/stream/I0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/W1;->J(Lj$/util/function/ToLongFunction;)Lj$/util/stream/k0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Lj$/util/stream/i0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lj$/util/stream/j;)Ljava/lang/Object;
    .locals 10

    invoke-virtual {p0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lj$/util/stream/j;->b()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lj$/util/stream/i;->CONCURRENT:Lj$/util/stream/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lj$/util/stream/c;->S0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lj$/util/stream/j;->b()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lj$/util/stream/i;->UNORDERED:Lj$/util/stream/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p1}, Lj$/util/stream/j;->f()Lj$/util/function/g0;

    move-result-object v0

    invoke-virtual {v0}, Lj$/util/function/g0;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lj$/util/stream/j;->a()Lj$/util/function/BiConsumer;

    move-result-object v1

    new-instance v2, Lj$/util/stream/m;

    const/4 v3, 0x5

    invoke-direct {v2, v3, v1, v0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, Lj$/util/stream/W1;->forEach(Lj$/util/function/Consumer;)V

    goto :goto_0

    .line 0
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Lj$/util/stream/j;->f()Lj$/util/function/g0;

    move-result-object v8

    invoke-virtual {p1}, Lj$/util/stream/j;->a()Lj$/util/function/BiConsumer;

    move-result-object v7

    invoke-virtual {p1}, Lj$/util/stream/j;->c()Lj$/util/function/c;

    move-result-object v6

    new-instance v0, Lj$/util/stream/D1;

    sget-object v5, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    move-object v4, v0

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Lj$/util/stream/D1;-><init>(Lj$/util/stream/T2;Lj$/util/function/c;Lj$/util/function/BiConsumer;Lj$/util/function/g0;Lj$/util/stream/j;)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Lj$/util/stream/j;->b()Ljava/util/Set;

    move-result-object v1

    sget-object v2, Lj$/util/stream/i;->IDENTITY_FINISH:Lj$/util/stream/i;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lj$/util/stream/j;->e()Lj$/util/function/Function;

    move-result-object p1

    invoke-interface {p1, v0}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final distinct()Lj$/util/stream/Stream;
    .locals 3

    .line 0
    new-instance v0, Lj$/util/stream/p;

    sget v1, Lj$/util/stream/S2;->m:I

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    invoke-direct {v0, p0, v1}, Lj$/util/stream/p;-><init>(Lj$/util/stream/c;I)V

    return-object v0
.end method

.method public final e(Lj$/util/function/g0;Lj$/util/function/BiConsumer;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 7

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v6, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    const/4 v5, 0x3

    move-object v0, v6

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lj$/util/function/Function;)Lj$/util/stream/D;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/t;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x7

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final filter(Lj$/util/function/Predicate;)Lj$/util/stream/Stream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/u;

    sget v1, Lj$/util/stream/S2;->t:I

    const/4 v2, 0x4

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final findAny()Lj$/util/h;
    .locals 7

    const/4 v1, 0x0

    .line 0
    new-instance v6, Lj$/util/stream/E;

    sget-object v2, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/h;->a()Lj$/util/h;

    move-result-object v3

    new-instance v4, Lj$/util/stream/I0;

    const/16 v0, 0x19

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v5, Lj$/util/stream/b;

    const/16 v0, 0xc

    invoke-direct {v5, v0}, Lj$/util/stream/b;-><init>(I)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/h;

    return-object v0
.end method

.method public final findFirst()Lj$/util/h;
    .locals 7

    const/4 v1, 0x1

    .line 0
    new-instance v6, Lj$/util/stream/E;

    sget-object v2, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/h;->a()Lj$/util/h;

    move-result-object v3

    new-instance v4, Lj$/util/stream/I0;

    const/16 v0, 0x19

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v5, Lj$/util/stream/b;

    const/16 v0, 0xc

    invoke-direct {v5, v0}, Lj$/util/stream/b;-><init>(I)V

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/h;

    return-object v0
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/O;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/stream/O;-><init>(Lj$/util/function/Consumer;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method

.method public final h(Ljava/lang/Object;Lj$/util/function/BiFunction;Lj$/util/function/c;)Ljava/lang/Object;
    .locals 7

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v6, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    const/4 v5, 0x2

    move-object v0, v6

    move-object v2, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v6}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/c;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->i(Lj$/util/Spliterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lj$/util/function/Consumer;)Lj$/util/stream/Stream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/u;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    return-object v0
.end method

.method public final limit(J)Lj$/util/stream/Stream;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    invoke-static {p0, v0, v1, p1, p2}, Lj$/util/stream/p2;->h(Lj$/util/stream/c;JJ)Lj$/util/stream/Stream;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final max(Ljava/util/Comparator;)Lj$/util/h;
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/function/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1}, Lj$/util/function/b;-><init>(ILjava/lang/Object;)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/W1;->x(Lj$/util/function/d;)Lj$/util/h;

    move-result-object p1

    return-object p1
.end method

.method public final min(Ljava/util/Comparator;)Lj$/util/h;
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/function/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lj$/util/function/b;-><init>(ILjava/lang/Object;)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/W1;->x(Lj$/util/function/d;)Lj$/util/h;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lj$/util/function/Predicate;)Z
    .locals 1

    sget-object v0, Lj$/util/stream/q0;->ANY:Lj$/util/stream/q0;

    invoke-static {p1, v0}, Lj$/util/stream/t0;->H0(Lj$/util/function/Predicate;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public s(Lj$/util/function/Consumer;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/O;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/O;-><init>(Lj$/util/function/Consumer;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method

.method public final skip(J)Lj$/util/stream/Stream;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const-wide/16 v0, -0x1

    invoke-static {p0, p1, p2, v0, v1}, Lj$/util/stream/p2;->h(Lj$/util/stream/c;JJ)Lj$/util/stream/Stream;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Lj$/util/stream/Stream;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/A2;

    invoke-direct {v0, p0}, Lj$/util/stream/A2;-><init>(Lj$/util/stream/c;)V

    return-object v0
.end method

.method public final sorted(Ljava/util/Comparator;)Lj$/util/stream/Stream;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/A2;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/A2;-><init>(Lj$/util/stream/c;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 2

    new-instance v0, Lj$/util/stream/I0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {p0, v0}, Lj$/util/stream/W1;->toArray(Lj$/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray(Lj$/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lj$/util/stream/c;->N0(Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    invoke-static {v0, p1}, Lj$/util/stream/t0;->w0(Lj$/util/stream/C0;Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    invoke-interface {v0, p1}, Lj$/util/stream/C0;->m(Lj$/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final u(Lj$/util/function/ToIntFunction;)Lj$/util/stream/IntStream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/v;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x6

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

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
    new-instance v0, Lj$/util/stream/R1;

    sget v1, Lj$/util/stream/S2;->r:I

    invoke-direct {v0, p0, v1}, Lj$/util/stream/R1;-><init>(Lj$/util/stream/c;I)V

    :goto_0
    return-object v0
.end method

.method public final v(Lj$/util/function/Function;)Lj$/util/stream/Stream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/S1;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/S1;-><init>(Lj$/util/stream/c;ILj$/util/function/Function;I)V

    return-object v0
.end method

.method public final w(Lj$/util/function/Function;)Lj$/util/stream/Stream;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/S1;

    sget v1, Lj$/util/stream/S2;->p:I

    sget v2, Lj$/util/stream/S2;->n:I

    or-int/2addr v1, v2

    sget v2, Lj$/util/stream/S2;->t:I

    or-int/2addr v1, v2

    const/4 v2, 0x1

    invoke-direct {v0, p0, v1, p1, v2}, Lj$/util/stream/S1;-><init>(Lj$/util/stream/c;ILj$/util/function/Function;I)V

    return-object v0
.end method

.method public final x(Lj$/util/function/d;)Lj$/util/h;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/y1;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/y1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/h;

    return-object p1
.end method
