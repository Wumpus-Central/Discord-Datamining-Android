.class final Lwh/m$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwh/m;-><init>(Lwh/h;Ldi/p1;)V
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
        "Lmg/m;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lwh/m;


# direct methods
.method constructor <init>(Lwh/m;)V
    .locals 0

    iput-object p1, p0, Lwh/m$a;->k:Lwh/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/m;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lwh/m$a;->k:Lwh/m;

    invoke-static {v0}, Lwh/m;->h(Lwh/m;)Lwh/h;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-static {v1, v2, v2, v3, v2}, Lwh/k$a;->a(Lwh/k;Lwh/d;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    invoke-static {v0, v1}, Lwh/m;->i(Lwh/m;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwh/m$a;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
