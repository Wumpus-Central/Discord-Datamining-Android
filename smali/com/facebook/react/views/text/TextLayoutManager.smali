.class public Lcom/facebook/react/views/text/TextLayoutManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;
    }
.end annotation


# static fields
.field private static final DEFAULT_INCLUDE_FONT_PADDING:Z = true

.field private static final ENABLE_MEASURE_LOGGING:Z = false

.field private static final HYPHENATION_FREQUENCY_KEY:Ljava/lang/String; = "android_hyphenationFrequency"

.field private static final INCLUDE_FONT_PADDING_KEY:Ljava/lang/String; = "includeFontPadding"

.field private static final INLINE_VIEW_PLACEHOLDER:Ljava/lang/String; = "0"

.field private static final MAXIMUM_NUMBER_OF_LINES_KEY:Ljava/lang/String; = "maximumNumberOfLines"

.field private static final TAG:Ljava/lang/String; = "TextLayoutManager"

.field private static final TEXT_BREAK_STRATEGY_KEY:Ljava/lang/String; = "textBreakStrategy"

.field private static final sSpannableCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Lcom/facebook/react/bridge/ReadableNativeMap;",
            "Landroid/text/Spannable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sSpannableCacheLock:Ljava/lang/Object;

.field private static final sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Landroid/text/Spannable;",
            ">;"
        }
    .end annotation
.end field

.field private static final sTextPaintInstance:Landroid/text/TextPaint;

