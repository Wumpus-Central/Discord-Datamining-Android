.class public final Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;
.super Lx9/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:I

.field final k:I

.field public final l:Lya/p;

.field public final m:Lxa/i;

.field public final n:Lya/r;

.field public final o:Lxa/a;

.field public final p:Landroid/app/PendingIntent;

.field public final q:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final r:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final s:Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final t:[B

.field public final u:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final v:Lya/c;

.field public final w:Z
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final x:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public final y:Z

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lya/k;

    invoke-direct {v0}, Lya/k;-><init>()V

    sput-object v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lxa/i;Landroid/os/IBinder;Lxa/a;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;[BZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;ZII)V
    .locals 10

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object/from16 v3, p8

    move-object/from16 v4, p9

    move-object/from16 v5, p12

    move/from16 v6, p13

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    move v7, p1

    iput v7, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->k:I

    const/4 v7, 0x0

    if-nez v1, :cond_0

    move-object v8, v7

    goto :goto_0

    :cond_0
    const-string v8, "com.google.android.gms.nearby.messages.internal.IMessageListener"

    .line 2
    invoke-interface {p2, v8}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v8

    .line 3
    instance-of v9, v8, Lya/p;

    if-eqz v9, :cond_1

    .line 4
    check-cast v8, Lya/p;

    goto :goto_0

    :cond_1
    new-instance v8, Lcom/google/android/gms/nearby/messages/internal/i0;

    invoke-direct {v8, p2}, Lcom/google/android/gms/nearby/messages/internal/i0;-><init>(Landroid/os/IBinder;)V

    .line 5
    :goto_0
    iput-object v8, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lya/p;

    move-object v1, p3

    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->m:Lxa/i;

    if-nez v2, :cond_2

    move-object v1, v7

    goto :goto_1

    :cond_2
    const-string v1, "com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback"

    .line 6
    invoke-interface {p4, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 7
    instance-of v8, v1, Lya/r;

    if-eqz v8, :cond_3

    .line 8
    check-cast v1, Lya/r;

    goto :goto_1

    :cond_3
    new-instance v1, Lcom/google/android/gms/nearby/messages/internal/j0;

    invoke-direct {v1, p4}, Lcom/google/android/gms/nearby/messages/internal/j0;-><init>(Landroid/os/IBinder;)V

    .line 9
    :goto_1
    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->n:Lya/r;

    move-object v1, p5

    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->o:Lxa/a;

    move-object/from16 v1, p6

    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->p:Landroid/app/PendingIntent;

    move/from16 v1, p7

    iput v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->q:I

    iput-object v3, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->r:Ljava/lang/String;

    iput-object v4, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->s:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->t:[B

    move/from16 v1, p11

    iput-boolean v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->u:Z

    if-nez v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v1, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback"

    .line 10
    invoke-interface {v5, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 11
    instance-of v2, v1, Lya/c;

    if-eqz v2, :cond_5

    .line 12
    move-object v7, v1

    check-cast v7, Lya/c;

    goto :goto_2

    :cond_5
    new-instance v7, Lcom/google/android/gms/nearby/messages/internal/n0;

    invoke-direct {v7, v5}, Lcom/google/android/gms/nearby/messages/internal/n0;-><init>(Landroid/os/IBinder;)V

    .line 13
    :goto_2
    iput-object v7, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->v:Lya/c;

    iput-boolean v6, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->w:Z

    move-object/from16 v1, p14

    .line 14
    invoke-static {v1, v4, v3, v6}, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->x(Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->x:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    move/from16 v1, p15

    iput-boolean v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->y:Z

    move/from16 v1, p16

    iput v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->z:I

    move/from16 v1, p17

    iput v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->A:I

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;Lxa/i;Landroid/os/IBinder;Lxa/a;Landroid/app/PendingIntent;[BLandroid/os/IBinder;ZII)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v12, p7

    move/from16 v17, p10

    const/4 v1, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 15
    invoke-direct/range {v0 .. v17}, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;-><init>(ILandroid/os/IBinder;Lxa/i;Landroid/os/IBinder;Lxa/a;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;[BZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;ZII)V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lya/p;

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->m:Lxa/i;

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->n:Lya/r;

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->o:Lxa/a;

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->p:Landroid/app/PendingIntent;

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-object v6, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->t:[B

    .line 34
    .line 35
    if-nez v6, :cond_0

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    array-length v6, v6

    .line 40
    new-instance v7, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v8, "<"

    .line 46
    .line 47
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v6, " bytes>"

    .line 54
    .line 55
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    :goto_0
    iget-object v7, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->v:Lya/c;

    .line 63
    .line 64
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    iget-boolean v8, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->w:Z

    .line 69
    .line 70
    iget-object v9, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->x:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 71
    .line 72
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    iget-boolean v10, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->y:Z

    .line 77
    .line 78
    iget-object v11, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->r:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v12, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->s:Ljava/lang/String;

    .line 81
    .line 82
    iget-boolean v13, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->u:Z

    .line 83
    .line 84
    iget v14, v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->A:I

    .line 85
    .line 86
    new-instance v15, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const-string v0, "SubscribeRequest{messageListener="

    .line 92
    .line 93
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, ", strategy="

    .line 100
    .line 101
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v0, ", callback="

    .line 108
    .line 109
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v0, ", filter="

    .line 116
    .line 117
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string v0, ", pendingIntent="

    .line 124
    .line 125
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v0, ", hint="

    .line 132
    .line 133
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v0, ", subscribeCallback="

    .line 140
    .line 141
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    const-string v0, ", useRealClientApiKey="

    .line 148
    .line 149
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    const-string v0, ", clientAppContext="

    .line 156
    .line 157
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const-string v0, ", isDiscardPendingIntent="

    .line 164
    .line 165
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v0, ", zeroPartyPackageName="

    .line 172
    .line 173
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v0, ", realClientPackageName="

    .line 180
    .line 181
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v0, ", isIgnoreNearbyPermission="

    .line 188
    .line 189
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v0, ", callingContext="

    .line 196
    .line 197
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    const-string v0, "}"

    .line 204
    .line 205
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0
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
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->k:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->l:Lya/p;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    const/4 v3, 0x2

    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-static {p1, v3, v1, v4}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->m:Lxa/i;

    .line 29
    .line 30
    invoke-static {p1, v1, v3, p2, v4}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->n:Lya/r;

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    move-object v1, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :goto_1
    const/4 v3, 0x4

    .line 44
    invoke-static {p1, v3, v1, v4}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x5

    .line 48
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->o:Lxa/a;

    .line 49
    .line 50
    invoke-static {p1, v1, v3, p2, v4}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x6

    .line 54
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->p:Landroid/app/PendingIntent;

    .line 55
    .line 56
    invoke-static {p1, v1, v3, p2, v4}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    iget v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->q:I

    .line 61
    .line 62
    invoke-static {p1, v1, v3}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 63
    .line 64
    .line 65
    const/16 v1, 0x8

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->r:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {p1, v1, v3, v4}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x9

    .line 73
    .line 74
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->s:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {p1, v1, v3, v4}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    const/16 v1, 0xa

    .line 80
    .line 81
    iget-object v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->t:[B

    .line 82
    .line 83
    invoke-static {p1, v1, v3, v4}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 84
    .line 85
    .line 86
    const/16 v1, 0xb

    .line 87
    .line 88
    iget-boolean v3, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->u:Z

    .line 89
    .line 90
    invoke-static {p1, v1, v3}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->v:Lya/c;

    .line 94
    .line 95
    if-nez v1, :cond_2

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_2
    invoke-interface {v1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :goto_2
    const/16 v1, 0xc

    .line 103
    .line 104
    invoke-static {p1, v1, v2, v4}, Lx9/c;->i(Landroid/os/Parcel;ILandroid/os/IBinder;Z)V

    .line 105
    .line 106
    .line 107
    const/16 v1, 0xd

    .line 108
    .line 109
    iget-boolean v2, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->w:Z

    .line 110
    .line 111
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 112
    .line 113
    .line 114
    const/16 v1, 0xe

    .line 115
    .line 116
    iget-object v2, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->x:Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 117
    .line 118
    invoke-static {p1, v1, v2, p2, v4}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 119
    .line 120
    .line 121
    const/16 p2, 0xf

    .line 122
    .line 123
    iget-boolean v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->y:Z

    .line 124
    .line 125
    invoke-static {p1, p2, v1}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 126
    .line 127
    .line 128
    const/16 p2, 0x10

    .line 129
    .line 130
    iget v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->z:I

    .line 131
    .line 132
    invoke-static {p1, p2, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 133
    .line 134
    .line 135
    const/16 p2, 0x11

    .line 136
    .line 137
    iget v1, p0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;->A:I

    .line 138
    .line 139
    invoke-static {p1, p2, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 140
    .line 141
    .line 142
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 143
    .line 144
    .line 145
    return-void
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
.end method
