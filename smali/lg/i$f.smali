.class final Llg/i$f;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/i;->m(Lmg/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lmg/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzg/f;

.field final synthetic l:Lmg/e;


# direct methods
.method constructor <init>(Lzg/f;Lmg/e;)V
    .locals 0

    iput-object p1, p0, Llg/i$f;->k:Lzg/f;

    iput-object p2, p0, Llg/i$f;->l:Lmg/e;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lmg/e;
    .locals 3

    .line 1
    iget-object v0, p0, Llg/i$f;->k:Lzg/f;

    .line 2
    .line 3
    sget-object v1, Lwg/g;->a:Lwg/g;

    .line 4
    .line 5
    const-string v2, "EMPTY"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Llg/i$f;->l:Lmg/e;

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lzg/f;->N0(Lwg/g;Lmg/e;)Lzg/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Llg/i$f;->a()Lmg/e;

    move-result-object v0

    return-object v0
.end method
