.class final Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/discord/rlottie/RLottieDrawable;-><init>(Landroid/content/Context;ILjava/lang/String;IIFZ[I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "run"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/discord/rlottie/RLottieDrawable;


# direct methods
.method constructor <init>(Lcom/discord/rlottie/RLottieDrawable;)V
    .locals 0

    iput-object p1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$isRecycled$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 11
    .line 12
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    const-wide/16 v2, 0x0

    .line 17
    .line 18
    cmp-long v0, v0, v2

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 27
    .line 28
    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableNoFrame$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "RLottieDrawable"

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 47
    .line 48
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 53
    .line 54
    invoke-static {v3}, Lcom/discord/rlottie/RLottieDrawable;->access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 59
    .line 60
    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v0, v2}, Lcom/discord/rlottie/RLottieDrawable;->access$setBackgroundBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    const-string v2, "Error Loading Frame in Runnable"

    .line 70
    .line 71
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    if-eqz v0, :cond_f

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    :try_start_1
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 84
    .line 85
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    xor-int/2addr v2, v0

    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 97
    .line 98
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_3

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Ljava/util/Map$Entry;

    .line 121
    .line 122
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Ljava/lang/String;

    .line 127
    .line 128
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/lang/Number;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sget-object v5, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 139
    .line 140
    iget-object v6, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 141
    .line 142
    invoke-static {v6}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 143
    .line 144
    .line 145
    move-result-wide v6

    .line 146
    invoke-static {v5, v6, v7, v4, v3}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$setLayerColor(Lcom/discord/rlottie/RLottieDrawable$Companion;JLjava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_3
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 151
    .line 152
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingColorUpdates$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/util/HashMap;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 157
    .line 158
    .line 159
    :catch_0
    :cond_4
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 160
    .line 161
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;)[Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_5

    .line 166
    .line 167
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 168
    .line 169
    iget-object v4, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 170
    .line 171
    invoke-static {v4}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v4

    .line 175
    invoke-static {v2}, Lkotlin/collections/b;->n0([Ljava/lang/Integer;)[I

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v3, v4, v5, v2}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$replaceColors(Lcom/discord/rlottie/RLottieDrawable$Companion;J[I)V

    .line 180
    .line 181
    .line 182
    :cond_5
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 183
    .line 184
    const/4 v3, 0x0

    .line 185
    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setPendingReplaceColors$p(Lcom/discord/rlottie/RLottieDrawable;[Ljava/lang/Integer;)V

    .line 186
    .line 187
    .line 188
    :try_start_2
    sget-object v4, Lcom/discord/rlottie/RLottieDrawable;->Companion:Lcom/discord/rlottie/RLottieDrawable$Companion;

    .line 189
    .line 190
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 191
    .line 192
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getNativePtr$p(Lcom/discord/rlottie/RLottieDrawable;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v5

    .line 196
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 197
    .line 198
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 203
    .line 204
    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    if-nez v8, :cond_6

    .line 209
    .line 210
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 211
    .line 212
    .line 213
    :cond_6
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 214
    .line 215
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getWidth$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 216
    .line 217
    .line 218
    move-result v9

    .line 219
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 220
    .line 221
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getHeight$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 226
    .line 227
    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    if-nez v2, :cond_7

    .line 232
    .line 233
    invoke-static {}, Lkotlin/jvm/internal/q;->s()V

    .line 234
    .line 235
    .line 236
    :cond_7
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getRowBytes()I

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    const/4 v12, 0x1

    .line 241
    invoke-static/range {v4 .. v12}, Lcom/discord/rlottie/RLottieDrawable$Companion;->access$getFrame(Lcom/discord/rlottie/RLottieDrawable$Companion;JILandroid/graphics/Bitmap;IIIZ)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    const/4 v3, -0x1

    .line 246
    if-ne v2, v3, :cond_8

    .line 247
    .line 248
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 253
    .line 254
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableNoFrame$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 259
    .line 260
    .line 261
    return-void

    .line 262
    :cond_8
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 263
    .line 264
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    const/4 v3, 0x2

    .line 269
    aget v2, v2, v3

    .line 270
    .line 271
    const/4 v4, 0x0

    .line 272
    if-eqz v2, :cond_9

    .line 273
    .line 274
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    iget-object v5, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 279
    .line 280
    invoke-static {v5}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnableGenerateCache$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v2, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 285
    .line 286
    .line 287
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 288
    .line 289
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    aput v4, v2, v3

    .line 294
    .line 295
    :cond_9
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 296
    .line 297
    invoke-virtual {v2}, Lcom/discord/rlottie/RLottieDrawable;->getBackgroundBitmap()Landroid/graphics/Bitmap;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    invoke-static {v2, v5}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextRenderingBitmap$p(Lcom/discord/rlottie/RLottieDrawable;Landroid/graphics/Bitmap;)V

    .line 302
    .line 303
    .line 304
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 305
    .line 306
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getShouldLimitFps$p(Lcom/discord/rlottie/RLottieDrawable;)Z

    .line 307
    .line 308
    .line 309
    move-result v2

    .line 310
    if-eqz v2, :cond_a

    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_a
    move v3, v0

    .line 314
    :goto_2
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 315
    .line 316
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    add-int/2addr v2, v3

    .line 321
    iget-object v5, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 322
    .line 323
    invoke-static {v5}, Lcom/discord/rlottie/RLottieDrawable;->access$getMetaData$p(Lcom/discord/rlottie/RLottieDrawable;)[I

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    aget v5, v5, v4

    .line 328
    .line 329
    if-ge v2, v5, :cond_c

    .line 330
    .line 331
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 332
    .line 333
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    sget-object v5, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->FREEZE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 338
    .line 339
    if-ne v2, v5, :cond_b

    .line 340
    .line 341
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 342
    .line 343
    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 344
    .line 345
    .line 346
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 347
    .line 348
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    add-int/2addr v3, v0

    .line 353
    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 354
    .line 355
    .line 356
    goto :goto_3

    .line 357
    :cond_b
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 358
    .line 359
    invoke-static {v0}, Lcom/discord/rlottie/RLottieDrawable;->access$getCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    add-int/2addr v2, v3

    .line 364
    invoke-static {v0, v2}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 365
    .line 366
    .line 367
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 368
    .line 369
    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 370
    .line 371
    .line 372
    goto :goto_3

    .line 373
    :cond_c
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 374
    .line 375
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->LOOP:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 380
    .line 381
    if-ne v2, v3, :cond_d

    .line 382
    .line 383
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 384
    .line 385
    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 386
    .line 387
    .line 388
    iget-object v0, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 389
    .line 390
    invoke-static {v0, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 391
    .line 392
    .line 393
    goto :goto_3

    .line 394
    :cond_d
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 395
    .line 396
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getPlaybackMode$p(Lcom/discord/rlottie/RLottieDrawable;)Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    sget-object v3, Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;->ONCE:Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;

    .line 401
    .line 402
    if-ne v2, v3, :cond_e

    .line 403
    .line 404
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 405
    .line 406
    invoke-static {v2, v4}, Lcom/discord/rlottie/RLottieDrawable;->access$setCurrentFrame$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 407
    .line 408
    .line 409
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 410
    .line 411
    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V

    .line 412
    .line 413
    .line 414
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 415
    .line 416
    invoke-static {v2}, Lcom/discord/rlottie/RLottieDrawable;->access$getAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;)I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    add-int/2addr v3, v0

    .line 421
    invoke-static {v2, v3}, Lcom/discord/rlottie/RLottieDrawable;->access$setAutoRepeatPlayCount$p(Lcom/discord/rlottie/RLottieDrawable;I)V

    .line 422
    .line 423
    .line 424
    goto :goto_3

    .line 425
    :cond_e
    iget-object v2, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 426
    .line 427
    invoke-static {v2, v0}, Lcom/discord/rlottie/RLottieDrawable;->access$setNextFrameIsLast$p(Lcom/discord/rlottie/RLottieDrawable;Z)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 428
    .line 429
    .line 430
    goto :goto_3

    .line 431
    :catch_1
    move-exception v0

    .line 432
    const-string v2, "Error loading frame"

    .line 433
    .line 434
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 435
    .line 436
    .line 437
    :cond_f
    :goto_3
    invoke-static {}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiHandler$cp()Landroid/os/Handler;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    iget-object v1, p0, Lcom/discord/rlottie/RLottieDrawable$loadFrameRunnable$1;->this$0:Lcom/discord/rlottie/RLottieDrawable;

    .line 442
    .line 443
    invoke-static {v1}, Lcom/discord/rlottie/RLottieDrawable;->access$getUiRunnable$p(Lcom/discord/rlottie/RLottieDrawable;)Ljava/lang/Runnable;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 448
    .line 449
    .line 450
    return-void
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
.end method
