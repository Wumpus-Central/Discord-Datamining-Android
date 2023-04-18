.class final Lbi/d$f;
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
        "Ljava/util/Collection<",
        "+",
        "Lmg/d;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d;


# direct methods
.method constructor <init>(Lbi/d;)V
    .locals 0

    iput-object p1, p0, Lbi/d$f;->k:Lbi/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d$f;->k:Lbi/d;

    invoke-static {v0}, Lbi/d;->L0(Lbi/d;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/d$f;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
