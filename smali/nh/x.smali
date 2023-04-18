.class public Lnh/x;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lnh/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Ljava/util/RandomAccess;",
        "Lnh/o;"
    }
.end annotation


# instance fields
.field private final k:Lnh/o;


# direct methods
.method public constructor <init>(Lnh/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnh/x;->k:Lnh/o;

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

.method static synthetic b(Lnh/x;)Lnh/o;
    .locals 0

    iget-object p0, p0, Lnh/x;->k:Lnh/o;

    return-object p0
.end method


# virtual methods
.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnh/x;->k:Lnh/o;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lnh/x;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnh/x$b;

    invoke-direct {v0, p0}, Lnh/x$b;-><init>(Lnh/x;)V

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lnh/x;->k:Lnh/o;

    invoke-interface {v0}, Lnh/o;->j()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnh/x$a;

    invoke-direct {v0, p0, p1}, Lnh/x$a;-><init>(Lnh/x;I)V

    return-object v0
.end method

.method public m(Lnh/d;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public o(I)Lnh/d;
    .locals 1

    iget-object v0, p0, Lnh/x;->k:Lnh/o;

    invoke-interface {v0, p1}, Lnh/o;->o(I)Lnh/d;

    move-result-object p1

    return-object p1
.end method

.method public p()Lnh/o;
    .locals 0

    return-object p0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lnh/x;->k:Lnh/o;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
