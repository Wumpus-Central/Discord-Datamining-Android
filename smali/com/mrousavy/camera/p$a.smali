.class final Lcom/mrousavy/camera/p$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/p;->a(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/facebook/react/bridge/WritableMap;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lcom/facebook/react/bridge/WritableMap;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/e;
    c = "com.mrousavy.camera.CameraView_TakePhotoKt$takePhoto$2"
    f = "CameraView+TakePhoto.kt"
    l = {
        0x16,
        0x44,
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:J

.field n:I

.field o:I

.field private synthetic p:Ljava/lang/Object;

.field final synthetic q:Lcom/mrousavy/camera/CameraView;

.field final synthetic r:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method constructor <init>(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mrousavy/camera/CameraView;",
            "Lcom/facebook/react/bridge/ReadableMap;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/p$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    iput-object p2, p0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/mrousavy/camera/p$a;

    iget-object v1, p0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    iget-object v2, p0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    invoke-direct {v0, v1, v2, p2}, Lcom/mrousavy/camera/p$a;-><init>(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/p$a;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/facebook/react/bridge/WritableMap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/p$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/p$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/p$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/mrousavy/camera/p$a;->o:I

    .line 8
    .line 9
    const/4 v3, 0x3

    .line 10
    const/4 v4, 0x0

    .line 11
    const-string v5, "CameraView"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    if-eqz v2, :cond_3

    .line 17
    .line 18
    if-eq v2, v8, :cond_2

    .line 19
    .line 20
    if-eq v2, v7, :cond_1

    .line 21
    .line 22
    if-ne v2, v3, :cond_0

    .line 23
    .line 24
    iget-wide v1, v0, Lcom/mrousavy/camera/p$a;->m:J

    .line 25
    .line 26
    iget-object v3, v0, Lcom/mrousavy/camera/p$a;->l:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 29
    .line 30
    iget-object v6, v0, Lcom/mrousavy/camera/p$a;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Ljava/io/File;

    .line 33
    .line 34
    iget-object v7, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Landroidx/camera/core/ImageProxy;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1

    .line 51
    :cond_1
    iget v2, v0, Lcom/mrousavy/camera/p$a;->n:I

    .line 52
    .line 53
    iget-wide v9, v0, Lcom/mrousavy/camera/p$a;->m:J

    .line 54
    .line 55
    iget-object v7, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object/from16 v21, v7

    .line 63
    .line 64
    move-object/from16 v7, p1

    .line 65
    .line 66
    move-wide/from16 v24, v9

    .line 67
    .line 68
    move v10, v2

    .line 69
    move-wide/from16 v2, v24

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_2
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object/from16 v2, p1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v2, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .line 85
    .line 86
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 87
    .line 88
    invoke-virtual {v9}, Lcom/mrousavy/camera/CameraView;->getFallbackToSnapshot$react_native_vision_camera_release()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_5

    .line 93
    .line 94
    const-string v2, "takePhoto() called, but falling back to Snapshot because 1 use-case is already occupied."

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    .line 98
    .line 99
    iget-object v2, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 100
    .line 101
    iget-object v3, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 102
    .line 103
    iput v8, v0, Lcom/mrousavy/camera/p$a;->o:I

    .line 104
    .line 105
    invoke-static {v2, v3, v0}, Lcom/mrousavy/camera/q;->a(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    if-ne v2, v1, :cond_4

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_4
    :goto_0
    return-object v2

    .line 113
    :cond_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v14

    .line 117
    const-string v9, "takePhoto() called"

    .line 118
    .line 119
    invoke-static {v5, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 123
    .line 124
    invoke-virtual {v9}, Lcom/mrousavy/camera/CameraView;->getImageCapture$react_native_vision_camera_release()Landroidx/camera/core/g1;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    if-nez v9, :cond_7

    .line 129
    .line 130
    iget-object v1, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/mrousavy/camera/CameraView;->getPhoto()Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    new-instance v1, Lcom/mrousavy/camera/c;

    .line 147
    .line 148
    invoke-direct {v1}, Lcom/mrousavy/camera/c;-><init>()V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_6
    new-instance v1, Lcom/mrousavy/camera/h0;

    .line 153
    .line 154
    invoke-direct {v1}, Lcom/mrousavy/camera/h0;-><init>()V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_7
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 159
    .line 160
    const-string v10, "flash"

    .line 161
    .line 162
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_f

    .line 167
    .line 168
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 169
    .line 170
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    iget-object v11, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 175
    .line 176
    invoke-virtual {v11}, Lcom/mrousavy/camera/CameraView;->getImageCapture$react_native_vision_camera_release()Landroidx/camera/core/g1;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    invoke-static {v11}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    if-eqz v9, :cond_d

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    const/16 v13, 0xddf

    .line 190
    .line 191
    if-eq v12, v13, :cond_c

    .line 192
    .line 193
    const v13, 0x1ad6f

    .line 194
    .line 195
    .line 196
    if-eq v12, v13, :cond_a

    .line 197
    .line 198
    const v13, 0x2dddaf

    .line 199
    .line 200
    .line 201
    if-eq v12, v13, :cond_8

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_8
    const-string v12, "auto"

    .line 205
    .line 206
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-nez v12, :cond_9

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_9
    move v9, v6

    .line 214
    goto :goto_1

    .line 215
    :cond_a
    const-string v12, "off"

    .line 216
    .line 217
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    if-nez v12, :cond_b

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_b
    move v9, v7

    .line 225
    goto :goto_1

    .line 226
    :cond_c
    const-string v12, "on"

    .line 227
    .line 228
    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    if-eqz v12, :cond_d

    .line 233
    .line 234
    move v9, v8

    .line 235
    :goto_1
    invoke-virtual {v11, v9}, Landroidx/camera/core/g1;->u0(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_d
    :goto_2
    new-instance v1, Lcom/mrousavy/camera/z;

    .line 240
    .line 241
    if-nez v9, :cond_e

    .line 242
    .line 243
    const-string v9, "(null)"

    .line 244
    .line 245
    :cond_e
    invoke-direct {v1, v10, v9}, Lcom/mrousavy/camera/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v1

    .line 249
    :cond_f
    :goto_3
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 250
    .line 251
    const-string v10, "photoCodec"

    .line 252
    .line 253
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 254
    .line 255
    .line 256
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 257
    .line 258
    const-string v10, "qualityPrioritization"

    .line 259
    .line 260
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 264
    .line 265
    const-string v10, "enableAutoRedEyeReduction"

    .line 266
    .line 267
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 271
    .line 272
    const-string v10, "enableDualCameraFusion"

    .line 273
    .line 274
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 275
    .line 276
    .line 277
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 278
    .line 279
    const-string v10, "enableAutoStabilization"

    .line 280
    .line 281
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 282
    .line 283
    .line 284
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 285
    .line 286
    const-string v10, "enableAutoDistortionCorrection"

    .line 287
    .line 288
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 289
    .line 290
    .line 291
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 292
    .line 293
    const-string v10, "skipMetadata"

    .line 294
    .line 295
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_10

    .line 300
    .line 301
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 302
    .line 303
    invoke-interface {v9, v10}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    move v13, v9

    .line 308
    goto :goto_4

    .line 309
    :cond_10
    move v13, v6

    .line 310
    :goto_4
    iget-object v9, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 311
    .line 312
    invoke-virtual {v9}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v9}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v9}, Landroidx/camera/core/k;->a()Landroidx/camera/core/r;

    .line 320
    .line 321
    .line 322
    move-result-object v9

    .line 323
    invoke-static {v9}, Lv/h;->b(Landroidx/camera/core/r;)Lv/h;

    .line 324
    .line 325
    .line 326
    move-result-object v9

    .line 327
    const-string v10, "from(camera!!.cameraInfo)"

    .line 328
    .line 329
    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 333
    .line 334
    invoke-virtual {v9, v10}, Lv/h;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v9

    .line 338
    move-object v12, v9

    .line 339
    check-cast v12, Ljava/lang/Integer;

    .line 340
    .line 341
    new-array v11, v7, [Lkotlinx/coroutines/q0;

    .line 342
    .line 343
    invoke-interface {v2}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    const/16 v16, 0x0

    .line 348
    .line 349
    new-instance v9, Lcom/mrousavy/camera/p$a$b;

    .line 350
    .line 351
    iget-object v3, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 352
    .line 353
    invoke-direct {v9, v3, v4}, Lcom/mrousavy/camera/p$a$b;-><init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    .line 354
    .line 355
    .line 356
    const/4 v3, 0x2

    .line 357
    const/16 v17, 0x0

    .line 358
    .line 359
    move-object/from16 v18, v9

    .line 360
    .line 361
    move-object v9, v2

    .line 362
    move-object v7, v11

    .line 363
    move-object/from16 v11, v16

    .line 364
    .line 365
    move-object/from16 v20, v12

    .line 366
    .line 367
    move-object/from16 v12, v18

    .line 368
    .line 369
    move/from16 v21, v13

    .line 370
    .line 371
    move v13, v3

    .line 372
    move-wide/from16 v22, v14

    .line 373
    .line 374
    move-object/from16 v14, v17

    .line 375
    .line 376
    invoke-static/range {v9 .. v14}, Lkotlinx/coroutines/j;->b(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/q0;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    aput-object v3, v7, v6

    .line 381
    .line 382
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    const/4 v11, 0x0

    .line 387
    new-instance v12, Lcom/mrousavy/camera/p$a$c;

    .line 388
    .line 389
    iget-object v3, v0, Lcom/mrousavy/camera/p$a;->q:Lcom/mrousavy/camera/CameraView;

    .line 390
    .line 391
    invoke-direct {v12, v3, v4}, Lcom/mrousavy/camera/p$a$c;-><init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    .line 392
    .line 393
    .line 394
    const/4 v13, 0x2

    .line 395
    const/4 v14, 0x0

    .line 396
    invoke-static/range {v9 .. v14}, Lkotlinx/coroutines/j;->b(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/l0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/q0;

    .line 397
    .line 398
    .line 399
    move-result-object v2

    .line 400
    aput-object v2, v7, v8

    .line 401
    .line 402
    move-object/from16 v9, v20

    .line 403
    .line 404
    iput-object v9, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    .line 405
    .line 406
    move-wide/from16 v2, v22

    .line 407
    .line 408
    iput-wide v2, v0, Lcom/mrousavy/camera/p$a;->m:J

    .line 409
    .line 410
    move/from16 v10, v21

    .line 411
    .line 412
    iput v10, v0, Lcom/mrousavy/camera/p$a;->n:I

    .line 413
    .line 414
    const/4 v11, 0x2

    .line 415
    iput v11, v0, Lcom/mrousavy/camera/p$a;->o:I

    .line 416
    .line 417
    invoke-static {v7, v0}, Lkotlinx/coroutines/f;->a([Lkotlinx/coroutines/q0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    if-ne v7, v1, :cond_11

    .line 422
    .line 423
    return-object v1

    .line 424
    :cond_11
    move-object/from16 v21, v9

    .line 425
    .line 426
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 427
    .line 428
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 429
    .line 430
    .line 431
    move-result-object v9

    .line 432
    :cond_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 433
    .line 434
    .line 435
    move-result v11

    .line 436
    const-string v12, "Collection contains no element matching the predicate."

    .line 437
    .line 438
    if-eqz v11, :cond_18

    .line 439
    .line 440
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    instance-of v13, v11, Landroidx/camera/core/ImageProxy;

    .line 445
    .line 446
    if-eqz v13, :cond_12

    .line 447
    .line 448
    const-string v9, "null cannot be cast to non-null type androidx.camera.core.ImageProxy"

    .line 449
    .line 450
    invoke-static {v11, v9}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    move-object v9, v11

    .line 454
    check-cast v9, Landroidx/camera/core/ImageProxy;

    .line 455
    .line 456
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v7

    .line 460
    :cond_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    if-eqz v11, :cond_17

    .line 465
    .line 466
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    instance-of v13, v11, Ljava/io/File;

    .line 471
    .line 472
    if-eqz v13, :cond_13

    .line 473
    .line 474
    const-string v7, "null cannot be cast to non-null type java.io.File"

    .line 475
    .line 476
    invoke-static {v11, v7}, Lkotlin/jvm/internal/q;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    move-object v7, v11

    .line 480
    check-cast v7, Ljava/io/File;

    .line 481
    .line 482
    new-instance v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 483
    .line 484
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 485
    .line 486
    .line 487
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 488
    .line 489
    .line 490
    move-result-object v12

    .line 491
    new-instance v13, Lcom/mrousavy/camera/p$a$a;

    .line 492
    .line 493
    if-eqz v10, :cond_14

    .line 494
    .line 495
    move/from16 v20, v8

    .line 496
    .line 497
    goto :goto_6

    .line 498
    :cond_14
    move/from16 v20, v6

    .line 499
    .line 500
    :goto_6
    const/16 v23, 0x0

    .line 501
    .line 502
    move-object/from16 v17, v13

    .line 503
    .line 504
    move-object/from16 v18, v7

    .line 505
    .line 506
    move-object/from16 v19, v11

    .line 507
    .line 508
    move-object/from16 v22, v9

    .line 509
    .line 510
    invoke-direct/range {v17 .. v23}, Lcom/mrousavy/camera/p$a$a;-><init>(Ljava/io/File;Lkotlin/jvm/internal/Ref$ObjectRef;ZLjava/lang/Integer;Landroidx/camera/core/ImageProxy;Lkotlin/coroutines/Continuation;)V

    .line 511
    .line 512
    .line 513
    iput-object v9, v0, Lcom/mrousavy/camera/p$a;->p:Ljava/lang/Object;

    .line 514
    .line 515
    iput-object v7, v0, Lcom/mrousavy/camera/p$a;->k:Ljava/lang/Object;

    .line 516
    .line 517
    iput-object v11, v0, Lcom/mrousavy/camera/p$a;->l:Ljava/lang/Object;

    .line 518
    .line 519
    iput-wide v2, v0, Lcom/mrousavy/camera/p$a;->m:J

    .line 520
    .line 521
    const/4 v14, 0x3

    .line 522
    iput v14, v0, Lcom/mrousavy/camera/p$a;->o:I

    .line 523
    .line 524
    invoke-static {v12, v13, v0}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    if-ne v6, v1, :cond_15

    .line 529
    .line 530
    return-object v1

    .line 531
    :cond_15
    move-wide v1, v2

    .line 532
    move-object v6, v7

    .line 533
    move-object v7, v9

    .line 534
    move-object v3, v11

    .line 535
    :goto_7
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    const-string v9, "path"

    .line 540
    .line 541
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v6

    .line 545
    invoke-interface {v8, v9, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v7}, Landroidx/camera/core/ImageProxy;->getWidth()I

    .line 549
    .line 550
    .line 551
    move-result v6

    .line 552
    const-string v9, "width"

    .line 553
    .line 554
    invoke-interface {v8, v9, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 555
    .line 556
    .line 557
    const-string v6, "height"

    .line 558
    .line 559
    invoke-interface {v7}, Landroidx/camera/core/ImageProxy;->getHeight()I

    .line 560
    .line 561
    .line 562
    move-result v9

    .line 563
    invoke-interface {v8, v6, v9}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 564
    .line 565
    .line 566
    const-string v6, "isRawPhoto"

    .line 567
    .line 568
    invoke-static {v7}, Lse/l;->a(Landroidx/camera/core/ImageProxy;)Z

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    invoke-interface {v8, v6, v9}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 573
    .line 574
    .line 575
    iget-object v3, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v3, Landroidx/exifinterface/media/a;

    .line 578
    .line 579
    if-eqz v3, :cond_16

    .line 580
    .line 581
    invoke-static {v3}, Lse/j;->a(Landroidx/exifinterface/media/a;)Lcom/facebook/react/bridge/WritableMap;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    :cond_16
    const-string v3, "metadata"

    .line 586
    .line 587
    invoke-interface {v8, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 588
    .line 589
    .line 590
    invoke-interface {v7}, Landroidx/camera/core/ImageProxy;->close()V

    .line 591
    .line 592
    .line 593
    const-string v3, "Finished taking photo!"

    .line 594
    .line 595
    invoke-static {v5, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 596
    .line 597
    .line 598
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 599
    .line 600
    .line 601
    move-result-wide v3

    .line 602
    new-instance v5, Ljava/lang/StringBuilder;

    .line 603
    .line 604
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 605
    .line 606
    .line 607
    const-string v6, "Finished function execution in "

    .line 608
    .line 609
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    sub-long/2addr v3, v1

    .line 613
    const v1, 0xf4240

    .line 614
    .line 615
    .line 616
    int-to-long v1, v1

    .line 617
    div-long/2addr v3, v1

    .line 618
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    const-string v1, "ms"

    .line 622
    .line 623
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    const-string v2, "CameraView.performance"

    .line 631
    .line 632
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 633
    .line 634
    .line 635
    const-string v1, "map"

    .line 636
    .line 637
    invoke-static {v8, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    return-object v8

    .line 641
    :cond_17
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 642
    .line 643
    invoke-direct {v1, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    throw v1

    .line 647
    :cond_18
    new-instance v1, Ljava/util/NoSuchElementException;

    .line 648
    .line 649
    invoke-direct {v1, v12}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    throw v1
.end method
