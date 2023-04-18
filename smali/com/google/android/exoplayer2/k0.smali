.class final Lcom/google/android/exoplayer2/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lh8/u$a;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:Z

.field public final g:Z

.field public final h:Z


# direct methods
.method constructor <init>(Lh8/u$a;JJJJZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, Lcom/google/android/exoplayer2/k0;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, Lcom/google/android/exoplayer2/k0;->d:J

    .line 11
    .line 12
    iput-wide p8, p0, Lcom/google/android/exoplayer2/k0;->e:J

    .line 13
    .line 14
    iput-boolean p10, p0, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 15
    .line 16
    iput-boolean p11, p0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 17
    .line 18
    iput-boolean p12, p0, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 19
    .line 20
    return-void
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
.end method


# virtual methods
.method public a(J)Lcom/google/android/exoplayer2/k0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/google/android/exoplayer2/k0;->c:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Lcom/google/android/exoplayer2/k0;

    .line 12
    .line 13
    iget-object v4, v0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 14
    .line 15
    iget-wide v5, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 16
    .line 17
    iget-wide v9, v0, Lcom/google/android/exoplayer2/k0;->d:J

    .line 18
    .line 19
    iget-wide v11, v0, Lcom/google/android/exoplayer2/k0;->e:J

    .line 20
    .line 21
    iget-boolean v13, v0, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 22
    .line 23
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 24
    .line 25
    iget-boolean v15, v0, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    move-wide/from16 v7, p1

    .line 29
    .line 30
    invoke-direct/range {v3 .. v15}, Lcom/google/android/exoplayer2/k0;-><init>(Lh8/u$a;JJJJZZZ)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v1
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
.end method

.method public b(J)Lcom/google/android/exoplayer2/k0;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v1, Lcom/google/android/exoplayer2/k0;

    .line 12
    .line 13
    iget-object v4, v0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 14
    .line 15
    iget-wide v7, v0, Lcom/google/android/exoplayer2/k0;->c:J

    .line 16
    .line 17
    iget-wide v9, v0, Lcom/google/android/exoplayer2/k0;->d:J

    .line 18
    .line 19
    iget-wide v11, v0, Lcom/google/android/exoplayer2/k0;->e:J

    .line 20
    .line 21
    iget-boolean v13, v0, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 22
    .line 23
    iget-boolean v14, v0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 24
    .line 25
    iget-boolean v15, v0, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 26
    .line 27
    move-object v3, v1

    .line 28
    move-wide/from16 v5, p1

    .line 29
    .line 30
    invoke-direct/range {v3 .. v15}, Lcom/google/android/exoplayer2/k0;-><init>(Lh8/u$a;JJJJZZZ)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v1
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, Lcom/google/android/exoplayer2/k0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    check-cast p1, Lcom/google/android/exoplayer2/k0;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 20
    .line 21
    iget-wide v4, p1, Lcom/google/android/exoplayer2/k0;->b:J

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->c:J

    .line 28
    .line 29
    iget-wide v4, p1, Lcom/google/android/exoplayer2/k0;->c:J

    .line 30
    .line 31
    cmp-long v2, v2, v4

    .line 32
    .line 33
    if-nez v2, :cond_2

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->d:J

    .line 36
    .line 37
    iget-wide v4, p1, Lcom/google/android/exoplayer2/k0;->d:J

    .line 38
    .line 39
    cmp-long v2, v2, v4

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->e:J

    .line 44
    .line 45
    iget-wide v4, p1, Lcom/google/android/exoplayer2/k0;->e:J

    .line 46
    .line 47
    cmp-long v2, v2, v4

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 52
    .line 53
    iget-boolean v3, p1, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 54
    .line 55
    if-ne v2, v3, :cond_2

    .line 56
    .line 57
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 58
    .line 59
    iget-boolean v3, p1, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 60
    .line 61
    if-ne v2, v3, :cond_2

    .line 62
    .line 63
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 64
    .line 65
    iget-boolean v3, p1, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 66
    .line 67
    if-ne v2, v3, :cond_2

    .line 68
    .line 69
    iget-object v2, p0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 70
    .line 71
    iget-object p1, p1, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 72
    .line 73
    invoke-static {v2, p1}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    move v0, v1

    .line 81
    :goto_0
    return v0

    .line 82
    :cond_3
    :goto_1
    return v1
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

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh8/s;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20f

    .line 8
    .line 9
    add-int/2addr v1, v0

    .line 10
    mul-int/lit8 v1, v1, 0x1f

    .line 11
    .line 12
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 13
    .line 14
    long-to-int v0, v2

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->c:J

    .line 19
    .line 20
    long-to-int v0, v2

    .line 21
    add-int/2addr v1, v0

    .line 22
    mul-int/lit8 v1, v1, 0x1f

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->d:J

    .line 25
    .line 26
    long-to-int v0, v2

    .line 27
    add-int/2addr v1, v0

    .line 28
    mul-int/lit8 v1, v1, 0x1f

    .line 29
    .line 30
    iget-wide v2, p0, Lcom/google/android/exoplayer2/k0;->e:J

    .line 31
    .line 32
    long-to-int v0, v2

    .line 33
    add-int/2addr v1, v0

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 37
    .line 38
    add-int/2addr v1, v0

    .line 39
    mul-int/lit8 v1, v1, 0x1f

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 42
    .line 43
    add-int/2addr v1, v0

    .line 44
    mul-int/lit8 v1, v1, 0x1f

    .line 45
    .line 46
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 47
    .line 48
    add-int/2addr v1, v0

    .line 49
    return v1
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
.end method
