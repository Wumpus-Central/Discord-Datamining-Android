.class final Lcom/google/android/exoplayer2/d0;
.super Lcom/google/android/exoplayer2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/d0$a;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field final b:Lb9/n;

.field private final c:[Lcom/google/android/exoplayer2/t0;

.field private final d:Lb9/m;

.field private final e:Lg9/m;

.field private final f:Lcom/google/android/exoplayer2/g0$f;

.field private final g:Lcom/google/android/exoplayer2/g0;

.field private final h:Lg9/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg9/q<",
            "Lcom/google/android/exoplayer2/Player$a;",
            "Lcom/google/android/exoplayer2/Player$Events;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Lcom/google/android/exoplayer2/Timeline$b;

.field private final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Z

.field private final l:Li8/c0;

.field private final m:Lf7/d1;

.field private final n:Landroid/os/Looper;

.field private final o:Le9/e;

.field private final p:Lg9/c;

.field private q:I

.field private r:Z

.field private s:I

.field private t:Z

.field private u:I

.field private v:I

.field private w:Le7/w;

.field private x:Li8/q0;

.field private y:Z

.field private z:Lcom/google/android/exoplayer2/q0;


# direct methods
.method public constructor <init>([Lcom/google/android/exoplayer2/t0;Lb9/m;Li8/c0;Le7/n;Le9/e;Lf7/d1;ZLe7/w;Lcom/google/android/exoplayer2/h0;JZLg9/c;Landroid/os/Looper;Lcom/google/android/exoplayer2/Player;)V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HandlerLeak"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v9, p6

    move-object/from16 v15, p13

    move-object/from16 v14, p14

    .line 1
    invoke-direct/range {p0 .. p0}, Lcom/google/android/exoplayer2/e;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Init "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    invoke-static/range {p0 .. p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "ExoPlayerLib/2.13.3"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lg9/q0;->e:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "]"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "ExoPlayerImpl"

    .line 4
    invoke-static {v3, v1}, Lg9/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    array-length v1, v2

    const/4 v3, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-static {v1}, Lg9/a;->f(Z)V

    .line 6
    invoke-static/range {p1 .. p1}, Lg9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/exoplayer2/t0;

    iput-object v1, v0, Lcom/google/android/exoplayer2/d0;->c:[Lcom/google/android/exoplayer2/t0;

    .line 7
    invoke-static/range {p2 .. p2}, Lg9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb9/m;

    iput-object v1, v0, Lcom/google/android/exoplayer2/d0;->d:Lb9/m;

    move-object/from16 v1, p3

    .line 8
    iput-object v1, v0, Lcom/google/android/exoplayer2/d0;->l:Li8/c0;

    .line 9
    iput-object v6, v0, Lcom/google/android/exoplayer2/d0;->o:Le9/e;

    .line 10
    iput-object v9, v0, Lcom/google/android/exoplayer2/d0;->m:Lf7/d1;

    move/from16 v1, p7

    .line 11
    iput-boolean v1, v0, Lcom/google/android/exoplayer2/d0;->k:Z

    move-object/from16 v10, p8

    .line 12
    iput-object v10, v0, Lcom/google/android/exoplayer2/d0;->w:Le7/w;

    move/from16 v12, p12

    .line 13
    iput-boolean v12, v0, Lcom/google/android/exoplayer2/d0;->y:Z

    .line 14
    iput-object v14, v0, Lcom/google/android/exoplayer2/d0;->n:Landroid/os/Looper;

    .line 15
    iput-object v15, v0, Lcom/google/android/exoplayer2/d0;->p:Lg9/c;

    .line 16
    iput v3, v0, Lcom/google/android/exoplayer2/d0;->q:I

    if-eqz p15, :cond_1

    move-object/from16 v1, p15

    goto :goto_1

    :cond_1
    move-object v1, v0

    .line 17
    :goto_1
    new-instance v4, Lg9/q;

    new-instance v5, Le7/g;

    invoke-direct {v5}, Le7/g;-><init>()V

    new-instance v7, Lcom/google/android/exoplayer2/s;

    invoke-direct {v7, v1}, Lcom/google/android/exoplayer2/s;-><init>(Lcom/google/android/exoplayer2/Player;)V

    invoke-direct {v4, v14, v15, v5, v7}, Lg9/q;-><init>(Landroid/os/Looper;Lg9/c;Lbc/n;Lg9/q$b;)V

    iput-object v4, v0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 18
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 19
    new-instance v4, Li8/q0$a;

    invoke-direct {v4, v3}, Li8/q0$a;-><init>(I)V

    iput-object v4, v0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 20
    new-instance v4, Lb9/n;

    array-length v3, v2

    new-array v3, v3, [Le7/u;

    array-length v5, v2

    new-array v5, v5, [Lb9/h;

    const/4 v7, 0x0

    invoke-direct {v4, v3, v5, v7}, Lb9/n;-><init>([Le7/u;[Lb9/h;Ljava/lang/Object;)V

    iput-object v4, v0, Lcom/google/android/exoplayer2/d0;->b:Lb9/n;

    .line 21
    new-instance v3, Lcom/google/android/exoplayer2/Timeline$b;

    invoke-direct {v3}, Lcom/google/android/exoplayer2/Timeline$b;-><init>()V

    iput-object v3, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    const/4 v3, -0x1

    .line 22
    iput v3, v0, Lcom/google/android/exoplayer2/d0;->A:I

    .line 23
    invoke-interface {v15, v14, v7}, Lg9/c;->c(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lg9/m;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/d0;->e:Lg9/m;

    .line 24
    new-instance v13, Lcom/google/android/exoplayer2/w;

    invoke-direct {v13, v0}, Lcom/google/android/exoplayer2/w;-><init>(Lcom/google/android/exoplayer2/d0;)V

    iput-object v13, v0, Lcom/google/android/exoplayer2/d0;->f:Lcom/google/android/exoplayer2/g0$f;

    .line 25
    invoke-static {v4}, Lcom/google/android/exoplayer2/q0;->k(Lb9/n;)Lcom/google/android/exoplayer2/q0;

    move-result-object v3

    iput-object v3, v0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    if-eqz v9, :cond_2

    .line 26
    invoke-virtual {v9, v1, v14}, Lf7/d1;->X1(Lcom/google/android/exoplayer2/Player;Landroid/os/Looper;)V

    .line 27
    invoke-virtual {v0, v9}, Lcom/google/android/exoplayer2/d0;->K(Lcom/google/android/exoplayer2/Player$a;)V

    .line 28
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-interface {v6, v1, v9}, Le9/e;->g(Landroid/os/Handler;Le9/e$a;)V

    .line 29
    :cond_2
    new-instance v11, Lcom/google/android/exoplayer2/g0;

    move-object v1, v11

    iget v7, v0, Lcom/google/android/exoplayer2/d0;->q:I

    iget-boolean v8, v0, Lcom/google/android/exoplayer2/d0;->r:Z

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p8

    move-object/from16 v18, v11

    move-object/from16 v11, p9

    move-object/from16 v17, v13

    move-wide/from16 v12, p10

    move/from16 v14, p12

    move-object/from16 v15, p14

    move-object/from16 v16, p13

    invoke-direct/range {v1 .. v17}, Lcom/google/android/exoplayer2/g0;-><init>([Lcom/google/android/exoplayer2/t0;Lb9/m;Lb9/n;Le7/n;Le9/e;IZLf7/d1;Le7/w;Lcom/google/android/exoplayer2/h0;JZLandroid/os/Looper;Lg9/c;Lcom/google/android/exoplayer2/g0$f;)V

    move-object/from16 v1, v18

    iput-object v1, v0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    return-void
.end method

.method private B0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/q0;ZIZ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/q0;",
            "Lcom/google/android/exoplayer2/q0;",
            "ZIZ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p2, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, -0x1

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    new-instance p1, Landroid/util/Pair;

    .line 23
    .line 24
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x3

    .line 39
    if-eq v2, v4, :cond_1

    .line 40
    .line 41
    new-instance p1, Landroid/util/Pair;

    .line 42
    .line 43
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    iget-object p2, p2, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 54
    .line 55
    iget-object p2, p2, Li8/s;->a:Ljava/lang/Object;

    .line 56
    .line 57
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 58
    .line 59
    invoke-virtual {v0, p2, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 64
    .line 65
    iget-object v2, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 66
    .line 67
    invoke-virtual {v0, p2, v2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget-object p2, p2, Lcom/google/android/exoplayer2/Timeline$c;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v0, p1, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 74
    .line 75
    iget-object v0, v0, Li8/s;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 78
    .line 79
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 84
    .line 85
    iget-object v2, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 86
    .line 87
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, Lcom/google/android/exoplayer2/Timeline$c;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 94
    .line 95
    iget v2, v2, Lcom/google/android/exoplayer2/Timeline$c;->m:I

    .line 96
    .line 97
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_5

    .line 102
    .line 103
    const/4 p1, 0x1

    .line 104
    if-eqz p3, :cond_2

    .line 105
    .line 106
    if-nez p4, :cond_2

    .line 107
    .line 108
    move v5, p1

    .line 109
    goto :goto_0

    .line 110
    :cond_2
    if-eqz p3, :cond_3

    .line 111
    .line 112
    if-ne p4, p1, :cond_3

    .line 113
    .line 114
    const/4 v5, 0x2

    .line 115
    goto :goto_0

    .line 116
    :cond_3
    if-eqz p5, :cond_4

    .line 117
    .line 118
    :goto_0
    new-instance p1, Landroid/util/Pair;

    .line 119
    .line 120
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_5
    if-eqz p3, :cond_6

    .line 137
    .line 138
    if-nez p4, :cond_6

    .line 139
    .line 140
    iget-object p1, p1, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 141
    .line 142
    iget-object p1, p1, Li8/s;->a:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-virtual {v1, p1}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-ne p1, v2, :cond_6

    .line 149
    .line 150
    new-instance p1, Landroid/util/Pair;

    .line 151
    .line 152
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 153
    .line 154
    const/4 p3, 0x0

    .line 155
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-direct {p1, p2, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :cond_6
    new-instance p1, Landroid/util/Pair;

    .line 164
    .line 165
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-direct {p1, p2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    return-object p1
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

.method private D0()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->A:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 19
    .line 20
    iget-object v0, v0, Li8/s;->a:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 29
    .line 30
    return v0
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

.method private E0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Landroid/util/Pair;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Timeline;",
            "Lcom/google/android/exoplayer2/Timeline;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->M()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v5, -0x1

    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 25
    .line 26
    .line 27
    move-result v9

    .line 28
    iget-object v7, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 29
    .line 30
    iget-object v8, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 31
    .line 32
    invoke-static {v0, v1}, Le7/c;->c(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v10

    .line 36
    move-object v6, p1

    .line 37
    invoke-virtual/range {v6 .. v11}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-static {v0}, Lg9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/util/Pair;

    .line 46
    .line 47
    iget-object v10, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 48
    .line 49
    invoke-virtual {p2, v10}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eq v1, v5, :cond_1

    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_1
    iget-object v6, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 57
    .line 58
    iget-object v7, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 59
    .line 60
    iget v8, p0, Lcom/google/android/exoplayer2/d0;->q:I

    .line 61
    .line 62
    iget-boolean v9, p0, Lcom/google/android/exoplayer2/d0;->r:Z

    .line 63
    .line 64
    move-object v11, p1

    .line 65
    move-object v12, p2

    .line 66
    invoke-static/range {v6 .. v12}, Lcom/google/android/exoplayer2/g0;->u0(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IZLjava/lang/Object;Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 73
    .line 74
    invoke-virtual {p2, p1, v0}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 78
    .line 79
    iget p1, p1, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 80
    .line 81
    iget-object v0, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 82
    .line 83
    invoke-virtual {p2, p1, v0}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline$c;->b()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    invoke-direct {p0, p2, p1, v0, v1}, Lcom/google/android/exoplayer2/d0;->F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1

    .line 96
    :cond_2
    invoke-direct {p0, p2, v5, v3, v4}, Lcom/google/android/exoplayer2/d0;->F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    return-object p1

    .line 101
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-nez p1, :cond_4

    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    goto :goto_1

    .line 115
    :cond_4
    const/4 p1, 0x0

    .line 116
    :goto_1
    if-eqz p1, :cond_5

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    invoke-direct {p0}, Lcom/google/android/exoplayer2/d0;->D0()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    :goto_2
    if-eqz p1, :cond_6

    .line 124
    .line 125
    move-wide v0, v3

    .line 126
    :cond_6
    invoke-direct {p0, p2, v5, v0, v1}, Lcom/google/android/exoplayer2/d0;->F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    return-object p1
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

.method private F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/Timeline;",
            "IJ)",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
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
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iput p2, p0, Lcom/google/android/exoplayer2/d0;->A:I

    .line 8
    .line 9
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long p1, p3, p1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const-wide/16 p3, 0x0

    .line 19
    .line 20
    :cond_0
    iput-wide p3, p0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput p1, p0, Lcom/google/android/exoplayer2/d0;->B:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    return-object p1

    .line 27
    :cond_1
    const/4 v0, -0x1

    .line 28
    if-eq p2, v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline;->p()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lt p2, v0, :cond_3

    .line 35
    .line 36
    :cond_2
    iget-boolean p2, p0, Lcom/google/android/exoplayer2/d0;->r:Z

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    iget-object p3, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 43
    .line 44
    invoke-virtual {p1, p2, p3}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-virtual {p3}, Lcom/google/android/exoplayer2/Timeline$c;->b()J

    .line 49
    .line 50
    .line 51
    move-result-wide p3

    .line 52
    :cond_3
    move v3, p2

    .line 53
    iget-object v1, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 54
    .line 55
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 56
    .line 57
    invoke-static {p3, p4}, Le7/c;->c(J)J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    move-object v0, p1

    .line 62
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/exoplayer2/Timeline;->j(Lcom/google/android/exoplayer2/Timeline$c;Lcom/google/android/exoplayer2/Timeline$b;IJ)Landroid/util/Pair;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1
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

.method private H0(Lcom/google/android/exoplayer2/g0$e;)V
    .locals 11

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 2
    .line 3
    iget v1, p1, Lcom/google/android/exoplayer2/g0$e;->c:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iput v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 7
    .line 8
    iget-boolean v1, p1, Lcom/google/android/exoplayer2/g0$e;->d:Z

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iput-boolean v2, p0, Lcom/google/android/exoplayer2/d0;->t:Z

    .line 14
    .line 15
    iget v1, p1, Lcom/google/android/exoplayer2/g0$e;->e:I

    .line 16
    .line 17
    iput v1, p0, Lcom/google/android/exoplayer2/d0;->u:I

    .line 18
    .line 19
    :cond_0
    iget-boolean v1, p1, Lcom/google/android/exoplayer2/g0$e;->f:Z

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget v1, p1, Lcom/google/android/exoplayer2/g0$e;->g:I

    .line 24
    .line 25
    iput v1, p0, Lcom/google/android/exoplayer2/d0;->v:I

    .line 26
    .line 27
    :cond_1
    if-nez v0, :cond_5

    .line 28
    .line 29
    iget-object v0, p1, Lcom/google/android/exoplayer2/g0$e;->b:Lcom/google/android/exoplayer2/q0;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 32
    .line 33
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 34
    .line 35
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v3, 0x0

    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    const/4 v1, -0x1

    .line 51
    iput v1, p0, Lcom/google/android/exoplayer2/d0;->A:I

    .line 52
    .line 53
    const-wide/16 v4, 0x0

    .line 54
    .line 55
    iput-wide v4, p0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 56
    .line 57
    iput v3, p0, Lcom/google/android/exoplayer2/d0;->B:I

    .line 58
    .line 59
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    check-cast v0, Lcom/google/android/exoplayer2/s0;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/s0;->E()Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget-object v4, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-ne v1, v4, :cond_3

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move v2, v3

    .line 85
    :goto_0
    invoke-static {v2}, Lg9/a;->f(Z)V

    .line 86
    .line 87
    .line 88
    move v1, v3

    .line 89
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-ge v1, v2, :cond_4

    .line 94
    .line 95
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/google/android/exoplayer2/d0$a;

    .line 102
    .line 103
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    check-cast v4, Lcom/google/android/exoplayer2/Timeline;

    .line 108
    .line 109
    invoke-static {v2, v4}, Lcom/google/android/exoplayer2/d0$a;->c(Lcom/google/android/exoplayer2/d0$a;Lcom/google/android/exoplayer2/Timeline;)Lcom/google/android/exoplayer2/Timeline;

    .line 110
    .line 111
    .line 112
    add-int/lit8 v1, v1, 0x1

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_4
    iget-boolean v6, p0, Lcom/google/android/exoplayer2/d0;->t:Z

    .line 116
    .line 117
    iput-boolean v3, p0, Lcom/google/android/exoplayer2/d0;->t:Z

    .line 118
    .line 119
    iget-object v5, p1, Lcom/google/android/exoplayer2/g0$e;->b:Lcom/google/android/exoplayer2/q0;

    .line 120
    .line 121
    iget v7, p0, Lcom/google/android/exoplayer2/d0;->u:I

    .line 122
    .line 123
    const/4 v8, 0x1

    .line 124
    iget v9, p0, Lcom/google/android/exoplayer2/d0;->v:I

    .line 125
    .line 126
    const/4 v10, 0x0

    .line 127
    move-object v4, p0

    .line 128
    invoke-direct/range {v4 .. v10}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 129
    .line 130
    .line 131
    :cond_5
    return-void
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

.method private static I0(Lcom/google/android/exoplayer2/q0;)Z
    .locals 2

    iget v0, p0, Lcom/google/android/exoplayer2/q0;->d:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/q0;->k:Z

    if-eqz v0, :cond_0

    iget p0, p0, Lcom/google/android/exoplayer2/q0;->l:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic J0(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 0

    invoke-interface {p1, p0, p2}, Lcom/google/android/exoplayer2/Player$a;->onEvents(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method

.method private synthetic K0(Lcom/google/android/exoplayer2/g0$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/d0;->H0(Lcom/google/android/exoplayer2/g0$e;)V

    return-void
.end method

.method private synthetic L0(Lcom/google/android/exoplayer2/g0$e;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->e:Lg9/m;

    new-instance v1, Lcom/google/android/exoplayer2/u;

    invoke-direct {v1, p0, p1}, Lcom/google/android/exoplayer2/u;-><init>(Lcom/google/android/exoplayer2/d0;Lcom/google/android/exoplayer2/g0$e;)V

    invoke-interface {v0, v1}, Lg9/m;->a(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static synthetic M0(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 2

    .line 1
    new-instance v0, Le7/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Le7/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/google/android/exoplayer2/ExoPlaybackException;->b(Ljava/lang/Exception;)Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p0, v0}, Lcom/google/android/exoplayer2/Player$a;->onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V

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

.method private static synthetic N0(ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onRepeatModeChanged(I)V

    return-void
.end method

.method private static synthetic O0(ZLcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onShuffleModeEnabledChanged(Z)V

    return-void
.end method

.method private static synthetic P0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    invoke-interface {p2, p0, p1}, Lcom/google/android/exoplayer2/Player$a;->onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V

    return-void
.end method

.method private static synthetic Q0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onStaticMetadataChanged(Ljava/util/List;)V

    return-void
.end method

.method private static synthetic R0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/q0;->f:Z

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onIsLoadingChanged(Z)V

    return-void
.end method

.method private static synthetic S0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/q0;->k:Z

    iget p0, p0, Lcom/google/android/exoplayer2/q0;->d:I

    invoke-interface {p1, v0, p0}, Lcom/google/android/exoplayer2/Player$a;->onPlayerStateChanged(ZI)V

    return-void
.end method

.method private static synthetic T0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/q0;->d:I

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onPlaybackStateChanged(I)V

    return-void
.end method

.method private static synthetic U0(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/q0;->k:Z

    invoke-interface {p2, p0, p1}, Lcom/google/android/exoplayer2/Player$a;->onPlayWhenReadyChanged(ZI)V

    return-void
.end method

.method private static synthetic V0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget p0, p0, Lcom/google/android/exoplayer2/q0;->l:I

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onPlaybackSuppressionReasonChanged(I)V

    return-void
.end method

.method private static synthetic W0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/exoplayer2/d0;->I0(Lcom/google/android/exoplayer2/q0;)Z

    move-result p0

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onIsPlayingChanged(Z)V

    return-void
.end method

.method private static synthetic X0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    return-void
.end method

.method private static synthetic Y0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/q0;->n:Z

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onExperimentalOffloadSchedulingEnabledChanged(Z)V

    return-void
.end method

.method private static synthetic Z0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/q0;->o:Z

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onExperimentalSleepingForOffloadChanged(Z)V

    return-void
.end method

.method private static synthetic a1(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    invoke-interface {p2, p0, p1}, Lcom/google/android/exoplayer2/Player$a;->onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;I)V

    return-void
.end method

.method private static synthetic b1(ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onPositionDiscontinuity(I)V

    return-void
.end method

.method private static synthetic c1(Lcom/google/android/exoplayer2/MediaItem;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-interface {p2, p0, p1}, Lcom/google/android/exoplayer2/Player$a;->onMediaItemTransition(Lcom/google/android/exoplayer2/MediaItem;I)V

    return-void
.end method

.method public static synthetic d0(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->a1(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private static synthetic d1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    invoke-interface {p1, p0}, Lcom/google/android/exoplayer2/Player$a;->onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V

    return-void
.end method

.method public static synthetic e0(ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->b1(ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private e1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline;Landroid/util/Pair;)Lcom/google/android/exoplayer2/q0;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/exoplayer2/q0;",
            "Lcom/google/android/exoplayer2/Timeline;",
            "Landroid/util/Pair<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/android/exoplayer2/q0;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    move v3, v4

    .line 20
    :goto_1
    invoke-static {v3}, Lg9/a;->a(Z)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v3, p1

    .line 24
    .line 25
    iget-object v5, v3, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 26
    .line 27
    invoke-virtual/range {p1 .. p2}, Lcom/google/android/exoplayer2/q0;->j(Lcom/google/android/exoplayer2/Timeline;)Lcom/google/android/exoplayer2/q0;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-static {}, Lcom/google/android/exoplayer2/q0;->l()Li8/u$a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-wide v2, v0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 42
    .line 43
    invoke-static {v2, v3}, Le7/c;->c(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    iget-wide v2, v0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 48
    .line 49
    invoke-static {v2, v3}, Le7/c;->c(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v10

    .line 53
    const-wide/16 v12, 0x0

    .line 54
    .line 55
    sget-object v14, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 56
    .line 57
    iget-object v15, v0, Lcom/google/android/exoplayer2/d0;->b:Lb9/n;

    .line 58
    .line 59
    invoke-static {}, Lcc/i0;->x()Lcc/i0;

    .line 60
    .line 61
    .line 62
    move-result-object v16

    .line 63
    move-object v7, v1

    .line 64
    invoke-virtual/range {v6 .. v16}, Lcom/google/android/exoplayer2/q0;->c(Li8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;Lb9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, v1}, Lcom/google/android/exoplayer2/q0;->b(Li8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-wide v2, v1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 73
    .line 74
    iput-wide v2, v1, Lcom/google/android/exoplayer2/q0;->p:J

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_2
    iget-object v3, v6, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 78
    .line 79
    iget-object v3, v3, Li8/s;->a:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-static/range {p3 .. p3}, Lg9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Landroid/util/Pair;

    .line 86
    .line 87
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    xor-int/2addr v7, v4

    .line 94
    if-eqz v7, :cond_3

    .line 95
    .line 96
    new-instance v8, Li8/u$a;

    .line 97
    .line 98
    iget-object v9, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-direct {v8, v9}, Li8/u$a;-><init>(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_3
    iget-object v8, v6, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 105
    .line 106
    :goto_2
    move-object v15, v8

    .line 107
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Ljava/lang/Long;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v12

    .line 115
    invoke-virtual/range {p0 .. p0}, Lcom/google/android/exoplayer2/d0;->M()J

    .line 116
    .line 117
    .line 118
    move-result-wide v8

    .line 119
    invoke-static {v8, v9}, Le7/c;->c(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    invoke-virtual {v5}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    iget-object v2, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 130
    .line 131
    invoke-virtual {v5, v3, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Lcom/google/android/exoplayer2/Timeline$b;->l()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    sub-long/2addr v8, v2

    .line 140
    :cond_4
    if-nez v7, :cond_a

    .line 141
    .line 142
    cmp-long v2, v12, v8

    .line 143
    .line 144
    if-gez v2, :cond_5

    .line 145
    .line 146
    goto/16 :goto_4

    .line 147
    .line 148
    :cond_5
    if-nez v2, :cond_8

    .line 149
    .line 150
    iget-object v2, v6, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 151
    .line 152
    iget-object v2, v2, Li8/s;->a:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    const/4 v3, -0x1

    .line 159
    if-eq v2, v3, :cond_6

    .line 160
    .line 161
    iget-object v3, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 162
    .line 163
    invoke-virtual {v1, v2, v3}, Lcom/google/android/exoplayer2/Timeline;->f(ILcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    iget v2, v2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 168
    .line 169
    iget-object v3, v15, Li8/s;->a:Ljava/lang/Object;

    .line 170
    .line 171
    iget-object v4, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 172
    .line 173
    invoke-virtual {v1, v3, v4}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    iget v3, v3, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 178
    .line 179
    if-eq v2, v3, :cond_e

    .line 180
    .line 181
    :cond_6
    iget-object v2, v15, Li8/s;->a:Ljava/lang/Object;

    .line 182
    .line 183
    iget-object v3, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 184
    .line 185
    invoke-virtual {v1, v2, v3}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v15}, Li8/s;->b()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_7

    .line 193
    .line 194
    iget-object v1, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 195
    .line 196
    iget v2, v15, Li8/s;->b:I

    .line 197
    .line 198
    iget v3, v15, Li8/s;->c:I

    .line 199
    .line 200
    invoke-virtual {v1, v2, v3}, Lcom/google/android/exoplayer2/Timeline$b;->b(II)J

    .line 201
    .line 202
    .line 203
    move-result-wide v1

    .line 204
    goto :goto_3

    .line 205
    :cond_7
    iget-object v1, v0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 206
    .line 207
    iget-wide v1, v1, Lcom/google/android/exoplayer2/Timeline$b;->d:J

    .line 208
    .line 209
    :goto_3
    iget-wide v8, v6, Lcom/google/android/exoplayer2/q0;->r:J

    .line 210
    .line 211
    iget-wide v10, v6, Lcom/google/android/exoplayer2/q0;->r:J

    .line 212
    .line 213
    iget-wide v3, v6, Lcom/google/android/exoplayer2/q0;->r:J

    .line 214
    .line 215
    sub-long v12, v1, v3

    .line 216
    .line 217
    iget-object v14, v6, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 218
    .line 219
    iget-object v3, v6, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 220
    .line 221
    iget-object v4, v6, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 222
    .line 223
    move-object v7, v15

    .line 224
    move-object v5, v15

    .line 225
    move-object v15, v3

    .line 226
    move-object/from16 v16, v4

    .line 227
    .line 228
    invoke-virtual/range {v6 .. v16}, Lcom/google/android/exoplayer2/q0;->c(Li8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;Lb9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3, v5}, Lcom/google/android/exoplayer2/q0;->b(Li8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    iput-wide v1, v6, Lcom/google/android/exoplayer2/q0;->p:J

    .line 237
    .line 238
    goto/16 :goto_8

    .line 239
    .line 240
    :cond_8
    move-object v5, v15

    .line 241
    invoke-virtual {v5}, Li8/s;->b()Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    xor-int/2addr v1, v4

    .line 246
    invoke-static {v1}, Lg9/a;->f(Z)V

    .line 247
    .line 248
    .line 249
    iget-wide v1, v6, Lcom/google/android/exoplayer2/q0;->q:J

    .line 250
    .line 251
    sub-long v3, v12, v8

    .line 252
    .line 253
    sub-long/2addr v1, v3

    .line 254
    const-wide/16 v3, 0x0

    .line 255
    .line 256
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 257
    .line 258
    .line 259
    move-result-wide v1

    .line 260
    iget-wide v3, v6, Lcom/google/android/exoplayer2/q0;->p:J

    .line 261
    .line 262
    iget-object v7, v6, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 263
    .line 264
    iget-object v8, v6, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 265
    .line 266
    invoke-virtual {v7, v8}, Li8/s;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    if-eqz v7, :cond_9

    .line 271
    .line 272
    add-long v3, v12, v1

    .line 273
    .line 274
    :cond_9
    iget-object v14, v6, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 275
    .line 276
    iget-object v15, v6, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 277
    .line 278
    iget-object v10, v6, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 279
    .line 280
    move-object v7, v5

    .line 281
    move-wide v8, v12

    .line 282
    move-object v5, v10

    .line 283
    move-wide v10, v12

    .line 284
    move-wide v12, v1

    .line 285
    move-object/from16 v16, v5

    .line 286
    .line 287
    invoke-virtual/range {v6 .. v16}, Lcom/google/android/exoplayer2/q0;->c(Li8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;Lb9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    iput-wide v3, v6, Lcom/google/android/exoplayer2/q0;->p:J

    .line 292
    .line 293
    goto :goto_8

    .line 294
    :cond_a
    :goto_4
    move-object v5, v15

    .line 295
    invoke-virtual {v5}, Li8/s;->b()Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    xor-int/2addr v1, v4

    .line 300
    invoke-static {v1}, Lg9/a;->f(Z)V

    .line 301
    .line 302
    .line 303
    const-wide/16 v1, 0x0

    .line 304
    .line 305
    if-eqz v7, :cond_b

    .line 306
    .line 307
    sget-object v3, Lcom/google/android/exoplayer2/source/TrackGroupArray;->n:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_b
    iget-object v3, v6, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    .line 311
    .line 312
    :goto_5
    move-object v14, v3

    .line 313
    if-eqz v7, :cond_c

    .line 314
    .line 315
    iget-object v3, v0, Lcom/google/android/exoplayer2/d0;->b:Lb9/n;

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_c
    iget-object v3, v6, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 319
    .line 320
    :goto_6
    move-object v15, v3

    .line 321
    if-eqz v7, :cond_d

    .line 322
    .line 323
    invoke-static {}, Lcc/i0;->x()Lcc/i0;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    goto :goto_7

    .line 328
    :cond_d
    iget-object v3, v6, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 329
    .line 330
    :goto_7
    move-object/from16 v16, v3

    .line 331
    .line 332
    move-object v7, v5

    .line 333
    move-wide v8, v12

    .line 334
    move-wide v10, v12

    .line 335
    move-wide v3, v12

    .line 336
    move-wide v12, v1

    .line 337
    invoke-virtual/range {v6 .. v16}, Lcom/google/android/exoplayer2/q0;->c(Li8/u$a;JJJLcom/google/android/exoplayer2/source/TrackGroupArray;Lb9/n;Ljava/util/List;)Lcom/google/android/exoplayer2/q0;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1, v5}, Lcom/google/android/exoplayer2/q0;->b(Li8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    iput-wide v3, v6, Lcom/google/android/exoplayer2/q0;->p:J

    .line 346
    .line 347
    :cond_e
    :goto_8
    return-object v6
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
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
.end method

.method public static synthetic f0(ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->N0(ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private f1(Li8/u$a;J)J
    .locals 2

    .line 1
    invoke-static {p2, p3}, Le7/c;->d(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p2

    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    iget-object p1, p1, Li8/s;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 12
    .line 13
    invoke-virtual {v0, p1, v1}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/Timeline$b;->k()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    add-long/2addr p2, v0

    .line 23
    return-wide p2
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

.method public static synthetic g0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->R0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic h0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->Y0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private h1(II)Lcom/google/android/exoplayer2/q0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ltz p1, :cond_0

    .line 4
    .line 5
    if-lt p2, p1, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-gt p2, v2, :cond_0

    .line 14
    .line 15
    move v2, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v0

    .line 18
    :goto_0
    invoke-static {v2}, Lg9/a;->a(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->w()Lcom/google/android/exoplayer2/Timeline;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget v5, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 36
    .line 37
    add-int/2addr v5, v1

    .line 38
    iput v5, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 39
    .line 40
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->i1(II)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/google/android/exoplayer2/d0;->z0()Lcom/google/android/exoplayer2/Timeline;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v6, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 48
    .line 49
    invoke-direct {p0, v3, v5}, Lcom/google/android/exoplayer2/d0;->E0(Lcom/google/android/exoplayer2/Timeline;Lcom/google/android/exoplayer2/Timeline;)Landroid/util/Pair;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-direct {p0, v6, v5, v3}, Lcom/google/android/exoplayer2/d0;->e1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline;Landroid/util/Pair;)Lcom/google/android/exoplayer2/q0;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget v5, v3, Lcom/google/android/exoplayer2/q0;->d:I

    .line 58
    .line 59
    const/4 v6, 0x4

    .line 60
    if-eq v5, v1, :cond_1

    .line 61
    .line 62
    if-eq v5, v6, :cond_1

    .line 63
    .line 64
    if-ge p1, p2, :cond_1

    .line 65
    .line 66
    if-ne p2, v4, :cond_1

    .line 67
    .line 68
    iget-object v4, v3, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 69
    .line 70
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline;->p()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-lt v2, v4, :cond_1

    .line 75
    .line 76
    move v0, v1

    .line 77
    :cond_1
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {v3, v6}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    :cond_2
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 84
    .line 85
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 86
    .line 87
    invoke-virtual {v0, p1, p2, v1}, Lcom/google/android/exoplayer2/g0;->j0(IILi8/q0;)V

    .line 88
    .line 89
    .line 90
    return-object v3
    .line 91
    .line 92
    .line 93
.end method

.method public static synthetic i0(ZLcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->O0(ZLcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private i1(II)V
    .locals 2

    .line 1
    add-int/lit8 v0, p2, -0x1

    .line 2
    .line 3
    :goto_0
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Li8/q0;->a(II)Li8/q0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

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

.method public static synthetic j0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->W0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic k0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->Q0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic l0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->T0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic m0(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->J0(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method

.method public static synthetic n0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->P0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private n1(Ljava/util/List;IJZ)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li8/u;",
            ">;IJZ)V"
        }
    .end annotation

    .line 1
    move-object v7, p0

    .line 2
    move/from16 v0, p2

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/exoplayer2/d0;->D0()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->Y()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget v4, v7, Lcom/google/android/exoplayer2/d0;->s:I

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    add-int/2addr v4, v5

    .line 16
    iput v4, v7, Lcom/google/android/exoplayer2/d0;->s:I

    .line 17
    .line 18
    iget-object v4, v7, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/4 v6, 0x0

    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    iget-object v4, v7, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-direct {p0, v6, v4}, Lcom/google/android/exoplayer2/d0;->i1(II)V

    .line 34
    .line 35
    .line 36
    :cond_0
    move-object v4, p1

    .line 37
    invoke-direct {p0, v6, p1}, Lcom/google/android/exoplayer2/d0;->y0(ILjava/util/List;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-direct {p0}, Lcom/google/android/exoplayer2/d0;->z0()Lcom/google/android/exoplayer2/Timeline;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline;->p()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-ge v0, v6, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v1, Le7/m;

    .line 59
    .line 60
    move-wide/from16 v10, p3

    .line 61
    .line 62
    invoke-direct {v1, v4, v0, v10, v11}, Le7/m;-><init>(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_2
    :goto_0
    move-wide/from16 v10, p3

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    if-eqz p5, :cond_3

    .line 70
    .line 71
    iget-boolean v0, v7, Lcom/google/android/exoplayer2/d0;->r:Z

    .line 72
    .line 73
    invoke-virtual {v4, v0}, Lcom/google/android/exoplayer2/Timeline;->a(Z)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    move-wide v10, v1

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    if-ne v0, v6, :cond_4

    .line 85
    .line 86
    move v0, v1

    .line 87
    move-wide v10, v2

    .line 88
    :cond_4
    :goto_1
    iget-object v1, v7, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 89
    .line 90
    invoke-direct {p0, v4, v0, v10, v11}, Lcom/google/android/exoplayer2/d0;->F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {p0, v1, v4, v2}, Lcom/google/android/exoplayer2/d0;->e1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline;Landroid/util/Pair;)Lcom/google/android/exoplayer2/q0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget v2, v1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 99
    .line 100
    if-eq v0, v6, :cond_7

    .line 101
    .line 102
    if-eq v2, v5, :cond_7

    .line 103
    .line 104
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_6

    .line 109
    .line 110
    invoke-virtual {v4}, Lcom/google/android/exoplayer2/Timeline;->p()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-lt v0, v2, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    const/4 v2, 0x2

    .line 118
    goto :goto_3

    .line 119
    :cond_6
    :goto_2
    const/4 v2, 0x4

    .line 120
    :cond_7
    :goto_3
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    iget-object v8, v7, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 125
    .line 126
    invoke-static {v10, v11}, Le7/c;->c(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v11

    .line 130
    iget-object v13, v7, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 131
    .line 132
    move v10, v0

    .line 133
    invoke-virtual/range {v8 .. v13}, Lcom/google/android/exoplayer2/g0;->I0(Ljava/util/List;IJLi8/q0;)V

    .line 134
    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    const/4 v3, 0x4

    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x1

    .line 140
    const/4 v6, 0x0

    .line 141
    move-object v0, p0

    .line 142
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 143
    .line 144
    .line 145
    return-void
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

.method public static synthetic o0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->d1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic p0(Lcom/google/android/exoplayer2/d0;Lcom/google/android/exoplayer2/g0$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/d0;->L0(Lcom/google/android/exoplayer2/g0$e;)V

    return-void
.end method

.method public static synthetic q0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->S0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic r0(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/exoplayer2/d0;->M0(Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic s0(Lcom/google/android/exoplayer2/MediaItem;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->c1(Lcom/google/android/exoplayer2/MediaItem;ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V
    .locals 8

    .line 1
    iget-object v6, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 4
    .line 5
    iget-object v0, v6, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 6
    .line 7
    iget-object v1, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/Timeline;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v7, 0x1

    .line 14
    xor-int/lit8 v5, v0, 0x1

    .line 15
    .line 16
    move-object v0, p0

    .line 17
    move-object v1, p1

    .line 18
    move-object v2, v6

    .line 19
    move v3, p2

    .line 20
    move v4, p3

    .line 21
    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/d0;->B0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/q0;ZIZ)Landroid/util/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v2, v6, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 42
    .line 43
    iget-object v3, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Lcom/google/android/exoplayer2/Timeline;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 52
    .line 53
    new-instance v3, Lcom/google/android/exoplayer2/x;

    .line 54
    .line 55
    invoke-direct {v3, p1, p4}, Lcom/google/android/exoplayer2/x;-><init>(Lcom/google/android/exoplayer2/q0;I)V

    .line 56
    .line 57
    .line 58
    const/4 p4, 0x0

    .line 59
    invoke-virtual {v2, p4, v3}, Lg9/q;->i(ILg9/q$a;)V

    .line 60
    .line 61
    .line 62
    :cond_0
    if-eqz p2, :cond_1

    .line 63
    .line 64
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 65
    .line 66
    new-instance p4, Lcom/google/android/exoplayer2/i;

    .line 67
    .line 68
    invoke-direct {p4, p3}, Lcom/google/android/exoplayer2/i;-><init>(I)V

    .line 69
    .line 70
    .line 71
    const/16 p3, 0xc

    .line 72
    .line 73
    invoke-virtual {p2, p3, p4}, Lg9/q;->i(ILg9/q$a;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    if-eqz v1, :cond_3

    .line 77
    .line 78
    iget-object p2, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_2

    .line 85
    .line 86
    iget-object p2, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 87
    .line 88
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 89
    .line 90
    iget-object p3, p3, Li8/s;->a:Ljava/lang/Object;

    .line 91
    .line 92
    iget-object p4, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 93
    .line 94
    invoke-virtual {p2, p3, p4}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    iget p2, p2, Lcom/google/android/exoplayer2/Timeline$b;->c:I

    .line 99
    .line 100
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 101
    .line 102
    iget-object p4, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 103
    .line 104
    invoke-virtual {p3, p2, p4}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    iget-object p2, p2, Lcom/google/android/exoplayer2/Timeline$c;->c:Lcom/google/android/exoplayer2/MediaItem;

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const/4 p2, 0x0

    .line 112
    :goto_0
    iget-object p3, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 113
    .line 114
    new-instance p4, Lcom/google/android/exoplayer2/j;

    .line 115
    .line 116
    invoke-direct {p4, p2, v0}, Lcom/google/android/exoplayer2/j;-><init>(Lcom/google/android/exoplayer2/MediaItem;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p3, v7, p4}, Lg9/q;->i(ILg9/q$a;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    iget-object p2, v6, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 123
    .line 124
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    .line 125
    .line 126
    if-eq p2, p3, :cond_4

    .line 127
    .line 128
    if-eqz p3, :cond_4

    .line 129
    .line 130
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 131
    .line 132
    new-instance p3, Lcom/google/android/exoplayer2/k;

    .line 133
    .line 134
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/k;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 135
    .line 136
    .line 137
    const/16 p4, 0xb

    .line 138
    .line 139
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    iget-object p2, v6, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 143
    .line 144
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 145
    .line 146
    if-eq p2, p3, :cond_5

    .line 147
    .line 148
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->d:Lb9/m;

    .line 149
    .line 150
    iget-object p3, p3, Lb9/n;->d:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {p2, p3}, Lb9/m;->d(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    new-instance p2, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    .line 156
    .line 157
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    .line 158
    .line 159
    iget-object p3, p3, Lb9/n;->c:[Lb9/h;

    .line 160
    .line 161
    invoke-direct {p2, p3}, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;-><init>([Lb9/k;)V

    .line 162
    .line 163
    .line 164
    iget-object p3, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 165
    .line 166
    new-instance p4, Lcom/google/android/exoplayer2/l;

    .line 167
    .line 168
    invoke-direct {p4, p1, p2}, Lcom/google/android/exoplayer2/l;-><init>(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V

    .line 169
    .line 170
    .line 171
    const/4 p2, 0x2

    .line 172
    invoke-virtual {p3, p2, p4}, Lg9/q;->i(ILg9/q$a;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    iget-object p2, v6, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 176
    .line 177
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {p2, p3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p2

    .line 183
    if-nez p2, :cond_6

    .line 184
    .line 185
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 186
    .line 187
    new-instance p3, Lcom/google/android/exoplayer2/m;

    .line 188
    .line 189
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/m;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 190
    .line 191
    .line 192
    const/4 p4, 0x3

    .line 193
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 194
    .line 195
    .line 196
    :cond_6
    iget-boolean p2, v6, Lcom/google/android/exoplayer2/q0;->f:Z

    .line 197
    .line 198
    iget-boolean p3, p1, Lcom/google/android/exoplayer2/q0;->f:Z

    .line 199
    .line 200
    if-eq p2, p3, :cond_7

    .line 201
    .line 202
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 203
    .line 204
    new-instance p3, Lcom/google/android/exoplayer2/n;

    .line 205
    .line 206
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/n;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 207
    .line 208
    .line 209
    const/4 p4, 0x4

    .line 210
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 211
    .line 212
    .line 213
    :cond_7
    iget p2, v6, Lcom/google/android/exoplayer2/q0;->d:I

    .line 214
    .line 215
    iget p3, p1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 216
    .line 217
    const/4 p4, -0x1

    .line 218
    if-ne p2, p3, :cond_8

    .line 219
    .line 220
    iget-boolean p2, v6, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 221
    .line 222
    iget-boolean p3, p1, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 223
    .line 224
    if-eq p2, p3, :cond_9

    .line 225
    .line 226
    :cond_8
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 227
    .line 228
    new-instance p3, Lcom/google/android/exoplayer2/o;

    .line 229
    .line 230
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/o;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 234
    .line 235
    .line 236
    :cond_9
    iget p2, v6, Lcom/google/android/exoplayer2/q0;->d:I

    .line 237
    .line 238
    iget p3, p1, Lcom/google/android/exoplayer2/q0;->d:I

    .line 239
    .line 240
    if-eq p2, p3, :cond_a

    .line 241
    .line 242
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 243
    .line 244
    new-instance p3, Lcom/google/android/exoplayer2/p;

    .line 245
    .line 246
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/p;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 247
    .line 248
    .line 249
    const/4 v0, 0x5

    .line 250
    invoke-virtual {p2, v0, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 251
    .line 252
    .line 253
    :cond_a
    iget-boolean p2, v6, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 254
    .line 255
    iget-boolean p3, p1, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 256
    .line 257
    if-eq p2, p3, :cond_b

    .line 258
    .line 259
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 260
    .line 261
    new-instance p3, Lcom/google/android/exoplayer2/q;

    .line 262
    .line 263
    invoke-direct {p3, p1, p5}, Lcom/google/android/exoplayer2/q;-><init>(Lcom/google/android/exoplayer2/q0;I)V

    .line 264
    .line 265
    .line 266
    const/4 p5, 0x6

    .line 267
    invoke-virtual {p2, p5, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 268
    .line 269
    .line 270
    :cond_b
    iget p2, v6, Lcom/google/android/exoplayer2/q0;->l:I

    .line 271
    .line 272
    iget p3, p1, Lcom/google/android/exoplayer2/q0;->l:I

    .line 273
    .line 274
    if-eq p2, p3, :cond_c

    .line 275
    .line 276
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 277
    .line 278
    new-instance p3, Lcom/google/android/exoplayer2/y;

    .line 279
    .line 280
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/y;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 281
    .line 282
    .line 283
    const/4 p5, 0x7

    .line 284
    invoke-virtual {p2, p5, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 285
    .line 286
    .line 287
    :cond_c
    invoke-static {v6}, Lcom/google/android/exoplayer2/d0;->I0(Lcom/google/android/exoplayer2/q0;)Z

    .line 288
    .line 289
    .line 290
    move-result p2

    .line 291
    invoke-static {p1}, Lcom/google/android/exoplayer2/d0;->I0(Lcom/google/android/exoplayer2/q0;)Z

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    if-eq p2, p3, :cond_d

    .line 296
    .line 297
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 298
    .line 299
    new-instance p3, Lcom/google/android/exoplayer2/z;

    .line 300
    .line 301
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/z;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 302
    .line 303
    .line 304
    const/16 p5, 0x8

    .line 305
    .line 306
    invoke-virtual {p2, p5, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 307
    .line 308
    .line 309
    :cond_d
    iget-object p2, v6, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 310
    .line 311
    iget-object p3, p1, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 312
    .line 313
    invoke-virtual {p2, p3}, Lcom/google/android/exoplayer2/PlaybackParameters;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result p2

    .line 317
    if-nez p2, :cond_e

    .line 318
    .line 319
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 320
    .line 321
    new-instance p3, Lcom/google/android/exoplayer2/a0;

    .line 322
    .line 323
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/a0;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 324
    .line 325
    .line 326
    const/16 p5, 0xd

    .line 327
    .line 328
    invoke-virtual {p2, p5, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 329
    .line 330
    .line 331
    :cond_e
    if-eqz p6, :cond_f

    .line 332
    .line 333
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 334
    .line 335
    new-instance p3, Le7/h;

    .line 336
    .line 337
    invoke-direct {p3}, Le7/h;-><init>()V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 341
    .line 342
    .line 343
    :cond_f
    iget-boolean p2, v6, Lcom/google/android/exoplayer2/q0;->n:Z

    .line 344
    .line 345
    iget-boolean p3, p1, Lcom/google/android/exoplayer2/q0;->n:Z

    .line 346
    .line 347
    if-eq p2, p3, :cond_10

    .line 348
    .line 349
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 350
    .line 351
    new-instance p3, Lcom/google/android/exoplayer2/b0;

    .line 352
    .line 353
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/b0;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 357
    .line 358
    .line 359
    :cond_10
    iget-boolean p2, v6, Lcom/google/android/exoplayer2/q0;->o:Z

    .line 360
    .line 361
    iget-boolean p3, p1, Lcom/google/android/exoplayer2/q0;->o:Z

    .line 362
    .line 363
    if-eq p2, p3, :cond_11

    .line 364
    .line 365
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 366
    .line 367
    new-instance p3, Lcom/google/android/exoplayer2/c0;

    .line 368
    .line 369
    invoke-direct {p3, p1}, Lcom/google/android/exoplayer2/c0;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p2, p4, p3}, Lg9/q;->i(ILg9/q$a;)V

    .line 373
    .line 374
    .line 375
    :cond_11
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 376
    .line 377
    invoke-virtual {p1}, Lg9/q;->e()V

    .line 378
    .line 379
    .line 380
    return-void
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
.end method

.method public static synthetic t0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->V0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic u0(Lcom/google/android/exoplayer2/d0;Lcom/google/android/exoplayer2/g0$e;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/d0;->K0(Lcom/google/android/exoplayer2/g0$e;)V

    return-void
.end method

.method public static synthetic v0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->Z0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic w0(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/exoplayer2/d0;->U0(Lcom/google/android/exoplayer2/q0;ILcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public static synthetic x0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/exoplayer2/d0;->X0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method private y0(ILjava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Li8/u;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/google/android/exoplayer2/p0$c;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/exoplayer2/p0$c;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Li8/u;

    .line 20
    .line 21
    iget-boolean v4, p0, Lcom/google/android/exoplayer2/d0;->k:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, Lcom/google/android/exoplayer2/p0$c;-><init>(Li8/u;Z)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, Lcom/google/android/exoplayer2/d0$a;

    .line 34
    .line 35
    iget-object v6, v2, Lcom/google/android/exoplayer2/p0$c;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, Lcom/google/android/exoplayer2/p0$c;->a:Li8/p;

    .line 38
    .line 39
    invoke-virtual {v2}, Li8/p;->O()Lcom/google/android/exoplayer2/Timeline;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v5, v6, v2}, Lcom/google/android/exoplayer2/d0$a;-><init>(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v3, v4, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-interface {p2, p1, v1}, Li8/q0;->g(II)Li8/q0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    .line 63
    .line 64
    return-object v0
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

.method private z0()Lcom/google/android/exoplayer2/Timeline;
    .locals 3

    new-instance v0, Lcom/google/android/exoplayer2/s0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->x:Li8/q0;

    invoke-direct {v0, v1, v2}, Lcom/google/android/exoplayer2/s0;-><init>(Ljava/util/Collection;Li8/q0;)V

    return-object v0
.end method


# virtual methods
.method public A0(Lcom/google/android/exoplayer2/r0$b;)Lcom/google/android/exoplayer2/r0;
    .locals 8

    .line 1
    new-instance v7, Lcom/google/android/exoplayer2/r0;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget-object v5, p0, Lcom/google/android/exoplayer2/d0;->p:Lg9/c;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/g0;->A()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    move-object v0, v7

    .line 22
    move-object v2, p1

    .line 23
    invoke-direct/range {v0 .. v6}, Lcom/google/android/exoplayer2/r0;-><init>(Lcom/google/android/exoplayer2/r0$a;Lcom/google/android/exoplayer2/r0$b;Lcom/google/android/exoplayer2/Timeline;ILg9/c;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    return-object v7
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

.method public B()Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;
    .locals 2

    new-instance v0, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->h:Lb9/n;

    iget-object v1, v1, Lb9/n;->c:[Lb9/h;

    invoke-direct {v0, v1}, Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;-><init>([Lb9/k;)V

    return-object v0
.end method

.method public C0()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-boolean v0, v0, Lcom/google/android/exoplayer2/q0;->o:Z

    return v0
.end method

.method public D(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->c:[Lcom/google/android/exoplayer2/t0;

    aget-object p1, v0, p1

    invoke-interface {p1}, Lcom/google/android/exoplayer2/t0;->d()I

    move-result p1

    return p1
.end method

.method public E()Lcom/google/android/exoplayer2/Player$b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public F(IJ)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 4
    .line 5
    if-ltz p1, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline;->p()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-ge p1, v1, :cond_3

    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    add-int/2addr v1, v2

    .line 23
    iput v1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string p1, "ExoPlayerImpl"

    .line 32
    .line 33
    const-string p2, "seekTo ignored because an ad is playing"

    .line 34
    .line 35
    invoke-static {p1, p2}, Lg9/r;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lcom/google/android/exoplayer2/g0$e;

    .line 39
    .line 40
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 41
    .line 42
    invoke-direct {p1, p2}, Lcom/google/android/exoplayer2/g0$e;-><init>(Lcom/google/android/exoplayer2/q0;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lcom/google/android/exoplayer2/g0$e;->b(I)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lcom/google/android/exoplayer2/d0;->f:Lcom/google/android/exoplayer2/g0$f;

    .line 49
    .line 50
    invoke-interface {p2, p1}, Lcom/google/android/exoplayer2/g0$f;->a(Lcom/google/android/exoplayer2/g0$e;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->P()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-ne v1, v2, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    const/4 v2, 0x2

    .line 62
    :goto_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/exoplayer2/d0;->F0(Lcom/google/android/exoplayer2/Timeline;IJ)Landroid/util/Pair;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {p0, v1, v0, v2}, Lcom/google/android/exoplayer2/d0;->e1(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/Timeline;Landroid/util/Pair;)Lcom/google/android/exoplayer2/q0;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 77
    .line 78
    invoke-static {p2, p3}, Le7/c;->c(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide p2

    .line 82
    invoke-virtual {v1, v0, p1, p2, p3}, Lcom/google/android/exoplayer2/g0;->w0(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 83
    .line 84
    .line 85
    const/4 v5, 0x1

    .line 86
    const/4 v6, 0x1

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v3, p0

    .line 91
    invoke-direct/range {v3 .. v9}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    new-instance v1, Le7/m;

    .line 96
    .line 97
    invoke-direct {v1, v0, p1, p2, p3}, Le7/m;-><init>(Lcom/google/android/exoplayer2/Timeline;IJ)V

    .line 98
    .line 99
    .line 100
    throw v1
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

.method public G()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-boolean v0, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    return v0
.end method

.method public G0()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->c:[Lcom/google/android/exoplayer2/t0;

    array-length v0, v0

    return v0
.end method

.method public H(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/d0;->r:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/exoplayer2/d0;->r:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/g0;->S0(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/exoplayer2/v;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lcom/google/android/exoplayer2/v;-><init>(Z)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0xa

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Lg9/q;->l(ILg9/q$a;)V

    .line 22
    .line 23
    .line 24
    :cond_0
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

.method public I()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->B:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 19
    .line 20
    iget-object v0, v0, Li8/s;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lcom/google/android/exoplayer2/Timeline;->b(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
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

.method public K(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    invoke-virtual {v0, p1}, Lg9/q;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public L()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    iget v0, v0, Li8/s;->c:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public M()J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 12
    .line 13
    iget-object v0, v0, Li8/s;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 21
    .line 22
    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->c:J

    .line 23
    .line 24
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    cmp-long v1, v1, v3

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v2, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline$c;->b()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline$b;->k()J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 57
    .line 58
    iget-wide v2, v2, Lcom/google/android/exoplayer2/q0;->c:J

    .line 59
    .line 60
    invoke-static {v2, v3}, Le7/c;->d(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    add-long/2addr v0, v2

    .line 65
    :goto_0
    return-wide v0

    .line 66
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->Y()J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0
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

.method public O()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Li8/s;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 20
    .line 21
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->p:J

    .line 22
    .line 23
    invoke-static {v0, v1}, Le7/c;->d(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->getDuration()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    :goto_0
    return-wide v0

    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->X()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0
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

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget v0, v0, Lcom/google/android/exoplayer2/q0;->d:I

    return v0
.end method

.method public R(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->q:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/exoplayer2/d0;->q:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/g0;->P0(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/exoplayer2/t;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lcom/google/android/exoplayer2/t;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const/16 p1, 0x9

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Lg9/q;->l(ILg9/q$a;)V

    .line 22
    .line 23
    .line 24
    :cond_0
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

.method public U()I
    .locals 1

    iget v0, p0, Lcom/google/android/exoplayer2/d0;->q:I

    return v0
.end method

.method public V()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/d0;->r:Z

    return v0
.end method

.method public X()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 15
    .line 16
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 17
    .line 18
    iget-wide v1, v1, Li8/s;->d:J

    .line 19
    .line 20
    iget-object v3, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 21
    .line 22
    iget-wide v3, v3, Li8/s;->d:J

    .line 23
    .line 24
    cmp-long v1, v1, v3

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->m()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    iget-object v2, p0, Lcom/google/android/exoplayer2/e;->a:Lcom/google/android/exoplayer2/Timeline$c;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lcom/google/android/exoplayer2/Timeline;->n(ILcom/google/android/exoplayer2/Timeline$c;)Lcom/google/android/exoplayer2/Timeline$c;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/Timeline$c;->d()J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    return-wide v0

    .line 45
    :cond_1
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->p:J

    .line 46
    .line 47
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 48
    .line 49
    iget-object v2, v2, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 50
    .line 51
    invoke-virtual {v2}, Li8/s;->b()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_3

    .line 56
    .line 57
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 58
    .line 59
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 60
    .line 61
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 62
    .line 63
    iget-object v0, v0, Li8/s;->a:Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 66
    .line 67
    invoke-virtual {v1, v0, v2}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 72
    .line 73
    iget-object v1, v1, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 74
    .line 75
    iget v1, v1, Li8/s;->b:I

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/Timeline$b;->f(I)J

    .line 78
    .line 79
    .line 80
    move-result-wide v1

    .line 81
    const-wide/high16 v3, -0x8000000000000000L

    .line 82
    .line 83
    cmp-long v3, v1, v3

    .line 84
    .line 85
    if-nez v3, :cond_2

    .line 86
    .line 87
    iget-wide v0, v0, Lcom/google/android/exoplayer2/Timeline$b;->d:J

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    move-wide v0, v1

    .line 91
    :cond_3
    :goto_0
    iget-object v2, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 92
    .line 93
    iget-object v2, v2, Lcom/google/android/exoplayer2/q0;->j:Li8/u$a;

    .line 94
    .line 95
    invoke-direct {p0, v2, v0, v1}, Lcom/google/android/exoplayer2/d0;->f1(Li8/u$a;J)J

    .line 96
    .line 97
    .line 98
    move-result-wide v0

    .line 99
    return-wide v0
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

.method public Y()J
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

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
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, Lcom/google/android/exoplayer2/d0;->C:J

    .line 12
    .line 13
    return-wide v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 17
    .line 18
    invoke-virtual {v0}, Li8/s;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 25
    .line 26
    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 27
    .line 28
    invoke-static {v0, v1}, Le7/c;->d(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 34
    .line 35
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 36
    .line 37
    iget-wide v2, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 38
    .line 39
    invoke-direct {p0, v1, v2, v3}, Lcom/google/android/exoplayer2/d0;->f1(Li8/u$a;J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v0

    .line 43
    return-wide v0
    .line 44
.end method

.method public b()Lcom/google/android/exoplayer2/PlaybackParameters;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    return-object v0
.end method

.method public c()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->d:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/google/android/exoplayer2/Timeline;->q()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    const/4 v1, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 v1, 0x2

    .line 25
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 30
    .line 31
    add-int/2addr v0, v2

    .line 32
    iput v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/g0;->e0()V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x4

    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x1

    .line 43
    const/4 v9, 0x0

    .line 44
    move-object v3, p0

    .line 45
    invoke-direct/range {v3 .. v9}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    invoke-virtual {v0}, Li8/s;->b()Z

    move-result v0

    return v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-wide v0, v0, Lcom/google/android/exoplayer2/q0;->q:J

    invoke-static {v0, v1}, Le7/c;->d(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lz7/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->i:Ljava/util/List;

    return-object v0
.end method

.method public g1()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Release "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " ["

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, "ExoPlayerLib/2.13.3"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, "] ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v2, Lg9/q0;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Le7/i;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, "]"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "ExoPlayerImpl"

    .line 62
    .line 63
    invoke-static {v1, v0}, Lg9/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/exoplayer2/g0;->g0()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 75
    .line 76
    new-instance v1, Lcom/google/android/exoplayer2/r;

    .line 77
    .line 78
    invoke-direct {v1}, Lcom/google/android/exoplayer2/r;-><init>()V

    .line 79
    .line 80
    .line 81
    const/16 v2, 0xb

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1}, Lg9/q;->l(ILg9/q$a;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    .line 87
    .line 88
    invoke-virtual {v0}, Lg9/q;->j()V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->e:Lg9/m;

    .line 92
    .line 93
    const/4 v1, 0x0

    .line 94
    invoke-interface {v0, v1}, Lg9/m;->f(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->m:Lf7/d1;

    .line 98
    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    iget-object v1, p0, Lcom/google/android/exoplayer2/d0;->o:Le9/e;

    .line 102
    .line 103
    invoke-interface {v1, v0}, Le9/e;->a(Le9/e$a;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 107
    .line 108
    const/4 v1, 0x1

    .line 109
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 114
    .line 115
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Lcom/google/android/exoplayer2/q0;->b(Li8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 122
    .line 123
    iget-wide v1, v0, Lcom/google/android/exoplayer2/q0;->r:J

    .line 124
    .line 125
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->p:J

    .line 126
    .line 127
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 128
    .line 129
    const-wide/16 v1, 0x0

    .line 130
    .line 131
    iput-wide v1, v0, Lcom/google/android/exoplayer2/q0;->q:J

    .line 132
    .line 133
    return-void
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

.method public getDuration()J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    .line 12
    .line 13
    iget-object v2, v1, Li8/s;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3}, Lcom/google/android/exoplayer2/Timeline;->h(Ljava/lang/Object;Lcom/google/android/exoplayer2/Timeline$b;)Lcom/google/android/exoplayer2/Timeline$b;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->i:Lcom/google/android/exoplayer2/Timeline$b;

    .line 21
    .line 22
    iget v2, v1, Li8/s;->b:I

    .line 23
    .line 24
    iget v1, v1, Li8/s;->c:I

    .line 25
    .line 26
    invoke-virtual {v0, v2, v1}, Lcom/google/android/exoplayer2/Timeline$b;->b(II)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    invoke-static {v0, v1}, Le7/c;->d(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/exoplayer2/e;->a0()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    return-wide v0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public j1(Li8/u;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/exoplayer2/d0;->k1(Ljava/util/List;)V

    return-void
.end method

.method public k1(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li8/u;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/android/exoplayer2/d0;->m1(Ljava/util/List;Z)V

    return-void
.end method

.method public l(Lcom/google/android/exoplayer2/Player$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->h:Lg9/q;

    invoke-virtual {v0, p1}, Lg9/q;->k(Ljava/lang/Object;)V

    return-void
.end method

.method public l1(Ljava/util/List;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li8/u;",
            ">;IJ)V"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/d0;->n1(Ljava/util/List;IJZ)V

    return-void
.end method

.method public m()I
    .locals 2

    invoke-direct {p0}, Lcom/google/android/exoplayer2/d0;->D0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public m1(Ljava/util/List;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li8/u;",
            ">;Z)V"
        }
    .end annotation

    const/4 v2, -0x1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/exoplayer2/d0;->n1(Ljava/util/List;IJZ)V

    return-void
.end method

.method public n()Lcom/google/android/exoplayer2/ExoPlaybackException;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->e:Lcom/google/android/exoplayer2/ExoPlaybackException;

    return-object v0
.end method

.method public o(Z)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/exoplayer2/d0;->o1(ZII)V

    return-void
.end method

.method public o1(ZII)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/google/android/exoplayer2/q0;->k:Z

    .line 4
    .line 5
    if-ne v1, p1, :cond_0

    .line 6
    .line 7
    iget v1, v0, Lcom/google/android/exoplayer2/q0;->l:I

    .line 8
    .line 9
    if-ne v1, p2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget v1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, 0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 17
    .line 18
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/q0;->e(ZI)Lcom/google/android/exoplayer2/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lcom/google/android/exoplayer2/g0;->L0(ZI)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x4

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    move-object v2, p0

    .line 32
    move v7, p3

    .line 33
    invoke-direct/range {v2 .. v8}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 34
    .line 35
    .line 36
    return-void
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

.method public p()Lcom/google/android/exoplayer2/Player$c;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public p1(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/google/android/exoplayer2/PlaybackParameters;->d:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->m:Lcom/google/android/exoplayer2/PlaybackParameters;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/PlaybackParameters;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/q0;->g(Lcom/google/android/exoplayer2/PlaybackParameters;)Lcom/google/android/exoplayer2/q0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iput v0, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/g0;->N0(Lcom/google/android/exoplayer2/PlaybackParameters;)V

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x4

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    move-object v1, p0

    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 40
    .line 41
    .line 42
    return-void
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public q1(Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/exoplayer2/d0;->r1(ZLcom/google/android/exoplayer2/ExoPlaybackException;)V

    return-void
.end method

.method public r1(ZLcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->j:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {p0, v0, p1}, Lcom/google/android/exoplayer2/d0;->h1(II)Lcom/google/android/exoplayer2/q0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    .line 21
    .line 22
    iget-object v0, p1, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/q0;->b(Li8/u$a;)Lcom/google/android/exoplayer2/q0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-wide v0, p1, Lcom/google/android/exoplayer2/q0;->r:J

    .line 29
    .line 30
    iput-wide v0, p1, Lcom/google/android/exoplayer2/q0;->p:J

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    iput-wide v0, p1, Lcom/google/android/exoplayer2/q0;->q:J

    .line 35
    .line 36
    :goto_0
    const/4 v0, 0x1

    .line 37
    invoke-virtual {p1, v0}, Lcom/google/android/exoplayer2/q0;->h(I)Lcom/google/android/exoplayer2/q0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lcom/google/android/exoplayer2/q0;->f(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lcom/google/android/exoplayer2/q0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_1
    move-object v2, p1

    .line 48
    iget p1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 49
    .line 50
    add-int/2addr p1, v0

    .line 51
    iput p1, p0, Lcom/google/android/exoplayer2/d0;->s:I

    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/exoplayer2/d0;->g:Lcom/google/android/exoplayer2/g0;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/google/android/exoplayer2/g0;->d1()V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x4

    .line 60
    const/4 v5, 0x0

    .line 61
    const/4 v6, 0x1

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v1, p0

    .line 64
    invoke-direct/range {v1 .. v7}, Lcom/google/android/exoplayer2/d0;->s1(Lcom/google/android/exoplayer2/q0;ZIIIZ)V

    .line 65
    .line 66
    .line 67
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
.end method

.method public t()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/d0;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->b:Li8/u$a;

    iget v0, v0, Li8/s;->b:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public u()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget v0, v0, Lcom/google/android/exoplayer2/q0;->l:I

    return v0
.end method

.method public v()Lcom/google/android/exoplayer2/source/TrackGroupArray;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->g:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    return-object v0
.end method

.method public w()Lcom/google/android/exoplayer2/Timeline;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->z:Lcom/google/android/exoplayer2/q0;

    iget-object v0, v0, Lcom/google/android/exoplayer2/q0;->a:Lcom/google/android/exoplayer2/Timeline;

    return-object v0
.end method

.method public x()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/d0;->n:Landroid/os/Looper;

    return-object v0
.end method
