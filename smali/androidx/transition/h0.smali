.class Landroidx/transition/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/transition/h0$a;
    }
.end annotation


# direct methods
.method static a(Landroid/view/View;Landroidx/transition/f0;IIFFFFLandroid/animation/TimeInterpolator;Landroidx/transition/Transition;)Landroid/animation/Animator;
    .locals 14

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v4, v1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 12
    .line 13
    sget v5, Landroidx/transition/t;->f:I

    .line 14
    .line 15
    invoke-virtual {v4, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    check-cast v4, [I

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    aget v7, v4, v6

    .line 26
    .line 27
    sub-int v7, v7, p2

    .line 28
    .line 29
    int-to-float v7, v7

    .line 30
    add-float/2addr v7, v2

    .line 31
    aget v4, v4, v5

    .line 32
    .line 33
    sub-int v4, v4, p3

    .line 34
    .line 35
    int-to-float v4, v4

    .line 36
    add-float/2addr v4, v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move/from16 v7, p4

    .line 39
    .line 40
    move/from16 v4, p5

    .line 41
    .line 42
    :goto_0
    sub-float v8, v7, v2

    .line 43
    .line 44
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    add-int v8, p2, v8

    .line 49
    .line 50
    sub-float v9, v4, v3

    .line 51
    .line 52
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    add-int v9, p3, v9

    .line 57
    .line 58
    invoke-virtual {p0, v7}, Landroid/view/View;->setTranslationX(F)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 62
    .line 63
    .line 64
    cmpl-float v10, v7, p6

    .line 65
    .line 66
    if-nez v10, :cond_1

    .line 67
    .line 68
    cmpl-float v10, v4, p7

    .line 69
    .line 70
    if-nez v10, :cond_1

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    return-object v0

    .line 74
    :cond_1
    const/4 v10, 0x2

    .line 75
    new-array v11, v10, [Landroid/animation/PropertyValuesHolder;

    .line 76
    .line 77
    sget-object v12, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 78
    .line 79
    new-array v13, v10, [F

    .line 80
    .line 81
    aput v7, v13, v6

    .line 82
    .line 83
    aput p6, v13, v5

    .line 84
    .line 85
    invoke-static {v12, v13}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    aput-object v7, v11, v6

    .line 90
    .line 91
    sget-object v7, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 92
    .line 93
    new-array v10, v10, [F

    .line 94
    .line 95
    aput v4, v10, v6

    .line 96
    .line 97
    aput p7, v10, v5

    .line 98
    .line 99
    invoke-static {v7, v10}, Landroid/animation/PropertyValuesHolder;->ofFloat(Landroid/util/Property;[F)Landroid/animation/PropertyValuesHolder;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    aput-object v4, v11, v5

    .line 104
    .line 105
    invoke-static {p0, v11}, Landroid/animation/ObjectAnimator;->ofPropertyValuesHolder(Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    new-instance v5, Landroidx/transition/h0$a;

    .line 110
    .line 111
    iget-object v1, v1, Landroidx/transition/f0;->b:Landroid/view/View;

    .line 112
    .line 113
    move-object p1, v5

    .line 114
    move-object/from16 p2, p0

    .line 115
    .line 116
    move-object/from16 p3, v1

    .line 117
    .line 118
    move/from16 p4, v8

    .line 119
    .line 120
    move/from16 p5, v9

    .line 121
    .line 122
    move/from16 p6, v2

    .line 123
    .line 124
    move/from16 p7, v3

    .line 125
    .line 126
    invoke-direct/range {p1 .. p7}, Landroidx/transition/h0$a;-><init>(Landroid/view/View;Landroid/view/View;IIFF)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v0, p9

    .line 130
    .line 131
    invoke-virtual {v0, v5}, Landroidx/transition/Transition;->addListener(Landroidx/transition/Transition$g;)Landroidx/transition/Transition;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, v5}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v4, v5}, Landroidx/transition/a;->a(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V

    .line 138
    .line 139
    .line 140
    move-object/from16 v0, p8

    .line 141
    .line 142
    invoke-virtual {v4, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 143
    .line 144
    .line 145
    return-object v4
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
.end method
