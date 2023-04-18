.class public abstract Ldi/g;
.super Ldi/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldi/g$b;,
        Ldi/g$a;
    }
.end annotation


# instance fields
.field private final b:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ldi/g$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z


# direct methods
.method public constructor <init>(Lci/n;)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldi/m;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ldi/g$c;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ldi/g$c;-><init>(Ldi/g;)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Ldi/g$d;->k:Ldi/g$d;

    .line 15
    .line 16
    new-instance v2, Ldi/g$e;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Ldi/g$e;-><init>(Ldi/g;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0, v1, v2}, Lci/n;->g(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lci/i;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ldi/g;->b:Lci/i;

    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic f(Ldi/g;Ldi/g1;Z)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldi/g;->g(Ldi/g1;Z)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ldi/g1;Z)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/g1;",
            "Z)",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Ldi/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldi/g;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Ldi/g;->b:Lci/i;

    .line 13
    .line 14
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ldi/g$b;

    .line 19
    .line 20
    invoke-virtual {v1}, Ldi/g$b;->a()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, p2}, Ldi/g;->j(Z)Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {v1, p2}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-interface {p1}, Ldi/g1;->n()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    const-string p1, "supertypes"

    .line 40
    .line 41
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    return-object p2
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method protected abstract h()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation
.end method

.method protected i()Ldi/g0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected j(Z)Ljava/util/Collection;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected k()Z
    .locals 1

    iget-boolean v0, p0, Ldi/g;->c:Z

    return v0
.end method

.method protected abstract l()Lmg/d1;
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldi/g;->b:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/g$b;

    invoke-virtual {v0}, Ldi/g$b;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic n()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Ldi/g;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public p(Lei/g;)Ldi/g1;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldi/g$a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Ldi/g$a;-><init>(Ldi/g;Lei/g;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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

.method protected s(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;)",
            "Ljava/util/List<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    const-string v0, "supertypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected t(Ldi/g0;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected u(Ldi/g0;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
