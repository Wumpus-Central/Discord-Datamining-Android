.class final Lcom/google/android/exoplayer2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Lh8/r$a;
.implements La9/m$a;
.implements Lcom/google/android/exoplayer2/p0$d;
.implements Lcom/google/android/exoplayer2/h$a;
.implements Lcom/google/android/exoplayer2/r0$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/g0$c;,
        Lcom/google/android/exoplayer2/g0$b;,
        Lcom/google/android/exoplayer2/g0$d;,
        Lcom/google/android/exoplayer2/g0$g;,
        Lcom/google/android/exoplayer2/g0$h;,
        Lcom/google/android/exoplayer2/g0$f;,
        Lcom/google/android/exoplayer2/g0$e;
    }
.end annotation


# instance fields
.field private final A:Lcom/google/android/exoplayer2/g0$f;

.field private final B:Lcom/google/android/exoplayer2/m0;

.field private final C:Lcom/google/android/exoplayer2/p0;

.field private final D:Lcom/google/android/exoplayer2/h0;

.field private final E:J

.field private F:Ld7/w;

.field private G:Lcom/google/android/exoplayer2/q0;

.field private H:Lcom/google/android/exoplayer2/g0$e;

.field private I:Z

.field private J:Z

.field private K:Z

.field private L:Z

.field private M:Z

.field private N:I

.field private O:Z

.field private P:Z

.field private Q:Z

.field private R:Z

.field private S:I

.field private T:Lcom/google/android/exoplayer2/g0$h;

.field private U:J

.field private V:I

.field private W:Z

.field private X:Lcom/google/android/exoplayer2/ExoPlaybackException;

.field private Y:J

