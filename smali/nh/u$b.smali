.class Lnh/u$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnh/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "Lnh/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lnh/u$b;->a:Ljava/util/Stack;

    return-void
.end method

.method synthetic constructor <init>(Lnh/u$a;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lnh/u$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lnh/u$b;Lnh/d;Lnh/d;)Lnh/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lnh/u$b;->b(Lnh/d;Lnh/d;)Lnh/d;

    move-result-object p0

    return-object p0
.end method

.method private b(Lnh/d;Lnh/d;)Lnh/d;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lnh/u$b;->c(Lnh/d;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Lnh/u$b;->c(Lnh/d;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnh/d;

    .line 14
    .line 15
    :goto_0
    iget-object p2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    iget-object p2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lnh/d;

    .line 30
    .line 31
    new-instance v0, Lnh/u;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p2, p1, v1}, Lnh/u;-><init>(Lnh/d;Lnh/d;Lnh/u$a;)V

    .line 35
    .line 36
    .line 37
    move-object p1, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-object p1
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

.method private c(Lnh/d;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lnh/d;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lnh/u$b;->e(Lnh/d;)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v0, p1, Lnh/u;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lnh/u;

    .line 16
    .line 17
    invoke-static {p1}, Lnh/u;->F(Lnh/u;)Lnh/d;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-direct {p0, v0}, Lnh/u$b;->c(Lnh/d;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Lnh/u;->G(Lnh/u;)Lnh/d;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Lnh/u$b;->c(Lnh/d;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/lit8 v2, v2, 0x31

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 51
    .line 52
    .line 53
    const-string v2, "Has a new type of ByteString been created? Found "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
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
.end method

.method private d(I)I
    .locals 1

    invoke-static {}, Lnh/u;->H()[I

    move-result-object v0

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([II)I

    move-result p1

    if-gez p1, :cond_0

    add-int/lit8 p1, p1, 0x1

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    :cond_0
    return p1
.end method

.method private e(Lnh/d;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lnh/d;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, v0}, Lnh/u$b;->d(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {}, Lnh/u;->H()[I

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    add-int/lit8 v2, v0, 0x1

    .line 14
    .line 15
    aget v1, v1, v2

    .line 16
    .line 17
    iget-object v2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_3

    .line 24
    .line 25
    iget-object v2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Lnh/d;

    .line 32
    .line 33
    invoke-virtual {v2}, Lnh/d;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-lt v2, v1, :cond_0

    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_0
    invoke-static {}, Lnh/u;->H()[I

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    aget v0, v1, v0

    .line 46
    .line 47
    iget-object v1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lnh/d;

    .line 54
    .line 55
    :goto_0
    iget-object v2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v3, 0x0

    .line 62
    if-nez v2, :cond_1

    .line 63
    .line 64
    iget-object v2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lnh/d;

    .line 71
    .line 72
    invoke-virtual {v2}, Lnh/d;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-ge v2, v0, :cond_1

    .line 77
    .line 78
    iget-object v2, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lnh/d;

    .line 85
    .line 86
    new-instance v4, Lnh/u;

    .line 87
    .line 88
    invoke-direct {v4, v2, v1, v3}, Lnh/u;-><init>(Lnh/d;Lnh/d;Lnh/u$a;)V

    .line 89
    .line 90
    .line 91
    move-object v1, v4

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    new-instance v0, Lnh/u;

    .line 94
    .line 95
    invoke-direct {v0, v1, p1, v3}, Lnh/u;-><init>(Lnh/d;Lnh/d;Lnh/u$a;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    iget-object p1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-nez p1, :cond_2

    .line 105
    .line 106
    invoke-virtual {v0}, Lnh/d;->size()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-direct {p0, p1}, Lnh/u$b;->d(I)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-static {}, Lnh/u;->H()[I

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    add-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    aget p1, v1, p1

    .line 121
    .line 122
    iget-object v1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, Lnh/d;

    .line 129
    .line 130
    invoke-virtual {v1}, Lnh/d;->size()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-ge v1, p1, :cond_2

    .line 135
    .line 136
    iget-object p1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    check-cast p1, Lnh/d;

    .line 143
    .line 144
    new-instance v1, Lnh/u;

    .line 145
    .line 146
    invoke-direct {v1, p1, v0, v3}, Lnh/u;-><init>(Lnh/d;Lnh/d;Lnh/u$a;)V

    .line 147
    .line 148
    .line 149
    move-object v0, v1

    .line 150
    goto :goto_1

    .line 151
    :cond_2
    iget-object p1, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 152
    .line 153
    invoke-virtual {p1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_3
    :goto_2
    iget-object v0, p0, Lnh/u$b;->a:Ljava/util/Stack;

    .line 158
    .line 159
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    :goto_3
    return-void
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
