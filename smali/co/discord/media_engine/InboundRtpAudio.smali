.class public final Lco/discord/media_engine/InboundRtpAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008R\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0093\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010$\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010&\u001a\u0004\u0018\u00010\"\u0012\u0008\u0010\'\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0002\u0010(J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0005H\u00c6\u0003J\t\u0010R\u001a\u00020\u0005H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0015H\u00c6\u0003J\t\u0010U\u001a\u00020\u0015H\u00c6\u0003J\t\u0010V\u001a\u00020\u0015H\u00c6\u0003J\t\u0010W\u001a\u00020\u0015H\u00c6\u0003J\t\u0010X\u001a\u00020\u0015H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\r\u0010[\u001a\u00060\u0005j\u0002`\u0006H\u00c6\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010]\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010^\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010`\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u000b\u0010a\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\t\u0010f\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\"H\u00c6\u0003J\t\u0010h\u001a\u00020\u0005H\u00c6\u0003J\t\u0010i\u001a\u00020\u0005H\u00c6\u0003J\t\u0010j\u001a\u00020\u0005H\u00c6\u0003J\t\u0010k\u001a\u00020\rH\u00c6\u0003J\t\u0010l\u001a\u00020\u000fH\u00c6\u0003J\t\u0010m\u001a\u00020\u0005H\u00c6\u0003J\u00d8\u0002\u0010n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00152\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010$\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010&\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\"H\u00c6\u0001\u00a2\u0006\u0002\u0010oJ\u0013\u0010p\u001a\u00020\u000f2\u0008\u0010q\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010r\u001a\u00020\u0015H\u00d6\u0001J\t\u0010s\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0013\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0013\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010,R\u0013\u0010$\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010,R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0013\u0010%\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010,R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0011\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00107R\u0011\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u00107R\u0011\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u00107R\u0011\u0010\u0019\u001a\u00020\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00107R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00103R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00103R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u00103R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u00103R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008@\u0010AR\u0015\u0010 \u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008C\u0010AR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008D\u0010AR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008E\u0010AR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008F\u0010AR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008G\u0010AR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010B\u001a\u0004\u0008H\u0010AR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008I\u00103R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008J\u00103R\u0013\u0010\'\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008K\u0010,R\u0013\u0010&\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008L\u0010,R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008M\u00103R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008N\u0010O\u00a8\u0006t"
    }
    d2 = {
        "Lco/discord/media_engine/InboundRtpAudio;",
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
        "packetsLost",
        "audioLevel",
        "",
        "audioDetected",
        "",
        "jitter",
        "jitterBuffer",
        "jitterBufferPreferred",
        "delayEstimate",
        "decodingCNG",
        "",
        "decodingMutedOutput",
        "decodingNormal",
        "decodingPLC",
        "decodingPLCCNG",
        "opSilence",
        "opNormal",
        "opMerge",
        "opExpand",
        "opAccelerate",
        "opPreemptiveExpand",
        "opCNG",
        "audioJitterBuffer",
        "Lco/discord/media_engine/PlayoutMetric;",
        "audioJitterDelay",
        "audioJitterTarget",
        "audioPlayoutUnderruns",
        "relativeReceptionDelay",
        "relativePlayoutDelay",
        "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V",
        "getAudioDetected",
        "()Z",
        "getAudioJitterBuffer",
        "()Lco/discord/media_engine/PlayoutMetric;",
        "getAudioJitterDelay",
        "getAudioJitterTarget",
        "getAudioLevel",
        "()F",
        "getAudioPlayoutUnderruns",
        "getBytesReceived",
        "()J",
        "getCodec",
        "()Lco/discord/media_engine/StatsCodec;",
        "getDecodingCNG",
        "()I",
        "getDecodingMutedOutput",
        "getDecodingNormal",
        "getDecodingPLC",
        "getDecodingPLCCNG",
        "getDelayEstimate",
        "getJitter",
        "getJitterBuffer",
        "getJitterBufferPreferred",
        "getOpAccelerate",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getOpCNG",
        "getOpExpand",
        "getOpMerge",
        "getOpNormal",
        "getOpPreemptiveExpand",
        "getOpSilence",
        "getPacketsLost",
        "getPacketsReceived",
        "getRelativePlayoutDelay",
        "getRelativeReceptionDelay",
        "getSsrc",
        "getType",
        "()Ljava/lang/String;",
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
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/InboundRtpAudio;",
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

.field private final audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

.field private final audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

.field private final audioLevel:F

.field private final audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

.field private final bytesReceived:J

.field private final codec:Lco/discord/media_engine/StatsCodec;

.field private final decodingCNG:I

.field private final decodingMutedOutput:I

.field private final decodingNormal:I

.field private final decodingPLC:I

.field private final decodingPLCCNG:I

.field private final delayEstimate:J

.field private final jitter:J

.field private final jitterBuffer:J

.field private final jitterBufferPreferred:J

.field private final opAccelerate:Ljava/lang/Long;

.field private final opCNG:Ljava/lang/Long;

.field private final opExpand:Ljava/lang/Long;

.field private final opMerge:Ljava/lang/Long;

.field private final opNormal:Ljava/lang/Long;

.field private final opPreemptiveExpand:Ljava/lang/Long;

.field private final opSilence:Ljava/lang/Long;

.field private final packetsLost:J

.field private final packetsReceived:J

.field private final relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

.field private final ssrc:J

.field private final type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V
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
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    move-wide v3, p2

    .line 3
    iput-wide v3, v0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    .line 4
    iput-object v2, v0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    move-wide v1, p5

    .line 5
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    move-wide v1, p7

    .line 6
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    move-wide v1, p9

    .line 7
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    move/from16 v1, p11

    .line 8
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    move/from16 v1, p12

    .line 9
    iput-boolean v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    move-wide/from16 v1, p13

    .line 10
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    move-wide/from16 v1, p15

    .line 11
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    move-wide/from16 v1, p17

    .line 12
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    move-wide/from16 v1, p19

    .line 13
    iput-wide v1, v0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    move/from16 v1, p21

    .line 14
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    move/from16 v1, p22

    .line 15
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    move/from16 v1, p23

    .line 16
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    move/from16 v1, p24

    .line 17
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    move/from16 v1, p25

    .line 18
    iput v1, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    move-object/from16 v1, p26

    .line 19
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    move-object/from16 v1, p27

    .line 20
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    move-object/from16 v1, p28

    .line 21
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    move-object/from16 v1, p29

    .line 22
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    move-object/from16 v1, p30

    .line 23
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    move-object/from16 v1, p31

    .line 24
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    move-object/from16 v1, p32

    .line 25
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    move-object/from16 v1, p33

    .line 26
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    move-object/from16 v1, p34

    .line 27
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    move-object/from16 v1, p35

    .line 28
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    move-object/from16 v1, p36

    .line 29
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    move-object/from16 v1, p37

    .line 30
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    move-object/from16 v1, p38

    .line 31
    iput-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    return-void
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/InboundRtpAudio;Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;ILjava/lang/Object;)Lco/discord/media_engine/InboundRtpAudio;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p39

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-wide v6, v0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    goto :goto_3

    :cond_3
    move-wide/from16 v6, p5

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-wide v8, v0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    goto :goto_4

    :cond_4
    move-wide/from16 v8, p7

    :goto_4
    and-int/lit8 v10, v1, 0x20

    if-eqz v10, :cond_5

    iget-wide v10, v0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    goto :goto_5

    :cond_5
    move-wide/from16 v10, p9

    :goto_5
    and-int/lit8 v12, v1, 0x40

    if-eqz v12, :cond_6

    iget v12, v0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    goto :goto_6

    :cond_6
    move/from16 v12, p11

    :goto_6
    and-int/lit16 v13, v1, 0x80

    if-eqz v13, :cond_7

    iget-boolean v13, v0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    goto :goto_7

    :cond_7
    move/from16 v13, p12

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    goto :goto_8

    :cond_8
    move-wide/from16 v14, p13

    :goto_8
    move-wide/from16 p13, v14

    and-int/lit16 v14, v1, 0x200

    if-eqz v14, :cond_9

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    goto :goto_9

    :cond_9
    move-wide/from16 v14, p15

    :goto_9
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p17

    :goto_a
    move-wide/from16 p17, v14

    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-wide v14, v0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p19

    :goto_b
    move-wide/from16 p19, v14

    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget v14, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    goto :goto_c

    :cond_c
    move/from16 v14, p21

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget v15, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    goto :goto_d

    :cond_d
    move/from16 v15, p22

    :goto_d
    move/from16 p22, v15

    and-int/lit16 v15, v1, 0x4000

    if-eqz v15, :cond_e

    iget v15, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    goto :goto_e

    :cond_e
    move/from16 v15, p23

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move/from16 p23, v15

    if-eqz v16, :cond_f

    iget v15, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    goto :goto_f

    :cond_f
    move/from16 v15, p24

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move/from16 p24, v15

    if-eqz v16, :cond_10

    iget v15, v0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    goto :goto_10

    :cond_10
    move/from16 v15, p25

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move/from16 p25, v15

    if-eqz v16, :cond_11

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    goto :goto_11

    :cond_11
    move-object/from16 v15, p26

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-object/from16 p26, v15

    if-eqz v16, :cond_12

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    goto :goto_12

    :cond_12
    move-object/from16 v15, p27

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-object/from16 p27, v15

    if-eqz v16, :cond_13

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    goto :goto_13

    :cond_13
    move-object/from16 v15, p28

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-object/from16 p28, v15

    if-eqz v16, :cond_14

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    goto :goto_14

    :cond_14
    move-object/from16 v15, p29

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-object/from16 p29, v15

    if-eqz v16, :cond_15

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    goto :goto_15

    :cond_15
    move-object/from16 v15, p30

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-object/from16 p30, v15

    if-eqz v16, :cond_16

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    goto :goto_16

    :cond_16
    move-object/from16 v15, p31

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, v1, v16

    move-object/from16 p31, v15

    if-eqz v16, :cond_17

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    goto :goto_17

    :cond_17
    move-object/from16 v15, p32

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, v1, v16

    move-object/from16 p32, v15

    if-eqz v16, :cond_18

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_18

    :cond_18
    move-object/from16 v15, p33

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, v1, v16

    move-object/from16 p33, v15

    if-eqz v16, :cond_19

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_19

    :cond_19
    move-object/from16 v15, p34

    :goto_19
    const/high16 v16, 0x4000000

    and-int v16, v1, v16

    move-object/from16 p34, v15

    if-eqz v16, :cond_1a

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_1a

    :cond_1a
    move-object/from16 v15, p35

    :goto_1a
    const/high16 v16, 0x8000000

    and-int v16, v1, v16

    move-object/from16 p35, v15

    if-eqz v16, :cond_1b

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_1b

    :cond_1b
    move-object/from16 v15, p36

    :goto_1b
    const/high16 v16, 0x10000000

    and-int v16, v1, v16

    move-object/from16 p36, v15

    if-eqz v16, :cond_1c

    iget-object v15, v0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_1c

    :cond_1c
    move-object/from16 v15, p37

    :goto_1c
    const/high16 v16, 0x20000000

    and-int v1, v1, v16

    if-eqz v1, :cond_1d

    iget-object v1, v0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p38

    :goto_1d
    move-object/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-wide/from16 p5, v6

    move-wide/from16 p7, v8

    move-wide/from16 p9, v10

    move/from16 p11, v12

    move/from16 p12, v13

    move/from16 p21, v14

    move-object/from16 p37, v15

    move-object/from16 p38, v1

    invoke-virtual/range {p0 .. p38}, Lco/discord/media_engine/InboundRtpAudio;->copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/InboundRtpAudio;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    return-wide v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    return-wide v0
