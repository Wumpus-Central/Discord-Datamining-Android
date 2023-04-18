.class public Lcom/yalantis/ucrop/view/OverlayView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field private A:Landroid/graphics/Paint;

.field private B:Landroid/graphics/Paint;

.field private C:Landroid/graphics/Paint;

.field private D:I

.field private E:F

.field private F:F

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:Lff/d;

.field private L:Z

.field private final k:Landroid/graphics/RectF;

.field private final l:Landroid/graphics/RectF;

.field protected m:I

.field protected n:I

.field protected o:[F

.field protected p:[F

.field private q:I

.field private r:I

.field private s:F

.field private t:[F

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:I

.field private y:Landroid/graphics/Path;

.field private z:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/yalantis/ucrop/view/OverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 4
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 6
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->y:Landroid/graphics/Path;

    .line 7
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->z:Landroid/graphics/Paint;

    .line 8
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    .line 9
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    .line 10
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->G:I

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lef/b;->d:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->H:I

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lef/b;->e:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->I:I

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lef/b;->c:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->J:I

    .line 17
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/OverlayView;->d()V

    return-void
.end method

.method private c(FF)I
    .locals 10

    .line 1
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->H:I

    .line 2
    .line 3
    int-to-double v0, v0

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    const/16 v4, 0x8

    .line 7
    .line 8
    if-ge v3, v4, :cond_1

    .line 9
    .line 10
    iget-object v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->o:[F

    .line 11
    .line 12
    aget v4, v4, v3

    .line 13
    .line 14
    sub-float v4, p1, v4

    .line 15
    .line 16
    float-to-double v4, v4

    .line 17
    const-wide/high16 v6, 0x4000000000000000L    # 2.0

    .line 18
    .line 19
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    iget-object v8, p0, Lcom/yalantis/ucrop/view/OverlayView;->o:[F

    .line 24
    .line 25
    add-int/lit8 v9, v3, 0x1

    .line 26
    .line 27
    aget v8, v8, v9

    .line 28
    .line 29
    sub-float v8, p2, v8

    .line 30
    .line 31
    float-to-double v8, v8

    .line 32
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    add-double/2addr v4, v6

    .line 37
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    cmpg-double v6, v4, v0

    .line 42
    .line 43
    if-gez v6, :cond_0

    .line 44
    .line 45
    div-int/lit8 v0, v3, 0x2

    .line 46
    .line 47
    move v2, v0

    .line 48
    move-wide v0, v4

    .line 49
    :cond_0
    add-int/lit8 v3, v3, 0x2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-ne v0, v1, :cond_2

    .line 56
    .line 57
    if-gez v2, :cond_2

    .line 58
    .line 59
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 60
    .line 61
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    const/4 p1, 0x4

    .line 68
    return p1

    .line 69
    :cond_2
    return v2
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
.end method

.method private e(Landroid/content/res/TypedArray;)V
    .locals 4

    .line 1
    sget v0, Lef/h;->a0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lef/b;->a:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget v1, Lef/h;->Z:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget v3, Lef/a;->c:I

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    .line 34
    .line 35
    int-to-float v2, v0

    .line 36
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    .line 45
    .line 46
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    .line 52
    .line 53
    mul-int/lit8 v0, v0, 0x3

    .line 54
    .line 55
    int-to-float v0, v0

    .line 56
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    .line 65
    .line 66
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 69
    .line 70
    .line 71
    return-void
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
.end method

.method private f(Landroid/content/res/TypedArray;)V
    .locals 4

    .line 1
    sget v0, Lef/h;->e0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget v2, Lef/b;->b:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sget v1, Lef/h;->b0:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    sget v3, Lef/a;->d:I

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    sget v0, Lef/h;->d0:I

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 52
    .line 53
    sget v0, Lef/h;->c0:I

    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 60
    .line 61
    return-void
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
.end method

.method private i(FF)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->G:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    if-eq v0, v1, :cond_4

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v0, v2, :cond_3

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    if-eq v0, v2, :cond_2

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 27
    .line 28
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 29
    .line 30
    sub-float/2addr p1, v1

    .line 31
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    .line 32
    .line 33
    sub-float/2addr p2, v1

    .line 34
    invoke-virtual {v0, p1, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 38
    .line 39
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    int-to-float p2, p2

    .line 46
    cmpl-float p1, p1, p2

    .line 47
    .line 48
    if-lez p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 51
    .line 52
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    int-to-float p2, p2

    .line 59
    cmpl-float p1, p1, p2

    .line 60
    .line 61
    if-lez p1, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 64
    .line 65
    iget p1, p1, Landroid/graphics/RectF;->right:F

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    int-to-float p2, p2

    .line 72
    cmpg-float p1, p1, p2

    .line 73
    .line 74
    if-gez p1, :cond_1

    .line 75
    .line 76
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 77
    .line 78
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    int-to-float p2, p2

    .line 85
    cmpg-float p1, p1, p2

    .line 86
    .line 87
    if-gez p1, :cond_1

    .line 88
    .line 89
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 90
    .line 91
    iget-object p2, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/OverlayView;->j()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :cond_2
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 104
    .line 105
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 106
    .line 107
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 108
    .line 109
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 110
    .line 111
    invoke-virtual {v0, p1, v3, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 118
    .line 119
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 120
    .line 121
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 122
    .line 123
    invoke-virtual {v0, v3, v2, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 128
    .line 129
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 130
    .line 131
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 132
    .line 133
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 134
    .line 135
    invoke-virtual {v0, v3, p2, p1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 140
    .line 141
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 142
    .line 143
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 144
    .line 145
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 146
    .line 147
    invoke-virtual {v0, p1, p2, v3, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 148
    .line 149
    .line 150
    :goto_0
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    iget p2, p0, Lcom/yalantis/ucrop/view/OverlayView;->I:I

    .line 157
    .line 158
    int-to-float p2, p2

    .line 159
    cmpl-float p1, p1, p2

    .line 160
    .line 161
    const/4 p2, 0x0

    .line 162
    if-ltz p1, :cond_6

    .line 163
    .line 164
    move p1, v1

    .line 165
    goto :goto_1

    .line 166
    :cond_6
    move p1, p2

    .line 167
    :goto_1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    iget v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->I:I

    .line 174
    .line 175
    int-to-float v2, v2

    .line 176
    cmpl-float v0, v0, v2

    .line 177
    .line 178
    if-ltz v0, :cond_7

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_7
    move v1, p2

    .line 182
    :goto_2
    iget-object p2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 183
    .line 184
    if-eqz v1, :cond_8

    .line 185
    .line 186
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 187
    .line 188
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_8
    iget v0, p2, Landroid/graphics/RectF;->left:F

    .line 192
    .line 193
    :goto_3
    if-eqz p1, :cond_9

    .line 194
    .line 195
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 196
    .line 197
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_9
    iget v2, p2, Landroid/graphics/RectF;->top:F

    .line 201
    .line 202
    :goto_4
    if-eqz v1, :cond_a

    .line 203
    .line 204
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 205
    .line 206
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_a
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 210
    .line 211
    :goto_5
    if-eqz p1, :cond_b

    .line 212
    .line 213
    iget-object v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 214
    .line 215
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    iget v4, p2, Landroid/graphics/RectF;->bottom:F

    .line 219
    .line 220
    :goto_6
    invoke-virtual {p2, v0, v2, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 221
    .line 222
    .line 223
    if-nez p1, :cond_c

    .line 224
    .line 225
    if-eqz v1, :cond_d

    .line 226
    .line 227
    :cond_c
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/OverlayView;->j()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 231
    .line 232
    .line 233
    :cond_d
    return-void
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
.end method

.method private j()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-static {v0}, Lif/g;->b(Landroid/graphics/RectF;)[F

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->o:[F

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-static {v0}, Lif/g;->a(Landroid/graphics/RectF;)[F

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->p:[F

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 19
    .line 20
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->y:Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->y:Landroid/graphics/Path;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 34
    .line 35
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget-object v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/high16 v4, 0x40000000    # 2.0f

    .line 56
    .line 57
    div-float/2addr v3, v4

    .line 58
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 59
    .line 60
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 61
    .line 62
    .line 63
    return-void
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
.end method


# virtual methods
.method protected a(Landroid/graphics/Canvas;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 18
    .line 19
    mul-int/lit8 v0, v0, 0x4

    .line 20
    .line 21
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 22
    .line 23
    mul-int/lit8 v1, v1, 0x4

    .line 24
    .line 25
    add-int/2addr v0, v1

    .line 26
    new-array v0, v0, [F

    .line 27
    .line 28
    iput-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    move v1, v0

    .line 32
    move v2, v1

    .line 33
    :goto_0
    iget v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 34
    .line 35
    const/high16 v4, 0x3f800000    # 1.0f

    .line 36
    .line 37
    if-ge v1, v3, :cond_0

    .line 38
    .line 39
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 40
    .line 41
    add-int/lit8 v5, v2, 0x1

    .line 42
    .line 43
    iget-object v6, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 44
    .line 45
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 46
    .line 47
    aput v7, v3, v2

    .line 48
    .line 49
    add-int/lit8 v2, v5, 0x1

    .line 50
    .line 51
    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    int-to-float v7, v1

    .line 56
    add-float/2addr v7, v4

    .line 57
    iget v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    int-to-float v4, v4

    .line 62
    div-float v4, v7, v4

    .line 63
    .line 64
    mul-float/2addr v6, v4

    .line 65
    iget-object v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget v8, v4, Landroid/graphics/RectF;->top:F

    .line 68
    .line 69
    add-float/2addr v6, v8

    .line 70
    aput v6, v3, v5

    .line 71
    .line 72
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 73
    .line 74
    add-int/lit8 v5, v2, 0x1

    .line 75
    .line 76
    iget v6, v4, Landroid/graphics/RectF;->right:F

    .line 77
    .line 78
    aput v6, v3, v2

    .line 79
    .line 80
    add-int/lit8 v2, v5, 0x1

    .line 81
    .line 82
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    iget v6, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    int-to-float v6, v6

    .line 91
    div-float/2addr v7, v6

    .line 92
    mul-float/2addr v4, v7

    .line 93
    iget-object v6, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 94
    .line 95
    iget v6, v6, Landroid/graphics/RectF;->top:F

    .line 96
    .line 97
    add-float/2addr v4, v6

    .line 98
    aput v4, v3, v5

    .line 99
    .line 100
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_0
    :goto_1
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 104
    .line 105
    if-ge v0, v1, :cond_1

    .line 106
    .line 107
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 108
    .line 109
    add-int/lit8 v3, v2, 0x1

    .line 110
    .line 111
    iget-object v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 112
    .line 113
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    int-to-float v6, v0

    .line 118
    add-float/2addr v6, v4

    .line 119
    iget v7, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 120
    .line 121
    add-int/lit8 v7, v7, 0x1

    .line 122
    .line 123
    int-to-float v7, v7

    .line 124
    div-float v7, v6, v7

    .line 125
    .line 126
    mul-float/2addr v5, v7

    .line 127
    iget-object v7, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 128
    .line 129
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 130
    .line 131
    add-float/2addr v5, v8

    .line 132
    aput v5, v1, v2

    .line 133
    .line 134
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 135
    .line 136
    add-int/lit8 v2, v3, 0x1

    .line 137
    .line 138
    iget v5, v7, Landroid/graphics/RectF;->top:F

    .line 139
    .line 140
    aput v5, v1, v3

    .line 141
    .line 142
    add-int/lit8 v3, v2, 0x1

    .line 143
    .line 144
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    iget v7, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 149
    .line 150
    add-int/lit8 v7, v7, 0x1

    .line 151
    .line 152
    int-to-float v7, v7

    .line 153
    div-float/2addr v6, v7

    .line 154
    mul-float/2addr v5, v6

    .line 155
    iget-object v6, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 156
    .line 157
    iget v7, v6, Landroid/graphics/RectF;->left:F

    .line 158
    .line 159
    add-float/2addr v5, v7

    .line 160
    aput v5, v1, v2

    .line 161
    .line 162
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 163
    .line 164
    add-int/lit8 v2, v3, 0x1

    .line 165
    .line 166
    iget v5, v6, Landroid/graphics/RectF;->bottom:F

    .line 167
    .line 168
    aput v5, v1, v3

    .line 169
    .line 170
    add-int/lit8 v0, v0, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 174
    .line 175
    if-eqz v0, :cond_2

    .line 176
    .line 177
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    .line 178
    .line 179
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 180
    .line 181
    .line 182
    :cond_2
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->u:Z

    .line 183
    .line 184
    if-eqz v0, :cond_3

    .line 185
    .line 186
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 187
    .line 188
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    .line 189
    .line 190
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 191
    .line 192
    .line 193
    :cond_3
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    .line 194
    .line 195
    if-eqz v0, :cond_4

    .line 196
    .line 197
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 198
    .line 199
    .line 200
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 201
    .line 202
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 205
    .line 206
    .line 207
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 208
    .line 209
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->J:I

    .line 210
    .line 211
    int-to-float v2, v1

    .line 212
    neg-int v1, v1

    .line 213
    int-to-float v1, v1

    .line 214
    invoke-virtual {v0, v2, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 218
    .line 219
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 220
    .line 221
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    .line 222
    .line 223
    .line 224
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 225
    .line 226
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 232
    .line 233
    iget v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->J:I

    .line 234
    .line 235
    neg-int v2, v1

    .line 236
    int-to-float v2, v2

    .line 237
    int-to-float v1, v1

    .line 238
    invoke-virtual {v0, v2, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->l:Landroid/graphics/RectF;

    .line 242
    .line 243
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 244
    .line 245
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    .line 246
    .line 247
    .line 248
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 249
    .line 250
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    .line 251
    .line 252
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 256
    .line 257
    .line 258
    :cond_4
    return-void
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
.end method

.method protected b(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->w:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->y:Landroid/graphics/Path;

    .line 9
    .line 10
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 17
    .line 18
    sget-object v1, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z

    .line 21
    .line 22
    .line 23
    :goto_0
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->x:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->w:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/high16 v3, 0x40000000    # 2.0f

    .line 64
    .line 65
    div-float/2addr v2, v3

    .line 66
    iget-object v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->z:Landroid/graphics/Paint;

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
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
.end method

.method protected d()V
    .locals 0

    return-void
.end method

.method protected g(Landroid/content/res/TypedArray;)V
    .locals 3

    .line 1
    sget v0, Lef/h;->X:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->w:Z

    .line 9
    .line 10
    sget v0, Lef/h;->Y:I

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget v2, Lef/a;->e:I

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->x:I

    .line 27
    .line 28
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->z:Landroid/graphics/Paint;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->z:Landroid/graphics/Paint;

    .line 34
    .line 35
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->z:Landroid/graphics/Paint;

    .line 41
    .line 42
    const/high16 v1, 0x3f800000    # 1.0f

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Lcom/yalantis/ucrop/view/OverlayView;->e(Landroid/content/res/TypedArray;)V

    .line 48
    .line 49
    .line 50
    sget v0, Lef/h;->f0:I

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput-boolean v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->u:Z

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lcom/yalantis/ucrop/view/OverlayView;->f(Landroid/content/res/TypedArray;)V

    .line 60
    .line 61
    .line 62
    sget v0, Lef/h;->g0:I

    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->v:Z

    .line 69
    .line 70
    return-void
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
.end method

.method public getCropViewRect()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    return-object v0
.end method

.method public getFreestyleCropMode()I
    .locals 1

    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    return v0
.end method

.method public getOverlayViewChangeListener()Lff/d;
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->K:Lff/d;

    return-object v0
.end method

.method public h()V
    .locals 7

    .line 1
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->m:I

    .line 2
    .line 3
    int-to-float v1, v0

    .line 4
    iget v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->s:F

    .line 5
    .line 6
    div-float/2addr v1, v2

    .line 7
    float-to-int v1, v1

    .line 8
    iget v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->n:I

    .line 9
    .line 10
    if-le v1, v3, :cond_0

    .line 11
    .line 12
    int-to-float v1, v3

    .line 13
    mul-float/2addr v1, v2

    .line 14
    float-to-int v1, v1

    .line 15
    sub-int/2addr v0, v1

    .line 16
    div-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    iget-object v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/2addr v3, v0

    .line 25
    int-to-float v3, v3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v4, v4

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    add-int/2addr v5, v1

    .line 36
    add-int/2addr v5, v0

    .line 37
    int-to-float v0, v5

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->n:I

    .line 43
    .line 44
    add-int/2addr v1, v5

    .line 45
    int-to-float v1, v1

    .line 46
    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sub-int/2addr v3, v1

    .line 51
    div-int/lit8 v3, v3, 0x2

    .line 52
    .line 53
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-float v2, v2

    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/2addr v4, v3

    .line 65
    int-to-float v4, v4

    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    iget v6, p0, Lcom/yalantis/ucrop/view/OverlayView;->m:I

    .line 71
    .line 72
    add-int/2addr v5, v6

    .line 73
    int-to-float v5, v5

    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    add-int/2addr v6, v1

    .line 79
    add-int/2addr v6, v3

    .line 80
    int-to-float v1, v6

    .line 81
    invoke-virtual {v0, v2, v4, v5, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 82
    .line 83
    .line 84
    :goto_0
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->K:Lff/d;

    .line 85
    .line 86
    if-eqz v0, :cond_1

    .line 87
    .line 88
    iget-object v1, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Lff/d;->a(Landroid/graphics/RectF;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    invoke-direct {p0}, Lcom/yalantis/ucrop/view/OverlayView;->j()V

    .line 94
    .line 95
    .line 96
    return-void
    .line 97
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/OverlayView;->b(Landroid/graphics/Canvas;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/OverlayView;->a(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
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
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    sub-int/2addr p3, p4

    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    sub-int/2addr p4, p5

    .line 32
    sub-int/2addr p3, p1

    .line 33
    iput p3, p0, Lcom/yalantis/ucrop/view/OverlayView;->m:I

    .line 34
    .line 35
    sub-int/2addr p4, p2

    .line 36
    iput p4, p0, Lcom/yalantis/ucrop/view/OverlayView;->n:I

    .line 37
    .line 38
    iget-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->L:Z

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->L:Z

    .line 44
    .line 45
    iget p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->s:F

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/yalantis/ucrop/view/OverlayView;->setTargetAspectRatio(F)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    iget v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    and-int/lit16 v3, v3, 0xff

    .line 29
    .line 30
    const/4 v4, -0x1

    .line 31
    const/high16 v5, -0x40800000    # -1.0f

    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    if-nez v3, :cond_4

    .line 35
    .line 36
    invoke-direct {p0, v0, v2}, Lcom/yalantis/ucrop/view/OverlayView;->c(FF)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->G:I

    .line 41
    .line 42
    if-eq p1, v4, :cond_1

    .line 43
    .line 44
    move v1, v6

    .line 45
    :cond_1
    if-nez v1, :cond_2

    .line 46
    .line 47
    iput v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 48
    .line 49
    iput v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    cmpg-float p1, p1, v3

    .line 56
    .line 57
    if-gez p1, :cond_3

    .line 58
    .line 59
    iput v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 60
    .line 61
    iput v2, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    .line 62
    .line 63
    :cond_3
    :goto_0
    return v1

    .line 64
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    and-int/lit16 v3, v3, 0xff

    .line 69
    .line 70
    const/4 v7, 0x2

    .line 71
    if-ne v3, v7, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-ne v3, v6, :cond_5

    .line 78
    .line 79
    iget v3, p0, Lcom/yalantis/ucrop/view/OverlayView;->G:I

    .line 80
    .line 81
    if-eq v3, v4, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    int-to-float p1, p1

    .line 88
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    sub-int/2addr v0, v1

    .line 101
    int-to-float v0, v0

    .line 102
    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    int-to-float v0, v0

    .line 111
    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    sub-int/2addr v1, v2

    .line 124
    int-to-float v1, v1

    .line 125
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-direct {p0, p1, v0}, Lcom/yalantis/ucrop/view/OverlayView;->i(FF)V

    .line 130
    .line 131
    .line 132
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 133
    .line 134
    iput v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    .line 135
    .line 136
    return v6

    .line 137
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    and-int/lit16 p1, p1, 0xff

    .line 142
    .line 143
    if-ne p1, v6, :cond_6

    .line 144
    .line 145
    iput v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->E:F

    .line 146
    .line 147
    iput v5, p0, Lcom/yalantis/ucrop/view/OverlayView;->F:F

    .line 148
    .line 149
    iput v4, p0, Lcom/yalantis/ucrop/view/OverlayView;->G:I

    .line 150
    .line 151
    iget-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->K:Lff/d;

    .line 152
    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->k:Landroid/graphics/RectF;

    .line 156
    .line 157
    invoke-interface {p1, v0}, Lff/d;->a(Landroid/graphics/RectF;)V

    .line 158
    .line 159
    .line 160
    :cond_6
    :goto_1
    return v1
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
.end method

.method public setCircleDimmedLayer(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->w:Z

    return-void
.end method

.method public setCropFrameColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setCropFrameStrokeWidth(I)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->B:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setCropGridColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setCropGridColumnCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->r:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public setCropGridCornerColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->C:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setCropGridRowCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->q:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->t:[F

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public setCropGridStrokeWidth(I)V
    .locals 1

    iget-object v0, p0, Lcom/yalantis/ucrop/view/OverlayView;->A:Landroid/graphics/Paint;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    return-void
.end method

.method public setDimmedColor(I)V
    .locals 0

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->x:I

    return-void
.end method

.method public setFreestyleCropEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    return-void
.end method

.method public setFreestyleCropMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->D:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
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
.end method

.method public setOverlayViewChangeListener(Lff/d;)V
    .locals 0

    iput-object p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->K:Lff/d;

    return-void
.end method

.method public setShowCropFrame(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->u:Z

    return-void
.end method

.method public setShowCropGrid(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->v:Z

    return-void
.end method

.method public setTargetAspectRatio(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->s:F

    .line 2
    .line 3
    iget p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->m:I

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/yalantis/ucrop/view/OverlayView;->h()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/yalantis/ucrop/view/OverlayView;->L:Z

    .line 16
    .line 17
    :goto_0
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
.end method
