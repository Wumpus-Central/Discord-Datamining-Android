.class public final Lq8/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/CharSequence;

.field private b:Landroid/graphics/Bitmap;

.field private c:Landroid/text/Layout$Alignment;

.field private d:F

.field private e:I

.field private f:I

.field private g:F

.field private h:I

.field private i:I

.field private j:F

.field private k:F

.field private l:F

.field private m:Z

.field private n:I

.field private o:I

.field private p:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lq8/b$b;->a:Ljava/lang/CharSequence;

    .line 4
    iput-object v0, p0, Lq8/b$b;->b:Landroid/graphics/Bitmap;

    .line 5
    iput-object v0, p0, Lq8/b$b;->c:Landroid/text/Layout$Alignment;

    const v0, -0x800001

    .line 6
    iput v0, p0, Lq8/b$b;->d:F

    const/high16 v1, -0x80000000

    .line 7
    iput v1, p0, Lq8/b$b;->e:I

    .line 8
    iput v1, p0, Lq8/b$b;->f:I

    .line 9
    iput v0, p0, Lq8/b$b;->g:F

    .line 10
    iput v1, p0, Lq8/b$b;->h:I

    .line 11
    iput v1, p0, Lq8/b$b;->i:I

    .line 12
    iput v0, p0, Lq8/b$b;->j:F

    .line 13
    iput v0, p0, Lq8/b$b;->k:F

    .line 14
    iput v0, p0, Lq8/b$b;->l:F

    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lq8/b$b;->m:Z

    const/high16 v0, -0x1000000

    .line 16
    iput v0, p0, Lq8/b$b;->n:I

    .line 17
    iput v1, p0, Lq8/b$b;->o:I

    return-void
.end method

.method private constructor <init>(Lq8/b;)V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iget-object v0, p1, Lq8/b;->a:Ljava/lang/CharSequence;

    iput-object v0, p0, Lq8/b$b;->a:Ljava/lang/CharSequence;

    .line 20
    iget-object v0, p1, Lq8/b;->c:Landroid/graphics/Bitmap;

    iput-object v0, p0, Lq8/b$b;->b:Landroid/graphics/Bitmap;

    .line 21
    iget-object v0, p1, Lq8/b;->b:Landroid/text/Layout$Alignment;

    iput-object v0, p0, Lq8/b$b;->c:Landroid/text/Layout$Alignment;

    .line 22
    iget v0, p1, Lq8/b;->d:F

    iput v0, p0, Lq8/b$b;->d:F

    .line 23
    iget v0, p1, Lq8/b;->e:I

    iput v0, p0, Lq8/b$b;->e:I

    .line 24
    iget v0, p1, Lq8/b;->f:I

    iput v0, p0, Lq8/b$b;->f:I

    .line 25
    iget v0, p1, Lq8/b;->g:F

    iput v0, p0, Lq8/b$b;->g:F

    .line 26
    iget v0, p1, Lq8/b;->h:I

    iput v0, p0, Lq8/b$b;->h:I

    .line 27
    iget v0, p1, Lq8/b;->m:I

    iput v0, p0, Lq8/b$b;->i:I

    .line 28
    iget v0, p1, Lq8/b;->n:F

    iput v0, p0, Lq8/b$b;->j:F

    .line 29
    iget v0, p1, Lq8/b;->i:F

    iput v0, p0, Lq8/b$b;->k:F

    .line 30
    iget v0, p1, Lq8/b;->j:F

    iput v0, p0, Lq8/b$b;->l:F

    .line 31
    iget-boolean v0, p1, Lq8/b;->k:Z

    iput-boolean v0, p0, Lq8/b$b;->m:Z

    .line 32
    iget v0, p1, Lq8/b;->l:I

    iput v0, p0, Lq8/b$b;->n:I

    .line 33
    iget v0, p1, Lq8/b;->o:I

    iput v0, p0, Lq8/b$b;->o:I

    .line 34
    iget p1, p1, Lq8/b;->p:F

    iput p1, p0, Lq8/b$b;->p:F

    return-void
.end method

.method synthetic constructor <init>(Lq8/b;Lq8/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq8/b$b;-><init>(Lq8/b;)V

    return-void
.end method


# virtual methods
.method public a()Lq8/b;
    .locals 21

    move-object/from16 v0, p0

    new-instance v19, Lq8/b;

    move-object/from16 v1, v19

    iget-object v2, v0, Lq8/b$b;->a:Ljava/lang/CharSequence;

    iget-object v3, v0, Lq8/b$b;->c:Landroid/text/Layout$Alignment;

    iget-object v4, v0, Lq8/b$b;->b:Landroid/graphics/Bitmap;

    iget v5, v0, Lq8/b$b;->d:F

    iget v6, v0, Lq8/b$b;->e:I

    iget v7, v0, Lq8/b$b;->f:I

    iget v8, v0, Lq8/b$b;->g:F

    iget v9, v0, Lq8/b$b;->h:I

    iget v10, v0, Lq8/b$b;->i:I

    iget v11, v0, Lq8/b$b;->j:F

    iget v12, v0, Lq8/b$b;->k:F

    iget v13, v0, Lq8/b$b;->l:F

    iget-boolean v14, v0, Lq8/b$b;->m:Z

    iget v15, v0, Lq8/b$b;->n:I

    move-object/from16 v20, v1

    iget v1, v0, Lq8/b$b;->o:I

    move/from16 v16, v1

    iget v1, v0, Lq8/b$b;->p:F

    move/from16 v17, v1

    const/16 v18, 0x0

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v18}, Lq8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIFLq8/b$a;)V

    return-object v19
.end method

.method public b()Lq8/b$b;
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq8/b$b;->m:Z

    return-object p0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lq8/b$b;->f:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lq8/b$b;->h:I

    return v0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lq8/b$b;->a:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public f(Landroid/graphics/Bitmap;)Lq8/b$b;
    .locals 0

    iput-object p1, p0, Lq8/b$b;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public g(F)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->l:F

    return-object p0
.end method

.method public h(FI)Lq8/b$b;
    .locals 0

    .line 1
    iput p1, p0, Lq8/b$b;->d:F

    .line 2
    .line 3
    iput p2, p0, Lq8/b$b;->e:I

    .line 4
    .line 5
    return-object p0
    .line 6
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

.method public i(I)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->f:I

    return-object p0
.end method

.method public j(F)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->g:F

    return-object p0
.end method

.method public k(I)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->h:I

    return-object p0
.end method

.method public l(F)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->p:F

    return-object p0
.end method

.method public m(F)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->k:F

    return-object p0
.end method

.method public n(Ljava/lang/CharSequence;)Lq8/b$b;
    .locals 0

    iput-object p1, p0, Lq8/b$b;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public o(Landroid/text/Layout$Alignment;)Lq8/b$b;
    .locals 0

    iput-object p1, p0, Lq8/b$b;->c:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public p(FI)Lq8/b$b;
    .locals 0

    .line 1
    iput p1, p0, Lq8/b$b;->j:F

    .line 2
    .line 3
    iput p2, p0, Lq8/b$b;->i:I

    .line 4
    .line 5
    return-object p0
    .line 6
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

.method public q(I)Lq8/b$b;
    .locals 0

    iput p1, p0, Lq8/b$b;->o:I

    return-object p0
.end method

.method public r(I)Lq8/b$b;
    .locals 0

    .line 1
    iput p1, p0, Lq8/b$b;->n:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lq8/b$b;->m:Z

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
