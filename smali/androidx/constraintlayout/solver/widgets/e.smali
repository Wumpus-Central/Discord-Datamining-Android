.class public Landroidx/constraintlayout/solver/widgets/e;
.super Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
.source "SourceFile"


# instance fields
.field private A0:I

.field private B0:I

.field protected w0:F

.field protected x0:I

.field protected y0:I

.field private z0:Landroidx/constraintlayout/solver/widgets/d;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 10
    .line 11
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C:Landroidx/constraintlayout/solver/widgets/d;

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 19
    .line 20
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->B0:I

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->J:[Landroidx/constraintlayout/solver/widgets/d;

    .line 35
    .line 36
    array-length v1, v1

    .line 37
    :goto_0
    if-ge v0, v1, :cond_0

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->J:[Landroidx/constraintlayout/solver/widgets/d;

    .line 40
    .line 41
    iget-object v3, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 42
    .line 43
    aput-object v3, v2, v0

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-void
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
.end method


# virtual methods
.method public G0(Lw0/d;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->E()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lw0/d;->y(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C0(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->D0(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->E()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C0(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->D0(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->E()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void
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
.end method

.method public H0()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    return v0
.end method

.method public I0()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    return v0
.end method

.method public J0()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

    return v0
.end method

.method public K0()F
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    return v0
.end method

.method public L0(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-le p1, v0, :cond_0

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v1, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 7
    .line 8
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 9
    .line 10
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

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
.end method

.method public M0(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-le p1, v0, :cond_0

    .line 3
    .line 4
    const/high16 v1, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v1, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 7
    .line 8
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 9
    .line 10
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

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
.end method

.method public N0(F)V
    .locals 1

    .line 1
    const/high16 v0, -0x40800000    # -1.0f

    .line 2
    .line 3
    cmpl-float v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 11
    .line 12
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

    .line 13
    .line 14
    :cond_0
    return-void
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
.end method

.method public O0(I)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    iget p1, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B:Landroidx/constraintlayout/solver/widgets/d;

    .line 19
    .line 20
    iput-object p1, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C:Landroidx/constraintlayout/solver/widgets/d;

    .line 24
    .line 25
    iput-object p1, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 26
    .line 27
    :goto_0
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->J:[Landroidx/constraintlayout/solver/widgets/d;

    .line 35
    .line 36
    array-length p1, p1

    .line 37
    const/4 v0, 0x0

    .line 38
    :goto_1
    if-ge v0, p1, :cond_2

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->J:[Landroidx/constraintlayout/solver/widgets/d;

    .line 41
    .line 42
    iget-object v2, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 43
    .line 44
    aput-object v2, v1, v0

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    return-void
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
.end method

.method public f(Lw0/d;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->E()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget-object v1, Landroidx/constraintlayout/solver/widgets/d$b;->l:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->n:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    iget-object v3, v3, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M:[Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 29
    .line 30
    aget-object v3, v3, v5

    .line 31
    .line 32
    sget-object v6, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->l:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 33
    .line 34
    if-ne v3, v6, :cond_1

    .line 35
    .line 36
    move v3, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v3, v5

    .line 39
    :goto_0
    iget v6, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 40
    .line 41
    if-nez v6, :cond_3

    .line 42
    .line 43
    sget-object v1, Landroidx/constraintlayout/solver/widgets/d$b;->m:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->o:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M:[Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 60
    .line 61
    aget-object v0, v0, v4

    .line 62
    .line 63
    sget-object v3, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->l:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 64
    .line 65
    if-ne v0, v3, :cond_2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v4, v5

    .line 69
    :goto_1
    move v3, v4

    .line 70
    :cond_3
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 71
    .line 72
    const/16 v4, 0x8

    .line 73
    .line 74
    const/4 v6, -0x1

    .line 75
    const/4 v7, 0x5

    .line 76
    if-eq v0, v6, :cond_4

    .line 77
    .line 78
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p1, v1}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget v6, p0, Landroidx/constraintlayout/solver/widgets/e;->x0:I

    .line 89
    .line 90
    invoke-virtual {p1, v0, v1, v6, v4}, Lw0/d;->e(Lw0/h;Lw0/h;II)Lw0/b;

    .line 91
    .line 92
    .line 93
    if-eqz v3, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p1, v1, v0, v5, v7}, Lw0/d;->h(Lw0/h;Lw0/h;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

    .line 104
    .line 105
    if-eq v0, v6, :cond_5

    .line 106
    .line 107
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {p1, v2}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget v6, p0, Landroidx/constraintlayout/solver/widgets/e;->y0:I

    .line 118
    .line 119
    neg-int v6, v6

    .line 120
    invoke-virtual {p1, v0, v2, v6, v4}, Lw0/d;->e(Lw0/h;Lw0/h;II)Lw0/b;

    .line 121
    .line 122
    .line 123
    if-eqz v3, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1, v1}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {p1, v0, v1, v5, v7}, Lw0/d;->h(Lw0/h;Lw0/h;II)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2, v0, v5, v7}, Lw0/d;->h(Lw0/h;Lw0/h;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_5
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 137
    .line 138
    const/high16 v1, -0x40800000    # -1.0f

    .line 139
    .line 140
    cmpl-float v0, v0, v1

    .line 141
    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p1, v2}, Lw0/d;->q(Ljava/lang/Object;)Lw0/h;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget v2, p0, Landroidx/constraintlayout/solver/widgets/e;->w0:F

    .line 155
    .line 156
    invoke-static {p1, v0, v1, v2}, Lw0/d;->s(Lw0/d;Lw0/h;Lw0/h;F)Lw0/b;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {p1, v0}, Lw0/d;->d(Lw0/b;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    :goto_2
    return-void
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
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;
    .locals 2

    .line 1
    sget-object v0, Landroidx/constraintlayout/solver/widgets/e$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_0
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :pswitch_1
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_2
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/e;->A0:I

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/e;->z0:Landroidx/constraintlayout/solver/widgets/d;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
