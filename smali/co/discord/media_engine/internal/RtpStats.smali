.class public final Lco/discord/media_engine/internal/RtpStats;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/discord/media_engine/internal/RtpStats;",
        "",
        "fec",
        "Lco/discord/media_engine/internal/PacketStats;",
        "retransmitted",
        "transmitted",
        "(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)V",
        "getFec",
        "()Lco/discord/media_engine/internal/PacketStats;",
        "getRetransmitted",
        "getTransmitted",
        "component1",
        "component2",
        "component3",
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
.field private final fec:Lco/discord/media_engine/internal/PacketStats;

.field private final retransmitted:Lco/discord/media_engine/internal/PacketStats;

.field private final transmitted:Lco/discord/media_engine/internal/PacketStats;


# direct methods
.method public constructor <init>(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)V
    .locals 1

    .line 1
    const-string v0, "fec"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "retransmitted"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "transmitted"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    .line 20
    .line 21
    iput-object p2, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    .line 22
    .line 23
    iput-object p3, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    .line 24
    .line 25
    return-void
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
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/RtpStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;ILjava/lang/Object;)Lco/discord/media_engine/internal/RtpStats;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/discord/media_engine/internal/RtpStats;->copy(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)Lco/discord/media_engine/internal/RtpStats;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public final component2()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public final component3()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public final copy(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)Lco/discord/media_engine/internal/RtpStats;
    .locals 1

    const-string v0, "fec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retransmitted"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transmitted"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/discord/media_engine/internal/RtpStats;

    invoke-direct {v0, p1, p2, p3}, Lco/discord/media_engine/internal/RtpStats;-><init>(Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;Lco/discord/media_engine/internal/PacketStats;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/RtpStats;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/RtpStats;

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    iget-object p1, p1, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getFec()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public final getRetransmitted()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public final getTransmitted()Lco/discord/media_engine/internal/PacketStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v0}, Lco/discord/media_engine/internal/PacketStats;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/PacketStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/PacketStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RtpStats(fec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->fec:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retransmitted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->retransmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transmitted="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/RtpStats;->transmitted:Lco/discord/media_engine/internal/PacketStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
