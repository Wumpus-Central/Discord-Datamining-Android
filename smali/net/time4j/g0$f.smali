.class Lnet/time4j/g0$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/u<",
        "Lnet/time4j/g0;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/g0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/g0$f;-><init>()V

    return-void
.end method

.method private static e(Lfj/q;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lfj/n0;->k:Lfj/n0;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lfj/q;->A(Lfj/p;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
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
.end method

.method private static h(Lfj/q;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)I"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/g0;->E:Lnet/time4j/k0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lfj/q;->m(Lfj/p;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, -0x80000000

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    sget-object v0, Lnet/time4j/g0;->C:Lnet/time4j/c;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lfj/q;->m(Lfj/p;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, -0x1

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return v2

    .line 22
    :cond_1
    const/16 v3, 0x18

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    if-ne v0, v3, :cond_2

    .line 26
    .line 27
    return v4

    .line 28
    :cond_2
    if-eq v0, v1, :cond_3

    .line 29
    .line 30
    return v0

    .line 31
    :cond_3
    sget-object v0, Lnet/time4j/g0;->A:Lnet/time4j/c1;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_a

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lnet/time4j/z;

    .line 44
    .line 45
    sget-object v3, Lnet/time4j/g0;->B:Lnet/time4j/c;

    .line 46
    .line 47
    invoke-virtual {p0, v3}, Lfj/q;->m(Lfj/p;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eq v3, v1, :cond_8

    .line 52
    .line 53
    if-nez v3, :cond_5

    .line 54
    .line 55
    sget-object p0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 56
    .line 57
    if-ne v0, p0, :cond_4

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    const/4 v2, -0x2

    .line 61
    :goto_0
    return v2

    .line 62
    :cond_5
    const/16 p0, 0xc

    .line 63
    .line 64
    if-ne v3, p0, :cond_6

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_6
    move v4, v3

    .line 68
    :goto_1
    sget-object p0, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 69
    .line 70
    if-ne v0, p0, :cond_7

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_7
    add-int/lit8 v4, v4, 0xc

    .line 74
    .line 75
    :goto_2
    return v4

    .line 76
    :cond_8
    sget-object v2, Lnet/time4j/g0;->D:Lnet/time4j/k0;

    .line 77
    .line 78
    invoke-virtual {p0, v2}, Lfj/q;->m(Lfj/p;)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eq p0, v1, :cond_a

    .line 83
    .line 84
    sget-object v1, Lnet/time4j/z;->k:Lnet/time4j/z;

    .line 85
    .line 86
    if-ne v0, v1, :cond_9

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_9
    add-int/lit8 p0, p0, 0xc

    .line 90
    .line 91
    :goto_3
    return p0

    .line 92
    :cond_a
    return v1
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
.end method

.method private static i(Lfj/q;)Lnet/time4j/g0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;)",
            "Lnet/time4j/g0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/g0;->P:Lnet/time4j/k0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    const-wide/16 v3, 0x0

    .line 21
    .line 22
    cmp-long v3, v0, v3

    .line 23
    .line 24
    if-ltz v3, :cond_1

    .line 25
    .line 26
    const-wide v3, 0x4e94914f0000L

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v3, v0, v3

    .line 32
    .line 33
    if-lez v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {v0, v1}, Lnet/time4j/g0;->U(J)Lnet/time4j/g0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v4, "NANO_OF_DAY out of range: "

    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {p0, v0}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_2
    sget-object v0, Lnet/time4j/g0;->O:Lnet/time4j/k0;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v3, 0x0

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    rem-int/lit16 v3, v1, 0x3e8

    .line 90
    .line 91
    :cond_3
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-static {v0, v1, v3}, Lnet/time4j/g0;->T(JI)Lnet/time4j/g0;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :cond_4
    sget-object v0, Lnet/time4j/g0;->N:Lnet/time4j/k0;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    const v4, 0xf4240

    .line 113
    .line 114
    .line 115
    if-eqz v1, :cond_d

    .line 116
    .line 117
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_7

    .line 124
    .line 125
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-ltz v1, :cond_6

    .line 136
    .line 137
    const v3, 0x3b9aca00

    .line 138
    .line 139
    .line 140
    if-lt v1, v3, :cond_5

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    rem-int v3, v1, v4

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v3, "NANO_OF_SECOND out of range: "

    .line 152
    .line 153
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {p0, v0}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object v2

    .line 167
    :cond_7
    sget-object v1, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 168
    .line 169
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_a

    .line 174
    .line 175
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    check-cast v1, Ljava/lang/Integer;

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-ltz v1, :cond_9

    .line 186
    .line 187
    if-lt v1, v4, :cond_8

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    rem-int/lit16 v3, v1, 0x3e8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_9
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v3, "MICRO_OF_SECOND out of range: "

    .line 199
    .line 200
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {p0, v0}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v2

    .line 214
    :cond_a
    :goto_3
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Ljava/lang/Integer;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-ltz v0, :cond_c

    .line 225
    .line 226
    const v1, 0x5265c00

    .line 227
    .line 228
    .line 229
    if-le v0, v1, :cond_b

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_b
    invoke-static {v0, v3}, Lnet/time4j/g0;->Q(II)Lnet/time4j/g0;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    return-object p0

    .line 237
    :cond_c
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    const-string v3, "MILLI_OF_DAY out of range: "

    .line 243
    .line 244
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {p0, v0}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object v2

    .line 258
    :cond_d
    sget-object v0, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    .line 259
    .line 260
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_11

    .line 265
    .line 266
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 267
    .line 268
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_e

    .line 273
    .line 274
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, Ljava/lang/Integer;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v1

    .line 284
    goto :goto_5

    .line 285
    :cond_e
    sget-object v1, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 286
    .line 287
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_f

    .line 292
    .line 293
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v1

    .line 303
    mul-int/lit16 v1, v1, 0x3e8

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_f
    sget-object v1, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 307
    .line 308
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eqz v2, :cond_10

    .line 313
    .line 314
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/Integer;

    .line 319
    .line 320
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    mul-int/2addr v1, v4

    .line 325
    goto :goto_5

    .line 326
    :cond_10
    move v1, v3

    .line 327
    :goto_5
    invoke-static {v3, v3, v3, v1}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object p0

    .line 335
    invoke-virtual {v1, v0, p0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    check-cast p0, Lnet/time4j/g0;

    .line 340
    .line 341
    return-object p0

    .line 342
    :cond_11
    sget-object v0, Lnet/time4j/g0;->H:Lnet/time4j/k0;

    .line 343
    .line 344
    invoke-virtual {p0, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-eqz v1, :cond_16

    .line 349
    .line 350
    sget-object v1, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 351
    .line 352
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_12

    .line 357
    .line 358
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    goto :goto_6

    .line 369
    :cond_12
    sget-object v1, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 370
    .line 371
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_13

    .line 376
    .line 377
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    check-cast v1, Ljava/lang/Integer;

    .line 382
    .line 383
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    mul-int/lit16 v1, v1, 0x3e8

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_13
    sget-object v1, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 391
    .line 392
    invoke-virtual {p0, v1}, Lfj/q;->o(Lfj/p;)Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_14

    .line 397
    .line 398
    invoke-virtual {p0, v1}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    check-cast v1, Ljava/lang/Integer;

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    mul-int/2addr v1, v4

    .line 409
    goto :goto_6

    .line 410
    :cond_14
    move v1, v3

    .line 411
    :goto_6
    sget-object v2, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 412
    .line 413
    invoke-virtual {p0, v2}, Lfj/q;->o(Lfj/p;)Z

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    if-eqz v4, :cond_15

    .line 418
    .line 419
    invoke-virtual {p0, v2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    check-cast v2, Ljava/lang/Integer;

    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    goto :goto_7

    .line 430
    :cond_15
    move v2, v3

    .line 431
    :goto_7
    invoke-static {v3, v3, v2, v1}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-virtual {p0, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    invoke-virtual {v1, v0, p0}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    check-cast p0, Lnet/time4j/g0;

    .line 444
    .line 445
    return-object p0

    .line 446
    :cond_16
    return-object v2
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
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
.end method


# virtual methods
.method public a()Lfj/f0;
    .locals 1

    sget-object v0, Lfj/f0;->a:Lfj/f0;

    return-object v0
.end method

.method public b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/g0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/d;",
            "ZZ)",
            "Lnet/time4j/g0;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lnet/time4j/base/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lnet/time4j/h0;->V()Lfj/h0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2, p3, p4}, Lfj/h0;->F(Lfj/q;Lfj/d;ZZ)Lfj/k0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/time4j/h0;

    .line 14
    .line 15
    invoke-virtual {p1}, Lnet/time4j/h0;->a0()Lnet/time4j/g0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p2, Lnet/time4j/g0;->y:Lfj/p;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lfj/q;->o(Lfj/p;)Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lnet/time4j/g0;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    sget-object p2, Lnet/time4j/g0;->Q:Lnet/time4j/c1;

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Lfj/q;->o(Lfj/p;)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ljava/math/BigDecimal;

    .line 48
    .line 49
    invoke-static {p1}, Lnet/time4j/g0;->O0(Ljava/math/BigDecimal;)Lnet/time4j/g0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_2
    sget-object p2, Lnet/time4j/g0;->F:Lnet/time4j/k0;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Lfj/q;->m(Lfj/p;)I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    const/16 p4, 0x18

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    const/4 v1, 0x0

    .line 64
    const/high16 v2, -0x80000000

    .line 65
    .line 66
    if-ne p2, v2, :cond_8

    .line 67
    .line 68
    invoke-static {p1}, Lnet/time4j/g0$f;->h(Lfj/q;)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-ne p2, v2, :cond_3

    .line 73
    .line 74
    invoke-static {p1}, Lnet/time4j/g0$f;->i(Lfj/q;)Lnet/time4j/g0;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_3
    const/4 v3, -0x1

    .line 80
    if-eq p2, v3, :cond_5

    .line 81
    .line 82
    const/4 v4, -0x2

    .line 83
    if-ne p2, v4, :cond_4

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    if-ne p2, p4, :cond_8

    .line 87
    .line 88
    if-nez p3, :cond_8

    .line 89
    .line 90
    const-string p2, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead."

    .line 91
    .line 92
    invoke-static {p1, p2}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_5
    :goto_0
    if-eqz p3, :cond_7

    .line 97
    .line 98
    if-ne p2, v3, :cond_6

    .line 99
    .line 100
    move p2, v1

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    const/16 p2, 0xc

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_7
    const-string p2, "Clock hour cannot be zero."

    .line 106
    .line 107
    invoke-static {p1, p2}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_8
    :goto_1
    sget-object v3, Lnet/time4j/g0;->R:Lnet/time4j/c1;

    .line 112
    .line 113
    invoke-virtual {p1, v3}, Lfj/q;->o(Lfj/p;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v4, :cond_9

    .line 118
    .line 119
    invoke-static {}, Lnet/time4j/g0;->c0()Lfj/z;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-static {p2}, Lnet/time4j/g0;->J0(I)Lnet/time4j/g0;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p1, v3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p3, p2, p1, v1}, Lfj/z;->o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lnet/time4j/g0;

    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_9
    sget-object v3, Lnet/time4j/g0;->G:Lnet/time4j/k0;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Lfj/q;->m(Lfj/p;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-ne v3, v2, :cond_a

    .line 145
    .line 146
    move v3, v1

    .line 147
    :cond_a
    sget-object v4, Lnet/time4j/g0;->S:Lnet/time4j/c1;

    .line 148
    .line 149
    invoke-virtual {p1, v4}, Lfj/q;->o(Lfj/p;)Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    if-eqz v5, :cond_b

    .line 154
    .line 155
    invoke-static {}, Lnet/time4j/g0;->d0()Lfj/z;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-static {p2, v3}, Lnet/time4j/g0;->K0(II)Lnet/time4j/g0;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p1, v4}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-interface {p3, p2, p1, v1}, Lfj/z;->o(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lnet/time4j/g0;

    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_b
    sget-object v4, Lnet/time4j/g0;->I:Lnet/time4j/k0;

    .line 175
    .line 176
    invoke-virtual {p1, v4}, Lfj/q;->m(Lfj/p;)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-ne v4, v2, :cond_c

    .line 181
    .line 182
    move v4, v1

    .line 183
    :cond_c
    sget-object v5, Lnet/time4j/g0;->M:Lnet/time4j/k0;

    .line 184
    .line 185
    invoke-virtual {p1, v5}, Lfj/q;->m(Lfj/p;)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-ne v5, v2, :cond_f

    .line 190
    .line 191
    sget-object v5, Lnet/time4j/g0;->L:Lnet/time4j/k0;

    .line 192
    .line 193
    invoke-virtual {p1, v5}, Lfj/q;->m(Lfj/p;)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-ne v5, v2, :cond_e

    .line 198
    .line 199
    sget-object v5, Lnet/time4j/g0;->K:Lnet/time4j/k0;

    .line 200
    .line 201
    invoke-virtual {p1, v5}, Lfj/q;->m(Lfj/p;)I

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    if-ne v5, v2, :cond_d

    .line 206
    .line 207
    move v5, v1

    .line 208
    goto :goto_2

    .line 209
    :cond_d
    const v2, 0xf4240

    .line 210
    .line 211
    .line 212
    invoke-static {v5, v2}, Lnet/time4j/base/c;->h(II)I

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    goto :goto_2

    .line 217
    :cond_e
    const/16 v2, 0x3e8

    .line 218
    .line 219
    invoke-static {v5, v2}, Lnet/time4j/base/c;->h(II)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    :cond_f
    :goto_2
    if-eqz p3, :cond_12

    .line 224
    .line 225
    int-to-long p2, p2

    .line 226
    const-wide/16 v0, 0xe10

    .line 227
    .line 228
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 229
    .line 230
    .line 231
    move-result-wide p2

    .line 232
    int-to-long v0, v3

    .line 233
    const-wide/16 v2, 0x3c

    .line 234
    .line 235
    invoke-static {v0, v1, v2, v3}, Lnet/time4j/base/c;->i(JJ)J

    .line 236
    .line 237
    .line 238
    move-result-wide v0

    .line 239
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 240
    .line 241
    .line 242
    move-result-wide p2

    .line 243
    int-to-long v0, v4

    .line 244
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 245
    .line 246
    .line 247
    move-result-wide p2

    .line 248
    const-wide/32 v0, 0x3b9aca00

    .line 249
    .line 250
    .line 251
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide p2

    .line 255
    int-to-long v0, v5

    .line 256
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/base/c;->f(JJ)J

    .line 257
    .line 258
    .line 259
    move-result-wide p2

    .line 260
    const-wide v0, 0x4e94914f0000L

    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/g0;->V(JJ)J

    .line 266
    .line 267
    .line 268
    move-result-wide v2

    .line 269
    invoke-static {p2, p3, v0, v1}, Lnet/time4j/g0;->e0(JJ)J

    .line 270
    .line 271
    .line 272
    move-result-wide p2

    .line 273
    const-wide/16 v0, 0x0

    .line 274
    .line 275
    cmp-long p4, p2, v0

    .line 276
    .line 277
    if-eqz p4, :cond_10

    .line 278
    .line 279
    sget-object v4, Lnet/time4j/x;->q:Lfj/p;

    .line 280
    .line 281
    invoke-virtual {p1, v4, p2, p3}, Lfj/q;->z(Lfj/p;J)Z

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    if-eqz v5, :cond_10

    .line 286
    .line 287
    invoke-virtual {p1, v4, p2, p3}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 288
    .line 289
    .line 290
    :cond_10
    cmp-long p1, v2, v0

    .line 291
    .line 292
    if-nez p1, :cond_11

    .line 293
    .line 294
    if-lez p4, :cond_11

    .line 295
    .line 296
    sget-object p1, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 297
    .line 298
    return-object p1

    .line 299
    :cond_11
    invoke-static {v2, v3}, Lnet/time4j/g0;->U(J)Lnet/time4j/g0;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    return-object p1

    .line 304
    :cond_12
    if-ltz p2, :cond_13

    .line 305
    .line 306
    if-ltz v3, :cond_13

    .line 307
    .line 308
    if-ltz v4, :cond_13

    .line 309
    .line 310
    if-ltz v5, :cond_13

    .line 311
    .line 312
    if-ne p2, p4, :cond_13

    .line 313
    .line 314
    or-int p3, v3, v4

    .line 315
    .line 316
    or-int/2addr p3, v5

    .line 317
    if-eqz p3, :cond_14

    .line 318
    .line 319
    :cond_13
    if-ge p2, p4, :cond_15

    .line 320
    .line 321
    const/16 p3, 0x3b

    .line 322
    .line 323
    if-gt v3, p3, :cond_15

    .line 324
    .line 325
    if-gt v4, p3, :cond_15

    .line 326
    .line 327
    const p3, 0x3b9aca00

    .line 328
    .line 329
    .line 330
    if-gt v5, p3, :cond_15

    .line 331
    .line 332
    :cond_14
    invoke-static {p2, v3, v4, v5, v1}, Lnet/time4j/g0;->f0(IIIIZ)Lnet/time4j/g0;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    return-object p1

    .line 337
    :cond_15
    const-string p2, "Time component out of range."

    .line 338
    .line 339
    invoke-static {p1, p2}, Lnet/time4j/g0$f;->e(Lfj/q;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    return-object v0
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
.end method

.method public bridge synthetic c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/g0$f;->b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/g0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(Lnet/time4j/g0;Lfj/d;)Lfj/o;
    .locals 0

    return-object p1
.end method

.method public g(Lfj/y;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lfj/y;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lgj/e;->b(I)Lgj/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2}, Lgj/b;->t(Lgj/e;Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public j()I
    .locals 1

    invoke-static {}, Lnet/time4j/f0;->v0()Lfj/h0;

    move-result-object v0

    invoke-virtual {v0}, Lfj/x;->j()I

    move-result v0

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/g0$f;->f(Lnet/time4j/g0;Lfj/d;)Lfj/o;

    move-result-object p1

    return-object p1
.end method
