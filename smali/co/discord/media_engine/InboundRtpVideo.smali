.class public final Lco/discord/media_engine/InboundRtpVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010\u0006\n\u0002\u0008=\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00db\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\"\u00a2\u0006\u0002\u0010#J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u000bH\u00c6\u0003J\t\u0010G\u001a\u00020\u000bH\u00c6\u0003J\t\u0010H\u001a\u00020\u000bH\u00c6\u0003J\t\u0010I\u001a\u00020\u000bH\u00c6\u0003J\t\u0010J\u001a\u00020\u000bH\u00c6\u0003J\t\u0010K\u001a\u00020\u000bH\u00c6\u0003J\t\u0010L\u001a\u00020\u0005H\u00c6\u0003J\t\u0010M\u001a\u00020\u0005H\u00c6\u0003J\t\u0010N\u001a\u00020\u0005H\u00c6\u0003J\r\u0010O\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0005H\u00c6\u0003J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\t\u0010V\u001a\u00020\"H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Z\u001a\u00020\u000bH\u00c6\u0003J\t\u0010[\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\\\u001a\u00020\u000bH\u00c6\u0003J\t\u0010]\u001a\u00020\u0010H\u00c6\u0003J\u0093\u0002\u0010^\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00052\u0008\u0008\u0002\u0010 \u001a\u00020\u00052\u0008\u0008\u0002\u0010!\u001a\u00020\"H\u00c6\u0001J\u0013\u0010_\u001a\u00020`2\u0008\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\u000bH\u00d6\u0001J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010%R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010(R\u0011\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010%R\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010%R\u0011\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010%R\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010%R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010%R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010%R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010(R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010(R\u0011\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010%R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010%R\u0011\u0010\u001d\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010(R\u0011\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010(R\u0011\u0010\u001b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010(R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010(R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0011\u0010 \u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010(R\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010(R\u0011\u0010\u001f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010,\u00a8\u0006d"
    }
    d2 = {
        "Lco/discord/media_engine/InboundRtpVideo;",
        "",
        "type",
        "",
        "ssrc",
        "",
        "Lco/discord/media_engine/U32;",
        "codec",
        "Lco/discord/media_engine/StatsCodec;",
        "bytesReceived",
        "packetsReceived",
        "",
        "packetsLost",
        "bitrate",
        "averageDecodeTime",
        "resolution",
        "Lco/discord/media_engine/Resolution;",
        "decoderImplementationName",
        "framesDecoded",
        "framesDropped",
        "framesReceived",
        "frameRateDecode",
        "frameRateNetwork",
        "frameRateRender",
        "firCount",
        "nackCount",
        "pliCount",
        "qpSum",
        "freezeCount",
        "pauseCount",
        "totalFreezesDuration",
        "totalPausesDuration",
        "totalFramesDuration",
        "sumOfSquaredFramesDurations",
        "",
        "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)V",
        "getAverageDecodeTime",
        "()I",
        "getBitrate",
        "getBytesReceived",
        "()J",
        "getCodec",
        "()Lco/discord/media_engine/StatsCodec;",
        "getDecoderImplementationName",
        "()Ljava/lang/String;",
        "getFirCount",
        "getFrameRateDecode",
        "getFrameRateNetwork",
        "getFrameRateRender",
        "getFramesDecoded",
        "getFramesDropped",
        "getFramesReceived",
        "getFreezeCount",
        "getNackCount",
        "getPacketsLost",
        "getPacketsReceived",
        "getPauseCount",
        "getPliCount",
        "getQpSum",
        "getResolution",
        "()Lco/discord/media_engine/Resolution;",
        "getSsrc",
        "getSumOfSquaredFramesDurations",
        "()D",
        "getTotalFramesDuration",
        "getTotalFreezesDuration",
        "getTotalPausesDuration",
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
        "component24",
        "component25",
        "component26",
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
.field private final averageDecodeTime:I

.field private final bitrate:I

.field private final bytesReceived:J

.field private final codec:Lco/discord/media_engine/StatsCodec;

.field private final decoderImplementationName:Ljava/lang/String;

.field private final firCount:J

.field private final frameRateDecode:I

.field private final frameRateNetwork:I

.field private final frameRateRender:I

.field private final framesDecoded:I

.field private final framesDropped:I

.field private final framesReceived:I

.field private final freezeCount:J

.field private final nackCount:J

.field private final packetsLost:I

.field private final packetsReceived:I

.field private final pauseCount:J

.field private final pliCount:J

.field private final qpSum:J

.field private final resolution:Lco/discord/media_engine/Resolution;

.field private final ssrc:J

.field private final sumOfSquaredFramesDurations:D

.field private final totalFramesDuration:J

.field private final totalFreezesDuration:J

.field private final totalPausesDuration:J

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p11

    move-object/from16 v3, p12

    const-string v4, "type"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "resolution"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "decoderImplementationName"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    move-wide v4, p2

    .line 3
    iput-wide v4, v0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    move-object v1, p4

    .line 4
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    move-wide v4, p5

    .line 5
    iput-wide v4, v0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    move v1, p7

    .line 6
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    move v1, p8

    .line 7
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    move v1, p9

    .line 8
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    move/from16 v1, p10

    .line 9
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    .line 10
    iput-object v2, v0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    .line 11
    iput-object v3, v0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    move/from16 v1, p13

    .line 12
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    move/from16 v1, p14

    .line 13
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    move/from16 v1, p15

    .line 14
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    move/from16 v1, p16

    .line 15
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    move/from16 v1, p17

    .line 16
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    move/from16 v1, p18

    .line 17
    iput v1, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    move-wide/from16 v1, p19

    .line 18
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    move-wide/from16 v1, p21

    .line 19
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    move-wide/from16 v1, p23

    .line 20
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    move-wide/from16 v1, p25

    .line 21
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    move-wide/from16 v1, p27

    .line 22
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    move-wide/from16 v1, p29

    .line 23
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    move-wide/from16 v1, p31

    .line 24
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    move-wide/from16 v1, p33

    .line 25
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    move-wide/from16 v1, p35

    .line 26
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    move-wide/from16 v1, p37

    .line 27
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/InboundRtpVideo;Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJDILjava/lang/Object;)Lco/discord/media_engine/InboundRtpVideo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p39

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget v8, v0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget v11, v0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget-object v12, v0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget-object v13, v0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget v14, v0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    goto :goto_c

    :cond_c
    move/from16 v15, p15

    :goto_c
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    goto :goto_d

    :cond_d
    move/from16 v15, p16

    :goto_d
    move/from16 p16, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    goto :goto_e

    :cond_e
    move/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p17, v15

    if-eqz v16, :cond_f

    iget v15, v0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    goto :goto_f

    :cond_f
    move/from16 v15, p18

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p13, v14

    move/from16 p18, v15

    if-eqz v16, :cond_10

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    goto :goto_10

    :cond_10
    move-wide/from16 v14, p19

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-wide/from16 p19, v14

    if-eqz v16, :cond_11

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    goto :goto_11

    :cond_11
    move-wide/from16 v14, p21

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-wide/from16 p21, v14

    if-eqz v16, :cond_12

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    goto :goto_12

    :cond_12
    move-wide/from16 v14, p23

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-wide/from16 p23, v14

    if-eqz v16, :cond_13

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    goto :goto_13

    :cond_13
    move-wide/from16 v14, p25

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-wide/from16 p25, v14

    if-eqz v16, :cond_14

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    goto :goto_14

    :cond_14
    move-wide/from16 v14, p27

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-wide/from16 p27, v14

    if-eqz v16, :cond_15

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    goto :goto_15

    :cond_15
    move-wide/from16 v14, p29

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-wide/from16 p29, v14

    if-eqz v16, :cond_16

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    goto :goto_16

    :cond_16
    move-wide/from16 v14, p31

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-wide/from16 p31, v14

    if-eqz v16, :cond_17

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    goto :goto_17

    :cond_17
    move-wide/from16 v14, p33

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-wide/from16 p33, v14

    if-eqz v16, :cond_18

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    goto :goto_18

    :cond_18
    move-wide/from16 v14, p35

    :goto_18
    const/high16 v16, 0x2000000

    and-int v1, v1, v16

    move-wide/from16 p35, v14

    if-eqz v1, :cond_19

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    goto :goto_19

    :cond_19
    move-wide/from16 v14, p37

    :goto_19
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-wide/from16 p37, v14

    invoke-virtual/range {p0 .. p38}, Lco/discord/media_engine/InboundRtpVideo;->copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)Lco/discord/media_engine/InboundRtpVideo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    return v0
