.class final Lzh/a$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/a;-><init>(Lci/n;Lzh/u;Lmg/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Llh/c;",
        "Lmg/l0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/a;


# direct methods
.method constructor <init>(Lzh/a;)V
    .locals 0

    iput-object p1, p0, Lzh/a$a;->k:Lzh/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/c;)Lmg/l0;
    .locals 1

    .line 1
    const-string v0, "fqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzh/a$a;->k:Lzh/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lzh/a;->d(Llh/c;)Lzh/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lzh/a$a;->k:Lzh/a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lzh/a;->e()Lzh/k;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, Lzh/p;->L0(Lzh/k;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    return-object p1
    .line 26
    .line 27
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/c;

    invoke-virtual {p0, p1}, Lzh/a$a;->a(Llh/c;)Lmg/l0;

    move-result-object p1

    return-object p1
.end method
