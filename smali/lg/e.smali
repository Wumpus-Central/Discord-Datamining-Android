.class public final Llg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/e$b;
    }
.end annotation


# static fields
.field public static final d:Llg/e$b;

.field static final synthetic e:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Llh/c;

.field private static final g:Llh/f;

.field private static final h:Llh/b;


# instance fields
.field private final a:Lmg/h0;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lmg/h0;",
            "Lmg/m;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lci/i;


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
    const-class v2, Llg/e;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "cloneable"

    .line 13
    .line 14
    const-string v4, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

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
    sput-object v0, Llg/e;->e:[Lkotlin/reflect/KProperty;

    .line 27
    .line 28
    new-instance v0, Llg/e$b;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, Llg/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Llg/e;->d:Llg/e$b;

    .line 35
    .line 36
    sget-object v0, Ljg/k;->u:Llh/c;

    .line 37
    .line 38
    sput-object v0, Llg/e;->f:Llh/c;

    .line 39
    .line 40
    sget-object v0, Ljg/k$a;->d:Llh/d;

    .line 41
    .line 42
    invoke-virtual {v0}, Llh/d;->i()Llh/f;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "cloneable.shortName()"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sput-object v1, Llg/e;->g:Llh/f;

    .line 52
    .line 53
    invoke-virtual {v0}, Llh/d;->l()Llh/c;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Llh/b;->m(Llh/c;)Llh/b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "topLevel(StandardNames.FqNames.cloneable.toSafe())"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Llg/e;->h:Llh/b;

    .line 67
    .line 68
    return-void
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

.method public constructor <init>(Lci/n;Lmg/h0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lci/n;",
            "Lmg/h0;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lmg/h0;",
            "+",
            "Lmg/m;",
            ">;)V"
        }
    .end annotation

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computeContainingDeclaration"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Llg/e;->a:Lmg/h0;

    .line 3
    iput-object p3, p0, Llg/e;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance p2, Llg/e$c;

    invoke-direct {p2, p0, p1}, Llg/e$c;-><init>(Llg/e;Lci/n;)V

    invoke-interface {p1, p2}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p1

    iput-object p1, p0, Llg/e;->c:Lci/i;

    return-void
.end method

.method public synthetic constructor <init>(Lci/n;Lmg/h0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Llg/e$a;->k:Llg/e$a;

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llg/e;-><init>(Lci/n;Lmg/h0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic d()Llh/b;
    .locals 1

    sget-object v0, Llg/e;->h:Llh/b;

    return-object v0
.end method

.method public static final synthetic e()Llh/f;
    .locals 1

    sget-object v0, Llg/e;->g:Llh/f;

    return-object v0
.end method

.method public static final synthetic f(Llg/e;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Llg/e;->b:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic g()Llh/c;
    .locals 1

    sget-object v0, Llg/e;->f:Llh/c;

    return-object v0
.end method

.method public static final synthetic h(Llg/e;)Lmg/h0;
    .locals 0

    iget-object p0, p0, Llg/e;->a:Lmg/h0;

    return-object p0
.end method

.method private final i()Lpg/h;
    .locals 3

    iget-object v0, p0, Llg/e;->c:Lci/i;

    sget-object v1, Llg/e;->e:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg/h;

    return-object v0
.end method


# virtual methods
.method public a(Llh/c;Llh/f;)Z
    .locals 1

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Llg/e;->g:Llh/f;

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    sget-object p2, Llg/e;->f:Llh/c;

    .line 20
    .line 21
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1
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
.end method

.method public b(Llh/c;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/c;",
            ")",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "packageFqName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Llg/e;->f:Llh/c;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Llg/e;->i()Lpg/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/collections/u;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {}, Lkotlin/collections/u;->d()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    return-object p1
.end method

.method public c(Llh/b;)Lmg/e;
    .locals 1

    .line 1
    const-string v0, "classId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Llg/e;->h:Llh/b;

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Llg/e;->i()Lpg/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
