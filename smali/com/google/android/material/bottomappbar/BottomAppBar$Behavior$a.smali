.class Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;


# direct methods
.method constructor <init>(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 2
    .line 3
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->N(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lcom/google/android/material/bottomappbar/BottomAppBar;

    .line 12
    .line 13
    if-eqz p2, :cond_3

    .line 14
    .line 15
    instance-of p3, p1, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    move-object p3, p1

    .line 22
    check-cast p3, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 23
    .line 24
    iget-object p4, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 25
    .line 26
    invoke-static {p4}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->O(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)Landroid/graphics/Rect;

    .line 27
    .line 28
    .line 29
    move-result-object p4

    .line 30
    invoke-virtual {p3, p4}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->j(Landroid/graphics/Rect;)V

    .line 31
    .line 32
    .line 33
    iget-object p4, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 34
    .line 35
    invoke-static {p4}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->O(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)Landroid/graphics/Rect;

    .line 36
    .line 37
    .line 38
    move-result-object p4

    .line 39
    invoke-virtual {p4}, Landroid/graphics/Rect;->height()I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    invoke-virtual {p2, p4}, Lcom/google/android/material/bottomappbar/BottomAppBar;->B0(I)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getShapeAppearanceModel()Lwb/k;

    .line 47
    .line 48
    .line 49
    move-result-object p5

    .line 50
    invoke-virtual {p5}, Lwb/k;->r()Lwb/c;

    .line 51
    .line 52
    .line 53
    move-result-object p5

    .line 54
    new-instance p6, Landroid/graphics/RectF;

    .line 55
    .line 56
    iget-object p7, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 57
    .line 58
    invoke-static {p7}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->O(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)Landroid/graphics/Rect;

    .line 59
    .line 60
    .line 61
    move-result-object p7

    .line 62
    invoke-direct {p6, p7}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p5, p6}, Lwb/c;->a(Landroid/graphics/RectF;)F

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    invoke-virtual {p2, p5}, Lcom/google/android/material/bottomappbar/BottomAppBar;->setFabCornerSize(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 77
    .line 78
    iget-object p5, p0, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior$a;->k:Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;

    .line 79
    .line 80
    invoke-static {p5}, Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;->P(Lcom/google/android/material/bottomappbar/BottomAppBar$Behavior;)I

    .line 81
    .line 82
    .line 83
    move-result p5

    .line 84
    if-nez p5, :cond_2

    .line 85
    .line 86
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 87
    .line 88
    .line 89
    move-result p5

    .line 90
    sub-int/2addr p5, p4

    .line 91
    div-int/lit8 p5, p5, 0x2

    .line 92
    .line 93
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    sget p6, Ldb/d;->y:I

    .line 98
    .line 99
    invoke-virtual {p4, p6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    sub-int/2addr p4, p5

    .line 104
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->c0(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    .line 105
    .line 106
    .line 107
    move-result p5

    .line 108
    add-int/2addr p5, p4

    .line 109
    iput p5, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 110
    .line 111
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->d0(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    .line 112
    .line 113
    .line 114
    move-result p4

    .line 115
    iput p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 116
    .line 117
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->e0(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    iput p4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 122
    .line 123
    invoke-static {p3}, Lcom/google/android/material/internal/o;->e(Landroid/view/View;)Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-eqz p3, :cond_1

    .line 128
    .line 129
    iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 130
    .line 131
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->f0(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    add-int/2addr p3, p2

    .line 136
    iput p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_1
    iget p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 140
    .line 141
    invoke-static {p2}, Lcom/google/android/material/bottomappbar/BottomAppBar;->f0(Lcom/google/android/material/bottomappbar/BottomAppBar;)I

    .line 142
    .line 143
    .line 144
    move-result p2

    .line 145
    add-int/2addr p3, p2

    .line 146
    iput p3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 147
    .line 148
    :cond_2
    :goto_0
    return-void

    .line 149
    :cond_3
    :goto_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 150
    .line 151
    .line 152
    return-void
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
.end method
