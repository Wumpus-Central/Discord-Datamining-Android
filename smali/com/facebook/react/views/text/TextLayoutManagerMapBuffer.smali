.class public Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;
    }
.end annotation


# static fields
.field public static final AS_KEY_CACHE_ID:S = 0x3s

.field public static final AS_KEY_FRAGMENTS:S = 0x2s

.field public static final AS_KEY_HASH:S = 0x0s

.field public static final AS_KEY_STRING:S = 0x1s

.field private static final DEFAULT_INCLUDE_FONT_PADDING:Z = true

.field private static final ENABLE_MEASURE_LOGGING:Z = false

.field public static final FR_KEY_HEIGHT:S = 0x4s

.field public static final FR_KEY_IS_ATTACHMENT:S = 0x2s

.field public static final FR_KEY_REACT_TAG:S = 0x1s

.field public static final FR_KEY_STRING:S = 0x0s

.field public static final FR_KEY_TEXT_ATTRIBUTES:S = 0x5s

.field public static final FR_KEY_WIDTH:S = 0x3s

.field private static final INLINE_VIEW_PLACEHOLDER:Ljava/lang/String; = "0"

.field public static final PA_KEY_ADJUST_FONT_SIZE_TO_FIT:S = 0x3s

.field public static final PA_KEY_ELLIPSIZE_MODE:S = 0x1s

.field public static final PA_KEY_HYPHENATION_FREQUENCY:S = 0x5s

.field public static final PA_KEY_INCLUDE_FONT_PADDING:S = 0x4s

.field public static final PA_KEY_MAX_NUMBER_OF_LINES:S = 0x0s

.field public static final PA_KEY_TEXT_BREAK_STRATEGY:S = 0x2s

.field private static final TAG:Ljava/lang/String; = "TextLayoutManagerMapBuffer"

.field private static final sSpannableCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
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

.field private static final spannableCacheSize:S = 0x64s


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
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sSpannableCacheLock:Ljava/lang/Object;

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
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sSpannableCache:Landroid/util/LruCache;

    .line 24
    .line 25
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

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

