.class public final Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;",
        "",
        "()V",
        "downSample",
        "",
        "data",
        "targetSize",
        "",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;

    invoke-direct {v0}, Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/Sampler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final downSample([BI)[B
    .locals 10

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    new-array p1, v0, [B

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    array-length v1, p1

    .line 13
    if-ne v1, p2, :cond_1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    array-length v1, p1

    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    move v1, v0

    .line 22
    :goto_0
    if-eqz v1, :cond_3

    .line 23
    .line 24
    new-array p1, p2, [B

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_3
    array-length v1, p1

    .line 28
    if-ge v1, p2, :cond_4

    .line 29
    .line 30
    array-length v0, p1

    .line 31
    sub-int/2addr p2, v0

    .line 32
    new-array p2, p2, [B

    .line 33
    .line 34
    invoke-static {p1, p2}, Lkotlin/collections/b;->n([B[B)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_4
    array-length v1, p1

    .line 40
    int-to-float v1, v1

    .line 41
    int-to-float v2, p2

    .line 42
    div-float/2addr v1, v2

    .line 43
    new-array v2, p2, [B

    .line 44
    .line 45
    move v3, v0

    .line 46
    move v4, v3

    .line 47
    :goto_1
    if-ge v3, p2, :cond_6

    .line 48
    .line 49
    add-int/lit8 v5, v3, 0x1

    .line 50
    .line 51
    int-to-float v6, v5

    .line 52
    mul-float/2addr v6, v1

    .line 53
    float-to-double v6, v6

    .line 54
    invoke-static {v6, v7}, Ljava/lang/Math;->rint(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v6

    .line 58
    double-to-float v6, v6

    .line 59
    float-to-int v6, v6

    .line 60
    array-length v7, p1

    .line 61
    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    invoke-static {v4, v7}, Lcg/h;->q(II)Lkotlin/ranges/IntRange;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    move v7, v0

    .line 74
    move v8, v7

    .line 75
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    if-eqz v9, :cond_5

    .line 80
    .line 81
    move-object v9, v4

    .line 82
    check-cast v9, Lmf/p;

    .line 83
    .line 84
    invoke-virtual {v9}, Lmf/p;->nextInt()I

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    aget-byte v9, p1, v9

    .line 89
    .line 90
    invoke-static {v9}, Lcom/discord/chat/presentation/message/view/voicemessages/SamplerKt;->getAbs(B)B

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    add-int/2addr v7, v9

    .line 95
    add-int/lit8 v8, v8, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    div-int/2addr v7, v8

    .line 99
    int-to-byte v4, v7

    .line 100
    aput-byte v4, v2, v3

    .line 101
    .line 102
    move v3, v5

    .line 103
    move v4, v6

    .line 104
    goto :goto_1

    .line 105
    :cond_6
    return-object v2
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
.end method