.field private static final spannableCacheSize:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/text/TextPaint;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroid/text/TextPaint;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sSpannableCacheLock:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v0, Landroid/util/LruCache;

    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sSpannableCache:Landroid/util/LruCache;

    .line 24
    .line 25
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

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
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static buildSpannableFromFragment(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableArray;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            "Landroid/text/SpannableStringBuilder;",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_e

    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    new-instance v6, Lcom/facebook/react/uimanager/ReactStylesDiffMap;

    .line 21
    .line 22
    const-string v7, "textAttributes"

    .line 23
    .line 24
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-direct {v6, v7}, Lcom/facebook/react/uimanager/ReactStylesDiffMap;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v6}, Lcom/facebook/react/views/text/TextAttributeProps;->fromReadableMap(Lcom/facebook/react/uimanager/ReactStylesDiffMap;)Lcom/facebook/react/views/text/TextAttributeProps;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "string"

    .line 36
    .line 37
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget-object v8, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 42
    .line 43
    invoke-static {v7, v8}, Lcom/facebook/react/views/text/TextTransform;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    move-object/from16 v8, p2

    .line 48
    .line 49
    invoke-virtual {v8, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v9, "reactTag"

    .line 57
    .line 58
    invoke-interface {v4, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    const/4 v11, -0x1

    .line 63
    if-eqz v10, :cond_0

    .line 64
    .line 65
    invoke-interface {v4, v9}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    move v9, v11

    .line 71
    :goto_1
    const-string v10, "isAttachment"

    .line 72
    .line 73
    invoke-interface {v4, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v12

    .line 77
    if-eqz v12, :cond_1

    .line 78
    .line 79
    invoke-interface {v4, v10}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_1

    .line 84
    .line 85
    const-string v5, "width"

    .line 86
    .line 87
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 88
    .line 89
    .line 90
    move-result-wide v5

    .line 91
    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    const-string v6, "height"

    .line 96
    .line 97
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    new-instance v6, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 106
    .line 107
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    add-int/lit8 v7, v7, -0x1

    .line 112
    .line 113
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    new-instance v11, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 118
    .line 119
    float-to-int v5, v5

    .line 120
    float-to-int v4, v4

    .line 121
    invoke-direct {v11, v9, v5, v4}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;-><init>(III)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v6, v7, v10, v11}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto/16 :goto_4

    .line 131
    .line 132
    :cond_1
    if-lt v7, v5, :cond_d

    .line 133
    .line 134
    iget-boolean v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mIsAccessibilityLink:Z

    .line 135
    .line 136
    if-eqz v4, :cond_2

    .line 137
    .line 138
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 139
    .line 140
    new-instance v10, Lcom/facebook/react/views/text/ReactClickableSpan;

    .line 141
    .line 142
    invoke-direct {v10, v9}, Lcom/facebook/react/views/text/ReactClickableSpan;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-direct {v4, v5, v7, v10}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_2
    iget-boolean v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mIsColorSet:Z

    .line 152
    .line 153
    if-eqz v4, :cond_3

    .line 154
    .line 155
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 156
    .line 157
    new-instance v10, Lcom/facebook/react/views/text/ReactForegroundColorSpan;

    .line 158
    .line 159
    iget v12, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mColor:I

    .line 160
    .line 161
    invoke-direct {v10, v12}, Lcom/facebook/react/views/text/ReactForegroundColorSpan;-><init>(I)V

    .line 162
    .line 163
    .line 164
    invoke-direct {v4, v5, v7, v10}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_3
    iget-boolean v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mIsBackgroundColorSet:Z

    .line 171
    .line 172
    if-eqz v4, :cond_4

    .line 173
    .line 174
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 175
    .line 176
    new-instance v10, Lcom/facebook/react/views/text/ReactBackgroundColorSpan;

    .line 177
    .line 178
    iget v12, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mBackgroundColor:I

    .line 179
    .line 180
    invoke-direct {v10, v12}, Lcom/facebook/react/views/text/ReactBackgroundColorSpan;-><init>(I)V

    .line 181
    .line 182
    .line 183
    invoke-direct {v4, v5, v7, v10}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :cond_4
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_5

    .line 198
    .line 199
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 200
    .line 201
    new-instance v10, Lcom/facebook/react/views/text/CustomLetterSpacingSpan;

    .line 202
    .line 203
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    invoke-direct {v10, v12}, Lcom/facebook/react/views/text/CustomLetterSpacingSpan;-><init>(F)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v4, v5, v7, v10}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    :cond_5
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 217
    .line 218
    new-instance v10, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;

    .line 219
    .line 220
    iget v12, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontSize:I

    .line 221
    .line 222
    invoke-direct {v10, v12}, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v4, v5, v7, v10}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 226
    .line 227
    .line 228
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    iget v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    .line 232
    .line 233
    if-ne v4, v11, :cond_7

    .line 234
    .line 235
    iget v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    .line 236
    .line 237
    if-ne v4, v11, :cond_7

    .line 238
    .line 239
    iget-object v4, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    .line 240
    .line 241
    if-eqz v4, :cond_6

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    move/from16 v17, v1

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_7
    :goto_2
    new-instance v4, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 248
    .line 249
    new-instance v15, Lcom/facebook/react/views/text/CustomStyleSpan;

    .line 250
    .line 251
    iget v11, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    .line 252
    .line 253
    iget v12, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    .line 254
    .line 255
    iget-object v13, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFeatureSettings:Ljava/lang/String;

    .line 256
    .line 257
    iget-object v14, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    .line 258
    .line 259
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 260
    .line 261
    .line 262
    move-result-object v16

    .line 263
    move-object v10, v15

    .line 264
    move/from16 v17, v1

    .line 265
    .line 266
    move-object v1, v15

    .line 267
    move-object/from16 v15, v16

    .line 268
    .line 269
    invoke-direct/range {v10 .. v15}, Lcom/facebook/react/views/text/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v4, v5, v7, v1}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    :goto_3
    iget-boolean v1, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mIsUnderlineTextDecorationSet:Z

    .line 279
    .line 280
    if-eqz v1, :cond_8

    .line 281
    .line 282
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 283
    .line 284
    new-instance v4, Lcom/facebook/react/views/text/ReactUnderlineSpan;

    .line 285
    .line 286
    invoke-direct {v4}, Lcom/facebook/react/views/text/ReactUnderlineSpan;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-direct {v1, v5, v7, v4}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 290
    .line 291
    .line 292
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    :cond_8
    iget-boolean v1, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mIsLineThroughTextDecorationSet:Z

    .line 296
    .line 297
    if-eqz v1, :cond_9

    .line 298
    .line 299
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 300
    .line 301
    new-instance v4, Lcom/facebook/react/views/text/ReactStrikethroughSpan;

    .line 302
    .line 303
    invoke-direct {v4}, Lcom/facebook/react/views/text/ReactStrikethroughSpan;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-direct {v1, v5, v7, v4}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_9
    iget v1, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    .line 313
    .line 314
    const/4 v4, 0x0

    .line 315
    cmpl-float v1, v1, v4

    .line 316
    .line 317
    if-nez v1, :cond_a

    .line 318
    .line 319
    iget v1, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    .line 320
    .line 321
    cmpl-float v1, v1, v4

    .line 322
    .line 323
    if-eqz v1, :cond_b

    .line 324
    .line 325
    :cond_a
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 326
    .line 327
    new-instance v4, Lcom/facebook/react/views/text/ShadowStyleSpan;

    .line 328
    .line 329
    iget v10, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    .line 330
    .line 331
    iget v11, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    .line 332
    .line 333
    iget v12, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowRadius:F

    .line 334
    .line 335
    iget v13, v6, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowColor:I

    .line 336
    .line 337
    invoke-direct {v4, v10, v11, v12, v13}, Lcom/facebook/react/views/text/ShadowStyleSpan;-><init>(FFFI)V

    .line 338
    .line 339
    .line 340
    invoke-direct {v1, v5, v7, v4}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 341
    .line 342
    .line 343
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    :cond_b
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_c

    .line 355
    .line 356
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 357
    .line 358
    new-instance v4, Lcom/facebook/react/views/text/CustomLineHeightSpan;

    .line 359
    .line 360
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    .line 361
    .line 362
    .line 363
    move-result v6

    .line 364
    invoke-direct {v4, v6}, Lcom/facebook/react/views/text/CustomLineHeightSpan;-><init>(F)V

    .line 365
    .line 366
    .line 367
    invoke-direct {v1, v5, v7, v4}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    :cond_c
    new-instance v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 374
    .line 375
    new-instance v4, Lcom/facebook/react/views/text/ReactTagSpan;

    .line 376
    .line 377
    invoke-direct {v4, v9}, Lcom/facebook/react/views/text/ReactTagSpan;-><init>(I)V

    .line 378
    .line 379
    .line 380
    invoke-direct {v1, v5, v7, v4}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 381
    .line 382
    .line 383
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_d
    :goto_4
    move/from16 v17, v1

    .line 388
    .line 389
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 390
    .line 391
    move/from16 v1, v17

    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :cond_e
    return-void
