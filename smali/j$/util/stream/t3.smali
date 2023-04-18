.class final Lj$/util/stream/t3;
.super Lj$/util/stream/u3;
.source "SourceFile"

# interfaces
.implements Lj$/util/B;
.implements Lj$/util/function/M;


# instance fields
.field e:J


# direct methods
.method constructor <init>(Lj$/util/B;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/u3;-><init>(Lj$/util/D;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/B;Lj$/util/stream/t3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/u3;-><init>(Lj$/util/D;Lj$/util/stream/u3;)V

    return-void
.end method


# virtual methods
.method public final accept(J)V
    .locals 0

    iput-wide p1, p0, Lj$/util/stream/t3;->e:J

    return-void
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->e(Lj$/util/B;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected final l(Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 1

    check-cast p1, Lj$/util/B;

    .line 0
    new-instance v0, Lj$/util/stream/t3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/t3;-><init>(Lj$/util/B;Lj$/util/stream/t3;)V

    return-object v0
.end method

.method protected final n(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lj$/util/function/M;

    .line 0
    iget-wide v0, p0, Lj$/util/stream/t3;->e:J

    invoke-interface {p1, v0, v1}, Lj$/util/function/M;->accept(J)V

    return-void
.end method

.method protected final o()Lj$/util/stream/Y2;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/X2;

    invoke-direct {v0}, Lj$/util/stream/X2;-><init>()V

    return-object v0
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->j(Lj$/util/B;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
