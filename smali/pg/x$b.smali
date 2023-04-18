.class final Lpg/x$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/x;-><init>(Llh/f;Lci/n;Ljg/h;Lmh/a;Ljava/util/Map;Llh/f;)V
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
        "Lmg/q0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/x;


# direct methods
.method constructor <init>(Lpg/x;)V
    .locals 0

    iput-object p1, p0, Lpg/x$b;->k:Lpg/x;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/c;)Lmg/q0;
    .locals 3

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lpg/x$b;->k:Lpg/x;

    .line 7
    .line 8
    invoke-static {v0}, Lpg/x;->L0(Lpg/x;)Lpg/a0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lpg/x$b;->k:Lpg/x;

    .line 13
    .line 14
    invoke-static {v1}, Lpg/x;->M0(Lpg/x;)Lci/n;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v1, p1, v2}, Lpg/a0;->a(Lpg/x;Llh/c;Lci/n;)Lmg/q0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/c;

    invoke-virtual {p0, p1}, Lpg/x$b;->a(Llh/c;)Lmg/q0;

    move-result-object p1

    return-object p1
.end method
