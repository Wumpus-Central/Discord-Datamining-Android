.class final Lve/b$c;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lve/b;->d(Lve/b;Lve/c;Landroid/animation/ValueAnimator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Lve/c$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "Lve/c$a;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# instance fields
.field final synthetic k:Lve/c;

.field final synthetic l:Landroid/animation/ValueAnimator;


# direct methods
.method constructor <init>(Lve/c;Landroid/animation/ValueAnimator;)V
    .locals 0

    iput-object p1, p0, Lve/b$c;->k:Lve/c;

    iput-object p2, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lve/c$a;)V
    .locals 4

    .line 1
    const-string v0, "$this$applyUpdate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lve/c;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "null cannot be cast to non-null type kotlin.Float"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    const-string v2, "zoom"

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Float;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, Lve/b$c;->k:Lve/c;

    .line 33
    .line 34
    invoke-virtual {v2}, Lve/c;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-virtual {p1, v0, v2}, Lve/c$a;->i(FZ)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 43
    .line 44
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_1
    :goto_0
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 49
    .line 50
    invoke-virtual {v0}, Lve/c;->f()Lcom/otaliastudios/zoom/AbsolutePoint;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "panY"

    .line 55
    .line 56
    const-string v3, "panX"

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    iget-object v0, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    check-cast v0, Ljava/lang/Float;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object v3, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    .line 75
    .line 76
    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    check-cast v2, Ljava/lang/Float;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    new-instance v2, Lcom/otaliastudios/zoom/AbsolutePoint;

    .line 89
    .line 90
    invoke-direct {v2, v0, v1}, Lcom/otaliastudios/zoom/AbsolutePoint;-><init>(FF)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 94
    .line 95
    invoke-virtual {v0}, Lve/c;->a()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-virtual {p1, v2, v0}, Lve/c$a;->d(Lcom/otaliastudios/zoom/AbsolutePoint;Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 104
    .line 105
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    .line 110
    .line 111
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_4
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 116
    .line 117
    invoke-virtual {v0}, Lve/c;->i()Lcom/otaliastudios/zoom/ScaledPoint;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    iget-object v0, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    .line 124
    .line 125
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    check-cast v0, Ljava/lang/Float;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    iget-object v3, p0, Lve/b$c;->l:Landroid/animation/ValueAnimator;

    .line 138
    .line 139
    invoke-virtual {v3, v2}, Landroid/animation/ValueAnimator;->getAnimatedValue(Ljava/lang/String;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    check-cast v2, Ljava/lang/Float;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    new-instance v2, Lcom/otaliastudios/zoom/ScaledPoint;

    .line 152
    .line 153
    invoke-direct {v2, v0, v1}, Lcom/otaliastudios/zoom/ScaledPoint;-><init>(FF)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 157
    .line 158
    invoke-virtual {v0}, Lve/c;->a()Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    invoke-virtual {p1, v2, v0}, Lve/c$a;->e(Lcom/otaliastudios/zoom/ScaledPoint;Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    .line 167
    .line 168
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p1

    .line 172
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    .line 173
    .line 174
    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1

    .line 178
    :cond_7
    :goto_1
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 179
    .line 180
    invoke-virtual {v0}, Lve/c;->g()Ljava/lang/Float;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-object v1, p0, Lve/b$c;->k:Lve/c;

    .line 185
    .line 186
    invoke-virtual {v1}, Lve/c;->h()Ljava/lang/Float;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {p1, v0, v1}, Lve/c$a;->f(Ljava/lang/Float;Ljava/lang/Float;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lve/b$c;->k:Lve/c;

    .line 194
    .line 195
    invoke-virtual {v0}, Lve/c;->e()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    invoke-virtual {p1, v0}, Lve/c$a;->g(Z)V

    .line 200
    .line 201
    .line 202
    return-void
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

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lve/c$a;

    invoke-virtual {p0, p1}, Lve/b$c;->a(Lve/c$a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