.end method

.method public final component17()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    return-wide v0
.end method

.method public final component18()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    return-wide v0
.end method

.method public final component19()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    return-wide v0
.end method

.method public final component20()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    return-wide v0
.end method

.method public final component21()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    return-wide v0
.end method

.method public final component22()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    return-wide v0
.end method

.method public final component23()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    return-wide v0
.end method

.method public final component24()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    return-wide v0
.end method

.method public final component25()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    return-wide v0
.end method

.method public final component26()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    return-wide v0
.end method

.method public final component3()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    return v0
.end method

.method public final component9()Lco/discord/media_engine/Resolution;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)Lco/discord/media_engine/InboundRtpVideo;
    .locals 41

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-wide/from16 v19, p19

    move-wide/from16 v21, p21

    move-wide/from16 v23, p23

    move-wide/from16 v25, p25

    move-wide/from16 v27, p27

    move-wide/from16 v29, p29

    move-wide/from16 v31, p31

    move-wide/from16 v33, p33

    move-wide/from16 v35, p35

    move-wide/from16 v37, p37

    const-string v0, "type"

    move-object/from16 v39, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolution"

    move-object/from16 v1, p11

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decoderImplementationName"

    move-object/from16 v1, p12

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v40, Lco/discord/media_engine/InboundRtpVideo;

    move-object/from16 v0, v40

    move-object/from16 v1, v39

    invoke-direct/range {v0 .. v38}, Lco/discord/media_engine/InboundRtpVideo;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JIIIILco/discord/media_engine/Resolution;Ljava/lang/String;IIIIIIJJJJJJJJJD)V

    return-object v40
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/InboundRtpVideo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/InboundRtpVideo;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_19

    return v2

    :cond_19
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1a

    return v2

    :cond_1a
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final getAverageDecodeTime()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    return v0
.end method

