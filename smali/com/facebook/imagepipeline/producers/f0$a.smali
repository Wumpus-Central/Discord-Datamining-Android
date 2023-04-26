.class Lcom/facebook/imagepipeline/producers/f0$a;
.super Lcom/facebook/imagepipeline/producers/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/f0;->b(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/s0<",
        "Lcom/facebook/common/references/CloseableReference<",
        "Lu5/c;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic p:Lcom/facebook/imagepipeline/producers/n0;

.field final synthetic q:Lcom/facebook/imagepipeline/producers/ProducerContext;

.field final synthetic r:Lcom/facebook/imagepipeline/request/ImageRequest;

.field final synthetic s:Lcom/facebook/imagepipeline/producers/f0;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/f0;Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Lcom/facebook/imagepipeline/request/ImageRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->s:Lcom/facebook/imagepipeline/producers/f0;

    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/f0$a;->p:Lcom/facebook/imagepipeline/producers/n0;

    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/f0$a;->r:Lcom/facebook/imagepipeline/request/ImageRequest;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/facebook/imagepipeline/producers/s0;-><init>(Lcom/facebook/imagepipeline/producers/Consumer;Lcom/facebook/imagepipeline/producers/n0;Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/f0$a;->j(Lcom/facebook/common/references/CloseableReference;)V

    return-void
.end method

.method protected bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/f0$a;->l()Lcom/facebook/common/references/CloseableReference;

    move-result-object v0

    return-object v0
.end method

.method protected e(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/s0;->e(Ljava/lang/Exception;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->p:Lcom/facebook/imagepipeline/producers/n0;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 7
    .line 8
    const-string v1, "VideoThumbnailProducer"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/imagepipeline/producers/n0;->b(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 15
    .line 16
    const-string v0, "local"

    .line 17
    .line 18
    invoke-interface {p1, v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->g(Ljava/lang/String;)V

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

.method protected bridge synthetic f(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/f0$a;->m(Lcom/facebook/common/references/CloseableReference;)V

    return-void
.end method

.method protected bridge synthetic i(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    check-cast p1, Lcom/facebook/common/references/CloseableReference;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/f0$a;->k(Lcom/facebook/common/references/CloseableReference;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected j(Lcom/facebook/common/references/CloseableReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Lcom/facebook/common/references/CloseableReference;->t(Lcom/facebook/common/references/CloseableReference;)V

    return-void
.end method

.method protected k(Lcom/facebook/common/references/CloseableReference;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v0, "createdThumbnail"

    invoke-static {v0, p1}, Lv3/f;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected l()Lcom/facebook/common/references/CloseableReference;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->s:Lcom/facebook/imagepipeline/producers/f0;

    .line 3
    .line 4
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/f0$a;->r:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 5
    .line 6
    invoke-static {v1, v2}, Lcom/facebook/imagepipeline/producers/f0;->c(Lcom/facebook/imagepipeline/producers/f0;Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    move-object v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/f0$a;->r:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 15
    .line 16
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/f0;->d(Lcom/facebook/imagepipeline/request/ImageRequest;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v1, v2}, Landroid/media/ThumbnailUtils;->createVideoThumbnail(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->s:Lcom/facebook/imagepipeline/producers/f0;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/f0;->e(Lcom/facebook/imagepipeline/producers/f0;)Landroid/content/ContentResolver;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/f0$a;->r:Lcom/facebook/imagepipeline/request/ImageRequest;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/facebook/imagepipeline/request/ImageRequest;->getSourceUri()Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1, v2}, Lcom/facebook/imagepipeline/producers/f0;->f(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_1
    if-nez v1, :cond_1

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_1
    new-instance v0, Lu5/d;

    .line 45
    .line 46
    invoke-static {}, Ln5/e;->a()Ln5/e;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Lu5/h;->d:Lu5/i;

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    invoke-direct {v0, v1, v2, v3, v4}, Lu5/d;-><init>(Landroid/graphics/Bitmap;Lz3/c;Lu5/i;I)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 57
    .line 58
    const-string v2, "image_format"

    .line 59
    .line 60
    const-string v3, "thumbnail"

    .line 61
    .line 62
    invoke-interface {v1, v2, v3}, Lcom/facebook/imagepipeline/producers/ProducerContext;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 66
    .line 67
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/ProducerContext;->getExtras()Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Lu5/c;->l(Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lcom/facebook/common/references/CloseableReference;->S(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    return-object v0
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

.method protected m(Lcom/facebook/common/references/CloseableReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/references/CloseableReference<",
            "Lu5/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/s0;->f(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/f0$a;->p:Lcom/facebook/imagepipeline/producers/n0;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    const-string v2, "VideoThumbnailProducer"

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/n0;->b(Lcom/facebook/imagepipeline/producers/ProducerContext;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/f0$a;->q:Lcom/facebook/imagepipeline/producers/ProducerContext;

    .line 19
    .line 20
    const-string v0, "local"

    .line 21
    .line 22
    invoke-interface {p1, v0}, Lcom/facebook/imagepipeline/producers/ProducerContext;->g(Ljava/lang/String;)V

    .line 23
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
