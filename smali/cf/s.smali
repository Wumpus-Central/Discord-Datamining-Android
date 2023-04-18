.class public final Lcf/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcf/s$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u0015\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\nR\u0016\u0010\u000f\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00128\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0018R$\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001b\u001a\u0004\u0008\r\u0010\u001cR$\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001a8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001b\u001a\u0004\u0008\u0010\u0010\u001cR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0011\u0010\'\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010&\u00a8\u0006*"
    }
    d2 = {
        "Lcf/s;",
        "",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "g",
        "a",
        "",
        "f",
        "Lcf/s$a;",
        "Lcf/s$a;",
        "gestureListener",
        "",
        "b",
        "J",
        "currentTime",
        "c",
        "previousTime",
        "",
        "d",
        "D",
        "previousAngle",
        "<set-?>",
        "e",
        "()D",
        "rotation",
        "",
        "F",
        "()F",
        "anchorX",
        "anchorY",
        "h",
        "Z",
        "isInProgress",
        "",
        "i",
        "[I",
        "pointerIds",
        "()J",
        "timeDelta",
        "<init>",
        "(Lcf/s$a;)V",
        "react-native-gesture-handler_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final a:Lcf/s$a;

.field private b:J

.field private c:J

.field private d:D

.field private e:D

.field private f:F

.field private g:F

.field private h:Z

.field private final i:[I


# direct methods
.method public constructor <init>(Lcf/s$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcf/s;->a:Lcf/s$a;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    new-array p1, p1, [I

    .line 8
    .line 9
    iput-object p1, p0, Lcf/s;->i:[I

    .line 10
    .line 11
    return-void
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
.end method

.method private final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcf/s;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcf/s;->h:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcf/s;->a:Lcf/s$a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {v0, p0}, Lcf/s$a;->c(Lcf/s;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private final g(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcf/s;->b:J

    .line 2
    .line 3
    iput-wide v0, p0, Lcf/s;->c:J

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iput-wide v0, p0, Lcf/s;->b:J

    .line 10
    .line 11
    iget-object v0, p0, Lcf/s;->i:[I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    aget v0, v0, v1

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcf/s;->i:[I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget v1, v1, v2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    sub-float v1, v3, v2

    .line 46
    .line 47
    sub-float v4, p1, v0

    .line 48
    .line 49
    add-float/2addr v2, v3

    .line 50
    const/high16 v3, 0x3f000000    # 0.5f

    .line 51
    .line 52
    mul-float/2addr v2, v3

    .line 53
    iput v2, p0, Lcf/s;->f:F

    .line 54
    .line 55
    add-float/2addr v0, p1

    .line 56
    mul-float/2addr v0, v3

    .line 57
    iput v0, p0, Lcf/s;->g:F

    .line 58
    .line 59
    float-to-double v2, v4

    .line 60
    float-to-double v0, v1

    .line 61
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    neg-double v0, v0

    .line 66
    iget-wide v2, p0, Lcf/s;->d:D

    .line 67
    .line 68
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_0

    .line 73
    .line 74
    const-wide/16 v2, 0x0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-wide v2, p0, Lcf/s;->d:D

    .line 78
    .line 79
    sub-double/2addr v2, v0

    .line 80
    :goto_0
    iput-wide v2, p0, Lcf/s;->e:D

    .line 81
    .line 82
    iput-wide v0, p0, Lcf/s;->d:D

    .line 83
    .line 84
    const-wide v0, 0x400921fb54442d18L    # Math.PI

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    cmpl-double p1, v2, v0

    .line 90
    .line 91
    if-lez p1, :cond_1

    .line 92
    .line 93
    sub-double/2addr v2, v0

    .line 94
    iput-wide v2, p0, Lcf/s;->e:D

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    const-wide v4, -0x3ff6de04abbbd2e8L    # -3.141592653589793

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    cmpg-double p1, v2, v4

    .line 103
    .line 104
    if-gez p1, :cond_2

    .line 105
    .line 106
    add-double/2addr v2, v0

    .line 107
    iput-wide v2, p0, Lcf/s;->e:D

    .line 108
    .line 109
    :cond_2
    :goto_1
    iget-wide v2, p0, Lcf/s;->e:D

    .line 110
    .line 111
    const-wide v4, 0x3ff921fb54442d18L    # 1.5707963267948966

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    cmpl-double p1, v2, v4

    .line 117
    .line 118
    if-lez p1, :cond_3

    .line 119
    .line 120
    sub-double/2addr v2, v0

    .line 121
    iput-wide v2, p0, Lcf/s;->e:D

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    const-wide v4, -0x4006de04abbbd2e8L    # -1.5707963267948966

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    cmpg-double p1, v2, v4

    .line 130
    .line 131
    if-gez p1, :cond_4

    .line 132
    .line 133
    add-double/2addr v2, v0

    .line 134
    iput-wide v2, p0, Lcf/s;->e:D

    .line 135
    .line 136
    :cond_4
    :goto_2
    return-void
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
.end method


# virtual methods
.method public final b()F
    .locals 1

    iget v0, p0, Lcf/s;->f:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lcf/s;->g:F

    return v0
.end method

.method public final d()D
    .locals 2

    iget-wide v0, p0, Lcf/s;->e:D

    return-wide v0
.end method

.method public final e()J
    .locals 4

    iget-wide v0, p0, Lcf/s;->b:J

    iget-wide v2, p0, Lcf/s;->c:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public final f(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    if-eq v0, v2, :cond_4

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    if-eq v0, v3, :cond_3

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x6

    .line 23
    if-eq v0, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-boolean v0, p0, Lcf/s;->h:Z

    .line 27
    .line 28
    if-eqz v0, :cond_6

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget-object v0, p0, Lcf/s;->i:[I

    .line 39
    .line 40
    aget v1, v0, v1

    .line 41
    .line 42
    if-eq p1, v1, :cond_1

    .line 43
    .line 44
    aget v0, v0, v2

    .line 45
    .line 46
    if-ne p1, v0, :cond_6

    .line 47
    .line 48
    :cond_1
    invoke-direct {p0}, Lcf/s;->a()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget-boolean v0, p0, Lcf/s;->h:Z

    .line 53
    .line 54
    if-nez v0, :cond_6

    .line 55
    .line 56
    iget-object v0, p0, Lcf/s;->i:[I

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    aput v1, v0, v2

    .line 67
    .line 68
    iput-boolean v2, p0, Lcf/s;->h:Z

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    iput-wide v0, p0, Lcf/s;->c:J

    .line 75
    .line 76
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 77
    .line 78
    iput-wide v0, p0, Lcf/s;->d:D

    .line 79
    .line 80
    invoke-direct {p0, p1}, Lcf/s;->g(Landroid/view/MotionEvent;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcf/s;->a:Lcf/s$a;

    .line 84
    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    invoke-interface {p1, p0}, Lcf/s$a;->a(Lcf/s;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget-boolean v0, p0, Lcf/s;->h:Z

    .line 92
    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    invoke-direct {p0, p1}, Lcf/s;->g(Landroid/view/MotionEvent;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcf/s;->a:Lcf/s$a;

    .line 99
    .line 100
    if-eqz p1, :cond_6

    .line 101
    .line 102
    invoke-interface {p1, p0}, Lcf/s$a;->b(Lcf/s;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-direct {p0}, Lcf/s;->a()V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    iput-boolean v1, p0, Lcf/s;->h:Z

    .line 111
    .line 112
    iget-object v0, p0, Lcf/s;->i:[I

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    aput p1, v0, v1

    .line 123
    .line 124
    iget-object p1, p0, Lcf/s;->i:[I

    .line 125
    .line 126
    const/4 v0, -0x1

    .line 127
    aput v0, p1, v2

    .line 128
    .line 129
    :cond_6
    :goto_0
    return v2
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
.end method
