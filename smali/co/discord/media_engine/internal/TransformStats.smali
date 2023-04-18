.class public final Lco/discord/media_engine/internal/TransformStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/discord/media_engine/internal/TransformStats;",
        "",
        "()V",
        "gson",
        "Lcom/google/gson/Gson;",
        "convertPlayoutMetricToMs",
        "Lco/discord/media_engine/PlayoutMetric;",
        "metric",
        "sumBytes",
        "",
        "rtpStats",
        "Lco/discord/media_engine/internal/RtpStats;",
        "sumPackets",
        "transform",
        "Lco/discord/media_engine/Stats;",
        "stats",
        "",
        "transformPlayoutStats",
        "Lco/discord/media_engine/internal/InboundPlayout;",
        "playout",
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


# static fields
.field public static final INSTANCE:Lco/discord/media_engine/internal/TransformStats;

.field private static final gson:Lcom/google/gson/Gson;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lco/discord/media_engine/internal/TransformStats;

    .line 2
    .line 3
    invoke-direct {v0}, Lco/discord/media_engine/internal/TransformStats;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lco/discord/media_engine/internal/TransformStats;->INSTANCE:Lco/discord/media_engine/internal/TransformStats;

    .line 7
    .line 8
    new-instance v0, Lcom/google/gson/Gson;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lco/discord/media_engine/internal/TransformStats;->gson:Lcom/google/gson/Gson;

    .line 14
    .line 15
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;
    .locals 18

    .line 1
    new-instance v13, Lco/discord/media_engine/PlayoutMetric;

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getLast()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const/16 v2, 0x3e8

    .line 8
    .line 9
    int-to-double v2, v2

    .line 10
    mul-double/2addr v0, v2

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getMean()D

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    mul-double/2addr v0, v2

    .line 20
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getP75()D

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    mul-double/2addr v0, v2

    .line 29
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getP95()D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    mul-double/2addr v0, v2

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v10

    .line 42
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getP99()D

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    mul-double/2addr v0, v2

    .line 47
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v14

    .line 51
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/PlayoutMetric;->getMax()D

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    mul-double/2addr v0, v2

    .line 56
    invoke-static {v0, v1}, Ljava/lang/Math;->rint(D)D

    .line 57
    .line 58
    .line 59
    move-result-wide v16

    .line 60
    move-object v0, v13

    .line 61
    move-wide v1, v4

    .line 62
    move-wide v3, v6

    .line 63
    move-wide v5, v8

    .line 64
    move-wide v7, v10

    .line 65
    move-wide v9, v14

    .line 66
    move-wide/from16 v11, v16

    .line 67
    .line 68
    invoke-direct/range {v0 .. v12}, Lco/discord/media_engine/PlayoutMetric;-><init>(DDDDDD)V

    .line 69
    .line 70
    .line 71
    return-object v13
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
.end method

