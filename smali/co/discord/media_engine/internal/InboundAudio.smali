.class public final Lco/discord/media_engine/internal/InboundAudio;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008I\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u00a1\u0002\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u000b\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\r\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0012\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u0013\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u0014\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u0015\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u0016\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u0017\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u0018\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u0019\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u001a\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u001b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u001c\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u001d\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u001e\u001a\u00060\u0006j\u0002`\u000c\u0012\n\u0010\u001f\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0002\u0010 J\r\u0010<\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010=\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010>\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010?\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010@\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010A\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010B\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010C\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010D\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010E\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010F\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010G\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010H\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010I\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010J\u001a\u00060\u0006j\u0002`\u0007H\u00c6\u0003J\r\u0010K\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010L\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\t\u0010M\u001a\u00020\tH\u00c6\u0003J\r\u0010N\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010O\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0003J\r\u0010P\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010Q\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010R\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\r\u0010S\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u00d5\u0002\u0010T\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u000c\u0008\u0002\u0010\n\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u000b\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\r\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u000e\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u000f\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0010\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0011\u001a\u00060\u0003j\u0002`\u00042\u000c\u0008\u0002\u0010\u0012\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u0013\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u0014\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u0015\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u0016\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u0017\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u0018\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u0019\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u001a\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u001b\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u001c\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u001d\u001a\u00060\u0006j\u0002`\u00072\u000c\u0008\u0002\u0010\u001e\u001a\u00060\u0006j\u0002`\u000c2\u000c\u0008\u0002\u0010\u001f\u001a\u00060\u0006j\u0002`\u000cH\u00c6\u0001J\u0013\u0010U\u001a\u00020V2\u0008\u0010W\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010X\u001a\u00020\u0003H\u00d6\u0001J\t\u0010Y\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0015\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0015\u0010\n\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\"R\u0015\u0010\r\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\"R\u0015\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\"R\u0015\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\"R\u0015\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\"R\u0015\u0010\u0011\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\"R\u0015\u0010\u000b\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010$R\u0015\u0010\u0012\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010$R\u0015\u0010\u0013\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010$R\u0015\u0010\u0014\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010$R\u0015\u0010\u001b\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010$R\u0015\u0010\u001d\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010$R\u0015\u0010\u001a\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010$R\u0015\u0010\u0019\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010$R\u0015\u0010\u0018\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010$R\u0015\u0010\u001c\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u0010$R\u0015\u0010\u0017\u001a\u00060\u0006j\u0002`\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010$R\u0015\u0010\u0015\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010$R\u0015\u0010\u0016\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010$R\u0015\u0010\u001e\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010$R\u0015\u0010\u001f\u001a\u00060\u0006j\u0002`\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010$\u00a8\u0006Z"
    }
    d2 = {
        "Lco/discord/media_engine/internal/InboundAudio;",
        "",
        "audioLevel",
        "",
        "Lco/discord/media_engine/internal/I32;",
        "bytesReceived",
        "",
        "Lco/discord/media_engine/internal/U64;",
        "codecName",
        "",
        "codecPayloadType",
        "delayEstimate",
        "Lco/discord/media_engine/internal/U32;",
        "decodingCNG",
        "decodingMutedOutput",
        "decodingNormal",
        "decodingPLC",
        "decodingPLCCNG",
        "jitter",
        "jitterBuffer",
        "jitterBufferPreferred",
        "packetsLost",
        "packetsReceived",
        "opSilence",
        "opNormal",
        "opMerge",
        "opExpand",
        "opAccelerate",
        "opPreemptiveExpand",
        "opCNG",
        "speaking",
        "ssrc",
        "(IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJ)V",
        "getAudioLevel",
        "()I",
        "getBytesReceived",
        "()J",
        "getCodecName",
        "()Ljava/lang/String;",
        "getCodecPayloadType",
        "getDecodingCNG",
        "getDecodingMutedOutput",
        "getDecodingNormal",
        "getDecodingPLC",
        "getDecodingPLCCNG",
        "getDelayEstimate",
        "getJitter",
        "getJitterBuffer",
        "getJitterBufferPreferred",
        "getOpAccelerate",
        "getOpCNG",
        "getOpExpand",
        "getOpMerge",
        "getOpNormal",
        "getOpPreemptiveExpand",
        "getOpSilence",
        "getPacketsLost",
        "getPacketsReceived",
        "getSpeaking",
        "getSsrc",
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
.field private final audioLevel:I

.field private final bytesReceived:J

.field private final codecName:Ljava/lang/String;

.field private final codecPayloadType:I

.field private final decodingCNG:I

.field private final decodingMutedOutput:I

.field private final decodingNormal:I

.field private final decodingPLC:I

.field private final decodingPLCCNG:I

.field private final delayEstimate:J

.field private final jitter:J

.field private final jitterBuffer:J

.field private final jitterBufferPreferred:J

.field private final opAccelerate:J

.field private final opCNG:J

.field private final opExpand:J

.field private final opMerge:J

.field private final opNormal:J

.field private final opPreemptiveExpand:J

.field private final opSilence:J

.field private final packetsLost:J

.field private final packetsReceived:J

.field private final speaking:J

.field private final ssrc:J


# direct methods
.method public constructor <init>(IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJ)V
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
    iput v2, v0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    .line 13
    .line 14
    move-wide v2, p2

    .line 15
    iput-wide v2, v0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    .line 16
    .line 17
    iput-object v1, v0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    .line 18
    .line 19
    move v1, p5

    .line 20
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    .line 21
    .line 22
    move-wide v1, p6

    .line 23
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    .line 24
    .line 25
    move v1, p8

    .line 26
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    .line 27
    .line 28
    move v1, p9

    .line 29
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    .line 30
    .line 31
    move v1, p10

    .line 32
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    .line 33
    .line 34
    move v1, p11

    .line 35
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    .line 36
    .line 37
    move/from16 v1, p12

    .line 38
    .line 39
    iput v1, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    .line 40
    .line 41
    move-wide/from16 v1, p13

    .line 42
    .line 43
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    .line 44
    .line 45
    move-wide/from16 v1, p15

    .line 46
    .line 47
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    .line 48
    .line 49
    move-wide/from16 v1, p17

    .line 50
    .line 51
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    .line 52
    .line 53
    move-wide/from16 v1, p19

    .line 54
    .line 55
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    .line 56
    .line 57
    move-wide/from16 v1, p21

    .line 58
    .line 59
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    .line 60
    .line 61
    move-wide/from16 v1, p23

    .line 62
    .line 63
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    .line 64
    .line 65
    move-wide/from16 v1, p25

    .line 66
    .line 67
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    .line 68
    .line 69
    move-wide/from16 v1, p27

    .line 70
    .line 71
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    .line 72
    .line 73
    move-wide/from16 v1, p29

    .line 74
    .line 75
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    .line 76
    .line 77
    move-wide/from16 v1, p31

    .line 78
    .line 79
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    .line 80
    .line 81
    move-wide/from16 v1, p33

    .line 82
    .line 83
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    .line 84
    .line 85
    move-wide/from16 v1, p35

    .line 86
    .line 87
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    .line 88
    .line 89
    move-wide/from16 v1, p37

    .line 90
    .line 91
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    .line 92
    .line 93
    move-wide/from16 v1, p39

    .line 94
    .line 95
    iput-wide v1, v0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    .line 96
    .line 97
    return-void
    .line 98
.end method

.method public static synthetic copy$default(Lco/discord/media_engine/internal/InboundAudio;IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJILjava/lang/Object;)Lco/discord/media_engine/internal/InboundAudio;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p41

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v1, 0x4

    if-eqz v5, :cond_2

    iget-object v5, v0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v5, p4

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget v6, v0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-wide v7, v0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    goto :goto_4

    :cond_4
    move-wide/from16 v7, p6

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget v9, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    goto :goto_5

    :cond_5
    move/from16 v9, p8

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget v10, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    goto :goto_6

    :cond_6
    move/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_7

    iget v11, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    goto :goto_7

    :cond_7
    move/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v1, 0x100

    if-eqz v12, :cond_8

    iget v12, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    goto :goto_8

    :cond_8
    move/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v1, 0x200

    if-eqz v13, :cond_9

    iget v13, v0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v1, 0x400

    if-eqz v14, :cond_a

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    goto :goto_a

    :cond_a
    move-wide/from16 v14, p13

    :goto_a
    move-wide/from16 p13, v14

    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p15

    :goto_b
    move-wide/from16 p15, v14

    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    goto :goto_c

    :cond_c
    move-wide/from16 v14, p17

    :goto_c
    move-wide/from16 p17, v14

    and-int/lit16 v14, v1, 0x2000

    if-eqz v14, :cond_d

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    goto :goto_d

    :cond_d
    move-wide/from16 v14, p19

    :goto_d
    move-wide/from16 p19, v14

    and-int/lit16 v14, v1, 0x4000

    if-eqz v14, :cond_e

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    goto :goto_e

    :cond_e
    move-wide/from16 v14, p21

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    move-wide/from16 p21, v14

    if-eqz v16, :cond_f

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    goto :goto_f

    :cond_f
    move-wide/from16 v14, p23

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v1, v16

    move-wide/from16 p23, v14

    if-eqz v16, :cond_10

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    goto :goto_10

    :cond_10
    move-wide/from16 v14, p25

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, v1, v16

    move-wide/from16 p25, v14

    if-eqz v16, :cond_11

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    goto :goto_11

    :cond_11
    move-wide/from16 v14, p27

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, v1, v16

    move-wide/from16 p27, v14

    if-eqz v16, :cond_12

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    goto :goto_12

    :cond_12
    move-wide/from16 v14, p29

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, v1, v16

    move-wide/from16 p29, v14

    if-eqz v16, :cond_13

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    goto :goto_13

    :cond_13
    move-wide/from16 v14, p31

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, v1, v16

    move-wide/from16 p31, v14

    if-eqz v16, :cond_14

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    goto :goto_14

    :cond_14
    move-wide/from16 v14, p33

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, v1, v16

    move-wide/from16 p33, v14

    if-eqz v16, :cond_15

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    goto :goto_15

    :cond_15
    move-wide/from16 v14, p35

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, v1, v16

    move-wide/from16 p35, v14

    if-eqz v16, :cond_16

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    goto :goto_16

    :cond_16
    move-wide/from16 v14, p37

    :goto_16
    const/high16 v16, 0x800000

    and-int v1, v1, v16

    move-wide/from16 p37, v14

    if-eqz v1, :cond_17

    iget-wide v14, v0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    goto :goto_17

    :cond_17
    move-wide/from16 v14, p39

    :goto_17
    move/from16 p1, v2

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move/from16 p5, v6

    move-wide/from16 p6, v7

    move/from16 p8, v9

    move/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move/from16 p12, v13

    move-wide/from16 p39, v14

    invoke-virtual/range {p0 .. p40}, Lco/discord/media_engine/internal/InboundAudio;->copy(IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJ)Lco/discord/media_engine/internal/InboundAudio;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    return v0
.end method

.method public final component10()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    return v0
.end method

.method public final component11()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    return-wide v0
.end method

.method public final component12()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    return-wide v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    return-wide v0
.end method

.method public final component14()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    return-wide v0
.end method

.method public final component15()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    return-wide v0
.end method

.method public final component16()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    return-wide v0
.end method

.method public final component17()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    return-wide v0
.end method

.method public final component18()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    return-wide v0
.end method

.method public final component19()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    return-wide v0
.end method

.method public final component20()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    return-wide v0
.end method

.method public final component21()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    return-wide v0
.end method

.method public final component22()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    return-wide v0
.end method

.method public final component23()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    return-wide v0
.end method

.method public final component24()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    return v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    return-wide v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    return v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    return v0
.end method

.method public final component9()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJ)Lco/discord/media_engine/internal/InboundAudio;
    .locals 42

    move/from16 v1, p1

    move-wide/from16 v2, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move/from16 v12, p12

    move-wide/from16 v13, p13

    move-wide/from16 v15, p15

    move-wide/from16 v17, p17

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

    move-wide/from16 v39, p39

    const-string v0, "codecName"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v41, Lco/discord/media_engine/internal/InboundAudio;

    move-object/from16 v0, v41

    move/from16 v1, p1

    invoke-direct/range {v0 .. v40}, Lco/discord/media_engine/internal/InboundAudio;-><init>(IJLjava/lang/String;IJIIIIIJJJJJJJJJJJJJJ)V

    return-object v41
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/discord/media_engine/internal/InboundAudio;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/discord/media_engine/internal/InboundAudio;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    iget-object v3, p1, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    iget v3, p1, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_14

    return v2

    :cond_14
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_17

    return v2

    :cond_17
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_18

    return v2

    :cond_18
    iget-wide v3, p0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    iget-wide v5, p1, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_19

    return v2

    :cond_19
    return v0
