.class final Lph/k$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lph/k;->q(Lmg/b;Ljava/util/Queue;Lph/j;)Ljava/util/Collection;
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lph/j;

.field final synthetic l:Lmg/b;


# direct methods
.method constructor <init>(Lph/j;Lmg/b;)V
    .locals 0

    iput-object p1, p0, Lph/k$g;->k:Lph/j;

    iput-object p2, p0, Lph/k$g;->l:Lmg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lmg/b;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-object v0, p0, Lph/k$g;->k:Lph/j;

    .line 2
    .line 3
    iget-object v1, p0, Lph/k$g;->l:Lmg/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lph/j;->b(Lmg/b;Lmg/b;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

    check-cast p1, Lmg/b;

    invoke-virtual {p0, p1}, Lph/k$g;->a(Lmg/b;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
