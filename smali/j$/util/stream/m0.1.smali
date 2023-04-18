.class final Lj$/util/stream/m0;
.super Lj$/util/stream/p0;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/c2;


# instance fields
.field final synthetic c:Lj$/util/stream/q0;

.field final synthetic d:Lj$/util/function/C;


# direct methods
.method constructor <init>(Lj$/util/function/C;Lj$/util/stream/q0;)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/m0;->c:Lj$/util/stream/q0;

    iput-object p1, p0, Lj$/util/stream/m0;->d:Lj$/util/function/C;

    invoke-direct {p0, p2}, Lj$/util/stream/p0;-><init>(Lj$/util/stream/q0;)V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 2

    iget-boolean v0, p0, Lj$/util/stream/p0;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/m0;->d:Lj$/util/function/C;

    check-cast v0, Lj$/util/function/B;

    invoke-virtual {v0, p1}, Lj$/util/function/B;->b(I)Z

    move-result p1

    iget-object v0, p0, Lj$/util/stream/m0;->c:Lj$/util/stream/q0;

    invoke-static {v0}, Lj$/util/stream/q0;->a(Lj$/util/stream/q0;)Z

    move-result v1

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj$/util/stream/p0;->a:Z

    invoke-static {v0}, Lj$/util/stream/q0;->b(Lj$/util/stream/q0;)Z

    move-result p1

    iput-boolean p1, p0, Lj$/util/stream/p0;->b:Z

    :cond_0
    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->S(Lj$/util/stream/c2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/IntConsumer$-CC;->$default$andThen(Lj$/util/function/IntConsumer;Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->R(Lj$/util/stream/c2;Ljava/lang/Integer;)V

    return-void
.end method
