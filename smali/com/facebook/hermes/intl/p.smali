.class public Lcom/facebook/hermes/intl/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/hermes/intl/c;


# instance fields
.field private a:Ljava/text/Format;

.field private b:Ljava/text/DecimalFormat;

.field private c:Lcom/facebook/hermes/intl/h;

.field private d:Lcom/facebook/hermes/intl/c$h;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static n(Ljava/lang/String;)I
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/Currency;->getDefaultFractionDigits()I

    .line 6
    .line 7
    .line 8
    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return p0

    .line 10
    :catch_0
    new-instance p0, Lg5/j;

    .line 11
    .line 12
    const-string v0, "Invalid currency code !"

    .line 13
    .line 14
    invoke-direct {p0, v0}, Lg5/j;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p0
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
.end method

.method private o(Ljava/text/DecimalFormat;Lg5/b;Lcom/facebook/hermes/intl/c$h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/text/DecimalFormat;",
            "Lg5/b<",
            "*>;",
            "Lcom/facebook/hermes/intl/c$h;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/facebook/hermes/intl/p;->a:Ljava/text/Format;

    .line 4
    .line 5
    check-cast p2, Lcom/facebook/hermes/intl/h;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/hermes/intl/p;->c:Lcom/facebook/hermes/intl/h;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/facebook/hermes/intl/p;->d:Lcom/facebook/hermes/intl/c$h;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
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
.end method


# virtual methods
.method public a(D)Ljava/text/AttributedCharacterIterator;
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->a:Ljava/text/Format;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->formatToCharacterIterator(Ljava/lang/Object;)Ljava/text/AttributedCharacterIterator;

    move-result-object p1

    return-object p1
.end method

.method public b(D)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->a:Ljava/text/Format;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(Lg5/b;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string p1, "latn"

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/hermes/intl/p;->v(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/p;->t(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/facebook/hermes/intl/p;->p(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/hermes/intl/p;->u(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public h(Ljava/text/AttributedCharacterIterator$Attribute;D)Ljava/lang/String;
    .locals 0

    const-string p1, "literal"

    return-object p1
.end method

.method public bridge synthetic i(I)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/p;->s(I)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Z)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/facebook/hermes/intl/p;->r(Z)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic k(Lg5/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual/range {p0 .. p6}, Lcom/facebook/hermes/intl/p;->m(Lg5/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/hermes/intl/p;->q(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/p;

    move-result-object p1

    return-object p1
.end method

.method public m(Lg5/b;Ljava/lang/String;Lcom/facebook/hermes/intl/c$h;Lcom/facebook/hermes/intl/c$d;Lcom/facebook/hermes/intl/c$e;Lcom/facebook/hermes/intl/c$b;)Lcom/facebook/hermes/intl/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg5/b<",
            "*>;",
            "Ljava/lang/String;",
            "Lcom/facebook/hermes/intl/c$h;",
            "Lcom/facebook/hermes/intl/c$d;",
            "Lcom/facebook/hermes/intl/c$e;",
            "Lcom/facebook/hermes/intl/c$b;",
            ")",
            "Lcom/facebook/hermes/intl/p;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lg5/b;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Ljava/util/Locale;

    .line 6
    .line 7
    invoke-static {p2}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object p4, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 12
    .line 13
    invoke-virtual {p2, p4}, Ljava/text/NumberFormat;->setRoundingMode(Ljava/math/RoundingMode;)V

    .line 14
    .line 15
    .line 16
    check-cast p2, Ljava/text/DecimalFormat;

    .line 17
    .line 18
    invoke-direct {p0, p2, p1, p3}, Lcom/facebook/hermes/intl/p;->o(Ljava/text/DecimalFormat;Lg5/b;Lcom/facebook/hermes/intl/c$h;)V

    .line 19
    .line 20
    .line 21
    return-object p0
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
.end method

.method public p(Ljava/lang/String;Lcom/facebook/hermes/intl/c$c;)Lcom/facebook/hermes/intl/p;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->d:Lcom/facebook/hermes/intl/c$h;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/hermes/intl/c$h;->m:Lcom/facebook/hermes/intl/c$h;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/text/DecimalFormat;->setCurrency(Ljava/util/Currency;)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lcom/facebook/hermes/intl/p$a;->a:[I

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    aget p2, v1, p2

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eq p2, v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    if-eq p2, v1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->c:Lcom/facebook/hermes/intl/h;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, p1}, Ljava/util/Currency;->getSymbol(Ljava/util/Locale;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->c:Lcom/facebook/hermes/intl/h;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/facebook/hermes/intl/h;->m()Ljava/util/Locale;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Ljava/util/Currency;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2, p1}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 61
    .line 62
    invoke-virtual {v0, p2}, Ljava/text/DecimalFormat;->setDecimalFormatSymbols(Ljava/text/DecimalFormatSymbols;)V

    .line 63
    .line 64
    .line 65
    iget-object p2, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/text/DecimalFormat;->getDecimalFormatSymbols()Ljava/text/DecimalFormatSymbols;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2, p1}, Ljava/text/DecimalFormatSymbols;->setCurrencySymbol(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-object p0
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
.end method

.method public q(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$f;->l:Lcom/facebook/hermes/intl/c$f;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    if-ltz p2, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/text/DecimalFormat;->setMinimumFractionDigits(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    if-ltz p3, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 15
    .line 16
    invoke-virtual {p1, p3}, Ljava/text/DecimalFormat;->setMaximumFractionDigits(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-object p0
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
.end method

.method public r(Z)Lcom/facebook/hermes/intl/p;
    .locals 1

    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v0, p1}, Ljava/text/DecimalFormat;->setGroupingUsed(Z)V

    return-object p0
.end method

.method public s(I)Lcom/facebook/hermes/intl/p;
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    invoke-virtual {v0, p1}, Ljava/text/DecimalFormat;->setMinimumIntegerDigits(I)V

    :cond_0
    return-object p0
.end method

.method public t(Lcom/facebook/hermes/intl/c$g;)Lcom/facebook/hermes/intl/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/hermes/intl/c$g;->m:Lcom/facebook/hermes/intl/c$g;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/text/DecimalFormat;->setPositivePrefix(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/text/DecimalFormat;->setPositiveSuffix(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/text/DecimalFormat;->setNegativePrefix(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/facebook/hermes/intl/p;->b:Ljava/text/DecimalFormat;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/text/DecimalFormat;->setNegativeSuffix(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p0
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
.end method

.method public u(Lcom/facebook/hermes/intl/c$f;II)Lcom/facebook/hermes/intl/p;
    .locals 0

    return-object p0
.end method

.method public v(Ljava/lang/String;Lcom/facebook/hermes/intl/c$i;)Lcom/facebook/hermes/intl/p;
    .locals 0

    return-object p0
.end method
