.class Landroidx/exifinterface/media/a$a;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/exifinterface/media/a;->k(Landroidx/exifinterface/media/a$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field k:J

.field final synthetic l:Landroidx/exifinterface/media/a$g;

.field final synthetic m:Landroidx/exifinterface/media/a;


# direct methods
.method constructor <init>(Landroidx/exifinterface/media/a;Landroidx/exifinterface/media/a$g;)V
    .locals 0

    iput-object p1, p0, Landroidx/exifinterface/media/a$a;->m:Landroidx/exifinterface/media/a;

    iput-object p2, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public getSize()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public readAt(J[BII)I
    .locals 6

    .line 1
    if-nez p5, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    const/4 v3, -0x1

    .line 10
    if-gez v2, :cond_1

    .line 11
    .line 12
    return v3

    .line 13
    :cond_1
    :try_start_0
    iget-wide v4, p0, Landroidx/exifinterface/media/a$a;->k:J

    .line 14
    .line 15
    cmp-long v2, v4, p1

    .line 16
    .line 17
    if-eqz v2, :cond_3

    .line 18
    .line 19
    cmp-long v0, v4, v0

    .line 20
    .line 21
    if-ltz v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/exifinterface/media/a$b;->available()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v0, v0

    .line 30
    add-long/2addr v4, v0

    .line 31
    cmp-long v0, p1, v4

    .line 32
    .line 33
    if-ltz v0, :cond_2

    .line 34
    .line 35
    return v3

    .line 36
    :cond_2
    iget-object v0, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Landroidx/exifinterface/media/a$g;->l(J)V

    .line 39
    .line 40
    .line 41
    iput-wide p1, p0, Landroidx/exifinterface/media/a$a;->k:J

    .line 42
    .line 43
    :cond_3
    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->available()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-le p5, p1, :cond_4

    .line 50
    .line 51
    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroidx/exifinterface/media/a$b;->available()I

    .line 54
    .line 55
    .line 56
    move-result p5

    .line 57
    :cond_4
    iget-object p1, p0, Landroidx/exifinterface/media/a$a;->l:Landroidx/exifinterface/media/a$g;

    .line 58
    .line 59
    invoke-virtual {p1, p3, p4, p5}, Landroidx/exifinterface/media/a$b;->read([BII)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ltz p1, :cond_5

    .line 64
    .line 65
    iget-wide p2, p0, Landroidx/exifinterface/media/a$a;->k:J

    .line 66
    .line 67
    int-to-long p4, p1

    .line 68
    add-long/2addr p2, p4

    .line 69
    iput-wide p2, p0, Landroidx/exifinterface/media/a$a;->k:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    return p1

    .line 72
    :catch_0
    :cond_5
    const-wide/16 p1, -0x1

    .line 73
    .line 74
    iput-wide p1, p0, Landroidx/exifinterface/media/a$a;->k:J

    .line 75
    .line 76
    return v3
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
.end method
