.class public Lcom/facebook/react/uimanager/PixelUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDisplayMetricDensity()F
    .locals 1

    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getWindowDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    return v0
.end method

.method public static toDIPFromPixel(F)F
    .locals 1

    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getWindowDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr p0, v0

    return p0
.end method

.method public static toPixelFromDIP(D)F
    .locals 0

    double-to-float p0, p0

    .line 3
    invoke-static {p0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    move-result p0

    return p0
.end method

.method public static toPixelFromDIP(F)F
    .locals 2

    const/4 v0, 0x1

    .line 1
    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getWindowDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 2
    invoke-static {v0, p0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p0

    return p0
.end method

.method public static toPixelFromSP(D)F
    .locals 0

    double-to-float p0, p0

    .line 5
    invoke-static {p0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(F)F

    move-result p0

    return p0
.end method

.method public static toPixelFromSP(F)F
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 1
    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP(FF)F

    move-result p0

    return p0
.end method

.method public static toPixelFromSP(FF)F
    .locals 4

    .line 2
    invoke-static {}, Lcom/facebook/react/uimanager/DisplayMetricsHolder;->getWindowDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 3
    iget v1, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 4
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    div-float v2, v1, v0

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, p1, v3

    if-ltz v3, :cond_0

    cmpg-float v2, p1, v2

    if-gez v2, :cond_0

    mul-float v1, v0, p1

    :cond_0
    mul-float/2addr p0, v1

    return p0
.end method
