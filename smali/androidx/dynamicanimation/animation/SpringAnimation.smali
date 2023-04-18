.class public final Landroidx/dynamicanimation/animation/SpringAnimation;
.super Landroidx/dynamicanimation/animation/DynamicAnimation;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/dynamicanimation/animation/DynamicAnimation<",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        ">;"
    }
.end annotation


# instance fields
.field private A:Landroidx/dynamicanimation/animation/b;

.field private B:F

.field private C:Z


# direct methods
.method public constructor <init>(Lj1/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/dynamicanimation/animation/DynamicAnimation;-><init>(Lj1/b;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 3
    iput p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lj1/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lj1/a<",
            "TK;>;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;-><init>(Ljava/lang/Object;Lj1/a;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 7
    iput p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lj1/a;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lj1/a<",
            "TK;>;F)V"
        }
    .end annotation

    .line 9
    invoke-direct {p0, p1, p2}, Landroidx/dynamicanimation/animation/DynamicAnimation;-><init>(Ljava/lang/Object;Lj1/a;)V

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    .line 11
    iput p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    .line 13
    new-instance p1, Landroidx/dynamicanimation/animation/b;

    invoke-direct {p1, p3}, Landroidx/dynamicanimation/animation/b;-><init>(F)V

    iput-object p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    return-void
.end method

.method private s()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/b;->a()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    float-to-double v0, v0

    .line 10
    iget v2, p0, Landroidx/dynamicanimation/animation/DynamicAnimation;->g:F

    .line 11
    .line 12
    float-to-double v2, v2

    .line 13
    cmpl-double v2, v0, v2

    .line 14
    .line 15
    if-gtz v2, :cond_1

    .line 16
    .line 17
    iget v2, p0, Landroidx/dynamicanimation/animation/DynamicAnimation;->h:F

    .line 18
    .line 19
    float-to-double v2, v2

    .line 20
    cmpg-double v0, v0, v2

    .line 21
    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 26
    .line 27
    const-string v1, "Final position of the spring cannot be less than the min value."

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string v1, "Final position of the spring cannot be greater than the max value."

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 42
    .line 43
    const-string v1, "Incomplete SpringAnimation: Either final position or a spring force needs to be set."

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
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
.method public c()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->c()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 5
    .line 6
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 7
    .line 8
    .line 9
    cmpl-float v2, v0, v1

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    new-instance v2, Landroidx/dynamicanimation/animation/b;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Landroidx/dynamicanimation/animation/b;-><init>(F)V

    .line 20
    .line 21
    .line 22
    iput-object v2, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v2, v0}, Landroidx/dynamicanimation/animation/b;->e(F)Landroidx/dynamicanimation/animation/b;

    .line 26
    .line 27
    .line 28
    :goto_0
    iput v1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 29
    .line 30
    :cond_1
    return-void
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

.method public l()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/dynamicanimation/animation/SpringAnimation;->s()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->f()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    float-to-double v1, v1

    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/dynamicanimation/animation/b;->g(D)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->l()V

    .line 15
    .line 16
    .line 17
    return-void
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