.end method

.method private static createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZII)Landroid/text/Layout;
    .locals 15

    .line 1
    move-object v0, p0

    .line 2
    move-object/from16 v6, p1

    .line 3
    .line 4
    move/from16 v1, p2

    .line 5
    .line 6
    move/from16 v7, p4

    .line 7
    .line 8
    move/from16 v2, p5

    .line 9
    .line 10
    move/from16 v3, p6

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    sget-object v5, Lcom/facebook/yoga/YogaMeasureMode;->l:Lcom/facebook/yoga/YogaMeasureMode;

    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    const/4 v9, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    move-object/from16 v11, p3

    .line 22
    .line 23
    if-eq v11, v5, :cond_1

    .line 24
    .line 25
    cmpg-float v5, v1, v9

    .line 26
    .line 27
    if-gez v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v5, v10

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move v5, v8

    .line 33
    :goto_1
    sget-object v11, Lcom/facebook/react/views/text/TextLayoutManager;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 34
    .line 35
    if-nez v6, :cond_2

    .line 36
    .line 37
    invoke-static {p0, v11}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/high16 v12, 0x7fc00000    # Float.NaN

    .line 43
    .line 44
    :goto_2
    const/high16 v13, 0x3f800000    # 1.0f

    .line 45
    .line 46
    if-nez v6, :cond_4

    .line 47
    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    invoke-static {v12}, Lcom/facebook/yoga/d;->a(F)Z

    .line 51
    .line 52
    .line 53
    move-result v14

    .line 54
    if-nez v14, :cond_4

    .line 55
    .line 56
    cmpg-float v14, v12, v1

    .line 57
    .line 58
    if-gtz v14, :cond_4

    .line 59
    .line 60
    :cond_3
    float-to-double v5, v12

    .line 61
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 62
    .line 63
    .line 64
    move-result-wide v5

    .line 65
    double-to-int v1, v5

    .line 66
    invoke-static {p0, v10, v4, v11, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v9, v13}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v7}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0, v2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_4

    .line 97
    :cond_4
    if-eqz v6, :cond_7

    .line 98
    .line 99
    if-nez v5, :cond_5

    .line 100
    .line 101
    iget v5, v6, Landroid/text/BoringLayout$Metrics;->width:I

    .line 102
    .line 103
    int-to-float v5, v5

    .line 104
    cmpg-float v5, v5, v1

    .line 105
    .line 106
    if-gtz v5, :cond_7

    .line 107
    .line 108
    :cond_5
    iget v1, v6, Landroid/text/BoringLayout$Metrics;->width:I

    .line 109
    .line 110
    if-gez v1, :cond_6

    .line 111
    .line 112
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->TAG:Ljava/lang/String;

    .line 113
    .line 114
    new-instance v2, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 115
    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v4, "Text width is invalid: "

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget v4, v6, Landroid/text/BoringLayout$Metrics;->width:I

    .line 127
    .line 128
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-direct {v2, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    move v2, v10

    .line 142
    goto :goto_3

    .line 143
    :cond_6
    move v2, v1

    .line 144
    :goto_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 145
    .line 146
    const/high16 v4, 0x3f800000    # 1.0f

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    move-object v0, p0

    .line 150
    move-object v1, v11

    .line 151
    move-object/from16 v6, p1

    .line 152
    .line 153
    move/from16 v7, p4

    .line 154
    .line 155
    invoke-static/range {v0 .. v7}, Landroid/text/BoringLayout;->make(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)Landroid/text/BoringLayout;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    goto :goto_4

    .line 160
    :cond_7
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 161
    .line 162
    float-to-int v1, v1

    .line 163
    invoke-static {p0, v10, v4, v11, v1}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    sget-object v1, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0, v9, v13}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0, v7}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, v2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0, v3}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    const/16 v1, 0x1c

    .line 190
    .line 191
    if-lt v5, v1, :cond_8

    .line 192
    .line 193
    invoke-static {v0, v8}, Lcom/facebook/react/views/text/c;->a(Landroid/text/StaticLayout$Builder;Z)Landroid/text/StaticLayout$Builder;

    .line 194
    .line 195
    .line 196
    :cond_8
    invoke-virtual {v0}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :goto_4
    return-object v0
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
.end method

