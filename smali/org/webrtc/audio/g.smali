.class public final synthetic Lorg/webrtc/audio/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Landroid/media/AudioRecordingConfiguration;)Landroid/media/AudioDeviceInfo;
    .locals 0

    invoke-virtual {p0}, Landroid/media/AudioRecordingConfiguration;->getAudioDevice()Landroid/media/AudioDeviceInfo;

    move-result-object p0

    return-object p0
.end method
