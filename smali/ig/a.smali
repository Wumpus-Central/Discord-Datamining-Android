.class public final Lig/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lig/a;

.field private static final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Llh/b;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Llh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lig/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lig/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lig/a;->a:Lig/a;

    .line 7
    .line 8
    const/4 v0, 0x6

    .line 9
    new-array v0, v0, [Llh/c;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    sget-object v2, Lvg/b0;->a:Llh/c;

    .line 13
    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    sget-object v2, Lvg/b0;->k:Llh/c;

    .line 18
    .line 19
    aput-object v2, v0, v1

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    sget-object v2, Lvg/b0;->l:Llh/c;

    .line 23
    .line 24
    aput-object v2, v0, v1

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    sget-object v2, Lvg/b0;->d:Llh/c;

    .line 28
    .line 29
    aput-object v2, v0, v1

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    sget-object v2, Lvg/b0;->f:Llh/c;

    .line 33
    .line 34
    aput-object v2, v0, v1

    .line 35
    .line 36
    const/4 v1, 0x5

    .line 37
    sget-object v2, Lvg/b0;->i:Llh/c;

    .line 38
    .line 39
    aput-object v2, v0, v1

    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/collections/h;->l([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Llh/c;

    .line 65
    .line 66
    invoke-static {v2}, Llh/b;->m(Llh/c;)Llh/b;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    sput-object v1, Lig/a;->b:Ljava/util/Set;

    .line 75
    .line 76
    sget-object v0, Lvg/b0;->j:Llh/c;

    .line 77
    .line 78
    invoke-static {v0}, Llh/b;->m(Llh/c;)Llh/b;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lig/a;->c:Llh/b;

    .line 88
    .line 89
    return-void
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Llh/b;
    .locals 1

    sget-object v0, Lig/a;->c:Llh/b;

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/b;",
            ">;"
        }
    .end annotation

    sget-object v0, Lig/a;->b:Ljava/util/Set;

    return-object v0
.end method

.method public final c(Leh/r;)Z
    .locals 3

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 7
    .line 8
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lig/a$a;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lig/a$a;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, v1, v2}, Leh/r;->c(Leh/r$c;[B)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->k:Z

    .line 21
    .line 22
    return p1
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
