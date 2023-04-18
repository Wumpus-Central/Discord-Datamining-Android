.class final Lzh/w$f;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/w;->o(Ljava/util/List;Lnh/q;Lzh/b;)Ljava/util/List;
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

.field final synthetic l:Lzh/z;

.field final synthetic m:Lnh/q;

.field final synthetic n:Lzh/b;

.field final synthetic o:I

.field final synthetic p:Lgh/u;


# direct methods
.method constructor <init>(Lzh/w;Lzh/z;Lnh/q;Lzh/b;ILgh/u;)V
    .locals 0

    iput-object p1, p0, Lzh/w$f;->k:Lzh/w;

    iput-object p2, p0, Lzh/w$f;->l:Lzh/z;

    iput-object p3, p0, Lzh/w$f;->m:Lnh/q;

    iput-object p4, p0, Lzh/w$f;->n:Lzh/b;

    iput p5, p0, Lzh/w$f;->o:I

    iput-object p6, p0, Lzh/w$f;->p:Lgh/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzh/w$f;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lzh/w$f;->k:Lzh/w;

    invoke-static {v0}, Lzh/w;->b(Lzh/w;)Lzh/m;

    move-result-object v0

    invoke-virtual {v0}, Lzh/m;->c()Lzh/k;

    move-result-object v0

    invoke-virtual {v0}, Lzh/k;->d()Lzh/c;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lzh/w$f;->l:Lzh/z;

    iget-object v3, p0, Lzh/w$f;->m:Lnh/q;

    iget-object v4, p0, Lzh/w$f;->n:Lzh/b;

    iget v5, p0, Lzh/w$f;->o:I

    iget-object v6, p0, Lzh/w$f;->p:Lgh/u;

    invoke-interface/range {v1 .. v6}, Lzh/f;->h(Lzh/z;Lnh/q;Lzh/b;ILgh/u;)Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
