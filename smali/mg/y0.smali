.class public final Lmg/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmg/y0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lwh/h;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final e:Lmg/y0$a;

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
.field private final a:Lmg/e;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lei/g;",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:Lei/g;

.field private final d:Lci/i;


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
    const-class v2, Lmg/y0;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "scopeForOwnerModule"

    .line 13
    .line 14
    const-string v4, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

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
    sput-object v0, Lmg/y0;->f:[Lkotlin/reflect/KProperty;

    .line 27
    .line 28
    new-instance v0, Lmg/y0$a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, Lmg/y0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lmg/y0;->e:Lmg/y0$a;

    .line 35
    .line 36
    return-void
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

.method private constructor <init>(Lmg/e;Lci/n;Lkotlin/jvm/functions/Function1;Lei/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/e;",
            "Lci/n;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lei/g;",
            "+TT;>;",
            "Lei/g;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmg/y0;->a:Lmg/e;

    .line 3
    iput-object p3, p0, Lmg/y0;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    iput-object p4, p0, Lmg/y0;->c:Lei/g;

    .line 5
    new-instance p1, Lmg/y0$c;

    invoke-direct {p1, p0}, Lmg/y0$c;-><init>(Lmg/y0;)V

    invoke-interface {p2, p1}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p1

    iput-object p1, p0, Lmg/y0;->d:Lci/i;

    return-void
.end method

.method public synthetic constructor <init>(Lmg/e;Lci/n;Lkotlin/jvm/functions/Function1;Lei/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lmg/y0;-><init>(Lmg/e;Lci/n;Lkotlin/jvm/functions/Function1;Lei/g;)V

    return-void
.end method

.method public static final synthetic a(Lmg/y0;)Lei/g;
    .locals 0

    iget-object p0, p0, Lmg/y0;->c:Lei/g;

    return-object p0
.end method

.method public static final synthetic b(Lmg/y0;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lmg/y0;->b:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method private final d()Lwh/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lmg/y0;->d:Lci/i;

    sget-object v1, Lmg/y0;->f:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwh/h;

    return-object v0
.end method


# virtual methods
.method public final c(Lei/g;)Lwh/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lei/g;",
            ")TT;"
        }
    .end annotation

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lmg/y0;->a:Lmg/e;

    .line 7
    .line 8
    invoke-static {v0}, Lth/c;->p(Lmg/m;)Lmg/h0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lei/g;->d(Lmg/h0;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, Lmg/y0;->d()Lwh/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object v0, p0, Lmg/y0;->a:Lmg/e;

    .line 24
    .line 25
    invoke-interface {v0}, Lmg/h;->k()Ldi/g1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "classDescriptor.typeConstructor"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lei/g;->e(Ldi/g1;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0}, Lmg/y0;->d()Lwh/h;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object v0, p0, Lmg/y0;->a:Lmg/e;

    .line 46
    .line 47
    new-instance v1, Lmg/y0$b;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, Lmg/y0$b;-><init>(Lmg/y0;Lei/g;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Lei/g;->c(Lmg/e;Lkotlin/jvm/functions/Function0;)Lwh/h;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
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
