.class final Lj$/util/stream/H2;
.super Lj$/util/stream/N2;
.source "SourceFile"

# interfaces
.implements Lj$/util/y;


# instance fields
.field final synthetic g:Lj$/util/stream/I2;


# direct methods
.method constructor <init>(Lj$/util/stream/I2;IIII)V
    .locals 0

    iput-object p1, p0, Lj$/util/stream/H2;->g:Lj$/util/stream/I2;

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/N2;-><init>(Lj$/util/stream/O2;IIII)V

    return-void
.end method


# virtual methods
.method final c(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, [D

    check-cast p3, Lj$/util/function/i;

    .line 0
    aget-wide p1, p2, p1

    invoke-interface {p3, p1, p2}, Lj$/util/function/i;->accept(D)V

    return-void
.end method

.method final d(Ljava/lang/Object;II)Lj$/util/D;
    .locals 0

    check-cast p1, [D

    add-int/2addr p3, p2

    .line 0
    invoke-static {p1, p2, p3}, Lj$/util/Spliterators;->j([DII)Lj$/util/y;

    move-result-object p1

    return-object p1
.end method

.method final e(IIII)Lj$/util/D;
    .locals 7

    .line 0
    new-instance v6, Lj$/util/stream/H2;

    iget-object v1, p0, Lj$/util/stream/H2;->g:Lj$/util/stream/I2;

    move-object v0, v6

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lj$/util/stream/H2;-><init>(Lj$/util/stream/I2;IIII)V

    return-object v6
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->c(Lj$/util/y;Lj$/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->h(Lj$/util/y;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
