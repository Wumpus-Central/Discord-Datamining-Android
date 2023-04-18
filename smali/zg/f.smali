.class public final Lzg/f;
.super Lpg/g;
.source "SourceFile"

# interfaces
.implements Lxg/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzg/f$b;,
        Lzg/f$a;
    }
.end annotation


# static fields
.field public static final I:Lzg/f$a;

.field private static final J:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Z

.field private final B:Lzg/f$b;

.field private final C:Lzg/g;

.field private final D:Lmg/y0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmg/y0<",
            "Lzg/g;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Lwh/f;

.field private final F:Lzg/l;

.field private final G:Lng/g;

.field private final H:Lci/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lci/i<",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;>;"
        }
    .end annotation
.end field

.field private final s:Lyg/g;

.field private final t:Lch/g;

.field private final u:Lmg/e;

.field private final v:Lyg/g;

.field private final w:Lkotlin/Lazy;

.field private final x:Lmg/f;

.field private final y:Lmg/e0;

.field private final z:Lmg/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lzg/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lzg/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lzg/f;->I:Lzg/f$a;

    .line 8
    .line 9
    const-string v2, "equals"

    .line 10
    .line 11
    const-string v3, "hashCode"

    .line 12
    .line 13
    const-string v4, "getClass"

    .line 14
    .line 15
    const-string v5, "wait"

    .line 16
    .line 17
    const-string v6, "notify"

    .line 18
    .line 19
    const-string v7, "notifyAll"

    .line 20
    .line 21
    const-string v8, "toString"

    .line 22
    .line 23
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlin/collections/u;->i([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lzg/f;->J:Ljava/util/Set;

    .line 32
    .line 33
    return-void
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

.method public constructor <init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;)V
    .locals 12

    move-object v8, p0

    move-object v6, p1

    move-object v9, p3

    move-object/from16 v7, p4

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    move-object v2, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lyg/g;->e()Lci/n;

    move-result-object v1

    invoke-interface {p3}, Lch/t;->getName()Llh/f;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->t()Lbh/b;

    move-result-object v0

    invoke-interface {v0, p3}, Lbh/b;->a(Lch/l;)Lbh/a;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    .line 4
    invoke-direct/range {v0 .. v5}, Lpg/g;-><init>(Lci/n;Lmg/m;Llh/f;Lmg/a1;Z)V

    .line 5
    iput-object v6, v8, Lzg/f;->s:Lyg/g;

    .line 6
    iput-object v9, v8, Lzg/f;->t:Lch/g;

    .line 7
    iput-object v7, v8, Lzg/f;->u:Lmg/e;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p1

    move-object v1, p0

    move-object v2, p3

    .line 8
    invoke-static/range {v0 .. v5}, Lyg/a;->d(Lyg/g;Lmg/g;Lch/z;IILjava/lang/Object;)Lyg/g;

    move-result-object v10

    iput-object v10, v8, Lzg/f;->v:Lyg/g;

    .line 9
    invoke-virtual {v10}, Lyg/g;->a()Lyg/b;

    move-result-object v0

    invoke-virtual {v0}, Lyg/b;->h()Lwg/g;

    move-result-object v0

    invoke-interface {v0, p3, p0}, Lwg/g;->a(Lch/g;Lmg/e;)V

    .line 10
    invoke-interface {p3}, Lch/g;->H()Lch/d0;

    .line 11
    new-instance v0, Lzg/f$e;

    invoke-direct {v0, p0}, Lzg/f$e;-><init>(Lzg/f;)V

    invoke-static {v0}, Llf/m;->a(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, v8, Lzg/f;->w:Lkotlin/Lazy;

    .line 12
    invoke-interface {p3}, Lch/g;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lmg/f;->p:Lmg/f;

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p3}, Lch/g;->G()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lmg/f;->m:Lmg/f;

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {p3}, Lch/g;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lmg/f;->n:Lmg/f;

    goto :goto_0

    .line 15
    :cond_2
    sget-object v0, Lmg/f;->l:Lmg/f;

    .line 16
    :goto_0
    iput-object v0, v8, Lzg/f;->x:Lmg/f;

    .line 17
    invoke-interface {p3}, Lch/g;->r()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_6

    invoke-interface {p3}, Lch/g;->A()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    .line 18
    :cond_3
    sget-object v0, Lmg/e0;->k:Lmg/e0$a;

    .line 19
    invoke-interface {p3}, Lch/g;->D()Z

    move-result v3

    .line 20
    invoke-interface {p3}, Lch/g;->D()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, Lch/s;->isAbstract()Z

    move-result v4

    if-nez v4, :cond_5

    invoke-interface {p3}, Lch/g;->G()Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    move v4, v1

    goto :goto_2

    :cond_5
    :goto_1
    move v4, v2

    .line 21
    :goto_2
    invoke-interface {p3}, Lch/s;->isFinal()Z

    move-result v5

    xor-int/2addr v5, v2

    .line 22
    invoke-virtual {v0, v3, v4, v5}, Lmg/e0$a;->a(ZZZ)Lmg/e0;

    move-result-object v0

    goto :goto_4

    .line 23
    :cond_6
    :goto_3
    sget-object v0, Lmg/e0;->l:Lmg/e0;

    :goto_4
    iput-object v0, v8, Lzg/f;->y:Lmg/e0;

    .line 24
    invoke-interface {p3}, Lch/s;->getVisibility()Lmg/n1;

    move-result-object v0

    iput-object v0, v8, Lzg/f;->z:Lmg/n1;

    .line 25
    invoke-interface {p3}, Lch/g;->o()Lch/g;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p3}, Lch/s;->h()Z

    move-result v0

    if-nez v0, :cond_7

    move v0, v2

    goto :goto_5

    :cond_7
    move v0, v1

    :goto_5
    iput-boolean v0, v8, Lzg/f;->A:Z

    .line 26
    new-instance v0, Lzg/f$b;

    invoke-direct {v0, p0}, Lzg/f$b;-><init>(Lzg/f;)V

    iput-object v0, v8, Lzg/f;->B:Lzg/f$b;

    .line 27
    new-instance v11, Lzg/g;

    if-eqz v7, :cond_8

    move v4, v2

    goto :goto_6

    :cond_8
    move v4, v1

    :goto_6
    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v0, v11

    move-object v1, v10

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Lzg/g;-><init>(Lyg/g;Lmg/e;Lch/g;ZLzg/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v11, v8, Lzg/f;->C:Lzg/g;

    .line 28
    sget-object v0, Lmg/y0;->e:Lmg/y0$a;

    invoke-virtual {v10}, Lyg/g;->e()Lci/n;

    move-result-object v1

    invoke-virtual {v10}, Lyg/g;->a()Lyg/b;

    move-result-object v2

    invoke-virtual {v2}, Lyg/b;->k()Lei/l;

    move-result-object v2

    invoke-interface {v2}, Lei/l;->d()Lei/g;

    move-result-object v2

    new-instance v3, Lzg/f$f;

    invoke-direct {v3, p0}, Lzg/f$f;-><init>(Lzg/f;)V

    invoke-virtual {v0, p0, v1, v2, v3}, Lmg/y0$a;->a(Lmg/e;Lci/n;Lei/g;Lkotlin/jvm/functions/Function1;)Lmg/y0;

    move-result-object v0

    iput-object v0, v8, Lzg/f;->D:Lmg/y0;

    .line 29
    new-instance v0, Lwh/f;

    invoke-direct {v0, v11}, Lwh/f;-><init>(Lwh/h;)V

    iput-object v0, v8, Lzg/f;->E:Lwh/f;

    .line 30
    new-instance v0, Lzg/l;

    invoke-direct {v0, v10, p3, p0}, Lzg/l;-><init>(Lyg/g;Lch/g;Lxg/c;)V

    iput-object v0, v8, Lzg/f;->F:Lzg/l;

    .line 31
    invoke-static {v10, p3}, Lyg/e;->a(Lyg/g;Lch/d;)Lng/g;

    move-result-object v0

    iput-object v0, v8, Lzg/f;->G:Lng/g;

    .line 32
    invoke-virtual {v10}, Lyg/g;->e()Lci/n;

    move-result-object v0

    new-instance v1, Lzg/f$c;

    invoke-direct {v1, p0}, Lzg/f$c;-><init>(Lzg/f;)V

    invoke-interface {v0, v1}, Lci/n;->d(Lkotlin/jvm/functions/Function0;)Lci/i;

    move-result-object v0

    iput-object v0, v8, Lzg/f;->H:Lci/i;

    return-void
.end method

.method public synthetic constructor <init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;)V

    return-void
