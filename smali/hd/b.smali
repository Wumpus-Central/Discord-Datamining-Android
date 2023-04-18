.class public final Lhd/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lgd/b;

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final g:I


# direct methods
.method public constructor <init>(Lgd/b;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lgd/b;->n()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p1}, Lgd/b;->j()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0xa

    invoke-direct {p0, p1, v2, v0, v1}, Lhd/b;-><init>(Lgd/b;III)V

    return-void
.end method

.method public constructor <init>(Lgd/b;III)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lhd/b;->a:Lgd/b;

    .line 4
    invoke-virtual {p1}, Lgd/b;->j()I

    move-result v0

    iput v0, p0, Lhd/b;->b:I

    .line 5
    invoke-virtual {p1}, Lgd/b;->n()I

    move-result p1

    iput p1, p0, Lhd/b;->c:I

    .line 6
    div-int/lit8 p2, p2, 0x2

    sub-int v1, p3, p2

    .line 7
    iput v1, p0, Lhd/b;->d:I

    add-int/2addr p3, p2

    .line 8
    iput p3, p0, Lhd/b;->e:I

    sub-int v2, p4, p2

    .line 9
    iput v2, p0, Lhd/b;->g:I

    add-int/2addr p4, p2

    .line 10
    iput p4, p0, Lhd/b;->f:I

    if-ltz v2, :cond_0

    if-ltz v1, :cond_0

    if-ge p4, v0, :cond_0

    if-ge p3, p1, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-static {}, Lcd/j;->a()Lcd/j;

    move-result-object p1

    throw p1
.end method

