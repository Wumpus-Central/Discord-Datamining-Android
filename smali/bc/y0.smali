.class abstract Lbc/y0;
.super Lbc/w0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/w0$a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbc/w0$a;-><init>()V

    return-void
.end method


# virtual methods
.method B()Lbc/i0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/i0<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, Lbc/y0$a;

    invoke-direct {v0, p0}, Lbc/y0$a;-><init>(Lbc/y0;)V

    return-object v0
.end method

.method e([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lbc/w0$a;->b()Lbc/i0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lbc/i0;->e([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 3
    invoke-virtual {p0, v1}, Lbc/y0;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc/y0;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method abstract get(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/y0;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public n()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lbc/w0$a;->b()Lbc/i0;

    move-result-object v0

    invoke-virtual {v0}, Lbc/i0;->n()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public spliterator()Lj$/util/Spliterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    new-instance v1, Lbc/x0;

    invoke-direct {v1, p0}, Lbc/x0;-><init>(Lbc/y0;)V

    const/16 v2, 0x511

    invoke-static {v0, v2, v1}, Lbc/p;->b(IILj$/util/function/IntFunction;)Lj$/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lbc/y0;->spliterator()Lj$/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Spliterator$Wrapper;->convert(Lj$/util/Spliterator;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method
