.class final Lj$/util/stream/r3;
.super Lj$/util/stream/u3;
.source "SourceFile"

# interfaces
.implements Lj$/util/y;
.implements Lj$/util/function/i;


# instance fields
.field e:D


# direct methods
.method constructor <init>(Lj$/util/y;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/u3;-><init>(Lj$/util/D;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/y;Lj$/util/stream/r3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/u3;-><init>(Lj$/util/D;Lj$/util/stream/u3;)V

    return-void
.end method


# virtual methods
.method public final accept(D)V
    .locals 0

    iput-wide p1, p0, Lj$/util/stream/r3;->e:D

    return-void
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->c(Lj$/util/y;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected final l(Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 1

    check-cast p1, Lj$/util/y;

    .line 0
    new-instance v0, Lj$/util/stream/r3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/r3;-><init>(Lj$/util/y;Lj$/util/stream/r3;)V

    return-object v0
.end method

.method protected final n(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj$/util/function/i;

    .line 0
    iget-wide v0, p0, Lj$/util/stream/r3;->e:D

    invoke-interface {p1, v0, v1}, Lj$/util/function/i;->accept(D)V

    return-void
.end method

.method protected final o()Lj$/util/stream/Y2;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/V2;

    invoke-direct {v0}, Lj$/util/stream/V2;-><init>()V

    return-object v0
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->h(Lj$/util/y;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
