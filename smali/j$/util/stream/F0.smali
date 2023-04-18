.class Lj$/util/stream/F0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/C0;


# instance fields
.field final a:[Ljava/lang/Object;

.field b:I


# direct methods
.method constructor <init>(JLj$/util/function/IntFunction;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    long-to-int p1, p1

    invoke-interface {p3, p1}, Lj$/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    iput-object p1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lj$/util/stream/F0;->b:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method constructor <init>([Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    array-length p1, p1

    iput p1, p0, Lj$/util/stream/F0;->b:I

    return-void
.end method


# virtual methods
.method public final a(I)Lj$/util/stream/C0;
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final count()J
    .locals 2

    iget v0, p0, Lj$/util/stream/F0;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final forEach(Lj$/util/function/Consumer;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lj$/util/stream/F0;->b:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-interface {p1, v1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i([Ljava/lang/Object;I)V
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lj$/util/stream/F0;->b:I

    iget-object v2, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    invoke-static {v2, v0, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final synthetic l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Lj$/util/function/IntFunction;)[Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    array-length v0, p1

    iget v1, p0, Lj$/util/stream/F0;->b:I

    if-ne v0, v1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final synthetic n(JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lj$/util/stream/t0;->h0(Lj$/util/stream/C0;JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p1

    return-object p1
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 3

    iget v0, p0, Lj$/util/stream/F0;->b:I

    .line 0
    iget-object v1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lj$/util/Spliterators;->l([Ljava/lang/Object;II)Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lj$/util/stream/F0;->a:[Ljava/lang/Object;

    array-length v2, v1

    iget v3, p0, Lj$/util/stream/F0;->b:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "ArrayNode[%d][%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
