.class final Lcom/android/billingclient/api/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private final k:Ljava/lang/Object;

.field private l:Z

.field private m:Lu2/a;

.field final synthetic n:Lcom/android/billingclient/api/a;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/a;Lu2/a;Lu2/i;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/j;->k:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/j;->l:Z

    iput-object p2, p0, Lcom/android/billingclient/api/j;->m:Lu2/a;

    return-void
.end method

.method private final d(Lcom/android/billingclient/api/BillingResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/j;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/j;->m:Lu2/a;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p1}, Lu2/a;->onBillingSetupFinished(Lcom/android/billingclient/api/BillingResult;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
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
.end method


# virtual methods
.method final synthetic a()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/j;->k:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/android/billingclient/api/j;->l:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v2

    .line 11
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v1, "accountName"

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, v2

    .line 30
    :goto_0
    const/4 v1, 0x3

    .line 31
    const/4 v3, 0x0

    .line 32
    :try_start_1
    iget-object v4, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 33
    .line 34
    invoke-static {v4}, Lcom/android/billingclient/api/a;->x(Lcom/android/billingclient/api/a;)Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 42
    const/16 v5, 0x11

    .line 43
    .line 44
    move v7, v1

    .line 45
    move v6, v5

    .line 46
    :goto_1
    if-lt v6, v1, :cond_4

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    :try_start_2
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 51
    .line 52
    invoke-static {v8}, Lcom/android/billingclient/api/a;->D(Lcom/android/billingclient/api/a;)Lra/n;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const-string v9, "subs"

    .line 57
    .line 58
    invoke-interface {v8, v6, v4, v9}, Lra/n;->g(ILjava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    goto :goto_2

    .line 63
    :cond_2
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 64
    .line 65
    invoke-static {v8}, Lcom/android/billingclient/api/a;->D(Lcom/android/billingclient/api/a;)Lra/n;

    .line 66
    .line 67
    .line 68
    move-result-object v8

    .line 69
    const-string v9, "subs"

    .line 70
    .line 71
    invoke-interface {v8, v6, v4, v9, v0}, Lra/n;->Y(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    :goto_2
    if-nez v7, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    add-int/lit8 v6, v6, -0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v6, v3

    .line 82
    :goto_3
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 83
    .line 84
    const/4 v9, 0x5

    .line 85
    const/4 v10, 0x1

    .line 86
    if-lt v6, v9, :cond_5

    .line 87
    .line 88
    move v9, v10

    .line 89
    goto :goto_4

    .line 90
    :cond_5
    move v9, v3

    .line 91
    :goto_4
    invoke-static {v8, v9}, Lcom/android/billingclient/api/a;->n(Lcom/android/billingclient/api/a;Z)V

    .line 92
    .line 93
    .line 94
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 95
    .line 96
    if-lt v6, v1, :cond_6

    .line 97
    .line 98
    move v9, v10

    .line 99
    goto :goto_5

    .line 100
    :cond_6
    move v9, v3

    .line 101
    :goto_5
    invoke-static {v8, v9}, Lcom/android/billingclient/api/a;->o(Lcom/android/billingclient/api/a;Z)V

    .line 102
    .line 103
    .line 104
    if-ge v6, v1, :cond_7

    .line 105
    .line 106
    const-string v6, "BillingClient"

    .line 107
    .line 108
    const-string v8, "In-app billing API does not support subscription on this device."

    .line 109
    .line 110
    invoke-static {v6, v8}, Lra/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    move v6, v5

    .line 114
    :goto_6
    if-lt v6, v1, :cond_a

    .line 115
    .line 116
    if-nez v0, :cond_8

    .line 117
    .line 118
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 119
    .line 120
    invoke-static {v8}, Lcom/android/billingclient/api/a;->D(Lcom/android/billingclient/api/a;)Lra/n;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    const-string v9, "inapp"

    .line 125
    .line 126
    invoke-interface {v8, v6, v4, v9}, Lra/n;->g(ILjava/lang/String;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    goto :goto_7

    .line 131
    :cond_8
    iget-object v8, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 132
    .line 133
    invoke-static {v8}, Lcom/android/billingclient/api/a;->D(Lcom/android/billingclient/api/a;)Lra/n;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    const-string v9, "inapp"

    .line 138
    .line 139
    invoke-interface {v8, v6, v4, v9, v0}, Lra/n;->Y(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    :goto_7
    if-nez v7, :cond_9

    .line 144
    .line 145
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 146
    .line 147
    invoke-static {v0, v6}, Lcom/android/billingclient/api/a;->J(Lcom/android/billingclient/api/a;I)V

    .line 148
    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_9
    add-int/lit8 v6, v6, -0x1

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_a
    :goto_8
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 155
    .line 156
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-lt v4, v5, :cond_b

    .line 161
    .line 162
    move v4, v10

    .line 163
    goto :goto_9

    .line 164
    :cond_b
    move v4, v3

    .line 165
    :goto_9
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->P(Lcom/android/billingclient/api/a;Z)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 169
    .line 170
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    const/16 v5, 0x10

    .line 175
    .line 176
    if-lt v4, v5, :cond_c

    .line 177
    .line 178
    move v4, v10

    .line 179
    goto :goto_a

    .line 180
    :cond_c
    move v4, v3

    .line 181
    :goto_a
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->O(Lcom/android/billingclient/api/a;Z)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 185
    .line 186
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    const/16 v5, 0xf

    .line 191
    .line 192
    if-lt v4, v5, :cond_d

    .line 193
    .line 194
    move v4, v10

    .line 195
    goto :goto_b

    .line 196
    :cond_d
    move v4, v3

    .line 197
    :goto_b
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->N(Lcom/android/billingclient/api/a;Z)V

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 201
    .line 202
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    const/16 v5, 0xe

    .line 207
    .line 208
    if-lt v4, v5, :cond_e

    .line 209
    .line 210
    move v4, v10

    .line 211
    goto :goto_c

    .line 212
    :cond_e
    move v4, v3

    .line 213
    :goto_c
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->M(Lcom/android/billingclient/api/a;Z)V

    .line 214
    .line 215
    .line 216
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 217
    .line 218
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    const/16 v5, 0xc

    .line 223
    .line 224
    if-lt v4, v5, :cond_f

    .line 225
    .line 226
    move v4, v10

    .line 227
    goto :goto_d

    .line 228
    :cond_f
    move v4, v3

    .line 229
    :goto_d
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->L(Lcom/android/billingclient/api/a;Z)V

    .line 230
    .line 231
    .line 232
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 233
    .line 234
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    const/16 v5, 0xa

    .line 239
    .line 240
    if-lt v4, v5, :cond_10

    .line 241
    .line 242
    move v4, v10

    .line 243
    goto :goto_e

    .line 244
    :cond_10
    move v4, v3

    .line 245
    :goto_e
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->K(Lcom/android/billingclient/api/a;Z)V

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 249
    .line 250
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    const/16 v5, 0x9

    .line 255
    .line 256
    if-lt v4, v5, :cond_11

    .line 257
    .line 258
    move v4, v10

    .line 259
    goto :goto_f

    .line 260
    :cond_11
    move v4, v3

    .line 261
    :goto_f
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->l(Lcom/android/billingclient/api/a;Z)V

    .line 262
    .line 263
    .line 264
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 265
    .line 266
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    const/16 v5, 0x8

    .line 271
    .line 272
    if-lt v4, v5, :cond_12

    .line 273
    .line 274
    move v4, v10

    .line 275
    goto :goto_10

    .line 276
    :cond_12
    move v4, v3

    .line 277
    :goto_10
    invoke-static {v0, v4}, Lcom/android/billingclient/api/a;->R(Lcom/android/billingclient/api/a;Z)V

    .line 278
    .line 279
    .line 280
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 281
    .line 282
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    const/4 v5, 0x6

    .line 287
    if-lt v4, v5, :cond_13

    .line 288
    .line 289
    goto :goto_11

    .line 290
    :cond_13
    move v10, v3

    .line 291
    :goto_11
    invoke-static {v0, v10}, Lcom/android/billingclient/api/a;->Q(Lcom/android/billingclient/api/a;Z)V

    .line 292
    .line 293
    .line 294
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 295
    .line 296
    invoke-static {v0}, Lcom/android/billingclient/api/a;->w(Lcom/android/billingclient/api/a;)I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-ge v0, v1, :cond_14

    .line 301
    .line 302
    const-string v0, "BillingClient"

    .line 303
    .line 304
    const-string v1, "In-app billing API version 3 is not supported on this device."

    .line 305
    .line 306
    invoke-static {v0, v1}, Lra/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :cond_14
    if-nez v7, :cond_15

    .line 310
    .line 311
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 312
    .line 313
    const/4 v1, 0x2

    .line 314
    invoke-static {v0, v1}, Lcom/android/billingclient/api/a;->I(Lcom/android/billingclient/api/a;I)V

    .line 315
    .line 316
    .line 317
    goto :goto_13

    .line 318
    :cond_15
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 319
    .line 320
    invoke-static {v0, v3}, Lcom/android/billingclient/api/a;->I(Lcom/android/billingclient/api/a;I)V

    .line 321
    .line 322
    .line 323
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 324
    .line 325
    invoke-static {v0, v2}, Lcom/android/billingclient/api/a;->m(Lcom/android/billingclient/api/a;Lra/n;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 326
    .line 327
    .line 328
    goto :goto_13

    .line 329
    :catch_0
    move-exception v0

    .line 330
    move v1, v7

    .line 331
    goto :goto_12

    .line 332
    :catch_1
    move-exception v0

    .line 333
    :goto_12
    const-string v4, "BillingClient"

    .line 334
    .line 335
    const-string v5, "Exception while checking if billing is supported; try to reconnect"

    .line 336
    .line 337
    invoke-static {v4, v5, v0}, Lra/k;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 341
    .line 342
    invoke-static {v0, v3}, Lcom/android/billingclient/api/a;->I(Lcom/android/billingclient/api/a;I)V

    .line 343
    .line 344
    .line 345
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 346
    .line 347
    invoke-static {v0, v2}, Lcom/android/billingclient/api/a;->m(Lcom/android/billingclient/api/a;Lra/n;)V

    .line 348
    .line 349
    .line 350
    move v7, v1

    .line 351
    :goto_13
    if-nez v7, :cond_16

    .line 352
    .line 353
    sget-object v0, Lcom/android/billingclient/api/k;->l:Lcom/android/billingclient/api/BillingResult;

    .line 354
    .line 355
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/j;->d(Lcom/android/billingclient/api/BillingResult;)V

    .line 356
    .line 357
    .line 358
    goto :goto_14

    .line 359
    :cond_16
    sget-object v0, Lcom/android/billingclient/api/k;->a:Lcom/android/billingclient/api/BillingResult;

    .line 360
    .line 361
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/j;->d(Lcom/android/billingclient/api/BillingResult;)V

    .line 362
    .line 363
    .line 364
    :goto_14
    return-object v2

    .line 365
    :catchall_0
    move-exception v1

    .line 366
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 367
    throw v1
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

.method final synthetic b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/android/billingclient/api/a;->I(Lcom/android/billingclient/api/a;I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lcom/android/billingclient/api/a;->m(Lcom/android/billingclient/api/a;Lra/n;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, Lcom/android/billingclient/api/k;->n:Lcom/android/billingclient/api/BillingResult;

    .line 14
    .line 15
    invoke-direct {p0, v0}, Lcom/android/billingclient/api/j;->d(Lcom/android/billingclient/api/BillingResult;)V

    .line 16
    .line 17
    .line 18
    return-void
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

.method final c()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/j;->k:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lcom/android/billingclient/api/j;->m:Lu2/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/android/billingclient/api/j;->l:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service connected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lra/k;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 9
    .line 10
    invoke-static {p2}, Lra/m;->b(Landroid/os/IBinder;)Lra/n;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1, p2}, Lcom/android/billingclient/api/a;->m(Lcom/android/billingclient/api/a;Lra/n;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 18
    .line 19
    new-instance v1, Lcom/android/billingclient/api/h;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Lcom/android/billingclient/api/h;-><init>(Lcom/android/billingclient/api/j;)V

    .line 22
    .line 23
    .line 24
    const-wide/16 v2, 0x7530

    .line 25
    .line 26
    new-instance v4, Lcom/android/billingclient/api/i;

    .line 27
    .line 28
    invoke-direct {v4, p0}, Lcom/android/billingclient/api/i;-><init>(Lcom/android/billingclient/api/j;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/android/billingclient/api/a;->A(Lcom/android/billingclient/api/a;)Landroid/os/Handler;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static/range {v0 .. v5}, Lcom/android/billingclient/api/a;->H(Lcom/android/billingclient/api/a;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    iget-object p1, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 42
    .line 43
    invoke-static {p1}, Lcom/android/billingclient/api/a;->B(Lcom/android/billingclient/api/a;)Lcom/android/billingclient/api/BillingResult;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/j;->d(Lcom/android/billingclient/api/BillingResult;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    const-string p1, "BillingClient"

    .line 2
    .line 3
    const-string v0, "Billing service disconnected."

    .line 4
    .line 5
    invoke-static {p1, v0}, Lra/k;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0}, Lcom/android/billingclient/api/a;->m(Lcom/android/billingclient/api/a;Lra/n;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/android/billingclient/api/j;->n:Lcom/android/billingclient/api/a;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {p1, v0}, Lcom/android/billingclient/api/a;->I(Lcom/android/billingclient/api/a;I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/android/billingclient/api/j;->k:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter p1

    .line 23
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/j;->m:Lu2/a;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Lu2/a;->onBillingServiceDisconnected()V

    .line 28
    .line 29
    .line 30
    :cond_0
    monitor-exit p1

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
