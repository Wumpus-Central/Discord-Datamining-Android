.class final Lcom/mrousavy/camera/CameraView$f;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/CameraView;->v(Ljava/util/ArrayList;)Z
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
    c = "com.mrousavy.camera.CameraView$update$1$1"
    f = "CameraView.kt"
    l = {
        0x149
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field k:I

.field l:I

.field m:I

.field n:I

.field final synthetic o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic p:Lcom/mrousavy/camera/CameraView;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/mrousavy/camera/CameraView;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/mrousavy/camera/CameraView$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

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

    new-instance p1, Lcom/mrousavy/camera/CameraView$f;

    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    invoke-direct {p1, v0, v1, p2}, Lcom/mrousavy/camera/CameraView$f;-><init>(Ljava/util/ArrayList;Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraView$f;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/mrousavy/camera/CameraView$f;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/mrousavy/camera/CameraView$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/mrousavy/camera/CameraView$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Lrf/b;->d()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/mrousavy/camera/CameraView$f;->n:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lcom/mrousavy/camera/CameraView$f;->m:I

    .line 13
    .line 14
    iget v1, p0, Lcom/mrousavy/camera/CameraView$f;->l:I

    .line 15
    .line 16
    iget v2, p0, Lcom/mrousavy/camera/CameraView$f;->k:I

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    invoke-static {p1}, Llf/t;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :try_start_1
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {}, Lcom/mrousavy/camera/CameraView;->k()Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {p1, v1}, Lse/n;->a(Ljava/util/List;Ljava/util/List;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/4 v1, 0x0

    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    iget-object v3, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    .line 48
    .line 49
    const-string v4, "zoom"

    .line 50
    .line 51
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move v3, v1

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    move v3, v2

    .line 61
    :goto_1
    if-nez p1, :cond_5

    .line 62
    .line 63
    iget-object v4, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    .line 64
    .line 65
    const-string v5, "torch"

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move v4, v1

    .line 75
    goto :goto_3

    .line 76
    :cond_5
    :goto_2
    move v4, v2

    .line 77
    :goto_3
    if-nez p1, :cond_6

    .line 78
    .line 79
    iget-object v5, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    .line 80
    .line 81
    const-string v6, "orientation"

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_7

    .line 88
    .line 89
    :cond_6
    move v1, v2

    .line 90
    :cond_7
    iget-object v5, p0, Lcom/mrousavy/camera/CameraView$f;->o:Ljava/util/ArrayList;

    .line 91
    .line 92
    const-string v6, "isActive"

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_8

    .line 99
    .line 100
    iget-object v5, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 101
    .line 102
    invoke-static {v5}, Lcom/mrousavy/camera/CameraView;->o(Lcom/mrousavy/camera/CameraView;)V

    .line 103
    .line 104
    .line 105
    :cond_8
    if-eqz p1, :cond_a

    .line 106
    .line 107
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 108
    .line 109
    iput v3, p0, Lcom/mrousavy/camera/CameraView$f;->k:I

    .line 110
    .line 111
    iput v4, p0, Lcom/mrousavy/camera/CameraView$f;->l:I

    .line 112
    .line 113
    iput v1, p0, Lcom/mrousavy/camera/CameraView$f;->m:I

    .line 114
    .line 115
    iput v2, p0, Lcom/mrousavy/camera/CameraView$f;->n:I

    .line 116
    .line 117
    invoke-static {p1, p0}, Lcom/mrousavy/camera/CameraView;->e(Lcom/mrousavy/camera/CameraView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v0, :cond_9

    .line 122
    .line 123
    return-object v0

    .line 124
    :cond_9
    move v0, v1

    .line 125
    move v2, v3

    .line 126
    move v1, v4

    .line 127
    :goto_4
    move v4, v1

    .line 128
    move v3, v2

    .line 129
    move v1, v0

    .line 130
    :cond_a
    if-eqz v3, :cond_b

    .line 131
    .line 132
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/mrousavy/camera/CameraView;->getZoom()F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 139
    .line 140
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->i(Lcom/mrousavy/camera/CameraView;)F

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 149
    .line 150
    invoke-static {v0}, Lcom/mrousavy/camera/CameraView;->j(Lcom/mrousavy/camera/CameraView;)F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-interface {v0}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-interface {v0, p1}, Landroidx/camera/core/m;->c(F)Lfc/b;

    .line 172
    .line 173
    .line 174
    :cond_b
    if-eqz v4, :cond_c

    .line 175
    .line 176
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p1}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 190
    .line 191
    invoke-virtual {v0}, Lcom/mrousavy/camera/CameraView;->getTorch()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    const-string v2, "on"

    .line 196
    .line 197
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-interface {p1, v0}, Landroidx/camera/core/m;->f(Z)Lfc/b;

    .line 202
    .line 203
    .line 204
    :cond_c
    if-eqz v1, :cond_d

    .line 205
    .line 206
    iget-object p1, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 207
    .line 208
    invoke-static {p1}, Lcom/mrousavy/camera/CameraView;->p(Lcom/mrousavy/camera/CameraView;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :catchall_0
    move-exception p1

    .line 213
    new-instance v0, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string v1, "update() threw: "

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    const-string v1, "CameraView"

    .line 235
    .line 236
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    iget-object v0, p0, Lcom/mrousavy/camera/CameraView$f;->p:Lcom/mrousavy/camera/CameraView;

    .line 240
    .line 241
    invoke-static {v0, p1}, Lcom/mrousavy/camera/m;->b(Lcom/mrousavy/camera/CameraView;Ljava/lang/Throwable;)V

    .line 242
    .line 243
    .line 244
    :cond_d
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p1
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
.end method
