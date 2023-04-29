.class public final Lcom/discord/channel_spine/ChannelSpineView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;,
        Lcom/discord/channel_spine/ChannelSpineView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u00012B\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0008\u0010#\u001a\u00020\u0018H\u0002J\u0006\u0010$\u001a\u00020%J \u0010&\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\n2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0014J\u0018\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\nH\u0014J\u0008\u00100\u001a\u00020%H\u0002J\u0018\u00101\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u000c\"\u0004\u0008\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0018@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\u000c\"\u0004\u0008\"\u0010\u000e\u00a8\u00063"
    }
    d2 = {
        "Lcom/discord/channel_spine/ChannelSpineView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "arcRect",
        "Landroid/graphics/RectF;",
        "horizontalPadding",
        "",
        "getHorizontalPadding",
        "()I",
        "setHorizontalPadding",
        "(I)V",
        "isReplySpline",
        "",
        "value",
        "numRows",
        "getNumRows",
        "setNumRows",
        "paths",
        "",
        "Landroid/graphics/Path;",
        "",
        "rowHeight",
        "getRowHeight",
        "()F",
        "setRowHeight",
        "(F)V",
        "spinePaint",
        "Landroid/graphics/Paint;",
        "verticalPadding",
        "getVerticalPadding",
        "setVerticalPadding",
        "arcPercent",
        "configureAsReplySpline",
        "",
        "createSpinePath",
        "rowIndex",
        "direction",
        "Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "rebuildLayout",
        "yOfRow",
        "SpineDirection",
        "channel_spine_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final arcRect:Landroid/graphics/RectF;

.field private horizontalPadding:I

.field private isReplySpline:Z

.field private numRows:I

.field private paths:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/Path;",
            ">;"
        }
    .end annotation
.end field

.field private rowHeight:F

.field private final spinePaint:Landroid/graphics/Paint;

