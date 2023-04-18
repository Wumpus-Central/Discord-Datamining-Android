.class public final Lf8/c;
.super Ly7/h;
.source "SourceFile"


# instance fields
.field private final a:Lf9/y;

.field private final b:Lf9/x;

.field private c:Lf9/l0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ly7/h;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf9/y;

    .line 5
    .line 6
    invoke-direct {v0}, Lf9/y;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lf8/c;->a:Lf9/y;

    .line 10
    .line 11
    new-instance v0, Lf9/x;

    .line 12
    .line 13
    invoke-direct {v0}, Lf9/x;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lf8/c;->b:Lf9/x;

    .line 17
    .line 18
    return-void
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
    .line 130
    .line 131
    .line 132
    .line 133
.end method


# virtual methods
.method protected b(Ly7/e;Ljava/nio/ByteBuffer;)Ly7/a;
    .locals 5

    .line 1
    iget-object v0, p0, Lf8/c;->c:Lf9/l0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p1, Ly7/e;->s:J

    .line 6
    .line 7
    invoke-virtual {v0}, Lf9/l0;->e()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    cmp-long v0, v1, v3

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lf9/l0;

    .line 16
    .line 17
    iget-wide v1, p1, Lh7/h;->o:J

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, Lf9/l0;-><init>(J)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lf8/c;->c:Lf9/l0;

    .line 23
    .line 24
    iget-wide v1, p1, Lh7/h;->o:J

    .line 25
    .line 26
    iget-wide v3, p1, Ly7/e;->s:J

    .line 27
    .line 28
    sub-long/2addr v1, v3

    .line 29
    invoke-virtual {v0, v1, v2}, Lf9/l0;->a(J)J

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    iget-object v0, p0, Lf8/c;->a:Lf9/y;

    .line 41
    .line 42
    invoke-virtual {v0, p1, p2}, Lf9/y;->N([BI)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lf8/c;->b:Lf9/x;

    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, Lf9/x;->o([BI)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lf8/c;->b:Lf9/x;

    .line 51
    .line 52
    const/16 p2, 0x27

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lf9/x;->r(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lf8/c;->b:Lf9/x;

    .line 58
    .line 59
    const/4 p2, 0x1

    .line 60
    invoke-virtual {p1, p2}, Lf9/x;->h(I)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-long v0, p1

    .line 65
    const/16 p1, 0x20

    .line 66
    .line 67
    shl-long/2addr v0, p1

    .line 68
    iget-object v2, p0, Lf8/c;->b:Lf9/x;

    .line 69
    .line 70
    invoke-virtual {v2, p1}, Lf9/x;->h(I)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-long v2, p1

    .line 75
    or-long/2addr v0, v2

    .line 76
    iget-object p1, p0, Lf8/c;->b:Lf9/x;

    .line 77
    .line 78
    const/16 v2, 0x14

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Lf9/x;->r(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lf8/c;->b:Lf9/x;

    .line 84
    .line 85
    const/16 v2, 0xc

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Lf9/x;->h(I)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v2, p0, Lf8/c;->b:Lf9/x;

    .line 92
    .line 93
    const/16 v3, 0x8

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Lf9/x;->h(I)I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    iget-object v3, p0, Lf8/c;->a:Lf9/y;

    .line 100
    .line 101
    const/16 v4, 0xe

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Lf9/y;->Q(I)V

    .line 104
    .line 105
    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    const/16 v3, 0xff

    .line 109
    .line 110
    if-eq v2, v3, :cond_5

    .line 111
    .line 112
    const/4 p1, 0x4

    .line 113
    if-eq v2, p1, :cond_4

    .line 114
    .line 115
    const/4 p1, 0x5

    .line 116
    if-eq v2, p1, :cond_3

    .line 117
    .line 118
    const/4 p1, 0x6

    .line 119
    if-eq v2, p1, :cond_2

    .line 120
    .line 121
    const/4 p1, 0x0

    .line 122
    goto :goto_0

    .line 123
    :cond_2
    iget-object p1, p0, Lf8/c;->a:Lf9/y;

    .line 124
    .line 125
    iget-object v2, p0, Lf8/c;->c:Lf9/l0;

    .line 126
    .line 127
    invoke-static {p1, v0, v1, v2}, Lf8/g;->b(Lf9/y;JLf9/l0;)Lf8/g;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    goto :goto_0

    .line 132
    :cond_3
    iget-object p1, p0, Lf8/c;->a:Lf9/y;

    .line 133
    .line 134
    iget-object v2, p0, Lf8/c;->c:Lf9/l0;

    .line 135
    .line 136
    invoke-static {p1, v0, v1, v2}, Lf8/d;->b(Lf9/y;JLf9/l0;)Lf8/d;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    goto :goto_0

    .line 141
    :cond_4
    iget-object p1, p0, Lf8/c;->a:Lf9/y;

    .line 142
    .line 143
    invoke-static {p1}, Lf8/f;->b(Lf9/y;)Lf8/f;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_0

    .line 148
    :cond_5
    iget-object v2, p0, Lf8/c;->a:Lf9/y;

    .line 149
    .line 150
    invoke-static {v2, p1, v0, v1}, Lf8/a;->b(Lf9/y;IJ)Lf8/a;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    goto :goto_0

    .line 155
    :cond_6
    new-instance p1, Lf8/e;

    .line 156
    .line 157
    invoke-direct {p1}, Lf8/e;-><init>()V

    .line 158
    .line 159
    .line 160
    :goto_0
    const/4 v0, 0x0

    .line 161
    if-nez p1, :cond_7

    .line 162
    .line 163
    new-instance p1, Ly7/a;

    .line 164
    .line 165
    new-array p2, v0, [Ly7/a$b;

    .line 166
    .line 167
    invoke-direct {p1, p2}, Ly7/a;-><init>([Ly7/a$b;)V

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_7
    new-instance v1, Ly7/a;

    .line 172
    .line 173
    new-array p2, p2, [Ly7/a$b;

    .line 174
    .line 175
    aput-object p1, p2, v0

    .line 176
    .line 177
    invoke-direct {v1, p2}, Ly7/a;-><init>([Ly7/a$b;)V

    .line 178
    .line 179
    .line 180
    move-object p1, v1

    .line 181
    :goto_1
    return-object p1
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
.end method
