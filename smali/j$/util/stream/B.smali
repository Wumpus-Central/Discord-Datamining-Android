.class abstract Lj$/util/stream/B;
.super Lj$/util/stream/c;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/D;


# direct methods
.method constructor <init>(Lj$/util/Spliterator;I)V
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

.method static synthetic c1(Lj$/util/Spliterator;)Lj$/util/y;
    .locals 0

    invoke-static {p0}, Lj$/util/stream/B;->d1(Lj$/util/Spliterator;)Lj$/util/y;

    move-result-object p0

    return-object p0
.end method

.method private static d1(Lj$/util/Spliterator;)Lj$/util/y;
    .locals 1

    instance-of v0, p0, Lj$/util/y;

    if-eqz v0, :cond_0

    check-cast p0, Lj$/util/y;

    return-object p0

    :cond_0
    sget-boolean p0, Lj$/util/stream/G3;->a:Z

    if-eqz p0, :cond_1

    const-class p0, Lj$/util/stream/c;

    const-string v0, "using DoubleStream.adapt(Spliterator<Double> s)"

    invoke-static {p0, v0}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "DoubleStream.adapt(Spliterator<Double> s)"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method final G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;
    .locals 0

    invoke-static {p1, p2}, Lj$/util/stream/t0;->t0(J)Lj$/util/stream/u0;

    move-result-object p1

    return-object p1
.end method

.method final O0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    invoke-static {p1, p2, p3}, Lj$/util/stream/t0;->n0(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)Lj$/util/stream/y0;

    move-result-object p1

    return-object p1
.end method

.method final P0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V
    .locals 2

    invoke-static {p1}, Lj$/util/stream/B;->d1(Lj$/util/Spliterator;)Lj$/util/y;

    move-result-object p1

    .line 0
    instance-of v0, p2, Lj$/util/function/i;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lj$/util/function/i;

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_3

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p2}, Lj$/util/stream/r;-><init>(ILj$/util/stream/e2;)V

    .line 0
    :cond_1
    :goto_0
    invoke-interface {p2}, Lj$/util/stream/e2;->e()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p1, v0}, Lj$/util/y;->f(Lj$/util/function/i;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_2
    return-void

    .line 0
    :cond_3
    const-class p1, Lj$/util/stream/c;

    const-string p2, "using DoubleStream.adapt(Sink<Double> s)"

    invoke-static {p1, p2}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method final Q0()Lj$/util/stream/T2;
    .locals 1

    sget-object v0, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    return-object v0
.end method

.method final a1(Lj$/util/stream/t0;Lj$/util/stream/a;Z)Lj$/util/Spliterator;
    .locals 1

    new-instance v0, Lj$/util/stream/d3;

    invoke-direct {v0, p1, p2, p3}, Lj$/util/stream/d3;-><init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V

    return-object v0
.end method

.method public final e1(Lj$/util/function/Supplier;Lj$/util/function/Z;Lj$/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 6

    new-instance v2, Lj$/util/stream/q;

    const/4 v0, 0x0

    invoke-direct {v2, p3, v0}, Lj$/util/stream/q;-><init>(Lj$/util/function/BiConsumer;I)V

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance p3, Lj$/util/stream/u1;

    sget-object v1, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    const/4 v5, 0x1

    move-object v0, p3

    move-object v3, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/u1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, p3}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f1(Lj$/util/function/g;)Lj$/util/j;
    .locals 3

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/y1;

    sget-object v1, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/y1;-><init>(Lj$/util/stream/T2;Ljava/lang/Object;I)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/j;

    return-object p1
.end method

.method public final g1()Lj$/util/y;
    .locals 1

    invoke-super {p0}, Lj$/util/stream/c;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/B;->d1(Lj$/util/Spliterator;)Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->f(Lj$/util/y;)Lj$/util/p;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic spliterator()Lj$/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/B;->g1()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public t(Lj$/util/function/i;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/L;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lj$/util/stream/L;-><init>(Lj$/util/function/i;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method

.method public final unordered()Lj$/util/stream/h;
    .locals 3

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/c;->S0()Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lj$/util/stream/x;

    sget v1, Lj$/util/stream/S2;->r:I

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lj$/util/stream/x;-><init>(Lj$/util/stream/c;II)V

    :goto_0
    return-object v0
.end method

.method public z(Lj$/util/function/h;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/L;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lj$/util/stream/L;-><init>(Lj$/util/function/i;Z)V

    .line 0
    invoke-virtual {p0, v0}, Lj$/util/stream/c;->M0(Lj$/util/stream/D3;)Ljava/lang/Object;

    return-void
.end method
