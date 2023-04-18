.class public final Lco/discord/media_engine/VoiceQuality;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000b\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u000e\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u000f\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u0010\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u001a\u0010\u0011\u001a\u00020\u000c2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006J\u000e\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/discord/media_engine/VoiceQuality;",
        "",
        "()V",
        "_duration",
        "Lco/discord/media_engine/Duration;",
        "_inboundStats",
        "",
        "",
        "Lco/discord/media_engine/InboundAudio;",
        "_outboundStats",
        "Lco/discord/media_engine/OutboundAudio;",
        "getBufferStats",
        "",
        "result",
        "getDurationStats",
        "getFrameOpStats",
        "getMosStats",
        "getPacketStats",
        "update",
        "stats",
        "Lco/discord/media_engine/Stats;",
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
.field private _duration:Lco/discord/media_engine/Duration;

.field private _inboundStats:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/discord/media_engine/InboundAudio;",
            ">;"
        }
    .end annotation
.end field

.field private _outboundStats:Lco/discord/media_engine/OutboundAudio;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lco/discord/media_engine/OutboundAudio;

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v0, v1, v2, v3}, Lco/discord/media_engine/OutboundAudio;-><init>(JI)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 20
    .line 21
    new-instance v0, Lco/discord/media_engine/Duration;

    .line 22
    .line 23
    invoke-direct {v0, v3, v3, v3, v3}, Lco/discord/media_engine/Duration;-><init>(IIII)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 27
    .line 28
    return-void
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


