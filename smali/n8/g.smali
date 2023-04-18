.class public final Ln8/g;
.super Ln8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/g$c;,
        Ln8/g$e;,
        Ln8/g$b;,
        Ln8/g$d;,
        Ln8/g$f;
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:J

.field public final f:J

.field public final g:Z

.field public final h:I

.field public final i:J

.field public final j:I

.field public final k:J

.field public final l:J

.field public final m:Z

.field public final n:Z

.field public final o:Lj7/l;

.field public final p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln8/g$d;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln8/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Ln8/g$c;",
            ">;"
        }
    .end annotation
.end field

.field public final s:J

.field public final t:Ln8/g$f;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLj7/l;Ljava/util/List;Ljava/util/List;Ln8/g$f;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;JJZIJIJJZZZ",
            "Lj7/l;",
            "Ljava/util/List<",
            "Ln8/g$d;",
            ">;",
            "Ljava/util/List<",
            "Ln8/g$b;",
            ">;",
            "Ln8/g$f;",
            "Ljava/util/Map<",
            "Landroid/net/Uri;",
            "Ln8/g$c;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move/from16 v3, p17

    .line 1
    invoke-direct {p0, p2, p3, v3}, Ln8/h;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    move v1, p1

    .line 2
    iput v1, v0, Ln8/g;->d:I

    move-wide v1, p6

    .line 3
    iput-wide v1, v0, Ln8/g;->f:J

    move/from16 v1, p8

    .line 4
    iput-boolean v1, v0, Ln8/g;->g:Z

    move/from16 v1, p9

    .line 5
    iput v1, v0, Ln8/g;->h:I

    move-wide/from16 v1, p10

    .line 6
    iput-wide v1, v0, Ln8/g;->i:J

    move/from16 v1, p12

    .line 7
    iput v1, v0, Ln8/g;->j:I

    move-wide/from16 v1, p13

    .line 8
    iput-wide v1, v0, Ln8/g;->k:J

    move-wide/from16 v1, p15

    .line 9
    iput-wide v1, v0, Ln8/g;->l:J

    move/from16 v1, p18

    .line 10
    iput-boolean v1, v0, Ln8/g;->m:Z

    move/from16 v1, p19

    .line 11
    iput-boolean v1, v0, Ln8/g;->n:Z

    move-object/from16 v1, p20

    .line 12
    iput-object v1, v0, Ln8/g;->o:Lj7/l;

    .line 13
    invoke-static/range {p21 .. p21}, Lbc/i0;->u(Ljava/util/Collection;)Lbc/i0;

    move-result-object v1

    iput-object v1, v0, Ln8/g;->p:Ljava/util/List;

    .line 14
    invoke-static/range {p22 .. p22}, Lbc/i0;->u(Ljava/util/Collection;)Lbc/i0;

    move-result-object v1

    iput-object v1, v0, Ln8/g;->q:Ljava/util/List;

    .line 15
    invoke-static/range {p24 .. p24}, Lbc/l0;->f(Ljava/util/Map;)Lbc/l0;

    move-result-object v1

    iput-object v1, v0, Ln8/g;->r:Ljava/util/Map;

    .line 16
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    .line 17
    invoke-static/range {p22 .. p22}, Lbc/z0;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g$b;

    .line 18
    iget-wide v4, v1, Ln8/g$e;->o:J

    iget-wide v6, v1, Ln8/g$e;->m:J

    add-long/2addr v4, v6

    iput-wide v4, v0, Ln8/g;->s:J

    goto :goto_0

    .line 19
    :cond_0
    invoke-interface/range {p21 .. p21}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 20
    invoke-static/range {p21 .. p21}, Lbc/z0;->c(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/g$d;

    .line 21
    iget-wide v4, v1, Ln8/g$e;->o:J

    iget-wide v6, v1, Ln8/g$e;->m:J

    add-long/2addr v4, v6

    iput-wide v4, v0, Ln8/g;->s:J

    goto :goto_0

    .line 22
    :cond_1
    iput-wide v2, v0, Ln8/g;->s:J

    :goto_0
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, p4, v4

    if-nez v1, :cond_2

    move-wide v1, v4

    goto :goto_1

    :cond_2
    cmp-long v1, p4, v2

    if-ltz v1, :cond_3

    move-wide v1, p4

    goto :goto_1

    .line 23
    :cond_3
    iget-wide v1, v0, Ln8/g;->s:J

    add-long/2addr v1, p4

    :goto_1
    iput-wide v1, v0, Ln8/g;->e:J

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, Ln8/g;->t:Ln8/g$f;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/util/List;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln8/g;->b(Ljava/util/List;)Ln8/g;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/List;)Ln8/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/c;",
            ">;)",
            "Ln8/g;"
        }
    .end annotation

    return-object p0
.end method

