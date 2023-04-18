.class public final Lng/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/c;


# instance fields
.field private final a:Ljg/h;

.field private final b:Llh/c;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final d:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Ljg/h;Llh/c;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljg/h;",
            "Llh/c;",
            "Ljava/util/Map<",
            "Llh/f;",
            "+",
            "Lrh/g<",
            "*>;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "builtIns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "allValueArguments"

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
    iput-object p1, p0, Lng/j;->a:Ljg/h;

    .line 20
    .line 21
    iput-object p2, p0, Lng/j;->b:Llh/c;

    .line 22
    .line 23
    iput-object p3, p0, Lng/j;->c:Ljava/util/Map;

    .line 24
    .line 25
    sget-object p1, Llf/p;->l:Llf/p;

    .line 26
    .line 27
    new-instance p2, Lng/j$a;

    .line 28
    .line 29
    invoke-direct {p2, p0}, Lng/j$a;-><init>(Lng/j;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lng/j;->d:Lkotlin/Lazy;

    .line 37
    .line 38
    return-void
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

.method public static final synthetic b(Lng/j;)Ljg/h;
    .locals 0

    iget-object p0, p0, Lng/j;->a:Ljg/h;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Llh/f;",
            "Lrh/g<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lng/j;->c:Ljava/util/Map;

    return-object v0
.end method

.method public d()Llh/c;
    .locals 1

    iget-object v0, p0, Lng/j;->b:Llh/c;

    return-object v0
.end method

.method public getType()Ldi/g0;
    .locals 2

    iget-object v0, p0, Lng/j;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-type>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ldi/g0;

    return-object v0
.end method

.method public j()Lmg/a1;
    .locals 2

    sget-object v0, Lmg/a1;->a:Lmg/a1;

    const-string v1, "NO_SOURCE"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
