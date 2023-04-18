.class Landroidx/appcompat/widget/w$e;
.super Landroidx/appcompat/widget/z0;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/w$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private T:Ljava/lang/CharSequence;

.field U:Landroid/widget/ListAdapter;

.field private final V:Landroid/graphics/Rect;

.field private W:I

.field final synthetic X:Landroidx/appcompat/widget/w;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/w;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4}, Landroidx/appcompat/widget/z0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Landroidx/appcompat/widget/w$e;->V:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/z0;->B(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/z0;->H(Z)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/z0;->M(I)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Landroidx/appcompat/widget/w$e$a;

    .line 25
    .line 26
    invoke-direct {p2, p0, p1}, Landroidx/appcompat/widget/w$e$a;-><init>(Landroidx/appcompat/widget/w$e;Landroidx/appcompat/widget/w;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/z0;->J(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 30
    .line 31
    .line 32
    return-void
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

.method static synthetic P(Landroidx/appcompat/widget/w$e;)V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/widget/z0;->show()V

    return-void
.end method


# virtual methods
.method Q()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/z0;->g()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 8
    .line 9
    iget-object v1, v1, Landroidx/appcompat/widget/w;->r:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 15
    .line 16
    invoke-static {v0}, Landroidx/appcompat/widget/v1;->b(Landroid/view/View;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/appcompat/widget/w;->r:Landroid/graphics/Rect;

    .line 25
    .line 26
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 30
    .line 31
    iget-object v0, v0, Landroidx/appcompat/widget/w;->r:Landroid/graphics/Rect;

    .line 32
    .line 33
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 34
    .line 35
    neg-int v0, v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/appcompat/widget/w;->r:Landroid/graphics/Rect;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 45
    .line 46
    move v0, v1

    .line 47
    :goto_0
    iget-object v1, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object v2, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    iget-object v3, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 60
    .line 61
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    iget-object v4, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 66
    .line 67
    iget v5, v4, Landroidx/appcompat/widget/w;->q:I

    .line 68
    .line 69
    const/4 v6, -0x2

    .line 70
    if-ne v5, v6, :cond_3

    .line 71
    .line 72
    iget-object v5, p0, Landroidx/appcompat/widget/w$e;->U:Landroid/widget/ListAdapter;

    .line 73
    .line 74
    check-cast v5, Landroid/widget/SpinnerAdapter;

    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/appcompat/widget/z0;->g()Landroid/graphics/drawable/Drawable;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v4, v5, v6}, Landroidx/appcompat/widget/w;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    iget-object v5, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 85
    .line 86
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 99
    .line 100
    iget-object v6, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 101
    .line 102
    iget-object v6, v6, Landroidx/appcompat/widget/w;->r:Landroid/graphics/Rect;

    .line 103
    .line 104
    iget v7, v6, Landroid/graphics/Rect;->left:I

    .line 105
    .line 106
    sub-int/2addr v5, v7

    .line 107
    iget v6, v6, Landroid/graphics/Rect;->right:I

    .line 108
    .line 109
    sub-int/2addr v5, v6

    .line 110
    if-le v4, v5, :cond_2

    .line 111
    .line 112
    move v4, v5

    .line 113
    :cond_2
    sub-int v5, v3, v1

    .line 114
    .line 115
    sub-int/2addr v5, v2

    .line 116
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/z0;->D(I)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_3
    const/4 v4, -0x1

    .line 125
    if-ne v5, v4, :cond_4

    .line 126
    .line 127
    sub-int v4, v3, v1

    .line 128
    .line 129
    sub-int/2addr v4, v2

    .line 130
    invoke-virtual {p0, v4}, Landroidx/appcompat/widget/z0;->D(I)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/z0;->D(I)V

    .line 135
    .line 136
    .line 137
    :goto_1
    iget-object v4, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 138
    .line 139
    invoke-static {v4}, Landroidx/appcompat/widget/v1;->b(Landroid/view/View;)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_5

    .line 144
    .line 145
    sub-int/2addr v3, v2

    .line 146
    invoke-virtual {p0}, Landroidx/appcompat/widget/z0;->x()I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    sub-int/2addr v3, v1

    .line 151
    invoke-virtual {p0}, Landroidx/appcompat/widget/w$e;->R()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    sub-int/2addr v3, v1

    .line 156
    add-int/2addr v0, v3

    .line 157
    goto :goto_2

    .line 158
    :cond_5
    invoke-virtual {p0}, Landroidx/appcompat/widget/w$e;->R()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    add-int/2addr v1, v2

    .line 163
    add-int/2addr v0, v1

    .line 164
    :goto_2
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/z0;->d(I)V

    .line 165
    .line 166
    .line 167
    return-void
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
.end method

.method public R()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/w$e;->W:I

    return v0
.end method

.method S(Landroid/view/View;)Z
    .locals 1

    invoke-static {p1}, Landroidx/core/view/w0;->T(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->V:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/w$e;->T:Ljava/lang/CharSequence;

    return-object v0
.end method

.method public i(Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/w$e;->T:Ljava/lang/CharSequence;

    return-void
.end method

.method public k(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/w$e;->W:I

    return-void
.end method

.method public l(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/z0;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/w$e;->Q()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/z0;->G(I)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Landroidx/appcompat/widget/z0;->show()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/z0;->h()Landroid/widget/ListView;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v2}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p2}, Landroid/view/View;->setTextAlignment(I)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/z0;->N(I)V

    .line 36
    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/w$e;->X:Landroidx/appcompat/widget/w;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    new-instance p2, Landroidx/appcompat/widget/w$e$b;

    .line 50
    .line 51
    invoke-direct {p2, p0}, Landroidx/appcompat/widget/w$e$b;-><init>(Landroidx/appcompat/widget/w$e;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Landroidx/appcompat/widget/w$e$c;

    .line 58
    .line 59
    invoke-direct {p1, p0, p2}, Landroidx/appcompat/widget/w$e$c;-><init>(Landroidx/appcompat/widget/w$e;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/z0;->I(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void
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
.end method

.method public n(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/appcompat/widget/z0;->n(Landroid/widget/ListAdapter;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/w$e;->U:Landroid/widget/ListAdapter;

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
