.class final Lbi/d$a$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d$a;-><init>(Lbi/d;Lei/g;)V
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
        "Ldi/g0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d$a;


# direct methods
.method constructor <init>(Lbi/d$a;)V
    .locals 0

    iput-object p1, p0, Lbi/d$a$d;->k:Lbi/d$a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldi/g0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbi/d$a$d;->k:Lbi/d$a;

    invoke-static {v0}, Lbi/d$a;->z(Lbi/d$a;)Lei/g;

    move-result-object v0

    iget-object v1, p0, Lbi/d$a$d;->k:Lbi/d$a;

    invoke-static {v1}, Lbi/d$a;->y(Lbi/d$a;)Lbi/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lei/g;->g(Lmg/e;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/d$a$d;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
