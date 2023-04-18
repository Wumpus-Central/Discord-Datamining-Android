.class Lorg/webrtc/FramerateBitrateAdjuster;
.super Lorg/webrtc/BaseBitrateAdjuster;
.source "SourceFile"


# static fields
.field private static final INITIAL_FPS:I = 0x1e


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/webrtc/BaseBitrateAdjuster;-><init>()V

    return-void
.end method


# virtual methods
.method public getCodecConfigFramerate()I
    .locals 1

    const/16 v0, 0x1e

    return v0
.end method

.method public setTargets(II)V
    .locals 2

    .line 1
    iget v0, p0, Lorg/webrtc/BaseBitrateAdjuster;->targetFps:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move p2, v1

    .line 8
    :cond_0
    invoke-super {p0, p1, p2}, Lorg/webrtc/BaseBitrateAdjuster;->setTargets(II)V

    .line 9
    .line 10
    .line 11
    iget p1, p0, Lorg/webrtc/BaseBitrateAdjuster;->targetBitrateBps:I

    .line 12
    .line 13
    mul-int/2addr p1, v1

    .line 14
    iget p2, p0, Lorg/webrtc/BaseBitrateAdjuster;->targetFps:I

    .line 15
    .line 16
    div-int/2addr p1, p2

    .line 17
    iput p1, p0, Lorg/webrtc/BaseBitrateAdjuster;->targetBitrateBps:I

    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method
