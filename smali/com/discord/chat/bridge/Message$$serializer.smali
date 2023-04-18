.class public final Lcom/discord/chat/bridge/Message$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/chat/bridge/Message;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/chat/bridge/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/chat/bridge/Message.$serializer",
        "Lzi/f0;",
        "Lcom/discord/chat/bridge/Message;",
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
.field public static final INSTANCE:Lcom/discord/chat/bridge/Message$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/chat/bridge/Message$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/chat/bridge/Message$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/chat/bridge/Message$$serializer;->INSTANCE:Lcom/discord/chat/bridge/Message$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.discord.chat.bridge.Message"

    .line 11
    .line 12
    const/16 v3, 0x43

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;-><init>(Ljava/lang/String;Lzi/f0;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "type"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "id"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "nonce"

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "channelId"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "guildId"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "state"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "authorId"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "flags"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "edited"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "constrainedWidth"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "timestamp"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "username"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "usernameColor"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "roleColor"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "shouldShowRoleDot"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "shouldShowRoleOnName"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "colorString"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "avatarURL"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "avatarDecorationURL"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v0, "embeds"

    .line 115
    .line 116
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    const-string v0, "attachments"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    const-string v0, "attachmentsOpacity"

    .line 125
    .line 126
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v0, "content"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    const-string v0, "progress"

    .line 135
    .line 136
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    const-string v0, "reactions"

    .line 140
    .line 141
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string v0, "useSortedReactions"

    .line 145
    .line 146
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    const-string v0, "codedLinks"

    .line 150
    .line 151
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    const-string v0, "stickers"

    .line 155
    .line 156
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    const-string v0, "roleIcon"

    .line 160
    .line 161
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    const-string v0, "connectionsRoleTag"

    .line 165
    .line 166
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    const-string v0, "threadEmbed"

    .line 170
    .line 171
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    const-string v0, "mentioned"

    .line 175
    .line 176
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    const-string v0, "gifAutoPlay"

    .line 180
    .line 181
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    const-string v0, "animateEmoji"

    .line 185
    .line 186
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    const-string v0, "referencedMessage"

    .line 190
    .line 191
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    const-string v0, "executedCommand"

    .line 195
    .line 196
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 197
    .line 198
    .line 199
    const-string v0, "components"

    .line 200
    .line 201
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 202
    .line 203
    .line 204
    const-string v0, "threadStarterMessageHeader"

    .line 205
    .line 206
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 207
    .line 208
    .line 209
    const-string v0, "communicationDisabled"

    .line 210
    .line 211
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    const-string v0, "tagText"

    .line 215
    .line 216
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 217
    .line 218
    .line 219
    const-string v0, "tagVerified"

    .line 220
    .line 221
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    const-string v0, "tagBackgroundColor"

    .line 225
    .line 226
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 227
    .line 228
    .line 229
    const-string v0, "opTagText"

    .line 230
    .line 231
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    const-string v0, "ephemeralIndication"

    .line 235
    .line 236
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 237
    .line 238
    .line 239
    const-string v0, "surveyIndication"

    .line 240
    .line 241
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 242
    .line 243
    .line 244
    const-string v0, "interactionStatus"

    .line 245
    .line 246
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 247
    .line 248
    .line 249
    const-string v0, "useAttachmentGridLayout"

    .line 250
    .line 251
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    const-string v0, "useAttachmentUploadPreview"

    .line 255
    .line 256
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 257
    .line 258
    .line 259
    const-string v0, "isCurrentUserMessageAuthor"

    .line 260
    .line 261
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 262
    .line 263
    .line 264
    const-string v0, "title"

    .line 265
    .line 266
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 267
    .line 268
    .line 269
    const-string v0, "description"

    .line 270
    .line 271
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    const-string v0, "avatarURLs"

    .line 275
    .line 276
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 277
    .line 278
    .line 279
    const-string v0, "isCallActive"

    .line 280
    .line 281
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 282
    .line 283
    .line 284
    const-string v0, "missed"

    .line 285
    .line 286
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 287
    .line 288
    .line 289
    const-string v0, "rawMilliseconds"

    .line 290
    .line 291
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 292
    .line 293
    .line 294
    const-string v0, "sticker"

    .line 295
    .line 296
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 297
    .line 298
    .line 299
    const-string v0, "stickerLabel"

    .line 300
    .line 301
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 302
    .line 303
    .line 304
    const-string v0, "buttonLabel"

    .line 305
    .line 306
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 307
    .line 308
    .line 309
    const-string v0, "showInviteToSpeakButton"

    .line 310
    .line 311
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 312
    .line 313
    .line 314
    const-string v0, "activityInviteEmbed"

    .line 315
    .line 316
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 317
    .line 318
    .line 319
    const-string v0, "isFirstForumPostMessage"

    .line 320
    .line 321
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 322
    .line 323
    .line 324
    const-string v0, "postActions"

    .line 325
    .line 326
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 327
    .line 328
    .line 329
    const-string v0, "autoModerationContext"

    .line 330
    .line 331
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 332
    .line 333
    .line 334
    const-string v0, "giftCodes"

    .line 335
    .line 336
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 337
    .line 338
    .line 339
    const-string v0, "referralTrialOffer"

    .line 340
    .line 341
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 342
    .line 343
    .line 344
    const-string v0, "totalMonthsSubscribed"

    .line 345
    .line 346
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 347
    .line 348
    .line 349
    const-string v0, "swipeToReplyIconUrl"

    .line 350
    .line 351
    invoke-virtual {v1, v0, v3}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 352
    .line 353
    .line 354
    sput-object v1, Lcom/discord/chat/bridge/Message$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 355
    .line 356
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public childSerializers()[Lkotlinx/serialization/KSerializer;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lkotlinx/serialization/KSerializer<",
            "*>;"
        }
    .end annotation

    .line 1
    const/16 v0, 0x43

    .line 2
    .line 3
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lcom/discord/chat/bridge/MessageType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Serializer;

    .line 7
    .line 8
    aput-object v2, v0, v1

    .line 9
    .line 10
    sget-object v1, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    aput-object v1, v0, v2

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    aput-object v1, v0, v2

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    sget-object v2, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 24
    .line 25
    aput-object v2, v0, v1

    .line 26
    .line 27
    sget-object v1, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 28
    .line 29
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x4

    .line 34
    aput-object v1, v0, v2

    .line 35
    .line 36
    sget-object v1, Lcom/discord/chat/bridge/MessageState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageState$Serializer;

    .line 37
    .line 38
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const/4 v2, 0x5

    .line 43
    aput-object v1, v0, v2

    .line 44
    .line 45
    sget-object v1, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 46
    .line 47
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v2, 0x6

    .line 52
    aput-object v1, v0, v2

    .line 53
    .line 54
    sget-object v1, Lzi/w0;->a:Lzi/w0;

    .line 55
    .line 56
    const/4 v2, 0x7

    .line 57
    aput-object v1, v0, v2

    .line 58
    .line 59
    sget-object v2, Lzi/a2;->a:Lzi/a2;

    .line 60
    .line 61
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const/16 v4, 0x8

    .line 66
    .line 67
    aput-object v3, v0, v4

    .line 68
    .line 69
    sget-object v3, Lzi/e0;->a:Lzi/e0;

    .line 70
    .line 71
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const/16 v5, 0x9

    .line 76
    .line 77
    aput-object v4, v0, v5

    .line 78
    .line 79
    const/16 v4, 0xa

    .line 80
    .line 81
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    aput-object v5, v0, v4

    .line 86
    .line 87
    const/16 v4, 0xb

    .line 88
    .line 89
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    aput-object v5, v0, v4

    .line 94
    .line 95
    sget-object v4, Lzi/m0;->a:Lzi/m0;

    .line 96
    .line 97
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    const/16 v6, 0xc

    .line 102
    .line 103
    aput-object v5, v0, v6

    .line 104
    .line 105
    const/16 v5, 0xd

    .line 106
    .line 107
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    aput-object v6, v0, v5

    .line 112
    .line 113
    sget-object v5, Lzi/h;->a:Lzi/h;

    .line 114
    .line 115
    const/16 v6, 0xe

    .line 116
    .line 117
    aput-object v5, v0, v6

    .line 118
    .line 119
    const/16 v6, 0xf

    .line 120
    .line 121
    aput-object v5, v0, v6

    .line 122
    .line 123
    const/16 v6, 0x10

    .line 124
    .line 125
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    aput-object v7, v0, v6

    .line 130
    .line 131
    const/16 v6, 0x11

    .line 132
    .line 133
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    aput-object v7, v0, v6

    .line 138
    .line 139
    const/16 v6, 0x12

    .line 140
    .line 141
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    aput-object v7, v0, v6

    .line 146
    .line 147
    new-instance v6, Lzi/f;

    .line 148
    .line 149
    sget-object v7, Lcom/discord/chat/bridge/embed/Embed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/Embed$$serializer;

    .line 150
    .line 151
    invoke-direct {v6, v7}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    const/16 v7, 0x13

    .line 159
    .line 160
    aput-object v6, v0, v7

    .line 161
    .line 162
    new-instance v6, Lzi/f;

    .line 163
    .line 164
    sget-object v7, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->INSTANCE:Lcom/discord/chat/bridge/attachment/Attachment$$serializer;

    .line 165
    .line 166
    invoke-direct {v6, v7}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v6}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    const/16 v7, 0x14

    .line 174
    .line 175
    aput-object v6, v0, v7

    .line 176
    .line 177
    const/16 v6, 0x15

    .line 178
    .line 179
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    aput-object v3, v0, v6

    .line 184
    .line 185
    sget-object v3, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    .line 186
    .line 187
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    const/16 v6, 0x16

    .line 192
    .line 193
    aput-object v3, v0, v6

    .line 194
    .line 195
    new-instance v3, Lzi/f;

    .line 196
    .line 197
    sget-object v6, Lcom/discord/chat/bridge/UploadProgress$$serializer;->INSTANCE:Lcom/discord/chat/bridge/UploadProgress$$serializer;

    .line 198
    .line 199
    invoke-direct {v3, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    const/16 v6, 0x17

    .line 207
    .line 208
    aput-object v3, v0, v6

    .line 209
    .line 210
    new-instance v3, Lzi/f;

    .line 211
    .line 212
    sget-object v6, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;

    .line 213
    .line 214
    invoke-direct {v3, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    const/16 v6, 0x18

    .line 222
    .line 223
    aput-object v3, v0, v6

    .line 224
    .line 225
    const/16 v3, 0x19

    .line 226
    .line 227
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    aput-object v6, v0, v3

    .line 232
    .line 233
    new-instance v3, Lzi/f;

    .line 234
    .line 235
    sget-object v6, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    .line 236
    .line 237
    invoke-static {v6}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-direct {v3, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    const/16 v6, 0x1a

    .line 249
    .line 250
    aput-object v3, v0, v6

    .line 251
    .line 252
    new-instance v3, Lzi/f;

    .line 253
    .line 254
    sget-object v6, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    .line 255
    .line 256
    invoke-direct {v3, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    const/16 v7, 0x1b

    .line 264
    .line 265
    aput-object v3, v0, v7

    .line 266
    .line 267
    sget-object v3, Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;->INSTANCE:Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;

    .line 268
    .line 269
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    const/16 v7, 0x1c

    .line 274
    .line 275
    aput-object v3, v0, v7

    .line 276
    .line 277
    sget-object v3, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;->INSTANCE:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;

    .line 278
    .line 279
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    const/16 v7, 0x1d

    .line 284
    .line 285
    aput-object v3, v0, v7

    .line 286
    .line 287
    sget-object v3, Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;

    .line 288
    .line 289
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    const/16 v7, 0x1e

    .line 294
    .line 295
    aput-object v3, v0, v7

    .line 296
    .line 297
    const/16 v3, 0x1f

    .line 298
    .line 299
    aput-object v5, v0, v3

    .line 300
    .line 301
    const/16 v3, 0x20

    .line 302
    .line 303
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    aput-object v7, v0, v3

    .line 308
    .line 309
    const/16 v3, 0x21

    .line 310
    .line 311
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    aput-object v7, v0, v3

    .line 316
    .line 317
    sget-object v3, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;->INSTANCE:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;

    .line 318
    .line 319
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    const/16 v7, 0x22

    .line 324
    .line 325
    aput-object v3, v0, v7

    .line 326
    .line 327
    sget-object v3, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;->INSTANCE:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;

    .line 328
    .line 329
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    const/16 v7, 0x23

    .line 334
    .line 335
    aput-object v3, v0, v7

    .line 336
    .line 337
    new-instance v3, Lzi/f;

    .line 338
    .line 339
    sget-object v7, Lcom/discord/chat/bridge/botuikit/ComponentSerializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentSerializer;

    .line 340
    .line 341
    invoke-direct {v3, v7}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    const/16 v7, 0x24

    .line 349
    .line 350
    aput-object v3, v0, v7

    .line 351
    .line 352
    const/16 v3, 0x25

    .line 353
    .line 354
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    aput-object v7, v0, v3

    .line 359
    .line 360
    const/16 v3, 0x26

    .line 361
    .line 362
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    aput-object v7, v0, v3

    .line 367
    .line 368
    const/16 v3, 0x27

    .line 369
    .line 370
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    aput-object v7, v0, v3

    .line 375
    .line 376
    const/16 v3, 0x28

    .line 377
    .line 378
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 379
    .line 380
    .line 381
    move-result-object v7

    .line 382
    aput-object v7, v0, v3

    .line 383
    .line 384
    const/16 v3, 0x29

    .line 385
    .line 386
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    aput-object v7, v0, v3

    .line 391
    .line 392
    const/16 v3, 0x2a

    .line 393
    .line 394
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    aput-object v7, v0, v3

    .line 399
    .line 400
    sget-object v3, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;

    .line 401
    .line 402
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    const/16 v7, 0x2b

    .line 407
    .line 408
    aput-object v3, v0, v7

    .line 409
    .line 410
    sget-object v3, Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;

    .line 411
    .line 412
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    const/16 v7, 0x2c

    .line 417
    .line 418
    aput-object v3, v0, v7

    .line 419
    .line 420
    sget-object v3, Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;->INSTANCE:Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;

    .line 421
    .line 422
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    const/16 v7, 0x2d

    .line 427
    .line 428
    aput-object v3, v0, v7

    .line 429
    .line 430
    const/16 v3, 0x2e

    .line 431
    .line 432
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 433
    .line 434
    .line 435
    move-result-object v7

    .line 436
    aput-object v7, v0, v3

    .line 437
    .line 438
    const/16 v3, 0x2f

    .line 439
    .line 440
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    aput-object v7, v0, v3

    .line 445
    .line 446
    const/16 v3, 0x30

    .line 447
    .line 448
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 449
    .line 450
    .line 451
    move-result-object v7

    .line 452
    aput-object v7, v0, v3

    .line 453
    .line 454
    const/16 v3, 0x31

    .line 455
    .line 456
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    aput-object v7, v0, v3

    .line 461
    .line 462
    const/16 v3, 0x32

    .line 463
    .line 464
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    aput-object v7, v0, v3

    .line 469
    .line 470
    new-instance v3, Lzi/f;

    .line 471
    .line 472
    invoke-direct {v3, v2}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 473
    .line 474
    .line 475
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 476
    .line 477
    .line 478
    move-result-object v3

    .line 479
    const/16 v7, 0x33

    .line 480
    .line 481
    aput-object v3, v0, v7

    .line 482
    .line 483
    const/16 v3, 0x34

    .line 484
    .line 485
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 486
    .line 487
    .line 488
    move-result-object v7

    .line 489
    aput-object v7, v0, v3

    .line 490
    .line 491
    const/16 v3, 0x35

    .line 492
    .line 493
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    aput-object v7, v0, v3

    .line 498
    .line 499
    const/16 v3, 0x36

    .line 500
    .line 501
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    aput-object v1, v0, v3

    .line 506
    .line 507
    const/16 v1, 0x37

    .line 508
    .line 509
    invoke-static {v6}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    aput-object v3, v0, v1

    .line 514
    .line 515
    const/16 v1, 0x38

    .line 516
    .line 517
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    aput-object v3, v0, v1

    .line 522
    .line 523
    const/16 v1, 0x39

    .line 524
    .line 525
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    aput-object v3, v0, v1

    .line 530
    .line 531
    const/16 v1, 0x3a

    .line 532
    .line 533
    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    aput-object v3, v0, v1

    .line 538
    .line 539
    sget-object v1, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;

    .line 540
    .line 541
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    const/16 v3, 0x3b

    .line 546
    .line 547
    aput-object v1, v0, v3

    .line 548
    .line 549
    const/16 v1, 0x3c

    .line 550
    .line 551
    aput-object v5, v0, v1

    .line 552
    .line 553
    sget-object v1, Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;->INSTANCE:Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;

    .line 554
    .line 555
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    const/16 v3, 0x3d

    .line 560
    .line 561
    aput-object v1, v0, v3

    .line 562
    .line 563
    sget-object v1, Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;->INSTANCE:Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;

    .line 564
    .line 565
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    const/16 v3, 0x3e

    .line 570
    .line 571
    aput-object v1, v0, v3

    .line 572
    .line 573
    new-instance v1, Lzi/f;

    .line 574
    .line 575
    sget-object v3, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    .line 576
    .line 577
    invoke-direct {v1, v3}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    .line 578
    .line 579
    .line 580
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    const/16 v5, 0x3f

    .line 585
    .line 586
    aput-object v1, v0, v5

    .line 587
    .line 588
    const/16 v1, 0x40

    .line 589
    .line 590
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    aput-object v3, v0, v1

    .line 595
    .line 596
    const/16 v1, 0x41

    .line 597
    .line 598
    invoke-static {v4}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    aput-object v3, v0, v1

    .line 603
    .line 604
    const/16 v1, 0x42

    .line 605
    .line 606
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    aput-object v2, v0, v1

    .line 611
    .line 612
    return-object v0
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

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/Message;
    .locals 120

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/chat/bridge/Message$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->y()Z

    move-result v2

    const/16 v9, 0xb

    const/16 v10, 0xa

    const/16 v11, 0x9

    const/4 v12, 0x6

    const/4 v13, 0x5

    const/4 v14, 0x3

    const/4 v15, 0x7

    const/16 v4, 0x8

    const/4 v3, 0x4

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_0

    sget-object v2, Lcom/discord/chat/bridge/MessageType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Serializer;

    invoke-interface {v0, v1, v7, v2, v8}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v7, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    invoke-interface {v0, v1, v6, v7, v8}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v1, v5, v7, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    invoke-interface {v0, v1, v14, v7, v8}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v14, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    invoke-interface {v0, v1, v3, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v14, Lcom/discord/chat/bridge/MessageState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageState$Serializer;

    invoke-interface {v0, v1, v13, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    invoke-interface {v0, v1, v12, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v0, v1, v15}, Lkotlinx/serialization/encoding/c;->h(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    move-result-wide v24

    sget-object v14, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v4, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v15, Lzi/e0;->a:Lzi/e0;

    invoke-interface {v0, v1, v11, v15, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v1, v10, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v0, v1, v9, v14, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v27, v2

    sget-object v2, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v28, v3

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v23, v3

    const/16 v3, 0xd

    invoke-interface {v0, v1, v3, v2, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v8, 0xe

    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v8

    move-object/from16 v21, v3

    const/16 v3, 0xf

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    move/from16 v20, v3

    move-object/from16 v19, v7

    const/16 v3, 0x10

    const/4 v7, 0x0

    invoke-interface {v0, v1, v3, v2, v7}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v22, v3

    const/16 v3, 0x11

    invoke-interface {v0, v1, v3, v14, v7}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v14, v7}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v7, Lzi/f;

    move-object/from16 p1, v3

    sget-object v3, Lcom/discord/chat/bridge/embed/Embed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/Embed$$serializer;

    invoke-direct {v7, v3}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x13

    move-object/from16 v30, v6

    const/4 v6, 0x0

    invoke-interface {v0, v1, v3, v7, v6}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v7, Lzi/f;

    sget-object v6, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->INSTANCE:Lcom/discord/chat/bridge/attachment/Attachment$$serializer;

    invoke-direct {v7, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v6, 0x14

    move-object/from16 v31, v5

    const/4 v5, 0x0

    invoke-interface {v0, v1, v6, v7, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/16 v7, 0x15

    invoke-interface {v0, v1, v7, v15, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/16 v15, 0x16

    move-object/from16 v29, v3

    sget-object v3, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    invoke-interface {v0, v1, v15, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v15, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/UploadProgress$$serializer;->INSTANCE:Lcom/discord/chat/bridge/UploadProgress$$serializer;

    invoke-direct {v15, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x17

    move-object/from16 v33, v3

    const/4 v3, 0x0

    invoke-interface {v0, v1, v5, v15, v3}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    new-instance v15, Lzi/f;

    sget-object v3, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;

    invoke-direct {v15, v3}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x18

    move-object/from16 v34, v13

    const/4 v13, 0x0

    invoke-interface {v0, v1, v3, v15, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v15, Lzi/h;->a:Lzi/h;

    move-object/from16 v32, v3

    const/16 v3, 0x19

    invoke-interface {v0, v1, v3, v15, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v13, Lzi/f;

    sget-object v36, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    move-object/from16 v37, v3

    invoke-static/range {v36 .. v36}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    move-result-object v3

    invoke-direct {v13, v3}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v3, 0x1a

    move-object/from16 v36, v12

    const/4 v12, 0x0

    invoke-interface {v0, v1, v3, v13, v12}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v13, Lzi/f;

    sget-object v12, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    invoke-direct {v13, v12}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    move-object/from16 v38, v3

    const/16 v3, 0x1b

    move-object/from16 v39, v4

    const/4 v4, 0x0

    invoke-interface {v0, v1, v3, v13, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x1c

    move-object/from16 v35, v3

    sget-object v3, Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;->INSTANCE:Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;

    invoke-interface {v0, v1, v13, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x1d

    move-object/from16 v40, v3

    sget-object v3, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;->INSTANCE:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;

    invoke-interface {v0, v1, v13, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x1e

    move-object/from16 v41, v3

    sget-object v3, Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;

    invoke-interface {v0, v1, v13, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v13, 0x1f

    invoke-interface {v0, v1, v13}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v13

    move-object/from16 v42, v3

    const/16 v3, 0x20

    invoke-interface {v0, v1, v3, v15, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    const/16 v3, 0x21

    invoke-interface {v0, v1, v3, v15, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v43, v3

    const/16 v3, 0x22

    move-object/from16 v44, v5

    sget-object v5, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;->INSTANCE:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v5, 0x23

    move-object/from16 v45, v3

    sget-object v3, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;->INSTANCE:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v5, Lzi/f;

    sget-object v4, Lcom/discord/chat/bridge/botuikit/ComponentSerializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentSerializer;

    invoke-direct {v5, v4}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v4, 0x24

    move-object/from16 v47, v11

    const/4 v11, 0x0

    invoke-interface {v0, v1, v4, v5, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x25

    invoke-interface {v0, v1, v5, v14, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v46, v3

    const/16 v3, 0x26

    invoke-interface {v0, v1, v3, v15, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v48, v3

    const/16 v3, 0x27

    invoke-interface {v0, v1, v3, v14, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v49, v3

    const/16 v3, 0x28

    invoke-interface {v0, v1, v3, v15, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v50, v3

    const/16 v3, 0x29

    invoke-interface {v0, v1, v3, v2, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v51, v3

    const/16 v3, 0x2a

    invoke-interface {v0, v1, v3, v14, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v52, v3

    const/16 v3, 0x2b

    move-object/from16 v53, v4

    sget-object v4, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;

    invoke-interface {v0, v1, v3, v4, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x2c

    move-object/from16 v54, v3

    sget-object v3, Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;

    invoke-interface {v0, v1, v4, v3, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x2d

    move-object/from16 v55, v3

    sget-object v3, Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;->INSTANCE:Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;

    invoke-interface {v0, v1, v4, v3, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x2e

    invoke-interface {v0, v1, v4, v15, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v56, v3

    const/16 v3, 0x2f

    invoke-interface {v0, v1, v3, v15, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v57, v3

    const/16 v3, 0x30

    invoke-interface {v0, v1, v3, v15, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v58, v3

    const/16 v3, 0x31

    invoke-interface {v0, v1, v3, v14, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v59, v3

    const/16 v3, 0x32

    invoke-interface {v0, v1, v3, v14, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v11, Lzi/f;

    invoke-direct {v11, v14}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    move-object/from16 v61, v3

    const/16 v3, 0x33

    move-object/from16 v62, v10

    const/4 v10, 0x0

    invoke-interface {v0, v1, v3, v11, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v11, 0x34

    invoke-interface {v0, v1, v11, v15, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v60, v3

    const/16 v3, 0x35

    invoke-interface {v0, v1, v3, v15, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v63, v3

    const/16 v3, 0x36

    move-object/from16 v64, v4

    sget-object v4, Lzi/w0;->a:Lzi/w0;

    invoke-interface {v0, v1, v3, v4, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x37

    invoke-interface {v0, v1, v4, v12, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v12, 0x38

    invoke-interface {v0, v1, v12, v14, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v65, v3

    const/16 v3, 0x39

    invoke-interface {v0, v1, v3, v14, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v66, v3

    const/16 v3, 0x3a

    invoke-interface {v0, v1, v3, v15, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v15, 0x3b

    move-object/from16 v67, v3

    sget-object v3, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;

    invoke-interface {v0, v1, v15, v3, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v15, 0x3c

    invoke-interface {v0, v1, v15}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v15

    move-object/from16 v68, v3

    const/16 v3, 0x3d

    move-object/from16 v69, v4

    sget-object v4, Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;->INSTANCE:Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;

    invoke-interface {v0, v1, v3, v4, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x3e

    move-object/from16 v70, v3

    sget-object v3, Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;->INSTANCE:Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;

    invoke-interface {v0, v1, v4, v3, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lzi/f;

    sget-object v10, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    invoke-direct {v4, v10}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    move-object/from16 v72, v3

    const/16 v3, 0x3f

    move-object/from16 v73, v9

    const/4 v9, 0x0

    invoke-interface {v0, v1, v3, v4, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0x40

    invoke-interface {v0, v1, v4, v10, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/16 v10, 0x41

    invoke-interface {v0, v1, v10, v2, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v10, 0x42

    invoke-interface {v0, v1, v10, v14, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/4 v14, -0x1

    move-object/from16 v79, v5

    move-object/from16 v81, v6

    move-object/from16 v83, v7

    move/from16 v116, v8

    move-object/from16 v102, v10

    move-object/from16 v94, v11

    move-object/from16 v98, v12

    move/from16 v117, v13

    move/from16 v111, v14

    move/from16 v112, v111

    move/from16 v118, v15

    move-wide/from16 v114, v24

    move-object/from16 v5, v43

    move-object/from16 v78, v44

    move-object/from16 v6, v45

    move-object/from16 v7, v48

    move-object/from16 v8, v49

    move-object/from16 v9, v50

    move-object/from16 v10, v51

    move-object/from16 v11, v52

    move-object/from16 v12, v54

    move-object/from16 v13, v55

    move-object/from16 v14, v56

    move-object/from16 v16, v57

    move-object/from16 v24, v60

    move-object/from16 v95, v63

    move-object/from16 v96, v65

    move-object/from16 v25, v66

    move-object/from16 v26, v67

    const/16 v113, 0x7

    move-object v15, v2

    move/from16 v57, v20

    move-object/from16 v2, v27

    move-object/from16 v43, v29

    move-object/from16 v45, v30

    move-object/from16 v44, v31

    move-object/from16 v50, v34

    move-object/from16 v49, v35

    move-object/from16 v48, v38

    move-object/from16 v56, v46

    move-object/from16 v51, v47

    move-object/from16 v34, v53

    move-object/from16 v20, v59

    move-object/from16 v35, v64

    move-object/from16 v27, v68

    move-object/from16 v38, v69

    move-object/from16 v30, v72

    move-object/from16 v53, v73

    move-object/from16 v31, v3

    move-object/from16 v73, v4

    move-object/from16 v46, v19

    move-object/from16 v3, v28

    move-object/from16 v47, v36

    move-object/from16 v19, v58

    move-object/from16 v28, v70

    move-object/from16 v4, p1

    move-object/from16 v36, v23

    move-object/from16 v23, v61

    goto/16 :goto_1a

    :cond_0
    move v2, v9

    move-object v9, v8

    move v8, v3

    move v3, v10

    move v10, v5

    move v5, v12

    move v12, v7

    move v7, v4

    move v4, v11

    move v11, v6

    move v6, v13

    const-wide/16 v24, 0x0

    move-object v2, v9

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v10, v8

    move-object v13, v10

    move-object v15, v13

    move-object/from16 v37, v15

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v41, v40

    move-object/from16 v42, v41

    move-object/from16 v43, v42

    move-object/from16 v44, v43

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

    move-object/from16 v60, v59

    move-object/from16 v61, v60

    move-object/from16 v62, v61

    move-object/from16 v63, v62

    move-object/from16 v64, v63

    move-object/from16 v66, v64

    move-object/from16 v67, v66

    move-object/from16 v69, v67

    move-object/from16 v70, v69

    move-object/from16 v71, v70

    move-object/from16 v73, v71

    move-object/from16 v74, v73

    move-object/from16 v75, v74

    move-object/from16 v76, v75

    move-object/from16 v77, v76

    move-object/from16 v78, v77

    move-object/from16 v79, v78

    move-object/from16 v80, v79

    move-object/from16 v81, v80

    move-object/from16 v82, v81

    move-object/from16 v83, v82

    move-object/from16 v84, v83

    move-object/from16 v85, v84

    move-object/from16 v86, v85

    move-object/from16 v87, v86

    move-object/from16 v88, v87

    move/from16 v93, v11

    move v14, v12

    move/from16 v65, v14

    move/from16 v68, v65

    move/from16 v72, v68

    move/from16 v89, v72

    move/from16 v90, v89

    move/from16 v94, v90

    move-wide/from16 v91, v24

    move-object/from16 v11, v88

    move-object v12, v11

    :goto_0
    if-eqz v93, :cond_1

    move-object/from16 v95, v6

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->x(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v6

    packed-switch v6, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v6}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v6, 0x42

    move-object/from16 v96, v5

    sget-object v5, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v6, v5, v10}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit8 v94, v94, 0x4

    goto/16 :goto_2

    :pswitch_1
    move-object/from16 v96, v5

    const/16 v5, 0x41

    sget-object v6, Lzi/m0;->a:Lzi/m0;

    invoke-interface {v0, v1, v5, v6, v15}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit8 v94, v94, 0x2

    goto/16 :goto_2

    :pswitch_2
    move-object/from16 v96, v5

    sget-object v5, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    const/16 v6, 0x40

    invoke-interface {v0, v1, v6, v5, v11}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    or-int/lit8 v94, v94, 0x1

    goto/16 :goto_2

    :pswitch_3
    move-object/from16 v96, v5

    const/16 v6, 0x40

    new-instance v5, Lzi/f;

    sget-object v6, Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;->INSTANCE:Lcom/discord/chat/bridge/gift/GiftEmbedSerializer;

    invoke-direct {v5, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v6, 0x3f

    invoke-interface {v0, v1, v6, v5, v9}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    const/high16 v5, -0x80000000

    goto :goto_1

    :pswitch_4
    move-object/from16 v96, v5

    const/16 v5, 0x3e

    sget-object v6, Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;->INSTANCE:Lcom/discord/chat/bridge/automod/AutoModerationContext$$serializer;

    invoke-interface {v0, v1, v5, v6, v13}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    const/high16 v5, 0x40000000    # 2.0f

    goto :goto_1

    :pswitch_5
    move-object/from16 v96, v5

    const/16 v5, 0x3d

    sget-object v6, Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;->INSTANCE:Lcom/discord/chat/bridge/forums/ForumPostActions$$serializer;

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x20000000

    goto :goto_1

    :pswitch_6
    move-object/from16 v96, v5

    const/16 v5, 0x3c

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v90

    const/high16 v5, 0x10000000

    goto :goto_1

    :pswitch_7
    move-object/from16 v96, v5

    const/16 v5, 0x3b

    sget-object v6, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed$$serializer;

    invoke-interface {v0, v1, v5, v6, v3}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v5, 0x8000000

    goto :goto_1

    :pswitch_8
    move-object/from16 v96, v5

    const/16 v5, 0x3a

    sget-object v6, Lzi/h;->a:Lzi/h;

    invoke-interface {v0, v1, v5, v6, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/high16 v5, 0x4000000

    goto :goto_1

    :pswitch_9
    move-object/from16 v96, v5

    const/16 v5, 0x39

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v5, v6, v7}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const/high16 v5, 0x2000000

    goto :goto_1

    :pswitch_a
    move-object/from16 v96, v5

    const/16 v5, 0x38

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v5, v6, v8}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const/high16 v5, 0x1000000

    goto :goto_1

    :pswitch_b
    move-object/from16 v96, v5

    const/16 v5, 0x37

    sget-object v6, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    invoke-interface {v0, v1, v5, v6, v12}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    const/high16 v5, 0x800000

    :goto_1
    or-int/2addr v14, v5

    :goto_2
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v17, v44

    move-object/from16 v18, v53

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v6, v95

    goto/16 :goto_8

    :pswitch_c
    move-object/from16 v96, v5

    const/16 v5, 0x36

    sget-object v6, Lzi/w0;->a:Lzi/w0;

    move-object/from16 v97, v2

    move-object/from16 v2, v96

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v2, 0x400000

    or-int/2addr v14, v2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v96, v5

    goto/16 :goto_4

    :pswitch_d
    move-object/from16 v97, v2

    move-object v2, v5

    const/16 v5, 0x35

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v96, v2

    move-object/from16 v2, v95

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/high16 v2, 0x200000

    or-int/2addr v14, v2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v17, v44

    move-object/from16 v18, v53

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    goto/16 :goto_7

    :pswitch_e
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v95

    const/16 v5, 0x34

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v73

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x100000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v73, v2

    goto/16 :goto_4

    :pswitch_f
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v73

    new-instance v5, Lzi/f;

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    invoke-direct {v5, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v6, 0x33

    move-object/from16 v2, v71

    invoke-interface {v0, v1, v6, v5, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x80000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v71, v2

    goto/16 :goto_4

    :pswitch_10
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v71

    const/16 v5, 0x32

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v70

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x40000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v70, v2

    goto/16 :goto_4

    :pswitch_11
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v70

    const/16 v5, 0x31

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v69

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x20000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v69, v2

    goto/16 :goto_4

    :pswitch_12
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v69

    const/16 v5, 0x30

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v67

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v5, 0x10000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v67, v2

    goto/16 :goto_4

    :pswitch_13
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v67

    const/16 v5, 0x2f

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v66

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v5, 0x8000

    or-int/2addr v14, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v66, v2

    goto/16 :goto_4

    :pswitch_14
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v66

    const/16 v5, 0x2e

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v76

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v76

    or-int/lit16 v14, v14, 0x4000

    goto/16 :goto_3

    :pswitch_15
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v76

    const/16 v5, 0x2d

    sget-object v6, Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;->INSTANCE:Lcom/discord/chat/bridge/interaction/InteractionStatus$$serializer;

    move-object/from16 v2, v64

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x2000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v64, v2

    goto/16 :goto_4

    :pswitch_16
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v64

    const/16 v5, 0x2c

    sget-object v6, Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/feedback/SurveyIndication$$serializer;

    move-object/from16 v2, v63

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x1000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v63, v2

    goto/16 :goto_4

    :pswitch_17
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v63

    const/16 v5, 0x2b

    sget-object v6, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;->INSTANCE:Lcom/discord/chat/bridge/ephemeral/EphemeralIndication$$serializer;

    move-object/from16 v2, v62

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x800

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v62, v2

    goto/16 :goto_4

    :pswitch_18
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v62

    const/16 v5, 0x2a

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v61

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x400

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v61, v2

    goto/16 :goto_4

    :pswitch_19
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v61

    const/16 v5, 0x29

    sget-object v6, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v2, v60

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x200

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v60, v2

    goto/16 :goto_4

    :pswitch_1a
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v60

    const/16 v5, 0x28

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v59

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x100

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v59, v2

    goto/16 :goto_4

    :pswitch_1b
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v59

    const/16 v5, 0x27

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v58

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit16 v14, v14, 0x80

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v58, v5

    goto/16 :goto_4

    :pswitch_1c
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v58

    const/16 v5, 0x26

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v57

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit8 v14, v14, 0x40

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v57, v6

    goto/16 :goto_4

    :pswitch_1d
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v57

    const/16 v5, 0x25

    sget-object v6, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v79

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v79

    or-int/lit8 v14, v14, 0x20

    goto :goto_3

    :pswitch_1e
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v79

    new-instance v5, Lzi/f;

    sget-object v6, Lcom/discord/chat/bridge/botuikit/ComponentSerializer;->INSTANCE:Lcom/discord/chat/bridge/botuikit/ComponentSerializer;

    invoke-direct {v5, v6}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v6, 0x24

    move-object/from16 v2, v75

    invoke-interface {v0, v1, v6, v5, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v75

    or-int/lit8 v14, v14, 0x10

    :goto_3
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_4

    :pswitch_1f
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v75

    const/16 v5, 0x23

    sget-object v6, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;->INSTANCE:Lcom/discord/chat/bridge/executedcommand/ExecutedCommand$$serializer;

    move-object/from16 v2, v56

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v14, v14, 0x8

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v56, v2

    goto :goto_4

    :pswitch_20
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v56

    const/16 v5, 0x22

    sget-object v6, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;->INSTANCE:Lcom/discord/chat/bridge/referencedmessage/ReferencedMessageSerializer;

    move-object/from16 v2, v55

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v14, v14, 0x4

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v55, v2

    goto :goto_4

    :pswitch_21
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v55

    const/16 v5, 0x21

    sget-object v6, Lzi/h;->a:Lzi/h;

    move-object/from16 v2, v54

    invoke-interface {v0, v1, v5, v6, v2}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v14, v14, 0x2

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v54, v2

    :goto_4
    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v17, v44

    move-object/from16 v18, v53

    goto :goto_6

    :pswitch_22
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v2, v54

    sget-object v5, Lzi/h;->a:Lzi/h;

    move-object/from16 v17, v2

    move-object/from16 v6, v53

    const/16 v2, 0x20

    invoke-interface {v0, v1, v2, v5, v6}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit8 v14, v14, 0x1

    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v5

    move-object/from16 v54, v17

    goto :goto_5

    :pswitch_23
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    const/16 v2, 0x20

    const/16 v5, 0x1f

    invoke-interface {v0, v1, v5}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v72

    const/high16 v5, -0x80000000

    move/from16 v2, v89

    or-int v89, v2, v5

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v6

    :goto_5
    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v17, v44

    :goto_6
    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v6, v95

    :goto_7
    move-object/from16 v2, v97

    :goto_8
    const/4 v5, 0x0

    goto/16 :goto_19

    :pswitch_24
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    const/16 v5, 0x1e

    move-object/from16 v54, v3

    sget-object v3, Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/threads/ThreadEmbed$$serializer;

    move-object/from16 v89, v4

    move-object/from16 v4, v52

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x40000000    # 2.0f

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v52, v3

    goto/16 :goto_a

    :pswitch_25
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v52

    const/16 v3, 0x1d

    sget-object v5, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;->INSTANCE:Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag$$serializer;

    move-object/from16 v4, v51

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x20000000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v51, v3

    goto/16 :goto_a

    :pswitch_26
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v51

    const/16 v3, 0x1c

    sget-object v5, Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;->INSTANCE:Lcom/discord/chat/bridge/roleicons/RoleIcon$$serializer;

    move-object/from16 v4, v50

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x10000000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v50, v3

    goto/16 :goto_a

    :pswitch_27
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v50

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/sticker/Sticker$$serializer;->INSTANCE:Lcom/discord/chat/bridge/sticker/Sticker$$serializer;

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x1b

    move-object/from16 v4, v49

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x8000000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v49, v3

    goto/16 :goto_a

    :pswitch_28
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v49

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;->INSTANCE:Lcom/discord/chat/bridge/codedlinks/CodedLinkSerializer;

    invoke-static {v5}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    move-result-object v5

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x1a

    move-object/from16 v4, v48

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x4000000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v48, v3

    goto/16 :goto_a

    :pswitch_29
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v48

    const/16 v3, 0x19

    sget-object v5, Lzi/h;->a:Lzi/h;

    move-object/from16 v4, v47

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const/high16 v3, 0x2000000

    or-int/2addr v2, v3

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v47, v4

    goto/16 :goto_a

    :pswitch_2a
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v47

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;->INSTANCE:Lcom/discord/chat/bridge/reaction/MessageReaction$$serializer;

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x18

    move-object/from16 v4, v46

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x1000000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v46, v3

    goto/16 :goto_a

    :pswitch_2b
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v46

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/UploadProgress$$serializer;->INSTANCE:Lcom/discord/chat/bridge/UploadProgress$$serializer;

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x17

    move-object/from16 v4, v78

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v78

    const/high16 v3, 0x800000

    goto/16 :goto_9

    :pswitch_2c
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v78

    const/16 v3, 0x16

    sget-object v5, Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;->INSTANCE:Lcom/discord/chat/bridge/structurabletext/StructurableTextSerializer;

    move-object/from16 v4, v45

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/high16 v3, 0x400000

    or-int/2addr v2, v3

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v45, v5

    goto :goto_a

    :pswitch_2d
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v45

    const/16 v3, 0x15

    sget-object v5, Lzi/e0;->a:Lzi/e0;

    move-object/from16 v4, v83

    invoke-interface {v0, v1, v3, v5, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v83

    const/high16 v3, 0x200000

    goto :goto_9

    :pswitch_2e
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v83

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/attachment/Attachment$$serializer;->INSTANCE:Lcom/discord/chat/bridge/attachment/Attachment$$serializer;

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x14

    move-object/from16 v4, v81

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v81

    const/high16 v3, 0x100000

    :goto_9
    or-int/2addr v2, v3

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_a
    move-object/from16 v18, v6

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v3, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v4, v89

    move-object/from16 v6, v95

    const/4 v5, 0x0

    move/from16 v89, v2

    move-object/from16 v54, v17

    move-object/from16 v17, v44

    move-object/from16 v2, v97

    goto/16 :goto_19

    :pswitch_2f
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v81

    new-instance v3, Lzi/f;

    sget-object v5, Lcom/discord/chat/bridge/embed/Embed$$serializer;->INSTANCE:Lcom/discord/chat/bridge/embed/Embed$$serializer;

    invoke-direct {v3, v5}, Lzi/f;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v5, 0x13

    move-object/from16 v4, v44

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x80000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v6

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v4, v89

    move-object/from16 v6, v95

    const/4 v5, 0x0

    move/from16 v89, v2

    move-object/from16 v2, v97

    move-object/from16 v119, v17

    move-object/from16 v17, v3

    move-object/from16 v3, v54

    move-object/from16 v54, v119

    goto/16 :goto_19

    :pswitch_30
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v44

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v5, v43

    move-object/from16 v43, v4

    const/16 v4, 0x12

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v5, 0x40000

    or-int/2addr v2, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v6

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v4, v89

    move-object/from16 v6, v95

    const/4 v5, 0x0

    move/from16 v89, v2

    move-object/from16 v2, v97

    move-object/from16 v119, v43

    move-object/from16 v43, v3

    move-object/from16 v3, v54

    move-object/from16 v54, v17

    move-object/from16 v17, v119

    goto/16 :goto_19

    :pswitch_31
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v5, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v4, 0x12

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v18, v5

    move-object/from16 v4, v42

    const/16 v5, 0x11

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v4, 0x20000

    or-int/2addr v2, v4

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v19, v3

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    goto/16 :goto_e

    :pswitch_32
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    const/16 v5, 0x11

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v42

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v19, v4

    move-object/from16 v5, v41

    const/16 v4, 0x10

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v5, 0x10000

    or-int/2addr v2, v5

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v22, v3

    goto :goto_c

    :pswitch_33
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v5, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v3, 0xf

    const/16 v4, 0x10

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v65

    const v20, 0x8000

    or-int v2, v2, v20

    sget-object v20, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_b

    :pswitch_34
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v5, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v3, 0xe

    const/16 v4, 0x10

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->s(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v68

    or-int/lit16 v2, v2, 0x4000

    sget-object v21, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_b
    move-object/from16 v22, v5

    :goto_c
    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    goto/16 :goto_e

    :pswitch_35
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v5, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v4, 0x10

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v22, v5

    move-object/from16 v4, v40

    const/16 v5, 0xd

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x2000

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v23, v3

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    goto :goto_e

    :pswitch_36
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    const/16 v5, 0xd

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v40

    sget-object v3, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v23, v4

    move-object/from16 v5, v39

    const/16 v4, 0xc

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v2, v2, 0x1000

    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v36, v3

    goto :goto_d

    :pswitch_37
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v5, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v4, 0xc

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v36, v5

    move-object/from16 v4, v84

    const/16 v5, 0xb

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v84

    or-int/lit16 v2, v2, 0x800

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_d
    move-object/from16 v28, v38

    :goto_e
    move-object/from16 v3, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    goto :goto_f

    :pswitch_38
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move/from16 v2, v89

    const/16 v5, 0xb

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v84

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v35, v4

    move-object/from16 v5, v85

    const/16 v4, 0xa

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v85

    or-int/lit16 v2, v2, 0x400

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    move-object/from16 v3, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    :goto_f
    move-object/from16 v34, v85

    goto :goto_10

    :pswitch_39
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v35, v84

    move-object/from16 v5, v85

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v4, 0xa

    sget-object v3, Lzi/e0;->a:Lzi/e0;

    move-object/from16 v34, v5

    move-object/from16 v4, v86

    const/16 v5, 0x9

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v86

    or-int/lit16 v2, v2, 0x200

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    move-object/from16 v3, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    :goto_10
    move-object/from16 v33, v86

    goto/16 :goto_13

    :pswitch_3a
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move/from16 v2, v89

    const/16 v5, 0x9

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v86

    sget-object v3, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v33, v4

    move-object/from16 v5, v74

    const/16 v4, 0x8

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v74

    or-int/lit16 v2, v2, 0x100

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    move-object/from16 v3, v54

    move-object/from16 v32, v74

    goto/16 :goto_12

    :pswitch_3b
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v5, v74

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/4 v3, 0x7

    const/16 v4, 0x8

    invoke-interface {v0, v1, v3}, Lkotlinx/serialization/encoding/c;->h(Lkotlinx/serialization/descriptors/SerialDescriptor;I)J

    move-result-wide v91

    or-int/lit16 v2, v2, 0x80

    sget-object v26, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v32, v5

    goto :goto_11

    :pswitch_3c
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v5, v74

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/16 v4, 0x8

    sget-object v3, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    move-object/from16 v32, v5

    move-object/from16 v4, v87

    const/4 v5, 0x6

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v87

    or-int/lit8 v2, v2, 0x40

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_11
    move-object/from16 v28, v38

    move-object/from16 v3, v54

    :goto_12
    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    :goto_13
    move-object/from16 v31, v87

    goto/16 :goto_16

    :pswitch_3d
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move/from16 v2, v89

    const/4 v5, 0x6

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v87

    sget-object v3, Lcom/discord/chat/bridge/MessageState$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageState$Serializer;

    move-object/from16 v31, v4

    move-object/from16 v5, v88

    const/4 v4, 0x5

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v88

    or-int/lit8 v2, v2, 0x20

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v38

    goto/16 :goto_14

    :pswitch_3e
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v5, v88

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/4 v4, 0x5

    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    move-object/from16 v30, v5

    move-object/from16 v4, v38

    const/4 v5, 0x4

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v2, v2, 0x10

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v28, v3

    move-object/from16 v88, v30

    goto :goto_14

    :pswitch_3f
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    const/4 v5, 0x4

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v38

    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    move-object/from16 v28, v4

    move-object/from16 v5, v82

    const/4 v4, 0x3

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v82

    or-int/lit8 v2, v2, 0x8

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_14
    move-object/from16 v3, v54

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    goto/16 :goto_16

    :pswitch_40
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v5, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/4 v4, 0x3

    sget-object v3, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    move-object/from16 v27, v5

    move-object/from16 v4, v77

    const/4 v5, 0x2

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->v(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v77

    or-int/lit8 v2, v2, 0x4

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v54

    move-object/from16 v25, v77

    goto :goto_15

    :pswitch_41
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    const/4 v5, 0x2

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v77

    sget-object v3, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    move-object/from16 v25, v4

    move-object/from16 v5, v80

    const/4 v4, 0x1

    invoke-interface {v0, v1, v4, v3, v5}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v80

    or-int/lit8 v2, v2, 0x2

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v54

    :goto_15
    move-object/from16 v24, v80

    :goto_16
    move-object/from16 v4, v89

    const/4 v5, 0x0

    goto/16 :goto_18

    :pswitch_42
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v5, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    const/4 v4, 0x1

    sget-object v3, Lcom/discord/chat/bridge/MessageType$Serializer;->INSTANCE:Lcom/discord/chat/bridge/MessageType$Serializer;

    move-object/from16 v24, v5

    move-object/from16 v4, v37

    const/4 v5, 0x0

    invoke-interface {v0, v1, v5, v3, v4}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v2, v2, 0x1

    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v37, v3

    goto :goto_17

    :pswitch_43
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    const/4 v5, 0x0

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v37

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move/from16 v93, v5

    :goto_17
    move-object/from16 v3, v54

    move-object/from16 v4, v89

    :goto_18
    move/from16 v89, v2

    move-object/from16 v54, v17

    move-object/from16 v17, v43

    move-object/from16 v2, v97

    move-object/from16 v43, v18

    move-object/from16 v18, v6

    move-object/from16 v6, v95

    :goto_19
    move-object/from16 v44, v17

    move-object/from16 v53, v18

    move-object/from16 v42, v19

    move-object/from16 v41, v22

    move-object/from16 v40, v23

    move-object/from16 v80, v24

    move-object/from16 v77, v25

    move-object/from16 v82, v27

    move-object/from16 v38, v28

    move-object/from16 v87, v31

    move-object/from16 v74, v32

    move-object/from16 v86, v33

    move-object/from16 v85, v34

    move-object/from16 v84, v35

    move-object/from16 v39, v36

    move-object/from16 v5, v96

    goto/16 :goto_0

    :cond_1
    move-object/from16 v97, v2

    move-object/from16 v96, v5

    move-object/from16 v95, v6

    move-object/from16 v28, v38

    move-object/from16 v36, v39

    move-object/from16 v23, v40

    move-object/from16 v22, v41

    move-object/from16 v19, v42

    move-object/from16 v18, v43

    move-object/from16 v43, v44

    move-object/from16 v6, v53

    move-object/from16 v17, v54

    move-object/from16 v32, v74

    move-object/from16 v25, v77

    move-object/from16 v24, v80

    move-object/from16 v27, v82

    move-object/from16 v35, v84

    move-object/from16 v34, v85

    move-object/from16 v33, v86

    move-object/from16 v31, v87

    move-object/from16 v30, v88

    move/from16 v2, v89

    move-object/from16 v54, v3

    move-object/from16 v89, v4

    move-object/from16 v4, v37

    move/from16 v111, v2

    move-object v2, v4

    move-object/from16 v98, v8

    move-object/from16 v102, v10

    move-object/from16 v38, v12

    move/from16 v112, v14

    move-object/from16 v5, v17

    move-object/from16 v4, v18

    move-object/from16 v18, v19

    move-object/from16 v21, v23

    move-object/from16 v44, v25

    move-object/from16 v3, v28

    move-object/from16 v39, v32

    move-object/from16 v53, v35

    move-object/from16 v32, v46

    move-object/from16 v37, v47

    move-object/from16 v40, v50

    move-object/from16 v41, v51

    move-object/from16 v42, v52

    move-object/from16 v8, v58

    move-object/from16 v10, v60

    move-object/from16 v12, v62

    move-object/from16 v14, v64

    move-object/from16 v16, v66

    move-object/from16 v19, v67

    move/from16 v116, v68

    move-object/from16 v20, v69

    move-object/from16 v23, v70

    move/from16 v117, v72

    move-object/from16 v35, v76

    move-object/from16 v26, v89

    move/from16 v118, v90

    move-wide/from16 v114, v91

    move/from16 v113, v94

    move-object/from16 v28, v97

    move-object/from16 v17, v6

    move-object/from16 v25, v7

    move-object/from16 v46, v27

    move-object/from16 v50, v30

    move-object/from16 v47, v31

    move-object/from16 v51, v33

    move-object/from16 v62, v34

    move-object/from16 v33, v45

    move-object/from16 v27, v54

    move-object/from16 v6, v55

    move-object/from16 v7, v57

    move/from16 v57, v65

    move-object/from16 v94, v73

    move-object/from16 v34, v75

    move-object/from16 v31, v9

    move-object/from16 v73, v11

    move-object/from16 v30, v13

    move-object/from16 v45, v24

    move-object/from16 v9, v59

    move-object/from16 v11, v61

    move-object/from16 v13, v63

    move-object/from16 v24, v71

    :goto_1a
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/chat/bridge/Message;

    move-object v1, v2

    check-cast v1, Lcom/discord/chat/bridge/MessageType;

    check-cast v45, Lcom/discord/primitives/MessageId;

    if-eqz v45, :cond_2

    invoke-virtual/range {v45 .. v45}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object v2

    goto :goto_1b

    :cond_2
    const/4 v2, 0x0

    :goto_1b
    check-cast v44, Lcom/discord/primitives/MessageId;

    if-eqz v44, :cond_3

    invoke-virtual/range {v44 .. v44}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object v29

    goto :goto_1c

    :cond_3
    const/16 v29, 0x0

    :goto_1c
    move-object/from16 v44, v46

    check-cast v44, Lcom/discord/primitives/ChannelId;

    move-object/from16 v45, v3

    check-cast v45, Lcom/discord/primitives/GuildId;

    move-object/from16 v46, v50

    check-cast v46, Lcom/discord/chat/bridge/MessageState;

    check-cast v47, Lcom/discord/primitives/UserId;

    move-object/from16 v50, v39

    check-cast v50, Ljava/lang/String;

    check-cast v51, Ljava/lang/Float;

    move-object/from16 v52, v62

    check-cast v52, Ljava/lang/String;

    check-cast v53, Ljava/lang/String;

    move-object/from16 v54, v36

    check-cast v54, Ljava/lang/Integer;

    move-object/from16 v55, v21

    check-cast v55, Ljava/lang/Integer;

    move-object/from16 v58, v22

    check-cast v58, Ljava/lang/Integer;

    move-object/from16 v59, v18

    check-cast v59, Ljava/lang/String;

    move-object/from16 v60, v4

    check-cast v60, Ljava/lang/String;

    move-object/from16 v61, v43

    check-cast v61, Ljava/util/List;

    move-object/from16 v62, v81

    check-cast v62, Ljava/util/List;

    move-object/from16 v63, v83

    check-cast v63, Ljava/lang/Float;

    move-object/from16 v64, v33

    check-cast v64, Lcom/discord/chat/bridge/structurabletext/StructurableText;

    move-object/from16 v65, v78

    check-cast v65, Ljava/util/List;

    move-object/from16 v66, v32

    check-cast v66, Ljava/util/List;

    move-object/from16 v67, v37

    check-cast v67, Ljava/lang/Boolean;

    move-object/from16 v68, v48

    check-cast v68, Ljava/util/List;

    move-object/from16 v69, v49

    check-cast v69, Ljava/util/List;

    move-object/from16 v70, v40

    check-cast v70, Lcom/discord/chat/bridge/roleicons/RoleIcon;

    move-object/from16 v71, v41

    check-cast v71, Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;

    move-object/from16 v72, v42

    check-cast v72, Lcom/discord/chat/bridge/threads/ThreadEmbed;

    move-object/from16 v74, v17

    check-cast v74, Ljava/lang/Boolean;

    move-object/from16 v75, v5

    check-cast v75, Ljava/lang/Boolean;

    move-object/from16 v76, v6

    check-cast v76, Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;

    move-object/from16 v77, v56

    check-cast v77, Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;

    move-object/from16 v78, v34

    check-cast v78, Ljava/util/List;

    check-cast v79, Ljava/lang/String;

    move-object/from16 v80, v7

    check-cast v80, Ljava/lang/Boolean;

    move-object/from16 v81, v8

    check-cast v81, Ljava/lang/String;

    move-object/from16 v82, v9

    check-cast v82, Ljava/lang/Boolean;

    move-object/from16 v83, v10

    check-cast v83, Ljava/lang/Integer;

    move-object/from16 v84, v11

    check-cast v84, Ljava/lang/String;

    move-object/from16 v85, v12

    check-cast v85, Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;

    move-object/from16 v86, v13

    check-cast v86, Lcom/discord/chat/bridge/feedback/SurveyIndication;

    move-object/from16 v87, v14

    check-cast v87, Lcom/discord/chat/bridge/interaction/InteractionStatus;

    move-object/from16 v88, v35

    check-cast v88, Ljava/lang/Boolean;

    move-object/from16 v89, v16

    check-cast v89, Ljava/lang/Boolean;

    move-object/from16 v90, v19

    check-cast v90, Ljava/lang/Boolean;

    move-object/from16 v91, v20

    check-cast v91, Ljava/lang/String;

    move-object/from16 v92, v23

    check-cast v92, Ljava/lang/String;

    move-object/from16 v93, v24

    check-cast v93, Ljava/util/List;

    check-cast v94, Ljava/lang/Boolean;

    check-cast v95, Ljava/lang/Boolean;

    check-cast v96, Ljava/lang/Long;

    move-object/from16 v97, v38

    check-cast v97, Lcom/discord/chat/bridge/sticker/Sticker;

    check-cast v98, Ljava/lang/String;

    move-object/from16 v99, v25

    check-cast v99, Ljava/lang/String;

    move-object/from16 v100, v26

    check-cast v100, Ljava/lang/Boolean;

    move-object/from16 v101, v27

    check-cast v101, Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;

    move-object/from16 v103, v28

    check-cast v103, Lcom/discord/chat/bridge/forums/ForumPostActions;

    move-object/from16 v104, v30

    check-cast v104, Lcom/discord/chat/bridge/automod/AutoModerationContext;

    move-object/from16 v105, v31

    check-cast v105, Ljava/util/List;

    move-object/from16 v106, v73

    check-cast v106, Lcom/discord/chat/bridge/gift/GiftEmbed;

    move-object/from16 v107, v15

    check-cast v107, Ljava/lang/Integer;

    move-object/from16 v108, v102

    check-cast v108, Ljava/lang/String;

    const/16 v109, 0x0

    const/16 v110, 0x0

    move-object/from16 v37, v0

    move/from16 v38, v111

    move/from16 v39, v112

    move/from16 v40, v113

    move-object/from16 v41, v1

    move-object/from16 v42, v2

    move-object/from16 v43, v29

    move-wide/from16 v48, v114

    move/from16 v56, v116

    move/from16 v73, v117

    move/from16 v102, v118

    invoke-direct/range {v37 .. v110}, Lcom/discord/chat/bridge/Message;-><init>(IIILcom/discord/chat/bridge/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Lcom/discord/primitives/GuildId;Lcom/discord/chat/bridge/MessageState;Lcom/discord/primitives/UserId;JLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Float;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/discord/chat/bridge/roleicons/RoleIcon;Lcom/discord/chat/bridge/connectionsroletag/ConnectionsRoleTag;Lcom/discord/chat/bridge/threads/ThreadEmbed;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lcom/discord/chat/bridge/feedback/SurveyIndication;Lcom/discord/chat/bridge/interaction/InteractionStatus;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/activityinviteembed/ActivityInviteEmbed;ZLcom/discord/chat/bridge/forums/ForumPostActions;Lcom/discord/chat/bridge/automod/AutoModerationContext;Ljava/util/List;Lcom/discord/chat/bridge/gift/GiftEmbed;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
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
    invoke-virtual {p0, p1}, Lcom/discord/chat/bridge/Message$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/Message;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/chat/bridge/Message$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/Message;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/chat/bridge/Message$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/chat/bridge/Message;->write$Self(Lcom/discord/chat/bridge/Message;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/chat/bridge/Message;

    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/bridge/Message$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/Message;)V

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

    invoke-static {p0}, Lzi/f0$a;->a(Lzi/f0;)[Lkotlinx/serialization/KSerializer;

    move-result-object v0

    return-object v0
.end method
