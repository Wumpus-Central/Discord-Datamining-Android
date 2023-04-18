.class public final Lco/discord/media_engine/internal/NativeStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B3\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJD\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001b\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\""
    }
    d2 = {
        "Lco/discord/media_engine/internal/NativeStats;",
        "",
        "transport",
        "Lco/discord/media_engine/internal/Transport;",
        "outbound",
        "Lco/discord/media_engine/internal/Outbound;",
        "screenshare",
        "Lco/discord/media_engine/internal/Screenshare;",
        "inbound",
        "",
        "Lco/discord/media_engine/internal/Inbound;",
        "(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)V",
        "getInbound",
        "()[Lco/discord/media_engine/internal/Inbound;",
        "[Lco/discord/media_engine/internal/Inbound;",
        "getOutbound",
        "()Lco/discord/media_engine/internal/Outbound;",
        "getScreenshare",
        "()Lco/discord/media_engine/internal/Screenshare;",
        "getTransport",
        "()Lco/discord/media_engine/internal/Transport;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)Lco/discord/media_engine/internal/NativeStats;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final inbound:[Lco/discord/media_engine/internal/Inbound;

.field private final outbound:Lco/discord/media_engine/internal/Outbound;

.field private final screenshare:Lco/discord/media_engine/internal/Screenshare;

.field private final transport:Lco/discord/media_engine/internal/Transport;


# direct methods
.method public constructor <init>(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    .line 5
    .line 6
    iput-object p2, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    .line 7
    .line 8
    iput-object p3, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    .line 9
    .line 10
    iput-object p4, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

.method public static synthetic copy$default(Lco/discord/media_engine/internal/NativeStats;Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;ILjava/lang/Object;)Lco/discord/media_engine/internal/NativeStats;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/discord/media_engine/internal/NativeStats;->copy(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)Lco/discord/media_engine/internal/NativeStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/discord/media_engine/internal/Transport;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    return-object v0
.end method

.method public final component2()Lco/discord/media_engine/internal/Outbound;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    return-object v0
.end method

.method public final component3()Lco/discord/media_engine/internal/Screenshare;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    return-object v0
.end method

.method public final component4()[Lco/discord/media_engine/internal/Inbound;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    return-object v0
.end method

.method public final copy(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)Lco/discord/media_engine/internal/NativeStats;
    .locals 1

    new-instance v0, Lco/discord/media_engine/internal/NativeStats;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/discord/media_engine/internal/NativeStats;-><init>(Lco/discord/media_engine/internal/Transport;Lco/discord/media_engine/internal/Outbound;Lco/discord/media_engine/internal/Screenshare;[Lco/discord/media_engine/internal/Inbound;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/NativeStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/NativeStats;

    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    iget-object v3, p1, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    iget-object v3, p1, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    iget-object v3, p1, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    iget-object p1, p1, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getInbound()[Lco/discord/media_engine/internal/Inbound;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    return-object v0
.end method

.method public final getOutbound()Lco/discord/media_engine/internal/Outbound;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    return-object v0
.end method

.method public final getScreenshare()Lco/discord/media_engine/internal/Screenshare;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    return-object v0
.end method

.method public final getTransport()Lco/discord/media_engine/internal/Transport;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/discord/media_engine/internal/Outbound;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/discord/media_engine/internal/Screenshare;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v2}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NativeStats(transport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->transport:Lco/discord/media_engine/internal/Transport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", outbound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->outbound:Lco/discord/media_engine/internal/Outbound;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", screenshare="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->screenshare:Lco/discord/media_engine/internal/Screenshare;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inbound="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/NativeStats;->inbound:[Lco/discord/media_engine/internal/Inbound;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
