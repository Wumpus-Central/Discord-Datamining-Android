.class final Lzg/l$b;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/l;->s(Llh/f;Ljava/util/Collection;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lwh/h;",
        "Ljava/util/Collection<",
        "+",
        "Lmg/u0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Llh/f;


# direct methods
.method constructor <init>(Llh/f;)V
    .locals 0

    iput-object p1, p0, Lzg/l$b;->k:Llh/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lwh/h;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/h;",
            ")",
            "Ljava/util/Collection<",
            "+",
            "Lmg/u0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzg/l$b;->k:Llh/f;

    .line 7
    .line 8
    sget-object v1, Lug/d;->y:Lug/d;

    .line 9
    .line 10
    invoke-interface {p1, v0, v1}, Lwh/h;->d(Llh/f;Lug/b;)Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
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

    check-cast p1, Lwh/h;

    invoke-virtual {p0, p1}, Lzg/l$b;->a(Lwh/h;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
