.class final Lbi/h$b$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/h$b;-><init>(Lbi/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
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
.field final synthetic k:Lbi/h$b;


# direct methods
.method constructor <init>(Lbi/h$b;)V
    .locals 0

    iput-object p1, p0, Lbi/h$b$a;->k:Lbi/h$b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi/h$b$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lbi/h$b$a;->k:Lbi/h$b;

    invoke-static {v0}, Lbi/h$b;->p(Lbi/h$b;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lbi/h$b$a;->k:Lbi/h$b;

    invoke-static {v1}, Lbi/h$b;->h(Lbi/h$b;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
