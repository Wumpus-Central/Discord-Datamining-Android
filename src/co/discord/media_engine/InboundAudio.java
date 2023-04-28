package co.discord.media_engine;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jd\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001e¨\u00060"}, m15073d2 = {"Lco/discord/media_engine/InboundAudio;", "", "packetsReceived", "", "packetsLost", "mos", "", "mosSum", "mosCount", "", "mosBuckets", "", "bufferStats", "Lco/discord/media_engine/InboundBufferStats;", "frameOpStats", "Lco/discord/media_engine/InboundFrameOpStats;", "(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)V", "getBufferStats", "()Lco/discord/media_engine/InboundBufferStats;", "getFrameOpStats", "()Lco/discord/media_engine/InboundFrameOpStats;", "getMos", "()D", "getMosBuckets", "()[Ljava/lang/Integer;", "[Ljava/lang/Integer;", "getMosCount", "()I", "getMosSum", "getPacketsLost", "()J", "getPacketsReceived", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(JJDDI[Ljava/lang/Integer;Lco/discord/media_engine/InboundBufferStats;Lco/discord/media_engine/InboundFrameOpStats;)Lco/discord/media_engine/InboundAudio;", "equals", "", "other", "hashCode", "toString", "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class InboundAudio {
    private final InboundBufferStats bufferStats;
    private final InboundFrameOpStats frameOpStats;
    private final double mos;
    private final Integer[] mosBuckets;
    private final int mosCount;
    private final double mosSum;
    private final long packetsLost;
    private final long packetsReceived;

    public InboundAudio(long j, long j2, double d, double d2, int i, Integer[] mosBuckets, InboundBufferStats bufferStats, InboundFrameOpStats frameOpStats) {
        C9971q.m14633g(mosBuckets, "mosBuckets");
        C9971q.m14633g(bufferStats, "bufferStats");
        C9971q.m14633g(frameOpStats, "frameOpStats");
        this.packetsReceived = j;
        this.packetsLost = j2;
        this.mos = d;
        this.mosSum = d2;
        this.mosCount = i;
        this.mosBuckets = mosBuckets;
        this.bufferStats = bufferStats;
        this.frameOpStats = frameOpStats;
    }

    public final long component1() {
        return this.packetsReceived;
    }

    public final long component2() {
        return this.packetsLost;
    }

    public final double component3() {
        return this.mos;
    }

    public final double component4() {
        return this.mosSum;
    }

    public final int component5() {
        return this.mosCount;
    }

    public final Integer[] component6() {
        return this.mosBuckets;
    }

    public final InboundBufferStats component7() {
        return this.bufferStats;
    }

    public final InboundFrameOpStats component8() {
        return this.frameOpStats;
    }

    public final InboundAudio copy(long j, long j2, double d, double d2, int i, Integer[] mosBuckets, InboundBufferStats bufferStats, InboundFrameOpStats frameOpStats) {
        C9971q.m14633g(mosBuckets, "mosBuckets");
        C9971q.m14633g(bufferStats, "bufferStats");
        C9971q.m14633g(frameOpStats, "frameOpStats");
        return new InboundAudio(j, j2, d, d2, i, mosBuckets, bufferStats, frameOpStats);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundAudio)) {
            return false;
        }
        InboundAudio inboundAudio = (InboundAudio) obj;
        return this.packetsReceived == inboundAudio.packetsReceived && this.packetsLost == inboundAudio.packetsLost && Double.compare(this.mos, inboundAudio.mos) == 0 && Double.compare(this.mosSum, inboundAudio.mosSum) == 0 && this.mosCount == inboundAudio.mosCount && C9971q.m14638b(this.mosBuckets, inboundAudio.mosBuckets) && C9971q.m14638b(this.bufferStats, inboundAudio.bufferStats) && C9971q.m14638b(this.frameOpStats, inboundAudio.frameOpStats);
    }

    public final InboundBufferStats getBufferStats() {
        return this.bufferStats;
    }

    public final InboundFrameOpStats getFrameOpStats() {
        return this.frameOpStats;
    }

    public final double getMos() {
        return this.mos;
    }

    public final Integer[] getMosBuckets() {
        return this.mosBuckets;
    }

    public final int getMosCount() {
        return this.mosCount;
    }

    public final double getMosSum() {
        return this.mosSum;
    }

    public final long getPacketsLost() {
        return this.packetsLost;
    }

    public final long getPacketsReceived() {
        return this.packetsReceived;
    }

    public int hashCode() {
        return (((((((((((((C4081a.m32873a(this.packetsReceived) * 31) + C4081a.m32873a(this.packetsLost)) * 31) + Double.doubleToLongBits(this.mos)) * 31) + Double.doubleToLongBits(this.mosSum)) * 31) + this.mosCount) * 31) + Arrays.hashCode(this.mosBuckets)) * 31) + this.bufferStats.hashCode()) * 31) + this.frameOpStats.hashCode();
    }

    public String toString() {
        return "InboundAudio(packetsReceived=" + this.packetsReceived + ", packetsLost=" + this.packetsLost + ", mos=" + this.mos + ", mosSum=" + this.mosSum + ", mosCount=" + this.mosCount + ", mosBuckets=" + Arrays.toString(this.mosBuckets) + ", bufferStats=" + this.bufferStats + ", frameOpStats=" + this.frameOpStats + ')';
    }
}
