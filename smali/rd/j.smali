.class public abstract Lrd/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lgd/a;

.field private final b:Lrd/s;


# direct methods
.method constructor <init>(Lgd/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrd/j;->a:Lgd/a;

    .line 5
    .line 6
    new-instance v0, Lrd/s;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lrd/s;-><init>(Lgd/a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lrd/j;->b:Lrd/s;

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
.end method

.method public static a(Lgd/a;)Lrd/j;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lgd/a;->d(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lrd/g;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lrd/g;-><init>(Lgd/a;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v1, 0x2

    .line 15
    invoke-virtual {p0, v1}, Lgd/a;->d(I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v0, Lrd/k;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lrd/k;-><init>(Lgd/a;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    const/4 v1, 0x4

    .line 28
    invoke-static {p0, v0, v1}, Lrd/s;->g(Lgd/a;II)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eq v2, v1, :cond_5

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    if-eq v2, v1, :cond_4

    .line 36
    .line 37
    invoke-static {p0, v0, v1}, Lrd/s;->g(Lgd/a;II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/16 v2, 0xc

    .line 42
    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    const/16 v2, 0xd

    .line 46
    .line 47
    if-eq v1, v2, :cond_2

    .line 48
    .line 49
    const/4 v1, 0x7

    .line 50
    invoke-static {p0, v0, v1}, Lrd/s;->g(Lgd/a;II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const-string v1, "17"

    .line 55
    .line 56
    const-string v2, "15"

    .line 57
    .line 58
    const-string v3, "13"

    .line 59
    .line 60
    const-string v4, "11"

    .line 61
    .line 62
    const-string v5, "320"

    .line 63
    .line 64
    const-string v6, "310"

    .line 65
    .line 66
    packed-switch v0, :pswitch_data_0

    .line 67
    .line 68
    .line 69
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v1, "unknown decoder: "

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :pswitch_0
    new-instance v0, Lrd/e;

    .line 86
    .line 87
    invoke-direct {v0, p0, v5, v1}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    new-instance v0, Lrd/e;

    .line 92
    .line 93
    invoke-direct {v0, p0, v6, v1}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    new-instance v0, Lrd/e;

    .line 98
    .line 99
    invoke-direct {v0, p0, v5, v2}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :pswitch_3
    new-instance v0, Lrd/e;

    .line 104
    .line 105
    invoke-direct {v0, p0, v6, v2}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_4
    new-instance v0, Lrd/e;

    .line 110
    .line 111
    invoke-direct {v0, p0, v5, v3}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_5
    new-instance v0, Lrd/e;

    .line 116
    .line 117
    invoke-direct {v0, p0, v6, v3}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_6
    new-instance v0, Lrd/e;

    .line 122
    .line 123
    invoke-direct {v0, p0, v5, v4}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_7
    new-instance v0, Lrd/e;

    .line 128
    .line 129
    invoke-direct {v0, p0, v6, v4}, Lrd/e;-><init>(Lgd/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :cond_2
    new-instance v0, Lrd/d;

    .line 134
    .line 135
    invoke-direct {v0, p0}, Lrd/d;-><init>(Lgd/a;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_3
    new-instance v0, Lrd/c;

    .line 140
    .line 141
    invoke-direct {v0, p0}, Lrd/c;-><init>(Lgd/a;)V

    .line 142
    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_4
    new-instance v0, Lrd/b;

    .line 146
    .line 147
    invoke-direct {v0, p0}, Lrd/b;-><init>(Lgd/a;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_5
    new-instance v0, Lrd/a;

    .line 152
    .line 153
    invoke-direct {v0, p0}, Lrd/a;-><init>(Lgd/a;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x38
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method


# virtual methods
.method protected final b()Lrd/s;
    .locals 1

    iget-object v0, p0, Lrd/j;->b:Lrd/s;

    return-object v0
.end method

.method protected final c()Lgd/a;
    .locals 1

    iget-object v0, p0, Lrd/j;->a:Lgd/a;

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method
