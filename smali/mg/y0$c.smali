.class final Lmg/y0$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmg/y0;-><init>(Lmg/e;Lci/n;Lkotlin/jvm/functions/Function1;Lei/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/y0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lmg/y0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/y0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lmg/y0$c;->k:Lmg/y0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lwh/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lmg/y0$c;->k:Lmg/y0;

    invoke-static {v0}, Lmg/y0;->b(Lmg/y0;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    iget-object v1, p0, Lmg/y0$c;->k:Lmg/y0;

    invoke-static {v1}, Lmg/y0;->a(Lmg/y0;)Lei/g;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/h;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmg/y0$c;->a()Lwh/h;

    move-result-object v0

    return-object v0
.end method
