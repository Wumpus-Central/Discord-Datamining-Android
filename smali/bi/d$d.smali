.class final Lbi/d$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d;-><init>(Lzh/m;Lgh/c;Lih/c;Lih/a;Lmg/a1;)V
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


# direct methods
.method constructor <init>(Lbi/d;)V
    .locals 0

    iput-object p1, p0, Lbi/d$d;->k:Lbi/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi/d$d;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lng/c;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lbi/d$d;->k:Lbi/d;

    invoke-virtual {v0}, Lbi/d;->a1()Lzh/m;

    move-result-object v0

    invoke-virtual {v0}, Lzh/m;->c()Lzh/k;

    move-result-object v0

    invoke-virtual {v0}, Lzh/k;->d()Lzh/c;

    move-result-object v0

    iget-object v1, p0, Lbi/d$d;->k:Lbi/d;

    invoke-virtual {v1}, Lbi/d;->f1()Lzh/z$a;

    move-result-object v1

    invoke-interface {v0, v1}, Lzh/f;->d(Lzh/z$a;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
