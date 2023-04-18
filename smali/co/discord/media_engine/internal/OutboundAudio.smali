.class public final Lco/discord/media_engine/internal/OutboundAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008H\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u00a1\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0010\n\u001a\u00060\u0003j\u0002`\u000b\u0012\n\u0010\u000c\u001a\u00060\u0003j\u0002`\u000b\u0012\n\u0010\r\u001a\u00060\u0003j\u0002`\u000b\u0012\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014\u0012\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u000b\u0012\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u000b\u0012\n\u0010\u0017\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u0018\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u0019\u001a\u00060\u000fj\u0002`\u0010\u0012\n\u0010\u001a\u001a\u00060\u0006j\u0002`\u001b\u0012\n\u0010\u001c\u001a\u00060\u0006j\u0002`\u001d\u0012\n\u0010\u001e\u001a\u00060\u0006j\u0002`\u001d\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\n\u0010!\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\"\u001a\u00060\u0006j\u0002`\u0007\u0012\u0008\u0010#\u001a\u0004\u0018\u00010 \u0012\u000e\u0010$\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0008\u0010%\u001a\u0004\u0018\u00010 \u0012\u000e\u0010&\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\u0002\u0010\'J\r\u0010J\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010K\u001a\u00060\u0003j\u0002`\u000bH\u00c6\u0003J\r\u0010L\u001a\u00060\u0003j\u0002`\u000bH\u00c6\u0003J\r\u0010M\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010N\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010O\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010P\u001a\u00060\u0006j\u0002`\u001bH\u00c6\u0003J\r\u0010Q\u001a\u00060\u0006j\u0002`\u001dH\u00c6\u0003J\r\u0010R\u001a\u00060\u0006j\u0002`\u001dH\u00c6\u0003J\t\u0010S\u001a\u00020 H\u00c6\u0003J\r\u0010T\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010U\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010V\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0016\u0010X\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u0010\u0010Y\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0002\u0010:J\u0016\u0010Z\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010=J\t\u0010[\u001a\u00020\tH\u00c6\u0003J\r\u0010\\\u001a\u00060\u0003j\u0002`\u000bH\u00c6\u0003J\r\u0010]\u001a\u00060\u0003j\u0002`\u000bH\u00c6\u0003J\r\u0010^\u001a\u00060\u0003j\u0002`\u000bH\u00c6\u0003J\r\u0010_\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010`\u001a\u00060\u000fj\u0002`\u0010H\u00c6\u0003J\r\u0010a\u001a\u00060\u0013j\u0002`\u0014H\u00c6\u0003J\u00da\u0002\u0010b\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000c\u0008\u0002\u0010\n\u001a\u00060\u0003j\u0002`\u000b2\u000c\u0008\u0002\u0010\u000c\u001a\u00060\u0003j\u0002`\u000b2\u000c\u0008\u0002\u0010\r\u001a\u00060\u0003j\u0002`\u000b2\u000c\u0008\u0002\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u0012\u001a\u00060\u0013j\u0002`\u00142\u000c\u0008\u0002\u0010\u0015\u001a\u00060\u0003j\u0002`\u000b2\u000c\u0008\u0002\u0010\u0016\u001a\u00060\u0003j\u0002`\u000b2\u000c\u0008\u0002\u0010\u0017\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u0018\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u0019\u001a\u00060\u000fj\u0002`\u00102\u000c\u0008\u0002\u0010\u001a\u001a\u00060\u0006j\u0002`\u001b2\u000c\u0008\u0002\u0010\u001c\u001a\u00060\u0006j\u0002`\u001d2\u000c\u0008\u0002\u0010\u001e\u001a\u00060\u0006j\u0002`\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u000c\u0008\u0002\u0010!\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\"\u001a\u00060\u0006j\u0002`\u00072\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010 2\u0010\u0008\u0002\u0010$\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010 2\u0010\u0008\u0002\u0010&\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010cJ\u0013\u0010d\u001a\u00020 2\u0008\u0010e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010g\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0015\u0010\n\u001a\u00060\u0003j\u0002`\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010)R\u0015\u0010\u000c\u001a\u00060\u0003j\u0002`\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010)R\u0015\u0010\r\u001a\u00060\u0003j\u0002`\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010)R\u0015\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0015\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00102R\u0015\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0015\u0010!\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010+R\u0015\u0010\"\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010+R\u0015\u0010\u0015\u001a\u00060\u0003j\u0002`\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010)R\u0015\u0010#\u001a\u0004\u0018\u00010 \u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u00089\u0010:R\u001b\u0010$\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\u0008<\u0010=R\u0015\u0010\u0016\u001a\u00060\u0003j\u0002`\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010)R\u0015\u0010\u0017\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010+R\u0015\u0010\u0018\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u00102R\u0015\u0010\u0019\u001a\u00060\u000fj\u0002`\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008B\u00102R\u0015\u0010\u001a\u001a\u00060\u0006j\u0002`\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010+R\u0015\u0010\u001c\u001a\u00060\u0006j\u0002`\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008D\u0010+R\u0015\u0010\u001e\u001a\u00060\u0006j\u0002`\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008E\u0010+R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008F\u0010GR\u0015\u0010%\u001a\u0004\u0018\u00010 \u00a2\u0006\n\n\u0002\u0010;\u001a\u0004\u0008H\u0010:R\u001b\u0010&\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\u0008I\u0010=\u00a8\u0006h"
    }
    d2 = {
        "Lco/discord/media_engine/internal/OutboundAudio;",
        "",
        "audioLevel",
        "",
        "Lco/discord/media_engine/internal/I16;",
        "bytesSent",
        "",
        "Lco/discord/media_engine/internal/U64;",
        "codecName",
        "",
        "codecPayloadType",
        "Lco/discord/media_engine/internal/I32;",
        "delayMedian",
        "delayStd",
        "echoReturnLoss",
        "",
        "Lco/discord/media_engine/internal/F64;",
        "echoReturnLossEnchancement",
        "fractionLost",
        "",
        "Lco/discord/media_engine/internal/F32;",
        "jitter",
        "packetsLost",
        "packetsSent",
        "residualEchoLikelihood",
        "residualEchoLikelihoodRecentMax",
        "rtt",
        "Lco/discord/media_engine/internal/I64;",
        "speaking",
        "Lco/discord/media_engine/internal/U32;",
        "ssrc",
        "typingNoiseDetected",
        "",
        "framesCaptured",
        "framesRendered",
        "noiseCancellerIsEnabled",
        "noiseCancellerProcessTime",
        "voiceActivityDetectorIsEnabled",
        "voiceActivityDetectorProcessTime",
        "(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V",
        "getAudioLevel",
        "()I",
        "getBytesSent",
        "()J",
        "getCodecName",
        "()Ljava/lang/String;",
        "getCodecPayloadType",
        "getDelayMedian",
        "getDelayStd",
        "getEchoReturnLoss",
        "()D",
        "getEchoReturnLossEnchancement",
        "getFractionLost",
        "()F",
        "getFramesCaptured",
        "getFramesRendered",
        "getJitter",
        "getNoiseCancellerIsEnabled",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getNoiseCancellerProcessTime",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getPacketsLost",
        "getPacketsSent",
        "getResidualEchoLikelihood",
        "getResidualEchoLikelihoodRecentMax",
        "getRtt",
        "getSpeaking",
        "getSsrc",
        "getTypingNoiseDetected",
        "()Z",
        "getVoiceActivityDetectorIsEnabled",
        "getVoiceActivityDetectorProcessTime",
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
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lco/discord/media_engine/internal/OutboundAudio;",
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
.field private final audioLevel:I

.field private final bytesSent:J

.field private final codecName:Ljava/lang/String;

.field private final codecPayloadType:I

.field private final delayMedian:I

.field private final delayStd:I

.field private final echoReturnLoss:D

.field private final echoReturnLossEnchancement:D

.field private final fractionLost:F

.field private final framesCaptured:J

.field private final framesRendered:J

.field private final jitter:I

.field private final noiseCancellerIsEnabled:Ljava/lang/Boolean;

.field private final noiseCancellerProcessTime:Ljava/lang/Long;

.field private final packetsLost:I

.field private final packetsSent:J

.field private final residualEchoLikelihood:D

.field private final residualEchoLikelihoodRecentMax:D

.field private final rtt:J

.field private final speaking:J

.field private final ssrc:J

.field private final typingNoiseDetected:Z

.field private final voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

.field private final voiceActivityDetectorProcessTime:Ljava/lang/Long;


# direct methods
.method public constructor <init>(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V
    .locals 4

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p4

    .line 3
    const-string v2, "codecName"

    .line 4
    .line 5
    invoke-static {p4, v2}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    move v2, p1

    .line 12
    iput v2, v0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    .line 13
    .line 14
    move-wide v2, p2

    .line 15
    iput-wide v2, v0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    .line 16
    .line 17
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    .line 18
    .line 19
    move v1, p5

    .line 20
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    .line 21
    .line 22
    move v1, p6

    .line 23
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    .line 24
    .line 25
    move v1, p7

    .line 26
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    .line 27
    .line 28
    move-wide v1, p8

    .line 29
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    .line 30
    .line 31
    move-wide v1, p10

    .line 32
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    .line 33
    .line 34
    move/from16 v1, p12

    .line 35
    .line 36
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    .line 37
    .line 38
    move/from16 v1, p13

    .line 39
    .line 40
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    .line 41
    .line 42
    move/from16 v1, p14

    .line 43
    .line 44
    iput v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    .line 45
    .line 46
    move-wide/from16 v1, p15

    .line 47
    .line 48
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    .line 49
    .line 50
    move-wide/from16 v1, p17

    .line 51
    .line 52
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    .line 53
    .line 54
    move-wide/from16 v1, p19

    .line 55
    .line 56
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    .line 57
    .line 58
    move-wide/from16 v1, p21

    .line 59
    .line 60
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    .line 61
    .line 62
    move-wide/from16 v1, p23

    .line 63
    .line 64
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    .line 65
    .line 66
    move-wide/from16 v1, p25

    .line 67
    .line 68
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    .line 69
    .line 70
    move/from16 v1, p27

    .line 71
    .line 72
    iput-boolean v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    .line 73
    .line 74
    move-wide/from16 v1, p28

    .line 75
    .line 76
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    .line 77
    .line 78
    move-wide/from16 v1, p30

    .line 79
    .line 80
    iput-wide v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    .line 81
    .line 82
    move-object/from16 v1, p32

    .line 83
    .line 84
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    .line 85
    .line 86
    move-object/from16 v1, p33

    .line 87
    .line 88
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    .line 89
    .line 90
    move-object/from16 v1, p34

    .line 91
    .line 92
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    .line 93
    .line 94
    move-object/from16 v1, p35

    .line 95
    .line 96
    iput-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    .line 97
    .line 98
    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/OutboundAudio;IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;ILjava/lang/Object;)Lco/discord/media_engine/internal/OutboundAudio;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p36

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget v7, v0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget v8, v0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    goto :goto_5

    :cond_5
    move/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget-wide v9, v0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    goto :goto_6

    :cond_6
    move-wide/from16 v9, p8

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget-wide v11, v0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    goto :goto_7

    :cond_7
    move-wide/from16 v11, p10

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget v13, v0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    goto :goto_8

    :cond_8
    move/from16 v13, p12

    :goto_8
    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    goto :goto_9

    :cond_9
    move/from16 v14, p13

    :goto_9
    and-int/lit16 v15, v1, 0x400

    if-eqz v15, :cond_a

    iget v15, v0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    goto :goto_a

    :cond_a
    move/from16 v15, p14

    :goto_a
    move/from16 p14, v15

    and-int/lit16 v15, v1, 0x800

    move/from16 p13, v14

    if-eqz v15, :cond_b

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p15

    :goto_b
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    goto :goto_c

    :cond_c
    move-wide/from16 v14, p17

    :goto_c
    move-wide/from16 p17, v14

    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_d

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    goto :goto_d

    :cond_d
    move-wide/from16 v14, p19

    :goto_d
    move-wide/from16 p19, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_e

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    goto :goto_e

    :cond_e
    move-wide/from16 v14, p21

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p21, v14

    if-eqz v16, :cond_f

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    goto :goto_f

    :cond_f
    move-wide/from16 v14, p23

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-wide/from16 p23, v14

    if-eqz v16, :cond_10

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    goto :goto_10

    :cond_10
    move-wide/from16 v14, p25

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-wide/from16 p25, v14

    if-eqz v16, :cond_11

    iget-boolean v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    goto :goto_11

    :cond_11
    move/from16 v14, p27

    :goto_11
    const/high16 v15, 0x40000

    and-int/2addr v15, v1

    move/from16 p27, v14

    if-eqz v15, :cond_12

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    goto :goto_12

    :cond_12
    move-wide/from16 v14, p28

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-wide/from16 p28, v14

    if-eqz v16, :cond_13

    iget-wide v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    goto :goto_13

    :cond_13
    move-wide/from16 v14, p30

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-wide/from16 p30, v14

    if-eqz v16, :cond_14

    iget-object v14, v0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    goto :goto_14

    :cond_14
    move-object/from16 v14, p32

    :goto_14
    const/high16 v15, 0x200000

    and-int/2addr v15, v1

    if-eqz v15, :cond_15

    iget-object v15, v0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p33

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p33, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p34

    :goto_16
    const/high16 v16, 0x800000

    and-int v1, v1, v16

    if-eqz v1, :cond_17

    iget-object v1, v0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p35

    :goto_17
    move/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move-wide/from16 p8, v9

    move-wide/from16 p10, v11

    move/from16 p12, v13

    move-object/from16 p32, v14

    move-object/from16 p34, v15

    move-object/from16 p35, v1

    invoke-virtual/range {p0 .. p35}, Lco/discord/media_engine/internal/OutboundAudio;->copy(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lco/discord/media_engine/internal/OutboundAudio;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    return v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    return v0
.end method

.method public final component12()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    return-wide v0
.end method

.method public final component13()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    return-wide v0
.end method

.method public final component14()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    return-wide v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    return-wide v0
.end method

.method public final component16()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    return-wide v0
.end method

.method public final component17()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    return-wide v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    return v0
.end method

.method public final component19()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    return-wide v0
.end method

.method public final component20()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    return-wide v0
.end method

.method public final component21()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component22()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final component23()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component24()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    return v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    return-wide v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    return-wide v0
.end method

.method public final component9()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    return v0
.end method

.method public final copy(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)Lco/discord/media_engine/internal/OutboundAudio;
    .locals 37

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-wide/from16 v8, p8

    move-wide/from16 v10, p10

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move-wide/from16 v15, p15

    move-wide/from16 v17, p17

    move-wide/from16 v19, p19

    move-wide/from16 v21, p21

    move-wide/from16 v23, p23

    move-wide/from16 v25, p25

    move/from16 v27, p27

    move-wide/from16 v28, p28

    move-wide/from16 v30, p30

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    const-string v0, "codecName"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v36, Lco/discord/media_engine/internal/OutboundAudio;

    move-object/from16 v0, v36

    move/from16 v1, p1

    invoke-direct/range {v0 .. v35}, Lco/discord/media_engine/internal/OutboundAudio;-><init>(IJLjava/lang/String;IIIDDFIIJDDJJJZJJLjava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;)V

    return-object v36
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/OutboundAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/OutboundAudio;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    iget v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    iget-boolean v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    iget-object p1, p1, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getAudioLevel()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    return v0
.end method

.method public final getBytesSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    return-wide v0
.end method

.method public final getCodecName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCodecPayloadType()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    return v0
.end method

.method public final getDelayMedian()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    return v0
.end method

.method public final getDelayStd()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    return v0
.end method

.method public final getEchoReturnLoss()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    return-wide v0
.end method

.method public final getEchoReturnLossEnchancement()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    return-wide v0
.end method

.method public final getFractionLost()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    return v0
.end method

.method public final getFramesCaptured()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    return-wide v0
.end method

.method public final getFramesRendered()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    return-wide v0
.end method

.method public final getJitter()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    return v0
.end method

.method public final getNoiseCancellerIsEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNoiseCancellerProcessTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPacketsLost()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    return v0
.end method

.method public final getPacketsSent()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    return-wide v0
.end method

.method public final getResidualEchoLikelihood()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    return-wide v0
.end method

.method public final getResidualEchoLikelihoodRecentMax()D
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    return-wide v0
.end method

.method public final getRtt()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    return-wide v0
.end method

.method public final getSpeaking()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    return-wide v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    return-wide v0
.end method

.method public final getTypingNoiseDetected()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    return v0
.end method

.method public final getVoiceActivityDetectorIsEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getVoiceActivityDetectorProcessTime()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    invoke-static {v1, v2}, Lco/discord/media_engine/b;->a(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OutboundAudio(audioLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->audioLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bytesSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->bytesSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codecName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codecPayloadType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->codecPayloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delayMedian="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayMedian:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delayStd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->delayStd:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", echoReturnLoss="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLoss:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", echoReturnLossEnchancement="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->echoReturnLossEnchancement:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", fractionLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->fractionLost:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", jitter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->jitter:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsLost:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", packetsSent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->packetsSent:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", residualEchoLikelihood="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihood:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", residualEchoLikelihoodRecentMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->residualEchoLikelihoodRecentMax:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rtt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->rtt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", speaking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->speaking:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", typingNoiseDetected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->typingNoiseDetected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", framesCaptured="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesCaptured:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", framesRendered="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->framesRendered:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", noiseCancellerIsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerIsEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noiseCancellerProcessTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->noiseCancellerProcessTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", voiceActivityDetectorIsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorIsEnabled:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", voiceActivityDetectorProcessTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/OutboundAudio;->voiceActivityDetectorProcessTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
