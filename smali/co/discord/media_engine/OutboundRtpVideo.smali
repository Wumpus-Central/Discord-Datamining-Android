.class public final Lco/discord/media_engine/OutboundRtpVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008=\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00c1\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u000c\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u000c\u0012\u0006\u0010\u0019\u001a\u00020\u000c\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u000cH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u000cH\u00c6\u0003J\t\u0010D\u001a\u00020\u0015H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\t\u0010G\u001a\u00020\u000cH\u00c6\u0003J\t\u0010H\u001a\u00020\u000cH\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\r\u0010K\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u001fH\u00c6\u0003J\t\u0010O\u001a\u00020\u001fH\u00c6\u0003J\t\u0010P\u001a\u00020\u0008H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u000cH\u00c6\u0003J\t\u0010T\u001a\u00020\u000eH\u00c6\u0003J\t\u0010U\u001a\u00020\u000cH\u00c6\u0003J\t\u0010V\u001a\u00020\u000cH\u00c6\u0003J\u00f3\u0001\u0010W\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u0008\u0008\u0002\u0010 \u001a\u00020\u001fH\u00c6\u0001J\u0013\u0010X\u001a\u00020\u001f2\u0008\u0010Y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010Z\u001a\u00020\u000cH\u00d6\u0001J\t\u0010[\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010#R\u0011\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010#R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010 \u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010%R\u0011\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010)R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0011\u0010\u0019\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010#R\u0011\u0010\u0018\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010#R\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010)R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010)R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010)R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010#R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010)R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010)R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010)R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u0010=R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010)R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010/\u00a8\u0006\\"
    }
    d2 = {
        "Lco/discord/media_engine/OutboundRtpVideo;",
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
        "bitrate",
        "bitrateTarget",
        "encodeUsage",
        "encoderImplementationName",
        "averageEncodeTime",
        "resolution",
        "Lco/discord/media_engine/Resolution;",
        "framesSent",
        "framesEncoded",
        "frameRateInput",
        "frameRateEncode",
        "firCount",
        "nackCount",
        "pliCount",
        "qpSum",
        "bandwidthLimitedResolution",
        "",
        "cpuLimitedResolution",
        "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)V",
        "getAverageEncodeTime",
        "()I",
        "getBandwidthLimitedResolution",
        "()Z",
        "getBitrate",
        "getBitrateTarget",
        "getBytesSent",
        "()J",
        "getCodec",
        "()Lco/discord/media_engine/StatsCodec;",
        "getCpuLimitedResolution",
        "getEncodeUsage",
        "getEncoderImplementationName",
        "()Ljava/lang/String;",
        "getFirCount",
        "getFractionLost",
        "()F",
        "getFrameRateEncode",
        "getFrameRateInput",
        "getFramesEncoded",
        "getFramesSent",
        "getNackCount",
        "getPacketsLost",
        "getPacketsSent",
        "getPliCount",
        "getQpSum",
        "getResolution",
        "()Lco/discord/media_engine/Resolution;",
        "getSsrc",
        "getType",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component2",
        "component20",
        "component21",
        "component22",
        "component23",
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
.field private final averageEncodeTime:I

.field private final bandwidthLimitedResolution:Z

.field private final bitrate:I

.field private final bitrateTarget:I

.field private final bytesSent:J

.field private final codec:Lco/discord/media_engine/StatsCodec;

.field private final cpuLimitedResolution:Z

.field private final encodeUsage:I

.field private final encoderImplementationName:Ljava/lang/String;

.field private final firCount:J

.field private final fractionLost:F

.field private final frameRateEncode:I

.field private final frameRateInput:I

.field private final framesEncoded:J

.field private final framesSent:J

.field private final nackCount:J

.field private final packetsLost:I

.field private final packetsSent:J

.field private final pliCount:J

.field private final qpSum:J

.field private final resolution:Lco/discord/media_engine/Resolution;

.field private final ssrc:J

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p4

    move-object/from16 v3, p14

    move-object/from16 v4, p16

    const-string v5, "type"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "codec"

    invoke-static {p4, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "encoderImplementationName"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "resolution"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    move-wide v5, p2

    .line 3
    iput-wide v5, v0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    .line 4
    iput-object v2, v0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    move/from16 v1, p9

    .line 7
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    move/from16 v1, p10

    .line 8
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    move/from16 v1, p11

    .line 9
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    move/from16 v1, p12

    .line 10
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    move/from16 v1, p13

    .line 11
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    .line 12
    iput-object v3, v0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    move/from16 v1, p15

    .line 13
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    .line 14
    iput-object v4, v0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    move-wide/from16 v1, p17

    .line 15
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    move-wide/from16 v1, p19

    .line 16
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    move/from16 v1, p21

    .line 17
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    move/from16 v1, p22

    .line 18
    iput v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    move-wide/from16 v1, p23

    .line 19
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    move-wide/from16 v1, p25

    .line 20
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    move-wide/from16 v1, p27

    .line 21
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    move-wide/from16 v1, p29

    .line 22
    iput-wide v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    move/from16 v1, p31

    .line 23
    iput-boolean v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    move/from16 v1, p32

    .line 24
    iput-boolean v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/OutboundRtpVideo;Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZILjava/lang/Object;)Lco/discord/media_engine/OutboundRtpVideo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p33

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, v0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p7

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget v10, v0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    goto :goto_5

    :cond_5
    move/from16 v10, p9

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget v11, v0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    goto :goto_6

    :cond_6
    move/from16 v11, p10

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget v12, v0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    goto :goto_7

    :cond_7
    move/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget v13, v0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    goto :goto_8

    :cond_8
    move/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    goto :goto_9

    :cond_9
    move/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget-object v15, v0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v15, p14

    :goto_a
    move-object/from16 p14, v15

    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    goto :goto_b

    :cond_b
    move/from16 v15, p15

    :goto_b
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p16

    :goto_c
    move-object/from16 p16, v15

    and-int/lit16 v15, v1, 0x2000

    move/from16 p13, v14

    if-eqz v15, :cond_d

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    goto :goto_d

    :cond_d
    move-wide/from16 v14, p17

    :goto_d
    move-wide/from16 p17, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_e

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    goto :goto_e

    :cond_e
    move-wide/from16 v14, p19

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p19, v14

    if-eqz v16, :cond_f

    iget v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    goto :goto_f

    :cond_f
    move/from16 v14, p21

    :goto_f
    const/high16 v15, 0x10000

    and-int/2addr v15, v1

    if-eqz v15, :cond_10

    iget v15, v0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    goto :goto_10

    :cond_10
    move/from16 v15, p22

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move/from16 p21, v14

    move/from16 p22, v15

    if-eqz v16, :cond_11

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    goto :goto_11

    :cond_11
    move-wide/from16 v14, p23

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-wide/from16 p23, v14

    if-eqz v16, :cond_12

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    goto :goto_12

    :cond_12
    move-wide/from16 v14, p25

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-wide/from16 p25, v14

    if-eqz v16, :cond_13

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    goto :goto_13

    :cond_13
    move-wide/from16 v14, p27

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-wide/from16 p27, v14

    if-eqz v16, :cond_14

    iget-wide v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    goto :goto_14

    :cond_14
    move-wide/from16 v14, p29

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-wide/from16 p29, v14

    if-eqz v16, :cond_15

    iget-boolean v14, v0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    goto :goto_15

    :cond_15
    move/from16 v14, p31

    :goto_15
    const/high16 v15, 0x400000

    and-int/2addr v1, v15

    if-eqz v1, :cond_16

    iget-boolean v1, v0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    goto :goto_16

    :cond_16
    move/from16 v1, p32

    :goto_16
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p31, v14

    move/from16 p32, v1

    invoke-virtual/range {p0 .. p32}, Lco/discord/media_engine/OutboundRtpVideo;->copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)Lco/discord/media_engine/OutboundRtpVideo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    return v0
