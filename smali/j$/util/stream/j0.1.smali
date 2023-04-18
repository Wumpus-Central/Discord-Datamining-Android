.class public final synthetic Lj$/util/stream/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/stream/LongStream;


# instance fields
.field public final synthetic a:Lj$/util/stream/k0;


# direct methods
.method private synthetic constructor <init>(Lj$/util/stream/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    return-void
.end method

.method public static synthetic l(Lj$/util/stream/k0;)Lj$/util/stream/j0;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/stream/j0;

    invoke-direct {v0, p0}, Lj$/util/stream/j0;-><init>(Lj$/util/stream/k0;)V

    return-object v0
.end method


# virtual methods
.method public final allMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/P;->a(Ljava/util/function/LongPredicate;)Lj$/util/function/P;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->ALL:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->F0(Lj$/util/function/P;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/P;->a(Ljava/util/function/LongPredicate;)Lj$/util/function/P;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->ANY:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->F0(Lj$/util/function/P;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final asDoubleStream()Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/x;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, v3}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;II)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final average()Ljava/util/OptionalDouble;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    new-instance v2, Lj$/util/stream/b;

    const/16 v3, 0x19

    invoke-direct {v2, v3}, Lj$/util/stream/b;-><init>(I)V

    new-instance v3, Lj$/util/stream/b;

    const/16 v4, 0x1a

    invoke-direct {v3, v4}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/i0;->e1(Lj$/util/function/Supplier;Lj$/util/function/d0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

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

    .line 0
    :goto_0
    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final boxed()Ljava/util/stream/Stream;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/U;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lj$/util/stream/U;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/u;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v2}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjLongConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/g0;->a(Ljava/util/function/Supplier;)Lj$/util/function/g0;

    move-result-object p1

    invoke-static {p2}, Lj$/util/function/c0;->a(Ljava/util/function/ObjLongConsumer;)Lj$/util/function/c0;

    move-result-object p2

    invoke-static {p3}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p3

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0, p1, p2, p3}, Lj$/util/stream/i0;->e1(Lj$/util/function/Supplier;Lj$/util/function/d0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 5

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/w;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-virtual {v2}, Lj$/util/stream/i0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ljava/util/stream/LongStream;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    .line 0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/U;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lj$/util/stream/U;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/u;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x2

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-virtual {v2}, Lj$/util/stream/W1;->distinct()Lj$/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    check-cast v0, Lj$/util/stream/W1;

    invoke-virtual {v0, v1}, Lj$/util/stream/W1;->J(Lj$/util/function/ToLongFunction;)Lj$/util/stream/k0;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    instance-of v1, p1, Lj$/util/stream/j0;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/stream/j0;

    iget-object p1, p1, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final filter(Ljava/util/function/LongPredicate;)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/P;->a(Ljava/util/function/LongPredicate;)Lj$/util/function/P;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w;

    sget v2, Lj$/util/stream/S2;->t:I

    const/4 v3, 0x4

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final findAny()Ljava/util/OptionalLong;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    const/4 v2, 0x0

    .line 0
    new-instance v7, Lj$/util/stream/E;

    sget-object v3, Lj$/util/stream/T2;->LONG_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/l;->a()Lj$/util/l;

    move-result-object v4

    new-instance v5, Lj$/util/stream/I0;

    const/16 v1, 0x18

    invoke-direct {v5, v1}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v6, Lj$/util/stream/b;

    const/16 v1, 0xb

    invoke-direct {v6, v1}, Lj$/util/stream/b;-><init>(I)V

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Lj$/util/l;

    .line 0
    invoke-static {v0}, Lj$/util/i;->d(Lj$/util/l;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final findFirst()Ljava/util/OptionalLong;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    const/4 v2, 0x1

    .line 0
    new-instance v7, Lj$/util/stream/E;

    sget-object v3, Lj$/util/stream/T2;->LONG_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/l;->a()Lj$/util/l;

    move-result-object v4

    new-instance v5, Lj$/util/stream/I0;

    const/16 v1, 0x18

    invoke-direct {v5, v1}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v6, Lj$/util/stream/b;

    const/16 v1, 0xb

    invoke-direct {v6, v1}, Lj$/util/stream/b;-><init>(I)V

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Lj$/util/l;

    .line 0
    invoke-static {v0}, Lj$/util/i;->d(Lj$/util/l;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final flatMap(Ljava/util/function/LongFunction;)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/N;->a(Ljava/util/function/LongFunction;)Lj$/util/function/N;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    sget v3, Lj$/util/stream/S2;->t:I

    or-int/2addr v2, v3

    const/4 v3, 0x3

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/L;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/L;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/k0;->q(Lj$/util/function/M;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/LongConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/L;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/L;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/k0;->o(Lj$/util/function/L;)V

    return-void
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/i0;->g1()Lj$/util/B;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->h(Lj$/util/B;)Lj$/util/v;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava/util/PrimitiveIterator$OfLong;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/i0;->g1()Lj$/util/B;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/Spliterators;->h(Lj$/util/B;)Lj$/util/v;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/u;->a(Lj$/util/v;)Lj$/util/u;

    move-result-object v0

    return-object v0
.end method

.method public final limit(J)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 0
    invoke-static {v0, v1, v2, p1, p2}, Lj$/util/stream/p2;->g(Lj$/util/stream/i0;JJ)Lj$/util/stream/k0;

    move-result-object p1

    .line 0
    invoke-static {p1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final map(Ljava/util/function/LongUnaryOperator;)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/W;->a(Ljava/util/function/LongUnaryOperator;)Lj$/util/function/W;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final mapToDouble(Ljava/util/function/LongToDoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/S;->b(Ljava/util/function/LongToDoubleFunction;)Lj$/util/function/S;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/t;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x5

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final mapToInt(Ljava/util/function/LongToIntFunction;)Ljava/util/stream/IntStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/U;->b(Ljava/util/function/LongToIntFunction;)Lj$/util/function/U;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/v;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x5

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final mapToObj(Ljava/util/function/LongFunction;)Ljava/util/stream/Stream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/N;->a(Ljava/util/function/LongFunction;)Lj$/util/function/N;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/u;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final max()Ljava/util/OptionalLong;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/U;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/i0;->f1(Lj$/util/function/K;)Lj$/util/l;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/i;->d(Lj$/util/l;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ljava/util/OptionalLong;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/U;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/i0;->f1(Lj$/util/function/K;)Lj$/util/l;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/i;->d(Lj$/util/l;)Ljava/util/OptionalLong;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava/util/function/LongPredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/P;->a(Ljava/util/function/LongPredicate;)Lj$/util/function/P;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->NONE:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->F0(Lj$/util/function/P;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->onClose(Ljava/lang/Runnable;)Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallel()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-interface {v0}, Lj$/util/stream/k0;->parallel()Lj$/util/stream/k0;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object v0

    return-object v0
.end method

.method public final peek(Ljava/util/function/LongConsumer;)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/L;->a(Ljava/util/function/LongConsumer;)Lj$/util/function/L;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w;

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final reduce(JLjava/util/function/LongBinaryOperator;)J
    .locals 3

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p3}, Lj$/util/function/J;->a(Ljava/util/function/LongBinaryOperator;)Lj$/util/function/J;

    move-result-object p3

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/K1;

    sget-object v2, Lj$/util/stream/T2;->LONG_VALUE:Lj$/util/stream/T2;

    invoke-direct {v1, v2, p3, p1, p2}, Lj$/util/stream/K1;-><init>(Lj$/util/stream/T2;Lj$/util/function/K;J)V

    .line 0
    invoke-virtual {v0, v1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    return-wide p1
.end method

.method public final synthetic reduce(Ljava/util/function/LongBinaryOperator;)Ljava/util/OptionalLong;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-static {p1}, Lj$/util/function/J;->a(Ljava/util/function/LongBinaryOperator;)Lj$/util/function/J;

    move-result-object p1

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0, p1}, Lj$/util/stream/i0;->f1(Lj$/util/function/K;)Lj$/util/l;

    move-result-object p1

    invoke-static {p1}, Lj$/util/i;->d(Lj$/util/l;)Ljava/util/OptionalLong;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    invoke-interface {v0}, Lj$/util/stream/k0;->sequential()Lj$/util/stream/k0;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object v0

    return-object v0
.end method

.method public final skip(J)Ljava/util/stream/LongStream;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-ltz v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    .line 0
    invoke-static {v0, p1, p2, v1, v2}, Lj$/util/stream/p2;->g(Lj$/util/stream/i0;JJ)Lj$/util/stream/k0;

    move-result-object v0

    .line 0
    :goto_0
    invoke-static {v0}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1

    .line 0
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final sorted()Ljava/util/stream/LongStream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/z2;

    invoke-direct {v1, v0}, Lj$/util/stream/z2;-><init>(Lj$/util/stream/i0;)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator$OfLong;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Lj$/util/stream/i0;->g1()Lj$/util/B;

    move-result-object v0

    invoke-static {v0}, Lj$/util/A;->a(Lj$/util/B;)Lj$/util/A;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/i0;->g1()Lj$/util/B;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sum()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Lj$/util/stream/i0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final summaryStatistics()Ljava/util/LongSummaryStatistics;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v2, Lj$/util/stream/U;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lj$/util/stream/U;-><init>(I)V

    new-instance v3, Lj$/util/stream/U;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lj$/util/stream/U;-><init>(I)V

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/i0;->e1(Lj$/util/function/Supplier;Lj$/util/function/d0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/g;

    .line 0
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toArray()[J
    .locals 3

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/c;->N0(Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/A0;

    invoke-static {v0}, Lj$/util/stream/t0;->z0(Lj$/util/stream/A0;)Lj$/util/stream/A0;

    move-result-object v0

    invoke-interface {v0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method

.method public final synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/j0;->a:Lj$/util/stream/k0;

    check-cast v0, Lj$/util/stream/i0;

    invoke-virtual {v0}, Lj$/util/stream/i0;->unordered()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
