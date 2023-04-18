.class final Lbc/s0;
.super Lbc/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/d0<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final l:Lbc/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/l0<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbc/l0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/l0<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/s0;->l:Lbc/l0;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public static synthetic q(Lj$/util/function/Consumer;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lbc/s0;->s(Lj$/util/function/Consumer;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic r(Lbc/s0;)Lbc/l0;
    .locals 0

    iget-object p0, p0, Lbc/s0;->l:Lbc/l0;

    return-object p0
.end method

.method private static synthetic s(Lj$/util/function/Consumer;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p2}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public b()Lbc/i0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/i0<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/s0;->l:Lbc/l0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lbc/l0;->l()Lbc/w0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lbc/d0;->b()Lbc/i0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lbc/s0$b;

    .line 12
    .line 13
    invoke-direct {v1, p0, v0}, Lbc/s0$b;-><init>(Lbc/s0;Lbc/i0;)V

    .line 14
    .line 15
    .line 16
    return-object v1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lbc/s0;->n()Lbc/g2;

    move-result-object v0

    invoke-static {v0, p1}, Lbc/a1;->c(Ljava/util/Iterator;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lbc/s0;->l:Lbc/l0;

    new-instance v1, Lbc/r0;

    invoke-direct {v1, p1}, Lbc/r0;-><init>(Lj$/util/function/Consumer;)V

    invoke-static {v0, v1}, Lj$/util/Map$-EL;->forEach(Ljava/util/Map;Lj$/util/function/BiConsumer;)V

    return-void
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc/s0;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/s0;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public n()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lbc/s0$a;

    invoke-direct {v0, p0}, Lbc/s0$a;-><init>(Lbc/s0;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lbc/s0;->l:Lbc/l0;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public spliterator()Lj$/util/Spliterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/s0;->l:Lbc/l0;

    invoke-virtual {v0}, Lbc/l0;->l()Lbc/w0;

    move-result-object v0

    invoke-virtual {v0}, Lbc/d0;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    new-instance v1, Lbc/q0;

    invoke-direct {v1}, Lbc/q0;-><init>()V

    invoke-static {v0, v1}, Lbc/p;->d(Lj$/util/Spliterator;Lj$/util/function/Function;)Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lbc/s0;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method
