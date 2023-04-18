.class final Lx8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:Z

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:F

.field private l:Ljava/lang/String;

.field private m:I

.field private n:I

.field private o:Landroid/text/Layout$Alignment;

.field private p:I

.field private q:Lx8/b;

.field private r:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lx8/g;->f:I

    .line 6
    .line 7
    iput v0, p0, Lx8/g;->g:I

    .line 8
    .line 9
    iput v0, p0, Lx8/g;->h:I

    .line 10
    .line 11
    iput v0, p0, Lx8/g;->i:I

    .line 12
    .line 13
    iput v0, p0, Lx8/g;->j:I

    .line 14
    .line 15
    iput v0, p0, Lx8/g;->m:I

    .line 16
    .line 17
    iput v0, p0, Lx8/g;->n:I

    .line 18
    .line 19
    iput v0, p0, Lx8/g;->p:I

    .line 20
    .line 21
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lx8/g;->r:F

    .line 25
    .line 26
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

.method private q(Lx8/g;Z)Lx8/g;
    .locals 3

    .line 1
    if-eqz p1, :cond_d

    .line 2
    .line 3
    iget-boolean v0, p0, Lx8/g;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p1, Lx8/g;->c:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p1, Lx8/g;->b:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lx8/g;->v(I)Lx8/g;

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v0, p0, Lx8/g;->h:I

    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    iget v0, p1, Lx8/g;->h:I

    .line 22
    .line 23
    iput v0, p0, Lx8/g;->h:I

    .line 24
    .line 25
    :cond_1
    iget v0, p0, Lx8/g;->i:I

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    iget v0, p1, Lx8/g;->i:I

    .line 30
    .line 31
    iput v0, p0, Lx8/g;->i:I

    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Lx8/g;->a:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    iget-object v0, p1, Lx8/g;->a:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    iput-object v0, p0, Lx8/g;->a:Ljava/lang/String;

    .line 42
    .line 43
    :cond_3
    iget v0, p0, Lx8/g;->f:I

    .line 44
    .line 45
    if-ne v0, v1, :cond_4

    .line 46
    .line 47
    iget v0, p1, Lx8/g;->f:I

    .line 48
    .line 49
    iput v0, p0, Lx8/g;->f:I

    .line 50
    .line 51
    :cond_4
    iget v0, p0, Lx8/g;->g:I

    .line 52
    .line 53
    if-ne v0, v1, :cond_5

    .line 54
    .line 55
    iget v0, p1, Lx8/g;->g:I

    .line 56
    .line 57
    iput v0, p0, Lx8/g;->g:I

    .line 58
    .line 59
    :cond_5
    iget v0, p0, Lx8/g;->n:I

    .line 60
    .line 61
    if-ne v0, v1, :cond_6

    .line 62
    .line 63
    iget v0, p1, Lx8/g;->n:I

    .line 64
    .line 65
    iput v0, p0, Lx8/g;->n:I

    .line 66
    .line 67
    :cond_6
    iget-object v0, p0, Lx8/g;->o:Landroid/text/Layout$Alignment;

    .line 68
    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    iget-object v0, p1, Lx8/g;->o:Landroid/text/Layout$Alignment;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    iput-object v0, p0, Lx8/g;->o:Landroid/text/Layout$Alignment;

    .line 76
    .line 77
    :cond_7
    iget v0, p0, Lx8/g;->p:I

    .line 78
    .line 79
    if-ne v0, v1, :cond_8

    .line 80
    .line 81
    iget v0, p1, Lx8/g;->p:I

    .line 82
    .line 83
    iput v0, p0, Lx8/g;->p:I

    .line 84
    .line 85
    :cond_8
    iget v0, p0, Lx8/g;->j:I

    .line 86
    .line 87
    if-ne v0, v1, :cond_9

    .line 88
    .line 89
    iget v0, p1, Lx8/g;->j:I

    .line 90
    .line 91
    iput v0, p0, Lx8/g;->j:I

    .line 92
    .line 93
    iget v0, p1, Lx8/g;->k:F

    .line 94
    .line 95
    iput v0, p0, Lx8/g;->k:F

    .line 96
    .line 97
    :cond_9
    iget-object v0, p0, Lx8/g;->q:Lx8/b;

    .line 98
    .line 99
    if-nez v0, :cond_a

    .line 100
    .line 101
    iget-object v0, p1, Lx8/g;->q:Lx8/b;

    .line 102
    .line 103
    iput-object v0, p0, Lx8/g;->q:Lx8/b;

    .line 104
    .line 105
    :cond_a
    iget v0, p0, Lx8/g;->r:F

    .line 106
    .line 107
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 108
    .line 109
    .line 110
    cmpl-float v0, v0, v2

    .line 111
    .line 112
    if-nez v0, :cond_b

    .line 113
    .line 114
    iget v0, p1, Lx8/g;->r:F

    .line 115
    .line 116
    iput v0, p0, Lx8/g;->r:F

    .line 117
    .line 118
    :cond_b
    if-eqz p2, :cond_c

    .line 119
    .line 120
    iget-boolean v0, p0, Lx8/g;->e:Z

    .line 121
    .line 122
    if-nez v0, :cond_c

    .line 123
    .line 124
    iget-boolean v0, p1, Lx8/g;->e:Z

    .line 125
    .line 126
    if-eqz v0, :cond_c

    .line 127
    .line 128
    iget v0, p1, Lx8/g;->d:I

    .line 129
    .line 130
    invoke-virtual {p0, v0}, Lx8/g;->t(I)Lx8/g;

    .line 131
    .line 132
    .line 133
    :cond_c
    if-eqz p2, :cond_d

    .line 134
    .line 135
    iget p2, p0, Lx8/g;->m:I

    .line 136
    .line 137
    if-ne p2, v1, :cond_d

    .line 138
    .line 139
    iget p1, p1, Lx8/g;->m:I

    .line 140
    .line 141
    if-eq p1, v1, :cond_d

    .line 142
    .line 143
    iput p1, p0, Lx8/g;->m:I

    .line 144
    .line 145
    :cond_d
    return-object p0
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


