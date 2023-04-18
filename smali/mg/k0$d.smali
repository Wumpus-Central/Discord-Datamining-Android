.class final Lmg/k0$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/k0;-><init>(Lci/n;Lmg/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Llh/c;",
        "Lmg/l0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/k0;


# direct methods
.method constructor <init>(Lmg/k0;)V
    .locals 0

    iput-object p1, p0, Lmg/k0$d;->k:Lmg/k0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/c;)Lmg/l0;
    .locals 2

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lpg/m;

    .line 7
    .line 8
    iget-object v1, p0, Lmg/k0$d;->k:Lmg/k0;

    .line 9
    .line 10
    invoke-static {v1}, Lmg/k0;->a(Lmg/k0;)Lmg/h0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1, p1}, Lpg/m;-><init>(Lmg/h0;Llh/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/c;

    invoke-virtual {p0, p1}, Lmg/k0$d;->a(Llh/c;)Lmg/l0;

    move-result-object p1

    return-object p1
.end method
