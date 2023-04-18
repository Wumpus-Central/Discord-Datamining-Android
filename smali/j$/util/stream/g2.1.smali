.class final Lj$/util/stream/g2;
.super Lj$/util/stream/U1;
.source "SourceFile"


# instance fields
.field final synthetic s:J

.field final synthetic t:J


# direct methods
.method constructor <init>(Lj$/util/stream/c;IJJ)V
    .locals 0

    iput-wide p3, p0, Lj$/util/stream/g2;->s:J

    iput-wide p5, p0, Lj$/util/stream/g2;->t:J

    invoke-direct {p0, p1, p2}, Lj$/util/stream/U1;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method

.method static c1(Lj$/util/Spliterator;JJJ)Lj$/util/Spliterator;
    .locals 8

    cmp-long v0, p1, p5

    if-gtz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    sub-long/2addr p5, p1

    if-ltz v2, :cond_0

    invoke-static {p3, p4, p5, p6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    move-wide p3, p1

    goto :goto_0

    :cond_0
    move-wide p3, p5

    :goto_0
    move-wide v6, p3

    move-wide v4, v0

    goto :goto_1

    :cond_1
    move-wide v4, p1

    move-wide v6, p3

    :goto_1
    new-instance p1, Lj$/util/stream/v3;

    move-object v2, p1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lj$/util/stream/v3;-><init>(Lj$/util/Spliterator;JJ)V

    return-object p1
.end method


# virtual methods
.method final U0(Lj$/util/Spliterator;Lj$/util/function/IntFunction;Lj$/util/stream/c;)Lj$/util/stream/C0;
    .locals 17

    move-object/from16 v9, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    invoke-virtual {v7, v3}, Lj$/util/stream/c;->v0(Lj$/util/Spliterator;)J

    move-result-wide v15

    const-wide/16 v0, 0x0

    cmp-long v0, v15, v0

    const/4 v8, 0x1

    if-lez v0, :cond_0

    const/16 v0, 0x4000

    invoke-interface {v3, v0}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p3 .. p3}, Lj$/util/stream/c;->R0()Lj$/util/stream/T2;

    move-result-object v0

    iget-wide v4, v9, Lj$/util/stream/g2;->s:J

    iget-wide v10, v9, Lj$/util/stream/g2;->t:J

    move-object/from16 v1, p1

    move-wide v2, v4

    move-wide v4, v10

    invoke-static/range {v0 .. v5}, Lj$/util/stream/p2;->b(Lj$/util/stream/T2;Lj$/util/Spliterator;JJ)Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v7, v0, v8, v6}, Lj$/util/stream/t0;->m0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lj$/util/stream/S2;->ORDERED:Lj$/util/stream/S2;

    invoke-virtual/range {p3 .. p3}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v7, v3}, Lj$/util/stream/c;->b1(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object v10

    iget-wide v11, v9, Lj$/util/stream/g2;->s:J

    iget-wide v13, v9, Lj$/util/stream/g2;->t:J

    invoke-static/range {v10 .. v16}, Lj$/util/stream/g2;->c1(Lj$/util/Spliterator;JJJ)Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v9, v0, v8, v6}, Lj$/util/stream/t0;->m0(Lj$/util/stream/t0;Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v10, Lj$/util/stream/o2;

    iget-wide v11, v9, Lj$/util/stream/g2;->s:J

    iget-wide v13, v9, Lj$/util/stream/g2;->t:J

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-wide v5, v11

    move-wide v7, v13

    invoke-direct/range {v0 .. v8}, Lj$/util/stream/o2;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;Lj$/util/Spliterator;Lj$/util/function/IntFunction;JJ)V

    invoke-virtual {v10}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/C0;

    return-object v0
.end method

.method final V0(Lj$/util/stream/c;Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 13

    invoke-virtual {p1, p2}, Lj$/util/stream/c;->v0(Lj$/util/Spliterator;)J

    move-result-wide v5

    const-wide/16 v0, 0x0

    cmp-long v0, v5, v0

    if-lez v0, :cond_0

    const/16 v0, 0x4000

    invoke-interface {p2, v0}, Lj$/util/Spliterator;->hasCharacteristics(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lj$/util/stream/p3;

    invoke-virtual {p1, p2}, Lj$/util/stream/c;->b1(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object v8

    iget-wide v9, p0, Lj$/util/stream/g2;->s:J

    iget-wide p1, p0, Lj$/util/stream/g2;->t:J

    invoke-static {v9, v10, p1, p2}, Lj$/util/stream/p2;->a(JJ)J

    move-result-wide v11

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lj$/util/stream/p3;-><init>(Lj$/util/Spliterator;JJ)V

    return-object v0

    :cond_0
    sget-object v0, Lj$/util/stream/S2;->ORDERED:Lj$/util/stream/S2;

    invoke-virtual {p1}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1, p2}, Lj$/util/stream/c;->b1(Lj$/util/Spliterator;)Lj$/util/Spliterator;

    move-result-object v0

    iget-wide v1, p0, Lj$/util/stream/g2;->s:J

    iget-wide v3, p0, Lj$/util/stream/g2;->t:J

    invoke-static/range {v0 .. v6}, Lj$/util/stream/g2;->c1(Lj$/util/Spliterator;JJJ)Lj$/util/Spliterator;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v9, Lj$/util/stream/o2;

    .line 0
    new-instance v4, Lj$/util/stream/I0;

    const/4 v0, 0x6

    invoke-direct {v4, v0}, Lj$/util/stream/I0;-><init>(I)V

    .line 0
    iget-wide v5, p0, Lj$/util/stream/g2;->s:J

    iget-wide v7, p0, Lj$/util/stream/g2;->t:J

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v8}, Lj$/util/stream/o2;-><init>(Lj$/util/stream/c;Lj$/util/stream/c;Lj$/util/Spliterator;Lj$/util/function/IntFunction;JJ)V

    invoke-virtual {v9}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/C0;

    invoke-interface {p1}, Lj$/util/stream/C0;->spliterator()Lj$/util/Spliterator;

    move-result-object p1

    return-object p1
.end method

.method final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 0

    new-instance p1, Lj$/util/stream/f2;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/f2;-><init>(Lj$/util/stream/g2;Lj$/util/stream/e2;)V

    return-object p1
.end method
