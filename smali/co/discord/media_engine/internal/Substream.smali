.class public final Lco/discord/media_engine/internal/Substream;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008$\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u000c\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013\u0012\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0002\u0010\u0016J\r\u0010\'\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010(\u001a\u00060\u0012j\u0002`\u0013H\u00c6\u0003J\r\u0010)\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010*\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\r\u0010,\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\r\u0010/\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u00100\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u00101\u001a\u00020\u000eH\u00c6\u0003J\t\u00102\u001a\u00020\u0010H\u00c6\u0003J\u009d\u0001\u00103\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u000c\u0008\u0002\u0010\u0007\u001a\u00060\u0003j\u0002`\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000c\u0008\u0002\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u000c\u001a\u00060\u0003j\u0002`\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u000c\u0008\u0002\u0010\u0011\u001a\u00060\u0012j\u0002`\u00132\u000c\u0008\u0002\u0010\u0014\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0001J\u0013\u00104\u001a\u00020\t2\u0008\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0003H\u00d6\u0001J\t\u00107\u001a\u000208H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0018R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u001cR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u001cR\u0015\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0015\u0010\u000c\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0015\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0015\u0010\u0014\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018R\u0015\u0010\u0015\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0018\u00a8\u00069"
    }
    d2 = {
        "Lco/discord/media_engine/internal/Substream;",
        "",
        "avgDelay",
        "",
        "Lco/discord/media_engine/internal/I32;",
        "frameCounts",
        "Lco/discord/media_engine/internal/FrameCounts;",
        "height",
        "isFlexFEC",
        "",
        "isRTX",
        "maxDelay",
        "retransmitBitrate",
        "rtcpStats",
        "Lco/discord/media_engine/internal/RtcpStats;",
        "rtpStats",
        "Lco/discord/media_engine/internal/RtpStats;",
        "ssrc",
        "",
        "Lco/discord/media_engine/internal/U32;",
        "totalBitrate",
        "width",
        "(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)V",
        "getAvgDelay",
        "()I",
        "getFrameCounts",
        "()Lco/discord/media_engine/internal/FrameCounts;",
        "getHeight",
        "()Z",
        "getMaxDelay",
        "getRetransmitBitrate",
        "getRtcpStats",
        "()Lco/discord/media_engine/internal/RtcpStats;",
        "getRtpStats",
        "()Lco/discord/media_engine/internal/RtpStats;",
        "getSsrc",
        "()J",
        "getTotalBitrate",
        "getWidth",
        "component1",
        "component10",
        "component11",
        "component12",
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
.field private final avgDelay:I

.field private final frameCounts:Lco/discord/media_engine/internal/FrameCounts;

.field private final height:I

.field private final isFlexFEC:Z

.field private final isRTX:Z

.field private final maxDelay:I

.field private final retransmitBitrate:I

.field private final rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

.field private final rtpStats:Lco/discord/media_engine/internal/RtpStats;

.field private final ssrc:J

.field private final totalBitrate:I

.field private final width:I


# direct methods
.method public constructor <init>(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)V
    .locals 1

    .line 1
    const-string v0, "frameCounts"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rtcpStats"

    .line 7
    .line 8
    invoke-static {p8, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "rtpStats"

    .line 12
    .line 13
    invoke-static {p9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput p1, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    .line 20
    .line 21
    iput-object p2, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    .line 22
    .line 23
    iput p3, p0, Lco/discord/media_engine/internal/Substream;->height:I

    .line 24
    .line 25
    iput-boolean p4, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    .line 26
    .line 27
    iput-boolean p5, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    .line 28
    .line 29
    iput p6, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    .line 30
    .line 31
    iput p7, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    .line 32
    .line 33
    iput-object p8, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    .line 34
    .line 35
    iput-object p9, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    .line 36
    .line 37
    iput-wide p10, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    .line 38
    .line 39
    iput p12, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    .line 40
    .line 41
    iput p13, p0, Lco/discord/media_engine/internal/Substream;->width:I

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/Substream;ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JIIILjava/lang/Object;)Lco/discord/media_engine/internal/Substream;
    .locals 14

    move-object v0, p0

    move/from16 v1, p14

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/discord/media_engine/internal/Substream;->height:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-wide v11, v0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    goto :goto_9

    :cond_9
    move-wide/from16 v11, p10

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget v1, v0, Lco/discord/media_engine/internal/Substream;->width:I

    goto :goto_b

    :cond_b
    move/from16 v1, p13

    :goto_b
    move p1, v2

    move-object/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-wide/from16 p10, v11

    move/from16 p12, v13

    move/from16 p13, v1

    invoke-virtual/range {p0 .. p13}, Lco/discord/media_engine/internal/Substream;->copy(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)Lco/discord/media_engine/internal/Substream;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    return v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    return-wide v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->width:I

    return v0
.end method

.method public final component2()Lco/discord/media_engine/internal/FrameCounts;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->height:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    return v0
.end method

.method public final component8()Lco/discord/media_engine/internal/RtcpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    return-object v0
.end method

.method public final component9()Lco/discord/media_engine/internal/RtpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    return-object v0
.end method

.method public final copy(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)Lco/discord/media_engine/internal/Substream;
    .locals 15

    const-string v0, "frameCounts"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtcpStats"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtpStats"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/discord/media_engine/internal/Substream;

    move-object v1, v0

    move/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-wide/from16 v11, p10

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lco/discord/media_engine/internal/Substream;-><init>(ILco/discord/media_engine/internal/FrameCounts;IZZIILco/discord/media_engine/internal/RtcpStats;Lco/discord/media_engine/internal/RtpStats;JII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/Substream;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/Substream;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    iget v3, p1, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    iget-object v3, p1, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/discord/media_engine/internal/Substream;->height:I

    iget v3, p1, Lco/discord/media_engine/internal/Substream;->height:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    iget v3, p1, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    iget v3, p1, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/Substream;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    iget v3, p1, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/discord/media_engine/internal/Substream;->width:I

    iget p1, p1, Lco/discord/media_engine/internal/Substream;->width:I

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getAvgDelay()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    return v0
.end method

.method public final getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->height:I

    return v0
.end method

.method public final getMaxDelay()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    return v0
.end method

.method public final getRetransmitBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    return v0
.end method

.method public final getRtcpStats()Lco/discord/media_engine/internal/RtcpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    return-object v0
.end method

.method public final getRtpStats()Lco/discord/media_engine/internal/RtpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    return-object v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    return-wide v0
.end method

.method public final getTotalBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/FrameCounts;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->height:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/RtcpStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/RtpStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->width:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFlexFEC()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    return v0
.end method

.method public final isRTX()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Substream(avgDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->avgDelay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameCounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isFlexFEC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isFlexFEC:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isRTX="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/Substream;->isRTX:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->maxDelay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retransmitBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->retransmitBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rtcpStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtcpStats:Lco/discord/media_engine/internal/RtcpStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rtpStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/Substream;->rtpStats:Lco/discord/media_engine/internal/RtpStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/Substream;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->totalBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/Substream;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
