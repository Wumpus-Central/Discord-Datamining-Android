.class final Lj$/util/stream/t;
.super Lj$/util/stream/A;
.source "SourceFile"


# instance fields
.field public final synthetic s:I

.field final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lj$/util/stream/c;ILjava/lang/Object;I)V
    .locals 0

    .line 0
    iput p4, p0, Lj$/util/stream/t;->s:I

    iput-object p3, p0, Lj$/util/stream/t;->t:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lj$/util/stream/A;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 3

    iget p1, p0, Lj$/util/stream/t;->s:I

    const/4 v0, 0x6

    const/4 v1, 0x5

    const/4 v2, 0x4

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 0
    :pswitch_0
    new-instance p1, Lj$/util/stream/Q1;

    invoke-direct {p1, p0, p2, v1}, Lj$/util/stream/Q1;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_1
    new-instance p1, Lj$/util/stream/e0;

    invoke-direct {p1, p0, p2, v2}, Lj$/util/stream/e0;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_2
    new-instance p1, Lj$/util/stream/V;

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/V;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_3
    new-instance p1, Lj$/util/stream/s;

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/s;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_4
    new-instance p1, Lj$/util/stream/s;

    invoke-direct {p1, p0, p2, v1}, Lj$/util/stream/s;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_5
    new-instance p1, Lj$/util/stream/s;

    invoke-direct {p1, p0, p2, v2}, Lj$/util/stream/s;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :pswitch_6
    new-instance p1, Lj$/util/stream/s;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lj$/util/stream/s;-><init>(Lj$/util/stream/c;Lj$/util/stream/e2;I)V

    return-object p1

    .line 0
    :goto_0
    new-instance p1, Lj$/util/stream/o;

    invoke-direct {p1, p0, p2}, Lj$/util/stream/o;-><init>(Lj$/util/stream/t;Lj$/util/stream/e2;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
