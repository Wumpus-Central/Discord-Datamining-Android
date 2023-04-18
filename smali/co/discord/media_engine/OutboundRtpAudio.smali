.class public final Lco/discord/media_engine/OutboundRtpAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u00081\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0011H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0011H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\r\u00105\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\t\u00106\u001a\u00020\u0008H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u000cH\u00c6\u0003J\t\u0010:\u001a\u00020\u000eH\u00c6\u0003J\t\u0010;\u001a\u00020\u000eH\u00c6\u0003J\t\u0010<\u001a\u00020\u0011H\u00c6\u0003J\u00a3\u0001\u0010=\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010>\u001a\u00020\u00112\u0008\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u000cH\u00d6\u0001J\t\u0010A\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u001eR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\u001eR\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001e\u00a8\u0006B"
    }
    d2 = {
        "Lco/discord/media_engine/OutboundRtpAudio;",
        "",
        "type",
        "",
        "ssrc",
        "",
        "Lco/discord/media_engine/U32;",
        "codec",
        "Lco/discord/media_engine/StatsCodec;",
        "bytesSent",
        "packetsSent",
        "packetsLost",
        "",
        "fractionLost",
        "",
        "audioLevel",
        "audioDetected",
        "",
        "framesCaptured",
        "framesRendered",
        "noiseCancellerIsEnabled",
        "noiseCancellerProcessTime",
        "voiceActivityDetectorIsEnabled",
        "voiceActivityDetectorProcessTime",
        "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)V",
        "getAudioDetected",
        "()Z",
        "getAudioLevel",
        "()F",
        "getBytesSent",
        "()J",
        "getCodec",
        "()Lco/discord/media_engine/StatsCodec;",
        "getFractionLost",
        "getFramesCaptured",
        "getFramesRendered",
        "getNoiseCancellerIsEnabled",
        "getNoiseCancellerProcessTime",
        "getPacketsLost",
        "()I",
        "getPacketsSent",
        "getSsrc",
        "getType",
        "()Ljava/lang/String;",
        "getVoiceActivityDetectorIsEnabled",
        "getVoiceActivityDetectorProcessTime",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
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
.field private final audioDetected:Z

.field private final audioLevel:F

.field private final bytesSent:J

.field private final codec:Lco/discord/media_engine/StatsCodec;

.field private final fractionLost:F

.field private final framesCaptured:J

.field private final framesRendered:J

.field private final noiseCancellerIsEnabled:Z

.field private final noiseCancellerProcessTime:J

.field private final packetsLost:I

.field private final packetsSent:J

.field private final ssrc:J

.field private final type:Ljava/lang/String;

.field private final voiceActivityDetectorIsEnabled:Z

.field private final voiceActivityDetectorProcessTime:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    const-string v3, "type"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "codec"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    move-wide v3, p2

    .line 3
    iput-wide v3, v0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    .line 4
    iput-object v2, v0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    move v1, p9

    .line 7
    iput v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    move v1, p10

    .line 8
    iput v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    move/from16 v1, p11

    .line 9
    iput v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    move/from16 v1, p12

    .line 10
    iput-boolean v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    move-wide/from16 v1, p13

    .line 11
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    move-wide/from16 v1, p15

    .line 12
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    move/from16 v1, p17

    .line 13
    iput-boolean v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    move-wide/from16 v1, p18

    .line 14
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    move/from16 v1, p20

    .line 15
    iput-boolean v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    move-wide/from16 v1, p21

    .line 16
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/OutboundRtpAudio;Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJILjava/lang/Object;)Lco/discord/media_engine/OutboundRtpAudio;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p23

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, v0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p7

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget v10, v0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    goto :goto_5

    :cond_5
    move/from16 v10, p9

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget v11, v0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    goto :goto_6

    :cond_6
    move/from16 v11, p10

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget v12, v0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    goto :goto_7

    :cond_7
    move/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-boolean v13, v0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    goto :goto_8

    :cond_8
    move/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    goto :goto_9

    :cond_9
    move-wide/from16 v14, p13

    :goto_9
    move-wide/from16 p13, v14

    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p15

    :goto_a
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p17

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    move/from16 p17, v14

    if-eqz v15, :cond_c

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    goto :goto_c

    :cond_c
    move-wide/from16 v14, p18

    :goto_c
    move-wide/from16 p18, v14

    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_d

    iget-boolean v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    goto :goto_d

    :cond_d
    move/from16 v14, p20

    :goto_d
    and-int/lit16 v1, v1, 0x4000

    move/from16 p20, v14

    if-eqz v1, :cond_e

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    goto :goto_e

    :cond_e
    move-wide/from16 v14, p21

    :goto_e
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-wide/from16 p21, v14

    invoke-virtual/range {p0 .. p22}, Lco/discord/media_engine/OutboundRtpAudio;->copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)Lco/discord/media_engine/OutboundRtpAudio;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    return-wide v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    return-wide v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    return v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    return-wide v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    return v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    return-wide v0
.end method

.method public final component3()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)Lco/discord/media_engine/OutboundRtpAudio;
    .locals 25

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move-wide/from16 v13, p13

    move-wide/from16 v15, p15

    move/from16 v17, p17

    move-wide/from16 v18, p18

    move/from16 v20, p20

    move-wide/from16 v21, p21

    const-string v0, "type"

    move-object/from16 v23, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v24, Lco/discord/media_engine/OutboundRtpAudio;

    move-object/from16 v0, v24

    move-object/from16 v1, v23

    invoke-direct/range {v0 .. v22}, Lco/discord/media_engine/OutboundRtpAudio;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFFZJJZJZJ)V

    return-object v24
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/OutboundRtpAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/OutboundRtpAudio;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    iget v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    iget v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    iget-boolean v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    iget-boolean v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    iget-boolean v3, p1, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_10

    return v2

    :cond_10
    return v0
.end method

.method public final getAudioDetected()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    return v0
.end method

.method public final getAudioLevel()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    return v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    return-wide v0
.end method

.method public final getCodec()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final getFractionLost()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    return v0
.end method

.method public final getFramesCaptured()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    return-wide v0
.end method

.method public final getFramesRendered()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    return-wide v0
.end method

.method public final getNoiseCancellerIsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    return v0
.end method

.method public final getNoiseCancellerProcessTime()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    return-wide v0
.end method

.method public final getPacketsLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    return v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    return-wide v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getVoiceActivityDetectorIsEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    return v0
.end method

.method public final getVoiceActivityDetectorProcessTime()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v1}, Lco/discord/media_engine/StatsCodec;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutboundRtpAudio(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->packetsLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fractionLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->fractionLost:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", audioLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioLevel:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", audioDetected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->audioDetected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", framesCaptured="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesCaptured:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", framesRendered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->framesRendered:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", noiseCancellerIsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerIsEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", noiseCancellerProcessTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->noiseCancellerProcessTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", voiceActivityDetectorIsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorIsEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", voiceActivityDetectorProcessTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpAudio;->voiceActivityDetectorProcessTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
