.class Lbc/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj$/util/Spliterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/p;->d(Lj$/util/Spliterator;Lj$/util/function/Function;)Lj$/util/Spliterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lj$/util/Spliterator<",
        "TOutElementT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lj$/util/Spliterator;

.field final synthetic b:Lj$/util/function/Function;


# direct methods
.method constructor <init>(Lj$/util/Spliterator;Lj$/util/function/Function;)V
    .locals 0

    iput-object p1, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    iput-object p2, p0, Lbc/p$a;->b:Lj$/util/function/Function;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lbc/p$a;->c(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lbc/p$a;->d(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic c(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p1, p2}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private static synthetic d(Lj$/util/function/Consumer;Lj$/util/function/Function;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p1, p2}, Lj$/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public characteristics()I
    .locals 1

    iget-object v0, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->characteristics()I

    move-result v0

    and-int/lit16 v0, v0, -0x106

    return v0
.end method

.method public estimateSize()J
    .locals 2

    iget-object v0, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    invoke-interface {v0}, Lj$/util/Spliterator;->estimateSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public forEachRemaining(Lj$/util/function/Consumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-TOutElementT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    iget-object v1, p0, Lbc/p$a;->b:Lj$/util/function/Function;

    new-instance v2, Lbc/n;

    invoke-direct {v2, p1, v1}, Lbc/n;-><init>(Lj$/util/function/Consumer;Lj$/util/function/Function;)V

    invoke-interface {v0, v2}, Lj$/util/Spliterator;->forEachRemaining(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic getComparator()Ljava/util/Comparator;
    .locals 1

    invoke-static {p0}, Lj$/util/Spliterator$-CC;->$default$getComparator(Lj$/util/Spliterator;)Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getExactSizeIfKnown()J
    .locals 2

    invoke-static {p0}, Lj$/util/Spliterator$-CC;->$default$getExactSizeIfKnown(Lj$/util/Spliterator;)J

    move-result-wide v0

    return-wide v0
.end method

.method public synthetic hasCharacteristics(I)Z
    .locals 0

    invoke-static {p0, p1}, Lj$/util/Spliterator$-CC;->$default$hasCharacteristics(Lj$/util/Spliterator;I)Z

    move-result p1

    return p1
.end method

.method public tryAdvance(Lj$/util/function/Consumer;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-TOutElementT;>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    iget-object v1, p0, Lbc/p$a;->b:Lj$/util/function/Function;

    new-instance v2, Lbc/o;

    invoke-direct {v2, p1, v1}, Lbc/o;-><init>(Lj$/util/function/Consumer;Lj$/util/function/Function;)V

    invoke-interface {v0, v2}, Lj$/util/Spliterator;->tryAdvance(Lj$/util/function/Consumer;)Z

    move-result p1

    return p1
.end method

.method public trySplit()Lj$/util/Spliterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "TOutElementT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/p$a;->a:Lj$/util/Spliterator;

    .line 2
    .line 3
    invoke-interface {v0}, Lj$/util/Spliterator;->trySplit()Lj$/util/Spliterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lbc/p$a;->b:Lj$/util/function/Function;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lbc/p;->d(Lj$/util/Spliterator;Lj$/util/function/Function;)Lj$/util/Spliterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
