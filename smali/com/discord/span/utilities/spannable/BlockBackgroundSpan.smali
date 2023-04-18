.class public final Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineBackgroundSpan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\r\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001BK\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ`\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;",
        "Landroid/text/style/LineBackgroundSpan;",
        "fillColor",
        "",
        "strokeColor",
        "strokeWidth",
        "strokeRadius",
        "insetStart",
        "insetTop",
        "insetBottom",
        "(IIIIIII)V",
        "fillPaint",
        "Landroid/graphics/Paint;",
        "radius",
        "",
        "rect",
        "Landroid/graphics/RectF;",
        "strokePaint",
        "drawBackground",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "paint",
        "left",
        "right",
        "top",
        "baseline",
        "bottom",
        "text",
        "",
        "start",
        "end",
        "lnum",
        "span_utilities_release"
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
.field private final fillPaint:Landroid/graphics/Paint;

.field private final insetBottom:I

.field private final insetStart:I

.field private final insetTop:I

.field private final radius:F

.field private final rect:Landroid/graphics/RectF;

.field private final strokePaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(IIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetStart:I

    .line 5
    .line 6
    iput p6, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetTop:I

    .line 7
    .line 8
    iput p7, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetBottom:I

    .line 9
    .line 10
    new-instance p5, Landroid/graphics/Paint;

    .line 11
    .line 12
    invoke-direct {p5}, Landroid/graphics/Paint;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object p6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 16
    .line 17
    invoke-virtual {p5, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p5, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    .line 22
    .line 23
    iput-object p5, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->fillPaint:Landroid/graphics/Paint;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object p5, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 31
    .line 32
    invoke-virtual {p1, p5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 36
    .line 37
    .line 38
    int-to-float p2, p3

    .line 39
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->strokePaint:Landroid/graphics/Paint;

    .line 47
    .line 48
    new-instance p1, Landroid/graphics/RectF;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->rect:Landroid/graphics/RectF;

    .line 54
    .line 55
    int-to-float p1, p4

    .line 56
    iput p1, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->radius:F

    .line 57
    .line 58
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
.end method


# virtual methods
.method public drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;III)V
    .locals 0

    const-string p6, "canvas"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "paint"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "text"

    invoke-static {p8, p2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    instance-of p2, p8, Landroid/text/Spanned;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    check-cast p8, Landroid/text/Spanned;

    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p2

    if-ne p2, p9, :cond_1

    .line 3
    iget-object p2, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->rect:Landroid/graphics/RectF;

    int-to-float p3, p3

    iget p6, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetStart:I

    int-to-float p6, p6

    add-float/2addr p3, p6

    iput p3, p2, Landroid/graphics/RectF;->left:F

    int-to-float p3, p5

    .line 4
    iget p5, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetTop:I

    int-to-float p5, p5

    add-float/2addr p3, p5

    iput p3, p2, Landroid/graphics/RectF;->top:F

    .line 5
    :cond_1
    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p2

    if-ne p2, p10, :cond_2

    .line 6
    iget-object p2, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->rect:Landroid/graphics/RectF;

    int-to-float p3, p4

    iput p3, p2, Landroid/graphics/RectF;->right:F

    int-to-float p3, p7

    .line 7
    iget p4, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->insetBottom:I

    int-to-float p4, p4

    sub-float/2addr p3, p4

    iput p3, p2, Landroid/graphics/RectF;->bottom:F

    .line 8
    iget p3, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->radius:F

    iget-object p4, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p3, p4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 9
    iget-object p2, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->rect:Landroid/graphics/RectF;

    iget p3, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->radius:F

    iget-object p4, p0, Lcom/discord/span/utilities/spannable/BlockBackgroundSpan;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, p3, p4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method
