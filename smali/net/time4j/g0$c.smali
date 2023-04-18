.class Lnet/time4j/g0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfj/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/time4j/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfj/m0<",
        "Lnet/time4j/g0;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lnet/time4j/g;


# direct methods
.method private constructor <init>(Lnet/time4j/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/time4j/g0$c;->a:Lnet/time4j/g;

    return-void
.end method

.method synthetic constructor <init>(Lnet/time4j/g;Lnet/time4j/g0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/time4j/g0$c;-><init>(Lnet/time4j/g;)V

    return-void
.end method

.method static synthetic c(Lnet/time4j/g0;JLnet/time4j/g;)Lnet/time4j/j;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lnet/time4j/g0$c;->e(Lnet/time4j/g0;JLnet/time4j/g;)Lnet/time4j/j;

    move-result-object p0

    return-object p0
.end method

.method private static e(Lnet/time4j/g0;JLnet/time4j/g;)Lnet/time4j/j;
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/16 v3, 0x18

    .line 12
    .line 13
    if-ge v2, v3, :cond_0

    .line 14
    .line 15
    new-instance p1, Lnet/time4j/j;

    .line 16
    .line 17
    invoke-direct {p1, v0, v1, p0}, Lnet/time4j/j;-><init>(JLnet/time4j/g0;)V

    .line 18
    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const-class v0, Lnet/time4j/j;

    .line 22
    .line 23
    invoke-static {v0, p3, p0, p1, p2}, Lnet/time4j/g0$c;->g(Ljava/lang/Class;Lnet/time4j/g;Lnet/time4j/g0;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lnet/time4j/j;

    .line 28
    .line 29
    return-object p0
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

.method private static g(Ljava/lang/Class;Lnet/time4j/g;Lnet/time4j/g0;J)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lnet/time4j/g;",
            "Lnet/time4j/g0;",
            "J)TR;"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p2}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget-object v3, Lnet/time4j/g0$a;->a:[I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    aget v3, v3, v4

    .line 20
    .line 21
    const/16 v4, 0x3c

    .line 22
    .line 23
    packed-switch v3, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :pswitch_0
    invoke-static {p2}, Lnet/time4j/g0;->O(Lnet/time4j/g0;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    int-to-long v0, p1

    .line 41
    invoke-static {v0, v1, p3, p4}, Lnet/time4j/base/c;->f(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    invoke-static {p2}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    int-to-long v2, p1

    .line 50
    const p1, 0x3b9aca00

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1, p1}, Lnet/time4j/base/c;->b(JI)J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-static {v2, v3, v5, v6}, Lnet/time4j/base/c;->f(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    invoke-static {p2}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    int-to-long v5, v5

    .line 66
    invoke-static {v2, v3, v4}, Lnet/time4j/base/c;->b(JI)J

    .line 67
    .line 68
    .line 69
    move-result-wide v7

    .line 70
    invoke-static {v5, v6, v7, v8}, Lnet/time4j/base/c;->f(JJ)J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    invoke-static {p2}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    int-to-long v7, p2

    .line 79
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->b(JI)J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    invoke-static {v7, v8, v9, v10}, Lnet/time4j/base/c;->f(JJ)J

    .line 84
    .line 85
    .line 86
    move-result-wide v7

    .line 87
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->d(JI)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    invoke-static {v2, v3, v4}, Lnet/time4j/base/c;->d(JI)I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v0, v1, p1}, Lnet/time4j/base/c;->d(JI)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    move v0, p2

    .line 100
    move v1, v2

    .line 101
    move v2, p1

    .line 102
    goto :goto_0

    .line 103
    :pswitch_1
    sget-object p1, Lnet/time4j/g;->p:Lnet/time4j/g;

    .line 104
    .line 105
    const-wide/16 v0, 0x3e8

    .line 106
    .line 107
    invoke-static {p3, p4, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide p3

    .line 111
    invoke-static {p0, p1, p2, p3, p4}, Lnet/time4j/g0$c;->g(Ljava/lang/Class;Lnet/time4j/g;Lnet/time4j/g0;J)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_2
    sget-object p1, Lnet/time4j/g;->p:Lnet/time4j/g;

    .line 117
    .line 118
    const-wide/32 v0, 0xf4240

    .line 119
    .line 120
    .line 121
    invoke-static {p3, p4, v0, v1}, Lnet/time4j/base/c;->i(JJ)J

    .line 122
    .line 123
    .line 124
    move-result-wide p3

    .line 125
    invoke-static {p0, p1, p2, p3, p4}, Lnet/time4j/g0$c;->g(Ljava/lang/Class;Lnet/time4j/g;Lnet/time4j/g0;J)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_3
    invoke-static {p2}, Lnet/time4j/g0;->j0(Lnet/time4j/g0;)B

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    int-to-long v0, p1

    .line 135
    invoke-static {v0, v1, p3, p4}, Lnet/time4j/base/c;->f(JJ)J

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    invoke-static {p2}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    int-to-long v5, p1

    .line 144
    invoke-static {v0, v1, v4}, Lnet/time4j/base/c;->b(JI)J

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    invoke-static {v5, v6, v7, v8}, Lnet/time4j/base/c;->f(JJ)J

    .line 149
    .line 150
    .line 151
    move-result-wide v5

    .line 152
    invoke-static {p2}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    int-to-long p1, p1

    .line 157
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->b(JI)J

    .line 158
    .line 159
    .line 160
    move-result-wide v7

    .line 161
    invoke-static {p1, p2, v7, v8}, Lnet/time4j/base/c;->f(JJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide v7

    .line 165
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->d(JI)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    invoke-static {v0, v1, v4}, Lnet/time4j/base/c;->d(JI)I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    move v0, p1

    .line 174
    goto :goto_0

    .line 175
    :pswitch_4
    invoke-static {p2}, Lnet/time4j/g0;->i0(Lnet/time4j/g0;)B

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    int-to-long v5, p1

    .line 180
    invoke-static {v5, v6, p3, p4}, Lnet/time4j/base/c;->f(JJ)J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    invoke-static {p2}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    int-to-long p1, p1

    .line 189
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->b(JI)J

    .line 190
    .line 191
    .line 192
    move-result-wide v7

    .line 193
    invoke-static {p1, p2, v7, v8}, Lnet/time4j/base/c;->f(JJ)J

    .line 194
    .line 195
    .line 196
    move-result-wide v7

    .line 197
    invoke-static {v5, v6, v4}, Lnet/time4j/base/c;->d(JI)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    goto :goto_0

    .line 202
    :pswitch_5
    invoke-static {p2}, Lnet/time4j/g0;->h0(Lnet/time4j/g0;)B

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    int-to-long p1, p1

    .line 207
    invoke-static {p1, p2, p3, p4}, Lnet/time4j/base/c;->f(JJ)J

    .line 208
    .line 209
    .line 210
    move-result-wide v7

    .line 211
    :goto_0
    const/16 p1, 0x18

    .line 212
    .line 213
    invoke-static {v7, v8, p1}, Lnet/time4j/base/c;->d(JI)I

    .line 214
    .line 215
    .line 216
    move-result p2

    .line 217
    or-int v3, p2, v0

    .line 218
    .line 219
    or-int/2addr v3, v1

    .line 220
    or-int/2addr v3, v2

    .line 221
    const-class v4, Lnet/time4j/g0;

    .line 222
    .line 223
    if-nez v3, :cond_1

    .line 224
    .line 225
    const-wide/16 v0, 0x0

    .line 226
    .line 227
    cmp-long p2, p3, v0

    .line 228
    .line 229
    if-lez p2, :cond_0

    .line 230
    .line 231
    if-ne p0, v4, :cond_0

    .line 232
    .line 233
    sget-object p2, Lnet/time4j/g0;->x:Lnet/time4j/g0;

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_0
    sget-object p2, Lnet/time4j/g0;->w:Lnet/time4j/g0;

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_1
    invoke-static {p2, v0, v1, v2}, Lnet/time4j/g0;->M0(IIII)Lnet/time4j/g0;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    :goto_1
    if-ne p0, v4, :cond_2

    .line 244
    .line 245
    invoke-virtual {p0, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    return-object p0

    .line 250
    :cond_2
    invoke-static {v7, v8, p1}, Lnet/time4j/base/c;->b(JI)J

    .line 251
    .line 252
    .line 253
    move-result-wide p3

    .line 254
    new-instance p1, Lnet/time4j/j;

    .line 255
    .line 256
    invoke-direct {p1, p3, p4, p2}, Lnet/time4j/j;-><init>(JLnet/time4j/g0;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 266
    .line 267
    .line 268
    .line 269
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)J
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    check-cast p2, Lnet/time4j/g0;

    invoke-virtual {p0, p1, p2}, Lnet/time4j/g0$c;->f(Lnet/time4j/g0;Lnet/time4j/g0;)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnet/time4j/g0;

    invoke-virtual {p0, p1, p2, p3}, Lnet/time4j/g0$c;->d(Lnet/time4j/g0;J)Lnet/time4j/g0;

    move-result-object p1

    return-object p1
.end method

.method public d(Lnet/time4j/g0;J)Lnet/time4j/g0;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const-class v0, Lnet/time4j/g0;

    iget-object v1, p0, Lnet/time4j/g0$c;->a:Lnet/time4j/g;

    invoke-static {v0, v1, p1, p2, p3}, Lnet/time4j/g0$c;->g(Ljava/lang/Class;Lnet/time4j/g;Lnet/time4j/g0;J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/time4j/g0;

    return-object p1
.end method

.method public f(Lnet/time4j/g0;Lnet/time4j/g0;)J
    .locals 2

    .line 1
    invoke-static {p2}, Lnet/time4j/g0;->g0(Lnet/time4j/g0;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1}, Lnet/time4j/g0;->g0(Lnet/time4j/g0;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p1

    .line 9
    sub-long/2addr v0, p1

    .line 10
    sget-object p1, Lnet/time4j/g0$a;->a:[I

    .line 11
    .line 12
    iget-object p2, p0, Lnet/time4j/g0$c;->a:Lnet/time4j/g;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    aget p1, p1, p2

    .line 19
    .line 20
    packed-switch p1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 24
    .line 25
    iget-object p2, p0, Lnet/time4j/g0$c;->a:Lnet/time4j/g;

    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :pswitch_0
    const-wide/16 p1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    const-wide/16 p1, 0x3e8

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :pswitch_2
    const-wide/32 p1, 0xf4240

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_3
    const-wide/32 p1, 0x3b9aca00

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_4
    const-wide p1, 0xdf8475800L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_5
    const-wide p1, 0x34630b8a000L

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    :goto_0
    div-long/2addr v0, p1

    .line 61
    return-wide v0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