.method private final sumBytes(Lco/discord/media_engine/internal/RtpStats;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getFec()Lco/discord/media_engine/internal/PacketStats;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lco/discord/media_engine/internal/PacketStats;->getHeaderBytes()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getFec()Lco/discord/media_engine/internal/PacketStats;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPayloadBytes()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    add-long/2addr v0, v2

    .line 18
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getFec()Lco/discord/media_engine/internal/PacketStats;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPaddingBytes()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    add-long/2addr v0, v2

    .line 27
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getRetransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getHeaderBytes()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    add-long/2addr v0, v2

    .line 36
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getRetransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPayloadBytes()J

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    add-long/2addr v0, v2

    .line 45
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getRetransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPaddingBytes()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    add-long/2addr v0, v2

    .line 54
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getTransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getHeaderBytes()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    add-long/2addr v0, v2

    .line 63
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getTransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPayloadBytes()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    add-long/2addr v0, v2

    .line 72
    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getTransmitted()Lco/discord/media_engine/internal/PacketStats;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lco/discord/media_engine/internal/PacketStats;->getPaddingBytes()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    add-long/2addr v0, v2

    .line 81
    return-wide v0
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
.end method

.method private final sumPackets(Lco/discord/media_engine/internal/RtpStats;)J
    .locals 4

    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getFec()Lco/discord/media_engine/internal/PacketStats;

    move-result-object v0

    invoke-virtual {v0}, Lco/discord/media_engine/internal/PacketStats;->getPackets()J

    move-result-wide v0

    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getRetransmitted()Lco/discord/media_engine/internal/PacketStats;

    move-result-object v2

    invoke-virtual {v2}, Lco/discord/media_engine/internal/PacketStats;->getPackets()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-virtual {p1}, Lco/discord/media_engine/internal/RtpStats;->getTransmitted()Lco/discord/media_engine/internal/PacketStats;

    move-result-object p1

    invoke-virtual {p1}, Lco/discord/media_engine/internal/PacketStats;->getPackets()J

    move-result-wide v2

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public static final transform(Ljava/lang/String;)Lco/discord/media_engine/Stats;
    .locals 87

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "stats"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lco/discord/media_engine/internal/TransformStats;->gson:Lcom/google/gson/Gson;

    .line 9
    .line 10
    const-class v2, Lco/discord/media_engine/internal/NativeStats;

    .line 11
    .line 12
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lco/discord/media_engine/internal/NativeStats;

    .line 17
    .line 18
    invoke-virtual {v0}, Lco/discord/media_engine/internal/NativeStats;->getOutbound()Lco/discord/media_engine/internal/Outbound;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/high16 v2, 0x47000000    # 32768.0f

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const-wide/16 v6, 0x0

    .line 26
    .line 27
    if-eqz v1, :cond_5

    .line 28
    .line 29
    invoke-virtual {v1}, Lco/discord/media_engine/internal/Outbound;->getAudio()Lco/discord/media_engine/internal/OutboundAudio;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getBytesSent()J

    .line 36
    .line 37
    .line 38
    move-result-wide v8

    .line 39
    add-long/2addr v8, v6

    .line 40
    new-instance v33, Lco/discord/media_engine/OutboundRtpAudio;

    .line 41
    .line 42
    const-string v11, "audio"

    .line 43
    .line 44
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getSsrc()J

    .line 45
    .line 46
    .line 47
    move-result-wide v12

    .line 48
    new-instance v14, Lco/discord/media_engine/StatsCodec;

    .line 49
    .line 50
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getCodecPayloadType()I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getCodecName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    invoke-direct {v14, v10, v15}, Lco/discord/media_engine/StatsCodec;-><init>(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getPacketsSent()J

    .line 62
    .line 63
    .line 64
    move-result-wide v17

    .line 65
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getPacketsLost()I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    invoke-static {v4, v10}, Ljava/lang/Math;->max(II)I

    .line 70
    .line 71
    .line 72
    move-result v19

    .line 73
    const/16 v10, 0x64

    .line 74
    .line 75
    int-to-float v10, v10

    .line 76
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getFractionLost()F

    .line 77
    .line 78
    .line 79
    move-result v15

    .line 80
    mul-float v20, v10, v15

    .line 81
    .line 82
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getAudioLevel()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    int-to-float v10, v10

    .line 87
    div-float v21, v10, v2

    .line 88
    .line 89
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getSpeaking()J

    .line 90
    .line 91
    .line 92
    move-result-wide v15

    .line 93
    cmp-long v10, v15, v6

    .line 94
    .line 95
    if-lez v10, :cond_0

    .line 96
    .line 97
    const/16 v22, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    move/from16 v22, v4

    .line 101
    .line 102
    :goto_0
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getFramesCaptured()J

    .line 103
    .line 104
    .line 105
    move-result-wide v23

    .line 106
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getFramesRendered()J

    .line 107
    .line 108
    .line 109
    move-result-wide v25

    .line 110
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getNoiseCancellerIsEnabled()Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    if-eqz v10, :cond_1

    .line 115
    .line 116
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    move/from16 v27, v10

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    move/from16 v27, v4

    .line 124
    .line 125
    :goto_1
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getNoiseCancellerProcessTime()Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    if-eqz v10, :cond_2

    .line 130
    .line 131
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v15

    .line 135
    move-wide/from16 v28, v15

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    move-wide/from16 v28, v6

    .line 139
    .line 140
    :goto_2
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getVoiceActivityDetectorIsEnabled()Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    if-eqz v10, :cond_3

    .line 145
    .line 146
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    move/from16 v30, v10

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_3
    move/from16 v30, v4

    .line 154
    .line 155
    :goto_3
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundAudio;->getVoiceActivityDetectorProcessTime()Ljava/lang/Long;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-eqz v1, :cond_4

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v15

    .line 165
    move-wide/from16 v31, v15

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_4
    move-wide/from16 v31, v6

    .line 169
    .line 170
    :goto_4
    move-object/from16 v10, v33

    .line 171
    .line 172
    move-wide v15, v8

    .line 173
    invoke-direct/range {v10 .. v32}, Lco/discord/media_engine/OutboundRtpAudio;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v12, v33

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_5
    move-wide v8, v6

    .line 180
    const/4 v12, 0x0

    .line 181
    :goto_5
    invoke-virtual {v0}, Lco/discord/media_engine/internal/NativeStats;->getOutbound()Lco/discord/media_engine/internal/Outbound;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-eqz v1, :cond_6

    .line 186
    .line 187
    invoke-virtual {v1}, Lco/discord/media_engine/internal/Outbound;->getVideos()[Lco/discord/media_engine/internal/OutboundVideo;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-eqz v1, :cond_6

    .line 192
    .line 193
    invoke-static {v1}, Lkotlin/collections/b;->E([Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    check-cast v1, Lco/discord/media_engine/internal/OutboundVideo;

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_6
    const/4 v1, 0x0

    .line 201
    :goto_6
    if-eqz v1, :cond_9

    .line 202
    .line 203
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getSubstreams()[Lco/discord/media_engine/internal/Substream;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    if-eqz v10, :cond_9

    .line 208
    .line 209
    array-length v11, v10

    .line 210
    move v13, v4

    .line 211
    :goto_7
    if-ge v13, v11, :cond_9

    .line 212
    .line 213
    aget-object v14, v10, v13

    .line 214
    .line 215
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->isFlexFEC()Z

    .line 216
    .line 217
    .line 218
    move-result v15

    .line 219
    if-nez v15, :cond_7

    .line 220
    .line 221
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->isRTX()Z

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    if-nez v15, :cond_7

    .line 226
    .line 227
    const/4 v15, 0x1

    .line 228
    goto :goto_8

    .line 229
    :cond_7
    move v15, v4

    .line 230
    :goto_8
    if-eqz v15, :cond_8

    .line 231
    .line 232
    goto :goto_9

    .line 233
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_9
    const/4 v14, 0x0

    .line 237
    :goto_9
    if-eqz v14, :cond_c

    .line 238
    .line 239
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getSubstreams()[Lco/discord/media_engine/internal/Substream;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    array-length v11, v10

    .line 244
    move v13, v4

    .line 245
    move-wide/from16 v20, v6

    .line 246
    .line 247
    :goto_a
    if-ge v13, v11, :cond_a

    .line 248
    .line 249
    aget-object v15, v10, v13

    .line 250
    .line 251
    sget-object v3, Lco/discord/media_engine/internal/TransformStats;->INSTANCE:Lco/discord/media_engine/internal/TransformStats;

    .line 252
    .line 253
    invoke-virtual {v15}, Lco/discord/media_engine/internal/Substream;->getRtpStats()Lco/discord/media_engine/internal/RtpStats;

    .line 254
    .line 255
    .line 256
    move-result-object v15

    .line 257
    invoke-direct {v3, v15}, Lco/discord/media_engine/internal/TransformStats;->sumBytes(Lco/discord/media_engine/internal/RtpStats;)J

    .line 258
    .line 259
    .line 260
    move-result-wide v15

    .line 261
    add-long v20, v20, v15

    .line 262
    .line 263
    add-int/lit8 v13, v13, 0x1

    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_a
    add-long v8, v8, v20

    .line 267
    .line 268
    const-string v16, "video"

    .line 269
    .line 270
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getSsrc()J

    .line 271
    .line 272
    .line 273
    move-result-wide v17

    .line 274
    new-instance v3, Lco/discord/media_engine/StatsCodec;

    .line 275
    .line 276
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getCodecPayloadType()I

    .line 277
    .line 278
    .line 279
    move-result v10

    .line 280
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getCodecName()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    invoke-direct {v3, v10, v11}, Lco/discord/media_engine/StatsCodec;-><init>(ILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getSubstreams()[Lco/discord/media_engine/internal/Substream;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    array-length v11, v10

    .line 292
    move v13, v4

    .line 293
    move-wide/from16 v22, v6

    .line 294
    .line 295
    :goto_b
    if-ge v13, v11, :cond_b

    .line 296
    .line 297
    aget-object v15, v10, v13

    .line 298
    .line 299
    sget-object v5, Lco/discord/media_engine/internal/TransformStats;->INSTANCE:Lco/discord/media_engine/internal/TransformStats;

    .line 300
    .line 301
    invoke-virtual {v15}, Lco/discord/media_engine/internal/Substream;->getRtpStats()Lco/discord/media_engine/internal/RtpStats;

    .line 302
    .line 303
    .line 304
    move-result-object v15

    .line 305
    invoke-direct {v5, v15}, Lco/discord/media_engine/internal/TransformStats;->sumPackets(Lco/discord/media_engine/internal/RtpStats;)J

    .line 306
    .line 307
    .line 308
    move-result-wide v24

    .line 309
    add-long v22, v22, v24

    .line 310
    .line 311
    add-int/lit8 v13, v13, 0x1

    .line 312
    .line 313
    goto :goto_b

    .line 314
    :cond_b
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v5}, Lco/discord/media_engine/internal/RtcpStats;->getPacketsLost()I

    .line 319
    .line 320
    .line 321
    move-result v24

    .line 322
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v5}, Lco/discord/media_engine/internal/RtcpStats;->getFractionLost()I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    int-to-float v5, v5

    .line 331
    move/from16 v25, v5

    .line 332
    .line 333
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getMediaBitrate()I

    .line 334
    .line 335
    .line 336
    move-result v26

    .line 337
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getTargetMediaBitrate()I

    .line 338
    .line 339
    .line 340
    move-result v27

    .line 341
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getEncodeUsage()I

    .line 342
    .line 343
    .line 344
    move-result v28

    .line 345
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getEncoderImplementationName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v29

    .line 349
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getAvgEncodeTime()I

    .line 350
    .line 351
    .line 352
    move-result v30

    .line 353
    new-instance v5, Lco/discord/media_engine/Resolution;

    .line 354
    .line 355
    move-object/from16 v31, v5

    .line 356
    .line 357
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getWidth()I

    .line 358
    .line 359
    .line 360
    move-result v10

    .line 361
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getHeight()I

    .line 362
    .line 363
    .line 364
    move-result v11

    .line 365
    invoke-direct {v5, v10, v11}, Lco/discord/media_engine/Resolution;-><init>(II)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;

    .line 369
    .line 370
    .line 371
    move-result-object v5

    .line 372
    invoke-virtual {v5}, Lco/discord/media_engine/internal/FrameCounts;->getDeltaFrames()I

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;

    .line 377
    .line 378
    .line 379
    move-result-object v10

    .line 380
    invoke-virtual {v10}, Lco/discord/media_engine/internal/FrameCounts;->getKeyFrames()I

    .line 381
    .line 382
    .line 383
    move-result v10

    .line 384
    add-int/2addr v5, v10

    .line 385
    int-to-long v10, v5

    .line 386
    move-wide/from16 v32, v10

    .line 387
    .line 388
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getFramesEncoded()J

    .line 389
    .line 390
    .line 391
    move-result-wide v34

    .line 392
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getInputFrameRate()I

    .line 393
    .line 394
    .line 395
    move-result v36

    .line 396
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getEncodeFrameRate()I

    .line 397
    .line 398
    .line 399
    move-result v37

    .line 400
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    invoke-virtual {v5}, Lco/discord/media_engine/internal/RtcpStats;->getFirPackets()J

    .line 405
    .line 406
    .line 407
    move-result-wide v38

    .line 408
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    invoke-virtual {v5}, Lco/discord/media_engine/internal/RtcpStats;->getNackPackets()J

    .line 413
    .line 414
    .line 415
    move-result-wide v40

    .line 416
    invoke-virtual {v14}, Lco/discord/media_engine/internal/Substream;->getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;

    .line 417
    .line 418
    .line 419
    move-result-object v5

    .line 420
    invoke-virtual {v5}, Lco/discord/media_engine/internal/RtcpStats;->getPliPackets()J

    .line 421
    .line 422
    .line 423
    move-result-wide v42

    .line 424
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getQpSum()J

    .line 425
    .line 426
    .line 427
    move-result-wide v44

    .line 428
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getBwLimitedResolution()Z

    .line 429
    .line 430
    .line 431
    move-result v46

    .line 432
    invoke-virtual {v1}, Lco/discord/media_engine/internal/OutboundVideo;->getCpuLimitedResolution()Z

    .line 433
    .line 434
    .line 435
    move-result v47

    .line 436
    new-instance v1, Lco/discord/media_engine/OutboundRtpVideo;

    .line 437
    .line 438
    move-object v15, v1

    .line 439
    move-object/from16 v19, v3

    .line 440
    .line 441
    invoke-direct/range {v15 .. v47}, Lco/discord/media_engine/OutboundRtpVideo;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)V

    .line 442
    .line 443
    .line 444
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    move-wide/from16 v17, v8

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_c
    move-wide/from16 v17, v8

    .line 450
    .line 451
    const/4 v1, 0x0

    .line 452
    :goto_c
    new-instance v3, Ljava/util/HashMap;

    .line 453
    .line 454
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 455
    .line 456
    .line 457
    new-instance v5, Ljava/util/HashMap;

    .line 458
    .line 459
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0}, Lco/discord/media_engine/internal/NativeStats;->getInbound()[Lco/discord/media_engine/internal/Inbound;

    .line 463
    .line 464
    .line 465
    move-result-object v8

    .line 466
    if-eqz v8, :cond_18

    .line 467
    .line 468
    array-length v9, v8

    .line 469
    move v10, v4

    .line 470
    move-wide v13, v6

    .line 471
    :goto_d
    if-ge v10, v9, :cond_17

    .line 472
    .line 473
    aget-object v11, v8, v10

    .line 474
    .line 475
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getId()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getAudio()Lco/discord/media_engine/internal/InboundAudio;

    .line 480
    .line 481
    .line 482
    move-result-object v16

    .line 483
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getBytesReceived()J

    .line 484
    .line 485
    .line 486
    move-result-wide v19

    .line 487
    add-long v13, v13, v19

    .line 488
    .line 489
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getAudio()Lco/discord/media_engine/internal/InboundAudio;

    .line 490
    .line 491
    .line 492
    move-result-object v16

    .line 493
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getPlayout()Lco/discord/media_engine/internal/InboundPlayout;

    .line 494
    .line 495
    .line 496
    move-result-object v19

    .line 497
    if-eqz v19, :cond_d

    .line 498
    .line 499
    sget-object v4, Lco/discord/media_engine/internal/TransformStats;->INSTANCE:Lco/discord/media_engine/internal/TransformStats;

    .line 500
    .line 501
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getPlayout()Lco/discord/media_engine/internal/InboundPlayout;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    invoke-direct {v4, v6}, Lco/discord/media_engine/internal/TransformStats;->transformPlayoutStats(Lco/discord/media_engine/internal/InboundPlayout;)Lco/discord/media_engine/internal/InboundPlayout;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    goto :goto_e

    .line 510
    :cond_d
    const/4 v4, 0x0

    .line 511
    :goto_e
    new-instance v6, Lco/discord/media_engine/InboundRtpAudio;

    .line 512
    .line 513
    const-string v49, "audio"

    .line 514
    .line 515
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getSsrc()J

    .line 516
    .line 517
    .line 518
    move-result-wide v50

    .line 519
    new-instance v7, Lco/discord/media_engine/StatsCodec;

    .line 520
    .line 521
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getCodecPayloadType()I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    move-object/from16 v23, v8

    .line 526
    .line 527
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getCodecName()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    invoke-direct {v7, v2, v8}, Lco/discord/media_engine/StatsCodec;-><init>(ILjava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getPacketsReceived()J

    .line 535
    .line 536
    .line 537
    move-result-wide v55

    .line 538
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getPacketsLost()J

    .line 539
    .line 540
    .line 541
    move-result-wide v57

    .line 542
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getAudioLevel()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    int-to-float v2, v2

    .line 547
    const/high16 v8, 0x47000000    # 32768.0f

    .line 548
    .line 549
    div-float v59, v2, v8

    .line 550
    .line 551
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getSpeaking()J

    .line 552
    .line 553
    .line 554
    move-result-wide v24

    .line 555
    const-wide/16 v20, 0x0

    .line 556
    .line 557
    cmp-long v2, v24, v20

    .line 558
    .line 559
    if-lez v2, :cond_e

    .line 560
    .line 561
    const/16 v60, 0x1

    .line 562
    .line 563
    goto :goto_f

    .line 564
    :cond_e
    const/16 v60, 0x0

    .line 565
    .line 566
    :goto_f
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getJitter()J

    .line 567
    .line 568
    .line 569
    move-result-wide v61

    .line 570
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getJitterBuffer()J

    .line 571
    .line 572
    .line 573
    move-result-wide v63

    .line 574
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getJitterBufferPreferred()J

    .line 575
    .line 576
    .line 577
    move-result-wide v65

    .line 578
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDelayEstimate()J

    .line 579
    .line 580
    .line 581
    move-result-wide v67

    .line 582
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDecodingCNG()I

    .line 583
    .line 584
    .line 585
    move-result v69

    .line 586
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDecodingMutedOutput()I

    .line 587
    .line 588
    .line 589
    move-result v70

    .line 590
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDecodingNormal()I

    .line 591
    .line 592
    .line 593
    move-result v71

    .line 594
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDecodingPLC()I

    .line 595
    .line 596
    .line 597
    move-result v72

    .line 598
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getDecodingPLCCNG()I

    .line 599
    .line 600
    .line 601
    move-result v73

    .line 602
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpSilence()J

    .line 603
    .line 604
    .line 605
    move-result-wide v24

    .line 606
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 607
    .line 608
    .line 609
    move-result-object v74

    .line 610
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpNormal()J

    .line 611
    .line 612
    .line 613
    move-result-wide v24

    .line 614
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 615
    .line 616
    .line 617
    move-result-object v75

    .line 618
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpMerge()J

    .line 619
    .line 620
    .line 621
    move-result-wide v24

    .line 622
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 623
    .line 624
    .line 625
    move-result-object v76

    .line 626
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpExpand()J

    .line 627
    .line 628
    .line 629
    move-result-wide v24

    .line 630
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 631
    .line 632
    .line 633
    move-result-object v77

    .line 634
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpAccelerate()J

    .line 635
    .line 636
    .line 637
    move-result-wide v24

    .line 638
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 639
    .line 640
    .line 641
    move-result-object v78

    .line 642
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpPreemptiveExpand()J

    .line 643
    .line 644
    .line 645
    move-result-wide v24

    .line 646
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 647
    .line 648
    .line 649
    move-result-object v79

    .line 650
    invoke-virtual/range {v16 .. v16}, Lco/discord/media_engine/internal/InboundAudio;->getOpCNG()J

    .line 651
    .line 652
    .line 653
    move-result-wide v24

    .line 654
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 655
    .line 656
    .line 657
    move-result-object v80

    .line 658
    if-eqz v4, :cond_f

    .line 659
    .line 660
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    move-object/from16 v81, v2

    .line 665
    .line 666
    goto :goto_10

    .line 667
    :cond_f
    const/16 v81, 0x0

    .line 668
    .line 669
    :goto_10
    if-eqz v4, :cond_10

    .line 670
    .line 671
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    move-object/from16 v82, v2

    .line 676
    .line 677
    goto :goto_11

    .line 678
    :cond_10
    const/16 v82, 0x0

    .line 679
    .line 680
    :goto_11
    if-eqz v4, :cond_11

    .line 681
    .line 682
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    move-object/from16 v83, v2

    .line 687
    .line 688
    goto :goto_12

    .line 689
    :cond_11
    const/16 v83, 0x0

    .line 690
    .line 691
    :goto_12
    if-eqz v4, :cond_12

    .line 692
    .line 693
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioPlayoutUnderruns()Lco/discord/media_engine/PlayoutMetric;

    .line 694
    .line 695
    .line 696
    move-result-object v2

    .line 697
    move-object/from16 v84, v2

    .line 698
    .line 699
    goto :goto_13

    .line 700
    :cond_12
    const/16 v84, 0x0

    .line 701
    .line 702
    :goto_13
    if-eqz v4, :cond_13

    .line 703
    .line 704
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    move-object/from16 v85, v2

    .line 709
    .line 710
    goto :goto_14

    .line 711
    :cond_13
    const/16 v85, 0x0

    .line 712
    .line 713
    :goto_14
    if-eqz v4, :cond_14

    .line 714
    .line 715
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundPlayout;->getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    move-object/from16 v86, v2

    .line 720
    .line 721
    goto :goto_15

    .line 722
    :cond_14
    const/16 v86, 0x0

    .line 723
    .line 724
    :goto_15
    move-object/from16 v48, v6

    .line 725
    .line 726
    move-object/from16 v52, v7

    .line 727
    .line 728
    move-wide/from16 v53, v13

    .line 729
    .line 730
    invoke-direct/range {v48 .. v86}, Lco/discord/media_engine/InboundRtpAudio;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v15, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    check-cast v2, Lco/discord/media_engine/InboundRtpAudio;

    .line 738
    .line 739
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getVideo()Lco/discord/media_engine/internal/InboundVideo;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    if-eqz v2, :cond_16

    .line 744
    .line 745
    invoke-virtual {v11}, Lco/discord/media_engine/internal/Inbound;->getVideo()Lco/discord/media_engine/internal/InboundVideo;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundRtpStats;->getHeaderBytes()J

    .line 754
    .line 755
    .line 756
    move-result-wide v6

    .line 757
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundRtpStats;->getPaddingBytes()J

    .line 762
    .line 763
    .line 764
    move-result-wide v24

    .line 765
    add-long v6, v6, v24

    .line 766
    .line 767
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-virtual {v4}, Lco/discord/media_engine/internal/InboundRtpStats;->getPayloadBytes()J

    .line 772
    .line 773
    .line 774
    move-result-wide v24

    .line 775
    add-long v53, v6, v24

    .line 776
    .line 777
    add-long v13, v13, v53

    .line 778
    .line 779
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getCodecPayloadType()I

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    const/4 v6, -0x1

    .line 784
    if-ne v4, v6, :cond_15

    .line 785
    .line 786
    const/16 v52, 0x0

    .line 787
    .line 788
    goto :goto_16

    .line 789
    :cond_15
    new-instance v4, Lco/discord/media_engine/StatsCodec;

    .line 790
    .line 791
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getCodecPayloadType()I

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getCodecName()Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v7

    .line 799
    invoke-direct {v4, v6, v7}, Lco/discord/media_engine/StatsCodec;-><init>(ILjava/lang/String;)V

    .line 800
    .line 801
    .line 802
    move-object/from16 v52, v4

    .line 803
    .line 804
    :goto_16
    new-instance v4, Lco/discord/media_engine/InboundRtpVideo;

    .line 805
    .line 806
    move-object/from16 v48, v4

    .line 807
    .line 808
    const-string v49, "video"

    .line 809
    .line 810
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getSsrc()J

    .line 811
    .line 812
    .line 813
    move-result-wide v50

    .line 814
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;

    .line 815
    .line 816
    .line 817
    move-result-object v6

    .line 818
    invoke-virtual {v6}, Lco/discord/media_engine/internal/InboundRtpStats;->getPackets()J

    .line 819
    .line 820
    .line 821
    move-result-wide v6

    .line 822
    long-to-int v6, v6

    .line 823
    move/from16 v55, v6

    .line 824
    .line 825
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;

    .line 826
    .line 827
    .line 828
    move-result-object v6

    .line 829
    invoke-virtual {v6}, Lco/discord/media_engine/internal/InboundRtpStats;->getPacketsLost()I

    .line 830
    .line 831
    .line 832
    move-result v56

    .line 833
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getTotalBitrate()I

    .line 834
    .line 835
    .line 836
    move-result v57

    .line 837
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getDecode()I

    .line 838
    .line 839
    .line 840
    move-result v58

    .line 841
    new-instance v6, Lco/discord/media_engine/Resolution;

    .line 842
    .line 843
    move-object/from16 v59, v6

    .line 844
    .line 845
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getWidth()I

    .line 846
    .line 847
    .line 848
    move-result v7

    .line 849
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getHeight()I

    .line 850
    .line 851
    .line 852
    move-result v11

    .line 853
    invoke-direct {v6, v7, v11}, Lco/discord/media_engine/Resolution;-><init>(II)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getDecoderImplementationName()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v60

    .line 860
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getFramesDecoded()J

    .line 861
    .line 862
    .line 863
    move-result-wide v6

    .line 864
    long-to-int v6, v6

    .line 865
    move/from16 v61, v6

    .line 866
    .line 867
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getFramesDropped()I

    .line 868
    .line 869
    .line 870
    move-result v62

    .line 871
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;

    .line 872
    .line 873
    .line 874
    move-result-object v6

    .line 875
    invoke-virtual {v6}, Lco/discord/media_engine/internal/FrameCounts;->getDeltaFrames()I

    .line 876
    .line 877
    .line 878
    move-result v6

    .line 879
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;

    .line 880
    .line 881
    .line 882
    move-result-object v7

    .line 883
    invoke-virtual {v7}, Lco/discord/media_engine/internal/FrameCounts;->getKeyFrames()I

    .line 884
    .line 885
    .line 886
    move-result v7

    .line 887
    add-int v63, v6, v7

    .line 888
    .line 889
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getDecodeFrameRate()I

    .line 890
    .line 891
    .line 892
    move-result v64

    .line 893
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getNetworkFrameRate()I

    .line 894
    .line 895
    .line 896
    move-result v65

    .line 897
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRenderFrameRate()I

    .line 898
    .line 899
    .line 900
    move-result v66

    .line 901
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtcpStats()Lco/discord/media_engine/internal/InboundRtcpStats;

    .line 902
    .line 903
    .line 904
    move-result-object v6

    .line 905
    invoke-virtual {v6}, Lco/discord/media_engine/internal/InboundRtcpStats;->getFirPackets()J

    .line 906
    .line 907
    .line 908
    move-result-wide v67

    .line 909
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtcpStats()Lco/discord/media_engine/internal/InboundRtcpStats;

    .line 910
    .line 911
    .line 912
    move-result-object v6

    .line 913
    invoke-virtual {v6}, Lco/discord/media_engine/internal/InboundRtcpStats;->getNackPackets()J

    .line 914
    .line 915
    .line 916
    move-result-wide v69

    .line 917
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getRtcpStats()Lco/discord/media_engine/internal/InboundRtcpStats;

    .line 918
    .line 919
    .line 920
    move-result-object v6

    .line 921
    invoke-virtual {v6}, Lco/discord/media_engine/internal/InboundRtcpStats;->getPliPackets()J

    .line 922
    .line 923
    .line 924
    move-result-wide v71

    .line 925
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getQpSum()J

    .line 926
    .line 927
    .line 928
    move-result-wide v73

    .line 929
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getFreezeCount()J

    .line 930
    .line 931
    .line 932
    move-result-wide v75

    .line 933
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getPauseCount()J

    .line 934
    .line 935
    .line 936
    move-result-wide v77

    .line 937
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getTotalFreezesDuration()J

    .line 938
    .line 939
    .line 940
    move-result-wide v79

    .line 941
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getTotalPausesDuration()J

    .line 942
    .line 943
    .line 944
    move-result-wide v81

    .line 945
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getTotalFramesDuration()J

    .line 946
    .line 947
    .line 948
    move-result-wide v83

    .line 949
    invoke-virtual {v2}, Lco/discord/media_engine/internal/InboundVideo;->getSumOfSquaredFramesDurations()D

    .line 950
    .line 951
    .line 952
    move-result-wide v85

    .line 953
    invoke-direct/range {v48 .. v86}, Lco/discord/media_engine/InboundRtpVideo;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v5, v15, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v2

    .line 960
    check-cast v2, Lco/discord/media_engine/InboundRtpVideo;

    .line 961
    .line 962
    :cond_16
    add-int/lit8 v10, v10, 0x1

    .line 963
    .line 964
    move v2, v8

    .line 965
    move-wide/from16 v6, v20

    .line 966
    .line 967
    move-object/from16 v8, v23

    .line 968
    .line 969
    const/4 v4, 0x0

    .line 970
    goto/16 :goto_d

    .line 971
    .line 972
    :cond_17
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 973
    .line 974
    move-wide v15, v13

    .line 975
    goto :goto_17

    .line 976
    :cond_18
    move-wide/from16 v20, v6

    .line 977
    .line 978
    move-wide/from16 v15, v20

    .line 979
    .line 980
    :goto_17
    invoke-virtual {v0}, Lco/discord/media_engine/internal/NativeStats;->getTransport()Lco/discord/media_engine/internal/Transport;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    if-eqz v0, :cond_19

    .line 985
    .line 986
    new-instance v2, Lco/discord/media_engine/Transport;

    .line 987
    .line 988
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->getSendBandwidth()I

    .line 989
    .line 990
    .line 991
    move-result v14

    .line 992
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->getRtt()I

    .line 993
    .line 994
    .line 995
    move-result v19

    .line 996
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->getDecryptionFailures()J

    .line 997
    .line 998
    .line 999
    move-result-wide v6

    .line 1000
    long-to-int v4, v6

    .line 1001
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v20

    .line 1005
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->getLocalAddress()Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v21

    .line 1009
    invoke-virtual {v0}, Lco/discord/media_engine/internal/Transport;->getReceiverReports()[Lco/discord/media_engine/ReceiverReport;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v22

    .line 1013
    move-object v13, v2

    .line 1014
    invoke-direct/range {v13 .. v22}, Lco/discord/media_engine/Transport;-><init>(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V

    .line 1015
    .line 1016
    .line 1017
    move-object v11, v2

    .line 1018
    goto :goto_18

    .line 1019
    :cond_19
    new-instance v0, Lco/discord/media_engine/Transport;

    .line 1020
    .line 1021
    const/4 v14, 0x0

    .line 1022
    const/4 v2, 0x0

    .line 1023
    const/4 v4, 0x0

    .line 1024
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v20

    .line 1028
    const-string v21, ""

    .line 1029
    .line 1030
    const/16 v22, 0x0

    .line 1031
    .line 1032
    move-object v13, v0

    .line 1033
    move/from16 v19, v2

    .line 1034
    .line 1035
    invoke-direct/range {v13 .. v22}, Lco/discord/media_engine/Transport;-><init>(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V

    .line 1036
    .line 1037
    .line 1038
    move-object v11, v0

    .line 1039
    :goto_18
    new-instance v0, Lco/discord/media_engine/Stats;

    .line 1040
    .line 1041
    move-object v10, v0

    .line 1042
    move-object v13, v1

    .line 1043
    move-object v14, v3

    .line 1044
    move-object v15, v5

    .line 1045
    invoke-direct/range {v10 .. v15}, Lco/discord/media_engine/Stats;-><init>(Lco/discord/media_engine/Transport;Lco/discord/media_engine/OutboundRtpAudio;Lco/discord/media_engine/OutboundRtpVideo;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 1046
    .line 1047
    .line 1048
    return-object v0
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
.end method

.method private final transformPlayoutStats(Lco/discord/media_engine/internal/InboundPlayout;)Lco/discord/media_engine/internal/InboundPlayout;
    .locals 12

    .line 1
    new-instance v11, Lco/discord/media_engine/internal/InboundPlayout;

    .line 2
    .line 3
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioPlayoutUnderruns()Lco/discord/media_engine/PlayoutMetric;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getAudioCaptureOverruns()Lco/discord/media_engine/PlayoutMetric;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getVideoJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getVideoJitterDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getVideoJitterTarget()Lco/discord/media_engine/PlayoutMetric;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {p1}, Lco/discord/media_engine/internal/InboundPlayout;->getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Lco/discord/media_engine/internal/TransformStats;->convertPlayoutMetricToMs(Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/PlayoutMetric;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    move-object v0, v11

    .line 84
    invoke-direct/range {v0 .. v10}, Lco/discord/media_engine/internal/InboundPlayout;-><init>(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V

    .line 85
    .line 86
    .line 87
    return-object v11
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
.end method
