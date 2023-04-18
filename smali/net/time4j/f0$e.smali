.class Lnet/time4j/f0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/u<",
        "Lnet/time4j/f0;",
        ">;"
    }
.end annotation


# static fields
.field private static final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    const v3, 0x5265c00

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2, v3}, Lnet/time4j/base/c;->b(JI)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    sget-object v3, Lfj/a0;->l:Lfj/a0;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Lfj/a0;->l(JLfj/a0;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-static {v0, v1}, Lnet/time4j/base/b;->l(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, Lnet/time4j/base/b;->i(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    add-int/lit8 v0, v0, 0x14

    .line 29
    .line 30
    sput v0, Lnet/time4j/f0$e;->k:I

    .line 31
    .line 32
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/f0$a;)V
    .locals 0

    invoke-direct {p0}, Lnet/time4j/f0$e;-><init>()V

    return-void
.end method

.method private static e(Lfj/q;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, Lfj/n0;->k:Lfj/n0;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lfj/q;->A(Lfj/p;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lfj/q;->E(Lfj/p;Ljava/lang/Object;)Lfj/q;

    .line 10
    .line 11
    .line 12
    :cond_0
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
.end method

.method private static h(Lfj/q;III)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;III)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p3, v0, :cond_1

    .line 3
    .line 4
    const/16 v1, 0x1c

    .line 5
    .line 6
    if-le p3, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1, p2}, Lnet/time4j/base/b;->d(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-le p3, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v0

    .line 16
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string p2, "DAY_OF_MONTH out of range: "

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p0, p1}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0
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

.method private static i(Lfj/q;ZLnet/time4j/m0;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;Z",
            "Lnet/time4j/m0;",
            "I)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/16 v0, 0x5b

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p2, v1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    if-eq p2, p1, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x5c

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 p1, 0x5a

    .line 24
    .line 25
    move v0, p1

    .line 26
    :cond_2
    :goto_0
    if-lt p3, v1, :cond_4

    .line 27
    .line 28
    if-le p3, v0, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    return v1

    .line 32
    :cond_4
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string p2, "DAY_OF_QUARTER out of range: "

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return p0
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

.method private static l(Lfj/q;II)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;II)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p2, v0, :cond_2

    .line 3
    .line 4
    const/16 v1, 0x16d

    .line 5
    .line 6
    if-le p2, v1, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lnet/time4j/base/b;->e(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x16e

    .line 15
    .line 16
    :cond_0
    if-le p2, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v0

    .line 20
    :cond_2
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v0, "DAY_OF_YEAR out of range: "

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p0, p1}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

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

.method private static m(Lfj/q;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;I)Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-lt p1, v0, :cond_1

    const/16 v1, 0xc

    if-le p1, v1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MONTH_OF_YEAR out of range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static n(Lfj/q;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;I)Z"
        }
    .end annotation

    const v0, -0x3b9ac9ff

    if-lt p1, v0, :cond_1

    const v0, 0x3b9ac9ff

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "YEAR out of range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public a()Lfj/f0;
    .locals 1

    sget-object v0, Lfj/f0;->a:Lfj/f0;

    return-object v0
.end method

.method public b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/f0;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/q<",
            "*>;",
            "Lfj/d;",
            "ZZ)",
            "Lnet/time4j/f0;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/time4j/f0;->x:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/time4j/f0;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object v0, Lnet/time4j/f0;->z:Lnet/time4j/c;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/high16 v3, -0x80000000

    .line 25
    .line 26
    if-eq v0, v3, :cond_e

    .line 27
    .line 28
    sget-object v4, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    .line 29
    .line 30
    invoke-virtual {p1, v4}, Lfj/q;->m(Lfj/p;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-ne v5, v3, :cond_1

    .line 35
    .line 36
    sget-object v6, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    .line 37
    .line 38
    invoke-virtual {p1, v6}, Lfj/q;->o(Lfj/p;)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1, v6}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Lnet/time4j/b0;

    .line 49
    .line 50
    invoke-virtual {v5}, Lnet/time4j/b0;->b()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    :cond_1
    const/4 v6, 0x1

    .line 55
    if-eq v5, v3, :cond_4

    .line 56
    .line 57
    sget-object v7, Lnet/time4j/f0;->E:Lnet/time4j/k0;

    .line 58
    .line 59
    invoke-virtual {p1, v7}, Lfj/q;->m(Lfj/p;)I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eq v8, v3, :cond_4

    .line 64
    .line 65
    if-eqz p3, :cond_2

    .line 66
    .line 67
    invoke-static {v0, v6, v6}, Lnet/time4j/f0;->L0(III)Lnet/time4j/f0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-interface {v4, p2}, Lnet/time4j/k0;->h(Ljava/lang/Number;)Lnet/time4j/o;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p1, p2}, Lfj/q;->F(Lfj/v;)Lfj/q;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lnet/time4j/f0;

    .line 84
    .line 85
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-interface {v7, p2}, Lnet/time4j/k0;->h(Ljava/lang/Number;)Lnet/time4j/o;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Lfj/q;->F(Lfj/v;)Lfj/q;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lnet/time4j/f0;

    .line 98
    .line 99
    return-object p1

    .line 100
    :cond_2
    invoke-static {p1, v0}, Lnet/time4j/f0$e;->n(Lfj/q;I)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_3

    .line 105
    .line 106
    invoke-static {p1, v5}, Lnet/time4j/f0$e;->m(Lfj/q;I)Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-eqz p2, :cond_3

    .line 111
    .line 112
    invoke-static {p1, v0, v5, v8}, Lnet/time4j/f0$e;->h(Lfj/q;III)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    invoke-static {v0, v5, v8, v1}, Lnet/time4j/f0;->k0(IIIZ)Lnet/time4j/f0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_3
    return-object v2

    .line 124
    :cond_4
    sget-object v4, Lnet/time4j/f0;->G:Lnet/time4j/k0;

    .line 125
    .line 126
    invoke-virtual {p1, v4}, Lfj/q;->m(Lfj/p;)I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eq v5, v3, :cond_7

    .line 131
    .line 132
    if-eqz p3, :cond_5

    .line 133
    .line 134
    invoke-static {v0, v6}, Lnet/time4j/f0;->K0(II)Lnet/time4j/f0;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-interface {v4, p2}, Lnet/time4j/k0;->h(Ljava/lang/Number;)Lnet/time4j/o;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p1, p2}, Lfj/q;->F(Lfj/v;)Lfj/q;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lnet/time4j/f0;

    .line 151
    .line 152
    return-object p1

    .line 153
    :cond_5
    invoke-static {p1, v0}, Lnet/time4j/f0$e;->n(Lfj/q;I)Z

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    if-eqz p2, :cond_6

    .line 158
    .line 159
    invoke-static {p1, v0, v5}, Lnet/time4j/f0$e;->l(Lfj/q;II)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_6

    .line 164
    .line 165
    invoke-static {v0, v5}, Lnet/time4j/f0;->K0(II)Lnet/time4j/f0;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_6
    return-object v2

    .line 171
    :cond_7
    sget-object v5, Lnet/time4j/f0;->H:Lnet/time4j/k0;

    .line 172
    .line 173
    invoke-virtual {p1, v5}, Lfj/q;->m(Lfj/p;)I

    .line 174
    .line 175
    .line 176
    move-result v5

    .line 177
    if-eq v5, v3, :cond_e

    .line 178
    .line 179
    sget-object v7, Lnet/time4j/f0;->B:Lnet/time4j/c0;

    .line 180
    .line 181
    invoke-virtual {p1, v7}, Lfj/q;->o(Lfj/p;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_e

    .line 186
    .line 187
    invoke-virtual {p1, v7}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    check-cast p2, Lnet/time4j/m0;

    .line 192
    .line 193
    invoke-static {v0}, Lnet/time4j/base/b;->e(I)Z

    .line 194
    .line 195
    .line 196
    move-result p4

    .line 197
    if-eqz p4, :cond_8

    .line 198
    .line 199
    const/16 v1, 0x5b

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_8
    const/16 v1, 0x5a

    .line 203
    .line 204
    :goto_0
    add-int/2addr v1, v5

    .line 205
    sget-object v3, Lnet/time4j/m0;->k:Lnet/time4j/m0;

    .line 206
    .line 207
    if-ne p2, v3, :cond_9

    .line 208
    .line 209
    move v1, v5

    .line 210
    goto :goto_1

    .line 211
    :cond_9
    sget-object v3, Lnet/time4j/m0;->m:Lnet/time4j/m0;

    .line 212
    .line 213
    if-ne p2, v3, :cond_a

    .line 214
    .line 215
    add-int/lit8 v1, v1, 0x5b

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_a
    sget-object v3, Lnet/time4j/m0;->n:Lnet/time4j/m0;

    .line 219
    .line 220
    if-ne p2, v3, :cond_b

    .line 221
    .line 222
    add-int/lit16 v1, v1, 0xb7

    .line 223
    .line 224
    :cond_b
    :goto_1
    if-eqz p3, :cond_c

    .line 225
    .line 226
    invoke-static {v0, v6}, Lnet/time4j/f0;->K0(II)Lnet/time4j/f0;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-interface {v4, p2}, Lnet/time4j/k0;->h(Ljava/lang/Number;)Lnet/time4j/o;

    .line 235
    .line 236
    .line 237
    move-result-object p2

    .line 238
    invoke-virtual {p1, p2}, Lfj/q;->F(Lfj/v;)Lfj/q;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Lnet/time4j/f0;

    .line 243
    .line 244
    return-object p1

    .line 245
    :cond_c
    invoke-static {p1, v0}, Lnet/time4j/f0$e;->n(Lfj/q;I)Z

    .line 246
    .line 247
    .line 248
    move-result p3

    .line 249
    if-eqz p3, :cond_d

    .line 250
    .line 251
    invoke-static {p1, p4, p2, v5}, Lnet/time4j/f0$e;->i(Lfj/q;ZLnet/time4j/m0;I)Z

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_d

    .line 256
    .line 257
    invoke-static {v0, v1}, Lnet/time4j/f0;->K0(II)Lnet/time4j/f0;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    return-object p1

    .line 262
    :cond_d
    return-object v2

    .line 263
    :cond_e
    sget-object v0, Lnet/time4j/f0;->A:Lnet/time4j/c;

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Lfj/q;->m(Lfj/p;)I

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eq v0, v3, :cond_14

    .line 270
    .line 271
    sget-object v3, Lnet/time4j/z0;->w:Lnet/time4j/z0;

    .line 272
    .line 273
    invoke-virtual {v3}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-virtual {p1, v4}, Lfj/q;->o(Lfj/p;)Z

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    if-eqz v4, :cond_14

    .line 282
    .line 283
    invoke-virtual {v3}, Lnet/time4j/z0;->n()Lnet/time4j/c;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    invoke-virtual {p1, p2}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    check-cast p2, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    sget-object p3, Lnet/time4j/f0;->F:Lnet/time4j/c0;

    .line 298
    .line 299
    invoke-virtual {p1, p3}, Lfj/q;->o(Lfj/p;)Z

    .line 300
    .line 301
    .line 302
    move-result p4

    .line 303
    if-eqz p4, :cond_f

    .line 304
    .line 305
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p3

    .line 309
    check-cast p3, Lnet/time4j/x0;

    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_f
    invoke-virtual {v3}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    .line 313
    .line 314
    .line 315
    move-result-object p3

    .line 316
    invoke-virtual {p1, p3}, Lfj/q;->o(Lfj/p;)Z

    .line 317
    .line 318
    .line 319
    move-result p3

    .line 320
    if-eqz p3, :cond_13

    .line 321
    .line 322
    invoke-virtual {v3}, Lnet/time4j/z0;->i()Lnet/time4j/c0;

    .line 323
    .line 324
    .line 325
    move-result-object p3

    .line 326
    invoke-virtual {p1, p3}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object p3

    .line 330
    check-cast p3, Lnet/time4j/x0;

    .line 331
    .line 332
    :goto_2
    const p4, -0x3b9ac9ff

    .line 333
    .line 334
    .line 335
    if-lt v0, p4, :cond_12

    .line 336
    .line 337
    const p4, 0x3b9ac9ff

    .line 338
    .line 339
    .line 340
    if-le v0, p4, :cond_10

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_10
    invoke-static {v0, p2, p3, v1}, Lnet/time4j/f0;->m0(IILnet/time4j/x0;Z)Lnet/time4j/f0;

    .line 344
    .line 345
    .line 346
    move-result-object p3

    .line 347
    if-nez p3, :cond_11

    .line 348
    .line 349
    invoke-static {p2}, Lnet/time4j/f0;->n0(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p2

    .line 353
    invoke-static {p1, p2}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    :cond_11
    return-object p3

    .line 357
    :cond_12
    :goto_3
    invoke-static {v0}, Lnet/time4j/f0;->l0(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    invoke-static {p1, p2}, Lnet/time4j/f0$e;->e(Lfj/q;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :cond_13
    return-object v2

    .line 365
    :cond_14
    sget-object v0, Lfj/a0;->m:Lfj/a0;

    .line 366
    .line 367
    invoke-virtual {p1, v0}, Lfj/q;->o(Lfj/p;)Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_15

    .line 372
    .line 373
    invoke-virtual {p1, v0}, Lfj/q;->k(Lfj/p;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    check-cast p1, Ljava/lang/Long;

    .line 378
    .line 379
    sget-object p2, Lfj/a0;->k:Lfj/a0;

    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide p3

    .line 385
    invoke-virtual {p2, p3, p4, v0}, Lfj/a0;->l(JLfj/a0;)J

    .line 386
    .line 387
    .line 388
    move-result-wide p1

    .line 389
    invoke-static {}, Lnet/time4j/f0;->o0()Lfj/k;

    .line 390
    .line 391
    .line 392
    move-result-object p3

    .line 393
    invoke-interface {p3, p1, p2}, Lfj/k;->a(J)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    check-cast p1, Lnet/time4j/f0;

    .line 398
    .line 399
    return-object p1

    .line 400
    :cond_15
    instance-of v0, p1, Lnet/time4j/base/f;

    .line 401
    .line 402
    if-eqz v0, :cond_16

    .line 403
    .line 404
    invoke-static {}, Lnet/time4j/h0;->V()Lfj/h0;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v0, p1, p2, p3, p4}, Lfj/h0;->F(Lfj/q;Lfj/d;ZZ)Lfj/k0;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    check-cast p1, Lnet/time4j/h0;

    .line 413
    .line 414
    invoke-virtual {p1}, Lnet/time4j/h0;->Y()Lnet/time4j/f0;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    return-object p1

    .line 419
    :cond_16
    return-object v2
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
.end method

.method public bridge synthetic c(Lfj/q;Lfj/d;ZZ)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/time4j/f0$e;->b(Lfj/q;Lfj/d;ZZ)Lnet/time4j/f0;

    move-result-object p1

    return-object p1
.end method

.method public d()Lfj/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/x<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(Lnet/time4j/f0;Lfj/d;)Lfj/o;
    .locals 0

    return-object p1
.end method

.method public g(Lfj/y;Ljava/util/Locale;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p1}, Lfj/y;->a()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Lgj/e;->b(I)Lgj/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2}, Lgj/b;->r(Lgj/e;Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
.end method

.method public j()I
    .locals 1

    sget v0, Lnet/time4j/f0$e;->k:I

    return v0
.end method

.method public bridge synthetic k(Ljava/lang/Object;Lfj/d;)Lfj/o;
    .locals 0

    check-cast p1, Lnet/time4j/f0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/f0$e;->f(Lnet/time4j/f0;Lfj/d;)Lfj/o;

    move-result-object p1

    return-object p1
.end method
