.class public Lwg/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lng/c;
.implements Lxg/g;


# static fields
.field static final synthetic f:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Llh/c;

.field private final b:Lmg/a1;

.field private final c:Lci/i;

.field private final d:Lch/b;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 5
    .line 6
    const-class v2, Lwg/b;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "type"

    .line 13
    .line 14
    const-string v4, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v1, v0, v2

    .line 25
    .line 26
    sput-object v0, Lwg/b;->f:[Lkotlin/reflect/KProperty;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
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
.end method

.method public constructor <init>(Lyg/g;Lch/a;Llh/c;)V
    .locals 1

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p3, p0, Lwg/b;->a:Llh/c;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p3}, Lyg/b;->t()Lbh/b;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-interface {p3, p2}, Lbh/b;->a(Lch/l;)Lbh/a;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object p3, Lmg/a1;->a:Lmg/a1;

    .line 34
    .line 35
    const-string v0, "NO_SOURCE"

    .line 36
    .line 37
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-object p3, p0, Lwg/b;->b:Lmg/a1;

    .line 41
    .line 42
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    new-instance v0, Lwg/b$a;

    .line 47
    .line 48
    invoke-direct {v0, p1, p0}, Lwg/b$a;-><init>(Lyg/g;Lwg/b;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p3, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lwg/b;->c:Lci/i;

    .line 56
    .line 57
    if-eqz p2, :cond_1

    .line 58
    .line 59
    invoke-interface {p2}, Lch/a;->e()Ljava/util/Collection;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-static {p1}, Lkotlin/collections/h;->V(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lch/b;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const/4 p1, 0x0

    .line 73
    :goto_1
    iput-object p1, p0, Lwg/b;->d:Lch/b;

    .line 74
    .line 75
    const/4 p1, 0x0

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    invoke-interface {p2}, Lch/a;->g()Z

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    const/4 p3, 0x1

    .line 83
    if-ne p2, p3, :cond_2

    .line 84
    .line 85
    move p1, p3

    .line 86
    :cond_2
    iput-boolean p1, p0, Lwg/b;->e:Z

    .line 87
    .line 88
    return-void
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

    invoke-static {}, Lmf/s;->h()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method protected final b()Lch/b;
    .locals 1

    iget-object v0, p0, Lwg/b;->d:Lch/b;

    return-object v0
.end method

.method public c()Ldi/o0;
    .locals 3

    iget-object v0, p0, Lwg/b;->c:Lci/i;

    sget-object v1, Lwg/b;->f:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldi/o0;

    return-object v0
.end method

.method public d()Llh/c;
    .locals 1

    iget-object v0, p0, Lwg/b;->a:Llh/c;

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lwg/b;->e:Z

    return v0
.end method

.method public bridge synthetic getType()Ldi/g0;
    .locals 1

    invoke-virtual {p0}, Lwg/b;->c()Ldi/o0;

    move-result-object v0

    return-object v0
.end method

.method public j()Lmg/a1;
    .locals 1

    iget-object v0, p0, Lwg/b;->b:Lmg/a1;

    return-object v0
.end method
