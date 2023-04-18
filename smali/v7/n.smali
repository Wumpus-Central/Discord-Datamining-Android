.class public final Lv7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/n$a;
    }
.end annotation


# static fields
.field private static final q:[D


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ll7/b0;

.field private final c:Lv7/k0;

.field private final d:Lf9/y;

.field private final e:Lv7/u;

.field private final f:[Z

.field private final g:Lv7/n$a;

.field private h:J

.field private i:Z

.field private j:Z

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:Z

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [D

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lv7/n;->q:[D

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 8
        0x4037f9dcb5112287L    # 23.976023976023978
        0x4038000000000000L    # 24.0
        0x4039000000000000L    # 25.0
        0x403df853e2556b28L    # 29.97002997002997
        0x403e000000000000L    # 30.0
        0x4049000000000000L    # 50.0
        0x404df853e2556b28L    # 59.94005994005994
        0x404e000000000000L    # 60.0
    .end array-data
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
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lv7/n;-><init>(Lv7/k0;)V

    return-void
.end method

.method constructor <init>(Lv7/k0;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv7/n;->c:Lv7/k0;

    const/4 v0, 0x4

    new-array v0, v0, [Z

    .line 4
    iput-object v0, p0, Lv7/n;->f:[Z

    .line 5
    new-instance v0, Lv7/n$a;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Lv7/n$a;-><init>(I)V

    iput-object v0, p0, Lv7/n;->g:Lv7/n$a;

    if-eqz p1, :cond_0

    .line 6
    new-instance p1, Lv7/u;

    const/16 v0, 0xb2

    invoke-direct {p1, v0, v1}, Lv7/u;-><init>(II)V

    iput-object p1, p0, Lv7/n;->e:Lv7/u;

    .line 7
    new-instance p1, Lf9/y;

    invoke-direct {p1}, Lf9/y;-><init>()V

    iput-object p1, p0, Lv7/n;->d:Lf9/y;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lv7/n;->e:Lv7/u;

    .line 9
    iput-object p1, p0, Lv7/n;->d:Lf9/y;

    :goto_0
    return-void
.end method

.method private static a(Lv7/n$a;Ljava/lang/String;)Landroid/util/Pair;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/n$a;",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ld7/k;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lv7/n$a;->d:[B

    .line 2
    .line 3
    iget v1, p0, Lv7/n$a;->b:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x4

    .line 10
    aget-byte v2, v0, v1

    .line 11
    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    const/4 v3, 0x5

    .line 15
    aget-byte v4, v0, v3

    .line 16
    .line 17
    and-int/lit16 v4, v4, 0xff

    .line 18
    .line 19
    const/4 v5, 0x6

    .line 20
    aget-byte v5, v0, v5

    .line 21
    .line 22
    and-int/lit16 v5, v5, 0xff

    .line 23
    .line 24
    shl-int/2addr v2, v1

    .line 25
    shr-int/lit8 v6, v4, 0x4

    .line 26
    .line 27
    or-int/2addr v2, v6

    .line 28
    and-int/lit8 v4, v4, 0xf

    .line 29
    .line 30
    shl-int/lit8 v4, v4, 0x8

    .line 31
    .line 32
    or-int/2addr v4, v5

    .line 33
    const/4 v5, 0x7

    .line 34
    aget-byte v6, v0, v5

    .line 35
    .line 36
    and-int/lit16 v6, v6, 0xf0

    .line 37
    .line 38
    shr-int/2addr v6, v1

    .line 39
    const/4 v7, 0x2

    .line 40
    if-eq v6, v7, :cond_2

    .line 41
    .line 42
    const/4 v7, 0x3

    .line 43
    if-eq v6, v7, :cond_1

    .line 44
    .line 45
    if-eq v6, v1, :cond_0

    .line 46
    .line 47
    const/high16 v1, 0x3f800000    # 1.0f

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    mul-int/lit8 v1, v4, 0x79

    .line 51
    .line 52
    int-to-float v1, v1

    .line 53
    mul-int/lit8 v6, v2, 0x64

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    mul-int/lit8 v1, v4, 0x10

    .line 57
    .line 58
    int-to-float v1, v1

    .line 59
    mul-int/lit8 v6, v2, 0x9

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    mul-int/lit8 v1, v4, 0x4

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    mul-int/lit8 v6, v2, 0x3

    .line 66
    .line 67
    :goto_0
    int-to-float v6, v6

    .line 68
    div-float/2addr v1, v6

    .line 69
    :goto_1
    new-instance v6, Ld7/k$b;

    .line 70
    .line 71
    invoke-direct {v6}, Ld7/k$b;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6, p1}, Ld7/k$b;->S(Ljava/lang/String;)Ld7/k$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v6, "video/mpeg2"

    .line 79
    .line 80
    invoke-virtual {p1, v6}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1, v2}, Ld7/k$b;->j0(I)Ld7/k$b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v4}, Ld7/k$b;->Q(I)Ld7/k$b;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1, v1}, Ld7/k$b;->a0(F)Ld7/k$b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1, v1}, Ld7/k$b;->T(Ljava/util/List;)Ld7/k$b;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ld7/k$b;->E()Ld7/k;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    aget-byte v1, v0, v5

    .line 109
    .line 110
    and-int/lit8 v1, v1, 0xf

    .line 111
    .line 112
    add-int/lit8 v1, v1, -0x1

    .line 113
    .line 114
    if-ltz v1, :cond_4

    .line 115
    .line 116
    sget-object v2, Lv7/n;->q:[D

    .line 117
    .line 118
    array-length v4, v2

    .line 119
    if-ge v1, v4, :cond_4

    .line 120
    .line 121
    aget-wide v1, v2, v1

    .line 122
    .line 123
    iget p0, p0, Lv7/n$a;->c:I

    .line 124
    .line 125
    add-int/lit8 p0, p0, 0x9

    .line 126
    .line 127
    aget-byte p0, v0, p0

    .line 128
    .line 129
    and-int/lit8 v0, p0, 0x60

    .line 130
    .line 131
    shr-int/2addr v0, v3

    .line 132
    and-int/lit8 p0, p0, 0x1f

    .line 133
    .line 134
    if-eq v0, p0, :cond_3

    .line 135
    .line 136
    int-to-double v3, v0

    .line 137
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 138
    .line 139
    add-double/2addr v3, v5

    .line 140
    add-int/lit8 p0, p0, 0x1

    .line 141
    .line 142
    int-to-double v5, p0

    .line 143
    div-double/2addr v3, v5

    .line 144
    mul-double/2addr v1, v3

    .line 145
    :cond_3
    const-wide v3, 0x412e848000000000L    # 1000000.0

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    div-double/2addr v3, v1

    .line 151
    double-to-long v0, v3

    .line 152
    goto :goto_2

    .line 153
    :cond_4
    const-wide/16 v0, 0x0

    .line 154
    .line 155
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p1, p0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    return-object p0
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
.end method


# virtual methods
.method public b(Lf9/y;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lv7/n;->b:Ll7/b0;

    .line 4
    .line 5
    invoke-static {v1}, Lf9/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lf9/y;->e()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual/range {p1 .. p1}, Lf9/y;->f()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual/range {p1 .. p1}, Lf9/y;->d()[B

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-wide v4, v0, Lv7/n;->h:J

    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lf9/y;->a()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    int-to-long v6, v6

    .line 27
    add-long/2addr v4, v6

    .line 28
    iput-wide v4, v0, Lv7/n;->h:J

    .line 29
    .line 30
    iget-object v4, v0, Lv7/n;->b:Ll7/b0;

    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, Lf9/y;->a()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    move-object/from16 v6, p1

    .line 37
    .line 38
    invoke-interface {v4, v6, v5}, Ll7/b0;->e(Lf9/y;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    iget-object v4, v0, Lv7/n;->f:[Z

    .line 42
    .line 43
    invoke-static {v3, v1, v2, v4}, Lf9/w;->c([BII[Z)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-ne v4, v2, :cond_2

    .line 48
    .line 49
    iget-boolean v4, v0, Lv7/n;->j:Z

    .line 50
    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    iget-object v4, v0, Lv7/n;->g:Lv7/n$a;

    .line 54
    .line 55
    invoke-virtual {v4, v3, v1, v2}, Lv7/n$a;->a([BII)V

    .line 56
    .line 57
    .line 58
    :cond_0
    iget-object v4, v0, Lv7/n;->e:Lv7/u;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    invoke-virtual {v4, v3, v1, v2}, Lv7/u;->a([BII)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lf9/y;->d()[B

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    add-int/lit8 v7, v4, 0x3

    .line 71
    .line 72
    aget-byte v5, v5, v7

    .line 73
    .line 74
    and-int/lit16 v5, v5, 0xff

    .line 75
    .line 76
    sub-int v8, v4, v1

    .line 77
    .line 78
    iget-boolean v9, v0, Lv7/n;->j:Z

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x1

    .line 82
    if-nez v9, :cond_5

    .line 83
    .line 84
    if-lez v8, :cond_3

    .line 85
    .line 86
    iget-object v9, v0, Lv7/n;->g:Lv7/n$a;

    .line 87
    .line 88
    invoke-virtual {v9, v3, v1, v4}, Lv7/n$a;->a([BII)V

    .line 89
    .line 90
    .line 91
    :cond_3
    if-gez v8, :cond_4

    .line 92
    .line 93
    neg-int v9, v8

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    move v9, v10

    .line 96
    :goto_1
    iget-object v12, v0, Lv7/n;->g:Lv7/n$a;

    .line 97
    .line 98
    invoke-virtual {v12, v5, v9}, Lv7/n$a;->b(II)Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_5

    .line 103
    .line 104
    iget-object v9, v0, Lv7/n;->g:Lv7/n$a;

    .line 105
    .line 106
    iget-object v12, v0, Lv7/n;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v12}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v12

    .line 112
    check-cast v12, Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v9, v12}, Lv7/n;->a(Lv7/n$a;Ljava/lang/String;)Landroid/util/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    iget-object v12, v0, Lv7/n;->b:Ll7/b0;

    .line 119
    .line 120
    iget-object v13, v9, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v13, Ld7/k;

    .line 123
    .line 124
    invoke-interface {v12, v13}, Ll7/b0;->a(Ld7/k;)V

    .line 125
    .line 126
    .line 127
    iget-object v9, v9, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v9, Ljava/lang/Long;

    .line 130
    .line 131
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v12

    .line 135
    iput-wide v12, v0, Lv7/n;->k:J

    .line 136
    .line 137
    iput-boolean v11, v0, Lv7/n;->j:Z

    .line 138
    .line 139
    :cond_5
    iget-object v9, v0, Lv7/n;->e:Lv7/u;

    .line 140
    .line 141
    if-eqz v9, :cond_8

    .line 142
    .line 143
    if-lez v8, :cond_6

    .line 144
    .line 145
    invoke-virtual {v9, v3, v1, v4}, Lv7/u;->a([BII)V

    .line 146
    .line 147
    .line 148
    move v1, v10

    .line 149
    goto :goto_2

    .line 150
    :cond_6
    neg-int v1, v8

    .line 151
    :goto_2
    iget-object v8, v0, Lv7/n;->e:Lv7/u;

    .line 152
    .line 153
    invoke-virtual {v8, v1}, Lv7/u;->b(I)Z

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    iget-object v1, v0, Lv7/n;->e:Lv7/u;

    .line 160
    .line 161
    iget-object v8, v1, Lv7/u;->d:[B

    .line 162
    .line 163
    iget v1, v1, Lv7/u;->e:I

    .line 164
    .line 165
    invoke-static {v8, v1}, Lf9/w;->k([BI)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    iget-object v8, v0, Lv7/n;->d:Lf9/y;

    .line 170
    .line 171
    invoke-static {v8}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    check-cast v8, Lf9/y;

    .line 176
    .line 177
    iget-object v9, v0, Lv7/n;->e:Lv7/u;

    .line 178
    .line 179
    iget-object v9, v9, Lv7/u;->d:[B

    .line 180
    .line 181
    invoke-virtual {v8, v9, v1}, Lf9/y;->N([BI)V

    .line 182
    .line 183
    .line 184
    iget-object v1, v0, Lv7/n;->c:Lv7/k0;

    .line 185
    .line 186
    invoke-static {v1}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    check-cast v1, Lv7/k0;

    .line 191
    .line 192
    iget-wide v8, v0, Lv7/n;->n:J

    .line 193
    .line 194
    iget-object v12, v0, Lv7/n;->d:Lf9/y;

    .line 195
    .line 196
    invoke-virtual {v1, v8, v9, v12}, Lv7/k0;->a(JLf9/y;)V

    .line 197
    .line 198
    .line 199
    :cond_7
    const/16 v1, 0xb2

    .line 200
    .line 201
    if-ne v5, v1, :cond_8

    .line 202
    .line 203
    invoke-virtual/range {p1 .. p1}, Lf9/y;->d()[B

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    add-int/lit8 v8, v4, 0x2

    .line 208
    .line 209
    aget-byte v1, v1, v8

    .line 210
    .line 211
    if-ne v1, v11, :cond_8

    .line 212
    .line 213
    iget-object v1, v0, Lv7/n;->e:Lv7/u;

    .line 214
    .line 215
    invoke-virtual {v1, v5}, Lv7/u;->e(I)V

    .line 216
    .line 217
    .line 218
    :cond_8
    if-eqz v5, :cond_a

    .line 219
    .line 220
    const/16 v1, 0xb3

    .line 221
    .line 222
    if-ne v5, v1, :cond_9

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_9
    const/16 v1, 0xb8

    .line 226
    .line 227
    if-ne v5, v1, :cond_11

    .line 228
    .line 229
    iput-boolean v11, v0, Lv7/n;->o:Z

    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_a
    :goto_3
    sub-int v1, v2, v4

    .line 233
    .line 234
    iget-boolean v4, v0, Lv7/n;->i:Z

    .line 235
    .line 236
    if-eqz v4, :cond_b

    .line 237
    .line 238
    iget-boolean v4, v0, Lv7/n;->p:Z

    .line 239
    .line 240
    if-eqz v4, :cond_b

    .line 241
    .line 242
    iget-boolean v4, v0, Lv7/n;->j:Z

    .line 243
    .line 244
    if-eqz v4, :cond_b

    .line 245
    .line 246
    iget-boolean v15, v0, Lv7/n;->o:Z

    .line 247
    .line 248
    iget-wide v8, v0, Lv7/n;->h:J

    .line 249
    .line 250
    iget-wide v12, v0, Lv7/n;->m:J

    .line 251
    .line 252
    sub-long/2addr v8, v12

    .line 253
    long-to-int v4, v8

    .line 254
    sub-int v16, v4, v1

    .line 255
    .line 256
    iget-object v12, v0, Lv7/n;->b:Ll7/b0;

    .line 257
    .line 258
    iget-wide v13, v0, Lv7/n;->n:J

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    move/from16 v17, v1

    .line 263
    .line 264
    invoke-interface/range {v12 .. v18}, Ll7/b0;->d(JIIILl7/b0$a;)V

    .line 265
    .line 266
    .line 267
    :cond_b
    iget-boolean v4, v0, Lv7/n;->i:Z

    .line 268
    .line 269
    if-eqz v4, :cond_c

    .line 270
    .line 271
    iget-boolean v8, v0, Lv7/n;->p:Z

    .line 272
    .line 273
    if-eqz v8, :cond_f

    .line 274
    .line 275
    :cond_c
    iget-wide v8, v0, Lv7/n;->h:J

    .line 276
    .line 277
    int-to-long v12, v1

    .line 278
    sub-long/2addr v8, v12

    .line 279
    iput-wide v8, v0, Lv7/n;->m:J

    .line 280
    .line 281
    iget-wide v8, v0, Lv7/n;->l:J

    .line 282
    .line 283
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    cmp-long v1, v8, v12

    .line 289
    .line 290
    if-eqz v1, :cond_d

    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_d
    if-eqz v4, :cond_e

    .line 294
    .line 295
    iget-wide v8, v0, Lv7/n;->n:J

    .line 296
    .line 297
    iget-wide v14, v0, Lv7/n;->k:J

    .line 298
    .line 299
    add-long/2addr v8, v14

    .line 300
    goto :goto_4

    .line 301
    :cond_e
    const-wide/16 v8, 0x0

    .line 302
    .line 303
    :goto_4
    iput-wide v8, v0, Lv7/n;->n:J

    .line 304
    .line 305
    iput-boolean v10, v0, Lv7/n;->o:Z

    .line 306
    .line 307
    iput-wide v12, v0, Lv7/n;->l:J

    .line 308
    .line 309
    iput-boolean v11, v0, Lv7/n;->i:Z

    .line 310
    .line 311
    :cond_f
    if-nez v5, :cond_10

    .line 312
    .line 313
    move v10, v11

    .line 314
    :cond_10
    iput-boolean v10, v0, Lv7/n;->p:Z

    .line 315
    .line 316
    :cond_11
    :goto_5
    move v1, v7

    .line 317
    goto/16 :goto_0
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
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/n;->f:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lf9/w;->a([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv7/n;->g:Lv7/n$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Lv7/n$a;->c()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lv7/n;->e:Lv7/u;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lv7/u;->d()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    iput-wide v0, p0, Lv7/n;->h:J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lv7/n;->i:Z

    .line 24
    .line 25
    return-void
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
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(Ll7/k;Lv7/i0$d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lv7/i0$d;->a()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lv7/i0$d;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lv7/n;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lv7/i0$d;->c()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Ll7/k;->d(II)Ll7/b0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lv7/n;->b:Ll7/b0;

    .line 20
    .line 21
    iget-object v0, p0, Lv7/n;->c:Lv7/k0;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Lv7/k0;->b(Ll7/k;Lv7/i0$d;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
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
.end method

.method public f(JI)V
    .locals 0

    iput-wide p1, p0, Lv7/n;->l:J

    return-void
.end method
