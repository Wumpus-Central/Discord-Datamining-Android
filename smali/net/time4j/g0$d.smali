.class Lnet/time4j/g0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/z<",
        "Lnet/time4j/g0;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final l:I

.field private final m:I

.field private final n:I


# direct methods
.method constructor <init>(Lfj/p;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "Ljava/lang/Integer;",
            ">;II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 5
    .line 6
    instance-of v0, p1, Lnet/time4j/t;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Lnet/time4j/t;

    .line 11
    .line 12
    invoke-virtual {p1}, Lnet/time4j/t;->D()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iput p1, p0, Lnet/time4j/g0$d;->l:I

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lnet/time4j/g0$d;->l:I

    .line 21
    .line 22
    :goto_0
    iput p2, p0, Lnet/time4j/g0$d;->m:I

    .line 23
    .line 24
    iput p3, p0, Lnet/time4j/g0$d;->n:I

    .line 25
    .line 26
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
.end method

.method private b(Lnet/time4j/g0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/g0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    .line 1
    iget p1, p0, Lnet/time4j/g0$d;->l:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :pswitch_0
    sget-object p1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 9
    .line 10
    return-object p1

    .line 11
    :pswitch_1
    sget-object p1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 12
    .line 13
    return-object p1

    .line 14
    :pswitch_2
    sget-object p1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
.end method

.method private static i(Lnet/time4j/g0;)Z
    .locals 2

    invoke-static {p0}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    move-result p0

    const/16 v0, 0x18

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

.method private s(Lnet/time4j/g0;I)Lnet/time4j/g0;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 2
    .line 3
    sget-object v1, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 4
    .line 5
    if-eq v0, v1, :cond_f

    .line 6
    .line 7
    sget-object v1, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 8
    .line 9
    if-eq v0, v1, :cond_f

    .line 10
    .line 11
    sget-object v1, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    sget-object v1, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    int-to-long v0, p2

    .line 30
    sget-object p2, Lnet/time4j/g;->l:Lnet/time4j/g;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lnet/time4j/g0;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    sget-object v1, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 40
    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    invoke-static {p1}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    int-to-long v0, p2

    .line 52
    sget-object p2, Lnet/time4j/g;->m:Lnet/time4j/g;

    .line 53
    .line 54
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lnet/time4j/g0;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    sget-object v1, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 62
    .line 63
    if-ne v0, v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/Integer;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    int-to-long v0, p2

    .line 80
    sget-object p2, Lnet/time4j/g;->n:Lnet/time4j/g;

    .line 81
    .line 82
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lnet/time4j/g0;

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_3
    sget-object v1, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 90
    .line 91
    if-ne v0, v1, :cond_4

    .line 92
    .line 93
    invoke-virtual {p1, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    int-to-long v0, p2

    .line 108
    sget-object p2, Lnet/time4j/g;->o:Lnet/time4j/g;

    .line 109
    .line 110
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lnet/time4j/g0;

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_4
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 118
    .line 119
    if-ne v0, v1, :cond_5

    .line 120
    .line 121
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    int-to-long v0, p2

    .line 130
    sget-object p2, Lnet/time4j/g;->p:Lnet/time4j/g;

    .line 131
    .line 132
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    check-cast p1, Lnet/time4j/g0;

    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_5
    sget-object v1, Lnet/time4j/g0;->N:Lnet/time4j/k0;

    .line 140
    .line 141
    if-ne v0, v1, :cond_8

    .line 142
    .line 143
    const v0, 0x5265c00

    .line 144
    .line 145
    .line 146
    invoke-static {p2, v0}, Lnet/time4j/base/c;->c(II)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    const v1, 0xf4240

    .line 155
    .line 156
    .line 157
    rem-int/2addr p1, v1

    .line 158
    if-nez v0, :cond_7

    .line 159
    .line 160
    if-nez p1, :cond_7

    .line 161
    .line 162
    if-lez p2, :cond_6

    .line 163
    .line 164
    sget-object p1, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_6
    sget-object p1, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    .line 168
    .line 169
    :goto_0
    return-object p1

    .line 170
    :cond_7
    invoke-static {v0, p1}, Lnet/time4j/g0;->Q(II)Lnet/time4j/g0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    return-object p1

    .line 175
    :cond_8
    sget-object v1, Lnet/time4j/g0;->H:Lnet/time4j/k0;

    .line 176
    .line 177
    const/4 v2, 0x0

    .line 178
    if-ne v0, v1, :cond_b

    .line 179
    .line 180
    const/16 v0, 0x5a0

    .line 181
    .line 182
    invoke-static {p2, v0}, Lnet/time4j/base/c;->c(II)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_a

    .line 187
    .line 188
    invoke-static {p1}, Lnet/time4j/g0;->S(Lnet/time4j/g0;)Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_a

    .line 193
    .line 194
    if-lez p2, :cond_9

    .line 195
    .line 196
    sget-object p1, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_9
    sget-object p1, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    .line 200
    .line 201
    :goto_1
    return-object p1

    .line 202
    :cond_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-virtual {p0, p1, p2, v2}, Lnet/time4j/g0$d;->r(Lnet/time4j/g0;Ljava/lang/Integer;Z)Lnet/time4j/g0;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    return-object p1

    .line 211
    :cond_b
    sget-object v1, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    .line 212
    .line 213
    if-ne v0, v1, :cond_e

    .line 214
    .line 215
    const v0, 0x15180

    .line 216
    .line 217
    .line 218
    invoke-static {p2, v0}, Lnet/time4j/base/c;->c(II)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-nez v0, :cond_d

    .line 223
    .line 224
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_d

    .line 229
    .line 230
    if-lez p2, :cond_c

    .line 231
    .line 232
    sget-object p1, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_c
    sget-object p1, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    .line 236
    .line 237
    :goto_2
    return-object p1

    .line 238
    :cond_d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p0, p1, p2, v2}, Lnet/time4j/g0$d;->r(Lnet/time4j/g0;Ljava/lang/Integer;Z)Lnet/time4j/g0;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    return-object p1

    .line 247
    :cond_e
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 248
    .line 249
    iget-object p2, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 250
    .line 251
    invoke-interface {p2}, Lfj/p;->name()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p2

    .line 255
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    throw p1

    .line 259
    :cond_f
    :goto_3
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/lang/Integer;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-static {p2, v0}, Lnet/time4j/base/c;->l(II)I

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    int-to-long v0, p2

    .line 274
    sget-object p2, Lnet/time4j/g;->k:Lnet/time4j/g;

    .line 275
    .line 276
    invoke-virtual {p1, v0, v1, p2}, Lfj/k0;->K(JLjava/lang/Object;)Lfj/k0;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Lnet/time4j/g0;

    .line 281
    .line 282
    return-object p1
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
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$d;->d(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Lfj/p;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$d;->e(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/g0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/g0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/g0$d;->b(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public e(Lnet/time4j/g0;)Lfj/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/g0;",
            ")",
            "Lfj/p<",
            "*>;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnet/time4j/g0$d;->b(Lnet/time4j/g0;)Lfj/p;

    move-result-object p1

    return-object p1
.end method

.method public f(Lnet/time4j/g0;)Ljava/lang/Integer;
    .locals 2

    .line 1
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lnet/time4j/g0$d;->l:I

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    goto :goto_0

    .line 15
    :pswitch_1
    const/4 p1, 0x0

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lnet/time4j/g0;->z0(Lfj/p;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget p1, p0, Lnet/time4j/g0$d;->n:I

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x1

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    iget p1, p0, Lnet/time4j/g0$d;->n:I

    .line 39
    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
.end method

.method public g(Lnet/time4j/g0;)Ljava/lang/Integer;
    .locals 0

    iget p1, p0, Lnet/time4j/g0$d;->m:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public h(Lnet/time4j/g0;)Ljava/lang/Integer;
    .locals 4

    .line 1
    iget v0, p0, Lnet/time4j/g0$d;->l:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 11
    .line 12
    iget-object v0, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 13
    .line 14
    invoke-interface {v0}, Lfj/p;->name()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_0
    invoke-static {p1}, Lnet/time4j/g0;->g0(Lnet/time4j/g0;)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    const-wide/32 v2, 0xf4240

    .line 27
    .line 28
    .line 29
    div-long/2addr v0, v2

    .line 30
    long-to-int v1, v0

    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :pswitch_1
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_1

    .line 38
    :pswitch_2
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    div-int/lit16 v1, p1, 0x3e8

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :pswitch_3
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const v0, 0xf4240

    .line 50
    .line 51
    .line 52
    div-int v1, p1, v0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_4
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    mul-int/lit16 v0, v0, 0xe10

    .line 60
    .line 61
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    mul-int/lit8 v1, v1, 0x3c

    .line 66
    .line 67
    add-int/2addr v0, v1

    .line 68
    invoke-static {p1}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    goto :goto_0

    .line 73
    :pswitch_5
    invoke-static {p1}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    goto :goto_1

    .line 78
    :pswitch_6
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    mul-int/lit8 v0, v0, 0x3c

    .line 83
    .line 84
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    :goto_0
    add-int v1, v0, p1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_7
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    goto :goto_1

    .line 96
    :pswitch_8
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    goto :goto_1

    .line 101
    :pswitch_9
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    rem-int/lit8 v1, p1, 0x18

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_a
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    rem-int/lit8 v1, p1, 0xc

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :pswitch_b
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    rem-int/2addr p1, v1

    .line 120
    if-nez p1, :cond_0

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_0
    move v1, p1

    .line 124
    goto :goto_1

    .line 125
    :pswitch_c
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    rem-int/lit8 v1, p1, 0xc

    .line 130
    .line 131
    if-nez v1, :cond_1

    .line 132
    .line 133
    move v1, v2

    .line 134
    :cond_1
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :pswitch_data_0
    .packed-switch 0x1
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
.end method

.method public bridge synthetic j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$d;->f(Lnet/time4j/g0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/g0$d;->n(Lnet/time4j/g0;Ljava/lang/Integer;)Z

    move-result p1

    return p1
.end method

.method public n(Lnet/time4j/g0;Ljava/lang/Integer;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget v1, p0, Lnet/time4j/g0$d;->m:I

    .line 10
    .line 11
    if-lt p2, v1, :cond_b

    .line 12
    .line 13
    iget v1, p0, Lnet/time4j/g0$d;->n:I

    .line 14
    .line 15
    if-le p2, v1, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    const/4 v2, 0x1

    .line 19
    if-ne p2, v1, :cond_8

    .line 20
    .line 21
    iget v1, p0, Lnet/time4j/g0$d;->l:I

    .line 22
    .line 23
    const/4 v3, 0x5

    .line 24
    if-eq v1, v3, :cond_7

    .line 25
    .line 26
    const/4 v3, 0x7

    .line 27
    if-eq v1, v3, :cond_6

    .line 28
    .line 29
    const/16 v3, 0x9

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    const/16 v3, 0xd

    .line 34
    .line 35
    if-eq v1, v3, :cond_2

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const p2, 0xf4240

    .line 43
    .line 44
    .line 45
    rem-int/2addr p1, p2

    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    move v0, v2

    .line 49
    :cond_3
    return v0

    .line 50
    :cond_4
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    move v0, v2

    .line 57
    :cond_5
    return v0

    .line 58
    :cond_6
    invoke-static {p1}, Lnet/time4j/g0;->S(Lnet/time4j/g0;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    return p1

    .line 63
    :cond_7
    invoke-static {p1}, Lnet/time4j/g0;->R(Lnet/time4j/g0;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :cond_8
    :goto_0
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    const/16 v1, 0x18

    .line 73
    .line 74
    if-ne p1, v1, :cond_a

    .line 75
    .line 76
    iget p1, p0, Lnet/time4j/g0$d;->l:I

    .line 77
    .line 78
    packed-switch p1, :pswitch_data_0

    .line 79
    .line 80
    .line 81
    :pswitch_0
    goto :goto_1

    .line 82
    :pswitch_1
    if-nez p2, :cond_9

    .line 83
    .line 84
    move v0, v2

    .line 85
    :cond_9
    return v0

    .line 86
    :cond_a
    :goto_1
    return v2

    .line 87
    :cond_b
    :goto_2
    return v0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
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
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/g0$d;->r(Lnet/time4j/g0;Ljava/lang/Integer;Z)Lnet/time4j/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$d;->g(Lnet/time4j/g0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1}, Lnet/time4j/g0$d;->h(Lnet/time4j/g0;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public r(Lnet/time4j/g0;Ljava/lang/Integer;Z)Lnet/time4j/g0;
    .locals 6

    .line 1
    if-eqz p2, :cond_5

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-direct {p0, p1, p2}, Lnet/time4j/g0$d;->s(Lnet/time4j/g0;I)Lnet/time4j/g0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lnet/time4j/g0$d;->n(Lnet/time4j/g0;Ljava/lang/Integer;)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_4

    .line 19
    .line 20
    invoke-static {p1}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-static {p1}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p1}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget v3, p0, Lnet/time4j/g0$d;->l:I

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    const v5, 0xf4240

    .line 44
    .line 45
    .line 46
    packed-switch v3, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 50
    .line 51
    iget-object p2, p0, Lnet/time4j/g0$d;->k:Lfj/p;

    .line 52
    .line 53
    invoke-interface {p2}, Lfj/p;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :pswitch_0
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    rem-int/2addr p1, v5

    .line 66
    invoke-static {p2, p1}, Lnet/time4j/g0;->Q(II)Lnet/time4j/g0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :pswitch_1
    move v2, p2

    .line 72
    goto :goto_2

    .line 73
    :pswitch_2
    mul-int/lit16 p2, p2, 0x3e8

    .line 74
    .line 75
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    rem-int/lit16 p1, p1, 0x3e8

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :pswitch_3
    mul-int/2addr p2, v5

    .line 83
    invoke-static {p1}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    rem-int/2addr p1, v5

    .line 88
    :goto_0
    add-int v2, p2, p1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_4
    div-int/lit16 p3, p2, 0xe10

    .line 92
    .line 93
    rem-int/lit16 p2, p2, 0xe10

    .line 94
    .line 95
    div-int/lit8 v0, p2, 0x3c

    .line 96
    .line 97
    rem-int/lit8 v1, p2, 0x3c

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :pswitch_5
    move v1, p2

    .line 101
    goto :goto_2

    .line 102
    :pswitch_6
    div-int/lit8 p3, p2, 0x3c

    .line 103
    .line 104
    rem-int/lit8 v0, p2, 0x3c

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :pswitch_7
    move v0, p2

    .line 108
    goto :goto_2

    .line 109
    :cond_1
    :goto_1
    :pswitch_8
    move p3, p2

    .line 110
    goto :goto_2

    .line 111
    :pswitch_9
    invoke-static {p1}, Lnet/time4j/g0$d;->i(Lnet/time4j/g0;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    add-int/lit8 p2, p2, 0xc

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_a
    const/16 p1, 0x18

    .line 122
    .line 123
    if-ne p2, p1, :cond_1

    .line 124
    .line 125
    move p3, v4

    .line 126
    goto :goto_2

    .line 127
    :pswitch_b
    const/16 p3, 0xc

    .line 128
    .line 129
    if-ne p2, p3, :cond_3

    .line 130
    .line 131
    move p2, v4

    .line 132
    :cond_3
    invoke-static {p1}, Lnet/time4j/g0$d;->i(Lnet/time4j/g0;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_2

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :goto_2
    invoke-static {p3, v0, v1, v2}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 145
    .line 146
    new-instance p3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v0, "Value out of range: "

    .line 152
    .line 153
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 168
    .line 169
    const-string p2, "Missing element value."

    .line 170
    .line 171
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1

    .line 175
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
.end method