.end method

.method public final getAudioLevel()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    return v0
.end method

.method public final getBytesReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    return-wide v0
.end method

.method public final getCodecName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    return-object v0
.end method

.method public final getCodecPayloadType()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    return v0
.end method

.method public final getDecodingCNG()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    return v0
.end method

.method public final getDecodingMutedOutput()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    return v0
.end method

.method public final getDecodingNormal()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    return v0
.end method

.method public final getDecodingPLC()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    return v0
.end method

.method public final getDecodingPLCCNG()I
    .locals 1

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    return v0
.end method

.method public final getDelayEstimate()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    return-wide v0
.end method

.method public final getJitter()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    return-wide v0
.end method

.method public final getJitterBuffer()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    return-wide v0
.end method

.method public final getJitterBufferPreferred()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    return-wide v0
.end method

.method public final getOpAccelerate()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    return-wide v0
.end method

.method public final getOpCNG()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    return-wide v0
.end method

.method public final getOpExpand()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    return-wide v0
.end method

.method public final getOpMerge()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    return-wide v0
.end method

.method public final getOpNormal()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    return-wide v0
.end method

.method public final getOpPreemptiveExpand()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    return-wide v0
.end method

.method public final getOpSilence()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    return-wide v0
.end method

.method public final getPacketsLost()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    return-wide v0
.end method

.method public final getPacketsReceived()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    return-wide v0
.end method

.method public final getSpeaking()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    return-wide v0
.end method

.method public final getSsrc()J
    .locals 2

    iget-wide v0, p0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    invoke-static {v1, v2}, Lco/discord/media_engine/a;->a(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "InboundAudio(audioLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->audioLevel:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bytesReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->bytesReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", codecName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codecPayloadType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->codecPayloadType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", delayEstimate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->delayEstimate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", decodingCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingCNG:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingMutedOutput="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingMutedOutput:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingNormal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingNormal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingPLC="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLC:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodingPLCCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lco/discord/media_engine/internal/InboundAudio;->decodingPLCCNG:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", jitter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitter:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBuffer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBuffer:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", jitterBufferPreferred="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->jitterBufferPreferred:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsLost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsLost:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", packetsReceived="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->packetsReceived:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opSilence="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opSilence:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opNormal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opNormal:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opMerge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opMerge:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opExpand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opExpand:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opAccelerate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opAccelerate:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opPreemptiveExpand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opPreemptiveExpand:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opCNG="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->opCNG:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", speaking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->speaking:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ssrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lco/discord/media_engine/internal/InboundAudio;->ssrc:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
