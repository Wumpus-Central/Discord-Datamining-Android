.class final Lj$/util/stream/v1;
.super Lj$/util/stream/O1;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/N1;
.implements Lj$/util/stream/d2;


# instance fields
.field final synthetic b:Lj$/util/function/Supplier;

.field final synthetic c:Lj$/util/function/d0;

.field final synthetic d:Lj$/util/function/d;


# direct methods
.method constructor <init>(Lj$/util/function/Supplier;Lj$/util/function/d0;Lj$/util/function/d;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/v1;->b:Lj$/util/function/Supplier;

    iput-object p2, p0, Lj$/util/stream/v1;->c:Lj$/util/function/d0;

    iput-object p3, p0, Lj$/util/stream/v1;->d:Lj$/util/function/d;

    invoke-direct {p0}, Lj$/util/stream/O1;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic accept(D)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->O()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic accept(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->V()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final accept(J)V
    .locals 2

    iget-object v0, p0, Lj$/util/stream/v1;->c:Lj$/util/function/d0;

    iget-object v1, p0, Lj$/util/stream/O1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1, p1, p2}, Lj$/util/function/d0;->accept(Ljava/lang/Object;J)V

    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->U(Lj$/util/stream/d2;Ljava/lang/Object;)V

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

    iget-object p1, p0, Lj$/util/stream/v1;->b:Lj$/util/function/Supplier;

    invoke-interface {p1}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj$/util/stream/O1;->a:Ljava/lang/Object;

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

.method public final h(Lj$/util/stream/N1;)V
    .locals 2

    check-cast p1, Lj$/util/stream/v1;

    .line 0
    iget-object v0, p0, Lj$/util/stream/O1;->a:Ljava/lang/Object;

    iget-object p1, p1, Lj$/util/stream/O1;->a:Ljava/lang/Object;

    iget-object v1, p0, Lj$/util/stream/v1;->d:Lj$/util/function/d;

    invoke-interface {v1, v0, p1}, Lj$/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj$/util/stream/O1;->a:Ljava/lang/Object;

    return-void
.end method

.method public final synthetic j(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->T(Lj$/util/stream/d2;Ljava/lang/Long;)V

    return-void
.end method
