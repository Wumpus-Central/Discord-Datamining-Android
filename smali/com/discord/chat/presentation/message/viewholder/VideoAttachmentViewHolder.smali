.class public final Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;
.super Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u007f\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00080\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;",
        "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;",
        "view",
        "Lcom/discord/chat/presentation/message/view/VideoAttachmentView;",
        "eventHandler",
        "Lcom/discord/chat/presentation/events/ChatEventHandler;",
        "(Lcom/discord/chat/presentation/message/view/VideoAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V",
        "bind",
        "",
        "videoAttachmentItem",
        "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;",
        "maxWidthPx",
        "",
        "maxHeightPx",
        "radiusPx",
        "onClicked",
        "Lkotlin/Function1;",
        "",
        "onLongClicked",
        "Landroid/view/View$OnLongClickListener;",
        "spoilerConfig",
        "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;",
        "portal",
        "canPlayInline",
        "",
        "useNewAltTextButton",
        "hideMediaPlayButton",
        "attachmentsOpacity",
        "",
        "(Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;IIILkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZLjava/lang/Float;)V",
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
.field private final eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

.field private final view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/message/view/VideoAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, v0}, Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;-><init>(Landroid/view/View;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

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
.end method

.method public static final synthetic access$getEventHandler$p(Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;)Lcom/discord/chat/presentation/events/ChatEventHandler;
    .locals 0

    iget-object p0, p0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    return-object p0
.end method


# virtual methods
.method public final bind(Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;IIILkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZLjava/lang/Float;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;",
            "III",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Double;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/view/View$OnLongClickListener;",
            "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;",
            "DZZZ",
            "Ljava/lang/Float;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    move/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move-object/from16 v11, p7

    move-wide/from16 v12, p8

    move/from16 v14, p10

    move/from16 v16, p12

    move-object/from16 v19, p13

    const-string v2, "videoAttachmentItem"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClicked"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;->getAttachment()Lcom/discord/chat/bridge/attachment/Attachment;

    move-result-object v20

    .line 2
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderId()Ljava/lang/String;

    move-result-object v15

    .line 3
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getUploaderItemId()Ljava/lang/String;

    move-result-object v10

    .line 4
    new-instance v2, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder$bind$onCancelUpload$1;

    move-object/from16 v17, v2

    invoke-direct {v2, v15, v10, v0}, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder$bind$onCancelUpload$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;)V

    .line 5
    iget-object v2, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    .line 6
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getVideoUrl()Ljava/lang/String;

    move-result-object v4

    move-object v3, v4

    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 7
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getUrl()Ljava/lang/String;

    move-result-object v4

    .line 8
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getWidth()I

    move-result v5

    .line 9
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getHeight()I

    move-result v6

    .line 10
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->isSpoiler()Z

    move-result v18

    move-object v1, v10

    move/from16 v10, v18

    .line 11
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getProgress()Ljava/lang/Integer;

    move-result-object v18

    move-object v0, v15

    move-object/from16 v15, v18

    move-object/from16 p1, v2

    .line 12
    new-instance v2, Lcom/discord/chat/presentation/message/view/UploadContext;

    move-object/from16 v18, v2

    invoke-direct {v2, v0, v1}, Lcom/discord/chat/presentation/message/view/UploadContext;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v2, p1

    .line 13
    invoke-virtual/range {v2 .. v19}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->setContent(Ljava/lang/String;Ljava/lang/String;IIIIIZLcom/discord/chat/bridge/spoiler/SpoilerConfig;DZLjava/lang/Integer;ZLkotlin/jvm/functions/Function0;Lcom/discord/chat/presentation/message/view/UploadContext;Ljava/lang/Float;)V

    move-object/from16 v0, p0

    .line 14
    iget-object v1, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getHint()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->setDescription(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v1, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz p11, :cond_0

    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getShowDescription()Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getDescription()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder$bind$1;

    iget-object v7, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->eventHandler:Lcom/discord/chat/presentation/events/ChatEventHandler;

    invoke-direct {v6, v7}, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder$bind$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v4, v5, v6}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->showAltTextButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 16
    iget-object v1, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    if-nez p11, :cond_1

    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getShowDescription()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->showDescription(ZLjava/lang/String;)V

    .line 17
    iget-object v1, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    invoke-virtual/range {v20 .. v20}, Lcom/discord/chat/bridge/attachment/Attachment;->getRole()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->setRole(Ljava/lang/String;)V

    .line 18
    iget-object v1, v0, Lcom/discord/chat/presentation/message/viewholder/VideoAttachmentViewHolder;->view:Lcom/discord/chat/presentation/message/view/VideoAttachmentView;

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    invoke-virtual {v1, v2, v3}, Lcom/discord/chat/presentation/message/view/VideoAttachmentView;->setOnMediaClickListeners(Lkotlin/jvm/functions/Function1;Landroid/view/View$OnLongClickListener;)V

    return-void
.end method
