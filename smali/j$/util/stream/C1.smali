.class final Lj$/util/stream/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/N1;


# instance fields
.field private a:Z

.field private b:Ljava/lang/Object;

.field final synthetic c:Lj$/util/function/d;


# direct methods
.method constructor <init>(Lj$/util/function/d;)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/C1;->c:Lj$/util/function/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

.method public final synthetic accept(J)V
    .locals 0

    invoke-static {}, Lj$/util/stream/t0;->W()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lj$/util/stream/C1;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lj$/util/stream/C1;->a:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/util/stream/C1;->c:Lj$/util/function/d;

    iget-object v1, p0, Lj$/util/stream/C1;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Lj$/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lj$/util/stream/C1;->b:Ljava/lang/Object;

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

    iput-boolean p1, p0, Lj$/util/stream/C1;->a:Z

    const/4 p1, 0x0

    iput-object p1, p0, Lj$/util/stream/C1;->b:Ljava/lang/Object;

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
    .locals 1

    .line 0
    iget-boolean v0, p0, Lj$/util/stream/C1;->a:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lj$/util/h;->a()Lj$/util/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lj$/util/stream/C1;->b:Ljava/lang/Object;

    invoke-static {v0}, Lj$/util/h;->d(Ljava/lang/Object;)Lj$/util/h;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final h(Lj$/util/stream/N1;)V
    .locals 1

    check-cast p1, Lj$/util/stream/C1;

    .line 0
    iget-boolean v0, p1, Lj$/util/stream/C1;->a:Z

    if-nez v0, :cond_0

    iget-object p1, p1, Lj$/util/stream/C1;->b:Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lj$/util/stream/C1;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
