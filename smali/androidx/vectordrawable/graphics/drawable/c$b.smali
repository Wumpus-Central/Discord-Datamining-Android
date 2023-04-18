.class Landroidx/vectordrawable/graphics/drawable/c$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/vectordrawable/graphics/drawable/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field a:I

.field b:Landroidx/vectordrawable/graphics/drawable/h;

.field c:Landroid/animation/AnimatorSet;

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field

.field e:Landroidx/collection/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/a<",
            "Landroid/animation/Animator;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/vectordrawable/graphics/drawable/c$b;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    iget p1, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->a:I

    .line 7
    .line 8
    iput p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->a:I

    .line 9
    .line 10
    iget-object p1, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/vectordrawable/graphics/drawable/h;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p4, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1, p4}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Landroidx/vectordrawable/graphics/drawable/h;

    .line 26
    .line 27
    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Landroidx/vectordrawable/graphics/drawable/h;

    .line 35
    .line 36
    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 37
    .line 38
    :goto_0
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/vectordrawable/graphics/drawable/h;->mutate()Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Landroidx/vectordrawable/graphics/drawable/h;

    .line 45
    .line 46
    iput-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 47
    .line 48
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 52
    .line 53
    iget-object p3, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 54
    .line 55
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object p3

    .line 59
    invoke-virtual {p1, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/vectordrawable/graphics/drawable/h;->h(Z)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object p1, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->d:Ljava/util/ArrayList;

    .line 68
    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    new-instance p3, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-direct {p3, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    iput-object p3, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->d:Ljava/util/ArrayList;

    .line 81
    .line 82
    new-instance p3, Landroidx/collection/a;

    .line 83
    .line 84
    invoke-direct {p3, p1}, Landroidx/collection/a;-><init>(I)V

    .line 85
    .line 86
    .line 87
    iput-object p3, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->e:Landroidx/collection/a;

    .line 88
    .line 89
    :goto_1
    if-ge v0, p1, :cond_2

    .line 90
    .line 91
    iget-object p3, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->d:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    check-cast p3, Landroid/animation/Animator;

    .line 98
    .line 99
    invoke-virtual {p3}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    iget-object v1, p2, Landroidx/vectordrawable/graphics/drawable/c$b;->e:Landroidx/collection/a;

    .line 104
    .line 105
    invoke-virtual {v1, p3}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p3

    .line 109
    check-cast p3, Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->b:Landroidx/vectordrawable/graphics/drawable/h;

    .line 112
    .line 113
    invoke-virtual {v1, p3}, Landroidx/vectordrawable/graphics/drawable/h;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p4, v1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->d:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->e:Landroidx/collection/a;

    .line 126
    .line 127
    invoke-virtual {v1, p4, p3}, Landroidx/collection/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    add-int/lit8 v0, v0, 0x1

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_2
    invoke-virtual {p0}, Landroidx/vectordrawable/graphics/drawable/c$b;->a()V

    .line 134
    .line 135
    .line 136
    :cond_3
    return-void
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


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->c:Landroid/animation/AnimatorSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->c:Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->c:Landroid/animation/AnimatorSet;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->d:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-void
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
.end method

.method public getChangingConfigurations()I
    .locals 1

    iget v0, p0, Landroidx/vectordrawable/graphics/drawable/c$b;->a:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No constant state support for SDK < 24."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No constant state support for SDK < 24."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
