.class public Lpe/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "d"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILne/c;Lhe/a;Loe/i;Lhe/b;Lne/d;Landroid/media/MediaFormat;)Lpe/c;
    .locals 11

    .line 1
    move v2, p1

    .line 2
    move v4, p2

    .line 3
    move-object v1, p3

    .line 4
    move-object/from16 v8, p6

    .line 5
    .line 6
    move-object/from16 v3, p7

    .line 7
    .line 8
    move-object/from16 v5, p8

    .line 9
    .line 10
    if-nez v5, :cond_0

    .line 11
    .line 12
    new-instance v0, Lpe/b;

    .line 13
    .line 14
    invoke-direct {v0, p3, p1, v3, p2}, Lpe/b;-><init>(Lne/c;ILne/d;I)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v0, "mime"

    .line 19
    .line 20
    invoke-virtual {v5, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v0, :cond_9

    .line 26
    .line 27
    const-string v7, "video"

    .line 28
    .line 29
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    const-string v10, "audio"

    .line 34
    .line 35
    if-nez v9, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    :cond_1
    if-eqz p4, :cond_8

    .line 44
    .line 45
    if-eqz v8, :cond_7

    .line 46
    .line 47
    :cond_2
    invoke-virtual {v0, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_4

    .line 52
    .line 53
    if-eqz p5, :cond_3

    .line 54
    .line 55
    new-instance v9, Lpe/e;

    .line 56
    .line 57
    move-object v0, v9

    .line 58
    move-object v1, p3

    .line 59
    move v2, p1

    .line 60
    move-object/from16 v3, p7

    .line 61
    .line 62
    move v4, p2

    .line 63
    move-object/from16 v5, p8

    .line 64
    .line 65
    move-object/from16 v6, p5

    .line 66
    .line 67
    move-object v7, p4

    .line 68
    move-object/from16 v8, p6

    .line 69
    .line 70
    invoke-direct/range {v0 .. v8}, Lpe/e;-><init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V

    .line 71
    .line 72
    .line 73
    return-object v9

    .line 74
    :cond_3
    new-instance v0, Lie/e;

    .line 75
    .line 76
    sget-object v1, Lie/e$a;->y:Lie/e$a;

    .line 77
    .line 78
    invoke-direct {v0, v1, v5, v6, v6}, Lie/e;-><init>(Lie/e$a;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodecList;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_4
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-eqz v6, :cond_6

    .line 87
    .line 88
    if-nez p5, :cond_5

    .line 89
    .line 90
    new-instance v0, Loe/c;

    .line 91
    .line 92
    invoke-direct {v0, v8}, Loe/c;-><init>(Lhe/b;)V

    .line 93
    .line 94
    .line 95
    move-object v6, v0

    .line 96
    goto :goto_0

    .line 97
    :cond_5
    move-object/from16 v6, p5

    .line 98
    .line 99
    :goto_0
    new-instance v9, Lpe/a;

    .line 100
    .line 101
    move-object v0, v9

    .line 102
    move-object v1, p3

    .line 103
    move v2, p1

    .line 104
    move-object/from16 v3, p7

    .line 105
    .line 106
    move v4, p2

    .line 107
    move-object/from16 v5, p8

    .line 108
    .line 109
    move-object v7, p4

    .line 110
    move-object/from16 v8, p6

    .line 111
    .line 112
    invoke-direct/range {v0 .. v8}, Lpe/a;-><init>(Lne/c;ILne/d;ILandroid/media/MediaFormat;Loe/i;Lhe/a;Lhe/b;)V

    .line 113
    .line 114
    .line 115
    return-object v9

    .line 116
    :cond_6
    sget-object v5, Lpe/d;->a:Ljava/lang/String;

    .line 117
    .line 118
    new-instance v6, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 121
    .line 122
    .line 123
    const-string v7, "Unsupported track mime type: "

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v0, ", will use passthrough transcoder"

    .line 132
    .line 133
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v5, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    new-instance v0, Lpe/b;

    .line 144
    .line 145
    invoke-direct {v0, p3, p1, v3, p2}, Lpe/b;-><init>(Lne/c;ILne/d;I)V

    .line 146
    .line 147
    .line 148
    return-object v0

    .line 149
    :cond_7
    new-instance v0, Lie/e;

    .line 150
    .line 151
    sget-object v1, Lie/e$a;->x:Lie/e$a;

    .line 152
    .line 153
    invoke-direct {v0, v1, v5, v6, v6}, Lie/e;-><init>(Lie/e$a;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodecList;)V

    .line 154
    .line 155
    .line 156
    throw v0

    .line 157
    :cond_8
    new-instance v0, Lie/e;

    .line 158
    .line 159
    sget-object v1, Lie/e$a;->w:Lie/e$a;

    .line 160
    .line 161
    invoke-direct {v0, v1, v5, v6, v6}, Lie/e;-><init>(Lie/e$a;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodecList;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_9
    new-instance v0, Lie/e;

    .line 166
    .line 167
    sget-object v1, Lie/e$a;->s:Lie/e$a;

    .line 168
    .line 169
    invoke-direct {v0, v1, v5, v6, v6}, Lie/e;-><init>(Lie/e$a;Landroid/media/MediaFormat;Landroid/media/MediaCodec;Landroid/media/MediaCodecList;)V

    .line 170
    .line 171
    .line 172
    throw v0
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
.end method
