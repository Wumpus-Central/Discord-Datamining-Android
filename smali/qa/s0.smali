.class public final Lqa/s0;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/s0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final k:I

.field private final l:Landroid/os/ParcelUuid;

.field private final m:Landroid/os/ParcelUuid;

.field private final n:Landroid/os/ParcelUuid;

.field private final o:[B

.field private final p:[B

.field private final q:I

.field private final r:[B

.field private final s:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/t0;

    invoke-direct {v0}, Lqa/t0;-><init>()V

    sput-object v0, Lqa/s0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILandroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V
    .locals 0

    invoke-direct {p0}, Lx9/a;-><init>()V

    iput p1, p0, Lqa/s0;->k:I

    iput-object p2, p0, Lqa/s0;->l:Landroid/os/ParcelUuid;

    iput-object p3, p0, Lqa/s0;->m:Landroid/os/ParcelUuid;

    iput-object p4, p0, Lqa/s0;->n:Landroid/os/ParcelUuid;

    iput-object p5, p0, Lqa/s0;->o:[B

    iput-object p6, p0, Lqa/s0;->p:[B

    iput p7, p0, Lqa/s0;->q:I

    iput-object p8, p0, Lqa/s0;->r:[B

    iput-object p9, p0, Lqa/s0;->s:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_2

    .line 7
    .line 8
    const-class v2, Lqa/s0;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lqa/s0;

    .line 18
    .line 19
    iget v2, p0, Lqa/s0;->q:I

    .line 20
    .line 21
    iget v3, p1, Lqa/s0;->q:I

    .line 22
    .line 23
    if-ne v2, v3, :cond_2

    .line 24
    .line 25
    iget-object v2, p0, Lqa/s0;->r:[B

    .line 26
    .line 27
    iget-object v3, p1, Lqa/s0;->r:[B

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, p0, Lqa/s0;->s:[B

    .line 36
    .line 37
    iget-object v3, p1, Lqa/s0;->s:[B

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    iget-object v2, p0, Lqa/s0;->n:Landroid/os/ParcelUuid;

    .line 46
    .line 47
    iget-object v3, p1, Lqa/s0;->n:Landroid/os/ParcelUuid;

    .line 48
    .line 49
    invoke-static {v2, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v2, p0, Lqa/s0;->o:[B

    .line 56
    .line 57
    iget-object v3, p1, Lqa/s0;->o:[B

    .line 58
    .line 59
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iget-object v2, p0, Lqa/s0;->p:[B

    .line 66
    .line 67
    iget-object v3, p1, Lqa/s0;->p:[B

    .line 68
    .line 69
    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    iget-object v2, p0, Lqa/s0;->l:Landroid/os/ParcelUuid;

    .line 76
    .line 77
    iget-object v3, p1, Lqa/s0;->l:Landroid/os/ParcelUuid;

    .line 78
    .line 79
    invoke-static {v2, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    iget-object v2, p0, Lqa/s0;->m:Landroid/os/ParcelUuid;

    .line 86
    .line 87
    iget-object p1, p1, Lqa/s0;->m:Landroid/os/ParcelUuid;

    .line 88
    .line 89
    invoke-static {v2, p1}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_2

    .line 94
    .line 95
    return v0

    .line 96
    :cond_2
    :goto_0
    return v1
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
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    iget v1, p0, Lqa/s0;->q:I

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    iget-object v1, p0, Lqa/s0;->r:[B

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x1

    .line 25
    aput-object v1, v0, v2

    .line 26
    .line 27
    iget-object v1, p0, Lqa/s0;->s:[B

    .line 28
    .line 29
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v2, 0x2

    .line 38
    aput-object v1, v0, v2

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iget-object v2, p0, Lqa/s0;->n:Landroid/os/ParcelUuid;

    .line 42
    .line 43
    aput-object v2, v0, v1

    .line 44
    .line 45
    iget-object v1, p0, Lqa/s0;->o:[B

    .line 46
    .line 47
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/4 v2, 0x4

    .line 56
    aput-object v1, v0, v2

    .line 57
    .line 58
    iget-object v1, p0, Lqa/s0;->p:[B

    .line 59
    .line 60
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v2, 0x5

    .line 69
    aput-object v1, v0, v2

    .line 70
    .line 71
    const/4 v1, 0x6

    .line 72
    iget-object v2, p0, Lqa/s0;->l:Landroid/os/ParcelUuid;

    .line 73
    .line 74
    aput-object v2, v0, v1

    .line 75
    .line 76
    const/4 v1, 0x7

    .line 77
    iget-object v2, p0, Lqa/s0;->m:Landroid/os/ParcelUuid;

    .line 78
    .line 79
    aput-object v2, v0, v1

    .line 80
    .line 81
    invoke-static {v0}, Lw9/n;->c([Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    return v0
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
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget v2, p0, Lqa/s0;->k:I

    .line 7
    .line 8
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lqa/s0;->l:Landroid/os/ParcelUuid;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-static {p1, v2, v1, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    iget-object v2, p0, Lqa/s0;->m:Landroid/os/ParcelUuid;

    .line 20
    .line 21
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    iget-object v2, p0, Lqa/s0;->n:Landroid/os/ParcelUuid;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 p2, 0x7

    .line 31
    iget-object v1, p0, Lqa/s0;->o:[B

    .line 32
    .line 33
    invoke-static {p1, p2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x8

    .line 37
    .line 38
    iget-object v1, p0, Lqa/s0;->p:[B

    .line 39
    .line 40
    invoke-static {p1, p2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 41
    .line 42
    .line 43
    const/16 p2, 0x9

    .line 44
    .line 45
    iget v1, p0, Lqa/s0;->q:I

    .line 46
    .line 47
    invoke-static {p1, p2, v1}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 48
    .line 49
    .line 50
    const/16 p2, 0xa

    .line 51
    .line 52
    iget-object v1, p0, Lqa/s0;->r:[B

    .line 53
    .line 54
    invoke-static {p1, p2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 55
    .line 56
    .line 57
    const/16 p2, 0xb

    .line 58
    .line 59
    iget-object v1, p0, Lqa/s0;->s:[B

    .line 60
    .line 61
    invoke-static {p1, p2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 65
    .line 66
    .line 67
    return-void
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
.end method
