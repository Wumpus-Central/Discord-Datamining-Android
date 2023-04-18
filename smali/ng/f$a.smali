.class final Lng/f$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lng/f;->a(Ljg/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lng/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/h0;",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ljg/h;


# direct methods
.method constructor <init>(Ljg/h;)V
    .locals 0

    iput-object p1, p0, Lng/f$a;->k:Ljg/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lmg/h0;)Ldi/g0;
    .locals 2

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lmg/h0;->o()Ljg/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Ldi/w1;->o:Ldi/w1;

    .line 11
    .line 12
    iget-object v1, p0, Lng/f$a;->k:Ljg/h;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljg/h;->W()Ldi/o0;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1, v0, v1}, Ljg/h;->l(Ldi/w1;Ldi/g0;)Ldi/o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "module.builtIns.getArray\u2026ce.INVARIANT, stringType)"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/h0;

    invoke-virtual {p0, p1}, Lng/f$a;->a(Lmg/h0;)Ldi/g0;

    move-result-object p1

    return-object p1
.end method
