.class final Lwh/l$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/l;-><init>(Lci/n;Lmg/e;)V
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
        "Lmg/z0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lwh/l;


# direct methods
.method constructor <init>(Lwh/l;)V
    .locals 0

    iput-object p1, p0, Lwh/l$a;->k:Lwh/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/l$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lmg/z0;

    .line 2
    iget-object v1, p0, Lwh/l$a;->k:Lwh/l;

    invoke-static {v1}, Lwh/l;->h(Lwh/l;)Lmg/e;

    move-result-object v1

    invoke-static {v1}, Lph/d;->g(Lmg/e;)Lmg/z0;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lwh/l$a;->k:Lwh/l;

    invoke-static {v1}, Lwh/l;->h(Lwh/l;)Lmg/e;

    move-result-object v1

    invoke-static {v1}, Lph/d;->h(Lmg/e;)Lmg/z0;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