.end method

.method public static final synthetic K0(Lzg/f;)Lmg/e;
    .locals 0

    iget-object p0, p0, Lzg/f;->u:Lmg/e;

    return-object p0
.end method

.method public static final synthetic L0(Lzg/f;)Lyg/g;
    .locals 0

    iget-object p0, p0, Lzg/f;->v:Lyg/g;

    return-object p0
.end method

.method public static final synthetic M0(Lzg/f;)Lzg/g;
    .locals 0

    iget-object p0, p0, Lzg/f;->C:Lzg/g;

    return-object p0
.end method


# virtual methods
.method public C()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic D0()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Lzg/f;->S0()Lzg/g;

    move-result-object v0

    return-object v0
.end method

.method public E0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public I()Ljava/util/Collection;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/e;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lzg/f;->y:Lmg/e0;

    .line 2
    .line 3
    sget-object v1, Lmg/e0;->m:Lmg/e0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    sget-object v2, Ldi/r1;->l:Ldi/r1;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x7

    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-static/range {v2 .. v7}, Lah/b;->b(Ldi/r1;ZZLmg/f1;ILjava/lang/Object;)Lah/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lzg/f;->t:Lch/g;

    .line 19
    .line 20
    invoke-interface {v1}, Lch/g;->M()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lch/j;

    .line 44
    .line 45
    iget-object v4, p0, Lzg/f;->v:Lyg/g;

    .line 46
    .line 47
    invoke-virtual {v4}, Lyg/g;->g()Lah/d;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v3, v0}, Lah/d;->o(Lch/x;Lah/a;)Ldi/g0;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, Ldi/g0;->N0()Ldi/g1;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, Ldi/g1;->q()Lmg/h;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    instance-of v4, v3, Lmg/e;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    check-cast v3, Lmg/e;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/4 v3, 0x0

    .line 71
    :goto_1
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, Lzg/f$d;

    .line 78
    .line 79
    invoke-direct {v0}, Lzg/f$d;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v0}, Lkotlin/collections/h;->w0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_2
    return-object v0
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method

