.class final enum Lej/e$a;
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
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lej/c;->f(D)Lej/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lej/c;->h()Lnet/time4j/a0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lnet/time4j/tz/p;->u:Lnet/time4j/tz/p;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lnet/time4j/a0;->w0(Lnet/time4j/tz/k;)Lnet/time4j/h0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2}, Lnet/time4j/f0;->F0()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-double v0, p2

    .line 24
    invoke-virtual {p1}, Lnet/time4j/h0;->a0()Lnet/time4j/g0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    sget-object p2, Lnet/time4j/g0;->J:Lnet/time4j/k0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    int-to-double p1, p1

    .line 41
    const-wide v2, 0x40f5180000000000L    # 86400.0

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    div-double/2addr p1, v2

    .line 47
    add-double/2addr v0, p1

    .line 48
    return-wide v0
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
    .locals 4

    .line 1
    const-wide v0, 0x3fef8a0902de00d2L    # 0.9856

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr p1, v0

    .line 7
    const-wide v0, 0x400a4fdf3b645a1dL    # 3.289

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    sub-double/2addr p1, v0

    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0x3ffea7ef9db22d0eL    # 1.916

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-double/2addr v0, v2

    .line 27
    add-double/2addr v0, p1

    .line 28
    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    .line 29
    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    mul-double/2addr p1, v2

    .line 35
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    const-wide v2, 0x3f947ae147ae147bL    # 0.02

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    mul-double/2addr p1, v2

    .line 45
    add-double/2addr v0, p1

    .line 46
    const-wide p1, 0x4071aa24dd2f1aa0L    # 282.634

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    add-double/2addr v0, p1

    .line 52
    invoke-static {v0, v1}, Lej/a;->b(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    return-wide p1
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
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lej/e$a;->m(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lej/e$a;->n(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    const-wide v0, 0x3fd975e2046c764bL    # 0.39782

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr p1, v0

    .line 23
    invoke-static {p1, p2}, Ljava/lang/Math;->asin(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    return-wide p1
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

.method public k(D)D
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2}, Lej/e$a;->m(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    invoke-direct {p0, p1, p2}, Lej/e$a;->n(D)D

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide v2, 0x3fed5d4e8fb00bccL    # 0.91764

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    mul-double/2addr v0, v2

    .line 23
    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lej/a;->b(D)D

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    const-wide v2, 0x4056800000000000L    # 90.0

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    div-double/2addr p1, v2

    .line 41
    invoke-static {p1, p2}, Ljava/lang/Math;->floor(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    mul-double/2addr p1, v2

    .line 46
    div-double v4, v0, v2

    .line 47
    .line 48
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    mul-double/2addr v4, v2

    .line 53
    add-double/2addr v0, p1

    .line 54
    sub-double/2addr v0, v4

    .line 55
    return-wide v0
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
