.class public Lcom/android/billingclient/api/BillingFlowParams$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/BillingFlowParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/List;

.field private d:Ljava/util/ArrayList;

.field private e:Z

.field private f:Lcom/android/billingclient/api/BillingFlowParams$c$a;


# direct methods
.method synthetic constructor <init>(Lu2/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/android/billingclient/api/BillingFlowParams$c;->a()Lcom/android/billingclient/api/BillingFlowParams$c$a;

    move-result-object p1

    invoke-static {p1}, Lcom/android/billingclient/api/BillingFlowParams$c$a;->f(Lcom/android/billingclient/api/BillingFlowParams$c$a;)Lcom/android/billingclient/api/BillingFlowParams$c$a;

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->f:Lcom/android/billingclient/api/BillingFlowParams$c$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/BillingFlowParams;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move v0, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    iget-object v3, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    move v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v3, v2

    .line 29
    :goto_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v1, "Details of the products must be provided."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    .line 43
    .line 44
    if-nez v3, :cond_4

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v1, "Set SkuDetails or ProductDetailsParams, not both."

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0

    .line 55
    :cond_5
    :goto_3
    const/4 v4, 0x0

    .line 56
    const-string v5, "play_pass_subs"

    .line 57
    .line 58
    if-eqz v0, :cond_c

    .line 59
    .line 60
    iget-object v6, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_b

    .line 67
    .line 68
    iget-object v6, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-le v6, v1, :cond_13

    .line 75
    .line 76
    iget-object v6, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    .line 83
    .line 84
    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    iget-object v8, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v9

    .line 94
    move v10, v2

    .line 95
    :goto_4
    if-ge v10, v9, :cond_8

    .line 96
    .line 97
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Lcom/android/billingclient/api/SkuDetails;

    .line 102
    .line 103
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-nez v12, :cond_7

    .line 108
    .line 109
    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    if-nez v12, :cond_7

    .line 118
    .line 119
    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_6

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 131
    .line 132
    const-string v1, "SKUs should have the same type."

    .line 133
    .line 134
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v0

    .line 138
    :cond_7
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->k()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iget-object v8, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    move v10, v2

    .line 152
    :goto_6
    if-ge v10, v9, :cond_13

    .line 153
    .line 154
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v11

    .line 158
    check-cast v11, Lcom/android/billingclient/api/SkuDetails;

    .line 159
    .line 160
    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    if-nez v12, :cond_a

    .line 165
    .line 166
    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-virtual {v12, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-nez v12, :cond_a

    .line 175
    .line 176
    invoke-virtual {v11}, Lcom/android/billingclient/api/SkuDetails;->k()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    if-eqz v11, :cond_9

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    const-string v1, "All SKUs must have the same package name."

    .line 190
    .line 191
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v0

    .line 195
    :cond_a
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 199
    .line 200
    const-string v1, "SKU cannot be null."

    .line 201
    .line 202
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v0

    .line 206
    :cond_c
    iget-object v6, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    check-cast v6, Lcom/android/billingclient/api/BillingFlowParams$b;

    .line 213
    .line 214
    move v7, v2

    .line 215
    :goto_8
    iget-object v8, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    if-ge v7, v8, :cond_10

    .line 222
    .line 223
    iget-object v8, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 224
    .line 225
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    check-cast v8, Lcom/android/billingclient/api/BillingFlowParams$b;

    .line 230
    .line 231
    if-eqz v8, :cond_f

    .line 232
    .line 233
    if-eqz v7, :cond_e

    .line 234
    .line 235
    invoke-virtual {v8}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-virtual {v9}, Lcom/android/billingclient/api/ProductDetails;->d()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    invoke-virtual {v6}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    invoke-virtual {v10}, Lcom/android/billingclient/api/ProductDetails;->d()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    if-nez v9, :cond_e

    .line 256
    .line 257
    invoke-virtual {v8}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 258
    .line 259
    .line 260
    move-result-object v8

    .line 261
    invoke-virtual {v8}, Lcom/android/billingclient/api/ProductDetails;->d()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v8

    .line 269
    if-eqz v8, :cond_d

    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 273
    .line 274
    const-string v1, "All products should have same ProductType."

    .line 275
    .line 276
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_e
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 284
    .line 285
    const-string v1, "ProductDetailsParams cannot be null."

    .line 286
    .line 287
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    throw v0

    .line 291
    :cond_10
    invoke-virtual {v6}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    invoke-virtual {v7}, Lcom/android/billingclient/api/ProductDetails;->g()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    iget-object v8, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 300
    .line 301
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    :cond_11
    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_13

    .line 310
    .line 311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    check-cast v9, Lcom/android/billingclient/api/BillingFlowParams$b;

    .line 316
    .line 317
    invoke-virtual {v6}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-virtual {v10}, Lcom/android/billingclient/api/ProductDetails;->d()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v10

    .line 325
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    if-nez v10, :cond_11

    .line 330
    .line 331
    invoke-virtual {v9}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    invoke-virtual {v10}, Lcom/android/billingclient/api/ProductDetails;->d()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v10

    .line 343
    if-nez v10, :cond_11

    .line 344
    .line 345
    invoke-virtual {v9}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    invoke-virtual {v9}, Lcom/android/billingclient/api/ProductDetails;->g()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v9

    .line 357
    if-eqz v9, :cond_12

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 361
    .line 362
    const-string v1, "All products must have the same package name."

    .line 363
    .line 364
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_13
    new-instance v5, Lcom/android/billingclient/api/BillingFlowParams;

    .line 369
    .line 370
    invoke-direct {v5, v4}, Lcom/android/billingclient/api/BillingFlowParams;-><init>(Lu2/o;)V

    .line 371
    .line 372
    .line 373
    if-eqz v0, :cond_14

    .line 374
    .line 375
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 376
    .line 377
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    check-cast v0, Lcom/android/billingclient/api/SkuDetails;

    .line 382
    .line 383
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->k()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_16

    .line 392
    .line 393
    :cond_14
    if-eqz v3, :cond_15

    .line 394
    .line 395
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 396
    .line 397
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    check-cast v0, Lcom/android/billingclient/api/BillingFlowParams$b;

    .line 402
    .line 403
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingFlowParams$b;->b()Lcom/android/billingclient/api/ProductDetails;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0}, Lcom/android/billingclient/api/ProductDetails;->g()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-nez v0, :cond_15

    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_15
    move v1, v2

    .line 419
    :cond_16
    :goto_b
    invoke-static {v5, v1}, Lcom/android/billingclient/api/BillingFlowParams;->h(Lcom/android/billingclient/api/BillingFlowParams;Z)V

    .line 420
    .line 421
    .line 422
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->a:Ljava/lang/String;

    .line 423
    .line 424
    invoke-static {v5, v0}, Lcom/android/billingclient/api/BillingFlowParams;->j(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->b:Ljava/lang/String;

    .line 428
    .line 429
    invoke-static {v5, v0}, Lcom/android/billingclient/api/BillingFlowParams;->k(Lcom/android/billingclient/api/BillingFlowParams;Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->f:Lcom/android/billingclient/api/BillingFlowParams$c$a;

    .line 433
    .line 434
    invoke-virtual {v0}, Lcom/android/billingclient/api/BillingFlowParams$c$a;->a()Lcom/android/billingclient/api/BillingFlowParams$c;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {v5, v0}, Lcom/android/billingclient/api/BillingFlowParams;->n(Lcom/android/billingclient/api/BillingFlowParams;Lcom/android/billingclient/api/BillingFlowParams$c;)V

    .line 439
    .line 440
    .line 441
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 442
    .line 443
    if-eqz v0, :cond_17

    .line 444
    .line 445
    new-instance v1, Ljava/util/ArrayList;

    .line 446
    .line 447
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 448
    .line 449
    .line 450
    goto :goto_c

    .line 451
    :cond_17
    new-instance v1, Ljava/util/ArrayList;

    .line 452
    .line 453
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 454
    .line 455
    .line 456
    :goto_c
    invoke-static {v5, v1}, Lcom/android/billingclient/api/BillingFlowParams;->m(Lcom/android/billingclient/api/BillingFlowParams;Ljava/util/ArrayList;)V

    .line 457
    .line 458
    .line 459
    iget-boolean v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->e:Z

    .line 460
    .line 461
    invoke-static {v5, v0}, Lcom/android/billingclient/api/BillingFlowParams;->i(Lcom/android/billingclient/api/BillingFlowParams;Z)V

    .line 462
    .line 463
    .line 464
    iget-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    .line 465
    .line 466
    if-eqz v0, :cond_18

    .line 467
    .line 468
    invoke-static {v0}, Lra/b0;->t(Ljava/util/Collection;)Lra/b0;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    goto :goto_d

    .line 473
    :cond_18
    invoke-static {}, Lra/b0;->u()Lra/b0;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    :goto_d
    invoke-static {v5, v0}, Lcom/android/billingclient/api/BillingFlowParams;->l(Lcom/android/billingclient/api/BillingFlowParams;Lra/b0;)V

    .line 478
    .line 479
    .line 480
    return-object v5
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
.end method

.method public b(Z)Lcom/android/billingclient/api/BillingFlowParams$a;
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->e:Z

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/android/billingclient/api/BillingFlowParams$a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/util/List;)Lcom/android/billingclient/api/BillingFlowParams$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/BillingFlowParams$b;",
            ">;)",
            "Lcom/android/billingclient/api/BillingFlowParams$a;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->c:Ljava/util/List;

    return-object p0
.end method

.method public e(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/BillingFlowParams$a;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    return-object p0
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
.end method

.method public f(Lcom/android/billingclient/api/BillingFlowParams$c;)Lcom/android/billingclient/api/BillingFlowParams$a;
    .locals 0

    invoke-static {p1}, Lcom/android/billingclient/api/BillingFlowParams$c;->c(Lcom/android/billingclient/api/BillingFlowParams$c;)Lcom/android/billingclient/api/BillingFlowParams$c$a;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/BillingFlowParams$a;->f:Lcom/android/billingclient/api/BillingFlowParams$c$a;

    return-object p0
.end method
