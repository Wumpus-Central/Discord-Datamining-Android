package com.discord.media_player.reactevents;

import bj.n1;
import com.discord.reactevents.ReactEvent;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import yi.f;

@f
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÇ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006!"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerMuteStateChanged;", "Lcom/discord/reactevents/ReactEvent;", "seen1", "", "id", "", "isMuted", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DZ)V", "getId", "()D", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaPlayerMuteStateChanged implements ReactEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: id  reason: collision with root package name */
    private final double f7479id;
    private final boolean isMuted;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/media_player/reactevents/MediaPlayerMuteStateChanged$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/media_player/reactevents/MediaPlayerMuteStateChanged;", "media_player_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaPlayerMuteStateChanged> serializer() {
            return MediaPlayerMuteStateChanged$$serializer.INSTANCE;
        }
    }

    public MediaPlayerMuteStateChanged(double d10, boolean z10) {
        this.f7479id = d10;
        this.isMuted = z10;
    }

    public static /* synthetic */ MediaPlayerMuteStateChanged copy$default(MediaPlayerMuteStateChanged mediaPlayerMuteStateChanged, double d10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = mediaPlayerMuteStateChanged.f7479id;
        }
        if ((i10 & 2) != 0) {
            z10 = mediaPlayerMuteStateChanged.isMuted;
        }
        return mediaPlayerMuteStateChanged.copy(d10, z10);
    }

    public static final void write$Self(MediaPlayerMuteStateChanged self, CompositeEncoder output, SerialDescriptor serialDesc) {
        q.g(self, "self");
        q.g(output, "output");
        q.g(serialDesc, "serialDesc");
        output.D(serialDesc, 0, self.f7479id);
        output.y(serialDesc, 1, self.isMuted);
    }

    public final double component1() {
        return this.f7479id;
    }

    public final boolean component2() {
        return this.isMuted;
    }

    public final MediaPlayerMuteStateChanged copy(double d10, boolean z10) {
        return new MediaPlayerMuteStateChanged(d10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlayerMuteStateChanged)) {
            return false;
        }
        MediaPlayerMuteStateChanged mediaPlayerMuteStateChanged = (MediaPlayerMuteStateChanged) obj;
        return Double.compare(this.f7479id, mediaPlayerMuteStateChanged.f7479id) == 0 && this.isMuted == mediaPlayerMuteStateChanged.isMuted;
    }

    public final double getId() {
        return this.f7479id;
    }

    public int hashCode() {
        int doubleToLongBits = Double.doubleToLongBits(this.f7479id) * 31;
        boolean z10 = this.isMuted;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        return doubleToLongBits + i10;
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        return ReactEvent.DefaultImpls.serialize(this);
    }

    public String toString() {
        double d10 = this.f7479id;
        boolean z10 = this.isMuted;
        return "MediaPlayerMuteStateChanged(id=" + d10 + ", isMuted=" + z10 + ")";
    }

    public /* synthetic */ MediaPlayerMuteStateChanged(int i10, double d10, boolean z10, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i10 & 3)) {
            n1.b(i10, 3, MediaPlayerMuteStateChanged$$serializer.INSTANCE.getDescriptor());
        }
        this.f7479id = d10;
        this.isMuted = z10;
    }
}
