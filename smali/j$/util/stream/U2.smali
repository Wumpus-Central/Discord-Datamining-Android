.class abstract Lj$/util/stream/U2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/Spliterator;


# instance fields
.field final a:Z

.field final b:Lj$/util/stream/t0;

.field private c:Lj$/util/function/Supplier;

.field d:Lj$/util/Spliterator;

.field e:Lj$/util/stream/e2;

.field f:Lj$/util/stream/a;

.field g:J

.field h:Lj$/util/stream/e;

.field i:Z


# direct methods
.method constructor <init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/U2;->c:Lj$/util/function/Supplier;

    iput-object p2, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    iput-boolean p3, p0, Lj$/util/stream/U2;->a:Z

    return-void
.end method

.method constructor <init>(Lj$/util/stream/t0;Lj$/util/stream/a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    iput-object p2, p0, Lj$/util/stream/U2;->c:Lj$/util/function/Supplier;

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    iput-boolean p3, p0, Lj$/util/stream/U2;->a:Z

    return-void
.end method

.method private d()Z
    .locals 4

    :cond_0
    :goto_0
    iget-object v0, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    invoke-virtual {v0}, Lj$/util/stream/e;->count()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-nez v0, :cond_3

    iget-object v0, p0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/U2;->f:Lj$/util/stream/a;

    iget v2, v0, Lj$/util/stream/a;->a:I

    iget-object v0, v0, Lj$/util/stream/a;->b:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast v0, Lj$/util/stream/h3;

    .line 0
    iget-object v2, v0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    .line 0
    iget-object v0, v0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v2, v0}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 0
    :pswitch_1
    check-cast v0, Lj$/util/stream/f3;

    .line 0
    iget-object v2, v0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    .line 0
    iget-object v0, v0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v2, v0}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 0
    :pswitch_2
    check-cast v0, Lj$/util/stream/d3;

    .line 0
    iget-object v2, v0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    .line 0
    iget-object v0, v0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v2, v0}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v0

    goto :goto_2

    .line 0
    :goto_1
    check-cast v0, Lj$/util/stream/z3;

    .line 0
    iget-object v2, v0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    .line 0
    iget-object v0, v0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v2, v0}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result v0

    :goto_2
    if-nez v0, :cond_0

    .line 0
    :cond_1
    iget-boolean v0, p0, Lj$/util/stream/U2;->i:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    return v0

    :cond_2
    iget-object v0, p0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    iput-boolean v1, p0, Lj$/util/stream/U2;->i:Z

    goto :goto_0

    :cond_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method final c()Z
    .locals 8

    iget-object v0, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lj$/util/stream/U2;->i:Z

    if-eqz v0, :cond_0

    return v3

    :cond_0
    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    invoke-virtual {p0}, Lj$/util/stream/U2;->h()V

    iput-wide v1, p0, Lj$/util/stream/U2;->g:J

    iget-object v0, p0, Lj$/util/stream/U2;->e:Lj$/util/stream/e2;

    iget-object v1, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    invoke-interface {v1}, Lj$/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lj$/util/stream/e2;->c(J)V

    invoke-direct {p0}, Lj$/util/stream/U2;->d()Z

    move-result v0

    return v0

    :cond_1
    iget-wide v4, p0, Lj$/util/stream/U2;->g:J

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iput-wide v4, p0, Lj$/util/stream/U2;->g:J

    invoke-virtual {v0}, Lj$/util/stream/e;->count()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-gez v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    if-nez v3, :cond_3

    iput-wide v1, p0, Lj$/util/stream/U2;->g:J

    iget-object v0, p0, Lj$/util/stream/U2;->h:Lj$/util/stream/e;

    invoke-virtual {v0}, Lj$/util/stream/e;->clear()V

    invoke-direct {p0}, Lj$/util/stream/U2;->d()Z

    move-result v3

    :cond_3
    return v3
.end method

.method public final characteristics()I
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    iget-object v0, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    invoke-virtual {v0}, Lj$/util/stream/t0;->A0()I

    move-result v0

    invoke-static {v0}, Lj$/util/stream/S2;->g(I)I

    move-result v0

    .line 0
    sget v1, Lj$/util/stream/S2;->f:I

    and-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_0

    and-int/lit16 v0, v0, -0x4041

    .line 0
    iget-object v1, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    invoke-interface {v1}, Lj$/util/Spliterator;->characteristics()I

    move-result v1

    and-int/lit16 v1, v1, 0x4040

    or-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method final e()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/U2;->c:Lj$/util/function/Supplier;

    invoke-interface {v0}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/Spliterator;

    iput-object v0, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    const/4 v0, 0x0

    iput-object v0, p0, Lj$/util/stream/U2;->c:Lj$/util/function/Supplier;

    :cond_0
    return-void
.end method

.method public final estimateSize()J
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    iget-object v0, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getComparator()Ljava/util/Comparator;
    .locals 1

    const/4 v0, 0x4

    .line 0
    invoke-static {p0, v0}, Lj$/util/Spliterator$-CC;->$default$hasCharacteristics(Lj$/util/Spliterator;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final getExactSizeIfKnown()J
    .locals 2

    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    sget-object v0, Lj$/util/stream/S2;->SIZED:Lj$/util/stream/S2;

    iget-object v1, p0, Lj$/util/stream/U2;->b:Lj$/util/stream/t0;

    invoke-virtual {v1}, Lj$/util/stream/t0;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->getExactSizeIfKnown()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method abstract h()V
.end method

.method public final synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Spliterator$-CC;->$default$hasCharacteristics(Lj$/util/Spliterator;I)Z

    move-result p1

    return p1
.end method

.method abstract i(Lj$/util/Spliterator;)Lj$/util/stream/U2;
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    iget-object v2, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    aput-object v2, v0, v1

    const-string v1, "%s[%s]"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public trySplit()Lj$/util/Spliterator;
    .locals 2

    iget-boolean v0, p0, Lj$/util/stream/U2;->a:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lj$/util/stream/U2;->i:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lj$/util/stream/U2;->e()V

    iget-object v0, p0, Lj$/util/stream/U2;->d:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->trySplit()Lj$/util/Spliterator;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lj$/util/stream/U2;->i(Lj$/util/Spliterator;)Lj$/util/stream/U2;

    move-result-object v1

    :cond_1
    :goto_0
    return-object v1
.end method
