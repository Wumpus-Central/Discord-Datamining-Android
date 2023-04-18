.class public final Lh8/p;
.super Lh8/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/p$b;,
        Lh8/p$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lh8/f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private final t:Lh8/u;

.field private final u:Z

.field private final v:Lcom/google/android/exoplayer2/Timeline$c;

.field private final w:Lcom/google/android/exoplayer2/Timeline$b;

.field private x:Lh8/p$a;

.field private y:Lh8/o;

.field private z:Z


# direct methods
.method public constructor <init>(Lh8/u;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lh8/f;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh8/p;->t:Lh8/u;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Lh8/u;->k()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    move p2, v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p2, 0x0

    .line 18
    :goto_0
    iput-boolean p2, p0, Lh8/p;->u:Z

    .line 19
    .line 20
    new-instance p2, Lcom/google/android/exoplayer2/Timeline$c;

    .line 21
    .line 22
    invoke-direct {p2}, Lcom/google/android/exoplayer2/Timeline$c;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 26
    .line 27
    new-instance p2, Lcom/google/android/exoplayer2/Timeline$b;

    .line 28
    .line 29
    invoke-direct {p2}, Lcom/google/android/exoplayer2/Timeline$b;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lh8/p;->w:Lcom/google/android/exoplayer2/Timeline$b;

    .line 33
    .line 34
    invoke-interface {p1}, Lh8/u;->o()Lcom/google/android/exoplayer2/Timeline;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    invoke-static {p2, p1, p1}, Lh8/p$a;->v(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;Ljava/lang/Object;)Lh8/p$a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 46
    .line 47
    iput-boolean v0, p0, Lh8/p;->B:Z

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-interface {p1}, Lh8/u;->h()Lcom/google/android/exoplayer2/MediaItem;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Lh8/p$a;->u(Lcom/google/android/exoplayer2/MediaItem;)Lh8/p$a;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 59
    .line 60
    :goto_1
    return-void
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
.end method

.method private L(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/p;->x:Lh8/p$a;

    .line 2
    .line 3
    invoke-static {v0}, Lh8/p$a;->s(Lh8/p$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lh8/p;->x:Lh8/p$a;

    .line 10
    .line 11
    invoke-static {v0}, Lh8/p$a;->s(Lh8/p$a;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object p1, Lh8/p$a;->e:Ljava/lang/Object;

    .line 22
    .line 23
    :cond_0
    return-object p1
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
.end method

.method private M(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/p;->x:Lh8/p$a;

    .line 2
    .line 3
    invoke-static {v0}, Lh8/p$a;->s(Lh8/p$a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lh8/p$a;->e:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 18
    .line 19
    invoke-static {p1}, Lh8/p$a;->s(Lh8/p$a;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :cond_0
    return-object p1
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
.end method

.method private Q(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lh8/p;->y:Lh8/o;

    .line 2
    .line 3
    iget-object v1, p0, Lh8/p;->x:Lh8/p$a;

    .line 4
    .line 5
    iget-object v2, v0, Lh8/o;->k:Lh8/u$a;

    .line 6
    .line 7
    iget-object v2, v2, Lh8/s;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lh8/p$a;->b(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v2, p0, Lh8/p;->x:Lh8/p$a;

    .line 18
    .line 19
    iget-object v3, p0, Lh8/p;->w:Lcom/google/android/exoplayer2/Timeline$b;

    .line 20
    .line 21
    invoke-virtual {v2, v1, v3}, Lcom/google/android/exoplayer2/Timeline;->f(ILcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-wide v1, v1, Lcom/google/android/exoplayer2/Timeline$b;->d:J

    .line 26
    .line 27
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v3, v1, v3

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    cmp-long v3, p1, v1

    .line 37
    .line 38
    if-ltz v3, :cond_1

    .line 39
    .line 40
    const-wide/16 p1, 0x1

    .line 41
    .line 42
    sub-long/2addr v1, p1

    .line 43
    const-wide/16 p1, 0x0

    .line 44
    .line 45
    invoke-static {p1, p2, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    :cond_1
    invoke-virtual {v0, p1, p2}, Lh8/o;->w(J)V

    .line 50
    .line 51
    .line 52
    return-void
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
.end method


# virtual methods
.method public A(Ld9/x;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lh8/f;->A(Ld9/x;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lh8/p;->u:Z

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lh8/p;->z:Z

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iget-object v0, p0, Lh8/p;->t:Lh8/u;

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0}, Lh8/f;->J(Ljava/lang/Object;Lh8/u;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
.end method

.method public C()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lh8/p;->A:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lh8/p;->z:Z

    .line 5
    .line 6
    invoke-super {p0}, Lh8/f;->C()V

    .line 7
    .line 8
    .line 9
    return-void
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

.method protected bridge synthetic E(Ljava/lang/Object;Lh8/u$a;)Lh8/u$a;
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lh8/p;->N(Ljava/lang/Void;Lh8/u$a;)Lh8/u$a;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic I(Ljava/lang/Object;Lh8/u;Lcom/google/android/exoplayer2/Timeline;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3}, Lh8/p;->P(Ljava/lang/Void;Lh8/u;Lcom/google/android/exoplayer2/Timeline;)V

    return-void
.end method

.method public K(Lh8/u$a;Ld9/b;J)Lh8/o;
    .locals 1

    .line 1
    new-instance v0, Lh8/o;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lh8/o;-><init>(Lh8/u$a;Ld9/b;J)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lh8/p;->t:Lh8/u;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lh8/o;->y(Lh8/u;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p2, p0, Lh8/p;->A:Z

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    iget-object p2, p1, Lh8/s;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {p0, p2}, Lh8/p;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p1, p2}, Lh8/u$a;->c(Ljava/lang/Object;)Lh8/u$a;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lh8/o;->d(Lh8/u$a;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object v0, p0, Lh8/p;->y:Lh8/o;

    .line 30
    .line 31
    iget-boolean p1, p0, Lh8/p;->z:Z

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x1

    .line 36
    iput-boolean p1, p0, Lh8/p;->z:Z

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    iget-object p2, p0, Lh8/p;->t:Lh8/u;

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Lh8/f;->J(Ljava/lang/Object;Lh8/u;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    return-object v0
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
.end method

.method protected N(Ljava/lang/Void;Lh8/u$a;)Lh8/u$a;
    .locals 0

    iget-object p1, p2, Lh8/s;->a:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lh8/p;->L(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2, p1}, Lh8/u$a;->c(Ljava/lang/Object;)Lh8/u$a;

    move-result-object p1

    return-object p1
.end method

.method public O()Lcom/google/android/exoplayer2/Timeline;
    .locals 1

    iget-object v0, p0, Lh8/p;->x:Lh8/p$a;

    return-object v0
.end method

.method protected P(Ljava/lang/Void;Lh8/u;Lcom/google/android/exoplayer2/Timeline;)V
    .locals 12

    .line 1
    iget-boolean p1, p0, Lh8/p;->A:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 6
    .line 7
    invoke-virtual {p1, p3}, Lh8/p$a;->t(Lcom/google/android/exoplayer2/Timeline;)Lh8/p$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 12
    .line 13
    iget-object p1, p0, Lh8/p;->y:Lh8/o;

    .line 14
    .line 15
    if-eqz p1, :cond_5

    .line 16
    .line 17
    invoke-virtual {p1}, Lh8/o;->j()J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-direct {p0, p1, p2}, Lh8/p;->Q(J)V

    .line 22
    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p3}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-boolean p1, p0, Lh8/p;->B:Z

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 37
    .line 38
    invoke-virtual {p1, p3}, Lh8/p$a;->t(Lcom/google/android/exoplayer2/Timeline;)Lh8/p$a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object p1, Lcom/google/android/exoplayer2/Timeline$c;->r:Ljava/lang/Object;

    .line 44
    .line 45
    sget-object p2, Lh8/p$a;->e:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {p3, p1, p2}, Lh8/p$a;->v(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;Ljava/lang/Object;)Lh8/p$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_0
    iput-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_2
    iget-object p1, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-virtual {p3, p2, p1}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$c;->c()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    iget-object p1, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 68
    .line 69
    iget-object p1, p1, Lcom/google/android/exoplayer2/Timeline$c;->a:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v2, p0, Lh8/p;->y:Lh8/o;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2}, Lh8/o;->q()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    iget-object v4, p0, Lh8/p;->x:Lh8/p$a;

    .line 80
    .line 81
    iget-object v5, p0, Lh8/p;->y:Lh8/o;

    .line 82
    .line 83
    iget-object v5, v5, Lh8/o;->k:Lh8/u$a;

    .line 84
    .line 85
    iget-object v5, v5, Lh8/s;->a:Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v6, p0, Lh8/p;->w:Lcom/google/android/exoplayer2/Timeline$b;

    .line 88
    .line 89
    invoke-virtual {v4, v5, v6}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 90
    .line 91
    .line 92
    iget-object v4, p0, Lh8/p;->w:Lcom/google/android/exoplayer2/Timeline$b;

    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline$b;->l()J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    add-long/2addr v4, v2

    .line 99
    iget-object v2, p0, Lh8/p;->x:Lh8/p$a;

    .line 100
    .line 101
    iget-object v3, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 102
    .line 103
    invoke-virtual {v2, p2, v3}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/Timeline$c;->c()J

    .line 108
    .line 109
    .line 110
    move-result-wide v2

    .line 111
    cmp-long p2, v4, v2

    .line 112
    .line 113
    if-eqz p2, :cond_3

    .line 114
    .line 115
    move-wide v10, v4

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    move-wide v10, v0

    .line 118
    :goto_1
    iget-object v7, p0, Lh8/p;->v:Lcom/google/android/exoplayer2/Timeline$c;

    .line 119
    .line 120
    iget-object v8, p0, Lh8/p;->w:Lcom/google/android/exoplayer2/Timeline$b;

    .line 121
    .line 122
    const/4 v9, 0x0

    .line 123
    move-object v6, p3

    .line 124
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    iget-object v0, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 129
    .line 130
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p2, Ljava/lang/Long;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide v1

    .line 138
    iget-boolean p2, p0, Lh8/p;->B:Z

    .line 139
    .line 140
    if-eqz p2, :cond_4

    .line 141
    .line 142
    iget-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 143
    .line 144
    invoke-virtual {p1, p3}, Lh8/p$a;->t(Lcom/google/android/exoplayer2/Timeline;)Lh8/p$a;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_2

    .line 149
    :cond_4
    invoke-static {p3, p1, v0}, Lh8/p$a;->v(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;Ljava/lang/Object;)Lh8/p$a;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    :goto_2
    iput-object p1, p0, Lh8/p;->x:Lh8/p$a;

    .line 154
    .line 155
    iget-object p1, p0, Lh8/p;->y:Lh8/o;

    .line 156
    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    invoke-direct {p0, v1, v2}, Lh8/p;->Q(J)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Lh8/o;->k:Lh8/u$a;

    .line 163
    .line 164
    iget-object p2, p1, Lh8/s;->a:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-direct {p0, p2}, Lh8/p;->M(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2}, Lh8/u$a;->c(Ljava/lang/Object;)Lh8/u$a;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    goto :goto_4

    .line 175
    :cond_5
    :goto_3
    const/4 p1, 0x0

    .line 176
    :goto_4
    const/4 p2, 0x1

    .line 177
    iput-boolean p2, p0, Lh8/p;->B:Z

    .line 178
    .line 179
    iput-boolean p2, p0, Lh8/p;->A:Z

    .line 180
    .line 181
    iget-object p2, p0, Lh8/p;->x:Lh8/p$a;

    .line 182
    .line 183
    invoke-virtual {p0, p2}, Lh8/a;->B(Lcom/google/android/exoplayer2/Timeline;)V

    .line 184
    .line 185
    .line 186
    if-eqz p1, :cond_6

    .line 187
    .line 188
    iget-object p2, p0, Lh8/p;->y:Lh8/o;

    .line 189
    .line 190
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Lh8/o;

    .line 195
    .line 196
    invoke-virtual {p2, p1}, Lh8/o;->d(Lh8/u$a;)V

    .line 197
    .line 198
    .line 199
    :cond_6
    return-void
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
.end method

.method public bridge synthetic f(Lh8/u$a;Ld9/b;J)Lh8/r;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lh8/p;->K(Lh8/u$a;Ld9/b;J)Lh8/o;

    move-result-object p1

    return-object p1
.end method

.method public h()Lcom/google/android/exoplayer2/MediaItem;
    .locals 1

    iget-object v0, p0, Lh8/p;->t:Lh8/u;

    invoke-interface {v0}, Lh8/u;->h()Lcom/google/android/exoplayer2/MediaItem;

    move-result-object v0

    return-object v0
.end method

.method public j()V
    .locals 0

    return-void
.end method

.method public q(Lh8/r;)V
    .locals 1

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lh8/o;

    .line 3
    .line 4
    invoke-virtual {v0}, Lh8/o;->x()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lh8/p;->y:Lh8/o;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lh8/p;->y:Lh8/o;

    .line 13
    .line 14
    :cond_0
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
.end method
