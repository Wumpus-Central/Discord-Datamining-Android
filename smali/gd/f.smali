.class public final Lgd/f;
.super Lgd/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lgd/i;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lgd/b;IIFFFFFFFFFFFFFFFF)Lgd/b;
    .locals 5

    .line 1
    invoke-static/range {p4 .. p19}, Lgd/k;->b(FFFFFFFFFFFFFFFF)Lgd/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move v3, p2

    .line 8
    move v4, p3

    .line 9
    invoke-virtual {p0, p1, p2, p3, v0}, Lgd/f;->d(Lgd/b;IILgd/k;)Lgd/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public d(Lgd/b;IILgd/k;)Lgd/b;
    .locals 8

    .line 1
    if-lez p2, :cond_4

    .line 2
    .line 3
    if-lez p3, :cond_4

    .line 4
    .line 5
    new-instance v0, Lgd/b;

    .line 6
    .line 7
    invoke-direct {v0, p2, p3}, Lgd/b;-><init>(II)V

    .line 8
    .line 9
    .line 10
    mul-int/lit8 p2, p2, 0x2

    .line 11
    .line 12
    new-array v1, p2, [F

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, p3, :cond_3

    .line 17
    .line 18
    int-to-float v4, v3

    .line 19
    const/high16 v5, 0x3f000000    # 0.5f

    .line 20
    .line 21
    add-float/2addr v4, v5

    .line 22
    move v6, v2

    .line 23
    :goto_1
    if-ge v6, p2, :cond_0

    .line 24
    .line 25
    div-int/lit8 v7, v6, 0x2

    .line 26
    .line 27
    int-to-float v7, v7

    .line 28
    add-float/2addr v7, v5

    .line 29
    aput v7, v1, v6

    .line 30
    .line 31
    add-int/lit8 v7, v6, 0x1

    .line 32
    .line 33
    aput v4, v1, v7

    .line 34
    .line 35
    add-int/lit8 v6, v6, 0x2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {p4, v1}, Lgd/k;->f([F)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v1}, Lgd/i;->a(Lgd/b;[F)V

    .line 42
    .line 43
    .line 44
    move v4, v2

    .line 45
    :goto_2
    if-ge v4, p2, :cond_2

    .line 46
    .line 47
    :try_start_0
    aget v5, v1, v4

    .line 48
    .line 49
    float-to-int v5, v5

    .line 50
    add-int/lit8 v6, v4, 0x1

    .line 51
    .line 52
    aget v6, v1, v6

    .line 53
    .line 54
    float-to-int v6, v6

    .line 55
    invoke-virtual {p1, v5, v6}, Lgd/b;->e(II)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_1

    .line 60
    .line 61
    div-int/lit8 v5, v4, 0x2

    .line 62
    .line 63
    invoke-virtual {v0, v5, v3}, Lgd/b;->p(II)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    :cond_1
    add-int/lit8 v4, v4, 0x2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    throw p1

    .line 74
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-object v0

    .line 78
    :cond_4
    invoke-static {}, Lcd/j;->a()Lcd/j;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    throw p1
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
