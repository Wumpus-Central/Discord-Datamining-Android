.class public Lh8/q0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/q0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Random;

.field private final b:[I

.field private final c:[I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    invoke-direct {p0, p1, v0}, Lh8/q0$a;-><init>(ILjava/util/Random;)V

    return-void
.end method

.method private constructor <init>(ILjava/util/Random;)V
    .locals 0

    .line 2
    invoke-static {p1, p2}, Lh8/q0$a;->h(ILjava/util/Random;)[I

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lh8/q0$a;-><init>([ILjava/util/Random;)V

    return-void
.end method

.method private constructor <init>([ILjava/util/Random;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lh8/q0$a;->b:[I

    .line 5
    iput-object p2, p0, Lh8/q0$a;->a:Ljava/util/Random;

    .line 6
    array-length p2, p1

    new-array p2, p2, [I

    iput-object p2, p0, Lh8/q0$a;->c:[I

    const/4 p2, 0x0

    .line 7
    :goto_0
    array-length v0, p1

    if-ge p2, v0, :cond_0

    .line 8
    iget-object v0, p0, Lh8/q0$a;->c:[I

    aget v1, p1, p2

    aput p2, v0, v1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static h(ILjava/util/Random;)[I
    .locals 5

    .line 1
    new-array v0, p0, [I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, p0, :cond_0

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    invoke-virtual {p1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    aget v4, v0, v3

    .line 13
    .line 14
    aput v4, v0, v1

    .line 15
    .line 16
    aput v1, v0, v3

    .line 17
    .line 18
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-object v0
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


# virtual methods
.method public a(II)Lh8/q0;
    .locals 6

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    iget-object v1, p0, Lh8/q0$a;->b:[I

    .line 4
    .line 5
    array-length v1, v1

    .line 6
    sub-int/2addr v1, v0

    .line 7
    new-array v1, v1, [I

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v2

    .line 11
    :goto_0
    iget-object v4, p0, Lh8/q0$a;->b:[I

    .line 12
    .line 13
    array-length v5, v4

    .line 14
    if-ge v2, v5, :cond_2

    .line 15
    .line 16
    aget v4, v4, v2

    .line 17
    .line 18
    if-lt v4, p1, :cond_0

    .line 19
    .line 20
    if-ge v4, p2, :cond_0

    .line 21
    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sub-int v5, v2, v3

    .line 26
    .line 27
    if-lt v4, p1, :cond_1

    .line 28
    .line 29
    sub-int/2addr v4, v0

    .line 30
    :cond_1
    aput v4, v1, v5

    .line 31
    .line 32
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    new-instance p1, Lh8/q0$a;

    .line 36
    .line 37
    new-instance p2, Ljava/util/Random;

    .line 38
    .line 39
    iget-object v0, p0, Lh8/q0$a;->a:Ljava/util/Random;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-direct {p2, v2, v3}, Ljava/util/Random;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v1, p2}, Lh8/q0$a;-><init>([ILjava/util/Random;)V

    .line 49
    .line 50
    .line 51
    return-object p1
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

.method public b()I
    .locals 2

    iget-object v0, p0, Lh8/q0$a;->b:[I

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public c(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lh8/q0$a;->c:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lh8/q0$a;->b:[I

    .line 10
    .line 11
    aget v0, v0, p1

    .line 12
    .line 13
    :cond_0
    return v0
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
.end method

.method public d(I)I
    .locals 2

    .line 1
    iget-object v0, p0, Lh8/q0$a;->c:[I

    .line 2
    .line 3
    aget p1, v0, p1

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object v0, p0, Lh8/q0$a;->b:[I

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    aget p1, v0, p1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, -0x1

    .line 16
    :goto_0
    return p1
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
.end method

.method public e(II)Lh8/q0;
    .locals 8

    .line 1
    new-array v0, p2, [I

    .line 2
    .line 3
    new-array v1, p2, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, p2, :cond_0

    .line 8
    .line 9
    iget-object v4, p0, Lh8/q0$a;->a:Ljava/util/Random;

    .line 10
    .line 11
    iget-object v5, p0, Lh8/q0$a;->b:[I

    .line 12
    .line 13
    array-length v5, v5

    .line 14
    add-int/lit8 v5, v5, 0x1

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    aput v4, v0, v3

    .line 21
    .line 22
    iget-object v4, p0, Lh8/q0$a;->a:Ljava/util/Random;

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x1

    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    aget v6, v1, v4

    .line 31
    .line 32
    aput v6, v1, v3

    .line 33
    .line 34
    add-int/2addr v3, p1

    .line 35
    aput v3, v1, v4

    .line 36
    .line 37
    move v3, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lh8/q0$a;->b:[I

    .line 43
    .line 44
    array-length v3, v3

    .line 45
    add-int/2addr v3, p2

    .line 46
    new-array v3, v3, [I

    .line 47
    .line 48
    move v4, v2

    .line 49
    move v5, v4

    .line 50
    :goto_1
    iget-object v6, p0, Lh8/q0$a;->b:[I

    .line 51
    .line 52
    array-length v7, v6

    .line 53
    add-int/2addr v7, p2

    .line 54
    if-ge v2, v7, :cond_3

    .line 55
    .line 56
    if-ge v4, p2, :cond_1

    .line 57
    .line 58
    aget v7, v0, v4

    .line 59
    .line 60
    if-ne v5, v7, :cond_1

    .line 61
    .line 62
    add-int/lit8 v6, v4, 0x1

    .line 63
    .line 64
    aget v4, v1, v4

    .line 65
    .line 66
    aput v4, v3, v2

    .line 67
    .line 68
    move v4, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_1
    add-int/lit8 v7, v5, 0x1

    .line 71
    .line 72
    aget v5, v6, v5

    .line 73
    .line 74
    aput v5, v3, v2

    .line 75
    .line 76
    if-lt v5, p1, :cond_2

    .line 77
    .line 78
    add-int/2addr v5, p2

    .line 79
    aput v5, v3, v2

    .line 80
    .line 81
    :cond_2
    move v5, v7

    .line 82
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    new-instance p1, Lh8/q0$a;

    .line 86
    .line 87
    new-instance p2, Ljava/util/Random;

    .line 88
    .line 89
    iget-object v0, p0, Lh8/q0$a;->a:Ljava/util/Random;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-direct {p2, v0, v1}, Ljava/util/Random;-><init>(J)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p1, v3, p2}, Lh8/q0$a;-><init>([ILjava/util/Random;)V

    .line 99
    .line 100
    .line 101
    return-object p1
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

.method public f()I
    .locals 2

    iget-object v0, p0, Lh8/q0$a;->b:[I

    array-length v1, v0

    if-lez v1, :cond_0

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public g()Lh8/q0;
    .locals 4

    new-instance v0, Lh8/q0$a;

    new-instance v1, Ljava/util/Random;

    iget-object v2, p0, Lh8/q0$a;->a:Ljava/util/Random;

    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lh8/q0$a;-><init>(ILjava/util/Random;)V

    return-object v0
.end method

.method public getLength()I
    .locals 1

    iget-object v0, p0, Lh8/q0$a;->b:[I

    array-length v0, v0

    return v0
.end method
