.class public final Lco/discord/media_engine/internal/RtcpStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u0012\n\u0010\n\u001a\u00060\u0008j\u0002`\t\u0012\n\u0010\u000b\u001a\u00060\u0008j\u0002`\t\u0012\n\u0010\u000c\u001a\u00060\u0008j\u0002`\t\u0012\n\u0010\r\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010\u0019\u001a\u00060\u0003j\u0002`\u0006H\u00c6\u0003J\r\u0010\u001a\u001a\u00060\u0008j\u0002`\tH\u00c6\u0003J\r\u0010\u001b\u001a\u00060\u0008j\u0002`\tH\u00c6\u0003J\r\u0010\u001c\u001a\u00060\u0008j\u0002`\tH\u00c6\u0003J\r\u0010\u001d\u001a\u00060\u0008j\u0002`\tH\u00c6\u0003J\r\u0010\u001e\u001a\u00060\u0008j\u0002`\tH\u00c6\u0003Jk\u0010\u001f\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\u000c\u0008\u0002\u0010\u0007\u001a\u00060\u0008j\u0002`\t2\u000c\u0008\u0002\u0010\n\u001a\u00060\u0008j\u0002`\t2\u000c\u0008\u0002\u0010\u000b\u001a\u00060\u0008j\u0002`\t2\u000c\u0008\u0002\u0010\u000c\u001a\u00060\u0008j\u0002`\t2\u000c\u0008\u0002\u0010\r\u001a\u00060\u0008j\u0002`\tH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020%H\u00d6\u0001R\u0015\u0010\u0007\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0015\u0010\n\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0010R\u0015\u0010\u000b\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0015\u0010\u000c\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0010R\u0015\u0010\r\u001a\u00060\u0008j\u0002`\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0010\u00a8\u0006&"
    }
    d2 = {
        "Lco/discord/media_engine/internal/RtcpStats;",
        "",
        "fractionLost",
        "",
        "Lco/discord/media_engine/internal/U8;",
        "packetsLost",
        "Lco/discord/media_engine/internal/I32;",
        "firPackets",
        "",
        "Lco/discord/media_engine/internal/U32;",
        "nackPackets",
        "nackRequests",
        "pliPackets",
        "uniqueNackRequests",
        "(IIJJJJJ)V",
        "getFirPackets",
        "()J",
        "getFractionLost",
        "()I",
        "getNackPackets",
        "getNackRequests",
        "getPacketsLost",
        "getPliPackets",
        "getUniqueNackRequests",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
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
.field private final firPackets:J

.field private final fractionLost:I

.field private final nackPackets:J

.field private final nackRequests:J

.field private final packetsLost:I

.field private final pliPackets:J

.field private final uniqueNackRequests:J


# direct methods
.method public constructor <init>(IIJJJJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    .line 5
    .line 6
    iput p2, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    .line 7
    .line 8
    iput-wide p3, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    .line 9
    .line 10
    iput-wide p5, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    .line 11
    .line 12
    iput-wide p7, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    .line 13
    .line 14
    iput-wide p9, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    .line 15
    .line 16
    iput-wide p11, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    .line 17
    .line 18
    return-void
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
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/RtcpStats;IIJJJJJILjava/lang/Object;)Lco/discord/media_engine/internal/RtcpStats;
    .locals 13

    move-object v0, p0

    and-int/lit8 v1, p13, 0x1

    if-eqz v1, :cond_0

    iget v1, v0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, p13, 0x2

    if-eqz v2, :cond_1

    iget v2, v0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v3, p13, 0x4

    if-eqz v3, :cond_2

    iget-wide v3, v0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    goto :goto_2

    :cond_2
    move-wide/from16 v3, p3

    :goto_2
    and-int/lit8 v5, p13, 0x8

    if-eqz v5, :cond_3

    iget-wide v5, v0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    goto :goto_3

    :cond_3
    move-wide/from16 v5, p5

    :goto_3
    and-int/lit8 v7, p13, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p7

    :goto_4
    and-int/lit8 v9, p13, 0x20

    if-eqz v9, :cond_5

    iget-wide v9, v0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    goto :goto_5

    :cond_5
    move-wide/from16 v9, p9

    :goto_5
    and-int/lit8 v11, p13, 0x40

    if-eqz v11, :cond_6

    iget-wide v11, v0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    goto :goto_6

    :cond_6
    move-wide/from16 v11, p11

    :goto_6
    move p1, v1

    move p2, v2

    move-wide/from16 p3, v3

    move-wide/from16 p5, v5

    move-wide/from16 p7, v7

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    invoke-virtual/range {p0 .. p12}, Lco/discord/media_engine/internal/RtcpStats;->copy(IIJJJJJ)Lco/discord/media_engine/internal/RtcpStats;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    return v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    return-wide v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    return-wide v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    return-wide v0
.end method

.method public final copy(IIJJJJJ)Lco/discord/media_engine/internal/RtcpStats;
    .locals 14

    new-instance v13, Lco/discord/media_engine/internal/RtcpStats;

    move-object v0, v13

    move v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    invoke-direct/range {v0 .. v12}, Lco/discord/media_engine/internal/RtcpStats;-><init>(IIJJJJJ)V

    return-object v13
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/RtcpStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/RtcpStats;

    iget v1, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    iget v3, p1, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    iget v3, p1, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getFirPackets()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    return-wide v0
.end method

.method public final getFractionLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    return v0
.end method

.method public final getNackPackets()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    return-wide v0
.end method

.method public final getNackRequests()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    return-wide v0
.end method

.method public final getPacketsLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    return v0
.end method

.method public final getPliPackets()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    return-wide v0
.end method

.method public final getUniqueNackRequests()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RtcpStats(fractionLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/RtcpStats;->fractionLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/RtcpStats;->packetsLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firPackets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->firPackets:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nackPackets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->nackPackets:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nackRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->nackRequests:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pliPackets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->pliPackets:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", uniqueNackRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/RtcpStats;->uniqueNackRequests:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
