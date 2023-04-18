.class final Lpg/r$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/r;-><init>(Lpg/x;Llh/c;Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/r;


# direct methods
.method constructor <init>(Lpg/r;)V
    .locals 0

    iput-object p1, p0, Lpg/r$a;->k:Lpg/r;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 2

    .line 2
    iget-object v0, p0, Lpg/r$a;->k:Lpg/r;

    invoke-virtual {v0}, Lpg/r;->K0()Lpg/x;

    move-result-object v0

    invoke-virtual {v0}, Lpg/x;->Q0()Lmg/m0;

    move-result-object v0

    iget-object v1, p0, Lpg/r$a;->k:Lpg/r;

    invoke-virtual {v1}, Lpg/r;->d()Llh/c;

    move-result-object v1

    invoke-static {v0, v1}, Lmg/o0;->b(Lmg/m0;Llh/c;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg/r$a;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
