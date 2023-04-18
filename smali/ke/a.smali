.class public Lke/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([FLje/d;)[F
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget v2, p0, v1

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    cmpl-float v4, v2, v3

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v4, v1

    .line 14
    :goto_0
    const/high16 v5, 0x3f800000    # 1.0f

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    aget v2, p0, v2

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    :goto_1
    div-float v2, v5, v2

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    iget-object v6, v0, Lje/d;->a:Landroid/graphics/PointF;

    .line 35
    .line 36
    iget v7, v6, Landroid/graphics/PointF;->x:F

    .line 37
    .line 38
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    mul-float/2addr v6, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iget-object v6, v0, Lje/d;->a:Landroid/graphics/PointF;

    .line 43
    .line 44
    iget v7, v6, Landroid/graphics/PointF;->x:F

    .line 45
    .line 46
    mul-float/2addr v7, v2

    .line 47
    iget v6, v6, Landroid/graphics/PointF;->y:F

    .line 48
    .line 49
    :goto_2
    const/high16 v8, 0x40000000    # 2.0f

    .line 50
    .line 51
    if-eqz v4, :cond_3

    .line 52
    .line 53
    iget-object v4, v0, Lje/d;->b:Landroid/graphics/PointF;

    .line 54
    .line 55
    iget v9, v4, Landroid/graphics/PointF;->x:F

    .line 56
    .line 57
    mul-float/2addr v9, v8

    .line 58
    sub-float/2addr v9, v5

    .line 59
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 60
    .line 61
    mul-float/2addr v4, v8

    .line 62
    sub-float v4, v5, v4

    .line 63
    .line 64
    mul-float/2addr v4, v2

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v4, v0, Lje/d;->b:Landroid/graphics/PointF;

    .line 67
    .line 68
    iget v9, v4, Landroid/graphics/PointF;->x:F

    .line 69
    .line 70
    mul-float/2addr v9, v8

    .line 71
    sub-float/2addr v9, v5

    .line 72
    mul-float/2addr v9, v2

    .line 73
    iget v2, v4, Landroid/graphics/PointF;->y:F

    .line 74
    .line 75
    mul-float/2addr v2, v8

    .line 76
    sub-float v4, v5, v2

    .line 77
    .line 78
    :goto_3
    const/16 v2, 0x10

    .line 79
    .line 80
    new-array v8, v2, [F

    .line 81
    .line 82
    invoke-static {v8, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 83
    .line 84
    .line 85
    invoke-static {v8, v1, v9, v4, v3}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 86
    .line 87
    .line 88
    const/4 v11, 0x0

    .line 89
    iget v12, v0, Lje/d;->c:F

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    const/4 v14, 0x0

    .line 93
    const/high16 v15, 0x3f800000    # 1.0f

    .line 94
    .line 95
    move-object v10, v8

    .line 96
    invoke-static/range {v10 .. v15}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 97
    .line 98
    .line 99
    invoke-static {v8, v1, v7, v6, v5}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 100
    .line 101
    .line 102
    new-array v6, v2, [F

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    move-object v0, v6

    .line 108
    move-object/from16 v2, p0

    .line 109
    .line 110
    move-object v4, v8

    .line 111
    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 112
    .line 113
    .line 114
    return-object v6
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
