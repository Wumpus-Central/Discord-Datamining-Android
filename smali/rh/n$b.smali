.class final Lrh/n$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/n;
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
        "Ldi/o0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lrh/n;


# direct methods
.method constructor <init>(Lrh/n;)V
    .locals 0

    iput-object p1, p0, Lrh/n$b;->k:Lrh/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lrh/n$b;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ldi/o0;

    .line 2
    iget-object v1, p0, Lrh/n$b;->k:Lrh/n;

    invoke-virtual {v1}, Lrh/n;->o()Ljg/h;

    move-result-object v1

    invoke-virtual {v1}, Ljg/h;->x()Lmg/e;

    move-result-object v1

    invoke-interface {v1}, Lmg/e;->s()Ldi/o0;

    move-result-object v1

    const-string v2, "builtIns.comparable.defaultType"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ldi/m1;

    sget-object v3, Ldi/w1;->p:Ldi/w1;

    iget-object v4, p0, Lrh/n$b;->k:Lrh/n;

    invoke-static {v4}, Lrh/n;->d(Lrh/n;)Ldi/o0;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ldi/m1;-><init>(Ldi/w1;Ldi/g0;)V

    invoke-static {v2}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Ldi/o1;->f(Ldi/o0;Ljava/util/List;Ldi/c1;ILjava/lang/Object;)Ldi/o0;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/h;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lrh/n$b;->k:Lrh/n;

    invoke-static {v1}, Lrh/n;->f(Lrh/n;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, Lrh/n$b;->k:Lrh/n;

    invoke-virtual {v1}, Lrh/n;->o()Ljg/h;

    move-result-object v1

    invoke-virtual {v1}, Ljg/h;->L()Ldi/o0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method
