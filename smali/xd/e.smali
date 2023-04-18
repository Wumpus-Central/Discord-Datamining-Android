.class public final Lxd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lid/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lid/c;

    .line 5
    .line 6
    sget-object v1, Lid/a;->l:Lid/a;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lid/c;-><init>(Lid/a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxd/e;->a:Lid/c;

    .line 12
    .line 13
    return-void
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
.end method

.method private a([BI)V
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v0, :cond_0

    .line 7
    .line 8
    aget-byte v4, p1, v3

    .line 9
    .line 10
    and-int/lit16 v4, v4, 0xff

    .line 11
    .line 12
    aput v4, v1, v3

    .line 13
    .line 14
    add-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :try_start_0
    iget-object v0, p0, Lxd/e;->a:Lid/c;

    .line 18
    .line 19
    array-length v3, p1

    .line 20
    sub-int/2addr v3, p2

    .line 21
    invoke-virtual {v0, v1, v3}, Lid/c;->a([II)V
    :try_end_0
    .catch Lid/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    :goto_1
    if-ge v2, p2, :cond_1

    .line 25
    .line 26
    aget v0, v1, v2

    .line 27
    .line 28
    int-to-byte v0, v0

    .line 29
    aput-byte v0, p1, v2

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    return-void

    .line 35
    :catch_0
    invoke-static {}, Lcd/d;->a()Lcd/d;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    throw p1
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

.method private c(Lxd/a;Ljava/util/Map;)Lgd/e;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxd/a;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lgd/e;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lxd/a;->e()Lxd/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lxd/a;->d()Lxd/g;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lxd/g;->d()Lxd/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lxd/a;->c()[B

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1, v0, v1}, Lxd/b;->b([BLxd/j;Lxd/f;)[Lxd/b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    array-length v2, p1

    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    move v5, v4

    .line 25
    :goto_0
    if-ge v4, v2, :cond_0

    .line 26
    .line 27
    aget-object v6, p1, v4

    .line 28
    .line 29
    invoke-virtual {v6}, Lxd/b;->c()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    add-int/2addr v5, v6

    .line 34
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-array v2, v5, [B

    .line 38
    .line 39
    array-length v4, p1

    .line 40
    move v5, v3

    .line 41
    move v6, v5

    .line 42
    :goto_1
    if-ge v5, v4, :cond_2

    .line 43
    .line 44
    aget-object v7, p1, v5

    .line 45
    .line 46
    invoke-virtual {v7}, Lxd/b;->a()[B

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-virtual {v7}, Lxd/b;->c()I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    invoke-direct {p0, v8, v7}, Lxd/e;->a([BI)V

    .line 55
    .line 56
    .line 57
    move v9, v3

    .line 58
    :goto_2
    if-ge v9, v7, :cond_1

    .line 59
    .line 60
    add-int/lit8 v10, v6, 0x1

    .line 61
    .line 62
    aget-byte v11, v8, v9

    .line 63
    .line 64
    aput-byte v11, v2, v6

    .line 65
    .line 66
    add-int/lit8 v9, v9, 0x1

    .line 67
    .line 68
    move v6, v10

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {v2, v0, v1, p2}, Lxd/d;->a([BLxd/j;Lxd/f;Ljava/util/Map;)Lgd/e;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1
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


# virtual methods
.method public b(Lgd/b;Ljava/util/Map;)Lgd/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgd/b;",
            "Ljava/util/Map<",
            "Lcd/e;",
            "*>;)",
            "Lgd/e;"
        }
    .end annotation

    .line 1
    new-instance v0, Lxd/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lxd/a;-><init>(Lgd/b;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :try_start_0
    invoke-direct {p0, v0, p2}, Lxd/e;->c(Lxd/a;Ljava/util/Map;)Lgd/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catch Lcd/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcd/d; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-object p1

    .line 12
    :catch_0
    move-exception v1

    .line 13
    goto :goto_0

    .line 14
    :catch_1
    move-exception v1

    .line 15
    move-object v3, v1

    .line 16
    move-object v1, p1

    .line 17
    move-object p1, v3

    .line 18
    :goto_0
    :try_start_1
    invoke-virtual {v0}, Lxd/a;->f()V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-virtual {v0, v2}, Lxd/a;->g(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lxd/a;->e()Lxd/j;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lxd/a;->d()Lxd/g;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lxd/a;->b()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v0, p2}, Lxd/e;->c(Lxd/a;Ljava/util/Map;)Lgd/e;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    new-instance v0, Lxd/i;

    .line 39
    .line 40
    invoke-direct {v0, v2}, Lxd/i;-><init>(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v0}, Lgd/e;->m(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcd/f; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcd/d; {:try_start_1 .. :try_end_1} :catch_2

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :catch_2
    if-eqz p1, :cond_0

    .line 48
    .line 49
    throw p1

    .line 50
    :cond_0
    throw v1
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
.end method
