.class public final Lco/discord/media_engine/Transport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ`\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\'2\u0008\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\t\u0010*\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\u0008\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010R\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006+"
    }
    d2 = {
        "Lco/discord/media_engine/Transport;",
        "",
        "availableOutgoingBitrate",
        "",
        "bytesReceived",
        "",
        "bytesSent",
        "ping",
        "decryptionFailures",
        "localAddress",
        "",
        "receiverReports",
        "",
        "Lco/discord/media_engine/ReceiverReport;",
        "(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V",
        "getAvailableOutgoingBitrate",
        "()I",
        "getBytesReceived",
        "()J",
        "getBytesSent",
        "getDecryptionFailures",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getLocalAddress",
        "()Ljava/lang/String;",
        "getPing",
        "getReceiverReports",
        "()[Lco/discord/media_engine/ReceiverReport;",
        "[Lco/discord/media_engine/ReceiverReport;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/Transport;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final availableOutgoingBitrate:I

.field private final bytesReceived:J

.field private final bytesSent:J

.field private final decryptionFailures:Ljava/lang/Integer;

.field private final localAddress:Ljava/lang/String;

.field private final ping:I

.field private final receiverReports:[Lco/discord/media_engine/ReceiverReport;


# direct methods
.method public constructor <init>(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    .line 5
    .line 6
    iput-wide p2, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    .line 7
    .line 8
    iput-wide p4, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    .line 9
    .line 10
    iput p6, p0, Lco/discord/media_engine/Transport;->ping:I

    .line 11
    .line 12
    iput-object p7, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    .line 13
    .line 14
    iput-object p8, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p9, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

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

.method public static synthetic copy$default(Lco/discord/media_engine/Transport;IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;ILjava/lang/Object;)Lco/discord/media_engine/Transport;
    .locals 10

    move-object v0, p0

    and-int/lit8 v1, p10, 0x1

    if-eqz v1, :cond_0

    iget v1, v0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, p10, 0x2

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lco/discord/media_engine/Transport;->bytesReceived:J

    goto :goto_1

    :cond_1
    move-wide v2, p2

    :goto_1
    and-int/lit8 v4, p10, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lco/discord/media_engine/Transport;->bytesSent:J

    goto :goto_2

    :cond_2
    move-wide v4, p4

    :goto_2
    and-int/lit8 v6, p10, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lco/discord/media_engine/Transport;->ping:I

    goto :goto_3

    :cond_3
    move/from16 v6, p6

    :goto_3
    and-int/lit8 v7, p10, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p7

    :goto_4
    and-int/lit8 v8, p10, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    :goto_5
    and-int/lit8 v9, p10, 0x40

    if-eqz v9, :cond_6

    iget-object v9, v0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    goto :goto_6

    :cond_6
    move-object/from16 v9, p9

    :goto_6
    move p1, v1

    move-wide p2, v2

    move-wide p4, v4

    move/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    invoke-virtual/range {p0 .. p9}, Lco/discord/media_engine/Transport;->copy(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/Transport;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    return-wide v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/Transport;->ping:I

    return v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()[Lco/discord/media_engine/ReceiverReport;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    return-object v0
.end method

.method public final copy(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)Lco/discord/media_engine/Transport;
    .locals 11

    new-instance v10, Lco/discord/media_engine/Transport;

    move-object v0, v10

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lco/discord/media_engine/Transport;-><init>(IJJILjava/lang/Integer;Ljava/lang/String;[Lco/discord/media_engine/ReceiverReport;)V

    return-object v10
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/Transport;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/Transport;

    iget v1, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    iget v3, p1, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/Transport;->bytesReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    iget-wide v5, p1, Lco/discord/media_engine/Transport;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/discord/media_engine/Transport;->ping:I

    iget v3, p1, Lco/discord/media_engine/Transport;->ping:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    iget-object v3, p1, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    iget-object p1, p1, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAvailableOutgoingBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    return v0
.end method

.method public final getBytesReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    return-wide v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    return-wide v0
.end method

.method public final getDecryptionFailures()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getLocalAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getPing()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/Transport;->ping:I

    return v0
.end method

.method public final getReceiverReports()[Lco/discord/media_engine/ReceiverReport;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/Transport;->ping:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Transport(availableOutgoingBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/Transport;->availableOutgoingBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/Transport;->bytesReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", bytesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/Transport;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ping="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/Transport;->ping:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decryptionFailures="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/Transport;->decryptionFailures:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", localAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/Transport;->localAddress:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", receiverReports="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/Transport;->receiverReports:[Lco/discord/media_engine/ReceiverReport;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
