.class final Lpa/i0;
.super Lpa/h0;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V
    .locals 1
    .param p3    # Ljava/lang/Character;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 1
    new-instance v0, Lpa/g0;

    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lpa/g0;-><init>(Ljava/lang/String;[C)V

    invoke-direct {p0, v0, p3}, Lpa/i0;-><init>(Lpa/g0;Ljava/lang/Character;)V

    return-void
.end method

.method private constructor <init>(Lpa/g0;Ljava/lang/Character;)V
    .locals 0
    .param p2    # Ljava/lang/Character;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, Lpa/h0;-><init>(Lpa/g0;Ljava/lang/Character;)V

    .line 3
    invoke-static {p1}, Lpa/g0;->c(Lpa/g0;)[C

    move-result-object p1

    array-length p1, p1

    const/16 p2, 0x40

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lpa/n;->e(Z)V

    return-void
.end method


# virtual methods
.method final e(Ljava/lang/Appendable;[BII)V
    .locals 4

    .line 1
    invoke-static {p1}, Lpa/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    add-int/lit8 p3, p4, 0x0

    .line 5
    .line 6
    array-length v0, p2

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v1, p3, v0}, Lpa/n;->d(III)V

    .line 9
    .line 10
    .line 11
    :goto_0
    const/4 v0, 0x3

    .line 12
    if-lt p4, v0, :cond_0

    .line 13
    .line 14
    add-int/lit8 v0, v1, 0x1

    .line 15
    .line 16
    aget-byte v1, p2, v1

    .line 17
    .line 18
    and-int/lit16 v1, v1, 0xff

    .line 19
    .line 20
    shl-int/lit8 v1, v1, 0x10

    .line 21
    .line 22
    add-int/lit8 v2, v0, 0x1

    .line 23
    .line 24
    aget-byte v0, p2, v0

    .line 25
    .line 26
    and-int/lit16 v0, v0, 0xff

    .line 27
    .line 28
    shl-int/lit8 v0, v0, 0x8

    .line 29
    .line 30
    or-int/2addr v0, v1

    .line 31
    add-int/lit8 v1, v2, 0x1

    .line 32
    .line 33
    aget-byte v2, p2, v2

    .line 34
    .line 35
    and-int/lit16 v2, v2, 0xff

    .line 36
    .line 37
    or-int/2addr v0, v2

    .line 38
    iget-object v2, p0, Lpa/h0;->f:Lpa/g0;

    .line 39
    .line 40
    ushr-int/lit8 v3, v0, 0x12

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Lpa/g0;->a(I)C

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, Lpa/h0;->f:Lpa/g0;

    .line 50
    .line 51
    ushr-int/lit8 v3, v0, 0xc

    .line 52
    .line 53
    and-int/lit8 v3, v3, 0x3f

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Lpa/g0;->a(I)C

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 60
    .line 61
    .line 62
    iget-object v2, p0, Lpa/h0;->f:Lpa/g0;

    .line 63
    .line 64
    ushr-int/lit8 v3, v0, 0x6

    .line 65
    .line 66
    and-int/lit8 v3, v3, 0x3f

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lpa/g0;->a(I)C

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-interface {p1, v2}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lpa/h0;->f:Lpa/g0;

    .line 76
    .line 77
    and-int/lit8 v0, v0, 0x3f

    .line 78
    .line 79
    invoke-virtual {v2, v0}, Lpa/g0;->a(I)C

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 84
    .line 85
    .line 86
    add-int/lit8 p4, p4, -0x3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    if-ge v1, p3, :cond_1

    .line 90
    .line 91
    sub-int/2addr p3, v1

    .line 92
    invoke-virtual {p0, p1, p2, v1, p3}, Lpa/h0;->f(Ljava/lang/Appendable;[BII)V

    .line 93
    .line 94
    .line 95
    :cond_1
    return-void
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
