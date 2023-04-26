.class public Lcom/google/android/exoplayer2/SimpleExoPlayer;
.super Lcom/google/android/exoplayer2/e;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/Player$c;
.implements Lcom/google/android/exoplayer2/Player$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/SimpleExoPlayer$c;,
        Lcom/google/android/exoplayer2/SimpleExoPlayer$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:Lh7/f;

.field private C:Lh7/f;

.field private D:I

.field private E:Lf7/e;

.field private F:F

.field private G:Z

.field private H:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq8/b;",
            ">;"
        }
    .end annotation
.end field

.field private I:Lg9/m;

.field private J:Lh9/a;

.field private K:Z

.field private L:Z

.field private M:Lf9/a0;

.field private N:Z

.field private O:Z

.field private P:Li7/a;

.field protected final b:[Lcom/google/android/exoplayer2/t0;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/exoplayer2/d0;

.field private final e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

.field private final f:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lg9/q;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lf7/g;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lq8/l;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Ly7/f;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Li7/b;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Le7/d1;

.field private final l:Lcom/google/android/exoplayer2/b;

.field private final m:Lcom/google/android/exoplayer2/d;

.field private final n:Lcom/google/android/exoplayer2/u0;

.field private final o:Lcom/google/android/exoplayer2/w0;

.field private final p:Lcom/google/android/exoplayer2/x0;

.field private final q:J

.field private r:Ld7/k;

.field private s:Ld7/k;

.field private t:Landroid/media/AudioTrack;

.field private u:Landroid/view/Surface;

.field private v:Z

.field private w:I

.field private x:Landroid/view/SurfaceHolder;

.field private y:Landroid/view/TextureView;

.field private z:I


# direct methods
.method protected constructor <init>(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)V
    .locals 25

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/e;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c:Landroid/content/Context;

    .line 15
    .line 16
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->b(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Le7/d1;

    .line 17
    .line 18
    .line 19
    move-result-object v6

    .line 20
    iput-object v6, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->m(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lf9/a0;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->M:Lf9/a0;

    .line 27
    .line 28
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->q(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lf7/e;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E:Lf7/e;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->r(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->w:I

    .line 39
    .line 40
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->s(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput-boolean v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->t(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    iput-wide v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->q:J

    .line 51
    .line 52
    new-instance v14, Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 53
    .line 54
    const/4 v13, 0x0

    .line 55
    invoke-direct {v14, v15, v13}, Lcom/google/android/exoplayer2/SimpleExoPlayer$c;-><init>(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/SimpleExoPlayer$a;)V

    .line 56
    .line 57
    .line 58
    iput-object v14, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 59
    .line 60
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 61
    .line 62
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 66
    .line 67
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 68
    .line 69
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 73
    .line 74
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 80
    .line 81
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 82
    .line 83
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 87
    .line 88
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->j:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 94
    .line 95
    new-instance v5, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->u(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-direct {v5, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 102
    .line 103
    .line 104
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->v(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Ld7/v;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    move-object v8, v5

    .line 109
    move-object v9, v14

    .line 110
    move-object v10, v14

    .line 111
    move-object v11, v14

    .line 112
    move-object v12, v14

    .line 113
    invoke-interface/range {v7 .. v12}, Ld7/v;->a(Landroid/os/Handler;Lg9/a0;Lf7/r;Lq8/l;Ly7/f;)[Lcom/google/android/exoplayer2/t0;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput-object v1, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->b:[Lcom/google/android/exoplayer2/t0;

    .line 118
    .line 119
    const/high16 v2, 0x3f800000    # 1.0f

    .line 120
    .line 121
    iput v2, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F:F

    .line 122
    .line 123
    sget v2, Lf9/q0;->a:I

    .line 124
    .line 125
    const/16 v3, 0x15

    .line 126
    .line 127
    const/4 v12, 0x0

    .line 128
    if-ge v2, v3, :cond_0

    .line 129
    .line 130
    invoke-direct {v15, v12}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N0(I)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iput v0, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->D:I

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    invoke-static {v0}, Ld7/c;->a(Landroid/content/Context;)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    iput v0, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->D:I

    .line 142
    .line 143
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H:Ljava/util/List;

    .line 148
    .line 149
    const/4 v10, 0x1

    .line 150
    iput-boolean v10, v15, Lcom/google/android/exoplayer2/SimpleExoPlayer;->K:Z

    .line 151
    .line 152
    new-instance v11, Lcom/google/android/exoplayer2/d0;

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->c(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)La9/m;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->d(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lh8/c0;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->e(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Ld7/n;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->f(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Ld9/e;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->g(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->h(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Ld7/w;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->i(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lcom/google/android/exoplayer2/h0;

    .line 179
    .line 180
    .line 181
    move-result-object v16

    .line 182
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->j(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)J

    .line 183
    .line 184
    .line 185
    move-result-wide v17

    .line 186
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->k(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z

    .line 187
    .line 188
    .line 189
    move-result v19

    .line 190
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->l(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Lf9/c;

    .line 191
    .line 192
    .line 193
    move-result-object v20

    .line 194
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->u(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/os/Looper;

    .line 195
    .line 196
    .line 197
    move-result-object v21

    .line 198
    move-object v0, v11

    .line 199
    move-object/from16 v22, v5

    .line 200
    .line 201
    move-object v5, v7

    .line 202
    move v7, v8

    .line 203
    move-object v8, v9

    .line 204
    move-object/from16 v9, v16

    .line 205
    .line 206
    move-object/from16 v23, v11

    .line 207
    .line 208
    move-wide/from16 v10, v17

    .line 209
    .line 210
    move/from16 v16, v12

    .line 211
    .line 212
    move/from16 v12, v19

    .line 213
    .line 214
    move-object/from16 v17, v13

    .line 215
    .line 216
    move-object/from16 v13, v20

    .line 217
    .line 218
    move-object/from16 v24, v14

    .line 219
    .line 220
    move-object/from16 v14, v21

    .line 221
    .line 222
    move-object/from16 v15, p0

    .line 223
    .line 224
    invoke-direct/range {v0 .. v15}, Lcom/google/android/exoplayer2/d0;-><init>([Lcom/google/android/exoplayer2/t0;La9/m;Lh8/c0;Ld7/n;Ld9/e;Le7/d1;ZLd7/w;Lcom/google/android/exoplayer2/h0;JZLf9/c;Landroid/os/Looper;Lcom/google/android/exoplayer2/Player;)V

    .line 225
    .line 226
    .line 227
    move-object/from16 v0, p0

    .line 228
    .line 229
    move-object/from16 v1, v23

    .line 230
    .line 231
    iput-object v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 232
    .line 233
    move-object/from16 v2, v24

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/d0;->I(Lcom/google/android/exoplayer2/Player$a;)V

    .line 236
    .line 237
    .line 238
    new-instance v1, Lcom/google/android/exoplayer2/b;

    .line 239
    .line 240
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    move-object/from16 v4, v22

    .line 245
    .line 246
    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/exoplayer2/b;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/exoplayer2/b$b;)V

    .line 247
    .line 248
    .line 249
    iput-object v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->l:Lcom/google/android/exoplayer2/b;

    .line 250
    .line 251
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->n(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/b;->b(Z)V

    .line 256
    .line 257
    .line 258
    new-instance v1, Lcom/google/android/exoplayer2/d;

    .line 259
    .line 260
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/exoplayer2/d;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/exoplayer2/d$b;)V

    .line 265
    .line 266
    .line 267
    iput-object v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 268
    .line 269
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->o(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Z

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    if-eqz v3, :cond_1

    .line 274
    .line 275
    iget-object v13, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E:Lf7/e;

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_1
    move-object/from16 v13, v17

    .line 279
    .line 280
    :goto_1
    invoke-virtual {v1, v13}, Lcom/google/android/exoplayer2/d;->m(Lf7/e;)V

    .line 281
    .line 282
    .line 283
    new-instance v1, Lcom/google/android/exoplayer2/u0;

    .line 284
    .line 285
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-direct {v1, v3, v4, v2}, Lcom/google/android/exoplayer2/u0;-><init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/android/exoplayer2/u0$b;)V

    .line 290
    .line 291
    .line 292
    iput-object v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->n:Lcom/google/android/exoplayer2/u0;

    .line 293
    .line 294
    iget-object v2, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E:Lf7/e;

    .line 295
    .line 296
    iget v2, v2, Lf7/e;->c:I

    .line 297
    .line 298
    invoke-static {v2}, Lf9/q0;->e0(I)I

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/u0;->h(I)V

    .line 303
    .line 304
    .line 305
    new-instance v2, Lcom/google/android/exoplayer2/w0;

    .line 306
    .line 307
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    invoke-direct {v2, v3}, Lcom/google/android/exoplayer2/w0;-><init>(Landroid/content/Context;)V

    .line 312
    .line 313
    .line 314
    iput-object v2, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o:Lcom/google/android/exoplayer2/w0;

    .line 315
    .line 316
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->p(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_2

    .line 321
    .line 322
    const/4 v12, 0x1

    .line 323
    goto :goto_2

    .line 324
    :cond_2
    move/from16 v12, v16

    .line 325
    .line 326
    :goto_2
    invoke-virtual {v2, v12}, Lcom/google/android/exoplayer2/w0;->a(Z)V

    .line 327
    .line 328
    .line 329
    new-instance v2, Lcom/google/android/exoplayer2/x0;

    .line 330
    .line 331
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->a(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)Landroid/content/Context;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-direct {v2, v3}, Lcom/google/android/exoplayer2/x0;-><init>(Landroid/content/Context;)V

    .line 336
    .line 337
    .line 338
    iput-object v2, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->p:Lcom/google/android/exoplayer2/x0;

    .line 339
    .line 340
    invoke-static/range {p1 .. p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer$b;->p(Lcom/google/android/exoplayer2/SimpleExoPlayer$b;)I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    const/4 v4, 0x2

    .line 345
    if-ne v3, v4, :cond_3

    .line 346
    .line 347
    const/4 v12, 0x1

    .line 348
    goto :goto_3

    .line 349
    :cond_3
    move/from16 v12, v16

    .line 350
    .line 351
    :goto_3
    invoke-virtual {v2, v12}, Lcom/google/android/exoplayer2/x0;->a(Z)V

    .line 352
    .line 353
    .line 354
    invoke-static {v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H0(Lcom/google/android/exoplayer2/u0;)Li7/a;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    iput-object v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P:Li7/a;

    .line 359
    .line 360
    iget v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->D:I

    .line 361
    .line 362
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    const/16 v2, 0x66

    .line 367
    .line 368
    const/4 v3, 0x1

    .line 369
    invoke-direct {v0, v3, v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    iget v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->D:I

    .line 373
    .line 374
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-direct {v0, v4, v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    const/4 v1, 0x3

    .line 382
    iget-object v2, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E:Lf7/e;

    .line 383
    .line 384
    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    iget v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->w:I

    .line 388
    .line 389
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    const/4 v2, 0x4

    .line 394
    invoke-direct {v0, v4, v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    .line 398
    .line 399
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    const/16 v2, 0x65

    .line 404
    .line 405
    invoke-direct {v0, v3, v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-void
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
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method static synthetic A0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Lf9/a0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->M:Lf9/a0;

    return-object p0
.end method

.method static synthetic B0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N:Z

    return p0
.end method

.method static synthetic C0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N:Z

    return p1
.end method

.method static synthetic D0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->g1()V

    return-void
.end method

.method private static H0(Lcom/google/android/exoplayer2/u0;)Li7/a;
    .locals 3

    .line 1
    new-instance v0, Li7/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/u0;->d()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/u0;->c()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v2, v1, p0}, Li7/a;-><init>(III)V

    .line 13
    .line 14
    .line 15
    return-object v0
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

.method private static J0(ZI)I
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    :cond_0
    return v0
.end method

.method private N0(I)I
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const/16 v3, 0xfa0

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    const/4 v5, 0x2

    .line 27
    const/4 v6, 0x2

    .line 28
    new-instance v0, Landroid/media/AudioTrack;

    .line 29
    .line 30
    const/4 v2, 0x3

    .line 31
    const/4 v7, 0x0

    .line 32
    move-object v1, v0

    .line 33
    move v8, p1

    .line 34
    invoke-direct/range {v1 .. v8}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 38
    .line 39
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    return p1
    .line 46
.end method

.method private O0(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->z:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->A:I

    .line 6
    .line 7
    if-eq p2, v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iput p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->z:I

    .line 10
    .line 11
    iput p2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->A:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Le7/d1;->S1(II)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lg9/q;

    .line 35
    .line 36
    invoke-interface {v1, p1, p2}, Lg9/q;->f(II)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
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
.end method

.method private P0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Le7/d1;->a(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lf7/g;

    .line 25
    .line 26
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    .line 27
    .line 28
    invoke-interface {v1, v2}, Lf7/g;->a(Z)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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

.method private T0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y:Landroid/view/TextureView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "SimpleExoPlayer"

    .line 15
    .line 16
    const-string v2, "SurfaceTextureListener already unset or replaced."

    .line 17
    .line 18
    invoke-static {v0, v2}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y:Landroid/view/TextureView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iput-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y:Landroid/view/TextureView;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 34
    .line 35
    invoke-interface {v0, v2}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 39
    .line 40
    :cond_2
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method private U0(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->b:[Lcom/google/android/exoplayer2/t0;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->d()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-ne v4, p1, :cond_0

    .line 14
    .line 15
    iget-object v4, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 16
    .line 17
    invoke-virtual {v4, v3}, Lcom/google/android/exoplayer2/d0;->A0(Lcom/google/android/exoplayer2/r0$b;)Lcom/google/android/exoplayer2/r0;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3, p2}, Lcom/google/android/exoplayer2/r0;->n(I)Lcom/google/android/exoplayer2/r0;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3, p3}, Lcom/google/android/exoplayer2/r0;->m(Ljava/lang/Object;)Lcom/google/android/exoplayer2/r0;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/r0;->l()Lcom/google/android/exoplayer2/r0;

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
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

.method private V0()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F:F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/d;->g()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v0, v1

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p0, v2, v1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
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

.method private Z0(Lg9/l;)V
    .locals 2

    const/4 v0, 0x2

    const/16 v1, 0x8

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    return-void
.end method

.method private c1(Landroid/view/Surface;Z)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->b:[Lcom/google/android/exoplayer2/t0;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    if-ge v4, v2, :cond_1

    .line 12
    .line 13
    aget-object v5, v1, v4

    .line 14
    .line 15
    invoke-interface {v5}, Lcom/google/android/exoplayer2/t0;->d()I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    const/4 v7, 0x2

    .line 20
    if-ne v6, v7, :cond_0

    .line 21
    .line 22
    iget-object v6, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 23
    .line 24
    invoke-virtual {v6, v5}, Lcom/google/android/exoplayer2/d0;->A0(Lcom/google/android/exoplayer2/r0$b;)Lcom/google/android/exoplayer2/r0;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/4 v6, 0x1

    .line 29
    invoke-virtual {v5, v6}, Lcom/google/android/exoplayer2/r0;->n(I)Lcom/google/android/exoplayer2/r0;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v5, p1}, Lcom/google/android/exoplayer2/r0;->m(Ljava/lang/Object;)Lcom/google/android/exoplayer2/r0;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/r0;->l()Lcom/google/android/exoplayer2/r0;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    if-eq v1, p1, :cond_3

    .line 52
    .line 53
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Lcom/google/android/exoplayer2/r0;

    .line 68
    .line 69
    iget-wide v4, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->q:J

    .line 70
    .line 71
    invoke-virtual {v1, v4, v5}, Lcom/google/android/exoplayer2/r0;->a(J)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catch_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 76
    .line 77
    new-instance v1, Ld7/j;

    .line 78
    .line 79
    const/4 v2, 0x3

    .line 80
    invoke-direct {v1, v2}, Ld7/j;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->b(Ljava/lang/Exception;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v3, v1}, Lcom/google/android/exoplayer2/d0;->r1(ZLcom/google/android/exoplayer2/ExoPlaybackException;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_2
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->v:Z

    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 105
    .line 106
    .line 107
    :cond_3
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 108
    .line 109
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->v:Z

    .line 110
    .line 111
    return-void
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
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
.end method

.method static synthetic d0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lh7/f;)Lh7/f;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->B:Lh7/f;

    return-object p1
.end method

.method static synthetic e0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Le7/d1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    return-object p0
.end method

.method static synthetic f0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Ld7/k;)Ld7/k;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->r:Ld7/k;

    return-object p1
.end method

.method private f1(ZII)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    if-eq p2, p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    if-eqz p1, :cond_1

    if-eq p2, v1, :cond_1

    move v0, v1

    :cond_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    invoke-virtual {p2, p1, v0, p3}, Lcom/google/android/exoplayer2/d0;->o1(ZII)V

    return-void
.end method

.method static synthetic g0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method private g1()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eq v0, v1, :cond_3

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v0, v3, :cond_1

    .line 11
    .line 12
    const/4 v3, 0x3

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->I0()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o:Lcom/google/android/exoplayer2/w0;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move v1, v2

    .line 41
    :goto_0
    invoke-virtual {v3, v1}, Lcom/google/android/exoplayer2/w0;->b(Z)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->p:Lcom/google/android/exoplayer2/x0;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/x0;->b(Z)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o:Lcom/google/android/exoplayer2/w0;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/w0;->b(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->p:Lcom/google/android/exoplayer2/x0;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/x0;->b(Z)V

    .line 62
    .line 63
    .line 64
    :goto_2
    return-void
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
.end method

.method static synthetic h0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Landroid/view/Surface;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    return-object p0
.end method

.method private h1()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->K:Z

    .line 12
    .line 13
    const-string v1, "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->L:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    const-string v2, "SimpleExoPlayer"

    .line 29
    .line 30
    invoke-static {v2, v1, v0}, Lf9/r;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->L:Z

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_2
    :goto_1
    return-void
    .line 44
.end method

.method static synthetic i0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Lh7/f;)Lh7/f;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->C:Lh7/f;

    return-object p1
.end method

.method static synthetic j0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Ld7/k;)Ld7/k;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->s:Ld7/k;

    return-object p1
.end method

.method static synthetic k0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    return p0
.end method

.method static synthetic l0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G:Z

    return p1
.end method

.method static synthetic m0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P0()V

    return-void
.end method

.method static synthetic n0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H:Ljava/util/List;

    return-object p1
.end method

.method static synthetic o0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic p0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method static synthetic q0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Landroid/view/Surface;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    return-void
.end method

.method static synthetic r0(Lcom/google/android/exoplayer2/SimpleExoPlayer;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    return-void
.end method

.method static synthetic s0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->V0()V

    return-void
.end method

.method static synthetic t0(ZI)I
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->J0(ZI)I

    move-result p0

    return p0
.end method

.method static synthetic u0(Lcom/google/android/exoplayer2/SimpleExoPlayer;ZII)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f1(ZII)V

    return-void
.end method

.method static synthetic v0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Lcom/google/android/exoplayer2/u0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->n:Lcom/google/android/exoplayer2/u0;

    return-object p0
.end method

.method static synthetic w0(Lcom/google/android/exoplayer2/u0;)Li7/a;
    .locals 0

    invoke-static {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H0(Lcom/google/android/exoplayer2/u0;)Li7/a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic x0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Li7/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P:Li7/a;

    return-object p0
.end method

.method static synthetic y0(Lcom/google/android/exoplayer2/SimpleExoPlayer;Li7/a;)Li7/a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P:Li7/a;

    return-object p1
.end method

.method static synthetic z0(Lcom/google/android/exoplayer2/SimpleExoPlayer;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->j:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method


# virtual methods
.method public A()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->A()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public B(I)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->B(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
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

.method public C()Lcom/google/android/exoplayer2/Player$b;
    .locals 0

    return-object p0
.end method

.method public D(IJ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 5
    .line 6
    invoke-virtual {v0}, Le7/d1;->Q1()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/d0;->D(IJ)V

    .line 12
    .line 13
    .line 14
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
.end method

.method public E()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->E()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public E0(Ly7/f;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

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
.end method

.method public F(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->F(Z)V

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
.end method

.method public F0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->T0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v1, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public G()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->G()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public G0(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->b1(Landroid/view/SurfaceHolder;)V

    .line 12
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
.end method

.method public H(Landroid/view/TextureView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y:Landroid/view/TextureView;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->z(Landroid/view/TextureView;)V

    .line 12
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
.end method

.method public I(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->I(Lcom/google/android/exoplayer2/Player$a;)V

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
.end method

.method public I0()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->C0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public J()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->J()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public K(Lg9/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->I:Lg9/m;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

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

.method public K0()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->G0()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public L()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->L()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public L0()Ld7/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->r:Ld7/k;

    return-object v0
.end method

.method public M0()F
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F:F

    return v0
.end method

.method public N(Lq8/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public O()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->O()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public P()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->P()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public Q0(Lh8/u;ZZ)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, -0x1

    .line 13
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->X0(Ljava/util/List;IJ)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c()V

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
.end method

.method public R(Lg9/q;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

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
.end method

.method public R0()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    sget v0, Lf9/q0;->a:I

    .line 5
    .line 6
    const/16 v1, 0x15

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ge v0, v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V

    .line 16
    .line 17
    .line 18
    iput-object v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->t:Landroid/media/AudioTrack;

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->l:Lcom/google/android/exoplayer2/b;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/b;->b(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->n:Lcom/google/android/exoplayer2/u0;

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/u0;->g()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->o:Lcom/google/android/exoplayer2/w0;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/w0;->b(Z)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->p:Lcom/google/android/exoplayer2/x0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/x0;->b(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d;->i()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->g1()V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 52
    .line 53
    invoke-virtual {v0}, Le7/d1;->U1()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->T0()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-boolean v3, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->v:Z

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 68
    .line 69
    .line 70
    :cond_1
    iput-object v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 71
    .line 72
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N:Z

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->M:Lf9/a0;

    .line 77
    .line 78
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    check-cast v0, Lf9/a0;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lf9/a0;->c(I)V

    .line 85
    .line 86
    .line 87
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->N:Z

    .line 88
    .line 89
    :cond_3
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H:Ljava/util/List;

    .line 94
    .line 95
    const/4 v0, 0x1

    .line 96
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O:Z

    .line 97
    .line 98
    return-void
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
.end method

.method public S(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->S(I)V

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
.end method

.method public S0(Ly7/f;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->i:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public U(Landroid/view/SurfaceView;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lg9/j;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 14
    .line 15
    if-ne p1, v0, :cond_2

    .line 16
    .line 17
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Z0(Lg9/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    invoke-virtual {p0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->G0(Landroid/view/SurfaceHolder;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_1
    return-void
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

.method public V()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->V()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public W()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->W()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public W0(Lh8/u;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 5
    .line 6
    invoke-virtual {v0}, Le7/d1;->V1()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->j1(Lh8/u;)V

    .line 12
    .line 13
    .line 14
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
.end method

.method public X()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->X()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public X0(Ljava/util/List;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh8/u;",
            ">;IJ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 5
    .line 6
    invoke-virtual {v0}, Le7/d1;->V1()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/d0;->l1(Ljava/util/List;IJ)V

    .line 12
    .line 13
    .line 14
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

.method public Y()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->Y()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public Y0(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->p1(Lcom/google/android/exoplayer2/PlaybackParameters;)V

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
.end method

.method public a(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->T0()V

    .line 5
    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Z0(Lg9/l;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 15
    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, -0x1

    .line 21
    :goto_0
    invoke-direct {p0, v0, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

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
.end method

.method public a1(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->w:I

    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {p0, v1, v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public b()Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public b1(Landroid/view/SurfaceHolder;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->T0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Z0(Lg9/l;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, v1, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object v2, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 26
    .line 27
    invoke-interface {p1, v2}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-direct {p0, v2, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-direct {p0, v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, v1, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 65
    .line 66
    .line 67
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
.end method

.method public c()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/d;->p(ZI)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->J0(ZI)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f1(ZII)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->c()V

    .line 25
    .line 26
    .line 27
    return-void
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

.method public d()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public d1(F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, Lf9/q0;->q(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F:F

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->V0()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->k:Le7/d1;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Le7/d1;->T1(F)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->g:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lf7/g;

    .line 45
    .line 46
    invoke-interface {v1, p1}, Lf7/g;->b(F)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    return-void
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
.end method

.method public e(Lg9/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->I:Lg9/m;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 p1, 0x6

    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {p0, v1, p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public e1(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->E()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/d;->p(ZI)I

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->q1(Z)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H:Ljava/util/List;

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
.end method

.method public f()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->f()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public g(Landroid/view/Surface;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->u:Landroid/view/Surface;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F0()V

    .line 11
    .line 12
    .line 13
    :cond_0
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
    .line 45
    .line 46
.end method

.method public getDuration()J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
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

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/a;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->h()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public j(Lg9/q;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public k(Landroid/view/SurfaceView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lg9/j;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lg9/j;

    .line 10
    .line 11
    invoke-virtual {v0}, Lg9/j;->getVideoDecoderOutputBufferRenderer()Lg9/l;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->F0()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->x:Landroid/view/SurfaceHolder;

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Z0(Lg9/l;)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    if-nez p1, :cond_1

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->b1(Landroid/view/SurfaceHolder;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public l(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/d0;->l(Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public m()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public n(Lh9/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->J:Lh9/a;

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 p1, 0x7

    .line 10
    const/4 v0, 0x0

    .line 11
    const/4 v1, 0x6

    .line 12
    invoke-direct {p0, v1, p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public o()Lcom/google/android/exoplayer2/ExoPlaybackException;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->o()Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public p(Lh9/a;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->J:Lh9/a;

    .line 5
    .line 6
    const/4 v0, 0x6

    .line 7
    const/4 v1, 0x7

    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->U0(IILjava/lang/Object;)V

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

.method public q(Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->m:Lcom/google/android/exoplayer2/d;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->P()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, p1, v1}, Lcom/google/android/exoplayer2/d;->p(ZI)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->J0(ZI)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->f1(ZII)V

    .line 19
    .line 20
    .line 21
    return-void
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

.method public r()Lcom/google/android/exoplayer2/Player$c;
    .locals 0

    return-object p0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lq8/b;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->H:Ljava/util/List;

    .line 5
    .line 6
    return-object v0
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
.end method

.method public t()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->t()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public u()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->u()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public v(Lq8/l;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

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
.end method

.method public w()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->w()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public x()Lcom/google/android/exoplayer2/Timeline;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->x()Lcom/google/android/exoplayer2/Timeline;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
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

.method public y()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->d:Lcom/google/android/exoplayer2/d0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/d0;->y()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public z(Landroid/view/TextureView;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->h1()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->T0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->Z0(Lg9/l;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->y:Landroid/view/TextureView;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v2, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    const-string v3, "SimpleExoPlayer"

    .line 33
    .line 34
    const-string v4, "Replacing existing SurfaceTextureListener."

    .line 35
    .line 36
    invoke-static {v3, v4}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iget-object v3, p0, Lcom/google/android/exoplayer2/SimpleExoPlayer;->e:Lcom/google/android/exoplayer2/SimpleExoPlayer$c;

    .line 40
    .line 41
    invoke-virtual {p1, v3}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/TextureView;->isAvailable()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-object v3, v0

    .line 56
    :goto_0
    if-nez v3, :cond_4

    .line 57
    .line 58
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v2, v2}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    new-instance v0, Landroid/view/Surface;

    .line 66
    .line 67
    invoke-direct {v0, v3}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->c1(Landroid/view/Surface;Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-direct {p0, v0, p1}, Lcom/google/android/exoplayer2/SimpleExoPlayer;->O0(II)V

    .line 82
    .line 83
    .line 84
    :goto_1
    return-void
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
