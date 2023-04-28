package co.discord.media_engine.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import org.webrtc.MediaStreamTrack;

@Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m15073d2 = {"Lco/discord/media_engine/internal/Inbound;", "", "id", "", MediaStreamTrack.AUDIO_TRACK_KIND, "Lco/discord/media_engine/internal/InboundAudio;", MediaStreamTrack.VIDEO_TRACK_KIND, "Lco/discord/media_engine/internal/InboundVideo;", "playout", "Lco/discord/media_engine/internal/InboundPlayout;", "(Ljava/lang/String;Lco/discord/media_engine/internal/InboundAudio;Lco/discord/media_engine/internal/InboundVideo;Lco/discord/media_engine/internal/InboundPlayout;)V", "getAudio", "()Lco/discord/media_engine/internal/InboundAudio;", "getId", "()Ljava/lang/String;", "getPlayout", "()Lco/discord/media_engine/internal/InboundPlayout;", "getVideo", "()Lco/discord/media_engine/internal/InboundVideo;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class Inbound {
    private final InboundAudio audio;

    /* renamed from: id */
    private final String f6710id;
    private final InboundPlayout playout;
    private final InboundVideo video;

    public Inbound(String id2, InboundAudio audio, InboundVideo inboundVideo, InboundPlayout inboundPlayout) {
        C9971q.m14633g(id2, "id");
        C9971q.m14633g(audio, "audio");
        this.f6710id = id2;
        this.audio = audio;
        this.video = inboundVideo;
        this.playout = inboundPlayout;
    }

    public static /* synthetic */ Inbound copy$default(Inbound inbound, String str, InboundAudio inboundAudio, InboundVideo inboundVideo, InboundPlayout inboundPlayout, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inbound.f6710id;
        }
        if ((i & 2) != 0) {
            inboundAudio = inbound.audio;
        }
        if ((i & 4) != 0) {
            inboundVideo = inbound.video;
        }
        if ((i & 8) != 0) {
            inboundPlayout = inbound.playout;
        }
        return inbound.copy(str, inboundAudio, inboundVideo, inboundPlayout);
    }

    public final String component1() {
        return this.f6710id;
    }

    public final InboundAudio component2() {
        return this.audio;
    }

    public final InboundVideo component3() {
        return this.video;
    }

    public final InboundPlayout component4() {
        return this.playout;
    }

    public final Inbound copy(String id2, InboundAudio audio, InboundVideo inboundVideo, InboundPlayout inboundPlayout) {
        C9971q.m14633g(id2, "id");
        C9971q.m14633g(audio, "audio");
        return new Inbound(id2, audio, inboundVideo, inboundPlayout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Inbound)) {
            return false;
        }
        Inbound inbound = (Inbound) obj;
        return C9971q.m14638b(this.f6710id, inbound.f6710id) && C9971q.m14638b(this.audio, inbound.audio) && C9971q.m14638b(this.video, inbound.video) && C9971q.m14638b(this.playout, inbound.playout);
    }

    public final InboundAudio getAudio() {
        return this.audio;
    }

    public final String getId() {
        return this.f6710id;
    }

    public final InboundPlayout getPlayout() {
        return this.playout;
    }

    public final InboundVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode = ((this.f6710id.hashCode() * 31) + this.audio.hashCode()) * 31;
        InboundVideo inboundVideo = this.video;
        int i = 0;
        int hashCode2 = (hashCode + (inboundVideo == null ? 0 : inboundVideo.hashCode())) * 31;
        InboundPlayout inboundPlayout = this.playout;
        if (inboundPlayout != null) {
            i = inboundPlayout.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Inbound(id=" + this.f6710id + ", audio=" + this.audio + ", video=" + this.video + ", playout=" + this.playout + ')';
    }
}
