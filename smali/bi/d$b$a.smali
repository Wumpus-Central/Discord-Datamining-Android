.class final Lbi/d$b$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d$b;-><init>(Lbi/d;)V
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
        "Lmg/f1;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d;


# direct methods
.method constructor <init>(Lbi/d;)V
    .locals 0

    iput-object p1, p0, Lbi/d$b$a;->k:Lbi/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbi/d$b$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lbi/d$b$a;->k:Lbi/d;

    invoke-static {v0}, Lmg/g1;->d(Lmg/i;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
