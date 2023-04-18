.class final Lbc/c2;
.super Lbc/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/b0<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field final transient o:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TK;"
        }
    .end annotation
.end field

.field final transient p:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TV;"
        }
    .end annotation
.end field

.field private final transient q:Lbc/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/b0<",
            "TV;TK;>;"
        }
    .end annotation
.end field

.field private transient r:Lbc/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/b0<",
            "TV;TK;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/b0;-><init>()V

    .line 2
    invoke-static {p1, p2}, Lbc/m;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    iput-object p1, p0, Lbc/c2;->o:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lbc/c2;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lbc/c2;->q:Lbc/b0;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lbc/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lbc/b0<",
            "TV;TK;>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Lbc/b0;-><init>()V

    .line 7
    iput-object p1, p0, Lbc/c2;->o:Ljava/lang/Object;

    .line 8
    iput-object p2, p0, Lbc/c2;->p:Ljava/lang/Object;

    .line 9
    iput-object p3, p0, Lbc/c2;->q:Lbc/b0;

    return-void
.end method


# virtual methods
.method public containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lbc/c2;->o:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lbc/c2;->p:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public forEach(Lj$/util/function/BiConsumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/BiConsumer<",
            "-TK;-TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj$/util/function/BiConsumer;

    iget-object v0, p0, Lbc/c2;->o:Ljava/lang/Object;

    iget-object v1, p0, Lbc/c2;->p:Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lj$/util/function/BiConsumer;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic forEach(Ljava/util/function/BiConsumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/BiConsumer$VivifiedWrapper;->convert(Ljava/util/function/BiConsumer;)Lj$/util/function/BiConsumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc/c2;->forEach(Lj$/util/function/BiConsumer;)V

    return-void
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    iget-object v0, p0, Lbc/c2;->o:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lbc/c2;->p:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method h()Lbc/w0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/c2;->o:Ljava/lang/Object;

    iget-object v1, p0, Lbc/c2;->p:Ljava/lang/Object;

    invoke-static {v0, v1}, Lbc/h1;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Lbc/w0;->y(Ljava/lang/Object;)Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method i()Lbc/w0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/c2;->o:Ljava/lang/Object;

    invoke-static {v0}, Lbc/w0;->y(Ljava/lang/Object;)Lbc/w0;

    move-result-object v0

    return-object v0
.end method

.method n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public v()Lbc/b0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/b0<",
            "TV;TK;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/c2;->q:Lbc/b0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lbc/c2;->r:Lbc/b0;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    new-instance v0, Lbc/c2;

    .line 11
    .line 12
    iget-object v1, p0, Lbc/c2;->p:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v2, p0, Lbc/c2;->o:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p0}, Lbc/c2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lbc/b0;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lbc/c2;->r:Lbc/b0;

    .line 20
    .line 21
    :cond_1
    return-object v0
    .line 22
    .line 23
    .line 24
.end method
