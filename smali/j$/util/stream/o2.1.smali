.class final Lj$/util/stream/o2;
.super Lj$/util/stream/d;
.source "SourceFile"


# instance fields
.field private final j:Lj$/util/stream/c;

.field private final k:Lj$/util/function/IntFunction;

.field private final l:J

.field private final m:J

.field private n:J

.field private volatile o:Z


# direct methods
.method constructor <init>(Lj$/util/stream/c;Lj$/util/stream/c;Lj$/util/Spliterator;Lj$/util/function/IntFunction;JJ)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lj$/util/stream/d;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;)V

    iput-object p1, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iput-object p4, p0, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    iput-wide p5, p0, Lj$/util/stream/o2;->l:J

    iput-wide p7, p0, Lj$/util/stream/o2;->m:J

    return-void
.end method

.method constructor <init>(Lj$/util/stream/o2;Lj$/util/Spliterator;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lj$/util/stream/d;-><init>(Lj$/util/stream/d;Lj$/util/Spliterator;)V

    iget-object p2, p1, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iput-object p2, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iget-object p2, p1, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    iput-object p2, p0, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    iget-wide v0, p1, Lj$/util/stream/o2;->l:J

    iput-wide v0, p0, Lj$/util/stream/o2;->l:J

    iget-wide p1, p1, Lj$/util/stream/o2;->m:J

    iput-wide p1, p0, Lj$/util/stream/o2;->m:J

    return-void
.end method

.method private j(J)J
    .locals 4

    iget-boolean v0, p0, Lj$/util/stream/o2;->o:Z

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lj$/util/stream/o2;->n:J

    return-wide p1

    :cond_0
    iget-object v0, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    check-cast v0, Lj$/util/stream/o2;

    iget-object v1, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v1, Lj$/util/stream/o2;

    if-eqz v0, :cond_3

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {v0, p1, p2}, Lj$/util/stream/o2;->j(J)J

    move-result-wide v2

    cmp-long v0, v2, p1

    if-ltz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {v1, p1, p2}, Lj$/util/stream/o2;->j(J)J

    move-result-wide p1

    add-long/2addr v2, p1

    :goto_0
    return-wide v2

    :cond_3
    :goto_1
    iget-wide p1, p0, Lj$/util/stream/o2;->n:J

    return-wide p1
.end method


# virtual methods
.method protected final a()Ljava/lang/Object;
    .locals 5

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/f;->c()Lj$/util/stream/f;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide/16 v2, -0x1

    if-eqz v0, :cond_2

    .line 0
    sget-object v0, Lj$/util/stream/S2;->SIZED:Lj$/util/stream/S2;

    iget-object v1, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iget v1, v1, Lj$/util/stream/c;->j:I

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iget-object v1, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v0, v1}, Lj$/util/stream/c;->v0(Lj$/util/Spliterator;)J

    move-result-wide v2

    :cond_1
    iget-object v0, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iget-object v1, p0, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    invoke-virtual {v0, v2, v3, v1}, Lj$/util/stream/t0;->G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    iget-object v2, p0, Lj$/util/stream/f;->a:Lj$/util/stream/t0;

    invoke-virtual {v2}, Lj$/util/stream/t0;->A0()I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lj$/util/stream/c;->X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;

    move-result-object v1

    iget-object v2, p0, Lj$/util/stream/f;->a:Lj$/util/stream/t0;

    invoke-virtual {v2, v1}, Lj$/util/stream/t0;->K0(Lj$/util/stream/e2;)Lj$/util/stream/e2;

    move-result-object v1

    iget-object v3, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v2, v3, v1}, Lj$/util/stream/t0;->s0(Lj$/util/Spliterator;Lj$/util/stream/e2;)V

    invoke-interface {v0}, Lj$/util/stream/x0;->build()Lj$/util/stream/C0;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lj$/util/stream/f;->a:Lj$/util/stream/t0;

    iget-object v4, p0, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    invoke-virtual {v0, v2, v3, v4}, Lj$/util/stream/t0;->G0(JLj$/util/function/IntFunction;)Lj$/util/stream/x0;

    move-result-object v2

    iget-object v3, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    invoke-virtual {v0, v3, v2}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    invoke-interface {v2}, Lj$/util/stream/x0;->build()Lj$/util/stream/C0;

    move-result-object v0

    invoke-interface {v0}, Lj$/util/stream/C0;->count()J

    move-result-wide v2

    iput-wide v2, p0, Lj$/util/stream/o2;->n:J

    iput-boolean v1, p0, Lj$/util/stream/o2;->o:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lj$/util/stream/f;->b:Lj$/util/Spliterator;

    :goto_1
    return-object v0
