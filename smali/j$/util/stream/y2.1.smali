.class final Lj$/util/stream/y2;
.super Lj$/util/stream/Z;
.source "SourceFile"


# direct methods
.method constructor <init>(Lj$/util/stream/c;)V
    .locals 2

    sget v0, Lj$/util/stream/S2;->q:I

    sget v1, Lj$/util/stream/S2;->o:I

    or-int/2addr v0, v1

    invoke-direct {p0, p1, v0}, Lj$/util/stream/Z;-><init>(Lj$/util/stream/c;I)V

    return-void
.end method


# virtual methods
.method public final U0(Lj$/util/Spliterator;Lj$/util/function/IntFunction;Lj$/util/stream/c;)Lj$/util/stream/C0;
    .locals 2

    sget-object v0, Lj$/util/stream/S2;->SORTED:Lj$/util/stream/S2;

    invoke-virtual {p3}, Lj$/util/stream/c;->A0()I

    move-result v1

    invoke-virtual {v0, v1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p3, p1, v0, p2}, Lj$/util/stream/c;->L0(Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p3, p1, v0, p2}, Lj$/util/stream/c;->L0(Lj$/util/Spliterator;ZLj$/util/function/IntFunction;)Lj$/util/stream/C0;

    move-result-object p1

    check-cast p1, Lj$/util/stream/z0;

    invoke-interface {p1}, Lj$/util/stream/B0;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    invoke-static {p1}, Ljava/util/Arrays;->sort([I)V

    .line 0
    new-instance p2, Lj$/util/stream/Y0;

    invoke-direct {p2, p1}, Lj$/util/stream/Y0;-><init>([I)V

    return-object p2
.end method

.method public final X0(ILj$/util/stream/e2;)Lj$/util/stream/e2;
    .locals 1

    .line 0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    sget-object v0, Lj$/util/stream/S2;->SORTED:Lj$/util/stream/S2;

    invoke-virtual {v0, p1}, Lj$/util/stream/S2;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    sget-object v0, Lj$/util/stream/S2;->SIZED:Lj$/util/stream/S2;

    invoke-virtual {v0, p1}, Lj$/util/stream/S2;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lj$/util/stream/D2;

    invoke-direct {p1, p2}, Lj$/util/stream/D2;-><init>(Lj$/util/stream/e2;)V

    return-object p1

    :cond_1
    new-instance p1, Lj$/util/stream/v2;

    invoke-direct {p1, p2}, Lj$/util/stream/v2;-><init>(Lj$/util/stream/e2;)V

    return-object p1
.end method
