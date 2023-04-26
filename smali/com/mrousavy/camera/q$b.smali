.class final Lcom/mrousavy/camera/q$b;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/q;->a(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lcom/facebook/react/bridge/WritableMap;",
        "kotlin.jvm.PlatformType",
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
    c = "com.mrousavy.camera.CameraView_TakeSnapshotKt$takeSnapshot$2"
    f = "CameraView+TakeSnapshot.kt"
    l = {
        0x16,
        0x19,
        0x22
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:Ljava/lang/Object;

.field n:Ljava/lang/Object;

.field o:Z

.field p:I

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
            "Lcom/mrousavy/camera/q$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    iput-object p2, p0, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/mrousavy/camera/q$b;

    iget-object v0, p0, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    iget-object v1, p0, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    invoke-direct {p1, v0, v1, p2}, Lcom/mrousavy/camera/q$b;-><init>(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/q$b;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/q$b;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/q$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "skipMetadata"

    .line 4
    .line 5
    const-string v2, "quality"

    .line 6
    .line 7
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget v4, v1, Lcom/mrousavy/camera/q$b;->p:I

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x3

    .line 15
    const/4 v7, 0x2

    .line 16
    const-string v8, "on"

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    if-eq v4, v9, :cond_2

    .line 22
    .line 23
    if-eq v4, v7, :cond_1

    .line 24
    .line 25
    if-ne v4, v6, :cond_0

    .line 26
    .line 27
    iget-boolean v2, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 28
    .line 29
    iget-object v3, v1, Lcom/mrousavy/camera/q$b;->n:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 32
    .line 33
    iget-object v4, v1, Lcom/mrousavy/camera/q$b;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 36
    .line 37
    iget-object v6, v1, Lcom/mrousavy/camera/q$b;->l:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v6, Landroid/graphics/Bitmap;

    .line 40
    .line 41
    iget-object v7, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v7, Landroidx/camera/core/k;

    .line 44
    .line 45
    :try_start_0
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    iget-boolean v4, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 62
    .line 63
    iget-object v7, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, Landroidx/camera/core/k;

    .line 66
    .line 67
    :try_start_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    .line 69
    .line 70
    move-object v9, v7

    .line 71
    move-object/from16 v7, p1

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :catchall_1
    move-exception v0

    .line 76
    move v2, v4

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_2
    iget-boolean v4, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 80
    .line 81
    iget-object v9, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v9, Landroidx/camera/core/k;

    .line 84
    .line 85
    :try_start_2
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_2
    move-exception v0

    .line 90
    move v2, v4

    .line 91
    move-object v7, v9

    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_3
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v4, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 98
    .line 99
    invoke-virtual {v4}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_c

    .line 104
    .line 105
    iget-object v10, v1, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 106
    .line 107
    const-string v11, "flash"

    .line 108
    .line 109
    invoke-interface {v10, v11}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-static {v10, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_4

    .line 118
    .line 119
    :try_start_3
    invoke-interface {v4}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 120
    .line 121
    .line 122
    move-result-object v11

    .line 123
    invoke-interface {v11, v9}, Landroidx/camera/core/m;->f(Z)Lfc/b;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    const-string v12, "camera.cameraControl.enableTorch(true)"

    .line 128
    .line 129
    invoke-static {v11, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iput-object v4, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 133
    .line 134
    iput-boolean v10, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 135
    .line 136
    iput v9, v1, Lcom/mrousavy/camera/q$b;->p:I

    .line 137
    .line 138
    invoke-static {v11, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 142
    if-ne v9, v3, :cond_4

    .line 143
    .line 144
    return-object v3

    .line 145
    :catchall_3
    move-exception v0

    .line 146
    move-object v7, v4

    .line 147
    move v2, v10

    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    :cond_4
    move-object v9, v4

    .line 151
    move v4, v10

    .line 152
    :goto_0
    :try_start_4
    iget-object v10, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 153
    .line 154
    invoke-virtual {v10}, Lcom/mrousavy/camera/CameraView;->getCoroutineScope$react_native_vision_camera_release()Lkotlinx/coroutines/CoroutineScope;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    invoke-interface {v10}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    new-instance v11, Lcom/mrousavy/camera/q$b$b;

    .line 163
    .line 164
    iget-object v12, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 165
    .line 166
    invoke-direct {v11, v12, v5}, Lcom/mrousavy/camera/q$b$b;-><init>(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    .line 167
    .line 168
    .line 169
    iput-object v9, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 170
    .line 171
    iput-boolean v4, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 172
    .line 173
    iput v7, v1, Lcom/mrousavy/camera/q$b;->p:I

    .line 174
    .line 175
    invoke-static {v10, v11, v1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    if-ne v7, v3, :cond_5

    .line 180
    .line 181
    return-object v3

    .line 182
    :cond_5
    :goto_1
    const-string v10, "CameraView.takeSnapshot(\u2026meraNotReadyError()\n    }"

    .line 183
    .line 184
    invoke-static {v7, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    check-cast v7, Landroid/graphics/Bitmap;

    .line 188
    .line 189
    iget-object v10, v1, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 190
    .line 191
    invoke-interface {v10, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_6

    .line 196
    .line 197
    iget-object v10, v1, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 198
    .line 199
    invoke-interface {v10, v2}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    goto :goto_2

    .line 204
    :cond_6
    const/16 v2, 0x64

    .line 205
    .line 206
    :goto_2
    move/from16 v16, v2

    .line 207
    .line 208
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 209
    .line 210
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 211
    .line 212
    .line 213
    new-instance v10, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 214
    .line 215
    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lkotlinx/coroutines/y0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    new-instance v14, Lcom/mrousavy/camera/q$b$a;

    .line 223
    .line 224
    iget-object v13, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 225
    .line 226
    const/16 v17, 0x0

    .line 227
    .line 228
    move-object v11, v14

    .line 229
    move-object v12, v2

    .line 230
    move-object v5, v14

    .line 231
    move-object v14, v10

    .line 232
    move-object/from16 v18, v15

    .line 233
    .line 234
    move-object v15, v7

    .line 235
    invoke-direct/range {v11 .. v17}, Lcom/mrousavy/camera/q$b$a;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/mrousavy/camera/CameraView;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/graphics/Bitmap;ILkotlin/coroutines/Continuation;)V

    .line 236
    .line 237
    .line 238
    iput-object v9, v1, Lcom/mrousavy/camera/q$b;->k:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v7, v1, Lcom/mrousavy/camera/q$b;->l:Ljava/lang/Object;

    .line 241
    .line 242
    iput-object v2, v1, Lcom/mrousavy/camera/q$b;->m:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v10, v1, Lcom/mrousavy/camera/q$b;->n:Ljava/lang/Object;

    .line 245
    .line 246
    iput-boolean v4, v1, Lcom/mrousavy/camera/q$b;->o:Z

    .line 247
    .line 248
    iput v6, v1, Lcom/mrousavy/camera/q$b;->p:I

    .line 249
    .line 250
    move-object/from16 v6, v18

    .line 251
    .line 252
    invoke-static {v6, v5, v1}, Lkotlinx/coroutines/j;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 256
    if-ne v5, v3, :cond_7

    .line 257
    .line 258
    return-object v3

    .line 259
    :cond_7
    move-object v6, v7

    .line 260
    move-object v7, v9

    .line 261
    move-object v3, v10

    .line 262
    move/from16 v19, v4

    .line 263
    .line 264
    move-object v4, v2

    .line 265
    move/from16 v2, v19

    .line 266
    .line 267
    :goto_3
    :try_start_5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    const-string v9, "path"

    .line 272
    .line 273
    iget-object v4, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v4, Ljava/io/File;

    .line 276
    .line 277
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    invoke-interface {v5, v9, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    const-string v4, "width"

    .line 285
    .line 286
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 287
    .line 288
    .line 289
    move-result v9

    .line 290
    invoke-interface {v5, v4, v9}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 291
    .line 292
    .line 293
    const-string v4, "height"

    .line 294
    .line 295
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    invoke-interface {v5, v4, v6}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 300
    .line 301
    .line 302
    const-string v4, "isRawPhoto"

    .line 303
    .line 304
    const/4 v6, 0x0

    .line 305
    invoke-interface {v5, v4, v6}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    iget-object v4, v1, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 309
    .line 310
    invoke-interface {v4, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    if-eqz v4, :cond_8

    .line 315
    .line 316
    iget-object v4, v1, Lcom/mrousavy/camera/q$b;->r:Lcom/facebook/react/bridge/ReadableMap;

    .line 317
    .line 318
    invoke-interface {v4, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    :cond_8
    if-eqz v6, :cond_9

    .line 323
    .line 324
    const/4 v0, 0x0

    .line 325
    goto :goto_4

    .line 326
    :cond_9
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->k:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v0, Landroidx/exifinterface/media/a;

    .line 329
    .line 330
    invoke-static {v0}, Lse/j;->a(Landroidx/exifinterface/media/a;)Lcom/facebook/react/bridge/WritableMap;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_4
    const-string v3, "metadata"

    .line 335
    .line 336
    invoke-interface {v5, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 337
    .line 338
    .line 339
    if-eqz v2, :cond_a

    .line 340
    .line 341
    invoke-interface {v7}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iget-object v2, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 346
    .line 347
    invoke-virtual {v2}, Lcom/mrousavy/camera/CameraView;->getTorch()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-static {v2, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    invoke-interface {v0, v2}, Landroidx/camera/core/m;->f(Z)Lfc/b;

    .line 356
    .line 357
    .line 358
    :cond_a
    return-object v5

    .line 359
    :goto_5
    if-eqz v2, :cond_b

    .line 360
    .line 361
    invoke-interface {v7}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    iget-object v3, v1, Lcom/mrousavy/camera/q$b;->q:Lcom/mrousavy/camera/CameraView;

    .line 366
    .line 367
    invoke-virtual {v3}, Lcom/mrousavy/camera/CameraView;->getTorch()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-static {v3, v8}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    invoke-interface {v2, v3}, Landroidx/camera/core/m;->f(Z)Lfc/b;

    .line 376
    .line 377
    .line 378
    :cond_b
    throw v0

    .line 379
    :cond_c
    new-instance v0, Lcom/mrousavy/camera/c;

    .line 380
    .line 381
    invoke-direct {v0}, Lcom/mrousavy/camera/c;-><init>()V

    .line 382
    .line 383
    .line 384
    throw v0
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
.end method