.method n(J)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 9
    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget v1, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 14
    .line 15
    cmpl-float v6, v1, v5

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    iget-object v6, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 20
    .line 21
    invoke-virtual {v6, v1}, Landroidx/dynamicanimation/animation/b;->e(F)Landroidx/dynamicanimation/animation/b;

    .line 22
    .line 23
    .line 24
    iput v5, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 25
    .line 26
    :cond_0
    iget-object v1, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroidx/dynamicanimation/animation/b;->a()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 33
    .line 34
    iput v4, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 35
    .line 36
    iput-boolean v3, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    iget v1, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 40
    .line 41
    cmpl-float v1, v1, v5

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget-object v6, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 46
    .line 47
    iget v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 48
    .line 49
    float-to-double v7, v1

    .line 50
    iget v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 51
    .line 52
    float-to-double v9, v1

    .line 53
    const-wide/16 v11, 0x2

    .line 54
    .line 55
    div-long v18, p1, v11

    .line 56
    .line 57
    move-wide/from16 v11, v18

    .line 58
    .line 59
    invoke-virtual/range {v6 .. v12}, Landroidx/dynamicanimation/animation/b;->h(DDJ)Landroidx/dynamicanimation/animation/DynamicAnimation$p;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v6, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 64
    .line 65
    iget v7, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 66
    .line 67
    invoke-virtual {v6, v7}, Landroidx/dynamicanimation/animation/b;->e(F)Landroidx/dynamicanimation/animation/b;

    .line 68
    .line 69
    .line 70
    iput v5, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 71
    .line 72
    iget-object v13, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 73
    .line 74
    iget v5, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->a:F

    .line 75
    .line 76
    float-to-double v14, v5

    .line 77
    iget v1, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->b:F

    .line 78
    .line 79
    float-to-double v5, v1

    .line 80
    move-wide/from16 v16, v5

    .line 81
    .line 82
    invoke-virtual/range {v13 .. v19}, Landroidx/dynamicanimation/animation/b;->h(DDJ)Landroidx/dynamicanimation/animation/DynamicAnimation$p;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget v5, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->a:F

    .line 87
    .line 88
    iput v5, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 89
    .line 90
    iget v1, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->b:F

    .line 91
    .line 92
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-object v13, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 96
    .line 97
    iget v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 98
    .line 99
    float-to-double v14, v1

    .line 100
    iget v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 101
    .line 102
    float-to-double v5, v1

    .line 103
    move-wide/from16 v16, v5

    .line 104
    .line 105
    move-wide/from16 v18, p1

    .line 106
    .line 107
    invoke-virtual/range {v13 .. v19}, Landroidx/dynamicanimation/animation/b;->h(DDJ)Landroidx/dynamicanimation/animation/DynamicAnimation$p;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget v5, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->a:F

    .line 112
    .line 113
    iput v5, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 114
    .line 115
    iget v1, v1, Landroidx/dynamicanimation/animation/DynamicAnimation$p;->b:F

    .line 116
    .line 117
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 118
    .line 119
    :goto_0
    iget v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 120
    .line 121
    iget v5, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->h:F

    .line 122
    .line 123
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 128
    .line 129
    iget v5, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->g:F

    .line 130
    .line 131
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 136
    .line 137
    iget v5, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 138
    .line 139
    invoke-virtual {v0, v1, v5}, Landroidx/dynamicanimation/animation/SpringAnimation;->r(FF)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_3

    .line 144
    .line 145
    iget-object v1, v0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 146
    .line 147
    invoke-virtual {v1}, Landroidx/dynamicanimation/animation/b;->a()F

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput v1, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->b:F

    .line 152
    .line 153
    iput v4, v0, Landroidx/dynamicanimation/animation/DynamicAnimation;->a:F

    .line 154
    .line 155
    return v2

    .line 156
    :cond_3
    return v3
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

.method public o(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->B:F

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Landroidx/dynamicanimation/animation/b;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Landroidx/dynamicanimation/animation/b;-><init>(F)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroidx/dynamicanimation/animation/b;->e(F)Landroidx/dynamicanimation/animation/b;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/dynamicanimation/animation/SpringAnimation;->l()V

    .line 27
    .line 28
    .line 29
    :goto_0
    return-void
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

.method public p()Z
    .locals 4

    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    iget-wide v0, v0, Landroidx/dynamicanimation/animation/b;->b:D

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Landroidx/dynamicanimation/animation/b;
    .locals 1

    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    return-object v0
.end method

.method r(FF)Z
    .locals 1

    iget-object v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    invoke-virtual {v0, p1, p2}, Landroidx/dynamicanimation/animation/b;->c(FF)Z

    move-result p1

    return p1
.end method

.method public t(Landroidx/dynamicanimation/animation/b;)Landroidx/dynamicanimation/animation/SpringAnimation;
    .locals 0

    iput-object p1, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->A:Landroidx/dynamicanimation/animation/b;

    return-object p0
.end method

.method public u()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/dynamicanimation/animation/SpringAnimation;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-boolean v0, p0, Landroidx/dynamicanimation/animation/DynamicAnimation;->f:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/dynamicanimation/animation/SpringAnimation;->C:Z

    .line 23
    .line 24
    :cond_0
    return-void

    .line 25
    :cond_1
    new-instance v0, Landroid/util/AndroidRuntimeException;

    .line 26
    .line 27
    const-string v1, "Animations may only be started on the main thread"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 34
    .line 35
    const-string v1, "Spring animations can only come to an end when there is damping"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0
.end method
