.class public final enum Lnet/time4j/history/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/time4j/history/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lnet/time4j/history/e;

.field public static final enum l:Lnet/time4j/history/e;

.field private static final synthetic m:[Lnet/time4j/history/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/time4j/history/e;

    .line 2
    .line 3
    const-string v1, "WESTERN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/time4j/history/e;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/time4j/history/e;->k:Lnet/time4j/history/e;

    .line 10
    .line 11
    new-instance v1, Lnet/time4j/history/e;

    .line 12
    .line 13
    const-string v3, "EASTERN"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/time4j/history/e;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/time4j/history/e;->l:Lnet/time4j/history/e;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lnet/time4j/history/e;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lnet/time4j/history/e;->m:[Lnet/time4j/history/e;

    .line 29
    .line 30
    return-void
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
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/time4j/history/e;
    .locals 1

    const-class v0, Lnet/time4j/history/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/time4j/history/e;

    return-object p0
.end method

.method public static values()[Lnet/time4j/history/e;
    .locals 1

    sget-object v0, Lnet/time4j/history/e;->m:[Lnet/time4j/history/e;

    invoke-virtual {v0}, [Lnet/time4j/history/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/time4j/history/e;

    return-object v0
.end method


# virtual methods
.method a(I)I
    .locals 5

    .line 1
    const/16 v0, 0x214

    .line 2
    .line 3
    if-lt p1, v0, :cond_1

    .line 4
    .line 5
    div-int/lit8 v0, p1, 0x64

    .line 6
    .line 7
    sget-object v1, Lnet/time4j/history/e;->k:Lnet/time4j/history/e;

    .line 8
    .line 9
    if-ne p0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x62e

    .line 12
    .line 13
    if-le p1, v1, :cond_0

    .line 14
    .line 15
    mul-int/lit8 v1, v0, 0x3

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x3

    .line 18
    .line 19
    div-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    add-int/lit8 v2, v1, 0xf

    .line 22
    .line 23
    mul-int/lit8 v0, v0, 0x8

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0xd

    .line 26
    .line 27
    div-int/lit8 v0, v0, 0x19

    .line 28
    .line 29
    sub-int/2addr v2, v0

    .line 30
    rsub-int/lit8 v0, v1, 0x2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/16 v2, 0xf

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    :goto_0
    rem-int/lit8 v1, p1, 0x13

    .line 37
    .line 38
    mul-int/lit8 v3, v1, 0x13

    .line 39
    .line 40
    add-int/2addr v3, v2

    .line 41
    rem-int/lit8 v3, v3, 0x1e

    .line 42
    .line 43
    div-int/lit8 v2, v3, 0x1d

    .line 44
    .line 45
    div-int/lit8 v4, v3, 0x1c

    .line 46
    .line 47
    sub-int/2addr v4, v2

    .line 48
    div-int/lit8 v1, v1, 0xb

    .line 49
    .line 50
    mul-int/2addr v4, v1

    .line 51
    add-int/2addr v2, v4

    .line 52
    add-int/lit8 v3, v3, 0x15

    .line 53
    .line 54
    sub-int/2addr v3, v2

    .line 55
    div-int/lit8 v1, p1, 0x4

    .line 56
    .line 57
    add-int/2addr p1, v1

    .line 58
    add-int/2addr p1, v0

    .line 59
    rem-int/lit8 p1, p1, 0x7

    .line 60
    .line 61
    rsub-int/lit8 p1, p1, 0x7

    .line 62
    .line 63
    sub-int p1, v3, p1

    .line 64
    .line 65
    rem-int/lit8 p1, p1, 0x7

    .line 66
    .line 67
    rsub-int/lit8 p1, p1, 0x7

    .line 68
    .line 69
    add-int/2addr v3, p1

    .line 70
    return v3

    .line 71
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "Out of range: "

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v0
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
