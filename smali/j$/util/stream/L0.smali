.class final Lj$/util/stream/L0;
.super Lj$/util/stream/N0;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/z0;


# direct methods
.method constructor <init>(Lj$/util/stream/z0;Lj$/util/stream/z0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/N0;-><init>(Lj$/util/stream/B0;Lj$/util/stream/B0;)V

    return-void
.end method


# virtual methods
.method public final synthetic c([Ljava/lang/Integer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/t0;->Z(Lj$/util/stream/z0;[Ljava/lang/Integer;I)V

    return-void
.end method

.method public final synthetic forEach(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->c0(Lj$/util/stream/z0;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final bridge synthetic i([Ljava/lang/Object;I)V
    .locals 0

    .line 0
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/L0;->c([Ljava/lang/Integer;I)V

    return-void
.end method

.method public final synthetic n(JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/t0;->f0(Lj$/util/stream/z0;JJ)Lj$/util/stream/z0;

    move-result-object p1

    return-object p1
.end method

.method public final newArray(I)Ljava/lang/Object;
    .locals 0

    .line 0
    new-array p1, p1, [I

    return-object p1
.end method

.method public final spliterator()Lj$/util/D;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/c1;

    invoke-direct {v0, p0}, Lj$/util/stream/c1;-><init>(Lj$/util/stream/z0;)V

    return-object v0
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/c1;

    invoke-direct {v0, p0}, Lj$/util/stream/c1;-><init>(Lj$/util/stream/z0;)V

    return-object v0
.end method
