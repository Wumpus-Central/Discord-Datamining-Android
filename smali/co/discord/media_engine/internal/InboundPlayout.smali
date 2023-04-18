.class public final Lco/discord/media_engine/internal/InboundPlayout;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003Jm\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u000fR\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u000f\u00a8\u0006+"
    }
    d2 = {
        "Lco/discord/media_engine/internal/InboundPlayout;",
        "",
        "audioJitterBuffer",
        "Lco/discord/media_engine/PlayoutMetric;",
        "audioJitterDelay",
        "audioJitterTarget",
        "audioPlayoutUnderruns",
        "audioCaptureOverruns",
        "videoJitterBuffer",
        "videoJitterDelay",
        "videoJitterTarget",
        "relativeReceptionDelay",
        "relativePlayoutDelay",
        "(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V",
        "getAudioCaptureOverruns",
        "()Lco/discord/media_engine/PlayoutMetric;",
        "getAudioJitterBuffer",
        "getAudioJitterDelay",
        "getAudioJitterTarget",
        "getAudioPlayoutUnderruns",
        "getRelativePlayoutDelay",
        "getRelativeReceptionDelay",
        "getVideoJitterBuffer",
        "getVideoJitterDelay",
        "getVideoJitterTarget",
        "component1",
        "component10",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
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
.field private final audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

.field private final audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

.field private final audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

.field private final audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

.field private final relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

.field private final videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;


# direct methods
.method public constructor <init>(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V
    .locals 1

    .line 1
    const-string v0, "audioJitterBuffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "audioJitterDelay"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "audioJitterTarget"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "audioPlayoutUnderruns"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "audioCaptureOverruns"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "videoJitterBuffer"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "videoJitterDelay"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "videoJitterTarget"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "relativeReceptionDelay"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "relativePlayoutDelay"

    .line 47
    .line 48
    invoke-static {p10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    .line 55
    .line 56
    iput-object p2, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    .line 57
    .line 58
    iput-object p3, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    .line 59
    .line 60
    iput-object p4, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    .line 61
    .line 62
    iput-object p5, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    .line 63
    .line 64
    iput-object p6, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    .line 65
    .line 66
    iput-object p7, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    .line 67
    .line 68
    iput-object p8, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    .line 69
    .line 70
    iput-object p9, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    .line 71
    .line 72
    iput-object p10, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    .line 73
    .line 74
    return-void
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
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/InboundPlayout;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;ILjava/lang/Object;)Lco/discord/media_engine/internal/InboundPlayout;
    .locals 11

    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v1, v1, 0x200

    if-eqz v1, :cond_9

    iget-object v1, v0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_9

    :cond_9
    move-object/from16 v1, p10

    :goto_9
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move-object p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, Lco/discord/media_engine/internal/InboundPlayout;->copy(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/internal/InboundPlayout;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component10()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component2()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component3()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component4()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component5()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component6()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component7()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component8()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component9()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final copy(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/internal/InboundPlayout;
    .locals 12

    const-string v0, "audioJitterBuffer"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioJitterDelay"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioJitterTarget"

    move-object v4, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioPlayoutUnderruns"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioCaptureOverruns"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoJitterBuffer"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoJitterDelay"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoJitterTarget"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relativeReceptionDelay"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "relativePlayoutDelay"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/discord/media_engine/internal/InboundPlayout;

    move-object v1, v0

    invoke-direct/range {v1 .. v11}, Lco/discord/media_engine/internal/InboundPlayout;-><init>(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/InboundPlayout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/InboundPlayout;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object p1, p1, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getAudioCaptureOverruns()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioPlayoutUnderruns()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getVideoJitterBuffer()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getVideoJitterDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getVideoJitterTarget()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundPlayout(audioJitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioJitterDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioJitterTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioPlayoutUnderruns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioCaptureOverruns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->audioCaptureOverruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoJitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoJitterDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", videoJitterTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->videoJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", relativeReceptionDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", relativePlayoutDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundPlayout;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
