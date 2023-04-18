.class public final Lv7/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/a0$a;
    }
.end annotation


# static fields
.field public static final l:Ll7/o;


# instance fields
.field private final a:Lf9/l0;

.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lv7/a0$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lf9/y;

.field private final d:Lv7/y;

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:J

.field private i:Lv7/x;

.field private j:Ll7/k;

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv7/z;

    invoke-direct {v0}, Lv7/z;-><init>()V

    sput-object v0, Lv7/a0;->l:Ll7/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lf9/l0;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lf9/l0;-><init>(J)V

    invoke-direct {p0, v0}, Lv7/a0;-><init>(Lf9/l0;)V

    return-void
.end method

.method public constructor <init>(Lf9/l0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lv7/a0;->a:Lf9/l0;

    .line 4
    new-instance p1, Lf9/y;

    const/16 v0, 0x1000

    invoke-direct {p1, v0}, Lf9/y;-><init>(I)V

    iput-object p1, p0, Lv7/a0;->c:Lf9/y;

    .line 5
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lv7/a0;->b:Landroid/util/SparseArray;

    .line 6
    new-instance p1, Lv7/y;

    invoke-direct {p1}, Lv7/y;-><init>()V

    iput-object p1, p0, Lv7/a0;->d:Lv7/y;

    return-void
.end method

.method public static synthetic a()[Ll7/i;
    .locals 1

    invoke-static {}, Lv7/a0;->d()[Ll7/i;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic d()[Ll7/i;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ll7/i;

    .line 3
    .line 4
    new-instance v1, Lv7/a0;

    .line 5
    .line 6
    invoke-direct {v1}, Lv7/a0;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    return-object v0
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

.method private e(J)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lv7/a0;->k:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lv7/a0;->k:Z

    .line 7
    .line 8
    iget-object v0, p0, Lv7/a0;->d:Lv7/y;

    .line 9
    .line 10
    invoke-virtual {v0}, Lv7/y;->c()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v0, v0, v2

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, Lv7/x;

    .line 24
    .line 25
    iget-object v1, p0, Lv7/a0;->d:Lv7/y;

    .line 26
    .line 27
    invoke-virtual {v1}, Lv7/y;->d()Lf9/l0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v1, p0, Lv7/a0;->d:Lv7/y;

    .line 32
    .line 33
    invoke-virtual {v1}, Lv7/y;->c()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    move-object v1, v0

    .line 38
    move-wide v5, p1

    .line 39
    invoke-direct/range {v1 .. v6}, Lv7/x;-><init>(Lf9/l0;JJ)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lv7/a0;->i:Lv7/x;

    .line 43
    .line 44
    iget-object p1, p0, Lv7/a0;->j:Ll7/k;

    .line 45
    .line 46
    invoke-virtual {v0}, Ll7/a;->b()Ll7/y;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-interface {p1, p2}, Ll7/k;->i(Ll7/y;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object p1, p0, Lv7/a0;->j:Ll7/k;

    .line 55
    .line 56
    new-instance p2, Ll7/y$b;

    .line 57
    .line 58
    iget-object v0, p0, Lv7/a0;->d:Lv7/y;

    .line 59
    .line 60
    invoke-virtual {v0}, Lv7/y;->c()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    invoke-direct {p2, v0, v1}, Ll7/y$b;-><init>(J)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, p2}, Ll7/k;->i(Ll7/y;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    return-void
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


# virtual methods
.method public b(Ll7/k;)V
    .locals 0

    iput-object p1, p0, Lv7/a0;->j:Ll7/k;

    return-void
.end method

.method public c(JJ)V
    .locals 4

    .line 1
    iget-object p1, p0, Lv7/a0;->a:Lf9/l0;

    .line 2
    .line 3
    invoke-virtual {p1}, Lf9/l0;->e()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p1, p1, v0

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p1, p2

    .line 20
    :goto_0
    if-nez p1, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lv7/a0;->a:Lf9/l0;

    .line 23
    .line 24
    invoke-virtual {p1}, Lf9/l0;->c()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmp-long p1, v0, v2

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Lv7/a0;->a:Lf9/l0;

    .line 35
    .line 36
    invoke-virtual {p1}, Lf9/l0;->c()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    cmp-long p1, v0, p3

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    :cond_1
    iget-object p1, p0, Lv7/a0;->a:Lf9/l0;

    .line 45
    .line 46
    invoke-virtual {p1, p3, p4}, Lf9/l0;->g(J)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lv7/a0;->i:Lv7/x;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p3, p4}, Ll7/a;->h(J)V

    .line 54
    .line 55
    .line 56
    :cond_3
    :goto_1
    iget-object p1, p0, Lv7/a0;->b:Landroid/util/SparseArray;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-ge p2, p1, :cond_4

    .line 63
    .line 64
    iget-object p1, p0, Lv7/a0;->b:Landroid/util/SparseArray;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Lv7/a0$a;

    .line 71
    .line 72
    invoke-virtual {p1}, Lv7/a0$a;->d()V

    .line 73
    .line 74
    .line 75
    add-int/lit8 p2, p2, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    return-void
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

.method public f(Ll7/j;Ll7/x;)I
    .locals 9

    .line 1
    iget-object v0, p0, Lv7/a0;->j:Ll7/k;

    invoke-static {v0}, Lf9/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    invoke-interface {p1}, Ll7/j;->getLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    move v7, v5

    goto :goto_0

    :cond_0
    move v7, v6

    :goto_0
    if-eqz v7, :cond_1

    .line 3
    iget-object v7, p0, Lv7/a0;->d:Lv7/y;

    invoke-virtual {v7}, Lv7/y;->e()Z

    move-result v7

    if-nez v7, :cond_1

    .line 4
    iget-object v0, p0, Lv7/a0;->d:Lv7/y;

    invoke-virtual {v0, p1, p2}, Lv7/y;->g(Ll7/j;Ll7/x;)I

    move-result p1

    return p1

    .line 5
    :cond_1
    invoke-direct {p0, v0, v1}, Lv7/a0;->e(J)V

    .line 6
    iget-object v7, p0, Lv7/a0;->i:Lv7/x;

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Ll7/a;->d()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 7
    iget-object v0, p0, Lv7/a0;->i:Lv7/x;

    invoke-virtual {v0, p1, p2}, Ll7/a;->c(Ll7/j;Ll7/x;)I

    move-result p1

    return p1

    .line 8
    :cond_2
    invoke-interface {p1}, Ll7/j;->j()V

    if-eqz v4, :cond_3

    .line 9
    invoke-interface {p1}, Ll7/j;->e()J

    move-result-wide v7

    sub-long/2addr v0, v7

    goto :goto_1

    :cond_3
    move-wide v0, v2

    :goto_1
    cmp-long p2, v0, v2

    const/4 v2, -0x1

    if-eqz p2, :cond_4

    const-wide/16 v3, 0x4

    cmp-long p2, v0, v3

    if-gez p2, :cond_4

    return v2

    .line 10
    :cond_4
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->d()[B

    move-result-object p2

    const/4 v0, 0x4

    invoke-interface {p1, p2, v6, v0, v5}, Ll7/j;->d([BIIZ)Z

    move-result p2

    if-nez p2, :cond_5

    return v2

    .line 11
    :cond_5
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2, v6}, Lf9/y;->P(I)V

    .line 12
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->n()I

    move-result p2

    const/16 v0, 0x1b9

    if-ne p2, v0, :cond_6

    return v2

    :cond_6
    const/16 v0, 0x1ba

    if-ne p2, v0, :cond_7

    .line 13
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->d()[B

    move-result-object p2

    const/16 v0, 0xa

    invoke-interface {p1, p2, v6, v0}, Ll7/j;->n([BII)V

    .line 14
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Lf9/y;->P(I)V

    .line 15
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->D()I

    move-result p2

    and-int/lit8 p2, p2, 0x7

    add-int/lit8 p2, p2, 0xe

    .line 16
    invoke-interface {p1, p2}, Ll7/j;->k(I)V

    return v6

    :cond_7
    const/16 v0, 0x1bb

    const/4 v1, 0x2

    const/4 v2, 0x6

    if-ne p2, v0, :cond_8

    .line 17
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->d()[B

    move-result-object p2

    invoke-interface {p1, p2, v6, v1}, Ll7/j;->n([BII)V

    .line 18
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2, v6}, Lf9/y;->P(I)V

    .line 19
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->J()I

    move-result p2

    add-int/2addr p2, v2

    .line 20
    invoke-interface {p1, p2}, Ll7/j;->k(I)V

    return v6

    :cond_8
    and-int/lit16 v0, p2, -0x100

    shr-int/lit8 v0, v0, 0x8

    if-eq v0, v5, :cond_9

    .line 21
    invoke-interface {p1, v5}, Ll7/j;->k(I)V

    return v6

    :cond_9
    and-int/lit16 p2, p2, 0xff

    .line 22
    iget-object v0, p0, Lv7/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/a0$a;

    .line 23
    iget-boolean v3, p0, Lv7/a0;->e:Z

    if-nez v3, :cond_f

    if-nez v0, :cond_d

    const/16 v3, 0xbd

    if-ne p2, v3, :cond_a

    .line 24
    new-instance v3, Lv7/c;

    invoke-direct {v3}, Lv7/c;-><init>()V

    .line 25
    iput-boolean v5, p0, Lv7/a0;->f:Z

    .line 26
    invoke-interface {p1}, Ll7/j;->getPosition()J

    move-result-wide v7

    iput-wide v7, p0, Lv7/a0;->h:J

    goto :goto_2

    :cond_a
    and-int/lit16 v3, p2, 0xe0

    const/16 v4, 0xc0

    if-ne v3, v4, :cond_b

    .line 27
    new-instance v3, Lv7/t;

    invoke-direct {v3}, Lv7/t;-><init>()V

    .line 28
    iput-boolean v5, p0, Lv7/a0;->f:Z

    .line 29
    invoke-interface {p1}, Ll7/j;->getPosition()J

    move-result-wide v7

    iput-wide v7, p0, Lv7/a0;->h:J

    goto :goto_2

    :cond_b
    and-int/lit16 v3, p2, 0xf0

    const/16 v4, 0xe0

    if-ne v3, v4, :cond_c

    .line 30
    new-instance v3, Lv7/n;

    invoke-direct {v3}, Lv7/n;-><init>()V

    .line 31
    iput-boolean v5, p0, Lv7/a0;->g:Z

    .line 32
    invoke-interface {p1}, Ll7/j;->getPosition()J

    move-result-wide v7

    iput-wide v7, p0, Lv7/a0;->h:J

    goto :goto_2

    :cond_c
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_d

    .line 33
    new-instance v0, Lv7/i0$d;

    const/16 v4, 0x100

    invoke-direct {v0, p2, v4}, Lv7/i0$d;-><init>(II)V

    .line 34
    iget-object v4, p0, Lv7/a0;->j:Ll7/k;

    invoke-interface {v3, v4, v0}, Lv7/m;->e(Ll7/k;Lv7/i0$d;)V

    .line 35
    new-instance v0, Lv7/a0$a;

    iget-object v4, p0, Lv7/a0;->a:Lf9/l0;

    invoke-direct {v0, v3, v4}, Lv7/a0$a;-><init>(Lv7/m;Lf9/l0;)V

    .line 36
    iget-object v3, p0, Lv7/a0;->b:Landroid/util/SparseArray;

    invoke-virtual {v3, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 37
    :cond_d
    iget-boolean p2, p0, Lv7/a0;->f:Z

    if-eqz p2, :cond_e

    iget-boolean p2, p0, Lv7/a0;->g:Z

    if-eqz p2, :cond_e

    .line 38
    iget-wide v3, p0, Lv7/a0;->h:J

    const-wide/16 v7, 0x2000

    add-long/2addr v3, v7

    goto :goto_3

    :cond_e
    const-wide/32 v3, 0x100000

    .line 39
    :goto_3
    invoke-interface {p1}, Ll7/j;->getPosition()J

    move-result-wide v7

    cmp-long p2, v7, v3

    if-lez p2, :cond_f

    .line 40
    iput-boolean v5, p0, Lv7/a0;->e:Z

    .line 41
    iget-object p2, p0, Lv7/a0;->j:Ll7/k;

    invoke-interface {p2}, Ll7/k;->q()V

    .line 42
    :cond_f
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->d()[B

    move-result-object p2

    invoke-interface {p1, p2, v6, v1}, Ll7/j;->n([BII)V

    .line 43
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2, v6}, Lf9/y;->P(I)V

    .line 44
    iget-object p2, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p2}, Lf9/y;->J()I

    move-result p2

    add-int/2addr p2, v2

    if-nez v0, :cond_10

    .line 45
    invoke-interface {p1, p2}, Ll7/j;->k(I)V

    goto :goto_4

    .line 46
    :cond_10
    iget-object v1, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {v1, p2}, Lf9/y;->L(I)V

    .line 47
    iget-object v1, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {v1}, Lf9/y;->d()[B

    move-result-object v1

    invoke-interface {p1, v1, v6, p2}, Ll7/j;->readFully([BII)V

    .line 48
    iget-object p1, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p1, v2}, Lf9/y;->P(I)V

    .line 49
    iget-object p1, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {v0, p1}, Lv7/a0$a;->a(Lf9/y;)V

    .line 50
    iget-object p1, p0, Lv7/a0;->c:Lf9/y;

    invoke-virtual {p1}, Lf9/y;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Lf9/y;->O(I)V

    :goto_4
    return v6
.end method

.method public i(Ll7/j;)Z
    .locals 9

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v1, v2, v0}, Ll7/j;->n([BII)V

    .line 7
    .line 8
    .line 9
    aget-byte v0, v1, v2

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    shl-int/lit8 v0, v0, 0x18

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    aget-byte v4, v1, v3

    .line 17
    .line 18
    and-int/lit16 v4, v4, 0xff

    .line 19
    .line 20
    shl-int/lit8 v4, v4, 0x10

    .line 21
    .line 22
    or-int/2addr v0, v4

    .line 23
    const/4 v4, 0x2

    .line 24
    aget-byte v5, v1, v4

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    const/16 v6, 0x8

    .line 29
    .line 30
    shl-int/2addr v5, v6

    .line 31
    or-int/2addr v0, v5

    .line 32
    const/4 v5, 0x3

    .line 33
    aget-byte v7, v1, v5

    .line 34
    .line 35
    and-int/lit16 v7, v7, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v7

    .line 38
    const/16 v7, 0x1ba

    .line 39
    .line 40
    if-eq v7, v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    const/4 v0, 0x4

    .line 44
    aget-byte v7, v1, v0

    .line 45
    .line 46
    and-int/lit16 v7, v7, 0xc4

    .line 47
    .line 48
    const/16 v8, 0x44

    .line 49
    .line 50
    if-eq v7, v8, :cond_1

    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    const/4 v7, 0x6

    .line 54
    aget-byte v7, v1, v7

    .line 55
    .line 56
    and-int/2addr v7, v0

    .line 57
    if-eq v7, v0, :cond_2

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    aget-byte v7, v1, v6

    .line 61
    .line 62
    and-int/2addr v7, v0

    .line 63
    if-eq v7, v0, :cond_3

    .line 64
    .line 65
    return v2

    .line 66
    :cond_3
    const/16 v0, 0x9

    .line 67
    .line 68
    aget-byte v0, v1, v0

    .line 69
    .line 70
    and-int/2addr v0, v3

    .line 71
    if-eq v0, v3, :cond_4

    .line 72
    .line 73
    return v2

    .line 74
    :cond_4
    const/16 v0, 0xc

    .line 75
    .line 76
    aget-byte v0, v1, v0

    .line 77
    .line 78
    and-int/2addr v0, v5

    .line 79
    if-eq v0, v5, :cond_5

    .line 80
    .line 81
    return v2

    .line 82
    :cond_5
    const/16 v0, 0xd

    .line 83
    .line 84
    aget-byte v0, v1, v0

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    invoke-interface {p1, v0}, Ll7/j;->g(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v1, v2, v5}, Ll7/j;->n([BII)V

    .line 92
    .line 93
    .line 94
    aget-byte p1, v1, v2

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    shl-int/lit8 p1, p1, 0x10

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/2addr v0, v6

    .line 105
    or-int/2addr p1, v0

    .line 106
    aget-byte v0, v1, v4

    .line 107
    .line 108
    and-int/lit16 v0, v0, 0xff

    .line 109
    .line 110
    or-int/2addr p1, v0

    .line 111
    if-ne v3, p1, :cond_6

    .line 112
    .line 113
    move v2, v3

    .line 114
    :cond_6
    return v2
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

.method public release()V
    .locals 0

    return-void
.end method
