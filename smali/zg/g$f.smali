.class final Lzg/g$f;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/g;-><init>(Lyg/g;Lmg/e;Lch/g;ZLzg/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "Lmg/d;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/g;

.field final synthetic l:Lyg/g;


# direct methods
.method constructor <init>(Lzg/g;Lyg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/g$f;->k:Lzg/g;

    iput-object p2, p0, Lzg/g$f;->l:Lyg/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/g$f;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lzg/g$f;->k:Lzg/g;

    invoke-static {v0}, Lzg/g;->Q(Lzg/g;)Lch/g;

    move-result-object v0

    invoke-interface {v0}, Lch/g;->m()Ljava/util/Collection;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lch/k;

    .line 5
    iget-object v3, p0, Lzg/g$f;->k:Lzg/g;

    invoke-static {v3, v2}, Lzg/g;->S(Lzg/g;Lch/k;)Lxg/b;

    move-result-object v2

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, p0, Lzg/g$f;->k:Lzg/g;

    invoke-static {v0}, Lzg/g;->Q(Lzg/g;)Lch/g;

    move-result-object v0

    invoke-interface {v0}, Lch/g;->t()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 8
    iget-object v0, p0, Lzg/g$f;->k:Lzg/g;

    invoke-static {v0}, Lzg/g;->N(Lzg/g;)Lmg/d;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 9
    invoke-static {v0, v2, v2, v3, v4}, Leh/w;->c(Lmg/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    :cond_1
    move v2, v7

    goto :goto_1

    .line 11
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lmg/d;

    .line 12
    invoke-static {v8, v2, v2, v3, v4}, Leh/w;->c(Lmg/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    :goto_1
    if-eqz v2, :cond_4

    .line 13
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    iget-object v2, p0, Lzg/g$f;->l:Lyg/g;

    invoke-virtual {v2}, Lyg/g;->a()Lyg/b;

    move-result-object v2

    invoke-virtual {v2}, Lyg/b;->h()Lwg/g;

    move-result-object v2

    iget-object v3, p0, Lzg/g$f;->k:Lzg/g;

    invoke-static {v3}, Lzg/g;->Q(Lzg/g;)Lch/g;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lwg/g;->d(Lch/l;Lmg/l;)V

    .line 15
    :cond_4
    iget-object v0, p0, Lzg/g$f;->l:Lyg/g;

    iget-object v2, p0, Lzg/g$f;->k:Lzg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v3

    invoke-virtual {v3}, Lyg/b;->w()Luh/f;

    move-result-object v3

    invoke-virtual {v2}, Lzg/g;->z0()Lmg/e;

    move-result-object v2

    invoke-interface {v3, v0, v2, v1}, Luh/f;->d(Lyg/g;Lmg/e;Ljava/util/List;)V

    .line 16
    iget-object v0, p0, Lzg/g$f;->l:Lyg/g;

    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->r()Ldh/l;

    move-result-object v0

    .line 17
    iget-object v2, p0, Lzg/g$f;->l:Lyg/g;

    .line 18
    iget-object v3, p0, Lzg/g$f;->k:Lzg/g;

    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 20
    invoke-static {v3}, Lzg/g;->M(Lzg/g;)Lmg/d;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/h;->m(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 21
    :cond_5
    invoke-virtual {v0, v2, v1}, Ldh/l;->g(Lyg/g;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
