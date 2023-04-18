.class final Ldi/j0$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/j0;->U0(Lei/g;)Ldi/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ldi/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lei/g;

.field final synthetic l:Ldi/j0;


# direct methods
.method constructor <init>(Lei/g;Ldi/j0;)V
    .locals 0

    iput-object p1, p0, Ldi/j0$a;->k:Lei/g;

    iput-object p2, p0, Ldi/j0$a;->l:Ldi/j0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/g0;
    .locals 2

    iget-object v0, p0, Ldi/j0$a;->k:Lei/g;

    iget-object v1, p0, Ldi/j0$a;->l:Ldi/j0;

    invoke-static {v1}, Ldi/j0;->T0(Ldi/j0;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhi/i;

    invoke-virtual {v0, v1}, Lei/g;->h(Lhi/i;)Ldi/g0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ldi/j0$a;->a()Ldi/g0;

    move-result-object v0

    return-object v0
.end method
