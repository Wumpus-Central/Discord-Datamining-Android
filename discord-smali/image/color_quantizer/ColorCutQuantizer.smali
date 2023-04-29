.class public final Lcom/discord/image/color_quantizer/ColorCutQuantizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;,
        Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 &2\u00020\u0001:\u0002&\'B\u0019\u0008\u0002\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0010\u0010\u0015\u001a\u000c\u0012\u0008\u0012\u00060\u0017R\u00020\u00000\u0016H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u001e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0002J\"\u0010\"\u001a\u00020\u00192\u0010\u0010#\u001a\u000c\u0012\u0008\u0012\u00060\u0017R\u00020\u00000$2\u0006\u0010%\u001a\u00020\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006("
    }
    d2 = {
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer;",
        "",
        "colorHistogram",
        "Lcom/discord/image/color_quantizer/ColorHistogram;",
        "maxColors",
        "",
        "(Lcom/discord/image/color_quantizer/ColorHistogram;I)V",
        "mColorPopulations",
        "Landroid/util/SparseIntArray;",
        "mColors",
        "",
        "mQuantizedColors",
        "",
        "Lcom/discord/image/color_quantizer/Swatch;",
        "mTempHsl",
        "",
        "quantizedColors",
        "",
        "getQuantizedColors",
        "()Ljava/util/List;",
        "generateAverageColors",
        "vboxes",
        "",
        "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
        "modifySignificantOctet",
        "",
        "dimension",
        "lowIndex",
        "highIndex",
        "quantizePixels",
        "maxColorIndex",
        "shouldIgnoreColor",
        "",
        "color",
        "splitBoxes",
        "queue",
        "Ljava/util/PriorityQueue;",
        "maxSize",
        "Companion",
        "Vbox",
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


# static fields
.field private static final BLACK_MAX_LIGHTNESS:F = 0.05f

.field private static final COMPONENT_BLUE:I = -0x1

.field private static final COMPONENT_GREEN:I = -0x2

.field private static final COMPONENT_RED:I = -0x3

.field public static final Companion:Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

.field private static final VBOX_COMPARATOR_VOLUME:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
            ">;"
        }
    .end annotation
.end field

.field private static final WHITE_MIN_LIGHTNESS:F = 0.95f


# instance fields
.field private final mColorPopulations:Landroid/util/SparseIntArray;

