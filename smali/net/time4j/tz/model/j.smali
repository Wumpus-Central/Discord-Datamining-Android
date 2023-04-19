.class final Lnet/time4j/tz/model/j;
.super Lnet/time4j/tz/model/l;
.source "SourceFile"


# static fields
.field private static final q:I

.field private static final serialVersionUID:J = 0x2217f45e2079f7cfL


# instance fields
.field private final transient l:Lnet/time4j/tz/q;

.field private final transient m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;"
        }
    .end annotation
.end field

.field private final transient n:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;>;"
        }
    .end annotation
.end field

.field private final transient o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation
.end field

.field private final transient p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/tz/model/l;->f(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-object v2, Lfj/a0;->m:Lfj/a0;

    .line 8
    .line 9
    sget-object v3, Lfj/a0;->l:Lfj/a0;

    .line 10
    .line 11
    invoke-virtual {v2, v0, v1, v3}, Lfj/a0;->l(JLfj/a0;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Lnet/time4j/base/b;->l(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Lnet/time4j/base/b;->i(J)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, Lnet/time4j/tz/model/j;->q:I

    .line 24
    .line 25
    return-void
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
.end method

.method constructor <init>(Lnet/time4j/tz/p;Ljava/util/List;Z)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/tz/p;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    new-instance v6, Lnet/time4j/tz/q;

    const-wide/high16 v1, -0x8000000000000000L

    .line 2
    invoke-virtual {p1}, Lnet/time4j/tz/p;->l()I

    move-result v3

    .line 3
    invoke-virtual {p1}, Lnet/time4j/tz/p;->l()I

    move-result v4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 4
    invoke-direct {p0, v6, p2, p3}, Lnet/time4j/tz/model/j;-><init>(Lnet/time4j/tz/q;Ljava/util/List;Z)V

    return-void
.end method

.method constructor <init>(Lnet/time4j/tz/q;Ljava/util/List;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/tz/q;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;Z)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Lnet/time4j/tz/model/l;-><init>()V

    .line 6
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lnet/time4j/tz/model/j;->n:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 8
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_7

    if-eqz p3, :cond_0

    .line 9
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p2, p3

    .line 10
    :cond_0
    sget-object p3, Lnet/time4j/tz/model/k;->k:Lnet/time4j/tz/model/k;

    invoke-static {p2, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 11
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-le p3, v0, :cond_3

    .line 12
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnet/time4j/tz/model/d;

    if-nez v1, :cond_1

    .line 13
    invoke-virtual {v2}, Lnet/time4j/tz/model/d;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 14
    :cond_1
    invoke-virtual {v2}, Lnet/time4j/tz/model/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    .line 15
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Rules with different calendar systems not permitted."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p3, "iso8601"

    .line 16
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    iput-boolean p3, p0, Lnet/time4j/tz/model/j;->p:Z

    .line 17
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    move-result-wide v1

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long p3, v1, v3

    if-nez p3, :cond_5

    .line 18
    invoke-virtual {p1}, Lnet/time4j/tz/q;->e()I

    move-result p3

    if-nez p3, :cond_4

    .line 19
    new-instance p3, Lnet/time4j/tz/q;

    .line 20
    invoke-static {}, Lnet/time4j/a0;->W()Lfj/h0;

    move-result-object v1

    invoke-virtual {v1}, Lfj/h0;->O()Lfj/k0;

    move-result-object v1

    check-cast v1, Lnet/time4j/a0;

    invoke-virtual {v1}, Lnet/time4j/a0;->u()J

    move-result-wide v2

    .line 21
    invoke-virtual {p1}, Lnet/time4j/tz/q;->j()I

    move-result v4

    .line 22
    invoke-virtual {p1}, Lnet/time4j/tz/q;->j()I

    move-result v5

    const/4 v6, 0x0

    move-object v1, p3

    invoke-direct/range {v1 .. v6}, Lnet/time4j/tz/q;-><init>(JIII)V

    move-object v2, p3

    goto :goto_1

    .line 23
    :cond_4
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Initial transition must not have any dst-offset: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 24
    :cond_5
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Lnet/time4j/tz/model/j;->m(JLnet/time4j/tz/q;Ljava/util/List;)Lnet/time4j/tz/q;

    move-result-object p3

    .line 25
    invoke-virtual {p1}, Lnet/time4j/tz/q;->k()I

    move-result v1

    invoke-virtual {p3}, Lnet/time4j/tz/q;->h()I

    move-result p3

    if-ne v1, p3, :cond_6

    move-object v2, p1

    .line 26
    :goto_1
    iput-object v2, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 27
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 28
    invoke-static {v0}, Lnet/time4j/tz/model/l;->f(I)J

    move-result-wide v6

    const-wide/16 v4, 0x0

    .line 29
    invoke-static/range {v2 .. v7}, Lnet/time4j/tz/model/j;->s(Lnet/time4j/tz/q;Ljava/util/List;JJ)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lnet/time4j/tz/model/j;->o:Ljava/util/List;

    return-void

    .line 30
    :cond_6
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Inconsistent model: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " / "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 31
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Too many daylight saving rules: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 32
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Missing daylight saving rules."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static m(JLnet/time4j/tz/q;Ljava/util/List;)Lnet/time4j/tz/q;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lnet/time4j/tz/q;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;)",
            "Lnet/time4j/tz/q;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual/range {p2 .. p2}, Lnet/time4j/tz/q;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    move-wide/from16 v3, p0

    .line 8
    .line 9
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    invoke-virtual/range {p2 .. p2}, Lnet/time4j/tz/q;->j()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/high16 v5, -0x80000000

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    :goto_0
    if-nez v6, :cond_3

    .line 26
    .line 27
    rem-int v8, v7, v4

    .line 28
    .line 29
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    check-cast v9, Lnet/time4j/tz/model/d;

    .line 34
    .line 35
    add-int/lit8 v10, v7, -0x1

    .line 36
    .line 37
    add-int/2addr v10, v4

    .line 38
    rem-int/2addr v10, v4

    .line 39
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    check-cast v10, Lnet/time4j/tz/model/d;

    .line 44
    .line 45
    invoke-virtual {v10}, Lnet/time4j/tz/model/d;->e()I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    invoke-static {v9, v3, v11}, Lnet/time4j/tz/model/j;->o(Lnet/time4j/tz/model/d;II)I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    if-nez v7, :cond_0

    .line 54
    .line 55
    int-to-long v12, v11

    .line 56
    add-long/2addr v12, v1

    .line 57
    invoke-static {v9, v12, v13}, Lnet/time4j/tz/model/j;->u(Lnet/time4j/tz/model/d;J)I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    if-nez v8, :cond_1

    .line 63
    .line 64
    add-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    :cond_1
    :goto_1
    invoke-static {v9, v5, v11}, Lnet/time4j/tz/model/j;->p(Lnet/time4j/tz/model/d;II)J

    .line 67
    .line 68
    .line 69
    move-result-wide v13

    .line 70
    cmp-long v8, v13, v1

    .line 71
    .line 72
    if-lez v8, :cond_2

    .line 73
    .line 74
    new-instance v6, Lnet/time4j/tz/q;

    .line 75
    .line 76
    invoke-virtual {v10}, Lnet/time4j/tz/model/d;->e()I

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    add-int v15, v3, v8

    .line 81
    .line 82
    invoke-virtual {v9}, Lnet/time4j/tz/model/d;->e()I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    add-int v16, v3, v8

    .line 87
    .line 88
    invoke-virtual {v9}, Lnet/time4j/tz/model/d;->e()I

    .line 89
    .line 90
    .line 91
    move-result v17

    .line 92
    move-object v12, v6

    .line 93
    invoke-direct/range {v12 .. v17}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 94
    .line 95
    .line 96
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    return-object v6
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

.method private static o(Lnet/time4j/tz/model/d;II)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->d()Lnet/time4j/tz/model/i;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lnet/time4j/tz/model/j$a;->a:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    aget v0, v0, v1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    add-int/2addr p1, p2

    .line 23
    return p1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :cond_1
    return p1

    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    return p0
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

.method private static p(Lnet/time4j/tz/model/d;II)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/time4j/tz/model/d;->b(I)Lnet/time4j/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lnet/time4j/tz/model/d;->f()Lnet/time4j/g0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p1, p0}, Lnet/time4j/f0;->s0(Lnet/time4j/g0;)Lnet/time4j/h0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p2}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lnet/time4j/h0;->T(Lnet/time4j/tz/p;)Lnet/time4j/a0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lnet/time4j/a0;->u()J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    return-wide p0
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

.method private q(I)Ljava/util/List;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v0, Lnet/time4j/tz/model/j;->n:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/List;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v4, v0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 25
    .line 26
    invoke-virtual {v4}, Lnet/time4j/tz/q;->j()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    iget-object v5, v0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    const/4 v6, 0x0

    .line 37
    :goto_0
    if-ge v6, v5, :cond_0

    .line 38
    .line 39
    iget-object v7, v0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Lnet/time4j/tz/model/d;

    .line 46
    .line 47
    iget-object v8, v0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 48
    .line 49
    add-int/lit8 v9, v6, -0x1

    .line 50
    .line 51
    add-int/2addr v9, v5

    .line 52
    rem-int/2addr v9, v5

    .line 53
    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    check-cast v8, Lnet/time4j/tz/model/d;

    .line 58
    .line 59
    invoke-virtual {v8}, Lnet/time4j/tz/model/d;->e()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    invoke-static {v7, v4, v9}, Lnet/time4j/tz/model/j;->o(Lnet/time4j/tz/model/d;II)I

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    new-instance v15, Lnet/time4j/tz/q;

    .line 68
    .line 69
    invoke-static {v7, v1, v9}, Lnet/time4j/tz/model/j;->p(Lnet/time4j/tz/model/d;II)J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    invoke-virtual {v8}, Lnet/time4j/tz/model/d;->e()I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    add-int v13, v4, v8

    .line 78
    .line 79
    invoke-virtual {v7}, Lnet/time4j/tz/model/d;->e()I

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    add-int v14, v4, v8

    .line 84
    .line 85
    invoke-virtual {v7}, Lnet/time4j/tz/model/d;->e()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    move-object v10, v15

    .line 90
    move-object v8, v15

    .line 91
    move v15, v7

    .line 92
    invoke-direct/range {v10 .. v15}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    add-int/lit8 v6, v6, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    sget v4, Lnet/time4j/tz/model/j;->q:I

    .line 106
    .line 107
    if-gt v1, v4, :cond_1

    .line 108
    .line 109
    iget-boolean v1, v0, Lnet/time4j/tz/model/j;->p:Z

    .line 110
    .line 111
    if-eqz v1, :cond_1

    .line 112
    .line 113
    iget-object v1, v0, Lnet/time4j/tz/model/j;->n:Ljava/util/concurrent/ConcurrentMap;

    .line 114
    .line 115
    invoke-interface {v1, v2, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/util/List;

    .line 120
    .line 121
    if-eqz v1, :cond_1

    .line 122
    .line 123
    move-object v3, v1

    .line 124
    :cond_1
    return-object v3
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
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
    .line 201
    .line 202
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
.end method

.method private r(Lnet/time4j/base/a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/time4j/tz/model/d;

    invoke-virtual {v0, p1}, Lnet/time4j/tz/model/d;->i(Lnet/time4j/base/a;)I

    move-result p1

    invoke-direct {p0, p1}, Lnet/time4j/tz/model/j;->q(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Serialization proxy required."

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static s(Lnet/time4j/tz/q;Ljava/util/List;JJ)Ljava/util/List;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/tz/q;",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;JJ)",
            "Ljava/util/List<",
            "Lnet/time4j/tz/q;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/tz/q;->f()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    cmp-long v5, v1, p4

    .line 10
    .line 11
    if-gtz v5, :cond_6

    .line 12
    .line 13
    cmp-long v6, p4, v3

    .line 14
    .line 15
    if-lez v6, :cond_5

    .line 16
    .line 17
    if-nez v5, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual/range {p0 .. p0}, Lnet/time4j/tz/q;->j()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/high16 v8, -0x80000000

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    :goto_0
    rem-int v10, v9, v6

    .line 38
    .line 39
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    check-cast v11, Lnet/time4j/tz/model/d;

    .line 44
    .line 45
    add-int/lit8 v12, v9, -0x1

    .line 46
    .line 47
    add-int/2addr v12, v6

    .line 48
    rem-int/2addr v12, v6

    .line 49
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    check-cast v12, Lnet/time4j/tz/model/d;

    .line 54
    .line 55
    invoke-virtual {v12}, Lnet/time4j/tz/model/d;->e()I

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    invoke-static {v11, v7, v13}, Lnet/time4j/tz/model/j;->o(Lnet/time4j/tz/model/d;II)I

    .line 60
    .line 61
    .line 62
    move-result v13

    .line 63
    if-nez v9, :cond_1

    .line 64
    .line 65
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v14

    .line 69
    move/from16 v16, v6

    .line 70
    .line 71
    move/from16 p0, v7

    .line 72
    .line 73
    int-to-long v6, v13

    .line 74
    add-long/2addr v14, v6

    .line 75
    invoke-static {v11, v14, v15}, Lnet/time4j/tz/model/j;->u(Lnet/time4j/tz/model/d;J)I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    move v8, v6

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move/from16 v16, v6

    .line 82
    .line 83
    move/from16 p0, v7

    .line 84
    .line 85
    if-nez v10, :cond_2

    .line 86
    .line 87
    add-int/lit8 v8, v8, 0x1

    .line 88
    .line 89
    :cond_2
    :goto_1
    invoke-static {v11, v8, v13}, Lnet/time4j/tz/model/j;->p(Lnet/time4j/tz/model/d;II)J

    .line 90
    .line 91
    .line 92
    move-result-wide v18

    .line 93
    add-int/lit8 v9, v9, 0x1

    .line 94
    .line 95
    cmp-long v6, v18, p4

    .line 96
    .line 97
    if-ltz v6, :cond_3

    .line 98
    .line 99
    invoke-static {v5}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :cond_3
    cmp-long v6, v18, v1

    .line 105
    .line 106
    if-ltz v6, :cond_4

    .line 107
    .line 108
    cmp-long v6, v18, v3

    .line 109
    .line 110
    if-lez v6, :cond_4

    .line 111
    .line 112
    new-instance v6, Lnet/time4j/tz/q;

    .line 113
    .line 114
    invoke-virtual {v12}, Lnet/time4j/tz/model/d;->e()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    add-int v20, p0, v7

    .line 119
    .line 120
    invoke-virtual {v11}, Lnet/time4j/tz/model/d;->e()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    add-int v21, p0, v7

    .line 125
    .line 126
    invoke-virtual {v11}, Lnet/time4j/tz/model/d;->e()I

    .line 127
    .line 128
    .line 129
    move-result v22

    .line 130
    move-object/from16 v17, v6

    .line 131
    .line 132
    invoke-direct/range {v17 .. v22}, Lnet/time4j/tz/q;-><init>(JIII)V

    .line 133
    .line 134
    .line 135
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_4
    move/from16 v7, p0

    .line 139
    .line 140
    move/from16 v6, v16

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_5
    :goto_2
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 149
    .line 150
    const-string v1, "Start after end."

    .line 151
    .line 152
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw v0
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
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
    .line 201
    .line 202
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
.end method

.method private static u(Lnet/time4j/tz/model/d;J)I
    .locals 2

    .line 1
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    .line 2
    .line 3
    const v1, 0x15180

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2, v1}, Lnet/time4j/base/c;->b(JI)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    sget-object v1, Lfj/a0;->l:Lfj/a0;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2, v1}, Lfj/a0;->l(JLfj/a0;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    invoke-virtual {p0, p1, p2}, Lnet/time4j/tz/model/d;->h(J)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
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

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lnet/time4j/tz/model/SPX;

    const/16 v1, 0x7d

    invoke-direct {v0, p0, v1}, Lnet/time4j/tz/model/SPX;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a(Lnet/time4j/base/a;Lnet/time4j/base/g;)Lnet/time4j/tz/q;
    .locals 2

    .line 1
    invoke-static {p1, p2}, Lnet/time4j/tz/model/l;->j(Lnet/time4j/base/a;Lnet/time4j/base/g;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Lnet/time4j/tz/model/j;->k(Lnet/time4j/base/a;J)Lnet/time4j/tz/q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
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

.method public b()Lnet/time4j/tz/p;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    move-result v0

    invoke-static {v0}, Lnet/time4j/tz/p;->r(I)Lnet/time4j/tz/p;

    move-result-object v0

    return-object v0
.end method

.method public c(Lnet/time4j/base/a;Lnet/time4j/base/g;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "Lnet/time4j/base/g;",
            ")",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p1, p2}, Lnet/time4j/tz/model/l;->j(Lnet/time4j/base/a;Lnet/time4j/base/g;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Lnet/time4j/tz/model/j;->t(Lnet/time4j/base/a;J)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
    .line 10
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

.method public d(Lnet/time4j/base/f;)Lnet/time4j/tz/q;
    .locals 13

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v2, v2, v0

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-gtz v2, :cond_0

    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    iget-object v2, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 18
    .line 19
    invoke-virtual {v2}, Lnet/time4j/tz/q;->j()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    iget-object v4, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v5, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    check-cast v5, Lnet/time4j/tz/model/d;

    .line 37
    .line 38
    iget-object v7, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 39
    .line 40
    add-int/lit8 v8, v4, -0x1

    .line 41
    .line 42
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, Lnet/time4j/tz/model/d;

    .line 47
    .line 48
    invoke-virtual {v7}, Lnet/time4j/tz/model/d;->e()I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-static {v5, v2, v7}, Lnet/time4j/tz/model/j;->o(Lnet/time4j/tz/model/d;II)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    int-to-long v11, v2

    .line 61
    add-long/2addr v9, v11

    .line 62
    invoke-static {v5, v9, v10}, Lnet/time4j/tz/model/j;->u(Lnet/time4j/tz/model/d;J)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-direct {p0, v2}, Lnet/time4j/tz/model/j;->q(I)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    :goto_0
    if-ge v6, v4, :cond_4

    .line 71
    .line 72
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Lnet/time4j/tz/q;

    .line 77
    .line 78
    invoke-virtual {v7}, Lnet/time4j/tz/q;->f()J

    .line 79
    .line 80
    .line 81
    move-result-wide v9

    .line 82
    invoke-interface {p1}, Lnet/time4j/base/f;->u()J

    .line 83
    .line 84
    .line 85
    move-result-wide v11

    .line 86
    cmp-long v11, v11, v9

    .line 87
    .line 88
    if-gez v11, :cond_2

    .line 89
    .line 90
    if-nez v3, :cond_4

    .line 91
    .line 92
    if-nez v6, :cond_1

    .line 93
    .line 94
    add-int/lit8 v2, v2, -0x1

    .line 95
    .line 96
    invoke-direct {p0, v2}, Lnet/time4j/tz/model/j;->q(I)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lnet/time4j/tz/q;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    add-int/lit8 v6, v6, -0x1

    .line 108
    .line 109
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, Lnet/time4j/tz/q;

    .line 114
    .line 115
    :goto_1
    invoke-virtual {p1}, Lnet/time4j/tz/q;->f()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    cmp-long v0, v4, v0

    .line 120
    .line 121
    if-lez v0, :cond_4

    .line 122
    .line 123
    move-object v3, p1

    .line 124
    goto :goto_2

    .line 125
    :cond_2
    cmp-long v9, v9, v0

    .line 126
    .line 127
    if-lez v9, :cond_3

    .line 128
    .line 129
    move-object v3, v7

    .line 130
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    :goto_2
    return-object v3
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
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
    .line 201
    .line 202
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
.end method

.method public e()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/time4j/tz/model/d;

    .line 18
    .line 19
    invoke-virtual {v1}, Lnet/time4j/tz/model/d;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-gez v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    return v0
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

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lnet/time4j/tz/model/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/tz/model/j;

    .line 11
    .line 12
    iget-object v1, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 13
    .line 14
    iget-object v3, p1, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Lnet/time4j/tz/q;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move v0, v2

    .line 34
    :goto_0
    return v0

    .line 35
    :cond_2
    return v2
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

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    invoke-virtual {v0}, Lnet/time4j/tz/q;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x11

    iget-object v1, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x25

    add-int/2addr v0, v1

    return v0
.end method

.method k(Lnet/time4j/base/a;J)Lnet/time4j/tz/q;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 8
    .line 9
    invoke-virtual {v2}, Lnet/time4j/tz/q;->h()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 14
    .line 15
    invoke-virtual {v3}, Lnet/time4j/tz/q;->k()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-long v2, v2

    .line 24
    add-long/2addr v0, v2

    .line 25
    cmp-long v0, p2, v0

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-gtz v0, :cond_0

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_0
    invoke-direct {p0, p1}, Lnet/time4j/tz/model/j;->r(Lnet/time4j/base/a;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lnet/time4j/tz/q;

    .line 50
    .line 51
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-virtual {v0}, Lnet/time4j/tz/q;->l()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    int-to-long v4, v4

    .line 66
    add-long/2addr v4, v2

    .line 67
    cmp-long v4, p2, v4

    .line 68
    .line 69
    if-gez v4, :cond_2

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_2
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    int-to-long v4, v4

    .line 77
    add-long/2addr v2, v4

    .line 78
    cmp-long v2, p2, v2

    .line 79
    .line 80
    if-gez v2, :cond_1

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    invoke-virtual {v0}, Lnet/time4j/tz/q;->m()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    int-to-long v4, v4

    .line 94
    add-long/2addr v4, v2

    .line 95
    cmp-long v4, p2, v4

    .line 96
    .line 97
    if-gez v4, :cond_4

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_4
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    int-to-long v4, v4

    .line 105
    add-long/2addr v2, v4

    .line 106
    cmp-long v2, p2, v2

    .line 107
    .line 108
    if-gez v2, :cond_1

    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_5
    return-object v1
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
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

.method l()Lnet/time4j/tz/q;
    .locals 1

    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    return-object v0
.end method

.method n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnet/time4j/tz/model/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    return-object v0
.end method

.method t(Lnet/time4j/base/a;J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/base/a;",
            "J)",
            "Ljava/util/List<",
            "Lnet/time4j/tz/p;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 8
    .line 9
    invoke-virtual {v2}, Lnet/time4j/tz/q;->k()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 14
    .line 15
    invoke-virtual {v3}, Lnet/time4j/tz/q;->h()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    int-to-long v3, v3

    .line 24
    add-long/2addr v0, v3

    .line 25
    cmp-long v0, p2, v0

    .line 26
    .line 27
    if-gtz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v2}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    invoke-direct {p0, p1}, Lnet/time4j/tz/model/j;->r(Lnet/time4j/base/a;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_5

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lnet/time4j/tz/q;

    .line 53
    .line 54
    invoke-virtual {v0}, Lnet/time4j/tz/q;->f()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    invoke-virtual {v0}, Lnet/time4j/tz/q;->k()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {v0}, Lnet/time4j/tz/q;->l()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    int-to-long v4, v4

    .line 73
    add-long/2addr v4, v1

    .line 74
    cmp-long v4, p2, v4

    .line 75
    .line 76
    if-gez v4, :cond_1

    .line 77
    .line 78
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p1}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    return-object p1

    .line 87
    :cond_1
    int-to-long v4, v3

    .line 88
    add-long/2addr v1, v4

    .line 89
    cmp-long v0, p2, v1

    .line 90
    .line 91
    if-gez v0, :cond_4

    .line 92
    .line 93
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :cond_2
    invoke-virtual {v0}, Lnet/time4j/tz/q;->m()Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    int-to-long v4, v3

    .line 105
    add-long/2addr v4, v1

    .line 106
    cmp-long v4, p2, v4

    .line 107
    .line 108
    if-gez v4, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {p1}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1

    .line 119
    :cond_3
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    int-to-long v4, v4

    .line 124
    add-long/2addr v1, v4

    .line 125
    cmp-long v1, p2, v1

    .line 126
    .line 127
    if-gez v1, :cond_4

    .line 128
    .line 129
    invoke-virtual {v0}, Lnet/time4j/tz/q;->h()I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-static {v3, p1}, Lnet/time4j/tz/model/l;->i(II)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    return-object p1

    .line 138
    :cond_4
    move v2, v3

    .line 139
    goto :goto_0

    .line 140
    :cond_5
    invoke-static {v2}, Lnet/time4j/tz/model/l;->h(I)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    return-object p1
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x100

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lnet/time4j/tz/model/j;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "[initial="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lnet/time4j/tz/model/j;->l:Lnet/time4j/tz/q;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ",rules="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lnet/time4j/tz/model/j;->m:Ljava/util/List;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 v1, 0x5d

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
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
