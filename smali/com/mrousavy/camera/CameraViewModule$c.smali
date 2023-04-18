.class final Lcom/mrousavy/camera/CameraViewModule$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/CameraViewModule;->getAvailableCameraDevices(Lcom/facebook/react/bridge/Promise;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "Lkotlinx/coroutines/CoroutineScope;",
        "",
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
    c = "com.mrousavy.camera.CameraViewModule$getAvailableCameraDevices$1"
    f = "CameraViewModule.kt"
    l = {
        0xaf,
        0xb0,
        0xb1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:Ljava/lang/Object;

.field l:Ljava/lang/Object;

.field m:Ljava/lang/Object;

.field n:Ljava/lang/Object;

.field o:J

.field p:I

.field final synthetic q:Lcom/facebook/react/bridge/Promise;

.field final synthetic r:Lcom/mrousavy/camera/CameraViewModule;

.field final synthetic s:J


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Promise;Lcom/mrousavy/camera/CameraViewModule;JLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/Promise;",
            "Lcom/mrousavy/camera/CameraViewModule;",
            "J",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/CameraViewModule$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    iput-object p2, p0, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    iput-wide p3, p0, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance p1, Lcom/mrousavy/camera/CameraViewModule$c;

    iget-object v1, p0, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    iget-object v2, p0, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    iget-wide v3, p0, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/mrousavy/camera/CameraViewModule$c;-><init>(Lcom/facebook/react/bridge/Promise;Lcom/mrousavy/camera/CameraViewModule;JLkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/CameraViewModule$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/CameraViewModule$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 51

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "cameraConfig.outputFormats"

    .line 4
    .line 5
    const-string v2, "id"

    .line 6
    .line 7
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    .line 12
    .line 13
    const-string v5, "getInstance(reactApplicationContext)"

    .line 14
    .line 15
    const/4 v6, 0x3

    .line 16
    const/4 v7, 0x2

    .line 17
    const/4 v8, 0x1

    .line 18
    if-eqz v4, :cond_3

    .line 19
    .line 20
    if-eq v4, v8, :cond_2

    .line 21
    .line 22
    if-eq v4, v7, :cond_1

    .line 23
    .line 24
    if-ne v4, v6, :cond_0

    .line 25
    .line 26
    iget-wide v3, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 27
    .line 28
    iget-object v5, v1, Lcom/mrousavy/camera/CameraViewModule$c;->n:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, Landroidx/camera/lifecycle/e;

    .line 31
    .line 32
    iget-object v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v9, Landroidx/camera/extensions/ExtensionsManager;

    .line 35
    .line 36
    iget-object v10, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v10, Lcom/mrousavy/camera/CameraViewModule;

    .line 39
    .line 40
    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v11, Lcom/facebook/react/bridge/Promise;

    .line 43
    .line 44
    :try_start_0
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 45
    .line 46
    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_1
    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 58
    .line 59
    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Landroidx/camera/lifecycle/e;

    .line 62
    .line 63
    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, Lcom/mrousavy/camera/CameraViewModule;

    .line 66
    .line 67
    iget-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v12, Lcom/facebook/react/bridge/Promise;

    .line 70
    .line 71
    :try_start_1
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    .line 74
    move-object/from16 v13, p1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    move-object v11, v12

    .line 79
    goto/16 :goto_27

    .line 80
    .line 81
    :cond_2
    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 82
    .line 83
    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v4, Lcom/mrousavy/camera/CameraViewModule;

    .line 86
    .line 87
    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v11, Lcom/facebook/react/bridge/Promise;

    .line 90
    .line 91
    :try_start_2
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 92
    .line 93
    .line 94
    move-object/from16 v12, p1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    invoke-static/range {p1 .. p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->q:Lcom/facebook/react/bridge/Promise;

    .line 101
    .line 102
    iget-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->r:Lcom/mrousavy/camera/CameraViewModule;

    .line 103
    .line 104
    iget-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->s:J

    .line 105
    .line 106
    :try_start_3
    invoke-static {v4}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-static {v12}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    invoke-static {v12, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 120
    .line 121
    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 122
    .line 123
    iput v8, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    .line 124
    .line 125
    invoke-static {v12, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v12

    .line 129
    if-ne v12, v3, :cond_4

    .line 130
    .line 131
    return-object v3

    .line 132
    :cond_4
    :goto_0
    check-cast v12, Landroidx/camera/lifecycle/e;

    .line 133
    .line 134
    invoke-static {v4}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    invoke-static {v13, v12}, Landroidx/camera/extensions/ExtensionsManager;->c(Landroid/content/Context;Landroidx/camera/core/s;)Lfc/b;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    const-string v14, "getInstanceAsync(reactAp\u2026nContext, cameraProvider)"

    .line 143
    .line 144
    invoke-static {v13, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    .line 152
    .line 153
    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 154
    .line 155
    iput v7, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    .line 156
    .line 157
    invoke-static {v13, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v13
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 161
    if-ne v13, v3, :cond_5

    .line 162
    .line 163
    return-object v3

    .line 164
    :cond_5
    move-object/from16 v50, v11

    .line 165
    .line 166
    move-object v11, v4

    .line 167
    move-object v4, v12

    .line 168
    move-object/from16 v12, v50

    .line 169
    .line 170
    :goto_1
    :try_start_4
    check-cast v13, Landroidx/camera/extensions/ExtensionsManager;

    .line 171
    .line 172
    invoke-static {v11}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 173
    .line 174
    .line 175
    move-result-object v14

    .line 176
    invoke-static {v14}, Landroidx/camera/lifecycle/e;->g(Landroid/content/Context;)Lfc/b;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-static {v14, v5}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    iput-object v12, v1, Lcom/mrousavy/camera/CameraViewModule$c;->k:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v11, v1, Lcom/mrousavy/camera/CameraViewModule$c;->l:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v13, v1, Lcom/mrousavy/camera/CameraViewModule$c;->m:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v4, v1, Lcom/mrousavy/camera/CameraViewModule$c;->n:Ljava/lang/Object;

    .line 190
    .line 191
    iput-wide v9, v1, Lcom/mrousavy/camera/CameraViewModule$c;->o:J

    .line 192
    .line 193
    iput v6, v1, Lcom/mrousavy/camera/CameraViewModule$c;->p:I

    .line 194
    .line 195
    invoke-static {v14, v1}, Lui/a;->b(Lfc/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 199
    if-ne v5, v3, :cond_6

    .line 200
    .line 201
    return-object v3

    .line 202
    :cond_6
    move-object v5, v4

    .line 203
    move-wide v3, v9

    .line 204
    move-object v10, v11

    .line 205
    move-object v11, v12

    .line 206
    move-object v9, v13

    .line 207
    :goto_2
    :try_start_5
    invoke-static {v10}, Lcom/mrousavy/camera/CameraViewModule;->access$getReactApplicationContext(Lcom/mrousavy/camera/CameraViewModule;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    const-string v12, "camera"

    .line 212
    .line 213
    invoke-virtual {v10, v12}, Lcom/facebook/react/bridge/ReactContext;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    instance-of v12, v10, Landroid/hardware/camera2/CameraManager;

    .line 218
    .line 219
    if-eqz v12, :cond_7

    .line 220
    .line 221
    check-cast v10, Landroid/hardware/camera2/CameraManager;

    .line 222
    .line 223
    goto :goto_3

    .line 224
    :cond_7
    const/4 v10, 0x0

    .line 225
    :goto_3
    if-eqz v10, :cond_30

    .line 226
    .line 227
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 228
    .line 229
    .line 230
    move-result-object v12

    .line 231
    const-string v14, "createArray()"

    .line 232
    .line 233
    invoke-static {v12, v14}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10}, Landroid/hardware/camera2/CameraManager;->getCameraIdList()[Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    const-string v15, "manager.cameraIdList"

    .line 241
    .line 242
    invoke-static {v14, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    array-length v15, v14
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 246
    const/4 v13, 0x0

    .line 247
    :goto_4
    const-string v8, "CameraView"

    .line 248
    .line 249
    if-ge v13, v15, :cond_2f

    .line 250
    .line 251
    :try_start_6
    aget-object v7, v14, v13

    .line 252
    .line 253
    new-instance v6, Landroidx/camera/core/t$a;

    .line 254
    .line 255
    invoke-direct {v6}, Landroidx/camera/core/t$a;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-static {v7, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-static {v6, v7}, Lse/e;->b(Landroidx/camera/core/t$a;Ljava/lang/String;)Landroidx/camera/core/t$a;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-virtual {v6}, Landroidx/camera/core/t$a;->b()Landroidx/camera/core/t;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    const-string v1, "Builder().byID(id).build()"

    .line 270
    .line 271
    invoke-static {v6, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10, v7}, Landroid/hardware/camera2/CameraManager;->getCameraCharacteristics(Ljava/lang/String;)Landroid/hardware/camera2/CameraCharacteristics;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object/from16 v18, v10

    .line 279
    .line 280
    const-string v10, "manager.getCameraCharacteristics(id)"

    .line 281
    .line 282
    invoke-static {v1, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    sget-object v10, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 286
    .line 287
    invoke-virtual {v1, v10}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    invoke-static {v10}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    check-cast v10, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v10

    .line 300
    move-object/from16 v19, v14

    .line 301
    .line 302
    sget-object v14, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 303
    .line 304
    invoke-virtual {v1, v14}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    invoke-static {v14}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    check-cast v14, [I

    .line 312
    .line 313
    move/from16 v20, v15

    .line 314
    .line 315
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 316
    .line 317
    move-object/from16 v21, v11

    .line 318
    .line 319
    const/16 v11, 0x1c

    .line 320
    .line 321
    if-lt v15, v11, :cond_8

    .line 322
    .line 323
    const/16 v11, 0xb

    .line 324
    .line 325
    :try_start_7
    invoke-static {v14, v11}, Lkotlin/collections/b;->w([II)Z

    .line 326
    .line 327
    .line 328
    move-result v11

    .line 329
    if-eqz v11, :cond_8

    .line 330
    .line 331
    move-wide/from16 v23, v3

    .line 332
    .line 333
    const/4 v11, 0x1

    .line 334
    goto :goto_5

    .line 335
    :cond_8
    move-wide/from16 v23, v3

    .line 336
    .line 337
    const/4 v11, 0x0

    .line 338
    :goto_5
    invoke-static {v1}, Lse/c;->a(Landroid/hardware/camera2/CameraCharacteristics;)Lcom/facebook/react/bridge/ReadableArray;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 343
    .line 344
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    invoke-static {v4}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    check-cast v4, Landroid/hardware/camera2/params/StreamConfigurationMap;

    .line 352
    .line 353
    move/from16 v25, v13

    .line 354
    .line 355
    sget-object v13, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 356
    .line 357
    invoke-virtual {v1, v13}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    invoke-static {v13}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    check-cast v13, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v13

    .line 370
    move-object/from16 v26, v12

    .line 371
    .line 372
    sget-object v12, Landroid/hardware/camera2/CameraCharacteristics;->FLASH_INFO_AVAILABLE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 373
    .line 374
    invoke-virtual {v1, v12}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-static {v12}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    check-cast v12, Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result v12

    .line 387
    move-object/from16 v27, v8

    .line 388
    .line 389
    sget-object v8, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_AVAILABLE_MAX_DIGITAL_ZOOM:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 390
    .line 391
    invoke-virtual {v1, v8}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    invoke-static {v8}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    check-cast v8, Ljava/lang/Number;

    .line 399
    .line 400
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    move-object/from16 v28, v0

    .line 405
    .line 406
    const/16 v0, 0x8

    .line 407
    .line 408
    invoke-static {v14, v0}, Lkotlin/collections/b;->w([II)Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    move-object/from16 v29, v4

    .line 413
    .line 414
    if-eqz v0, :cond_9

    .line 415
    .line 416
    const/4 v0, 0x1

    .line 417
    goto :goto_6

    .line 418
    :cond_9
    const/4 v0, 0x0

    .line 419
    :goto_6
    const/4 v4, 0x3

    .line 420
    invoke-static {v14, v4}, Lkotlin/collections/b;->w([II)Z

    .line 421
    .line 422
    .line 423
    move-result v14

    .line 424
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_SENSITIVITY_RANGE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 425
    .line 426
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    check-cast v4, Landroid/util/Range;

    .line 431
    .line 432
    move-object/from16 v30, v4

    .line 433
    .line 434
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 435
    .line 436
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    check-cast v4, [I

    .line 441
    .line 442
    move-object/from16 v31, v4

    .line 443
    .line 444
    sget-object v4, Landroid/hardware/camera2/CameraCharacteristics;->LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 445
    .line 446
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    check-cast v4, [I

    .line 451
    .line 452
    move-object/from16 v32, v4

    .line 453
    .line 454
    const/16 v4, 0x1e

    .line 455
    .line 456
    if-lt v15, v4, :cond_a

    .line 457
    .line 458
    invoke-static {}, Lq/a;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    invoke-virtual {v1, v4}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    check-cast v4, Landroid/util/Range;

    .line 467
    .line 468
    goto :goto_7

    .line 469
    :cond_a
    const/4 v4, 0x0

    .line 470
    :goto_7
    move-object/from16 v33, v5

    .line 471
    .line 472
    const/16 v5, 0x1c

    .line 473
    .line 474
    if-lt v15, v5, :cond_b

    .line 475
    .line 476
    invoke-static {}, Lcom/mrousavy/camera/l;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    invoke-virtual {v1, v5}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    check-cast v5, Ljava/lang/String;

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :cond_b
    const/4 v5, 0x0

    .line 488
    :goto_8
    sget-object v15, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 489
    .line 490
    invoke-virtual {v1, v15}, Landroid/hardware/camera2/CameraCharacteristics;->get(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v15

    .line 494
    invoke-static {v15}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    check-cast v15, [Landroid/util/Range;

    .line 498
    .line 499
    move-object/from16 v22, v15

    .line 500
    .line 501
    const/4 v15, 0x2

    .line 502
    invoke-virtual {v9, v6, v15}, Landroidx/camera/extensions/ExtensionsManager;->f(Landroidx/camera/core/t;I)Z

    .line 503
    .line 504
    .line 505
    move-result v16

    .line 506
    const/4 v15, 0x3

    .line 507
    invoke-virtual {v9, v6, v15}, Landroidx/camera/extensions/ExtensionsManager;->f(Landroidx/camera/core/t;I)Z

    .line 508
    .line 509
    .line 510
    move-result v17

    .line 511
    const/4 v15, 0x2

    .line 512
    if-eq v10, v15, :cond_c

    .line 513
    .line 514
    if-eqz v10, :cond_c

    .line 515
    .line 516
    move/from16 v35, v8

    .line 517
    .line 518
    move-object/from16 v34, v9

    .line 519
    .line 520
    const/4 v10, 0x1

    .line 521
    goto :goto_9

    .line 522
    :cond_c
    move/from16 v35, v8

    .line 523
    .line 524
    move-object/from16 v34, v9

    .line 525
    .line 526
    const/4 v10, 0x0

    .line 527
    :goto_9
    invoke-static {v1}, Lse/c;->b(Landroid/hardware/camera2/CameraCharacteristics;)D

    .line 528
    .line 529
    .line 530
    move-result-wide v8

    .line 531
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-interface {v1, v2, v7}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    const-string v15, "devices"

    .line 539
    .line 540
    invoke-interface {v1, v15, v3}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 541
    .line 542
    .line 543
    const-string v3, "position"

    .line 544
    .line 545
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v15

    .line 549
    invoke-static {v15}, Lre/b;->a(Ljava/lang/Integer;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v15

    .line 553
    invoke-interface {v1, v3, v15}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    const-string v3, "name"

    .line 557
    .line 558
    if-nez v5, :cond_d

    .line 559
    .line 560
    new-instance v5, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 563
    .line 564
    .line 565
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    invoke-static {v13}, Lre/b;->a(Ljava/lang/Integer;)Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v13

    .line 573
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v13, " ("

    .line 577
    .line 578
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const/16 v7, 0x29

    .line 585
    .line 586
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    :cond_d
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    const-string v3, "hasFlash"

    .line 597
    .line 598
    if-eqz v12, :cond_e

    .line 599
    .line 600
    const/4 v5, 0x1

    .line 601
    goto :goto_a

    .line 602
    :cond_e
    const/4 v5, 0x0

    .line 603
    :goto_a
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 604
    .line 605
    .line 606
    const-string v3, "hasTorch"

    .line 607
    .line 608
    if-eqz v12, :cond_f

    .line 609
    .line 610
    const/4 v5, 0x1

    .line 611
    goto :goto_b

    .line 612
    :cond_f
    const/4 v5, 0x0

    .line 613
    :goto_b
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 614
    .line 615
    .line 616
    const-string v3, "isMultiCam"

    .line 617
    .line 618
    if-eqz v11, :cond_10

    .line 619
    .line 620
    const/4 v5, 0x1

    .line 621
    goto :goto_c

    .line 622
    :cond_10
    const/4 v5, 0x0

    .line 623
    :goto_c
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 624
    .line 625
    .line 626
    const-string v3, "supportsParallelVideoProcessing"

    .line 627
    .line 628
    if-eqz v10, :cond_11

    .line 629
    .line 630
    const/4 v5, 0x1

    .line 631
    goto :goto_d

    .line 632
    :cond_11
    const/4 v5, 0x0

    .line 633
    :goto_d
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 634
    .line 635
    .line 636
    const-string v3, "supportsRawCapture"

    .line 637
    .line 638
    if-eqz v14, :cond_12

    .line 639
    .line 640
    const/4 v5, 0x1

    .line 641
    goto :goto_e

    .line 642
    :cond_12
    const/4 v5, 0x0

    .line 643
    :goto_e
    invoke-interface {v1, v3, v5}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 644
    .line 645
    .line 646
    const-string v3, "supportsDepthCapture"

    .line 647
    .line 648
    if-eqz v0, :cond_13

    .line 649
    .line 650
    const/4 v0, 0x1

    .line 651
    goto :goto_f

    .line 652
    :cond_13
    const/4 v0, 0x0

    .line 653
    :goto_f
    invoke-interface {v1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 654
    .line 655
    .line 656
    const-string v0, "supportsLowLightBoost"

    .line 657
    .line 658
    if-eqz v17, :cond_14

    .line 659
    .line 660
    const/4 v3, 0x1

    .line 661
    goto :goto_10

    .line 662
    :cond_14
    const/4 v3, 0x0

    .line 663
    :goto_10
    invoke-interface {v1, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 664
    .line 665
    .line 666
    const-string v0, "supportsFocus"

    .line 667
    .line 668
    const/4 v3, 0x1

    .line 669
    invoke-interface {v1, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 670
    .line 671
    .line 672
    const-string v0, "minZoom"

    .line 673
    .line 674
    const-string v3, "maxZoom"

    .line 675
    .line 676
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 677
    .line 678
    if-eqz v4, :cond_15

    .line 679
    .line 680
    :try_start_8
    invoke-virtual {v4}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    check-cast v5, Ljava/lang/Number;

    .line 685
    .line 686
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 687
    .line 688
    .line 689
    move-result v5

    .line 690
    float-to-double v12, v5

    .line 691
    invoke-interface {v1, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    check-cast v0, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    float-to-double v12, v0

    .line 705
    invoke-interface {v1, v3, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 706
    .line 707
    .line 708
    move/from16 v0, v35

    .line 709
    .line 710
    goto :goto_11

    .line 711
    :cond_15
    invoke-interface {v1, v0, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 712
    .line 713
    .line 714
    move/from16 v0, v35

    .line 715
    .line 716
    float-to-double v12, v0

    .line 717
    invoke-interface {v1, v3, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 718
    .line 719
    .line 720
    :goto_11
    const-string v5, "neutralZoom"

    .line 721
    .line 722
    invoke-interface {v1, v5, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 723
    .line 724
    .line 725
    invoke-virtual/range {v33 .. v33}, Landroidx/camera/lifecycle/e;->a()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v5

    .line 729
    invoke-virtual {v6, v5}, Landroidx/camera/core/t;->b(Ljava/util/List;)Ljava/util/List;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    const-string v6, "cameraSelector.filter(ca\u2026der.availableCameraInfos)"

    .line 734
    .line 735
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 739
    .line 740
    .line 741
    move-result v6

    .line 742
    if-lez v6, :cond_16

    .line 743
    .line 744
    const/4 v6, 0x0

    .line 745
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v7

    .line 749
    check-cast v7, Landroidx/camera/core/r;

    .line 750
    .line 751
    invoke-static {v7}, Li0/w;->i(Landroidx/camera/core/r;)Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v6

    .line 755
    const-string v7, "getSupportedQualities(cameraInfos[0])"

    .line 756
    .line 757
    invoke-static {v6, v7}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    new-instance v7, Ljava/util/ArrayList;

    .line 761
    .line 762
    const/16 v12, 0xa

    .line 763
    .line 764
    invoke-static {v6, v12}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    .line 765
    .line 766
    .line 767
    move-result v12

    .line 768
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 769
    .line 770
    .line 771
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    :goto_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 776
    .line 777
    .line 778
    move-result v12

    .line 779
    if-eqz v12, :cond_17

    .line 780
    .line 781
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v12

    .line 785
    check-cast v12, Li0/v;

    .line 786
    .line 787
    const/4 v13, 0x0

    .line 788
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v14

    .line 792
    check-cast v14, Landroidx/camera/core/r;

    .line 793
    .line 794
    invoke-static {v14, v12}, Li0/w;->h(Landroidx/camera/core/r;Li0/v;)Landroid/util/Size;

    .line 795
    .line 796
    .line 797
    move-result-object v12

    .line 798
    invoke-static {v12}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 802
    .line 803
    .line 804
    goto :goto_12

    .line 805
    :cond_16
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 806
    .line 807
    .line 808
    move-result-object v7

    .line 809
    :cond_17
    invoke-virtual/range {v29 .. v29}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    .line 810
    .line 811
    .line 812
    move-result-object v5

    .line 813
    move-object/from16 v6, v28

    .line 814
    .line 815
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    new-instance v12, Ljava/util/ArrayList;

    .line 819
    .line 820
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 821
    .line 822
    .line 823
    array-length v13, v5

    .line 824
    const/4 v14, 0x0

    .line 825
    :goto_13
    if-ge v14, v13, :cond_18

    .line 826
    .line 827
    aget v15, v5, v14

    .line 828
    .line 829
    move-object/from16 v10, v29

    .line 830
    .line 831
    invoke-virtual {v10, v15}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 832
    .line 833
    .line 834
    move-result-object v11

    .line 835
    const-string v15, "cameraConfig.getOutputSizes(it)"

    .line 836
    .line 837
    invoke-static {v11, v15}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    invoke-static {v11}, Lkotlin/collections/b;->u0([Ljava/lang/Object;)Ljava/util/List;

    .line 841
    .line 842
    .line 843
    move-result-object v11

    .line 844
    invoke-static {v12, v11}, Lkotlin/collections/h;->y(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 845
    .line 846
    .line 847
    add-int/lit8 v14, v14, 0x1

    .line 848
    .line 849
    move-object/from16 v29, v10

    .line 850
    .line 851
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 852
    .line 853
    goto :goto_13

    .line 854
    :cond_18
    move-object/from16 v10, v29

    .line 855
    .line 856
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 857
    .line 858
    .line 859
    move-result-object v5

    .line 860
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 861
    .line 862
    .line 863
    move-result v11

    .line 864
    if-nez v11, :cond_19

    .line 865
    .line 866
    const/4 v11, 0x0

    .line 867
    goto :goto_15

    .line 868
    :cond_19
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v11

    .line 872
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 873
    .line 874
    .line 875
    move-result v12

    .line 876
    if-nez v12, :cond_1a

    .line 877
    .line 878
    goto :goto_15

    .line 879
    :cond_1a
    move-object v12, v11

    .line 880
    check-cast v12, Landroid/util/Size;

    .line 881
    .line 882
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    .line 883
    .line 884
    .line 885
    move-result v13

    .line 886
    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    .line 887
    .line 888
    .line 889
    move-result v12

    .line 890
    mul-int/2addr v13, v12

    .line 891
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v12

    .line 895
    move-object v14, v12

    .line 896
    check-cast v14, Landroid/util/Size;

    .line 897
    .line 898
    invoke-virtual {v14}, Landroid/util/Size;->getWidth()I

    .line 899
    .line 900
    .line 901
    move-result v15

    .line 902
    invoke-virtual {v14}, Landroid/util/Size;->getHeight()I

    .line 903
    .line 904
    .line 905
    move-result v14

    .line 906
    mul-int/2addr v15, v14

    .line 907
    if-ge v13, v15, :cond_1b

    .line 908
    .line 909
    move-object v11, v12

    .line 910
    move v13, v15

    .line 911
    :cond_1b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 912
    .line 913
    .line 914
    move-result v12

    .line 915
    if-nez v12, :cond_2e

    .line 916
    .line 917
    :goto_15
    invoke-static {v11}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    check-cast v11, Landroid/util/Size;

    .line 921
    .line 922
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 923
    .line 924
    .line 925
    move-result-object v5

    .line 926
    invoke-virtual {v10}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputFormats()[I

    .line 927
    .line 928
    .line 929
    move-result-object v12

    .line 930
    invoke-static {v12, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 931
    .line 932
    .line 933
    array-length v13, v12

    .line 934
    const/4 v14, 0x0

    .line 935
    :goto_16
    if-ge v14, v13, :cond_2d

    .line 936
    .line 937
    aget v15, v12, v14

    .line 938
    .line 939
    move/from16 v35, v0

    .line 940
    .line 941
    invoke-static {v15}, Lre/a;->a(I)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    move-object/from16 v17, v2

    .line 946
    .line 947
    invoke-virtual {v10, v15}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    .line 948
    .line 949
    .line 950
    move-result-object v2

    .line 951
    move-object/from16 v28, v6

    .line 952
    .line 953
    const-string v6, "cameraConfig.getOutputSizes(formatId)"

    .line 954
    .line 955
    invoke-static {v2, v6}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    array-length v6, v2

    .line 959
    move-object/from16 v29, v12

    .line 960
    .line 961
    const/4 v12, 0x0

    .line 962
    :goto_17
    if-ge v12, v6, :cond_2c

    .line 963
    .line 964
    move/from16 v38, v6

    .line 965
    .line 966
    aget-object v6, v2, v12

    .line 967
    .line 968
    move-object/from16 v39, v2

    .line 969
    .line 970
    const-string v2, "size"

    .line 971
    .line 972
    invoke-static {v6, v2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    invoke-static {v6, v11}, Lre/c;->a(Landroid/util/Size;Landroid/util/Size;)Z

    .line 976
    .line 977
    .line 978
    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 979
    move/from16 v40, v13

    .line 980
    .line 981
    move/from16 v41, v14

    .line 982
    .line 983
    :try_start_9
    invoke-virtual {v10, v15, v6}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputMinFrameDuration(ILandroid/util/Size;)J

    .line 984
    .line 985
    .line 986
    move-result-wide v13

    .line 987
    long-to-double v13, v13

    .line 988
    const-wide v42, 0x41cdcd6500000000L    # 1.0E9

    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    div-double v13, v13, v42

    .line 994
    .line 995
    invoke-static {v13, v14}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 996
    .line 997
    .line 998
    move-result-object v13
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 999
    move-object/from16 v14, v27

    .line 1000
    .line 1001
    move-object/from16 v27, v10

    .line 1002
    .line 1003
    goto :goto_18

    .line 1004
    :catchall_1
    :try_start_a
    new-instance v13, Ljava/lang/StringBuilder;

    .line 1005
    .line 1006
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 1007
    .line 1008
    .line 1009
    const-string v14, "Minimum Frame Duration for MediaRecorder Output cannot be calculated, format \""

    .line 1010
    .line 1011
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1015
    .line 1016
    .line 1017
    const-string v14, "\" is not supported."

    .line 1018
    .line 1019
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v13

    .line 1026
    move-object/from16 v14, v27

    .line 1027
    .line 1028
    invoke-static {v14, v13}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1029
    .line 1030
    .line 1031
    move-object/from16 v27, v10

    .line 1032
    .line 1033
    const/4 v13, 0x0

    .line 1034
    :goto_18
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v10
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 1038
    move-object/from16 v42, v11

    .line 1039
    .line 1040
    const-string v11, "maxFrameRate"

    .line 1041
    .line 1042
    move/from16 v43, v15

    .line 1043
    .line 1044
    const-string v15, "minFrameRate"

    .line 1045
    .line 1046
    if-eqz v13, :cond_1c

    .line 1047
    .line 1048
    :try_start_b
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v44

    .line 1052
    const-wide/16 v46, 0x0

    .line 1053
    .line 1054
    cmpl-double v44, v44, v46

    .line 1055
    .line 1056
    if-lez v44, :cond_1c

    .line 1057
    .line 1058
    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    .line 1059
    .line 1060
    .line 1061
    move-result-wide v44

    .line 1062
    move-object/from16 v46, v14

    .line 1063
    .line 1064
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 1065
    .line 1066
    div-double v13, v36, v44

    .line 1067
    .line 1068
    double-to-int v13, v13

    .line 1069
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v14

    .line 1073
    move-object/from16 v44, v1

    .line 1074
    .line 1075
    const/4 v1, 0x1

    .line 1076
    invoke-interface {v14, v15, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 1077
    .line 1078
    .line 1079
    invoke-interface {v14, v11, v13}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 1080
    .line 1081
    .line 1082
    invoke-interface {v10, v14}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1083
    .line 1084
    .line 1085
    goto :goto_19

    .line 1086
    :cond_1c
    move-object/from16 v44, v1

    .line 1087
    .line 1088
    move-object/from16 v46, v14

    .line 1089
    .line 1090
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 1091
    .line 1092
    :goto_19
    move-object/from16 v1, v22

    .line 1093
    .line 1094
    array-length v13, v1

    .line 1095
    const/4 v14, 0x0

    .line 1096
    :goto_1a
    if-ge v14, v13, :cond_1d

    .line 1097
    .line 1098
    aget-object v22, v1, v14

    .line 1099
    .line 1100
    move-object/from16 v45, v1

    .line 1101
    .line 1102
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v1

    .line 1106
    move/from16 v47, v13

    .line 1107
    .line 1108
    invoke-virtual/range {v22 .. v22}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v13

    .line 1112
    move/from16 v48, v12

    .line 1113
    .line 1114
    const-string v12, "range.lower"

    .line 1115
    .line 1116
    invoke-static {v13, v12}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    check-cast v13, Ljava/lang/Number;

    .line 1120
    .line 1121
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 1122
    .line 1123
    .line 1124
    move-result v12

    .line 1125
    invoke-interface {v1, v15, v12}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 1126
    .line 1127
    .line 1128
    invoke-virtual/range {v22 .. v22}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v12

    .line 1132
    const-string v13, "range.upper"

    .line 1133
    .line 1134
    invoke-static {v12, v13}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1135
    .line 1136
    .line 1137
    check-cast v12, Ljava/lang/Number;

    .line 1138
    .line 1139
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1140
    .line 1141
    .line 1142
    move-result v12

    .line 1143
    invoke-interface {v1, v11, v12}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 1144
    .line 1145
    .line 1146
    invoke-interface {v10, v1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1147
    .line 1148
    .line 1149
    add-int/lit8 v14, v14, 0x1

    .line 1150
    .line 1151
    move-object/from16 v1, v45

    .line 1152
    .line 1153
    move/from16 v13, v47

    .line 1154
    .line 1155
    move/from16 v12, v48

    .line 1156
    .line 1157
    goto :goto_1a

    .line 1158
    :cond_1d
    move-object/from16 v45, v1

    .line 1159
    .line 1160
    move/from16 v48, v12

    .line 1161
    .line 1162
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 1167
    .line 1168
    .line 1169
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v11

    .line 1173
    const-string v12, "off"

    .line 1174
    .line 1175
    invoke-interface {v11, v12}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    if-eqz v31, :cond_1e

    .line 1179
    .line 1180
    move-object/from16 v12, v31

    .line 1181
    .line 1182
    const/4 v13, 0x1

    .line 1183
    invoke-static {v12, v13}, Lkotlin/collections/b;->w([II)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v14

    .line 1187
    if-eqz v14, :cond_1f

    .line 1188
    .line 1189
    const-string v13, "auto"

    .line 1190
    .line 1191
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    const-string v13, "standard"

    .line 1195
    .line 1196
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 1197
    .line 1198
    .line 1199
    goto :goto_1b

    .line 1200
    :cond_1e
    move-object/from16 v12, v31

    .line 1201
    .line 1202
    :cond_1f
    :goto_1b
    if-eqz v32, :cond_20

    .line 1203
    .line 1204
    move-object/from16 v15, v32

    .line 1205
    .line 1206
    const/4 v14, 0x1

    .line 1207
    invoke-static {v15, v14}, Lkotlin/collections/b;->w([II)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v13

    .line 1211
    if-eqz v13, :cond_21

    .line 1212
    .line 1213
    const-string v13, "cinematic"

    .line 1214
    .line 1215
    invoke-interface {v11, v13}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_1c

    .line 1219
    :cond_20
    move-object/from16 v15, v32

    .line 1220
    .line 1221
    const/4 v14, 0x1

    .line 1222
    :cond_21
    :goto_1c
    const-string v13, "420v"

    .line 1223
    .line 1224
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v14

    .line 1228
    move-object/from16 v22, v0

    .line 1229
    .line 1230
    const-string v0, "photoHeight"

    .line 1231
    .line 1232
    move-object/from16 v31, v12

    .line 1233
    .line 1234
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 1235
    .line 1236
    .line 1237
    move-result v12

    .line 1238
    move-object/from16 v32, v13

    .line 1239
    .line 1240
    int-to-double v12, v12

    .line 1241
    invoke-interface {v14, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 1242
    .line 1243
    .line 1244
    const-string v0, "photoWidth"

    .line 1245
    .line 1246
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 1247
    .line 1248
    .line 1249
    move-result v12

    .line 1250
    int-to-double v12, v12

    .line 1251
    invoke-interface {v14, v0, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 1252
    .line 1253
    .line 1254
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1259
    .line 1260
    .line 1261
    move-result v12

    .line 1262
    if-eqz v12, :cond_24

    .line 1263
    .line 1264
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v12

    .line 1268
    move-object v13, v12

    .line 1269
    check-cast v13, Landroid/util/Size;

    .line 1270
    .line 1271
    move-object/from16 v47, v0

    .line 1272
    .line 1273
    invoke-virtual {v13}, Landroid/util/Size;->getWidth()I

    .line 1274
    .line 1275
    .line 1276
    move-result v0

    .line 1277
    move-object/from16 v49, v7

    .line 1278
    .line 1279
    invoke-virtual {v6}, Landroid/util/Size;->getWidth()I

    .line 1280
    .line 1281
    .line 1282
    move-result v7

    .line 1283
    if-gt v0, v7, :cond_22

    .line 1284
    .line 1285
    invoke-virtual {v13}, Landroid/util/Size;->getHeight()I

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    .line 1290
    .line 1291
    .line 1292
    move-result v7

    .line 1293
    if-gt v0, v7, :cond_22

    .line 1294
    .line 1295
    const/4 v0, 0x1

    .line 1296
    goto :goto_1e

    .line 1297
    :cond_22
    const/4 v0, 0x0

    .line 1298
    :goto_1e
    if-eqz v0, :cond_23

    .line 1299
    .line 1300
    goto :goto_1f

    .line 1301
    :cond_23
    move-object/from16 v0, v47

    .line 1302
    .line 1303
    move-object/from16 v7, v49

    .line 1304
    .line 1305
    goto :goto_1d

    .line 1306
    :cond_24
    move-object/from16 v49, v7

    .line 1307
    .line 1308
    const/4 v12, 0x0

    .line 1309
    :goto_1f
    check-cast v12, Landroid/util/Size;

    .line 1310
    .line 1311
    const-string v0, "format"

    .line 1312
    .line 1313
    invoke-static {v14, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1314
    .line 1315
    .line 1316
    const-string v0, "videoHeight"

    .line 1317
    .line 1318
    if-eqz v12, :cond_25

    .line 1319
    .line 1320
    invoke-virtual {v12}, Landroid/util/Size;->getHeight()I

    .line 1321
    .line 1322
    .line 1323
    move-result v6

    .line 1324
    int-to-double v6, v6

    .line 1325
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v6

    .line 1329
    goto :goto_20

    .line 1330
    :cond_25
    const/4 v6, 0x0

    .line 1331
    :goto_20
    invoke-static {v14, v0, v6}, Lse/p;->a(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V

    .line 1332
    .line 1333
    .line 1334
    const-string v0, "videoWidth"

    .line 1335
    .line 1336
    if-eqz v12, :cond_26

    .line 1337
    .line 1338
    invoke-virtual {v12}, Landroid/util/Size;->getWidth()I

    .line 1339
    .line 1340
    .line 1341
    move-result v6

    .line 1342
    int-to-double v6, v6

    .line 1343
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/b;->b(D)Ljava/lang/Double;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v6

    .line 1347
    goto :goto_21

    .line 1348
    :cond_26
    const/4 v6, 0x0

    .line 1349
    :goto_21
    invoke-static {v14, v0, v6}, Lse/p;->a(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Double;)V

    .line 1350
    .line 1351
    .line 1352
    const-string v0, "isHighestPhotoQualitySupported"

    .line 1353
    .line 1354
    if-eqz v2, :cond_27

    .line 1355
    .line 1356
    const/4 v2, 0x1

    .line 1357
    goto :goto_22

    .line 1358
    :cond_27
    const/4 v2, 0x0

    .line 1359
    :goto_22
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 1360
    .line 1361
    .line 1362
    const-string v0, "maxISO"

    .line 1363
    .line 1364
    if-eqz v30, :cond_28

    .line 1365
    .line 1366
    invoke-virtual/range {v30 .. v30}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    check-cast v2, Ljava/lang/Integer;

    .line 1371
    .line 1372
    goto :goto_23

    .line 1373
    :cond_28
    const/4 v2, 0x0

    .line 1374
    :goto_23
    invoke-static {v14, v0, v2}, Lse/p;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1375
    .line 1376
    .line 1377
    const-string v0, "minISO"

    .line 1378
    .line 1379
    if-eqz v30, :cond_29

    .line 1380
    .line 1381
    invoke-virtual/range {v30 .. v30}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v2

    .line 1385
    check-cast v2, Ljava/lang/Integer;

    .line 1386
    .line 1387
    goto :goto_24

    .line 1388
    :cond_29
    const/4 v2, 0x0

    .line 1389
    :goto_24
    invoke-static {v14, v0, v2}, Lse/p;->b(Lcom/facebook/react/bridge/WritableMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1390
    .line 1391
    .line 1392
    const-string v0, "fieldOfView"

    .line 1393
    .line 1394
    invoke-interface {v14, v0, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 1395
    .line 1396
    .line 1397
    if-eqz v4, :cond_2a

    .line 1398
    .line 1399
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    check-cast v0, Ljava/lang/Float;

    .line 1404
    .line 1405
    if-eqz v0, :cond_2a

    .line 1406
    .line 1407
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 1408
    .line 1409
    .line 1410
    move-result v0

    .line 1411
    goto :goto_25

    .line 1412
    :cond_2a
    move/from16 v0, v35

    .line 1413
    .line 1414
    :goto_25
    float-to-double v6, v0

    .line 1415
    invoke-interface {v14, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 1416
    .line 1417
    .line 1418
    const-string v0, "colorSpaces"

    .line 1419
    .line 1420
    invoke-interface {v14, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1421
    .line 1422
    .line 1423
    const-string v0, "supportsVideoHDR"

    .line 1424
    .line 1425
    const/4 v1, 0x0

    .line 1426
    invoke-interface {v14, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 1427
    .line 1428
    .line 1429
    const-string v0, "supportsPhotoHDR"

    .line 1430
    .line 1431
    if-eqz v16, :cond_2b

    .line 1432
    .line 1433
    const/4 v2, 0x1

    .line 1434
    goto :goto_26

    .line 1435
    :cond_2b
    move v2, v1

    .line 1436
    :goto_26
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 1437
    .line 1438
    .line 1439
    const-string v0, "frameRateRanges"

    .line 1440
    .line 1441
    invoke-interface {v14, v0, v10}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1442
    .line 1443
    .line 1444
    const-string v0, "autoFocusSystem"

    .line 1445
    .line 1446
    const-string v2, "none"

    .line 1447
    .line 1448
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1449
    .line 1450
    .line 1451
    const-string v0, "videoStabilizationModes"

    .line 1452
    .line 1453
    invoke-interface {v14, v0, v11}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1454
    .line 1455
    .line 1456
    const-string v0, "pixelFormat"

    .line 1457
    .line 1458
    move-object/from16 v2, v32

    .line 1459
    .line 1460
    invoke-interface {v14, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1461
    .line 1462
    .line 1463
    invoke-interface {v5, v14}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1464
    .line 1465
    .line 1466
    add-int/lit8 v12, v48, 0x1

    .line 1467
    .line 1468
    move-object/from16 v32, v15

    .line 1469
    .line 1470
    move-object/from16 v0, v22

    .line 1471
    .line 1472
    move-object/from16 v10, v27

    .line 1473
    .line 1474
    move/from16 v6, v38

    .line 1475
    .line 1476
    move-object/from16 v2, v39

    .line 1477
    .line 1478
    move/from16 v13, v40

    .line 1479
    .line 1480
    move/from16 v14, v41

    .line 1481
    .line 1482
    move-object/from16 v11, v42

    .line 1483
    .line 1484
    move/from16 v15, v43

    .line 1485
    .line 1486
    move-object/from16 v1, v44

    .line 1487
    .line 1488
    move-object/from16 v22, v45

    .line 1489
    .line 1490
    move-object/from16 v27, v46

    .line 1491
    .line 1492
    move-object/from16 v7, v49

    .line 1493
    .line 1494
    goto/16 :goto_17

    .line 1495
    .line 1496
    :cond_2c
    move-object/from16 v44, v1

    .line 1497
    .line 1498
    move-object/from16 v49, v7

    .line 1499
    .line 1500
    move-object/from16 v42, v11

    .line 1501
    .line 1502
    move/from16 v40, v13

    .line 1503
    .line 1504
    move/from16 v41, v14

    .line 1505
    .line 1506
    move-object/from16 v45, v22

    .line 1507
    .line 1508
    move-object/from16 v46, v27

    .line 1509
    .line 1510
    move-object/from16 v15, v32

    .line 1511
    .line 1512
    const/4 v1, 0x0

    .line 1513
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 1514
    .line 1515
    move-object/from16 v27, v10

    .line 1516
    .line 1517
    add-int/lit8 v14, v41, 0x1

    .line 1518
    .line 1519
    move-object/from16 v2, v17

    .line 1520
    .line 1521
    move-object/from16 v6, v28

    .line 1522
    .line 1523
    move-object/from16 v12, v29

    .line 1524
    .line 1525
    move/from16 v0, v35

    .line 1526
    .line 1527
    move-object/from16 v1, v44

    .line 1528
    .line 1529
    move-object/from16 v27, v46

    .line 1530
    .line 1531
    goto/16 :goto_16

    .line 1532
    .line 1533
    :cond_2d
    move-object/from16 v44, v1

    .line 1534
    .line 1535
    move-object/from16 v17, v2

    .line 1536
    .line 1537
    move-object/from16 v28, v6

    .line 1538
    .line 1539
    const/4 v1, 0x0

    .line 1540
    const-string v0, "formats"

    .line 1541
    .line 1542
    move-object/from16 v2, v44

    .line 1543
    .line 1544
    invoke-interface {v2, v0, v5}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 1545
    .line 1546
    .line 1547
    move-object/from16 v0, v26

    .line 1548
    .line 1549
    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 1550
    .line 1551
    .line 1552
    add-int/lit8 v13, v25, 0x1

    .line 1553
    .line 1554
    move-object/from16 v1, p0

    .line 1555
    .line 1556
    move-object v12, v0

    .line 1557
    move-object/from16 v2, v17

    .line 1558
    .line 1559
    move-object/from16 v10, v18

    .line 1560
    .line 1561
    move-object/from16 v14, v19

    .line 1562
    .line 1563
    move/from16 v15, v20

    .line 1564
    .line 1565
    move-object/from16 v11, v21

    .line 1566
    .line 1567
    move-wide/from16 v3, v23

    .line 1568
    .line 1569
    move-object/from16 v0, v28

    .line 1570
    .line 1571
    move-object/from16 v5, v33

    .line 1572
    .line 1573
    move-object/from16 v9, v34

    .line 1574
    .line 1575
    const/4 v6, 0x3

    .line 1576
    const/4 v7, 0x2

    .line 1577
    goto/16 :goto_4

    .line 1578
    .line 1579
    :cond_2e
    move-object/from16 v17, v2

    .line 1580
    .line 1581
    move-object/from16 v46, v27

    .line 1582
    .line 1583
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 1584
    .line 1585
    move-object v2, v1

    .line 1586
    move-object/from16 v2, v17

    .line 1587
    .line 1588
    goto/16 :goto_14

    .line 1589
    .line 1590
    :catchall_2
    move-exception v0

    .line 1591
    move-object/from16 v21, v11

    .line 1592
    .line 1593
    goto :goto_27

    .line 1594
    :cond_2f
    move-wide/from16 v23, v3

    .line 1595
    .line 1596
    move-object/from16 v46, v8

    .line 1597
    .line 1598
    move-object/from16 v21, v11

    .line 1599
    .line 1600
    move-object v0, v12

    .line 1601
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1602
    .line 1603
    .line 1604
    move-result-wide v1

    .line 1605
    sub-long v1, v1, v23

    .line 1606
    .line 1607
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1608
    .line 1609
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1610
    .line 1611
    .line 1612
    const-string v4, "CameraViewModule::getAvailableCameraDevices took: "

    .line 1613
    .line 1614
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1615
    .line 1616
    .line 1617
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1618
    .line 1619
    .line 1620
    const-string v1, " ms"

    .line 1621
    .line 1622
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1623
    .line 1624
    .line 1625
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    move-object/from16 v2, v46

    .line 1630
    .line 1631
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 1632
    .line 1633
    .line 1634
    move-object/from16 v11, v21

    .line 1635
    .line 1636
    :try_start_c
    invoke-interface {v11, v0}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 1637
    .line 1638
    .line 1639
    goto :goto_29

    .line 1640
    :catchall_3
    move-exception v0

    .line 1641
    move-object/from16 v11, v21

    .line 1642
    .line 1643
    goto :goto_27

    .line 1644
    :cond_30
    new-instance v0, Lcom/mrousavy/camera/b;

    .line 1645
    .line 1646
    invoke-direct {v0}, Lcom/mrousavy/camera/b;-><init>()V

    .line 1647
    .line 1648
    .line 1649
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 1650
    :catchall_4
    move-exception v0

    .line 1651
    :goto_27
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1652
    .line 1653
    .line 1654
    instance-of v1, v0, Lcom/mrousavy/camera/a;

    .line 1655
    .line 1656
    if-eqz v1, :cond_31

    .line 1657
    .line 1658
    check-cast v0, Lcom/mrousavy/camera/a;

    .line 1659
    .line 1660
    goto :goto_28

    .line 1661
    :cond_31
    new-instance v1, Lcom/mrousavy/camera/j0;

    .line 1662
    .line 1663
    invoke-direct {v1, v0}, Lcom/mrousavy/camera/j0;-><init>(Ljava/lang/Throwable;)V

    .line 1664
    .line 1665
    .line 1666
    move-object v0, v1

    .line 1667
    :goto_28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1668
    .line 1669
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1670
    .line 1671
    .line 1672
    invoke-virtual {v0}, Lcom/mrousavy/camera/a;->a()Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v2

    .line 1676
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1677
    .line 1678
    .line 1679
    const/16 v2, 0x2f

    .line 1680
    .line 1681
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v0}, Lcom/mrousavy/camera/a;->b()Ljava/lang/String;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v2

    .line 1688
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v1

    .line 1695
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v2

    .line 1699
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    invoke-interface {v11, v1, v2, v0}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1704
    .line 1705
    .line 1706
    :goto_29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1707
    .line 1708
    return-object v0
.end method
