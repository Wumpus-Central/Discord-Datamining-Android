.class public abstract Lzg/j;
.super Lwh/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzg/j$a;,
        Lzg/j$b;
    }
.end annotation


# static fields
.field static final synthetic m:[Lkotlin/reflect/KProperty;
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
.field private final b:Lyg/g;

.field private final c:Lzg/j;

.field private final d:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ljava/util/Collection<",
            "Lmg/m;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Lzg/b;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lci/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/g<",
            "Llh/f;",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Lci/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/h<",
            "Llh/f;",
            "Lmg/u0;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lci/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/g<",
            "Llh/f;",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final i:Lci/i;

.field private final j:Lci/i;

.field private final k:Lci/i;

.field private final l:Lci/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/g<",
            "Llh/f;",
            "Ljava/util/List<",
            "Lmg/u0;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Lkotlin/reflect/KProperty;

    .line 3
    .line 4
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 5
    .line 6
    const-class v2, Lzg/j;

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v4, "functionNamesLazy"

    .line 13
    .line 14
    const-string v5, "getFunctionNamesLazy()Ljava/util/Set;"

    .line 15
    .line 16
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aput-object v1, v0, v3

    .line 25
    .line 26
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-string v4, "propertyNamesLazy"

    .line 33
    .line 34
    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    .line 35
    .line 36
    invoke-direct {v1, v3, v4, v5}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x1

    .line 44
    aput-object v1, v0, v3

    .line 45
    .line 46
    new-instance v1, Lkotlin/jvm/internal/c0;

    .line 47
    .line 48
    invoke-static {v2}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v3, "classNamesLazy"

    .line 53
    .line 54
    const-string v4, "getClassNamesLazy()Ljava/util/Set;"

    .line 55
    .line 56
    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/c0;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->g(Lkotlin/jvm/internal/b0;)Ldg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x2

    .line 64
    aput-object v1, v0, v2

    .line 65
    .line 66
    sput-object v0, Lzg/j;->m:[Lkotlin/reflect/KProperty;

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

.method public constructor <init>(Lyg/g;Lzg/j;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lwh/i;-><init>()V

    .line 3
    iput-object p1, p0, Lzg/j;->b:Lyg/g;

    .line 4
    iput-object p2, p0, Lzg/j;->c:Lzg/j;

    .line 5
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$c;

    invoke-direct {v0, p0}, Lzg/j$c;-><init>(Lzg/j;)V

    .line 6
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lci/n;->c(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lci/i;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->d:Lci/i;

    .line 8
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$g;

    invoke-direct {v0, p0}, Lzg/j$g;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->e:Lci/i;

    .line 9
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$f;

    invoke-direct {v0, p0}, Lzg/j$f;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->h(Lkotlin/jvm/functions/Function1;)Lci/g;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->f:Lci/g;

    .line 10
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$e;

    invoke-direct {v0, p0}, Lzg/j$e;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->i(Lkotlin/jvm/functions/Function1;)Lci/h;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->g:Lci/h;

    .line 11
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$i;

    invoke-direct {v0, p0}, Lzg/j$i;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->h(Lkotlin/jvm/functions/Function1;)Lci/g;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->h:Lci/g;

    .line 12
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$h;

    invoke-direct {v0, p0}, Lzg/j$h;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->i:Lci/i;

    .line 13
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$k;

    invoke-direct {v0, p0}, Lzg/j$k;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->j:Lci/i;

    .line 14
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p2

    new-instance v0, Lzg/j$d;

    invoke-direct {v0, p0}, Lzg/j$d;-><init>(Lzg/j;)V

    invoke-interface {p2, v0}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object p2

    iput-object p2, p0, Lzg/j;->k:Lci/i;

    .line 15
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object p1

    new-instance p2, Lzg/j$j;

    invoke-direct {p2, p0}, Lzg/j$j;-><init>(Lzg/j;)V

    invoke-interface {p1, p2}, Lci/n;->h(Lkotlin/jvm/functions/Function1;)Lci/g;

    move-result-object p1

    iput-object p1, p0, Lzg/j;->l:Lci/g;

    return-void
.end method

.method public synthetic constructor <init>(Lyg/g;Lzg/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lzg/j;-><init>(Lyg/g;Lzg/j;)V

    return-void
.end method

.method private final A()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j;->i:Lci/i;

    sget-object v1, Lzg/j;->m:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final D()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j;->j:Lci/i;

    sget-object v1, Lzg/j;->m:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final E(Lch/n;)Ldi/g0;
    .locals 8

    .line 1
    iget-object v0, p0, Lzg/j;->b:Lyg/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyg/g;->g()Lah/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1}, Lch/n;->getType()Lch/x;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, Ldi/r1;->l:Ldi/r1;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x7

    .line 17
    const/4 v7, 0x0

    .line 18
    invoke-static/range {v2 .. v7}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v1, v2}, Lah/d;->o(Lch/x;Lah/a;)Ldi/g0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Ljg/h;->r0(Ldi/g0;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    invoke-static {v0}, Ljg/h;->u0(Ldi/g0;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    :cond_0
    invoke-direct {p0, p1}, Lzg/j;->F(Lch/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Lch/n;->N()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p1, 0x0

    .line 53
    :goto_0
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-static {v0}, Ldi/s1;->n(Ldi/g0;)Ldi/g0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "makeNotNullable(propertyType)"

    .line 60
    .line 61
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_2
    return-object v0
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

.method private final F(Lch/n;)Z
    .locals 1

    invoke-interface {p1}, Lch/s;->isFinal()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lch/s;->h()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final J(Lch/n;)Lmg/u0;
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lzg/j;->u(Lch/n;)Lpg/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {v6, v0, v0, v0, v0}, Lpg/c0;->V0(Lpg/d0;Lmg/w0;Lmg/w;Lmg/w;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lzg/j;->E(Lch/n;)Ldi/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0}, Lzg/j;->z()Lmg/x0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    move-object v0, v6

    .line 27
    invoke-virtual/range {v0 .. v5}, Lpg/c0;->b1(Ldi/g0;Ljava/util/List;Lmg/x0;Lmg/x0;Ljava/util/List;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v6}, Lpg/m0;->getType()Ldi/g0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v6, v0}, Lph/e;->K(Lmg/k1;Ldi/g0;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    new-instance v0, Lzg/j$l;

    .line 41
    .line 42
    invoke-direct {v0, p0, p1, v6}, Lzg/j$l;-><init>(Lzg/j;Lch/n;Lpg/c0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v6, v0}, Lpg/n0;->L0(Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lzg/j;->b:Lyg/g;

    .line 49
    .line 50
    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lyg/b;->h()Lwg/g;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-interface {v0, p1, v6}, Lwg/g;->e(Lch/n;Lmg/u0;)V

    .line 59
    .line 60
    .line 61
    return-object v6
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

.method private final L(Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lmg/z0;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Lmg/z0;

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    invoke-static {v3, v6, v6, v4, v5}, Leh/w;->c(Lmg/y;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    new-instance v4, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_0
    check-cast v4, Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const/4 v3, 0x1

    .line 75
    if-eq v2, v3, :cond_2

    .line 76
    .line 77
    sget-object v2, Lzg/j$m;->k:Lzg/j$m;

    .line 78
    .line 79
    invoke-static {v1, v2}, Lph/m;->a(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 84
    .line 85
    .line 86
    invoke-interface {p1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    return-void
.end method

.method public static final synthetic h(Lzg/j;)Lci/h;
    .locals 0

    iget-object p0, p0, Lzg/j;->g:Lci/h;

    return-object p0
.end method

.method public static final synthetic i(Lzg/j;)Lci/g;
    .locals 0

    iget-object p0, p0, Lzg/j;->f:Lci/g;

    return-object p0
.end method

.method public static final synthetic j(Lzg/j;Lch/n;)Lmg/u0;
    .locals 0

    invoke-direct {p0, p1}, Lzg/j;->J(Lch/n;)Lmg/u0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lzg/j;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lzg/j;->L(Ljava/util/Set;)V

    return-void
.end method

.method private final u(Lch/n;)Lpg/c0;
    .locals 9

    .line 1
    invoke-interface {p1}, Lch/s;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v5, v0, 0x1

    .line 6
    .line 7
    iget-object v0, p0, Lzg/j;->b:Lyg/g;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Lzg/j;->C()Lmg/m;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v3, Lmg/e0;->l:Lmg/e0;

    .line 18
    .line 19
    invoke-interface {p1}, Lch/s;->getVisibility()Lmg/n1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lvg/j0;->d(Lmg/n1;)Lmg/u;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {p1}, Lch/t;->getName()Llh/f;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    iget-object v0, p0, Lzg/j;->b:Lyg/g;

    .line 32
    .line 33
    invoke-virtual {v0}, Lyg/g;->a()Lyg/b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lyg/b;->t()Lbh/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v0, p1}, Lbh/b;->a(Lch/l;)Lbh/a;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-direct {p0, p1}, Lzg/j;->F(Lch/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-static/range {v1 .. v8}, Lxg/f;->f1(Lmg/m;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/a1;Z)Lxg/f;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "create(\n            owne\u2026d.isFinalStatic\n        )"

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
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

.method private final x()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j;->k:Lci/i;

    sget-object v1, Lzg/j;->m:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Lci/m;->a(Lci/i;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method protected final B()Lzg/j;
    .locals 1

    iget-object v0, p0, Lzg/j;->c:Lzg/j;

    return-object v0
.end method

.method protected abstract C()Lmg/m;
.end method

.method protected G(Lxg/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected abstract H(Lch/r;Ljava/util/List;Ldi/g0;Ljava/util/List;)Lzg/j$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/r;",
            "Ljava/util/List<",
            "+",
            "Lmg/f1;",
            ">;",
            "Ldi/g0;",
            "Ljava/util/List<",
            "+",
            "Lmg/j1;",
            ">;)",
            "Lzg/j$a;"
        }
    .end annotation
.end method

.method protected final I(Lch/r;)Lxg/e;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    const-string v1, "method"

    .line 6
    .line 7
    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lzg/j;->b:Lyg/g;

    .line 11
    .line 12
    invoke-static {v1, v7}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual/range {p0 .. p0}, Lzg/j;->C()Lmg/m;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface/range {p1 .. p1}, Lch/t;->getName()Llh/f;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v0, Lzg/j;->b:Lyg/g;

    .line 25
    .line 26
    invoke-virtual {v4}, Lyg/g;->a()Lyg/b;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lyg/b;->t()Lbh/b;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4, v7}, Lbh/b;->a(Lch/l;)Lbh/a;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v5, v0, Lzg/j;->e:Lci/i;

    .line 39
    .line 40
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    check-cast v5, Lzg/b;

    .line 45
    .line 46
    invoke-interface/range {p1 .. p1}, Lch/t;->getName()Llh/f;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v5, v6}, Lzg/b;->c(Llh/f;)Lch/w;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x1

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    invoke-interface/range {p1 .. p1}, Lch/r;->i()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    move v5, v9

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v5, v8

    .line 71
    :goto_0
    invoke-static {v2, v1, v3, v4, v5}, Lxg/e;->p1(Lmg/m;Lng/g;Llh/f;Lmg/a1;Z)Lxg/e;

    .line 72
    .line 73
    .line 74
    move-result-object v15

    .line 75
    const-string v1, "createJavaMethod(\n      \u2026eters.isEmpty()\n        )"

    .line 76
    .line 77
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v0, Lzg/j;->b:Lyg/g;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    const/4 v5, 0x4

    .line 84
    const/4 v6, 0x0

    .line 85
    move-object v2, v15

    .line 86
    move-object/from16 v3, p1

    .line 87
    .line 88
    invoke-static/range {v1 .. v6}, Lyg/a;->f(Lyg/g;Lmg/m;Lch/z;IILjava/lang/Object;)Lyg/g;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-interface/range {p1 .. p1}, Lch/z;->getTypeParameters()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    new-instance v3, Ljava/util/ArrayList;

    .line 97
    .line 98
    const/16 v4, 0xa

    .line 99
    .line 100
    invoke-static {v2, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_1

    .line 116
    .line 117
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Lch/y;

    .line 122
    .line 123
    invoke-virtual {v1}, Lyg/g;->f()Lyg/k;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-interface {v5, v4}, Lyg/k;->a(Lch/y;)Lmg/f1;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-interface/range {p1 .. p1}, Lch/r;->i()Ljava/util/List;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v0, v1, v15, v2}, Lzg/j;->K(Lyg/g;Lmg/y;Ljava/util/List;)Lzg/j$b;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v0, v7, v1}, Lzg/j;->q(Lch/r;Lyg/g;)Ldi/g0;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v2}, Lzg/j$b;->a()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v0, v7, v3, v4, v5}, Lzg/j;->H(Lch/r;Ljava/util/List;Ldi/g0;Ljava/util/List;)Lzg/j$a;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Lzg/j$a;->c()Ldi/g0;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-eqz v4, :cond_2

    .line 163
    .line 164
    sget-object v5, Lng/g;->f:Lng/g$a;

    .line 165
    .line 166
    invoke-virtual {v5}, Lng/g$a;->b()Lng/g;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    invoke-static {v15, v4, v5}, Lph/d;->i(Lmg/a;Ldi/g0;Lng/g;)Lmg/x0;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    goto :goto_2

    .line 175
    :cond_2
    const/4 v4, 0x0

    .line 176
    :goto_2
    move-object v11, v4

    .line 177
    invoke-virtual/range {p0 .. p0}, Lzg/j;->z()Lmg/x0;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-virtual {v3}, Lzg/j$a;->e()Ljava/util/List;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    invoke-virtual {v3}, Lzg/j$a;->f()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    invoke-virtual {v3}, Lzg/j$a;->d()Ldi/g0;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    sget-object v5, Lmg/e0;->k:Lmg/e0$a;

    .line 198
    .line 199
    invoke-interface/range {p1 .. p1}, Lch/s;->isAbstract()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-interface/range {p1 .. p1}, Lch/s;->isFinal()Z

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    xor-int/2addr v10, v9

    .line 208
    invoke-virtual {v5, v8, v6, v10}, Lmg/e0$a;->a(ZZZ)Lmg/e0;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    invoke-interface/range {p1 .. p1}, Lch/s;->getVisibility()Lmg/n1;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v5}, Lvg/j0;->d(Lmg/n1;)Lmg/u;

    .line 217
    .line 218
    .line 219
    move-result-object v18

    .line 220
    invoke-virtual {v3}, Lzg/j$a;->c()Ldi/g0;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    if-eqz v5, :cond_3

    .line 225
    .line 226
    sget-object v5, Lxg/e;->Q:Lmg/a$a;

    .line 227
    .line 228
    invoke-virtual {v2}, Lzg/j$b;->a()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v6

    .line 232
    invoke-static {v6}, Lkotlin/collections/h;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-static {v5, v6}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-static {v5}, Lmf/s;->e(Lkotlin/Pair;)Ljava/util/Map;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    goto :goto_3

    .line 245
    :cond_3
    invoke-static {}, Lmf/s;->h()Ljava/util/Map;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    :goto_3
    move-object/from16 v19, v5

    .line 250
    .line 251
    move-object v10, v15

    .line 252
    move-object v5, v15

    .line 253
    move-object v15, v4

    .line 254
    invoke-virtual/range {v10 .. v19}, Lxg/e;->o1(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;Ljava/util/Map;)Lpg/g0;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v3}, Lzg/j$a;->b()Z

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    invoke-virtual {v2}, Lzg/j$b;->b()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    invoke-virtual {v5, v4, v2}, Lxg/e;->s1(ZZ)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3}, Lzg/j$a;->a()Ljava/util/List;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    xor-int/2addr v2, v9

    .line 277
    if-eqz v2, :cond_4

    .line 278
    .line 279
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v1}, Lyg/b;->s()Lwg/j;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    invoke-virtual {v3}, Lzg/j$a;->a()Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-interface {v1, v5, v2}, Lwg/j;->b(Lmg/b;Ljava/util/List;)V

    .line 292
    .line 293
    .line 294
    :cond_4
    return-object v5
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method protected final K(Lyg/g;Lmg/y;Ljava/util/List;)Lzg/j$b;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyg/g;",
            "Lmg/y;",
            "Ljava/util/List<",
            "+",
            "Lch/b0;",
            ">;)",
            "Lzg/j$b;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "c"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "function"

    .line 9
    .line 10
    move-object/from16 v14, p2

    .line 11
    .line 12
    invoke-static {v14, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "jValueParameters"

    .line 16
    .line 17
    move-object/from16 v15, p3

    .line 18
    .line 19
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static/range {p3 .. p3}, Lkotlin/collections/h;->J0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v13, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v2, 0xa

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v13, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_6

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lmf/m;

    .line 53
    .line 54
    invoke-virtual {v3}, Lmf/m;->a()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-virtual {v3}, Lmf/m;->b()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, Lch/b0;

    .line 63
    .line 64
    invoke-static {v0, v3}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    sget-object v7, Ldi/r1;->l:Ldi/r1;

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    const/4 v9, 0x0

    .line 72
    const/4 v10, 0x0

    .line 73
    const/4 v11, 0x7

    .line 74
    const/4 v12, 0x0

    .line 75
    invoke-static/range {v7 .. v12}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-interface {v3}, Lch/b0;->b()Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    const/4 v8, 0x0

    .line 84
    const/4 v9, 0x1

    .line 85
    if-eqz v7, :cond_2

    .line 86
    .line 87
    invoke-interface {v3}, Lch/b0;->getType()Lch/x;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    instance-of v10, v7, Lch/f;

    .line 92
    .line 93
    if-eqz v10, :cond_0

    .line 94
    .line 95
    move-object v8, v7

    .line 96
    check-cast v8, Lch/f;

    .line 97
    .line 98
    :cond_0
    if-eqz v8, :cond_1

    .line 99
    .line 100
    invoke-virtual/range {p1 .. p1}, Lyg/g;->g()Lah/d;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-virtual {v7, v8, v4, v9}, Lah/d;->k(Lch/f;Lah/a;Z)Ldi/g0;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    invoke-virtual/range {p1 .. p1}, Lyg/g;->d()Lmg/h0;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    invoke-interface {v7}, Lmg/h0;->o()Ljg/h;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-virtual {v7, v4}, Ljg/h;->k(Ldi/g0;)Ldi/g0;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v4, v7}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 126
    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 130
    .line 131
    .line 132
    const-string v2, "Vararg parameter should be an array: "

    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lyg/g;->g()Lah/d;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-interface {v3}, Lch/b0;->getType()Lch/x;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    invoke-virtual {v7, v10, v4}, Lah/d;->o(Lch/x;Lah/a;)Ldi/g0;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-static {v4, v8}, Llf/x;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    :goto_1
    invoke-virtual {v4}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    move-object v8, v7

    .line 169
    check-cast v8, Ldi/g0;

    .line 170
    .line 171
    invoke-virtual {v4}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    move-object v12, v4

    .line 176
    check-cast v12, Ldi/g0;

    .line 177
    .line 178
    invoke-interface/range {p2 .. p2}, Lmg/j0;->getName()Llh/f;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {v4}, Llh/f;->b()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const-string v7, "equals"

    .line 187
    .line 188
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_3

    .line 193
    .line 194
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-ne v4, v9, :cond_3

    .line 199
    .line 200
    invoke-virtual/range {p1 .. p1}, Lyg/g;->d()Lmg/h0;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    invoke-interface {v4}, Lmg/h0;->o()Ljg/h;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-virtual {v4}, Ljg/h;->I()Ldi/o0;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v4, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v4

    .line 216
    if-eqz v4, :cond_3

    .line 217
    .line 218
    const-string v4, "other"

    .line 219
    .line 220
    invoke-static {v4}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    goto :goto_2

    .line 225
    :cond_3
    invoke-interface {v3}, Lch/b0;->getName()Llh/f;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    if-nez v4, :cond_4

    .line 230
    .line 231
    move v2, v9

    .line 232
    :cond_4
    if-nez v4, :cond_5

    .line 233
    .line 234
    new-instance v4, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 237
    .line 238
    .line 239
    const/16 v7, 0x70

    .line 240
    .line 241
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-static {v4}, Llh/f;->h(Ljava/lang/String;)Llh/f;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    const-string v7, "identifier(\"p$index\")"

    .line 256
    .line 257
    invoke-static {v4, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    :cond_5
    :goto_2
    move/from16 v16, v2

    .line 261
    .line 262
    move-object v7, v4

    .line 263
    const-string v2, "if (function.name.asStri\u2026(\"p$index\")\n            }"

    .line 264
    .line 265
    invoke-static {v7, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    new-instance v11, Lpg/l0;

    .line 269
    .line 270
    const/4 v4, 0x0

    .line 271
    const/4 v9, 0x0

    .line 272
    const/4 v10, 0x0

    .line 273
    const/16 v17, 0x0

    .line 274
    .line 275
    invoke-virtual/range {p1 .. p1}, Lyg/g;->a()Lyg/b;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v2}, Lyg/b;->t()Lbh/b;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-interface {v2, v3}, Lbh/b;->a(Lch/l;)Lbh/a;

    .line 284
    .line 285
    .line 286
    move-result-object v18

    .line 287
    move-object v2, v11

    .line 288
    move-object/from16 v3, p2

    .line 289
    .line 290
    move-object/from16 v19, v11

    .line 291
    .line 292
    move/from16 v11, v17

    .line 293
    .line 294
    move-object v0, v13

    .line 295
    move-object/from16 v13, v18

    .line 296
    .line 297
    invoke-direct/range {v2 .. v13}, Lpg/l0;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V

    .line 298
    .line 299
    .line 300
    move-object/from16 v2, v19

    .line 301
    .line 302
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-object v13, v0

    .line 306
    move/from16 v2, v16

    .line 307
    .line 308
    move-object/from16 v0, p1

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_6
    move-object v0, v13

    .line 313
    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    new-instance v1, Lzg/j$b;

    .line 318
    .line 319
    invoke-direct {v1, v0, v2}, Lzg/j$b;-><init>(Ljava/util/List;Z)V

    .line 320
    .line 321
    .line 322
    return-object v1
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzg/j;->A()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(Llh/f;Lug/b;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Lug/b;",
            ")",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lzg/j;->a()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, Lzg/j;->h:Lci/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
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

.method public c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzg/j;->D()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(Llh/f;Lug/b;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Lug/b;",
            ")",
            "Ljava/util/Collection<",
            "Lmg/u0;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "location"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lzg/j;->c()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    iget-object p2, p0, Lzg/j;->l:Lci/g;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/util/Collection;

    .line 33
    .line 34
    return-object p1
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

.method public e()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzg/j;->x()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llh/f;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Collection<",
            "Lmg/m;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lzg/j;->d:Lci/i;

    .line 12
    .line 13
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/Collection;

    .line 18
    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
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
.end method

.method protected abstract l(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llh/f;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation
.end method

.method protected final m(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llh/f;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Lmg/m;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "kindFilter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameFilter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lug/d;->w:Lug/d;

    .line 12
    .line 13
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lwh/d;->c:Lwh/d$a;

    .line 19
    .line 20
    invoke-virtual {v2}, Lwh/d$a;->c()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1, v2}, Lwh/d;->a(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, Lzg/j;->l(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Llh/f;

    .line 49
    .line 50
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0, v3, v0}, Lwh/i;->g(Llh/f;Lug/b;)Lmg/h;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-static {v1, v3}, Lni/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v2, Lwh/d;->c:Lwh/d$a;

    .line 71
    .line 72
    invoke-virtual {v2}, Lwh/d$a;->d()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p1, v2}, Lwh/d;->a(I)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    invoke-virtual {p1}, Lwh/d;->l()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Lwh/c$a;->a:Lwh/c$a;

    .line 87
    .line 88
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0, p1, p2}, Lzg/j;->n(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_3

    .line 107
    .line 108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Llh/f;

    .line 113
    .line 114
    invoke-interface {p2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0, v3, v0}, Lzg/j;->b(Llh/f;Lug/b;)Ljava/util/Collection;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    sget-object v2, Lwh/d;->c:Lwh/d$a;

    .line 135
    .line 136
    invoke-virtual {v2}, Lwh/d$a;->i()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    invoke-virtual {p1, v2}, Lwh/d;->a(I)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, Lwh/d;->l()Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    sget-object v3, Lwh/c$a;->a:Lwh/c$a;

    .line 151
    .line 152
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    invoke-virtual {p0, p1, p2}, Lzg/j;->t(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_5

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Llh/f;

    .line 177
    .line 178
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Ljava/lang/Boolean;

    .line 183
    .line 184
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-eqz v3, :cond_4

    .line 189
    .line 190
    invoke-virtual {p0, v2, v0}, Lzg/j;->d(Llh/f;Lug/b;)Ljava/util/Collection;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    invoke-static {v1}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
.end method

.method protected abstract n(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llh/f;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation
.end method

.method protected o(Ljava/util/Collection;Llh/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;",
            "Llh/f;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract p()Lzg/b;
.end method

.method protected final q(Lch/r;Lyg/g;)Ldi/g0;
    .locals 7

    .line 1
    const-string v0, "method"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lch/q;->O()Lch/g;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lch/g;->r()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    sget-object v1, Ldi/r1;->l:Ldi/r1;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x6

    .line 24
    const/4 v6, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lyg/g;->g()Lah/d;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p1}, Lch/r;->getReturnType()Lch/x;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p2, p1, v0}, Lah/d;->o(Lch/x;Lah/a;)Ldi/g0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method protected abstract r(Ljava/util/Collection;Llh/f;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lmg/z0;",
            ">;",
            "Llh/f;",
            ")V"
        }
    .end annotation
.end method

.method protected abstract s(Llh/f;Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh/f;",
            "Ljava/util/Collection<",
            "Lmg/u0;",
            ">;)V"
        }
    .end annotation
.end method

.method protected abstract t(Lwh/d;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwh/d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Llh/f;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/Set<",
            "Llh/f;",
            ">;"
        }
    .end annotation
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lzg/j;->C()Lmg/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final v()Lci/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lci/i<",
            "Ljava/util/Collection<",
            "Lmg/m;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j;->d:Lci/i;

    return-object v0
.end method

.method protected final w()Lyg/g;
    .locals 1

    iget-object v0, p0, Lzg/j;->b:Lyg/g;

    return-object v0
.end method

.method protected final y()Lci/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lci/i<",
            "Lzg/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/j;->e:Lci/i;

    return-object v0
.end method

.method protected abstract z()Lmg/x0;
.end method
