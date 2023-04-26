.class public final Lcom/google/android/exoplayer2/upstream/cache/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/upstream/DataSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/upstream/cache/c$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/exoplayer2/upstream/cache/a;

.field private final b:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private final c:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private final d:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private final e:Le9/c;

.field private final f:Z

.field private final g:Z

.field private final h:Z

.field private i:Landroid/net/Uri;

.field private j:Lcom/google/android/exoplayer2/upstream/a;

.field private k:Lcom/google/android/exoplayer2/upstream/DataSource;

.field private l:Z

.field private m:J

.field private n:J

.field private o:Le9/d;

.field private p:Z

.field private q:Z

.field private r:J

.field private s:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;ILcom/google/android/exoplayer2/upstream/cache/c$a;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lcom/google/android/exoplayer2/upstream/cache/c;-><init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;ILcom/google/android/exoplayer2/upstream/cache/c$a;Le9/c;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;ILcom/google/android/exoplayer2/upstream/cache/c$a;Le9/c;)V
    .locals 10

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p7

    move v6, p5

    move-object/from16 v9, p6

    .line 2
    invoke-direct/range {v0 .. v9}, Lcom/google/android/exoplayer2/upstream/cache/c;-><init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;Le9/c;ILf9/a0;ILcom/google/android/exoplayer2/upstream/cache/c$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/android/exoplayer2/upstream/cache/a;Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;Le9/c;ILf9/a0;ILcom/google/android/exoplayer2/upstream/cache/c$a;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 5
    iput-object p3, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->b:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-eqz p5, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    sget-object p5, Le9/c;->a:Le9/c;

    :goto_0
    iput-object p5, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->e:Le9/c;

    and-int/lit8 p1, p6, 0x1

    const/4 p3, 0x0

    const/4 p5, 0x1

    if-eqz p1, :cond_1

    move p1, p5

    goto :goto_1

    :cond_1
    move p1, p3

    .line 7
    :goto_1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->f:Z

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_2

    move p1, p5

    goto :goto_2

    :cond_2
    move p1, p3

    .line 8
    :goto_2
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->g:Z

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_3

    move p3, p5

    .line 9
    :cond_3
    iput-boolean p3, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->h:Z

    const/4 p1, 0x0

    if-eqz p2, :cond_6

    if-eqz p7, :cond_4

    .line 10
    new-instance p3, Ld9/u;

    invoke-direct {p3, p2, p7, p8}, Ld9/u;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lf9/a0;I)V

    move-object p2, p3

    .line 11
    :cond_4
    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-eqz p4, :cond_5

    .line 12
    new-instance p1, Ld9/w;

    invoke-direct {p1, p2, p4}, Ld9/w;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Ld9/j;)V

    .line 13
    :cond_5
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->c:Lcom/google/android/exoplayer2/upstream/DataSource;

    goto :goto_3

    .line 14
    :cond_6
    sget-object p2, Lcom/google/android/exoplayer2/upstream/e;->a:Lcom/google/android/exoplayer2/upstream/e;

    iput-object p2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 15
    iput-object p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->c:Lcom/google/android/exoplayer2/upstream/DataSource;

    :goto_3
    return-void
.end method

.method private o()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 12
    .line 13
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->o:Le9/d;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 20
    .line 21
    invoke-interface {v1, v0}, Lcom/google/android/exoplayer2/upstream/cache/a;->f(Le9/d;)V

    .line 22
    .line 23
    .line 24
    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->o:Le9/d;

    .line 25
    .line 26
    :cond_1
    return-void

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 29
    .line 30
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 31
    .line 32
    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->o:Le9/d;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object v3, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 37
    .line 38
    invoke-interface {v3, v1}, Lcom/google/android/exoplayer2/upstream/cache/a;->f(Le9/d;)V

    .line 39
    .line 40
    .line 41
    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->o:Le9/d;

    .line 42
    .line 43
    :cond_2
    throw v0
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
.end method

