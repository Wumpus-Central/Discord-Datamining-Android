.class final enum Lej/e$d;
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
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [D

    .line 3
    .line 4
    invoke-static {p1, p2, v0}, Lej/e;->j(D[D)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1, p2}, Lej/e;->i(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const/4 v3, 0x1

    .line 12
    aget-wide v3, v0, v3

    .line 13
    .line 14
    add-double/2addr v1, v3

    .line 15
    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    const/4 v3, 0x0

    .line 24
    aget-wide v3, v0, v3

    .line 25
    .line 26
    invoke-static {p1, p2, v3, v4}, Lej/e;->c(DD)D

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    mul-double/2addr v1, p1

    .line 39
    invoke-static {v1, v2}, Ljava/lang/Math;->asin(D)D

    .line 40
    .line 41
    .line 42
    move-result-wide p1

    .line 43
    return-wide p1
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


# virtual methods
.method public f(D)D
    .locals 1

    .line 1
    const-string v0, "declination"

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lej/e$d;->h(DLjava/lang/String;)D

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
    .line 25
    .line 26
    .line 27
.end method

.method public h(DLjava/lang/String;)D
    .locals 4

    .line 1
    invoke-static {p1, p2}, Lej/e;->b(D)D

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    const-string v0, "declination"

    .line 6
    .line 7
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lej/e$d;->m(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    return-wide p1

    .line 22
    :cond_0
    const-string v0, "right-ascension"

    .line 23
    .line 24
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x2

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-array p3, v3, [D

    .line 34
    .line 35
    invoke-static {p1, p2, p3}, Lej/e;->j(D[D)V

    .line 36
    .line 37
    .line 38
    aget-wide v2, p3, v2

    .line 39
    .line 40
    invoke-static {p1, p2, v2, v3}, Lej/e;->c(DD)D

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    invoke-static {p1, p2}, Lej/e;->i(D)D

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    aget-wide v0, p3, v1

    .line 53
    .line 54
    add-double/2addr p1, v0

    .line 55
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    mul-double/2addr p1, v0

    .line 68
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 73
    .line 74
    .line 75
    move-result-wide p1

    .line 76
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    invoke-static {p1, p2}, Lej/a;->b(D)D

    .line 81
    .line 82
    .line 83
    move-result-wide p1

    .line 84
    return-wide p1

    .line 85
    :cond_1
    const-string v0, "nutation"

    .line 86
    .line 87
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    new-array p3, v3, [D

    .line 94
    .line 95
    invoke-static {p1, p2, p3}, Lej/e;->j(D[D)V

    .line 96
    .line 97
    .line 98
    aget-wide p1, p3, v2

    .line 99
    .line 100
    return-wide p1

    .line 101
    :cond_2
    const-string v0, "obliquity"

    .line 102
    .line 103
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    new-array p3, v3, [D

    .line 110
    .line 111
    invoke-static {p1, p2, p3}, Lej/e;->j(D[D)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2}, Lej/e;->i(D)D

    .line 115
    .line 116
    .line 117
    move-result-wide p1

    .line 118
    aget-wide v0, p3, v1

    .line 119
    .line 120
    add-double/2addr p1, v0

    .line 121
    return-wide p1

    .line 122
    :cond_3
    const-string v0, "mean-anomaly"

    .line 123
    .line 124
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    invoke-direct {p0, p1, p2}, Lej/e$d;->n(D)D

    .line 131
    .line 132
    .line 133
    move-result-wide p1

    .line 134
    return-wide p1

    .line 135
    :cond_4
    const-string v0, "solar-longitude"

    .line 136
    .line 137
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_5

    .line 142
    .line 143
    new-array p3, v3, [D

    .line 144
    .line 145
    invoke-static {p1, p2, p3}, Lej/e;->j(D[D)V

    .line 146
    .line 147
    .line 148
    aget-wide v0, p3, v2

    .line 149
    .line 150
    invoke-static {p1, p2, v0, v1}, Lej/e;->c(DD)D

    .line 151
    .line 152
    .line 153
    move-result-wide p1

    .line 154
    return-wide p1

    .line 155
    :cond_5
    const-string p1, "solar-latitude"

    .line 156
    .line 157
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_6

    .line 162
    .line 163
    const-wide/16 p1, 0x0

    .line 164
    .line 165
    return-wide p1

    .line 166
    :cond_6
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    .line 167
    .line 168
    return-wide p1
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

.method public k(D)D
    .locals 1

    .line 1
    const-string v0, "right-ascension"

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lej/e$d;->h(DLjava/lang/String;)D

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
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
    .line 25
    .line 26
    .line 27
.end method
