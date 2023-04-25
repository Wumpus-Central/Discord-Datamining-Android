.class public final Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000c\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;",
        "",
        "Lcom/th3rdwave/safeareacontext/EdgeInsets;",
        "Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;",
        "d",
        "Landroid/view/View;",
        "view",
        "b",
        "c",
        "<init>",
        "()V",
        "SafeAreaEdgeInsets",
        "safe_area_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;

    invoke-direct {v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;-><init>()V

    sput-object v0, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;->a:Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;Lcom/th3rdwave/safeareacontext/EdgeInsets;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    .locals 0

    invoke-direct {p0, p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;->d(Lcom/th3rdwave/safeareacontext/EdgeInsets;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lcom/th3rdwave/safeareacontext/EdgeInsets;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    .locals 4

    .line 1
    new-instance v0, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 2
    .line 3
    iget v1, p1, Lcom/th3rdwave/safeareacontext/EdgeInsets;->a:F

    .line 4
    .line 5
    float-to-int v1, v1

    .line 6
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget v2, p1, Lcom/th3rdwave/safeareacontext/EdgeInsets;->b:F

    .line 11
    .line 12
    float-to-int v2, v2

    .line 13
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget v3, p1, Lcom/th3rdwave/safeareacontext/EdgeInsets;->c:F

    .line 18
    .line 19
    float-to-int v3, v3

    .line 20
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    iget p1, p1, Lcom/th3rdwave/safeareacontext/EdgeInsets;->d:F

    .line 25
    .line 26
    float-to-int p1, p1

    .line 27
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {v0, v1, v2, v3, p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;-><init>(FFFF)V

    .line 32
    .line 33
    .line 34
    return-object v0
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
.end method


# virtual methods
.method public final b(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/th3rdwave/safeareacontext/c;->c(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/EdgeInsets;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils;->d(Lcom/th3rdwave/safeareacontext/EdgeInsets;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    :goto_0
    return-object p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final c(Landroid/view/View;)Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;
    .locals 5

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Landroidx/core/view/WindowInsetsCompat;->y(Landroid/view/WindowInsets;)Landroidx/core/view/WindowInsetsCompat;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "toWindowInsetsCompat(view.rootWindowInsets)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->a()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->g(I)Landroidx/core/graphics/Insets;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "insets.getInsetsIgnoring\u2026pat.Type.displayCutout())"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget v1, v0, Landroidx/core/graphics/Insets;->b:I

    .line 33
    .line 34
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget v2, v0, Landroidx/core/graphics/Insets;->d:I

    .line 39
    .line 40
    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    iget v3, v0, Landroidx/core/graphics/Insets;->a:I

    .line 45
    .line 46
    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget v0, v0, Landroidx/core/graphics/Insets;->c:I

    .line 51
    .line 52
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    new-instance v4, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;

    .line 57
    .line 58
    invoke-direct {v4, v1, v0, v2, v3}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v1, 0x1d

    .line 64
    .line 65
    if-le v0, v1, :cond_0

    .line 66
    .line 67
    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$m;->g()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsCompat;->g(I)Landroidx/core/graphics/Insets;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const-string v0, "insets.getInsetsIgnoring\u2026Compat.Type.systemBars())"

    .line 76
    .line 77
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->d()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget v1, p1, Landroidx/core/graphics/Insets;->b:I

    .line 85
    .line 86
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {v4, v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->f(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->a()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget p1, p1, Landroidx/core/graphics/Insets;->d:I

    .line 102
    .line 103
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    invoke-virtual {v4, p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->e(F)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    invoke-virtual {v4}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->d()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->i()I

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-virtual {v4, v0}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->f(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->a()F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {p1}, Landroidx/core/view/WindowInsetsCompat;->h()I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    invoke-virtual {v4, p1}, Lcom/th3rdwave/safeareacontext/DCDSafeAreaUtils$SafeAreaEdgeInsets;->e(F)V

    .line 151
    .line 152
    .line 153
    :goto_0
    return-object v4
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
.end method
