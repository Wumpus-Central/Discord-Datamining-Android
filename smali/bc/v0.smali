.class public abstract Lbc/v0;
.super Lbc/k;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbc/v0$e;,
        Lbc/v0$d;,
        Lbc/v0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/k<",
        "TK;TV;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field final transient o:Lbc/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/l0<",
            "TK;+",
            "Lbc/d0<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field final transient p:I


# direct methods
.method constructor <init>(Lbc/l0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/l0<",
            "TK;+",
            "Lbc/d0<",
            "TV;>;>;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/v0;->o:Lbc/l0;

    .line 5
    .line 6
    iput p2, p0, Lbc/v0;->p:I

    .line 7
    .line 8
    return-void
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
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method public static synthetic m(Ljava/util/Map$Entry;)Lj$/util/Spliterator;
    .locals 0

    invoke-static {p0}, Lbc/v0;->v(Ljava/util/Map$Entry;)Lj$/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 0

    invoke-static {p0, p1}, Lbc/v0;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 0

    invoke-static {p0, p1}, Lbc/h1;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic v(Ljava/util/Map$Entry;)Lj$/util/Spliterator;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-static {p0}, Lj$/util/Collection$-EL;->spliterator(Ljava/util/Collection;)Lj$/util/Spliterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v1, Lbc/u0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lbc/u0;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lbc/p;->d(Lj$/util/Spliterator;Lj$/util/function/Function;)Lj$/util/Spliterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->r()Lbc/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic asMap()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->o()Lbc/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lbc/j;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Lbc/j;->c(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method d()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method bridge synthetic e()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->p()Lbc/d0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lbc/j;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method f()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "unreachable"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method bridge synthetic g()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->q()Lbc/d0;

    move-result-object v0

    return-object v0
.end method

.method bridge synthetic h()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->s()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic hashCode()I
    .locals 1

    invoke-super {p0}, Lbc/j;->hashCode()I

    move-result v0

    return v0
.end method

.method i()Lj$/util/Spliterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj$/util/Spliterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbc/v0;->o()Lbc/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbc/l0;->l()Lbc/w0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lbc/d0;->spliterator()Lj$/util/Spliterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lbc/t0;

    .line 14
    .line 15
    invoke-direct {v1}, Lbc/t0;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lbc/v0;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    int-to-long v2, v2

    .line 23
    const/16 v4, 0x40

    .line 24
    .line 25
    invoke-static {v0, v1, v4, v2, v3}, Lbc/p;->a(Lj$/util/Spliterator;Lj$/util/function/Function;IJ)Lj$/util/Spliterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method bridge synthetic k()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->w()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public o()Lbc/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/l0<",
            "TK;",
            "Ljava/util/Collection<",
            "TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/v0;->o:Lbc/l0;

    return-object v0
.end method

.method p()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lbc/v0$d;

    invoke-direct {v0, p0}, Lbc/v0$d;-><init>(Lbc/v0;)V

    return-object v0
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)Z"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method q()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lbc/v0$e;

    invoke-direct {v0, p0}, Lbc/v0$e;-><init>(Lbc/v0;)V

    return-object v0
.end method

.method public r()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-super {p0}, Lbc/j;->a()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Lbc/d0;

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method s()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lbc/v0$a;

    invoke-direct {v0, p0}, Lbc/v0$a;-><init>(Lbc/v0;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lbc/v0;->p:I

    return v0
.end method

.method t()Z
    .locals 1

    iget-object v0, p0, Lbc/v0;->o:Lbc/l0;

    invoke-virtual {v0}, Lbc/l0;->n()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lbc/j;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic values()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lbc/v0;->x()Lbc/d0;

    move-result-object v0

    return-object v0
.end method

.method w()Lbc/g2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/g2<",
            "TV;>;"
        }
    .end annotation

    new-instance v0, Lbc/v0$b;

    invoke-direct {v0, p0}, Lbc/v0$b;-><init>(Lbc/v0;)V

    return-object v0
.end method

.method public x()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TV;>;"
        }
    .end annotation

    invoke-super {p0}, Lbc/j;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Lbc/d0;

    return-object v0
.end method