.method public I0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public J()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public K()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public L()Z
    .locals 1

    iget-boolean v0, p0, Lzg/f;->A:Z

    return v0
.end method

.method public final N0(Lwg/g;Lmg/e;)Lzg/f;
    .locals 3

    .line 1
    const-string v0, "javaResolverCache"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lzg/f;

    .line 7
    .line 8
    iget-object v1, p0, Lzg/f;->v:Lyg/g;

    .line 9
    .line 10
    invoke-virtual {v1}, Lyg/g;->a()Lyg/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1}, Lyg/b;->x(Lwg/g;)Lyg/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v1, p1}, Lyg/a;->i(Lyg/g;Lyg/b;)Lyg/g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, Lpg/g;->b()Lmg/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "containingDeclaration"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lzg/f;->t:Lch/g;

    .line 32
    .line 33
    invoke-direct {v0, p1, v1, v2, p2}, Lzg/f;-><init>(Lyg/g;Lmg/m;Lch/g;Lmg/e;)V

    .line 34
    .line 35
    .line 36
    return-object v0
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

.method public O0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/f;->C:Lzg/g;

    invoke-virtual {v0}, Lzg/g;->x0()Lci/i;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final P0()Lch/g;
    .locals 1

    iget-object v0, p0, Lzg/f;->t:Lch/g;

    return-object v0
.end method

.method public final Q0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lch/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/f;->w:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public R()Lmg/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R0()Lyg/g;
    .locals 1

    iget-object v0, p0, Lzg/f;->s:Lyg/g;

    return-object v0
.end method

.method public S()Lwh/h;
    .locals 1

    iget-object v0, p0, Lzg/f;->F:Lzg/l;

    return-object v0
.end method

.method public S0()Lzg/g;
    .locals 2

    invoke-super {p0}, Lpg/a;->D0()Lwh/h;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lzg/g;

    return-object v0
.end method

.method protected T0(Lei/g;)Lzg/g;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lzg/f;->D:Lmg/y0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lmg/y0;->c(Lei/g;)Lwh/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lzg/g;

    .line 13
    .line 14
    return-object p1
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

.method public U()Lmg/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic c0(Lei/g;)Lwh/h;
    .locals 0

    invoke-virtual {p0, p1}, Lzg/f;->T0(Lei/g;)Lzg/g;

    move-result-object p1

    return-object p1
.end method

.method public g()Lmg/f;
    .locals 1

    iget-object v0, p0, Lzg/f;->x:Lmg/f;

    return-object v0
.end method

.method public getAnnotations()Lng/g;
    .locals 1

    iget-object v0, p0, Lzg/f;->G:Lng/g;

    return-object v0
.end method

.method public getVisibility()Lmg/u;
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/f;->z:Lmg/n1;

    .line 2
    .line 3
    sget-object v1, Lmg/t;->a:Lmg/u;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lzg/f;->t:Lch/g;

    .line 12
    .line 13
    invoke-interface {v0}, Lch/g;->o()Lch/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, Lvg/s;->a:Lmg/u;

    .line 20
    .line 21
    const-string v1, "{\n            JavaDescri\u2026KAGE_VISIBILITY\n        }"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, Lzg/f;->z:Lmg/n1;

    .line 28
    .line 29
    invoke-static {v0}, Lvg/j0;->d(Lmg/n1;)Lmg/u;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    return-object v0
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

.method public isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k()Ldi/g1;
    .locals 1

    iget-object v0, p0, Lzg/f;->B:Lzg/f$b;

    return-object v0
.end method

.method public l()Lmg/e0;
    .locals 1

    iget-object v0, p0, Lzg/f;->y:Lmg/e0;

    return-object v0
.end method

.method public bridge synthetic m()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Lzg/f;->O0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy Java class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lth/c;->m(Lmg/m;)Llh/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lmg/f1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzg/f;->H:Lci/i;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public x()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public y0()Lwh/h;
    .locals 1

    iget-object v0, p0, Lzg/f;->E:Lwh/f;

    return-object v0
.end method

.method public z0()Lmg/h1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lmg/h1<",
            "Ldi/o0;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
