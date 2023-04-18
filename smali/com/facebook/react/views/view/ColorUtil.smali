.class public Lcom/facebook/react/views/view/ColorUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static clamp255(D)I
    .locals 0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-int p0, p0

    const/16 p1, 0xff

    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static getOpacityFromColor(I)I
    .locals 1

    ushr-int/lit8 p0, p0, 0x18

    const/16 v0, 0xff

    if-ne p0, v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-nez p0, :cond_1

    const/4 p0, -0x2

    return p0

    :cond_1
    const/4 p0, -0x3

    return p0
.end method

.method public static multiplyColorAlpha(II)I
    .locals 2

    const/16 v0, 0xff

    if-ne p1, v0, :cond_0

    return p0

    :cond_0
    const v0, 0xffffff

    if-nez p1, :cond_1

    and-int/2addr p0, v0

    return p0

    :cond_1
    shr-int/lit8 v1, p1, 0x7

    add-int/2addr p1, v1

    ushr-int/lit8 v1, p0, 0x18

    mul-int/2addr v1, p1

    shr-int/lit8 p1, v1, 0x8

    shl-int/lit8 p1, p1, 0x18

    and-int/2addr p0, v0

    or-int/2addr p0, p1

    return p0
.end method

.method public static normalize(DDDD)I
    .locals 2

    const-wide v0, 0x406fe00000000000L    # 255.0

    mul-double/2addr p6, v0

    invoke-static {p6, p7}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    move-result p6

    shl-int/lit8 p6, p6, 0x18

    invoke-static {p0, p1}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    move-result p0

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, p6

    invoke-static {p2, p3}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    move-result p1

    shl-int/lit8 p1, p1, 0x8

    or-int/2addr p0, p1

    invoke-static {p4, p5}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    move-result p1

    or-int/2addr p0, p1

    return p0
.end method
