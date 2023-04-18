.class final Lj$/util/stream/D1;
.super Lj$/util/stream/t0;
.source "SourceFile"


# instance fields
.field final synthetic h:Lj$/util/function/d;

.field final synthetic i:Lj$/util/function/BiConsumer;

.field final synthetic j:Lj$/util/function/Supplier;

.field final synthetic k:Lj$/util/stream/k;


# direct methods
.method constructor <init>(Lj$/util/stream/T2;Lj$/util/function/c;Lj$/util/function/BiConsumer;Lj$/util/function/g0;Lj$/util/stream/j;)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/D1;->h:Lj$/util/function/d;

    iput-object p3, p0, Lj$/util/stream/D1;->i:Lj$/util/function/BiConsumer;

    iput-object p4, p0, Lj$/util/stream/D1;->j:Lj$/util/function/Supplier;

    iput-object p5, p0, Lj$/util/stream/D1;->k:Lj$/util/stream/k;

    invoke-direct {p0, p1}, Lj$/util/stream/t0;-><init>(Lj$/util/stream/T2;)V

    return-void
.end method


# virtual methods
.method public final I0()Lj$/util/stream/N1;
    .locals 4

    .line 0
    new-instance v0, Lj$/util/stream/E1;

    iget-object v1, p0, Lj$/util/stream/D1;->h:Lj$/util/function/d;

    iget-object v2, p0, Lj$/util/stream/D1;->j:Lj$/util/function/Supplier;

    iget-object v3, p0, Lj$/util/stream/D1;->i:Lj$/util/function/BiConsumer;

    invoke-direct {v0, v2, v3, v1}, Lj$/util/stream/E1;-><init>(Lj$/util/function/Supplier;Lj$/util/function/BiConsumer;Lj$/util/function/d;)V

    return-object v0
.end method

.method public final y()I
    .locals 2

    iget-object v0, p0, Lj$/util/stream/D1;->k:Lj$/util/stream/k;

    check-cast v0, Lj$/util/stream/j;

    invoke-virtual {v0}, Lj$/util/stream/j;->b()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lj$/util/stream/i;->UNORDERED:Lj$/util/stream/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lj$/util/stream/S2;->r:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
