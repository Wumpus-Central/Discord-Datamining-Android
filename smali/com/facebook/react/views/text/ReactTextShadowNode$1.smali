.class Lcom/facebook/react/views/text/ReactTextShadowNode$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/yoga/YogaMeasureFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/text/ReactTextShadowNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;


# direct methods
.method constructor <init>(Lcom/facebook/react/views/text/ReactTextShadowNode;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public measure(Lcom/facebook/yoga/YogaNode;FLcom/facebook/yoga/YogaMeasureMode;FLcom/facebook/yoga/YogaMeasureMode;)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    iget-object v4, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 10
    .line 11
    invoke-static {v4}, Lcom/facebook/react/views/text/ReactTextShadowNode;->access$000(Lcom/facebook/react/views/text/ReactTextShadowNode;)Landroid/text/Spannable;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const-string v5, "Spannable element has not been prepared in onBeforeLayout"

    .line 16
    .line 17
    invoke-static {v4, v5}, Lc6/a;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Landroid/text/Spannable;

    .line 22
    .line 23
    iget-object v5, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 24
    .line 25
    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/ReactTextShadowNode;->access$100(Lcom/facebook/react/views/text/ReactTextShadowNode;Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 30
    .line 31
    iget-boolean v7, v6, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mAdjustsFontSizeToFit:Z

    .line 32
    .line 33
    const/4 v8, -0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    if-eqz v7, :cond_3

    .line 36
    .line 37
    iget-object v6, v6, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mTextAttributes:Lcom/facebook/react/views/text/TextAttributes;

    .line 38
    .line 39
    invoke-virtual {v6}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    iget-object v7, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 44
    .line 45
    iget-object v7, v7, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mTextAttributes:Lcom/facebook/react/views/text/TextAttributes;

    .line 46
    .line 47
    invoke-virtual {v7}, Lcom/facebook/react/views/text/TextAttributes;->getEffectiveFontSize()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    iget-object v10, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 52
    .line 53
    iget v10, v10, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mMinimumFontScale:F

    .line 54
    .line 55
    int-to-float v6, v6

    .line 56
    mul-float/2addr v10, v6

    .line 57
    const/high16 v11, 0x40800000    # 4.0f

    .line 58
    .line 59
    invoke-static {v11}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 60
    .line 61
    .line 62
    move-result v11

    .line 63
    invoke-static {v10, v11}, Ljava/lang/Math;->max(FF)F

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    float-to-int v10, v10

    .line 68
    :goto_0
    if-le v7, v10, :cond_3

    .line 69
    .line 70
    iget-object v11, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 71
    .line 72
    iget v11, v11, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 73
    .line 74
    if-eq v11, v8, :cond_0

    .line 75
    .line 76
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    iget-object v12, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 81
    .line 82
    iget v12, v12, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 83
    .line 84
    if-gt v11, v12, :cond_1

    .line 85
    .line 86
    :cond_0
    sget-object v11, Lcom/facebook/yoga/YogaMeasureMode;->l:Lcom/facebook/yoga/YogaMeasureMode;

    .line 87
    .line 88
    if-eq v3, v11, :cond_3

    .line 89
    .line 90
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    int-to-float v11, v11

    .line 95
    cmpl-float v11, v11, p4

    .line 96
    .line 97
    if-lez v11, :cond_3

    .line 98
    .line 99
    :cond_1
    const/high16 v5, 0x3f800000    # 1.0f

    .line 100
    .line 101
    invoke-static {v5}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    float-to-int v5, v5

    .line 106
    sub-int/2addr v7, v5

    .line 107
    int-to-float v5, v7

    .line 108
    div-float/2addr v5, v6

    .line 109
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 110
    .line 111
    .line 112
    move-result v11

    .line 113
    const-class v12, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;

    .line 114
    .line 115
    invoke-interface {v4, v9, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    check-cast v11, [Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;

    .line 120
    .line 121
    array-length v12, v11

    .line 122
    move v13, v9

    .line 123
    :goto_1
    if-ge v13, v12, :cond_2

    .line 124
    .line 125
    aget-object v14, v11, v13

    .line 126
    .line 127
    new-instance v15, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;

    .line 128
    .line 129
    invoke-virtual {v14}, Landroid/text/style/AbsoluteSizeSpan;->getSize()I

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    int-to-float v9, v9

    .line 134
    mul-float/2addr v9, v5

    .line 135
    int-to-float v8, v10

    .line 136
    invoke-static {v9, v8}, Ljava/lang/Math;->max(FF)F

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    float-to-int v8, v8

    .line 141
    invoke-direct {v15, v8}, Lcom/facebook/react/views/text/ReactAbsoluteSizeSpan;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v4, v14}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    invoke-interface {v4, v14}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    move/from16 v16, v5

    .line 153
    .line 154
    invoke-interface {v4, v14}, Landroid/text/Spanned;->getSpanFlags(Ljava/lang/Object;)I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    invoke-interface {v4, v15, v8, v9, v5}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v4, v14}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    add-int/lit8 v13, v13, 0x1

    .line 165
    .line 166
    move/from16 v5, v16

    .line 167
    .line 168
    const/4 v8, -0x1

    .line 169
    const/4 v9, 0x0

    .line 170
    goto :goto_1

    .line 171
    :cond_2
    iget-object v5, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 172
    .line 173
    invoke-static {v5, v4, v1, v2}, Lcom/facebook/react/views/text/ReactTextShadowNode;->access$100(Lcom/facebook/react/views/text/ReactTextShadowNode;Landroid/text/Spannable;FLcom/facebook/yoga/YogaMeasureMode;)Landroid/text/Layout;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    const/4 v8, -0x1

    .line 178
    const/4 v9, 0x0

    .line 179
    goto :goto_0

    .line 180
    :cond_3
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 181
    .line 182
    invoke-static {v6}, Lcom/facebook/react/views/text/ReactTextShadowNode;->access$200(Lcom/facebook/react/views/text/ReactTextShadowNode;)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_5

    .line 187
    .line 188
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 189
    .line 190
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->getThemedContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-static {}, Lcom/facebook/react/views/text/ReactTextShadowNode;->access$300()Landroid/text/TextPaint;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    invoke-static {v4, v5, v7, v6}, Lcom/facebook/react/views/text/FontMetricsUtil;->getFontMetrics(Ljava/lang/CharSequence;Landroid/text/Layout;Landroid/text/TextPaint;Landroid/content/Context;)Lcom/facebook/react/bridge/WritableArray;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    const-string v8, "lines"

    .line 207
    .line 208
    invoke-interface {v7, v8, v4}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v6}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_4

    .line 216
    .line 217
    const-class v4, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 218
    .line 219
    invoke-virtual {v6, v4}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    check-cast v4, Lcom/facebook/react/uimanager/events/RCTEventEmitter;

    .line 224
    .line 225
    iget-object v6, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 226
    .line 227
    invoke-virtual {v6}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->getReactTag()I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    const-string v8, "topTextLayout"

    .line 232
    .line 233
    invoke-interface {v4, v6, v8, v7}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_4
    new-instance v4, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 238
    .line 239
    const-string v6, "Cannot get RCTEventEmitter, no CatalystInstance"

    .line 240
    .line 241
    invoke-direct {v4, v6}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    const-string v6, "ReactTextShadowNode"

    .line 245
    .line 246
    invoke-static {v6, v4}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    .line 248
    .line 249
    :cond_5
    :goto_2
    iget-object v4, v0, Lcom/facebook/react/views/text/ReactTextShadowNode$1;->this$0:Lcom/facebook/react/views/text/ReactTextShadowNode;

    .line 250
    .line 251
    iget v4, v4, Lcom/facebook/react/views/text/ReactBaseTextShadowNode;->mNumberOfLines:I

    .line 252
    .line 253
    const/4 v6, -0x1

    .line 254
    if-ne v4, v6, :cond_6

    .line 255
    .line 256
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    goto :goto_3

    .line 261
    :cond_6
    invoke-virtual {v5}, Landroid/text/Layout;->getLineCount()I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    :goto_3
    sget-object v6, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 270
    .line 271
    if-ne v2, v6, :cond_7

    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_7
    const/4 v6, 0x0

    .line 275
    const/4 v9, 0x0

    .line 276
    :goto_4
    if-ge v9, v4, :cond_9

    .line 277
    .line 278
    invoke-virtual {v5, v9}, Landroid/text/Layout;->getLineWidth(I)F

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    cmpl-float v8, v7, v6

    .line 283
    .line 284
    if-lez v8, :cond_8

    .line 285
    .line 286
    move v6, v7

    .line 287
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 288
    .line 289
    goto :goto_4

    .line 290
    :cond_9
    sget-object v7, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 291
    .line 292
    if-ne v2, v7, :cond_a

    .line 293
    .line 294
    cmpl-float v2, v6, v1

    .line 295
    .line 296
    if-lez v2, :cond_a

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_a
    move v1, v6

    .line 300
    :goto_5
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 301
    .line 302
    const/16 v6, 0x1d

    .line 303
    .line 304
    if-le v2, v6, :cond_b

    .line 305
    .line 306
    float-to-double v1, v1

    .line 307
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 308
    .line 309
    .line 310
    move-result-wide v1

    .line 311
    double-to-float v1, v1

    .line 312
    :cond_b
    sget-object v2, Lcom/facebook/yoga/YogaMeasureMode;->m:Lcom/facebook/yoga/YogaMeasureMode;

    .line 313
    .line 314
    if-eq v3, v2, :cond_c

    .line 315
    .line 316
    add-int/lit8 v4, v4, -0x1

    .line 317
    .line 318
    invoke-virtual {v5, v4}, Landroid/text/Layout;->getLineBottom(I)I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    int-to-float v2, v2

    .line 323
    sget-object v4, Lcom/facebook/yoga/YogaMeasureMode;->n:Lcom/facebook/yoga/YogaMeasureMode;

    .line 324
    .line 325
    if-ne v3, v4, :cond_d

    .line 326
    .line 327
    cmpl-float v3, v2, p4

    .line 328
    .line 329
    if-lez v3, :cond_d

    .line 330
    .line 331
    :cond_c
    move/from16 v2, p4

    .line 332
    .line 333
    :cond_d
    invoke-static {v1, v2}, Lcom/facebook/yoga/f;->a(FF)J

    .line 334
    .line 335
    .line 336
    move-result-wide v1

    .line 337
    return-wide v1
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
.end method
