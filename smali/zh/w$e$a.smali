.class final Lzh/w$e$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzh/w$e;->a()Lci/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Lrh/g<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lzh/w;

.field final synthetic l:Lgh/n;

.field final synthetic m:Lbi/j;


# direct methods
.method constructor <init>(Lzh/w;Lgh/n;Lbi/j;)V
    .locals 0

    iput-object p1, p0, Lzh/w$e$a;->k:Lzh/w;

    iput-object p2, p0, Lzh/w$e$a;->l:Lgh/n;

    iput-object p3, p0, Lzh/w$e$a;->m:Lbi/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lrh/g;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lrh/g<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lzh/w$e$a;->k:Lzh/w;

    .line 2
    .line 3
    invoke-static {v0}, Lzh/w;->b(Lzh/w;)Lzh/m;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v0, v1}, Lzh/w;->a(Lzh/w;Lmg/m;)Lzh/z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lzh/w$e$a;->k:Lzh/w;

    .line 19
    .line 20
    invoke-static {v1}, Lzh/w;->b(Lzh/w;)Lzh/m;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lzh/m;->c()Lzh/k;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Lzh/k;->d()Lzh/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lzh/w$e$a;->l:Lgh/n;

    .line 33
    .line 34
    iget-object v3, p0, Lzh/w$e$a;->m:Lbi/j;

    .line 35
    .line 36
    invoke-virtual {v3}, Lpg/c0;->getReturnType()Ldi/g0;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "property.returnType"

    .line 41
    .line 42
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v1, v0, v2, v3}, Lzh/c;->g(Lzh/z;Lgh/n;Ldi/g0;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lrh/g;

    .line 50
    .line 51
    return-object v0
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

    invoke-virtual {p0}, Lzh/w$e$a;->a()Lrh/g;

    move-result-object v0

    return-object v0
.end method
