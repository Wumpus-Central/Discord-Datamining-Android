.class public final Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;,
        Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0008\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u00c7\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000e\u00a8\u0006$"
    }
    d2 = {
        "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;",
        "Lcom/discord/reactions/BurstReactionView$ThemedBurstColorPalette;",
        "seen1",
        "",
        "light",
        "Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;",
        "dark",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)V",
        "getDark$annotations",
        "()V",
        "getDark",
        "()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;",
        "getLight$annotations",
        "getLight",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "$serializer",
        "Companion",
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

.annotation runtime Lwi/f;
.end annotation


# static fields
.field public static final Companion:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;


# instance fields
.field private final dark:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

.field private final light:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->Companion:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 1
    sget-object p4, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;

    invoke-virtual {p4}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lzi/n1;->b(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->light:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    iput-object p3, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->dark:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    return-void
.end method

.method public constructor <init>(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)V
    .locals 1

    const-string v0, "light"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->light:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    .line 4
    iput-object p2, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->dark:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    return-void
.end method

.method public static synthetic copy$default(Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;ILjava/lang/Object;)Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->copy(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDark$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getLight$annotations()V
    .locals 0

    return-void
.end method

.method public static final write$Self(Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3

    .line 1
    const-string v0, "self"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "output"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "serialDesc"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette$$serializer;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILwi/h;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
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
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;
    .locals 1

    const-string v0, "light"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dark"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    invoke-direct {v0, p1, p2}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;-><init>(Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v1

    invoke-virtual {p1}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->dark:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    return-object v0
.end method

.method public bridge synthetic getDark()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->light:Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    return-object v0
.end method

.method public bridge synthetic getLight()Lcom/discord/reactions/BurstReactionView$BurstColorPalette;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v1

    invoke-virtual {v1}, Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getLight()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v0

    invoke-virtual {p0}, Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;->getDark()Lcom/discord/chat/bridge/reaction/BurstReactionColorPalette;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ThemedBurstReactionColorPalette(light="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dark="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method