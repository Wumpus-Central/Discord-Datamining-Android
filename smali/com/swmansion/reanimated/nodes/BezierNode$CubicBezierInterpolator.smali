.class Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/swmansion/reanimated/nodes/BezierNode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CubicBezierInterpolator"
.end annotation


# instance fields
.field protected a:Landroid/graphics/PointF;

.field protected b:Landroid/graphics/PointF;

.field protected c:Landroid/graphics/PointF;

.field protected end:Landroid/graphics/PointF;

.field protected start:Landroid/graphics/PointF;


# direct methods
.method public constructor <init>(FFFF)V
    .locals 1

    .line 7
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PointF;-><init>(FF)V

    new-instance p1, Landroid/graphics/PointF;

    invoke-direct {p1, p3, p4}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-direct {p0, v0, p1}, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;-><init>(Landroid/graphics/PointF;Landroid/graphics/PointF;)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/PointF;Landroid/graphics/PointF;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->a:Landroid/graphics/PointF;

    .line 3
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->b:Landroid/graphics/PointF;

    .line 4
    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    iput-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->c:Landroid/graphics/PointF;

    .line 5
    iput-object p1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->start:Landroid/graphics/PointF;

    .line 6
    iput-object p2, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->end:Landroid/graphics/PointF;

    return-void
.end method

.method private getBezierCoordinateX(F)F
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->c:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->start:Landroid/graphics/PointF;

    .line 4
    .line 5
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 6
    .line 7
    const/high16 v3, 0x40400000    # 3.0f

    .line 8
    .line 9
    mul-float/2addr v2, v3

    .line 10
    iput v2, v0, Landroid/graphics/PointF;->x:F

    .line 11
    .line 12
    iget-object v4, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->b:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget-object v5, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->end:Landroid/graphics/PointF;

    .line 15
    .line 16
    iget v5, v5, Landroid/graphics/PointF;->x:F

    .line 17
    .line 18
    iget v1, v1, Landroid/graphics/PointF;->x:F

    .line 19
    .line 20
    sub-float/2addr v5, v1

    .line 21
    mul-float/2addr v5, v3

    .line 22
    sub-float/2addr v5, v2

    .line 23
    iput v5, v4, Landroid/graphics/PointF;->x:F

    .line 24
    .line 25
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->a:Landroid/graphics/PointF;

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 30
    .line 31
    sub-float/2addr v2, v3

    .line 32
    sub-float/2addr v2, v5

    .line 33
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    iget v0, v0, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    iget v1, v4, Landroid/graphics/PointF;->x:F

    .line 38
    .line 39
    mul-float/2addr v2, p1

    .line 40
    add-float/2addr v1, v2

    .line 41
    mul-float/2addr v1, p1

    .line 42
    add-float/2addr v0, v1

    .line 43
    mul-float/2addr p1, v0

    .line 44
    return p1
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
.end method

.method private getXDerivate(F)F
    .locals 4

    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->c:Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->b:Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v1, v2

    iget-object v2, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->a:Landroid/graphics/PointF;

    iget v2, v2, Landroid/graphics/PointF;->x:F

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v2, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    mul-float/2addr p1, v1

    add-float/2addr v0, p1

    return v0
.end method


# virtual methods
.method protected getBezierCoordinateY(F)F
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->c:Landroid/graphics/PointF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->start:Landroid/graphics/PointF;

    .line 4
    .line 5
    iget v2, v1, Landroid/graphics/PointF;->y:F

    .line 6
    .line 7
    const/high16 v3, 0x40400000    # 3.0f

    .line 8
    .line 9
    mul-float/2addr v2, v3

    .line 10
    iput v2, v0, Landroid/graphics/PointF;->y:F

    .line 11
    .line 12
    iget-object v4, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->b:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget-object v5, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->end:Landroid/graphics/PointF;

    .line 15
    .line 16
    iget v5, v5, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 19
    .line 20
    sub-float/2addr v5, v1

    .line 21
    mul-float/2addr v5, v3

    .line 22
    sub-float/2addr v5, v2

    .line 23
    iput v5, v4, Landroid/graphics/PointF;->y:F

    .line 24
    .line 25
    iget-object v1, p0, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->a:Landroid/graphics/PointF;

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iget v3, v0, Landroid/graphics/PointF;->y:F

    .line 30
    .line 31
    sub-float/2addr v2, v3

    .line 32
    sub-float/2addr v2, v5

    .line 33
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 36
    .line 37
    iget v1, v4, Landroid/graphics/PointF;->y:F

    .line 38
    .line 39
    mul-float/2addr v2, p1

    .line 40
    add-float/2addr v1, v2

    .line 41
    mul-float/2addr v1, p1

    .line 42
    add-float/2addr v0, v1

    .line 43
    mul-float/2addr p1, v0

    .line 44
    return p1
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
.end method

.method public getInterpolation(F)F
    .locals 0

    invoke-virtual {p0, p1}, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->getXForTime(F)F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->getBezierCoordinateY(F)F

    move-result p1

    return p1
.end method

.method protected getXForTime(F)F
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    move v1, p1

    .line 3
    :goto_0
    const/16 v2, 0xe

    .line 4
    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, v1}, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->getBezierCoordinateX(F)F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    sub-float/2addr v2, p1

    .line 12
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    float-to-double v3, v3

    .line 17
    const-wide v5, 0x3f50624dd2f1a9fcL    # 0.001

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    cmpg-double v3, v3, v5

    .line 23
    .line 24
    if-gez v3, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    invoke-direct {p0, v1}, Lcom/swmansion/reanimated/nodes/BezierNode$CubicBezierInterpolator;->getXDerivate(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    div-float/2addr v2, v3

    .line 32
    sub-float/2addr v1, v2

    .line 33
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    :goto_1
    return v1
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
.end method
