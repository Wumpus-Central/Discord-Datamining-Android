.class public final Lqa/p0;
.super Lx9/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lqa/p0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private k:J

.field private l:I

.field private m:[B

.field private n:Landroid/os/ParcelFileDescriptor;

.field private o:Ljava/lang/String;

.field private p:J

.field private q:Landroid/os/ParcelFileDescriptor;

.field private r:Landroid/net/Uri;

.field private s:J

.field private t:Z

.field private u:Lqa/m0;

.field private v:J

.field private w:Ljava/lang/String;

.field private x:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqa/q0;

    invoke-direct {v0}, Lqa/q0;-><init>()V

    sput-object v0, Lqa/p0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lx9/a;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lqa/p0;->p:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lqa/p0;->s:J

    const/4 v2, 0x0

    iput-boolean v2, p0, Lqa/p0;->t:Z

    iput-wide v0, p0, Lqa/p0;->v:J

    return-void
.end method

.method constructor <init>(JI[BLandroid/os/ParcelFileDescriptor;Ljava/lang/String;JLandroid/os/ParcelFileDescriptor;Landroid/net/Uri;JZLqa/m0;JLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    move-object v0, p0

    .line 2
    invoke-direct {p0}, Lx9/a;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lqa/p0;->k:J

    move v1, p3

    iput v1, v0, Lqa/p0;->l:I

    move-object v1, p4

    iput-object v1, v0, Lqa/p0;->m:[B

    move-object v1, p5

    iput-object v1, v0, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    move-object v1, p6

    iput-object v1, v0, Lqa/p0;->o:Ljava/lang/String;

    move-wide v1, p7

    iput-wide v1, v0, Lqa/p0;->p:J

    move-object v1, p9

    iput-object v1, v0, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    move-object v1, p10

    iput-object v1, v0, Lqa/p0;->r:Landroid/net/Uri;

    move-wide v1, p11

    iput-wide v1, v0, Lqa/p0;->s:J

    move/from16 v1, p13

    iput-boolean v1, v0, Lqa/p0;->t:Z

    move-object/from16 v1, p14

    iput-object v1, v0, Lqa/p0;->u:Lqa/m0;

    move-wide/from16 v1, p15

    iput-wide v1, v0, Lqa/p0;->v:J

    move-object/from16 v1, p17

    iput-object v1, v0, Lqa/p0;->w:Ljava/lang/String;

    move-object/from16 v1, p18

    iput-object v1, v0, Lqa/p0;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lqa/p0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast p1, Lqa/p0;

    .line 11
    .line 12
    iget-wide v3, p0, Lqa/p0;->k:J

    .line 13
    .line 14
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-wide v3, p1, Lqa/p0;->k:J

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget v1, p0, Lqa/p0;->l:I

    .line 31
    .line 32
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget v3, p1, Lqa/p0;->l:I

    .line 37
    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lqa/p0;->m:[B

    .line 49
    .line 50
    iget-object v3, p1, Lqa/p0;->m:[B

    .line 51
    .line 52
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    iget-object v1, p0, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    .line 59
    .line 60
    iget-object v3, p1, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    .line 61
    .line 62
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    iget-object v1, p0, Lqa/p0;->o:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lqa/p0;->o:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iget-wide v3, p0, Lqa/p0;->p:J

    .line 79
    .line 80
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-wide v3, p1, Lqa/p0;->p:J

    .line 85
    .line 86
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    iget-object v1, p0, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    .line 97
    .line 98
    iget-object v3, p1, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    .line 99
    .line 100
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    iget-object v1, p0, Lqa/p0;->r:Landroid/net/Uri;

    .line 107
    .line 108
    iget-object v3, p1, Lqa/p0;->r:Landroid/net/Uri;

    .line 109
    .line 110
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    iget-wide v3, p0, Lqa/p0;->s:J

    .line 117
    .line 118
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-wide v3, p1, Lqa/p0;->s:J

    .line 123
    .line 124
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_1

    .line 133
    .line 134
    iget-boolean v1, p0, Lqa/p0;->t:Z

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iget-boolean v3, p1, Lqa/p0;->t:Z

    .line 141
    .line 142
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    if-eqz v1, :cond_1

    .line 151
    .line 152
    iget-object v1, p0, Lqa/p0;->u:Lqa/m0;

    .line 153
    .line 154
    iget-object v3, p1, Lqa/p0;->u:Lqa/m0;

    .line 155
    .line 156
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_1

    .line 161
    .line 162
    iget-wide v3, p0, Lqa/p0;->v:J

    .line 163
    .line 164
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-wide v3, p1, Lqa/p0;->v:J

    .line 169
    .line 170
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_1

    .line 179
    .line 180
    iget-object v1, p0, Lqa/p0;->w:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v3, p1, Lqa/p0;->w:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v1, v3}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_1

    .line 189
    .line 190
    iget-object v1, p0, Lqa/p0;->x:Ljava/lang/String;

    .line 191
    .line 192
    iget-object p1, p1, Lqa/p0;->x:Ljava/lang/String;

    .line 193
    .line 194
    invoke-static {v1, p1}, Lw9/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_1

    .line 199
    .line 200
    return v0

    .line 201
    :cond_1
    return v2
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
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    iget-wide v1, p0, Lqa/p0;->k:J

    .line 6
    .line 7
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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
    iget v1, p0, Lqa/p0;->l:I

    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    aput-object v1, v0, v2

    .line 22
    .line 23
    iget-object v1, p0, Lqa/p0;->m:[B

    .line 24
    .line 25
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x2

    .line 34
    aput-object v1, v0, v2

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget-object v2, p0, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    .line 38
    .line 39
    aput-object v2, v0, v1

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    iget-object v2, p0, Lqa/p0;->o:Ljava/lang/String;

    .line 43
    .line 44
    aput-object v2, v0, v1

    .line 45
    .line 46
    iget-wide v1, p0, Lqa/p0;->p:J

    .line 47
    .line 48
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const/4 v2, 0x5

    .line 53
    aput-object v1, v0, v2

    .line 54
    .line 55
    const/4 v1, 0x6

    .line 56
    iget-object v2, p0, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    .line 57
    .line 58
    aput-object v2, v0, v1

    .line 59
    .line 60
    const/4 v1, 0x7

    .line 61
    iget-object v2, p0, Lqa/p0;->r:Landroid/net/Uri;

    .line 62
    .line 63
    aput-object v2, v0, v1

    .line 64
    .line 65
    iget-wide v1, p0, Lqa/p0;->s:J

    .line 66
    .line 67
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/16 v2, 0x8

    .line 72
    .line 73
    aput-object v1, v0, v2

    .line 74
    .line 75
    iget-boolean v1, p0, Lqa/p0;->t:Z

    .line 76
    .line 77
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/16 v2, 0x9

    .line 82
    .line 83
    aput-object v1, v0, v2

    .line 84
    .line 85
    const/16 v1, 0xa

    .line 86
    .line 87
    iget-object v2, p0, Lqa/p0;->u:Lqa/m0;

    .line 88
    .line 89
    aput-object v2, v0, v1

    .line 90
    .line 91
    iget-wide v1, p0, Lqa/p0;->v:J

    .line 92
    .line 93
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const/16 v2, 0xb

    .line 98
    .line 99
    aput-object v1, v0, v2

    .line 100
    .line 101
    const/16 v1, 0xc

    .line 102
    .line 103
    iget-object v2, p0, Lqa/p0;->w:Ljava/lang/String;

    .line 104
    .line 105
    aput-object v2, v0, v1

    .line 106
    .line 107
    const/16 v1, 0xd

    .line 108
    .line 109
    iget-object v2, p0, Lqa/p0;->x:Ljava/lang/String;

    .line 110
    .line 111
    aput-object v2, v0, v1

    .line 112
    .line 113
    invoke-static {v0}, Lw9/n;->c([Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    return v0
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
.end method

.method public final v()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .line 1
    invoke-static {p1}, Lx9/c;->a(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    iget-wide v2, p0, Lqa/p0;->k:J

    .line 7
    .line 8
    invoke-static {p1, v1, v2, v3}, Lx9/c;->m(Landroid/os/Parcel;IJ)V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    iget v2, p0, Lqa/p0;->l:I

    .line 13
    .line 14
    invoke-static {p1, v1, v2}, Lx9/c;->j(Landroid/os/Parcel;II)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lqa/p0;->m:[B

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-static {p1, v2, v1, v3}, Lx9/c;->f(Landroid/os/Parcel;I[BZ)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    iget-object v2, p0, Lqa/p0;->n:Landroid/os/ParcelFileDescriptor;

    .line 26
    .line 27
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    iget-object v2, p0, Lqa/p0;->o:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {p1, v1, v2, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x6

    .line 37
    iget-wide v4, p0, Lqa/p0;->p:J

    .line 38
    .line 39
    invoke-static {p1, v1, v4, v5}, Lx9/c;->m(Landroid/os/Parcel;IJ)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x7

    .line 43
    iget-object v2, p0, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    .line 44
    .line 45
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 46
    .line 47
    .line 48
    const/16 v1, 0x8

    .line 49
    .line 50
    iget-object v2, p0, Lqa/p0;->r:Landroid/net/Uri;

    .line 51
    .line 52
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 53
    .line 54
    .line 55
    const/16 v1, 0x9

    .line 56
    .line 57
    iget-wide v4, p0, Lqa/p0;->s:J

    .line 58
    .line 59
    invoke-static {p1, v1, v4, v5}, Lx9/c;->m(Landroid/os/Parcel;IJ)V

    .line 60
    .line 61
    .line 62
    const/16 v1, 0xa

    .line 63
    .line 64
    iget-boolean v2, p0, Lqa/p0;->t:Z

    .line 65
    .line 66
    invoke-static {p1, v1, v2}, Lx9/c;->c(Landroid/os/Parcel;IZ)V

    .line 67
    .line 68
    .line 69
    const/16 v1, 0xb

    .line 70
    .line 71
    iget-object v2, p0, Lqa/p0;->u:Lqa/m0;

    .line 72
    .line 73
    invoke-static {p1, v1, v2, p2, v3}, Lx9/c;->n(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 74
    .line 75
    .line 76
    const/16 p2, 0xc

    .line 77
    .line 78
    iget-wide v1, p0, Lqa/p0;->v:J

    .line 79
    .line 80
    invoke-static {p1, p2, v1, v2}, Lx9/c;->m(Landroid/os/Parcel;IJ)V

    .line 81
    .line 82
    .line 83
    const/16 p2, 0xd

    .line 84
    .line 85
    iget-object v1, p0, Lqa/p0;->w:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p1, p2, v1, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    const/16 p2, 0xe

    .line 91
    .line 92
    iget-object v1, p0, Lqa/p0;->x:Ljava/lang/String;

    .line 93
    .line 94
    invoke-static {p1, p2, v1, v3}, Lx9/c;->p(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v0}, Lx9/c;->b(Landroid/os/Parcel;I)V

    .line 98
    .line 99
    .line 100
    return-void
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

.method public final z()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lqa/p0;->q:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method
