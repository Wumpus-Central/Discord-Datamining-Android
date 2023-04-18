.class public final Lj8/o;
.super Lj8/a;
.source "SourceFile"


# instance fields
.field private final o:I

.field private final p:Ld7/k;

.field private q:J

.field private r:Z


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Ld7/k;ILjava/lang/Object;JJJILd7/k;)V
    .locals 16

    .line 1
    move-object/from16 v14, p0

    .line 2
    .line 3
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p0

    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    move-object/from16 v3, p3

    .line 20
    .line 21
    move/from16 v4, p4

    .line 22
    .line 23
    move-object/from16 v5, p5

    .line 24
    .line 25
    move-wide/from16 v6, p6

    .line 26
    .line 27
    move-wide/from16 v8, p8

    .line 28
    .line 29
    move-wide/from16 v14, p10

    .line 30
    .line 31
    invoke-direct/range {v0 .. v15}, Lj8/a;-><init>(Lcom/google/android/exoplayer2/upstream/DataSource;Lcom/google/android/exoplayer2/upstream/a;Ld7/k;ILjava/lang/Object;JJJJJ)V

    .line 32
    .line 33
    .line 34
    move/from16 v1, p12

    .line 35
    .line 36
    iput v1, v0, Lj8/o;->o:I

    .line 37
    .line 38
    move-object/from16 v1, p13

    .line 39
    .line 40
    iput-object v1, v0, Lj8/o;->p:Ld7/k;

    .line 41
    .line 42
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lj8/a;->j()Lj8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lj8/c;->b(J)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lj8/o;->o:I

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, Lj8/c;->d(II)Ll7/b0;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-object v0, p0, Lj8/o;->p:Ld7/k;

    .line 18
    .line 19
    invoke-interface {v3, v0}, Ll7/b0;->a(Ld7/k;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lj8/e;->b:Lcom/google/android/exoplayer2/upstream/a;

    .line 23
    .line 24
    iget-wide v4, p0, Lj8/o;->q:J

    .line 25
    .line 26
    invoke-virtual {v0, v4, v5}, Lcom/google/android/exoplayer2/upstream/a;->e(J)Lcom/google/android/exoplayer2/upstream/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v1, p0, Lj8/e;->i:Ld9/v;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ld9/v;->b(Lcom/google/android/exoplayer2/upstream/a;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    const-wide/16 v4, -0x1

    .line 37
    .line 38
    cmp-long v4, v0, v4

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    iget-wide v4, p0, Lj8/o;->q:J

    .line 43
    .line 44
    add-long/2addr v0, v4

    .line 45
    :cond_0
    move-wide v8, v0

    .line 46
    new-instance v0, Ll7/f;

    .line 47
    .line 48
    iget-object v5, p0, Lj8/e;->i:Ld9/v;

    .line 49
    .line 50
    iget-wide v6, p0, Lj8/o;->q:J

    .line 51
    .line 52
    move-object v4, v0

    .line 53
    invoke-direct/range {v4 .. v9}, Ll7/f;-><init>(Ld9/h;JJ)V

    .line 54
    .line 55
    .line 56
    :goto_0
    const/4 v1, -0x1

    .line 57
    const/4 v10, 0x1

    .line 58
    if-eq v2, v1, :cond_1

    .line 59
    .line 60
    iget-wide v4, p0, Lj8/o;->q:J

    .line 61
    .line 62
    int-to-long v1, v2

    .line 63
    add-long/2addr v4, v1

    .line 64
    iput-wide v4, p0, Lj8/o;->q:J

    .line 65
    .line 66
    const v1, 0x7fffffff

    .line 67
    .line 68
    .line 69
    invoke-interface {v3, v0, v1, v10}, Ll7/b0;->c(Ld9/h;IZ)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-wide v0, p0, Lj8/o;->q:J

    .line 75
    .line 76
    long-to-int v7, v0

    .line 77
    iget-wide v4, p0, Lj8/e;->g:J

    .line 78
    .line 79
    const/4 v6, 0x1

    .line 80
    const/4 v8, 0x0

    .line 81
    const/4 v9, 0x0

    .line 82
    invoke-interface/range {v3 .. v9}, Ll7/b0;->d(JIIILl7/b0$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lj8/e;->i:Ld9/v;

    .line 86
    .line 87
    invoke-static {v0}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 88
    .line 89
    .line 90
    iput-boolean v10, p0, Lj8/o;->r:Z

    .line 91
    .line 92
    return-void

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    iget-object v1, p0, Lj8/e;->i:Ld9/v;

    .line 95
    .line 96
    invoke-static {v1}, Lf9/q0;->n(Lcom/google/android/exoplayer2/upstream/DataSource;)V

    .line 97
    .line 98
    .line 99
    throw v0
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

.method public b()V
    .locals 0

    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lj8/o;->r:Z

    return v0
.end method
