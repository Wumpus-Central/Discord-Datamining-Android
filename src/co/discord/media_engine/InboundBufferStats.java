package co.discord.media_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, m15073d2 = {"Lco/discord/media_engine/InboundBufferStats;", "", "audioJitterBuffer", "Lco/discord/media_engine/PlayoutMetric;", "audioJitterTarget", "audioJitterDelay", "relativeReceptionDelay", "relativePlayoutDelay", "(Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;Lco/discord/media_engine/PlayoutMetric;)V", "getAudioJitterBuffer", "()Lco/discord/media_engine/PlayoutMetric;", "getAudioJitterDelay", "getAudioJitterTarget", "getRelativePlayoutDelay", "getRelativeReceptionDelay", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class InboundBufferStats {
    private final PlayoutMetric audioJitterBuffer;
    private final PlayoutMetric audioJitterDelay;
    private final PlayoutMetric audioJitterTarget;
    private final PlayoutMetric relativePlayoutDelay;
    private final PlayoutMetric relativeReceptionDelay;

    public InboundBufferStats(PlayoutMetric playoutMetric, PlayoutMetric playoutMetric2, PlayoutMetric playoutMetric3, PlayoutMetric playoutMetric4, PlayoutMetric playoutMetric5) {
        this.audioJitterBuffer = playoutMetric;
        this.audioJitterTarget = playoutMetric2;
        this.audioJitterDelay = playoutMetric3;
        this.relativeReceptionDelay = playoutMetric4;
        this.relativePlayoutDelay = playoutMetric5;
    }

    public static /* synthetic */ InboundBufferStats copy$default(InboundBufferStats inboundBufferStats, PlayoutMetric playoutMetric, PlayoutMetric playoutMetric2, PlayoutMetric playoutMetric3, PlayoutMetric playoutMetric4, PlayoutMetric playoutMetric5, int i, Object obj) {
        if ((i & 1) != 0) {
            playoutMetric = inboundBufferStats.audioJitterBuffer;
        }
        if ((i & 2) != 0) {
            playoutMetric2 = inboundBufferStats.audioJitterTarget;
        }
        if ((i & 4) != 0) {
            playoutMetric3 = inboundBufferStats.audioJitterDelay;
        }
        if ((i & 8) != 0) {
            playoutMetric4 = inboundBufferStats.relativeReceptionDelay;
        }
        if ((i & 16) != 0) {
            playoutMetric5 = inboundBufferStats.relativePlayoutDelay;
        }
        return inboundBufferStats.copy(playoutMetric, playoutMetric2, playoutMetric3, playoutMetric4, playoutMetric5);
    }

    public final PlayoutMetric component1() {
        return this.audioJitterBuffer;
    }

    public final PlayoutMetric component2() {
        return this.audioJitterTarget;
    }

    public final PlayoutMetric component3() {
        return this.audioJitterDelay;
    }

    public final PlayoutMetric component4() {
        return this.relativeReceptionDelay;
    }

    public final PlayoutMetric component5() {
        return this.relativePlayoutDelay;
    }

    public final InboundBufferStats copy(PlayoutMetric playoutMetric, PlayoutMetric playoutMetric2, PlayoutMetric playoutMetric3, PlayoutMetric playoutMetric4, PlayoutMetric playoutMetric5) {
        return new InboundBufferStats(playoutMetric, playoutMetric2, playoutMetric3, playoutMetric4, playoutMetric5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundBufferStats)) {
            return false;
        }
        InboundBufferStats inboundBufferStats = (InboundBufferStats) obj;
        return C9971q.m14638b(this.audioJitterBuffer, inboundBufferStats.audioJitterBuffer) && C9971q.m14638b(this.audioJitterTarget, inboundBufferStats.audioJitterTarget) && C9971q.m14638b(this.audioJitterDelay, inboundBufferStats.audioJitterDelay) && C9971q.m14638b(this.relativeReceptionDelay, inboundBufferStats.relativeReceptionDelay) && C9971q.m14638b(this.relativePlayoutDelay, inboundBufferStats.relativePlayoutDelay);
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

    public final PlayoutMetric getRelativePlayoutDelay() {
        return this.relativePlayoutDelay;
    }

    public final PlayoutMetric getRelativeReceptionDelay() {
        return this.relativeReceptionDelay;
    }

    public int hashCode() {
        PlayoutMetric playoutMetric = this.audioJitterBuffer;
        int i = 0;
        int hashCode = (playoutMetric == null ? 0 : playoutMetric.hashCode()) * 31;
        PlayoutMetric playoutMetric2 = this.audioJitterTarget;
        int hashCode2 = (hashCode + (playoutMetric2 == null ? 0 : playoutMetric2.hashCode())) * 31;
        PlayoutMetric playoutMetric3 = this.audioJitterDelay;
        int hashCode3 = (hashCode2 + (playoutMetric3 == null ? 0 : playoutMetric3.hashCode())) * 31;
        PlayoutMetric playoutMetric4 = this.relativeReceptionDelay;
        int hashCode4 = (hashCode3 + (playoutMetric4 == null ? 0 : playoutMetric4.hashCode())) * 31;
        PlayoutMetric playoutMetric5 = this.relativePlayoutDelay;
        if (playoutMetric5 != null) {
            i = playoutMetric5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "InboundBufferStats(audioJitterBuffer=" + this.audioJitterBuffer + ", audioJitterTarget=" + this.audioJitterTarget + ", audioJitterDelay=" + this.audioJitterDelay + ", relativeReceptionDelay=" + this.relativeReceptionDelay + ", relativePlayoutDelay=" + this.relativePlayoutDelay + ')';
    }
}
