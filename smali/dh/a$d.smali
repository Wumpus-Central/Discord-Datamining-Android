.class final Ldh/a$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldh/a;->C(Lhi/i;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ldh/a$a;",
        "Ljava/lang/Iterable<",
        "+",
        "Ldh/a$a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic k:Ldh/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldh/a<",
            "TTAnnotation;>;"
        }
    .end annotation
.end field

.field final synthetic l:Lhi/p;


# direct methods
.method constructor <init>(Ldh/a;Lhi/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldh/a<",
            "TTAnnotation;>;",
            "Lhi/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Ldh/a$d;->k:Ldh/a;

    iput-object p2, p0, Ldh/a$d;->l:Lhi/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ldh/a$a;)Ljava/lang/Iterable;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldh/a$a;",
            ")",
            "Ljava/lang/Iterable<",
            "Ldh/a$a;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldh/a$d;->k:Ldh/a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ldh/a;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Ldh/a$d;->l:Lhi/p;

    .line 22
    .line 23
    invoke-interface {v2, v0}, Lhi/p;->E0(Lhi/i;)Lhi/g;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v2, p0, Ldh/a$d;->l:Lhi/p;

    .line 30
    .line 31
    invoke-interface {v2, v0}, Lhi/p;->y0(Lhi/g;)Lhi/j;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v0, v1

    .line 37
    :goto_0
    if-eqz v0, :cond_1

    .line 38
    .line 39
    return-object v1

    .line 40
    :cond_1
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    iget-object v2, p0, Ldh/a$d;->l:Lhi/p;

    .line 47
    .line 48
    invoke-interface {v2, v0}, Lhi/p;->C0(Lhi/i;)Lhi/n;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    iget-object v2, p0, Ldh/a$d;->l:Lhi/p;

    .line 55
    .line 56
    invoke-interface {v2, v0}, Lhi/p;->u(Lhi/n;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget-object v2, p0, Ldh/a$d;->l:Lhi/p;

    .line 63
    .line 64
    invoke-virtual {p1}, Ldh/a$a;->b()Lhi/i;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-interface {v2, v3}, Lhi/p;->l0(Lhi/i;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v3, p0, Ldh/a$d;->l:Lhi/p;

    .line 73
    .line 74
    iget-object v4, p0, Ldh/a$d;->k:Ldh/a;

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    new-instance v7, Ljava/util/ArrayList;

    .line 85
    .line 86
    const/16 v8, 0xa

    .line 87
    .line 88
    invoke-static {v0, v8}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v2, v8}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_3

    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Lhi/m;

    .line 124
    .line 125
    check-cast v0, Lhi/o;

    .line 126
    .line 127
    invoke-interface {v3, v2}, Lhi/p;->F0(Lhi/m;)Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_2

    .line 132
    .line 133
    new-instance v2, Ldh/a$a;

    .line 134
    .line 135
    invoke-virtual {p1}, Ldh/a$a;->a()Lvg/y;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-direct {v2, v1, v8, v0}, Ldh/a$a;-><init>(Lhi/i;Lvg/y;Lhi/o;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_2
    invoke-interface {v3, v2}, Lhi/p;->p0(Lhi/m;)Lhi/i;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    new-instance v8, Ldh/a$a;

    .line 148
    .line 149
    invoke-virtual {p1}, Ldh/a$a;->a()Lvg/y;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-static {v4, v2, v9}, Ldh/a;->a(Ldh/a;Lhi/i;Lvg/y;)Lvg/y;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    invoke-direct {v8, v2, v9, v0}, Ldh/a$a;-><init>(Lhi/i;Lvg/y;Lhi/o;)V

    .line 158
    .line 159
    .line 160
    move-object v2, v8

    .line 161
    :goto_2
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_3
    move-object v1, v7

    .line 166
    :cond_4
    return-object v1
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

    check-cast p1, Ldh/a$a;

    invoke-virtual {p0, p1}, Ldh/a$d;->a(Ldh/a$a;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
