.class public final Lco/discord/media_engine/internal/OutboundVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u00082\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u00bf\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000c\u001a\u00060\u0005j\u0002`\u0008\u0012\n\u0010\r\u001a\u00060\u0005j\u0002`\u0008\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011\u0012\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0008\u0012\n\u0010\u0013\u001a\u00060\u0005j\u0002`\u0008\u0012\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0008\u0012\n\u0010\u0015\u001a\u00060\u0005j\u0002`\u0008\u0012\n\u0010\u0016\u001a\u00060\u0010j\u0002`\u0017\u0012\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0002\u0010\u001dJ\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\r\u00106\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u00107\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u00108\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u00109\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u0010:\u001a\u00060\u0010j\u0002`\u0017H\u00c6\u0003J\u0014\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u00c6\u0003\u00a2\u0006\u0002\u00101J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\r\u0010=\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u0010>\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010?\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\r\u0010B\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\r\u0010C\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\r\u0010E\u001a\u00060\u0010j\u0002`\u0011H\u00c6\u0003J\u00ea\u0001\u0010F\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000c\u0008\u0002\u0010\u000c\u001a\u00060\u0005j\u0002`\u00082\u000c\u0008\u0002\u0010\r\u001a\u00060\u0005j\u0002`\u00082\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u000f\u001a\u00060\u0010j\u0002`\u00112\u000c\u0008\u0002\u0010\u0012\u001a\u00060\u0005j\u0002`\u00082\u000c\u0008\u0002\u0010\u0013\u001a\u00060\u0005j\u0002`\u00082\u000c\u0008\u0002\u0010\u0014\u001a\u00060\u0005j\u0002`\u00082\u000c\u0008\u0002\u0010\u0015\u001a\u00060\u0005j\u0002`\u00082\u000c\u0008\u0002\u0010\u0016\u001a\u00060\u0010j\u0002`\u00172\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\n2\u000c\u0008\u0002\u0010\u001c\u001a\u00060\u0005j\u0002`\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\n2\u0008\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\u0005H\u00d6\u0001J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010!R\u0015\u0010\u000c\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001fR\u0015\u0010\r\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010#R\u0015\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0015\u0010\u0012\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u001fR\u0015\u0010\u0013\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u001fR\u0015\u0010\u0014\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u001fR\u0015\u0010\u0015\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001fR\u0015\u0010\u0016\u001a\u00060\u0010j\u0002`\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010*R\u0019\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\u00080\u00101R\u0011\u0010\u001b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010!R\u0015\u0010\u001c\u001a\u00060\u0005j\u0002`\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\u001f\u00a8\u0006L"
    }
    d2 = {
        "Lco/discord/media_engine/internal/OutboundVideo;",
        "",
        "codecName",
        "",
        "codecPayloadType",
        "",
        "Lco/discord/media_engine/internal/U8;",
        "avgEncodeTime",
        "Lco/discord/media_engine/internal/I32;",
        "bwLimitedResolution",
        "",
        "cpuLimitedResolution",
        "encodeFrameRate",
        "encodeUsage",
        "encoderImplementationName",
        "framesEncoded",
        "",
        "Lco/discord/media_engine/internal/U32;",
        "inputFrameRate",
        "mediaBitrate",
        "numberOfCPUAdaptChanges",
        "numberOfQualityAdaptChanges",
        "qpSum",
        "Lco/discord/media_engine/internal/I64;",
        "substreams",
        "",
        "Lco/discord/media_engine/internal/Substream;",
        "suspended",
        "targetMediaBitrate",
        "(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)V",
        "getAvgEncodeTime",
        "()I",
        "getBwLimitedResolution",
        "()Z",
        "getCodecName",
        "()Ljava/lang/String;",
        "getCodecPayloadType",
        "getCpuLimitedResolution",
        "getEncodeFrameRate",
        "getEncodeUsage",
        "getEncoderImplementationName",
        "getFramesEncoded",
        "()J",
        "getInputFrameRate",
        "getMediaBitrate",
        "getNumberOfCPUAdaptChanges",
        "getNumberOfQualityAdaptChanges",
        "getQpSum",
        "getSubstreams",
        "()[Lco/discord/media_engine/internal/Substream;",
        "[Lco/discord/media_engine/internal/Substream;",
        "getSuspended",
        "getTargetMediaBitrate",
        "component1",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)Lco/discord/media_engine/internal/OutboundVideo;",
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
.field private final avgEncodeTime:I

.field private final bwLimitedResolution:Z

.field private final codecName:Ljava/lang/String;

.field private final codecPayloadType:I

.field private final cpuLimitedResolution:Z

.field private final encodeFrameRate:I

.field private final encodeUsage:I

.field private final encoderImplementationName:Ljava/lang/String;

.field private final framesEncoded:J

.field private final inputFrameRate:I

.field private final mediaBitrate:I

.field private final numberOfCPUAdaptChanges:I

.field private final numberOfQualityAdaptChanges:I

.field private final qpSum:J

