.class public final Lpi/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\u001a\u0016\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0016\u0010\u0008\u001a\u00020\u0007*\u00020\u0000H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0011\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u001a\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u001a\u0011\u0010\u0015\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0007\u00f8\u0001\u0000\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "",
        "Llf/z;",
        "a",
        "(Ljava/lang/String;)B",
        "Llf/g0;",
        "j",
        "(Ljava/lang/String;)S",
        "Llf/b0;",
        "d",
        "(Ljava/lang/String;)I",
        "Llf/d0;",
        "g",
        "(Ljava/lang/String;)J",
        "b",
        "",
        "radix",
        "c",
        "k",
        "l",
        "e",
        "f",
        "h",
        "i",
        "kotlin-stdlib"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Ljava/lang/String;)B
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpi/c0;->b(Ljava/lang/String;)Llf/z;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Llf/z;->h()B

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-static {p0}, Lpi/t;->l(Ljava/lang/String;)Ljava/lang/Void;

    .line 18
    .line 19
    .line 20
    new-instance p0, Llf/i;

    .line 21
    .line 22
    invoke-direct {p0}, Llf/i;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
.end method

.method public static final b(Ljava/lang/String;)Llf/z;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {p0, v0}, Lpi/c0;->c(Ljava/lang/String;I)Llf/z;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public static final c(Ljava/lang/String;I)Llf/z;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpi/c0;->f(Ljava/lang/String;I)Llf/b0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Llf/b0;->h()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/16 v0, 0xff

    .line 18
    .line 19
    invoke-static {v0}, Llf/b0;->b(I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p0, v0}, Lpi/y;->a(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lez v0, :cond_0

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    int-to-byte p0, p0

    .line 31
    invoke-static {p0}, Llf/z;->b(B)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Llf/z;->a(B)Llf/z;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    return-object p1
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

.method public static final d(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpi/c0;->e(Ljava/lang/String;)Llf/b0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Llf/b0;->h()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-static {p0}, Lpi/t;->l(Ljava/lang/String;)Ljava/lang/Void;

    .line 18
    .line 19
    .line 20
    new-instance p0, Llf/i;

    .line 21
    .line 22
    invoke-direct {p0}, Llf/i;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
.end method

.method public static final e(Ljava/lang/String;)Llf/b0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {p0, v0}, Lpi/c0;->f(Ljava/lang/String;I)Llf/b0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public static final f(Ljava/lang/String;I)Llf/b0;
    .locals 9

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lpi/a;->a(I)I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/16 v4, 0x30

    .line 23
    .line 24
    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->i(II)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-gez v4, :cond_2

    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    if-eq v0, v4, :cond_1

    .line 32
    .line 33
    const/16 v5, 0x2b

    .line 34
    .line 35
    if-eq v3, v5, :cond_3

    .line 36
    .line 37
    :cond_1
    return-object v1

    .line 38
    :cond_2
    move v4, v2

    .line 39
    :cond_3
    invoke-static {p1}, Llf/b0;->b(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const v5, 0x71c71c7

    .line 44
    .line 45
    .line 46
    move v6, v5

    .line 47
    :goto_0
    if-ge v4, v0, :cond_8

    .line 48
    .line 49
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-static {v7, p1}, Lpi/b;->b(CI)I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-gez v7, :cond_4

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_4
    invoke-static {v2, v6}, Lpi/y;->a(II)I

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-lez v8, :cond_6

    .line 65
    .line 66
    if-ne v6, v5, :cond_5

    .line 67
    .line 68
    const/4 v6, -0x1

    .line 69
    invoke-static {v6, v3}, Lpi/b0;->a(II)I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    invoke-static {v2, v6}, Lpi/y;->a(II)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-lez v8, :cond_6

    .line 78
    .line 79
    :cond_5
    return-object v1

    .line 80
    :cond_6
    mul-int/2addr v2, v3

    .line 81
    invoke-static {v2}, Llf/b0;->b(I)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v7}, Llf/b0;->b(I)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    add-int/2addr v7, v2

    .line 90
    invoke-static {v7}, Llf/b0;->b(I)I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    invoke-static {v7, v2}, Lpi/y;->a(II)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-gez v2, :cond_7

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    move v2, v7

    .line 104
    goto :goto_0

    .line 105
    :cond_8
    invoke-static {v2}, Llf/b0;->a(I)Llf/b0;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
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

.method public static final g(Ljava/lang/String;)J
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpi/c0;->h(Ljava/lang/String;)Llf/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Llf/d0;->h()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    invoke-static {p0}, Lpi/t;->l(Ljava/lang/String;)Ljava/lang/Void;

    .line 18
    .line 19
    .line 20
    new-instance p0, Llf/i;

    .line 21
    .line 22
    invoke-direct {p0}, Llf/i;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
.end method

.method public static final h(Ljava/lang/String;)Llf/d0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {p0, v0}, Lpi/c0;->i(Ljava/lang/String;I)Llf/d0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public static final i(Ljava/lang/String;I)Llf/d0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lpi/a;->a(I)I

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    return-object v3

    .line 21
    :cond_0
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/16 v6, 0x30

    .line 27
    .line 28
    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->i(II)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-gez v6, :cond_2

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    if-eq v2, v4, :cond_1

    .line 36
    .line 37
    const/16 v6, 0x2b

    .line 38
    .line 39
    if-eq v5, v6, :cond_2

    .line 40
    .line 41
    :cond_1
    return-object v3

    .line 42
    :cond_2
    int-to-long v5, v1

    .line 43
    invoke-static {v5, v6}, Llf/d0;->b(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    const-wide v7, 0x71c71c71c71c71cL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    const-wide/16 v9, 0x0

    .line 53
    .line 54
    move-wide v11, v7

    .line 55
    :goto_0
    if-ge v4, v2, :cond_7

    .line 56
    .line 57
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v13

    .line 61
    invoke-static {v13, v1}, Lpi/b;->b(CI)I

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-gez v13, :cond_3

    .line 66
    .line 67
    return-object v3

    .line 68
    :cond_3
    invoke-static {v9, v10, v11, v12}, Lpi/z;->a(JJ)I

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    if-lez v14, :cond_5

    .line 73
    .line 74
    cmp-long v11, v11, v7

    .line 75
    .line 76
    if-nez v11, :cond_4

    .line 77
    .line 78
    const-wide/16 v11, -0x1

    .line 79
    .line 80
    invoke-static {v11, v12, v5, v6}, Lpi/a0;->a(JJ)J

    .line 81
    .line 82
    .line 83
    move-result-wide v11

    .line 84
    invoke-static {v9, v10, v11, v12}, Lpi/z;->a(JJ)I

    .line 85
    .line 86
    .line 87
    move-result v14

    .line 88
    if-lez v14, :cond_5

    .line 89
    .line 90
    :cond_4
    return-object v3

    .line 91
    :cond_5
    mul-long/2addr v9, v5

    .line 92
    invoke-static {v9, v10}, Llf/d0;->b(J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    invoke-static {v13}, Llf/b0;->b(I)I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    int-to-long v13, v13

    .line 101
    const-wide v15, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v13, v15

    .line 107
    invoke-static {v13, v14}, Llf/d0;->b(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v13

    .line 111
    add-long/2addr v13, v9

    .line 112
    invoke-static {v13, v14}, Llf/d0;->b(J)J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    invoke-static {v13, v14, v9, v10}, Lpi/z;->a(JJ)I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    if-gez v9, :cond_6

    .line 121
    .line 122
    return-object v3

    .line 123
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    move-wide v9, v13

    .line 126
    goto :goto_0

    .line 127
    :cond_7
    invoke-static {v9, v10}, Llf/d0;->a(J)Llf/d0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    return-object v0
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

.method public static final j(Ljava/lang/String;)S
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Lpi/c0;->k(Ljava/lang/String;)Llf/g0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Llf/g0;->h()S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    invoke-static {p0}, Lpi/t;->l(Ljava/lang/String;)Ljava/lang/Void;

    .line 18
    .line 19
    .line 20
    new-instance p0, Llf/i;

    .line 21
    .line 22
    invoke-direct {p0}, Llf/i;-><init>()V

    .line 23
    .line 24
    .line 25
    throw p0
    .line 26
    .line 27
.end method

.method public static final k(Ljava/lang/String;)Llf/g0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-static {p0, v0}, Lpi/c0;->l(Ljava/lang/String;I)Llf/g0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
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

.method public static final l(Ljava/lang/String;I)Llf/g0;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lpi/c0;->f(Ljava/lang/String;I)Llf/b0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 p1, 0x0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Llf/b0;->h()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const v0, 0xffff

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Llf/b0;->b(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-static {p0, v0}, Lpi/y;->a(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    int-to-short p0, p0

    .line 32
    invoke-static {p0}, Llf/g0;->b(S)S

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p0}, Llf/g0;->a(S)Llf/g0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object p1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
