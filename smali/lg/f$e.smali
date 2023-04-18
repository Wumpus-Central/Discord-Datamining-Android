.class final Llg/f$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/f;->I0(Lmg/h0;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Llg/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/h0;

.field final synthetic l:Z


# direct methods
.method constructor <init>(Lmg/h0;Z)V
    .locals 0

    iput-object p1, p0, Llg/f$e;->k:Lmg/h0;

    iput-boolean p2, p0, Llg/f$e;->l:Z

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Llg/f$b;
    .locals 3

    new-instance v0, Llg/f$b;

    iget-object v1, p0, Llg/f$e;->k:Lmg/h0;

    iget-boolean v2, p0, Llg/f$e;->l:Z

    invoke-direct {v0, v1, v2}, Llg/f$b;-><init>(Lmg/h0;Z)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llg/f$e;->a()Llg/f$b;

    move-result-object v0

    return-object v0
.end method
