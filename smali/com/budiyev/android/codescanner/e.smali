.class final Lcom/budiyev/android/codescanner/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private final b:Lcom/budiyev/android/codescanner/i;

.field private final c:Lcom/budiyev/android/codescanner/i;

.field private final d:Lcom/budiyev/android/codescanner/i;

.field private final e:Lcom/budiyev/android/codescanner/l;

.field private final f:I

.field private final g:Z


# direct methods
.method public constructor <init>([BLcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/l;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/budiyev/android/codescanner/e;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, Lcom/budiyev/android/codescanner/e;->b:Lcom/budiyev/android/codescanner/i;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/budiyev/android/codescanner/e;->c:Lcom/budiyev/android/codescanner/i;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/budiyev/android/codescanner/e;->d:Lcom/budiyev/android/codescanner/i;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/budiyev/android/codescanner/e;->e:Lcom/budiyev/android/codescanner/l;

    .line 13
    .line 14
    iput p6, p0, Lcom/budiyev/android/codescanner/e;->f:I

    .line 15
    .line 16
    iput-boolean p7, p0, Lcom/budiyev/android/codescanner/e;->g:Z

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
.end method


# virtual methods
.method public a(Ldd/i;)Lcom/google/zxing/Result;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/e;->b:Lcom/budiyev/android/codescanner/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/i;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/budiyev/android/codescanner/e;->b:Lcom/budiyev/android/codescanner/i;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/budiyev/android/codescanner/i;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, Lcom/budiyev/android/codescanner/e;->f:I

    .line 14
    .line 15
    iget-object v3, p0, Lcom/budiyev/android/codescanner/e;->a:[B

    .line 16
    .line 17
    invoke-static {v3, v0, v1, v2}, Lcom/budiyev/android/codescanner/n;->q([BIII)[B

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    const/16 v3, 0x5a

    .line 22
    .line 23
    if-eq v2, v3, :cond_1

    .line 24
    .line 25
    const/16 v3, 0x10e

    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v6, v0

    .line 31
    move v7, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    move v7, v0

    .line 34
    move v6, v1

    .line 35
    :goto_1
    iget-object v0, p0, Lcom/budiyev/android/codescanner/e;->e:Lcom/budiyev/android/codescanner/l;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/budiyev/android/codescanner/e;->c:Lcom/budiyev/android/codescanner/i;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/budiyev/android/codescanner/e;->d:Lcom/budiyev/android/codescanner/i;

    .line 40
    .line 41
    invoke-static {v6, v7, v0, v1, v2}, Lcom/budiyev/android/codescanner/n;->m(IILcom/budiyev/android/codescanner/l;Lcom/budiyev/android/codescanner/i;Lcom/budiyev/android/codescanner/i;)Lcom/budiyev/android/codescanner/l;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/l;->h()I

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/l;->d()I

    .line 50
    .line 51
    .line 52
    move-result v11

    .line 53
    const/4 v1, 0x1

    .line 54
    if-lt v10, v1, :cond_3

    .line 55
    .line 56
    if-ge v11, v1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    new-instance v1, Ldd/k;

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/l;->e()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-virtual {v0}, Lcom/budiyev/android/codescanner/l;->g()I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    iget-boolean v12, p0, Lcom/budiyev/android/codescanner/e;->g:Z

    .line 70
    .line 71
    move-object v4, v1

    .line 72
    invoke-direct/range {v4 .. v12}, Ldd/k;-><init>([BIIIIIIZ)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v1}, Lcom/budiyev/android/codescanner/n;->h(Ldd/i;Ldd/h;)Lcom/google/zxing/Result;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    return-object p1

    .line 80
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 81
    return-object p1
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
.end method
