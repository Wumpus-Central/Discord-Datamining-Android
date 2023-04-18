.class final Lj$/util/stream/s3;
.super Lj$/util/stream/u3;
.source "SourceFile"

# interfaces
.implements Lj$/util/Spliterator$OfInt;
.implements Lj$/util/function/IntConsumer;


# instance fields
.field e:I


# direct methods
.method constructor <init>(Lj$/util/Spliterator$OfInt;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lj$/util/stream/u3;-><init>(Lj$/util/D;JJ)V

    return-void
.end method

.method constructor <init>(Lj$/util/Spliterator$OfInt;Lj$/util/stream/s3;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/u3;-><init>(Lj$/util/D;Lj$/util/stream/u3;)V

    return-void
.end method


# virtual methods
.method public final accept(I)V
    .locals 0

    iput p1, p0, Lj$/util/stream/s3;->e:I

    return-void
.end method

.method public final synthetic andThen(Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;
    .locals 0

    invoke-static {p0, p1}, Lj$/util/function/IntConsumer$-CC;->$default$andThen(Lj$/util/function/IntConsumer;Lj$/util/function/IntConsumer;)Lj$/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->d(Lj$/util/Spliterator$OfInt;Lj$/util/function/Consumer;)V

    return-void
.end method

.method protected final l(Lj$/util/Spliterator;)Lj$/util/Spliterator;
    .locals 1

    check-cast p1, Lj$/util/Spliterator$OfInt;

    .line 0
    new-instance v0, Lj$/util/stream/s3;

    invoke-direct {v0, p1, p0}, Lj$/util/stream/s3;-><init>(Lj$/util/Spliterator$OfInt;Lj$/util/stream/s3;)V

    return-object v0
.end method

.method protected final n(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lj$/util/function/IntConsumer;

    .line 0
    iget v0, p0, Lj$/util/stream/s3;->e:I

    invoke-interface {p1, v0}, Lj$/util/function/IntConsumer;->accept(I)V

    return-void
.end method

.method protected final o()Lj$/util/stream/Y2;
    .locals 1

    .line 0
    new-instance v0, Lj$/util/stream/W2;

    invoke-direct {v0}, Lj$/util/stream/W2;-><init>()V

    return-object v0
.end method

.method public final synthetic tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/n;->i(Lj$/util/Spliterator$OfInt;Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method
