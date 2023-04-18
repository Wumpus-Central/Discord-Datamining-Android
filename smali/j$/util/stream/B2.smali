.class final Lj$/util/stream/B2;
.super Lj$/util/stream/t2;
.source "SourceFile"


# instance fields
.field private d:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Lj$/util/stream/e2;Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lj$/util/stream/t2;-><init>(Lj$/util/stream/e2;Ljava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c(J)V
    .locals 2

    const-wide/32 v0, 0x7ffffff7

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    long-to-int p1, p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    iput-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Stream size exceeds max array size"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final end()V
    .locals 4

    iget-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    .line 0
    instance-of v1, v0, Lj$/util/List;

    iget-object v2, p0, Lj$/util/stream/t2;->b:Ljava/util/Comparator;

    if-eqz v1, :cond_0

    check-cast v0, Lj$/util/List;

    invoke-interface {v0, v2}, Lj$/util/List;->sort(Ljava/util/Comparator;)V

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Lj$/util/List$-CC;->$default$sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 0
    :goto_0
    iget-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    int-to-long v0, v0

    iget-object v2, p0, Lj$/util/stream/a2;->a:Lj$/util/stream/e2;

    invoke-interface {v2, v0, v1}, Lj$/util/stream/e2;->c(J)V

    iget-boolean v0, p0, Lj$/util/stream/t2;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    .line 0
    new-instance v1, Lj$/util/stream/a;

    const/4 v3, 0x3

    invoke-direct {v1, v3, v2}, Lj$/util/stream/a;-><init>(ILjava/lang/Object;)V

    invoke-static {v0, v1}, Lj$/util/Collection$-EL;->a(Ljava/util/Collection;Lj$/util/function/Consumer;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2}, Lj$/util/stream/e2;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v2, v1}, Lj$/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    :goto_2
    invoke-interface {v2}, Lj$/util/stream/e2;->end()V

    const/4 v0, 0x0

    iput-object v0, p0, Lj$/util/stream/B2;->d:Ljava/util/ArrayList;

    return-void
.end method
