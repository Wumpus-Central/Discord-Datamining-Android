.class public final synthetic Lj$/util/stream/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/stream/DoubleStream;


# instance fields
.field public final synthetic a:Lj$/util/stream/D;


# direct methods
.method private synthetic constructor <init>(Lj$/util/stream/D;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    return-void
.end method

.method public static synthetic l(Lj$/util/stream/D;)Lj$/util/stream/C;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/stream/C;

    invoke-direct {v0, p0}, Lj$/util/stream/C;-><init>(Lj$/util/stream/D;)V

    return-object v0
.end method


# virtual methods
.method public final allMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/l;->a(Ljava/util/function/DoublePredicate;)Lj$/util/function/l;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->ALL:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->D0(Lj$/util/function/l;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final anyMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/l;->a(Ljava/util/function/DoublePredicate;)Lj$/util/function/l;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->ANY:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->D0(Lj$/util/function/l;Lj$/util/stream/q0;)Lj$/util/stream/r0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public final average()Ljava/util/OptionalDouble;
    .locals 7

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    new-instance v2, Lj$/util/stream/b;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lj$/util/stream/b;-><init>(I)V

    new-instance v3, Lj$/util/stream/b;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/B;->e1(Lj$/util/function/Supplier;Lj$/util/function/Z;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    const/4 v1, 0x2

    aget-wide v2, v0, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_1

    sget v2, Lj$/util/stream/l;->a:I

    const/4 v2, 0x0

    .line 0
    aget-wide v2, v0, v2

    const/4 v4, 0x1

    aget-wide v5, v0, v4

    add-double/2addr v2, v5

    array-length v5, v0

    sub-int/2addr v5, v4

    aget-wide v4, v0, v5

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v6

    if-eqz v6, :cond_0

    move-wide v2, v4

    .line 0
    :cond_0
    aget-wide v4, v0, v1

    div-double/2addr v2, v4

    invoke-static {v2, v3}, Lj$/util/j;->d(D)Lj$/util/j;

    move-result-object v0

    goto :goto_0

    :cond_1
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

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/u;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v2}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjDoubleConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/g0;->a(Ljava/util/function/Supplier;)Lj$/util/function/g0;

    move-result-object p1

    invoke-static {p2}, Lj$/util/function/Y;->a(Ljava/util/function/ObjDoubleConsumer;)Lj$/util/function/Y;

    move-result-object p2

    invoke-static {p3}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p3

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0, p1, p2, p3}, Lj$/util/stream/B;->e1(Lj$/util/function/Supplier;Lj$/util/function/Z;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final count()J
    .locals 5

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/w;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-virtual {v2}, Lj$/util/stream/i0;->sum()J

    move-result-wide v0

    return-wide v0
.end method

.method public final distinct()Ljava/util/stream/DoubleStream;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    .line 0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    .line 0
    new-instance v2, Lj$/util/stream/u;

    sget v3, Lj$/util/stream/S2;->p:I

    sget v4, Lj$/util/stream/S2;->n:I

    or-int/2addr v3, v4

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v1, v4}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-virtual {v2}, Lj$/util/stream/W1;->distinct()Lj$/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    check-cast v0, Lj$/util/stream/W1;

    invoke-virtual {v0, v1}, Lj$/util/stream/W1;->L(Lj$/util/function/ToDoubleFunction;)Lj$/util/stream/D;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    instance-of v1, p1, Lj$/util/stream/C;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/stream/C;

    iget-object p1, p1, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final filter(Ljava/util/function/DoublePredicate;)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/l;->a(Ljava/util/function/DoublePredicate;)Lj$/util/function/l;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/t;

    sget v2, Lj$/util/stream/S2;->t:I

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final findAny()Ljava/util/OptionalDouble;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    const/4 v2, 0x0

    .line 0
    new-instance v7, Lj$/util/stream/E;

    sget-object v3, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/j;->a()Lj$/util/j;

    move-result-object v4

    new-instance v5, Lj$/util/stream/I0;

    const/16 v1, 0x17

    invoke-direct {v5, v1}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v6, Lj$/util/stream/b;

    const/16 v1, 0xa

    invoke-direct {v6, v1}, Lj$/util/stream/b;-><init>(I)V

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Lj$/util/j;

    .line 0
    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final findFirst()Ljava/util/OptionalDouble;
    .locals 8

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    const/4 v2, 0x1

    .line 0
    new-instance v7, Lj$/util/stream/E;

    sget-object v3, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    invoke-static {}, Lj$/util/j;->a()Lj$/util/j;

    move-result-object v4

    new-instance v5, Lj$/util/stream/I0;

    const/16 v1, 0x17

    invoke-direct {v5, v1}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v6, Lj$/util/stream/b;

    const/16 v1, 0xa

    invoke-direct {v6, v1}, Lj$/util/stream/b;-><init>(I)V

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lj$/util/stream/E;-><init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V

    .line 0
    invoke-virtual {v0, v7}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object v0

    .line 0
    check-cast v0, Lj$/util/j;

    .line 0
    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final flatMap(Ljava/util/function/DoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/j;->a(Ljava/util/function/DoubleFunction;)Lj$/util/function/j;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/t;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    sget v3, Lj$/util/stream/S2;->t:I

    or-int/2addr v2, v3

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/h;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/D;->t(Lj$/util/function/i;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/DoubleConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/h;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/D;->z(Lj$/util/function/h;)V

    return-void
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->f(Lj$/util/y;)Lj$/util/p;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava/util/PrimitiveIterator$OfDouble;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/Spliterators;->f(Lj$/util/y;)Lj$/util/p;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/o;->a(Lj$/util/p;)Lj$/util/o;

    move-result-object v0

    return-object v0
.end method

.method public final limit(J)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 0
    invoke-static {v0, v1, v2, p1, p2}, Lj$/util/stream/p2;->e(Lj$/util/stream/B;JJ)Lj$/util/stream/D;

    move-result-object p1

    .line 0
    invoke-static {p1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

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

.method public final map(Ljava/util/function/DoubleUnaryOperator;)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/r;->b(Ljava/util/function/DoubleUnaryOperator;)Lj$/util/function/r;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/t;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final mapToInt(Ljava/util/function/DoubleToIntFunction;)Ljava/util/stream/IntStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/n;->b(Ljava/util/function/DoubleToIntFunction;)Lj$/util/function/n;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/v;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/v;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final mapToLong(Ljava/util/function/DoubleToLongFunction;)Ljava/util/stream/LongStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/p;->a(Ljava/util/function/DoubleToLongFunction;)Lj$/util/function/p;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/w;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final mapToObj(Ljava/util/function/DoubleFunction;)Ljava/util/stream/Stream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/j;->a(Ljava/util/function/DoubleFunction;)Lj$/util/function/j;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/u;

    sget v2, Lj$/util/stream/S2;->p:I

    sget v3, Lj$/util/stream/S2;->n:I

    or-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/u;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final max()Ljava/util/OptionalDouble;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/B;->f1(Lj$/util/function/g;)Lj$/util/j;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final min()Ljava/util/OptionalDouble;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/B;->f1(Lj$/util/function/g;)Lj$/util/j;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final noneMatch(Ljava/util/function/DoublePredicate;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/l;->a(Ljava/util/function/DoublePredicate;)Lj$/util/function/l;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v1, Lj$/util/stream/q0;->NONE:Lj$/util/stream/q0;

    invoke-static {p1, v1}, Lj$/util/stream/t0;->D0(Lj$/util/function/l;Lj$/util/stream/q0;)Lj$/util/stream/r0;

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

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0, p1}, Lj$/util/stream/c;->onClose(Ljava/lang/Runnable;)Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->parallel()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallel()Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-interface {v0}, Lj$/util/stream/D;->parallel()Lj$/util/stream/D;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final peek(Ljava/util/function/DoubleConsumer;)Ljava/util/stream/DoubleStream;
    .locals 4

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/h;->a(Ljava/util/function/DoubleConsumer;)Lj$/util/function/h;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/t;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v0, v2, p1, v3}, Lj$/util/stream/t;-><init>(Lj$/util/stream/c;ILjava/lang/Object;I)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final reduce(DLjava/util/function/DoubleBinaryOperator;)D
    .locals 3

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p3}, Lj$/util/function/f;->a(Ljava/util/function/DoubleBinaryOperator;)Lj$/util/function/f;

    move-result-object p3

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/w1;

    sget-object v2, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    invoke-direct {v1, v2, p3, p1, p2}, Lj$/util/stream/w1;-><init>(Lj$/util/stream/T2;Lj$/util/function/f;D)V

    .line 0
    invoke-virtual {v0, v1}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p1

    return-wide p1
.end method

.method public final synthetic reduce(Ljava/util/function/DoubleBinaryOperator;)Ljava/util/OptionalDouble;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-static {p1}, Lj$/util/function/f;->a(Ljava/util/function/DoubleBinaryOperator;)Lj$/util/function/f;

    move-result-object p1

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0, p1}, Lj$/util/stream/B;->f1(Lj$/util/function/g;)Lj$/util/j;

    move-result-object p1

    invoke-static {p1}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->sequential()Lj$/util/stream/h;

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    invoke-interface {v0}, Lj$/util/stream/D;->sequential()Lj$/util/stream/D;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final skip(J)Ljava/util/stream/DoubleStream;
    .locals 3

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-ltz v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    .line 0
    invoke-static {v0, p1, p2, v1, v2}, Lj$/util/stream/p2;->e(Lj$/util/stream/B;JJ)Lj$/util/stream/D;

    move-result-object v0

    .line 0
    :goto_0
    invoke-static {v0}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

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

.method public final sorted()Ljava/util/stream/DoubleStream;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/x2;

    invoke-direct {v1, v0}, Lj$/util/stream/x2;-><init>(Lj$/util/stream/B;)V

    .line 0
    invoke-static {v1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator$OfDouble;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    invoke-static {v0}, Lj$/util/x;->a(Lj$/util/y;)Lj$/util/x;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    .line 0
    invoke-virtual {v0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    .line 0
    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final sum()D
    .locals 6

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    new-instance v2, Lj$/util/stream/b;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lj$/util/stream/b;-><init>(I)V

    new-instance v3, Lj$/util/stream/b;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/B;->e1(Lj$/util/function/Supplier;Lj$/util/function/Z;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    sget v1, Lj$/util/stream/l;->a:I

    const/4 v1, 0x0

    .line 0
    aget-wide v1, v0, v1

    const/4 v3, 0x1

    aget-wide v4, v0, v3

    add-double/2addr v1, v4

    array-length v4, v0

    sub-int/2addr v4, v3

    aget-wide v3, v0, v4

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v3, v4}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_0

    move-wide v1, v3

    :cond_0
    return-wide v1
.end method

.method public final summaryStatistics()Ljava/util/DoubleSummaryStatistics;
    .locals 5

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/I0;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v2, Lj$/util/stream/I0;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lj$/util/stream/I0;-><init>(I)V

    new-instance v3, Lj$/util/stream/I0;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lj$/util/stream/I0;-><init>(I)V

    invoke-virtual {v0, v1, v2, v3}, Lj$/util/stream/B;->e1(Lj$/util/function/Supplier;Lj$/util/function/Z;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/e;

    .line 0
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toArray()[D
    .locals 3

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v1, Lj$/util/stream/b;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lj$/util/stream/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lj$/util/stream/c;->N0(Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    check-cast v0, Lj$/util/stream/y0;

    invoke-static {v0}, Lj$/util/stream/t0;->x0(Lj$/util/stream/y0;)Lj$/util/stream/y0;

    move-result-object v0

    invoke-interface {v0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method

.method public final synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/C;->a:Lj$/util/stream/D;

    check-cast v0, Lj$/util/stream/B;

    invoke-virtual {v0}, Lj$/util/stream/B;->unordered()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
