.class Lbc/t1;
.super Lbc/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/a0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final l:Lbc/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/d0<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final m:Lbc/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/i0<",
            "+TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbc/d0;Lbc/i0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/d0<",
            "TE;>;",
            "Lbc/i0<",
            "+TE;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/a0;-><init>()V

    .line 2
    iput-object p1, p0, Lbc/t1;->l:Lbc/d0;

    .line 3
    iput-object p2, p0, Lbc/t1;->m:Lbc/i0;

    return-void
.end method

.method constructor <init>(Lbc/d0;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/d0<",
            "TE;>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-static {p2}, Lbc/i0;->q([Ljava/lang/Object;)Lbc/i0;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lbc/t1;-><init>(Lbc/d0;Lbc/i0;)V

    return-void
.end method


# virtual methods
.method E()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/t1;->l:Lbc/d0;

    return-object v0
.end method

.method e([Ljava/lang/Object;I)I
    .locals 1

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0, p1, p2}, Lbc/i0;->e([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method f()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0}, Lbc/d0;->f()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public forEach(Lj$/util/function/Consumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj$/util/function/Consumer<",
            "-TE;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0, p1}, Lbc/i0;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 0

    invoke-static {p1}, Lj$/util/function/Consumer$VivifiedWrapper;->convert(Ljava/util/function/Consumer;)Lj$/util/function/Consumer;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbc/t1;->forEach(Lj$/util/function/Consumer;)V

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method h()I
    .locals 1

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0}, Lbc/d0;->h()I

    move-result v0

    return v0
.end method

.method i()I
    .locals 1

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0}, Lbc/d0;->i()I

    move-result v0

    return v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-virtual {p0, p1}, Lbc/t1;->w(I)Lbc/h2;

    move-result-object p1

    return-object p1
.end method

.method public w(I)Lbc/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lbc/h2<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/t1;->m:Lbc/i0;

    invoke-virtual {v0, p1}, Lbc/i0;->w(I)Lbc/h2;

    move-result-object p1

    return-object p1
.end method
