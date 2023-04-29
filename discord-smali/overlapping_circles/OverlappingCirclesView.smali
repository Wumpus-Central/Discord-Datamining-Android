.class public final Lcom/discord/overlapping_circles/OverlappingCirclesView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;,
        Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;,
        Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;,
        Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00182\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB\u001b\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016R\u0012\u0010\u0007\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u00088\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/discord/overlapping_circles/OverlappingCirclesView;",
        "Landroid/widget/LinearLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "imageLoadingColor",
        "",
        "imageLoadingColorDrawable",
        "Landroid/graphics/drawable/ColorDrawable;",
        "maxItems",
        "overflowBgColor",
        "overflowTextColor",
        "overflowTextSizePx",
        "overlapNegativeMargin",
        "overlapPx",
        "placeholderCircleColor",
        "separatorSizePx",
        "setItems",
        "",
        "items",
        "",
        "Lcom/discord/overlapping_circles/OverlappingItem;",
        "Companion",
        "OverflowItem",
        "OverlappingClippedItem",
        "PlaceholderItem",
        "overlapping_circles_release"
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
.field public static final Companion:Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;

.field public static final SMALL_ITEM_HEIGHT_DP:I = 0x14


# instance fields
.field private imageLoadingColor:I

.field private final imageLoadingColorDrawable:Landroid/graphics/drawable/ColorDrawable;

.field private maxItems:I

.field private overflowBgColor:I

.field private overflowTextColor:I

.field private overflowTextSizePx:I

.field private final overlapNegativeMargin:I

.field private overlapPx:I

.field private placeholderCircleColor:I

