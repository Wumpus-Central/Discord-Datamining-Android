.class final Lj$/util/stream/E2;
.super Lj$/util/stream/s2;
.source "SourceFile"


# instance fields
.field private c:[J

.field private d:I


# direct methods
.method constructor <init>(Lj$/util/stream/e2;)V
    .locals 0

    invoke-direct {p0, p1}, Lj$/util/stream/s2;-><init>(Lj$/util/stream/e2;)V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 3

    iget-object v0, p0, Lj$/util/stream/E2;->c:[J

    iget v1, p0, Lj$/util/stream/E2;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj$/util/stream/E2;->d:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public final c(J)V
    .locals 2

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    long-to-int p1, p1

    new-array p1, p1, [J

    iput-object p1, p0, Lj$/util/stream/E2;->c:[J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final end()V
    .locals 6

    iget-object v0, p0, Lj$/util/stream/E2;->c:[J

    iget v1, p0, Lj$/util/stream/E2;->d:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/util/Arrays;->sort([JII)V

    iget v0, p0, Lj$/util/stream/E2;->d:I

    int-to-long v0, v0

    iget-object v3, p0, Lj$/util/stream/Z1;->a:Lj$/util/stream/e2;

    invoke-interface {v3, v0, v1}, Lj$/util/stream/e2;->c(J)V

    iget-boolean v0, p0, Lj$/util/stream/s2;->b:Z

    if-nez v0, :cond_0

    :goto_0
    iget v0, p0, Lj$/util/stream/E2;->d:I

    if-ge v2, v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/E2;->c:[J

    aget-wide v4, v0, v2

    invoke-interface {v3, v4, v5}, Lj$/util/stream/e2;->accept(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget v0, p0, Lj$/util/stream/E2;->d:I

    if-ge v2, v0, :cond_1

    invoke-interface {v3}, Lj$/util/stream/e2;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/E2;->c:[J

    aget-wide v4, v0, v2

    invoke-interface {v3, v4, v5}, Lj$/util/stream/e2;->accept(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v3}, Lj$/util/stream/e2;->end()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj$/util/stream/E2;->c:[J

    return-void
.end method
