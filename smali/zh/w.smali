.class public final Lzh/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lzh/m;

.field private final b:Lzh/e;


# direct methods
.method public constructor <init>(Lzh/m;)V
    .locals 2

    .line 1
    const-string v0, "c"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lzh/w;->a:Lzh/m;

    .line 10
    .line 11
    new-instance v0, Lzh/e;

    .line 12
    .line 13
    invoke-virtual {p1}, Lzh/m;->c()Lzh/k;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lzh/k;->p()Lmg/h0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1}, Lzh/m;->c()Lzh/k;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lzh/k;->q()Lmg/k0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, v1, p1}, Lzh/e;-><init>(Lmg/h0;Lmg/k0;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lzh/w;->b:Lzh/e;

    .line 33
    .line 34
    return-void
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

.method public static final synthetic a(Lzh/w;Lmg/m;)Lzh/z;
    .locals 0

    invoke-direct {p0, p1}, Lzh/w;->c(Lmg/m;)Lzh/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lzh/w;)Lzh/m;
    .locals 0

    iget-object p0, p0, Lzh/w;->a:Lzh/m;

    return-object p0
.end method

.method private final c(Lmg/m;)Lzh/z;
    .locals 4

    .line 1
    instance-of v0, p1, Lmg/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lzh/z$b;

    .line 6
    .line 7
    check-cast p1, Lmg/l0;

    .line 8
    .line 9
    invoke-interface {p1}, Lmg/l0;->d()Llh/c;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v1, p0, Lzh/w;->a:Lzh/m;

    .line 14
    .line 15
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lzh/w;->a:Lzh/m;

    .line 20
    .line 21
    invoke-virtual {v2}, Lzh/m;->j()Lih/g;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object v3, p0, Lzh/w;->a:Lzh/m;

    .line 26
    .line 27
    invoke-virtual {v3}, Lzh/m;->d()Lbi/f;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-direct {v0, p1, v1, v2, v3}, Lzh/z$b;-><init>(Llh/c;Lih/c;Lih/g;Lmg/a1;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v0, p1, Lbi/d;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast p1, Lbi/d;

    .line 40
    .line 41
    invoke-virtual {p1}, Lbi/d;->f1()Lzh/z$a;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    :goto_0
    return-object v0
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

.method private final d(Lnh/q;ILzh/b;)Lng/g;
    .locals 2

    .line 1
    sget-object v0, Lih/b;->c:Lih/b$b;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    sget-object p1, Lng/g;->f:Lng/g$a;

    .line 14
    .line 15
    invoke-virtual {p1}, Lng/g$a;->b()Lng/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p2, Lbi/n;

    .line 21
    .line 22
    iget-object v0, p0, Lzh/w;->a:Lzh/m;

    .line 23
    .line 24
    invoke-virtual {v0}, Lzh/m;->h()Lci/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lzh/w$a;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, p3}, Lzh/w$a;-><init>(Lzh/w;Lnh/q;Lzh/b;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p2, v0, v1}, Lbi/n;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    return-object p2
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