.method private static buildSpannableFromFragment(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/react/common/mapbuffer/MapBuffer;",
            "Landroid/text/SpannableStringBuilder;",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_e

    .line 10
    .line 11
    move-object/from16 v4, p1

    .line 12
    .line 13
    invoke-interface {v4, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    const/4 v7, 0x5

    .line 22
    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-static {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->fromMapBuffer(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Lcom/facebook/react/views/text/TextAttributeProps;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-interface {v5, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    iget-object v9, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextTransform:Lcom/facebook/react/views/text/TextTransform;

    .line 35
    .line 36
    invoke-static {v8, v9}, Lcom/facebook/react/views/text/TextTransform;->apply(Ljava/lang/String;Lcom/facebook/react/views/text/TextTransform;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    move-object/from16 v9, p2

    .line 41
    .line 42
    invoke-virtual {v9, v8}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    const/4 v10, 0x1

    .line 50
    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    const/4 v12, -0x1

    .line 55
    if-eqz v11, :cond_0

    .line 56
    .line 57
    invoke-interface {v5, v10}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    move v11, v12

    .line 63
    :goto_1
    const/4 v13, 0x2

    .line 64
    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    if-eqz v14, :cond_1

    .line 69
    .line 70
    invoke-interface {v5, v13}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    if-eqz v13, :cond_1

    .line 75
    .line 76
    const/4 v6, 0x3

    .line 77
    invoke-interface {v5, v6}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    invoke-static {v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    const/4 v7, 0x4

    .line 86
    invoke-interface {v5, v7}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getDouble(I)D

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    invoke-static {v7, v8}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(D)F

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    new-instance v7, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 95
    .line 96
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    sub-int/2addr v8, v10

    .line 101
    invoke-virtual/range {p2 .. p2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    new-instance v12, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 106
    .line 107
    float-to-int v6, v6

    .line 108
    float-to-int v5, v5

    .line 109
    invoke-direct {v12, v11, v6, v5}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;-><init>(III)V

    .line 110
    .line 111
    .line 112
    invoke-direct {v7, v8, v10, v12}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto/16 :goto_2

    .line 119
    .line 120
    :cond_1
    if-lt v8, v6, :cond_d

    .line 121
    .line 122
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsAccessibilityLink:Z

    .line 123
    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 127
    .line 128
    new-instance v10, Lcom/facebook/react/views/text/ReactClickableSpan;

    .line 129
    .line 130
    invoke-direct {v10, v11}, Lcom/facebook/react/views/text/ReactClickableSpan;-><init>(I)V

    .line 131
    .line 132
    .line 133
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_2
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsColorSet:Z

    .line 140
    .line 141
    if-eqz v5, :cond_3

    .line 142
    .line 143
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 144
    .line 145
    new-instance v10, Lcom/facebook/react/views/text/ReactForegroundColorSpan;

    .line 146
    .line 147
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mColor:I

    .line 148
    .line 149
    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/ReactForegroundColorSpan;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_3
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsBackgroundColorSet:Z

    .line 159
    .line 160
    if-eqz v5, :cond_4

    .line 161
    .line 162
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 163
    .line 164
    new-instance v10, Lcom/facebook/react/views/text/ReactBackgroundColorSpan;

    .line 165
    .line 166
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mBackgroundColor:I

    .line 167
    .line 168
    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/ReactBackgroundColorSpan;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_4
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_5

    .line 186
    .line 187
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 188
    .line 189
    new-instance v10, Lcom/facebook/react/views/text/CustomLetterSpacingSpan;

    .line 190
    .line 191
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getLetterSpacing()F

    .line 192
    .line 193
    .line 194
    move-result v13

    .line 195
    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/CustomLetterSpacingSpan;-><init>(F)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    :cond_5
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 205
    .line 206
    new-instance v10, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;

    .line 207
    .line 208
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontSize:I

    .line 209
    .line 210
    invoke-direct {v10, v13}, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    .line 220
    .line 221
    if-ne v5, v12, :cond_6

    .line 222
    .line 223
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    .line 224
    .line 225
    if-ne v5, v12, :cond_6

    .line 226
    .line 227
    iget-object v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v5, :cond_7

    .line 230
    .line 231
    :cond_6
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 232
    .line 233
    new-instance v10, Lcom/facebook/react/views/text/CustomStyleSpan;

    .line 234
    .line 235
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontStyle:I

    .line 236
    .line 237
    iget v14, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontWeight:I

    .line 238
    .line 239
    iget-object v15, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFeatureSettings:Ljava/lang/String;

    .line 240
    .line 241
    iget-object v12, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mFontFamily:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 244
    .line 245
    .line 246
    move-result-object v17

    .line 247
    move-object/from16 v16, v12

    .line 248
    .line 249
    move-object v12, v10

    .line 250
    invoke-direct/range {v12 .. v17}, Lcom/facebook/react/views/text/CustomStyleSpan;-><init>(IILjava/lang/String;Ljava/lang/String;Landroid/content/res/AssetManager;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    :cond_7
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsUnderlineTextDecorationSet:Z

    .line 260
    .line 261
    if-eqz v5, :cond_8

    .line 262
    .line 263
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 264
    .line 265
    new-instance v10, Lcom/facebook/react/views/text/ReactUnderlineSpan;

    .line 266
    .line 267
    invoke-direct {v10}, Lcom/facebook/react/views/text/ReactUnderlineSpan;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    :cond_8
    iget-boolean v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mIsLineThroughTextDecorationSet:Z

    .line 277
    .line 278
    if-eqz v5, :cond_9

    .line 279
    .line 280
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 281
    .line 282
    new-instance v10, Lcom/facebook/react/views/text/ReactStrikethroughSpan;

    .line 283
    .line 284
    invoke-direct {v10}, Lcom/facebook/react/views/text/ReactStrikethroughSpan;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 288
    .line 289
    .line 290
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    :cond_9
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    .line 294
    .line 295
    const/4 v10, 0x0

    .line 296
    cmpl-float v5, v5, v10

    .line 297
    .line 298
    if-nez v5, :cond_a

    .line 299
    .line 300
    iget v5, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    .line 301
    .line 302
    cmpl-float v5, v5, v10

    .line 303
    .line 304
    if-eqz v5, :cond_b

    .line 305
    .line 306
    :cond_a
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 307
    .line 308
    new-instance v10, Lcom/facebook/react/views/text/ShadowStyleSpan;

    .line 309
    .line 310
    iget v12, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDx:F

    .line 311
    .line 312
    iget v13, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowOffsetDy:F

    .line 313
    .line 314
    iget v14, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowRadius:F

    .line 315
    .line 316
    iget v15, v7, Lcom/facebook/react/views/text/TextAttributeProps;->mTextShadowColor:I

    .line 317
    .line 318
    invoke-direct {v10, v12, v13, v14, v15}, Lcom/facebook/react/views/text/ShadowStyleSpan;-><init>(FFFI)V

    .line 319
    .line 320
    .line 321
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 322
    .line 323
    .line 324
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    :cond_b
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    if-nez v5, :cond_c

    .line 336
    .line 337
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 338
    .line 339
    new-instance v10, Lcom/facebook/react/views/text/CustomLineHeightSpan;

    .line 340
    .line 341
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributeProps;->getEffectiveLineHeight()F

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    invoke-direct {v10, v7}, Lcom/facebook/react/views/text/CustomLineHeightSpan;-><init>(F)V

    .line 346
    .line 347
    .line 348
    invoke-direct {v5, v6, v8, v10}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    :cond_c
    new-instance v5, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 355
    .line 356
    new-instance v7, Lcom/facebook/react/views/text/ReactTagSpan;

    .line 357
    .line 358
    invoke-direct {v7, v11}, Lcom/facebook/react/views/text/ReactTagSpan;-><init>(I)V

    .line 359
    .line 360
    .line 361
    invoke-direct {v5, v6, v8, v7}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;-><init>(IILcom/facebook/react/views/text/ReactSpan;)V

    .line 362
    .line 363
    .line 364
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    :cond_d
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 368
    .line 369
    goto/16 :goto_0

    .line 370
    .line 371
    :cond_e
    return-void
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
    sget-object v11, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTextPaintInstance:Landroid/text/TextPaint;

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
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->TAG:Ljava/lang/String;

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

.method private static createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
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
    const/4 v2, 0x2

    .line 12
    invoke-interface {p1, v2}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0, p1, v0, v1}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->buildSpannableFromFragment(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Landroid/text/SpannableStringBuilder;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 p1, 0x0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;

    .line 35
    .line 36
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer$SetSpanOperation;->execute(Landroid/text/Spannable;I)V

    .line 37
    .line 38
    .line 39
    add-int/lit8 p1, p1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    if-eqz p2, :cond_1

    .line 43
    .line 44
    invoke-interface {p2, v0}, Lcom/facebook/react/views/text/ReactTextViewManagerCallback;->onPostProcessSpannable(Landroid/text/Spannable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-object v0
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

.method public static deleteCachedSpannableForTag(I)V
    .locals 1

    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lj$/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;
    .locals 3

    .line 1
    sget-boolean v0, Lcom/facebook/react/config/ReactFeatureFlags;->enableSpannableCache:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sSpannableCacheLock:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sSpannableCache:Landroid/util/LruCache;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroid/text/Spannable;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    monitor-exit v0

    .line 19
    return-object v2

    .line 20
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    monitor-enter v0

    .line 26
    :try_start_1
    invoke-virtual {v1, p1, p0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    monitor-exit v0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p0

    .line 34
    :catchall_1
    move-exception p0

    .line 35
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 36
    throw p0

    .line 37
    :cond_1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->createSpannableFromAttributedString(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :goto_0
    return-object p0
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

.method public static isRTL(Lcom/facebook/react/common/mapbuffer/MapBuffer;)Z
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getCount()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-interface {p0, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 v0, 0x5

    .line 19
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getMapBuffer(I)Lcom/facebook/react/common/mapbuffer/MapBuffer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/16 v0, 0x15

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Lcom/facebook/react/views/text/TextAttributeProps;->getLayoutDirection(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const/4 v0, 0x1

    .line 34
    if-ne p0, v0, :cond_1

    .line 35
    .line 36
    move v1, v0

    .line 37
    :cond_1
    return v1
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

.method public static measureLines(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;F)Lcom/facebook/react/bridge/WritableArray;
    .locals 9

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, p1, v1}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

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
    const/4 v1, 0x2

    .line 13
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v1, 0x1

    .line 34
    :goto_0
    move v6, v1

    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-interface {p2, v1}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    sget-object v5, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 45
    .line 46
    move-object v2, p1

    .line 47
    move v4, p3

    .line 48
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZII)Landroid/text/Layout;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-static {p1, p2, v0, p0}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
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

.method public static measureText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/common/mapbuffer/MapBuffer;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;[F)J
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
    sget-object v2, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTextPaintInstance:Landroid/text/TextPaint;

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    invoke-interface {v0, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    invoke-interface {v0, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v3, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3, v4}, Lj$/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v3, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/text/Spannable;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    return-wide v0

    .line 48
    :cond_1
    move-object/from16 v3, p0

    .line 49
    .line 50
    move-object/from16 v4, p7

    .line 51
    .line 52
    invoke-static {v3, v0, v4}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->getOrCreateSpannableForText(Landroid/content/Context;Lcom/facebook/react/common/mapbuffer/MapBuffer;Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)Landroid/text/Spannable;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    :goto_0
    const/4 v3, 0x2

    .line 57
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const/4 v3, 0x4

    .line 66
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/4 v11, 0x1

    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getBoolean(I)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    move v6, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_2
    move v6, v11

    .line 80
    :goto_1
    const/4 v3, 0x5

    .line 81
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getString(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v3}, Lcom/facebook/react/views/text/TextAttributeProps;->getTextBreakStrategy(Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-eqz v0, :cond_1a

    .line 90
    .line 91
    invoke-static {v0, v2}, Landroid/text/BoringLayout;->isBoring(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Landroid/text/BoringLayout$Metrics;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    if-nez v3, :cond_3

    .line 96
    .line 97
    invoke-static {v0, v2}, Landroid/text/Layout;->getDesiredWidth(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F

    .line 98
    .line 99
    .line 100
    :cond_3
    sget-object v2, Lcom/facebook/yoga/YogaMeasureMode;->l:Lcom/facebook/yoga/YogaMeasureMode;

    .line 101
    .line 102
    const/4 v12, 0x0

    .line 103
    if-eq v9, v2, :cond_4

    .line 104
    .line 105
    cmpg-float v2, p3, v12

    .line 106
    .line 107
    :cond_4
    move-object v2, v0

    .line 108
    move/from16 v4, p3

    .line 109
    .line 110
    move-object/from16 v5, p4

    .line 111
    .line 112
    invoke-static/range {v2 .. v8}, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->createLayout(Landroid/text/Spannable;Landroid/text/BoringLayout$Metrics;FLcom/facebook/yoga/YogaMeasureMode;ZII)Landroid/text/Layout;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/4 v3, 0x0

    .line 117
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->contains(I)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    const/4 v5, -0x1

    .line 122
    if-eqz v4, :cond_5

    .line 123
    .line 124
    invoke-interface {v1, v3}, Lcom/facebook/react/common/mapbuffer/MapBuffer;->getInt(I)I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    goto :goto_2

    .line 129
    :cond_5
    move v1, v5

    .line 130
    :goto_2
    if-eq v1, v5, :cond_7

    .line 131
    .line 132
    if-nez v1, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    :goto_3
    invoke-virtual {v2}, Landroid/text/Layout;->getLineCount()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    :goto_4
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 149
    .line 150
    if-ne v9, v4, :cond_8

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_8
    move v4, v3

    .line 154
    :goto_5
    if-ge v4, v1, :cond_a

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroid/text/Layout;->getLineWidth(I)F

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    cmpl-float v7, v6, v12

    .line 161
    .line 162
    if-lez v7, :cond_9

    .line 163
    .line 164
    move v12, v6

    .line 165
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_a
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 169
    .line 170
    if-ne v9, v4, :cond_b

    .line 171
    .line 172
    cmpl-float v4, v12, p3

    .line 173
    .line 174
    if-lez v4, :cond_b

    .line 175
    .line 176
    :goto_6
    move/from16 v12, p3

    .line 177
    .line 178
    :cond_b
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 179
    .line 180
    if-eq v10, v4, :cond_c

    .line 181
    .line 182
    sub-int/2addr v1, v11

    .line 183
    invoke-virtual {v2, v1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    int-to-float v1, v1

    .line 188
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 189
    .line 190
    if-ne v10, v4, :cond_d

    .line 191
    .line 192
    cmpl-float v4, v1, p5

    .line 193
    .line 194
    if-lez v4, :cond_d

    .line 195
    .line 196
    :cond_c
    move/from16 v1, p5

    .line 197
    .line 198
    :cond_d
    move v4, v3

    .line 199
    move v6, v4

    .line 200
    :goto_7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-ge v4, v7, :cond_19

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    const-class v8, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 211
    .line 212
    invoke-interface {v0, v4, v7, v8}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 213
    .line 214
    .line 215
    move-result v7

    .line 216
    invoke-interface {v0, v4, v7, v8}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    check-cast v4, [Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;

    .line 221
    .line 222
    array-length v8, v4

    .line 223
    move v9, v3

    .line 224
    :goto_8
    if-ge v9, v8, :cond_18

    .line 225
    .line 226
    aget-object v10, v4, v9

    .line 227
    .line 228
    invoke-interface {v0, v10}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    if-lez v15, :cond_e

    .line 241
    .line 242
    move v15, v11

    .line 243
    goto :goto_9

    .line 244
    :cond_e
    move v15, v3

    .line 245
    :goto_9
    if-eqz v15, :cond_10

    .line 246
    .line 247
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineStart(I)I

    .line 248
    .line 249
    .line 250
    move-result v15

    .line 251
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getEllipsisStart(I)I

    .line 252
    .line 253
    .line 254
    move-result v16

    .line 255
    add-int v15, v15, v16

    .line 256
    .line 257
    if-lt v13, v15, :cond_10

    .line 258
    .line 259
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineEnd(I)I

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-lt v13, v15, :cond_f

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_f
    move v5, v11

    .line 267
    goto/16 :goto_f

    .line 268
    .line 269
    :cond_10
    :goto_a
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;->getWidth()I

    .line 270
    .line 271
    .line 272
    move-result v15

    .line 273
    int-to-float v15, v15

    .line 274
    invoke-virtual {v10}, Lcom/facebook/react/views/text/TextInlineViewPlaceholderSpan;->getHeight()I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    int-to-float v10, v10

    .line 279
    invoke-virtual {v2, v13}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    if-ne v11, v5, :cond_11

    .line 288
    .line 289
    const/4 v11, 0x1

    .line 290
    goto :goto_b

    .line 291
    :cond_11
    const/4 v11, 0x0

    .line 292
    :goto_b
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 293
    .line 294
    .line 295
    move-result v16

    .line 296
    const/16 v17, 0x1

    .line 297
    .line 298
    add-int/lit8 v5, v16, -0x1

    .line 299
    .line 300
    if-ne v13, v5, :cond_13

    .line 301
    .line 302
    if-eqz v11, :cond_12

    .line 303
    .line 304
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineWidth(I)F

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    sub-float v3, v12, v3

    .line 309
    .line 310
    goto :goto_e

    .line 311
    :cond_12
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineRight(I)F

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    sub-float/2addr v3, v15

    .line 316
    goto :goto_e

    .line 317
    :cond_13
    if-ne v11, v3, :cond_14

    .line 318
    .line 319
    const/16 v17, 0x1

    .line 320
    .line 321
    goto :goto_c

    .line 322
    :cond_14
    const/16 v17, 0x0

    .line 323
    .line 324
    :goto_c
    if-eqz v17, :cond_15

    .line 325
    .line 326
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    goto :goto_d

    .line 331
    :cond_15
    invoke-virtual {v2, v13}, Landroid/text/Layout;->getSecondaryHorizontal(I)F

    .line 332
    .line 333
    .line 334
    move-result v5

    .line 335
    :goto_d
    if-eqz v11, :cond_16

    .line 336
    .line 337
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineRight(I)F

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    sub-float/2addr v11, v5

    .line 342
    sub-float v5, v12, v11

    .line 343
    .line 344
    :cond_16
    if-eqz v3, :cond_17

    .line 345
    .line 346
    sub-float v3, v5, v15

    .line 347
    .line 348
    goto :goto_e

    .line 349
    :cond_17
    move v3, v5

    .line 350
    :goto_e
    invoke-virtual {v2, v14}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    int-to-float v5, v5

    .line 355
    sub-float/2addr v5, v10

    .line 356
    mul-int/lit8 v10, v6, 0x2

    .line 357
    .line 358
    invoke-static {v5}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    aput v5, p8, v10

    .line 363
    .line 364
    const/4 v5, 0x1

    .line 365
    add-int/2addr v10, v5

    .line 366
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    aput v3, p8, v10

    .line 371
    .line 372
    add-int/lit8 v6, v6, 0x1

    .line 373
    .line 374
    :goto_f
    add-int/lit8 v9, v9, 0x1

    .line 375
    .line 376
    move v11, v5

    .line 377
    const/4 v3, 0x0

    .line 378
    const/4 v5, -0x1

    .line 379
    goto/16 :goto_8

    .line 380
    .line 381
    :cond_18
    move v4, v7

    .line 382
    goto/16 :goto_7

    .line 383
    .line 384
    :cond_19
    invoke-static {v12}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    invoke-static {v0, v1}, Lcom/facebook/yoga/f;->a(FF)J

    .line 393
    .line 394
    .line 395
    move-result-wide v0

    .line 396
    return-wide v0

    .line 397
    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 398
    .line 399
    const-string v1, "Spannable element has not been prepared in onBeforeLayout"

    .line 400
    .line 401
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    throw v0
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

    sget-object v0, Lcom/facebook/react/views/text/TextLayoutManagerMapBuffer;->sTagToSpannableCache:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
