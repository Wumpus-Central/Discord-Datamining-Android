.class Lnet/time4j/calendar/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/v;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/calendar/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lfj/q<",
        "TT;>;:",
        "Lfj/g;",
        ">",
        "Ljava/lang/Object;",
        "Lfj/v<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final k:Lnet/time4j/calendar/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/time4j/calendar/r<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final l:J

.field private final m:Lnet/time4j/x0;


# direct methods
.method constructor <init>(Lnet/time4j/calendar/r;ILnet/time4j/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/time4j/calendar/r<",
            "TT;>;I",
            "Lnet/time4j/x0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lnet/time4j/calendar/r$b;->k:Lnet/time4j/calendar/r;

    .line 7
    .line 8
    int-to-long p1, p2

    .line 9
    iput-wide p1, p0, Lnet/time4j/calendar/r$b;->l:J

    .line 10
    .line 11
    iput-object p3, p0, Lnet/time4j/calendar/r$b;->m:Lnet/time4j/x0;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 15
    .line 16
    const-string p2, "Missing value."

    .line 17
    .line 18
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1
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
.end method


# virtual methods
.method public a(Lfj/q;)Lfj/q;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/time4j/calendar/r$b;->k:Lnet/time4j/calendar/r;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/time4j/calendar/r;->B(Lnet/time4j/calendar/r;)Lfj/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/time4j/x0;

    .line 12
    .line 13
    iget-object v1, p0, Lnet/time4j/calendar/r$b;->k:Lnet/time4j/calendar/r;

    .line 14
    .line 15
    invoke-static {v1}, Lnet/time4j/calendar/r;->C(Lnet/time4j/calendar/r;)Lfj/p;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1, v1}, Lfj/q;->m(Lfj/p;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-wide v2, p0, Lnet/time4j/calendar/r$b;->l:J

    .line 24
    .line 25
    const-wide/32 v4, 0x7fffffff

    .line 26
    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    const-wide/16 v3, 0x7

    .line 31
    .line 32
    const/4 v5, 0x7

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v2, p0, Lnet/time4j/calendar/r$b;->k:Lnet/time4j/calendar/r;

    .line 36
    .line 37
    invoke-static {v2}, Lnet/time4j/calendar/r;->C(Lnet/time4j/calendar/r;)Lfj/p;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1, v2}, Lfj/q;->c(Lfj/p;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v0}, Lnet/time4j/x0;->b()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sub-int/2addr v2, v1

    .line 56
    rem-int/lit8 v1, v2, 0x7

    .line 57
    .line 58
    add-int/2addr v0, v1

    .line 59
    if-le v0, v5, :cond_0

    .line 60
    .line 61
    add-int/lit8 v0, v0, -0x7

    .line 62
    .line 63
    :cond_0
    iget-object v1, p0, Lnet/time4j/calendar/r$b;->m:Lnet/time4j/x0;

    .line 64
    .line 65
    invoke-virtual {v1}, Lnet/time4j/x0;->b()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    sub-int/2addr v1, v0

    .line 70
    add-int/2addr v2, v1

    .line 71
    int-to-long v5, v2

    .line 72
    if-lez v1, :cond_2

    .line 73
    .line 74
    sub-long/2addr v5, v3

    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object v2, p0, Lnet/time4j/calendar/r$b;->m:Lnet/time4j/x0;

    .line 77
    .line 78
    invoke-virtual {v2}, Lnet/time4j/x0;->b()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-virtual {v0}, Lnet/time4j/x0;->b()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    sub-int/2addr v2, v0

    .line 87
    iget-wide v6, p0, Lnet/time4j/calendar/r$b;->l:J

    .line 88
    .line 89
    add-int/2addr v1, v2

    .line 90
    add-int/lit8 v1, v1, -0x1

    .line 91
    .line 92
    invoke-static {v1, v5}, Lnet/time4j/base/c;->a(II)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    int-to-long v0, v0

    .line 99
    sub-long/2addr v6, v0

    .line 100
    mul-long/2addr v6, v3

    .line 101
    int-to-long v0, v2

    .line 102
    add-long v5, v6, v0

    .line 103
    .line 104
    :cond_2
    :goto_0
    move-object v0, p1

    .line 105
    check-cast v0, Lfj/g;

    .line 106
    .line 107
    invoke-interface {v0}, Lfj/g;->b()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    sget-object v2, Lfj/a0;->k:Lfj/a0;

    .line 112
    .line 113
    add-long/2addr v0, v5

    .line 114
    invoke-virtual {p1, v2, v0, v1}, Lfj/q;->D(Lfj/p;J)Lfj/q;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    return-object p1
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
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfj/q;

    invoke-virtual {p0, p1}, Lnet/time4j/calendar/r$b;->a(Lfj/q;)Lfj/q;

    move-result-object p1

    return-object p1
.end method
