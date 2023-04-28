package co.discord.media_engine.internal;

import co.discord.media_engine.PlayoutMetric;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, m15073d2 = {"Lco/discord/media_engine/internal/InboundPlayout;", "", "audioJitterBuffer", "Lco/discord/media_engine/PlayoutMetric;", "audioJitterDelay", "audioJitterTarget", "audioPlayoutUnderruns", "audioCaptureOverruns", "videoJitterBuffer", "videoJitterDelay", "videoJitterTarget", "relativeReceptionDelay", "relativePlayoutDelay", "(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V", "getAudioCaptureOverruns", "()Lco/discord/media_engine/PlayoutMetric;", "getAudioJitterBuffer", "getAudioJitterDelay", "getAudioJitterTarget", "getAudioPlayoutUnderruns", "getRelativePlayoutDelay", "getRelativeReceptionDelay", "getVideoJitterBuffer", "getVideoJitterDelay", "getVideoJitterTarget", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class InboundPlayout {
    private final PlayoutMetric audioCaptureOverruns;
    private final PlayoutMetric audioJitterBuffer;
    private final PlayoutMetric audioJitterDelay;
    private final PlayoutMetric audioJitterTarget;
    private final PlayoutMetric audioPlayoutUnderruns;
    private final PlayoutMetric relativePlayoutDelay;
    private final PlayoutMetric relativeReceptionDelay;
    private final PlayoutMetric videoJitterBuffer;
    private final PlayoutMetric videoJitterDelay;
    private final PlayoutMetric videoJitterTarget;

    public InboundPlayout(PlayoutMetric audioJitterBuffer, PlayoutMetric audioJitterDelay, PlayoutMetric audioJitterTarget, PlayoutMetric audioPlayoutUnderruns, PlayoutMetric audioCaptureOverruns, PlayoutMetric videoJitterBuffer, PlayoutMetric videoJitterDelay, PlayoutMetric videoJitterTarget, PlayoutMetric relativeReceptionDelay, PlayoutMetric relativePlayoutDelay) {
        C9971q.m14633g(audioJitterBuffer, "audioJitterBuffer");
        C9971q.m14633g(audioJitterDelay, "audioJitterDelay");
        C9971q.m14633g(audioJitterTarget, "audioJitterTarget");
        C9971q.m14633g(audioPlayoutUnderruns, "audioPlayoutUnderruns");
        C9971q.m14633g(audioCaptureOverruns, "audioCaptureOverruns");
        C9971q.m14633g(videoJitterBuffer, "videoJitterBuffer");
        C9971q.m14633g(videoJitterDelay, "videoJitterDelay");
        C9971q.m14633g(videoJitterTarget, "videoJitterTarget");
        C9971q.m14633g(relativeReceptionDelay, "relativeReceptionDelay");
        C9971q.m14633g(relativePlayoutDelay, "relativePlayoutDelay");
        this.audioJitterBuffer = audioJitterBuffer;
        this.audioJitterDelay = audioJitterDelay;
        this.audioJitterTarget = audioJitterTarget;
        this.audioPlayoutUnderruns = audioPlayoutUnderruns;
        this.audioCaptureOverruns = audioCaptureOverruns;
        this.videoJitterBuffer = videoJitterBuffer;
        this.videoJitterDelay = videoJitterDelay;
        this.videoJitterTarget = videoJitterTarget;
        this.relativeReceptionDelay = relativeReceptionDelay;
        this.relativePlayoutDelay = relativePlayoutDelay;
    }

    public final PlayoutMetric component1() {
        return this.audioJitterBuffer;
    }

    public final PlayoutMetric component10() {
        return this.relativePlayoutDelay;
    }

    public final PlayoutMetric component2() {
        return this.audioJitterDelay;
    }

    public final PlayoutMetric component3() {
        return this.audioJitterTarget;
    }

    public final PlayoutMetric component4() {
        return this.audioPlayoutUnderruns;
    }

    public final PlayoutMetric component5() {
        return this.audioCaptureOverruns;
    }

    public final PlayoutMetric component6() {
        return this.videoJitterBuffer;
    }

    public final PlayoutMetric component7() {
        return this.videoJitterDelay;
    }

    public final PlayoutMetric component8() {
        return this.videoJitterTarget;
    }

    public final PlayoutMetric component9() {
        return this.relativeReceptionDelay;
    }

    public final InboundPlayout copy(PlayoutMetric audioJitterBuffer, PlayoutMetric audioJitterDelay, PlayoutMetric audioJitterTarget, PlayoutMetric audioPlayoutUnderruns, PlayoutMetric audioCaptureOverruns, PlayoutMetric videoJitterBuffer, PlayoutMetric videoJitterDelay, PlayoutMetric videoJitterTarget, PlayoutMetric relativeReceptionDelay, PlayoutMetric relativePlayoutDelay) {
        C9971q.m14633g(audioJitterBuffer, "audioJitterBuffer");
        C9971q.m14633g(audioJitterDelay, "audioJitterDelay");
        C9971q.m14633g(audioJitterTarget, "audioJitterTarget");
        C9971q.m14633g(audioPlayoutUnderruns, "audioPlayoutUnderruns");
        C9971q.m14633g(audioCaptureOverruns, "audioCaptureOverruns");
        C9971q.m14633g(videoJitterBuffer, "videoJitterBuffer");
        C9971q.m14633g(videoJitterDelay, "videoJitterDelay");
        C9971q.m14633g(videoJitterTarget, "videoJitterTarget");
        C9971q.m14633g(relativeReceptionDelay, "relativeReceptionDelay");
        C9971q.m14633g(relativePlayoutDelay, "relativePlayoutDelay");
        return new InboundPlayout(audioJitterBuffer, audioJitterDelay, audioJitterTarget, audioPlayoutUnderruns, audioCaptureOverruns, videoJitterBuffer, videoJitterDelay, videoJitterTarget, relativeReceptionDelay, relativePlayoutDelay);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundPlayout)) {
            return false;
        }
        InboundPlayout inboundPlayout = (InboundPlayout) obj;
        return C9971q.m14638b(this.audioJitterBuffer, inboundPlayout.audioJitterBuffer) && C9971q.m14638b(this.audioJitterDelay, inboundPlayout.audioJitterDelay) && C9971q.m14638b(this.audioJitterTarget, inboundPlayout.audioJitterTarget) && C9971q.m14638b(this.audioPlayoutUnderruns, inboundPlayout.audioPlayoutUnderruns) && C9971q.m14638b(this.audioCaptureOverruns, inboundPlayout.audioCaptureOverruns) && C9971q.m14638b(this.videoJitterBuffer, inboundPlayout.videoJitterBuffer) && C9971q.m14638b(this.videoJitterDelay, inboundPlayout.videoJitterDelay) && C9971q.m14638b(this.videoJitterTarget, inboundPlayout.videoJitterTarget) && C9971q.m14638b(this.relativeReceptionDelay, inboundPlayout.relativeReceptionDelay) && C9971q.m14638b(this.relativePlayoutDelay, inboundPlayout.relativePlayoutDelay);
    }

    public final PlayoutMetric getAudioCaptureOverruns() {
        return this.audioCaptureOverruns;
    }

    public final PlayoutMetric getAudioJitterBuffer() {
        return this.audioJitterBuffer;
    }

    public final PlayoutMetric getAudioJitterDelay() {
        return this.audioJitterDelay;
    }

    public final PlayoutMetric getAudioJitterTarget() {
        return this.audioJitterTarget;
    }

    public final PlayoutMetric getAudioPlayoutUnderruns() {
        return this.audioPlayoutUnderruns;
    }

    public final PlayoutMetric getRelativePlayoutDelay() {
        return this.relativePlayoutDelay;
    }

    public final PlayoutMetric getRelativeReceptionDelay() {
        return this.relativeReceptionDelay;
    }

    public final PlayoutMetric getVideoJitterBuffer() {
        return this.videoJitterBuffer;
    }

    public final PlayoutMetric getVideoJitterDelay() {
        return this.videoJitterDelay;
    }

    public final PlayoutMetric getVideoJitterTarget() {
        return this.videoJitterTarget;
    }

    public int hashCode() {
        return (((((((((((((((((this.audioJitterBuffer.hashCode() * 31) + this.audioJitterDelay.hashCode()) * 31) + this.audioJitterTarget.hashCode()) * 31) + this.audioPlayoutUnderruns.hashCode()) * 31) + this.audioCaptureOverruns.hashCode()) * 31) + this.videoJitterBuffer.hashCode()) * 31) + this.videoJitterDelay.hashCode()) * 31) + this.videoJitterTarget.hashCode()) * 31) + this.relativeReceptionDelay.hashCode()) * 31) + this.relativePlayoutDelay.hashCode();
    }

    public String toString() {
        return "InboundPlayout(audioJitterBuffer=" + this.audioJitterBuffer + ", audioJitterDelay=" + this.audioJitterDelay + ", audioJitterTarget=" + this.audioJitterTarget + ", audioPlayoutUnderruns=" + this.audioPlayoutUnderruns + ", audioCaptureOverruns=" + this.audioCaptureOverruns + ", videoJitterBuffer=" + this.videoJitterBuffer + ", videoJitterDelay=" + this.videoJitterDelay + ", videoJitterTarget=" + this.videoJitterTarget + ", relativeReceptionDelay=" + this.relativeReceptionDelay + ", relativePlayoutDelay=" + this.relativePlayoutDelay + ')';
    }
}
