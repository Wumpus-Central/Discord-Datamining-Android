.class public final synthetic Lj$/util/stream/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/stream/IntStream;


# instance fields
.field public final synthetic a:Lj$/util/stream/IntStream;


# direct methods
.method private synthetic constructor <init>(Lj$/util/stream/IntStream;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    return-void
.end method

.method public static synthetic l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lj$/util/stream/c0;

    invoke-direct {v0, p0}, Lj$/util/stream/c0;-><init>(Lj$/util/stream/IntStream;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic allMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/B;->a(Ljava/util/function/IntPredicate;)Lj$/util/function/B;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->F(Lj$/util/function/B;)Z

    move-result p1

    return p1
.end method

.method public final synthetic anyMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/B;->a(Ljava/util/function/IntPredicate;)Lj$/util/function/B;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->m(Lj$/util/function/B;)Z

    move-result p1

    return p1
.end method

.method public final synthetic asDoubleStream()Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->asDoubleStream()Lj$/util/stream/D;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic asLongStream()Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->asLongStream()Lj$/util/stream/k0;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic average()Ljava/util/OptionalDouble;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->average()Lj$/util/j;

    move-result-object v0

    invoke-static {v0}, Lj$/util/i;->b(Lj$/util/j;)Ljava/util/OptionalDouble;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic boxed()Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->boxed()Lj$/util/stream/Stream;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->close()V

    return-void
.end method

.method public final synthetic collect(Ljava/util/function/Supplier;Ljava/util/function/ObjIntConsumer;Ljava/util/function/BiConsumer;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/g0;->a(Ljava/util/function/Supplier;)Lj$/util/function/g0;

    move-result-object p1

    invoke-static {p2}, Lj$/util/function/a0;->b(Ljava/util/function/ObjIntConsumer;)Lj$/util/function/a0;

    move-result-object p2

    invoke-static {p3}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Lj$/util/stream/IntStream;->n(Lj$/util/function/Supplier;Lj$/util/function/b0;Lj$/util/function/BiConsumer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic count()J
    .locals 2

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->count()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic distinct()Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->distinct()Lj$/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    instance-of v1, p1, Lj$/util/stream/c0;

    if-eqz v1, :cond_0

    check-cast p1, Lj$/util/stream/c0;

    iget-object p1, p1, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic filter(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/B;->a(Ljava/util/function/IntPredicate;)Lj$/util/function/B;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->k(Lj$/util/function/B;)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic findAny()Ljava/util/OptionalInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->findAny()Lj$/util/k;

    move-result-object v0

    invoke-static {v0}, Lj$/util/i;->c(Lj$/util/k;)Ljava/util/OptionalInt;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic findFirst()Ljava/util/OptionalInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->findFirst()Lj$/util/k;

    move-result-object v0

    invoke-static {v0}, Lj$/util/i;->c(Lj$/util/k;)Ljava/util/OptionalInt;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic flatMap(Ljava/util/function/IntFunction;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/A;->a(Ljava/util/function/IntFunction;)Lj$/util/function/A;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->M(Lj$/util/function/A;)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEach(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/y;->a(Ljava/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->C(Lj$/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic forEachOrdered(Ljava/util/function/IntConsumer;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/y;->a(Ljava/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->A(Lj$/util/function/IntConsumer;)V

    return-void
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isParallel()Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->isParallel()Z

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/PrimitiveIterator$OfInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->iterator()Lj$/util/s;

    move-result-object v0

    invoke-static {v0}, Lj$/util/r;->a(Lj$/util/s;)Lj$/util/r;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic limit(J)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/IntStream;->limit(J)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic map(Ljava/util/function/IntUnaryOperator;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/H;->b(Ljava/util/function/IntUnaryOperator;)Lj$/util/function/H;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->g(Lj$/util/function/H;)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToDouble(Ljava/util/function/IntToDoubleFunction;)Ljava/util/stream/DoubleStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/D;->b(Ljava/util/function/IntToDoubleFunction;)Lj$/util/function/D;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->r(Lj$/util/function/D;)Lj$/util/stream/D;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/C;->l(Lj$/util/stream/D;)Lj$/util/stream/C;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToLong(Ljava/util/function/IntToLongFunction;)Ljava/util/stream/LongStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/F;->a(Ljava/util/function/IntToLongFunction;)Lj$/util/function/F;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->b(Lj$/util/function/G;)Lj$/util/stream/k0;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/j0;->l(Lj$/util/stream/k0;)Lj$/util/stream/j0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic mapToObj(Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/A;->a(Ljava/util/function/IntFunction;)Lj$/util/function/A;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->B(Lj$/util/function/IntFunction;)Lj$/util/stream/Stream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/Stream$Wrapper;->convert(Lj$/util/stream/Stream;)Ljava/util/stream/Stream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic max()Ljava/util/OptionalInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->max()Lj$/util/k;

    move-result-object v0

    invoke-static {v0}, Lj$/util/i;->c(Lj$/util/k;)Ljava/util/OptionalInt;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic min()Ljava/util/OptionalInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->min()Lj$/util/k;

    move-result-object v0

    invoke-static {v0}, Lj$/util/i;->c(Lj$/util/k;)Ljava/util/OptionalInt;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic noneMatch(Ljava/util/function/IntPredicate;)Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/B;->a(Ljava/util/function/IntPredicate;)Lj$/util/function/B;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->K(Lj$/util/function/B;)Z

    move-result p1

    return p1
.end method

.method public final synthetic onClose(Ljava/lang/Runnable;)Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0, p1}, Lj$/util/stream/h;->onClose(Ljava/lang/Runnable;)Lj$/util/stream/h;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic parallel()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->parallel()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic parallel()Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->parallel()Lj$/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic peek(Ljava/util/function/IntConsumer;)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/y;->a(Ljava/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->H(Lj$/util/function/IntConsumer;)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic reduce(ILjava/util/function/IntBinaryOperator;)I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p2}, Lj$/util/function/v;->a(Ljava/util/function/IntBinaryOperator;)Lj$/util/function/v;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lj$/util/stream/IntStream;->i(ILj$/util/function/w;)I

    move-result p1

    return p1
.end method

.method public final synthetic reduce(Ljava/util/function/IntBinaryOperator;)Ljava/util/OptionalInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-static {p1}, Lj$/util/function/v;->a(Ljava/util/function/IntBinaryOperator;)Lj$/util/function/v;

    move-result-object p1

    invoke-interface {v0, p1}, Lj$/util/stream/IntStream;->G(Lj$/util/function/w;)Lj$/util/k;

    move-result-object p1

    invoke-static {p1}, Lj$/util/i;->c(Lj$/util/k;)Ljava/util/OptionalInt;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sequential()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->sequential()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sequential()Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->sequential()Lj$/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic skip(J)Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/IntStream;->skip(J)Lj$/util/stream/IntStream;

    move-result-object p1

    invoke-static {p1}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic sorted()Ljava/util/stream/IntStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->sorted()Lj$/util/stream/IntStream;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/c0;->l(Lj$/util/stream/IntStream;)Lj$/util/stream/c0;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator$OfInt;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->spliterator()Lj$/util/Spliterator$OfInt;

    move-result-object v0

    invoke-static {v0}, Lj$/util/z;->a(Lj$/util/Spliterator$OfInt;)Lj$/util/z;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic sum()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->sum()I

    move-result v0

    return v0
.end method

.method public final summaryStatistics()Ljava/util/IntSummaryStatistics;
    .locals 2

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->summaryStatistics()Lj$/util/f;

    .line 0
    new-instance v0, Ljava/lang/Error;

    const-string v1, "Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics"

    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic toArray()[I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/IntStream;->toArray()[I

    move-result-object v0

    return-object v0
.end method

.method public final synthetic unordered()Ljava/util/stream/BaseStream;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/c0;->a:Lj$/util/stream/IntStream;

    invoke-interface {v0}, Lj$/util/stream/h;->unordered()Lj$/util/stream/h;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/g;->l(Lj$/util/stream/h;)Ljava/util/stream/BaseStream;

    move-result-object v0

    return-object v0
.end method