.field private verticalPadding:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/channel_spine/ChannelSpineView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object p1

    invoke-virtual {p1}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    move-result p1

    goto :goto_0

    .line 6
    :cond_0
    sget v0, Lcom/discord/channel_spine/R$color;->primary_500:I

    invoke-static {p1, v0}, Lcom/discord/theme/utils/ColorUtilsKt;->getColorCompat(Landroid/content/Context;I)I

    move-result p1

    .line 7
    :goto_0
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    const/4 p1, 0x1

    .line 8
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 9
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/discord/channel_spine/R$dimen;->spine_width:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 11
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 12
    iput-object p2, p0, Lcom/discord/channel_spine/ChannelSpineView;->spinePaint:Landroid/graphics/Paint;

    const/16 p1, 0x8

    .line 13
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p1

    iput p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    const/4 p1, 0x0

    .line 14
    invoke-static {p1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result p2

    iput p2, p0, Lcom/discord/channel_spine/ChannelSpineView;->horizontalPadding:I

    .line 15
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/discord/channel_spine/ChannelSpineView;->arcRect:Landroid/graphics/RectF;

    .line 16
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/discord/channel_spine/ChannelSpineView;->paths:Ljava/util/List;

    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/channel_spine/ChannelSpineView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/discord/channel_spine/ChannelSpineView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/discord/channel_spine/ChannelSpineView;->configureAsReplySpline$lambda$1(Lcom/discord/channel_spine/ChannelSpineView;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method private final arcPercent()F
    .locals 1

    iget-boolean v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->isReplySpline:Z

    if-eqz v0, :cond_0

    const/high16 v0, 0x3e800000    # 0.25f

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f000000    # 0.5f

    :goto_0
    return v0
.end method

.method private static final configureAsReplySpline$lambda$1(Lcom/discord/channel_spine/ChannelSpineView;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sub-int/2addr p5, p3

    .line 7
    invoke-static {p5}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getPxToDp(I)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/discord/channel_spine/ChannelSpineView;->setRowHeight(F)V

    .line 12
    .line 13
    .line 14
    return-void
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
.end method

.method private final createSpinePath(FILcom/discord/channel_spine/ChannelSpineView$SpineDirection;)Landroid/graphics/Path;
    .locals 8

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/discord/channel_spine/ChannelSpineView;->spinePaint:Landroid/graphics/Paint;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/high16 v2, 0x40000000    # 2.0f

    .line 13
    .line 14
    div-float/2addr v1, v2

    .line 15
    sget-object v2, Lcom/discord/channel_spine/ChannelSpineView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    aget v3, v2, v3

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const/4 v5, 0x1

    .line 25
    if-eq v3, v5, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    add-int/lit8 v3, p2, 0x1

    .line 30
    .line 31
    invoke-direct {p0, p1, v3}, Lcom/discord/channel_spine/ChannelSpineView;->yOfRow(FI)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Lnf/q;

    .line 37
    .line 38
    invoke-direct {p1}, Lnf/q;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/discord/channel_spine/ChannelSpineView;->yOfRow(FI)F

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    :goto_0
    iget-boolean v6, p0, Lcom/discord/channel_spine/ChannelSpineView;->isReplySpline:Z

    .line 47
    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x9

    .line 51
    .line 52
    invoke-static {v6}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    int-to-float v6, v6

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/high16 v6, 0x3f000000    # 0.5f

    .line 59
    .line 60
    mul-float/2addr v6, p1

    .line 61
    :goto_1
    invoke-direct {p0, p1, p2}, Lcom/discord/channel_spine/ChannelSpineView;->yOfRow(FI)F

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iget p2, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    .line 66
    .line 67
    int-to-float p2, p2

    .line 68
    sub-float/2addr p1, p2

    .line 69
    sub-float/2addr p1, v1

    .line 70
    add-float/2addr p1, v6

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    int-to-float p2, p2

    .line 76
    iget v6, p0, Lcom/discord/channel_spine/ChannelSpineView;->horizontalPadding:I

    .line 77
    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p2, v6

    .line 80
    invoke-direct {p0}, Lcom/discord/channel_spine/ChannelSpineView;->arcPercent()F

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    int-to-float v7, v7

    .line 89
    mul-float/2addr v6, v7

    .line 90
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    aget v2, v2, v7

    .line 95
    .line 96
    if-eq v2, v5, :cond_4

    .line 97
    .line 98
    if-eq v2, v4, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    iget-object v2, p0, Lcom/discord/channel_spine/ChannelSpineView;->arcRect:Landroid/graphics/RectF;

    .line 102
    .line 103
    add-float v4, v1, v6

    .line 104
    .line 105
    add-float/2addr v6, p1

    .line 106
    invoke-virtual {v2, v1, p1, v4, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    iget-object v2, p0, Lcom/discord/channel_spine/ChannelSpineView;->arcRect:Landroid/graphics/RectF;

    .line 111
    .line 112
    sub-float v4, p1, v6

    .line 113
    .line 114
    add-float/2addr v6, v1

    .line 115
    invoke-virtual {v2, v1, v4, v6, p1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 116
    .line 117
    .line 118
    :goto_2
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Lcom/discord/channel_spine/ChannelSpineView;->arcRect:Landroid/graphics/RectF;

    .line 122
    .line 123
    invoke-virtual {p3}, Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;->getArcSweepAngle()F

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    const/4 v2, 0x0

    .line 128
    const/high16 v3, 0x43340000    # 180.0f

    .line 129
    .line 130
    invoke-virtual {v0, v1, v3, p3, v2}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p2, p1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 134
    .line 135
    .line 136
    return-object v0
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
.end method

.method private final rebuildLayout()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 2
    .line 3
    iget v1, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 4
    .line 5
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(F)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    const v2, 0x38d1b717    # 1.0E-4f

    .line 13
    .line 14
    .line 15
    cmpg-float v2, v1, v2

    .line 16
    .line 17
    if-gtz v2, :cond_0

    .line 18
    .line 19
    goto :goto_3

    .line 20
    :cond_0
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    if-le v0, v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v3, v2

    .line 26
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    .line 27
    .line 28
    add-int v5, v0, v3

    .line 29
    .line 30
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v5, v0, -0x1

    .line 34
    .line 35
    :goto_1
    if-ge v2, v0, :cond_4

    .line 36
    .line 37
    iget-boolean v6, p0, Lcom/discord/channel_spine/ChannelSpineView;->isReplySpline:Z

    .line 38
    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    sget-object v6, Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;->BOTTOM_TO_TOP:Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    sget-object v6, Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;->TOP_TO_BOTTOM:Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;

    .line 45
    .line 46
    :goto_2
    invoke-direct {p0, v1, v2, v6}, Lcom/discord/channel_spine/ChannelSpineView;->createSpinePath(FILcom/discord/channel_spine/ChannelSpineView$SpineDirection;)Landroid/graphics/Path;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    if-ge v2, v5, :cond_3

    .line 54
    .line 55
    sget-object v6, Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;->BOTTOM_TO_TOP:Lcom/discord/channel_spine/ChannelSpineView$SpineDirection;

    .line 56
    .line 57
    invoke-direct {p0, v1, v2, v6}, Lcom/discord/channel_spine/ChannelSpineView;->createSpinePath(FILcom/discord/channel_spine/ChannelSpineView$SpineDirection;)Landroid/graphics/Path;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    if-eqz v3, :cond_5

    .line 68
    .line 69
    new-instance v2, Landroid/graphics/Path;

    .line 70
    .line 71
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v3, p0, Lcom/discord/channel_spine/ChannelSpineView;->spinePaint:Landroid/graphics/Paint;

    .line 75
    .line 76
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    const/high16 v5, 0x40000000    # 2.0f

    .line 81
    .line 82
    div-float/2addr v3, v5

    .line 83
    iget v6, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    .line 84
    .line 85
    int-to-float v6, v6

    .line 86
    invoke-virtual {v2, v3, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v0, v0, -0x2

    .line 90
    .line 91
    invoke-direct {p0, v1, v0}, Lcom/discord/channel_spine/ChannelSpineView;->yOfRow(FI)F

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    div-float/2addr v1, v5

    .line 96
    add-float/2addr v0, v1

    .line 97
    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    iput-object v4, p0, Lcom/discord/channel_spine/ChannelSpineView;->paths:Ljava/util/List;

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_6
    :goto_3
    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->paths:Ljava/util/List;

    .line 111
    .line 112
    :goto_4
    return-void
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
.end method

.method private final yOfRow(FI)F
    .locals 1

    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    int-to-float v0, v0

    int-to-float p2, p2

    mul-float/2addr p2, p1

    add-float/2addr v0, p2

    return v0
.end method


# virtual methods
.method public final configureAsReplySpline()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->isReplySpline:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iput v2, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    .line 10
    .line 11
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Lcom/discord/channel_spine/ChannelSpineView;->horizontalPadding:I

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lcom/discord/channel_spine/ChannelSpineView;->setNumRows(I)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Lcom/discord/channel_spine/a;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/discord/channel_spine/a;-><init>(Lcom/discord/channel_spine/ChannelSpineView;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 26
    .line 27
    .line 28
    return-void
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
.end method

.method public final getHorizontalPadding()I
    .locals 1

    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->horizontalPadding:I

    return v0
.end method

.method public final getNumRows()I
    .locals 1

    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    return v0
.end method

.method public final getRowHeight()F
    .locals 1

    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    return v0
.end method

.method public final getVerticalPadding()I
    .locals 1

    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lcom/discord/channel_spine/ChannelSpineView;->paths:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroid/graphics/Path;

    .line 30
    .line 31
    iget-object v3, p0, Lcom/discord/channel_spine/ChannelSpineView;->spinePaint:Landroid/graphics/Paint;

    .line 32
    .line 33
    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method protected onMeasure(II)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_4

    .line 20
    :cond_1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/high16 v3, 0x40000000    # 2.0f

    .line 25
    .line 26
    const/high16 v4, -0x80000000

    .line 27
    .line 28
    if-eq v0, v4, :cond_2

    .line 29
    .line 30
    if-eq v0, v3, :cond_2

    .line 31
    .line 32
    move p1, v2

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    :goto_1
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 39
    .line 40
    int-to-float v0, v0

    .line 41
    iget v5, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 42
    .line 43
    mul-float/2addr v0, v5

    .line 44
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eq v5, v4, :cond_4

    .line 49
    .line 50
    if-eq v5, v3, :cond_3

    .line 51
    .line 52
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    int-to-float p2, p2

    .line 71
    invoke-static {v0, p2}, Leg/h;->f(FF)F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eq p1, v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    move v1, v2

    .line 87
    :goto_3
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 92
    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-direct {p0}, Lcom/discord/channel_spine/ChannelSpineView;->rebuildLayout()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 100
    .line 101
    .line 102
    :cond_6
    return-void

    .line 103
    :cond_7
    :goto_4
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    .line 104
    .line 105
    .line 106
    return-void
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
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
.end method

.method public final setHorizontalPadding(I)V
    .locals 0

    iput p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->horizontalPadding:I

    return-void
.end method

.method public final setNumRows(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    iput p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    cmpl-float p1, p1, v0

    .line 16
    .line 17
    if-lez p1, :cond_1

    .line 18
    .line 19
    invoke-direct {p0}, Lcom/discord/channel_spine/ChannelSpineView;->rebuildLayout()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
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
.end method

.method public final setRowHeight(F)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 2
    .line 3
    cmpg-float v0, v0, p1

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    xor-int/2addr v0, v1

    .line 12
    iput p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->rowHeight:F

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->numRows:I

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/discord/channel_spine/ChannelSpineView;->rebuildLayout()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
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
.end method

.method public final setVerticalPadding(I)V
    .locals 0

    iput p1, p0, Lcom/discord/channel_spine/ChannelSpineView;->verticalPadding:I

    return-void
.end method
