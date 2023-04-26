.class public Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;,
        Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;
    }
.end annotation


# static fields
.field private static final ALL_BITS_SET:I = -0x1

.field private static final ALL_BITS_UNSET:I = 0x0

.field private static final DEFAULT_BORDER_ALPHA:I = 0xff

.field private static final DEFAULT_BORDER_COLOR:I = -0x1000000

.field private static final DEFAULT_BORDER_RGB:I


# instance fields
.field private mAlpha:I

.field private mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

.field private mBorderCornerRadii:[F

.field private mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

.field private mBorderRadius:F

.field private mBorderStyle:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

.field private mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

.field private mCenterDrawPath:Landroid/graphics/Path;

.field private mColor:I

.field private final mContext:Landroid/content/Context;

.field private mInnerBottomLeftCorner:Landroid/graphics/PointF;

.field private mInnerBottomRightCorner:Landroid/graphics/PointF;

.field private mInnerClipPathForBorderRadius:Landroid/graphics/Path;

.field private mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

.field private mInnerTopLeftCorner:Landroid/graphics/PointF;

.field private mInnerTopRightCorner:Landroid/graphics/PointF;

.field private mLayoutDirection:I

.field private mNeedUpdatePathForBorderRadius:Z

.field private mOuterClipPathForBorderRadius:Landroid/graphics/Path;

.field private mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

.field private final mPaint:Landroid/graphics/Paint;

.field private mPathForBorder:Landroid/graphics/Path;

.field private mPathForBorderRadiusOutline:Landroid/graphics/Path;

.field private final mPathForSingleBorder:Landroid/graphics/Path;

.field private mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

.field private mTempRectForCenterDrawPath:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Path;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 13
    .line 14
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 15
    .line 16
    iput v1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    .line 17
    .line 18
    new-instance v1, Landroid/graphics/Paint;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 25
    .line 26
    iput v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    .line 27
    .line 28
    const/16 v0, 0xff

    .line 29
    .line 30
    iput v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 31
    .line 32
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 33
    .line 34
    return-void
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
.end method

.method private static colorFromAlphaAndRGBComponents(FF)I
    .locals 1

    const v0, 0xffffff

    float-to-int p1, p1

    and-int/2addr p1, v0

    float-to-int p0, p0

    shl-int/lit8 p0, p0, 0x18

    const/high16 v0, -0x1000000

    and-int/2addr p0, v0

    or-int/2addr p0, p1

    return p0
.end method

.method private drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Landroid/graphics/Path;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 14
    .line 15
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/graphics/Path;->reset()V

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 26
    .line 27
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 28
    .line 29
    .line 30
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 31
    .line 32
    invoke-virtual {p2, p5, p6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 36
    .line 37
    invoke-virtual {p2, p7, p8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 38
    .line 39
    .line 40
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 41
    .line 42
    invoke-virtual {p2, p9, p10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 46
    .line 47
    invoke-virtual {p2, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorder:Landroid/graphics/Path;

    .line 51
    .line 52
    iget-object p3, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 53
    .line 54
    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 55
    .line 56
    .line 57
    return-void
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
.end method

.method private drawRectangularBackgroundWithBorders(Landroid/graphics/Canvas;)V
    .locals 25

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 6
    .line 7
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10
    .line 11
    .line 12
    iget v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    .line 13
    .line 14
    iget v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 15
    .line 16
    invoke-static {v0, v1}, Lcom/facebook/react/views/view/ColorUtil;->multiplyColorAlpha(II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 36
    .line 37
    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result v14

    .line 56
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 59
    .line 60
    .line 61
    move-result v15

    .line 62
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 65
    .line 66
    .line 67
    move-result v16

    .line 68
    if-gtz v13, :cond_1

    .line 69
    .line 70
    if-gtz v15, :cond_1

    .line 71
    .line 72
    if-gtz v14, :cond_1

    .line 73
    .line 74
    if-lez v16, :cond_16

    .line 75
    .line 76
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    const/4 v10, 0x0

    .line 81
    invoke-virtual {v11, v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v9, 0x1

    .line 86
    invoke-virtual {v11, v9}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 87
    .line 88
    .line 89
    move-result v17

    .line 90
    const/4 v8, 0x2

    .line 91
    invoke-virtual {v11, v8}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    const/4 v4, 0x3

    .line 96
    invoke-virtual {v11, v4}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 97
    .line 98
    .line 99
    move-result v18

    .line 100
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getResolvedLayoutDirection()I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-ne v4, v9, :cond_2

    .line 105
    .line 106
    move v4, v9

    .line 107
    goto :goto_0

    .line 108
    :cond_2
    move v4, v10

    .line 109
    :goto_0
    const/4 v5, 0x4

    .line 110
    invoke-virtual {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    const/4 v7, 0x5

    .line 115
    invoke-virtual {v11, v7}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 116
    .line 117
    .line 118
    move-result v19

    .line 119
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget-object v9, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 124
    .line 125
    invoke-virtual {v8, v9}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_7

    .line 130
    .line 131
    invoke-direct {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-nez v5, :cond_3

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    move v2, v6

    .line 139
    :goto_1
    invoke-direct {v11, v7}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-nez v5, :cond_4

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_4
    move/from16 v3, v19

    .line 147
    .line 148
    :goto_2
    if-eqz v4, :cond_5

    .line 149
    .line 150
    move v5, v3

    .line 151
    goto :goto_3

    .line 152
    :cond_5
    move v5, v2

    .line 153
    :goto_3
    if-eqz v4, :cond_6

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    move v2, v3

    .line 157
    :goto_4
    move/from16 v22, v2

    .line 158
    .line 159
    move/from16 v19, v5

    .line 160
    .line 161
    goto :goto_9

    .line 162
    :cond_7
    if-eqz v4, :cond_8

    .line 163
    .line 164
    move/from16 v8, v19

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_8
    move v8, v6

    .line 168
    :goto_5
    if-eqz v4, :cond_9

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_9
    move/from16 v6, v19

    .line 172
    .line 173
    :goto_6
    invoke-direct {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    invoke-direct {v11, v7}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v4, :cond_a

    .line 182
    .line 183
    move v9, v7

    .line 184
    goto :goto_7

    .line 185
    :cond_a
    move v9, v5

    .line 186
    :goto_7
    if-eqz v4, :cond_b

    .line 187
    .line 188
    goto :goto_8

    .line 189
    :cond_b
    move v5, v7

    .line 190
    :goto_8
    if-eqz v9, :cond_c

    .line 191
    .line 192
    move v2, v8

    .line 193
    :cond_c
    move/from16 v19, v2

    .line 194
    .line 195
    if-eqz v5, :cond_d

    .line 196
    .line 197
    move/from16 v22, v6

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_d
    move/from16 v22, v3

    .line 201
    .line 202
    :goto_9
    iget v9, v1, Landroid/graphics/Rect;->left:I

    .line 203
    .line 204
    iget v8, v1, Landroid/graphics/Rect;->top:I

    .line 205
    .line 206
    move v2, v13

    .line 207
    move v3, v14

    .line 208
    move v4, v15

    .line 209
    move/from16 v5, v16

    .line 210
    .line 211
    move/from16 v6, v19

    .line 212
    .line 213
    move/from16 v7, v17

    .line 214
    .line 215
    move v10, v8

    .line 216
    const/16 v20, 0x2

    .line 217
    .line 218
    move/from16 v8, v22

    .line 219
    .line 220
    move/from16 v24, v15

    .line 221
    .line 222
    move v15, v9

    .line 223
    move/from16 v9, v18

    .line 224
    .line 225
    invoke-static/range {v2 .. v9}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->fastBorderCompatibleColorOrZero(IIIIIIII)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-eqz v2, :cond_11

    .line 230
    .line 231
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    if-eqz v3, :cond_16

    .line 236
    .line 237
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 238
    .line 239
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 240
    .line 241
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 242
    .line 243
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 244
    .line 245
    .line 246
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 247
    .line 248
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 249
    .line 250
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 251
    .line 252
    .line 253
    if-lez v13, :cond_e

    .line 254
    .line 255
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 256
    .line 257
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 258
    .line 259
    .line 260
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 261
    .line 262
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-direct {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePathEffect(I)V

    .line 267
    .line 268
    .line 269
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 270
    .line 271
    int-to-float v5, v2

    .line 272
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 273
    .line 274
    .line 275
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 276
    .line 277
    div-int/lit8 v2, v2, 0x2

    .line 278
    .line 279
    add-int v9, v15, v2

    .line 280
    .line 281
    int-to-float v2, v9

    .line 282
    int-to-float v5, v10

    .line 283
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 284
    .line 285
    .line 286
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 287
    .line 288
    int-to-float v5, v1

    .line 289
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 290
    .line 291
    .line 292
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 293
    .line 294
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 295
    .line 296
    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 297
    .line 298
    .line 299
    :cond_e
    if-lez v14, :cond_f

    .line 300
    .line 301
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 304
    .line 305
    .line 306
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 307
    .line 308
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-direct {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePathEffect(I)V

    .line 313
    .line 314
    .line 315
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 316
    .line 317
    int-to-float v5, v2

    .line 318
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 319
    .line 320
    .line 321
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 322
    .line 323
    int-to-float v5, v15

    .line 324
    div-int/lit8 v2, v2, 0x2

    .line 325
    .line 326
    add-int v8, v10, v2

    .line 327
    .line 328
    int-to-float v2, v8

    .line 329
    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 330
    .line 331
    .line 332
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 333
    .line 334
    int-to-float v5, v3

    .line 335
    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 336
    .line 337
    .line 338
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 339
    .line 340
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 341
    .line 342
    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 343
    .line 344
    .line 345
    :cond_f
    if-lez v24, :cond_10

    .line 346
    .line 347
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 348
    .line 349
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 350
    .line 351
    .line 352
    iget v2, v0, Landroid/graphics/RectF;->right:F

    .line 353
    .line 354
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    invoke-direct {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePathEffect(I)V

    .line 359
    .line 360
    .line 361
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 362
    .line 363
    int-to-float v5, v2

    .line 364
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 365
    .line 366
    .line 367
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 368
    .line 369
    div-int/lit8 v2, v2, 0x2

    .line 370
    .line 371
    sub-int v2, v3, v2

    .line 372
    .line 373
    int-to-float v2, v2

    .line 374
    int-to-float v5, v10

    .line 375
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 376
    .line 377
    .line 378
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 379
    .line 380
    int-to-float v5, v1

    .line 381
    invoke-virtual {v4, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 382
    .line 383
    .line 384
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 385
    .line 386
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 387
    .line 388
    invoke-virtual {v12, v2, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 389
    .line 390
    .line 391
    :cond_10
    if-lez v16, :cond_16

    .line 392
    .line 393
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 394
    .line 395
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 396
    .line 397
    .line 398
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 399
    .line 400
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    invoke-direct {v11, v0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePathEffect(I)V

    .line 405
    .line 406
    .line 407
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 408
    .line 409
    int-to-float v4, v0

    .line 410
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 411
    .line 412
    .line 413
    iget-object v2, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 414
    .line 415
    int-to-float v4, v15

    .line 416
    div-int/lit8 v0, v0, 0x2

    .line 417
    .line 418
    sub-int/2addr v1, v0

    .line 419
    int-to-float v0, v1

    .line 420
    invoke-virtual {v2, v4, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 421
    .line 422
    .line 423
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 424
    .line 425
    int-to-float v2, v3

    .line 426
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 427
    .line 428
    .line 429
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForSingleBorder:Landroid/graphics/Path;

    .line 430
    .line 431
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 432
    .line 433
    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 434
    .line 435
    .line 436
    goto/16 :goto_b

    .line 437
    .line 438
    :cond_11
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 439
    .line 440
    const/4 v2, 0x0

    .line 441
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 445
    .line 446
    .line 447
    move-result v20

    .line 448
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 449
    .line 450
    .line 451
    move-result v21

    .line 452
    if-lez v13, :cond_12

    .line 453
    .line 454
    int-to-float v9, v15

    .line 455
    int-to-float v4, v10

    .line 456
    add-int v0, v15, v13

    .line 457
    .line 458
    int-to-float v7, v0

    .line 459
    add-int v8, v10, v14

    .line 460
    .line 461
    int-to-float v6, v8

    .line 462
    add-int v8, v10, v21

    .line 463
    .line 464
    sub-int v0, v8, v16

    .line 465
    .line 466
    int-to-float v5, v0

    .line 467
    int-to-float v8, v8

    .line 468
    move-object/from16 v0, p0

    .line 469
    .line 470
    move-object/from16 v1, p1

    .line 471
    .line 472
    move/from16 v2, v19

    .line 473
    .line 474
    move v3, v9

    .line 475
    move/from16 v19, v5

    .line 476
    .line 477
    move v5, v7

    .line 478
    move/from16 v23, v8

    .line 479
    .line 480
    move/from16 v8, v19

    .line 481
    .line 482
    move v12, v10

    .line 483
    move/from16 v10, v23

    .line 484
    .line 485
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 486
    .line 487
    .line 488
    goto :goto_a

    .line 489
    :cond_12
    move v12, v10

    .line 490
    :goto_a
    if-lez v14, :cond_13

    .line 491
    .line 492
    int-to-float v3, v15

    .line 493
    int-to-float v10, v12

    .line 494
    add-int v9, v15, v13

    .line 495
    .line 496
    int-to-float v5, v9

    .line 497
    add-int v8, v12, v14

    .line 498
    .line 499
    int-to-float v8, v8

    .line 500
    add-int v9, v15, v20

    .line 501
    .line 502
    sub-int v0, v9, v24

    .line 503
    .line 504
    int-to-float v7, v0

    .line 505
    int-to-float v9, v9

    .line 506
    move-object/from16 v0, p0

    .line 507
    .line 508
    move-object/from16 v1, p1

    .line 509
    .line 510
    move/from16 v2, v17

    .line 511
    .line 512
    move v4, v10

    .line 513
    move v6, v8

    .line 514
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 515
    .line 516
    .line 517
    :cond_13
    if-lez v24, :cond_14

    .line 518
    .line 519
    add-int v9, v15, v20

    .line 520
    .line 521
    int-to-float v5, v9

    .line 522
    int-to-float v4, v12

    .line 523
    add-int v8, v12, v21

    .line 524
    .line 525
    int-to-float v6, v8

    .line 526
    sub-int v9, v9, v24

    .line 527
    .line 528
    int-to-float v9, v9

    .line 529
    sub-int v8, v8, v16

    .line 530
    .line 531
    int-to-float v8, v8

    .line 532
    add-int v0, v12, v14

    .line 533
    .line 534
    int-to-float v10, v0

    .line 535
    move-object/from16 v0, p0

    .line 536
    .line 537
    move-object/from16 v1, p1

    .line 538
    .line 539
    move/from16 v2, v22

    .line 540
    .line 541
    move v3, v5

    .line 542
    move v7, v9

    .line 543
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 544
    .line 545
    .line 546
    :cond_14
    if-lez v16, :cond_15

    .line 547
    .line 548
    int-to-float v3, v15

    .line 549
    add-int v8, v12, v21

    .line 550
    .line 551
    int-to-float v6, v8

    .line 552
    add-int v9, v15, v20

    .line 553
    .line 554
    int-to-float v5, v9

    .line 555
    sub-int v9, v9, v24

    .line 556
    .line 557
    int-to-float v7, v9

    .line 558
    sub-int v8, v8, v16

    .line 559
    .line 560
    int-to-float v10, v8

    .line 561
    add-int v9, v15, v13

    .line 562
    .line 563
    int-to-float v9, v9

    .line 564
    move-object/from16 v0, p0

    .line 565
    .line 566
    move-object/from16 v1, p1

    .line 567
    .line 568
    move/from16 v2, v18

    .line 569
    .line 570
    move v4, v6

    .line 571
    move v8, v10

    .line 572
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 573
    .line 574
    .line 575
    :cond_15
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 576
    .line 577
    const/4 v1, 0x1

    .line 578
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 579
    .line 580
    .line 581
    :cond_16
    :goto_b
    return-void
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private drawRoundedBackgroundWithBorders(Landroid/graphics/Canvas;)V
    .locals 22

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePath()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 9
    .line 10
    .line 11
    iget v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    .line 12
    .line 13
    iget v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/facebook/react/views/view/ColorUtil;->multiplyColorAlpha(II)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 31
    .line 32
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 38
    .line 39
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-virtual {v11, v0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    const/4 v2, 0x1

    .line 54
    invoke-virtual {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 55
    .line 56
    .line 57
    move-result v14

    .line 58
    const/4 v3, 0x2

    .line 59
    invoke-virtual {v11, v3}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v4, 0x3

    .line 64
    invoke-virtual {v11, v4}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    iget v4, v13, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    const/16 v16, 0x0

    .line 71
    .line 72
    cmpl-float v4, v4, v16

    .line 73
    .line 74
    if-gtz v4, :cond_1

    .line 75
    .line 76
    iget v4, v13, Landroid/graphics/RectF;->bottom:F

    .line 77
    .line 78
    cmpl-float v4, v4, v16

    .line 79
    .line 80
    if-gtz v4, :cond_1

    .line 81
    .line 82
    iget v4, v13, Landroid/graphics/RectF;->left:F

    .line 83
    .line 84
    cmpl-float v4, v4, v16

    .line 85
    .line 86
    if-gtz v4, :cond_1

    .line 87
    .line 88
    iget v4, v13, Landroid/graphics/RectF;->right:F

    .line 89
    .line 90
    cmpl-float v4, v4, v16

    .line 91
    .line 92
    if-lez v4, :cond_12

    .line 93
    .line 94
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getFullBorderWidth()F

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/16 v5, 0x8

    .line 99
    .line 100
    invoke-virtual {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    iget v6, v13, Landroid/graphics/RectF;->top:F

    .line 105
    .line 106
    cmpl-float v6, v6, v4

    .line 107
    .line 108
    if-nez v6, :cond_2

    .line 109
    .line 110
    iget v6, v13, Landroid/graphics/RectF;->bottom:F

    .line 111
    .line 112
    cmpl-float v6, v6, v4

    .line 113
    .line 114
    if-nez v6, :cond_2

    .line 115
    .line 116
    iget v6, v13, Landroid/graphics/RectF;->left:F

    .line 117
    .line 118
    cmpl-float v6, v6, v4

    .line 119
    .line 120
    if-nez v6, :cond_2

    .line 121
    .line 122
    iget v6, v13, Landroid/graphics/RectF;->right:F

    .line 123
    .line 124
    cmpl-float v6, v6, v4

    .line 125
    .line 126
    if-nez v6, :cond_2

    .line 127
    .line 128
    if-ne v1, v5, :cond_2

    .line 129
    .line 130
    if-ne v14, v5, :cond_2

    .line 131
    .line 132
    if-ne v3, v5, :cond_2

    .line 133
    .line 134
    if-ne v15, v5, :cond_2

    .line 135
    .line 136
    cmpl-float v0, v4, v16

    .line 137
    .line 138
    if-lez v0, :cond_12

    .line 139
    .line 140
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 141
    .line 142
    iget v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 143
    .line 144
    invoke-static {v5, v1}, Lcom/facebook/react/views/view/ColorUtil;->multiplyColorAlpha(II)I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 152
    .line 153
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 156
    .line 157
    .line 158
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 161
    .line 162
    .line 163
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 164
    .line 165
    iget-object v1, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 166
    .line 167
    invoke-virtual {v12, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_a

    .line 171
    .line 172
    :cond_2
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    .line 173
    .line 174
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 175
    .line 176
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 177
    .line 178
    .line 179
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 180
    .line 181
    sget-object v5, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 182
    .line 183
    invoke-virtual {v12, v4, v5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 184
    .line 185
    .line 186
    iget-object v4, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 187
    .line 188
    sget-object v5, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 189
    .line 190
    invoke-virtual {v12, v4, v5}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getResolvedLayoutDirection()I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-ne v4, v2, :cond_3

    .line 198
    .line 199
    move v0, v2

    .line 200
    :cond_3
    const/4 v2, 0x4

    .line 201
    invoke-virtual {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    const/4 v5, 0x5

    .line 206
    invoke-virtual {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    iget-object v8, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 215
    .line 216
    invoke-virtual {v7, v8}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-eqz v7, :cond_8

    .line 221
    .line 222
    invoke-direct {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 223
    .line 224
    .line 225
    move-result v2

    .line 226
    if-nez v2, :cond_4

    .line 227
    .line 228
    goto :goto_0

    .line 229
    :cond_4
    move v1, v4

    .line 230
    :goto_0
    invoke-direct {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-nez v2, :cond_5

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_5
    move v3, v6

    .line 238
    :goto_1
    if-eqz v0, :cond_6

    .line 239
    .line 240
    move v2, v3

    .line 241
    goto :goto_2

    .line 242
    :cond_6
    move v2, v1

    .line 243
    :goto_2
    if-eqz v0, :cond_7

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_7
    move v1, v3

    .line 247
    :goto_3
    move/from16 v17, v1

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_8
    if-eqz v0, :cond_9

    .line 251
    .line 252
    move v7, v6

    .line 253
    goto :goto_4

    .line 254
    :cond_9
    move v7, v4

    .line 255
    :goto_4
    if-eqz v0, :cond_a

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_a
    move v4, v6

    .line 259
    :goto_5
    invoke-direct {v11, v2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-direct {v11, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->isBorderColorDefined(I)Z

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    if-eqz v0, :cond_b

    .line 268
    .line 269
    move v6, v5

    .line 270
    goto :goto_6

    .line 271
    :cond_b
    move v6, v2

    .line 272
    :goto_6
    if-eqz v0, :cond_c

    .line 273
    .line 274
    goto :goto_7

    .line 275
    :cond_c
    move v2, v5

    .line 276
    :goto_7
    if-eqz v6, :cond_d

    .line 277
    .line 278
    move v1, v7

    .line 279
    :cond_d
    if-eqz v2, :cond_e

    .line 280
    .line 281
    move v2, v1

    .line 282
    move/from16 v17, v4

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_e
    move v2, v1

    .line 286
    move/from16 v17, v3

    .line 287
    .line 288
    :goto_8
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 289
    .line 290
    iget v10, v0, Landroid/graphics/RectF;->left:F

    .line 291
    .line 292
    iget v9, v0, Landroid/graphics/RectF;->right:F

    .line 293
    .line 294
    iget v8, v0, Landroid/graphics/RectF;->top:F

    .line 295
    .line 296
    iget v7, v0, Landroid/graphics/RectF;->bottom:F

    .line 297
    .line 298
    iget v0, v13, Landroid/graphics/RectF;->left:F

    .line 299
    .line 300
    cmpl-float v0, v0, v16

    .line 301
    .line 302
    if-lez v0, :cond_f

    .line 303
    .line 304
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 305
    .line 306
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 307
    .line 308
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 309
    .line 310
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 311
    .line 312
    iget v4, v0, Landroid/graphics/PointF;->x:F

    .line 313
    .line 314
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 315
    .line 316
    move-object/from16 v0, p0

    .line 317
    .line 318
    move-object/from16 v1, p1

    .line 319
    .line 320
    move/from16 v18, v3

    .line 321
    .line 322
    move v3, v10

    .line 323
    move/from16 v19, v4

    .line 324
    .line 325
    move v4, v8

    .line 326
    move/from16 v20, v7

    .line 327
    .line 328
    move/from16 v7, v19

    .line 329
    .line 330
    move/from16 v19, v8

    .line 331
    .line 332
    move/from16 v8, v18

    .line 333
    .line 334
    move/from16 v18, v9

    .line 335
    .line 336
    move v9, v10

    .line 337
    move/from16 v21, v10

    .line 338
    .line 339
    move/from16 v10, v20

    .line 340
    .line 341
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_f
    move/from16 v20, v7

    .line 346
    .line 347
    move/from16 v19, v8

    .line 348
    .line 349
    move/from16 v18, v9

    .line 350
    .line 351
    move/from16 v21, v10

    .line 352
    .line 353
    :goto_9
    iget v0, v13, Landroid/graphics/RectF;->top:F

    .line 354
    .line 355
    cmpl-float v0, v0, v16

    .line 356
    .line 357
    if-lez v0, :cond_10

    .line 358
    .line 359
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 360
    .line 361
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 362
    .line 363
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 364
    .line 365
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 366
    .line 367
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 368
    .line 369
    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 370
    .line 371
    move-object/from16 v0, p0

    .line 372
    .line 373
    move-object/from16 v1, p1

    .line 374
    .line 375
    move v2, v14

    .line 376
    move/from16 v3, v21

    .line 377
    .line 378
    move/from16 v4, v19

    .line 379
    .line 380
    move/from16 v9, v18

    .line 381
    .line 382
    move/from16 v10, v19

    .line 383
    .line 384
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 385
    .line 386
    .line 387
    :cond_10
    iget v0, v13, Landroid/graphics/RectF;->right:F

    .line 388
    .line 389
    cmpl-float v0, v0, v16

    .line 390
    .line 391
    if-lez v0, :cond_11

    .line 392
    .line 393
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 394
    .line 395
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 396
    .line 397
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 398
    .line 399
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 400
    .line 401
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 402
    .line 403
    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 404
    .line 405
    move-object/from16 v0, p0

    .line 406
    .line 407
    move-object/from16 v1, p1

    .line 408
    .line 409
    move/from16 v2, v17

    .line 410
    .line 411
    move/from16 v3, v18

    .line 412
    .line 413
    move/from16 v4, v19

    .line 414
    .line 415
    move/from16 v9, v18

    .line 416
    .line 417
    move/from16 v10, v20

    .line 418
    .line 419
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 420
    .line 421
    .line 422
    :cond_11
    iget v0, v13, Landroid/graphics/RectF;->bottom:F

    .line 423
    .line 424
    cmpl-float v0, v0, v16

    .line 425
    .line 426
    if-lez v0, :cond_12

    .line 427
    .line 428
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 429
    .line 430
    iget v5, v0, Landroid/graphics/PointF;->x:F

    .line 431
    .line 432
    iget v6, v0, Landroid/graphics/PointF;->y:F

    .line 433
    .line 434
    iget-object v0, v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 435
    .line 436
    iget v7, v0, Landroid/graphics/PointF;->x:F

    .line 437
    .line 438
    iget v8, v0, Landroid/graphics/PointF;->y:F

    .line 439
    .line 440
    move-object/from16 v0, p0

    .line 441
    .line 442
    move-object/from16 v1, p1

    .line 443
    .line 444
    move v2, v15

    .line 445
    move/from16 v3, v21

    .line 446
    .line 447
    move/from16 v4, v20

    .line 448
    .line 449
    move/from16 v9, v18

    .line 450
    .line 451
    move/from16 v10, v20

    .line 452
    .line 453
    invoke-direct/range {v0 .. v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawQuadrilateral(Landroid/graphics/Canvas;IFFFFFFFF)V

    .line 454
    .line 455
    .line 456
    :cond_12
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 457
    .line 458
    .line 459
    return-void
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private static fastBorderCompatibleColorOrZero(IIIIIIII)I
    .locals 3

    const/4 v0, -0x1

    if-lez p0, :cond_0

    move v1, p4

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-lez p1, :cond_1

    move v2, p5

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    and-int/2addr v1, v2

    if-lez p2, :cond_2

    move v2, p6

    goto :goto_2

    :cond_2
    move v2, v0

    :goto_2
    and-int/2addr v1, v2

    if-lez p3, :cond_3

    move v0, p7

    :cond_3
    and-int/2addr v0, v1

    const/4 v1, 0x0

    if-lez p0, :cond_4

    goto :goto_3

    :cond_4
    move p4, v1

    :goto_3
    if-lez p1, :cond_5

    goto :goto_4

    :cond_5
    move p5, v1

    :goto_4
    or-int p0, p4, p5

    if-lez p2, :cond_6

    goto :goto_5

    :cond_6
    move p6, v1

    :goto_5
    or-int/2addr p0, p6

    if-lez p3, :cond_7

    goto :goto_6

    :cond_7
    move p7, v1

    :goto_6
    or-int/2addr p0, p7

    if-ne v0, p0, :cond_8

    goto :goto_7

    :cond_8
    move v0, v1

    :goto_7
    return v0
.end method

.method private getBorderWidth(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Lcom/facebook/yoga/d;->a(F)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    :goto_0
    return p1
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
.end method

.method private static getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V
    .locals 21

    .line 1
    move-object/from16 v0, p16

    .line 2
    .line 3
    add-double v1, p0, p4

    .line 4
    .line 5
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 6
    .line 7
    div-double/2addr v1, v3

    .line 8
    add-double v5, p2, p6

    .line 9
    .line 10
    div-double/2addr v5, v3

    .line 11
    sub-double v7, p8, v1

    .line 12
    .line 13
    sub-double v9, p10, v5

    .line 14
    .line 15
    sub-double v11, p12, v1

    .line 16
    .line 17
    sub-double v13, p14, v5

    .line 18
    .line 19
    sub-double v15, p4, p0

    .line 20
    .line 21
    invoke-static/range {v15 .. v16}, Ljava/lang/Math;->abs(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v15

    .line 25
    div-double/2addr v15, v3

    .line 26
    sub-double v17, p6, p2

    .line 27
    .line 28
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->abs(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v17

    .line 32
    div-double v17, v17, v3

    .line 33
    .line 34
    sub-double/2addr v13, v9

    .line 35
    sub-double/2addr v11, v7

    .line 36
    div-double/2addr v13, v11

    .line 37
    mul-double/2addr v7, v13

    .line 38
    sub-double/2addr v9, v7

    .line 39
    mul-double v17, v17, v17

    .line 40
    .line 41
    mul-double v7, v15, v15

    .line 42
    .line 43
    mul-double v11, v7, v13

    .line 44
    .line 45
    mul-double/2addr v11, v13

    .line 46
    add-double v11, v17, v11

    .line 47
    .line 48
    mul-double v19, v15, v3

    .line 49
    .line 50
    mul-double v19, v19, v15

    .line 51
    .line 52
    mul-double v19, v19, v9

    .line 53
    .line 54
    mul-double v3, v19, v13

    .line 55
    .line 56
    mul-double v19, v9, v9

    .line 57
    .line 58
    sub-double v19, v19, v17

    .line 59
    .line 60
    mul-double v7, v7, v19

    .line 61
    .line 62
    neg-double v7, v7

    .line 63
    div-double/2addr v7, v11

    .line 64
    move-wide/from16 v17, v5

    .line 65
    .line 66
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 67
    .line 68
    mul-double/2addr v11, v5

    .line 69
    move-wide v15, v1

    .line 70
    div-double v0, v3, v11

    .line 71
    .line 72
    invoke-static {v0, v1, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    add-double/2addr v7, v0

    .line 77
    invoke-static {v7, v8}, Ljava/lang/Math;->sqrt(D)D

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    neg-double v2, v3

    .line 82
    div-double/2addr v2, v11

    .line 83
    sub-double/2addr v2, v0

    .line 84
    mul-double/2addr v13, v2

    .line 85
    add-double/2addr v13, v9

    .line 86
    add-double/2addr v2, v15

    .line 87
    add-double v13, v13, v17

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_0

    .line 94
    .line 95
    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_0

    .line 100
    .line 101
    double-to-float v0, v2

    .line 102
    move-object/from16 v1, p16

    .line 103
    .line 104
    iput v0, v1, Landroid/graphics/PointF;->x:F

    .line 105
    .line 106
    double-to-float v0, v13

    .line 107
    iput v0, v1, Landroid/graphics/PointF;->y:F

    .line 108
    .line 109
    :cond_0
    return-void
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
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
.end method

.method private isBorderColorDefined(I)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    iget-object v2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :cond_1
    invoke-static {v0}, Lcom/facebook/yoga/d;->a(F)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    invoke-static {v1}, Lcom/facebook/yoga/d;->a(F)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    const/4 p1, 0x0

    .line 36
    :goto_1
    return p1
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
.end method

.method private setBorderAlpha(IF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 6
    .line 7
    const/high16 v1, 0x437f0000    # 255.0f

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/Spacing;-><init>(F)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
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
.end method

.method private setBorderRGB(IF)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/Spacing;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
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
.end method

.method private updatePath()V
    .locals 47

    move-object/from16 v0, p0

    .line 1
    iget-boolean v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 2
    iput-boolean v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 3
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    if-nez v2, :cond_1

    .line 4
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    .line 5
    :cond_1
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    if-nez v2, :cond_2

    .line 6
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    .line 7
    :cond_2
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    if-nez v2, :cond_3

    .line 8
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 9
    :cond_3
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    if-nez v2, :cond_4

    .line 10
    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    .line 11
    :cond_4
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    if-nez v2, :cond_5

    .line 12
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 13
    :cond_5
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    if-nez v2, :cond_6

    .line 14
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    .line 15
    :cond_6
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    if-nez v2, :cond_7

    .line 16
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    .line 17
    :cond_7
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    if-nez v2, :cond_8

    .line 18
    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    .line 19
    :cond_8
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 20
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 21
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 22
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 23
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 24
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 25
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 26
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 27
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getDirectionAwareBorderInsets()Landroid/graphics/RectF;

    move-result-object v2

    .line 28
    invoke-virtual {v0, v1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    move-result v3

    const/4 v4, 0x1

    .line 29
    invoke-virtual {v0, v4}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    move-result v5

    const/4 v6, 0x2

    .line 30
    invoke-virtual {v0, v6}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    move-result v7

    const/4 v8, 0x3

    .line 31
    invoke-virtual {v0, v8}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    move-result v9

    const/16 v10, 0x8

    .line 32
    invoke-virtual {v0, v10}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderColor(I)I

    move-result v11

    .line 33
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_9

    .line 34
    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_9

    .line 35
    invoke-static {v7}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_9

    .line 36
    invoke-static {v9}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_9

    .line 37
    invoke-static {v11}, Landroid/graphics/Color;->alpha(I)I

    move-result v3

    if-eqz v3, :cond_9

    .line 38
    iget-object v3, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->top:F

    iget v7, v2, Landroid/graphics/RectF;->top:F

    add-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->top:F

    .line 39
    iget v5, v3, Landroid/graphics/RectF;->bottom:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    sub-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->bottom:F

    .line 40
    iget v5, v3, Landroid/graphics/RectF;->left:F

    iget v7, v2, Landroid/graphics/RectF;->left:F

    add-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->left:F

    .line 41
    iget v5, v3, Landroid/graphics/RectF;->right:F

    iget v7, v2, Landroid/graphics/RectF;->right:F

    sub-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->right:F

    .line 42
    :cond_9
    iget-object v3, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->top:F

    iget v7, v2, Landroid/graphics/RectF;->top:F

    const/high16 v9, 0x3f000000    # 0.5f

    mul-float/2addr v7, v9

    add-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->top:F

    .line 43
    iget v5, v3, Landroid/graphics/RectF;->bottom:F

    iget v7, v2, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr v7, v9

    sub-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->bottom:F

    .line 44
    iget v5, v3, Landroid/graphics/RectF;->left:F

    iget v7, v2, Landroid/graphics/RectF;->left:F

    mul-float/2addr v7, v9

    add-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->left:F

    .line 45
    iget v5, v3, Landroid/graphics/RectF;->right:F

    iget v7, v2, Landroid/graphics/RectF;->right:F

    mul-float/2addr v7, v9

    sub-float/2addr v5, v7

    iput v5, v3, Landroid/graphics/RectF;->right:F

    .line 46
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getFullBorderRadius()F

    move-result v3

    .line 47
    sget-object v5, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->TOP_LEFT:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v3, v5}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v5

    .line 48
    sget-object v7, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->TOP_RIGHT:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v3, v7}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v7

    .line 49
    sget-object v11, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->BOTTOM_LEFT:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    .line 50
    invoke-virtual {v0, v3, v11}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v11

    .line 51
    sget-object v12, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->BOTTOM_RIGHT:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    .line 52
    invoke-virtual {v0, v3, v12}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v3

    .line 53
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getResolvedLayoutDirection()I

    move-result v12

    if-ne v12, v4, :cond_a

    move v12, v4

    goto :goto_0

    :cond_a
    move v12, v1

    .line 54
    :goto_0
    sget-object v13, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->TOP_START:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v13}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadius(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v13

    .line 55
    sget-object v14, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->TOP_END:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v14}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadius(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v14

    .line 56
    sget-object v15, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->BOTTOM_START:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v15}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadius(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v15

    .line 57
    sget-object v9, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;->BOTTOM_END:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;

    invoke-virtual {v0, v9}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadius(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result v9

    .line 58
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    move-result-object v8

    iget-object v6, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mContext:Landroid/content/Context;

    invoke-virtual {v8, v6}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 59
    invoke-static {v13}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_1

    :cond_b
    move v5, v13

    .line 60
    :goto_1
    invoke-static {v14}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_2

    :cond_c
    move v7, v14

    .line 61
    :goto_2
    invoke-static {v15}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_3

    :cond_d
    move v11, v15

    .line 62
    :goto_3
    invoke-static {v9}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_4

    :cond_e
    move v3, v9

    :goto_4
    if-eqz v12, :cond_f

    move v6, v7

    goto :goto_5

    :cond_f
    move v6, v5

    :goto_5
    if-eqz v12, :cond_10

    goto :goto_6

    :cond_10
    move v5, v7

    :goto_6
    if-eqz v12, :cond_11

    move v7, v3

    goto :goto_7

    :cond_11
    move v7, v11

    :goto_7
    if-eqz v12, :cond_1b

    move v3, v11

    goto :goto_c

    :cond_12
    if-eqz v12, :cond_13

    move v6, v14

    goto :goto_8

    :cond_13
    move v6, v13

    :goto_8
    if-eqz v12, :cond_14

    goto :goto_9

    :cond_14
    move v13, v14

    :goto_9
    if-eqz v12, :cond_15

    move v8, v9

    goto :goto_a

    :cond_15
    move v8, v15

    :goto_a
    if-eqz v12, :cond_16

    goto :goto_b

    :cond_16
    move v15, v9

    .line 63
    :goto_b
    invoke-static {v6}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v9

    if-nez v9, :cond_17

    move v5, v6

    .line 64
    :cond_17
    invoke-static {v13}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-nez v6, :cond_18

    move v7, v13

    .line 65
    :cond_18
    invoke-static {v8}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-nez v6, :cond_19

    move v11, v8

    .line 66
    :cond_19
    invoke-static {v15}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v6

    if-nez v6, :cond_1a

    move v6, v5

    move v5, v7

    move v7, v11

    move v3, v15

    goto :goto_c

    :cond_1a
    move v6, v5

    move v5, v7

    move v7, v11

    .line 67
    :cond_1b
    :goto_c
    iget v8, v2, Landroid/graphics/RectF;->left:F

    sub-float v8, v6, v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    .line 68
    iget v11, v2, Landroid/graphics/RectF;->top:F

    sub-float v11, v6, v11

    invoke-static {v11, v9}, Ljava/lang/Math;->max(FF)F

    move-result v11

    .line 69
    iget v12, v2, Landroid/graphics/RectF;->right:F

    sub-float v12, v5, v12

    invoke-static {v12, v9}, Ljava/lang/Math;->max(FF)F

    move-result v12

    .line 70
    iget v13, v2, Landroid/graphics/RectF;->top:F

    sub-float v13, v5, v13

    invoke-static {v13, v9}, Ljava/lang/Math;->max(FF)F

    move-result v13

    .line 71
    iget v14, v2, Landroid/graphics/RectF;->right:F

    sub-float v14, v3, v14

    invoke-static {v14, v9}, Ljava/lang/Math;->max(FF)F

    move-result v14

    .line 72
    iget v15, v2, Landroid/graphics/RectF;->bottom:F

    sub-float v15, v3, v15

    invoke-static {v15, v9}, Ljava/lang/Math;->max(FF)F

    move-result v15

    .line 73
    iget v4, v2, Landroid/graphics/RectF;->left:F

    sub-float v4, v7, v4

    invoke-static {v4, v9}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 74
    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    sub-float v1, v7, v1

    invoke-static {v1, v9}, Ljava/lang/Math;->max(FF)F

    move-result v1

    .line 75
    iget-object v9, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipPathForBorderRadius:Landroid/graphics/Path;

    move-object/from16 v22, v2

    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    move/from16 v23, v7

    new-array v7, v10, [F

    const/16 v20, 0x0

    aput v8, v7, v20

    const/16 v19, 0x1

    aput v11, v7, v19

    const/16 v18, 0x2

    aput v12, v7, v18

    const/16 v17, 0x3

    aput v13, v7, v17

    const/16 v24, 0x4

    aput v14, v7, v24

    const/16 v25, 0x5

    aput v15, v7, v25

    const/16 v26, 0x6

    aput v4, v7, v26

    const/16 v27, 0x7

    aput v1, v7, v27

    sget-object v10, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v9, v2, v7, v10}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 76
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipPathForBorderRadius:Landroid/graphics/Path;

    iget-object v7, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    const/16 v9, 0x8

    new-array v10, v9, [F

    const/4 v9, 0x0

    aput v6, v10, v9

    const/4 v9, 0x1

    aput v6, v10, v9

    const/4 v9, 0x2

    aput v5, v10, v9

    const/4 v9, 0x3

    aput v5, v10, v9

    aput v3, v10, v24

    aput v3, v10, v25

    aput v23, v10, v26

    aput v23, v10, v27

    sget-object v9, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v2, v7, v10, v9}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 77
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    const/high16 v7, 0x40000000    # 2.0f

    const/16 v9, 0x8

    if-eqz v2, :cond_1c

    .line 78
    invoke-virtual {v2, v9}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    move-result v2

    div-float/2addr v2, v7

    goto :goto_d

    :cond_1c
    const/4 v2, 0x0

    .line 79
    :goto_d
    iget-object v10, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    iget-object v7, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForBorderRadiusOutline:Landroid/graphics/RectF;

    move/from16 v29, v15

    new-array v15, v9, [F

    add-float v9, v6, v2

    const/16 v20, 0x0

    aput v9, v15, v20

    const/16 v19, 0x1

    aput v9, v15, v19

    add-float v9, v5, v2

    const/16 v18, 0x2

    aput v9, v15, v18

    const/16 v17, 0x3

    aput v9, v15, v17

    add-float v9, v3, v2

    aput v9, v15, v24

    aput v9, v15, v25

    add-float v2, v23, v2

    aput v2, v15, v26

    aput v2, v15, v27

    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    invoke-virtual {v10, v7, v15, v2}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 80
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mCenterDrawPath:Landroid/graphics/Path;

    iget-object v7, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mTempRectForCenterDrawPath:Landroid/graphics/RectF;

    const/16 v9, 0x8

    new-array v9, v9, [F

    move-object/from16 v10, v22

    iget v15, v10, Landroid/graphics/RectF;->left:F

    const/high16 v16, 0x3f000000    # 0.5f

    mul-float v22, v15, v16

    move/from16 v28, v14

    sub-float v14, v6, v22

    const/16 v21, 0x0

    cmpl-float v22, v15, v21

    if-lez v22, :cond_1d

    div-float v15, v6, v15

    goto :goto_e

    :cond_1d
    move/from16 v15, v21

    .line 81
    :goto_e
    invoke-static {v14, v15}, Ljava/lang/Math;->max(FF)F

    move-result v14

    const/4 v15, 0x0

    aput v14, v9, v15

    iget v14, v10, Landroid/graphics/RectF;->top:F

    mul-float v15, v14, v16

    sub-float v15, v6, v15

    cmpl-float v20, v14, v21

    if-lez v20, :cond_1e

    div-float/2addr v6, v14

    goto :goto_f

    :cond_1e
    move/from16 v6, v21

    .line 82
    :goto_f
    invoke-static {v15, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    const/4 v14, 0x1

    aput v6, v9, v14

    iget v6, v10, Landroid/graphics/RectF;->right:F

    mul-float v14, v6, v16

    sub-float v14, v5, v14

    cmpl-float v15, v6, v21

    if-lez v15, :cond_1f

    div-float v6, v5, v6

    goto :goto_10

    :cond_1f
    move/from16 v6, v21

    .line 83
    :goto_10
    invoke-static {v14, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    const/4 v14, 0x2

    aput v6, v9, v14

    iget v6, v10, Landroid/graphics/RectF;->top:F

    mul-float v14, v6, v16

    sub-float v14, v5, v14

    cmpl-float v15, v6, v21

    if-lez v15, :cond_20

    div-float/2addr v5, v6

    goto :goto_11

    :cond_20
    move/from16 v5, v21

    .line 84
    :goto_11
    invoke-static {v14, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    const/4 v6, 0x3

    aput v5, v9, v6

    iget v5, v10, Landroid/graphics/RectF;->right:F

    mul-float v6, v5, v16

    sub-float v6, v3, v6

    cmpl-float v14, v5, v21

    if-lez v14, :cond_21

    div-float v5, v3, v5

    goto :goto_12

    :cond_21
    move/from16 v5, v21

    .line 85
    :goto_12
    invoke-static {v6, v5}, Ljava/lang/Math;->max(FF)F

    move-result v5

    aput v5, v9, v24

    iget v5, v10, Landroid/graphics/RectF;->bottom:F

    mul-float v6, v5, v16

    sub-float v6, v3, v6

    cmpl-float v14, v5, v21

    if-lez v14, :cond_22

    div-float/2addr v3, v5

    goto :goto_13

    :cond_22
    move/from16 v3, v21

    .line 86
    :goto_13
    invoke-static {v6, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v9, v25

    iget v3, v10, Landroid/graphics/RectF;->left:F

    mul-float v5, v3, v16

    sub-float v5, v23, v5

    cmpl-float v6, v3, v21

    if-lez v6, :cond_23

    div-float v3, v23, v3

    goto :goto_14

    :cond_23
    move/from16 v3, v21

    .line 87
    :goto_14
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v9, v26

    iget v3, v10, Landroid/graphics/RectF;->bottom:F

    mul-float v5, v3, v16

    sub-float v5, v23, v5

    cmpl-float v6, v3, v21

    if-lez v6, :cond_24

    div-float v3, v23, v3

    goto :goto_15

    :cond_24
    move/from16 v3, v21

    .line 88
    :goto_15
    invoke-static {v5, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    aput v3, v9, v27

    sget-object v3, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 89
    invoke-virtual {v2, v7, v9, v3}, Landroid/graphics/Path;->addRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/Path$Direction;)V

    .line 90
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    if-nez v2, :cond_25

    .line 91
    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    .line 92
    :cond_25
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopLeftCorner:Landroid/graphics/PointF;

    move-object/from16 v46, v2

    iget-object v3, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->left:F

    iput v5, v2, Landroid/graphics/PointF;->x:F

    .line 93
    iget v3, v3, Landroid/graphics/RectF;->top:F

    iput v3, v2, Landroid/graphics/PointF;->y:F

    float-to-double v6, v5

    move-wide/from16 v30, v6

    float-to-double v6, v3

    move-wide/from16 v32, v6

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v8, v2

    add-float/2addr v8, v5

    float-to-double v6, v8

    move-wide/from16 v34, v6

    mul-float/2addr v11, v2

    add-float/2addr v11, v3

    float-to-double v6, v11

    move-wide/from16 v36, v6

    .line 94
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v6, v2, Landroid/graphics/RectF;->left:F

    float-to-double v6, v6

    move-wide/from16 v38, v6

    iget v2, v2, Landroid/graphics/RectF;->top:F

    float-to-double v6, v2

    move-wide/from16 v40, v6

    float-to-double v5, v5

    move-wide/from16 v42, v5

    float-to-double v2, v3

    move-wide/from16 v44, v2

    invoke-static/range {v30 .. v46}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 95
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    if-nez v2, :cond_26

    .line 96
    new-instance v2, Landroid/graphics/PointF;

    invoke-direct {v2}, Landroid/graphics/PointF;-><init>()V

    iput-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    .line 97
    :cond_26
    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomLeftCorner:Landroid/graphics/PointF;

    move-object/from16 v46, v2

    iget-object v3, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->left:F

    iput v5, v2, Landroid/graphics/PointF;->x:F

    .line 98
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    iput v3, v2, Landroid/graphics/PointF;->y:F

    float-to-double v6, v5

    move-wide/from16 v30, v6

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    sub-float v1, v3, v1

    float-to-double v6, v1

    move-wide/from16 v32, v6

    mul-float/2addr v4, v2

    add-float/2addr v4, v5

    float-to-double v1, v4

    move-wide/from16 v34, v1

    float-to-double v1, v3

    move-wide/from16 v36, v1

    .line 99
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    float-to-double v6, v2

    move-wide/from16 v38, v6

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v1, v1

    move-wide/from16 v40, v1

    float-to-double v1, v5

    move-wide/from16 v42, v1

    float-to-double v1, v3

    move-wide/from16 v44, v1

    invoke-static/range {v30 .. v46}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 100
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    if-nez v1, :cond_27

    .line 101
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    .line 102
    :cond_27
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerTopRightCorner:Landroid/graphics/PointF;

    move-object/from16 v46, v1

    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v3, v2, Landroid/graphics/RectF;->right:F

    iput v3, v1, Landroid/graphics/PointF;->x:F

    .line 103
    iget v2, v2, Landroid/graphics/RectF;->top:F

    iput v2, v1, Landroid/graphics/PointF;->y:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v12, v1

    sub-float v4, v3, v12

    float-to-double v4, v4

    move-wide/from16 v30, v4

    float-to-double v4, v2

    move-wide/from16 v32, v4

    float-to-double v4, v3

    move-wide/from16 v34, v4

    mul-float/2addr v13, v1

    add-float/2addr v13, v2

    float-to-double v4, v13

    move-wide/from16 v36, v4

    .line 104
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v4, v1, Landroid/graphics/RectF;->right:F

    float-to-double v4, v4

    move-wide/from16 v38, v4

    iget v1, v1, Landroid/graphics/RectF;->top:F

    float-to-double v4, v1

    move-wide/from16 v40, v4

    float-to-double v3, v3

    move-wide/from16 v42, v3

    float-to-double v1, v2

    move-wide/from16 v44, v1

    invoke-static/range {v30 .. v46}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    .line 105
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    if-nez v1, :cond_28

    .line 106
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1}, Landroid/graphics/PointF;-><init>()V

    iput-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    .line 107
    :cond_28
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerBottomRightCorner:Landroid/graphics/PointF;

    move-object/from16 v18, v1

    iget-object v2, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mInnerClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v14, v2, Landroid/graphics/RectF;->right:F

    iput v14, v1, Landroid/graphics/PointF;->x:F

    .line 108
    iget v15, v2, Landroid/graphics/RectF;->bottom:F

    iput v15, v1, Landroid/graphics/PointF;->y:F

    const/high16 v1, 0x40000000    # 2.0f

    mul-float v2, v28, v1

    sub-float v2, v14, v2

    float-to-double v2, v2

    mul-float v1, v1, v29

    sub-float v1, v15, v1

    float-to-double v4, v1

    float-to-double v6, v14

    float-to-double v8, v15

    .line 109
    iget-object v1, v0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mOuterClipTempRectForBorderRadius:Landroid/graphics/RectF;

    iget v10, v1, Landroid/graphics/RectF;->right:F

    float-to-double v10, v10

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v12, v1

    float-to-double v0, v14

    move-wide/from16 v19, v2

    move v2, v15

    move-wide v14, v0

    float-to-double v0, v2

    move-wide/from16 v16, v0

    move-wide/from16 v2, v19

    invoke-static/range {v2 .. v18}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getEllipseIntersectionWithLine(DDDDDDDDLandroid/graphics/PointF;)V

    return-void
.end method

.method private updatePathEffect()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getFullBorderWidth()F

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;->getPathEffect(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;F)Landroid/graphics/PathEffect;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method private updatePathEffect(I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

    if-eqz v0, :cond_0

    int-to-float p1, p1

    .line 4
    invoke-static {v0, p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;->getPathEffect(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;F)Landroid/graphics/PathEffect;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPaint:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePathEffect()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->hasRoundedBorders()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawRectangularBackgroundWithBorders(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->drawRoundedBackgroundWithBorders(Landroid/graphics/Canvas;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    return v0
.end method

.method public getBorderColor(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRGB:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderAlpha:Lcom/facebook/react/uimanager/Spacing;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Lcom/facebook/react/uimanager/Spacing;->get(I)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/high16 p1, 0x437f0000    # 255.0f

    .line 21
    .line 22
    :goto_1
    invoke-static {p1, v0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->colorFromAlphaAndRGBComponents(FF)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    return p1
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
.end method

.method public getBorderRadius(Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F

    move-result p1

    return p1
.end method

.method public getBorderRadiusOrDefaultTo(FLcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderRadiusLocation;)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    aget p2, v0, p2

    .line 11
    .line 12
    invoke-static {p2}, Lcom/facebook/yoga/d;->a(F)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return p1

    .line 19
    :cond_1
    return p2
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
.end method

.method public getBorderWidthOrDefaultTo(FI)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    invoke-virtual {v0, p2}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-static {p2}, Lcom/facebook/yoga/d;->a(F)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    return p2
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
.end method

.method public getColor()I
    .locals 1
    .annotation build Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    return v0
.end method

.method public getDirectionAwareBorderInsets()Landroid/graphics/RectF;
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-virtual {p0, v0, v3}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-virtual {p0, v0, v4}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-virtual {p0, v0, v6}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getBorderWidthOrDefaultTo(FI)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v6, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 29
    .line 30
    if-eqz v6, :cond_9

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->getResolvedLayoutDirection()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-ne v6, v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v4

    .line 40
    :goto_0
    iget-object v4, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    invoke-virtual {v4, v6}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    iget-object v6, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 48
    .line 49
    const/4 v7, 0x5

    .line 50
    invoke-virtual {v6, v7}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    iget-object v8, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mContext:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v7, v8}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_5

    .line 65
    .line 66
    invoke-static {v4}, Lcom/facebook/yoga/d;->a(F)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move v5, v4

    .line 74
    :goto_1
    invoke-static {v6}, Lcom/facebook/yoga/d;->a(F)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_2

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    move v0, v6

    .line 82
    :goto_2
    if-eqz v1, :cond_3

    .line 83
    .line 84
    move v4, v0

    .line 85
    goto :goto_3

    .line 86
    :cond_3
    move v4, v5

    .line 87
    :goto_3
    if-eqz v1, :cond_4

    .line 88
    .line 89
    move v0, v5

    .line 90
    :cond_4
    move v5, v4

    .line 91
    goto :goto_6

    .line 92
    :cond_5
    if-eqz v1, :cond_6

    .line 93
    .line 94
    move v7, v6

    .line 95
    goto :goto_4

    .line 96
    :cond_6
    move v7, v4

    .line 97
    :goto_4
    if-eqz v1, :cond_7

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move v4, v6

    .line 101
    :goto_5
    invoke-static {v7}, Lcom/facebook/yoga/d;->a(F)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_8

    .line 106
    .line 107
    move v5, v7

    .line 108
    :cond_8
    invoke-static {v4}, Lcom/facebook/yoga/d;->a(F)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_9

    .line 113
    .line 114
    move v0, v4

    .line 115
    :cond_9
    :goto_6
    new-instance v1, Landroid/graphics/RectF;

    .line 116
    .line 117
    invoke-direct {v1, v5, v2, v0, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 118
    .line 119
    .line 120
    return-object v1
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
.end method

.method public getFullBorderRadius()F
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    invoke-static {v0}, Lcom/facebook/yoga/d;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    :goto_0
    return v0
.end method

.method public getFullBorderWidth()F
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {v0}, Lcom/facebook/yoga/d;->a(F)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    return v0
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
.end method

.method public getOpacity()I
    .locals 2

    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    iget v1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    invoke-static {v0, v1}, Lcom/facebook/react/views/view/ColorUtil;->multiplyColorAlpha(II)I

    move-result v0

    invoke-static {v0}, Lcom/facebook/react/views/view/ColorUtil;->getOpacityFromColor(I)I

    move-result v0

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/yoga/d;->a(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->updatePath()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mPathForBorderRadiusOutline:Landroid/graphics/Path;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0}, Landroid/graphics/Outline;->setRect(Landroid/graphics/Rect;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-void
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
.end method

.method public getResolvedLayoutDirection()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mLayoutDirection:I

    return v0
.end method

.method public hasRoundedBorders()Z
    .locals 8

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/yoga/d;->a(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    .line 12
    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    return v2

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    array-length v4, v0

    .line 24
    move v5, v3

    .line 25
    :goto_0
    if-ge v5, v4, :cond_2

    .line 26
    .line 27
    aget v6, v0, v5

    .line 28
    .line 29
    invoke-static {v6}, Lcom/facebook/yoga/d;->a(F)Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    if-nez v7, :cond_1

    .line 34
    .line 35
    cmpl-float v6, v6, v1

    .line 36
    .line 37
    if-lez v6, :cond_1

    .line 38
    .line 39
    return v2

    .line 40
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return v3
    .line 44
.end method

.method protected onBoundsChange(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 6
    .line 7
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public onResolvedLayoutDirectionChanged(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setAlpha(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mAlpha:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public setBorderColor(IFF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->setBorderRGB(IF)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->setBorderAlpha(IF)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 9
    .line 10
    return-void
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
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;->valueOf(Ljava/lang/String;)Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    iput-object p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderStyle:Lcom/facebook/react/views/view/ReactViewBackgroundDrawable$BorderStyle;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
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
.end method

.method public setBorderWidth(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/Spacing;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/facebook/react/uimanager/Spacing;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/Spacing;->getRaw(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0, p2}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderWidth:Lcom/facebook/react/uimanager/Spacing;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/Spacing;->set(IF)Z

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    if-eq p1, p2, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x2

    .line 35
    if-eq p1, v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    if-eq p1, v0, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    if-eq p1, v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    if-eq p1, v0, :cond_1

    .line 45
    .line 46
    const/16 v0, 0x8

    .line 47
    .line 48
    if-eq p1, v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iput-boolean p2, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
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
.end method

.method public setColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mColor:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 4
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public setRadius(F)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iput p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderRadius:F

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 4
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setRadius(FI)V
    .locals 2

    .line 5
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    if-nez v0, :cond_0

    const/16 v0, 0x8

    new-array v0, v0, [F

    .line 6
    iput-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    aget v0, v0, p2

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/FloatUtil;->floatsEqual(FF)Z

    move-result v0

    if-nez v0, :cond_1

    .line 9
    iget-object v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mBorderCornerRadii:[F

    aput p1, v0, p2

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mNeedUpdatePathForBorderRadius:Z

    .line 11
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public setResolvedLayoutDirection(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mLayoutDirection:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->mLayoutDirection:I

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/view/ReactViewBackgroundDrawable;->onResolvedLayoutDirectionChanged(I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
