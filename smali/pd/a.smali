.class public abstract Lpd/a;
.super Lod/k;
.source "SourceFile"


# instance fields
.field private final a:[I

.field private final b:[I

.field private final c:[F

.field private final d:[F

.field private final e:[I

.field private final f:[I


# direct methods
.method protected constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lod/k;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Lpd/a;->a:[I

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    new-array v1, v1, [I

    .line 12
    .line 13
    iput-object v1, p0, Lpd/a;->b:[I

    .line 14
    .line 15
    new-array v2, v0, [F

    .line 16
    .line 17
    iput-object v2, p0, Lpd/a;->c:[F

    .line 18
    .line 19
    new-array v0, v0, [F

    .line 20
    .line 21
    iput-object v0, p0, Lpd/a;->d:[F

    .line 22
    .line 23
    array-length v0, v1

    .line 24
    div-int/lit8 v0, v0, 0x2

    .line 25
    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lpd/a;->e:[I

    .line 29
    .line 30
    array-length v0, v1

    .line 31
    div-int/lit8 v0, v0, 0x2

    .line 32
    .line 33
    new-array v0, v0, [I

    .line 34
    .line 35
    iput-object v0, p0, Lpd/a;->f:[I

    .line 36
    .line 37
    return-void
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
.end method

.method protected static g([I[F)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    move v3, v2

    .line 6
    :goto_0
    array-length v4, p0

    .line 7
    if-ge v3, v4, :cond_1

    .line 8
    .line 9
    aget v4, p1, v3

    .line 10
    .line 11
    cmpg-float v5, v4, v1

    .line 12
    .line 13
    if-gez v5, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    move v1, v4

    .line 17
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    aget p1, p0, v0

    .line 21
    .line 22
    sub-int/2addr p1, v2

    .line 23
    aput p1, p0, v0

    .line 24
    .line 25
    return-void
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
    .line 47
    .line 48
    .line 49
.end method

.method protected static n([I[F)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    move v3, v2

    .line 6
    :goto_0
    array-length v4, p0

    .line 7
    if-ge v3, v4, :cond_1

    .line 8
    .line 9
    aget v4, p1, v3

    .line 10
    .line 11
    cmpl-float v5, v4, v1

    .line 12
    .line 13
    if-lez v5, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    move v1, v4

    .line 17
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    aget p1, p0, v0

    .line 21
    .line 22
    add-int/2addr p1, v2

    .line 23
    aput p1, p0, v0

    .line 24
    .line 25
    return-void
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
    .line 47
    .line 48
    .line 49
.end method

.method protected static o([I)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    aget v1, p0, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    aget v3, p0, v2

    .line 6
    .line 7
    add-int/2addr v1, v3

    .line 8
    const/4 v3, 0x2

    .line 9
    aget v3, p0, v3

    .line 10
    .line 11
    add-int/2addr v3, v1

    .line 12
    const/4 v4, 0x3

    .line 13
    aget v4, p0, v4

    .line 14
    .line 15
    add-int/2addr v3, v4

    .line 16
    int-to-float v1, v1

    .line 17
    int-to-float v3, v3

    .line 18
    div-float/2addr v1, v3

    .line 19
    const v3, 0x3f4aaaab

    .line 20
    .line 21
    .line 22
    cmpl-float v3, v1, v3

    .line 23
    .line 24
    if-ltz v3, :cond_3

    .line 25
    .line 26
    const v3, 0x3f649249

    .line 27
    .line 28
    .line 29
    cmpg-float v1, v1, v3

    .line 30
    .line 31
    if-gtz v1, :cond_3

    .line 32
    .line 33
    array-length v1, p0

    .line 34
    const v3, 0x7fffffff

    .line 35
    .line 36
    .line 37
    const/high16 v4, -0x80000000

    .line 38
    .line 39
    move v5, v0

    .line 40
    :goto_0
    if-ge v5, v1, :cond_2

    .line 41
    .line 42
    aget v6, p0, v5

    .line 43
    .line 44
    if-le v6, v4, :cond_0

    .line 45
    .line 46
    move v4, v6

    .line 47
    :cond_0
    if-ge v6, v3, :cond_1

    .line 48
    .line 49
    move v3, v6

    .line 50
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    mul-int/lit8 v3, v3, 0xa

    .line 54
    .line 55
    if-ge v4, v3, :cond_3

    .line 56
    .line 57
    return v2

    .line 58
    :cond_3
    return v0
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

.method protected static p([I[[I)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    aget-object v1, p1, v0

    .line 6
    .line 7
    const v2, 0x3ee66666    # 0.45f

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1, v2}, Lod/k;->d([I[IF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const v2, 0x3e4ccccd    # 0.2f

    .line 15
    .line 16
    .line 17
    cmpg-float v1, v1, v2

    .line 18
    .line 19
    if-gez v1, :cond_0

    .line 20
    .line 21
    return v0

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    throw p0
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
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method protected final h()[I
    .locals 1

    iget-object v0, p0, Lpd/a;->b:[I

    return-object v0
.end method

.method protected final i()[I
    .locals 1

    iget-object v0, p0, Lpd/a;->a:[I

    return-object v0
.end method

.method protected final j()[I
    .locals 1

    iget-object v0, p0, Lpd/a;->f:[I

    return-object v0
.end method

.method protected final k()[F
    .locals 1

    iget-object v0, p0, Lpd/a;->d:[F

    return-object v0
.end method

.method protected final l()[I
    .locals 1

    iget-object v0, p0, Lpd/a;->e:[I

    return-object v0
.end method

.method protected final m()[F
    .locals 1

    iget-object v0, p0, Lpd/a;->c:[F

    return-object v0
.end method