.method public final getBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    return v0
.end method

.method public final getBytesReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    return-wide v0
.end method

.method public final getCodec()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final getDecoderImplementationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFirCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    return-wide v0
.end method

.method public final getFrameRateDecode()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    return v0
.end method

.method public final getFrameRateNetwork()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    return v0
.end method

.method public final getFrameRateRender()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    return v0
.end method

.method public final getFramesDecoded()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    return v0
.end method

.method public final getFramesDropped()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    return v0
.end method

.method public final getFramesReceived()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    return v0
.end method

.method public final getFreezeCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    return-wide v0
.end method

.method public final getNackCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    return-wide v0
.end method

.method public final getPacketsLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    return v0
.end method

.method public final getPacketsReceived()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    return v0
.end method

.method public final getPauseCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    return-wide v0
.end method

.method public final getPliCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    return-wide v0
.end method

.method public final getQpSum()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    return-wide v0
.end method

.method public final getResolution()Lco/discord/media_engine/Resolution;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    return-object v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    return-wide v0
.end method

.method public final getSumOfSquaredFramesDurations()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    return-wide v0
.end method

.method public final getTotalFramesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    return-wide v0
.end method

.method public final getTotalFreezesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    return-wide v0
.end method

.method public final getTotalPausesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/discord/media_engine/StatsCodec;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-virtual {v1}, Lco/discord/media_engine/Resolution;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundRtpVideo(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->bytesReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsReceived:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->packetsLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->bitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", averageDecodeTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->averageDecodeTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->resolution:Lco/discord/media_engine/Resolution;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoderImplementationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", framesDecoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDecoded:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", framesDropped="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesDropped:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", framesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->framesReceived:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRateDecode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateDecode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRateNetwork="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateNetwork:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frameRateRender="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpVideo;->frameRateRender:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", firCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->firCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", nackCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->nackCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pliCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->pliCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", qpSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->qpSum:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", freezeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->freezeCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pauseCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->pauseCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalFreezesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFreezesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalPausesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalPausesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalFramesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->totalFramesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sumOfSquaredFramesDurations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpVideo;->sumOfSquaredFramesDurations:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
