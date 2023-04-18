.class public Ly0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly0/b$a;,
        Ly0/b$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/solver/widgets/ConstraintWidget;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ly0/b$a;

.field private c:Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly0/b;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ly0/b$a;

    .line 12
    .line 13
    invoke-direct {v0}, Ly0/b$a;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 17
    .line 18
    iput-object p1, p0, Ly0/b;->c:Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;

    .line 19
    .line 20
    return-void
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

.method private a(Ly0/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)Z
    .locals 5

    .line 1
    iget-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->w()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput-object v1, v0, Ly0/b$a;->a:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 8
    .line 9
    iget-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 10
    .line 11
    invoke-virtual {p2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, v0, Ly0/b$a;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 16
    .line 17
    iget-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iput v1, v0, Ly0/b$a;->c:I

    .line 24
    .line 25
    iget-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iput v1, v0, Ly0/b$a;->d:I

    .line 32
    .line 33
    iget-object v0, p0, Ly0/b;->b:Ly0/b$a;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iput-boolean v1, v0, Ly0/b$a;->i:Z

    .line 37
    .line 38
    iput-boolean p3, v0, Ly0/b$a;->j:Z

    .line 39
    .line 40
    iget-object p3, v0, Ly0/b$a;->a:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 41
    .line 42
    sget-object v2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->m:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    if-ne p3, v2, :cond_0

    .line 46
    .line 47
    move p3, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move p3, v1

    .line 50
    :goto_0
    iget-object v4, v0, Ly0/b$a;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 51
    .line 52
    if-ne v4, v2, :cond_1

    .line 53
    .line 54
    move v2, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move v2, v1

    .line 57
    :goto_1
    const/4 v4, 0x0

    .line 58
    if-eqz p3, :cond_2

    .line 59
    .line 60
    iget p3, p2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 61
    .line 62
    cmpl-float p3, p3, v4

    .line 63
    .line 64
    if-lez p3, :cond_2

    .line 65
    .line 66
    move p3, v3

    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move p3, v1

    .line 69
    :goto_2
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget v2, p2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 72
    .line 73
    cmpl-float v2, v2, v4

    .line 74
    .line 75
    if-lez v2, :cond_3

    .line 76
    .line 77
    move v2, v3

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move v2, v1

    .line 80
    :goto_3
    const/4 v4, 0x4

    .line 81
    if-eqz p3, :cond_4

    .line 82
    .line 83
    iget-object p3, p2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n:[I

    .line 84
    .line 85
    aget p3, p3, v1

    .line 86
    .line 87
    if-ne p3, v4, :cond_4

    .line 88
    .line 89
    sget-object p3, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->k:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 90
    .line 91
    iput-object p3, v0, Ly0/b$a;->a:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 92
    .line 93
    :cond_4
    if-eqz v2, :cond_5

    .line 94
    .line 95
    iget-object p3, p2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n:[I

    .line 96
    .line 97
    aget p3, p3, v3

    .line 98
    .line 99
    if-ne p3, v4, :cond_5

    .line 100
    .line 101
    sget-object p3, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->k:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 102
    .line 103
    iput-object p3, v0, Ly0/b$a;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 104
    .line 105
    :cond_5
    invoke-interface {p1, p2, v0}, Ly0/b$b;->b(Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Ly0/b$a;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Ly0/b;->b:Ly0/b$a;

    .line 109
    .line 110
    iget p1, p1, Ly0/b$a;->e:I

    .line 111
    .line 112
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Ly0/b;->b:Ly0/b$a;

    .line 116
    .line 117
    iget p1, p1, Ly0/b$a;->f:I

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Ly0/b;->b:Ly0/b$a;

    .line 123
    .line 124
    iget-boolean p1, p1, Ly0/b$a;->h:Z

    .line 125
    .line 126
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->d0(Z)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Ly0/b;->b:Ly0/b$a;

    .line 130
    .line 131
    iget p1, p1, Ly0/b$a;->g:I

    .line 132
    .line 133
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Y(I)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Ly0/b;->b:Ly0/b$a;

    .line 137
    .line 138
    iput-boolean v1, p1, Ly0/b$a;->j:Z

    .line 139
    .line 140
    iget-boolean p1, p1, Ly0/b$a;->i:Z

    .line 141
    .line 142
    return p1
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

.method private b(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;)V
    .locals 9

    .line 1
    iget-object v0, p1, Lx0/c;->w0:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->S0()Ly0/b$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v0, :cond_5

    .line 14
    .line 15
    iget-object v4, p1, Lx0/c;->w0:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 22
    .line 23
    instance-of v5, v4, Landroidx/constraintlayout/solver/widgets/e;

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    iget-object v5, v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e:Ly0/j;

    .line 29
    .line 30
    iget-object v5, v5, Ly0/m;->e:Ly0/g;

    .line 31
    .line 32
    iget-boolean v5, v5, Ly0/f;->j:Z

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    iget-object v5, v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->f:Ly0/l;

    .line 37
    .line 38
    iget-object v5, v5, Ly0/m;->e:Ly0/g;

    .line 39
    .line 40
    iget-boolean v5, v5, Ly0/f;->j:Z

    .line 41
    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-virtual {v4, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->q(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v6, 0x1

    .line 50
    invoke-virtual {v4, v6}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->q(I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object v8, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->m:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 55
    .line 56
    if-ne v5, v8, :cond_2

    .line 57
    .line 58
    iget v5, v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l:I

    .line 59
    .line 60
    if-eq v5, v6, :cond_2

    .line 61
    .line 62
    if-ne v7, v8, :cond_2

    .line 63
    .line 64
    iget v5, v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->m:I

    .line 65
    .line 66
    if-eq v5, v6, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move v6, v2

    .line 70
    :goto_1
    if-eqz v6, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-direct {p0, v1, v4, v2}, Ly0/b;->a(Ly0/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)Z

    .line 74
    .line 75
    .line 76
    iget-object v4, p1, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->B0:Landroidx/constraintlayout/solver/Metrics;

    .line 77
    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    iget-wide v5, v4, Landroidx/constraintlayout/solver/Metrics;->a:J

    .line 81
    .line 82
    const-wide/16 v7, 0x1

    .line 83
    .line 84
    add-long/2addr v5, v7

    .line 85
    iput-wide v5, v4, Landroidx/constraintlayout/solver/Metrics;->a:J

    .line 86
    .line 87
    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-interface {v1}, Ly0/b$b;->a()V

    .line 91
    .line 92
    .line 93
    return-void
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

.method private c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;Ljava/lang/String;II)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->r0(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->q0(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p3}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p4}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->r0(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->q0(I)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Ly0/b;->c:Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->H0()V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
.end method


# virtual methods
.method public d(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;IIIIIIIII)J
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move/from16 v4, p7

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->S0()Ly0/b$b;

    move-result-object v5

    .line 2
    iget-object v6, v1, Lx0/c;->w0:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 3
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v7

    .line 4
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v8

    const/16 v9, 0x80

    .line 5
    invoke-static {v2, v9}, Landroidx/constraintlayout/solver/widgets/f;->b(II)Z

    move-result v9

    const/4 v10, 0x0

    if-nez v9, :cond_1

    const/16 v12, 0x40

    .line 6
    invoke-static {v2, v12}, Landroidx/constraintlayout/solver/widgets/f;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v10

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_a

    move v12, v10

    :goto_2
    if-ge v12, v6, :cond_a

    .line 7
    iget-object v13, v1, Lx0/c;->w0:Ljava/util/ArrayList;

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 8
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->w()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    move-result-object v14

    sget-object v15, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->m:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    if-ne v14, v15, :cond_2

    const/4 v14, 0x1

    goto :goto_3

    :cond_2
    move v14, v10

    .line 9
    :goto_3
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    move-result-object v11

    if-ne v11, v15, :cond_3

    const/4 v11, 0x1

    goto :goto_4

    :cond_3
    move v11, v10

    :goto_4
    if-eqz v14, :cond_4

    if-eqz v11, :cond_4

    .line 10
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->r()F

    move-result v11

    const/4 v14, 0x0

    cmpl-float v11, v11, v14

    if-lez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_5

    :cond_4
    move v11, v10

    .line 11
    :goto_5
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->T()Z

    move-result v14

    if-eqz v14, :cond_6

    if-eqz v11, :cond_6

    :cond_5
    :goto_6
    move v2, v10

    goto :goto_7

    .line 12
    :cond_6
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->V()Z

    move-result v14

    if-eqz v14, :cond_7

    if-eqz v11, :cond_7

    goto :goto_6

    .line 13
    :cond_7
    instance-of v11, v13, Landroidx/constraintlayout/solver/widgets/g;

    if-eqz v11, :cond_8

    goto :goto_6

    .line 14
    :cond_8
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->T()Z

    move-result v11

    if-nez v11, :cond_5

    .line 15
    invoke-virtual {v13}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->V()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    const-wide/16 v11, 0x1

    if-eqz v2, :cond_b

    .line 16
    sget-object v13, Lw0/d;->r:Landroidx/constraintlayout/solver/Metrics;

    if-eqz v13, :cond_b

    .line 17
    iget-wide v14, v13, Landroidx/constraintlayout/solver/Metrics;->c:J

    add-long/2addr v14, v11

    iput-wide v14, v13, Landroidx/constraintlayout/solver/Metrics;->c:J

    :cond_b
    const/high16 v13, 0x40000000    # 2.0f

    if-ne v3, v13, :cond_c

    if-eq v4, v13, :cond_d

    :cond_c
    if-eqz v9, :cond_e

    :cond_d
    const/4 v14, 0x1

    goto :goto_8

    :cond_e
    move v14, v10

    :goto_8
    and-int/2addr v2, v14

    const/4 v14, 0x2

    if-eqz v2, :cond_16

    .line 18
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->A()I

    move-result v2

    move/from16 v15, p6

    invoke-static {v2, v15}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 19
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->z()I

    move-result v15

    move/from16 v11, p8

    invoke-static {v15, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    if-ne v3, v13, :cond_f

    .line 20
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v12

    if-eq v12, v2, :cond_f

    .line 21
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    .line 22
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->U0()V

    :cond_f
    if-ne v4, v13, :cond_10

    .line 23
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v2

    if-eq v2, v11, :cond_10

    .line 24
    invoke-virtual {v1, v11}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    .line 25
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->U0()V

    :cond_10
    if-ne v3, v13, :cond_11

    if-ne v4, v13, :cond_11

    .line 26
    invoke-virtual {v1, v9}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->O0(Z)Z

    move-result v2

    move v9, v14

    goto :goto_a

    .line 27
    :cond_11
    invoke-virtual {v1, v9}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->P0(Z)Z

    move-result v2

    if-ne v3, v13, :cond_12

    .line 28
    invoke-virtual {v1, v9, v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->Q0(ZI)Z

    move-result v11

    and-int/2addr v2, v11

    move v11, v2

    const/4 v2, 0x1

    goto :goto_9

    :cond_12
    move v11, v2

    move v2, v10

    :goto_9
    if-ne v4, v13, :cond_13

    const/4 v12, 0x1

    .line 29
    invoke-virtual {v1, v9, v12}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->Q0(ZI)Z

    move-result v9

    and-int/2addr v9, v11

    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v9

    move v9, v2

    move/from16 v2, v21

    goto :goto_a

    :cond_13
    move v9, v2

    move v2, v11

    :goto_a
    if-eqz v2, :cond_17

    if-ne v3, v13, :cond_14

    const/4 v3, 0x1

    goto :goto_b

    :cond_14
    move v3, v10

    :goto_b
    if-ne v4, v13, :cond_15

    const/4 v4, 0x1

    goto :goto_c

    :cond_15
    move v4, v10

    .line 30
    :goto_c
    invoke-virtual {v1, v3, v4}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->F0(ZZ)V

    goto :goto_d

    :cond_16
    move v2, v10

    move v9, v2

    :cond_17
    :goto_d
    if-eqz v2, :cond_18

    if-eq v9, v14, :cond_37

    :cond_18
    if-lez v6, :cond_19

    .line 31
    invoke-direct/range {p0 .. p1}, Ly0/b;->b(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;)V

    .line 32
    :cond_19
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->T0()I

    move-result v2

    .line 33
    iget-object v3, v0, Ly0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v6, :cond_1a

    const-string v4, "First pass"

    .line 34
    invoke-direct {v0, v1, v4, v7, v8}, Ly0/b;->c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;Ljava/lang/String;II)V

    :cond_1a
    if-lez v3, :cond_36

    .line 35
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->w()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    move-result-object v4

    sget-object v6, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->l:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    if-ne v4, v6, :cond_1b

    const/4 v12, 0x1

    goto :goto_e

    :cond_1b
    move v12, v10

    .line 36
    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    move-result-object v4

    if-ne v4, v6, :cond_1c

    const/4 v4, 0x1

    goto :goto_f

    :cond_1c
    move v4, v10

    .line 37
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v6

    iget-object v9, v0, Ly0/b;->c:Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;

    invoke-virtual {v9}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C()I

    move-result v9

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 38
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v9

    iget-object v11, v0, Ly0/b;->c:Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;

    invoke-virtual {v11}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B()I

    move-result v11

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    move v11, v10

    move v13, v11

    :goto_10
    if-ge v11, v3, :cond_23

    .line 39
    iget-object v15, v0, Ly0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 40
    instance-of v10, v15, Landroidx/constraintlayout/solver/widgets/g;

    if-nez v10, :cond_1d

    move/from16 p5, v2

    move/from16 v16, v7

    move/from16 v17, v8

    goto/16 :goto_11

    .line 41
    :cond_1d
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v10

    .line 42
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v14

    move/from16 p5, v2

    const/4 v2, 0x1

    .line 43
    invoke-direct {v0, v5, v15, v2}, Ly0/b;->a(Ly0/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)Z

    move-result v16

    or-int v2, v13, v16

    .line 44
    iget-object v13, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->B0:Landroidx/constraintlayout/solver/Metrics;

    move/from16 v16, v7

    move/from16 v17, v8

    if-eqz v13, :cond_1e

    .line 45
    iget-wide v7, v13, Landroidx/constraintlayout/solver/Metrics;->b:J

    const-wide/16 v18, 0x1

    add-long v7, v7, v18

    iput-wide v7, v13, Landroidx/constraintlayout/solver/Metrics;->b:J

    .line 46
    :cond_1e
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v7

    .line 47
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v8

    if-eq v7, v10, :cond_20

    .line 48
    invoke-virtual {v15, v7}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    if-eqz v12, :cond_1f

    .line 49
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->G()I

    move-result v2

    if-le v2, v6, :cond_1f

    .line 50
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->G()I

    move-result v2

    sget-object v7, Landroidx/constraintlayout/solver/widgets/d$b;->n:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 51
    invoke-virtual {v15, v7}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/constraintlayout/solver/widgets/d;->b()I

    move-result v7

    add-int/2addr v2, v7

    .line 52
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v6, v2

    :cond_1f
    const/4 v2, 0x1

    :cond_20
    if-eq v8, v14, :cond_22

    .line 53
    invoke-virtual {v15, v8}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    if-eqz v4, :cond_21

    .line 54
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n()I

    move-result v2

    if-le v2, v9, :cond_21

    .line 55
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n()I

    move-result v2

    sget-object v7, Landroidx/constraintlayout/solver/widgets/d$b;->o:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 56
    invoke-virtual {v15, v7}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/constraintlayout/solver/widgets/d;->b()I

    move-result v7

    add-int/2addr v2, v7

    .line 57
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v9, v2

    :cond_21
    const/4 v2, 0x1

    .line 58
    :cond_22
    check-cast v15, Landroidx/constraintlayout/solver/widgets/g;

    .line 59
    invoke-virtual {v15}, Landroidx/constraintlayout/solver/widgets/g;->I0()Z

    move-result v7

    or-int v13, v2, v7

    :goto_11
    add-int/lit8 v11, v11, 0x1

    move/from16 v2, p5

    move/from16 v7, v16

    move/from16 v8, v17

    const/4 v10, 0x0

    const/4 v14, 0x2

    goto/16 :goto_10

    :cond_23
    move/from16 p5, v2

    move/from16 v16, v7

    move/from16 v17, v8

    move v7, v14

    const/4 v2, 0x0

    :goto_12
    if-ge v2, v7, :cond_32

    const/4 v8, 0x0

    :goto_13
    if-ge v8, v3, :cond_30

    .line 60
    iget-object v10, v0, Ly0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 61
    instance-of v11, v10, Lx0/a;

    if-eqz v11, :cond_24

    instance-of v11, v10, Landroidx/constraintlayout/solver/widgets/g;

    if-eqz v11, :cond_28

    :cond_24
    instance-of v11, v10, Landroidx/constraintlayout/solver/widgets/e;

    if-eqz v11, :cond_25

    goto :goto_14

    .line 62
    :cond_25
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M()I

    move-result v11

    const/16 v14, 0x8

    if-ne v11, v14, :cond_26

    goto :goto_14

    .line 63
    :cond_26
    iget-object v11, v10, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e:Ly0/j;

    iget-object v11, v11, Ly0/m;->e:Ly0/g;

    iget-boolean v11, v11, Ly0/f;->j:Z

    if-eqz v11, :cond_27

    iget-object v11, v10, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->f:Ly0/l;

    iget-object v11, v11, Ly0/m;->e:Ly0/g;

    iget-boolean v11, v11, Ly0/f;->j:Z

    if-eqz v11, :cond_27

    goto :goto_14

    .line 64
    :cond_27
    instance-of v11, v10, Landroidx/constraintlayout/solver/widgets/g;

    if-eqz v11, :cond_29

    :cond_28
    :goto_14
    move/from16 v18, v2

    move/from16 p6, v3

    const-wide/16 v19, 0x1

    goto/16 :goto_16

    .line 65
    :cond_29
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v11

    .line 66
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v14

    .line 67
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l()I

    move-result v15

    const/4 v7, 0x1

    .line 68
    invoke-direct {v0, v5, v10, v7}, Ly0/b;->a(Ly0/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)Z

    move-result v18

    or-int v13, v13, v18

    .line 69
    iget-object v7, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->B0:Landroidx/constraintlayout/solver/Metrics;

    move/from16 v18, v2

    move/from16 p6, v3

    if-eqz v7, :cond_2a

    .line 70
    iget-wide v2, v7, Landroidx/constraintlayout/solver/Metrics;->b:J

    const-wide/16 v19, 0x1

    add-long v2, v2, v19

    iput-wide v2, v7, Landroidx/constraintlayout/solver/Metrics;->b:J

    goto :goto_15

    :cond_2a
    const-wide/16 v19, 0x1

    .line 71
    :goto_15
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v2

    .line 72
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v3

    if-eq v2, v11, :cond_2c

    .line 73
    invoke-virtual {v10, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    if-eqz v12, :cond_2b

    .line 74
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->G()I

    move-result v2

    if-le v2, v6, :cond_2b

    .line 75
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->G()I

    move-result v2

    sget-object v7, Landroidx/constraintlayout/solver/widgets/d$b;->n:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 76
    invoke-virtual {v10, v7}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/constraintlayout/solver/widgets/d;->b()I

    move-result v7

    add-int/2addr v2, v7

    .line 77
    invoke-static {v6, v2}, Ljava/lang/Math;->max(II)I

    move-result v6

    :cond_2b
    const/4 v13, 0x1

    :cond_2c
    if-eq v3, v14, :cond_2e

    .line 78
    invoke-virtual {v10, v3}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    if-eqz v4, :cond_2d

    .line 79
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n()I

    move-result v2

    if-le v2, v9, :cond_2d

    .line 80
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->n()I

    move-result v2

    sget-object v3, Landroidx/constraintlayout/solver/widgets/d$b;->o:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 81
    invoke-virtual {v10, v3}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->k(Landroidx/constraintlayout/solver/widgets/d$b;)Landroidx/constraintlayout/solver/widgets/d;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/constraintlayout/solver/widgets/d;->b()I

    move-result v3

    add-int/2addr v2, v3

    .line 82
    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move v9, v2

    :cond_2d
    const/4 v13, 0x1

    .line 83
    :cond_2e
    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q()Z

    move-result v2

    if-eqz v2, :cond_2f

    invoke-virtual {v10}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l()I

    move-result v2

    if-eq v15, v2, :cond_2f

    const/4 v13, 0x1

    :cond_2f
    :goto_16
    add-int/lit8 v8, v8, 0x1

    move/from16 v3, p6

    move/from16 v2, v18

    const/4 v7, 0x2

    goto/16 :goto_13

    :cond_30
    move/from16 v18, v2

    move/from16 p6, v3

    const-wide/16 v19, 0x1

    if-eqz v13, :cond_31

    const-string v2, "intermediate pass"

    move/from16 v3, v16

    move/from16 v7, v17

    .line 84
    invoke-direct {v0, v1, v2, v3, v7}, Ly0/b;->c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;Ljava/lang/String;II)V

    const/4 v13, 0x0

    goto :goto_17

    :cond_31
    move/from16 v3, v16

    move/from16 v7, v17

    :goto_17
    add-int/lit8 v2, v18, 0x1

    move/from16 v16, v3

    move/from16 v17, v7

    const/4 v7, 0x2

    move/from16 v3, p6

    goto/16 :goto_12

    :cond_32
    move/from16 v3, v16

    move/from16 v7, v17

    if-eqz v13, :cond_35

    const-string v2, "2nd pass"

    .line 85
    invoke-direct {v0, v1, v2, v3, v7}, Ly0/b;->c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;Ljava/lang/String;II)V

    .line 86
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    move-result v2

    if-ge v2, v6, :cond_33

    .line 87
    invoke-virtual {v1, v6}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B0(I)V

    const/4 v10, 0x1

    goto :goto_18

    :cond_33
    const/4 v10, 0x0

    .line 88
    :goto_18
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    move-result v2

    if-ge v2, v9, :cond_34

    .line 89
    invoke-virtual {v1, v9}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->e0(I)V

    const/4 v11, 0x1

    goto :goto_19

    :cond_34
    move v11, v10

    :goto_19
    if-eqz v11, :cond_35

    const-string v2, "3rd pass"

    .line 90
    invoke-direct {v0, v1, v2, v3, v7}, Ly0/b;->c(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;Ljava/lang/String;II)V

    :cond_35
    move/from16 v2, p5

    .line 91
    :cond_36
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->d1(I)V

    :cond_37
    const-wide/16 v1, 0x0

    return-wide v1
.end method

.method public e(Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ly0/b;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lx0/c;->w0:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    iget-object v2, p1, Lx0/c;->w0:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->w()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v4, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->m:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 28
    .line 29
    if-eq v3, v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->w()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v5, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->n:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 36
    .line 37
    if-eq v3, v5, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eq v3, v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->K()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-ne v3, v5, :cond_1

    .line 50
    .line 51
    :cond_0
    iget-object v3, p0, Ly0/b;->a:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidgetContainer;->U0()V

    .line 60
    .line 61
    .line 62
    return-void
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
