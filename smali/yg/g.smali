.class public final Lyg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lyg/b;

.field private final b:Lyg/k;

.field private final c:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Lvg/y;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lkotlin/Lazy;

.field private final e:Lah/d;


# direct methods
.method public constructor <init>(Lyg/b;Lyg/k;Lkotlin/Lazy;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg/b;",
            "Lyg/k;",
            "Lkotlin/Lazy<",
            "Lvg/y;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "delegateForDefaultTypeQualifiers"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyg/g;->a:Lyg/b;

    .line 20
    .line 21
    iput-object p2, p0, Lyg/g;->b:Lyg/k;

    .line 22
    .line 23
    iput-object p3, p0, Lyg/g;->c:Lkotlin/Lazy;

    .line 24
    .line 25
    iput-object p3, p0, Lyg/g;->d:Lkotlin/Lazy;

    .line 26
    .line 27
    new-instance p1, Lah/d;

    .line 28
    .line 29
    invoke-direct {p1, p0, p2}, Lah/d;-><init>(Lyg/g;Lyg/k;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lyg/g;->e:Lah/d;

    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method


# virtual methods
.method public final a()Lyg/b;
    .locals 1

    iget-object v0, p0, Lyg/g;->a:Lyg/b;

    return-object v0
.end method

.method public final b()Lvg/y;
    .locals 1

    iget-object v0, p0, Lyg/g;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvg/y;

    return-object v0
.end method

.method public final c()Lkotlin/Lazy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/Lazy<",
            "Lvg/y;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyg/g;->c:Lkotlin/Lazy;

    return-object v0
.end method

.method public final d()Lmg/h0;
    .locals 1

    iget-object v0, p0, Lyg/g;->a:Lyg/b;

    invoke-virtual {v0}, Lyg/b;->m()Lmg/h0;

    move-result-object v0

    return-object v0
.end method

.method public final e()Lci/n;
    .locals 1

    iget-object v0, p0, Lyg/g;->a:Lyg/b;

    invoke-virtual {v0}, Lyg/b;->u()Lci/n;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lyg/k;
    .locals 1

    iget-object v0, p0, Lyg/g;->b:Lyg/k;

    return-object v0
.end method

.method public final g()Lah/d;
    .locals 1

    iget-object v0, p0, Lyg/g;->e:Lah/d;

    return-object v0
.end method
