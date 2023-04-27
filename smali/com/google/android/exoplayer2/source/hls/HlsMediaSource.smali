.class public final Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;
.super Li8/a;
.source "SourceFile"

# interfaces
.implements Lo8/k$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/hls/HlsMediaSource$Factory;
    }
.end annotation


# instance fields
.field private final A:J

.field private final B:Lcom/google/android/exoplayer2/MediaItem;

.field private C:Lcom/google/android/exoplayer2/MediaItem$f;

.field private D:Le9/x;

.field private final q:Ln8/h;

.field private final r:Lcom/google/android/exoplayer2/MediaItem$g;

.field private final s:Ln8/g;

.field private final t:Li8/h;

.field private final u:Lk7/x;

.field private final v:Lcom/google/android/exoplayer2/upstream/g;

.field private final w:Z

.field private final x:I

.field private final y:Z

.field private final z:Lo8/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.hls"

    .line 2
    .line 3
    invoke-static {v0}, Le7/i;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
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
.end method

.method private constructor <init>(Lcom/google/android/exoplayer2/MediaItem;Ln8/g;Ln8/h;Li8/h;Lk7/x;Lcom/google/android/exoplayer2/upstream/g;Lo8/k;JZIZ)V
    .locals 1

    .line 2
    invoke-direct {p0}, Li8/a;-><init>()V

    .line 3
    iget-object v0, p1, Lcom/google/android/exoplayer2/MediaItem;->b:Lcom/google/android/exoplayer2/MediaItem$g;

    invoke-static {v0}, Lg9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/exoplayer2/MediaItem$g;

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lcom/google/android/exoplayer2/MediaItem;

    .line 5
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 6
    iput-object p2, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Ln8/g;

    .line 7
    iput-object p3, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Ln8/h;

    .line 8
    iput-object p4, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Li8/h;

    .line 9
    iput-object p5, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lk7/x;

    .line 10
    iput-object p6, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lcom/google/android/exoplayer2/upstream/g;

    .line 11
    iput-object p7, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 12
    iput-wide p8, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:J

    .line 13
    iput-boolean p10, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    .line 14
    iput p11, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:I

    .line 15
    iput-boolean p12, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/MediaItem;Ln8/g;Ln8/h;Li8/h;Lk7/x;Lcom/google/android/exoplayer2/upstream/g;Lo8/k;JZIZLcom/google/android/exoplayer2/source/hls/HlsMediaSource$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;-><init>(Lcom/google/android/exoplayer2/MediaItem;Ln8/g;Ln8/h;Li8/h;Lk7/x;Lcom/google/android/exoplayer2/upstream/g;Lo8/k;JZIZ)V

    return-void
.end method