.field private final substreams:[Lco/discord/media_engine/internal/Substream;

.field private final suspended:Z

.field private final targetMediaBitrate:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p8

    move-object/from16 v3, p17

    const-string v4, "codecName"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "encoderImplementationName"

    invoke-static {p8, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "substreams"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    move v1, p2

    .line 3
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    move v1, p3

    .line 4
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    move v1, p4

    .line 5
    iput-boolean v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    move v1, p5

    .line 6
    iput-boolean v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    move v1, p6

    .line 7
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    move v1, p7

    .line 8
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    .line 9
    iput-object v2, v0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    move-wide v1, p9

    .line 10
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    move/from16 v1, p11

    .line 11
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    move/from16 v1, p12

    .line 12
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    move/from16 v1, p13

    .line 13
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    move/from16 v1, p14

    .line 14
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    move-wide/from16 v1, p15

    .line 15
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    .line 16
    iput-object v3, v0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    move/from16 v1, p18

    .line 17
    iput-boolean v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    move/from16 v1, p19

    .line 18
    iput v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/OutboundVideo;Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZIILjava/lang/Object;)Lco/discord/media_engine/internal/OutboundVideo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget v12, v0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget v13, v0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    goto :goto_a

    :cond_a
    move/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget v14, v0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    goto :goto_c

    :cond_c
    move/from16 v15, p14

    :goto_c
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x2000

    move/from16 p13, v14

    if-eqz v15, :cond_d

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    goto :goto_d

    :cond_d
    move-wide/from16 v14, p15

    :goto_d
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_e

    iget-object v14, v0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    goto :goto_e

    :cond_e
    move-object/from16 v14, p17

    :goto_e
    const v15, 0x8000

    and-int/2addr v15, v1

    if-eqz v15, :cond_f

    iget-boolean v15, v0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    goto :goto_f

    :cond_f
    move/from16 v15, p18

    :goto_f
    const/high16 v16, 0x10000

    and-int v1, v1, v16

    if-eqz v1, :cond_10

    iget v1, v0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    goto :goto_10

    :cond_10
    move/from16 v1, p19

    :goto_10
    move-object/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    move/from16 p11, v12

    move/from16 p12, v13

    move-object/from16 p17, v14

    move/from16 p18, v15

    move/from16 p19, v1

    invoke-virtual/range {p0 .. p19}, Lco/discord/media_engine/internal/OutboundVideo;->copy(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)Lco/discord/media_engine/internal/OutboundVideo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    return v0
.end method

.method public final component14()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    return-wide v0
.end method

.method public final component15()[Lco/discord/media_engine/internal/Substream;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    return-object v0
.end method

.method public final component16()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)Lco/discord/media_engine/internal/OutboundVideo;
    .locals 22

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move-wide/from16 v15, p15

    move-object/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    const-string v0, "codecName"

    move-object/from16 v20, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoderImplementationName"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "substreams"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v21, Lco/discord/media_engine/internal/OutboundVideo;

    move-object/from16 v0, v21

    move-object/from16 v1, v20

    invoke-direct/range {v0 .. v19}, Lco/discord/media_engine/internal/OutboundVideo;-><init>(Ljava/lang/String;IIZZIILjava/lang/String;JIIIIJ[Lco/discord/media_engine/internal/Substream;ZI)V

    return-object v21
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/OutboundVideo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/OutboundVideo;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    iget p1, p1, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    if-eq v1, p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getAvgEncodeTime()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    return v0
.end method

.method public final getBwLimitedResolution()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    return v0
.end method

.method public final getCodecName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCodecPayloadType()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    return v0
.end method

.method public final getCpuLimitedResolution()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    return v0
.end method

.method public final getEncodeFrameRate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    return v0
.end method

.method public final getEncodeUsage()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    return v0
.end method

.method public final getEncoderImplementationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFramesEncoded()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    return-wide v0
.end method

.method public final getInputFrameRate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    return v0
.end method

.method public final getMediaBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    return v0
.end method

.method public final getNumberOfCPUAdaptChanges()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    return v0
.end method

.method public final getNumberOfQualityAdaptChanges()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    return v0
.end method

.method public final getQpSum()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    return-wide v0
.end method

.method public final getSubstreams()[Lco/discord/media_engine/internal/Substream;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    return-object v0
.end method

.method public final getSuspended()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    return v0
.end method

.method public final getTargetMediaBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    return v0
.end method

.method public hashCode()I
    .locals 5

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    invoke-static {v3, v4}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutboundVideo(codecName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codecPayloadType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->codecPayloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", avgEncodeTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->avgEncodeTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bwLimitedResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->bwLimitedResolution:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cpuLimitedResolution="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->cpuLimitedResolution:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", encodeFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", encodeUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encodeUsage:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", encoderImplementationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->encoderImplementationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", framesEncoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->framesEncoded:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", inputFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->inputFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mediaBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->mediaBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", numberOfCPUAdaptChanges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfCPUAdaptChanges:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", numberOfQualityAdaptChanges="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->numberOfQualityAdaptChanges:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", qpSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->qpSum:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", substreams="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->substreams:[Lco/discord/media_engine/internal/Substream;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", suspended="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->suspended:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", targetMediaBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundVideo;->targetMediaBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
