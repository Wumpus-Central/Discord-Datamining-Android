.class final Lj$/util/stream/o;
.super Lj$/util/stream/a2;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field c:Ljava/lang/Object;

.field final synthetic d:Lj$/util/stream/c;


# direct methods
.method public constructor <init>(Lj$/util/stream/p;Lj$/util/stream/e2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj$/util/stream/o;->b:I

    .line 0
    iput-object p1, p0, Lj$/util/stream/o;->d:Lj$/util/stream/c;

    invoke-direct {p0, p2}, Lj$/util/stream/a2;-><init>(Lj$/util/stream/e2;)V

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/t;Lj$/util/stream/e2;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lj$/util/stream/o;->b:I

    .line 0
    iput-object p1, p0, Lj$/util/stream/o;->d:Lj$/util/stream/c;

    invoke-direct {p0, p2}, Lj$/util/stream/a2;-><init>(Lj$/util/stream/e2;)V

    new-instance p1, Lj$/util/stream/r;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Lj$/util/stream/r;-><init>(ILj$/util/stream/e2;)V

    iput-object p1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/v;Lj$/util/stream/e2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lj$/util/stream/o;->b:I

    .line 0
    iput-object p1, p0, Lj$/util/stream/o;->d:Lj$/util/stream/c;

    invoke-direct {p0, p2}, Lj$/util/stream/a2;-><init>(Lj$/util/stream/e2;)V

    new-instance p1, Lj$/util/stream/T;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Lj$/util/stream/T;-><init>(ILj$/util/stream/e2;)V

    iput-object p1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj$/util/stream/w;Lj$/util/stream/e2;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj$/util/stream/o;->b:I

    .line 0
    iput-object p1, p0, Lj$/util/stream/o;->d:Lj$/util/stream/c;

    invoke-direct {p0, p2}, Lj$/util/stream/a2;-><init>(Lj$/util/stream/e2;)V

    new-instance p1, Lj$/util/stream/d0;

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2}, Lj$/util/stream/d0;-><init>(ILj$/util/stream/e2;)V

    iput-object p1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lj$/util/stream/o;->b:I

    iget-object v1, p0, Lj$/util/stream/o;->d:Lj$/util/stream/c;

    packed-switch v0, :pswitch_data_0

    goto :goto_4

    .line 0
    :pswitch_0
    check-cast v1, Lj$/util/stream/v;

    iget-object v0, v1, Lj$/util/stream/v;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/IntStream;

    if-eqz p1, :cond_0

    :try_start_0
    invoke-interface {p1}, Lj$/util/stream/IntStream;->sequential()Lj$/util/stream/IntStream;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/IntConsumer;

    invoke-interface {v0, v1}, Lj$/util/stream/IntStream;->C(Lj$/util/function/IntConsumer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    invoke-interface {p1}, Lj$/util/stream/h;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0

    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    invoke-interface {p1}, Lj$/util/stream/h;->close()V

    :cond_1
    return-void

    .line 0
    :pswitch_1
    check-cast v1, Lj$/util/stream/w;

    iget-object v0, v1, Lj$/util/stream/w;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/k0;

    if-eqz p1, :cond_2

    :try_start_2
    invoke-interface {p1}, Lj$/util/stream/k0;->sequential()Lj$/util/stream/k0;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/M;

    invoke-interface {v0, v1}, Lj$/util/stream/k0;->q(Lj$/util/function/M;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_3
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v0

    :cond_2
    :goto_3
    if-eqz p1, :cond_3

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_3
    return-void

    .line 0
    :pswitch_2
    iget-object v0, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    invoke-interface {v0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_4
    return-void

    .line 0
    :goto_4
    check-cast v1, Lj$/util/stream/t;

    iget-object v0, v1, Lj$/util/stream/t;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/Function;

    invoke-interface {v0, p1}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/D;

    if-eqz p1, :cond_5

    :try_start_4
    invoke-interface {p1}, Lj$/util/stream/D;->sequential()Lj$/util/stream/D;

    move-result-object v0

    iget-object v1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    check-cast v1, Lj$/util/function/i;

    invoke-interface {v0, v1}, Lj$/util/stream/D;->t(Lj$/util/function/i;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_6

    :catchall_4
    move-exception v0

    :try_start_5
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception p1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v0

    :cond_5
    :goto_6
    if-eqz p1, :cond_6

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(J)V
    .locals 2

    iget p1, p0, Lj$/util/stream/o;->b:I

    const-wide/16 v0, -0x1

    iget-object p2, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-interface {p2, v0, v1}, Lj$/util/stream/e2;->c(J)V

    return-void

    .line 0
    :pswitch_1
    invoke-interface {p2, v0, v1}, Lj$/util/stream/e2;->c(J)V

    return-void

    .line 0
    :pswitch_2
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    invoke-interface {p2, v0, v1}, Lj$/util/stream/e2;->c(J)V

    return-void

    .line 0
    :goto_0
    invoke-interface {p2, v0, v1}, Lj$/util/stream/e2;->c(J)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final end()V
    .locals 1

    iget v0, p0, Lj$/util/stream/o;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Lj$/util/stream/a2;->end()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Lj$/util/stream/o;->c:Ljava/lang/Object;

    iget-object v0, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
