.class Lcom/google/android/material/floatingactionbutton/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/floatingactionbutton/a;->j(FFF)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:F

.field final synthetic d:F

.field final synthetic e:F

.field final synthetic f:F

.field final synthetic g:F

.field final synthetic h:Landroid/graphics/Matrix;

.field final synthetic i:Lcom/google/android/material/floatingactionbutton/a;


# direct methods
.method constructor <init>(Lcom/google/android/material/floatingactionbutton/a;FFFFFFFLandroid/graphics/Matrix;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    iput p2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->a:F

    iput p3, p0, Lcom/google/android/material/floatingactionbutton/a$d;->b:F

    iput p4, p0, Lcom/google/android/material/floatingactionbutton/a$d;->c:F

    iput p5, p0, Lcom/google/android/material/floatingactionbutton/a$d;->d:F

    iput p6, p0, Lcom/google/android/material/floatingactionbutton/a$d;->e:F

    iput p7, p0, Lcom/google/android/material/floatingactionbutton/a$d;->f:F

    iput p8, p0, Lcom/google/android/material/floatingactionbutton/a$d;->g:F

    iput-object p9, p0, Lcom/google/android/material/floatingactionbutton/a$d;->h:Landroid/graphics/Matrix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/material/floatingactionbutton/a;->v:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 14
    .line 15
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->a:F

    .line 16
    .line 17
    iget v2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->b:F

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const v4, 0x3e4ccccd    # 0.2f

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, v3, v4, p1}, Leb/a;->b(FFFFF)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/google/android/material/floatingactionbutton/a;->v:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 33
    .line 34
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->c:F

    .line 35
    .line 36
    iget v2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->d:F

    .line 37
    .line 38
    invoke-static {v1, v2, p1}, Leb/a;->a(FFF)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleX(F)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/google/android/material/floatingactionbutton/a;->v:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 48
    .line 49
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->e:F

    .line 50
    .line 51
    iget v2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->d:F

    .line 52
    .line 53
    invoke-static {v1, v2, p1}, Leb/a;->a(FFF)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setScaleY(F)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 61
    .line 62
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->f:F

    .line 63
    .line 64
    iget v2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->g:F

    .line 65
    .line 66
    invoke-static {v1, v2, p1}, Leb/a;->a(FFF)F

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-static {v0, v1}, Lcom/google/android/material/floatingactionbutton/a;->c(Lcom/google/android/material/floatingactionbutton/a;F)F

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 74
    .line 75
    iget v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->f:F

    .line 76
    .line 77
    iget v2, p0, Lcom/google/android/material/floatingactionbutton/a$d;->g:F

    .line 78
    .line 79
    invoke-static {v1, v2, p1}, Leb/a;->a(FFF)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    iget-object v1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->h:Landroid/graphics/Matrix;

    .line 84
    .line 85
    invoke-static {v0, p1, v1}, Lcom/google/android/material/floatingactionbutton/a;->d(Lcom/google/android/material/floatingactionbutton/a;FLandroid/graphics/Matrix;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lcom/google/android/material/floatingactionbutton/a$d;->i:Lcom/google/android/material/floatingactionbutton/a;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/google/android/material/floatingactionbutton/a;->v:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 91
    .line 92
    iget-object v0, p0, Lcom/google/android/material/floatingactionbutton/a$d;->h:Landroid/graphics/Matrix;

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 95
    .line 96
    .line 97
    return-void
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
