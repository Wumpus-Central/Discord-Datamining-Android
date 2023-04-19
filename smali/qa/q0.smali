.class public final Lqa/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Lx9/b;->x(Landroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const-wide/16 v6, -0x1

    .line 12
    .line 13
    move-wide v9, v2

    .line 14
    move-wide/from16 v19, v9

    .line 15
    .line 16
    move-wide/from16 v23, v19

    .line 17
    .line 18
    move v11, v4

    .line 19
    move/from16 v21, v11

    .line 20
    .line 21
    move-object v12, v5

    .line 22
    move-object v13, v12

    .line 23
    move-object v14, v13

    .line 24
    move-object/from16 v17, v14

    .line 25
    .line 26
    move-object/from16 v18, v17

    .line 27
    .line 28
    move-object/from16 v22, v18

    .line 29
    .line 30
    move-object/from16 v25, v22

    .line 31
    .line 32
    move-object/from16 v26, v25

    .line 33
    .line 34
    move-wide v15, v6

    .line 35
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-ge v2, v1, :cond_0

    .line 40
    .line 41
    invoke-static/range {p1 .. p1}, Lx9/b;->p(Landroid/os/Parcel;)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-static {v2}, Lx9/b;->k(I)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    packed-switch v3, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v2}, Lx9/b;->w(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_0
    invoke-static {v0, v2}, Lx9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object/from16 v26, v2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_1
    invoke-static {v0, v2}, Lx9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    move-object/from16 v25, v2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_2
    invoke-static {v0, v2}, Lx9/b;->t(Landroid/os/Parcel;I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v2

    .line 74
    move-wide/from16 v23, v2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_3
    sget-object v3, Lqa/m0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 78
    .line 79
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lqa/m0;

    .line 84
    .line 85
    move-object/from16 v22, v2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_4
    invoke-static {v0, v2}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    move/from16 v21, v2

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_5
    invoke-static {v0, v2}, Lx9/b;->t(Landroid/os/Parcel;I)J

    .line 96
    .line 97
    .line 98
    move-result-wide v2

    .line 99
    move-wide/from16 v19, v2

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :pswitch_6
    sget-object v3, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 103
    .line 104
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Landroid/net/Uri;

    .line 109
    .line 110
    move-object/from16 v18, v2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_7
    sget-object v3, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 114
    .line 115
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, Landroid/os/ParcelFileDescriptor;

    .line 120
    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_8
    invoke-static {v0, v2}, Lx9/b;->t(Landroid/os/Parcel;I)J

    .line 125
    .line 126
    .line 127
    move-result-wide v2

    .line 128
    move-wide v15, v2

    .line 129
    goto :goto_0

    .line 130
    :pswitch_9
    invoke-static {v0, v2}, Lx9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v14, v2

    .line 135
    goto :goto_0

    .line 136
    :pswitch_a
    sget-object v3, Landroid/os/ParcelFileDescriptor;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 137
    .line 138
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, Landroid/os/ParcelFileDescriptor;

    .line 143
    .line 144
    move-object v13, v2

    .line 145
    goto :goto_0

    .line 146
    :pswitch_b
    invoke-static {v0, v2}, Lx9/b;->b(Landroid/os/Parcel;I)[B

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    move-object v12, v2

    .line 151
    goto :goto_0

    .line 152
    :pswitch_c
    invoke-static {v0, v2}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    move v11, v2

    .line 157
    goto :goto_0

    .line 158
    :pswitch_d
    invoke-static {v0, v2}, Lx9/b;->t(Landroid/os/Parcel;I)J

    .line 159
    .line 160
    .line 161
    move-result-wide v2

    .line 162
    move-wide v9, v2

    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_0
    invoke-static {v0, v1}, Lx9/b;->j(Landroid/os/Parcel;I)V

    .line 166
    .line 167
    .line 168
    new-instance v0, Lqa/p0;

    .line 169
    .line 170
    move-object v8, v0

    .line 171
    invoke-direct/range {v8 .. v26}, Lqa/p0;-><init>(JI[BLandroid/os/ParcelFileDescriptor;Ljava/lang/String;JLandroid/os/ParcelFileDescriptor;Landroid/net/Uri;JZLqa/m0;JLjava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    new-array p1, p1, [Lqa/p0;

    return-object p1
.end method
