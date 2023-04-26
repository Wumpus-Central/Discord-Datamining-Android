.class public final Lcom/discord/span/utilities/spannable/BulletSpan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/span/utilities/spannable/BulletSpan$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 &2\u00020\u0001:\u0001&BA\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJh\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/discord/span/utilities/spannable/BulletSpan;",
        "Landroid/text/style/LeadingMarginSpan;",
        "color",
        "",
        "gapWidth",
        "wantColor",
        "",
        "bulletRadius",
        "strokeWidth",
        "",
        "style",
        "Landroid/graphics/Paint$Style;",
        "(IIZIFLandroid/graphics/Paint$Style;)V",
        "mBulletRadius",
        "mColor",
        "mGapWidth",
        "mStrokeWidth",
        "mStyle",
        "mWantColor",
        "drawLeadingMargin",
        "",
        "c",
        "Landroid/graphics/Canvas;",
        "p",
        "Landroid/graphics/Paint;",
        "x",
        "dir",
        "top",
        "baseline",
        "bottom",
        "text",
        "",
        "start",
        "end",
        "first",
        "l",
        "Landroid/text/Layout;",
        "getLeadingMargin",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/discord/span/utilities/spannable/BulletSpan$Companion;

.field public static final STANDARD_BULLET_RADIUS_PX:I = 0x4

.field public static final STANDARD_GAP_WIDTH_PX:I = 0x2

.field public static final STANDARD_STROKE_WIDTH_PX:F = 4.0f

.field private static sBulletPath:Landroid/graphics/Path;


# instance fields
.field private final mBulletRadius:I

.field private final mColor:I

.field private final mGapWidth:I

.field private final mStrokeWidth:F

.field private final mStyle:Landroid/graphics/Paint$Style;

.field private final mWantColor:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/span/utilities/spannable/BulletSpan$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/span/utilities/spannable/BulletSpan$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/span/utilities/spannable/BulletSpan;->Companion:Lcom/discord/span/utilities/spannable/BulletSpan$Companion;

    return-void
.end method

.method public constructor <init>(IIZIFLandroid/graphics/Paint$Style;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mGapWidth:I

    .line 3
    iput p4, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    .line 4
    iput-boolean p3, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mWantColor:Z

    .line 5
    iput p1, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mColor:I

    .line 6
    iput p5, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStrokeWidth:F

    .line 7
    iput-object p6, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStyle:Landroid/graphics/Paint$Style;

    return-void
.end method

.method public synthetic constructor <init>(IIZIFLandroid/graphics/Paint$Style;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    const/4 p2, 0x2

    :cond_0
    move v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x1

    :cond_1
    move v3, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x4

    :cond_2
    move v4, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    const/high16 p5, 0x40800000    # 4.0f

    :cond_3
    move v5, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    .line 8
    sget-object p6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    :cond_4
    move-object v6, p6

    move-object v0, p0

    move v1, p1

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/discord/span/utilities/spannable/BulletSpan;-><init>(IIZIFLandroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 2

    .line 1
    const-string p6, "c"

    .line 2
    .line 3
    invoke-static {p1, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p6, "p"

    .line 7
    .line 8
    invoke-static {p2, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p6, "text"

    .line 12
    .line 13
    invoke-static {p8, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p6, "l"

    .line 17
    .line 18
    invoke-static {p12, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    check-cast p8, Landroid/text/Spanned;

    .line 22
    .line 23
    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 24
    .line 25
    .line 26
    move-result p6

    .line 27
    if-ne p6, p9, :cond_6

    .line 28
    .line 29
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 30
    .line 31
    .line 32
    move-result-object p6

    .line 33
    iget-boolean p8, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mWantColor:Z

    .line 34
    .line 35
    if-eqz p8, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    .line 38
    .line 39
    .line 40
    move-result p8

    .line 41
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mColor:I

    .line 42
    .line 43
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p8, 0x0

    .line 48
    :goto_0
    iget-object p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStyle:Landroid/graphics/Paint$Style;

    .line 49
    .line 50
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 51
    .line 52
    .line 53
    iget-object p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStyle:Landroid/graphics/Paint$Style;

    .line 54
    .line 55
    sget-object p10, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 56
    .line 57
    if-eq p9, p10, :cond_1

    .line 58
    .line 59
    sget-object p10, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    .line 60
    .line 61
    if-ne p9, p10, :cond_2

    .line 62
    .line 63
    :cond_1
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStrokeWidth:F

    .line 64
    .line 65
    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 69
    .line 70
    .line 71
    move-result p9

    .line 72
    const/high16 p10, 0x40000000    # 2.0f

    .line 73
    .line 74
    if-eqz p9, :cond_4

    .line 75
    .line 76
    sget-object p9, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    .line 77
    .line 78
    const p11, 0x3f99999a    # 1.2f

    .line 79
    .line 80
    .line 81
    if-nez p9, :cond_3

    .line 82
    .line 83
    new-instance p9, Landroid/graphics/Path;

    .line 84
    .line 85
    invoke-direct {p9}, Landroid/graphics/Path;-><init>()V

    .line 86
    .line 87
    .line 88
    iget p12, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    .line 89
    .line 90
    int-to-float p12, p12

    .line 91
    mul-float/2addr p12, p11

    .line 92
    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 93
    .line 94
    const/4 v1, 0x0

    .line 95
    invoke-virtual {p9, v1, v1, p12, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 96
    .line 97
    .line 98
    sput-object p9, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    .line 99
    .line 100
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 101
    .line 102
    .line 103
    int-to-float p3, p3

    .line 104
    int-to-float p4, p4

    .line 105
    mul-float/2addr p4, p11

    .line 106
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    .line 107
    .line 108
    int-to-float p9, p9

    .line 109
    mul-float/2addr p4, p9

    .line 110
    add-float/2addr p3, p4

    .line 111
    add-int/2addr p5, p7

    .line 112
    int-to-float p4, p5

    .line 113
    div-float/2addr p4, p10

    .line 114
    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 115
    .line 116
    .line 117
    sget-object p3, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    .line 118
    .line 119
    invoke-static {p3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    .line 130
    .line 131
    mul-int/2addr p4, p9

    .line 132
    add-int/2addr p3, p4

    .line 133
    int-to-float p3, p3

    .line 134
    add-int/2addr p5, p7

    .line 135
    int-to-float p4, p5

    .line 136
    div-float/2addr p4, p10

    .line 137
    int-to-float p5, p9

    .line 138
    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 139
    .line 140
    .line 141
    :goto_1
    iget-boolean p1, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mWantColor:Z

    .line 142
    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 149
    .line 150
    .line 151
    :cond_6
    return-void
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
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    iget p1, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    mul-int/lit8 p1, p1, 0x2

    iget v0, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mGapWidth:I

    add-int/2addr p1, v0

    return p1
.end method
