.class Lj$/util/stream/P2;
.super Lj$/util/stream/e;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/Consumer;
.implements Ljava/lang/Iterable;
.implements Lj$/lang/a;


# instance fields
.field protected e:[Ljava/lang/Object;

.field protected f:[[Ljava/lang/Object;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj$/util/stream/e;-><init>()V

    const/4 v0, 0x1

    shl-int/lit8 v0, v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 7

    iget v0, p0, Lj$/util/stream/e;->b:I

    iget-object v1, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    array-length v2, v1

    if-ne v0, v2, :cond_4

    .line 0
    iget-object v0, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/16 v0, 0x8

    new-array v3, v0, [[Ljava/lang/Object;

    iput-object v3, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    new-array v0, v0, [J

    iput-object v0, p0, Lj$/util/stream/e;->d:[J

    aput-object v1, v3, v2

    .line 0
    :cond_0
    iget v0, p0, Lj$/util/stream/e;->c:I

    add-int/lit8 v3, v0, 0x1

    iget-object v4, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    aget-object v3, v4, v3

    if-nez v3, :cond_3

    :cond_1
    if-nez v0, :cond_2

    .line 0
    array-length v0, v1

    int-to-long v0, v0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lj$/util/stream/e;->d:[J

    aget-wide v5, v1, v0

    aget-object v0, v4, v0

    array-length v0, v0

    int-to-long v0, v0

    add-long/2addr v0, v5

    :goto_0
    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    .line 0
    invoke-virtual {p0, v0, v1}, Lj$/util/stream/P2;->o(J)V

    .line 0
    :cond_3
    iput v2, p0, Lj$/util/stream/e;->b:I

    iget v0, p0, Lj$/util/stream/e;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj$/util/stream/e;->c:I

    iget-object v1, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    aget-object v0, v1, v0

    iput-object v0, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    :cond_4
    iget-object v0, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    iget v1, p0, Lj$/util/stream/e;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj$/util/stream/e;->b:I

    aput-object p1, v0, v1

    return-void
.end method

.method public final synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    aget-object v0, v0, v2

    iput-object v0, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    move v0, v2

    :goto_0
    iget-object v3, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    array-length v4, v3

    if-ge v0, v4, :cond_0

    aput-object v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput-object v1, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    iput-object v1, p0, Lj$/util/stream/e;->d:[J

    goto :goto_2

    :cond_1
    move v0, v2

    :goto_1
    iget v3, p0, Lj$/util/stream/e;->b:I

    if-ge v0, v3, :cond_2

    iget-object v3, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    aput-object v1, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    iput v2, p0, Lj$/util/stream/e;->b:I

    iput v2, p0, Lj$/util/stream/e;->c:I

    return-void
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lj$/util/stream/e;->c:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    aget-object v2, v2, v1

    array-length v3, v2

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    invoke-interface {p1, v5}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_2
    iget v1, p0, Lj$/util/stream/e;->b:I

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-interface {p1, v1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj$/util/stream/P2;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/P2;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterators;->i(Lj$/util/Spliterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method protected final o(J)V
    .locals 11

    .line 0
    iget v0, p0, Lj$/util/stream/e;->c:I

    if-nez v0, :cond_0

    iget-object v1, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    array-length v1, v1

    int-to-long v1, v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lj$/util/stream/e;->d:[J

    aget-wide v2, v1, v0

    iget-object v1, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    aget-object v1, v1, v0

    array-length v1, v1

    int-to-long v4, v1

    add-long v1, v4, v2

    :goto_0
    cmp-long v3, p1, v1

    if-lez v3, :cond_5

    .line 0
    iget-object v3, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    if-nez v3, :cond_1

    const/16 v3, 0x8

    new-array v4, v3, [[Ljava/lang/Object;

    iput-object v4, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    new-array v3, v3, [J

    iput-object v3, p0, Lj$/util/stream/e;->d:[J

    const/4 v3, 0x0

    iget-object v5, p0, Lj$/util/stream/P2;->e:[Ljava/lang/Object;

    aput-object v5, v4, v3

    :cond_1
    :goto_1
    const/4 v3, 0x1

    add-int/2addr v0, v3

    cmp-long v4, p1, v1

    if-lez v4, :cond_5

    .line 0
    iget-object v4, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    array-length v5, v4

    if-lt v0, v5, :cond_2

    array-length v5, v4

    mul-int/lit8 v5, v5, 0x2

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[Ljava/lang/Object;

    iput-object v4, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    iget-object v4, p0, Lj$/util/stream/e;->d:[J

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    iput-object v4, p0, Lj$/util/stream/e;->d:[J

    .line 0
    :cond_2
    iget v4, p0, Lj$/util/stream/e;->a:I

    if-eqz v0, :cond_4

    if-ne v0, v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v4, v0

    sub-int/2addr v4, v3

    const/16 v5, 0x1e

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    :cond_4
    :goto_2
    shl-int/2addr v3, v4

    .line 0
    iget-object v4, p0, Lj$/util/stream/P2;->f:[[Ljava/lang/Object;

    new-array v5, v3, [Ljava/lang/Object;

    aput-object v5, v4, v0

    iget-object v5, p0, Lj$/util/stream/e;->d:[J

    add-int/lit8 v6, v0, -0x1

    aget-wide v7, v5, v6

    aget-object v4, v4, v6

    array-length v4, v4

    int-to-long v9, v4

    add-long/2addr v7, v9

    aput-wide v7, v5, v0

    int-to-long v3, v3

    add-long/2addr v1, v3

    goto :goto_1

    :cond_5
    return-void
.end method

.method public spliterator()Lj$/util/Spliterator;
    .locals 7

    new-instance v6, Lj$/util/stream/G2;

    const/4 v2, 0x0

    iget v3, p0, Lj$/util/stream/e;->c:I

    const/4 v4, 0x0

    iget v5, p0, Lj$/util/stream/e;->b:I

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/G2;-><init>(Lj$/util/stream/P2;IIII)V

    return-object v6
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/P2;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lj$/util/stream/a;

    const/16 v2, 0x8

    invoke-direct {v1, v2, v0}, Lj$/util/stream/a;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, v1}, Lj$/util/stream/P2;->forEach(Lj$/util/function/Consumer;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SpinedBuffer:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
