.class public final Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/messagemanager/MessageViewManagers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MessageViewManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper<",
        "Lcom/discord/chat/presentation/message/DecoratedMessageView;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0008\u0010\u0008\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\tH\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;",
        "Lcom/facebook/react/uimanager/ViewGroupManager;",
        "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;",
        "Lcom/discord/chat/presentation/message/DecoratedMessageView;",
        "()V",
        "createViewInstance",
        "reactContext",
        "Lcom/facebook/react/uimanager/ThemedReactContext;",
        "getName",
        "",
        "row",
        "",
        "wrappedView",
        "rowJson",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager;->createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/ThemedReactContext;",
            ")",
            "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper<",
            "Lcom/discord/chat/presentation/message/DecoratedMessageView;",
            ">;"
        }
    .end annotation

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    new-instance v1, Lcom/discord/chat/presentation/message/DecoratedMessageView;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, p1, v2, v3, v2}, Lcom/discord/chat/presentation/message/DecoratedMessageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager$createViewInstance$1;

    invoke-direct {v2, p1}, Lcom/discord/chat/messagemanager/MessageViewManagers$MessageViewManager$createViewInstance$1;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    invoke-direct {v0, v1, v2}, Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function3;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "DCDMessageView"

    return-object v0
.end method

.method public final row(Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;Ljava/lang/String;)V
    .locals 17
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactProp;
        name = "row"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper<",
            "Lcom/discord/chat/presentation/message/DecoratedMessageView;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const-string v1, "wrappedView"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "rowJson"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-object v1, Lcom/discord/chat/messagemanager/MessageViewManagers;->INSTANCE:Lcom/discord/chat/messagemanager/MessageViewManagers;

    .line 16
    .line 17
    invoke-static {v1, v0}, Lcom/discord/chat/messagemanager/MessageViewManagers;->access$convertRowJsonToMessageRow(Lcom/discord/chat/messagemanager/MessageViewManagers;Ljava/lang/String;)Lcom/discord/chat/bridge/row/MessageRow;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Lcom/discord/chat/bridge/messageframe/MessageFrame;->getType()Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v3, v4

    .line 34
    :goto_0
    sget-object v5, Lcom/discord/chat/bridge/messageframe/MessageFrameType;->MEDIA_VIEWER_MESSAGE_FRAME:Lcom/discord/chat/bridge/messageframe/MessageFrameType;

    .line 35
    .line 36
    if-ne v3, v5, :cond_1

    .line 37
    .line 38
    sget-object v3, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/discord/theme/ThemeManager;->getDarkTheme()Lcom/discord/theme/DarkTheme;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v3, v5}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;->getView()Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-object v5, v3

    .line 52
    check-cast v5, Lcom/discord/chat/presentation/message/DecoratedMessageView;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessage()Lcom/discord/chat/bridge/MessageBase;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v6, "null cannot be cast to non-null type com.discord.chat.bridge.Message"

    .line 59
    .line 60
    invoke-static {v3, v6}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v6, v3

    .line 64
    check-cast v6, Lcom/discord/chat/bridge/Message;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/discord/chat/presentation/root/MessageContextKt;->getMessageContext(Lcom/discord/chat/bridge/row/MessageRow;)Lcom/discord/chat/presentation/root/MessageContext;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/MessageRow;->getMessageFrame()Lcom/discord/chat/bridge/messageframe/MessageFrame;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    const-string v3, "wrappedView.context"

    .line 79
    .line 80
    invoke-static {v2, v3}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v0, v2}, Lcom/discord/chat/messagemanager/MessageViewManagers;->access$getEventHandler(Lcom/discord/chat/messagemanager/MessageViewManagers;Lcom/discord/chat/bridge/row/MessageRow;Landroid/content/Context;)Lcom/discord/chat/presentation/events/ChatEventHandler;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v12, 0x0

    .line 90
    invoke-virtual {v0}, Lcom/discord/chat/bridge/row/MessageRow;->isHighlight()Z

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    const/4 v14, 0x0

    .line 95
    const/16 v15, 0x170

    .line 96
    .line 97
    const/16 v16, 0x0

    .line 98
    .line 99
    invoke-static/range {v5 .. v16}, Lcom/discord/chat/presentation/message/DecoratedMessageView;->setMessage$default(Lcom/discord/chat/presentation/message/DecoratedMessageView;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/bridge/messageframe/MessageFrame;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZZILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lcom/discord/theme/ThemeManager;->INSTANCE:Lcom/discord/theme/ThemeManager;

    .line 103
    .line 104
    invoke-virtual {v0, v4}, Lcom/discord/theme/ThemeManager;->setThemeOverride(Lcom/discord/theme/DiscordTheme;)V

    .line 105
    .line 106
    .line 107
    return-void
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
