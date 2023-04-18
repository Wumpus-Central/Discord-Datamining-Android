.class public Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/webrtc/voiceengine/WebRtcAudioRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AudioSamples"
.end annotation


# instance fields
.field private final audioFormat:I

.field private final channelCount:I

.field private final data:[B

.field private final sampleRate:I


# direct methods
.method private constructor <init>(Landroid/media/AudioRecord;[B)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/media/AudioRecord;->getAudioFormat()I

    move-result v0

    iput v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->audioFormat:I

    .line 4
    invoke-virtual {p1}, Landroid/media/AudioRecord;->getChannelCount()I

    move-result v0

    iput v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->channelCount:I

    .line 5
    invoke-virtual {p1}, Landroid/media/AudioRecord;->getSampleRate()I

    move-result p1

    iput p1, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->sampleRate:I

    .line 6
    iput-object p2, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->data:[B

    return-void
.end method

.method synthetic constructor <init>(Landroid/media/AudioRecord;[BLorg/webrtc/voiceengine/WebRtcAudioRecord$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;-><init>(Landroid/media/AudioRecord;[B)V

    return-void
.end method


# virtual methods
.method public getAudioFormat()I
    .locals 1

    iget v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->audioFormat:I

    return v0
.end method

.method public getChannelCount()I
    .locals 1

    iget v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->channelCount:I

    return v0
.end method

.method public getData()[B
    .locals 1

    iget-object v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->data:[B

    return-object v0
.end method

.method public getSampleRate()I
    .locals 1

    iget v0, p0, Lorg/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;->sampleRate:I

    return v0
.end method
