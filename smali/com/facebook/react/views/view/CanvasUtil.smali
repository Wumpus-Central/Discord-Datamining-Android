.class public Lcom/facebook/react/views/view/CanvasUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static mInorderBarrierMethod:Ljava/lang/reflect/Method; = null

.field private static mOrderMethodsFetched:Z = false

.field private static mReorderBarrierMethod:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableZ(Landroid/graphics/Canvas;Z)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SoonBlockedPrivateApi",
            "PrivateApi"
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Landroidx/transition/c;->a(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p0}, Landroidx/transition/d;->a(Landroid/graphics/Canvas;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-static {}, Lcom/facebook/react/views/view/CanvasUtil;->fetchOrderMethods()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    :try_start_0
    sget-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mReorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    new-array v2, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_2
    if-nez p1, :cond_3

    .line 33
    .line 34
    sget-object p1, Lcom/facebook/react/views/view/CanvasUtil;->mInorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    new-array v0, v0, [Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    :catch_0
    :cond_3
    :goto_0
    return-void
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
.end method

.method private static fetchOrderMethods()V
    .locals 10

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/view/CanvasUtil;->mOrderMethodsFetched:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    const-string v3, "insertInorderBarrier"

    .line 11
    .line 12
    const-string v4, "insertReorderBarrier"

    .line 13
    .line 14
    const-class v5, Landroid/graphics/Canvas;

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    :try_start_1
    const-class v1, Ljava/lang/Class;

    .line 20
    .line 21
    const-string v2, "getDeclaredMethod"

    .line 22
    .line 23
    const/4 v7, 0x2

    .line 24
    new-array v8, v7, [Ljava/lang/Class;

    .line 25
    .line 26
    const-class v9, Ljava/lang/String;

    .line 27
    .line 28
    aput-object v9, v8, v6

    .line 29
    .line 30
    const-class v9, [Ljava/lang/Class;

    .line 31
    .line 32
    aput-object v9, v8, v0

    .line 33
    .line 34
    invoke-virtual {v1, v2, v8}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-array v2, v7, [Ljava/lang/Object;

    .line 39
    .line 40
    aput-object v4, v2, v6

    .line 41
    .line 42
    new-array v4, v6, [Ljava/lang/Class;

    .line 43
    .line 44
    aput-object v4, v2, v0

    .line 45
    .line 46
    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    sput-object v2, Lcom/facebook/react/views/view/CanvasUtil;->mReorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    new-array v2, v7, [Ljava/lang/Object;

    .line 55
    .line 56
    aput-object v3, v2, v6

    .line 57
    .line 58
    new-array v3, v6, [Ljava/lang/Class;

    .line 59
    .line 60
    aput-object v3, v2, v0

    .line 61
    .line 62
    invoke-virtual {v1, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    sput-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mInorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-array v1, v6, [Ljava/lang/Class;

    .line 72
    .line 73
    invoke-virtual {v5, v4, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sput-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mReorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 78
    .line 79
    new-array v1, v6, [Ljava/lang/Class;

    .line 80
    .line 81
    invoke-virtual {v5, v3, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    sput-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mInorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 86
    .line 87
    :goto_0
    sget-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mReorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    if-eqz v1, :cond_2

    .line 90
    .line 91
    sget-object v2, Lcom/facebook/react/views/view/CanvasUtil;->mInorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 92
    .line 93
    if-nez v2, :cond_1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 97
    .line 98
    .line 99
    sget-object v1, Lcom/facebook/react/views/view/CanvasUtil;->mInorderBarrierMethod:Ljava/lang/reflect/Method;

    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    :goto_1
    return-void

    .line 106
    :catch_0
    :goto_2
    sput-boolean v0, Lcom/facebook/react/views/view/CanvasUtil;->mOrderMethodsFetched:Z

    .line 107
    .line 108
    :cond_3
    return-void
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
.end method
