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

    const-string p6, "c"

    invoke-static {p1, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "p"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "text"

    invoke-static {p8, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "l"

    invoke-static {p12, p6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p8, Landroid/text/Spanned;

    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p6

    if-ne p6, p9, :cond_6

    .line 2
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    move-result-object p6

    .line 3
    iget-boolean p8, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mWantColor:Z

    if-eqz p8, :cond_0

    .line 4
    invoke-virtual {p2}, Landroid/graphics/Paint;->getColor()I

    move-result p8

    .line 5
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mColor:I

    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_0

    :cond_0
    const/4 p8, 0x0

    .line 6
    :goto_0
    iget-object p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStyle:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 7
    iget-object p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStyle:Landroid/graphics/Paint$Style;

    sget-object p10, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-eq p9, p10, :cond_1

    sget-object p10, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-ne p9, p10, :cond_2

    .line 8
    :cond_1
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mStrokeWidth:F

    invoke-virtual {p2, p9}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 9
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result p9

    const/high16 p10, 0x40000000    # 2.0f

    if-eqz p9, :cond_4

    .line 10
    sget-object p9, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    const p11, 0x3f99999a    # 1.2f

    if-nez p9, :cond_3

    .line 11
    new-instance p9, Landroid/graphics/Path;

    invoke-direct {p9}, Landroid/graphics/Path;-><init>()V

    .line 12
    iget p12, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    int-to-float p12, p12

    mul-float/2addr p12, p11

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v1, 0x0

    invoke-virtual {p9, v1, v1, p12, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 13
    sput-object p9, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    .line 14
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    int-to-float p3, p3

    int-to-float p4, p4

    mul-float/2addr p4, p11

    .line 15
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    int-to-float p9, p9

    mul-float/2addr p4, p9

    add-float/2addr p3, p4

    add-int/2addr p5, p7

    int-to-float p4, p5

    div-float/2addr p4, p10

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 16
    sget-object p3, Lcom/discord/span/utilities/spannable/BulletSpan;->sBulletPath:Landroid/graphics/Path;

    invoke-static {p3}, Lkotlin/jvm/internal/q;->d(Ljava/lang/Object;)V

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 17
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_1

    .line 18
    :cond_4
    iget p9, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    mul-int/2addr p4, p9

    add-int/2addr p3, p4

    int-to-float p3, p3

    add-int/2addr p5, p7

    int-to-float p4, p5

    div-float/2addr p4, p10

    int-to-float p5, p9

    .line 19
    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 20
    :goto_1
    iget-boolean p1, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mWantColor:Z

    if-eqz p1, :cond_5

    .line 21
    invoke-virtual {p2, p8}, Landroid/graphics/Paint;->setColor(I)V

    .line 22
    :cond_5
    invoke-virtual {p2, p6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    :cond_6
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    iget p1, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mBulletRadius:I

    mul-int/lit8 p1, p1, 0x2

    iget v0, p0, Lcom/discord/span/utilities/spannable/BulletSpan;->mGapWidth:I

    add-int/2addr p1, v0

    return p1
.end method
