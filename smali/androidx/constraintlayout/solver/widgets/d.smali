.class public Landroidx/constraintlayout/solver/widgets/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/solver/widgets/d$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroidx/constraintlayout/solver/widgets/d;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

.field public final c:Landroidx/constraintlayout/solver/widgets/d$b;

.field public d:Landroidx/constraintlayout/solver/widgets/d;

.field public e:I

.field f:I

.field g:Lw0/h;


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/d$b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/d;->e:I

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/d;->f:I

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 14
    .line 15
    iput-object p2, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

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
.method public a(Landroidx/constraintlayout/solver/widgets/d;IIZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/d;->k()V

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    if-nez p4, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/constraintlayout/solver/widgets/d;->j(Landroidx/constraintlayout/solver/widgets/d;)Z

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    if-nez p4, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    iput-object p1, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    .line 19
    .line 20
    iget-object p4, p1, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 21
    .line 22
    if-nez p4, :cond_2

    .line 23
    .line 24
    new-instance p4, Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p4, p1, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 30
    .line 31
    :cond_2
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    .line 32
    .line 33
    iget-object p1, p1, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    if-lez p2, :cond_3

    .line 39
    .line 40
    iput p2, p0, Landroidx/constraintlayout/solver/widgets/d;->e:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    iput v1, p0, Landroidx/constraintlayout/solver/widgets/d;->e:I

    .line 44
    .line 45
    :goto_0
    iput p3, p0, Landroidx/constraintlayout/solver/widgets/d;->f:I

    .line 46
    .line 47
    return v0
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

.method public b()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/d;->f:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-le v0, v2, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->M()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/d;->f:I

    .line 31
    .line 32
    return v0

    .line 33
    :cond_1
    iget v0, p0, Landroidx/constraintlayout/solver/widgets/d;->e:I

    .line 34
    .line 35
    return v0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public final c()Landroidx/constraintlayout/solver/widgets/d;
    .locals 2

    .line 1
    sget-object v0, Landroidx/constraintlayout/solver/widgets/d$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/AssertionError;

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    throw v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->C:Landroidx/constraintlayout/solver/widgets/d;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_1
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->E:Landroidx/constraintlayout/solver/widgets/d;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_2
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 37
    .line 38
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->B:Landroidx/constraintlayout/solver/widgets/d;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_3
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 42
    .line 43
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->D:Landroidx/constraintlayout/solver/widgets/d;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_4
    const/4 v0, 0x0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
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

.method public d()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    return-object v0
.end method

.method public e()Lw0/h;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->g:Lw0/h;

    return-object v0
.end method

.method public f()Landroidx/constraintlayout/solver/widgets/d;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    return-object v0
.end method

.method public g()Landroidx/constraintlayout/solver/widgets/d$b;
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    return-object v0
.end method

.method public h()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Landroidx/constraintlayout/solver/widgets/d;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/d;->c()Landroidx/constraintlayout/solver/widgets/d;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroidx/constraintlayout/solver/widgets/d;->i()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_2
    return v1
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j(Landroidx/constraintlayout/solver/widgets/d;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/d;->g()Landroidx/constraintlayout/solver/widgets/d$b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v1, v2, :cond_3

    .line 13
    .line 14
    sget-object v1, Landroidx/constraintlayout/solver/widgets/d$b;->p:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 15
    .line 16
    if-ne v2, v1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/d;->d()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/constraintlayout/solver/widgets/d;->d()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->Q()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    :cond_1
    return v0

    .line 39
    :cond_2
    return v3

    .line 40
    :cond_3
    sget-object v4, Landroidx/constraintlayout/solver/widgets/d$a;->a:[I

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    aget v2, v4, v2

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    new-instance p1, Ljava/lang/AssertionError;

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :pswitch_0
    return v0

    .line 64
    :pswitch_1
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->m:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 65
    .line 66
    if-eq v1, v2, :cond_5

    .line 67
    .line 68
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->o:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 69
    .line 70
    if-ne v1, v2, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    move v2, v0

    .line 74
    goto :goto_1

    .line 75
    :cond_5
    :goto_0
    move v2, v3

    .line 76
    :goto_1
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/d;->d()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    instance-of p1, p1, Landroidx/constraintlayout/solver/widgets/e;

    .line 81
    .line 82
    if-eqz p1, :cond_8

    .line 83
    .line 84
    if-nez v2, :cond_6

    .line 85
    .line 86
    sget-object p1, Landroidx/constraintlayout/solver/widgets/d$b;->s:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 87
    .line 88
    if-ne v1, p1, :cond_7

    .line 89
    .line 90
    :cond_6
    move v0, v3

    .line 91
    :cond_7
    move v2, v0

    .line 92
    :cond_8
    return v2

    .line 93
    :pswitch_2
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->l:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 94
    .line 95
    if-eq v1, v2, :cond_a

    .line 96
    .line 97
    sget-object v2, Landroidx/constraintlayout/solver/widgets/d$b;->n:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 98
    .line 99
    if-ne v1, v2, :cond_9

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_9
    move v2, v0

    .line 103
    goto :goto_3

    .line 104
    :cond_a
    :goto_2
    move v2, v3

    .line 105
    :goto_3
    invoke-virtual {p1}, Landroidx/constraintlayout/solver/widgets/d;->d()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    instance-of p1, p1, Landroidx/constraintlayout/solver/widgets/e;

    .line 110
    .line 111
    if-eqz p1, :cond_d

    .line 112
    .line 113
    if-nez v2, :cond_b

    .line 114
    .line 115
    sget-object p1, Landroidx/constraintlayout/solver/widgets/d$b;->r:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 116
    .line 117
    if-ne v1, p1, :cond_c

    .line 118
    .line 119
    :cond_b
    move v0, v3

    .line 120
    :cond_c
    move v2, v0

    .line 121
    :cond_d
    return v2

    .line 122
    :pswitch_3
    sget-object p1, Landroidx/constraintlayout/solver/widgets/d$b;->p:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 123
    .line 124
    if-eq v1, p1, :cond_e

    .line 125
    .line 126
    sget-object p1, Landroidx/constraintlayout/solver/widgets/d$b;->r:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 127
    .line 128
    if-eq v1, p1, :cond_e

    .line 129
    .line 130
    sget-object p1, Landroidx/constraintlayout/solver/widgets/d$b;->s:Landroidx/constraintlayout/solver/widgets/d$b;

    .line 131
    .line 132
    if-eq v1, p1, :cond_e

    .line 133
    .line 134
    move v0, v3

    .line 135
    :cond_e
    return v0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/constraintlayout/solver/widgets/d;->a:Ljava/util/HashSet;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Landroidx/constraintlayout/solver/widgets/d;->d:Landroidx/constraintlayout/solver/widgets/d;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/d;->e:I

    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    iput v0, p0, Landroidx/constraintlayout/solver/widgets/d;->f:I

    .line 20
    .line 21
    return-void
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

.method public l(Lw0/c;)V
    .locals 2

    .line 1
    iget-object p1, p0, Landroidx/constraintlayout/solver/widgets/d;->g:Lw0/h;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Lw0/h;

    .line 6
    .line 7
    sget-object v0, Lw0/h$a;->k:Lw0/h$a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p1, v0, v1}, Lw0/h;-><init>(Lw0/h$a;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Landroidx/constraintlayout/solver/widgets/d;->g:Lw0/h;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lw0/h;->d()V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/d;->b:Landroidx/constraintlayout/solver/widgets/ConstraintWidget;

    invoke-virtual {v1}, Landroidx/constraintlayout/solver/widgets/ConstraintWidget;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/constraintlayout/solver/widgets/d;->c:Landroidx/constraintlayout/solver/widgets/d$b;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
