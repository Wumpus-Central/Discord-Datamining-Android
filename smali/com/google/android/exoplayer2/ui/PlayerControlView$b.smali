.class final Lcom/google/android/exoplayer2/ui/PlayerControlView$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/Player$a;
.implements Lcom/google/android/exoplayer2/ui/h$a;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/ui/PlayerControlView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic k:Lcom/google/android/exoplayer2/ui/PlayerControlView;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/ui/PlayerControlView;Lcom/google/android/exoplayer2/ui/PlayerControlView$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;-><init>(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/exoplayer2/ui/h;J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->m(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->m(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/TextView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->s(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 22
    .line 23
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->t(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Ljava/util/Formatter;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1, p2, p3}, Lg9/q0;->f0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
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
.end method

.method public b(Lcom/google/android/exoplayer2/ui/h;JZ)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->c(Lcom/google/android/exoplayer2/ui/PlayerControlView;Z)Z

    .line 5
    .line 6
    .line 7
    if-nez p4, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->u(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Lcom/google/android/exoplayer2/Player;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->u(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Lcom/google/android/exoplayer2/Player;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    invoke-static {p1, p4, p2, p3}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->v(Lcom/google/android/exoplayer2/ui/PlayerControlView;Lcom/google/android/exoplayer2/Player;J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
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
.end method

.method public c(Lcom/google/android/exoplayer2/ui/h;J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->c(Lcom/google/android/exoplayer2/ui/PlayerControlView;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->m(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/TextView;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->m(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/TextView;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 22
    .line 23
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->s(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 28
    .line 29
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->t(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Ljava/util/Formatter;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, v1, p2, p3}, Lg9/q0;->f0(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
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
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->u(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Lcom/google/android/exoplayer2/Player;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 11
    .line 12
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->f(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-ne v1, p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1, v0}, Le7/d;->i(Lcom/google/android/exoplayer2/Player;)Z

    .line 25
    .line 26
    .line 27
    goto/16 :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 30
    .line 31
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->h(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-ne v1, p1, :cond_2

    .line 36
    .line 37
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1, v0}, Le7/d;->h(Lcom/google/android/exoplayer2/Player;)Z

    .line 44
    .line 45
    .line 46
    goto/16 :goto_0

    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->i(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-ne v1, p1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Lcom/google/android/exoplayer2/Player;->P()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v1, 0x4

    .line 61
    if-eq p1, v1, :cond_8

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 64
    .line 65
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1, v0}, Le7/d;->e(Lcom/google/android/exoplayer2/Player;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 74
    .line 75
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->j(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, p1, :cond_4

    .line 80
    .line 81
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 82
    .line 83
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-interface {p1, v0}, Le7/d;->a(Lcom/google/android/exoplayer2/Player;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 92
    .line 93
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->k(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    if-ne v1, p1, :cond_5

    .line 98
    .line 99
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 100
    .line 101
    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->l(Lcom/google/android/exoplayer2/ui/PlayerControlView;Lcom/google/android/exoplayer2/Player;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 106
    .line 107
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->n(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-ne v1, p1, :cond_6

    .line 112
    .line 113
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 114
    .line 115
    invoke-static {p1, v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->o(Lcom/google/android/exoplayer2/ui/PlayerControlView;Lcom/google/android/exoplayer2/Player;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 120
    .line 121
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->p(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/ImageView;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    if-ne v1, p1, :cond_7

    .line 126
    .line 127
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 128
    .line 129
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-interface {v0}, Lcom/google/android/exoplayer2/Player;->U()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    iget-object v2, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 138
    .line 139
    invoke-static {v2}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->q(Lcom/google/android/exoplayer2/ui/PlayerControlView;)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-static {v1, v2}, Lg9/b0;->a(II)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-interface {p1, v0, v1}, Le7/d;->d(Lcom/google/android/exoplayer2/Player;I)Z

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_7
    iget-object v1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 152
    .line 153
    invoke-static {v1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->r(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Landroid/widget/ImageView;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-ne v1, p1, :cond_8

    .line 158
    .line 159
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 160
    .line 161
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->g(Lcom/google/android/exoplayer2/ui/PlayerControlView;)Le7/d;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {v0}, Lcom/google/android/exoplayer2/Player;->V()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    xor-int/lit8 v1, v1, 0x1

    .line 170
    .line 171
    invoke-interface {p1, v0, v1}, Le7/d;->c(Lcom/google/android/exoplayer2/Player;Z)Z

    .line 172
    .line 173
    .line 174
    :cond_8
    :goto_0
    return-void
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
.end method

.method public onEvents(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 1

    .line 1
    const/4 p1, 0x2

    .line 2
    new-array v0, p1, [I

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/Player$Events;->c([I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 14
    .line 15
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->w(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x3

    .line 19
    new-array v0, v0, [I

    .line 20
    .line 21
    fill-array-data v0, :array_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/Player$Events;->c([I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->x(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/16 v0, 0x9

    .line 36
    .line 37
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/Player$Events;->b(I)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->y(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    const/16 v0, 0xa

    .line 49
    .line 50
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/Player$Events;->b(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 57
    .line 58
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->b(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    const/4 v0, 0x4

    .line 62
    new-array v0, v0, [I

    .line 63
    .line 64
    fill-array-data v0, :array_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v0}, Lcom/google/android/exoplayer2/Player$Events;->c([I)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object v0, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 74
    .line 75
    invoke-static {v0}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->d(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    new-array p1, p1, [I

    .line 79
    .line 80
    fill-array-data p1, :array_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, p1}, Lcom/google/android/exoplayer2/Player$Events;->c([I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_5

    .line 88
    .line 89
    iget-object p1, p0, Lcom/google/android/exoplayer2/ui/PlayerControlView$b;->k:Lcom/google/android/exoplayer2/ui/PlayerControlView;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/google/android/exoplayer2/ui/PlayerControlView;->e(Lcom/google/android/exoplayer2/ui/PlayerControlView;)V

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void

    .line 95
    :array_0
    .array-data 4
        0x5
        0x6
    .end array-data

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    :array_1
    .array-data 4
        0x5
        0x6
        0x8
    .end array-data

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
    :array_2
    .array-data 4
        0x9
        0xa
        0xc
        0x0
    .end array-data

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
    :array_3
    .array-data 4
        0xc
        0x0
    .end array-data
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
.end method

.method public synthetic onExperimentalOffloadSchedulingEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->b(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onExperimentalSleepingForOffloadChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->c(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->d(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsPlayingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->e(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->f(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onMediaItemTransition(Lcom/google/android/exoplayer2/MediaItem;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->g(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/MediaItem;I)V

    return-void
.end method

.method public synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->h(Lcom/google/android/exoplayer2/Player$a;ZI)V

    return-void
.end method

.method public synthetic onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->i(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/PlaybackParameters;)V

    return-void
.end method

.method public synthetic onPlaybackStateChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->j(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->k(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->l(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/ExoPlaybackException;)V

    return-void
.end method

.method public synthetic onPlayerStateChanged(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->m(Lcom/google/android/exoplayer2/Player$a;ZI)V

    return-void
.end method

.method public synthetic onPositionDiscontinuity(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->n(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onRepeatModeChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->o(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onSeekProcessed()V
    .locals 0

    invoke-static {p0}, Le7/q;->p(Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method

.method public synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->q(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onStaticMetadataChanged(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Le7/q;->r(Lcom/google/android/exoplayer2/Player$a;Ljava/util/List;)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->s(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;I)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le7/q;->t(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V

    return-void
.end method

.method public synthetic onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le7/q;->u(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V

    return-void
.end method
