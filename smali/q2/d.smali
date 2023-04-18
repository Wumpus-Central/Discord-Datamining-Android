.class public Lq2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lr2/c;FLg2/i;Lq2/n0;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr2/c;",
            "F",
            "Lg2/i;",
            "Lq2/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lt2/a<",
            "TT;>;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, p3, v0}, Lq2/u;->a(Lr2/c;Lg2/i;FLq2/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr2/c;",
            "Lg2/i;",
            "Lq2/n0<",
            "TT;>;)",
            "Ljava/util/List<",
            "Lt2/a<",
            "TT;>;>;"
        }
    .end annotation

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, p2, v1}, Lq2/u;->a(Lr2/c;Lg2/i;FLq2/n0;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static c(Lr2/c;Lg2/i;)Lm2/a;
    .locals 2

    new-instance v0, Lm2/a;

    sget-object v1, Lq2/g;->a:Lq2/g;

    invoke-static {p0, p1, v1}, Lq2/d;->b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm2/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static d(Lr2/c;Lg2/i;)Lm2/j;
    .locals 2

    new-instance v0, Lm2/j;

    sget-object v1, Lq2/i;->a:Lq2/i;

    invoke-static {p0, p1, v1}, Lq2/d;->b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm2/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static e(Lr2/c;Lg2/i;)Lm2/b;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lq2/d;->f(Lr2/c;Lg2/i;Z)Lm2/b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lr2/c;Lg2/i;Z)Lm2/b;
    .locals 2

    .line 1
    new-instance v0, Lm2/b;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ls2/j;->e()F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/high16 p2, 0x3f800000    # 1.0f

    .line 11
    .line 12
    :goto_0
    sget-object v1, Lq2/l;->a:Lq2/l;

    .line 13
    .line 14
    invoke-static {p0, p2, p1, v1}, Lq2/d;->a(Lr2/c;FLg2/i;Lq2/n0;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, Lm2/b;-><init>(Ljava/util/List;)V

    .line 19
    .line 20
    .line 21
    return-object v0
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
.end method

.method static g(Lr2/c;Lg2/i;I)Lm2/c;
    .locals 2

    .line 1
    new-instance v0, Lm2/c;

    .line 2
    .line 3
    new-instance v1, Lq2/o;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lq2/o;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1, v1}, Lq2/d;->b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v0, p0}, Lm2/c;-><init>(Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
.end method

.method static h(Lr2/c;Lg2/i;)Lm2/d;
    .locals 2

    new-instance v0, Lm2/d;

    sget-object v1, Lq2/r;->a:Lq2/r;

    invoke-static {p0, p1, v1}, Lq2/d;->b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm2/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static i(Lr2/c;Lg2/i;)Lm2/f;
    .locals 4

    new-instance v0, Lm2/f;

    invoke-static {}, Ls2/j;->e()F

    move-result v1

    sget-object v2, Lq2/b0;->a:Lq2/b0;

    const/4 v3, 0x1

    invoke-static {p0, p1, v1, v2, v3}, Lq2/u;->a(Lr2/c;Lg2/i;FLq2/n0;Z)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm2/f;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static j(Lr2/c;Lg2/i;)Lm2/g;
    .locals 2

    new-instance v0, Lm2/g;

    sget-object v1, Lq2/g0;->a:Lq2/g0;

    invoke-static {p0, p1, v1}, Lq2/d;->b(Lr2/c;Lg2/i;Lq2/n0;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lm2/g;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method static k(Lr2/c;Lg2/i;)Lm2/h;
    .locals 3

    .line 1
    new-instance v0, Lm2/h;

    .line 2
    .line 3
    invoke-static {}, Ls2/j;->e()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sget-object v2, Lq2/h0;->a:Lq2/h0;

    .line 8
    .line 9
    invoke-static {p0, v1, p1, v2}, Lq2/d;->a(Lr2/c;FLg2/i;Lq2/n0;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0}, Lm2/h;-><init>(Ljava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0
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
.end method
