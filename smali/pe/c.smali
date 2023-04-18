.class public abstract Lpe/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lne/c;

.field protected final b:Lne/d;

.field protected final c:Loe/i;

.field protected final d:Lhe/a;

.field protected final e:Lhe/b;

.field protected final f:Lcom/linkedin/android/litr/io/MediaRange;

.field protected g:I

.field protected h:I

.field protected i:Z

.field protected j:Landroid/media/MediaFormat;

.field protected k:J

.field protected l:F


# direct methods
.method constructor <init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lpe/c;->k:J

    .line 7
    .line 8
    iput-object p1, p0, Lpe/c;->a:Lne/c;

    .line 9
    .line 10
    iput p2, p0, Lpe/c;->g:I

    .line 11
    .line 12
    iput p4, p0, Lpe/c;->h:I

    .line 13
    .line 14
    iput-object p3, p0, Lpe/c;->b:Lne/d;

    .line 15
    .line 16
    iput-object p5, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    .line 17
    .line 18
    iput-object p6, p0, Lpe/c;->c:Loe/i;

    .line 19
    .line 20
    iput-object p7, p0, Lpe/c;->d:Lhe/a;

    .line 21
    .line 22
    iput-object p8, p0, Lpe/c;->e:Lhe/b;

    .line 23
    .line 24
    invoke-interface {p1}, Lne/c;->getSelection()Lcom/linkedin/android/litr/io/MediaRange;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    iput-object p3, p0, Lpe/c;->f:Lcom/linkedin/android/litr/io/MediaRange;

    .line 29
    .line 30
    invoke-interface {p1, p2}, Lne/c;->getTrackFormat(I)Landroid/media/MediaFormat;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "durationUs"

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    if-eqz p4, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 43
    .line 44
    .line 45
    move-result-wide p6

    .line 46
    iput-wide p6, p0, Lpe/c;->k:J

    .line 47
    .line 48
    if-eqz p5, :cond_0

    .line 49
    .line 50
    invoke-virtual {p5, p2, p6, p7}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {p3}, Lcom/linkedin/android/litr/io/MediaRange;->a()J

    .line 54
    .line 55
    .line 56
    move-result-wide p1

    .line 57
    invoke-virtual {p3}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 58
    .line 59
    .line 60
    move-result-wide p4

    .line 61
    cmp-long p1, p1, p4

    .line 62
    .line 63
    if-ltz p1, :cond_1

    .line 64
    .line 65
    iget-wide p1, p0, Lpe/c;->k:J

    .line 66
    .line 67
    invoke-virtual {p3}, Lcom/linkedin/android/litr/io/MediaRange;->a()J

    .line 68
    .line 69
    .line 70
    move-result-wide p4

    .line 71
    invoke-static {p1, p2, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    iput-wide p1, p0, Lpe/c;->k:J

    .line 76
    .line 77
    invoke-virtual {p3}, Lcom/linkedin/android/litr/io/MediaRange;->b()J

    .line 78
    .line 79
    .line 80
    move-result-wide p3

    .line 81
    sub-long/2addr p1, p3

    .line 82
    iput-wide p1, p0, Lpe/c;->k:J

    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    const-string p2, "Range end should be greater than range start"

    .line 88
    .line 89
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
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
.end method


# virtual methods
.method protected a(Landroid/media/MediaFormat;Landroid/media/MediaFormat;)Landroid/media/MediaFormat;
    .locals 3

    .line 1
    const-string v0, "durationUs"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-virtual {p2, v0, v1, v2}, Landroid/media/MediaFormat;->setLong(Ljava/lang/String;J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    const-string v0, "language"

    .line 23
    .line 24
    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p2, v0, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-object p2
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method protected b()I
    .locals 2

    .line 1
    :cond_0
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lne/c;->getSampleTrackIndex()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lpe/c;->g:I

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 12
    .line 13
    invoke-interface {v0}, Lne/c;->advance()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lpe/c;->a:Lne/c;

    .line 17
    .line 18
    invoke-interface {v0}, Lne/c;->getSampleFlags()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x4

    .line 23
    and-int/2addr v0, v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    const/4 v0, 0x5

    .line 28
    return v0
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
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpe/c;->d:Lhe/a;

    invoke-interface {v0}, Lhe/a;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpe/c;->e:Lhe/b;

    invoke-interface {v0}, Lhe/b;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e()F
    .locals 1

    iget v0, p0, Lpe/c;->l:F

    return v0
.end method

.method public f()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lpe/c;->j:Landroid/media/MediaFormat;

    return-object v0
.end method

.method public abstract g()I
.end method

.method public abstract h()V
.end method

.method public abstract i()V
.end method
