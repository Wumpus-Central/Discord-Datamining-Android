.class public final Lcom/discord/chat/presentation/list/PortalViewUpdate;
.super Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/discord/chat/presentation/list/PortalViewUpdate;",
        "Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;",
        "portalChatListItem",
        "Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;",
        "updateId",
        "",
        "(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V",
        "getPortalChatListItem",
        "()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;",
        "getUpdateId",
        "()I",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
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
.field private final portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

.field private final updateId:I


# direct methods
.method public constructor <init>(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V
    .locals 3

    .line 1
    sget-object v0, Lcom/discord/chat/presentation/list/PortalViewUpdate$1;->INSTANCE:Lcom/discord/chat/presentation/list/PortalViewUpdate$1;

    .line 2
    .line 3
    sget-object v1, Lcom/discord/chat/presentation/list/PortalViewUpdate$2;->INSTANCE:Lcom/discord/chat/presentation/list/PortalViewUpdate$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {p0, p2, v0, v1, v2}, Lcom/discord/chat/presentation/list/ChannelChatListAdapterUpdate;-><init>(ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    .line 10
    .line 11
    iput p2, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->updateId:I

    .line 12
    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
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

.method public static synthetic copy$default(Lcom/discord/chat/presentation/list/PortalViewUpdate;Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;IILjava/lang/Object;)Lcom/discord/chat/presentation/list/PortalViewUpdate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result p2

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->copy(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)Lcom/discord/chat/presentation/list/PortalViewUpdate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result v0

    return v0
.end method

.method public final copy(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)Lcom/discord/chat/presentation/list/PortalViewUpdate;
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    invoke-direct {v0, p1, p2}, Lcom/discord/chat/presentation/list/PortalViewUpdate;-><init>(Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/discord/chat/presentation/list/PortalViewUpdate;

    iget-object v1, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    iget-object v3, p1, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result v1

    invoke-virtual {p1}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result p1

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getPortalChatListItem()Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;
    .locals 1

    iget-object v0, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    return-object v0
.end method

.method public getUpdateId()I
    .locals 1

    iget v0, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->updateId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/discord/chat/presentation/list/PortalViewUpdate;->portalChatListItem:Lcom/discord/chat/presentation/list/item/PortalViewChatListItem;

    invoke-virtual {p0}, Lcom/discord/chat/presentation/list/PortalViewUpdate;->getUpdateId()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PortalViewUpdate(portalChatListItem="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", updateId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
