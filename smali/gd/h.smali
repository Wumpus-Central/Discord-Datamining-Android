.class public Lgd/h;
.super Lcd/b;
.source "SourceFile"


# static fields
.field private static final d:[B


# instance fields
.field private b:[B

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, Lgd/h;->d:[B

    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method

.method public constructor <init>(Lcd/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcd/b;-><init>(Lcd/h;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lgd/h;->d:[B

    .line 5
    .line 6
    iput-object p1, p0, Lgd/h;->b:[B

    .line 7
    .line 8
    const/16 p1, 0x20

    .line 9
    .line 10
    new-array p1, p1, [I

    .line 11
    .line 12
    iput-object p1, p0, Lgd/h;->c:[I

    .line 13
    .line 14
    return-void
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

.method private static g([I)I
    .locals 9

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    move v4, v3

    .line 6
    move v5, v4

    .line 7
    :goto_0
    if-ge v2, v0, :cond_2

    .line 8
    .line 9
    aget v6, p0, v2

    .line 10
    .line 11
    if-le v6, v3, :cond_0

    .line 12
    .line 13
    move v5, v2

    .line 14
    move v3, v6

    .line 15
    :cond_0
    if-le v6, v4, :cond_1

    .line 16
    .line 17
    move v4, v6

    .line 18
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    move v2, v1

    .line 22
    move v3, v2

    .line 23
    :goto_1
    if-ge v1, v0, :cond_4

    .line 24
    .line 25
    sub-int v6, v1, v5

    .line 26
    .line 27
    aget v7, p0, v1

    .line 28
    .line 29
    mul-int/2addr v7, v6

    .line 30
    mul-int/2addr v7, v6

    .line 31
    if-le v7, v3, :cond_3

    .line 32
    .line 33
    move v2, v1

    .line 34
    move v3, v7

    .line 35
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_4
    if-le v5, v2, :cond_5

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_5
    move v8, v5

    .line 42
    move v5, v2

    .line 43
    move v2, v8

    .line 44
    :goto_2
    sub-int v1, v5, v2

    .line 45
    .line 46
    div-int/lit8 v0, v0, 0x10

    .line 47
    .line 48
    if-le v1, v0, :cond_8

    .line 49
    .line 50
    add-int/lit8 v0, v5, -0x1

    .line 51
    .line 52
    const/4 v1, -0x1

    .line 53
    move v3, v1

    .line 54
    move v1, v0

    .line 55
    :goto_3
    if-le v0, v2, :cond_7

    .line 56
    .line 57
    sub-int v6, v0, v2

    .line 58
    .line 59
    mul-int/2addr v6, v6

    .line 60
    sub-int v7, v5, v0

    .line 61
    .line 62
    mul-int/2addr v6, v7

    .line 63
    aget v7, p0, v0

    .line 64
    .line 65
    sub-int v7, v4, v7

    .line 66
    .line 67
    mul-int/2addr v6, v7

    .line 68
    if-le v6, v3, :cond_6

    .line 69
    .line 70
    move v1, v0

    .line 71
    move v3, v6

    .line 72
    :cond_6
    add-int/lit8 v0, v0, -0x1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_7
    shl-int/lit8 p0, v1, 0x3

    .line 76
    .line 77
    return p0

    .line 78
    :cond_8
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private h(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgd/h;->b:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    if-ge v0, p1, :cond_0

    .line 5
    .line 6
    new-array p1, p1, [B

    .line 7
    .line 8
    iput-object p1, p0, Lgd/h;->b:[B

    .line 9
    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    move v0, p1

    .line 12
    :goto_0
    const/16 v1, 0x20

    .line 13
    .line 14
    if-ge v0, v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lgd/h;->c:[I

    .line 17
    .line 18
    aput p1, v1, v0

    .line 19
    .line 20
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method


# virtual methods
.method public b()Lgd/b;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcd/b;->e()Lcd/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcd/h;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, Lcd/h;->a()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    new-instance v3, Lgd/b;

    .line 14
    .line 15
    invoke-direct {v3, v1, v2}, Lgd/b;-><init>(II)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v1}, Lgd/h;->h(I)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lgd/h;->c:[I

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    move v6, v5

    .line 25
    :goto_0
    const/4 v7, 0x5

    .line 26
    if-ge v6, v7, :cond_1

    .line 27
    .line 28
    mul-int v8, v2, v6

    .line 29
    .line 30
    div-int/2addr v8, v7

    .line 31
    iget-object v9, p0, Lgd/h;->b:[B

    .line 32
    .line 33
    invoke-virtual {v0, v8, v9}, Lcd/h;->c(I[B)[B

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    shl-int/lit8 v9, v1, 0x2

    .line 38
    .line 39
    div-int/2addr v9, v7

    .line 40
    div-int/lit8 v7, v1, 0x5

    .line 41
    .line 42
    :goto_1
    if-ge v7, v9, :cond_0

    .line 43
    .line 44
    aget-byte v10, v8, v7

    .line 45
    .line 46
    and-int/lit16 v10, v10, 0xff

    .line 47
    .line 48
    shr-int/lit8 v10, v10, 0x3

    .line 49
    .line 50
    aget v11, v4, v10

    .line 51
    .line 52
    add-int/2addr v11, v5

    .line 53
    aput v11, v4, v10

    .line 54
    .line 55
    add-int/lit8 v7, v7, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-static {v4}, Lgd/h;->g([I)I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-virtual {v0}, Lcd/h;->b()[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v5, 0x0

    .line 70
    move v6, v5

    .line 71
    :goto_2
    if-ge v6, v2, :cond_4

    .line 72
    .line 73
    mul-int v7, v6, v1

    .line 74
    .line 75
    move v8, v5

    .line 76
    :goto_3
    if-ge v8, v1, :cond_3

    .line 77
    .line 78
    add-int v9, v7, v8

    .line 79
    .line 80
    aget-byte v9, v0, v9

    .line 81
    .line 82
    and-int/lit16 v9, v9, 0xff

    .line 83
    .line 84
    if-ge v9, v4, :cond_2

    .line 85
    .line 86
    invoke-virtual {v3, v8, v6}, Lgd/b;->p(II)V

    .line 87
    .line 88
    .line 89
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    return-object v3
    .line 96
    .line 97
.end method

.method public c(ILgd/a;)Lgd/a;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcd/b;->e()Lcd/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcd/h;->d()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2}, Lgd/a;->j()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p2}, Lgd/a;->a()V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    new-instance p2, Lgd/a;

    .line 23
    .line 24
    invoke-direct {p2, v1}, Lgd/a;-><init>(I)V

    .line 25
    .line 26
    .line 27
    :goto_1
    invoke-direct {p0, v1}, Lgd/h;->h(I)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lgd/h;->b:[B

    .line 31
    .line 32
    invoke-virtual {v0, p1, v2}, Lcd/h;->c(I[B)[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lgd/h;->c:[I

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    move v3, v2

    .line 40
    :goto_2
    const/4 v4, 0x3

    .line 41
    const/4 v5, 0x1

    .line 42
    if-ge v3, v1, :cond_2

    .line 43
    .line 44
    aget-byte v6, p1, v3

    .line 45
    .line 46
    and-int/lit16 v6, v6, 0xff

    .line 47
    .line 48
    shr-int/lit8 v4, v6, 0x3

    .line 49
    .line 50
    aget v6, v0, v4

    .line 51
    .line 52
    add-int/2addr v6, v5

    .line 53
    aput v6, v0, v4

    .line 54
    .line 55
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {v0}, Lgd/h;->g([I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-ge v1, v4, :cond_4

    .line 63
    .line 64
    :goto_3
    if-ge v2, v1, :cond_6

    .line 65
    .line 66
    aget-byte v3, p1, v2

    .line 67
    .line 68
    and-int/lit16 v3, v3, 0xff

    .line 69
    .line 70
    if-ge v3, v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p2, v2}, Lgd/a;->o(I)V

    .line 73
    .line 74
    .line 75
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    aget-byte v2, p1, v2

    .line 79
    .line 80
    and-int/lit16 v2, v2, 0xff

    .line 81
    .line 82
    aget-byte v3, p1, v5

    .line 83
    .line 84
    and-int/lit16 v3, v3, 0xff

    .line 85
    .line 86
    move v4, v5

    .line 87
    move v9, v3

    .line 88
    move v3, v2

    .line 89
    move v2, v9

    .line 90
    :goto_4
    add-int/lit8 v6, v1, -0x1

    .line 91
    .line 92
    if-ge v4, v6, :cond_6

    .line 93
    .line 94
    add-int/lit8 v6, v4, 0x1

    .line 95
    .line 96
    aget-byte v7, p1, v6

    .line 97
    .line 98
    and-int/lit16 v7, v7, 0xff

    .line 99
    .line 100
    shl-int/lit8 v8, v2, 0x2

    .line 101
    .line 102
    sub-int/2addr v8, v3

    .line 103
    sub-int/2addr v8, v7

    .line 104
    div-int/lit8 v8, v8, 0x2

    .line 105
    .line 106
    if-ge v8, v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {p2, v4}, Lgd/a;->o(I)V

    .line 109
    .line 110
    .line 111
    :cond_5
    move v3, v2

    .line 112
    move v4, v6

    .line 113
    move v2, v7

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    return-object p2
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
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
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
