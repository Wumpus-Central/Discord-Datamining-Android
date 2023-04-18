.class final enum Lej/e$b;
.super Lej/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lej/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lej/e;-><init>(Ljava/lang/String;ILej/e$a;)V

    return-void
.end method

.method private m(D)D
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lej/e$b;->q(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-direct {p0, p1, p2}, Lej/e$b;->r(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    mul-double/2addr v0, p1

    .line 26
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    return-wide p1
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

.method private n(D)D
    .locals 8

    .line 1
    invoke-direct {p0, p1, p2}, Lej/e$b;->o(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const-wide v4, 0x3eed5c31593e5fb7L    # 1.4E-5

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr v4, p1

    .line 19
    const-wide v6, 0x3f73bafd976ff3aeL    # 0.004817

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    add-double/2addr v4, v6

    .line 25
    mul-double/2addr v4, p1

    .line 26
    const-wide v6, 0x3ffea235b4edb2f6L    # 1.914602

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    sub-double/2addr v6, v4

    .line 32
    mul-double/2addr v2, v6

    .line 33
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 34
    .line 35
    mul-double/2addr v4, v0

    .line 36
    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    const-wide v6, 0x3f1a79fec99f1ae3L    # 1.01E-4

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    mul-double/2addr p1, v6

    .line 46
    const-wide v6, 0x3f94790b84988095L    # 0.019993

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    sub-double/2addr v6, p1

    .line 52
    mul-double/2addr v4, v6

    .line 53
    add-double/2addr v2, v4

    .line 54
    const-wide/high16 p1, 0x4008000000000000L    # 3.0

    .line 55
    .line 56
    mul-double/2addr v0, p1

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    const-wide v0, 0x3f32f09d8c6d612cL    # 2.89E-4

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    mul-double/2addr p1, v0

    .line 67
    add-double/2addr v2, p1

    .line 68
    return-wide v2
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

.method private o(D)D
    .locals 4

    const-wide v0, 0x3f242550f260db0cL    # 1.537E-4

    mul-double/2addr v0, p1

    const-wide v2, 0x40e193e19bf9c62aL    # 35999.05029

    sub-double/2addr v2, v0

    mul-double/2addr v2, p1

    const-wide p1, 0x407658773c0c1fc9L    # 357.52911

    add-double/2addr v2, p1

    return-wide v2
.end method

.method private p(D)D
    .locals 4

    const-wide v0, 0x3f33deda158aabc0L    # 3.032E-4

    mul-double/2addr v0, p1

    const-wide v2, 0x40e19418a272862fL    # 36000.76983

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide p1, 0x407187769ec2ce46L    # 280.46646

    add-double/2addr v0, p1

    const-wide p1, 0x4076800000000000L    # 360.0

    rem-double/2addr v0, p1

    return-wide v0
.end method

.method private q(D)D
    .locals 4

    const-wide v0, 0x3f5db445ed4a1ad6L    # 0.001813

    mul-double/2addr v0, p1

    const-wide v2, -0x40bcaab8a5ce5b42L    # -5.9E-4

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide v2, -0x3fb897ae147ae148L    # -46.815

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide v2, 0x403572b020c49ba6L    # 21.448

    add-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, v2

    const-wide v2, 0x40376eeeeeeeeeefL    # 23.433333333333334

    add-double/2addr v0, v2

    const-wide v2, 0x409e388b43958106L    # 1934.136

    mul-double/2addr p1, v2

    const-wide v2, 0x405f428f5c28f5c3L    # 125.04

    sub-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    move-result-wide p1

    const-wide v2, 0x3f64f8b588e368f1L    # 0.00256

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    return-wide v0
.end method

.method private r(D)D
    .locals 4

    .line 1
    invoke-direct {p0, p1, p2}, Lej/e$b;->p(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-direct {p0, p1, p2}, Lej/e$b;->n(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    add-double/2addr v0, v2

    .line 10
    const-wide v2, 0x3f774e65bea0ba1fL    # 0.00569

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    sub-double/2addr v0, v2

    .line 16
    const-wide v2, 0x409e388b43958106L    # 1934.136

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    mul-double/2addr p1, v2

    .line 22
    const-wide v2, 0x405f428f5c28f5c3L    # 125.04

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    sub-double/2addr v2, p1

    .line 28
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    const-wide v2, 0x3f7394317acc4ef9L    # 0.00478

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    mul-double/2addr p1, v2

    .line 42
    sub-double/2addr v0, p1

    .line 43
    return-wide v0
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


# virtual methods
.method public f(D)D
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lej/e;->b(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lej/e$b;->m(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
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

.method public k(D)D
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lej/e;->b(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lej/e$b;->r(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-direct {p0, p1, p2}, Lej/e$b;->q(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    mul-double/2addr p1, v2

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide p1

    .line 42
    invoke-static {p1, p2}, Lej/a;->b(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    return-wide p1
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
