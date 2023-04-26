.class Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Interpolator;


# static fields
.field private static final FACTOR:F = 0.5f

.field public static final PARAM_SPRING_DAMPING:Ljava/lang/String; = "springDamping"


# instance fields
.field private final mSpringDamping:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f000000    # 0.5f

    .line 2
    iput v0, p0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->mSpringDamping:F

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->mSpringDamping:F

    return-void
.end method

.method public static getSpringDamping(Lcom/facebook/react/bridge/ReadableMap;)F
    .locals 3

    .line 1
    const-string v0, "springDamping"

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    double-to-float p0, v0

    .line 20
    return p0

    .line 21
    :cond_0
    const/high16 p0, 0x3f000000    # 0.5f

    .line 22
    .line 23
    return p0
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
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 9

    .line 1
    const/high16 v0, -0x3ee00000    # -10.0f

    .line 2
    .line 3
    mul-float/2addr v0, p1

    .line 4
    float-to-double v0, v0

    .line 5
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget v4, p0, Lcom/facebook/react/uimanager/layoutanimation/SimpleSpringInterpolator;->mSpringDamping:F

    .line 12
    .line 13
    const/high16 v5, 0x40800000    # 4.0f

    .line 14
    .line 15
    div-float v5, v4, v5

    .line 16
    .line 17
    sub-float/2addr p1, v5

    .line 18
    float-to-double v5, p1

    .line 19
    const-wide v7, 0x400921fb54442d18L    # Math.PI

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    mul-double/2addr v5, v7

    .line 25
    mul-double/2addr v5, v2

    .line 26
    float-to-double v2, v4

    .line 27
    div-double/2addr v5, v2

    .line 28
    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    mul-double/2addr v0, v2

    .line 33
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 34
    .line 35
    add-double/2addr v0, v2

    .line 36
    double-to-float p1, v0

    .line 37
    return p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
.end method
