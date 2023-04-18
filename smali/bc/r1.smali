.class public abstract Lbc/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/Comparator;)Lbc/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lbc/r1<",
            "TT;>;"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Lbc/r1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lbc/r1;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lbc/w;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lbc/w;-><init>(Ljava/util/Comparator;)V

    .line 11
    .line 12
    .line 13
    move-object p0, v0

    .line 14
    :goto_0
    return-object p0
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

.method public static d()Lbc/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C::",
            "Ljava/lang/Comparable;",
            ">()",
            "Lbc/r1<",
            "TC;>;"
        }
    .end annotation

    sget-object v0, Lbc/o1;->k:Lbc/o1;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/Iterable;)Lbc/i0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:TT;>(",
            "Ljava/lang/Iterable<",
            "TE;>;)",
            "Lbc/i0<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lbc/i0;->B(Ljava/util/Comparator;Ljava/lang/Iterable;)Lbc/i0;

    move-result-object p1

    return-object p1
.end method

.method public abstract compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation
.end method

.method g()Lbc/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:TT;>()",
            "Lbc/r1<",
            "Ljava/util/Map$Entry<",
            "TT2;*>;>;"
        }
    .end annotation

    invoke-static {}, Lbc/h1;->d()Lac/f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbc/r1;->j(Lac/f;)Lbc/r1;

    move-result-object v0

    return-object v0
.end method

.method public j(Lac/f;)Lbc/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lac/f<",
            "TF;+TT;>;)",
            "Lbc/r1<",
            "TF;>;"
        }
    .end annotation

    new-instance v0, Lbc/l;

    invoke-direct {v0, p1, p0}, Lbc/l;-><init>(Lac/f;Lbc/r1;)V

    return-object v0
.end method

.method public k()Lbc/r1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:TT;>()",
            "Lbc/r1<",
            "TS;>;"
        }
    .end annotation

    new-instance v0, Lbc/y1;

    invoke-direct {v0, p0}, Lbc/y1;-><init>(Lbc/r1;)V

    return-object v0
.end method
