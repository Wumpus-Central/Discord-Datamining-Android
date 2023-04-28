package com.discord.media_player.reactevents;

import bj.C2560n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p450yi.AbstractC14370f;

@AbstractC14370f
@Metadata(m15074d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m15073d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPause;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "id", "", "paused", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DZ)V", "getId", "()D", "getPaused", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class MediaPlayerPause implements ReactEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id */
    private final double f8966id;
    private final boolean paused;

    @Metadata(m15074d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m15073d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPause$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerPause;", "media_player_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaPlayerPause> serializer() {
            return MediaPlayerPause$$serializer.INSTANCE;
        }
    }

    public MediaPlayerPause(double d, boolean z) {
        this.f8966id = d;
        this.paused = z;
    }

    public static /* synthetic */ MediaPlayerPause copy$default(MediaPlayerPause mediaPlayerPause, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mediaPlayerPause.f8966id;
        }
        if ((i & 2) != 0) {
            z = mediaPlayerPause.paused;
        }
        return mediaPlayerPause.copy(d, z);
    }

    public static final void write$Self(MediaPlayerPause self, CompositeEncoder output, SerialDescriptor serialDesc) {
        C9677q.m14633g(self, "self");
        C9677q.m14633g(output, "output");
        C9677q.m14633g(serialDesc, "serialDesc");
        output.mo13890D(serialDesc, 0, self.f8966id);
        output.mo13865y(serialDesc, 1, self.paused);
    }

    public final double component1() {
        return this.f8966id;
    }

    public final boolean component2() {
        return this.paused;
    }

    public final MediaPlayerPause copy(double d, boolean z) {
        return new MediaPlayerPause(d, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlayerPause)) {
            return false;
        }
        MediaPlayerPause mediaPlayerPause = (MediaPlayerPause) obj;
        return Double.compare(this.f8966id, mediaPlayerPause.f8966id) == 0 && this.paused == mediaPlayerPause.paused;
    }

    public final double getId() {
        return this.f8966id;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.f8966id) * 31;
        boolean z = this.paused;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return doubleToLongBits + i;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        double d = this.f8966id;
        boolean z = this.paused;
        return "MediaPlayerPause(id=" + d + ", paused=" + z + ")";
    }

    public /* synthetic */ MediaPlayerPause(int i, double d, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            C2560n1.m33818b(i, 3, MediaPlayerPause$$serializer.INSTANCE.getDescriptor());
        }
        this.f8966id = d;
        this.paused = z;
    }
}