# virtual methods
.method public A(Z)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->i:I

    return-object p0
.end method

.method public B(Z)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->f:I

    return-object p0
.end method

.method public C(I)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->n:I

    return-object p0
.end method

.method public D(I)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->m:I

    return-object p0
.end method

.method public E(F)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->r:F

    return-object p0
.end method

.method public F(Landroid/text/Layout$Alignment;)Lx8/g;
    .locals 0

    iput-object p1, p0, Lx8/g;->o:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public G(Z)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->p:I

    return-object p0
.end method

.method public H(Lx8/b;)Lx8/g;
    .locals 0

    iput-object p1, p0, Lx8/g;->q:Lx8/b;

    return-object p0
.end method

.method public I(Z)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->g:I

    return-object p0
.end method

.method public a(Lx8/g;)Lx8/g;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lx8/g;->q(Lx8/g;Z)Lx8/g;

    move-result-object p1

    return-object p1
.end method

.method public b()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx8/g;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lx8/g;->d:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Background color has not been defined."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
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

.method public c()I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx8/g;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lx8/g;->b:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Font color has not been defined."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
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

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/g;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lx8/g;->k:F

    return v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lx8/g;->j:I

    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx8/g;->l:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lx8/g;->n:I

    return v0
.end method

.method public i()I
    .locals 1

    iget v0, p0, Lx8/g;->m:I

    return v0
.end method

.method public j()F
    .locals 1

    iget v0, p0, Lx8/g;->r:F

    return v0
.end method

.method public k()I
    .locals 4

    .line 1
    iget v0, p0, Lx8/g;->h:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v2, p0, Lx8/g;->i:I

    .line 7
    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_0
    iget v3, p0, Lx8/g;->i:I

    .line 19
    .line 20
    if-ne v3, v2, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    :cond_2
    or-int/2addr v0, v1

    .line 24
    return v0
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

.method public l()Landroid/text/Layout$Alignment;
    .locals 1

    iget-object v0, p0, Lx8/g;->o:Landroid/text/Layout$Alignment;

    return-object v0
.end method

.method public m()Z
    .locals 2

    iget v0, p0, Lx8/g;->p:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n()Lx8/b;
    .locals 1

    iget-object v0, p0, Lx8/g;->q:Lx8/b;

    return-object v0
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lx8/g;->e:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lx8/g;->c:Z

    return v0
.end method

.method public r()Z
    .locals 2

    iget v0, p0, Lx8/g;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public s()Z
    .locals 2

    iget v0, p0, Lx8/g;->g:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public t(I)Lx8/g;
    .locals 0

    .line 1
    iput p1, p0, Lx8/g;->d:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lx8/g;->e:Z

    .line 5
    .line 6
    return-object p0
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

.method public u(Z)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->h:I

    return-object p0
.end method

.method public v(I)Lx8/g;
    .locals 0

    .line 1
    iput p1, p0, Lx8/g;->b:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lx8/g;->c:Z

    .line 5
    .line 6
    return-object p0
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

.method public w(Ljava/lang/String;)Lx8/g;
    .locals 0

    iput-object p1, p0, Lx8/g;->a:Ljava/lang/String;

    return-object p0
.end method

.method public x(F)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->k:F

    return-object p0
.end method

.method public y(I)Lx8/g;
    .locals 0

    iput p1, p0, Lx8/g;->j:I

    return-object p0
.end method

.method public z(Ljava/lang/String;)Lx8/g;
    .locals 0

    iput-object p1, p0, Lx8/g;->l:Ljava/lang/String;

    return-object p0
.end method
