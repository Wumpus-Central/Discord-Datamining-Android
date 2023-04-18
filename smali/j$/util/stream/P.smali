.class abstract Lj$/util/stream/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/D3;
.implements Lj$/util/stream/E3;


# instance fields
.field private final a:Z


# direct methods
.method protected constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj$/util/stream/P;->a:Z

    return-void
.end method


# virtual methods
.method public final N(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 0

    .line 0
    invoke-virtual {p1, p2, p0}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    const/4 p1, 0x0

    return-object p1
.end method

.method public synthetic accept(D)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->O()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(I)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->V()V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic accept(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->W()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic andThen(Lj$/util/function/Consumer;)Lj$/util/function/Consumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/Consumer$-CC;->$default$andThen(Lj$/util/function/Consumer;Lj$/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    return-object p1
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

.method public final bridge synthetic get()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-boolean v0, p0, Lj$/util/stream/P;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, Lj$/util/stream/Q;

    invoke-direct {v0, p1, p2, p0}, Lj$/util/stream/Q;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/stream/e2;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lj$/util/stream/S;

    invoke-virtual {p1, p0}, Lj$/util/stream/t0;->K0(Lj$/util/stream/e2;)Lj$/util/stream/e2;

    move-result-object v1

    invoke-direct {v0, p1, p2, v1}, Lj$/util/stream/S;-><init>(Lj$/util/stream/t0;Lj$/util/Spliterator;Lj$/util/stream/e2;)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final y()I
    .locals 1

    iget-boolean v0, p0, Lj$/util/stream/P;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget v0, Lj$/util/stream/S2;->r:I

    :goto_0
    return v0
.end method
