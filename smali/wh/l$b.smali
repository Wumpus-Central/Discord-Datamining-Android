.class final Lwh/l$b;
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
        "Lmg/u0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lwh/l;


# direct methods
.method constructor <init>(Lwh/l;)V
    .locals 0

    iput-object p1, p0, Lwh/l$b;->k:Lwh/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lwh/l$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/u0;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lwh/l$b;->k:Lwh/l;

    invoke-static {v0}, Lwh/l;->h(Lwh/l;)Lmg/e;

    move-result-object v0

    invoke-static {v0}, Lph/d;->f(Lmg/e;)Lmg/u0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->m(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