# virtual methods
.method public final getBufferStats(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v2, v1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lco/discord/media_engine/InboundAudio;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Lco/discord/media_engine/InboundAudio;->getBufferStats()Lco/discord/media_engine/InboundBufferStats;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    invoke-virtual {v3}, Lco/discord/media_engine/InboundAudio;->getBufferStats()Lco/discord/media_engine/InboundBufferStats;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v5}, Lco/discord/media_engine/InboundBufferStats;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    invoke-virtual {v5}, Lco/discord/media_engine/PlayoutMetric;->getP75()D

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    invoke-virtual {v4}, Lco/discord/media_engine/PlayoutMetric;->getP75()D

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    cmpl-double v4, v5, v7

    .line 68
    .line 69
    if-lez v4, :cond_0

    .line 70
    .line 71
    invoke-virtual {v3}, Lco/discord/media_engine/InboundAudio;->getBufferStats()Lco/discord/media_engine/InboundBufferStats;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    goto :goto_0

    .line 76
    :cond_2
    if-eqz v2, :cond_3

    .line 77
    .line 78
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object v0, v1

    .line 84
    :goto_1
    const-string v3, "audio_jitter_buffer"

    .line 85
    .line 86
    invoke-static {v3, v0, p1}, Lco/discord/media_engine/VoiceQualityKt;->access$explodePlayoutMetric(Ljava/lang/String;Lco/discord/media_engine/PlayoutMetric;Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    move-object v0, v1

    .line 97
    :goto_2
    const-string v3, "audio_jitter_target"

    .line 98
    .line 99
    invoke-static {v3, v0, p1}, Lco/discord/media_engine/VoiceQualityKt;->access$explodePlayoutMetric(Ljava/lang/String;Lco/discord/media_engine/PlayoutMetric;Ljava/util/Map;)V

    .line 100
    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_3

    .line 109
    :cond_5
    move-object v0, v1

    .line 110
    :goto_3
    const-string v3, "audio_jitter_delay"

    .line 111
    .line 112
    invoke-static {v3, v0, p1}, Lco/discord/media_engine/VoiceQualityKt;->access$explodePlayoutMetric(Ljava/lang/String;Lco/discord/media_engine/PlayoutMetric;Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    move-object v0, v1

    .line 123
    :goto_4
    const-string v3, "relative_reception_delay"

    .line 124
    .line 125
    invoke-static {v3, v0, p1}, Lco/discord/media_engine/VoiceQualityKt;->access$explodePlayoutMetric(Ljava/lang/String;Lco/discord/media_engine/PlayoutMetric;Ljava/util/Map;)V

    .line 126
    .line 127
    .line 128
    if-eqz v2, :cond_7

    .line 129
    .line 130
    invoke-virtual {v2}, Lco/discord/media_engine/InboundBufferStats;->getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    :cond_7
    const-string v0, "relative_playout_delay"

    .line 135
    .line 136
    invoke-static {v0, v1, p1}, Lco/discord/media_engine/VoiceQualityKt;->access$explodePlayoutMetric(Ljava/lang/String;Lco/discord/media_engine/PlayoutMetric;Ljava/util/Map;)V

    .line 137
    .line 138
    .line 139
    return-void
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

.method public final getDurationStats(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 7
    .line 8
    invoke-virtual {v0}, Lco/discord/media_engine/Duration;->getListening()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "duration_listening"

    .line 17
    .line 18
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 22
    .line 23
    invoke-virtual {v0}, Lco/discord/media_engine/Duration;->getSpeaking()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "duration_speaking"

    .line 32
    .line 33
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 37
    .line 38
    invoke-virtual {v0}, Lco/discord/media_engine/Duration;->getParticipation()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "duration_participation"

    .line 47
    .line 48
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 52
    .line 53
    invoke-virtual {v0}, Lco/discord/media_engine/Duration;->getConnected()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "duration_connected"

    .line 62
    .line 63
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void
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
.end method

.method public final getFrameOpStats(Ljava/util/Map;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v2, v1, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 11
    .line 12
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v4, v3

    .line 22
    move-object v5, v4

    .line 23
    move-object v6, v5

    .line 24
    move-object v7, v6

    .line 25
    move-object v8, v7

    .line 26
    move-object v9, v8

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v10

    .line 31
    if-eqz v10, :cond_e

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    check-cast v10, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    check-cast v10, Lco/discord/media_engine/InboundAudio;

    .line 44
    .line 45
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getSilent()Ljava/lang/Long;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    const-wide/16 v12, 0x0

    .line 54
    .line 55
    if-eqz v11, :cond_2

    .line 56
    .line 57
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v14

    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v16

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-wide/from16 v16, v12

    .line 69
    .line 70
    :goto_1
    add-long v16, v16, v14

    .line 71
    .line 72
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getNormal()Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    if-eqz v11, :cond_4

    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v14

    .line 90
    if-eqz v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide v16

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move-wide/from16 v16, v12

    .line 98
    .line 99
    :goto_2
    add-long v16, v16, v14

    .line 100
    .line 101
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    :cond_4
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getMerged()Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    if-eqz v11, :cond_6

    .line 114
    .line 115
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v14

    .line 119
    if-eqz v5, :cond_5

    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v16

    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-wide/from16 v16, v12

    .line 127
    .line 128
    :goto_3
    add-long v16, v16, v14

    .line 129
    .line 130
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    :cond_6
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getExpanded()Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    if-eqz v11, :cond_8

    .line 143
    .line 144
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 145
    .line 146
    .line 147
    move-result-wide v14

    .line 148
    if-eqz v6, :cond_7

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v16

    .line 154
    goto :goto_4

    .line 155
    :cond_7
    move-wide/from16 v16, v12

    .line 156
    .line 157
    :goto_4
    add-long v16, v16, v14

    .line 158
    .line 159
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    :cond_8
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getAccelerated()Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    if-eqz v11, :cond_a

    .line 172
    .line 173
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 174
    .line 175
    .line 176
    move-result-wide v14

    .line 177
    if-eqz v7, :cond_9

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 180
    .line 181
    .line 182
    move-result-wide v16

    .line 183
    goto :goto_5

    .line 184
    :cond_9
    move-wide/from16 v16, v12

    .line 185
    .line 186
    :goto_5
    add-long v16, v16, v14

    .line 187
    .line 188
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    :cond_a
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 193
    .line 194
    .line 195
    move-result-object v11

    .line 196
    invoke-virtual {v11}, Lco/discord/media_engine/InboundFrameOpStats;->getPreemptiveExpanded()Ljava/lang/Long;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    if-eqz v11, :cond_c

    .line 201
    .line 202
    invoke-virtual {v11}, Ljava/lang/Number;->longValue()J

    .line 203
    .line 204
    .line 205
    move-result-wide v14

    .line 206
    if-eqz v8, :cond_b

    .line 207
    .line 208
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 209
    .line 210
    .line 211
    move-result-wide v16

    .line 212
    goto :goto_6

    .line 213
    :cond_b
    move-wide/from16 v16, v12

    .line 214
    .line 215
    :goto_6
    add-long v16, v16, v14

    .line 216
    .line 217
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    :cond_c
    invoke-virtual {v10}, Lco/discord/media_engine/InboundAudio;->getFrameOpStats()Lco/discord/media_engine/InboundFrameOpStats;

    .line 222
    .line 223
    .line 224
    move-result-object v10

    .line 225
    invoke-virtual {v10}, Lco/discord/media_engine/InboundFrameOpStats;->getCng()Ljava/lang/Long;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    if-eqz v10, :cond_0

    .line 230
    .line 231
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 232
    .line 233
    .line 234
    move-result-wide v10

    .line 235
    if-eqz v9, :cond_d

    .line 236
    .line 237
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 238
    .line 239
    .line 240
    move-result-wide v12

    .line 241
    :cond_d
    add-long/2addr v12, v10

    .line 242
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    goto/16 :goto_0

    .line 247
    .line 248
    :cond_e
    if-eqz v3, :cond_f

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 251
    .line 252
    .line 253
    move-result-wide v2

    .line 254
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    const-string v3, "frame_op_silent"

    .line 259
    .line 260
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_f
    if-eqz v4, :cond_10

    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v2

    .line 269
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    const-string v3, "frame_op_normal"

    .line 274
    .line 275
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    :cond_10
    if-eqz v5, :cond_11

    .line 279
    .line 280
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 281
    .line 282
    .line 283
    move-result-wide v2

    .line 284
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const-string v3, "frame_op_merged"

    .line 289
    .line 290
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    :cond_11
    if-eqz v6, :cond_12

    .line 294
    .line 295
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 296
    .line 297
    .line 298
    move-result-wide v2

    .line 299
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const-string v3, "frame_op_expanded"

    .line 304
    .line 305
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    :cond_12
    if-eqz v7, :cond_13

    .line 309
    .line 310
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 311
    .line 312
    .line 313
    move-result-wide v2

    .line 314
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    const-string v3, "frame_op_accelerated"

    .line 319
    .line 320
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    :cond_13
    if-eqz v8, :cond_14

    .line 324
    .line 325
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 326
    .line 327
    .line 328
    move-result-wide v2

    .line 329
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    const-string v3, "frame_op_preemptive_expanded"

    .line 334
    .line 335
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    :cond_14
    if-eqz v9, :cond_15

    .line 339
    .line 340
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 341
    .line 342
    .line 343
    move-result-wide v2

    .line 344
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    const-string v3, "frame_op_cng"

    .line 349
    .line 350
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    :cond_15
    return-void
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
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
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

.method public final getMosStats(Ljava/util/Map;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x5

    .line 9
    new-array v2, v1, [Ljava/lang/Integer;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    aput-object v4, v2, v3

    .line 17
    .line 18
    const/4 v5, 0x1

    .line 19
    aput-object v4, v2, v5

    .line 20
    .line 21
    const/4 v6, 0x2

    .line 22
    aput-object v4, v2, v6

    .line 23
    .line 24
    const/4 v7, 0x3

    .line 25
    aput-object v4, v2, v7

    .line 26
    .line 27
    const/4 v8, 0x4

    .line 28
    aput-object v4, v2, v8

    .line 29
    .line 30
    move-object/from16 v9, p0

    .line 31
    .line 32
    iget-object v10, v9, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 33
    .line 34
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    const-wide/16 v11, 0x0

    .line 43
    .line 44
    move v13, v3

    .line 45
    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    if-eqz v14, :cond_1

    .line 50
    .line 51
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v14

    .line 55
    check-cast v14, Ljava/util/Map$Entry;

    .line 56
    .line 57
    invoke-interface {v14}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    check-cast v14, Lco/discord/media_engine/InboundAudio;

    .line 62
    .line 63
    invoke-virtual {v14}, Lco/discord/media_engine/InboundAudio;->getMosSum()D

    .line 64
    .line 65
    .line 66
    move-result-wide v15

    .line 67
    add-double/2addr v11, v15

    .line 68
    invoke-virtual {v14}, Lco/discord/media_engine/InboundAudio;->getMosCount()I

    .line 69
    .line 70
    .line 71
    move-result v15

    .line 72
    add-int/2addr v13, v15

    .line 73
    move v15, v3

    .line 74
    :goto_0
    if-ge v15, v1, :cond_0

    .line 75
    .line 76
    aget-object v16, v2, v15

    .line 77
    .line 78
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result v16

    .line 82
    invoke-virtual {v14}, Lco/discord/media_engine/InboundAudio;->getMosBuckets()[Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v17

    .line 86
    aget-object v17, v17, v15

    .line 87
    .line 88
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v17

    .line 92
    add-int v16, v16, v17

    .line 93
    .line 94
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v16

    .line 98
    aput-object v16, v2, v15

    .line 99
    .line 100
    add-int/lit8 v15, v15, 0x1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    if-lez v13, :cond_2

    .line 104
    .line 105
    int-to-double v3, v13

    .line 106
    div-double/2addr v11, v3

    .line 107
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    :cond_2
    const-string v1, "mos_mean"

    .line 112
    .line 113
    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    const-string v1, "mos_1"

    .line 117
    .line 118
    aget-object v3, v2, v5

    .line 119
    .line 120
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    const-string v1, "mos_2"

    .line 124
    .line 125
    aget-object v3, v2, v6

    .line 126
    .line 127
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    const-string v1, "mos_3"

    .line 131
    .line 132
    aget-object v3, v2, v7

    .line 133
    .line 134
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string v1, "mos_4"

    .line 138
    .line 139
    aget-object v2, v2, v8

    .line 140
    .line 141
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    return-void
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

.method public final getPacketStats(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-wide/16 v1, 0x0

    .line 17
    .line 18
    move-wide v3, v1

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    check-cast v5, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lco/discord/media_engine/InboundAudio;

    .line 36
    .line 37
    invoke-virtual {v5}, Lco/discord/media_engine/InboundAudio;->getPacketsReceived()J

    .line 38
    .line 39
    .line 40
    move-result-wide v6

    .line 41
    add-long/2addr v1, v6

    .line 42
    invoke-virtual {v5}, Lco/discord/media_engine/InboundAudio;->getPacketsLost()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    add-long/2addr v3, v5

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 49
    .line 50
    invoke-virtual {v0}, Lco/discord/media_engine/OutboundAudio;->getPacketsSent()J

    .line 51
    .line 52
    .line 53
    move-result-wide v5

    .line 54
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v5, "packets_sent"

    .line 59
    .line 60
    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 64
    .line 65
    invoke-virtual {v0}, Lco/discord/media_engine/OutboundAudio;->getPacketsLost()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v5, "packets_sent_lost"

    .line 74
    .line 75
    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    const-string v0, "packets_received"

    .line 79
    .line 80
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    const-string v0, "packets_received_lost"

    .line 88
    .line 89
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-void
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

.method public final update(Lco/discord/media_engine/Stats;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "stats"

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 11
    .line 12
    invoke-virtual {v1}, Lco/discord/media_engine/Duration;->getConnected()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    add-int/2addr v3, v4

    .line 18
    invoke-virtual {v1, v3}, Lco/discord/media_engine/Duration;->setConnected(I)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 22
    .line 23
    invoke-virtual {v1}, Lco/discord/media_engine/OutboundAudio;->getPacketsSent()J

    .line 24
    .line 25
    .line 26
    move-result-wide v5

    .line 27
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    move-wide v9, v7

    .line 40
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lco/discord/media_engine/InboundAudio;

    .line 57
    .line 58
    invoke-virtual {v3}, Lco/discord/media_engine/InboundAudio;->getPacketsReceived()J

    .line 59
    .line 60
    .line 61
    move-result-wide v11

    .line 62
    add-long/2addr v9, v11

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/Stats;->getOutboundRtpAudio()Lco/discord/media_engine/OutboundRtpAudio;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v3, 0x0

    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    new-instance v11, Lco/discord/media_engine/OutboundAudio;

    .line 72
    .line 73
    invoke-virtual {v1}, Lco/discord/media_engine/OutboundRtpAudio;->getPacketsSent()J

    .line 74
    .line 75
    .line 76
    move-result-wide v12

    .line 77
    invoke-virtual {v1}, Lco/discord/media_engine/OutboundRtpAudio;->getPacketsLost()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-direct {v11, v12, v13, v1}, Lco/discord/media_engine/OutboundAudio;-><init>(JI)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    new-instance v11, Lco/discord/media_engine/OutboundAudio;

    .line 86
    .line 87
    invoke-direct {v11, v7, v8, v3}, Lco/discord/media_engine/OutboundAudio;-><init>(JI)V

    .line 88
    .line 89
    .line 90
    :goto_1
    iput-object v11, v0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 91
    .line 92
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/Stats;->getInboundRtpAudio()Ljava/util/HashMap;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v11

    .line 108
    if-eqz v11, :cond_6

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v11

    .line 114
    check-cast v11, Ljava/util/Map$Entry;

    .line 115
    .line 116
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v12

    .line 120
    check-cast v12, Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    check-cast v11, Lco/discord/media_engine/InboundRtpAudio;

    .line 127
    .line 128
    invoke-virtual/range {p1 .. p1}, Lco/discord/media_engine/Stats;->getTransport()Lco/discord/media_engine/Transport;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    if-eqz v13, :cond_2

    .line 133
    .line 134
    invoke-virtual {v13}, Lco/discord/media_engine/Transport;->getPing()I

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    goto :goto_3

    .line 139
    :cond_2
    move v13, v3

    .line 140
    :goto_3
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getPacketsReceived()J

    .line 141
    .line 142
    .line 143
    move-result-wide v15

    .line 144
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getPacketsLost()J

    .line 145
    .line 146
    .line 147
    move-result-wide v17

    .line 148
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getJitterBuffer()J

    .line 149
    .line 150
    .line 151
    move-result-wide v3

    .line 152
    long-to-int v3, v3

    .line 153
    new-instance v25, Lco/discord/media_engine/InboundBufferStats;

    .line 154
    .line 155
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;

    .line 156
    .line 157
    .line 158
    move-result-object v20

    .line 159
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;

    .line 160
    .line 161
    .line 162
    move-result-object v21

    .line 163
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 164
    .line 165
    .line 166
    move-result-object v22

    .line 167
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 168
    .line 169
    .line 170
    move-result-object v23

    .line 171
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;

    .line 172
    .line 173
    .line 174
    move-result-object v24

    .line 175
    move-object/from16 v19, v25

    .line 176
    .line 177
    invoke-direct/range {v19 .. v24}, Lco/discord/media_engine/InboundBufferStats;-><init>(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V

    .line 178
    .line 179
    .line 180
    new-instance v26, Lco/discord/media_engine/InboundFrameOpStats;

    .line 181
    .line 182
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpSilence()Ljava/lang/Long;

    .line 183
    .line 184
    .line 185
    move-result-object v28

    .line 186
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpNormal()Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v29

    .line 190
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpMerge()Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v30

    .line 194
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpExpand()Ljava/lang/Long;

    .line 195
    .line 196
    .line 197
    move-result-object v31

    .line 198
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpAccelerate()Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v32

    .line 202
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpPreemptiveExpand()Ljava/lang/Long;

    .line 203
    .line 204
    .line 205
    move-result-object v33

    .line 206
    invoke-virtual {v11}, Lco/discord/media_engine/InboundRtpAudio;->getOpCNG()Ljava/lang/Long;

    .line 207
    .line 208
    .line 209
    move-result-object v34

    .line 210
    move-object/from16 v27, v26

    .line 211
    .line 212
    invoke-direct/range {v27 .. v34}, Lco/discord/media_engine/InboundFrameOpStats;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 213
    .line 214
    .line 215
    iget-object v4, v0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 216
    .line 217
    invoke-interface {v4, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    check-cast v11, Lco/discord/media_engine/InboundAudio;

    .line 222
    .line 223
    if-eqz v11, :cond_5

    .line 224
    .line 225
    invoke-virtual {v11}, Lco/discord/media_engine/InboundAudio;->getPacketsReceived()J

    .line 226
    .line 227
    .line 228
    move-result-wide v19

    .line 229
    sub-long v19, v15, v19

    .line 230
    .line 231
    invoke-virtual {v11}, Lco/discord/media_engine/InboundAudio;->getPacketsLost()J

    .line 232
    .line 233
    .line 234
    move-result-wide v21

    .line 235
    move-object/from16 v27, v1

    .line 236
    .line 237
    sub-long v1, v17, v21

    .line 238
    .line 239
    invoke-virtual {v11}, Lco/discord/media_engine/InboundAudio;->getMosBuckets()[Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v24

    .line 243
    cmp-long v14, v19, v7

    .line 244
    .line 245
    const-wide/16 v21, 0x0

    .line 246
    .line 247
    if-lez v14, :cond_3

    .line 248
    .line 249
    cmp-long v14, v1, v7

    .line 250
    .line 251
    if-ltz v14, :cond_3

    .line 252
    .line 253
    add-int/2addr v13, v3

    .line 254
    int-to-double v13, v13

    .line 255
    long-to-double v7, v1

    .line 256
    add-long v1, v19, v1

    .line 257
    .line 258
    long-to-double v1, v1

    .line 259
    div-double v30, v7, v1

    .line 260
    .line 261
    const-wide/16 v32, 0x0

    .line 262
    .line 263
    const-wide/high16 v34, 0x3ff0000000000000L    # 1.0

    .line 264
    .line 265
    invoke-static/range {v30 .. v35}, Lco/discord/media_engine/VoiceQualityKt;->access$clamp(DDD)D

    .line 266
    .line 267
    .line 268
    move-result-wide v1

    .line 269
    invoke-static {v13, v14, v1, v2}, Lco/discord/media_engine/VoiceQualityKt;->access$_calculateMos(DD)D

    .line 270
    .line 271
    .line 272
    move-result-wide v1

    .line 273
    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    .line 274
    .line 275
    .line 276
    move-result-wide v7

    .line 277
    double-to-int v3, v7

    .line 278
    aget-object v7, v24, v3

    .line 279
    .line 280
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    const/4 v8, 0x1

    .line 285
    add-int/2addr v7, v8

    .line 286
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    aput-object v7, v24, v3

    .line 291
    .line 292
    move-wide/from16 v19, v1

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_3
    move-wide/from16 v19, v21

    .line 296
    .line 297
    :goto_4
    new-instance v1, Lco/discord/media_engine/InboundAudio;

    .line 298
    .line 299
    invoke-virtual {v11}, Lco/discord/media_engine/InboundAudio;->getMosSum()D

    .line 300
    .line 301
    .line 302
    move-result-wide v2

    .line 303
    add-double v2, v2, v19

    .line 304
    .line 305
    invoke-virtual {v11}, Lco/discord/media_engine/InboundAudio;->getMosCount()I

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    cmpl-double v8, v19, v21

    .line 310
    .line 311
    if-lez v8, :cond_4

    .line 312
    .line 313
    const/4 v8, 0x1

    .line 314
    goto :goto_5

    .line 315
    :cond_4
    const/4 v8, 0x0

    .line 316
    :goto_5
    add-int v23, v7, v8

    .line 317
    .line 318
    move-object v14, v1

    .line 319
    move-wide/from16 v21, v2

    .line 320
    .line 321
    invoke-direct/range {v14 .. v26}, Lco/discord/media_engine/InboundAudio;-><init>(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V

    .line 322
    .line 323
    .line 324
    const/4 v8, 0x0

    .line 325
    goto :goto_6

    .line 326
    :cond_5
    move-object/from16 v27, v1

    .line 327
    .line 328
    new-instance v1, Lco/discord/media_engine/InboundAudio;

    .line 329
    .line 330
    const-wide/16 v19, 0x0

    .line 331
    .line 332
    const-wide/16 v21, 0x0

    .line 333
    .line 334
    const/16 v23, 0x0

    .line 335
    .line 336
    const/4 v2, 0x5

    .line 337
    new-array v2, v2, [Ljava/lang/Integer;

    .line 338
    .line 339
    const/4 v8, 0x0

    .line 340
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    aput-object v3, v2, v8

    .line 345
    .line 346
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v3

    .line 350
    const/4 v7, 0x1

    .line 351
    aput-object v3, v2, v7

    .line 352
    .line 353
    const/4 v3, 0x2

    .line 354
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v7

    .line 358
    aput-object v7, v2, v3

    .line 359
    .line 360
    const/4 v3, 0x3

    .line 361
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    aput-object v7, v2, v3

    .line 366
    .line 367
    const/4 v3, 0x4

    .line 368
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    aput-object v7, v2, v3

    .line 373
    .line 374
    move-object v14, v1

    .line 375
    move-object/from16 v24, v2

    .line 376
    .line 377
    invoke-direct/range {v14 .. v26}, Lco/discord/media_engine/InboundAudio;-><init>(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V

    .line 378
    .line 379
    .line 380
    :goto_6
    invoke-interface {v4, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-object/from16 v2, p1

    .line 384
    .line 385
    move v3, v8

    .line 386
    move-object/from16 v1, v27

    .line 387
    .line 388
    const/4 v4, 0x1

    .line 389
    const-wide/16 v7, 0x0

    .line 390
    .line 391
    goto/16 :goto_2

    .line 392
    .line 393
    :cond_6
    move v8, v3

    .line 394
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_outboundStats:Lco/discord/media_engine/OutboundAudio;

    .line 395
    .line 396
    invoke-virtual {v1}, Lco/discord/media_engine/OutboundAudio;->getPacketsSent()J

    .line 397
    .line 398
    .line 399
    move-result-wide v1

    .line 400
    cmp-long v1, v1, v5

    .line 401
    .line 402
    if-lez v1, :cond_7

    .line 403
    .line 404
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 405
    .line 406
    invoke-virtual {v1}, Lco/discord/media_engine/Duration;->getSpeaking()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    const/4 v3, 0x1

    .line 411
    add-int/2addr v2, v3

    .line 412
    invoke-virtual {v1, v2}, Lco/discord/media_engine/Duration;->setSpeaking(I)V

    .line 413
    .line 414
    .line 415
    const/4 v1, 0x1

    .line 416
    goto :goto_7

    .line 417
    :cond_7
    move v1, v8

    .line 418
    :goto_7
    iget-object v2, v0, Lco/discord/media_engine/VoiceQuality;->_inboundStats:Ljava/util/Map;

    .line 419
    .line 420
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 425
    .line 426
    .line 427
    move-result-object v2

    .line 428
    const-wide/16 v28, 0x0

    .line 429
    .line 430
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_8

    .line 435
    .line 436
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    check-cast v3, Ljava/util/Map$Entry;

    .line 441
    .line 442
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    check-cast v3, Lco/discord/media_engine/InboundAudio;

    .line 447
    .line 448
    invoke-virtual {v3}, Lco/discord/media_engine/InboundAudio;->getPacketsReceived()J

    .line 449
    .line 450
    .line 451
    move-result-wide v3

    .line 452
    add-long v28, v28, v3

    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_8
    cmp-long v2, v28, v9

    .line 456
    .line 457
    if-lez v2, :cond_9

    .line 458
    .line 459
    iget-object v2, v0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 460
    .line 461
    invoke-virtual {v2}, Lco/discord/media_engine/Duration;->getListening()I

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    const/4 v4, 0x1

    .line 466
    add-int/2addr v3, v4

    .line 467
    invoke-virtual {v2, v3}, Lco/discord/media_engine/Duration;->setListening(I)V

    .line 468
    .line 469
    .line 470
    move v3, v4

    .line 471
    goto :goto_9

    .line 472
    :cond_9
    const/4 v4, 0x1

    .line 473
    move v3, v8

    .line 474
    :goto_9
    if-nez v1, :cond_a

    .line 475
    .line 476
    if-eqz v3, :cond_b

    .line 477
    .line 478
    :cond_a
    iget-object v1, v0, Lco/discord/media_engine/VoiceQuality;->_duration:Lco/discord/media_engine/Duration;

    .line 479
    .line 480
    invoke-virtual {v1}, Lco/discord/media_engine/Duration;->getParticipation()I

    .line 481
    .line 482
    .line 483
    move-result v2

    .line 484
    add-int/2addr v2, v4

    .line 485
    invoke-virtual {v1, v2}, Lco/discord/media_engine/Duration;->setParticipation(I)V

    .line 486
    .line 487
    .line 488
    :cond_b
    return-void
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
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
