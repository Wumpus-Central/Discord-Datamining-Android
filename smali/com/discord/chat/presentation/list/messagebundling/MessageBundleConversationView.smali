.class public final Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lcom/discord/chat/presentation/spine/SpineParentMessage;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B%\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lcom/discord/chat/presentation/spine/SpineParentMessage;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "binding",
        "Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;",
        "replyTextLineBounds",
        "Landroid/graphics/Rect;",
        "spineOriginView",
        "Landroid/view/View;",
        "getSpineOriginView",
        "()Landroid/view/View;",
        "configure",
        "",
        "messageItem",
        "Lcom/discord/chat/presentation/list/item/MessageItem;",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
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


# instance fields
.field private final binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

.field private final replyTextLineBounds:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    move-result-object p1

    const-string p2, "inflate(LayoutInflater.from(context), this)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 4
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->replyTextLineBounds:Landroid/graphics/Rect;

    .line 5
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    const-string p3, "binding.replyAuthorName"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/discord/fonts/DiscordFont;->PrimarySemibold:Lcom/discord/fonts/DiscordFont;

    invoke-static {p2, v0}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 6
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    invoke-static {p2, p3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p3, 0x41400000    # 12.0f

    invoke-static {p2, p3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 7
    iget-object p2, p1, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v0, "binding.replyAuthorAvatar"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/discord/misc/utilities/view/ViewClippingUtilsKt;->clipToCircle(Landroid/view/View;)V

    .line 8
    iget-object p1, p1, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    const-string p2, "_init_$lambda$0"

    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/discord/fonts/DiscordFont;->PrimaryMedium:Lcom/discord/fonts/DiscordFont;

    invoke-static {p1, p2}, Lcom/discord/fonts/DiscordFontUtilsKt;->setDiscordFont(Landroid/widget/TextView;Lcom/discord/fonts/DiscordFont;)V

    .line 10
    invoke-static {p1, p3}, Lcom/discord/SetTextSizeSpKt;->setTextSizeSp(Landroid/widget/TextView;F)V

    .line 11
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p2

    invoke-virtual {p2}, Lcom/discord/theme/DiscordTheme;->getTextNormal()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic b(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->configure$lambda$6$lambda$5(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V

    return-void
.end method

.method private static final configure$lambda$6$lambda$5(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;Landroid/view/View;)V
    .locals 0

    .line 1
    const-string p2, "$eventHandler"

    .line 2
    .line 3
    invoke-static {p0, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "$message"

    .line 7
    .line 8
    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-interface {p0, p1, p2}, Lcom/discord/chat/presentation/events/ChatEventHandler;->onTapReaction-ntcYbpo(Ljava/lang/String;Lcom/discord/reactions/ReactionView$Reaction;)V

    .line 17
    .line 18
    .line 19
    return-void
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
.method public final configure(Lcom/discord/chat/presentation/list/item/MessageItem;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "messageItem"

    .line 6
    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v2, "eventHandler"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/list/item/MessageItem;->getMessage()Lcom/discord/chat/bridge/Message;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/list/item/MessageItem;->getMessageContext()Lcom/discord/chat/presentation/root/MessageContext;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "context"

    .line 30
    .line 31
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v4}, Lcom/discord/chat/bridge/MessageKt;->avatarUrl(Lcom/discord/chat/bridge/Message;Landroid/content/Context;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    iget-object v6, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 39
    .line 40
    iget-object v6, v6, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 41
    .line 42
    invoke-virtual {v6, v4}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageURI(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 46
    .line 47
    iget-object v4, v4, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    .line 48
    .line 49
    const-string v6, "configure$lambda$1"

    .line 50
    .line 51
    invoke-static {v4, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getUsername()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v4, v6}, Lcom/discord/misc/utilities/view/ViewUtilsKt;->setOptionalText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x1

    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-static {v2, v6, v7, v8}, Lcom/discord/chat/bridge/MessageKt;->usernameColor$default(Lcom/discord/chat/bridge/Message;IILjava/lang/Object;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const-string v9, "binding.replyAuthorName"

    .line 76
    .line 77
    if-eqz v4, :cond_0

    .line 78
    .line 79
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 80
    .line 81
    iget-object v4, v4, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    .line 82
    .line 83
    invoke-static {v4, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getContent()Lcom/discord/chat/bridge/structurabletext/StructurableText;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    move-object v11, v8

    .line 95
    invoke-static {v8, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    invoke-static {v2}, Lcom/discord/chat/bridge/MessageKt;->shouldAnimateEmoji(Lcom/discord/chat/bridge/Message;)Z

    .line 103
    .line 104
    .line 105
    move-result v13

    .line 106
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleDot()Z

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getShouldShowRoleOnName()Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const/16 v21, 0x0

    .line 125
    .line 126
    const/16 v22, 0x0

    .line 127
    .line 128
    const/16 v23, 0x0

    .line 129
    .line 130
    const/16 v24, 0x0

    .line 131
    .line 132
    const/16 v25, 0x0

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    const/16 v27, 0x1

    .line 137
    .line 138
    const/16 v28, 0x0

    .line 139
    .line 140
    iget-object v5, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 141
    .line 142
    iget-object v5, v5, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 143
    .line 144
    invoke-virtual {v5}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-virtual {v5}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    const-string v8, "binding.replyText.paint.fontMetrics"

    .line 153
    .line 154
    invoke-static {v5, v8}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v5}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->getBaselineHeight(Landroid/graphics/Paint$FontMetrics;)F

    .line 158
    .line 159
    .line 160
    move-result v29

    .line 161
    const v30, 0x2ffe0

    .line 162
    .line 163
    .line 164
    const/16 v31, 0x0

    .line 165
    .line 166
    invoke-static/range {v10 .. v31}, Lcom/discord/chat/presentation/textutils/TextUtilsKt;->toSpannable$default(Lcom/discord/chat/bridge/structurabletext/StructurableText;Landroid/content/Context;Ljava/lang/String;ZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/discord/theme/DiscordTheme;FILjava/lang/Object;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    new-instance v8, Lcom/discord/span/utilities/BackgroundSpanDrawer;

    .line 171
    .line 172
    iget-object v10, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 173
    .line 174
    iget-object v10, v10, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 175
    .line 176
    const-string v11, "binding.replyText"

    .line 177
    .line 178
    invoke-static {v10, v11}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v8, v10}, Lcom/discord/span/utilities/BackgroundSpanDrawer;-><init>(Landroid/widget/TextView;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v5, v8}, Lcom/discord/span/utilities/SpannableExtensionsKt;->coverWithSpan(Landroid/text/Spannable;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v4, v5}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createReplyContent(Landroid/view/View;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    goto :goto_0

    .line 192
    :cond_0
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 193
    .line 194
    iget-object v4, v4, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    .line 195
    .line 196
    invoke-static {v4, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-static {v10, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    sget-object v5, Lcom/discord/react_strings/I18nMessage;->REPLY_QUOTE_NO_TEXT_CONTENT_MOBILE:Lcom/discord/react_strings/I18nMessage;

    .line 207
    .line 208
    const/4 v11, 0x2

    .line 209
    invoke-static {v10, v5, v8, v11, v8}, Lcom/discord/react_strings/I18nUtilsKt;->i18nFormat$default(Landroid/content/Context;Lcom/discord/react_strings/I18nMessage;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/CharSequence;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-static {v4, v5}, Lcom/discord/chat/presentation/message/utils/ReplyUtilsKt;->createSystemReplyContent(Landroid/view/View;Ljava/lang/String;)Lcom/facebook/drawee/span/DraweeSpanStringBuilder;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    :goto_0
    iget-object v5, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 222
    .line 223
    iget-object v5, v5, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyText:Lcom/discord/chat/presentation/message/view/MessageContentView;

    .line 224
    .line 225
    invoke-virtual {v5, v4}, Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;->setDraweeSpanStringBuilder(Lcom/facebook/drawee/span/DraweeSpanStringBuilder;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5}, Landroid/view/View;->isLaidOut()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_2

    .line 233
    .line 234
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-lez v4, :cond_2

    .line 239
    .line 240
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    const/high16 v8, -0x80000000

    .line 245
    .line 246
    invoke-static {v4, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    invoke-virtual {v5, v4, v8}, Landroid/view/View;->measure(II)V

    .line 255
    .line 256
    .line 257
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->replyTextLineBounds:Landroid/graphics/Rect;

    .line 258
    .line 259
    invoke-virtual {v5, v6, v4}, Landroid/widget/TextView;->getLineBounds(ILandroid/graphics/Rect;)I

    .line 260
    .line 261
    .line 262
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 263
    .line 264
    iget-object v4, v4, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorName:Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-static {v4, v9}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    if-eqz v5, :cond_1

    .line 274
    .line 275
    iget-object v8, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->replyTextLineBounds:Landroid/graphics/Rect;

    .line 276
    .line 277
    iget v9, v8, Landroid/graphics/Rect;->bottom:I

    .line 278
    .line 279
    iget v8, v8, Landroid/graphics/Rect;->top:I

    .line 280
    .line 281
    sub-int/2addr v9, v8

    .line 282
    iput v9, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 283
    .line 284
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 285
    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    .line 289
    .line 290
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 291
    .line 292
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    throw v1

    .line 296
    :cond_2
    :goto_1
    iget-object v4, v0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    .line 297
    .line 298
    iget-object v4, v4, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->reactionsView:Lcom/discord/reactions/ReactionsView;

    .line 299
    .line 300
    const-string v5, "configure$lambda$6"

    .line 301
    .line 302
    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getId-3Eiw7ao()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    if-nez v5, :cond_3

    .line 314
    .line 315
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    :cond_3
    move-object v10, v5

    .line 320
    invoke-virtual {v3}, Lcom/discord/chat/presentation/root/MessageContext;->getCanAddNewReactions()Z

    .line 321
    .line 322
    .line 323
    move-result v11

    .line 324
    invoke-virtual {v3}, Lcom/discord/chat/presentation/root/MessageContext;->getAddReactionLabel()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    invoke-virtual {v3}, Lcom/discord/chat/presentation/root/MessageContext;->getAddNewReactionAccessibilityLabel()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v13

    .line 332
    invoke-virtual {v3}, Lcom/discord/chat/presentation/root/MessageContext;->getReactionsTheme()Lcom/discord/chat/bridge/reaction/ReactionsTheme;

    .line 333
    .line 334
    .line 335
    move-result-object v14

    .line 336
    new-instance v15, Lcom/discord/chat/presentation/list/messagebundling/b;

    .line 337
    .line 338
    invoke-direct {v15, v1, v2}, Lcom/discord/chat/presentation/list/messagebundling/b;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;)V

    .line 339
    .line 340
    .line 341
    new-instance v5, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView$configure$3$2;

    .line 342
    .line 343
    invoke-direct {v5, v1, v2}, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView$configure$3$2;-><init>(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/bridge/Message;)V

    .line 344
    .line 345
    .line 346
    const/16 v17, 0x0

    .line 347
    .line 348
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 349
    .line 350
    .line 351
    move-result-object v18

    .line 352
    sget-object v1, Lcom/discord/chat/presentation/root/ChatView;->Companion:Lcom/discord/chat/presentation/root/ChatView$Companion;

    .line 353
    .line 354
    invoke-virtual {v1}, Lcom/discord/chat/presentation/root/ChatView$Companion;->getAreChatAnimationsEnabled()Z

    .line 355
    .line 356
    .line 357
    move-result v19

    .line 358
    invoke-virtual {v3}, Lcom/discord/chat/presentation/root/MessageContext;->getUseSortedReactions()Z

    .line 359
    .line 360
    .line 361
    move-result v20

    .line 362
    const/16 v21, 0x100

    .line 363
    .line 364
    const/16 v22, 0x0

    .line 365
    .line 366
    move-object v8, v4

    .line 367
    move-object/from16 v16, v5

    .line 368
    .line 369
    invoke-static/range {v8 .. v22}, Lcom/discord/reactions/ReactionsView;->setReactions$default(Lcom/discord/reactions/ReactionsView;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lcom/discord/reactions/ReactionView$ReactionsTheme;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/theme/DiscordTheme;ZZILjava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2}, Lcom/discord/chat/bridge/Message;->getReactions()Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    if-eqz v1, :cond_5

    .line 377
    .line 378
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_4

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_4
    move v1, v6

    .line 386
    goto :goto_3

    .line 387
    :cond_5
    :goto_2
    move v1, v7

    .line 388
    :goto_3
    xor-int/2addr v1, v7

    .line 389
    if-eqz v1, :cond_6

    .line 390
    .line 391
    goto :goto_4

    .line 392
    :cond_6
    const/16 v6, 0x8

    .line 393
    .line 394
    :goto_4
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 395
    .line 396
    .line 397
    return-void
.end method

.method public getSpineOriginView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/messagebundling/MessageBundleConversationView;->binding:Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;

    iget-object v0, v0, Lcom/discord/chat/databinding/MessageBundleConversationViewBinding;->replyAuthorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    const-string v1, "binding.replyAuthorAvatar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
