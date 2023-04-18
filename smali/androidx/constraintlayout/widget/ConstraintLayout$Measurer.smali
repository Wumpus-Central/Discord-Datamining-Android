.class Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly0/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ConstraintLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "Measurer"
.end annotation


# instance fields
.field a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->h:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
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


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v2, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    instance-of v4, v3, Landroidx/constraintlayout/widget/d;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    check-cast v3, Landroidx/constraintlayout/widget/d;

    .line 22
    .line 23
    iget-object v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/widget/d;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 32
    .line 33
    invoke-static {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$000(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-lez v0, :cond_2

    .line 42
    .line 43
    :goto_1
    if-ge v1, v0, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 46
    .line 47
    invoke-static {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->access$000(Landroidx/constraintlayout/widget/ConstraintLayout;)Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Landroidx/constraintlayout/widget/b;

    .line 56
    .line 57
    iget-object v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/widget/b;->j(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    return-void
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

.method public final b(Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Ly0/b$a;)V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/16 v4, 0x8

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->U()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_1

    .line 24
    .line 25
    iput v5, v2, Ly0/b$a;->e:I

    .line 26
    .line 27
    iput v5, v2, Ly0/b$a;->f:I

    .line 28
    .line 29
    iput v5, v2, Ly0/b$a;->g:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v3, v2, Ly0/b$a;->a:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 33
    .line 34
    iget-object v4, v2, Ly0/b$a;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 35
    .line 36
    iget v6, v2, Ly0/b$a;->c:I

    .line 37
    .line 38
    iget v7, v2, Ly0/b$a;->d:I

    .line 39
    .line 40
    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->b:I

    .line 41
    .line 42
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->c:I

    .line 43
    .line 44
    add-int/2addr v8, v9

    .line 45
    iget v9, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->d:I

    .line 46
    .line 47
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->o()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v10

    .line 51
    check-cast v10, Landroid/view/View;

    .line 52
    .line 53
    sget-object v11, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a:[I

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    aget v12, v11, v12

    .line 60
    .line 61
    const/4 v13, 0x4

    .line 62
    const/4 v14, 0x3

    .line 63
    const/4 v5, 0x2

    .line 64
    const/4 v15, 0x1

    .line 65
    if-eq v12, v15, :cond_b

    .line 66
    .line 67
    if-eq v12, v5, :cond_9

    .line 68
    .line 69
    if-eq v12, v14, :cond_8

    .line 70
    .line 71
    if-eq v12, v13, :cond_2

    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    :goto_0
    const/4 v9, 0x0

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->f:I

    .line 78
    .line 79
    const/4 v12, -0x2

    .line 80
    invoke-static {v6, v9, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    iget v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l:I

    .line 85
    .line 86
    if-ne v9, v15, :cond_3

    .line 87
    .line 88
    move v9, v15

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const/4 v9, 0x0

    .line 91
    :goto_1
    iget-object v12, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 92
    .line 93
    const/16 v16, 0x0

    .line 94
    .line 95
    aput v16, v12, v5

    .line 96
    .line 97
    iget-boolean v13, v2, Ly0/b$a;->j:Z

    .line 98
    .line 99
    if-eqz v13, :cond_a

    .line 100
    .line 101
    if-eqz v9, :cond_4

    .line 102
    .line 103
    aget v13, v12, v14

    .line 104
    .line 105
    if-eqz v13, :cond_4

    .line 106
    .line 107
    aget v12, v12, v16

    .line 108
    .line 109
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    .line 110
    .line 111
    .line 112
    move-result v13

    .line 113
    if-ne v12, v13, :cond_5

    .line 114
    .line 115
    :cond_4
    instance-of v12, v10, Landroidx/constraintlayout/widget/d;

    .line 116
    .line 117
    if-eqz v12, :cond_6

    .line 118
    .line 119
    :cond_5
    move v12, v15

    .line 120
    goto :goto_2

    .line 121
    :cond_6
    const/4 v12, 0x0

    .line 122
    :goto_2
    if-eqz v9, :cond_7

    .line 123
    .line 124
    if-eqz v12, :cond_a

    .line 125
    .line 126
    :cond_7
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->N()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    const/high16 v9, 0x40000000    # 2.0f

    .line 131
    .line 132
    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    goto :goto_0

    .line 137
    :cond_8
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->f:I

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->x()I

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    add-int/2addr v9, v12

    .line 144
    const/4 v12, -0x1

    .line 145
    invoke-static {v6, v9, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    iget-object v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 150
    .line 151
    aput v12, v9, v5

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_9
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->f:I

    .line 155
    .line 156
    const/4 v12, -0x2

    .line 157
    invoke-static {v6, v9, v12}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    iget-object v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 162
    .line 163
    aput v12, v9, v5

    .line 164
    .line 165
    :cond_a
    move v9, v15

    .line 166
    goto :goto_3

    .line 167
    :cond_b
    const/high16 v9, 0x40000000    # 2.0f

    .line 168
    .line 169
    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    iget-object v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 174
    .line 175
    aput v6, v9, v5

    .line 176
    .line 177
    move v6, v12

    .line 178
    goto :goto_0

    .line 179
    :goto_3
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 180
    .line 181
    .line 182
    move-result v12

    .line 183
    aget v11, v11, v12

    .line 184
    .line 185
    if-eq v11, v15, :cond_15

    .line 186
    .line 187
    if-eq v11, v5, :cond_13

    .line 188
    .line 189
    if-eq v11, v14, :cond_12

    .line 190
    .line 191
    const/4 v7, 0x4

    .line 192
    if-eq v11, v7, :cond_c

    .line 193
    .line 194
    const/4 v7, 0x0

    .line 195
    const/4 v11, 0x0

    .line 196
    goto/16 :goto_8

    .line 197
    .line 198
    :cond_c
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->g:I

    .line 199
    .line 200
    const/4 v11, -0x2

    .line 201
    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    iget v8, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->m:I

    .line 206
    .line 207
    if-ne v8, v15, :cond_d

    .line 208
    .line 209
    move v8, v15

    .line 210
    goto :goto_4

    .line 211
    :cond_d
    const/4 v8, 0x0

    .line 212
    :goto_4
    iget-object v11, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 213
    .line 214
    const/4 v12, 0x0

    .line 215
    aput v12, v11, v14

    .line 216
    .line 217
    iget-boolean v12, v2, Ly0/b$a;->j:Z

    .line 218
    .line 219
    if-eqz v12, :cond_14

    .line 220
    .line 221
    if-eqz v8, :cond_e

    .line 222
    .line 223
    aget v12, v11, v5

    .line 224
    .line 225
    if-eqz v12, :cond_e

    .line 226
    .line 227
    aget v11, v11, v15

    .line 228
    .line 229
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    .line 230
    .line 231
    .line 232
    move-result v12

    .line 233
    if-ne v11, v12, :cond_f

    .line 234
    .line 235
    :cond_e
    instance-of v11, v10, Landroidx/constraintlayout/widget/d;

    .line 236
    .line 237
    if-eqz v11, :cond_10

    .line 238
    .line 239
    :cond_f
    move v11, v15

    .line 240
    goto :goto_5

    .line 241
    :cond_10
    const/4 v11, 0x0

    .line 242
    :goto_5
    if-eqz v8, :cond_11

    .line 243
    .line 244
    if-eqz v11, :cond_14

    .line 245
    .line 246
    :cond_11
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->t()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    const/high16 v8, 0x40000000    # 2.0f

    .line 251
    .line 252
    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 253
    .line 254
    .line 255
    move-result v7

    .line 256
    goto :goto_6

    .line 257
    :cond_12
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->g:I

    .line 258
    .line 259
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->L()I

    .line 260
    .line 261
    .line 262
    move-result v11

    .line 263
    add-int/2addr v8, v11

    .line 264
    const/4 v11, -0x1

    .line 265
    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    iget-object v8, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 270
    .line 271
    aput v11, v8, v14

    .line 272
    .line 273
    :goto_6
    move v11, v7

    .line 274
    goto :goto_7

    .line 275
    :cond_13
    iget v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->g:I

    .line 276
    .line 277
    const/4 v11, -0x2

    .line 278
    invoke-static {v7, v8, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    iget-object v8, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 283
    .line 284
    aput v11, v8, v14

    .line 285
    .line 286
    :cond_14
    move v11, v7

    .line 287
    move v7, v15

    .line 288
    goto :goto_8

    .line 289
    :cond_15
    const/high16 v8, 0x40000000    # 2.0f

    .line 290
    .line 291
    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    iget-object v8, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 296
    .line 297
    aput v7, v8, v14

    .line 298
    .line 299
    :goto_7
    const/4 v7, 0x0

    .line 300
    :goto_8
    sget-object v8, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->m:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 301
    .line 302
    if-ne v3, v8, :cond_16

    .line 303
    .line 304
    move v12, v15

    .line 305
    goto :goto_9

    .line 306
    :cond_16
    const/4 v12, 0x0

    .line 307
    :goto_9
    if-ne v4, v8, :cond_17

    .line 308
    .line 309
    move v8, v15

    .line 310
    goto :goto_a

    .line 311
    :cond_17
    const/4 v8, 0x0

    .line 312
    :goto_a
    sget-object v13, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->n:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 313
    .line 314
    if-eq v4, v13, :cond_19

    .line 315
    .line 316
    sget-object v14, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->k:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 317
    .line 318
    if-ne v4, v14, :cond_18

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_18
    const/4 v4, 0x0

    .line 322
    goto :goto_c

    .line 323
    :cond_19
    :goto_b
    move v4, v15

    .line 324
    :goto_c
    if-eq v3, v13, :cond_1b

    .line 325
    .line 326
    sget-object v13, Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;->k:Landroidx/constraintlayout/solver/widgets/ConstraintWidget$b;

    .line 327
    .line 328
    if-ne v3, v13, :cond_1a

    .line 329
    .line 330
    goto :goto_d

    .line 331
    :cond_1a
    const/4 v3, 0x0

    .line 332
    goto :goto_e

    .line 333
    :cond_1b
    :goto_d
    move v3, v15

    .line 334
    :goto_e
    const/4 v13, 0x0

    .line 335
    if-eqz v12, :cond_1c

    .line 336
    .line 337
    iget v14, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 338
    .line 339
    cmpl-float v14, v14, v13

    .line 340
    .line 341
    if-lez v14, :cond_1c

    .line 342
    .line 343
    move v14, v15

    .line 344
    goto :goto_f

    .line 345
    :cond_1c
    const/4 v14, 0x0

    .line 346
    :goto_f
    if-eqz v8, :cond_1d

    .line 347
    .line 348
    iget v15, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 349
    .line 350
    cmpl-float v13, v15, v13

    .line 351
    .line 352
    if-lez v13, :cond_1d

    .line 353
    .line 354
    const/4 v13, 0x1

    .line 355
    goto :goto_10

    .line 356
    :cond_1d
    const/4 v13, 0x0

    .line 357
    :goto_10
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 358
    .line 359
    .line 360
    move-result-object v15

    .line 361
    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 362
    .line 363
    iget-boolean v5, v2, Ly0/b$a;->j:Z

    .line 364
    .line 365
    if-nez v5, :cond_1f

    .line 366
    .line 367
    if-eqz v12, :cond_1f

    .line 368
    .line 369
    iget v5, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l:I

    .line 370
    .line 371
    if-nez v5, :cond_1f

    .line 372
    .line 373
    if-eqz v8, :cond_1f

    .line 374
    .line 375
    iget v5, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->m:I

    .line 376
    .line 377
    if-eqz v5, :cond_1e

    .line 378
    .line 379
    goto :goto_11

    .line 380
    :cond_1e
    const/4 v0, 0x0

    .line 381
    const/4 v3, 0x0

    .line 382
    const/4 v4, 0x0

    .line 383
    const/4 v5, -0x1

    .line 384
    const/16 v16, 0x0

    .line 385
    .line 386
    goto/16 :goto_1a

    .line 387
    .line 388
    :cond_1f
    :goto_11
    instance-of v5, v10, Landroidx/constraintlayout/widget/g;

    .line 389
    .line 390
    if-eqz v5, :cond_20

    .line 391
    .line 392
    instance-of v5, v1, Landroidx/constraintlayout/solver/widgets/g;

    .line 393
    .line 394
    if-eqz v5, :cond_20

    .line 395
    .line 396
    move-object v5, v1

    .line 397
    check-cast v5, Landroidx/constraintlayout/solver/widgets/g;

    .line 398
    .line 399
    move-object v8, v10

    .line 400
    check-cast v8, Landroidx/constraintlayout/widget/g;

    .line 401
    .line 402
    invoke-virtual {v8, v5, v6, v11}, Landroidx/constraintlayout/widget/g;->n(Landroidx/constraintlayout/solver/widgets/g;II)V

    .line 403
    .line 404
    .line 405
    goto :goto_12

    .line 406
    :cond_20
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    .line 407
    .line 408
    .line 409
    :goto_12
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 414
    .line 415
    .line 416
    move-result v8

    .line 417
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 418
    .line 419
    .line 420
    move-result v12

    .line 421
    if-eqz v9, :cond_21

    .line 422
    .line 423
    iget-object v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 424
    .line 425
    const/16 v16, 0x0

    .line 426
    .line 427
    aput v5, v9, v16

    .line 428
    .line 429
    const/16 v18, 0x2

    .line 430
    .line 431
    aput v8, v9, v18

    .line 432
    .line 433
    goto :goto_13

    .line 434
    :cond_21
    const/16 v16, 0x0

    .line 435
    .line 436
    const/16 v18, 0x2

    .line 437
    .line 438
    iget-object v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 439
    .line 440
    aput v16, v9, v16

    .line 441
    .line 442
    aput v16, v9, v18

    .line 443
    .line 444
    :goto_13
    if-eqz v7, :cond_22

    .line 445
    .line 446
    iget-object v7, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 447
    .line 448
    const/4 v9, 0x1

    .line 449
    aput v8, v7, v9

    .line 450
    .line 451
    const/16 v17, 0x3

    .line 452
    .line 453
    aput v5, v7, v17

    .line 454
    .line 455
    goto :goto_14

    .line 456
    :cond_22
    const/4 v9, 0x1

    .line 457
    const/16 v17, 0x3

    .line 458
    .line 459
    iget-object v7, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->h:[I

    .line 460
    .line 461
    aput v16, v7, v9

    .line 462
    .line 463
    aput v16, v7, v17

    .line 464
    .line 465
    :goto_14
    iget v7, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->o:I

    .line 466
    .line 467
    if-lez v7, :cond_23

    .line 468
    .line 469
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 470
    .line 471
    .line 472
    move-result v7

    .line 473
    goto :goto_15

    .line 474
    :cond_23
    move v7, v5

    .line 475
    :goto_15
    iget v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->p:I

    .line 476
    .line 477
    if-lez v9, :cond_24

    .line 478
    .line 479
    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    .line 480
    .line 481
    .line 482
    move-result v7

    .line 483
    :cond_24
    iget v9, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->r:I

    .line 484
    .line 485
    if-lez v9, :cond_25

    .line 486
    .line 487
    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    .line 488
    .line 489
    .line 490
    move-result v9

    .line 491
    goto :goto_16

    .line 492
    :cond_25
    move v9, v8

    .line 493
    :goto_16
    iget v0, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->s:I

    .line 494
    .line 495
    if-lez v0, :cond_26

    .line 496
    .line 497
    invoke-static {v0, v9}, Ljava/lang/Math;->min(II)I

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    :cond_26
    const/high16 v0, 0x3f000000    # 0.5f

    .line 502
    .line 503
    if-eqz v14, :cond_27

    .line 504
    .line 505
    if-eqz v4, :cond_27

    .line 506
    .line 507
    iget v3, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 508
    .line 509
    int-to-float v4, v9

    .line 510
    mul-float/2addr v4, v3

    .line 511
    add-float/2addr v4, v0

    .line 512
    float-to-int v0, v4

    .line 513
    move v7, v0

    .line 514
    goto :goto_17

    .line 515
    :cond_27
    if-eqz v13, :cond_28

    .line 516
    .line 517
    if-eqz v3, :cond_28

    .line 518
    .line 519
    iget v3, v1, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q:F

    .line 520
    .line 521
    int-to-float v4, v7

    .line 522
    div-float/2addr v4, v3

    .line 523
    add-float/2addr v4, v0

    .line 524
    float-to-int v0, v4

    .line 525
    move v9, v0

    .line 526
    :cond_28
    :goto_17
    if-ne v5, v7, :cond_2a

    .line 527
    .line 528
    if-eq v8, v9, :cond_29

    .line 529
    .line 530
    goto :goto_19

    .line 531
    :cond_29
    move v0, v7

    .line 532
    move v3, v9

    .line 533
    move v4, v12

    .line 534
    :goto_18
    const/4 v5, -0x1

    .line 535
    goto :goto_1a

    .line 536
    :cond_2a
    :goto_19
    const/high16 v0, 0x40000000    # 2.0f

    .line 537
    .line 538
    if-eq v5, v7, :cond_2b

    .line 539
    .line 540
    invoke-static {v7, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    :cond_2b
    if-eq v8, v9, :cond_2c

    .line 545
    .line 546
    invoke-static {v9, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    :cond_2c
    invoke-virtual {v10, v6, v11}, Landroid/view/View;->measure(II)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    invoke-virtual {v10}, Landroid/view/View;->getBaseline()I

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    goto :goto_18

    .line 566
    :goto_1a
    if-eq v4, v5, :cond_2d

    .line 567
    .line 568
    const/4 v5, 0x1

    .line 569
    goto :goto_1b

    .line 570
    :cond_2d
    move/from16 v5, v16

    .line 571
    .line 572
    :goto_1b
    iget v6, v2, Ly0/b$a;->c:I

    .line 573
    .line 574
    if-ne v0, v6, :cond_2f

    .line 575
    .line 576
    iget v6, v2, Ly0/b$a;->d:I

    .line 577
    .line 578
    if-eq v3, v6, :cond_2e

    .line 579
    .line 580
    goto :goto_1c

    .line 581
    :cond_2e
    move/from16 v6, v16

    .line 582
    .line 583
    goto :goto_1d

    .line 584
    :cond_2f
    :goto_1c
    const/4 v6, 0x1

    .line 585
    :goto_1d
    iput-boolean v6, v2, Ly0/b$a;->i:Z

    .line 586
    .line 587
    iget-boolean v6, v15, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->Y:Z

    .line 588
    .line 589
    if-eqz v6, :cond_30

    .line 590
    .line 591
    const/4 v9, 0x1

    .line 592
    goto :goto_1e

    .line 593
    :cond_30
    move v9, v5

    .line 594
    :goto_1e
    if-eqz v9, :cond_31

    .line 595
    .line 596
    const/4 v5, -0x1

    .line 597
    if-eq v4, v5, :cond_31

    .line 598
    .line 599
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->l()I

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-eq v1, v4, :cond_31

    .line 604
    .line 605
    const/4 v1, 0x1

    .line 606
    iput-boolean v1, v2, Ly0/b$a;->i:Z

    .line 607
    .line 608
    :cond_31
    iput v0, v2, Ly0/b$a;->e:I

    .line 609
    .line 610
    iput v3, v2, Ly0/b$a;->f:I

    .line 611
    .line 612
    iput-boolean v9, v2, Ly0/b$a;->h:Z

    .line 613
    .line 614
    iput v4, v2, Ly0/b$a;->g:I

    .line 615
    .line 616
    return-void
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
.end method

.method public c(IIIIII)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->b:I

    .line 2
    .line 3
    iput p4, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->c:I

    .line 4
    .line 5
    iput p5, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->d:I

    .line 6
    .line 7
    iput p6, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->e:I

    .line 8
    .line 9
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->f:I

    .line 10
    .line 11
    iput p2, p0, Landroidx/constraintlayout/widget/ConstraintLayout$Measurer;->g:I

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
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
.end method
