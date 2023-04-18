.class public final Lyd/d;
.super Lcd/o;
.source "SourceFile"


# instance fields
.field private final c:F

.field private final d:I


# direct methods
.method constructor <init>(FFF)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lyd/d;-><init>(FFFI)V

    return-void
.end method

.method private constructor <init>(FFFI)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcd/o;-><init>(FF)V

    .line 3
    iput p3, p0, Lyd/d;->c:F

    .line 4
    iput p4, p0, Lyd/d;->d:I

    return-void
.end method


# virtual methods
.method f(FFF)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcd/o;->d()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr p2, v0

    .line 6
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    cmpg-float p2, p2, p1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-gtz p2, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lcd/o;->c()F

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    sub-float/2addr p3, p2

    .line 20
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    cmpg-float p2, p2, p1

    .line 25
    .line 26
    if-gtz p2, :cond_2

    .line 27
    .line 28
    iget p2, p0, Lyd/d;->c:F

    .line 29
    .line 30
    sub-float/2addr p1, p2

    .line 31
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/high16 p2, 0x3f800000    # 1.0f

    .line 36
    .line 37
    cmpg-float p2, p1, p2

    .line 38
    .line 39
    if-lez p2, :cond_1

    .line 40
    .line 41
    iget p2, p0, Lyd/d;->c:F

    .line 42
    .line 43
    cmpg-float p1, p1, p2

    .line 44
    .line 45
    if-gtz p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return v0

    .line 49
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_2
    return v0
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

.method g(FFF)Lyd/d;
    .locals 4

    .line 1
    iget v0, p0, Lyd/d;->d:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    invoke-virtual {p0}, Lcd/o;->c()F

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    mul-float/2addr v0, v2

    .line 11
    add-float/2addr v0, p2

    .line 12
    int-to-float p2, v1

    .line 13
    div-float/2addr v0, p2

    .line 14
    iget v2, p0, Lyd/d;->d:I

    .line 15
    .line 16
    int-to-float v2, v2

    .line 17
    invoke-virtual {p0}, Lcd/o;->d()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    mul-float/2addr v2, v3

    .line 22
    add-float/2addr v2, p1

    .line 23
    div-float/2addr v2, p2

    .line 24
    iget p1, p0, Lyd/d;->d:I

    .line 25
    .line 26
    int-to-float p1, p1

    .line 27
    iget v3, p0, Lyd/d;->c:F

    .line 28
    .line 29
    mul-float/2addr p1, v3

    .line 30
    add-float/2addr p1, p3

    .line 31
    div-float/2addr p1, p2

    .line 32
    new-instance p2, Lyd/d;

    .line 33
    .line 34
    invoke-direct {p2, v0, v2, p1, v1}, Lyd/d;-><init>(FFFI)V

    .line 35
    .line 36
    .line 37
    return-object p2
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

.method h()I
    .locals 1

    iget v0, p0, Lyd/d;->d:I

    return v0
.end method

.method public i()F
    .locals 1

    iget v0, p0, Lyd/d;->c:F

    return v0
.end method
