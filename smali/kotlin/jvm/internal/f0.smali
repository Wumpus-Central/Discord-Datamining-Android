.class public Lkotlin/jvm/internal/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlin/jvm/internal/g0;

.field private static final b:[Lkotlin/reflect/KClass;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Lgg/k0;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lkotlin/jvm/internal/g0;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    move-object v0, v1

    .line 11
    :catch_0
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/g0;

    .line 15
    .line 16
    invoke-direct {v0}, Lkotlin/jvm/internal/g0;-><init>()V

    .line 17
    .line 18
    .line 19
    :goto_0
    sput-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    new-array v0, v0, [Lkotlin/reflect/KClass;

    .line 23
    .line 24
    sput-object v0, Lkotlin/jvm/internal/f0;->b:[Lkotlin/reflect/KClass;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
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

.method public static a(Lkotlin/jvm/internal/m;)Lkotlin/reflect/KFunction;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->a(Lkotlin/jvm/internal/m;)Lkotlin/reflect/KFunction;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)Lkotlin/reflect/KClass;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)Lkotlin/reflect/KDeclarationContainer;
    .locals 2

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/jvm/internal/g0;->c(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0, p1}, Lkotlin/jvm/internal/g0;->c(Ljava/lang/Class;Ljava/lang/String;)Lkotlin/reflect/KDeclarationContainer;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lkotlin/jvm/internal/v;)Ldg/e;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->d(Lkotlin/jvm/internal/v;)Ldg/e;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lkotlin/jvm/internal/z;)Ldg/g;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->e(Lkotlin/jvm/internal/z;)Ldg/g;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lkotlin/jvm/internal/b0;)Ldg/h;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->f(Lkotlin/jvm/internal/b0;)Ldg/h;

    move-result-object p0

    return-object p0
.end method

.method public static h(Lkotlin/jvm/internal/l;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->g(Lkotlin/jvm/internal/l;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Lkotlin/jvm/internal/s;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/f0;->a:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/g0;->h(Lkotlin/jvm/internal/s;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
