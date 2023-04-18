.class final Lx8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/text/Spannable;IILx8/g;Lx8/d;Ljava/util/Map;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spannable;",
            "II",
            "Lx8/g;",
            "Lx8/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx8/g;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lx8/g;->k()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x21

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    if-eq v0, v2, :cond_0

    .line 9
    .line 10
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 11
    .line 12
    invoke-virtual {p3}, Lx8/g;->k()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    invoke-direct {v0, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0, p1, p2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p3}, Lx8/g;->r()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Landroid/text/style/StrikethroughSpan;

    .line 29
    .line 30
    invoke-direct {v0}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v0, p1, p2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p3}, Lx8/g;->s()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    new-instance v0, Landroid/text/style/UnderlineSpan;

    .line 43
    .line 44
    invoke-direct {v0}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0, v0, p1, p2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p3}, Lx8/g;->p()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 57
    .line 58
    invoke-virtual {p3}, Lx8/g;->c()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v0, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {p3}, Lx8/g;->o()Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    new-instance v0, Landroid/text/style/BackgroundColorSpan;

    .line 75
    .line 76
    invoke-virtual {p3}, Lx8/g;->b()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-direct {v0, v3}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, v0, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-virtual {p3}, Lx8/g;->d()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    new-instance v0, Landroid/text/style/TypefaceSpan;

    .line 93
    .line 94
    invoke-virtual {p3}, Lx8/g;->d()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-direct {v0, v3}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v0, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 102
    .line 103
    .line 104
    :cond_5
    invoke-virtual {p3}, Lx8/g;->n()Lx8/b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const/4 v3, 0x3

    .line 109
    const/4 v4, 0x2

    .line 110
    const/4 v5, 0x1

    .line 111
    if-eqz v0, :cond_a

    .line 112
    .line 113
    invoke-virtual {p3}, Lx8/g;->n()Lx8/b;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v0}, Lf9/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lx8/b;

    .line 122
    .line 123
    iget v6, v0, Lx8/b;->a:I

    .line 124
    .line 125
    if-ne v6, v2, :cond_8

    .line 126
    .line 127
    if-eq p6, v4, :cond_7

    .line 128
    .line 129
    if-ne p6, v5, :cond_6

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_6
    move v6, v5

    .line 133
    goto :goto_1

    .line 134
    :cond_7
    :goto_0
    move v6, v3

    .line 135
    :goto_1
    move p6, v5

    .line 136
    goto :goto_2

    .line 137
    :cond_8
    iget p6, v0, Lx8/b;->b:I

    .line 138
    .line 139
    :goto_2
    iget v0, v0, Lx8/b;->c:I

    .line 140
    .line 141
    const/4 v7, -0x2

    .line 142
    if-ne v0, v7, :cond_9

    .line 143
    .line 144
    move v0, v5

    .line 145
    :cond_9
    new-instance v7, Lu8/d;

    .line 146
    .line 147
    invoke-direct {v7, v6, p6, v0}, Lu8/d;-><init>(III)V

    .line 148
    .line 149
    .line 150
    invoke-static {p0, v7, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 151
    .line 152
    .line 153
    :cond_a
    invoke-virtual {p3}, Lx8/g;->i()I

    .line 154
    .line 155
    .line 156
    move-result p6

    .line 157
    if-eq p6, v4, :cond_c

    .line 158
    .line 159
    if-eq p6, v3, :cond_b

    .line 160
    .line 161
    const/4 p4, 0x4

    .line 162
    if-eq p6, p4, :cond_b

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_b
    new-instance p4, Lx8/a;

    .line 166
    .line 167
    invoke-direct {p4}, Lx8/a;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0, p4, p1, p2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_c
    invoke-static {p4, p5}, Lx8/f;->d(Lx8/d;Ljava/util/Map;)Lx8/d;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    if-nez p4, :cond_d

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_d
    invoke-static {p4, p5}, Lx8/f;->e(Lx8/d;Ljava/util/Map;)Lx8/d;

    .line 182
    .line 183
    .line 184
    move-result-object p5

    .line 185
    if-nez p5, :cond_e

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_e
    invoke-virtual {p5}, Lx8/d;->g()I

    .line 189
    .line 190
    .line 191
    move-result p6

    .line 192
    if-ne p6, v5, :cond_10

    .line 193
    .line 194
    const/4 p6, 0x0

    .line 195
    invoke-virtual {p5, p6}, Lx8/d;->f(I)Lx8/d;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, Lx8/d;->b:Ljava/lang/String;

    .line 200
    .line 201
    if-eqz v0, :cond_10

    .line 202
    .line 203
    invoke-virtual {p5, p6}, Lx8/d;->f(I)Lx8/d;

    .line 204
    .line 205
    .line 206
    move-result-object p5

    .line 207
    iget-object p5, p5, Lx8/d;->b:Ljava/lang/String;

    .line 208
    .line 209
    invoke-static {p5}, Lf9/q0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p5

    .line 213
    check-cast p5, Ljava/lang/String;

    .line 214
    .line 215
    iget-object p4, p4, Lx8/d;->f:Lx8/g;

    .line 216
    .line 217
    if-eqz p4, :cond_f

    .line 218
    .line 219
    invoke-virtual {p4}, Lx8/g;->h()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    :cond_f
    new-instance p4, Lu8/b;

    .line 224
    .line 225
    invoke-direct {p4, p5, v2}, Lu8/b;-><init>(Ljava/lang/String;I)V

    .line 226
    .line 227
    .line 228
    invoke-interface {p0, p4, p1, p2, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 229
    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_10
    const-string p4, "TtmlRenderUtil"

    .line 233
    .line 234
    const-string p5, "Skipping rubyText node without exactly one text child."

    .line 235
    .line 236
    invoke-static {p4, p5}, Lf9/r;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :goto_3
    invoke-virtual {p3}, Lx8/g;->m()Z

    .line 240
    .line 241
    .line 242
    move-result p4

    .line 243
    if-eqz p4, :cond_11

    .line 244
    .line 245
    new-instance p4, Lu8/a;

    .line 246
    .line 247
    invoke-direct {p4}, Lu8/a;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-static {p0, p4, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 251
    .line 252
    .line 253
    :cond_11
    invoke-virtual {p3}, Lx8/g;->f()I

    .line 254
    .line 255
    .line 256
    move-result p4

    .line 257
    if-eq p4, v5, :cond_14

    .line 258
    .line 259
    if-eq p4, v4, :cond_13

    .line 260
    .line 261
    if-eq p4, v3, :cond_12

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_12
    new-instance p4, Landroid/text/style/RelativeSizeSpan;

    .line 265
    .line 266
    invoke-virtual {p3}, Lx8/g;->e()F

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    const/high16 p5, 0x42c80000    # 100.0f

    .line 271
    .line 272
    div-float/2addr p3, p5

    .line 273
    invoke-direct {p4, p3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 274
    .line 275
    .line 276
    invoke-static {p0, p4, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 277
    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_13
    new-instance p4, Landroid/text/style/RelativeSizeSpan;

    .line 281
    .line 282
    invoke-virtual {p3}, Lx8/g;->e()F

    .line 283
    .line 284
    .line 285
    move-result p3

    .line 286
    invoke-direct {p4, p3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 287
    .line 288
    .line 289
    invoke-static {p0, p4, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 290
    .line 291
    .line 292
    goto :goto_4

    .line 293
    :cond_14
    new-instance p4, Landroid/text/style/AbsoluteSizeSpan;

    .line 294
    .line 295
    invoke-virtual {p3}, Lx8/g;->e()F

    .line 296
    .line 297
    .line 298
    move-result p3

    .line 299
    float-to-int p3, p3

    .line 300
    invoke-direct {p4, p3, v5}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 301
    .line 302
    .line 303
    invoke-static {p0, p4, p1, p2, v1}, Lu8/c;->a(Landroid/text/Spannable;Ljava/lang/Object;III)V

    .line 304
    .line 305
    .line 306
    :goto_4
    return-void
.end method

.method static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\r\n"

    .line 2
    .line 3
    const-string v1, "\n"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " *\n *"

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, " "

    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v1, "[ \t\\x0B\u000c\r]+"

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
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

.method static c(Landroid/text/SpannableStringBuilder;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x20

    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-ltz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 31
    .line 32
    .line 33
    :cond_1
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
.end method

.method private static d(Lx8/d;Ljava/util/Map;)Lx8/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx8/g;",
            ">;)",
            "Lx8/d;"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lx8/d;->f:Lx8/g;

    .line 4
    .line 5
    invoke-virtual {p0}, Lx8/d;->l()[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1, p1}, Lx8/f;->f(Lx8/g;[Ljava/lang/String;Ljava/util/Map;)Lx8/g;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lx8/g;->i()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object p0, p0, Lx8/d;->j:Lx8/d;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
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

.method private static e(Lx8/d;Ljava/util/Map;)Lx8/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/d;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx8/g;",
            ">;)",
            "Lx8/d;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Deque;->pop()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Lx8/d;

    .line 20
    .line 21
    iget-object v1, p0, Lx8/d;->f:Lx8/g;

    .line 22
    .line 23
    invoke-virtual {p0}, Lx8/d;->l()[Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v1, v2, p1}, Lx8/f;->f(Lx8/g;[Ljava/lang/String;Ljava/util/Map;)Lx8/g;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1}, Lx8/g;->i()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x3

    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lx8/d;->g()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/lit8 v1, v1, -0x1

    .line 46
    .line 47
    :goto_0
    if-ltz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lx8/d;->f(I)Lx8/d;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v0, v2}, Ljava/util/Deque;->push(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, -0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 p0, 0x0

    .line 60
    return-object p0
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

.method public static f(Lx8/g;[Ljava/lang/String;Ljava/util/Map;)Lx8/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx8/g;",
            "[",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx8/g;",
            ">;)",
            "Lx8/g;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p0, :cond_3

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    array-length v2, p1

    .line 10
    if-ne v2, v1, :cond_1

    .line 11
    .line 12
    aget-object p0, p1, v0

    .line 13
    .line 14
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lx8/g;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    array-length v2, p1

    .line 22
    if-le v2, v1, :cond_5

    .line 23
    .line 24
    new-instance p0, Lx8/g;

    .line 25
    .line 26
    invoke-direct {p0}, Lx8/g;-><init>()V

    .line 27
    .line 28
    .line 29
    array-length v1, p1

    .line 30
    :goto_0
    if-ge v0, v1, :cond_2

    .line 31
    .line 32
    aget-object v2, p1, v0

    .line 33
    .line 34
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lx8/g;

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lx8/g;->a(Lx8/g;)Lx8/g;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    return-object p0

    .line 47
    :cond_3
    if-eqz p1, :cond_4

    .line 48
    .line 49
    array-length v2, p1

    .line 50
    if-ne v2, v1, :cond_4

    .line 51
    .line 52
    aget-object p1, p1, v0

    .line 53
    .line 54
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lx8/g;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lx8/g;->a(Lx8/g;)Lx8/g;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    if-eqz p1, :cond_5

    .line 66
    .line 67
    array-length v2, p1

    .line 68
    if-le v2, v1, :cond_5

    .line 69
    .line 70
    array-length v1, p1

    .line 71
    :goto_1
    if-ge v0, v1, :cond_5

    .line 72
    .line 73
    aget-object v2, p1, v0

    .line 74
    .line 75
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lx8/g;

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Lx8/g;->a(Lx8/g;)Lx8/g;

    .line 82
    .line 83
    .line 84
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_5
    return-object p0
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
.end method