.field private final mColors:[I

.field private final mQuantizedColors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation
.end field

.field private final mTempHsl:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->Companion:Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

    .line 8
    .line 9
    new-instance v0, Lcom/discord/image/color_quantizer/a;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/discord/image/color_quantizer/a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->VBOX_COMPARATOR_VOLUME:Ljava/util/Comparator;

    .line 15
    .line 16
    return-void
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
.end method

.method private constructor <init>(Lcom/discord/image/color_quantizer/ColorHistogram;I)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    new-array v0, v0, [F

    .line 6
    .line 7
    iput-object v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mTempHsl:[F

    .line 8
    .line 9
    if-eqz p1, :cond_7

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-lt p2, v1, :cond_0

    .line 14
    .line 15
    move v2, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v0

    .line 18
    :goto_0
    if-eqz v2, :cond_6

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/ColorHistogram;->getNumberOfColors()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/ColorHistogram;->getColors()[I

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/ColorHistogram;->getColorCounts()[I

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v4, Landroid/util/SparseIntArray;

    .line 33
    .line 34
    invoke-direct {v4, v2}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColorPopulations:Landroid/util/SparseIntArray;

    .line 38
    .line 39
    array-length v4, v3

    .line 40
    move v5, v0

    .line 41
    :goto_1
    if-ge v5, v4, :cond_1

    .line 42
    .line 43
    iget-object v6, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColorPopulations:Landroid/util/SparseIntArray;

    .line 44
    .line 45
    aget v7, v3, v5

    .line 46
    .line 47
    aget v8, p1, v5

    .line 48
    .line 49
    invoke-virtual {v6, v7, v8}, Landroid/util/SparseIntArray;->append(II)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-array p1, v2, [I

    .line 56
    .line 57
    iput-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    .line 58
    .line 59
    array-length p1, v3

    .line 60
    move v2, v0

    .line 61
    move v4, v2

    .line 62
    :goto_2
    if-ge v2, p1, :cond_3

    .line 63
    .line 64
    aget v5, v3, v2

    .line 65
    .line 66
    invoke-direct {p0, v5}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->shouldIgnoreColor(I)Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-nez v6, :cond_2

    .line 71
    .line 72
    iget-object v6, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    .line 73
    .line 74
    add-int/lit8 v7, v4, 0x1

    .line 75
    .line 76
    aput v5, v6, v4

    .line 77
    .line 78
    move v4, v7

    .line 79
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    if-gt v4, p2, :cond_4

    .line 83
    .line 84
    new-instance p1, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mQuantizedColors:Ljava/util/List;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    .line 92
    .line 93
    array-length p2, p1

    .line 94
    :goto_3
    if-ge v0, p2, :cond_5

    .line 95
    .line 96
    aget v1, p1, v0

    .line 97
    .line 98
    iget-object v2, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mQuantizedColors:Ljava/util/List;

    .line 99
    .line 100
    new-instance v3, Lcom/discord/image/color_quantizer/Swatch;

    .line 101
    .line 102
    iget-object v4, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColorPopulations:Landroid/util/SparseIntArray;

    .line 103
    .line 104
    invoke-virtual {v4, v1}, Landroid/util/SparseIntArray;->get(I)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-direct {v3, v1, v4}, Lcom/discord/image/color_quantizer/Swatch;-><init>(II)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    add-int/lit8 v0, v0, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    sub-int/2addr v4, v1

    .line 118
    invoke-direct {p0, v4, p2}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->quantizePixels(II)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mQuantizedColors:Ljava/util/List;

    .line 123
    .line 124
    :cond_5
    return-void

    .line 125
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 126
    .line 127
    const-string p2, "maxColors must be 1 or greater"

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p1

    .line 137
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 138
    .line 139
    const-string p2, "colorHistogram can not be null"

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1
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

.method public synthetic constructor <init>(Lcom/discord/image/color_quantizer/ColorHistogram;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;-><init>(Lcom/discord/image/color_quantizer/ColorHistogram;I)V

    return-void
.end method

.method private static final VBOX_COMPARATOR_VOLUME$lambda$2(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;)I
    .locals 0

    invoke-virtual {p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->getVolume()I

    move-result p1

    invoke-virtual {p0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->getVolume()I

    move-result p0

    sub-int/2addr p1, p0

    return p1
.end method

.method public static synthetic a(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->VBOX_COMPARATOR_VOLUME$lambda$2(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getMColorPopulations$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)Landroid/util/SparseIntArray;
    .locals 0

    iget-object p0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColorPopulations:Landroid/util/SparseIntArray;

    return-object p0
.end method

.method public static final synthetic access$getMColors$p(Lcom/discord/image/color_quantizer/ColorCutQuantizer;)[I
    .locals 0

    iget-object p0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    return-object p0
.end method

.method public static final synthetic access$modifySignificantOctet(Lcom/discord/image/color_quantizer/ColorCutQuantizer;III)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->modifySignificantOctet(III)V

    return-void
.end method

.method public static final fromBitmap(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/ColorCutQuantizer;
    .locals 1

    sget-object v0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->Companion:Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->fromBitmap(Landroid/graphics/Bitmap;I)Lcom/discord/image/color_quantizer/ColorCutQuantizer;

    move-result-object p0

    return-object p0
.end method

.method private final generateAverageColors(Ljava/util/Collection;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->getAverageColor()Lcom/discord/image/color_quantizer/Swatch;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->Companion:Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

    .line 31
    .line 32
    invoke-static {v2, v1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->access$shouldIgnoreColor(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;Lcom/discord/image/color_quantizer/Swatch;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-object v0
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
.end method

.method private final modifySignificantOctet(III)V
    .locals 3

    .line 1
    const/4 v0, -0x2

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    :goto_0
    if-gt p2, p3, :cond_2

    .line 9
    .line 10
    iget-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    .line 11
    .line 12
    aget v0, p1, p2

    .line 13
    .line 14
    and-int/lit16 v1, v0, 0xff

    .line 15
    .line 16
    shr-int/lit8 v2, v0, 0x8

    .line 17
    .line 18
    and-int/lit16 v2, v2, 0xff

    .line 19
    .line 20
    shr-int/lit8 v0, v0, 0x10

    .line 21
    .line 22
    and-int/lit16 v0, v0, 0xff

    .line 23
    .line 24
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    aput v0, p1, p2

    .line 29
    .line 30
    add-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    if-gt p2, p3, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mColors:[I

    .line 36
    .line 37
    aget v0, p1, p2

    .line 38
    .line 39
    shr-int/lit8 v1, v0, 0x8

    .line 40
    .line 41
    and-int/lit16 v1, v1, 0xff

    .line 42
    .line 43
    shr-int/lit8 v2, v0, 0x10

    .line 44
    .line 45
    and-int/lit16 v2, v2, 0xff

    .line 46
    .line 47
    and-int/lit16 v0, v0, 0xff

    .line 48
    .line 49
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    aput v0, p1, p2

    .line 54
    .line 55
    add-int/lit8 p2, p2, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_2
    return-void
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
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
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
.end method

.method private final quantizePixels(II)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/PriorityQueue;

    .line 2
    .line 3
    sget-object v1, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->VBOX_COMPARATOR_VOLUME:Ljava/util/Comparator;

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, v2, p1}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;-><init>(Lcom/discord/image/color_quantizer/ColorCutQuantizer;II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0, p2}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->splitBoxes(Ljava/util/PriorityQueue;I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->generateAverageColors(Ljava/util/Collection;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
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

.method private final shouldIgnoreColor(I)Z
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v3, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mTempHsl:[F

    .line 18
    .line 19
    invoke-static {v1, v2, p1, v3}, Lcom/discord/image/color_quantizer/ColorUtils;->RGBtoHSL(III[F)V

    .line 20
    .line 21
    .line 22
    const/16 p1, 0xfa

    .line 23
    .line 24
    if-lt v0, p1, :cond_1

    .line 25
    .line 26
    sget-object p1, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->Companion:Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mTempHsl:[F

    .line 29
    .line 30
    invoke-static {p1, v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;->access$shouldIgnoreColor(Lcom/discord/image/color_quantizer/ColorCutQuantizer$Companion;[F)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p1, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 40
    :goto_1
    return p1
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
.end method

.method private final splitBoxes(Ljava/util/PriorityQueue;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/PriorityQueue<",
            "Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;",
            ">;I)V"
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ge v0, p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->canSplit()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;->splitBox()Lcom/discord/image/color_quantizer/ColorCutQuantizer$Vbox;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p1, v1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
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


# virtual methods
.method public final getQuantizedColors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/discord/image/color_quantizer/Swatch;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/discord/image/color_quantizer/ColorCutQuantizer;->mQuantizedColors:Ljava/util/List;

    return-object v0
.end method
