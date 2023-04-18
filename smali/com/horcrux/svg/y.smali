.class Lcom/horcrux/svg/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/y;",
            ">;"
        }
    .end annotation
.end field

.field private static e:I

.field private static f:Lcom/horcrux/svg/w;

.field private static g:Lcom/horcrux/svg/w;

.field private static h:Lcom/horcrux/svg/w;

.field private static i:Lcom/horcrux/svg/w;

.field private static j:Z


# instance fields
.field a:Lcom/horcrux/svg/z;

.field b:Lcom/horcrux/svg/w;

.field c:D


# direct methods
.method private constructor <init>(Lcom/horcrux/svg/z;Lcom/horcrux/svg/w;D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/horcrux/svg/y;->a:Lcom/horcrux/svg/z;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/horcrux/svg/y;->b:Lcom/horcrux/svg/w;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/horcrux/svg/y;->c:D

    .line 9
    .line 10
    return-void
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

.method private static a(DD)D
    .locals 4

    sub-double v0, p0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x4066800000000000L    # 180.0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const-wide v0, 0x4076800000000000L    # 360.0

    add-double/2addr p0, v0

    :cond_0
    add-double/2addr p0, p2

    const-wide/high16 p2, 0x4000000000000000L    # 2.0

    div-double/2addr p0, p2

    return-wide p0
.end method

.method private static b(Lcom/horcrux/svg/c0;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)V
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 6
    .line 7
    invoke-static {p3, p2}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/horcrux/svg/y;->i(Lcom/horcrux/svg/w;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/horcrux/svg/y;->i(Lcom/horcrux/svg/w;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
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

.method private static c(Lcom/horcrux/svg/z;)D
    .locals 5

    .line 1
    sget-object v0, Lcom/horcrux/svg/y;->h:Lcom/horcrux/svg/w;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/y;->f(Lcom/horcrux/svg/w;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Lcom/horcrux/svg/y;->j(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-object v2, Lcom/horcrux/svg/y;->i:Lcom/horcrux/svg/w;

    .line 12
    .line 13
    invoke-static {v2}, Lcom/horcrux/svg/y;->f(Lcom/horcrux/svg/w;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v2, v3}, Lcom/horcrux/svg/y;->j(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sget-object v4, Lcom/horcrux/svg/y$a;->a:[I

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    aget p0, v4, p0

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    if-eq p0, v4, :cond_2

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-eq p0, v4, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    if-eq p0, v2, :cond_0

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    :cond_0
    return-wide v0

    .line 41
    :cond_1
    invoke-static {v0, v1, v2, v3}, Lcom/horcrux/svg/y;->a(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0

    .line 46
    :cond_2
    sget-boolean p0, Lcom/horcrux/svg/y;->j:Z

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    const-wide v0, 0x4066800000000000L    # 180.0

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    add-double/2addr v2, v0

    .line 56
    :cond_3
    return-wide v2
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

.method private static d(Lcom/horcrux/svg/s;)Lcom/horcrux/svg/c0;
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/horcrux/svg/c0;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/horcrux/svg/s;->b:[Lcom/horcrux/svg/w;

    .line 7
    .line 8
    sget-object v2, Lcom/horcrux/svg/y$a;->b:[I

    .line 9
    .line 10
    iget-object p0, p0, Lcom/horcrux/svg/s;->a:Lcom/horcrux/svg/f;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v2, p0

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq p0, v4, :cond_3

    .line 22
    .line 23
    if-eq p0, v2, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-eq p0, v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    if-eq p0, v2, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    if-eq p0, v1, :cond_0

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_0
    sget-object p0, Lcom/horcrux/svg/y;->g:Lcom/horcrux/svg/w;

    .line 37
    .line 38
    iput-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 39
    .line 40
    sget-object v1, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 41
    .line 42
    invoke-static {p0, v1}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iput-object p0, v0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 47
    .line 48
    iget-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 49
    .line 50
    sget-object v1, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 51
    .line 52
    invoke-static {p0, v1}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iput-object p0, v0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    aget-object p0, v1, v3

    .line 60
    .line 61
    iput-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 62
    .line 63
    sget-object v1, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 64
    .line 65
    invoke-static {p0, v1}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iput-object p0, v0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 70
    .line 71
    iget-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 72
    .line 73
    sget-object v1, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 74
    .line 75
    invoke-static {p0, v1}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iput-object p0, v0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    aget-object p0, v1, v4

    .line 83
    .line 84
    iput-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 85
    .line 86
    sget-object v2, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 87
    .line 88
    aget-object v1, v1, v3

    .line 89
    .line 90
    invoke-static {v0, v2, v1, p0}, Lcom/horcrux/svg/y;->b(Lcom/horcrux/svg/c0;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    aget-object p0, v1, v2

    .line 95
    .line 96
    iput-object p0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 97
    .line 98
    aget-object p0, v1, v3

    .line 99
    .line 100
    sget-object v5, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 101
    .line 102
    invoke-static {p0, v5}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    iput-object p0, v0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 107
    .line 108
    aget-object p0, v1, v2

    .line 109
    .line 110
    aget-object v5, v1, v4

    .line 111
    .line 112
    invoke-static {p0, v5}, Lcom/horcrux/svg/y;->k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iput-object p0, v0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 117
    .line 118
    iget-object p0, v0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 119
    .line 120
    invoke-static {p0}, Lcom/horcrux/svg/y;->i(Lcom/horcrux/svg/w;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_4

    .line 125
    .line 126
    aget-object p0, v1, v3

    .line 127
    .line 128
    aget-object v3, v1, v4

    .line 129
    .line 130
    aget-object v1, v1, v2

    .line 131
    .line 132
    invoke-static {v0, p0, v3, v1}, Lcom/horcrux/svg/y;->b(Lcom/horcrux/svg/c0;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_4
    iget-object p0, v0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 137
    .line 138
    invoke-static {p0}, Lcom/horcrux/svg/y;->i(Lcom/horcrux/svg/w;)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-eqz p0, :cond_5

    .line 143
    .line 144
    sget-object p0, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 145
    .line 146
    aget-object v2, v1, v3

    .line 147
    .line 148
    aget-object v1, v1, v4

    .line 149
    .line 150
    invoke-static {v0, p0, v2, v1}, Lcom/horcrux/svg/y;->b(Lcom/horcrux/svg/c0;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)V

    .line 151
    .line 152
    .line 153
    :cond_5
    :goto_0
    return-object v0
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
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
.end method

.method private static e()V
    .locals 6

    .line 1
    sget-object v0, Lcom/horcrux/svg/z;->m:Lcom/horcrux/svg/z;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/y;->c(Lcom/horcrux/svg/z;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-object v3, Lcom/horcrux/svg/y;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v4, Lcom/horcrux/svg/y;

    .line 10
    .line 11
    sget-object v5, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 12
    .line 13
    invoke-direct {v4, v0, v5, v1, v2}, Lcom/horcrux/svg/y;-><init>(Lcom/horcrux/svg/z;Lcom/horcrux/svg/w;D)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static f(Lcom/horcrux/svg/w;)D
    .locals 4

    iget-wide v0, p0, Lcom/horcrux/svg/w;->b:D

    iget-wide v2, p0, Lcom/horcrux/svg/w;->a:D

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method private static g(Lcom/horcrux/svg/s;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/horcrux/svg/y;->d(Lcom/horcrux/svg/s;)Lcom/horcrux/svg/c0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lcom/horcrux/svg/c0;->a:Lcom/horcrux/svg/w;

    .line 6
    .line 7
    sput-object v1, Lcom/horcrux/svg/y;->i:Lcom/horcrux/svg/w;

    .line 8
    .line 9
    sget v1, Lcom/horcrux/svg/y;->e:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    sget-object v1, Lcom/horcrux/svg/z;->k:Lcom/horcrux/svg/z;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, Lcom/horcrux/svg/z;->l:Lcom/horcrux/svg/z;

    .line 20
    .line 21
    :goto_0
    invoke-static {v1}, Lcom/horcrux/svg/y;->c(Lcom/horcrux/svg/z;)D

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    sget-object v5, Lcom/horcrux/svg/y;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v6, Lcom/horcrux/svg/y;

    .line 28
    .line 29
    sget-object v7, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 30
    .line 31
    invoke-direct {v6, v1, v7, v3, v4}, Lcom/horcrux/svg/y;-><init>(Lcom/horcrux/svg/z;Lcom/horcrux/svg/w;D)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v1, v0, Lcom/horcrux/svg/c0;->b:Lcom/horcrux/svg/w;

    .line 38
    .line 39
    sput-object v1, Lcom/horcrux/svg/y;->h:Lcom/horcrux/svg/w;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/horcrux/svg/c0;->c:Lcom/horcrux/svg/w;

    .line 42
    .line 43
    sput-object v0, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/horcrux/svg/s;->a:Lcom/horcrux/svg/f;

    .line 46
    .line 47
    sget-object v1, Lcom/horcrux/svg/f;->m:Lcom/horcrux/svg/f;

    .line 48
    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    iget-object p0, p0, Lcom/horcrux/svg/s;->b:[Lcom/horcrux/svg/w;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    aget-object p0, p0, v0

    .line 55
    .line 56
    sput-object p0, Lcom/horcrux/svg/y;->g:Lcom/horcrux/svg/w;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sget-object p0, Lcom/horcrux/svg/f;->o:Lcom/horcrux/svg/f;

    .line 60
    .line 61
    if-ne v0, p0, :cond_3

    .line 62
    .line 63
    new-instance p0, Lcom/horcrux/svg/w;

    .line 64
    .line 65
    const-wide/16 v0, 0x0

    .line 66
    .line 67
    invoke-direct {p0, v0, v1, v0, v1}, Lcom/horcrux/svg/w;-><init>(DD)V

    .line 68
    .line 69
    .line 70
    sput-object p0, Lcom/horcrux/svg/y;->g:Lcom/horcrux/svg/w;

    .line 71
    .line 72
    :cond_3
    :goto_1
    sget p0, Lcom/horcrux/svg/y;->e:I

    .line 73
    .line 74
    add-int/2addr p0, v2

    .line 75
    sput p0, Lcom/horcrux/svg/y;->e:I

    .line 76
    .line 77
    return-void
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

.method static h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/s;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/horcrux/svg/y;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/horcrux/svg/y;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lcom/horcrux/svg/y;->e:I

    .line 10
    .line 11
    new-instance v0, Lcom/horcrux/svg/w;

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/w;-><init>(DD)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/horcrux/svg/y;->f:Lcom/horcrux/svg/w;

    .line 19
    .line 20
    new-instance v0, Lcom/horcrux/svg/w;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/w;-><init>(DD)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/horcrux/svg/y;->g:Lcom/horcrux/svg/w;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/horcrux/svg/s;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/horcrux/svg/y;->g(Lcom/horcrux/svg/s;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lcom/horcrux/svg/y;->e()V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lcom/horcrux/svg/y;->d:Ljava/util/ArrayList;

    .line 51
    .line 52
    return-object p0
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

.method private static i(Lcom/horcrux/svg/w;)Z
    .locals 4

    iget-wide v0, p0, Lcom/horcrux/svg/w;->a:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/horcrux/svg/w;->b:D

    cmpl-double p0, v0, v2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static j(D)D
    .locals 2

    const-wide v0, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method private static k(Lcom/horcrux/svg/w;Lcom/horcrux/svg/w;)Lcom/horcrux/svg/w;
    .locals 5

    new-instance v0, Lcom/horcrux/svg/w;

    iget-wide v1, p1, Lcom/horcrux/svg/w;->a:D

    iget-wide v3, p0, Lcom/horcrux/svg/w;->a:D

    sub-double/2addr v1, v3

    iget-wide v3, p1, Lcom/horcrux/svg/w;->b:D

    iget-wide p0, p0, Lcom/horcrux/svg/w;->b:D

    sub-double/2addr v3, p0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/horcrux/svg/w;-><init>(DD)V

    return-object v0
.end method