.field private final k:[Lcom/google/android/exoplayer2/t0;

.field private final l:[Ld7/t;

.field private final m:La9/m;

.field private final n:La9/n;

.field private final o:Ld7/n;

.field private final p:Ld9/e;

.field private final q:Lf9/m;

.field private final r:Landroid/os/HandlerThread;

.field private final s:Landroid/os/Looper;

.field private final t:Lcom/google/android/exoplayer2/Timeline$c;

.field private final u:Lcom/google/android/exoplayer2/Timeline$b;

.field private final v:J

.field private final w:Z

.field private final x:Lcom/google/android/exoplayer2/h;

.field private final y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/android/exoplayer2/g0$d;",
            ">;"
        }
    .end annotation
.end field

.field private final z:Lf9/c;


# direct methods
.method public constructor <init>([Lcom/google/android/exoplayer2/t0;La9/m;La9/n;Ld7/n;Ld9/e;IZLe7/d1;Ld7/w;Lcom/google/android/exoplayer2/h0;JZLandroid/os/Looper;Lf9/c;Lcom/google/android/exoplayer2/g0$f;)V
    .locals 11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move-wide/from16 v5, p11

    move-object/from16 v7, p15

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v8, p16

    .line 2
    iput-object v8, v0, Lcom/google/android/exoplayer2/g0;->A:Lcom/google/android/exoplayer2/g0$f;

    .line 3
    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 4
    iput-object v2, v0, Lcom/google/android/exoplayer2/g0;->m:La9/m;

    move-object v8, p3

    .line 5
    iput-object v8, v0, Lcom/google/android/exoplayer2/g0;->n:La9/n;

    move-object v9, p4

    .line 6
    iput-object v9, v0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 7
    iput-object v3, v0, Lcom/google/android/exoplayer2/g0;->p:Ld9/e;

    move/from16 v10, p6

    .line 8
    iput v10, v0, Lcom/google/android/exoplayer2/g0;->N:I

    move/from16 v10, p7

    .line 9
    iput-boolean v10, v0, Lcom/google/android/exoplayer2/g0;->O:Z

    move-object/from16 v10, p9

    .line 10
    iput-object v10, v0, Lcom/google/android/exoplayer2/g0;->F:Ld7/w;

    move-object/from16 v10, p10

    .line 11
    iput-object v10, v0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 12
    iput-wide v5, v0, Lcom/google/android/exoplayer2/g0;->E:J

    .line 13
    iput-wide v5, v0, Lcom/google/android/exoplayer2/g0;->Y:J

    move/from16 v5, p13

    .line 14
    iput-boolean v5, v0, Lcom/google/android/exoplayer2/g0;->J:Z

    .line 15
    iput-object v7, v0, Lcom/google/android/exoplayer2/g0;->z:Lf9/c;

    .line 16
    invoke-interface {p4}, Ld7/n;->c()J

    move-result-wide v5

    iput-wide v5, v0, Lcom/google/android/exoplayer2/g0;->v:J

    .line 17
    invoke-interface {p4}, Ld7/n;->b()Z

    move-result v5

    iput-boolean v5, v0, Lcom/google/android/exoplayer2/g0;->w:Z

    .line 18
    invoke-static {p3}, Lcom/google/android/exoplayer2/q0;->k(La9/n;)Lcom/google/android/exoplayer2/q0;

    move-result-object v5

    iput-object v5, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 19
    new-instance v6, Lcom/google/android/exoplayer2/g0$e;

    invoke-direct {v6, v5}, Lcom/google/android/exoplayer2/g0$e;-><init>(Lcom/google/android/exoplayer2/q0;)V

    iput-object v6, v0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 20
    array-length v5, v1

    new-array v5, v5, [Ld7/t;

    iput-object v5, v0, Lcom/google/android/exoplayer2/g0;->l:[Ld7/t;

    const/4 v5, 0x0

    .line 21
    :goto_0
    array-length v6, v1

    if-ge v5, v6, :cond_0

    .line 22
    aget-object v6, v1, v5

    invoke-interface {v6, v5}, Lcom/google/android/exoplayer2/t0;->setIndex(I)V

    .line 23
    iget-object v6, v0, Lcom/google/android/exoplayer2/g0;->l:[Ld7/t;

    aget-object v8, v1, v5

    invoke-interface {v8}, Lcom/google/android/exoplayer2/t0;->m()Ld7/t;

    move-result-object v8

    aput-object v8, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/google/android/exoplayer2/h;

    invoke-direct {v1, p0, v7}, Lcom/google/android/exoplayer2/h;-><init>(Lcom/google/android/exoplayer2/h$a;Lf9/c;)V

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 26
    new-instance v1, Lcom/google/android/exoplayer2/Timeline$c;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/Timeline$c;-><init>()V

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 27
    new-instance v1, Lcom/google/android/exoplayer2/Timeline$b;

    invoke-direct {v1}, Lcom/google/android/exoplayer2/Timeline$b;-><init>()V

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 28
    invoke-virtual {p2, p0, v3}, La9/m;->b(La9/m$a;Ld9/e;)V

    const/4 v1, 0x1

    .line 29
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/g0;->W:Z

    .line 30
    new-instance v1, Landroid/os/Handler;

    move-object/from16 v2, p14

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 31
    new-instance v2, Lcom/google/android/exoplayer2/m0;

    invoke-direct {v2, v4, v1}, Lcom/google/android/exoplayer2/m0;-><init>(Le7/d1;Landroid/os/Handler;)V

    iput-object v2, v0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 32
    new-instance v2, Lcom/google/android/exoplayer2/p0;

    invoke-direct {v2, p0, v4, v1}, Lcom/google/android/exoplayer2/p0;-><init>(Lcom/google/android/exoplayer2/p0$d;Le7/d1;Landroid/os/Handler;)V

    iput-object v2, v0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 33
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "ExoPlayer:Playback"

    const/16 v3, -0x10

    invoke-direct {v1, v2, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->r:Landroid/os/HandlerThread;

    .line 34
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 35
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->s:Landroid/os/Looper;

    .line 36
    invoke-interface {v7, v1, p0}, Lf9/c;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lf9/m;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    return-void
.end method

.method private A0(Lh8/u$a;JZZ)J
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->f1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-nez p5, :cond_0

    .line 9
    .line 10
    iget-object p5, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 11
    .line 12
    iget p5, p5, Lcom/google/android/exoplayer2/q0;->d:I

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-ne p5, v2, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object p5, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 21
    .line 22
    invoke-virtual {p5}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    move-object v2, p5

    .line 27
    :goto_0
    if-eqz v2, :cond_3

    .line 28
    .line 29
    iget-object v3, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 30
    .line 31
    iget-object v3, v3, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 32
    .line 33
    invoke-virtual {p1, v3}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    :goto_1
    const-wide/16 v3, 0x0

    .line 46
    .line 47
    if-nez p4, :cond_4

    .line 48
    .line 49
    if-ne p5, v2, :cond_4

    .line 50
    .line 51
    if-eqz v2, :cond_7

    .line 52
    .line 53
    invoke-virtual {v2, p2, p3}, Lcom/google/android/exoplayer2/j0;->z(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p4

    .line 57
    cmp-long p1, p4, v3

    .line 58
    .line 59
    if-gez p1, :cond_7

    .line 60
    .line 61
    :cond_4
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 62
    .line 63
    array-length p4, p1

    .line 64
    move p5, v0

    .line 65
    :goto_2
    if-ge p5, p4, :cond_5

    .line 66
    .line 67
    aget-object v5, p1, p5

    .line 68
    .line 69
    invoke-direct {p0, v5}, Lcom/google/android/exoplayer2/g0;->n(Lcom/google/android/exoplayer2/t0;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 p5, p5, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    if-eqz v2, :cond_7

    .line 76
    .line 77
    :goto_3
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eq p1, v2, :cond_6

    .line 84
    .line 85
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->b()Lcom/google/android/exoplayer2/j0;

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/m0;->y(Lcom/google/android/exoplayer2/j0;)Z

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v3, v4}, Lcom/google/android/exoplayer2/j0;->x(J)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->r()V

    .line 100
    .line 101
    .line 102
    :cond_7
    if-eqz v2, :cond_b

    .line 103
    .line 104
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 105
    .line 106
    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/m0;->y(Lcom/google/android/exoplayer2/j0;)Z

    .line 107
    .line 108
    .line 109
    iget-boolean p1, v2, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 110
    .line 111
    if-nez p1, :cond_8

    .line 112
    .line 113
    iget-object p1, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 114
    .line 115
    invoke-virtual {p1, p2, p3}, Lcom/google/android/exoplayer2/k0;->b(J)Lcom/google/android/exoplayer2/k0;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_8
    iget-object p1, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 123
    .line 124
    iget-wide p4, p1, Lcom/google/android/exoplayer2/k0;->e:J

    .line 125
    .line 126
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    cmp-long p1, p4, v5

    .line 132
    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    cmp-long p1, p2, p4

    .line 136
    .line 137
    if-ltz p1, :cond_9

    .line 138
    .line 139
    const-wide/16 p1, 0x1

    .line 140
    .line 141
    sub-long/2addr p4, p1

    .line 142
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->max(JJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide p2

    .line 146
    :cond_9
    iget-boolean p1, v2, Lcom/google/android/exoplayer2/j0;->e:Z

    .line 147
    .line 148
    if-eqz p1, :cond_a

    .line 149
    .line 150
    iget-object p1, v2, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 151
    .line 152
    invoke-interface {p1, p2, p3}, Lh8/r;->l(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide p1

    .line 156
    iget-object p3, v2, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 157
    .line 158
    iget-wide p4, p0, Lcom/google/android/exoplayer2/g0;->v:J

    .line 159
    .line 160
    sub-long p4, p1, p4

    .line 161
    .line 162
    iget-boolean v2, p0, Lcom/google/android/exoplayer2/g0;->w:Z

    .line 163
    .line 164
    invoke-interface {p3, p4, p5, v2}, Lh8/r;->u(JZ)V

    .line 165
    .line 166
    .line 167
    move-wide p2, p1

    .line 168
    :cond_a
    :goto_4
    invoke-direct {p0, p2, p3}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 169
    .line 170
    .line 171
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Q()V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_b
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 176
    .line 177
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->f()V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0, p2, p3}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 181
    .line 182
    .line 183
    :goto_5
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 184
    .line 185
    .line 186
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 187
    .line 188
    invoke-interface {p1, v1}, Lf9/m;->h(I)Z

    .line 189
    .line 190
    .line 191
    return-wide p2
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
.end method

.method private B()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->p:J

    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/g0;->C(J)J

    move-result-wide v0

    return-wide v0
.end method

.method private B0(Lcom/google/android/exoplayer2/r0;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->C0(Lcom/google/android/exoplayer2/r0;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v1, Lcom/google/android/exoplayer2/g0$d;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lcom/google/android/exoplayer2/g0$d;-><init>(Lcom/google/android/exoplayer2/r0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v0, Lcom/google/android/exoplayer2/g0$d;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/g0$d;-><init>(Lcom/google/android/exoplayer2/r0;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 45
    .line 46
    iget-object v4, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 47
    .line 48
    iget v5, p0, Lcom/google/android/exoplayer2/g0;->N:I

    .line 49
    .line 50
    iget-boolean v6, p0, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 51
    .line 52
    iget-object v7, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 53
    .line 54
    iget-object v8, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 55
    .line 56
    move-object v2, v0

    .line 57
    move-object v3, v4

    .line 58
    invoke-static/range {v2 .. v8}, Lcom/google/android/exoplayer2/g0;->q0(Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;IZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    const/4 v0, 0x0

    .line 76
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/r0;->k(Z)V

    .line 77
    .line 78
    .line 79
    :goto_0
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

.method private C(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-wide v1

    .line 12
    :cond_0
    iget-wide v3, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 13
    .line 14
    invoke-virtual {v0, v3, v4}, Lcom/google/android/exoplayer2/j0;->y(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    sub-long/2addr p1, v3

    .line 19
    invoke-static {v1, v2, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1
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

.method private C0(Lcom/google/android/exoplayer2/r0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->c()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->s:Landroid/os/Looper;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->m(Lcom/google/android/exoplayer2/r0;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 13
    .line 14
    iget p1, p1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    .line 20
    if-ne p1, v1, :cond_2

    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 23
    .line 24
    invoke-interface {p1, v1}, Lf9/m;->h(I)Z

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 29
    .line 30
    const/16 v1, 0xf

    .line 31
    .line 32
    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 37
    .line 38
    .line 39
    :cond_2
    :goto_0
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method private D(Lh8/r;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/m0;->u(Lh8/r;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/m0;->x(J)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Q()V

    .line 18
    .line 19
    .line 20
    return-void
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

.method private D0(Lcom/google/android/exoplayer2/r0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->c()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const-string v0, "TAG"

    .line 16
    .line 17
    const-string v1, "Trying to send message on a dead thread."

    .line 18
    .line 19
    invoke-static {v0, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/r0;->k(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->z:Lf9/c;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-interface {v1, v0, v2}, Lf9/c;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lf9/m;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    new-instance v1, Lcom/google/android/exoplayer2/f0;

    .line 35
    .line 36
    invoke-direct {v1, p0, p1}, Lcom/google/android/exoplayer2/f0;-><init>(Lcom/google/android/exoplayer2/g0;Lcom/google/android/exoplayer2/r0;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v1}, Lf9/m;->a(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method private E(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 15
    .line 16
    iget-object v1, v1, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/google/android/exoplayer2/q0;->j:Lh8/u$a;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    xor-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Lcom/google/android/exoplayer2/q0;->b(Lh8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 37
    .line 38
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 39
    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    iget-wide v3, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->i()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    :goto_1
    iput-wide v3, v1, Lcom/google/android/exoplayer2/q0;->p:J

    .line 50
    .line 51
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 52
    .line 53
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->B()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    iput-wide v3, v1, Lcom/google/android/exoplayer2/q0;->q:J

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    :cond_3
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-boolean p1, v0, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 66
    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->n()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/g0;->i1(Lcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    return-void
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

.method private E0(J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

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
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    invoke-direct {p0, v3, p1, p2}, Lcom/google/android/exoplayer2/g0;->F0(Lcom/google/android/exoplayer2/t0;J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
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

.method private F(Lcom/google/android/exoplayer2/Timeline;)V
    .locals 21

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    iget-object v10, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v11, v8, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 8
    .line 9
    iget-object v12, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 10
    .line 11
    iget v13, v8, Lcom/google/android/exoplayer2/g0;->N:I

    .line 12
    .line 13
    iget-boolean v14, v8, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 14
    .line 15
    iget-object v15, v8, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 16
    .line 17
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 18
    .line 19
    move-object/from16 v9, p1

    .line 20
    .line 21
    move-object/from16 v16, v0

    .line 22
    .line 23
    invoke-static/range {v9 .. v16}, Lcom/google/android/exoplayer2/g0;->s0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/g0$h;Lcom/google/android/exoplayer2/m0;IZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/g0$g;

    .line 24
    .line 25
    .line 26
    move-result-object v9

    .line 27
    iget-object v10, v9, Lcom/google/android/exoplayer2/g0$g;->a:Lh8/u$a;

    .line 28
    .line 29
    iget-wide v11, v9, Lcom/google/android/exoplayer2/g0$g;->c:J

    .line 30
    .line 31
    iget-boolean v0, v9, Lcom/google/android/exoplayer2/g0$g;->d:Z

    .line 32
    .line 33
    iget-wide v13, v9, Lcom/google/android/exoplayer2/g0$g;->b:J

    .line 34
    .line 35
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 38
    .line 39
    invoke-virtual {v1, v10}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x1

    .line 44
    const/4 v15, 0x0

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 48
    .line 49
    iget-wide v3, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 50
    .line 51
    cmp-long v1, v13, v3

    .line 52
    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move/from16 v16, v15

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_0
    move/from16 v16, v2

    .line 60
    .line 61
    :goto_1
    const/4 v5, 0x0

    .line 62
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    :try_start_0
    iget-boolean v1, v9, Lcom/google/android/exoplayer2/g0$g;->e:Z

    .line 68
    .line 69
    if-eqz v1, :cond_3

    .line 70
    .line 71
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 72
    .line 73
    iget v1, v1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 74
    .line 75
    if-eq v1, v2, :cond_2

    .line 76
    .line 77
    const/4 v1, 0x4

    .line 78
    invoke-direct {v8, v1}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-direct {v8, v15, v15, v15, v2}, Lcom/google/android/exoplayer2/g0;->m0(ZZZZ)V

    .line 82
    .line 83
    .line 84
    :cond_3
    if-nez v16, :cond_4

    .line 85
    .line 86
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 87
    .line 88
    iget-wide v3, v8, Lcom/google/android/exoplayer2/g0;->U:J

    .line 89
    .line 90
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->y()J

    .line 91
    .line 92
    .line 93
    move-result-wide v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 94
    move-object/from16 v2, p1

    .line 95
    .line 96
    move-wide/from16 v5, v19

    .line 97
    .line 98
    :try_start_1
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/exoplayer2/m0;->E(Lcom/google/android/exoplayer2/Timeline;JJ)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    invoke-direct {v8, v15}, Lcom/google/android/exoplayer2/g0;->x0(Z)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_7

    .line 113
    .line 114
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 115
    .line 116
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    :goto_2
    if-eqz v1, :cond_6

    .line 121
    .line 122
    iget-object v2, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 123
    .line 124
    iget-object v2, v2, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 125
    .line 126
    invoke-virtual {v2, v10}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_5

    .line 131
    .line 132
    iget-object v2, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 133
    .line 134
    iget-object v3, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 135
    .line 136
    invoke-virtual {v2, v7, v3}, Lcom/google/android/exoplayer2/m0;->q(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/k0;)Lcom/google/android/exoplayer2/k0;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    iput-object v2, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 141
    .line 142
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    goto :goto_2

    .line 147
    :cond_6
    invoke-direct {v8, v10, v13, v14, v0}, Lcom/google/android/exoplayer2/g0;->z0(Lh8/u$a;JZ)J

    .line 148
    .line 149
    .line 150
    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    move-wide v13, v0

    .line 152
    :cond_7
    :goto_3
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 153
    .line 154
    iget-object v4, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 155
    .line 156
    iget-object v5, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 157
    .line 158
    iget-boolean v0, v9, Lcom/google/android/exoplayer2/g0$g;->f:Z

    .line 159
    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    move-wide/from16 v17, v13

    .line 163
    .line 164
    :cond_8
    move-object/from16 v1, p0

    .line 165
    .line 166
    move-object/from16 v2, p1

    .line 167
    .line 168
    move-object v3, v10

    .line 169
    move-object v9, v7

    .line 170
    move-wide/from16 v6, v17

    .line 171
    .line 172
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0;->h1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;J)V

    .line 173
    .line 174
    .line 175
    if-nez v16, :cond_9

    .line 176
    .line 177
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 178
    .line 179
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 180
    .line 181
    cmp-long v0, v11, v0

    .line 182
    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    :cond_9
    move-object/from16 v1, p0

    .line 186
    .line 187
    move-object v2, v10

    .line 188
    move-wide v3, v13

    .line 189
    move-wide v5, v11

    .line 190
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    iput-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 195
    .line 196
    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->n0()V

    .line 197
    .line 198
    .line 199
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 200
    .line 201
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 202
    .line 203
    invoke-direct {v8, v9, v0}, Lcom/google/android/exoplayer2/g0;->r0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 207
    .line 208
    invoke-virtual {v0, v9}, Lcom/google/android/exoplayer2/q0;->j(Lcom/google/android/exoplayer2/Timeline;)Lcom/google/android/exoplayer2/q0;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iput-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 213
    .line 214
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_b

    .line 219
    .line 220
    const/4 v6, 0x0

    .line 221
    iput-object v6, v8, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 222
    .line 223
    :cond_b
    invoke-direct {v8, v15}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :catchall_0
    move-exception v0

    .line 228
    const/4 v6, 0x0

    .line 229
    goto :goto_4

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    move-object v6, v5

    .line 232
    :goto_4
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 233
    .line 234
    iget-object v4, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 235
    .line 236
    iget-object v5, v1, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 237
    .line 238
    iget-boolean v1, v9, Lcom/google/android/exoplayer2/g0$g;->f:Z

    .line 239
    .line 240
    if-eqz v1, :cond_c

    .line 241
    .line 242
    move-wide/from16 v17, v13

    .line 243
    .line 244
    :cond_c
    move-object/from16 v1, p0

    .line 245
    .line 246
    move-object/from16 v2, p1

    .line 247
    .line 248
    move-object v3, v10

    .line 249
    move-object v15, v6

    .line 250
    move-object v9, v7

    .line 251
    move-wide/from16 v6, v17

    .line 252
    .line 253
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0;->h1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;J)V

    .line 254
    .line 255
    .line 256
    if-nez v16, :cond_d

    .line 257
    .line 258
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 259
    .line 260
    iget-wide v1, v1, Lcom/google/android/exoplayer2/q0;->c:J

    .line 261
    .line 262
    cmp-long v1, v11, v1

    .line 263
    .line 264
    if-eqz v1, :cond_e

    .line 265
    .line 266
    :cond_d
    move-object/from16 v1, p0

    .line 267
    .line 268
    move-object v2, v10

    .line 269
    move-wide v3, v13

    .line 270
    move-wide v5, v11

    .line 271
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iput-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 276
    .line 277
    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->n0()V

    .line 278
    .line 279
    .line 280
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 281
    .line 282
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 283
    .line 284
    invoke-direct {v8, v9, v1}, Lcom/google/android/exoplayer2/g0;->r0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 288
    .line 289
    invoke-virtual {v1, v9}, Lcom/google/android/exoplayer2/q0;->j(Lcom/google/android/exoplayer2/Timeline;)Lcom/google/android/exoplayer2/q0;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    iput-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 294
    .line 295
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-nez v1, :cond_f

    .line 300
    .line 301
    iput-object v15, v8, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 302
    .line 303
    :cond_f
    const/4 v1, 0x0

    .line 304
    invoke-direct {v8, v1}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 305
    .line 306
    .line 307
    throw v0
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

.method private F0(Lcom/google/android/exoplayer2/t0;J)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/google/android/exoplayer2/t0;->h()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lq8/m;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lq8/m;

    .line 9
    .line 10
    invoke-virtual {p1, p2, p3}, Lq8/m;->U(J)V

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

.method private G(Lh8/r;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/m0;->u(Lh8/r;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 25
    .line 26
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/j0;->p(FLcom/google/android/exoplayer2/Timeline;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/j0;->n()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/g0;->i1(Lcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-ne p1, v0, :cond_1

    .line 49
    .line 50
    iget-object v0, p1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 51
    .line 52
    iget-wide v0, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 53
    .line 54
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->r()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 61
    .line 62
    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 65
    .line 66
    iget-wide v3, p1, Lcom/google/android/exoplayer2/k0;->b:J

    .line 67
    .line 68
    iget-wide v5, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 69
    .line 70
    move-object v1, p0

    .line 71
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 76
    .line 77
    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Q()V

    .line 78
    .line 79
    .line 80
    return-void
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

.method private G0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->P:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->P:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_1

    .line 14
    .line 15
    aget-object v2, p1, v1

    .line 16
    .line 17
    invoke-static {v2}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    invoke-interface {v2}, Lcom/google/android/exoplayer2/t0;->reset()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-eqz p2, :cond_2

    .line 30
    .line 31
    monitor-enter p0

    .line 32
    const/4 p1, 0x1

    .line 33
    :try_start_0
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1

    .line 44
    :cond_2
    :goto_1
    return-void
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

.method private H(Lcom/google/android/exoplayer2/PlaybackParameters;FZZ)V
    .locals 3

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 6
    .line 7
    const/4 p4, 0x1

    .line 8
    invoke-virtual {p3, p4}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 12
    .line 13
    invoke-virtual {p3, p1}, Lcom/google/android/exoplayer2/q0;->g(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/q0;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    iput-object p3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 18
    .line 19
    :cond_1
    iget p3, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 20
    .line 21
    invoke-direct {p0, p3}, Lcom/google/android/exoplayer2/g0;->l1(F)V

    .line 22
    .line 23
    .line 24
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 25
    .line 26
    array-length p4, p3

    .line 27
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-ge v0, p4, :cond_3

    .line 29
    .line 30
    aget-object v1, p3, v0

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    iget v2, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 35
    .line 36
    invoke-interface {v1, p2, v2}, Lcom/google/android/exoplayer2/t0;->o(FF)V

    .line 37
    .line 38
    .line 39
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
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
.end method

.method private H0(Lcom/google/android/exoplayer2/g0$b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->a(Lcom/google/android/exoplayer2/g0$b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/google/android/exoplayer2/g0$h;

    .line 15
    .line 16
    new-instance v1, Lcom/google/android/exoplayer2/s0;

    .line 17
    .line 18
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->b(Lcom/google/android/exoplayer2/g0$b;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->c(Lcom/google/android/exoplayer2/g0$b;)Lh8/q0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-direct {v1, v2, v3}, Lcom/google/android/exoplayer2/s0;-><init>(Ljava/util/Collection;Lh8/q0;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->a(Lcom/google/android/exoplayer2/g0$b;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->d(Lcom/google/android/exoplayer2/g0$b;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/g0$h;-><init>(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->b(Lcom/google/android/exoplayer2/g0$b;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->c(Lcom/google/android/exoplayer2/g0$b;)Lh8/q0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {v0, v1, p1}, Lcom/google/android/exoplayer2/p0;->C(Ljava/util/List;Lh8/q0;)Lcom/google/android/exoplayer2/Timeline;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

    .line 57
    .line 58
    .line 59
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

.method private I(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V
    .locals 2

    iget v0, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/google/android/exoplayer2/g0;->H(Lcom/google/android/exoplayer2/PlaybackParameters;FZZ)V

    return-void
.end method

.method private J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    move-object v2, p1

    .line 3
    move-wide/from16 v5, p4

    .line 4
    .line 5
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/g0;->W:Z

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 10
    .line 11
    iget-wide v3, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 12
    .line 13
    cmp-long v1, p2, v3

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 31
    :goto_1
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/g0;->W:Z

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->n0()V

    .line 34
    .line 35
    .line 36
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 37
    .line 38
    iget-object v3, v1, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 39
    .line 40
    iget-object v4, v1, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    .line 41
    .line 42
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 43
    .line 44
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 45
    .line 46
    invoke-virtual {v7}, Lcom/google/android/exoplayer2/p0;->s()Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_5

    .line 51
    .line 52
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    sget-object v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->n()Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    :goto_2
    if-nez v1, :cond_3

    .line 68
    .line 69
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->n:La9/n;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    :goto_3
    iget-object v7, v4, La9/n;->c:[La9/h;

    .line 77
    .line 78
    invoke-direct {p0, v7}, Lcom/google/android/exoplayer2/g0;->u([La9/h;)Lbc/i0;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    iget-object v8, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 85
    .line 86
    iget-wide v9, v8, Lcom/google/android/exoplayer2/k0;->c:J

    .line 87
    .line 88
    cmp-long v9, v9, v5

    .line 89
    .line 90
    if-eqz v9, :cond_4

    .line 91
    .line 92
    invoke-virtual {v8, v5, v6}, Lcom/google/android/exoplayer2/k0;->a(J)Lcom/google/android/exoplayer2/k0;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    iput-object v8, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 97
    .line 98
    :cond_4
    move-object v9, v3

    .line 99
    move-object v10, v4

    .line 100
    move-object v11, v7

    .line 101
    goto :goto_4

    .line 102
    :cond_5
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 103
    .line 104
    iget-object v7, v7, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 105
    .line 106
    invoke-virtual {p1, v7}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-nez v7, :cond_6

    .line 111
    .line 112
    sget-object v1, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 113
    .line 114
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->n:La9/n;

    .line 115
    .line 116
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v9, v1

    .line 121
    move-object v10, v3

    .line 122
    move-object v11, v4

    .line 123
    goto :goto_4

    .line 124
    :cond_6
    move-object v11, v1

    .line 125
    move-object v9, v3

    .line 126
    move-object v10, v4

    .line 127
    :goto_4
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 128
    .line 129
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->B()J

    .line 130
    .line 131
    .line 132
    move-result-wide v7

    .line 133
    move-object v2, p1

    .line 134
    move-wide v3, p2

    .line 135
    move-wide/from16 v5, p4

    .line 136
    .line 137
    invoke-virtual/range {v1 .. v11}, Lcom/google/android/exoplayer2/q0;->c(Lh8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    return-object v1
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

.method private J0(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->R:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->R:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 11
    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x4

    .line 15
    if-eq v1, v2, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-interface {p1, v0}, Lf9/m;->h(I)Z

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->d(Z)Lcom/google/android/exoplayer2/q0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 33
    .line 34
    :goto_1
    return-void
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

.method private K()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 15
    .line 16
    array-length v4, v3

    .line 17
    if-ge v1, v4, :cond_3

    .line 18
    .line 19
    aget-object v3, v3, v1

    .line 20
    .line 21
    iget-object v4, v0, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 22
    .line 23
    aget-object v4, v4, v1

    .line 24
    .line 25
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-ne v5, v4, :cond_2

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->g()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    :goto_1
    return v2

    .line 44
    :cond_3
    const/4 v0, 0x1

    .line 45
    return v0
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
.end method

.method private K0(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->J:Z

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->n0()V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eq p1, v0, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->x0(Z)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 30
    .line 31
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
    .line 45
    .line 46
.end method

.method private L()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->k()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-wide/high16 v4, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v0, v2, v4

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/4 v0, 0x1

    .line 23
    return v0
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

.method private static M(Lcom/google/android/exoplayer2/t0;)Z
    .locals 0

    invoke-interface {p0}, Lcom/google/android/exoplayer2/t0;->getState()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private M0(ZIZI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 7
    .line 8
    invoke-virtual {p3, p4}, Lcom/google/android/exoplayer2/g0$e;->c(I)V

    .line 9
    .line 10
    .line 11
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 12
    .line 13
    invoke-virtual {p3, p1, p2}, Lcom/google/android/exoplayer2/q0;->e(ZI)Lcom/google/android/exoplayer2/q0;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->b0(Z)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->f1()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->k1()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 39
    .line 40
    iget p1, p1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 41
    .line 42
    const/4 p2, 0x3

    .line 43
    const/4 p3, 0x2

    .line 44
    if-ne p1, p2, :cond_1

    .line 45
    .line 46
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->c1()V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 50
    .line 51
    invoke-interface {p1, p3}, Lf9/m;->h(I)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-ne p1, p3, :cond_2

    .line 56
    .line 57
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 58
    .line 59
    invoke-interface {p1, p3}, Lf9/m;->h(I)Z

    .line 60
    .line 61
    .line 62
    :cond_2
    :goto_0
    return-void
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
.end method

.method private N()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 8
    .line 9
    iget-wide v1, v1, Lcom/google/android/exoplayer2/k0;->e:J

    .line 10
    .line 11
    iget-boolean v0, v0, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v0, v1, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 25
    .line 26
    iget-wide v3, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 27
    .line 28
    cmp-long v0, v3, v1

    .line 29
    .line 30
    if-ltz v0, :cond_0

    .line 31
    .line 32
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    :cond_0
    const/4 v0, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v0, 0x0

    .line 41
    :goto_0
    return v0
    .line 42
    .line 43
    .line 44
.end method

.method private synthetic O()Ljava/lang/Boolean;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->I:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method private O0(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/h;->f(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0}, Lcom/google/android/exoplayer2/g0;->I(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V

    .line 14
    .line 15
    .line 16
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
    .line 45
    .line 46
.end method

.method private synthetic P(Lcom/google/android/exoplayer2/r0;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->m(Lcom/google/android/exoplayer2/r0;)V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    const-string v0, "ExoPlayerImplInternal"

    .line 7
    .line 8
    const-string v1, "Unexpected error delivering message on external thread."

    .line 9
    .line 10
    invoke-static {v0, v1, p1}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/RuntimeException;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw v0
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

.method private Q()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->X0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->M:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/j0;->d(J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->g1()V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private Q0(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/google/android/exoplayer2/g0;->N:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lcom/google/android/exoplayer2/m0;->F(Lcom/google/android/exoplayer2/Timeline;I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->x0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private R()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->d(Lcom/google/android/exoplayer2/q0;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/google/android/exoplayer2/g0$e;->a(Lcom/google/android/exoplayer2/g0$e;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->A:Lcom/google/android/exoplayer2/g0$f;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/g0$f;->a(Lcom/google/android/exoplayer2/g0$e;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/google/android/exoplayer2/g0$e;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/g0$e;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 31
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

.method private R0(Ld7/w;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->F:Ld7/w;

    return-void
.end method

.method private S(JJ)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->R:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->Q:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/g0;->v0(JJ)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1
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

.method private T(JJ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_e

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Lh8/s;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->W:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-wide/16 v0, 0x1

    .line 26
    .line 27
    sub-long/2addr p1, v0

    .line 28
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->W:Z

    .line 30
    .line 31
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 32
    .line 33
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 36
    .line 37
    iget-object v0, v0, Lh8/s;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v1, p0, Lcom/google/android/exoplayer2/g0;->V:I

    .line 44
    .line 45
    iget-object v2, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/4 v2, 0x0

    .line 56
    if-lez v1, :cond_2

    .line 57
    .line 58
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 59
    .line 60
    add-int/lit8 v4, v1, -0x1

    .line 61
    .line 62
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcom/google/android/exoplayer2/g0$d;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v3, v2

    .line 70
    :goto_0
    if-eqz v3, :cond_4

    .line 71
    .line 72
    iget v4, v3, Lcom/google/android/exoplayer2/g0$d;->l:I

    .line 73
    .line 74
    if-gt v4, v0, :cond_3

    .line 75
    .line 76
    if-ne v4, v0, :cond_4

    .line 77
    .line 78
    iget-wide v3, v3, Lcom/google/android/exoplayer2/g0$d;->m:J

    .line 79
    .line 80
    cmp-long v3, v3, p1

    .line 81
    .line 82
    if-lez v3, :cond_4

    .line 83
    .line 84
    :cond_3
    add-int/lit8 v1, v1, -0x1

    .line 85
    .line 86
    if-lez v1, :cond_2

    .line 87
    .line 88
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 89
    .line 90
    add-int/lit8 v4, v1, -0x1

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Lcom/google/android/exoplayer2/g0$d;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-ge v1, v3, :cond_5

    .line 106
    .line 107
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Lcom/google/android/exoplayer2/g0$d;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_5
    move-object v3, v2

    .line 117
    :goto_1
    if-eqz v3, :cond_7

    .line 118
    .line 119
    iget-object v4, v3, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 120
    .line 121
    if-eqz v4, :cond_7

    .line 122
    .line 123
    iget v4, v3, Lcom/google/android/exoplayer2/g0$d;->l:I

    .line 124
    .line 125
    if-lt v4, v0, :cond_6

    .line 126
    .line 127
    if-ne v4, v0, :cond_7

    .line 128
    .line 129
    iget-wide v4, v3, Lcom/google/android/exoplayer2/g0$d;->m:J

    .line 130
    .line 131
    cmp-long v4, v4, p1

    .line 132
    .line 133
    if-gtz v4, :cond_7

    .line 134
    .line 135
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-ge v1, v3, :cond_5

    .line 144
    .line 145
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    check-cast v3, Lcom/google/android/exoplayer2/g0$d;

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    :goto_2
    if-eqz v3, :cond_d

    .line 155
    .line 156
    iget-object v4, v3, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 157
    .line 158
    if-eqz v4, :cond_d

    .line 159
    .line 160
    iget v4, v3, Lcom/google/android/exoplayer2/g0$d;->l:I

    .line 161
    .line 162
    if-ne v4, v0, :cond_d

    .line 163
    .line 164
    iget-wide v4, v3, Lcom/google/android/exoplayer2/g0$d;->m:J

    .line 165
    .line 166
    cmp-long v6, v4, p1

    .line 167
    .line 168
    if-lez v6, :cond_d

    .line 169
    .line 170
    cmp-long v4, v4, p3

    .line 171
    .line 172
    if-gtz v4, :cond_d

    .line 173
    .line 174
    :try_start_0
    iget-object v4, v3, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 175
    .line 176
    invoke-direct {p0, v4}, Lcom/google/android/exoplayer2/g0;->C0(Lcom/google/android/exoplayer2/r0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    iget-object v4, v3, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 180
    .line 181
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/r0;->b()Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_9

    .line 186
    .line 187
    iget-object v3, v3, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 188
    .line 189
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/r0;->j()Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-eqz v3, :cond_8

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    add-int/lit8 v1, v1, 0x1

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_9
    :goto_3
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    :goto_4
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    if-ge v1, v3, :cond_a

    .line 211
    .line 212
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, Lcom/google/android/exoplayer2/g0$d;

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_a
    move-object v3, v2

    .line 222
    goto :goto_2

    .line 223
    :catchall_0
    move-exception p1

    .line 224
    iget-object p2, v3, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 225
    .line 226
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/r0;->b()Z

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    if-nez p2, :cond_b

    .line 231
    .line 232
    iget-object p2, v3, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 233
    .line 234
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/r0;->j()Z

    .line 235
    .line 236
    .line 237
    move-result p2

    .line 238
    if-eqz p2, :cond_c

    .line 239
    .line 240
    :cond_b
    iget-object p2, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    :cond_c
    throw p1

    .line 246
    :cond_d
    iput v1, p0, Lcom/google/android/exoplayer2/g0;->V:I

    .line 247
    .line 248
    :cond_e
    :goto_5
    return-void
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

.method private T0(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    invoke-virtual {v0, v1, p1}, Lcom/google/android/exoplayer2/m0;->G(Lcom/google/android/exoplayer2/Timeline;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->x0(Z)V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method private U()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/m0;->x(J)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->C()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 17
    .line 18
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 19
    .line 20
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/exoplayer2/m0;->n(JLcom/google/android/exoplayer2/q0;)Lcom/google/android/exoplayer2/k0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 29
    .line 30
    iget-object v5, p0, Lcom/google/android/exoplayer2/g0;->l:[Ld7/t;

    .line 31
    .line 32
    iget-object v6, p0, Lcom/google/android/exoplayer2/g0;->m:La9/m;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 35
    .line 36
    invoke-interface {v1}, Ld7/n;->e()Ld9/b;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    iget-object v8, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 41
    .line 42
    iget-object v10, p0, Lcom/google/android/exoplayer2/g0;->n:La9/n;

    .line 43
    .line 44
    move-object v9, v0

    .line 45
    invoke-virtual/range {v4 .. v10}, Lcom/google/android/exoplayer2/m0;->g([Ld7/t;La9/m;Ld9/b;Lcom/google/android/exoplayer2/p0;Lcom/google/android/exoplayer2/k0;La9/n;)Lcom/google/android/exoplayer2/j0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, v1, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 50
    .line 51
    iget-wide v3, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 52
    .line 53
    invoke-interface {v2, p0, v3, v4}, Lh8/r;->q(Lh8/r$a;J)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_0

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 69
    .line 70
    .line 71
    :cond_0
    const/4 v0, 0x0

    .line 72
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 73
    .line 74
    .line 75
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->M:Z

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->L()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->M:Z

    .line 84
    .line 85
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->g1()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Q()V

    .line 90
    .line 91
    .line 92
    :goto_0
    return-void
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

.method private U0(Lh8/q0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/p0;->D(Lh8/q0;)Lcom/google/android/exoplayer2/Timeline;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

    .line 14
    .line 15
    .line 16
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
    .line 45
    .line 46
.end method

.method private V()V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->W0()Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-eqz v2, :cond_2

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->R()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/m0;->b()Lcom/google/android/exoplayer2/j0;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 27
    .line 28
    iget-object v5, v3, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 29
    .line 30
    iget-wide v6, v3, Lcom/google/android/exoplayer2/k0;->b:J

    .line 31
    .line 32
    iget-wide v8, v3, Lcom/google/android/exoplayer2/k0;->c:J

    .line 33
    .line 34
    move-object v4, p0

    .line 35
    invoke-direct/range {v4 .. v9}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iput-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 40
    .line 41
    iget-object v3, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 42
    .line 43
    iget-boolean v3, v3, Lcom/google/android/exoplayer2/k0;->f:Z

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    move v3, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v3, 0x3

    .line 50
    :goto_1
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 51
    .line 52
    invoke-virtual {v4, v3}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 56
    .line 57
    iget-object v7, v3, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 60
    .line 61
    iget-object v6, v2, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 62
    .line 63
    iget-object v1, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 64
    .line 65
    iget-object v8, v1, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 66
    .line 67
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    move-object v4, p0

    .line 73
    move-object v5, v7

    .line 74
    invoke-direct/range {v4 .. v10}, Lcom/google/android/exoplayer2/g0;->h1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;J)V

    .line 75
    .line 76
    .line 77
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->n0()V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->k1()V

    .line 81
    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    goto :goto_0

    .line 85
    :cond_2
    return-void
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

.method private V0(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 4
    .line 5
    if-eq v1, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

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

.method private W()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    if-eqz v1, :cond_9

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->K()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-boolean v1, v1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    .line 43
    iget-wide v5, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 50
    .line 51
    .line 52
    move-result-wide v7

    .line 53
    cmp-long v1, v5, v7

    .line 54
    .line 55
    if-gez v1, :cond_3

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->c()Lcom/google/android/exoplayer2/j0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    iget-boolean v6, v1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 73
    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    iget-object v6, v1, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 77
    .line 78
    invoke-interface {v6}, Lh8/r;->n()J

    .line 79
    .line 80
    .line 81
    move-result-wide v6

    .line 82
    cmp-long v2, v6, v2

    .line 83
    .line 84
    if-eqz v2, :cond_4

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    invoke-direct {p0, v0, v1}, Lcom/google/android/exoplayer2/g0;->E0(J)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    move v2, v4

    .line 95
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 96
    .line 97
    array-length v3, v3

    .line 98
    if-ge v2, v3, :cond_8

    .line 99
    .line 100
    invoke-virtual {v0, v2}, La9/n;->c(I)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-virtual {v5, v2}, La9/n;->c(I)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-eqz v3, :cond_7

    .line 109
    .line 110
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 111
    .line 112
    aget-object v3, v3, v2

    .line 113
    .line 114
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->k()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_7

    .line 119
    .line 120
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->l:[Ld7/t;

    .line 121
    .line 122
    aget-object v3, v3, v2

    .line 123
    .line 124
    invoke-interface {v3}, Ld7/t;->d()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    const/4 v7, 0x7

    .line 129
    if-ne v3, v7, :cond_5

    .line 130
    .line 131
    const/4 v3, 0x1

    .line 132
    goto :goto_1

    .line 133
    :cond_5
    move v3, v4

    .line 134
    :goto_1
    iget-object v7, v0, La9/n;->b:[Ld7/u;

    .line 135
    .line 136
    aget-object v7, v7, v2

    .line 137
    .line 138
    iget-object v8, v5, La9/n;->b:[Ld7/u;

    .line 139
    .line 140
    aget-object v8, v8, v2

    .line 141
    .line 142
    if-eqz v6, :cond_6

    .line 143
    .line 144
    invoke-virtual {v8, v7}, Ld7/u;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_6

    .line 149
    .line 150
    if-eqz v3, :cond_7

    .line 151
    .line 152
    :cond_6
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 153
    .line 154
    aget-object v3, v3, v2

    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 157
    .line 158
    .line 159
    move-result-wide v6

    .line 160
    invoke-direct {p0, v3, v6, v7}, Lcom/google/android/exoplayer2/g0;->F0(Lcom/google/android/exoplayer2/t0;J)V

    .line 161
    .line 162
    .line 163
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_8
    return-void

    .line 167
    :cond_9
    :goto_2
    iget-object v1, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 168
    .line 169
    iget-boolean v1, v1, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 170
    .line 171
    if-nez v1, :cond_a

    .line 172
    .line 173
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 174
    .line 175
    if-eqz v1, :cond_d

    .line 176
    .line 177
    :cond_a
    :goto_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 178
    .line 179
    array-length v5, v1

    .line 180
    if-ge v4, v5, :cond_d

    .line 181
    .line 182
    aget-object v1, v1, v4

    .line 183
    .line 184
    iget-object v5, v0, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 185
    .line 186
    aget-object v5, v5, v4

    .line 187
    .line 188
    if-eqz v5, :cond_c

    .line 189
    .line 190
    invoke-interface {v1}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    if-ne v6, v5, :cond_c

    .line 195
    .line 196
    invoke-interface {v1}, Lcom/google/android/exoplayer2/t0;->g()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_c

    .line 201
    .line 202
    iget-object v5, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 203
    .line 204
    iget-wide v5, v5, Lcom/google/android/exoplayer2/k0;->e:J

    .line 205
    .line 206
    cmp-long v7, v5, v2

    .line 207
    .line 208
    if-eqz v7, :cond_b

    .line 209
    .line 210
    const-wide/high16 v7, -0x8000000000000000L

    .line 211
    .line 212
    cmp-long v5, v5, v7

    .line 213
    .line 214
    if-eqz v5, :cond_b

    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->l()J

    .line 217
    .line 218
    .line 219
    move-result-wide v5

    .line 220
    iget-object v7, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 221
    .line 222
    iget-wide v7, v7, Lcom/google/android/exoplayer2/k0;->e:J

    .line 223
    .line 224
    add-long/2addr v5, v7

    .line 225
    goto :goto_4

    .line 226
    :cond_b
    move-wide v5, v2

    .line 227
    :goto_4
    invoke-direct {p0, v1, v5, v6}, Lcom/google/android/exoplayer2/g0;->F0(Lcom/google/android/exoplayer2/t0;J)V

    .line 228
    .line 229
    .line 230
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_d
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
.end method

.method private W0()Z
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    return v1

    .line 23
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-wide v2, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 32
    .line 33
    .line 34
    move-result-wide v4

    .line 35
    cmp-long v2, v2, v4

    .line 36
    .line 37
    if-ltz v2, :cond_3

    .line 38
    .line 39
    iget-boolean v0, v0, Lcom/google/android/exoplayer2/j0;->g:Z

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    :cond_3
    return v1
.end method

.method private X()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, v0, :cond_1

    .line 16
    .line 17
    iget-boolean v0, v0, Lcom/google/android/exoplayer2/j0;->g:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->k0()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->r()V

    .line 29
    .line 30
    .line 31
    :cond_1
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

.method private X0()Z
    .locals 9

    .line 1
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->k()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-direct {p0, v1, v2}, Lcom/google/android/exoplayer2/g0;->C(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v6

    .line 23
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/j0;->y(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    move-wide v4, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/j0;->y(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    iget-object v0, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 46
    .line 47
    iget-wide v3, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 48
    .line 49
    sub-long/2addr v1, v3

    .line 50
    move-wide v4, v1

    .line 51
    :goto_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v8, v0, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 60
    .line 61
    invoke-interface/range {v3 .. v8}, Ld7/n;->i(JJF)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    return v0
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

.method private Y()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/p0;->i()Lcom/google/android/exoplayer2/Timeline;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

    return-void
.end method

.method private Y0()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    if-eqz v1, :cond_0

    iget v0, v0, Lcom/google/android/exoplayer2/q0;->l:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private Z(Lcom/google/android/exoplayer2/g0$c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 8
    .line 9
    iget v1, p1, Lcom/google/android/exoplayer2/g0$c;->a:I

    .line 10
    .line 11
    iget v2, p1, Lcom/google/android/exoplayer2/g0$c;->b:I

    .line 12
    .line 13
    iget v3, p1, Lcom/google/android/exoplayer2/g0$c;->c:I

    .line 14
    .line 15
    iget-object p1, p1, Lcom/google/android/exoplayer2/g0$c;->d:Lh8/q0;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/exoplayer2/p0;->v(IIILh8/q0;)Lcom/google/android/exoplayer2/Timeline;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

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

.method private Z0(Z)Z
    .locals 12

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->N()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    return v0

    .line 14
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 15
    .line 16
    iget-boolean v1, p1, Lcom/google/android/exoplayer2/q0;->f:Z

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object p1, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 31
    .line 32
    iget-object v1, v1, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 33
    .line 34
    invoke-direct {p0, p1, v1}, Lcom/google/android/exoplayer2/g0;->a1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 41
    .line 42
    invoke-interface {p1}, Lcom/google/android/exoplayer2/h0;->c()J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    :goto_0
    move-wide v10, v3

    .line 53
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/j0;->q()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget-object v1, p1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 66
    .line 67
    iget-boolean v1, v1, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 68
    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    move v1, v2

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move v1, v0

    .line 74
    :goto_1
    iget-object v3, p1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 75
    .line 76
    iget-object v3, v3, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 77
    .line 78
    invoke-virtual {v3}, Lh8/s;->b()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    iget-boolean p1, p1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 85
    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    move p1, v2

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    move p1, v0

    .line 91
    :goto_2
    if-nez v1, :cond_6

    .line 92
    .line 93
    if-nez p1, :cond_6

    .line 94
    .line 95
    iget-object v5, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 96
    .line 97
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->B()J

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget v8, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 108
    .line 109
    iget-boolean v9, p0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 110
    .line 111
    invoke-interface/range {v5 .. v11}, Ld7/n;->d(JFZJ)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_7

    .line 116
    .line 117
    :cond_6
    move v0, v2

    .line 118
    :cond_7
    return v0
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

.method private a0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La9/n;->c:[La9/h;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, La9/h;->i()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
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

.method private a1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;)Z
    .locals 4

    .line 1
    invoke-virtual {p2}, Lh8/s;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p2, p2, Lh8/s;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 18
    .line 19
    invoke-virtual {p1, p2, v0}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$c;->f()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 39
    .line 40
    iget-boolean p2, p1, Lcom/google/android/exoplayer2/Timeline$c;->i:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-wide p1, p1, Lcom/google/android/exoplayer2/Timeline$c;->f:J

    .line 45
    .line 46
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    cmp-long p1, p1, v2

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    :cond_1
    :goto_0
    return v1
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

.method private b0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La9/n;->c:[La9/h;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, La9/h;->m(Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
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

.method private static b1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline$b;Lcom/google/android/exoplayer2/Timeline$c;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 4
    .line 5
    invoke-virtual {v0}, Lh8/s;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-object v0, v0, Lh8/s;->a:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-boolean p0, p0, Lcom/google/android/exoplayer2/Timeline$c;->l:Z

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 37
    :goto_1
    return p0
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

.method private c0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La9/n;->c:[La9/h;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4}, La9/h;->r()V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
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

.method private c1()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/h;->g()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    :goto_0
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    aget-object v3, v1, v0

    .line 15
    .line 16
    invoke-static {v3}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-interface {v3}, Lcom/google/android/exoplayer2/t0;->start()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
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
.end method

.method public static synthetic e(Lcom/google/android/exoplayer2/g0;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->O()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private e1(ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->P:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p1, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move p1, v1

    .line 13
    :goto_1
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/google/android/exoplayer2/g0;->m0(ZZZZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 22
    .line 23
    invoke-interface {p1}, Ld7/n;->f()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 27
    .line 28
    .line 29
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

.method public static synthetic f(Lcom/google/android/exoplayer2/g0;Lcom/google/android/exoplayer2/r0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->P(Lcom/google/android/exoplayer2/r0;)V

    return-void
.end method

.method private f0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0, v0, v1}, Lcom/google/android/exoplayer2/g0;->m0(ZZZZ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 12
    .line 13
    invoke-interface {v0}, Ld7/n;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x2

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v1

    .line 30
    :goto_0
    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 34
    .line 35
    iget-object v2, p0, Lcom/google/android/exoplayer2/g0;->p:Ld9/e;

    .line 36
    .line 37
    invoke-interface {v2}, Ld9/e;->c()Ld9/x;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Lcom/google/android/exoplayer2/p0;->w(Ld9/x;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 45
    .line 46
    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    .line 47
    .line 48
    .line 49
    return-void
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
.end method

.method private f1()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/h;->h()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 7
    .line 8
    array-length v1, v0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_1

    .line 11
    .line 12
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-static {v3}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, v3}, Lcom/google/android/exoplayer2/g0;->t(Lcom/google/android/exoplayer2/t0;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
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
.end method

.method static synthetic g(Lcom/google/android/exoplayer2/g0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/exoplayer2/g0;->Q:Z

    return p1
.end method

.method private g1()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, Lcom/google/android/exoplayer2/g0;->M:Z

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 14
    .line 15
    invoke-interface {v0}, Lh8/r;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    :goto_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 26
    .line 27
    iget-boolean v2, v1, Lcom/google/android/exoplayer2/q0;->f:Z

    .line 28
    .line 29
    if-eq v0, v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/q0;->a(Z)Lcom/google/android/exoplayer2/q0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 36
    .line 37
    :cond_2
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method static synthetic h(Lcom/google/android/exoplayer2/g0;)Lf9/m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    return-object p0
.end method

.method private h0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-direct {p0, v1, v0, v1, v0}, Lcom/google/android/exoplayer2/g0;->m0(ZZZZ)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    .line 7
    .line 8
    invoke-interface {v0}, Ld7/n;->h()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->r:Landroid/os/HandlerThread;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 17
    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/g0;->I:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v0
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

.method private h1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;J)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/g0;->a1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_2

    .line 14
    :cond_0
    iget-object v0, p2, Lh8/s;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 32
    .line 33
    iget-object v1, v1, Lcom/google/android/exoplayer2/Timeline$c;->k:Lcom/google/android/exoplayer2/MediaItem$f;

    .line 34
    .line 35
    invoke-static {v1}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/google/android/exoplayer2/MediaItem$f;

    .line 40
    .line 41
    invoke-interface {v0, v1}, Lcom/google/android/exoplayer2/h0;->a(Lcom/google/android/exoplayer2/MediaItem$f;)V

    .line 42
    .line 43
    .line 44
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    cmp-long v2, p5, v0

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    iget-object p3, p0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 54
    .line 55
    iget-object p2, p2, Lh8/s;->a:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-direct {p0, p1, p2, p5, p6}, Lcom/google/android/exoplayer2/g0;->x(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    invoke-interface {p3, p1, p2}, Lcom/google/android/exoplayer2/h0;->e(J)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/google/android/exoplayer2/Timeline$c;->a:Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {p3}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_2

    .line 74
    .line 75
    iget-object p2, p4, Lh8/s;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object p4, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 78
    .line 79
    invoke-virtual {p3, p2, p4}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 84
    .line 85
    iget-object p4, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 86
    .line 87
    invoke-virtual {p3, p2, p4}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    iget-object p2, p2, Lcom/google/android/exoplayer2/Timeline$c;->a:Ljava/lang/Object;

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_2
    const/4 p2, 0x0

    .line 95
    :goto_0
    invoke-static {p2, p1}, Lf9/q0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_3

    .line 100
    .line 101
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 102
    .line 103
    invoke-interface {p1, v0, v1}, Lcom/google/android/exoplayer2/h0;->e(J)V

    .line 104
    .line 105
    .line 106
    :cond_3
    :goto_1
    return-void

    .line 107
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iget p1, p1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 114
    .line 115
    iget-object p2, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 116
    .line 117
    iget-object p2, p2, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 118
    .line 119
    iget p3, p2, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 120
    .line 121
    cmpl-float p1, p1, p3

    .line 122
    .line 123
    if-eqz p1, :cond_5

    .line 124
    .line 125
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/h;->f(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    return-void
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
.end method

.method private i0(IILh8/q0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/exoplayer2/p0;->A(IILh8/q0;)Lcom/google/android/exoplayer2/Timeline;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

    .line 14
    .line 15
    .line 16
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

.method private i1(Lcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->o:Ld7/n;

    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    iget-object p2, p2, La9/n;->c:[La9/h;

    invoke-interface {v0, v1, p1, p2}, Ld7/n;->g([Lcom/google/android/exoplayer2/t0;Lcom/google/android/exoplayer2/source/TrackGroupArray;[La9/h;)V

    return-void
.end method

.method private j1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/p0;->s()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->U()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->W()V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->X()V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->V()V

    .line 30
    .line 31
    .line 32
    :cond_1
    :goto_0
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

.method private k(Lcom/google/android/exoplayer2/g0$b;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne p2, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/p0;->q()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    :cond_0
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->b(Lcom/google/android/exoplayer2/g0$b;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0$b;->c(Lcom/google/android/exoplayer2/g0$b;)Lh8/q0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p2, v1, p1}, Lcom/google/android/exoplayer2/p0;->f(ILjava/util/List;Lh8/q0;)Lcom/google/android/exoplayer2/Timeline;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->F(Lcom/google/android/exoplayer2/Timeline;)V

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

.method private k0()Z
    .locals 15

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    move v4, v3

    .line 14
    :goto_0
    iget-object v5, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 15
    .line 16
    array-length v6, v5

    .line 17
    const/4 v7, 0x1

    .line 18
    if-ge v3, v6, :cond_5

    .line 19
    .line 20
    aget-object v8, v5, v3

    .line 21
    .line 22
    invoke-static {v8}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-interface {v8}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v0, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 34
    .line 35
    aget-object v6, v6, v3

    .line 36
    .line 37
    if-eq v5, v6, :cond_1

    .line 38
    .line 39
    move v5, v7

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v5, v2

    .line 42
    :goto_1
    invoke-virtual {v1, v3}, La9/n;->c(I)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-nez v5, :cond_2

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-interface {v8}, Lcom/google/android/exoplayer2/t0;->k()Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-nez v5, :cond_3

    .line 56
    .line 57
    iget-object v5, v1, La9/n;->c:[La9/h;

    .line 58
    .line 59
    aget-object v5, v5, v3

    .line 60
    .line 61
    invoke-static {v5}, Lcom/google/android/exoplayer2/g0;->w(La9/h;)[Ld7/k;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    iget-object v5, v0, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 66
    .line 67
    aget-object v10, v5, v3

    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 70
    .line 71
    .line 72
    move-result-wide v11

    .line 73
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->l()J

    .line 74
    .line 75
    .line 76
    move-result-wide v13

    .line 77
    invoke-interface/range {v8 .. v14}, Lcom/google/android/exoplayer2/t0;->l([Ld7/k;Lh8/o0;JJ)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-interface {v8}, Lcom/google/android/exoplayer2/t0;->c()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    invoke-direct {p0, v8}, Lcom/google/android/exoplayer2/g0;->n(Lcom/google/android/exoplayer2/t0;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_4
    move v4, v7

    .line 92
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    xor-int/lit8 v0, v4, 0x1

    .line 96
    .line 97
    return v0
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

.method private k1()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 11
    .line 12
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 20
    .line 21
    invoke-interface {v1}, Lh8/r;->n()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    move-wide v8, v4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-wide v8, v2

    .line 28
    :goto_0
    cmp-long v1, v8, v2

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-direct {p0, v8, v9}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 37
    .line 38
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 39
    .line 40
    cmp-long v0, v8, v0

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 45
    .line 46
    iget-object v7, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 47
    .line 48
    iget-wide v10, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 49
    .line 50
    move-object v6, p0

    .line 51
    invoke-direct/range {v6 .. v11}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 56
    .line 57
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 58
    .line 59
    const/4 v1, 0x4

    .line 60
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 65
    .line 66
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 67
    .line 68
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eq v0, v3, :cond_3

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    goto :goto_1

    .line 76
    :cond_3
    move v3, v2

    .line 77
    :goto_1
    invoke-virtual {v1, v3}, Lcom/google/android/exoplayer2/h;->i(Z)J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    iput-wide v3, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 82
    .line 83
    invoke-virtual {v0, v3, v4}, Lcom/google/android/exoplayer2/j0;->y(J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v0

    .line 87
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 88
    .line 89
    iget-wide v3, v3, Lcom/google/android/exoplayer2/q0;->r:J

    .line 90
    .line 91
    invoke-direct {p0, v3, v4, v0, v1}, Lcom/google/android/exoplayer2/g0;->T(JJ)V

    .line 92
    .line 93
    .line 94
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 95
    .line 96
    iput-wide v0, v3, Lcom/google/android/exoplayer2/q0;->r:J

    .line 97
    .line 98
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->j()Lcom/google/android/exoplayer2/j0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->i()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    iput-wide v3, v1, Lcom/google/android/exoplayer2/q0;->p:J

    .line 111
    .line 112
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 113
    .line 114
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->B()J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    iput-wide v3, v0, Lcom/google/android/exoplayer2/q0;->q:J

    .line 119
    .line 120
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 121
    .line 122
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 123
    .line 124
    if-eqz v1, :cond_5

    .line 125
    .line 126
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 127
    .line 128
    const/4 v3, 0x3

    .line 129
    if-ne v1, v3, :cond_5

    .line 130
    .line 131
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 132
    .line 133
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 134
    .line 135
    invoke-direct {p0, v1, v0}, Lcom/google/android/exoplayer2/g0;->a1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 142
    .line 143
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 144
    .line 145
    iget v0, v0, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 146
    .line 147
    const/high16 v1, 0x3f800000    # 1.0f

    .line 148
    .line 149
    cmpl-float v0, v0, v1

    .line 150
    .line 151
    if-nez v0, :cond_5

    .line 152
    .line 153
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 154
    .line 155
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->v()J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->B()J

    .line 160
    .line 161
    .line 162
    move-result-wide v5

    .line 163
    invoke-interface {v0, v3, v4, v5, v6}, Lcom/google/android/exoplayer2/h0;->b(JJ)F

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iget v1, v1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 174
    .line 175
    cmpl-float v1, v1, v0

    .line 176
    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 180
    .line 181
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 182
    .line 183
    iget-object v3, v3, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 184
    .line 185
    invoke-virtual {v3, v0}, Lcom/google/android/exoplayer2/PlaybackParameters;->b(F)Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/h;->f(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 193
    .line 194
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 195
    .line 196
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 197
    .line 198
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget v1, v1, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 203
    .line 204
    invoke-direct {p0, v0, v1, v2, v2}, Lcom/google/android/exoplayer2/g0;->H(Lcom/google/android/exoplayer2/PlaybackParameters;FZZ)V

    .line 205
    .line 206
    .line 207
    :cond_5
    return-void
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

.method private l(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->k:I

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lf9/a;->a(Z)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-direct {p0, v1}, Lcom/google/android/exoplayer2/g0;->x0(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catch_0
    move-exception v0

    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    throw p1
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

.method private l0()V
    .locals 16

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/h;->b()Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Lcom/google/android/exoplayer2/PlaybackParameters;->a:F

    .line 10
    .line 11
    iget-object v1, v6, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v6, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const/4 v7, 0x1

    .line 24
    move v3, v7

    .line 25
    :goto_0
    if-eqz v1, :cond_a

    .line 26
    .line 27
    iget-boolean v4, v1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    goto/16 :goto_4

    .line 32
    .line 33
    :cond_0
    iget-object v4, v6, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 34
    .line 35
    iget-object v4, v4, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 36
    .line 37
    invoke-virtual {v1, v0, v4}, Lcom/google/android/exoplayer2/j0;->v(FLcom/google/android/exoplayer2/Timeline;)La9/n;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v9, v4}, La9/n;->a(La9/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v14, 0x0

    .line 50
    if-nez v4, :cond_8

    .line 51
    .line 52
    const/4 v15, 0x4

    .line 53
    if-eqz v3, :cond_5

    .line 54
    .line 55
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 62
    .line 63
    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/m0;->y(Lcom/google/android/exoplayer2/j0;)Z

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 68
    .line 69
    array-length v0, v0

    .line 70
    new-array v5, v0, [Z

    .line 71
    .line 72
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 73
    .line 74
    iget-wide v10, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 75
    .line 76
    move-object v8, v4

    .line 77
    move-object v13, v5

    .line 78
    invoke-virtual/range {v8 .. v13}, Lcom/google/android/exoplayer2/j0;->b(La9/n;JZ[Z)J

    .line 79
    .line 80
    .line 81
    move-result-wide v8

    .line 82
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 83
    .line 84
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 85
    .line 86
    iget-wide v10, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 87
    .line 88
    move-object/from16 v0, p0

    .line 89
    .line 90
    move-wide v2, v8

    .line 91
    move-object v12, v4

    .line 92
    move-wide v4, v10

    .line 93
    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, v6, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 98
    .line 99
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 100
    .line 101
    if-eq v1, v15, :cond_1

    .line 102
    .line 103
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 104
    .line 105
    cmp-long v0, v8, v0

    .line 106
    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 110
    .line 111
    invoke-virtual {v0, v15}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {v6, v8, v9}, Lcom/google/android/exoplayer2/g0;->o0(J)V

    .line 115
    .line 116
    .line 117
    :cond_1
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 118
    .line 119
    array-length v0, v0

    .line 120
    new-array v0, v0, [Z

    .line 121
    .line 122
    :goto_1
    iget-object v1, v6, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 123
    .line 124
    array-length v2, v1

    .line 125
    if-ge v14, v2, :cond_4

    .line 126
    .line 127
    aget-object v1, v1, v14

    .line 128
    .line 129
    invoke-static {v1}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    aput-boolean v2, v0, v14

    .line 134
    .line 135
    iget-object v3, v12, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 136
    .line 137
    aget-object v3, v3, v14

    .line 138
    .line 139
    if-eqz v2, :cond_3

    .line 140
    .line 141
    invoke-interface {v1}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eq v3, v2, :cond_2

    .line 146
    .line 147
    invoke-direct {v6, v1}, Lcom/google/android/exoplayer2/g0;->n(Lcom/google/android/exoplayer2/t0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_2
    aget-boolean v2, v13, v14

    .line 152
    .line 153
    if-eqz v2, :cond_3

    .line 154
    .line 155
    iget-wide v2, v6, Lcom/google/android/exoplayer2/g0;->U:J

    .line 156
    .line 157
    invoke-interface {v1, v2, v3}, Lcom/google/android/exoplayer2/t0;->u(J)V

    .line 158
    .line 159
    .line 160
    :cond_3
    :goto_2
    add-int/lit8 v14, v14, 0x1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_4
    invoke-direct {v6, v0}, Lcom/google/android/exoplayer2/g0;->s([Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_5
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/m0;->y(Lcom/google/android/exoplayer2/j0;)Z

    .line 170
    .line 171
    .line 172
    iget-boolean v0, v1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 173
    .line 174
    if-eqz v0, :cond_6

    .line 175
    .line 176
    iget-object v0, v1, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 177
    .line 178
    iget-wide v2, v0, Lcom/google/android/exoplayer2/k0;->b:J

    .line 179
    .line 180
    iget-wide v4, v6, Lcom/google/android/exoplayer2/g0;->U:J

    .line 181
    .line 182
    invoke-virtual {v1, v4, v5}, Lcom/google/android/exoplayer2/j0;->y(J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v4

    .line 186
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 187
    .line 188
    .line 189
    move-result-wide v2

    .line 190
    invoke-virtual {v1, v9, v2, v3, v14}, Lcom/google/android/exoplayer2/j0;->a(La9/n;JZ)J

    .line 191
    .line 192
    .line 193
    :cond_6
    :goto_3
    invoke-direct {v6, v7}, Lcom/google/android/exoplayer2/g0;->E(Z)V

    .line 194
    .line 195
    .line 196
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 197
    .line 198
    iget v0, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 199
    .line 200
    if-eq v0, v15, :cond_7

    .line 201
    .line 202
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->Q()V

    .line 203
    .line 204
    .line 205
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->k1()V

    .line 206
    .line 207
    .line 208
    iget-object v0, v6, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 209
    .line 210
    const/4 v1, 0x2

    .line 211
    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    .line 212
    .line 213
    .line 214
    :cond_7
    return-void

    .line 215
    :cond_8
    if-ne v1, v2, :cond_9

    .line 216
    .line 217
    move v3, v14

    .line 218
    :cond_9
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_a
    :goto_4
    return-void
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

.method private l1(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La9/n;->c:[La9/h;

    .line 14
    .line 15
    array-length v2, v1

    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_1
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    aget-object v4, v1, v3

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-interface {v4, p1}, La9/h;->g(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->j()Lcom/google/android/exoplayer2/j0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return-void
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

.method private m(Lcom/google/android/exoplayer2/r0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->j()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->f()Lcom/google/android/exoplayer2/r0$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->h()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/r0;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v1, v2, v3}, Lcom/google/android/exoplayer2/r0$b;->i(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/r0;->k(Z)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/r0;->k(Z)V

    .line 30
    .line 31
    .line 32
    throw v1
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

.method private m0(ZZZZ)V
    .locals 32

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-interface {v0, v2}, Lf9/m;->j(I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput-boolean v2, v1, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 11
    .line 12
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/h;->h()V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    iput-wide v3, v1, Lcom/google/android/exoplayer2/g0;->U:J

    .line 20
    .line 21
    iget-object v3, v1, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    move v5, v2

    .line 25
    :goto_0
    const-string v6, "ExoPlayerImplInternal"

    .line 26
    .line 27
    if-ge v5, v4, :cond_0

    .line 28
    .line 29
    aget-object v0, v3, v5

    .line 30
    .line 31
    :try_start_0
    invoke-direct {v1, v0}, Lcom/google/android/exoplayer2/g0;->n(Lcom/google/android/exoplayer2/t0;)V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :catch_1
    move-exception v0

    .line 38
    :goto_1
    const-string v7, "Disable failed."

    .line 39
    .line 40
    invoke-static {v6, v7, v0}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object v3, v1, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 49
    .line 50
    array-length v4, v3

    .line 51
    move v5, v2

    .line 52
    :goto_3
    if-ge v5, v4, :cond_1

    .line 53
    .line 54
    aget-object v0, v3, v5

    .line 55
    .line 56
    :try_start_1
    invoke-interface {v0}, Lcom/google/android/exoplayer2/t0;->reset()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :catch_2
    move-exception v0

    .line 61
    move-object v7, v0

    .line 62
    const-string v0, "Reset failed."

    .line 63
    .line 64
    invoke-static {v6, v0, v7}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_1
    iput v2, v1, Lcom/google/android/exoplayer2/g0;->S:I

    .line 71
    .line 72
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 73
    .line 74
    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 75
    .line 76
    iget-wide v4, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 77
    .line 78
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 79
    .line 80
    iget-object v6, v1, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 81
    .line 82
    iget-object v7, v1, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 83
    .line 84
    invoke-static {v0, v6, v7}, Lcom/google/android/exoplayer2/g0;->b1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline$b;Lcom/google/android/exoplayer2/Timeline$c;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 91
    .line 92
    iget-wide v6, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_2
    iget-object v0, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 96
    .line 97
    iget-wide v6, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 98
    .line 99
    :goto_5
    const/4 v0, 0x0

    .line 100
    if-eqz p2, :cond_4

    .line 101
    .line 102
    iput-object v0, v1, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 103
    .line 104
    iget-object v3, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 105
    .line 106
    iget-object v3, v3, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 107
    .line 108
    invoke-direct {v1, v3}, Lcom/google/android/exoplayer2/g0;->z(Lcom/google/android/exoplayer2/Timeline;)Landroid/util/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    iget-object v4, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Lh8/u$a;

    .line 115
    .line 116
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, Ljava/lang/Long;

    .line 119
    .line 120
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v5

    .line 124
    iget-object v3, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 125
    .line 126
    iget-object v3, v3, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 127
    .line 128
    invoke-virtual {v4, v3}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    if-nez v3, :cond_3

    .line 138
    .line 139
    const/4 v3, 0x1

    .line 140
    goto :goto_6

    .line 141
    :cond_3
    move v3, v2

    .line 142
    :goto_6
    move-object/from16 v20, v4

    .line 143
    .line 144
    move-wide/from16 v28, v5

    .line 145
    .line 146
    move-wide v12, v7

    .line 147
    goto :goto_7

    .line 148
    :cond_4
    move-object/from16 v20, v3

    .line 149
    .line 150
    move-wide/from16 v28, v4

    .line 151
    .line 152
    move-wide v12, v6

    .line 153
    move v3, v2

    .line 154
    :goto_7
    iget-object v4, v1, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 155
    .line 156
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/m0;->f()V

    .line 157
    .line 158
    .line 159
    iput-boolean v2, v1, Lcom/google/android/exoplayer2/g0;->M:Z

    .line 160
    .line 161
    new-instance v2, Lcom/google/android/exoplayer2/q0;

    .line 162
    .line 163
    iget-object v4, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 164
    .line 165
    iget-object v10, v4, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 166
    .line 167
    iget v14, v4, Lcom/google/android/exoplayer2/q0;->d:I

    .line 168
    .line 169
    if-eqz p4, :cond_5

    .line 170
    .line 171
    move-object v15, v0

    .line 172
    goto :goto_8

    .line 173
    :cond_5
    iget-object v5, v4, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 174
    .line 175
    move-object v15, v5

    .line 176
    :goto_8
    const/16 v16, 0x0

    .line 177
    .line 178
    if-eqz v3, :cond_6

    .line 179
    .line 180
    sget-object v5, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_6
    iget-object v5, v4, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 184
    .line 185
    :goto_9
    move-object/from16 v17, v5

    .line 186
    .line 187
    if-eqz v3, :cond_7

    .line 188
    .line 189
    iget-object v5, v1, Lcom/google/android/exoplayer2/g0;->n:La9/n;

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_7
    iget-object v5, v4, Lcom/google/android/exoplayer2/q0;->h:La9/n;

    .line 193
    .line 194
    :goto_a
    move-object/from16 v18, v5

    .line 195
    .line 196
    if-eqz v3, :cond_8

    .line 197
    .line 198
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    goto :goto_b

    .line 203
    :cond_8
    iget-object v3, v4, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 204
    .line 205
    :goto_b
    move-object/from16 v19, v3

    .line 206
    .line 207
    iget-object v3, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 208
    .line 209
    iget-boolean v4, v3, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 210
    .line 211
    move/from16 v21, v4

    .line 212
    .line 213
    iget v4, v3, Lcom/google/android/exoplayer2/q0;->l:I

    .line 214
    .line 215
    move/from16 v22, v4

    .line 216
    .line 217
    iget-object v3, v3, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 218
    .line 219
    move-object/from16 v23, v3

    .line 220
    .line 221
    const-wide/16 v26, 0x0

    .line 222
    .line 223
    iget-boolean v3, v1, Lcom/google/android/exoplayer2/g0;->R:Z

    .line 224
    .line 225
    move/from16 v30, v3

    .line 226
    .line 227
    const/16 v31, 0x0

    .line 228
    .line 229
    move-object v9, v2

    .line 230
    move-object/from16 v11, v20

    .line 231
    .line 232
    move-wide/from16 v24, v28

    .line 233
    .line 234
    invoke-direct/range {v9 .. v31}, Lcom/google/android/exoplayer2/q0;-><init>(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;JILcom/google/android/exoplayer2/ExoPlaybackException;ZLcom/google/android/exoplayer2/source/TrackGroupArray;La9/n;Ljava/util/List;Lh8/u$a;ZILcom/google/android/exoplayer2/PlaybackParameters;JJJZZ)V

    .line 235
    .line 236
    .line 237
    iput-object v2, v1, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 238
    .line 239
    if-eqz p3, :cond_9

    .line 240
    .line 241
    iget-object v2, v1, Lcom/google/android/exoplayer2/g0;->C:Lcom/google/android/exoplayer2/p0;

    .line 242
    .line 243
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/p0;->y()V

    .line 244
    .line 245
    .line 246
    :cond_9
    iput-object v0, v1, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 247
    .line 248
    return-void
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
.end method

.method private declared-synchronized m1(Lac/n;J)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lac/n<",
            "Ljava/lang/Boolean;",
            ">;J)V"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->z:Lf9/c;

    .line 3
    .line 4
    invoke-interface {v0}, Lf9/c;->b()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    add-long/2addr v0, p2

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    invoke-interface {p1}, Lac/n;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v3, p2, v3

    .line 25
    .line 26
    if-lez v3, :cond_0

    .line 27
    .line 28
    :try_start_1
    invoke-virtual {p0, p2, p3}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catch_0
    const/4 p2, 0x1

    .line 33
    move v2, p2

    .line 34
    :goto_1
    :try_start_2
    iget-object p2, p0, Lcom/google/android/exoplayer2/g0;->z:Lf9/c;

    .line 35
    .line 36
    invoke-interface {p2}, Lf9/c;->b()J

    .line 37
    .line 38
    .line 39
    move-result-wide p2

    .line 40
    sub-long p2, v0, p2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    :cond_1
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    monitor-exit p0

    .line 56
    throw p1
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

.method private n(Lcom/google/android/exoplayer2/t0;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/h;->a(Lcom/google/android/exoplayer2/t0;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->t(Lcom/google/android/exoplayer2/t0;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/exoplayer2/t0;->disable()V

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, -0x1

    .line 22
    .line 23
    iput p1, p0, Lcom/google/android/exoplayer2/g0;->S:I

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

.method private n0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 10
    .line 11
    iget-boolean v0, v0, Lcom/google/android/exoplayer2/k0;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->J:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->K:Z

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
.end method

.method private o0(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/j0;->z(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    :goto_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/h;->d(J)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 22
    .line 23
    array-length p2, p1

    .line 24
    const/4 v0, 0x0

    .line 25
    :goto_1
    if-ge v0, p2, :cond_2

    .line 26
    .line 27
    aget-object v1, p1, v0

    .line 28
    .line 29
    invoke-static {v1}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 36
    .line 37
    invoke-interface {v1, v2, v3}, Lcom/google/android/exoplayer2/t0;->u(J)V

    .line 38
    .line 39
    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->a0()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method private p()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->z:Lf9/c;

    .line 4
    .line 5
    invoke-interface {v1}, Lf9/c;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->j1()V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 13
    .line 14
    iget v3, v3, Lcom/google/android/exoplayer2/q0;->d:I

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-eq v3, v5, :cond_1f

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    if-ne v3, v6, :cond_0

    .line 21
    .line 22
    goto/16 :goto_e

    .line 23
    .line 24
    :cond_0
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 25
    .line 26
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-wide/16 v7, 0xa

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-direct {v0, v1, v2, v7, v8}, Lcom/google/android/exoplayer2/g0;->v0(JJ)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    const-string v9, "doSomeWork"

    .line 39
    .line 40
    invoke-static {v9}, Lf9/m0;->a(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->k1()V

    .line 44
    .line 45
    .line 46
    iget-boolean v9, v3, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 47
    .line 48
    const-wide/16 v10, 0x3e8

    .line 49
    .line 50
    const/4 v12, 0x0

    .line 51
    if-eqz v9, :cond_a

    .line 52
    .line 53
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 54
    .line 55
    .line 56
    move-result-wide v13

    .line 57
    mul-long/2addr v13, v10

    .line 58
    iget-object v9, v3, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 59
    .line 60
    iget-object v15, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 61
    .line 62
    iget-wide v10, v15, Lcom/google/android/exoplayer2/q0;->r:J

    .line 63
    .line 64
    iget-wide v7, v0, Lcom/google/android/exoplayer2/g0;->v:J

    .line 65
    .line 66
    sub-long/2addr v10, v7

    .line 67
    iget-boolean v7, v0, Lcom/google/android/exoplayer2/g0;->w:Z

    .line 68
    .line 69
    invoke-interface {v9, v10, v11, v7}, Lh8/r;->u(JZ)V

    .line 70
    .line 71
    .line 72
    move v8, v5

    .line 73
    move v9, v8

    .line 74
    move v7, v12

    .line 75
    :goto_0
    iget-object v10, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 76
    .line 77
    array-length v11, v10

    .line 78
    if-ge v7, v11, :cond_b

    .line 79
    .line 80
    aget-object v10, v10, v7

    .line 81
    .line 82
    invoke-static {v10}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-nez v11, :cond_2

    .line 87
    .line 88
    goto :goto_7

    .line 89
    :cond_2
    iget-wide v4, v0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 90
    .line 91
    invoke-interface {v10, v4, v5, v13, v14}, Lcom/google/android/exoplayer2/t0;->r(JJ)V

    .line 92
    .line 93
    .line 94
    if-eqz v8, :cond_3

    .line 95
    .line 96
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->c()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_3

    .line 101
    .line 102
    const/4 v8, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move v8, v12

    .line 105
    :goto_1
    iget-object v4, v3, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 106
    .line 107
    aget-object v4, v4, v7

    .line 108
    .line 109
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eq v4, v5, :cond_4

    .line 114
    .line 115
    const/4 v4, 0x1

    .line 116
    goto :goto_2

    .line 117
    :cond_4
    move v4, v12

    .line 118
    :goto_2
    if-nez v4, :cond_5

    .line 119
    .line 120
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->g()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    const/4 v5, 0x1

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move v5, v12

    .line 129
    :goto_3
    if-nez v4, :cond_7

    .line 130
    .line 131
    if-nez v5, :cond_7

    .line 132
    .line 133
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->e()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_7

    .line 138
    .line 139
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->c()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move v4, v12

    .line 147
    goto :goto_5

    .line 148
    :cond_7
    :goto_4
    const/4 v4, 0x1

    .line 149
    :goto_5
    if-eqz v9, :cond_8

    .line 150
    .line 151
    if-eqz v4, :cond_8

    .line 152
    .line 153
    const/4 v9, 0x1

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v9, v12

    .line 156
    :goto_6
    if-nez v4, :cond_9

    .line 157
    .line 158
    invoke-interface {v10}, Lcom/google/android/exoplayer2/t0;->j()V

    .line 159
    .line 160
    .line 161
    :cond_9
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 162
    .line 163
    const/4 v5, 0x1

    .line 164
    goto :goto_0

    .line 165
    :cond_a
    iget-object v4, v3, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 166
    .line 167
    invoke-interface {v4}, Lh8/r;->r()V

    .line 168
    .line 169
    .line 170
    const/4 v8, 0x1

    .line 171
    const/4 v9, 0x1

    .line 172
    :cond_b
    iget-object v4, v3, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 173
    .line 174
    iget-wide v4, v4, Lcom/google/android/exoplayer2/k0;->e:J

    .line 175
    .line 176
    if-eqz v8, :cond_d

    .line 177
    .line 178
    iget-boolean v7, v3, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 179
    .line 180
    if-eqz v7, :cond_d

    .line 181
    .line 182
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    cmp-long v7, v4, v7

    .line 188
    .line 189
    if-eqz v7, :cond_c

    .line 190
    .line 191
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 192
    .line 193
    iget-wide v7, v7, Lcom/google/android/exoplayer2/q0;->r:J

    .line 194
    .line 195
    cmp-long v4, v4, v7

    .line 196
    .line 197
    if-gtz v4, :cond_d

    .line 198
    .line 199
    :cond_c
    const/4 v4, 0x1

    .line 200
    goto :goto_8

    .line 201
    :cond_d
    move v4, v12

    .line 202
    :goto_8
    if-eqz v4, :cond_e

    .line 203
    .line 204
    iget-boolean v5, v0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 205
    .line 206
    if-eqz v5, :cond_e

    .line 207
    .line 208
    iput-boolean v12, v0, Lcom/google/android/exoplayer2/g0;->K:Z

    .line 209
    .line 210
    iget-object v5, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 211
    .line 212
    iget v5, v5, Lcom/google/android/exoplayer2/q0;->l:I

    .line 213
    .line 214
    const/4 v7, 0x5

    .line 215
    invoke-direct {v0, v12, v5, v12, v7}, Lcom/google/android/exoplayer2/g0;->M0(ZIZI)V

    .line 216
    .line 217
    .line 218
    :cond_e
    const/4 v5, 0x3

    .line 219
    if-eqz v4, :cond_f

    .line 220
    .line 221
    iget-object v4, v3, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 222
    .line 223
    iget-boolean v4, v4, Lcom/google/android/exoplayer2/k0;->h:Z

    .line 224
    .line 225
    if-eqz v4, :cond_f

    .line 226
    .line 227
    invoke-direct {v0, v6}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 228
    .line 229
    .line 230
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->f1()V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_f
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 235
    .line 236
    iget v4, v4, Lcom/google/android/exoplayer2/q0;->d:I

    .line 237
    .line 238
    const/4 v7, 0x2

    .line 239
    if-ne v4, v7, :cond_10

    .line 240
    .line 241
    invoke-direct {v0, v9}, Lcom/google/android/exoplayer2/g0;->Z0(Z)Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-eqz v4, :cond_10

    .line 246
    .line 247
    invoke-direct {v0, v5}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 248
    .line 249
    .line 250
    const/4 v4, 0x0

    .line 251
    iput-object v4, v0, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 252
    .line 253
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_14

    .line 258
    .line 259
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->c1()V

    .line 260
    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_10
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 264
    .line 265
    iget v4, v4, Lcom/google/android/exoplayer2/q0;->d:I

    .line 266
    .line 267
    if-ne v4, v5, :cond_14

    .line 268
    .line 269
    iget v4, v0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 270
    .line 271
    if-nez v4, :cond_11

    .line 272
    .line 273
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->N()Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    if-eqz v4, :cond_12

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_11
    if-nez v9, :cond_14

    .line 281
    .line 282
    :cond_12
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    iput-boolean v4, v0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 287
    .line 288
    const/4 v4, 0x2

    .line 289
    invoke-direct {v0, v4}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 290
    .line 291
    .line 292
    iget-boolean v4, v0, Lcom/google/android/exoplayer2/g0;->L:Z

    .line 293
    .line 294
    if-eqz v4, :cond_13

    .line 295
    .line 296
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->c0()V

    .line 297
    .line 298
    .line 299
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->D:Lcom/google/android/exoplayer2/h0;

    .line 300
    .line 301
    invoke-interface {v4}, Lcom/google/android/exoplayer2/h0;->d()V

    .line 302
    .line 303
    .line 304
    :cond_13
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->f1()V

    .line 305
    .line 306
    .line 307
    :cond_14
    :goto_9
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 308
    .line 309
    iget v4, v4, Lcom/google/android/exoplayer2/q0;->d:I

    .line 310
    .line 311
    const/4 v7, 0x2

    .line 312
    if-ne v4, v7, :cond_18

    .line 313
    .line 314
    move v4, v12

    .line 315
    :goto_a
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 316
    .line 317
    array-length v8, v7

    .line 318
    if-ge v4, v8, :cond_16

    .line 319
    .line 320
    aget-object v7, v7, v4

    .line 321
    .line 322
    invoke-static {v7}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_15

    .line 327
    .line 328
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 329
    .line 330
    aget-object v7, v7, v4

    .line 331
    .line 332
    invoke-interface {v7}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 333
    .line 334
    .line 335
    move-result-object v7

    .line 336
    iget-object v8, v3, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 337
    .line 338
    aget-object v8, v8, v4

    .line 339
    .line 340
    if-ne v7, v8, :cond_15

    .line 341
    .line 342
    iget-object v7, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 343
    .line 344
    aget-object v7, v7, v4

    .line 345
    .line 346
    invoke-interface {v7}, Lcom/google/android/exoplayer2/t0;->j()V

    .line 347
    .line 348
    .line 349
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_16
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 353
    .line 354
    iget-boolean v4, v3, Lcom/google/android/exoplayer2/q0;->f:Z

    .line 355
    .line 356
    if-nez v4, :cond_18

    .line 357
    .line 358
    iget-wide v3, v3, Lcom/google/android/exoplayer2/q0;->q:J

    .line 359
    .line 360
    const-wide/32 v7, 0x7a120

    .line 361
    .line 362
    .line 363
    cmp-long v3, v3, v7

    .line 364
    .line 365
    if-gez v3, :cond_18

    .line 366
    .line 367
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->L()Z

    .line 368
    .line 369
    .line 370
    move-result v3

    .line 371
    if-nez v3, :cond_17

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 375
    .line 376
    const-string v2, "Playback stuck buffering and not loading"

    .line 377
    .line 378
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v1

    .line 382
    :cond_18
    :goto_b
    iget-boolean v3, v0, Lcom/google/android/exoplayer2/g0;->R:Z

    .line 383
    .line 384
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 385
    .line 386
    iget-boolean v7, v4, Lcom/google/android/exoplayer2/q0;->n:Z

    .line 387
    .line 388
    if-eq v3, v7, :cond_19

    .line 389
    .line 390
    invoke-virtual {v4, v3}, Lcom/google/android/exoplayer2/q0;->d(Z)Lcom/google/android/exoplayer2/q0;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    iput-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 395
    .line 396
    :cond_19
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-eqz v3, :cond_1a

    .line 401
    .line 402
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 403
    .line 404
    iget v3, v3, Lcom/google/android/exoplayer2/q0;->d:I

    .line 405
    .line 406
    if-eq v3, v5, :cond_1b

    .line 407
    .line 408
    :cond_1a
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 409
    .line 410
    iget v3, v3, Lcom/google/android/exoplayer2/q0;->d:I

    .line 411
    .line 412
    const/4 v4, 0x2

    .line 413
    if-ne v3, v4, :cond_1c

    .line 414
    .line 415
    :cond_1b
    const-wide/16 v3, 0xa

    .line 416
    .line 417
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/g0;->S(JJ)Z

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    const/4 v2, 0x1

    .line 422
    xor-int/2addr v1, v2

    .line 423
    goto :goto_d

    .line 424
    :cond_1c
    iget v4, v0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 425
    .line 426
    if-eqz v4, :cond_1d

    .line 427
    .line 428
    if-eq v3, v6, :cond_1d

    .line 429
    .line 430
    const-wide/16 v3, 0x3e8

    .line 431
    .line 432
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/g0;->v0(JJ)V

    .line 433
    .line 434
    .line 435
    goto :goto_c

    .line 436
    :cond_1d
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 437
    .line 438
    const/4 v2, 0x2

    .line 439
    invoke-interface {v1, v2}, Lf9/m;->j(I)V

    .line 440
    .line 441
    .line 442
    :goto_c
    move v1, v12

    .line 443
    :goto_d
    iget-object v2, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 444
    .line 445
    iget-boolean v3, v2, Lcom/google/android/exoplayer2/q0;->o:Z

    .line 446
    .line 447
    if-eq v3, v1, :cond_1e

    .line 448
    .line 449
    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/q0;->i(Z)Lcom/google/android/exoplayer2/q0;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    iput-object v1, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 454
    .line 455
    :cond_1e
    iput-boolean v12, v0, Lcom/google/android/exoplayer2/g0;->Q:Z

    .line 456
    .line 457
    invoke-static {}, Lf9/m0;->c()V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :cond_1f
    :goto_e
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 462
    .line 463
    const/4 v2, 0x2

    .line 464
    invoke-interface {v1, v2}, Lf9/m;->j(I)V

    .line 465
    .line 466
    .line 467
    return-void
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
.end method

.method private static p0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p3}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0, v0, p2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$c;->n:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    invoke-virtual {p0, p2, p3, v0}, Lcom/google/android/exoplayer2/Timeline;->g(ILcom/google/android/exoplayer2/Timeline$b;Z)Lcom/google/android/exoplayer2/Timeline$b;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object p0, p0, Lcom/google/android/exoplayer2/Timeline$b;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-wide v0, p3, Lcom/google/android/exoplayer2/Timeline$b;->d:J

    .line 23
    .line 24
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long p3, v0, v2

    .line 30
    .line 31
    if-eqz p3, :cond_0

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    sub-long/2addr v0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-wide v0, 0x7fffffffffffffffL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1, p2, v0, v1, p0}, Lcom/google/android/exoplayer2/g0$d;->b(IJLjava/lang/Object;)V

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
.end method

.method private q(IZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 4
    .line 5
    aget-object v1, v1, p1

    .line 6
    .line 7
    invoke-static {v1}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, v0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x1

    .line 28
    if-ne v2, v3, :cond_1

    .line 29
    .line 30
    move v9, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v9, v4

    .line 33
    :goto_0
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v6, v3, La9/n;->b:[Ld7/u;

    .line 38
    .line 39
    aget-object v6, v6, p1

    .line 40
    .line 41
    iget-object v3, v3, La9/n;->c:[La9/h;

    .line 42
    .line 43
    aget-object v3, v3, p1

    .line 44
    .line 45
    invoke-static {v3}, Lcom/google/android/exoplayer2/g0;->w(La9/h;)[Ld7/k;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/g0;->Y0()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 56
    .line 57
    iget v3, v3, Lcom/google/android/exoplayer2/q0;->d:I

    .line 58
    .line 59
    const/4 v8, 0x3

    .line 60
    if-ne v3, v8, :cond_2

    .line 61
    .line 62
    move v14, v5

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    move v14, v4

    .line 65
    :goto_1
    if-nez p2, :cond_3

    .line 66
    .line 67
    if-eqz v14, :cond_3

    .line 68
    .line 69
    move v8, v5

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move v8, v4

    .line 72
    :goto_2
    iget v3, v0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 73
    .line 74
    add-int/2addr v3, v5

    .line 75
    iput v3, v0, Lcom/google/android/exoplayer2/g0;->S:I

    .line 76
    .line 77
    iget-object v3, v2, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 78
    .line 79
    aget-object v5, v3, p1

    .line 80
    .line 81
    iget-wide v10, v0, Lcom/google/android/exoplayer2/g0;->U:J

    .line 82
    .line 83
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/j0;->m()J

    .line 84
    .line 85
    .line 86
    move-result-wide v12

    .line 87
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/j0;->l()J

    .line 88
    .line 89
    .line 90
    move-result-wide v15

    .line 91
    move-object v2, v1

    .line 92
    move-object v3, v6

    .line 93
    move-object v4, v7

    .line 94
    move-wide v6, v10

    .line 95
    move-wide v10, v12

    .line 96
    move-wide v12, v15

    .line 97
    invoke-interface/range {v2 .. v13}, Lcom/google/android/exoplayer2/t0;->p(Ld7/u;[Ld7/k;Lh8/o0;JZZJJ)V

    .line 98
    .line 99
    .line 100
    new-instance v2, Lcom/google/android/exoplayer2/g0$a;

    .line 101
    .line 102
    invoke-direct {v2, v0}, Lcom/google/android/exoplayer2/g0$a;-><init>(Lcom/google/android/exoplayer2/g0;)V

    .line 103
    .line 104
    .line 105
    const/16 v3, 0x67

    .line 106
    .line 107
    invoke-interface {v1, v3, v2}, Lcom/google/android/exoplayer2/r0$b;->i(ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, Lcom/google/android/exoplayer2/g0;->x:Lcom/google/android/exoplayer2/h;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/h;->c(Lcom/google/android/exoplayer2/t0;)V

    .line 113
    .line 114
    .line 115
    if-eqz v14, :cond_4

    .line 116
    .line 117
    invoke-interface {v1}, Lcom/google/android/exoplayer2/t0;->start()V

    .line 118
    .line 119
    .line 120
    :cond_4
    return-void
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

.method private static q0(Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;IZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Z
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v8, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v9, p5

    .line 7
    .line 8
    move-object/from16 v10, p6

    .line 9
    .line 10
    iget-object v2, v0, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 v11, 0x0

    .line 13
    const/4 v12, 0x1

    .line 14
    const-wide/high16 v13, -0x8000000000000000L

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/r0;->e()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    cmp-long v1, v1, v13

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/r0;->e()J

    .line 37
    .line 38
    .line 39
    move-result-wide v1

    .line 40
    invoke-static {v1, v2}, Ld7/c;->c(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    :goto_0
    new-instance v3, Lcom/google/android/exoplayer2/g0$h;

    .line 45
    .line 46
    iget-object v4, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/r0;->g()Lcom/google/android/exoplayer2/Timeline;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    iget-object v5, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 53
    .line 54
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/r0;->i()I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    invoke-direct {v3, v4, v5, v1, v2}, Lcom/google/android/exoplayer2/g0$h;-><init>(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 59
    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    move-object v2, v3

    .line 65
    move v3, v4

    .line 66
    move/from16 v4, p3

    .line 67
    .line 68
    move/from16 v5, p4

    .line 69
    .line 70
    move-object/from16 v6, p5

    .line 71
    .line 72
    move-object/from16 v7, p6

    .line 73
    .line 74
    invoke-static/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0;->t0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$h;ZIZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Landroid/util/Pair;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_1

    .line 79
    .line 80
    return v11

    .line 81
    :cond_1
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-virtual {v8, v2}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Ljava/lang/Long;

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v3

    .line 95
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-virtual {p0, v2, v3, v4, v1}, Lcom/google/android/exoplayer2/g0$d;->b(IJLjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/r0;->e()J

    .line 103
    .line 104
    .line 105
    move-result-wide v1

    .line 106
    cmp-long v1, v1, v13

    .line 107
    .line 108
    if-nez v1, :cond_2

    .line 109
    .line 110
    invoke-static {v8, p0, v9, v10}, Lcom/google/android/exoplayer2/g0;->p0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    return v12

    .line 114
    :cond_3
    invoke-virtual {v8, v2}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    const/4 v3, -0x1

    .line 119
    if-ne v2, v3, :cond_4

    .line 120
    .line 121
    return v11

    .line 122
    :cond_4
    iget-object v3, v0, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/google/android/exoplayer2/r0;->e()J

    .line 125
    .line 126
    .line 127
    move-result-wide v3

    .line 128
    cmp-long v3, v3, v13

    .line 129
    .line 130
    if-nez v3, :cond_5

    .line 131
    .line 132
    invoke-static {v8, p0, v9, v10}, Lcom/google/android/exoplayer2/g0;->p0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)V

    .line 133
    .line 134
    .line 135
    return v12

    .line 136
    :cond_5
    iput v2, v0, Lcom/google/android/exoplayer2/g0$d;->l:I

    .line 137
    .line 138
    iget-object v2, v0, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-virtual {v1, v2, v10}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 141
    .line 142
    .line 143
    iget v2, v10, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 144
    .line 145
    invoke-virtual {v1, v2, v9}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-boolean v1, v1, Lcom/google/android/exoplayer2/Timeline$c;->l:Z

    .line 150
    .line 151
    if-eqz v1, :cond_6

    .line 152
    .line 153
    iget-wide v1, v0, Lcom/google/android/exoplayer2/g0$d;->m:J

    .line 154
    .line 155
    invoke-virtual/range {p6 .. p6}, Lcom/google/android/exoplayer2/Timeline$b;->l()J

    .line 156
    .line 157
    .line 158
    move-result-wide v3

    .line 159
    add-long v5, v1, v3

    .line 160
    .line 161
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0$d;->n:Ljava/lang/Object;

    .line 162
    .line 163
    invoke-virtual {v8, v1, v10}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget v4, v1, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 168
    .line 169
    move-object/from16 v1, p1

    .line 170
    .line 171
    move-object/from16 v2, p5

    .line 172
    .line 173
    move-object/from16 v3, p6

    .line 174
    .line 175
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 180
    .line 181
    invoke-virtual {v8, v2}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result v2

    .line 185
    iget-object v3, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v3, Ljava/lang/Long;

    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 190
    .line 191
    .line 192
    move-result-wide v3

    .line 193
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-virtual {p0, v2, v3, v4, v1}, Lcom/google/android/exoplayer2/g0$d;->b(IJLjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_6
    return v12
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
.end method

.method private r()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    array-length v0, v0

    new-array v0, v0, [Z

    invoke-direct {p0, v0}, Lcom/google/android/exoplayer2/g0;->s([Z)V

    return-void
.end method

.method private r0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    :goto_0
    if-ltz v0, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lcom/google/android/exoplayer2/g0$d;

    .line 32
    .line 33
    iget v5, p0, Lcom/google/android/exoplayer2/g0;->N:I

    .line 34
    .line 35
    iget-boolean v6, p0, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 36
    .line 37
    iget-object v7, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 38
    .line 39
    iget-object v8, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    move-object v4, p2

    .line 43
    invoke-static/range {v2 .. v8}, Lcom/google/android/exoplayer2/g0;->q0(Lcom/google/android/exoplayer2/g0$d;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;IZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lcom/google/android/exoplayer2/g0$d;

    .line 56
    .line 57
    iget-object v1, v1, Lcom/google/android/exoplayer2/g0$d;->k:Lcom/google/android/exoplayer2/r0;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/r0;->k(Z)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->y:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-void
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

.method private s([Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->o()La9/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 14
    .line 15
    array-length v4, v4

    .line 16
    if-ge v3, v4, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, v3}, La9/n;->c(I)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 25
    .line 26
    aget-object v4, v4, v3

    .line 27
    .line 28
    invoke-interface {v4}, Lcom/google/android/exoplayer2/t0;->reset()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 35
    .line 36
    array-length v3, v3

    .line 37
    if-ge v2, v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1, v2}, La9/n;->c(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    aget-boolean v3, p1, v2

    .line 46
    .line 47
    invoke-direct {p0, v2, v3}, Lcom/google/android/exoplayer2/g0;->q(IZ)V

    .line 48
    .line 49
    .line 50
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, v0, Lcom/google/android/exoplayer2/j0;->g:Z

    .line 55
    .line 56
    return-void
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

.method private static s0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/g0$h;Lcom/google/android/exoplayer2/m0;IZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/g0$g;
    .locals 21

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p5

    .line 8
    .line 9
    move-object/from16 v11, p7

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Lcom/google/android/exoplayer2/g0$g;

    .line 18
    .line 19
    invoke-static {}, Lcom/google/android/exoplayer2/q0;->l()Lh8/u$a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v8, 0x1

    .line 32
    const/4 v9, 0x0

    .line 33
    move-object v1, v0

    .line 34
    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/g0$g;-><init>(Lh8/u$a;JJZZZ)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    iget-object v12, v8, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 39
    .line 40
    iget-object v13, v12, Lh8/s;->a:Ljava/lang/Object;

    .line 41
    .line 42
    move-object/from16 v14, p6

    .line 43
    .line 44
    invoke-static {v8, v11, v14}, Lcom/google/android/exoplayer2/g0;->b1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline$b;Lcom/google/android/exoplayer2/Timeline$c;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    iget-wide v1, v8, Lcom/google/android/exoplayer2/q0;->c:J

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-wide v1, v8, Lcom/google/android/exoplayer2/q0;->r:J

    .line 54
    .line 55
    :goto_0
    move-wide v15, v1

    .line 56
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    const/4 v6, -0x1

    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0x1

    .line 65
    .line 66
    if-eqz v9, :cond_5

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    move-object/from16 v0, p0

    .line 70
    .line 71
    move-object/from16 v1, p2

    .line 72
    .line 73
    move/from16 v3, p4

    .line 74
    .line 75
    move/from16 v4, p5

    .line 76
    .line 77
    move-object/from16 v5, p6

    .line 78
    .line 79
    move v14, v6

    .line 80
    move-object/from16 v6, p7

    .line 81
    .line 82
    invoke-static/range {v0 .. v6}, Lcom/google/android/exoplayer2/g0;->t0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$h;ZIZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Landroid/util/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    invoke-virtual {v7, v10}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    move/from16 v1, v19

    .line 93
    .line 94
    move v2, v1

    .line 95
    move/from16 v3, v20

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_2
    iget-wide v1, v9, Lcom/google/android/exoplayer2/g0$h;->c:J

    .line 99
    .line 100
    cmp-long v1, v1, v17

    .line 101
    .line 102
    if-nez v1, :cond_3

    .line 103
    .line 104
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-virtual {v7, v0, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget v6, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 111
    .line 112
    move/from16 v0, v19

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 116
    .line 117
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ljava/lang/Long;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v15

    .line 125
    move v6, v14

    .line 126
    move/from16 v0, v20

    .line 127
    .line 128
    :goto_1
    iget v1, v8, Lcom/google/android/exoplayer2/q0;->d:I

    .line 129
    .line 130
    const/4 v2, 0x4

    .line 131
    if-ne v1, v2, :cond_4

    .line 132
    .line 133
    move/from16 v1, v20

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    move/from16 v1, v19

    .line 137
    .line 138
    :goto_2
    move v2, v1

    .line 139
    move/from16 v3, v19

    .line 140
    .line 141
    move v1, v0

    .line 142
    move v0, v6

    .line 143
    :goto_3
    move v9, v1

    .line 144
    move v6, v2

    .line 145
    move v10, v3

    .line 146
    :goto_4
    move v3, v0

    .line 147
    goto/16 :goto_8

    .line 148
    .line 149
    :cond_5
    move v14, v6

    .line 150
    iget-object v1, v8, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    if-eqz v1, :cond_6

    .line 157
    .line 158
    invoke-virtual {v7, v10}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :goto_5
    move v3, v0

    .line 163
    :goto_6
    move/from16 v6, v19

    .line 164
    .line 165
    move v9, v6

    .line 166
    move v10, v9

    .line 167
    goto/16 :goto_8

    .line 168
    .line 169
    :cond_6
    invoke-virtual {v7, v13}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-ne v1, v14, :cond_8

    .line 174
    .line 175
    iget-object v5, v8, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 176
    .line 177
    move-object/from16 v0, p6

    .line 178
    .line 179
    move-object/from16 v1, p7

    .line 180
    .line 181
    move/from16 v2, p4

    .line 182
    .line 183
    move/from16 v3, p5

    .line 184
    .line 185
    move-object v4, v13

    .line 186
    move-object/from16 v6, p0

    .line 187
    .line 188
    invoke-static/range {v0 .. v6}, Lcom/google/android/exoplayer2/g0;->u0(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IZLjava/lang/Object;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    if-nez v0, :cond_7

    .line 193
    .line 194
    invoke-virtual {v7, v10}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    move/from16 v3, v20

    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_7
    invoke-virtual {v7, v0, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 206
    .line 207
    move/from16 v3, v19

    .line 208
    .line 209
    :goto_7
    move v10, v3

    .line 210
    move/from16 v6, v19

    .line 211
    .line 212
    move v9, v6

    .line 213
    goto :goto_4

    .line 214
    :cond_8
    if-eqz v0, :cond_a

    .line 215
    .line 216
    cmp-long v0, v15, v17

    .line 217
    .line 218
    if-nez v0, :cond_9

    .line 219
    .line 220
    invoke-virtual {v7, v13, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_9
    iget-object v0, v8, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 228
    .line 229
    iget-object v1, v12, Lh8/s;->a:Ljava/lang/Object;

    .line 230
    .line 231
    invoke-virtual {v0, v1, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/exoplayer2/Timeline$b;->l()J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    add-long v4, v15, v0

    .line 239
    .line 240
    invoke-virtual {v7, v13, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget v3, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 245
    .line 246
    move-object/from16 v0, p0

    .line 247
    .line 248
    move-object/from16 v1, p6

    .line 249
    .line 250
    move-object/from16 v2, p7

    .line 251
    .line 252
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 257
    .line 258
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, Ljava/lang/Long;

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 263
    .line 264
    .line 265
    move-result-wide v15

    .line 266
    move v3, v14

    .line 267
    move/from16 v6, v19

    .line 268
    .line 269
    move v10, v6

    .line 270
    move/from16 v9, v20

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_a
    move v3, v14

    .line 274
    goto :goto_6

    .line 275
    :goto_8
    if-eq v3, v14, :cond_b

    .line 276
    .line 277
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    move-object/from16 v0, p0

    .line 283
    .line 284
    move-object/from16 v1, p6

    .line 285
    .line 286
    move-object/from16 v2, p7

    .line 287
    .line 288
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v13, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 293
    .line 294
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Ljava/lang/Long;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 299
    .line 300
    .line 301
    move-result-wide v15

    .line 302
    move-object/from16 v2, p3

    .line 303
    .line 304
    move-wide v0, v15

    .line 305
    move-wide/from16 v4, v17

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_b
    move-object/from16 v2, p3

    .line 309
    .line 310
    move-wide v0, v15

    .line 311
    move-wide v4, v0

    .line 312
    :goto_9
    invoke-virtual {v2, v7, v13, v0, v1}, Lcom/google/android/exoplayer2/m0;->z(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)Lh8/u$a;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    iget v3, v2, Lh8/s;->e:I

    .line 317
    .line 318
    if-eq v3, v14, :cond_d

    .line 319
    .line 320
    iget v3, v12, Lh8/s;->e:I

    .line 321
    .line 322
    if-eq v3, v14, :cond_c

    .line 323
    .line 324
    iget v14, v2, Lh8/s;->b:I

    .line 325
    .line 326
    if-lt v14, v3, :cond_c

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_c
    move/from16 v3, v19

    .line 330
    .line 331
    goto :goto_b

    .line 332
    :cond_d
    :goto_a
    move/from16 v3, v20

    .line 333
    .line 334
    :goto_b
    iget-object v14, v12, Lh8/s;->a:Ljava/lang/Object;

    .line 335
    .line 336
    invoke-virtual {v14, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    if-eqz v13, :cond_e

    .line 341
    .line 342
    invoke-virtual {v12}, Lh8/s;->b()Z

    .line 343
    .line 344
    .line 345
    move-result v13

    .line 346
    if-nez v13, :cond_e

    .line 347
    .line 348
    invoke-virtual {v2}, Lh8/s;->b()Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-nez v13, :cond_e

    .line 353
    .line 354
    if-eqz v3, :cond_e

    .line 355
    .line 356
    move/from16 v19, v20

    .line 357
    .line 358
    :cond_e
    if-eqz v19, :cond_f

    .line 359
    .line 360
    move-object v2, v12

    .line 361
    :cond_f
    invoke-virtual {v2}, Lh8/s;->b()Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_12

    .line 366
    .line 367
    invoke-virtual {v2, v12}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_10

    .line 372
    .line 373
    iget-wide v0, v8, Lcom/google/android/exoplayer2/q0;->r:J

    .line 374
    .line 375
    goto :goto_c

    .line 376
    :cond_10
    iget-object v0, v2, Lh8/s;->a:Ljava/lang/Object;

    .line 377
    .line 378
    invoke-virtual {v7, v0, v11}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 379
    .line 380
    .line 381
    iget v0, v2, Lh8/s;->c:I

    .line 382
    .line 383
    iget v1, v2, Lh8/s;->b:I

    .line 384
    .line 385
    invoke-virtual {v11, v1}, Lcom/google/android/exoplayer2/Timeline$b;->i(I)I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-ne v0, v1, :cond_11

    .line 390
    .line 391
    invoke-virtual/range {p7 .. p7}, Lcom/google/android/exoplayer2/Timeline$b;->g()J

    .line 392
    .line 393
    .line 394
    move-result-wide v0

    .line 395
    goto :goto_c

    .line 396
    :cond_11
    const-wide/16 v0, 0x0

    .line 397
    .line 398
    :cond_12
    :goto_c
    move-wide v7, v0

    .line 399
    new-instance v11, Lcom/google/android/exoplayer2/g0$g;

    .line 400
    .line 401
    move-object v0, v11

    .line 402
    move-object v1, v2

    .line 403
    move-wide v2, v7

    .line 404
    move v7, v10

    .line 405
    move v8, v9

    .line 406
    invoke-direct/range {v0 .. v8}, Lcom/google/android/exoplayer2/g0$g;-><init>(Lh8/u$a;JJZZZ)V

    .line 407
    .line 408
    .line 409
    return-object v11
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

.method private t(Lcom/google/android/exoplayer2/t0;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Lcom/google/android/exoplayer2/t0;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1}, Lcom/google/android/exoplayer2/t0;->stop()V

    .line 9
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

.method private static t0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$h;ZIZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Landroid/util/Pair;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Timeline;",
            "Lcom/google/android/exoplayer2/g0$h;",
            "ZIZ",
            "Lcom/google/android/exoplayer2/Timeline$c;",
            "Lcom/google/android/exoplayer2/Timeline$b;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    move-object v7, p0

    .line 2
    move-object v0, p1

    .line 3
    move-object/from16 v8, p6

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/exoplayer2/g0$h;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v9, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    return-object v9

    .line 15
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    move-object v10, v7

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object v10, v1

    .line 24
    :goto_0
    :try_start_0
    iget v4, v0, Lcom/google/android/exoplayer2/g0$h;->b:I

    .line 25
    .line 26
    iget-wide v5, v0, Lcom/google/android/exoplayer2/g0$h;->c:J

    .line 27
    .line 28
    move-object v1, v10

    .line 29
    move-object/from16 v2, p5

    .line 30
    .line 31
    move-object/from16 v3, p6

    .line 32
    .line 33
    invoke-virtual/range {v1 .. v6}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    invoke-virtual {p0, v10}, Lcom/google/android/exoplayer2/Timeline;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_2
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v3, -0x1

    .line 51
    if-eq v2, v3, :cond_4

    .line 52
    .line 53
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v10, v2, v8}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 56
    .line 57
    .line 58
    iget v2, v8, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 59
    .line 60
    move-object/from16 v11, p5

    .line 61
    .line 62
    invoke-virtual {v10, v2, v11}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-boolean v2, v2, Lcom/google/android/exoplayer2/Timeline$c;->l:Z

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    iget-object v1, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {p0, v1, v8}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget v3, v1, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 77
    .line 78
    iget-wide v4, v0, Lcom/google/android/exoplayer2/g0$h;->c:J

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    move-object/from16 v1, p5

    .line 82
    .line 83
    move-object/from16 v2, p6

    .line 84
    .line 85
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_3
    return-object v1

    .line 90
    :cond_4
    move-object/from16 v11, p5

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 95
    .line 96
    move-object/from16 v0, p5

    .line 97
    .line 98
    move-object/from16 v1, p6

    .line 99
    .line 100
    move v2, p3

    .line 101
    move/from16 v3, p4

    .line 102
    .line 103
    move-object v5, v10

    .line 104
    move-object v6, p0

    .line 105
    invoke-static/range {v0 .. v6}, Lcom/google/android/exoplayer2/g0;->u0(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IZLjava/lang/Object;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0, v0, v8}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget v3, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 116
    .line 117
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    move-object v0, p0

    .line 123
    move-object/from16 v1, p5

    .line 124
    .line 125
    move-object/from16 v2, p6

    .line 126
    .line 127
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0

    .line 132
    :catch_0
    :cond_5
    return-object v9
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
.end method

.method private u([La9/h;)Lbc/i0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "La9/h;",
            ")",
            "Lbc/i0<",
            "Ly7/a;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbc/i0$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lbc/i0$b;-><init>()V

    .line 4
    .line 5
    .line 6
    array-length v1, p1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v3, v1, :cond_2

    .line 11
    .line 12
    aget-object v5, p1, v3

    .line 13
    .line 14
    if-eqz v5, :cond_1

    .line 15
    .line 16
    invoke-interface {v5, v2}, La9/k;->e(I)Ld7/k;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iget-object v5, v5, Ld7/k;->t:Ly7/a;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    new-instance v5, Ly7/a;

    .line 25
    .line 26
    new-array v6, v2, [Ly7/a$b;

    .line 27
    .line 28
    invoke-direct {v5, v6}, Ly7/a;-><init>([Ly7/a$b;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v5}, Lbc/i0$b;->b(Ljava/lang/Object;)Lbc/i0$b;

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v0, v5}, Lbc/i0$b;->b(Ljava/lang/Object;)Lbc/i0$b;

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    if-eqz v4, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0}, Lbc/i0$b;->c()Lbc/i0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_2

    .line 49
    :cond_3
    invoke-static {}, Lbc/i0;->x()Lbc/i0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_2
    return-object p1
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

.method static u0(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IZLjava/lang/Object;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p5, p4}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p4

    .line 5
    invoke-virtual {p5}, Lcom/google/android/exoplayer2/Timeline;->i()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v4, p4

    .line 12
    move p4, v1

    .line 13
    :goto_0
    if-ge v2, v0, :cond_1

    .line 14
    .line 15
    if-ne p4, v1, :cond_1

    .line 16
    .line 17
    move-object v3, p5

    .line 18
    move-object v5, p1

    .line 19
    move-object v6, p0

    .line 20
    move v7, p2

    .line 21
    move v8, p3

    .line 22
    invoke-virtual/range {v3 .. v8}, Lcom/google/android/exoplayer2/Timeline;->d(ILcom/google/android/exoplayer2/Timeline$b;Lcom/google/android/exoplayer2/Timeline$c;IZ)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-ne v4, v1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {p5, v4}, Lcom/google/android/exoplayer2/Timeline;->m(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p4

    .line 33
    invoke-virtual {p6, p4}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    if-ne p4, v1, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-virtual {p6, p4}, Lcom/google/android/exoplayer2/Timeline;->m(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_2
    return-object p0
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
.end method

.method private v()J
    .locals 5

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    iget-object v2, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    iget-object v2, v2, Lh8/s;->a:Ljava/lang/Object;

    iget-wide v3, v0, Lcom/google/android/exoplayer2/q0;->r:J

    invoke-direct {p0, v1, v2, v3, v4}, Lcom/google/android/exoplayer2/g0;->x(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method private v0(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-interface {v0, v1}, Lf9/m;->j(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 8
    .line 9
    add-long/2addr p1, p3

    .line 10
    invoke-interface {v0, v1, p1, p2}, Lf9/m;->i(IJ)Z

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

.method private static w(La9/h;)[Ld7/k;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, La9/k;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    new-array v2, v1, [Ld7/k;

    .line 11
    .line 12
    :goto_1
    if-ge v0, v1, :cond_1

    .line 13
    .line 14
    invoke-interface {p0, v0}, La9/k;->e(I)Ld7/k;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aput-object v3, v2, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    return-object v2
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

.method private x(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 10
    .line 11
    invoke-virtual {p1, p2, v0}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 15
    .line 16
    iget-wide v0, p1, Lcom/google/android/exoplayer2/Timeline$c;->f:J

    .line 17
    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long p2, v0, v2

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$c;->f()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 34
    .line 35
    iget-boolean p2, p1, Lcom/google/android/exoplayer2/Timeline$c;->i:Z

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$c;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 45
    .line 46
    iget-wide v0, v0, Lcom/google/android/exoplayer2/Timeline$c;->f:J

    .line 47
    .line 48
    sub-long/2addr p1, v0

    .line 49
    invoke-static {p1, p2}, Ld7/c;->c(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline$b;->l()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    add-long/2addr p3, v0

    .line 60
    sub-long/2addr p1, p3

    .line 61
    return-wide p1

    .line 62
    :cond_1
    :goto_0
    return-wide v2
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

.method private x0(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 12
    .line 13
    iget-wide v3, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v1, p0

    .line 18
    move-object v2, v0

    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->A0(Lh8/u$a;JZZ)J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 24
    .line 25
    iget-wide v1, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 26
    .line 27
    cmp-long v1, v3, v1

    .line 28
    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 32
    .line 33
    iget-wide v5, v1, Lcom/google/android/exoplayer2/q0;->c:J

    .line 34
    .line 35
    move-object v1, p0

    .line 36
    move-object v2, v0

    .line 37
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 42
    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 46
    .line 47
    const/4 v0, 0x4

    .line 48
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 49
    .line 50
    .line 51
    :cond_0
    return-void
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

.method private y()J
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/j0;->l()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    iget-boolean v3, v0, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    return-wide v1

    .line 21
    :cond_1
    const/4 v3, 0x0

    .line 22
    :goto_0
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 23
    .line 24
    array-length v5, v4

    .line 25
    if-ge v3, v5, :cond_5

    .line 26
    .line 27
    aget-object v4, v4, v3

    .line 28
    .line 29
    invoke-static {v4}, Lcom/google/android/exoplayer2/g0;->M(Lcom/google/android/exoplayer2/t0;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 36
    .line 37
    aget-object v4, v4, v3

    .line 38
    .line 39
    invoke-interface {v4}, Lcom/google/android/exoplayer2/t0;->s()Lh8/o0;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, v0, Lcom/google/android/exoplayer2/j0;->c:[Lh8/o0;

    .line 44
    .line 45
    aget-object v5, v5, v3

    .line 46
    .line 47
    if-eq v4, v5, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->k:[Lcom/google/android/exoplayer2/t0;

    .line 51
    .line 52
    aget-object v4, v4, v3

    .line 53
    .line 54
    invoke-interface {v4}, Lcom/google/android/exoplayer2/t0;->t()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    const-wide/high16 v6, -0x8000000000000000L

    .line 59
    .line 60
    cmp-long v8, v4, v6

    .line 61
    .line 62
    if-nez v8, :cond_3

    .line 63
    .line 64
    return-wide v6

    .line 65
    :cond_3
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    return-wide v1
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

.method private y0(Lcom/google/android/exoplayer2/g0$h;)V
    .locals 18

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 6
    .line 7
    const/4 v9, 0x1

    .line 8
    invoke-virtual {v1, v9}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    iget v4, v8, Lcom/google/android/exoplayer2/g0;->N:I

    .line 17
    .line 18
    iget-boolean v5, v8, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 19
    .line 20
    iget-object v6, v8, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 21
    .line 22
    iget-object v7, v8, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 23
    .line 24
    move-object/from16 v2, p1

    .line 25
    .line 26
    invoke-static/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0;->t0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/g0$h;ZIZLcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;)Landroid/util/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    iget-object v7, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 39
    .line 40
    iget-object v7, v7, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 41
    .line 42
    invoke-direct {v8, v7}, Lcom/google/android/exoplayer2/g0;->z(Lcom/google/android/exoplayer2/Timeline;)Landroid/util/Pair;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    iget-object v10, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v10, Lh8/u$a;

    .line 49
    .line 50
    iget-object v7, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v11

    .line 58
    iget-object v7, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 59
    .line 60
    iget-object v7, v7, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 61
    .line 62
    invoke-virtual {v7}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    xor-int/2addr v7, v9

    .line 67
    move-wide v13, v4

    .line 68
    goto :goto_3

    .line 69
    :cond_0
    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 70
    .line 71
    iget-object v10, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Ljava/lang/Long;

    .line 74
    .line 75
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 76
    .line 77
    .line 78
    move-result-wide v11

    .line 79
    iget-wide v13, v0, Lcom/google/android/exoplayer2/g0$h;->c:J

    .line 80
    .line 81
    cmp-long v10, v13, v4

    .line 82
    .line 83
    if-nez v10, :cond_1

    .line 84
    .line 85
    move-wide v13, v4

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    move-wide v13, v11

    .line 88
    :goto_0
    iget-object v10, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 89
    .line 90
    iget-object v15, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 91
    .line 92
    iget-object v15, v15, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 93
    .line 94
    invoke-virtual {v10, v15, v7, v11, v12}, Lcom/google/android/exoplayer2/m0;->z(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)Lh8/u$a;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-virtual {v7}, Lh8/s;->b()Z

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    if-eqz v10, :cond_3

    .line 103
    .line 104
    iget-object v4, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 105
    .line 106
    iget-object v4, v4, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 107
    .line 108
    iget-object v5, v7, Lh8/s;->a:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v10, v8, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 111
    .line 112
    invoke-virtual {v4, v5, v10}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 113
    .line 114
    .line 115
    iget-object v4, v8, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 116
    .line 117
    iget v5, v7, Lh8/s;->b:I

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Lcom/google/android/exoplayer2/Timeline$b;->i(I)I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    iget v5, v7, Lh8/s;->c:I

    .line 124
    .line 125
    if-ne v4, v5, :cond_2

    .line 126
    .line 127
    iget-object v4, v8, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 128
    .line 129
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline$b;->g()J

    .line 130
    .line 131
    .line 132
    move-result-wide v4

    .line 133
    move-wide v11, v4

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    const-wide/16 v11, 0x0

    .line 136
    .line 137
    :goto_1
    move-object v10, v7

    .line 138
    move v7, v9

    .line 139
    goto :goto_3

    .line 140
    :cond_3
    iget-wide v2, v0, Lcom/google/android/exoplayer2/g0$h;->c:J

    .line 141
    .line 142
    cmp-long v2, v2, v4

    .line 143
    .line 144
    if-nez v2, :cond_4

    .line 145
    .line 146
    move v2, v9

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move v2, v6

    .line 149
    :goto_2
    move-object v10, v7

    .line 150
    move v7, v2

    .line 151
    :goto_3
    const/4 v5, 0x2

    .line 152
    :try_start_0
    iget-object v2, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 153
    .line 154
    iget-object v2, v2, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 155
    .line 156
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_5

    .line 161
    .line 162
    iput-object v0, v8, Lcom/google/android/exoplayer2/g0;->T:Lcom/google/android/exoplayer2/g0$h;

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_5
    const/4 v0, 0x4

    .line 166
    if-nez v1, :cond_7

    .line 167
    .line 168
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 169
    .line 170
    iget v1, v1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 171
    .line 172
    if-eq v1, v9, :cond_6

    .line 173
    .line 174
    invoke-direct {v8, v0}, Lcom/google/android/exoplayer2/g0;->V0(I)V

    .line 175
    .line 176
    .line 177
    :cond_6
    invoke-direct {v8, v6, v9, v6, v9}, Lcom/google/android/exoplayer2/g0;->m0(ZZZZ)V

    .line 178
    .line 179
    .line 180
    :goto_4
    move v15, v5

    .line 181
    move-wide v3, v11

    .line 182
    goto/16 :goto_9

    .line 183
    .line 184
    :cond_7
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 185
    .line 186
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 187
    .line 188
    invoke-virtual {v10, v1}, Lh8/s;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_c

    .line 193
    .line 194
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    if-eqz v1, :cond_8

    .line 201
    .line 202
    iget-boolean v2, v1, Lcom/google/android/exoplayer2/j0;->d:Z

    .line 203
    .line 204
    if-eqz v2, :cond_8

    .line 205
    .line 206
    const-wide/16 v2, 0x0

    .line 207
    .line 208
    cmp-long v2, v11, v2

    .line 209
    .line 210
    if-eqz v2, :cond_8

    .line 211
    .line 212
    iget-object v1, v1, Lcom/google/android/exoplayer2/j0;->a:Lh8/r;

    .line 213
    .line 214
    iget-object v2, v8, Lcom/google/android/exoplayer2/g0;->F:Ld7/w;

    .line 215
    .line 216
    invoke-interface {v1, v11, v12, v2}, Lh8/r;->d(JLd7/w;)J

    .line 217
    .line 218
    .line 219
    move-result-wide v1

    .line 220
    goto :goto_5

    .line 221
    :cond_8
    move-wide v1, v11

    .line 222
    :goto_5
    invoke-static {v1, v2}, Ld7/c;->d(J)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    iget-object v15, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 227
    .line 228
    move-wide/from16 v16, v1

    .line 229
    .line 230
    iget-wide v0, v15, Lcom/google/android/exoplayer2/q0;->r:J

    .line 231
    .line 232
    invoke-static {v0, v1}, Ld7/c;->d(J)J

    .line 233
    .line 234
    .line 235
    move-result-wide v0

    .line 236
    cmp-long v0, v3, v0

    .line 237
    .line 238
    if-nez v0, :cond_b

    .line 239
    .line 240
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 241
    .line 242
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 243
    .line 244
    if-eq v1, v5, :cond_9

    .line 245
    .line 246
    const/4 v2, 0x3

    .line 247
    if-ne v1, v2, :cond_b

    .line 248
    .line 249
    :cond_9
    iget-wide v3, v0, Lcom/google/android/exoplayer2/q0;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 250
    .line 251
    move-object/from16 v1, p0

    .line 252
    .line 253
    move-object v2, v10

    .line 254
    move v15, v5

    .line 255
    move-wide v5, v13

    .line 256
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iput-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 261
    .line 262
    if-eqz v7, :cond_a

    .line 263
    .line 264
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 265
    .line 266
    invoke-virtual {v0, v15}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 267
    .line 268
    .line 269
    :cond_a
    return-void

    .line 270
    :cond_b
    move v15, v5

    .line 271
    move-wide/from16 v1, v16

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_c
    move v15, v5

    .line 275
    move-wide v1, v11

    .line 276
    :goto_6
    :try_start_1
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 277
    .line 278
    iget v0, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 279
    .line 280
    const/4 v3, 0x4

    .line 281
    if-ne v0, v3, :cond_d

    .line 282
    .line 283
    move v0, v9

    .line 284
    goto :goto_7

    .line 285
    :cond_d
    move v0, v6

    .line 286
    :goto_7
    invoke-direct {v8, v10, v1, v2, v0}, Lcom/google/android/exoplayer2/g0;->z0(Lh8/u$a;JZ)J

    .line 287
    .line 288
    .line 289
    move-result-wide v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 290
    cmp-long v0, v11, v16

    .line 291
    .line 292
    if-eqz v0, :cond_e

    .line 293
    .line 294
    goto :goto_8

    .line 295
    :cond_e
    move v9, v6

    .line 296
    :goto_8
    or-int/2addr v9, v7

    .line 297
    :try_start_2
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 298
    .line 299
    iget-object v4, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 300
    .line 301
    iget-object v5, v0, Lcom/google/android/exoplayer2/q0;->b:Lh8/u$a;

    .line 302
    .line 303
    move-object/from16 v1, p0

    .line 304
    .line 305
    move-object v2, v4

    .line 306
    move-object v3, v10

    .line 307
    move-wide v6, v13

    .line 308
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0;->h1(Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;Lcom/google/android/exoplayer2/Timeline;Lh8/u$a;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 309
    .line 310
    .line 311
    move v7, v9

    .line 312
    move-wide/from16 v3, v16

    .line 313
    .line 314
    :goto_9
    move-object/from16 v1, p0

    .line 315
    .line 316
    move-object v2, v10

    .line 317
    move-wide v5, v13

    .line 318
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iput-object v0, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 323
    .line 324
    if-eqz v7, :cond_f

    .line 325
    .line 326
    iget-object v0, v8, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 327
    .line 328
    invoke-virtual {v0, v15}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 329
    .line 330
    .line 331
    :cond_f
    return-void

    .line 332
    :catchall_0
    move-exception v0

    .line 333
    move v7, v9

    .line 334
    move-wide/from16 v3, v16

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :catchall_1
    move-exception v0

    .line 338
    goto :goto_a

    .line 339
    :catchall_2
    move-exception v0

    .line 340
    move v15, v5

    .line 341
    :goto_a
    move-wide v3, v11

    .line 342
    :goto_b
    move-object/from16 v1, p0

    .line 343
    .line 344
    move-object v2, v10

    .line 345
    move-wide v5, v13

    .line 346
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->J(Lh8/u$a;JJ)Lcom/google/android/exoplayer2/q0;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    iput-object v1, v8, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 351
    .line 352
    if-eqz v7, :cond_10

    .line 353
    .line 354
    iget-object v1, v8, Lcom/google/android/exoplayer2/g0;->H:Lcom/google/android/exoplayer2/g0$e;

    .line 355
    .line 356
    invoke-virtual {v1, v15}, Lcom/google/android/exoplayer2/g0$e;->e(I)V

    .line 357
    .line 358
    .line 359
    :cond_10
    throw v0
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

.method private z(Lcom/google/android/exoplayer2/Timeline;)Landroid/util/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Timeline;",
            ")",
            "Landroid/util/Pair<",
            "Lh8/u$a;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/android/exoplayer2/q0;->l()Lh8/u$a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->O:Z

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->t:Lcom/google/android/exoplayer2/Timeline$c;

    .line 29
    .line 30
    iget-object v5, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 31
    .line 32
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    invoke-virtual/range {v3 .. v8}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v3, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 43
    .line 44
    iget-object v4, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v3, p1, v4, v1, v2}, Lcom/google/android/exoplayer2/m0;->z(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;J)Lh8/u$a;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    invoke-virtual {v3}, Lh8/s;->b()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    iget-object v0, v3, Lh8/s;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 67
    .line 68
    invoke-virtual {p1, v0, v4}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 69
    .line 70
    .line 71
    iget p1, v3, Lh8/s;->c:I

    .line 72
    .line 73
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 74
    .line 75
    iget v4, v3, Lh8/s;->b:I

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Lcom/google/android/exoplayer2/Timeline$b;->i(I)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ne p1, v0, :cond_1

    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/exoplayer2/g0;->u:Lcom/google/android/exoplayer2/Timeline$b;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$b;->g()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    :cond_1
    move-wide v4, v1

    .line 90
    :cond_2
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-static {v3, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1
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

.method private z0(Lh8/u$a;JZ)J
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    move v5, v0

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move-wide v3, p2

    .line 22
    move v6, p4

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/google/android/exoplayer2/g0;->A0(Lh8/u$a;JZZ)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1
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


# virtual methods
.method public A()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->s:Landroid/os/Looper;

    return-object v0
.end method

.method public I0(Ljava/util/List;IJLh8/q0;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/p0$c;",
            ">;IJ",
            "Lh8/q0;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    new-instance v8, Lcom/google/android/exoplayer2/g0$b;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    move-object v1, v8

    .line 7
    move-object v2, p1

    .line 8
    move-object v3, p5

    .line 9
    move v4, p2

    .line 10
    move-wide v5, p3

    .line 11
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/g0$b;-><init>(Ljava/util/List;Lh8/q0;IJLcom/google/android/exoplayer2/g0$a;)V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x11

    .line 15
    .line 16
    invoke-interface {v0, p1, v8}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 21
    .line 22
    .line 23
    return-void
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
.end method

.method public L0(ZI)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-interface {v0, v1, p1, p2}, Lf9/m;->g(III)Landroid/os/Message;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

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

.method public N0(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/4 v1, 0x4

    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public P0(I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-interface {v0, v1, p1, v2}, Lf9/m;->g(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public S0(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-interface {v0, v2, p1, v1}, Lf9/m;->g(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/16 v1, 0xa

    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/16 v1, 0x16

    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    return-void
.end method

.method public declared-synchronized d(Lcom/google/android/exoplayer2/r0;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->I:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->r:Landroid/os/HandlerThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 16
    .line 17
    const/16 v1, 0xe

    .line 18
    .line 19
    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :cond_1
    :goto_0
    :try_start_1
    const-string v0, "ExoPlayerImplInternal"

    .line 29
    .line 30
    const-string v1, "Ignoring messages sent after release."

    .line 31
    .line 32
    invoke-static {v0, v1}, Lf9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/r0;->k(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit p0

    .line 43
    throw p1
    .line 44
    .line 45
    .line 46
.end method

.method public d0(Lh8/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/16 v1, 0x9

    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public d1()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/4 v1, 0x6

    invoke-interface {v0, v1}, Lf9/m;->b(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public e0()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lf9/m;->b(I)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public declared-synchronized g0()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->I:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->r:Landroid/os/HandlerThread;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    invoke-interface {v0, v1}, Lf9/m;->h(I)Z

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/google/android/exoplayer2/e0;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/google/android/exoplayer2/e0;-><init>(Lcom/google/android/exoplayer2/g0;)V

    .line 24
    .line 25
    .line 26
    iget-wide v1, p0, Lcom/google/android/exoplayer2/g0;->E:J

    .line 27
    .line 28
    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/exoplayer2/g0;->m1(Lac/n;J)V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/g0;->I:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return v0

    .line 35
    :cond_1
    :goto_0
    monitor-exit p0

    .line 36
    const/4 v0, 0x1

    .line 37
    return v0

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    monitor-exit p0

    .line 40
    throw v0
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    const-string v0, "Playback error"

    .line 2
    .line 3
    const-string v1, "ExoPlayerImplInternal"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    :try_start_0
    iget v4, p1, Landroid/os/Message;->what:I

    .line 8
    .line 9
    packed-switch v4, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    return v2

    .line 13
    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->l(Lcom/google/android/exoplayer2/ExoPlaybackException;)V

    .line 18
    .line 19
    .line 20
    goto/16 :goto_5

    .line 21
    .line 22
    :pswitch_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 23
    .line 24
    if-ne p1, v3, :cond_0

    .line 25
    .line 26
    move p1, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p1, v2

    .line 29
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->J0(Z)V

    .line 30
    .line 31
    .line 32
    goto/16 :goto_5

    .line 33
    .line 34
    :pswitch_2
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    move p1, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p1, v2

    .line 41
    :goto_1
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->K0(Z)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_5

    .line 45
    .line 46
    :pswitch_3
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->Y()V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lh8/q0;

    .line 54
    .line 55
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->U0(Lh8/q0;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :pswitch_5
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 61
    .line 62
    iget v5, p1, Landroid/os/Message;->arg2:I

    .line 63
    .line 64
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lh8/q0;

    .line 67
    .line 68
    invoke-direct {p0, v4, v5, p1}, Lcom/google/android/exoplayer2/g0;->i0(IILh8/q0;)V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Lcom/google/android/exoplayer2/g0$c;

    .line 76
    .line 77
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->Z(Lcom/google/android/exoplayer2/g0$c;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :pswitch_7
    iget-object v4, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v4, Lcom/google/android/exoplayer2/g0$b;

    .line 85
    .line 86
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 87
    .line 88
    invoke-direct {p0, v4, p1}, Lcom/google/android/exoplayer2/g0;->k(Lcom/google/android/exoplayer2/g0$b;I)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :pswitch_8
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, Lcom/google/android/exoplayer2/g0$b;

    .line 96
    .line 97
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->H0(Lcom/google/android/exoplayer2/g0$b;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :pswitch_9
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 105
    .line 106
    invoke-direct {p0, p1, v2}, Lcom/google/android/exoplayer2/g0;->I(Lcom/google/android/exoplayer2/PlaybackParameters;Z)V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_5

    .line 110
    .line 111
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p1, Lcom/google/android/exoplayer2/r0;

    .line 114
    .line 115
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->D0(Lcom/google/android/exoplayer2/r0;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_5

    .line 119
    .line 120
    :pswitch_b
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Lcom/google/android/exoplayer2/r0;

    .line 123
    .line 124
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->B0(Lcom/google/android/exoplayer2/r0;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_5

    .line 128
    .line 129
    :pswitch_c
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 130
    .line 131
    if-eqz v4, :cond_2

    .line 132
    .line 133
    move v4, v3

    .line 134
    goto :goto_2

    .line 135
    :cond_2
    move v4, v2

    .line 136
    :goto_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 139
    .line 140
    invoke-direct {p0, v4, p1}, Lcom/google/android/exoplayer2/g0;->G0(ZLjava/util/concurrent/atomic/AtomicBoolean;)V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_5

    .line 144
    .line 145
    :pswitch_d
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 146
    .line 147
    if-eqz p1, :cond_3

    .line 148
    .line 149
    move p1, v3

    .line 150
    goto :goto_3

    .line 151
    :cond_3
    move p1, v2

    .line 152
    :goto_3
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->T0(Z)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :pswitch_e
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 157
    .line 158
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->Q0(I)V

    .line 159
    .line 160
    .line 161
    goto :goto_5

    .line 162
    :pswitch_f
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->l0()V

    .line 163
    .line 164
    .line 165
    goto :goto_5

    .line 166
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Lh8/r;

    .line 169
    .line 170
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->D(Lh8/r;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :pswitch_11
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p1, Lh8/r;

    .line 177
    .line 178
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->G(Lh8/r;)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :pswitch_12
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->h0()V

    .line 183
    .line 184
    .line 185
    return v3

    .line 186
    :pswitch_13
    invoke-direct {p0, v2, v3}, Lcom/google/android/exoplayer2/g0;->e1(ZZ)V

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :pswitch_14
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p1, Ld7/w;

    .line 193
    .line 194
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->R0(Ld7/w;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :pswitch_15
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast p1, Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 201
    .line 202
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->O0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :pswitch_16
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p1, Lcom/google/android/exoplayer2/g0$h;

    .line 209
    .line 210
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/g0;->y0(Lcom/google/android/exoplayer2/g0$h;)V

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :pswitch_17
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->p()V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :pswitch_18
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 219
    .line 220
    if-eqz v4, :cond_4

    .line 221
    .line 222
    move v4, v3

    .line 223
    goto :goto_4

    .line 224
    :cond_4
    move v4, v2

    .line 225
    :goto_4
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 226
    .line 227
    invoke-direct {p0, v4, p1, v3, v3}, Lcom/google/android/exoplayer2/g0;->M0(ZIZI)V

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :pswitch_19
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->f0()V

    .line 232
    .line 233
    .line 234
    :goto_5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->R()V
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 235
    .line 236
    .line 237
    goto/16 :goto_7

    .line 238
    .line 239
    :catch_0
    move-exception p1

    .line 240
    invoke-static {p1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->e(Ljava/lang/RuntimeException;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {v1, v0, p1}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    invoke-direct {p0, v3, v2}, Lcom/google/android/exoplayer2/g0;->e1(ZZ)V

    .line 248
    .line 249
    .line 250
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 251
    .line 252
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 257
    .line 258
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->R()V

    .line 259
    .line 260
    .line 261
    goto/16 :goto_7

    .line 262
    .line 263
    :catch_1
    move-exception p1

    .line 264
    invoke-static {p1}, Lcom/google/android/exoplayer2/ExoPlaybackException;->d(Ljava/io/IOException;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 269
    .line 270
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/m0;->o()Lcom/google/android/exoplayer2/j0;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    if-eqz v4, :cond_5

    .line 275
    .line 276
    iget-object v4, v4, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 277
    .line 278
    iget-object v4, v4, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 279
    .line 280
    invoke-virtual {p1, v4}, Lcom/google/android/exoplayer2/ExoPlaybackException;->a(Lh8/s;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    :cond_5
    invoke-static {v1, v0, p1}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p0, v2, v2}, Lcom/google/android/exoplayer2/g0;->e1(ZZ)V

    .line 288
    .line 289
    .line 290
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 291
    .line 292
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 297
    .line 298
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->R()V

    .line 299
    .line 300
    .line 301
    goto :goto_7

    .line 302
    :catch_2
    move-exception p1

    .line 303
    iget v4, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->k:I

    .line 304
    .line 305
    if-ne v4, v3, :cond_6

    .line 306
    .line 307
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->B:Lcom/google/android/exoplayer2/m0;

    .line 308
    .line 309
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/m0;->p()Lcom/google/android/exoplayer2/j0;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    if-eqz v4, :cond_6

    .line 314
    .line 315
    iget-object v4, v4, Lcom/google/android/exoplayer2/j0;->f:Lcom/google/android/exoplayer2/k0;

    .line 316
    .line 317
    iget-object v4, v4, Lcom/google/android/exoplayer2/k0;->a:Lh8/u$a;

    .line 318
    .line 319
    invoke-virtual {p1, v4}, Lcom/google/android/exoplayer2/ExoPlaybackException;->a(Lh8/s;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    :cond_6
    iget-boolean v4, p1, Lcom/google/android/exoplayer2/ExoPlaybackException;->r:Z

    .line 324
    .line 325
    if-eqz v4, :cond_7

    .line 326
    .line 327
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 328
    .line 329
    if-nez v4, :cond_7

    .line 330
    .line 331
    const-string v0, "Recoverable playback error"

    .line 332
    .line 333
    invoke-static {v1, v0, p1}, Lf9/r;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 334
    .line 335
    .line 336
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 337
    .line 338
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 339
    .line 340
    const/16 v1, 0x19

    .line 341
    .line 342
    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    invoke-virtual {p1}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_6

    .line 354
    :cond_7
    iget-object v4, p0, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 355
    .line 356
    if-eqz v4, :cond_8

    .line 357
    .line 358
    invoke-virtual {p1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 359
    .line 360
    .line 361
    const/4 v4, 0x0

    .line 362
    iput-object v4, p0, Lcom/google/android/exoplayer2/g0;->X:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 363
    .line 364
    :cond_8
    invoke-static {v1, v0, p1}, Lf9/r;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 365
    .line 366
    .line 367
    invoke-direct {p0, v3, v2}, Lcom/google/android/exoplayer2/g0;->e1(ZZ)V

    .line 368
    .line 369
    .line 370
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 371
    .line 372
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iput-object p1, p0, Lcom/google/android/exoplayer2/g0;->G:Lcom/google/android/exoplayer2/q0;

    .line 377
    .line 378
    :goto_6
    invoke-direct {p0}, Lcom/google/android/exoplayer2/g0;->R()V

    .line 379
    .line 380
    .line 381
    :goto_7
    return v3

    .line 382
    nop

    .line 383
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public i(Lh8/r;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method

.method public bridge synthetic j(Lh8/p0;)V
    .locals 0

    check-cast p1, Lh8/r;

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/g0;->d0(Lh8/r;)V

    return-void
.end method

.method public j0(IILh8/q0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-interface {v0, v1, p1, p2, p3}, Lf9/m;->d(IIILjava/lang/Object;)Landroid/os/Message;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

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

.method public onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-interface {v0, v1, p1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

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

.method public w0(Lcom/google/android/exoplayer2/Timeline;IJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/g0;->q:Lf9/m;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/exoplayer2/g0$h;

    .line 4
    .line 5
    invoke-direct {v1, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/g0$h;-><init>(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    invoke-interface {v0, p1, v1}, Lf9/m;->e(ILjava/lang/Object;)Landroid/os/Message;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 14
    .line 15
    .line 16
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
