.class public final Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbj/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbj/f0<",
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl.$serializer",
        "Lbj/f0;",
        "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;",
        "",
        "Lkotlinx/serialization/KSerializer;",
        "childSerializers",
        "()[Lkotlinx/serialization/KSerializer;",
        "Lkotlinx/serialization/encoding/Decoder;",
        "decoder",
        "deserialize",
        "Lkotlinx/serialization/encoding/Encoder;",
        "encoder",
        "value",
        "",
        "serialize",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "getDescriptor",
        "()Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "descriptor",
        "<init>",
        "()V",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl"

    .line 11
    .line 12
    const/16 v3, 0x25

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lbj/f0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "backgroundColor"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "borderColor"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "headerColor"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "headerText"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "type"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "titleText"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "subtitle"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "helpCenterArticleLabel"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "helpCenterArticleURL"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "acceptLabelBackgroundColor"

    .line 64
    .line 65
    const/4 v3, 0x1

    .line 66
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "acceptLabelBorderColor"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "acceptLabelColor"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "acceptLabelText"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "bodyText"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "bodyTextColor"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "canBeAccepted"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "channelIcon"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "channelName"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "embedCanBeTapped"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v0, "memberText"

    .line 115
    .line 116
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    const-string v0, "onlineText"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    const-string v0, "resolvingGradientEnd"

    .line 125
    .line 126
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v0, "resolvingGradientStart"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    const-string v0, "splashHasRadialGradient"

    .line 135
    .line 136
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    const-string v0, "splashOpacity"

    .line 140
    .line 141
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string v0, "splashUrl"

    .line 145
    .line 146
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    const-string v0, "inviteSplash"

    .line 150
    .line 151
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    const-string v0, "subtitleColor"

    .line 155
    .line 156
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    const-string v0, "thumbnailBackgroundColor"

    .line 160
    .line 161
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    const-string v0, "thumbnailCornerRadius"

    .line 165
    .line 166
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    const-string v0, "thumbnailText"

    .line 170
    .line 171
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    const-string v0, "thumbnailUrl"

    .line 175
    .line 176
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    const-string v0, "titleColor"

    .line 180
    .line 181
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    const-string v0, "extendedType"

    .line 185
    .line 186
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    const-string v0, "guildName"

    .line 190
    .line 191
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    const-string v0, "guildIcon"

    .line 195
    .line 196
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 197
    .line 198
    .line 199
    const-string v0, "headerIcon"

    .line 200
    .line 201
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 202
    .line 203
    .line 204
    sput-object v1, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 205
    .line 206
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x25

    .line 2
    .line 3
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    sget-object v1, Lbj/m0;->a:Lbj/m0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    aput-object v1, v0, v2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    aput-object v1, v0, v2

    .line 15
    .line 16
    sget-object v2, Lbj/a2;->a:Lbj/a2;

    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    aput-object v2, v0, v3

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    sget-object v4, Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;

    .line 23
    .line 24
    aput-object v4, v0, v3

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    aput-object v2, v0, v3

    .line 28
    .line 29
    const/4 v3, 0x6

    .line 30
    aput-object v2, v0, v3

    .line 31
    .line 32
    const/4 v3, 0x7

    .line 33
    aput-object v2, v0, v3

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    aput-object v2, v0, v3

    .line 38
    .line 39
    const/16 v3, 0x9

    .line 40
    .line 41
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    aput-object v4, v0, v3

    .line 46
    .line 47
    const/16 v3, 0xa

    .line 48
    .line 49
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    aput-object v4, v0, v3

    .line 54
    .line 55
    const/16 v3, 0xb

    .line 56
    .line 57
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    aput-object v4, v0, v3

    .line 62
    .line 63
    const/16 v3, 0xc

    .line 64
    .line 65
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    aput-object v4, v0, v3

    .line 70
    .line 71
    const/16 v3, 0xd

    .line 72
    .line 73
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    aput-object v4, v0, v3

    .line 78
    .line 79
    const/16 v3, 0xe

    .line 80
    .line 81
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    aput-object v4, v0, v3

    .line 86
    .line 87
    sget-object v3, Lbj/h;->a:Lbj/h;

    .line 88
    .line 89
    invoke-static {v3}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const/16 v5, 0xf

    .line 94
    .line 95
    aput-object v4, v0, v5

    .line 96
    .line 97
    const/16 v4, 0x10

    .line 98
    .line 99
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    aput-object v5, v0, v4

    .line 104
    .line 105
    const/16 v4, 0x11

    .line 106
    .line 107
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    aput-object v5, v0, v4

    .line 112
    .line 113
    const/16 v4, 0x12

    .line 114
    .line 115
    invoke-static {v3}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    aput-object v5, v0, v4

    .line 120
    .line 121
    const/16 v4, 0x13

    .line 122
    .line 123
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    aput-object v5, v0, v4

    .line 128
    .line 129
    const/16 v4, 0x14

    .line 130
    .line 131
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    aput-object v5, v0, v4

    .line 136
    .line 137
    const/16 v4, 0x15

    .line 138
    .line 139
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    aput-object v5, v0, v4

    .line 144
    .line 145
    const/16 v4, 0x16

    .line 146
    .line 147
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    aput-object v5, v0, v4

    .line 152
    .line 153
    const/16 v4, 0x17

    .line 154
    .line 155
    invoke-static {v3}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    aput-object v3, v0, v4

    .line 160
    .line 161
    const/16 v3, 0x18

    .line 162
    .line 163
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    aput-object v4, v0, v3

    .line 168
    .line 169
    const/16 v3, 0x19

    .line 170
    .line 171
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    aput-object v4, v0, v3

    .line 176
    .line 177
    const/16 v3, 0x1a

    .line 178
    .line 179
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    aput-object v4, v0, v3

    .line 184
    .line 185
    const/16 v3, 0x1b

    .line 186
    .line 187
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    aput-object v4, v0, v3

    .line 192
    .line 193
    const/16 v3, 0x1c

    .line 194
    .line 195
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    aput-object v4, v0, v3

    .line 200
    .line 201
    const/16 v3, 0x1d

    .line 202
    .line 203
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    aput-object v4, v0, v3

    .line 208
    .line 209
    const/16 v3, 0x1e

    .line 210
    .line 211
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    aput-object v4, v0, v3

    .line 216
    .line 217
    const/16 v3, 0x1f

    .line 218
    .line 219
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    aput-object v4, v0, v3

    .line 224
    .line 225
    const/16 v3, 0x20

    .line 226
    .line 227
    invoke-static {v1}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    aput-object v1, v0, v3

    .line 232
    .line 233
    const/16 v1, 0x21

    .line 234
    .line 235
    sget-object v3, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    .line 236
    .line 237
    aput-object v3, v0, v1

    .line 238
    .line 239
    const/16 v1, 0x22

    .line 240
    .line 241
    aput-object v2, v0, v1

    .line 242
    .line 243
    const/16 v1, 0x23

    .line 244
    .line 245
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    aput-object v3, v0, v1

    .line 250
    .line 251
    const/16 v1, 0x24

    .line 252
    .line 253
    invoke-static {v2}, Lzi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    aput-object v2, v0, v1

    .line 258
    .line 259
    return-object v0
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
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;
    .locals 66

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->p()Z

    move-result v2

    const/16 v9, 0xb

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x7

    const/4 v13, 0x6

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v4, 0x8

    const/4 v3, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v7}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v2

    invoke-interface {v0, v1, v6}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v6

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v5

    invoke-interface {v0, v1, v15}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v7

    sget-object v15, Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v14}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0, v1, v13}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v0, v1, v12}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v1, v4}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v4

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    invoke-interface {v0, v1, v11, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v1, v10, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v9, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move/from16 v24, v2

    sget-object v2, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v25, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v23, v3

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v21, v3

    sget-object v3, Lbj/h;->a:Lbj/h;

    move-object/from16 v26, v4

    const/16 v4, 0xf

    invoke-interface {v0, v1, v4, v3, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v20, v4

    const/16 v4, 0x10

    invoke-interface {v0, v1, v4, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v19, v4

    const/16 v4, 0x11

    invoke-interface {v0, v1, v4, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v18, v4

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v3, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p1, v4

    const/16 v4, 0x13

    invoke-interface {v0, v1, v4, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v27, v4

    const/16 v4, 0x14

    invoke-interface {v0, v1, v4, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v28, v4

    const/16 v4, 0x15

    invoke-interface {v0, v1, v4, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v29, v4

    const/16 v4, 0x16

    invoke-interface {v0, v1, v4, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v30, v4

    const/16 v4, 0x17

    invoke-interface {v0, v1, v4, v3, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x18

    invoke-interface {v0, v1, v4, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v31, v3

    const/16 v3, 0x19

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v32, v3

    const/16 v3, 0x1a

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v33, v3

    const/16 v3, 0x1b

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v34, v3

    const/16 v3, 0x1c

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v35, v3

    const/16 v3, 0x1d

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v36, v3

    const/16 v3, 0x1e

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v37, v3

    const/16 v3, 0x1f

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v38

    const/16 v3, 0x20

    invoke-interface {v0, v1, v3, v15, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v15, 0x21

    move-object/from16 v16, v3

    sget-object v3, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    invoke-interface {v0, v1, v15, v3, v8}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v15, 0x22

    invoke-interface {v0, v1, v15}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v15

    move-object/from16 v39, v3

    const/16 v3, 0x23

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v40, v3

    const/16 v3, 0x24

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, -0x1

    move/from16 v43, v3

    move-object/from16 v63, v4

    move/from16 v48, v5

    move/from16 v47, v6

    move-object/from16 v49, v7

    move-object/from16 v41, v9

    move-object/from16 v52, v12

    move-object/from16 v51, v13

    move-object/from16 v50, v14

    move-object/from16 v57, v15

    move-object/from16 v17, v19

    move-object/from16 v15, v20

    move-object/from16 v4, v21

    move/from16 v9, v24

    move-object/from16 v3, v25

    move-object/from16 v53, v26

    move-object/from16 v54, v27

    move-object/from16 v56, v28

    move-object/from16 v58, v29

    move-object/from16 v59, v30

    move-object/from16 v62, v31

    move-object/from16 v5, v32

    move-object/from16 v14, v33

    move-object/from16 v7, v34

    move-object/from16 v12, v35

    move-object/from16 v8, v36

    move-object/from16 v42, v38

    move-object/from16 v64, v39

    const/16 v61, 0x1f

    move-object/from16 v27, p1

    move-object/from16 v35, v11

    move-object/from16 v26, v18

    move-object/from16 v11, v37

    move-object/from16 v65, v40

    move-object/from16 v40, v10

    move-object/from16 v10, v65

    goto/16 :goto_d

    :cond_0
    move/from16 v60, v6

    move/from16 v24, v7

    move/from16 v25, v24

    move/from16 v43, v25

    move/from16 v61, v43

    move-object v2, v8

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v9, v6

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    move-object/from16 v26, v15

    move-object/from16 v28, v26

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v44, v31

    move-object/from16 v45, v44

    move-object/from16 v46, v45

    move-object/from16 v47, v46

    move-object/from16 v48, v47

    move-object/from16 v49, v48

    move-object/from16 v50, v49

    move-object/from16 v51, v50

    move-object/from16 v52, v51

    move-object/from16 v53, v52

    move-object/from16 v54, v53

    move-object/from16 v55, v54

    move-object/from16 v56, v55

    move-object/from16 v57, v56

    move-object/from16 v58, v57

    move-object/from16 v59, v58

    move-object/from16 v7, v59

    move/from16 v8, v61

    :goto_0
    if-eqz v60, :cond_1

    move-object/from16 v62, v5

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->o(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    new-instance v0, Lyi/n;

    invoke-direct {v0, v5}, Lyi/n;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v5, 0x24

    move-object/from16 v63, v15

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    invoke-interface {v0, v1, v5, v15, v6}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit8 v61, v61, 0x10

    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v6, v5

    goto/16 :goto_4

    :pswitch_1
    move-object/from16 v63, v15

    const/16 v5, 0x23

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    invoke-interface {v0, v1, v5, v15, v7}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit8 v61, v61, 0x8

    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v7, v5

    goto/16 :goto_4

    :pswitch_2
    move-object/from16 v63, v15

    const/16 v5, 0x22

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v5

    or-int/lit8 v61, v61, 0x4

    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v57, v5

    goto/16 :goto_4

    :pswitch_3
    move-object/from16 v63, v15

    const/16 v5, 0x21

    sget-object v15, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType$Serializer;

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v61, v61, 0x2

    goto/16 :goto_2

    :pswitch_4
    move-object/from16 v63, v15

    sget-object v5, Lbj/m0;->a:Lbj/m0;

    const/16 v15, 0x20

    invoke-interface {v0, v1, v15, v5, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit8 v61, v61, 0x1

    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v9, v5

    goto/16 :goto_4

    :pswitch_5
    move-object/from16 v63, v15

    const/16 v15, 0x20

    sget-object v5, Lbj/a2;->a:Lbj/a2;

    const/16 v15, 0x1f

    invoke-interface {v0, v1, v15, v5, v10}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v10, -0x80000000

    or-int/2addr v8, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v10, v5

    goto/16 :goto_4

    :pswitch_6
    move-object/from16 v63, v15

    const/16 v15, 0x1f

    const/16 v5, 0x1e

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    invoke-interface {v0, v1, v5, v15, v11}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v11, 0x40000000    # 2.0f

    or-int/2addr v8, v11

    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v11, v5

    goto/16 :goto_4

    :pswitch_7
    move-object/from16 v63, v15

    const/16 v5, 0x1d

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    invoke-interface {v0, v1, v5, v15, v4}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/high16 v5, 0x20000000

    goto :goto_1

    :pswitch_8
    move-object/from16 v63, v15

    const/16 v5, 0x1c

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    invoke-interface {v0, v1, v5, v15, v12}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v12, 0x10000000

    or-int/2addr v8, v12

    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v12, v5

    goto/16 :goto_4

    :pswitch_9
    move-object/from16 v63, v15

    const/16 v5, 0x1b

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    invoke-interface {v0, v1, v5, v15, v13}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v13, 0x8000000

    or-int/2addr v8, v13

    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v13, v5

    goto/16 :goto_4

    :pswitch_a
    move-object/from16 v63, v15

    const/16 v5, 0x1a

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    invoke-interface {v0, v1, v5, v15, v14}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v14, 0x4000000

    or-int/2addr v8, v14

    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object v14, v5

    goto/16 :goto_4

    :pswitch_b
    move-object/from16 v63, v15

    const/16 v5, 0x19

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    invoke-interface {v0, v1, v5, v15, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v5, 0x2000000

    :goto_1
    or-int/2addr v8, v5

    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    goto/16 :goto_3

    :pswitch_c
    move-object/from16 v63, v15

    const/16 v5, 0x18

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v64, v2

    move-object/from16 v2, v63

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x1000000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object v15, v2

    move-object/from16 v18, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v5, v62

    goto/16 :goto_6

    :pswitch_d
    move-object/from16 v64, v2

    move-object v2, v15

    const/16 v5, 0x17

    sget-object v15, Lbj/h;->a:Lbj/h;

    move-object/from16 v63, v2

    move-object/from16 v2, v62

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x800000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object v5, v2

    move-object/from16 v18, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    goto/16 :goto_5

    :pswitch_e
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v2, v62

    const/16 v5, 0x16

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v2, v59

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x400000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v59, v2

    goto :goto_3

    :pswitch_f
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v2, v59

    const/16 v5, 0x15

    sget-object v15, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v2, v58

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x200000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v58, v2

    goto :goto_3

    :pswitch_10
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v2, v58

    const/16 v5, 0x14

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v2, v56

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x100000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v56, v2

    goto :goto_3

    :pswitch_11
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v2, v56

    const/16 v5, 0x13

    sget-object v15, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v2, v55

    invoke-interface {v0, v1, v5, v15, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x80000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v55, v2

    :goto_3
    move-object/from16 v18, v3

    :goto_4
    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v5, v62

    :goto_5
    move-object/from16 v15, v63

    :goto_6
    const/4 v2, 0x0

    const/4 v3, 0x3

    goto/16 :goto_c

    :pswitch_12
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v2, v55

    sget-object v5, Lbj/h;->a:Lbj/h;

    move-object/from16 v15, v54

    move-object/from16 v54, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v5, v15}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v15, 0x40000

    or-int/2addr v8, v15

    sget-object v15, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v55, v54

    move-object/from16 v15, v63

    const/4 v2, 0x0

    const/4 v3, 0x3

    move-object/from16 v54, v5

    move-object/from16 v5, v62

    goto/16 :goto_c

    :pswitch_13
    move-object/from16 v64, v2

    move-object/from16 v63, v15

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v2, 0x12

    sget-object v5, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v18, v3

    move-object/from16 v2, v53

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v5, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x20000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v19, v2

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    goto/16 :goto_8

    :pswitch_14
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v3, 0x11

    sget-object v5, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v19, v2

    move-object/from16 v3, v52

    const/16 v2, 0x10

    invoke-interface {v0, v1, v2, v5, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v5, 0x10000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v20, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    goto/16 :goto_8

    :pswitch_15
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v3, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v2, 0x10

    sget-object v5, Lbj/h;->a:Lbj/h;

    move-object/from16 v20, v3

    move-object/from16 v2, v51

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3, v5, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0x8000

    or-int/2addr v8, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v21, v2

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    goto/16 :goto_8

    :pswitch_16
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v3, 0xf

    sget-object v5, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v21, v2

    move-object/from16 v3, v50

    const/16 v2, 0xe

    invoke-interface {v0, v1, v2, v5, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v8, v8, 0x4000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v22, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    goto/16 :goto_8

    :pswitch_17
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v3, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v2, 0xe

    sget-object v5, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v22, v3

    move-object/from16 v2, v49

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v5, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x2000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v23, v2

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    goto/16 :goto_8

    :pswitch_18
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v3, 0xd

    sget-object v5, Lbj/a2;->a:Lbj/a2;

    move-object/from16 v23, v2

    move-object/from16 v3, v48

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v5, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v8, v8, 0x1000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v42, v3

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    goto/16 :goto_8

    :pswitch_19
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v3, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v2, 0xc

    sget-object v5, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v42, v3

    move-object/from16 v2, v47

    const/16 v3, 0xb

    invoke-interface {v0, v1, v3, v5, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x800

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v41, v2

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    goto/16 :goto_8

    :pswitch_1a
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v3, 0xb

    sget-object v5, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v41, v2

    move-object/from16 v3, v46

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v5, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v8, v8, 0x400

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v40, v3

    move-object/from16 v35, v45

    goto/16 :goto_8

    :pswitch_1b
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v3, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v2, 0xa

    sget-object v5, Lbj/m0;->a:Lbj/m0;

    move-object/from16 v40, v3

    move-object/from16 v2, v45

    const/16 v3, 0x9

    invoke-interface {v0, v1, v3, v5, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v8, v8, 0x200

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto/16 :goto_7

    :pswitch_1c
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v3, 0x9

    const/16 v5, 0x8

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v31

    or-int/lit16 v8, v8, 0x100

    sget-object v39, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto/16 :goto_7

    :pswitch_1d
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v3, 0x7

    const/16 v5, 0x8

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v30

    or-int/lit16 v8, v8, 0x80

    sget-object v38, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_7

    :pswitch_1e
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v3, 0x6

    const/16 v5, 0x8

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v29

    or-int/lit8 v8, v8, 0x40

    sget-object v37, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_7

    :pswitch_1f
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v3, 0x5

    const/16 v5, 0x8

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v28

    or-int/lit8 v8, v8, 0x20

    sget-object v36, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_7
    move-object/from16 v35, v2

    goto :goto_8

    :pswitch_20
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v2, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/16 v5, 0x8

    sget-object v3, Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/InviteType$Serializer;

    move-object/from16 v35, v2

    move-object/from16 v5, v44

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, v3, v5}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v8, v8, 0x10

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v44, v3

    :goto_8
    move-object/from16 v5, v62

    const/4 v2, 0x0

    const/4 v3, 0x3

    goto/16 :goto_b

    :pswitch_21
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v2, 0x4

    const/4 v3, 0x3

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v8, v8, 0x8

    sget-object v34, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_9

    :pswitch_22
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v24

    or-int/lit8 v8, v8, 0x4

    sget-object v33, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_9

    :pswitch_23
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v2, 0x1

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v25

    or-int/lit8 v8, v8, 0x2

    sget-object v32, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_9
    move-object/from16 v5, v62

    const/4 v2, 0x0

    goto :goto_b

    :pswitch_24
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-interface {v0, v1, v2}, Lkotlinx/serialization/encoding/c;->i(Lkotlinx/serialization/descriptors/SerialDescriptor;I)I

    move-result v27

    or-int/lit8 v8, v8, 0x1

    sget-object v43, Lkotlin/Unit;->a:Lkotlin/Unit;

    move/from16 v43, v27

    goto :goto_a

    :pswitch_25
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    const/4 v2, 0x0

    const/4 v3, 0x3

    sget-object v27, Lkotlin/Unit;->a:Lkotlin/Unit;

    move/from16 v60, v2

    :goto_a
    move-object/from16 v5, v62

    :goto_b
    move-object/from16 v54, v15

    move-object/from16 v15, v63

    :goto_c
    move-object/from16 v3, v18

    move-object/from16 v53, v19

    move-object/from16 v52, v20

    move-object/from16 v51, v21

    move-object/from16 v50, v22

    move-object/from16 v49, v23

    move-object/from16 v45, v35

    move-object/from16 v46, v40

    move-object/from16 v47, v41

    move-object/from16 v48, v42

    move-object/from16 v2, v64

    goto/16 :goto_0

    :cond_1
    move-object/from16 v64, v2

    move-object/from16 v18, v3

    move-object/from16 v62, v5

    move-object/from16 v63, v15

    move-object/from16 v5, v44

    move-object/from16 v35, v45

    move-object/from16 v40, v46

    move-object/from16 v41, v47

    move-object/from16 v42, v48

    move-object/from16 v23, v49

    move-object/from16 v22, v50

    move-object/from16 v21, v51

    move-object/from16 v20, v52

    move-object/from16 v19, v53

    move-object/from16 v15, v54

    move-object/from16 v54, v55

    move-object v3, v5

    move-object v2, v6

    move-object/from16 v16, v9

    move-object/from16 v27, v15

    move-object/from16 v5, v18

    move-object/from16 v17, v20

    move-object/from16 v15, v21

    move/from16 v48, v24

    move/from16 v47, v25

    move-object/from16 v49, v26

    move-object/from16 v50, v28

    move-object/from16 v51, v29

    move-object/from16 v52, v30

    move-object/from16 v53, v31

    move/from16 v9, v43

    move/from16 v43, v8

    move-object/from16 v26, v19

    move-object v8, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v42

    move-object/from16 v42, v10

    move-object v10, v7

    move-object v7, v13

    :goto_d
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    move-object v6, v0

    move-object v13, v3

    check-cast v13, Lcom/discord/chat/bridge/codedlinks/InviteType;

    move-object/from16 v18, v35

    check-cast v18, Ljava/lang/Integer;

    move-object/from16 v19, v40

    check-cast v19, Ljava/lang/Integer;

    move-object/from16 v20, v41

    check-cast v20, Ljava/lang/Integer;

    move-object/from16 v21, v23

    check-cast v21, Ljava/lang/String;

    check-cast v22, Ljava/lang/String;

    move-object/from16 v23, v4

    check-cast v23, Ljava/lang/Integer;

    move-object/from16 v24, v15

    check-cast v24, Ljava/lang/Boolean;

    move-object/from16 v25, v17

    check-cast v25, Ljava/lang/String;

    check-cast v26, Ljava/lang/String;

    check-cast v27, Ljava/lang/Boolean;

    move-object/from16 v28, v54

    check-cast v28, Ljava/lang/String;

    move-object/from16 v29, v56

    check-cast v29, Ljava/lang/String;

    move-object/from16 v30, v58

    check-cast v30, Ljava/lang/Integer;

    move-object/from16 v31, v59

    check-cast v31, Ljava/lang/Integer;

    move-object/from16 v32, v62

    check-cast v32, Ljava/lang/Boolean;

    move-object/from16 v33, v63

    check-cast v33, Ljava/lang/Integer;

    move-object/from16 v34, v5

    check-cast v34, Ljava/lang/String;

    move-object/from16 v35, v14

    check-cast v35, Ljava/lang/String;

    move-object/from16 v36, v7

    check-cast v36, Ljava/lang/Integer;

    move-object/from16 v37, v12

    check-cast v37, Ljava/lang/Integer;

    move-object/from16 v38, v8

    check-cast v38, Ljava/lang/Integer;

    move-object/from16 v39, v11

    check-cast v39, Ljava/lang/String;

    move-object/from16 v40, v42

    check-cast v40, Ljava/lang/String;

    move-object/from16 v41, v16

    check-cast v41, Ljava/lang/Integer;

    move-object/from16 v42, v64

    check-cast v42, Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;

    move-object/from16 v44, v10

    check-cast v44, Ljava/lang/String;

    move-object/from16 v45, v2

    check-cast v45, Ljava/lang/String;

    const/16 v46, 0x0

    move/from16 v7, v43

    move/from16 v8, v61

    move/from16 v10, v47

    move/from16 v11, v48

    move-object/from16 v12, v49

    move-object/from16 v14, v50

    move-object/from16 v15, v51

    move-object/from16 v16, v52

    move-object/from16 v17, v53

    move-object/from16 v43, v57

    invoke-direct/range {v6 .. v46}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;-><init>(IIIIILjava/lang/String;Lcom/discord/chat/bridge/codedlinks/InviteType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/codedlinks/CodedLinkExtendedType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
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
.end method

.method public bridge synthetic deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;->write$Self(Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;)V

    return-void
.end method

.method public typeParametersSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, Lbj/f0$a;->a(Lbj/f0;)[Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method
