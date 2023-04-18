.class public final synthetic Lj$/util/stream/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/function/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lj$/util/stream/e2;


# direct methods
.method public synthetic constructor <init>(ILj$/util/stream/e2;)V
    .locals 0

    .line 0
    iput p1, p0, Lj$/util/stream/r;->a:I

    iput-object p2, p0, Lj$/util/stream/r;->b:Lj$/util/stream/e2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 2

    iget v0, p0, Lj$/util/stream/r;->a:I

    iget-object v1, p0, Lj$/util/stream/r;->b:Lj$/util/stream/e2;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    invoke-interface {v1, p1, p2}, Lj$/util/stream/e2;->accept(D)V

    return-void

    .line 0
    :goto_0
    check-cast v1, Lj$/util/stream/s;

    .line 0
    iget-object v0, v1, Lj$/util/stream/X1;->a:Lj$/util/stream/e2;

    .line 0
    invoke-interface {v0, p1, p2}, Lj$/util/stream/e2;->accept(D)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
