package co.discord.media_engine;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f\u0012\"\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\f¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J%\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J%\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\fHÆ\u0003Jy\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f2$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001R-\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, m15073d2 = {"Lco/discord/media_engine/Stats;", "", "transport", "Lco/discord/media_engine/Transport;", "outboundRtpAudio", "Lco/discord/media_engine/OutboundRtpAudio;", "outboundRtpVideo", "Lco/discord/media_engine/OutboundRtpVideo;", "inboundRtpAudio", "Ljava/util/HashMap;", "", "Lco/discord/media_engine/InboundRtpAudio;", "Lkotlin/collections/HashMap;", "inboundRtpVideo", "Lco/discord/media_engine/InboundRtpVideo;", "(Lco/discord/media_engine/Transport;Lco/discord/media_engine/OutboundRtpAudio;Lco/discord/media_engine/OutboundRtpVideo;Ljava/util/HashMap;Ljava/util/HashMap;)V", "getInboundRtpAudio", "()Ljava/util/HashMap;", "getInboundRtpVideo", "getOutboundRtpAudio", "()Lco/discord/media_engine/OutboundRtpAudio;", "getOutboundRtpVideo", "()Lco/discord/media_engine/OutboundRtpVideo;", "getTransport", "()Lco/discord/media_engine/Transport;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Stats {
    private final HashMap<String, InboundRtpAudio> inboundRtpAudio;
    private final HashMap<String, InboundRtpVideo> inboundRtpVideo;
    private final OutboundRtpAudio outboundRtpAudio;
    private final OutboundRtpVideo outboundRtpVideo;
    private final Transport transport;

    public Stats(Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap<String, InboundRtpAudio> inboundRtpAudio, HashMap<String, InboundRtpVideo> inboundRtpVideo) {
        C9971q.m14633g(inboundRtpAudio, "inboundRtpAudio");
        C9971q.m14633g(inboundRtpVideo, "inboundRtpVideo");
        this.transport = transport;
        this.outboundRtpAudio = outboundRtpAudio;
        this.outboundRtpVideo = outboundRtpVideo;
        this.inboundRtpAudio = inboundRtpAudio;
        this.inboundRtpVideo = inboundRtpVideo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Stats copy$default(Stats stats, Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap hashMap, HashMap hashMap2, int i, Object obj) {
        if ((i & 1) != 0) {
            transport = stats.transport;
        }
        if ((i & 2) != 0) {
            outboundRtpAudio = stats.outboundRtpAudio;
        }
        if ((i & 4) != 0) {
            outboundRtpVideo = stats.outboundRtpVideo;
        }
        if ((i & 8) != 0) {
            hashMap = stats.inboundRtpAudio;
        }
        if ((i & 16) != 0) {
            hashMap2 = stats.inboundRtpVideo;
        }
        return stats.copy(transport, outboundRtpAudio, outboundRtpVideo, hashMap, hashMap2);
    }

    public final Transport component1() {
        return this.transport;
    }

    public final OutboundRtpAudio component2() {
        return this.outboundRtpAudio;
    }

    public final OutboundRtpVideo component3() {
        return this.outboundRtpVideo;
    }

    public final HashMap<String, InboundRtpAudio> component4() {
        return this.inboundRtpAudio;
    }

    public final HashMap<String, InboundRtpVideo> component5() {
        return this.inboundRtpVideo;
    }

    public final Stats copy(Transport transport, OutboundRtpAudio outboundRtpAudio, OutboundRtpVideo outboundRtpVideo, HashMap<String, InboundRtpAudio> inboundRtpAudio, HashMap<String, InboundRtpVideo> inboundRtpVideo) {
        C9971q.m14633g(inboundRtpAudio, "inboundRtpAudio");
        C9971q.m14633g(inboundRtpVideo, "inboundRtpVideo");
        return new Stats(transport, outboundRtpAudio, outboundRtpVideo, inboundRtpAudio, inboundRtpVideo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stats)) {
            return false;
        }
        Stats stats = (Stats) obj;
        return C9971q.m14638b(this.transport, stats.transport) && C9971q.m14638b(this.outboundRtpAudio, stats.outboundRtpAudio) && C9971q.m14638b(this.outboundRtpVideo, stats.outboundRtpVideo) && C9971q.m14638b(this.inboundRtpAudio, stats.inboundRtpAudio) && C9971q.m14638b(this.inboundRtpVideo, stats.inboundRtpVideo);
    }

    public final HashMap<String, InboundRtpAudio> getInboundRtpAudio() {
        return this.inboundRtpAudio;
    }

    public final HashMap<String, InboundRtpVideo> getInboundRtpVideo() {
        return this.inboundRtpVideo;
    }

    public final OutboundRtpAudio getOutboundRtpAudio() {
        return this.outboundRtpAudio;
    }

    public final OutboundRtpVideo getOutboundRtpVideo() {
        return this.outboundRtpVideo;
    }

    public final Transport getTransport() {
        return this.transport;
    }

    public int hashCode() {
        Transport transport = this.transport;
        int i = 0;
        int hashCode = (transport == null ? 0 : transport.hashCode()) * 31;
        OutboundRtpAudio outboundRtpAudio = this.outboundRtpAudio;
        int hashCode2 = (hashCode + (outboundRtpAudio == null ? 0 : outboundRtpAudio.hashCode())) * 31;
        OutboundRtpVideo outboundRtpVideo = this.outboundRtpVideo;
        if (outboundRtpVideo != null) {
            i = outboundRtpVideo.hashCode();
        }
        return ((((hashCode2 + i) * 31) + this.inboundRtpAudio.hashCode()) * 31) + this.inboundRtpVideo.hashCode();
    }

    public String toString() {
        return "Stats(transport=" + this.transport + ", outboundRtpAudio=" + this.outboundRtpAudio + ", outboundRtpVideo=" + this.outboundRtpVideo + ", inboundRtpAudio=" + this.inboundRtpAudio + ", inboundRtpVideo=" + this.inboundRtpVideo + ')';
    }
}
