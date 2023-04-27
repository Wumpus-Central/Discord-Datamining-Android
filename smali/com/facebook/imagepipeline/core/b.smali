.class public Lcom/facebook/imagepipeline/core/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final t:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private static u:Lcom/facebook/imagepipeline/core/b;

.field private static v:Z

.field private static w:Lcom/facebook/imagepipeline/core/ImagePipeline;


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/v0;

.field private final b:Lr5/g;

.field private final c:Lr5/a;

.field private d:Lp5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/i<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lv5/c;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lp5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/p<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lv5/c;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lp5/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/i<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lz3/g;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lp5/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/p<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lz3/g;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lp5/e;

.field private i:Lr3/h;

.field private j:Lt5/c;

.field private k:Lcom/facebook/imagepipeline/core/ImagePipeline;

.field private l:Lb6/d;

.field private m:Lr5/j;

.field private n:Lr5/k;

.field private o:Lp5/e;

.field private p:Lr3/h;

.field private q:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

.field private r:Lcom/facebook/imagepipeline/platform/g;

.field private s:Ll5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/facebook/imagepipeline/core/b;

    sput-object v0, Lcom/facebook/imagepipeline/core/b;->t:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lr5/g;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La6/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "ImagePipelineConfig()"

    .line 11
    .line 12
    invoke-static {v0}, La6/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, Lw3/j;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lr5/g;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 22
    .line 23
    invoke-interface {v0}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->t()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Lcom/facebook/imagepipeline/producers/u;

    .line 34
    .line 35
    invoke-interface {p1}, Lr5/g;->E()Lr5/e;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Lr5/e;->a()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/u;-><init>(Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v0, Lcom/facebook/imagepipeline/producers/w0;

    .line 48
    .line 49
    invoke-interface {p1}, Lr5/g;->E()Lr5/e;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Lr5/e;->a()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/w0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 61
    .line 62
    invoke-interface {p1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->b()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->j0(I)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Lr5/a;

    .line 74
    .line 75
    invoke-interface {p1}, Lr5/g;->w()Ls5/a;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {v0, p1}, Lr5/a;-><init>(Ls5/a;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->c:Lr5/a;

    .line 83
    .line 84
    invoke-static {}, La6/b;->d()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_2

    .line 89
    .line 90
    invoke-static {}, La6/b;->b()V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
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

.method private a()Lcom/facebook/imagepipeline/core/ImagePipeline;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v16, Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->r()Lr5/k;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 10
    .line 11
    invoke-interface {v1}, Lr5/g;->f()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 16
    .line 17
    invoke-interface {v1}, Lr5/g;->a()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 22
    .line 23
    invoke-interface {v1}, Lr5/g;->b()Lcom/facebook/common/internal/Supplier;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->e()Lp5/p;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->h()Lp5/p;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->m()Lp5/e;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->s()Lp5/e;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 44
    .line 45
    invoke-interface {v1}, Lr5/g;->y()Lp5/f;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    iget-object v11, v0, Lcom/facebook/imagepipeline/core/b;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 50
    .line 51
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 52
    .line 53
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->i()Lcom/facebook/common/internal/Supplier;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 62
    .line 63
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->v()Lcom/facebook/common/internal/Supplier;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 72
    .line 73
    invoke-interface {v1}, Lr5/g;->C()Ls3/a;

    .line 74
    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    iget-object v15, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 78
    .line 79
    move-object/from16 v1, v16

    .line 80
    .line 81
    invoke-direct/range {v1 .. v15}, Lcom/facebook/imagepipeline/core/ImagePipeline;-><init>(Lr5/k;Ljava/util/Set;Ljava/util/Set;Lcom/facebook/common/internal/Supplier;Lp5/s;Lp5/s;Lp5/e;Lp5/e;Lp5/f;Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/common/internal/Supplier;Lcom/facebook/common/internal/Supplier;Ls3/a;Lr5/g;)V

    .line 82
    .line 83
    .line 84
    return-object v16
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

.method private c()Ll5/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->s:Ll5/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->o()Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 10
    .line 11
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->d()Lp5/i;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 20
    .line 21
    invoke-interface {v3}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Lcom/facebook/imagepipeline/core/a;->A()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iget-object v4, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 30
    .line 31
    invoke-interface {v4}, Lr5/g;->l()Lu3/f;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v0, v1, v2, v3, v4}, Ll5/b;->a(Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;Lr5/e;Lp5/i;ZLjava/util/concurrent/ExecutorService;)Ll5/a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->s:Ll5/a;

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->s:Ll5/a;

    .line 42
    .line 43
    return-object v0
    .line 44
.end method

.method private i()Lt5/c;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->j:Lt5/c;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->r()Lt5/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 14
    .line 15
    invoke-interface {v0}, Lr5/g;->r()Lt5/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->j:Lt5/c;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0}, Lcom/facebook/imagepipeline/core/b;->c()Ll5/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ll5/a;->c()Lt5/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0}, Ll5/a;->b()Lt5/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    move-object v0, v1

    .line 39
    :goto_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 40
    .line 41
    invoke-interface {v2}, Lr5/g;->o()Lt5/d;

    .line 42
    .line 43
    .line 44
    new-instance v2, Lt5/b;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->p()Lcom/facebook/imagepipeline/platform/g;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-direct {v2, v1, v0, v3}, Lt5/b;-><init>(Lt5/c;Lt5/c;Lcom/facebook/imagepipeline/platform/g;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lcom/facebook/imagepipeline/core/b;->j:Lt5/c;

    .line 54
    .line 55
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->j:Lt5/c;

    .line 56
    .line 57
    return-object v0
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

.method private k()Lb6/d;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->l:Lb6/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->n()Lb6/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 14
    .line 15
    invoke-interface {v0}, Lr5/g;->m()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 22
    .line 23
    invoke-interface {v0}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/core/a;->w()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lb6/h;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 36
    .line 37
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->f()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Lb6/h;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->l:Lb6/d;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v0, Lb6/f;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 54
    .line 55
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->f()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 64
    .line 65
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->l()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 74
    .line 75
    invoke-interface {v1}, Lr5/g;->n()Lb6/d;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 80
    .line 81
    invoke-interface {v1}, Lr5/g;->m()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 86
    .line 87
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->s()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    move-object v2, v0

    .line 96
    invoke-direct/range {v2 .. v7}, Lb6/f;-><init>(IZLb6/d;Ljava/lang/Integer;Z)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->l:Lb6/d;

    .line 100
    .line 101
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->l:Lb6/d;

    .line 102
    .line 103
    return-object v0
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

.method public static l()Lcom/facebook/imagepipeline/core/b;
    .locals 2

    sget-object v0, Lcom/facebook/imagepipeline/core/b;->u:Lcom/facebook/imagepipeline/core/b;

    const-string v1, "ImagePipelineFactory was not initialized!"

    invoke-static {v0, v1}, Lw3/j;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/imagepipeline/core/b;

    return-object v0
.end method

.method private q()Lr5/j;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->m:Lr5/j;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 8
    .line 9
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->h()Lcom/facebook/imagepipeline/core/a$d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 18
    .line 19
    invoke-interface {v1}, Lr5/g;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 24
    .line 25
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ly5/y;->k()Lz3/a;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->i()Lt5/c;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 38
    .line 39
    invoke-interface {v1}, Lr5/g;->h()Lt5/e;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 44
    .line 45
    invoke-interface {v1}, Lr5/g;->k()Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 50
    .line 51
    invoke-interface {v1}, Lr5/g;->z()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 56
    .line 57
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->o()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 66
    .line 67
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 72
    .line 73
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v11, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 78
    .line 79
    invoke-interface {v11}, Lr5/g;->u()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual {v1, v11}, Ly5/y;->i(I)Lz3/h;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 88
    .line 89
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Ly5/y;->j()Lz3/k;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->e()Lp5/p;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->h()Lp5/p;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->m()Lp5/e;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->s()Lp5/e;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 114
    .line 115
    invoke-interface {v1}, Lr5/g;->y()Lp5/f;

    .line 116
    .line 117
    .line 118
    move-result-object v17

    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->o()Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 120
    .line 121
    .line 122
    move-result-object v18

    .line 123
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 124
    .line 125
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->e()I

    .line 130
    .line 131
    .line 132
    move-result v19

    .line 133
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 134
    .line 135
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->d()I

    .line 140
    .line 141
    .line 142
    move-result v20

    .line 143
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 144
    .line 145
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->c()Z

    .line 150
    .line 151
    .line 152
    move-result v21

    .line 153
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 154
    .line 155
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->f()I

    .line 160
    .line 161
    .line 162
    move-result v22

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->f()Lr5/a;

    .line 164
    .line 165
    .line 166
    move-result-object v23

    .line 167
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 168
    .line 169
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->B()Z

    .line 174
    .line 175
    .line 176
    move-result v24

    .line 177
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 178
    .line 179
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->j()I

    .line 184
    .line 185
    .line 186
    move-result v25

    .line 187
    invoke-interface/range {v2 .. v25}, Lcom/facebook/imagepipeline/core/a$d;->a(Landroid/content/Context;Lz3/a;Lt5/c;Lt5/e;ZZZLr5/e;Lz3/h;Lz3/k;Lp5/s;Lp5/s;Lp5/e;Lp5/e;Lp5/f;Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;IIZILr5/a;ZI)Lr5/j;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iput-object v1, v0, Lcom/facebook/imagepipeline/core/b;->m:Lr5/j;

    .line 192
    .line 193
    :cond_0
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->m:Lr5/j;

    .line 194
    .line 195
    return-object v1
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

.method private r()Lr5/k;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x18

    .line 6
    .line 7
    if-lt v1, v2, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 10
    .line 11
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    move v10, v1

    .line 25
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->n:Lr5/k;

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-instance v1, Lr5/k;

    .line 30
    .line 31
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 32
    .line 33
    invoke-interface {v2}, Lr5/g;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->q()Lr5/j;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 50
    .line 51
    invoke-interface {v2}, Lr5/g;->c()Lcom/facebook/imagepipeline/producers/NetworkFetcher;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 56
    .line 57
    invoke-interface {v2}, Lr5/g;->z()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 62
    .line 63
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->y()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    iget-object v8, v0, Lcom/facebook/imagepipeline/core/b;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 72
    .line 73
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 74
    .line 75
    invoke-interface {v2}, Lr5/g;->k()Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 80
    .line 81
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->x()Z

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 90
    .line 91
    invoke-interface {v2}, Lr5/g;->p()Z

    .line 92
    .line 93
    .line 94
    move-result v12

    .line 95
    invoke-direct/range {p0 .. p0}, Lcom/facebook/imagepipeline/core/b;->k()Lb6/d;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 100
    .line 101
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->r()Z

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 110
    .line 111
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->p()Z

    .line 116
    .line 117
    .line 118
    move-result v15

    .line 119
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 120
    .line 121
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->C()Z

    .line 126
    .line 127
    .line 128
    move-result v16

    .line 129
    iget-object v2, v0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 130
    .line 131
    invoke-interface {v2}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/core/a;->a()Z

    .line 136
    .line 137
    .line 138
    move-result v17

    .line 139
    move-object v2, v1

    .line 140
    invoke-direct/range {v2 .. v17}, Lr5/k;-><init>(Landroid/content/ContentResolver;Lr5/j;Lcom/facebook/imagepipeline/producers/NetworkFetcher;ZZLcom/facebook/imagepipeline/producers/v0;ZZZZLb6/d;ZZZZ)V

    .line 141
    .line 142
    .line 143
    iput-object v1, v0, Lcom/facebook/imagepipeline/core/b;->n:Lr5/k;

    .line 144
    .line 145
    :cond_1
    iget-object v1, v0, Lcom/facebook/imagepipeline/core/b;->n:Lr5/k;

    .line 146
    .line 147
    return-object v1
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

.method private s()Lp5/e;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->o:Lp5/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp5/e;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->t()Lr3/h;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 18
    .line 19
    invoke-interface {v3}, Lr5/g;->u()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1, v3}, Ly5/y;->i(I)Lz3/h;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 28
    .line 29
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ly5/y;->j()Lz3/k;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 38
    .line 39
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 48
    .line 49
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Lr5/e;->b()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 58
    .line 59
    invoke-interface {v1}, Lr5/g;->A()Lp5/o;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v1, v0

    .line 64
    invoke-direct/range {v1 .. v7}, Lp5/e;-><init>(Lr3/h;Lz3/h;Lz3/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lp5/o;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->o:Lp5/e;

    .line 68
    .line 69
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->o:Lp5/e;

    .line 70
    .line 71
    return-object v0
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

.method public static declared-synchronized u(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/imagepipeline/core/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, La6/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "ImagePipelineFactory#initialize"

    .line 11
    .line 12
    invoke-static {v1}, La6/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig;->J(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->K()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lcom/facebook/imagepipeline/core/b;->v(Lr5/g;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, La6/b;->d()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-static {}, La6/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    monitor-exit v0

    .line 39
    throw p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public static declared-synchronized v(Lr5/g;)V
    .locals 3

    .line 1
    const-class v0, Lcom/facebook/imagepipeline/core/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/facebook/imagepipeline/core/b;->u:Lcom/facebook/imagepipeline/core/b;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcom/facebook/imagepipeline/core/b;->t:Ljava/lang/Class;

    .line 9
    .line 10
    const-string v2, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."

    .line 11
    .line 12
    invoke-static {v1, v2}, Lx3/a;->D(Ljava/lang/Class;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v1, Lcom/facebook/imagepipeline/core/b;

    .line 16
    .line 17
    invoke-direct {v1, p0}, Lcom/facebook/imagepipeline/core/b;-><init>(Lr5/g;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/facebook/imagepipeline/core/b;->u:Lcom/facebook/imagepipeline/core/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v0

    .line 26
    throw p0
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


# virtual methods
.method public b(Landroid/content/Context;)Lu5/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/core/b;->c()Ll5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {v0, p1}, Ll5/a;->a(Landroid/content/Context;)Lu5/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    return-object p1
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

.method public d()Lp5/i;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/i<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lv5/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->d:Lp5/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->x()Lp5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->q()Lcom/facebook/common/internal/Supplier;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 18
    .line 19
    invoke-interface {v2}, Lr5/g;->B()Lz3/c;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 24
    .line 25
    invoke-interface {v3}, Lr5/g;->g()Lp5/s$a;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget-object v4, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 30
    .line 31
    invoke-interface {v4}, Lr5/g;->j()Lp5/i$b;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v0, v1, v2, v3, v4}, Lp5/a;->a(Lcom/facebook/common/internal/Supplier;Lz3/c;Lp5/s$a;Lp5/i$b;)Lp5/i;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->d:Lp5/i;

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->d:Lp5/i;

    .line 42
    .line 43
    return-object v0
    .line 44
.end method

.method public e()Lp5/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/p<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lv5/c;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->e:Lp5/p;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->d()Lp5/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 10
    .line 11
    invoke-interface {v1}, Lr5/g;->A()Lp5/o;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lp5/q;->a(Lp5/s;Lp5/o;)Lp5/p;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->e:Lp5/p;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->e:Lp5/p;

    .line 22
    .line 23
    return-object v0
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

.method public f()Lr5/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->c:Lr5/a;

    return-object v0
.end method

.method public g()Lp5/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/i<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lz3/g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->f:Lp5/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->s()Lcom/facebook/common/internal/Supplier;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->B()Lz3/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lp5/m;->a(Lcom/facebook/common/internal/Supplier;Lz3/c;)Lp5/i;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->f:Lp5/i;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->f:Lp5/i;

    .line 24
    .line 25
    return-object v0
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

.method public h()Lp5/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp5/p<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lz3/g;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->g:Lp5/p;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->d()Lp5/s;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 14
    .line 15
    invoke-interface {v0}, Lr5/g;->d()Lp5/s;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->g()Lp5/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 25
    .line 26
    invoke-interface {v1}, Lr5/g;->A()Lp5/o;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Lp5/n;->a(Lp5/s;Lp5/o;)Lp5/p;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->g:Lp5/p;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->g:Lp5/p;

    .line 37
    .line 38
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
.end method

.method public j()Lcom/facebook/imagepipeline/core/ImagePipeline;
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/imagepipeline/core/b;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/imagepipeline/core/b;->w:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/imagepipeline/core/b;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/facebook/imagepipeline/core/b;->w:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->k:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/facebook/imagepipeline/core/b;->w:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->k:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/facebook/imagepipeline/core/b;->a()Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->k:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 29
    .line 30
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->k:Lcom/facebook/imagepipeline/core/ImagePipeline;

    .line 31
    .line 32
    return-object v0
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

.method public m()Lp5/e;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->h:Lp5/e;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp5/e;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->n()Lr3/h;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 18
    .line 19
    invoke-interface {v3}, Lr5/g;->u()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1, v3}, Ly5/y;->i(I)Lz3/h;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 28
    .line 29
    invoke-interface {v1}, Lr5/g;->t()Ly5/y;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ly5/y;->j()Lz3/k;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 38
    .line 39
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Lr5/e;->f()Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 48
    .line 49
    invoke-interface {v1}, Lr5/g;->E()Lr5/e;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Lr5/e;->b()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 58
    .line 59
    invoke-interface {v1}, Lr5/g;->A()Lp5/o;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v1, v0

    .line 64
    invoke-direct/range {v1 .. v7}, Lp5/e;-><init>(Lr3/h;Lz3/h;Lz3/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lp5/o;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->h:Lp5/e;

    .line 68
    .line 69
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->h:Lp5/e;

    .line 70
    .line 71
    return-object v0
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

.method public n()Lr3/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->i:Lr3/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->e()Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->v()Lr5/f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0}, Lr5/f;->a(Lcom/facebook/cache/disk/DiskCacheConfig;)Lr3/h;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->i:Lr3/h;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->i:Lr3/h;

    .line 24
    .line 25
    return-object v0
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

.method public o()Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->q:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->t()Ly5/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->p()Lcom/facebook/imagepipeline/platform/g;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/b;->f()Lr5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lo5/d;->a(Ly5/y;Lcom/facebook/imagepipeline/platform/g;Lr5/a;)Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->q:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->q:Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;

    .line 26
    .line 27
    return-object v0
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

.method public p()Lcom/facebook/imagepipeline/platform/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->r:Lcom/facebook/imagepipeline/platform/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->t()Ly5/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->D()Lcom/facebook/imagepipeline/core/a;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/core/a;->u()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/platform/h;->a(Ly5/y;Z)Lcom/facebook/imagepipeline/platform/g;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->r:Lcom/facebook/imagepipeline/platform/g;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->r:Lcom/facebook/imagepipeline/platform/g;

    .line 28
    .line 29
    return-object v0
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

.method public t()Lr3/h;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->p:Lr3/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 6
    .line 7
    invoke-interface {v0}, Lr5/g;->i()Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/imagepipeline/core/b;->b:Lr5/g;

    .line 12
    .line 13
    invoke-interface {v1}, Lr5/g;->v()Lr5/f;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0}, Lr5/f;->a(Lcom/facebook/cache/disk/DiskCacheConfig;)Lr3/h;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcom/facebook/imagepipeline/core/b;->p:Lr3/h;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/core/b;->p:Lr3/h;

    .line 24
    .line 25
    return-object v0
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
