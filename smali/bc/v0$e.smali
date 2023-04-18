.class final Lbc/v0$e;
.super Lbc/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

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
.field private final transient l:Lbc/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc/v0<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lbc/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc/v0<",
            "TK;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lbc/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbc/v0$e;->l:Lbc/v0;

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


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lbc/v0$e;->l:Lbc/v0;

    invoke-virtual {v0, p1}, Lbc/v0;->c(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method e([Ljava/lang/Object;I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lbc/v0$e;->l:Lbc/v0;

    .line 2
    .line 3
    iget-object v0, v0, Lbc/v0;->o:Lbc/l0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lbc/l0;->t()Lbc/d0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lbc/d0;->n()Lbc/g2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lbc/d0;

    .line 24
    .line 25
    invoke-virtual {v1, p1, p2}, Lbc/d0;->e([Ljava/lang/Object;I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return p2
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

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lbc/v0$e;->n()Lbc/g2;

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

    iget-object v0, p0, Lbc/v0$e;->l:Lbc/v0;

    invoke-virtual {v0}, Lbc/v0;->w()Lbc/g2;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lbc/v0$e;->l:Lbc/v0;

    invoke-virtual {v0}, Lbc/v0;->size()I

    move-result v0

    return v0
.end method
