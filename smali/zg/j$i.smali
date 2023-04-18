.class final Lzg/j$i;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzg/j;-><init>(Lyg/g;Lzg/j;)V
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
.field final synthetic k:Lzg/j;


# direct methods
.method constructor <init>(Lzg/j;)V
    .locals 0

    iput-object p1, p0, Lzg/j$i;->k:Lzg/j;

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
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    iget-object v1, p0, Lzg/j$i;->k:Lzg/j;

    .line 9
    .line 10
    invoke-static {v1}, Lzg/j;->i(Lzg/j;)Lci/g;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/util/Collection;

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lzg/j$i;->k:Lzg/j;

    .line 24
    .line 25
    invoke-static {v1, v0}, Lzg/j;->k(Lzg/j;Ljava/util/Set;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lzg/j$i;->k:Lzg/j;

    .line 29
    .line 30
    invoke-virtual {v1, v0, p1}, Lzg/j;->r(Ljava/util/Collection;Llh/f;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lzg/j$i;->k:Lzg/j;

    .line 34
    .line 35
    invoke-virtual {p1}, Lzg/j;->w()Lyg/g;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Lyg/b;->r()Ldh/l;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object v1, p0, Lzg/j$i;->k:Lzg/j;

    .line 48
    .line 49
    invoke-virtual {v1}, Lzg/j;->w()Lyg/g;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p1, v1, v0}, Ldh/l;->g(Lyg/g;Ljava/util/Collection;)Ljava/util/Collection;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
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

    invoke-virtual {p0, p1}, Lzg/j$i;->a(Llh/f;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
