.class final Lwh/e$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/e;-><init>(Lci/n;Lmg/e;)V
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
        "Lmg/m;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lwh/e;


# direct methods
.method constructor <init>(Lwh/e;)V
    .locals 0

    iput-object p1, p0, Lwh/e$a;->k:Lwh/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/e$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/m;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lwh/e$a;->k:Lwh/e;

    invoke-virtual {v0}, Lwh/e;->i()Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lwh/e$a;->k:Lwh/e;

    invoke-static {v1, v0}, Lwh/e;->h(Lwh/e;Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
