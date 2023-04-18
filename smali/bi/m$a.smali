.class final Lbi/m$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/m;-><init>(Lzh/m;Lgh/s;I)V
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
.field final synthetic k:Lbi/m;


# direct methods
.method constructor <init>(Lbi/m;)V
    .locals 0

    iput-object p1, p0, Lbi/m$a;->k:Lbi/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi/m$a;->invoke()Ljava/util/List;

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
    iget-object v0, p0, Lbi/m$a;->k:Lbi/m;

    invoke-static {v0}, Lbi/m;->M0(Lbi/m;)Lzh/m;

    move-result-object v0

    invoke-virtual {v0}, Lzh/m;->c()Lzh/k;

    move-result-object v0

    invoke-virtual {v0}, Lzh/k;->d()Lzh/c;

    move-result-object v0

    iget-object v1, p0, Lbi/m$a;->k:Lbi/m;

    invoke-virtual {v1}, Lbi/m;->O0()Lgh/s;

    move-result-object v1

    iget-object v2, p0, Lbi/m$a;->k:Lbi/m;

    invoke-static {v2}, Lbi/m;->M0(Lbi/m;)Lzh/m;

    move-result-object v2

    invoke-virtual {v2}, Lzh/m;->g()Lih/c;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lzh/f;->j(Lgh/s;Lih/c;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
