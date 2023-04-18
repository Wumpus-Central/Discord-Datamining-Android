.class final Ljg/j$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljg/j;-><init>(Lmg/h0;Lmg/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lwh/h;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/h0;


# direct methods
.method constructor <init>(Lmg/h0;)V
    .locals 0

    iput-object p1, p0, Ljg/j$c;->k:Lmg/h0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lwh/h;
    .locals 2

    iget-object v0, p0, Ljg/j$c;->k:Lmg/h0;

    sget-object v1, Ljg/k;->r:Llh/c;

    invoke-interface {v0, v1}, Lmg/h0;->G0(Llh/c;)Lmg/q0;

    move-result-object v0

    invoke-interface {v0}, Lmg/q0;->p()Lwh/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljg/j$c;->a()Lwh/h;

    move-result-object v0

    return-object v0
.end method
