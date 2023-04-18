.class final Lcom/google/android/exoplayer2/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final s:Lh8/u$a;


# instance fields
.field public final a:Lcom/google/android/exoplayer2/Timeline;

.field public final b:Lh8/u$a;

.field public final c:J

.field public final d:I

.field public final e:Lcom/google/android/exoplayer2/ExoPlaybackException;

.field public final f:Z

.field public final g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public final h:La9/n;

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly7/a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lh8/u$a;

.field public final k:Z

.field public final l:I

.field public final m:Lcom/google/android/exoplayer2/PlaybackParameters;

.field public final n:Z

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh8/u$a;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lh8/u$a;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/google/android/exoplayer2/q0;->s:Lh8/u$a;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Timeline;",
            "Lh8/u$a;",
            "JI",
            "Lcom/google/android/exoplayer2/ExoPlaybackException;",
            "Z",
            "Lcom/google/android/exoplayer2/source/TrackGroupArray;",
            "La9/n;",
            "Ljava/util/List<",
            "Ly7/a;",
            ">;",
            "Lh8/u$a;",
            "ZI",
            "Lcom/google/android/exoplayer2/PlaybackParameters;",
            "JJJZZ)V"
        }
    .end annotation

    move-object v0, p0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    .line 2
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    move-object v1, p2

    .line 3
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    move-wide v1, p3

    .line 4
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->c:J

    move v1, p5

    .line 5
    iput v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    move-object v1, p6

    .line 6
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    move v1, p7

    .line 7
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    move-object v1, p8

    .line 8
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    move-object v1, p9

    .line 9
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    move-object v1, p10

    .line 10
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    move-object v1, p11

    .line 11
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    move v1, p12

    .line 12
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    move/from16 v1, p13

    .line 13
    iput v1, v0, Lcom/google/android/exoplayer2/q0;->l:I

    move-object/from16 v1, p14

    .line 14
    iput-object v1, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-wide/from16 v1, p15

    .line 15
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v1, p17

    .line 16
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v1, p19

    .line 17
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move/from16 v1, p21

    .line 18
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v1, p22

    .line 19
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    return-void
.end method

.method public static k(La9/n;)Lcom/google/android/exoplayer2/q0;
    .locals 24

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    new-instance v23, Lcom/google/android/exoplayer2/q0;

    .line 4
    .line 5
    move-object/from16 v0, v23

    .line 6
    .line 7
    sget-object v1, Lcom/google/android/exoplayer2/Timeline;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    sget-object v2, Lcom/google/android/exoplayer2/q0;->s:Lh8/u$a;

    .line 10
    .line 11
    move-object v11, v2

    .line 12
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    sget-object v8, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 21
    .line 22
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    .line 23
    .line 24
    .line 25
    move-result-object v10

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    sget-object v14, Lcom/google/android/exoplayer2/PlaybackParameters;->d:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 29
    .line 30
    const-wide/16 v15, 0x0

    .line 31
    .line 32
    const-wide/16 v17, 0x0

    .line 33
    .line 34
    const-wide/16 v19, 0x0

    .line 35
    .line 36
    const/16 v21, 0x0

    .line 37
    .line 38
    const/16 v22, 0x0

    .line 39
    .line 40
    invoke-direct/range {v0 .. v22}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    .line 41
    .line 42
    .line 43
    return-object v23
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
.end method

.method public static l()Lh8/u$a;
    .locals 1

    sget-object v0, Lcom/google/android/exoplayer2/q0;->s:Lh8/u$a;

    return-object v0
.end method


# virtual methods
.method public a(Z)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public b(Lh8/u$a;)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v12, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public c(Lh8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh8/u$a;",
            "JJJ",
            "Lcom/google/android/exoplayer2/source/TrackGroupArray;",
            "La9/n;",
            "Ljava/util/List<",
            "Ly7/a;",
            ">;)",
            "Lcom/google/android/exoplayer2/q0;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v20, p2

    move-wide/from16 v4, p4

    move-wide/from16 v18, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public d(Z)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v22, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public e(ZI)Lcom/google/android/exoplayer2/q0;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v13, p1

    move/from16 v14, p2

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public g(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public h(I)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v6, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public i(Z)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v23, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 p1, v1

    move-object/from16 v25, v2

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method

.method public j(Lcom/google/android/exoplayer2/Timeline;)Lcom/google/android/exoplayer2/q0;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v24, Lcom/google/android/exoplayer2/q0;

    move-object/from16 v1, v24

    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->c:J

    iget v6, v0, Lcom/google/android/exoplayer2/q0;->d:I

    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/q0;->f:Z

    iget-object v9, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v10, v0, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    iget-object v11, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    iget-object v12, v0, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    iget-boolean v13, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget v14, v0, Lcom/google/android/exoplayer2/q0;->l:I

    iget-object v15, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    move-object/from16 v25, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    move-wide/from16 v16, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    move-wide/from16 v20, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->n:Z

    move/from16 v22, v1

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    move/from16 v23, v1

    move-object/from16 v2, p1

    move-object/from16 v1, v25

    invoke-direct/range {v1 .. v23}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    return-object v24
.end method
