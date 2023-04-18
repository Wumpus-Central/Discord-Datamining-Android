.class final Lj$/util/stream/h2;
.super Lj$/util/stream/Y1;
.source "SourceFile"


# instance fields
.field b:J

.field c:J

.field final synthetic d:Lj$/util/stream/i2;


# direct methods
.method constructor <init>(Lj$/util/stream/i2;Lj$/util/stream/e2;)V
    .locals 2

    iput-object p1, p0, Lj$/util/stream/h2;->d:Lj$/util/stream/i2;

    invoke-direct {p0, p2}, Lj$/util/stream/Y1;-><init>(Lj$/util/stream/e2;)V

    iget-wide v0, p1, Lj$/util/stream/i2;->s:J

    iput-wide v0, p0, Lj$/util/stream/h2;->b:J

    iget-wide p1, p1, Lj$/util/stream/i2;->t:J

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide p1, 0x7fffffffffffffffL

    :goto_0
    iput-wide p1, p0, Lj$/util/stream/h2;->c:J

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 7

    iget-wide v0, p0, Lj$/util/stream/h2;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    const-wide/16 v5, 0x1

    if-nez v4, :cond_0

    iget-wide v0, p0, Lj$/util/stream/h2;->c:J

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    sub-long/2addr v0, v5

    iput-wide v0, p0, Lj$/util/stream/h2;->c:J

    iget-object v0, p0, Lj$/util/stream/Y1;->a:Lj$/util/stream/e2;

    invoke-interface {v0, p1}, Lj$/util/stream/e2;->accept(I)V

    goto :goto_0

    :cond_0
    sub-long/2addr v0, v5

    iput-wide v0, p0, Lj$/util/stream/h2;->b:J

    :cond_1
    :goto_0
    return-void
.end method

.method public final c(J)V
    .locals 7

    iget-object v0, p0, Lj$/util/stream/h2;->d:Lj$/util/stream/i2;

    iget-wide v3, v0, Lj$/util/stream/i2;->s:J

    iget-wide v5, p0, Lj$/util/stream/h2;->c:J

    move-wide v1, p1

    invoke-static/range {v1 .. v6}, Lj$/util/stream/p2;->c(JJJ)J

    move-result-wide p1

    iget-object v0, p0, Lj$/util/stream/Y1;->a:Lj$/util/stream/e2;

    invoke-interface {v0, p1, p2}, Lj$/util/stream/e2;->c(J)V

    return-void
.end method

.method public final e()Z
    .locals 4

    iget-wide v0, p0, Lj$/util/stream/h2;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/Y1;->a:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
