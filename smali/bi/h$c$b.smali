.class final Lbi/h$c$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/h$c;-><init>(Lbi/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Set<",
        "+",
        "Llh/f;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/h$c;

.field final synthetic l:Lbi/h;


# direct methods
.method constructor <init>(Lbi/h$c;Lbi/h;)V
    .locals 0

    iput-object p1, p0, Lbi/h$c$b;->k:Lbi/h$c;

    iput-object p2, p0, Lbi/h$c$b;->l:Lbi/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/h$c$b;->k:Lbi/h$c;

    invoke-static {v0}, Lbi/h$c;->k(Lbi/h$c;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lbi/h$c$b;->l:Lbi/h;

    invoke-virtual {v1}, Lbi/h;->t()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/u;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/h$c$b;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
