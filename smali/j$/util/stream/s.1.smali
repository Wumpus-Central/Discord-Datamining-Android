.class final Lj$/util/stream/s;
.super Lj$/util/stream/X1;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field final synthetic c:Lj$/util/stream/c;


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V
    .locals 0

    .line 0
    iput p3, p0, Lj$/util/stream/s;->b:I

    iput-object p1, p0, Lj$/util/stream/s;->c:Lj$/util/stream/c;

    invoke-direct {p0, p2}, Lj$/util/stream/X1;-><init>(Lj$/util/stream/e2;)V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 3

    iget v0, p0, Lj$/util/stream/s;->b:I

    iget-object v1, p0, Lj$/util/stream/X1;->a:Lj$/util/stream/e2;

    iget-object v2, p0, Lj$/util/stream/s;->c:Lj$/util/stream/c;

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 0
    :pswitch_0
    check-cast v2, Lj$/util/stream/t;

    iget-object v0, v2, Lj$/util/stream/t;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/m;

    check-cast v0, Lj$/util/function/l;

    invoke-virtual {v0, p1, p2}, Lj$/util/function/l;->b(D)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1, p1, p2}, Lj$/util/stream/e2;->accept(D)V

    :cond_0
    return-void

    .line 0
    :pswitch_1
    check-cast v2, Lj$/util/stream/t;

    iget-object v0, v2, Lj$/util/stream/t;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/k;

    invoke-interface {v0, p1, p2}, Lj$/util/function/k;->apply(D)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/stream/D;

    if-eqz p1, :cond_1

    :try_start_0
    invoke-interface {p1}, Lj$/util/stream/D;->sequential()Lj$/util/stream/D;

    move-result-object p2

    new-instance v0, Lj$/util/stream/r;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Lj$/util/stream/r;-><init>(ILj$/util/stream/e2;)V

    invoke-interface {p2, v0}, Lj$/util/stream/D;->t(Lj$/util/function/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    :try_start_1
    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2

    :cond_1
    :goto_1
    if-eqz p1, :cond_2

    check-cast p1, Lj$/util/stream/c;

    invoke-virtual {p1}, Lj$/util/stream/c;->close()V

    :cond_2
    return-void

    .line 0
    :pswitch_2
    check-cast v2, Lj$/util/stream/w;

    iget-object v0, v2, Lj$/util/stream/w;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/q;

    invoke-interface {v0, p1, p2}, Lj$/util/function/q;->applyAsLong(D)J

    move-result-wide p1

    invoke-interface {v1, p1, p2}, Lj$/util/stream/e2;->accept(J)V

    return-void

    .line 0
    :pswitch_3
    check-cast v2, Lj$/util/stream/v;

    iget-object v0, v2, Lj$/util/stream/v;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/o;

    check-cast v0, Lj$/util/function/n;

    invoke-virtual {v0, p1, p2}, Lj$/util/function/n;->a(D)I

    move-result p1

    invoke-interface {v1, p1}, Lj$/util/stream/e2;->accept(I)V

    return-void

    .line 0
    :pswitch_4
    check-cast v2, Lj$/util/stream/u;

    iget-object v0, v2, Lj$/util/stream/u;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/k;

    invoke-interface {v0, p1, p2}, Lj$/util/function/k;->apply(D)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    .line 0
    :pswitch_5
    check-cast v2, Lj$/util/stream/t;

    iget-object v0, v2, Lj$/util/stream/t;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/s;

    check-cast v0, Lj$/util/function/r;

    invoke-virtual {v0, p1, p2}, Lj$/util/function/r;->a(D)D

    move-result-wide p1

    invoke-interface {v1, p1, p2}, Lj$/util/stream/e2;->accept(D)V

    return-void

    .line 0
    :goto_2
    check-cast v2, Lj$/util/stream/t;

    iget-object v0, v2, Lj$/util/stream/t;->t:Ljava/lang/Object;

    check-cast v0, Lj$/util/function/i;

    invoke-interface {v0, p1, p2}, Lj$/util/function/i;->accept(D)V

    invoke-interface {v1, p1, p2}, Lj$/util/stream/e2;->accept(D)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(J)V
    .locals 4

    iget v0, p0, Lj$/util/stream/s;->b:I

    const-wide/16 v1, -0x1

    iget-object v3, p0, Lj$/util/stream/X1;->a:Lj$/util/stream/e2;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-interface {v3, v1, v2}, Lj$/util/stream/e2;->c(J)V

    return-void

    .line 0
    :pswitch_1
    invoke-interface {v3, v1, v2}, Lj$/util/stream/e2;->c(J)V

    return-void

    .line 0
    :goto_0
    invoke-interface {v3, p1, p2}, Lj$/util/stream/e2;->c(J)V

    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
