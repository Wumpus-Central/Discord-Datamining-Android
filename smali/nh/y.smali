.class final Lnh/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(I)I
    .locals 1

    const/16 v0, -0xc

    if-le p0, v0, :cond_0

    const/4 p0, -0x1

    :cond_0
    return p0
.end method

.method private static b(II)I
    .locals 1

    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, -0x1

    :goto_1
    return p0
.end method

.method private static c(III)I
    .locals 1

    const/16 v0, -0xc

    if-gt p0, v0, :cond_1

    const/16 v0, -0x41

    if-gt p1, v0, :cond_1

    if-le p2, v0, :cond_0

    goto :goto_0

    :cond_0
    shl-int/lit8 p1, p1, 0x8

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p2, 0x10

    xor-int/2addr p0, p1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, -0x1

    :goto_1
    return p0
.end method

.method private static d([BII)I
    .locals 3

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    aget-byte v0, p0, v0

    .line 4
    .line 5
    sub-int/2addr p2, p1

    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq p2, v1, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-ne p2, v2, :cond_0

    .line 13
    .line 14
    aget-byte p2, p0, p1

    .line 15
    .line 16
    add-int/2addr p1, v1

    .line 17
    aget-byte p0, p0, p1

    .line 18
    .line 19
    invoke-static {v0, p2, p0}, Lnh/y;->c(III)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    aget-byte p0, p0, p1

    .line 31
    .line 32
    invoke-static {v0, p0}, Lnh/y;->b(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :cond_2
    invoke-static {v0}, Lnh/y;->a(I)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0
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

.method public static e([B)Z
    .locals 2

    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0}, Lnh/y;->f([BII)Z

    move-result p0

    return p0
.end method

.method public static f([BII)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lnh/y;->h([BII)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static g(I[BII)I
    .locals 6

    .line 1
    if-eqz p0, :cond_f

    .line 2
    .line 3
    if-lt p2, p3, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    int-to-byte v0, p0

    .line 7
    const/16 v1, -0x20

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    const/16 v3, -0x41

    .line 11
    .line 12
    if-ge v0, v1, :cond_3

    .line 13
    .line 14
    const/16 p0, -0x3e

    .line 15
    .line 16
    if-lt v0, p0, :cond_2

    .line 17
    .line 18
    add-int/lit8 p0, p2, 0x1

    .line 19
    .line 20
    aget-byte p2, p1, p2

    .line 21
    .line 22
    if-le p2, v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move p2, p0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_2
    :goto_0
    return v2

    .line 29
    :cond_3
    const/16 v4, -0x10

    .line 30
    .line 31
    if-ge v0, v4, :cond_9

    .line 32
    .line 33
    shr-int/lit8 p0, p0, 0x8

    .line 34
    .line 35
    not-int p0, p0

    .line 36
    int-to-byte p0, p0

    .line 37
    if-nez p0, :cond_5

    .line 38
    .line 39
    add-int/lit8 p0, p2, 0x1

    .line 40
    .line 41
    aget-byte p2, p1, p2

    .line 42
    .line 43
    if-lt p0, p3, :cond_4

    .line 44
    .line 45
    invoke-static {v0, p2}, Lnh/y;->b(II)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_4
    move v5, p2

    .line 51
    move p2, p0

    .line 52
    move p0, v5

    .line 53
    :cond_5
    if-gt p0, v3, :cond_8

    .line 54
    .line 55
    const/16 v4, -0x60

    .line 56
    .line 57
    if-ne v0, v1, :cond_6

    .line 58
    .line 59
    if-lt p0, v4, :cond_8

    .line 60
    .line 61
    :cond_6
    const/16 v1, -0x13

    .line 62
    .line 63
    if-ne v0, v1, :cond_7

    .line 64
    .line 65
    if-ge p0, v4, :cond_8

    .line 66
    .line 67
    :cond_7
    add-int/lit8 p0, p2, 0x1

    .line 68
    .line 69
    aget-byte p2, p1, p2

    .line 70
    .line 71
    if-le p2, v3, :cond_1

    .line 72
    .line 73
    :cond_8
    return v2

    .line 74
    :cond_9
    shr-int/lit8 v1, p0, 0x8

    .line 75
    .line 76
    not-int v1, v1

    .line 77
    int-to-byte v1, v1

    .line 78
    if-nez v1, :cond_b

    .line 79
    .line 80
    add-int/lit8 p0, p2, 0x1

    .line 81
    .line 82
    aget-byte v1, p1, p2

    .line 83
    .line 84
    if-lt p0, p3, :cond_a

    .line 85
    .line 86
    invoke-static {v0, v1}, Lnh/y;->b(II)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    return p0

    .line 91
    :cond_a
    const/4 p2, 0x0

    .line 92
    goto :goto_1

    .line 93
    :cond_b
    shr-int/lit8 p0, p0, 0x10

    .line 94
    .line 95
    int-to-byte p0, p0

    .line 96
    move v5, p2

    .line 97
    move p2, p0

    .line 98
    move p0, v5

    .line 99
    :goto_1
    if-nez p2, :cond_d

    .line 100
    .line 101
    add-int/lit8 p2, p0, 0x1

    .line 102
    .line 103
    aget-byte p0, p1, p0

    .line 104
    .line 105
    if-lt p2, p3, :cond_c

    .line 106
    .line 107
    invoke-static {v0, v1, p0}, Lnh/y;->c(III)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :cond_c
    move v5, p2

    .line 113
    move p2, p0

    .line 114
    move p0, v5

    .line 115
    :cond_d
    if-gt v1, v3, :cond_e

    .line 116
    .line 117
    shl-int/lit8 v0, v0, 0x1c

    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x70

    .line 120
    .line 121
    add-int/2addr v0, v1

    .line 122
    shr-int/lit8 v0, v0, 0x1e

    .line 123
    .line 124
    if-nez v0, :cond_e

    .line 125
    .line 126
    if-gt p2, v3, :cond_e

    .line 127
    .line 128
    add-int/lit8 p2, p0, 0x1

    .line 129
    .line 130
    aget-byte p0, p1, p0

    .line 131
    .line 132
    if-le p0, v3, :cond_f

    .line 133
    .line 134
    :cond_e
    return v2

    .line 135
    :cond_f
    :goto_2
    invoke-static {p1, p2, p3}, Lnh/y;->h([BII)I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    return p0
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
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public static h([BII)I
    .locals 1

    .line 1
    :goto_0
    if-ge p1, p2, :cond_0

    .line 2
    .line 3
    aget-byte v0, p0, p1

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    add-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-lt p1, p2, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-static {p0, p1, p2}, Lnh/y;->i([BII)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    :goto_1
    return p0
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
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

.method private static i([BII)I
    .locals 6

    .line 1
    :cond_0
    :goto_0
    if-lt p1, p2, :cond_1

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_1
    add-int/lit8 v0, p1, 0x1

    .line 6
    .line 7
    aget-byte p1, p0, p1

    .line 8
    .line 9
    if-gez p1, :cond_c

    .line 10
    .line 11
    const/16 v1, -0x20

    .line 12
    .line 13
    const/4 v2, -0x1

    .line 14
    const/16 v3, -0x41

    .line 15
    .line 16
    if-ge p1, v1, :cond_4

    .line 17
    .line 18
    if-lt v0, p2, :cond_2

    .line 19
    .line 20
    return p1

    .line 21
    :cond_2
    const/16 v1, -0x3e

    .line 22
    .line 23
    if-lt p1, v1, :cond_3

    .line 24
    .line 25
    add-int/lit8 p1, v0, 0x1

    .line 26
    .line 27
    aget-byte v0, p0, v0

    .line 28
    .line 29
    if-le v0, v3, :cond_0

    .line 30
    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    const/16 v4, -0x10

    .line 33
    .line 34
    if-ge p1, v4, :cond_9

    .line 35
    .line 36
    add-int/lit8 v4, p2, -0x1

    .line 37
    .line 38
    if-lt v0, v4, :cond_5

    .line 39
    .line 40
    invoke-static {p0, v0, p2}, Lnh/y;->d([BII)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :cond_5
    add-int/lit8 v4, v0, 0x1

    .line 46
    .line 47
    aget-byte v0, p0, v0

    .line 48
    .line 49
    if-gt v0, v3, :cond_8

    .line 50
    .line 51
    const/16 v5, -0x60

    .line 52
    .line 53
    if-ne p1, v1, :cond_6

    .line 54
    .line 55
    if-lt v0, v5, :cond_8

    .line 56
    .line 57
    :cond_6
    const/16 v1, -0x13

    .line 58
    .line 59
    if-ne p1, v1, :cond_7

    .line 60
    .line 61
    if-ge v0, v5, :cond_8

    .line 62
    .line 63
    :cond_7
    add-int/lit8 p1, v4, 0x1

    .line 64
    .line 65
    aget-byte v0, p0, v4

    .line 66
    .line 67
    if-le v0, v3, :cond_0

    .line 68
    .line 69
    :cond_8
    return v2

    .line 70
    :cond_9
    add-int/lit8 v1, p2, -0x2

    .line 71
    .line 72
    if-lt v0, v1, :cond_a

    .line 73
    .line 74
    invoke-static {p0, v0, p2}, Lnh/y;->d([BII)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    return p0

    .line 79
    :cond_a
    add-int/lit8 v1, v0, 0x1

    .line 80
    .line 81
    aget-byte v0, p0, v0

    .line 82
    .line 83
    if-gt v0, v3, :cond_b

    .line 84
    .line 85
    shl-int/lit8 p1, p1, 0x1c

    .line 86
    .line 87
    add-int/lit8 v0, v0, 0x70

    .line 88
    .line 89
    add-int/2addr p1, v0

    .line 90
    shr-int/lit8 p1, p1, 0x1e

    .line 91
    .line 92
    if-nez p1, :cond_b

    .line 93
    .line 94
    add-int/lit8 p1, v1, 0x1

    .line 95
    .line 96
    aget-byte v0, p0, v1

    .line 97
    .line 98
    if-gt v0, v3, :cond_b

    .line 99
    .line 100
    add-int/lit8 v0, p1, 0x1

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-le p1, v3, :cond_c

    .line 105
    .line 106
    :cond_b
    return v2

    .line 107
    :cond_c
    move p1, v0

    .line 108
    goto :goto_0
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
