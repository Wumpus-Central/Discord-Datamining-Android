.class public Lorg/webrtc/RendererCommon;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/webrtc/RendererCommon$ScalingType;,
        Lorg/webrtc/RendererCommon$VideoLayoutMeasure;,
        Lorg/webrtc/RendererCommon$GlDrawer;,
        Lorg/webrtc/RendererCommon$RendererEvents;
    }
.end annotation


# static fields
.field private static BALANCED_VISIBLE_FRACTION:F = 0.5625f


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lorg/webrtc/RendererCommon$ScalingType;)F
    .locals 0

    invoke-static {p0}, Lorg/webrtc/RendererCommon;->convertScalingTypeToVisibleFraction(Lorg/webrtc/RendererCommon$ScalingType;)F

    move-result p0

    return p0
.end method

.method private static adjustOrigin([F)V
    .locals 7

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    aget v1, p0, v0

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget v2, p0, v2

    .line 7
    .line 8
    const/4 v3, 0x4

    .line 9
    aget v3, p0, v3

    .line 10
    .line 11
    add-float/2addr v2, v3

    .line 12
    const/high16 v3, 0x3f000000    # 0.5f

    .line 13
    .line 14
    mul-float/2addr v2, v3

    .line 15
    sub-float/2addr v1, v2

    .line 16
    aput v1, p0, v0

    .line 17
    .line 18
    const/16 v2, 0xd

    .line 19
    .line 20
    aget v4, p0, v2

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    aget v5, p0, v5

    .line 24
    .line 25
    const/4 v6, 0x5

    .line 26
    aget v6, p0, v6

    .line 27
    .line 28
    add-float/2addr v5, v6

    .line 29
    mul-float/2addr v5, v3

    .line 30
    sub-float/2addr v4, v5

    .line 31
    aput v4, p0, v2

    .line 32
    .line 33
    add-float/2addr v1, v3

    .line 34
    aput v1, p0, v0

    .line 35
    .line 36
    add-float/2addr v4, v3

    .line 37
    aput v4, p0, v2

    .line 38
    .line 39
    return-void
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
    .line 88
    .line 89
    .line 90
.end method

.method public static convertMatrixFromAndroidGraphicsMatrix(Landroid/graphics/Matrix;)[F
    .locals 8

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v1, v0, [F

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x10

    .line 9
    .line 10
    new-array p0, p0, [F

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget v3, v1, v2

    .line 14
    .line 15
    aput v3, p0, v2

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    aget v3, v1, v2

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    aput v3, p0, v4

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    aput v5, p0, v3

    .line 26
    .line 27
    const/4 v6, 0x6

    .line 28
    aget v7, v1, v6

    .line 29
    .line 30
    aput v7, p0, v2

    .line 31
    .line 32
    aget v2, v1, v4

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    aput v2, p0, v4

    .line 36
    .line 37
    aget v2, v1, v4

    .line 38
    .line 39
    const/4 v4, 0x5

    .line 40
    aput v2, p0, v4

    .line 41
    .line 42
    aput v5, p0, v6

    .line 43
    .line 44
    const/4 v2, 0x7

    .line 45
    aget v6, v1, v2

    .line 46
    .line 47
    aput v6, p0, v2

    .line 48
    .line 49
    const/16 v2, 0x8

    .line 50
    .line 51
    aput v5, p0, v2

    .line 52
    .line 53
    aput v5, p0, v0

    .line 54
    .line 55
    const/16 v0, 0xa

    .line 56
    .line 57
    const/high16 v6, 0x3f800000    # 1.0f

    .line 58
    .line 59
    aput v6, p0, v0

    .line 60
    .line 61
    const/16 v0, 0xb

    .line 62
    .line 63
    aput v5, p0, v0

    .line 64
    .line 65
    const/16 v0, 0xc

    .line 66
    .line 67
    aget v3, v1, v3

    .line 68
    .line 69
    aput v3, p0, v0

    .line 70
    .line 71
    const/16 v0, 0xd

    .line 72
    .line 73
    aget v3, v1, v4

    .line 74
    .line 75
    aput v3, p0, v0

    .line 76
    .line 77
    const/16 v0, 0xe

    .line 78
    .line 79
    aput v5, p0, v0

    .line 80
    .line 81
    const/16 v0, 0xf

    .line 82
    .line 83
    aget v1, v1, v2

    .line 84
    .line 85
    aput v1, p0, v0

    .line 86
    .line 87
    return-object p0
    .line 88
    .line 89
    .line 90
.end method

.method public static convertMatrixToAndroidGraphicsMatrix([F)Landroid/graphics/Matrix;
    .locals 5

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    aget v2, p0, v1

    .line 7
    .line 8
    aput v2, v0, v1

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    aget v2, p0, v1

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput v2, v0, v3

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    aget v2, p0, v2

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    aput v2, v0, v4

    .line 22
    .line 23
    aget v2, p0, v3

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    aput v2, v0, v3

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    aget v4, p0, v2

    .line 30
    .line 31
    aput v4, v0, v1

    .line 32
    .line 33
    const/16 v1, 0xd

    .line 34
    .line 35
    aget v1, p0, v1

    .line 36
    .line 37
    aput v1, v0, v2

    .line 38
    .line 39
    const/4 v1, 0x6

    .line 40
    aget v2, p0, v3

    .line 41
    .line 42
    aput v2, v0, v1

    .line 43
    .line 44
    const/4 v1, 0x7

    .line 45
    aget v2, p0, v1

    .line 46
    .line 47
    aput v2, v0, v1

    .line 48
    .line 49
    const/16 v1, 0xf

    .line 50
    .line 51
    aget p0, p0, v1

    .line 52
    .line 53
    const/16 v1, 0x8

    .line 54
    .line 55
    aput p0, v0, v1

    .line 56
    .line 57
    new-instance p0, Landroid/graphics/Matrix;

    .line 58
    .line 59
    invoke-direct {p0}, Landroid/graphics/Matrix;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/graphics/Matrix;->setValues([F)V

    .line 63
    .line 64
    .line 65
    return-object p0
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

.method private static convertScalingTypeToVisibleFraction(Lorg/webrtc/RendererCommon$ScalingType;)F
    .locals 1

    .line 1
    sget-object v0, Lorg/webrtc/RendererCommon$1;->$SwitchMap$org$webrtc$RendererCommon$ScalingType:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aget p0, v0, p0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p0, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    sget p0, Lorg/webrtc/RendererCommon;->BALANCED_VISIBLE_FRACTION:F

    .line 19
    .line 20
    return p0

    .line 21
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0

    .line 29
    :cond_2
    const/high16 p0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    return p0
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

.method public static getDisplaySize(FFII)Landroid/graphics/Point;
    .locals 2

    const/4 v0, 0x0

    cmpl-float v1, p0, v0

    if-eqz v1, :cond_1

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v0, p3

    div-float/2addr v0, p0

    mul-float/2addr v0, p1

    .line 2
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 3
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float p2, p2

    div-float/2addr p2, p0

    div-float/2addr p2, p1

    .line 4
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p0

    .line 5
    invoke-static {p3, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 6
    new-instance p1, Landroid/graphics/Point;

    invoke-direct {p1, v0, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object p1

    .line 7
    :cond_1
    :goto_0
    new-instance p0, Landroid/graphics/Point;

    invoke-direct {p0, p2, p3}, Landroid/graphics/Point;-><init>(II)V

    return-object p0
.end method

.method public static getDisplaySize(Lorg/webrtc/RendererCommon$ScalingType;FII)Landroid/graphics/Point;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/webrtc/RendererCommon;->convertScalingTypeToVisibleFraction(Lorg/webrtc/RendererCommon$ScalingType;)F

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lorg/webrtc/RendererCommon;->getDisplaySize(FFII)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method public static getLayoutMatrix(ZFF)[F
    .locals 2

    .line 1
    cmpl-float v0, p2, p1

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    div-float/2addr p1, p2

    .line 8
    move p2, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    div-float/2addr p2, p1

    .line 11
    move p1, v1

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    const/high16 p0, -0x40800000    # -1.0f

    .line 15
    .line 16
    mul-float/2addr p2, p0

    .line 17
    :cond_1
    const/16 p0, 0x10

    .line 18
    .line 19
    new-array p0, p0, [F

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, p2, p1, v1}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Lorg/webrtc/RendererCommon;->adjustOrigin([F)V

    .line 29
    .line 30
    .line 31
    return-object p0
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
.end method
