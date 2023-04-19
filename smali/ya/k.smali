.class public final Lya/k;
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
    .locals 22

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
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move v5, v2

    .line 10
    move v11, v5

    .line 11
    move v15, v11

    .line 12
    move/from16 v17, v15

    .line 13
    .line 14
    move/from16 v19, v17

    .line 15
    .line 16
    move/from16 v20, v19

    .line 17
    .line 18
    move/from16 v21, v20

    .line 19
    .line 20
    move-object v6, v3

    .line 21
    move-object v7, v6

    .line 22
    move-object v8, v7

    .line 23
    move-object v9, v8

    .line 24
    move-object v10, v9

    .line 25
    move-object v12, v10

    .line 26
    move-object v13, v12

    .line 27
    move-object v14, v13

    .line 28
    move-object/from16 v16, v14

    .line 29
    .line 30
    move-object/from16 v18, v16

    .line 31
    .line 32
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->dataPosition()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-ge v2, v1, :cond_0

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, Lx9/b;->p(Landroid/os/Parcel;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {v2}, Lx9/b;->k(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    packed-switch v3, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lx9/b;->w(Landroid/os/Parcel;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :pswitch_0
    invoke-static {v0, v2}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    move/from16 v21, v2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :pswitch_1
    invoke-static {v0, v2}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    move/from16 v20, v2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :pswitch_2
    invoke-static {v0, v2}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    move/from16 v19, v2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :pswitch_3
    sget-object v3, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 75
    .line 76
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Lcom/google/android/gms/nearby/messages/internal/ClientAppContext;

    .line 81
    .line 82
    move-object/from16 v18, v2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :pswitch_4
    invoke-static {v0, v2}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    move/from16 v17, v2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :pswitch_5
    invoke-static {v0, v2}, Lx9/b;->q(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object/from16 v16, v2

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_6
    invoke-static {v0, v2}, Lx9/b;->l(Landroid/os/Parcel;I)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    move v15, v2

    .line 104
    goto :goto_0

    .line 105
    :pswitch_7
    invoke-static {v0, v2}, Lx9/b;->b(Landroid/os/Parcel;I)[B

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v14, v2

    .line 110
    goto :goto_0

    .line 111
    :pswitch_8
    invoke-static {v0, v2}, Lx9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v13, v2

    .line 116
    goto :goto_0

    .line 117
    :pswitch_9
    invoke-static {v0, v2}, Lx9/b;->e(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v12, v2

    .line 122
    goto :goto_0

    .line 123
    :pswitch_a
    invoke-static {v0, v2}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    move v11, v2

    .line 128
    goto :goto_0

    .line 129
    :pswitch_b
    sget-object v3, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 130
    .line 131
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Landroid/app/PendingIntent;

    .line 136
    .line 137
    move-object v10, v2

    .line 138
    goto :goto_0

    .line 139
    :pswitch_c
    sget-object v3, Lxa/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 140
    .line 141
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    check-cast v2, Lxa/a;

    .line 146
    .line 147
    move-object v9, v2

    .line 148
    goto :goto_0

    .line 149
    :pswitch_d
    invoke-static {v0, v2}, Lx9/b;->q(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    move-object v8, v2

    .line 154
    goto :goto_0

    .line 155
    :pswitch_e
    sget-object v3, Lxa/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 156
    .line 157
    invoke-static {v0, v2, v3}, Lx9/b;->d(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Lxa/i;

    .line 162
    .line 163
    move-object v7, v2

    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :pswitch_f
    invoke-static {v0, v2}, Lx9/b;->q(Landroid/os/Parcel;I)Landroid/os/IBinder;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-object v6, v2

    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :pswitch_10
    invoke-static {v0, v2}, Lx9/b;->r(Landroid/os/Parcel;I)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    move v5, v2

    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_0
    invoke-static {v0, v1}, Lx9/b;->j(Landroid/os/Parcel;I)V

    .line 181
    .line 182
    .line 183
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;

    .line 184
    .line 185
    move-object v4, v0

    .line 186
    invoke-direct/range {v4 .. v21}, Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;-><init>(ILandroid/os/IBinder;Lxa/i;Landroid/os/IBinder;Lxa/a;Landroid/app/PendingIntent;ILjava/lang/String;Ljava/lang/String;[BZLandroid/os/IBinder;ZLcom/google/android/gms/nearby/messages/internal/ClientAppContext;ZII)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

    new-array p1, p1, [Lcom/google/android/gms/nearby/messages/internal/SubscribeRequest;

    return-object p1
.end method