.method private D(Lo8/g;)J
    .locals 4

    .line 1
    iget-boolean v0, p1, Lo8/g;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->A:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Lg9/q0;->Z(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Le7/c;->c(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p1}, Lo8/g;->e()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sub-long/2addr v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    :goto_0
    return-wide v0
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
.end method

.method private static E(Lo8/g;J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lo8/g;->t:Lo8/g$f;

    .line 2
    .line 3
    iget-wide v1, p0, Lo8/g;->e:J

    .line 4
    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-eqz v5, :cond_0

    .line 13
    .line 14
    iget-wide v3, p0, Lo8/g;->s:J

    .line 15
    .line 16
    sub-long/2addr v3, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-wide v1, v0, Lo8/g$f;->d:J

    .line 19
    .line 20
    cmp-long v5, v1, v3

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    iget-wide v5, p0, Lo8/g;->l:J

    .line 25
    .line 26
    cmp-long v5, v5, v3

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    move-wide v3, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-wide v0, v0, Lo8/g$f;->c:J

    .line 33
    .line 34
    cmp-long v2, v0, v3

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    move-wide v3, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-wide/16 v0, 0x3

    .line 41
    .line 42
    iget-wide v2, p0, Lo8/g;->k:J

    .line 43
    .line 44
    mul-long v3, v2, v0

    .line 45
    .line 46
    :goto_0
    add-long/2addr v3, p1

    .line 47
    return-wide v3
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
.end method

.method private F(Lo8/g;J)J
    .locals 4

    .line 1
    iget-object v0, p1, Lo8/g;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    iget-wide v2, p1, Lo8/g;->s:J

    .line 10
    .line 11
    add-long/2addr v2, p2

    .line 12
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 13
    .line 14
    iget-wide p1, p1, Lcom/google/android/exoplayer2/MediaItem$f;->a:J

    .line 15
    .line 16
    invoke-static {p1, p2}, Le7/c;->c(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    sub-long/2addr v2, p1

    .line 21
    :goto_0
    if-lez v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lo8/g$d;

    .line 28
    .line 29
    iget-wide p1, p1, Lo8/g$e;->o:J

    .line 30
    .line 31
    cmp-long p1, p1, v2

    .line 32
    .line 33
    if-lez p1, :cond_0

    .line 34
    .line 35
    add-int/lit8 v1, v1, -0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lo8/g$d;

    .line 43
    .line 44
    iget-wide p1, p1, Lo8/g$e;->o:J

    .line 45
    .line 46
    return-wide p1
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
.end method

.method private G(J)V
    .locals 2

    .line 1
    invoke-static {p1, p2}, Le7/c;->d(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 6
    .line 7
    iget-wide v0, v0, Lcom/google/android/exoplayer2/MediaItem$f;->a:J

    .line 8
    .line 9
    cmp-long v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lcom/google/android/exoplayer2/MediaItem;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/MediaItem;->a()Lcom/google/android/exoplayer2/MediaItem$c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/MediaItem$c;->c(J)Lcom/google/android/exoplayer2/MediaItem$c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/MediaItem$c;->a()Lcom/google/android/exoplayer2/MediaItem;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, Lcom/google/android/exoplayer2/MediaItem;->c:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 30
    .line 31
    :cond_0
    return-void
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
.end method


# virtual methods
.method protected A(Le9/x;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Le9/x;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lk7/x;

    .line 4
    .line 5
    invoke-interface {p1}, Lk7/x;->c()V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Li8/a;->v(Li8/u$a;)Li8/b0$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->r:Lcom/google/android/exoplayer2/MediaItem$g;

    .line 16
    .line 17
    iget-object v1, v1, Lcom/google/android/exoplayer2/MediaItem$g;->a:Landroid/net/Uri;

    .line 18
    .line 19
    invoke-interface {v0, v1, p1, p0}, Lo8/k;->m(Landroid/net/Uri;Li8/b0$a;Lo8/k$e;)V

    .line 20
    .line 21
    .line 22
    return-void
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
.end method

.method protected C()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 2
    .line 3
    invoke-interface {v0}, Lo8/k;->stop()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lk7/x;

    .line 7
    .line 8
    invoke-interface {v0}, Lk7/x;->release()V

    .line 9
    .line 10
    .line 11
    return-void
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
.end method

.method public a(Lo8/g;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lo8/g;->n:Z

    .line 6
    .line 7
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-wide v5, v1, Lo8/g;->f:J

    .line 15
    .line 16
    invoke-static {v5, v6}, Le7/c;->d(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v5

    .line 20
    move-wide v10, v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v10, v3

    .line 23
    :goto_0
    iget v2, v1, Lo8/g;->d:I

    .line 24
    .line 25
    const/4 v5, 0x2

    .line 26
    const/4 v6, 0x1

    .line 27
    if-eq v2, v5, :cond_2

    .line 28
    .line 29
    if-ne v2, v6, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-wide v8, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    move-wide v8, v10

    .line 35
    :goto_2
    iget-wide v12, v1, Lo8/g;->e:J

    .line 36
    .line 37
    new-instance v2, Lcom/google/android/exoplayer2/source/hls/a;

    .line 38
    .line 39
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 40
    .line 41
    invoke-interface {v5}, Lo8/k;->d()Lo8/f;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-static {v5}, Lg9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    check-cast v5, Lo8/f;

    .line 50
    .line 51
    invoke-direct {v2, v5, v1}, Lcom/google/android/exoplayer2/source/hls/a;-><init>(Lo8/f;Lo8/g;)V

    .line 52
    .line 53
    .line 54
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 55
    .line 56
    invoke-interface {v5}, Lo8/k;->h()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_7

    .line 61
    .line 62
    invoke-direct/range {p0 .. p1}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D(Lo8/g;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v14

    .line 66
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 67
    .line 68
    iget-wide v6, v5, Lcom/google/android/exoplayer2/MediaItem$f;->a:J

    .line 69
    .line 70
    cmp-long v5, v6, v3

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    invoke-static {v6, v7}, Le7/c;->c(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    invoke-static {v1, v14, v15}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->E(Lo8/g;J)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    :goto_3
    move-wide/from16 v16, v5

    .line 84
    .line 85
    iget-wide v5, v1, Lo8/g;->s:J

    .line 86
    .line 87
    add-long v20, v5, v14

    .line 88
    .line 89
    move-wide/from16 v18, v14

    .line 90
    .line 91
    invoke-static/range {v16 .. v21}, Lg9/q0;->s(JJJ)J

    .line 92
    .line 93
    .line 94
    move-result-wide v5

    .line 95
    invoke-direct {v0, v5, v6}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->G(J)V

    .line 96
    .line 97
    .line 98
    iget-wide v5, v1, Lo8/g;->f:J

    .line 99
    .line 100
    iget-object v7, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 101
    .line 102
    invoke-interface {v7}, Lo8/k;->c()J

    .line 103
    .line 104
    .line 105
    move-result-wide v16

    .line 106
    sub-long v18, v5, v16

    .line 107
    .line 108
    iget-boolean v5, v1, Lo8/g;->m:Z

    .line 109
    .line 110
    if-eqz v5, :cond_4

    .line 111
    .line 112
    iget-wide v5, v1, Lo8/g;->s:J

    .line 113
    .line 114
    add-long v5, v18, v5

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move-wide v5, v3

    .line 118
    :goto_4
    iget-object v7, v1, Lo8/g;->p:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-nez v7, :cond_5

    .line 125
    .line 126
    invoke-direct {v0, v1, v14, v15}, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->F(Lo8/g;J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    move-wide/from16 v20, v3

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_5
    cmp-long v3, v12, v3

    .line 134
    .line 135
    if-nez v3, :cond_6

    .line 136
    .line 137
    const-wide/16 v20, 0x0

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    move-wide/from16 v20, v12

    .line 141
    .line 142
    :goto_5
    new-instance v3, Li8/r0;

    .line 143
    .line 144
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    iget-wide v14, v1, Lo8/g;->s:J

    .line 150
    .line 151
    const/16 v22, 0x1

    .line 152
    .line 153
    iget-boolean v1, v1, Lo8/g;->m:Z

    .line 154
    .line 155
    const/4 v4, 0x1

    .line 156
    xor-int/lit8 v23, v1, 0x1

    .line 157
    .line 158
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lcom/google/android/exoplayer2/MediaItem;

    .line 159
    .line 160
    move-object/from16 v25, v1

    .line 161
    .line 162
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->C:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 163
    .line 164
    move-object/from16 v26, v1

    .line 165
    .line 166
    move-object v7, v3

    .line 167
    move-wide/from16 v16, v14

    .line 168
    .line 169
    move-wide v14, v5

    .line 170
    move-object/from16 v24, v2

    .line 171
    .line 172
    invoke-direct/range {v7 .. v26}, Li8/r0;-><init>(JJJJJJJZZLjava/lang/Object;Lcom/google/android/exoplayer2/MediaItem;Lcom/google/android/exoplayer2/MediaItem$f;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_7
    cmp-long v3, v12, v3

    .line 177
    .line 178
    if-nez v3, :cond_8

    .line 179
    .line 180
    const-wide/16 v20, 0x0

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_8
    move-wide/from16 v20, v12

    .line 184
    .line 185
    :goto_6
    new-instance v3, Li8/r0;

    .line 186
    .line 187
    move-object v7, v3

    .line 188
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    iget-wide v14, v1, Lo8/g;->s:J

    .line 194
    .line 195
    move-wide/from16 v16, v14

    .line 196
    .line 197
    const-wide/16 v18, 0x0

    .line 198
    .line 199
    const/16 v22, 0x1

    .line 200
    .line 201
    const/16 v23, 0x0

    .line 202
    .line 203
    iget-object v1, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lcom/google/android/exoplayer2/MediaItem;

    .line 204
    .line 205
    move-object/from16 v25, v1

    .line 206
    .line 207
    const/16 v26, 0x0

    .line 208
    .line 209
    move-object/from16 v24, v2

    .line 210
    .line 211
    invoke-direct/range {v7 .. v26}, Li8/r0;-><init>(JJJJJJJZZLjava/lang/Object;Lcom/google/android/exoplayer2/MediaItem;Lcom/google/android/exoplayer2/MediaItem$f;)V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-virtual {v0, v3}, Li8/a;->B(Lcom/google/android/exoplayer2/Timeline;)V

    .line 215
    .line 216
    .line 217
    return-void
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
.end method

.method public c()Lcom/google/android/exoplayer2/MediaItem;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->B:Lcom/google/android/exoplayer2/MediaItem;

    return-object v0
.end method

.method public l(Li8/r;)V
    .locals 0

    check-cast p1, Ln8/k;

    invoke-virtual {p1}, Ln8/k;->B()V

    return-void
.end method

.method public m(Li8/u$a;Le9/b;J)Li8/r;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p1}, Li8/a;->v(Li8/u$a;)Li8/b0$a;

    .line 4
    .line 5
    .line 6
    move-result-object v9

    .line 7
    invoke-virtual/range {p0 .. p1}, Li8/a;->t(Li8/u$a;)Lk7/v$a;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v15, Ln8/k;

    .line 12
    .line 13
    iget-object v2, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->q:Ln8/h;

    .line 14
    .line 15
    iget-object v3, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    .line 16
    .line 17
    iget-object v4, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->s:Ln8/g;

    .line 18
    .line 19
    iget-object v5, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->D:Le9/x;

    .line 20
    .line 21
    iget-object v6, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->u:Lk7/x;

    .line 22
    .line 23
    iget-object v8, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->v:Lcom/google/android/exoplayer2/upstream/g;

    .line 24
    .line 25
    iget-object v11, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->t:Li8/h;

    .line 26
    .line 27
    iget-boolean v12, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->w:Z

    .line 28
    .line 29
    iget v13, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->x:I

    .line 30
    .line 31
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->y:Z

    .line 32
    .line 33
    move-object v1, v15

    .line 34
    move-object/from16 v10, p2

    .line 35
    .line 36
    invoke-direct/range {v1 .. v14}, Ln8/k;-><init>(Ln8/h;Lo8/k;Ln8/g;Le9/x;Lk7/x;Lk7/v$a;Lcom/google/android/exoplayer2/upstream/g;Li8/b0$a;Le9/b;Li8/h;ZIZ)V

    .line 37
    .line 38
    .line 39
    return-object v15
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
.end method

.method public n()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/hls/HlsMediaSource;->z:Lo8/k;

    invoke-interface {v0}, Lo8/k;->j()V

    return-void
.end method
