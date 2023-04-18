.class final Lbc/w0$c;
.super Lbc/w0$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lbc/w0$d<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private c:[Ljava/lang/Object;

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbc/w0$d;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lbc/w0$c;->d:I

    .line 9
    .line 10
    iput p1, p0, Lbc/w0$c;->e:I

    .line 11
    .line 12
    return-void
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

.method static g([Ljava/lang/Object;)Z
    .locals 9

    .line 1
    array-length v0, p0

    .line 2
    invoke-static {v0}, Lbc/w0$c;->i(I)I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    array-length v1, p0

    .line 7
    const/4 v2, 0x1

    .line 8
    sub-int/2addr v1, v2

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    move v5, v4

    .line 12
    :goto_0
    array-length v6, p0

    .line 13
    if-ge v4, v6, :cond_4

    .line 14
    .line 15
    if-ne v4, v5, :cond_1

    .line 16
    .line 17
    aget-object v6, p0, v4

    .line 18
    .line 19
    if-nez v6, :cond_1

    .line 20
    .line 21
    add-int v5, v4, v0

    .line 22
    .line 23
    add-int/lit8 v6, v5, -0x1

    .line 24
    .line 25
    and-int/2addr v6, v1

    .line 26
    aget-object v6, p0, v6

    .line 27
    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    move v5, v4

    .line 34
    :goto_1
    move v4, v5

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    add-int/2addr v4, v0

    .line 37
    add-int/lit8 v6, v4, -0x1

    .line 38
    .line 39
    :goto_2
    if-lt v6, v5, :cond_3

    .line 40
    .line 41
    and-int v7, v6, v1

    .line 42
    .line 43
    aget-object v7, p0, v7

    .line 44
    .line 45
    if-nez v7, :cond_2

    .line 46
    .line 47
    add-int/lit8 v5, v6, 0x1

    .line 48
    .line 49
    move v8, v5

    .line 50
    move v5, v4

    .line 51
    move v4, v8

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    add-int/lit8 v6, v6, -0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    return v2

    .line 57
    :cond_4
    return v3
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

.method private h(Ljava/lang/Object;)Lbc/w0$d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lbc/w0$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Lbc/z;->b(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object v2, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    add-int/lit8 v2, v2, -0x1

    .line 18
    .line 19
    move v3, v1

    .line 20
    :goto_0
    sub-int v4, v3, v1

    .line 21
    .line 22
    iget v5, p0, Lbc/w0$c;->d:I

    .line 23
    .line 24
    if-ge v4, v5, :cond_2

    .line 25
    .line 26
    and-int v4, v3, v2

    .line 27
    .line 28
    iget-object v5, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v5, v5, v4

    .line 31
    .line 32
    if-nez v5, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lbc/w0$d;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 38
    .line 39
    aput-object p1, v1, v4

    .line 40
    .line 41
    iget p1, p0, Lbc/w0$c;->f:I

    .line 42
    .line 43
    add-int/2addr p1, v0

    .line 44
    iput p1, p0, Lbc/w0$c;->f:I

    .line 45
    .line 46
    iget p1, p0, Lbc/w0$d;->b:I

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lbc/w0$c;->f(I)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    invoke-virtual {v5, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v0, Lbc/w0$b;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lbc/w0$b;-><init>(Lbc/w0$d;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p1}, Lbc/w0$b;->a(Ljava/lang/Object;)Lbc/w0$d;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
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

.method static i(I)I
    .locals 1

    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    invoke-static {p0, v0}, Ldc/a;->c(ILjava/math/RoundingMode;)I

    move-result p0

    mul-int/lit8 p0, p0, 0xd

    return p0
.end method

.method static j(I[Ljava/lang/Object;I)[Ljava/lang/Object;
    .locals 6

    .line 1
    new-array v0, p0, [Ljava/lang/Object;

    .line 2
    .line 3
    add-int/lit8 p0, p0, -0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, p2, :cond_1

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v3}, Lbc/z;->b(I)I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_1
    and-int v4, v3, p0

    .line 22
    .line 23
    aget-object v5, v0, v4

    .line 24
    .line 25
    if-nez v5, :cond_0

    .line 26
    .line 27
    aput-object v2, v0, v4

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    return-object v0
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


# virtual methods
.method a(Ljava/lang/Object;)Lbc/w0$d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lbc/w0$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lac/i;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lbc/w0$d;->b:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lbc/w0$d;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object v0, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 17
    .line 18
    array-length v0, v0

    .line 19
    invoke-virtual {p0, v0}, Lbc/w0$c;->f(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aget-object v0, v0, v1

    .line 26
    .line 27
    iget v1, p0, Lbc/w0$d;->b:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    iput v1, p0, Lbc/w0$d;->b:I

    .line 32
    .line 33
    invoke-direct {p0, v0}, Lbc/w0$c;->h(Ljava/lang/Object;)Lbc/w0$d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p1}, Lbc/w0$d;->a(Ljava/lang/Object;)Lbc/w0$d;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    invoke-direct {p0, p1}, Lbc/w0$c;->h(Ljava/lang/Object;)Lbc/w0$d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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

.method c()Lbc/w0;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Lbc/w0$d;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v2, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    if-ne v0, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    new-instance v0, Lbc/w1;

    .line 19
    .line 20
    iget v3, p0, Lbc/w0$c;->f:I

    .line 21
    .line 22
    iget-object v4, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    check-cast v4, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v5, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 30
    .line 31
    array-length v5, v5

    .line 32
    sub-int/2addr v5, v1

    .line 33
    invoke-direct {v0, v2, v3, v4, v5}, Lbc/w1;-><init>([Ljava/lang/Object;I[Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_1
    iget-object v0, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    aget-object v0, v0, v1

    .line 41
    .line 42
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lbc/w0;->y(Ljava/lang/Object;)Lbc/w0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_2
    invoke-static {}, Lbc/w0;->x()Lbc/w0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
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

.method e()Lbc/w0$d;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/w0$d<",
            "TE;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget v0, p0, Lbc/w0$d;->b:I

    .line 7
    .line 8
    invoke-static {v0}, Lbc/w0;->q(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    mul-int/lit8 v1, v0, 0x2

    .line 13
    .line 14
    iget-object v2, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    array-length v2, v2

    .line 17
    if-ge v1, v2, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 20
    .line 21
    iget v2, p0, Lbc/w0$d;->b:I

    .line 22
    .line 23
    invoke-static {v0, v1, v2}, Lbc/w0$c;->j(I[Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {v0}, Lbc/w0$c;->i(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Lbc/w0$c;->d:I

    .line 34
    .line 35
    const-wide v1, 0x3fe6666666666666L    # 0.7

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    int-to-double v3, v0

    .line 41
    mul-double/2addr v3, v1

    .line 42
    double-to-int v0, v3

    .line 43
    iput v0, p0, Lbc/w0$c;->e:I

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0}, Lbc/w0$c;->g([Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    new-instance v0, Lbc/w0$b;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lbc/w0$b;-><init>(Lbc/w0$d;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v0, p0

    .line 60
    :goto_0
    return-object v0
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

.method f(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Lbc/w0;->q(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    new-array v0, p1, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v1, p0, Lbc/w0$c;->e:I

    .line 15
    .line 16
    if-le p1, v1, :cond_1

    .line 17
    .line 18
    array-length p1, v0

    .line 19
    const/high16 v1, 0x40000000    # 2.0f

    .line 20
    .line 21
    if-ge p1, v1, :cond_1

    .line 22
    .line 23
    array-length p1, v0

    .line 24
    mul-int/lit8 p1, p1, 0x2

    .line 25
    .line 26
    iget-object v0, p0, Lbc/w0$d;->a:[Ljava/lang/Object;

    .line 27
    .line 28
    iget v1, p0, Lbc/w0$d;->b:I

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, Lbc/w0$c;->j(I[Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lbc/w0$c;->c:[Ljava/lang/Object;

    .line 35
    .line 36
    :goto_0
    invoke-static {p1}, Lbc/w0$c;->i(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Lbc/w0$c;->d:I

    .line 41
    .line 42
    const-wide v0, 0x3fe6666666666666L    # 0.7

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    int-to-double v2, p1

    .line 48
    mul-double/2addr v2, v0

    .line 49
    double-to-int p1, v2

    .line 50
    iput p1, p0, Lbc/w0$c;->e:I

    .line 51
    .line 52
    :cond_1
    return-void
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
