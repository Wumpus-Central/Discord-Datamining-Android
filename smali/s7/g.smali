.class public Ls7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/g$b;,
        Ls7/g$a;
    }
.end annotation


# static fields
.field public static final I:Ll7/o;

.field private static final J:[B

.field private static final K:Ld7/k;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:Z

.field private E:Ll7/k;

.field private F:[Ll7/b0;

.field private G:[Ll7/b0;

.field private H:Z

.field private final a:I

.field private final b:Ls7/o;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/k;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lf9/y;

.field private final f:Lf9/y;

.field private final g:Lf9/y;

.field private final h:[B

.field private final i:Lf9/y;

.field private final j:Lf9/l0;

.field private final k:La8/c;

.field private final l:Lf9/y;

.field private final m:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ls7/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ls7/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ll7/b0;

.field private p:I

.field private q:I

.field private r:J

.field private s:I

.field private t:Lf9/y;

.field private u:J

.field private v:I

.field private w:J

.field private x:J

.field private y:J

.field private z:Ls7/g$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ls7/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls7/g;->I:Ll7/o;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v0, v0, [B

    .line 11
    .line 12
    fill-array-data v0, :array_0

    .line 13
    .line 14
    .line 15
    sput-object v0, Ls7/g;->J:[B

    .line 16
    .line 17
    new-instance v0, Ld7/k$b;

    .line 18
    .line 19
    invoke-direct {v0}, Ld7/k$b;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "application/x-emsg"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ld7/k$b;->e0(Ljava/lang/String;)Ld7/k$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ld7/k$b;->E()Ld7/k;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Ls7/g;->K:Ld7/k;

    .line 33
    .line 34
    return-void

    .line 35
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
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
    invoke-direct {p0, v0}, Ls7/g;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Ls7/g;-><init>(ILf9/l0;)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;)V
    .locals 2

    const/4 v0, 0x0

    .line 3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, p1, p2, v0, v1}, Ls7/g;-><init>(ILf9/l0;Ls7/o;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;Ls7/o;)V
    .locals 1

    .line 4
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Ls7/g;-><init>(ILf9/l0;Ls7/o;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;Ls7/o;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lf9/l0;",
            "Ls7/o;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 5
    invoke-direct/range {v0 .. v5}, Ls7/g;-><init>(ILf9/l0;Ls7/o;Ljava/util/List;Ll7/b0;)V

    return-void
.end method

.method public constructor <init>(ILf9/l0;Ls7/o;Ljava/util/List;Ll7/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lf9/l0;",
            "Ls7/o;",
            "Ljava/util/List<",
            "Ld7/k;",
            ">;",
            "Ll7/b0;",
            ")V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput p1, p0, Ls7/g;->a:I

    .line 8
    iput-object p2, p0, Ls7/g;->j:Lf9/l0;

    .line 9
    iput-object p3, p0, Ls7/g;->b:Ls7/o;

    .line 10
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ls7/g;->c:Ljava/util/List;

    .line 11
    iput-object p5, p0, Ls7/g;->o:Ll7/b0;

    .line 12
    new-instance p1, La8/c;

    invoke-direct {p1}, La8/c;-><init>()V

    iput-object p1, p0, Ls7/g;->k:La8/c;

    .line 13
    new-instance p1, Lf9/y;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, Lf9/y;-><init>(I)V

    iput-object p1, p0, Ls7/g;->l:Lf9/y;

    .line 14
    new-instance p1, Lf9/y;

    sget-object p3, Lf9/w;->a:[B

    invoke-direct {p1, p3}, Lf9/y;-><init>([B)V

    iput-object p1, p0, Ls7/g;->e:Lf9/y;

    .line 15
    new-instance p1, Lf9/y;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lf9/y;-><init>(I)V

    iput-object p1, p0, Ls7/g;->f:Lf9/y;

    .line 16
    new-instance p1, Lf9/y;

    invoke-direct {p1}, Lf9/y;-><init>()V

    iput-object p1, p0, Ls7/g;->g:Lf9/y;

    new-array p1, p2, [B

    .line 17
    iput-object p1, p0, Ls7/g;->h:[B

    .line 18
    new-instance p2, Lf9/y;

    invoke-direct {p2, p1}, Lf9/y;-><init>([B)V

    iput-object p2, p0, Ls7/g;->i:Lf9/y;

    .line 19
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 20
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ls7/g;->n:Ljava/util/ArrayDeque;

    .line 21
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    iput-wide p1, p0, Ls7/g;->x:J

    .line 23
    iput-wide p1, p0, Ls7/g;->w:J

    .line 24
    iput-wide p1, p0, Ls7/g;->y:J

    .line 25
    sget-object p1, Ll7/k;->e:Ll7/k;

    iput-object p1, p0, Ls7/g;->E:Ll7/k;

    const/4 p1, 0x0

    new-array p2, p1, [Ll7/b0;

    .line 26
    iput-object p2, p0, Ls7/g;->F:[Ll7/b0;

    new-array p1, p1, [Ll7/b0;

    .line 27
    iput-object p1, p0, Ls7/g;->G:[Ll7/b0;

    return-void
.end method

.method private static A(Lf9/y;Ls7/q;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, Ls7/g;->z(Lf9/y;ILs7/q;)V

    return-void
.end method

.method private static B(Lf9/y;J)Landroid/util/Pair;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            "J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ll7/d;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ls7/a;->c(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, Lf9/y;->Q(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Lf9/y;->F()J

    .line 21
    .line 22
    .line 23
    move-result-wide v9

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual/range {p0 .. p0}, Lf9/y;->F()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual/range {p0 .. p0}, Lf9/y;->F()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lf9/y;->I()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    invoke-virtual/range {p0 .. p0}, Lf9/y;->I()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    :goto_0
    add-long v5, p1, v5

    .line 44
    .line 45
    move-wide v11, v3

    .line 46
    move-wide v13, v5

    .line 47
    const-wide/32 v5, 0xf4240

    .line 48
    .line 49
    .line 50
    move-wide v3, v11

    .line 51
    move-wide v7, v9

    .line 52
    invoke-static/range {v3 .. v8}, Lf9/q0;->I0(JJJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v15

    .line 56
    const/4 v1, 0x2

    .line 57
    invoke-virtual {v0, v1}, Lf9/y;->Q(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual/range {p0 .. p0}, Lf9/y;->J()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    new-array v7, v1, [I

    .line 65
    .line 66
    new-array v8, v1, [J

    .line 67
    .line 68
    new-array v5, v1, [J

    .line 69
    .line 70
    new-array v6, v1, [J

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    move-wide/from16 v17, v15

    .line 74
    .line 75
    move-wide/from16 v23, v11

    .line 76
    .line 77
    move v11, v3

    .line 78
    move-wide/from16 v3, v23

    .line 79
    .line 80
    :goto_1
    if-ge v11, v1, :cond_2

    .line 81
    .line 82
    invoke-virtual/range {p0 .. p0}, Lf9/y;->n()I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const/high16 v19, -0x80000000

    .line 87
    .line 88
    and-int v19, v12, v19

    .line 89
    .line 90
    if-nez v19, :cond_1

    .line 91
    .line 92
    invoke-virtual/range {p0 .. p0}, Lf9/y;->F()J

    .line 93
    .line 94
    .line 95
    move-result-wide v19

    .line 96
    const v21, 0x7fffffff

    .line 97
    .line 98
    .line 99
    and-int v12, v12, v21

    .line 100
    .line 101
    aput v12, v7, v11

    .line 102
    .line 103
    aput-wide v13, v8, v11

    .line 104
    .line 105
    aput-wide v17, v6, v11

    .line 106
    .line 107
    add-long v17, v3, v19

    .line 108
    .line 109
    const-wide/32 v19, 0xf4240

    .line 110
    .line 111
    .line 112
    move-wide/from16 v3, v17

    .line 113
    .line 114
    move-object v12, v5

    .line 115
    move-object v2, v6

    .line 116
    move-wide/from16 v5, v19

    .line 117
    .line 118
    move/from16 p1, v1

    .line 119
    .line 120
    move-object v1, v7

    .line 121
    move-object/from16 v22, v8

    .line 122
    .line 123
    move-wide v7, v9

    .line 124
    invoke-static/range {v3 .. v8}, Lf9/q0;->I0(JJJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    aget-wide v5, v2, v11

    .line 129
    .line 130
    sub-long v5, v3, v5

    .line 131
    .line 132
    aput-wide v5, v12, v11

    .line 133
    .line 134
    const/4 v5, 0x4

    .line 135
    invoke-virtual {v0, v5}, Lf9/y;->Q(I)V

    .line 136
    .line 137
    .line 138
    aget v6, v1, v11

    .line 139
    .line 140
    int-to-long v6, v6

    .line 141
    add-long/2addr v13, v6

    .line 142
    add-int/lit8 v11, v11, 0x1

    .line 143
    .line 144
    move-object v7, v1

    .line 145
    move-object v6, v2

    .line 146
    move v2, v5

    .line 147
    move-object v5, v12

    .line 148
    move-object/from16 v8, v22

    .line 149
    .line 150
    move/from16 v1, p1

    .line 151
    .line 152
    move-wide/from16 v23, v3

    .line 153
    .line 154
    move-wide/from16 v3, v17

    .line 155
    .line 156
    move-wide/from16 v17, v23

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    new-instance v0, Ld7/o;

    .line 160
    .line 161
    const-string v1, "Unhandled indirect reference"

    .line 162
    .line 163
    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_2
    move-object v12, v5

    .line 168
    move-object v2, v6

    .line 169
    move-object v1, v7

    .line 170
    move-object/from16 v22, v8

    .line 171
    .line 172
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    new-instance v3, Ll7/d;

    .line 177
    .line 178
    move-object/from16 v4, v22

    .line 179
    .line 180
    invoke-direct {v3, v1, v4, v12, v2}, Ll7/d;-><init>([I[J[J[J)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0
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

.method private static C(Lf9/y;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ls7/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    :goto_0
    return-wide v0
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
.end method

.method private static D(Lf9/y;Landroid/util/SparseArray;)Ls7/g$b;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;)",
            "Ls7/g$b;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ls7/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {p1, v1}, Ls7/g;->k(Landroid/util/SparseArray;I)Ls7/g$b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_0
    and-int/lit8 v1, v0, 0x1

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    iget-object v3, p1, Ls7/g$b;->b:Ls7/q;

    .line 35
    .line 36
    iput-wide v1, v3, Ls7/q;->c:J

    .line 37
    .line 38
    iput-wide v1, v3, Ls7/q;->d:J

    .line 39
    .line 40
    :cond_1
    iget-object v1, p1, Ls7/g$b;->e:Ls7/c;

    .line 41
    .line 42
    and-int/lit8 v2, v0, 0x2

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v2, v2, -0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget v2, v1, Ls7/c;->a:I

    .line 54
    .line 55
    :goto_0
    and-int/lit8 v3, v0, 0x8

    .line 56
    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget v3, v1, Ls7/c;->b:I

    .line 65
    .line 66
    :goto_1
    and-int/lit8 v4, v0, 0x10

    .line 67
    .line 68
    if-eqz v4, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    goto :goto_2

    .line 75
    :cond_4
    iget v4, v1, Ls7/c;->c:I

    .line 76
    .line 77
    :goto_2
    and-int/lit8 v0, v0, 0x20

    .line 78
    .line 79
    if-eqz v0, :cond_5

    .line 80
    .line 81
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    iget p0, v1, Ls7/c;->d:I

    .line 87
    .line 88
    :goto_3
    iget-object v0, p1, Ls7/g$b;->b:Ls7/q;

    .line 89
    .line 90
    new-instance v1, Ls7/c;

    .line 91
    .line 92
    invoke-direct {v1, v2, v3, v4, p0}, Ls7/c;-><init>(IIII)V

    .line 93
    .line 94
    .line 95
    iput-object v1, v0, Ls7/q;->a:Ls7/c;

    .line 96
    .line 97
    return-object p1
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

.method private static E(Ls7/a$a;Landroid/util/SparseArray;I[B)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a$a;",
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;I[B)V"
        }
    .end annotation

    .line 1
    const v0, 0x74666864

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ls7/a$b;

    .line 13
    .line 14
    iget-object v0, v0, Ls7/a$b;->b:Lf9/y;

    .line 15
    .line 16
    invoke-static {v0, p1}, Ls7/g;->D(Lf9/y;Landroid/util/SparseArray;)Ls7/g$b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p1, Ls7/g$b;->b:Ls7/q;

    .line 24
    .line 25
    iget-wide v1, v0, Ls7/q;->r:J

    .line 26
    .line 27
    iget-boolean v3, v0, Ls7/q;->s:Z

    .line 28
    .line 29
    invoke-virtual {p1}, Ls7/g$b;->k()V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    invoke-static {p1, v4}, Ls7/g$b;->b(Ls7/g$b;Z)Z

    .line 34
    .line 35
    .line 36
    const v5, 0x74666474

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v5}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    and-int/lit8 v6, p2, 0x2

    .line 46
    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    iget-object v1, v5, Ls7/a$b;->b:Lf9/y;

    .line 50
    .line 51
    invoke-static {v1}, Ls7/g;->C(Lf9/y;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    iput-wide v1, v0, Ls7/q;->r:J

    .line 56
    .line 57
    iput-boolean v4, v0, Ls7/q;->s:Z

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iput-wide v1, v0, Ls7/q;->r:J

    .line 61
    .line 62
    iput-boolean v3, v0, Ls7/q;->s:Z

    .line 63
    .line 64
    :goto_0
    invoke-static {p0, p1, p2}, Ls7/g;->H(Ls7/a$a;Ls7/g$b;I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p1, Ls7/g$b;->d:Ls7/r;

    .line 68
    .line 69
    iget-object p1, p1, Ls7/r;->a:Ls7/o;

    .line 70
    .line 71
    iget-object p2, v0, Ls7/q;->a:Ls7/c;

    .line 72
    .line 73
    invoke-static {p2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    check-cast p2, Ls7/c;

    .line 78
    .line 79
    iget p2, p2, Ls7/c;->a:I

    .line 80
    .line 81
    invoke-virtual {p1, p2}, Ls7/o;->a(I)Ls7/p;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    const p2, 0x7361697a

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Ls7/p;

    .line 99
    .line 100
    iget-object p2, p2, Ls7/a$b;->b:Lf9/y;

    .line 101
    .line 102
    invoke-static {v1, p2, v0}, Ls7/g;->x(Ls7/p;Lf9/y;Ls7/q;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    const p2, 0x7361696f

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    if-eqz p2, :cond_3

    .line 113
    .line 114
    iget-object p2, p2, Ls7/a$b;->b:Lf9/y;

    .line 115
    .line 116
    invoke-static {p2, v0}, Ls7/g;->w(Lf9/y;Ls7/q;)V

    .line 117
    .line 118
    .line 119
    :cond_3
    const p2, 0x73656e63

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, p2}, Ls7/a$a;->g(I)Ls7/a$b;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p2, :cond_4

    .line 127
    .line 128
    iget-object p2, p2, Ls7/a$b;->b:Lf9/y;

    .line 129
    .line 130
    invoke-static {p2, v0}, Ls7/g;->A(Lf9/y;Ls7/q;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    if-eqz p1, :cond_5

    .line 134
    .line 135
    iget-object p1, p1, Ls7/p;->b:Ljava/lang/String;

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    const/4 p1, 0x0

    .line 139
    :goto_1
    invoke-static {p0, p1, v0}, Ls7/g;->y(Ls7/a$a;Ljava/lang/String;Ls7/q;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Ls7/a$a;->c:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    const/4 p2, 0x0

    .line 149
    :goto_2
    if-ge p2, p1, :cond_7

    .line 150
    .line 151
    iget-object v1, p0, Ls7/a$a;->c:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, Ls7/a$b;

    .line 158
    .line 159
    iget v2, v1, Ls7/a;->a:I

    .line 160
    .line 161
    const v3, 0x75756964

    .line 162
    .line 163
    .line 164
    if-ne v2, v3, :cond_6

    .line 165
    .line 166
    iget-object v1, v1, Ls7/a$b;->b:Lf9/y;

    .line 167
    .line 168
    invoke-static {v1, v0, p3}, Ls7/g;->I(Lf9/y;Ls7/q;[B)V

    .line 169
    .line 170
    .line 171
    :cond_6
    add-int/lit8 p2, p2, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_7
    return-void
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
.end method

.method private static F(Lf9/y;)Landroid/util/Pair;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf9/y;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Integer;",
            "Ls7/c;",
            ">;"
        }
    .end annotation

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v4, Ls7/c;

    .line 33
    .line 34
    invoke-direct {v4, v1, v2, v3, p0}, Ls7/c;-><init>(IIII)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v4}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
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

.method private static G(Ls7/g$b;IILf9/y;I)I
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Lf9/y;->P(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v1}, Ls7/a;->b(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v3, v0, Ls7/g$b;->d:Ls7/r;

    .line 19
    .line 20
    iget-object v3, v3, Ls7/r;->a:Ls7/o;

    .line 21
    .line 22
    iget-object v4, v0, Ls7/g$b;->b:Ls7/q;

    .line 23
    .line 24
    iget-object v5, v4, Ls7/q;->a:Ls7/c;

    .line 25
    .line 26
    invoke-static {v5}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ls7/c;

    .line 31
    .line 32
    iget-object v6, v4, Ls7/q;->h:[I

    .line 33
    .line 34
    invoke-virtual/range {p3 .. p3}, Lf9/y;->H()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    aput v7, v6, p1

    .line 39
    .line 40
    iget-object v6, v4, Ls7/q;->g:[J

    .line 41
    .line 42
    iget-wide v7, v4, Ls7/q;->c:J

    .line 43
    .line 44
    aput-wide v7, v6, p1

    .line 45
    .line 46
    and-int/lit8 v9, v1, 0x1

    .line 47
    .line 48
    if-eqz v9, :cond_0

    .line 49
    .line 50
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    int-to-long v9, v9

    .line 55
    add-long/2addr v7, v9

    .line 56
    aput-wide v7, v6, p1

    .line 57
    .line 58
    :cond_0
    and-int/lit8 v6, v1, 0x4

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    const/4 v8, 0x1

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    move v6, v8

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    move v6, v7

    .line 67
    :goto_0
    iget v9, v5, Ls7/c;->d:I

    .line 68
    .line 69
    if-eqz v6, :cond_2

    .line 70
    .line 71
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    :cond_2
    and-int/lit16 v10, v1, 0x100

    .line 76
    .line 77
    if-eqz v10, :cond_3

    .line 78
    .line 79
    move v10, v8

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move v10, v7

    .line 82
    :goto_1
    and-int/lit16 v11, v1, 0x200

    .line 83
    .line 84
    if-eqz v11, :cond_4

    .line 85
    .line 86
    move v11, v8

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move v11, v7

    .line 89
    :goto_2
    and-int/lit16 v12, v1, 0x400

    .line 90
    .line 91
    if-eqz v12, :cond_5

    .line 92
    .line 93
    move v12, v8

    .line 94
    goto :goto_3

    .line 95
    :cond_5
    move v12, v7

    .line 96
    :goto_3
    and-int/lit16 v1, v1, 0x800

    .line 97
    .line 98
    if-eqz v1, :cond_6

    .line 99
    .line 100
    move v1, v8

    .line 101
    goto :goto_4

    .line 102
    :cond_6
    move v1, v7

    .line 103
    :goto_4
    iget-object v13, v3, Ls7/o;->h:[J

    .line 104
    .line 105
    if-eqz v13, :cond_7

    .line 106
    .line 107
    array-length v14, v13

    .line 108
    if-ne v14, v8, :cond_7

    .line 109
    .line 110
    aget-wide v14, v13, v7

    .line 111
    .line 112
    const-wide/16 v16, 0x0

    .line 113
    .line 114
    cmp-long v13, v14, v16

    .line 115
    .line 116
    if-nez v13, :cond_8

    .line 117
    .line 118
    iget-object v13, v3, Ls7/o;->i:[J

    .line 119
    .line 120
    invoke-static {v13}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    check-cast v13, [J

    .line 125
    .line 126
    aget-wide v14, v13, v7

    .line 127
    .line 128
    const-wide/32 v16, 0xf4240

    .line 129
    .line 130
    .line 131
    iget-wide v7, v3, Ls7/o;->c:J

    .line 132
    .line 133
    move-wide/from16 v18, v7

    .line 134
    .line 135
    invoke-static/range {v14 .. v19}, Lf9/q0;->I0(JJJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v14

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    const-wide/16 v16, 0x0

    .line 141
    .line 142
    :cond_8
    move-wide/from16 v14, v16

    .line 143
    .line 144
    :goto_5
    iget-object v7, v4, Ls7/q;->i:[I

    .line 145
    .line 146
    iget-object v8, v4, Ls7/q;->j:[I

    .line 147
    .line 148
    iget-object v13, v4, Ls7/q;->k:[J

    .line 149
    .line 150
    iget-object v2, v4, Ls7/q;->l:[Z

    .line 151
    .line 152
    move/from16 v17, v9

    .line 153
    .line 154
    iget v9, v3, Ls7/o;->b:I

    .line 155
    .line 156
    move-object/from16 v18, v2

    .line 157
    .line 158
    const/4 v2, 0x2

    .line 159
    if-ne v9, v2, :cond_9

    .line 160
    .line 161
    const/4 v2, 0x1

    .line 162
    and-int/lit8 v9, p2, 0x1

    .line 163
    .line 164
    if-eqz v9, :cond_9

    .line 165
    .line 166
    const/4 v2, 0x1

    .line 167
    goto :goto_6

    .line 168
    :cond_9
    const/4 v2, 0x0

    .line 169
    :goto_6
    iget-object v9, v4, Ls7/q;->h:[I

    .line 170
    .line 171
    aget v9, v9, p1

    .line 172
    .line 173
    add-int v9, p4, v9

    .line 174
    .line 175
    move/from16 p2, v2

    .line 176
    .line 177
    iget-wide v2, v3, Ls7/o;->c:J

    .line 178
    .line 179
    move-wide/from16 v27, v14

    .line 180
    .line 181
    move-object v15, v13

    .line 182
    iget-wide v13, v4, Ls7/q;->r:J

    .line 183
    .line 184
    move-wide/from16 v29, v13

    .line 185
    .line 186
    move/from16 v13, p4

    .line 187
    .line 188
    :goto_7
    if-ge v13, v9, :cond_12

    .line 189
    .line 190
    if-eqz v10, :cond_a

    .line 191
    .line 192
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    goto :goto_8

    .line 197
    :cond_a
    iget v14, v5, Ls7/c;->b:I

    .line 198
    .line 199
    :goto_8
    invoke-static {v14}, Ls7/g;->d(I)I

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    if-eqz v11, :cond_b

    .line 204
    .line 205
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 206
    .line 207
    .line 208
    move-result v19

    .line 209
    move/from16 v35, v19

    .line 210
    .line 211
    move/from16 v19, v10

    .line 212
    .line 213
    move/from16 v10, v35

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_b
    move/from16 v19, v10

    .line 217
    .line 218
    iget v10, v5, Ls7/c;->c:I

    .line 219
    .line 220
    :goto_9
    invoke-static {v10}, Ls7/g;->d(I)I

    .line 221
    .line 222
    .line 223
    move-result v10

    .line 224
    if-eqz v12, :cond_c

    .line 225
    .line 226
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 227
    .line 228
    .line 229
    move-result v21

    .line 230
    move/from16 v31, v6

    .line 231
    .line 232
    move/from16 v6, v21

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_c
    if-nez v13, :cond_d

    .line 236
    .line 237
    if-eqz v6, :cond_d

    .line 238
    .line 239
    move/from16 v31, v6

    .line 240
    .line 241
    move/from16 v6, v17

    .line 242
    .line 243
    goto :goto_a

    .line 244
    :cond_d
    move/from16 v31, v6

    .line 245
    .line 246
    iget v6, v5, Ls7/c;->d:I

    .line 247
    .line 248
    :goto_a
    if-eqz v1, :cond_e

    .line 249
    .line 250
    move/from16 v32, v1

    .line 251
    .line 252
    invoke-virtual/range {p3 .. p3}, Lf9/y;->n()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    move/from16 v33, v11

    .line 257
    .line 258
    move/from16 v34, v12

    .line 259
    .line 260
    int-to-long v11, v1

    .line 261
    const-wide/32 v21, 0xf4240

    .line 262
    .line 263
    .line 264
    mul-long v11, v11, v21

    .line 265
    .line 266
    div-long/2addr v11, v2

    .line 267
    long-to-int v1, v11

    .line 268
    aput v1, v8, v13

    .line 269
    .line 270
    const/16 v16, 0x0

    .line 271
    .line 272
    goto :goto_b

    .line 273
    :cond_e
    move/from16 v32, v1

    .line 274
    .line 275
    move/from16 v33, v11

    .line 276
    .line 277
    move/from16 v34, v12

    .line 278
    .line 279
    const/16 v16, 0x0

    .line 280
    .line 281
    aput v16, v8, v13

    .line 282
    .line 283
    :goto_b
    const-wide/32 v23, 0xf4240

    .line 284
    .line 285
    .line 286
    move-wide/from16 v21, v29

    .line 287
    .line 288
    move-wide/from16 v25, v2

    .line 289
    .line 290
    invoke-static/range {v21 .. v26}, Lf9/q0;->I0(JJJ)J

    .line 291
    .line 292
    .line 293
    move-result-wide v11

    .line 294
    sub-long v11, v11, v27

    .line 295
    .line 296
    aput-wide v11, v15, v13

    .line 297
    .line 298
    iget-boolean v1, v4, Ls7/q;->s:Z

    .line 299
    .line 300
    if-nez v1, :cond_f

    .line 301
    .line 302
    iget-object v1, v0, Ls7/g$b;->d:Ls7/r;

    .line 303
    .line 304
    iget-wide v0, v1, Ls7/r;->h:J

    .line 305
    .line 306
    add-long/2addr v11, v0

    .line 307
    aput-wide v11, v15, v13

    .line 308
    .line 309
    :cond_f
    aput v10, v7, v13

    .line 310
    .line 311
    shr-int/lit8 v0, v6, 0x10

    .line 312
    .line 313
    const/4 v1, 0x1

    .line 314
    and-int/2addr v0, v1

    .line 315
    if-nez v0, :cond_11

    .line 316
    .line 317
    if-eqz p2, :cond_10

    .line 318
    .line 319
    if-nez v13, :cond_11

    .line 320
    .line 321
    :cond_10
    move v0, v1

    .line 322
    goto :goto_c

    .line 323
    :cond_11
    move/from16 v0, v16

    .line 324
    .line 325
    :goto_c
    aput-boolean v0, v18, v13

    .line 326
    .line 327
    int-to-long v10, v14

    .line 328
    move-wide/from16 v20, v2

    .line 329
    .line 330
    move-wide/from16 v1, v29

    .line 331
    .line 332
    add-long v29, v1, v10

    .line 333
    .line 334
    add-int/lit8 v13, v13, 0x1

    .line 335
    .line 336
    move-object/from16 v0, p0

    .line 337
    .line 338
    move/from16 v10, v19

    .line 339
    .line 340
    move-wide/from16 v2, v20

    .line 341
    .line 342
    move/from16 v6, v31

    .line 343
    .line 344
    move/from16 v1, v32

    .line 345
    .line 346
    move/from16 v11, v33

    .line 347
    .line 348
    move/from16 v12, v34

    .line 349
    .line 350
    goto/16 :goto_7

    .line 351
    .line 352
    :cond_12
    move-wide/from16 v1, v29

    .line 353
    .line 354
    iput-wide v1, v4, Ls7/q;->r:J

    .line 355
    .line 356
    return v9
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
.end method

.method private static H(Ls7/a$a;Ls7/g$b;I)V
    .locals 8

    .line 1
    iget-object p0, p0, Ls7/a$a;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    move v3, v2

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const v5, 0x7472756e

    .line 12
    .line 13
    .line 14
    if-ge v2, v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    check-cast v6, Ls7/a$b;

    .line 21
    .line 22
    iget v7, v6, Ls7/a;->a:I

    .line 23
    .line 24
    if-ne v7, v5, :cond_0

    .line 25
    .line 26
    iget-object v5, v6, Ls7/a$b;->b:Lf9/y;

    .line 27
    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    invoke-virtual {v5, v6}, Lf9/y;->P(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5}, Lf9/y;->H()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-lez v5, :cond_0

    .line 38
    .line 39
    add-int/2addr v4, v5

    .line 40
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iput v1, p1, Ls7/g$b;->h:I

    .line 46
    .line 47
    iput v1, p1, Ls7/g$b;->g:I

    .line 48
    .line 49
    iput v1, p1, Ls7/g$b;->f:I

    .line 50
    .line 51
    iget-object v2, p1, Ls7/g$b;->b:Ls7/q;

    .line 52
    .line 53
    invoke-virtual {v2, v3, v4}, Ls7/q;->e(II)V

    .line 54
    .line 55
    .line 56
    move v2, v1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v1, v0, :cond_3

    .line 59
    .line 60
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    check-cast v4, Ls7/a$b;

    .line 65
    .line 66
    iget v6, v4, Ls7/a;->a:I

    .line 67
    .line 68
    if-ne v6, v5, :cond_2

    .line 69
    .line 70
    add-int/lit8 v6, v2, 0x1

    .line 71
    .line 72
    iget-object v4, v4, Ls7/a$b;->b:Lf9/y;

    .line 73
    .line 74
    invoke-static {p1, v2, p2, v4, v3}, Ls7/g;->G(Ls7/g$b;IILf9/y;I)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v3, v2

    .line 79
    move v2, v6

    .line 80
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    return-void
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
.end method

.method private static I(Lf9/y;Ls7/q;[B)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-virtual {p0, p2, v0, v1}, Lf9/y;->j([BII)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ls7/g;->J:[B

    .line 13
    .line 14
    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-static {p0, v1, p1}, Ls7/g;->z(Lf9/y;ILs7/q;)V

    .line 22
    .line 23
    .line 24
    return-void
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
.end method

.method private J(J)V
    .locals 2

    .line 1
    :goto_0
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls7/a$a;

    .line 16
    .line 17
    iget-wide v0, v0, Ls7/a$a;->b:J

    .line 18
    .line 19
    cmp-long v0, v0, p1

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ls7/a$a;

    .line 30
    .line 31
    invoke-direct {p0, v0}, Ls7/g;->o(Ls7/a$a;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-direct {p0}, Ls7/g;->e()V

    .line 36
    .line 37
    .line 38
    return-void
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

.method private K(Ll7/j;)Z
    .locals 11

    .line 1
    iget v0, p0, Ls7/g;->s:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 10
    .line 11
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p1, v0, v2, v1, v3}, Ll7/j;->c([BIIZ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    return v2

    .line 22
    :cond_0
    iput v1, p0, Ls7/g;->s:I

    .line 23
    .line 24
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Lf9/y;->P(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 30
    .line 31
    invoke-virtual {v0}, Lf9/y;->F()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    iput-wide v4, p0, Ls7/g;->r:J

    .line 36
    .line 37
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 38
    .line 39
    invoke-virtual {v0}, Lf9/y;->n()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, Ls7/g;->q:I

    .line 44
    .line 45
    :cond_1
    iget-wide v4, p0, Ls7/g;->r:J

    .line 46
    .line 47
    const-wide/16 v6, 0x1

    .line 48
    .line 49
    cmp-long v0, v4, v6

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 54
    .line 55
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-interface {p1, v0, v1, v1}, Ll7/j;->readFully([BII)V

    .line 60
    .line 61
    .line 62
    iget v0, p0, Ls7/g;->s:I

    .line 63
    .line 64
    add-int/2addr v0, v1

    .line 65
    iput v0, p0, Ls7/g;->s:I

    .line 66
    .line 67
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 68
    .line 69
    invoke-virtual {v0}, Lf9/y;->I()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    iput-wide v4, p0, Ls7/g;->r:J

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    const-wide/16 v6, 0x0

    .line 77
    .line 78
    cmp-long v0, v4, v6

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    invoke-interface {p1}, Ll7/j;->getLength()J

    .line 83
    .line 84
    .line 85
    move-result-wide v4

    .line 86
    const-wide/16 v6, -0x1

    .line 87
    .line 88
    cmp-long v0, v4, v6

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ls7/a$a;

    .line 107
    .line 108
    iget-wide v4, v0, Ls7/a$a;->b:J

    .line 109
    .line 110
    :cond_3
    cmp-long v0, v4, v6

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 115
    .line 116
    .line 117
    move-result-wide v6

    .line 118
    sub-long/2addr v4, v6

    .line 119
    iget v0, p0, Ls7/g;->s:I

    .line 120
    .line 121
    int-to-long v6, v0

    .line 122
    add-long/2addr v4, v6

    .line 123
    iput-wide v4, p0, Ls7/g;->r:J

    .line 124
    .line 125
    :cond_4
    :goto_0
    iget-wide v4, p0, Ls7/g;->r:J

    .line 126
    .line 127
    iget v0, p0, Ls7/g;->s:I

    .line 128
    .line 129
    int-to-long v6, v0

    .line 130
    cmp-long v0, v4, v6

    .line 131
    .line 132
    if-ltz v0, :cond_f

    .line 133
    .line 134
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 135
    .line 136
    .line 137
    move-result-wide v4

    .line 138
    iget v0, p0, Ls7/g;->s:I

    .line 139
    .line 140
    int-to-long v6, v0

    .line 141
    sub-long/2addr v4, v6

    .line 142
    iget v0, p0, Ls7/g;->q:I

    .line 143
    .line 144
    const v6, 0x6d646174

    .line 145
    .line 146
    .line 147
    const v7, 0x6d6f6f66

    .line 148
    .line 149
    .line 150
    if-eq v0, v7, :cond_5

    .line 151
    .line 152
    if-ne v0, v6, :cond_6

    .line 153
    .line 154
    :cond_5
    iget-boolean v0, p0, Ls7/g;->H:Z

    .line 155
    .line 156
    if-nez v0, :cond_6

    .line 157
    .line 158
    iget-object v0, p0, Ls7/g;->E:Ll7/k;

    .line 159
    .line 160
    new-instance v8, Ll7/y$b;

    .line 161
    .line 162
    iget-wide v9, p0, Ls7/g;->x:J

    .line 163
    .line 164
    invoke-direct {v8, v9, v10, v4, v5}, Ll7/y$b;-><init>(JJ)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v8}, Ll7/k;->i(Ll7/y;)V

    .line 168
    .line 169
    .line 170
    iput-boolean v3, p0, Ls7/g;->H:Z

    .line 171
    .line 172
    :cond_6
    iget v0, p0, Ls7/g;->q:I

    .line 173
    .line 174
    if-ne v0, v7, :cond_7

    .line 175
    .line 176
    iget-object v0, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    move v7, v2

    .line 183
    :goto_1
    if-ge v7, v0, :cond_7

    .line 184
    .line 185
    iget-object v8, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 186
    .line 187
    invoke-virtual {v8, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v8

    .line 191
    check-cast v8, Ls7/g$b;

    .line 192
    .line 193
    iget-object v8, v8, Ls7/g$b;->b:Ls7/q;

    .line 194
    .line 195
    iput-wide v4, v8, Ls7/q;->b:J

    .line 196
    .line 197
    iput-wide v4, v8, Ls7/q;->d:J

    .line 198
    .line 199
    iput-wide v4, v8, Ls7/q;->c:J

    .line 200
    .line 201
    add-int/lit8 v7, v7, 0x1

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    iget v0, p0, Ls7/g;->q:I

    .line 205
    .line 206
    const/4 v7, 0x0

    .line 207
    if-ne v0, v6, :cond_8

    .line 208
    .line 209
    iput-object v7, p0, Ls7/g;->z:Ls7/g$b;

    .line 210
    .line 211
    iget-wide v0, p0, Ls7/g;->r:J

    .line 212
    .line 213
    add-long/2addr v4, v0

    .line 214
    iput-wide v4, p0, Ls7/g;->u:J

    .line 215
    .line 216
    const/4 p1, 0x2

    .line 217
    iput p1, p0, Ls7/g;->p:I

    .line 218
    .line 219
    return v3

    .line 220
    :cond_8
    invoke-static {v0}, Ls7/g;->O(I)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-eqz v0, :cond_a

    .line 225
    .line 226
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 227
    .line 228
    .line 229
    move-result-wide v0

    .line 230
    iget-wide v4, p0, Ls7/g;->r:J

    .line 231
    .line 232
    add-long/2addr v0, v4

    .line 233
    const-wide/16 v4, 0x8

    .line 234
    .line 235
    sub-long/2addr v0, v4

    .line 236
    iget-object p1, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 237
    .line 238
    new-instance v2, Ls7/a$a;

    .line 239
    .line 240
    iget v4, p0, Ls7/g;->q:I

    .line 241
    .line 242
    invoke-direct {v2, v4, v0, v1}, Ls7/a$a;-><init>(IJ)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    iget-wide v4, p0, Ls7/g;->r:J

    .line 249
    .line 250
    iget p1, p0, Ls7/g;->s:I

    .line 251
    .line 252
    int-to-long v6, p1

    .line 253
    cmp-long p1, v4, v6

    .line 254
    .line 255
    if-nez p1, :cond_9

    .line 256
    .line 257
    invoke-direct {p0, v0, v1}, Ls7/g;->J(J)V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_9
    invoke-direct {p0}, Ls7/g;->e()V

    .line 262
    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_a
    iget p1, p0, Ls7/g;->q:I

    .line 266
    .line 267
    invoke-static {p1}, Ls7/g;->P(I)Z

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    const-wide/32 v4, 0x7fffffff

    .line 272
    .line 273
    .line 274
    if-eqz p1, :cond_d

    .line 275
    .line 276
    iget p1, p0, Ls7/g;->s:I

    .line 277
    .line 278
    if-ne p1, v1, :cond_c

    .line 279
    .line 280
    iget-wide v6, p0, Ls7/g;->r:J

    .line 281
    .line 282
    cmp-long p1, v6, v4

    .line 283
    .line 284
    if-gtz p1, :cond_b

    .line 285
    .line 286
    new-instance p1, Lf9/y;

    .line 287
    .line 288
    long-to-int v0, v6

    .line 289
    invoke-direct {p1, v0}, Lf9/y;-><init>(I)V

    .line 290
    .line 291
    .line 292
    iget-object v0, p0, Ls7/g;->l:Lf9/y;

    .line 293
    .line 294
    invoke-virtual {v0}, Lf9/y;->d()[B

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {p1}, Lf9/y;->d()[B

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-static {v0, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 303
    .line 304
    .line 305
    iput-object p1, p0, Ls7/g;->t:Lf9/y;

    .line 306
    .line 307
    iput v3, p0, Ls7/g;->p:I

    .line 308
    .line 309
    goto :goto_2

    .line 310
    :cond_b
    new-instance p1, Ld7/o;

    .line 311
    .line 312
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    .line 313
    .line 314
    invoke-direct {p1, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    throw p1

    .line 318
    :cond_c
    new-instance p1, Ld7/o;

    .line 319
    .line 320
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    .line 321
    .line 322
    invoke-direct {p1, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p1

    .line 326
    :cond_d
    iget-wide v0, p0, Ls7/g;->r:J

    .line 327
    .line 328
    cmp-long p1, v0, v4

    .line 329
    .line 330
    if-gtz p1, :cond_e

    .line 331
    .line 332
    iput-object v7, p0, Ls7/g;->t:Lf9/y;

    .line 333
    .line 334
    iput v3, p0, Ls7/g;->p:I

    .line 335
    .line 336
    :goto_2
    return v3

    .line 337
    :cond_e
    new-instance p1, Ld7/o;

    .line 338
    .line 339
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    .line 340
    .line 341
    invoke-direct {p1, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw p1

    .line 345
    :cond_f
    new-instance p1, Ld7/o;

    .line 346
    .line 347
    const-string v0, "Atom size less than header length (unsupported)."

    .line 348
    .line 349
    invoke-direct {p1, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    throw p1
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

.method private L(Ll7/j;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Ls7/g;->r:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    iget v1, p0, Ls7/g;->s:I

    .line 5
    .line 6
    sub-int/2addr v0, v1

    .line 7
    iget-object v1, p0, Ls7/g;->t:Lf9/y;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lf9/y;->d()[B

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    invoke-interface {p1, v2, v3, v0}, Ll7/j;->readFully([BII)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Ls7/a$b;

    .line 21
    .line 22
    iget v2, p0, Ls7/g;->q:I

    .line 23
    .line 24
    invoke-direct {v0, v2, v1}, Ls7/a$b;-><init>(ILf9/y;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-direct {p0, v0, v1, v2}, Ls7/g;->q(Ls7/a$b;J)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {p1, v0}, Ll7/j;->k(I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-direct {p0, v0, v1}, Ls7/g;->J(J)V

    .line 43
    .line 44
    .line 45
    return-void
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

.method private M(Ll7/j;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-wide v2, 0x7fffffffffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    :goto_0
    if-ge v4, v0, :cond_1

    .line 15
    .line 16
    iget-object v5, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 17
    .line 18
    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ls7/g$b;

    .line 23
    .line 24
    iget-object v5, v5, Ls7/g$b;->b:Ls7/q;

    .line 25
    .line 26
    iget-boolean v6, v5, Ls7/q;->q:Z

    .line 27
    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    iget-wide v5, v5, Ls7/q;->d:J

    .line 31
    .line 32
    cmp-long v7, v5, v2

    .line 33
    .line 34
    if-gez v7, :cond_0

    .line 35
    .line 36
    iget-object v1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ls7/g$b;

    .line 43
    .line 44
    move-wide v2, v5

    .line 45
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    if-nez v1, :cond_2

    .line 49
    .line 50
    const/4 p1, 0x3

    .line 51
    iput p1, p0, Ls7/g;->p:I

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-interface {p1}, Ll7/j;->getPosition()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    sub-long/2addr v2, v4

    .line 59
    long-to-int v0, v2

    .line 60
    if-ltz v0, :cond_3

    .line 61
    .line 62
    invoke-interface {p1, v0}, Ll7/j;->k(I)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, Ls7/g$b;->b:Ls7/q;

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ls7/q;->b(Ll7/j;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    new-instance p1, Ld7/o;

    .line 72
    .line 73
    const-string v0, "Offset to encryption data was negative."

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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

.method private N(Ll7/j;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ls7/g;->z:Ls7/g$b;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_3

    .line 9
    .line 10
    iget-object v2, v0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-static {v2}, Ls7/g;->j(Landroid/util/SparseArray;)Ls7/g$b;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    iget-wide v4, v0, Ls7/g;->u:J

    .line 19
    .line 20
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    sub-long/2addr v4, v6

    .line 25
    long-to-int v2, v4

    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ll7/j;->k(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct/range {p0 .. p0}, Ls7/g;->e()V

    .line 32
    .line 33
    .line 34
    return v3

    .line 35
    :cond_0
    new-instance v1, Ld7/o;

    .line 36
    .line 37
    const-string v2, "Offset to end of mdat was negative."

    .line 38
    .line 39
    invoke-direct {v1, v2}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1

    .line 43
    :cond_1
    invoke-virtual {v2}, Ls7/g$b;->d()J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    invoke-interface/range {p1 .. p1}, Ll7/j;->getPosition()J

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    sub-long/2addr v4, v6

    .line 52
    long-to-int v4, v4

    .line 53
    if-gez v4, :cond_2

    .line 54
    .line 55
    const-string v4, "FragmentedMp4Extractor"

    .line 56
    .line 57
    const-string v5, "Ignoring negative offset to sample data."

    .line 58
    .line 59
    invoke-static {v4, v5}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move v4, v3

    .line 63
    :cond_2
    invoke-interface {v1, v4}, Ll7/j;->k(I)V

    .line 64
    .line 65
    .line 66
    iput-object v2, v0, Ls7/g;->z:Ls7/g$b;

    .line 67
    .line 68
    :cond_3
    iget v4, v0, Ls7/g;->p:I

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x3

    .line 72
    const/4 v7, 0x4

    .line 73
    const/4 v8, 0x1

    .line 74
    if-ne v4, v6, :cond_8

    .line 75
    .line 76
    invoke-virtual {v2}, Ls7/g$b;->f()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    iput v4, v0, Ls7/g;->A:I

    .line 81
    .line 82
    iget v9, v2, Ls7/g$b;->f:I

    .line 83
    .line 84
    iget v10, v2, Ls7/g$b;->i:I

    .line 85
    .line 86
    if-ge v9, v10, :cond_5

    .line 87
    .line 88
    invoke-interface {v1, v4}, Ll7/j;->k(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2}, Ls7/g$b;->m()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ls7/g$b;->h()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_4

    .line 99
    .line 100
    iput-object v5, v0, Ls7/g;->z:Ls7/g$b;

    .line 101
    .line 102
    :cond_4
    iput v6, v0, Ls7/g;->p:I

    .line 103
    .line 104
    return v8

    .line 105
    :cond_5
    iget-object v9, v2, Ls7/g$b;->d:Ls7/r;

    .line 106
    .line 107
    iget-object v9, v9, Ls7/r;->a:Ls7/o;

    .line 108
    .line 109
    iget v9, v9, Ls7/o;->g:I

    .line 110
    .line 111
    if-ne v9, v8, :cond_6

    .line 112
    .line 113
    const/16 v9, 0x8

    .line 114
    .line 115
    sub-int/2addr v4, v9

    .line 116
    iput v4, v0, Ls7/g;->A:I

    .line 117
    .line 118
    invoke-interface {v1, v9}, Ll7/j;->k(I)V

    .line 119
    .line 120
    .line 121
    :cond_6
    iget-object v4, v2, Ls7/g$b;->d:Ls7/r;

    .line 122
    .line 123
    iget-object v4, v4, Ls7/r;->a:Ls7/o;

    .line 124
    .line 125
    iget-object v4, v4, Ls7/o;->f:Ld7/k;

    .line 126
    .line 127
    iget-object v4, v4, Ld7/k;->v:Ljava/lang/String;

    .line 128
    .line 129
    const-string v9, "audio/ac4"

    .line 130
    .line 131
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-eqz v4, :cond_7

    .line 136
    .line 137
    iget v4, v0, Ls7/g;->A:I

    .line 138
    .line 139
    const/4 v9, 0x7

    .line 140
    invoke-virtual {v2, v4, v9}, Ls7/g$b;->i(II)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    iput v4, v0, Ls7/g;->B:I

    .line 145
    .line 146
    iget v4, v0, Ls7/g;->A:I

    .line 147
    .line 148
    iget-object v10, v0, Ls7/g;->i:Lf9/y;

    .line 149
    .line 150
    invoke-static {v4, v10}, Lf7/c;->a(ILf9/y;)V

    .line 151
    .line 152
    .line 153
    iget-object v4, v2, Ls7/g$b;->a:Ll7/b0;

    .line 154
    .line 155
    iget-object v10, v0, Ls7/g;->i:Lf9/y;

    .line 156
    .line 157
    invoke-interface {v4, v10, v9}, Ll7/b0;->e(Lf9/y;I)V

    .line 158
    .line 159
    .line 160
    iget v4, v0, Ls7/g;->B:I

    .line 161
    .line 162
    add-int/2addr v4, v9

    .line 163
    iput v4, v0, Ls7/g;->B:I

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_7
    iget v4, v0, Ls7/g;->A:I

    .line 167
    .line 168
    invoke-virtual {v2, v4, v3}, Ls7/g$b;->i(II)I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    iput v4, v0, Ls7/g;->B:I

    .line 173
    .line 174
    :goto_0
    iget v4, v0, Ls7/g;->A:I

    .line 175
    .line 176
    iget v9, v0, Ls7/g;->B:I

    .line 177
    .line 178
    add-int/2addr v4, v9

    .line 179
    iput v4, v0, Ls7/g;->A:I

    .line 180
    .line 181
    iput v7, v0, Ls7/g;->p:I

    .line 182
    .line 183
    iput v3, v0, Ls7/g;->C:I

    .line 184
    .line 185
    :cond_8
    iget-object v4, v2, Ls7/g$b;->d:Ls7/r;

    .line 186
    .line 187
    iget-object v4, v4, Ls7/r;->a:Ls7/o;

    .line 188
    .line 189
    iget-object v9, v2, Ls7/g$b;->a:Ll7/b0;

    .line 190
    .line 191
    invoke-virtual {v2}, Ls7/g$b;->e()J

    .line 192
    .line 193
    .line 194
    move-result-wide v10

    .line 195
    iget-object v12, v0, Ls7/g;->j:Lf9/l0;

    .line 196
    .line 197
    if-eqz v12, :cond_9

    .line 198
    .line 199
    invoke-virtual {v12, v10, v11}, Lf9/l0;->a(J)J

    .line 200
    .line 201
    .line 202
    move-result-wide v10

    .line 203
    :cond_9
    move-wide v14, v10

    .line 204
    iget v10, v4, Ls7/o;->j:I

    .line 205
    .line 206
    if-eqz v10, :cond_e

    .line 207
    .line 208
    iget-object v10, v0, Ls7/g;->f:Lf9/y;

    .line 209
    .line 210
    invoke-virtual {v10}, Lf9/y;->d()[B

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    aput-byte v3, v10, v3

    .line 215
    .line 216
    aput-byte v3, v10, v8

    .line 217
    .line 218
    const/4 v11, 0x2

    .line 219
    aput-byte v3, v10, v11

    .line 220
    .line 221
    iget v11, v4, Ls7/o;->j:I

    .line 222
    .line 223
    add-int/lit8 v12, v11, 0x1

    .line 224
    .line 225
    rsub-int/lit8 v11, v11, 0x4

    .line 226
    .line 227
    :goto_1
    iget v13, v0, Ls7/g;->B:I

    .line 228
    .line 229
    iget v6, v0, Ls7/g;->A:I

    .line 230
    .line 231
    if-ge v13, v6, :cond_f

    .line 232
    .line 233
    iget v6, v0, Ls7/g;->C:I

    .line 234
    .line 235
    if-nez v6, :cond_c

    .line 236
    .line 237
    invoke-interface {v1, v10, v11, v12}, Ll7/j;->readFully([BII)V

    .line 238
    .line 239
    .line 240
    iget-object v6, v0, Ls7/g;->f:Lf9/y;

    .line 241
    .line 242
    invoke-virtual {v6, v3}, Lf9/y;->P(I)V

    .line 243
    .line 244
    .line 245
    iget-object v6, v0, Ls7/g;->f:Lf9/y;

    .line 246
    .line 247
    invoke-virtual {v6}, Lf9/y;->n()I

    .line 248
    .line 249
    .line 250
    move-result v6

    .line 251
    if-lt v6, v8, :cond_b

    .line 252
    .line 253
    add-int/lit8 v6, v6, -0x1

    .line 254
    .line 255
    iput v6, v0, Ls7/g;->C:I

    .line 256
    .line 257
    iget-object v6, v0, Ls7/g;->e:Lf9/y;

    .line 258
    .line 259
    invoke-virtual {v6, v3}, Lf9/y;->P(I)V

    .line 260
    .line 261
    .line 262
    iget-object v6, v0, Ls7/g;->e:Lf9/y;

    .line 263
    .line 264
    invoke-interface {v9, v6, v7}, Ll7/b0;->e(Lf9/y;I)V

    .line 265
    .line 266
    .line 267
    iget-object v6, v0, Ls7/g;->f:Lf9/y;

    .line 268
    .line 269
    invoke-interface {v9, v6, v8}, Ll7/b0;->e(Lf9/y;I)V

    .line 270
    .line 271
    .line 272
    iget-object v6, v0, Ls7/g;->G:[Ll7/b0;

    .line 273
    .line 274
    array-length v6, v6

    .line 275
    if-lez v6, :cond_a

    .line 276
    .line 277
    iget-object v6, v4, Ls7/o;->f:Ld7/k;

    .line 278
    .line 279
    iget-object v6, v6, Ld7/k;->v:Ljava/lang/String;

    .line 280
    .line 281
    aget-byte v13, v10, v7

    .line 282
    .line 283
    invoke-static {v6, v13}, Lf9/w;->g(Ljava/lang/String;B)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_a

    .line 288
    .line 289
    move v6, v8

    .line 290
    goto :goto_2

    .line 291
    :cond_a
    move v6, v3

    .line 292
    :goto_2
    iput-boolean v6, v0, Ls7/g;->D:Z

    .line 293
    .line 294
    iget v6, v0, Ls7/g;->B:I

    .line 295
    .line 296
    add-int/lit8 v6, v6, 0x5

    .line 297
    .line 298
    iput v6, v0, Ls7/g;->B:I

    .line 299
    .line 300
    iget v6, v0, Ls7/g;->A:I

    .line 301
    .line 302
    add-int/2addr v6, v11

    .line 303
    iput v6, v0, Ls7/g;->A:I

    .line 304
    .line 305
    const/4 v6, 0x3

    .line 306
    goto :goto_1

    .line 307
    :cond_b
    new-instance v1, Ld7/o;

    .line 308
    .line 309
    const-string v2, "Invalid NAL length"

    .line 310
    .line 311
    invoke-direct {v1, v2}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    throw v1

    .line 315
    :cond_c
    iget-boolean v13, v0, Ls7/g;->D:Z

    .line 316
    .line 317
    if-eqz v13, :cond_d

    .line 318
    .line 319
    iget-object v13, v0, Ls7/g;->g:Lf9/y;

    .line 320
    .line 321
    invoke-virtual {v13, v6}, Lf9/y;->L(I)V

    .line 322
    .line 323
    .line 324
    iget-object v6, v0, Ls7/g;->g:Lf9/y;

    .line 325
    .line 326
    invoke-virtual {v6}, Lf9/y;->d()[B

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    iget v13, v0, Ls7/g;->C:I

    .line 331
    .line 332
    invoke-interface {v1, v6, v3, v13}, Ll7/j;->readFully([BII)V

    .line 333
    .line 334
    .line 335
    iget-object v6, v0, Ls7/g;->g:Lf9/y;

    .line 336
    .line 337
    iget v13, v0, Ls7/g;->C:I

    .line 338
    .line 339
    invoke-interface {v9, v6, v13}, Ll7/b0;->e(Lf9/y;I)V

    .line 340
    .line 341
    .line 342
    iget v6, v0, Ls7/g;->C:I

    .line 343
    .line 344
    iget-object v13, v0, Ls7/g;->g:Lf9/y;

    .line 345
    .line 346
    invoke-virtual {v13}, Lf9/y;->d()[B

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    iget-object v7, v0, Ls7/g;->g:Lf9/y;

    .line 351
    .line 352
    invoke-virtual {v7}, Lf9/y;->f()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    invoke-static {v13, v7}, Lf9/w;->k([BI)I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    iget-object v13, v0, Ls7/g;->g:Lf9/y;

    .line 361
    .line 362
    iget-object v8, v4, Ls7/o;->f:Ld7/k;

    .line 363
    .line 364
    iget-object v8, v8, Ld7/k;->v:Ljava/lang/String;

    .line 365
    .line 366
    const-string v5, "video/hevc"

    .line 367
    .line 368
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v5

    .line 372
    invoke-virtual {v13, v5}, Lf9/y;->P(I)V

    .line 373
    .line 374
    .line 375
    iget-object v5, v0, Ls7/g;->g:Lf9/y;

    .line 376
    .line 377
    invoke-virtual {v5, v7}, Lf9/y;->O(I)V

    .line 378
    .line 379
    .line 380
    iget-object v5, v0, Ls7/g;->g:Lf9/y;

    .line 381
    .line 382
    iget-object v7, v0, Ls7/g;->G:[Ll7/b0;

    .line 383
    .line 384
    invoke-static {v14, v15, v5, v7}, Ll7/c;->a(JLf9/y;[Ll7/b0;)V

    .line 385
    .line 386
    .line 387
    goto :goto_3

    .line 388
    :cond_d
    invoke-interface {v9, v1, v6, v3}, Ll7/b0;->c(Ld9/h;IZ)I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    :goto_3
    iget v5, v0, Ls7/g;->B:I

    .line 393
    .line 394
    add-int/2addr v5, v6

    .line 395
    iput v5, v0, Ls7/g;->B:I

    .line 396
    .line 397
    iget v5, v0, Ls7/g;->C:I

    .line 398
    .line 399
    sub-int/2addr v5, v6

    .line 400
    iput v5, v0, Ls7/g;->C:I

    .line 401
    .line 402
    const/4 v5, 0x0

    .line 403
    const/4 v6, 0x3

    .line 404
    const/4 v7, 0x4

    .line 405
    const/4 v8, 0x1

    .line 406
    goto/16 :goto_1

    .line 407
    .line 408
    :cond_e
    :goto_4
    iget v4, v0, Ls7/g;->B:I

    .line 409
    .line 410
    iget v5, v0, Ls7/g;->A:I

    .line 411
    .line 412
    if-ge v4, v5, :cond_f

    .line 413
    .line 414
    sub-int/2addr v5, v4

    .line 415
    invoke-interface {v9, v1, v5, v3}, Ll7/b0;->c(Ld9/h;IZ)I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    iget v5, v0, Ls7/g;->B:I

    .line 420
    .line 421
    add-int/2addr v5, v4

    .line 422
    iput v5, v0, Ls7/g;->B:I

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_f
    invoke-virtual {v2}, Ls7/g$b;->c()I

    .line 426
    .line 427
    .line 428
    move-result v12

    .line 429
    invoke-virtual {v2}, Ls7/g$b;->g()Ls7/p;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    if-eqz v1, :cond_10

    .line 434
    .line 435
    iget-object v1, v1, Ls7/p;->c:Ll7/b0$a;

    .line 436
    .line 437
    goto :goto_5

    .line 438
    :cond_10
    const/4 v1, 0x0

    .line 439
    :goto_5
    iget v13, v0, Ls7/g;->A:I

    .line 440
    .line 441
    const/4 v3, 0x0

    .line 442
    move-wide v10, v14

    .line 443
    move-wide v4, v14

    .line 444
    move v14, v3

    .line 445
    move-object v15, v1

    .line 446
    invoke-interface/range {v9 .. v15}, Ll7/b0;->d(JIIILl7/b0$a;)V

    .line 447
    .line 448
    .line 449
    invoke-direct {v0, v4, v5}, Ls7/g;->t(J)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2}, Ls7/g$b;->h()Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    if-nez v1, :cond_11

    .line 457
    .line 458
    const/4 v1, 0x0

    .line 459
    iput-object v1, v0, Ls7/g;->z:Ls7/g$b;

    .line 460
    .line 461
    :cond_11
    const/4 v1, 0x3

    .line 462
    iput v1, v0, Ls7/g;->p:I

    .line 463
    .line 464
    const/4 v1, 0x1

    .line 465
    return v1
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

.method private static O(I)Z
    .locals 1

    const v0, 0x6d6f6f76

    if-eq p0, v0, :cond_1

    const v0, 0x7472616b

    if-eq p0, v0, :cond_1

    const v0, 0x6d646961

    if-eq p0, v0, :cond_1

    const v0, 0x6d696e66

    if-eq p0, v0, :cond_1

    const v0, 0x7374626c

    if-eq p0, v0, :cond_1

    const v0, 0x6d6f6f66

    if-eq p0, v0, :cond_1

    const v0, 0x74726166

    if-eq p0, v0, :cond_1

    const v0, 0x6d766578

    if-eq p0, v0, :cond_1

    const v0, 0x65647473

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static P(I)Z
    .locals 1

    const v0, 0x68646c72    # 4.3148E24f

    if-eq p0, v0, :cond_1

    const v0, 0x6d646864

    if-eq p0, v0, :cond_1

    const v0, 0x6d766864

    if-eq p0, v0, :cond_1

    const v0, 0x73696478

    if-eq p0, v0, :cond_1

    const v0, 0x73747364

    if-eq p0, v0, :cond_1

    const v0, 0x73747473

    if-eq p0, v0, :cond_1

    const v0, 0x63747473

    if-eq p0, v0, :cond_1

    const v0, 0x73747363

    if-eq p0, v0, :cond_1

    const v0, 0x7374737a

    if-eq p0, v0, :cond_1

    const v0, 0x73747a32

    if-eq p0, v0, :cond_1

    const v0, 0x7374636f

    if-eq p0, v0, :cond_1

    const v0, 0x636f3634

    if-eq p0, v0, :cond_1

    const v0, 0x73747373

    if-eq p0, v0, :cond_1

    const v0, 0x74666474

    if-eq p0, v0, :cond_1

    const v0, 0x74666864

    if-eq p0, v0, :cond_1

    const v0, 0x746b6864

    if-eq p0, v0, :cond_1

    const v0, 0x74726578

    if-eq p0, v0, :cond_1

    const v0, 0x7472756e

    if-eq p0, v0, :cond_1

    const v0, 0x70737368    # 3.013775E29f

    if-eq p0, v0, :cond_1

    const v0, 0x7361697a

    if-eq p0, v0, :cond_1

    const v0, 0x7361696f

    if-eq p0, v0, :cond_1

    const v0, 0x73656e63

    if-eq p0, v0, :cond_1

    const v0, 0x75756964

    if-eq p0, v0, :cond_1

    const v0, 0x73626770

    if-eq p0, v0, :cond_1

    const v0, 0x73677064

    if-eq p0, v0, :cond_1

    const v0, 0x656c7374

    if-eq p0, v0, :cond_1

    const v0, 0x6d656864

    if-eq p0, v0, :cond_1

    const v0, 0x656d7367

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static synthetic a()[Ll7/i;
    .locals 1

    invoke-static {}, Ls7/g;->m()[Ll7/i;

    move-result-object v0

    return-object v0
.end method

.method private static d(I)I
    .locals 3

    if-ltz p0, :cond_0

    return p0

    :cond_0
    new-instance v0, Ld7/o;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected negative value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ld7/o;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ls7/g;->p:I

    .line 3
    .line 4
    iput v0, p0, Ls7/g;->s:I

    .line 5
    .line 6
    return-void
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
.end method

.method private g(Landroid/util/SparseArray;I)Ls7/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ls7/c;",
            ">;I)",
            "Ls7/c;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ls7/c;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Ls7/c;

    .line 21
    .line 22
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ls7/c;

    .line 27
    .line 28
    return-object p1
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

.method private static h(Ljava/util/List;)Lj7/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls7/a$b;",
            ">;)",
            "Lj7/l;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_3

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, Ls7/a$b;

    .line 15
    .line 16
    iget v5, v4, Ls7/a;->a:I

    .line 17
    .line 18
    const v6, 0x70737368    # 3.013775E29f

    .line 19
    .line 20
    .line 21
    if-ne v5, v6, :cond_2

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v4, v4, Ls7/a$b;->b:Lf9/y;

    .line 31
    .line 32
    invoke-virtual {v4}, Lf9/y;->d()[B

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Ls7/l;->f([B)Ljava/util/UUID;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    const-string v4, "FragmentedMp4Extractor"

    .line 43
    .line 44
    const-string v5, "Skipped pssh atom (failed to extract uuid)"

    .line 45
    .line 46
    invoke-static {v4, v5}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance v6, Lj7/l$b;

    .line 51
    .line 52
    const-string v7, "video/mp4"

    .line 53
    .line 54
    invoke-direct {v6, v5, v7, v4}, Lj7/l$b;-><init>(Ljava/util/UUID;Ljava/lang/String;[B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-nez v3, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    new-instance v1, Lj7/l;

    .line 67
    .line 68
    invoke-direct {v1, v3}, Lj7/l;-><init>(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    return-object v1
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

.method private static j(Landroid/util/SparseArray;)Ls7/g$b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;)",
            "Ls7/g$b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const-wide v2, 0x7fffffffffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Ls7/g$b;

    .line 19
    .line 20
    invoke-static {v5}, Ls7/g$b;->a(Ls7/g$b;)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    iget v6, v5, Ls7/g$b;->f:I

    .line 27
    .line 28
    iget-object v7, v5, Ls7/g$b;->d:Ls7/r;

    .line 29
    .line 30
    iget v7, v7, Ls7/r;->b:I

    .line 31
    .line 32
    if-eq v6, v7, :cond_2

    .line 33
    .line 34
    :cond_0
    invoke-static {v5}, Ls7/g$b;->a(Ls7/g$b;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget v6, v5, Ls7/g$b;->h:I

    .line 41
    .line 42
    iget-object v7, v5, Ls7/g$b;->b:Ls7/q;

    .line 43
    .line 44
    iget v7, v7, Ls7/q;->e:I

    .line 45
    .line 46
    if-ne v6, v7, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v5}, Ls7/g$b;->d()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    cmp-long v8, v6, v2

    .line 54
    .line 55
    if-gez v8, :cond_2

    .line 56
    .line 57
    move-object v1, v5

    .line 58
    move-wide v2, v6

    .line 59
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-object v1
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

.method private static k(Landroid/util/SparseArray;I)Ls7/g$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;I)",
            "Ls7/g$b;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ls7/g$b;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ls7/g$b;

    .line 21
    .line 22
    return-object p0
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

.method private l()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [Ll7/b0;

    .line 3
    .line 4
    iput-object v0, p0, Ls7/g;->F:[Ll7/b0;

    .line 5
    .line 6
    iget-object v1, p0, Ls7/g;->o:Ll7/b0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v1, v2

    .line 16
    :goto_0
    iget v3, p0, Ls7/g;->a:I

    .line 17
    .line 18
    and-int/lit8 v3, v3, 0x4

    .line 19
    .line 20
    const/16 v4, 0x64

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    add-int/lit8 v3, v1, 0x1

    .line 25
    .line 26
    iget-object v5, p0, Ls7/g;->E:Ll7/k;

    .line 27
    .line 28
    const/4 v6, 0x5

    .line 29
    invoke-interface {v5, v4, v6}, Ll7/k;->d(II)Ll7/b0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v1

    .line 34
    .line 35
    const/16 v4, 0x65

    .line 36
    .line 37
    move v1, v3

    .line 38
    :cond_1
    iget-object v0, p0, Ls7/g;->F:[Ll7/b0;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lf9/q0;->B0([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, [Ll7/b0;

    .line 45
    .line 46
    iput-object v0, p0, Ls7/g;->F:[Ll7/b0;

    .line 47
    .line 48
    array-length v1, v0

    .line 49
    move v3, v2

    .line 50
    :goto_1
    if-ge v3, v1, :cond_2

    .line 51
    .line 52
    aget-object v5, v0, v3

    .line 53
    .line 54
    sget-object v6, Ls7/g;->K:Ld7/k;

    .line 55
    .line 56
    invoke-interface {v5, v6}, Ll7/b0;->a(Ld7/k;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-object v0, p0, Ls7/g;->c:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-array v0, v0, [Ll7/b0;

    .line 69
    .line 70
    iput-object v0, p0, Ls7/g;->G:[Ll7/b0;

    .line 71
    .line 72
    :goto_2
    iget-object v0, p0, Ls7/g;->G:[Ll7/b0;

    .line 73
    .line 74
    array-length v0, v0

    .line 75
    if-ge v2, v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Ls7/g;->E:Ll7/k;

    .line 78
    .line 79
    add-int/lit8 v1, v4, 0x1

    .line 80
    .line 81
    const/4 v3, 0x3

    .line 82
    invoke-interface {v0, v4, v3}, Ll7/k;->d(II)Ll7/b0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v3, p0, Ls7/g;->c:Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ld7/k;

    .line 93
    .line 94
    invoke-interface {v0, v3}, Ll7/b0;->a(Ld7/k;)V

    .line 95
    .line 96
    .line 97
    iget-object v3, p0, Ls7/g;->G:[Ll7/b0;

    .line 98
    .line 99
    aput-object v0, v3, v2

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x1

    .line 102
    .line 103
    move v4, v1

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    return-void
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

.method private static synthetic m()[Ll7/i;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [Ll7/i;

    .line 3
    .line 4
    new-instance v1, Ls7/g;

    .line 5
    .line 6
    invoke-direct {v1}, Ls7/g;-><init>()V

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

.method private o(Ls7/a$a;)V
    .locals 2

    .line 1
    iget v0, p1, Ls7/a;->a:I

    .line 2
    .line 3
    const v1, 0x6d6f6f76

    .line 4
    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-direct {p0, p1}, Ls7/g;->s(Ls7/a$a;)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const v1, 0x6d6f6f66

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ls7/g;->r(Ls7/a$a;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ls7/a$a;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ls7/a$a;->d(Ls7/a$a;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
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

.method private p(Lf9/y;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ls7/g;->F:[Ll7/b0;

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const/16 v2, 0x8

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lf9/y;->P(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p1 .. p1}, Lf9/y;->n()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Ls7/a;->c(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    const/4 v5, 0x1

    .line 32
    if-eq v2, v5, :cond_1

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v3, "Skipping unsupported emsg version: "

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "FragmentedMp4Extractor"

    .line 52
    .line 53
    invoke-static {v2, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 58
    .line 59
    .line 60
    move-result-wide v11

    .line 61
    invoke-virtual/range {p1 .. p1}, Lf9/y;->I()J

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    const-wide/32 v7, 0xf4240

    .line 66
    .line 67
    .line 68
    move-wide v9, v11

    .line 69
    invoke-static/range {v5 .. v10}, Lf9/q0;->I0(JJJ)J

    .line 70
    .line 71
    .line 72
    move-result-wide v13

    .line 73
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 74
    .line 75
    .line 76
    move-result-wide v5

    .line 77
    const-wide/16 v7, 0x3e8

    .line 78
    .line 79
    invoke-static/range {v5 .. v10}, Lf9/q0;->I0(JJJ)J

    .line 80
    .line 81
    .line 82
    move-result-wide v5

    .line 83
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    invoke-virtual/range {p1 .. p1}, Lf9/y;->x()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual/range {p1 .. p1}, Lf9/y;->x()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-static {v9}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    check-cast v9, Ljava/lang/String;

    .line 106
    .line 107
    move-object/from16 v19, v2

    .line 108
    .line 109
    move-wide/from16 v21, v5

    .line 110
    .line 111
    move-wide/from16 v23, v7

    .line 112
    .line 113
    move-object/from16 v20, v9

    .line 114
    .line 115
    move-wide v7, v3

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lf9/y;->x()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v2}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual/range {p1 .. p1}, Lf9/y;->x()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    move-object v9, v5

    .line 136
    check-cast v9, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    const-wide/32 v12, 0xf4240

    .line 147
    .line 148
    .line 149
    move-wide v14, v5

    .line 150
    invoke-static/range {v10 .. v15}, Lf9/q0;->I0(JJJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    iget-wide v10, v0, Ls7/g;->y:J

    .line 155
    .line 156
    cmp-long v12, v10, v3

    .line 157
    .line 158
    if-eqz v12, :cond_3

    .line 159
    .line 160
    add-long/2addr v10, v7

    .line 161
    move-wide/from16 v16, v10

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_3
    move-wide/from16 v16, v3

    .line 165
    .line 166
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 167
    .line 168
    .line 169
    move-result-wide v10

    .line 170
    const-wide/16 v12, 0x3e8

    .line 171
    .line 172
    move-wide v14, v5

    .line 173
    invoke-static/range {v10 .. v15}, Lf9/q0;->I0(JJJ)J

    .line 174
    .line 175
    .line 176
    move-result-wide v5

    .line 177
    invoke-virtual/range {p1 .. p1}, Lf9/y;->F()J

    .line 178
    .line 179
    .line 180
    move-result-wide v10

    .line 181
    move-object/from16 v19, v2

    .line 182
    .line 183
    move-wide/from16 v21, v5

    .line 184
    .line 185
    move-object/from16 v20, v9

    .line 186
    .line 187
    move-wide/from16 v23, v10

    .line 188
    .line 189
    move-wide/from16 v13, v16

    .line 190
    .line 191
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lf9/y;->a()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    new-array v2, v2, [B

    .line 196
    .line 197
    invoke-virtual/range {p1 .. p1}, Lf9/y;->a()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    const/4 v6, 0x0

    .line 202
    invoke-virtual {v1, v2, v6, v5}, Lf9/y;->j([BII)V

    .line 203
    .line 204
    .line 205
    new-instance v1, La8/a;

    .line 206
    .line 207
    move-object/from16 v18, v1

    .line 208
    .line 209
    move-object/from16 v25, v2

    .line 210
    .line 211
    invoke-direct/range {v18 .. v25}, La8/a;-><init>(Ljava/lang/String;Ljava/lang/String;JJ[B)V

    .line 212
    .line 213
    .line 214
    new-instance v2, Lf9/y;

    .line 215
    .line 216
    iget-object v5, v0, Ls7/g;->k:La8/c;

    .line 217
    .line 218
    invoke-virtual {v5, v1}, La8/c;->a(La8/a;)[B

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-direct {v2, v1}, Lf9/y;-><init>([B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Lf9/y;->a()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    iget-object v5, v0, Ls7/g;->F:[Ll7/b0;

    .line 230
    .line 231
    array-length v9, v5

    .line 232
    move v10, v6

    .line 233
    :goto_2
    if-ge v10, v9, :cond_4

    .line 234
    .line 235
    aget-object v11, v5, v10

    .line 236
    .line 237
    invoke-virtual {v2, v6}, Lf9/y;->P(I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v11, v2, v1}, Ll7/b0;->e(Lf9/y;I)V

    .line 241
    .line 242
    .line 243
    add-int/lit8 v10, v10, 0x1

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_4
    cmp-long v2, v13, v3

    .line 247
    .line 248
    if-nez v2, :cond_5

    .line 249
    .line 250
    iget-object v2, v0, Ls7/g;->n:Ljava/util/ArrayDeque;

    .line 251
    .line 252
    new-instance v3, Ls7/g$a;

    .line 253
    .line 254
    invoke-direct {v3, v7, v8, v1}, Ls7/g$a;-><init>(JI)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    iget v2, v0, Ls7/g;->v:I

    .line 261
    .line 262
    add-int/2addr v2, v1

    .line 263
    iput v2, v0, Ls7/g;->v:I

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_5
    iget-object v2, v0, Ls7/g;->j:Lf9/l0;

    .line 267
    .line 268
    if-eqz v2, :cond_6

    .line 269
    .line 270
    invoke-virtual {v2, v13, v14}, Lf9/l0;->a(J)J

    .line 271
    .line 272
    .line 273
    move-result-wide v13

    .line 274
    :cond_6
    iget-object v2, v0, Ls7/g;->F:[Ll7/b0;

    .line 275
    .line 276
    array-length v3, v2

    .line 277
    :goto_3
    if-ge v6, v3, :cond_7

    .line 278
    .line 279
    aget-object v15, v2, v6

    .line 280
    .line 281
    const/16 v18, 0x1

    .line 282
    .line 283
    const/16 v20, 0x0

    .line 284
    .line 285
    const/16 v21, 0x0

    .line 286
    .line 287
    move-wide/from16 v16, v13

    .line 288
    .line 289
    move/from16 v19, v1

    .line 290
    .line 291
    invoke-interface/range {v15 .. v21}, Ll7/b0;->d(JIIILl7/b0$a;)V

    .line 292
    .line 293
    .line 294
    add-int/lit8 v6, v6, 0x1

    .line 295
    .line 296
    goto :goto_3

    .line 297
    :cond_7
    :goto_4
    return-void
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

.method private q(Ls7/a$b;J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p2, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ls7/a$a;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Ls7/a$a;->e(Ls7/a$b;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, p1, Ls7/a;->a:I

    .line 22
    .line 23
    const v1, 0x73696478

    .line 24
    .line 25
    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, Ls7/a$b;->b:Lf9/y;

    .line 29
    .line 30
    invoke-static {p1, p2, p3}, Ls7/g;->B(Lf9/y;J)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Long;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide p2

    .line 42
    iput-wide p2, p0, Ls7/g;->y:J

    .line 43
    .line 44
    iget-object p2, p0, Ls7/g;->E:Ll7/k;

    .line 45
    .line 46
    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ll7/y;

    .line 49
    .line 50
    invoke-interface {p2, p1}, Ll7/k;->i(Ll7/y;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, Ls7/g;->H:Z

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const p2, 0x656d7367

    .line 58
    .line 59
    .line 60
    if-ne v0, p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p1, Ls7/a$b;->b:Lf9/y;

    .line 63
    .line 64
    invoke-direct {p0, p1}, Ls7/g;->p(Lf9/y;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return-void
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

.method private r(Ls7/a$a;)V
    .locals 7

    .line 1
    iget-object v0, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    iget v1, p0, Ls7/g;->a:I

    .line 4
    .line 5
    iget-object v2, p0, Ls7/g;->h:[B

    .line 6
    .line 7
    invoke-static {p1, v0, v1, v2}, Ls7/g;->v(Ls7/a$a;Landroid/util/SparseArray;I[B)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Ls7/a$a;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p1}, Ls7/g;->h(Ljava/util/List;)Lj7/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    move v2, v0

    .line 26
    :goto_0
    if-ge v2, v1, :cond_0

    .line 27
    .line 28
    iget-object v3, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Ls7/g$b;

    .line 35
    .line 36
    invoke-virtual {v3, p1}, Ls7/g$b;->n(Lj7/l;)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-wide v1, p0, Ls7/g;->w:J

    .line 43
    .line 44
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long p1, v1, v3

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    :goto_1
    if-ge v0, p1, :cond_1

    .line 60
    .line 61
    iget-object v1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ls7/g$b;

    .line 68
    .line 69
    iget-wide v5, p0, Ls7/g;->w:J

    .line 70
    .line 71
    invoke-virtual {v1, v5, v6}, Ls7/g$b;->l(J)V

    .line 72
    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    iput-wide v3, p0, Ls7/g;->w:J

    .line 78
    .line 79
    :cond_2
    return-void
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

.method private s(Ls7/a$a;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ls7/g;->b:Ls7/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    const-string v3, "Unexpected moov box."

    .line 11
    .line 12
    invoke-static {v0, v3}, Lf9/a;->g(ZLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Ls7/a$a;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0}, Ls7/g;->h(Ljava/util/List;)Lj7/l;

    .line 18
    .line 19
    .line 20
    move-result-object v7

    .line 21
    const v0, 0x6d766578

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ls7/a$a;->f(I)Ls7/a$a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ls7/a$a;

    .line 33
    .line 34
    new-instance v11, Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-direct {v11}, Landroid/util/SparseArray;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v3, v0, Ls7/a$a;->c:Ljava/util/List;

    .line 40
    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    move-wide v5, v4

    .line 51
    move v4, v2

    .line 52
    :goto_1
    if-ge v4, v3, :cond_3

    .line 53
    .line 54
    iget-object v8, v0, Ls7/a$a;->c:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    check-cast v8, Ls7/a$b;

    .line 61
    .line 62
    iget v9, v8, Ls7/a;->a:I

    .line 63
    .line 64
    const v10, 0x74726578

    .line 65
    .line 66
    .line 67
    if-ne v9, v10, :cond_1

    .line 68
    .line 69
    iget-object v8, v8, Ls7/a$b;->b:Lf9/y;

    .line 70
    .line 71
    invoke-static {v8}, Ls7/g;->F(Lf9/y;)Landroid/util/Pair;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    iget-object v9, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v9, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    iget-object v8, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v8, Ls7/c;

    .line 86
    .line 87
    invoke-virtual {v11, v9, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_1
    const v10, 0x6d656864

    .line 92
    .line 93
    .line 94
    if-ne v9, v10, :cond_2

    .line 95
    .line 96
    iget-object v5, v8, Ls7/a$b;->b:Lf9/y;

    .line 97
    .line 98
    invoke-static {v5}, Ls7/g;->u(Lf9/y;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_3
    new-instance v4, Ll7/u;

    .line 106
    .line 107
    invoke-direct {v4}, Ll7/u;-><init>()V

    .line 108
    .line 109
    .line 110
    iget v0, p0, Ls7/g;->a:I

    .line 111
    .line 112
    and-int/lit8 v0, v0, 0x10

    .line 113
    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    move v8, v1

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move v8, v2

    .line 119
    :goto_3
    const/4 v9, 0x0

    .line 120
    new-instance v10, Ls7/e;

    .line 121
    .line 122
    invoke-direct {v10, p0}, Ls7/e;-><init>(Ls7/g;)V

    .line 123
    .line 124
    .line 125
    move-object v3, p1

    .line 126
    invoke-static/range {v3 .. v10}, Ls7/b;->z(Ls7/a$a;Ll7/u;JLj7/l;ZZLac/f;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iget-object v3, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 135
    .line 136
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-nez v3, :cond_6

    .line 141
    .line 142
    :goto_4
    if-ge v2, v0, :cond_5

    .line 143
    .line 144
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Ls7/r;

    .line 149
    .line 150
    iget-object v3, v1, Ls7/r;->a:Ls7/o;

    .line 151
    .line 152
    new-instance v4, Ls7/g$b;

    .line 153
    .line 154
    iget-object v5, p0, Ls7/g;->E:Ll7/k;

    .line 155
    .line 156
    iget v6, v3, Ls7/o;->b:I

    .line 157
    .line 158
    invoke-interface {v5, v2, v6}, Ll7/k;->d(II)Ll7/b0;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget v6, v3, Ls7/o;->a:I

    .line 163
    .line 164
    invoke-direct {p0, v11, v6}, Ls7/g;->g(Landroid/util/SparseArray;I)Ls7/c;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-direct {v4, v5, v1, v6}, Ls7/g$b;-><init>(Ll7/b0;Ls7/r;Ls7/c;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 172
    .line 173
    iget v5, v3, Ls7/o;->a:I

    .line 174
    .line 175
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-wide v4, p0, Ls7/g;->x:J

    .line 179
    .line 180
    iget-wide v6, v3, Ls7/o;->e:J

    .line 181
    .line 182
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v3

    .line 186
    iput-wide v3, p0, Ls7/g;->x:J

    .line 187
    .line 188
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_5
    iget-object p1, p0, Ls7/g;->E:Ll7/k;

    .line 192
    .line 193
    invoke-interface {p1}, Ll7/k;->q()V

    .line 194
    .line 195
    .line 196
    goto :goto_7

    .line 197
    :cond_6
    iget-object v3, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 198
    .line 199
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-ne v3, v0, :cond_7

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    move v1, v2

    .line 207
    :goto_5
    invoke-static {v1}, Lf9/a;->f(Z)V

    .line 208
    .line 209
    .line 210
    :goto_6
    if-ge v2, v0, :cond_8

    .line 211
    .line 212
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    check-cast v1, Ls7/r;

    .line 217
    .line 218
    iget-object v3, v1, Ls7/r;->a:Ls7/o;

    .line 219
    .line 220
    iget-object v4, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 221
    .line 222
    iget v5, v3, Ls7/o;->a:I

    .line 223
    .line 224
    invoke-virtual {v4, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    check-cast v4, Ls7/g$b;

    .line 229
    .line 230
    iget v3, v3, Ls7/o;->a:I

    .line 231
    .line 232
    invoke-direct {p0, v11, v3}, Ls7/g;->g(Landroid/util/SparseArray;I)Ls7/c;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    invoke-virtual {v4, v1, v3}, Ls7/g$b;->j(Ls7/r;Ls7/c;)V

    .line 237
    .line 238
    .line 239
    add-int/lit8 v2, v2, 0x1

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_8
    :goto_7
    return-void
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

.method private t(J)V
    .locals 13

    .line 1
    :cond_0
    iget-object v0, p0, Ls7/g;->n:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ls7/g;->n:Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ls7/g$a;

    .line 16
    .line 17
    iget v1, p0, Ls7/g;->v:I

    .line 18
    .line 19
    iget v2, v0, Ls7/g$a;->b:I

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, p0, Ls7/g;->v:I

    .line 23
    .line 24
    iget-wide v1, v0, Ls7/g$a;->a:J

    .line 25
    .line 26
    add-long/2addr v1, p1

    .line 27
    iget-object v3, p0, Ls7/g;->j:Lf9/l0;

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {v3, v1, v2}, Lf9/l0;->a(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    :cond_1
    iget-object v10, p0, Ls7/g;->F:[Ll7/b0;

    .line 36
    .line 37
    array-length v11, v10

    .line 38
    const/4 v3, 0x0

    .line 39
    move v12, v3

    .line 40
    :goto_0
    if-ge v12, v11, :cond_0

    .line 41
    .line 42
    aget-object v3, v10, v12

    .line 43
    .line 44
    const/4 v6, 0x1

    .line 45
    iget v7, v0, Ls7/g$a;->b:I

    .line 46
    .line 47
    iget v8, p0, Ls7/g;->v:I

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    move-wide v4, v1

    .line 51
    invoke-interface/range {v3 .. v9}, Ll7/b0;->d(JIIILl7/b0$a;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v12, v12, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    return-void
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

.method private static u(Lf9/y;)J
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ls7/a;->c(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    :goto_0
    return-wide v0
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
.end method

.method private static v(Ls7/a$a;Landroid/util/SparseArray;I[B)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls7/a$a;",
            "Landroid/util/SparseArray<",
            "Ls7/g$b;",
            ">;I[B)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Ls7/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Ls7/a$a;->d:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Ls7/a$a;

    .line 17
    .line 18
    iget v3, v2, Ls7/a;->a:I

    .line 19
    .line 20
    const v4, 0x74726166

    .line 21
    .line 22
    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    invoke-static {v2, p1, p2, p3}, Ls7/g;->E(Ls7/a$a;Landroid/util/SparseArray;I[B)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
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
.end method

.method private static w(Lf9/y;Ls7/q;)V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ls7/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x1

    .line 15
    and-int/2addr v2, v3

    .line 16
    if-ne v2, v3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lf9/y;->Q(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lf9/y;->H()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v3, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Ls7/a;->c(I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-wide v1, p1, Ls7/q;->d:J

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Lf9/y;->F()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p0}, Lf9/y;->I()J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    :goto_0
    add-long/2addr v1, v3

    .line 45
    iput-wide v1, p1, Ls7/q;->d:J

    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    new-instance p0, Ld7/o;

    .line 49
    .line 50
    new-instance p1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v1, "Unexpected saio entry count: "

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p0, p1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p0
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

.method private static x(Ls7/p;Lf9/y;Ls7/q;)V
    .locals 7

    .line 1
    iget p0, p0, Ls7/p;->d:I

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lf9/y;->P(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lf9/y;->n()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ls7/a;->b(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x1

    .line 17
    and-int/2addr v1, v2

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lf9/y;->Q(I)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lf9/y;->D()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-virtual {p1}, Lf9/y;->H()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget v3, p2, Ls7/q;->f:I

    .line 32
    .line 33
    if-gt v1, v3, :cond_6

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    iget-object v0, p2, Ls7/q;->n:[Z

    .line 39
    .line 40
    move v4, v3

    .line 41
    move v5, v4

    .line 42
    :goto_0
    if-ge v4, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Lf9/y;->D()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    add-int/2addr v5, v6

    .line 49
    if-le v6, p0, :cond_1

    .line 50
    .line 51
    move v6, v2

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v6, v3

    .line 54
    :goto_1
    aput-boolean v6, v0, v4

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    if-le v0, p0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move v2, v3

    .line 63
    :goto_2
    mul-int/2addr v0, v1

    .line 64
    add-int/lit8 v5, v0, 0x0

    .line 65
    .line 66
    iget-object p0, p2, Ls7/q;->n:[Z

    .line 67
    .line 68
    invoke-static {p0, v3, v1, v2}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 69
    .line 70
    .line 71
    :cond_4
    iget-object p0, p2, Ls7/q;->n:[Z

    .line 72
    .line 73
    iget p1, p2, Ls7/q;->f:I

    .line 74
    .line 75
    invoke-static {p0, v1, p1, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 76
    .line 77
    .line 78
    if-lez v5, :cond_5

    .line 79
    .line 80
    invoke-virtual {p2, v5}, Ls7/q;->d(I)V

    .line 81
    .line 82
    .line 83
    :cond_5
    return-void

    .line 84
    :cond_6
    new-instance p0, Ld7/o;

    .line 85
    .line 86
    new-instance p1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v0, "Saiz sample count "

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " is greater than fragment sample count"

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget p2, p2, Ls7/q;->f:I

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-direct {p0, p1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw p0
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
.end method

.method private static y(Ls7/a$a;Ljava/lang/String;Ls7/q;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    move-object v5, v2

    .line 8
    move-object v6, v5

    .line 9
    move v4, v3

    .line 10
    :goto_0
    iget-object v7, v0, Ls7/a$a;->c:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    if-ge v4, v7, :cond_2

    .line 17
    .line 18
    iget-object v7, v0, Ls7/a$a;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, Ls7/a$b;

    .line 25
    .line 26
    iget-object v8, v7, Ls7/a$b;->b:Lf9/y;

    .line 27
    .line 28
    iget v7, v7, Ls7/a;->a:I

    .line 29
    .line 30
    const v9, 0x73626770

    .line 31
    .line 32
    .line 33
    const v10, 0x73656967

    .line 34
    .line 35
    .line 36
    const/16 v11, 0xc

    .line 37
    .line 38
    if-ne v7, v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v8, v11}, Lf9/y;->P(I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8}, Lf9/y;->n()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-ne v7, v10, :cond_1

    .line 48
    .line 49
    move-object v5, v8

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    const v9, 0x73677064

    .line 52
    .line 53
    .line 54
    if-ne v7, v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Lf9/y;->P(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Lf9/y;->n()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-ne v7, v10, :cond_1

    .line 64
    .line 65
    move-object v6, v8

    .line 66
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    if-eqz v5, :cond_d

    .line 70
    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_3
    const/16 v0, 0x8

    .line 76
    .line 77
    invoke-virtual {v5, v0}, Lf9/y;->P(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lf9/y;->n()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-static {v4}, Ls7/a;->c(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    const/4 v7, 0x4

    .line 89
    invoke-virtual {v5, v7}, Lf9/y;->Q(I)V

    .line 90
    .line 91
    .line 92
    const/4 v8, 0x1

    .line 93
    if-ne v4, v8, :cond_4

    .line 94
    .line 95
    invoke-virtual {v5, v7}, Lf9/y;->Q(I)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {v5}, Lf9/y;->n()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-ne v4, v8, :cond_c

    .line 103
    .line 104
    invoke-virtual {v6, v0}, Lf9/y;->P(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Lf9/y;->n()I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Ls7/a;->c(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v6, v7}, Lf9/y;->Q(I)V

    .line 116
    .line 117
    .line 118
    if-ne v0, v8, :cond_6

    .line 119
    .line 120
    invoke-virtual {v6}, Lf9/y;->F()J

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    const-wide/16 v9, 0x0

    .line 125
    .line 126
    cmp-long v0, v4, v9

    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    new-instance v0, Ld7/o;

    .line 132
    .line 133
    const-string v1, "Variable length description in sgpd found (unsupported)"

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0

    .line 139
    :cond_6
    const/4 v4, 0x2

    .line 140
    if-lt v0, v4, :cond_7

    .line 141
    .line 142
    invoke-virtual {v6, v7}, Lf9/y;->Q(I)V

    .line 143
    .line 144
    .line 145
    :cond_7
    :goto_2
    invoke-virtual {v6}, Lf9/y;->F()J

    .line 146
    .line 147
    .line 148
    move-result-wide v4

    .line 149
    const-wide/16 v9, 0x1

    .line 150
    .line 151
    cmp-long v0, v4, v9

    .line 152
    .line 153
    if-nez v0, :cond_b

    .line 154
    .line 155
    invoke-virtual {v6, v8}, Lf9/y;->Q(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lf9/y;->D()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    and-int/lit16 v4, v0, 0xf0

    .line 163
    .line 164
    shr-int/lit8 v14, v4, 0x4

    .line 165
    .line 166
    and-int/lit8 v15, v0, 0xf

    .line 167
    .line 168
    invoke-virtual {v6}, Lf9/y;->D()I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-ne v0, v8, :cond_8

    .line 173
    .line 174
    move v10, v8

    .line 175
    goto :goto_3

    .line 176
    :cond_8
    move v10, v3

    .line 177
    :goto_3
    if-nez v10, :cond_9

    .line 178
    .line 179
    return-void

    .line 180
    :cond_9
    invoke-virtual {v6}, Lf9/y;->D()I

    .line 181
    .line 182
    .line 183
    move-result v12

    .line 184
    const/16 v0, 0x10

    .line 185
    .line 186
    new-array v13, v0, [B

    .line 187
    .line 188
    invoke-virtual {v6, v13, v3, v0}, Lf9/y;->j([BII)V

    .line 189
    .line 190
    .line 191
    if-nez v12, :cond_a

    .line 192
    .line 193
    invoke-virtual {v6}, Lf9/y;->D()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    new-array v2, v0, [B

    .line 198
    .line 199
    invoke-virtual {v6, v2, v3, v0}, Lf9/y;->j([BII)V

    .line 200
    .line 201
    .line 202
    :cond_a
    move-object/from16 v16, v2

    .line 203
    .line 204
    iput-boolean v8, v1, Ls7/q;->m:Z

    .line 205
    .line 206
    new-instance v0, Ls7/p;

    .line 207
    .line 208
    move-object v9, v0

    .line 209
    move-object/from16 v11, p1

    .line 210
    .line 211
    invoke-direct/range {v9 .. v16}, Ls7/p;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 212
    .line 213
    .line 214
    iput-object v0, v1, Ls7/q;->o:Ls7/p;

    .line 215
    .line 216
    return-void

    .line 217
    :cond_b
    new-instance v0, Ld7/o;

    .line 218
    .line 219
    const-string v1, "Entry count in sgpd != 1 (unsupported)."

    .line 220
    .line 221
    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw v0

    .line 225
    :cond_c
    new-instance v0, Ld7/o;

    .line 226
    .line 227
    const-string v1, "Entry count in sbgp != 1 (unsupported)."

    .line 228
    .line 229
    invoke-direct {v0, v1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw v0

    .line 233
    :cond_d
    :goto_4
    return-void
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
.end method

.method private static z(Lf9/y;ILs7/q;)V
    .locals 3

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lf9/y;->P(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lf9/y;->n()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ls7/a;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    and-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    and-int/lit8 p1, p1, 0x2

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, v0

    .line 26
    :goto_0
    invoke-virtual {p0}, Lf9/y;->H()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    iget-object p0, p2, Ls7/q;->n:[Z

    .line 33
    .line 34
    iget p1, p2, Ls7/q;->f:I

    .line 35
    .line 36
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget v2, p2, Ls7/q;->f:I

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    iget-object v2, p2, Ls7/q;->n:[Z

    .line 45
    .line 46
    invoke-static {v2, v0, v1, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lf9/y;->a()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p2, p1}, Ls7/q;->d(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p0}, Ls7/q;->a(Lf9/y;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    new-instance p0, Ld7/o;

    .line 61
    .line 62
    new-instance p1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v0, "Senc sample count "

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v0, " is different from fragment sample count"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget p2, p2, Ls7/q;->f:I

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p0, p1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0

    .line 93
    :cond_3
    new-instance p0, Ld7/o;

    .line 94
    .line 95
    const-string p1, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 96
    .line 97
    invoke-direct {p0, p1}, Ld7/o;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p0
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
.end method


# virtual methods
.method public b(Ll7/k;)V
    .locals 12

    .line 1
    iput-object p1, p0, Ls7/g;->E:Ll7/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ls7/g;->e()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ls7/g;->l()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ls7/g;->b:Ls7/o;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v1, Ls7/g$b;

    .line 14
    .line 15
    iget v0, v0, Ls7/o;->b:I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-interface {p1, v2, v0}, Ll7/k;->d(II)Ll7/b0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Ls7/r;

    .line 23
    .line 24
    iget-object v4, p0, Ls7/g;->b:Ls7/o;

    .line 25
    .line 26
    new-array v5, v2, [J

    .line 27
    .line 28
    new-array v6, v2, [I

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    new-array v8, v2, [J

    .line 32
    .line 33
    new-array v9, v2, [I

    .line 34
    .line 35
    const-wide/16 v10, 0x0

    .line 36
    .line 37
    move-object v3, v0

    .line 38
    invoke-direct/range {v3 .. v11}, Ls7/r;-><init>(Ls7/o;[J[II[J[IJ)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Ls7/c;

    .line 42
    .line 43
    invoke-direct {v3, v2, v2, v2, v2}, Ls7/c;-><init>(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v1, p1, v0, v3}, Ls7/g$b;-><init>(Ll7/b0;Ls7/r;Ls7/c;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Ls7/g;->E:Ll7/k;

    .line 55
    .line 56
    invoke-interface {p1}, Ll7/k;->q()V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
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

.method public c(JJ)V
    .locals 2

    .line 1
    iget-object p1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    move v0, p2

    .line 9
    :goto_0
    if-ge v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Ls7/g;->d:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ls7/g$b;

    .line 18
    .line 19
    invoke-virtual {v1}, Ls7/g$b;->k()V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object p1, p0, Ls7/g;->n:Ljava/util/ArrayDeque;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 28
    .line 29
    .line 30
    iput p2, p0, Ls7/g;->v:I

    .line 31
    .line 32
    iput-wide p3, p0, Ls7/g;->w:J

    .line 33
    .line 34
    iget-object p1, p0, Ls7/g;->m:Ljava/util/ArrayDeque;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, Ls7/g;->e()V

    .line 40
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
    .locals 1

    .line 1
    :cond_0
    :goto_0
    iget p2, p0, Ls7/g;->p:I

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    if-eq p2, v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p2, v0, :cond_1

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ls7/g;->N(Ll7/j;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    :cond_1
    invoke-direct {p0, p1}, Ls7/g;->M(Ll7/j;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    invoke-direct {p0, p1}, Ls7/g;->L(Ll7/j;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    invoke-direct {p0, p1}, Ls7/g;->K(Ll7/j;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    const/4 p1, -0x1

    .line 34
    return p1
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

.method public i(Ll7/j;)Z
    .locals 0

    invoke-static {p1}, Ls7/n;->b(Ll7/j;)Z

    move-result p1

    return p1
.end method

.method protected n(Ls7/o;)Ls7/o;
    .locals 0

    return-object p1
.end method

.method public release()V
    .locals 0

    return-void
.end method
