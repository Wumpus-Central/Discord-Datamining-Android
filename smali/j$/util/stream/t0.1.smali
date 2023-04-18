.class public abstract synthetic Lj$/util/stream/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/D3;


# static fields
.field private static final a:Lj$/util/stream/V0;

.field private static final b:Lj$/util/stream/z0;

.field private static final c:Lj$/util/stream/A0;

.field private static final d:Lj$/util/stream/y0;

.field private static final e:[I

.field private static final f:[J

.field private static final g:[D


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 0
    new-instance v0, Lj$/util/stream/V0;

    invoke-direct {v0}, Lj$/util/stream/V0;-><init>()V

    sput-object v0, Lj$/util/stream/t0;->a:Lj$/util/stream/V0;

    new-instance v0, Lj$/util/stream/T0;

    invoke-direct {v0}, Lj$/util/stream/T0;-><init>()V

    sput-object v0, Lj$/util/stream/t0;->b:Lj$/util/stream/z0;

    new-instance v0, Lj$/util/stream/U0;

    invoke-direct {v0}, Lj$/util/stream/U0;-><init>()V

    sput-object v0, Lj$/util/stream/t0;->c:Lj$/util/stream/A0;

    new-instance v0, Lj$/util/stream/S0;

    invoke-direct {v0}, Lj$/util/stream/S0;-><init>()V

    sput-object v0, Lj$/util/stream/t0;->d:Lj$/util/stream/y0;

    const/4 v0, 0x0

    new-array v1, v0, [I

    sput-object v1, Lj$/util/stream/t0;->e:[I

    new-array v1, v0, [J

    sput-object v1, Lj$/util/stream/t0;->f:[J

    new-array v0, v0, [D

    sput-object v0, Lj$/util/stream/t0;->g:[D

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lj$/util/stream/T2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static B0(J)Lj$/util/stream/v0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/Z0;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/Z0;-><init>(J)V

    goto :goto_0

    .line 0
    :cond_0
    new-instance v0, Lj$/util/stream/a1;

    invoke-direct {v0}, Lj$/util/stream/a1;-><init>()V

    :goto_0
    return-object v0
.end method

.method static C0(J)Lj$/util/stream/w0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/i1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/i1;-><init>(J)V

    goto :goto_0

    .line 0
    :cond_0
    new-instance v0, Lj$/util/stream/j1;

    invoke-direct {v0}, Lj$/util/stream/j1;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static D0(Lj$/util/function/l;Lj$/util/stream/q0;)Lj$/util/stream/r0;
    .locals 4

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/r0;

    sget-object v1, Lj$/util/stream/T2;->DOUBLE_VALUE:Lj$/util/stream/T2;

    new-instance v2, Lj$/util/stream/m;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p1, p0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/r0;-><init>(Lj$/util/stream/T2;Lj$/util/stream/q0;Lj$/util/stream/m;)V

    return-object v0
.end method

.method public static E0(Lj$/util/function/B;Lj$/util/stream/q0;)Lj$/util/stream/r0;
    .locals 4

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/r0;

    sget-object v1, Lj$/util/stream/T2;->INT_VALUE:Lj$/util/stream/T2;

    new-instance v2, Lj$/util/stream/m;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1, p0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/r0;-><init>(Lj$/util/stream/T2;Lj$/util/stream/q0;Lj$/util/stream/m;)V

    return-object v0
.end method

.method public static F0(Lj$/util/function/P;Lj$/util/stream/q0;)Lj$/util/stream/r0;
    .locals 4

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/r0;

    sget-object v1, Lj$/util/stream/T2;->LONG_VALUE:Lj$/util/stream/T2;

    new-instance v2, Lj$/util/stream/m;

    const/4 v3, 0x4

    invoke-direct {v2, v3, p1, p0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/r0;-><init>(Lj$/util/stream/T2;Lj$/util/stream/q0;Lj$/util/stream/m;)V

    return-object v0
.end method

.method public static H0(Lj$/util/function/Predicate;Lj$/util/stream/q0;)Lj$/util/stream/r0;
    .locals 4

    .line 0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    new-instance v0, Lj$/util/stream/r0;

    sget-object v1, Lj$/util/stream/T2;->REFERENCE:Lj$/util/stream/T2;

    new-instance v2, Lj$/util/stream/m;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p1, p0}, Lj$/util/stream/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1, v2}, Lj$/util/stream/r0;-><init>(Lj$/util/stream/T2;Lj$/util/stream/q0;Lj$/util/stream/m;)V

    return-object v0
.end method

.method public static O()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static P(Lj$/util/stream/b2;Ljava/lang/Double;)V
    .locals 2

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lj$/util/stream/b2;->accept(D)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfDouble.accept(Double)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic Q(Lj$/util/stream/b2;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Double;

    invoke-interface {p0, p1}, Lj$/util/stream/b2;->k(Ljava/lang/Double;)V

    return-void
.end method

.method public static R(Lj$/util/stream/c2;Ljava/lang/Integer;)V
    .locals 1

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {p0, p1}, Lj$/util/stream/c2;->accept(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfInt.accept(Integer)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic S(Lj$/util/stream/c2;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-interface {p0, p1}, Lj$/util/stream/c2;->d(Ljava/lang/Integer;)V

    return-void
.end method

.method public static T(Lj$/util/stream/d2;Ljava/lang/Long;)V
    .locals 2

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-interface {p0, v0, v1}, Lj$/util/stream/d2;->accept(J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Sink.OfLong.accept(Long)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic U(Lj$/util/stream/d2;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-interface {p0, p1}, Lj$/util/stream/d2;->j(Ljava/lang/Long;)V

    return-void
.end method

.method public static V()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static W()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "called wrong accept method"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static X(Lj$/util/stream/B0;Lj$/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 4

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lj$/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lj$/util/stream/C0;->i([Ljava/lang/Object;I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfPrimitive.asArray"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static Y(Lj$/util/stream/y0;[Ljava/lang/Double;I)V
    .locals 4

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [D

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget-wide v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfDouble.copyInto(Double[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static Z(Lj$/util/stream/z0;[Ljava/lang/Integer;I)V
    .locals 3

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget v2, p0, v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.copyInto(Integer[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static a0(Lj$/util/stream/A0;[Ljava/lang/Long;I)V
    .locals 4

    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [J

    const/4 v0, 0x0

    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_0

    add-int v1, p2, v0

    aget-wide v2, p0, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, p1, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.copyInto(Long[], int)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static b0(Lj$/util/stream/y0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/i;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/i;

    invoke-interface {p0, p1}, Lj$/util/stream/B0;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/y;

    invoke-interface {p0, p1}, Lj$/util/y;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfLong.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static c0(Lj$/util/stream/z0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/IntConsumer;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/IntConsumer;

    invoke-interface {p0, p1}, Lj$/util/stream/B0;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/Spliterator$OfInt;

    invoke-interface {p0, p1}, Lj$/util/Spliterator$OfInt;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfInt.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static d0(Lj$/util/stream/A0;Lj$/util/function/Consumer;)V
    .locals 1

    instance-of v0, p1, Lj$/util/function/M;

    if-eqz v0, :cond_0

    check-cast p1, Lj$/util/function/M;

    invoke-interface {p0, p1}, Lj$/util/stream/B0;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Lj$/util/stream/G3;->a:Z

    if-nez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/B;

    invoke-interface {p0, p1}, Lj$/util/B;->forEachRemaining(Lj$/util/function/Consumer;)V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string p1, "{0} calling Node.OfLong.forEachRemaining(Consumer)"

    invoke-static {p0, p1}, Lj$/util/stream/G3;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static e0(Lj$/util/stream/y0;JJ)Lj$/util/stream/y0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/y;

    invoke-static {p3, p4}, Lj$/util/stream/t0;->t0(J)Lj$/util/stream/u0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/e2;->c(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    new-instance v3, Lj$/util/stream/i3;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lj$/util/stream/i3;-><init>(I)V

    invoke-interface {p0, v3}, Lj$/util/y;->f(Lj$/util/function/i;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/y;->f(Lj$/util/function/i;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    invoke-interface {v0}, Lj$/util/stream/u0;->build()Lj$/util/stream/y0;

    move-result-object p0

    return-object p0
.end method

.method public static f0(Lj$/util/stream/z0;JJ)Lj$/util/stream/z0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/Spliterator$OfInt;

    invoke-static {p3, p4}, Lj$/util/stream/t0;->B0(J)Lj$/util/stream/v0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/e2;->c(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    new-instance v3, Lj$/util/stream/k3;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lj$/util/stream/k3;-><init>(I)V

    invoke-interface {p0, v3}, Lj$/util/Spliterator$OfInt;->tryAdvance(Lj$/util/function/IntConsumer;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/Spliterator$OfInt;->tryAdvance(Lj$/util/function/IntConsumer;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    invoke-interface {v0}, Lj$/util/stream/v0;->build()Lj$/util/stream/z0;

    move-result-object p0

    return-object p0
.end method

.method public static g0(Lj$/util/stream/A0;JJ)Lj$/util/stream/A0;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    sub-long/2addr p3, p1

    invoke-interface {p0}, Lj$/util/stream/B0;->spliterator()Lj$/util/D;

    move-result-object p0

    check-cast p0, Lj$/util/B;

    invoke-static {p3, p4}, Lj$/util/stream/t0;->C0(J)Lj$/util/stream/w0;

    move-result-object v0

    invoke-interface {v0, p3, p4}, Lj$/util/stream/e2;->c(J)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    int-to-long v3, v2

    cmp-long v3, v3, p1

    if-gez v3, :cond_1

    new-instance v3, Lj$/util/stream/m3;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lj$/util/stream/m3;-><init>(I)V

    invoke-interface {p0, v3}, Lj$/util/B;->b(Lj$/util/function/M;)Z

    move-result v3

    if-eqz v3, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v1

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, v0}, Lj$/util/B;->b(Lj$/util/function/M;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    invoke-interface {v0}, Lj$/util/stream/w0;->build()Lj$/util/stream/A0;

    move-result-object p0

    return-object p0
.end method

.method public static h0(Lj$/util/stream/C0;JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lj$/util/stream/C0;->spliterator()Lj$/util/Spliterator;

    move-result-object p0

    sub-long/2addr p3, p1

    invoke-static {p3, p4, p5}, Lj$/util/stream/t0;->l0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;

    move-result-object p5

    invoke-interface {p5, p3, p4}, Lj$/util/stream/e2;->c(J)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    int-to-long v2, v1

    cmp-long v2, v2, p1

    if-gez v2, :cond_1

    new-instance v2, Lj$/util/stream/U;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lj$/util/stream/U;-><init>(I)V

    invoke-interface {p0, v2}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long p1, v0

    cmp-long p1, p1, p3

    if-gez p1, :cond_2

    invoke-interface {p0, p5}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {p5}, Lj$/util/stream/e2;->end()V

    invoke-interface {p5}, Lj$/util/stream/x0;->build()Lj$/util/stream/C0;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i0()[I
    .locals 1

    sget-object v0, Lj$/util/stream/t0;->e:[I

    return-object v0
.end method

.method static synthetic j0()[J
    .locals 1

    sget-object v0, Lj$/util/stream/t0;->f:[J

    return-object v0
.end method

.method static synthetic k0()[D
    .locals 1

    sget-object v0, Lj$/util/stream/t0;->g:[D

    return-object v0
.end method

.method static l0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/X0;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/X0;-><init>(JLj$/util/function/IntFunction;)V

    goto :goto_0

    .line 0
    :cond_0
    new-instance v0, Lj$/util/stream/p1;

    invoke-direct {v0}, Lj$/util/stream/p1;-><init>()V

    :goto_0
    return-object v0
.end method

.method public static m0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/t0;->v0(Lj$/util/Spliterator;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    invoke-interface {p3, p2}, Lj$/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    new-instance p3, Lj$/util/stream/n1;

    invoke-direct {p3, p1, p0, p2}, Lj$/util/stream/n1;-><init>(Lj$/util/Spliterator;Lj$/util/stream/t0;[Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/F0;

    invoke-direct {p0, p2}, Lj$/util/stream/F0;-><init>([Ljava/lang/Object;)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/H0;

    invoke-direct {v0, p1, p3, p0}, Lj$/util/stream/H0;-><init>(Lj$/util/Spliterator;Lj$/util/function/IntFunction;Lj$/util/stream/t0;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/C0;

    if-eqz p2, :cond_2

    invoke-static {p0, p3}, Lj$/util/stream/t0;->w0(Lj$/util/stream/C0;Lj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static n0(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)Lj$/util/stream/y0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/t0;->v0(Lj$/util/Spliterator;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [D

    new-instance v0, Lj$/util/stream/k1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/k1;-><init>(Lj$/util/Spliterator;Lj$/util/stream/t0;[D)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/P0;

    invoke-direct {p0, p2}, Lj$/util/stream/P0;-><init>([D)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/H0;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p0}, Lj$/util/stream/H0;-><init>(ILj$/util/Spliterator;Lj$/util/stream/t0;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/y0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/t0;->x0(Lj$/util/stream/y0;)Lj$/util/stream/y0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static o0(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)Lj$/util/stream/z0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/t0;->v0(Lj$/util/Spliterator;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [I

    new-instance v0, Lj$/util/stream/l1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/l1;-><init>(Lj$/util/Spliterator;Lj$/util/stream/t0;[I)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/Y0;

    invoke-direct {p0, p2}, Lj$/util/stream/Y0;-><init>([I)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/H0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p0}, Lj$/util/stream/H0;-><init>(ILj$/util/Spliterator;Lj$/util/stream/t0;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/z0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/t0;->y0(Lj$/util/stream/z0;)Lj$/util/stream/z0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static p0(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)Lj$/util/stream/A0;
    .locals 4

    invoke-virtual {p0, p1}, Lj$/util/stream/t0;->v0(Lj$/util/Spliterator;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_1

    const/16 v2, 0x4000

    invoke-interface {p1, v2}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/32 v2, 0x7ffffff7

    cmp-long p2, v0, v2

    if-gez p2, :cond_0

    long-to-int p2, v0

    new-array p2, p2, [J

    new-instance v0, Lj$/util/stream/m1;

    invoke-direct {v0, p1, p0, p2}, Lj$/util/stream/m1;-><init>(Lj$/util/Spliterator;Lj$/util/stream/t0;[J)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/h1;

    invoke-direct {p0, p2}, Lj$/util/stream/h1;-><init>([J)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance v0, Lj$/util/stream/H0;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p0}, Lj$/util/stream/H0;-><init>(ILj$/util/Spliterator;Lj$/util/stream/t0;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj$/util/stream/A0;

    if-eqz p2, :cond_2

    invoke-static {p0}, Lj$/util/stream/t0;->z0(Lj$/util/stream/A0;)Lj$/util/stream/A0;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method static q0(Lj$/util/stream/T2;Lj$/util/stream/C0;Lj$/util/stream/C0;)Lj$/util/stream/E0;
    .locals 2

    sget-object v0, Lj$/util/stream/D0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    new-instance p0, Lj$/util/stream/K0;

    check-cast p1, Lj$/util/stream/y0;

    check-cast p2, Lj$/util/stream/y0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/K0;-><init>(Lj$/util/stream/y0;Lj$/util/stream/y0;)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unknown shape "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Lj$/util/stream/M0;

    check-cast p1, Lj$/util/stream/A0;

    check-cast p2, Lj$/util/stream/A0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/M0;-><init>(Lj$/util/stream/A0;Lj$/util/stream/A0;)V

    return-object p0

    :cond_2
    new-instance p0, Lj$/util/stream/L0;

    check-cast p1, Lj$/util/stream/z0;

    check-cast p2, Lj$/util/stream/z0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/L0;-><init>(Lj$/util/stream/z0;Lj$/util/stream/z0;)V

    return-object p0

    :cond_3
    new-instance p0, Lj$/util/stream/O0;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/O0;-><init>(Lj$/util/stream/C0;Lj$/util/stream/C0;)V

    return-object p0
.end method

.method static t0(J)Lj$/util/stream/u0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p0, v0

    if-gez v0, :cond_0

    new-instance v0, Lj$/util/stream/Q0;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/Q0;-><init>(J)V

    goto :goto_0

    .line 0
    :cond_0
    new-instance v0, Lj$/util/stream/R0;

    invoke-direct {v0}, Lj$/util/stream/R0;-><init>()V

    :goto_0
    return-object v0
.end method

.method static u0(Lj$/util/stream/T2;)Lj$/util/stream/W0;
    .locals 3

    sget-object v0, Lj$/util/stream/D0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lj$/util/stream/t0;->d:Lj$/util/stream/y0;

    :goto_0
    check-cast p0, Lj$/util/stream/W0;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown shape "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lj$/util/stream/t0;->c:Lj$/util/stream/A0;

    goto :goto_0

    :cond_2
    sget-object p0, Lj$/util/stream/t0;->b:Lj$/util/stream/z0;

    goto :goto_0

    :cond_3
    sget-object p0, Lj$/util/stream/t0;->a:Lj$/util/stream/V0;

    return-object p0
.end method

.method public static w0(Lj$/util/stream/C0;Lj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/C0;->l()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    invoke-interface {p1, v0}, Lj$/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    new-instance v0, Lj$/util/stream/s1;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/s1;-><init>(Lj$/util/stream/C0;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/F0;

    invoke-direct {p0, p1}, Lj$/util/stream/F0;-><init>([Ljava/lang/Object;)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Stream size exceeds max array size"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static x0(Lj$/util/stream/y0;)Lj$/util/stream/y0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/C0;->l()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [D

    new-instance v1, Lj$/util/stream/q1;

    invoke-direct {v1, p0, v0}, Lj$/util/stream/q1;-><init>(Lj$/util/stream/y0;[D)V

    invoke-virtual {v1}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/P0;

    invoke-direct {p0, v0}, Lj$/util/stream/P0;-><init>([D)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static y0(Lj$/util/stream/z0;)Lj$/util/stream/z0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/C0;->l()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [I

    new-instance v1, Lj$/util/stream/r1;

    invoke-direct {v1, p0, v0}, Lj$/util/stream/r1;-><init>(Lj$/util/stream/z0;[I)V

    invoke-virtual {v1}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/Y0;

    invoke-direct {p0, v0}, Lj$/util/stream/Y0;-><init>([I)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method

.method public static z0(Lj$/util/stream/A0;)Lj$/util/stream/A0;
    .locals 4

    invoke-interface {p0}, Lj$/util/stream/C0;->l()I

    move-result v0

    if-lez v0, :cond_1

    invoke-interface {p0}, Lj$/util/stream/C0;->count()J

    move-result-wide v0

    const-wide/32 v2, 0x7ffffff7

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    long-to-int v0, v0

    new-array v0, v0, [J

    new-instance v1, Lj$/util/stream/q1;

    invoke-direct {v1, p0, v0}, Lj$/util/stream/q1;-><init>(Lj$/util/stream/A0;[J)V

    invoke-virtual {v1}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    .line 0
    new-instance p0, Lj$/util/stream/h1;

    invoke-direct {p0, v0}, Lj$/util/stream/h1;-><init>([J)V

    return-object p0

    .line 0
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stream size exceeds max array size"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object p0
.end method


# virtual methods
.method abstract A0()I
.end method

.method abstract G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;
.end method

.method public abstract I0()Lj$/util/stream/N1;
.end method

.method abstract J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;
.end method

.method abstract K0(Lj$/util/stream/e2;)Lj$/util/stream/e2;
.end method

.method public N(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/t0;->I0()Lj$/util/stream/N1;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    check-cast v0, Lj$/util/stream/N1;

    invoke-interface {v0}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/P1;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/P1;-><init>(Lj$/util/stream/t0;Lj$/util/stream/t0;Lj$/util/Spliterator;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/N1;

    invoke-interface {p1}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method abstract r0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V
.end method

.method abstract s0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V
.end method

.method abstract v0(Lj$/util/Spliterator;)J
.end method

.method public synthetic y()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
