.class final Lj$/util/stream/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/D3;


# instance fields
.field final a:Z

.field final b:Ljava/lang/Object;

.field final c:Lj$/util/function/Predicate;

.field final d:Lj$/util/function/Supplier;


# direct methods
.method constructor <init>(ZLj$/util/stream/T2;Ljava/lang/Object;Lj$/util/stream/I0;Lj$/util/stream/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lj$/util/stream/E;->a:Z

    iput-object p3, p0, Lj$/util/stream/E;->b:Ljava/lang/Object;

    iput-object p4, p0, Lj$/util/stream/E;->c:Lj$/util/function/Predicate;

    iput-object p5, p0, Lj$/util/stream/E;->d:Lj$/util/function/Supplier;

    return-void
.end method


# virtual methods
.method public final N(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj$/util/stream/E;->d:Lj$/util/function/Supplier;

    invoke-interface {v0}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj$/util/stream/E3;

    invoke-virtual {p1, p2, v0}, Lj$/util/stream/t0;->J0(Lj$/util/Spliterator;Lj$/util/stream/e2;)Lj$/util/stream/e2;

    check-cast v0, Lj$/util/stream/E3;

    invoke-interface {v0}, Lj$/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lj$/util/stream/E;->b:Ljava/lang/Object;

    :goto_0
    return-object p1
.end method

.method public final l(Lj$/util/stream/t0;Lj$/util/Spliterator;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lj$/util/stream/K;

    invoke-direct {v0, p0, p1, p2}, Lj$/util/stream/K;-><init>(Lj$/util/stream/E;Lj$/util/stream/t0;Lj$/util/Spliterator;)V

    invoke-virtual {v0}, Ljava/util/concurrent/ForkJoinTask;->invoke()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final y()I
    .locals 2

    sget v0, Lj$/util/stream/S2;->u:I

    iget-boolean v1, p0, Lj$/util/stream/E;->a:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget v1, Lj$/util/stream/S2;->r:I

    :goto_0
    or-int/2addr v0, v1

    return v0
.end method