.field private separatorSizePx:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->Companion:Lcom/discord/overlapping_circles/OverlappingCirclesView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/discord/overlapping_circles/OverlappingCirclesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v1

    iput v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    .line 5
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getDpToPx(I)I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->separatorSizePx:I

    .line 6
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondaryAlt()I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColor:I

    .line 7
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundSecondaryAlt()I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowBgColor:I

    .line 8
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getInteractiveNormal()I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextColor:I

    const/16 v0, 0xc

    .line 9
    invoke-static {v0}, Lcom/discord/misc/utilities/size/SizeUtilsKt;->getSpToPx(I)I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextSizePx:I

    .line 10
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    move-result-object v0

    invoke-virtual {v0}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    move-result v0

    iput v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->placeholderCircleColor:I

    .line 11
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget v1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColor:I

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColorDrawable:Landroid/graphics/drawable/ColorDrawable;

    .line 12
    sget-object v0, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView:[I

    const-string v1, "OverlappingCirclesView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(s\u2026efStyleAttr, defStyleRes)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_maxItems:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-static {p2, v1}, Leg/h;->c(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    .line 15
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_overlap:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    .line 16
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_separation:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->separatorSizePx:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->separatorSizePx:I

    .line 17
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_circleBgColor:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColor:I

    .line 18
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_overflowBgColor:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowBgColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowBgColor:I

    .line 19
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_overflowTextColor:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextColor:I

    .line 20
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_overflowTextSize:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextSizePx:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextSizePx:I

    .line 21
    sget p2, Lcom/discord/overlapping_circles/R$styleable;->OverlappingCirclesView_oc_placeholderColor:I

    iget v0, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->placeholderCircleColor:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->placeholderCircleColor:I

    .line 22
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    invoke-virtual {p0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 24
    iget p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    neg-int p1, p1

    iput p1, p0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapNegativeMargin:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/discord/overlapping_circles/OverlappingCirclesView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final setItems(Ljava/util/List;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/discord/overlapping_circles/OverlappingItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "items"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 11
    .line 12
    .line 13
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget v3, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x1

    .line 21
    if-le v2, v3, :cond_0

    .line 22
    .line 23
    move v2, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v4

    .line 26
    :goto_0
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    iget v6, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    .line 31
    .line 32
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    sub-int/2addr v3, v5

    .line 37
    iget v6, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->maxItems:I

    .line 38
    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    sub-int/2addr v6, v5

    .line 42
    :cond_1
    invoke-static {v1, v6}, Lkotlin/collections/h;->x0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    move v8, v4

    .line 51
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    const-string v10, "context"

    .line 56
    .line 57
    if-eqz v9, :cond_a

    .line 58
    .line 59
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    add-int/lit8 v11, v8, 0x1

    .line 64
    .line 65
    if-gez v8, :cond_2

    .line 66
    .line 67
    invoke-static {}, Lkotlin/collections/h;->s()V

    .line 68
    .line 69
    .line 70
    :cond_2
    check-cast v9, Lcom/discord/overlapping_circles/OverlappingItem;

    .line 71
    .line 72
    if-eq v8, v3, :cond_3

    .line 73
    .line 74
    move v12, v5

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move v12, v4

    .line 77
    :goto_2
    if-nez v12, :cond_5

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    move/from16 v16, v4

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    :goto_3
    move/from16 v16, v5

    .line 86
    .line 87
    :goto_4
    invoke-virtual {v9}, Lcom/discord/overlapping_circles/OverlappingItem;->getImageUri()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    if-eqz v12, :cond_7

    .line 92
    .line 93
    invoke-virtual {v9}, Lcom/discord/overlapping_circles/OverlappingItem;->getImageUri()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-static {v12}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-eqz v12, :cond_6

    .line 102
    .line 103
    invoke-virtual {v9}, Lcom/discord/overlapping_circles/OverlappingItem;->getImageUri()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    goto :goto_5

    .line 108
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v12, Lcom/discord/react_asset_fetcher/ReactAsset;->DefaultAvatar0:Lcom/discord/react_asset_fetcher/ReactAsset;

    .line 116
    .line 117
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-static {v13, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v13}, Lcom/discord/react_asset_fetcher/ReactAsset;->getUri(Landroid/content/Context;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    invoke-static {v9, v12}, Lcom/discord/react_asset_fetcher/ReactAssetUtilsKt;->getReactImageUrl(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    :goto_5
    move-object v15, v9

    .line 133
    new-instance v9, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;

    .line 134
    .line 135
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v14

    .line 139
    invoke-static {v14, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget v10, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    .line 143
    .line 144
    iget v12, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->separatorSizePx:I

    .line 145
    .line 146
    iget-object v13, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->imageLoadingColorDrawable:Landroid/graphics/drawable/ColorDrawable;

    .line 147
    .line 148
    move-object/from16 v19, v13

    .line 149
    .line 150
    move-object v13, v9

    .line 151
    move/from16 v17, v10

    .line 152
    .line 153
    move/from16 v18, v12

    .line 154
    .line 155
    invoke-direct/range {v13 .. v19}, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverlappingClippedItem;-><init>(Landroid/content/Context;Ljava/lang/String;ZIILandroid/graphics/drawable/Drawable;)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    invoke-static {}, Lcom/discord/theme/ThemeManagerKt;->getTheme()Lcom/discord/theme/DiscordTheme;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    invoke-virtual {v9}, Lcom/discord/theme/DiscordTheme;->getBackgroundAccent()I

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    iget v9, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapPx:I

    .line 172
    .line 173
    iget v12, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->separatorSizePx:I

    .line 174
    .line 175
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    iget v13, v13, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 180
    .line 181
    new-instance v20, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;

    .line 182
    .line 183
    invoke-static {v14, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    move v10, v13

    .line 187
    move-object/from16 v13, v20

    .line 188
    .line 189
    move/from16 v17, v9

    .line 190
    .line 191
    move/from16 v18, v12

    .line 192
    .line 193
    move/from16 v19, v10

    .line 194
    .line 195
    invoke-direct/range {v13 .. v19}, Lcom/discord/overlapping_circles/OverlappingCirclesView$PlaceholderItem;-><init>(Landroid/content/Context;IZIII)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v9, v20

    .line 199
    .line 200
    :goto_6
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 201
    .line 202
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 203
    .line 204
    .line 205
    move-result-object v12

    .line 206
    iget v12, v12, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 207
    .line 208
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 209
    .line 210
    .line 211
    move-result-object v13

    .line 212
    iget v13, v13, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 213
    .line 214
    invoke-direct {v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 215
    .line 216
    .line 217
    if-lez v8, :cond_8

    .line 218
    .line 219
    move v8, v5

    .line 220
    goto :goto_7

    .line 221
    :cond_8
    move v8, v4

    .line 222
    :goto_7
    if-eqz v8, :cond_9

    .line 223
    .line 224
    iget v8, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapNegativeMargin:I

    .line 225
    .line 226
    invoke-virtual {v10, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 227
    .line 228
    .line 229
    :cond_9
    invoke-virtual {v0, v9, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 230
    .line 231
    .line 232
    move v8, v11

    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_a
    if-eqz v2, :cond_b

    .line 236
    .line 237
    new-instance v2, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;

    .line 238
    .line 239
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 240
    .line 241
    .line 242
    move-result-object v13

    .line 243
    invoke-static {v13, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    sub-int v14, v1, v6

    .line 251
    .line 252
    iget v15, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextSizePx:I

    .line 253
    .line 254
    iget v1, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowTextColor:I

    .line 255
    .line 256
    iget v3, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overflowBgColor:I

    .line 257
    .line 258
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 263
    .line 264
    move-object v12, v2

    .line 265
    move/from16 v16, v1

    .line 266
    .line 267
    move/from16 v17, v3

    .line 268
    .line 269
    move/from16 v18, v4

    .line 270
    .line 271
    invoke-direct/range {v12 .. v18}, Lcom/discord/overlapping_circles/OverlappingCirclesView$OverflowItem;-><init>(Landroid/content/Context;IIIII)V

    .line 272
    .line 273
    .line 274
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 275
    .line 276
    const/4 v3, -0x2

    .line 277
    const/4 v4, -0x1

    .line 278
    invoke-direct {v1, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 279
    .line 280
    .line 281
    iget v3, v0, Lcom/discord/overlapping_circles/OverlappingCirclesView;->overlapNegativeMargin:I

    .line 282
    .line 283
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 284
    .line 285
    .line 286
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    invoke-virtual {v0, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 289
    .line 290
    .line 291
    :cond_b
    return-void
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
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
.end method