.method private a(Lcd/o;Lcd/o;Lcd/o;Lcd/o;)[Lcd/o;
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcd/o;->c()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcd/o;->d()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p2}, Lcd/o;->c()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p2}, Lcd/o;->d()F

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p3}, Lcd/o;->c()F

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {p3}, Lcd/o;->d()F

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-virtual {p4}, Lcd/o;->c()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-virtual {p4}, Lcd/o;->d()F

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    iget v4, p0, Lhd/b;->c:I

    .line 34
    .line 35
    int-to-float v4, v4

    .line 36
    const/high16 v5, 0x40000000    # 2.0f

    .line 37
    .line 38
    div-float/2addr v4, v5

    .line 39
    cmpg-float v4, v0, v4

    .line 40
    .line 41
    const/4 v5, 0x3

    .line 42
    const/4 v6, 0x2

    .line 43
    const/4 v7, 0x1

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x4

    .line 46
    const/high16 v10, 0x3f800000    # 1.0f

    .line 47
    .line 48
    if-gez v4, :cond_0

    .line 49
    .line 50
    new-array v4, v9, [Lcd/o;

    .line 51
    .line 52
    new-instance v9, Lcd/o;

    .line 53
    .line 54
    sub-float/2addr v3, v10

    .line 55
    add-float/2addr p4, v10

    .line 56
    invoke-direct {v9, v3, p4}, Lcd/o;-><init>(FF)V

    .line 57
    .line 58
    .line 59
    aput-object v9, v4, v8

    .line 60
    .line 61
    new-instance p4, Lcd/o;

    .line 62
    .line 63
    add-float/2addr v1, v10

    .line 64
    add-float/2addr p2, v10

    .line 65
    invoke-direct {p4, v1, p2}, Lcd/o;-><init>(FF)V

    .line 66
    .line 67
    .line 68
    aput-object p4, v4, v7

    .line 69
    .line 70
    new-instance p2, Lcd/o;

    .line 71
    .line 72
    sub-float/2addr v2, v10

    .line 73
    sub-float/2addr p3, v10

    .line 74
    invoke-direct {p2, v2, p3}, Lcd/o;-><init>(FF)V

    .line 75
    .line 76
    .line 77
    aput-object p2, v4, v6

    .line 78
    .line 79
    new-instance p2, Lcd/o;

    .line 80
    .line 81
    add-float/2addr v0, v10

    .line 82
    sub-float/2addr p1, v10

    .line 83
    invoke-direct {p2, v0, p1}, Lcd/o;-><init>(FF)V

    .line 84
    .line 85
    .line 86
    aput-object p2, v4, v5

    .line 87
    .line 88
    return-object v4

    .line 89
    :cond_0
    new-array v4, v9, [Lcd/o;

    .line 90
    .line 91
    new-instance v9, Lcd/o;

    .line 92
    .line 93
    add-float/2addr v3, v10

    .line 94
    add-float/2addr p4, v10

    .line 95
    invoke-direct {v9, v3, p4}, Lcd/o;-><init>(FF)V

    .line 96
    .line 97
    .line 98
    aput-object v9, v4, v8

    .line 99
    .line 100
    new-instance p4, Lcd/o;

    .line 101
    .line 102
    add-float/2addr v1, v10

    .line 103
    sub-float/2addr p2, v10

    .line 104
    invoke-direct {p4, v1, p2}, Lcd/o;-><init>(FF)V

    .line 105
    .line 106
    .line 107
    aput-object p4, v4, v7

    .line 108
    .line 109
    new-instance p2, Lcd/o;

    .line 110
    .line 111
    sub-float/2addr v2, v10

    .line 112
    add-float/2addr p3, v10

    .line 113
    invoke-direct {p2, v2, p3}, Lcd/o;-><init>(FF)V

    .line 114
    .line 115
    .line 116
    aput-object p2, v4, v6

    .line 117
    .line 118
    new-instance p2, Lcd/o;

    .line 119
    .line 120
    sub-float/2addr v0, v10

    .line 121
    sub-float/2addr p1, v10

    .line 122
    invoke-direct {p2, v0, p1}, Lcd/o;-><init>(FF)V

    .line 123
    .line 124
    .line 125
    aput-object p2, v4, v5

    .line 126
    .line 127
    return-object v4
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
.end method

.method private b(IIIZ)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p4, :cond_1

    .line 3
    .line 4
    :goto_0
    if-gt p1, p2, :cond_3

    .line 5
    .line 6
    iget-object p4, p0, Lhd/b;->a:Lgd/b;

    .line 7
    .line 8
    invoke-virtual {p4, p1, p3}, Lgd/b;->e(II)Z

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    if-eqz p4, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    :goto_1
    if-gt p1, p2, :cond_3

    .line 19
    .line 20
    iget-object p4, p0, Lhd/b;->a:Lgd/b;

    .line 21
    .line 22
    invoke-virtual {p4, p3, p1}, Lgd/b;->e(II)Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_2

    .line 27
    .line 28
    return v0

    .line 29
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 p1, 0x0

    .line 33
    return p1
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
.end method

.method private d(FFFF)Lcd/o;
    .locals 5

    .line 1
    invoke-static {p1, p2, p3, p4}, Lhd/a;->a(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lhd/a;->c(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sub-float/2addr p3, p1

    .line 10
    int-to-float v1, v0

    .line 11
    div-float/2addr p3, v1

    .line 12
    sub-float/2addr p4, p2

    .line 13
    div-float/2addr p4, v1

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    int-to-float v2, v1

    .line 18
    mul-float v3, v2, p3

    .line 19
    .line 20
    add-float/2addr v3, p1

    .line 21
    invoke-static {v3}, Lhd/a;->c(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    mul-float/2addr v2, p4

    .line 26
    add-float/2addr v2, p2

    .line 27
    invoke-static {v2}, Lhd/a;->c(F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v4, p0, Lhd/b;->a:Lgd/b;

    .line 32
    .line 33
    invoke-virtual {v4, v3, v2}, Lgd/b;->e(II)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    new-instance p1, Lcd/o;

    .line 40
    .line 41
    int-to-float p2, v3

    .line 42
    int-to-float p3, v2

    .line 43
    invoke-direct {p1, p2, p3}, Lcd/o;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 p1, 0x0

    .line 51
    return-object p1
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
.end method


# virtual methods
.method public c()[Lcd/o;
    .locals 13

    .line 1
    iget v0, p0, Lhd/b;->d:I

    .line 2
    .line 3
    iget v1, p0, Lhd/b;->e:I

    .line 4
    .line 5
    iget v2, p0, Lhd/b;->g:I

    .line 6
    .line 7
    iget v3, p0, Lhd/b;->f:I

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    move v7, v4

    .line 12
    move v8, v7

    .line 13
    move v9, v8

    .line 14
    move v10, v9

    .line 15
    move v11, v10

    .line 16
    move v6, v5

    .line 17
    :cond_0
    :goto_0
    if-eqz v6, :cond_15

    .line 18
    .line 19
    move v12, v4

    .line 20
    move v6, v5

    .line 21
    :cond_1
    :goto_1
    if-nez v6, :cond_2

    .line 22
    .line 23
    if-nez v7, :cond_4

    .line 24
    .line 25
    :cond_2
    iget v6, p0, Lhd/b;->c:I

    .line 26
    .line 27
    if-ge v1, v6, :cond_4

    .line 28
    .line 29
    invoke-direct {p0, v2, v3, v1, v4}, Lhd/b;->b(IIIZ)Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_3

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    move v7, v5

    .line 38
    move v12, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    if-nez v7, :cond_1

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_4
    iget v6, p0, Lhd/b;->c:I

    .line 46
    .line 47
    if-lt v1, v6, :cond_5

    .line 48
    .line 49
    :goto_2
    move v4, v5

    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_5
    move v6, v5

    .line 53
    :cond_6
    :goto_3
    if-nez v6, :cond_7

    .line 54
    .line 55
    if-nez v8, :cond_9

    .line 56
    .line 57
    :cond_7
    iget v6, p0, Lhd/b;->b:I

    .line 58
    .line 59
    if-ge v3, v6, :cond_9

    .line 60
    .line 61
    invoke-direct {p0, v0, v1, v3, v5}, Lhd/b;->b(IIIZ)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_8

    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    move v8, v5

    .line 70
    move v12, v8

    .line 71
    goto :goto_3

    .line 72
    :cond_8
    if-nez v8, :cond_6

    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_9
    iget v6, p0, Lhd/b;->b:I

    .line 78
    .line 79
    if-lt v3, v6, :cond_a

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_a
    move v6, v5

    .line 83
    :cond_b
    :goto_4
    if-nez v6, :cond_c

    .line 84
    .line 85
    if-nez v9, :cond_e

    .line 86
    .line 87
    :cond_c
    if-ltz v0, :cond_e

    .line 88
    .line 89
    invoke-direct {p0, v2, v3, v0, v4}, Lhd/b;->b(IIIZ)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_d

    .line 94
    .line 95
    add-int/lit8 v0, v0, -0x1

    .line 96
    .line 97
    move v9, v5

    .line 98
    move v12, v9

    .line 99
    goto :goto_4

    .line 100
    :cond_d
    if-nez v9, :cond_b

    .line 101
    .line 102
    add-int/lit8 v0, v0, -0x1

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_e
    if-gez v0, :cond_f

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_f
    move v6, v12

    .line 109
    move v12, v5

    .line 110
    :cond_10
    :goto_5
    if-nez v12, :cond_11

    .line 111
    .line 112
    if-nez v11, :cond_13

    .line 113
    .line 114
    :cond_11
    if-ltz v2, :cond_13

    .line 115
    .line 116
    invoke-direct {p0, v0, v1, v2, v5}, Lhd/b;->b(IIIZ)Z

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    if-eqz v12, :cond_12

    .line 121
    .line 122
    add-int/lit8 v2, v2, -0x1

    .line 123
    .line 124
    move v6, v5

    .line 125
    move v11, v6

    .line 126
    goto :goto_5

    .line 127
    :cond_12
    if-nez v11, :cond_10

    .line 128
    .line 129
    add-int/lit8 v2, v2, -0x1

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_13
    if-gez v2, :cond_14

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_14
    if-eqz v6, :cond_0

    .line 136
    .line 137
    move v10, v5

    .line 138
    goto :goto_0

    .line 139
    :cond_15
    :goto_6
    if-nez v4, :cond_1e

    .line 140
    .line 141
    if-eqz v10, :cond_1e

    .line 142
    .line 143
    sub-int v4, v1, v0

    .line 144
    .line 145
    const/4 v6, 0x0

    .line 146
    move v8, v5

    .line 147
    move-object v7, v6

    .line 148
    :goto_7
    if-nez v7, :cond_16

    .line 149
    .line 150
    if-ge v8, v4, :cond_16

    .line 151
    .line 152
    int-to-float v7, v0

    .line 153
    sub-int v9, v3, v8

    .line 154
    .line 155
    int-to-float v9, v9

    .line 156
    add-int v10, v0, v8

    .line 157
    .line 158
    int-to-float v10, v10

    .line 159
    int-to-float v11, v3

    .line 160
    invoke-direct {p0, v7, v9, v10, v11}, Lhd/b;->d(FFFF)Lcd/o;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    add-int/lit8 v8, v8, 0x1

    .line 165
    .line 166
    goto :goto_7

    .line 167
    :cond_16
    if-eqz v7, :cond_1d

    .line 168
    .line 169
    move v9, v5

    .line 170
    move-object v8, v6

    .line 171
    :goto_8
    if-nez v8, :cond_17

    .line 172
    .line 173
    if-ge v9, v4, :cond_17

    .line 174
    .line 175
    int-to-float v8, v0

    .line 176
    add-int v10, v2, v9

    .line 177
    .line 178
    int-to-float v10, v10

    .line 179
    add-int v11, v0, v9

    .line 180
    .line 181
    int-to-float v11, v11

    .line 182
    int-to-float v12, v2

    .line 183
    invoke-direct {p0, v8, v10, v11, v12}, Lhd/b;->d(FFFF)Lcd/o;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    add-int/lit8 v9, v9, 0x1

    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_17
    if-eqz v8, :cond_1c

    .line 191
    .line 192
    move v9, v5

    .line 193
    move-object v0, v6

    .line 194
    :goto_9
    if-nez v0, :cond_18

    .line 195
    .line 196
    if-ge v9, v4, :cond_18

    .line 197
    .line 198
    int-to-float v0, v1

    .line 199
    add-int v10, v2, v9

    .line 200
    .line 201
    int-to-float v10, v10

    .line 202
    sub-int v11, v1, v9

    .line 203
    .line 204
    int-to-float v11, v11

    .line 205
    int-to-float v12, v2

    .line 206
    invoke-direct {p0, v0, v10, v11, v12}, Lhd/b;->d(FFFF)Lcd/o;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    add-int/lit8 v9, v9, 0x1

    .line 211
    .line 212
    goto :goto_9

    .line 213
    :cond_18
    if-eqz v0, :cond_1b

    .line 214
    .line 215
    :goto_a
    if-nez v6, :cond_19

    .line 216
    .line 217
    if-ge v5, v4, :cond_19

    .line 218
    .line 219
    int-to-float v2, v1

    .line 220
    sub-int v6, v3, v5

    .line 221
    .line 222
    int-to-float v6, v6

    .line 223
    sub-int v9, v1, v5

    .line 224
    .line 225
    int-to-float v9, v9

    .line 226
    int-to-float v10, v3

    .line 227
    invoke-direct {p0, v2, v6, v9, v10}, Lhd/b;->d(FFFF)Lcd/o;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    add-int/lit8 v5, v5, 0x1

    .line 232
    .line 233
    goto :goto_a

    .line 234
    :cond_19
    if-eqz v6, :cond_1a

    .line 235
    .line 236
    invoke-direct {p0, v6, v7, v0, v8}, Lhd/b;->a(Lcd/o;Lcd/o;Lcd/o;Lcd/o;)[Lcd/o;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0

    .line 241
    :cond_1a
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    throw v0

    .line 246
    :cond_1b
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    throw v0

    .line 251
    :cond_1c
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    throw v0

    .line 256
    :cond_1d
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    throw v0

    .line 261
    :cond_1e
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    throw v0
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
.end method
