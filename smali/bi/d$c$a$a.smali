.class final Lbi/d$c$a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d$c$a;->a(Llh/f;)Lmg/e;
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
.field final synthetic k:Lbi/d;

.field final synthetic l:Lgh/g;


# direct methods
.method constructor <init>(Lbi/d;Lgh/g;)V
    .locals 0

    iput-object p1, p0, Lbi/d$c$a$a;->k:Lbi/d;

    iput-object p2, p0, Lbi/d$c$a$a;->l:Lgh/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi/d$c$a$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lbi/d$c$a$a;->k:Lbi/d;

    invoke-virtual {v0}, Lbi/d;->a1()Lzh/m;

    move-result-object v0

    invoke-virtual {v0}, Lzh/m;->c()Lzh/k;

    move-result-object v0

    invoke-virtual {v0}, Lzh/k;->d()Lzh/c;

    move-result-object v0

    iget-object v1, p0, Lbi/d$c$a$a;->k:Lbi/d;

    invoke-virtual {v1}, Lbi/d;->f1()Lzh/z$a;

    move-result-object v1

    iget-object v2, p0, Lbi/d$c$a$a;->l:Lgh/g;

    invoke-interface {v0, v1, v2}, Lzh/f;->a(Lzh/z;Lgh/g;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