.end method

.method public final component12()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    return-wide v0
.end method

.method public final component13()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    return v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    return v0
.end method

.method public final component18()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    return-object v0
.end method

.method public final component19()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    return-wide v0
.end method

.method public final component20()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    return-object v0
.end method

.method public final component21()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    return-object v0
.end method

.method public final component22()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    return-object v0
.end method

.method public final component23()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    return-object v0
.end method

.method public final component24()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    return-object v0
.end method

.method public final component25()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component26()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component27()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component28()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component29()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component3()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final component30()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final component4()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    return-wide v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    return-wide v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)Lco/discord/media_engine/InboundRtpAudio;
    .locals 41

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move/from16 v11, p11

    move/from16 v12, p12

    move-wide/from16 v13, p13

    move-wide/from16 v15, p15

    move-wide/from16 v17, p17

    move-wide/from16 v19, p19

    move/from16 v21, p21

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move/from16 v25, p25

    move-object/from16 v26, p26

    move-object/from16 v27, p27

    move-object/from16 v28, p28

    move-object/from16 v29, p29

    move-object/from16 v30, p30

    move-object/from16 v31, p31

    move-object/from16 v32, p32

    move-object/from16 v33, p33

    move-object/from16 v34, p34

    move-object/from16 v35, p35

    move-object/from16 v36, p36

    move-object/from16 v37, p37

    move-object/from16 v38, p38

    const-string v0, "type"

    move-object/from16 v39, v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v40, Lco/discord/media_engine/InboundRtpAudio;

    move-object/from16 v0, v40

    move-object/from16 v1, v39

    invoke-direct/range {v0 .. v38}, Lco/discord/media_engine/InboundRtpAudio;-><init>(Ljava/lang/String;JLco/discord/media_engine/StatsCodec;JJJFZJJJJIIIIILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V

    return-object v40
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/InboundRtpAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/InboundRtpAudio;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    iget-boolean v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    iget-wide v5, p1, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    iget v3, p1, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object v3, p1, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    iget-object p1, p1, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    return v2

    :cond_1f
    return v0
.end method

.method public final getAudioDetected()Z
    .locals 1

    iget-boolean v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    return v0
.end method

.method public final getAudioJitterBuffer()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioJitterDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioJitterTarget()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getAudioLevel()F
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    return v0
.end method

.method public final getAudioPlayoutUnderruns()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getBytesReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    return-wide v0
.end method

.method public final getCodec()Lco/discord/media_engine/StatsCodec;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    return-object v0
.end method

.method public final getDecodingCNG()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    return v0
.end method

.method public final getDecodingMutedOutput()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    return v0
.end method

.method public final getDecodingNormal()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    return v0
.end method

.method public final getDecodingPLC()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    return v0
.end method

.method public final getDecodingPLCCNG()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    return v0
.end method

.method public final getDelayEstimate()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    return-wide v0
.end method

.method public final getJitter()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    return-wide v0
.end method

.method public final getJitterBuffer()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    return-wide v0
.end method

.method public final getJitterBufferPreferred()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    return-wide v0
.end method

.method public final getOpAccelerate()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpCNG()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpExpand()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpMerge()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpNormal()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpPreemptiveExpand()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    return-object v0
.end method

.method public final getOpSilence()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    return-object v0
.end method

.method public final getPacketsLost()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    return-wide v0
.end method

.method public final getPacketsReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    return-wide v0
.end method

.method public final getRelativePlayoutDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getRelativeReceptionDelay()Lco/discord/media_engine/PlayoutMetric;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    return-object v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    return-wide v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v1}, Lco/discord/media_engine/StatsCodec;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

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

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    if-nez v1, :cond_7

    move v1, v2

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_8

    move v1, v2

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    :goto_7
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_9

    move v1, v2

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_a

    move v1, v2

    goto :goto_9

    :cond_a
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    :goto_9
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_b

    move v1, v2

    goto :goto_a

    :cond_b
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_c

    move v1, v2

    goto :goto_b

    :cond_c
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v1

    :goto_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    if-nez v1, :cond_d

    goto :goto_c

    :cond_d
    invoke-virtual {v1}, Lco/discord/media_engine/PlayoutMetric;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundRtpAudio(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codec="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->codec:Lco/discord/media_engine/StatsCodec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->bytesReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->packetsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", audioLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioLevel:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", audioDetected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioDetected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", jitter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitter:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBuffer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferPreferred="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->jitterBufferPreferred:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", delayEstimate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/InboundRtpAudio;->delayEstimate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", decodingCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingCNG:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingMutedOutput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingMutedOutput:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingNormal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingNormal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingPLC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLC:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingPLCCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/InboundRtpAudio;->decodingPLCCNG:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", opSilence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opSilence:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opNormal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opNormal:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opMerge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opMerge:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opExpand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opExpand:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opAccelerate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opAccelerate:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opPreemptiveExpand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opPreemptiveExpand:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", opCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->opCNG:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioJitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterBuffer:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioJitterDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioJitterTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioJitterTarget:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", audioPlayoutUnderruns="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->audioPlayoutUnderruns:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", relativeReceptionDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativeReceptionDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", relativePlayoutDelay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/InboundRtpAudio;->relativePlayoutDelay:Lco/discord/media_engine/PlayoutMetric;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
