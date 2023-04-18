.class final Lj$/util/stream/x;
.super Lj$/util/stream/A;
.source "SourceFile"


# instance fields
.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/c;II)V
    .locals 0

    .line 0
    iput p3, p0, Lj$/util/stream/x;->s:I

    invoke-direct {p0, p1, p2}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 1

    iget p1, p0, Lj$/util/stream/x;->s:I

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    new-instance p1, Lj$/util/stream/V;

    const/4 v0, 0x2

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/V;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    :pswitch_1
    return-object p2

    .line 0
    :goto_0
    new-instance p1, Lj$/util/stream/e0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/e0;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
