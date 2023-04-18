.class final Lzh/q$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/q;-><init>(Llh/c;Lci/n;Lmg/h0;Lgh/m;Lih/a;Lbi/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Llh/b;",
        "Lmg/a1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/q;


# direct methods
.method constructor <init>(Lzh/q;)V
    .locals 0

    iput-object p1, p0, Lzh/q$a;->k:Lzh/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/b;)Lmg/a1;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lzh/q$a;->k:Lzh/q;

    .line 7
    .line 8
    invoke-static {p1}, Lzh/q;->M0(Lzh/q;)Lbi/f;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object p1, Lmg/a1;->a:Lmg/a1;

    .line 16
    .line 17
    const-string v0, "NO_SOURCE"

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    return-object p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/b;

    invoke-virtual {p0, p1}, Lzh/q$a;->a(Llh/b;)Lmg/a1;

    move-result-object p1

    return-object p1
.end method
