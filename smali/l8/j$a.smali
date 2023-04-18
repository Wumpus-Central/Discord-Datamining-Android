.class public abstract Ll8/j$a;
.super Ll8/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field final d:J

.field final e:J

.field final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll8/j$d;",
            ">;"
        }
    .end annotation
.end field

.field private final g:J

.field private final h:J

.field final i:J


# direct methods
.method public constructor <init>(Ll8/h;JJJJLjava/util/List;JJJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/h;",
            "JJJJ",
            "Ljava/util/List<",
            "Ll8/j$d;",
            ">;JJJ)V"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    invoke-direct/range {p0 .. p5}, Ll8/j;-><init>(Ll8/h;JJ)V

    .line 3
    .line 4
    .line 5
    move-wide v1, p6

    .line 6
    iput-wide v1, v0, Ll8/j$a;->d:J

    .line 7
    .line 8
    move-wide v1, p8

    .line 9
    iput-wide v1, v0, Ll8/j$a;->e:J

    .line 10
    .line 11
    move-object v1, p10

    .line 12
    iput-object v1, v0, Ll8/j$a;->f:Ljava/util/List;

    .line 13
    .line 14
    move-wide v1, p11

    .line 15
    iput-wide v1, v0, Ll8/j$a;->i:J

    .line 16
    .line 17
    move-wide/from16 v1, p13

    .line 18
    .line 19
    iput-wide v1, v0, Ll8/j$a;->g:J

    .line 20
    .line 21
    move-wide/from16 v1, p15

    .line 22
    .line 23
    iput-wide v1, v0, Ll8/j$a;->h:J

    .line 24
    .line 25
    return-void
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
.end method


# virtual methods
.method public c(JJ)I
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Ll8/j$a;->g(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-wide v0, p0, Ll8/j$a;->h:J

    .line 10
    .line 11
    sub-long v0, p3, v0

    .line 12
    .line 13
    iget-wide v2, p0, Ll8/j$a;->i:J

    .line 14
    .line 15
    add-long/2addr v0, v2

    .line 16
    invoke-virtual {p0, v0, v1, p1, p2}, Ll8/j$a;->i(JJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-virtual {p0, p1, p2, p3, p4}, Ll8/j$a;->d(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    sub-long/2addr v0, p1

    .line 25
    long-to-int p1, v0

    .line 26
    return p1
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

.method public d(JJ)J
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, Ll8/j$a;->g(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-wide v0, p0, Ll8/j$a;->g:J

    .line 13
    .line 14
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-wide v2, p0, Ll8/j$a;->h:J

    .line 25
    .line 26
    sub-long/2addr p3, v2

    .line 27
    sub-long/2addr p3, v0

    .line 28
    invoke-virtual {p0, p3, p4, p1, p2}, Ll8/j$a;->i(JJ)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-virtual {p0}, Ll8/j$a;->e()J

    .line 33
    .line 34
    .line 35
    move-result-wide p3

    .line 36
    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    .line 37
    .line 38
    .line 39
    move-result-wide p1

    .line 40
    return-wide p1

    .line 41
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll8/j$a;->e()J

    .line 42
    .line 43
    .line 44
    move-result-wide p1

    .line 45
    return-wide p1
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
.end method

.method public e()J
    .locals 2

    iget-wide v0, p0, Ll8/j$a;->d:J

    return-wide v0
.end method

.method public f(JJ)J
    .locals 2

    .line 1
    iget-object v0, p0, Ll8/j$a;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    return-wide p1

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Ll8/j$a;->d(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p0, p1, p2, p3, p4}, Ll8/j$a;->c(JJ)I

    .line 16
    .line 17
    .line 18
    move-result p3

    .line 19
    int-to-long p3, p3

    .line 20
    add-long/2addr v0, p3

    .line 21
    invoke-virtual {p0, v0, v1}, Ll8/j$a;->j(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide p3

    .line 25
    invoke-virtual {p0, v0, v1, p1, p2}, Ll8/j$a;->h(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    add-long/2addr p3, p1

    .line 30
    iget-wide p1, p0, Ll8/j$a;->i:J

    .line 31
    .line 32
    sub-long/2addr p3, p1

    .line 33
    return-wide p3
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

.method public abstract g(J)I
.end method

.method public final h(JJ)J
    .locals 7

    .line 1
    iget-object v0, p0, Ll8/j$a;->f:Ljava/util/List;

    .line 2
    .line 3
    const-wide/32 v1, 0xf4240

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide p3, p0, Ll8/j$a;->d:J

    .line 9
    .line 10
    sub-long/2addr p1, p3

    .line 11
    long-to-int p1, p1

    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ll8/j$d;

    .line 17
    .line 18
    iget-wide p1, p1, Ll8/j$d;->b:J

    .line 19
    .line 20
    mul-long/2addr p1, v1

    .line 21
    iget-wide p3, p0, Ll8/j;->b:J

    .line 22
    .line 23
    div-long/2addr p1, p3

    .line 24
    return-wide p1

    .line 25
    :cond_0
    invoke-virtual {p0, p3, p4}, Ll8/j$a;->g(J)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v3, -0x1

    .line 30
    if-eq v0, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Ll8/j$a;->e()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    int-to-long v5, v0

    .line 37
    add-long/2addr v3, v5

    .line 38
    const-wide/16 v5, 0x1

    .line 39
    .line 40
    sub-long/2addr v3, v5

    .line 41
    cmp-long v0, p1, v3

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Ll8/j$a;->j(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    sub-long/2addr p3, p1

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-wide p1, p0, Ll8/j$a;->e:J

    .line 52
    .line 53
    mul-long/2addr p1, v1

    .line 54
    iget-wide p3, p0, Ll8/j;->b:J

    .line 55
    .line 56
    div-long p3, p1, p3

    .line 57
    .line 58
    :goto_0
    return-wide p3
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

.method public i(JJ)J
    .locals 11

    .line 1
    invoke-virtual {p0}, Ll8/j$a;->e()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0, p3, p4}, Ll8/j$a;->g(J)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    int-to-long p3, p3

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v2, p3, v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    iget-object v2, p0, Ll8/j$a;->f:Ljava/util/List;

    .line 18
    .line 19
    const-wide/16 v3, 0x1

    .line 20
    .line 21
    if-nez v2, :cond_3

    .line 22
    .line 23
    iget-wide v5, p0, Ll8/j$a;->e:J

    .line 24
    .line 25
    const-wide/32 v7, 0xf4240

    .line 26
    .line 27
    .line 28
    mul-long/2addr v5, v7

    .line 29
    iget-wide v7, p0, Ll8/j;->b:J

    .line 30
    .line 31
    div-long/2addr v5, v7

    .line 32
    iget-wide v7, p0, Ll8/j$a;->d:J

    .line 33
    .line 34
    div-long/2addr p1, v5

    .line 35
    add-long/2addr v7, p1

    .line 36
    cmp-long p1, v7, v0

    .line 37
    .line 38
    if-gez p1, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const-wide/16 p1, -0x1

    .line 42
    .line 43
    cmp-long p1, p3, p1

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    move-wide v0, v7

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    add-long/2addr v0, p3

    .line 50
    sub-long/2addr v0, v3

    .line 51
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    :goto_0
    return-wide v0

    .line 56
    :cond_3
    add-long/2addr p3, v0

    .line 57
    sub-long/2addr p3, v3

    .line 58
    move-wide v5, v0

    .line 59
    :goto_1
    cmp-long v2, v5, p3

    .line 60
    .line 61
    if-gtz v2, :cond_6

    .line 62
    .line 63
    sub-long v7, p3, v5

    .line 64
    .line 65
    const-wide/16 v9, 0x2

    .line 66
    .line 67
    div-long/2addr v7, v9

    .line 68
    add-long/2addr v7, v5

    .line 69
    invoke-virtual {p0, v7, v8}, Ll8/j$a;->j(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    cmp-long v2, v9, p1

    .line 74
    .line 75
    if-gez v2, :cond_4

    .line 76
    .line 77
    add-long v5, v7, v3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    if-lez v2, :cond_5

    .line 81
    .line 82
    sub-long/2addr v7, v3

    .line 83
    move-wide p3, v7

    .line 84
    goto :goto_1

    .line 85
    :cond_5
    return-wide v7

    .line 86
    :cond_6
    cmp-long p1, v5, v0

    .line 87
    .line 88
    if-nez p1, :cond_7

    .line 89
    .line 90
    move-wide p3, v5

    .line 91
    :cond_7
    return-wide p3
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

.method public final j(J)J
    .locals 6

    .line 1
    iget-object v0, p0, Ll8/j$a;->f:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p0, Ll8/j$a;->d:J

    .line 6
    .line 7
    sub-long/2addr p1, v1

    .line 8
    long-to-int p1, p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ll8/j$d;

    .line 14
    .line 15
    iget-wide p1, p1, Ll8/j$d;->a:J

    .line 16
    .line 17
    iget-wide v0, p0, Ll8/j;->c:J

    .line 18
    .line 19
    sub-long/2addr p1, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-wide v0, p0, Ll8/j$a;->d:J

    .line 22
    .line 23
    sub-long/2addr p1, v0

    .line 24
    iget-wide v0, p0, Ll8/j$a;->e:J

    .line 25
    .line 26
    mul-long/2addr p1, v0

    .line 27
    :goto_0
    move-wide v0, p1

    .line 28
    const-wide/32 v2, 0xf4240

    .line 29
    .line 30
    .line 31
    iget-wide v4, p0, Ll8/j;->b:J

    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lf9/q0;->I0(JJJ)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    return-wide p1
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

.method public abstract k(Ll8/i;J)Ll8/h;
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Ll8/j$a;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
