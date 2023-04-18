.class Lg5/n3$f;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/n3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "[",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 67

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "adlm"

    .line 7
    .line 8
    const-string v2, "ahom"

    .line 9
    .line 10
    const-string v3, "arab"

    .line 11
    .line 12
    const-string v4, "arabext"

    .line 13
    .line 14
    const-string v5, "bali"

    .line 15
    .line 16
    const-string v6, "beng"

    .line 17
    .line 18
    const-string v7, "bhks"

    .line 19
    .line 20
    const-string v8, "brah"

    .line 21
    .line 22
    const-string v9, "cakm"

    .line 23
    .line 24
    const-string v10, "cham"

    .line 25
    .line 26
    const-string v11, "deva"

    .line 27
    .line 28
    const-string v12, "diak"

    .line 29
    .line 30
    const-string v13, "fullwide"

    .line 31
    .line 32
    const-string v14, "gong"

    .line 33
    .line 34
    const-string v15, "gonm"

    .line 35
    .line 36
    const-string v16, "gujr"

    .line 37
    .line 38
    const-string v17, "guru"

    .line 39
    .line 40
    const-string v18, "hanidec"

    .line 41
    .line 42
    const-string v19, "hmng"

    .line 43
    .line 44
    const-string v20, "hmnp"

    .line 45
    .line 46
    const-string v21, "java"

    .line 47
    .line 48
    const-string v22, "kali"

    .line 49
    .line 50
    const-string v23, "khmr"

    .line 51
    .line 52
    const-string v24, "knda"

    .line 53
    .line 54
    const-string v25, "lana"

    .line 55
    .line 56
    const-string v26, "lanatham"

    .line 57
    .line 58
    const-string v27, "laoo"

    .line 59
    .line 60
    const-string v28, "latn"

    .line 61
    .line 62
    const-string v29, "lepc"

    .line 63
    .line 64
    const-string v30, "limb"

    .line 65
    .line 66
    const-string v31, "mathbold"

    .line 67
    .line 68
    const-string v32, "mathdbl"

    .line 69
    .line 70
    const-string v33, "mathmono"

    .line 71
    .line 72
    const-string v34, "mathsanb"

    .line 73
    .line 74
    const-string v35, "mathsans"

    .line 75
    .line 76
    const-string v36, "mlym"

    .line 77
    .line 78
    const-string v37, "modi"

    .line 79
    .line 80
    const-string v38, "mong"

    .line 81
    .line 82
    const-string v39, "mroo"

    .line 83
    .line 84
    const-string v40, "mtei"

    .line 85
    .line 86
    const-string v41, "mymr"

    .line 87
    .line 88
    const-string v42, "mymrshan"

    .line 89
    .line 90
    const-string v43, "mymrtlng"

    .line 91
    .line 92
    const-string v44, "newa"

    .line 93
    .line 94
    const-string v45, "nkoo"

    .line 95
    .line 96
    const-string v46, "olck"

    .line 97
    .line 98
    const-string v47, "orya"

    .line 99
    .line 100
    const-string v48, "osma"

    .line 101
    .line 102
    const-string v49, "rohg"

    .line 103
    .line 104
    const-string v50, "saur"

    .line 105
    .line 106
    const-string v51, "segment"

    .line 107
    .line 108
    const-string v52, "shrd"

    .line 109
    .line 110
    const-string v53, "sind"

    .line 111
    .line 112
    const-string v54, "sinh"

    .line 113
    .line 114
    const-string v55, "sora"

    .line 115
    .line 116
    const-string v56, "sund"

    .line 117
    .line 118
    const-string v57, "takr"

    .line 119
    .line 120
    const-string v58, "talu"

    .line 121
    .line 122
    const-string v59, "tamldec"

    .line 123
    .line 124
    const-string v60, "telu"

    .line 125
    .line 126
    const-string v61, "thai"

    .line 127
    .line 128
    const-string v62, "tibt"

    .line 129
    .line 130
    const-string v63, "tirh"

    .line 131
    .line 132
    const-string v64, "vaii"

    .line 133
    .line 134
    const-string v65, "wara"

    .line 135
    .line 136
    const-string v66, "wcho"

    .line 137
    .line 138
    filled-new-array/range {v1 .. v66}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const-string v2, "nu"

    .line 143
    .line 144
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    const-string v3, "big5han"

    .line 148
    .line 149
    const-string v4, "compat"

    .line 150
    .line 151
    const-string v5, "dict"

    .line 152
    .line 153
    const-string v6, "direct"

    .line 154
    .line 155
    const-string v7, "ducet"

    .line 156
    .line 157
    const-string v8, "emoji"

    .line 158
    .line 159
    const-string v9, "eor"

    .line 160
    .line 161
    const-string v10, "gb2312"

    .line 162
    .line 163
    const-string v11, "phonebk"

    .line 164
    .line 165
    const-string v12, "phonetic"

    .line 166
    .line 167
    const-string v13, "pinyin"

    .line 168
    .line 169
    const-string v14, "reformed"

    .line 170
    .line 171
    const-string v15, "searchjl"

    .line 172
    .line 173
    const-string v16, "stroke"

    .line 174
    .line 175
    const-string v17, "trad"

    .line 176
    .line 177
    const-string v18, "unihan"

    .line 178
    .line 179
    const-string v19, "zhuyin"

    .line 180
    .line 181
    filled-new-array/range {v3 .. v19}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const-string v2, "co"

    .line 186
    .line 187
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    const-string v3, "buddhist"

    .line 191
    .line 192
    const-string v4, "chinese"

    .line 193
    .line 194
    const-string v5, "coptic"

    .line 195
    .line 196
    const-string v6, "dangi"

    .line 197
    .line 198
    const-string v7, "ethioaa"

    .line 199
    .line 200
    const-string v8, "ethiopic"

    .line 201
    .line 202
    const-string v9, "gregory"

    .line 203
    .line 204
    const-string v10, "hebrew"

    .line 205
    .line 206
    const-string v11, "indian"

    .line 207
    .line 208
    const-string v12, "islamic"

    .line 209
    .line 210
    const-string v13, "islamic-umalqura"

    .line 211
    .line 212
    const-string v14, "islamic-tbla"

    .line 213
    .line 214
    const-string v15, "islamic-civil"

    .line 215
    .line 216
    const-string v16, "islamic-rgsa"

    .line 217
    .line 218
    const-string v17, "iso8601"

    .line 219
    .line 220
    const-string v18, "japanese"

    .line 221
    .line 222
    const-string v19, "persian"

    .line 223
    .line 224
    const-string v20, "roc"

    .line 225
    .line 226
    filled-new-array/range {v3 .. v20}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const-string v2, "ca"

    .line 231
    .line 232
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    return-void
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
.end method
