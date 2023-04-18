.class final Lzh/w$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/w;->l(Lgh/n;)Lmg/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lci/j<",
        "+",
        "Lrh/g<",
        "*>;>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/w;

.field final synthetic l:Lgh/n;

.field final synthetic m:Lbi/j;


# direct methods
.method constructor <init>(Lzh/w;Lgh/n;Lbi/j;)V
    .locals 0

    iput-object p1, p0, Lzh/w$e;->k:Lzh/w;

    iput-object p2, p0, Lzh/w$e;->l:Lgh/n;

    iput-object p3, p0, Lzh/w$e;->m:Lbi/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lci/j;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lci/j<",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lzh/w$e;->k:Lzh/w;

    invoke-static {v0}, Lzh/w;->b(Lzh/w;)Lzh/m;

    move-result-object v0

    invoke-virtual {v0}, Lzh/m;->h()Lci/n;

    move-result-object v0

    new-instance v1, Lzh/w$e$a;

    iget-object v2, p0, Lzh/w$e;->k:Lzh/w;

    iget-object v3, p0, Lzh/w$e;->l:Lgh/n;

    iget-object v4, p0, Lzh/w$e;->m:Lbi/j;

    invoke-direct {v1, v2, v3, v4}, Lzh/w$e$a;-><init>(Lzh/w;Lgh/n;Lbi/j;)V

    invoke-interface {v0, v1}, Lci/n;->f(Lkotlin/jvm/functions/Function0;)Lci/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzh/w$e;->a()Lci/j;

    move-result-object v0

    return-object v0
.end method
