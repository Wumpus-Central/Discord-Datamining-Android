.class public final Lcom/mrousavy/camera/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mrousavy/camera/o;->c(Lcom/mrousavy/camera/CameraView;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/core/util/b<",
        "Li0/i1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/mrousavy/camera/o$a",
        "Landroidx/core/util/b;",
        "Li0/i1;",
        "event",
        "",
        "a",
        "react-native-vision-camera_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/bridge/Callback;

.field final synthetic b:Lcom/mrousavy/camera/CameraView;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/Callback;Lcom/mrousavy/camera/CameraView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mrousavy/camera/o$a;->a:Lcom/facebook/react/bridge/Callback;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mrousavy/camera/o$a;->b:Lcom/mrousavy/camera/CameraView;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 47
.end method


# virtual methods
.method public a(Li0/i1;)V
    .locals 11

    .line 1
    instance-of v0, p1, Li0/i1$a;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Li0/i1$a;

    .line 6
    .line 7
    invoke-virtual {p1}, Li0/i1$a;->l()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x2

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Li0/i1$a;->j()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/mrousavy/camera/j0;

    .line 25
    .line 26
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/j0;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_0
    new-instance v0, Lcom/mrousavy/camera/f0;

    .line 35
    .line 36
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/f0;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    new-instance v0, Lcom/mrousavy/camera/i0;

    .line 45
    .line 46
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/i0;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :pswitch_2
    new-instance v0, Lcom/mrousavy/camera/k0;

    .line 55
    .line 56
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/k0;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_3
    new-instance v0, Lcom/mrousavy/camera/a0;

    .line 65
    .line 66
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/a0;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_4
    new-instance v0, Lcom/mrousavy/camera/v;

    .line 75
    .line 76
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/v;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_5
    new-instance v0, Lcom/mrousavy/camera/w;

    .line 85
    .line 86
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/w;-><init>(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :pswitch_6
    new-instance v0, Lcom/mrousavy/camera/s;

    .line 95
    .line 96
    invoke-virtual {p1}, Li0/i1$a;->i()Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-direct {v0, p1}, Lcom/mrousavy/camera/s;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    :goto_0
    move-object v7, v0

    .line 104
    new-instance p1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7}, Lcom/mrousavy/camera/a;->a()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const/16 v0, 0x2f

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Lcom/mrousavy/camera/a;->b()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    const/4 v8, 0x0

    .line 137
    const/16 v9, 0x8

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    invoke-static/range {v5 .. v10}, Lse/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;ILjava/lang/Object;)Lcom/facebook/react/bridge/ReadableMap;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget-object v0, p0, Lcom/mrousavy/camera/o$a;->a:Lcom/facebook/react/bridge/Callback;

    .line 145
    .line 146
    new-array v4, v4, [Ljava/lang/Object;

    .line 147
    .line 148
    aput-object v1, v4, v3

    .line 149
    .line 150
    aput-object p1, v4, v2

    .line 151
    .line 152
    invoke-interface {v0, v4}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1}, Li0/i1$a;->k()Li0/t;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-virtual {v5}, Li0/t;->a()Landroid/net/Uri;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    const-string v6, "path"

    .line 173
    .line 174
    invoke-interface {v0, v6, v5}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Li0/i1;->d()Li0/y0;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-virtual {v5}, Li0/y0;->c()J

    .line 182
    .line 183
    .line 184
    move-result-wide v5

    .line 185
    long-to-double v5, v5

    .line 186
    const-wide v7, 0x412e848000000000L    # 1000000.0

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    div-double/2addr v5, v7

    .line 192
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    div-double/2addr v5, v7

    .line 198
    const-string v9, "duration"

    .line 199
    .line 200
    invoke-interface {v0, v9, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Li0/i1;->d()Li0/y0;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-virtual {p1}, Li0/y0;->b()J

    .line 208
    .line 209
    .line 210
    move-result-wide v5

    .line 211
    long-to-double v5, v5

    .line 212
    div-double/2addr v5, v7

    .line 213
    const-string p1, "size"

    .line 214
    .line 215
    invoke-interface {v0, p1, v5, v6}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 216
    .line 217
    .line 218
    iget-object p1, p0, Lcom/mrousavy/camera/o$a;->a:Lcom/facebook/react/bridge/Callback;

    .line 219
    .line 220
    new-array v4, v4, [Ljava/lang/Object;

    .line 221
    .line 222
    aput-object v0, v4, v3

    .line 223
    .line 224
    aput-object v1, v4, v2

    .line 225
    .line 226
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    :goto_1
    iget-object p1, p0, Lcom/mrousavy/camera/o$a;->b:Lcom/mrousavy/camera/CameraView;

    .line 230
    .line 231
    invoke-virtual {p1}, Lcom/mrousavy/camera/CameraView;->getCamera$react_native_vision_camera_release()Landroidx/camera/core/k;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-static {p1}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p1}, Landroidx/camera/core/k;->b()Landroidx/camera/core/m;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    iget-object v0, p0, Lcom/mrousavy/camera/o$a;->b:Lcom/mrousavy/camera/CameraView;

    .line 243
    .line 244
    invoke-virtual {v0}, Lcom/mrousavy/camera/CameraView;->getTorch()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v1, "on"

    .line 249
    .line 250
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-interface {p1, v0}, Landroidx/camera/core/m;->f(Z)Lfc/b;

    .line 255
    .line 256
    .line 257
    :cond_1
    return-void

    .line 258
    nop

    .line 259
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li0/i1;

    invoke-virtual {p0, p1}, Lcom/mrousavy/camera/o$a;->a(Li0/i1;)V

    return-void
.end method
