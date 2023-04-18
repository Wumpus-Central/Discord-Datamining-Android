.class public Lt/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/f2;


# static fields
.field private static final a:Lw/p2;

.field private static final b:Lw/p2;

.field private static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 148

    .line 1
    invoke-static {}, Lt/l;->a()Lw/p2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lt/l;->a:Lw/p2;

    .line 6
    .line 7
    invoke-static {}, Lt/l;->b()Lw/p2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lt/l;->b:Lw/p2;

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashSet;

    .line 14
    .line 15
    const-string v1, "SM-A515F"

    .line 16
    .line 17
    const-string v2, "SM-A515U"

    .line 18
    .line 19
    const-string v3, "SM-A515U1"

    .line 20
    .line 21
    const-string v4, "SM-A515W"

    .line 22
    .line 23
    const-string v5, "SM-S515DL"

    .line 24
    .line 25
    const-string v6, "SC-54A"

    .line 26
    .line 27
    const-string v7, "SCG07"

    .line 28
    .line 29
    const-string v8, "SM-A5160"

    .line 30
    .line 31
    const-string v9, "SM-A516B"

    .line 32
    .line 33
    const-string v10, "SM-A516N"

    .line 34
    .line 35
    const-string v11, "SM-A516U"

    .line 36
    .line 37
    const-string v12, "SM-A516U1"

    .line 38
    .line 39
    const-string v13, "SM-A516V"

    .line 40
    .line 41
    const-string v14, "SM-A715F"

    .line 42
    .line 43
    const-string v15, "SM-A715W"

    .line 44
    .line 45
    const-string v16, "SM-A7160"

    .line 46
    .line 47
    const-string v17, "SM-A716B"

    .line 48
    .line 49
    const-string v18, "SM-A716U"

    .line 50
    .line 51
    const-string v19, "SM-A716U1"

    .line 52
    .line 53
    const-string v20, "SM-A716V"

    .line 54
    .line 55
    const-string v21, "SM-A8050"

    .line 56
    .line 57
    const-string v22, "SM-A805F"

    .line 58
    .line 59
    const-string v23, "SM-A805N"

    .line 60
    .line 61
    const-string v24, "SCV44"

    .line 62
    .line 63
    const-string v25, "SM-F9000"

    .line 64
    .line 65
    const-string v26, "SM-F900F"

    .line 66
    .line 67
    const-string v27, "SM-F900U"

    .line 68
    .line 69
    const-string v28, "SM-F900U1"

    .line 70
    .line 71
    const-string v29, "SM-F900W"

    .line 72
    .line 73
    const-string v30, "SM-F907B"

    .line 74
    .line 75
    const-string v31, "SM-F907N"

    .line 76
    .line 77
    const-string v32, "SM-N970F"

    .line 78
    .line 79
    const-string v33, "SM-N9700"

    .line 80
    .line 81
    const-string v34, "SM-N970U"

    .line 82
    .line 83
    const-string v35, "SM-N970U1"

    .line 84
    .line 85
    const-string v36, "SM-N970W"

    .line 86
    .line 87
    const-string v37, "SM-N971N"

    .line 88
    .line 89
    const-string v38, "SM-N770F"

    .line 90
    .line 91
    const-string v39, "SC-01M"

    .line 92
    .line 93
    const-string v40, "SCV45"

    .line 94
    .line 95
    const-string v41, "SM-N9750"

    .line 96
    .line 97
    const-string v42, "SM-N975C"

    .line 98
    .line 99
    const-string v43, "SM-N975U"

    .line 100
    .line 101
    const-string v44, "SM-N975U1"

    .line 102
    .line 103
    const-string v45, "SM-N975W"

    .line 104
    .line 105
    const-string v46, "SM-N975F"

    .line 106
    .line 107
    const-string v47, "SM-N976B"

    .line 108
    .line 109
    const-string v48, "SM-N976N"

    .line 110
    .line 111
    const-string v49, "SM-N9760"

    .line 112
    .line 113
    const-string v50, "SM-N976Q"

    .line 114
    .line 115
    const-string v51, "SM-N976V"

    .line 116
    .line 117
    const-string v52, "SM-N976U"

    .line 118
    .line 119
    const-string v53, "SM-N9810"

    .line 120
    .line 121
    const-string v54, "SM-N981N"

    .line 122
    .line 123
    const-string v55, "SM-N981U"

    .line 124
    .line 125
    const-string v56, "SM-N981U1"

    .line 126
    .line 127
    const-string v57, "SM-N981W"

    .line 128
    .line 129
    const-string v58, "SM-N981B"

    .line 130
    .line 131
    const-string v59, "SC-53A"

    .line 132
    .line 133
    const-string v60, "SCG06"

    .line 134
    .line 135
    const-string v61, "SM-N9860"

    .line 136
    .line 137
    const-string v62, "SM-N986N"

    .line 138
    .line 139
    const-string v63, "SM-N986U"

    .line 140
    .line 141
    const-string v64, "SM-N986U1"

    .line 142
    .line 143
    const-string v65, "SM-N986W"

    .line 144
    .line 145
    const-string v66, "SM-N986B"

    .line 146
    .line 147
    const-string v67, "SC-03L"

    .line 148
    .line 149
    const-string v68, "SCV41"

    .line 150
    .line 151
    const-string v69, "SM-G973F"

    .line 152
    .line 153
    const-string v70, "SM-G973N"

    .line 154
    .line 155
    const-string v71, "SM-G9730"

    .line 156
    .line 157
    const-string v72, "SM-G9738"

    .line 158
    .line 159
    const-string v73, "SM-G973C"

    .line 160
    .line 161
    const-string v74, "SM-G973U"

    .line 162
    .line 163
    const-string v75, "SM-G973U1"

    .line 164
    .line 165
    const-string v76, "SM-G973W"

    .line 166
    .line 167
    const-string v77, "SM-G977B"

    .line 168
    .line 169
    const-string v78, "SM-G977N"

    .line 170
    .line 171
    const-string v79, "SM-G977P"

    .line 172
    .line 173
    const-string v80, "SM-G977T"

    .line 174
    .line 175
    const-string v81, "SM-G977U"

    .line 176
    .line 177
    const-string v82, "SM-G770F"

    .line 178
    .line 179
    const-string v83, "SM-G770U1"

    .line 180
    .line 181
    const-string v84, "SC-04L"

    .line 182
    .line 183
    const-string v85, "SCV42"

    .line 184
    .line 185
    const-string v86, "SM-G975F"

    .line 186
    .line 187
    const-string v87, "SM-G975N"

    .line 188
    .line 189
    const-string v88, "SM-G9750"

    .line 190
    .line 191
    const-string v89, "SM-G9758"

    .line 192
    .line 193
    const-string v90, "SM-G975U"

    .line 194
    .line 195
    const-string v91, "SM-G975U1"

    .line 196
    .line 197
    const-string v92, "SM-G975W"

    .line 198
    .line 199
    const-string v93, "SC-05L"

    .line 200
    .line 201
    const-string v94, "SM-G970F"

    .line 202
    .line 203
    const-string v95, "SM-G970N"

    .line 204
    .line 205
    const-string v96, "SM-G9700"

    .line 206
    .line 207
    const-string v97, "SM-G9708"

    .line 208
    .line 209
    const-string v98, "SM-G970U"

    .line 210
    .line 211
    const-string v99, "SM-G970U1"

    .line 212
    .line 213
    const-string v100, "SM-G970W"

    .line 214
    .line 215
    const-string v101, "SC-51A"

    .line 216
    .line 217
    const-string v102, "SC51Aa"

    .line 218
    .line 219
    const-string v103, "SCG01"

    .line 220
    .line 221
    const-string v104, "SM-G9810"

    .line 222
    .line 223
    const-string v105, "SM-G981N"

    .line 224
    .line 225
    const-string v106, "SM-G981U"

    .line 226
    .line 227
    const-string v107, "SM-G981U1"

    .line 228
    .line 229
    const-string v108, "SM-G981V"

    .line 230
    .line 231
    const-string v109, "SM-G981W"

    .line 232
    .line 233
    const-string v110, "SM-G981B"

    .line 234
    .line 235
    const-string v111, "SCG03"

    .line 236
    .line 237
    const-string v112, "SM-G9880"

    .line 238
    .line 239
    const-string v113, "SM-G988N"

    .line 240
    .line 241
    const-string v114, "SM-G988Q"

    .line 242
    .line 243
    const-string v115, "SM-G988U"

    .line 244
    .line 245
    const-string v116, "SM-G988U1"

    .line 246
    .line 247
    const-string v117, "SM-G988W"

    .line 248
    .line 249
    const-string v118, "SM-G988B"

    .line 250
    .line 251
    const-string v119, "SC-52A"

    .line 252
    .line 253
    const-string v120, "SCG02"

    .line 254
    .line 255
    const-string v121, "SM-G9860"

    .line 256
    .line 257
    const-string v122, "SM-G986N"

    .line 258
    .line 259
    const-string v123, "SM-G986U"

    .line 260
    .line 261
    const-string v124, "SM-G986U1"

    .line 262
    .line 263
    const-string v125, "SM-G986W"

    .line 264
    .line 265
    const-string v126, "SM-G986B"

    .line 266
    .line 267
    const-string v127, "SCV47"

    .line 268
    .line 269
    const-string v128, "SM-F7000"

    .line 270
    .line 271
    const-string v129, "SM-F700F"

    .line 272
    .line 273
    const-string v130, "SM-F700N"

    .line 274
    .line 275
    const-string v131, "SM-F700U"

    .line 276
    .line 277
    const-string v132, "SM-F700U1"

    .line 278
    .line 279
    const-string v133, "SM-F700W"

    .line 280
    .line 281
    const-string v134, "SCG04"

    .line 282
    .line 283
    const-string v135, "SM-F7070"

    .line 284
    .line 285
    const-string v136, "SM-F707B"

    .line 286
    .line 287
    const-string v137, "SM-F707N"

    .line 288
    .line 289
    const-string v138, "SM-F707U"

    .line 290
    .line 291
    const-string v139, "SM-F707U1"

    .line 292
    .line 293
    const-string v140, "SM-F707W"

    .line 294
    .line 295
    const-string v141, "SM-F9160"

    .line 296
    .line 297
    const-string v142, "SM-F916B"

    .line 298
    .line 299
    const-string v143, "SM-F916N"

    .line 300
    .line 301
    const-string v144, "SM-F916Q"

    .line 302
    .line 303
    const-string v145, "SM-F916U"

    .line 304
    .line 305
    const-string v146, "SM-F916U1"

    .line 306
    .line 307
    const-string v147, "SM-F916W"

    .line 308
    .line 309
    filled-new-array/range {v1 .. v147}, [Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 318
    .line 319
    .line 320
    sput-object v0, Lt/l;->c:Ljava/util/Set;

    .line 321
    .line 322
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Lw/p2;
    .locals 4

    .line 1
    new-instance v0, Lw/p2;

    .line 2
    .line 3
    invoke-direct {v0}, Lw/p2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lw/q2$b;->l:Lw/q2$b;

    .line 7
    .line 8
    sget-object v2, Lw/q2$a;->l:Lw/q2$a;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Lw/p2;->a(Lw/q2;)Z

    .line 15
    .line 16
    .line 17
    sget-object v2, Lw/q2$b;->k:Lw/q2$b;

    .line 18
    .line 19
    sget-object v3, Lw/q2$a;->m:Lw/q2$a;

    .line 20
    .line 21
    invoke-static {v2, v3}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Lw/p2;->a(Lw/q2;)Z

    .line 26
    .line 27
    .line 28
    sget-object v2, Lw/q2$a;->o:Lw/q2$a;

    .line 29
    .line 30
    invoke-static {v1, v2}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lw/p2;->a(Lw/q2;)Z

    .line 35
    .line 36
    .line 37
    return-object v0
    .line 38
    .line 39
    .line 40
.end method

.method private static b()Lw/p2;
    .locals 3

    .line 1
    new-instance v0, Lw/p2;

    .line 2
    .line 3
    invoke-direct {v0}, Lw/p2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lw/q2$b;->l:Lw/q2$b;

    .line 7
    .line 8
    sget-object v2, Lw/q2$a;->l:Lw/q2$a;

    .line 9
    .line 10
    invoke-static {v1, v2}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v0, v2}, Lw/p2;->a(Lw/q2;)Z

    .line 15
    .line 16
    .line 17
    sget-object v2, Lw/q2$a;->m:Lw/q2$a;

    .line 18
    .line 19
    invoke-static {v1, v2}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v2}, Lw/p2;->a(Lw/q2;)Z

    .line 24
    .line 25
    .line 26
    sget-object v2, Lw/q2$a;->o:Lw/q2$a;

    .line 27
    .line 28
    invoke-static {v1, v2}, Lw/q2;->a(Lw/q2$b;Lw/q2$a;)Lw/q2;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Lw/p2;->a(Lw/q2;)Z

    .line 33
    .line 34
    .line 35
    return-object v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method private d(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lw/p2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lt/l;->a:Lw/p2;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    sget-object p1, Lt/l;->b:Lw/p2;

    .line 14
    .line 15
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object v0
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

.method private e(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lw/p2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "1"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    sget-object p1, Lt/l;->a:Lw/p2;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    return-object v0
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

.method private static f()Z
    .locals 2

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    const-string v1, "heroqltevzw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "heroqltetmo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method static g()Z
    .locals 1

    invoke-static {}, Lt/l;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lt/l;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private static h()Z
    .locals 2

    .line 1
    const-string v0, "samsung"

    .line 2
    .line 3
    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lt/l;->c:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    return v0
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


# virtual methods
.method public c(Ljava/lang/String;I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lw/p2;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lt/l;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lt/l;->e(Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-static {}, Lt/l;->h()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0, p2}, Lt/l;->d(I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
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
.end method