.method private static p(Lcom/google/android/exoplayer2/upstream/cache/a;Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;
    .locals 0

    invoke-interface {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/a;->b(Ljava/lang/String;)Le9/f;

    move-result-object p0

    invoke-static {p0}, Le9/e;->b(Le9/f;)Landroid/net/Uri;

    move-result-object p0

    if-eqz p0, :cond_0

    move-object p2, p0

    :cond_0
    return-object p2
.end method

.method private q(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    instance-of p1, p1, Lcom/google/android/exoplayer2/upstream/cache/a$a;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    :cond_0
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->p:Z

    .line 13
    .line 14
    :cond_1
    return-void
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
.end method

.method private r()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private s()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->b:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private t()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->s()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private u()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->c:Lcom/google/android/exoplayer2/upstream/DataSource;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private v()V
    .locals 0

    return-void
.end method

.method private w(I)V
    .locals 0

    return-void
.end method

.method private x(Lcom/google/android/exoplayer2/upstream/a;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/exoplayer2/upstream/a;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v2}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/String;

    .line 12
    .line 13
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->q:Z

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    move-object v3, v9

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->f:Z

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    :try_start_0
    iget-object v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 25
    .line 26
    iget-wide v5, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 27
    .line 28
    iget-wide v7, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 29
    .line 30
    move-object v4, v2

    .line 31
    invoke-interface/range {v3 .. v8}, Lcom/google/android/exoplayer2/upstream/cache/a;->g(Ljava/lang/String;JJ)Le9/d;

    .line 32
    .line 33
    .line 34
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    goto :goto_0

    .line 36
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 41
    .line 42
    .line 43
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    iget-object v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 50
    .line 51
    iget-wide v5, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 52
    .line 53
    iget-wide v7, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 54
    .line 55
    move-object v4, v2

    .line 56
    invoke-interface/range {v3 .. v8}, Lcom/google/android/exoplayer2/upstream/cache/a;->c(Ljava/lang/String;JJ)Le9/d;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :goto_0
    const-wide/16 v4, -0x1

    .line 61
    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 65
    .line 66
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/a;->a()Lcom/google/android/exoplayer2/upstream/a$b;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 71
    .line 72
    invoke-virtual {v7, v10, v11}, Lcom/google/android/exoplayer2/upstream/a$b;->h(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 77
    .line 78
    invoke-virtual {v7, v10, v11}, Lcom/google/android/exoplayer2/upstream/a$b;->g(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-virtual {v7}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :cond_2
    iget-boolean v6, v3, Le9/d;->n:Z

    .line 89
    .line 90
    if-eqz v6, :cond_4

    .line 91
    .line 92
    iget-object v6, v3, Le9/d;->o:Ljava/io/File;

    .line 93
    .line 94
    invoke-static {v6}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Ljava/io/File;

    .line 99
    .line 100
    invoke-static {v6}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iget-wide v7, v3, Le9/d;->l:J

    .line 105
    .line 106
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 107
    .line 108
    sub-long/2addr v10, v7

    .line 109
    iget-wide v12, v3, Le9/d;->m:J

    .line 110
    .line 111
    sub-long/2addr v12, v10

    .line 112
    iget-wide v14, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 113
    .line 114
    cmp-long v16, v14, v4

    .line 115
    .line 116
    if-eqz v16, :cond_3

    .line 117
    .line 118
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/a;->a()Lcom/google/android/exoplayer2/upstream/a$b;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-virtual {v14, v6}, Lcom/google/android/exoplayer2/upstream/a$b;->i(Landroid/net/Uri;)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v6, v7, v8}, Lcom/google/android/exoplayer2/upstream/a$b;->k(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-virtual {v6, v10, v11}, Lcom/google/android/exoplayer2/upstream/a$b;->h(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-virtual {v6, v12, v13}, Lcom/google/android/exoplayer2/upstream/a$b;->g(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v6}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->b:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    invoke-virtual {v3}, Le9/d;->c()Z

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    if-eqz v6, :cond_5

    .line 154
    .line 155
    iget-wide v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_5
    iget-wide v6, v3, Le9/d;->m:J

    .line 159
    .line 160
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 161
    .line 162
    cmp-long v8, v10, v4

    .line 163
    .line 164
    if-eqz v8, :cond_6

    .line 165
    .line 166
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 167
    .line 168
    .line 169
    move-result-wide v6

    .line 170
    :cond_6
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/upstream/a;->a()Lcom/google/android/exoplayer2/upstream/a$b;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 175
    .line 176
    invoke-virtual {v8, v10, v11}, Lcom/google/android/exoplayer2/upstream/a$b;->h(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {v8, v6, v7}, Lcom/google/android/exoplayer2/upstream/a$b;->g(J)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->c:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 189
    .line 190
    if-eqz v6, :cond_7

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_7
    iget-object v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 194
    .line 195
    iget-object v8, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 196
    .line 197
    invoke-interface {v8, v3}, Lcom/google/android/exoplayer2/upstream/cache/a;->f(Le9/d;)V

    .line 198
    .line 199
    .line 200
    move-object v3, v9

    .line 201
    :goto_2
    iget-boolean v8, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->q:Z

    .line 202
    .line 203
    if-nez v8, :cond_8

    .line 204
    .line 205
    iget-object v8, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 206
    .line 207
    if-ne v6, v8, :cond_8

    .line 208
    .line 209
    iget-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 210
    .line 211
    const-wide/32 v12, 0x19000

    .line 212
    .line 213
    .line 214
    add-long/2addr v10, v12

    .line 215
    goto :goto_3

    .line 216
    :cond_8
    const-wide v10, 0x7fffffffffffffffL

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    :goto_3
    iput-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->s:J

    .line 222
    .line 223
    if-eqz p2, :cond_b

    .line 224
    .line 225
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->r()Z

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    invoke-static {v8}, Lf9/a;->f(Z)V

    .line 230
    .line 231
    .line 232
    iget-object v8, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 233
    .line 234
    if-ne v6, v8, :cond_9

    .line 235
    .line 236
    return-void

    .line 237
    :cond_9
    :try_start_1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->o()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 238
    .line 239
    .line 240
    goto :goto_4

    .line 241
    :catchall_0
    move-exception v0

    .line 242
    move-object v2, v0

    .line 243
    invoke-static {v3}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Le9/d;

    .line 248
    .line 249
    invoke-virtual {v0}, Le9/d;->b()Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_a

    .line 254
    .line 255
    iget-object v0, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 256
    .line 257
    invoke-interface {v0, v3}, Lcom/google/android/exoplayer2/upstream/cache/a;->f(Le9/d;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    throw v2

    .line 261
    :cond_b
    :goto_4
    if-eqz v3, :cond_c

    .line 262
    .line 263
    invoke-virtual {v3}, Le9/d;->b()Z

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    if-eqz v8, :cond_c

    .line 268
    .line 269
    iput-object v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->o:Le9/d;

    .line 270
    .line 271
    :cond_c
    iput-object v6, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 272
    .line 273
    iget-wide v10, v7, Lcom/google/android/exoplayer2/upstream/a;->h:J

    .line 274
    .line 275
    cmp-long v3, v10, v4

    .line 276
    .line 277
    const/4 v8, 0x1

    .line 278
    if-nez v3, :cond_d

    .line 279
    .line 280
    move v3, v8

    .line 281
    goto :goto_5

    .line 282
    :cond_d
    const/4 v3, 0x0

    .line 283
    :goto_5
    iput-boolean v3, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 284
    .line 285
    invoke-interface {v6, v7}, Lcom/google/android/exoplayer2/upstream/DataSource;->b(Lcom/google/android/exoplayer2/upstream/a;)J

    .line 286
    .line 287
    .line 288
    move-result-wide v10

    .line 289
    new-instance v3, Le9/g;

    .line 290
    .line 291
    invoke-direct {v3}, Le9/g;-><init>()V

    .line 292
    .line 293
    .line 294
    iget-boolean v7, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 295
    .line 296
    if-eqz v7, :cond_e

    .line 297
    .line 298
    cmp-long v4, v10, v4

    .line 299
    .line 300
    if-eqz v4, :cond_e

    .line 301
    .line 302
    iput-wide v10, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 303
    .line 304
    iget-wide v4, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 305
    .line 306
    add-long/2addr v4, v10

    .line 307
    invoke-static {v3, v4, v5}, Le9/g;->g(Le9/g;J)Le9/g;

    .line 308
    .line 309
    .line 310
    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->t()Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_10

    .line 315
    .line 316
    invoke-interface {v6}, Lcom/google/android/exoplayer2/upstream/DataSource;->m()Landroid/net/Uri;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    iput-object v4, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->i:Landroid/net/Uri;

    .line 321
    .line 322
    iget-object v0, v0, Lcom/google/android/exoplayer2/upstream/a;->a:Landroid/net/Uri;

    .line 323
    .line 324
    invoke-virtual {v0, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    xor-int/2addr v0, v8

    .line 329
    if-eqz v0, :cond_f

    .line 330
    .line 331
    iget-object v9, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->i:Landroid/net/Uri;

    .line 332
    .line 333
    :cond_f
    invoke-static {v3, v9}, Le9/g;->h(Le9/g;Landroid/net/Uri;)Le9/g;

    .line 334
    .line 335
    .line 336
    :cond_10
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->u()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_11

    .line 341
    .line 342
    iget-object v0, v1, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 343
    .line 344
    invoke-interface {v0, v2, v3}, Lcom/google/android/exoplayer2/upstream/cache/a;->e(Ljava/lang/String;Le9/g;)V

    .line 345
    .line 346
    .line 347
    :cond_11
    return-void
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
.end method

.method private y(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Le9/g;

    .line 12
    .line 13
    invoke-direct {v0}, Le9/g;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Le9/g;->g(Le9/g;J)Le9/g;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 22
    .line 23
    invoke-interface {v1, p1, v0}, Lcom/google/android/exoplayer2/upstream/cache/a;->e(Ljava/lang/String;Le9/g;)V

    .line 24
    .line 25
    .line 26
    :cond_0
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

.method private z(Lcom/google/android/exoplayer2/upstream/a;)I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->p:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->h:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-wide v0, p1, Lcom/google/android/exoplayer2/upstream/a;->h:J

    .line 16
    .line 17
    const-wide/16 v2, -0x1

    .line 18
    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_1
    const/4 p1, -0x1

    .line 26
    return p1
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
.end method


# virtual methods
.method public b(Lcom/google/android/exoplayer2/upstream/a;)J
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->e:Le9/c;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Le9/c;->a(Lcom/google/android/exoplayer2/upstream/a;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/upstream/a;->a()Lcom/google/android/exoplayer2/upstream/a$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/upstream/a$b;->f(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/a$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/upstream/a$b;->a()Lcom/google/android/exoplayer2/upstream/a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->j:Lcom/google/android/exoplayer2/upstream/a;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 22
    .line 23
    iget-object v3, v1, Lcom/google/android/exoplayer2/upstream/a;->a:Landroid/net/Uri;

    .line 24
    .line 25
    invoke-static {v2, v0, v3}, Lcom/google/android/exoplayer2/upstream/cache/c;->p(Lcom/google/android/exoplayer2/upstream/cache/a;Ljava/lang/String;Landroid/net/Uri;)Landroid/net/Uri;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iput-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->i:Landroid/net/Uri;

    .line 30
    .line 31
    iget-wide v2, p1, Lcom/google/android/exoplayer2/upstream/a;->g:J

    .line 32
    .line 33
    iput-wide v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 34
    .line 35
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->z(Lcom/google/android/exoplayer2/upstream/a;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v3, -0x1

    .line 40
    const/4 v4, 0x0

    .line 41
    if-eq v2, v3, :cond_0

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v3, v4

    .line 46
    :goto_0
    iput-boolean v3, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->q:Z

    .line 47
    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-direct {p0, v2}, Lcom/google/android/exoplayer2/upstream/cache/c;->w(I)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-wide v2, p1, Lcom/google/android/exoplayer2/upstream/a;->h:J

    .line 54
    .line 55
    const-wide/16 v5, -0x1

    .line 56
    .line 57
    cmp-long v7, v2, v5

    .line 58
    .line 59
    if-nez v7, :cond_4

    .line 60
    .line 61
    iget-boolean v7, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->q:Z

    .line 62
    .line 63
    if-eqz v7, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->a:Lcom/google/android/exoplayer2/upstream/cache/a;

    .line 67
    .line 68
    invoke-interface {v2, v0}, Lcom/google/android/exoplayer2/upstream/cache/a;->b(Ljava/lang/String;)Le9/f;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Le9/e;->a(Le9/f;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v2

    .line 76
    iput-wide v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 77
    .line 78
    cmp-long v0, v2, v5

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    iget-wide v5, p1, Lcom/google/android/exoplayer2/upstream/a;->g:J

    .line 83
    .line 84
    sub-long/2addr v2, v5

    .line 85
    iput-wide v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 86
    .line 87
    const-wide/16 v5, 0x0

    .line 88
    .line 89
    cmp-long p1, v2, v5

    .line 90
    .line 91
    if-lez p1, :cond_3

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    new-instance p1, Ld9/l;

    .line 95
    .line 96
    invoke-direct {p1, v4}, Ld9/l;-><init>(I)V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_4
    :goto_1
    iput-wide v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 101
    .line 102
    :cond_5
    :goto_2
    invoke-direct {p0, v1, v4}, Lcom/google/android/exoplayer2/upstream/cache/c;->x(Lcom/google/android/exoplayer2/upstream/a;Z)V

    .line 103
    .line 104
    .line 105
    iget-wide v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    return-wide v0

    .line 108
    :catchall_0
    move-exception p1

    .line 109
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->q(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw p1
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

.method public close()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->j:Lcom/google/android/exoplayer2/upstream/a;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->i:Landroid/net/Uri;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->v()V

    .line 11
    .line 12
    .line 13
    :try_start_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/upstream/cache/c;->q(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    throw v0
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
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/google/android/exoplayer2/upstream/DataSource;->d()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    return-object v0
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
.end method

.method public h(Ld9/x;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->b:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/upstream/DataSource;->h(Ld9/x;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->d:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/google/android/exoplayer2/upstream/DataSource;->h(Ld9/x;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method public m()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->i:Landroid/net/Uri;

    return-object v0
.end method

.method public read([BII)I
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->j:Lcom/google/android/exoplayer2/upstream/a;

    .line 2
    .line 3
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/exoplayer2/upstream/a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez p3, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-wide v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    const/4 v3, -0x1

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    return v3

    .line 23
    :cond_1
    :try_start_0
    iget-wide v6, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 24
    .line 25
    iget-wide v8, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->s:J

    .line 26
    .line 27
    cmp-long v2, v6, v8

    .line 28
    .line 29
    if-ltz v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {p0, v0, v2}, Lcom/google/android/exoplayer2/upstream/cache/c;->x(Lcom/google/android/exoplayer2/upstream/a;Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    iget-object v2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->k:Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 36
    .line 37
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/google/android/exoplayer2/upstream/DataSource;

    .line 42
    .line 43
    invoke-interface {v2, p1, p2, p3}, Ld9/h;->read([BII)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-wide/16 v6, -0x1

    .line 48
    .line 49
    if-eq v2, v3, :cond_4

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->s()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    iget-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->r:J

    .line 58
    .line 59
    int-to-long v4, v2

    .line 60
    add-long/2addr p1, v4

    .line 61
    iput-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->r:J

    .line 62
    .line 63
    :cond_3
    iget-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 64
    .line 65
    int-to-long v4, v2

    .line 66
    add-long/2addr p1, v4

    .line 67
    iput-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->m:J

    .line 68
    .line 69
    iget-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 70
    .line 71
    cmp-long p3, p1, v6

    .line 72
    .line 73
    if-eqz p3, :cond_6

    .line 74
    .line 75
    sub-long/2addr p1, v4

    .line 76
    iput-wide p1, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    iget-boolean v8, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 80
    .line 81
    if-eqz v8, :cond_5

    .line 82
    .line 83
    iget-object p1, v0, Lcom/google/android/exoplayer2/upstream/a;->i:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {p1}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    iget-wide v8, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->n:J

    .line 96
    .line 97
    cmp-long v4, v8, v4

    .line 98
    .line 99
    if-gtz v4, :cond_7

    .line 100
    .line 101
    cmp-long v4, v8, v6

    .line 102
    .line 103
    if-nez v4, :cond_6

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    :goto_0
    return v2

    .line 107
    :cond_7
    :goto_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/upstream/cache/c;->o()V

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/upstream/cache/c;->x(Lcom/google/android/exoplayer2/upstream/a;Z)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/upstream/cache/c;->read([BII)I

    .line 114
    .line 115
    .line 116
    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    return p1

    .line 118
    :catchall_0
    move-exception p1

    .line 119
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->q(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :catch_0
    move-exception p1

    .line 124
    iget-boolean p2, p0, Lcom/google/android/exoplayer2/upstream/cache/c;->l:Z

    .line 125
    .line 126
    if-eqz p2, :cond_8

    .line 127
    .line 128
    invoke-static {p1}, Ld9/l;->a(Ljava/io/IOException;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_8

    .line 133
    .line 134
    iget-object p1, v0, Lcom/google/android/exoplayer2/upstream/a;->i:Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {p1}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->y(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return v3

    .line 146
    :cond_8
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/upstream/cache/c;->q(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw p1
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
.end method
