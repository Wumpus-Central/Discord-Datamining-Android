.class abstract Lj$/util/stream/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:J

.field final b:J

.field c:Lj$/util/Spliterator;

.field d:J

.field e:J


# direct methods
.method constructor <init>(Lj$/util/Spliterator;JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    iput-wide p2, p0, Lj$/util/stream/q3;->a:J

    iput-wide p4, p0, Lj$/util/stream/q3;->b:J

    iput-wide p6, p0, Lj$/util/stream/q3;->d:J

    iput-wide p8, p0, Lj$/util/stream/q3;->e:J

    return-void
.end method


# virtual methods
.method protected abstract c(Lj$/util/Spliterator;JJJJ)Lj$/util/Spliterator;
.end method

.method public final characteristics()I
    .locals 1

    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->characteristics()I

    move-result v0

    return v0
.end method

.method public final estimateSize()J
    .locals 6

    iget-wide v0, p0, Lj$/util/stream/q3;->e:J

    iget-wide v2, p0, Lj$/util/stream/q3;->a:J

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    iget-wide v4, p0, Lj$/util/stream/q3;->d:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    sub-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public bridge synthetic trySplit()Lj$/util/B;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/q3;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    check-cast v0, Lj$/util/B;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/D;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/q3;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    check-cast v0, Lj$/util/D;

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/Spliterator$OfInt;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/q3;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    check-cast v0, Lj$/util/Spliterator$OfInt;

    return-object v0
.end method

.method public final trySplit()Lj$/util/Spliterator;
    .locals 14

    iget-wide v0, p0, Lj$/util/stream/q3;->e:J

    iget-wide v2, p0, Lj$/util/stream/q3;->a:J

    cmp-long v2, v2, v0

    const/4 v3, 0x0

    if-ltz v2, :cond_0

    return-object v3

    :cond_0
    iget-wide v4, p0, Lj$/util/stream/q3;->d:J

    cmp-long v0, v4, v0

    if-ltz v0, :cond_1

    return-object v3

    :cond_1
    :goto_0
    iget-object v0, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->trySplit()Lj$/util/Spliterator;

    move-result-object v5

    if-nez v5, :cond_2

    return-object v3

    :cond_2
    iget-wide v0, p0, Lj$/util/stream/q3;->d:J

    invoke-interface {v5}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v6

    add-long/2addr v6, v0

    iget-wide v0, p0, Lj$/util/stream/q3;->b:J

    invoke-static {v6, v7, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    iget-wide v0, p0, Lj$/util/stream/q3;->a:J

    cmp-long v2, v0, v12

    if-ltz v2, :cond_3

    iput-wide v12, p0, Lj$/util/stream/q3;->d:J

    goto :goto_0

    :cond_3
    iget-wide v8, p0, Lj$/util/stream/q3;->b:J

    cmp-long v2, v12, v8

    if-ltz v2, :cond_4

    iput-object v5, p0, Lj$/util/stream/q3;->c:Lj$/util/Spliterator;

    iput-wide v12, p0, Lj$/util/stream/q3;->e:J

    goto :goto_0

    :cond_4
    iget-wide v10, p0, Lj$/util/stream/q3;->d:J

    cmp-long v2, v10, v0

    if-ltz v2, :cond_5

    cmp-long v2, v6, v8

    if-gtz v2, :cond_5

    iput-wide v12, p0, Lj$/util/stream/q3;->d:J

    return-object v5

    :cond_5
    iput-wide v12, p0, Lj$/util/stream/q3;->d:J

    move-object v4, p0

    move-wide v6, v0

    invoke-virtual/range {v4 .. v13}, Lj$/util/stream/q3;->c(Lj$/util/Spliterator;JJJJ)Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic trySplit()Lj$/util/y;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/q3;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    check-cast v0, Lj$/util/y;

    return-object v0
.end method
