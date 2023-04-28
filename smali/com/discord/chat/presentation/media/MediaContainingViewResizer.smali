.class public final Lcom/discord/chat/presentation/media/MediaContainingViewResizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/discord/chat/presentation/media/MediaContainingViewResizer;",
        "",
        "()V",
        "resizeLayoutParams",
        "",
        "Landroid/view/View;",
        "targetWidthPx",
        "",
        "targetHeightPx",
        "maxWidthPx",
        "maxHeightPx",
        "resizeMode",
        "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;",
        "ResizeMode",
        "chat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/discord/chat/presentation/media/MediaContainingViewResizer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;

    invoke-direct {v0}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;-><init>()V

    sput-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;->INSTANCE:Lcom/discord/chat/presentation/media/MediaContainingViewResizer;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic resizeLayoutParams$default(Lcom/discord/chat/presentation/media/MediaContainingViewResizer;Landroid/view/View;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;ILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x10

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p6, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    .line 6
    .line 7
    :cond_0
    move-object v6, p6

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move v2, p2

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move v5, p5

    .line 14
    invoke-virtual/range {v0 .. v6}, Lcom/discord/chat/presentation/media/MediaContainingViewResizer;->resizeLayoutParams(Landroid/view/View;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;)V

    .line 15
    .line 16
    .line 17
    return-void
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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
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
.end method


# virtual methods
.method public final resizeLayoutParams(Landroid/view/View;IIIILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;)V
    .locals 7

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resizeMode"

    .line 7
    .line 8
    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Fill:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p6, v0, :cond_1

    .line 16
    .line 17
    sget-object v0, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Cover:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    .line 18
    .line 19
    if-eq p6, v0, :cond_1

    .line 20
    .line 21
    if-gt p2, p4, :cond_1

    .line 22
    .line 23
    if-le p3, p5, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    move v0, v2

    .line 29
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 38
    .line 39
    const/high16 v4, 0x3f800000    # 1.0f

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    int-to-float p4, p4

    .line 44
    int-to-float v5, p2

    .line 45
    mul-float v6, v5, v3

    .line 46
    .line 47
    invoke-static {p4, v6}, Ljava/lang/Math;->min(FF)F

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    div-float/2addr p4, v5

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move p4, v4

    .line 54
    :goto_2
    if-eqz v0, :cond_3

    .line 55
    .line 56
    int-to-float p5, p5

    .line 57
    int-to-float v0, p3

    .line 58
    mul-float/2addr v3, v0

    .line 59
    invoke-static {p5, v3}, Ljava/lang/Math;->min(FF)F

    .line 60
    .line 61
    .line 62
    move-result p5

    .line 63
    div-float v4, p5, v0

    .line 64
    .line 65
    :cond_3
    invoke-static {v4, p4}, Ljava/lang/Math;->min(FF)F

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    int-to-float p2, p2

    .line 70
    mul-float/2addr p2, p4

    .line 71
    float-to-int p2, p2

    .line 72
    int-to-float p3, p3

    .line 73
    mul-float/2addr p3, p4

    .line 74
    float-to-int p3, p3

    .line 75
    sget-object p4, Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;->Cover:Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;

    .line 76
    .line 77
    if-ne p6, p4, :cond_4

    .line 78
    .line 79
    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    move p3, p2

    .line 84
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    if-eqz p4, :cond_8

    .line 89
    .line 90
    iget p5, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 91
    .line 92
    if-ne p2, p5, :cond_5

    .line 93
    .line 94
    iget p5, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 95
    .line 96
    if-eq p3, p5, :cond_6

    .line 97
    .line 98
    :cond_5
    move v1, v2

    .line 99
    :cond_6
    if-eqz v1, :cond_7

    .line 100
    .line 101
    iput p2, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 102
    .line 103
    iput p3, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 104
    .line 105
    :cond_7
    invoke-virtual {p1, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_8
    new-instance p4, Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    invoke-direct {p4, p2, p3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 115
    .line 116
    .line 117
    :goto_3
    return-void
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
.end method
