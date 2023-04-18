.class public final Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

.field public final authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final authorName:Landroid/widget/TextView;

.field public final automodMessageChannel:Landroid/widget/TextView;

.field public final automodMessageContextHeader:Landroid/widget/TextView;

.field public final guildCommunicationDisabledIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

.field public final messageEndGuideline:Landroidx/constraintlayout/widget/Guideline;

.field public final messageHeaderBarrier:Landroidx/constraintlayout/widget/Barrier;

.field public final messageHeaderDivider:Landroid/view/View;

.field public final messageHeaderSubtitle:Landroid/widget/TextView;

.field public final messageHeaderTitle:Landroid/widget/TextView;

.field public final messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

.field public final replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

.field private final rootView:Landroid/view/View;

.field public final threadStarterHeader:Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;

.field public final timestamp:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/discord/chat/presentation/message/MessageAccessoriesView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/discord/chat/presentation/message/MessageTagView;Lcom/discord/chat/presentation/message/MessageViewReplyPreview;Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;Landroid/widget/TextView;)V
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    .line 4
    .line 5
    move-object v1, p1

    .line 6
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->rootView:Landroid/view/View;

    .line 7
    .line 8
    move-object v1, p2

    .line 9
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->accessoriesView:Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 10
    .line 11
    move-object v1, p3

    .line 12
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorAvatar:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 13
    .line 14
    move-object v1, p4

    .line 15
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->authorName:Landroid/widget/TextView;

    .line 16
    .line 17
    move-object v1, p5

    .line 18
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageChannel:Landroid/widget/TextView;

    .line 19
    .line 20
    move-object v1, p6

    .line 21
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->automodMessageContextHeader:Landroid/widget/TextView;

    .line 22
    .line 23
    move-object v1, p7

    .line 24
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->guildCommunicationDisabledIcon:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 25
    .line 26
    move-object v1, p8

    .line 27
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageEndGuideline:Landroidx/constraintlayout/widget/Guideline;

    .line 28
    .line 29
    move-object v1, p9

    .line 30
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderBarrier:Landroidx/constraintlayout/widget/Barrier;

    .line 31
    .line 32
    move-object v1, p10

    .line 33
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderDivider:Landroid/view/View;

    .line 34
    .line 35
    move-object v1, p11

    .line 36
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderSubtitle:Landroid/widget/TextView;

    .line 37
    .line 38
    move-object v1, p12

    .line 39
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageHeaderTitle:Landroid/widget/TextView;

    .line 40
    .line 41
    move-object v1, p13

    .line 42
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->messageTagView:Lcom/discord/chat/presentation/message/MessageTagView;

    .line 43
    .line 44
    move-object/from16 v1, p14

    .line 45
    .line 46
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->replyPreview:Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    .line 47
    .line 48
    move-object/from16 v1, p15

    .line 49
    .line 50
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->threadStarterHeader:Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;

    .line 51
    .line 52
    move-object/from16 v1, p16

    .line 53
    .line 54
    iput-object v1, v0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->timestamp:Landroid/widget/TextView;

    .line 55
    .line 56
    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget v0, Lcom/discord/chat/R$id;->accessories_view:I

    .line 4
    .line 5
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lcom/discord/chat/presentation/message/MessageAccessoriesView;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget v0, Lcom/discord/chat/R$id;->author_avatar:I

    .line 14
    .line 15
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    sget v0, Lcom/discord/chat/R$id;->author_name:I

    .line 24
    .line 25
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    sget v0, Lcom/discord/chat/R$id;->automod_message_channel:I

    .line 34
    .line 35
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    sget v0, Lcom/discord/chat/R$id;->automod_message_context_header:I

    .line 44
    .line 45
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    sget v0, Lcom/discord/chat/R$id;->guild_communication_disabled_icon:I

    .line 54
    .line 55
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 60
    .line 61
    if-eqz v7, :cond_0

    .line 62
    .line 63
    sget v0, Lcom/discord/chat/R$id;->message_end_guideline:I

    .line 64
    .line 65
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    .line 70
    .line 71
    if-eqz v8, :cond_0

    .line 72
    .line 73
    sget v0, Lcom/discord/chat/R$id;->message_header_barrier:I

    .line 74
    .line 75
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    check-cast v9, Landroidx/constraintlayout/widget/Barrier;

    .line 80
    .line 81
    if-eqz v9, :cond_0

    .line 82
    .line 83
    sget v0, Lcom/discord/chat/R$id;->message_header_divider:I

    .line 84
    .line 85
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    if-eqz v10, :cond_0

    .line 90
    .line 91
    sget v0, Lcom/discord/chat/R$id;->message_header_subtitle:I

    .line 92
    .line 93
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    check-cast v11, Landroid/widget/TextView;

    .line 98
    .line 99
    if-eqz v11, :cond_0

    .line 100
    .line 101
    sget v0, Lcom/discord/chat/R$id;->message_header_title:I

    .line 102
    .line 103
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v12, :cond_0

    .line 110
    .line 111
    sget v0, Lcom/discord/chat/R$id;->message_tag_view:I

    .line 112
    .line 113
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    check-cast v13, Lcom/discord/chat/presentation/message/MessageTagView;

    .line 118
    .line 119
    if-eqz v13, :cond_0

    .line 120
    .line 121
    sget v0, Lcom/discord/chat/R$id;->reply_preview:I

    .line 122
    .line 123
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    check-cast v14, Lcom/discord/chat/presentation/message/MessageViewReplyPreview;

    .line 128
    .line 129
    if-eqz v14, :cond_0

    .line 130
    .line 131
    sget v0, Lcom/discord/chat/R$id;->thread_starter_header:I

    .line 132
    .line 133
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 134
    .line 135
    .line 136
    move-result-object v15

    .line 137
    check-cast v15, Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;

    .line 138
    .line 139
    if-eqz v15, :cond_0

    .line 140
    .line 141
    sget v0, Lcom/discord/chat/R$id;->timestamp:I

    .line 142
    .line 143
    invoke-static {v1, v0}, Lx1/a;->a(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v16

    .line 147
    check-cast v16, Landroid/widget/TextView;

    .line 148
    .line 149
    if-eqz v16, :cond_0

    .line 150
    .line 151
    new-instance v17, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 152
    .line 153
    move-object/from16 v0, v17

    .line 154
    .line 155
    move-object/from16 v1, p0

    .line 156
    .line 157
    invoke-direct/range {v0 .. v16}, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;-><init>(Landroid/view/View;Lcom/discord/chat/presentation/message/MessageAccessoriesView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/facebook/drawee/view/SimpleDraweeView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Barrier;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/discord/chat/presentation/message/MessageTagView;Lcom/discord/chat/presentation/message/MessageViewReplyPreview;Lcom/discord/chat/presentation/message/ThreadStarterMessageHeaderView;Landroid/widget/TextView;)V

    .line 158
    .line 159
    .line 160
    return-object v17

    .line 161
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    new-instance v1, Ljava/lang/NullPointerException;

    .line 170
    .line 171
    const-string v2, "Missing required view with ID: "

    .line 172
    .line 173
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v1
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
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget v0, Lcom/discord/chat/R$layout;->automod_system_message_view:I

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->bind(Landroid/view/View;)Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 14
    .line 15
    const-string p1, "parent"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
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


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
