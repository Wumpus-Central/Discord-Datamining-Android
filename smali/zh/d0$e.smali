.class final Lzh/d0$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/d0;->t(Lzh/d0;Lgh/q;I)Lmg/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lgh/q;",
        "Lgh/q;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/d0;


# direct methods
.method constructor <init>(Lzh/d0;)V
    .locals 0

    iput-object p1, p0, Lzh/d0$e;->k:Lzh/d0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lgh/q;)Lgh/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzh/d0$e;->k:Lzh/d0;

    .line 7
    .line 8
    invoke-static {v0}, Lzh/d0;->c(Lzh/d0;)Lzh/m;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lzh/m;->j()Lih/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lih/f;->j(Lgh/q;Lih/g;)Lgh/q;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

    check-cast p1, Lgh/q;

    invoke-virtual {p0, p1}, Lzh/d0$e;->a(Lgh/q;)Lgh/q;

    move-result-object p1

    return-object p1
.end method
