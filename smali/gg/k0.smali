.class public Lgg/k0;
.super Lkotlin/jvm/internal/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/jvm/internal/g0;-><init>()V

    return-void
.end method

.method private static i(Lkotlin/jvm/internal/e;)Lgg/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/e;->getOwner()Lkotlin/reflect/KDeclarationContainer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lgg/p;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p0, Lgg/p;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p0, Lgg/h;->n:Lgg/h;

    .line 13
    .line 14
    :goto_0
    return-object p0
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


# virtual methods
.method public a(Lkotlin/jvm/internal/m;)Lkotlin/reflect/KFunction;
    .locals 4

    new-instance v0, Lgg/q;

    invoke-static {p1}, Lgg/k0;->i(Lkotlin/jvm/internal/e;)Lgg/p;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lgg/q;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;)Lkotlin/reflect/KClass;
    .locals 0

    invoke-static {p1}, Lgg/c;->a(Ljava/lang/Class;)Lgg/m;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;
    .locals 0

    invoke-static {p1}, Lgg/c;->b(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object p1

    return-object p1
.end method

.method public d(Lkotlin/jvm/internal/v;)Ldg/e;
    .locals 4

    new-instance v0, Lgg/s;

    invoke-static {p1}, Lgg/k0;->i(Lkotlin/jvm/internal/e;)Lgg/p;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lgg/s;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public e(Lkotlin/jvm/internal/z;)Ldg/g;
    .locals 4

    new-instance v0, Lgg/x;

    invoke-static {p1}, Lgg/k0;->i(Lkotlin/jvm/internal/e;)Lgg/p;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lgg/x;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public f(Lkotlin/jvm/internal/b0;)Ldg/h;
    .locals 4

    new-instance v0, Lgg/y;

    invoke-static {p1}, Lgg/k0;->i(Lkotlin/jvm/internal/e;)Lgg/p;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkotlin/jvm/internal/e;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lgg/y;-><init>(Lgg/p;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public g(Lkotlin/jvm/internal/l;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Lfg/d;->a(Llf/g;)Lkotlin/reflect/KFunction;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lgg/p0;->c(Ljava/lang/Object;)Lgg/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object p1, Lgg/l0;->a:Lgg/l0;

    .line 14
    .line 15
    invoke-virtual {v0}, Lgg/q;->K()Lmg/y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, Lgg/l0;->e(Lmg/y;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-super {p0, p1}, Lkotlin/jvm/internal/g0;->g(Lkotlin/jvm/internal/l;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
.end method

.method public h(Lkotlin/jvm/internal/s;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lgg/k0;->g(Lkotlin/jvm/internal/l;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
