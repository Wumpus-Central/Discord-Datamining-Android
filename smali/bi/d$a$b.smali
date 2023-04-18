.class final Lbi/d$a$b;
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
        "Lmg/m;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d$a;


# direct methods
.method constructor <init>(Lbi/d$a;)V
    .locals 0

    iput-object p1, p0, Lbi/d$a$b;->k:Lbi/d$a;

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

    iget-object v0, p0, Lbi/d$a$b;->k:Lbi/d$a;

    sget-object v1, Lwh/d;->o:Lwh/d;

    sget-object v2, Lwh/h;->a:Lwh/h$a;

    invoke-virtual {v2}, Lwh/h$a;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    sget-object v3, Lug/d;->w:Lug/d;

    invoke-virtual {v0, v1, v2, v3}, Lbi/h;->j(Lwh/d;Lkotlin/jvm/functions/Function1;Lug/b;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/d$a$b;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
