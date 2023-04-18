.class final Lph/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lph/k;->b(Ljava/util/Collection;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Lmg/b;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/m;


# direct methods
.method constructor <init>(Lmg/m;)V
    .locals 0

    iput-object p1, p0, Lph/k$c;->k:Lmg/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmg/b;)Ljava/lang/Boolean;
    .locals 1

    invoke-interface {p1}, Lmg/n;->b()Lmg/m;

    move-result-object p1

    iget-object v0, p0, Lph/k$c;->k:Lmg/m;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmg/b;

    invoke-virtual {p0, p1}, Lph/k$c;->a(Lmg/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
