.class public final Lck/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lck/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lck/e$a;",
        "",
        "Lokhttp3/Headers;",
        "responseHeaders",
        "Lck/e;",
        "a",
        "",
        "HEADER_WEB_SOCKET_EXTENSION",
        "Ljava/lang/String;",
        "<init>",
        "()V",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lck/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/Headers;)Lck/e;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "responseHeaders"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Lokhttp3/Headers;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    :goto_0
    if-ge v4, v1, :cond_13

    .line 20
    .line 21
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-string v12, "Sec-WebSocket-Extensions"

    .line 26
    .line 27
    const/4 v13, 0x1

    .line 28
    invoke-static {v5, v12, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    goto/16 :goto_8

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0, v4}, Lokhttp3/Headers;->n(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const/4 v12, 0x0

    .line 41
    :goto_1
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v14

    .line 45
    if-ge v12, v14, :cond_12

    .line 46
    .line 47
    const/16 v15, 0x2c

    .line 48
    .line 49
    const/16 v17, 0x0

    .line 50
    .line 51
    const/16 v18, 0x4

    .line 52
    .line 53
    const/16 v19, 0x0

    .line 54
    .line 55
    move-object v14, v5

    .line 56
    move/from16 v16, v12

    .line 57
    .line 58
    invoke-static/range {v14 .. v19}, Lpj/c;->o(Ljava/lang/String;CIIILjava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result v14

    .line 62
    const/16 v15, 0x3b

    .line 63
    .line 64
    invoke-static {v5, v15, v12, v14}, Lpj/c;->m(Ljava/lang/String;CII)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-static {v5, v12, v2}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    add-int/2addr v2, v13

    .line 73
    const-string v3, "permessage-deflate"

    .line 74
    .line 75
    invoke-static {v12, v3, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_11

    .line 80
    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    move v11, v13

    .line 84
    :cond_1
    :goto_2
    if-ge v2, v14, :cond_10

    .line 85
    .line 86
    invoke-static {v5, v15, v2, v14}, Lpj/c;->m(Ljava/lang/String;CII)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    const/16 v6, 0x3d

    .line 91
    .line 92
    invoke-static {v5, v6, v2, v3}, Lpj/c;->m(Ljava/lang/String;CII)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    invoke-static {v5, v2, v6}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-ge v6, v3, :cond_2

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    invoke-static {v5, v6, v3}, Lpj/c;->V(Ljava/lang/String;II)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    const-string v12, "\""

    .line 109
    .line 110
    invoke-static {v6, v12}, Lpi/l;->r0(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    goto :goto_3

    .line 115
    :cond_2
    const/4 v6, 0x0

    .line 116
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 117
    .line 118
    const-string v12, "client_max_window_bits"

    .line 119
    .line 120
    invoke-static {v2, v12, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-eqz v12, :cond_5

    .line 125
    .line 126
    if-eqz v7, :cond_3

    .line 127
    .line 128
    move v11, v13

    .line 129
    :cond_3
    if-eqz v6, :cond_4

    .line 130
    .line 131
    invoke-static {v6}, Lpi/l;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    move-object v7, v2

    .line 136
    goto :goto_4

    .line 137
    :cond_4
    const/4 v7, 0x0

    .line 138
    :goto_4
    if-nez v7, :cond_f

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_5
    const-string v12, "client_no_context_takeover"

    .line 142
    .line 143
    invoke-static {v2, v12, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    if-eqz v12, :cond_8

    .line 148
    .line 149
    if-eqz v8, :cond_6

    .line 150
    .line 151
    move v11, v13

    .line 152
    :cond_6
    if-eqz v6, :cond_7

    .line 153
    .line 154
    move v11, v13

    .line 155
    :cond_7
    move v8, v13

    .line 156
    goto :goto_7

    .line 157
    :cond_8
    const-string v12, "server_max_window_bits"

    .line 158
    .line 159
    invoke-static {v2, v12, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v12

    .line 163
    if-eqz v12, :cond_b

    .line 164
    .line 165
    if-eqz v9, :cond_9

    .line 166
    .line 167
    move v11, v13

    .line 168
    :cond_9
    if-eqz v6, :cond_a

    .line 169
    .line 170
    invoke-static {v6}, Lpi/l;->m(Ljava/lang/String;)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object v9, v2

    .line 175
    goto :goto_5

    .line 176
    :cond_a
    const/4 v9, 0x0

    .line 177
    :goto_5
    if-nez v9, :cond_f

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_b
    const-string v12, "server_no_context_takeover"

    .line 181
    .line 182
    invoke-static {v2, v12, v13}, Lpi/l;->t(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    if-eqz v10, :cond_c

    .line 189
    .line 190
    move v11, v13

    .line 191
    :cond_c
    if-eqz v6, :cond_d

    .line 192
    .line 193
    move v11, v13

    .line 194
    :cond_d
    move v10, v13

    .line 195
    goto :goto_7

    .line 196
    :cond_e
    :goto_6
    move v11, v13

    .line 197
    :cond_f
    :goto_7
    move v2, v3

    .line 198
    goto :goto_2

    .line 199
    :cond_10
    move v12, v2

    .line 200
    move v6, v13

    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :cond_11
    move v12, v2

    .line 204
    move v11, v13

    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_12
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_13
    new-instance v0, Lck/e;

    .line 212
    .line 213
    move-object v5, v0

    .line 214
    invoke-direct/range {v5 .. v11}, Lck/e;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    .line 215
    .line 216
    .line 217
    return-object v0
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
.end method
