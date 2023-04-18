.class public abstract Lj$/util/stream/Z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/d2;


# instance fields
.field protected final a:Lj$/util/stream/e2;


# direct methods
.method public constructor <init>(Lj$/util/stream/e2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    iput-object p1, p0, Lj$/util/stream/Z1;->a:Lj$/util/stream/e2;

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

.method public e()Z
    .locals 1

    iget-object v0, p0, Lj$/util/stream/Z1;->a:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->e()Z

    move-result v0

    return v0
.end method

.method public end()V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/Z1;->a:Lj$/util/stream/e2;

    invoke-interface {v0}, Lj$/util/stream/e2;->end()V

    return-void
.end method

.method public final synthetic j(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->T(Lj$/util/stream/d2;Ljava/lang/Long;)V

    return-void
.end method