.method private static createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 3

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v2, "fragments"

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p0, p1, v0, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->buildSpannableFromFragment(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableArray;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;

    .line 36
    .line 37
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/views/text/TextLayoutManager$SetSpanOperation;->execute(Landroid/text/Spannable;I)V

    .line 38
    .line 39
    .line 40
    add-int/lit8 p1, p1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-interface {p2, v0}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    return-object v0
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

.method public static deleteCachedSpannableForTag(I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableSpannableCache:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sSpannableCacheLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManager;->sSpannableCache:Landroid/util/LruCache;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Lcom/facebook/react/bridge/ReadableNativeMap;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-object v2

    .line 23
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    monitor-enter v0

    .line 29
    :try_start_1
    check-cast p1, Lcom/facebook/react/bridge/ReadableNativeMap;

    .line 30
    .line 31
    invoke-virtual {v1, p1, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p0

    .line 39
    :catchall_1
    move-exception p0

    .line 40
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 41
    throw p0

    .line 42
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManager;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :goto_0
    return-object p0
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

.method public static isRTL(Lcom/facebook/react/bridge/ReadableMap;)Z
    .locals 2

    .line 1
    const-string v0, "fragments"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0, v1}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "textAttributes"

    .line 19
    .line 20
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "layoutDirection"

    .line 25
    .line 26
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lcom/facebook/react/views/text/TextAttributeProps;->getLayoutDirection(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p0, v0, :cond_0

    .line 36
    .line 37
    move v1, v0

    .line 38
    :cond_0
    return v1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method

.method public static measureLines(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;F)Lcom/facebook/react/bridge/WritableArray;
    .locals 9

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, p1, v1}, Lcom/facebook/react/views/text/TextLayoutManager;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1, v0}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    const-string v1, "textBreakStrategy"

    .line 13
    .line 14
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    const-string v1, "includeFontPadding"

    .line 23
    .line 24
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x1

    .line 36
    :goto_0
    move v6, v1

    .line 37
    const-string v1, "android_hyphenationFrequency"

    .line 38
    .line 39
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-static {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    sget-object v5, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 48
    .line 49
    move-object v2, p1

    .line 50
    move v4, p3

    .line 51
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZII)Landroid/text/Layout;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-static {p1, p2, v0, p0}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
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
.end method

.method public static measureText(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v9, p4

    .line 6
    .line 7
    move-object/from16 v10, p6

    .line 8
    .line 9
    sget-object v2, Lcom/facebook/react/views/text/TextLayoutManager;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 10
    .line 11
    const-string v3, "cacheId"

    .line 12
    .line 13
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget-object v3, Lcom/facebook/react/views/text/TextLayoutManager;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3, v4}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v3, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Landroid/text/Spannable;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-wide/16 v0, 0x0

    .line 47
    .line 48
    return-wide v0

    .line 49
    :cond_1
    move-object/from16 v3, p0

    .line 50
    .line 51
    move-object/from16 v4, p7

    .line 52
    .line 53
    invoke-static {v3, v0, v4}, Lcom/facebook/react/views/text/TextLayoutManager;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    const-string v3, "textBreakStrategy"

    .line 58
    .line 59
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-static {v3}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const-string v3, "includeFontPadding"

    .line 68
    .line 69
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    const/4 v11, 0x1

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    move v6, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v6, v11

    .line 83
    :goto_1
    const-string v3, "android_hyphenationFrequency"

    .line 84
    .line 85
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, Lcom/facebook/react/views/text/TextAttributeProps;->getHyphenationFrequency(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v0, :cond_18

    .line 94
    .line 95
    invoke-static {v0, v2}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    move-object v2, v0

    .line 100
    move/from16 v4, p3

    .line 101
    .line 102
    move-object/from16 v5, p4

    .line 103
    .line 104
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/text/TextLayoutManager;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZII)Landroid/text/Layout;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const-string v3, "maximumNumberOfLines"

    .line 109
    .line 110
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    const/4 v5, -0x1

    .line 115
    if-eqz v4, :cond_3

    .line 116
    .line 117
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move v1, v5

    .line 123
    :goto_2
    if-eq v1, v5, :cond_5

    .line 124
    .line 125
    if-nez v1, :cond_4

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    :goto_3
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    :goto_4
    sget-object v3, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 142
    .line 143
    if-ne v9, v3, :cond_6

    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    const/4 v3, 0x0

    .line 147
    const/4 v6, 0x0

    .line 148
    :goto_5
    if-ge v6, v1, :cond_8

    .line 149
    .line 150
    invoke-virtual {v2, v6}, Landroid/text/Layout;->getLineWidth(I)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    cmpl-float v8, v7, v3

    .line 155
    .line 156
    if-lez v8, :cond_7

    .line 157
    .line 158
    move v3, v7

    .line 159
    :cond_7
    add-int/lit8 v6, v6, 0x1

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_8
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 163
    .line 164
    if-ne v9, v6, :cond_9

    .line 165
    .line 166
    cmpl-float v6, v3, p3

    .line 167
    .line 168
    if-lez v6, :cond_9

    .line 169
    .line 170
    :goto_6
    move/from16 v3, p3

    .line 171
    .line 172
    :cond_9
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 173
    .line 174
    if-eq v10, v6, :cond_a

    .line 175
    .line 176
    sub-int/2addr v1, v11

    .line 177
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    int-to-float v1, v1

    .line 182
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 183
    .line 184
    if-ne v10, v6, :cond_b

    .line 185
    .line 186
    cmpl-float v6, v1, p5

    .line 187
    .line 188
    if-lez v6, :cond_b

    .line 189
    .line 190
    :cond_a
    move/from16 v1, p5

    .line 191
    .line 192
    :cond_b
    const/4 v6, 0x0

    .line 193
    const/4 v7, 0x0

    .line 194
    :goto_7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-ge v6, v8, :cond_17

    .line 199
    .line 200
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    const-class v9, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 205
    .line 206
    invoke-interface {v0, v6, v8, v9}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    invoke-interface {v0, v6, v8, v9}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    check-cast v6, [Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 215
    .line 216
    array-length v9, v6

    .line 217
    const/4 v10, 0x0

    .line 218
    :goto_8
    if-ge v10, v9, :cond_16

    .line 219
    .line 220
    aget-object v12, v6, v10

    .line 221
    .line 222
    invoke-interface {v0, v12}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 223
    .line 224
    .line 225
    move-result v13

    .line 226
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 231
    .line 232
    .line 233
    move-result v15

    .line 234
    if-lez v15, :cond_c

    .line 235
    .line 236
    move v15, v11

    .line 237
    goto :goto_9

    .line 238
    :cond_c
    const/4 v15, 0x0

    .line 239
    :goto_9
    if-eqz v15, :cond_e

    .line 240
    .line 241
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineStart(I)I

    .line 242
    .line 243
    .line 244
    move-result v15

    .line 245
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 246
    .line 247
    .line 248
    move-result v16

    .line 249
    add-int v15, v15, v16

    .line 250
    .line 251
    if-lt v13, v15, :cond_e

    .line 252
    .line 253
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineEnd(I)I

    .line 254
    .line 255
    .line 256
    move-result v15

    .line 257
    if-lt v13, v15, :cond_d

    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_d
    move v5, v11

    .line 261
    goto/16 :goto_f

    .line 262
    .line 263
    :cond_e
    :goto_a
    invoke-virtual {v12}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;->getWidth()I

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    int-to-float v15, v15

    .line 268
    invoke-virtual {v12}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;->getHeight()I

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    int-to-float v12, v12

    .line 273
    invoke-virtual {v2, v13}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    if-ne v11, v5, :cond_f

    .line 282
    .line 283
    const/4 v11, 0x1

    .line 284
    goto :goto_b

    .line 285
    :cond_f
    const/4 v11, 0x0

    .line 286
    :goto_b
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 287
    .line 288
    .line 289
    move-result v16

    .line 290
    const/16 v17, 0x1

    .line 291
    .line 292
    add-int/lit8 v5, v16, -0x1

    .line 293
    .line 294
    if-ne v13, v5, :cond_11

    .line 295
    .line 296
    if-eqz v11, :cond_10

    .line 297
    .line 298
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineWidth(I)F

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    sub-float v4, v3, v4

    .line 303
    .line 304
    goto :goto_e

    .line 305
    :cond_10
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineRight(I)F

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    sub-float/2addr v4, v15

    .line 310
    goto :goto_e

    .line 311
    :cond_11
    if-ne v11, v4, :cond_12

    .line 312
    .line 313
    const/16 v17, 0x1

    .line 314
    .line 315
    goto :goto_c

    .line 316
    :cond_12
    const/16 v17, 0x0

    .line 317
    .line 318
    :goto_c
    if-eqz v17, :cond_13

    .line 319
    .line 320
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    goto :goto_d

    .line 325
    :cond_13
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    :goto_d
    if-eqz v11, :cond_14

    .line 330
    .line 331
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineRight(I)F

    .line 332
    .line 333
    .line 334
    move-result v11

    .line 335
    sub-float/2addr v11, v5

    .line 336
    sub-float v5, v3, v11

    .line 337
    .line 338
    :cond_14
    if-eqz v4, :cond_15

    .line 339
    .line 340
    sub-float v4, v5, v15

    .line 341
    .line 342
    goto :goto_e

    .line 343
    :cond_15
    move v4, v5

    .line 344
    :goto_e
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    int-to-float v5, v5

    .line 349
    sub-float/2addr v5, v12

    .line 350
    mul-int/lit8 v11, v7, 0x2

    .line 351
    .line 352
    invoke-static {v5}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    aput v5, p8, v11

    .line 357
    .line 358
    const/4 v5, 0x1

    .line 359
    add-int/2addr v11, v5

    .line 360
    invoke-static {v4}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    aput v4, p8, v11

    .line 365
    .line 366
    add-int/lit8 v7, v7, 0x1

    .line 367
    .line 368
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 369
    .line 370
    move v11, v5

    .line 371
    const/4 v5, -0x1

    .line 372
    goto/16 :goto_8

    .line 373
    .line 374
    :cond_16
    move v6, v8

    .line 375
    goto/16 :goto_7

    .line 376
    .line 377
    :cond_17
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-static {v0, v1}, Lcom/facebook/yoga/f;->a(FF)J

    .line 386
    .line 387
    .line 388
    move-result-wide v0

    .line 389
    return-wide v0

    .line 390
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 391
    .line 392
    const-string v1, "Spannable element has not been prepared in onBeforeLayout"

    .line 393
    .line 394
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v0
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

.method public static setCachedSpannabledForTag(ILandroid/text/Spannable;)V
    .locals 1

    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManager;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
