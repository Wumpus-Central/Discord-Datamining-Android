.class final Lco/discord/media_engine/InboundAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000fH\u00c6\u0003Jd\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\tH\u00d6\u0001J\t\u0010.\u001a\u00020/H\u00d6\u0001R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lco/discord/media_engine/InboundAudio;",
        "",
        "packetsReceived",
        "",
        "packetsLost",
        "mos",
        "",
        "mosSum",
        "mosCount",
        "",
        "mosBuckets",
        "",
        "bufferStats",
        "Lco/discord/media_engine/InboundBufferStats;",
        "frameOpStats",
        "Lco/discord/media_engine/InboundFrameOpStats;",
        "(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V",
        "getBufferStats",
        "()Lco/discord/media_engine/InboundBufferStats;",
        "getFrameOpStats",
        "()Lco/discord/media_engine/InboundFrameOpStats;",
        "getMos",
        "()D",
        "getMosBuckets",
        "()[Ljava/lang/Integer;",
        "[Ljava/lang/Integer;",
        "getMosCount",
        "()I",
        "getMosSum",
        "getPacketsLost",
        "()J",
        "getPacketsReceived",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)Lco/discord/media_engine/InboundAudio;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bufferStats:Lco/discord/media_engine/InboundBufferStats;

.field private final frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

.field private final mos:D

.field private final mosBuckets:[Ljava/lang/Integer;

.field private final mosCount:I

.field private final mosSum:D

.field private final packetsLost:J

.field private final packetsReceived:J


# direct methods
.method public constructor <init>(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V
    .locals 1

    .line 1
    const-string v0, "mosBuckets"

    .line 2
    .line 3
    invoke-static {p10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bufferStats"

    .line 7
    .line 8
    invoke-static {p11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "frameOpStats"

    .line 12
    .line 13
    invoke-static {p12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    .line 20
    .line 21
    iput-wide p3, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    .line 22
    .line 23
    iput-wide p5, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    .line 24
    .line 25
    iput-wide p7, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    .line 26
    .line 27
    iput p9, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    .line 28
    .line 29
    iput-object p10, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    .line 30
    .line 31
    iput-object p11, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    .line 32
    .line 33
    iput-object p12, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    .line 34
    .line 35
    return-void
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
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/InboundAudio;JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;ILjava/lang/Object;)Lco/discord/media_engine/InboundAudio;
    .locals 13

    move-object v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-wide v6, v0, Lco/discord/media_engine/InboundAudio;->mos:D

    goto :goto_2

    :cond_2
    move-wide/from16 v6, p5

    :goto_2
    and-int/lit8 v8, v1, 0x8

    if-eqz v8, :cond_3

    iget-wide v8, v0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    goto :goto_3

    :cond_3
    move-wide/from16 v8, p7

    :goto_3
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_4

    iget v10, v0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    goto :goto_4

    :cond_4
    move/from16 v10, p9

    :goto_4
    and-int/lit8 v11, v1, 0x20

    if-eqz v11, :cond_5

    iget-object v11, v0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v11, p10

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget-object v12, v0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    goto :goto_6

    :cond_6
    move-object/from16 v12, p11

    :goto_6
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_7

    iget-object v1, v0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    goto :goto_7

    :cond_7
    move-object/from16 v1, p12

    :goto_7
    move-wide p1, v2

    move-wide/from16 p3, v4

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v1

    invoke-virtual/range {p0 .. p12}, Lco/discord/media_engine/InboundAudio;->copy(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)Lco/discord/media_engine/InboundAudio;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    return v0
.end method

.method public final component6()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Lco/discord/media_engine/InboundBufferStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    return-object v0
.end method

.method public final component8()Lco/discord/media_engine/InboundFrameOpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    return-object v0
.end method

.method public final copy(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)Lco/discord/media_engine/InboundAudio;
    .locals 14

    const-string v0, "mosBuckets"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bufferStats"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameOpStats"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/discord/media_engine/InboundAudio;

    move-object v1, v0

    move-wide v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v1 .. v13}, Lco/discord/media_engine/InboundAudio;-><init>(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/InboundAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/InboundAudio;

    iget-wide v3, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    iget-wide v5, p1, Lco/discord/media_engine/InboundAudio;->mos:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    iget-wide v5, p1, Lco/discord/media_engine/InboundAudio;->mosSum:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    iget v3, p1, Lco/discord/media_engine/InboundAudio;->mosCount:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    iget-object v3, p1, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    iget-object v3, p1, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    iget-object p1, p1, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBufferStats()Lco/discord/media_engine/InboundBufferStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    return-object v0
.end method

.method public final getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    return-object v0
.end method

.method public final getMos()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    return-wide v0
.end method

.method public final getMosBuckets()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMosCount()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    return v0
.end method

.method public final getMosSum()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    return-wide v0
.end method

.method public final getPacketsLost()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    return-wide v0
.end method

.method public final getPacketsReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    invoke-static {v0, v1}, Lco/discord/media_engine/a;->a(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    invoke-virtual {v1}, Lco/discord/media_engine/InboundBufferStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    invoke-virtual {v1}, Lco/discord/media_engine/InboundFrameOpStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundAudio(packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->packetsReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->packetsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->mos:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mosSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundAudio;->mosSum:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", mosCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundAudio;->mosCount:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mosBuckets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->mosBuckets:[Ljava/lang/Integer;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", bufferStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->bufferStats:Lco/discord/media_engine/InboundBufferStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameOpStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundAudio;->frameOpStats:Lco/discord/media_engine/InboundFrameOpStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
