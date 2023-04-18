.class final Lpa/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[C

.field final c:I

.field final d:I

.field final e:I

.field final f:I

.field private final g:[B

.field private final h:[Z


# direct methods
.method constructor <init>(Ljava/lang/String;[C)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lpa/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    iput-object p1, p0, Lpa/g0;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {p2}, Lpa/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, [C

    .line 17
    .line 18
    iput-object p1, p0, Lpa/g0;->b:[C

    .line 19
    .line 20
    :try_start_0
    array-length p1, p2

    .line 21
    sget-object v0, Ljava/math/RoundingMode;->UNNECESSARY:Ljava/math/RoundingMode;

    .line 22
    .line 23
    invoke-static {p1, v0}, Lpa/k0;->b(ILjava/math/RoundingMode;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lpa/g0;->d:I
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_1

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->lowestOneBit(I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/16 v1, 0x8

    .line 34
    .line 35
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    :try_start_1
    div-int/2addr v1, v0

    .line 40
    iput v1, p0, Lpa/g0;->e:I

    .line 41
    .line 42
    div-int/2addr p1, v0

    .line 43
    iput p1, p0, Lpa/g0;->f:I
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_0

    .line 44
    .line 45
    array-length p1, p2

    .line 46
    const/4 v0, 0x1

    .line 47
    sub-int/2addr p1, v0

    .line 48
    iput p1, p0, Lpa/g0;->c:I

    .line 49
    .line 50
    const/16 p1, 0x80

    .line 51
    .line 52
    new-array v1, p1, [B

    .line 53
    .line 54
    const/4 v2, -0x1

    .line 55
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([BB)V

    .line 56
    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    move v4, v3

    .line 60
    :goto_0
    array-length v5, p2

    .line 61
    if-ge v4, v5, :cond_2

    .line 62
    .line 63
    aget-char v5, p2, v4

    .line 64
    .line 65
    if-ge v5, p1, :cond_0

    .line 66
    .line 67
    move v6, v0

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    move v6, v3

    .line 70
    :goto_1
    const-string v7, "Non-ASCII character: %s"

    .line 71
    .line 72
    invoke-static {v6, v7, v5}, Lpa/n;->f(ZLjava/lang/String;C)V

    .line 73
    .line 74
    .line 75
    aget-byte v6, v1, v5

    .line 76
    .line 77
    if-ne v6, v2, :cond_1

    .line 78
    .line 79
    move v6, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    move v6, v3

    .line 82
    :goto_2
    const-string v7, "Duplicate character: %s"

    .line 83
    .line 84
    invoke-static {v6, v7, v5}, Lpa/n;->f(ZLjava/lang/String;C)V

    .line 85
    .line 86
    .line 87
    int-to-byte v6, v4

    .line 88
    aput-byte v6, v1, v5

    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iput-object v1, p0, Lpa/g0;->g:[B

    .line 94
    .line 95
    iget p1, p0, Lpa/g0;->e:I

    .line 96
    .line 97
    new-array p1, p1, [Z

    .line 98
    .line 99
    :goto_3
    iget p2, p0, Lpa/g0;->f:I

    .line 100
    .line 101
    if-ge v3, p2, :cond_3

    .line 102
    .line 103
    shl-int/lit8 p2, v3, 0x3

    .line 104
    .line 105
    iget v1, p0, Lpa/g0;->d:I

    .line 106
    .line 107
    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 108
    .line 109
    invoke-static {p2, v1, v2}, Lpa/k0;->a(IILjava/math/RoundingMode;)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    aput-boolean v0, p1, p2

    .line 114
    .line 115
    add-int/lit8 v3, v3, 0x1

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_3
    iput-object p1, p0, Lpa/g0;->h:[Z

    .line 119
    .line 120
    return-void

    .line 121
    :catch_0
    move-exception p1

    .line 122
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    new-instance v1, Ljava/lang/String;

    .line 125
    .line 126
    invoke-direct {v1, p2}, Ljava/lang/String;-><init>([C)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    const-string v2, "Illegal alphabet "

    .line 134
    .line 135
    if-eqz p2, :cond_4

    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    goto :goto_4

    .line 142
    :cond_4
    new-instance p2, Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct {p2, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    :goto_4
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    throw v0

    .line 151
    :catch_1
    move-exception p1

    .line 152
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    array-length p2, p2

    .line 155
    new-instance v1, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const/16 v2, 0x23

    .line 158
    .line 159
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 160
    .line 161
    .line 162
    const-string v2, "Illegal alphabet length "

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v0
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
.end method

.method static synthetic c(Lpa/g0;)[C
    .locals 0

    iget-object p0, p0, Lpa/g0;->b:[C

    return-object p0
.end method


# virtual methods
.method final a(I)C
    .locals 1

    iget-object v0, p0, Lpa/g0;->b:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final b(C)Z
    .locals 2

    iget-object v0, p0, Lpa/g0;->g:[B

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-byte p1, v0, p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    instance-of v0, p1, Lpa/g0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lpa/g0;

    .line 6
    .line 7
    iget-object v0, p0, Lpa/g0;->b:[C

    .line 8
    .line 9
    iget-object p1, p1, Lpa/g0;->b:[C

    .line 10
    .line 11
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
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

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lpa/g0;->b:[C

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([C)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpa/g0;->a:Ljava/lang/String;

    return-object v0
.end method
