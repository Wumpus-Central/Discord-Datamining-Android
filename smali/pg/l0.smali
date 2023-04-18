.class public Lpg/l0;
.super Lpg/m0;
.source "SourceFile"

# interfaces
.implements Lmg/j1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpg/l0$a;,
        Lpg/l0$b;
    }
.end annotation


# static fields
.field public static final v:Lpg/l0$a;


# instance fields
.field private final p:I

.field private final q:Z

.field private final r:Z

.field private final s:Z

.field private final t:Ldi/g0;

.field private final u:Lmg/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpg/l0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpg/l0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpg/l0;->v:Lpg/l0$a;

    return-void
.end method

.method public constructor <init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V
    .locals 7

    .line 1
    move-object v6, p0

    .line 2
    const-string v0, "containingDeclaration"

    .line 3
    .line 4
    move-object v1, p1

    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "annotations"

    .line 9
    .line 10
    move-object v2, p4

    .line 11
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "name"

    .line 15
    .line 16
    move-object v3, p5

    .line 17
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "outType"

    .line 21
    .line 22
    move-object v4, p6

    .line 23
    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "source"

    .line 27
    .line 28
    move-object/from16 v5, p11

    .line 29
    .line 30
    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v0, p0

    .line 34
    invoke-direct/range {v0 .. v5}, Lpg/m0;-><init>(Lmg/m;Lng/g;Llh/f;Ldi/g0;Lmg/a1;)V

    .line 35
    .line 36
    .line 37
    move v0, p3

    .line 38
    iput v0, v6, Lpg/l0;->p:I

    .line 39
    .line 40
    move v0, p7

    .line 41
    iput-boolean v0, v6, Lpg/l0;->q:Z

    .line 42
    .line 43
    move v0, p8

    .line 44
    iput-boolean v0, v6, Lpg/l0;->r:Z

    .line 45
    .line 46
    move/from16 v0, p9

    .line 47
    .line 48
    iput-boolean v0, v6, Lpg/l0;->s:Z

    .line 49
    .line 50
    move-object/from16 v0, p10

    .line 51
    .line 52
    iput-object v0, v6, Lpg/l0;->t:Ldi/g0;

    .line 53
    .line 54
    if-nez p2, :cond_0

    .line 55
    .line 56
    move-object v0, v6

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move-object v0, p2

    .line 59
    :goto_0
    iput-object v0, v6, Lpg/l0;->u:Lmg/j1;

    .line 60
    .line 61
    return-void
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
.end method

.method public static final K0(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;Lkotlin/jvm/functions/Function0;)Lpg/l0;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmg/a;",
            "Lmg/j1;",
            "I",
            "Lng/g;",
            "Llh/f;",
            "Ldi/g0;",
            "ZZZ",
            "Ldi/g0;",
            "Lmg/a1;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/util/List<",
            "+",
            "Lmg/k1;",
            ">;>;)",
            "Lpg/l0;"
        }
    .end annotation

    sget-object v0, Lpg/l0;->v:Lpg/l0$a;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-virtual/range {v0 .. v12}, Lpg/l0$a;->a(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;Lkotlin/jvm/functions/Function0;)Lpg/l0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic A0()Lmg/p;
    .locals 1

    invoke-virtual {p0}, Lpg/l0;->a()Lmg/j1;

    move-result-object v0

    return-object v0
.end method

.method public L0()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public M0(Ldi/p1;)Lmg/j1;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ldi/p1;->k()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1
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

.method public bridge synthetic X()Lrh/g;
    .locals 1

    invoke-virtual {p0}, Lpg/l0;->L0()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Lrh/g;

    return-object v0
.end method

.method public Y()Z
    .locals 1

    iget-boolean v0, p0, Lpg/l0;->s:Z

    return v0
.end method

.method public Z(Lmg/a;Llh/f;I)Lmg/j1;
    .locals 13

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "newName"

    .line 8
    .line 9
    move-object v6, p2

    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lpg/l0;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {p0}, Lng/b;->getAnnotations()Lng/g;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const-string v1, "annotations"

    .line 21
    .line 22
    invoke-static {v5, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lpg/m0;->getType()Ldi/g0;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    const-string v1, "type"

    .line 30
    .line 31
    invoke-static {v7, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lpg/l0;->s0()Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    invoke-virtual {p0}, Lpg/l0;->b0()Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    invoke-virtual {p0}, Lpg/l0;->Y()Z

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    invoke-virtual {p0}, Lpg/l0;->j0()Ldi/g0;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    sget-object v12, Lmg/a1;->a:Lmg/a1;

    .line 51
    .line 52
    const-string v1, "NO_SOURCE"

    .line 53
    .line 54
    invoke-static {v12, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v0

    .line 58
    move/from16 v4, p3

    .line 59
    .line 60
    invoke-direct/range {v1 .. v12}, Lpg/l0;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V

    .line 61
    .line 62
    .line 63
    return-object v0
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

.method public bridge synthetic a()Lmg/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg/l0;->a()Lmg/j1;

    move-result-object v0

    return-object v0
.end method

.method public a()Lmg/j1;
    .locals 1

    .line 3
    iget-object v0, p0, Lpg/l0;->u:Lmg/j1;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lmg/j1;->a()Lmg/j1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic a()Lmg/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lpg/l0;->a()Lmg/j1;

    move-result-object v0

    return-object v0
.end method

.method public b()Lmg/a;
    .locals 2

    .line 2
    invoke-super {p0}, Lpg/k;->b()Lmg/m;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lmg/a;

    return-object v0
.end method

.method public bridge synthetic b()Lmg/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lpg/l0;->b()Lmg/a;

    move-result-object v0

    return-object v0
.end method

.method public b0()Z
    .locals 1

    iget-boolean v0, p0, Lpg/l0;->r:Z

    return v0
.end method

.method public bridge synthetic c(Ldi/p1;)Lmg/n;
    .locals 0

    invoke-virtual {p0, p1}, Lpg/l0;->M0(Ldi/p1;)Lmg/j1;

    move-result-object p1

    return-object p1
.end method

.method public e()Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lmg/j1;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lpg/l0;->b()Lmg/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lmg/a;->e()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "containingDeclaration.overriddenDescriptors"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lmg/a;

    .line 40
    .line 41
    invoke-interface {v2}, Lmg/a;->i()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0}, Lpg/l0;->getIndex()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lmg/j1;

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-object v1
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

.method public getIndex()I
    .locals 1

    iget v0, p0, Lpg/l0;->p:I

    return v0
.end method

.method public getVisibility()Lmg/u;
    .locals 2

    sget-object v0, Lmg/t;->f:Lmg/u;

    const-string v1, "LOCAL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public i0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public j0()Ldi/g0;
    .locals 1

    iget-object v0, p0, Lpg/l0;->t:Ldi/g0;

    return-object v0
.end method

.method public s0()Z
    .locals 2

    iget-boolean v0, p0, Lpg/l0;->q:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpg/l0;->b()Lmg/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lmg/b;

    invoke-interface {v0}, Lmg/b;->g()Lmg/b$a;

    move-result-object v0

    invoke-virtual {v0}, Lmg/b$a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t0(Lmg/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "D:",
            "Ljava/lang/Object;",
            ">(",
            "Lmg/o<",
            "TR;TD;>;TD;)TR;"
        }
    .end annotation

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, Lmg/o;->f(Lmg/j1;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
    .line 11
    .line 12
    .line 13
    .line 14
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
