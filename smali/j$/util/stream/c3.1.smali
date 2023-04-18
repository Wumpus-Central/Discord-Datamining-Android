.class public final synthetic Lj$/util/stream/c3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/b2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj$/util/function/i;


# direct methods
.method public synthetic constructor <init>(Lj$/util/function/i;I)V
    .locals 0

    .line 0
    iput p2, p0, Lj$/util/stream/c3;->a:I

    iput-object p1, p0, Lj$/util/stream/c3;->b:Lj$/util/function/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 2

    iget v0, p0, Lj$/util/stream/c3;->a:I

    iget-object v1, p0, Lj$/util/stream/c3;->b:Lj$/util/function/i;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    check-cast v1, Lj$/util/stream/I2;

    invoke-virtual {v1, p1, p2}, Lj$/util/stream/I2;->accept(D)V

    return-void

    .line 0
    :goto_0
    invoke-interface {v1, p1, p2}, Lj$/util/function/i;->accept(D)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic accept(I)V
    .locals 1

    iget p1, p0, Lj$/util/stream/c3;->a:I

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {}, Lj$/util/stream/t0;->V()V

    throw v0

    .line 0
    :goto_0
    invoke-static {}, Lj$/util/stream/t0;->V()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic accept(J)V
    .locals 0

    iget p1, p0, Lj$/util/stream/c3;->a:I

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {}, Lj$/util/stream/t0;->W()V

    throw p2

    .line 0
    :goto_0
    invoke-static {}, Lj$/util/stream/t0;->W()V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lj$/util/stream/c3;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {p0, p1}, Lj$/util/stream/t0;->Q(Lj$/util/stream/b2;Ljava/lang/Object;)V

    return-void

    .line 0
    :goto_0
    invoke-static {p0, p1}, Lj$/util/stream/t0;->Q(Lj$/util/stream/b2;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 1

    iget v0, p0, Lj$/util/stream/c3;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1

    .line 0
    :goto_0
    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final synthetic c(J)V
    .locals 0

    return-void
.end method

.method public final synthetic e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic end()V
    .locals 0

    return-void
.end method

.method public final synthetic k(Ljava/lang/Double;)V
    .locals 1

    iget v0, p0, Lj$/util/stream/c3;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-static {p0, p1}, Lj$/util/stream/t0;->P(Lj$/util/stream/b2;Ljava/lang/Double;)V

    return-void

    .line 0
    :goto_0
    invoke-static {p0, p1}, Lj$/util/stream/t0;->P(Lj$/util/stream/b2;Ljava/lang/Double;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
