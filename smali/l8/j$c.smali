.class public final Ll8/j$c;
.super Ll8/j$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field final j:Ll8/m;

.field final k:Ll8/m;

.field final l:J


# direct methods
.method public constructor <init>(Ll8/h;JJJJJLjava/util/List;JLl8/m;Ll8/m;JJ)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/h;",
            "JJJJJ",
            "Ljava/util/List<",
            "Ll8/j$d;",
            ">;J",
            "Ll8/m;",
            "Ll8/m;",
            "JJ)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    move-wide/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v4, p4

    .line 10
    .line 11
    move-wide/from16 v6, p6

    .line 12
    .line 13
    move-wide/from16 v8, p10

    .line 14
    .line 15
    move-object/from16 v10, p12

    .line 16
    .line 17
    move-wide/from16 v11, p13

    .line 18
    .line 19
    move-wide/from16 v13, p17

    .line 20
    .line 21
    move-wide/from16 v15, p19

    .line 22
    .line 23
    invoke-direct/range {v0 .. v16}, Ll8/j$a;-><init>(Ll8/h;JJJJLjava/util/List;JJJ)V

    .line 24
    .line 25
    .line 26
    move-object/from16 v1, p15

    .line 27
    .line 28
    iput-object v1, v0, Ll8/j$c;->j:Ll8/m;

    .line 29
    .line 30
    move-object/from16 v1, p16

    .line 31
    .line 32
    iput-object v1, v0, Ll8/j$c;->k:Ll8/m;

    .line 33
    .line 34
    move-wide/from16 v1, p8

    .line 35
    .line 36
    iput-wide v1, v0, Ll8/j$c;->l:J

    .line 37
    .line 38
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
.end method


# virtual methods
.method public a(Ll8/i;)Ll8/h;
    .locals 13

    .line 1
    iget-object v0, p0, Ll8/j$c;->j:Ll8/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Ll8/i;->b:Ld7/k;

    .line 6
    .line 7
    iget-object v1, p1, Ld7/k;->k:Ljava/lang/String;

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    iget v4, p1, Ld7/k;->r:I

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v6}, Ll8/m;->a(Ljava/lang/String;JIJ)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    new-instance p1, Ll8/h;

    .line 20
    .line 21
    const-wide/16 v9, 0x0

    .line 22
    .line 23
    const-wide/16 v11, -0x1

    .line 24
    .line 25
    move-object v7, p1

    .line 26
    invoke-direct/range {v7 .. v12}, Ll8/h;-><init>(Ljava/lang/String;JJ)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    invoke-super {p0, p1}, Ll8/j;->a(Ll8/i;)Ll8/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
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
.end method

.method public g(J)I
    .locals 4

    .line 1
    iget-object v0, p0, Ll8/j$a;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-wide v0, p0, Ll8/j$c;->l:J

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-wide p1, p0, Ll8/j$a;->d:J

    .line 19
    .line 20
    sub-long/2addr v0, p1

    .line 21
    const-wide/16 p1, 0x1

    .line 22
    .line 23
    add-long/2addr v0, p1

    .line 24
    long-to-int p1, v0

    .line 25
    return p1

    .line 26
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    cmp-long v0, p1, v0

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-wide v0, p0, Ll8/j$a;->e:J

    .line 36
    .line 37
    const-wide/32 v2, 0xf4240

    .line 38
    .line 39
    .line 40
    mul-long/2addr v0, v2

    .line 41
    iget-wide v2, p0, Ll8/j;->b:J

    .line 42
    .line 43
    div-long/2addr v0, v2

    .line 44
    invoke-static {p1, p2, v0, v1}, Lf9/q0;->m(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    long-to-int p1, p1

    .line 49
    return p1

    .line 50
    :cond_2
    const/4 p1, -0x1

    .line 51
    return p1
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
.end method

.method public k(Ll8/i;J)Ll8/h;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    iget-object v1, v0, Ll8/j$a;->f:Ljava/util/List;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    iget-wide v2, v0, Ll8/j$a;->d:J

    .line 7
    .line 8
    sub-long v2, p2, v2

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ll8/j$d;

    .line 16
    .line 17
    iget-wide v1, v1, Ll8/j$d;->a:J

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-wide v1, v0, Ll8/j$a;->d:J

    .line 21
    .line 22
    sub-long v1, p2, v1

    .line 23
    .line 24
    iget-wide v3, v0, Ll8/j$a;->e:J

    .line 25
    .line 26
    mul-long/2addr v1, v3

    .line 27
    :goto_0
    move-wide v6, v1

    .line 28
    iget-object v1, v0, Ll8/j$c;->k:Ll8/m;

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    iget-object v2, v2, Ll8/i;->b:Ld7/k;

    .line 32
    .line 33
    iget-object v3, v2, Ld7/k;->k:Ljava/lang/String;

    .line 34
    .line 35
    iget v5, v2, Ld7/k;->r:I

    .line 36
    .line 37
    move-object v2, v3

    .line 38
    move-wide/from16 v3, p2

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v7}, Ll8/m;->a(Ljava/lang/String;JIJ)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    new-instance v1, Ll8/h;

    .line 45
    .line 46
    const-wide/16 v10, 0x0

    .line 47
    .line 48
    const-wide/16 v12, -0x1

    .line 49
    .line 50
    move-object v8, v1

    .line 51
    invoke-direct/range {v8 .. v13}, Ll8/h;-><init>(Ljava/lang/String;JJ)V

    .line 52
    .line 53
    .line 54
    return-object v1
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
.end method
