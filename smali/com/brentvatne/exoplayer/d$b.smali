.class final Lcom/brentvatne/exoplayer/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/q;
.implements Lq8/l;
.implements Lcom/google/android/exoplayer2/Player$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/brentvatne/exoplayer/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic k:Lcom/brentvatne/exoplayer/d;


# direct methods
.method private constructor <init>(Lcom/brentvatne/exoplayer/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/brentvatne/exoplayer/d;Lcom/brentvatne/exoplayer/d$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/brentvatne/exoplayer/d$b;-><init>(Lcom/brentvatne/exoplayer/d;)V

    return-void
.end method


# virtual methods
.method public c(IIIF)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    .line 2
    .line 3
    invoke-static {p3}, Lcom/brentvatne/exoplayer/d;->b(Lcom/brentvatne/exoplayer/d;)Lcom/brentvatne/exoplayer/a;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    invoke-virtual {p3}, Lcom/brentvatne/exoplayer/a;->getAspectRatio()F

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 v0, 0x0

    .line 12
    cmpl-float p3, p3, v0

    .line 13
    .line 14
    if-nez p3, :cond_0

    .line 15
    .line 16
    const/4 p3, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p3, 0x0

    .line 19
    :goto_0
    iget-object v0, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/brentvatne/exoplayer/d;->b(Lcom/brentvatne/exoplayer/d;)Lcom/brentvatne/exoplayer/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    const/high16 p1, 0x3f800000    # 1.0f

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    int-to-float p1, p1

    .line 31
    mul-float/2addr p1, p4

    .line 32
    int-to-float p2, p2

    .line 33
    div-float/2addr p1, p2

    .line 34
    :goto_1
    invoke-virtual {v0, p1}, Lcom/brentvatne/exoplayer/a;->setAspectRatio(F)V

    .line 35
    .line 36
    .line 37
    if-eqz p3, :cond_2

    .line 38
    .line 39
    iget-object p1, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/brentvatne/exoplayer/d;->c(Lcom/brentvatne/exoplayer/d;)Ljava/lang/Runnable;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void
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

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    invoke-static {v0}, Lcom/brentvatne/exoplayer/d;->d(Lcom/brentvatne/exoplayer/d;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public synthetic e(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lg9/p;->a(Lg9/q;II)V

    return-void
.end method

.method public k(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq8/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    invoke-static {v0}, Lcom/brentvatne/exoplayer/d;->a(Lcom/brentvatne/exoplayer/d;)Lcom/google/android/exoplayer2/ui/SubtitleView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/ui/SubtitleView;->k(Ljava/util/List;)V

    return-void
.end method

.method public synthetic onEvents(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->a(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method

.method public synthetic onExperimentalOffloadSchedulingEnabledChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->b(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onExperimentalSleepingForOffloadChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->c(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsLoadingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->d(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public synthetic onIsPlayingChanged(Z)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->e(Lcom/google/android/exoplayer2/Player$a;Z)V

    return-void
.end method

.method public onLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public synthetic onMediaItemTransition(Lcom/google/android/exoplayer2/MediaItem;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->g(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/MediaItem;I)V

    return-void
.end method

.method public synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->h(Lcom/google/android/exoplayer2/Player$a;ZI)V

    return-void
.end method

.method public onPlaybackParametersChanged(Lcom/google/android/exoplayer2/PlaybackParameters;)V
    .locals 0

    return-void
.end method

.method public synthetic onPlaybackStateChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->j(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->k(Lcom/google/android/exoplayer2/Player$a;I)V

    return-void
.end method

.method public onPlayerError(Lcom/google/android/exoplayer2/ExoPlaybackException;)V
    .locals 0

    return-void
.end method

.method public onPlayerStateChanged(ZI)V
    .locals 0

    return-void
.end method

.method public onPositionDiscontinuity(I)V
    .locals 0

    return-void
.end method

.method public onRepeatModeChanged(I)V
    .locals 0

    return-void
.end method

.method public onSeekProcessed()V
    .locals 0

    return-void
.end method

.method public onShuffleModeEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public synthetic onStaticMetadataChanged(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Ld7/q;->r(Lcom/google/android/exoplayer2/Player$a;Ljava/util/List;)V

    return-void
.end method

.method public synthetic onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ld7/q;->s(Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Timeline;I)V

    return-void
.end method

.method public onTimelineChanged(Lcom/google/android/exoplayer2/Timeline;Ljava/lang/Object;I)V
    .locals 0

    return-void
.end method

.method public onTracksChanged(Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    iget-object p1, p0, Lcom/brentvatne/exoplayer/d$b;->k:Lcom/brentvatne/exoplayer/d;

    invoke-static {p1}, Lcom/brentvatne/exoplayer/d;->e(Lcom/brentvatne/exoplayer/d;)V

    return-void
.end method
