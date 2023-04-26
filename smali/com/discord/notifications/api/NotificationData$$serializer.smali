.class public final Lcom/discord/notifications/api/NotificationData$$serializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzi/f0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/notifications/api/NotificationData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "$serializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzi/f0<",
        "Lcom/discord/notifications/api/NotificationData;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015"
    }
    d2 = {
        "com/discord/notifications/api/NotificationData.$serializer",
        "Lzi/f0;",
        "Lcom/discord/notifications/api/NotificationData;",
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
        "notification_api_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/notifications/api/NotificationData$$serializer;

.field private static final synthetic descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/discord/notifications/api/NotificationData$$serializer;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/discord/notifications/api/NotificationData$$serializer;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/discord/notifications/api/NotificationData$$serializer;->INSTANCE:Lcom/discord/notifications/api/NotificationData$$serializer;

    .line 7
    .line 8
    new-instance v1, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 9
    .line 10
    const-string v2, "com.discord.notifications.api.NotificationData"

    .line 11
    .line 12
    const/16 v3, 0x2a

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
    const-string v0, "message_id"

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v0, "message_activity_type"

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    const-string v0, "message_application_name"

    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const-string v0, "message_type_"

    .line 40
    .line 41
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v0, "message_content"

    .line 45
    .line 46
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "message_flags"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "channel_type"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "channel_name"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "channel_id"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "channel_icon"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "parent_name"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const-string v0, "parent_id"

    .line 80
    .line 81
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    const-string v0, "rtc_region"

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 87
    .line 88
    .line 89
    const-string v0, "channel_ids"

    .line 90
    .line 91
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 92
    .line 93
    .line 94
    const-string v0, "user_id"

    .line 95
    .line 96
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 97
    .line 98
    .line 99
    const-string v0, "user_username"

    .line 100
    .line 101
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    const-string v0, "user_discriminator"

    .line 105
    .line 106
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 107
    .line 108
    .line 109
    const-string v0, "user_avatar"

    .line 110
    .line 111
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    const-string v0, "user_guild_avatar"

    .line 115
    .line 116
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    const-string v0, "rel_type"

    .line 120
    .line 121
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    const-string v0, "guild_id"

    .line 125
    .line 126
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    const-string v0, "guild_name"

    .line 130
    .line 131
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 132
    .line 133
    .line 134
    const-string v0, "guild_icon"

    .line 135
    .line 136
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    const-string v0, "activity_type"

    .line 140
    .line 141
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 142
    .line 143
    .line 144
    const-string v0, "activity_name"

    .line 145
    .line 146
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 147
    .line 148
    .line 149
    const-string v0, "application_id"

    .line 150
    .line 151
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 152
    .line 153
    .line 154
    const-string v0, "application_name"

    .line 155
    .line 156
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    const-string v0, "application_icon"

    .line 160
    .line 161
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 162
    .line 163
    .line 164
    const-string v0, "message"

    .line 165
    .line 166
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 167
    .line 168
    .line 169
    const-string v0, "stage_instance_topic"

    .line 170
    .line 171
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 172
    .line 173
    .line 174
    const-string v0, "guild_scheduled_event_entity_type"

    .line 175
    .line 176
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    const-string v0, "__category"

    .line 180
    .line 181
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 182
    .line 183
    .line 184
    const-string v0, "is_from_current_user"

    .line 185
    .line 186
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    const-string v0, "title"

    .line 190
    .line 191
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    const-string v0, "subtitle"

    .line 195
    .line 196
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 197
    .line 198
    .line 199
    const-string v0, "icon_url"

    .line 200
    .line 201
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 202
    .line 203
    .line 204
    const-string v0, "notification_channel"

    .line 205
    .line 206
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 207
    .line 208
    .line 209
    const-string v0, "tracking_type"

    .line 210
    .line 211
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    const-string v0, "deeplink"

    .line 215
    .line 216
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 217
    .line 218
    .line 219
    const-string v0, "expand_subtitle"

    .line 220
    .line 221
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 222
    .line 223
    .line 224
    const-string v0, "image_url"

    .line 225
    .line 226
    invoke-virtual {v1, v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;->l(Ljava/lang/String;Z)V

    .line 227
    .line 228
    .line 229
    sput-object v1, Lcom/discord/notifications/api/NotificationData$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    .line 230
    .line 231
    return-void
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
    const/16 v0, 0x2a

    .line 2
    .line 3
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    .line 4
    .line 5
    sget-object v1, Lzi/a2;->a:Lzi/a2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    aput-object v1, v0, v2

    .line 9
    .line 10
    sget-object v2, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    .line 11
    .line 12
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    const/4 v3, 0x1

    .line 17
    aput-object v2, v0, v3

    .line 18
    .line 19
    sget-object v2, Lzi/m0;->a:Lzi/m0;

    .line 20
    .line 21
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x2

    .line 26
    aput-object v3, v0, v4

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    aput-object v4, v0, v3

    .line 34
    .line 35
    const/4 v3, 0x4

    .line 36
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    aput-object v4, v0, v3

    .line 41
    .line 42
    const/4 v3, 0x5

    .line 43
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    aput-object v4, v0, v3

    .line 48
    .line 49
    sget-object v3, Lzi/w0;->a:Lzi/w0;

    .line 50
    .line 51
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const/4 v4, 0x6

    .line 56
    aput-object v3, v0, v4

    .line 57
    .line 58
    const/4 v3, 0x7

    .line 59
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    aput-object v4, v0, v3

    .line 64
    .line 65
    const/16 v3, 0x8

    .line 66
    .line 67
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    aput-object v4, v0, v3

    .line 72
    .line 73
    sget-object v3, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    .line 74
    .line 75
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const/16 v5, 0x9

    .line 80
    .line 81
    aput-object v4, v0, v5

    .line 82
    .line 83
    const/16 v4, 0xa

    .line 84
    .line 85
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    aput-object v5, v0, v4

    .line 90
    .line 91
    const/16 v4, 0xb

    .line 92
    .line 93
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    aput-object v5, v0, v4

    .line 98
    .line 99
    const/16 v4, 0xc

    .line 100
    .line 101
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    aput-object v3, v0, v4

    .line 106
    .line 107
    const/16 v3, 0xd

    .line 108
    .line 109
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    aput-object v4, v0, v3

    .line 114
    .line 115
    const/16 v3, 0xe

    .line 116
    .line 117
    sget-object v4, Lcom/discord/notifications/api/ChannelListSerializer;->INSTANCE:Lcom/discord/notifications/api/ChannelListSerializer;

    .line 118
    .line 119
    aput-object v4, v0, v3

    .line 120
    .line 121
    sget-object v3, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    .line 122
    .line 123
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    const/16 v4, 0xf

    .line 128
    .line 129
    aput-object v3, v0, v4

    .line 130
    .line 131
    const/16 v3, 0x10

    .line 132
    .line 133
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    aput-object v4, v0, v3

    .line 138
    .line 139
    const/16 v3, 0x11

    .line 140
    .line 141
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    aput-object v4, v0, v3

    .line 146
    .line 147
    const/16 v3, 0x12

    .line 148
    .line 149
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    aput-object v4, v0, v3

    .line 154
    .line 155
    const/16 v3, 0x13

    .line 156
    .line 157
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    aput-object v4, v0, v3

    .line 162
    .line 163
    const/16 v3, 0x14

    .line 164
    .line 165
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    aput-object v4, v0, v3

    .line 170
    .line 171
    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    .line 172
    .line 173
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    const/16 v4, 0x15

    .line 178
    .line 179
    aput-object v3, v0, v4

    .line 180
    .line 181
    const/16 v3, 0x16

    .line 182
    .line 183
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    aput-object v4, v0, v3

    .line 188
    .line 189
    const/16 v3, 0x17

    .line 190
    .line 191
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    aput-object v4, v0, v3

    .line 196
    .line 197
    const/16 v3, 0x18

    .line 198
    .line 199
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    aput-object v4, v0, v3

    .line 204
    .line 205
    const/16 v3, 0x19

    .line 206
    .line 207
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    aput-object v4, v0, v3

    .line 212
    .line 213
    sget-object v3, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    .line 214
    .line 215
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const/16 v4, 0x1a

    .line 220
    .line 221
    aput-object v3, v0, v4

    .line 222
    .line 223
    const/16 v3, 0x1b

    .line 224
    .line 225
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    aput-object v4, v0, v3

    .line 230
    .line 231
    const/16 v3, 0x1c

    .line 232
    .line 233
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    aput-object v4, v0, v3

    .line 238
    .line 239
    sget-object v3, Lcom/discord/notifications/api/NotificationMessageSerializer;->INSTANCE:Lcom/discord/notifications/api/NotificationMessageSerializer;

    .line 240
    .line 241
    invoke-static {v3}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    const/16 v4, 0x1d

    .line 246
    .line 247
    aput-object v3, v0, v4

    .line 248
    .line 249
    const/16 v3, 0x1e

    .line 250
    .line 251
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    aput-object v4, v0, v3

    .line 256
    .line 257
    const/16 v3, 0x1f

    .line 258
    .line 259
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    aput-object v2, v0, v3

    .line 264
    .line 265
    const/16 v2, 0x20

    .line 266
    .line 267
    sget-object v3, Lcom/discord/notifications/api/CanReplySerializer;->INSTANCE:Lcom/discord/notifications/api/CanReplySerializer;

    .line 268
    .line 269
    aput-object v3, v0, v2

    .line 270
    .line 271
    sget-object v2, Lzi/h;->a:Lzi/h;

    .line 272
    .line 273
    const/16 v3, 0x21

    .line 274
    .line 275
    aput-object v2, v0, v3

    .line 276
    .line 277
    const/16 v3, 0x22

    .line 278
    .line 279
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    aput-object v4, v0, v3

    .line 284
    .line 285
    const/16 v3, 0x23

    .line 286
    .line 287
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    aput-object v4, v0, v3

    .line 292
    .line 293
    const/16 v3, 0x24

    .line 294
    .line 295
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    aput-object v4, v0, v3

    .line 300
    .line 301
    const/16 v3, 0x25

    .line 302
    .line 303
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    aput-object v4, v0, v3

    .line 308
    .line 309
    const/16 v3, 0x26

    .line 310
    .line 311
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    aput-object v4, v0, v3

    .line 316
    .line 317
    const/16 v3, 0x27

    .line 318
    .line 319
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    aput-object v4, v0, v3

    .line 324
    .line 325
    const/16 v3, 0x28

    .line 326
    .line 327
    invoke-static {v2}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    aput-object v2, v0, v3

    .line 332
    .line 333
    const/16 v2, 0x29

    .line 334
    .line 335
    invoke-static {v1}, Lxi/a;->u(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    aput-object v1, v0, v2

    .line 340
    .line 341
    return-object v0
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
.end method

.method public deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/notifications/api/NotificationData;
    .locals 72

    move-object/from16 v0, p1

    const-string v1, "decoder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/discord/notifications/api/NotificationData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/Decoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/c;

    move-result-object v0

    invoke-interface {v0}, Lkotlinx/serialization/encoding/c;->p()Z

    move-result v2

    const/16 v12, 0x9

    const/4 v13, 0x7

    const/4 v14, 0x6

    const/4 v15, 0x5

    const/4 v3, 0x3

    const/16 v5, 0x8

    const/4 v4, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    invoke-interface {v0, v1, v7, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lzi/m0;->a:Lzi/m0;

    invoke-interface {v0, v1, v6, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v3, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v1, v4, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v1, v15, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    sget-object v11, Lzi/w0;->a:Lzi/w0;

    invoke-interface {v0, v1, v14, v11, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v0, v1, v13, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v0, v1, v5, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v14, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    invoke-interface {v0, v1, v12, v14, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v26, v2

    const/16 v2, 0xa

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v24, v2

    const/16 v2, 0xc

    invoke-interface {v0, v1, v2, v14, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v14, 0xd

    invoke-interface {v0, v1, v14, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v22, v2

    sget-object v2, Lcom/discord/notifications/api/ChannelListSerializer;->INSTANCE:Lcom/discord/notifications/api/ChannelListSerializer;

    move-object/from16 v23, v3

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v2, v9}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    move-object/from16 v21, v2

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v3, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v2

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    const/16 v2, 0x12

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 p1, v2

    const/16 v2, 0x14

    invoke-interface {v0, v1, v2, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v20, v2

    const/16 v2, 0x15

    move-object/from16 v27, v3

    sget-object v3, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    invoke-interface {v0, v1, v2, v3, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x16

    invoke-interface {v0, v1, v3, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v28, v2

    const/16 v2, 0x17

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v29, v2

    const/16 v2, 0x18

    invoke-interface {v0, v1, v2, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v2

    const/16 v2, 0x19

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v31, v2

    const/16 v2, 0x1a

    move-object/from16 v32, v3

    sget-object v3, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    invoke-interface {v0, v1, v2, v3, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x1b

    invoke-interface {v0, v1, v3, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v33, v2

    const/16 v2, 0x1c

    invoke-interface {v0, v1, v2, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v34, v2

    const/16 v2, 0x1d

    move-object/from16 v35, v3

    sget-object v3, Lcom/discord/notifications/api/NotificationMessageSerializer;->INSTANCE:Lcom/discord/notifications/api/NotificationMessageSerializer;

    invoke-interface {v0, v1, v2, v3, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x1e

    invoke-interface {v0, v1, v3, v10, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v36, v2

    const/16 v2, 0x1f

    invoke-interface {v0, v1, v2, v8, v9}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v8, Lcom/discord/notifications/api/CanReplySerializer;->INSTANCE:Lcom/discord/notifications/api/CanReplySerializer;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v38, v2

    const/16 v2, 0x20

    invoke-interface {v0, v1, v2, v8, v9}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/16 v8, 0x21

    invoke-interface {v0, v1, v8}, Lkotlinx/serialization/encoding/c;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v8

    const/16 v9, 0x22

    move/from16 v17, v8

    const/4 v8, 0x0

    invoke-interface {v0, v1, v9, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move/from16 v37, v2

    const/16 v2, 0x23

    invoke-interface {v0, v1, v2, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v39, v2

    const/16 v2, 0x24

    invoke-interface {v0, v1, v2, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v40, v2

    const/16 v2, 0x25

    invoke-interface {v0, v1, v2, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v41, v2

    const/16 v2, 0x26

    invoke-interface {v0, v1, v2, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v42, v2

    const/16 v2, 0x27

    invoke-interface {v0, v1, v2, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v43, v2

    const/16 v2, 0x28

    move-object/from16 v44, v3

    sget-object v3, Lzi/h;->a:Lzi/h;

    invoke-interface {v0, v1, v2, v3, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x29

    invoke-interface {v0, v1, v3, v10, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/16 v10, 0x3ff

    const/16 v45, -0x1

    move-object/from16 v47, v3

    move-object/from16 v48, v9

    move/from16 v61, v10

    move/from16 v63, v17

    move-object/from16 v46, v20

    move-object/from16 v3, v22

    move-object/from16 v50, v28

    move-object/from16 v52, v29

    move-object/from16 v53, v30

    move-object/from16 v59, v31

    move-object/from16 v51, v32

    move-object/from16 v60, v33

    move-object/from16 v68, v34

    move-object/from16 v66, v35

    move-object/from16 v69, v36

    move/from16 v62, v37

    move-object/from16 v8, v38

    move-object/from16 v70, v39

    move-object/from16 v9, v40

    move-object/from16 v10, v41

    move/from16 v58, v45

    move-object/from16 v29, v4

    move-object/from16 v33, v5

    move-object/from16 v31, v11

    move-object/from16 v34, v12

    move-object/from16 v32, v13

    move-object/from16 v28, v14

    move-object/from16 v5, v19

    move-object/from16 v4, v21

    move-object/from16 v14, v26

    move-object/from16 v30, v27

    move-object/from16 v12, v42

    move-object/from16 v13, v43

    move-object/from16 v11, p1

    move-object/from16 v27, v6

    move-object/from16 v19, v15

    move-object/from16 v6, v18

    move-object v15, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v24

    move-object/from16 v71, v16

    move-object/from16 v16, v7

    move-object/from16 v7, v71

    goto/16 :goto_19

    :cond_0
    move v2, v8

    move-object v8, v9

    move v9, v2

    move v14, v9

    move/from16 v41, v14

    move/from16 v58, v41

    move/from16 v67, v7

    move-object v2, v8

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v10, v7

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v36, v15

    move-object/from16 v38, v36

    move-object/from16 v39, v38

    move-object/from16 v40, v39

    move-object/from16 v42, v40

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

    move-object/from16 v59, v57

    move-object/from16 v60, v59

    move-object/from16 v61, v60

    move-object/from16 v62, v61

    move-object/from16 v63, v62

    move-object/from16 v64, v63

    move-object/from16 v65, v64

    move-object/from16 v66, v65

    :goto_0
    if-eqz v67, :cond_1

    move-object/from16 v68, v10

    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->o(Lkotlinx/serialization/descriptors/SerialDescriptor;)I

    move-result v10

    packed-switch v10, :pswitch_data_0

    new-instance v0, Lwi/n;

    invoke-direct {v0, v10}, Lwi/n;-><init>(I)V

    throw v0

    :pswitch_0
    const/16 v10, 0x29

    move-object/from16 v69, v11

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v5}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    or-int/lit16 v9, v9, 0x200

    goto :goto_1

    :pswitch_1
    move-object/from16 v69, v11

    const/16 v10, 0x28

    sget-object v11, Lzi/h;->a:Lzi/h;

    invoke-interface {v0, v1, v10, v11, v15}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    or-int/lit16 v9, v9, 0x100

    goto :goto_1

    :pswitch_2
    move-object/from16 v69, v11

    const/16 v10, 0x27

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v4}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v9, v9, 0x80

    goto :goto_1

    :pswitch_3
    move-object/from16 v69, v11

    const/16 v10, 0x26

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit8 v9, v9, 0x40

    goto :goto_1

    :pswitch_4
    move-object/from16 v69, v11

    const/16 v10, 0x25

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v6}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    or-int/lit8 v9, v9, 0x20

    goto :goto_1

    :pswitch_5
    move-object/from16 v69, v11

    const/16 v10, 0x24

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v7}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    or-int/lit8 v9, v9, 0x10

    goto :goto_1

    :pswitch_6
    move-object/from16 v69, v11

    const/16 v10, 0x23

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit8 v9, v9, 0x8

    goto :goto_1

    :pswitch_7
    move-object/from16 v69, v11

    const/16 v10, 0x22

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v12}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    or-int/lit8 v9, v9, 0x4

    :goto_1
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v70, v2

    goto/16 :goto_5

    :pswitch_8
    move-object/from16 v69, v11

    const/16 v10, 0x21

    invoke-interface {v0, v1, v10}, Lkotlinx/serialization/encoding/c;->C(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v58

    or-int/lit8 v9, v9, 0x2

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v70, v2

    goto :goto_4

    :pswitch_9
    move-object/from16 v69, v11

    sget-object v10, Lcom/discord/notifications/api/CanReplySerializer;->INSTANCE:Lcom/discord/notifications/api/CanReplySerializer;

    invoke-static/range {v41 .. v41}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    move-object/from16 v70, v2

    const/16 v2, 0x20

    invoke-interface {v0, v1, v2, v10, v11}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v41

    or-int/lit8 v9, v9, 0x1

    goto :goto_3

    :pswitch_a
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    const/16 v2, 0x20

    const/16 v10, 0x1f

    sget-object v11, Lzi/m0;->a:Lzi/m0;

    invoke-interface {v0, v1, v10, v11, v8}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const/high16 v10, -0x80000000

    goto :goto_2

    :pswitch_b
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    const/16 v2, 0x20

    const/16 v10, 0x1e

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    invoke-interface {v0, v1, v10, v11, v13}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    const/high16 v10, 0x40000000    # 2.0f

    :goto_2
    or-int/2addr v14, v10

    :goto_3
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto/16 :goto_5

    :pswitch_c
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    const/16 v2, 0x20

    const/16 v10, 0x1d

    sget-object v11, Lcom/discord/notifications/api/NotificationMessageSerializer;->INSTANCE:Lcom/discord/notifications/api/NotificationMessageSerializer;

    move-object/from16 v2, v69

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    const/high16 v2, 0x20000000

    or-int/2addr v14, v2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_4
    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v16, v47

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    goto/16 :goto_7

    :pswitch_d
    move-object/from16 v70, v2

    move-object v2, v11

    const/16 v10, 0x1c

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v69, v2

    move-object/from16 v2, v68

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/high16 v2, 0x10000000

    or-int/2addr v14, v2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v68, v10

    goto/16 :goto_5

    :pswitch_e
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v68

    const/16 v10, 0x1b

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v66

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x8000000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v66, v2

    goto/16 :goto_5

    :pswitch_f
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v66

    const/16 v10, 0x1a

    sget-object v11, Lcom/discord/primitives/ApplicationId$$serializer;->INSTANCE:Lcom/discord/primitives/ApplicationId$$serializer;

    move-object/from16 v2, v60

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x4000000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v60, v2

    goto/16 :goto_5

    :pswitch_10
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v60

    const/16 v10, 0x19

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v59

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x2000000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v59, v2

    goto :goto_5

    :pswitch_11
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v59

    const/16 v10, 0x18

    sget-object v11, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v2, v53

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x1000000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v53, v2

    goto :goto_5

    :pswitch_12
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v53

    const/16 v10, 0x17

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v52

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x800000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v52, v2

    goto :goto_5

    :pswitch_13
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v52

    const/16 v10, 0x16

    sget-object v11, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v2, v51

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x400000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v51, v2

    goto :goto_5

    :pswitch_14
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v51

    const/16 v10, 0x15

    sget-object v11, Lcom/discord/primitives/GuildId$$serializer;->INSTANCE:Lcom/discord/primitives/GuildId$$serializer;

    move-object/from16 v2, v50

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x200000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v50, v2

    :goto_5
    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v16, v47

    goto :goto_6

    :pswitch_15
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v50

    const/16 v10, 0x14

    sget-object v11, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v2, v47

    invoke-interface {v0, v1, v10, v11, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x100000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v16, v2

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    :goto_6
    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v11, v69

    :goto_7
    const/4 v2, 0x1

    goto :goto_8

    :pswitch_16
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v2, v47

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v11, v46

    move-object/from16 v46, v2

    const/16 v2, 0x13

    invoke-interface {v0, v1, v2, v10, v11}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/high16 v11, 0x80000

    or-int/2addr v14, v11

    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v11, v69

    const/4 v2, 0x1

    move-object/from16 v46, v10

    :goto_8
    const/4 v10, 0x0

    goto/16 :goto_18

    :pswitch_17
    move-object/from16 v70, v2

    move-object/from16 v69, v11

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    const/16 v2, 0x13

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v16, v3

    move-object/from16 v2, v45

    const/16 v3, 0x12

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v10, 0x40000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v18, v2

    move-object/from16 v3, v16

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    goto :goto_a

    :pswitch_18
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v2, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    const/16 v3, 0x12

    sget-object v10, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v18, v2

    move-object/from16 v3, v44

    const/16 v2, 0x11

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/high16 v10, 0x20000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v19, v3

    goto :goto_9

    :pswitch_19
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v3, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    const/16 v2, 0x11

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v19, v3

    move-object/from16 v2, v49

    const/16 v3, 0x10

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v49

    const/high16 v2, 0x10000

    or-int/2addr v14, v2

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_9
    move-object/from16 v3, v16

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    :goto_a
    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    goto/16 :goto_d

    :pswitch_1a
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v2, v49

    const/16 v3, 0x10

    sget-object v10, Lcom/discord/primitives/UserId$$serializer;->INSTANCE:Lcom/discord/primitives/UserId$$serializer;

    move-object/from16 v20, v2

    move-object/from16 v3, v43

    const/16 v2, 0xf

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const v10, 0x8000

    or-int/2addr v14, v10

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v21, v3

    move-object/from16 v3, v16

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    goto :goto_c

    :pswitch_1b
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v3, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    const/16 v2, 0xf

    sget-object v10, Lcom/discord/notifications/api/ChannelListSerializer;->INSTANCE:Lcom/discord/notifications/api/ChannelListSerializer;

    move-object/from16 v21, v3

    move-object/from16 v2, v42

    const/16 v3, 0xe

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->y(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x4000

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v22, v2

    goto :goto_b

    :pswitch_1c
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v2, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    const/16 v3, 0xe

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v22, v2

    move-object/from16 v3, v64

    const/16 v2, 0xd

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v64

    or-int/lit16 v14, v14, 0x2000

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_b
    move-object/from16 v3, v16

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    :goto_c
    move-object/from16 v16, v46

    move-object/from16 v28, v48

    :goto_d
    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    goto/16 :goto_14

    :pswitch_1d
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v3, v64

    const/16 v2, 0xd

    sget-object v10, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    move-object/from16 v23, v3

    move-object/from16 v2, v40

    const/16 v3, 0xc

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    or-int/lit16 v14, v14, 0x1000

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v24, v2

    move-object/from16 v3, v16

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    goto/16 :goto_f

    :pswitch_1e
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v2, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v23, v64

    const/16 v3, 0xc

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v24, v2

    move-object/from16 v3, v39

    const/16 v2, 0xb

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    or-int/lit16 v14, v14, 0x800

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v25, v3

    move-object/from16 v3, v16

    move-object/from16 v35, v38

    goto/16 :goto_f

    :pswitch_1f
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v3, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v23, v64

    const/16 v2, 0xb

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v25, v3

    move-object/from16 v2, v38

    const/16 v3, 0xa

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    or-int/lit16 v14, v14, 0x400

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v35, v10

    goto :goto_e

    :pswitch_20
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v2, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v23, v64

    const/16 v3, 0xa

    sget-object v10, Lcom/discord/primitives/ChannelId$$serializer;->INSTANCE:Lcom/discord/primitives/ChannelId$$serializer;

    move-object/from16 v35, v2

    move-object/from16 v3, v62

    const/16 v2, 0x9

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v62

    or-int/lit16 v14, v14, 0x200

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    :goto_e
    move-object/from16 v3, v16

    :goto_f
    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    goto/16 :goto_11

    :pswitch_21
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v3, v62

    move-object/from16 v23, v64

    const/16 v2, 0x9

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v34, v3

    move-object/from16 v2, v55

    const/16 v3, 0x8

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v55

    or-int/lit16 v14, v14, 0x100

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    goto :goto_10

    :pswitch_22
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v2, v55

    move-object/from16 v34, v62

    move-object/from16 v23, v64

    const/16 v3, 0x8

    sget-object v10, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v33, v2

    move-object/from16 v3, v63

    const/4 v2, 0x7

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v63

    or-int/lit16 v14, v14, 0x80

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v29, v54

    :goto_10
    move-object/from16 v27, v56

    move-object/from16 v31, v61

    :goto_11
    move-object/from16 v32, v63

    goto/16 :goto_14

    :pswitch_23
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v33, v55

    move-object/from16 v34, v62

    move-object/from16 v3, v63

    move-object/from16 v23, v64

    const/4 v2, 0x7

    sget-object v10, Lzi/w0;->a:Lzi/w0;

    move-object/from16 v32, v3

    move-object/from16 v2, v61

    const/4 v3, 0x6

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v61

    or-int/lit8 v14, v14, 0x40

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v29, v54

    move-object/from16 v27, v56

    move-object/from16 v31, v61

    goto/16 :goto_14

    :pswitch_24
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v33, v55

    move-object/from16 v2, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    const/4 v3, 0x6

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v31, v2

    move-object/from16 v3, v65

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v65

    or-int/lit8 v14, v14, 0x20

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    goto :goto_12

    :pswitch_25
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v33, v55

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v3, v65

    const/4 v2, 0x5

    sget-object v10, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v30, v3

    move-object/from16 v2, v54

    const/4 v3, 0x4

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v54

    or-int/lit8 v14, v14, 0x10

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v65, v30

    :goto_12
    move-object/from16 v16, v46

    move-object/from16 v28, v48

    move-object/from16 v29, v54

    goto/16 :goto_13

    :pswitch_26
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v20, v49

    move-object/from16 v2, v54

    move-object/from16 v33, v55

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    const/4 v3, 0x4

    sget-object v10, Lzi/a2;->a:Lzi/a2;

    move-object/from16 v29, v2

    move-object/from16 v3, v48

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v48

    or-int/lit8 v14, v14, 0x8

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    move-object/from16 v28, v48

    goto :goto_13

    :pswitch_27
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v3, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    const/4 v2, 0x3

    sget-object v10, Lzi/m0;->a:Lzi/m0;

    move-object/from16 v28, v3

    move-object/from16 v2, v56

    const/4 v3, 0x2

    invoke-interface {v0, v1, v3, v10, v2}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v56

    or-int/lit8 v14, v14, 0x4

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    :goto_13
    move-object/from16 v27, v56

    :goto_14
    const/4 v2, 0x1

    goto :goto_15

    :pswitch_28
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v2, v56

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    const/4 v3, 0x2

    sget-object v10, Lcom/discord/primitives/MessageId$$serializer;->INSTANCE:Lcom/discord/primitives/MessageId$$serializer;

    move-object/from16 v27, v2

    move-object/from16 v3, v57

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2, v10, v3}, Lkotlinx/serialization/encoding/c;->n(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/DeserializationStrategy;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v57

    or-int/lit8 v14, v14, 0x2

    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v16, v46

    :goto_15
    const/4 v10, 0x0

    goto/16 :goto_17

    :pswitch_29
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v3, v57

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    const/4 v2, 0x1

    const/4 v10, 0x0

    invoke-interface {v0, v1, v10}, Lkotlinx/serialization/encoding/c;->m(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/String;

    move-result-object v26

    or-int/lit8 v14, v14, 0x1

    sget-object v36, Lkotlin/Unit;->a:Lkotlin/Unit;

    move-object/from16 v3, v16

    move-object/from16 v36, v26

    goto :goto_16

    :pswitch_2a
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v3, v57

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    const/4 v2, 0x1

    const/4 v10, 0x0

    sget-object v26, Lkotlin/Unit;->a:Lkotlin/Unit;

    move/from16 v67, v10

    move-object/from16 v3, v16

    :goto_16
    move-object/from16 v16, v46

    :goto_17
    move-object/from16 v46, v11

    move-object/from16 v11, v69

    :goto_18
    move-object/from16 v47, v16

    move-object/from16 v45, v18

    move-object/from16 v44, v19

    move-object/from16 v49, v20

    move-object/from16 v43, v21

    move-object/from16 v42, v22

    move-object/from16 v64, v23

    move-object/from16 v40, v24

    move-object/from16 v39, v25

    move-object/from16 v56, v27

    move-object/from16 v48, v28

    move-object/from16 v54, v29

    move-object/from16 v61, v31

    move-object/from16 v63, v32

    move-object/from16 v55, v33

    move-object/from16 v62, v34

    move-object/from16 v38, v35

    move-object/from16 v10, v68

    move-object/from16 v2, v70

    goto/16 :goto_0

    :cond_1
    move-object/from16 v70, v2

    move-object/from16 v16, v3

    move-object/from16 v68, v10

    move-object/from16 v69, v11

    move-object/from16 v35, v38

    move-object/from16 v25, v39

    move-object/from16 v24, v40

    move-object/from16 v22, v42

    move-object/from16 v21, v43

    move-object/from16 v19, v44

    move-object/from16 v18, v45

    move-object/from16 v11, v46

    move-object/from16 v46, v47

    move-object/from16 v28, v48

    move-object/from16 v20, v49

    move-object/from16 v29, v54

    move-object/from16 v33, v55

    move-object/from16 v27, v56

    move-object/from16 v3, v57

    move-object/from16 v31, v61

    move-object/from16 v34, v62

    move-object/from16 v32, v63

    move-object/from16 v23, v64

    move-object/from16 v30, v65

    move-object/from16 v47, v5

    move-object v10, v6

    move/from16 v61, v9

    move-object/from16 v48, v12

    move-object/from16 v44, v13

    move-object/from16 v12, v16

    move-object/from16 v6, v19

    move-object/from16 v5, v21

    move-object/from16 v19, v30

    move-object/from16 v2, v35

    move/from16 v62, v41

    move/from16 v63, v58

    move-object/from16 v16, v3

    move-object v13, v4

    move-object v9, v7

    move/from16 v58, v14

    move-object/from16 v7, v18

    move-object/from16 v30, v20

    move-object/from16 v4, v22

    move-object/from16 v3, v24

    move-object/from16 v14, v36

    move-object/from16 v71, v28

    move-object/from16 v28, v23

    move-object/from16 v23, v71

    :goto_19
    invoke-interface {v0, v1}, Lkotlinx/serialization/encoding/c;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    new-instance v0, Lcom/discord/notifications/api/NotificationData;

    check-cast v16, Lcom/discord/primitives/MessageId;

    if-eqz v16, :cond_2

    invoke-virtual/range {v16 .. v16}, Lcom/discord/primitives/MessageId;->unbox-impl()Ljava/lang/String;

    move-result-object v1

    goto :goto_1a

    :cond_2
    const/4 v1, 0x0

    :goto_1a
    move-object/from16 v16, v27

    check-cast v16, Ljava/lang/Integer;

    move-object/from16 v17, v23

    check-cast v17, Ljava/lang/String;

    move-object/from16 v18, v29

    check-cast v18, Ljava/lang/Integer;

    check-cast v19, Ljava/lang/String;

    move-object/from16 v20, v31

    check-cast v20, Ljava/lang/Long;

    move-object/from16 v21, v32

    check-cast v21, Ljava/lang/Integer;

    move-object/from16 v22, v33

    check-cast v22, Ljava/lang/String;

    move-object/from16 v23, v34

    check-cast v23, Lcom/discord/primitives/ChannelId;

    move-object/from16 v24, v2

    check-cast v24, Ljava/lang/String;

    check-cast v25, Ljava/lang/String;

    move-object/from16 v26, v3

    check-cast v26, Lcom/discord/primitives/ChannelId;

    move-object/from16 v27, v28

    check-cast v27, Ljava/lang/String;

    move-object/from16 v28, v4

    check-cast v28, Ljava/util/List;

    move-object/from16 v29, v5

    check-cast v29, Lcom/discord/primitives/UserId;

    check-cast v30, Ljava/lang/String;

    move-object/from16 v31, v6

    check-cast v31, Ljava/lang/Integer;

    move-object/from16 v32, v7

    check-cast v32, Ljava/lang/String;

    move-object/from16 v33, v11

    check-cast v33, Ljava/lang/String;

    move-object/from16 v34, v46

    check-cast v34, Ljava/lang/Integer;

    move-object/from16 v35, v50

    check-cast v35, Lcom/discord/primitives/GuildId;

    move-object/from16 v36, v51

    check-cast v36, Ljava/lang/String;

    move-object/from16 v37, v52

    check-cast v37, Ljava/lang/String;

    move-object/from16 v38, v53

    check-cast v38, Ljava/lang/Integer;

    move-object/from16 v39, v59

    check-cast v39, Ljava/lang/String;

    move-object/from16 v40, v60

    check-cast v40, Lcom/discord/primitives/ApplicationId;

    move-object/from16 v41, v66

    check-cast v41, Ljava/lang/String;

    move-object/from16 v42, v68

    check-cast v42, Ljava/lang/String;

    move-object/from16 v43, v69

    check-cast v43, Lcom/discord/notifications/api/NotificationMessage;

    check-cast v44, Ljava/lang/String;

    move-object/from16 v45, v8

    check-cast v45, Ljava/lang/Integer;

    check-cast v48, Ljava/lang/String;

    move-object/from16 v49, v70

    check-cast v49, Ljava/lang/String;

    move-object/from16 v50, v9

    check-cast v50, Ljava/lang/String;

    move-object/from16 v51, v10

    check-cast v51, Ljava/lang/String;

    move-object/from16 v52, v12

    check-cast v52, Ljava/lang/String;

    move-object/from16 v53, v13

    check-cast v53, Ljava/lang/String;

    move-object/from16 v54, v15

    check-cast v54, Ljava/lang/Boolean;

    move-object/from16 v55, v47

    check-cast v55, Ljava/lang/String;

    const/16 v56, 0x0

    const/16 v57, 0x0

    move-object v11, v0

    move/from16 v12, v58

    move/from16 v13, v61

    move-object v15, v1

    move/from16 v46, v62

    move/from16 v47, v63

    invoke-direct/range {v11 .. v57}, Lcom/discord/notifications/api/NotificationData;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/util/List;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/primitives/ApplicationId;Ljava/lang/String;Ljava/lang/String;Lcom/discord/notifications/api/NotificationMessage;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
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
    invoke-virtual {p0, p1}, Lcom/discord/notifications/api/NotificationData$$serializer;->deserialize(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/notifications/api/NotificationData;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;
    .locals 1

    sget-object v0, Lcom/discord/notifications/api/NotificationData$$serializer;->descriptor:Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;

    return-object v0
.end method

.method public serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/notifications/api/NotificationData;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/discord/notifications/api/NotificationData$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/Encoder;->b(Lkotlinx/serialization/descriptors/SerialDescriptor;)Lkotlinx/serialization/encoding/CompositeEncoder;

    move-result-object p1

    invoke-static {p2, p1, v0}, Lcom/discord/notifications/api/NotificationData;->write$Self(Lcom/discord/notifications/api/NotificationData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    invoke-interface {p1, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->c(Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    return-void
.end method

.method public bridge synthetic serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/discord/notifications/api/NotificationData;

    invoke-virtual {p0, p1, p2}, Lcom/discord/notifications/api/NotificationData$$serializer;->serialize(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/notifications/api/NotificationData;)V

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
