.class public final Lcom/mrousavy/camera/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/mrousavy/camera/CameraView;",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "pointMap",
        "",
        "a",
        "(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "react-native-vision-camera_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mrousavy/camera/CameraView;",
            "Lcom/facebook/react/bridge/ReadableMap;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/mrousavy/camera/n$a;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/mrousavy/camera/n$a;

    .line 11
    .line 12
    iget v3, v2, Lcom/mrousavy/camera/n$a;->m:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/mrousavy/camera/n$a;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/mrousavy/camera/n$a;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lcom/mrousavy/camera/n$a;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/mrousavy/camera/n$a;->l:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Ltf/b;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/mrousavy/camera/n$a;->m:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_2
    iget-object v0, v2, Lcom/mrousavy/camera/n$a;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Landroidx/camera/core/m;

    .line 61
    .line 62
    invoke-static {v1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    invoke-static {v1}, Lnf/t;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual/range {p0 .. p0}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_7

    .line 74
    .line 75
    invoke-interface {v1}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_7

    .line 80
    .line 81
    const-string v4, "x"

    .line 82
    .line 83
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_6

    .line 88
    .line 89
    const-string v7, "y"

    .line 90
    .line 91
    invoke-interface {v0, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_6

    .line 96
    .line 97
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 106
    .line 107
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    float-to-double v11, v8

    .line 112
    mul-double v15, v9, v11

    .line 113
    .line 114
    invoke-interface {v0, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    mul-double v17, v7, v11

    .line 119
    .line 120
    invoke-virtual/range {p0 .. p0}, Lcom/mrousavy/camera/CameraView;->getCoroutineScope$react_native_vision_camera_release()Lkotlinx/coroutines/CoroutineScope;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    new-instance v4, Lcom/mrousavy/camera/n$b;

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    move-object v13, v4

    .line 133
    move-object/from16 v14, p0

    .line 134
    .line 135
    invoke-direct/range {v13 .. v19}, Lcom/mrousavy/camera/n$b;-><init>(Lcom/mrousavy/camera/CameraView;DDLkotlin/coroutines/Continuation;)V

    .line 136
    .line 137
    .line 138
    iput-object v1, v2, Lcom/mrousavy/camera/n$a;->k:Ljava/lang/Object;

    .line 139
    .line 140
    iput v6, v2, Lcom/mrousavy/camera/n$a;->m:I

    .line 141
    .line 142
    invoke-static {v0, v4, v2}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    if-ne v0, v3, :cond_4

    .line 147
    .line 148
    return-object v3

    .line 149
    :cond_4
    move-object/from16 v20, v1

    .line 150
    .line 151
    move-object v1, v0

    .line 152
    move-object/from16 v0, v20

    .line 153
    .line 154
    :goto_1
    const-string v4, "CameraView.focus(pointMa\u2026loat(), y.toFloat());\n  }"

    .line 155
    .line 156
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    check-cast v1, Landroidx/camera/core/v1;

    .line 160
    .line 161
    new-instance v4, Landroidx/camera/core/g0$a;

    .line 162
    .line 163
    const/4 v6, 0x3

    .line 164
    invoke-direct {v4, v1, v6}, Landroidx/camera/core/g0$a;-><init>(Landroidx/camera/core/v1;I)V

    .line 165
    .line 166
    .line 167
    const-wide/16 v6, 0x5

    .line 168
    .line 169
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 170
    .line 171
    invoke-virtual {v4, v6, v7, v1}, Landroidx/camera/core/g0$a;->c(JLjava/util/concurrent/TimeUnit;)Landroidx/camera/core/g0$a;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, Landroidx/camera/core/g0$a;->b()Landroidx/camera/core/g0;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v4, "Builder(point, FocusMete\u2026er 5 seconds\n    .build()"

    .line 180
    .line 181
    invoke-static {v1, v4}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0, v1}, Landroidx/camera/core/m;->h(Landroidx/camera/core/g0;)Lgc/b;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    const-string v1, "cameraControl.startFocusAndMetering(action)"

    .line 189
    .line 190
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const/4 v1, 0x0

    .line 194
    iput-object v1, v2, Lcom/mrousavy/camera/n$a;->k:Ljava/lang/Object;

    .line 195
    .line 196
    iput v5, v2, Lcom/mrousavy/camera/n$a;->m:I

    .line 197
    .line 198
    invoke-static {v0, v2}, Lwi/a;->b(Lgc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-ne v0, v3, :cond_5

    .line 203
    .line 204
    return-object v3

    .line 205
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object v0

    .line 208
    :cond_6
    new-instance v1, Lcom/mrousavy/camera/z;

    .line 209
    .line 210
    const-string v2, "point"

    .line 211
    .line 212
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-direct {v1, v2, v0}, Lcom/mrousavy/camera/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_7
    new-instance v0, Lcom/mrousavy/camera/c;

    .line 221
    .line 222
    invoke-direct {v0}, Lcom/mrousavy/camera/c;-><init>()V

    .line 223
    .line 224
    .line 225
    throw v0
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
.end method
