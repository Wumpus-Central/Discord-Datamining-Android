.class Lj$/util/stream/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/y0;


# instance fields
.field final a:[D

.field b:I


# direct methods
.method constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    long-to-int p1, p1

    new-array p1, p1, [D

    iput-object p1, p0, Lj$/util/stream/P0;->a:[D

    const/4 p1, 0x0

    iput p1, p0, Lj$/util/stream/P0;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>([D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/P0;->a:[D

    array-length p1, p1

    iput p1, p0, Lj$/util/stream/P0;->b:I

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
    invoke-virtual {p0, p1}, Lj$/util/stream/P0;->a(I)Lj$/util/stream/B0;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lj$/util/stream/P0;->a:[D

    array-length v1, v0

    iget v2, p0, Lj$/util/stream/P0;->b:I

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final count()J
    .locals 2

    iget v0, p0, Lj$/util/stream/P0;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final f(ILjava/lang/Object;)V
    .locals 3

    check-cast p2, [D

    .line 0
    iget v0, p0, Lj$/util/stream/P0;->b:I

    iget-object v1, p0, Lj$/util/stream/P0;->a:[D

    const/4 v2, 0x0

    invoke-static {v1, v2, p2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final synthetic forEach(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->b0(Lj$/util/stream/y0;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lj$/util/function/i;

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget v1, p0, Lj$/util/stream/P0;->b:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lj$/util/stream/P0;->a:[D

    aget-wide v2, v1, v0

    invoke-interface {p1, v2, v3}, Lj$/util/function/i;->accept(D)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final bridge synthetic i([Ljava/lang/Object;I)V
    .locals 0

    .line 0
    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/P0;->o([Ljava/lang/Double;I)V

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

.method public final synthetic o([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/t0;->Y(Lj$/util/stream/y0;[Ljava/lang/Double;I)V

    return-void
.end method

.method public final spliterator()Lj$/util/D;
    .locals 3

    .line 0
    iget v0, p0, Lj$/util/stream/P0;->b:I

    const/4 v1, 0x0

    .line 0
    iget-object v2, p0, Lj$/util/stream/P0;->a:[D

    invoke-static {v2, v1, v0}, Lj$/util/Spliterators;->j([DII)Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 3

    .line 0
    iget v0, p0, Lj$/util/stream/P0;->b:I

    const/4 v1, 0x0

    .line 0
    iget-object v2, p0, Lj$/util/stream/P0;->a:[D

    invoke-static {v2, v1, v0}, Lj$/util/Spliterators;->j([DII)Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lj$/util/stream/P0;->a:[D

    array-length v2, v1

    iget v3, p0, Lj$/util/stream/P0;->b:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    invoke-static {v1}, Ljava/util/Arrays;->toString([D)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "DoubleArrayNode[%d][%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