.end method

.method public final component13()Lco/discord/media_engine/Resolution;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    return-object v0
.end method

.method public final component14()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    return-wide v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    return-wide v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    return v0
.end method

.method public final component18()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    return-wide v0
.end method

.method public final component19()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    return-wide v0
.end method

.method public final component20()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    return-wide v0
.end method

.method public final component21()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    return-wide v0
.end method

.method public final component22()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    return v0
.end method

.method public final component23()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    return v0
.end method

.method public final component3()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    return v0
.end method

.method public final copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)Lco/discord/media_engine/OutboundRtpVideo;
    .locals 35

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v16, p16

    move-wide/from16 v17, p17

    move-wide/from16 v19, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move-wide/from16 v23, p23

    move-wide/from16 v25, p25

    move-wide/from16 v27, p27

    move-wide/from16 v29, p29

    move/from16 v31, p31

    move/from16 v32, p32

    const-string v0, "type"

    move-object/from16 v33, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoderImplementationName"

    move-object/from16 v1, p14

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    move-object/from16 v1, p16

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v34, Lco/discord/media_engine/OutboundRtpVideo;

    move-object/from16 v0, v34

    move-object/from16 v1, v33

    invoke-direct/range {v0 .. v32}, Lco/discord/media_engine/OutboundRtpVideo;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJIFIIILjava/lang/String;ILco/discord/media_engine/Resolution;JJIIJJJJZZ)V

    return-object v34
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/OutboundRtpVideo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/OutboundRtpVideo;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    iget-object v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    iget v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    iget-wide v5, p1, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    iget-boolean v3, p1, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    iget-boolean p1, p1, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    if-eq v1, p1, :cond_18

    return v2

    :cond_18
    return v0
.end method

.method public final getAverageEncodeTime()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    return v0
.end method

.method public final getBandwidthLimitedResolution()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    return v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    return v0
.end method

.method public final getBitrateTarget()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    return v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    return-wide v0
.end method

.method public final getCodec()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final getCpuLimitedResolution()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    return v0
.end method

.method public final getEncodeUsage()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    return v0
.end method

.method public final getEncoderImplementationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    return-wide v0
.end method

.method public final getFractionLost()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    return v0
.end method

.method public final getFrameRateEncode()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    return v0
.end method

.method public final getFrameRateInput()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    return v0
.end method

.method public final getFramesEncoded()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    return-wide v0
.end method

.method public final getFramesSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    return-wide v0
.end method

.method public final getNackCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    return-wide v0
.end method

.method public final getPacketsLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    return v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    return-wide v0
.end method

.method public final getPliCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    return-wide v0
.end method

.method public final getQpSum()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    return-wide v0
.end method

.method public final getResolution()Lco/discord/media_engine/Resolution;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    return-object v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v1}, Lco/discord/media_engine/StatsCodec;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-virtual {v1}, Lco/discord/media_engine/Resolution;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutboundRtpVideo(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->packetsLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", fractionLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->fractionLost:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitrateTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bitrateTarget:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", encodeUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encodeUsage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", encoderImplementationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", averageEncodeTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->averageEncodeTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", framesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", framesEncoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->framesEncoded:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", frameRateInput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateInput:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRateEncode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->frameRateEncode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->firCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nackCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->nackCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pliCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->pliCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", qpSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->qpSum:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", bandwidthLimitedResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->bandwidthLimitedResolution:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cpuLimitedResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/OutboundRtpVideo;->cpuLimitedResolution:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
