.class final Lwg/i$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwg/i;-><init>(Lch/a;Lyg/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/Map<",
        "Llh/f;",
        "+",
        "Lrh/g<",
        "+",
        "Ljava/lang/Object;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Lwg/i;


# direct methods
.method constructor <init>(Lwg/i;)V
    .locals 0

    iput-object p1, p0, Lwg/i$a;->k:Lwg/i;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/g<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lwg/i$a;->k:Lwg/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lwg/b;->b()Lch/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lch/e;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lwg/d;->a:Lwg/d;

    .line 13
    .line 14
    iget-object v1, p0, Lwg/i$a;->k:Lwg/i;

    .line 15
    .line 16
    invoke-virtual {v1}, Lwg/b;->b()Lch/b;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lch/e;

    .line 21
    .line 22
    invoke-interface {v1}, Lch/e;->e()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lwg/d;->c(Ljava/util/List;)Lrh/g;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    instance-of v0, v0, Lch/m;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    sget-object v0, Lwg/d;->a:Lwg/d;

    .line 36
    .line 37
    iget-object v1, p0, Lwg/i$a;->k:Lwg/i;

    .line 38
    .line 39
    invoke-virtual {v1}, Lwg/b;->b()Lch/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lwg/d;->c(Ljava/util/List;)Lrh/g;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v0, v2

    .line 53
    :goto_0
    if-eqz v0, :cond_2

    .line 54
    .line 55
    sget-object v1, Lwg/c;->a:Lwg/c;

    .line 56
    .line 57
    invoke-virtual {v1}, Lwg/c;->d()Llh/f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, v0}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lmf/s;->e(Lkotlin/Pair;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :cond_2
    if-nez v2, :cond_3

    .line 70
    .line 71
    invoke-static {}, Lmf/s;->h()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_3
    return-object v2
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

    invoke-virtual {p0}, Lwg/i$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
