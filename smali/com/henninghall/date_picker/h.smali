.class public Lcom/henninghall/date_picker/h;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private final k:Landroid/view/ViewGroup$LayoutParams;

.field private l:Lbe/d;

.field private m:Lcom/henninghall/date_picker/k;

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/henninghall/date_picker/b;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/henninghall/date_picker/k;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/henninghall/date_picker/k;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/henninghall/date_picker/h;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v0, Lcom/henninghall/date_picker/h$a;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/henninghall/date_picker/h$a;-><init>(Lcom/henninghall/date_picker/h;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/henninghall/date_picker/h;->o:Ljava/lang/Runnable;

    .line 26
    .line 27
    iput-object p1, p0, Lcom/henninghall/date_picker/h;->k:Landroid/view/ViewGroup$LayoutParams;

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
.end method

.method private varargs a([Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    iget-object v4, p0, Lcom/henninghall/date_picker/h;->n:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public b(II)V
    .locals 1

    iget-object v0, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    invoke-virtual {v0, p1, p2}, Lbe/d;->e(II)V

    return-void
.end method

.method public c()V
    .locals 13

    .line 1
    const-string v0, "androidVariant"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, v1}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object v3, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    .line 34
    .line 35
    iget-object v3, v3, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/henninghall/date_picker/c;->d()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lcom/henninghall/date_picker/h;->k:Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lbe/d;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    .line 52
    .line 53
    invoke-direct {v1, v2, p0}, Lbe/d;-><init>(Lcom/henninghall/date_picker/k;Landroid/view/View;)V

    .line 54
    .line 55
    .line 56
    iput-object v1, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 57
    .line 58
    :cond_0
    const-string v1, "fadeToColor"

    .line 59
    .line 60
    filled-new-array {v1}, [Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-direct {p0, v1}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    iget-object v1, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 71
    .line 72
    invoke-virtual {v1}, Lbe/d;->i()V

    .line 73
    .line 74
    .line 75
    :cond_1
    const-string v1, "textColor"

    .line 76
    .line 77
    filled-new-array {v1}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-direct {p0, v1}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    iget-object v1, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 88
    .line 89
    invoke-virtual {v1}, Lbe/d;->l()V

    .line 90
    .line 91
    .line 92
    :cond_2
    const-string v1, "mode"

    .line 93
    .line 94
    const-string v2, "is24hourSource"

    .line 95
    .line 96
    filled-new-array {v1, v0, v2}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {p0, v3}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    iget-object v3, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 107
    .line 108
    invoke-virtual {v3}, Lbe/d;->o()V

    .line 109
    .line 110
    .line 111
    :cond_3
    const-string v3, "height"

    .line 112
    .line 113
    filled-new-array {v3}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-direct {p0, v3}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    iget-object v3, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 124
    .line 125
    invoke-virtual {v3}, Lbe/d;->j()V

    .line 126
    .line 127
    .line 128
    :cond_4
    const-string v3, "dividerHeight"

    .line 129
    .line 130
    filled-new-array {v3}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-direct {p0, v3}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    iget-object v3, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 141
    .line 142
    invoke-virtual {v3}, Lbe/d;->h()V

    .line 143
    .line 144
    .line 145
    :cond_5
    const-string v3, "locale"

    .line 146
    .line 147
    filled-new-array {v1, v3, v0, v2}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-direct {p0, v0}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_6

    .line 156
    .line 157
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 158
    .line 159
    invoke-virtual {v0}, Lbe/d;->m()V

    .line 160
    .line 161
    .line 162
    :cond_6
    filled-new-array {v1}, [Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {p0, v0}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 173
    .line 174
    invoke-virtual {v0}, Lbe/d;->n()V

    .line 175
    .line 176
    .line 177
    :cond_7
    const-string v4, "date"

    .line 178
    .line 179
    const-string v5, "height"

    .line 180
    .line 181
    const-string v6, "locale"

    .line 182
    .line 183
    const-string v7, "maximumDate"

    .line 184
    .line 185
    const-string v8, "minimumDate"

    .line 186
    .line 187
    const-string v9, "minuteInterval"

    .line 188
    .line 189
    const-string v10, "mode"

    .line 190
    .line 191
    const-string v11, "utc"

    .line 192
    .line 193
    const-string v12, "androidVariant"

    .line 194
    .line 195
    filled-new-array/range {v4 .. v12}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-direct {p0, v0}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 206
    .line 207
    invoke-virtual {v0}, Lbe/d;->g()V

    .line 208
    .line 209
    .line 210
    :cond_8
    filled-new-array {v3}, [Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-direct {p0, v0}, Lcom/henninghall/date_picker/h;->a([Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-eqz v0, :cond_9

    .line 219
    .line 220
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/henninghall/date_picker/k;->u()Ljava/util/Locale;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, Lbe/a;->h(Ljava/util/Locale;)V

    .line 227
    .line 228
    .line 229
    :cond_9
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->l:Lbe/d;

    .line 230
    .line 231
    invoke-virtual {v0}, Lbe/d;->f()V

    .line 232
    .line 233
    .line 234
    new-instance v0, Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 237
    .line 238
    .line 239
    iput-object v0, p0, Lcom/henninghall/date_picker/h;->n:Ljava/util/ArrayList;

    .line 240
    .line 241
    return-void
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
.end method

.method public d(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/henninghall/date_picker/k;->F(Ljava/lang/String;Lcom/facebook/react/bridge/Dynamic;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/henninghall/date_picker/h;->n:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

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
.end method

.method public getDate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/henninghall/date_picker/h;->m:Lcom/henninghall/date_picker/k;

    iget-object v0, v0, Lcom/henninghall/date_picker/k;->p:Lcom/henninghall/date_picker/c;

    invoke-virtual {v0}, Lcom/henninghall/date_picker/c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public requestLayout()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/RelativeLayout;->requestLayout()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/henninghall/date_picker/h;->o:Ljava/lang/Runnable;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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
.end method
