.class final Lzg/g$i;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/g;->C0(Lmg/z0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Llh/f;",
        "Ljava/util/Collection<",
        "+",
        "Lmg/z0;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lmg/z0;

.field final synthetic l:Lzg/g;


# direct methods
.method constructor <init>(Lmg/z0;Lzg/g;)V
    .locals 0

    iput-object p1, p0, Lzg/g$i;->k:Lmg/z0;

    iput-object p2, p0, Lzg/g$i;->l:Lzg/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/f;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            ")",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "accessorName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzg/g$i;->k:Lmg/z0;

    .line 7
    .line 8
    invoke-interface {v0}, Lmg/j0;->getName()Llh/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lzg/g$i;->k:Lmg/z0;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lzg/g$i;->l:Lzg/g;

    .line 26
    .line 27
    invoke-static {v0, p1}, Lzg/g;->T(Lzg/g;Llh/f;)Ljava/util/Collection;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, Lzg/g$i;->l:Lzg/g;

    .line 32
    .line 33
    invoke-static {v1, p1}, Lzg/g;->U(Lzg/g;Llh/f;)Ljava/util/Collection;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {v0, p1}, Lkotlin/collections/h;->o0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Llh/f;

    invoke-virtual {p0, p1}, Lzg/g$i;->a(Llh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