.method public c(JI)Ln8/g;
    .locals 27

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move/from16 v10, p3

    new-instance v26, Ln8/g;

    move-object/from16 v1, v26

    iget v2, v0, Ln8/g;->d:I

    iget-object v3, v0, Ln8/h;->a:Ljava/lang/String;

    iget-object v4, v0, Ln8/h;->b:Ljava/util/List;

    iget-wide v5, v0, Ln8/g;->e:J

    const/4 v9, 0x1

    iget-wide v11, v0, Ln8/g;->i:J

    iget v13, v0, Ln8/g;->j:I

    iget-wide v14, v0, Ln8/g;->k:J

    move/from16 p1, v10

    iget-wide v9, v0, Ln8/g;->l:J

    move-wide/from16 v16, v9

    iget-boolean v9, v0, Ln8/h;->c:Z

    move/from16 v18, v9

    iget-boolean v9, v0, Ln8/g;->m:Z

    move/from16 v19, v9

    iget-boolean v9, v0, Ln8/g;->n:Z

    move/from16 v20, v9

    iget-object v9, v0, Ln8/g;->o:Lj7/l;

    move-object/from16 v21, v9

    iget-object v9, v0, Ln8/g;->p:Ljava/util/List;

    move-object/from16 v22, v9

    iget-object v9, v0, Ln8/g;->q:Ljava/util/List;

    move-object/from16 v23, v9

    iget-object v9, v0, Ln8/g;->t:Ln8/g$f;

    move-object/from16 v24, v9

    iget-object v9, v0, Ln8/g;->r:Ljava/util/Map;

    move-object/from16 v25, v9

    move/from16 v10, p1

    const/4 v9, 0x1

    invoke-direct/range {v1 .. v25}, Ln8/g;-><init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLj7/l;Ljava/util/List;Ljava/util/List;Ln8/g$f;Ljava/util/Map;)V

    return-object v26
.end method

.method public d()Ln8/g;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ln8/g;->m:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v1, Ln8/g;

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    iget v3, v0, Ln8/g;->d:I

    .line 12
    .line 13
    iget-object v4, v0, Ln8/h;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v5, v0, Ln8/h;->b:Ljava/util/List;

    .line 16
    .line 17
    iget-wide v6, v0, Ln8/g;->e:J

    .line 18
    .line 19
    iget-wide v8, v0, Ln8/g;->f:J

    .line 20
    .line 21
    iget-boolean v10, v0, Ln8/g;->g:Z

    .line 22
    .line 23
    iget v11, v0, Ln8/g;->h:I

    .line 24
    .line 25
    iget-wide v12, v0, Ln8/g;->i:J

    .line 26
    .line 27
    iget v14, v0, Ln8/g;->j:I

    .line 28
    .line 29
    move-object/from16 v27, v1

    .line 30
    .line 31
    move-object/from16 v28, v2

    .line 32
    .line 33
    iget-wide v1, v0, Ln8/g;->k:J

    .line 34
    .line 35
    move-wide v15, v1

    .line 36
    iget-wide v1, v0, Ln8/g;->l:J

    .line 37
    .line 38
    move-wide/from16 v17, v1

    .line 39
    .line 40
    iget-boolean v1, v0, Ln8/h;->c:Z

    .line 41
    .line 42
    move/from16 v19, v1

    .line 43
    .line 44
    const/16 v20, 0x1

    .line 45
    .line 46
    iget-boolean v1, v0, Ln8/g;->n:Z

    .line 47
    .line 48
    move/from16 v21, v1

    .line 49
    .line 50
    iget-object v1, v0, Ln8/g;->o:Lj7/l;

    .line 51
    .line 52
    move-object/from16 v22, v1

    .line 53
    .line 54
    iget-object v1, v0, Ln8/g;->p:Ljava/util/List;

    .line 55
    .line 56
    move-object/from16 v23, v1

    .line 57
    .line 58
    iget-object v1, v0, Ln8/g;->q:Ljava/util/List;

    .line 59
    .line 60
    move-object/from16 v24, v1

    .line 61
    .line 62
    iget-object v1, v0, Ln8/g;->t:Ln8/g$f;

    .line 63
    .line 64
    move-object/from16 v25, v1

    .line 65
    .line 66
    iget-object v1, v0, Ln8/g;->r:Ljava/util/Map;

    .line 67
    .line 68
    move-object/from16 v26, v1

    .line 69
    .line 70
    move-object/from16 v2, v28

    .line 71
    .line 72
    invoke-direct/range {v2 .. v26}, Ln8/g;-><init>(ILjava/lang/String;Ljava/util/List;JJZIJIJJZZZLj7/l;Ljava/util/List;Ljava/util/List;Ln8/g$f;Ljava/util/Map;)V

    .line 73
    .line 74
    .line 75
    return-object v27
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
.end method

.method public e()J
    .locals 4

    iget-wide v0, p0, Ln8/g;->f:J

    iget-wide v2, p0, Ln8/g;->s:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public f(Ln8/g;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iget-wide v1, p0, Ln8/g;->i:J

    .line 5
    .line 6
    iget-wide v3, p1, Ln8/g;->i:J

    .line 7
    .line 8
    cmp-long v5, v1, v3

    .line 9
    .line 10
    if-lez v5, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    cmp-long v1, v1, v3

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    iget-object v1, p0, Ln8/g;->p:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    iget-object v3, p1, Ln8/g;->p:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    sub-int/2addr v1, v3

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    if-lez v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move v0, v2

    .line 38
    :goto_0
    return v0

    .line 39
    :cond_3
    iget-object v1, p0, Ln8/g;->q:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v3, p1, Ln8/g;->q:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-gt v1, v3, :cond_5

    .line 52
    .line 53
    if-ne v1, v3, :cond_4

    .line 54
    .line 55
    iget-boolean v1, p0, Ln8/g;->m:Z

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    iget-boolean p1, p1, Ln8/g;->m:Z

    .line 60
    .line 61
    if-nez p1, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    move v0, v2

    .line 65
    :cond_5
    :goto_1
    return v0
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
.end method