.end method

.method protected final d(Lj$/util/Spliterator;)Lj$/util/stream/f;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/o2;

    invoke-direct {v0, p0, p1}, Lj$/util/stream/o2;-><init>(Lj$/util/stream/o2;Lj$/util/Spliterator;)V

    return-object v0
.end method

.method protected final g()V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Lj$/util/stream/d;->i:Z

    .line 0
    iget-boolean v0, p0, Lj$/util/stream/o2;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lj$/util/stream/o2;->k()Lj$/util/stream/W0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj$/util/stream/d;->e(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected final bridge synthetic i()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj$/util/stream/o2;->k()Lj$/util/stream/W0;

    move-result-object v0

    return-object v0
.end method

.method protected final k()Lj$/util/stream/W0;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->Q0()Lj$/util/stream/T2;

    move-result-object v0

    invoke-static {v0}, Lj$/util/stream/t0;->u0(Lj$/util/stream/T2;)Lj$/util/stream/W0;

    move-result-object v0

    return-object v0
.end method

.method public final onCompletion(Ljava/util/concurrent/CountedCompleter;)V
    .locals 14

    .line 0
    iget-object v0, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    const-wide/16 v4, 0x0

    if-nez v3, :cond_7

    .line 0
    check-cast v0, Lj$/util/stream/o2;

    iget-wide v6, v0, Lj$/util/stream/o2;->n:J

    iget-object v0, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v0, Lj$/util/stream/o2;

    iget-wide v8, v0, Lj$/util/stream/o2;->n:J

    add-long/2addr v6, v8

    iput-wide v6, p0, Lj$/util/stream/o2;->n:J

    iget-boolean v0, p0, Lj$/util/stream/d;->i:Z

    if-eqz v0, :cond_1

    iput-wide v4, p0, Lj$/util/stream/o2;->n:J

    goto :goto_1

    :cond_1
    iget-wide v6, p0, Lj$/util/stream/o2;->n:J

    cmp-long v0, v6, v4

    if-nez v0, :cond_2

    :goto_1
    invoke-virtual {p0}, Lj$/util/stream/o2;->k()Lj$/util/stream/W0;

    move-result-object v0

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_2
    iget-object v0, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    check-cast v0, Lj$/util/stream/o2;

    iget-wide v6, v0, Lj$/util/stream/o2;->n:J

    cmp-long v0, v6, v4

    if-nez v0, :cond_3

    iget-object v0, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v0, Lj$/util/stream/o2;

    invoke-virtual {v0}, Lj$/util/stream/d;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/C0;

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lj$/util/stream/o2;->j:Lj$/util/stream/c;

    invoke-virtual {v0}, Lj$/util/stream/c;->Q0()Lj$/util/stream/T2;

    move-result-object v0

    iget-object v3, p0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    check-cast v3, Lj$/util/stream/o2;

    invoke-virtual {v3}, Lj$/util/stream/d;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj$/util/stream/C0;

    iget-object v6, p0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    check-cast v6, Lj$/util/stream/o2;

    invoke-virtual {v6}, Lj$/util/stream/d;->b()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj$/util/stream/C0;

    invoke-static {v0, v3, v6}, Lj$/util/stream/t0;->q0(Lj$/util/stream/T2;Lj$/util/stream/C0;Lj$/util/stream/C0;)Lj$/util/stream/E0;

    move-result-object v0

    goto :goto_2

    .line 0
    :goto_3
    invoke-virtual {p0}, Lj$/util/stream/f;->c()Lj$/util/stream/f;

    move-result-object v0

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    move v0, v2

    :goto_4
    if-eqz v0, :cond_6

    .line 0
    iget-wide v7, p0, Lj$/util/stream/o2;->m:J

    cmp-long v0, v7, v4

    if-ltz v0, :cond_5

    invoke-interface {v6}, Lj$/util/stream/C0;->count()J

    move-result-wide v7

    iget-wide v9, p0, Lj$/util/stream/o2;->l:J

    iget-wide v11, p0, Lj$/util/stream/o2;->m:J

    add-long/2addr v9, v11

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    goto :goto_5

    :cond_5
    iget-wide v7, p0, Lj$/util/stream/o2;->n:J

    :goto_5
    move-wide v9, v7

    iget-wide v7, p0, Lj$/util/stream/o2;->l:J

    iget-object v11, p0, Lj$/util/stream/o2;->k:Lj$/util/function/IntFunction;

    invoke-interface/range {v6 .. v11}, Lj$/util/stream/C0;->n(JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v6

    .line 0
    :cond_6
    invoke-virtual {p0, v6}, Lj$/util/stream/d;->e(Ljava/lang/Object;)V

    iput-boolean v1, p0, Lj$/util/stream/o2;->o:Z

    :cond_7
    iget-wide v6, p0, Lj$/util/stream/o2;->m:J

    cmp-long v0, v6, v4

    if-ltz v0, :cond_e

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/f;->c()Lj$/util/stream/f;

    move-result-object v0

    if-nez v0, :cond_8

    move v0, v1

    goto :goto_6

    :cond_8
    move v0, v2

    :goto_6
    if-nez v0, :cond_e

    .line 0
    iget-wide v3, p0, Lj$/util/stream/o2;->l:J

    iget-wide v5, p0, Lj$/util/stream/o2;->m:J

    add-long/2addr v3, v5

    .line 0
    iget-boolean v0, p0, Lj$/util/stream/o2;->o:Z

    if-eqz v0, :cond_9

    iget-wide v5, p0, Lj$/util/stream/o2;->n:J

    goto :goto_7

    :cond_9
    invoke-direct {p0, v3, v4}, Lj$/util/stream/o2;->j(J)J

    move-result-wide v5

    :goto_7
    cmp-long v0, v5, v3

    if-ltz v0, :cond_a

    goto :goto_9

    :cond_a
    invoke-virtual {p0}, Lj$/util/stream/f;->c()Lj$/util/stream/f;

    move-result-object v0

    check-cast v0, Lj$/util/stream/o2;

    move-object v7, p0

    :goto_8
    if-eqz v0, :cond_c

    iget-object v8, v0, Lj$/util/stream/f;->e:Lj$/util/stream/f;

    if-ne v7, v8, :cond_b

    iget-object v7, v0, Lj$/util/stream/f;->d:Lj$/util/stream/f;

    check-cast v7, Lj$/util/stream/o2;

    if-eqz v7, :cond_b

    invoke-direct {v7, v3, v4}, Lj$/util/stream/o2;->j(J)J

    move-result-wide v7

    add-long/2addr v5, v7

    cmp-long v7, v5, v3

    if-ltz v7, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v0}, Lj$/util/stream/f;->c()Lj$/util/stream/f;

    move-result-object v7

    check-cast v7, Lj$/util/stream/o2;

    move-object v13, v7

    move-object v7, v0

    move-object v0, v13

    goto :goto_8

    :cond_c
    cmp-long v0, v5, v3

    if-ltz v0, :cond_d

    goto :goto_9

    :cond_d
    move v1, v2

    :goto_9
    if-eqz v1, :cond_e

    .line 0
    invoke-virtual {p0}, Lj$/util/stream/d;->h()V

    :cond_e
    invoke-super {p0, p1}, Lj$/util/stream/f;->onCompletion(Ljava/util/concurrent/CountedCompleter;)V

    return-void
.end method
