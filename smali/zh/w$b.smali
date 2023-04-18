.class final Lzh/w$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/w;->f(Lgh/n;Z)Lng/g;
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
        "Lng/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/w;

.field final synthetic l:Z

.field final synthetic m:Lgh/n;


# direct methods
.method constructor <init>(Lzh/w;ZLgh/n;)V
    .locals 0

    iput-object p1, p0, Lzh/w$b;->k:Lzh/w;

    iput-boolean p2, p0, Lzh/w$b;->l:Z

    iput-object p3, p0, Lzh/w$b;->m:Lgh/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzh/w$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lzh/w$b;->k:Lzh/w;

    invoke-static {v0}, Lzh/w;->b(Lzh/w;)Lzh/m;

    move-result-object v1

    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    move-result-object v1

    invoke-static {v0, v1}, Lzh/w;->a(Lzh/w;Lmg/m;)Lzh/z;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lzh/w$b;->l:Z

    iget-object v2, p0, Lzh/w$b;->k:Lzh/w;

    iget-object v3, p0, Lzh/w$b;->m:Lgh/n;

    if-eqz v1, :cond_0

    .line 3
    invoke-static {v2}, Lzh/w;->b(Lzh/w;)Lzh/m;

    move-result-object v1

    invoke-virtual {v1}, Lzh/m;->c()Lzh/k;

    move-result-object v1

    invoke-virtual {v1}, Lzh/k;->d()Lzh/c;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Lzh/f;->e(Lzh/z;Lgh/n;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {v2}, Lzh/w;->b(Lzh/w;)Lzh/m;

    move-result-object v1

    invoke-virtual {v1}, Lzh/m;->c()Lzh/k;

    move-result-object v1

    invoke-virtual {v1}, Lzh/k;->d()Lzh/c;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Lzh/f;->f(Lzh/z;Lgh/n;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 5
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    :cond_2
    return-object v0
.end method
