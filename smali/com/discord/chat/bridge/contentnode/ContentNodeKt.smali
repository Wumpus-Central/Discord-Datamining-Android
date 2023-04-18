.class public final Lcom/discord/chat/bridge/contentnode/ContentNodeKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0083\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "sealedClassSerializer",
        "Lkotlinx/serialization/SealedClassSerializer;",
        "Lcom/discord/chat/bridge/contentnode/ContentNode;",
        "getSealedClassSerializer$annotations",
        "()V",
        "chat_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final sealedClassSerializer:Lkotlinx/serialization/SealedClassSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/serialization/SealedClassSerializer<",
            "Lcom/discord/chat/bridge/contentnode/ContentNode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 27

    .line 1
    new-instance v0, Lkotlinx/serialization/SealedClassSerializer;

    .line 2
    .line 3
    const-class v1, Lcom/discord/chat/bridge/contentnode/ContentNode;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x19

    .line 10
    .line 11
    new-array v3, v2, [Lkotlin/reflect/KClass;

    .line 12
    .line 13
    const-class v4, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;

    .line 14
    .line 15
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    aput-object v4, v3, v5

    .line 21
    .line 22
    const-class v4, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;

    .line 23
    .line 24
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v6, 0x1

    .line 29
    aput-object v4, v3, v6

    .line 30
    .line 31
    const-class v4, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;

    .line 32
    .line 33
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    const/4 v7, 0x2

    .line 38
    aput-object v4, v3, v7

    .line 39
    .line 40
    const-class v4, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;

    .line 41
    .line 42
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    const/4 v8, 0x3

    .line 47
    aput-object v4, v3, v8

    .line 48
    .line 49
    const-class v4, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;

    .line 50
    .line 51
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const/4 v9, 0x4

    .line 56
    aput-object v4, v3, v9

    .line 57
    .line 58
    const-class v4, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;

    .line 59
    .line 60
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/4 v10, 0x5

    .line 65
    aput-object v4, v3, v10

    .line 66
    .line 67
    const-class v4, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;

    .line 68
    .line 69
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v11, 0x6

    .line 74
    aput-object v4, v3, v11

    .line 75
    .line 76
    const-class v4, Lcom/discord/chat/bridge/contentnode/EmojiContentNode;

    .line 77
    .line 78
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const/4 v12, 0x7

    .line 83
    aput-object v4, v3, v12

    .line 84
    .line 85
    const-class v4, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;

    .line 86
    .line 87
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const/16 v13, 0x8

    .line 92
    .line 93
    aput-object v4, v3, v13

    .line 94
    .line 95
    const-class v4, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;

    .line 96
    .line 97
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    const/16 v14, 0x9

    .line 102
    .line 103
    aput-object v4, v3, v14

    .line 104
    .line 105
    const-class v4, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;

    .line 106
    .line 107
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/16 v15, 0xa

    .line 112
    .line 113
    aput-object v4, v3, v15

    .line 114
    .line 115
    const-class v4, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;

    .line 116
    .line 117
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    const/16 v16, 0xb

    .line 122
    .line 123
    aput-object v4, v3, v16

    .line 124
    .line 125
    const-class v4, Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;

    .line 126
    .line 127
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const/16 v17, 0xc

    .line 132
    .line 133
    aput-object v4, v3, v17

    .line 134
    .line 135
    const-class v4, Lcom/discord/chat/bridge/contentnode/LinkContentNode;

    .line 136
    .line 137
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    const/16 v18, 0xd

    .line 142
    .line 143
    aput-object v4, v3, v18

    .line 144
    .line 145
    const-class v4, Lcom/discord/chat/bridge/contentnode/MentionContentNode;

    .line 146
    .line 147
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const/16 v19, 0xe

    .line 152
    .line 153
    aput-object v4, v3, v19

    .line 154
    .line 155
    const-class v4, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;

    .line 156
    .line 157
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    const/16 v20, 0xf

    .line 162
    .line 163
    aput-object v4, v3, v20

    .line 164
    .line 165
    const-class v4, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;

    .line 166
    .line 167
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    const/16 v21, 0x10

    .line 172
    .line 173
    aput-object v4, v3, v21

    .line 174
    .line 175
    const-class v4, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;

    .line 176
    .line 177
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    const/16 v22, 0x11

    .line 182
    .line 183
    aput-object v4, v3, v22

    .line 184
    .line 185
    const-class v4, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;

    .line 186
    .line 187
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    const/16 v23, 0x12

    .line 192
    .line 193
    aput-object v4, v3, v23

    .line 194
    .line 195
    const-class v4, Lcom/discord/chat/bridge/contentnode/StrongContentNode;

    .line 196
    .line 197
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    const/16 v24, 0x13

    .line 202
    .line 203
    aput-object v4, v3, v24

    .line 204
    .line 205
    const-class v4, Lcom/discord/chat/bridge/contentnode/TextContentNode;

    .line 206
    .line 207
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    const/16 v25, 0x14

    .line 212
    .line 213
    aput-object v4, v3, v25

    .line 214
    .line 215
    const-class v4, Lcom/discord/chat/bridge/contentnode/TimestampContentNode;

    .line 216
    .line 217
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const/16 v26, 0x15

    .line 222
    .line 223
    aput-object v4, v3, v26

    .line 224
    .line 225
    const-class v4, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;

    .line 226
    .line 227
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    const/16 v26, 0x16

    .line 232
    .line 233
    aput-object v4, v3, v26

    .line 234
    .line 235
    const-class v4, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;

    .line 236
    .line 237
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    const/16 v26, 0x17

    .line 242
    .line 243
    aput-object v4, v3, v26

    .line 244
    .line 245
    const-class v4, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;

    .line 246
    .line 247
    invoke-static {v4}, Lkotlin/jvm/internal/f0;->b(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    const/16 v26, 0x18

    .line 252
    .line 253
    aput-object v4, v3, v26

    .line 254
    .line 255
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 256
    .line 257
    sget-object v4, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode$Companion;

    .line 258
    .line 259
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/BlockQuoteContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    aput-object v4, v2, v5

    .line 264
    .line 265
    sget-object v4, Lcom/discord/chat/bridge/contentnode/BulletListContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/BulletListContentNode$Companion;

    .line 266
    .line 267
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/BulletListContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    aput-object v4, v2, v6

    .line 272
    .line 273
    sget-object v4, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode$Companion;

    .line 274
    .line 275
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/ChannelMentionContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    aput-object v4, v2, v7

    .line 280
    .line 281
    sget-object v4, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode$Companion;

    .line 282
    .line 283
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/ChannelNameContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    aput-object v4, v2, v8

    .line 288
    .line 289
    sget-object v4, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode$Companion;

    .line 290
    .line 291
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/CodeBlockContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    aput-object v4, v2, v9

    .line 296
    .line 297
    sget-object v4, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$Companion;

    .line 298
    .line 299
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    aput-object v4, v2, v10

    .line 304
    .line 305
    sget-object v4, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode$Companion;

    .line 306
    .line 307
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/CustomEmojiContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    aput-object v4, v2, v11

    .line 312
    .line 313
    sget-object v4, Lcom/discord/chat/bridge/contentnode/EmojiContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/EmojiContentNode$Companion;

    .line 314
    .line 315
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/EmojiContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    aput-object v4, v2, v12

    .line 320
    .line 321
    sget-object v4, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/EmphasisContentNode$Companion;

    .line 322
    .line 323
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/EmphasisContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    aput-object v4, v2, v13

    .line 328
    .line 329
    sget-object v4, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/GuildNameContentNode$Companion;

    .line 330
    .line 331
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/GuildNameContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 332
    .line 333
    .line 334
    move-result-object v4

    .line 335
    aput-object v4, v2, v14

    .line 336
    .line 337
    sget-object v4, Lcom/discord/chat/bridge/contentnode/HeadingContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/HeadingContentNode$Companion;

    .line 338
    .line 339
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/HeadingContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    aput-object v4, v2, v15

    .line 344
    .line 345
    sget-object v4, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode$Companion;

    .line 346
    .line 347
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    aput-object v4, v2, v16

    .line 352
    .line 353
    sget-object v4, Lcom/discord/chat/bridge/contentnode/LineBreakContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/LineBreakContentNode$Companion;

    .line 354
    .line 355
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/LineBreakContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    aput-object v4, v2, v17

    .line 360
    .line 361
    sget-object v4, Lcom/discord/chat/bridge/contentnode/LinkContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/LinkContentNode$Companion;

    .line 362
    .line 363
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/LinkContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    aput-object v4, v2, v18

    .line 368
    .line 369
    sget-object v4, Lcom/discord/chat/bridge/contentnode/MentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion;

    .line 370
    .line 371
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/MentionContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    aput-object v4, v2, v19

    .line 376
    .line 377
    sget-object v4, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/ParagraphContentNode$Companion;

    .line 378
    .line 379
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/ParagraphContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    aput-object v4, v2, v20

    .line 384
    .line 385
    sget-object v4, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/SpoilerContentNode$Companion;

    .line 386
    .line 387
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/SpoilerContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    aput-object v4, v2, v21

    .line 392
    .line 393
    sget-object v4, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$Companion;

    .line 394
    .line 395
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/StaticChannelMentionContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    aput-object v4, v2, v22

    .line 400
    .line 401
    sget-object v4, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode$Companion;

    .line 402
    .line 403
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/StrikethroughContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    aput-object v4, v2, v23

    .line 408
    .line 409
    sget-object v4, Lcom/discord/chat/bridge/contentnode/StrongContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/StrongContentNode$Companion;

    .line 410
    .line 411
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/StrongContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    aput-object v4, v2, v24

    .line 416
    .line 417
    sget-object v4, Lcom/discord/chat/bridge/contentnode/TextContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/TextContentNode$Companion;

    .line 418
    .line 419
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/TextContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    aput-object v4, v2, v25

    .line 424
    .line 425
    sget-object v4, Lcom/discord/chat/bridge/contentnode/TimestampContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/TimestampContentNode$Companion;

    .line 426
    .line 427
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/TimestampContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    const/16 v5, 0x15

    .line 432
    .line 433
    aput-object v4, v2, v5

    .line 434
    .line 435
    sget-object v4, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/UnderlineContentNode$Companion;

    .line 436
    .line 437
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/UnderlineContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    const/16 v5, 0x16

    .line 442
    .line 443
    aput-object v4, v2, v5

    .line 444
    .line 445
    sget-object v4, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode$Companion;

    .line 446
    .line 447
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/UnicodeEmojiContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    const/16 v5, 0x17

    .line 452
    .line 453
    aput-object v4, v2, v5

    .line 454
    .line 455
    sget-object v4, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;->Companion:Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;

    .line 456
    .line 457
    invoke-virtual {v4}, Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    const/16 v5, 0x18

    .line 462
    .line 463
    aput-object v4, v2, v5

    .line 464
    .line 465
    const-string v4, "ContentNode"

    .line 466
    .line 467
    invoke-direct {v0, v4, v1, v3, v2}, Lkotlinx/serialization/SealedClassSerializer;-><init>(Ljava/lang/String;Lkotlin/reflect/KClass;[Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)V

    .line 468
    .line 469
    .line 470
    sput-object v0, Lcom/discord/chat/bridge/contentnode/ContentNodeKt;->sealedClassSerializer:Lkotlinx/serialization/SealedClassSerializer;

    .line 471
    .line 472
    return-void
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
.end method

.method public static final synthetic access$getSealedClassSerializer$p()Lkotlinx/serialization/SealedClassSerializer;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/contentnode/ContentNodeKt;->sealedClassSerializer:Lkotlinx/serialization/SealedClassSerializer;

    return-object v0
.end method

.method private static synthetic getSealedClassSerializer$annotations()V
    .locals 0

    return-void
.end method
