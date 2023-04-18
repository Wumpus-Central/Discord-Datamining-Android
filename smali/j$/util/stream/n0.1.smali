.class final Lj$/util/stream/n0;
.super Lj$/util/stream/p0;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/d2;


# instance fields
.field final synthetic c:Lj$/util/stream/q0;

.field final synthetic d:Lj$/util/function/Q;


# direct methods
.method constructor <init>(Lj$/util/function/Q;Lj$/util/stream/q0;)V
    .locals 0

    iput-object p2, p0, Lj$/util/stream/n0;->c:Lj$/util/stream/q0;

    iput-object p1, p0, Lj$/util/stream/n0;->d:Lj$/util/function/Q;

    invoke-direct {p0, p2}, Lj$/util/stream/p0;-><init>(Lj$/util/stream/q0;)V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 1

    iget-boolean v0, p0, Lj$/util/stream/p0;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lj$/util/stream/n0;->d:Lj$/util/function/Q;

    check-cast v0, Lj$/util/function/P;

    invoke-virtual {v0, p1, p2}, Lj$/util/function/P;->b(J)Z

    move-result p1

    iget-object p2, p0, Lj$/util/stream/n0;->c:Lj$/util/stream/q0;

    invoke-static {p2}, Lj$/util/stream/q0;->a(Lj$/util/stream/q0;)Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lj$/util/stream/p0;->a:Z

    invoke-static {p2}, Lj$/util/stream/q0;->b(Lj$/util/stream/q0;)Z

    move-result p1

    iput-boolean p1, p0, Lj$/util/stream/p0;->b:Z

    :cond_0
    return-void
.end method

.method public final bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->U(Lj$/util/stream/d2;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic j(Ljava/lang/Long;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->T(Lj$/util/stream/d2;Ljava/lang/Long;)V

    return-void
.end method
