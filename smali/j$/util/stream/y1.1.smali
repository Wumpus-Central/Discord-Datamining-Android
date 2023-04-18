.class final Lj$/util/stream/y1;
.super Lj$/util/stream/t0;
.source "SourceFile"


# instance fields
.field public final synthetic h:I

.field final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/T2;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Lj$/util/stream/y1;->h:I

    iput-object p2, p0, Lj$/util/stream/y1;->i:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/T2;)V

    return-void
.end method


# virtual methods
.method public final I0()Lj$/util/stream/N1;
    .locals 2

    iget v0, p0, Lj$/util/stream/y1;->h:I

    iget-object v1, p0, Lj$/util/stream/y1;->i:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    new-instance v0, Lj$/util/stream/I1;

    check-cast v1, Lj$/util/function/w;

    invoke-direct {v0, v1}, Lj$/util/stream/I1;-><init>(Lj$/util/function/w;)V

    return-object v0

    .line 0
    :pswitch_1
    new-instance v0, Lj$/util/stream/C1;

    check-cast v1, Lj$/util/function/d;

    invoke-direct {v0, v1}, Lj$/util/stream/C1;-><init>(Lj$/util/function/d;)V

    return-object v0

    .line 0
    :pswitch_2
    new-instance v0, Lj$/util/stream/z1;

    check-cast v1, Lj$/util/function/g;

    invoke-direct {v0, v1}, Lj$/util/stream/z1;-><init>(Lj$/util/function/g;)V

    return-object v0

    .line 0
    :goto_0
    new-instance v0, Lj$/util/stream/M1;

    check-cast v1, Lj$/util/function/K;

    invoke-direct {v0, v1}, Lj$/util/stream/M1;-><init>(Lj$/util/function/K;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
