.class public final Lj$/util/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/i;


# instance fields
.field private a:D

.field private b:D

.field private count:J

.field private max:D

.field private min:D

.field private sum:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    iput-wide v0, p0, Lj$/util/e;->min:D

    const-wide/high16 v0, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    iput-wide v0, p0, Lj$/util/e;->max:D

    return-void
.end method


# virtual methods
.method public final a(Lj$/util/e;)V
    .locals 6

    iget-wide v0, p0, Lj$/util/e;->count:J

    iget-wide v2, p1, Lj$/util/e;->count:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj$/util/e;->count:J

    iget-wide v0, p0, Lj$/util/e;->b:D

    iget-wide v2, p1, Lj$/util/e;->b:D

    add-double/2addr v0, v2

    iput-wide v0, p0, Lj$/util/e;->b:D

    iget-wide v0, p1, Lj$/util/e;->sum:D

    .line 0
    iget-wide v2, p0, Lj$/util/e;->a:D

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lj$/util/e;->sum:D

    add-double v4, v2, v0

    sub-double v2, v4, v2

    sub-double/2addr v2, v0

    iput-wide v2, p0, Lj$/util/e;->a:D

    .line 0
    iget-wide v0, p1, Lj$/util/e;->a:D

    sub-double/2addr v0, v2

    add-double v2, v4, v0

    sub-double v4, v2, v4

    sub-double/2addr v4, v0

    .line 0
    iput-wide v4, p0, Lj$/util/e;->a:D

    iput-wide v2, p0, Lj$/util/e;->sum:D

    .line 0
    iget-wide v0, p0, Lj$/util/e;->min:D

    iget-wide v2, p1, Lj$/util/e;->min:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/e;->min:D

    iget-wide v0, p0, Lj$/util/e;->max:D

    iget-wide v2, p1, Lj$/util/e;->max:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/e;->max:D

    return-void
.end method

.method public final accept(D)V
    .locals 6

    iget-wide v0, p0, Lj$/util/e;->count:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lj$/util/e;->count:J

    iget-wide v0, p0, Lj$/util/e;->b:D

    add-double/2addr v0, p1

    iput-wide v0, p0, Lj$/util/e;->b:D

    .line 0
    iget-wide v0, p0, Lj$/util/e;->a:D

    sub-double v0, p1, v0

    iget-wide v2, p0, Lj$/util/e;->sum:D

    add-double v4, v2, v0

    sub-double v2, v4, v2

    sub-double/2addr v2, v0

    iput-wide v2, p0, Lj$/util/e;->a:D

    iput-wide v4, p0, Lj$/util/e;->sum:D

    .line 0
    iget-wide v0, p0, Lj$/util/e;->min:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    iput-wide v0, p0, Lj$/util/e;->min:D

    iget-wide v0, p0, Lj$/util/e;->max:D

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lj$/util/e;->max:D

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const-class v1, Lj$/util/e;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->count:J

    .line 0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->sum:D

    iget-wide v3, p0, Lj$/util/e;->a:D

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v3, p0, Lj$/util/e;->b:D

    invoke-static {v3, v4}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-wide v1, p0, Lj$/util/e;->b:D

    .line 0
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->min:D

    .line 0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->count:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->sum:D

    iget-wide v3, p0, Lj$/util/e;->a:D

    add-double/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-wide v3, p0, Lj$/util/e;->b:D

    invoke-static {v3, v4}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-wide v1, p0, Lj$/util/e;->b:D

    .line 0
    :cond_1
    iget-wide v3, p0, Lj$/util/e;->count:J

    long-to-double v3, v3

    div-double/2addr v1, v3

    goto :goto_0

    :cond_2
    const-wide/16 v1, 0x0

    .line 0
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 0
    iget-wide v1, p0, Lj$/util/e;->max:D

    .line 0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "%s{count=%d, sum=%f, min=%f, average=%f, max=%f}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