.method private final e()Lmg/x0;
    .locals 3

    iget-object v0, p0, Lzh/w;->a:Lzh/m;

    invoke-virtual {v0}, Lzh/m;->e()Lmg/m;

    move-result-object v0

    instance-of v1, v0, Lmg/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lmg/e;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmg/e;->J0()Lmg/x0;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method private final f(Lgh/n;Z)Lng/g;
    .locals 3

    .line 1
    sget-object v0, Lih/b;->c:Lih/b$b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lgh/n;->b0()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lng/g;->f:Lng/g$a;

    .line 18
    .line 19
    invoke-virtual {p1}, Lng/g$a;->b()Lng/g;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    new-instance v0, Lbi/n;

    .line 25
    .line 26
    iget-object v1, p0, Lzh/w;->a:Lzh/m;

    .line 27
    .line 28
    invoke-virtual {v1}, Lzh/m;->h()Lci/n;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Lzh/w$b;

    .line 33
    .line 34
    invoke-direct {v2, p0, p2, p1}, Lzh/w$b;-><init>(Lzh/w;ZLgh/n;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, Lbi/n;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    .line 40
    return-object v0
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

.method private final g(Lnh/q;Lzh/b;)Lng/g;
    .locals 3

    new-instance v0, Lbi/a;

    iget-object v1, p0, Lzh/w;->a:Lzh/m;

    invoke-virtual {v1}, Lzh/m;->h()Lci/n;

    move-result-object v1

    new-instance v2, Lzh/w$c;

    invoke-direct {v2, p0, p1, p2}, Lzh/w$c;-><init>(Lzh/w;Lnh/q;Lzh/b;)V

    invoke-direct {v0, v1, v2}, Lbi/a;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method private final h(Lbi/k;Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbi/k;",
            "Lmg/x0;",
            "Lmg/x0;",
            "Ljava/util/List<",
            "+",
            "Lmg/x0;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lmg/f1;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lmg/j1;",
            ">;",
            "Ldi/g0;",
            "Lmg/e0;",
            "Lmg/u;",
            "Ljava/util/Map<",
            "+",
            "Lmg/a$a<",
            "*>;*>;)V"
        }
    .end annotation

    invoke-virtual/range {p1 .. p10}, Lpg/g0;->o1(Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;Ljava/util/Map;)Lpg/g0;

    return-void
.end method

.method private final k(I)I
    .locals 1

    and-int/lit8 v0, p1, 0x3f

    shr-int/lit8 p1, p1, 0x8

    shl-int/lit8 p1, p1, 0x6

    add-int/2addr v0, p1

    return v0
.end method

.method private final n(Lgh/q;Lzh/m;Lmg/a;)Lmg/x0;
    .locals 1

    .line 1
    invoke-virtual {p2}, Lzh/m;->i()Lzh/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2, p1}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lng/g;->f:Lng/g$a;

    .line 10
    .line 11
    invoke-virtual {p2}, Lng/g$a;->b()Lng/g;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-static {p3, p1, v0, p2}, Lph/d;->b(Lmg/a;Ldi/g0;Llh/f;Lng/g;)Lmg/x0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method private final o(Ljava/util/List;Lnh/q;Lzh/b;)Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgh/u;",
            ">;",
            "Lnh/q;",
            "Lzh/b;",
            ")",
            "Ljava/util/List<",
            "Lmg/j1;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget-object v0, v7, Lzh/w;->a:Lzh/m;

    .line 4
    .line 5
    invoke-virtual {v0}, Lzh/m;->e()Lmg/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    move-object/from16 v20, v0

    .line 15
    .line 16
    check-cast v20, Lmg/a;

    .line 17
    .line 18
    invoke-interface/range {v20 .. v20}, Lmg/n;->b()Lmg/m;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "callableDescriptor.containingDeclaration"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v7, v0}, Lzh/w;->c(Lmg/m;)Lzh/z;

    .line 28
    .line 29
    .line 30
    move-result-object v21

    .line 31
    new-instance v15, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v0, 0xa

    .line 34
    .line 35
    move-object/from16 v1, p1

    .line 36
    .line 37
    invoke-static {v1, v0}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v22

    .line 48
    const/16 v23, 0x0

    .line 49
    .line 50
    move/from16 v11, v23

    .line 51
    .line 52
    :goto_0
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    add-int/lit8 v24, v11, 0x1

    .line 63
    .line 64
    if-gez v11, :cond_0

    .line 65
    .line 66
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 67
    .line 68
    .line 69
    :cond_0
    move-object v8, v0

    .line 70
    check-cast v8, Lgh/u;

    .line 71
    .line 72
    invoke-virtual {v8}, Lgh/u;->R()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    invoke-virtual {v8}, Lgh/u;->L()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    move v9, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move/from16 v9, v23

    .line 85
    .line 86
    :goto_1
    if-eqz v21, :cond_2

    .line 87
    .line 88
    sget-object v0, Lih/b;->c:Lih/b$b;

    .line 89
    .line 90
    invoke-virtual {v0, v9}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "HAS_ANNOTATIONS.get(flags)"

    .line 95
    .line 96
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    new-instance v10, Lbi/n;

    .line 106
    .line 107
    iget-object v0, v7, Lzh/w;->a:Lzh/m;

    .line 108
    .line 109
    invoke-virtual {v0}, Lzh/m;->h()Lci/n;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    new-instance v13, Lzh/w$f;

    .line 114
    .line 115
    move-object v0, v13

    .line 116
    move-object/from16 v1, p0

    .line 117
    .line 118
    move-object/from16 v2, v21

    .line 119
    .line 120
    move-object/from16 v3, p2

    .line 121
    .line 122
    move-object/from16 v4, p3

    .line 123
    .line 124
    move v5, v11

    .line 125
    move-object v6, v8

    .line 126
    invoke-direct/range {v0 .. v6}, Lzh/w$f;-><init>(Lzh/w;Lzh/z;Lnh/q;Lzh/b;ILgh/u;)V

    .line 127
    .line 128
    .line 129
    invoke-direct {v10, v12, v13}, Lbi/n;-><init>(Lci/n;Lkotlin/jvm/functions/Function0;)V

    .line 130
    .line 131
    .line 132
    move-object v12, v10

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 135
    .line 136
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    move-object v12, v0

    .line 141
    :goto_2
    const/4 v10, 0x0

    .line 142
    iget-object v0, v7, Lzh/w;->a:Lzh/m;

    .line 143
    .line 144
    invoke-virtual {v0}, Lzh/m;->g()Lih/c;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v8}, Lgh/u;->M()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    invoke-static {v0, v1}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    iget-object v0, v7, Lzh/w;->a:Lzh/m;

    .line 157
    .line 158
    invoke-virtual {v0}, Lzh/m;->i()Lzh/d0;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v1, v7, Lzh/w;->a:Lzh/m;

    .line 163
    .line 164
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-static {v8, v1}, Lih/f;->q(Lgh/u;Lih/g;)Lgh/q;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v0, v1}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    sget-object v0, Lih/b;->G:Lih/b$b;

    .line 177
    .line 178
    invoke-virtual {v0, v9}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    const-string v1, "DECLARES_DEFAULT_VALUE.get(flags)"

    .line 183
    .line 184
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    sget-object v1, Lih/b;->H:Lih/b$b;

    .line 192
    .line 193
    invoke-virtual {v1, v9}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    const-string v2, "IS_CROSSINLINE.get(flags)"

    .line 198
    .line 199
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    sget-object v1, Lih/b;->I:Lih/b$b;

    .line 207
    .line 208
    invoke-virtual {v1, v9}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v2, "IS_NOINLINE.get(flags)"

    .line 213
    .line 214
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result v17

    .line 221
    iget-object v1, v7, Lzh/w;->a:Lzh/m;

    .line 222
    .line 223
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v8, v1}, Lih/f;->t(Lgh/u;Lih/g;)Lgh/q;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-eqz v1, :cond_3

    .line 232
    .line 233
    iget-object v2, v7, Lzh/w;->a:Lzh/m;

    .line 234
    .line 235
    invoke-virtual {v2}, Lzh/m;->i()Lzh/d0;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-virtual {v2, v1}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    goto :goto_3

    .line 244
    :cond_3
    const/4 v1, 0x0

    .line 245
    :goto_3
    move-object/from16 v18, v1

    .line 246
    .line 247
    sget-object v1, Lmg/a1;->a:Lmg/a1;

    .line 248
    .line 249
    const-string v2, "NO_SOURCE"

    .line 250
    .line 251
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    new-instance v2, Lpg/l0;

    .line 255
    .line 256
    move-object v8, v2

    .line 257
    move-object/from16 v9, v20

    .line 258
    .line 259
    move-object v3, v15

    .line 260
    move v15, v0

    .line 261
    move-object/from16 v19, v1

    .line 262
    .line 263
    invoke-direct/range {v8 .. v19}, Lpg/l0;-><init>(Lmg/a;Lmg/j1;ILng/g;Llh/f;Ldi/g0;ZZZLdi/g0;Lmg/a1;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-object v15, v3

    .line 270
    move/from16 v11, v24

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_4
    move-object v3, v15

    .line 275
    invoke-static {v3}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    return-object v0
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
.end method


# virtual methods
.method public final i(Lgh/d;Z)Lmg/d;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 11
    .line 12
    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v16, v1

    .line 22
    .line 23
    check-cast v16, Lmg/e;

    .line 24
    .line 25
    new-instance v14, Lbi/c;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-virtual/range {p1 .. p1}, Lgh/d;->K()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    sget-object v13, Lzh/b;->k:Lzh/b;

    .line 33
    .line 34
    invoke-direct {v0, v15, v1, v13}, Lzh/w;->d(Lnh/q;ILzh/b;)Lng/g;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v6, Lmg/b$a;->k:Lmg/b$a;

    .line 39
    .line 40
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 41
    .line 42
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 47
    .line 48
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 53
    .line 54
    invoke-virtual {v1}, Lzh/m;->k()Lih/h;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 59
    .line 60
    invoke-virtual {v1}, Lzh/m;->d()Lbi/f;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    const/4 v12, 0x0

    .line 65
    const/16 v17, 0x400

    .line 66
    .line 67
    const/16 v18, 0x0

    .line 68
    .line 69
    move-object v1, v14

    .line 70
    move-object/from16 v2, v16

    .line 71
    .line 72
    move/from16 v5, p2

    .line 73
    .line 74
    move-object/from16 v7, p1

    .line 75
    .line 76
    move-object/from16 v19, v13

    .line 77
    .line 78
    move/from16 v13, v17

    .line 79
    .line 80
    move-object/from16 p2, v14

    .line 81
    .line 82
    move-object/from16 v14, v18

    .line 83
    .line 84
    invoke-direct/range {v1 .. v14}, Lbi/c;-><init>(Lmg/e;Lmg/l;Lng/g;ZLmg/b$a;Lgh/d;Lih/c;Lih/g;Lih/h;Lbi/f;Lmg/a1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 88
    .line 89
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const/4 v4, 0x0

    .line 94
    const/4 v5, 0x0

    .line 95
    const/4 v6, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/16 v8, 0x3c

    .line 98
    .line 99
    const/4 v9, 0x0

    .line 100
    move-object/from16 v2, p2

    .line 101
    .line 102
    invoke-static/range {v1 .. v9}, Lzh/m;->b(Lzh/m;Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;ILjava/lang/Object;)Lzh/m;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v1}, Lzh/m;->f()Lzh/w;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual/range {p1 .. p1}, Lgh/d;->N()Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v3, "proto.valueParameterList"

    .line 115
    .line 116
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object/from16 v3, v19

    .line 120
    .line 121
    invoke-direct {v1, v2, v15, v3}, Lzh/w;->o(Ljava/util/List;Lnh/q;Lzh/b;)Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sget-object v2, Lzh/a0;->a:Lzh/a0;

    .line 126
    .line 127
    sget-object v3, Lih/b;->d:Lih/b$d;

    .line 128
    .line 129
    invoke-virtual/range {p1 .. p1}, Lgh/d;->K()I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-virtual {v3, v4}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    check-cast v3, Lgh/x;

    .line 138
    .line 139
    invoke-static {v2, v3}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    move-object/from16 v3, p2

    .line 144
    .line 145
    invoke-virtual {v3, v1, v2}, Lpg/f;->q1(Ljava/util/List;Lmg/u;)Lpg/f;

    .line 146
    .line 147
    .line 148
    invoke-interface/range {v16 .. v16}, Lmg/e;->s()Ldi/o0;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v3, v1}, Lpg/p;->g1(Ldi/g0;)V

    .line 153
    .line 154
    .line 155
    invoke-interface/range {v16 .. v16}, Lmg/d0;->K()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {v3, v1}, Lpg/p;->W0(Z)V

    .line 160
    .line 161
    .line 162
    sget-object v1, Lih/b;->n:Lih/b$b;

    .line 163
    .line 164
    invoke-virtual/range {p1 .. p1}, Lgh/d;->K()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v1, v2}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    xor-int/lit8 v1, v1, 0x1

    .line 177
    .line 178
    invoke-virtual {v3, v1}, Lpg/p;->Y0(Z)V

    .line 179
    .line 180
    .line 181
    return-object v3
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method public final j(Lgh/i;)Lmg/z0;
    .locals 31

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    const-string v0, "proto"

    .line 6
    .line 7
    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lgh/i;->t0()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Lgh/i;->d0()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lgh/i;->f0()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-direct {v11, v0}, Lzh/w;->k(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :goto_0
    move v9, v0

    .line 30
    sget-object v0, Lzh/b;->k:Lzh/b;

    .line 31
    .line 32
    invoke-direct {v11, v10, v9, v0}, Lzh/w;->d(Lnh/q;ILzh/b;)Lng/g;

    .line 33
    .line 34
    .line 35
    move-result-object v15

    .line 36
    invoke-static/range {p1 .. p1}, Lih/f;->g(Lgh/i;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    invoke-direct {v11, v10, v0}, Lzh/w;->g(Lnh/q;Lzh/b;)Lng/g;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    sget-object v0, Lng/g;->f:Lng/g$a;

    .line 48
    .line 49
    invoke-virtual {v0}, Lng/g$a;->b()Lng/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 54
    .line 55
    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, Lth/c;->l(Lmg/m;)Llh/c;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v2, v11, Lzh/w;->a:Lzh/m;

    .line 64
    .line 65
    invoke-virtual {v2}, Lzh/m;->g()Lih/c;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual/range {p1 .. p1}, Lgh/i;->e0()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-static {v2, v3}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Llh/c;->c(Llh/f;)Llh/c;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, Lzh/c0;->a:Llh/c;

    .line 82
    .line 83
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    sget-object v1, Lih/h;->b:Lih/h$a;

    .line 90
    .line 91
    invoke-virtual {v1}, Lih/h$a;->b()Lih/h;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 97
    .line 98
    invoke-virtual {v1}, Lzh/m;->k()Lih/h;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :goto_2
    move-object/from16 v21, v1

    .line 103
    .line 104
    new-instance v8, Lbi/k;

    .line 105
    .line 106
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 107
    .line 108
    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    const/4 v14, 0x0

    .line 113
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 114
    .line 115
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual/range {p1 .. p1}, Lgh/i;->e0()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-static {v1, v2}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 124
    .line 125
    .line 126
    move-result-object v16

    .line 127
    sget-object v1, Lzh/a0;->a:Lzh/a0;

    .line 128
    .line 129
    sget-object v2, Lih/b;->o:Lih/b$d;

    .line 130
    .line 131
    invoke-virtual {v2, v9}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Lgh/j;

    .line 136
    .line 137
    invoke-static {v1, v2}, Lzh/b0;->b(Lzh/a0;Lgh/j;)Lmg/b$a;

    .line 138
    .line 139
    .line 140
    move-result-object v17

    .line 141
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 142
    .line 143
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 144
    .line 145
    .line 146
    move-result-object v19

    .line 147
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 148
    .line 149
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 150
    .line 151
    .line 152
    move-result-object v20

    .line 153
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 154
    .line 155
    invoke-virtual {v1}, Lzh/m;->d()Lbi/f;

    .line 156
    .line 157
    .line 158
    move-result-object v22

    .line 159
    const/16 v23, 0x0

    .line 160
    .line 161
    const/16 v24, 0x400

    .line 162
    .line 163
    const/16 v25, 0x0

    .line 164
    .line 165
    move-object v12, v8

    .line 166
    move-object/from16 v18, p1

    .line 167
    .line 168
    invoke-direct/range {v12 .. v25}, Lbi/k;-><init>(Lmg/m;Lmg/z0;Lng/g;Llh/f;Lmg/b$a;Lgh/i;Lih/c;Lih/g;Lih/h;Lbi/f;Lmg/a1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 172
    .line 173
    invoke-virtual/range {p1 .. p1}, Lgh/i;->m0()Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    const-string v3, "proto.typeParameterList"

    .line 178
    .line 179
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/16 v26, 0x0

    .line 183
    .line 184
    const/16 v27, 0x0

    .line 185
    .line 186
    const/16 v28, 0x0

    .line 187
    .line 188
    const/16 v29, 0x3c

    .line 189
    .line 190
    const/16 v30, 0x0

    .line 191
    .line 192
    move-object/from16 v22, v1

    .line 193
    .line 194
    move-object/from16 v23, v8

    .line 195
    .line 196
    move-object/from16 v24, v2

    .line 197
    .line 198
    invoke-static/range {v22 .. v30}, Lzh/m;->b(Lzh/m;Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;ILjava/lang/Object;)Lzh/m;

    .line 199
    .line 200
    .line 201
    move-result-object v12

    .line 202
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 203
    .line 204
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-static {v10, v1}, Lih/f;->k(Lgh/i;Lih/g;)Lgh/q;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-eqz v1, :cond_3

    .line 213
    .line 214
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-virtual {v2, v1}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_3

    .line 223
    .line 224
    invoke-static {v8, v1, v0}, Lph/d;->i(Lmg/a;Ldi/g0;Lng/g;)Lmg/x0;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_3

    .line 229
    :cond_3
    const/4 v0, 0x0

    .line 230
    :goto_3
    move-object v2, v0

    .line 231
    invoke-direct/range {p0 .. p0}, Lzh/w;->e()Lmg/x0;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    iget-object v0, v11, Lzh/w;->a:Lzh/m;

    .line 236
    .line 237
    invoke-virtual {v0}, Lzh/m;->j()Lih/g;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v10, v0}, Lih/f;->c(Lgh/i;Lih/g;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    new-instance v4, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-eqz v1, :cond_5

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    check-cast v1, Lgh/q;

    .line 265
    .line 266
    invoke-direct {v11, v1, v12, v8}, Lzh/w;->n(Lgh/q;Lzh/m;Lmg/a;)Lmg/x0;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    if-eqz v1, :cond_4

    .line 271
    .line 272
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_5
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Lzh/d0;->j()Ljava/util/List;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v12}, Lzh/m;->f()Lzh/w;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual/range {p1 .. p1}, Lgh/i;->q0()Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    const-string v6, "proto.valueParameterList"

    .line 293
    .line 294
    invoke-static {v1, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    sget-object v6, Lzh/b;->k:Lzh/b;

    .line 298
    .line 299
    invoke-direct {v0, v1, v10, v6}, Lzh/w;->o(Ljava/util/List;Lnh/q;Lzh/b;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object v6

    .line 303
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 308
    .line 309
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v10, v1}, Lih/f;->m(Lgh/i;Lih/g;)Lgh/q;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v0, v1}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    sget-object v0, Lzh/a0;->a:Lzh/a0;

    .line 322
    .line 323
    sget-object v1, Lih/b;->e:Lih/b$d;

    .line 324
    .line 325
    invoke-virtual {v1, v9}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, Lgh/k;

    .line 330
    .line 331
    invoke-virtual {v0, v1}, Lzh/a0;->b(Lgh/k;)Lmg/e0;

    .line 332
    .line 333
    .line 334
    move-result-object v13

    .line 335
    sget-object v1, Lih/b;->d:Lih/b$d;

    .line 336
    .line 337
    invoke-virtual {v1, v9}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    check-cast v1, Lgh/x;

    .line 342
    .line 343
    invoke-static {v0, v1}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    invoke-static {}, Lmf/s;->h()Ljava/util/Map;

    .line 348
    .line 349
    .line 350
    move-result-object v15

    .line 351
    move-object/from16 v0, p0

    .line 352
    .line 353
    move-object v1, v8

    .line 354
    move-object/from16 v16, v12

    .line 355
    .line 356
    move-object v12, v8

    .line 357
    move-object v8, v13

    .line 358
    move v13, v9

    .line 359
    move-object v9, v14

    .line 360
    move-object v14, v10

    .line 361
    move-object v10, v15

    .line 362
    invoke-direct/range {v0 .. v10}, Lzh/w;->h(Lbi/k;Lmg/x0;Lmg/x0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ldi/g0;Lmg/e0;Lmg/u;Ljava/util/Map;)V

    .line 363
    .line 364
    .line 365
    sget-object v0, Lih/b;->p:Lih/b$b;

    .line 366
    .line 367
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    const-string v1, "IS_OPERATOR.get(flags)"

    .line 372
    .line 373
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    invoke-virtual {v12, v0}, Lpg/p;->f1(Z)V

    .line 381
    .line 382
    .line 383
    sget-object v0, Lih/b;->q:Lih/b$b;

    .line 384
    .line 385
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    const-string v1, "IS_INFIX.get(flags)"

    .line 390
    .line 391
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    invoke-virtual {v12, v0}, Lpg/p;->c1(Z)V

    .line 399
    .line 400
    .line 401
    sget-object v0, Lih/b;->t:Lih/b$b;

    .line 402
    .line 403
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    const-string v1, "IS_EXTERNAL_FUNCTION.get(flags)"

    .line 408
    .line 409
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    invoke-virtual {v12, v0}, Lpg/p;->X0(Z)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lih/b;->r:Lih/b$b;

    .line 420
    .line 421
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    const-string v1, "IS_INLINE.get(flags)"

    .line 426
    .line 427
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    invoke-virtual {v12, v0}, Lpg/p;->e1(Z)V

    .line 435
    .line 436
    .line 437
    sget-object v0, Lih/b;->s:Lih/b$b;

    .line 438
    .line 439
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-string v1, "IS_TAILREC.get(flags)"

    .line 444
    .line 445
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    invoke-virtual {v12, v0}, Lpg/p;->i1(Z)V

    .line 453
    .line 454
    .line 455
    sget-object v0, Lih/b;->u:Lih/b$b;

    .line 456
    .line 457
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    const-string v1, "IS_SUSPEND.get(flags)"

    .line 462
    .line 463
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    invoke-virtual {v12, v0}, Lpg/p;->h1(Z)V

    .line 471
    .line 472
    .line 473
    sget-object v0, Lih/b;->v:Lih/b$b;

    .line 474
    .line 475
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const-string v1, "IS_EXPECT_FUNCTION.get(flags)"

    .line 480
    .line 481
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    invoke-virtual {v12, v0}, Lpg/p;->W0(Z)V

    .line 489
    .line 490
    .line 491
    sget-object v0, Lih/b;->w:Lih/b$b;

    .line 492
    .line 493
    invoke-virtual {v0, v13}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    xor-int/lit8 v0, v0, 0x1

    .line 502
    .line 503
    invoke-virtual {v12, v0}, Lpg/p;->Y0(Z)V

    .line 504
    .line 505
    .line 506
    iget-object v0, v11, Lzh/w;->a:Lzh/m;

    .line 507
    .line 508
    invoke-virtual {v0}, Lzh/m;->c()Lzh/k;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Lzh/k;->h()Lzh/j;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    iget-object v1, v11, Lzh/w;->a:Lzh/m;

    .line 517
    .line 518
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-virtual/range {v16 .. v16}, Lzh/m;->i()Lzh/d0;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    invoke-interface {v0, v14, v12, v1, v2}, Lzh/j;->a(Lgh/i;Lmg/y;Lih/g;Lzh/d0;)Lkotlin/Pair;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    if-eqz v0, :cond_6

    .line 531
    .line 532
    invoke-virtual {v0}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    check-cast v1, Lmg/a$a;

    .line 537
    .line 538
    invoke-virtual {v0}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v12, v1, v0}, Lpg/p;->U0(Lmg/a$a;Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    :cond_6
    return-object v12
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
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method

.method public final l(Lgh/n;)Lmg/u0;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v15, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p1 .. p1}, Lgh/n;->p0()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Lgh/n;->b0()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lgh/n;->e0()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-direct {v0, v1}, Lzh/w;->k(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    move v14, v1

    .line 30
    new-instance v13, Lbi/j;

    .line 31
    .line 32
    move-object v1, v13

    .line 33
    iget-object v2, v0, Lzh/w;->a:Lzh/m;

    .line 34
    .line 35
    invoke-virtual {v2}, Lzh/m;->e()Lmg/m;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    sget-object v4, Lzh/b;->l:Lzh/b;

    .line 41
    .line 42
    invoke-direct {v0, v15, v14, v4}, Lzh/w;->d(Lnh/q;ILzh/b;)Lng/g;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v9, Lzh/a0;->a:Lzh/a0;

    .line 47
    .line 48
    sget-object v5, Lih/b;->e:Lih/b$d;

    .line 49
    .line 50
    invoke-virtual {v5, v14}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Lgh/k;

    .line 55
    .line 56
    invoke-virtual {v9, v5}, Lzh/a0;->b(Lgh/k;)Lmg/e0;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v6, Lih/b;->d:Lih/b$d;

    .line 61
    .line 62
    invoke-virtual {v6, v14}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    check-cast v6, Lgh/x;

    .line 67
    .line 68
    invoke-static {v9, v6}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    sget-object v7, Lih/b;->x:Lih/b$b;

    .line 73
    .line 74
    invoke-virtual {v7, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const-string v8, "IS_VAR.get(flags)"

    .line 79
    .line 80
    invoke-static {v7, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    iget-object v8, v0, Lzh/w;->a:Lzh/m;

    .line 88
    .line 89
    invoke-virtual {v8}, Lzh/m;->g()Lih/c;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual/range {p1 .. p1}, Lgh/n;->d0()I

    .line 94
    .line 95
    .line 96
    move-result v10

    .line 97
    invoke-static {v8, v10}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    sget-object v10, Lih/b;->o:Lih/b$d;

    .line 102
    .line 103
    invoke-virtual {v10, v14}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    check-cast v10, Lgh/j;

    .line 108
    .line 109
    invoke-static {v9, v10}, Lzh/b0;->b(Lzh/a0;Lgh/j;)Lmg/b$a;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    sget-object v10, Lih/b;->B:Lih/b$b;

    .line 114
    .line 115
    invoke-virtual {v10, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    const-string v11, "IS_LATEINIT.get(flags)"

    .line 120
    .line 121
    invoke-static {v10, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    sget-object v11, Lih/b;->A:Lih/b$b;

    .line 129
    .line 130
    invoke-virtual {v11, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    const-string v12, "IS_CONST.get(flags)"

    .line 135
    .line 136
    invoke-static {v11, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    sget-object v12, Lih/b;->D:Lih/b$b;

    .line 144
    .line 145
    invoke-virtual {v12, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    const-string v3, "IS_EXTERNAL_PROPERTY.get(flags)"

    .line 150
    .line 151
    invoke-static {v12, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    sget-object v3, Lih/b;->E:Lih/b$b;

    .line 159
    .line 160
    invoke-virtual {v3, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    move-object/from16 v16, v13

    .line 165
    .line 166
    const-string v13, "IS_DELEGATED.get(flags)"

    .line 167
    .line 168
    invoke-static {v3, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    move-object/from16 v3, v16

    .line 176
    .line 177
    move-object/from16 v21, v3

    .line 178
    .line 179
    sget-object v3, Lih/b;->F:Lih/b$b;

    .line 180
    .line 181
    invoke-virtual {v3, v14}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    move/from16 v16, v14

    .line 186
    .line 187
    const-string v14, "IS_EXPECT_PROPERTY.get(flags)"

    .line 188
    .line 189
    invoke-static {v3, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    move/from16 v3, v16

    .line 197
    .line 198
    move/from16 v22, v3

    .line 199
    .line 200
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 201
    .line 202
    invoke-virtual {v3}, Lzh/m;->g()Lih/c;

    .line 203
    .line 204
    .line 205
    move-result-object v16

    .line 206
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 207
    .line 208
    invoke-virtual {v3}, Lzh/m;->j()Lih/g;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 213
    .line 214
    invoke-virtual {v3}, Lzh/m;->k()Lih/h;

    .line 215
    .line 216
    .line 217
    move-result-object v18

    .line 218
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 219
    .line 220
    invoke-virtual {v3}, Lzh/m;->d()Lbi/f;

    .line 221
    .line 222
    .line 223
    move-result-object v19

    .line 224
    move-object v3, v15

    .line 225
    move-object/from16 v15, p1

    .line 226
    .line 227
    move/from16 v23, v22

    .line 228
    .line 229
    const/4 v3, 0x0

    .line 230
    invoke-direct/range {v1 .. v19}, Lbi/j;-><init>(Lmg/m;Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZLlh/f;Lmg/b$a;ZZZZZLgh/n;Lih/c;Lih/g;Lih/h;Lbi/f;)V

    .line 231
    .line 232
    .line 233
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 234
    .line 235
    invoke-virtual/range {p1 .. p1}, Lgh/n;->n0()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    const-string v2, "proto.typeParameterList"

    .line 240
    .line 241
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const/4 v4, 0x0

    .line 245
    const/4 v5, 0x0

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 248
    const/16 v8, 0x3c

    .line 249
    .line 250
    const/4 v9, 0x0

    .line 251
    move-object/from16 v2, v21

    .line 252
    .line 253
    invoke-static/range {v1 .. v9}, Lzh/m;->b(Lzh/m;Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;ILjava/lang/Object;)Lzh/m;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    sget-object v1, Lih/b;->y:Lih/b$b;

    .line 258
    .line 259
    move/from16 v15, v23

    .line 260
    .line 261
    invoke-virtual {v1, v15}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    const-string v2, "HAS_GETTER.get(flags)"

    .line 266
    .line 267
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    if-eqz v7, :cond_1

    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, Lih/f;->h(Lgh/n;)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-eqz v1, :cond_1

    .line 281
    .line 282
    sget-object v1, Lzh/b;->m:Lzh/b;

    .line 283
    .line 284
    move-object/from16 v14, p1

    .line 285
    .line 286
    invoke-direct {v0, v14, v1}, Lzh/w;->g(Lnh/q;Lzh/b;)Lng/g;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    goto :goto_1

    .line 291
    :cond_1
    move-object/from16 v14, p1

    .line 292
    .line 293
    sget-object v1, Lng/g;->f:Lng/g$a;

    .line 294
    .line 295
    invoke-virtual {v1}, Lng/g$a;->b()Lng/g;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    :goto_1
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 304
    .line 305
    invoke-virtual {v3}, Lzh/m;->j()Lih/g;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v14, v3}, Lih/f;->n(Lgh/n;Lih/g;)Lgh/q;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-virtual {v2, v3}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v3}, Lzh/d0;->j()Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-direct/range {p0 .. p0}, Lzh/w;->e()Lmg/x0;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    iget-object v5, v0, Lzh/w;->a:Lzh/m;

    .line 330
    .line 331
    invoke-virtual {v5}, Lzh/m;->j()Lih/g;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    invoke-static {v14, v5}, Lih/f;->l(Lgh/n;Lih/g;)Lgh/q;

    .line 336
    .line 337
    .line 338
    move-result-object v5

    .line 339
    const/16 v19, 0x0

    .line 340
    .line 341
    if-eqz v5, :cond_2

    .line 342
    .line 343
    invoke-virtual {v12}, Lzh/m;->i()Lzh/d0;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    invoke-virtual {v6, v5}, Lzh/d0;->q(Lgh/q;)Ldi/g0;

    .line 348
    .line 349
    .line 350
    move-result-object v5

    .line 351
    if-eqz v5, :cond_2

    .line 352
    .line 353
    move-object/from16 v13, v21

    .line 354
    .line 355
    invoke-static {v13, v5, v1}, Lph/d;->i(Lmg/a;Ldi/g0;Lng/g;)Lmg/x0;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    move-object v5, v1

    .line 360
    goto :goto_2

    .line 361
    :cond_2
    move-object/from16 v13, v21

    .line 362
    .line 363
    move-object/from16 v5, v19

    .line 364
    .line 365
    :goto_2
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 366
    .line 367
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-static {v14, v1}, Lih/f;->d(Lgh/n;Lih/g;)Ljava/util/List;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    new-instance v6, Ljava/util/ArrayList;

    .line 376
    .line 377
    const/16 v8, 0xa

    .line 378
    .line 379
    invoke-static {v1, v8}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 380
    .line 381
    .line 382
    move-result v8

    .line 383
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 384
    .line 385
    .line 386
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    if-eqz v8, :cond_3

    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    check-cast v8, Lgh/q;

    .line 401
    .line 402
    invoke-direct {v0, v8, v12, v13}, Lzh/w;->n(Lgh/q;Lzh/m;Lmg/a;)Lmg/x0;

    .line 403
    .line 404
    .line 405
    move-result-object v8

    .line 406
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_3

    .line 410
    :cond_3
    move-object v1, v13

    .line 411
    invoke-virtual/range {v1 .. v6}, Lpg/c0;->b1(Ldi/g0;Ljava/util/List;Lmg/x0;Lmg/x0;Ljava/util/List;)V

    .line 412
    .line 413
    .line 414
    sget-object v1, Lih/b;->c:Lih/b$b;

    .line 415
    .line 416
    invoke-virtual {v1, v15}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    const-string v2, "HAS_ANNOTATIONS.get(flags)"

    .line 421
    .line 422
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 426
    .line 427
    .line 428
    move-result v20

    .line 429
    sget-object v11, Lih/b;->d:Lih/b$d;

    .line 430
    .line 431
    invoke-virtual {v11, v15}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    move-object/from16 v21, v1

    .line 436
    .line 437
    check-cast v21, Lgh/x;

    .line 438
    .line 439
    sget-object v10, Lih/b;->e:Lih/b$d;

    .line 440
    .line 441
    invoke-virtual {v10, v15}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    move-object/from16 v22, v1

    .line 446
    .line 447
    check-cast v22, Lgh/k;

    .line 448
    .line 449
    const/16 v23, 0x0

    .line 450
    .line 451
    const/16 v24, 0x0

    .line 452
    .line 453
    const/16 v25, 0x0

    .line 454
    .line 455
    invoke-static/range {v20 .. v25}, Lih/b;->b(ZLgh/x;Lgh/k;ZZZ)I

    .line 456
    .line 457
    .line 458
    move-result v16

    .line 459
    const/4 v9, 0x1

    .line 460
    if-eqz v7, :cond_6

    .line 461
    .line 462
    invoke-virtual/range {p1 .. p1}, Lgh/n;->q0()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_4

    .line 467
    .line 468
    invoke-virtual/range {p1 .. p1}, Lgh/n;->c0()I

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    goto :goto_4

    .line 473
    :cond_4
    move/from16 v1, v16

    .line 474
    .line 475
    :goto_4
    sget-object v2, Lih/b;->J:Lih/b$b;

    .line 476
    .line 477
    invoke-virtual {v2, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    const-string v3, "IS_NOT_DEFAULT.get(getterFlags)"

    .line 482
    .line 483
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 487
    .line 488
    .line 489
    move-result v2

    .line 490
    sget-object v3, Lih/b;->K:Lih/b$b;

    .line 491
    .line 492
    invoke-virtual {v3, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    const-string v4, "IS_EXTERNAL_ACCESSOR.get(getterFlags)"

    .line 497
    .line 498
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    sget-object v3, Lih/b;->L:Lih/b$b;

    .line 506
    .line 507
    invoke-virtual {v3, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    const-string v4, "IS_INLINE_ACCESSOR.get(getterFlags)"

    .line 512
    .line 513
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 517
    .line 518
    .line 519
    move-result v8

    .line 520
    sget-object v3, Lzh/b;->m:Lzh/b;

    .line 521
    .line 522
    invoke-direct {v0, v14, v1, v3}, Lzh/w;->d(Lnh/q;ILzh/b;)Lng/g;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    if-eqz v2, :cond_5

    .line 527
    .line 528
    new-instance v17, Lpg/d0;

    .line 529
    .line 530
    sget-object v4, Lzh/a0;->a:Lzh/a0;

    .line 531
    .line 532
    invoke-virtual {v10, v1}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v5

    .line 536
    check-cast v5, Lgh/k;

    .line 537
    .line 538
    invoke-virtual {v4, v5}, Lzh/a0;->b(Lgh/k;)Lmg/e0;

    .line 539
    .line 540
    .line 541
    move-result-object v5

    .line 542
    invoke-virtual {v11, v1}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    check-cast v1, Lgh/x;

    .line 547
    .line 548
    invoke-static {v4, v1}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    xor-int/lit8 v18, v2, 0x1

    .line 553
    .line 554
    invoke-virtual {v13}, Lpg/c0;->g()Lmg/b$a;

    .line 555
    .line 556
    .line 557
    move-result-object v20

    .line 558
    const/16 v21, 0x0

    .line 559
    .line 560
    sget-object v22, Lmg/a1;->a:Lmg/a1;

    .line 561
    .line 562
    move-object/from16 v1, v17

    .line 563
    .line 564
    move-object v2, v13

    .line 565
    move-object v4, v5

    .line 566
    move-object v5, v6

    .line 567
    move/from16 v6, v18

    .line 568
    .line 569
    move-object/from16 v18, v12

    .line 570
    .line 571
    move v12, v9

    .line 572
    move-object/from16 v9, v20

    .line 573
    .line 574
    move-object v12, v10

    .line 575
    move-object/from16 v10, v21

    .line 576
    .line 577
    move-object/from16 v26, v11

    .line 578
    .line 579
    move-object/from16 v11, v22

    .line 580
    .line 581
    invoke-direct/range {v1 .. v11}, Lpg/d0;-><init>(Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZZZLmg/b$a;Lmg/v0;Lmg/a1;)V

    .line 582
    .line 583
    .line 584
    goto :goto_5

    .line 585
    :cond_5
    move-object/from16 v26, v11

    .line 586
    .line 587
    move-object/from16 v18, v12

    .line 588
    .line 589
    move-object v12, v10

    .line 590
    invoke-static {v13, v3}, Lph/d;->d(Lmg/u0;Lng/g;)Lpg/d0;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    const-string v2, "{\n                Descri\u2026nnotations)\n            }"

    .line 595
    .line 596
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    :goto_5
    invoke-virtual {v13}, Lpg/c0;->getReturnType()Ldi/g0;

    .line 600
    .line 601
    .line 602
    move-result-object v2

    .line 603
    invoke-virtual {v1, v2}, Lpg/d0;->Q0(Ldi/g0;)V

    .line 604
    .line 605
    .line 606
    move-object v11, v1

    .line 607
    goto :goto_6

    .line 608
    :cond_6
    move-object/from16 v26, v11

    .line 609
    .line 610
    move-object/from16 v18, v12

    .line 611
    .line 612
    move-object v12, v10

    .line 613
    move-object/from16 v11, v19

    .line 614
    .line 615
    :goto_6
    sget-object v1, Lih/b;->z:Lih/b$b;

    .line 616
    .line 617
    invoke-virtual {v1, v15}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    const-string v2, "HAS_SETTER.get(flags)"

    .line 622
    .line 623
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-eqz v1, :cond_9

    .line 631
    .line 632
    invoke-virtual/range {p1 .. p1}, Lgh/n;->x0()Z

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-eqz v1, :cond_7

    .line 637
    .line 638
    invoke-virtual/range {p1 .. p1}, Lgh/n;->j0()I

    .line 639
    .line 640
    .line 641
    move-result v16

    .line 642
    :cond_7
    move/from16 v1, v16

    .line 643
    .line 644
    sget-object v2, Lih/b;->J:Lih/b$b;

    .line 645
    .line 646
    invoke-virtual {v2, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const-string v3, "IS_NOT_DEFAULT.get(setterFlags)"

    .line 651
    .line 652
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    sget-object v3, Lih/b;->K:Lih/b$b;

    .line 660
    .line 661
    invoke-virtual {v3, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    const-string v4, "IS_EXTERNAL_ACCESSOR.get(setterFlags)"

    .line 666
    .line 667
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 671
    .line 672
    .line 673
    move-result v7

    .line 674
    sget-object v3, Lih/b;->L:Lih/b$b;

    .line 675
    .line 676
    invoke-virtual {v3, v1}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 677
    .line 678
    .line 679
    move-result-object v3

    .line 680
    const-string v4, "IS_INLINE_ACCESSOR.get(setterFlags)"

    .line 681
    .line 682
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 686
    .line 687
    .line 688
    move-result v8

    .line 689
    sget-object v10, Lzh/b;->n:Lzh/b;

    .line 690
    .line 691
    invoke-direct {v0, v14, v1, v10}, Lzh/w;->d(Lnh/q;ILzh/b;)Lng/g;

    .line 692
    .line 693
    .line 694
    move-result-object v3

    .line 695
    if-eqz v2, :cond_8

    .line 696
    .line 697
    new-instance v9, Lpg/e0;

    .line 698
    .line 699
    sget-object v4, Lzh/a0;->a:Lzh/a0;

    .line 700
    .line 701
    invoke-virtual {v12, v1}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v5

    .line 705
    check-cast v5, Lgh/k;

    .line 706
    .line 707
    invoke-virtual {v4, v5}, Lzh/a0;->b(Lgh/k;)Lmg/e0;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    move-object/from16 v6, v26

    .line 712
    .line 713
    invoke-virtual {v6, v1}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    check-cast v1, Lgh/x;

    .line 718
    .line 719
    invoke-static {v4, v1}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 720
    .line 721
    .line 722
    move-result-object v6

    .line 723
    const/4 v12, 0x1

    .line 724
    xor-int/lit8 v16, v2, 0x1

    .line 725
    .line 726
    invoke-virtual {v13}, Lpg/c0;->g()Lmg/b$a;

    .line 727
    .line 728
    .line 729
    move-result-object v17

    .line 730
    const/16 v20, 0x0

    .line 731
    .line 732
    sget-object v21, Lmg/a1;->a:Lmg/a1;

    .line 733
    .line 734
    move-object v1, v9

    .line 735
    move-object v2, v13

    .line 736
    move-object v4, v5

    .line 737
    move-object v5, v6

    .line 738
    move/from16 v6, v16

    .line 739
    .line 740
    move-object/from16 v22, v9

    .line 741
    .line 742
    move-object/from16 v9, v17

    .line 743
    .line 744
    move-object/from16 v27, v10

    .line 745
    .line 746
    move-object/from16 v10, v20

    .line 747
    .line 748
    move-object/from16 v28, v11

    .line 749
    .line 750
    move-object/from16 v11, v21

    .line 751
    .line 752
    invoke-direct/range {v1 .. v11}, Lpg/e0;-><init>(Lmg/u0;Lng/g;Lmg/e0;Lmg/u;ZZZLmg/b$a;Lmg/w0;Lmg/a1;)V

    .line 753
    .line 754
    .line 755
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    const/4 v2, 0x0

    .line 760
    const/4 v3, 0x0

    .line 761
    const/4 v4, 0x0

    .line 762
    const/16 v16, 0x0

    .line 763
    .line 764
    const/16 v17, 0x3c

    .line 765
    .line 766
    const/4 v5, 0x0

    .line 767
    move-object/from16 v10, v18

    .line 768
    .line 769
    move-object/from16 v11, v22

    .line 770
    .line 771
    move v6, v12

    .line 772
    move-object v12, v1

    .line 773
    move-object v1, v13

    .line 774
    move-object v13, v2

    .line 775
    move-object v2, v14

    .line 776
    move-object v14, v3

    .line 777
    move v7, v15

    .line 778
    move-object v15, v4

    .line 779
    move-object/from16 v18, v5

    .line 780
    .line 781
    invoke-static/range {v10 .. v18}, Lzh/m;->b(Lzh/m;Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;ILjava/lang/Object;)Lzh/m;

    .line 782
    .line 783
    .line 784
    move-result-object v3

    .line 785
    invoke-virtual {v3}, Lzh/m;->f()Lzh/w;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    invoke-virtual/range {p1 .. p1}, Lgh/n;->k0()Lgh/u;

    .line 790
    .line 791
    .line 792
    move-result-object v4

    .line 793
    invoke-static {v4}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 794
    .line 795
    .line 796
    move-result-object v4

    .line 797
    move-object/from16 v5, v27

    .line 798
    .line 799
    invoke-direct {v3, v4, v2, v5}, Lzh/w;->o(Ljava/util/List;Lnh/q;Lzh/b;)Ljava/util/List;

    .line 800
    .line 801
    .line 802
    move-result-object v3

    .line 803
    invoke-static {v3}, Lkotlin/collections/h;->r0(Ljava/util/List;)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    check-cast v3, Lmg/j1;

    .line 808
    .line 809
    move-object/from16 v4, v22

    .line 810
    .line 811
    invoke-virtual {v4, v3}, Lpg/e0;->R0(Lmg/j1;)V

    .line 812
    .line 813
    .line 814
    move-object v9, v4

    .line 815
    goto :goto_7

    .line 816
    :cond_8
    move-object/from16 v28, v11

    .line 817
    .line 818
    move-object v1, v13

    .line 819
    move-object v2, v14

    .line 820
    move v7, v15

    .line 821
    const/4 v6, 0x1

    .line 822
    sget-object v4, Lng/g;->f:Lng/g$a;

    .line 823
    .line 824
    invoke-virtual {v4}, Lng/g$a;->b()Lng/g;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    invoke-static {v1, v3, v4}, Lph/d;->e(Lmg/u0;Lng/g;Lng/g;)Lpg/e0;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    const-string v3, "{\n                Descri\u2026          )\n            }"

    .line 833
    .line 834
    invoke-static {v9, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    goto :goto_7

    .line 838
    :cond_9
    move-object/from16 v28, v11

    .line 839
    .line 840
    move-object v1, v13

    .line 841
    move-object v2, v14

    .line 842
    move v7, v15

    .line 843
    const/4 v6, 0x1

    .line 844
    move-object/from16 v9, v19

    .line 845
    .line 846
    :goto_7
    sget-object v3, Lih/b;->C:Lih/b$b;

    .line 847
    .line 848
    invoke-virtual {v3, v7}, Lih/b$b;->g(I)Ljava/lang/Boolean;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    const-string v4, "HAS_CONSTANT.get(flags)"

    .line 853
    .line 854
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 858
    .line 859
    .line 860
    move-result v3

    .line 861
    if-eqz v3, :cond_a

    .line 862
    .line 863
    new-instance v3, Lzh/w$d;

    .line 864
    .line 865
    invoke-direct {v3, v0, v2, v1}, Lzh/w$d;-><init>(Lzh/w;Lgh/n;Lbi/j;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v1, v3}, Lpg/n0;->L0(Lkotlin/jvm/functions/Function0;)V

    .line 869
    .line 870
    .line 871
    :cond_a
    iget-object v3, v0, Lzh/w;->a:Lzh/m;

    .line 872
    .line 873
    invoke-virtual {v3}, Lzh/m;->e()Lmg/m;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    instance-of v4, v3, Lmg/e;

    .line 878
    .line 879
    if-eqz v4, :cond_b

    .line 880
    .line 881
    check-cast v3, Lmg/e;

    .line 882
    .line 883
    goto :goto_8

    .line 884
    :cond_b
    move-object/from16 v3, v19

    .line 885
    .line 886
    :goto_8
    if-eqz v3, :cond_c

    .line 887
    .line 888
    invoke-interface {v3}, Lmg/e;->g()Lmg/f;

    .line 889
    .line 890
    .line 891
    move-result-object v19

    .line 892
    :cond_c
    move-object/from16 v3, v19

    .line 893
    .line 894
    sget-object v4, Lmg/f;->p:Lmg/f;

    .line 895
    .line 896
    if-ne v3, v4, :cond_d

    .line 897
    .line 898
    new-instance v3, Lzh/w$e;

    .line 899
    .line 900
    invoke-direct {v3, v0, v2, v1}, Lzh/w$e;-><init>(Lzh/w;Lgh/n;Lbi/j;)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1, v3}, Lpg/n0;->L0(Lkotlin/jvm/functions/Function0;)V

    .line 904
    .line 905
    .line 906
    :cond_d
    new-instance v3, Lpg/o;

    .line 907
    .line 908
    const/4 v4, 0x0

    .line 909
    invoke-direct {v0, v2, v4}, Lzh/w;->f(Lgh/n;Z)Lng/g;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    invoke-direct {v3, v4, v1}, Lpg/o;-><init>(Lng/g;Lmg/u0;)V

    .line 914
    .line 915
    .line 916
    new-instance v4, Lpg/o;

    .line 917
    .line 918
    invoke-direct {v0, v2, v6}, Lzh/w;->f(Lgh/n;Z)Lng/g;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    invoke-direct {v4, v2, v1}, Lpg/o;-><init>(Lng/g;Lmg/u0;)V

    .line 923
    .line 924
    .line 925
    move-object/from16 v2, v28

    .line 926
    .line 927
    invoke-virtual {v1, v2, v9, v3, v4}, Lpg/c0;->V0(Lpg/d0;Lmg/w0;Lmg/w;Lmg/w;)V

    .line 928
    .line 929
    .line 930
    return-object v1
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method

.method public final m(Lgh/r;)Lmg/e1;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    const-string v1, "proto"

    .line 6
    .line 7
    invoke-static {v12, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v1, Lng/g;->f:Lng/g$a;

    .line 11
    .line 12
    invoke-virtual/range {p1 .. p1}, Lgh/r;->R()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const-string v3, "proto.annotationList"

    .line 17
    .line 18
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v4, 0xa

    .line 24
    .line 25
    invoke-static {v2, v4}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lgh/b;

    .line 47
    .line 48
    iget-object v5, v0, Lzh/w;->b:Lzh/e;

    .line 49
    .line 50
    const-string v6, "it"

    .line 51
    .line 52
    invoke-static {v4, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v6, v0, Lzh/w;->a:Lzh/m;

    .line 56
    .line 57
    invoke-virtual {v6}, Lzh/m;->g()Lih/c;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v5, v4, v6}, Lzh/e;->a(Lgh/b;Lih/c;)Lng/c;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v1, v3}, Lng/g$a;->a(Ljava/util/List;)Lng/g;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    sget-object v1, Lzh/a0;->a:Lzh/a0;

    .line 74
    .line 75
    sget-object v2, Lih/b;->d:Lih/b$d;

    .line 76
    .line 77
    invoke-virtual/range {p1 .. p1}, Lgh/r;->W()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {v2, v3}, Lih/b$d;->d(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lgh/x;

    .line 86
    .line 87
    invoke-static {v1, v2}, Lzh/b0;->a(Lzh/a0;Lgh/x;)Lmg/u;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    new-instance v15, Lbi/l;

    .line 92
    .line 93
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 94
    .line 95
    invoke-virtual {v1}, Lzh/m;->h()Lci/n;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 100
    .line 101
    invoke-virtual {v1}, Lzh/m;->e()Lmg/m;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 106
    .line 107
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual/range {p1 .. p1}, Lgh/r;->X()I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-static {v1, v5}, Lzh/x;->b(Lih/c;I)Llh/f;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 120
    .line 121
    invoke-virtual {v1}, Lzh/m;->g()Lih/c;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 126
    .line 127
    invoke-virtual {v1}, Lzh/m;->j()Lih/g;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 132
    .line 133
    invoke-virtual {v1}, Lzh/m;->k()Lih/h;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    iget-object v1, v0, Lzh/w;->a:Lzh/m;

    .line 138
    .line 139
    invoke-virtual {v1}, Lzh/m;->d()Lbi/f;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    move-object v1, v15

    .line 144
    move-object/from16 v7, p1

    .line 145
    .line 146
    invoke-direct/range {v1 .. v11}, Lbi/l;-><init>(Lci/n;Lmg/m;Lng/g;Llh/f;Lmg/u;Lgh/r;Lih/c;Lih/g;Lih/h;Lbi/f;)V

    .line 147
    .line 148
    .line 149
    iget-object v13, v0, Lzh/w;->a:Lzh/m;

    .line 150
    .line 151
    invoke-virtual/range {p1 .. p1}, Lgh/r;->a0()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const-string v2, "proto.typeParameterList"

    .line 156
    .line 157
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    const/16 v17, 0x0

    .line 163
    .line 164
    const/16 v18, 0x0

    .line 165
    .line 166
    const/16 v19, 0x0

    .line 167
    .line 168
    const/16 v20, 0x3c

    .line 169
    .line 170
    const/16 v21, 0x0

    .line 171
    .line 172
    move-object v14, v15

    .line 173
    move-object v2, v15

    .line 174
    move-object v15, v1

    .line 175
    invoke-static/range {v13 .. v21}, Lzh/m;->b(Lzh/m;Lmg/m;Ljava/util/List;Lih/c;Lih/g;Lih/h;Lih/a;ILjava/lang/Object;)Lzh/m;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v1}, Lzh/m;->i()Lzh/d0;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v3}, Lzh/d0;->j()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v1}, Lzh/m;->i()Lzh/d0;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    iget-object v5, v0, Lzh/w;->a:Lzh/m;

    .line 192
    .line 193
    invoke-virtual {v5}, Lzh/m;->j()Lih/g;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v12, v5}, Lih/f;->r(Lgh/r;Lih/g;)Lgh/q;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    const/4 v6, 0x0

    .line 202
    invoke-virtual {v4, v5, v6}, Lzh/d0;->l(Lgh/q;Z)Ldi/o0;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v1}, Lzh/m;->i()Lzh/d0;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iget-object v5, v0, Lzh/w;->a:Lzh/m;

    .line 211
    .line 212
    invoke-virtual {v5}, Lzh/m;->j()Lih/g;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-static {v12, v5}, Lih/f;->e(Lgh/r;Lih/g;)Lgh/q;

    .line 217
    .line 218
    .line 219
    move-result-object v5

    .line 220
    invoke-virtual {v1, v5, v6}, Lzh/d0;->l(Lgh/q;Z)Ldi/o0;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-virtual {v2, v3, v4, v1}, Lbi/l;->Q0(Ljava/util/List;Ldi/o0;Ldi/o0;)V

    .line 225
    .line 226
    .line 227
    return-object v2
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
.end method
