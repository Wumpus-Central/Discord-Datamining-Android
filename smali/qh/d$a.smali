.class final Lqh/d$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqh/d;->b(Ldi/k1;Lmg/f1;)Ldi/k1;
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
.field final synthetic k:Ldi/k1;


# direct methods
.method constructor <init>(Ldi/k1;)V
    .locals 0

    iput-object p1, p0, Lqh/d$a;->k:Ldi/k1;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ldi/g0;
    .locals 2

    iget-object v0, p0, Lqh/d$a;->k:Ldi/k1;

    invoke-interface {v0}, Ldi/k1;->getType()Ldi/g0;

    move-result-object v0

    const-string v1, "this@createCapturedIfNeeded.type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqh/d$a;->a()Ldi/g0;

    move-result-object v0

    return-object v0
.end method
