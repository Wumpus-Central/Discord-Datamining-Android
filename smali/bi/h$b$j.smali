.class final Lbi/h$b$j;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/h$b;-><init>(Lbi/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Set<",
        "+",
        "Llh/f;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/h$b;

.field final synthetic l:Lbi/h;


# direct methods
.method constructor <init>(Lbi/h$b;Lbi/h;)V
    .locals 0

    iput-object p1, p0, Lbi/h$b$j;->k:Lbi/h$b;

    iput-object p2, p0, Lbi/h$b$j;->l:Lbi/h;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbi/h$b$j;->k:Lbi/h$b;

    .line 2
    .line 3
    invoke-static {v0}, Lbi/h$b;->s(Lbi/h$b;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lbi/h$b;->n:Lbi/h;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lnh/q;

    .line 29
    .line 30
    invoke-virtual {v0}, Lbi/h;->p()Lzh/m;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Lzh/m;->g()Lih/c;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v3, Lgh/n;

    .line 39
    .line 40
    invoke-virtual {v3}, Lgh/n;->d0()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v4, v3}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v0, p0, Lbi/h$b$j;->l:Lbi/h;

    .line 53
    .line 54
    invoke-virtual {v0}, Lbi/h;->u()Ljava/util/Set;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v2, v0}, Lkotlin/collections/u;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbi/h$b$j;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
