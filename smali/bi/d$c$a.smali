.class final Lbi/d$c$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbi/d$c;-><init>(Lbi/d;)V
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
        "Lmg/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Lbi/d$c;

.field final synthetic l:Lbi/d;


# direct methods
.method constructor <init>(Lbi/d$c;Lbi/d;)V
    .locals 0

    iput-object p1, p0, Lbi/d$c$a;->k:Lbi/d$c;

    iput-object p2, p0, Lbi/d$c$a;->l:Lbi/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Llh/f;)Lmg/e;
    .locals 7

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbi/d$c$a;->k:Lbi/d$c;

    .line 7
    .line 8
    invoke-static {v0}, Lbi/d$c;->b(Lbi/d$c;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lgh/g;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lbi/d$c$a;->l:Lbi/d;

    .line 21
    .line 22
    iget-object v1, p0, Lbi/d$c$a;->k:Lbi/d$c;

    .line 23
    .line 24
    invoke-virtual {v2}, Lbi/d;->a1()Lzh/m;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Lzh/m;->h()Lci/n;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-static {v1}, Lbi/d$c;->c(Lbi/d$c;)Lci/i;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-instance v5, Lbi/a;

    .line 37
    .line 38
    invoke-virtual {v2}, Lbi/d;->a1()Lzh/m;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Lzh/m;->h()Lci/n;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v6, Lbi/d$c$a$a;

    .line 47
    .line 48
    invoke-direct {v6, v2, v0}, Lbi/d$c$a$a;-><init>(Lbi/d;Lgh/g;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v5, v1, v6}, Lbi/a;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    sget-object v6, Lmg/a1;->a:Lmg/a1;

    .line 55
    .line 56
    move-object v1, v3

    .line 57
    move-object v3, p1

    .line 58
    invoke-static/range {v1 .. v6}, Lpg/n;->L0(Lci/n;Lmg/e;Llh/f;Lci/i;Lng/g;Lmg/a1;)Lpg/n;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    :goto_0
    return-object p1
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

    invoke-virtual {p0, p1}, Lbi/d$c$a;->a(Llh/f;)Lmg/e;

    move-result-object p1

    return-object p1
.end method
