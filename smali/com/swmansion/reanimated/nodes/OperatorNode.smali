.class public Lcom/swmansion/reanimated/nodes/OperatorNode;
.super Lcom/swmansion/reanimated/nodes/Node;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/reanimated/nodes/OperatorNode$CompOperator;,
        Lcom/swmansion/reanimated/nodes/OperatorNode$SingleOperator;,
        Lcom/swmansion/reanimated/nodes/OperatorNode$ReduceOperator;,
        Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;
    }
.end annotation


# static fields
.field private static final ABS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final ACOS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final ADD:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final AND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final ASIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final ATAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final CEIL:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final COS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final DEFINED:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final DIVIDE:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final EXP:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final FLOOR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final GREATER_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final GREATER_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final LESS_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final LESS_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final LOG:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final MAX:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final MIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final MODULO:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final MULTIPLY:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final NEQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final NOT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final OR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final POW:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final ROUND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final SIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final SQRT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final SUB:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

.field private static final TAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;


# instance fields
.field private final mInputIDs:[I

.field private final mInputNodes:[Lcom/swmansion/reanimated/nodes/Node;

.field private final mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ADD:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 7
    .line 8
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$2;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$2;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->SUB:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 14
    .line 15
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$3;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$3;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->MULTIPLY:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 21
    .line 22
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$4;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$4;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->DIVIDE:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 28
    .line 29
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$5;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$5;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->POW:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 35
    .line 36
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$6;

    .line 37
    .line 38
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$6;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->MODULO:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 42
    .line 43
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$7;

    .line 44
    .line 45
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$7;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->SQRT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 49
    .line 50
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$8;

    .line 51
    .line 52
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$8;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->LOG:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 56
    .line 57
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$9;

    .line 58
    .line 59
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$9;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->SIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 63
    .line 64
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$10;

    .line 65
    .line 66
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$10;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->COS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 70
    .line 71
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$11;

    .line 72
    .line 73
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$11;-><init>()V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->TAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 77
    .line 78
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$12;

    .line 79
    .line 80
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$12;-><init>()V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ACOS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 84
    .line 85
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$13;

    .line 86
    .line 87
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$13;-><init>()V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ASIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 91
    .line 92
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$14;

    .line 93
    .line 94
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$14;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ATAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 98
    .line 99
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$15;

    .line 100
    .line 101
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$15;-><init>()V

    .line 102
    .line 103
    .line 104
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->EXP:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 105
    .line 106
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$16;

    .line 107
    .line 108
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$16;-><init>()V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ROUND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 112
    .line 113
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$17;

    .line 114
    .line 115
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$17;-><init>()V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->ABS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 119
    .line 120
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$18;

    .line 121
    .line 122
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$18;-><init>()V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->FLOOR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 126
    .line 127
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$19;

    .line 128
    .line 129
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$19;-><init>()V

    .line 130
    .line 131
    .line 132
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->CEIL:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 133
    .line 134
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$20;

    .line 135
    .line 136
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$20;-><init>()V

    .line 137
    .line 138
    .line 139
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->MIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 140
    .line 141
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$21;

    .line 142
    .line 143
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$21;-><init>()V

    .line 144
    .line 145
    .line 146
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->MAX:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 147
    .line 148
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$22;

    .line 149
    .line 150
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$22;-><init>()V

    .line 151
    .line 152
    .line 153
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->AND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 154
    .line 155
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$23;

    .line 156
    .line 157
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$23;-><init>()V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->OR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 161
    .line 162
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$24;

    .line 163
    .line 164
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$24;-><init>()V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->NOT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 168
    .line 169
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$25;

    .line 170
    .line 171
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$25;-><init>()V

    .line 172
    .line 173
    .line 174
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->DEFINED:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 175
    .line 176
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$26;

    .line 177
    .line 178
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$26;-><init>()V

    .line 179
    .line 180
    .line 181
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->LESS_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 182
    .line 183
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$27;

    .line 184
    .line 185
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$27;-><init>()V

    .line 186
    .line 187
    .line 188
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 189
    .line 190
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$28;

    .line 191
    .line 192
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$28;-><init>()V

    .line 193
    .line 194
    .line 195
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->GREATER_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 196
    .line 197
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$29;

    .line 198
    .line 199
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$29;-><init>()V

    .line 200
    .line 201
    .line 202
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->LESS_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 203
    .line 204
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$30;

    .line 205
    .line 206
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$30;-><init>()V

    .line 207
    .line 208
    .line 209
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->GREATER_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 210
    .line 211
    new-instance v0, Lcom/swmansion/reanimated/nodes/OperatorNode$31;

    .line 212
    .line 213
    invoke-direct {v0}, Lcom/swmansion/reanimated/nodes/OperatorNode$31;-><init>()V

    .line 214
    .line 215
    .line 216
    sput-object v0, Lcom/swmansion/reanimated/nodes/OperatorNode;->NEQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 217
    .line 218
    return-void
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
.end method

.method public constructor <init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/reanimated/nodes/Node;-><init>(ILcom/facebook/react/bridge/ReadableMap;Lcom/swmansion/reanimated/NodesManager;)V

    .line 2
    .line 3
    .line 4
    const-string p1, "input"

    .line 5
    .line 6
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lcom/swmansion/reanimated/Utils;->processIntArray(Lcom/facebook/react/bridge/ReadableArray;)[I

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mInputIDs:[I

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    new-array p1, p1, [Lcom/swmansion/reanimated/nodes/Node;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mInputNodes:[Lcom/swmansion/reanimated/nodes/Node;

    .line 20
    .line 21
    const-string p1, "op"

    .line 22
    .line 23
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const-string p2, "add"

    .line 28
    .line 29
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ADD:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_0
    const-string p2, "sub"

    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->SUB:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 50
    .line 51
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_1
    const-string p2, "multiply"

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eqz p2, :cond_2

    .line 62
    .line 63
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->MULTIPLY:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 64
    .line 65
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_2
    const-string p2, "divide"

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->DIVIDE:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 78
    .line 79
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_3
    const-string p2, "pow"

    .line 84
    .line 85
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-eqz p2, :cond_4

    .line 90
    .line 91
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->POW:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 92
    .line 93
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_4
    const-string p2, "modulo"

    .line 98
    .line 99
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_5

    .line 104
    .line 105
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->MODULO:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 106
    .line 107
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :cond_5
    const-string p2, "sqrt"

    .line 112
    .line 113
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eqz p2, :cond_6

    .line 118
    .line 119
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->SQRT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 120
    .line 121
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_6
    const-string p2, "log"

    .line 126
    .line 127
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-eqz p2, :cond_7

    .line 132
    .line 133
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->LOG:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 134
    .line 135
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_7
    const-string p2, "sin"

    .line 140
    .line 141
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    if-eqz p2, :cond_8

    .line 146
    .line 147
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->SIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 148
    .line 149
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_8
    const-string p2, "cos"

    .line 154
    .line 155
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    if-eqz p2, :cond_9

    .line 160
    .line 161
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->COS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 162
    .line 163
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_9
    const-string p2, "tan"

    .line 168
    .line 169
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    if-eqz p2, :cond_a

    .line 174
    .line 175
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->TAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 176
    .line 177
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_a
    const-string p2, "acos"

    .line 182
    .line 183
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-eqz p2, :cond_b

    .line 188
    .line 189
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ACOS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 190
    .line 191
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_b
    const-string p2, "asin"

    .line 196
    .line 197
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p2

    .line 201
    if-eqz p2, :cond_c

    .line 202
    .line 203
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ASIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 204
    .line 205
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_c
    const-string p2, "atan"

    .line 210
    .line 211
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result p2

    .line 215
    if-eqz p2, :cond_d

    .line 216
    .line 217
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ATAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 218
    .line 219
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_d
    const-string p2, "exp"

    .line 224
    .line 225
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p2

    .line 229
    if-eqz p2, :cond_e

    .line 230
    .line 231
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->EXP:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 232
    .line 233
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_e
    const-string p2, "round"

    .line 238
    .line 239
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p2

    .line 243
    if-eqz p2, :cond_f

    .line 244
    .line 245
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ROUND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 246
    .line 247
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_f
    const-string p2, "and"

    .line 252
    .line 253
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    if-eqz p2, :cond_10

    .line 258
    .line 259
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->AND:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 260
    .line 261
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_10
    const-string p2, "or"

    .line 266
    .line 267
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    if-eqz p2, :cond_11

    .line 272
    .line 273
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->OR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 274
    .line 275
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_11
    const-string p2, "not"

    .line 280
    .line 281
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    if-eqz p2, :cond_12

    .line 286
    .line 287
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->NOT:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 288
    .line 289
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :cond_12
    const-string p2, "defined"

    .line 294
    .line 295
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result p2

    .line 299
    if-eqz p2, :cond_13

    .line 300
    .line 301
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->DEFINED:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 302
    .line 303
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_13
    const-string p2, "lessThan"

    .line 308
    .line 309
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p2

    .line 313
    if-eqz p2, :cond_14

    .line 314
    .line 315
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->LESS_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 316
    .line 317
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :cond_14
    const-string p2, "eq"

    .line 322
    .line 323
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result p2

    .line 327
    if-eqz p2, :cond_15

    .line 328
    .line 329
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 330
    .line 331
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :cond_15
    const-string p2, "greaterThan"

    .line 336
    .line 337
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result p2

    .line 341
    if-eqz p2, :cond_16

    .line 342
    .line 343
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->GREATER_THAN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 344
    .line 345
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :cond_16
    const-string p2, "lessOrEq"

    .line 350
    .line 351
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result p2

    .line 355
    if-eqz p2, :cond_17

    .line 356
    .line 357
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->LESS_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 358
    .line 359
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 360
    .line 361
    goto :goto_0

    .line 362
    :cond_17
    const-string p2, "greaterOrEq"

    .line 363
    .line 364
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p2

    .line 368
    if-eqz p2, :cond_18

    .line 369
    .line 370
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->GREATER_OR_EQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 371
    .line 372
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 373
    .line 374
    goto :goto_0

    .line 375
    :cond_18
    const-string p2, "neq"

    .line 376
    .line 377
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result p2

    .line 381
    if-eqz p2, :cond_19

    .line 382
    .line 383
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->NEQ:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 384
    .line 385
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 386
    .line 387
    goto :goto_0

    .line 388
    :cond_19
    const-string p2, "abs"

    .line 389
    .line 390
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result p2

    .line 394
    if-eqz p2, :cond_1a

    .line 395
    .line 396
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->ABS:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 397
    .line 398
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 399
    .line 400
    goto :goto_0

    .line 401
    :cond_1a
    const-string p2, "floor"

    .line 402
    .line 403
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result p2

    .line 407
    if-eqz p2, :cond_1b

    .line 408
    .line 409
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->FLOOR:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 410
    .line 411
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 412
    .line 413
    goto :goto_0

    .line 414
    :cond_1b
    const-string p2, "ceil"

    .line 415
    .line 416
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    if-eqz p2, :cond_1c

    .line 421
    .line 422
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->CEIL:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 423
    .line 424
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :cond_1c
    const-string p2, "max"

    .line 428
    .line 429
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result p2

    .line 433
    if-eqz p2, :cond_1d

    .line 434
    .line 435
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->MAX:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 436
    .line 437
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 438
    .line 439
    goto :goto_0

    .line 440
    :cond_1d
    const-string p2, "min"

    .line 441
    .line 442
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result p2

    .line 446
    if-eqz p2, :cond_1e

    .line 447
    .line 448
    sget-object p1, Lcom/swmansion/reanimated/nodes/OperatorNode;->MIN:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 449
    .line 450
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 451
    .line 452
    :goto_0
    return-void

    .line 453
    :cond_1e
    new-instance p2, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    .line 454
    .line 455
    new-instance p3, Ljava/lang/StringBuilder;

    .line 456
    .line 457
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 458
    .line 459
    .line 460
    const-string v0, "Unrecognized operator "

    .line 461
    .line 462
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object p1

    .line 472
    invoke-direct {p2, p1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    throw p2
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

.method static synthetic access$200(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lcom/swmansion/reanimated/nodes/OperatorNode;->truthy(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static truthy(Ljava/lang/Object;)Z
    .locals 2

    if-eqz p0, :cond_0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method protected evaluate()Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mInputIDs:[I

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mInputNodes:[Lcom/swmansion/reanimated/nodes/Node;

    .line 8
    .line 9
    iget-object v3, p0, Lcom/swmansion/reanimated/nodes/Node;->mNodesManager:Lcom/swmansion/reanimated/NodesManager;

    .line 10
    .line 11
    aget v1, v1, v0

    .line 12
    .line 13
    const-class v4, Lcom/swmansion/reanimated/nodes/Node;

    .line 14
    .line 15
    invoke-virtual {v3, v1, v4}, Lcom/swmansion/reanimated/NodesManager;->findNodeById(ILjava/lang/Class;)Lcom/swmansion/reanimated/nodes/Node;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    aput-object v1, v2, v0

    .line 20
    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mOperator:Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/OperatorNode;->mInputNodes:[Lcom/swmansion/reanimated/nodes/Node;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Lcom/swmansion/reanimated/nodes/OperatorNode$Operator;->evaluate([Lcom/swmansion/reanimated/nodes/Node;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
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
.end method
