.class public final Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/discord/image/color_quantizer/ColorCutQuantizer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u000c\u0012\u0008\u0012\u00060\u000bR\u00020\u000c0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;",
        "",
        "()V",
        "BLACK_MAX_LIGHTNESS",
        "",
        "COMPONENT_BLUE",
        "",
        "COMPONENT_GREEN",
        "COMPONENT_RED",
        "VBOX_COMPARATOR_VOLUME",
        "Ljava/util/Comparator;",
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer;",
        "WHITE_MIN_LIGHTNESS",
        "fromBitmap",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "maxColors",
        "isBlack",
        "",
        "hslColor",
        "",
        "isNearRedILine",
        "isWhite",
        "shouldIgnoreColor",
        "color",
        "Lcom/discord/image/color_quantizer/Swatch;",
        "color_quantizer_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$shouldIgnoreColor(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;Lcom/discord/image/color_quantizer/Swatch;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->shouldIgnoreColor(Lcom/discord/image/color_quantizer/Swatch;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$shouldIgnoreColor(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;[F)Z
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->shouldIgnoreColor([F)Z

    move-result p0

    return p0
.end method

.method private final isBlack([F)Z
    .locals 1

    const/4 v0, 0x2

    aget p1, p1, v0

    const v0, 0x3d4ccccd    # 0.05f

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isNearRedILine([F)Z
    .locals 4

    const/4 v0, 0x0

    aget v1, p1, v0

    const/high16 v2, 0x41200000    # 10.0f

    cmpg-float v2, v2, v1

    const/4 v3, 0x1

    if-gtz v2, :cond_0

    const/high16 v2, 0x42140000    # 37.0f

    cmpg-float v1, v1, v2

    if-gtz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    if-eqz v1, :cond_1

    aget p1, p1, v3

    const v1, 0x3f51eb85    # 0.82f

    cmpg-float p1, p1, v1

    if-gtz p1, :cond_1

    move v0, v3

    :cond_1
    return v0
.end method

.method private final isWhite([F)Z
    .locals 1

    const/4 v0, 0x2

    aget p1, p1, v0

    const v0, 0x3f733333    # 0.95f

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final shouldIgnoreColor(Lcom/discord/image/color_quantizer/Swatch;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/Swatch;->getHsl()[F

    move-result-object p1

    const-string v0, "color.hsl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->shouldIgnoreColor([F)Z

    move-result p1

    return p1
.end method

.method private final shouldIgnoreColor([F)Z
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->isWhite([F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->isBlack([F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->isNearRedILine([F)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public final fromBitmap(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/ColorCutQuantizer;
    .locals 9

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v7

    .line 10
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    mul-int v0, v7, v8

    .line 15
    .line 16
    new-array v0, v0, [I

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p1

    .line 22
    move-object v2, v0

    .line 23
    move v4, v7

    .line 24
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    .line 28
    .line 29
    new-instance v1, Lcom/discord/image/color_quantizer/ColorHistogram;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lcom/discord/image/color_quantizer/ColorHistogram;-><init>([I)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p1, v1, p2, v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;-><init>(Lcom/discord/image/color_quantizer/ColorHistogram;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 36
    .line 37
    .line 38
    return-object p1
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
.end method