.class final Lpg/d$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpg/d;->F0()Ldi/o0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lei/g;",
        "Ldi/o0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lpg/d;


# direct methods
.method constructor <init>(Lpg/d;)V
    .locals 0

    iput-object p1, p0, Lpg/d$a;->k:Lpg/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lei/g;)Ldi/o0;
    .locals 1

    iget-object v0, p0, Lpg/d$a;->k:Lpg/d;

    invoke-virtual {p1, v0}, Lei/g;->f(Lmg/m;)Lmg/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lmg/h;->s()Ldi/o0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lei/g;

    invoke-virtual {p0, p1}, Lpg/d$a;->a(Lei/g;)Ldi/o0;

    move-result-object p1

    return-object p1
.end method
