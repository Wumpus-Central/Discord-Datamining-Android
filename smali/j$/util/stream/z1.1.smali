.class final Lj$/util/stream/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/N1;
.implements Lj$/util/stream/b2;


# instance fields
.field private a:Z

.field private b:D

.field final synthetic c:Lj$/util/function/g;


# direct methods
.method constructor <init>(Lj$/util/function/g;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/z1;->c:Lj$/util/function/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 3

    iget-boolean v0, p0, Lj$/util/stream/z1;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj$/util/stream/z1;->a:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/util/stream/z1;->c:Lj$/util/function/g;

    iget-wide v1, p0, Lj$/util/stream/z1;->b:D

    invoke-interface {v0, v1, v2, p1, p2}, Lj$/util/function/g;->applyAsDouble(DD)D

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lj$/util/stream/z1;->b:D

    return-void
.end method

.method public final synthetic accept(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->V()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic accept(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->W()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->Q(Lj$/util/stream/b2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method

.method public final c(J)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj$/util/stream/z1;->a:Z

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lj$/util/stream/z1;->b:D

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

.method public final get()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-boolean v0, p0, Lj$/util/stream/z1;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lj$/util/j;->a()Lj$/util/j;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lj$/util/stream/z1;->b:D

    invoke-static {v0, v1}, Lj$/util/j;->d(D)Lj$/util/j;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final h(Lj$/util/stream/N1;)V
    .locals 2

    check-cast p1, Lj$/util/stream/z1;

    .line 0
    iget-boolean v0, p1, Lj$/util/stream/z1;->a:Z

    if-nez v0, :cond_0

    iget-wide v0, p1, Lj$/util/stream/z1;->b:D

    invoke-virtual {p0, v0, v1}, Lj$/util/stream/z1;->accept(D)V

    :cond_0
    return-void
.end method

.method public final synthetic k(Ljava/lang/Double;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->P(Lj$/util/stream/b2;Ljava/lang/Double;)V

    return-void
.end method
