.class final enum Lej/e$c;
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
    invoke-direct {p0, p1, p2}, Lej/e$c;->p(D)D

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
    invoke-direct {p0, p1, p2}, Lej/e$c;->o(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {p1, p2, v2, v3}, Lej/e;->c(DD)D

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide p1

    .line 25
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    mul-double/2addr v0, p1

    .line 30
    invoke-static {v0, v1}, Ljava/lang/Math;->asin(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide p1

    .line 34
    return-wide p1
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
    .locals 4

    const-wide v0, 0x3ea01b2b29a4692bL    # 4.8E-7

    mul-double/2addr v0, p1

    const-wide v2, -0x40db90dd32759e12L    # -1.559E-4

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide v2, 0x40e193e19c0ebee0L    # 35999.0503

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide p1, 0x40765877318fc505L    # 357.5291

    add-double/2addr v0, p1

    return-wide v0
.end method

.method private o(D)D
    .locals 6

    .line 1
    const-wide v0, 0x3f60e66cb10342abL    # 0.002063

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr v0, p1

    .line 7
    const-wide v2, -0x3f61c776c8b43958L    # -1934.134

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    add-double/2addr v0, v2

    .line 13
    mul-double/2addr v0, p1

    .line 14
    const-wide v2, 0x405f39999999999aL    # 124.9

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    add-double/2addr v0, v2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    const-wide v2, 0x3f42ad81adea8976L    # 5.7E-4

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    mul-double/2addr v2, p1

    .line 30
    const-wide v4, 0x40f194189a6b50b1L    # 72001.5377

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    add-double/2addr v2, v4

    .line 36
    mul-double/2addr v2, p1

    .line 37
    const-wide p1, 0x406923851eb851ecL    # 201.11

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    add-double/2addr v2, p1

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    const-wide v2, -0x408c6de76427c7c5L    # -0.004778

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    mul-double/2addr v0, v2

    .line 57
    const-wide v2, 0x3f38083481e7cc2dL    # 3.667E-4

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2}, Ljava/lang/Math;->sin(D)D

    .line 63
    .line 64
    .line 65
    move-result-wide p1

    .line 66
    mul-double/2addr p1, v2

    .line 67
    sub-double/2addr v0, p1

    .line 68
    return-wide v0
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

.method private p(D)D
    .locals 4

    const-wide v0, 0x3f5db445ed4a1ad6L    # 0.001813

    mul-double/2addr v0, p1

    const-wide v2, -0x40bcaab8a5ce5b42L    # -5.9E-4

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide v2, -0x3fb897ae147ae148L    # -46.815

    add-double/2addr v0, v2

    mul-double/2addr v0, p1

    const-wide p1, 0x403572b020c49ba6L    # 21.448

    add-double/2addr v0, p1

    const-wide p1, 0x40ac200000000000L    # 3600.0

    div-double/2addr v0, p1

    const-wide p1, 0x40376eeeeeeeeeefL    # 23.433333333333334

    add-double/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method public f(D)D
    .locals 1

    .line 1
    const-string v0, "declination"

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lej/e$c;->h(DLjava/lang/String;)D

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
    invoke-direct {p0, p1, p2}, Lej/e$c;->m(D)D

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
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-direct {p0, p1, p2}, Lej/e$c;->o(D)D

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {p1, p2, v0, v1}, Lej/e;->c(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    invoke-direct {p0, p1, p2}, Lej/e$c;->p(D)D

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Math;->toRadians(D)D

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    invoke-static {p1, p2}, Ljava/lang/Math;->cos(D)D

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    mul-double/2addr p1, v2

    .line 59
    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->atan2(DD)D

    .line 64
    .line 65
    .line 66
    move-result-wide p1

    .line 67
    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    .line 68
    .line 69
    .line 70
    move-result-wide p1

    .line 71
    invoke-static {p1, p2}, Lej/a;->b(D)D

    .line 72
    .line 73
    .line 74
    move-result-wide p1

    .line 75
    return-wide p1

    .line 76
    :cond_1
    const-string v0, "nutation"

    .line 77
    .line 78
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-direct {p0, p1, p2}, Lej/e$c;->o(D)D

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    return-wide p1

    .line 89
    :cond_2
    const-string v0, "obliquity"

    .line 90
    .line 91
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-direct {p0, p1, p2}, Lej/e$c;->p(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide p1

    .line 101
    return-wide p1

    .line 102
    :cond_3
    const-string v0, "mean-anomaly"

    .line 103
    .line 104
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    invoke-direct {p0, p1, p2}, Lej/e$c;->n(D)D

    .line 111
    .line 112
    .line 113
    move-result-wide p1

    .line 114
    return-wide p1

    .line 115
    :cond_4
    const-string v0, "solar-longitude"

    .line 116
    .line 117
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    invoke-direct {p0, p1, p2}, Lej/e$c;->o(D)D

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    invoke-static {p1, p2, v0, v1}, Lej/e;->c(DD)D

    .line 128
    .line 129
    .line 130
    move-result-wide p1

    .line 131
    return-wide p1

    .line 132
    :cond_5
    const-string p1, "solar-latitude"

    .line 133
    .line 134
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_6

    .line 139
    .line 140
    const-wide/16 p1, 0x0

    .line 141
    .line 142
    return-wide p1

    .line 143
    :cond_6
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    .line 144
    .line 145
    return-wide p1
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

.method public k(D)D
    .locals 1

    .line 1
    const-string v0, "right-ascension"

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0}, Lej/e$c;->h(DLjava/lang/String;)D

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
