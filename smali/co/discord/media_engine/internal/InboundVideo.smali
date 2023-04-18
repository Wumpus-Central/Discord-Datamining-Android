.class public final Lco/discord/media_engine/internal/InboundVideo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0008K\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u00e5\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0008\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\n\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0015\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0017\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u0019\u0012\n\u0010\u001a\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u001b\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\n\u0010 \u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\n\u0010%\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010&\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\'\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010(\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010)\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010*\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010+\u001a\u00060,j\u0002`-\u00a2\u0006\u0002\u0010.J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\r\u0010X\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010Y\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010Z\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010[\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010\\\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010]\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010^\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010_\u001a\u00060\u000fj\u0002`\u0019H\u00c6\u0003J\r\u0010`\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010a\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010b\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\t\u0010c\u001a\u00020\u001dH\u00c6\u0003J\t\u0010d\u001a\u00020\u001fH\u00c6\u0003J\r\u0010e\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\t\u0010f\u001a\u00020\"H\u00c6\u0003J\t\u0010g\u001a\u00020\"H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\r\u0010i\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010j\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010k\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010l\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010m\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010n\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010o\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010p\u001a\u00060,j\u0002`-H\u00c6\u0003J\r\u0010q\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010r\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\r\u0010s\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\rH\u00c6\u0003J\r\u0010v\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\u00a9\u0003\u0010w\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0008\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\n\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u000c\u0008\u0002\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u0012\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0013\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0014\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0015\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0016\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0017\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u0018\u001a\u00060\u000fj\u0002`\u00192\u000c\u0008\u0002\u0010\u001a\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010\u001b\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001f2\u000c\u0008\u0002\u0010 \u001a\u00060\u000fj\u0002`\u00102\u0008\u0008\u0002\u0010!\u001a\u00020\"2\u0008\u0008\u0002\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010$\u001a\u00020\u00052\u000c\u0008\u0002\u0010%\u001a\u00060\u0005j\u0002`\u00062\u000c\u0008\u0002\u0010&\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\'\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010(\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010)\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010*\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010+\u001a\u00060,j\u0002`-H\u00c6\u0001J\u0013\u0010x\u001a\u00020y2\u0008\u0010z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010{\u001a\u00020\u0005H\u00d6\u0001J\t\u0010|\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00102R\u0015\u0010\u0008\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00102R\u0015\u0010\n\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00102R\u0015\u0010\t\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00102R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00100R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0015\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0015\u0010\u0012\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00102R\u0015\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u0010;R\u0015\u0010&\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010;R\u0015\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u00102R\u0015\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u00102R\u0015\u0010\u0015\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00102R\u0015\u0010\u0016\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u00102R\u0015\u0010\u0017\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u00102R\u0015\u0010\'\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010;R\u0015\u0010\u0018\u001a\u00060\u000fj\u0002`\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010;R\u0015\u0010\u001a\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u00102R\u0015\u0010\u001b\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u00102R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008H\u0010IR\u0011\u0010\u001e\u001a\u00020\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u0010KR\u0015\u0010 \u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010;R\u0015\u0010+\u001a\u00060,j\u0002`-\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u0010NR\u0011\u0010!\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008O\u0010PR\u0011\u0010#\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Q\u0010PR\u0011\u0010$\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008R\u00102R\u0015\u0010*\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010;R\u0015\u0010(\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008T\u0010;R\u0015\u0010)\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010;R\u0015\u0010%\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008V\u00102\u00a8\u0006}"
    }
    d2 = {
        "Lco/discord/media_engine/internal/InboundVideo;",
        "",
        "codecName",
        "",
        "codecPayloadType",
        "",
        "Lco/discord/media_engine/internal/I32;",
        "currentDelay",
        "currentPayloadType",
        "decodeFrameRate",
        "decode",
        "decoderImplementationName",
        "frameCounts",
        "Lco/discord/media_engine/internal/FrameCounts;",
        "framesDecoded",
        "",
        "Lco/discord/media_engine/internal/U32;",
        "framesRendered",
        "framesDropped",
        "height",
        "jitterBuffer",
        "maxDecode",
        "minPlayoutDelay",
        "networkFrameRate",
        "qpSum",
        "Lco/discord/media_engine/internal/I64;",
        "renderDelay",
        "renderFrameRate",
        "rtcpStats",
        "Lco/discord/media_engine/internal/InboundRtcpStats;",
        "rtpStats",
        "Lco/discord/media_engine/internal/InboundRtpStats;",
        "ssrc",
        "syncOffset",
        "",
        "targetDelay",
        "totalBitrate",
        "width",
        "freezeCount",
        "pauseCount",
        "totalFreezesDuration",
        "totalPausesDuration",
        "totalFramesDuration",
        "sumOfSquaredFramesDurations",
        "",
        "Lco/discord/media_engine/internal/F64;",
        "(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)V",
        "getCodecName",
        "()Ljava/lang/String;",
        "getCodecPayloadType",
        "()I",
        "getCurrentDelay",
        "getCurrentPayloadType",
        "getDecode",
        "getDecodeFrameRate",
        "getDecoderImplementationName",
        "getFrameCounts",
        "()Lco/discord/media_engine/internal/FrameCounts;",
        "getFramesDecoded",
        "()J",
        "getFramesDropped",
        "getFramesRendered",
        "getFreezeCount",
        "getHeight",
        "getJitterBuffer",
        "getMaxDecode",
        "getMinPlayoutDelay",
        "getNetworkFrameRate",
        "getPauseCount",
        "getQpSum",
        "getRenderDelay",
        "getRenderFrameRate",
        "getRtcpStats",
        "()Lco/discord/media_engine/internal/InboundRtcpStats;",
        "getRtpStats",
        "()Lco/discord/media_engine/internal/InboundRtpStats;",
        "getSsrc",
        "getSumOfSquaredFramesDurations",
        "()D",
        "getSyncOffset",
        "()F",
        "getTargetDelay",
        "getTotalBitrate",
        "getTotalFramesDuration",
        "getTotalFreezesDuration",
        "getTotalPausesDuration",
        "getWidth",
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
        "component27",
        "component28",
        "component29",
        "component3",
        "component30",
        "component31",
        "component32",
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
.field private final codecName:Ljava/lang/String;

.field private final codecPayloadType:I

.field private final currentDelay:I

.field private final currentPayloadType:I

.field private final decode:I

.field private final decodeFrameRate:I

.field private final decoderImplementationName:Ljava/lang/String;

.field private final frameCounts:Lco/discord/media_engine/internal/FrameCounts;

.field private final framesDecoded:J

.field private final framesDropped:I

.field private final framesRendered:J

.field private final freezeCount:J

.field private final height:I

.field private final jitterBuffer:I

.field private final maxDecode:I

.field private final minPlayoutDelay:I

.field private final networkFrameRate:I

.field private final pauseCount:J

.field private final qpSum:J

.field private final renderDelay:I

.field private final renderFrameRate:I

.field private final rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

.field private final rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

.field private final ssrc:J

.field private final sumOfSquaredFramesDurations:D

.field private final syncOffset:F

.field private final targetDelay:F

.field private final totalBitrate:I

.field private final totalFramesDuration:J

.field private final totalFreezesDuration:J

.field private final totalPausesDuration:J

.field private final width:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p7

    move-object v3, p8

    move-object/from16 v4, p23

    move-object/from16 v5, p24

    const-string v6, "codecName"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "decoderImplementationName"

    invoke-static {p7, v6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "frameCounts"

    invoke-static {p8, v6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "rtcpStats"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "rtpStats"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    move v1, p2

    .line 3
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    move v1, p3

    .line 4
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    move v1, p4

    .line 5
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    move v1, p5

    .line 6
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    move v1, p6

    .line 7
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    .line 8
    iput-object v2, v0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    .line 9
    iput-object v3, v0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    move-wide/from16 v1, p9

    .line 10
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    move-wide/from16 v1, p11

    .line 11
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    move/from16 v1, p13

    .line 12
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    move/from16 v1, p14

    .line 13
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    move/from16 v1, p15

    .line 14
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    move/from16 v1, p16

    .line 15
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    move/from16 v1, p17

    .line 16
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    move/from16 v1, p18

    .line 17
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    move-wide/from16 v1, p19

    .line 18
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    move/from16 v1, p21

    .line 19
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    move/from16 v1, p22

    .line 20
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    .line 21
    iput-object v4, v0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    .line 22
    iput-object v5, v0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    move-wide/from16 v1, p25

    .line 23
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    move/from16 v1, p27

    .line 24
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    move/from16 v1, p28

    .line 25
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    move/from16 v1, p29

    .line 26
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    move/from16 v1, p30

    .line 27
    iput v1, v0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    move-wide/from16 v1, p31

    .line 28
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    move-wide/from16 v1, p33

    .line 29
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    move-wide/from16 v1, p35

    .line 30
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    move-wide/from16 v1, p37

    .line 31
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    move-wide/from16 v1, p39

    .line 32
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    move-wide/from16 v1, p41

    .line 33
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/InboundVideo;Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJDILjava/lang/Object;)Lco/discord/media_engine/internal/InboundVideo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p43

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget v4, v0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-wide v12, v0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    goto :goto_9

    :cond_9
    move-wide/from16 v12, p11

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget v14, v0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    goto :goto_a

    :cond_a
    move/from16 v14, p13

    :goto_a
    and-int/lit16 v15, v1, 0x800

    if-eqz v15, :cond_b

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    goto :goto_b

    :cond_b
    move/from16 v15, p14

    :goto_b
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    goto :goto_c

    :cond_c
    move/from16 v15, p15

    :goto_c
    move/from16 p15, v15

    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    goto :goto_d

    :cond_d
    move/from16 v15, p16

    :goto_d
    move/from16 p16, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    goto :goto_e

    :cond_e
    move/from16 v15, p17

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p17, v15

    if-eqz v16, :cond_f

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    goto :goto_f

    :cond_f
    move/from16 v15, p18

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p13, v14

    move/from16 p18, v15

    if-eqz v16, :cond_10

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    goto :goto_10

    :cond_10
    move-wide/from16 v14, p19

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-wide/from16 p19, v14

    if-eqz v16, :cond_11

    iget v14, v0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    goto :goto_11

    :cond_11
    move/from16 v14, p21

    :goto_11
    const/high16 v15, 0x40000

    and-int/2addr v15, v1

    if-eqz v15, :cond_12

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    goto :goto_12

    :cond_12
    move/from16 v15, p22

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move/from16 p22, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p23

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p23, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p24

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move/from16 p21, v14

    move-object/from16 p24, v15

    if-eqz v16, :cond_15

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    goto :goto_15

    :cond_15
    move-wide/from16 v14, p25

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-wide/from16 p25, v14

    if-eqz v16, :cond_16

    iget v14, v0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    goto :goto_16

    :cond_16
    move/from16 v14, p27

    :goto_16
    const/high16 v15, 0x800000

    and-int/2addr v15, v1

    if-eqz v15, :cond_17

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    goto :goto_17

    :cond_17
    move/from16 v15, p28

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move/from16 p28, v15

    if-eqz v16, :cond_18

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    goto :goto_18

    :cond_18
    move/from16 v15, p29

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move/from16 p29, v15

    if-eqz v16, :cond_19

    iget v15, v0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    goto :goto_19

    :cond_19
    move/from16 v15, p30

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move/from16 p27, v14

    move/from16 p30, v15

    if-eqz v16, :cond_1a

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    goto :goto_1a

    :cond_1a
    move-wide/from16 v14, p31

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, v1, v16

    move-wide/from16 p31, v14

    if-eqz v16, :cond_1b

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    goto :goto_1b

    :cond_1b
    move-wide/from16 v14, p33

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, v1, v16

    move-wide/from16 p33, v14

    if-eqz v16, :cond_1c

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    goto :goto_1c

    :cond_1c
    move-wide/from16 v14, p35

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v16, v1, v16

    move-wide/from16 p35, v14

    if-eqz v16, :cond_1d

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    goto :goto_1d

    :cond_1d
    move-wide/from16 v14, p37

    :goto_1d
    const/high16 v16, 0x40000000    # 2.0f

    and-int v16, v1, v16

    move-wide/from16 p37, v14

    if-eqz v16, :cond_1e

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    goto :goto_1e

    :cond_1e
    move-wide/from16 v14, p39

    :goto_1e
    const/high16 v16, -0x80000000

    and-int v1, v1, v16

    move-wide/from16 p39, v14

    if-eqz v1, :cond_1f

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    goto :goto_1f

    :cond_1f
    move-wide/from16 v14, p41

    :goto_1f
    move-object/from16 p1, v2

    move/from16 p2, v3

    move/from16 p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-wide/from16 p9, v10

    move-wide/from16 p11, v12

    move-wide/from16 p41, v14

    invoke-virtual/range {p0 .. p42}, Lco/discord/media_engine/internal/InboundVideo;->copy(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)Lco/discord/media_engine/internal/InboundVideo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    return-wide v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    return v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    return v0
.end method

.method public final component17()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    return-wide v0
.end method

.method public final component18()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    return v0
.end method

.method public final component19()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    return v0
.end method

.method public final component20()Lco/discord/media_engine/internal/InboundRtcpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    return-object v0
.end method

.method public final component21()Lco/discord/media_engine/internal/InboundRtpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    return-object v0
.end method

.method public final component22()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    return-wide v0
.end method

.method public final component23()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    return v0
.end method

.method public final component24()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    return v0
.end method

.method public final component26()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    return v0
.end method

.method public final component27()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    return-wide v0
.end method

.method public final component28()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    return-wide v0
.end method

.method public final component29()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    return v0
.end method

.method public final component30()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    return-wide v0
.end method

.method public final component31()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    return-wide v0
.end method

.method public final component32()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lco/discord/media_engine/internal/FrameCounts;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    return-object v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)Lco/discord/media_engine/internal/InboundVideo;
    .locals 45

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    move/from16 v18, p18

    move-wide/from16 v19, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v23, p23

    move-object/from16 v24, p24

    move-wide/from16 v25, p25

    move/from16 v27, p27

    move/from16 v28, p28

    move/from16 v29, p29

    move/from16 v30, p30

    move-wide/from16 v31, p31

    move-wide/from16 v33, p33

    move-wide/from16 v35, p35

    move-wide/from16 v37, p37

    move-wide/from16 v39, p39

    move-wide/from16 v41, p41

    const-string v0, "codecName"

    move-object/from16 v43, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "decoderImplementationName"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameCounts"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtcpStats"

    move-object/from16 v1, p23

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rtpStats"

    move-object/from16 v1, p24

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v44, Lco/discord/media_engine/internal/InboundVideo;

    move-object/from16 v0, v44

    move-object/from16 v1, v43

    invoke-direct/range {v0 .. v42}, Lco/discord/media_engine/internal/InboundVideo;-><init>(Ljava/lang/String;IIIIILjava/lang/String;Lco/discord/media_engine/internal/FrameCounts;JJIIIIIIJIILco/discord/media_engine/internal/InboundRtcpStats;Lco/discord/media_engine/internal/InboundRtpStats;JFFIIJJJJJD)V

    return-object v44
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/InboundVideo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/InboundVideo;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->height:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundVideo;->width:I

    if-eq v1, v3, :cond_1b

    return v2

    :cond_1b
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1c

    return v2

    :cond_1c
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1d

    return v2

    :cond_1d
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1e

    return v2

    :cond_1e
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_1f

    return v2

    :cond_1f
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_20

    return v2

    :cond_20
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_21

    return v2

    :cond_21
    return v0
.end method

.method public final getCodecName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCodecPayloadType()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    return v0
.end method

.method public final getCurrentDelay()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    return v0
.end method

.method public final getCurrentPayloadType()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    return v0
.end method

.method public final getDecode()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    return v0
.end method

.method public final getDecodeFrameRate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    return v0
.end method

.method public final getDecoderImplementationName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    return-object v0
.end method

.method public final getFrameCounts()Lco/discord/media_engine/internal/FrameCounts;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    return-object v0
.end method

.method public final getFramesDecoded()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    return-wide v0
.end method

.method public final getFramesDropped()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    return v0
.end method

.method public final getFramesRendered()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    return-wide v0
.end method

.method public final getFreezeCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    return-wide v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    return v0
.end method

.method public final getJitterBuffer()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    return v0
.end method

.method public final getMaxDecode()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    return v0
.end method

.method public final getMinPlayoutDelay()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    return v0
.end method

.method public final getNetworkFrameRate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    return v0
.end method

.method public final getPauseCount()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    return-wide v0
.end method

.method public final getQpSum()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    return-wide v0
.end method

.method public final getRenderDelay()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    return v0
.end method

.method public final getRenderFrameRate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    return v0
.end method

.method public final getRtcpStats()Lco/discord/media_engine/internal/InboundRtcpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    return-object v0
.end method

.method public final getRtpStats()Lco/discord/media_engine/internal/InboundRtpStats;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    return-object v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    return-wide v0
.end method

.method public final getSumOfSquaredFramesDurations()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    return-wide v0
.end method

.method public final getSyncOffset()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    return v0
.end method

.method public final getTargetDelay()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    return v0
.end method

.method public final getTotalBitrate()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    return v0
.end method

.method public final getTotalFramesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    return-wide v0
.end method

.method public final getTotalFreezesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    return-wide v0
.end method

.method public final getTotalPausesDuration()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    return-wide v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/FrameCounts;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/InboundRtcpStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    invoke-virtual {v1}, Lco/discord/media_engine/internal/InboundRtpStats;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundVideo(codecName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->codecName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codecPayloadType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->codecPayloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentDelay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", currentPayloadType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->currentPayloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodeFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decodeFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decoderImplementationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->decoderImplementationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frameCounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->frameCounts:Lco/discord/media_engine/internal/FrameCounts;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", framesDecoded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDecoded:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", framesRendered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesRendered:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", framesDropped="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->framesDropped:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->height:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->jitterBuffer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", maxDecode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->maxDecode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minPlayoutDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->minPlayoutDelay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", networkFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->networkFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", qpSum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->qpSum:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", renderDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderDelay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", renderFrameRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->renderFrameRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", rtcpStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtcpStats:Lco/discord/media_engine/internal/InboundRtcpStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rtpStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundVideo;->rtpStats:Lco/discord/media_engine/internal/InboundRtpStats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", syncOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->syncOffset:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", targetDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->targetDelay:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", totalBitrate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalBitrate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundVideo;->width:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", freezeCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->freezeCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", pauseCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->pauseCount:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalFreezesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFreezesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalPausesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalPausesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", totalFramesDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->totalFramesDuration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", sumOfSquaredFramesDurations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundVideo;->sumOfSquaredFramesDurations:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
