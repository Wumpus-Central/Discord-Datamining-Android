.class public Lcom/facebook/drawee/drawable/e;
.super Lcom/facebook/drawee/drawable/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/drawee/drawable/e$a;
    }
.end annotation


# instance fields
.field A:[I

.field B:I

.field C:[Z

.field D:I

.field private E:Lcom/facebook/drawee/drawable/e$a;

.field private F:Z

.field private G:Z

.field private H:Z

.field private final s:[Landroid/graphics/drawable/Drawable;

.field private final t:Z

.field private final u:I

.field private final v:I

.field w:I

.field x:I

.field y:J

.field z:[I


# direct methods
.method public constructor <init>([Landroid/graphics/drawable/Drawable;ZI)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/drawee/drawable/a;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->H:Z

    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-lt v1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v2

    .line 13
    :goto_0
    const-string v1, "At least one layer required!"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lv3/j;->j(ZLjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/drawee/drawable/e;->s:[Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    array-length v0, p1

    .line 21
    new-array v0, v0, [I

    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/drawee/drawable/e;->z:[I

    .line 24
    .line 25
    array-length v0, p1

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 29
    .line 30
    const/16 v0, 0xff

    .line 31
    .line 32
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->B:I

    .line 33
    .line 34
    array-length p1, p1

    .line 35
    new-array p1, p1, [Z

    .line 36
    .line 37
    iput-object p1, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 38
    .line 39
    iput v2, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 40
    .line 41
    iput-boolean p2, p0, Lcom/facebook/drawee/drawable/e;->t:Z

    .line 42
    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    move v2, v0

    .line 46
    :cond_1
    iput v2, p0, Lcom/facebook/drawee/drawable/e;->u:I

    .line 47
    .line 48
    iput p3, p0, Lcom/facebook/drawee/drawable/e;->v:I

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/e;->q()V

    .line 51
    .line 52
    .line 53
    return-void
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

.method private g(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    if-lez p3, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->H:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 19
    .line 20
    .line 21
    iget p3, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 22
    .line 23
    add-int/lit8 p3, p3, -0x1

    .line 24
    .line 25
    iput p3, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
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

.method private n()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->F:Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->E:Lcom/facebook/drawee/drawable/e$a;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Lcom/facebook/drawee/drawable/e$a;->c()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
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

.method private o()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->v:I

    .line 7
    .line 8
    if-ltz v0, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 11
    .line 12
    array-length v2, v1

    .line 13
    if-lt v0, v2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    aget-boolean v0, v1, v0

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    return-void

    .line 21
    :cond_2
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->F:Z

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->E:Lcom/facebook/drawee/drawable/e$a;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Lcom/facebook/drawee/drawable/e$a;->a()V

    .line 29
    .line 30
    .line 31
    :cond_3
    :goto_0
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
.end method

.method private p()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->G:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 12
    .line 13
    iget v1, p0, Lcom/facebook/drawee/drawable/e;->v:I

    .line 14
    .line 15
    aget-boolean v0, v0, v1

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->E:Lcom/facebook/drawee/drawable/e$a;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, Lcom/facebook/drawee/drawable/e$a;->b()V

    .line 24
    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lcom/facebook/drawee/drawable/e;->G:Z

    .line 28
    .line 29
    :cond_2
    return-void
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

.method private q()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->z:[I

    .line 5
    .line 6
    iget v1, p0, Lcom/facebook/drawee/drawable/e;->u:I

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->z:[I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/16 v2, 0xff

    .line 15
    .line 16
    aput v2, v0, v1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 19
    .line 20
    iget v3, p0, Lcom/facebook/drawee/drawable/e;->u:I

    .line 21
    .line 22
    invoke-static {v0, v3}, Ljava/util/Arrays;->fill([II)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 26
    .line 27
    aput v2, v0, v1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 30
    .line 31
    iget-boolean v2, p0, Lcom/facebook/drawee/drawable/e;->t:Z

    .line 32
    .line 33
    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([ZZ)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    aput-boolean v2, v0, v1

    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
.end method

.method private s(F)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    iget-object v4, p0, Lcom/facebook/drawee/drawable/e;->s:[Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    array-length v4, v4

    .line 8
    if-ge v2, v4, :cond_5

    .line 9
    .line 10
    iget-object v4, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 11
    .line 12
    aget-boolean v4, v4, v2

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move v5, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v5, -0x1

    .line 19
    :goto_1
    iget-object v6, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 20
    .line 21
    iget-object v7, p0, Lcom/facebook/drawee/drawable/e;->z:[I

    .line 22
    .line 23
    aget v7, v7, v2

    .line 24
    .line 25
    int-to-float v7, v7

    .line 26
    const/16 v8, 0xff

    .line 27
    .line 28
    mul-int/2addr v5, v8

    .line 29
    int-to-float v5, v5

    .line 30
    mul-float/2addr v5, p1

    .line 31
    add-float/2addr v7, v5

    .line 32
    float-to-int v5, v7

    .line 33
    aput v5, v6, v2

    .line 34
    .line 35
    if-gez v5, :cond_1

    .line 36
    .line 37
    aput v1, v6, v2

    .line 38
    .line 39
    :cond_1
    aget v5, v6, v2

    .line 40
    .line 41
    if-le v5, v8, :cond_2

    .line 42
    .line 43
    aput v8, v6, v2

    .line 44
    .line 45
    :cond_2
    if-eqz v4, :cond_3

    .line 46
    .line 47
    aget v5, v6, v2

    .line 48
    .line 49
    if-ge v5, v8, :cond_3

    .line 50
    .line 51
    move v3, v1

    .line 52
    :cond_3
    if-nez v4, :cond_4

    .line 53
    .line 54
    aget v4, v6, v2

    .line 55
    .line 56
    if-lez v4, :cond_4

    .line 57
    .line 58
    move v3, v1

    .line 59
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    return v3
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
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-eq v0, v3, :cond_0

    .line 9
    .line 10
    goto :goto_5

    .line 11
    :cond_0
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->x:I

    .line 12
    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move v0, v2

    .line 18
    :goto_0
    invoke-static {v0}, Lv3/j;->i(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->m()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    iget-wide v6, p0, Lcom/facebook/drawee/drawable/e;->y:J

    .line 26
    .line 27
    sub-long/2addr v4, v6

    .line 28
    long-to-float v0, v4

    .line 29
    iget v4, p0, Lcom/facebook/drawee/drawable/e;->x:I

    .line 30
    .line 31
    int-to-float v4, v4

    .line 32
    div-float/2addr v0, v4

    .line 33
    invoke-direct {p0, v0}, Lcom/facebook/drawee/drawable/e;->s(F)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move v1, v3

    .line 41
    :goto_1
    iput v1, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_3
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 45
    .line 46
    iget-object v4, p0, Lcom/facebook/drawee/drawable/e;->z:[I

    .line 47
    .line 48
    iget-object v5, p0, Lcom/facebook/drawee/drawable/e;->s:[Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    array-length v5, v5

    .line 51
    invoke-static {v0, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->m()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    iput-wide v4, p0, Lcom/facebook/drawee/drawable/e;->y:J

    .line 59
    .line 60
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->x:I

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    const/high16 v0, 0x3f800000    # 1.0f

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/4 v0, 0x0

    .line 68
    :goto_2
    invoke-direct {p0, v0}, Lcom/facebook/drawee/drawable/e;->s(F)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/e;->o()V

    .line 73
    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_5
    move v1, v3

    .line 79
    :goto_3
    iput v1, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 80
    .line 81
    :goto_4
    move v3, v0

    .line 82
    :goto_5
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->s:[Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    array-length v1, v0

    .line 85
    if-ge v2, v1, :cond_6

    .line 86
    .line 87
    aget-object v0, v0, v2

    .line 88
    .line 89
    iget-object v1, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 90
    .line 91
    aget v1, v1, v2

    .line 92
    .line 93
    iget v4, p0, Lcom/facebook/drawee/drawable/e;->B:I

    .line 94
    .line 95
    mul-int/2addr v1, v4

    .line 96
    int-to-double v4, v1

    .line 97
    const-wide v6, 0x406fe00000000000L    # 255.0

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    div-double/2addr v4, v6

    .line 103
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 104
    .line 105
    .line 106
    move-result-wide v4

    .line 107
    double-to-int v1, v4

    .line 108
    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/drawee/drawable/e;->g(Landroid/graphics/Canvas;Landroid/graphics/drawable/Drawable;I)V

    .line 109
    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_6
    if-eqz v3, :cond_7

    .line 115
    .line 116
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/e;->n()V

    .line 117
    .line 118
    .line 119
    invoke-direct {p0}, Lcom/facebook/drawee/drawable/e;->p()V

    .line 120
    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 124
    .line 125
    .line 126
    :goto_6
    return-void
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
.end method

.method public f()V
    .locals 1

    iget v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    return-void
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lcom/facebook/drawee/drawable/e;->B:I

    return v0
.end method

.method public h()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    return-void
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

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public invalidateSelf()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->D:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
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

.method public j(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    aput-boolean v1, v0, p1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 10
    .line 11
    .line 12
    return-void
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
.end method

.method public k(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 5
    .line 6
    aput-boolean v0, v1, p1

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

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
    .line 45
    .line 46
.end method

.method public l()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    iget-object v2, p0, Lcom/facebook/drawee/drawable/e;->s:[Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    array-length v2, v2

    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Lcom/facebook/drawee/drawable/e;->A:[I

    .line 12
    .line 13
    iget-object v3, p0, Lcom/facebook/drawee/drawable/e;->C:[Z

    .line 14
    .line 15
    aget-boolean v3, v3, v1

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/16 v3, 0xff

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v3, v0

    .line 23
    :goto_1
    aput v3, v2, v1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
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
.end method

.method protected m()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public r(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/facebook/drawee/drawable/e;->x:I

    .line 2
    .line 3
    iget p1, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Lcom/facebook/drawee/drawable/e;->w:I

    .line 10
    .line 11
    :cond_0
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
    .line 45
    .line 46
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/drawee/drawable/e;->B:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/drawee/drawable/e;->B:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/drawee/drawable/e;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
.end method
