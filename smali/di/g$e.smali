.class final Ldi/g$e;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/g;-><init>(Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldi/g$b;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldi/g;


# direct methods
.method constructor <init>(Ldi/g;)V
    .locals 0

    iput-object p1, p0, Ldi/g$e;->k:Ldi/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldi/g$b;)V
    .locals 7

    .line 1
    const-string v0, "supertypes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldi/g$e;->k:Ldi/g;

    .line 7
    .line 8
    invoke-virtual {v0}, Ldi/g;->l()Lmg/d1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ldi/g$e;->k:Ldi/g;

    .line 13
    .line 14
    invoke-virtual {p1}, Ldi/g$b;->a()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v3, Ldi/g$e$c;

    .line 19
    .line 20
    iget-object v4, p0, Ldi/g$e;->k:Ldi/g;

    .line 21
    .line 22
    invoke-direct {v3, v4}, Ldi/g$e$c;-><init>(Ldi/g;)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Ldi/g$e$d;

    .line 26
    .line 27
    iget-object v5, p0, Ldi/g$e;->k:Ldi/g;

    .line 28
    .line 29
    invoke-direct {v4, v5}, Ldi/g$e$d;-><init>(Ldi/g;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1, v2, v3, v4}, Lmg/d1;->a(Ldi/g1;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object v0, p0, Ldi/g$e;->k:Ldi/g;

    .line 44
    .line 45
    invoke-virtual {v0}, Ldi/g;->i()Ldi/g0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v0, v2

    .line 57
    :goto_0
    if-nez v0, :cond_1

    .line 58
    .line 59
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :cond_1
    iget-object v1, p0, Ldi/g$e;->k:Ldi/g;

    .line 64
    .line 65
    invoke-virtual {v1}, Ldi/g;->k()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    iget-object v1, p0, Ldi/g$e;->k:Ldi/g;

    .line 72
    .line 73
    invoke-virtual {v1}, Ldi/g;->l()Lmg/d1;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v3, p0, Ldi/g$e;->k:Ldi/g;

    .line 78
    .line 79
    new-instance v4, Ldi/g$e$a;

    .line 80
    .line 81
    invoke-direct {v4, v3}, Ldi/g$e$a;-><init>(Ldi/g;)V

    .line 82
    .line 83
    .line 84
    new-instance v5, Ldi/g$e$b;

    .line 85
    .line 86
    iget-object v6, p0, Ldi/g$e;->k:Ldi/g;

    .line 87
    .line 88
    invoke-direct {v5, v6}, Ldi/g$e$b;-><init>(Ldi/g;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v3, v0, v4, v5}, Lmg/d1;->a(Ldi/g1;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object v1, p0, Ldi/g$e;->k:Ldi/g;

    .line 95
    .line 96
    instance-of v3, v0, Ljava/util/List;

    .line 97
    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    move-object v2, v0

    .line 101
    check-cast v2, Ljava/util/List;

    .line 102
    .line 103
    :cond_3
    if-nez v2, :cond_4

    .line 104
    .line 105
    invoke-static {v0}, Lkotlin/collections/h;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :cond_4
    invoke-virtual {v1, v2}, Ldi/g;->s(Ljava/util/List;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ldi/g$b;->c(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    return-void
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
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldi/g$b;

    invoke-virtual {p0, p1}, Ldi/g$e;->a(Ldi/g$b;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
