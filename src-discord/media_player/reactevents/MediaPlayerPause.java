package com.discord.media_player.reactevents;

import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import qi.f;
import ti.n1;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002 !B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPause;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "id", "", "paused", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DZ)V", "getId", "()D", "getPaused", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaPlayerPause implements ReactEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id  reason: collision with root package name */
    private final double f7578id;
    private final boolean paused;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerPause$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerPause;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
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

    public MediaPlayerPause(double d10, boolean z10) {
        this.f7578id = d10;
        this.paused = z10;
    }

    public static /* synthetic */ MediaPlayerPause copy$default(MediaPlayerPause mediaPlayerPause, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = mediaPlayerPause.f7578id;
        }
        if ((i10 & 2) != 0) {
            z10 = mediaPlayerPause.paused;
        }
        return mediaPlayerPause.copy(d10, z10);
    }

    public static final void write$Self(MediaPlayerPause self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.A(serialDesc, 0, self.f7578id);
        output.s(serialDesc, 1, self.paused);
    }

    public final double component1() {
        return this.f7578id;
    }

    public final boolean component2() {
        return this.paused;
    }

    public final MediaPlayerPause copy(double d10, boolean z10) {
        return new MediaPlayerPause(d10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlayerPause)) {
            return false;
        }
        MediaPlayerPause mediaPlayerPause = (MediaPlayerPause) obj;
        return Double.compare(this.f7578id, mediaPlayerPause.f7578id) == 0 && this.paused == mediaPlayerPause.paused;
    }

    public final double getId() {
        return this.f7578id;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.f7578id) * 31;
        boolean z10 = this.paused;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return doubleToLongBits + i10;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        double d10 = this.f7578id;
        boolean z10 = this.paused;
        return "MediaPlayerPause(id=" + d10 + ", paused=" + z10 + ")";
    }

    public /* synthetic */ MediaPlayerPause(int i10, double d10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, MediaPlayerPause$$serializer.INSTANCE.getDescriptor());
        }
        this.f7578id = d10;
        this.paused = z10;
    }
}
