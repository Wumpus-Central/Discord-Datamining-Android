.class final Lj$/util/stream/S0;
.super Lj$/util/stream/W0;
.source "SourceFile"

# interfaces
.implements Lj$/util/stream/y0;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj$/util/stream/W0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lj$/util/stream/B0;
    .locals 0

    .line 0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final bridge synthetic a(I)Lj$/util/stream/C0;
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lj$/util/stream/S0;->a(I)Lj$/util/stream/B0;

    const/4 p1, 0x0

    throw p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 1

    .line 0
    invoke-static {}, Lj$/util/stream/t0;->k0()[D

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c([Ljava/lang/Double;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lj$/util/stream/t0;->Y(Lj$/util/stream/y0;[Ljava/lang/Double;I)V

    return-void
.end method

.method public final synthetic forEach(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/stream/t0;->b0(Lj$/util/stream/y0;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final bridge synthetic i([Ljava/lang/Object;I)V
    .locals 0

    .line 0
    check-cast p1, [Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Lj$/util/stream/S0;->c([Ljava/lang/Double;I)V

    return-void
.end method

.method public final synthetic n(JJLj$/util/function/IntFunction;)Lj$/util/stream/C0;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Lj$/util/stream/t0;->e0(Lj$/util/stream/y0;JJ)Lj$/util/stream/y0;

    move-result-object p1

    return-object p1
.end method

.method public final spliterator()Lj$/util/D;
    .locals 1

    .line 0
    invoke-static {}, Lj$/util/Spliterators;->b()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Lj$/util/Spliterator;
    .locals 1

    .line 0
    invoke-static {}, Lj$/util/Spliterators;->b()Lj$/util/y;

    move-result-object v0

    return-object v0
.end method
