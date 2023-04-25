.class public final Lcom/discord/span/utilities/BackgroundSpanDrawer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LineBackgroundSpan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\r\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/discord/span/utilities/BackgroundSpanDrawer;",
        "Landroid/text/style/LineBackgroundSpan;",
        "provider",
        "Landroid/widget/TextView;",
        "(Landroid/widget/TextView;)V",
        "drawBackground",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "paint",
        "Landroid/graphics/Paint;",
        "left",
        "",
        "right",
        "top",
        "baseline",
        "bottom",
        "text",
        "",
        "start",
        "end",
        "lineNumber",
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
.field private final provider:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const-string v0, "provider"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/discord/span/utilities/BackgroundSpanDrawer;->provider:Landroid/widget/TextView;

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
.end method


# virtual methods
.method public drawBackground(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;III)V
    .locals 32

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move/from16 v10, p5

    move/from16 v11, p7

    move/from16 v12, p11

    const-string v0, "canvas"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paint"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static/range {p8 .. p8}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    move-result-object v13

    const-string v0, "valueOf(this)"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface/range {p8 .. p8}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Lcom/discord/span/utilities/spannable/BackgroundSpan;

    const/4 v14, 0x0

    invoke-interface {v13, v14, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, [Lcom/discord/span/utilities/spannable/BackgroundSpan;

    move-object/from16 v7, p0

    .line 3
    iget-object v0, v7, Lcom/discord/span/utilities/BackgroundSpanDrawer;->provider:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v6

    const-string v0, "provider.layout"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundSpans"

    .line 4
    invoke-static {v15, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    array-length v5, v15

    move v4, v14

    :goto_0
    if-ge v4, v5, :cond_7

    aget-object v0, v15, v4

    .line 6
    invoke-interface {v13, v0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v1

    .line 7
    invoke-interface {v13, v0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 8
    invoke-virtual {v0}, Lcom/discord/span/utilities/spannable/BackgroundSpan;->getStyle()Lcom/discord/span/utilities/common/BackgroundStyle;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getCornerRadius()I

    move-result v3

    invoke-static {v3}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v3

    int-to-float v3, v3

    .line 10
    invoke-virtual {v6, v1}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v14

    move/from16 p6, v4

    .line 11
    invoke-virtual {v6, v2}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v4

    const/16 v16, 0x1

    if-gt v14, v12, :cond_0

    if-gt v12, v4, :cond_0

    move/from16 v17, v16

    goto :goto_1

    :cond_0
    const/16 v17, 0x0

    :goto_1
    if-eqz v17, :cond_6

    if-ne v14, v12, :cond_1

    .line 12
    invoke-virtual {v6, v1}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    float-to-int v1, v1

    goto :goto_2

    :cond_1
    move/from16 v1, p3

    :goto_2
    if-ne v4, v12, :cond_2

    move/from16 v17, v5

    .line 13
    invoke-virtual {v6, v12}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v5

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v6, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v2

    goto :goto_3

    :cond_2
    move/from16 v17, v5

    .line 14
    invoke-virtual {v6, v12}, Landroid/text/Layout;->getLineRight(I)F

    move-result v2

    :goto_3
    float-to-int v2, v2

    .line 15
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Paint;->getColor()I

    move-result v5

    move/from16 p8, v5

    .line 16
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getBackgroundColor()I

    move-result v5

    invoke-virtual {v9, v5}, Landroid/graphics/Paint;->setColor(I)V

    if-ne v14, v4, :cond_3

    int-to-float v1, v1

    int-to-float v3, v10

    int-to-float v4, v2

    int-to-float v5, v11

    .line 17
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getCornerRadius()I

    move-result v2

    invoke-static {v2}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v2

    int-to-float v14, v2

    .line 18
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getCornerRadius()I

    move-result v0

    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    int-to-float v2, v0

    move-object/from16 v0, p1

    move/from16 v16, v2

    move v2, v3

    move v3, v4

    move/from16 v18, p6

    move v4, v5

    move-object/from16 p6, v13

    move/from16 v13, p8

    move v5, v14

    move-object/from16 v19, v6

    move/from16 v6, v16

    move-object/from16 v7, p2

    .line 19
    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    :goto_4
    const/16 v31, 0x0

    goto/16 :goto_5

    :cond_3
    move/from16 v18, p6

    move-object/from16 v19, v6

    move-object/from16 p6, v13

    move/from16 v13, p8

    const/4 v6, 0x6

    const/4 v7, 0x5

    const/16 v20, 0x4

    const/16 v21, 0x3

    const/16 v22, 0x2

    const/16 v5, 0x8

    const/16 v23, 0x0

    if-ne v14, v12, :cond_4

    .line 20
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getBackgroundColor()I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 21
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    int-to-float v1, v1

    int-to-float v4, v10

    int-to-float v2, v2

    int-to-float v14, v11

    new-array v5, v5, [F

    const/16 v24, 0x0

    aput v3, v5, v24

    aput v3, v5, v16

    aput v23, v5, v22

    aput v23, v5, v21

    aput v23, v5, v20

    aput v23, v5, v7

    aput v3, v5, v6

    const/4 v6, 0x7

    aput v3, v5, v6

    .line 22
    sget-object v30, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v24, v0

    move/from16 v25, v1

    move/from16 v26, v4

    move/from16 v27, v2

    move/from16 v28, v14

    move-object/from16 v29, v5

    .line 23
    invoke-virtual/range {v24 .. v30}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    .line 24
    invoke-virtual {v8, v0, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_4

    :cond_4
    if-ne v4, v12, :cond_5

    .line 25
    invoke-virtual {v0}, Lcom/discord/span/utilities/common/BackgroundStyle;->getBackgroundColor()I

    move-result v0

    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    int-to-float v1, v1

    int-to-float v4, v10

    int-to-float v2, v2

    int-to-float v14, v11

    new-array v5, v5, [F

    const/16 v31, 0x0

    aput v23, v5, v31

    aput v23, v5, v16

    aput v3, v5, v22

    aput v3, v5, v21

    aput v3, v5, v20

    aput v3, v5, v7

    aput v23, v5, v6

    const/4 v3, 0x7

    aput v23, v5, v3

    .line 27
    sget-object v30, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    move-object/from16 v24, v0

    move/from16 v25, v1

    move/from16 v26, v4

    move/from16 v27, v2

    move/from16 v28, v14

    move-object/from16 v29, v5

    .line 28
    invoke-virtual/range {v24 .. v30}, Landroid/graphics/Path;->addRoundRect(FFFF[FLandroid/graphics/Path$Direction;)V

    .line 29
    invoke-virtual {v8, v0, v9}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_5

    :cond_5
    const/16 v31, 0x0

    int-to-float v1, v1

    int-to-float v3, v10

    int-to-float v4, v2

    int-to-float v5, v11

    move-object/from16 v0, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move-object/from16 v5, p2

    .line 30
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 31
    :goto_5
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_6

    :cond_6
    move/from16 v18, p6

    move/from16 v17, v5

    move-object/from16 v19, v6

    move-object/from16 p6, v13

    const/16 v31, 0x0

    :goto_6
    add-int/lit8 v4, v18, 0x1

    move-object/from16 v7, p0

    move-object/from16 v13, p6

    move/from16 v5, v17

    move-object/from16 v6, v19

    move/from16 v14, v31

    goto/16 :goto_0

    :cond_7
    return-void
.end method
