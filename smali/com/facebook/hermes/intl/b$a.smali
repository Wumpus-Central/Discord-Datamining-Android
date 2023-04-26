.class synthetic Lcom/facebook/hermes/intl/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic a:[I

.field static final synthetic b:[I

.field static final synthetic c:[I

.field static final synthetic d:[I

.field static final synthetic e:[I

.field static final synthetic f:[I

.field static final synthetic g:[I

.field static final synthetic h:[I

.field static final synthetic i:[I

.field static final synthetic j:[I

.field static final synthetic k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/facebook/hermes/intl/b$j;->values()[Lcom/facebook/hermes/intl/b$j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/hermes/intl/b$a;->k:[I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_0
    sget-object v2, Lcom/facebook/hermes/intl/b$j;->k:Lcom/facebook/hermes/intl/b$j;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    :catch_0
    const/4 v0, 0x2

    .line 20
    :try_start_1
    sget-object v2, Lcom/facebook/hermes/intl/b$a;->k:[I

    .line 21
    .line 22
    sget-object v3, Lcom/facebook/hermes/intl/b$j;->l:Lcom/facebook/hermes/intl/b$j;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 29
    .line 30
    :catch_1
    const/4 v2, 0x3

    .line 31
    :try_start_2
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->k:[I

    .line 32
    .line 33
    sget-object v4, Lcom/facebook/hermes/intl/b$j;->m:Lcom/facebook/hermes/intl/b$j;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    aput v2, v3, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 40
    .line 41
    :catch_2
    invoke-static {}, Lcom/facebook/hermes/intl/b$i;->values()[Lcom/facebook/hermes/intl/b$i;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    array-length v3, v3

    .line 46
    new-array v3, v3, [I

    .line 47
    .line 48
    sput-object v3, Lcom/facebook/hermes/intl/b$a;->j:[I

    .line 49
    .line 50
    :try_start_3
    sget-object v4, Lcom/facebook/hermes/intl/b$i;->k:Lcom/facebook/hermes/intl/b$i;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    aput v1, v3, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 57
    .line 58
    :catch_3
    :try_start_4
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->j:[I

    .line 59
    .line 60
    sget-object v4, Lcom/facebook/hermes/intl/b$i;->l:Lcom/facebook/hermes/intl/b$i;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    aput v0, v3, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 67
    .line 68
    :catch_4
    :try_start_5
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->j:[I

    .line 69
    .line 70
    sget-object v4, Lcom/facebook/hermes/intl/b$i;->m:Lcom/facebook/hermes/intl/b$i;

    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    aput v2, v3, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 77
    .line 78
    :catch_5
    invoke-static {}, Lcom/facebook/hermes/intl/b$g;->values()[Lcom/facebook/hermes/intl/b$g;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    array-length v3, v3

    .line 83
    new-array v3, v3, [I

    .line 84
    .line 85
    sput-object v3, Lcom/facebook/hermes/intl/b$a;->i:[I

    .line 86
    .line 87
    :try_start_6
    sget-object v4, Lcom/facebook/hermes/intl/b$g;->k:Lcom/facebook/hermes/intl/b$g;

    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    aput v1, v3, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 94
    .line 95
    :catch_6
    :try_start_7
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->i:[I

    .line 96
    .line 97
    sget-object v4, Lcom/facebook/hermes/intl/b$g;->l:Lcom/facebook/hermes/intl/b$g;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    aput v0, v3, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 104
    .line 105
    :catch_7
    :try_start_8
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->i:[I

    .line 106
    .line 107
    sget-object v4, Lcom/facebook/hermes/intl/b$g;->m:Lcom/facebook/hermes/intl/b$g;

    .line 108
    .line 109
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    aput v2, v3, v4
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 114
    .line 115
    :catch_8
    invoke-static {}, Lcom/facebook/hermes/intl/b$e;->values()[Lcom/facebook/hermes/intl/b$e;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    array-length v3, v3

    .line 120
    new-array v3, v3, [I

    .line 121
    .line 122
    sput-object v3, Lcom/facebook/hermes/intl/b$a;->h:[I

    .line 123
    .line 124
    :try_start_9
    sget-object v4, Lcom/facebook/hermes/intl/b$e;->k:Lcom/facebook/hermes/intl/b$e;

    .line 125
    .line 126
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    aput v1, v3, v4
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 131
    .line 132
    :catch_9
    :try_start_a
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->h:[I

    .line 133
    .line 134
    sget-object v4, Lcom/facebook/hermes/intl/b$e;->l:Lcom/facebook/hermes/intl/b$e;

    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    aput v0, v3, v4
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 141
    .line 142
    :catch_a
    :try_start_b
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->h:[I

    .line 143
    .line 144
    sget-object v4, Lcom/facebook/hermes/intl/b$e;->m:Lcom/facebook/hermes/intl/b$e;

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    aput v2, v3, v4
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 151
    .line 152
    :catch_b
    invoke-static {}, Lcom/facebook/hermes/intl/b$b;->values()[Lcom/facebook/hermes/intl/b$b;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    array-length v3, v3

    .line 157
    new-array v3, v3, [I

    .line 158
    .line 159
    sput-object v3, Lcom/facebook/hermes/intl/b$a;->g:[I

    .line 160
    .line 161
    :try_start_c
    sget-object v4, Lcom/facebook/hermes/intl/b$b;->k:Lcom/facebook/hermes/intl/b$b;

    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    aput v1, v3, v4
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 168
    .line 169
    :catch_c
    :try_start_d
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->g:[I

    .line 170
    .line 171
    sget-object v4, Lcom/facebook/hermes/intl/b$b;->l:Lcom/facebook/hermes/intl/b$b;

    .line 172
    .line 173
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    aput v0, v3, v4
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 178
    .line 179
    :catch_d
    :try_start_e
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->g:[I

    .line 180
    .line 181
    sget-object v4, Lcom/facebook/hermes/intl/b$b;->m:Lcom/facebook/hermes/intl/b$b;

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    aput v2, v3, v4
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 188
    .line 189
    :catch_e
    invoke-static {}, Lcom/facebook/hermes/intl/b$h;->values()[Lcom/facebook/hermes/intl/b$h;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    array-length v3, v3

    .line 194
    new-array v3, v3, [I

    .line 195
    .line 196
    sput-object v3, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 197
    .line 198
    :try_start_f
    sget-object v4, Lcom/facebook/hermes/intl/b$h;->k:Lcom/facebook/hermes/intl/b$h;

    .line 199
    .line 200
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    aput v1, v3, v4
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 205
    .line 206
    :catch_f
    :try_start_10
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 207
    .line 208
    sget-object v4, Lcom/facebook/hermes/intl/b$h;->l:Lcom/facebook/hermes/intl/b$h;

    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 211
    .line 212
    .line 213
    move-result v4

    .line 214
    aput v0, v3, v4
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 215
    .line 216
    :catch_10
    :try_start_11
    sget-object v3, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 217
    .line 218
    sget-object v4, Lcom/facebook/hermes/intl/b$h;->m:Lcom/facebook/hermes/intl/b$h;

    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    aput v2, v3, v4
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    .line 225
    .line 226
    :catch_11
    const/4 v3, 0x4

    .line 227
    :try_start_12
    sget-object v4, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 228
    .line 229
    sget-object v5, Lcom/facebook/hermes/intl/b$h;->n:Lcom/facebook/hermes/intl/b$h;

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    aput v3, v4, v5
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    .line 236
    .line 237
    :catch_12
    const/4 v4, 0x5

    .line 238
    :try_start_13
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 239
    .line 240
    sget-object v6, Lcom/facebook/hermes/intl/b$h;->o:Lcom/facebook/hermes/intl/b$h;

    .line 241
    .line 242
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    aput v4, v5, v6
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    .line 247
    .line 248
    :catch_13
    :try_start_14
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->f:[I

    .line 249
    .line 250
    sget-object v6, Lcom/facebook/hermes/intl/b$h;->p:Lcom/facebook/hermes/intl/b$h;

    .line 251
    .line 252
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    const/4 v7, 0x6

    .line 257
    aput v7, v5, v6
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    .line 258
    .line 259
    :catch_14
    invoke-static {}, Lcom/facebook/hermes/intl/b$l;->values()[Lcom/facebook/hermes/intl/b$l;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    array-length v5, v5

    .line 264
    new-array v5, v5, [I

    .line 265
    .line 266
    sput-object v5, Lcom/facebook/hermes/intl/b$a;->e:[I

    .line 267
    .line 268
    :try_start_15
    sget-object v6, Lcom/facebook/hermes/intl/b$l;->k:Lcom/facebook/hermes/intl/b$l;

    .line 269
    .line 270
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    aput v1, v5, v6
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    .line 275
    .line 276
    :catch_15
    :try_start_16
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->e:[I

    .line 277
    .line 278
    sget-object v6, Lcom/facebook/hermes/intl/b$l;->l:Lcom/facebook/hermes/intl/b$l;

    .line 279
    .line 280
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    aput v0, v5, v6
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    .line 285
    .line 286
    :catch_16
    :try_start_17
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->e:[I

    .line 287
    .line 288
    sget-object v6, Lcom/facebook/hermes/intl/b$l;->m:Lcom/facebook/hermes/intl/b$l;

    .line 289
    .line 290
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    aput v2, v5, v6
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    .line 295
    .line 296
    :catch_17
    invoke-static {}, Lcom/facebook/hermes/intl/b$c;->values()[Lcom/facebook/hermes/intl/b$c;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    array-length v5, v5

    .line 301
    new-array v5, v5, [I

    .line 302
    .line 303
    sput-object v5, Lcom/facebook/hermes/intl/b$a;->d:[I

    .line 304
    .line 305
    :try_start_18
    sget-object v6, Lcom/facebook/hermes/intl/b$c;->k:Lcom/facebook/hermes/intl/b$c;

    .line 306
    .line 307
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 308
    .line 309
    .line 310
    move-result v6

    .line 311
    aput v1, v5, v6
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    .line 312
    .line 313
    :catch_18
    :try_start_19
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->d:[I

    .line 314
    .line 315
    sget-object v6, Lcom/facebook/hermes/intl/b$c;->l:Lcom/facebook/hermes/intl/b$c;

    .line 316
    .line 317
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    aput v0, v5, v6
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    .line 322
    .line 323
    :catch_19
    :try_start_1a
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->d:[I

    .line 324
    .line 325
    sget-object v6, Lcom/facebook/hermes/intl/b$c;->m:Lcom/facebook/hermes/intl/b$c;

    .line 326
    .line 327
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    aput v2, v5, v6
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    .line 332
    .line 333
    :catch_1a
    :try_start_1b
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->d:[I

    .line 334
    .line 335
    sget-object v6, Lcom/facebook/hermes/intl/b$c;->n:Lcom/facebook/hermes/intl/b$c;

    .line 336
    .line 337
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 338
    .line 339
    .line 340
    move-result v6

    .line 341
    aput v3, v5, v6
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    .line 342
    .line 343
    :catch_1b
    invoke-static {}, Lcom/facebook/hermes/intl/b$k;->values()[Lcom/facebook/hermes/intl/b$k;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    array-length v5, v5

    .line 348
    new-array v5, v5, [I

    .line 349
    .line 350
    sput-object v5, Lcom/facebook/hermes/intl/b$a;->c:[I

    .line 351
    .line 352
    :try_start_1c
    sget-object v6, Lcom/facebook/hermes/intl/b$k;->k:Lcom/facebook/hermes/intl/b$k;

    .line 353
    .line 354
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 355
    .line 356
    .line 357
    move-result v6

    .line 358
    aput v1, v5, v6
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    .line 359
    .line 360
    :catch_1c
    :try_start_1d
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->c:[I

    .line 361
    .line 362
    sget-object v6, Lcom/facebook/hermes/intl/b$k;->l:Lcom/facebook/hermes/intl/b$k;

    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    aput v0, v5, v6
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    .line 369
    .line 370
    :catch_1d
    :try_start_1e
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->c:[I

    .line 371
    .line 372
    sget-object v6, Lcom/facebook/hermes/intl/b$k;->m:Lcom/facebook/hermes/intl/b$k;

    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    aput v2, v5, v6
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    .line 379
    .line 380
    :catch_1e
    :try_start_1f
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->c:[I

    .line 381
    .line 382
    sget-object v6, Lcom/facebook/hermes/intl/b$k;->n:Lcom/facebook/hermes/intl/b$k;

    .line 383
    .line 384
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    aput v3, v5, v6
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    .line 389
    .line 390
    :catch_1f
    invoke-static {}, Lcom/facebook/hermes/intl/b$f;->values()[Lcom/facebook/hermes/intl/b$f;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    array-length v5, v5

    .line 395
    new-array v5, v5, [I

    .line 396
    .line 397
    sput-object v5, Lcom/facebook/hermes/intl/b$a;->b:[I

    .line 398
    .line 399
    :try_start_20
    sget-object v6, Lcom/facebook/hermes/intl/b$f;->k:Lcom/facebook/hermes/intl/b$f;

    .line 400
    .line 401
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 402
    .line 403
    .line 404
    move-result v6

    .line 405
    aput v1, v5, v6
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    .line 406
    .line 407
    :catch_20
    :try_start_21
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->b:[I

    .line 408
    .line 409
    sget-object v6, Lcom/facebook/hermes/intl/b$f;->l:Lcom/facebook/hermes/intl/b$f;

    .line 410
    .line 411
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 412
    .line 413
    .line 414
    move-result v6

    .line 415
    aput v0, v5, v6
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    .line 416
    .line 417
    :catch_21
    :try_start_22
    sget-object v5, Lcom/facebook/hermes/intl/b$a;->b:[I

    .line 418
    .line 419
    sget-object v6, Lcom/facebook/hermes/intl/b$f;->m:Lcom/facebook/hermes/intl/b$f;

    .line 420
    .line 421
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    aput v2, v5, v6
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    .line 426
    .line 427
    :catch_22
    :try_start_23
    sget-object v2, Lcom/facebook/hermes/intl/b$a;->b:[I

    .line 428
    .line 429
    sget-object v5, Lcom/facebook/hermes/intl/b$f;->n:Lcom/facebook/hermes/intl/b$f;

    .line 430
    .line 431
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    aput v3, v2, v5
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    .line 436
    .line 437
    :catch_23
    :try_start_24
    sget-object v2, Lcom/facebook/hermes/intl/b$a;->b:[I

    .line 438
    .line 439
    sget-object v3, Lcom/facebook/hermes/intl/b$f;->o:Lcom/facebook/hermes/intl/b$f;

    .line 440
    .line 441
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    aput v4, v2, v3
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    .line 446
    .line 447
    :catch_24
    invoke-static {}, Lcom/facebook/hermes/intl/b$d;->values()[Lcom/facebook/hermes/intl/b$d;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    array-length v2, v2

    .line 452
    new-array v2, v2, [I

    .line 453
    .line 454
    sput-object v2, Lcom/facebook/hermes/intl/b$a;->a:[I

    .line 455
    .line 456
    :try_start_25
    sget-object v3, Lcom/facebook/hermes/intl/b$d;->k:Lcom/facebook/hermes/intl/b$d;

    .line 457
    .line 458
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    aput v1, v2, v3
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    .line 463
    .line 464
    :catch_25
    :try_start_26
    sget-object v1, Lcom/facebook/hermes/intl/b$a;->a:[I

    .line 465
    .line 466
    sget-object v2, Lcom/facebook/hermes/intl/b$d;->l:Lcom/facebook/hermes/intl/b$d;

    .line 467
    .line 468
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 469
    .line 470
    .line 471
    move-result v2

    .line 472
    aput v0, v1, v2
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    .line 473
    .line 474
    :catch_26
    return-void
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
.end method
